package com.dujitech.cep.model;

/**
 * Result returned by Groovy hook scripts.
 * <p>
 * The Java processing chain calls {@code EventHook.execute(HookContext)}
 * which returns this object. The {@link ResultAction} determines what
 * the Java chain does next.
 */
public class HookResult {

    private ResultAction action;
    private AlarmEvent modifiedEvent;
    private String suppressLevel;
    private String pairKey;
    private java.util.Map<String, Object> extras;

    public HookResult() {
    }

    public HookResult(ResultAction action) {
        this.action = action;
    }

    public static HookResult pass() {
        return new HookResult(ResultAction.PASS);
    }

    public static HookResult suppress(String level) {
        HookResult r = new HookResult(ResultAction.SUPPRESS);
        r.suppressLevel = level;
        return r;
    }

    public static HookResult modify(AlarmEvent event) {
        HookResult r = new HookResult(ResultAction.MODIFY);
        r.modifiedEvent = event;
        return r;
    }

    // --- Getters and Setters ---

    public ResultAction getAction() {
        return action;
    }

    public void setAction(ResultAction action) {
        this.action = action;
    }

    public AlarmEvent getModifiedEvent() {
        return modifiedEvent;
    }

    public void setModifiedEvent(AlarmEvent modifiedEvent) {
        this.modifiedEvent = modifiedEvent;
    }

    public String getSuppressLevel() {
        return suppressLevel;
    }

    public void setSuppressLevel(String suppressLevel) {
        this.suppressLevel = suppressLevel;
    }

    public String getPairKey() {
        return pairKey;
    }

    public void setPairKey(String pairKey) {
        this.pairKey = pairKey;
    }

    public java.util.Map<String, Object> getExtras() {
        return extras;
    }

    public void setExtras(java.util.Map<String, Object> extras) {
        this.extras = extras;
    }
}
