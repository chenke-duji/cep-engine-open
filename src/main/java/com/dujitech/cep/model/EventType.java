package com.dujitech.cep.model;

/**
 * Alarm event type - Problem or Resolution.
 * Mirrors the Netcool OMNIbus eventType concept.
 */
public enum EventType {
    PROBLEM("1"),
    RESOLUTION("2");

    private final String code;

    EventType(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public static EventType fromCode(String code) {
        for (EventType t : values()) {
            if (t.code.equals(code)) return t;
        }
        return PROBLEM;
    }
}
