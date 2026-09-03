/**
 * Auto-generated from OSPFV3-MIB.mib
 * Generated: 2026-08-24T18:28:32.019745800
 * Traps/Notifications (14): ospfv3VirtIfStateChange, ospfv3NbrStateChange, ospfv3VirtNbrStateChange, ospfv3IfConfigError, ospfv3VirtIfConfigError, ospfv3IfRxBadPacket, ospfv3VirtIfRxBadPacket, ospfv3LsdbOverflow, ospfv3LsdbApproachingOverflow, ospfv3IfStateChange, ospfv3NssaTranslatorStatusChange, ospfv3RestartStatusChange, ospfv3NbrRestartHelperStatusChange, ospfv3VirtNbrRestartHelperStatusChange
 *
 * Mapping rules:
 *   node       = trap source IP (rawEvent.sourceIp)
 *   alertGroup = trap/notification name
 *   summary    = all field key-value pairs concatenated
 */

import com.raysdata.cep.model.AlarmEvent
import com.raysdata.cep.model.EventType
import com.raysdata.cep.model.Severity

// ===== Trap OID -> definition mapping =====
// Key: fully resolved numeric OID, Value: [name, fields, fieldOids]
def trapMap = [:]

// ===== Name -> definition mapping (fallback for unresolved OIDs) =====
def trapNameMap = [:]

// --- ospfv3VirtIfStateChange (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.2.1.191.0.1
// Fields: ospfv3RouterId, ospfv3VirtIfState
// Description: An ospfv3VirtIfStateChange notification signifies that there has been a change in the state of an OSPFv3 virtual interface. This notification should be generated when the interface state regresses (e....
trapMap["1.3.6.1.2.1.191.0.1"] = [
    name: "ospfv3VirtIfStateChange",
    fields: ["ospfv3RouterId", "ospfv3VirtIfState"],
    fieldOids: ["ospfv3RouterId": "1.3.6.1.2.1.191.1.1.1", "ospfv3VirtIfState": "1.3.6.1.2.1.191.1.8.1.9"]
]

// --- ospfv3NbrStateChange (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.2.1.191.0.2
// Fields: ospfv3RouterId, ospfv3NbrState
// Description: An ospfv3NbrStateChange notification signifies that there has been a change in the state of a non-virtual OSPFv3 neighbor. This notification should be generated when the neighbor state regresses (e.g....
trapMap["1.3.6.1.2.1.191.0.2"] = [
    name: "ospfv3NbrStateChange",
    fields: ["ospfv3RouterId", "ospfv3NbrState"],
    fieldOids: ["ospfv3RouterId": "1.3.6.1.2.1.191.1.1.1", "ospfv3NbrState": "1.3.6.1.2.1.191.1.9.1.8"]
]

// --- ospfv3VirtNbrStateChange (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.2.1.191.0.3
// Fields: ospfv3RouterId, ospfv3VirtNbrState
// Description: An ospfv3VirtNbrStateChange notification signifies that there has been a change in the state of an OSPFv3 virtual neighbor. This notification should be generated when the neighbor state regresses (e.g...
trapMap["1.3.6.1.2.1.191.0.3"] = [
    name: "ospfv3VirtNbrStateChange",
    fields: ["ospfv3RouterId", "ospfv3VirtNbrState"],
    fieldOids: ["ospfv3RouterId": "1.3.6.1.2.1.191.1.1.1", "ospfv3VirtNbrState": "1.3.6.1.2.1.191.1.11.1.8"]
]

// --- ospfv3IfConfigError (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.2.1.191.0.4
// Fields: ospfv3RouterId, ospfv3IfState, ospfv3PacketSrc, ospfv3ConfigErrorType, ospfv3PacketType
// Description: An ospfv3IfConfigError notification signifies that a packet has been received on a non-virtual interface from a router whose configuration parameters conflict with this router's configuration paramete...
trapMap["1.3.6.1.2.1.191.0.4"] = [
    name: "ospfv3IfConfigError",
    fields: ["ospfv3RouterId", "ospfv3IfState", "ospfv3PacketSrc", "ospfv3ConfigErrorType", "ospfv3PacketType"],
    fieldOids: ["ospfv3RouterId": "1.3.6.1.2.1.191.1.1.1", "ospfv3IfState": "1.3.6.1.2.1.191.1.7.1.12", "ospfv3PacketSrc": "1.3.6.1.2.1.191.1.14.3", "ospfv3ConfigErrorType": "1.3.6.1.2.1.191.1.14.1", "ospfv3PacketType": "1.3.6.1.2.1.191.1.14.2"]
]

