/**
 * Auto-generated from HUAWEI-VPLS-EXT-MIB.mib
 * Generated: 2026-08-24T18:28:31.402846500
 * Traps/Notifications (16): hwVplsVcDown, hwVplsVcUp, hwVplsVsiDown, hwVplsVsiUp, hwVplsVcBackup, hwVplsVsiDeleted, hwVplsVcDeleted, hwVplsVcStatusChange, hwVplsVcNumberThresholdExceed, hwVplsVcNumberThresholdClear, hwVplsVcNumberMaxExceed, hwVplsVcNumberMaxClear, hwVplsPwRedundancyDegraded, hwVplsPwRedundancyDegradedClear, hwVplsBLabelNotEnough, hwVplsBLabelNotEnoughClear
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

// --- hwVplsVcDown (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.119.1.2.1
// Fields: hwVplsPwType, hwVplsStateChangeReason, sysUpTime, hwVplsPwTnlPolicy
// Description: This notification indicates the VC's state changes to down.
trapMap["1.3.6.1.4.1.2011.5.25.119.1.2.1"] = [
    name: "hwVplsVcDown",
    fields: ["hwVplsPwType", "hwVplsStateChangeReason", "sysUpTime", "hwVplsPwTnlPolicy"],
    fieldOids: ["hwVplsPwType": "1.3.6.1.4.1.2011.5.25.119.1.1.5.1.4", "hwVplsStateChangeReason": "1.3.6.1.4.1.2011.5.25.119.1.1.8", "sysUpTime": "1.3.6.1.2.1.1.3", "hwVplsPwTnlPolicy": "1.3.6.1.4.1.2011.5.25.119.1.1.5.1.3"]
]

// --- hwVplsVcUp (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.119.1.2.2
// Fields: hwVplsPwType, hwVplsStateChangeReason, sysUpTime, hwVplsPwTnlPolicy
// Description: This notification indicates the VC's state changes to up.
trapMap["1.3.6.1.4.1.2011.5.25.119.1.2.2"] = [
    name: "hwVplsVcUp",
    fields: ["hwVplsPwType", "hwVplsStateChangeReason", "sysUpTime", "hwVplsPwTnlPolicy"],
    fieldOids: ["hwVplsPwType": "1.3.6.1.4.1.2011.5.25.119.1.1.5.1.4", "hwVplsStateChangeReason": "1.3.6.1.4.1.2011.5.25.119.1.1.8", "sysUpTime": "1.3.6.1.2.1.1.3", "hwVplsPwTnlPolicy": "1.3.6.1.4.1.2011.5.25.119.1.1.5.1.3"]
]

// --- hwVplsVsiDown (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.119.1.2.3
// Fields: hwVplsVsiID, hwVplsStateChangeReason, hwVplsStatus, ifName
// Description: This notification indicates the VSI's state changes to down.
trapMap["1.3.6.1.4.1.2011.5.25.119.1.2.3"] = [
    name: "hwVplsVsiDown",
    fields: ["hwVplsVsiID", "hwVplsStateChangeReason", "hwVplsStatus", "ifName"],
    fieldOids: ["hwVplsVsiID": "1.3.6.1.4.1.2011.5.25.119.1.1.1.1.4", "hwVplsStateChangeReason": "1.3.6.1.4.1.2011.5.25.119.1.1.8", "hwVplsStatus": "1.3.6.1.4.1.2011.5.25.119.1.1.1.1.6", "ifName": "1.3.6.1.2.1.31.1.1.1.1"]
]

// --- hwVplsVsiUp (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.119.1.2.4
// Fields: hwVplsVsiID, hwVplsStateChangeReason, hwVplsStatus, ifName
// Description: This notification indicates the VSI's state changes to up.
trapMap["1.3.6.1.4.1.2011.5.25.119.1.2.4"] = [
    name: "hwVplsVsiUp",
    fields: ["hwVplsVsiID", "hwVplsStateChangeReason", "hwVplsStatus", "ifName"],
    fieldOids: ["hwVplsVsiID": "1.3.6.1.4.1.2011.5.25.119.1.1.1.1.4", "hwVplsStateChangeReason": "1.3.6.1.4.1.2011.5.25.119.1.1.8", "hwVplsStatus": "1.3.6.1.4.1.2011.5.25.119.1.1.1.1.6", "ifName": "1.3.6.1.2.1.31.1.1.1.1"]
]

// --- hwVplsVcBackup (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.119.1.2.5
// Fields: hwVplsPwType, hwVplsStateChangeReason, sysUpTime
// Description: This notification indicates the VC's state changes to backup.
trapMap["1.3.6.1.4.1.2011.5.25.119.1.2.5"] = [
    name: "hwVplsVcBackup",
    fields: ["hwVplsPwType", "hwVplsStateChangeReason", "sysUpTime"],
    fieldOids: ["hwVplsPwType": "1.3.6.1.4.1.2011.5.25.119.1.1.5.1.4", "hwVplsStateChangeReason": "1.3.6.1.4.1.2011.5.25.119.1.1.8", "sysUpTime": "1.3.6.1.2.1.1.3"]
]

// --- hwVplsVsiDeleted (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.119.1.2.6
// Fields: hwVplsVsiID
// Description: This notification indicates the VSI is deleted.
trapMap["1.3.6.1.4.1.2011.5.25.119.1.2.6"] = [
    name: "hwVplsVsiDeleted",
    fields: ["hwVplsVsiID"],
    fieldOids: ["hwVplsVsiID": "1.3.6.1.4.1.2011.5.25.119.1.1.1.1.4"]
]

// --- hwVplsVcDeleted (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.119.1.2.7
// Fields: hwVplsPwType
// Description: This notification indicates the VC is deleted.
trapMap["1.3.6.1.4.1.2011.5.25.119.1.2.7"] = [
    name: "hwVplsVcDeleted",
    fields: ["hwVplsPwType"],
    fieldOids: ["hwVplsPwType": "1.3.6.1.4.1.2011.5.25.119.1.1.5.1.4"]
]

// --- hwVplsVcStatusChange (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.119.1.2.8
// Fields: hwVplsStateChangeReason, hwVplsPwState, hwVplsPwWorkingState, sysUpTime
// Description: This notification indicates the VC is deleted.
trapMap["1.3.6.1.4.1.2011.5.25.119.1.2.8"] = [
    name: "hwVplsVcStatusChange",
    fields: ["hwVplsStateChangeReason", "hwVplsPwState", "hwVplsPwWorkingState", "sysUpTime"],
    fieldOids: ["hwVplsStateChangeReason": "1.3.6.1.4.1.2011.5.25.119.1.1.8", "hwVplsPwState": "1.3.6.1.4.1.2011.5.25.119.1.1.5.1.13", "hwVplsPwWorkingState": "1.3.6.1.4.1.2011.5.25.119.1.1.5.1.14", "sysUpTime": "1.3.6.1.2.1.1.3"]
]

// --- hwVplsVcNumberThresholdExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.119.1.2.9
// Fields: hwL2VpnVcLimitClass, hwL2VpnVsiVcNumber, hwVplsVcNumberUpperThreshold, hwVplsVcNumberMaxNum
// Description: This notification indicates that the number of VPLS VCs reaches the upper threshold.
trapMap["1.3.6.1.4.1.2011.5.25.119.1.2.9"] = [
    name: "hwVplsVcNumberThresholdExceed",
    fields: ["hwL2VpnVcLimitClass", "hwL2VpnVsiVcNumber", "hwVplsVcNumberUpperThreshold", "hwVplsVcNumberMaxNum"],
    fieldOids: ["hwL2VpnVcLimitClass": "1.3.6.1.4.1.2011.5.25.119.8.14", "hwL2VpnVsiVcNumber": "1.3.6.1.4.1.2011.5.25.119.8.11", "hwVplsVcNumberUpperThreshold": "1.3.6.1.4.1.2011.5.25.119.8.13", "hwVplsVcNumberMaxNum": "1.3.6.1.4.1.2011.5.25.119.8.12"]
]

// --- hwVplsVcNumberThresholdClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.119.1.2.10
// Fields: hwL2VpnVcLimitClass, hwL2VpnVsiVcNumber
// Description: This notification indicates that the number of VPLS VCs falls below the lower threshold.
trapMap["1.3.6.1.4.1.2011.5.25.119.1.2.10"] = [
    name: "hwVplsVcNumberThresholdClear",
    fields: ["hwL2VpnVcLimitClass", "hwL2VpnVsiVcNumber"],
    fieldOids: ["hwL2VpnVcLimitClass": "1.3.6.1.4.1.2011.5.25.119.8.14", "hwL2VpnVsiVcNumber": "1.3.6.1.4.1.2011.5.25.119.8.11"]
]

// --- hwVplsVcNumberMaxExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.119.1.2.11
// Fields: hwL2VpnVcLimitClass, hwVplsVcNumberMaxNum
// Description: This notification indicates that the number of VPLS VCs reaches the maximum limit.
trapMap["1.3.6.1.4.1.2011.5.25.119.1.2.11"] = [
    name: "hwVplsVcNumberMaxExceed",
    fields: ["hwL2VpnVcLimitClass", "hwVplsVcNumberMaxNum"],
    fieldOids: ["hwL2VpnVcLimitClass": "1.3.6.1.4.1.2011.5.25.119.8.14", "hwVplsVcNumberMaxNum": "1.3.6.1.4.1.2011.5.25.119.8.12"]
]

// --- hwVplsVcNumberMaxClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.119.1.2.12
// Fields: hwL2VpnVcLimitClass, hwVplsVcNumberMaxNum
// Description: This notification indicates that the number of VPLS VCs is less than 95% of the maximum limit.
trapMap["1.3.6.1.4.1.2011.5.25.119.1.2.12"] = [
    name: "hwVplsVcNumberMaxClear",
    fields: ["hwL2VpnVcLimitClass", "hwVplsVcNumberMaxNum"],
    fieldOids: ["hwL2VpnVcLimitClass": "1.3.6.1.4.1.2011.5.25.119.8.14", "hwVplsVcNumberMaxNum": "1.3.6.1.4.1.2011.5.25.119.8.12"]
]

// --- hwVplsPwRedundancyDegraded (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.119.1.2.13
// Fields: hwVplsVsiProtectGroupMode
// Description: VPLS PW redundancy reported a protect degraded alarm.
trapMap["1.3.6.1.4.1.2011.5.25.119.1.2.13"] = [
    name: "hwVplsPwRedundancyDegraded",
    fields: ["hwVplsVsiProtectGroupMode"],
    fieldOids: ["hwVplsVsiProtectGroupMode": "1.3.6.1.4.1.2011.5.25.119.1.1.17.1.2"]
]

// --- hwVplsPwRedundancyDegradedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.119.1.2.14
// Fields: hwVplsVsiProtectGroupMode
// Description: VPLS PW redundancy reported the clearing of the protect degraded alarm.
trapMap["1.3.6.1.4.1.2011.5.25.119.1.2.14"] = [
    name: "hwVplsPwRedundancyDegradedClear",
    fields: ["hwVplsVsiProtectGroupMode"],
    fieldOids: ["hwVplsVsiProtectGroupMode": "1.3.6.1.4.1.2011.5.25.119.1.1.17.1.2"]
]

// --- hwVplsBLabelNotEnough (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.119.1.2.15
// Fields: hwVplsVsiName
// Description: The block labels of VPLS are not enough.
trapMap["1.3.6.1.4.1.2011.5.25.119.1.2.15"] = [
    name: "hwVplsBLabelNotEnough",
    fields: ["hwVplsVsiName"],
    fieldOids: ["hwVplsVsiName": "1.3.6.1.4.1.2011.5.25.119.1.1.1.1.1"]
]

// --- hwVplsBLabelNotEnoughClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.119.1.2.16
// Fields: hwVplsVsiName
// Description: The block labels of VPLS are enough.
trapMap["1.3.6.1.4.1.2011.5.25.119.1.2.16"] = [
    name: "hwVplsBLabelNotEnoughClear",
    fields: ["hwVplsVsiName"],
    fieldOids: ["hwVplsVsiName": "1.3.6.1.4.1.2011.5.25.119.1.1.1.1.1"]
]

// ===== Parsing logic =====

// Set to true to enable diagnostic logging for this MIB parser
DEBUG = false

LOG_PREFIX = "[HUAWEI-VPLS-EXT-MIB]"
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
