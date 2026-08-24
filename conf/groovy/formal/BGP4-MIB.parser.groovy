/**
 * Auto-generated from BGP4-MIB.mib
 * Generated: 2026-08-21T23:59:19.120527400
 * Traps/Notifications (4): bgpEstablishedNotification, bgpBackwardTransNotification, bgpEstablished, bgpBackwardTransition
 *
 * Mapping rules:
 *   node       = trap source IP (rawEvent.sourceIp)
 *   alertGroup/summary/severity/type = per-trap rule overrides
 */

import com.raysdata.cep.model.AlarmEvent
import com.raysdata.cep.model.EventType
import com.raysdata.cep.model.Severity

// ===== Trap OID -> definition mapping =====
// Key: fully resolved numeric OID, Value: [name, fields, fieldOids]
def trapMap = [:]

// ===== Name -> definition mapping (fallback for unresolved OIDs) =====
def trapNameMap = [:]

// --- bgpEstablishedNotification (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.2.1.15.0.1
// Fields: bgpPeerRemoteAddr, bgpPeerLastError, bgpPeerState
// Description: The bgpEstablishedNotification event is generated when the BGP FSM enters the established state. This Notification replaces the bgpEstablished Notification.
trapMap["1.3.6.1.2.1.15.0.1"] = [
    name: "bgpEstablishedNotification",
    fields: ["bgpPeerRemoteAddr", "bgpPeerLastError", "bgpPeerState"],
    fieldOids: ["bgpPeerRemoteAddr": "1.3.6.1.2.1.15.3.1.7", "bgpPeerLastError": "1.3.6.1.2.1.15.3.1.14", "bgpPeerState": "1.3.6.1.2.1.15.3.1.2"]
]

// --- bgpBackwardTransNotification (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.2.1.15.0.2
// Fields: bgpPeerRemoteAddr, bgpPeerLastError, bgpPeerState
// Description: The bgpBackwardTransNotification event is generated when the BGP FSM moves from a higher numbered state to a lower numbered state. This Notification replaces the bgpBackwardsTransition Notification.
trapMap["1.3.6.1.2.1.15.0.2"] = [
    name: "bgpBackwardTransNotification",
    fields: ["bgpPeerRemoteAddr", "bgpPeerLastError", "bgpPeerState"],
    fieldOids: ["bgpPeerRemoteAddr": "1.3.6.1.2.1.15.3.1.7", "bgpPeerLastError": "1.3.6.1.2.1.15.3.1.14", "bgpPeerState": "1.3.6.1.2.1.15.3.1.2"]
]

// --- bgpEstablished (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.2.1.15.7.1
// Fields: bgpPeerLastError, bgpPeerState
// Description: The BGP Established event is generated when the BGP FSM enters the ESTABLISHED state.
trapMap["1.3.6.1.2.1.15.7.1"] = [
    name: "bgpEstablished",
    fields: ["bgpPeerLastError", "bgpPeerState"],
    fieldOids: ["bgpPeerLastError": "1.3.6.1.2.1.15.3.1.14", "bgpPeerState": "1.3.6.1.2.1.15.3.1.2"]
]

// --- bgpBackwardTransition (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.2.1.15.7.2
// Fields: bgpPeerLastError, bgpPeerState
// Description: The BGPBackwardTransition Event is generated when the BGP FSM moves from a higher numbered state to a lower numbered state.
trapMap["1.3.6.1.2.1.15.7.2"] = [
    name: "bgpBackwardTransition",
    fields: ["bgpPeerLastError", "bgpPeerState"],
    fieldOids: ["bgpPeerLastError": "1.3.6.1.2.1.15.3.1.14", "bgpPeerState": "1.3.6.1.2.1.15.3.1.2"]
]

// ===== Lookup tables (inlined) =====
def lookupTables = [:]

// ===== Parsing logic =====

// Set to true to enable diagnostic logging for this MIB parser
DEBUG = false