// --- ospfv3VirtIfConfigError (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.2.1.191.0.5
// Fields: ospfv3RouterId, ospfv3VirtIfState, ospfv3ConfigErrorType, ospfv3PacketType
// Description: An ospfv3VirtIfConfigError notification signifies that a packet has been received on a virtual interface from a router whose configuration parameters conflict with this router's configuration paramete...
trapMap["1.3.6.1.2.1.191.0.5"] = [
    name: "ospfv3VirtIfConfigError",
    fields: ["ospfv3RouterId", "ospfv3VirtIfState", "ospfv3ConfigErrorType", "ospfv3PacketType"],
    fieldOids: ["ospfv3RouterId": "1.3.6.1.2.1.191.1.1.1", "ospfv3VirtIfState": "1.3.6.1.2.1.191.1.8.1.9", "ospfv3ConfigErrorType": "1.3.6.1.2.1.191.1.14.1", "ospfv3PacketType": "1.3.6.1.2.1.191.1.14.2"]
]

// --- ospfv3IfRxBadPacket (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.2.1.191.0.6
// Fields: ospfv3RouterId, ospfv3IfState, ospfv3PacketSrc, ospfv3PacketType
// Description: An ospfv3IfRxBadPacket notification signifies that an OSPFv3 packet that cannot be parsed has been received on a non-virtual interface.
trapMap["1.3.6.1.2.1.191.0.6"] = [
    name: "ospfv3IfRxBadPacket",
    fields: ["ospfv3RouterId", "ospfv3IfState", "ospfv3PacketSrc", "ospfv3PacketType"],
    fieldOids: ["ospfv3RouterId": "1.3.6.1.2.1.191.1.1.1", "ospfv3IfState": "1.3.6.1.2.1.191.1.7.1.12", "ospfv3PacketSrc": "1.3.6.1.2.1.191.1.14.3", "ospfv3PacketType": "1.3.6.1.2.1.191.1.14.2"]
]

// --- ospfv3VirtIfRxBadPacket (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.2.1.191.0.7
// Fields: ospfv3RouterId, ospfv3VirtIfState, ospfv3PacketType
// Description: An ospfv3VirtIfRxBadPacket notification signifies that an OSPFv3 packet that cannot be parsed has been received on a virtual interface.
trapMap["1.3.6.1.2.1.191.0.7"] = [
    name: "ospfv3VirtIfRxBadPacket",
    fields: ["ospfv3RouterId", "ospfv3VirtIfState", "ospfv3PacketType"],
    fieldOids: ["ospfv3RouterId": "1.3.6.1.2.1.191.1.1.1", "ospfv3VirtIfState": "1.3.6.1.2.1.191.1.8.1.9", "ospfv3PacketType": "1.3.6.1.2.1.191.1.14.2"]
]

// --- ospfv3LsdbOverflow (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.2.1.191.0.8
// Fields: ospfv3RouterId, ospfv3ExtAreaLsdbLimit
// Description: An ospfv3LsdbOverflow notification signifies that the number of LSAs in the router's link state database has exceeded ospfv3ExtAreaLsdbLimit.
trapMap["1.3.6.1.2.1.191.0.8"] = [
    name: "ospfv3LsdbOverflow",
    fields: ["ospfv3RouterId", "ospfv3ExtAreaLsdbLimit"],
    fieldOids: ["ospfv3RouterId": "1.3.6.1.2.1.191.1.1.1", "ospfv3ExtAreaLsdbLimit": "1.3.6.1.2.1.191.1.1.11"]
]

// --- ospfv3LsdbApproachingOverflow (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.2.1.191.0.9
// Fields: ospfv3RouterId, ospfv3ExtAreaLsdbLimit
// Description: An ospfv3LsdbApproachingOverflow notification signifies that the number of LSAs in the router's link state database has exceeded ninety percent of ospfv3ExtAreaLsdbLimit.
trapMap["1.3.6.1.2.1.191.0.9"] = [
    name: "ospfv3LsdbApproachingOverflow",
    fields: ["ospfv3RouterId", "ospfv3ExtAreaLsdbLimit"],
    fieldOids: ["ospfv3RouterId": "1.3.6.1.2.1.191.1.1.1", "ospfv3ExtAreaLsdbLimit": "1.3.6.1.2.1.191.1.1.11"]
]

// --- ospfv3IfStateChange (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.2.1.191.0.10
// Fields: ospfv3RouterId, ospfv3IfState
// Description: An ospfv3IfStateChange notification signifies that there has been a change in the state of a non-virtual OSPFv3 interface. This notification should be generated when the interface state regresses (e.g...
trapMap["1.3.6.1.2.1.191.0.10"] = [
    name: "ospfv3IfStateChange",
    fields: ["ospfv3RouterId", "ospfv3IfState"],
    fieldOids: ["ospfv3RouterId": "1.3.6.1.2.1.191.1.1.1", "ospfv3IfState": "1.3.6.1.2.1.191.1.7.1.12"]
]

