/**
 * Auto-generated from HUAWEI-EVPN-MIB.mib
 * Generated: 2026-08-24T18:28:29.658286200
 * Traps/Notifications (15): hwEvpnMacDupVpnAlarm, hwEvpnMacDupVpnAlarmClear, hwEvpnEtreeMulErrConfig, hwEvpnSRv6ModifyArglenCfg, hwEvpnEvplInstDown, hwEvpnEvplInstUp, hwEvpnDiscardRoute, hwEvpnRingIdConflictAlm, hwEvpnRingIdConflictAlmClear, hwEvpnQualifyBumTableRes, hwEvpnQualifyBumTableResClear, hwEvpnEvplAlarmDown, hwEvpnEvplAlarmUp, hwEvpnMacFlappingVpnAlarm, hwEvpnMacFlappingVpnAlarmClear
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

// --- hwEvpnMacDupVpnAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.356.1.1.2.1
// Fields: hwEvpnInstanceVpnName, hwEvpnMacRouteTag, hwEvpnInstanceMAC, hwEvpnInstanceIfName1, hwEvpnInstanceIfName2, hwEvpnInstanceIfName3, hwEvpnInstanceIfName4, hwEvpnInstanceIPAddress1, hwEvpnInstanceIPAddress2, hwEvpnInstanceIPAddress3, hwEvpnInstanceIPAddress4, hwEvpnInstanceVcId, hwEvpnEvplInstId1, hwEvpnEvplInstId2, hwEvpnEvplInstId3, hwEvpnEvplInstId4
// Description: This object indicates that an EVPN instance name is used to report an alarm when a MAC address is suppressed in the EVPN instance.
trapMap["1.3.6.1.4.1.2011.5.25.356.1.1.2.1"] = [
    name: "hwEvpnMacDupVpnAlarm",
    fields: ["hwEvpnInstanceVpnName", "hwEvpnMacRouteTag", "hwEvpnInstanceMAC", "hwEvpnInstanceIfName1", "hwEvpnInstanceIfName2", "hwEvpnInstanceIfName3", "hwEvpnInstanceIfName4", "hwEvpnInstanceIPAddress1", "hwEvpnInstanceIPAddress2", "hwEvpnInstanceIPAddress3", "hwEvpnInstanceIPAddress4", "hwEvpnInstanceVcId", "hwEvpnEvplInstId1", "hwEvpnEvplInstId2", "hwEvpnEvplInstId3", "hwEvpnEvplInstId4"],
    fieldOids: ["hwEvpnInstanceVpnName": "1.3.6.1.4.1.2011.5.25.356.1.1.1.1.1.1", "hwEvpnMacRouteTag": "1.3.6.1.4.1.2011.5.25.356.1.1.3.9", "hwEvpnInstanceMAC": "1.3.6.1.4.1.2011.5.25.356.1.1.3.10", "hwEvpnInstanceIfName1": "1.3.6.1.4.1.2011.5.25.356.1.1.3.11", "hwEvpnInstanceIfName2": "1.3.6.1.4.1.2011.5.25.356.1.1.3.12", "hwEvpnInstanceIfName3": "1.3.6.1.4.1.2011.5.25.356.1.1.3.13", "hwEvpnInstanceIfName4": "1.3.6.1.4.1.2011.5.25.356.1.1.3.14", "hwEvpnInstanceIPAddress1": "1.3.6.1.4.1.2011.5.25.356.1.1.3.15", "hwEvpnInstanceIPAddress2": "1.3.6.1.4.1.2011.5.25.356.1.1.3.16", "hwEvpnInstanceIPAddress3": "1.3.6.1.4.1.2011.5.25.356.1.1.3.17", "hwEvpnInstanceIPAddress4": "1.3.6.1.4.1.2011.5.25.356.1.1.3.18", "hwEvpnInstanceVcId": "1.3.6.1.4.1.2011.5.25.356.1.1.3.19", "hwEvpnEvplInstId1": "1.3.6.1.4.1.2011.5.25.356.1.1.3.20", "hwEvpnEvplInstId2": "1.3.6.1.4.1.2011.5.25.356.1.1.3.21", "hwEvpnEvplInstId3": "1.3.6.1.4.1.2011.5.25.356.1.1.3.22", "hwEvpnEvplInstId4": "1.3.6.1.4.1.2011.5.25.356.1.1.3.23"]
]

// --- hwEvpnMacDupVpnAlarmClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.356.1.1.2.2
// Fields: hwEvpnInstanceVpnName, hwEvpnMacRouteTag, hwEvpnInstanceMAC, hwEvpnInstanceIfName1, hwEvpnInstanceIfName2, hwEvpnInstanceIfName3, hwEvpnInstanceIfName4, hwEvpnInstanceIPAddress1, hwEvpnInstanceIPAddress2, hwEvpnInstanceIPAddress3, hwEvpnInstanceIPAddress4, hwEvpnInstanceVcId, hwEvpnEvplInstId1, hwEvpnEvplInstId2, hwEvpnEvplInstId3, hwEvpnEvplInstId4
// Description: This object indicates that an EVPN instance name is used to clear an alarm when all MAC addresses are unsuppressed in the EVPN instance.
trapMap["1.3.6.1.4.1.2011.5.25.356.1.1.2.2"] = [
    name: "hwEvpnMacDupVpnAlarmClear",
    fields: ["hwEvpnInstanceVpnName", "hwEvpnMacRouteTag", "hwEvpnInstanceMAC", "hwEvpnInstanceIfName1", "hwEvpnInstanceIfName2", "hwEvpnInstanceIfName3", "hwEvpnInstanceIfName4", "hwEvpnInstanceIPAddress1", "hwEvpnInstanceIPAddress2", "hwEvpnInstanceIPAddress3", "hwEvpnInstanceIPAddress4", "hwEvpnInstanceVcId", "hwEvpnEvplInstId1", "hwEvpnEvplInstId2", "hwEvpnEvplInstId3", "hwEvpnEvplInstId4"],
    fieldOids: ["hwEvpnInstanceVpnName": "1.3.6.1.4.1.2011.5.25.356.1.1.1.1.1.1", "hwEvpnMacRouteTag": "1.3.6.1.4.1.2011.5.25.356.1.1.3.9", "hwEvpnInstanceMAC": "1.3.6.1.4.1.2011.5.25.356.1.1.3.10", "hwEvpnInstanceIfName1": "1.3.6.1.4.1.2011.5.25.356.1.1.3.11", "hwEvpnInstanceIfName2": "1.3.6.1.4.1.2011.5.25.356.1.1.3.12", "hwEvpnInstanceIfName3": "1.3.6.1.4.1.2011.5.25.356.1.1.3.13", "hwEvpnInstanceIfName4": "1.3.6.1.4.1.2011.5.25.356.1.1.3.14", "hwEvpnInstanceIPAddress1": "1.3.6.1.4.1.2011.5.25.356.1.1.3.15", "hwEvpnInstanceIPAddress2": "1.3.6.1.4.1.2011.5.25.356.1.1.3.16", "hwEvpnInstanceIPAddress3": "1.3.6.1.4.1.2011.5.25.356.1.1.3.17", "hwEvpnInstanceIPAddress4": "1.3.6.1.4.1.2011.5.25.356.1.1.3.18", "hwEvpnInstanceVcId": "1.3.6.1.4.1.2011.5.25.356.1.1.3.19", "hwEvpnEvplInstId1": "1.3.6.1.4.1.2011.5.25.356.1.1.3.20", "hwEvpnEvplInstId2": "1.3.6.1.4.1.2011.5.25.356.1.1.3.21", "hwEvpnEvplInstId3": "1.3.6.1.4.1.2011.5.25.356.1.1.3.22", "hwEvpnEvplInstId4": "1.3.6.1.4.1.2011.5.25.356.1.1.3.23"]
]

// --- hwEvpnEtreeMulErrConfig (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.356.1.1.2.3
// Fields: hwEvpnInstanceVpnName, hwEvpnInstanceIfName
// Description: This object indicates that an EVPN instance name is used to report an alarm for leaf attribute difference between AC interfaces bound to an EVPN instance in an EVPN E-Tree dual-homing scenario.
trapMap["1.3.6.1.4.1.2011.5.25.356.1.1.2.3"] = [
    name: "hwEvpnEtreeMulErrConfig",
    fields: ["hwEvpnInstanceVpnName", "hwEvpnInstanceIfName"],
    fieldOids: ["hwEvpnInstanceVpnName": "1.3.6.1.4.1.2011.5.25.356.1.1.1.1.1.1", "hwEvpnInstanceIfName": "1.3.6.1.4.1.2011.5.25.356.1.1.1.1.1.2"]
]

// --- hwEvpnSRv6ModifyArglenCfg (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.356.1.1.2.4
// Fields: hwEvpnInstanceLastArgLen, hwEvpnInstanceCurrentArgLen
// Description: This object indicates that the minimum length of the ARG is changed, split horizon function may fail temporarily.
trapMap["1.3.6.1.4.1.2011.5.25.356.1.1.2.4"] = [
    name: "hwEvpnSRv6ModifyArglenCfg",
    fields: ["hwEvpnInstanceLastArgLen", "hwEvpnInstanceCurrentArgLen"],
    fieldOids: ["hwEvpnInstanceLastArgLen": "1.3.6.1.4.1.2011.5.25.356.1.1.3.1", "hwEvpnInstanceCurrentArgLen": "1.3.6.1.4.1.2011.5.25.356.1.1.3.2"]
]

// --- hwEvpnEvplInstDown (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.356.1.1.2.5
// Fields: hwEvpnEvplInstanceId, hwEvpnEvplInstanceStatus
// Description: The SNMP trap that is generated when an EVPL instance status change to down.
trapMap["1.3.6.1.4.1.2011.5.25.356.1.1.2.5"] = [
    name: "hwEvpnEvplInstDown",
    fields: ["hwEvpnEvplInstanceId", "hwEvpnEvplInstanceStatus"],
    fieldOids: ["hwEvpnEvplInstanceId": "1.3.6.1.4.1.2011.5.25.356.1.1.3.3", "hwEvpnEvplInstanceStatus": "1.3.6.1.4.1.2011.5.25.356.1.1.3.4"]
]

// --- hwEvpnEvplInstUp (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.356.1.1.2.6
// Fields: hwEvpnEvplInstanceId, hwEvpnEvplInstanceStatus
// Description: The SNMP trap that is generated when an EVPL instance status change to up.
trapMap["1.3.6.1.4.1.2011.5.25.356.1.1.2.6"] = [
    name: "hwEvpnEvplInstUp",
    fields: ["hwEvpnEvplInstanceId", "hwEvpnEvplInstanceStatus"],
    fieldOids: ["hwEvpnEvplInstanceId": "1.3.6.1.4.1.2011.5.25.356.1.1.3.3", "hwEvpnEvplInstanceStatus": "1.3.6.1.4.1.2011.5.25.356.1.1.3.4"]
]

// --- hwEvpnDiscardRoute (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.356.1.1.2.7
// Fields: hwEvpnDiscardRouteType
// Description: This object indicates that The EVPN instance discards newly learned MAC, MAC/IP, IMET, and Ethernet A-D per-EVI routes.
trapMap["1.3.6.1.4.1.2011.5.25.356.1.1.2.7"] = [
    name: "hwEvpnDiscardRoute",
    fields: ["hwEvpnDiscardRouteType"],
    fieldOids: ["hwEvpnDiscardRouteType": "1.3.6.1.4.1.2011.5.25.356.1.1.3.5"]
]

// --- hwEvpnRingIdConflictAlm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.356.1.1.2.8
// Fields: hwEvpnRingId, hwEvpnRouterId
// Description: This object indicates that the number of peers with the same ring-id exceeded the upper limit.
trapMap["1.3.6.1.4.1.2011.5.25.356.1.1.2.8"] = [
    name: "hwEvpnRingIdConflictAlm",
    fields: ["hwEvpnRingId", "hwEvpnRouterId"],
    fieldOids: ["hwEvpnRingId": "1.3.6.1.4.1.2011.5.25.356.1.1.3.6", "hwEvpnRouterId": "1.3.6.1.4.1.2011.5.25.356.1.1.3.7"]
]

// --- hwEvpnRingIdConflictAlmClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.356.1.1.2.9
// Fields: hwEvpnRingId, hwEvpnRouterId
// Description: This object indicates that the number of peers with the same ring-id not exceeded the upper limit.
trapMap["1.3.6.1.4.1.2011.5.25.356.1.1.2.9"] = [
    name: "hwEvpnRingIdConflictAlmClear",
    fields: ["hwEvpnRingId", "hwEvpnRouterId"],
    fieldOids: ["hwEvpnRingId": "1.3.6.1.4.1.2011.5.25.356.1.1.3.6", "hwEvpnRouterId": "1.3.6.1.4.1.2011.5.25.356.1.1.3.7"]
]

// --- hwEvpnQualifyBumTableRes (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.356.1.1.2.10
// Fields: hwEvpnBumUpperLimit
// Description: This object indicates that the number of EVPN qualify BUM resources reached the upper limit.
trapMap["1.3.6.1.4.1.2011.5.25.356.1.1.2.10"] = [
    name: "hwEvpnQualifyBumTableRes",
    fields: ["hwEvpnBumUpperLimit"],
    fieldOids: ["hwEvpnBumUpperLimit": "1.3.6.1.4.1.2011.5.25.356.1.1.3.8"]
]

// --- hwEvpnQualifyBumTableResClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.356.1.1.2.11
// Fields: hwEvpnBumUpperLimit
// Description: This object indicates that the number of EVPN qualify BUM resources returned to normal.
trapMap["1.3.6.1.4.1.2011.5.25.356.1.1.2.11"] = [
    name: "hwEvpnQualifyBumTableResClear",
    fields: ["hwEvpnBumUpperLimit"],
    fieldOids: ["hwEvpnBumUpperLimit": "1.3.6.1.4.1.2011.5.25.356.1.1.3.8"]
]

// --- hwEvpnEvplAlarmDown (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.356.1.1.2.12
// Fields: hwEvpnEvplInstanceId, hwEvpnEvplInstanceStatus
// Description: The SNMP alarm trap that is generated when an EVPL instance status change to down.
trapMap["1.3.6.1.4.1.2011.5.25.356.1.1.2.12"] = [
    name: "hwEvpnEvplAlarmDown",
    fields: ["hwEvpnEvplInstanceId", "hwEvpnEvplInstanceStatus"],
    fieldOids: ["hwEvpnEvplInstanceId": "1.3.6.1.4.1.2011.5.25.356.1.1.3.3", "hwEvpnEvplInstanceStatus": "1.3.6.1.4.1.2011.5.25.356.1.1.3.4"]
]

// --- hwEvpnEvplAlarmUp (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.356.1.1.2.13
// Fields: hwEvpnEvplInstanceId, hwEvpnEvplInstanceStatus
// Description: The SNMP alarm trap that is generated when an EVPL instance status change to up.
trapMap["1.3.6.1.4.1.2011.5.25.356.1.1.2.13"] = [
    name: "hwEvpnEvplAlarmUp",
    fields: ["hwEvpnEvplInstanceId", "hwEvpnEvplInstanceStatus"],
    fieldOids: ["hwEvpnEvplInstanceId": "1.3.6.1.4.1.2011.5.25.356.1.1.3.3", "hwEvpnEvplInstanceStatus": "1.3.6.1.4.1.2011.5.25.356.1.1.3.4"]
]

// --- hwEvpnMacFlappingVpnAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.356.1.1.2.14
// Fields: hwEvpnInstanceVpnName, hwEvpnMacRouteTag, hwEvpnInstanceMAC, hwEvpnInstanceIfName1, hwEvpnInstanceIfName2, hwEvpnInstanceIfName3, hwEvpnInstanceIfName4, hwEvpnInstanceIPAddress1, hwEvpnInstanceIPAddress2, hwEvpnInstanceIPAddress3, hwEvpnInstanceIPAddress4, hwEvpnInstanceVcId, hwEvpnEvplInstId1, hwEvpnEvplInstId2, hwEvpnEvplInstId3, hwEvpnEvplInstId4
// Description: This object indicates that an EVPN instance name is used to report an alarm when MAC Addresses were flapping in an EVPN Instance frequently.
trapMap["1.3.6.1.4.1.2011.5.25.356.1.1.2.14"] = [
    name: "hwEvpnMacFlappingVpnAlarm",
    fields: ["hwEvpnInstanceVpnName", "hwEvpnMacRouteTag", "hwEvpnInstanceMAC", "hwEvpnInstanceIfName1", "hwEvpnInstanceIfName2", "hwEvpnInstanceIfName3", "hwEvpnInstanceIfName4", "hwEvpnInstanceIPAddress1", "hwEvpnInstanceIPAddress2", "hwEvpnInstanceIPAddress3", "hwEvpnInstanceIPAddress4", "hwEvpnInstanceVcId", "hwEvpnEvplInstId1", "hwEvpnEvplInstId2", "hwEvpnEvplInstId3", "hwEvpnEvplInstId4"],
    fieldOids: ["hwEvpnInstanceVpnName": "1.3.6.1.4.1.2011.5.25.356.1.1.1.1.1.1", "hwEvpnMacRouteTag": "1.3.6.1.4.1.2011.5.25.356.1.1.3.9", "hwEvpnInstanceMAC": "1.3.6.1.4.1.2011.5.25.356.1.1.3.10", "hwEvpnInstanceIfName1": "1.3.6.1.4.1.2011.5.25.356.1.1.3.11", "hwEvpnInstanceIfName2": "1.3.6.1.4.1.2011.5.25.356.1.1.3.12", "hwEvpnInstanceIfName3": "1.3.6.1.4.1.2011.5.25.356.1.1.3.13", "hwEvpnInstanceIfName4": "1.3.6.1.4.1.2011.5.25.356.1.1.3.14", "hwEvpnInstanceIPAddress1": "1.3.6.1.4.1.2011.5.25.356.1.1.3.15", "hwEvpnInstanceIPAddress2": "1.3.6.1.4.1.2011.5.25.356.1.1.3.16", "hwEvpnInstanceIPAddress3": "1.3.6.1.4.1.2011.5.25.356.1.1.3.17", "hwEvpnInstanceIPAddress4": "1.3.6.1.4.1.2011.5.25.356.1.1.3.18", "hwEvpnInstanceVcId": "1.3.6.1.4.1.2011.5.25.356.1.1.3.19", "hwEvpnEvplInstId1": "1.3.6.1.4.1.2011.5.25.356.1.1.3.20", "hwEvpnEvplInstId2": "1.3.6.1.4.1.2011.5.25.356.1.1.3.21", "hwEvpnEvplInstId3": "1.3.6.1.4.1.2011.5.25.356.1.1.3.22", "hwEvpnEvplInstId4": "1.3.6.1.4.1.2011.5.25.356.1.1.3.23"]
]

// --- hwEvpnMacFlappingVpnAlarmClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.356.1.1.2.15
// Fields: hwEvpnInstanceVpnName, hwEvpnMacRouteTag, hwEvpnInstanceMAC, hwEvpnInstanceIfName1, hwEvpnInstanceIfName2, hwEvpnInstanceIfName3, hwEvpnInstanceIfName4, hwEvpnInstanceIPAddress1, hwEvpnInstanceIPAddress2, hwEvpnInstanceIPAddress3, hwEvpnInstanceIPAddress4, hwEvpnInstanceVcId, hwEvpnEvplInstId1, hwEvpnEvplInstId2, hwEvpnEvplInstId3, hwEvpnEvplInstId4
// Description: This object indicates that an EVPN instance name is used to clear an alarm when all MAC address flapping no longer occurs in the EVPN instance.
trapMap["1.3.6.1.4.1.2011.5.25.356.1.1.2.15"] = [
    name: "hwEvpnMacFlappingVpnAlarmClear",
    fields: ["hwEvpnInstanceVpnName", "hwEvpnMacRouteTag", "hwEvpnInstanceMAC", "hwEvpnInstanceIfName1", "hwEvpnInstanceIfName2", "hwEvpnInstanceIfName3", "hwEvpnInstanceIfName4", "hwEvpnInstanceIPAddress1", "hwEvpnInstanceIPAddress2", "hwEvpnInstanceIPAddress3", "hwEvpnInstanceIPAddress4", "hwEvpnInstanceVcId", "hwEvpnEvplInstId1", "hwEvpnEvplInstId2", "hwEvpnEvplInstId3", "hwEvpnEvplInstId4"],
    fieldOids: ["hwEvpnInstanceVpnName": "1.3.6.1.4.1.2011.5.25.356.1.1.1.1.1.1", "hwEvpnMacRouteTag": "1.3.6.1.4.1.2011.5.25.356.1.1.3.9", "hwEvpnInstanceMAC": "1.3.6.1.4.1.2011.5.25.356.1.1.3.10", "hwEvpnInstanceIfName1": "1.3.6.1.4.1.2011.5.25.356.1.1.3.11", "hwEvpnInstanceIfName2": "1.3.6.1.4.1.2011.5.25.356.1.1.3.12", "hwEvpnInstanceIfName3": "1.3.6.1.4.1.2011.5.25.356.1.1.3.13", "hwEvpnInstanceIfName4": "1.3.6.1.4.1.2011.5.25.356.1.1.3.14", "hwEvpnInstanceIPAddress1": "1.3.6.1.4.1.2011.5.25.356.1.1.3.15", "hwEvpnInstanceIPAddress2": "1.3.6.1.4.1.2011.5.25.356.1.1.3.16", "hwEvpnInstanceIPAddress3": "1.3.6.1.4.1.2011.5.25.356.1.1.3.17", "hwEvpnInstanceIPAddress4": "1.3.6.1.4.1.2011.5.25.356.1.1.3.18", "hwEvpnInstanceVcId": "1.3.6.1.4.1.2011.5.25.356.1.1.3.19", "hwEvpnEvplInstId1": "1.3.6.1.4.1.2011.5.25.356.1.1.3.20", "hwEvpnEvplInstId2": "1.3.6.1.4.1.2011.5.25.356.1.1.3.21", "hwEvpnEvplInstId3": "1.3.6.1.4.1.2011.5.25.356.1.1.3.22", "hwEvpnEvplInstId4": "1.3.6.1.4.1.2011.5.25.356.1.1.3.23"]
]

// ===== Parsing logic =====

// Set to true to enable diagnostic logging for this MIB parser
DEBUG = false

LOG_PREFIX = "[HUAWEI-EVPN-MIB]"
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
