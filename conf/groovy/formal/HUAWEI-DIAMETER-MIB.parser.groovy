/**
 * Auto-generated from HUAWEI-DIAMETER-MIB.mib
 * Generated: 2026-08-24T18:28:29.431978
 * Traps/Notifications (8): hwDiameterPeerFaulty, hwDiameterPeerFaultyResume, hwDiameterPeerFaultyV6, hwDiameterPeerFaultyV6Resume, hwDiameterCpEnableFail, hwDiameterCpEnableSuccess, hwDiameterEnableFail, hwDiameterEnableSuccess
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

// --- hwDiameterPeerFaulty (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.239.4.1
// Fields: hwDiameterPeerHostName, hwDiameterPeerIP, hwDiameterPeerPort, hwDiameterLocalIf, hwDiameterGrpLinkLocalPort
// Description: This object indicates that the link between the host and the policy server fails.
trapMap["1.3.6.1.4.1.2011.5.25.239.4.1"] = [
    name: "hwDiameterPeerFaulty",
    fields: ["hwDiameterPeerHostName", "hwDiameterPeerIP", "hwDiameterPeerPort", "hwDiameterLocalIf", "hwDiameterGrpLinkLocalPort"],
    fieldOids: ["hwDiameterPeerHostName": "1.3.6.1.4.1.2011.5.25.239.2.4.1.4", "hwDiameterPeerIP": "1.3.6.1.4.1.2011.5.25.239.2.4.1.2", "hwDiameterPeerPort": "1.3.6.1.4.1.2011.5.25.239.2.4.1.3", "hwDiameterLocalIf": "1.3.6.1.4.1.2011.5.25.239.2.3.1.2", "hwDiameterGrpLinkLocalPort": "1.3.6.1.4.1.2011.5.25.239.2.5.1.4"]
]

// --- hwDiameterPeerFaultyResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.239.4.2
// Fields: hwDiameterPeerHostName, hwDiameterPeerIP, hwDiameterPeerPort, hwDiameterLocalIf, hwDiameterGrpLinkLocalPort
// Description: This object indicates that the failure of the link between the host and the policy server is removed.
trapMap["1.3.6.1.4.1.2011.5.25.239.4.2"] = [
    name: "hwDiameterPeerFaultyResume",
    fields: ["hwDiameterPeerHostName", "hwDiameterPeerIP", "hwDiameterPeerPort", "hwDiameterLocalIf", "hwDiameterGrpLinkLocalPort"],
    fieldOids: ["hwDiameterPeerHostName": "1.3.6.1.4.1.2011.5.25.239.2.4.1.4", "hwDiameterPeerIP": "1.3.6.1.4.1.2011.5.25.239.2.4.1.2", "hwDiameterPeerPort": "1.3.6.1.4.1.2011.5.25.239.2.4.1.3", "hwDiameterLocalIf": "1.3.6.1.4.1.2011.5.25.239.2.3.1.2", "hwDiameterGrpLinkLocalPort": "1.3.6.1.4.1.2011.5.25.239.2.5.1.4"]
]

// --- hwDiameterPeerFaultyV6 (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.239.4.3
// Fields: hwDiameterPeerHostName, hwDiameterPeerIpStr, hwDiameterPeerPort, hwDiameterLocalIf, hwDiameterGrpLinkLocalPort
// Description: The link between pcef and pcrf is abnormal.
trapMap["1.3.6.1.4.1.2011.5.25.239.4.3"] = [
    name: "hwDiameterPeerFaultyV6",
    fields: ["hwDiameterPeerHostName", "hwDiameterPeerIpStr", "hwDiameterPeerPort", "hwDiameterLocalIf", "hwDiameterGrpLinkLocalPort"],
    fieldOids: ["hwDiameterPeerHostName": "1.3.6.1.4.1.2011.5.25.239.2.4.1.4", "hwDiameterPeerIpStr": "1.3.6.1.4.1.2011.5.25.239.7.1", "hwDiameterPeerPort": "1.3.6.1.4.1.2011.5.25.239.2.4.1.3", "hwDiameterLocalIf": "1.3.6.1.4.1.2011.5.25.239.2.3.1.2", "hwDiameterGrpLinkLocalPort": "1.3.6.1.4.1.2011.5.25.239.2.5.1.4"]
]

// --- hwDiameterPeerFaultyV6Resume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.239.4.4
// Fields: hwDiameterPeerHostName, hwDiameterPeerIpStr, hwDiameterPeerPort, hwDiameterLocalIf, hwDiameterGrpLinkLocalPort
// Description: The link between pcef and pcrf is normal.
trapMap["1.3.6.1.4.1.2011.5.25.239.4.4"] = [
    name: "hwDiameterPeerFaultyV6Resume",
    fields: ["hwDiameterPeerHostName", "hwDiameterPeerIpStr", "hwDiameterPeerPort", "hwDiameterLocalIf", "hwDiameterGrpLinkLocalPort"],
    fieldOids: ["hwDiameterPeerHostName": "1.3.6.1.4.1.2011.5.25.239.2.4.1.4", "hwDiameterPeerIpStr": "1.3.6.1.4.1.2011.5.25.239.7.1", "hwDiameterPeerPort": "1.3.6.1.4.1.2011.5.25.239.2.4.1.3", "hwDiameterLocalIf": "1.3.6.1.4.1.2011.5.25.239.2.3.1.2", "hwDiameterGrpLinkLocalPort": "1.3.6.1.4.1.2011.5.25.239.2.5.1.4"]
]

// --- hwDiameterCpEnableFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.239.4.5
// Fields: hwDiameterUpmngInstance, hwDiameterReasonCode, hwDiameterReason
// Description: The diameter enable fail alarm.
trapMap["1.3.6.1.4.1.2011.5.25.239.4.5"] = [
    name: "hwDiameterCpEnableFail",
    fields: ["hwDiameterUpmngInstance", "hwDiameterReasonCode", "hwDiameterReason"],
    fieldOids: ["hwDiameterUpmngInstance": "1.3.6.1.4.1.2011.5.25.239.3.1", "hwDiameterReasonCode": "1.3.6.1.4.1.2011.5.25.239.3.3", "hwDiameterReason": "1.3.6.1.4.1.2011.5.25.239.3.2"]
]

// --- hwDiameterCpEnableSuccess (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.239.4.6
// Fields: hwDiameterUpmngInstance, hwDiameterReasonCode, hwDiameterReason
// Description: The diameter enable success alarm.
trapMap["1.3.6.1.4.1.2011.5.25.239.4.6"] = [
    name: "hwDiameterCpEnableSuccess",
    fields: ["hwDiameterUpmngInstance", "hwDiameterReasonCode", "hwDiameterReason"],
    fieldOids: ["hwDiameterUpmngInstance": "1.3.6.1.4.1.2011.5.25.239.3.1", "hwDiameterReasonCode": "1.3.6.1.4.1.2011.5.25.239.3.3", "hwDiameterReason": "1.3.6.1.4.1.2011.5.25.239.3.2"]
]

// --- hwDiameterEnableFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.239.4.7
// Fields: hwDiameterReasonCode, hwDiameterReason
// Description: The diameter enable fail alarm.
trapMap["1.3.6.1.4.1.2011.5.25.239.4.7"] = [
    name: "hwDiameterEnableFail",
    fields: ["hwDiameterReasonCode", "hwDiameterReason"],
    fieldOids: ["hwDiameterReasonCode": "1.3.6.1.4.1.2011.5.25.239.3.3", "hwDiameterReason": "1.3.6.1.4.1.2011.5.25.239.3.2"]
]

// --- hwDiameterEnableSuccess (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.239.4.8
// Fields: hwDiameterReasonCode, hwDiameterReason
// Description: The diameter enable success alarm.
trapMap["1.3.6.1.4.1.2011.5.25.239.4.8"] = [
    name: "hwDiameterEnableSuccess",
    fields: ["hwDiameterReasonCode", "hwDiameterReason"],
    fieldOids: ["hwDiameterReasonCode": "1.3.6.1.4.1.2011.5.25.239.3.3", "hwDiameterReason": "1.3.6.1.4.1.2011.5.25.239.3.2"]
]

// ===== Parsing logic =====

// Set to true to enable diagnostic logging for this MIB parser
DEBUG = false

LOG_PREFIX = "[HUAWEI-DIAMETER-MIB]"
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
