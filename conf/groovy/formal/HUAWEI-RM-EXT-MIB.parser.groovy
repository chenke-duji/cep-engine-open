/**
 * Auto-generated from HUAWEI-RM-EXT-MIB.mib
 * Generated: 2026-08-24T18:28:30.827061
 * Traps/Notifications (54): hwTunnelGroupUp, hwTunnelGroupDown, hwStaticFrrDegraded, hwStaticFrrDegradedClear, hwStaticFrrOutage, hwStaticFrrOutageClear, hwStaticFrrSwitch, hwStaticFrrSwitchClear, hwTunnelSubExceed, hwTunnelSubExceedClear, hwIpv4PrefixExceed, hwIpv4PrefixExceedClear, hwIpv4PrefixThresholdExceed, hwIpv4PrefixThresholdExceedClear, hwIpv6PrefixExceed, hwIpv6PrefixExceedClear, hwIpv6PrefixThresholdExceed, hwIpv6PrefixThresholdExceedClear, hwGresmTokenExceed, hwGresmTokenExceedClear, hwGresmTokenThresholdExceed, hwGresmTokenThresholdExceedClear, hwPublicIpv4PrefixExceed, hwPublicIpv4PrefixExceedClear, hwPublicIpv4PrefixThresholdExceed, hwPublicIpv4PrefixThresholdExceedClear, hwPublicIpv6PrefixExceed, hwPublicIpv6PrefixExceedClear, hwPublicIpv6PrefixThresholdExceed, hwPublicIpv6PrefixThresholdExceedClear, hwL3vpnIpv6PrefixExceed, hwL3vpnIpv6PrefixExceedClear, hwL3vpnIpv6PrefixThresholdExceed, hwEvpnMacExceed, hwEvpnMacExceedClear, hwEvpnMacThresholdExceed, hwEvpnMacThresholdExceedClear, hwNhmRestrain, hwNhmRestrainClear, hwVlinkImportExceed, hwIpv4RouteExceed, hwIpv4RouteExceedClear, hwIpv4RouteThresholdExceed, hwIpv4RouteThresholdExceedClear, hwIpv6RouteExceed, hwIpv6RouteExceedClear, hwIpv6RouteThresholdExceed, hwIpv6RouteThresholdExceedClear, hwNhmCyclicIterateRestrain, hwNhmCyclicIterateRestrainClear, hwVstmMacExceed, hwVstmMacExceedClear, hwEvpnStickyMacConflict, hwEvpnStickyMacConflictClear
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

// --- hwTunnelGroupUp (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.145.6.1
// Fields: hwTnlDestination, hwTnlPolicy
// Description: The hwTunnelGroupUp alarm is reported when one or multiple tunnels in a tunnel group recover from a fault.
trapMap["1.3.6.1.4.1.2011.5.25.145.6.1"] = [
    name: "hwTunnelGroupUp",
    fields: ["hwTnlDestination", "hwTnlPolicy"],
    fieldOids: ["hwTnlDestination": "1.3.6.1.4.1.2011.5.25.145.5.1", "hwTnlPolicy": "1.3.6.1.4.1.2011.5.25.145.5.2"]
]

// --- hwTunnelGroupDown (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.145.6.2
// Fields: hwTnlDestination, hwTnlPolicy
// Description: The hwTunnelGroupDown alarm is generated if all tunnels in a tunnel group are faulty.
trapMap["1.3.6.1.4.1.2011.5.25.145.6.2"] = [
    name: "hwTunnelGroupDown",
    fields: ["hwTnlDestination", "hwTnlPolicy"],
    fieldOids: ["hwTnlDestination": "1.3.6.1.4.1.2011.5.25.145.5.1", "hwTnlPolicy": "1.3.6.1.4.1.2011.5.25.145.5.2"]
]

// --- hwStaticFrrDegraded (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.145.6.3
// Fields: hwStaticVpnName, hwMasterIfType, hwMasterName, hwMasterNHIP, hwBackupIfType, hwBackupName, hwBackupNHIP, hwChnlFlag, hwFrrType
// Description: FRR degraded alarm.
trapMap["1.3.6.1.4.1.2011.5.25.145.6.3"] = [
    name: "hwStaticFrrDegraded",
    fields: ["hwStaticVpnName", "hwMasterIfType", "hwMasterName", "hwMasterNHIP", "hwBackupIfType", "hwBackupName", "hwBackupNHIP", "hwChnlFlag", "hwFrrType"],
    fieldOids: ["hwStaticVpnName": "1.3.6.1.4.1.2011.5.25.145.5.3", "hwMasterIfType": "1.3.6.1.4.1.2011.5.25.145.5.4", "hwMasterName": "1.3.6.1.4.1.2011.5.25.145.5.5", "hwMasterNHIP": "1.3.6.1.4.1.2011.5.25.145.5.6", "hwBackupIfType": "1.3.6.1.4.1.2011.5.25.145.5.7", "hwBackupName": "1.3.6.1.4.1.2011.5.25.145.5.8", "hwBackupNHIP": "1.3.6.1.4.1.2011.5.25.145.5.9", "hwChnlFlag": "1.3.6.1.4.1.2011.5.25.145.5.10", "hwFrrType": "1.3.6.1.4.1.2011.5.25.145.5.11"]
]

// --- hwStaticFrrDegradedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.145.6.4
// Fields: hwStaticVpnName, hwMasterIfType, hwMasterName, hwMasterNHIP, hwBackupIfType, hwBackupName, hwBackupNHIP, hwChnlFlag, hwFrrType
// Description: The FRR instance has been deleted or the breakdown channel recovered.
trapMap["1.3.6.1.4.1.2011.5.25.145.6.4"] = [
    name: "hwStaticFrrDegradedClear",
    fields: ["hwStaticVpnName", "hwMasterIfType", "hwMasterName", "hwMasterNHIP", "hwBackupIfType", "hwBackupName", "hwBackupNHIP", "hwChnlFlag", "hwFrrType"],
    fieldOids: ["hwStaticVpnName": "1.3.6.1.4.1.2011.5.25.145.5.3", "hwMasterIfType": "1.3.6.1.4.1.2011.5.25.145.5.4", "hwMasterName": "1.3.6.1.4.1.2011.5.25.145.5.5", "hwMasterNHIP": "1.3.6.1.4.1.2011.5.25.145.5.6", "hwBackupIfType": "1.3.6.1.4.1.2011.5.25.145.5.7", "hwBackupName": "1.3.6.1.4.1.2011.5.25.145.5.8", "hwBackupNHIP": "1.3.6.1.4.1.2011.5.25.145.5.9", "hwChnlFlag": "1.3.6.1.4.1.2011.5.25.145.5.10", "hwFrrType": "1.3.6.1.4.1.2011.5.25.145.5.11"]
]

// --- hwStaticFrrOutage (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.145.6.5
// Fields: hwStaticVpnName, hwMasterIfType, hwMasterName, hwMasterNHIP, hwBackupIfType, hwBackupName, hwBackupNHIP, hwFrrType
// Description: FRR outage alarm.
trapMap["1.3.6.1.4.1.2011.5.25.145.6.5"] = [
    name: "hwStaticFrrOutage",
    fields: ["hwStaticVpnName", "hwMasterIfType", "hwMasterName", "hwMasterNHIP", "hwBackupIfType", "hwBackupName", "hwBackupNHIP", "hwFrrType"],
    fieldOids: ["hwStaticVpnName": "1.3.6.1.4.1.2011.5.25.145.5.3", "hwMasterIfType": "1.3.6.1.4.1.2011.5.25.145.5.4", "hwMasterName": "1.3.6.1.4.1.2011.5.25.145.5.5", "hwMasterNHIP": "1.3.6.1.4.1.2011.5.25.145.5.6", "hwBackupIfType": "1.3.6.1.4.1.2011.5.25.145.5.7", "hwBackupName": "1.3.6.1.4.1.2011.5.25.145.5.8", "hwBackupNHIP": "1.3.6.1.4.1.2011.5.25.145.5.9", "hwFrrType": "1.3.6.1.4.1.2011.5.25.145.5.11"]
]

// --- hwStaticFrrOutageClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.145.6.6
// Fields: hwStaticVpnName, hwMasterIfType, hwMasterName, hwMasterNHIP, hwBackupIfType, hwBackupName, hwBackupNHIP, hwFrrType
// Description: The FRR instance has been deleted or the breakdown channel recovered.
trapMap["1.3.6.1.4.1.2011.5.25.145.6.6"] = [
    name: "hwStaticFrrOutageClear",
    fields: ["hwStaticVpnName", "hwMasterIfType", "hwMasterName", "hwMasterNHIP", "hwBackupIfType", "hwBackupName", "hwBackupNHIP", "hwFrrType"],
    fieldOids: ["hwStaticVpnName": "1.3.6.1.4.1.2011.5.25.145.5.3", "hwMasterIfType": "1.3.6.1.4.1.2011.5.25.145.5.4", "hwMasterName": "1.3.6.1.4.1.2011.5.25.145.5.5", "hwMasterNHIP": "1.3.6.1.4.1.2011.5.25.145.5.6", "hwBackupIfType": "1.3.6.1.4.1.2011.5.25.145.5.7", "hwBackupName": "1.3.6.1.4.1.2011.5.25.145.5.8", "hwBackupNHIP": "1.3.6.1.4.1.2011.5.25.145.5.9", "hwFrrType": "1.3.6.1.4.1.2011.5.25.145.5.11"]
]

// --- hwStaticFrrSwitch (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.145.6.7
// Fields: hwStaticVpnName, hwMasterIfType, hwMasterName, hwMasterNHIP, hwBackupIfType, hwBackupName, hwBackupNHIP, hwFrrType
// Description: FRR switched alarm.
trapMap["1.3.6.1.4.1.2011.5.25.145.6.7"] = [
    name: "hwStaticFrrSwitch",
    fields: ["hwStaticVpnName", "hwMasterIfType", "hwMasterName", "hwMasterNHIP", "hwBackupIfType", "hwBackupName", "hwBackupNHIP", "hwFrrType"],
    fieldOids: ["hwStaticVpnName": "1.3.6.1.4.1.2011.5.25.145.5.3", "hwMasterIfType": "1.3.6.1.4.1.2011.5.25.145.5.4", "hwMasterName": "1.3.6.1.4.1.2011.5.25.145.5.5", "hwMasterNHIP": "1.3.6.1.4.1.2011.5.25.145.5.6", "hwBackupIfType": "1.3.6.1.4.1.2011.5.25.145.5.7", "hwBackupName": "1.3.6.1.4.1.2011.5.25.145.5.8", "hwBackupNHIP": "1.3.6.1.4.1.2011.5.25.145.5.9", "hwFrrType": "1.3.6.1.4.1.2011.5.25.145.5.11"]
]

// --- hwStaticFrrSwitchClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.145.6.8
// Fields: hwStaticVpnName, hwMasterIfType, hwMasterName, hwMasterNHIP, hwBackupIfType, hwBackupName, hwBackupNHIP, hwFrrType
// Description: FRR switched alarm end.
trapMap["1.3.6.1.4.1.2011.5.25.145.6.8"] = [
    name: "hwStaticFrrSwitchClear",
    fields: ["hwStaticVpnName", "hwMasterIfType", "hwMasterName", "hwMasterNHIP", "hwBackupIfType", "hwBackupName", "hwBackupNHIP", "hwFrrType"],
    fieldOids: ["hwStaticVpnName": "1.3.6.1.4.1.2011.5.25.145.5.3", "hwMasterIfType": "1.3.6.1.4.1.2011.5.25.145.5.4", "hwMasterName": "1.3.6.1.4.1.2011.5.25.145.5.5", "hwMasterNHIP": "1.3.6.1.4.1.2011.5.25.145.5.6", "hwBackupIfType": "1.3.6.1.4.1.2011.5.25.145.5.7", "hwBackupName": "1.3.6.1.4.1.2011.5.25.145.5.8", "hwBackupNHIP": "1.3.6.1.4.1.2011.5.25.145.5.9", "hwFrrType": "1.3.6.1.4.1.2011.5.25.145.5.11"]
]

// --- hwTunnelSubExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.145.6.9
// Fields: subscribeTunnelMaxCount
// Description: The hwTunnelSubExceed alarm is reported when the number of tunnel subscriptions reaches the limit.
trapMap["1.3.6.1.4.1.2011.5.25.145.6.9"] = [
    name: "hwTunnelSubExceed",
    fields: ["subscribeTunnelMaxCount"],
    fieldOids: ["subscribeTunnelMaxCount": "1.3.6.1.4.1.2011.5.25.145.5.12"]
]

// --- hwTunnelSubExceedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.145.6.10
// Fields: subscribeTunnelMaxCount
// Description: The hwTunnelSubExceedClear alarm is generated if the number of tunnel subscriptions is less than the limit.
trapMap["1.3.6.1.4.1.2011.5.25.145.6.10"] = [
    name: "hwTunnelSubExceedClear",
    fields: ["subscribeTunnelMaxCount"],
    fieldOids: ["subscribeTunnelMaxCount": "1.3.6.1.4.1.2011.5.25.145.5.12"]
]

// --- hwIpv4PrefixExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.145.10.1
// Fields: hwCurIpv4PrefixNum, hwIpv4PrefixLimitValue
// Description: The number of IPv4 route prefixes on the device exceeds the alarm threshold.
trapMap["1.3.6.1.4.1.2011.5.25.145.10.1"] = [
    name: "hwIpv4PrefixExceed",
    fields: ["hwCurIpv4PrefixNum", "hwIpv4PrefixLimitValue"],
    fieldOids: ["hwCurIpv4PrefixNum": "1.3.6.1.4.1.2011.5.25.145.8.1", "hwIpv4PrefixLimitValue": "1.3.6.1.4.1.2011.5.25.145.8.2"]
]

// --- hwIpv4PrefixExceedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.145.10.2
// Fields: hwCurIpv4PrefixNum, hwIpv4PrefixLimitValue
// Description: The number of IPv4 route prefixes on the device falls below the alarm threshold.
trapMap["1.3.6.1.4.1.2011.5.25.145.10.2"] = [
    name: "hwIpv4PrefixExceedClear",
    fields: ["hwCurIpv4PrefixNum", "hwIpv4PrefixLimitValue"],
    fieldOids: ["hwCurIpv4PrefixNum": "1.3.6.1.4.1.2011.5.25.145.8.1", "hwIpv4PrefixLimitValue": "1.3.6.1.4.1.2011.5.25.145.8.2"]
]

// --- hwIpv4PrefixThresholdExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.145.10.3
// Fields: hwCurIpv4PrefixNum, hwIpv4PrefixLimitValue, hwIpv4PrefixLowerLimitValue, hwIpv4PrefixUpperLimitValue
// Description: A trap is sent when the number of IPv4 prefixes exceeded the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.145.10.3"] = [
    name: "hwIpv4PrefixThresholdExceed",
    fields: ["hwCurIpv4PrefixNum", "hwIpv4PrefixLimitValue", "hwIpv4PrefixLowerLimitValue", "hwIpv4PrefixUpperLimitValue"],
    fieldOids: ["hwCurIpv4PrefixNum": "1.3.6.1.4.1.2011.5.25.145.8.1", "hwIpv4PrefixLimitValue": "1.3.6.1.4.1.2011.5.25.145.8.2", "hwIpv4PrefixLowerLimitValue": "1.3.6.1.4.1.2011.5.25.145.8.3", "hwIpv4PrefixUpperLimitValue": "1.3.6.1.4.1.2011.5.25.145.8.4"]
]

// --- hwIpv4PrefixThresholdExceedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.145.10.4
// Fields: hwCurIpv4PrefixNum, hwIpv4PrefixLimitValue, hwIpv4PrefixLowerLimitValue, hwIpv4PrefixUpperLimitValue
// Description: A trap is sent when the number of IPv4 prefixes falls below the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.145.10.4"] = [
    name: "hwIpv4PrefixThresholdExceedClear",
    fields: ["hwCurIpv4PrefixNum", "hwIpv4PrefixLimitValue", "hwIpv4PrefixLowerLimitValue", "hwIpv4PrefixUpperLimitValue"],
    fieldOids: ["hwCurIpv4PrefixNum": "1.3.6.1.4.1.2011.5.25.145.8.1", "hwIpv4PrefixLimitValue": "1.3.6.1.4.1.2011.5.25.145.8.2", "hwIpv4PrefixLowerLimitValue": "1.3.6.1.4.1.2011.5.25.145.8.3", "hwIpv4PrefixUpperLimitValue": "1.3.6.1.4.1.2011.5.25.145.8.4"]
]

// --- hwIpv6PrefixExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.145.11.1
// Fields: hwCurIpv6PrefixNum, hwIpv6PrefixLimitValue
// Description: The number of IPv6 route prefixes on the device exceeds the alarm threshold.
trapMap["1.3.6.1.4.1.2011.5.25.145.11.1"] = [
    name: "hwIpv6PrefixExceed",
    fields: ["hwCurIpv6PrefixNum", "hwIpv6PrefixLimitValue"],
    fieldOids: ["hwCurIpv6PrefixNum": "1.3.6.1.4.1.2011.5.25.145.9.1", "hwIpv6PrefixLimitValue": "1.3.6.1.4.1.2011.5.25.145.9.2"]
]

// --- hwIpv6PrefixExceedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.145.11.2
// Fields: hwCurIpv6PrefixNum, hwIpv6PrefixLimitValue
// Description: The number of IPv6 route prefixes on the device falls below the alarm threshold.
trapMap["1.3.6.1.4.1.2011.5.25.145.11.2"] = [
    name: "hwIpv6PrefixExceedClear",
    fields: ["hwCurIpv6PrefixNum", "hwIpv6PrefixLimitValue"],
    fieldOids: ["hwCurIpv6PrefixNum": "1.3.6.1.4.1.2011.5.25.145.9.1", "hwIpv6PrefixLimitValue": "1.3.6.1.4.1.2011.5.25.145.9.2"]
]

// --- hwIpv6PrefixThresholdExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.145.11.3
// Fields: hwCurIpv6PrefixNum, hwIpv6PrefixLimitValue, hwIpv6PrefixLowerLimitValue, hwIpv6PrefixUpperLimitValue
// Description: A trap is sent when the number of IPv6 prefixes exceeded the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.145.11.3"] = [
    name: "hwIpv6PrefixThresholdExceed",
    fields: ["hwCurIpv6PrefixNum", "hwIpv6PrefixLimitValue", "hwIpv6PrefixLowerLimitValue", "hwIpv6PrefixUpperLimitValue"],
    fieldOids: ["hwCurIpv6PrefixNum": "1.3.6.1.4.1.2011.5.25.145.9.1", "hwIpv6PrefixLimitValue": "1.3.6.1.4.1.2011.5.25.145.9.2", "hwIpv6PrefixLowerLimitValue": "1.3.6.1.4.1.2011.5.25.145.9.4", "hwIpv6PrefixUpperLimitValue": "1.3.6.1.4.1.2011.5.25.145.9.5"]
]

// --- hwIpv6PrefixThresholdExceedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.145.11.4
// Fields: hwCurIpv6PrefixNum, hwIpv6PrefixLimitValue, hwIpv6PrefixLowerLimitValue, hwIpv6PrefixUpperLimitValue
// Description: A trap is sent when the number of IPv6 prefixes falls below the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.145.11.4"] = [
    name: "hwIpv6PrefixThresholdExceedClear",
    fields: ["hwCurIpv6PrefixNum", "hwIpv6PrefixLimitValue", "hwIpv6PrefixLowerLimitValue", "hwIpv6PrefixUpperLimitValue"],
    fieldOids: ["hwCurIpv6PrefixNum": "1.3.6.1.4.1.2011.5.25.145.9.1", "hwIpv6PrefixLimitValue": "1.3.6.1.4.1.2011.5.25.145.9.2", "hwIpv6PrefixLowerLimitValue": "1.3.6.1.4.1.2011.5.25.145.9.4", "hwIpv6PrefixUpperLimitValue": "1.3.6.1.4.1.2011.5.25.145.9.5"]
]

// --- hwGresmTokenExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.145.15.1
// Fields: entPhysicalName, hwGresmTokenUsedNum, hwGresmTokenMaxValue
// Description: The token count reaches the upper limit.
trapMap["1.3.6.1.4.1.2011.5.25.145.15.1"] = [
    name: "hwGresmTokenExceed",
    fields: ["entPhysicalName", "hwGresmTokenUsedNum", "hwGresmTokenMaxValue"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwGresmTokenUsedNum": "1.3.6.1.4.1.2011.5.25.145.14.1.1.2", "hwGresmTokenMaxValue": "1.3.6.1.4.1.2011.5.25.145.14.1.1.3"]
]

// --- hwGresmTokenExceedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.145.15.2
// Fields: entPhysicalName, hwGresmTokenUsedNum, hwGresmTokenMaxValue
// Description: The token count falls from the upper limit.
trapMap["1.3.6.1.4.1.2011.5.25.145.15.2"] = [
    name: "hwGresmTokenExceedClear",
    fields: ["entPhysicalName", "hwGresmTokenUsedNum", "hwGresmTokenMaxValue"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwGresmTokenUsedNum": "1.3.6.1.4.1.2011.5.25.145.14.1.1.2", "hwGresmTokenMaxValue": "1.3.6.1.4.1.2011.5.25.145.14.1.1.3"]
]

// --- hwGresmTokenThresholdExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.145.15.3
// Fields: entPhysicalName, hwGresmTokenUsedNum, hwGresmTokenMaxValue
// Description: The token usage exceeds the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.145.15.3"] = [
    name: "hwGresmTokenThresholdExceed",
    fields: ["entPhysicalName", "hwGresmTokenUsedNum", "hwGresmTokenMaxValue"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwGresmTokenUsedNum": "1.3.6.1.4.1.2011.5.25.145.14.1.1.2", "hwGresmTokenMaxValue": "1.3.6.1.4.1.2011.5.25.145.14.1.1.3"]
]

// --- hwGresmTokenThresholdExceedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.145.15.4
// Fields: entPhysicalName, hwGresmTokenUsedNum, hwGresmTokenMaxValue
// Description: The token usage falls from the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.145.15.4"] = [
    name: "hwGresmTokenThresholdExceedClear",
    fields: ["entPhysicalName", "hwGresmTokenUsedNum", "hwGresmTokenMaxValue"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwGresmTokenUsedNum": "1.3.6.1.4.1.2011.5.25.145.14.1.1.2", "hwGresmTokenMaxValue": "1.3.6.1.4.1.2011.5.25.145.14.1.1.3"]
]

// --- hwPublicIpv4PrefixExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.145.19.1.1
// Fields: hwCurIpv4PrefixNum, hwIpv4PrefixLimitValue
// Description: This object indicates that the public IPv4 prefixes has exceeded the maximum value.
trapMap["1.3.6.1.4.1.2011.5.25.145.19.1.1"] = [
    name: "hwPublicIpv4PrefixExceed",
    fields: ["hwCurIpv4PrefixNum", "hwIpv4PrefixLimitValue"],
    fieldOids: ["hwCurIpv4PrefixNum": "1.3.6.1.4.1.2011.5.25.145.8.1", "hwIpv4PrefixLimitValue": "1.3.6.1.4.1.2011.5.25.145.8.2"]
]

// --- hwPublicIpv4PrefixExceedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.145.19.1.2
// Fields: hwCurIpv4PrefixNum, hwIpv4PrefixLimitValue
// Description: This object indicates that the public IPv4 prefixes have resumed from exceeding the maximum vlaue.
trapMap["1.3.6.1.4.1.2011.5.25.145.19.1.2"] = [
    name: "hwPublicIpv4PrefixExceedClear",
    fields: ["hwCurIpv4PrefixNum", "hwIpv4PrefixLimitValue"],
    fieldOids: ["hwCurIpv4PrefixNum": "1.3.6.1.4.1.2011.5.25.145.8.1", "hwIpv4PrefixLimitValue": "1.3.6.1.4.1.2011.5.25.145.8.2"]
]

// --- hwPublicIpv4PrefixThresholdExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.145.19.1.3
// Fields: hwCurIpv4PrefixNum, hwIpv4PrefixLimitValue
// Description: This object indicates that the public IPv4 prefixes has exceeded the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.145.19.1.3"] = [
    name: "hwPublicIpv4PrefixThresholdExceed",
    fields: ["hwCurIpv4PrefixNum", "hwIpv4PrefixLimitValue"],
    fieldOids: ["hwCurIpv4PrefixNum": "1.3.6.1.4.1.2011.5.25.145.8.1", "hwIpv4PrefixLimitValue": "1.3.6.1.4.1.2011.5.25.145.8.2"]
]

// --- hwPublicIpv4PrefixThresholdExceedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.145.19.1.4
// Fields: hwCurIpv4PrefixNum, hwIpv4PrefixLimitValue
// Description: This object indicates that the public IPv4 prefixes have resumed from exceeding the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.145.19.1.4"] = [
    name: "hwPublicIpv4PrefixThresholdExceedClear",
    fields: ["hwCurIpv4PrefixNum", "hwIpv4PrefixLimitValue"],
    fieldOids: ["hwCurIpv4PrefixNum": "1.3.6.1.4.1.2011.5.25.145.8.1", "hwIpv4PrefixLimitValue": "1.3.6.1.4.1.2011.5.25.145.8.2"]
]

// --- hwPublicIpv6PrefixExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.145.19.2.1
// Fields: hwCurIpv6PrefixNum, hwIpv6PrefixLimitValue
// Description: This object indicates that the public IPv6 prefixes has exceeded the maximum value.
trapMap["1.3.6.1.4.1.2011.5.25.145.19.2.1"] = [
    name: "hwPublicIpv6PrefixExceed",
    fields: ["hwCurIpv6PrefixNum", "hwIpv6PrefixLimitValue"],
    fieldOids: ["hwCurIpv6PrefixNum": "1.3.6.1.4.1.2011.5.25.145.9.1", "hwIpv6PrefixLimitValue": "1.3.6.1.4.1.2011.5.25.145.9.2"]
]

// --- hwPublicIpv6PrefixExceedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.145.19.2.2
// Fields: hwCurIpv6PrefixNum, hwIpv6PrefixLimitValue
// Description: This object indicates that the public IPv6 prefixes have resumed from exceeding the maximum vlaue.
trapMap["1.3.6.1.4.1.2011.5.25.145.19.2.2"] = [
    name: "hwPublicIpv6PrefixExceedClear",
    fields: ["hwCurIpv6PrefixNum", "hwIpv6PrefixLimitValue"],
    fieldOids: ["hwCurIpv6PrefixNum": "1.3.6.1.4.1.2011.5.25.145.9.1", "hwIpv6PrefixLimitValue": "1.3.6.1.4.1.2011.5.25.145.9.2"]
]

// --- hwPublicIpv6PrefixThresholdExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.145.19.2.3
// Fields: hwCurIpv6PrefixNum, hwIpv6PrefixLimitValue
// Description: This object indicates that the public IPv6 prefixes has exceeded the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.145.19.2.3"] = [
    name: "hwPublicIpv6PrefixThresholdExceed",
    fields: ["hwCurIpv6PrefixNum", "hwIpv6PrefixLimitValue"],
    fieldOids: ["hwCurIpv6PrefixNum": "1.3.6.1.4.1.2011.5.25.145.9.1", "hwIpv6PrefixLimitValue": "1.3.6.1.4.1.2011.5.25.145.9.2"]
]

// --- hwPublicIpv6PrefixThresholdExceedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.145.19.2.4
// Fields: hwCurIpv6PrefixNum, hwIpv6PrefixLimitValue
// Description: This object indicates that the public IPv6 prefixes have resumed from exceeding the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.145.19.2.4"] = [
    name: "hwPublicIpv6PrefixThresholdExceedClear",
    fields: ["hwCurIpv6PrefixNum", "hwIpv6PrefixLimitValue"],
    fieldOids: ["hwCurIpv6PrefixNum": "1.3.6.1.4.1.2011.5.25.145.9.1", "hwIpv6PrefixLimitValue": "1.3.6.1.4.1.2011.5.25.145.9.2"]
]

// --- hwL3vpnIpv6PrefixExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.145.19.3.1
// Fields: hwIpv6PrefixLimitVpnName, hwCurIpv6PrefixNum, hwIpv6PrefixLimitValue
// Description: This object indicates that the vpn instance IPv6 prefixes has exceeded the maximum vlaue.
trapMap["1.3.6.1.4.1.2011.5.25.145.19.3.1"] = [
    name: "hwL3vpnIpv6PrefixExceed",
    fields: ["hwIpv6PrefixLimitVpnName", "hwCurIpv6PrefixNum", "hwIpv6PrefixLimitValue"],
    fieldOids: ["hwIpv6PrefixLimitVpnName": "1.3.6.1.4.1.2011.5.25.145.9.3", "hwCurIpv6PrefixNum": "1.3.6.1.4.1.2011.5.25.145.9.1", "hwIpv6PrefixLimitValue": "1.3.6.1.4.1.2011.5.25.145.9.2"]
]

// --- hwL3vpnIpv6PrefixExceedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.145.19.3.2
// Fields: hwIpv6PrefixLimitVpnName, hwCurIpv6PrefixNum, hwIpv6PrefixLimitValue
// Description: This object indicates that the vpn instance IPv6 prefixes have resumed from exceeding the maximum value.
trapMap["1.3.6.1.4.1.2011.5.25.145.19.3.2"] = [
    name: "hwL3vpnIpv6PrefixExceedClear",
    fields: ["hwIpv6PrefixLimitVpnName", "hwCurIpv6PrefixNum", "hwIpv6PrefixLimitValue"],
    fieldOids: ["hwIpv6PrefixLimitVpnName": "1.3.6.1.4.1.2011.5.25.145.9.3", "hwCurIpv6PrefixNum": "1.3.6.1.4.1.2011.5.25.145.9.1", "hwIpv6PrefixLimitValue": "1.3.6.1.4.1.2011.5.25.145.9.2"]
]

// --- hwL3vpnIpv6PrefixThresholdExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.145.19.3.3
// Fields: hwIpv6PrefixLimitVpnName, hwCurIpv6PrefixNum, hwIpv6PrefixLimitValue
// Description: This object indicates that the vpn instance IPv6 prefixes has exceeded the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.145.19.3.3"] = [
    name: "hwL3vpnIpv6PrefixThresholdExceed",
    fields: ["hwIpv6PrefixLimitVpnName", "hwCurIpv6PrefixNum", "hwIpv6PrefixLimitValue"],
    fieldOids: ["hwIpv6PrefixLimitVpnName": "1.3.6.1.4.1.2011.5.25.145.9.3", "hwCurIpv6PrefixNum": "1.3.6.1.4.1.2011.5.25.145.9.1", "hwIpv6PrefixLimitValue": "1.3.6.1.4.1.2011.5.25.145.9.2"]
]

// --- hwEvpnMacExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.145.22.1
// Fields: hwMacLimitEvpnName, hwCurMacNum, hwEvpnMacLimitValue
// Description: This object indicates that the number of MAC addresses of the EVPN instance has exceeded the maximum value.
trapMap["1.3.6.1.4.1.2011.5.25.145.22.1"] = [
    name: "hwEvpnMacExceed",
    fields: ["hwMacLimitEvpnName", "hwCurMacNum", "hwEvpnMacLimitValue"],
    fieldOids: ["hwMacLimitEvpnName": "1.3.6.1.4.1.2011.5.25.145.21.1", "hwCurMacNum": "1.3.6.1.4.1.2011.5.25.145.21.2", "hwEvpnMacLimitValue": "1.3.6.1.4.1.2011.5.25.145.21.5"]
]

// --- hwEvpnMacExceedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.145.22.2
// Fields: hwMacLimitEvpnName, hwCurMacNum, hwEvpnMacLimitValue
// Description: This object indicates that the number of MAC addresses of the EVPN instance has resumed from exceeding the maximum value.
trapMap["1.3.6.1.4.1.2011.5.25.145.22.2"] = [
    name: "hwEvpnMacExceedClear",
    fields: ["hwMacLimitEvpnName", "hwCurMacNum", "hwEvpnMacLimitValue"],
    fieldOids: ["hwMacLimitEvpnName": "1.3.6.1.4.1.2011.5.25.145.21.1", "hwCurMacNum": "1.3.6.1.4.1.2011.5.25.145.21.2", "hwEvpnMacLimitValue": "1.3.6.1.4.1.2011.5.25.145.21.5"]
]

// --- hwEvpnMacThresholdExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.145.22.3
// Fields: hwMacLimitEvpnName, hwCurMacNum, hwEvpnMacLimitValue
// Description: This object indicates that the number of MAC addresses of the EVPN instance has exceeded the threshold value.
trapMap["1.3.6.1.4.1.2011.5.25.145.22.3"] = [
    name: "hwEvpnMacThresholdExceed",
    fields: ["hwMacLimitEvpnName", "hwCurMacNum", "hwEvpnMacLimitValue"],
    fieldOids: ["hwMacLimitEvpnName": "1.3.6.1.4.1.2011.5.25.145.21.1", "hwCurMacNum": "1.3.6.1.4.1.2011.5.25.145.21.2", "hwEvpnMacLimitValue": "1.3.6.1.4.1.2011.5.25.145.21.5"]
]

// --- hwEvpnMacThresholdExceedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.145.22.4
// Fields: hwMacLimitEvpnName, hwCurMacNum, hwEvpnMacLimitValue
// Description: This object indicates that the number of MAC addresses of the EVPN instance has resumed from exceeding the threshold value.
trapMap["1.3.6.1.4.1.2011.5.25.145.22.4"] = [
    name: "hwEvpnMacThresholdExceedClear",
    fields: ["hwMacLimitEvpnName", "hwCurMacNum", "hwEvpnMacLimitValue"],
    fieldOids: ["hwMacLimitEvpnName": "1.3.6.1.4.1.2011.5.25.145.21.1", "hwCurMacNum": "1.3.6.1.4.1.2011.5.25.145.21.2", "hwEvpnMacLimitValue": "1.3.6.1.4.1.2011.5.25.145.21.5"]
]

// --- hwNhmRestrain (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.145.25.1
// Fields: hwNhmRestrainType, hwNhmRestrainKey, hwNhmRestrainVpnName, hwNhmRestrainNextHop
// Description: This object indicates that cyclic iteration is suppressed.
trapMap["1.3.6.1.4.1.2011.5.25.145.25.1"] = [
    name: "hwNhmRestrain",
    fields: ["hwNhmRestrainType", "hwNhmRestrainKey", "hwNhmRestrainVpnName", "hwNhmRestrainNextHop"],
    fieldOids: ["hwNhmRestrainType": "1.3.6.1.4.1.2011.5.25.145.24.1", "hwNhmRestrainKey": "1.3.6.1.4.1.2011.5.25.145.24.2", "hwNhmRestrainVpnName": "1.3.6.1.4.1.2011.5.25.145.24.3", "hwNhmRestrainNextHop": "1.3.6.1.4.1.2011.5.25.145.24.4"]
]

// --- hwNhmRestrainClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.145.25.2
// Fields: hwNhmRestrainType, hwNhmRestrainKey
// Description: This object indicates that cyclic iteration suppression is removed.
trapMap["1.3.6.1.4.1.2011.5.25.145.25.2"] = [
    name: "hwNhmRestrainClear",
    fields: ["hwNhmRestrainType", "hwNhmRestrainKey"],
    fieldOids: ["hwNhmRestrainType": "1.3.6.1.4.1.2011.5.25.145.24.1", "hwNhmRestrainKey": "1.3.6.1.4.1.2011.5.25.145.24.2"]
]

// --- hwVlinkImportExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.145.28.1
// Fields: hwVlinkImportCurNumber, hwVlinkImportMaxNumber
// Description: This object indicates that the number of import vlink items exceeded the maximum number.
trapMap["1.3.6.1.4.1.2011.5.25.145.28.1"] = [
    name: "hwVlinkImportExceed",
    fields: ["hwVlinkImportCurNumber", "hwVlinkImportMaxNumber"],
    fieldOids: ["hwVlinkImportCurNumber": "1.3.6.1.4.1.2011.5.25.145.27.1", "hwVlinkImportMaxNumber": "1.3.6.1.4.1.2011.5.25.145.27.2"]
]

// --- hwIpv4RouteExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.145.33.1
// Fields: hwIpv4RouteLimitVpnName, hwCurIpv4RouteNum, hwIpv4RouteLimitValue
// Description: The number of IPv4 routes on the device exceeds the alarm threshold.
trapMap["1.3.6.1.4.1.2011.5.25.145.33.1"] = [
    name: "hwIpv4RouteExceed",
    fields: ["hwIpv4RouteLimitVpnName", "hwCurIpv4RouteNum", "hwIpv4RouteLimitValue"],
    fieldOids: ["hwIpv4RouteLimitVpnName": "1.3.6.1.4.1.2011.5.25.145.31.3", "hwCurIpv4RouteNum": "1.3.6.1.4.1.2011.5.25.145.31.1", "hwIpv4RouteLimitValue": "1.3.6.1.4.1.2011.5.25.145.31.2"]
]

// --- hwIpv4RouteExceedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.145.33.2
// Fields: hwIpv4RouteLimitVpnName, hwCurIpv4RouteNum, hwIpv4RouteLimitValue
// Description: The number of IPv4 routes on the device falls below the alarm threshold.
trapMap["1.3.6.1.4.1.2011.5.25.145.33.2"] = [
    name: "hwIpv4RouteExceedClear",
    fields: ["hwIpv4RouteLimitVpnName", "hwCurIpv4RouteNum", "hwIpv4RouteLimitValue"],
    fieldOids: ["hwIpv4RouteLimitVpnName": "1.3.6.1.4.1.2011.5.25.145.31.3", "hwCurIpv4RouteNum": "1.3.6.1.4.1.2011.5.25.145.31.1", "hwIpv4RouteLimitValue": "1.3.6.1.4.1.2011.5.25.145.31.2"]
]

// --- hwIpv4RouteThresholdExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.145.33.3
// Fields: hwIpv4RouteLimitVpnName, hwCurIpv4RouteNum, hwIpv4RouteLimitValue
// Description: The number of IPv4 routes exceeded the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.145.33.3"] = [
    name: "hwIpv4RouteThresholdExceed",
    fields: ["hwIpv4RouteLimitVpnName", "hwCurIpv4RouteNum", "hwIpv4RouteLimitValue"],
    fieldOids: ["hwIpv4RouteLimitVpnName": "1.3.6.1.4.1.2011.5.25.145.31.3", "hwCurIpv4RouteNum": "1.3.6.1.4.1.2011.5.25.145.31.1", "hwIpv4RouteLimitValue": "1.3.6.1.4.1.2011.5.25.145.31.2"]
]

// --- hwIpv4RouteThresholdExceedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.145.33.4
// Fields: hwIpv4RouteLimitVpnName, hwCurIpv4RouteNum, hwIpv4RouteLimitValue
// Description: The number of IPv4 routes falls below the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.145.33.4"] = [
    name: "hwIpv4RouteThresholdExceedClear",
    fields: ["hwIpv4RouteLimitVpnName", "hwCurIpv4RouteNum", "hwIpv4RouteLimitValue"],
    fieldOids: ["hwIpv4RouteLimitVpnName": "1.3.6.1.4.1.2011.5.25.145.31.3", "hwCurIpv4RouteNum": "1.3.6.1.4.1.2011.5.25.145.31.1", "hwIpv4RouteLimitValue": "1.3.6.1.4.1.2011.5.25.145.31.2"]
]

// --- hwIpv6RouteExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.145.34.1
// Fields: hwIpv6RouteLimitVpnName, hwCurIpv6RouteNum, hwIpv6RouteLimitValue
// Description: The number of IPv6 routes on the device exceeds the alarm threshold.
trapMap["1.3.6.1.4.1.2011.5.25.145.34.1"] = [
    name: "hwIpv6RouteExceed",
    fields: ["hwIpv6RouteLimitVpnName", "hwCurIpv6RouteNum", "hwIpv6RouteLimitValue"],
    fieldOids: ["hwIpv6RouteLimitVpnName": "1.3.6.1.4.1.2011.5.25.145.32.3", "hwCurIpv6RouteNum": "1.3.6.1.4.1.2011.5.25.145.32.1", "hwIpv6RouteLimitValue": "1.3.6.1.4.1.2011.5.25.145.32.2"]
]

// --- hwIpv6RouteExceedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.145.34.2
// Fields: hwIpv6RouteLimitVpnName, hwCurIpv6RouteNum, hwIpv6RouteLimitValue
// Description: The number of IPv6 routes on the device falls below the alarm threshold.
trapMap["1.3.6.1.4.1.2011.5.25.145.34.2"] = [
    name: "hwIpv6RouteExceedClear",
    fields: ["hwIpv6RouteLimitVpnName", "hwCurIpv6RouteNum", "hwIpv6RouteLimitValue"],
    fieldOids: ["hwIpv6RouteLimitVpnName": "1.3.6.1.4.1.2011.5.25.145.32.3", "hwCurIpv6RouteNum": "1.3.6.1.4.1.2011.5.25.145.32.1", "hwIpv6RouteLimitValue": "1.3.6.1.4.1.2011.5.25.145.32.2"]
]

// --- hwIpv6RouteThresholdExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.145.34.3
// Fields: hwIpv6RouteLimitVpnName, hwCurIpv6RouteNum, hwIpv6RouteLimitValue
// Description: The number of IPv6 routes exceeded the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.145.34.3"] = [
    name: "hwIpv6RouteThresholdExceed",
    fields: ["hwIpv6RouteLimitVpnName", "hwCurIpv6RouteNum", "hwIpv6RouteLimitValue"],
    fieldOids: ["hwIpv6RouteLimitVpnName": "1.3.6.1.4.1.2011.5.25.145.32.3", "hwCurIpv6RouteNum": "1.3.6.1.4.1.2011.5.25.145.32.1", "hwIpv6RouteLimitValue": "1.3.6.1.4.1.2011.5.25.145.32.2"]
]

// --- hwIpv6RouteThresholdExceedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.145.34.4
// Fields: hwIpv6RouteLimitVpnName, hwCurIpv6RouteNum, hwIpv6RouteLimitValue
// Description: The number of IPv6 routes falls below the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.145.34.4"] = [
    name: "hwIpv6RouteThresholdExceedClear",
    fields: ["hwIpv6RouteLimitVpnName", "hwCurIpv6RouteNum", "hwIpv6RouteLimitValue"],
    fieldOids: ["hwIpv6RouteLimitVpnName": "1.3.6.1.4.1.2011.5.25.145.32.3", "hwCurIpv6RouteNum": "1.3.6.1.4.1.2011.5.25.145.32.1", "hwIpv6RouteLimitValue": "1.3.6.1.4.1.2011.5.25.145.32.2"]
]

// --- hwNhmCyclicIterateRestrain (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.145.37.1
// Fields: hwNhmCyclicIterateRestrainType, hwNhmCyclicIterateRestrainVpnName, hwNhmCyclicIterateRestrainNextHop, hwNhmCyclicIterateRestrainProtocolType
// Description: This object indicates that cyclic iteration is suppressed.
trapMap["1.3.6.1.4.1.2011.5.25.145.37.1"] = [
    name: "hwNhmCyclicIterateRestrain",
    fields: ["hwNhmCyclicIterateRestrainType", "hwNhmCyclicIterateRestrainVpnName", "hwNhmCyclicIterateRestrainNextHop", "hwNhmCyclicIterateRestrainProtocolType"],
    fieldOids: ["hwNhmCyclicIterateRestrainType": "1.3.6.1.4.1.2011.5.25.145.36.1", "hwNhmCyclicIterateRestrainVpnName": "1.3.6.1.4.1.2011.5.25.145.36.3", "hwNhmCyclicIterateRestrainNextHop": "1.3.6.1.4.1.2011.5.25.145.36.4", "hwNhmCyclicIterateRestrainProtocolType": "1.3.6.1.4.1.2011.5.25.145.36.2"]
]

// --- hwNhmCyclicIterateRestrainClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.145.37.2
// Fields: hwNhmCyclicIterateRestrainType, hwNhmCyclicIterateRestrainVpnName, hwNhmCyclicIterateRestrainNextHop, hwNhmCyclicIterateRestrainProtocolType
// Description: This object indicates that cyclic iteration suppression is removed.
trapMap["1.3.6.1.4.1.2011.5.25.145.37.2"] = [
    name: "hwNhmCyclicIterateRestrainClear",
    fields: ["hwNhmCyclicIterateRestrainType", "hwNhmCyclicIterateRestrainVpnName", "hwNhmCyclicIterateRestrainNextHop", "hwNhmCyclicIterateRestrainProtocolType"],
    fieldOids: ["hwNhmCyclicIterateRestrainType": "1.3.6.1.4.1.2011.5.25.145.36.1", "hwNhmCyclicIterateRestrainVpnName": "1.3.6.1.4.1.2011.5.25.145.36.3", "hwNhmCyclicIterateRestrainNextHop": "1.3.6.1.4.1.2011.5.25.145.36.4", "hwNhmCyclicIterateRestrainProtocolType": "1.3.6.1.4.1.2011.5.25.145.36.2"]
]

// --- hwVstmMacExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.145.40.1
// Fields: hwVstmCurMacNum, hwVstmMaxMacNum
// Description: This object indicates that the number of MAC routes on the device has exceeded the maximum value.
trapMap["1.3.6.1.4.1.2011.5.25.145.40.1"] = [
    name: "hwVstmMacExceed",
    fields: ["hwVstmCurMacNum", "hwVstmMaxMacNum"],
    fieldOids: ["hwVstmCurMacNum": "1.3.6.1.4.1.2011.5.25.145.39.1", "hwVstmMaxMacNum": "1.3.6.1.4.1.2011.5.25.145.39.2"]
]

// --- hwVstmMacExceedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.145.40.2
// Fields: hwVstmCurMacNum, hwVstmMaxMacNum
// Description: This object indicates that the number of MAC routes on the device has resumed from exceeding the maximum value.
trapMap["1.3.6.1.4.1.2011.5.25.145.40.2"] = [
    name: "hwVstmMacExceedClear",
    fields: ["hwVstmCurMacNum", "hwVstmMaxMacNum"],
    fieldOids: ["hwVstmCurMacNum": "1.3.6.1.4.1.2011.5.25.145.39.1", "hwVstmMaxMacNum": "1.3.6.1.4.1.2011.5.25.145.39.2"]
]

// --- hwEvpnStickyMacConflict (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.145.43.1
// Fields: hwEVPNInstanceName, hwBdId
// Description: This object indicates the name of the EVPN instance with sticky MAC addresses conflicting.
trapMap["1.3.6.1.4.1.2011.5.25.145.43.1"] = [
    name: "hwEvpnStickyMacConflict",
    fields: ["hwEVPNInstanceName", "hwBdId"],
    fieldOids: ["hwEVPNInstanceName": "1.3.6.1.4.1.2011.5.25.145.42.1", "hwBdId": "1.3.6.1.4.1.2011.5.25.145.42.2"]
]

// --- hwEvpnStickyMacConflictClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.145.43.2
// Fields: hwEVPNInstanceName, hwBdId
// Description: This object indicates the name of the EVPN instance which sticky MAC addresses conflicting has been resumed.
trapMap["1.3.6.1.4.1.2011.5.25.145.43.2"] = [
    name: "hwEvpnStickyMacConflictClear",
    fields: ["hwEVPNInstanceName", "hwBdId"],
    fieldOids: ["hwEVPNInstanceName": "1.3.6.1.4.1.2011.5.25.145.42.1", "hwBdId": "1.3.6.1.4.1.2011.5.25.145.42.2"]
]

// ===== Parsing logic =====

// Set to true to enable diagnostic logging for this MIB parser
DEBUG = false

LOG_PREFIX = "[HUAWEI-RM-EXT-MIB]"
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
