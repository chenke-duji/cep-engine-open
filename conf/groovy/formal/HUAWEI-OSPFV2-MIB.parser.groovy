/**
 * Auto-generated from HUAWEI-OSPFV2-MIB.mib
 * Generated: 2026-08-24T18:28:30.562796
 * Traps/Notifications (51): hwOspfV2NeighborUnavailable, hwOspfV2NeighborUnavailableClear, hwOspfv2IntraAreaRouteridConflict, hwOspfv2IntraAreaDRIpAddressConflict, hwOspfv2IntraAreaRouterIdConflictRecovered, hwOspfv2PeerFlappingSuppressStatusChange, hwOspfv2ImportAseRouteThreshold, hwOspfv2ImportAseRouteThresholdClear, hwOspfv2ImportAseRouteExceed, hwOspfv2ImportAseRouteExceedClear, hwOspfv2ImportNssaRouteThreshold, hwOspfv2ImportNssaRouteThresholdClear, hwOspfv2ImportNssaRouteExceed, hwOspfv2ImportNssaRouteExceedClear, hwOspfv2LsdbApproachingOverflow, hwOspfv2LsdbApproachingOverflowClear, hwOspfv2LsdbOverflow, hwOspfv2LsdbOverflowClear, hwOspfv2GreaterAgeLsaRecived, hwOspfv2DeleteRouteByPurge, hwOspfv2DeleteRouteByPurgeClear, hwOspfv2RouteBeDeletedByPurgeExact, hwOspfv2RouteBeDeletedByPurgeExactClear, hwOspfv2RouteBeDeletedByPurgeInexact, hwOspfv2RouteBeDeletedByPurgeInexactClear, hwOspfv2RouteBeDeletedByPurge, hwOspfv2RouteBeDeletedByPurgeClear, hwOspfv2ThirdPartRouteBeDeletedByPurgeExact, hwOspfv2ThirdPartRouteBeDeletedByPurgeExactClear, hwOspfv2ThirdPartRouteBeDeletedByPurgeInexact, hwOspfv2ThirdPartRouteBeDeletedByPurgeInexactClear, hwOspfv2ThirdPartRouteBeDeletedByPurge, hwOspfv2ThirdPartRouteBeDeletedByPurgeClear, hwOspfv2AuthModeInsecure, hwOspfv2AuthModeInsecureClear, hwOspfv2RouteLoopDetected, hwOspfv2RouteLoopDetectedClear, hwOspfv2LinkCostAdjustment, hwOspfv2LinkCostAdjustmentClear, hwOspfPrefixSidConflict, hwOspfPrefixSidConflictClear, hwOspfv2NbrExceedThreshold, hwOspfv2NbrExceedThresholdClear, hwOspfv2LsaRetranExceedLimit, hwOspfv2LsaRetranExceedLimitClear, hwOspfv2RecvLsaExceedThreshold, hwOspfv2RecvLsaExceedThresholdClear, hwOspfv2IPConflict, hwOspfv2IPConflictClear, hwOspfv2SrMplsPortLcsInactive, hwOspfv2SrMplsPortLcsInactiveClear
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

// --- hwOspfV2NeighborUnavailable (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.155.31.1
// Fields: ospfRouterId, ospfNbrIpAddr, ospfNbrAddressLessIndex, ospfNbrRtrId, hwOspfv2SelfIfName, hwOspfv2VpnName, hwOspfv2NbrChgReason
// Description: These objects are used to monitor/manage changed OSPF neighbor alarm parameters.
trapMap["1.3.6.1.4.1.2011.5.25.155.31.1"] = [
    name: "hwOspfV2NeighborUnavailable",
    fields: ["ospfRouterId", "ospfNbrIpAddr", "ospfNbrAddressLessIndex", "ospfNbrRtrId", "hwOspfv2SelfIfName", "hwOspfv2VpnName", "hwOspfv2NbrChgReason"],
    fieldOids: ["ospfRouterId": "1.3.6.1.2.1.14.1.1", "ospfNbrIpAddr": "1.3.6.1.2.1.14.10.1.1", "ospfNbrAddressLessIndex": "1.3.6.1.2.1.14.10.1.2", "ospfNbrRtrId": "1.3.6.1.2.1.14.10.1.3", "hwOspfv2SelfIfName": "1.3.6.1.4.1.2011.5.25.155.6.1.5", "hwOspfv2VpnName": "1.3.6.1.4.1.2011.5.25.155.3.1.2", "hwOspfv2NbrChgReason": "1.3.6.1.4.1.2011.5.25.155.30.1"]
]

// --- hwOspfV2NeighborUnavailableClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.155.31.2
// Fields: ospfRouterId, ospfNbrIpAddr, ospfNbrAddressLessIndex, ospfNbrRtrId, hwOspfv2SelfIfName, hwOspfv2VpnName, hwOspfv2NbrChgReason
// Description: These objects are used to monitor/manage changed OSPF neighbor clear alarm parameters.
trapMap["1.3.6.1.4.1.2011.5.25.155.31.2"] = [
    name: "hwOspfV2NeighborUnavailableClear",
    fields: ["ospfRouterId", "ospfNbrIpAddr", "ospfNbrAddressLessIndex", "ospfNbrRtrId", "hwOspfv2SelfIfName", "hwOspfv2VpnName", "hwOspfv2NbrChgReason"],
    fieldOids: ["ospfRouterId": "1.3.6.1.2.1.14.1.1", "ospfNbrIpAddr": "1.3.6.1.2.1.14.10.1.1", "ospfNbrAddressLessIndex": "1.3.6.1.2.1.14.10.1.2", "ospfNbrRtrId": "1.3.6.1.2.1.14.10.1.3", "hwOspfv2SelfIfName": "1.3.6.1.4.1.2011.5.25.155.6.1.5", "hwOspfv2VpnName": "1.3.6.1.4.1.2011.5.25.155.3.1.2", "hwOspfv2NbrChgReason": "1.3.6.1.4.1.2011.5.25.155.30.1"]
]

// --- hwOspfv2IntraAreaRouteridConflict (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.155.31.3
// Fields: hwOspfv2SelfRouterId, hwOspfv2NbrRouterId
// Description: The object is used to monitor router ID conflict in an intra area.
trapMap["1.3.6.1.4.1.2011.5.25.155.31.3"] = [
    name: "hwOspfv2IntraAreaRouteridConflict",
    fields: ["hwOspfv2SelfRouterId", "hwOspfv2NbrRouterId"],
    fieldOids: ["hwOspfv2SelfRouterId": "1.3.6.1.4.1.2011.5.25.155.6.1.3", "hwOspfv2NbrRouterId": "1.3.6.1.4.1.2011.5.25.155.6.1.9"]
]

// --- hwOspfv2IntraAreaDRIpAddressConflict (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.155.31.4
// Fields: hwOspfv2SelfRouterId, hwOspfv2SelfIfIpAddress, hwOspfv2SelfIfName, ospfLsdbLsid, ospfLsdbRouterId
// Description: The object is used to monitor conflicted IP addresses of DRs in an intra area.
trapMap["1.3.6.1.4.1.2011.5.25.155.31.4"] = [
    name: "hwOspfv2IntraAreaDRIpAddressConflict",
    fields: ["hwOspfv2SelfRouterId", "hwOspfv2SelfIfIpAddress", "hwOspfv2SelfIfName", "ospfLsdbLsid", "ospfLsdbRouterId"],
    fieldOids: ["hwOspfv2SelfRouterId": "1.3.6.1.4.1.2011.5.25.155.6.1.3", "hwOspfv2SelfIfIpAddress": "1.3.6.1.4.1.2011.5.25.155.6.1.4", "hwOspfv2SelfIfName": "1.3.6.1.4.1.2011.5.25.155.6.1.5", "ospfLsdbLsid": "1.3.6.1.2.1.14.4.1.3", "ospfLsdbRouterId": "1.3.6.1.2.1.14.4.1.4"]
]

// --- hwOspfv2IntraAreaRouterIdConflictRecovered (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.155.31.5
// Fields: hwOspfv2ProcessIdIndex, hwOspfv2AreaId, ospfRouterId, hwOspfv2NewRouterId
// Description: The object is used to monitor router ID conflict recovery in an intra area.
trapMap["1.3.6.1.4.1.2011.5.25.155.31.5"] = [
    name: "hwOspfv2IntraAreaRouterIdConflictRecovered",
    fields: ["hwOspfv2ProcessIdIndex", "hwOspfv2AreaId", "ospfRouterId", "hwOspfv2NewRouterId"],
    fieldOids: ["hwOspfv2ProcessIdIndex": "1.3.6.1.4.1.2011.5.25.155.3.1.1", "hwOspfv2AreaId": "1.3.6.1.4.1.2011.5.25.155.30.3", "ospfRouterId": "1.3.6.1.2.1.14.1.1", "hwOspfv2NewRouterId": "1.3.6.1.4.1.2011.5.25.155.30.4"]
]

// --- hwOspfv2PeerFlappingSuppressStatusChange (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.155.31.6
// Fields: hwOspfv2ProcessIdIndex, hwOspfv2AreaId, hwOspfv2InterfaceName, hwOspfv2PeerFlappingSuppressStatus, hwOspfv2PeerFlappingSuppressReason, hwOspfv2InterfaceIp
// Description: The object is used to monitor the peer flapping-suppress status of interface in ospfv2.
trapMap["1.3.6.1.4.1.2011.5.25.155.31.6"] = [
    name: "hwOspfv2PeerFlappingSuppressStatusChange",
    fields: ["hwOspfv2ProcessIdIndex", "hwOspfv2AreaId", "hwOspfv2InterfaceName", "hwOspfv2PeerFlappingSuppressStatus", "hwOspfv2PeerFlappingSuppressReason", "hwOspfv2InterfaceIp"],
    fieldOids: ["hwOspfv2ProcessIdIndex": "1.3.6.1.4.1.2011.5.25.155.3.1.1", "hwOspfv2AreaId": "1.3.6.1.4.1.2011.5.25.155.30.3", "hwOspfv2InterfaceName": "1.3.6.1.4.1.2011.5.25.155.7.1.2", "hwOspfv2PeerFlappingSuppressStatus": "1.3.6.1.4.1.2011.5.25.155.30.5", "hwOspfv2PeerFlappingSuppressReason": "1.3.6.1.4.1.2011.5.25.155.30.6", "hwOspfv2InterfaceIp": "1.3.6.1.4.1.2011.5.25.155.30.47"]
]

// --- hwOspfv2ImportAseRouteThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.155.31.7
// Fields: hwOspfv2ProcessIdIndex
// Description: This object indicates that the number of AS-external LSAs generated when an OSPF process imports external routes exceeds the configured alarm threshold.
trapMap["1.3.6.1.4.1.2011.5.25.155.31.7"] = [
    name: "hwOspfv2ImportAseRouteThreshold",
    fields: ["hwOspfv2ProcessIdIndex"],
    fieldOids: ["hwOspfv2ProcessIdIndex": "1.3.6.1.4.1.2011.5.25.155.3.1.1"]
]

// --- hwOspfv2ImportAseRouteThresholdClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.155.31.8
// Fields: hwOspfv2ProcessIdIndex
// Description: This object indicates that the number of AS-external LSAs generated when an OSPF process imports external routes has been less than the configured alarm threshold.
trapMap["1.3.6.1.4.1.2011.5.25.155.31.8"] = [
    name: "hwOspfv2ImportAseRouteThresholdClear",
    fields: ["hwOspfv2ProcessIdIndex"],
    fieldOids: ["hwOspfv2ProcessIdIndex": "1.3.6.1.4.1.2011.5.25.155.3.1.1"]
]

// --- hwOspfv2ImportAseRouteExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.155.31.9
// Fields: hwOspfv2ProcessIdIndex
// Description: This object indicates that the number of AS-external LSAs generated when an OSPF process imports external routes exceeds the configured maximum number.
trapMap["1.3.6.1.4.1.2011.5.25.155.31.9"] = [
    name: "hwOspfv2ImportAseRouteExceed",
    fields: ["hwOspfv2ProcessIdIndex"],
    fieldOids: ["hwOspfv2ProcessIdIndex": "1.3.6.1.4.1.2011.5.25.155.3.1.1"]
]

// --- hwOspfv2ImportAseRouteExceedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.155.31.10
// Fields: hwOspfv2ProcessIdIndex
// Description: This object indicates that the number of AS-external LSAs generated when an OSPF process imports external routes has been less than the configured maximum number.
trapMap["1.3.6.1.4.1.2011.5.25.155.31.10"] = [
    name: "hwOspfv2ImportAseRouteExceedClear",
    fields: ["hwOspfv2ProcessIdIndex"],
    fieldOids: ["hwOspfv2ProcessIdIndex": "1.3.6.1.4.1.2011.5.25.155.3.1.1"]
]

// --- hwOspfv2ImportNssaRouteThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.155.31.11
// Fields: hwOspfv2ProcessIdIndex, hwOspfv2AreaId
// Description: This object indicates that the number of NSSA LSAs generated when an OSPF process imports external routes exceeds the configured alarm threshold.
trapMap["1.3.6.1.4.1.2011.5.25.155.31.11"] = [
    name: "hwOspfv2ImportNssaRouteThreshold",
    fields: ["hwOspfv2ProcessIdIndex", "hwOspfv2AreaId"],
    fieldOids: ["hwOspfv2ProcessIdIndex": "1.3.6.1.4.1.2011.5.25.155.3.1.1", "hwOspfv2AreaId": "1.3.6.1.4.1.2011.5.25.155.30.3"]
]

// --- hwOspfv2ImportNssaRouteThresholdClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.155.31.12
// Fields: hwOspfv2ProcessIdIndex, hwOspfv2AreaId
// Description: This object indicates that the number of NSSA LSAs generated when an OSPF process imports external routes has been less than the configured alarm threshold.
trapMap["1.3.6.1.4.1.2011.5.25.155.31.12"] = [
    name: "hwOspfv2ImportNssaRouteThresholdClear",
    fields: ["hwOspfv2ProcessIdIndex", "hwOspfv2AreaId"],
    fieldOids: ["hwOspfv2ProcessIdIndex": "1.3.6.1.4.1.2011.5.25.155.3.1.1", "hwOspfv2AreaId": "1.3.6.1.4.1.2011.5.25.155.30.3"]
]

// --- hwOspfv2ImportNssaRouteExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.155.31.13
// Fields: hwOspfv2ProcessIdIndex, hwOspfv2AreaId
// Description: This object indicates that the number of NSSA LSAs generated when an OSPF process imports external routes falls below the lower threshold.
trapMap["1.3.6.1.4.1.2011.5.25.155.31.13"] = [
    name: "hwOspfv2ImportNssaRouteExceed",
    fields: ["hwOspfv2ProcessIdIndex", "hwOspfv2AreaId"],
    fieldOids: ["hwOspfv2ProcessIdIndex": "1.3.6.1.4.1.2011.5.25.155.3.1.1", "hwOspfv2AreaId": "1.3.6.1.4.1.2011.5.25.155.30.3"]
]

// --- hwOspfv2ImportNssaRouteExceedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.155.31.14
// Fields: hwOspfv2ProcessIdIndex, hwOspfv2AreaId
// Description: This object indicates that the number of NSSA LSAs generated when an OSPF process imports external routes reaches or exceeds the configured maximum number.
trapMap["1.3.6.1.4.1.2011.5.25.155.31.14"] = [
    name: "hwOspfv2ImportNssaRouteExceedClear",
    fields: ["hwOspfv2ProcessIdIndex", "hwOspfv2AreaId"],
    fieldOids: ["hwOspfv2ProcessIdIndex": "1.3.6.1.4.1.2011.5.25.155.3.1.1", "hwOspfv2AreaId": "1.3.6.1.4.1.2011.5.25.155.30.3"]
]

// --- hwOspfv2LsdbApproachingOverflow (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.155.31.15
// Fields: hwOspfv2ProcessIdIndex
// Description: This object indicates that the number of NSSA LSAs generated when an OSPF process imports external routes falls below the configured maximum number.
trapMap["1.3.6.1.4.1.2011.5.25.155.31.15"] = [
    name: "hwOspfv2LsdbApproachingOverflow",
    fields: ["hwOspfv2ProcessIdIndex"],
    fieldOids: ["hwOspfv2ProcessIdIndex": "1.3.6.1.4.1.2011.5.25.155.3.1.1"]
]

// --- hwOspfv2LsdbApproachingOverflowClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.155.31.16
// Fields: hwOspfv2ProcessIdIndex
// Description: This object indicates that the number of AS-external LSAs in the LSDB of an OSPF process is approaching the configured maximum number.
trapMap["1.3.6.1.4.1.2011.5.25.155.31.16"] = [
    name: "hwOspfv2LsdbApproachingOverflowClear",
    fields: ["hwOspfv2ProcessIdIndex"],
    fieldOids: ["hwOspfv2ProcessIdIndex": "1.3.6.1.4.1.2011.5.25.155.3.1.1"]
]

// --- hwOspfv2LsdbOverflow (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.155.31.17
// Fields: hwOspfv2ProcessIdIndex
// Description: This object indicates that the number of AS-external LSAs in the LSDB of an OSPF process falls far below the configured maximum number.
trapMap["1.3.6.1.4.1.2011.5.25.155.31.17"] = [
    name: "hwOspfv2LsdbOverflow",
    fields: ["hwOspfv2ProcessIdIndex"],
    fieldOids: ["hwOspfv2ProcessIdIndex": "1.3.6.1.4.1.2011.5.25.155.3.1.1"]
]

// --- hwOspfv2LsdbOverflowClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.155.31.18
// Fields: hwOspfv2ProcessIdIndex
// Description: This object indicates that the number of AS-external LSAs in the LSDB of an OSPF process has reached the configured maximum number.
trapMap["1.3.6.1.4.1.2011.5.25.155.31.18"] = [
    name: "hwOspfv2LsdbOverflowClear",
    fields: ["hwOspfv2ProcessIdIndex"],
    fieldOids: ["hwOspfv2ProcessIdIndex": "1.3.6.1.4.1.2011.5.25.155.3.1.1"]
]

// --- hwOspfv2GreaterAgeLsaRecived (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.155.31.19
// Fields: hwOspfv2ProcessIdIndex, hwOspfv2NbrRouterId, hwOspfv2SelfIfName, hwOspfv2LsaId, hwOspfv2LsaAge
// Description: The object is used to monitor the router receive a greater age lsa in ospfv2.
trapMap["1.3.6.1.4.1.2011.5.25.155.31.19"] = [
    name: "hwOspfv2GreaterAgeLsaRecived",
    fields: ["hwOspfv2ProcessIdIndex", "hwOspfv2NbrRouterId", "hwOspfv2SelfIfName", "hwOspfv2LsaId", "hwOspfv2LsaAge"],
    fieldOids: ["hwOspfv2ProcessIdIndex": "1.3.6.1.4.1.2011.5.25.155.3.1.1", "hwOspfv2NbrRouterId": "1.3.6.1.4.1.2011.5.25.155.6.1.9", "hwOspfv2SelfIfName": "1.3.6.1.4.1.2011.5.25.155.6.1.5", "hwOspfv2LsaId": "1.3.6.1.4.1.2011.5.25.155.30.7", "hwOspfv2LsaAge": "1.3.6.1.4.1.2011.5.25.155.30.8"]
]

// --- hwOspfv2DeleteRouteByPurge (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.155.31.20
// Fields: hwOspfv2ProcessIdIndex, hwOspfv2PurgeHostName, hwOspfv2PurgeIpAddress, hwOspfv2PurgeRouterId, hwOspfv2AreaId, hwOspfv2FlushLsaNum, hwOspfv2AffectedNodeNum, hwOspfv2TotalNodeNum, hwOspfv2PurgeStatPeriod
// Description: This object indicates that the local device deleted OSPF routes advertised by other devices. Reset or isolate the device from the network.
trapMap["1.3.6.1.4.1.2011.5.25.155.31.20"] = [
    name: "hwOspfv2DeleteRouteByPurge",
    fields: ["hwOspfv2ProcessIdIndex", "hwOspfv2PurgeHostName", "hwOspfv2PurgeIpAddress", "hwOspfv2PurgeRouterId", "hwOspfv2AreaId", "hwOspfv2FlushLsaNum", "hwOspfv2AffectedNodeNum", "hwOspfv2TotalNodeNum", "hwOspfv2PurgeStatPeriod"],
    fieldOids: ["hwOspfv2ProcessIdIndex": "1.3.6.1.4.1.2011.5.25.155.3.1.1", "hwOspfv2PurgeHostName": "1.3.6.1.4.1.2011.5.25.155.30.9", "hwOspfv2PurgeIpAddress": "1.3.6.1.4.1.2011.5.25.155.30.10", "hwOspfv2PurgeRouterId": "1.3.6.1.4.1.2011.5.25.155.30.11", "hwOspfv2AreaId": "1.3.6.1.4.1.2011.5.25.155.30.3", "hwOspfv2FlushLsaNum": "1.3.6.1.4.1.2011.5.25.155.30.12", "hwOspfv2AffectedNodeNum": "1.3.6.1.4.1.2011.5.25.155.30.13", "hwOspfv2TotalNodeNum": "1.3.6.1.4.1.2011.5.25.155.30.14", "hwOspfv2PurgeStatPeriod": "1.3.6.1.4.1.2011.5.25.155.30.15"]
]

// --- hwOspfv2DeleteRouteByPurgeClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.155.31.21
// Fields: hwOspfv2ProcessIdIndex, hwOspfv2PurgeHostName, hwOspfv2PurgeIpAddress, hwOspfv2PurgeRouterId, hwOspfv2AreaId
// Description: This object indicates that the local device did not delete OSPF routes advertised by other devices.
trapMap["1.3.6.1.4.1.2011.5.25.155.31.21"] = [
    name: "hwOspfv2DeleteRouteByPurgeClear",
    fields: ["hwOspfv2ProcessIdIndex", "hwOspfv2PurgeHostName", "hwOspfv2PurgeIpAddress", "hwOspfv2PurgeRouterId", "hwOspfv2AreaId"],
    fieldOids: ["hwOspfv2ProcessIdIndex": "1.3.6.1.4.1.2011.5.25.155.3.1.1", "hwOspfv2PurgeHostName": "1.3.6.1.4.1.2011.5.25.155.30.9", "hwOspfv2PurgeIpAddress": "1.3.6.1.4.1.2011.5.25.155.30.10", "hwOspfv2PurgeRouterId": "1.3.6.1.4.1.2011.5.25.155.30.11", "hwOspfv2AreaId": "1.3.6.1.4.1.2011.5.25.155.30.3"]
]

// --- hwOspfv2RouteBeDeletedByPurgeExact (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.155.31.22
// Fields: hwOspfv2ProcessIdIndex, hwOspfv2PurgeHostName, hwOspfv2PurgeIpAddress, hwOspfv2PurgeRouterId, hwOspfv2AreaId, hwOspfv2FlushLsaNum, hwOspfv2AffectedNodeNum, hwOspfv2TotalNodeNum, hwOspfv2PurgeStatPeriod
// Description: This object indicates that OSPF routes advertised by the local device were deleted by another device. Reset or isolate the faulty device from the network.
trapMap["1.3.6.1.4.1.2011.5.25.155.31.22"] = [
    name: "hwOspfv2RouteBeDeletedByPurgeExact",
    fields: ["hwOspfv2ProcessIdIndex", "hwOspfv2PurgeHostName", "hwOspfv2PurgeIpAddress", "hwOspfv2PurgeRouterId", "hwOspfv2AreaId", "hwOspfv2FlushLsaNum", "hwOspfv2AffectedNodeNum", "hwOspfv2TotalNodeNum", "hwOspfv2PurgeStatPeriod"],
    fieldOids: ["hwOspfv2ProcessIdIndex": "1.3.6.1.4.1.2011.5.25.155.3.1.1", "hwOspfv2PurgeHostName": "1.3.6.1.4.1.2011.5.25.155.30.9", "hwOspfv2PurgeIpAddress": "1.3.6.1.4.1.2011.5.25.155.30.10", "hwOspfv2PurgeRouterId": "1.3.6.1.4.1.2011.5.25.155.30.11", "hwOspfv2AreaId": "1.3.6.1.4.1.2011.5.25.155.30.3", "hwOspfv2FlushLsaNum": "1.3.6.1.4.1.2011.5.25.155.30.12", "hwOspfv2AffectedNodeNum": "1.3.6.1.4.1.2011.5.25.155.30.13", "hwOspfv2TotalNodeNum": "1.3.6.1.4.1.2011.5.25.155.30.14", "hwOspfv2PurgeStatPeriod": "1.3.6.1.4.1.2011.5.25.155.30.15"]
]

// --- hwOspfv2RouteBeDeletedByPurgeExactClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.155.31.23
// Fields: hwOspfv2ProcessIdIndex, hwOspfv2PurgeHostName, hwOspfv2PurgeIpAddress, hwOspfv2PurgeRouterId, hwOspfv2AreaId
// Description: This object indicates that OSPF routes advertised by the local device were not deleted by another device.
trapMap["1.3.6.1.4.1.2011.5.25.155.31.23"] = [
    name: "hwOspfv2RouteBeDeletedByPurgeExactClear",
    fields: ["hwOspfv2ProcessIdIndex", "hwOspfv2PurgeHostName", "hwOspfv2PurgeIpAddress", "hwOspfv2PurgeRouterId", "hwOspfv2AreaId"],
    fieldOids: ["hwOspfv2ProcessIdIndex": "1.3.6.1.4.1.2011.5.25.155.3.1.1", "hwOspfv2PurgeHostName": "1.3.6.1.4.1.2011.5.25.155.30.9", "hwOspfv2PurgeIpAddress": "1.3.6.1.4.1.2011.5.25.155.30.10", "hwOspfv2PurgeRouterId": "1.3.6.1.4.1.2011.5.25.155.30.11", "hwOspfv2AreaId": "1.3.6.1.4.1.2011.5.25.155.30.3"]
]

// --- hwOspfv2RouteBeDeletedByPurgeInexact (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.155.31.24
// Fields: hwOspfv2ProcessIdIndex, hwOspfv2PurgeHostName, hwOspfv2PurgeIpAddress, hwOspfv2PurgeRouterId, hwOspfv2AreaId, hwOspfv2FlushLsaNum, hwOspfv2AffectedNodeNum, hwOspfv2TotalNodeNum, hwOspfv2RuledOutDeviceNum, hwOspfv2PurgeStatPeriod
// Description: This object indicates that OSPF routes advertised by the local device were deleted by another device, and the possibly faulty device did not support OSPF flush LSA source trace. Log in to the possibly...
trapMap["1.3.6.1.4.1.2011.5.25.155.31.24"] = [
    name: "hwOspfv2RouteBeDeletedByPurgeInexact",
    fields: ["hwOspfv2ProcessIdIndex", "hwOspfv2PurgeHostName", "hwOspfv2PurgeIpAddress", "hwOspfv2PurgeRouterId", "hwOspfv2AreaId", "hwOspfv2FlushLsaNum", "hwOspfv2AffectedNodeNum", "hwOspfv2TotalNodeNum", "hwOspfv2RuledOutDeviceNum", "hwOspfv2PurgeStatPeriod"],
    fieldOids: ["hwOspfv2ProcessIdIndex": "1.3.6.1.4.1.2011.5.25.155.3.1.1", "hwOspfv2PurgeHostName": "1.3.6.1.4.1.2011.5.25.155.30.9", "hwOspfv2PurgeIpAddress": "1.3.6.1.4.1.2011.5.25.155.30.10", "hwOspfv2PurgeRouterId": "1.3.6.1.4.1.2011.5.25.155.30.11", "hwOspfv2AreaId": "1.3.6.1.4.1.2011.5.25.155.30.3", "hwOspfv2FlushLsaNum": "1.3.6.1.4.1.2011.5.25.155.30.12", "hwOspfv2AffectedNodeNum": "1.3.6.1.4.1.2011.5.25.155.30.13", "hwOspfv2TotalNodeNum": "1.3.6.1.4.1.2011.5.25.155.30.14", "hwOspfv2RuledOutDeviceNum": "1.3.6.1.4.1.2011.5.25.155.30.16", "hwOspfv2PurgeStatPeriod": "1.3.6.1.4.1.2011.5.25.155.30.15"]
]

// --- hwOspfv2RouteBeDeletedByPurgeInexactClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.155.31.25
// Fields: hwOspfv2ProcessIdIndex, hwOspfv2PurgeHostName, hwOspfv2PurgeIpAddress, hwOspfv2PurgeRouterId, hwOspfv2AreaId
// Description: This object indicates that OSPF routes advertised by the local device were not deleted by another device.
trapMap["1.3.6.1.4.1.2011.5.25.155.31.25"] = [
    name: "hwOspfv2RouteBeDeletedByPurgeInexactClear",
    fields: ["hwOspfv2ProcessIdIndex", "hwOspfv2PurgeHostName", "hwOspfv2PurgeIpAddress", "hwOspfv2PurgeRouterId", "hwOspfv2AreaId"],
    fieldOids: ["hwOspfv2ProcessIdIndex": "1.3.6.1.4.1.2011.5.25.155.3.1.1", "hwOspfv2PurgeHostName": "1.3.6.1.4.1.2011.5.25.155.30.9", "hwOspfv2PurgeIpAddress": "1.3.6.1.4.1.2011.5.25.155.30.10", "hwOspfv2PurgeRouterId": "1.3.6.1.4.1.2011.5.25.155.30.11", "hwOspfv2AreaId": "1.3.6.1.4.1.2011.5.25.155.30.3"]
]

// --- hwOspfv2RouteBeDeletedByPurge (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.155.31.26
// Fields: hwOspfv2ProcessIdIndex, hwOspfv2PurgeHostName, hwOspfv2PurgeIpAddress, hwOspfv2PurgeRouterId, hwOspfv2AreaId, hwOspfv2TotalNodeNum, hwOspfv2PurgeHostName1, hwOspfv2PurgeIpAddress1, hwOspfv2PurgeRouterId1, hwOspfv2PurgeHostName2, hwOspfv2PurgeIpAddress2, hwOspfv2PurgeRouterId2, hwOspfv2PurgeHostName3, hwOspfv2PurgeIpAddress3, hwOspfv2PurgeRouterId3
// Description: This object indicates that OSPF routes advertised by the local device were deleted by another device. Log in to the possibly faulty device. If the device is deleting routes, reset or isolate it from t...
trapMap["1.3.6.1.4.1.2011.5.25.155.31.26"] = [
    name: "hwOspfv2RouteBeDeletedByPurge",
    fields: ["hwOspfv2ProcessIdIndex", "hwOspfv2PurgeHostName", "hwOspfv2PurgeIpAddress", "hwOspfv2PurgeRouterId", "hwOspfv2AreaId", "hwOspfv2TotalNodeNum", "hwOspfv2PurgeHostName1", "hwOspfv2PurgeIpAddress1", "hwOspfv2PurgeRouterId1", "hwOspfv2PurgeHostName2", "hwOspfv2PurgeIpAddress2", "hwOspfv2PurgeRouterId2", "hwOspfv2PurgeHostName3", "hwOspfv2PurgeIpAddress3", "hwOspfv2PurgeRouterId3"],
    fieldOids: ["hwOspfv2ProcessIdIndex": "1.3.6.1.4.1.2011.5.25.155.3.1.1", "hwOspfv2PurgeHostName": "1.3.6.1.4.1.2011.5.25.155.30.9", "hwOspfv2PurgeIpAddress": "1.3.6.1.4.1.2011.5.25.155.30.10", "hwOspfv2PurgeRouterId": "1.3.6.1.4.1.2011.5.25.155.30.11", "hwOspfv2AreaId": "1.3.6.1.4.1.2011.5.25.155.30.3", "hwOspfv2TotalNodeNum": "1.3.6.1.4.1.2011.5.25.155.30.14", "hwOspfv2PurgeHostName1": "1.3.6.1.4.1.2011.5.25.155.30.17", "hwOspfv2PurgeIpAddress1": "1.3.6.1.4.1.2011.5.25.155.30.20", "hwOspfv2PurgeRouterId1": "1.3.6.1.4.1.2011.5.25.155.30.23", "hwOspfv2PurgeHostName2": "1.3.6.1.4.1.2011.5.25.155.30.18", "hwOspfv2PurgeIpAddress2": "1.3.6.1.4.1.2011.5.25.155.30.21", "hwOspfv2PurgeRouterId2": "1.3.6.1.4.1.2011.5.25.155.30.24", "hwOspfv2PurgeHostName3": "1.3.6.1.4.1.2011.5.25.155.30.19", "hwOspfv2PurgeIpAddress3": "1.3.6.1.4.1.2011.5.25.155.30.22", "hwOspfv2PurgeRouterId3": "1.3.6.1.4.1.2011.5.25.155.30.25"]
]

// --- hwOspfv2RouteBeDeletedByPurgeClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.155.31.27
// Fields: hwOspfv2ProcessIdIndex, hwOspfv2PurgeHostName, hwOspfv2PurgeIpAddress, hwOspfv2PurgeRouterId, hwOspfv2AreaId
// Description: This object indicates that OSPF routes advertised by the local device were not deleted by another device.
trapMap["1.3.6.1.4.1.2011.5.25.155.31.27"] = [
    name: "hwOspfv2RouteBeDeletedByPurgeClear",
    fields: ["hwOspfv2ProcessIdIndex", "hwOspfv2PurgeHostName", "hwOspfv2PurgeIpAddress", "hwOspfv2PurgeRouterId", "hwOspfv2AreaId"],
    fieldOids: ["hwOspfv2ProcessIdIndex": "1.3.6.1.4.1.2011.5.25.155.3.1.1", "hwOspfv2PurgeHostName": "1.3.6.1.4.1.2011.5.25.155.30.9", "hwOspfv2PurgeIpAddress": "1.3.6.1.4.1.2011.5.25.155.30.10", "hwOspfv2PurgeRouterId": "1.3.6.1.4.1.2011.5.25.155.30.11", "hwOspfv2AreaId": "1.3.6.1.4.1.2011.5.25.155.30.3"]
]

// --- hwOspfv2ThirdPartRouteBeDeletedByPurgeExact (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.155.31.28
// Fields: hwOspfv2ProcessIdIndex, hwOspfv2PurgeHostName, hwOspfv2PurgeIpAddress, hwOspfv2PurgeRouterId, hwOspfv2AreaId, hwOspfv2FlushLsaNum, hwOspfv2AffectedNodeNum, hwOspfv2TotalNodeNum, hwOspfv2PurgeStatPeriod
// Description: This object indicates that OSPF routes advertised by another device were deleted. Reset or isolate the faulty device from the network.
trapMap["1.3.6.1.4.1.2011.5.25.155.31.28"] = [
    name: "hwOspfv2ThirdPartRouteBeDeletedByPurgeExact",
    fields: ["hwOspfv2ProcessIdIndex", "hwOspfv2PurgeHostName", "hwOspfv2PurgeIpAddress", "hwOspfv2PurgeRouterId", "hwOspfv2AreaId", "hwOspfv2FlushLsaNum", "hwOspfv2AffectedNodeNum", "hwOspfv2TotalNodeNum", "hwOspfv2PurgeStatPeriod"],
    fieldOids: ["hwOspfv2ProcessIdIndex": "1.3.6.1.4.1.2011.5.25.155.3.1.1", "hwOspfv2PurgeHostName": "1.3.6.1.4.1.2011.5.25.155.30.9", "hwOspfv2PurgeIpAddress": "1.3.6.1.4.1.2011.5.25.155.30.10", "hwOspfv2PurgeRouterId": "1.3.6.1.4.1.2011.5.25.155.30.11", "hwOspfv2AreaId": "1.3.6.1.4.1.2011.5.25.155.30.3", "hwOspfv2FlushLsaNum": "1.3.6.1.4.1.2011.5.25.155.30.12", "hwOspfv2AffectedNodeNum": "1.3.6.1.4.1.2011.5.25.155.30.13", "hwOspfv2TotalNodeNum": "1.3.6.1.4.1.2011.5.25.155.30.14", "hwOspfv2PurgeStatPeriod": "1.3.6.1.4.1.2011.5.25.155.30.15"]
]

// --- hwOspfv2ThirdPartRouteBeDeletedByPurgeExactClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.155.31.29
// Fields: hwOspfv2ProcessIdIndex, hwOspfv2PurgeHostName, hwOspfv2PurgeIpAddress, hwOspfv2PurgeRouterId, hwOspfv2AreaId
// Description: This object indicates that OSPF routes advertised by another device were not deleted.
trapMap["1.3.6.1.4.1.2011.5.25.155.31.29"] = [
    name: "hwOspfv2ThirdPartRouteBeDeletedByPurgeExactClear",
    fields: ["hwOspfv2ProcessIdIndex", "hwOspfv2PurgeHostName", "hwOspfv2PurgeIpAddress", "hwOspfv2PurgeRouterId", "hwOspfv2AreaId"],
    fieldOids: ["hwOspfv2ProcessIdIndex": "1.3.6.1.4.1.2011.5.25.155.3.1.1", "hwOspfv2PurgeHostName": "1.3.6.1.4.1.2011.5.25.155.30.9", "hwOspfv2PurgeIpAddress": "1.3.6.1.4.1.2011.5.25.155.30.10", "hwOspfv2PurgeRouterId": "1.3.6.1.4.1.2011.5.25.155.30.11", "hwOspfv2AreaId": "1.3.6.1.4.1.2011.5.25.155.30.3"]
]

// --- hwOspfv2ThirdPartRouteBeDeletedByPurgeInexact (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.155.31.30
// Fields: hwOspfv2ProcessIdIndex, hwOspfv2PurgeHostName, hwOspfv2PurgeIpAddress, hwOspfv2PurgeRouterId, hwOspfv2AreaId, hwOspfv2FlushLsaNum, hwOspfv2AffectedNodeNum, hwOspfv2TotalNodeNum, hwOspfv2RuledOutDeviceNum, hwOspfv2PurgeStatPeriod
// Description: This object indicates that OSPF routes advertised by another device were deleted, and the possibly faulty device did not support OSPF flush LSA source trace. Log in to the possibly faulty device. If t...
trapMap["1.3.6.1.4.1.2011.5.25.155.31.30"] = [
    name: "hwOspfv2ThirdPartRouteBeDeletedByPurgeInexact",
    fields: ["hwOspfv2ProcessIdIndex", "hwOspfv2PurgeHostName", "hwOspfv2PurgeIpAddress", "hwOspfv2PurgeRouterId", "hwOspfv2AreaId", "hwOspfv2FlushLsaNum", "hwOspfv2AffectedNodeNum", "hwOspfv2TotalNodeNum", "hwOspfv2RuledOutDeviceNum", "hwOspfv2PurgeStatPeriod"],
    fieldOids: ["hwOspfv2ProcessIdIndex": "1.3.6.1.4.1.2011.5.25.155.3.1.1", "hwOspfv2PurgeHostName": "1.3.6.1.4.1.2011.5.25.155.30.9", "hwOspfv2PurgeIpAddress": "1.3.6.1.4.1.2011.5.25.155.30.10", "hwOspfv2PurgeRouterId": "1.3.6.1.4.1.2011.5.25.155.30.11", "hwOspfv2AreaId": "1.3.6.1.4.1.2011.5.25.155.30.3", "hwOspfv2FlushLsaNum": "1.3.6.1.4.1.2011.5.25.155.30.12", "hwOspfv2AffectedNodeNum": "1.3.6.1.4.1.2011.5.25.155.30.13", "hwOspfv2TotalNodeNum": "1.3.6.1.4.1.2011.5.25.155.30.14", "hwOspfv2RuledOutDeviceNum": "1.3.6.1.4.1.2011.5.25.155.30.16", "hwOspfv2PurgeStatPeriod": "1.3.6.1.4.1.2011.5.25.155.30.15"]
]

// --- hwOspfv2ThirdPartRouteBeDeletedByPurgeInexactClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.155.31.31
// Fields: hwOspfv2ProcessIdIndex, hwOspfv2PurgeHostName, hwOspfv2PurgeIpAddress, hwOspfv2PurgeRouterId, hwOspfv2AreaId
// Description: This object indicates that OSPF routes advertised by another device were not deleted.
trapMap["1.3.6.1.4.1.2011.5.25.155.31.31"] = [
    name: "hwOspfv2ThirdPartRouteBeDeletedByPurgeInexactClear",
    fields: ["hwOspfv2ProcessIdIndex", "hwOspfv2PurgeHostName", "hwOspfv2PurgeIpAddress", "hwOspfv2PurgeRouterId", "hwOspfv2AreaId"],
    fieldOids: ["hwOspfv2ProcessIdIndex": "1.3.6.1.4.1.2011.5.25.155.3.1.1", "hwOspfv2PurgeHostName": "1.3.6.1.4.1.2011.5.25.155.30.9", "hwOspfv2PurgeIpAddress": "1.3.6.1.4.1.2011.5.25.155.30.10", "hwOspfv2PurgeRouterId": "1.3.6.1.4.1.2011.5.25.155.30.11", "hwOspfv2AreaId": "1.3.6.1.4.1.2011.5.25.155.30.3"]
]

// --- hwOspfv2ThirdPartRouteBeDeletedByPurge (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.155.31.32
// Fields: hwOspfv2ProcessIdIndex, hwOspfv2PurgeHostName, hwOspfv2PurgeIpAddress, hwOspfv2PurgeRouterId, hwOspfv2AreaId, hwOspfv2TotalNodeNum, hwOspfv2PurgeHostName1, hwOspfv2PurgeIpAddress1, hwOspfv2PurgeRouterId1, hwOspfv2PurgeHostName2, hwOspfv2PurgeIpAddress2, hwOspfv2PurgeRouterId2, hwOspfv2PurgeHostName3, hwOspfv2PurgeIpAddress3, hwOspfv2PurgeRouterId3
// Description: This object indicates that OSPF routes advertised by another device were deleted. Log in to the possibly faulty device. If the device is deleting routes, reset or isolate it from the network. Otherwis...
trapMap["1.3.6.1.4.1.2011.5.25.155.31.32"] = [
    name: "hwOspfv2ThirdPartRouteBeDeletedByPurge",
    fields: ["hwOspfv2ProcessIdIndex", "hwOspfv2PurgeHostName", "hwOspfv2PurgeIpAddress", "hwOspfv2PurgeRouterId", "hwOspfv2AreaId", "hwOspfv2TotalNodeNum", "hwOspfv2PurgeHostName1", "hwOspfv2PurgeIpAddress1", "hwOspfv2PurgeRouterId1", "hwOspfv2PurgeHostName2", "hwOspfv2PurgeIpAddress2", "hwOspfv2PurgeRouterId2", "hwOspfv2PurgeHostName3", "hwOspfv2PurgeIpAddress3", "hwOspfv2PurgeRouterId3"],
    fieldOids: ["hwOspfv2ProcessIdIndex": "1.3.6.1.4.1.2011.5.25.155.3.1.1", "hwOspfv2PurgeHostName": "1.3.6.1.4.1.2011.5.25.155.30.9", "hwOspfv2PurgeIpAddress": "1.3.6.1.4.1.2011.5.25.155.30.10", "hwOspfv2PurgeRouterId": "1.3.6.1.4.1.2011.5.25.155.30.11", "hwOspfv2AreaId": "1.3.6.1.4.1.2011.5.25.155.30.3", "hwOspfv2TotalNodeNum": "1.3.6.1.4.1.2011.5.25.155.30.14", "hwOspfv2PurgeHostName1": "1.3.6.1.4.1.2011.5.25.155.30.17", "hwOspfv2PurgeIpAddress1": "1.3.6.1.4.1.2011.5.25.155.30.20", "hwOspfv2PurgeRouterId1": "1.3.6.1.4.1.2011.5.25.155.30.23", "hwOspfv2PurgeHostName2": "1.3.6.1.4.1.2011.5.25.155.30.18", "hwOspfv2PurgeIpAddress2": "1.3.6.1.4.1.2011.5.25.155.30.21", "hwOspfv2PurgeRouterId2": "1.3.6.1.4.1.2011.5.25.155.30.24", "hwOspfv2PurgeHostName3": "1.3.6.1.4.1.2011.5.25.155.30.19", "hwOspfv2PurgeIpAddress3": "1.3.6.1.4.1.2011.5.25.155.30.22", "hwOspfv2PurgeRouterId3": "1.3.6.1.4.1.2011.5.25.155.30.25"]
]

// --- hwOspfv2ThirdPartRouteBeDeletedByPurgeClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.155.31.33
// Fields: hwOspfv2ProcessIdIndex, hwOspfv2PurgeHostName, hwOspfv2PurgeIpAddress, hwOspfv2PurgeRouterId, hwOspfv2AreaId
// Description: This object indicates that OSPF routes advertised by another device were not deleted.
trapMap["1.3.6.1.4.1.2011.5.25.155.31.33"] = [
    name: "hwOspfv2ThirdPartRouteBeDeletedByPurgeClear",
    fields: ["hwOspfv2ProcessIdIndex", "hwOspfv2PurgeHostName", "hwOspfv2PurgeIpAddress", "hwOspfv2PurgeRouterId", "hwOspfv2AreaId"],
    fieldOids: ["hwOspfv2ProcessIdIndex": "1.3.6.1.4.1.2011.5.25.155.3.1.1", "hwOspfv2PurgeHostName": "1.3.6.1.4.1.2011.5.25.155.30.9", "hwOspfv2PurgeIpAddress": "1.3.6.1.4.1.2011.5.25.155.30.10", "hwOspfv2PurgeRouterId": "1.3.6.1.4.1.2011.5.25.155.30.11", "hwOspfv2AreaId": "1.3.6.1.4.1.2011.5.25.155.30.3"]
]

// --- hwOspfv2AuthModeInsecure (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.155.31.34
// Fields: hwOspfv2InsecureAuthMode
// Description: This object indicates that an insecure authentication mode is configured for OSPF.
trapMap["1.3.6.1.4.1.2011.5.25.155.31.34"] = [
    name: "hwOspfv2AuthModeInsecure",
    fields: ["hwOspfv2InsecureAuthMode"],
    fieldOids: ["hwOspfv2InsecureAuthMode": "1.3.6.1.4.1.2011.5.25.155.30.26"]
]

// --- hwOspfv2AuthModeInsecureClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.155.31.35
// Fields: hwOspfv2InsecureAuthMode
// Description: This object indicates that the insecure authentication mode configured for OSPF is deleted.
trapMap["1.3.6.1.4.1.2011.5.25.155.31.35"] = [
    name: "hwOspfv2AuthModeInsecureClear",
    fields: ["hwOspfv2InsecureAuthMode"],
    fieldOids: ["hwOspfv2InsecureAuthMode": "1.3.6.1.4.1.2011.5.25.155.30.26"]
]

// --- hwOspfv2RouteLoopDetected (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.155.31.36
// Fields: hwOspfv2LoopDetectType, hwOspfv2LoopDetectProtocolAttr, hwOspfv2LoopDetectRedistributeID1, hwOspfv2LoopDetectRedistributeID2
// Description: This object indicates that a routing loop has been detected on the local device.
trapMap["1.3.6.1.4.1.2011.5.25.155.31.36"] = [
    name: "hwOspfv2RouteLoopDetected",
    fields: ["hwOspfv2LoopDetectType", "hwOspfv2LoopDetectProtocolAttr", "hwOspfv2LoopDetectRedistributeID1", "hwOspfv2LoopDetectRedistributeID2"],
    fieldOids: ["hwOspfv2LoopDetectType": "1.3.6.1.4.1.2011.5.25.155.30.27", "hwOspfv2LoopDetectProtocolAttr": "1.3.6.1.4.1.2011.5.25.155.30.28", "hwOspfv2LoopDetectRedistributeID1": "1.3.6.1.4.1.2011.5.25.155.30.29", "hwOspfv2LoopDetectRedistributeID2": "1.3.6.1.4.1.2011.5.25.155.30.30"]
]

// --- hwOspfv2RouteLoopDetectedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.155.31.37
// Fields: hwOspfv2LoopDetectType, hwOspfv2LoopDetectProtocolAttr, hwOspfv2LoopDetectRedistributeID1, hwOspfv2LoopDetectRedistributeID2
// Description: This object indicates that the routing loop is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.155.31.37"] = [
    name: "hwOspfv2RouteLoopDetectedClear",
    fields: ["hwOspfv2LoopDetectType", "hwOspfv2LoopDetectProtocolAttr", "hwOspfv2LoopDetectRedistributeID1", "hwOspfv2LoopDetectRedistributeID2"],
    fieldOids: ["hwOspfv2LoopDetectType": "1.3.6.1.4.1.2011.5.25.155.30.27", "hwOspfv2LoopDetectProtocolAttr": "1.3.6.1.4.1.2011.5.25.155.30.28", "hwOspfv2LoopDetectRedistributeID1": "1.3.6.1.4.1.2011.5.25.155.30.29", "hwOspfv2LoopDetectRedistributeID2": "1.3.6.1.4.1.2011.5.25.155.30.30"]
]

// --- hwOspfv2LinkCostAdjustment (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.155.31.38
// Fields: hwOspfv2ProcessIdIndex, hwOspfv2AreaIdIndex, hwOspfv2InterfaceIndex, hwOspfv2InterfaceName, hwOspfCostAdjustReason, hwOspfOriginalCost, hwOspfAdjustedCost
// Description: This object indicates that An OSPF link cost adjustment event occurs.
trapMap["1.3.6.1.4.1.2011.5.25.155.31.38"] = [
    name: "hwOspfv2LinkCostAdjustment",
    fields: ["hwOspfv2ProcessIdIndex", "hwOspfv2AreaIdIndex", "hwOspfv2InterfaceIndex", "hwOspfv2InterfaceName", "hwOspfCostAdjustReason", "hwOspfOriginalCost", "hwOspfAdjustedCost"],
    fieldOids: ["hwOspfv2ProcessIdIndex": "1.3.6.1.4.1.2011.5.25.155.3.1.1", "hwOspfv2AreaIdIndex": "1.3.6.1.4.1.2011.5.25.155.4.1.1", "hwOspfv2InterfaceIndex": "1.3.6.1.4.1.2011.5.25.155.7.1.1", "hwOspfv2InterfaceName": "1.3.6.1.4.1.2011.5.25.155.7.1.2", "hwOspfCostAdjustReason": "1.3.6.1.4.1.2011.5.25.155.30.31", "hwOspfOriginalCost": "1.3.6.1.4.1.2011.5.25.155.30.32", "hwOspfAdjustedCost": "1.3.6.1.4.1.2011.5.25.155.30.33"]
]

// --- hwOspfv2LinkCostAdjustmentClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.155.31.39
// Fields: hwOspfv2ProcessIdIndex, hwOspfv2AreaIdIndex, hwOspfv2InterfaceIndex, hwOspfv2InterfaceName, hwOspfCostAdjustReason, hwOspfOriginalCost, hwOspfAdjustedCost
// Description: This object indicates that An OSPF link cost adjustment event is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.155.31.39"] = [
    name: "hwOspfv2LinkCostAdjustmentClear",
    fields: ["hwOspfv2ProcessIdIndex", "hwOspfv2AreaIdIndex", "hwOspfv2InterfaceIndex", "hwOspfv2InterfaceName", "hwOspfCostAdjustReason", "hwOspfOriginalCost", "hwOspfAdjustedCost"],
    fieldOids: ["hwOspfv2ProcessIdIndex": "1.3.6.1.4.1.2011.5.25.155.3.1.1", "hwOspfv2AreaIdIndex": "1.3.6.1.4.1.2011.5.25.155.4.1.1", "hwOspfv2InterfaceIndex": "1.3.6.1.4.1.2011.5.25.155.7.1.1", "hwOspfv2InterfaceName": "1.3.6.1.4.1.2011.5.25.155.7.1.2", "hwOspfCostAdjustReason": "1.3.6.1.4.1.2011.5.25.155.30.31", "hwOspfOriginalCost": "1.3.6.1.4.1.2011.5.25.155.30.32", "hwOspfAdjustedCost": "1.3.6.1.4.1.2011.5.25.155.30.33"]
]

// --- hwOspfPrefixSidConflict (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.155.31.40
// Fields: hwOspfv2ProcessIdIndex, hwOspfPrefixSid, hwOspfPrefixAddress, hwOspfPrefixAddressMask, hwOspfAlgorithm, hwOspfConflictType
// Description: This object indicates that An OSPF link cost adjustment event occurs.
trapMap["1.3.6.1.4.1.2011.5.25.155.31.40"] = [
    name: "hwOspfPrefixSidConflict",
    fields: ["hwOspfv2ProcessIdIndex", "hwOspfPrefixSid", "hwOspfPrefixAddress", "hwOspfPrefixAddressMask", "hwOspfAlgorithm", "hwOspfConflictType"],
    fieldOids: ["hwOspfv2ProcessIdIndex": "1.3.6.1.4.1.2011.5.25.155.3.1.1", "hwOspfPrefixSid": "1.3.6.1.4.1.2011.5.25.155.30.34", "hwOspfPrefixAddress": "1.3.6.1.4.1.2011.5.25.155.30.35", "hwOspfPrefixAddressMask": "1.3.6.1.4.1.2011.5.25.155.30.36", "hwOspfAlgorithm": "1.3.6.1.4.1.2011.5.25.155.30.37", "hwOspfConflictType": "1.3.6.1.4.1.2011.5.25.155.30.38"]
]

// --- hwOspfPrefixSidConflictClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.155.31.41
// Fields: hwOspfv2ProcessIdIndex, hwOspfPrefixSid, hwOspfPrefixAddress, hwOspfPrefixAddressMask, hwOspfAlgorithm, hwOspfConflictType
// Description: This object indicates that An OSPF link cost adjustment event is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.155.31.41"] = [
    name: "hwOspfPrefixSidConflictClear",
    fields: ["hwOspfv2ProcessIdIndex", "hwOspfPrefixSid", "hwOspfPrefixAddress", "hwOspfPrefixAddressMask", "hwOspfAlgorithm", "hwOspfConflictType"],
    fieldOids: ["hwOspfv2ProcessIdIndex": "1.3.6.1.4.1.2011.5.25.155.3.1.1", "hwOspfPrefixSid": "1.3.6.1.4.1.2011.5.25.155.30.34", "hwOspfPrefixAddress": "1.3.6.1.4.1.2011.5.25.155.30.35", "hwOspfPrefixAddressMask": "1.3.6.1.4.1.2011.5.25.155.30.36", "hwOspfAlgorithm": "1.3.6.1.4.1.2011.5.25.155.30.37", "hwOspfConflictType": "1.3.6.1.4.1.2011.5.25.155.30.38"]
]

// --- hwOspfv2NbrExceedThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.155.31.42
// Fields: hwOspfv2NbrThresholdUpper
// Description: This object indicates that the number of ospfv2 exceeds the configed threshold.
trapMap["1.3.6.1.4.1.2011.5.25.155.31.42"] = [
    name: "hwOspfv2NbrExceedThreshold",
    fields: ["hwOspfv2NbrThresholdUpper"],
    fieldOids: ["hwOspfv2NbrThresholdUpper": "1.3.6.1.4.1.2011.5.25.155.30.39"]
]

// --- hwOspfv2NbrExceedThresholdClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.155.31.43
// Fields: hwOspfv2NbrThresholdUpper
// Description: This object indicates that the number of ospfv2 has been less than the the configed threshold.
trapMap["1.3.6.1.4.1.2011.5.25.155.31.43"] = [
    name: "hwOspfv2NbrExceedThresholdClear",
    fields: ["hwOspfv2NbrThresholdUpper"],
    fieldOids: ["hwOspfv2NbrThresholdUpper": "1.3.6.1.4.1.2011.5.25.155.30.39"]
]

// --- hwOspfv2LsaRetranExceedLimit (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.155.31.44
// Fields: hwOspfv2ProcessIdIndex, hwOspfv2AreaId, hwOspfv2IfName
// Description: This object indicates that the number of OSPF LSA retransmissions on an interface exceeds the limit.
trapMap["1.3.6.1.4.1.2011.5.25.155.31.44"] = [
    name: "hwOspfv2LsaRetranExceedLimit",
    fields: ["hwOspfv2ProcessIdIndex", "hwOspfv2AreaId", "hwOspfv2IfName"],
    fieldOids: ["hwOspfv2ProcessIdIndex": "1.3.6.1.4.1.2011.5.25.155.3.1.1", "hwOspfv2AreaId": "1.3.6.1.4.1.2011.5.25.155.30.3", "hwOspfv2IfName": "1.3.6.1.4.1.2011.5.25.155.30.40"]
]

// --- hwOspfv2LsaRetranExceedLimitClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.155.31.45
// Fields: hwOspfv2ProcessIdIndex, hwOspfv2AreaId, hwOspfv2IfName
// Description: This object indicates that the number of OSPF LSA retransmissions on an interface is lower than the limit.
trapMap["1.3.6.1.4.1.2011.5.25.155.31.45"] = [
    name: "hwOspfv2LsaRetranExceedLimitClear",
    fields: ["hwOspfv2ProcessIdIndex", "hwOspfv2AreaId", "hwOspfv2IfName"],
    fieldOids: ["hwOspfv2ProcessIdIndex": "1.3.6.1.4.1.2011.5.25.155.3.1.1", "hwOspfv2AreaId": "1.3.6.1.4.1.2011.5.25.155.30.3", "hwOspfv2IfName": "1.3.6.1.4.1.2011.5.25.155.30.40"]
]

// --- hwOspfv2RecvLsaExceedThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.155.31.46
// Fields: hwOspfv2ProcessIdIndex, hwOspfv2RecvLsaUpper
// Description: This object indicates that the number of received AS-external and NSSA LSAs exceeds the configed threshold.
trapMap["1.3.6.1.4.1.2011.5.25.155.31.46"] = [
    name: "hwOspfv2RecvLsaExceedThreshold",
    fields: ["hwOspfv2ProcessIdIndex", "hwOspfv2RecvLsaUpper"],
    fieldOids: ["hwOspfv2ProcessIdIndex": "1.3.6.1.4.1.2011.5.25.155.3.1.1", "hwOspfv2RecvLsaUpper": "1.3.6.1.4.1.2011.5.25.155.30.41"]
]

// --- hwOspfv2RecvLsaExceedThresholdClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.155.31.47
// Fields: hwOspfv2ProcessIdIndex, hwOspfv2RecvLsaUpper
// Description: This object indicates that the number of received AS-external and NSSA LSAs has been less than the the configed threshold.
trapMap["1.3.6.1.4.1.2011.5.25.155.31.47"] = [
    name: "hwOspfv2RecvLsaExceedThresholdClear",
    fields: ["hwOspfv2ProcessIdIndex", "hwOspfv2RecvLsaUpper"],
    fieldOids: ["hwOspfv2ProcessIdIndex": "1.3.6.1.4.1.2011.5.25.155.3.1.1", "hwOspfv2RecvLsaUpper": "1.3.6.1.4.1.2011.5.25.155.30.41"]
]

// --- hwOspfv2IPConflict (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.155.31.48
// Fields: hwOspfv2ProcessIdIndex, hwOspfv2AreaId, hwOspfv2ConflictType, hwOspfv2ConflictIp, hwOspfv2ConflictRouterId, hwOspfv2ConflictRouterId2
// Description: IP address conflict was detected between the local device and another device.
trapMap["1.3.6.1.4.1.2011.5.25.155.31.48"] = [
    name: "hwOspfv2IPConflict",
    fields: ["hwOspfv2ProcessIdIndex", "hwOspfv2AreaId", "hwOspfv2ConflictType", "hwOspfv2ConflictIp", "hwOspfv2ConflictRouterId", "hwOspfv2ConflictRouterId2"],
    fieldOids: ["hwOspfv2ProcessIdIndex": "1.3.6.1.4.1.2011.5.25.155.3.1.1", "hwOspfv2AreaId": "1.3.6.1.4.1.2011.5.25.155.30.3", "hwOspfv2ConflictType": "1.3.6.1.4.1.2011.5.25.155.30.42", "hwOspfv2ConflictIp": "1.3.6.1.4.1.2011.5.25.155.30.43", "hwOspfv2ConflictRouterId": "1.3.6.1.4.1.2011.5.25.155.30.44", "hwOspfv2ConflictRouterId2": "1.3.6.1.4.1.2011.5.25.155.30.45"]
]

// --- hwOspfv2IPConflictClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.155.31.49
// Fields: hwOspfv2ProcessIdIndex, hwOspfv2AreaId, hwOspfv2ConflictType, hwOspfv2ConflictIp, hwOspfv2ConflictRouterId, hwOspfv2ConflictRouterId2
// Description: IP address conflict was cleared.
trapMap["1.3.6.1.4.1.2011.5.25.155.31.49"] = [
    name: "hwOspfv2IPConflictClear",
    fields: ["hwOspfv2ProcessIdIndex", "hwOspfv2AreaId", "hwOspfv2ConflictType", "hwOspfv2ConflictIp", "hwOspfv2ConflictRouterId", "hwOspfv2ConflictRouterId2"],
    fieldOids: ["hwOspfv2ProcessIdIndex": "1.3.6.1.4.1.2011.5.25.155.3.1.1", "hwOspfv2AreaId": "1.3.6.1.4.1.2011.5.25.155.30.3", "hwOspfv2ConflictType": "1.3.6.1.4.1.2011.5.25.155.30.42", "hwOspfv2ConflictIp": "1.3.6.1.4.1.2011.5.25.155.30.43", "hwOspfv2ConflictRouterId": "1.3.6.1.4.1.2011.5.25.155.30.44", "hwOspfv2ConflictRouterId2": "1.3.6.1.4.1.2011.5.25.155.30.45"]
]

// --- hwOspfv2SrMplsPortLcsInactive (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.155.31.50
// Fields: hwOspfv2ProcessIdIndex, hwOspfv2IfName, hwOspfv2IfCount
// Description: No SR-MPLS license authorization was available.
trapMap["1.3.6.1.4.1.2011.5.25.155.31.50"] = [
    name: "hwOspfv2SrMplsPortLcsInactive",
    fields: ["hwOspfv2ProcessIdIndex", "hwOspfv2IfName", "hwOspfv2IfCount"],
    fieldOids: ["hwOspfv2ProcessIdIndex": "1.3.6.1.4.1.2011.5.25.155.3.1.1", "hwOspfv2IfName": "1.3.6.1.4.1.2011.5.25.155.30.40", "hwOspfv2IfCount": "1.3.6.1.4.1.2011.5.25.155.30.46"]
]

// --- hwOspfv2SrMplsPortLcsInactiveClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.155.31.51
// Fields: hwOspfv2ProcessIdIndex, hwOspfv2IfName, hwOspfv2IfCount
// Description: The alarm indicating that no SR-MPLS license authorization was available was cleared.
trapMap["1.3.6.1.4.1.2011.5.25.155.31.51"] = [
    name: "hwOspfv2SrMplsPortLcsInactiveClear",
    fields: ["hwOspfv2ProcessIdIndex", "hwOspfv2IfName", "hwOspfv2IfCount"],
    fieldOids: ["hwOspfv2ProcessIdIndex": "1.3.6.1.4.1.2011.5.25.155.3.1.1", "hwOspfv2IfName": "1.3.6.1.4.1.2011.5.25.155.30.40", "hwOspfv2IfCount": "1.3.6.1.4.1.2011.5.25.155.30.46"]
]

// ===== Parsing logic =====

// Set to true to enable diagnostic logging for this MIB parser
DEBUG = false

LOG_PREFIX = "[HUAWEI-OSPFV2-MIB]"
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
