/**
 * Auto-generated from HUAWEI-HQOS-MIB.mib
 * Generated: 2026-08-24T18:28:29.797471700
 * Traps/Notifications (20): hwhqosUserQueueStatDiscardAlarmTrap, hwhqosUserQueueApplyPirFailAlarmTrap, hwhqosUserQueueApplyPirSucessAlarmTrap, hwhqosUserQueueApplyAlarmTrap, hwhqosPortQueueStatDiscardAlarmTrap, hwhqosPortQueueStatDiscardAlarmCancelTrap, hwhqosUserQueueApplyPirFromPoolFailAlarmTrap, hwhqosUserQueueApplyPirFromPoolSucessAlarmTrap, hwHQoSPwifScheduleTreeCreateFailAlarm, hwHQoSPwifScheduleTreeCreateFailAlarmClear, hwXQoS4QueueResouceOverAlarmTrap, hwXQoS4QueueResouceOverAlarmCancelTrap, hwXQoS4QueueResoucePreAlarmTrap, hwXQoS4QueueResoucePreAlarmCancelTrap, hwXQoS8QueueResouceOverAlarmTrap, hwXQoS8QueueResouceOverAlarmCancelTrap, hwXQoS8QueueResoucePreAlarmTrap, hwXQoS8QueueResoucePreAlarmCancelTrap, hwhqosBufferAlarmTrap, hwhqosBufferAlarmClearTrap
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

// --- hwhqosUserQueueStatDiscardAlarmTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.132.3.1
// Fields: hwhqosUserFrameId, hwhqosUserSlotId, hwhqosUserPortId, hwhqosUserQueueStatPerDropPackets
// Description: The user queue discard alarm trap.
trapMap["1.3.6.1.4.1.2011.5.25.132.3.1"] = [
    name: "hwhqosUserQueueStatDiscardAlarmTrap",
    fields: ["hwhqosUserFrameId", "hwhqosUserSlotId", "hwhqosUserPortId", "hwhqosUserQueueStatPerDropPackets"],
    fieldOids: ["hwhqosUserFrameId": "1.3.6.1.4.1.2011.5.25.132.2.1", "hwhqosUserSlotId": "1.3.6.1.4.1.2011.5.25.132.2.2", "hwhqosUserPortId": "1.3.6.1.4.1.2011.5.25.132.2.3", "hwhqosUserQueueStatPerDropPackets": "1.3.6.1.4.1.2011.5.25.132.1.6.1.11"]
]

// --- hwhqosUserQueueApplyPirFailAlarmTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.132.3.2
// Fields: entPhysicalIndex, entPhysicalName, hwhqosUserQueueApplyFailDirection
// Description: The user apply pir fail alarm trap.
trapMap["1.3.6.1.4.1.2011.5.25.132.3.2"] = [
    name: "hwhqosUserQueueApplyPirFailAlarmTrap",
    fields: ["entPhysicalIndex", "entPhysicalName", "hwhqosUserQueueApplyFailDirection"],
    fieldOids: ["entPhysicalIndex": "1.3.6.1.2.1.47.1.1.1.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwhqosUserQueueApplyFailDirection": "1.3.6.1.4.1.2011.5.25.132.2.4"]
]

// --- hwhqosUserQueueApplyPirSucessAlarmTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.132.3.3
// Fields: entPhysicalIndex, entPhysicalName, hwhqosUserQueueApplyFailDirection
// Description: The user apply pir success alarm trap.
trapMap["1.3.6.1.4.1.2011.5.25.132.3.3"] = [
    name: "hwhqosUserQueueApplyPirSucessAlarmTrap",
    fields: ["entPhysicalIndex", "entPhysicalName", "hwhqosUserQueueApplyFailDirection"],
    fieldOids: ["entPhysicalIndex": "1.3.6.1.2.1.47.1.1.1.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwhqosUserQueueApplyFailDirection": "1.3.6.1.4.1.2011.5.25.132.2.4"]
]

// --- hwhqosUserQueueApplyAlarmTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.132.3.4
// Fields: hwhqosUserQueueApplyAlarmIfNetName
// Description: The user-queue apply alarm trap.
trapMap["1.3.6.1.4.1.2011.5.25.132.3.4"] = [
    name: "hwhqosUserQueueApplyAlarmTrap",
    fields: ["hwhqosUserQueueApplyAlarmIfNetName"],
    fieldOids: ["hwhqosUserQueueApplyAlarmIfNetName": "1.3.6.1.4.1.2011.5.25.132.1.65.1.1"]
]

// --- hwhqosPortQueueStatDiscardAlarmTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.132.3.5
// Fields: hwhqosPortQueueInterfaceTrap, hwhqosPortQueueCosValueTrap, hwhqosPortQueueDiscardTypeTrap, hwhqosPortQueueDiscardValueTrap
// Description: The PortQueue Stat Discard alarm trap.
trapMap["1.3.6.1.4.1.2011.5.25.132.3.5"] = [
    name: "hwhqosPortQueueStatDiscardAlarmTrap",
    fields: ["hwhqosPortQueueInterfaceTrap", "hwhqosPortQueueCosValueTrap", "hwhqosPortQueueDiscardTypeTrap", "hwhqosPortQueueDiscardValueTrap"],
    fieldOids: ["hwhqosPortQueueInterfaceTrap": "1.3.6.1.4.1.2011.5.25.132.1.66.1.1", "hwhqosPortQueueCosValueTrap": "1.3.6.1.4.1.2011.5.25.132.1.66.1.2", "hwhqosPortQueueDiscardTypeTrap": "1.3.6.1.4.1.2011.5.25.132.1.66.1.3", "hwhqosPortQueueDiscardValueTrap": "1.3.6.1.4.1.2011.5.25.132.1.66.1.4"]
]

// --- hwhqosPortQueueStatDiscardAlarmCancelTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.132.3.6
// Fields: hwhqosPortQueueInterfaceCancel, hwhqosPortQueueCosValueCancel, hwhqosPortQueueDiscardTypeCancel, hwhqosPortQueueDiscardValueCancel
// Description: The PortQueue Stat Discard Cancel alarm trap.
trapMap["1.3.6.1.4.1.2011.5.25.132.3.6"] = [
    name: "hwhqosPortQueueStatDiscardAlarmCancelTrap",
    fields: ["hwhqosPortQueueInterfaceCancel", "hwhqosPortQueueCosValueCancel", "hwhqosPortQueueDiscardTypeCancel", "hwhqosPortQueueDiscardValueCancel"],
    fieldOids: ["hwhqosPortQueueInterfaceCancel": "1.3.6.1.4.1.2011.5.25.132.1.67.1.1", "hwhqosPortQueueCosValueCancel": "1.3.6.1.4.1.2011.5.25.132.1.67.1.2", "hwhqosPortQueueDiscardTypeCancel": "1.3.6.1.4.1.2011.5.25.132.1.67.1.3", "hwhqosPortQueueDiscardValueCancel": "1.3.6.1.4.1.2011.5.25.132.1.67.1.4"]
]

// --- hwhqosUserQueueApplyPirFromPoolFailAlarmTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.132.3.7
// Fields: entPhysicalIndex, entPhysicalName, hwhqosUserQueueApplyFailPool
// Description: The user apply PIRs from pool fail alarm trap.
trapMap["1.3.6.1.4.1.2011.5.25.132.3.7"] = [
    name: "hwhqosUserQueueApplyPirFromPoolFailAlarmTrap",
    fields: ["entPhysicalIndex", "entPhysicalName", "hwhqosUserQueueApplyFailPool"],
    fieldOids: ["entPhysicalIndex": "1.3.6.1.2.1.47.1.1.1.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwhqosUserQueueApplyFailPool": "1.3.6.1.4.1.2011.5.25.132.2.5"]
]

// --- hwhqosUserQueueApplyPirFromPoolSucessAlarmTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.132.3.8
// Fields: entPhysicalIndex, entPhysicalName, hwhqosUserQueueApplyFailPool
// Description: The user apply PIRs sucess alarm trap.
trapMap["1.3.6.1.4.1.2011.5.25.132.3.8"] = [
    name: "hwhqosUserQueueApplyPirFromPoolSucessAlarmTrap",
    fields: ["entPhysicalIndex", "entPhysicalName", "hwhqosUserQueueApplyFailPool"],
    fieldOids: ["entPhysicalIndex": "1.3.6.1.2.1.47.1.1.1.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwhqosUserQueueApplyFailPool": "1.3.6.1.4.1.2011.5.25.132.2.5"]
]

// --- hwHQoSPwifScheduleTreeCreateFailAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.132.3.9
// Fields: entPhysicalName, entPhysicalName
// Description: Failed to create scheduling tree alarm.
trapMap["1.3.6.1.4.1.2011.5.25.132.3.9"] = [
    name: "hwHQoSPwifScheduleTreeCreateFailAlarm",
    fields: ["entPhysicalName", "entPhysicalName"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwHQoSPwifScheduleTreeCreateFailAlarmClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.132.3.10
// Fields: entPhysicalName, entPhysicalName
// Description: Failed to create scheduling tree clear alarm.
trapMap["1.3.6.1.4.1.2011.5.25.132.3.10"] = [
    name: "hwHQoSPwifScheduleTreeCreateFailAlarmClear",
    fields: ["entPhysicalName", "entPhysicalName"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwXQoS4QueueResouceOverAlarmTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.132.3.11
// Fields: entPhysicalName, hwhqosUserQueueChipld
// Description: This object indicates that the downstream four-flow-queue user-queue resources are insufficient.
trapMap["1.3.6.1.4.1.2011.5.25.132.3.11"] = [
    name: "hwXQoS4QueueResouceOverAlarmTrap",
    fields: ["entPhysicalName", "hwhqosUserQueueChipld"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwhqosUserQueueChipld": "1.3.6.1.4.1.2011.5.25.132.2.6"]
]

// --- hwXQoS4QueueResouceOverAlarmCancelTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.132.3.12
// Fields: entPhysicalName, hwhqosUserQueueChipld
// Description: This object indicates that the downstream four-flow-queue user-queue resources are sufficient.
trapMap["1.3.6.1.4.1.2011.5.25.132.3.12"] = [
    name: "hwXQoS4QueueResouceOverAlarmCancelTrap",
    fields: ["entPhysicalName", "hwhqosUserQueueChipld"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwhqosUserQueueChipld": "1.3.6.1.4.1.2011.5.25.132.2.6"]
]

// --- hwXQoS4QueueResoucePreAlarmTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.132.3.13
// Fields: entPhysicalName, hwhqosUserQueueChipld
// Description: This object indicates that the usage of the downstream four-flow-queue user-queue resources exceeds 90%.
trapMap["1.3.6.1.4.1.2011.5.25.132.3.13"] = [
    name: "hwXQoS4QueueResoucePreAlarmTrap",
    fields: ["entPhysicalName", "hwhqosUserQueueChipld"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwhqosUserQueueChipld": "1.3.6.1.4.1.2011.5.25.132.2.6"]
]

// --- hwXQoS4QueueResoucePreAlarmCancelTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.132.3.14
// Fields: entPhysicalName, hwhqosUserQueueChipld
// Description: This object indicates that the usage of the downstream four-flow-queue user-queue resources does not exceed 90%.
trapMap["1.3.6.1.4.1.2011.5.25.132.3.14"] = [
    name: "hwXQoS4QueueResoucePreAlarmCancelTrap",
    fields: ["entPhysicalName", "hwhqosUserQueueChipld"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwhqosUserQueueChipld": "1.3.6.1.4.1.2011.5.25.132.2.6"]
]

// --- hwXQoS8QueueResouceOverAlarmTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.132.3.15
// Fields: entPhysicalName, hwhqosUserQueueChipld
// Description: This object indicates that the downstream eight-flow-queue user-queue resources are insufficient.
trapMap["1.3.6.1.4.1.2011.5.25.132.3.15"] = [
    name: "hwXQoS8QueueResouceOverAlarmTrap",
    fields: ["entPhysicalName", "hwhqosUserQueueChipld"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwhqosUserQueueChipld": "1.3.6.1.4.1.2011.5.25.132.2.6"]
]

// --- hwXQoS8QueueResouceOverAlarmCancelTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.132.3.16
// Fields: entPhysicalName, hwhqosUserQueueChipld
// Description: This object indicates that the downstream eight-flow-queue user-queue resources are sufficient.
trapMap["1.3.6.1.4.1.2011.5.25.132.3.16"] = [
    name: "hwXQoS8QueueResouceOverAlarmCancelTrap",
    fields: ["entPhysicalName", "hwhqosUserQueueChipld"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwhqosUserQueueChipld": "1.3.6.1.4.1.2011.5.25.132.2.6"]
]

// --- hwXQoS8QueueResoucePreAlarmTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.132.3.17
// Fields: entPhysicalName, hwhqosUserQueueChipld
// Description: This object indicates that the usage of the downstream eight-flow-queue user-queue resources exceeds 90%.
trapMap["1.3.6.1.4.1.2011.5.25.132.3.17"] = [
    name: "hwXQoS8QueueResoucePreAlarmTrap",
    fields: ["entPhysicalName", "hwhqosUserQueueChipld"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwhqosUserQueueChipld": "1.3.6.1.4.1.2011.5.25.132.2.6"]
]

// --- hwXQoS8QueueResoucePreAlarmCancelTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.132.3.18
// Fields: entPhysicalName, hwhqosUserQueueChipld
// Description: The usage of the outgoing user-queue resources in eight-flow-queue mode fell below 90%.
trapMap["1.3.6.1.4.1.2011.5.25.132.3.18"] = [
    name: "hwXQoS8QueueResoucePreAlarmCancelTrap",
    fields: ["entPhysicalName", "hwhqosUserQueueChipld"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwhqosUserQueueChipld": "1.3.6.1.4.1.2011.5.25.132.2.6"]
]

// --- hwhqosBufferAlarmTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.132.3.19
// Fields: hwhqosBufferAlarmSlotId, hwhqosBufferAlarmChipId, hwhqosBufferAlarmBufferSize
// Description: The queue buffer usage exceeded 90% of the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.132.3.19"] = [
    name: "hwhqosBufferAlarmTrap",
    fields: ["hwhqosBufferAlarmSlotId", "hwhqosBufferAlarmChipId", "hwhqosBufferAlarmBufferSize"],
    fieldOids: ["hwhqosBufferAlarmSlotId": "1.3.6.1.4.1.2011.5.25.132.2.7", "hwhqosBufferAlarmChipId": "1.3.6.1.4.1.2011.5.25.132.2.8", "hwhqosBufferAlarmBufferSize": "1.3.6.1.4.1.2011.5.25.132.2.9"]
]

// --- hwhqosBufferAlarmClearTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.132.3.20
// Fields: hwhqosBufferAlarmSlotId, hwhqosBufferAlarmChipId, hwhqosBufferAlarmBufferSize
// Description: The queue buffer usage fell below 90% of the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.132.3.20"] = [
    name: "hwhqosBufferAlarmClearTrap",
    fields: ["hwhqosBufferAlarmSlotId", "hwhqosBufferAlarmChipId", "hwhqosBufferAlarmBufferSize"],
    fieldOids: ["hwhqosBufferAlarmSlotId": "1.3.6.1.4.1.2011.5.25.132.2.7", "hwhqosBufferAlarmChipId": "1.3.6.1.4.1.2011.5.25.132.2.8", "hwhqosBufferAlarmBufferSize": "1.3.6.1.4.1.2011.5.25.132.2.9"]
]

// ===== Parsing logic =====

// Set to true to enable diagnostic logging for this MIB parser
DEBUG = false

LOG_PREFIX = "[HUAWEI-HQOS-MIB]"
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
