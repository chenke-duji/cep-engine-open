/**
 * Auto-generated from HUAWEI-RANAPS-MIB.mib
 * Generated: 2026-08-24T18:28:30.808476500
 * Traps/Notifications (14): hwRanApsFsmFail, hwRanPgpPktError, hwRanPgpKeepalivePktOvertime, hwRanApsUniBidMismatch, hwRanApsK1K2Mismatch, hwRanApsK2Mismatch, hwRanApsProtectSwitchOver, hwRanApsProtectSwitchBackOver, hwRanApsInterfaceReady, hwRanApsUniBidMismatchResume, hwRanApsK2MismatchResume, hwRanPgpKeepalivePktOvertimeResume, hwRanApsRevertMismatch, hwRanApsK1K2MisResume
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

// --- hwRanApsFsmFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.200.2.1
// Fields: hwRanApsIfIndex, hwRanApsIfName, hwRanApsProtectionGroupNum
// Description: This object indicates that an alarm is generated when the LMSP state machine processing fails.
trapMap["1.3.6.1.4.1.2011.5.25.200.2.1"] = [
    name: "hwRanApsFsmFail",
    fields: ["hwRanApsIfIndex", "hwRanApsIfName", "hwRanApsProtectionGroupNum"],
    fieldOids: ["hwRanApsIfIndex": "1.3.6.1.4.1.2011.5.25.200.1.1.1.4", "hwRanApsIfName": "1.3.6.1.4.1.2011.5.25.200.1.1.1.14", "hwRanApsProtectionGroupNum": "1.3.6.1.4.1.2011.5.25.200.1.1.1.3"]
]

// --- hwRanPgpPktError (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.200.2.2
// Fields: hwRanApsIfIndex, hwRanApsIfName, hwRanApsProtectionGroupNum, hwRanApsIfPeerIp, hwRanApsPgpInfo
// Description: This object indicates the PGP packet error.
trapMap["1.3.6.1.4.1.2011.5.25.200.2.2"] = [
    name: "hwRanPgpPktError",
    fields: ["hwRanApsIfIndex", "hwRanApsIfName", "hwRanApsProtectionGroupNum", "hwRanApsIfPeerIp", "hwRanApsPgpInfo"],
    fieldOids: ["hwRanApsIfIndex": "1.3.6.1.4.1.2011.5.25.200.1.1.1.4", "hwRanApsIfName": "1.3.6.1.4.1.2011.5.25.200.1.1.1.14", "hwRanApsProtectionGroupNum": "1.3.6.1.4.1.2011.5.25.200.1.1.1.3", "hwRanApsIfPeerIp": "1.3.6.1.4.1.2011.5.25.200.1.1.1.10", "hwRanApsPgpInfo": "1.3.6.1.4.1.2011.5.25.200.1.3.1.3"]
]

// --- hwRanPgpKeepalivePktOvertime (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.200.2.3
// Fields: hwRanApsIfIndex, hwRanApsIfName, hwRanApsProtectionGroupNum, hwRanApsIfPeerIp
// Description: This object indicates that an alarm is generated when PGP Keepalive packets time out.
trapMap["1.3.6.1.4.1.2011.5.25.200.2.3"] = [
    name: "hwRanPgpKeepalivePktOvertime",
    fields: ["hwRanApsIfIndex", "hwRanApsIfName", "hwRanApsProtectionGroupNum", "hwRanApsIfPeerIp"],
    fieldOids: ["hwRanApsIfIndex": "1.3.6.1.4.1.2011.5.25.200.1.1.1.4", "hwRanApsIfName": "1.3.6.1.4.1.2011.5.25.200.1.1.1.14", "hwRanApsProtectionGroupNum": "1.3.6.1.4.1.2011.5.25.200.1.1.1.3", "hwRanApsIfPeerIp": "1.3.6.1.4.1.2011.5.25.200.1.1.1.10"]
]

// --- hwRanApsUniBidMismatch (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.200.2.4
// Fields: hwRanApsIfIndex, hwRanApsIfName, hwRanApsProtectionGroupNum, hwRanApsProtectMode, hwRanApsRemoteProtectMode
// Description: This object indicates that the APS modes configured between two NEs are inconsistent.
trapMap["1.3.6.1.4.1.2011.5.25.200.2.4"] = [
    name: "hwRanApsUniBidMismatch",
    fields: ["hwRanApsIfIndex", "hwRanApsIfName", "hwRanApsProtectionGroupNum", "hwRanApsProtectMode", "hwRanApsRemoteProtectMode"],
    fieldOids: ["hwRanApsIfIndex": "1.3.6.1.4.1.2011.5.25.200.1.1.1.4", "hwRanApsIfName": "1.3.6.1.4.1.2011.5.25.200.1.1.1.14", "hwRanApsProtectionGroupNum": "1.3.6.1.4.1.2011.5.25.200.1.1.1.3", "hwRanApsProtectMode": "1.3.6.1.4.1.2011.5.25.200.1.1.1.8", "hwRanApsRemoteProtectMode": "1.3.6.1.4.1.2011.5.25.200.1.3.1.2"]
]

// --- hwRanApsK1K2Mismatch (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.200.2.5
// Fields: hwRanApsIfIndex, hwRanApsIfName, hwRanApsProtectionGroupNum
// Description: This object indicates that the received K1 and K2 bytes do not match the transmitted K1 and K2 bytes.
trapMap["1.3.6.1.4.1.2011.5.25.200.2.5"] = [
    name: "hwRanApsK1K2Mismatch",
    fields: ["hwRanApsIfIndex", "hwRanApsIfName", "hwRanApsProtectionGroupNum"],
    fieldOids: ["hwRanApsIfIndex": "1.3.6.1.4.1.2011.5.25.200.1.1.1.4", "hwRanApsIfName": "1.3.6.1.4.1.2011.5.25.200.1.1.1.14", "hwRanApsProtectionGroupNum": "1.3.6.1.4.1.2011.5.25.200.1.1.1.3"]
]

// --- hwRanApsK2Mismatch (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.200.2.6
// Fields: hwRanApsIfIndex, hwRanApsIfName, hwRanApsProtectionGroupNum
// Description: This object indicates that an alarm is generated when the peer protection mode represented by the K2 byte (the fifth byte in descending order) in the received packet is different from the local.
trapMap["1.3.6.1.4.1.2011.5.25.200.2.6"] = [
    name: "hwRanApsK2Mismatch",
    fields: ["hwRanApsIfIndex", "hwRanApsIfName", "hwRanApsProtectionGroupNum"],
    fieldOids: ["hwRanApsIfIndex": "1.3.6.1.4.1.2011.5.25.200.1.1.1.4", "hwRanApsIfName": "1.3.6.1.4.1.2011.5.25.200.1.1.1.14", "hwRanApsProtectionGroupNum": "1.3.6.1.4.1.2011.5.25.200.1.1.1.3"]
]

// --- hwRanApsProtectSwitchOver (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.200.2.7
// Fields: hwRanApsIfIndex, hwRanApsIfName, hwRanApsIfType, hwRanApsProtectionGroupNum
// Description: This object indicates that an LMSP protection switchover succeeds.
trapMap["1.3.6.1.4.1.2011.5.25.200.2.7"] = [
    name: "hwRanApsProtectSwitchOver",
    fields: ["hwRanApsIfIndex", "hwRanApsIfName", "hwRanApsIfType", "hwRanApsProtectionGroupNum"],
    fieldOids: ["hwRanApsIfIndex": "1.3.6.1.4.1.2011.5.25.200.1.1.1.4", "hwRanApsIfName": "1.3.6.1.4.1.2011.5.25.200.1.1.1.14", "hwRanApsIfType": "1.3.6.1.4.1.2011.5.25.200.1.1.1.5", "hwRanApsProtectionGroupNum": "1.3.6.1.4.1.2011.5.25.200.1.1.1.3"]
]

// --- hwRanApsProtectSwitchBackOver (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.200.2.8
// Fields: hwRanApsIfIndex, hwRanApsIfName, hwRanApsIfType, hwRanApsProtectionGroupNum
// Description: This object indicates that an LMSP protection switchback succeeds.
trapMap["1.3.6.1.4.1.2011.5.25.200.2.8"] = [
    name: "hwRanApsProtectSwitchBackOver",
    fields: ["hwRanApsIfIndex", "hwRanApsIfName", "hwRanApsIfType", "hwRanApsProtectionGroupNum"],
    fieldOids: ["hwRanApsIfIndex": "1.3.6.1.4.1.2011.5.25.200.1.1.1.4", "hwRanApsIfName": "1.3.6.1.4.1.2011.5.25.200.1.1.1.14", "hwRanApsIfType": "1.3.6.1.4.1.2011.5.25.200.1.1.1.5", "hwRanApsProtectionGroupNum": "1.3.6.1.4.1.2011.5.25.200.1.1.1.3"]
]

// --- hwRanApsInterfaceReady (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.200.2.9
// Fields: hwRanApsIfIndex, hwRanApsIfName, hwRanApsProtectionGroupNum
// Description: This object indicates that an interface in an LMSP group becomes Up and begins to work as a protection interface.
trapMap["1.3.6.1.4.1.2011.5.25.200.2.9"] = [
    name: "hwRanApsInterfaceReady",
    fields: ["hwRanApsIfIndex", "hwRanApsIfName", "hwRanApsProtectionGroupNum"],
    fieldOids: ["hwRanApsIfIndex": "1.3.6.1.4.1.2011.5.25.200.1.1.1.4", "hwRanApsIfName": "1.3.6.1.4.1.2011.5.25.200.1.1.1.14", "hwRanApsProtectionGroupNum": "1.3.6.1.4.1.2011.5.25.200.1.1.1.3"]
]

// --- hwRanApsUniBidMismatchResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.200.2.10
// Fields: hwRanApsIfIndex, hwRanApsIfName, hwRanApsProtectionGroupNum
// Description: This object indicates that the LMSP working modes between two NEs are the same.
trapMap["1.3.6.1.4.1.2011.5.25.200.2.10"] = [
    name: "hwRanApsUniBidMismatchResume",
    fields: ["hwRanApsIfIndex", "hwRanApsIfName", "hwRanApsProtectionGroupNum"],
    fieldOids: ["hwRanApsIfIndex": "1.3.6.1.4.1.2011.5.25.200.1.1.1.4", "hwRanApsIfName": "1.3.6.1.4.1.2011.5.25.200.1.1.1.14", "hwRanApsProtectionGroupNum": "1.3.6.1.4.1.2011.5.25.200.1.1.1.3"]
]

// --- hwRanApsK2MismatchResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.200.2.11
// Fields: hwRanApsIfIndex, hwRanApsIfName, hwRanApsProtectionGroupNum
// Description: This object indicates that the peer protection mode represented by the K2 byte (the fifth byte in descending order) in the received packet is the same as the local protection mode.
trapMap["1.3.6.1.4.1.2011.5.25.200.2.11"] = [
    name: "hwRanApsK2MismatchResume",
    fields: ["hwRanApsIfIndex", "hwRanApsIfName", "hwRanApsProtectionGroupNum"],
    fieldOids: ["hwRanApsIfIndex": "1.3.6.1.4.1.2011.5.25.200.1.1.1.4", "hwRanApsIfName": "1.3.6.1.4.1.2011.5.25.200.1.1.1.14", "hwRanApsProtectionGroupNum": "1.3.6.1.4.1.2011.5.25.200.1.1.1.3"]
]

// --- hwRanPgpKeepalivePktOvertimeResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.200.2.12
// Fields: hwRanApsIfIndex, hwRanApsIfName, hwRanApsProtectionGroupNum, hwRanApsIfPeerIp
// Description: This object indicates that the alarm generated when PGP Keepalive packets timed out is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.200.2.12"] = [
    name: "hwRanPgpKeepalivePktOvertimeResume",
    fields: ["hwRanApsIfIndex", "hwRanApsIfName", "hwRanApsProtectionGroupNum", "hwRanApsIfPeerIp"],
    fieldOids: ["hwRanApsIfIndex": "1.3.6.1.4.1.2011.5.25.200.1.1.1.4", "hwRanApsIfName": "1.3.6.1.4.1.2011.5.25.200.1.1.1.14", "hwRanApsProtectionGroupNum": "1.3.6.1.4.1.2011.5.25.200.1.1.1.3", "hwRanApsIfPeerIp": "1.3.6.1.4.1.2011.5.25.200.1.1.1.10"]
]

// --- hwRanApsRevertMismatch (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.200.2.13
// Fields: hwRanApsIfIndex, hwRanApsIfName, hwRanApsProtectionGroupNum
// Description: This object indicates that the LMSP switchback modes configured between two devices are inconsistent.
trapMap["1.3.6.1.4.1.2011.5.25.200.2.13"] = [
    name: "hwRanApsRevertMismatch",
    fields: ["hwRanApsIfIndex", "hwRanApsIfName", "hwRanApsProtectionGroupNum"],
    fieldOids: ["hwRanApsIfIndex": "1.3.6.1.4.1.2011.5.25.200.1.1.1.4", "hwRanApsIfName": "1.3.6.1.4.1.2011.5.25.200.1.1.1.14", "hwRanApsProtectionGroupNum": "1.3.6.1.4.1.2011.5.25.200.1.1.1.3"]
]

// --- hwRanApsK1K2MisResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.200.2.14
// Fields: hwRanApsIfIndex, hwRanApsIfName, hwRanApsProtectionGroupNum
// Description: This object indicates that the received K1 and K2 bytes match the transmitted K1 and K2 bytes.
trapMap["1.3.6.1.4.1.2011.5.25.200.2.14"] = [
    name: "hwRanApsK1K2MisResume",
    fields: ["hwRanApsIfIndex", "hwRanApsIfName", "hwRanApsProtectionGroupNum"],
    fieldOids: ["hwRanApsIfIndex": "1.3.6.1.4.1.2011.5.25.200.1.1.1.4", "hwRanApsIfName": "1.3.6.1.4.1.2011.5.25.200.1.1.1.14", "hwRanApsProtectionGroupNum": "1.3.6.1.4.1.2011.5.25.200.1.1.1.3"]
]

// ===== Parsing logic =====

// Set to true to enable diagnostic logging for this MIB parser
DEBUG = false

LOG_PREFIX = "[HUAWEI-RANAPS-MIB]"
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
