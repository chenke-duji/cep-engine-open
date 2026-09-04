package com.dujitech.cep.model;

/**
 * Groovy script metadata and matching rules.
 * <p>
 * Each script has a set of {@link ScriptMatchRule} entries that determine
 * which incoming events should be processed by this script. Matching uses
 * a weighted system: the script with the highest match weight wins.
 */
public class GroovyScript {

    private String code;
    private String name;
    private String path;
    private String description;
    private boolean effective;
    private String content;
    private java.util.List<ScriptMatchRule> dynamicRuleList;

    // --- Getters and Setters ---

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isEffective() {
        return effective;
    }

    public void setEffective(boolean effective) {
        this.effective = effective;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public java.util.List<ScriptMatchRule> getDynamicRuleList() {
        return dynamicRuleList;
    }

    public void setDynamicRuleList(java.util.List<ScriptMatchRule> dynamicRuleList) {
        this.dynamicRuleList = dynamicRuleList;
    }
}
