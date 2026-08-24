package com.raysdata.cep.controller;

import java.io.File;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.raysdata.cep.groovy.ScriptRegistry;

import java.util.Map;

/**
 * Script management API.
 * <p>
 * Provides CRUD for Groovy scripts and the all-important "effect" (reload)
 * endpoint that triggers hot-loading of updated scripts without restart.
 */
@RestController
@RequestMapping("/api/v1/scripts")
public class ScriptController {

    private static final Logger log = LoggerFactory.getLogger(ScriptController.class);

    private final ScriptRegistry scriptRegistry;

    @Value("${cep.groovy.script-dir:./conf/groovy}")
    private String scriptDir;

    public ScriptController(ScriptRegistry scriptRegistry) {
        this.scriptRegistry = scriptRegistry;
    }

    /**
     * Reload all scripts from the configured directory.
     * This is the "effect" (take effect) endpoint.
     *
     * POST /api/v1/scripts/reload
     */
    @PostMapping("/reload")
    public ResponseEntity<Map<String, Object>> reload() {
        try {
            File dir = new File(scriptDir);
            scriptRegistry.reload(dir);
            var snapshot = scriptRegistry.getSnapshot();
            return ResponseEntity.ok(Map.of(
                    "status", "success",
                    "parseScripts", snapshot.parseScripts.size(),
                    "hooks", snapshot.hooks.size()
            ));
        } catch (Exception e) {
            log.error("Script reload failed", e);
            return ResponseEntity.internalServerError().body(Map.of(
                    "status", "failed",
                    "error", e.getMessage()
            ));
        }
    }

    /**
     * Get current script registry status.
     *
     * GET /api/v1/scripts/status
     */
    @GetMapping("/status")
    public ResponseEntity<Map<String, Object>> status() {
        var snapshot = scriptRegistry.getSnapshot();
        return ResponseEntity.ok(Map.of(
                "parseScripts", snapshot.parseScripts.keySet(),
                "hooks", snapshot.hooks.keySet(),
                "matchEntries", snapshot.matchEntries.size()
        ));
    }
}
