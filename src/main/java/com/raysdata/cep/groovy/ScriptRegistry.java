package com.raysdata.cep.groovy;

import groovy.lang.Binding;
import groovy.lang.GroovyClassLoader;
import groovy.lang.Script;

import java.io.File;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

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

    // Volatile so reload() can atomically swap in a fresh classloader; a long-lived
    // GroovyClassLoader that keeps re-parsing on hot reload leaks Metaspace.
    private volatile GroovyClassLoader classLoader;
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

        // LOG-07: parse once to a JsonObject so rules match exact field values
        // instead of doing fragile substring containment on the serialized JSON.
        JsonObject root = parseJson(rawJson);

        for (ScriptMatchEntry entry : snapshot.matchEntries) {
            int weight = calculateWeight(entry.meta, root);
            if (weight > bestWeight) {
                bestWeight = weight;
                bestMatch = entry.meta;
            }
        }
        return bestMatch;
    }

    private static JsonObject parseJson(String rawJson) {
        try {
            var el = JsonParser.parseString(rawJson);
            return el.isJsonObject() ? el.getAsJsonObject() : new JsonObject();
        } catch (Exception e) {
            return new JsonObject();
        }
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

        // LOG-09: use a fresh GroovyClassLoader per reload so re-parsed classes
        // (and their metadata) don't accumulate in a long-lived loader.
        this.classLoader = new GroovyClassLoader();

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

    /**
     * Regex matching a script's trapMap declaration: trapMap["1.3.6.1.4.1.2011..."] = [
     * The captured group is the numeric trap OID handled by the script.
     */
    private static final java.util.regex.Pattern TRAP_OID_PATTERN =
            java.util.regex.Pattern.compile("trapMap\\[\"([0-9.]+)\"\\]");

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

                    // Build a GroovyScript meta. Match rules are derived from the
                    // trap OIDs this script declares in its trapMap, so
                    // matchScript can route an incoming event to the script that
                    // handles its trapOid (each script's trapMap is authoritative).
                    GroovyScript meta = new GroovyScript();
                    meta.setPath(path);
                    meta.setName(file.getName().replace(".groovy", ""));
                    meta.setEffective(true);
                    meta.setDynamicRuleList(extractOidMatchRules(file));
                    matchEntries.add(new ScriptMatchEntry(meta, (Class<? extends Script>) clazz));
                    log.debug("Loaded parse script: {} ({} trap OIDs)",
                            path, meta.getDynamicRuleList() == null ? 0 : meta.getDynamicRuleList().size());
                }
            } catch (Exception e) {
                log.error("Failed to compile script: {}", file.getName(), e);
            }
        }
    }

    /**
     * Extract the numeric trap OIDs a script handles from its trapMap map
     * declarations. Each OID becomes an equality match rule on the raw event's
     * "trapOid" metadata field, allowing {@link #matchScript} to route events to
     * the script whose trapMap contains that OID.
     * <p>
     * Generic parsers that have no trapMap (e.g. {@code syslog_parser},
     * {@code snmp_trap_parser}) get a fallback rule matching on the event's
     * {@code source} field instead, so that e.g. source=syslog events are routed
     * to the syslog parser and unhandled trap events fall back to the generic
     * SNMP parser.
     */
    private List<ScriptMatchRule> extractOidMatchRules(File file) {
        List<ScriptMatchRule> rules = new ArrayList<>();
        try {
            String content = java.nio.file.Files.readString(file.toPath());
            java.util.regex.Matcher m = TRAP_OID_PATTERN.matcher(content);
            java.util.Set<String> seen = new java.util.LinkedHashSet<>();
            while (m.find()) {
                String oid = m.group(1);
                if (seen.add(oid)) {
                    ScriptMatchRule rule = new ScriptMatchRule();
                    rule.setKey("trapOid");
                    rule.setValue(oid);
                    rule.setOperator(ScriptMatchRule.OP_EQUAL);
                    rules.add(rule);
                }
            }
            // Generic parsers without a trapMap are matched by their source type.
            if (rules.isEmpty()) {
                String name = file.getName();
                if (name.contains("syslog")) {
                    rules.add(sourceRule("syslog"));
                } else if (name.contains("snmp_trap")) {
                    rules.add(sourceRule("snmp_trap"));
                } else if (name.startsWith("alertmanager")) {
                    // Extract source from filename:
                    //   alertmanager_parser.groovy          -> "alertmanager"
                    //   alertmanager_prod_parser.groovy     -> "alertmanager_prod"
                    //   alertmanager_staging_parser.groovy  -> "alertmanager_staging"
                    String scriptName = name.replace(".groovy", "");
                    String source = scriptName.replaceFirst("_parser$", "");
                    rules.add(sourceRule(source));
                }
            }
        } catch (Exception e) {
            log.warn("Failed to extract trap OIDs from {}", file.getName(), e);
        }
        return rules;
    }

    private ScriptMatchRule sourceRule(String source) {
        ScriptMatchRule rule = new ScriptMatchRule();
        rule.setKey("source");
        rule.setValue(source);
        rule.setOperator(ScriptMatchRule.OP_EQUAL);
        return rule;
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
     * Calculate match weight for a script against the parsed raw event.
     * Returns the count of matched rules.
     */
    private int calculateWeight(GroovyScript script, JsonObject root) {
        if (script.getDynamicRuleList() == null || script.getDynamicRuleList().isEmpty()) {
            // No rules = matches everything with weight 0 (fallback)
            return 0;
        }

        int weight = 0;
        for (ScriptMatchRule rule : script.getDynamicRuleList()) {
            if (matchRule(rule, root)) {
                weight++;
            }
        }
        return weight;
    }

    private boolean matchRule(ScriptMatchRule rule, JsonObject root) {
        // Exact field comparison against the parsed event JSON. The match rule's
        // key may be a top-level field (e.g. "source") or a nested path
        // (e.g. "metadata.trapOid"). value is compared as a string.
        JsonElement elem = resolvePath(root, rule.getKey());
        if (elem == null || elem.isJsonNull()) return false;
        String actual = elem.isJsonPrimitive() ? elem.getAsString() : elem.toString();
        if (ScriptMatchRule.OP_EQUAL.equals(rule.getOperator())) {
            return actual.equals(rule.getValue());
        }
        return actual.contains(rule.getValue());
    }

    /** Resolve a dotted path (e.g. "metadata.trapOid") into a JSON element. */
    private static JsonElement resolvePath(JsonObject root, String path) {
        if (path == null || path.isBlank()) return null;
        String[] parts = path.split("\\.");
        JsonElement cur = root;
        for (String p : parts) {
            if (!cur.isJsonObject()) return null;
            cur = cur.getAsJsonObject().get(p);
            if (cur == null) return null;
        }
        return cur;
    }
}
