/**
 * Auto-generated from HUAWEI-IMA-MIB.mib
 * Generated: 2026-08-24T18:28:29.884756700
 * Traps/Notifications (16): hwImaGroupNeDownAlarm, hwImaGroupNeDownAlarmResume, hwImaGroupFeDownAlarm, hwImaGroupFeDownAlarmResume, hwImaGroupTxClkMismatch, hwImaGroupTxClkMismatchResume, hwImaLinkLifAlarm, hwImaLinkLifAlarmResume, hwImaLinkLodsAlarm, hwImaLinkLodsAlarmResume, hwImaLinkRfiAlarm, hwImaLinkRfiAlarmResume, hwImaLinkFeTxUnusableAlarm, hwImaLinkFeTxUnusableAlarmResume, hwImaLinkFeRxUnusableAlarm, hwImaLinkFeRxUnusableAlarmResume
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

// --- hwImaGroupNeDownAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.176.3.1
// Fields: hwImaGroupName
// Description: This object indicates the near-end IMA group failure.
trapMap["1.3.6.1.4.1.2011.5.25.176.3.1"] = [
    name: "hwImaGroupNeDownAlarm",
    fields: ["hwImaGroupName"],
    fieldOids: ["hwImaGroupName": "1.3.6.1.4.1.2011.5.25.176.1.1.1.22"]
]

// --- hwImaGroupNeDownAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.176.3.2
// Fields: hwImaGroupName
// Description: This object indicates that the alarm for the near-end IMA group failure is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.176.3.2"] = [
    name: "hwImaGroupNeDownAlarmResume",
    fields: ["hwImaGroupName"],
    fieldOids: ["hwImaGroupName": "1.3.6.1.4.1.2011.5.25.176.1.1.1.22"]
]

// --- hwImaGroupFeDownAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.176.3.3
// Fields: hwImaGroupName
// Description: This object indicates the far-end IMA group failure.
trapMap["1.3.6.1.4.1.2011.5.25.176.3.3"] = [
    name: "hwImaGroupFeDownAlarm",
    fields: ["hwImaGroupName"],
    fieldOids: ["hwImaGroupName": "1.3.6.1.4.1.2011.5.25.176.1.1.1.22"]
]

// --- hwImaGroupFeDownAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.176.3.4
// Fields: hwImaGroupName
// Description: This object indicates that the alarm for the far-end IMA group failure is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.176.3.4"] = [
    name: "hwImaGroupFeDownAlarmResume",
    fields: ["hwImaGroupName"],
    fieldOids: ["hwImaGroupName": "1.3.6.1.4.1.2011.5.25.176.1.1.1.22"]
]

// --- hwImaGroupTxClkMismatch (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.176.3.5
// Fields: hwImaGroupName
// Description: This object indicates that an alarm is generated when the transmit clock modes at the two ends of the IMA group do not match.
trapMap["1.3.6.1.4.1.2011.5.25.176.3.5"] = [
    name: "hwImaGroupTxClkMismatch",
    fields: ["hwImaGroupName"],
    fieldOids: ["hwImaGroupName": "1.3.6.1.4.1.2011.5.25.176.1.1.1.22"]
]

// --- hwImaGroupTxClkMismatchResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.176.3.6
// Fields: hwImaGroupName
// Description: This object indicates that the alarm generated when the transmit clock modes at the two ends of the IMA group did not match is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.176.3.6"] = [
    name: "hwImaGroupTxClkMismatchResume",
    fields: ["hwImaGroupName"],
    fieldOids: ["hwImaGroupName": "1.3.6.1.4.1.2011.5.25.176.1.1.1.22"]
]

// --- hwImaLinkLifAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.176.3.7
// Fields: hwImaLinkName
// Description: This object indicates that an alarm is generated when out of frame (OOF) occurs on an IMA link.
trapMap["1.3.6.1.4.1.2011.5.25.176.3.7"] = [
    name: "hwImaLinkLifAlarm",
    fields: ["hwImaLinkName"],
    fieldOids: ["hwImaLinkName": "1.3.6.1.4.1.2011.5.25.176.1.2.1.52"]
]

// --- hwImaLinkLifAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.176.3.8
// Fields: hwImaLinkName
// Description: This object indicates that the alarm generated for OOF on the IMA link is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.176.3.8"] = [
    name: "hwImaLinkLifAlarmResume",
    fields: ["hwImaLinkName"],
    fieldOids: ["hwImaLinkName": "1.3.6.1.4.1.2011.5.25.176.1.2.1.52"]
]

// --- hwImaLinkLodsAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.176.3.9
// Fields: hwImaLinkName
// Description: This object indicates that an alarm is generated when the differentiated delay on an IMA link exceeds the upper threshold.
trapMap["1.3.6.1.4.1.2011.5.25.176.3.9"] = [
    name: "hwImaLinkLodsAlarm",
    fields: ["hwImaLinkName"],
    fieldOids: ["hwImaLinkName": "1.3.6.1.4.1.2011.5.25.176.1.2.1.52"]
]

// --- hwImaLinkLodsAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.176.3.10
// Fields: hwImaLinkName
// Description: This object indicates that the alarm generated when the differentiated delay on the IMA link exceeded the upper threshold is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.176.3.10"] = [
    name: "hwImaLinkLodsAlarmResume",
    fields: ["hwImaLinkName"],
    fieldOids: ["hwImaLinkName": "1.3.6.1.4.1.2011.5.25.176.1.2.1.52"]
]

// --- hwImaLinkRfiAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.176.3.11
// Fields: hwImaLinkName
// Description: This object indicates that an alarm is generated when the far-end IMA link fails.
trapMap["1.3.6.1.4.1.2011.5.25.176.3.11"] = [
    name: "hwImaLinkRfiAlarm",
    fields: ["hwImaLinkName"],
    fieldOids: ["hwImaLinkName": "1.3.6.1.4.1.2011.5.25.176.1.2.1.52"]
]

// --- hwImaLinkRfiAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.176.3.12
// Fields: hwImaLinkName
// Description: This object indicates that the alarm generated for the far-end IMA link failure is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.176.3.12"] = [
    name: "hwImaLinkRfiAlarmResume",
    fields: ["hwImaLinkName"],
    fieldOids: ["hwImaLinkName": "1.3.6.1.4.1.2011.5.25.176.1.2.1.52"]
]

// --- hwImaLinkFeTxUnusableAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.176.3.13
// Fields: hwImaLinkName
// Description: This object indicates that an alarm is generated when the IMA transmit link at the far end goes abnormal.
trapMap["1.3.6.1.4.1.2011.5.25.176.3.13"] = [
    name: "hwImaLinkFeTxUnusableAlarm",
    fields: ["hwImaLinkName"],
    fieldOids: ["hwImaLinkName": "1.3.6.1.4.1.2011.5.25.176.1.2.1.52"]
]

// --- hwImaLinkFeTxUnusableAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.176.3.14
// Fields: hwImaLinkName
// Description: This object indicates that the alarm generated for the abnormal IMA transmit link at the far end is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.176.3.14"] = [
    name: "hwImaLinkFeTxUnusableAlarmResume",
    fields: ["hwImaLinkName"],
    fieldOids: ["hwImaLinkName": "1.3.6.1.4.1.2011.5.25.176.1.2.1.52"]
]

// --- hwImaLinkFeRxUnusableAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.176.3.15
// Fields: hwImaLinkName
// Description: This object indicates that an alarm is generated when the IMA receive link at the far end goes abnormal.
trapMap["1.3.6.1.4.1.2011.5.25.176.3.15"] = [
    name: "hwImaLinkFeRxUnusableAlarm",
    fields: ["hwImaLinkName"],
    fieldOids: ["hwImaLinkName": "1.3.6.1.4.1.2011.5.25.176.1.2.1.52"]
]

// --- hwImaLinkFeRxUnusableAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.176.3.16
// Fields: hwImaLinkName
// Description: This object indicates that the alarm generated for the abnormal IMA receive link at the far end is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.176.3.16"] = [
    name: "hwImaLinkFeRxUnusableAlarmResume",
    fields: ["hwImaLinkName"],
    fieldOids: ["hwImaLinkName": "1.3.6.1.4.1.2011.5.25.176.1.2.1.52"]
]

// ===== Parsing logic =====

// Set to true to enable diagnostic logging for this MIB parser
DEBUG = false

LOG_PREFIX = "[HUAWEI-IMA-MIB]"
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
