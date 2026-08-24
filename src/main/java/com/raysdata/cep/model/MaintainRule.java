package com.raysdata.cep.model;

/**
 * Maintenance window rule. Events matching the rule are suppressed.
 * <p>
 * Loaded from MongoDB and cached in DomainProcessor for fast in-memory
 * matching during event processing.
 */
public class MaintainRule {

    private String id;
    private String name;
    private String domainId;
    private String node;
    private String alertGroup;
    private int suppressLevel;
    private long startTime;
    private long endTime;
    private boolean enabled;

    // --- Getters and Setters ---

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public String getNode() {
        return node;
    }

    public void setNode(String node) {
        this.node = node;
    }

    public String getAlertGroup() {
        return alertGroup;
    }

    public void setAlertGroup(String alertGroup) {
        this.alertGroup = alertGroup;
    }

    public int getSuppressLevel() {
        return suppressLevel;
    }

    public void setSuppressLevel(int suppressLevel) {
        this.suppressLevel = suppressLevel;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}
