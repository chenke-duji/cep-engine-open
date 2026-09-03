/**
 * Auto-generated from HUAWEI-PERFMGMT-MIB.mib
 * Generated: 2026-08-24T18:28:30.607500800
 * Traps/Notifications (5): hwPMStatisticsTaskThresholdTriggerAlarm, hwPMStatisticsTaskThresholdClearAlarm, hwPMCSESEvent, hwPMUATEvent, hwPMMeasureExceed
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

// --- hwPMStatisticsTaskThresholdTriggerAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.190.1.9.1
// Fields: hwPMStatisticsTaskName, hwPMStatisticsTaskPeriod, hwPMStatisticsTaskInstanceName, hwPMStatisticsTaskIndicator, hwPMStatisticsTaskThresholdType, hwPMStatisticsTaskThresholdHighTriggerValue, hwPMStatisticsTaskThresholdLowTriggerValue, hwPMStatisticsTaskIndicateHighValue, hwPMStatisticsTaskIndicateLowValue
// Description: This object indicates the threshold triggering alarm object.
trapMap["1.3.6.1.4.1.2011.5.25.190.1.9.1"] = [
    name: "hwPMStatisticsTaskThresholdTriggerAlarm",
    fields: ["hwPMStatisticsTaskName", "hwPMStatisticsTaskPeriod", "hwPMStatisticsTaskInstanceName", "hwPMStatisticsTaskIndicator", "hwPMStatisticsTaskThresholdType", "hwPMStatisticsTaskThresholdHighTriggerValue", "hwPMStatisticsTaskThresholdLowTriggerValue", "hwPMStatisticsTaskIndicateHighValue", "hwPMStatisticsTaskIndicateLowValue"],
    fieldOids: ["hwPMStatisticsTaskName": "1.3.6.1.4.1.2011.5.25.190.1.5.1.1", "hwPMStatisticsTaskPeriod": "1.3.6.1.4.1.2011.5.25.190.1.5.1.5", "hwPMStatisticsTaskInstanceName": "1.3.6.1.4.1.2011.5.25.190.1.6.1.2", "hwPMStatisticsTaskIndicator": "1.3.6.1.4.1.2011.5.25.190.1.7.1.1", "hwPMStatisticsTaskThresholdType": "1.3.6.1.4.1.2011.5.25.190.1.8.1.1", "hwPMStatisticsTaskThresholdHighTriggerValue": "1.3.6.1.4.1.2011.5.25.190.1.8.1.2", "hwPMStatisticsTaskThresholdLowTriggerValue": "1.3.6.1.4.1.2011.5.25.190.1.8.1.3", "hwPMStatisticsTaskIndicateHighValue": "1.3.6.1.4.1.2011.5.25.190.1.11", "hwPMStatisticsTaskIndicateLowValue": "1.3.6.1.4.1.2011.5.25.190.1.10"]
]

// --- hwPMStatisticsTaskThresholdClearAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.190.1.9.2
// Fields: hwPMStatisticsTaskName, hwPMStatisticsTaskPeriod, hwPMStatisticsTaskInstanceName, hwPMStatisticsTaskIndicator, hwPMStatisticsTaskThresholdType, hwPMStatisticsTaskThresholdHighClearedValue, hwPMStatisticsTaskThresholdLowClearedValue, hwPMStatisticsTaskIndicateHighValue, hwPMStatisticsTaskIndicateLowValue
// Description: This object indicates the threshold clear object.
trapMap["1.3.6.1.4.1.2011.5.25.190.1.9.2"] = [
    name: "hwPMStatisticsTaskThresholdClearAlarm",
    fields: ["hwPMStatisticsTaskName", "hwPMStatisticsTaskPeriod", "hwPMStatisticsTaskInstanceName", "hwPMStatisticsTaskIndicator", "hwPMStatisticsTaskThresholdType", "hwPMStatisticsTaskThresholdHighClearedValue", "hwPMStatisticsTaskThresholdLowClearedValue", "hwPMStatisticsTaskIndicateHighValue", "hwPMStatisticsTaskIndicateLowValue"],
    fieldOids: ["hwPMStatisticsTaskName": "1.3.6.1.4.1.2011.5.25.190.1.5.1.1", "hwPMStatisticsTaskPeriod": "1.3.6.1.4.1.2011.5.25.190.1.5.1.5", "hwPMStatisticsTaskInstanceName": "1.3.6.1.4.1.2011.5.25.190.1.6.1.2", "hwPMStatisticsTaskIndicator": "1.3.6.1.4.1.2011.5.25.190.1.7.1.1", "hwPMStatisticsTaskThresholdType": "1.3.6.1.4.1.2011.5.25.190.1.8.1.1", "hwPMStatisticsTaskThresholdHighClearedValue": "1.3.6.1.4.1.2011.5.25.190.1.8.1.4", "hwPMStatisticsTaskThresholdLowClearedValue": "1.3.6.1.4.1.2011.5.25.190.1.8.1.5", "hwPMStatisticsTaskIndicateHighValue": "1.3.6.1.4.1.2011.5.25.190.1.11", "hwPMStatisticsTaskIndicateLowValue": "1.3.6.1.4.1.2011.5.25.190.1.10"]
]

// --- hwPMCSESEvent (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.190.1.9.3
// Fields: hwPMEventStartTime, hwPMEventDuration, hwPMStatisticsInstanceTypeName, hwPMInstanceType, hwPMInstanceName, hwPMIndicator, hwPMStatisticsIndicatorName
// Description: The SNMP trap that is generated when CSES measure entry crosses its falling or rising threshold generates an event that is configured for sending SNMP traps.
trapMap["1.3.6.1.4.1.2011.5.25.190.1.9.3"] = [
    name: "hwPMCSESEvent",
    fields: ["hwPMEventStartTime", "hwPMEventDuration", "hwPMStatisticsInstanceTypeName", "hwPMInstanceType", "hwPMInstanceName", "hwPMIndicator", "hwPMStatisticsIndicatorName"],
    fieldOids: ["hwPMEventStartTime": "1.3.6.1.4.1.2011.5.25.190.1.14", "hwPMEventDuration": "1.3.6.1.4.1.2011.5.25.190.1.16", "hwPMStatisticsInstanceTypeName": "1.3.6.1.4.1.2011.5.25.190.1.20", "hwPMInstanceType": "1.3.6.1.4.1.2011.5.25.190.1.19", "hwPMInstanceName": "1.3.6.1.4.1.2011.5.25.190.1.21", "hwPMIndicator": "1.3.6.1.4.1.2011.5.25.190.1.18", "hwPMStatisticsIndicatorName": "1.3.6.1.4.1.2011.5.25.190.1.22"]
]

// --- hwPMUATEvent (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.190.1.9.4
// Fields: hwPMEventStartTime, hwPMEventEndTime, hwPMEventState, hwPMStatisticsInstanceTypeName, hwPMInstanceType, hwPMInstanceName, hwPMIndicator, hwPMStatisticsIndicatorName
// Description: The SNMP trap that is generated when UAT measure entry crosses its falling or rising threshold generates an event that is configured for sending SNMP traps.
trapMap["1.3.6.1.4.1.2011.5.25.190.1.9.4"] = [
    name: "hwPMUATEvent",
    fields: ["hwPMEventStartTime", "hwPMEventEndTime", "hwPMEventState", "hwPMStatisticsInstanceTypeName", "hwPMInstanceType", "hwPMInstanceName", "hwPMIndicator", "hwPMStatisticsIndicatorName"],
    fieldOids: ["hwPMEventStartTime": "1.3.6.1.4.1.2011.5.25.190.1.14", "hwPMEventEndTime": "1.3.6.1.4.1.2011.5.25.190.1.15", "hwPMEventState": "1.3.6.1.4.1.2011.5.25.190.1.17", "hwPMStatisticsInstanceTypeName": "1.3.6.1.4.1.2011.5.25.190.1.20", "hwPMInstanceType": "1.3.6.1.4.1.2011.5.25.190.1.19", "hwPMInstanceName": "1.3.6.1.4.1.2011.5.25.190.1.21", "hwPMIndicator": "1.3.6.1.4.1.2011.5.25.190.1.18", "hwPMStatisticsIndicatorName": "1.3.6.1.4.1.2011.5.25.190.1.22"]
]

// --- hwPMMeasureExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.190.1.13.1
// Description: The number of statistical indexes has reached the upper limit.
trapMap["1.3.6.1.4.1.2011.5.25.190.1.13.1"] = [
    name: "hwPMMeasureExceed",
    fields: [],
    fieldOids: []
]

// ===== Parsing logic =====

// Set to true to enable diagnostic logging for this MIB parser
DEBUG = false

LOG_PREFIX = "[HUAWEI-PERFMGMT-MIB]"
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
