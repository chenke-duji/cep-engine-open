/**
 * Auto-generated from HUAWEI-MFLP-MIB.mib
 * Generated: 2026-08-24T18:28:30.279648800
 * Traps/Notifications (38): hwMflpIfBlock, hwMflpIfResume, hwMflpAcBlock, hwMflpAcResume, hwMflpPwBlock, hwMflpPwResume, hwMflpVlanAlarm, hwMflpVsiAlarm, hwMflpMacAddrAlarm, hwMflpMacAddrResume, hwMflpQuitVlanAlarm, hwMflpQuitVlanResume, hwMflpVlanLoopAlarm, hwMflpVlanLoopAlarmResume, hwMflpDefaultAlarm, hwMflpDefaultResume, hwMflpBdAlarm, hwMflpBdAlarmResume, hwMflpBdPeriodicTrap, hwMflpVlanLoopPeriodicTrap, hwMflpBdAcBlock, hwMflpBdAcResume, hwMflpBdPwBlock, hwMflpBdPwResume, hwMflpBdAlarmOnly, hwMflpLinkBlocked, hwMflpLinkResumed, hwMflpBdLinkBlocked, hwMflpBdLinkResumed, hwMacHopTrafficSuppressVsiVlan, hwMacHopTrafficUnsuppressVsiVlan, hwMacHopTrafficSuppressVsiToken, hwMacHopTrafficUnsuppressVsiToken, hwMflpBdEvplBlock, hwMflpBdEvplResume, hwMflpBdAcSubVidBlock, hwMflpBdAcSubVidResume, hwMflpBdSubVidAlarmOnly
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

// --- hwMflpIfBlock (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.160.3.1
// Fields: hwMflpVlanCfgIfName, hwMflpVlanCfgBlockTime, hwMflpVlanCfgAlarmReason, hwMflpVlanDetectMAC
// Description: This notification indicates the interface blocked.
trapMap["1.3.6.1.4.1.2011.5.25.160.3.1"] = [
    name: "hwMflpIfBlock",
    fields: ["hwMflpVlanCfgIfName", "hwMflpVlanCfgBlockTime", "hwMflpVlanCfgAlarmReason", "hwMflpVlanDetectMAC"],
    fieldOids: ["hwMflpVlanCfgIfName": "1.3.6.1.4.1.2011.5.25.160.1.1.1.8", "hwMflpVlanCfgBlockTime": "1.3.6.1.4.1.2011.5.25.160.1.1.1.6", "hwMflpVlanCfgAlarmReason": "1.3.6.1.4.1.2011.5.25.160.1.1.1.9", "hwMflpVlanDetectMAC": "1.3.6.1.4.1.2011.5.25.160.1.1.1.11"]
]

// --- hwMflpIfResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.160.3.2
// Fields: hwMflpVlanCfgIfName, hwMflpVlanCfgBlockTime, hwMflpVlanCfgAlarmReason
// Description: This notification indicates the interface resumed.
trapMap["1.3.6.1.4.1.2011.5.25.160.3.2"] = [
    name: "hwMflpIfResume",
    fields: ["hwMflpVlanCfgIfName", "hwMflpVlanCfgBlockTime", "hwMflpVlanCfgAlarmReason"],
    fieldOids: ["hwMflpVlanCfgIfName": "1.3.6.1.4.1.2011.5.25.160.1.1.1.8", "hwMflpVlanCfgBlockTime": "1.3.6.1.4.1.2011.5.25.160.1.1.1.6", "hwMflpVlanCfgAlarmReason": "1.3.6.1.4.1.2011.5.25.160.1.1.1.9"]
]

// --- hwMflpAcBlock (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.160.3.3
// Fields: hwMflpVsiCfgAcName, hwMflpVsiCfgBlockTime, hwMflpVsiCfgAlarmReason, hwMflpVsiDetectMAC
// Description: This notification indicates the interface blocked.
trapMap["1.3.6.1.4.1.2011.5.25.160.3.3"] = [
    name: "hwMflpAcBlock",
    fields: ["hwMflpVsiCfgAcName", "hwMflpVsiCfgBlockTime", "hwMflpVsiCfgAlarmReason", "hwMflpVsiDetectMAC"],
    fieldOids: ["hwMflpVsiCfgAcName": "1.3.6.1.4.1.2011.5.25.160.1.2.1.9", "hwMflpVsiCfgBlockTime": "1.3.6.1.4.1.2011.5.25.160.1.2.1.6", "hwMflpVsiCfgAlarmReason": "1.3.6.1.4.1.2011.5.25.160.1.2.1.10", "hwMflpVsiDetectMAC": "1.3.6.1.4.1.2011.5.25.160.1.2.1.14"]
]

// --- hwMflpAcResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.160.3.4
// Fields: hwMflpVsiCfgAcName, hwMflpVsiCfgBlockTime, hwMflpVsiCfgAlarmReason
// Description: This notification indicates the interface resumed.
trapMap["1.3.6.1.4.1.2011.5.25.160.3.4"] = [
    name: "hwMflpAcResume",
    fields: ["hwMflpVsiCfgAcName", "hwMflpVsiCfgBlockTime", "hwMflpVsiCfgAlarmReason"],
    fieldOids: ["hwMflpVsiCfgAcName": "1.3.6.1.4.1.2011.5.25.160.1.2.1.9", "hwMflpVsiCfgBlockTime": "1.3.6.1.4.1.2011.5.25.160.1.2.1.6", "hwMflpVsiCfgAlarmReason": "1.3.6.1.4.1.2011.5.25.160.1.2.1.10"]
]

// --- hwMflpPwBlock (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.160.3.5
// Fields: hwMflpVsiCfgIpAddr, hwMflpVsiCfgPwId, hwMflpVsiCfgBlockTime, hwMflpVsiCfgAlarmReason, hwMflpVsiDetectMAC
// Description: This notification indicates the PW blocked.
trapMap["1.3.6.1.4.1.2011.5.25.160.3.5"] = [
    name: "hwMflpPwBlock",
    fields: ["hwMflpVsiCfgIpAddr", "hwMflpVsiCfgPwId", "hwMflpVsiCfgBlockTime", "hwMflpVsiCfgAlarmReason", "hwMflpVsiDetectMAC"],
    fieldOids: ["hwMflpVsiCfgIpAddr": "1.3.6.1.4.1.2011.5.25.160.1.2.1.11", "hwMflpVsiCfgPwId": "1.3.6.1.4.1.2011.5.25.160.1.2.1.12", "hwMflpVsiCfgBlockTime": "1.3.6.1.4.1.2011.5.25.160.1.2.1.6", "hwMflpVsiCfgAlarmReason": "1.3.6.1.4.1.2011.5.25.160.1.2.1.10", "hwMflpVsiDetectMAC": "1.3.6.1.4.1.2011.5.25.160.1.2.1.14"]
]

// --- hwMflpPwResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.160.3.6
// Fields: hwMflpVsiCfgIpAddr, hwMflpVsiCfgPwId, hwMflpVsiCfgBlockTime, hwMflpVsiCfgAlarmReason
// Description: This notification indicates the PW resumed.
trapMap["1.3.6.1.4.1.2011.5.25.160.3.6"] = [
    name: "hwMflpPwResume",
    fields: ["hwMflpVsiCfgIpAddr", "hwMflpVsiCfgPwId", "hwMflpVsiCfgBlockTime", "hwMflpVsiCfgAlarmReason"],
    fieldOids: ["hwMflpVsiCfgIpAddr": "1.3.6.1.4.1.2011.5.25.160.1.2.1.11", "hwMflpVsiCfgPwId": "1.3.6.1.4.1.2011.5.25.160.1.2.1.12", "hwMflpVsiCfgBlockTime": "1.3.6.1.4.1.2011.5.25.160.1.2.1.6", "hwMflpVsiCfgAlarmReason": "1.3.6.1.4.1.2011.5.25.160.1.2.1.10"]
]

// --- hwMflpVlanAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.160.3.7
// Fields: hwMflpVlanCfgAlarmReason
// Description: This notification indicates alarm only when loop existed in vlan.
trapMap["1.3.6.1.4.1.2011.5.25.160.3.7"] = [
    name: "hwMflpVlanAlarm",
    fields: ["hwMflpVlanCfgAlarmReason"],
    fieldOids: ["hwMflpVlanCfgAlarmReason": "1.3.6.1.4.1.2011.5.25.160.1.1.1.9"]
]

// --- hwMflpVsiAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.160.3.8
// Fields: hwMflpVsiCfgAlarmReason, hwMflpVsiDetectMAC, hwMflpVsiCfgAcName, hwMflpVsiCfgAcNameEx1, hwMflpVsiCfgAcNameEx2
// Description: This notification indicates alarm only when loop existed in vsi.
trapMap["1.3.6.1.4.1.2011.5.25.160.3.8"] = [
    name: "hwMflpVsiAlarm",
    fields: ["hwMflpVsiCfgAlarmReason", "hwMflpVsiDetectMAC", "hwMflpVsiCfgAcName", "hwMflpVsiCfgAcNameEx1", "hwMflpVsiCfgAcNameEx2"],
    fieldOids: ["hwMflpVsiCfgAlarmReason": "1.3.6.1.4.1.2011.5.25.160.1.2.1.10", "hwMflpVsiDetectMAC": "1.3.6.1.4.1.2011.5.25.160.1.2.1.14", "hwMflpVsiCfgAcName": "1.3.6.1.4.1.2011.5.25.160.1.2.1.9", "hwMflpVsiCfgAcNameEx1": "1.3.6.1.4.1.2011.5.25.160.1.2.1.16", "hwMflpVsiCfgAcNameEx2": "1.3.6.1.4.1.2011.5.25.160.1.2.1.17"]
]

// --- hwMflpMacAddrAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.160.3.9
// Fields: hwMflpVlanCfgMacAddr, hwMflpVlanCfgBlockTime, hwMflpVlanCfgPreIfName, hwMflpVlanCfgIfName, hwMflpVlanCfgAlarmReason
// Description: This notification indicates the MAC locked.
trapMap["1.3.6.1.4.1.2011.5.25.160.3.9"] = [
    name: "hwMflpMacAddrAlarm",
    fields: ["hwMflpVlanCfgMacAddr", "hwMflpVlanCfgBlockTime", "hwMflpVlanCfgPreIfName", "hwMflpVlanCfgIfName", "hwMflpVlanCfgAlarmReason"],
    fieldOids: ["hwMflpVlanCfgMacAddr": "1.3.6.1.4.1.2011.5.25.160.1.1.1.12", "hwMflpVlanCfgBlockTime": "1.3.6.1.4.1.2011.5.25.160.1.1.1.6", "hwMflpVlanCfgPreIfName": "1.3.6.1.4.1.2011.5.25.160.1.1.1.13", "hwMflpVlanCfgIfName": "1.3.6.1.4.1.2011.5.25.160.1.1.1.8", "hwMflpVlanCfgAlarmReason": "1.3.6.1.4.1.2011.5.25.160.1.1.1.9"]
]

// --- hwMflpMacAddrResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.160.3.10
// Fields: hwMflpVlanCfgMacAddr, hwMflpVlanCfgBlockTime, hwMflpVlanCfgPreIfName, hwMflpVlanCfgIfName, hwMflpVlanCfgAlarmReason
// Description: This notification indicates the MAC resumed.
trapMap["1.3.6.1.4.1.2011.5.25.160.3.10"] = [
    name: "hwMflpMacAddrResume",
    fields: ["hwMflpVlanCfgMacAddr", "hwMflpVlanCfgBlockTime", "hwMflpVlanCfgPreIfName", "hwMflpVlanCfgIfName", "hwMflpVlanCfgAlarmReason"],
    fieldOids: ["hwMflpVlanCfgMacAddr": "1.3.6.1.4.1.2011.5.25.160.1.1.1.12", "hwMflpVlanCfgBlockTime": "1.3.6.1.4.1.2011.5.25.160.1.1.1.6", "hwMflpVlanCfgPreIfName": "1.3.6.1.4.1.2011.5.25.160.1.1.1.13", "hwMflpVlanCfgIfName": "1.3.6.1.4.1.2011.5.25.160.1.1.1.8", "hwMflpVlanCfgAlarmReason": "1.3.6.1.4.1.2011.5.25.160.1.1.1.9"]
]

// --- hwMflpQuitVlanAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.160.3.11
// Fields: hwMflpVlanCfgIfName, hwMflpVlanCfgAlarmReason
// Description: This notification indicates the interface leaved from vlan because mac move detected.
trapMap["1.3.6.1.4.1.2011.5.25.160.3.11"] = [
    name: "hwMflpQuitVlanAlarm",
    fields: ["hwMflpVlanCfgIfName", "hwMflpVlanCfgAlarmReason"],
    fieldOids: ["hwMflpVlanCfgIfName": "1.3.6.1.4.1.2011.5.25.160.1.1.1.8", "hwMflpVlanCfgAlarmReason": "1.3.6.1.4.1.2011.5.25.160.1.1.1.9"]
]

// --- hwMflpQuitVlanResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.160.3.12
// Fields: hwMflpVlanCfgIfName, hwMflpVlanCfgAlarmReason
// Description: This notification indicates the Interface leaved from vlan resumed.
trapMap["1.3.6.1.4.1.2011.5.25.160.3.12"] = [
    name: "hwMflpQuitVlanResume",
    fields: ["hwMflpVlanCfgIfName", "hwMflpVlanCfgAlarmReason"],
    fieldOids: ["hwMflpVlanCfgIfName": "1.3.6.1.4.1.2011.5.25.160.1.1.1.8", "hwMflpVlanCfgAlarmReason": "1.3.6.1.4.1.2011.5.25.160.1.1.1.9"]
]

// --- hwMflpVlanLoopAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.160.3.13
// Fields: hwMflpVlanId, hwMflpVlanCfgPreIfName, hwMflpVlanCfgIfName, hwMflpVlanCfgIfName, hwMflpVlanCfgAlarmReason
// Description: This notification indicates alarm only when loop existed in vlan.
trapMap["1.3.6.1.4.1.2011.5.25.160.3.13"] = [
    name: "hwMflpVlanLoopAlarm",
    fields: ["hwMflpVlanId", "hwMflpVlanCfgPreIfName", "hwMflpVlanCfgIfName", "hwMflpVlanCfgIfName", "hwMflpVlanCfgAlarmReason"],
    fieldOids: ["hwMflpVlanId": "1.3.6.1.4.1.2011.5.25.160.1.1.1.1", "hwMflpVlanCfgPreIfName": "1.3.6.1.4.1.2011.5.25.160.1.1.1.13", "hwMflpVlanCfgIfName": "1.3.6.1.4.1.2011.5.25.160.1.1.1.8", "hwMflpVlanCfgAlarmReason": "1.3.6.1.4.1.2011.5.25.160.1.1.1.9"]
]

// --- hwMflpVlanLoopAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.160.3.14
// Fields: hwMflpVlanId, hwMflpVlanCfgPreIfName, hwMflpVlanCfgIfName, hwMflpVlanCfgIfName, hwMflpVlanCfgAlarmReason
// Description: This notification indicates alarm only when loop existed in vlan.
trapMap["1.3.6.1.4.1.2011.5.25.160.3.14"] = [
    name: "hwMflpVlanLoopAlarmResume",
    fields: ["hwMflpVlanId", "hwMflpVlanCfgPreIfName", "hwMflpVlanCfgIfName", "hwMflpVlanCfgIfName", "hwMflpVlanCfgAlarmReason"],
    fieldOids: ["hwMflpVlanId": "1.3.6.1.4.1.2011.5.25.160.1.1.1.1", "hwMflpVlanCfgPreIfName": "1.3.6.1.4.1.2011.5.25.160.1.1.1.13", "hwMflpVlanCfgIfName": "1.3.6.1.4.1.2011.5.25.160.1.1.1.8", "hwMflpVlanCfgAlarmReason": "1.3.6.1.4.1.2011.5.25.160.1.1.1.9"]
]

// --- hwMflpDefaultAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.160.3.15
// Fields: hwMflpVlanId, hwMflpVsiName
// Description: This notification indicates alarm only when loop existed.
trapMap["1.3.6.1.4.1.2011.5.25.160.3.15"] = [
    name: "hwMflpDefaultAlarm",
    fields: ["hwMflpVlanId", "hwMflpVsiName"],
    fieldOids: ["hwMflpVlanId": "1.3.6.1.4.1.2011.5.25.160.1.1.1.1", "hwMflpVsiName": "1.3.6.1.4.1.2011.5.25.160.1.2.1.1"]
]

// --- hwMflpDefaultResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.160.3.16
// Fields: hwMflpVlanId, hwMflpVsiName
// Description: This notification indicates alarm only when loop resumed.
trapMap["1.3.6.1.4.1.2011.5.25.160.3.16"] = [
    name: "hwMflpDefaultResume",
    fields: ["hwMflpVlanId", "hwMflpVsiName"],
    fieldOids: ["hwMflpVlanId": "1.3.6.1.4.1.2011.5.25.160.1.1.1.1", "hwMflpVsiName": "1.3.6.1.4.1.2011.5.25.160.1.2.1.1"]
]

// --- hwMflpBdAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.160.3.17
// Fields: hwMflpBdId, hwMflpIfName, hwMflpIfName, hwMflpIfName, hwMflpAlarmReason
// Description: This notification indicates alarm only when loop existed in bd.
trapMap["1.3.6.1.4.1.2011.5.25.160.3.17"] = [
    name: "hwMflpBdAlarm",
    fields: ["hwMflpBdId", "hwMflpIfName", "hwMflpIfName", "hwMflpIfName", "hwMflpAlarmReason"],
    fieldOids: ["hwMflpBdId": "1.3.6.1.4.1.2011.5.25.160.2.2", "hwMflpIfName": "1.3.6.1.4.1.2011.5.25.160.2.3", "hwMflpAlarmReason": "1.3.6.1.4.1.2011.5.25.160.2.4"]
]

// --- hwMflpBdAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.160.3.18
// Fields: hwMflpBdId, hwMflpIfName, hwMflpIfName, hwMflpIfName, hwMflpAlarmReason
// Description: This notification indicates alarm only when loop existed in bd.
trapMap["1.3.6.1.4.1.2011.5.25.160.3.18"] = [
    name: "hwMflpBdAlarmResume",
    fields: ["hwMflpBdId", "hwMflpIfName", "hwMflpIfName", "hwMflpIfName", "hwMflpAlarmReason"],
    fieldOids: ["hwMflpBdId": "1.3.6.1.4.1.2011.5.25.160.2.2", "hwMflpIfName": "1.3.6.1.4.1.2011.5.25.160.2.3", "hwMflpAlarmReason": "1.3.6.1.4.1.2011.5.25.160.2.4"]
]

// --- hwMflpBdPeriodicTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.160.3.19
// Fields: hwMflpBdId, hwMflpIfName, hwMflpIfName, hwMflpIfName, hwMflpAlarmReason
// Description: This notification only for bd mac flapping periodic send.
trapMap["1.3.6.1.4.1.2011.5.25.160.3.19"] = [
    name: "hwMflpBdPeriodicTrap",
    fields: ["hwMflpBdId", "hwMflpIfName", "hwMflpIfName", "hwMflpIfName", "hwMflpAlarmReason"],
    fieldOids: ["hwMflpBdId": "1.3.6.1.4.1.2011.5.25.160.2.2", "hwMflpIfName": "1.3.6.1.4.1.2011.5.25.160.2.3", "hwMflpAlarmReason": "1.3.6.1.4.1.2011.5.25.160.2.4"]
]

// --- hwMflpVlanLoopPeriodicTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.160.3.20
// Fields: hwMflpVlanId, hwMflpVlanCfgPreIfName, hwMflpVlanCfgIfName, hwMflpVlanCfgIfName, hwMflpVlanCfgAlarmReason
// Description: This notification only for vlan mac flapping periodic send.
trapMap["1.3.6.1.4.1.2011.5.25.160.3.20"] = [
    name: "hwMflpVlanLoopPeriodicTrap",
    fields: ["hwMflpVlanId", "hwMflpVlanCfgPreIfName", "hwMflpVlanCfgIfName", "hwMflpVlanCfgIfName", "hwMflpVlanCfgAlarmReason"],
    fieldOids: ["hwMflpVlanId": "1.3.6.1.4.1.2011.5.25.160.1.1.1.1", "hwMflpVlanCfgPreIfName": "1.3.6.1.4.1.2011.5.25.160.1.1.1.13", "hwMflpVlanCfgIfName": "1.3.6.1.4.1.2011.5.25.160.1.1.1.8", "hwMflpVlanCfgAlarmReason": "1.3.6.1.4.1.2011.5.25.160.1.1.1.9"]
]

// --- hwMflpBdAcBlock (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.160.3.21
// Fields: hwMflpBdIndex, hwMflpBdCfgAcName, hwMflpBdCfgBlockTime, hwMflpBdCfgAlarmReason, hwMflpBdDetectMAC
// Description: This notification indicates the interface blocked.
trapMap["1.3.6.1.4.1.2011.5.25.160.3.21"] = [
    name: "hwMflpBdAcBlock",
    fields: ["hwMflpBdIndex", "hwMflpBdCfgAcName", "hwMflpBdCfgBlockTime", "hwMflpBdCfgAlarmReason", "hwMflpBdDetectMAC"],
    fieldOids: ["hwMflpBdIndex": "1.3.6.1.4.1.2011.5.25.160.1.3.1.1", "hwMflpBdCfgAcName": "1.3.6.1.4.1.2011.5.25.160.1.3.1.3", "hwMflpBdCfgBlockTime": "1.3.6.1.4.1.2011.5.25.160.1.3.1.2", "hwMflpBdCfgAlarmReason": "1.3.6.1.4.1.2011.5.25.160.1.3.1.4", "hwMflpBdDetectMAC": "1.3.6.1.4.1.2011.5.25.160.1.3.1.5"]
]

// --- hwMflpBdAcResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.160.3.22
// Fields: hwMflpBdIndex, hwMflpBdCfgAcName, hwMflpBdCfgBlockTime, hwMflpBdCfgAlarmReason
// Description: This notification indicates the interface resumed.
trapMap["1.3.6.1.4.1.2011.5.25.160.3.22"] = [
    name: "hwMflpBdAcResume",
    fields: ["hwMflpBdIndex", "hwMflpBdCfgAcName", "hwMflpBdCfgBlockTime", "hwMflpBdCfgAlarmReason"],
    fieldOids: ["hwMflpBdIndex": "1.3.6.1.4.1.2011.5.25.160.1.3.1.1", "hwMflpBdCfgAcName": "1.3.6.1.4.1.2011.5.25.160.1.3.1.3", "hwMflpBdCfgBlockTime": "1.3.6.1.4.1.2011.5.25.160.1.3.1.2", "hwMflpBdCfgAlarmReason": "1.3.6.1.4.1.2011.5.25.160.1.3.1.4"]
]

// --- hwMflpBdPwBlock (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.160.3.23
// Fields: hwMflpBdIndex, hwMflpBdCfgVsiName, hwMflpBdCfgIpAddr, hwMflpBdCfgPwId, hwMflpBdCfgBlockTime, hwMflpBdCfgAlarmReason, hwMflpBdDetectMAC
// Description: This notification indicates the interface blocked.
trapMap["1.3.6.1.4.1.2011.5.25.160.3.23"] = [
    name: "hwMflpBdPwBlock",
    fields: ["hwMflpBdIndex", "hwMflpBdCfgVsiName", "hwMflpBdCfgIpAddr", "hwMflpBdCfgPwId", "hwMflpBdCfgBlockTime", "hwMflpBdCfgAlarmReason", "hwMflpBdDetectMAC"],
    fieldOids: ["hwMflpBdIndex": "1.3.6.1.4.1.2011.5.25.160.1.3.1.1", "hwMflpBdCfgVsiName": "1.3.6.1.4.1.2011.5.25.160.1.3.1.8", "hwMflpBdCfgIpAddr": "1.3.6.1.4.1.2011.5.25.160.1.3.1.9", "hwMflpBdCfgPwId": "1.3.6.1.4.1.2011.5.25.160.1.3.1.10", "hwMflpBdCfgBlockTime": "1.3.6.1.4.1.2011.5.25.160.1.3.1.2", "hwMflpBdCfgAlarmReason": "1.3.6.1.4.1.2011.5.25.160.1.3.1.4", "hwMflpBdDetectMAC": "1.3.6.1.4.1.2011.5.25.160.1.3.1.5"]
]

// --- hwMflpBdPwResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.160.3.24
// Fields: hwMflpBdIndex, hwMflpBdCfgVsiName, hwMflpBdCfgIpAddr, hwMflpBdCfgPwId, hwMflpBdCfgBlockTime, hwMflpBdCfgAlarmReason
// Description: This notification indicates the interface resumed.
trapMap["1.3.6.1.4.1.2011.5.25.160.3.24"] = [
    name: "hwMflpBdPwResume",
    fields: ["hwMflpBdIndex", "hwMflpBdCfgVsiName", "hwMflpBdCfgIpAddr", "hwMflpBdCfgPwId", "hwMflpBdCfgBlockTime", "hwMflpBdCfgAlarmReason"],
    fieldOids: ["hwMflpBdIndex": "1.3.6.1.4.1.2011.5.25.160.1.3.1.1", "hwMflpBdCfgVsiName": "1.3.6.1.4.1.2011.5.25.160.1.3.1.8", "hwMflpBdCfgIpAddr": "1.3.6.1.4.1.2011.5.25.160.1.3.1.9", "hwMflpBdCfgPwId": "1.3.6.1.4.1.2011.5.25.160.1.3.1.10", "hwMflpBdCfgBlockTime": "1.3.6.1.4.1.2011.5.25.160.1.3.1.2", "hwMflpBdCfgAlarmReason": "1.3.6.1.4.1.2011.5.25.160.1.3.1.4"]
]

// --- hwMflpBdAlarmOnly (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.160.3.25
// Fields: hwMflpBdIndex, hwMflpBdCfgAcName, hwMflpBdCfgAcNameEx1, hwMflpBdCfgAcNameEx2, hwMflpBdCfgAlarmReason, hwMflpBdDetectMAC
// Description: This notification indicates alarm only when loop existed in BD.
trapMap["1.3.6.1.4.1.2011.5.25.160.3.25"] = [
    name: "hwMflpBdAlarmOnly",
    fields: ["hwMflpBdIndex", "hwMflpBdCfgAcName", "hwMflpBdCfgAcNameEx1", "hwMflpBdCfgAcNameEx2", "hwMflpBdCfgAlarmReason", "hwMflpBdDetectMAC"],
    fieldOids: ["hwMflpBdIndex": "1.3.6.1.4.1.2011.5.25.160.1.3.1.1", "hwMflpBdCfgAcName": "1.3.6.1.4.1.2011.5.25.160.1.3.1.3", "hwMflpBdCfgAcNameEx1": "1.3.6.1.4.1.2011.5.25.160.1.3.1.6", "hwMflpBdCfgAcNameEx2": "1.3.6.1.4.1.2011.5.25.160.1.3.1.7", "hwMflpBdCfgAlarmReason": "1.3.6.1.4.1.2011.5.25.160.1.3.1.4", "hwMflpBdDetectMAC": "1.3.6.1.4.1.2011.5.25.160.1.3.1.5"]
]

// --- hwMflpLinkBlocked (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.160.3.26
// Fields: hwMflpVsiName, hwMflpVsiCfgAcName, hwMflpLinkBlkedIfName, hwMflpVsiCfgBlockTime
// Description: The main interface has been blocked due to MAC-Flapping association.
trapMap["1.3.6.1.4.1.2011.5.25.160.3.26"] = [
    name: "hwMflpLinkBlocked",
    fields: ["hwMflpVsiName", "hwMflpVsiCfgAcName", "hwMflpLinkBlkedIfName", "hwMflpVsiCfgBlockTime"],
    fieldOids: ["hwMflpVsiName": "1.3.6.1.4.1.2011.5.25.160.1.2.1.1", "hwMflpVsiCfgAcName": "1.3.6.1.4.1.2011.5.25.160.1.2.1.9", "hwMflpLinkBlkedIfName": "1.3.6.1.4.1.2011.5.25.160.1.2.1.15", "hwMflpVsiCfgBlockTime": "1.3.6.1.4.1.2011.5.25.160.1.2.1.6"]
]

// --- hwMflpLinkResumed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.160.3.27
// Fields: hwMflpVsiName, hwMflpVsiCfgAcName, hwMflpLinkBlkedIfName
// Description: The main interface has been unblocked due to MAC-Flapping association.
trapMap["1.3.6.1.4.1.2011.5.25.160.3.27"] = [
    name: "hwMflpLinkResumed",
    fields: ["hwMflpVsiName", "hwMflpVsiCfgAcName", "hwMflpLinkBlkedIfName"],
    fieldOids: ["hwMflpVsiName": "1.3.6.1.4.1.2011.5.25.160.1.2.1.1", "hwMflpVsiCfgAcName": "1.3.6.1.4.1.2011.5.25.160.1.2.1.9", "hwMflpLinkBlkedIfName": "1.3.6.1.4.1.2011.5.25.160.1.2.1.15"]
]

// --- hwMflpBdLinkBlocked (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.160.3.28
// Fields: hwMflpBdIndex, hwMflpBdCfgAcName, hwMflpBdCfgAcNameEx1, hwMflpBdCfgBlockTime
// Description: The main interface has been blocked due to MAC-Flapping association.
trapMap["1.3.6.1.4.1.2011.5.25.160.3.28"] = [
    name: "hwMflpBdLinkBlocked",
    fields: ["hwMflpBdIndex", "hwMflpBdCfgAcName", "hwMflpBdCfgAcNameEx1", "hwMflpBdCfgBlockTime"],
    fieldOids: ["hwMflpBdIndex": "1.3.6.1.4.1.2011.5.25.160.1.3.1.1", "hwMflpBdCfgAcName": "1.3.6.1.4.1.2011.5.25.160.1.3.1.3", "hwMflpBdCfgAcNameEx1": "1.3.6.1.4.1.2011.5.25.160.1.3.1.6", "hwMflpBdCfgBlockTime": "1.3.6.1.4.1.2011.5.25.160.1.3.1.2"]
]

// --- hwMflpBdLinkResumed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.160.3.29
// Fields: hwMflpBdIndex, hwMflpBdCfgAcName, hwMflpBdCfgAcNameEx1
// Description: The main interface has been unblocked due to MAC-Flapping association.
trapMap["1.3.6.1.4.1.2011.5.25.160.3.29"] = [
    name: "hwMflpBdLinkResumed",
    fields: ["hwMflpBdIndex", "hwMflpBdCfgAcName", "hwMflpBdCfgAcNameEx1"],
    fieldOids: ["hwMflpBdIndex": "1.3.6.1.4.1.2011.5.25.160.1.3.1.1", "hwMflpBdCfgAcName": "1.3.6.1.4.1.2011.5.25.160.1.3.1.3", "hwMflpBdCfgAcNameEx1": "1.3.6.1.4.1.2011.5.25.160.1.3.1.6"]
]

// --- hwMacHopTrafficSuppressVsiVlan (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.160.3.30
// Fields: hwMacHopTrafficSuppressDomainType, hwMacHopTrafficSuppressDomainName, hwMacHopTrafficSuppressIfName, hwMacHopTrafficSuppressCmdType, hwMacHopTrafficSuppressCir
// Description: Traffic-suppress takes effect.
trapMap["1.3.6.1.4.1.2011.5.25.160.3.30"] = [
    name: "hwMacHopTrafficSuppressVsiVlan",
    fields: ["hwMacHopTrafficSuppressDomainType", "hwMacHopTrafficSuppressDomainName", "hwMacHopTrafficSuppressIfName", "hwMacHopTrafficSuppressCmdType", "hwMacHopTrafficSuppressCir"],
    fieldOids: ["hwMacHopTrafficSuppressDomainType": "1.3.6.1.4.1.2011.5.25.160.1.4.1.1", "hwMacHopTrafficSuppressDomainName": "1.3.6.1.4.1.2011.5.25.160.1.4.1.2", "hwMacHopTrafficSuppressIfName": "1.3.6.1.4.1.2011.5.25.160.1.4.1.3", "hwMacHopTrafficSuppressCmdType": "1.3.6.1.4.1.2011.5.25.160.1.4.1.4", "hwMacHopTrafficSuppressCir": "1.3.6.1.4.1.2011.5.25.160.1.4.1.5"]
]

// --- hwMacHopTrafficUnsuppressVsiVlan (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.160.3.31
// Fields: hwMacHopTrafficSuppressDomainType, hwMacHopTrafficSuppressDomainName, hwMacHopTrafficSuppressIfName, hwMacHopTrafficSuppressCmdType, hwMacHopTrafficSuppressCir
// Description: Traffic-suppress became ineffective.
trapMap["1.3.6.1.4.1.2011.5.25.160.3.31"] = [
    name: "hwMacHopTrafficUnsuppressVsiVlan",
    fields: ["hwMacHopTrafficSuppressDomainType", "hwMacHopTrafficSuppressDomainName", "hwMacHopTrafficSuppressIfName", "hwMacHopTrafficSuppressCmdType", "hwMacHopTrafficSuppressCir"],
    fieldOids: ["hwMacHopTrafficSuppressDomainType": "1.3.6.1.4.1.2011.5.25.160.1.4.1.1", "hwMacHopTrafficSuppressDomainName": "1.3.6.1.4.1.2011.5.25.160.1.4.1.2", "hwMacHopTrafficSuppressIfName": "1.3.6.1.4.1.2011.5.25.160.1.4.1.3", "hwMacHopTrafficSuppressCmdType": "1.3.6.1.4.1.2011.5.25.160.1.4.1.4", "hwMacHopTrafficSuppressCir": "1.3.6.1.4.1.2011.5.25.160.1.4.1.5"]
]

// --- hwMacHopTrafficSuppressVsiToken (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.160.3.32
// Fields: hwMacHopTrafficSuppressDomainType, hwMacHopTrafficSuppressDomainName, hwMacHopTrafficSuppressPeerIp, hwMacHopTrafficSuppressVcLabel, hwMacHopTrafficSuppressCmdType, hwMacHopTrafficSuppressCir
// Description: Traffic-suppress takes effect.
trapMap["1.3.6.1.4.1.2011.5.25.160.3.32"] = [
    name: "hwMacHopTrafficSuppressVsiToken",
    fields: ["hwMacHopTrafficSuppressDomainType", "hwMacHopTrafficSuppressDomainName", "hwMacHopTrafficSuppressPeerIp", "hwMacHopTrafficSuppressVcLabel", "hwMacHopTrafficSuppressCmdType", "hwMacHopTrafficSuppressCir"],
    fieldOids: ["hwMacHopTrafficSuppressDomainType": "1.3.6.1.4.1.2011.5.25.160.1.4.1.1", "hwMacHopTrafficSuppressDomainName": "1.3.6.1.4.1.2011.5.25.160.1.4.1.2", "hwMacHopTrafficSuppressPeerIp": "1.3.6.1.4.1.2011.5.25.160.1.4.1.6", "hwMacHopTrafficSuppressVcLabel": "1.3.6.1.4.1.2011.5.25.160.1.4.1.7", "hwMacHopTrafficSuppressCmdType": "1.3.6.1.4.1.2011.5.25.160.1.4.1.4", "hwMacHopTrafficSuppressCir": "1.3.6.1.4.1.2011.5.25.160.1.4.1.5"]
]

// --- hwMacHopTrafficUnsuppressVsiToken (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.160.3.33
// Fields: hwMacHopTrafficSuppressDomainType, hwMacHopTrafficSuppressDomainName, hwMacHopTrafficSuppressPeerIp, hwMacHopTrafficSuppressVcLabel, hwMacHopTrafficSuppressCmdType, hwMacHopTrafficSuppressCir
// Description: Traffic-suppress became ineffective.
trapMap["1.3.6.1.4.1.2011.5.25.160.3.33"] = [
    name: "hwMacHopTrafficUnsuppressVsiToken",
    fields: ["hwMacHopTrafficSuppressDomainType", "hwMacHopTrafficSuppressDomainName", "hwMacHopTrafficSuppressPeerIp", "hwMacHopTrafficSuppressVcLabel", "hwMacHopTrafficSuppressCmdType", "hwMacHopTrafficSuppressCir"],
    fieldOids: ["hwMacHopTrafficSuppressDomainType": "1.3.6.1.4.1.2011.5.25.160.1.4.1.1", "hwMacHopTrafficSuppressDomainName": "1.3.6.1.4.1.2011.5.25.160.1.4.1.2", "hwMacHopTrafficSuppressPeerIp": "1.3.6.1.4.1.2011.5.25.160.1.4.1.6", "hwMacHopTrafficSuppressVcLabel": "1.3.6.1.4.1.2011.5.25.160.1.4.1.7", "hwMacHopTrafficSuppressCmdType": "1.3.6.1.4.1.2011.5.25.160.1.4.1.4", "hwMacHopTrafficSuppressCir": "1.3.6.1.4.1.2011.5.25.160.1.4.1.5"]
]

// --- hwMflpBdEvplBlock (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.160.3.34
// Fields: hwMflpBdIndex, hwMflpBdCfgEvplId, hwMflpBdCfgBlockTime, hwMflpBdCfgAlarmReason, hwMflpBdDetectMAC
// Description: This notification indicates the evpl blocked.
trapMap["1.3.6.1.4.1.2011.5.25.160.3.34"] = [
    name: "hwMflpBdEvplBlock",
    fields: ["hwMflpBdIndex", "hwMflpBdCfgEvplId", "hwMflpBdCfgBlockTime", "hwMflpBdCfgAlarmReason", "hwMflpBdDetectMAC"],
    fieldOids: ["hwMflpBdIndex": "1.3.6.1.4.1.2011.5.25.160.1.3.1.1", "hwMflpBdCfgEvplId": "1.3.6.1.4.1.2011.5.25.160.1.3.1.11", "hwMflpBdCfgBlockTime": "1.3.6.1.4.1.2011.5.25.160.1.3.1.2", "hwMflpBdCfgAlarmReason": "1.3.6.1.4.1.2011.5.25.160.1.3.1.4", "hwMflpBdDetectMAC": "1.3.6.1.4.1.2011.5.25.160.1.3.1.5"]
]

// --- hwMflpBdEvplResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.160.3.35
// Fields: hwMflpBdIndex, hwMflpBdCfgEvplId, hwMflpBdCfgBlockTime, hwMflpBdCfgAlarmReason
// Description: This notification indicates the evpl resumed.
trapMap["1.3.6.1.4.1.2011.5.25.160.3.35"] = [
    name: "hwMflpBdEvplResume",
    fields: ["hwMflpBdIndex", "hwMflpBdCfgEvplId", "hwMflpBdCfgBlockTime", "hwMflpBdCfgAlarmReason"],
    fieldOids: ["hwMflpBdIndex": "1.3.6.1.4.1.2011.5.25.160.1.3.1.1", "hwMflpBdCfgEvplId": "1.3.6.1.4.1.2011.5.25.160.1.3.1.11", "hwMflpBdCfgBlockTime": "1.3.6.1.4.1.2011.5.25.160.1.3.1.2", "hwMflpBdCfgAlarmReason": "1.3.6.1.4.1.2011.5.25.160.1.3.1.4"]
]

// --- hwMflpBdAcSubVidBlock (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.160.3.36
// Fields: hwMflpBdIndex, hwMflpBdCfgAcName, hwMflpBdCfgBlockTime, hwMflpBdCfgAlarmReason, hwMflpBdDetectMAC
// Description: This notification indicates some of the VIDs of sub-interfaces in BD blocked.
trapMap["1.3.6.1.4.1.2011.5.25.160.3.36"] = [
    name: "hwMflpBdAcSubVidBlock",
    fields: ["hwMflpBdIndex", "hwMflpBdCfgAcName", "hwMflpBdCfgBlockTime", "hwMflpBdCfgAlarmReason", "hwMflpBdDetectMAC"],
    fieldOids: ["hwMflpBdIndex": "1.3.6.1.4.1.2011.5.25.160.1.3.1.1", "hwMflpBdCfgAcName": "1.3.6.1.4.1.2011.5.25.160.1.3.1.3", "hwMflpBdCfgBlockTime": "1.3.6.1.4.1.2011.5.25.160.1.3.1.2", "hwMflpBdCfgAlarmReason": "1.3.6.1.4.1.2011.5.25.160.1.3.1.4", "hwMflpBdDetectMAC": "1.3.6.1.4.1.2011.5.25.160.1.3.1.5"]
]

// --- hwMflpBdAcSubVidResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.160.3.37
// Fields: hwMflpBdIndex, hwMflpBdCfgAcName, hwMflpBdCfgBlockTime, hwMflpBdCfgAlarmReason
// Description: This notification indicates some of the VIDs of sub-interfaces in BD resumed.
trapMap["1.3.6.1.4.1.2011.5.25.160.3.37"] = [
    name: "hwMflpBdAcSubVidResume",
    fields: ["hwMflpBdIndex", "hwMflpBdCfgAcName", "hwMflpBdCfgBlockTime", "hwMflpBdCfgAlarmReason"],
    fieldOids: ["hwMflpBdIndex": "1.3.6.1.4.1.2011.5.25.160.1.3.1.1", "hwMflpBdCfgAcName": "1.3.6.1.4.1.2011.5.25.160.1.3.1.3", "hwMflpBdCfgBlockTime": "1.3.6.1.4.1.2011.5.25.160.1.3.1.2", "hwMflpBdCfgAlarmReason": "1.3.6.1.4.1.2011.5.25.160.1.3.1.4"]
]

// --- hwMflpBdSubVidAlarmOnly (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.160.3.38
// Fields: hwMflpBdIndex, hwMflpBdCfgAcName, hwMflpBdCfgAcNameEx1, hwMflpBdCfgAcNameEx2, hwMflpBdCfgAlarmReason, hwMflpBdDetectMAC
// Description: This notification indicates alarm only when the number of loops exceeds the upper limit with loop existed on some VIDs of sub-interfaces in BD.
trapMap["1.3.6.1.4.1.2011.5.25.160.3.38"] = [
    name: "hwMflpBdSubVidAlarmOnly",
    fields: ["hwMflpBdIndex", "hwMflpBdCfgAcName", "hwMflpBdCfgAcNameEx1", "hwMflpBdCfgAcNameEx2", "hwMflpBdCfgAlarmReason", "hwMflpBdDetectMAC"],
    fieldOids: ["hwMflpBdIndex": "1.3.6.1.4.1.2011.5.25.160.1.3.1.1", "hwMflpBdCfgAcName": "1.3.6.1.4.1.2011.5.25.160.1.3.1.3", "hwMflpBdCfgAcNameEx1": "1.3.6.1.4.1.2011.5.25.160.1.3.1.6", "hwMflpBdCfgAcNameEx2": "1.3.6.1.4.1.2011.5.25.160.1.3.1.7", "hwMflpBdCfgAlarmReason": "1.3.6.1.4.1.2011.5.25.160.1.3.1.4", "hwMflpBdDetectMAC": "1.3.6.1.4.1.2011.5.25.160.1.3.1.5"]
]

// ===== Parsing logic =====

// Set to true to enable diagnostic logging for this MIB parser
DEBUG = false

LOG_PREFIX = "[HUAWEI-MFLP-MIB]"
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