LOG_PREFIX = "[BGP4-MIB]"
def dbg(msg) { if (DEBUG) println LOG_PREFIX + " " + msg }

// --- Stage 1: Raw event input ---
def metadata = rawEvent.getMetadata()
def trapOid = metadata?.get("trapOid")?.toString()
def sourceIp = rawEvent.getSourceIp()
def varbinds = metadata?.get("varbinds") as Map ?: [:]

dbg("--- Trap Input ---")
dbg("  sourceIp  = " + sourceIp)
dbg("  trapOid   = " + trapOid)
dbg("  trapName  = " + metadata?.get("trapName"))
dbg("  varbinds  = " + varbinds)
dbg("  trapMap   = " + trapMap.keySet())

// --- Stage 2: Match trap by OID, then fallback to name ---
def trapInfo = trapOid ? trapMap[trapOid] : null
def matchMethod = "none"
if (trapInfo == null) {
    def trapName = metadata?.get("trapName")?.toString()
    if (trapName) {
        trapInfo = trapNameMap[trapName]
        if (trapInfo) matchMethod = "name"
    }
} else {
    matchMethod = "oid"
}

dbg("--- OID Match ---")
dbg("  matchMethod = " + matchMethod)
dbg("  matched     = " + (trapInfo != null))
if (trapInfo) {
    dbg("  trapName    = " + trapInfo.name)
    dbg("  fields      = " + trapInfo.fields)
    dbg("  fieldOids   = " + trapInfo.fieldOids)
}

// Not a trap from this MIB
if (trapInfo == null) {
    dbg("  RESULT: no match, returning null")
    return null
}

def event = new AlarmEvent()

// --- Rule: node = trap source IP ---
event.setNode(sourceIp ?: "unknown")

// --- Rule: alertGroup = trap/notification name ---
event.setAlertGroup(trapInfo.name)

// --- Stage 3: Resolve field values from varbinds ---
// --- Rule: summary = all field key-value pairs ---
def summaryParts = []
def resolvedFields = [:]
def gf = [:]
def gfi = 0
trapInfo.fields.each { fieldName ->
    def oid = trapInfo.fieldOids?.get(fieldName)
    def val = varbinds.get(fieldName)
    def valSource = "name"
    if (val == null && oid != null) {
        val = varbinds.get(oid)
        valSource = "oid"
    }
    if (val == null) valSource = "missing"
    resolvedFields[fieldName] = [value: val, oid: oid, source: valSource]
    gf[++gfi] = val ?: ""
    summaryParts.add(fieldName + "=" + (val ?: ""))
    dbg("  field " + fieldName + ": oid=" + oid + " value=" + val + " source=" + valSource)
}
event.setSummary(summaryParts.join(", "))

def resolveInstanceOid = { int n ->
    if (n < 1) return ""
    def fname = (n-1 < trapInfo.fields.size()) ? trapInfo.fields[n-1] : null
    def prefix = fname ? trapInfo.fieldOids?.get(fname) : null
    if (prefix == null) return gf[n] ?: ""
    // prefer the n-th full instance-OID varbind key under the prefix (keeps varbind order)
    def matched = varbinds.keySet().findAll { k -> k != null && k.toString().startsWith(prefix + ".") }
    if (n-1 < matched.size()) return matched[n-1].toString()
    def rawIdx = varbinds.get(prefix)
    if (rawIdx != null && rawIdx.toString().trim() != "") return prefix + "." + rawIdx
    return gf[n] ?: ""
}
dbg("  resolveInstanceOid(1) = " + (trapInfo.fields ? resolveInstanceOid(1) : ""))

dbg("--- Field Resolution ---")
dbg("  resolvedFields = " + resolvedFields)
dbg("  summary        = " + event.getSummary())

