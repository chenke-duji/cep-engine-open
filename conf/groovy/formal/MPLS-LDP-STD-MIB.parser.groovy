/**
 * Auto-generated from MPLS-LDP-STD-MIB.mib
 * Generated: 2026-08-25T16:47:06.247990100
 * Traps/Notifications (4): mplsLdpInitSessionThresholdExceeded, mplsLdpPathVectorLimitMismatch, mplsLdpSessionUp, mplsLdpSessionDown
 *
 * Mapping rules:
 *   node       = trap source IP (rawEvent.sourceIp)
 *   alertGroup/summary/severity/type = per-trap rule overrides
 */

import com.dujitech.cep.model.AlarmEvent
import com.dujitech.cep.model.EventType
import com.dujitech.cep.model.Severity

// ===== Trap OID -> definition mapping =====
// Key: fully resolved numeric OID, Value: [name, fields, fieldOids]
def trapMap = [:]

// ===== Name -> definition mapping (fallback for unresolved OIDs) =====
def trapNameMap = [:]

// --- mplsLdpInitSessionThresholdExceeded (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.2.1.10.166.4.0.1
// Fields: mplsLdpEntityInitSessionThreshold
// Description: This notification is generated when the value of the 'mplsLdpEntityInitSessionThreshold' object is not zero, and the number of Session Initialization messages exceeds the value of the 'mplsLdpEntityIn...
trapMap["1.3.6.1.2.1.10.166.4.0.1"] = [
    name: "mplsLdpInitSessionThresholdExceeded",
    fields: ["mplsLdpEntityInitSessionThreshold"],
    fieldOids: ["mplsLdpEntityInitSessionThreshold": "1.3.6.1.2.1.10.166.4.1.2.3.1.11"]
]

// --- mplsLdpPathVectorLimitMismatch (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.2.1.10.166.4.0.2
// Fields: mplsLdpEntityPathVectorLimit, mplsLdpPeerPathVectorLimit
// Description: This notification is sent when the 'mplsLdpEntityPathVectorLimit' does NOT match the value of the 'mplsLdpPeerPathVectorLimit' for a specific Entity.
trapMap["1.3.6.1.2.1.10.166.4.0.2"] = [
    name: "mplsLdpPathVectorLimitMismatch",
    fields: ["mplsLdpEntityPathVectorLimit", "mplsLdpPeerPathVectorLimit"],
    fieldOids: ["mplsLdpEntityPathVectorLimit": "1.3.6.1.2.1.10.166.4.1.2.3.1.14", "mplsLdpPeerPathVectorLimit": "1.3.6.1.2.1.10.166.4.1.3.2.1.3"]
]

// --- mplsLdpSessionUp (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.2.1.10.166.4.0.3
// Fields: mplsLdpSessionState, mplsLdpSessionDiscontinuityTime, mplsLdpSessionStatsUnknownMesTypeErrors, mplsLdpSessionStatsUnknownTlvErrors, hwMplsLdpSessionDownReason, ifName
// Description: If this notification is sent when the value of 'mplsLdpSessionState' enters the 'operational(5)' state.
trapMap["1.3.6.1.2.1.10.166.4.0.3"] = [
    name: "mplsLdpSessionUp",
    fields: ["mplsLdpSessionState", "mplsLdpSessionDiscontinuityTime", "mplsLdpSessionStatsUnknownMesTypeErrors", "mplsLdpSessionStatsUnknownTlvErrors", "hwMplsLdpSessionDownReason", "ifName"],
    fieldOids: ["mplsLdpSessionState": "1.3.6.1.2.1.10.166.4.1.3.3.1.2", "mplsLdpSessionDiscontinuityTime": "1.3.6.1.2.1.10.166.4.1.3.3.1.8", "mplsLdpSessionStatsUnknownMesTypeErrors": "1.3.6.1.2.1.10.166.4.1.3.4.1.1", "mplsLdpSessionStatsUnknownTlvErrors": "1.3.6.1.2.1.10.166.4.1.3.4.1.2", "hwMplsLdpSessionDownReason": "1.3.6.1.4.1.2011.5.25.143.1.7.1.3", "ifName": "1.3.6.1.2.1.31.1.1.1.1"]
]

