package com.raysdata.cep.model;

import java.util.Map;

/**
 * Alarm event model - the unified event representation.
 * <p>
 * Core fields mirror the Netcool OMNIbus alerts.status table and the
 * RaysData AlarmEvent specification. Dynamic fields are supported via
 * {@link #dynamicFields} for schema-less extension without model changes.
 * <p>
 * MongoDB persistence: stored in <code>events_current</code> (active) or
 * <code>events_history</code> (closed/archived) collections.
 */
public class AlarmEvent {

    private String identifier;
    /** Monotonic, server-assigned numeric id for a record. The string
     *  {@code identifier} can be long, so this compact long gives a simple,
     *  stable unique key (assigned once on first insert, never changes). */
    private long serial;
    private String node;
    private String nodeAlias;
    private int severity;
    private int originalSeverity;
    private String summary;
    private long tally;
    private long firstOccurrence;
    private long lastOccurrence;
    private String domainId;
    private String status;
    private String alertKey;
    private String script;
    private String eventClass;
    private String rawEvent;
    private String eventEnterprise;
    private String alertGroup;
    private String alertGroupName;
    private long clearTime;
    private long receiveTime;
    private long deleteTime;
    private String vendor;
    private String suppressLevel;
    private String escalateLevel;
    private String eventType;
    private String specificTrap;
    private String originalSummary;
    private Map<String, Object> dynamicFields;
    private String agentType;
    private String maintainId;
    private String maintainName;
    private long recoveryTime;
    private String siteNum;
    private String ticketId;

    // --- Getters and Setters ---

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public long getSerial() {
        return serial;
    }

    public void setSerial(long serial) {
        this.serial = serial;
    }

    public String getNode() {
        return node;
    }

    public void setNode(String node) {
        this.node = node;
    }

    public String getNodeAlias() {
        return nodeAlias;
    }

    public void setNodeAlias(String nodeAlias) {
        this.nodeAlias = nodeAlias;
    }

    public int getSeverity() {
        return severity;
    }

    public void setSeverity(int severity) {
        this.severity = severity;
    }

    public int getOriginalSeverity() {
        return originalSeverity;
    }

    public void setOriginalSeverity(int originalSeverity) {
        this.originalSeverity = originalSeverity;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public long getTally() {
        return tally;
    }

    public void setTally(long tally) {
        this.tally = tally;
    }

    public long getFirstOccurrence() {
        return firstOccurrence;
    }

    public void setFirstOccurrence(long firstOccurrence) {
        this.firstOccurrence = firstOccurrence;
    }

    public long getLastOccurrence() {
        return lastOccurrence;
    }

    public void setLastOccurrence(long lastOccurrence) {
        this.lastOccurrence = lastOccurrence;
    }

    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAlertKey() {
        return alertKey;
    }

    public void setAlertKey(String alertKey) {
        this.alertKey = alertKey;
    }

    public String getScript() {
        return script;
    }

    public void setScript(String script) {
        this.script = script;
    }

    public String getEventClass() {
        return eventClass;
    }

    public void setEventClass(String eventClass) {
        this.eventClass = eventClass;
    }

    public String getRawEvent() {
        return rawEvent;
    }

    public void setRawEvent(String rawEvent) {
        this.rawEvent = rawEvent;
    }

    public String getEventEnterprise() {
        return eventEnterprise;
    }

    public void setEventEnterprise(String eventEnterprise) {
        this.eventEnterprise = eventEnterprise;
    }

    public String getAlertGroup() {
        return alertGroup;
    }

    public void setAlertGroup(String alertGroup) {
        this.alertGroup = alertGroup;
    }

    public String getAlertGroupName() {
        return alertGroupName;
    }

    public void setAlertGroupName(String alertGroupName) {
        this.alertGroupName = alertGroupName;
    }

    public long getClearTime() {
        return clearTime;
    }

    public void setClearTime(long clearTime) {
        this.clearTime = clearTime;
    }

    public long getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(long receiveTime) {
        this.receiveTime = receiveTime;
    }

    public long getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(long deleteTime) {
        this.deleteTime = deleteTime;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getSuppressLevel() {
        return suppressLevel;
    }

    public void setSuppressLevel(String suppressLevel) {
        this.suppressLevel = suppressLevel;
    }

    public String getEscalateLevel() {
        return escalateLevel;
    }

    public void setEscalateLevel(String escalateLevel) {
        this.escalateLevel = escalateLevel;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getSpecificTrap() {
        return specificTrap;
    }

    public void setSpecificTrap(String specificTrap) {
        this.specificTrap = specificTrap;
    }

    public String getOriginalSummary() {
        return originalSummary;
    }

    public void setOriginalSummary(String originalSummary) {
        this.originalSummary = originalSummary;
    }

    public Map<String, Object> getDynamicFields() {
        return dynamicFields;
    }

    public void setDynamicFields(Map<String, Object> dynamicFields) {
        this.dynamicFields = dynamicFields;
    }

    public String getAgentType() {
        return agentType;
    }

    public void setAgentType(String agentType) {
        this.agentType = agentType;
    }

    public String getMaintainId() {
        return maintainId;
    }

    public void setMaintainId(String maintainId) {
        this.maintainId = maintainId;
    }

    public String getMaintainName() {
        return maintainName;
    }

    public void setMaintainName(String maintainName) {
        this.maintainName = maintainName;
    }

    public long getRecoveryTime() {
        return recoveryTime;
    }

    public void setRecoveryTime(long recoveryTime) {
        this.recoveryTime = recoveryTime;
    }

    public String getSiteNum() {
        return siteNum;
    }

    public void setSiteNum(String siteNum) {
        this.siteNum = siteNum;
    }

    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    @Override
    public String toString() {
        return "AlarmEvent{identifier='" + identifier + '\'' +
                ", node='" + node + '\'' +
                ", severity=" + severity +
                ", domainId='" + domainId + '\'' +
                ", eventType='" + eventType + '\'' +
                ", tally=" + tally +
                '}';
    }
}
