/**
 * Auto-generated from HUAWEI-DHCPV6-SERVER-MIB.mib
 * Generated: 2026-08-24T18:28:29.426978500
 * Traps/Notifications (12): hwAllocatedIpLimitReachAlarm, hwAllocatedIpLimitResumeAlarm, hwAllocatedIpThresholdReachAlarm, hwAllocatedIpThresholdResumeAlarm, hwGlobalAllocatedIpLimitReachAlarm, hwGlobalAllocatedIpLimitResumeAlarm, hwGlobalAllocatedIpThresholdReachAlarm, hwGlobalAllocatedIpThresholdResumeAlarm, hwGlobalAllocatedPrefixLimitReachAlarm, hwGlobalAllocatedPrefixLimitResumeAlarm, hwGlobalAllocatedPrefixThresholdReachAlarm, hwGlobalAllocatedPrefixThresholdResumeAlarm
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

// --- hwAllocatedIpLimitReachAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.7.4.2.1
// Fields: hwAllocatedIpLimitValue
// Description: This object indicates that an alarm is generated when the number of assigned IPv6 addresses reaches the allowed maximum number.
trapMap["1.3.6.1.4.1.2011.5.7.4.2.1"] = [
    name: "hwAllocatedIpLimitReachAlarm",
    fields: ["hwAllocatedIpLimitValue"],
    fieldOids: ["hwAllocatedIpLimitValue": "1.3.6.1.4.1.2011.5.7.4.1.1"]
]

// --- hwAllocatedIpLimitResumeAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.7.4.2.2
// Fields: hwAllocatedIpLimitValue
// Description: This object indicates that a clear alarm is generated when the number of assigned IPv6 addresses falls below 90% of the allowed maximum number.
trapMap["1.3.6.1.4.1.2011.5.7.4.2.2"] = [
    name: "hwAllocatedIpLimitResumeAlarm",
    fields: ["hwAllocatedIpLimitValue"],
    fieldOids: ["hwAllocatedIpLimitValue": "1.3.6.1.4.1.2011.5.7.4.1.1"]
]

// --- hwAllocatedIpThresholdReachAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.7.4.2.3
// Fields: hwAllocatedIpThresholdValue
// Description: This object indicates that an alarm is generated when the number of assigned IPv6 addresses reaches 80% of the allowed maximum number.
trapMap["1.3.6.1.4.1.2011.5.7.4.2.3"] = [
    name: "hwAllocatedIpThresholdReachAlarm",
    fields: ["hwAllocatedIpThresholdValue"],
    fieldOids: ["hwAllocatedIpThresholdValue": "1.3.6.1.4.1.2011.5.7.4.1.2"]
]

// --- hwAllocatedIpThresholdResumeAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.7.4.2.4
// Fields: hwAllocatedIpThresholdValue
// Description: This object indicates that a clear alarm is generated when the number of assigned IPv6 addresses falls below 70% of the allowed maximum number.
trapMap["1.3.6.1.4.1.2011.5.7.4.2.4"] = [
    name: "hwAllocatedIpThresholdResumeAlarm",
    fields: ["hwAllocatedIpThresholdValue"],
    fieldOids: ["hwAllocatedIpThresholdValue": "1.3.6.1.4.1.2011.5.7.4.1.2"]
]

// --- hwGlobalAllocatedIpLimitReachAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.7.4.2.5
// Fields: hwGlobalAllocatedIpLimitValue
// Description: This object indicates that an alarm is generated when the number of assigned IPv6 addresses reaches the globally allowed maximum number.
trapMap["1.3.6.1.4.1.2011.5.7.4.2.5"] = [
    name: "hwGlobalAllocatedIpLimitReachAlarm",
    fields: ["hwGlobalAllocatedIpLimitValue"],
    fieldOids: ["hwGlobalAllocatedIpLimitValue": "1.3.6.1.4.1.2011.5.7.4.1.3"]
]

// --- hwGlobalAllocatedIpLimitResumeAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.7.4.2.6
// Fields: hwGlobalAllocatedIpLimitValue
// Description: This object indicates that a clear alarm is generated when the number of assigned IPv6 addresses falls below 90% of the globally allowed maximum number.
trapMap["1.3.6.1.4.1.2011.5.7.4.2.6"] = [
    name: "hwGlobalAllocatedIpLimitResumeAlarm",
    fields: ["hwGlobalAllocatedIpLimitValue"],
    fieldOids: ["hwGlobalAllocatedIpLimitValue": "1.3.6.1.4.1.2011.5.7.4.1.3"]
]

// --- hwGlobalAllocatedIpThresholdReachAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.7.4.2.7
// Fields: hwGlobalAllocatedIpThresholdValue, hwGlobalAllocatedIpLimitValue
// Description: This object indicates that an alarm is generated when the number of assigned IPv6 addresses reaches 80% of the globally allowed maximum number.
trapMap["1.3.6.1.4.1.2011.5.7.4.2.7"] = [
    name: "hwGlobalAllocatedIpThresholdReachAlarm",
    fields: ["hwGlobalAllocatedIpThresholdValue", "hwGlobalAllocatedIpLimitValue"],
    fieldOids: ["hwGlobalAllocatedIpThresholdValue": "1.3.6.1.4.1.2011.5.7.4.1.4", "hwGlobalAllocatedIpLimitValue": "1.3.6.1.4.1.2011.5.7.4.1.3"]
]

// --- hwGlobalAllocatedIpThresholdResumeAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.7.4.2.8
// Fields: hwGlobalAllocatedIpThresholdValue, hwGlobalAllocatedIpLimitValue
// Description: This object indicates that a clear alarm is generated when the number of assigned IPv6 addresses falls below 70% of the globally allowed maximum number.
trapMap["1.3.6.1.4.1.2011.5.7.4.2.8"] = [
    name: "hwGlobalAllocatedIpThresholdResumeAlarm",
    fields: ["hwGlobalAllocatedIpThresholdValue", "hwGlobalAllocatedIpLimitValue"],
    fieldOids: ["hwGlobalAllocatedIpThresholdValue": "1.3.6.1.4.1.2011.5.7.4.1.4", "hwGlobalAllocatedIpLimitValue": "1.3.6.1.4.1.2011.5.7.4.1.3"]
]

// --- hwGlobalAllocatedPrefixLimitReachAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.7.4.2.9
// Fields: hwGlobalAllocatedPrefixLimitValue
// Description: This object indicates that an alarm is generated when the number of assigned IPv6 prefixes reaches the globally allowed maximum number.
trapMap["1.3.6.1.4.1.2011.5.7.4.2.9"] = [
    name: "hwGlobalAllocatedPrefixLimitReachAlarm",
    fields: ["hwGlobalAllocatedPrefixLimitValue"],
    fieldOids: ["hwGlobalAllocatedPrefixLimitValue": "1.3.6.1.4.1.2011.5.7.4.1.5"]
]

// --- hwGlobalAllocatedPrefixLimitResumeAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.7.4.2.10
// Fields: hwGlobalAllocatedPrefixLimitValue
// Description: This object indicates that a clear alarm is generated when the number of assigned IPv6 prefixes falls below 90% of the globally allowed maximum number.
trapMap["1.3.6.1.4.1.2011.5.7.4.2.10"] = [
    name: "hwGlobalAllocatedPrefixLimitResumeAlarm",
    fields: ["hwGlobalAllocatedPrefixLimitValue"],
    fieldOids: ["hwGlobalAllocatedPrefixLimitValue": "1.3.6.1.4.1.2011.5.7.4.1.5"]
]

// --- hwGlobalAllocatedPrefixThresholdReachAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.7.4.2.11
// Fields: hwGlobalAllocatedPreifxThresholdValue, hwGlobalAllocatedPrefixLimitValue
// Description: This object indicates that an alarm is generated when the number of assigned IPv6 prefixes reaches 80% of the globally allowed maximum number.
trapMap["1.3.6.1.4.1.2011.5.7.4.2.11"] = [
    name: "hwGlobalAllocatedPrefixThresholdReachAlarm",
    fields: ["hwGlobalAllocatedPreifxThresholdValue", "hwGlobalAllocatedPrefixLimitValue"],
    fieldOids: ["hwGlobalAllocatedPreifxThresholdValue": "1.3.6.1.4.1.2011.5.7.4.1.6", "hwGlobalAllocatedPrefixLimitValue": "1.3.6.1.4.1.2011.5.7.4.1.5"]
]

// --- hwGlobalAllocatedPrefixThresholdResumeAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.7.4.2.12
// Fields: hwGlobalAllocatedPreifxThresholdValue, hwGlobalAllocatedPrefixLimitValue
// Description: This object indicates that a clear alarm is generated when the number of assigned IPv6 prefixes falls below 70% of the globally allowed maximum number.
trapMap["1.3.6.1.4.1.2011.5.7.4.2.12"] = [
    name: "hwGlobalAllocatedPrefixThresholdResumeAlarm",
    fields: ["hwGlobalAllocatedPreifxThresholdValue", "hwGlobalAllocatedPrefixLimitValue"],
    fieldOids: ["hwGlobalAllocatedPreifxThresholdValue": "1.3.6.1.4.1.2011.5.7.4.1.6", "hwGlobalAllocatedPrefixLimitValue": "1.3.6.1.4.1.2011.5.7.4.1.5"]
]

// ===== Parsing logic =====

// Set to true to enable diagnostic logging for this MIB parser
DEBUG = false

LOG_PREFIX = "[HUAWEI-DHCPV6-SERVER-MIB]"
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
