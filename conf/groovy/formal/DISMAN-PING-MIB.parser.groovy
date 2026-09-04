/**
 * Auto-generated from DISMAN-PING-MIB.mib
 * Generated: 2026-08-25T16:46:59.209004
 * Traps/Notifications (3): pingProbeFailed, pingTestFailed, pingTestCompleted
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

// --- pingProbeFailed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.2.1.80.0.1
// Fields: pingCtlTargetAddressType, pingCtlTargetAddress, pingResultsOperStatus, pingResultsIpTargetAddressType, pingResultsIpTargetAddress, pingResultsMinRtt, pingResultsMaxRtt, pingResultsAverageRtt, pingResultsProbeResponses, pingResultsSentProbes, pingResultsRttSumOfSquares, pingResultsLastGoodProbe
// Description: Generated when a probe failure is detected, when the corresponding pingCtlTrapGeneration object is set to probeFailure(0), subject to the value of pingCtlTrapProbeFailureFilter. The object pingCtlTrap...
trapMap["1.3.6.1.2.1.80.0.1"] = [
    name: "pingProbeFailed",
    fields: ["pingCtlTargetAddressType", "pingCtlTargetAddress", "pingResultsOperStatus", "pingResultsIpTargetAddressType", "pingResultsIpTargetAddress", "pingResultsMinRtt", "pingResultsMaxRtt", "pingResultsAverageRtt", "pingResultsProbeResponses", "pingResultsSentProbes", "pingResultsRttSumOfSquares", "pingResultsLastGoodProbe"],
    fieldOids: ["pingCtlTargetAddressType": "1.3.6.1.2.1.80.1.2.1.3", "pingCtlTargetAddress": "1.3.6.1.2.1.80.1.2.1.4", "pingResultsOperStatus": "1.3.6.1.2.1.80.1.3.1.1", "pingResultsIpTargetAddressType": "1.3.6.1.2.1.80.1.3.1.2", "pingResultsIpTargetAddress": "1.3.6.1.2.1.80.1.3.1.3", "pingResultsMinRtt": "1.3.6.1.2.1.80.1.3.1.4", "pingResultsMaxRtt": "1.3.6.1.2.1.80.1.3.1.5", "pingResultsAverageRtt": "1.3.6.1.2.1.80.1.3.1.6", "pingResultsProbeResponses": "1.3.6.1.2.1.80.1.3.1.7", "pingResultsSentProbes": "1.3.6.1.2.1.80.1.3.1.8", "pingResultsRttSumOfSquares": "1.3.6.1.2.1.80.1.3.1.9", "pingResultsLastGoodProbe": "1.3.6.1.2.1.80.1.3.1.10"]
]

// --- pingTestFailed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.2.1.80.0.2
// Fields: pingCtlTargetAddressType, pingCtlTargetAddress, pingResultsOperStatus, pingResultsIpTargetAddressType, pingResultsIpTargetAddress, pingResultsMinRtt, pingResultsMaxRtt, pingResultsAverageRtt, pingResultsProbeResponses, pingResultsSentProbes, pingResultsRttSumOfSquares, pingResultsLastGoodProbe
// Description: Generated when a ping test is determined to have failed, when the corresponding pingCtlTrapGeneration object is set to testFailure(1). In this instance, pingCtlTrapTestFailureFilter should specify the...
trapMap["1.3.6.1.2.1.80.0.2"] = [
    name: "pingTestFailed",
    fields: ["pingCtlTargetAddressType", "pingCtlTargetAddress", "pingResultsOperStatus", "pingResultsIpTargetAddressType", "pingResultsIpTargetAddress", "pingResultsMinRtt", "pingResultsMaxRtt", "pingResultsAverageRtt", "pingResultsProbeResponses", "pingResultsSentProbes", "pingResultsRttSumOfSquares", "pingResultsLastGoodProbe"],
    fieldOids: ["pingCtlTargetAddressType": "1.3.6.1.2.1.80.1.2.1.3", "pingCtlTargetAddress": "1.3.6.1.2.1.80.1.2.1.4", "pingResultsOperStatus": "1.3.6.1.2.1.80.1.3.1.1", "pingResultsIpTargetAddressType": "1.3.6.1.2.1.80.1.3.1.2", "pingResultsIpTargetAddress": "1.3.6.1.2.1.80.1.3.1.3", "pingResultsMinRtt": "1.3.6.1.2.1.80.1.3.1.4", "pingResultsMaxRtt": "1.3.6.1.2.1.80.1.3.1.5", "pingResultsAverageRtt": "1.3.6.1.2.1.80.1.3.1.6", "pingResultsProbeResponses": "1.3.6.1.2.1.80.1.3.1.7", "pingResultsSentProbes": "1.3.6.1.2.1.80.1.3.1.8", "pingResultsRttSumOfSquares": "1.3.6.1.2.1.80.1.3.1.9", "pingResultsLastGoodProbe": "1.3.6.1.2.1.80.1.3.1.10"]
]

// --- pingTestCompleted (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.2.1.80.0.3
// Fields: pingCtlTargetAddressType, pingCtlTargetAddress, pingResultsOperStatus, pingResultsIpTargetAddressType, pingResultsIpTargetAddress, pingResultsMinRtt, pingResultsMaxRtt, pingResultsAverageRtt, pingResultsProbeResponses, pingResultsSentProbes, pingResultsRttSumOfSquares, pingResultsLastGoodProbe
// Description: Generated at the completion of a ping test when the corresponding pingCtlTrapGeneration object has the testCompletion(2) bit set.
trapMap["1.3.6.1.2.1.80.0.3"] = [
    name: "pingTestCompleted",
    fields: ["pingCtlTargetAddressType", "pingCtlTargetAddress", "pingResultsOperStatus", "pingResultsIpTargetAddressType", "pingResultsIpTargetAddress", "pingResultsMinRtt", "pingResultsMaxRtt", "pingResultsAverageRtt", "pingResultsProbeResponses", "pingResultsSentProbes", "pingResultsRttSumOfSquares", "pingResultsLastGoodProbe"],
    fieldOids: ["pingCtlTargetAddressType": "1.3.6.1.2.1.80.1.2.1.3", "pingCtlTargetAddress": "1.3.6.1.2.1.80.1.2.1.4", "pingResultsOperStatus": "1.3.6.1.2.1.80.1.3.1.1", "pingResultsIpTargetAddressType": "1.3.6.1.2.1.80.1.3.1.2", "pingResultsIpTargetAddress": "1.3.6.1.2.1.80.1.3.1.3", "pingResultsMinRtt": "1.3.6.1.2.1.80.1.3.1.4", "pingResultsMaxRtt": "1.3.6.1.2.1.80.1.3.1.5", "pingResultsAverageRtt": "1.3.6.1.2.1.80.1.3.1.6", "pingResultsProbeResponses": "1.3.6.1.2.1.80.1.3.1.7", "pingResultsSentProbes": "1.3.6.1.2.1.80.1.3.1.8", "pingResultsRttSumOfSquares": "1.3.6.1.2.1.80.1.3.1.9", "pingResultsLastGoodProbe": "1.3.6.1.2.1.80.1.3.1.10"]
]

// ===== Lookup tables (inlined) =====
def lookupTables = [:]

// ===== Parsing logic =====

// Set to true to enable diagnostic logging for this MIB parser
DEBUG = false

LOG_PREFIX = "[DISMAN-PING-MIB]"
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
// --- Trap: pingProbeFailed (OID 1.3.6.1.2.1.80.1) ---
if (trapRuleName == "pingProbeFailed") {
    event.setAlertGroup("Ping Probe Status")
    def alertKey = "pingCtlEntry." + ((resolveInstanceOid(1) =~ /3\.6\.1\.2\.1\.80\.1\.2\.1\.3\.(.*)$/) ? (resolveInstanceOid(1) =~ /3\.6\.1\.2\.1\.80\.1\.2\.1\.3\.(.*)$/)[0][1] : '')
    event.setAlertKey(alertKey)
    def summary = "Ping Probe Failed" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(2)
    event.setEventType("1")
}
// --- Trap: pingTestFailed (OID 1.3.6.1.2.1.80.2) ---
if (trapRuleName == "pingTestFailed") {
    event.setAlertGroup("Ping Test Status")
    def alertKey = "pingCtlEntry." + ((resolveInstanceOid(1) =~ /3\.6\.1\.2\.1\.80\.1\.2\.1\.3\.(.*)$/) ? (resolveInstanceOid(1) =~ /3\.6\.1\.2\.1\.80\.1\.2\.1\.3\.(.*)$/)[0][1] : '')
    event.setAlertKey(alertKey)
    def summary = "Ping Test Failed" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(3)
    event.setEventType("1")
}
// --- Trap: pingTestCompleted (OID 1.3.6.1.2.1.80.3) ---
if (trapRuleName == "pingTestCompleted") {
    event.setAlertGroup("Ping Test Status")
    def alertKey = "pingCtlEntry." + ((resolveInstanceOid(1) =~ /3\.6\.1\.2\.1\.80\.1\.2\.1\.3\.(.*)$/) ? (resolveInstanceOid(1) =~ /3\.6\.1\.2\.1\.80\.1\.2\.1\.3\.(.*)$/)[0][1] : '')
    event.setAlertKey(alertKey)
    def summary = "Ping Test Completed" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
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
