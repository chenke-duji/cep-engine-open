/**
 * Problem/Resolution pairing hook.
 *
 * Matches incoming Resolution events (eventType=2) with existing Problem events
 * (eventType=1) in the domain's active event store. When a match is found, the
 * Java chain resolves (closes) the Problem and persists both events.
 *
 * Pairing rule:
 *   - Only eventType == "2" (Resolution) participates. Other values (including
 *     13 and any future values) are NOT treated as resolutions.
 *   - The pairing key is built from: domainId / agentType / node / alertGroup /
 *     alertKey. Empty segments are skipped; a blank agentType defaults to
 *     "generic". Events with different agentType never pair (different interfaces).
 *   - A Problem is found by looking up the active store using
 *     pairKey + "|" + PROBLEM.code (the full Problem identifier).
 *
 * Returns: HookResult
 *   - pass() if not a resolution event or no match
 *   - MATCH with pairKey = the matched Problem's full identifier
 */

import com.dujitech.cep.model.HookResult
import com.dujitech.cep.model.HookContext
import com.dujitech.cep.model.EventType
import com.dujitech.cep.groovy.EventHook

class ProblemResolutionHook implements EventHook {

    String hookName() { "problem_resolution" }

    HookResult execute(HookContext ctx) {
        def event = ctx.getCurrentEvent()
        if (event == null) return HookResult.pass()

        // Only process Resolution events. Resolution code is exactly "2".
        if (event.getEventType() == null || !EventType.RESOLUTION.code.equals(event.getEventType())) {
            return HookResult.pass()
        }

        // Build the pairing key from the shared recovery fields.
        // Empty segments are skipped; blank agentType defaults to "generic".
        def agentType = (event.getAgentType() == null || event.getAgentType().trim().isEmpty())
                ? "generic" : event.getAgentType().trim()
        def segments = [event.getDomainId(), agentType, event.getNode(),
                        event.getAlertGroup(), event.getAlertKey()]
        def pairKey = segments.findAll { it != null && !it.toString().trim().isEmpty() }
                .collect { it.toString().trim() }.join("|")
        if (pairKey.isEmpty()) {
            return HookResult.pass()
        }

        // The Problem's full identifier is pairKey + "|" + PROBLEM.code
        def problemIdentifier = pairKey + "|" + EventType.PROBLEM.code

        // Check if the Problem event exists in the active store
        def activeProblem = ctx.getActiveEvent(problemIdentifier)
        if (activeProblem != null) {
            def result = new HookResult(com.dujitech.cep.model.ResultAction.MATCH)
            // pairKey carries the matched Problem's full identifier so the Java
            // chain can atomically resolve it.
            result.setPairKey(problemIdentifier)

            ctx.getScriptVariables()?.put("resolvedProblem", activeProblem.getIdentifier())
            ctx.getScriptVariables()?.put("resolutionTime", System.currentTimeMillis())
            return result
        }

        // No matching problem found - this is a stray resolution.
        // It is still persisted (per requirement) but does not close any problem.
        ctx.getScriptVariables()?.put("strayResolution", true)
        return HookResult.pass()
    }
}

return new ProblemResolutionHook()