// --- Standard fields ---
event.setSeverity(Severity.MINOR.level)
event.setEventType(EventType.PROBLEM.code)
event.setDomainId(metadata?.get("domainId")?.toString() ?: "default")
event.setIdentifier([event.getDomainId(), event.getNode(), trapInfo.name, event.getEventType()]
                    .findAll { it != null && it != "" }.join("|"))
event.setFirstOccurrence(System.currentTimeMillis())
event.setLastOccurrence(System.currentTimeMillis())
event.setRawEvent(rawEvent.getRawEvent())
// --- Preserve all original field values in rawEvent for traceability ---
// rawEvent carries the full original payload (KV / raw text / json) regardless of
// source (trap / syslog / http / file / kafka), so no original data is lost downstream.
def rawPayload = [:]
rawPayload["_source"] = rawEvent.getSource() ?: ""
rawPayload["_sourceIp"] = sourceIp ?: ""
rawPayload["_trapOid"] = trapOid ?: ""
rawPayload["_trapName"] = metadata?.get("trapName")?.toString() ?: ""
rawPayload["_rawText"] = rawEvent.getRawEvent() ?: ""
def rawMeta = [:]
metadata?.each { mk, mv -> if (mk != null && mv != null) rawMeta[mk.toString()] = mv }
rawPayload["_metadata"] = rawMeta
rawPayload["_fields"] = resolvedFields
rawPayload["_varbinds"] = varbinds
try {
    event.setRawEvent(groovy.json.JsonOutput.toJson(rawPayload))
} catch (Throwable t) {
    event.setRawEvent(rawEvent.getRawEvent() ?: "")
}
// expose structured raw fields for programmatic access (no JSON parsing needed)
def rawDyn = event.getDynamicFields() ?: [:]
rawDyn["raw_fields"] = [source: (rawEvent.getSource() ?: ""), sourceIp: (sourceIp ?: ""), trapOid: (trapOid ?: ""), fields: resolvedFields, varbinds: varbinds]
event.setDynamicFields(rawDyn)
event.setStatus("ACTIVE")
event.setEventClass("snmp_trap")
event.setSpecificTrap(trapOid ?: "")
event.setOriginalSeverity(event.getSeverity())
event.setOriginalSummary(event.getSummary())

