/**
 * Auto-generated from HUAWEI-INFOCENTER-MIB.mib
 * Generated: 2026-08-24T18:28:29.891758600
 * Traps/Notifications (9): hwICLogFileStorageThrd, hwICLogFileAging, hwICInsufficientSpace, hwICLogBufferLose, hwICLogWriteFail, hwICLogWriteFailCleared, hwICLogFileStorageThreshold, hwICLogFileNumThrd, hwICLogHostDomainError
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

// --- hwICLogFileStorageThrd (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.212.2.1
// Fields: hwICLogFileType
// Description: The notification for logfile storage limit.
trapMap["1.3.6.1.4.1.2011.5.25.212.2.1"] = [
    name: "hwICLogFileStorageThrd",
    fields: ["hwICLogFileType"],
    fieldOids: ["hwICLogFileType": "1.3.6.1.4.1.2011.5.25.212.1.6.1"]
]

// --- hwICLogFileAging (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.212.2.2
// Fields: hwICLogFileName
// Description: The notification for logfile aging.
trapMap["1.3.6.1.4.1.2011.5.25.212.2.2"] = [
    name: "hwICLogFileAging",
    fields: ["hwICLogFileName"],
    fieldOids: ["hwICLogFileName": "1.3.6.1.4.1.2011.5.25.212.1.6.2"]
]

// --- hwICInsufficientSpace (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.212.2.3
// Description: The notification for insufficient space.
trapMap["1.3.6.1.4.1.2011.5.25.212.2.3"] = [
    name: "hwICInsufficientSpace",
    fields: [],
    fieldOids: []
]

// --- hwICLogBufferLose (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.212.2.4
// Description: The notification for logfile buffer lose.
trapMap["1.3.6.1.4.1.2011.5.25.212.2.4"] = [
    name: "hwICLogBufferLose",
    fields: [],
    fieldOids: []
]

// --- hwICLogWriteFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.212.2.5
// Fields: hwICLogFileType
// Description: Log written to the log file failed.
trapMap["1.3.6.1.4.1.2011.5.25.212.2.5"] = [
    name: "hwICLogWriteFail",
    fields: ["hwICLogFileType"],
    fieldOids: ["hwICLogFileType": "1.3.6.1.4.1.2011.5.25.212.1.6.1"]
]

// --- hwICLogWriteFailCleared (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.212.2.6
// Fields: hwICLogFileType
// Description: Log written successfully to logfile after writting fail.
trapMap["1.3.6.1.4.1.2011.5.25.212.2.6"] = [
    name: "hwICLogWriteFailCleared",
    fields: ["hwICLogFileType"],
    fieldOids: ["hwICLogFileType": "1.3.6.1.4.1.2011.5.25.212.1.6.1"]
]

// --- hwICLogFileStorageThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.212.2.7
// Fields: hwICLogFileStorageUsage
// Description: Alarm threshed for storage space occupied by log files.
trapMap["1.3.6.1.4.1.2011.5.25.212.2.7"] = [
    name: "hwICLogFileStorageThreshold",
    fields: ["hwICLogFileStorageUsage"],
    fieldOids: ["hwICLogFileStorageUsage": "1.3.6.1.4.1.2011.5.25.212.1.6.3"]
]

// --- hwICLogFileNumThrd (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.212.2.8
// Fields: hwICLogFileType, hwICLogFileCurNum, hwICLogFileThrdNum
// Description: The notification for logfile number limit.
trapMap["1.3.6.1.4.1.2011.5.25.212.2.8"] = [
    name: "hwICLogFileNumThrd",
    fields: ["hwICLogFileType", "hwICLogFileCurNum", "hwICLogFileThrdNum"],
    fieldOids: ["hwICLogFileType": "1.3.6.1.4.1.2011.5.25.212.1.6.1", "hwICLogFileCurNum": "1.3.6.1.4.1.2011.5.25.212.1.6.4", "hwICLogFileThrdNum": "1.3.6.1.4.1.2011.5.25.212.1.6.5"]
]

// --- hwICLogHostDomainError (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.212.2.9
// Description: Error in resolving the domain name of the log server.
trapMap["1.3.6.1.4.1.2011.5.25.212.2.9"] = [
    name: "hwICLogHostDomainError",
    fields: [],
    fieldOids: []
]

// ===== Parsing logic =====

// Set to true to enable diagnostic logging for this MIB parser
DEBUG = false

LOG_PREFIX = "[HUAWEI-INFOCENTER-MIB]"
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