// --- mplsLdpSessionDown (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.2.1.10.166.4.0.4
// Fields: mplsLdpSessionState, mplsLdpSessionDiscontinuityTime, mplsLdpSessionStatsUnknownMesTypeErrors, mplsLdpSessionStatsUnknownTlvErrors, hwMplsLdpSessionDownReason, ifName
// Description: This notification is sent when the value of 'mplsLdpSessionState' leaves the 'operational(5)' state.
trapMap["1.3.6.1.2.1.10.166.4.0.4"] = [
    name: "mplsLdpSessionDown",
    fields: ["mplsLdpSessionState", "mplsLdpSessionDiscontinuityTime", "mplsLdpSessionStatsUnknownMesTypeErrors", "mplsLdpSessionStatsUnknownTlvErrors", "hwMplsLdpSessionDownReason", "ifName"],
    fieldOids: ["mplsLdpSessionState": "1.3.6.1.2.1.10.166.4.1.3.3.1.2", "mplsLdpSessionDiscontinuityTime": "1.3.6.1.2.1.10.166.4.1.3.3.1.8", "mplsLdpSessionStatsUnknownMesTypeErrors": "1.3.6.1.2.1.10.166.4.1.3.4.1.1", "mplsLdpSessionStatsUnknownTlvErrors": "1.3.6.1.2.1.10.166.4.1.3.4.1.2", "hwMplsLdpSessionDownReason": "1.3.6.1.4.1.2011.5.25.143.1.7.1.3", "ifName": "1.3.6.1.2.1.31.1.1.1.1"]
]

// ===== Lookup tables (inlined) =====
def lookupTables = [:]

// ===== Parsing logic =====

// Set to true to enable diagnostic logging for this MIB parser
DEBUG = false

LOG_PREFIX = "[MPLS-LDP-STD-MIB]"
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
event.setStatus("UnAcked")
event.setEventClass("snmp_trap")
event.setSpecificTrap(trapOid ?: "")
event.setOriginalSeverity(event.getSeverity())
event.setOriginalSummary(event.getSummary())