// --- Trap rule overrides (alert group / severity) ---
def trapRuleName = trapInfo.name
def agent = ""
// --- Trap: bgpEstablishedNotification (OID 1.3.6.1.2.1.15.0.1) ---
// BGP FSM enters the established state. Field order: gf[1]=bgpPeerRemoteAddr, gf[2]=bgpPeerLastError, gf[3]=bgpPeerState
if (trapRuleName == "bgpEstablishedNotification") {
    event.setAlertGroup("BGP Peer Status")
    def alertKey = "bgpPeerEntry." + gf[1]
    event.setAlertKey(alertKey)
    def summary = "BGP Peer Established (peer " + gf[1] + ")"
    event.setSummary(summary)
    // bgpPeerState: 1=idle,2=connect,3=active,4=opensent,5=openconfirm,6=established
    if (gf[3] == "6") {
        event.setSeverity(1)
        event.setEventType("2")
    }
    else if (gf[3] == "1") {
        event.setSeverity(4)
        event.setEventType("1")
    }
    else {
        event.setSeverity(2)
        event.setEventType("1")
    }
    def dyn = event.getDynamicFields() ?: [:]
    dyn["bgpPeerRemoteAddr"] = varbinds.get("bgpPeerRemoteAddr")
    dyn["bgpPeerLastError"] = varbinds.get("bgpPeerLastError")
    dyn["bgpPeerState"] = varbinds.get("bgpPeerState")
    event.setDynamicFields(dyn)
}
// --- Trap: bgpBackwardTransNotification (OID 1.3.6.1.2.1.15.0.2) ---
// BGP FSM moves from a higher to a lower numbered state. Field order: gf[1]=bgpPeerRemoteAddr, gf[2]=bgpPeerLastError, gf[3]=bgpPeerState
if (trapRuleName == "bgpBackwardTransNotification") {
    event.setAlertGroup("BGP Peer Status")
    def alertKey = "bgpPeerEntry." + gf[1]
    event.setAlertKey(alertKey)
    def summary = "BGP Peer Down (peer " + gf[1] + ")"
    event.setSummary(summary)
    // A backward transition indicates a dropped/regressed BGP session, raise severity.
    if (gf[3] == "6") {
        event.setSeverity(2)
        event.setEventType("1")
    }
    else if (gf[3] == "1") {
        event.setSeverity(4)
        event.setEventType("1")
    }
    else {
        event.setSeverity(3)
        event.setEventType("1")
    }
    def dyn = event.getDynamicFields() ?: [:]
    dyn["bgpPeerRemoteAddr"] = varbinds.get("bgpPeerRemoteAddr")
    dyn["bgpPeerLastError"] = varbinds.get("bgpPeerLastError")
    dyn["bgpPeerState"] = varbinds.get("bgpPeerState")
    event.setDynamicFields(dyn)
}
// --- Trap: bgpEstablished (OID 1.3.6.1.2.1.15.7.1) ---
// Legacy BGP Established event. Field order: gf[1]=bgpPeerLastError, gf[2]=bgpPeerState
if (trapRuleName == "bgpEstablished") {
    event.setAlertGroup("BGP Peer Status")
    def alertKey = "bgpPeerEntry"
    event.setAlertKey(alertKey)
    def summary = "BGP Peer Established"
    event.setSummary(summary)
    if (gf[2] == "6") {
        event.setSeverity(1)
        event.setEventType("2")
    }
    else if (gf[2] == "1") {
        event.setSeverity(4)
        event.setEventType("1")
    }
    else {
        event.setSeverity(2)
        event.setEventType("1")
    }
    def dyn = event.getDynamicFields() ?: [:]
    dyn["bgpPeerLastError"] = varbinds.get("bgpPeerLastError")
    dyn["bgpPeerState"] = varbinds.get("bgpPeerState")
    event.setDynamicFields(dyn)
}
// --- Trap: bgpBackwardTransition (OID 1.3.6.1.2.1.15.7.2) ---
// Legacy BGP BackwardTransition event (FSM moves to a lower state). Field order: gf[1]=bgpPeerLastError, gf[2]=bgpPeerState
if (trapRuleName == "bgpBackwardTransition") {
    event.setAlertGroup("BGP Peer Status")
    def alertKey = "bgpPeerEntry"
    event.setAlertKey(alertKey)
    def summary = "BGP Peer Down"
    event.setSummary(summary)
    if (gf[2] == "6") {
        event.setSeverity(2)
        event.setEventType("1")
    }
    else if (gf[2] == "1") {
        event.setSeverity(4)
        event.setEventType("1")
    }
    else {
        event.setSeverity(3)
        event.setEventType("1")
    }
    def dyn = event.getDynamicFields() ?: [:]
    dyn["bgpPeerLastError"] = varbinds.get("bgpPeerLastError")
    dyn["bgpPeerState"] = varbinds.get("bgpPeerState")
    event.setDynamicFields(dyn)
}

// --- Stage 4: Final event output ---
dbg("--- Final Event ---")
dbg("  node           = " + event.getNode())
dbg("  alertGroup     = " + event.getAlertGroup())
dbg("  summary        = " + event.getSummary())
dbg("  severity       = " + event.getSeverity())
dbg("  eventType      = " + event.getEventType())
dbg("  identifier     = " + event.getIdentifier())
dbg("  specificTrap   = " + event.getSpecificTrap())
dbg("  status         = " + event.getStatus())
dbg("  domainId       = " + event.getDomainId())
dbg("  firstOccurrence= " + event.getFirstOccurrence())
dbg("  RESULT: event returned")

return event
