/**
 * Auto-generated from HUAWEI-VNE-MIB.mib
 * Generated: 2026-08-24T18:28:31.346799600
 * Traps/Notifications (95): hwVFabPlaneFail, hwVFabPlaneFailResum, hwVFabHealthyFail, hwVFabHealthyFailResum, hwCreateVmFail, hwCreateVmFailResum, hwVNEDatabaseDisConnected, hwVNEDatabaseConnectionResume, hwVNEDatabaseServiceMemoryOverload, hwVNEDatabaseServiceMemoryOverloadResume, hwVNEDatabaseServiceHealthCheck, hwVNEDatabaseServiceHealthCheckResume, hwULPULicenseLimit, hwULPULicenseLimitResume, hwULPULicenseReachThreshold, hwULPULicenseReachThresholdResume, hwCuInterfaceVersionNegotiationFail, hwCuInterfaceVersionNegotiationFailResume, hwCpConflictIPAlarm, hwUpConflictIPAlarm, hwAntiSplitBrainFuncFailAlarm, hwAntiSplitBrainFuncFailResume, hwAntiSplitBrainFuncReliabilityDeAlarm, hwAntiSplitBrainFuncReliabilityDeResume, hwVoteNodeReachThreshold, hwVoteNodeReachThresholdResume, hwHeartbeatSignalDisconnectAlarm, hwHeartbeatSignalDisconnectResume, hwDisasterModeAlarm, hwDisasterModeResume, hwDisasterPriCflitAlarm, hwDisasterPriCflitResume, hwDisasterRoleChangEvent, hwDisasterUPversionAlarm, hwDisasterUPversionResume, hwDisasterUpNumAlarm, hwDisasterUpNumResume, hwRdsTunnelCongestionAlarm, hwRdsTunnelCongestionResume, hwBrasDisasterBackupTriggerFail, hwBrasDisasterBackupTriggerFailResume, hwDisasterGrpConfigInconsistent, hwDisasterGrpConfigConsistent, hwDisasterConfigInconsistent, hwDisasterConfigConsistent, hwRdsTunnelDisconnectAlarm, hwRdsTunnelDisconnectResume, hwDisasterRecoveryRoleChangeAlarm, hwDisasterRecoveryRoleChangeAlarmResume, hwDisasterBackupAbnormal, hwDisasterBackupAbnormalResume, hwDisasterUserNumMissmatchAlarm, hwDisasterUserNumMissmatchAlarmResume, hwCuNotSupportServiceAlarm, hwCuUpBoardNotSupportBasAlarm, hwCuUpBoardNotSupportBasAlarmResume, hwWarmBackupNotEffectiveAlarm, hwCuCpRoleConflict, hwCuCpRoleConflictResume, hwGmdbCpuOverLoadAlarm, hwGmdbCpuOverLoadResume, hwGmdbQueueOverLoadAlarm, hwGmdbQueueOverLoadResume, hwGmdbMemoryOverLoadAlarm, hwGmdbMemoryOverLoadResume, hwGmdbFlowCtrlAlarm, hwGmdbFlowCtrlResume, hwGmdbCnLostAlarm, hwGmdbCnLostResume, hwGmdbReplicaLostAlarm, hwGmdbReplicaLostResume, hwGmdbDnCrashAlarm, hwGmdbDnCrashResume, hwGmdbMigrateUnfinishedAlarm, hwGmdbMigrateUnfinishedResume, hwHotStandbyBackupErr, hwHotStandbyBackupErrResume, hwCuIpv4FramedRouteThresholdAlarm, hwCuIpv4FramedRouteThresholdAlarmResume, hwCuEscapeRecoveryTimeoutAlarm, hwCuEscapeRecoveryTimeoutAlarmResume, hwCuVmacFormatSupportAlarm, hwCuVmacFormatSupportAlarmResume, hwWarmLbUnevenAlarm, hwWarmLbUnevenAlarmResume, hwWarmLbUpFaultAlarm, hwWarmLbUpFaultAlarmResume, hwCuWarmLbUserTooManyAlarm, hwCuWarmLbUserTooManyAlarmResume, hwCUUPMultiRBSChannelsAlarm, hwCUUPMultiRBSChannelsAlarmResume, hwWarmLbAllocAddrFailAlarm, hwWarmLbAllocAddrFailAlarmResume, hwHotPollingUnevenAlarm, hwHotPollingUnevenAlarmResume
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

// --- hwVFabPlaneFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.345.2.1.1
// Fields: entPhysicalIndex, entPhysicalIndex, hwPlaneID, hwPlaneFailReason
// Description: fabric plane goes down.
trapMap["1.3.6.1.4.1.2011.5.25.345.2.1.1"] = [
    name: "hwVFabPlaneFail",
    fields: ["entPhysicalIndex", "entPhysicalIndex", "hwPlaneID", "hwPlaneFailReason"],
    fieldOids: ["entPhysicalIndex": "1.3.6.1.2.1.47.1.1.1.1.1", "hwPlaneID": "1.3.6.1.4.1.2011.5.25.345.1.1", "hwPlaneFailReason": "1.3.6.1.4.1.2011.5.25.345.1.2"]
]

// --- hwVFabPlaneFailResum (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.345.2.1.2
// Fields: entPhysicalIndex, entPhysicalIndex, hwPlaneID, hwPlaneFailReason
// Description: fabric plane goes up.
trapMap["1.3.6.1.4.1.2011.5.25.345.2.1.2"] = [
    name: "hwVFabPlaneFailResum",
    fields: ["entPhysicalIndex", "entPhysicalIndex", "hwPlaneID", "hwPlaneFailReason"],
    fieldOids: ["entPhysicalIndex": "1.3.6.1.2.1.47.1.1.1.1.1", "hwPlaneID": "1.3.6.1.4.1.2011.5.25.345.1.1", "hwPlaneFailReason": "1.3.6.1.4.1.2011.5.25.345.1.2"]
]

// --- hwVFabHealthyFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.345.2.1.3
// Fields: entPhysicalIndex, entPhysicalIndex, hwPlaneID, hwSubhealthyRate
// Description: fabric link goes fault.
trapMap["1.3.6.1.4.1.2011.5.25.345.2.1.3"] = [
    name: "hwVFabHealthyFail",
    fields: ["entPhysicalIndex", "entPhysicalIndex", "hwPlaneID", "hwSubhealthyRate"],
    fieldOids: ["entPhysicalIndex": "1.3.6.1.2.1.47.1.1.1.1.1", "hwPlaneID": "1.3.6.1.4.1.2011.5.25.345.1.1", "hwSubhealthyRate": "1.3.6.1.4.1.2011.5.25.345.1.3"]
]

// --- hwVFabHealthyFailResum (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.345.2.1.4
// Fields: entPhysicalIndex, entPhysicalIndex, hwPlaneID, hwSubhealthyRate
// Description: fabric link goes normal.
trapMap["1.3.6.1.4.1.2011.5.25.345.2.1.4"] = [
    name: "hwVFabHealthyFailResum",
    fields: ["entPhysicalIndex", "entPhysicalIndex", "hwPlaneID", "hwSubhealthyRate"],
    fieldOids: ["entPhysicalIndex": "1.3.6.1.2.1.47.1.1.1.1.1", "hwPlaneID": "1.3.6.1.4.1.2011.5.25.345.1.1", "hwSubhealthyRate": "1.3.6.1.4.1.2011.5.25.345.1.3"]
]

// --- hwCreateVmFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.345.2.2.1
// Fields: hwVmSlotId
// Description: Create vm goes down.
trapMap["1.3.6.1.4.1.2011.5.25.345.2.2.1"] = [
    name: "hwCreateVmFail",
    fields: ["hwVmSlotId"],
    fieldOids: ["hwVmSlotId": "1.3.6.1.4.1.2011.5.25.345.1.4"]
]

// --- hwCreateVmFailResum (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.345.2.2.2
// Fields: hwVmSlotId
// Description: Create vm goes up.
trapMap["1.3.6.1.4.1.2011.5.25.345.2.2.2"] = [
    name: "hwCreateVmFailResum",
    fields: ["hwVmSlotId"],
    fieldOids: ["hwVmSlotId": "1.3.6.1.4.1.2011.5.25.345.1.4"]
]

// --- hwVNEDatabaseDisConnected (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.345.2.3.1
// Fields: hwVNEProcessName, hwInstanceId, hwLoadbalanceInstanceId, hwDisconnectReason
// Description: The database connection is broken.
trapMap["1.3.6.1.4.1.2011.5.25.345.2.3.1"] = [
    name: "hwVNEDatabaseDisConnected",
    fields: ["hwVNEProcessName", "hwInstanceId", "hwLoadbalanceInstanceId", "hwDisconnectReason"],
    fieldOids: ["hwVNEProcessName": "1.3.6.1.4.1.2011.5.25.345.1.84", "hwInstanceId": "1.3.6.1.4.1.2011.5.25.345.1.27", "hwLoadbalanceInstanceId": "1.3.6.1.4.1.2011.5.25.345.1.85", "hwDisconnectReason": "1.3.6.1.4.1.2011.5.25.345.1.28"]
]

// --- hwVNEDatabaseConnectionResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.345.2.3.2
// Fields: hwVNEProcessName, hwInstanceId, hwLoadbalanceInstanceId, hwDisconnectReason
// Description: The database connection is resumed.
trapMap["1.3.6.1.4.1.2011.5.25.345.2.3.2"] = [
    name: "hwVNEDatabaseConnectionResume",
    fields: ["hwVNEProcessName", "hwInstanceId", "hwLoadbalanceInstanceId", "hwDisconnectReason"],
    fieldOids: ["hwVNEProcessName": "1.3.6.1.4.1.2011.5.25.345.1.84", "hwInstanceId": "1.3.6.1.4.1.2011.5.25.345.1.27", "hwLoadbalanceInstanceId": "1.3.6.1.4.1.2011.5.25.345.1.85", "hwDisconnectReason": "1.3.6.1.4.1.2011.5.25.345.1.28"]
]

// --- hwVNEDatabaseServiceMemoryOverload (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.345.2.3.7
// Fields: hwDatabaseMemoryUsage
// Description: The database service memory is overload.
trapMap["1.3.6.1.4.1.2011.5.25.345.2.3.7"] = [
    name: "hwVNEDatabaseServiceMemoryOverload",
    fields: ["hwDatabaseMemoryUsage"],
    fieldOids: ["hwDatabaseMemoryUsage": "1.3.6.1.4.1.2011.5.25.345.1.29"]
]

// --- hwVNEDatabaseServiceMemoryOverloadResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.345.2.3.8
// Fields: hwDatabaseMemoryUsage
// Description: The memory overload of database service is resumed.
trapMap["1.3.6.1.4.1.2011.5.25.345.2.3.8"] = [
    name: "hwVNEDatabaseServiceMemoryOverloadResume",
    fields: ["hwDatabaseMemoryUsage"],
    fieldOids: ["hwDatabaseMemoryUsage": "1.3.6.1.4.1.2011.5.25.345.1.29"]
]

// --- hwVNEDatabaseServiceHealthCheck (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.345.2.3.9
// Fields: hwVNEProcessName, hwUpmngInstance, hwLoadbalanceInstanceId, hwDatabaseServiceAbnormalReason
// Description: The database service is abnormal.
trapMap["1.3.6.1.4.1.2011.5.25.345.2.3.9"] = [
    name: "hwVNEDatabaseServiceHealthCheck",
    fields: ["hwVNEProcessName", "hwUpmngInstance", "hwLoadbalanceInstanceId", "hwDatabaseServiceAbnormalReason"],
    fieldOids: ["hwVNEProcessName": "1.3.6.1.4.1.2011.5.25.345.1.84", "hwUpmngInstance": "1.3.6.1.4.1.2011.5.25.345.1.82", "hwLoadbalanceInstanceId": "1.3.6.1.4.1.2011.5.25.345.1.85", "hwDatabaseServiceAbnormalReason": "1.3.6.1.4.1.2011.5.25.345.1.83"]
]

// --- hwVNEDatabaseServiceHealthCheckResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.345.2.3.10
// Fields: hwVNEProcessName, hwUpmngInstance, hwLoadbalanceInstanceId, hwDatabaseServiceAbnormalReason
// Description: The database service is resumed.
trapMap["1.3.6.1.4.1.2011.5.25.345.2.3.10"] = [
    name: "hwVNEDatabaseServiceHealthCheckResume",
    fields: ["hwVNEProcessName", "hwUpmngInstance", "hwLoadbalanceInstanceId", "hwDatabaseServiceAbnormalReason"],
    fieldOids: ["hwVNEProcessName": "1.3.6.1.4.1.2011.5.25.345.1.84", "hwUpmngInstance": "1.3.6.1.4.1.2011.5.25.345.1.82", "hwLoadbalanceInstanceId": "1.3.6.1.4.1.2011.5.25.345.1.85", "hwDatabaseServiceAbnormalReason": "1.3.6.1.4.1.2011.5.25.345.1.83"]
]

// --- hwULPULicenseLimit (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.345.2.4.1
// Fields: hwLicenseNumbers, hwUlpuNumbers
// Description: The number of ULPU resources on the device reached the license limit.
trapMap["1.3.6.1.4.1.2011.5.25.345.2.4.1"] = [
    name: "hwULPULicenseLimit",
    fields: ["hwLicenseNumbers", "hwUlpuNumbers"],
    fieldOids: ["hwLicenseNumbers": "1.3.6.1.4.1.2011.5.25.345.1.10", "hwUlpuNumbers": "1.3.6.1.4.1.2011.5.25.345.1.11"]
]

// --- hwULPULicenseLimitResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.345.2.4.2
// Fields: hwLicenseNumbers, hwUlpuNumbers
// Description: The number of ULPU resources fell below the upper license limit of the device again.
trapMap["1.3.6.1.4.1.2011.5.25.345.2.4.2"] = [
    name: "hwULPULicenseLimitResume",
    fields: ["hwLicenseNumbers", "hwUlpuNumbers"],
    fieldOids: ["hwLicenseNumbers": "1.3.6.1.4.1.2011.5.25.345.1.10", "hwUlpuNumbers": "1.3.6.1.4.1.2011.5.25.345.1.11"]
]

// --- hwULPULicenseReachThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.345.2.4.3
// Fields: hwLicenseNumbers, hwUlpuNumbers, hwULPUThreshold
// Description: The number of ULPU resources on the device reached the license threshold.
trapMap["1.3.6.1.4.1.2011.5.25.345.2.4.3"] = [
    name: "hwULPULicenseReachThreshold",
    fields: ["hwLicenseNumbers", "hwUlpuNumbers", "hwULPUThreshold"],
    fieldOids: ["hwLicenseNumbers": "1.3.6.1.4.1.2011.5.25.345.1.10", "hwUlpuNumbers": "1.3.6.1.4.1.2011.5.25.345.1.11", "hwULPUThreshold": "1.3.6.1.4.1.2011.5.25.345.1.21"]
]

// --- hwULPULicenseReachThresholdResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.345.2.4.4
// Fields: hwLicenseNumbers, hwUlpuNumbers, hwULPUThreshold
// Description: The number of ULPU resources fell below the upper license threshold of the device again.
trapMap["1.3.6.1.4.1.2011.5.25.345.2.4.4"] = [
    name: "hwULPULicenseReachThresholdResume",
    fields: ["hwLicenseNumbers", "hwUlpuNumbers", "hwULPUThreshold"],
    fieldOids: ["hwLicenseNumbers": "1.3.6.1.4.1.2011.5.25.345.1.10", "hwUlpuNumbers": "1.3.6.1.4.1.2011.5.25.345.1.11", "hwULPUThreshold": "1.3.6.1.4.1.2011.5.25.345.1.21"]
]

// --- hwCuInterfaceVersionNegotiationFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.345.2.5.1
// Fields: hwCuInterfaceVersionCp, hwUpid, hwCuInterfaceVersionUp, hwCuInterfaceVersionReason
// Description: Interface version negotiation failed.
trapMap["1.3.6.1.4.1.2011.5.25.345.2.5.1"] = [
    name: "hwCuInterfaceVersionNegotiationFail",
    fields: ["hwCuInterfaceVersionCp", "hwUpid", "hwCuInterfaceVersionUp", "hwCuInterfaceVersionReason"],
    fieldOids: ["hwCuInterfaceVersionCp": "1.3.6.1.4.1.2011.5.25.345.1.12", "hwUpid": "1.3.6.1.4.1.2011.5.25.345.1.18", "hwCuInterfaceVersionUp": "1.3.6.1.4.1.2011.5.25.345.1.13", "hwCuInterfaceVersionReason": "1.3.6.1.4.1.2011.5.25.345.1.14"]
]

// --- hwCuInterfaceVersionNegotiationFailResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.345.2.5.2
// Fields: hwCuInterfaceVersionCp, hwUpid, hwCuInterfaceVersionUp, hwCuInterfaceVersionReason
// Description: Interface version negotiation failed resume.
trapMap["1.3.6.1.4.1.2011.5.25.345.2.5.2"] = [
    name: "hwCuInterfaceVersionNegotiationFailResume",
    fields: ["hwCuInterfaceVersionCp", "hwUpid", "hwCuInterfaceVersionUp", "hwCuInterfaceVersionReason"],
    fieldOids: ["hwCuInterfaceVersionCp": "1.3.6.1.4.1.2011.5.25.345.1.12", "hwUpid": "1.3.6.1.4.1.2011.5.25.345.1.18", "hwCuInterfaceVersionUp": "1.3.6.1.4.1.2011.5.25.345.1.13", "hwCuInterfaceVersionReason": "1.3.6.1.4.1.2011.5.25.345.1.14"]
]

// --- hwCpConflictIPAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.345.2.6.1
// Fields: hwCpPoolName, hwCpGateway, hwCpNetmask, hwUpid, hwUpInterface
// Description: The gateway of CP address pool is conflict with the IP address of UP interface.
trapMap["1.3.6.1.4.1.2011.5.25.345.2.6.1"] = [
    name: "hwCpConflictIPAlarm",
    fields: ["hwCpPoolName", "hwCpGateway", "hwCpNetmask", "hwUpid", "hwUpInterface"],
    fieldOids: ["hwCpPoolName": "1.3.6.1.4.1.2011.5.25.345.1.15", "hwCpGateway": "1.3.6.1.4.1.2011.5.25.345.1.16", "hwCpNetmask": "1.3.6.1.4.1.2011.5.25.345.1.17", "hwUpid": "1.3.6.1.4.1.2011.5.25.345.1.18", "hwUpInterface": "1.3.6.1.4.1.2011.5.25.345.1.19"]
]

// --- hwUpConflictIPAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.345.2.6.2
// Fields: hwCpGateway, hwCpNetmask, hwUpInterface
// Description: The IP address of UP interface is conflict with the gateway of CP address pool.
trapMap["1.3.6.1.4.1.2011.5.25.345.2.6.2"] = [
    name: "hwUpConflictIPAlarm",
    fields: ["hwCpGateway", "hwCpNetmask", "hwUpInterface"],
    fieldOids: ["hwCpGateway": "1.3.6.1.4.1.2011.5.25.345.1.16", "hwCpNetmask": "1.3.6.1.4.1.2011.5.25.345.1.17", "hwUpInterface": "1.3.6.1.4.1.2011.5.25.345.1.19"]
]

// --- hwAntiSplitBrainFuncFailAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.345.2.7.1
// Fields: hwAntiSplitBrainFuncReason
// Description: The anti-split-brain function failed to be enabled.
trapMap["1.3.6.1.4.1.2011.5.25.345.2.7.1"] = [
    name: "hwAntiSplitBrainFuncFailAlarm",
    fields: ["hwAntiSplitBrainFuncReason"],
    fieldOids: ["hwAntiSplitBrainFuncReason": "1.3.6.1.4.1.2011.5.25.345.1.20"]
]

// --- hwAntiSplitBrainFuncFailResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.345.2.7.2
// Fields: hwAntiSplitBrainFuncReason
// Description: The anti-split-brain function is enabled.
trapMap["1.3.6.1.4.1.2011.5.25.345.2.7.2"] = [
    name: "hwAntiSplitBrainFuncFailResume",
    fields: ["hwAntiSplitBrainFuncReason"],
    fieldOids: ["hwAntiSplitBrainFuncReason": "1.3.6.1.4.1.2011.5.25.345.1.20"]
]

// --- hwAntiSplitBrainFuncReliabilityDeAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.345.2.7.3
// Fields: hwAntiSplitBrainFuncReason
// Description: Anti-split-brain function reliability deteriorates.
trapMap["1.3.6.1.4.1.2011.5.25.345.2.7.3"] = [
    name: "hwAntiSplitBrainFuncReliabilityDeAlarm",
    fields: ["hwAntiSplitBrainFuncReason"],
    fieldOids: ["hwAntiSplitBrainFuncReason": "1.3.6.1.4.1.2011.5.25.345.1.20"]
]

// --- hwAntiSplitBrainFuncReliabilityDeResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.345.2.7.4
// Fields: hwAntiSplitBrainFuncReason
// Description: Anti-split-brain function reliability is resumed.
trapMap["1.3.6.1.4.1.2011.5.25.345.2.7.4"] = [
    name: "hwAntiSplitBrainFuncReliabilityDeResume",
    fields: ["hwAntiSplitBrainFuncReason"],
    fieldOids: ["hwAntiSplitBrainFuncReason": "1.3.6.1.4.1.2011.5.25.345.1.20"]
]

// --- hwVoteNodeReachThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.345.2.7.5
// Fields: hwServerName, hwMaxVoterThreshold
// Description: The number of voting nodes reached a specified maximum threshold.
trapMap["1.3.6.1.4.1.2011.5.25.345.2.7.5"] = [
    name: "hwVoteNodeReachThreshold",
    fields: ["hwServerName", "hwMaxVoterThreshold"],
    fieldOids: ["hwServerName": "1.3.6.1.4.1.2011.5.25.345.1.44", "hwMaxVoterThreshold": "1.3.6.1.4.1.2011.5.25.345.1.45"]
]

// --- hwVoteNodeReachThresholdResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.345.2.7.6
// Fields: hwServerName, hwMaxVoterThreshold
// Description: The number of voting nodes on the server fell below a specified maximum threshold.
trapMap["1.3.6.1.4.1.2011.5.25.345.2.7.6"] = [
    name: "hwVoteNodeReachThresholdResume",
    fields: ["hwServerName", "hwMaxVoterThreshold"],
    fieldOids: ["hwServerName": "1.3.6.1.4.1.2011.5.25.345.1.44", "hwMaxVoterThreshold": "1.3.6.1.4.1.2011.5.25.345.1.45"]
]

// --- hwHeartbeatSignalDisconnectAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.345.2.8.1
// Fields: hwSourceIpAddress, hwPeerIpAddress, hwDisasterRecoveryReason
// Description: The heartbeat between VNEs is abnormal.
trapMap["1.3.6.1.4.1.2011.5.25.345.2.8.1"] = [
    name: "hwHeartbeatSignalDisconnectAlarm",
    fields: ["hwSourceIpAddress", "hwPeerIpAddress", "hwDisasterRecoveryReason"],
    fieldOids: ["hwSourceIpAddress": "1.3.6.1.4.1.2011.5.25.345.1.22", "hwPeerIpAddress": "1.3.6.1.4.1.2011.5.25.345.1.23", "hwDisasterRecoveryReason": "1.3.6.1.4.1.2011.5.25.345.1.24"]
]

// --- hwHeartbeatSignalDisconnectResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.345.2.8.2
// Fields: hwSourceIpAddress, hwPeerIpAddress, hwDisasterRecoveryReason
// Description: The heartbeat between VNEs recovers.
trapMap["1.3.6.1.4.1.2011.5.25.345.2.8.2"] = [
    name: "hwHeartbeatSignalDisconnectResume",
    fields: ["hwSourceIpAddress", "hwPeerIpAddress", "hwDisasterRecoveryReason"],
    fieldOids: ["hwSourceIpAddress": "1.3.6.1.4.1.2011.5.25.345.1.22", "hwPeerIpAddress": "1.3.6.1.4.1.2011.5.25.345.1.23", "hwDisasterRecoveryReason": "1.3.6.1.4.1.2011.5.25.345.1.24"]
]

// --- hwDisasterModeAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.345.2.8.3
// Fields: hwDisasterGrpName, hwDisasterGrpLocalMode, hwDisasterGrpPeerMode
// Description: Switch mode between two VNEs negotiation confilict.
trapMap["1.3.6.1.4.1.2011.5.25.345.2.8.3"] = [
    name: "hwDisasterModeAlarm",
    fields: ["hwDisasterGrpName", "hwDisasterGrpLocalMode", "hwDisasterGrpPeerMode"],
    fieldOids: ["hwDisasterGrpName": "1.3.6.1.4.1.2011.5.25.345.1.33", "hwDisasterGrpLocalMode": "1.3.6.1.4.1.2011.5.25.345.1.34", "hwDisasterGrpPeerMode": "1.3.6.1.4.1.2011.5.25.345.1.35"]
]

// --- hwDisasterModeResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.345.2.8.4
// Fields: hwDisasterGrpName, hwDisasterGrpLocalMode, hwDisasterGrpPeerMode
// Description: Switch mode between two VNEs negotiation recovers.
trapMap["1.3.6.1.4.1.2011.5.25.345.2.8.4"] = [
    name: "hwDisasterModeResume",
    fields: ["hwDisasterGrpName", "hwDisasterGrpLocalMode", "hwDisasterGrpPeerMode"],
    fieldOids: ["hwDisasterGrpName": "1.3.6.1.4.1.2011.5.25.345.1.33", "hwDisasterGrpLocalMode": "1.3.6.1.4.1.2011.5.25.345.1.34", "hwDisasterGrpPeerMode": "1.3.6.1.4.1.2011.5.25.345.1.35"]
]

// --- hwDisasterPriCflitAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.345.2.8.5
// Fields: hwDisasterGrpName, hwLocalCfgPri, hwPeerCfgPri, hwLocalReducePri, hwPeerReducePri, hwDisasterRecoveryReason
// Description: Auto Mode Priortiy between two VNEs negotiation conflict.
trapMap["1.3.6.1.4.1.2011.5.25.345.2.8.5"] = [
    name: "hwDisasterPriCflitAlarm",
    fields: ["hwDisasterGrpName", "hwLocalCfgPri", "hwPeerCfgPri", "hwLocalReducePri", "hwPeerReducePri", "hwDisasterRecoveryReason"],
    fieldOids: ["hwDisasterGrpName": "1.3.6.1.4.1.2011.5.25.345.1.33", "hwLocalCfgPri": "1.3.6.1.4.1.2011.5.25.345.1.38", "hwPeerCfgPri": "1.3.6.1.4.1.2011.5.25.345.1.39", "hwLocalReducePri": "1.3.6.1.4.1.2011.5.25.345.1.40", "hwPeerReducePri": "1.3.6.1.4.1.2011.5.25.345.1.41", "hwDisasterRecoveryReason": "1.3.6.1.4.1.2011.5.25.345.1.24"]
]

// --- hwDisasterPriCflitResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.345.2.8.6
// Fields: hwDisasterGrpName, hwLocalCfgPri, hwPeerCfgPri, hwLocalReducePri, hwPeerReducePri, hwDisasterRecoveryReason
// Description: Auto Mode Priortiy between two VNEs negotiation recovers.
trapMap["1.3.6.1.4.1.2011.5.25.345.2.8.6"] = [
    name: "hwDisasterPriCflitResume",
    fields: ["hwDisasterGrpName", "hwLocalCfgPri", "hwPeerCfgPri", "hwLocalReducePri", "hwPeerReducePri", "hwDisasterRecoveryReason"],
    fieldOids: ["hwDisasterGrpName": "1.3.6.1.4.1.2011.5.25.345.1.33", "hwLocalCfgPri": "1.3.6.1.4.1.2011.5.25.345.1.38", "hwPeerCfgPri": "1.3.6.1.4.1.2011.5.25.345.1.39", "hwLocalReducePri": "1.3.6.1.4.1.2011.5.25.345.1.40", "hwPeerReducePri": "1.3.6.1.4.1.2011.5.25.345.1.41", "hwDisasterRecoveryReason": "1.3.6.1.4.1.2011.5.25.345.1.24"]
]

// --- hwDisasterRoleChangEvent (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.345.2.8.7
// Fields: hwDisasterGrpName, hwOriginRole, hwCurrentRole, hwDisasterRecoveryReason
// Description: Disaster recovery role switched.
trapMap["1.3.6.1.4.1.2011.5.25.345.2.8.7"] = [
    name: "hwDisasterRoleChangEvent",
    fields: ["hwDisasterGrpName", "hwOriginRole", "hwCurrentRole", "hwDisasterRecoveryReason"],
    fieldOids: ["hwDisasterGrpName": "1.3.6.1.4.1.2011.5.25.345.1.33", "hwOriginRole": "1.3.6.1.4.1.2011.5.25.345.1.42", "hwCurrentRole": "1.3.6.1.4.1.2011.5.25.345.1.43", "hwDisasterRecoveryReason": "1.3.6.1.4.1.2011.5.25.345.1.24"]
]

// --- hwDisasterUPversionAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.345.2.8.8
// Fields: hwUpid, hwDisasterGrpName
// Description: UP version does not support Disaster recovery Auto Mode.
trapMap["1.3.6.1.4.1.2011.5.25.345.2.8.8"] = [
    name: "hwDisasterUPversionAlarm",
    fields: ["hwUpid", "hwDisasterGrpName"],
    fieldOids: ["hwUpid": "1.3.6.1.4.1.2011.5.25.345.1.18", "hwDisasterGrpName": "1.3.6.1.4.1.2011.5.25.345.1.33"]
]

// --- hwDisasterUPversionResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.345.2.8.9
// Fields: hwUpid, hwDisasterGrpName, hwDisasterRecoveryReason
// Description: UP version does not support Disaster recovery Auto Mode recovered.
trapMap["1.3.6.1.4.1.2011.5.25.345.2.8.9"] = [
    name: "hwDisasterUPversionResume",
    fields: ["hwUpid", "hwDisasterGrpName", "hwDisasterRecoveryReason"],
    fieldOids: ["hwUpid": "1.3.6.1.4.1.2011.5.25.345.1.18", "hwDisasterGrpName": "1.3.6.1.4.1.2011.5.25.345.1.33", "hwDisasterRecoveryReason": "1.3.6.1.4.1.2011.5.25.345.1.24"]
]

// --- hwDisasterUpNumAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.345.2.8.10
// Fields: hwDisasterGrpName, hwDisasterGrpLocalUpNumber, hwDisasterGrpPeerUpNumber
// Description: UP number between two VNEs negotiation is not identical.
trapMap["1.3.6.1.4.1.2011.5.25.345.2.8.10"] = [
    name: "hwDisasterUpNumAlarm",
    fields: ["hwDisasterGrpName", "hwDisasterGrpLocalUpNumber", "hwDisasterGrpPeerUpNumber"],
    fieldOids: ["hwDisasterGrpName": "1.3.6.1.4.1.2011.5.25.345.1.33", "hwDisasterGrpLocalUpNumber": "1.3.6.1.4.1.2011.5.25.345.1.36", "hwDisasterGrpPeerUpNumber": "1.3.6.1.4.1.2011.5.25.345.1.37"]
]

// --- hwDisasterUpNumResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.345.2.8.11
// Fields: hwDisasterGrpName, hwDisasterGrpLocalUpNumber, hwDisasterGrpPeerUpNumber
// Description: UP number between two VNEs negotiation recovers.
trapMap["1.3.6.1.4.1.2011.5.25.345.2.8.11"] = [
    name: "hwDisasterUpNumResume",
    fields: ["hwDisasterGrpName", "hwDisasterGrpLocalUpNumber", "hwDisasterGrpPeerUpNumber"],
    fieldOids: ["hwDisasterGrpName": "1.3.6.1.4.1.2011.5.25.345.1.33", "hwDisasterGrpLocalUpNumber": "1.3.6.1.4.1.2011.5.25.345.1.36", "hwDisasterGrpPeerUpNumber": "1.3.6.1.4.1.2011.5.25.345.1.37"]
]

// --- hwRdsTunnelCongestionAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.345.2.8.12
// Fields: hwSourceIpAddress, hwPeerIpAddress, hwTcpPort, hwDisasterTunnelRecoverReason
// Description: Rds tunnel between two VNEs is under congestion.
trapMap["1.3.6.1.4.1.2011.5.25.345.2.8.12"] = [
    name: "hwRdsTunnelCongestionAlarm",
    fields: ["hwSourceIpAddress", "hwPeerIpAddress", "hwTcpPort", "hwDisasterTunnelRecoverReason"],
    fieldOids: ["hwSourceIpAddress": "1.3.6.1.4.1.2011.5.25.345.1.22", "hwPeerIpAddress": "1.3.6.1.4.1.2011.5.25.345.1.23", "hwTcpPort": "1.3.6.1.4.1.2011.5.25.345.1.79", "hwDisasterTunnelRecoverReason": "1.3.6.1.4.1.2011.5.25.345.1.80"]
]

// --- hwRdsTunnelCongestionResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.345.2.8.13
// Fields: hwSourceIpAddress, hwPeerIpAddress, hwTcpPort, hwDisasterTunnelRecoverReason
// Description: Rds tunnel congestion recovery between two VNEs.
trapMap["1.3.6.1.4.1.2011.5.25.345.2.8.13"] = [
    name: "hwRdsTunnelCongestionResume",
    fields: ["hwSourceIpAddress", "hwPeerIpAddress", "hwTcpPort", "hwDisasterTunnelRecoverReason"],
    fieldOids: ["hwSourceIpAddress": "1.3.6.1.4.1.2011.5.25.345.1.22", "hwPeerIpAddress": "1.3.6.1.4.1.2011.5.25.345.1.23", "hwTcpPort": "1.3.6.1.4.1.2011.5.25.345.1.79", "hwDisasterTunnelRecoverReason": "1.3.6.1.4.1.2011.5.25.345.1.80"]
]

// --- hwBrasDisasterBackupTriggerFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.345.2.8.14
// Fields: hwBrasDisasterUpmngInstance
// Description: User services on the disaster backup device failed to be recovered for a long period of time.
trapMap["1.3.6.1.4.1.2011.5.25.345.2.8.14"] = [
    name: "hwBrasDisasterBackupTriggerFail",
    fields: ["hwBrasDisasterUpmngInstance"],
    fieldOids: ["hwBrasDisasterUpmngInstance": "1.3.6.1.4.1.2011.5.25.345.1.81"]
]

// --- hwBrasDisasterBackupTriggerFailResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.345.2.8.15
// Fields: hwBrasDisasterUpmngInstance
// Description: User services on the disaster backup device recovered.
trapMap["1.3.6.1.4.1.2011.5.25.345.2.8.15"] = [
    name: "hwBrasDisasterBackupTriggerFailResume",
    fields: ["hwBrasDisasterUpmngInstance"],
    fieldOids: ["hwBrasDisasterUpmngInstance": "1.3.6.1.4.1.2011.5.25.345.1.81"]
]

// --- hwDisasterGrpConfigInconsistent (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.345.2.8.16
// Fields: hwDisasterGrpName
// Description: The configuration related to the disaster-recovery group of the master and slave CPs is inconsistent.
trapMap["1.3.6.1.4.1.2011.5.25.345.2.8.16"] = [
    name: "hwDisasterGrpConfigInconsistent",
    fields: ["hwDisasterGrpName"],
    fieldOids: ["hwDisasterGrpName": "1.3.6.1.4.1.2011.5.25.345.1.33"]
]

// --- hwDisasterGrpConfigConsistent (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.345.2.8.17
// Fields: hwDisasterGrpName
// Description: The configuration related to the disaster-recovery group of the master and slave CPs is consistent.
trapMap["1.3.6.1.4.1.2011.5.25.345.2.8.17"] = [
    name: "hwDisasterGrpConfigConsistent",
    fields: ["hwDisasterGrpName"],
    fieldOids: ["hwDisasterGrpName": "1.3.6.1.4.1.2011.5.25.345.1.33"]
]

// --- hwDisasterConfigInconsistent (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.345.2.8.18
// Fields: hwDisasterConfigType
// Description: Configurations on the active and standby CPs were inconsistent in a DR scenario..
trapMap["1.3.6.1.4.1.2011.5.25.345.2.8.18"] = [
    name: "hwDisasterConfigInconsistent",
    fields: ["hwDisasterConfigType"],
    fieldOids: ["hwDisasterConfigType": "1.3.6.1.4.1.2011.5.25.345.1.89"]
]

// --- hwDisasterConfigConsistent (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.345.2.8.19
// Fields: hwDisasterConfigType
// Description: Configurations on the active and standby CPs were consistent in a DR scenario.
trapMap["1.3.6.1.4.1.2011.5.25.345.2.8.19"] = [
    name: "hwDisasterConfigConsistent",
    fields: ["hwDisasterConfigType"],
    fieldOids: ["hwDisasterConfigType": "1.3.6.1.4.1.2011.5.25.345.1.89"]
]

// --- hwRdsTunnelDisconnectAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.345.2.8.20
// Fields: hwSourceIpAddress, hwPeerIpAddress, hwUpid
// Description: Backup tunnel abnormality between two VNEs.
trapMap["1.3.6.1.4.1.2011.5.25.345.2.8.20"] = [
    name: "hwRdsTunnelDisconnectAlarm",
    fields: ["hwSourceIpAddress", "hwPeerIpAddress", "hwUpid"],
    fieldOids: ["hwSourceIpAddress": "1.3.6.1.4.1.2011.5.25.345.1.22", "hwPeerIpAddress": "1.3.6.1.4.1.2011.5.25.345.1.23", "hwUpid": "1.3.6.1.4.1.2011.5.25.345.1.18"]
]

// --- hwRdsTunnelDisconnectResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.345.2.8.21
// Fields: hwSourceIpAddress, hwPeerIpAddress, hwUpid
// Description: Backup tunnel recovery between two VNEs.
trapMap["1.3.6.1.4.1.2011.5.25.345.2.8.21"] = [
    name: "hwRdsTunnelDisconnectResume",
    fields: ["hwSourceIpAddress", "hwPeerIpAddress", "hwUpid"],
    fieldOids: ["hwSourceIpAddress": "1.3.6.1.4.1.2011.5.25.345.1.22", "hwPeerIpAddress": "1.3.6.1.4.1.2011.5.25.345.1.23", "hwUpid": "1.3.6.1.4.1.2011.5.25.345.1.18"]
]

// --- hwDisasterRecoveryRoleChangeAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.345.2.8.22
// Fields: hwDisasterGrpName, hwOriginRole, hwCurrentRole
// Description: The active and standby roles in the DR group were switched.
trapMap["1.3.6.1.4.1.2011.5.25.345.2.8.22"] = [
    name: "hwDisasterRecoveryRoleChangeAlarm",
    fields: ["hwDisasterGrpName", "hwOriginRole", "hwCurrentRole"],
    fieldOids: ["hwDisasterGrpName": "1.3.6.1.4.1.2011.5.25.345.1.33", "hwOriginRole": "1.3.6.1.4.1.2011.5.25.345.1.42", "hwCurrentRole": "1.3.6.1.4.1.2011.5.25.345.1.43"]
]

// --- hwDisasterRecoveryRoleChangeAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.345.2.8.23
// Fields: hwDisasterGrpName, hwOriginRole, hwCurrentRole
// Description: The alarm caused by DR role switching was cleared.
trapMap["1.3.6.1.4.1.2011.5.25.345.2.8.23"] = [
    name: "hwDisasterRecoveryRoleChangeAlarmResume",
    fields: ["hwDisasterGrpName", "hwOriginRole", "hwCurrentRole"],
    fieldOids: ["hwDisasterGrpName": "1.3.6.1.4.1.2011.5.25.345.1.33", "hwOriginRole": "1.3.6.1.4.1.2011.5.25.345.1.42", "hwCurrentRole": "1.3.6.1.4.1.2011.5.25.345.1.43"]
]

// --- hwDisasterBackupAbnormal (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.345.2.8.24
// Fields: hwUpid, hwDisasterBackupAbnormalReasonId, hwDisasterBackupAbnormalReason
// Description: The DR backup service is abnormal.
trapMap["1.3.6.1.4.1.2011.5.25.345.2.8.24"] = [
    name: "hwDisasterBackupAbnormal",
    fields: ["hwUpid", "hwDisasterBackupAbnormalReasonId", "hwDisasterBackupAbnormalReason"],
    fieldOids: ["hwUpid": "1.3.6.1.4.1.2011.5.25.345.1.18", "hwDisasterBackupAbnormalReasonId": "1.3.6.1.4.1.2011.5.25.345.1.102", "hwDisasterBackupAbnormalReason": "1.3.6.1.4.1.2011.5.25.345.1.103"]
]

// --- hwDisasterBackupAbnormalResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.345.2.8.25
// Fields: hwUpid, hwDisasterBackupAbnormalReasonId, hwDisasterBackupAbnormalReason
// Description: The DR backup service abnormal alarm is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.345.2.8.25"] = [
    name: "hwDisasterBackupAbnormalResume",
    fields: ["hwUpid", "hwDisasterBackupAbnormalReasonId", "hwDisasterBackupAbnormalReason"],
    fieldOids: ["hwUpid": "1.3.6.1.4.1.2011.5.25.345.1.18", "hwDisasterBackupAbnormalReasonId": "1.3.6.1.4.1.2011.5.25.345.1.102", "hwDisasterBackupAbnormalReason": "1.3.6.1.4.1.2011.5.25.345.1.103"]
]

// --- hwDisasterUserNumMissmatchAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.345.2.8.26
// Fields: hwBrasDisasterUpmngInstance
// Description: Active and standby user count mismatch.
trapMap["1.3.6.1.4.1.2011.5.25.345.2.8.26"] = [
    name: "hwDisasterUserNumMissmatchAlarm",
    fields: ["hwBrasDisasterUpmngInstance"],
    fieldOids: ["hwBrasDisasterUpmngInstance": "1.3.6.1.4.1.2011.5.25.345.1.81"]
]

// --- hwDisasterUserNumMissmatchAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.345.2.8.27
// Fields: hwBrasDisasterUpmngInstance
// Description: Active and standby user counts have returned to normal.
trapMap["1.3.6.1.4.1.2011.5.25.345.2.8.27"] = [
    name: "hwDisasterUserNumMissmatchAlarmResume",
    fields: ["hwBrasDisasterUpmngInstance"],
    fieldOids: ["hwBrasDisasterUpmngInstance": "1.3.6.1.4.1.2011.5.25.345.1.81"]
]

// --- hwCuNotSupportServiceAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.345.2.9.1
// Fields: hwNotSupportServiceName, hwNotSupportModule, hwUpid
// Description: This object indicates the name of a service that does not support CU separation on the UP.
trapMap["1.3.6.1.4.1.2011.5.25.345.2.9.1"] = [
    name: "hwCuNotSupportServiceAlarm",
    fields: ["hwNotSupportServiceName", "hwNotSupportModule", "hwUpid"],
    fieldOids: ["hwNotSupportServiceName": "1.3.6.1.4.1.2011.5.25.345.1.25", "hwNotSupportModule": "1.3.6.1.4.1.2011.5.25.345.1.26", "hwUpid": "1.3.6.1.4.1.2011.5.25.345.1.18"]
]

// --- hwCuUpBoardNotSupportBasAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.345.2.9.2
// Fields: hwUpid, hwUpSlotid
// Description: The upboard does not support BAS.
trapMap["1.3.6.1.4.1.2011.5.25.345.2.9.2"] = [
    name: "hwCuUpBoardNotSupportBasAlarm",
    fields: ["hwUpid", "hwUpSlotid"],
    fieldOids: ["hwUpid": "1.3.6.1.4.1.2011.5.25.345.1.18", "hwUpSlotid": "1.3.6.1.4.1.2011.5.25.345.1.30"]
]

// --- hwCuUpBoardNotSupportBasAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.345.2.9.3
// Fields: hwUpid, hwUpSlotid
// Description: The upboard does not support BAS Resume.
trapMap["1.3.6.1.4.1.2011.5.25.345.2.9.3"] = [
    name: "hwCuUpBoardNotSupportBasAlarmResume",
    fields: ["hwUpid", "hwUpSlotid"],
    fieldOids: ["hwUpid": "1.3.6.1.4.1.2011.5.25.345.1.18", "hwUpSlotid": "1.3.6.1.4.1.2011.5.25.345.1.30"]
]

// --- hwWarmBackupNotEffectiveAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.345.2.10.1
// Fields: hwBackupNotEffectiveProfileName, hwBackupNotEffectiveReason
// Description: The function of warmbackup is not effective.
trapMap["1.3.6.1.4.1.2011.5.25.345.2.10.1"] = [
    name: "hwWarmBackupNotEffectiveAlarm",
    fields: ["hwBackupNotEffectiveProfileName", "hwBackupNotEffectiveReason"],
    fieldOids: ["hwBackupNotEffectiveProfileName": "1.3.6.1.4.1.2011.5.25.345.1.31", "hwBackupNotEffectiveReason": "1.3.6.1.4.1.2011.5.25.345.1.32"]
]

// --- hwCuCpRoleConflict (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.345.2.11.1
// Fields: hwSourceIpAddress, hwPeerIpAddress
// Description: The disaster recovery roles of two CPs conflict.
trapMap["1.3.6.1.4.1.2011.5.25.345.2.11.1"] = [
    name: "hwCuCpRoleConflict",
    fields: ["hwSourceIpAddress", "hwPeerIpAddress"],
    fieldOids: ["hwSourceIpAddress": "1.3.6.1.4.1.2011.5.25.345.1.22", "hwPeerIpAddress": "1.3.6.1.4.1.2011.5.25.345.1.23"]
]

// --- hwCuCpRoleConflictResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.345.2.11.2
// Fields: hwSourceIpAddress, hwPeerIpAddress
// Description: The conflict between the disaster recovery roles of two CPs is removed.
trapMap["1.3.6.1.4.1.2011.5.25.345.2.11.2"] = [
    name: "hwCuCpRoleConflictResume",
    fields: ["hwSourceIpAddress", "hwPeerIpAddress"],
    fieldOids: ["hwSourceIpAddress": "1.3.6.1.4.1.2011.5.25.345.1.22", "hwPeerIpAddress": "1.3.6.1.4.1.2011.5.25.345.1.23"]
]

// --- hwGmdbCpuOverLoadAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.345.2.12.1
// Fields: hwGmdbRuId, hwGmdbProcessId, hwGmdbCpuThreshold, hwGmdbCpuRecoveryThreshold, hwGmdbCpuRate
// Description: The CPU of the GMDB service end is overloaded.
trapMap["1.3.6.1.4.1.2011.5.25.345.2.12.1"] = [
    name: "hwGmdbCpuOverLoadAlarm",
    fields: ["hwGmdbRuId", "hwGmdbProcessId", "hwGmdbCpuThreshold", "hwGmdbCpuRecoveryThreshold", "hwGmdbCpuRate"],
    fieldOids: ["hwGmdbRuId": "1.3.6.1.4.1.2011.5.25.345.1.46", "hwGmdbProcessId": "1.3.6.1.4.1.2011.5.25.345.1.48", "hwGmdbCpuThreshold": "1.3.6.1.4.1.2011.5.25.345.1.50", "hwGmdbCpuRecoveryThreshold": "1.3.6.1.4.1.2011.5.25.345.1.51", "hwGmdbCpuRate": "1.3.6.1.4.1.2011.5.25.345.1.52"]
]

// --- hwGmdbCpuOverLoadResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.345.2.12.2
// Fields: hwGmdbRuId, hwGmdbProcessId, hwGmdbCpuThreshold, hwGmdbCpuRecoveryThreshold, hwGmdbCpuRate
// Description: The CPU overload of the GMDB service end is restored.
trapMap["1.3.6.1.4.1.2011.5.25.345.2.12.2"] = [
    name: "hwGmdbCpuOverLoadResume",
    fields: ["hwGmdbRuId", "hwGmdbProcessId", "hwGmdbCpuThreshold", "hwGmdbCpuRecoveryThreshold", "hwGmdbCpuRate"],
    fieldOids: ["hwGmdbRuId": "1.3.6.1.4.1.2011.5.25.345.1.46", "hwGmdbProcessId": "1.3.6.1.4.1.2011.5.25.345.1.48", "hwGmdbCpuThreshold": "1.3.6.1.4.1.2011.5.25.345.1.50", "hwGmdbCpuRecoveryThreshold": "1.3.6.1.4.1.2011.5.25.345.1.51", "hwGmdbCpuRate": "1.3.6.1.4.1.2011.5.25.345.1.52"]
]

// --- hwGmdbQueueOverLoadAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.345.2.12.3
// Fields: hwGmdbRuId, hwGmdbProcessId, hwGmdbQueueThreshold, hwGmdbQueueRecoveryThreshold, hwGmdbQueueSize
// Description: Queues on the GMDB service end are overloaded.
trapMap["1.3.6.1.4.1.2011.5.25.345.2.12.3"] = [
    name: "hwGmdbQueueOverLoadAlarm",
    fields: ["hwGmdbRuId", "hwGmdbProcessId", "hwGmdbQueueThreshold", "hwGmdbQueueRecoveryThreshold", "hwGmdbQueueSize"],
    fieldOids: ["hwGmdbRuId": "1.3.6.1.4.1.2011.5.25.345.1.46", "hwGmdbProcessId": "1.3.6.1.4.1.2011.5.25.345.1.48", "hwGmdbQueueThreshold": "1.3.6.1.4.1.2011.5.25.345.1.53", "hwGmdbQueueRecoveryThreshold": "1.3.6.1.4.1.2011.5.25.345.1.54", "hwGmdbQueueSize": "1.3.6.1.4.1.2011.5.25.345.1.55"]
]

// --- hwGmdbQueueOverLoadResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.345.2.12.4
// Fields: hwGmdbRuId, hwGmdbProcessId, hwGmdbQueueThreshold, hwGmdbQueueRecoveryThreshold, hwGmdbQueueSize
// Description: Queue overloading on the GMDB service end has been resolved.
trapMap["1.3.6.1.4.1.2011.5.25.345.2.12.4"] = [
    name: "hwGmdbQueueOverLoadResume",
    fields: ["hwGmdbRuId", "hwGmdbProcessId", "hwGmdbQueueThreshold", "hwGmdbQueueRecoveryThreshold", "hwGmdbQueueSize"],
    fieldOids: ["hwGmdbRuId": "1.3.6.1.4.1.2011.5.25.345.1.46", "hwGmdbProcessId": "1.3.6.1.4.1.2011.5.25.345.1.48", "hwGmdbQueueThreshold": "1.3.6.1.4.1.2011.5.25.345.1.53", "hwGmdbQueueRecoveryThreshold": "1.3.6.1.4.1.2011.5.25.345.1.54", "hwGmdbQueueSize": "1.3.6.1.4.1.2011.5.25.345.1.55"]
]

// --- hwGmdbMemoryOverLoadAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.345.2.12.5
// Fields: hwGmdbRuId, hwGmdbProcessId, hwGmdbMemoryThreshold, hwGmdbMemoryRecoveryThreshold, hwGmdbMemorySize
// Description: The memory on the GMDB service end is overloaded.
trapMap["1.3.6.1.4.1.2011.5.25.345.2.12.5"] = [
    name: "hwGmdbMemoryOverLoadAlarm",
    fields: ["hwGmdbRuId", "hwGmdbProcessId", "hwGmdbMemoryThreshold", "hwGmdbMemoryRecoveryThreshold", "hwGmdbMemorySize"],
    fieldOids: ["hwGmdbRuId": "1.3.6.1.4.1.2011.5.25.345.1.46", "hwGmdbProcessId": "1.3.6.1.4.1.2011.5.25.345.1.48", "hwGmdbMemoryThreshold": "1.3.6.1.4.1.2011.5.25.345.1.56", "hwGmdbMemoryRecoveryThreshold": "1.3.6.1.4.1.2011.5.25.345.1.57", "hwGmdbMemorySize": "1.3.6.1.4.1.2011.5.25.345.1.58"]
]

// --- hwGmdbMemoryOverLoadResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.345.2.12.6
// Fields: hwGmdbRuId, hwGmdbProcessId, hwGmdbMemoryThreshold, hwGmdbMemoryRecoveryThreshold, hwGmdbMemorySize
// Description: The overloaded memory on the GMDB service end is restored.
trapMap["1.3.6.1.4.1.2011.5.25.345.2.12.6"] = [
    name: "hwGmdbMemoryOverLoadResume",
    fields: ["hwGmdbRuId", "hwGmdbProcessId", "hwGmdbMemoryThreshold", "hwGmdbMemoryRecoveryThreshold", "hwGmdbMemorySize"],
    fieldOids: ["hwGmdbRuId": "1.3.6.1.4.1.2011.5.25.345.1.46", "hwGmdbProcessId": "1.3.6.1.4.1.2011.5.25.345.1.48", "hwGmdbMemoryThreshold": "1.3.6.1.4.1.2011.5.25.345.1.56", "hwGmdbMemoryRecoveryThreshold": "1.3.6.1.4.1.2011.5.25.345.1.57", "hwGmdbMemorySize": "1.3.6.1.4.1.2011.5.25.345.1.58"]
]

// --- hwGmdbFlowCtrlAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.345.2.12.7
// Fields: hwGmdbRuId, hwGmdbProcessId, hwGmdbFlowCtrlType
// Description: Flow control exists on the GMDB service end.
trapMap["1.3.6.1.4.1.2011.5.25.345.2.12.7"] = [
    name: "hwGmdbFlowCtrlAlarm",
    fields: ["hwGmdbRuId", "hwGmdbProcessId", "hwGmdbFlowCtrlType"],
    fieldOids: ["hwGmdbRuId": "1.3.6.1.4.1.2011.5.25.345.1.46", "hwGmdbProcessId": "1.3.6.1.4.1.2011.5.25.345.1.48", "hwGmdbFlowCtrlType": "1.3.6.1.4.1.2011.5.25.345.1.59"]
]

// --- hwGmdbFlowCtrlResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.345.2.12.8
// Fields: hwGmdbRuId, hwGmdbProcessId, hwGmdbFlowCtrlType
// Description: Flow control is restored on the GMDB service end.
trapMap["1.3.6.1.4.1.2011.5.25.345.2.12.8"] = [
    name: "hwGmdbFlowCtrlResume",
    fields: ["hwGmdbRuId", "hwGmdbProcessId", "hwGmdbFlowCtrlType"],
    fieldOids: ["hwGmdbRuId": "1.3.6.1.4.1.2011.5.25.345.1.46", "hwGmdbProcessId": "1.3.6.1.4.1.2011.5.25.345.1.48", "hwGmdbFlowCtrlType": "1.3.6.1.4.1.2011.5.25.345.1.59"]
]

// --- hwGmdbCnLostAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.345.2.12.9
// Fields: hwGmdbLocator
// Description: The cluster loses the master CN.
trapMap["1.3.6.1.4.1.2011.5.25.345.2.12.9"] = [
    name: "hwGmdbCnLostAlarm",
    fields: ["hwGmdbLocator"],
    fieldOids: ["hwGmdbLocator": "1.3.6.1.4.1.2011.5.25.345.1.64"]
]

// --- hwGmdbCnLostResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.345.2.12.10
// Fields: hwGmdbLocator
// Description: The new CN is elected as the master CN of the cluster.
trapMap["1.3.6.1.4.1.2011.5.25.345.2.12.10"] = [
    name: "hwGmdbCnLostResume",
    fields: ["hwGmdbLocator"],
    fieldOids: ["hwGmdbLocator": "1.3.6.1.4.1.2011.5.25.345.1.64"]
]

// --- hwGmdbReplicaLostAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.345.2.12.11
// Fields: hwGmdbRuId, hwGmdbProcessId
// Description: The partition copy on the GMDB service end is lost.
trapMap["1.3.6.1.4.1.2011.5.25.345.2.12.11"] = [
    name: "hwGmdbReplicaLostAlarm",
    fields: ["hwGmdbRuId", "hwGmdbProcessId"],
    fieldOids: ["hwGmdbRuId": "1.3.6.1.4.1.2011.5.25.345.1.46", "hwGmdbProcessId": "1.3.6.1.4.1.2011.5.25.345.1.48"]
]

// --- hwGmdbReplicaLostResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.345.2.12.12
// Fields: hwGmdbRuId, hwGmdbProcessId
// Description: The loss of partition copy on the GMDB service end has been resolved.
trapMap["1.3.6.1.4.1.2011.5.25.345.2.12.12"] = [
    name: "hwGmdbReplicaLostResume",
    fields: ["hwGmdbRuId", "hwGmdbProcessId"],
    fieldOids: ["hwGmdbRuId": "1.3.6.1.4.1.2011.5.25.345.1.46", "hwGmdbProcessId": "1.3.6.1.4.1.2011.5.25.345.1.48"]
]

// --- hwGmdbDnCrashAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.345.2.12.13
// Fields: hwGmdbRuId, hwGmdbProcessId, hwGmdbLocator, hwGmdbDnCrashType
// Description: The DN node is removed from the GMDB cluster list.
trapMap["1.3.6.1.4.1.2011.5.25.345.2.12.13"] = [
    name: "hwGmdbDnCrashAlarm",
    fields: ["hwGmdbRuId", "hwGmdbProcessId", "hwGmdbLocator", "hwGmdbDnCrashType"],
    fieldOids: ["hwGmdbRuId": "1.3.6.1.4.1.2011.5.25.345.1.46", "hwGmdbProcessId": "1.3.6.1.4.1.2011.5.25.345.1.48", "hwGmdbLocator": "1.3.6.1.4.1.2011.5.25.345.1.64", "hwGmdbDnCrashType": "1.3.6.1.4.1.2011.5.25.345.1.65"]
]

// --- hwGmdbDnCrashResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.345.2.12.14
// Fields: hwGmdbRuId, hwGmdbProcessId, hwGmdbLocator, hwGmdbDnCrashType
// Description: The DN node is added to the GMDB cluster list.
trapMap["1.3.6.1.4.1.2011.5.25.345.2.12.14"] = [
    name: "hwGmdbDnCrashResume",
    fields: ["hwGmdbRuId", "hwGmdbProcessId", "hwGmdbLocator", "hwGmdbDnCrashType"],
    fieldOids: ["hwGmdbRuId": "1.3.6.1.4.1.2011.5.25.345.1.46", "hwGmdbProcessId": "1.3.6.1.4.1.2011.5.25.345.1.48", "hwGmdbLocator": "1.3.6.1.4.1.2011.5.25.345.1.64", "hwGmdbDnCrashType": "1.3.6.1.4.1.2011.5.25.345.1.65"]
]

// --- hwGmdbMigrateUnfinishedAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.345.2.12.15
// Fields: hwGmdbRuId, hwGmdbProcessId, hwGmdbExpectFinishNum, hwGmdbActualFinishNum
// Description: This alarm is generated when partition migration fails on the GMDB service end.
trapMap["1.3.6.1.4.1.2011.5.25.345.2.12.15"] = [
    name: "hwGmdbMigrateUnfinishedAlarm",
    fields: ["hwGmdbRuId", "hwGmdbProcessId", "hwGmdbExpectFinishNum", "hwGmdbActualFinishNum"],
    fieldOids: ["hwGmdbRuId": "1.3.6.1.4.1.2011.5.25.345.1.46", "hwGmdbProcessId": "1.3.6.1.4.1.2011.5.25.345.1.48", "hwGmdbExpectFinishNum": "1.3.6.1.4.1.2011.5.25.345.1.77", "hwGmdbActualFinishNum": "1.3.6.1.4.1.2011.5.25.345.1.78"]
]

// --- hwGmdbMigrateUnfinishedResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.345.2.12.16
// Fields: hwGmdbRuId, hwGmdbProcessId, hwGmdbExpectFinishNum, hwGmdbActualFinishNum
// Description: The clear alarm is generated when the partition migration failure on the GMDB service end is resolved.
trapMap["1.3.6.1.4.1.2011.5.25.345.2.12.16"] = [
    name: "hwGmdbMigrateUnfinishedResume",
    fields: ["hwGmdbRuId", "hwGmdbProcessId", "hwGmdbExpectFinishNum", "hwGmdbActualFinishNum"],
    fieldOids: ["hwGmdbRuId": "1.3.6.1.4.1.2011.5.25.345.1.46", "hwGmdbProcessId": "1.3.6.1.4.1.2011.5.25.345.1.48", "hwGmdbExpectFinishNum": "1.3.6.1.4.1.2011.5.25.345.1.77", "hwGmdbActualFinishNum": "1.3.6.1.4.1.2011.5.25.345.1.78"]
]

// --- hwHotStandbyBackupErr (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.345.2.13.1
// Fields: hwUpmngInstance
// Description: User services fail to be backed up for a long time in UP dual-device hot backup scenarios.
trapMap["1.3.6.1.4.1.2011.5.25.345.2.13.1"] = [
    name: "hwHotStandbyBackupErr",
    fields: ["hwUpmngInstance"],
    fieldOids: ["hwUpmngInstance": "1.3.6.1.4.1.2011.5.25.345.1.82"]
]

// --- hwHotStandbyBackupErrResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.345.2.13.2
// Fields: hwUpmngInstance
// Description: The backup services of the UP dual-device hot backup user are restored.
trapMap["1.3.6.1.4.1.2011.5.25.345.2.13.2"] = [
    name: "hwHotStandbyBackupErrResume",
    fields: ["hwUpmngInstance"],
    fieldOids: ["hwUpmngInstance": "1.3.6.1.4.1.2011.5.25.345.1.82"]
]

// --- hwCuIpv4FramedRouteThresholdAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.345.2.14.1
// Fields: hwUpid, hwCuIpv4FramedRouteUsage
// Description: This object indicates that the usage of ipv4 framed route exceeds the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.345.2.14.1"] = [
    name: "hwCuIpv4FramedRouteThresholdAlarm",
    fields: ["hwUpid", "hwCuIpv4FramedRouteUsage"],
    fieldOids: ["hwUpid": "1.3.6.1.4.1.2011.5.25.345.1.18", "hwCuIpv4FramedRouteUsage": "1.3.6.1.4.1.2011.5.25.345.1.86"]
]

// --- hwCuIpv4FramedRouteThresholdAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.345.2.14.2
// Fields: hwUpid, hwCuIpv4FramedRouteUsage
// Description: This object indicates that the alarm generated when the usage of ipv4 framed route falls below the threshold is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.345.2.14.2"] = [
    name: "hwCuIpv4FramedRouteThresholdAlarmResume",
    fields: ["hwUpid", "hwCuIpv4FramedRouteUsage"],
    fieldOids: ["hwUpid": "1.3.6.1.4.1.2011.5.25.345.1.18", "hwCuIpv4FramedRouteUsage": "1.3.6.1.4.1.2011.5.25.345.1.86"]
]

// --- hwCuEscapeRecoveryTimeoutAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.345.2.15.1
// Fields: hwUpBackUpGroup
// Description: The escape recovery of the UP backup group timed out.
trapMap["1.3.6.1.4.1.2011.5.25.345.2.15.1"] = [
    name: "hwCuEscapeRecoveryTimeoutAlarm",
    fields: ["hwUpBackUpGroup"],
    fieldOids: ["hwUpBackUpGroup": "1.3.6.1.4.1.2011.5.25.345.1.87"]
]

// --- hwCuEscapeRecoveryTimeoutAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.345.2.15.2
// Fields: hwUpBackUpGroup
// Description: The escape recovery of the UP backup group timed out restored.
trapMap["1.3.6.1.4.1.2011.5.25.345.2.15.2"] = [
    name: "hwCuEscapeRecoveryTimeoutAlarmResume",
    fields: ["hwUpBackUpGroup"],
    fieldOids: ["hwUpBackUpGroup": "1.3.6.1.4.1.2011.5.25.345.1.87"]
]

// --- hwCuVmacFormatSupportAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.345.2.16.1
// Fields: hwUpBackUpGroup, hwUpList
// Description: The UP does not support the format of the virtual MAC address configured for the current backup group.
trapMap["1.3.6.1.4.1.2011.5.25.345.2.16.1"] = [
    name: "hwCuVmacFormatSupportAlarm",
    fields: ["hwUpBackUpGroup", "hwUpList"],
    fieldOids: ["hwUpBackUpGroup": "1.3.6.1.4.1.2011.5.25.345.1.87", "hwUpList": "1.3.6.1.4.1.2011.5.25.345.1.88"]
]

// --- hwCuVmacFormatSupportAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.345.2.16.2
// Fields: hwUpBackUpGroup
// Description: The UP does not support the format of the virtual MAC address configured for the current backup group restored.
trapMap["1.3.6.1.4.1.2011.5.25.345.2.16.2"] = [
    name: "hwCuVmacFormatSupportAlarmResume",
    fields: ["hwUpBackUpGroup"],
    fieldOids: ["hwUpBackUpGroup": "1.3.6.1.4.1.2011.5.25.345.1.87"]
]

// --- hwWarmLbUnevenAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.345.2.17.1
// Fields: hwWarmLbName, hwAlarmInterval, hwWarmThreshold, hwSetDurationPercentage, hwActualDurationPercentage
// Description: WarmLb uneven alarm.
trapMap["1.3.6.1.4.1.2011.5.25.345.2.17.1"] = [
    name: "hwWarmLbUnevenAlarm",
    fields: ["hwWarmLbName", "hwAlarmInterval", "hwWarmThreshold", "hwSetDurationPercentage", "hwActualDurationPercentage"],
    fieldOids: ["hwWarmLbName": "1.3.6.1.4.1.2011.5.25.345.1.90", "hwAlarmInterval": "1.3.6.1.4.1.2011.5.25.345.1.91", "hwWarmThreshold": "1.3.6.1.4.1.2011.5.25.345.1.92", "hwSetDurationPercentage": "1.3.6.1.4.1.2011.5.25.345.1.93", "hwActualDurationPercentage": "1.3.6.1.4.1.2011.5.25.345.1.94"]
]

// --- hwWarmLbUnevenAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.345.2.17.2
// Fields: hwWarmLbName
// Description: WarmLb uneven alarm resume.
trapMap["1.3.6.1.4.1.2011.5.25.345.2.17.2"] = [
    name: "hwWarmLbUnevenAlarmResume",
    fields: ["hwWarmLbName"],
    fieldOids: ["hwWarmLbName": "1.3.6.1.4.1.2011.5.25.345.1.90"]
]

// --- hwWarmLbUpFaultAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.345.2.18.1
// Fields: hwUpid, hwUpFaultEventType
// Description: WarmLb up fault alarm.
trapMap["1.3.6.1.4.1.2011.5.25.345.2.18.1"] = [
    name: "hwWarmLbUpFaultAlarm",
    fields: ["hwUpid", "hwUpFaultEventType"],
    fieldOids: ["hwUpid": "1.3.6.1.4.1.2011.5.25.345.1.18", "hwUpFaultEventType": "1.3.6.1.4.1.2011.5.25.345.1.95"]
]

// --- hwWarmLbUpFaultAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.345.2.18.2
// Fields: hwUpid, hwUpFaultEventType
// Description: WarmLb up fault alarm resume.
trapMap["1.3.6.1.4.1.2011.5.25.345.2.18.2"] = [
    name: "hwWarmLbUpFaultAlarmResume",
    fields: ["hwUpid", "hwUpFaultEventType"],
    fieldOids: ["hwUpid": "1.3.6.1.4.1.2011.5.25.345.1.18", "hwUpFaultEventType": "1.3.6.1.4.1.2011.5.25.345.1.95"]
]

// --- hwCuWarmLbUserTooManyAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.345.2.19.1
// Fields: hwInstanceId, hwWarmLbName, hwWarmLbName, hwWarmLbName
// Description: WarmLb user too many alarm.
trapMap["1.3.6.1.4.1.2011.5.25.345.2.19.1"] = [
    name: "hwCuWarmLbUserTooManyAlarm",
    fields: ["hwInstanceId", "hwWarmLbName", "hwWarmLbName", "hwWarmLbName"],
    fieldOids: ["hwInstanceId": "1.3.6.1.4.1.2011.5.25.345.1.27", "hwWarmLbName": "1.3.6.1.4.1.2011.5.25.345.1.90"]
]

// --- hwCuWarmLbUserTooManyAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.345.2.19.2
// Fields: hwInstanceId, hwWarmLbName, hwWarmLbName, hwWarmLbName
// Description: WarmLb user too many alarm resume.
trapMap["1.3.6.1.4.1.2011.5.25.345.2.19.2"] = [
    name: "hwCuWarmLbUserTooManyAlarmResume",
    fields: ["hwInstanceId", "hwWarmLbName", "hwWarmLbName", "hwWarmLbName"],
    fieldOids: ["hwInstanceId": "1.3.6.1.4.1.2011.5.25.345.1.27", "hwWarmLbName": "1.3.6.1.4.1.2011.5.25.345.1.90"]
]

// --- hwCUUPMultiRBSChannelsAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.345.2.20.1
// Fields: hwUpid, hwUpid
// Description: CU UP multi rbs channels alarm.
trapMap["1.3.6.1.4.1.2011.5.25.345.2.20.1"] = [
    name: "hwCUUPMultiRBSChannelsAlarm",
    fields: ["hwUpid", "hwUpid"],
    fieldOids: ["hwUpid": "1.3.6.1.4.1.2011.5.25.345.1.18"]
]

// --- hwCUUPMultiRBSChannelsAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.345.2.20.2
// Fields: hwUpid, hwUpid
// Description: CU UP multi rbs channels alarm resume.
trapMap["1.3.6.1.4.1.2011.5.25.345.2.20.2"] = [
    name: "hwCUUPMultiRBSChannelsAlarmResume",
    fields: ["hwUpid", "hwUpid"],
    fieldOids: ["hwUpid": "1.3.6.1.4.1.2011.5.25.345.1.18"]
]

// --- hwWarmLbAllocAddrFailAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.345.2.21.1
// Fields: hwWarmLbName, hwAddrDomainList
// Description: WarmLb Alloc address fail alarm.
trapMap["1.3.6.1.4.1.2011.5.25.345.2.21.1"] = [
    name: "hwWarmLbAllocAddrFailAlarm",
    fields: ["hwWarmLbName", "hwAddrDomainList"],
    fieldOids: ["hwWarmLbName": "1.3.6.1.4.1.2011.5.25.345.1.90", "hwAddrDomainList": "1.3.6.1.4.1.2011.5.25.345.1.96"]
]

// --- hwWarmLbAllocAddrFailAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.345.2.21.2
// Fields: hwWarmLbName
// Description: WarmLb Alloc address fail alarm resume.
trapMap["1.3.6.1.4.1.2011.5.25.345.2.21.2"] = [
    name: "hwWarmLbAllocAddrFailAlarmResume",
    fields: ["hwWarmLbName"],
    fieldOids: ["hwWarmLbName": "1.3.6.1.4.1.2011.5.25.345.1.90"]
]

// --- hwHotPollingUnevenAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.345.2.22.1
// Fields: hwHotName, hwHotAlarmInterval, hwHotThreshold, hwHotSetDurationPercentage, hwHotActualDurationPercentage
// Description: Hot standby uneven alarm.
trapMap["1.3.6.1.4.1.2011.5.25.345.2.22.1"] = [
    name: "hwHotPollingUnevenAlarm",
    fields: ["hwHotName", "hwHotAlarmInterval", "hwHotThreshold", "hwHotSetDurationPercentage", "hwHotActualDurationPercentage"],
    fieldOids: ["hwHotName": "1.3.6.1.4.1.2011.5.25.345.1.97", "hwHotAlarmInterval": "1.3.6.1.4.1.2011.5.25.345.1.98", "hwHotThreshold": "1.3.6.1.4.1.2011.5.25.345.1.99", "hwHotSetDurationPercentage": "1.3.6.1.4.1.2011.5.25.345.1.100", "hwHotActualDurationPercentage": "1.3.6.1.4.1.2011.5.25.345.1.101"]
]

// --- hwHotPollingUnevenAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.345.2.22.2
// Fields: hwHotName
// Description: Hot standby uneven alarm resume.
trapMap["1.3.6.1.4.1.2011.5.25.345.2.22.2"] = [
    name: "hwHotPollingUnevenAlarmResume",
    fields: ["hwHotName"],
    fieldOids: ["hwHotName": "1.3.6.1.4.1.2011.5.25.345.1.97"]
]

// ===== Parsing logic =====

// Set to true to enable diagnostic logging for this MIB parser
DEBUG = false

LOG_PREFIX = "[HUAWEI-VNE-MIB]"
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
