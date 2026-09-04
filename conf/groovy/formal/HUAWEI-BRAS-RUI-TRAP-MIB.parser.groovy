/**
 * Auto-generated from HUAWEI-BRAS-RUI-TRAP-MIB.mib
 * Generated: 2026-08-24T18:28:29.096553900
 * Traps/Notifications (14): hwBrasRbsConnectErr, hwBrasRbsConnectErrResume, hwBrasRbsSyncErr, hwBrasRbsSyncErrResume, hwBrasRbsTcpStateErr, hwBrasRbsTcpStateErrResume, hwBrasRuiTriggerErr, hwBrasRuiTriggerErrResume, hwBrasRbsProtDown, hwBrasRbsProtDownResume, hwBrasRbpRoleAbnormal, hwBrasRbpRoleAbnormalResume, hwBrasRuiConfigInconsistent, hwBrasRuiConfigConsistent
 *
 * Mapping rules:
 *   node       = trap source IP (rawEvent.sourceIp)
 *   alertGroup = trap/notification name
 *   summary    = all field key-value pairs concatenated
 */

import com.dujitech.cep.model.AlarmEvent
import com.dujitech.cep.model.EventType
import com.dujitech.cep.model.Severity

// ===== Trap OID -> definition mapping =====
// Key: fully resolved numeric OID, Value: [name, fields, fieldOids]
def trapMap = [:]

// ===== Name -> definition mapping (fallback for unresolved OIDs) =====
def trapNameMap = [:]

// --- hwBrasRbsConnectErr (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.361.2.1
// Fields: hwBrasRbsName
// Description: RBS heartbeat signals were abnormal.
trapMap["1.3.6.1.4.1.2011.5.25.361.2.1"] = [
    name: "hwBrasRbsConnectErr",
    fields: ["hwBrasRbsName"],
    fieldOids: ["hwBrasRbsName": "1.3.6.1.4.1.2011.5.25.361.1.3"]
]

// --- hwBrasRbsConnectErrResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.361.2.2
// Fields: hwBrasRbsName
// Description: RBS heartbeat recovers.
trapMap["1.3.6.1.4.1.2011.5.25.361.2.2"] = [
    name: "hwBrasRbsConnectErrResume",
    fields: ["hwBrasRbsName"],
    fieldOids: ["hwBrasRbsName": "1.3.6.1.4.1.2011.5.25.361.1.3"]
]

// --- hwBrasRbsSyncErr (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.361.2.3
// Fields: hwBrasRbsName, hwBrasRbsSynTime, hwBrasRbsSynState
// Description: Batch backup between the master and backup devices persisted for a long time.
trapMap["1.3.6.1.4.1.2011.5.25.361.2.3"] = [
    name: "hwBrasRbsSyncErr",
    fields: ["hwBrasRbsName", "hwBrasRbsSynTime", "hwBrasRbsSynState"],
    fieldOids: ["hwBrasRbsName": "1.3.6.1.4.1.2011.5.25.361.1.3", "hwBrasRbsSynTime": "1.3.6.1.4.1.2011.5.25.361.1.1", "hwBrasRbsSynState": "1.3.6.1.4.1.2011.5.25.361.1.2"]
]

// --- hwBrasRbsSyncErrResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.361.2.4
// Fields: hwBrasRbsName, hwBrasRbsSynTime, hwBrasRbsSynState
// Description: RBS batch backup ended.
trapMap["1.3.6.1.4.1.2011.5.25.361.2.4"] = [
    name: "hwBrasRbsSyncErrResume",
    fields: ["hwBrasRbsName", "hwBrasRbsSynTime", "hwBrasRbsSynState"],
    fieldOids: ["hwBrasRbsName": "1.3.6.1.4.1.2011.5.25.361.1.3", "hwBrasRbsSynTime": "1.3.6.1.4.1.2011.5.25.361.1.1", "hwBrasRbsSynState": "1.3.6.1.4.1.2011.5.25.361.1.2"]
]

// --- hwBrasRbsTcpStateErr (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.361.2.5
// Fields: hwBrasRbsName
// Description: The TCP connection of the BRAS RBS component on the slave main control board was in the connected state.
trapMap["1.3.6.1.4.1.2011.5.25.361.2.5"] = [
    name: "hwBrasRbsTcpStateErr",
    fields: ["hwBrasRbsName"],
    fieldOids: ["hwBrasRbsName": "1.3.6.1.4.1.2011.5.25.361.1.3"]
]

// --- hwBrasRbsTcpStateErrResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.361.2.6
// Fields: hwBrasRbsName
// Description: The TCP connection of the BRAS RBS component on the slave main control board was not in the connected state.
trapMap["1.3.6.1.4.1.2011.5.25.361.2.6"] = [
    name: "hwBrasRbsTcpStateErrResume",
    fields: ["hwBrasRbsName"],
    fieldOids: ["hwBrasRbsName": "1.3.6.1.4.1.2011.5.25.361.1.3"]
]

