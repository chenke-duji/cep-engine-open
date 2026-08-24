package com.raysdata.cep.model;

/**
 * Severity levels 0-5, aligned with Netcool OMNIbus convention.
 */
public enum Severity {
    CLEAR(0, "Clear"),
    INDETERMINATE(1, "Indeterminate"),
    WARNING(2, "Warning"),
    MINOR(3, "Minor"),
    MAJOR(4, "Major"),
    CRITICAL(5, "Critical");

    private final int level;
    private final String label;

    Severity(int level, String label) {
        this.level = level;
        this.label = label;
    }

    public int getLevel() {
        return level;
    }

    public String getLabel() {
        return label;
    }

    public static Severity fromLevel(int level) {
        for (Severity s : values()) {
            if (s.level == level) return s;
        }
        return INDETERMINATE;
    }
}
