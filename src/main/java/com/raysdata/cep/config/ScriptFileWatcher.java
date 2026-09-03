package com.raysdata.cep.config;

import java.nio.file.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;

import com.raysdata.cep.groovy.ScriptRegistry;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * File watcher for Groovy script hot reloading.
 * <p>
 * Monitors the script directory for .groovy file changes and triggers
 * ScriptRegistry.reload() when changes are detected. This provides
 * zero-downtime script updates without REST API calls.
 * <p>
 * Disabled when cep.groovy.file-watch.enabled=false (use REST reload instead).
 */
@Configuration
@ConditionalOnProperty(name = "cep.groovy.file-watch.enabled", havingValue = "true", matchIfMissing = true)
public class ScriptFileWatcher {

    private static final Logger log = LoggerFactory.getLogger(ScriptFileWatcher.class);

    private final ScriptRegistry scriptRegistry;

    @Value("${cep.groovy.script-dir:./conf/groovy}")
    private String scriptDir;

    @Value("${cep.groovy.file-watch.debounce-ms:1000}")
    private long debounceMs;

    private WatchService watchService;
    private ExecutorService executor;

    public ScriptFileWatcher(ScriptRegistry scriptRegistry) {
        this.scriptRegistry = scriptRegistry;
    }

    @PostConstruct
    public void start() {
        try {
            Path dir = Paths.get(scriptDir);
            if (!dir.toFile().exists()) {
                log.warn("Script directory does not exist, file watcher disabled: {}", scriptDir);
                return;
            }

            watchService = FileSystems.getDefault().newWatchService();
            dir.register(watchService,
                    StandardWatchEventKinds.ENTRY_CREATE,
                    StandardWatchEventKinds.ENTRY_MODIFY,
                    StandardWatchEventKinds.ENTRY_DELETE);

            // Also register subdirectories
            registerSubdirs(dir);

            executor = Executors.newSingleThreadExecutor(r -> {
                Thread t = new Thread(r, "groovy-file-watcher");
                t.setDaemon(true);
                return t;
            });

            executor.submit(this::watchLoop);
            log.info("Groovy file watcher started for: {}", scriptDir);
        } catch (Exception e) {
            log.error("Failed to start file watcher", e);
        }
    }

    private void registerSubdirs(Path root) throws java.io.IOException {
        try (var stream = java.nio.file.Files.walk(root, 2)) {
            stream.filter(Files::isDirectory)
                    .forEach(d -> {
                        try {
                            d.register(watchService,
                                    StandardWatchEventKinds.ENTRY_CREATE,
                                    StandardWatchEventKinds.ENTRY_MODIFY,
                                    StandardWatchEventKinds.ENTRY_DELETE);
                        } catch (java.io.IOException e) {
                            log.warn("Failed to register subdirectory: {}", d, e);
                        }
                    });
        }
    }

    private void watchLoop() {
        long lastReload = 0;
        // Debounce: wait debounceMs after last change before reloading (configurable).

        while (!Thread.currentThread().isInterrupted()) {
            try {
                WatchKey key = watchService.take();
                boolean hasChanges = false;

                for (WatchEvent<?> event : key.pollEvents()) {
                    Path changed = (Path) event.context();
                    if (changed.toString().endsWith(".groovy")) {
                        log.debug("Script file changed: {} ({})", changed, event.kind());
                        hasChanges = true;
                    }
                }

                if (!key.reset()) break;

                if (hasChanges) {
                    long now = System.currentTimeMillis();
                    if (now - lastReload > debounceMs) {
                        Thread.sleep(debounceMs); // Wait for batch saves to complete
                        log.info("Script change detected, reloading...");
                        scriptRegistry.reload(new java.io.File(scriptDir));
                        lastReload = System.currentTimeMillis();
                    }
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            } catch (Exception e) {
                log.error("Error in file watcher loop", e);
            }
        }
    }

    @PreDestroy
    public void stop() {
        if (executor != null) executor.shutdownNow();
        if (watchService != null) {
            try {
                watchService.close();
            } catch (java.io.IOException e) {
                log.warn("Error closing watch service", e);
            }
        }
        log.info("Groovy file watcher stopped.");
    }
}
