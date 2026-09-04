package com.dujitech.cep.model;

/**
 * Result action returned by Groovy hook scripts.
 * The Java processing chain uses this to decide what to do next.
 */
public enum ResultAction {
    /** Continue normal processing */
    PASS,
    /** Suppress the event (optionally still write with suppress level) */
    SUPPRESS,
    /** Event was modified by the hook, use the modified version */
    MODIFY,
    /** Problem/Resolution matched, Java should execute the clear */
    MATCH,
    /** No match for pairing */
    NO_MATCH
}
