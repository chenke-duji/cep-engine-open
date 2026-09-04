/**
 * Auto-generated from HUAWEI-OSPFV3-MIB.mib
 * Generated: 2026-08-24T18:28:30.589237900
 * Traps/Notifications (55): hwOspfv3VirtIfStateChange, hwOspfv3NbrStateChange, hwOspfv3VirtNbrStateChange, hwOspfv3IfConfigError, hwOspfv3VirtIfConfigError, hwOspfv3IfRxBadPacket, hwOspfv3VirtIfRxBadPacket, hwOspfv3IfStateChange, hwOspfv3RestartStatusChange, hwOspfv3NbrRestartHelperStatusChange, hwOspfv3VirtNbrRestartHelperStatusChange, hwOspfv3NssaTranslatorStatusChange, hwOspfv3LastAuthKeyExpiry, hwOspfv3AuthSequenceNumWrap, hwOspfv3IntraAreaRouterIdConflictRecovered, hwOspfv3PeerFlappingSuppressStatusChange, hwOspfv3ImportAseRouteThreshold, hwOspfv3ImportAseRouteThresholdClear, hwOspfv3ImportAseRouteExceed, hwOspfv3ImportAseRouteExceedClear, hwOspfv3ImportNssaRouteThreshold, hwOspfv3ImportNssaRouteThresholdClear, hwOspfv3ImportNssaRouteExceed, hwOspfv3ImportNssaRouteExceedClear, hwOspfv3GreaterAgeLsaRecived, hwOspfv3DeleteRouteByPurge, hwOspfv3DeleteRouteByPurgeClear, hwOspfv3RouteBeDeletedByPurgeExact, hwOspfv3RouteBeDeletedByPurgeExactClear, hwOspfv3RouteBeDeletedByPurgeInexact, hwOspfv3RouteBeDeletedByPurgeInexactClear, hwOspfv3RouteBeDeletedByPurge, hwOspfv3RouteBeDeletedByPurgeClear, hwOspfv3ThirdPartRouteBeDeletedByPurgeExact, hwOspfv3ThirdPartRouteBeDeletedByPurgeExactClear, hwOspfv3ThirdPartRouteBeDeletedByPurgeInexact, hwOspfv3ThirdPartRouteBeDeletedByPurgeInexactClear, hwOspfv3ThirdPartRouteBeDeletedByPurge, hwOspfv3ThirdPartRouteBeDeletedByPurgeClear, hwOspfv3RouteLoopDetected, hwOspfv3RouteLoopDetectedClear, hwOspfv3LinkCostAdjustment, hwOspfv3LinkCostAdjustmentClear, hwOspfv3IntraAreaRouterIdConflict, hwOspfv3IntraAreaRouterIdConflictClear, hwOspfv3NbrExceedThreshold, hwOspfv3NbrExceedThresholdClear, hwOspfv3LsaRetranExceedLimit, hwOspfv3LsaRetranExceedLimitClear, hwOspfv3RecvLsaExceedThreshold, hwOspfv3RecvLsaExceedThresholdClear, hwOspfv3NetSliceSrcPrefixConflict, hwOspfv3NetSliceSrcPrefixConflictClear, hwOspfv3Srv6PortLcsInactive, hwOspfv3Srv6PortLcsInactiveClear
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

// --- hwOspfv3VirtIfStateChange (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.147.0.1
// Fields: hwOspfv3RouterId, hwOspfv3VirtIfState, hwOspfv3IfStateChgReason
// Description: An ospfv3VirtIfStateChange notification signifies that there has been a change in the state of an OSPFv3 virtual interface. This notification should be generated when the interface state regresses (fo...
trapMap["1.3.6.1.4.1.2011.5.25.147.0.1"] = [
    name: "hwOspfv3VirtIfStateChange",
    fields: ["hwOspfv3RouterId", "hwOspfv3VirtIfState", "hwOspfv3IfStateChgReason"],
    fieldOids: ["hwOspfv3RouterId": "1.3.6.1.4.1.2011.5.25.147.1.1.1", "hwOspfv3VirtIfState": "1.3.6.1.4.1.2011.5.25.147.1.7.1.9", "hwOspfv3IfStateChgReason": "1.3.6.1.4.1.2011.5.25.147.1.12.5"]
]

// --- hwOspfv3NbrStateChange (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.147.0.2
// Fields: hwOspfv3RouterId, hwOspfv3NbrState, hwOspfv3IfName, hwOspfv3NbrStateChgReason
// Description: An ospfv3NbrStateChange notification signifies that there has been a change in the state of a non-virtual OSPFv3 neighbor. This notification should be generated when the neighbor state regresses (for ...
trapMap["1.3.6.1.4.1.2011.5.25.147.0.2"] = [
    name: "hwOspfv3NbrStateChange",
    fields: ["hwOspfv3RouterId", "hwOspfv3NbrState", "hwOspfv3IfName", "hwOspfv3NbrStateChgReason"],
    fieldOids: ["hwOspfv3RouterId": "1.3.6.1.4.1.2011.5.25.147.1.1.1", "hwOspfv3NbrState": "1.3.6.1.4.1.2011.5.25.147.1.8.1.8", "hwOspfv3IfName": "1.3.6.1.4.1.2011.5.25.147.1.12.4", "hwOspfv3NbrStateChgReason": "1.3.6.1.4.1.2011.5.25.147.1.12.6"]
]

// --- hwOspfv3VirtNbrStateChange (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.147.0.3
// Fields: hwOspfv3RouterId, hwOspfv3VirtNbrState, hwOspfv3NbrStateChgReason
// Description: An ospfv3VirtNbrStateChange notification signifies that there has been a change in the state of an OSPFv3 virtual neighbor. This notification should be generated when the neighbor state regresses (for...
trapMap["1.3.6.1.4.1.2011.5.25.147.0.3"] = [
    name: "hwOspfv3VirtNbrStateChange",
    fields: ["hwOspfv3RouterId", "hwOspfv3VirtNbrState", "hwOspfv3NbrStateChgReason"],
    fieldOids: ["hwOspfv3RouterId": "1.3.6.1.4.1.2011.5.25.147.1.1.1", "hwOspfv3VirtNbrState": "1.3.6.1.4.1.2011.5.25.147.1.10.1.8", "hwOspfv3NbrStateChgReason": "1.3.6.1.4.1.2011.5.25.147.1.12.6"]
]

// --- hwOspfv3IfConfigError (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.147.0.4
// Fields: hwOspfv3RouterId, hwOspfv3IfState, hwOspfv3PacketSrc, hwOspfv3ConfigErrorType, hwOspfv3PacketType
// Description: An ospfv3IfConfigError notification signifies that a packet has been received on a non-virtual interface from a router whose configuration parameters conflict with this router's configuration paramete...
trapMap["1.3.6.1.4.1.2011.5.25.147.0.4"] = [
    name: "hwOspfv3IfConfigError",
    fields: ["hwOspfv3RouterId", "hwOspfv3IfState", "hwOspfv3PacketSrc", "hwOspfv3ConfigErrorType", "hwOspfv3PacketType"],
    fieldOids: ["hwOspfv3RouterId": "1.3.6.1.4.1.2011.5.25.147.1.1.1", "hwOspfv3IfState": "1.3.6.1.4.1.2011.5.25.147.1.6.1.11", "hwOspfv3PacketSrc": "1.3.6.1.4.1.2011.5.25.147.1.12.3", "hwOspfv3ConfigErrorType": "1.3.6.1.4.1.2011.5.25.147.1.12.1", "hwOspfv3PacketType": "1.3.6.1.4.1.2011.5.25.147.1.12.2"]
]

// --- hwOspfv3VirtIfConfigError (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.147.0.5
// Fields: hwOspfv3RouterId, hwOspfv3VirtIfState, hwOspfv3ConfigErrorType, hwOspfv3PacketType
// Description: An ospfv3VirtIfConfigError notification signifies that a packet has been received on a virtual interface from a router whose configuration parameters conflict with this router's configuration paramete...
trapMap["1.3.6.1.4.1.2011.5.25.147.0.5"] = [
    name: "hwOspfv3VirtIfConfigError",
    fields: ["hwOspfv3RouterId", "hwOspfv3VirtIfState", "hwOspfv3ConfigErrorType", "hwOspfv3PacketType"],
    fieldOids: ["hwOspfv3RouterId": "1.3.6.1.4.1.2011.5.25.147.1.1.1", "hwOspfv3VirtIfState": "1.3.6.1.4.1.2011.5.25.147.1.7.1.9", "hwOspfv3ConfigErrorType": "1.3.6.1.4.1.2011.5.25.147.1.12.1", "hwOspfv3PacketType": "1.3.6.1.4.1.2011.5.25.147.1.12.2"]
]

// --- hwOspfv3IfRxBadPacket (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.147.0.6
// Fields: hwOspfv3RouterId, hwOspfv3IfState, hwOspfv3PacketSrc, hwOspfv3PacketType
// Description: An ospfv3IfRxBadPacket notification signifies that an OSPFv3 packet that cannot be parsed has been received on a non-virtual interface.
trapMap["1.3.6.1.4.1.2011.5.25.147.0.6"] = [
    name: "hwOspfv3IfRxBadPacket",
    fields: ["hwOspfv3RouterId", "hwOspfv3IfState", "hwOspfv3PacketSrc", "hwOspfv3PacketType"],
    fieldOids: ["hwOspfv3RouterId": "1.3.6.1.4.1.2011.5.25.147.1.1.1", "hwOspfv3IfState": "1.3.6.1.4.1.2011.5.25.147.1.6.1.11", "hwOspfv3PacketSrc": "1.3.6.1.4.1.2011.5.25.147.1.12.3", "hwOspfv3PacketType": "1.3.6.1.4.1.2011.5.25.147.1.12.2"]
]

// --- hwOspfv3VirtIfRxBadPacket (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.147.0.7
// Fields: hwOspfv3RouterId, hwOspfv3VirtIfState, hwOspfv3PacketType
// Description: An ospfv3VirtIfRxBadPacket notification signifies that an OSPFv3 packet that cannot be parsed has been received on a virtual interface.
trapMap["1.3.6.1.4.1.2011.5.25.147.0.7"] = [
    name: "hwOspfv3VirtIfRxBadPacket",
    fields: ["hwOspfv3RouterId", "hwOspfv3VirtIfState", "hwOspfv3PacketType"],
    fieldOids: ["hwOspfv3RouterId": "1.3.6.1.4.1.2011.5.25.147.1.1.1", "hwOspfv3VirtIfState": "1.3.6.1.4.1.2011.5.25.147.1.7.1.9", "hwOspfv3PacketType": "1.3.6.1.4.1.2011.5.25.147.1.12.2"]
]

// --- hwOspfv3IfStateChange (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.147.0.8
// Fields: hwOspfv3RouterId, hwOspfv3IfState, hwOspfv3IfName, hwOspfv3IfStateChgReason
// Description: An ospfv3IfStateChange notification signifies that there has been a change in the state of a non-virtual OSPFv3 interface. This notification should be generated when the interface state regresses (for...
trapMap["1.3.6.1.4.1.2011.5.25.147.0.8"] = [
    name: "hwOspfv3IfStateChange",
    fields: ["hwOspfv3RouterId", "hwOspfv3IfState", "hwOspfv3IfName", "hwOspfv3IfStateChgReason"],
    fieldOids: ["hwOspfv3RouterId": "1.3.6.1.4.1.2011.5.25.147.1.1.1", "hwOspfv3IfState": "1.3.6.1.4.1.2011.5.25.147.1.6.1.11", "hwOspfv3IfName": "1.3.6.1.4.1.2011.5.25.147.1.12.4", "hwOspfv3IfStateChgReason": "1.3.6.1.4.1.2011.5.25.147.1.12.5"]
]

// --- hwOspfv3RestartStatusChange (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.147.0.9
// Fields: hwOspfv3RouterId, hwOspfv3RestartStatus, hwOspfv3RestartInterval, hwOspfv3RestartExitRc
// Description: An ospfv3RestartStatusChange notification signifies that there has been a change in the graceful restart state for the router. This notification should be generated when the router restart status chan...
trapMap["1.3.6.1.4.1.2011.5.25.147.0.9"] = [
    name: "hwOspfv3RestartStatusChange",
    fields: ["hwOspfv3RouterId", "hwOspfv3RestartStatus", "hwOspfv3RestartInterval", "hwOspfv3RestartExitRc"],
    fieldOids: ["hwOspfv3RouterId": "1.3.6.1.4.1.2011.5.25.147.1.1.1", "hwOspfv3RestartStatus": "1.3.6.1.4.1.2011.5.25.147.1.1.14", "hwOspfv3RestartInterval": "1.3.6.1.4.1.2011.5.25.147.1.1.13", "hwOspfv3RestartExitRc": "1.3.6.1.4.1.2011.5.25.147.1.1.16"]
]

// --- hwOspfv3NbrRestartHelperStatusChange (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.147.0.10
// Fields: hwOspfv3RouterId, hwOspfv3NbrRestartHelperStatus, hwOspfv3NbrRestartHelperAge, hwOspfv3NbrRestartHelperExitRc
// Description: An ospfv3NbrRestartHelperStatusChange notification signifies that there has been a change in the graceful restart helper state for the neighbor. This notification should be generated when the neighbor...
trapMap["1.3.6.1.4.1.2011.5.25.147.0.10"] = [
    name: "hwOspfv3NbrRestartHelperStatusChange",
    fields: ["hwOspfv3RouterId", "hwOspfv3NbrRestartHelperStatus", "hwOspfv3NbrRestartHelperAge", "hwOspfv3NbrRestartHelperExitRc"],
    fieldOids: ["hwOspfv3RouterId": "1.3.6.1.4.1.2011.5.25.147.1.1.1", "hwOspfv3NbrRestartHelperStatus": "1.3.6.1.4.1.2011.5.25.147.1.8.1.13", "hwOspfv3NbrRestartHelperAge": "1.3.6.1.4.1.2011.5.25.147.1.8.1.14", "hwOspfv3NbrRestartHelperExitRc": "1.3.6.1.4.1.2011.5.25.147.1.8.1.15"]
]

// --- hwOspfv3VirtNbrRestartHelperStatusChange (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.147.0.11
// Fields: hwOspfv3RouterId, hwOspfv3VirtNbrRestartHelperStatus, hwOspfv3VirtNbrRestartHelperAge, hwOspfv3VirtNbrRestartHelperExitRc
// Description: An ospfv3VirtNbrRestartHelperStatusChange notification signifies that there has been a change in the graceful restart helper state for the virtual neighbor. This notification should be generated when ...
trapMap["1.3.6.1.4.1.2011.5.25.147.0.11"] = [
    name: "hwOspfv3VirtNbrRestartHelperStatusChange",
    fields: ["hwOspfv3RouterId", "hwOspfv3VirtNbrRestartHelperStatus", "hwOspfv3VirtNbrRestartHelperAge", "hwOspfv3VirtNbrRestartHelperExitRc"],
    fieldOids: ["hwOspfv3RouterId": "1.3.6.1.4.1.2011.5.25.147.1.1.1", "hwOspfv3VirtNbrRestartHelperStatus": "1.3.6.1.4.1.2011.5.25.147.1.10.1.13", "hwOspfv3VirtNbrRestartHelperAge": "1.3.6.1.4.1.2011.5.25.147.1.10.1.14", "hwOspfv3VirtNbrRestartHelperExitRc": "1.3.6.1.4.1.2011.5.25.147.1.10.1.15"]
]

// --- hwOspfv3NssaTranslatorStatusChange (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.147.0.12
// Fields: hwOspfv3RouterId, hwOspfv3AreaNssaTranslatorState
// Description: An ospfv3NssaTranslatorStatusChange notification indicates that there has been a change in the router's ability to translate OSPFv3 NSSA LSAs into OSPFv3 External LSAs. This notification should be gen...
trapMap["1.3.6.1.4.1.2011.5.25.147.0.12"] = [
    name: "hwOspfv3NssaTranslatorStatusChange",
    fields: ["hwOspfv3RouterId", "hwOspfv3AreaNssaTranslatorState"],
    fieldOids: ["hwOspfv3RouterId": "1.3.6.1.4.1.2011.5.25.147.1.1.1", "hwOspfv3AreaNssaTranslatorState": "1.3.6.1.4.1.2011.5.25.147.1.2.1.12"]
]

// --- hwOspfv3LastAuthKeyExpiry (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.147.0.13
// Fields: hwOspfv3RouterId, hwOspfv3IfName
// Description: An hwOspfv3LastAuthKeyExpiry notification indicates that the last key associated with an interface has expired. When this notification is received, either the lifetime of the key should be extended or...
trapMap["1.3.6.1.4.1.2011.5.25.147.0.13"] = [
    name: "hwOspfv3LastAuthKeyExpiry",
    fields: ["hwOspfv3RouterId", "hwOspfv3IfName"],
    fieldOids: ["hwOspfv3RouterId": "1.3.6.1.4.1.2011.5.25.147.1.1.1", "hwOspfv3IfName": "1.3.6.1.4.1.2011.5.25.147.1.12.4"]
]

// --- hwOspfv3AuthSequenceNumWrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.147.0.14
// Fields: hwOspfv3RouterId, hwOspfv3IfName
// Description: An hwOspfv3AuthSequenceNumWrap notification indicates that the 64-bit authentication sequence number has wrapped. When this notification is received, all the keys must be reset to avoid the possibilit...
trapMap["1.3.6.1.4.1.2011.5.25.147.0.14"] = [
    name: "hwOspfv3AuthSequenceNumWrap",
    fields: ["hwOspfv3RouterId", "hwOspfv3IfName"],
    fieldOids: ["hwOspfv3RouterId": "1.3.6.1.4.1.2011.5.25.147.1.1.1", "hwOspfv3IfName": "1.3.6.1.4.1.2011.5.25.147.1.12.4"]
]

// --- hwOspfv3IntraAreaRouterIdConflictRecovered (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.147.0.15
// Fields: hwOspfv3ProcessId, hwOspfv3AreaIdIndex, hwOspfv3RouterId, hwOspfv3NewRouterId
// Description: The object is used to monitor router ID conflict recovery in an intra area.
trapMap["1.3.6.1.4.1.2011.5.25.147.0.15"] = [
    name: "hwOspfv3IntraAreaRouterIdConflictRecovered",
    fields: ["hwOspfv3ProcessId", "hwOspfv3AreaIdIndex", "hwOspfv3RouterId", "hwOspfv3NewRouterId"],
    fieldOids: ["hwOspfv3ProcessId": "1.3.6.1.4.1.2011.5.25.147.1.12.7", "hwOspfv3AreaIdIndex": "1.3.6.1.4.1.2011.5.25.147.1.12.8", "hwOspfv3RouterId": "1.3.6.1.4.1.2011.5.25.147.1.1.1", "hwOspfv3NewRouterId": "1.3.6.1.4.1.2011.5.25.147.1.12.9"]
]

// --- hwOspfv3PeerFlappingSuppressStatusChange (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.147.0.16
// Fields: hwOspfv3ProcessId, hwOspfv3RouterId, hwOspfv3AreaIdIndex, hwOspfv3IfName, hwOspfv3PeerFlappingSuppressStatus, hwOspfv3PeerFlappingSuppressReason
// Description: These objects are used to monitor changed OSPFv3 peer flapping suppress status.
trapMap["1.3.6.1.4.1.2011.5.25.147.0.16"] = [
    name: "hwOspfv3PeerFlappingSuppressStatusChange",
    fields: ["hwOspfv3ProcessId", "hwOspfv3RouterId", "hwOspfv3AreaIdIndex", "hwOspfv3IfName", "hwOspfv3PeerFlappingSuppressStatus", "hwOspfv3PeerFlappingSuppressReason"],
    fieldOids: ["hwOspfv3ProcessId": "1.3.6.1.4.1.2011.5.25.147.1.12.7", "hwOspfv3RouterId": "1.3.6.1.4.1.2011.5.25.147.1.1.1", "hwOspfv3AreaIdIndex": "1.3.6.1.4.1.2011.5.25.147.1.12.8", "hwOspfv3IfName": "1.3.6.1.4.1.2011.5.25.147.1.12.4", "hwOspfv3PeerFlappingSuppressStatus": "1.3.6.1.4.1.2011.5.25.147.1.12.10", "hwOspfv3PeerFlappingSuppressReason": "1.3.6.1.4.1.2011.5.25.147.1.12.11"]
]

// --- hwOspfv3ImportAseRouteThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.147.0.17
// Fields: hwOspfv3ProcessId
// Description: This object indicates that the number of AS-external LSAs generated when an OSPFv3 process imports external routes exceeds the configured alarm threshold.
trapMap["1.3.6.1.4.1.2011.5.25.147.0.17"] = [
    name: "hwOspfv3ImportAseRouteThreshold",
    fields: ["hwOspfv3ProcessId"],
    fieldOids: ["hwOspfv3ProcessId": "1.3.6.1.4.1.2011.5.25.147.1.12.7"]
]

// --- hwOspfv3ImportAseRouteThresholdClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.147.0.18
// Fields: hwOspfv3ProcessId
// Description: This object indicates that the number of AS-external LSAs generated when an OSPFv3 process imports external routes has been less than the configured alarm threshold.
trapMap["1.3.6.1.4.1.2011.5.25.147.0.18"] = [
    name: "hwOspfv3ImportAseRouteThresholdClear",
    fields: ["hwOspfv3ProcessId"],
    fieldOids: ["hwOspfv3ProcessId": "1.3.6.1.4.1.2011.5.25.147.1.12.7"]
]

// --- hwOspfv3ImportAseRouteExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.147.0.19
// Fields: hwOspfv3ProcessId
// Description: This object indicates that the number of AS-external LSAs generated when an OSPFv3 process imports external routes exceeds the configured maximum number.
trapMap["1.3.6.1.4.1.2011.5.25.147.0.19"] = [
    name: "hwOspfv3ImportAseRouteExceed",
    fields: ["hwOspfv3ProcessId"],
    fieldOids: ["hwOspfv3ProcessId": "1.3.6.1.4.1.2011.5.25.147.1.12.7"]
]

// --- hwOspfv3ImportAseRouteExceedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.147.0.20
// Fields: hwOspfv3ProcessId
// Description: This object indicates that the number of AS-external LSAs generated when an OSPFv3 process imports external routes has been less than the configured maximum number.
trapMap["1.3.6.1.4.1.2011.5.25.147.0.20"] = [
    name: "hwOspfv3ImportAseRouteExceedClear",
    fields: ["hwOspfv3ProcessId"],
    fieldOids: ["hwOspfv3ProcessId": "1.3.6.1.4.1.2011.5.25.147.1.12.7"]
]

// --- hwOspfv3ImportNssaRouteThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.147.0.21
// Fields: hwOspfv3ProcessId, hwOspfv3AreaIdIndex
// Description: This object indicates that the number of NSSA LSAs generated when an OSPFv3 process imports external routes exceeds the configured alarm threshold.
trapMap["1.3.6.1.4.1.2011.5.25.147.0.21"] = [
    name: "hwOspfv3ImportNssaRouteThreshold",
    fields: ["hwOspfv3ProcessId", "hwOspfv3AreaIdIndex"],
    fieldOids: ["hwOspfv3ProcessId": "1.3.6.1.4.1.2011.5.25.147.1.12.7", "hwOspfv3AreaIdIndex": "1.3.6.1.4.1.2011.5.25.147.1.12.8"]
]

// --- hwOspfv3ImportNssaRouteThresholdClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.147.0.22
// Fields: hwOspfv3ProcessId, hwOspfv3AreaIdIndex
// Description: This object indicates that the number of NSSA LSAs generated when an OSPFv3 process imports external routes has been less than the configured alarm threshold.
trapMap["1.3.6.1.4.1.2011.5.25.147.0.22"] = [
    name: "hwOspfv3ImportNssaRouteThresholdClear",
    fields: ["hwOspfv3ProcessId", "hwOspfv3AreaIdIndex"],
    fieldOids: ["hwOspfv3ProcessId": "1.3.6.1.4.1.2011.5.25.147.1.12.7", "hwOspfv3AreaIdIndex": "1.3.6.1.4.1.2011.5.25.147.1.12.8"]
]

// --- hwOspfv3ImportNssaRouteExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.147.0.23
// Fields: hwOspfv3ProcessId, hwOspfv3AreaIdIndex
// Description: This object indicates that the number of NSSA LSAs generated when an OSPFv3 process imports external routes exceeds the configured maximum number.
trapMap["1.3.6.1.4.1.2011.5.25.147.0.23"] = [
    name: "hwOspfv3ImportNssaRouteExceed",
    fields: ["hwOspfv3ProcessId", "hwOspfv3AreaIdIndex"],
    fieldOids: ["hwOspfv3ProcessId": "1.3.6.1.4.1.2011.5.25.147.1.12.7", "hwOspfv3AreaIdIndex": "1.3.6.1.4.1.2011.5.25.147.1.12.8"]
]

// --- hwOspfv3ImportNssaRouteExceedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.147.0.24
// Fields: hwOspfv3ProcessId, hwOspfv3AreaIdIndex
// Description: This object indicates that the number of NSSA LSAs generated when an OSPFv3 process imports external routes has been less than the configured maximum number.
trapMap["1.3.6.1.4.1.2011.5.25.147.0.24"] = [
    name: "hwOspfv3ImportNssaRouteExceedClear",
    fields: ["hwOspfv3ProcessId", "hwOspfv3AreaIdIndex"],
    fieldOids: ["hwOspfv3ProcessId": "1.3.6.1.4.1.2011.5.25.147.1.12.7", "hwOspfv3AreaIdIndex": "1.3.6.1.4.1.2011.5.25.147.1.12.8"]
]

// --- hwOspfv3GreaterAgeLsaRecived (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.147.0.25
// Fields: hwOspfv3ProcessId, hwOspfv3RouterId, hwOspfv3AreaIdIndex, hwOspfv3IfName, hwOspfv3LsaId, hwOspfv3LsaAge
// Description: This object is used to monitor the router receive a greater age lsa in ospfv3.
trapMap["1.3.6.1.4.1.2011.5.25.147.0.25"] = [
    name: "hwOspfv3GreaterAgeLsaRecived",
    fields: ["hwOspfv3ProcessId", "hwOspfv3RouterId", "hwOspfv3AreaIdIndex", "hwOspfv3IfName", "hwOspfv3LsaId", "hwOspfv3LsaAge"],
    fieldOids: ["hwOspfv3ProcessId": "1.3.6.1.4.1.2011.5.25.147.1.12.7", "hwOspfv3RouterId": "1.3.6.1.4.1.2011.5.25.147.1.1.1", "hwOspfv3AreaIdIndex": "1.3.6.1.4.1.2011.5.25.147.1.12.8", "hwOspfv3IfName": "1.3.6.1.4.1.2011.5.25.147.1.12.4", "hwOspfv3LsaId": "1.3.6.1.4.1.2011.5.25.147.1.12.12", "hwOspfv3LsaAge": "1.3.6.1.4.1.2011.5.25.147.1.12.13"]
]

// --- hwOspfv3DeleteRouteByPurge (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.147.0.26
// Fields: hwOspfv3ProcessId, hwOspfv3PurgeHostName, hwOspfv3PurgeIpAddress, hwOspfv3PurgeRouterId, hwOspfv3AreaIdIndex, hwOspfv3FlushLsaNum, hwOspfv3AffectedNodeNum, hwOspfv3TotalNodeNum, hwOspfv3PurgeStatPeriod
// Description: This object indicates that the local device deleted OSPFv3 routes advertised by other devices. Reset or isolate the device from the network.
trapMap["1.3.6.1.4.1.2011.5.25.147.0.26"] = [
    name: "hwOspfv3DeleteRouteByPurge",
    fields: ["hwOspfv3ProcessId", "hwOspfv3PurgeHostName", "hwOspfv3PurgeIpAddress", "hwOspfv3PurgeRouterId", "hwOspfv3AreaIdIndex", "hwOspfv3FlushLsaNum", "hwOspfv3AffectedNodeNum", "hwOspfv3TotalNodeNum", "hwOspfv3PurgeStatPeriod"],
    fieldOids: ["hwOspfv3ProcessId": "1.3.6.1.4.1.2011.5.25.147.1.12.7", "hwOspfv3PurgeHostName": "1.3.6.1.4.1.2011.5.25.147.1.12.14", "hwOspfv3PurgeIpAddress": "1.3.6.1.4.1.2011.5.25.147.1.12.15", "hwOspfv3PurgeRouterId": "1.3.6.1.4.1.2011.5.25.147.1.12.16", "hwOspfv3AreaIdIndex": "1.3.6.1.4.1.2011.5.25.147.1.12.8", "hwOspfv3FlushLsaNum": "1.3.6.1.4.1.2011.5.25.147.1.12.17", "hwOspfv3AffectedNodeNum": "1.3.6.1.4.1.2011.5.25.147.1.12.18", "hwOspfv3TotalNodeNum": "1.3.6.1.4.1.2011.5.25.147.1.12.19", "hwOspfv3PurgeStatPeriod": "1.3.6.1.4.1.2011.5.25.147.1.12.20"]
]

// --- hwOspfv3DeleteRouteByPurgeClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.147.0.27
// Fields: hwOspfv3ProcessId, hwOspfv3PurgeHostName, hwOspfv3PurgeIpAddress, hwOspfv3PurgeRouterId, hwOspfv3AreaIdIndex
// Description: This object indicates that the local device did not delete OSPFv3 routes advertised by other devices.
trapMap["1.3.6.1.4.1.2011.5.25.147.0.27"] = [
    name: "hwOspfv3DeleteRouteByPurgeClear",
    fields: ["hwOspfv3ProcessId", "hwOspfv3PurgeHostName", "hwOspfv3PurgeIpAddress", "hwOspfv3PurgeRouterId", "hwOspfv3AreaIdIndex"],
    fieldOids: ["hwOspfv3ProcessId": "1.3.6.1.4.1.2011.5.25.147.1.12.7", "hwOspfv3PurgeHostName": "1.3.6.1.4.1.2011.5.25.147.1.12.14", "hwOspfv3PurgeIpAddress": "1.3.6.1.4.1.2011.5.25.147.1.12.15", "hwOspfv3PurgeRouterId": "1.3.6.1.4.1.2011.5.25.147.1.12.16", "hwOspfv3AreaIdIndex": "1.3.6.1.4.1.2011.5.25.147.1.12.8"]
]

// --- hwOspfv3RouteBeDeletedByPurgeExact (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.147.0.28
// Fields: hwOspfv3ProcessId, hwOspfv3PurgeHostName, hwOspfv3PurgeIpAddress, hwOspfv3PurgeRouterId, hwOspfv3AreaIdIndex, hwOspfv3FlushLsaNum, hwOspfv3AffectedNodeNum, hwOspfv3TotalNodeNum, hwOspfv3PurgeStatPeriod
// Description: This object indicates that OSPFv3 routes advertised by the local device were deleted by another device. Reset or isolate the faulty device from the network.
trapMap["1.3.6.1.4.1.2011.5.25.147.0.28"] = [
    name: "hwOspfv3RouteBeDeletedByPurgeExact",
    fields: ["hwOspfv3ProcessId", "hwOspfv3PurgeHostName", "hwOspfv3PurgeIpAddress", "hwOspfv3PurgeRouterId", "hwOspfv3AreaIdIndex", "hwOspfv3FlushLsaNum", "hwOspfv3AffectedNodeNum", "hwOspfv3TotalNodeNum", "hwOspfv3PurgeStatPeriod"],
    fieldOids: ["hwOspfv3ProcessId": "1.3.6.1.4.1.2011.5.25.147.1.12.7", "hwOspfv3PurgeHostName": "1.3.6.1.4.1.2011.5.25.147.1.12.14", "hwOspfv3PurgeIpAddress": "1.3.6.1.4.1.2011.5.25.147.1.12.15", "hwOspfv3PurgeRouterId": "1.3.6.1.4.1.2011.5.25.147.1.12.16", "hwOspfv3AreaIdIndex": "1.3.6.1.4.1.2011.5.25.147.1.12.8", "hwOspfv3FlushLsaNum": "1.3.6.1.4.1.2011.5.25.147.1.12.17", "hwOspfv3AffectedNodeNum": "1.3.6.1.4.1.2011.5.25.147.1.12.18", "hwOspfv3TotalNodeNum": "1.3.6.1.4.1.2011.5.25.147.1.12.19", "hwOspfv3PurgeStatPeriod": "1.3.6.1.4.1.2011.5.25.147.1.12.20"]
]

// --- hwOspfv3RouteBeDeletedByPurgeExactClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.147.0.29
// Fields: hwOspfv3ProcessId, hwOspfv3PurgeHostName, hwOspfv3PurgeIpAddress, hwOspfv3PurgeRouterId, hwOspfv3AreaIdIndex
// Description: This object indicates that OSPFv3 routes advertised by the local device were not deleted by another device.
trapMap["1.3.6.1.4.1.2011.5.25.147.0.29"] = [
    name: "hwOspfv3RouteBeDeletedByPurgeExactClear",
    fields: ["hwOspfv3ProcessId", "hwOspfv3PurgeHostName", "hwOspfv3PurgeIpAddress", "hwOspfv3PurgeRouterId", "hwOspfv3AreaIdIndex"],
    fieldOids: ["hwOspfv3ProcessId": "1.3.6.1.4.1.2011.5.25.147.1.12.7", "hwOspfv3PurgeHostName": "1.3.6.1.4.1.2011.5.25.147.1.12.14", "hwOspfv3PurgeIpAddress": "1.3.6.1.4.1.2011.5.25.147.1.12.15", "hwOspfv3PurgeRouterId": "1.3.6.1.4.1.2011.5.25.147.1.12.16", "hwOspfv3AreaIdIndex": "1.3.6.1.4.1.2011.5.25.147.1.12.8"]
]

// --- hwOspfv3RouteBeDeletedByPurgeInexact (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.147.0.30
// Fields: hwOspfv3ProcessId, hwOspfv3PurgeHostName, hwOspfv3PurgeIpAddress, hwOspfv3PurgeRouterId, hwOspfv3AreaIdIndex, hwOspfv3FlushLsaNum, hwOspfv3AffectedNodeNum, hwOspfv3TotalNodeNum, hwOspfv3RuledOutDeviceNum, hwOspfv3PurgeStatPeriod
// Description: This object indicates that OSPFv3 routes advertised by the local device were deleted by another device, and the possibly faulty device did not support OSPFv3 flush LSA source trace. Log in to the poss...
trapMap["1.3.6.1.4.1.2011.5.25.147.0.30"] = [
    name: "hwOspfv3RouteBeDeletedByPurgeInexact",
    fields: ["hwOspfv3ProcessId", "hwOspfv3PurgeHostName", "hwOspfv3PurgeIpAddress", "hwOspfv3PurgeRouterId", "hwOspfv3AreaIdIndex", "hwOspfv3FlushLsaNum", "hwOspfv3AffectedNodeNum", "hwOspfv3TotalNodeNum", "hwOspfv3RuledOutDeviceNum", "hwOspfv3PurgeStatPeriod"],
    fieldOids: ["hwOspfv3ProcessId": "1.3.6.1.4.1.2011.5.25.147.1.12.7", "hwOspfv3PurgeHostName": "1.3.6.1.4.1.2011.5.25.147.1.12.14", "hwOspfv3PurgeIpAddress": "1.3.6.1.4.1.2011.5.25.147.1.12.15", "hwOspfv3PurgeRouterId": "1.3.6.1.4.1.2011.5.25.147.1.12.16", "hwOspfv3AreaIdIndex": "1.3.6.1.4.1.2011.5.25.147.1.12.8", "hwOspfv3FlushLsaNum": "1.3.6.1.4.1.2011.5.25.147.1.12.17", "hwOspfv3AffectedNodeNum": "1.3.6.1.4.1.2011.5.25.147.1.12.18", "hwOspfv3TotalNodeNum": "1.3.6.1.4.1.2011.5.25.147.1.12.19", "hwOspfv3RuledOutDeviceNum": "1.3.6.1.4.1.2011.5.25.147.1.12.21", "hwOspfv3PurgeStatPeriod": "1.3.6.1.4.1.2011.5.25.147.1.12.20"]
]

// --- hwOspfv3RouteBeDeletedByPurgeInexactClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.147.0.31
// Fields: hwOspfv3ProcessId, hwOspfv3PurgeHostName, hwOspfv3PurgeIpAddress, hwOspfv3PurgeRouterId, hwOspfv3AreaIdIndex
// Description: This object indicates that OSPFv3 routes advertised by the local device were not deleted by another device.
trapMap["1.3.6.1.4.1.2011.5.25.147.0.31"] = [
    name: "hwOspfv3RouteBeDeletedByPurgeInexactClear",
    fields: ["hwOspfv3ProcessId", "hwOspfv3PurgeHostName", "hwOspfv3PurgeIpAddress", "hwOspfv3PurgeRouterId", "hwOspfv3AreaIdIndex"],
    fieldOids: ["hwOspfv3ProcessId": "1.3.6.1.4.1.2011.5.25.147.1.12.7", "hwOspfv3PurgeHostName": "1.3.6.1.4.1.2011.5.25.147.1.12.14", "hwOspfv3PurgeIpAddress": "1.3.6.1.4.1.2011.5.25.147.1.12.15", "hwOspfv3PurgeRouterId": "1.3.6.1.4.1.2011.5.25.147.1.12.16", "hwOspfv3AreaIdIndex": "1.3.6.1.4.1.2011.5.25.147.1.12.8"]
]

// --- hwOspfv3RouteBeDeletedByPurge (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.147.0.32
// Fields: hwOspfv3ProcessId, hwOspfv3PurgeHostName, hwOspfv3PurgeIpAddress, hwOspfv3PurgeRouterId, hwOspfv3AreaIdIndex, hwOspfv3TotalNodeNum, hwOspfv3PurgeHostName1, hwOspfv3PurgeIpAddress1, hwOspfv3PurgeRouterId1, hwOspfv3PurgeHostName2, hwOspfv3PurgeIpAddress2, hwOspfv3PurgeRouterId2, hwOspfv3PurgeHostName3, hwOspfv3PurgeIpAddress3, hwOspfv3PurgeRouterId3
// Description: This object indicates that OSPFv3 routes advertised by the local device were deleted by another device. Log in to the possibly faulty device. If the device is deleting routes, reset or isolate it from...
trapMap["1.3.6.1.4.1.2011.5.25.147.0.32"] = [
    name: "hwOspfv3RouteBeDeletedByPurge",
    fields: ["hwOspfv3ProcessId", "hwOspfv3PurgeHostName", "hwOspfv3PurgeIpAddress", "hwOspfv3PurgeRouterId", "hwOspfv3AreaIdIndex", "hwOspfv3TotalNodeNum", "hwOspfv3PurgeHostName1", "hwOspfv3PurgeIpAddress1", "hwOspfv3PurgeRouterId1", "hwOspfv3PurgeHostName2", "hwOspfv3PurgeIpAddress2", "hwOspfv3PurgeRouterId2", "hwOspfv3PurgeHostName3", "hwOspfv3PurgeIpAddress3", "hwOspfv3PurgeRouterId3"],
    fieldOids: ["hwOspfv3ProcessId": "1.3.6.1.4.1.2011.5.25.147.1.12.7", "hwOspfv3PurgeHostName": "1.3.6.1.4.1.2011.5.25.147.1.12.14", "hwOspfv3PurgeIpAddress": "1.3.6.1.4.1.2011.5.25.147.1.12.15", "hwOspfv3PurgeRouterId": "1.3.6.1.4.1.2011.5.25.147.1.12.16", "hwOspfv3AreaIdIndex": "1.3.6.1.4.1.2011.5.25.147.1.12.8", "hwOspfv3TotalNodeNum": "1.3.6.1.4.1.2011.5.25.147.1.12.19", "hwOspfv3PurgeHostName1": "1.3.6.1.4.1.2011.5.25.147.1.12.22", "hwOspfv3PurgeIpAddress1": "1.3.6.1.4.1.2011.5.25.147.1.12.25", "hwOspfv3PurgeRouterId1": "1.3.6.1.4.1.2011.5.25.147.1.12.28", "hwOspfv3PurgeHostName2": "1.3.6.1.4.1.2011.5.25.147.1.12.23", "hwOspfv3PurgeIpAddress2": "1.3.6.1.4.1.2011.5.25.147.1.12.26", "hwOspfv3PurgeRouterId2": "1.3.6.1.4.1.2011.5.25.147.1.12.29", "hwOspfv3PurgeHostName3": "1.3.6.1.4.1.2011.5.25.147.1.12.24", "hwOspfv3PurgeIpAddress3": "1.3.6.1.4.1.2011.5.25.147.1.12.27", "hwOspfv3PurgeRouterId3": "1.3.6.1.4.1.2011.5.25.147.1.12.30"]
]

// --- hwOspfv3RouteBeDeletedByPurgeClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.147.0.33
// Fields: hwOspfv3ProcessId, hwOspfv3PurgeHostName, hwOspfv3PurgeIpAddress, hwOspfv3PurgeRouterId, hwOspfv3AreaIdIndex
// Description: This object indicates that OSPFv3 routes advertised by the local device were not deleted by another device.
trapMap["1.3.6.1.4.1.2011.5.25.147.0.33"] = [
    name: "hwOspfv3RouteBeDeletedByPurgeClear",
    fields: ["hwOspfv3ProcessId", "hwOspfv3PurgeHostName", "hwOspfv3PurgeIpAddress", "hwOspfv3PurgeRouterId", "hwOspfv3AreaIdIndex"],
    fieldOids: ["hwOspfv3ProcessId": "1.3.6.1.4.1.2011.5.25.147.1.12.7", "hwOspfv3PurgeHostName": "1.3.6.1.4.1.2011.5.25.147.1.12.14", "hwOspfv3PurgeIpAddress": "1.3.6.1.4.1.2011.5.25.147.1.12.15", "hwOspfv3PurgeRouterId": "1.3.6.1.4.1.2011.5.25.147.1.12.16", "hwOspfv3AreaIdIndex": "1.3.6.1.4.1.2011.5.25.147.1.12.8"]
]

// --- hwOspfv3ThirdPartRouteBeDeletedByPurgeExact (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.147.0.34
// Fields: hwOspfv3ProcessId, hwOspfv3PurgeHostName, hwOspfv3PurgeIpAddress, hwOspfv3PurgeRouterId, hwOspfv3AreaIdIndex, hwOspfv3FlushLsaNum, hwOspfv3AffectedNodeNum, hwOspfv3TotalNodeNum, hwOspfv3PurgeStatPeriod
// Description: This object indicates that OSPFv3 routes advertised by another device were deleted. Reset or isolate the faulty device from the network.
trapMap["1.3.6.1.4.1.2011.5.25.147.0.34"] = [
    name: "hwOspfv3ThirdPartRouteBeDeletedByPurgeExact",
    fields: ["hwOspfv3ProcessId", "hwOspfv3PurgeHostName", "hwOspfv3PurgeIpAddress", "hwOspfv3PurgeRouterId", "hwOspfv3AreaIdIndex", "hwOspfv3FlushLsaNum", "hwOspfv3AffectedNodeNum", "hwOspfv3TotalNodeNum", "hwOspfv3PurgeStatPeriod"],
    fieldOids: ["hwOspfv3ProcessId": "1.3.6.1.4.1.2011.5.25.147.1.12.7", "hwOspfv3PurgeHostName": "1.3.6.1.4.1.2011.5.25.147.1.12.14", "hwOspfv3PurgeIpAddress": "1.3.6.1.4.1.2011.5.25.147.1.12.15", "hwOspfv3PurgeRouterId": "1.3.6.1.4.1.2011.5.25.147.1.12.16", "hwOspfv3AreaIdIndex": "1.3.6.1.4.1.2011.5.25.147.1.12.8", "hwOspfv3FlushLsaNum": "1.3.6.1.4.1.2011.5.25.147.1.12.17", "hwOspfv3AffectedNodeNum": "1.3.6.1.4.1.2011.5.25.147.1.12.18", "hwOspfv3TotalNodeNum": "1.3.6.1.4.1.2011.5.25.147.1.12.19", "hwOspfv3PurgeStatPeriod": "1.3.6.1.4.1.2011.5.25.147.1.12.20"]
]

// --- hwOspfv3ThirdPartRouteBeDeletedByPurgeExactClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.147.0.35
// Fields: hwOspfv3ProcessId, hwOspfv3PurgeHostName, hwOspfv3PurgeIpAddress, hwOspfv3PurgeRouterId, hwOspfv3AreaIdIndex
// Description: This object indicates that OSPFv3 routes advertised by another device were not deleted.
trapMap["1.3.6.1.4.1.2011.5.25.147.0.35"] = [
    name: "hwOspfv3ThirdPartRouteBeDeletedByPurgeExactClear",
    fields: ["hwOspfv3ProcessId", "hwOspfv3PurgeHostName", "hwOspfv3PurgeIpAddress", "hwOspfv3PurgeRouterId", "hwOspfv3AreaIdIndex"],
    fieldOids: ["hwOspfv3ProcessId": "1.3.6.1.4.1.2011.5.25.147.1.12.7", "hwOspfv3PurgeHostName": "1.3.6.1.4.1.2011.5.25.147.1.12.14", "hwOspfv3PurgeIpAddress": "1.3.6.1.4.1.2011.5.25.147.1.12.15", "hwOspfv3PurgeRouterId": "1.3.6.1.4.1.2011.5.25.147.1.12.16", "hwOspfv3AreaIdIndex": "1.3.6.1.4.1.2011.5.25.147.1.12.8"]
]

// --- hwOspfv3ThirdPartRouteBeDeletedByPurgeInexact (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.147.0.36
// Fields: hwOspfv3ProcessId, hwOspfv3PurgeHostName, hwOspfv3PurgeIpAddress, hwOspfv3PurgeRouterId, hwOspfv3AreaIdIndex, hwOspfv3FlushLsaNum, hwOspfv3AffectedNodeNum, hwOspfv3TotalNodeNum, hwOspfv3RuledOutDeviceNum, hwOspfv3PurgeStatPeriod
// Description: This object indicates that OSPFv3 routes advertised by another device were deleted, and the possibly faulty device did not support OSPFv3 flush LSA source trace. Log in to the possibly faulty device. ...
trapMap["1.3.6.1.4.1.2011.5.25.147.0.36"] = [
    name: "hwOspfv3ThirdPartRouteBeDeletedByPurgeInexact",
    fields: ["hwOspfv3ProcessId", "hwOspfv3PurgeHostName", "hwOspfv3PurgeIpAddress", "hwOspfv3PurgeRouterId", "hwOspfv3AreaIdIndex", "hwOspfv3FlushLsaNum", "hwOspfv3AffectedNodeNum", "hwOspfv3TotalNodeNum", "hwOspfv3RuledOutDeviceNum", "hwOspfv3PurgeStatPeriod"],
    fieldOids: ["hwOspfv3ProcessId": "1.3.6.1.4.1.2011.5.25.147.1.12.7", "hwOspfv3PurgeHostName": "1.3.6.1.4.1.2011.5.25.147.1.12.14", "hwOspfv3PurgeIpAddress": "1.3.6.1.4.1.2011.5.25.147.1.12.15", "hwOspfv3PurgeRouterId": "1.3.6.1.4.1.2011.5.25.147.1.12.16", "hwOspfv3AreaIdIndex": "1.3.6.1.4.1.2011.5.25.147.1.12.8", "hwOspfv3FlushLsaNum": "1.3.6.1.4.1.2011.5.25.147.1.12.17", "hwOspfv3AffectedNodeNum": "1.3.6.1.4.1.2011.5.25.147.1.12.18", "hwOspfv3TotalNodeNum": "1.3.6.1.4.1.2011.5.25.147.1.12.19", "hwOspfv3RuledOutDeviceNum": "1.3.6.1.4.1.2011.5.25.147.1.12.21", "hwOspfv3PurgeStatPeriod": "1.3.6.1.4.1.2011.5.25.147.1.12.20"]
]

// --- hwOspfv3ThirdPartRouteBeDeletedByPurgeInexactClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.147.0.37
// Fields: hwOspfv3ProcessId, hwOspfv3PurgeHostName, hwOspfv3PurgeIpAddress, hwOspfv3PurgeRouterId, hwOspfv3AreaIdIndex
// Description: This object indicates that OSPFv3 routes advertised by another device were not deleted.
trapMap["1.3.6.1.4.1.2011.5.25.147.0.37"] = [
    name: "hwOspfv3ThirdPartRouteBeDeletedByPurgeInexactClear",
    fields: ["hwOspfv3ProcessId", "hwOspfv3PurgeHostName", "hwOspfv3PurgeIpAddress", "hwOspfv3PurgeRouterId", "hwOspfv3AreaIdIndex"],
    fieldOids: ["hwOspfv3ProcessId": "1.3.6.1.4.1.2011.5.25.147.1.12.7", "hwOspfv3PurgeHostName": "1.3.6.1.4.1.2011.5.25.147.1.12.14", "hwOspfv3PurgeIpAddress": "1.3.6.1.4.1.2011.5.25.147.1.12.15", "hwOspfv3PurgeRouterId": "1.3.6.1.4.1.2011.5.25.147.1.12.16", "hwOspfv3AreaIdIndex": "1.3.6.1.4.1.2011.5.25.147.1.12.8"]
]

// --- hwOspfv3ThirdPartRouteBeDeletedByPurge (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.147.0.38
// Fields: hwOspfv3ProcessId, hwOspfv3PurgeHostName, hwOspfv3PurgeIpAddress, hwOspfv3PurgeRouterId, hwOspfv3AreaIdIndex, hwOspfv3TotalNodeNum, hwOspfv3PurgeHostName1, hwOspfv3PurgeIpAddress1, hwOspfv3PurgeRouterId1, hwOspfv3PurgeHostName2, hwOspfv3PurgeIpAddress2, hwOspfv3PurgeRouterId2, hwOspfv3PurgeHostName3, hwOspfv3PurgeIpAddress3, hwOspfv3PurgeRouterId3
// Description: This object indicates that OSPFv3 routes advertised by another device were deleted. Log in to the possibly faulty device. If the device is deleting routes, reset or isolate it from the network. Otherw...
trapMap["1.3.6.1.4.1.2011.5.25.147.0.38"] = [
    name: "hwOspfv3ThirdPartRouteBeDeletedByPurge",
    fields: ["hwOspfv3ProcessId", "hwOspfv3PurgeHostName", "hwOspfv3PurgeIpAddress", "hwOspfv3PurgeRouterId", "hwOspfv3AreaIdIndex", "hwOspfv3TotalNodeNum", "hwOspfv3PurgeHostName1", "hwOspfv3PurgeIpAddress1", "hwOspfv3PurgeRouterId1", "hwOspfv3PurgeHostName2", "hwOspfv3PurgeIpAddress2", "hwOspfv3PurgeRouterId2", "hwOspfv3PurgeHostName3", "hwOspfv3PurgeIpAddress3", "hwOspfv3PurgeRouterId3"],
    fieldOids: ["hwOspfv3ProcessId": "1.3.6.1.4.1.2011.5.25.147.1.12.7", "hwOspfv3PurgeHostName": "1.3.6.1.4.1.2011.5.25.147.1.12.14", "hwOspfv3PurgeIpAddress": "1.3.6.1.4.1.2011.5.25.147.1.12.15", "hwOspfv3PurgeRouterId": "1.3.6.1.4.1.2011.5.25.147.1.12.16", "hwOspfv3AreaIdIndex": "1.3.6.1.4.1.2011.5.25.147.1.12.8", "hwOspfv3TotalNodeNum": "1.3.6.1.4.1.2011.5.25.147.1.12.19", "hwOspfv3PurgeHostName1": "1.3.6.1.4.1.2011.5.25.147.1.12.22", "hwOspfv3PurgeIpAddress1": "1.3.6.1.4.1.2011.5.25.147.1.12.25", "hwOspfv3PurgeRouterId1": "1.3.6.1.4.1.2011.5.25.147.1.12.28", "hwOspfv3PurgeHostName2": "1.3.6.1.4.1.2011.5.25.147.1.12.23", "hwOspfv3PurgeIpAddress2": "1.3.6.1.4.1.2011.5.25.147.1.12.26", "hwOspfv3PurgeRouterId2": "1.3.6.1.4.1.2011.5.25.147.1.12.29", "hwOspfv3PurgeHostName3": "1.3.6.1.4.1.2011.5.25.147.1.12.24", "hwOspfv3PurgeIpAddress3": "1.3.6.1.4.1.2011.5.25.147.1.12.27", "hwOspfv3PurgeRouterId3": "1.3.6.1.4.1.2011.5.25.147.1.12.30"]
]

// --- hwOspfv3ThirdPartRouteBeDeletedByPurgeClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.147.0.39
// Fields: hwOspfv3ProcessId, hwOspfv3PurgeHostName, hwOspfv3PurgeIpAddress, hwOspfv3PurgeRouterId, hwOspfv3AreaIdIndex
// Description: This object indicates that OSPFv3 routes advertised by another device were not deleted.
trapMap["1.3.6.1.4.1.2011.5.25.147.0.39"] = [
    name: "hwOspfv3ThirdPartRouteBeDeletedByPurgeClear",
    fields: ["hwOspfv3ProcessId", "hwOspfv3PurgeHostName", "hwOspfv3PurgeIpAddress", "hwOspfv3PurgeRouterId", "hwOspfv3AreaIdIndex"],
    fieldOids: ["hwOspfv3ProcessId": "1.3.6.1.4.1.2011.5.25.147.1.12.7", "hwOspfv3PurgeHostName": "1.3.6.1.4.1.2011.5.25.147.1.12.14", "hwOspfv3PurgeIpAddress": "1.3.6.1.4.1.2011.5.25.147.1.12.15", "hwOspfv3PurgeRouterId": "1.3.6.1.4.1.2011.5.25.147.1.12.16", "hwOspfv3AreaIdIndex": "1.3.6.1.4.1.2011.5.25.147.1.12.8"]
]

// --- hwOspfv3RouteLoopDetected (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.147.0.40
// Fields: hwOspfv3LoopDetectType, hwOspfv3LoopDetectProtocolAttr, hwOspfv3LoopDetectRedistributeID1, hwOspfv3LoopDetectRedistributeID2
// Description: This object indicates that a routing loop has been detected on the local device.
trapMap["1.3.6.1.4.1.2011.5.25.147.0.40"] = [
    name: "hwOspfv3RouteLoopDetected",
    fields: ["hwOspfv3LoopDetectType", "hwOspfv3LoopDetectProtocolAttr", "hwOspfv3LoopDetectRedistributeID1", "hwOspfv3LoopDetectRedistributeID2"],
    fieldOids: ["hwOspfv3LoopDetectType": "1.3.6.1.4.1.2011.5.25.147.1.12.31", "hwOspfv3LoopDetectProtocolAttr": "1.3.6.1.4.1.2011.5.25.147.1.12.32", "hwOspfv3LoopDetectRedistributeID1": "1.3.6.1.4.1.2011.5.25.147.1.12.33", "hwOspfv3LoopDetectRedistributeID2": "1.3.6.1.4.1.2011.5.25.147.1.12.34"]
]

// --- hwOspfv3RouteLoopDetectedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.147.0.41
// Fields: hwOspfv3LoopDetectType, hwOspfv3LoopDetectProtocolAttr, hwOspfv3LoopDetectRedistributeID1, hwOspfv3LoopDetectRedistributeID2
// Description: This object indicates that the routing loop is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.147.0.41"] = [
    name: "hwOspfv3RouteLoopDetectedClear",
    fields: ["hwOspfv3LoopDetectType", "hwOspfv3LoopDetectProtocolAttr", "hwOspfv3LoopDetectRedistributeID1", "hwOspfv3LoopDetectRedistributeID2"],
    fieldOids: ["hwOspfv3LoopDetectType": "1.3.6.1.4.1.2011.5.25.147.1.12.31", "hwOspfv3LoopDetectProtocolAttr": "1.3.6.1.4.1.2011.5.25.147.1.12.32", "hwOspfv3LoopDetectRedistributeID1": "1.3.6.1.4.1.2011.5.25.147.1.12.33", "hwOspfv3LoopDetectRedistributeID2": "1.3.6.1.4.1.2011.5.25.147.1.12.34"]
]

// --- hwOspfv3LinkCostAdjustment (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.147.0.42
// Fields: hwOspfv3ProcessId, hwOspfv3AreaIdIndex, hwOspfv3IfIndex, hwOspfv3IfInstId, hwOspfv3IfName, hwOspfv3CostAdjustReason, hwOspfv3OriginalCost, hwOspfv3AdjustedCost
// Description: This object indicates that an OSPF link cost adjustment event occurs.
trapMap["1.3.6.1.4.1.2011.5.25.147.0.42"] = [
    name: "hwOspfv3LinkCostAdjustment",
    fields: ["hwOspfv3ProcessId", "hwOspfv3AreaIdIndex", "hwOspfv3IfIndex", "hwOspfv3IfInstId", "hwOspfv3IfName", "hwOspfv3CostAdjustReason", "hwOspfv3OriginalCost", "hwOspfv3AdjustedCost"],
    fieldOids: ["hwOspfv3ProcessId": "1.3.6.1.4.1.2011.5.25.147.1.12.7", "hwOspfv3AreaIdIndex": "1.3.6.1.4.1.2011.5.25.147.1.12.8", "hwOspfv3IfIndex": "1.3.6.1.4.1.2011.5.25.147.1.6.1.1", "hwOspfv3IfInstId": "1.3.6.1.4.1.2011.5.25.147.1.6.1.2", "hwOspfv3IfName": "1.3.6.1.4.1.2011.5.25.147.1.12.4", "hwOspfv3CostAdjustReason": "1.3.6.1.4.1.2011.5.25.147.1.12.35", "hwOspfv3OriginalCost": "1.3.6.1.4.1.2011.5.25.147.1.12.36", "hwOspfv3AdjustedCost": "1.3.6.1.4.1.2011.5.25.147.1.12.37"]
]

// --- hwOspfv3LinkCostAdjustmentClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.147.0.43
// Fields: hwOspfv3ProcessId, hwOspfv3AreaIdIndex, hwOspfv3IfIndex, hwOspfv3IfInstId, hwOspfv3IfName, hwOspfv3CostAdjustReason, hwOspfv3OriginalCost, hwOspfv3AdjustedCost
// Description: This object indicates that an OSPF link cost adjustment event is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.147.0.43"] = [
    name: "hwOspfv3LinkCostAdjustmentClear",
    fields: ["hwOspfv3ProcessId", "hwOspfv3AreaIdIndex", "hwOspfv3IfIndex", "hwOspfv3IfInstId", "hwOspfv3IfName", "hwOspfv3CostAdjustReason", "hwOspfv3OriginalCost", "hwOspfv3AdjustedCost"],
    fieldOids: ["hwOspfv3ProcessId": "1.3.6.1.4.1.2011.5.25.147.1.12.7", "hwOspfv3AreaIdIndex": "1.3.6.1.4.1.2011.5.25.147.1.12.8", "hwOspfv3IfIndex": "1.3.6.1.4.1.2011.5.25.147.1.6.1.1", "hwOspfv3IfInstId": "1.3.6.1.4.1.2011.5.25.147.1.6.1.2", "hwOspfv3IfName": "1.3.6.1.4.1.2011.5.25.147.1.12.4", "hwOspfv3CostAdjustReason": "1.3.6.1.4.1.2011.5.25.147.1.12.35", "hwOspfv3OriginalCost": "1.3.6.1.4.1.2011.5.25.147.1.12.36", "hwOspfv3AdjustedCost": "1.3.6.1.4.1.2011.5.25.147.1.12.37"]
]

// --- hwOspfv3IntraAreaRouterIdConflict (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.147.0.44
// Fields: hwOspfv3ProcessId, hwOspfv3RouterId, hwOspfv3AreaIdIndex
// Description: The object is used to monitor router ID conflict in an intra area.
trapMap["1.3.6.1.4.1.2011.5.25.147.0.44"] = [
    name: "hwOspfv3IntraAreaRouterIdConflict",
    fields: ["hwOspfv3ProcessId", "hwOspfv3RouterId", "hwOspfv3AreaIdIndex"],
    fieldOids: ["hwOspfv3ProcessId": "1.3.6.1.4.1.2011.5.25.147.1.12.7", "hwOspfv3RouterId": "1.3.6.1.4.1.2011.5.25.147.1.1.1", "hwOspfv3AreaIdIndex": "1.3.6.1.4.1.2011.5.25.147.1.12.8"]
]

// --- hwOspfv3IntraAreaRouterIdConflictClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.147.0.45
// Fields: hwOspfv3ProcessId, hwOspfv3AreaIdIndex, hwOspfv3RouterId, hwOspfv3NewRouterId
// Description: The object is used to monitor router ID conflict recovery in an intra area.
trapMap["1.3.6.1.4.1.2011.5.25.147.0.45"] = [
    name: "hwOspfv3IntraAreaRouterIdConflictClear",
    fields: ["hwOspfv3ProcessId", "hwOspfv3AreaIdIndex", "hwOspfv3RouterId", "hwOspfv3NewRouterId"],
    fieldOids: ["hwOspfv3ProcessId": "1.3.6.1.4.1.2011.5.25.147.1.12.7", "hwOspfv3AreaIdIndex": "1.3.6.1.4.1.2011.5.25.147.1.12.8", "hwOspfv3RouterId": "1.3.6.1.4.1.2011.5.25.147.1.1.1", "hwOspfv3NewRouterId": "1.3.6.1.4.1.2011.5.25.147.1.12.9"]
]

// --- hwOspfv3NbrExceedThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.147.0.46
// Fields: hwOspfv3NbrThresholdUpper
// Description: This object indicates that the number of ospfv3 exceeds the configed threshold.
trapMap["1.3.6.1.4.1.2011.5.25.147.0.46"] = [
    name: "hwOspfv3NbrExceedThreshold",
    fields: ["hwOspfv3NbrThresholdUpper"],
    fieldOids: ["hwOspfv3NbrThresholdUpper": "1.3.6.1.4.1.2011.5.25.147.1.12.38"]
]

// --- hwOspfv3NbrExceedThresholdClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.147.0.47
// Fields: hwOspfv3NbrThresholdUpper
// Description: This object indicates that the number of ospfv3 has been less than the the configed threshold.
trapMap["1.3.6.1.4.1.2011.5.25.147.0.47"] = [
    name: "hwOspfv3NbrExceedThresholdClear",
    fields: ["hwOspfv3NbrThresholdUpper"],
    fieldOids: ["hwOspfv3NbrThresholdUpper": "1.3.6.1.4.1.2011.5.25.147.1.12.38"]
]

// --- hwOspfv3LsaRetranExceedLimit (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.147.0.48
// Fields: hwOspfv3ProcessId, hwOspfv3AreaIdIndex, hwOspfv3IfName
// Description: This object indicates that the number of OSPFv3 LSA retransmissions on an interface is exceeds than the limit.
trapMap["1.3.6.1.4.1.2011.5.25.147.0.48"] = [
    name: "hwOspfv3LsaRetranExceedLimit",
    fields: ["hwOspfv3ProcessId", "hwOspfv3AreaIdIndex", "hwOspfv3IfName"],
    fieldOids: ["hwOspfv3ProcessId": "1.3.6.1.4.1.2011.5.25.147.1.12.7", "hwOspfv3AreaIdIndex": "1.3.6.1.4.1.2011.5.25.147.1.12.8", "hwOspfv3IfName": "1.3.6.1.4.1.2011.5.25.147.1.12.4"]
]

// --- hwOspfv3LsaRetranExceedLimitClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.147.0.49
// Fields: hwOspfv3ProcessId, hwOspfv3AreaIdIndex, hwOspfv3IfName
// Description: This object indicates that the number of OSPFv3 LSA retransmissions on an interface is lower than the limit.
trapMap["1.3.6.1.4.1.2011.5.25.147.0.49"] = [
    name: "hwOspfv3LsaRetranExceedLimitClear",
    fields: ["hwOspfv3ProcessId", "hwOspfv3AreaIdIndex", "hwOspfv3IfName"],
    fieldOids: ["hwOspfv3ProcessId": "1.3.6.1.4.1.2011.5.25.147.1.12.7", "hwOspfv3AreaIdIndex": "1.3.6.1.4.1.2011.5.25.147.1.12.8", "hwOspfv3IfName": "1.3.6.1.4.1.2011.5.25.147.1.12.4"]
]

// --- hwOspfv3RecvLsaExceedThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.147.0.50
// Fields: hwOspfv3ProcessId, hwOspfv3RecvLsaUpper
// Description: This object indicates that the number of received AS-external and NSSA LSAs exceeds the configed threshold.
trapMap["1.3.6.1.4.1.2011.5.25.147.0.50"] = [
    name: "hwOspfv3RecvLsaExceedThreshold",
    fields: ["hwOspfv3ProcessId", "hwOspfv3RecvLsaUpper"],
    fieldOids: ["hwOspfv3ProcessId": "1.3.6.1.4.1.2011.5.25.147.1.12.7", "hwOspfv3RecvLsaUpper": "1.3.6.1.4.1.2011.5.25.147.1.12.39"]
]

// --- hwOspfv3RecvLsaExceedThresholdClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.147.0.51
// Fields: hwOspfv3ProcessId, hwOspfv3RecvLsaUpper
// Description: This object indicates that the number of received AS-external and NSSA LSAs has been less than the the configed threshold.
trapMap["1.3.6.1.4.1.2011.5.25.147.0.51"] = [
    name: "hwOspfv3RecvLsaExceedThresholdClear",
    fields: ["hwOspfv3ProcessId", "hwOspfv3RecvLsaUpper"],
    fieldOids: ["hwOspfv3ProcessId": "1.3.6.1.4.1.2011.5.25.147.1.12.7", "hwOspfv3RecvLsaUpper": "1.3.6.1.4.1.2011.5.25.147.1.12.39"]
]

// --- hwOspfv3NetSliceSrcPrefixConflict (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.147.0.52
// Fields: hwOspfv3ProcessId, hwOspfv3CommonRouterId, hwOspfv3Ipv6Prefix, hwOspfv3Ipv6PrefixMask, hwOspfv3ConflictRouterId
// Description: A conflict between the network slice source prefix of the local device and the IPv6 prefix of another device is detected.
trapMap["1.3.6.1.4.1.2011.5.25.147.0.52"] = [
    name: "hwOspfv3NetSliceSrcPrefixConflict",
    fields: ["hwOspfv3ProcessId", "hwOspfv3CommonRouterId", "hwOspfv3Ipv6Prefix", "hwOspfv3Ipv6PrefixMask", "hwOspfv3ConflictRouterId"],
    fieldOids: ["hwOspfv3ProcessId": "1.3.6.1.4.1.2011.5.25.147.1.12.7", "hwOspfv3CommonRouterId": "1.3.6.1.4.1.2011.5.25.147.1.1.22", "hwOspfv3Ipv6Prefix": "1.3.6.1.4.1.2011.5.25.147.1.1.19", "hwOspfv3Ipv6PrefixMask": "1.3.6.1.4.1.2011.5.25.147.1.1.20", "hwOspfv3ConflictRouterId": "1.3.6.1.4.1.2011.5.25.147.1.1.21"]
]

// --- hwOspfv3NetSliceSrcPrefixConflictClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.147.0.53
// Fields: hwOspfv3ProcessId, hwOspfv3CommonRouterId, hwOspfv3Ipv6Prefix, hwOspfv3Ipv6PrefixMask, hwOspfv3ConflictRouterId
// Description: The conflict between the network slice source prefix and the IPv6 prefix is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.147.0.53"] = [
    name: "hwOspfv3NetSliceSrcPrefixConflictClear",
    fields: ["hwOspfv3ProcessId", "hwOspfv3CommonRouterId", "hwOspfv3Ipv6Prefix", "hwOspfv3Ipv6PrefixMask", "hwOspfv3ConflictRouterId"],
    fieldOids: ["hwOspfv3ProcessId": "1.3.6.1.4.1.2011.5.25.147.1.12.7", "hwOspfv3CommonRouterId": "1.3.6.1.4.1.2011.5.25.147.1.1.22", "hwOspfv3Ipv6Prefix": "1.3.6.1.4.1.2011.5.25.147.1.1.19", "hwOspfv3Ipv6PrefixMask": "1.3.6.1.4.1.2011.5.25.147.1.1.20", "hwOspfv3ConflictRouterId": "1.3.6.1.4.1.2011.5.25.147.1.1.21"]
]

// --- hwOspfv3Srv6PortLcsInactive (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.147.0.54
// Fields: hwOspfv3ProcessId, hwOspfv3IfName, hwOspfv3IfCount
// Description: No SRv6 license authorization was available.
trapMap["1.3.6.1.4.1.2011.5.25.147.0.54"] = [
    name: "hwOspfv3Srv6PortLcsInactive",
    fields: ["hwOspfv3ProcessId", "hwOspfv3IfName", "hwOspfv3IfCount"],
    fieldOids: ["hwOspfv3ProcessId": "1.3.6.1.4.1.2011.5.25.147.1.12.7", "hwOspfv3IfName": "1.3.6.1.4.1.2011.5.25.147.1.12.4", "hwOspfv3IfCount": "1.3.6.1.4.1.2011.5.25.147.1.12.40"]
]

// --- hwOspfv3Srv6PortLcsInactiveClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.147.0.55
// Fields: hwOspfv3ProcessId, hwOspfv3IfName, hwOspfv3IfCount
// Description: The alarm indicating that no SRv6 license authorization was available was cleared.
trapMap["1.3.6.1.4.1.2011.5.25.147.0.55"] = [
    name: "hwOspfv3Srv6PortLcsInactiveClear",
    fields: ["hwOspfv3ProcessId", "hwOspfv3IfName", "hwOspfv3IfCount"],
    fieldOids: ["hwOspfv3ProcessId": "1.3.6.1.4.1.2011.5.25.147.1.12.7", "hwOspfv3IfName": "1.3.6.1.4.1.2011.5.25.147.1.12.4", "hwOspfv3IfCount": "1.3.6.1.4.1.2011.5.25.147.1.12.40"]
]

// ===== Parsing logic =====

// Set to true to enable diagnostic logging for this MIB parser
DEBUG = false

LOG_PREFIX = "[HUAWEI-OSPFV3-MIB]"
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
