/**
 * Auto-generated from HUAWEI-ISIS-CONF-MIB.mib
 * Generated: 2026-08-24T18:28:30.060002500
 * Traps/Notifications (64): hwIsisSystemIdConflict, hwIsisL1ImportRouteExceedLimit, hwIsisL1ImportRouteRestoreToLimit, hwIsisL2ImportRouteExceedLimit, hwIsisL2ImportRouteRestoreToLimit, hwIsisL1ImportRouteThresholdReach, hwIsisL1ImportRouteThresholdReachClear, hwIsisL2ImportRouteThresholdReach, hwIsisL2ImportRouteThresholdReachClear, hwIsisLsdbThresholdReach, hwIsisLsdbThresholdReachClear, hwIsisSystemIdAutoRecover, hwIsisAdjacencyChangeClear, hwIsisSeqNumExceedThreshold, hwIsisSeqNumExceedThresholdClear, hwIsisAttemptToExceedMaxSequenceClear, hwIsisPeerFlapSuppStatusChange, hwIsisLspRemainingLifetimeRefresh, hwIsisDeleteRouteByPurge, hwIsisDeleteRouteByPurgeClear, hwIsisRouteBeDeletedByPurgeExact, hwIsisRouteBeDeletedByPurgeExactClear, hwIsisRouteBeDeletedByPurgeInexact, hwIsisRouteBeDeletedByPurgeInexactClear, hwIsisRouteBeDeletedByPurge, hwIsisRouteBeDeletedByPurgeClear, hwIsisThirdPartRouteBeDeletedByPurgeExact, hwIsisThirdPartRouteBeDeletedByPurgeExactClear, hwIsisThirdPartRouteBeDeletedByPurgeInexact, hwIsisThirdPartRouteBeDeletedByPurgeInexactClear, hwIsisThirdPartRouteBeDeletedByPurge, hwIsisThirdPartRouteBeDeletedByPurgeClear, hwIsisAuthModeInsecure, hwIsisAuthModeInsecureClear, hwRouteLoopDetected, hwRouteLoopDetectedClear, hwIsisImportRouteReachMax, hwIsisImportRouteReachMaxClear, hwIsisLinkCostAdjustment, hwIsisLinkCostAdjustmentClear, hwisisLocatorPrefixConflict, hwisisLocatorPrefixConflictClear, hwIsisLspRetranExceedLimit, hwIsisLspRetranExceedLimitClear, hwisisNetSliceSrcPrefixConflict, hwisisNetSliceSrcPrefixConflictClear, hwIsisAdjAfDown, hwIsisAdjAfDownClear, hwIsisSystemIdCfgConflict, hwIsisSystemIdCfgConflictClear, hwisisDatabaseOverload, hwisisDatabaseOverloadClear, hwIsisIPConflict, hwIsisIPConflictClear, hwIsisInstanceIdMismatch, hwIsisInstanceIdMismatchClear, hwIsisSrv6PortLcsInactive, hwIsisSrv6PortLcsInactiveClear, hwIsisSrMplsPortLcsInactive, hwIsisSrMplsPortLcsInactiveClear, hwIsisAdaptiveCongestState, hwIsisAdaptiveCongestStateClear, hwIsisEnterAdaptiveCongestState, hwIsisExitAdaptiveCongestState
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

// --- hwIsisSystemIdConflict (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.24.2.4.1
// Fields: hwisisSysInstance, hwisisSysLevelIndex, hwIsisOwnSysID, hwIsisProcDynamicName, hwIsisAdjSysID, hwIsisAdjSysName, hwIsisLocalIP, hwIsisAdjIP, hwIsisRemoteIP
// Description: IS-IS detects a system ID conflict in an area.
trapMap["1.3.6.1.4.1.2011.5.25.24.2.4.1"] = [
    name: "hwIsisSystemIdConflict",
    fields: ["hwisisSysInstance", "hwisisSysLevelIndex", "hwIsisOwnSysID", "hwIsisProcDynamicName", "hwIsisAdjSysID", "hwIsisAdjSysName", "hwIsisLocalIP", "hwIsisAdjIP", "hwIsisRemoteIP"],
    fieldOids: ["hwisisSysInstance": "1.3.6.1.4.1.2011.5.25.24.2.2.2", "hwisisSysLevelIndex": "1.3.6.1.4.1.2011.5.25.24.2.2.3", "hwIsisOwnSysID": "1.3.6.1.4.1.2011.5.25.24.2.2.4", "hwIsisProcDynamicName": "1.3.6.1.4.1.2011.5.25.24.2.1.1.1.30", "hwIsisAdjSysID": "1.3.6.1.4.1.2011.5.25.24.2.2.5", "hwIsisAdjSysName": "1.3.6.1.4.1.2011.5.25.24.2.2.6", "hwIsisLocalIP": "1.3.6.1.4.1.2011.5.25.24.2.2.9", "hwIsisAdjIP": "1.3.6.1.4.1.2011.5.25.24.2.2.11", "hwIsisRemoteIP": "1.3.6.1.4.1.2011.5.25.24.2.2.10"]
]

// --- hwIsisL1ImportRouteExceedLimit (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.24.2.4.2
// Fields: hwIsisProcL1RedistMaxLimit, hwIsisProcL1TotalRedist
// Description: ISIS level-1 number of imported routes has exceeded the maximum limit.
trapMap["1.3.6.1.4.1.2011.5.25.24.2.4.2"] = [
    name: "hwIsisL1ImportRouteExceedLimit",
    fields: ["hwIsisProcL1RedistMaxLimit", "hwIsisProcL1TotalRedist"],
    fieldOids: ["hwIsisProcL1RedistMaxLimit": "1.3.6.1.4.1.2011.5.25.24.2.1.3.1.26", "hwIsisProcL1TotalRedist": "1.3.6.1.4.1.2011.5.25.24.2.1.3.1.32"]
]

// --- hwIsisL1ImportRouteRestoreToLimit (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.24.2.4.3
// Fields: hwIsisProcL1RedistMaxLimit, hwIsisProcL1TotalRedist
// Description: ISIS level-1 number of imported routes is restored to less than or equal to the maximum limit.
trapMap["1.3.6.1.4.1.2011.5.25.24.2.4.3"] = [
    name: "hwIsisL1ImportRouteRestoreToLimit",
    fields: ["hwIsisProcL1RedistMaxLimit", "hwIsisProcL1TotalRedist"],
    fieldOids: ["hwIsisProcL1RedistMaxLimit": "1.3.6.1.4.1.2011.5.25.24.2.1.3.1.26", "hwIsisProcL1TotalRedist": "1.3.6.1.4.1.2011.5.25.24.2.1.3.1.32"]
]

// --- hwIsisL2ImportRouteExceedLimit (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.24.2.4.4
// Fields: hwIsisProcL2RedistMaxLimit, hwIsisProcL2TotalRedist
// Description: ISIS level-2 number of imported routes has exceeded the maximum limit.
trapMap["1.3.6.1.4.1.2011.5.25.24.2.4.4"] = [
    name: "hwIsisL2ImportRouteExceedLimit",
    fields: ["hwIsisProcL2RedistMaxLimit", "hwIsisProcL2TotalRedist"],
    fieldOids: ["hwIsisProcL2RedistMaxLimit": "1.3.6.1.4.1.2011.5.25.24.2.1.3.1.27", "hwIsisProcL2TotalRedist": "1.3.6.1.4.1.2011.5.25.24.2.1.3.1.33"]
]

// --- hwIsisL2ImportRouteRestoreToLimit (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.24.2.4.5
// Fields: hwIsisProcL2RedistMaxLimit, hwIsisProcL2TotalRedist
// Description: ISIS level-2 number of imported routes is restored to less than or equal to the maximum limit.
trapMap["1.3.6.1.4.1.2011.5.25.24.2.4.5"] = [
    name: "hwIsisL2ImportRouteRestoreToLimit",
    fields: ["hwIsisProcL2RedistMaxLimit", "hwIsisProcL2TotalRedist"],
    fieldOids: ["hwIsisProcL2RedistMaxLimit": "1.3.6.1.4.1.2011.5.25.24.2.1.3.1.27", "hwIsisProcL2TotalRedist": "1.3.6.1.4.1.2011.5.25.24.2.1.3.1.33"]
]

// --- hwIsisL1ImportRouteThresholdReach (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.24.2.4.6
// Fields: hwIsisProcL1RedistMaxLimit, hwIsisProcL1UpperRedistThreshold, hwIsisProcL1LowerRedistThreshold, hwIsisProcL1TotalRedist
// Description: ISIS level-1 number of imported routes has reached the threshold value.
trapMap["1.3.6.1.4.1.2011.5.25.24.2.4.6"] = [
    name: "hwIsisL1ImportRouteThresholdReach",
    fields: ["hwIsisProcL1RedistMaxLimit", "hwIsisProcL1UpperRedistThreshold", "hwIsisProcL1LowerRedistThreshold", "hwIsisProcL1TotalRedist"],
    fieldOids: ["hwIsisProcL1RedistMaxLimit": "1.3.6.1.4.1.2011.5.25.24.2.1.3.1.26", "hwIsisProcL1UpperRedistThreshold": "1.3.6.1.4.1.2011.5.25.24.2.1.3.1.28", "hwIsisProcL1LowerRedistThreshold": "1.3.6.1.4.1.2011.5.25.24.2.1.3.1.30", "hwIsisProcL1TotalRedist": "1.3.6.1.4.1.2011.5.25.24.2.1.3.1.32"]
]

// --- hwIsisL1ImportRouteThresholdReachClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.24.2.4.7
// Fields: hwIsisProcL1RedistMaxLimit, hwIsisProcL1UpperRedistThreshold, hwIsisProcL1LowerRedistThreshold, hwIsisProcL1TotalRedist
// Description: ISIS level-1 number of imported routes has been less than the threshold value.
trapMap["1.3.6.1.4.1.2011.5.25.24.2.4.7"] = [
    name: "hwIsisL1ImportRouteThresholdReachClear",
    fields: ["hwIsisProcL1RedistMaxLimit", "hwIsisProcL1UpperRedistThreshold", "hwIsisProcL1LowerRedistThreshold", "hwIsisProcL1TotalRedist"],
    fieldOids: ["hwIsisProcL1RedistMaxLimit": "1.3.6.1.4.1.2011.5.25.24.2.1.3.1.26", "hwIsisProcL1UpperRedistThreshold": "1.3.6.1.4.1.2011.5.25.24.2.1.3.1.28", "hwIsisProcL1LowerRedistThreshold": "1.3.6.1.4.1.2011.5.25.24.2.1.3.1.30", "hwIsisProcL1TotalRedist": "1.3.6.1.4.1.2011.5.25.24.2.1.3.1.32"]
]

// --- hwIsisL2ImportRouteThresholdReach (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.24.2.4.8
// Fields: hwIsisProcL2RedistMaxLimit, hwIsisProcL2UpperRedistThreshold, hwIsisProcL2LowerRedistThreshold, hwIsisProcL2TotalRedist
// Description: ISIS level-2 number of imported routes has reached the threshold value.
trapMap["1.3.6.1.4.1.2011.5.25.24.2.4.8"] = [
    name: "hwIsisL2ImportRouteThresholdReach",
    fields: ["hwIsisProcL2RedistMaxLimit", "hwIsisProcL2UpperRedistThreshold", "hwIsisProcL2LowerRedistThreshold", "hwIsisProcL2TotalRedist"],
    fieldOids: ["hwIsisProcL2RedistMaxLimit": "1.3.6.1.4.1.2011.5.25.24.2.1.3.1.27", "hwIsisProcL2UpperRedistThreshold": "1.3.6.1.4.1.2011.5.25.24.2.1.3.1.29", "hwIsisProcL2LowerRedistThreshold": "1.3.6.1.4.1.2011.5.25.24.2.1.3.1.31", "hwIsisProcL2TotalRedist": "1.3.6.1.4.1.2011.5.25.24.2.1.3.1.33"]
]

// --- hwIsisL2ImportRouteThresholdReachClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.24.2.4.9
// Fields: hwIsisProcL2RedistMaxLimit, hwIsisProcL2UpperRedistThreshold, hwIsisProcL2LowerRedistThreshold, hwIsisProcL2TotalRedist
// Description: ISIS level-2 number of imported routes has been less than the threshold value.
trapMap["1.3.6.1.4.1.2011.5.25.24.2.4.9"] = [
    name: "hwIsisL2ImportRouteThresholdReachClear",
    fields: ["hwIsisProcL2RedistMaxLimit", "hwIsisProcL2UpperRedistThreshold", "hwIsisProcL2LowerRedistThreshold", "hwIsisProcL2TotalRedist"],
    fieldOids: ["hwIsisProcL2RedistMaxLimit": "1.3.6.1.4.1.2011.5.25.24.2.1.3.1.27", "hwIsisProcL2UpperRedistThreshold": "1.3.6.1.4.1.2011.5.25.24.2.1.3.1.29", "hwIsisProcL2LowerRedistThreshold": "1.3.6.1.4.1.2011.5.25.24.2.1.3.1.31", "hwIsisProcL2TotalRedist": "1.3.6.1.4.1.2011.5.25.24.2.1.3.1.33"]
]

// --- hwIsisLsdbThresholdReach (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.24.2.4.10
// Fields: hwisisProcLsdbMaxLimit, hwIsisProcLsdbUpperThreshold, hwIsisProcLsdbLowerThreshold, hwIsisProcLsdbTotal
// Description: The number of LSP has reached the upper threshold value.
trapMap["1.3.6.1.4.1.2011.5.25.24.2.4.10"] = [
    name: "hwIsisLsdbThresholdReach",
    fields: ["hwisisProcLsdbMaxLimit", "hwIsisProcLsdbUpperThreshold", "hwIsisProcLsdbLowerThreshold", "hwIsisProcLsdbTotal"],
    fieldOids: ["hwisisProcLsdbMaxLimit": "1.3.6.1.4.1.2011.5.25.24.2.1.1.1.43", "hwIsisProcLsdbUpperThreshold": "1.3.6.1.4.1.2011.5.25.24.2.1.1.1.44", "hwIsisProcLsdbLowerThreshold": "1.3.6.1.4.1.2011.5.25.24.2.1.1.1.45", "hwIsisProcLsdbTotal": "1.3.6.1.4.1.2011.5.25.24.2.1.1.1.46"]
]

// --- hwIsisLsdbThresholdReachClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.24.2.4.11
// Fields: hwisisProcLsdbMaxLimit, hwIsisProcLsdbUpperThreshold, hwIsisProcLsdbLowerThreshold, hwIsisProcLsdbTotal
// Description: The number of LSP has been less than the lower threshold value.
trapMap["1.3.6.1.4.1.2011.5.25.24.2.4.11"] = [
    name: "hwIsisLsdbThresholdReachClear",
    fields: ["hwisisProcLsdbMaxLimit", "hwIsisProcLsdbUpperThreshold", "hwIsisProcLsdbLowerThreshold", "hwIsisProcLsdbTotal"],
    fieldOids: ["hwisisProcLsdbMaxLimit": "1.3.6.1.4.1.2011.5.25.24.2.1.1.1.43", "hwIsisProcLsdbUpperThreshold": "1.3.6.1.4.1.2011.5.25.24.2.1.1.1.44", "hwIsisProcLsdbLowerThreshold": "1.3.6.1.4.1.2011.5.25.24.2.1.1.1.45", "hwIsisProcLsdbTotal": "1.3.6.1.4.1.2011.5.25.24.2.1.1.1.46"]
]

// --- hwIsisSystemIdAutoRecover (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.24.2.4.12
// Fields: hwisisSysInstance, hwIsisConflictSystemID, hwIsisAutoSysId, hwIsisLocalIP, hwIsisRemoteIP
// Description: After a system ID conflict was detected within an IS-IS area, IS-IS changed the system ID automatically.
trapMap["1.3.6.1.4.1.2011.5.25.24.2.4.12"] = [
    name: "hwIsisSystemIdAutoRecover",
    fields: ["hwisisSysInstance", "hwIsisConflictSystemID", "hwIsisAutoSysId", "hwIsisLocalIP", "hwIsisRemoteIP"],
    fieldOids: ["hwisisSysInstance": "1.3.6.1.4.1.2011.5.25.24.2.2.2", "hwIsisConflictSystemID": "1.3.6.1.4.1.2011.5.25.24.2.2.7", "hwIsisAutoSysId": "1.3.6.1.4.1.2011.5.25.24.2.2.8", "hwIsisLocalIP": "1.3.6.1.4.1.2011.5.25.24.2.2.9", "hwIsisRemoteIP": "1.3.6.1.4.1.2011.5.25.24.2.2.10"]
]

// --- hwIsisAdjacencyChangeClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.24.2.4.13
// Fields: isisSysInstance, isisSysLevelIndex, isisCircIfIndex, isisPduLspId, isisAdjState, ifName, hwIsisAdjChangeReason
// Description: The isisAdjacencyChange alarm was cleared.
trapMap["1.3.6.1.4.1.2011.5.25.24.2.4.13"] = [
    name: "hwIsisAdjacencyChangeClear",
    fields: ["isisSysInstance", "isisSysLevelIndex", "isisCircIfIndex", "isisPduLspId", "isisAdjState", "ifName", "hwIsisAdjChangeReason"],
    fieldOids: ["isisSysInstance": "1.3.6.1.2.1.138.1.1.1.1.1", "isisSysLevelIndex": "1.3.6.1.2.1.138.1.2.1.1.1", "isisCircIfIndex": "1.3.6.1.2.1.138.1.3.2.1.2", "isisPduLspId": "1.3.6.1.2.1.138.1.10.1.3", "isisAdjState": "1.3.6.1.2.1.138.1.10.1.12", "ifName": "1.3.6.1.2.1.31.1.1.1.1", "hwIsisAdjChangeReason": "1.3.6.1.4.1.2011.5.25.24.2.2.1"]
]

// --- hwIsisSeqNumExceedThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.24.2.4.14
// Fields: isisSysInstance, isisSysLevelIndex, isisPduLspId
// Description: The LSP sequence number has exceeded the upper threshold value.
trapMap["1.3.6.1.4.1.2011.5.25.24.2.4.14"] = [
    name: "hwIsisSeqNumExceedThreshold",
    fields: ["isisSysInstance", "isisSysLevelIndex", "isisPduLspId"],
    fieldOids: ["isisSysInstance": "1.3.6.1.2.1.138.1.1.1.1.1", "isisSysLevelIndex": "1.3.6.1.2.1.138.1.2.1.1.1", "isisPduLspId": "1.3.6.1.2.1.138.1.10.1.3"]
]

// --- hwIsisSeqNumExceedThresholdClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.24.2.4.15
// Fields: isisSysInstance, isisSysLevelIndex, isisPduLspId
// Description: The LSP sequence number has been less than the upper threshold value.
trapMap["1.3.6.1.4.1.2011.5.25.24.2.4.15"] = [
    name: "hwIsisSeqNumExceedThresholdClear",
    fields: ["isisSysInstance", "isisSysLevelIndex", "isisPduLspId"],
    fieldOids: ["isisSysInstance": "1.3.6.1.2.1.138.1.1.1.1.1", "isisSysLevelIndex": "1.3.6.1.2.1.138.1.2.1.1.1", "isisPduLspId": "1.3.6.1.2.1.138.1.10.1.3"]
]

// --- hwIsisAttemptToExceedMaxSequenceClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.24.2.4.16
// Fields: isisSysInstance, isisSysLevelIndex, isisPduLspId
// Description: The LSP sequence number has been less than the maximum value.
trapMap["1.3.6.1.4.1.2011.5.25.24.2.4.16"] = [
    name: "hwIsisAttemptToExceedMaxSequenceClear",
    fields: ["isisSysInstance", "isisSysLevelIndex", "isisPduLspId"],
    fieldOids: ["isisSysInstance": "1.3.6.1.2.1.138.1.1.1.1.1", "isisSysLevelIndex": "1.3.6.1.2.1.138.1.2.1.1.1", "isisPduLspId": "1.3.6.1.2.1.138.1.10.1.3"]
]

// --- hwIsisPeerFlapSuppStatusChange (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.24.2.4.17
// Fields: isisSysInstance, isisCircIfIndex, ifName, hwIsisPeerFlappingSuppressStatus
// Description: The object is used to monitor the peer flapping-suppress status of interface in ISIS.
trapMap["1.3.6.1.4.1.2011.5.25.24.2.4.17"] = [
    name: "hwIsisPeerFlapSuppStatusChange",
    fields: ["isisSysInstance", "isisCircIfIndex", "ifName", "hwIsisPeerFlappingSuppressStatus"],
    fieldOids: ["isisSysInstance": "1.3.6.1.2.1.138.1.1.1.1.1", "isisCircIfIndex": "1.3.6.1.2.1.138.1.3.2.1.2", "ifName": "1.3.6.1.2.1.31.1.1.1.1", "hwIsisPeerFlappingSuppressStatus": "1.3.6.1.4.1.2011.5.25.24.2.2.12"]
]

// --- hwIsisLspRemainingLifetimeRefresh (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.24.2.4.18
// Fields: isisSysInstance, isisSysLevelIndex, isisCircIfIndex, ifName, hwIsisAdjSysID, isisPduLspId, hwIsisRemainingLifetime
// Description: The object is used to monitor the receiving of LSP with small remaining lifetime.
trapMap["1.3.6.1.4.1.2011.5.25.24.2.4.18"] = [
    name: "hwIsisLspRemainingLifetimeRefresh",
    fields: ["isisSysInstance", "isisSysLevelIndex", "isisCircIfIndex", "ifName", "hwIsisAdjSysID", "isisPduLspId", "hwIsisRemainingLifetime"],
    fieldOids: ["isisSysInstance": "1.3.6.1.2.1.138.1.1.1.1.1", "isisSysLevelIndex": "1.3.6.1.2.1.138.1.2.1.1.1", "isisCircIfIndex": "1.3.6.1.2.1.138.1.3.2.1.2", "ifName": "1.3.6.1.2.1.31.1.1.1.1", "hwIsisAdjSysID": "1.3.6.1.4.1.2011.5.25.24.2.2.5", "isisPduLspId": "1.3.6.1.2.1.138.1.10.1.3", "hwIsisRemainingLifetime": "1.3.6.1.4.1.2011.5.25.24.2.2.13"]
]

// --- hwIsisDeleteRouteByPurge (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.24.2.4.19
// Fields: hwisisSysInstance, hwIsisHostName, hwIsisHostIpAddress, hwIsisSystemID, hwisisSysLevelIndex, hwIsisPurgeLspNum, hwIsisAffectedNodeNum, hwIsisTotalNodeNum, hwIsisInterval
// Description: The local device deleted IS-IS routes advertised by other devices.
trapMap["1.3.6.1.4.1.2011.5.25.24.2.4.19"] = [
    name: "hwIsisDeleteRouteByPurge",
    fields: ["hwisisSysInstance", "hwIsisHostName", "hwIsisHostIpAddress", "hwIsisSystemID", "hwisisSysLevelIndex", "hwIsisPurgeLspNum", "hwIsisAffectedNodeNum", "hwIsisTotalNodeNum", "hwIsisInterval"],
    fieldOids: ["hwisisSysInstance": "1.3.6.1.4.1.2011.5.25.24.2.2.2", "hwIsisHostName": "1.3.6.1.4.1.2011.5.25.24.2.2.14", "hwIsisHostIpAddress": "1.3.6.1.4.1.2011.5.25.24.2.2.15", "hwIsisSystemID": "1.3.6.1.4.1.2011.5.25.24.2.2.21", "hwisisSysLevelIndex": "1.3.6.1.4.1.2011.5.25.24.2.2.3", "hwIsisPurgeLspNum": "1.3.6.1.4.1.2011.5.25.24.2.2.16", "hwIsisAffectedNodeNum": "1.3.6.1.4.1.2011.5.25.24.2.2.17", "hwIsisTotalNodeNum": "1.3.6.1.4.1.2011.5.25.24.2.2.18", "hwIsisInterval": "1.3.6.1.4.1.2011.5.25.24.2.2.19"]
]

// --- hwIsisDeleteRouteByPurgeClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.24.2.4.20
// Fields: hwisisSysInstance, hwIsisHostName, hwIsisHostIpAddress, hwIsisSystemID, hwisisSysLevelIndex
// Description: The local device did not delete IS-IS routes advertised by other devices.
trapMap["1.3.6.1.4.1.2011.5.25.24.2.4.20"] = [
    name: "hwIsisDeleteRouteByPurgeClear",
    fields: ["hwisisSysInstance", "hwIsisHostName", "hwIsisHostIpAddress", "hwIsisSystemID", "hwisisSysLevelIndex"],
    fieldOids: ["hwisisSysInstance": "1.3.6.1.4.1.2011.5.25.24.2.2.2", "hwIsisHostName": "1.3.6.1.4.1.2011.5.25.24.2.2.14", "hwIsisHostIpAddress": "1.3.6.1.4.1.2011.5.25.24.2.2.15", "hwIsisSystemID": "1.3.6.1.4.1.2011.5.25.24.2.2.21", "hwisisSysLevelIndex": "1.3.6.1.4.1.2011.5.25.24.2.2.3"]
]

// --- hwIsisRouteBeDeletedByPurgeExact (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.24.2.4.21
// Fields: hwisisSysInstance, hwIsisHostName, hwIsisHostIpAddress, hwIsisSystemID, hwisisSysLevelIndex, hwIsisPurgeLspNum, hwIsisAffectedNodeNum, hwIsisTotalNodeNum, hwIsisInterval
// Description: IS-IS routes advertised by the local device were deleted by another device.
trapMap["1.3.6.1.4.1.2011.5.25.24.2.4.21"] = [
    name: "hwIsisRouteBeDeletedByPurgeExact",
    fields: ["hwisisSysInstance", "hwIsisHostName", "hwIsisHostIpAddress", "hwIsisSystemID", "hwisisSysLevelIndex", "hwIsisPurgeLspNum", "hwIsisAffectedNodeNum", "hwIsisTotalNodeNum", "hwIsisInterval"],
    fieldOids: ["hwisisSysInstance": "1.3.6.1.4.1.2011.5.25.24.2.2.2", "hwIsisHostName": "1.3.6.1.4.1.2011.5.25.24.2.2.14", "hwIsisHostIpAddress": "1.3.6.1.4.1.2011.5.25.24.2.2.15", "hwIsisSystemID": "1.3.6.1.4.1.2011.5.25.24.2.2.21", "hwisisSysLevelIndex": "1.3.6.1.4.1.2011.5.25.24.2.2.3", "hwIsisPurgeLspNum": "1.3.6.1.4.1.2011.5.25.24.2.2.16", "hwIsisAffectedNodeNum": "1.3.6.1.4.1.2011.5.25.24.2.2.17", "hwIsisTotalNodeNum": "1.3.6.1.4.1.2011.5.25.24.2.2.18", "hwIsisInterval": "1.3.6.1.4.1.2011.5.25.24.2.2.19"]
]

// --- hwIsisRouteBeDeletedByPurgeExactClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.24.2.4.22
// Fields: hwisisSysInstance, hwIsisHostName, hwIsisHostIpAddress, hwIsisSystemID, hwisisSysLevelIndex
// Description: IS-IS routes advertised by the local device were not deleted by another device.
trapMap["1.3.6.1.4.1.2011.5.25.24.2.4.22"] = [
    name: "hwIsisRouteBeDeletedByPurgeExactClear",
    fields: ["hwisisSysInstance", "hwIsisHostName", "hwIsisHostIpAddress", "hwIsisSystemID", "hwisisSysLevelIndex"],
    fieldOids: ["hwisisSysInstance": "1.3.6.1.4.1.2011.5.25.24.2.2.2", "hwIsisHostName": "1.3.6.1.4.1.2011.5.25.24.2.2.14", "hwIsisHostIpAddress": "1.3.6.1.4.1.2011.5.25.24.2.2.15", "hwIsisSystemID": "1.3.6.1.4.1.2011.5.25.24.2.2.21", "hwisisSysLevelIndex": "1.3.6.1.4.1.2011.5.25.24.2.2.3"]
]

// --- hwIsisRouteBeDeletedByPurgeInexact (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.24.2.4.23
// Fields: hwisisSysInstance, hwIsisHostName, hwIsisHostIpAddress, hwIsisSystemID, hwisisSysLevelIndex, hwIsisPurgeLspNum, hwIsisAffectedNodeNum, hwIsisTotalNodeNum, hwIsisInterval, hwIsisRuledOutDeviceNum
// Description: IS-IS routes advertised by the local device were deleted by another device, and the possibly faulty device did not support IS-IS purge LSP source tracing. Log in to the possibly faulty device. If the ...
trapMap["1.3.6.1.4.1.2011.5.25.24.2.4.23"] = [
    name: "hwIsisRouteBeDeletedByPurgeInexact",
    fields: ["hwisisSysInstance", "hwIsisHostName", "hwIsisHostIpAddress", "hwIsisSystemID", "hwisisSysLevelIndex", "hwIsisPurgeLspNum", "hwIsisAffectedNodeNum", "hwIsisTotalNodeNum", "hwIsisInterval", "hwIsisRuledOutDeviceNum"],
    fieldOids: ["hwisisSysInstance": "1.3.6.1.4.1.2011.5.25.24.2.2.2", "hwIsisHostName": "1.3.6.1.4.1.2011.5.25.24.2.2.14", "hwIsisHostIpAddress": "1.3.6.1.4.1.2011.5.25.24.2.2.15", "hwIsisSystemID": "1.3.6.1.4.1.2011.5.25.24.2.2.21", "hwisisSysLevelIndex": "1.3.6.1.4.1.2011.5.25.24.2.2.3", "hwIsisPurgeLspNum": "1.3.6.1.4.1.2011.5.25.24.2.2.16", "hwIsisAffectedNodeNum": "1.3.6.1.4.1.2011.5.25.24.2.2.17", "hwIsisTotalNodeNum": "1.3.6.1.4.1.2011.5.25.24.2.2.18", "hwIsisInterval": "1.3.6.1.4.1.2011.5.25.24.2.2.19", "hwIsisRuledOutDeviceNum": "1.3.6.1.4.1.2011.5.25.24.2.2.20"]
]

// --- hwIsisRouteBeDeletedByPurgeInexactClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.24.2.4.24
// Fields: hwisisSysInstance, hwIsisHostName, hwIsisHostIpAddress, hwIsisSystemID, hwisisSysLevelIndex
// Description: IS-IS routes advertised by the local device were not deleted by another device.
trapMap["1.3.6.1.4.1.2011.5.25.24.2.4.24"] = [
    name: "hwIsisRouteBeDeletedByPurgeInexactClear",
    fields: ["hwisisSysInstance", "hwIsisHostName", "hwIsisHostIpAddress", "hwIsisSystemID", "hwisisSysLevelIndex"],
    fieldOids: ["hwisisSysInstance": "1.3.6.1.4.1.2011.5.25.24.2.2.2", "hwIsisHostName": "1.3.6.1.4.1.2011.5.25.24.2.2.14", "hwIsisHostIpAddress": "1.3.6.1.4.1.2011.5.25.24.2.2.15", "hwIsisSystemID": "1.3.6.1.4.1.2011.5.25.24.2.2.21", "hwisisSysLevelIndex": "1.3.6.1.4.1.2011.5.25.24.2.2.3"]
]

// --- hwIsisRouteBeDeletedByPurge (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.24.2.4.25
// Fields: hwisisSysInstance, hwIsisHostName, hwIsisHostIpAddress, hwIsisSystemID, hwisisSysLevelIndex, hwIsisTotalNodeNum, hwIsisHostName1, hwIsisHostIpAddress1, hwIsisSystemID1, hwIsisHostName2, hwIsisHostIpAddress2, hwIsisSystemID2, hwIsisHostName3, hwIsisHostIpAddress3, hwIsisSystemID3
// Description: IS-IS routes advertised by the local device were deleted by another device. Log in to the possibly faulty device. If the device is deleting routes, reset or isolate it from the network. Otherwise, che...
trapMap["1.3.6.1.4.1.2011.5.25.24.2.4.25"] = [
    name: "hwIsisRouteBeDeletedByPurge",
    fields: ["hwisisSysInstance", "hwIsisHostName", "hwIsisHostIpAddress", "hwIsisSystemID", "hwisisSysLevelIndex", "hwIsisTotalNodeNum", "hwIsisHostName1", "hwIsisHostIpAddress1", "hwIsisSystemID1", "hwIsisHostName2", "hwIsisHostIpAddress2", "hwIsisSystemID2", "hwIsisHostName3", "hwIsisHostIpAddress3", "hwIsisSystemID3"],
    fieldOids: ["hwisisSysInstance": "1.3.6.1.4.1.2011.5.25.24.2.2.2", "hwIsisHostName": "1.3.6.1.4.1.2011.5.25.24.2.2.14", "hwIsisHostIpAddress": "1.3.6.1.4.1.2011.5.25.24.2.2.15", "hwIsisSystemID": "1.3.6.1.4.1.2011.5.25.24.2.2.21", "hwisisSysLevelIndex": "1.3.6.1.4.1.2011.5.25.24.2.2.3", "hwIsisTotalNodeNum": "1.3.6.1.4.1.2011.5.25.24.2.2.18", "hwIsisHostName1": "1.3.6.1.4.1.2011.5.25.24.2.2.22", "hwIsisHostIpAddress1": "1.3.6.1.4.1.2011.5.25.24.2.2.23", "hwIsisSystemID1": "1.3.6.1.4.1.2011.5.25.24.2.2.24", "hwIsisHostName2": "1.3.6.1.4.1.2011.5.25.24.2.2.25", "hwIsisHostIpAddress2": "1.3.6.1.4.1.2011.5.25.24.2.2.26", "hwIsisSystemID2": "1.3.6.1.4.1.2011.5.25.24.2.2.27", "hwIsisHostName3": "1.3.6.1.4.1.2011.5.25.24.2.2.28", "hwIsisHostIpAddress3": "1.3.6.1.4.1.2011.5.25.24.2.2.29", "hwIsisSystemID3": "1.3.6.1.4.1.2011.5.25.24.2.2.30"]
]

// --- hwIsisRouteBeDeletedByPurgeClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.24.2.4.26
// Fields: hwisisSysInstance, hwIsisHostName, hwIsisHostIpAddress, hwIsisSystemID, hwisisSysLevelIndex
// Description: IS-IS routes advertised by the local device were not deleted by another device.
trapMap["1.3.6.1.4.1.2011.5.25.24.2.4.26"] = [
    name: "hwIsisRouteBeDeletedByPurgeClear",
    fields: ["hwisisSysInstance", "hwIsisHostName", "hwIsisHostIpAddress", "hwIsisSystemID", "hwisisSysLevelIndex"],
    fieldOids: ["hwisisSysInstance": "1.3.6.1.4.1.2011.5.25.24.2.2.2", "hwIsisHostName": "1.3.6.1.4.1.2011.5.25.24.2.2.14", "hwIsisHostIpAddress": "1.3.6.1.4.1.2011.5.25.24.2.2.15", "hwIsisSystemID": "1.3.6.1.4.1.2011.5.25.24.2.2.21", "hwisisSysLevelIndex": "1.3.6.1.4.1.2011.5.25.24.2.2.3"]
]

// --- hwIsisThirdPartRouteBeDeletedByPurgeExact (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.24.2.4.27
// Fields: hwisisSysInstance, hwIsisHostName, hwIsisHostIpAddress, hwIsisSystemID, hwisisSysLevelIndex, hwIsisPurgeLspNum, hwIsisAffectedNodeNum, hwIsisTotalNodeNum, hwIsisInterval
// Description: IS-IS routes advertised by another device were deleted. Reset or isolate the faulty device from the network.
trapMap["1.3.6.1.4.1.2011.5.25.24.2.4.27"] = [
    name: "hwIsisThirdPartRouteBeDeletedByPurgeExact",
    fields: ["hwisisSysInstance", "hwIsisHostName", "hwIsisHostIpAddress", "hwIsisSystemID", "hwisisSysLevelIndex", "hwIsisPurgeLspNum", "hwIsisAffectedNodeNum", "hwIsisTotalNodeNum", "hwIsisInterval"],
    fieldOids: ["hwisisSysInstance": "1.3.6.1.4.1.2011.5.25.24.2.2.2", "hwIsisHostName": "1.3.6.1.4.1.2011.5.25.24.2.2.14", "hwIsisHostIpAddress": "1.3.6.1.4.1.2011.5.25.24.2.2.15", "hwIsisSystemID": "1.3.6.1.4.1.2011.5.25.24.2.2.21", "hwisisSysLevelIndex": "1.3.6.1.4.1.2011.5.25.24.2.2.3", "hwIsisPurgeLspNum": "1.3.6.1.4.1.2011.5.25.24.2.2.16", "hwIsisAffectedNodeNum": "1.3.6.1.4.1.2011.5.25.24.2.2.17", "hwIsisTotalNodeNum": "1.3.6.1.4.1.2011.5.25.24.2.2.18", "hwIsisInterval": "1.3.6.1.4.1.2011.5.25.24.2.2.19"]
]

// --- hwIsisThirdPartRouteBeDeletedByPurgeExactClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.24.2.4.28
// Fields: hwisisSysInstance, hwIsisHostName, hwIsisHostIpAddress, hwIsisSystemID, hwisisSysLevelIndex
// Description: IS-IS routes advertised by another device were not deleted.
trapMap["1.3.6.1.4.1.2011.5.25.24.2.4.28"] = [
    name: "hwIsisThirdPartRouteBeDeletedByPurgeExactClear",
    fields: ["hwisisSysInstance", "hwIsisHostName", "hwIsisHostIpAddress", "hwIsisSystemID", "hwisisSysLevelIndex"],
    fieldOids: ["hwisisSysInstance": "1.3.6.1.4.1.2011.5.25.24.2.2.2", "hwIsisHostName": "1.3.6.1.4.1.2011.5.25.24.2.2.14", "hwIsisHostIpAddress": "1.3.6.1.4.1.2011.5.25.24.2.2.15", "hwIsisSystemID": "1.3.6.1.4.1.2011.5.25.24.2.2.21", "hwisisSysLevelIndex": "1.3.6.1.4.1.2011.5.25.24.2.2.3"]
]

// --- hwIsisThirdPartRouteBeDeletedByPurgeInexact (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.24.2.4.29
// Fields: hwisisSysInstance, hwIsisHostName, hwIsisHostIpAddress, hwIsisSystemID, hwisisSysLevelIndex, hwIsisPurgeLspNum, hwIsisAffectedNodeNum, hwIsisTotalNodeNum, hwIsisInterval, hwIsisRuledOutDeviceNum
// Description: IS-IS routes advertised by another device were deleted, and the possibly faulty device did not support IS-IS purge LSP source tracing. Log in to the possibly faulty device. If the device is deleting r...
trapMap["1.3.6.1.4.1.2011.5.25.24.2.4.29"] = [
    name: "hwIsisThirdPartRouteBeDeletedByPurgeInexact",
    fields: ["hwisisSysInstance", "hwIsisHostName", "hwIsisHostIpAddress", "hwIsisSystemID", "hwisisSysLevelIndex", "hwIsisPurgeLspNum", "hwIsisAffectedNodeNum", "hwIsisTotalNodeNum", "hwIsisInterval", "hwIsisRuledOutDeviceNum"],
    fieldOids: ["hwisisSysInstance": "1.3.6.1.4.1.2011.5.25.24.2.2.2", "hwIsisHostName": "1.3.6.1.4.1.2011.5.25.24.2.2.14", "hwIsisHostIpAddress": "1.3.6.1.4.1.2011.5.25.24.2.2.15", "hwIsisSystemID": "1.3.6.1.4.1.2011.5.25.24.2.2.21", "hwisisSysLevelIndex": "1.3.6.1.4.1.2011.5.25.24.2.2.3", "hwIsisPurgeLspNum": "1.3.6.1.4.1.2011.5.25.24.2.2.16", "hwIsisAffectedNodeNum": "1.3.6.1.4.1.2011.5.25.24.2.2.17", "hwIsisTotalNodeNum": "1.3.6.1.4.1.2011.5.25.24.2.2.18", "hwIsisInterval": "1.3.6.1.4.1.2011.5.25.24.2.2.19", "hwIsisRuledOutDeviceNum": "1.3.6.1.4.1.2011.5.25.24.2.2.20"]
]

// --- hwIsisThirdPartRouteBeDeletedByPurgeInexactClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.24.2.4.30
// Fields: hwisisSysInstance, hwIsisHostName, hwIsisHostIpAddress, hwIsisSystemID, hwisisSysLevelIndex
// Description: IS-IS routes advertised by another device were not deleted.
trapMap["1.3.6.1.4.1.2011.5.25.24.2.4.30"] = [
    name: "hwIsisThirdPartRouteBeDeletedByPurgeInexactClear",
    fields: ["hwisisSysInstance", "hwIsisHostName", "hwIsisHostIpAddress", "hwIsisSystemID", "hwisisSysLevelIndex"],
    fieldOids: ["hwisisSysInstance": "1.3.6.1.4.1.2011.5.25.24.2.2.2", "hwIsisHostName": "1.3.6.1.4.1.2011.5.25.24.2.2.14", "hwIsisHostIpAddress": "1.3.6.1.4.1.2011.5.25.24.2.2.15", "hwIsisSystemID": "1.3.6.1.4.1.2011.5.25.24.2.2.21", "hwisisSysLevelIndex": "1.3.6.1.4.1.2011.5.25.24.2.2.3"]
]

// --- hwIsisThirdPartRouteBeDeletedByPurge (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.24.2.4.31
// Fields: hwisisSysInstance, hwIsisHostName, hwIsisHostIpAddress, hwIsisSystemID, hwisisSysLevelIndex, hwIsisTotalNodeNum, hwIsisHostName1, hwIsisHostIpAddress1, hwIsisSystemID1, hwIsisHostName2, hwIsisHostIpAddress2, hwIsisSystemID2, hwIsisHostName3, hwIsisHostIpAddress3, hwIsisSystemID3
// Description: IS-IS routes advertised by another device were deleted. Log in to the possibly faulty device. If the device is deleting routes, reset or isolate it from the network. Otherwise, check other devices.
trapMap["1.3.6.1.4.1.2011.5.25.24.2.4.31"] = [
    name: "hwIsisThirdPartRouteBeDeletedByPurge",
    fields: ["hwisisSysInstance", "hwIsisHostName", "hwIsisHostIpAddress", "hwIsisSystemID", "hwisisSysLevelIndex", "hwIsisTotalNodeNum", "hwIsisHostName1", "hwIsisHostIpAddress1", "hwIsisSystemID1", "hwIsisHostName2", "hwIsisHostIpAddress2", "hwIsisSystemID2", "hwIsisHostName3", "hwIsisHostIpAddress3", "hwIsisSystemID3"],
    fieldOids: ["hwisisSysInstance": "1.3.6.1.4.1.2011.5.25.24.2.2.2", "hwIsisHostName": "1.3.6.1.4.1.2011.5.25.24.2.2.14", "hwIsisHostIpAddress": "1.3.6.1.4.1.2011.5.25.24.2.2.15", "hwIsisSystemID": "1.3.6.1.4.1.2011.5.25.24.2.2.21", "hwisisSysLevelIndex": "1.3.6.1.4.1.2011.5.25.24.2.2.3", "hwIsisTotalNodeNum": "1.3.6.1.4.1.2011.5.25.24.2.2.18", "hwIsisHostName1": "1.3.6.1.4.1.2011.5.25.24.2.2.22", "hwIsisHostIpAddress1": "1.3.6.1.4.1.2011.5.25.24.2.2.23", "hwIsisSystemID1": "1.3.6.1.4.1.2011.5.25.24.2.2.24", "hwIsisHostName2": "1.3.6.1.4.1.2011.5.25.24.2.2.25", "hwIsisHostIpAddress2": "1.3.6.1.4.1.2011.5.25.24.2.2.26", "hwIsisSystemID2": "1.3.6.1.4.1.2011.5.25.24.2.2.27", "hwIsisHostName3": "1.3.6.1.4.1.2011.5.25.24.2.2.28", "hwIsisHostIpAddress3": "1.3.6.1.4.1.2011.5.25.24.2.2.29", "hwIsisSystemID3": "1.3.6.1.4.1.2011.5.25.24.2.2.30"]
]

// --- hwIsisThirdPartRouteBeDeletedByPurgeClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.24.2.4.32
// Fields: hwisisSysInstance, hwIsisHostName, hwIsisHostIpAddress, hwIsisSystemID, hwisisSysLevelIndex
// Description: IS-IS routes advertised by another device were not deleted.
trapMap["1.3.6.1.4.1.2011.5.25.24.2.4.32"] = [
    name: "hwIsisThirdPartRouteBeDeletedByPurgeClear",
    fields: ["hwisisSysInstance", "hwIsisHostName", "hwIsisHostIpAddress", "hwIsisSystemID", "hwisisSysLevelIndex"],
    fieldOids: ["hwisisSysInstance": "1.3.6.1.4.1.2011.5.25.24.2.2.2", "hwIsisHostName": "1.3.6.1.4.1.2011.5.25.24.2.2.14", "hwIsisHostIpAddress": "1.3.6.1.4.1.2011.5.25.24.2.2.15", "hwIsisSystemID": "1.3.6.1.4.1.2011.5.25.24.2.2.21", "hwisisSysLevelIndex": "1.3.6.1.4.1.2011.5.25.24.2.2.3"]
]

// --- hwIsisAuthModeInsecure (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.24.2.4.33
// Fields: hwIsisInsecureAuthMode
// Description: This object indicates that an insecure authentication mode is configured for IS-IS.
trapMap["1.3.6.1.4.1.2011.5.25.24.2.4.33"] = [
    name: "hwIsisAuthModeInsecure",
    fields: ["hwIsisInsecureAuthMode"],
    fieldOids: ["hwIsisInsecureAuthMode": "1.3.6.1.4.1.2011.5.25.24.2.2.31"]
]

// --- hwIsisAuthModeInsecureClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.24.2.4.34
// Fields: hwIsisInsecureAuthMode
// Description: This object indicates that the insecure authentication mode configured for IS-IS is deleted.
trapMap["1.3.6.1.4.1.2011.5.25.24.2.4.34"] = [
    name: "hwIsisAuthModeInsecureClear",
    fields: ["hwIsisInsecureAuthMode"],
    fieldOids: ["hwIsisInsecureAuthMode": "1.3.6.1.4.1.2011.5.25.24.2.2.31"]
]

// --- hwRouteLoopDetected (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.24.2.4.35
// Fields: hwLoopDetectType, hwLoopDetectProtocol, hwLoopDetectProtocolAttr, hwLoopDetectRedistributeID1, hwLoopDetectRedistributeID2
// Description: This object indicates that a routing loop has been detected on the local device.
trapMap["1.3.6.1.4.1.2011.5.25.24.2.4.35"] = [
    name: "hwRouteLoopDetected",
    fields: ["hwLoopDetectType", "hwLoopDetectProtocol", "hwLoopDetectProtocolAttr", "hwLoopDetectRedistributeID1", "hwLoopDetectRedistributeID2"],
    fieldOids: ["hwLoopDetectType": "1.3.6.1.4.1.2011.5.25.24.2.2.32", "hwLoopDetectProtocol": "1.3.6.1.4.1.2011.5.25.24.2.2.33", "hwLoopDetectProtocolAttr": "1.3.6.1.4.1.2011.5.25.24.2.2.34", "hwLoopDetectRedistributeID1": "1.3.6.1.4.1.2011.5.25.24.2.2.35", "hwLoopDetectRedistributeID2": "1.3.6.1.4.1.2011.5.25.24.2.2.36"]
]

// --- hwRouteLoopDetectedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.24.2.4.36
// Fields: hwLoopDetectType, hwLoopDetectProtocol, hwLoopDetectProtocolAttr, hwLoopDetectRedistributeID1, hwLoopDetectRedistributeID2
// Description: This object indicates that the routing loop is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.24.2.4.36"] = [
    name: "hwRouteLoopDetectedClear",
    fields: ["hwLoopDetectType", "hwLoopDetectProtocol", "hwLoopDetectProtocolAttr", "hwLoopDetectRedistributeID1", "hwLoopDetectRedistributeID2"],
    fieldOids: ["hwLoopDetectType": "1.3.6.1.4.1.2011.5.25.24.2.2.32", "hwLoopDetectProtocol": "1.3.6.1.4.1.2011.5.25.24.2.2.33", "hwLoopDetectProtocolAttr": "1.3.6.1.4.1.2011.5.25.24.2.2.34", "hwLoopDetectRedistributeID1": "1.3.6.1.4.1.2011.5.25.24.2.2.35", "hwLoopDetectRedistributeID2": "1.3.6.1.4.1.2011.5.25.24.2.2.36"]
]

// --- hwIsisImportRouteReachMax (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.24.2.4.37
// Fields: hwisisSysInstance, hwisisImportRouteMax
// Description: The number of import routes in this IS-IS process reached or exceeded the maximum.
trapMap["1.3.6.1.4.1.2011.5.25.24.2.4.37"] = [
    name: "hwIsisImportRouteReachMax",
    fields: ["hwisisSysInstance", "hwisisImportRouteMax"],
    fieldOids: ["hwisisSysInstance": "1.3.6.1.4.1.2011.5.25.24.2.2.2", "hwisisImportRouteMax": "1.3.6.1.4.1.2011.5.25.24.2.2.37"]
]

// --- hwIsisImportRouteReachMaxClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.24.2.4.38
// Fields: hwisisSysInstance, hwisisImportRouteMax
// Description: The number of import routes in this IS-IS process has been less than the maximum.
trapMap["1.3.6.1.4.1.2011.5.25.24.2.4.38"] = [
    name: "hwIsisImportRouteReachMaxClear",
    fields: ["hwisisSysInstance", "hwisisImportRouteMax"],
    fieldOids: ["hwisisSysInstance": "1.3.6.1.4.1.2011.5.25.24.2.2.2", "hwisisImportRouteMax": "1.3.6.1.4.1.2011.5.25.24.2.2.37"]
]

// --- hwIsisLinkCostAdjustment (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.24.2.4.39
// Fields: hwisisSysInstance, hwisisMtId, ifName, hwisisSysLevelIndex, hwisisCostAdjustReason, hwisisOriginalCost, hwisisAdjustedCost
// Description: An IS-IS link cost adjustment event occurs.
trapMap["1.3.6.1.4.1.2011.5.25.24.2.4.39"] = [
    name: "hwIsisLinkCostAdjustment",
    fields: ["hwisisSysInstance", "hwisisMtId", "ifName", "hwisisSysLevelIndex", "hwisisCostAdjustReason", "hwisisOriginalCost", "hwisisAdjustedCost"],
    fieldOids: ["hwisisSysInstance": "1.3.6.1.4.1.2011.5.25.24.2.2.2", "hwisisMtId": "1.3.6.1.4.1.2011.5.25.24.2.2.38", "ifName": "1.3.6.1.2.1.31.1.1.1.1", "hwisisSysLevelIndex": "1.3.6.1.4.1.2011.5.25.24.2.2.3", "hwisisCostAdjustReason": "1.3.6.1.4.1.2011.5.25.24.2.2.39", "hwisisOriginalCost": "1.3.6.1.4.1.2011.5.25.24.2.2.40", "hwisisAdjustedCost": "1.3.6.1.4.1.2011.5.25.24.2.2.41"]
]

// --- hwIsisLinkCostAdjustmentClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.24.2.4.40
// Fields: hwisisSysInstance, hwisisMtId, ifName, hwisisSysLevelIndex, hwisisCostAdjustReason, hwisisOriginalCost, hwisisAdjustedCost
// Description: An IS-IS link cost adjustment event is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.24.2.4.40"] = [
    name: "hwIsisLinkCostAdjustmentClear",
    fields: ["hwisisSysInstance", "hwisisMtId", "ifName", "hwisisSysLevelIndex", "hwisisCostAdjustReason", "hwisisOriginalCost", "hwisisAdjustedCost"],
    fieldOids: ["hwisisSysInstance": "1.3.6.1.4.1.2011.5.25.24.2.2.2", "hwisisMtId": "1.3.6.1.4.1.2011.5.25.24.2.2.38", "ifName": "1.3.6.1.2.1.31.1.1.1.1", "hwisisSysLevelIndex": "1.3.6.1.4.1.2011.5.25.24.2.2.3", "hwisisCostAdjustReason": "1.3.6.1.4.1.2011.5.25.24.2.2.39", "hwisisOriginalCost": "1.3.6.1.4.1.2011.5.25.24.2.2.40", "hwisisAdjustedCost": "1.3.6.1.4.1.2011.5.25.24.2.2.41"]
]

// --- hwisisLocatorPrefixConflict (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.24.2.4.41
// Fields: hwisisSysInstance, hwisisMtId, hwisisSysLevelIndex, hwisisIpv6PrefixAddress, hwisisIpv6PrefixAddressMask, hwIsisConflictSystemID, hwisisLocalFlexAlgorithm, hwisisRemoteFlexAlgorithm, hwIsisHostName
// Description: Locator prefix conflict with locator prefix between local and another device is detected.
trapMap["1.3.6.1.4.1.2011.5.25.24.2.4.41"] = [
    name: "hwisisLocatorPrefixConflict",
    fields: ["hwisisSysInstance", "hwisisMtId", "hwisisSysLevelIndex", "hwisisIpv6PrefixAddress", "hwisisIpv6PrefixAddressMask", "hwIsisConflictSystemID", "hwisisLocalFlexAlgorithm", "hwisisRemoteFlexAlgorithm", "hwIsisHostName"],
    fieldOids: ["hwisisSysInstance": "1.3.6.1.4.1.2011.5.25.24.2.2.2", "hwisisMtId": "1.3.6.1.4.1.2011.5.25.24.2.2.38", "hwisisSysLevelIndex": "1.3.6.1.4.1.2011.5.25.24.2.2.3", "hwisisIpv6PrefixAddress": "1.3.6.1.4.1.2011.5.25.24.2.2.42", "hwisisIpv6PrefixAddressMask": "1.3.6.1.4.1.2011.5.25.24.2.2.43", "hwIsisConflictSystemID": "1.3.6.1.4.1.2011.5.25.24.2.2.7", "hwisisLocalFlexAlgorithm": "1.3.6.1.4.1.2011.5.25.24.2.2.44", "hwisisRemoteFlexAlgorithm": "1.3.6.1.4.1.2011.5.25.24.2.2.45", "hwIsisHostName": "1.3.6.1.4.1.2011.5.25.24.2.2.14"]
]

// --- hwisisLocatorPrefixConflictClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.24.2.4.42
// Fields: hwisisSysInstance, hwisisMtId, hwisisSysLevelIndex, hwisisIpv6PrefixAddress, hwisisIpv6PrefixAddressMask, hwIsisConflictSystemID, hwisisLocalFlexAlgorithm, hwisisRemoteFlexAlgorithm, hwIsisHostName
// Description: Locator prefix conflict with locator prefix between local and another device is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.24.2.4.42"] = [
    name: "hwisisLocatorPrefixConflictClear",
    fields: ["hwisisSysInstance", "hwisisMtId", "hwisisSysLevelIndex", "hwisisIpv6PrefixAddress", "hwisisIpv6PrefixAddressMask", "hwIsisConflictSystemID", "hwisisLocalFlexAlgorithm", "hwisisRemoteFlexAlgorithm", "hwIsisHostName"],
    fieldOids: ["hwisisSysInstance": "1.3.6.1.4.1.2011.5.25.24.2.2.2", "hwisisMtId": "1.3.6.1.4.1.2011.5.25.24.2.2.38", "hwisisSysLevelIndex": "1.3.6.1.4.1.2011.5.25.24.2.2.3", "hwisisIpv6PrefixAddress": "1.3.6.1.4.1.2011.5.25.24.2.2.42", "hwisisIpv6PrefixAddressMask": "1.3.6.1.4.1.2011.5.25.24.2.2.43", "hwIsisConflictSystemID": "1.3.6.1.4.1.2011.5.25.24.2.2.7", "hwisisLocalFlexAlgorithm": "1.3.6.1.4.1.2011.5.25.24.2.2.44", "hwisisRemoteFlexAlgorithm": "1.3.6.1.4.1.2011.5.25.24.2.2.45", "hwIsisHostName": "1.3.6.1.4.1.2011.5.25.24.2.2.14"]
]

// --- hwIsisLspRetranExceedLimit (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.24.2.4.43
// Fields: hwisisSysInstance, hwIsisIfName
// Description: The number of IS-IS LSP retransmissions on an interface exceeds the limit.
trapMap["1.3.6.1.4.1.2011.5.25.24.2.4.43"] = [
    name: "hwIsisLspRetranExceedLimit",
    fields: ["hwisisSysInstance", "hwIsisIfName"],
    fieldOids: ["hwisisSysInstance": "1.3.6.1.4.1.2011.5.25.24.2.2.2", "hwIsisIfName": "1.3.6.1.4.1.2011.5.25.24.2.2.46"]
]

// --- hwIsisLspRetranExceedLimitClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.24.2.4.44
// Fields: hwisisSysInstance, hwIsisIfName
// Description: The number of IS-IS LSP retransmissions on an interface is lower than the limit.
trapMap["1.3.6.1.4.1.2011.5.25.24.2.4.44"] = [
    name: "hwIsisLspRetranExceedLimitClear",
    fields: ["hwisisSysInstance", "hwIsisIfName"],
    fieldOids: ["hwisisSysInstance": "1.3.6.1.4.1.2011.5.25.24.2.2.2", "hwIsisIfName": "1.3.6.1.4.1.2011.5.25.24.2.2.46"]
]

// --- hwisisNetSliceSrcPrefixConflict (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.24.2.4.45
// Fields: hwisisSysInstance, hwisisMtId, hwisisSysLevelIndex, hwisisIpv6PrefixAddress, hwisisIpv6PrefixAddressMask, hwIsisConflictSystemID, hwIsisHostName
// Description: A conflict between the network slice source prefix of the local device and the IPv6 prefix of another device is detected.
trapMap["1.3.6.1.4.1.2011.5.25.24.2.4.45"] = [
    name: "hwisisNetSliceSrcPrefixConflict",
    fields: ["hwisisSysInstance", "hwisisMtId", "hwisisSysLevelIndex", "hwisisIpv6PrefixAddress", "hwisisIpv6PrefixAddressMask", "hwIsisConflictSystemID", "hwIsisHostName"],
    fieldOids: ["hwisisSysInstance": "1.3.6.1.4.1.2011.5.25.24.2.2.2", "hwisisMtId": "1.3.6.1.4.1.2011.5.25.24.2.2.38", "hwisisSysLevelIndex": "1.3.6.1.4.1.2011.5.25.24.2.2.3", "hwisisIpv6PrefixAddress": "1.3.6.1.4.1.2011.5.25.24.2.2.42", "hwisisIpv6PrefixAddressMask": "1.3.6.1.4.1.2011.5.25.24.2.2.43", "hwIsisConflictSystemID": "1.3.6.1.4.1.2011.5.25.24.2.2.7", "hwIsisHostName": "1.3.6.1.4.1.2011.5.25.24.2.2.14"]
]

// --- hwisisNetSliceSrcPrefixConflictClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.24.2.4.46
// Fields: hwisisSysInstance, hwisisMtId, hwisisSysLevelIndex, hwisisIpv6PrefixAddress, hwisisIpv6PrefixAddressMask, hwIsisConflictSystemID, hwIsisHostName
// Description: The conflict between the network slice source prefix and the IPv6 prefix is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.24.2.4.46"] = [
    name: "hwisisNetSliceSrcPrefixConflictClear",
    fields: ["hwisisSysInstance", "hwisisMtId", "hwisisSysLevelIndex", "hwisisIpv6PrefixAddress", "hwisisIpv6PrefixAddressMask", "hwIsisConflictSystemID", "hwIsisHostName"],
    fieldOids: ["hwisisSysInstance": "1.3.6.1.4.1.2011.5.25.24.2.2.2", "hwisisMtId": "1.3.6.1.4.1.2011.5.25.24.2.2.38", "hwisisSysLevelIndex": "1.3.6.1.4.1.2011.5.25.24.2.2.3", "hwisisIpv6PrefixAddress": "1.3.6.1.4.1.2011.5.25.24.2.2.42", "hwisisIpv6PrefixAddressMask": "1.3.6.1.4.1.2011.5.25.24.2.2.43", "hwIsisConflictSystemID": "1.3.6.1.4.1.2011.5.25.24.2.2.7", "hwIsisHostName": "1.3.6.1.4.1.2011.5.25.24.2.2.14"]
]

// --- hwIsisAdjAfDown (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.24.2.4.47
// Fields: hwisisSysInstance, hwisisSysLevelIndex, ifIndex, ifName, hwIsisAdjSysID, hwIsisAddressFamily, hwIsisAdjAfDownReason
// Description: Only one address family of the IS-IS dual-stack neighbor is up.
trapMap["1.3.6.1.4.1.2011.5.25.24.2.4.47"] = [
    name: "hwIsisAdjAfDown",
    fields: ["hwisisSysInstance", "hwisisSysLevelIndex", "ifIndex", "ifName", "hwIsisAdjSysID", "hwIsisAddressFamily", "hwIsisAdjAfDownReason"],
    fieldOids: ["hwisisSysInstance": "1.3.6.1.4.1.2011.5.25.24.2.2.2", "hwisisSysLevelIndex": "1.3.6.1.4.1.2011.5.25.24.2.2.3", "ifIndex": "1.3.6.1.2.1.2.2.1.1", "ifName": "1.3.6.1.2.1.31.1.1.1.1", "hwIsisAdjSysID": "1.3.6.1.4.1.2011.5.25.24.2.2.5", "hwIsisAddressFamily": "1.3.6.1.4.1.2011.5.25.24.2.2.47", "hwIsisAdjAfDownReason": "1.3.6.1.4.1.2011.5.25.24.2.2.48"]
]

// --- hwIsisAdjAfDownClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.24.2.4.48
// Fields: hwisisSysInstance, hwisisSysLevelIndex, ifIndex, ifName, hwIsisAdjSysID, hwIsisAddressFamily, hwIsisAdjAfDownReason
// Description: Both IS-IS dual-stack neighbor address families are up or down.
trapMap["1.3.6.1.4.1.2011.5.25.24.2.4.48"] = [
    name: "hwIsisAdjAfDownClear",
    fields: ["hwisisSysInstance", "hwisisSysLevelIndex", "ifIndex", "ifName", "hwIsisAdjSysID", "hwIsisAddressFamily", "hwIsisAdjAfDownReason"],
    fieldOids: ["hwisisSysInstance": "1.3.6.1.4.1.2011.5.25.24.2.2.2", "hwisisSysLevelIndex": "1.3.6.1.4.1.2011.5.25.24.2.2.3", "ifIndex": "1.3.6.1.2.1.2.2.1.1", "ifName": "1.3.6.1.2.1.31.1.1.1.1", "hwIsisAdjSysID": "1.3.6.1.4.1.2011.5.25.24.2.2.5", "hwIsisAddressFamily": "1.3.6.1.4.1.2011.5.25.24.2.2.47", "hwIsisAdjAfDownReason": "1.3.6.1.4.1.2011.5.25.24.2.2.48"]
]

// --- hwIsisSystemIdCfgConflict (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.24.2.4.49
// Fields: hwisisSysInstance, hwisisSysLevelIndex, hwIsisConflictSystemID, hwIsisHostName, hwIsisAdjSysName
// Description: System ID conflict. The system ID may have been automatically recovered, but the conflicting configuration still exists.
trapMap["1.3.6.1.4.1.2011.5.25.24.2.4.49"] = [
    name: "hwIsisSystemIdCfgConflict",
    fields: ["hwisisSysInstance", "hwisisSysLevelIndex", "hwIsisConflictSystemID", "hwIsisHostName", "hwIsisAdjSysName"],
    fieldOids: ["hwisisSysInstance": "1.3.6.1.4.1.2011.5.25.24.2.2.2", "hwisisSysLevelIndex": "1.3.6.1.4.1.2011.5.25.24.2.2.3", "hwIsisConflictSystemID": "1.3.6.1.4.1.2011.5.25.24.2.2.7", "hwIsisHostName": "1.3.6.1.4.1.2011.5.25.24.2.2.14", "hwIsisAdjSysName": "1.3.6.1.4.1.2011.5.25.24.2.2.6"]
]

// --- hwIsisSystemIdCfgConflictClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.24.2.4.50
// Fields: hwisisSysInstance, hwisisSysLevelIndex, hwIsisConflictSystemID, hwIsisHostName, hwIsisAdjSysName
// Description: The system ID conflict has been cleared.
trapMap["1.3.6.1.4.1.2011.5.25.24.2.4.50"] = [
    name: "hwIsisSystemIdCfgConflictClear",
    fields: ["hwisisSysInstance", "hwisisSysLevelIndex", "hwIsisConflictSystemID", "hwIsisHostName", "hwIsisAdjSysName"],
    fieldOids: ["hwisisSysInstance": "1.3.6.1.4.1.2011.5.25.24.2.2.2", "hwisisSysLevelIndex": "1.3.6.1.4.1.2011.5.25.24.2.2.3", "hwIsisConflictSystemID": "1.3.6.1.4.1.2011.5.25.24.2.2.7", "hwIsisHostName": "1.3.6.1.4.1.2011.5.25.24.2.2.14", "hwIsisAdjSysName": "1.3.6.1.4.1.2011.5.25.24.2.2.6"]
]

// --- hwisisDatabaseOverload (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.24.2.4.51
// Fields: hwisisSysInstance
// Description: IS-IS LSP at this node is overloaded start.
trapMap["1.3.6.1.4.1.2011.5.25.24.2.4.51"] = [
    name: "hwisisDatabaseOverload",
    fields: ["hwisisSysInstance"],
    fieldOids: ["hwisisSysInstance": "1.3.6.1.4.1.2011.5.25.24.2.2.2"]
]

// --- hwisisDatabaseOverloadClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.24.2.4.52
// Fields: hwisisSysInstance
// Description: IS-IS LSP at this node is overloaded end.
trapMap["1.3.6.1.4.1.2011.5.25.24.2.4.52"] = [
    name: "hwisisDatabaseOverloadClear",
    fields: ["hwisisSysInstance"],
    fieldOids: ["hwisisSysInstance": "1.3.6.1.4.1.2011.5.25.24.2.2.2"]
]

// --- hwIsisIPConflict (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.24.2.4.53
// Fields: hwisisSysInstance, hwisisSysLevelIndex, hwIsisConflictType, hwIsisConflictIpAddr, hwIsisConflictSystemID, hwIsisConflictSystemID2
// Description: The IS-IS IP address conflict between the local device and another device is detected.
trapMap["1.3.6.1.4.1.2011.5.25.24.2.4.53"] = [
    name: "hwIsisIPConflict",
    fields: ["hwisisSysInstance", "hwisisSysLevelIndex", "hwIsisConflictType", "hwIsisConflictIpAddr", "hwIsisConflictSystemID", "hwIsisConflictSystemID2"],
    fieldOids: ["hwisisSysInstance": "1.3.6.1.4.1.2011.5.25.24.2.2.2", "hwisisSysLevelIndex": "1.3.6.1.4.1.2011.5.25.24.2.2.3", "hwIsisConflictType": "1.3.6.1.4.1.2011.5.25.24.2.2.50", "hwIsisConflictIpAddr": "1.3.6.1.4.1.2011.5.25.24.2.2.51", "hwIsisConflictSystemID": "1.3.6.1.4.1.2011.5.25.24.2.2.7", "hwIsisConflictSystemID2": "1.3.6.1.4.1.2011.5.25.24.2.2.49"]
]

// --- hwIsisIPConflictClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.24.2.4.54
// Fields: hwisisSysInstance, hwisisSysLevelIndex, hwIsisConflictType, hwIsisConflictIpAddr, hwIsisConflictSystemID, hwIsisConflictSystemID2
// Description: The IS-IS IP address conflict between the local device and another device is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.24.2.4.54"] = [
    name: "hwIsisIPConflictClear",
    fields: ["hwisisSysInstance", "hwisisSysLevelIndex", "hwIsisConflictType", "hwIsisConflictIpAddr", "hwIsisConflictSystemID", "hwIsisConflictSystemID2"],
    fieldOids: ["hwisisSysInstance": "1.3.6.1.4.1.2011.5.25.24.2.2.2", "hwisisSysLevelIndex": "1.3.6.1.4.1.2011.5.25.24.2.2.3", "hwIsisConflictType": "1.3.6.1.4.1.2011.5.25.24.2.2.50", "hwIsisConflictIpAddr": "1.3.6.1.4.1.2011.5.25.24.2.2.51", "hwIsisConflictSystemID": "1.3.6.1.4.1.2011.5.25.24.2.2.7", "hwIsisConflictSystemID2": "1.3.6.1.4.1.2011.5.25.24.2.2.49"]
]

// --- hwIsisInstanceIdMismatch (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.24.2.4.55
// Fields: hwisisSysInstance, ifIndex, ifName, hwIsisAdjSysID, hwIsisAdjSysInstance
// Description: The local device detected that the instance ID was mismatched with that of a neighboring device.
trapMap["1.3.6.1.4.1.2011.5.25.24.2.4.55"] = [
    name: "hwIsisInstanceIdMismatch",
    fields: ["hwisisSysInstance", "ifIndex", "ifName", "hwIsisAdjSysID", "hwIsisAdjSysInstance"],
    fieldOids: ["hwisisSysInstance": "1.3.6.1.4.1.2011.5.25.24.2.2.2", "ifIndex": "1.3.6.1.2.1.2.2.1.1", "ifName": "1.3.6.1.2.1.31.1.1.1.1", "hwIsisAdjSysID": "1.3.6.1.4.1.2011.5.25.24.2.2.5", "hwIsisAdjSysInstance": "1.3.6.1.4.1.2011.5.25.24.2.2.52"]
]

// --- hwIsisInstanceIdMismatchClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.24.2.4.56
// Fields: hwisisSysInstance, ifIndex, ifName, hwIsisAdjSysID, hwIsisAdjSysInstance
// Description: The instance ID mismatch with its neighboring device has been cleared.
trapMap["1.3.6.1.4.1.2011.5.25.24.2.4.56"] = [
    name: "hwIsisInstanceIdMismatchClear",
    fields: ["hwisisSysInstance", "ifIndex", "ifName", "hwIsisAdjSysID", "hwIsisAdjSysInstance"],
    fieldOids: ["hwisisSysInstance": "1.3.6.1.4.1.2011.5.25.24.2.2.2", "ifIndex": "1.3.6.1.2.1.2.2.1.1", "ifName": "1.3.6.1.2.1.31.1.1.1.1", "hwIsisAdjSysID": "1.3.6.1.4.1.2011.5.25.24.2.2.5", "hwIsisAdjSysInstance": "1.3.6.1.4.1.2011.5.25.24.2.2.52"]
]

// --- hwIsisSrv6PortLcsInactive (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.24.2.4.57
// Fields: hwisisSysInstance, hwIsisIfName, hwIsisIfCount
// Description: No SRv6 license authorization was available.
trapMap["1.3.6.1.4.1.2011.5.25.24.2.4.57"] = [
    name: "hwIsisSrv6PortLcsInactive",
    fields: ["hwisisSysInstance", "hwIsisIfName", "hwIsisIfCount"],
    fieldOids: ["hwisisSysInstance": "1.3.6.1.4.1.2011.5.25.24.2.2.2", "hwIsisIfName": "1.3.6.1.4.1.2011.5.25.24.2.2.46", "hwIsisIfCount": "1.3.6.1.4.1.2011.5.25.24.2.2.53"]
]

// --- hwIsisSrv6PortLcsInactiveClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.24.2.4.58
// Fields: hwisisSysInstance, hwIsisIfName, hwIsisIfCount
// Description: The alarm indicating that no SRv6 license authorization was available was cleared.
trapMap["1.3.6.1.4.1.2011.5.25.24.2.4.58"] = [
    name: "hwIsisSrv6PortLcsInactiveClear",
    fields: ["hwisisSysInstance", "hwIsisIfName", "hwIsisIfCount"],
    fieldOids: ["hwisisSysInstance": "1.3.6.1.4.1.2011.5.25.24.2.2.2", "hwIsisIfName": "1.3.6.1.4.1.2011.5.25.24.2.2.46", "hwIsisIfCount": "1.3.6.1.4.1.2011.5.25.24.2.2.53"]
]

// --- hwIsisSrMplsPortLcsInactive (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.24.2.4.59
// Fields: hwisisSysInstance, hwIsisIfName, hwIsisIfCount
// Description: No SR-MPLS license authorization was available.
trapMap["1.3.6.1.4.1.2011.5.25.24.2.4.59"] = [
    name: "hwIsisSrMplsPortLcsInactive",
    fields: ["hwisisSysInstance", "hwIsisIfName", "hwIsisIfCount"],
    fieldOids: ["hwisisSysInstance": "1.3.6.1.4.1.2011.5.25.24.2.2.2", "hwIsisIfName": "1.3.6.1.4.1.2011.5.25.24.2.2.46", "hwIsisIfCount": "1.3.6.1.4.1.2011.5.25.24.2.2.53"]
]

// --- hwIsisSrMplsPortLcsInactiveClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.24.2.4.60
// Fields: hwisisSysInstance, hwIsisIfName, hwIsisIfCount
// Description: The alarm indicating that no SR-MPLS license authorization was available was cleared.
trapMap["1.3.6.1.4.1.2011.5.25.24.2.4.60"] = [
    name: "hwIsisSrMplsPortLcsInactiveClear",
    fields: ["hwisisSysInstance", "hwIsisIfName", "hwIsisIfCount"],
    fieldOids: ["hwisisSysInstance": "1.3.6.1.4.1.2011.5.25.24.2.2.2", "hwIsisIfName": "1.3.6.1.4.1.2011.5.25.24.2.2.46", "hwIsisIfCount": "1.3.6.1.4.1.2011.5.25.24.2.2.53"]
]

// --- hwIsisAdaptiveCongestState (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.24.2.4.61
// Fields: hwisisSysInstance, hwIsisAdjSysID, hwIsisHostName
// Description: The IS-IS link to the neighbor is congested. As a result, some routes may enter the adaptive state.
trapMap["1.3.6.1.4.1.2011.5.25.24.2.4.61"] = [
    name: "hwIsisAdaptiveCongestState",
    fields: ["hwisisSysInstance", "hwIsisAdjSysID", "hwIsisHostName"],
    fieldOids: ["hwisisSysInstance": "1.3.6.1.4.1.2011.5.25.24.2.2.2", "hwIsisAdjSysID": "1.3.6.1.4.1.2011.5.25.24.2.2.5", "hwIsisHostName": "1.3.6.1.4.1.2011.5.25.24.2.2.14"]
]

// --- hwIsisAdaptiveCongestStateClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.24.2.4.62
// Fields: hwisisSysInstance, hwIsisAdjSysID, hwIsisHostName
// Description: The adaptive status of the IS-IS link is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.24.2.4.62"] = [
    name: "hwIsisAdaptiveCongestStateClear",
    fields: ["hwisisSysInstance", "hwIsisAdjSysID", "hwIsisHostName"],
    fieldOids: ["hwisisSysInstance": "1.3.6.1.4.1.2011.5.25.24.2.2.2", "hwIsisAdjSysID": "1.3.6.1.4.1.2011.5.25.24.2.2.5", "hwIsisHostName": "1.3.6.1.4.1.2011.5.25.24.2.2.14"]
]

// --- hwIsisEnterAdaptiveCongestState (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.24.2.4.63
// Fields: hwisisSysInstance, hwIsisAdjSysID, hwIsisHostName, hwIsisArState
// Description: The IS-IS link to the neighbor is congested. As a result, some routes may enter the adaptive state.
trapMap["1.3.6.1.4.1.2011.5.25.24.2.4.63"] = [
    name: "hwIsisEnterAdaptiveCongestState",
    fields: ["hwisisSysInstance", "hwIsisAdjSysID", "hwIsisHostName", "hwIsisArState"],
    fieldOids: ["hwisisSysInstance": "1.3.6.1.4.1.2011.5.25.24.2.2.2", "hwIsisAdjSysID": "1.3.6.1.4.1.2011.5.25.24.2.2.5", "hwIsisHostName": "1.3.6.1.4.1.2011.5.25.24.2.2.14", "hwIsisArState": "1.3.6.1.4.1.2011.5.25.24.2.2.54"]
]

// --- hwIsisExitAdaptiveCongestState (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.24.2.4.64
// Fields: hwisisSysInstance, hwIsisAdjSysID, hwIsisHostName
// Description: The adaptive status of the IS-IS link is cleared
trapMap["1.3.6.1.4.1.2011.5.25.24.2.4.64"] = [
    name: "hwIsisExitAdaptiveCongestState",
    fields: ["hwisisSysInstance", "hwIsisAdjSysID", "hwIsisHostName"],
    fieldOids: ["hwisisSysInstance": "1.3.6.1.4.1.2011.5.25.24.2.2.2", "hwIsisAdjSysID": "1.3.6.1.4.1.2011.5.25.24.2.2.5", "hwIsisHostName": "1.3.6.1.4.1.2011.5.25.24.2.2.14"]
]

// ===== Parsing logic =====

// Set to true to enable diagnostic logging for this MIB parser
DEBUG = false

LOG_PREFIX = "[HUAWEI-ISIS-CONF-MIB]"
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
