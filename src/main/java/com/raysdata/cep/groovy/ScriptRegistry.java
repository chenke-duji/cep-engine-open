package com.raysdata.cep.groovy;

import groovy.lang.Binding;
import groovy.lang.GroovyClassLoader;
import groovy.lang.Script;

import java.io.File;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.raysdata.cep.model.GroovyScript;
import com.raysdata.cep.model.ScriptMatchRule;

/**
 * Central registry for Groovy scripts and hooks.
 * <p>
 * Maintains an immutable snapshot of all compiled scripts that can be
 * atomically swapped via {@link #reload(File)}. This enables zero-downtime
 * hot reloading: in-flight events continue using the old snapshot, new
 * events use the new one.
 * <p>
 * Two types of scripts are managed:
 * <ul>
 *   <li><b>Parsing scripts</b> - transform raw event JSON into AlarmEvent</li>
 *   <li><b>Hook scripts</b> - implement {@link EventHook} for processing chain logic</li>
 * </ul>
 */
@Component
public class ScriptRegistry {

    private static final Logger log = LoggerFactory.getLogger(ScriptRegistry.class);

    private final GroovyClassLoader classLoader;
    private volatile ScriptSnapshot activeSnapshot;

    public ScriptRegistry() {
        this.classLoader = new GroovyClassLoader();
        this.activeSnapshot = ScriptSnapshot.empty();
    }

    /**
     * Immutable snapshot of all compiled scripts.
     * Atomically replaced during hot reload.
     */
    public static class ScriptSnapshot {
        public final Map<String, Class<? extends Script>> parseScripts;    // path -> compiled class
        public final List<ScriptMatchEntry> matchEntries;                   // ordered by weight desc
        public final Map<String, EventHook> hooks;                          // hookName -> instance

        ScriptSnapshot(Map<String, Class<? extends Script>> parseScripts,
                       List<ScriptMatchEntry> matchEntries,
                       Map<String, EventHook> hooks) {
            this.parseScripts = Collections.unmodifiableMap(parseScripts);
            this.matchEntries = Collections.unmodifiableList(matchEntries);
            this.hooks = Collections.unmodifiableMap(hooks);
        }

        static ScriptSnapshot empty() {
            return new ScriptSnapshot(Map.of(), List.of(), Map.of());
        }
    }

    /**
     * A parsing script with its match rules, sorted by weight.
     */
    public static class ScriptMatchEntry {
        public final GroovyScript meta;
        public final Class<? extends Script> compiledClass;

        public ScriptMatchEntry(GroovyScript meta, Class<? extends Script> compiledClass) {
            this.meta = meta;
            this.compiledClass = compiledClass;
        }
    }

    // --- Public API ---

    /**
     * Get the current active snapshot (lock-free read).
     */
    public ScriptSnapshot getSnapshot() {
        return activeSnapshot;
    }

    /**
     * Match a raw event JSON against parsing script rules.
     * Returns the script with the highest match weight, or null if no match.
     */
    public GroovyScript matchScript(String rawJson) {
        ScriptSnapshot snapshot = activeSnapshot;
        int bestWeight = 0;
        GroovyScript bestMatch = null;

        for (ScriptMatchEntry entry : snapshot.matchEntries) {
            int weight = calculateWeight(entry.meta, rawJson);
            if (weight > bestWeight) {
                bestWeight = weight;
                bestMatch = entry.meta;
            }
        }
        return bestMatch;
    }

    /**
     * Get a compiled parsing script class by path.
     */
    public Class<? extends Script> getParseScript(String path) {
        return activeSnapshot.parseScripts.get(path);
    }

    /**
     * Get a hook by name. Returns null if hook is not configured.
     */
    public EventHook getHook(String hookName) {
        return activeSnapshot.hooks.get(hookName);
    }

    /**
     * Execute a parsing script to transform raw JSON into an AlarmEvent.
     */
    @SuppressWarnings("unchecked")
    public Object executeParseScript(String path, Map<String, Object> variables) {
        Class<? extends Script> scriptClass = getParseScript(path);
        if (scriptClass == null) {
            throw new IllegalStateException("Script not found: " + path);
        }
        try {
            Script script = scriptClass.getDeclaredConstructor().newInstance();
            Binding binding = new Binding();
            variables.forEach(binding::setProperty);
            script.setBinding(binding);
            return script.run();
        } catch (Exception e) {
            throw new RuntimeException("Failed to execute script: " + path, e);
        }
    }