// --- Trap rule overrides (alert group / severity) ---
def trapRuleName = trapInfo.name
def agent = ""
// --- Trap: mplsLdpInitSessionThresholdExceeded (OID 1.3.6.1.2.1.10.166.4.1) ---
if (trapRuleName == "mplsLdpInitSessionThresholdExceeded") {
    event.setAlertGroup("MPLS LDP Initialization Session Threshold")
    def alertKey = "mplsLdpEntityEntry." + (((resolveInstanceOid(1) =~ /\.([0-9]+\.[0-9]+\.[0-9]+\.[0-9]+\.[0-9]+\.[0-9]+)\.[0-9]+$/) ? (resolveInstanceOid(1) =~ /\.([0-9]+\.[0-9]+\.[0-9]+\.[0-9]+\.[0-9]+\.[0-9]+)\.[0-9]+$/)[0][1] : '')) + "." + (((resolveInstanceOid(1) =~ /\.[0-9]+\.[0-9]+\.[0-9]+\.[0-9]+\.[0-9]+\.[0-9]+\.([0-9]+)$/) ? (resolveInstanceOid(1) =~ /\.[0-9]+\.[0-9]+\.[0-9]+\.[0-9]+\.[0-9]+\.[0-9]+\.([0-9]+)$/)[0][1] : ''))
    event.setAlertKey(alertKey)
    def summary = "Mpls Ldp Init Session Threshold Exceeded" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(3)
    event.setEventType("1")
}
// --- Trap: mplsLdpPathVectorLimitMismatch (OID 1.3.6.1.2.1.10.166.4.2) ---
if (trapRuleName == "mplsLdpPathVectorLimitMismatch") {
    event.setAlertGroup("MPLS LDP Path Vector Limit Mismatch")
    def alertKey = "mplsLdpSessionEntry." + (((resolveInstanceOid(1) =~ /\.([0-9]+\.[0-9]+\.[0-9]+\.[0-9]+\.[0-9]+\.[0-9]+)\.[0-9]+$/) ? (resolveInstanceOid(1) =~ /\.([0-9]+\.[0-9]+\.[0-9]+\.[0-9]+\.[0-9]+\.[0-9]+)\.[0-9]+$/)[0][1] : '')) + "." + (((resolveInstanceOid(1) =~ /\.[0-9]+\.[0-9]+\.[0-9]+\.[0-9]+\.[0-9]+\.[0-9]+\.([0-9]+)$/) ? (resolveInstanceOid(1) =~ /\.[0-9]+\.[0-9]+\.[0-9]+\.[0-9]+\.[0-9]+\.[0-9]+\.([0-9]+)$/)[0][1] : '')) + "." + (((resolveInstanceOid(2) =~ /\.([0-9]+\.[0-9]+\.[0-9]+\.[0-9]+\.[0-9]+\.[0-9]+)$/) ? (resolveInstanceOid(2) =~ /\.([0-9]+\.[0-9]+\.[0-9]+\.[0-9]+\.[0-9]+\.[0-9]+)$/)[0][1] : ''))
    event.setAlertKey(alertKey)
    def summary = "Mpls Ldp Path Vector Limit Mismatch" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(3)
    event.setEventType("1")
}
// --- Trap: mplsLdpSessionUp (OID 1.3.6.1.2.1.10.166.4.3) ---
if (trapRuleName == "mplsLdpSessionUp") {
    event.setAlertGroup("MPLS LDP Session Status")
    def alertKey = "mplsLdpSessionEntry." + (((resolveInstanceOid(1) =~ /\.([0-9]+\.[0-9]+\.[0-9]+\.[0-9]+\.[0-9]+\.[0-9]+)\.[0-9]+\.[0-9]+\.[0-9]+\.[0-9]+\.[0-9]+\.[0-9]+\.[0-9]+$/) ? (resolveInstanceOid(1) =~ /\.([0-9]+\.[0-9]+\.[0-9]+\.[0-9]+\.[0-9]+\.[0-9]+)\.[0-9]+\.[0-9]+\.[0-9]+\.[0-9]+\.[0-9]+\.[0-9]+\.[0-9]+$/)[0][1] : '')) + "." + (((resolveInstanceOid(1) =~ /\.([0-9]+)\.[0-9]+\.[0-9]+\.[0-9]+\.[0-9]+\.[0-9]+\.[0-9]+$/) ? (resolveInstanceOid(1) =~ /\.([0-9]+)\.[0-9]+\.[0-9]+\.[0-9]+\.[0-9]+\.[0-9]+\.[0-9]+$/)[0][1] : '')) + "." + (((resolveInstanceOid(1) =~ /\.([0-9]+\.[0-9]+\.[0-9]+\.[0-9]+\.[0-9]+\.[0-9]+)$/) ? (resolveInstanceOid(1) =~ /\.([0-9]+\.[0-9]+\.[0-9]+\.[0-9]+\.[0-9]+\.[0-9]+)$/)[0][1] : ''))
    event.setAlertKey(alertKey)
    def summary = "Mpls Ldp Session Up" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    if (gf[1] == "1") {
        event.setSeverity(2)
        event.setEventType("1")
    }
    else if (gf[1] == "2") {
        event.setSeverity(2)
        event.setEventType("12")
    }
    else if (gf[1] == "3") {
        event.setSeverity(2)
        event.setEventType("12")
    }
    else if (gf[1] == "4") {
        event.setSeverity(2)
        event.setEventType("12")
    }
    else if (gf[1] == "5") {
        event.setSeverity(1)
        event.setEventType("2")
    }
    else if (true) {
        event.setSeverity(2)
        event.setEventType("1")
    }
}
// --- Trap: mplsLdpSessionDown (OID 1.3.6.1.2.1.10.166.4.4) ---
if (trapRuleName == "mplsLdpSessionDown") {
    event.setAlertGroup("MPLS LDP Session Status")
    def alertKey = "mplsLdpSessionEntry." + (((resolveInstanceOid(1) =~ /\.([0-9]+\.[0-9]+\.[0-9]+\.[0-9]+\.[0-9]+\.[0-9]+)\.[0-9]+\.[0-9]+\.[0-9]+\.[0-9]+\.[0-9]+\.[0-9]+\.[0-9]+$/) ? (resolveInstanceOid(1) =~ /\.([0-9]+\.[0-9]+\.[0-9]+\.[0-9]+\.[0-9]+\.[0-9]+)\.[0-9]+\.[0-9]+\.[0-9]+\.[0-9]+\.[0-9]+\.[0-9]+\.[0-9]+$/)[0][1] : '')) + "." + (((resolveInstanceOid(1) =~ /\.([0-9]+)\.[0-9]+\.[0-9]+\.[0-9]+\.[0-9]+\.[0-9]+\.[0-9]+$/) ? (resolveInstanceOid(1) =~ /\.([0-9]+)\.[0-9]+\.[0-9]+\.[0-9]+\.[0-9]+\.[0-9]+\.[0-9]+$/)[0][1] : '')) + "." + (((resolveInstanceOid(1) =~ /\.([0-9]+\.[0-9]+\.[0-9]+\.[0-9]+\.[0-9]+\.[0-9]+)$/) ? (resolveInstanceOid(1) =~ /\.([0-9]+\.[0-9]+\.[0-9]+\.[0-9]+\.[0-9]+\.[0-9]+)$/)[0][1] : ''))
    event.setAlertKey(alertKey)
    def summary = "Mpls Ldp Session Down" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    if (gf[1] == "1") {
        event.setSeverity(2)
        event.setEventType("1")
    }
    else if (gf[1] == "2") {
        event.setSeverity(2)
        event.setEventType("12")
    }
    else if (gf[1] == "3") {
        event.setSeverity(2)
        event.setEventType("12")
    }
    else if (gf[1] == "4") {
        event.setSeverity(2)
        event.setEventType("12")
    }
    else if (gf[1] == "5") {
        event.setSeverity(1)
        event.setEventType("2")
    }
    else if (true) {
        event.setSeverity(2)
        event.setEventType("1")
    }
}

if (event.getAgentType() == null || event.getAgentType().trim().isEmpty()) {
    event.setAgentType(metadata?.get("agentType")?.toString() ?: "generic")
}
def pairKey = [event.getDomainId(), event.getAgentType(), event.getNode(), event.getAlertGroup(), event.getAlertKey()]
                    .findAll { it != null && it.toString().trim() != "" }
                    .collect { it.toString().trim() }.join("|")
event.setIdentifier(pairKey + "|" + event.getEventType())

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
