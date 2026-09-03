/**
 * Auto-generated from DISMAN-TRACEROUTE-MIB.mib
 * Generated: 2026-08-25T16:46:59.251378500
 * Traps/Notifications (3): traceRoutePathChange, traceRouteTestFailed, traceRouteTestCompleted
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

// --- traceRoutePathChange (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.2.1.81.0.1
// Fields: traceRouteCtlTargetAddressType, traceRouteCtlTargetAddress, traceRouteResultsIpTgtAddrType, traceRouteResultsIpTgtAddr
// Description: The path to a target has changed.
trapMap["1.3.6.1.2.1.81.0.1"] = [
    name: "traceRoutePathChange",
    fields: ["traceRouteCtlTargetAddressType", "traceRouteCtlTargetAddress", "traceRouteResultsIpTgtAddrType", "traceRouteResultsIpTgtAddr"],
    fieldOids: ["traceRouteCtlTargetAddressType": "1.3.6.1.2.1.81.1.2.1.3", "traceRouteCtlTargetAddress": "1.3.6.1.2.1.81.1.2.1.4", "traceRouteResultsIpTgtAddrType": "1.3.6.1.2.1.81.1.3.1.4", "traceRouteResultsIpTgtAddr": "1.3.6.1.2.1.81.1.3.1.5"]
]

// --- traceRouteTestFailed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.2.1.81.0.2
// Fields: traceRouteCtlTargetAddressType, traceRouteCtlTargetAddress, traceRouteResultsIpTgtAddrType, traceRouteResultsIpTgtAddr
// Description: Could not determine the path to a target.
trapMap["1.3.6.1.2.1.81.0.2"] = [
    name: "traceRouteTestFailed",
    fields: ["traceRouteCtlTargetAddressType", "traceRouteCtlTargetAddress", "traceRouteResultsIpTgtAddrType", "traceRouteResultsIpTgtAddr"],
    fieldOids: ["traceRouteCtlTargetAddressType": "1.3.6.1.2.1.81.1.2.1.3", "traceRouteCtlTargetAddress": "1.3.6.1.2.1.81.1.2.1.4", "traceRouteResultsIpTgtAddrType": "1.3.6.1.2.1.81.1.3.1.4", "traceRouteResultsIpTgtAddr": "1.3.6.1.2.1.81.1.3.1.5"]
]

// --- traceRouteTestCompleted (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.2.1.81.0.3
// Fields: traceRouteCtlTargetAddressType, traceRouteCtlTargetAddress, traceRouteResultsIpTgtAddrType, traceRouteResultsIpTgtAddr
// Description: The path to a target has just been determined.
trapMap["1.3.6.1.2.1.81.0.3"] = [
    name: "traceRouteTestCompleted",
    fields: ["traceRouteCtlTargetAddressType", "traceRouteCtlTargetAddress", "traceRouteResultsIpTgtAddrType", "traceRouteResultsIpTgtAddr"],
    fieldOids: ["traceRouteCtlTargetAddressType": "1.3.6.1.2.1.81.1.2.1.3", "traceRouteCtlTargetAddress": "1.3.6.1.2.1.81.1.2.1.4", "traceRouteResultsIpTgtAddrType": "1.3.6.1.2.1.81.1.3.1.4", "traceRouteResultsIpTgtAddr": "1.3.6.1.2.1.81.1.3.1.5"]
]

// ===== Lookup tables (inlined) =====
def lookupTables = [:]

// ===== Parsing logic =====

// Set to true to enable diagnostic logging for this MIB parser
DEBUG = false

LOG_PREFIX = "[DISMAN-TRACEROUTE-MIB]"
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
// --- Trap: traceRoutePathChange (OID 1.3.6.1.2.1.81.1) ---
if (trapRuleName == "traceRoutePathChange") {
    event.setAlertGroup("Traceroute Path Status")
    def alertKey = "traceRouteCtlEntry." + ((resolveInstanceOid(1) =~ /3\.6\.1\.2\.1\.81\.1\.2\.1\.3\.(.*)$/) ? (resolveInstanceOid(1) =~ /3\.6\.1\.2\.1\.81\.1\.2\.1\.3\.(.*)$/)[0][1] : '') + " ( on " + Node + " )"
    event.setAlertKey(alertKey)
    def summary = "Trace Route Path Change" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(2)
    event.setEventType("13")
}
// --- Trap: traceRouteTestFailed (OID 1.3.6.1.2.1.81.2) ---
if (trapRuleName == "traceRouteTestFailed") {
    event.setAlertGroup("Traceroute Path Status")
    def alertKey = "traceRouteCtlEntry." + ((resolveInstanceOid(1) =~ /\.[0-9]+\.(.*)$/) ? (resolveInstanceOid(1) =~ /\.[0-9]+\.(.*)$/)[0][1] : '') + " ( on " + Node + " )"
    event.setAlertKey(alertKey)
    def summary = "Trace Route Test Failed" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(3)
    event.setEventType("1")
}
// --- Trap: traceRouteTestCompleted (OID 1.3.6.1.2.1.81.3) ---
if (trapRuleName == "traceRouteTestCompleted") {
    event.setAlertGroup("Traceroute Path Status")
    def alertKey = "traceRouteCtlEntry." + ((resolveInstanceOid(1) =~ /\.[0-9]+\.(.*)$/) ? (resolveInstanceOid(1) =~ /\.[0-9]+\.(.*)$/)[0][1] : '') + " ( on " + Node + " )"
    event.setAlertKey(alertKey)
    def summary = "Trace Route Test Completed" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(1)
    event.setEventType("2")
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