// --- ospfv3NssaTranslatorStatusChange (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.2.1.191.0.11
// Fields: ospfv3RouterId, ospfv3AreaNssaTranslatorState
// Description: An ospfv3NssaTranslatorStatusChange notification indicates that there has been a change in the router's ability to translate OSPFv3 NSSA LSAs into OSPFv3 External LSAs. This notification should be gen...
trapMap["1.3.6.1.2.1.191.0.11"] = [
    name: "ospfv3NssaTranslatorStatusChange",
    fields: ["ospfv3RouterId", "ospfv3AreaNssaTranslatorState"],
    fieldOids: ["ospfv3RouterId": "1.3.6.1.2.1.191.1.1.1", "ospfv3AreaNssaTranslatorState": "1.3.6.1.2.1.191.1.2.1.12"]
]

// --- ospfv3RestartStatusChange (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.2.1.191.0.12
// Fields: ospfv3RouterId, ospfv3RestartStatus, ospfv3RestartInterval, ospfv3RestartExitReason
// Description: An ospfv3RestartStatusChange notification signifies that there has been a change in the graceful restart state for the router. This notification should be generated when the router restart status chan...
trapMap["1.3.6.1.2.1.191.0.12"] = [
    name: "ospfv3RestartStatusChange",
    fields: ["ospfv3RouterId", "ospfv3RestartStatus", "ospfv3RestartInterval", "ospfv3RestartExitReason"],
    fieldOids: ["ospfv3RouterId": "1.3.6.1.2.1.191.1.1.1", "ospfv3RestartStatus": "1.3.6.1.2.1.191.1.1.18", "ospfv3RestartInterval": "1.3.6.1.2.1.191.1.1.16", "ospfv3RestartExitReason": "1.3.6.1.2.1.191.1.1.20"]
]

// --- ospfv3NbrRestartHelperStatusChange (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.2.1.191.0.13
// Fields: ospfv3RouterId, ospfv3NbrRestartHelperStatus, ospfv3NbrRestartHelperAge, ospfv3NbrRestartHelperExitReason
// Description: An ospfv3NbrRestartHelperStatusChange notification signifies that there has been a change in the graceful restart helper state for the neighbor. This notification should be generated when the neighbor...
trapMap["1.3.6.1.2.1.191.0.13"] = [
    name: "ospfv3NbrRestartHelperStatusChange",
    fields: ["ospfv3RouterId", "ospfv3NbrRestartHelperStatus", "ospfv3NbrRestartHelperAge", "ospfv3NbrRestartHelperExitReason"],
    fieldOids: ["ospfv3RouterId": "1.3.6.1.2.1.191.1.1.1", "ospfv3NbrRestartHelperStatus": "1.3.6.1.2.1.191.1.9.1.13", "ospfv3NbrRestartHelperAge": "1.3.6.1.2.1.191.1.9.1.14", "ospfv3NbrRestartHelperExitReason": "1.3.6.1.2.1.191.1.9.1.15"]
]

// --- ospfv3VirtNbrRestartHelperStatusChange (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.2.1.191.0.14
// Fields: ospfv3RouterId, ospfv3VirtNbrRestartHelperStatus, ospfv3VirtNbrRestartHelperAge, ospfv3VirtNbrRestartHelperExitReason
// Description: An ospfv3VirtNbrRestartHelperStatusChange notification signifies that there has been a change in the graceful restart helper state for the virtual neighbor. This notification should be generated when ...
trapMap["1.3.6.1.2.1.191.0.14"] = [
    name: "ospfv3VirtNbrRestartHelperStatusChange",
    fields: ["ospfv3RouterId", "ospfv3VirtNbrRestartHelperStatus", "ospfv3VirtNbrRestartHelperAge", "ospfv3VirtNbrRestartHelperExitReason"],
    fieldOids: ["ospfv3RouterId": "1.3.6.1.2.1.191.1.1.1", "ospfv3VirtNbrRestartHelperStatus": "1.3.6.1.2.1.191.1.11.1.13", "ospfv3VirtNbrRestartHelperAge": "1.3.6.1.2.1.191.1.11.1.14", "ospfv3VirtNbrRestartHelperExitReason": "1.3.6.1.2.1.191.1.11.1.15"]
]

// ===== Parsing logic =====

// Set to true to enable diagnostic logging for this MIB parser
DEBUG = false

LOG_PREFIX = "[OSPFV3-MIB]"
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
event.setStatus("UnAcked")
event.setEventClass("snmp_trap")
event.setSpecificTrap(trapOid ?: "")
event.setOriginalSeverity(event.getSeverity())
event.setOriginalSummary(event.getSummary())

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
