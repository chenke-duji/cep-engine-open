/**
 * Auto-generated from HUAWEI-OPEN-APPLICATION-SYSTEM-MIB.mib
 * Generated: 2026-08-24T18:28:30.542884400
 * Traps/Notifications (12): hwOASApplicationFault, hwOASApplicationFaultResume, hwOASCPUUsageOverThreshold, hwOASCPUUsageOverThresholdResume, hwOASMemUsageOverThreshold, hwOASMemUsageOverThresholdResume, hwOASDiskUsageOverThreshold, hwOASDiskUsageOverThresholdResume, hwOASSoftwareOperationLog, hwOASApplicationOperationLog, hwOASPartitionRestoreFault, hwOASPartitionRestoreFaultResume
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

// --- hwOASApplicationFault (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.362.2.1
// Fields: hwOASName, hwOASSlot, hwOASCpuID, hwOASEnableFaultReason
// Description: The application fails to be started or is restarted due to a running fault.
trapMap["1.3.6.1.4.1.2011.5.25.362.2.1"] = [
    name: "hwOASApplicationFault",
    fields: ["hwOASName", "hwOASSlot", "hwOASCpuID", "hwOASEnableFaultReason"],
    fieldOids: ["hwOASName": "1.3.6.1.4.1.2011.5.25.362.1.1.1.1", "hwOASSlot": "1.3.6.1.4.1.2011.5.25.362.1.1.1.2", "hwOASCpuID": "1.3.6.1.4.1.2011.5.25.362.1.1.1.3", "hwOASEnableFaultReason": "1.3.6.1.4.1.2011.5.25.362.1.1.1.4"]
]

// --- hwOASApplicationFaultResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.362.2.2
// Fields: hwOASName, hwOASSlot, hwOASCpuID, hwOASEnableFaultReason
// Description: The application is restored after being restarted due to a startup failure or a running fault.
trapMap["1.3.6.1.4.1.2011.5.25.362.2.2"] = [
    name: "hwOASApplicationFaultResume",
    fields: ["hwOASName", "hwOASSlot", "hwOASCpuID", "hwOASEnableFaultReason"],
    fieldOids: ["hwOASName": "1.3.6.1.4.1.2011.5.25.362.1.1.1.1", "hwOASSlot": "1.3.6.1.4.1.2011.5.25.362.1.1.1.2", "hwOASCpuID": "1.3.6.1.4.1.2011.5.25.362.1.1.1.3", "hwOASEnableFaultReason": "1.3.6.1.4.1.2011.5.25.362.1.1.1.4"]
]

// --- hwOASCPUUsageOverThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.362.4.1
// Fields: hwOASName, hwOASSlot, hwOASCpuID, hwOASCpuUsage, hwOASCpuUsageThreshold
// Description: The application of CPU usage exceed threshold.
trapMap["1.3.6.1.4.1.2011.5.25.362.4.1"] = [
    name: "hwOASCPUUsageOverThreshold",
    fields: ["hwOASName", "hwOASSlot", "hwOASCpuID", "hwOASCpuUsage", "hwOASCpuUsageThreshold"],
    fieldOids: ["hwOASName": "1.3.6.1.4.1.2011.5.25.362.1.1.1.1", "hwOASSlot": "1.3.6.1.4.1.2011.5.25.362.1.1.1.2", "hwOASCpuID": "1.3.6.1.4.1.2011.5.25.362.1.1.1.3", "hwOASCpuUsage": "1.3.6.1.4.1.2011.5.25.362.1.1.1.5", "hwOASCpuUsageThreshold": "1.3.6.1.4.1.2011.5.25.362.1.1.1.6"]
]

// --- hwOASCPUUsageOverThresholdResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.362.4.2
// Fields: hwOASName, hwOASSlot, hwOASCpuID, hwOASCpuUsage, hwOASCpuUsageThreshold
// Description: The application of CPU usage back to normal level.
trapMap["1.3.6.1.4.1.2011.5.25.362.4.2"] = [
    name: "hwOASCPUUsageOverThresholdResume",
    fields: ["hwOASName", "hwOASSlot", "hwOASCpuID", "hwOASCpuUsage", "hwOASCpuUsageThreshold"],
    fieldOids: ["hwOASName": "1.3.6.1.4.1.2011.5.25.362.1.1.1.1", "hwOASSlot": "1.3.6.1.4.1.2011.5.25.362.1.1.1.2", "hwOASCpuID": "1.3.6.1.4.1.2011.5.25.362.1.1.1.3", "hwOASCpuUsage": "1.3.6.1.4.1.2011.5.25.362.1.1.1.5", "hwOASCpuUsageThreshold": "1.3.6.1.4.1.2011.5.25.362.1.1.1.6"]
]

// --- hwOASMemUsageOverThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.362.5.1
// Fields: hwOASName, hwOASSlot, hwOASCpuID, hwOASMemUsage, hwOASMemUsageThreshold
// Description: The application of memery usage exceed threshold.
trapMap["1.3.6.1.4.1.2011.5.25.362.5.1"] = [
    name: "hwOASMemUsageOverThreshold",
    fields: ["hwOASName", "hwOASSlot", "hwOASCpuID", "hwOASMemUsage", "hwOASMemUsageThreshold"],
    fieldOids: ["hwOASName": "1.3.6.1.4.1.2011.5.25.362.1.1.1.1", "hwOASSlot": "1.3.6.1.4.1.2011.5.25.362.1.1.1.2", "hwOASCpuID": "1.3.6.1.4.1.2011.5.25.362.1.1.1.3", "hwOASMemUsage": "1.3.6.1.4.1.2011.5.25.362.1.1.1.7", "hwOASMemUsageThreshold": "1.3.6.1.4.1.2011.5.25.362.1.1.1.8"]
]

// --- hwOASMemUsageOverThresholdResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.362.5.2
// Fields: hwOASName, hwOASSlot, hwOASCpuID, hwOASMemUsage, hwOASMemUsageThreshold
// Description: The application of memery usage back to normal level.
trapMap["1.3.6.1.4.1.2011.5.25.362.5.2"] = [
    name: "hwOASMemUsageOverThresholdResume",
    fields: ["hwOASName", "hwOASSlot", "hwOASCpuID", "hwOASMemUsage", "hwOASMemUsageThreshold"],
    fieldOids: ["hwOASName": "1.3.6.1.4.1.2011.5.25.362.1.1.1.1", "hwOASSlot": "1.3.6.1.4.1.2011.5.25.362.1.1.1.2", "hwOASCpuID": "1.3.6.1.4.1.2011.5.25.362.1.1.1.3", "hwOASMemUsage": "1.3.6.1.4.1.2011.5.25.362.1.1.1.7", "hwOASMemUsageThreshold": "1.3.6.1.4.1.2011.5.25.362.1.1.1.8"]
]

// --- hwOASDiskUsageOverThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.362.6.1
// Fields: hwOASName, hwOASSlot, hwOASCpuID, hwOASDiskUsage, hwOASDiskUsageThreshold
// Description: The application of disk usage exceed threshold.
trapMap["1.3.6.1.4.1.2011.5.25.362.6.1"] = [
    name: "hwOASDiskUsageOverThreshold",
    fields: ["hwOASName", "hwOASSlot", "hwOASCpuID", "hwOASDiskUsage", "hwOASDiskUsageThreshold"],
    fieldOids: ["hwOASName": "1.3.6.1.4.1.2011.5.25.362.1.1.1.1", "hwOASSlot": "1.3.6.1.4.1.2011.5.25.362.1.1.1.2", "hwOASCpuID": "1.3.6.1.4.1.2011.5.25.362.1.1.1.3", "hwOASDiskUsage": "1.3.6.1.4.1.2011.5.25.362.1.1.1.9", "hwOASDiskUsageThreshold": "1.3.6.1.4.1.2011.5.25.362.1.1.1.10"]
]

// --- hwOASDiskUsageOverThresholdResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.362.6.2
// Fields: hwOASName, hwOASSlot, hwOASCpuID, hwOASDiskUsage, hwOASDiskUsageThreshold
// Description: The application of disk usage back to normal level.
trapMap["1.3.6.1.4.1.2011.5.25.362.6.2"] = [
    name: "hwOASDiskUsageOverThresholdResume",
    fields: ["hwOASName", "hwOASSlot", "hwOASCpuID", "hwOASDiskUsage", "hwOASDiskUsageThreshold"],
    fieldOids: ["hwOASName": "1.3.6.1.4.1.2011.5.25.362.1.1.1.1", "hwOASSlot": "1.3.6.1.4.1.2011.5.25.362.1.1.1.2", "hwOASCpuID": "1.3.6.1.4.1.2011.5.25.362.1.1.1.3", "hwOASDiskUsage": "1.3.6.1.4.1.2011.5.25.362.1.1.1.9", "hwOASDiskUsageThreshold": "1.3.6.1.4.1.2011.5.25.362.1.1.1.10"]
]

// --- hwOASSoftwareOperationLog (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.362.7.1
// Fields: hwOASSoftwareOperation, hwOASSoftwareName, hwOASOperationResult, hwOASFailureReason
// Description: The Log which describes image software operation
trapMap["1.3.6.1.4.1.2011.5.25.362.7.1"] = [
    name: "hwOASSoftwareOperationLog",
    fields: ["hwOASSoftwareOperation", "hwOASSoftwareName", "hwOASOperationResult", "hwOASFailureReason"],
    fieldOids: ["hwOASSoftwareOperation": "1.3.6.1.4.1.2011.5.25.362.1.2.2", "hwOASSoftwareName": "1.3.6.1.4.1.2011.5.25.362.1.2.1", "hwOASOperationResult": "1.3.6.1.4.1.2011.5.25.362.1.2.3", "hwOASFailureReason": "1.3.6.1.4.1.2011.5.25.362.1.2.4"]
]

// --- hwOASApplicationOperationLog (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.362.7.2
// Fields: hwOASApplicationOperation, hwOASName, hwOASSlot, hwOASCpuID, hwOASOperationResult, hwOASFailureReason
// Description: The Log which describes application operation
trapMap["1.3.6.1.4.1.2011.5.25.362.7.2"] = [
    name: "hwOASApplicationOperationLog",
    fields: ["hwOASApplicationOperation", "hwOASName", "hwOASSlot", "hwOASCpuID", "hwOASOperationResult", "hwOASFailureReason"],
    fieldOids: ["hwOASApplicationOperation": "1.3.6.1.4.1.2011.5.25.362.1.1.1.15", "hwOASName": "1.3.6.1.4.1.2011.5.25.362.1.1.1.1", "hwOASSlot": "1.3.6.1.4.1.2011.5.25.362.1.1.1.2", "hwOASCpuID": "1.3.6.1.4.1.2011.5.25.362.1.1.1.3", "hwOASOperationResult": "1.3.6.1.4.1.2011.5.25.362.1.2.3", "hwOASFailureReason": "1.3.6.1.4.1.2011.5.25.362.1.2.4"]
]

// --- hwOASPartitionRestoreFault (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.362.8.1
// Fields: hwOASPartitionType, hwOASPartitionSlot, hwOASPartitionCpuID
// Description: Failed to restore partitions on the standby main control board.
trapMap["1.3.6.1.4.1.2011.5.25.362.8.1"] = [
    name: "hwOASPartitionRestoreFault",
    fields: ["hwOASPartitionType", "hwOASPartitionSlot", "hwOASPartitionCpuID"],
    fieldOids: ["hwOASPartitionType": "1.3.6.1.4.1.2011.5.25.362.1.2.5", "hwOASPartitionSlot": "1.3.6.1.4.1.2011.5.25.362.1.2.6", "hwOASPartitionCpuID": "1.3.6.1.4.1.2011.5.25.362.1.2.7"]
]

// --- hwOASPartitionRestoreFaultResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.362.8.2
// Fields: hwOASPartitionType, hwOASPartitionSlot, hwOASPartitionCpuID
// Description: The partition restoration failure alarm is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.362.8.2"] = [
    name: "hwOASPartitionRestoreFaultResume",
    fields: ["hwOASPartitionType", "hwOASPartitionSlot", "hwOASPartitionCpuID"],
    fieldOids: ["hwOASPartitionType": "1.3.6.1.4.1.2011.5.25.362.1.2.5", "hwOASPartitionSlot": "1.3.6.1.4.1.2011.5.25.362.1.2.6", "hwOASPartitionCpuID": "1.3.6.1.4.1.2011.5.25.362.1.2.7"]
]

// ===== Parsing logic =====

// Set to true to enable diagnostic logging for this MIB parser
DEBUG = false

LOG_PREFIX = "[HUAWEI-OPEN-APPLICATION-SYSTEM-MIB]"
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
