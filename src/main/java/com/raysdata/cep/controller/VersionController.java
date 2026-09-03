package com.raysdata.cep.controller;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raysdata.cep.config.BuildInfo;

/**
 * Returns build identity so the web console footer can show which version is
 * running. GET /api/v1/version
 */
@RestController
@RequestMapping("/api/v1/version")
public class VersionController {

    private final BuildInfo buildInfo;

    public VersionController(BuildInfo buildInfo) {
        this.buildInfo = buildInfo;
    }

    @GetMapping
    public ResponseEntity<Map<String, Object>> version() {
        return ResponseEntity.ok(Map.of(
                "name", "cep-engine",
                "version", buildInfo.getVersion(),
                "buildTime", buildInfo.getBuildTime()
        ));
    }
}
