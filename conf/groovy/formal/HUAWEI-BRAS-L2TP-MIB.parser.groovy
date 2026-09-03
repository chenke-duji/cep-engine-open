/**
 * Auto-generated from HUAWEI-BRAS-L2TP-MIB.mib
 * Generated: 2026-08-24T18:28:29.057483400
 * Traps/Notifications (10): hwL2tpTunnelUpOrDown, hwL2tpUserInfoBackupFail, hwLacTunnelExceedThreshold, hwLacTunnelExceedThresholdResume, hwLacTunnelExceed, hwLacTunnelExceedResume, hwLnsSlotTunnelExceedThreshold, hwLnsSlotTunnelExceedThresholdResume, hwLnsSlotTunnelExceed, hwLnsSlotTunnelExceedResume
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

// --- hwL2tpTunnelUpOrDown (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.40.3.2.2.0.1
// Fields: hwL2tpTunnelID, hwL2tpPeerName, hwL2tpPeerIp, hwL2tpTunnelStatus, hwL2tpTunnelDownReason, hwL2tpRemoteTunnelID
// Description: 1 Notice/Trap name: L2tp Tunnel is Up Or Down. 2 Notice/Trap generation cause: L2tp tunnel is up or down. 3 Repair suggestions: If the tunnel is down, please check out whether there is a error.
trapMap["1.3.6.1.4.1.2011.5.25.40.3.2.2.0.1"] = [
    name: "hwL2tpTunnelUpOrDown",
    fields: ["hwL2tpTunnelID", "hwL2tpPeerName", "hwL2tpPeerIp", "hwL2tpTunnelStatus", "hwL2tpTunnelDownReason", "hwL2tpRemoteTunnelID"],
    fieldOids: ["hwL2tpTunnelID": "1.3.6.1.4.1.2011.5.25.40.3.2.1.1", "hwL2tpPeerName": "1.3.6.1.4.1.2011.5.25.40.3.2.1.2", "hwL2tpPeerIp": "1.3.6.1.4.1.2011.5.25.40.3.2.1.3", "hwL2tpTunnelStatus": "1.3.6.1.4.1.2011.5.25.40.3.2.1.4", "hwL2tpTunnelDownReason": "1.3.6.1.4.1.2011.5.25.40.3.2.1.5", "hwL2tpRemoteTunnelID": "1.3.6.1.4.1.2011.5.25.40.3.2.1.6"]
]

// --- hwL2tpUserInfoBackupFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.40.3.2.2.0.2
// Fields: hwL2tpSlot, hwL2tpTunnelID, hwL2tpSessionID, hwL2tpLocalIP, hwL2tpPeerIp, hwL2tpBackupFailReason
// Description: Failed to add L2TP backup user.
trapMap["1.3.6.1.4.1.2011.5.25.40.3.2.2.0.2"] = [
    name: "hwL2tpUserInfoBackupFail",
    fields: ["hwL2tpSlot", "hwL2tpTunnelID", "hwL2tpSessionID", "hwL2tpLocalIP", "hwL2tpPeerIp", "hwL2tpBackupFailReason"],
    fieldOids: ["hwL2tpSlot": "1.3.6.1.4.1.2011.5.25.40.3.2.1.8", "hwL2tpTunnelID": "1.3.6.1.4.1.2011.5.25.40.3.2.1.1", "hwL2tpSessionID": "1.3.6.1.4.1.2011.5.25.40.3.2.1.10", "hwL2tpLocalIP": "1.3.6.1.4.1.2011.5.25.40.3.2.1.7", "hwL2tpPeerIp": "1.3.6.1.4.1.2011.5.25.40.3.2.1.3", "hwL2tpBackupFailReason": "1.3.6.1.4.1.2011.5.25.40.3.2.1.9"]
]

// --- hwLacTunnelExceedThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.40.3.2.2.0.3
// Fields: hwL2tpTunnelUsedNumber, hwL2tpTunnelMaxNumber, hwL2tpTunnelThreshold
// Description: The number of LAC tunnels will reach the specification threshold.
trapMap["1.3.6.1.4.1.2011.5.25.40.3.2.2.0.3"] = [
    name: "hwLacTunnelExceedThreshold",
    fields: ["hwL2tpTunnelUsedNumber", "hwL2tpTunnelMaxNumber", "hwL2tpTunnelThreshold"],
    fieldOids: ["hwL2tpTunnelUsedNumber": "1.3.6.1.4.1.2011.5.25.40.3.2.1.13", "hwL2tpTunnelMaxNumber": "1.3.6.1.4.1.2011.5.25.40.3.2.1.14", "hwL2tpTunnelThreshold": "1.3.6.1.4.1.2011.5.25.40.3.2.1.12"]
]

// --- hwLacTunnelExceedThresholdResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.40.3.2.2.0.4
// Fields: hwL2tpTunnelUsedNumber, hwL2tpTunnelMaxNumber, hwL2tpTunnelThreshold
// Description: The number of LAC tunnels does not reach the specification threshold.
trapMap["1.3.6.1.4.1.2011.5.25.40.3.2.2.0.4"] = [
    name: "hwLacTunnelExceedThresholdResume",
    fields: ["hwL2tpTunnelUsedNumber", "hwL2tpTunnelMaxNumber", "hwL2tpTunnelThreshold"],
    fieldOids: ["hwL2tpTunnelUsedNumber": "1.3.6.1.4.1.2011.5.25.40.3.2.1.13", "hwL2tpTunnelMaxNumber": "1.3.6.1.4.1.2011.5.25.40.3.2.1.14", "hwL2tpTunnelThreshold": "1.3.6.1.4.1.2011.5.25.40.3.2.1.12"]
]

// --- hwLacTunnelExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.40.3.2.2.0.5
// Fields: hwL2tpTunnelUsedNumber, hwL2tpTunnelMaxNumber, hwL2tpTunnelThreshold
// Description: The number of LAC tunnels exceeds the specification.
trapMap["1.3.6.1.4.1.2011.5.25.40.3.2.2.0.5"] = [
    name: "hwLacTunnelExceed",
    fields: ["hwL2tpTunnelUsedNumber", "hwL2tpTunnelMaxNumber", "hwL2tpTunnelThreshold"],
    fieldOids: ["hwL2tpTunnelUsedNumber": "1.3.6.1.4.1.2011.5.25.40.3.2.1.13", "hwL2tpTunnelMaxNumber": "1.3.6.1.4.1.2011.5.25.40.3.2.1.14", "hwL2tpTunnelThreshold": "1.3.6.1.4.1.2011.5.25.40.3.2.1.12"]
]

// --- hwLacTunnelExceedResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.40.3.2.2.0.6
// Fields: hwL2tpTunnelUsedNumber, hwL2tpTunnelMaxNumber, hwL2tpTunnelThreshold
// Description: The number of LAC tunnels does not exceed the specification.
trapMap["1.3.6.1.4.1.2011.5.25.40.3.2.2.0.6"] = [
    name: "hwLacTunnelExceedResume",
    fields: ["hwL2tpTunnelUsedNumber", "hwL2tpTunnelMaxNumber", "hwL2tpTunnelThreshold"],
    fieldOids: ["hwL2tpTunnelUsedNumber": "1.3.6.1.4.1.2011.5.25.40.3.2.1.13", "hwL2tpTunnelMaxNumber": "1.3.6.1.4.1.2011.5.25.40.3.2.1.14", "hwL2tpTunnelThreshold": "1.3.6.1.4.1.2011.5.25.40.3.2.1.12"]
]

// --- hwLnsSlotTunnelExceedThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.40.3.2.2.0.7
// Fields: hwL2tpSlotId, hwL2tpTunnelUsedNumber, hwL2tpTunnelMaxNumber, hwL2tpTunnelThreshold
// Description: The number of LNS tunnels will reach the specification threshold.
trapMap["1.3.6.1.4.1.2011.5.25.40.3.2.2.0.7"] = [
    name: "hwLnsSlotTunnelExceedThreshold",
    fields: ["hwL2tpSlotId", "hwL2tpTunnelUsedNumber", "hwL2tpTunnelMaxNumber", "hwL2tpTunnelThreshold"],
    fieldOids: ["hwL2tpSlotId": "1.3.6.1.4.1.2011.5.25.40.3.2.1.11", "hwL2tpTunnelUsedNumber": "1.3.6.1.4.1.2011.5.25.40.3.2.1.13", "hwL2tpTunnelMaxNumber": "1.3.6.1.4.1.2011.5.25.40.3.2.1.14", "hwL2tpTunnelThreshold": "1.3.6.1.4.1.2011.5.25.40.3.2.1.12"]
]

// --- hwLnsSlotTunnelExceedThresholdResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.40.3.2.2.0.8
// Fields: hwL2tpSlotId, hwL2tpTunnelUsedNumber, hwL2tpTunnelMaxNumber, hwL2tpTunnelThreshold
// Description: The number of LNS tunnels does not reach the specification threshold.
trapMap["1.3.6.1.4.1.2011.5.25.40.3.2.2.0.8"] = [
    name: "hwLnsSlotTunnelExceedThresholdResume",
    fields: ["hwL2tpSlotId", "hwL2tpTunnelUsedNumber", "hwL2tpTunnelMaxNumber", "hwL2tpTunnelThreshold"],
    fieldOids: ["hwL2tpSlotId": "1.3.6.1.4.1.2011.5.25.40.3.2.1.11", "hwL2tpTunnelUsedNumber": "1.3.6.1.4.1.2011.5.25.40.3.2.1.13", "hwL2tpTunnelMaxNumber": "1.3.6.1.4.1.2011.5.25.40.3.2.1.14", "hwL2tpTunnelThreshold": "1.3.6.1.4.1.2011.5.25.40.3.2.1.12"]
]

// --- hwLnsSlotTunnelExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.40.3.2.2.0.9
// Fields: hwL2tpSlotId, hwL2tpTunnelUsedNumber, hwL2tpTunnelMaxNumber, hwL2tpTunnelThreshold
// Description: The number of LNS tunnels exceeds the specification.
trapMap["1.3.6.1.4.1.2011.5.25.40.3.2.2.0.9"] = [
    name: "hwLnsSlotTunnelExceed",
    fields: ["hwL2tpSlotId", "hwL2tpTunnelUsedNumber", "hwL2tpTunnelMaxNumber", "hwL2tpTunnelThreshold"],
    fieldOids: ["hwL2tpSlotId": "1.3.6.1.4.1.2011.5.25.40.3.2.1.11", "hwL2tpTunnelUsedNumber": "1.3.6.1.4.1.2011.5.25.40.3.2.1.13", "hwL2tpTunnelMaxNumber": "1.3.6.1.4.1.2011.5.25.40.3.2.1.14", "hwL2tpTunnelThreshold": "1.3.6.1.4.1.2011.5.25.40.3.2.1.12"]
]

// --- hwLnsSlotTunnelExceedResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.40.3.2.2.0.10
// Fields: hwL2tpSlotId, hwL2tpTunnelUsedNumber, hwL2tpTunnelMaxNumber, hwL2tpTunnelThreshold
// Description: The number of LNS tunnels does not exceed the specification.
trapMap["1.3.6.1.4.1.2011.5.25.40.3.2.2.0.10"] = [
    name: "hwLnsSlotTunnelExceedResume",
    fields: ["hwL2tpSlotId", "hwL2tpTunnelUsedNumber", "hwL2tpTunnelMaxNumber", "hwL2tpTunnelThreshold"],
    fieldOids: ["hwL2tpSlotId": "1.3.6.1.4.1.2011.5.25.40.3.2.1.11", "hwL2tpTunnelUsedNumber": "1.3.6.1.4.1.2011.5.25.40.3.2.1.13", "hwL2tpTunnelMaxNumber": "1.3.6.1.4.1.2011.5.25.40.3.2.1.14", "hwL2tpTunnelThreshold": "1.3.6.1.4.1.2011.5.25.40.3.2.1.12"]
]

// ===== Parsing logic =====

// Set to true to enable diagnostic logging for this MIB parser
DEBUG = false

LOG_PREFIX = "[HUAWEI-BRAS-L2TP-MIB]"
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
