package com.raysdata.cep.engine;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.raysdata.cep.groovy.EventHook;
import com.raysdata.cep.groovy.ScriptRegistry;
import com.raysdata.cep.model.AlarmEvent;
import com.raysdata.cep.model.HookContext;
import com.raysdata.cep.model.HookResult;
import com.raysdata.cep.model.RawEvent;
import com.raysdata.cep.model.ResultAction;
import com.raysdata.cep.store.MongoBatchWriter;

import com.google.gson.Gson;

/**
 * Core event processing chain.
 * <p>
 * Orchestrates the full lifecycle of a single event:
 * <ol>
 *   <li>Groovy parsing script: raw JSON -> AlarmEvent</li>
 *   <li>severity_grade hook: determine final severity (Groovy)</li>
 *   <li>maintain_check hook: check maintenance windows (Groovy)</li>
 *   <li>flash_detect hook: flash detection (Groovy)</li>
 *   <li>problem_resolution hook: Problem/Resolution pairing (Groovy)</li>
 *   <li>Dedup: tally count and severity upgrade (Java)</li>
 *   <li>Queue for batch upsert to MongoDB</li>
 * </ol>
 * <p>
 * Each Groovy hook is optional. If a hook script is not configured,
 * the chain skips it and continues.
 */
@Component
public class EventProcessingChain {

    private static final Logger log = LoggerFactory.getLogger(EventProcessingChain.class);
    private static final Gson gson = new Gson();

    private final ScriptRegistry scriptRegistry;
    private final DomainProcessorRouter domainRouter;
    private final MongoBatchWriter mongoBatchWriter;

    public EventProcessingChain(ScriptRegistry scriptRegistry, DomainProcessorRouter domainRouter,
                                MongoBatchWriter mongoBatchWriter) {
        this.scriptRegistry = scriptRegistry;
        this.domainRouter = domainRouter;
        this.mongoBatchWriter = mongoBatchWriter;
    }

    /**
     * Process a raw event from ingestion (REST API or Kafka).
     *
     * @param rawEvent the raw event payload from collectors
     */
    public void process(RawEvent rawEvent) {
        try {
            // Step 0: Match and execute Groovy parsing script
            String rawJson = gson.toJson(rawEvent);
            AlarmEvent event = parseRawEvent(rawEvent, rawJson);
            if (event == null) {
                // Unsupported / unparseable event: keep the raw payload for later
                // inspection instead of silently dropping it.
                try {
                    mongoBatchWriter.insertUnresolved(rawEvent, rawJson, "no matching script or parse returned null");
                } catch (Exception e) {
                    log.error("Failed to persist unresolved event", e);
                }
                return;
            }

            // Ensure required fields
            if (event.getDomainId() == null) {
                event.setDomainId("default");
            }
            if (event.getFirstOccurrence() == 0) {
                event.setFirstOccurrence(System.currentTimeMillis());
            }
            event.setLastOccurrence(System.currentTimeMillis());
            event.setReceiveTime(System.currentTimeMillis());
            // Default status: every freshly parsed event starts un-acknowledged.
            if (event.getStatus() == null || event.getStatus().isBlank()) {
                event.setStatus("UnAcked");
            }

            // Route to domain processor
            DomainProcessor dp = domainRouter.getOrCreate(event.getDomainId());

            // Step 1: severity_grade hook
            HookResult gradeResult = invokeHook("severity_grade", event, dp);
            if (gradeResult.getAction() == ResultAction.MODIFY && gradeResult.getModifiedEvent() != null) {
                event = gradeResult.getModifiedEvent();
            }

            // Step 2: maintain_check hook
            HookResult maintainResult = invokeHook("maintain_check", event, dp);
            if (maintainResult.getAction() == ResultAction.SUPPRESS) {
                event.setSuppressLevel(maintainResult.getSuppressLevel());
                dp.addPendingUpsert(event);
                log.debug("Event suppressed by maintenance: {}", event.getIdentifier());
                return;
            }

            // Step 3: flash_detect hook
            if (dp.isFlashSuppressed(event.getIdentifier())) {
                event.setSuppressLevel("FLASH");
                dp.addPendingUpsert(event);
                log.debug("Event flash-suppressed: {}", event.getIdentifier());
                return;
            }

            long flashCount = dp.getFlashCount(event.getIdentifier());
            HookContext flashCtx = buildContext(event, dp);
            flashCtx.setFlashCount(flashCount);
            HookResult flashResult = invokeHookWithContext("flash_detect", flashCtx);
            if (flashResult.getAction() == ResultAction.SUPPRESS) {
                event.setSuppressLevel("FLASH");
                dp.startFlashSuppression(event.getIdentifier(), 300000);
                dp.addPendingUpsert(event);
                log.debug("Event flash-detected: {}", event.getIdentifier());
                return;
            }
            dp.incrementFlash(event.getIdentifier());

            // Step 4: problem_resolution hook
            // The hook returns the Problem's full identifier (pairKey + "|" + PROBLEM.code)
            // when a matching Problem is found. resolveProblem atomically resolves it,
            // persists the cleared Problem and the Resolution event to events_current.
            HookResult prResult = invokeHook("problem_resolution", event, dp);
            if (prResult.getAction() == ResultAction.MATCH && prResult.getPairKey() != null) {
                dp.resolveProblem(prResult.getPairKey(), event);
                log.debug("Problem resolved: {}", prResult.getPairKey());
                return;
            }

            // Step 5: before_dedup hook (normalize identifiers before dedup)
            HookResult dedupResult = invokeHook("before_dedup", event, dp);
            if (dedupResult.getAction() == ResultAction.MODIFY && dedupResult.getModifiedEvent() != null) {
                event = dedupResult.getModifiedEvent();
            }

            // Step 6: Dedup (Java state)
            if (!dp.tryDedup(event)) {
                // Merged into existing event, already queued for upsert
                return;
            }

            // Step 7: Queue for batch upsert
            dp.addPendingUpsert(event);

        } catch (Exception e) {
            log.error("Error processing event: {}", rawEvent, e);
        }
    }