    /**
     * Hot reload all scripts from the given directory.
     * Compiles new scripts, builds a new snapshot, and atomically replaces the active one.
     */
    public synchronized void reload(File scriptDir) {
        log.info("Reloading Groovy scripts from: {}", scriptDir.getAbsolutePath());

        Map<String, Class<? extends Script>> parseScripts = new ConcurrentHashMap<>();
        List<ScriptMatchEntry> matchEntries = new ArrayList<>();
        Map<String, EventHook> hooks = new ConcurrentHashMap<>();

        File parseDir = new File(scriptDir, "formal");
        if (parseDir.exists()) {
            loadParseScripts(parseDir, parseScripts, matchEntries);
        }

        File hooksDir = new File(scriptDir, "hooks");
        if (hooksDir.exists()) {
            loadHookScripts(hooksDir, hooks);
        }

        // Sort match entries by potential weight descending
        matchEntries.sort((a, b) -> {
            int wA = a.meta.getDynamicRuleList() != null ? a.meta.getDynamicRuleList().size() : 0;
            int wB = b.meta.getDynamicRuleList() != null ? b.meta.getDynamicRuleList().size() : 0;
            return Integer.compare(wB, wA);
        });

        ScriptSnapshot newSnapshot = new ScriptSnapshot(parseScripts, matchEntries, hooks);
        this.activeSnapshot = newSnapshot;
        log.info("Script reload complete: {} parse scripts, {} hooks",
                parseScripts.size(), hooks.size());
    }

    // --- Internal ---

    @SuppressWarnings("unchecked")
    private void loadParseScripts(File dir, Map<String, Class<? extends Script>> parseScripts,
                                   List<ScriptMatchEntry> matchEntries) {
        File[] files = dir.listFiles((d, name) -> name.endsWith(".groovy"));
        if (files == null) return;

        for (File file : files) {
            try {
                Class<?> clazz = classLoader.parseClass(file);
                if (Script.class.isAssignableFrom(clazz)) {
                    String path = "formal/" + file.getName();
                    parseScripts.put(path, (Class<? extends Script>) clazz);

                    // Build a GroovyScript meta with default match rules
                    // In production, this would be loaded from DB or config
                    GroovyScript meta = new GroovyScript();
                    meta.setPath(path);
                    meta.setName(file.getName().replace(".groovy", ""));
                    meta.setEffective(true);
                    matchEntries.add(new ScriptMatchEntry(meta, (Class<? extends Script>) clazz));
                    log.debug("Loaded parse script: {}", path);
                }
            } catch (Exception e) {
                log.error("Failed to compile script: {}", file.getName(), e);
            }
        }
    }

    @SuppressWarnings("unchecked")
    private void loadHookScripts(File dir, Map<String, EventHook> hooks) {
        File[] files = dir.listFiles((d, name) -> name.endsWith(".groovy"));
        if (files == null) return;

        for (File file : files) {
            try {
                Class<?> clazz = classLoader.parseClass(file);
                if (EventHook.class.isAssignableFrom(clazz)) {
                    EventHook hook = (EventHook) clazz.getDeclaredConstructor().newInstance();
                    hooks.put(hook.hookName(), hook);
                    log.debug("Loaded hook: {} from {}", hook.hookName(), file.getName());
                }
            } catch (Exception e) {
                log.error("Failed to compile hook: {}", file.getName(), e);
            }
        }
    }

    /**
     * Calculate match weight for a script against raw JSON.
     * Returns the count of matched rules.
     */
    private int calculateWeight(GroovyScript script, String rawJson) {
        if (script.getDynamicRuleList() == null || script.getDynamicRuleList().isEmpty()) {
            // No rules = matches everything with weight 0 (fallback)
            return 0;
        }

        int weight = 0;
        for (ScriptMatchRule rule : script.getDynamicRuleList()) {
            if (matchRule(rule, rawJson)) {
                weight++;
            }
        }
        return weight;
    }

    private boolean matchRule(ScriptMatchRule rule, String rawJson) {
        // Simple containment check for JSON string
        // In production, parse JSON and check field values
        if (ScriptMatchRule.OP_EQUAL.equals(rule.getOperator())) {
            return rawJson.contains("\"" + rule.getKey() + "\":\"" + rule.getValue() + "\"");
        } else {
            return rawJson.contains(rule.getValue());
        }
    }
}
