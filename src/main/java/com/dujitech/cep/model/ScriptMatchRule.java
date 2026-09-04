package com.dujitech.cep.model;

/**
 * Match rule for script routing. An incoming event is checked against
 * all rules of all scripts; the script with the most matching rules
 * (highest weight) is selected to parse the event.
 */
public class ScriptMatchRule {

    private String code;
    private String key;
    private String value;
    private String operator;

    public static final String OP_EQUAL = "equal";
    public static final String OP_CONTAIN = "contain";

    // --- Getters and Setters ---

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
}
