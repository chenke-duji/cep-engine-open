/**
 * Auto-generated from HUAWEI-RSVPTE-MIB.mib
 * Generated: 2026-08-24T18:28:30.866810500
 * Traps/Notifications (14): hwRsvpTeHelloLost, hwRsvpTeHelloLostRecovery, hwRsvpTeAuthFail, hwRsvpTeAuthSuccess, hwRsvpTeIfNbrThresholdExceed, hwRsvpTeIfNbrThresholdExceedClear, hwRsvpTeIfNbrTotalCountExceed, hwRsvpTeIfNbrTotalCountExceedClear, hwRsvpTeIpConflict, hwRsvpTeIpConflictClear, hwRsvpTeAddrConflict, hwRsvpTeAddrConflictRecovery, hwAddrConflictNode, hwAddrConflictNodeRecovery
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

// --- hwRsvpTeHelloLost (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.148.1.12.2.1
// Fields: hwRsvpTeNbr
// Description: Indicates neighbour of RSVP hello lost.
trapMap["1.3.6.1.4.1.2011.5.25.148.1.12.2.1"] = [
    name: "hwRsvpTeHelloLost",
    fields: ["hwRsvpTeNbr"],
    fieldOids: ["hwRsvpTeNbr": "1.3.6.1.4.1.2011.5.25.148.1.12.1.1"]
]

// --- hwRsvpTeHelloLostRecovery (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.148.1.12.2.2
// Fields: hwRsvpTeNbr
// Description: Indicates neighbour of RSVP hello lost.
trapMap["1.3.6.1.4.1.2011.5.25.148.1.12.2.2"] = [
    name: "hwRsvpTeHelloLostRecovery",
    fields: ["hwRsvpTeNbr"],
    fieldOids: ["hwRsvpTeNbr": "1.3.6.1.4.1.2011.5.25.148.1.12.1.1"]
]

// --- hwRsvpTeAuthFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.148.1.12.2.3
// Fields: hwRsvpTeNbr
// Description: Indicates neighbour of RSVP hello lost.
trapMap["1.3.6.1.4.1.2011.5.25.148.1.12.2.3"] = [
    name: "hwRsvpTeAuthFail",
    fields: ["hwRsvpTeNbr"],
    fieldOids: ["hwRsvpTeNbr": "1.3.6.1.4.1.2011.5.25.148.1.12.1.1"]
]

// --- hwRsvpTeAuthSuccess (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.148.1.12.2.4
// Fields: hwRsvpTeNbr
// Description: Indicates neighbour of RSVP hello lost.
trapMap["1.3.6.1.4.1.2011.5.25.148.1.12.2.4"] = [
    name: "hwRsvpTeAuthSuccess",
    fields: ["hwRsvpTeNbr"],
    fieldOids: ["hwRsvpTeNbr": "1.3.6.1.4.1.2011.5.25.148.1.12.1.1"]
]

// --- hwRsvpTeIfNbrThresholdExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.148.1.12.2.5
// Fields: hwRsvpTeIfName, hwRsvpTeIfNbrCurrentCount, hwRsvpTeIfNbrThreshold, hwRsvpTeIfNbrTotalCount
// Description: Indicates that the number of RSVP interface neighbors has exceeded the upper threshold.
trapMap["1.3.6.1.4.1.2011.5.25.148.1.12.2.5"] = [
    name: "hwRsvpTeIfNbrThresholdExceed",
    fields: ["hwRsvpTeIfName", "hwRsvpTeIfNbrCurrentCount", "hwRsvpTeIfNbrThreshold", "hwRsvpTeIfNbrTotalCount"],
    fieldOids: ["hwRsvpTeIfName": "1.3.6.1.4.1.2011.5.25.148.1.12.1.5", "hwRsvpTeIfNbrCurrentCount": "1.3.6.1.4.1.2011.5.25.148.1.12.1.2", "hwRsvpTeIfNbrThreshold": "1.3.6.1.4.1.2011.5.25.148.1.12.1.3", "hwRsvpTeIfNbrTotalCount": "1.3.6.1.4.1.2011.5.25.148.1.12.1.4"]
]

// --- hwRsvpTeIfNbrThresholdExceedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.148.1.12.2.6
// Fields: hwRsvpTeIfName
// Description: Indicates that the number of RSVP interface neighbors has fallen below the lower threshold.
trapMap["1.3.6.1.4.1.2011.5.25.148.1.12.2.6"] = [
    name: "hwRsvpTeIfNbrThresholdExceedClear",
    fields: ["hwRsvpTeIfName"],
    fieldOids: ["hwRsvpTeIfName": "1.3.6.1.4.1.2011.5.25.148.1.12.1.5"]
]

// --- hwRsvpTeIfNbrTotalCountExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.148.1.12.2.7
// Fields: hwRsvpTeIfName, hwRsvpTeIfNbrTotalCount
// Description: Indicates that the number of RSVP interface neighbors has reached the maximum number.
trapMap["1.3.6.1.4.1.2011.5.25.148.1.12.2.7"] = [
    name: "hwRsvpTeIfNbrTotalCountExceed",
    fields: ["hwRsvpTeIfName", "hwRsvpTeIfNbrTotalCount"],
    fieldOids: ["hwRsvpTeIfName": "1.3.6.1.4.1.2011.5.25.148.1.12.1.5", "hwRsvpTeIfNbrTotalCount": "1.3.6.1.4.1.2011.5.25.148.1.12.1.4"]
]

// --- hwRsvpTeIfNbrTotalCountExceedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.148.1.12.2.8
// Fields: hwRsvpTeIfName
// Description: Indicates that the number of RSVP interface neighbors has fallen below the recovery number.
trapMap["1.3.6.1.4.1.2011.5.25.148.1.12.2.8"] = [
    name: "hwRsvpTeIfNbrTotalCountExceedClear",
    fields: ["hwRsvpTeIfName"],
    fieldOids: ["hwRsvpTeIfName": "1.3.6.1.4.1.2011.5.25.148.1.12.1.5"]
]

// --- hwRsvpTeIpConflict (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.148.1.12.2.9
// Fields: hwRsvpTeIpAddress, hwRsvpTePreviousHop, hwRsvpTeNextHop
// Description: Indicates that RSVP detected a conflicting IP address.
trapMap["1.3.6.1.4.1.2011.5.25.148.1.12.2.9"] = [
    name: "hwRsvpTeIpConflict",
    fields: ["hwRsvpTeIpAddress", "hwRsvpTePreviousHop", "hwRsvpTeNextHop"],
    fieldOids: ["hwRsvpTeIpAddress": "1.3.6.1.4.1.2011.5.25.148.1.12.1.6", "hwRsvpTePreviousHop": "1.3.6.1.4.1.2011.5.25.148.1.12.1.7", "hwRsvpTeNextHop": "1.3.6.1.4.1.2011.5.25.148.1.12.1.8"]
]

// --- hwRsvpTeIpConflictClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.148.1.12.2.10
// Fields: hwRsvpTeIpAddress
// Description: Indicates that RSVP remove a conflicting IP address alarm.
trapMap["1.3.6.1.4.1.2011.5.25.148.1.12.2.10"] = [
    name: "hwRsvpTeIpConflictClear",
    fields: ["hwRsvpTeIpAddress"],
    fieldOids: ["hwRsvpTeIpAddress": "1.3.6.1.4.1.2011.5.25.148.1.12.1.6"]
]

// --- hwRsvpTeAddrConflict (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.148.1.12.2.11
// Fields: hwRsvpTeConflictAddr, hwRsvpTeSuspiciousAddr1, hwRsvpTeSuspiciousAddr2, hwRsvpTeSuspiciousAddr3, hwRsvpTeSuspiciousAddr4, hwRsvpTeSuspiciousAddr5, hwRsvpTeSuspiciousAddr6, hwRsvpTeSuspiciousAddr7, hwRsvpTeSuspiciousAddr8
// Description: Indicates that RSVP detected a conflicting IP address.
trapMap["1.3.6.1.4.1.2011.5.25.148.1.12.2.11"] = [
    name: "hwRsvpTeAddrConflict",
    fields: ["hwRsvpTeConflictAddr", "hwRsvpTeSuspiciousAddr1", "hwRsvpTeSuspiciousAddr2", "hwRsvpTeSuspiciousAddr3", "hwRsvpTeSuspiciousAddr4", "hwRsvpTeSuspiciousAddr5", "hwRsvpTeSuspiciousAddr6", "hwRsvpTeSuspiciousAddr7", "hwRsvpTeSuspiciousAddr8"],
    fieldOids: ["hwRsvpTeConflictAddr": "1.3.6.1.4.1.2011.5.25.148.1.12.1.17", "hwRsvpTeSuspiciousAddr1": "1.3.6.1.4.1.2011.5.25.148.1.12.1.9", "hwRsvpTeSuspiciousAddr2": "1.3.6.1.4.1.2011.5.25.148.1.12.1.10", "hwRsvpTeSuspiciousAddr3": "1.3.6.1.4.1.2011.5.25.148.1.12.1.11", "hwRsvpTeSuspiciousAddr4": "1.3.6.1.4.1.2011.5.25.148.1.12.1.12", "hwRsvpTeSuspiciousAddr5": "1.3.6.1.4.1.2011.5.25.148.1.12.1.13", "hwRsvpTeSuspiciousAddr6": "1.3.6.1.4.1.2011.5.25.148.1.12.1.14", "hwRsvpTeSuspiciousAddr7": "1.3.6.1.4.1.2011.5.25.148.1.12.1.15", "hwRsvpTeSuspiciousAddr8": "1.3.6.1.4.1.2011.5.25.148.1.12.1.16"]
]

// --- hwRsvpTeAddrConflictRecovery (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.148.1.12.2.12
// Fields: hwRsvpTeConflictAddr, hwRsvpTeSuspiciousAddr1, hwRsvpTeSuspiciousAddr2, hwRsvpTeSuspiciousAddr3, hwRsvpTeSuspiciousAddr4, hwRsvpTeSuspiciousAddr5, hwRsvpTeSuspiciousAddr6, hwRsvpTeSuspiciousAddr7, hwRsvpTeSuspiciousAddr8
// Description: Indicates that RSVP remove a conflicting IP address alarm.
trapMap["1.3.6.1.4.1.2011.5.25.148.1.12.2.12"] = [
    name: "hwRsvpTeAddrConflictRecovery",
    fields: ["hwRsvpTeConflictAddr", "hwRsvpTeSuspiciousAddr1", "hwRsvpTeSuspiciousAddr2", "hwRsvpTeSuspiciousAddr3", "hwRsvpTeSuspiciousAddr4", "hwRsvpTeSuspiciousAddr5", "hwRsvpTeSuspiciousAddr6", "hwRsvpTeSuspiciousAddr7", "hwRsvpTeSuspiciousAddr8"],
    fieldOids: ["hwRsvpTeConflictAddr": "1.3.6.1.4.1.2011.5.25.148.1.12.1.17", "hwRsvpTeSuspiciousAddr1": "1.3.6.1.4.1.2011.5.25.148.1.12.1.9", "hwRsvpTeSuspiciousAddr2": "1.3.6.1.4.1.2011.5.25.148.1.12.1.10", "hwRsvpTeSuspiciousAddr3": "1.3.6.1.4.1.2011.5.25.148.1.12.1.11", "hwRsvpTeSuspiciousAddr4": "1.3.6.1.4.1.2011.5.25.148.1.12.1.12", "hwRsvpTeSuspiciousAddr5": "1.3.6.1.4.1.2011.5.25.148.1.12.1.13", "hwRsvpTeSuspiciousAddr6": "1.3.6.1.4.1.2011.5.25.148.1.12.1.14", "hwRsvpTeSuspiciousAddr7": "1.3.6.1.4.1.2011.5.25.148.1.12.1.15", "hwRsvpTeSuspiciousAddr8": "1.3.6.1.4.1.2011.5.25.148.1.12.1.16"]
]

// --- hwAddrConflictNode (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.148.1.12.2.13
// Fields: hwRsvpTeConflictAddr
// Description: Indicates that the ingress of the RSVP tunnel detected a conflicting IP address.
trapMap["1.3.6.1.4.1.2011.5.25.148.1.12.2.13"] = [
    name: "hwAddrConflictNode",
    fields: ["hwRsvpTeConflictAddr"],
    fieldOids: ["hwRsvpTeConflictAddr": "1.3.6.1.4.1.2011.5.25.148.1.12.1.17"]
]

// --- hwAddrConflictNodeRecovery (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.148.1.12.2.14
// Fields: hwRsvpTeConflictAddr
// Description: Indicates that the ingress of the RSVP tunnel remove a conflicting IP address alarm.
trapMap["1.3.6.1.4.1.2011.5.25.148.1.12.2.14"] = [
    name: "hwAddrConflictNodeRecovery",
    fields: ["hwRsvpTeConflictAddr"],
    fieldOids: ["hwRsvpTeConflictAddr": "1.3.6.1.4.1.2011.5.25.148.1.12.1.17"]
]

// ===== Parsing logic =====

// Set to true to enable diagnostic logging for this MIB parser
DEBUG = false

LOG_PREFIX = "[HUAWEI-RSVPTE-MIB]"
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