    /**
     * Parse raw event into AlarmEvent using the matched Groovy script.
     */
    @SuppressWarnings("unchecked")
    private AlarmEvent parseRawEvent(RawEvent rawEvent, String rawJson) {
        var matchedScript = scriptRegistry.matchScript(rawJson);
        if (matchedScript == null) {
            log.warn("No matching script for event from source: {}", rawEvent.getSource());
            return null;
        }

        try {
            Map<String, Object> variables = new java.util.HashMap<>();
            variables.put("rawEvent", rawEvent);
            variables.put("rawJson", rawJson);
            variables.put("gson", gson);

            Object result = scriptRegistry.executeParseScript(matchedScript.getPath(), variables);
            if (result instanceof AlarmEvent) {
                AlarmEvent event = (AlarmEvent) result;
                event.setScript(matchedScript.getPath());
                return event;
            } else if (result instanceof Map) {
                return gson.fromJson(gson.toJson(result), AlarmEvent.class);
            }
        } catch (Exception e) {
            log.error("Script execution failed: {}", matchedScript.getPath(), e);
        }
        return null;
    }

    /**
     * Invoke a hook by name with the current event.
     */
    private HookResult invokeHook(String hookName, AlarmEvent event, DomainProcessor dp) {
        EventHook hook = scriptRegistry.getHook(hookName);
        if (hook == null) return HookResult.pass();

        HookContext ctx = buildContext(event, dp);
        return invokeHookWithContext(hookName, ctx);
    }

    /**
     * Invoke a hook with a pre-built context.
     */
    private HookResult invokeHookWithContext(String hookName, HookContext ctx) {
        EventHook hook = scriptRegistry.getHook(hookName);
        if (hook == null) return HookResult.pass();

        try {
            HookResult result = hook.execute(ctx);
            return result != null ? result : HookResult.pass();
        } catch (Exception e) {
            log.warn("Hook {} failed: {}", hookName, e.getMessage());
            return HookResult.pass();
        }
    }

    /**
     * Build a HookContext for the current event and domain processor.
     */
    private HookContext buildContext(AlarmEvent event, DomainProcessor dp) {
        HookContext ctx = new HookContext(event, dp.getDomainId());
        ctx.setDomainProcessor(dp);
        ctx.setMaintainRules(dp.getMaintainRules());
        ctx.setScriptVariables(dp.getScriptVariables());
        return ctx;
    }
}
