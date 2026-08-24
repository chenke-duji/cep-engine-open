package com.raysdata.cep;

import java.io.File;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.raysdata.cep.groovy.ScriptRegistry;

/**
 * CEP Event Engine - Spring Boot application entry point.
 * <p>
 * On startup, loads Groovy scripts from the configured directory.
 * The REST API is always available; Kafka consumer is conditional.
 */
@SpringBootApplication
@EnableScheduling
public class CepEngineApplication implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(CepEngineApplication.class);

    private final ScriptRegistry scriptRegistry;

    @Value("${cep.groovy.script-dir:./conf/groovy}")
    private String scriptDir;

    public CepEngineApplication(ScriptRegistry scriptRegistry) {
        this.scriptRegistry = scriptRegistry;
    }

    public static void main(String[] args) {
        SpringApplication.run(CepEngineApplication.class, args);
    }

    @Override
    public void run(String... args) {
        File dir = new File(scriptDir);
        if (dir.exists() && dir.isDirectory()) {
            log.info("Loading Groovy scripts from: {}", dir.getAbsolutePath());
            scriptRegistry.reload(dir);
        } else {
            log.warn("Script directory not found: {}. Starting with empty script registry.", scriptDir);
        }
        log.info("CEP Engine started successfully.");
    }
}
