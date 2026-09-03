/**
 * Auto-generated from HUAWEI-BRAS-SRVCFG-INTERFACE-MIB.mib
 * Generated: 2026-08-24T18:28:29.138356100
 * Traps/Notifications (17): hwBRASBoardNotSupportBasAlarm, hwBRASBoardNotSupportBasResume, hwBoardSetGTPModeNotSupportBas, hwSrvcfgSubCardReachMaxRecomNumber, hwCuVxlanTunnelDown, hwCuVxlanTunnelResume, hwIpv4FramedRouteThresholdAlarm, hwIpv4FramedRouteThresholdAlarmResume, hwBRASActiveBasSlotFailAlarm, hwBRASActiveBasSlotFailResume, hwBRASLicenseItemEvent, hwCuUpVxlanTunnelDown, hwCuUpVxlanTunnelResume, hwCuVxlanTunnelPlrAlarm, hwCuVxlanTunnelPlrResume, hwIPv6FramedRouteThresholdAlarm, hwIPv6FramedRouteThresholdResume
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

// --- hwBRASBoardNotSupportBasAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.40.1.3.2.1
// Fields: hwBRASBoardNotSupportBasSlotId
// Description: 1 Notice/Trap name: hwBRASBoardNotSupportBas 2 Notice/Trap generation cause: specified board does not support BAS. 3 Repair suggestions: replace it with a BAS-supported board.
trapMap["1.3.6.1.4.1.2011.5.25.40.1.3.2.1"] = [
    name: "hwBRASBoardNotSupportBasAlarm",
    fields: ["hwBRASBoardNotSupportBasSlotId"],
    fieldOids: ["hwBRASBoardNotSupportBasSlotId": "1.3.6.1.4.1.2011.5.25.40.1.3.1.1"]
]

// --- hwBRASBoardNotSupportBasResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.40.1.3.2.2
// Fields: hwBRASBoardNotSupportBasSlotId
// Description: 1 Notice/Trap name: hwBRASBoardNotSupportBasResume 2 Notice/Trap generation cause: alarm was cleared because the board that does not support BAS was removed or the BAS configuration was deleted from t...
trapMap["1.3.6.1.4.1.2011.5.25.40.1.3.2.2"] = [
    name: "hwBRASBoardNotSupportBasResume",
    fields: ["hwBRASBoardNotSupportBasSlotId"],
    fieldOids: ["hwBRASBoardNotSupportBasSlotId": "1.3.6.1.4.1.2011.5.25.40.1.3.1.1"]
]

// --- hwBoardSetGTPModeNotSupportBas (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.40.1.3.2.3
// Fields: hwBRASBoardNotSupportBasSlotId
// Description: 1 Notice/Trap name: hwBoardSetGTPModeNotSupportBas 2 Notice/Trap generation cause: The L2TP tunnel keepalive function became abnormal on a board when GTP was enabled on the board, causing L2TP users w...
trapMap["1.3.6.1.4.1.2011.5.25.40.1.3.2.3"] = [
    name: "hwBoardSetGTPModeNotSupportBas",
    fields: ["hwBRASBoardNotSupportBasSlotId"],
    fieldOids: ["hwBRASBoardNotSupportBasSlotId": "1.3.6.1.4.1.2011.5.25.40.1.3.1.1"]
]

// --- hwSrvcfgSubCardReachMaxRecomNumber (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.40.1.3.2.4
// Fields: hwSrvcfgSubCardReachMaxRecomNumberSlotId, hwSrvcfgSubCardReachMaxRecomNumberCardId
// Description: 1 Notice/Trap name: hwSrvcfgSubCardReachMaxRecomNumber 2 Notice/Trap generation cause: The number of reassembly tables delivered by the board exceeded the maximum number of reassembly tables allowed b...
trapMap["1.3.6.1.4.1.2011.5.25.40.1.3.2.4"] = [
    name: "hwSrvcfgSubCardReachMaxRecomNumber",
    fields: ["hwSrvcfgSubCardReachMaxRecomNumberSlotId", "hwSrvcfgSubCardReachMaxRecomNumberCardId"],
    fieldOids: ["hwSrvcfgSubCardReachMaxRecomNumberSlotId": "1.3.6.1.4.1.2011.5.25.40.1.3.1.2", "hwSrvcfgSubCardReachMaxRecomNumberCardId": "1.3.6.1.4.1.2011.5.25.40.1.3.1.3"]
]

// --- hwCuVxlanTunnelDown (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.40.1.3.2.5
// Fields: hwCuVxlanTunnelSrcIpAddr, hwCuVxlanTunnelPeerIpAddr, hwCuVxlanTunnelInVni, hwCuVxlanTunnelVpn, hwCuVxlanTunnelUpId, hwCuVxlanTunnelDownReason
// Description: This object indicates that an alarm is generated on the CP side when a VXLAN tunnel connectivity fault is detected.
trapMap["1.3.6.1.4.1.2011.5.25.40.1.3.2.5"] = [
    name: "hwCuVxlanTunnelDown",
    fields: ["hwCuVxlanTunnelSrcIpAddr", "hwCuVxlanTunnelPeerIpAddr", "hwCuVxlanTunnelInVni", "hwCuVxlanTunnelVpn", "hwCuVxlanTunnelUpId", "hwCuVxlanTunnelDownReason"],
    fieldOids: ["hwCuVxlanTunnelSrcIpAddr": "1.3.6.1.4.1.2011.5.25.40.1.3.1.5", "hwCuVxlanTunnelPeerIpAddr": "1.3.6.1.4.1.2011.5.25.40.1.3.1.6", "hwCuVxlanTunnelInVni": "1.3.6.1.4.1.2011.5.25.40.1.3.1.7", "hwCuVxlanTunnelVpn": "1.3.6.1.4.1.2011.5.25.40.1.3.1.8", "hwCuVxlanTunnelUpId": "1.3.6.1.4.1.2011.5.25.40.1.3.1.4", "hwCuVxlanTunnelDownReason": "1.3.6.1.4.1.2011.5.25.40.1.3.1.17"]
]

// --- hwCuVxlanTunnelResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.40.1.3.2.6
// Fields: hwCuVxlanTunnelSrcIpAddr, hwCuVxlanTunnelPeerIpAddr, hwCuVxlanTunnelInVni, hwCuVxlanTunnelVpn, hwCuVxlanTunnelUpId, hwCuVxlanTunnelDownReason
// Description: This object indicates that a clear alarm is generated on the CP side when a VXLAN tunnel connectivity fault is rectified.
trapMap["1.3.6.1.4.1.2011.5.25.40.1.3.2.6"] = [
    name: "hwCuVxlanTunnelResume",
    fields: ["hwCuVxlanTunnelSrcIpAddr", "hwCuVxlanTunnelPeerIpAddr", "hwCuVxlanTunnelInVni", "hwCuVxlanTunnelVpn", "hwCuVxlanTunnelUpId", "hwCuVxlanTunnelDownReason"],
    fieldOids: ["hwCuVxlanTunnelSrcIpAddr": "1.3.6.1.4.1.2011.5.25.40.1.3.1.5", "hwCuVxlanTunnelPeerIpAddr": "1.3.6.1.4.1.2011.5.25.40.1.3.1.6", "hwCuVxlanTunnelInVni": "1.3.6.1.4.1.2011.5.25.40.1.3.1.7", "hwCuVxlanTunnelVpn": "1.3.6.1.4.1.2011.5.25.40.1.3.1.8", "hwCuVxlanTunnelUpId": "1.3.6.1.4.1.2011.5.25.40.1.3.1.4", "hwCuVxlanTunnelDownReason": "1.3.6.1.4.1.2011.5.25.40.1.3.1.17"]
]

// --- hwIpv4FramedRouteThresholdAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.40.1.3.2.7
// Fields: hwIpv4FramedRouteUsage
// Description: This object indicates that the usage of ipv4 framed route exceeds the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.40.1.3.2.7"] = [
    name: "hwIpv4FramedRouteThresholdAlarm",
    fields: ["hwIpv4FramedRouteUsage"],
    fieldOids: ["hwIpv4FramedRouteUsage": "1.3.6.1.4.1.2011.5.25.40.1.3.1.9"]
]

// --- hwIpv4FramedRouteThresholdAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.40.1.3.2.8
// Fields: hwIpv4FramedRouteUsage
// Description: This object indicates that the alarm generated when the usage of ipv4 framed route falls below the threshold is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.40.1.3.2.8"] = [
    name: "hwIpv4FramedRouteThresholdAlarmResume",
    fields: ["hwIpv4FramedRouteUsage"],
    fieldOids: ["hwIpv4FramedRouteUsage": "1.3.6.1.4.1.2011.5.25.40.1.3.1.9"]
]

// --- hwBRASActiveBasSlotFailAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.40.1.3.2.9
// Fields: hwBRASBoardLicenseName, hwBRASBoardLicenseDescription, hwBRASBoardLicenseSlotID
// Description: 1 Notice/Trap name: hwBRASActiveBasSlotFailAlarm 2 Notice/Trap generation cause: The BAS function license on the board failed to be activated. 3 Repair suggestions: a. Purchase and activate the corres...
trapMap["1.3.6.1.4.1.2011.5.25.40.1.3.2.9"] = [
    name: "hwBRASActiveBasSlotFailAlarm",
    fields: ["hwBRASBoardLicenseName", "hwBRASBoardLicenseDescription", "hwBRASBoardLicenseSlotID"],
    fieldOids: ["hwBRASBoardLicenseName": "1.3.6.1.4.1.2011.5.25.40.1.3.1.10", "hwBRASBoardLicenseDescription": "1.3.6.1.4.1.2011.5.25.40.1.3.1.11", "hwBRASBoardLicenseSlotID": "1.3.6.1.4.1.2011.5.25.40.1.3.1.12"]
]

// --- hwBRASActiveBasSlotFailResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.40.1.3.2.10
// Fields: hwBRASBoardLicenseName, hwBRASBoardLicenseDescription, hwBRASBoardLicenseSlotID
// Description: 1 Notice/Trap name: hwBRASBoardNotSupportBasResume 2 Notice/Trap generation cause: The corresponding license resources became sufficient and the BAS function license on the board had been activated, t...
trapMap["1.3.6.1.4.1.2011.5.25.40.1.3.2.10"] = [
    name: "hwBRASActiveBasSlotFailResume",
    fields: ["hwBRASBoardLicenseName", "hwBRASBoardLicenseDescription", "hwBRASBoardLicenseSlotID"],
    fieldOids: ["hwBRASBoardLicenseName": "1.3.6.1.4.1.2011.5.25.40.1.3.1.10", "hwBRASBoardLicenseDescription": "1.3.6.1.4.1.2011.5.25.40.1.3.1.11", "hwBRASBoardLicenseSlotID": "1.3.6.1.4.1.2011.5.25.40.1.3.1.12"]
]

// --- hwBRASLicenseItemEvent (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.40.1.3.2.11
// Fields: hwBRASServiceEnable, hwBRASLicenseItemName, hwBRASLicenseDescription
// Description: 1 Notice/Trap name: hwBRASLicenseItemEvent 2 Notice/Trap generation cause: Service configuration exist, but the corresponding license is deactived.
trapMap["1.3.6.1.4.1.2011.5.25.40.1.3.2.11"] = [
    name: "hwBRASLicenseItemEvent",
    fields: ["hwBRASServiceEnable", "hwBRASLicenseItemName", "hwBRASLicenseDescription"],
    fieldOids: ["hwBRASServiceEnable": "1.3.6.1.4.1.2011.5.25.40.1.3.1.14", "hwBRASLicenseItemName": "1.3.6.1.4.1.2011.5.25.40.1.3.1.13", "hwBRASLicenseDescription": "1.3.6.1.4.1.2011.5.25.40.1.3.1.15"]
]

// --- hwCuUpVxlanTunnelDown (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.40.1.3.2.12
// Fields: hwCuVxlanTunnelSrcIpAddr, hwCuVxlanTunnelPeerIpAddr, hwCuVxlanTunnelInVni, hwCuVxlanTunnelVpn, hwCuVxlanTunnelDownReason
// Description: This object indicates that an alarm is generated on the UP side when a VXLAN tunnel connectivity fault is detected.
trapMap["1.3.6.1.4.1.2011.5.25.40.1.3.2.12"] = [
    name: "hwCuUpVxlanTunnelDown",
    fields: ["hwCuVxlanTunnelSrcIpAddr", "hwCuVxlanTunnelPeerIpAddr", "hwCuVxlanTunnelInVni", "hwCuVxlanTunnelVpn", "hwCuVxlanTunnelDownReason"],
    fieldOids: ["hwCuVxlanTunnelSrcIpAddr": "1.3.6.1.4.1.2011.5.25.40.1.3.1.5", "hwCuVxlanTunnelPeerIpAddr": "1.3.6.1.4.1.2011.5.25.40.1.3.1.6", "hwCuVxlanTunnelInVni": "1.3.6.1.4.1.2011.5.25.40.1.3.1.7", "hwCuVxlanTunnelVpn": "1.3.6.1.4.1.2011.5.25.40.1.3.1.8", "hwCuVxlanTunnelDownReason": "1.3.6.1.4.1.2011.5.25.40.1.3.1.17"]
]

// --- hwCuUpVxlanTunnelResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.40.1.3.2.13
// Fields: hwCuVxlanTunnelSrcIpAddr, hwCuVxlanTunnelPeerIpAddr, hwCuVxlanTunnelInVni, hwCuVxlanTunnelVpn, hwCuVxlanTunnelDownReason
// Description: This object indicates that a clear alarm is generated on the UP side when a VXLAN tunnel connectivity fault is rectified.
trapMap["1.3.6.1.4.1.2011.5.25.40.1.3.2.13"] = [
    name: "hwCuUpVxlanTunnelResume",
    fields: ["hwCuVxlanTunnelSrcIpAddr", "hwCuVxlanTunnelPeerIpAddr", "hwCuVxlanTunnelInVni", "hwCuVxlanTunnelVpn", "hwCuVxlanTunnelDownReason"],
    fieldOids: ["hwCuVxlanTunnelSrcIpAddr": "1.3.6.1.4.1.2011.5.25.40.1.3.1.5", "hwCuVxlanTunnelPeerIpAddr": "1.3.6.1.4.1.2011.5.25.40.1.3.1.6", "hwCuVxlanTunnelInVni": "1.3.6.1.4.1.2011.5.25.40.1.3.1.7", "hwCuVxlanTunnelVpn": "1.3.6.1.4.1.2011.5.25.40.1.3.1.8", "hwCuVxlanTunnelDownReason": "1.3.6.1.4.1.2011.5.25.40.1.3.1.17"]
]

// --- hwCuVxlanTunnelPlrAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.40.1.3.2.14
// Fields: hwCuVxlanTunnelSrcIpAddr, hwCuVxlanTunnelPeerIpAddr, hwCuVxlanTunnelInVni, hwCuVxlanTunnelVpn, hwCuVxlanTunnelUpId, hwCuVxlanTunnelPlr
// Description: This object indicates that an alarm is generated on the CP side when the network of a VXLAN tunnel is abnormal.
trapMap["1.3.6.1.4.1.2011.5.25.40.1.3.2.14"] = [
    name: "hwCuVxlanTunnelPlrAlarm",
    fields: ["hwCuVxlanTunnelSrcIpAddr", "hwCuVxlanTunnelPeerIpAddr", "hwCuVxlanTunnelInVni", "hwCuVxlanTunnelVpn", "hwCuVxlanTunnelUpId", "hwCuVxlanTunnelPlr"],
    fieldOids: ["hwCuVxlanTunnelSrcIpAddr": "1.3.6.1.4.1.2011.5.25.40.1.3.1.5", "hwCuVxlanTunnelPeerIpAddr": "1.3.6.1.4.1.2011.5.25.40.1.3.1.6", "hwCuVxlanTunnelInVni": "1.3.6.1.4.1.2011.5.25.40.1.3.1.7", "hwCuVxlanTunnelVpn": "1.3.6.1.4.1.2011.5.25.40.1.3.1.8", "hwCuVxlanTunnelUpId": "1.3.6.1.4.1.2011.5.25.40.1.3.1.4", "hwCuVxlanTunnelPlr": "1.3.6.1.4.1.2011.5.25.40.1.3.1.16"]
]

// --- hwCuVxlanTunnelPlrResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.40.1.3.2.15
// Fields: hwCuVxlanTunnelSrcIpAddr, hwCuVxlanTunnelPeerIpAddr, hwCuVxlanTunnelInVni, hwCuVxlanTunnelVpn, hwCuVxlanTunnelUpId, hwCuVxlanTunnelPlr
// Description: This object indicates that a clear alarm is generated on the CP side when the network of a VXLAN tunnel recovers.
trapMap["1.3.6.1.4.1.2011.5.25.40.1.3.2.15"] = [
    name: "hwCuVxlanTunnelPlrResume",
    fields: ["hwCuVxlanTunnelSrcIpAddr", "hwCuVxlanTunnelPeerIpAddr", "hwCuVxlanTunnelInVni", "hwCuVxlanTunnelVpn", "hwCuVxlanTunnelUpId", "hwCuVxlanTunnelPlr"],
    fieldOids: ["hwCuVxlanTunnelSrcIpAddr": "1.3.6.1.4.1.2011.5.25.40.1.3.1.5", "hwCuVxlanTunnelPeerIpAddr": "1.3.6.1.4.1.2011.5.25.40.1.3.1.6", "hwCuVxlanTunnelInVni": "1.3.6.1.4.1.2011.5.25.40.1.3.1.7", "hwCuVxlanTunnelVpn": "1.3.6.1.4.1.2011.5.25.40.1.3.1.8", "hwCuVxlanTunnelUpId": "1.3.6.1.4.1.2011.5.25.40.1.3.1.4", "hwCuVxlanTunnelPlr": "1.3.6.1.4.1.2011.5.25.40.1.3.1.16"]
]

// --- hwIPv6FramedRouteThresholdAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.40.1.3.2.16
// Fields: hwFramedRouteThreshold, hwFramedRouteSpecification
// Description: This object indicates that the usage of IPv6 framed route exceeds the upper threshold.
trapMap["1.3.6.1.4.1.2011.5.25.40.1.3.2.16"] = [
    name: "hwIPv6FramedRouteThresholdAlarm",
    fields: ["hwFramedRouteThreshold", "hwFramedRouteSpecification"],
    fieldOids: ["hwFramedRouteThreshold": "1.3.6.1.4.1.2011.5.25.40.1.3.1.18", "hwFramedRouteSpecification": "1.3.6.1.4.1.2011.5.25.40.1.3.1.19"]
]

// --- hwIPv6FramedRouteThresholdResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.40.1.3.2.17
// Fields: hwFramedRouteThreshold, hwFramedRouteSpecification
// Description: This object indicates that the usage of IPv6 framed route falls below the lower threshold.
trapMap["1.3.6.1.4.1.2011.5.25.40.1.3.2.17"] = [
    name: "hwIPv6FramedRouteThresholdResume",
    fields: ["hwFramedRouteThreshold", "hwFramedRouteSpecification"],
    fieldOids: ["hwFramedRouteThreshold": "1.3.6.1.4.1.2011.5.25.40.1.3.1.18", "hwFramedRouteSpecification": "1.3.6.1.4.1.2011.5.25.40.1.3.1.19"]
]

// ===== Parsing logic =====

// Set to true to enable diagnostic logging for this MIB parser
DEBUG = false

LOG_PREFIX = "[HUAWEI-BRAS-SRVCFG-INTERFACE-MIB]"
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
