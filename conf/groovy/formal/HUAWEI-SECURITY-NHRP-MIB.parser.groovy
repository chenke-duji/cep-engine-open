/**
 * Auto-generated from HUAWEI-SECURITY-NHRP-MIB.mib
 * Generated: 2026-08-24T18:28:30.899306300
 * Traps/Notifications (10): hwNHRPPeerADD, hwNHRPPeerDELETE, hwNHRPHubUP, hwNHRPHubDOWN, hwNHRPPeerThresholdExceedAlarm, hwNHRPPeerThresholdExceedResume, hwNHRPDynPeerThresholdExceedAlarm, hwNHRPDynPeerThresholdExceedResume, hwNHRPLocalPeerLimitReachAlarm, hwNHRPLocalPeerLimitResume
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

// --- hwNHRPPeerADD (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.122.73.0.2.1
// Fields: hwNHRPInterface, hwNHRPProAddress, hwNHRPProMask, hwNHRPNextHop, hwNHRPNbmaAddress, hwNHRPType
// Description: NHRP peer is added.
trapMap["1.3.6.1.4.1.2011.6.122.73.0.2.1"] = [
    name: "hwNHRPPeerADD",
    fields: ["hwNHRPInterface", "hwNHRPProAddress", "hwNHRPProMask", "hwNHRPNextHop", "hwNHRPNbmaAddress", "hwNHRPType"],
    fieldOids: ["hwNHRPInterface": "1.3.6.1.4.1.2011.6.122.73.0.1.1", "hwNHRPProAddress": "1.3.6.1.4.1.2011.6.122.73.0.1.2", "hwNHRPProMask": "1.3.6.1.4.1.2011.6.122.73.0.1.3", "hwNHRPNextHop": "1.3.6.1.4.1.2011.6.122.73.0.1.4", "hwNHRPNbmaAddress": "1.3.6.1.4.1.2011.6.122.73.0.1.5", "hwNHRPType": "1.3.6.1.4.1.2011.6.122.73.0.1.6"]
]

// --- hwNHRPPeerDELETE (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.122.73.0.2.2
// Fields: hwNHRPInterface, hwNHRPProAddress, hwNHRPProMask, hwNHRPNextHop, hwNHRPNbmaAddress, hwNHRPType, hwNHRPPeerDelReason
// Description: NHRP peer is deteled.
trapMap["1.3.6.1.4.1.2011.6.122.73.0.2.2"] = [
    name: "hwNHRPPeerDELETE",
    fields: ["hwNHRPInterface", "hwNHRPProAddress", "hwNHRPProMask", "hwNHRPNextHop", "hwNHRPNbmaAddress", "hwNHRPType", "hwNHRPPeerDelReason"],
    fieldOids: ["hwNHRPInterface": "1.3.6.1.4.1.2011.6.122.73.0.1.1", "hwNHRPProAddress": "1.3.6.1.4.1.2011.6.122.73.0.1.2", "hwNHRPProMask": "1.3.6.1.4.1.2011.6.122.73.0.1.3", "hwNHRPNextHop": "1.3.6.1.4.1.2011.6.122.73.0.1.4", "hwNHRPNbmaAddress": "1.3.6.1.4.1.2011.6.122.73.0.1.5", "hwNHRPType": "1.3.6.1.4.1.2011.6.122.73.0.1.6", "hwNHRPPeerDelReason": "1.3.6.1.4.1.2011.6.122.73.0.1.7"]
]

// --- hwNHRPHubUP (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.122.73.0.2.3
// Fields: hwNHRPInterface, hwNHRPProAddress, hwNHRPProMask, hwNHRPNextHop, hwNHRPNbmaAddress, hwNHRPType
// Description: NHRP hub is up.
trapMap["1.3.6.1.4.1.2011.6.122.73.0.2.3"] = [
    name: "hwNHRPHubUP",
    fields: ["hwNHRPInterface", "hwNHRPProAddress", "hwNHRPProMask", "hwNHRPNextHop", "hwNHRPNbmaAddress", "hwNHRPType"],
    fieldOids: ["hwNHRPInterface": "1.3.6.1.4.1.2011.6.122.73.0.1.1", "hwNHRPProAddress": "1.3.6.1.4.1.2011.6.122.73.0.1.2", "hwNHRPProMask": "1.3.6.1.4.1.2011.6.122.73.0.1.3", "hwNHRPNextHop": "1.3.6.1.4.1.2011.6.122.73.0.1.4", "hwNHRPNbmaAddress": "1.3.6.1.4.1.2011.6.122.73.0.1.5", "hwNHRPType": "1.3.6.1.4.1.2011.6.122.73.0.1.6"]
]

// --- hwNHRPHubDOWN (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.122.73.0.2.4
// Fields: hwNHRPInterface, hwNHRPProAddress, hwNHRPProMask, hwNHRPNextHop, hwNHRPNbmaAddress
// Description: NHRP hub is down .
trapMap["1.3.6.1.4.1.2011.6.122.73.0.2.4"] = [
    name: "hwNHRPHubDOWN",
    fields: ["hwNHRPInterface", "hwNHRPProAddress", "hwNHRPProMask", "hwNHRPNextHop", "hwNHRPNbmaAddress"],
    fieldOids: ["hwNHRPInterface": "1.3.6.1.4.1.2011.6.122.73.0.1.1", "hwNHRPProAddress": "1.3.6.1.4.1.2011.6.122.73.0.1.2", "hwNHRPProMask": "1.3.6.1.4.1.2011.6.122.73.0.1.3", "hwNHRPNextHop": "1.3.6.1.4.1.2011.6.122.73.0.1.4", "hwNHRPNbmaAddress": "1.3.6.1.4.1.2011.6.122.73.0.1.5"]
]

// --- hwNHRPPeerThresholdExceedAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.122.73.0.2.5
// Fields: hwNHRPThrehold, hwNHRPPeerCnt
// Description: The number of NHRP peer reached the alarm threshold.
trapMap["1.3.6.1.4.1.2011.6.122.73.0.2.5"] = [
    name: "hwNHRPPeerThresholdExceedAlarm",
    fields: ["hwNHRPThrehold", "hwNHRPPeerCnt"],
    fieldOids: ["hwNHRPThrehold": "1.3.6.1.4.1.2011.6.122.73.0.1.8", "hwNHRPPeerCnt": "1.3.6.1.4.1.2011.6.122.73.0.1.9"]
]

// --- hwNHRPPeerThresholdExceedResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.122.73.0.2.6
// Fields: hwNHRPThrehold, hwNHRPPeerCnt
// Description: The number of NHRP peers fell below the alarm threshold.
trapMap["1.3.6.1.4.1.2011.6.122.73.0.2.6"] = [
    name: "hwNHRPPeerThresholdExceedResume",
    fields: ["hwNHRPThrehold", "hwNHRPPeerCnt"],
    fieldOids: ["hwNHRPThrehold": "1.3.6.1.4.1.2011.6.122.73.0.1.8", "hwNHRPPeerCnt": "1.3.6.1.4.1.2011.6.122.73.0.1.9"]
]

// --- hwNHRPDynPeerThresholdExceedAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.122.73.0.2.7
// Fields: hwNHRPDynPeerThrehold, hwNHRPDynPeerCnt
// Description: The number of NHRP Dynamic peer reached the alarm threshold.
trapMap["1.3.6.1.4.1.2011.6.122.73.0.2.7"] = [
    name: "hwNHRPDynPeerThresholdExceedAlarm",
    fields: ["hwNHRPDynPeerThrehold", "hwNHRPDynPeerCnt"],
    fieldOids: ["hwNHRPDynPeerThrehold": "1.3.6.1.4.1.2011.6.122.73.0.1.10", "hwNHRPDynPeerCnt": "1.3.6.1.4.1.2011.6.122.73.0.1.11"]
]

// --- hwNHRPDynPeerThresholdExceedResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.122.73.0.2.8
// Fields: hwNHRPDynPeerThrehold, hwNHRPDynPeerCnt
// Description: The number of NHRP Dynamic peers fell below the alarm threshold.
trapMap["1.3.6.1.4.1.2011.6.122.73.0.2.8"] = [
    name: "hwNHRPDynPeerThresholdExceedResume",
    fields: ["hwNHRPDynPeerThrehold", "hwNHRPDynPeerCnt"],
    fieldOids: ["hwNHRPDynPeerThrehold": "1.3.6.1.4.1.2011.6.122.73.0.1.10", "hwNHRPDynPeerCnt": "1.3.6.1.4.1.2011.6.122.73.0.1.11"]
]

// --- hwNHRPLocalPeerLimitReachAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.122.73.0.2.9
// Fields: hwNHRPLocalPeerLimit, hwNHRPLocalPeerCnt
// Description: The number of NHRP Local peer reached the alarm limit.
trapMap["1.3.6.1.4.1.2011.6.122.73.0.2.9"] = [
    name: "hwNHRPLocalPeerLimitReachAlarm",
    fields: ["hwNHRPLocalPeerLimit", "hwNHRPLocalPeerCnt"],
    fieldOids: ["hwNHRPLocalPeerLimit": "1.3.6.1.4.1.2011.6.122.73.0.1.12", "hwNHRPLocalPeerCnt": "1.3.6.1.4.1.2011.6.122.73.0.1.13"]
]

// --- hwNHRPLocalPeerLimitResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.122.73.0.2.10
// Fields: hwNHRPLocalPeerLimit, hwNHRPLocalPeerCnt
// Description: The number of NHRP Local peers fell below the alarm limit.
trapMap["1.3.6.1.4.1.2011.6.122.73.0.2.10"] = [
    name: "hwNHRPLocalPeerLimitResume",
    fields: ["hwNHRPLocalPeerLimit", "hwNHRPLocalPeerCnt"],
    fieldOids: ["hwNHRPLocalPeerLimit": "1.3.6.1.4.1.2011.6.122.73.0.1.12", "hwNHRPLocalPeerCnt": "1.3.6.1.4.1.2011.6.122.73.0.1.13"]
]

// ===== Parsing logic =====

// Set to true to enable diagnostic logging for this MIB parser
DEBUG = false

LOG_PREFIX = "[HUAWEI-SECURITY-NHRP-MIB]"
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
