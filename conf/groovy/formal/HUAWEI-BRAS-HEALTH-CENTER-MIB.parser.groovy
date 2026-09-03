/**
 * Auto-generated from HUAWEI-BRAS-HEALTH-CENTER-MIB.mib
 * Generated: 2026-08-24T18:28:29.044318
 * Traps/Notifications (12): hwCUInterfaceWorkStatusAbnormalAlarm, hwCUInterfaceWorkStatusAbnormalResume, hwCUUPWorkStatusAbnormalAlarm, hwCUUPWorkStatusAbnormalResume, hwCUProfileWorkStatusAbnormalAlarm, hwCUProfileWorkStatusAbnormalResume, hwCUUpVsuCpuAbnormalAlarm, hwCUUpVsuCpuAbnormalResume, hwCUUPBoardAbnormalAlarm, hwCUUPBoardAbnormalResume, hwCUUPServiceAbnormalAlarm, hwCUUPServiceAbnormalResume
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

// --- hwCUInterfaceWorkStatusAbnormalAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.381.2.1.1
// Fields: hwCuInterfaceName, hwAbnorReason
// Description: The service status of the interface is abnormal.
trapMap["1.3.6.1.4.1.2011.5.25.381.2.1.1"] = [
    name: "hwCUInterfaceWorkStatusAbnormalAlarm",
    fields: ["hwCuInterfaceName", "hwAbnorReason"],
    fieldOids: ["hwCuInterfaceName": "1.3.6.1.4.1.2011.5.25.381.1.1", "hwAbnorReason": "1.3.6.1.4.1.2011.5.25.381.1.2"]
]

// --- hwCUInterfaceWorkStatusAbnormalResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.381.2.1.2
// Fields: hwCuInterfaceName, hwAbnorReason
// Description: The service status of the interface is restored.
trapMap["1.3.6.1.4.1.2011.5.25.381.2.1.2"] = [
    name: "hwCUInterfaceWorkStatusAbnormalResume",
    fields: ["hwCuInterfaceName", "hwAbnorReason"],
    fieldOids: ["hwCuInterfaceName": "1.3.6.1.4.1.2011.5.25.381.1.1", "hwAbnorReason": "1.3.6.1.4.1.2011.5.25.381.1.2"]
]

// --- hwCUUPWorkStatusAbnormalAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.381.2.1.3
// Fields: hwUpid, hwinterfaceQuantity, hwAbnorReason
// Description: The service status of the UP is abnormal.
trapMap["1.3.6.1.4.1.2011.5.25.381.2.1.3"] = [
    name: "hwCUUPWorkStatusAbnormalAlarm",
    fields: ["hwUpid", "hwinterfaceQuantity", "hwAbnorReason"],
    fieldOids: ["hwUpid": "1.3.6.1.4.1.2011.5.25.345.1.18", "hwinterfaceQuantity": "1.3.6.1.4.1.2011.5.25.381.1.3", "hwAbnorReason": "1.3.6.1.4.1.2011.5.25.381.1.2"]
]

// --- hwCUUPWorkStatusAbnormalResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.381.2.1.4
// Fields: hwUpid, hwinterfaceQuantity, hwAbnorReason
// Description: The service status of the UP is restored.
trapMap["1.3.6.1.4.1.2011.5.25.381.2.1.4"] = [
    name: "hwCUUPWorkStatusAbnormalResume",
    fields: ["hwUpid", "hwinterfaceQuantity", "hwAbnorReason"],
    fieldOids: ["hwUpid": "1.3.6.1.4.1.2011.5.25.345.1.18", "hwinterfaceQuantity": "1.3.6.1.4.1.2011.5.25.381.1.3", "hwAbnorReason": "1.3.6.1.4.1.2011.5.25.381.1.2"]
]

// --- hwCUProfileWorkStatusAbnormalAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.381.2.1.5
// Fields: hwProfileName, hwinterfaceQuantity, hwAbnorReason
// Description: The service status of the backup group was abnormal.
trapMap["1.3.6.1.4.1.2011.5.25.381.2.1.5"] = [
    name: "hwCUProfileWorkStatusAbnormalAlarm",
    fields: ["hwProfileName", "hwinterfaceQuantity", "hwAbnorReason"],
    fieldOids: ["hwProfileName": "1.3.6.1.4.1.2011.5.25.381.1.4", "hwinterfaceQuantity": "1.3.6.1.4.1.2011.5.25.381.1.3", "hwAbnorReason": "1.3.6.1.4.1.2011.5.25.381.1.2"]
]

// --- hwCUProfileWorkStatusAbnormalResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.381.2.1.6
// Fields: hwProfileName, hwinterfaceQuantity, hwAbnorReason
// Description: The service status of the backup group was restored.
trapMap["1.3.6.1.4.1.2011.5.25.381.2.1.6"] = [
    name: "hwCUProfileWorkStatusAbnormalResume",
    fields: ["hwProfileName", "hwinterfaceQuantity", "hwAbnorReason"],
    fieldOids: ["hwProfileName": "1.3.6.1.4.1.2011.5.25.381.1.4", "hwinterfaceQuantity": "1.3.6.1.4.1.2011.5.25.381.1.3", "hwAbnorReason": "1.3.6.1.4.1.2011.5.25.381.1.2"]
]

// --- hwCUUpVsuCpuAbnormalAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.381.2.1.7
// Fields: hwUpid, hwUPSlotStr, hwUPCpuStr, hwAbnorReason
// Description: The service status of the VSU board cpu was abnormal.
trapMap["1.3.6.1.4.1.2011.5.25.381.2.1.7"] = [
    name: "hwCUUpVsuCpuAbnormalAlarm",
    fields: ["hwUpid", "hwUPSlotStr", "hwUPCpuStr", "hwAbnorReason"],
    fieldOids: ["hwUpid": "1.3.6.1.4.1.2011.5.25.345.1.18", "hwUPSlotStr": "1.3.6.1.4.1.2011.5.25.381.1.5", "hwUPCpuStr": "1.3.6.1.4.1.2011.5.25.381.1.6", "hwAbnorReason": "1.3.6.1.4.1.2011.5.25.381.1.2"]
]

// --- hwCUUpVsuCpuAbnormalResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.381.2.1.8
// Fields: hwUpid, hwUPSlotStr, hwUPCpuStr, hwAbnorReason
// Description: The service status of the VSU board cpu was resumed.
trapMap["1.3.6.1.4.1.2011.5.25.381.2.1.8"] = [
    name: "hwCUUpVsuCpuAbnormalResume",
    fields: ["hwUpid", "hwUPSlotStr", "hwUPCpuStr", "hwAbnorReason"],
    fieldOids: ["hwUpid": "1.3.6.1.4.1.2011.5.25.345.1.18", "hwUPSlotStr": "1.3.6.1.4.1.2011.5.25.381.1.5", "hwUPCpuStr": "1.3.6.1.4.1.2011.5.25.381.1.6", "hwAbnorReason": "1.3.6.1.4.1.2011.5.25.381.1.2"]
]

// --- hwCUUPBoardAbnormalAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.381.2.1.9
// Fields: hwUpid, hwUPSlotStr, hwFaultyUnitsNum, hwAbnorReason
// Description: The service status of the board was abnormal.
trapMap["1.3.6.1.4.1.2011.5.25.381.2.1.9"] = [
    name: "hwCUUPBoardAbnormalAlarm",
    fields: ["hwUpid", "hwUPSlotStr", "hwFaultyUnitsNum", "hwAbnorReason"],
    fieldOids: ["hwUpid": "1.3.6.1.4.1.2011.5.25.345.1.18", "hwUPSlotStr": "1.3.6.1.4.1.2011.5.25.381.1.5", "hwFaultyUnitsNum": "1.3.6.1.4.1.2011.5.25.381.1.7", "hwAbnorReason": "1.3.6.1.4.1.2011.5.25.381.1.2"]
]

// --- hwCUUPBoardAbnormalResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.381.2.1.10
// Fields: hwUpid, hwUPSlotStr, hwFaultyUnitsNum, hwAbnorReason
// Description: The service status of the board was resumed.
trapMap["1.3.6.1.4.1.2011.5.25.381.2.1.10"] = [
    name: "hwCUUPBoardAbnormalResume",
    fields: ["hwUpid", "hwUPSlotStr", "hwFaultyUnitsNum", "hwAbnorReason"],
    fieldOids: ["hwUpid": "1.3.6.1.4.1.2011.5.25.345.1.18", "hwUPSlotStr": "1.3.6.1.4.1.2011.5.25.381.1.5", "hwFaultyUnitsNum": "1.3.6.1.4.1.2011.5.25.381.1.7", "hwAbnorReason": "1.3.6.1.4.1.2011.5.25.381.1.2"]
]

// --- hwCUUPServiceAbnormalAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.381.2.1.11
// Fields: hwUpid, hwFaultyUnitsNum, hwAbnorReason
// Description: The service status of the UP was abnormal.
trapMap["1.3.6.1.4.1.2011.5.25.381.2.1.11"] = [
    name: "hwCUUPServiceAbnormalAlarm",
    fields: ["hwUpid", "hwFaultyUnitsNum", "hwAbnorReason"],
    fieldOids: ["hwUpid": "1.3.6.1.4.1.2011.5.25.345.1.18", "hwFaultyUnitsNum": "1.3.6.1.4.1.2011.5.25.381.1.7", "hwAbnorReason": "1.3.6.1.4.1.2011.5.25.381.1.2"]
]

// --- hwCUUPServiceAbnormalResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.381.2.1.12
// Fields: hwUpid, hwFaultyUnitsNum, hwAbnorReason
// Description: The service status of the UP was resumed.
trapMap["1.3.6.1.4.1.2011.5.25.381.2.1.12"] = [
    name: "hwCUUPServiceAbnormalResume",
    fields: ["hwUpid", "hwFaultyUnitsNum", "hwAbnorReason"],
    fieldOids: ["hwUpid": "1.3.6.1.4.1.2011.5.25.345.1.18", "hwFaultyUnitsNum": "1.3.6.1.4.1.2011.5.25.381.1.7", "hwAbnorReason": "1.3.6.1.4.1.2011.5.25.381.1.2"]
]

// ===== Parsing logic =====

// Set to true to enable diagnostic logging for this MIB parser
DEBUG = false

LOG_PREFIX = "[HUAWEI-BRAS-HEALTH-CENTER-MIB]"
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