// --- hwBrasRuiTriggerErr (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.361.2.7
// Description: User services on the RUI backup device failed to be recovered for a long period of time.
trapMap["1.3.6.1.4.1.2011.5.25.361.2.7"] = [
    name: "hwBrasRuiTriggerErr",
    fields: [],
    fieldOids: []
]

// --- hwBrasRuiTriggerErrResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.361.2.8
// Description: User services on the RUI backup device recovered.
trapMap["1.3.6.1.4.1.2011.5.25.361.2.8"] = [
    name: "hwBrasRuiTriggerErrResume",
    fields: [],
    fieldOids: []
]

// --- hwBrasRbsProtDown (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.361.2.9
// Fields: hwBrasRbsName, hwBrasRbsProtectType, hwBrasRbsProtectDownReason
// Description: The RBS protection tunnel is down.
trapMap["1.3.6.1.4.1.2011.5.25.361.2.9"] = [
    name: "hwBrasRbsProtDown",
    fields: ["hwBrasRbsName", "hwBrasRbsProtectType", "hwBrasRbsProtectDownReason"],
    fieldOids: ["hwBrasRbsName": "1.3.6.1.4.1.2011.5.25.361.1.3", "hwBrasRbsProtectType": "1.3.6.1.4.1.2011.5.25.361.1.4", "hwBrasRbsProtectDownReason": "1.3.6.1.4.1.2011.5.25.361.1.5"]
]

// --- hwBrasRbsProtDownResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.361.2.10
// Fields: hwBrasRbsName, hwBrasRbsProtectType, hwBrasRbsProtectDownReason
// Description: The RBS protection tunnel down alarm is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.361.2.10"] = [
    name: "hwBrasRbsProtDownResume",
    fields: ["hwBrasRbsName", "hwBrasRbsProtectType", "hwBrasRbsProtectDownReason"],
    fieldOids: ["hwBrasRbsName": "1.3.6.1.4.1.2011.5.25.361.1.3", "hwBrasRbsProtectType": "1.3.6.1.4.1.2011.5.25.361.1.4", "hwBrasRbsProtectDownReason": "1.3.6.1.4.1.2011.5.25.361.1.5"]
]

// --- hwBrasRbpRoleAbnormal (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.361.2.11
// Fields: hwBrasRbpName, hwBrasVrrpId, hwBrasRbpRoleAbnormalReason
// Description: The role of RPB is abnormal.
trapMap["1.3.6.1.4.1.2011.5.25.361.2.11"] = [
    name: "hwBrasRbpRoleAbnormal",
    fields: ["hwBrasRbpName", "hwBrasVrrpId", "hwBrasRbpRoleAbnormalReason"],
    fieldOids: ["hwBrasRbpName": "1.3.6.1.4.1.2011.5.25.361.1.6", "hwBrasVrrpId": "1.3.6.1.4.1.2011.5.25.361.1.7", "hwBrasRbpRoleAbnormalReason": "1.3.6.1.4.1.2011.5.25.361.1.8"]
]

// --- hwBrasRbpRoleAbnormalResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.361.2.12
// Fields: hwBrasRbpName, hwBrasVrrpId, hwBrasRbpRoleAbnormalReason
// Description: The RPB role abnormal alarm is cleard.
trapMap["1.3.6.1.4.1.2011.5.25.361.2.12"] = [
    name: "hwBrasRbpRoleAbnormalResume",
    fields: ["hwBrasRbpName", "hwBrasVrrpId", "hwBrasRbpRoleAbnormalReason"],
    fieldOids: ["hwBrasRbpName": "1.3.6.1.4.1.2011.5.25.361.1.6", "hwBrasVrrpId": "1.3.6.1.4.1.2011.5.25.361.1.7", "hwBrasRbpRoleAbnormalReason": "1.3.6.1.4.1.2011.5.25.361.1.8"]
]

// --- hwBrasRuiConfigInconsistent (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.361.2.13
// Description: Configurations on the active and standby devices were inconsistent in a dual-device hot backup scenario.
trapMap["1.3.6.1.4.1.2011.5.25.361.2.13"] = [
    name: "hwBrasRuiConfigInconsistent",
    fields: [],
    fieldOids: []
]

// --- hwBrasRuiConfigConsistent (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.361.2.14
// Description: Configurations on the active and standby devices became consistent again in a dual-device hot backup scenario.
trapMap["1.3.6.1.4.1.2011.5.25.361.2.14"] = [
    name: "hwBrasRuiConfigConsistent",
    fields: [],
    fieldOids: []
]

// ===== Parsing logic =====

// Set to true to enable diagnostic logging for this MIB parser
DEBUG = false

LOG_PREFIX = "[HUAWEI-BRAS-RUI-TRAP-MIB]"
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
