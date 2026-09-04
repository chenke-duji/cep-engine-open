package com.dujitech.cep.model;

import com.dujitech.cep.engine.DomainProcessor;
import java.util.List;
import java.util.Map;

/**
 * Context object passed to Groovy hook scripts.
 * <p>
 * Contains the current event being processed, the domain processor's
 * in-memory state (accessible via methods), and mutable script variables
 * that can be shared across hooks within the same event's processing chain.
 * <p>
 * Groovy scripts receive this object and can:
 * <ul>
 *   <li>Read/modify the current event</li>
 *   <li>Query active events by identifier</li>
 *   <li>Access maintain rules</li>
 *   <li>Store custom variables for later hooks</li>
 * </ul>
 */
public class HookContext {

    private AlarmEvent currentEvent;
    private AlarmEvent matchedActiveEvent;
    private String domainId;
    private long flashCount;
    private List<MaintainRule> maintainRules;
    private Map<String, Object> scriptVariables;
    private DomainProcessor domainProcessor;

    public HookContext() {
    }

    public HookContext(AlarmEvent currentEvent, String domainId) {
        this.currentEvent = currentEvent;
        this.domainId = domainId;
    }

    /**
     * Query an active event by identifier from the domain processor's memory.
     */
    public AlarmEvent getActiveEvent(String identifier) {
        if (domainProcessor != null) {
            return domainProcessor.getActiveEvent(identifier);
        }
        return null;
    }

    // --- Getters and Setters ---

    public AlarmEvent getCurrentEvent() {
        return currentEvent;
    }

    public void setCurrentEvent(AlarmEvent currentEvent) {
        this.currentEvent = currentEvent;
    }

    public AlarmEvent getMatchedActiveEvent() {
        return matchedActiveEvent;
    }

    public void setMatchedActiveEvent(AlarmEvent matchedActiveEvent) {
        this.matchedActiveEvent = matchedActiveEvent;
    }

    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public long getFlashCount() {
        return flashCount;
    }

    public void setFlashCount(long flashCount) {
        this.flashCount = flashCount;
    }

    public List<MaintainRule> getMaintainRules() {
        return maintainRules;
    }

    public void setMaintainRules(List<MaintainRule> maintainRules) {
        this.maintainRules = maintainRules;
    }

    public Map<String, Object> getScriptVariables() {
        return scriptVariables;
    }

    public void setScriptVariables(Map<String, Object> scriptVariables) {
        this.scriptVariables = scriptVariables;
    }

    public DomainProcessor getDomainProcessor() {
        return domainProcessor;
    }

    public void setDomainProcessor(DomainProcessor domainProcessor) {
        this.domainProcessor = domainProcessor;
    }
}
