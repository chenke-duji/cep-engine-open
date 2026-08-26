package com.raysdata.cep.model;

import java.util.Map;

/**
 * Storage model for events that could not be parsed by any script (e.g. an
 * unsupported vendor MIB trap). Persisted to the <code>events_unresolved</code>
 * collection so operators can inspect and later add support.
 * <p>
 * The original RawEvent is kept both flattened and as the full JSON string for
 * inspection.
 */
public class UnresolvedEvent {

    private String id;
    private String source;
    private String sourceIp;
    private long originTimestamp;
    private long receivedAt;
    /** Why parsing failed (e.g. "no matching script"). */
    private String reason;
    /** Flattened metadata from the original RawEvent (may be empty). */
    private Map<String, Object> metadata;
    /** Full JSON of the original RawEvent. */
    private String rawJson;

    public UnresolvedEvent() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSourceIp() {
        return sourceIp;
    }

    public void setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
    }

    public long getOriginTimestamp() {
        return originTimestamp;
    }

    public void setOriginTimestamp(long originTimestamp) {
        this.originTimestamp = originTimestamp;
    }

    public long getReceivedAt() {
        return receivedAt;
    }

    public void setReceivedAt(long receivedAt) {
        this.receivedAt = receivedAt;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Map<String, Object> getMetadata() {
        return metadata;
    }

    public void setMetadata(Map<String, Object> metadata) {
        this.metadata = metadata;
    }

    public String getRawJson() {
        return rawJson;
    }

    public void setRawJson(String rawJson) {
        this.rawJson = rawJson;
    }
}
