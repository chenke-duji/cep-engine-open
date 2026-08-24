package com.raysdata.cep.model;

import java.util.Map;

/**
 * Raw event payload received from collectors or external sources.
 * <p>
 * This is the ingested format before Groovy parsing. Collectors (SNMP Trap,
 * Syslog, File, HTTP) wrap original data into this structure and POST it
 * to the REST API.
 */
public class RawEvent {

    /** Source type: snmp_trap, syslog, http_json, file, kafka, etc. */
    private String source;

    /** Timestamp when the collector received the event (epoch millis) */
    private long receivedAt;

    /** Timestamp when the original device generated the event (epoch millis).
     *  Used for transport-level dedup across Active-Active collectors.
     *  Two collectors forwarding the same device event will have identical
     *  originTimestamp but different receivedAt. */
    private long originTimestamp;

    /** Source IP or hostname of the device/system that generated the event */
    private String sourceIp;

    /** Original raw event data as a string */
    private String rawEvent;

    /** Protocol-specific metadata (trap OID, syslog facility, etc.) */
    private Map<String, Object> metadata;

    // --- Getters and Setters ---

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public long getReceivedAt() {
        return receivedAt;
    }

    public void setReceivedAt(long receivedAt) {
        this.receivedAt = receivedAt;
    }

    public long getOriginTimestamp() {
        return originTimestamp;
    }

    public void setOriginTimestamp(long originTimestamp) {
        this.originTimestamp = originTimestamp;
    }

    public String getSourceIp() {
        return sourceIp;
    }

    public void setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
    }

    public String getRawEvent() {
        return rawEvent;
    }

    public void setRawEvent(String rawEvent) {
        this.rawEvent = rawEvent;
    }

    public Map<String, Object> getMetadata() {
        return metadata;
    }

    public void setMetadata(Map<String, Object> metadata) {
        this.metadata = metadata;
    }

    @Override
    public String toString() {
        return "RawEvent{source='" + source + '\'' +
                ", sourceIp='" + sourceIp + '\'' +
                ", receivedAt=" + receivedAt +
                '}';
    }
}
