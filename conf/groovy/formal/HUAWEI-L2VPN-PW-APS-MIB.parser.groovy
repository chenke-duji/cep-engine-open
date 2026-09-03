/**
 * Auto-generated from HUAWEI-L2VPN-PW-APS-MIB.mib
 * Generated: 2026-08-24T18:28:30.203281
 * Traps/Notifications (19): hwPwApsTypeMismatch, hwPwApsTypeMismatchClear, hwPwApsPathMismatch, hwPwApsPathMismatchClear, hwPwApsSwitchFail, hwPwApsSwitchFailClear, hwPwApsLost, hwPwApsLostClear, hwPwApsIdMismatch, hwPwApsIdMismatchClear, hwPwApsBypassPwMismatch, hwPwApsBypssPwMismatchClear, hwPwApsSwitchEvent, hwPwApsOutAge, hwPwApsOutAgeClear, hwPwApsDegraded, hwPwApsDegradedClear, hwPwApsTunnelNonSupport, hwPwApsTunnelNonSupportResumed
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

// --- hwPwApsTypeMismatch (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.119.10.2.1
// Fields: hwPwApsId, hwPWInterfaceIndex
// Description: This object indicates that APS reports an alarm when protection types in APS packets received from the remote end and those on the local end are inconsistent.
trapMap["1.3.6.1.4.1.2011.5.25.119.10.2.1"] = [
    name: "hwPwApsTypeMismatch",
    fields: ["hwPwApsId", "hwPWInterfaceIndex"],
    fieldOids: ["hwPwApsId": "1.3.6.1.4.1.2011.5.25.119.10.1.1.1.1", "hwPWInterfaceIndex": "1.3.6.1.4.1.2011.5.25.119.4.1.7.1.1.4"]
]

// --- hwPwApsTypeMismatchClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.119.10.2.2
// Fields: hwPwApsId, hwPWInterfaceIndex
// Description: This object indicates that the APS-reported alarm for the protection type inconsistency in APS packets received from the remote end and those on the local end is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.119.10.2.2"] = [
    name: "hwPwApsTypeMismatchClear",
    fields: ["hwPwApsId", "hwPWInterfaceIndex"],
    fieldOids: ["hwPwApsId": "1.3.6.1.4.1.2011.5.25.119.10.1.1.1.1", "hwPWInterfaceIndex": "1.3.6.1.4.1.2011.5.25.119.4.1.7.1.1.4"]
]

// --- hwPwApsPathMismatch (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.119.10.2.3
// Fields: hwPwApsId, hwPWInterfaceIndex
// Description: This object indicates that APS reports an alarm when information about the working and protection paths in APS packets received from the remote end is inconsistent with that on the local end.
trapMap["1.3.6.1.4.1.2011.5.25.119.10.2.3"] = [
    name: "hwPwApsPathMismatch",
    fields: ["hwPwApsId", "hwPWInterfaceIndex"],
    fieldOids: ["hwPwApsId": "1.3.6.1.4.1.2011.5.25.119.10.1.1.1.1", "hwPWInterfaceIndex": "1.3.6.1.4.1.2011.5.25.119.4.1.7.1.1.4"]
]

// --- hwPwApsPathMismatchClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.119.10.2.4
// Fields: hwPwApsId, hwPWInterfaceIndex
// Description: This object indicates that the APS-reported alarm for the information (about the working and protection paths in received APS packets) inconsistency between the remote and local ends is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.119.10.2.4"] = [
    name: "hwPwApsPathMismatchClear",
    fields: ["hwPwApsId", "hwPWInterfaceIndex"],
    fieldOids: ["hwPwApsId": "1.3.6.1.4.1.2011.5.25.119.10.1.1.1.1", "hwPWInterfaceIndex": "1.3.6.1.4.1.2011.5.25.119.4.1.7.1.1.4"]
]

// --- hwPwApsSwitchFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.119.10.2.5
// Fields: hwPwApsId, hwPWInterfaceIndex
// Description: This object indicates that APS reports an alarm when the traffic switching results between the local and remote ends are inconsistent.
trapMap["1.3.6.1.4.1.2011.5.25.119.10.2.5"] = [
    name: "hwPwApsSwitchFail",
    fields: ["hwPwApsId", "hwPWInterfaceIndex"],
    fieldOids: ["hwPwApsId": "1.3.6.1.4.1.2011.5.25.119.10.1.1.1.1", "hwPWInterfaceIndex": "1.3.6.1.4.1.2011.5.25.119.4.1.7.1.1.4"]
]

// --- hwPwApsSwitchFailClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.119.10.2.6
// Fields: hwPwApsId, hwPWInterfaceIndex
// Description: This object indicates that the APS-reported alarm for the inconsistency of the traffic switching results between the local and remote ends is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.119.10.2.6"] = [
    name: "hwPwApsSwitchFailClear",
    fields: ["hwPwApsId", "hwPWInterfaceIndex"],
    fieldOids: ["hwPwApsId": "1.3.6.1.4.1.2011.5.25.119.10.1.1.1.1", "hwPWInterfaceIndex": "1.3.6.1.4.1.2011.5.25.119.4.1.7.1.1.4"]
]

// --- hwPwApsLost (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.119.10.2.7
// Fields: hwPwApsId, hwPWInterfaceIndex
// Description: This object indicates that APS reports an alarm when APS packets are lost.
trapMap["1.3.6.1.4.1.2011.5.25.119.10.2.7"] = [
    name: "hwPwApsLost",
    fields: ["hwPwApsId", "hwPWInterfaceIndex"],
    fieldOids: ["hwPwApsId": "1.3.6.1.4.1.2011.5.25.119.10.1.1.1.1", "hwPWInterfaceIndex": "1.3.6.1.4.1.2011.5.25.119.4.1.7.1.1.4"]
]

// --- hwPwApsLostClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.119.10.2.8
// Fields: hwPwApsId, hwPWInterfaceIndex
// Description: This object indicates that the APS-reported alarm for the loss of APS packets is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.119.10.2.8"] = [
    name: "hwPwApsLostClear",
    fields: ["hwPwApsId", "hwPWInterfaceIndex"],
    fieldOids: ["hwPwApsId": "1.3.6.1.4.1.2011.5.25.119.10.1.1.1.1", "hwPWInterfaceIndex": "1.3.6.1.4.1.2011.5.25.119.4.1.7.1.1.4"]
]

// --- hwPwApsIdMismatch (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.119.10.2.9
// Fields: hwPwApsId, hwPWInterfaceIndex
// Description: This object indicates that APS reports an alarm when the APS IDs of the master and backup RSGs do not match.
trapMap["1.3.6.1.4.1.2011.5.25.119.10.2.9"] = [
    name: "hwPwApsIdMismatch",
    fields: ["hwPwApsId", "hwPWInterfaceIndex"],
    fieldOids: ["hwPwApsId": "1.3.6.1.4.1.2011.5.25.119.10.1.1.1.1", "hwPWInterfaceIndex": "1.3.6.1.4.1.2011.5.25.119.4.1.7.1.1.4"]
]

// --- hwPwApsIdMismatchClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.119.10.2.10
// Fields: hwPwApsId, hwPWInterfaceIndex
// Description: This object indicates that the APS-reported alarm for the APS ID inconsistency between the master and backup RSGs is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.119.10.2.10"] = [
    name: "hwPwApsIdMismatchClear",
    fields: ["hwPwApsId", "hwPWInterfaceIndex"],
    fieldOids: ["hwPwApsId": "1.3.6.1.4.1.2011.5.25.119.10.1.1.1.1", "hwPWInterfaceIndex": "1.3.6.1.4.1.2011.5.25.119.4.1.7.1.1.4"]
]

// --- hwPwApsBypassPwMismatch (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.119.10.2.11
// Fields: hwPwApsId, hwPWInterfaceIndex
// Description: This object indicates that APS reports an alarm when the bypass PW between the master and backup RSGs is unavailable.
trapMap["1.3.6.1.4.1.2011.5.25.119.10.2.11"] = [
    name: "hwPwApsBypassPwMismatch",
    fields: ["hwPwApsId", "hwPWInterfaceIndex"],
    fieldOids: ["hwPwApsId": "1.3.6.1.4.1.2011.5.25.119.10.1.1.1.1", "hwPWInterfaceIndex": "1.3.6.1.4.1.2011.5.25.119.4.1.7.1.1.4"]
]

// --- hwPwApsBypssPwMismatchClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.119.10.2.12
// Fields: hwPwApsId, hwPWInterfaceIndex
// Description: This object indicates that the APS-reported alarm for the unavailability of the bypass PW between the master and backup RSGs is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.119.10.2.12"] = [
    name: "hwPwApsBypssPwMismatchClear",
    fields: ["hwPwApsId", "hwPWInterfaceIndex"],
    fieldOids: ["hwPwApsId": "1.3.6.1.4.1.2011.5.25.119.10.1.1.1.1", "hwPWInterfaceIndex": "1.3.6.1.4.1.2011.5.25.119.4.1.7.1.1.4"]
]

// --- hwPwApsSwitchEvent (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.119.10.2.13
// Fields: hwPwApsRole, hwPwApsRequestResult, hwPwApsState, hwPwApsWorkState, hwPwApsProtectState
// Description: This object indicates that the PW APS status has changed.
trapMap["1.3.6.1.4.1.2011.5.25.119.10.2.13"] = [
    name: "hwPwApsSwitchEvent",
    fields: ["hwPwApsRole", "hwPwApsRequestResult", "hwPwApsState", "hwPwApsWorkState", "hwPwApsProtectState"],
    fieldOids: ["hwPwApsRole": "1.3.6.1.4.1.2011.5.25.119.10.1.1.1.2", "hwPwApsRequestResult": "1.3.6.1.4.1.2011.5.25.119.10.1.1.1.3", "hwPwApsState": "1.3.6.1.4.1.2011.5.25.119.10.1.1.1.4", "hwPwApsWorkState": "1.3.6.1.4.1.2011.5.25.119.10.1.1.1.5", "hwPwApsProtectState": "1.3.6.1.4.1.2011.5.25.119.10.1.1.1.6"]
]

// --- hwPwApsOutAge (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.119.10.2.14
// Fields: hwPwApsId, hwPWInterfaceIndex
// Description: This object indicates that an alarm is generated when both the primary and secondary PWs in an APS protection group fail.
trapMap["1.3.6.1.4.1.2011.5.25.119.10.2.14"] = [
    name: "hwPwApsOutAge",
    fields: ["hwPwApsId", "hwPWInterfaceIndex"],
    fieldOids: ["hwPwApsId": "1.3.6.1.4.1.2011.5.25.119.10.1.1.1.1", "hwPWInterfaceIndex": "1.3.6.1.4.1.2011.5.25.119.4.1.7.1.1.4"]
]

// --- hwPwApsOutAgeClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.119.10.2.15
// Fields: hwPwApsId, hwPWInterfaceIndex
// Description: This object indicates that the alarm can be cleared after one PW in the APS protection group recovers.
trapMap["1.3.6.1.4.1.2011.5.25.119.10.2.15"] = [
    name: "hwPwApsOutAgeClear",
    fields: ["hwPwApsId", "hwPWInterfaceIndex"],
    fieldOids: ["hwPwApsId": "1.3.6.1.4.1.2011.5.25.119.10.1.1.1.1", "hwPWInterfaceIndex": "1.3.6.1.4.1.2011.5.25.119.4.1.7.1.1.4"]
]

// --- hwPwApsDegraded (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.119.10.2.16
// Fields: hwPwApsId, hwPWInterfaceIndex
// Description: This object indicates that an alarm is generated when a PW in the APS protection group is degraded.
trapMap["1.3.6.1.4.1.2011.5.25.119.10.2.16"] = [
    name: "hwPwApsDegraded",
    fields: ["hwPwApsId", "hwPWInterfaceIndex"],
    fieldOids: ["hwPwApsId": "1.3.6.1.4.1.2011.5.25.119.10.1.1.1.1", "hwPWInterfaceIndex": "1.3.6.1.4.1.2011.5.25.119.4.1.7.1.1.4"]
]

// --- hwPwApsDegradedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.119.10.2.17
// Fields: hwPwApsId, hwPWInterfaceIndex
// Description: This object indicates that the alarm for the degraded PW in the APS protection group is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.119.10.2.17"] = [
    name: "hwPwApsDegradedClear",
    fields: ["hwPwApsId", "hwPWInterfaceIndex"],
    fieldOids: ["hwPwApsId": "1.3.6.1.4.1.2011.5.25.119.10.1.1.1.1", "hwPWInterfaceIndex": "1.3.6.1.4.1.2011.5.25.119.4.1.7.1.1.4"]
]

// --- hwPwApsTunnelNonSupport (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.119.10.2.18
// Fields: hwL2vpnVcID, hwL2vpnVcType, hwL2vpnPeerAddr
// Description: This object indicates that PW APS does not support the current public network tunnel.
trapMap["1.3.6.1.4.1.2011.5.25.119.10.2.18"] = [
    name: "hwPwApsTunnelNonSupport",
    fields: ["hwL2vpnVcID", "hwL2vpnVcType", "hwL2vpnPeerAddr"],
    fieldOids: ["hwL2vpnVcID": "1.3.6.1.4.1.2011.5.25.119.9.1.3", "hwL2vpnVcType": "1.3.6.1.4.1.2011.5.25.119.9.1.4", "hwL2vpnPeerAddr": "1.3.6.1.4.1.2011.5.25.119.9.1.5"]
]

// --- hwPwApsTunnelNonSupportResumed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.119.10.2.19
// Fields: hwL2vpnVcID, hwL2vpnVcType, hwL2vpnPeerAddr
// Description: This object indicates that the alarm, which indicated that PW APS did not support the current public network tunnel, is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.119.10.2.19"] = [
    name: "hwPwApsTunnelNonSupportResumed",
    fields: ["hwL2vpnVcID", "hwL2vpnVcType", "hwL2vpnPeerAddr"],
    fieldOids: ["hwL2vpnVcID": "1.3.6.1.4.1.2011.5.25.119.9.1.3", "hwL2vpnVcType": "1.3.6.1.4.1.2011.5.25.119.9.1.4", "hwL2vpnPeerAddr": "1.3.6.1.4.1.2011.5.25.119.9.1.5"]
]

// ===== Parsing logic =====

// Set to true to enable diagnostic logging for this MIB parser
DEBUG = false

LOG_PREFIX = "[HUAWEI-L2VPN-PW-APS-MIB]"
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
