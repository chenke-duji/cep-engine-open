package com.raysdata.cep.config;

import java.util.jar.Attributes;
import java.util.jar.Manifest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Exposes build identity (version + build time) so the running jar can be told
 * apart from older deployments. Values come from the jar manifest
 * (Implementation-Version / Build-Time), written by the Maven jar plugin, and
 * fall back to a configurable value for tests / IDE runs.
 */
@Component
public class BuildInfo {

    private final String version;
    private final String buildTime;

    public BuildInfo(@Value("${cep.build.version:}") String configuredVersion) {
        Manifest mf = loadManifest();
        String v = null;
        String t = null;
        if (mf != null) {
            Attributes attrs = mf.getMainAttributes();
            if (attrs != null) {
                v = attrs.getValue("Implementation-Version");
                t = attrs.getValue("Build-Time");
            }
        }
        this.version = (v != null && !v.isBlank()) ? v : (configuredVersion.isBlank() ? "unknown" : configuredVersion);
        this.buildTime = (t != null && !t.isBlank()) ? t : "unknown";
    }

    public String getVersion() {
        return version;
    }

    public String getBuildTime() {
        return buildTime;
    }

    private static Manifest loadManifest() {
        try (java.io.InputStream is = BuildInfo.class.getClassLoader()
                .getResourceAsStream("META-INF/MANIFEST.MF")) {
            if (is == null) return null;
            return new Manifest(is);
        } catch (Exception e) {
            return null;
        }
    }
}
