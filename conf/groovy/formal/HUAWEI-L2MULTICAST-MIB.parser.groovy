/**
 * Auto-generated from HUAWEI-L2MULTICAST-MIB.mib
 * Generated: 2026-08-24T18:28:30.154490700
 * Traps/Notifications (22): hwL2mcPortOtherQuerierTimeout, hwL2mcReportListeningGrpExceed, hwL2mcReportListeningThresholdExceed, hwL2mcReportListeningThresholdResume, hwL2mcGlobalEntryThresholdExceed, hwL2mcGlobalEntryThresholdResume, hwL2mcUserPerEntryThresholdExceed, hwL2mcUserPerEntryThresholdResume, hwL2mcGlobalEntryExceed, hwL2mcUserPerEntryExceed, hwL2mcVlanEntryReachLimit, hwL2mcVlanEntryResume, hwL2mcInterfaceEntryReachLimit, hwL2mcInterfaceEntryResume, hwL2mcInterfaceVlanEntryReachLimit, hwL2mcInterfaceVlanEntryResume, hwL2mcBoardGMPEntryLimit, hwL2mcBoardGMPEntryLimitClear, hwL2mcGlobalEntryReachLimit, hwL2mcGlobalEntryReachLimitResume, hwL2mcSpmsiReachLimit, hwL2mcSpmsiReachLimitResume
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

// --- hwL2mcPortOtherQuerierTimeout (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.181.1.34.1
// Fields: hwL2mcNotificationsPortVlanIndex, hwL2mcNotificationsPortVsiName, hwL2mcNotificationsPortType, hwL2mcNotificationsPortIfIndex, hwL2mcNotificationsPortPeId, hwL2mcNotificationsPortCeId, hwL2mcNotificationsPortPeerAddress, hwL2mcNotificationsPortVcOrSiteId, hwL2mcNotificationsPortIfName
// Description: A hwL2mcPortOtherQuerierTimeout notification signifies the timer of other querier of port is timeout. This notification should be generated when the other querier timer expires, and the router has no ...
trapMap["1.3.6.1.4.1.2011.5.25.181.1.34.1"] = [
    name: "hwL2mcPortOtherQuerierTimeout",
    fields: ["hwL2mcNotificationsPortVlanIndex", "hwL2mcNotificationsPortVsiName", "hwL2mcNotificationsPortType", "hwL2mcNotificationsPortIfIndex", "hwL2mcNotificationsPortPeId", "hwL2mcNotificationsPortCeId", "hwL2mcNotificationsPortPeerAddress", "hwL2mcNotificationsPortVcOrSiteId", "hwL2mcNotificationsPortIfName"],
    fieldOids: ["hwL2mcNotificationsPortVlanIndex": "1.3.6.1.4.1.2011.5.25.181.1.33.1", "hwL2mcNotificationsPortVsiName": "1.3.6.1.4.1.2011.5.25.181.1.33.2", "hwL2mcNotificationsPortType": "1.3.6.1.4.1.2011.5.25.181.1.33.3", "hwL2mcNotificationsPortIfIndex": "1.3.6.1.4.1.2011.5.25.181.1.33.4", "hwL2mcNotificationsPortPeId": "1.3.6.1.4.1.2011.5.25.181.1.33.5", "hwL2mcNotificationsPortCeId": "1.3.6.1.4.1.2011.5.25.181.1.33.6", "hwL2mcNotificationsPortPeerAddress": "1.3.6.1.4.1.2011.5.25.181.1.33.7", "hwL2mcNotificationsPortVcOrSiteId": "1.3.6.1.4.1.2011.5.25.181.1.33.8", "hwL2mcNotificationsPortIfName": "1.3.6.1.4.1.2011.5.25.181.1.33.9"]
]

// --- hwL2mcReportListeningGrpExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.181.1.34.2
// Fields: hwL2mcNotificationsAddressType, hwL2mcNotificationsPortIfIndex, hwL2mcNotificationsPortIfName, hwL2mcNotificationsExceedLimit, hwL2mcNotificationsExceedGroupAddress, hwL2mcNotificationsExceedSourceAddress, hwL2mcNotificationsPortVsiName, hwL2mcNotificationsPortPeId, hwL2mcNotificationsPortCeId, hwL2mcNotificationsPortUserMac
// Description: The hwL2mcReportListeningGrpExceed notification indicates that the number of multicast groups has exceeded the limit of a board. This notification is generated when the number of multicast groups exce...
trapMap["1.3.6.1.4.1.2011.5.25.181.1.34.2"] = [
    name: "hwL2mcReportListeningGrpExceed",
    fields: ["hwL2mcNotificationsAddressType", "hwL2mcNotificationsPortIfIndex", "hwL2mcNotificationsPortIfName", "hwL2mcNotificationsExceedLimit", "hwL2mcNotificationsExceedGroupAddress", "hwL2mcNotificationsExceedSourceAddress", "hwL2mcNotificationsPortVsiName", "hwL2mcNotificationsPortPeId", "hwL2mcNotificationsPortCeId", "hwL2mcNotificationsPortUserMac"],
    fieldOids: ["hwL2mcNotificationsAddressType": "1.3.6.1.4.1.2011.5.25.181.1.33.10", "hwL2mcNotificationsPortIfIndex": "1.3.6.1.4.1.2011.5.25.181.1.33.4", "hwL2mcNotificationsPortIfName": "1.3.6.1.4.1.2011.5.25.181.1.33.9", "hwL2mcNotificationsExceedLimit": "1.3.6.1.4.1.2011.5.25.181.1.33.11", "hwL2mcNotificationsExceedGroupAddress": "1.3.6.1.4.1.2011.5.25.181.1.33.12", "hwL2mcNotificationsExceedSourceAddress": "1.3.6.1.4.1.2011.5.25.181.1.33.13", "hwL2mcNotificationsPortVsiName": "1.3.6.1.4.1.2011.5.25.181.1.33.2", "hwL2mcNotificationsPortPeId": "1.3.6.1.4.1.2011.5.25.181.1.33.5", "hwL2mcNotificationsPortCeId": "1.3.6.1.4.1.2011.5.25.181.1.33.6", "hwL2mcNotificationsPortUserMac": "1.3.6.1.4.1.2011.5.25.181.1.33.14"]
]

// --- hwL2mcReportListeningThresholdExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.181.1.34.3
// Fields: hwL2mcNotificationsAddressType, hwL2mcNotificationsSlot, hwL2mcNotificationsExceedCurrent, hwL2mcNotificationsExceedLimit, hwL2mcNotificationsExceedThreshold
// Description: The hwL2mcReportListeningThresholdExceed notification indicates that the number of multicast groups has exceeded the threshold of a board. This notification is generated when the number of multicast g...
trapMap["1.3.6.1.4.1.2011.5.25.181.1.34.3"] = [
    name: "hwL2mcReportListeningThresholdExceed",
    fields: ["hwL2mcNotificationsAddressType", "hwL2mcNotificationsSlot", "hwL2mcNotificationsExceedCurrent", "hwL2mcNotificationsExceedLimit", "hwL2mcNotificationsExceedThreshold"],
    fieldOids: ["hwL2mcNotificationsAddressType": "1.3.6.1.4.1.2011.5.25.181.1.33.10", "hwL2mcNotificationsSlot": "1.3.6.1.4.1.2011.5.25.181.1.33.15", "hwL2mcNotificationsExceedCurrent": "1.3.6.1.4.1.2011.5.25.181.1.33.16", "hwL2mcNotificationsExceedLimit": "1.3.6.1.4.1.2011.5.25.181.1.33.11", "hwL2mcNotificationsExceedThreshold": "1.3.6.1.4.1.2011.5.25.181.1.33.17"]
]

// --- hwL2mcReportListeningThresholdResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.181.1.34.4
// Fields: hwL2mcNotificationsAddressType, hwL2mcNotificationsSlot, hwL2mcNotificationsExceedCurrent, hwL2mcNotificationsExceedLimit, hwL2mcNotificationsExceedThreshold, hwL2mcNotificationReason
// Description: The hwL2mcReportListeningThresholdResume notification indicates that the number of multicast groups has fell blew the threshold of a board. This notification is generated when the number of multicast ...
trapMap["1.3.6.1.4.1.2011.5.25.181.1.34.4"] = [
    name: "hwL2mcReportListeningThresholdResume",
    fields: ["hwL2mcNotificationsAddressType", "hwL2mcNotificationsSlot", "hwL2mcNotificationsExceedCurrent", "hwL2mcNotificationsExceedLimit", "hwL2mcNotificationsExceedThreshold", "hwL2mcNotificationReason"],
    fieldOids: ["hwL2mcNotificationsAddressType": "1.3.6.1.4.1.2011.5.25.181.1.33.10", "hwL2mcNotificationsSlot": "1.3.6.1.4.1.2011.5.25.181.1.33.15", "hwL2mcNotificationsExceedCurrent": "1.3.6.1.4.1.2011.5.25.181.1.33.16", "hwL2mcNotificationsExceedLimit": "1.3.6.1.4.1.2011.5.25.181.1.33.11", "hwL2mcNotificationsExceedThreshold": "1.3.6.1.4.1.2011.5.25.181.1.33.17", "hwL2mcNotificationReason": "1.3.6.1.4.1.2011.5.25.181.1.33.18"]
]

// --- hwL2mcGlobalEntryThresholdExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.181.1.34.5
// Fields: hwL2mcNotificationsAddressType, hwL2mcNotificationsExceedType, hwL2mcNotificationsExceedCurrent, hwL2mcNotificationsExceedLimit, hwL2mcNotificationsExceedThreshold
// Description: An hwL2mcGlobalEntryThresholdExceed notification indicates that the number of multicast groups in a certain instance or all instances reaches the upper threshold.
trapMap["1.3.6.1.4.1.2011.5.25.181.1.34.5"] = [
    name: "hwL2mcGlobalEntryThresholdExceed",
    fields: ["hwL2mcNotificationsAddressType", "hwL2mcNotificationsExceedType", "hwL2mcNotificationsExceedCurrent", "hwL2mcNotificationsExceedLimit", "hwL2mcNotificationsExceedThreshold"],
    fieldOids: ["hwL2mcNotificationsAddressType": "1.3.6.1.4.1.2011.5.25.181.1.33.10", "hwL2mcNotificationsExceedType": "1.3.6.1.4.1.2011.5.25.181.1.33.19", "hwL2mcNotificationsExceedCurrent": "1.3.6.1.4.1.2011.5.25.181.1.33.16", "hwL2mcNotificationsExceedLimit": "1.3.6.1.4.1.2011.5.25.181.1.33.11", "hwL2mcNotificationsExceedThreshold": "1.3.6.1.4.1.2011.5.25.181.1.33.17"]
]

// --- hwL2mcGlobalEntryThresholdResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.181.1.34.6
// Fields: hwL2mcNotificationsAddressType, hwL2mcNotificationsExceedType, hwL2mcNotificationsExceedCurrent, hwL2mcNotificationsExceedLimit, hwL2mcNotificationsExceedThreshold, hwL2mcNotificationReason
// Description: An hwL2mcGlobalEntryThresholdResume notification indicates that the number of multicast groups in a certain instance or all instances groups fell below the lower limit threshold.
trapMap["1.3.6.1.4.1.2011.5.25.181.1.34.6"] = [
    name: "hwL2mcGlobalEntryThresholdResume",
    fields: ["hwL2mcNotificationsAddressType", "hwL2mcNotificationsExceedType", "hwL2mcNotificationsExceedCurrent", "hwL2mcNotificationsExceedLimit", "hwL2mcNotificationsExceedThreshold", "hwL2mcNotificationReason"],
    fieldOids: ["hwL2mcNotificationsAddressType": "1.3.6.1.4.1.2011.5.25.181.1.33.10", "hwL2mcNotificationsExceedType": "1.3.6.1.4.1.2011.5.25.181.1.33.19", "hwL2mcNotificationsExceedCurrent": "1.3.6.1.4.1.2011.5.25.181.1.33.16", "hwL2mcNotificationsExceedLimit": "1.3.6.1.4.1.2011.5.25.181.1.33.11", "hwL2mcNotificationsExceedThreshold": "1.3.6.1.4.1.2011.5.25.181.1.33.17", "hwL2mcNotificationReason": "1.3.6.1.4.1.2011.5.25.181.1.33.18"]
]

// --- hwL2mcUserPerEntryThresholdExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.181.1.34.7
// Fields: hwL2mcNotificationsAddressType, hwL2mcNotificationsSlot, hwL2mcNotificationsPortVsiName, hwL2mcNotificationsExceedGroupAddress, hwL2mcNotificationsExceedSourceAddress, hwL2mcNotificationsExceedCurrent, hwL2mcNotificationsExceedLimit, hwL2mcNotificationsExceedThreshold
// Description: A hwL2mcUserPerEntryThresholdExceed notification signifies that the number of multicast users in one group reached the limit threshold.
trapMap["1.3.6.1.4.1.2011.5.25.181.1.34.7"] = [
    name: "hwL2mcUserPerEntryThresholdExceed",
    fields: ["hwL2mcNotificationsAddressType", "hwL2mcNotificationsSlot", "hwL2mcNotificationsPortVsiName", "hwL2mcNotificationsExceedGroupAddress", "hwL2mcNotificationsExceedSourceAddress", "hwL2mcNotificationsExceedCurrent", "hwL2mcNotificationsExceedLimit", "hwL2mcNotificationsExceedThreshold"],
    fieldOids: ["hwL2mcNotificationsAddressType": "1.3.6.1.4.1.2011.5.25.181.1.33.10", "hwL2mcNotificationsSlot": "1.3.6.1.4.1.2011.5.25.181.1.33.15", "hwL2mcNotificationsPortVsiName": "1.3.6.1.4.1.2011.5.25.181.1.33.2", "hwL2mcNotificationsExceedGroupAddress": "1.3.6.1.4.1.2011.5.25.181.1.33.12", "hwL2mcNotificationsExceedSourceAddress": "1.3.6.1.4.1.2011.5.25.181.1.33.13", "hwL2mcNotificationsExceedCurrent": "1.3.6.1.4.1.2011.5.25.181.1.33.16", "hwL2mcNotificationsExceedLimit": "1.3.6.1.4.1.2011.5.25.181.1.33.11", "hwL2mcNotificationsExceedThreshold": "1.3.6.1.4.1.2011.5.25.181.1.33.17"]
]

// --- hwL2mcUserPerEntryThresholdResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.181.1.34.8
// Fields: hwL2mcNotificationsAddressType, hwL2mcNotificationsSlot, hwL2mcNotificationsPortVsiName, hwL2mcNotificationsExceedGroupAddress, hwL2mcNotificationsExceedSourceAddress, hwL2mcNotificationsExceedCurrent, hwL2mcNotificationsExceedLimit, hwL2mcNotificationsExceedThreshold, hwL2mcNotificationReason
// Description: A hwL2mcUserPerEntryThresholdResume notification signifies that the number of multicast users in one group fell below the lower limit threshold.
trapMap["1.3.6.1.4.1.2011.5.25.181.1.34.8"] = [
    name: "hwL2mcUserPerEntryThresholdResume",
    fields: ["hwL2mcNotificationsAddressType", "hwL2mcNotificationsSlot", "hwL2mcNotificationsPortVsiName", "hwL2mcNotificationsExceedGroupAddress", "hwL2mcNotificationsExceedSourceAddress", "hwL2mcNotificationsExceedCurrent", "hwL2mcNotificationsExceedLimit", "hwL2mcNotificationsExceedThreshold", "hwL2mcNotificationReason"],
    fieldOids: ["hwL2mcNotificationsAddressType": "1.3.6.1.4.1.2011.5.25.181.1.33.10", "hwL2mcNotificationsSlot": "1.3.6.1.4.1.2011.5.25.181.1.33.15", "hwL2mcNotificationsPortVsiName": "1.3.6.1.4.1.2011.5.25.181.1.33.2", "hwL2mcNotificationsExceedGroupAddress": "1.3.6.1.4.1.2011.5.25.181.1.33.12", "hwL2mcNotificationsExceedSourceAddress": "1.3.6.1.4.1.2011.5.25.181.1.33.13", "hwL2mcNotificationsExceedCurrent": "1.3.6.1.4.1.2011.5.25.181.1.33.16", "hwL2mcNotificationsExceedLimit": "1.3.6.1.4.1.2011.5.25.181.1.33.11", "hwL2mcNotificationsExceedThreshold": "1.3.6.1.4.1.2011.5.25.181.1.33.17", "hwL2mcNotificationReason": "1.3.6.1.4.1.2011.5.25.181.1.33.18"]
]

// --- hwL2mcGlobalEntryExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.181.1.34.9
// Fields: hwL2mcNotificationsAddressType, hwL2mcNotificationsExceedType, hwL2mcNotificationsExceedLimit
// Description: A hwL2mcGlobalEntryExceed notification signifies the number of multicast groups has exceeded the global limit. This notification should be generated when the number of multicast groups has exceeded th...
trapMap["1.3.6.1.4.1.2011.5.25.181.1.34.9"] = [
    name: "hwL2mcGlobalEntryExceed",
    fields: ["hwL2mcNotificationsAddressType", "hwL2mcNotificationsExceedType", "hwL2mcNotificationsExceedLimit"],
    fieldOids: ["hwL2mcNotificationsAddressType": "1.3.6.1.4.1.2011.5.25.181.1.33.10", "hwL2mcNotificationsExceedType": "1.3.6.1.4.1.2011.5.25.181.1.33.19", "hwL2mcNotificationsExceedLimit": "1.3.6.1.4.1.2011.5.25.181.1.33.11"]
]

// --- hwL2mcUserPerEntryExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.181.1.34.10
// Fields: hwL2mcNotificationsAddressType, hwL2mcNotificationsSlot, hwL2mcNotificationsPortVsiName, hwL2mcNotificationsExceedGroupAddress, hwL2mcNotificationsExceedSourceAddress, hwL2mcNotificationsExceedCurrent, hwL2mcNotificationsExceedLimit
// Description: A hwL2mcUserPerEntryExceed notification signifies the number of multicast users in one group has exceeded the limit on the slot. This notification should be generated when the number of multicast user...
trapMap["1.3.6.1.4.1.2011.5.25.181.1.34.10"] = [
    name: "hwL2mcUserPerEntryExceed",
    fields: ["hwL2mcNotificationsAddressType", "hwL2mcNotificationsSlot", "hwL2mcNotificationsPortVsiName", "hwL2mcNotificationsExceedGroupAddress", "hwL2mcNotificationsExceedSourceAddress", "hwL2mcNotificationsExceedCurrent", "hwL2mcNotificationsExceedLimit"],
    fieldOids: ["hwL2mcNotificationsAddressType": "1.3.6.1.4.1.2011.5.25.181.1.33.10", "hwL2mcNotificationsSlot": "1.3.6.1.4.1.2011.5.25.181.1.33.15", "hwL2mcNotificationsPortVsiName": "1.3.6.1.4.1.2011.5.25.181.1.33.2", "hwL2mcNotificationsExceedGroupAddress": "1.3.6.1.4.1.2011.5.25.181.1.33.12", "hwL2mcNotificationsExceedSourceAddress": "1.3.6.1.4.1.2011.5.25.181.1.33.13", "hwL2mcNotificationsExceedCurrent": "1.3.6.1.4.1.2011.5.25.181.1.33.16", "hwL2mcNotificationsExceedLimit": "1.3.6.1.4.1.2011.5.25.181.1.33.11"]
]

// --- hwL2mcVlanEntryReachLimit (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.181.1.34.11
// Fields: hwL2mcNotificationsAddressType, hwL2mcNotificationsPortVlanIndex, hwL2mcNotificationsExceedCurrent, hwL2mcNotificationsExceedLimit
// Description: A hwL2mcVlanEntryReachLimit notification signifies that the number of multicast groups on one VLAN exceeded the upper limit.
trapMap["1.3.6.1.4.1.2011.5.25.181.1.34.11"] = [
    name: "hwL2mcVlanEntryReachLimit",
    fields: ["hwL2mcNotificationsAddressType", "hwL2mcNotificationsPortVlanIndex", "hwL2mcNotificationsExceedCurrent", "hwL2mcNotificationsExceedLimit"],
    fieldOids: ["hwL2mcNotificationsAddressType": "1.3.6.1.4.1.2011.5.25.181.1.33.10", "hwL2mcNotificationsPortVlanIndex": "1.3.6.1.4.1.2011.5.25.181.1.33.1", "hwL2mcNotificationsExceedCurrent": "1.3.6.1.4.1.2011.5.25.181.1.33.16", "hwL2mcNotificationsExceedLimit": "1.3.6.1.4.1.2011.5.25.181.1.33.11"]
]

// --- hwL2mcVlanEntryResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.181.1.34.12
// Fields: hwL2mcNotificationsAddressType, hwL2mcNotificationsPortVlanIndex, hwL2mcNotificationsExceedCurrent, hwL2mcNotificationsExceedLimit, hwL2mcNotificationReason
// Description: A hwL2mcVlanEntryResume notification signifies that the number of multicast groups on one VLAN fell below the upper limit.
trapMap["1.3.6.1.4.1.2011.5.25.181.1.34.12"] = [
    name: "hwL2mcVlanEntryResume",
    fields: ["hwL2mcNotificationsAddressType", "hwL2mcNotificationsPortVlanIndex", "hwL2mcNotificationsExceedCurrent", "hwL2mcNotificationsExceedLimit", "hwL2mcNotificationReason"],
    fieldOids: ["hwL2mcNotificationsAddressType": "1.3.6.1.4.1.2011.5.25.181.1.33.10", "hwL2mcNotificationsPortVlanIndex": "1.3.6.1.4.1.2011.5.25.181.1.33.1", "hwL2mcNotificationsExceedCurrent": "1.3.6.1.4.1.2011.5.25.181.1.33.16", "hwL2mcNotificationsExceedLimit": "1.3.6.1.4.1.2011.5.25.181.1.33.11", "hwL2mcNotificationReason": "1.3.6.1.4.1.2011.5.25.181.1.33.18"]
]

// --- hwL2mcInterfaceEntryReachLimit (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.181.1.34.13
// Fields: hwL2mcNotificationsAddressType, hwL2mcNotificationsPortIfIndex, hwL2mcNotificationsPortIfName, hwL2mcNotificationsExceedCurrent, hwL2mcNotificationsExceedLimit
// Description: A hwL2mcInterfaceEntryReachLimit notification signifies that the number of multicast groups on one interface exceeded the upper limit.
trapMap["1.3.6.1.4.1.2011.5.25.181.1.34.13"] = [
    name: "hwL2mcInterfaceEntryReachLimit",
    fields: ["hwL2mcNotificationsAddressType", "hwL2mcNotificationsPortIfIndex", "hwL2mcNotificationsPortIfName", "hwL2mcNotificationsExceedCurrent", "hwL2mcNotificationsExceedLimit"],
    fieldOids: ["hwL2mcNotificationsAddressType": "1.3.6.1.4.1.2011.5.25.181.1.33.10", "hwL2mcNotificationsPortIfIndex": "1.3.6.1.4.1.2011.5.25.181.1.33.4", "hwL2mcNotificationsPortIfName": "1.3.6.1.4.1.2011.5.25.181.1.33.9", "hwL2mcNotificationsExceedCurrent": "1.3.6.1.4.1.2011.5.25.181.1.33.16", "hwL2mcNotificationsExceedLimit": "1.3.6.1.4.1.2011.5.25.181.1.33.11"]
]

// --- hwL2mcInterfaceEntryResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.181.1.34.14
// Fields: hwL2mcNotificationsAddressType, hwL2mcNotificationsPortIfIndex, hwL2mcNotificationsPortIfName, hwL2mcNotificationsExceedCurrent, hwL2mcNotificationsExceedLimit, hwL2mcNotificationReason
// Description: A hwL2mcInterfaceEntryResume notification signifies that the number of multicast groups on one interface fell below the upper limit.
trapMap["1.3.6.1.4.1.2011.5.25.181.1.34.14"] = [
    name: "hwL2mcInterfaceEntryResume",
    fields: ["hwL2mcNotificationsAddressType", "hwL2mcNotificationsPortIfIndex", "hwL2mcNotificationsPortIfName", "hwL2mcNotificationsExceedCurrent", "hwL2mcNotificationsExceedLimit", "hwL2mcNotificationReason"],
    fieldOids: ["hwL2mcNotificationsAddressType": "1.3.6.1.4.1.2011.5.25.181.1.33.10", "hwL2mcNotificationsPortIfIndex": "1.3.6.1.4.1.2011.5.25.181.1.33.4", "hwL2mcNotificationsPortIfName": "1.3.6.1.4.1.2011.5.25.181.1.33.9", "hwL2mcNotificationsExceedCurrent": "1.3.6.1.4.1.2011.5.25.181.1.33.16", "hwL2mcNotificationsExceedLimit": "1.3.6.1.4.1.2011.5.25.181.1.33.11", "hwL2mcNotificationReason": "1.3.6.1.4.1.2011.5.25.181.1.33.18"]
]

// --- hwL2mcInterfaceVlanEntryReachLimit (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.181.1.34.15
// Fields: hwL2mcNotificationsAddressType, hwL2mcNotificationsPortIfIndex, hwL2mcNotificationsPortIfName, hwL2mcNotificationsPortVlanIndex, hwL2mcNotificationsExceedCurrent, hwL2mcNotificationsExceedLimit
// Description: A hwL2mcInterfaceVlanEntryReachLimit notification signifies that the number of multicast groups in a vlan on one interface exceeded the upper limit.
trapMap["1.3.6.1.4.1.2011.5.25.181.1.34.15"] = [
    name: "hwL2mcInterfaceVlanEntryReachLimit",
    fields: ["hwL2mcNotificationsAddressType", "hwL2mcNotificationsPortIfIndex", "hwL2mcNotificationsPortIfName", "hwL2mcNotificationsPortVlanIndex", "hwL2mcNotificationsExceedCurrent", "hwL2mcNotificationsExceedLimit"],
    fieldOids: ["hwL2mcNotificationsAddressType": "1.3.6.1.4.1.2011.5.25.181.1.33.10", "hwL2mcNotificationsPortIfIndex": "1.3.6.1.4.1.2011.5.25.181.1.33.4", "hwL2mcNotificationsPortIfName": "1.3.6.1.4.1.2011.5.25.181.1.33.9", "hwL2mcNotificationsPortVlanIndex": "1.3.6.1.4.1.2011.5.25.181.1.33.1", "hwL2mcNotificationsExceedCurrent": "1.3.6.1.4.1.2011.5.25.181.1.33.16", "hwL2mcNotificationsExceedLimit": "1.3.6.1.4.1.2011.5.25.181.1.33.11"]
]

// --- hwL2mcInterfaceVlanEntryResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.181.1.34.16
// Fields: hwL2mcNotificationsAddressType, hwL2mcNotificationsPortIfIndex, hwL2mcNotificationsPortIfName, hwL2mcNotificationsPortVlanIndex, hwL2mcNotificationsExceedCurrent, hwL2mcNotificationsExceedLimit, hwL2mcNotificationReason
// Description: A hwL2mcInterfaceVlanEntryResume notification signifies that the number of multicast groups in a vlan on one interface fell below the upper limit.
trapMap["1.3.6.1.4.1.2011.5.25.181.1.34.16"] = [
    name: "hwL2mcInterfaceVlanEntryResume",
    fields: ["hwL2mcNotificationsAddressType", "hwL2mcNotificationsPortIfIndex", "hwL2mcNotificationsPortIfName", "hwL2mcNotificationsPortVlanIndex", "hwL2mcNotificationsExceedCurrent", "hwL2mcNotificationsExceedLimit", "hwL2mcNotificationReason"],
    fieldOids: ["hwL2mcNotificationsAddressType": "1.3.6.1.4.1.2011.5.25.181.1.33.10", "hwL2mcNotificationsPortIfIndex": "1.3.6.1.4.1.2011.5.25.181.1.33.4", "hwL2mcNotificationsPortIfName": "1.3.6.1.4.1.2011.5.25.181.1.33.9", "hwL2mcNotificationsPortVlanIndex": "1.3.6.1.4.1.2011.5.25.181.1.33.1", "hwL2mcNotificationsExceedCurrent": "1.3.6.1.4.1.2011.5.25.181.1.33.16", "hwL2mcNotificationsExceedLimit": "1.3.6.1.4.1.2011.5.25.181.1.33.11", "hwL2mcNotificationReason": "1.3.6.1.4.1.2011.5.25.181.1.33.18"]
]

// --- hwL2mcBoardGMPEntryLimit (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.181.1.34.17
// Fields: hwL2mcNotificationsAddressType, hwL2mcNotificationsSlot, hwL2mcNotificationsExceedLimit
// Description: A hwL2mcBoardGMPEntryLimit notification signifies that the number of Layer 2 multicast entries on the board reached the upper limit.
trapMap["1.3.6.1.4.1.2011.5.25.181.1.34.17"] = [
    name: "hwL2mcBoardGMPEntryLimit",
    fields: ["hwL2mcNotificationsAddressType", "hwL2mcNotificationsSlot", "hwL2mcNotificationsExceedLimit"],
    fieldOids: ["hwL2mcNotificationsAddressType": "1.3.6.1.4.1.2011.5.25.181.1.33.10", "hwL2mcNotificationsSlot": "1.3.6.1.4.1.2011.5.25.181.1.33.15", "hwL2mcNotificationsExceedLimit": "1.3.6.1.4.1.2011.5.25.181.1.33.11"]
]

// --- hwL2mcBoardGMPEntryLimitClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.181.1.34.18
// Fields: hwL2mcNotificationsAddressType, hwL2mcNotificationsSlot, hwL2mcNotificationsExceedLimit
// Description: A hwL2mcBoardGMPEntryLimitClear notification signifies that the number of Layer 2 multicast entries on the board fell below the upper limit.
trapMap["1.3.6.1.4.1.2011.5.25.181.1.34.18"] = [
    name: "hwL2mcBoardGMPEntryLimitClear",
    fields: ["hwL2mcNotificationsAddressType", "hwL2mcNotificationsSlot", "hwL2mcNotificationsExceedLimit"],
    fieldOids: ["hwL2mcNotificationsAddressType": "1.3.6.1.4.1.2011.5.25.181.1.33.10", "hwL2mcNotificationsSlot": "1.3.6.1.4.1.2011.5.25.181.1.33.15", "hwL2mcNotificationsExceedLimit": "1.3.6.1.4.1.2011.5.25.181.1.33.11"]
]

// --- hwL2mcGlobalEntryReachLimit (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.181.1.34.19
// Fields: hwL2mcNotificationsAddressType, hwL2mcNotificationsExceedCurrent, hwL2mcNotificationsExceedLimit
// Description: An hwL2mcGlobalEntryThresholdExceed notification indicates that the number of multicast groups in a certain instance or all instances reaches the upper limit.
trapMap["1.3.6.1.4.1.2011.5.25.181.1.34.19"] = [
    name: "hwL2mcGlobalEntryReachLimit",
    fields: ["hwL2mcNotificationsAddressType", "hwL2mcNotificationsExceedCurrent", "hwL2mcNotificationsExceedLimit"],
    fieldOids: ["hwL2mcNotificationsAddressType": "1.3.6.1.4.1.2011.5.25.181.1.33.10", "hwL2mcNotificationsExceedCurrent": "1.3.6.1.4.1.2011.5.25.181.1.33.16", "hwL2mcNotificationsExceedLimit": "1.3.6.1.4.1.2011.5.25.181.1.33.11"]
]

// --- hwL2mcGlobalEntryReachLimitResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.181.1.34.20
// Fields: hwL2mcNotificationsAddressType, hwL2mcNotificationsExceedCurrent, hwL2mcNotificationsExceedLimit, hwL2mcNotificationReason
// Description: An hwL2mcGlobalEntryThresholdExceed notification indicates that the number of multicast groups in a certain instance or all instances fell below the upper limit.
trapMap["1.3.6.1.4.1.2011.5.25.181.1.34.20"] = [
    name: "hwL2mcGlobalEntryReachLimitResume",
    fields: ["hwL2mcNotificationsAddressType", "hwL2mcNotificationsExceedCurrent", "hwL2mcNotificationsExceedLimit", "hwL2mcNotificationReason"],
    fieldOids: ["hwL2mcNotificationsAddressType": "1.3.6.1.4.1.2011.5.25.181.1.33.10", "hwL2mcNotificationsExceedCurrent": "1.3.6.1.4.1.2011.5.25.181.1.33.16", "hwL2mcNotificationsExceedLimit": "1.3.6.1.4.1.2011.5.25.181.1.33.11", "hwL2mcNotificationReason": "1.3.6.1.4.1.2011.5.25.181.1.33.18"]
]

// --- hwL2mcSpmsiReachLimit (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.181.1.34.21
// Fields: hwL2mcNotificationsAddressType, hwL2mcNotificationsBdId, hwL2mcNotificationsPolicyName, hwL2mcNotificationsLimit
// Description: A hwL2mcSpmsiReachLimit indicates that number of Layer 2 multicast entries matching a single SPMSI policy reaches the SPMSI limit.
trapMap["1.3.6.1.4.1.2011.5.25.181.1.34.21"] = [
    name: "hwL2mcSpmsiReachLimit",
    fields: ["hwL2mcNotificationsAddressType", "hwL2mcNotificationsBdId", "hwL2mcNotificationsPolicyName", "hwL2mcNotificationsLimit"],
    fieldOids: ["hwL2mcNotificationsAddressType": "1.3.6.1.4.1.2011.5.25.181.1.33.10", "hwL2mcNotificationsBdId": "1.3.6.1.4.1.2011.5.25.181.1.33.20", "hwL2mcNotificationsPolicyName": "1.3.6.1.4.1.2011.5.25.181.1.33.21", "hwL2mcNotificationsLimit": "1.3.6.1.4.1.2011.5.25.181.1.33.22"]
]

// --- hwL2mcSpmsiReachLimitResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.181.1.34.22
// Fields: hwL2mcNotificationsAddressType, hwL2mcNotificationsBdId, hwL2mcNotificationsPolicyName, hwL2mcNotificationsLimit, hwL2mcNotificationReason
// Description: A hwL2mcSpmsiReachLimitResume indicates that the number of Layer 2 multicast entries matching a single SPMSI policy fell below the upper limit
trapMap["1.3.6.1.4.1.2011.5.25.181.1.34.22"] = [
    name: "hwL2mcSpmsiReachLimitResume",
    fields: ["hwL2mcNotificationsAddressType", "hwL2mcNotificationsBdId", "hwL2mcNotificationsPolicyName", "hwL2mcNotificationsLimit", "hwL2mcNotificationReason"],
    fieldOids: ["hwL2mcNotificationsAddressType": "1.3.6.1.4.1.2011.5.25.181.1.33.10", "hwL2mcNotificationsBdId": "1.3.6.1.4.1.2011.5.25.181.1.33.20", "hwL2mcNotificationsPolicyName": "1.3.6.1.4.1.2011.5.25.181.1.33.21", "hwL2mcNotificationsLimit": "1.3.6.1.4.1.2011.5.25.181.1.33.22", "hwL2mcNotificationReason": "1.3.6.1.4.1.2011.5.25.181.1.33.18"]
]

// ===== Parsing logic =====

// Set to true to enable diagnostic logging for this MIB parser
DEBUG = false

LOG_PREFIX = "[HUAWEI-L2MULTICAST-MIB]"
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
