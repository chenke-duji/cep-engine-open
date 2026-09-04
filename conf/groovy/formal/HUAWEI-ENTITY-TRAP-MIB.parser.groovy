/**
 * Auto-generated from HUAWEI-ENTITY-TRAP-MIB.mib
 * Generated: 2026-08-24T18:28:29.554020500
 * Traps/Notifications (415): hwChassisRemove, hwChassisInsert, hwChassisFail, hwChassisFailResume, hwChassisInvalid, hwChassisInvalidResume, hwChassisMinorAlarm, hwChassisMinorAlarmResume, hwChassisPowerChanged, hwBoardRemove, hwBoardInsert, hwBoardFail, hwBoardFailResume, hwBoardInvalid, hwBoardInvalidResume, hwBoardLeaveMaster, hwBoardBecomeMaster, hwUpMicroSwitchOpen, hwUpMicroSwitchClose, hwDownMicroSwitchOpen, hwDownMicroSwitchClose, hwBoardPowerOff, hwBandwidthOfAllCardsExceedsThreshold, hwBoardResetByCmd, hwBoardResetByCmdResume, hwBoardHeartbeatTimeout, hwBoardHeartbeatResume, hwBandwidthOfAllCardsExceedsThresholdAlarm, hwBandwidthOfAllCardsExceedsThresholdResume, hwBandwidthOfAllCardsExceedsThresholdFatalAlarm, hwBandwidthOfAllCardsExceedsThresholdFatalResume, hwPinchCardReset, hwPinchCardResetResume, hwVBoardInvalid, hwVBoardInvalidResume, hwNeedModifyCfgTrap, hwBoardWarning, hwBoardWarningResume, hwBoardPortsConflict, hwBoardEntityPowerOff, hwBoardlowmemoryoverload, hwBoardlowmemoryoverloadResume, hwBoardAdd, hwBoardDelete, hwAllLpuSfuFail, hwAllLpuSfuFailResume, hwBoardUpCoverAlarm, hwBoardUpCoverResume, hwTmPerformanceALarm, hwTmPerformanceResume, hwBiosOrBootloaderPwdError, hwBiosOrBootloaderPwdErrorResume, hwBootloaderPwdEmpty, hwBootloaderPwdEmptyResume, hwBoardOffline, hwBoardSoftwareNotSupport, hwForwardEngineInvalid, hwForwardEngineInvalidResume, hwForwardEngineFail, hwForwardEngineFailResume, hwStorageInsufficient, hwStorageInsufficientResume, hwBoardLicenseActFail, hwBoardLicenseActSuccess, hwCertExpired, hwCertExpiredResume, hwCrlInvalid, hwCrlInvalidResume, hwSlicePowerFail, hwWarmBackFail, hwTmStatusChangeAlarm, hwTmStatusChangeAlarmResume, hwBoardUpCoverStackAlarm, hwBoardUpCoverStackResume, hwBandwidthOfAllBoardsExceedsThresholdAlarm, hwBandwidthOfAllBoardsExceedsThresholdAlarmResume, hwForwardEngineModelFail, hwForwardEngineModelFailResume, hwForwardEnginePortFail, hwForwardEnginePortFailResume, hwDeviceRebootTrap, hwPKICertAboutToExpired, hwPKICertAboutToExpiredResume, hwPKICertExpired, hwPKICertExpiredResume, hwPKICRLAboutToExpired, hwPKICRLAboutToExpiredResume, hwPKICRLExpired, hwPKICRLExpiredResume, hwCardRemove, hwCardInsert, hwCardFail, hwCardFailResume, hwCardInvalid, hwCardInvalidResume, hwCardResetByCmd, hwCardResetByCmdResume, hwCardResExceed, hwCardResExceedResume, hwCardBandwidthModeChange, hwCardSplitChange, hwCardInconsistent, hwRTULicenseActSuccess, hwCardPortInvalid, hwPortGroupComboModeChange, hwOpticalRemove, hwOpticalInsert, hwOpticalFail, hwOpticalFailResume, hwOpticalInvalid, hwOpticalInvalidResume, hwOpticalPowerAlarm, hwOpticalPowerAlarmResume, hwOpticalUnAuthorized, hwOpticalUnAuthorizedResume, hwLaserNoFited, hwLaserNoFitedResume, hwOpticalTunableNotMatch, hwOpticalTunableNotMatchResume, hwGpsModuleRemove, hwGpsModuleInsert, hwOptCfgNotMatch, hwOptCfgNotMatchResume, hwOpticalBiasCurrentAlarm, hwOpticalBiasCurrentAlarmResume, hwOpticalModuleAddNotice, hwPortFhcDetectEnd, hwPortDirtyCheckEnd, hwPowerRemove, hwPowerInsert, hwPowerFail, hwPowerFailResume, hwPowerInvalid, hwPowerInvalidResume, hwPowerUnusable, hwPowerUnusableResume, hwPowerInsufficient, hwPowerInsufficientResume, hwIntegratedPowerFault, hwIntegratedPowerFaultResume, hwPowerLimited, hwFanRemove, hwFanInsert, hwFanFail, hwFanFailResume, hwFanInvalid, hwFanInvalidResume, hwFanUnusable, hwFanUnusableResume, hwFanMinorAlarm, hwFanMinorAlarmResume, hwLcdRemove, hwLcdInsert, hwLcdInvalid, hwLcdInvalidResume, hwLcdUnusable, hwLcdUnusableResume, hwCmuRemove, hwCmuInsert, hwCmuInvalid, hwCmuInvalidResume, hwCmuUnusable, hwCmuUnusableResume, hwCmuFail, hwCmuFailResume, hwCommunicateError, hwCommunicateResume, hwInnerPortPacketCrcErr, hwInnerPortPacketCrcErrResume, hwInnerPortLinkDown, hwInnerPortLinkUp, hwTempAlarm, hwTempResume, hwHumidityAlarm, hwHumidityResume, hwVoltAlarm, hwVoltResume, hwGateAlarm, hwGateResume, hwFogAlarm, hwFogResume, hwUnstableAlarm, hwUnstableResume, hwBrdTempAlarm, hwBrdTempResume, hwBrdTempFatalAlarm, hwBrdTempFatalResume, hwPowerFailureAlarm, hwPowerFailureResume, hwIOSwitchOneAlarm, hwIOSwitchOneAlarmResume, hwIOSwitchTwoAlarm, hwIOSwitchTwoAlarmResume, hwIOSwitchThreeAlarm, hwIOSwitchThreeAlarmResume, hwEntityDyingGaspEvent, hwIOSwitchAlarm, hwIOSwitchAlarmResume, hwSystemConfigError, hwSystemConfigResume, hwSystemRollback, hwVirtualAccessDrvConfigError, hwPatchDelNeedReStartTrap, hwSMSReboot, hwVirtualLicenseNearDeadline, hwVirtualLicenseExpire, hwVirtualLicenseExpResume, hwSystemConfigNotMatchTrap, hwNetconfDatabaseAbnormal, hwNetconfDatabaseRestore, hwCfgDatabaseException, hwVirtualLicenseNearDeadlineResume, hwNoConsolePassword, hwSystemLostConfig, hwPortDown, hwPortUp, hwPortNoSupportOETrap, hwPortRemove, hwPortInsert, hwPortOpticalPositionInvalid, hwPortOpticalPositionValid, hwPortInvalid, hwPortFail, hwPortFailResume, hwUserDefAlarm, hwUserDefResume, hwPeerDevPnPTrunkAggregationFailure, hwEsnMismatch, hwMacNumMismatch, hwAvaMemInsufficient, hwAvaMemInsufficientResume, hwHeatAbnormal, hwHeatNormal, hwCPUUtilizationRising, hwCPUUtilizationResume, hwCpuFail, hwCpuFailResume, hwFwdCPUUtilizationRising, hwFwdCPUUtilizationResume, hwMemUtilizationRising, hwMemUtilizationResume, hwCapMemUtilizationRising, hwCapMemUtilizationResume, hwStorageDevRemove, hwStorageDevInsert, hwPppLoopbackDetect, hwPppLoopbackDetResume, hwFileError, hwFileErrorResume, hwUSBInsert, hwUSBRemove, hwUSBUnidentified, hwUSBUnidentifiedResume, hwUsbStatusChg, hwPmuRemove, hwPmuInsert, hwPmuFail, hwPmuFailResume, hwPmuInvalid, hwPmuInvalidResume, hwRATEOFTRAFFICRising, hwRATEOFTRAFFICResume, hwBatteryFull, hwUpsFaultTrap, hwUpsFaultResume, hwUpsPowerLow, hwUpsPowerFull, hwPowerCubeAlarm, hwPowerCubeAlarmResume, hwRpsPowerRemove, hwRpsPowerInsert, hwRpsPowerOn, hwRpsPowerOff, hwRpsFanInvalid, hwRpsFanInvalidResume, hwRpsTempInvalid, hwRpsTempInvalidResume, hwBatteryGroupFault, hwBatteryGroupFaultResume, hwBatteryFault, hwBatteryFaultResume, hwBatteryMinorFault, hwBatteryMinorFaultResume, hwThreadFaultIsolate, hwDiskUtilizationRising, hwDiskUtilizationResume, hwDiskPartitionInValid, hwDiskPartitionInValidResume, hwDiskPartitionSpacinsufficient, hwDiskPartitionSpacinsufficientResume, hwDiskPartitionUseageRising, hwDiskPartitionUseageResume, hwDiskInvalid, hwDiskInvalidResume, hwDiskBadPyhsicalBlocks, hwDiskErasePyhsicalBlocks, hwVMResInconsist, hwVMResInconsistResume, hwDataplaneCpuOverloadAlarm, hwDataplaneCpuOverloadResume, hwInsSpaceLackAlarm, hwInsSpaceLackResume, hwVfpSysCheckErr, hwVfpSysCheckErrResume, hwCapCPUUtilizationRising, hwCapCPUUtilizationResume, hwCapSingleCoreCPUUtilizationRising, hwCapSingleCoreCPUUtilizationResume, hwPduNotPresent, hwPduPresent, hwPduCommLost, hwPduCommLostResume, hwPduDmuHardwareFault, hwPduDmuHardwareFaultResume, hwPduDMUAutoUpgradeFail, hwPduDMUAutoUpgradeFailResume, hwPduDacsHardwareFault, hwPduDacsHardwareFaultResume, hwPduDacsTempAlarm, hwPduDacsTempAlarmResume, hwPduDacsI2CChannelFault, hwPduDacsI2CChannelFaultResume, hwReportSyslogInfo, hwEntityNpsPatchInstallFail, hwEntityNpsPatchInstallFailResume, hwEntityNpsPatchPacketError, hwEntityNpsPatchPacketErrorResume, hwEntityNpsSysConfigError, hwEntityNpsSysConfigErrorResume, hwEntityNpsSslCertInvalidEarlyWarning, hwEntityNpsSslCertInvalidEarlyResume, hwEntityNpsSslCertInvalid, hwEntityNpsSslCertInvalidResume, hwEntityNpsDiskPartitionUsageExceedingThreshold, hwEntityNpsDiskPartitionUsageExceedingThresholdResume, hwEntityNpsDiskPartitionUnavailable, hwEntityNpsDiskPartitionUnavailableResume, hwEntityNpsDiskPartitionSpaceInsufficient, hwEntityNpsDiskPartitionSpaceInsufficientResume, hwEntityNpsExecutableFilesIncomplete, hwEntityNpsExecutableFilesIncompleteResume, hwEntityNpsSoftwareIntegrityError, hwEntityNpsSoftwareIntegrityErrorResume, hwEntityNpsOMUSyncFail, hwEntityNpsOMUSyncFailResume, hwEntityNpsVMDiskUnavailable, hwEntityNpsVMDiskUnavailableResume, hwEntityNpsDatabaseRestoreFail, hwEntityNpsSSLCertExpired, hwEntityNpsSSLCertExpiredEarlyWarning, hwEntityNpsVMResInconsist, hwEntityNpsVMResInconsistResume, hwEntityNpsVmFault, hwEntityNpsVmFaultResume, hwEntityNpsVNFMConnectFault, hwEntityNpsVNFMConnectResume, hwEntityNpsFabricOamPlaneDown, hwEntityNpsFabricOamPlaneDownResume, hwEntityNpsFabricLinkSubhealthy, hwEntityNpsFabricLinkSubhealthyResume, hwEntityNpsDriverTypeMismatch, hwEntityNpsDriverTypeMismatchResume, hwEntityNpsRuCreateFail, hwEntityNpsRuCreateFailResume, hwEntityNpsIpSecRuleFail, hwEntityNpsIpSecRuleFailResume, hwEntityNpsBaseLinkSubhealthy, hwEntityNpsBaseLinkSubhealthyResume, hwEntityConfigurationRollbackRising, hwNPDomainDropCauseCntNumabruptlyAlarm, hwNPDomainDropCauseCntNumabruptlyResume, hwNPResourceExcAlarm, hwNPResourceExcResume, hwEntityFileSystemRebuild, hwEntityFileSystemAbnormal, hwEntityFileSystemFdAlarm, hwEntityFileSystemFdResume, hwEntityFileSystemAbnormalResume, hwEntityCODECHardewareFaultAlarm, hwEntityTPMHardewareFaultAlarm, hwEntityMCUHardewareFaultAlarm, hwInternalProtocolNetworkPortFaultAlarm, hwInternalProtocolNetworkPortFaultResume, hwContainerCpuUtilizationRising, hwContainerCpuUtilizationResume, hwContainerMemUtilizationRising, hwContainerMemUtilizationResume, hwContainerStorageInsufficient, hwContainerStorageInsufficientResume, hwContainerAbnormal, hwContainerAbnormalResume, hwContainerAppAbnormal, hwContainerAppAbnormalResume, hwFrerLinkPacketLossTrap, hwFrerLinkPacketLossTrapRestore, hwSipfpmFlowOverloadTrap, hwSipfpmFlowOverloadRestoreTrap, hwSACSessionOverloadTrap, hwSACSessionOverloadRestoreTrap, hwFwdPacketLoss, hwSystemBakeupStartup, hwValveOffline, hwValveOnline, hwValveFault, hwValveNormal, hwLiquidSensorOffline, hwLiquidSensorOnline, hwLiquidLeak, hwNoLeak, hwValveCommFault, hwValveCommNormal, hwValveInspectFault, hwValveInspectNormal, hwChannelFault, hwChannelNormal
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

// --- hwChassisRemove (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.1.1
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID, hwEntityOperStatus
// Description: This object indicates that a chassis cannot be detected.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.1.1"] = [
    name: "hwChassisRemove",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID", "hwEntityOperStatus"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3", "hwEntityOperStatus": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.2"]
]

// --- hwChassisInsert (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.1.2
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID, hwEntityOperStatus
// Description: This object indicates that a chassis can be detected.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.1.2"] = [
    name: "hwChassisInsert",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID", "hwEntityOperStatus"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3", "hwEntityOperStatus": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.2"]
]

// --- hwChassisFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.1.3
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID, hwEntityTrapReasonDescr
// Description: This object indicates that a chassis encounters a partial failure.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.1.3"] = [
    name: "hwChassisFail",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID", "hwEntityTrapReasonDescr"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3", "hwEntityTrapReasonDescr": "1.3.6.1.4.1.2011.5.25.219.1.13"]
]

// --- hwChassisFailResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.1.4
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID, hwEntityTrapReasonDescr
// Description: This object indicates that a chassis recovers from a partial failure.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.1.4"] = [
    name: "hwChassisFailResume",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID", "hwEntityTrapReasonDescr"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3", "hwEntityTrapReasonDescr": "1.3.6.1.4.1.2011.5.25.219.1.13"]
]

// --- hwChassisInvalid (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.1.5
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID, hwEntityOperStatus
// Description: This object indicates that a chassis encounters an overall failure.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.1.5"] = [
    name: "hwChassisInvalid",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID", "hwEntityOperStatus"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3", "hwEntityOperStatus": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.2"]
]

// --- hwChassisInvalidResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.1.6
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID, hwEntityOperStatus
// Description: This object indicates that a chassis recovers from an overall failure.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.1.6"] = [
    name: "hwChassisInvalidResume",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID", "hwEntityOperStatus"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3", "hwEntityOperStatus": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.2"]
]

// --- hwChassisMinorAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.1.7
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID
// Description: This object indicates that a chassis encounters a minor failure.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.1.7"] = [
    name: "hwChassisMinorAlarm",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwChassisMinorAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.1.8
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID
// Description: This object indicates that a chassis recovers from a minor failure.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.1.8"] = [
    name: "hwChassisMinorAlarmResume",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwChassisPowerChanged (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.1.9
// Fields: entPhysicalIndex, entPhysicalName
// Description: The power supply type of the chassis is changed.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.1.9"] = [
    name: "hwChassisPowerChanged",
    fields: ["entPhysicalIndex", "entPhysicalName"],
    fieldOids: ["entPhysicalIndex": "1.3.6.1.2.1.47.1.1.1.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwBoardRemove (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.2.1
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapEntType, hwEntityTrapFaultID, hwEntityOperStatus
// Description: This object indicates that a board cannot be detected.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.2.1"] = [
    name: "hwBoardRemove",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapEntType", "hwEntityTrapFaultID", "hwEntityOperStatus"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapEntType": "1.3.6.1.4.1.2011.5.25.219.1.2", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3", "hwEntityOperStatus": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.2"]
]

// --- hwBoardInsert (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.2.2
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapEntType, hwEntityTrapFaultID, hwEntityOperStatus
// Description: This object indicates that a board can be detected.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.2.2"] = [
    name: "hwBoardInsert",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapEntType", "hwEntityTrapFaultID", "hwEntityOperStatus"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapEntType": "1.3.6.1.4.1.2011.5.25.219.1.2", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3", "hwEntityOperStatus": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.2"]
]

// --- hwBoardFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.2.3
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapEntType, hwEntityTrapFaultID, hwEntityTrapReasonDescr, hwEntityOperStatus
// Description: This object indicates that a board encounters a partial failure.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.2.3"] = [
    name: "hwBoardFail",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapEntType", "hwEntityTrapFaultID", "hwEntityTrapReasonDescr", "hwEntityOperStatus"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapEntType": "1.3.6.1.4.1.2011.5.25.219.1.2", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3", "hwEntityTrapReasonDescr": "1.3.6.1.4.1.2011.5.25.219.1.13", "hwEntityOperStatus": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.2"]
]

// --- hwBoardFailResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.2.4
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapEntType, hwEntityTrapFaultID, hwEntityTrapReasonDescr, hwEntityOperStatus
// Description: This object indicates that a board recovers from a partial failure.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.2.4"] = [
    name: "hwBoardFailResume",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapEntType", "hwEntityTrapFaultID", "hwEntityTrapReasonDescr", "hwEntityOperStatus"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapEntType": "1.3.6.1.4.1.2011.5.25.219.1.2", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3", "hwEntityTrapReasonDescr": "1.3.6.1.4.1.2011.5.25.219.1.13", "hwEntityOperStatus": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.2"]
]

// --- hwBoardInvalid (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.2.5
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapEntType, hwEntityTrapFaultID, hwEntityTrapReasonDescr, hwEntityOperStatus
// Description: This object indicates that a board encounters an overall failure.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.2.5"] = [
    name: "hwBoardInvalid",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapEntType", "hwEntityTrapFaultID", "hwEntityTrapReasonDescr", "hwEntityOperStatus"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapEntType": "1.3.6.1.4.1.2011.5.25.219.1.2", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3", "hwEntityTrapReasonDescr": "1.3.6.1.4.1.2011.5.25.219.1.13", "hwEntityOperStatus": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.2"]
]

// --- hwBoardInvalidResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.2.6
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapEntType, hwEntityTrapFaultID, hwEntityTrapReasonDescr, hwEntityOperStatus
// Description: This object indicates that a board recovers from an overall failure.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.2.6"] = [
    name: "hwBoardInvalidResume",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapEntType", "hwEntityTrapFaultID", "hwEntityTrapReasonDescr", "hwEntityOperStatus"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapEntType": "1.3.6.1.4.1.2011.5.25.219.1.2", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3", "hwEntityTrapReasonDescr": "1.3.6.1.4.1.2011.5.25.219.1.13", "hwEntityOperStatus": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.2"]
]

// --- hwBoardLeaveMaster (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.2.7
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapEntType, hwEntityTrapFaultID
// Description: This object indicates that a board exits from the active state.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.2.7"] = [
    name: "hwBoardLeaveMaster",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapEntType", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapEntType": "1.3.6.1.4.1.2011.5.25.219.1.2", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwBoardBecomeMaster (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.2.8
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapEntType, hwEntityTrapFaultID
// Description: This object indicates that a board enters the active state.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.2.8"] = [
    name: "hwBoardBecomeMaster",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapEntType", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapEntType": "1.3.6.1.4.1.2011.5.25.219.1.2", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwUpMicroSwitchOpen (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.2.9
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapEntType, hwEntityTrapFaultID
// Description: Up micro switch open.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.2.9"] = [
    name: "hwUpMicroSwitchOpen",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapEntType", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapEntType": "1.3.6.1.4.1.2011.5.25.219.1.2", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwUpMicroSwitchClose (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.2.10
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapEntType, hwEntityTrapFaultID
// Description: Up micro switch close.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.2.10"] = [
    name: "hwUpMicroSwitchClose",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapEntType", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapEntType": "1.3.6.1.4.1.2011.5.25.219.1.2", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwDownMicroSwitchOpen (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.2.11
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapEntType, hwEntityTrapFaultID
// Description: Down micro switch open.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.2.11"] = [
    name: "hwDownMicroSwitchOpen",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapEntType", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapEntType": "1.3.6.1.4.1.2011.5.25.219.1.2", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwDownMicroSwitchClose (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.2.12
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapEntType, hwEntityTrapFaultID
// Description: Down micro switch close.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.2.12"] = [
    name: "hwDownMicroSwitchClose",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapEntType", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapEntType": "1.3.6.1.4.1.2011.5.25.219.1.2", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwBoardPowerOff (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.2.13
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapEntType, hwEntityTrapFaultID
// Description: The LPU is powered off, because this LPU only supports the trunks with index 127 or smaller than 127.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.2.13"] = [
    name: "hwBoardPowerOff",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapEntType", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapEntType": "1.3.6.1.4.1.2011.5.25.219.1.2", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwBandwidthOfAllCardsExceedsThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.2.14
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapEntType
// Description: The total bandwidth of all cards exceeds the forwarding capacity of system control board.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.2.14"] = [
    name: "hwBandwidthOfAllCardsExceedsThreshold",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapEntType"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapEntType": "1.3.6.1.4.1.2011.5.25.219.1.2"]
]

// --- hwBoardResetByCmd (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.2.15
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapEntType, hwEntityTrapReasonDescr, hwEntityOperStatus
// Description: This object indicates that the board experiences a command-triggred reset.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.2.15"] = [
    name: "hwBoardResetByCmd",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapEntType", "hwEntityTrapReasonDescr", "hwEntityOperStatus"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapEntType": "1.3.6.1.4.1.2011.5.25.219.1.2", "hwEntityTrapReasonDescr": "1.3.6.1.4.1.2011.5.25.219.1.13", "hwEntityOperStatus": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.2"]
]

// --- hwBoardResetByCmdResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.2.16
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapEntType, hwEntityTrapReasonDescr, hwEntityOperStatus
// Description: This object indicates that the board recovers from a command-triggred reset.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.2.16"] = [
    name: "hwBoardResetByCmdResume",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapEntType", "hwEntityTrapReasonDescr", "hwEntityOperStatus"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapEntType": "1.3.6.1.4.1.2011.5.25.219.1.2", "hwEntityTrapReasonDescr": "1.3.6.1.4.1.2011.5.25.219.1.13", "hwEntityOperStatus": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.2"]
]

// --- hwBoardHeartbeatTimeout (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.2.17
// Fields: hwEntityPhysicalIndex, entPhysicalName
// Description: The heartbeat connection between the board and main control board timed out.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.2.17"] = [
    name: "hwBoardHeartbeatTimeout",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwBoardHeartbeatResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.2.18
// Fields: hwEntityPhysicalIndex, entPhysicalName
// Description: The heartbeat connection between the board and main control board was restored.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.2.18"] = [
    name: "hwBoardHeartbeatResume",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwBandwidthOfAllCardsExceedsThresholdAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.2.19
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapEntType, hwEntityThresholdValue, hwEntityThresholdCurrent
// Description: The total bandwidth of all cards exceeds the forwarding capacity of system control board.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.2.19"] = [
    name: "hwBandwidthOfAllCardsExceedsThresholdAlarm",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapEntType", "hwEntityThresholdValue", "hwEntityThresholdCurrent"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapEntType": "1.3.6.1.4.1.2011.5.25.219.1.2", "hwEntityThresholdValue": "1.3.6.1.4.1.2011.5.25.219.1.5.1.2", "hwEntityThresholdCurrent": "1.3.6.1.4.1.2011.5.25.219.1.5.1.3"]
]

// --- hwBandwidthOfAllCardsExceedsThresholdResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.2.20
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapEntType, hwEntityThresholdValue, hwEntityThresholdCurrent
// Description: The total bandwidth of all cards recovered from exceeding the forwarding capacity of system control board.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.2.20"] = [
    name: "hwBandwidthOfAllCardsExceedsThresholdResume",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapEntType", "hwEntityThresholdValue", "hwEntityThresholdCurrent"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapEntType": "1.3.6.1.4.1.2011.5.25.219.1.2", "hwEntityThresholdValue": "1.3.6.1.4.1.2011.5.25.219.1.5.1.2", "hwEntityThresholdCurrent": "1.3.6.1.4.1.2011.5.25.219.1.5.1.3"]
]

// --- hwBandwidthOfAllCardsExceedsThresholdFatalAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.2.21
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapEntType, hwEntityThresholdCritical, hwEntityThresholdCurrent
// Description: The total bandwidth of all cards exceeds the fatal forwarding capacity of system control board.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.2.21"] = [
    name: "hwBandwidthOfAllCardsExceedsThresholdFatalAlarm",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapEntType", "hwEntityThresholdCritical", "hwEntityThresholdCurrent"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapEntType": "1.3.6.1.4.1.2011.5.25.219.1.2", "hwEntityThresholdCritical": "1.3.6.1.4.1.2011.5.25.219.1.5.1.4", "hwEntityThresholdCurrent": "1.3.6.1.4.1.2011.5.25.219.1.5.1.3"]
]

// --- hwBandwidthOfAllCardsExceedsThresholdFatalResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.2.22
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapEntType, hwEntityThresholdCritical, hwEntityThresholdCurrent
// Description: The total bandwidth of all cards recovered from exceeding the fatal forwarding capacity of system control board.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.2.22"] = [
    name: "hwBandwidthOfAllCardsExceedsThresholdFatalResume",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapEntType", "hwEntityThresholdCritical", "hwEntityThresholdCurrent"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapEntType": "1.3.6.1.4.1.2011.5.25.219.1.2", "hwEntityThresholdCritical": "1.3.6.1.4.1.2011.5.25.219.1.5.1.4", "hwEntityThresholdCurrent": "1.3.6.1.4.1.2011.5.25.219.1.5.1.3"]
]

// --- hwPinchCardReset (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.2.23
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapEntType, hwEntityTrapReasonDescr, hwEntityOperStatus
// Description: The pinch card reset.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.2.23"] = [
    name: "hwPinchCardReset",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapEntType", "hwEntityTrapReasonDescr", "hwEntityOperStatus"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapEntType": "1.3.6.1.4.1.2011.5.25.219.1.2", "hwEntityTrapReasonDescr": "1.3.6.1.4.1.2011.5.25.219.1.13", "hwEntityOperStatus": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.2"]
]

// --- hwPinchCardResetResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.2.24
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapEntType, hwEntityTrapReasonDescr, hwEntityOperStatus
// Description: The pinch card recovered from reset.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.2.24"] = [
    name: "hwPinchCardResetResume",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapEntType", "hwEntityTrapReasonDescr", "hwEntityOperStatus"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapEntType": "1.3.6.1.4.1.2011.5.25.219.1.2", "hwEntityTrapReasonDescr": "1.3.6.1.4.1.2011.5.25.219.1.13", "hwEntityOperStatus": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.2"]
]

// --- hwVBoardInvalid (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.2.27
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapEntType, hwEntityTrapFaultID, vmName
// Description: Board is invalid for some reason.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.2.27"] = [
    name: "hwVBoardInvalid",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapEntType", "hwEntityTrapFaultID", "vmName"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapEntType": "1.3.6.1.4.1.2011.5.25.219.1.2", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3", "vmName": "1.3.6.1.4.1.2011.5.25.219.1.23"]
]

// --- hwVBoardInvalidResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.2.28
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapEntType, hwEntityTrapFaultID, vmName
// Description: Board resume from invalid situation.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.2.28"] = [
    name: "hwVBoardInvalidResume",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapEntType", "hwEntityTrapFaultID", "vmName"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapEntType": "1.3.6.1.4.1.2011.5.25.219.1.2", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3", "vmName": "1.3.6.1.4.1.2011.5.25.219.1.23"]
]

// --- hwNeedModifyCfgTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.2.29
// Fields: hwEntityTrapFaultID, hwEntityTrapReasonDescr
// Description: Before a version upgrade, the system checks the configuration files. If there is any problem, the system informs the user of the problem. After the upgrade, the system informs the user that the device...
trapMap["1.3.6.1.4.1.2011.5.25.219.2.2.29"] = [
    name: "hwNeedModifyCfgTrap",
    fields: ["hwEntityTrapFaultID", "hwEntityTrapReasonDescr"],
    fieldOids: ["hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3", "hwEntityTrapReasonDescr": "1.3.6.1.4.1.2011.5.25.219.1.13"]
]

// --- hwBoardWarning (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.2.30
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapEntType, hwEntityTrapFaultID
// Description: The board experienced a minor fault.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.2.30"] = [
    name: "hwBoardWarning",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapEntType", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapEntType": "1.3.6.1.4.1.2011.5.25.219.1.2", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwBoardWarningResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.2.31
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapEntType, hwEntityTrapFaultID
// Description: The board resumed from the minor fault.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.2.31"] = [
    name: "hwBoardWarningResume",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapEntType", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapEntType": "1.3.6.1.4.1.2011.5.25.219.1.2", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwBoardPortsConflict (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.2.32
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapEntType, hwEntityTrapFaultID, hwEntityTrapReasonDescr, hwEntityOperStatus
// Description: Some ports on the board and subcard conflict with each other.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.2.32"] = [
    name: "hwBoardPortsConflict",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapEntType", "hwEntityTrapFaultID", "hwEntityTrapReasonDescr", "hwEntityOperStatus"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapEntType": "1.3.6.1.4.1.2011.5.25.219.1.2", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3", "hwEntityTrapReasonDescr": "1.3.6.1.4.1.2011.5.25.219.1.13", "hwEntityOperStatus": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.2"]
]

// --- hwBoardEntityPowerOff (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.2.33
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID
// Description: The mpu board is powered off.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.2.33"] = [
    name: "hwBoardEntityPowerOff",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwBoardlowmemoryoverload (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.2.34
// Fields: hwEntityPhysicalIndex, entPhysicalName
// Description: The low-end memory usage exceeds 95 percent.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.2.34"] = [
    name: "hwBoardlowmemoryoverload",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwBoardlowmemoryoverloadResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.2.35
// Fields: hwEntityPhysicalIndex, entPhysicalName
// Description: The low-end memory usage resumes from the overload limit.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.2.35"] = [
    name: "hwBoardlowmemoryoverloadResume",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwBoardAdd (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.2.36
// Fields: hwEntPhysicalName, hwBoardID
// Description: The board was added.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.2.36"] = [
    name: "hwBoardAdd",
    fields: ["hwEntPhysicalName", "hwBoardID"],
    fieldOids: ["hwEntPhysicalName": "1.3.6.1.4.1.2011.5.25.219.1.26", "hwBoardID": "1.3.6.1.4.1.2011.5.25.219.1.27"]
]

// --- hwBoardDelete (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.2.37
// Fields: hwEntPhysicalName, hwBoardID
// Description: The board was deleted.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.2.37"] = [
    name: "hwBoardDelete",
    fields: ["hwEntPhysicalName", "hwBoardID"],
    fieldOids: ["hwEntPhysicalName": "1.3.6.1.4.1.2011.5.25.219.1.26", "hwBoardID": "1.3.6.1.4.1.2011.5.25.219.1.27"]
]

// --- hwAllLpuSfuFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.2.38
// Description: All installed LPUs and SFUs were not registered for a long time.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.2.38"] = [
    name: "hwAllLpuSfuFail",
    fields: [],
    fieldOids: []
]

// --- hwAllLpuSfuFailResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.2.39
// Description: An LPU or SFU is registered ,or all LPUs and SFUs are powered off.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.2.39"] = [
    name: "hwAllLpuSfuFailResume",
    fields: [],
    fieldOids: []
]

// --- hwBoardUpCoverAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.2.40
// Description: The cover is opened.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.2.40"] = [
    name: "hwBoardUpCoverAlarm",
    fields: [],
    fieldOids: []
]

// --- hwBoardUpCoverResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.2.41
// Description: The cover is closed.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.2.41"] = [
    name: "hwBoardUpCoverResume",
    fields: [],
    fieldOids: []
]

// --- hwTmPerformanceALarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.2.42
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapEntType, hwEntityTrapFaultID, hwEntityTrapReasonDescr, hwEntityOperStatus
// Description: This object indicates that a board encounters an overall failure.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.2.42"] = [
    name: "hwTmPerformanceALarm",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapEntType", "hwEntityTrapFaultID", "hwEntityTrapReasonDescr", "hwEntityOperStatus"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapEntType": "1.3.6.1.4.1.2011.5.25.219.1.2", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3", "hwEntityTrapReasonDescr": "1.3.6.1.4.1.2011.5.25.219.1.13", "hwEntityOperStatus": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.2"]
]

// --- hwTmPerformanceResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.2.43
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapEntType, hwEntityTrapFaultID, hwEntityTrapReasonDescr, hwEntityOperStatus
// Description: This object indicates that a board recovers from an overall failure.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.2.43"] = [
    name: "hwTmPerformanceResume",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapEntType", "hwEntityTrapFaultID", "hwEntityTrapReasonDescr", "hwEntityOperStatus"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapEntType": "1.3.6.1.4.1.2011.5.25.219.1.2", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3", "hwEntityTrapReasonDescr": "1.3.6.1.4.1.2011.5.25.219.1.13", "hwEntityOperStatus": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.2"]
]

// --- hwBiosOrBootloaderPwdError (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.2.44
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapEntType
// Description: The bios/bootloader menu password experienced a fault.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.2.44"] = [
    name: "hwBiosOrBootloaderPwdError",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapEntType"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapEntType": "1.3.6.1.4.1.2011.5.25.219.1.2"]
]

// --- hwBiosOrBootloaderPwdErrorResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.2.45
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapEntType
// Description: The bios/bootloader menu password resumes from the fault.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.2.45"] = [
    name: "hwBiosOrBootloaderPwdErrorResume",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapEntType"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapEntType": "1.3.6.1.4.1.2011.5.25.219.1.2"]
]

// --- hwBootloaderPwdEmpty (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.2.46
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapEntType
// Description: The password of bootloader is empty.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.2.46"] = [
    name: "hwBootloaderPwdEmpty",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapEntType"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapEntType": "1.3.6.1.4.1.2011.5.25.219.1.2"]
]

// --- hwBootloaderPwdEmptyResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.2.47
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapEntType
// Description: The password of bootloader is set.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.2.47"] = [
    name: "hwBootloaderPwdEmptyResume",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapEntType"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapEntType": "1.3.6.1.4.1.2011.5.25.219.1.2"]
]

// --- hwBoardOffline (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.2.48
// Fields: hwEntityPhysicalIndex, entPhysicalName
// Description: The board is offline.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.2.48"] = [
    name: "hwBoardOffline",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwBoardSoftwareNotSupport (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.2.49
// Fields: hwEntityPhysicalIndex, entPhysicalName
// Description: The current or next startup system software is not support the board.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.2.49"] = [
    name: "hwBoardSoftwareNotSupport",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwForwardEngineInvalid (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.2.50
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapEntType, hwEntityTrapFaultID
// Description: This object indicates that a forwarding engine encounters an overall failure.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.2.50"] = [
    name: "hwForwardEngineInvalid",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapEntType", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapEntType": "1.3.6.1.4.1.2011.5.25.219.1.2", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwForwardEngineInvalidResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.2.51
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapEntType, hwEntityTrapFaultID
// Description: This object indicates that a forwarding engine recovers from an overall failure.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.2.51"] = [
    name: "hwForwardEngineInvalidResume",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapEntType", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapEntType": "1.3.6.1.4.1.2011.5.25.219.1.2", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwForwardEngineFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.2.52
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapEntType, hwEntityTrapFaultID
// Description: This object indicates that a forwarding engine encounters a partial failure.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.2.52"] = [
    name: "hwForwardEngineFail",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapEntType", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapEntType": "1.3.6.1.4.1.2011.5.25.219.1.2", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwForwardEngineFailResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.2.53
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapEntType, hwEntityTrapFaultID
// Description: This object indicates that a forwarding engine recovers from a partial failure.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.2.53"] = [
    name: "hwForwardEngineFailResume",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapEntType", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapEntType": "1.3.6.1.4.1.2011.5.25.219.1.2", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwStorageInsufficient (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.2.54
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwStorageDevName, hwEntityThresholdWarning, hwEntityThresholdCurrent, hwEntityThresholdTip
// Description: Storage utilization exceeded the alarm threshold.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.2.54"] = [
    name: "hwStorageInsufficient",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwStorageDevName", "hwEntityThresholdWarning", "hwEntityThresholdCurrent", "hwEntityThresholdTip"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwStorageDevName": "1.3.6.1.4.1.2011.5.25.219.1.10", "hwEntityThresholdWarning": "1.3.6.1.4.1.2011.5.25.219.1.5.1.5", "hwEntityThresholdCurrent": "1.3.6.1.4.1.2011.5.25.219.1.5.1.3", "hwEntityThresholdTip": "1.3.6.1.4.1.2011.5.25.219.1.5.1.6"]
]

// --- hwStorageInsufficientResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.2.55
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwStorageDevName, hwEntityThresholdWarning, hwEntityThresholdCurrent
// Description: Storage utilization resumed from exceeding the alarm threshold.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.2.55"] = [
    name: "hwStorageInsufficientResume",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwStorageDevName", "hwEntityThresholdWarning", "hwEntityThresholdCurrent"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwStorageDevName": "1.3.6.1.4.1.2011.5.25.219.1.10", "hwEntityThresholdWarning": "1.3.6.1.4.1.2011.5.25.219.1.5.1.5", "hwEntityThresholdCurrent": "1.3.6.1.4.1.2011.5.25.219.1.5.1.3"]
]

// --- hwBoardLicenseActFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.2.56
// Fields: hwGtlItemIndex, hwGtlItemName, entPhysicalIndex, entPhysicalName
// Description: The license for board fails to be activated.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.2.56"] = [
    name: "hwBoardLicenseActFail",
    fields: ["hwGtlItemIndex", "hwGtlItemName", "entPhysicalIndex", "entPhysicalName"],
    fieldOids: ["hwGtlItemIndex": "1.3.6.1.4.1.2011.5.25.142.1.8.1.1", "hwGtlItemName": "1.3.6.1.4.1.2011.5.25.142.1.8.1.2", "entPhysicalIndex": "1.3.6.1.2.1.47.1.1.1.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwBoardLicenseActSuccess (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.2.57
// Fields: hwGtlItemIndex, hwGtlItemName, entPhysicalIndex, entPhysicalName
// Description: The license for board is successfully activated.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.2.57"] = [
    name: "hwBoardLicenseActSuccess",
    fields: ["hwGtlItemIndex", "hwGtlItemName", "entPhysicalIndex", "entPhysicalName"],
    fieldOids: ["hwGtlItemIndex": "1.3.6.1.4.1.2011.5.25.142.1.8.1.1", "hwGtlItemName": "1.3.6.1.4.1.2011.5.25.142.1.8.1.2", "entPhysicalIndex": "1.3.6.1.2.1.47.1.1.1.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwCertExpired (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.2.58
// Description: The certificate will expire.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.2.58"] = [
    name: "hwCertExpired",
    fields: [],
    fieldOids: []
]

// --- hwCertExpiredResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.2.59
// Description: The certificate is updated.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.2.59"] = [
    name: "hwCertExpiredResume",
    fields: [],
    fieldOids: []
]

// --- hwCrlInvalid (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.2.60
// Description: The Crl is invalid.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.2.60"] = [
    name: "hwCrlInvalid",
    fields: [],
    fieldOids: []
]

// --- hwCrlInvalidResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.2.61
// Description: The Crl is updated.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.2.61"] = [
    name: "hwCrlInvalidResume",
    fields: [],
    fieldOids: []
]

// --- hwSlicePowerFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.2.62
// Fields: hwEntityPhysicalIndex, entPhysicalName
// Description: The slice power off is failed.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.2.62"] = [
    name: "hwSlicePowerFail",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwWarmBackFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.2.63
// Fields: hwEntityPhysicalIndex, entPhysicalName
// Description: The warm backup is failed.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.2.63"] = [
    name: "hwWarmBackFail",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwTmStatusChangeAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.2.64
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapEntType, hwEntityTrapFaultID, hwEntityTrapReasonDescr, hwEntityOperStatus
// Description: The TM deviates from the normal operating state.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.2.64"] = [
    name: "hwTmStatusChangeAlarm",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapEntType", "hwEntityTrapFaultID", "hwEntityTrapReasonDescr", "hwEntityOperStatus"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapEntType": "1.3.6.1.4.1.2011.5.25.219.1.2", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3", "hwEntityTrapReasonDescr": "1.3.6.1.4.1.2011.5.25.219.1.13", "hwEntityOperStatus": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.2"]
]

// --- hwTmStatusChangeAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.2.65
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapEntType, hwEntityTrapFaultID, hwEntityTrapReasonDescr, hwEntityOperStatus
// Description: The TM recovers to the normal state.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.2.65"] = [
    name: "hwTmStatusChangeAlarmResume",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapEntType", "hwEntityTrapFaultID", "hwEntityTrapReasonDescr", "hwEntityOperStatus"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapEntType": "1.3.6.1.4.1.2011.5.25.219.1.2", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3", "hwEntityTrapReasonDescr": "1.3.6.1.4.1.2011.5.25.219.1.13", "hwEntityOperStatus": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.2"]
]

// --- hwBoardUpCoverStackAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.2.66
// Fields: hwSlot, hwLineId
// Description: The cover is opened.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.2.66"] = [
    name: "hwBoardUpCoverStackAlarm",
    fields: ["hwSlot", "hwLineId"],
    fieldOids: ["hwSlot": "1.3.6.1.4.1.2011.5.25.219.1.69", "hwLineId": "1.3.6.1.4.1.2011.5.25.219.1.70"]
]

// --- hwBoardUpCoverStackResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.2.67
// Fields: hwSlot, hwLineId
// Description: The cover is closed.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.2.67"] = [
    name: "hwBoardUpCoverStackResume",
    fields: ["hwSlot", "hwLineId"],
    fieldOids: ["hwSlot": "1.3.6.1.4.1.2011.5.25.219.1.69", "hwLineId": "1.3.6.1.4.1.2011.5.25.219.1.70"]
]

// --- hwBandwidthOfAllBoardsExceedsThresholdAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.2.68
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityThresholdCritical, hwEntityThresholdCurrent
// Description: The total bandwidth of all boards exceeded the threshold of the chassis.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.2.68"] = [
    name: "hwBandwidthOfAllBoardsExceedsThresholdAlarm",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityThresholdCritical", "hwEntityThresholdCurrent"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityThresholdCritical": "1.3.6.1.4.1.2011.5.25.219.1.5.1.4", "hwEntityThresholdCurrent": "1.3.6.1.4.1.2011.5.25.219.1.5.1.3"]
]

// --- hwBandwidthOfAllBoardsExceedsThresholdAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.2.69
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityThresholdCritical, hwEntityThresholdCurrent
// Description: The total bandwidth of all boards recovered from exceeding the threshold of the chassis.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.2.69"] = [
    name: "hwBandwidthOfAllBoardsExceedsThresholdAlarmResume",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityThresholdCritical", "hwEntityThresholdCurrent"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityThresholdCritical": "1.3.6.1.4.1.2011.5.25.219.1.5.1.4", "hwEntityThresholdCurrent": "1.3.6.1.4.1.2011.5.25.219.1.5.1.3"]
]

// --- hwForwardEngineModelFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.2.70
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapEntType, hwEntityTrapFaultID
// Description: This object indicates that a forwarding engine encounters an module failure.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.2.70"] = [
    name: "hwForwardEngineModelFail",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapEntType", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapEntType": "1.3.6.1.4.1.2011.5.25.219.1.2", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwForwardEngineModelFailResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.2.71
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapEntType, hwEntityTrapFaultID
// Description: This object indicates that a forwarding engine recovers from an module failure.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.2.71"] = [
    name: "hwForwardEngineModelFailResume",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapEntType", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapEntType": "1.3.6.1.4.1.2011.5.25.219.1.2", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwForwardEnginePortFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.2.72
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapEntType, ifName, hwEntityTrapFaultID
// Description: This object indicates that a forwarding engine encounters a port failure.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.2.72"] = [
    name: "hwForwardEnginePortFail",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapEntType", "ifName", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapEntType": "1.3.6.1.4.1.2011.5.25.219.1.2", "ifName": "1.3.6.1.2.1.31.1.1.1.1", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwForwardEnginePortFailResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.2.73
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapEntType, ifName, hwEntityTrapFaultID
// Description: This object indicates that a forwarding engine recovers from a port failure.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.2.73"] = [
    name: "hwForwardEnginePortFailResume",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapEntType", "ifName", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapEntType": "1.3.6.1.4.1.2011.5.25.219.1.2", "ifName": "1.3.6.1.2.1.31.1.1.1.1", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwDeviceRebootTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.2.74
// Fields: hwDeviceRebootTrapPhysicalName, hwDeviceRebootTrapInfo
// Description: This object indicates that the device reboot.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.2.74"] = [
    name: "hwDeviceRebootTrap",
    fields: ["hwDeviceRebootTrapPhysicalName", "hwDeviceRebootTrapInfo"],
    fieldOids: ["hwDeviceRebootTrapPhysicalName": "1.3.6.1.4.1.2011.5.25.219.1.76", "hwDeviceRebootTrapInfo": "1.3.6.1.4.1.2011.5.25.219.1.77"]
]

// --- hwPKICertAboutToExpired (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.2.75
// Fields: hwPKIAlarmSlot, hwPKIAlarmCertificateType, hwPKIAlarmCertIssuer, hwPKIAlarmCertSubject, hwPKIAlarmCertStartTime, hwPKIAlarmCertFinishTime
// Description: The certificate is about to expire.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.2.75"] = [
    name: "hwPKICertAboutToExpired",
    fields: ["hwPKIAlarmSlot", "hwPKIAlarmCertificateType", "hwPKIAlarmCertIssuer", "hwPKIAlarmCertSubject", "hwPKIAlarmCertStartTime", "hwPKIAlarmCertFinishTime"],
    fieldOids: ["hwPKIAlarmSlot": "1.3.6.1.4.1.2011.5.25.219.1.78", "hwPKIAlarmCertificateType": "1.3.6.1.4.1.2011.5.25.219.1.79", "hwPKIAlarmCertIssuer": "1.3.6.1.4.1.2011.5.25.219.1.80", "hwPKIAlarmCertSubject": "1.3.6.1.4.1.2011.5.25.219.1.81", "hwPKIAlarmCertStartTime": "1.3.6.1.4.1.2011.5.25.219.1.82", "hwPKIAlarmCertFinishTime": "1.3.6.1.4.1.2011.5.25.219.1.83"]
]

// --- hwPKICertAboutToExpiredResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.2.76
// Fields: hwPKIAlarmSlot, hwPKIAlarmCertificateType, hwPKIAlarmCertIssuer, hwPKIAlarmCertSubject, hwPKIAlarmCertStartTime, hwPKIAlarmCertFinishTime
// Description: The certificate near expiration alarm has been restored.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.2.76"] = [
    name: "hwPKICertAboutToExpiredResume",
    fields: ["hwPKIAlarmSlot", "hwPKIAlarmCertificateType", "hwPKIAlarmCertIssuer", "hwPKIAlarmCertSubject", "hwPKIAlarmCertStartTime", "hwPKIAlarmCertFinishTime"],
    fieldOids: ["hwPKIAlarmSlot": "1.3.6.1.4.1.2011.5.25.219.1.78", "hwPKIAlarmCertificateType": "1.3.6.1.4.1.2011.5.25.219.1.79", "hwPKIAlarmCertIssuer": "1.3.6.1.4.1.2011.5.25.219.1.80", "hwPKIAlarmCertSubject": "1.3.6.1.4.1.2011.5.25.219.1.81", "hwPKIAlarmCertStartTime": "1.3.6.1.4.1.2011.5.25.219.1.82", "hwPKIAlarmCertFinishTime": "1.3.6.1.4.1.2011.5.25.219.1.83"]
]

// --- hwPKICertExpired (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.2.77
// Fields: hwPKIAlarmSlot, hwPKIAlarmCertificateType, hwPKIAlarmCertIssuer, hwPKIAlarmCertSubject, hwPKIAlarmCertStartTime, hwPKIAlarmCertFinishTime
// Description: The certificate already expired.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.2.77"] = [
    name: "hwPKICertExpired",
    fields: ["hwPKIAlarmSlot", "hwPKIAlarmCertificateType", "hwPKIAlarmCertIssuer", "hwPKIAlarmCertSubject", "hwPKIAlarmCertStartTime", "hwPKIAlarmCertFinishTime"],
    fieldOids: ["hwPKIAlarmSlot": "1.3.6.1.4.1.2011.5.25.219.1.78", "hwPKIAlarmCertificateType": "1.3.6.1.4.1.2011.5.25.219.1.79", "hwPKIAlarmCertIssuer": "1.3.6.1.4.1.2011.5.25.219.1.80", "hwPKIAlarmCertSubject": "1.3.6.1.4.1.2011.5.25.219.1.81", "hwPKIAlarmCertStartTime": "1.3.6.1.4.1.2011.5.25.219.1.82", "hwPKIAlarmCertFinishTime": "1.3.6.1.4.1.2011.5.25.219.1.83"]
]

// --- hwPKICertExpiredResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.2.78
// Fields: hwPKIAlarmSlot, hwPKIAlarmCertificateType, hwPKIAlarmCertIssuer, hwPKIAlarmCertSubject, hwPKIAlarmCertStartTime, hwPKIAlarmCertFinishTime
// Description: The certificate expiration alarm has been restored.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.2.78"] = [
    name: "hwPKICertExpiredResume",
    fields: ["hwPKIAlarmSlot", "hwPKIAlarmCertificateType", "hwPKIAlarmCertIssuer", "hwPKIAlarmCertSubject", "hwPKIAlarmCertStartTime", "hwPKIAlarmCertFinishTime"],
    fieldOids: ["hwPKIAlarmSlot": "1.3.6.1.4.1.2011.5.25.219.1.78", "hwPKIAlarmCertificateType": "1.3.6.1.4.1.2011.5.25.219.1.79", "hwPKIAlarmCertIssuer": "1.3.6.1.4.1.2011.5.25.219.1.80", "hwPKIAlarmCertSubject": "1.3.6.1.4.1.2011.5.25.219.1.81", "hwPKIAlarmCertStartTime": "1.3.6.1.4.1.2011.5.25.219.1.82", "hwPKIAlarmCertFinishTime": "1.3.6.1.4.1.2011.5.25.219.1.83"]
]

// --- hwPKICRLAboutToExpired (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.2.79
// Fields: hwPKIAlarmSlot, hwPKIAlarmIssuer, hwPKIAlarmCertStartTime, hwPKIAlarmCertFinishTime
// Description: The CRL is about to expire.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.2.79"] = [
    name: "hwPKICRLAboutToExpired",
    fields: ["hwPKIAlarmSlot", "hwPKIAlarmIssuer", "hwPKIAlarmCertStartTime", "hwPKIAlarmCertFinishTime"],
    fieldOids: ["hwPKIAlarmSlot": "1.3.6.1.4.1.2011.5.25.219.1.78", "hwPKIAlarmIssuer": "1.3.6.1.4.1.2011.5.25.219.1.84", "hwPKIAlarmCertStartTime": "1.3.6.1.4.1.2011.5.25.219.1.82", "hwPKIAlarmCertFinishTime": "1.3.6.1.4.1.2011.5.25.219.1.83"]
]

// --- hwPKICRLAboutToExpiredResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.2.80
// Fields: hwPKIAlarmSlot, hwPKIAlarmIssuer, hwPKIAlarmCertStartTime, hwPKIAlarmCertFinishTime
// Description: The CRL near expiration alarm has been restored.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.2.80"] = [
    name: "hwPKICRLAboutToExpiredResume",
    fields: ["hwPKIAlarmSlot", "hwPKIAlarmIssuer", "hwPKIAlarmCertStartTime", "hwPKIAlarmCertFinishTime"],
    fieldOids: ["hwPKIAlarmSlot": "1.3.6.1.4.1.2011.5.25.219.1.78", "hwPKIAlarmIssuer": "1.3.6.1.4.1.2011.5.25.219.1.84", "hwPKIAlarmCertStartTime": "1.3.6.1.4.1.2011.5.25.219.1.82", "hwPKIAlarmCertFinishTime": "1.3.6.1.4.1.2011.5.25.219.1.83"]
]

// --- hwPKICRLExpired (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.2.81
// Fields: hwPKIAlarmSlot, hwPKIAlarmIssuer, hwPKIAlarmCertStartTime, hwPKIAlarmCertFinishTime
// Description: The CRL already expired.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.2.81"] = [
    name: "hwPKICRLExpired",
    fields: ["hwPKIAlarmSlot", "hwPKIAlarmIssuer", "hwPKIAlarmCertStartTime", "hwPKIAlarmCertFinishTime"],
    fieldOids: ["hwPKIAlarmSlot": "1.3.6.1.4.1.2011.5.25.219.1.78", "hwPKIAlarmIssuer": "1.3.6.1.4.1.2011.5.25.219.1.84", "hwPKIAlarmCertStartTime": "1.3.6.1.4.1.2011.5.25.219.1.82", "hwPKIAlarmCertFinishTime": "1.3.6.1.4.1.2011.5.25.219.1.83"]
]

// --- hwPKICRLExpiredResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.2.82
// Fields: hwPKIAlarmSlot, hwPKIAlarmIssuer, hwPKIAlarmCertStartTime, hwPKIAlarmCertFinishTime
// Description: The CRL expiration alarm has been restored.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.2.82"] = [
    name: "hwPKICRLExpiredResume",
    fields: ["hwPKIAlarmSlot", "hwPKIAlarmIssuer", "hwPKIAlarmCertStartTime", "hwPKIAlarmCertFinishTime"],
    fieldOids: ["hwPKIAlarmSlot": "1.3.6.1.4.1.2011.5.25.219.1.78", "hwPKIAlarmIssuer": "1.3.6.1.4.1.2011.5.25.219.1.84", "hwPKIAlarmCertStartTime": "1.3.6.1.4.1.2011.5.25.219.1.82", "hwPKIAlarmCertFinishTime": "1.3.6.1.4.1.2011.5.25.219.1.83"]
]

// --- hwCardRemove (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.3.1
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapEntType, hwEntityTrapFaultID, hwEntityOperStatus
// Description: This object indicates that a card cannot be detected.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.3.1"] = [
    name: "hwCardRemove",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapEntType", "hwEntityTrapFaultID", "hwEntityOperStatus"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapEntType": "1.3.6.1.4.1.2011.5.25.219.1.2", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3", "hwEntityOperStatus": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.2"]
]

// --- hwCardInsert (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.3.2
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapEntType, hwEntityTrapFaultID, hwEntityOperStatus
// Description: This object indicates that a card can be detected.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.3.2"] = [
    name: "hwCardInsert",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapEntType", "hwEntityTrapFaultID", "hwEntityOperStatus"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapEntType": "1.3.6.1.4.1.2011.5.25.219.1.2", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3", "hwEntityOperStatus": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.2"]
]

// --- hwCardFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.3.3
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapEntType, hwEntityTrapFaultID, hwEntityTrapReasonDescr, hwEntityOperStatus
// Description: Card become failure for some reason.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.3.3"] = [
    name: "hwCardFail",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapEntType", "hwEntityTrapFaultID", "hwEntityTrapReasonDescr", "hwEntityOperStatus"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapEntType": "1.3.6.1.4.1.2011.5.25.219.1.2", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3", "hwEntityTrapReasonDescr": "1.3.6.1.4.1.2011.5.25.219.1.13", "hwEntityOperStatus": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.2"]
]

// --- hwCardFailResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.3.4
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapEntType, hwEntityTrapFaultID, hwEntityTrapReasonDescr, hwEntityOperStatus
// Description: Card resume from failure.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.3.4"] = [
    name: "hwCardFailResume",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapEntType", "hwEntityTrapFaultID", "hwEntityTrapReasonDescr", "hwEntityOperStatus"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapEntType": "1.3.6.1.4.1.2011.5.25.219.1.2", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3", "hwEntityTrapReasonDescr": "1.3.6.1.4.1.2011.5.25.219.1.13", "hwEntityOperStatus": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.2"]
]

// --- hwCardInvalid (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.3.5
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapEntType, hwEntityTrapFaultID, hwEntityTrapReasonDescr, hwEntityOperStatus
// Description: Card is invalid for some reason.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.3.5"] = [
    name: "hwCardInvalid",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapEntType", "hwEntityTrapFaultID", "hwEntityTrapReasonDescr", "hwEntityOperStatus"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapEntType": "1.3.6.1.4.1.2011.5.25.219.1.2", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3", "hwEntityTrapReasonDescr": "1.3.6.1.4.1.2011.5.25.219.1.13", "hwEntityOperStatus": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.2"]
]

// --- hwCardInvalidResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.3.6
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapEntType, hwEntityTrapFaultID, hwEntityTrapReasonDescr, hwEntityOperStatus
// Description: Card resume from invalid situation.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.3.6"] = [
    name: "hwCardInvalidResume",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapEntType", "hwEntityTrapFaultID", "hwEntityTrapReasonDescr", "hwEntityOperStatus"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapEntType": "1.3.6.1.4.1.2011.5.25.219.1.2", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3", "hwEntityTrapReasonDescr": "1.3.6.1.4.1.2011.5.25.219.1.13", "hwEntityOperStatus": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.2"]
]

// --- hwCardResetByCmd (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.3.7
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapEntType, hwEntityTrapReasonDescr, hwEntityOperStatus
// Description: This object indicates that the card experiences a command-triggred reset.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.3.7"] = [
    name: "hwCardResetByCmd",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapEntType", "hwEntityTrapReasonDescr", "hwEntityOperStatus"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapEntType": "1.3.6.1.4.1.2011.5.25.219.1.2", "hwEntityTrapReasonDescr": "1.3.6.1.4.1.2011.5.25.219.1.13", "hwEntityOperStatus": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.2"]
]

// --- hwCardResetByCmdResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.3.8
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapEntType, hwEntityTrapReasonDescr, hwEntityOperStatus
// Description: This object indicates that the card recovers from a command-triggred reset.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.3.8"] = [
    name: "hwCardResetByCmdResume",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapEntType", "hwEntityTrapReasonDescr", "hwEntityOperStatus"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapEntType": "1.3.6.1.4.1.2011.5.25.219.1.2", "hwEntityTrapReasonDescr": "1.3.6.1.4.1.2011.5.25.219.1.13", "hwEntityOperStatus": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.2"]
]

// --- hwCardResExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.3.9
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID, hwEntityTrapReasonDescr
// Description: This object indicates that the resource of card exceeds the maximum limit.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.3.9"] = [
    name: "hwCardResExceed",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID", "hwEntityTrapReasonDescr"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3", "hwEntityTrapReasonDescr": "1.3.6.1.4.1.2011.5.25.219.1.13"]
]

// --- hwCardResExceedResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.3.10
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID, hwEntityTrapReasonDescr
// Description: This object indicates that the card recovers from resource exceeding the maximum limit.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.3.10"] = [
    name: "hwCardResExceedResume",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID", "hwEntityTrapReasonDescr"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3", "hwEntityTrapReasonDescr": "1.3.6.1.4.1.2011.5.25.219.1.13"]
]

// --- hwCardBandwidthModeChange (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.3.11
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapEntType, hwEntityBandwidthMode
// Description: The bandwidth mode of physical entity is changed.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.3.11"] = [
    name: "hwCardBandwidthModeChange",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapEntType", "hwEntityBandwidthMode"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapEntType": "1.3.6.1.4.1.2011.5.25.219.1.2", "hwEntityBandwidthMode": "1.3.6.1.4.1.2011.5.25.219.1.24"]
]

// --- hwCardSplitChange (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.3.12
// Fields: hwEntityPhysicalIndex, entPhysicalName
// Description: Port split configuration has changed on the card.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.3.12"] = [
    name: "hwCardSplitChange",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwCardInconsistent (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.3.13
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapEntType, hwEntityTrapFaultID, hwEntityTrapReasonDescr, hwEntityOperStatus
// Description: The card types are different.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.3.13"] = [
    name: "hwCardInconsistent",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapEntType", "hwEntityTrapFaultID", "hwEntityTrapReasonDescr", "hwEntityOperStatus"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapEntType": "1.3.6.1.4.1.2011.5.25.219.1.2", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3", "hwEntityTrapReasonDescr": "1.3.6.1.4.1.2011.5.25.219.1.13", "hwEntityOperStatus": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.2"]
]

// --- hwRTULicenseActSuccess (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.3.14
// Fields: hwGtlItemIndex, hwGtlItemName, entPhysicalIndex, entPhysicalName
// Description: Succeed to activate the RTU license.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.3.14"] = [
    name: "hwRTULicenseActSuccess",
    fields: ["hwGtlItemIndex", "hwGtlItemName", "entPhysicalIndex", "entPhysicalName"],
    fieldOids: ["hwGtlItemIndex": "1.3.6.1.4.1.2011.5.25.142.1.8.1.1", "hwGtlItemName": "1.3.6.1.4.1.2011.5.25.142.1.8.1.2", "entPhysicalIndex": "1.3.6.1.2.1.47.1.1.1.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwCardPortInvalid (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.3.15
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapEntType, hwEntityTrapFaultID, hwEntityTrapReasonDescr, hwEntityOperStatus
// Description: Card port is invalid.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.3.15"] = [
    name: "hwCardPortInvalid",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapEntType", "hwEntityTrapFaultID", "hwEntityTrapReasonDescr", "hwEntityOperStatus"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapEntType": "1.3.6.1.4.1.2011.5.25.219.1.2", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3", "hwEntityTrapReasonDescr": "1.3.6.1.4.1.2011.5.25.219.1.13", "hwEntityOperStatus": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.2"]
]

// --- hwPortGroupComboModeChange (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.3.16
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapEntType, hwPortIDList, hwPortGroupMode
// Description: The mode of port group is changed.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.3.16"] = [
    name: "hwPortGroupComboModeChange",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapEntType", "hwPortIDList", "hwPortGroupMode"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapEntType": "1.3.6.1.4.1.2011.5.25.219.1.2", "hwPortIDList": "1.3.6.1.4.1.2011.5.25.219.1.86", "hwPortGroupMode": "1.3.6.1.4.1.2011.5.25.219.1.87"]
]

// --- hwOpticalRemove (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.4.1
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID, ifOperStatus, ifAdminStatus, hwOpticalVendorName, hwOpticalVendorSN
// Description: Optical Module has been removed.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.4.1"] = [
    name: "hwOpticalRemove",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID", "ifOperStatus", "ifAdminStatus", "hwOpticalVendorName", "hwOpticalVendorSN"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3", "ifOperStatus": "1.3.6.1.2.1.2.2.1.8", "ifAdminStatus": "1.3.6.1.2.1.2.2.1.7", "hwOpticalVendorName": "1.3.6.1.4.1.2011.5.25.219.1.15", "hwOpticalVendorSN": "1.3.6.1.4.1.2011.5.25.219.1.16"]
]

// --- hwOpticalInsert (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.4.2
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID, ifOperStatus, ifAdminStatus, hwOpticalVendorName, hwOpticalVendorSN
// Description: Optical Module has been inserted.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.4.2"] = [
    name: "hwOpticalInsert",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID", "ifOperStatus", "ifAdminStatus", "hwOpticalVendorName", "hwOpticalVendorSN"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3", "ifOperStatus": "1.3.6.1.2.1.2.2.1.8", "ifAdminStatus": "1.3.6.1.2.1.2.2.1.7", "hwOpticalVendorName": "1.3.6.1.4.1.2011.5.25.219.1.15", "hwOpticalVendorSN": "1.3.6.1.4.1.2011.5.25.219.1.16"]
]

// --- hwOpticalFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.4.3
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID, hwEntityTrapReasonDescr
// Description: Optical Module become failure for some reason.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.4.3"] = [
    name: "hwOpticalFail",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID", "hwEntityTrapReasonDescr"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3", "hwEntityTrapReasonDescr": "1.3.6.1.4.1.2011.5.25.219.1.13"]
]

// --- hwOpticalFailResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.4.4
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID, hwEntityTrapReasonDescr
// Description: Optical Module resume from failure.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.4.4"] = [
    name: "hwOpticalFailResume",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID", "hwEntityTrapReasonDescr"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3", "hwEntityTrapReasonDescr": "1.3.6.1.4.1.2011.5.25.219.1.13"]
]

// --- hwOpticalInvalid (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.4.5
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID, hwEntityTrapReasonDescr
// Description: Optical Module is invalid for some reason.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.4.5"] = [
    name: "hwOpticalInvalid",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID", "hwEntityTrapReasonDescr"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3", "hwEntityTrapReasonDescr": "1.3.6.1.4.1.2011.5.25.219.1.13"]
]

// --- hwOpticalInvalidResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.4.6
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID, hwEntityTrapReasonDescr
// Description: Optical Module resume from invalid situation.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.4.6"] = [
    name: "hwOpticalInvalidResume",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID", "hwEntityTrapReasonDescr"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3", "hwEntityTrapReasonDescr": "1.3.6.1.4.1.2011.5.25.219.1.13"]
]

// --- hwOpticalPowerAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.4.7
// Fields: entPhysicalName, hwUserDefAlarmName, hwEntityTrapFaultID
// Description: Temperature rise over or fall below the warning alarm threshold. Only indicate the temperature of board,card or optical module.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.4.7"] = [
    name: "hwOpticalPowerAlarm",
    fields: ["entPhysicalName", "hwUserDefAlarmName", "hwEntityTrapFaultID"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwUserDefAlarmName": "1.3.6.1.4.1.2011.5.25.219.1.6", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwOpticalPowerAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.4.8
// Fields: entPhysicalName, hwUserDefAlarmName, hwEntityTrapFaultID
// Description: Temperature rise over or fall below the warning alarm threshold. Only indicate the temperature of board,card or optical module.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.4.8"] = [
    name: "hwOpticalPowerAlarmResume",
    fields: ["entPhysicalName", "hwUserDefAlarmName", "hwEntityTrapFaultID"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwUserDefAlarmName": "1.3.6.1.4.1.2011.5.25.219.1.6", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwOpticalUnAuthorized (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.4.9
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID, hwEntityTrapReasonDescr
// Description: The optical module authentication alarm occurred.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.4.9"] = [
    name: "hwOpticalUnAuthorized",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID", "hwEntityTrapReasonDescr"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3", "hwEntityTrapReasonDescr": "1.3.6.1.4.1.2011.5.25.219.1.13"]
]

// --- hwOpticalUnAuthorizedResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.4.10
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID
// Description: The optical module authentication alarm resumed.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.4.10"] = [
    name: "hwOpticalUnAuthorizedResume",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwLaserNoFited (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.4.11
// Fields: hwEntityPhysicalIndex, entPhysicalName
// Description: The laser not installed alarm occured.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.4.11"] = [
    name: "hwLaserNoFited",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwLaserNoFitedResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.4.12
// Fields: hwEntityPhysicalIndex, entPhysicalName
// Description: The laser not installed alarm resumed.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.4.12"] = [
    name: "hwLaserNoFitedResume",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwOpticalTunableNotMatch (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.4.13
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID
// Description: Configuration collision occurred between wavelength setting and untunable optical module.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.4.13"] = [
    name: "hwOpticalTunableNotMatch",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwOpticalTunableNotMatchResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.4.14
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID
// Description: Configuration collision removed between wavelength setting and untunable optical module.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.4.14"] = [
    name: "hwOpticalTunableNotMatchResume",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwGpsModuleRemove (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.4.15
// Fields: hwEntityPhysicalIndex, entPhysicalName
// Description: The gps module was removed.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.4.15"] = [
    name: "hwGpsModuleRemove",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwGpsModuleInsert (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.4.16
// Fields: hwEntityPhysicalIndex, entPhysicalName
// Description: The gps module was inserted.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.4.16"] = [
    name: "hwGpsModuleInsert",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwOptCfgNotMatch (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.4.17
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID, hwEntityTrapReasonDescr
// Description: The partial function of optical module failed.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.4.17"] = [
    name: "hwOptCfgNotMatch",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID", "hwEntityTrapReasonDescr"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3", "hwEntityTrapReasonDescr": "1.3.6.1.4.1.2011.5.25.219.1.13"]
]

// --- hwOptCfgNotMatchResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.4.18
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID, hwEntityTrapReasonDescr
// Description: The partial function of optical module resumed from partial failure.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.4.18"] = [
    name: "hwOptCfgNotMatchResume",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID", "hwEntityTrapReasonDescr"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3", "hwEntityTrapReasonDescr": "1.3.6.1.4.1.2011.5.25.219.1.13"]
]

// --- hwOpticalBiasCurrentAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.4.19
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID, hwEntityTrapReasonDescr
// Description: Bias current rise over or fall below the warning alarm threshold. Only indicate the temperature of board,card or optical module.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.4.19"] = [
    name: "hwOpticalBiasCurrentAlarm",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID", "hwEntityTrapReasonDescr"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3", "hwEntityTrapReasonDescr": "1.3.6.1.4.1.2011.5.25.219.1.13"]
]

// --- hwOpticalBiasCurrentAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.4.20
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID, hwEntityTrapReasonDescr
// Description: Bias current rise over or fall below the warning alarm threshold. Only indicate the temperature of board,card or optical module.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.4.20"] = [
    name: "hwOpticalBiasCurrentAlarmResume",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID", "hwEntityTrapReasonDescr"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3", "hwEntityTrapReasonDescr": "1.3.6.1.4.1.2011.5.25.219.1.13"]
]

// --- hwOpticalModuleAddNotice (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.4.21
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityOpticalVendorSn
// Description: Optical Module has been added.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.4.21"] = [
    name: "hwOpticalModuleAddNotice",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityOpticalVendorSn"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityOpticalVendorSn": "1.3.6.1.4.1.2011.5.25.31.1.1.3.1.4"]
]

// --- hwPortFhcDetectEnd (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.4.22
// Fields: hwEntityPhysicalIndex, entPhysicalName
// Description: Port FHC detect end.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.4.22"] = [
    name: "hwPortFhcDetectEnd",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwPortDirtyCheckEnd (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.4.23
// Fields: entPhysicalName
// Description: Port dirty check end.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.4.23"] = [
    name: "hwPortDirtyCheckEnd",
    fields: ["entPhysicalName"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwPowerRemove (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.5.1
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID, hwEntityOperStatus
// Description: This object indicates that the power supply cannot be detected.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.5.1"] = [
    name: "hwPowerRemove",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID", "hwEntityOperStatus"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3", "hwEntityOperStatus": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.2"]
]

// --- hwPowerInsert (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.5.2
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID, hwEntityOperStatus
// Description: This object indicates that the power supply can be detected.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.5.2"] = [
    name: "hwPowerInsert",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID", "hwEntityOperStatus"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3", "hwEntityOperStatus": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.2"]
]

// --- hwPowerFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.5.3
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID, hwEntityOperStatus, hwEntityTrapReasonDescr
// Description: This object indicates that the power supply encounters a partial failure.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.5.3"] = [
    name: "hwPowerFail",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID", "hwEntityOperStatus", "hwEntityTrapReasonDescr"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3", "hwEntityOperStatus": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.2", "hwEntityTrapReasonDescr": "1.3.6.1.4.1.2011.5.25.219.1.13"]
]

// --- hwPowerFailResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.5.4
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID, hwEntityOperStatus, hwEntityTrapReasonDescr
// Description: This object indicates that the power supply recovers from a partial failure.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.5.4"] = [
    name: "hwPowerFailResume",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID", "hwEntityOperStatus", "hwEntityTrapReasonDescr"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3", "hwEntityOperStatus": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.2", "hwEntityTrapReasonDescr": "1.3.6.1.4.1.2011.5.25.219.1.13"]
]

// --- hwPowerInvalid (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.5.5
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID, hwEntityOperStatus, hwEntityTrapReasonDescr
// Description: This object indicates that the power supply encounters an overall failure.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.5.5"] = [
    name: "hwPowerInvalid",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID", "hwEntityOperStatus", "hwEntityTrapReasonDescr"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3", "hwEntityOperStatus": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.2", "hwEntityTrapReasonDescr": "1.3.6.1.4.1.2011.5.25.219.1.13"]
]

// --- hwPowerInvalidResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.5.6
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID, hwEntityOperStatus, hwEntityTrapReasonDescr
// Description: This object indicates that the power supply recovers from an overall failure.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.5.6"] = [
    name: "hwPowerInvalidResume",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID", "hwEntityOperStatus", "hwEntityTrapReasonDescr"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3", "hwEntityOperStatus": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.2", "hwEntityTrapReasonDescr": "1.3.6.1.4.1.2011.5.25.219.1.13"]
]

// --- hwPowerUnusable (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.5.7
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID
// Description: This object indicates that the power supply is unavailable.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.5.7"] = [
    name: "hwPowerUnusable",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwPowerUnusableResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.5.8
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID
// Description: This object indicates that the power supply is unavailable.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.5.8"] = [
    name: "hwPowerUnusableResume",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwPowerInsufficient (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.5.9
// Fields: hwPowerWorkMode, hwExpectPowerWorkMode
// Description: AP power supply is insufficient.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.5.9"] = [
    name: "hwPowerInsufficient",
    fields: ["hwPowerWorkMode", "hwExpectPowerWorkMode"],
    fieldOids: ["hwPowerWorkMode": "1.3.6.1.4.1.2011.5.25.219.1.28", "hwExpectPowerWorkMode": "1.3.6.1.4.1.2011.5.25.219.1.29"]
]

// --- hwPowerInsufficientResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.5.10
// Fields: hwPowerWorkMode, hwExpectPowerWorkMode
// Description: AP power supply insufficient resume.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.5.10"] = [
    name: "hwPowerInsufficientResume",
    fields: ["hwPowerWorkMode", "hwExpectPowerWorkMode"],
    fieldOids: ["hwPowerWorkMode": "1.3.6.1.4.1.2011.5.25.219.1.28", "hwExpectPowerWorkMode": "1.3.6.1.4.1.2011.5.25.219.1.29"]
]

// --- hwIntegratedPowerFault (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.5.11
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID, hwEntityTrapReasonDescr
// Description: Integrated power failure.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.5.11"] = [
    name: "hwIntegratedPowerFault",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID", "hwEntityTrapReasonDescr"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3", "hwEntityTrapReasonDescr": "1.3.6.1.4.1.2011.5.25.219.1.13"]
]

// --- hwIntegratedPowerFaultResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.5.12
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID, hwEntityTrapReasonDescr
// Description: Integrated power failure resume.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.5.12"] = [
    name: "hwIntegratedPowerFaultResume",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID", "hwEntityTrapReasonDescr"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3", "hwEntityTrapReasonDescr": "1.3.6.1.4.1.2011.5.25.219.1.13"]
]

// --- hwPowerLimited (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.5.13
// Fields: hwPowerWorkMode, hwExpectPowerWorkMode
// Description: The AP works in Limited mode due to insufficient power supply.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.5.13"] = [
    name: "hwPowerLimited",
    fields: ["hwPowerWorkMode", "hwExpectPowerWorkMode"],
    fieldOids: ["hwPowerWorkMode": "1.3.6.1.4.1.2011.5.25.219.1.28", "hwExpectPowerWorkMode": "1.3.6.1.4.1.2011.5.25.219.1.29"]
]

// --- hwFanRemove (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.6.1
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID, hwEntityOperStatus
// Description: This object indicates that a fan cannot be detected.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.6.1"] = [
    name: "hwFanRemove",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID", "hwEntityOperStatus"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3", "hwEntityOperStatus": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.2"]
]

// --- hwFanInsert (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.6.2
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID, hwEntityOperStatus
// Description: This object indicates that a fan can be detected.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.6.2"] = [
    name: "hwFanInsert",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID", "hwEntityOperStatus"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3", "hwEntityOperStatus": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.2"]
]

// --- hwFanFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.6.3
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID, hwEntityOperStatus, hwEntityTrapReasonDescr
// Description: This object indicates that a fan encounters a partial failure.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.6.3"] = [
    name: "hwFanFail",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID", "hwEntityOperStatus", "hwEntityTrapReasonDescr"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3", "hwEntityOperStatus": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.2", "hwEntityTrapReasonDescr": "1.3.6.1.4.1.2011.5.25.219.1.13"]
]

// --- hwFanFailResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.6.4
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID, hwEntityOperStatus, hwEntityTrapReasonDescr
// Description: This object indicates that a fan recovers from a partial failure.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.6.4"] = [
    name: "hwFanFailResume",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID", "hwEntityOperStatus", "hwEntityTrapReasonDescr"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3", "hwEntityOperStatus": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.2", "hwEntityTrapReasonDescr": "1.3.6.1.4.1.2011.5.25.219.1.13"]
]

// --- hwFanInvalid (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.6.5
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID, hwEntityOperStatus, hwEntityTrapReasonDescr
// Description: This object indicates that a fan encounters an overall failure.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.6.5"] = [
    name: "hwFanInvalid",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID", "hwEntityOperStatus", "hwEntityTrapReasonDescr"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3", "hwEntityOperStatus": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.2", "hwEntityTrapReasonDescr": "1.3.6.1.4.1.2011.5.25.219.1.13"]
]

// --- hwFanInvalidResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.6.6
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID, hwEntityOperStatus, hwEntityTrapReasonDescr
// Description: This object indicates that a fan recovers from an overall failure.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.6.6"] = [
    name: "hwFanInvalidResume",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID", "hwEntityOperStatus", "hwEntityTrapReasonDescr"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3", "hwEntityOperStatus": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.2", "hwEntityTrapReasonDescr": "1.3.6.1.4.1.2011.5.25.219.1.13"]
]

// --- hwFanUnusable (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.6.7
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID
// Description: This object indicates that a fan is unavailable.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.6.7"] = [
    name: "hwFanUnusable",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwFanUnusableResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.6.8
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID
// Description: This object indicates that a fan becomes available.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.6.8"] = [
    name: "hwFanUnusableResume",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwFanMinorAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.6.9
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID, hwEntityOperStatus, hwEntityTrapReasonDescr
// Description: This object indicates that a minor fault occurred on the fan.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.6.9"] = [
    name: "hwFanMinorAlarm",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID", "hwEntityOperStatus", "hwEntityTrapReasonDescr"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3", "hwEntityOperStatus": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.2", "hwEntityTrapReasonDescr": "1.3.6.1.4.1.2011.5.25.219.1.13"]
]

// --- hwFanMinorAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.6.10
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID, hwEntityOperStatus, hwEntityTrapReasonDescr
// Description: This object indicates that the fan module recovered from the minor fault.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.6.10"] = [
    name: "hwFanMinorAlarmResume",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID", "hwEntityOperStatus", "hwEntityTrapReasonDescr"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3", "hwEntityOperStatus": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.2", "hwEntityTrapReasonDescr": "1.3.6.1.4.1.2011.5.25.219.1.13"]
]

// --- hwLcdRemove (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.7.1
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID
// Description: Lcd has been removed.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.7.1"] = [
    name: "hwLcdRemove",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwLcdInsert (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.7.2
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID
// Description: Lcd has been inserted.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.7.2"] = [
    name: "hwLcdInsert",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwLcdInvalid (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.7.3
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID
// Description: Lcd is invalid for some reason.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.7.3"] = [
    name: "hwLcdInvalid",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwLcdInvalidResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.7.4
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID
// Description: Lcd resume from invalid situation.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.7.4"] = [
    name: "hwLcdInvalidResume",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwLcdUnusable (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.7.5
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID
// Description: Lcd change to unusable status.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.7.5"] = [
    name: "hwLcdUnusable",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwLcdUnusableResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.7.6
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID
// Description: Lcd change to usable status.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.7.6"] = [
    name: "hwLcdUnusableResume",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwCmuRemove (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.8.1
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID
// Description: This object indicates that a CMU cannot be detected.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.8.1"] = [
    name: "hwCmuRemove",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwCmuInsert (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.8.2
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID
// Description: This object indicates that a CMU can be detected.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.8.2"] = [
    name: "hwCmuInsert",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwCmuInvalid (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.8.3
// Fields: entPhysicalIndex, entPhysicalName, hwEntityTrapFaultID
// Description: This object indicates that a CMU encounters an overall failure.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.8.3"] = [
    name: "hwCmuInvalid",
    fields: ["entPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID"],
    fieldOids: ["entPhysicalIndex": "1.3.6.1.2.1.47.1.1.1.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwCmuInvalidResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.8.4
// Fields: entPhysicalIndex, entPhysicalName, hwEntityTrapFaultID
// Description: This object indicates that a CMU recovers from an overall failure.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.8.4"] = [
    name: "hwCmuInvalidResume",
    fields: ["entPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID"],
    fieldOids: ["entPhysicalIndex": "1.3.6.1.2.1.47.1.1.1.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwCmuUnusable (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.8.5
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID
// Description: This object indicates that a CMU is unavailable.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.8.5"] = [
    name: "hwCmuUnusable",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwCmuUnusableResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.8.6
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID
// Description: This object indicates that a CMU becomes available.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.8.6"] = [
    name: "hwCmuUnusableResume",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwCmuFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.8.7
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID
// Description: The CMU experienced a partial failure.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.8.7"] = [
    name: "hwCmuFail",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwCmuFailResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.8.8
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID
// Description: The CMU recovered from a partial failure.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.8.8"] = [
    name: "hwCmuFailResume",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwCommunicateError (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.9.1
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapEntType, hwEntityTrapFaultID, hwEntityCommunicateType, hwEntityTrapReasonDescr
// Description: This object indicates that a channel is abnormal.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.9.1"] = [
    name: "hwCommunicateError",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapEntType", "hwEntityTrapFaultID", "hwEntityCommunicateType", "hwEntityTrapReasonDescr"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapEntType": "1.3.6.1.4.1.2011.5.25.219.1.2", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3", "hwEntityCommunicateType": "1.3.6.1.4.1.2011.5.25.219.1.4", "hwEntityTrapReasonDescr": "1.3.6.1.4.1.2011.5.25.219.1.13"]
]

// --- hwCommunicateResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.9.2
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapEntType, hwEntityTrapFaultID, hwEntityCommunicateType, hwEntityTrapReasonDescr
// Description: This object indicates that a channel recovers from a fault.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.9.2"] = [
    name: "hwCommunicateResume",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapEntType", "hwEntityTrapFaultID", "hwEntityCommunicateType", "hwEntityTrapReasonDescr"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapEntType": "1.3.6.1.4.1.2011.5.25.219.1.2", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3", "hwEntityCommunicateType": "1.3.6.1.4.1.2011.5.25.219.1.4", "hwEntityTrapReasonDescr": "1.3.6.1.4.1.2011.5.25.219.1.13"]
]

// --- hwInnerPortPacketCrcErr (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.9.3
// Fields: hwInnerPortSlotId, hwInnerPortCpuId, hwInnerPortPortId
// Description: The internal communication interface encountered a CRC error.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.9.3"] = [
    name: "hwInnerPortPacketCrcErr",
    fields: ["hwInnerPortSlotId", "hwInnerPortCpuId", "hwInnerPortPortId"],
    fieldOids: ["hwInnerPortSlotId": "1.3.6.1.4.1.2011.5.25.219.1.46", "hwInnerPortCpuId": "1.3.6.1.4.1.2011.5.25.219.1.47", "hwInnerPortPortId": "1.3.6.1.4.1.2011.5.25.219.1.48"]
]

// --- hwInnerPortPacketCrcErrResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.9.4
// Fields: hwInnerPortSlotId, hwInnerPortCpuId, hwInnerPortPortId
// Description: The internal communication interface recovered from a CRC error.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.9.4"] = [
    name: "hwInnerPortPacketCrcErrResume",
    fields: ["hwInnerPortSlotId", "hwInnerPortCpuId", "hwInnerPortPortId"],
    fieldOids: ["hwInnerPortSlotId": "1.3.6.1.4.1.2011.5.25.219.1.46", "hwInnerPortCpuId": "1.3.6.1.4.1.2011.5.25.219.1.47", "hwInnerPortPortId": "1.3.6.1.4.1.2011.5.25.219.1.48"]
]

// --- hwInnerPortLinkDown (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.9.5
// Fields: hwInnerPortSlotId, hwInnerPortCpuId, hwInnerPortPortId
// Description: The link of the internal communication interface went down.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.9.5"] = [
    name: "hwInnerPortLinkDown",
    fields: ["hwInnerPortSlotId", "hwInnerPortCpuId", "hwInnerPortPortId"],
    fieldOids: ["hwInnerPortSlotId": "1.3.6.1.4.1.2011.5.25.219.1.46", "hwInnerPortCpuId": "1.3.6.1.4.1.2011.5.25.219.1.47", "hwInnerPortPortId": "1.3.6.1.4.1.2011.5.25.219.1.48"]
]

// --- hwInnerPortLinkUp (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.9.6
// Fields: hwInnerPortSlotId, hwInnerPortCpuId, hwInnerPortPortId
// Description: The link status of the internal communication interface went up.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.9.6"] = [
    name: "hwInnerPortLinkUp",
    fields: ["hwInnerPortSlotId", "hwInnerPortCpuId", "hwInnerPortPortId"],
    fieldOids: ["hwInnerPortSlotId": "1.3.6.1.4.1.2011.5.25.219.1.46", "hwInnerPortCpuId": "1.3.6.1.4.1.2011.5.25.219.1.47", "hwInnerPortPortId": "1.3.6.1.4.1.2011.5.25.219.1.48"]
]

// --- hwTempAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.10.1
// Fields: hwEntityThresholdType, hwEntityThresholdValue, hwEntityThresholdCurrent, hwEntityTrapFaultID
// Description: This object indicates that the ambient temperature is abnormal.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.10.1"] = [
    name: "hwTempAlarm",
    fields: ["hwEntityThresholdType", "hwEntityThresholdValue", "hwEntityThresholdCurrent", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityThresholdType": "1.3.6.1.4.1.2011.5.25.219.1.5.1.1", "hwEntityThresholdValue": "1.3.6.1.4.1.2011.5.25.219.1.5.1.2", "hwEntityThresholdCurrent": "1.3.6.1.4.1.2011.5.25.219.1.5.1.3", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwTempResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.10.2
// Fields: hwEntityThresholdType, hwEntityThresholdValue, hwEntityThresholdCurrent, hwEntityTrapFaultID
// Description: This object indicates that the ambient temperature recovers from an abnormality.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.10.2"] = [
    name: "hwTempResume",
    fields: ["hwEntityThresholdType", "hwEntityThresholdValue", "hwEntityThresholdCurrent", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityThresholdType": "1.3.6.1.4.1.2011.5.25.219.1.5.1.1", "hwEntityThresholdValue": "1.3.6.1.4.1.2011.5.25.219.1.5.1.2", "hwEntityThresholdCurrent": "1.3.6.1.4.1.2011.5.25.219.1.5.1.3", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwHumidityAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.10.3
// Fields: hwEntityThresholdType, hwEntityThresholdValue, hwEntityThresholdCurrent, hwEntityTrapFaultID
// Description: This object indicates that the ambient humidity is abnormal.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.10.3"] = [
    name: "hwHumidityAlarm",
    fields: ["hwEntityThresholdType", "hwEntityThresholdValue", "hwEntityThresholdCurrent", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityThresholdType": "1.3.6.1.4.1.2011.5.25.219.1.5.1.1", "hwEntityThresholdValue": "1.3.6.1.4.1.2011.5.25.219.1.5.1.2", "hwEntityThresholdCurrent": "1.3.6.1.4.1.2011.5.25.219.1.5.1.3", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwHumidityResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.10.4
// Fields: hwEntityThresholdType, hwEntityThresholdValue, hwEntityThresholdCurrent, hwEntityTrapFaultID
// Description: This object indicates that the ambient humidity recovers from an abnormality.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.10.4"] = [
    name: "hwHumidityResume",
    fields: ["hwEntityThresholdType", "hwEntityThresholdValue", "hwEntityThresholdCurrent", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityThresholdType": "1.3.6.1.4.1.2011.5.25.219.1.5.1.1", "hwEntityThresholdValue": "1.3.6.1.4.1.2011.5.25.219.1.5.1.2", "hwEntityThresholdCurrent": "1.3.6.1.4.1.2011.5.25.219.1.5.1.3", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwVoltAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.10.5
// Fields: hwEntityThresholdType, hwEntityThresholdValue, hwEntityThresholdCurrent, hwEntityTrapFaultID
// Description: This object indicates that the ambient voltage is abnormal.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.10.5"] = [
    name: "hwVoltAlarm",
    fields: ["hwEntityThresholdType", "hwEntityThresholdValue", "hwEntityThresholdCurrent", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityThresholdType": "1.3.6.1.4.1.2011.5.25.219.1.5.1.1", "hwEntityThresholdValue": "1.3.6.1.4.1.2011.5.25.219.1.5.1.2", "hwEntityThresholdCurrent": "1.3.6.1.4.1.2011.5.25.219.1.5.1.3", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwVoltResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.10.6
// Fields: hwEntityThresholdType, hwEntityThresholdValue, hwEntityThresholdCurrent, hwEntityTrapFaultID
// Description: This object indicates that the ambient voltage recovers from an abnormality.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.10.6"] = [
    name: "hwVoltResume",
    fields: ["hwEntityThresholdType", "hwEntityThresholdValue", "hwEntityThresholdCurrent", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityThresholdType": "1.3.6.1.4.1.2011.5.25.219.1.5.1.1", "hwEntityThresholdValue": "1.3.6.1.4.1.2011.5.25.219.1.5.1.2", "hwEntityThresholdCurrent": "1.3.6.1.4.1.2011.5.25.219.1.5.1.3", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwGateAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.10.7
// Fields: hwEntityThresholdType, hwEntityThresholdValue, hwEntityThresholdCurrent, hwEntityTrapFaultID
// Description: This object indicates that the door control status is abnormal.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.10.7"] = [
    name: "hwGateAlarm",
    fields: ["hwEntityThresholdType", "hwEntityThresholdValue", "hwEntityThresholdCurrent", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityThresholdType": "1.3.6.1.4.1.2011.5.25.219.1.5.1.1", "hwEntityThresholdValue": "1.3.6.1.4.1.2011.5.25.219.1.5.1.2", "hwEntityThresholdCurrent": "1.3.6.1.4.1.2011.5.25.219.1.5.1.3", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwGateResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.10.8
// Fields: hwEntityThresholdType, hwEntityThresholdValue, hwEntityThresholdCurrent, hwEntityTrapFaultID
// Description: This object indicates that the door control status recovers from an abnormality.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.10.8"] = [
    name: "hwGateResume",
    fields: ["hwEntityThresholdType", "hwEntityThresholdValue", "hwEntityThresholdCurrent", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityThresholdType": "1.3.6.1.4.1.2011.5.25.219.1.5.1.1", "hwEntityThresholdValue": "1.3.6.1.4.1.2011.5.25.219.1.5.1.2", "hwEntityThresholdCurrent": "1.3.6.1.4.1.2011.5.25.219.1.5.1.3", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwFogAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.10.9
// Fields: hwEntityThresholdType, hwEntityThresholdValue, hwEntityThresholdCurrent, hwEntityTrapFaultID
// Description: This object indicates that the smoke sensor is abnormal.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.10.9"] = [
    name: "hwFogAlarm",
    fields: ["hwEntityThresholdType", "hwEntityThresholdValue", "hwEntityThresholdCurrent", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityThresholdType": "1.3.6.1.4.1.2011.5.25.219.1.5.1.1", "hwEntityThresholdValue": "1.3.6.1.4.1.2011.5.25.219.1.5.1.2", "hwEntityThresholdCurrent": "1.3.6.1.4.1.2011.5.25.219.1.5.1.3", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwFogResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.10.10
// Fields: hwEntityThresholdType, hwEntityThresholdValue, hwEntityThresholdCurrent, hwEntityTrapFaultID
// Description: This object indicates that the smoke sensor recovers from an abnormality.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.10.10"] = [
    name: "hwFogResume",
    fields: ["hwEntityThresholdType", "hwEntityThresholdValue", "hwEntityThresholdCurrent", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityThresholdType": "1.3.6.1.4.1.2011.5.25.219.1.5.1.1", "hwEntityThresholdValue": "1.3.6.1.4.1.2011.5.25.219.1.5.1.2", "hwEntityThresholdCurrent": "1.3.6.1.4.1.2011.5.25.219.1.5.1.3", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwUnstableAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.10.11
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapEntType, hwEntityTrapFaultID
// Description: This object indicates that a physical entity is not securely inserted.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.10.11"] = [
    name: "hwUnstableAlarm",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapEntType", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapEntType": "1.3.6.1.4.1.2011.5.25.219.1.2", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwUnstableResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.10.12
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapEntType, hwEntityTrapFaultID
// Description: This object indicates that a physical entity is securely inserted.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.10.12"] = [
    name: "hwUnstableResume",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapEntType", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapEntType": "1.3.6.1.4.1.2011.5.25.219.1.2", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwBrdTempAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.10.13
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityThresholdType, hwEntityThresholdWarning, hwEntityThresholdCurrent, hwEntityTrapFaultID
// Description: This object indicates that the board temperature is abnormal.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.10.13"] = [
    name: "hwBrdTempAlarm",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityThresholdType", "hwEntityThresholdWarning", "hwEntityThresholdCurrent", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityThresholdType": "1.3.6.1.4.1.2011.5.25.219.1.5.1.1", "hwEntityThresholdWarning": "1.3.6.1.4.1.2011.5.25.219.1.5.1.5", "hwEntityThresholdCurrent": "1.3.6.1.4.1.2011.5.25.219.1.5.1.3", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwBrdTempResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.10.14
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityThresholdType, hwEntityThresholdWarning, hwEntityThresholdCurrent, hwEntityTrapFaultID
// Description: This object indicates that the board temperature recovers from an abnormality.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.10.14"] = [
    name: "hwBrdTempResume",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityThresholdType", "hwEntityThresholdWarning", "hwEntityThresholdCurrent", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityThresholdType": "1.3.6.1.4.1.2011.5.25.219.1.5.1.1", "hwEntityThresholdWarning": "1.3.6.1.4.1.2011.5.25.219.1.5.1.5", "hwEntityThresholdCurrent": "1.3.6.1.4.1.2011.5.25.219.1.5.1.3", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwBrdTempFatalAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.10.15
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityThresholdType, hwEntityThresholdCritical, hwEntityThresholdCurrent, hwEntityTrapFaultID
// Description: This object indicates that the board temperature encounters a fatal abnormality.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.10.15"] = [
    name: "hwBrdTempFatalAlarm",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityThresholdType", "hwEntityThresholdCritical", "hwEntityThresholdCurrent", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityThresholdType": "1.3.6.1.4.1.2011.5.25.219.1.5.1.1", "hwEntityThresholdCritical": "1.3.6.1.4.1.2011.5.25.219.1.5.1.4", "hwEntityThresholdCurrent": "1.3.6.1.4.1.2011.5.25.219.1.5.1.3", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwBrdTempFatalResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.10.16
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityThresholdType, hwEntityThresholdCritical, hwEntityThresholdCurrent, hwEntityTrapFaultID
// Description: This object indicates that the board temperature recovers from a fatal abnormality.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.10.16"] = [
    name: "hwBrdTempFatalResume",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityThresholdType", "hwEntityThresholdCritical", "hwEntityThresholdCurrent", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityThresholdType": "1.3.6.1.4.1.2011.5.25.219.1.5.1.1", "hwEntityThresholdCritical": "1.3.6.1.4.1.2011.5.25.219.1.5.1.4", "hwEntityThresholdCurrent": "1.3.6.1.4.1.2011.5.25.219.1.5.1.3", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwPowerFailureAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.10.17
// Description: Power supply failed.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.10.17"] = [
    name: "hwPowerFailureAlarm",
    fields: [],
    fieldOids: []
]

// --- hwPowerFailureResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.10.18
// Description: Power supply resumed.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.10.18"] = [
    name: "hwPowerFailureResume",
    fields: [],
    fieldOids: []
]

// --- hwIOSwitchOneAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.10.19
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwUserDefAlarmName
// Description: The IO-alarm 1 arise.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.10.19"] = [
    name: "hwIOSwitchOneAlarm",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwUserDefAlarmName"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwUserDefAlarmName": "1.3.6.1.4.1.2011.5.25.219.1.6"]
]

// --- hwIOSwitchOneAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.10.20
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwUserDefAlarmName
// Description: The IO-alarm 1 resumed.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.10.20"] = [
    name: "hwIOSwitchOneAlarmResume",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwUserDefAlarmName"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwUserDefAlarmName": "1.3.6.1.4.1.2011.5.25.219.1.6"]
]

// --- hwIOSwitchTwoAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.10.21
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwUserDefAlarmName
// Description: The IO-alarm 2 arise.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.10.21"] = [
    name: "hwIOSwitchTwoAlarm",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwUserDefAlarmName"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwUserDefAlarmName": "1.3.6.1.4.1.2011.5.25.219.1.6"]
]

// --- hwIOSwitchTwoAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.10.22
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwUserDefAlarmName
// Description: The IO-alarm 2 resumed.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.10.22"] = [
    name: "hwIOSwitchTwoAlarmResume",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwUserDefAlarmName"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwUserDefAlarmName": "1.3.6.1.4.1.2011.5.25.219.1.6"]
]

// --- hwIOSwitchThreeAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.10.23
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwUserDefAlarmName
// Description: The IO-alarm 3 arise.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.10.23"] = [
    name: "hwIOSwitchThreeAlarm",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwUserDefAlarmName"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwUserDefAlarmName": "1.3.6.1.4.1.2011.5.25.219.1.6"]
]

// --- hwIOSwitchThreeAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.10.24
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwUserDefAlarmName
// Description: The IO-alarm 3 resumed.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.10.24"] = [
    name: "hwIOSwitchThreeAlarmResume",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwUserDefAlarmName"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwUserDefAlarmName": "1.3.6.1.4.1.2011.5.25.219.1.6"]
]

// --- hwEntityDyingGaspEvent (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.10.25
// Fields: hwEntityTrapRelativeResource, hwEntityTrapReasonDescr
// Description: Power supply failed.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.10.25"] = [
    name: "hwEntityDyingGaspEvent",
    fields: ["hwEntityTrapRelativeResource", "hwEntityTrapReasonDescr"],
    fieldOids: ["hwEntityTrapRelativeResource": "1.3.6.1.4.1.2011.5.25.219.1.12", "hwEntityTrapReasonDescr": "1.3.6.1.4.1.2011.5.25.219.1.13"]
]

// --- hwIOSwitchAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.10.26
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwUserDefAlarmName
// Description: The IO-alarm arise.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.10.26"] = [
    name: "hwIOSwitchAlarm",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwUserDefAlarmName"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwUserDefAlarmName": "1.3.6.1.4.1.2011.5.25.219.1.6"]
]

// --- hwIOSwitchAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.10.27
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwUserDefAlarmName
// Description: The IO-alarm resumed.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.10.27"] = [
    name: "hwIOSwitchAlarmResume",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwUserDefAlarmName"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwUserDefAlarmName": "1.3.6.1.4.1.2011.5.25.219.1.6"]
]

// --- hwSystemConfigError (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.11.1
// Fields: hwEntityTrapFaultID
// Description: System configuration error has been detected.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.11.1"] = [
    name: "hwSystemConfigError",
    fields: ["hwEntityTrapFaultID"],
    fieldOids: ["hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwSystemConfigResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.11.2
// Fields: hwEntityTrapFaultID
// Description: Resume from system configuration error situation.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.11.2"] = [
    name: "hwSystemConfigResume",
    fields: ["hwEntityTrapFaultID"],
    fieldOids: ["hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwSystemRollback (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.11.3
// Fields: hwEntityTrapReasonDescr, hwSoftwareVersion, hwStartupSoftwareFileName
// Description: The system was rollback.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.11.3"] = [
    name: "hwSystemRollback",
    fields: ["hwEntityTrapReasonDescr", "hwSoftwareVersion", "hwStartupSoftwareFileName"],
    fieldOids: ["hwEntityTrapReasonDescr": "1.3.6.1.4.1.2011.5.25.219.1.13", "hwSoftwareVersion": "1.3.6.1.4.1.2011.5.25.219.1.8", "hwStartupSoftwareFileName": "1.3.6.1.4.1.2011.5.25.219.1.9"]
]

// --- hwVirtualAccessDrvConfigError (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.11.4
// Fields: hwMasterOpUser, hwAPAdminIP, hwAPID, hwOperation, hwReason
// Description: System configuration error has been detected.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.11.4"] = [
    name: "hwVirtualAccessDrvConfigError",
    fields: ["hwMasterOpUser", "hwAPAdminIP", "hwAPID", "hwOperation", "hwReason"],
    fieldOids: ["hwMasterOpUser": "1.3.6.1.4.1.2011.5.25.219.1.17", "hwAPAdminIP": "1.3.6.1.4.1.2011.5.25.219.1.18", "hwAPID": "1.3.6.1.4.1.2011.5.25.219.1.19", "hwOperation": "1.3.6.1.4.1.2011.5.25.219.1.20", "hwReason": "1.3.6.1.4.1.2011.5.25.219.1.21"]
]

// --- hwPatchDelNeedReStartTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.11.5
// Description: The device needs to restart after the patch is deleted.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.11.5"] = [
    name: "hwPatchDelNeedReStartTrap",
    fields: [],
    fieldOids: []
]

// --- hwSMSReboot (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.11.6
// Fields: hwEntityTrapReasonDescr
// Description: The result of the SMS reboot function.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.11.6"] = [
    name: "hwSMSReboot",
    fields: ["hwEntityTrapReasonDescr"],
    fieldOids: ["hwEntityTrapReasonDescr": "1.3.6.1.4.1.2011.5.25.219.1.13"]
]

// --- hwVirtualLicenseNearDeadline (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.11.7
// Fields: hwLicenseRemainTime, hwVirtualLicenseItemName
// Description: The virtual license of device is near deadline.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.11.7"] = [
    name: "hwVirtualLicenseNearDeadline",
    fields: ["hwLicenseRemainTime", "hwVirtualLicenseItemName"],
    fieldOids: ["hwLicenseRemainTime": "1.3.6.1.4.1.2011.5.25.219.1.40", "hwVirtualLicenseItemName": "1.3.6.1.4.1.2011.5.25.219.1.44"]
]

// --- hwVirtualLicenseExpire (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.11.8
// Fields: hwVirtualLicenseItemName
// Description: The virtual license of device has expired.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.11.8"] = [
    name: "hwVirtualLicenseExpire",
    fields: ["hwVirtualLicenseItemName"],
    fieldOids: ["hwVirtualLicenseItemName": "1.3.6.1.4.1.2011.5.25.219.1.44"]
]

// --- hwVirtualLicenseExpResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.11.9
// Fields: hwVirtualLicenseItemName
// Description: The virtual license expiry alarm was cleared.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.11.9"] = [
    name: "hwVirtualLicenseExpResume",
    fields: ["hwVirtualLicenseItemName"],
    fieldOids: ["hwVirtualLicenseItemName": "1.3.6.1.4.1.2011.5.25.219.1.44"]
]

// --- hwSystemConfigNotMatchTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.11.10
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapEntType, hwEntityTrapFaultID, hwEntityTrapReasonDescr
// Description: The configuration on the device is different from that on the controller.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.11.10"] = [
    name: "hwSystemConfigNotMatchTrap",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapEntType", "hwEntityTrapFaultID", "hwEntityTrapReasonDescr"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapEntType": "1.3.6.1.4.1.2011.5.25.219.1.2", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3", "hwEntityTrapReasonDescr": "1.3.6.1.4.1.2011.5.25.219.1.13"]
]

// --- hwNetconfDatabaseAbnormal (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.11.11
// Description: Database failed to pass the self-test process.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.11.11"] = [
    name: "hwNetconfDatabaseAbnormal",
    fields: [],
    fieldOids: []
]

// --- hwNetconfDatabaseRestore (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.11.12
// Description: Abnormal database resume.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.11.12"] = [
    name: "hwNetconfDatabaseRestore",
    fields: [],
    fieldOids: []
]

// --- hwCfgDatabaseException (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.11.13
// Description: The database has occured exception and the device needs to restart.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.11.13"] = [
    name: "hwCfgDatabaseException",
    fields: [],
    fieldOids: []
]

// --- hwVirtualLicenseNearDeadlineResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.11.14
// Fields: hwVirtualLicenseItemName
// Description: The virtual license near deadline alarm was cleared.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.11.14"] = [
    name: "hwVirtualLicenseNearDeadlineResume",
    fields: ["hwVirtualLicenseItemName"],
    fieldOids: ["hwVirtualLicenseItemName": "1.3.6.1.4.1.2011.5.25.219.1.44"]
]

// --- hwNoConsolePassword (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.11.15
// Description: No password is configured for the console.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.11.15"] = [
    name: "hwNoConsolePassword",
    fields: [],
    fieldOids: []
]

// --- hwSystemLostConfig (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.11.16
// Fields: hwLostConfigNumber
// Description: some configurations are lost when device configurations are reported to the controller.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.11.16"] = [
    name: "hwSystemLostConfig",
    fields: ["hwLostConfigNumber"],
    fieldOids: ["hwLostConfigNumber": "1.3.6.1.4.1.2011.5.25.219.1.85"]
]

// --- hwPortDown (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.12.1
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID, hwPortDownReason, ifOperStatus, ifAdminStatus
// Description: One of the port physical connect down.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.12.1"] = [
    name: "hwPortDown",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID", "hwPortDownReason", "ifOperStatus", "ifAdminStatus"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3", "hwPortDownReason": "1.3.6.1.4.1.2011.5.25.219.1.11", "ifOperStatus": "1.3.6.1.2.1.2.2.1.8", "ifAdminStatus": "1.3.6.1.2.1.2.2.1.7"]
]

// --- hwPortUp (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.12.2
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID, ifOperStatus, ifAdminStatus
// Description: One of the port physical connect up.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.12.2"] = [
    name: "hwPortUp",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID", "ifOperStatus", "ifAdminStatus"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3", "ifOperStatus": "1.3.6.1.2.1.2.2.1.8", "ifAdminStatus": "1.3.6.1.2.1.2.2.1.7"]
]

// --- hwPortNoSupportOETrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.12.3
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID
// Description: one of the stack port does not support the insertion of the O/E converter.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.12.3"] = [
    name: "hwPortNoSupportOETrap",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwPortRemove (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.12.4
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID
// Description: One of the port is removed.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.12.4"] = [
    name: "hwPortRemove",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwPortInsert (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.12.5
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID
// Description: One new port is inserted.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.12.5"] = [
    name: "hwPortInsert",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwPortOpticalPositionInvalid (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.12.8
// Fields: hwEntityPhysicalIndex, entPhysicalName
// Description: The current port is invalid.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.12.8"] = [
    name: "hwPortOpticalPositionInvalid",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwPortOpticalPositionValid (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.12.9
// Fields: hwEntityPhysicalIndex, entPhysicalName
// Description: The current port is valid.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.12.9"] = [
    name: "hwPortOpticalPositionValid",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwPortInvalid (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.12.10
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapEntType, hwEntityTrapFaultID, hwEntityTrapReasonDescr, hwEntityOperStatus
// Description: Port is invalid.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.12.10"] = [
    name: "hwPortInvalid",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapEntType", "hwEntityTrapFaultID", "hwEntityTrapReasonDescr", "hwEntityOperStatus"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapEntType": "1.3.6.1.4.1.2011.5.25.219.1.2", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3", "hwEntityTrapReasonDescr": "1.3.6.1.4.1.2011.5.25.219.1.13", "hwEntityOperStatus": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.2"]
]

// --- hwPortFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.12.11
// Fields: entPhysicalIndex, entPhysicalName, hwEntityTrapFaultID
// Description: The port failed partially.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.12.11"] = [
    name: "hwPortFail",
    fields: ["entPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID"],
    fieldOids: ["entPhysicalIndex": "1.3.6.1.2.1.47.1.1.1.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwPortFailResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.12.12
// Fields: entPhysicalIndex, entPhysicalName, hwEntityTrapFaultID
// Description: The port resumed from partial failure.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.12.12"] = [
    name: "hwPortFailResume",
    fields: ["entPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID"],
    fieldOids: ["entPhysicalIndex": "1.3.6.1.2.1.47.1.1.1.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwUserDefAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.13.1
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwUserDefAlarmName, hwUserDefChannel
// Description: User defined alarm has been detected.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.13.1"] = [
    name: "hwUserDefAlarm",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwUserDefAlarmName", "hwUserDefChannel"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwUserDefAlarmName": "1.3.6.1.4.1.2011.5.25.219.1.6", "hwUserDefChannel": "1.3.6.1.4.1.2011.5.25.219.1.7"]
]

// --- hwUserDefResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.13.2
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwUserDefAlarmName, hwUserDefChannel
// Description: Resume from User defined alarm.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.13.2"] = [
    name: "hwUserDefResume",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwUserDefAlarmName", "hwUserDefChannel"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwUserDefAlarmName": "1.3.6.1.4.1.2011.5.25.219.1.6", "hwUserDefChannel": "1.3.6.1.4.1.2011.5.25.219.1.7"]
]

// --- hwPeerDevPnPTrunkAggregationFailure (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.13.3
// Fields: hwDeviceMasterESN
// Description: The peer device cannot go online because Eth-Trunk auto-negotiation fails.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.13.3"] = [
    name: "hwPeerDevPnPTrunkAggregationFailure",
    fields: ["hwDeviceMasterESN"],
    fieldOids: ["hwDeviceMasterESN": "1.3.6.1.4.1.2011.5.25.219.1.64"]
]

// --- hwEsnMismatch (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.13.4
// Fields: hwEntityPhysicalIndex, entPhysicalName
// Description: The ESN of the card does not match the license file.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.13.4"] = [
    name: "hwEsnMismatch",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwMacNumMismatch (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.13.5
// Fields: hwEntityPhysicalIndex, entPhysicalName
// Description: The current mac-num of the MPU is less than the system mac-num.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.13.5"] = [
    name: "hwMacNumMismatch",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwAvaMemInsufficient (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.13.6
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwAvailableMemory, hwAvailableMemoryThreshold
// Description: Insufficient available memory.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.13.6"] = [
    name: "hwAvaMemInsufficient",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwAvailableMemory", "hwAvailableMemoryThreshold"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwAvailableMemory": "1.3.6.1.4.1.2011.5.25.219.1.71", "hwAvailableMemoryThreshold": "1.3.6.1.4.1.2011.5.25.219.1.72"]
]

// --- hwAvaMemInsufficientResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.13.7
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwAvailableMemory, hwAvailableMemoryThreshold
// Description: Resume from insufficient available memory.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.13.7"] = [
    name: "hwAvaMemInsufficientResume",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwAvailableMemory", "hwAvailableMemoryThreshold"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwAvailableMemory": "1.3.6.1.4.1.2011.5.25.219.1.71", "hwAvailableMemoryThreshold": "1.3.6.1.4.1.2011.5.25.219.1.72"]
]

// --- hwHeatAbnormal (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.13.13
// Fields: entPhysicalIndex, entPhysicalName
// Description: The switch is experiencing abnormal heat dissipation.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.13.13"] = [
    name: "hwHeatAbnormal",
    fields: ["entPhysicalIndex", "entPhysicalName"],
    fieldOids: ["entPhysicalIndex": "1.3.6.1.2.1.47.1.1.1.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwHeatNormal (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.13.14
// Fields: entPhysicalIndex, entPhysicalName
// Description: The switch's heat dissipation has returned to normal.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.13.14"] = [
    name: "hwHeatNormal",
    fields: ["entPhysicalIndex", "entPhysicalName"],
    fieldOids: ["entPhysicalIndex": "1.3.6.1.2.1.47.1.1.1.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwCPUUtilizationRising (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.14.1
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityThresholdType, hwEntityThresholdWarning, hwEntityThresholdCurrent, hwEntityTrapFaultID
// Description: CPU utilization overrun.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.14.1"] = [
    name: "hwCPUUtilizationRising",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityThresholdType", "hwEntityThresholdWarning", "hwEntityThresholdCurrent", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityThresholdType": "1.3.6.1.4.1.2011.5.25.219.1.5.1.1", "hwEntityThresholdWarning": "1.3.6.1.4.1.2011.5.25.219.1.5.1.5", "hwEntityThresholdCurrent": "1.3.6.1.4.1.2011.5.25.219.1.5.1.3", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwCPUUtilizationResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.14.2
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityThresholdType, hwEntityThresholdWarning, hwEntityThresholdCurrent, hwEntityTrapFaultID
// Description: CPU utilization back to normal level
trapMap["1.3.6.1.4.1.2011.5.25.219.2.14.2"] = [
    name: "hwCPUUtilizationResume",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityThresholdType", "hwEntityThresholdWarning", "hwEntityThresholdCurrent", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityThresholdType": "1.3.6.1.4.1.2011.5.25.219.1.5.1.1", "hwEntityThresholdWarning": "1.3.6.1.4.1.2011.5.25.219.1.5.1.5", "hwEntityThresholdCurrent": "1.3.6.1.4.1.2011.5.25.219.1.5.1.3", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwCpuFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.14.3
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID
// Description: A fault occurred in the CPU.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.14.3"] = [
    name: "hwCpuFail",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwCpuFailResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.14.4
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID
// Description: The cpu resumed from failure.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.14.4"] = [
    name: "hwCpuFailResume",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwFwdCPUUtilizationRising (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.14.5
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityThresholdType, hwEntityThresholdWarning, hwEntityThresholdCurrent, hwEntityTrapFaultID
// Description: CPU utilization overrun.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.14.5"] = [
    name: "hwFwdCPUUtilizationRising",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityThresholdType", "hwEntityThresholdWarning", "hwEntityThresholdCurrent", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityThresholdType": "1.3.6.1.4.1.2011.5.25.219.1.5.1.1", "hwEntityThresholdWarning": "1.3.6.1.4.1.2011.5.25.219.1.5.1.5", "hwEntityThresholdCurrent": "1.3.6.1.4.1.2011.5.25.219.1.5.1.3", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwFwdCPUUtilizationResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.14.6
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityThresholdType, hwEntityThresholdWarning, hwEntityThresholdCurrent, hwEntityTrapFaultID
// Description: CPU utilization back to normal level
trapMap["1.3.6.1.4.1.2011.5.25.219.2.14.6"] = [
    name: "hwFwdCPUUtilizationResume",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityThresholdType", "hwEntityThresholdWarning", "hwEntityThresholdCurrent", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityThresholdType": "1.3.6.1.4.1.2011.5.25.219.1.5.1.1", "hwEntityThresholdWarning": "1.3.6.1.4.1.2011.5.25.219.1.5.1.5", "hwEntityThresholdCurrent": "1.3.6.1.4.1.2011.5.25.219.1.5.1.3", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwMemUtilizationRising (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.15.1
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityThresholdType, hwEntityThresholdWarning, hwEntityThresholdCurrent, hwEntityTrapFaultID
// Description: Memory utilization overrun.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.15.1"] = [
    name: "hwMemUtilizationRising",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityThresholdType", "hwEntityThresholdWarning", "hwEntityThresholdCurrent", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityThresholdType": "1.3.6.1.4.1.2011.5.25.219.1.5.1.1", "hwEntityThresholdWarning": "1.3.6.1.4.1.2011.5.25.219.1.5.1.5", "hwEntityThresholdCurrent": "1.3.6.1.4.1.2011.5.25.219.1.5.1.3", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwMemUtilizationResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.15.2
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityThresholdType, hwEntityThresholdWarning, hwEntityThresholdCurrent, hwEntityTrapFaultID
// Description: Memory utilization back to normal level
trapMap["1.3.6.1.4.1.2011.5.25.219.2.15.2"] = [
    name: "hwMemUtilizationResume",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityThresholdType", "hwEntityThresholdWarning", "hwEntityThresholdCurrent", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityThresholdType": "1.3.6.1.4.1.2011.5.25.219.1.5.1.1", "hwEntityThresholdWarning": "1.3.6.1.4.1.2011.5.25.219.1.5.1.5", "hwEntityThresholdCurrent": "1.3.6.1.4.1.2011.5.25.219.1.5.1.3", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwCapMemUtilizationRising (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.15.3
// Fields: hwCapMemThresholdCurrent, hwCapMemThresholdValue, hwCapMemType
// Description: The average value of Cap Memory Utilization exceeds specifications.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.15.3"] = [
    name: "hwCapMemUtilizationRising",
    fields: ["hwCapMemThresholdCurrent", "hwCapMemThresholdValue", "hwCapMemType"],
    fieldOids: ["hwCapMemThresholdCurrent": "1.3.6.1.4.1.2011.5.25.219.1.53", "hwCapMemThresholdValue": "1.3.6.1.4.1.2011.5.25.219.1.52", "hwCapMemType": "1.3.6.1.4.1.2011.5.25.219.1.51"]
]

// --- hwCapMemUtilizationResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.15.4
// Fields: hwCapMemThresholdCurrent, hwCapMemThresholdValue, hwCapMemType
// Description: The average value of Cap Memory utilization back to normal level.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.15.4"] = [
    name: "hwCapMemUtilizationResume",
    fields: ["hwCapMemThresholdCurrent", "hwCapMemThresholdValue", "hwCapMemType"],
    fieldOids: ["hwCapMemThresholdCurrent": "1.3.6.1.4.1.2011.5.25.219.1.53", "hwCapMemThresholdValue": "1.3.6.1.4.1.2011.5.25.219.1.52", "hwCapMemType": "1.3.6.1.4.1.2011.5.25.219.1.51"]
]

// --- hwStorageDevRemove (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.16.1
// Fields: entPhysicalName, hwStorageDevName, hwEntityTrapFaultID
// Description: Memory utilization overrun.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.16.1"] = [
    name: "hwStorageDevRemove",
    fields: ["entPhysicalName", "hwStorageDevName", "hwEntityTrapFaultID"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwStorageDevName": "1.3.6.1.4.1.2011.5.25.219.1.10", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwStorageDevInsert (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.16.2
// Fields: entPhysicalName, hwStorageDevName, hwEntityTrapFaultID
// Description: Memory utilization back to normal level
trapMap["1.3.6.1.4.1.2011.5.25.219.2.16.2"] = [
    name: "hwStorageDevInsert",
    fields: ["entPhysicalName", "hwStorageDevName", "hwEntityTrapFaultID"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwStorageDevName": "1.3.6.1.4.1.2011.5.25.219.1.10", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwPppLoopbackDetect (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.17.1
// Fields: hwBaseTrapSeverity, hwBaseTrapProbableCause, hwBaseTrapEventType, ifIndex, ifName
// Description: The interface Loopback is detected.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.17.1"] = [
    name: "hwPppLoopbackDetect",
    fields: ["hwBaseTrapSeverity", "hwBaseTrapProbableCause", "hwBaseTrapEventType", "ifIndex", "ifName"],
    fieldOids: ["hwBaseTrapSeverity": "1.3.6.1.4.1.2011.5.25.129.1.1", "hwBaseTrapProbableCause": "1.3.6.1.4.1.2011.5.25.129.1.2", "hwBaseTrapEventType": "1.3.6.1.4.1.2011.5.25.129.1.3", "ifIndex": "1.3.6.1.2.1.2.2.1.1", "ifName": "1.3.6.1.2.1.31.1.1.1.1"]
]

// --- hwPppLoopbackDetResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.17.2
// Fields: hwBaseTrapSeverity, hwBaseTrapProbableCause, hwBaseTrapEventType, ifIndex, ifName
// Description: The interface is recovered from Loopback.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.17.2"] = [
    name: "hwPppLoopbackDetResume",
    fields: ["hwBaseTrapSeverity", "hwBaseTrapProbableCause", "hwBaseTrapEventType", "ifIndex", "ifName"],
    fieldOids: ["hwBaseTrapSeverity": "1.3.6.1.4.1.2011.5.25.129.1.1", "hwBaseTrapProbableCause": "1.3.6.1.4.1.2011.5.25.129.1.2", "hwBaseTrapEventType": "1.3.6.1.4.1.2011.5.25.129.1.3", "ifIndex": "1.3.6.1.2.1.2.2.1.1", "ifName": "1.3.6.1.2.1.31.1.1.1.1"]
]

// --- hwFileError (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.18.1
// Fields: entPhysicalName, hwStorageDevName, hwEntityTrapFaultID
// Description: Memory utilization overrun.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.18.1"] = [
    name: "hwFileError",
    fields: ["entPhysicalName", "hwStorageDevName", "hwEntityTrapFaultID"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwStorageDevName": "1.3.6.1.4.1.2011.5.25.219.1.10", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwFileErrorResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.18.2
// Fields: entPhysicalName, hwStorageDevName, hwEntityTrapFaultID
// Description: Memory utilization back to normal level
trapMap["1.3.6.1.4.1.2011.5.25.219.2.18.2"] = [
    name: "hwFileErrorResume",
    fields: ["entPhysicalName", "hwStorageDevName", "hwEntityTrapFaultID"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwStorageDevName": "1.3.6.1.4.1.2011.5.25.219.1.10", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwUSBInsert (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.19.1
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapEntType, hwEntityTrapFaultID
// Description: The USB device has been inserted.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.19.1"] = [
    name: "hwUSBInsert",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapEntType", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapEntType": "1.3.6.1.4.1.2011.5.25.219.1.2", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwUSBRemove (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.19.2
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapEntType, hwEntityTrapFaultID
// Description: The USB device has been removed.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.19.2"] = [
    name: "hwUSBRemove",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapEntType", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapEntType": "1.3.6.1.4.1.2011.5.25.219.1.2", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwUSBUnidentified (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.19.3
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapEntType, hwEntityTrapFaultID
// Description: The USB device is unidentified.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.19.3"] = [
    name: "hwUSBUnidentified",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapEntType", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapEntType": "1.3.6.1.4.1.2011.5.25.219.1.2", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwUSBUnidentifiedResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.19.4
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapEntType, hwEntityTrapFaultID
// Description: The USB device resume from unidentified situation.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.19.4"] = [
    name: "hwUSBUnidentifiedResume",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapEntType", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapEntType": "1.3.6.1.4.1.2011.5.25.219.1.2", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwUsbStatusChg (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.19.5
// Fields: hwUsbOperType
// Description: The USB device status has been changed.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.19.5"] = [
    name: "hwUsbStatusChg",
    fields: ["hwUsbOperType"],
    fieldOids: ["hwUsbOperType": "1.3.6.1.4.1.2011.5.25.219.1.14"]
]

// --- hwPmuRemove (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.20.1
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID
// Description: This object indicates that a PMU board on the X16A cannot be detected.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.20.1"] = [
    name: "hwPmuRemove",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwPmuInsert (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.20.2
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID
// Description: This object indicates that a PMU is inserted into the X16A.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.20.2"] = [
    name: "hwPmuInsert",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwPmuFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.20.3
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID, hwEntityTrapReasonDescr
// Description: This object indicates that a PMU on the X16A encounters a partial failure.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.20.3"] = [
    name: "hwPmuFail",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID", "hwEntityTrapReasonDescr"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3", "hwEntityTrapReasonDescr": "1.3.6.1.4.1.2011.5.25.219.1.13"]
]

// --- hwPmuFailResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.20.4
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID
// Description: This object indicates that a PMU on the X16A recovers from a partial failure.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.20.4"] = [
    name: "hwPmuFailResume",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwPmuInvalid (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.20.5
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID
// Description: This object indicates that a PMU on the X16A encounters an overall failure.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.20.5"] = [
    name: "hwPmuInvalid",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwPmuInvalidResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.20.6
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID
// Description: This object indicates that a PMU on the X16A recovers from an overall failure.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.20.6"] = [
    name: "hwPmuInvalidResume",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwRATEOFTRAFFICRising (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.21.1
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID
// Description: Rate of traffic overrun.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.21.1"] = [
    name: "hwRATEOFTRAFFICRising",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwRATEOFTRAFFICResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.21.2
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID
// Description: Rate of traffic back to normal level.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.21.2"] = [
    name: "hwRATEOFTRAFFICResume",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwBatteryFull (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.22.1
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapEntType
// Description: battery percent is full .
trapMap["1.3.6.1.4.1.2011.5.25.219.2.22.1"] = [
    name: "hwBatteryFull",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapEntType"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapEntType": "1.3.6.1.4.1.2011.5.25.219.1.2"]
]

// --- hwUpsFaultTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.22.2
// Fields: hwEntityTrapReasonDescr
// Description: The UPS battery is faulty.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.22.2"] = [
    name: "hwUpsFaultTrap",
    fields: ["hwEntityTrapReasonDescr"],
    fieldOids: ["hwEntityTrapReasonDescr": "1.3.6.1.4.1.2011.5.25.219.1.13"]
]

// --- hwUpsFaultResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.22.3
// Description: The UPS battery fault is rectified.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.22.3"] = [
    name: "hwUpsFaultResume",
    fields: [],
    fieldOids: []
]

// --- hwUpsPowerLow (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.22.4
// Fields: hwEntityTrapReasonDescr
// Description: Available power of the UPS battery is low.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.22.4"] = [
    name: "hwUpsPowerLow",
    fields: ["hwEntityTrapReasonDescr"],
    fieldOids: ["hwEntityTrapReasonDescr": "1.3.6.1.4.1.2011.5.25.219.1.13"]
]

// --- hwUpsPowerFull (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.22.5
// Description: Available power of the UPS battery is restored to the normal range.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.22.5"] = [
    name: "hwUpsPowerFull",
    fields: [],
    fieldOids: []
]

// --- hwPowerCubeAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.22.6
// Fields: hwEntityPhysicalIndex, hwEntityTrapFaultID, entPhysicalName
// Description: Indicates that power cube Alarm.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.22.6"] = [
    name: "hwPowerCubeAlarm",
    fields: ["hwEntityPhysicalIndex", "hwEntityTrapFaultID", "entPhysicalName"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwPowerCubeAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.22.7
// Fields: hwEntityPhysicalIndex, hwEntityTrapFaultID, entPhysicalName
// Description: Indicates that power cube Alarm Resume.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.22.7"] = [
    name: "hwPowerCubeAlarmResume",
    fields: ["hwEntityPhysicalIndex", "hwEntityTrapFaultID", "entPhysicalName"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwRpsPowerRemove (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.22.8
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID
// Description: This object indicates that the RPS power supply has been removed.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.22.8"] = [
    name: "hwRpsPowerRemove",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwRpsPowerInsert (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.22.9
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID
// Description: This object indicates that an RPS power supply has been connected to the device.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.22.9"] = [
    name: "hwRpsPowerInsert",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwRpsPowerOn (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.22.10
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID
// Description: This object indicates that the RPS power supply starts to provide power.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.22.10"] = [
    name: "hwRpsPowerOn",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwRpsPowerOff (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.22.11
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID
// Description: This object indicates that the RPS power supply stops providing power.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.22.11"] = [
    name: "hwRpsPowerOff",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwRpsFanInvalid (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.22.12
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID
// Description: This object indicates that fans of the RPS power supply have failed.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.22.12"] = [
    name: "hwRpsFanInvalid",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwRpsFanInvalidResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.22.13
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID
// Description: This object indicates that fans of the RPS power supply have recovered.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.22.13"] = [
    name: "hwRpsFanInvalidResume",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwRpsTempInvalid (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.22.14
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID
// Description: This object indicates that temperature of the RPS power supply is out of the normal range.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.22.14"] = [
    name: "hwRpsTempInvalid",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwRpsTempInvalidResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.22.15
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID
// Description: This object indicates that temperature of the RPS power supply has restored to the normal range.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.22.15"] = [
    name: "hwRpsTempInvalidResume",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwBatteryGroupFault (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.22.16
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID, hwEntityTrapReasonDescr
// Description: This object indicates that a battery group failed.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.22.16"] = [
    name: "hwBatteryGroupFault",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID", "hwEntityTrapReasonDescr"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3", "hwEntityTrapReasonDescr": "1.3.6.1.4.1.2011.5.25.219.1.13"]
]

// --- hwBatteryGroupFaultResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.22.17
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID, hwEntityTrapReasonDescr
// Description: This object indicates that a battery group recovered.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.22.17"] = [
    name: "hwBatteryGroupFaultResume",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID", "hwEntityTrapReasonDescr"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3", "hwEntityTrapReasonDescr": "1.3.6.1.4.1.2011.5.25.219.1.13"]
]

// --- hwBatteryFault (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.22.18
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID, hwEntityTrapReasonDescr
// Description: This object indicates that a battery failed.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.22.18"] = [
    name: "hwBatteryFault",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID", "hwEntityTrapReasonDescr"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3", "hwEntityTrapReasonDescr": "1.3.6.1.4.1.2011.5.25.219.1.13"]
]

// --- hwBatteryFaultResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.22.19
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID, hwEntityTrapReasonDescr
// Description: This object indicates that a battery recovered.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.22.19"] = [
    name: "hwBatteryFaultResume",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID", "hwEntityTrapReasonDescr"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3", "hwEntityTrapReasonDescr": "1.3.6.1.4.1.2011.5.25.219.1.13"]
]

// --- hwBatteryMinorFault (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.22.20
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID, hwEntityTrapReasonDescr
// Description: This object indicates a minor alarm of a battery fault.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.22.20"] = [
    name: "hwBatteryMinorFault",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID", "hwEntityTrapReasonDescr"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3", "hwEntityTrapReasonDescr": "1.3.6.1.4.1.2011.5.25.219.1.13"]
]

// --- hwBatteryMinorFaultResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.22.21
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID, hwEntityTrapReasonDescr
// Description: This object indicates that a minor alarm of a battery fault is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.22.21"] = [
    name: "hwBatteryMinorFaultResume",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID", "hwEntityTrapReasonDescr"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3", "hwEntityTrapReasonDescr": "1.3.6.1.4.1.2011.5.25.219.1.13"]
]

// --- hwThreadFaultIsolate (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.23.1
// Fields: entPhysicalName, entPhysicalName, hwEntityPhysicalIndex, hwEntityTrapFaultID
// Description: The faulty thread has been isolated.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.23.1"] = [
    name: "hwThreadFaultIsolate",
    fields: ["entPhysicalName", "entPhysicalName", "hwEntityPhysicalIndex", "hwEntityTrapFaultID"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwDiskUtilizationRising (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.24.1
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityThresholdType, hwEntityThresholdWarning, hwEntityThresholdCurrent, hwEntityTrapFaultID
// Description: Disk utilization overrun.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.24.1"] = [
    name: "hwDiskUtilizationRising",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityThresholdType", "hwEntityThresholdWarning", "hwEntityThresholdCurrent", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityThresholdType": "1.3.6.1.4.1.2011.5.25.219.1.5.1.1", "hwEntityThresholdWarning": "1.3.6.1.4.1.2011.5.25.219.1.5.1.5", "hwEntityThresholdCurrent": "1.3.6.1.4.1.2011.5.25.219.1.5.1.3", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwDiskUtilizationResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.24.2
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityThresholdType, hwEntityThresholdWarning, hwEntityThresholdCurrent, hwEntityTrapFaultID
// Description: Disk utilization back to normal level
trapMap["1.3.6.1.4.1.2011.5.25.219.2.24.2"] = [
    name: "hwDiskUtilizationResume",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityThresholdType", "hwEntityThresholdWarning", "hwEntityThresholdCurrent", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityThresholdType": "1.3.6.1.4.1.2011.5.25.219.1.5.1.1", "hwEntityThresholdWarning": "1.3.6.1.4.1.2011.5.25.219.1.5.1.5", "hwEntityThresholdCurrent": "1.3.6.1.4.1.2011.5.25.219.1.5.1.3", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwDiskPartitionInValid (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.24.3
// Fields: hwPartitionEntPhysicalName, hwPartitionName
// Description: An alarm was generated when a disk partition was unavailable.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.24.3"] = [
    name: "hwDiskPartitionInValid",
    fields: ["hwPartitionEntPhysicalName", "hwPartitionName"],
    fieldOids: ["hwPartitionEntPhysicalName": "1.3.6.1.4.1.2011.5.25.219.1.25.1.1", "hwPartitionName": "1.3.6.1.4.1.2011.5.25.219.1.25.1.2"]
]

// --- hwDiskPartitionInValidResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.24.4
// Fields: hwPartitionEntPhysicalName, hwPartitionName
// Description: The alarm was cleared when the disk partition became available.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.24.4"] = [
    name: "hwDiskPartitionInValidResume",
    fields: ["hwPartitionEntPhysicalName", "hwPartitionName"],
    fieldOids: ["hwPartitionEntPhysicalName": "1.3.6.1.4.1.2011.5.25.219.1.25.1.1", "hwPartitionName": "1.3.6.1.4.1.2011.5.25.219.1.25.1.2"]
]

// --- hwDiskPartitionSpacinsufficient (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.24.5
// Fields: hwPartitionEntPhysicalName, hwPartitionName, hwPartitionSpaceFree, hwPartitionSpaceFreeThreshold
// Description: An alarm was generated when the disk partition's(except the log partition) available space was below the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.24.5"] = [
    name: "hwDiskPartitionSpacinsufficient",
    fields: ["hwPartitionEntPhysicalName", "hwPartitionName", "hwPartitionSpaceFree", "hwPartitionSpaceFreeThreshold"],
    fieldOids: ["hwPartitionEntPhysicalName": "1.3.6.1.4.1.2011.5.25.219.1.25.1.1", "hwPartitionName": "1.3.6.1.4.1.2011.5.25.219.1.25.1.2", "hwPartitionSpaceFree": "1.3.6.1.4.1.2011.5.25.219.1.25.1.3", "hwPartitionSpaceFreeThreshold": "1.3.6.1.4.1.2011.5.25.219.1.25.1.4"]
]

// --- hwDiskPartitionSpacinsufficientResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.24.6
// Fields: hwPartitionEntPhysicalName, hwPartitionName, hwPartitionSpaceFree, hwPartitionSpaceFreeThreshold
// Description: The alarm was cleared when the disk partition's(except the log partition) available space was above the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.24.6"] = [
    name: "hwDiskPartitionSpacinsufficientResume",
    fields: ["hwPartitionEntPhysicalName", "hwPartitionName", "hwPartitionSpaceFree", "hwPartitionSpaceFreeThreshold"],
    fieldOids: ["hwPartitionEntPhysicalName": "1.3.6.1.4.1.2011.5.25.219.1.25.1.1", "hwPartitionName": "1.3.6.1.4.1.2011.5.25.219.1.25.1.2", "hwPartitionSpaceFree": "1.3.6.1.4.1.2011.5.25.219.1.25.1.3", "hwPartitionSpaceFreeThreshold": "1.3.6.1.4.1.2011.5.25.219.1.25.1.4"]
]

// --- hwDiskPartitionUseageRising (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.24.7
// Fields: hwPartitionEntPhysicalName, hwPartitionName, hwPartitionUseage, hwPartitionUseageThreshold
// Description: When the disk partition usage(except the log partition) is greater than the specified overload threshold within a statistical period, the alarm is reported.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.24.7"] = [
    name: "hwDiskPartitionUseageRising",
    fields: ["hwPartitionEntPhysicalName", "hwPartitionName", "hwPartitionUseage", "hwPartitionUseageThreshold"],
    fieldOids: ["hwPartitionEntPhysicalName": "1.3.6.1.4.1.2011.5.25.219.1.25.1.1", "hwPartitionName": "1.3.6.1.4.1.2011.5.25.219.1.25.1.2", "hwPartitionUseage": "1.3.6.1.4.1.2011.5.25.219.1.25.1.5", "hwPartitionUseageThreshold": "1.3.6.1.4.1.2011.5.25.219.1.25.1.6"]
]

// --- hwDiskPartitionUseageResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.24.8
// Fields: hwPartitionEntPhysicalName, hwPartitionName, hwPartitionUseage, hwPartitionUseageThreshold
// Description: When the disk partition usage(except the log partition) fell and remained below 10% of the specified overload threshold within a statistical period, the alarm is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.24.8"] = [
    name: "hwDiskPartitionUseageResume",
    fields: ["hwPartitionEntPhysicalName", "hwPartitionName", "hwPartitionUseage", "hwPartitionUseageThreshold"],
    fieldOids: ["hwPartitionEntPhysicalName": "1.3.6.1.4.1.2011.5.25.219.1.25.1.1", "hwPartitionName": "1.3.6.1.4.1.2011.5.25.219.1.25.1.2", "hwPartitionUseage": "1.3.6.1.4.1.2011.5.25.219.1.25.1.5", "hwPartitionUseageThreshold": "1.3.6.1.4.1.2011.5.25.219.1.25.1.6"]
]

// --- hwDiskInvalid (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.24.9
// Fields: hwEntPhysicalName
// Description: An alarm was generated when the disk was Invalid.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.24.9"] = [
    name: "hwDiskInvalid",
    fields: ["hwEntPhysicalName"],
    fieldOids: ["hwEntPhysicalName": "1.3.6.1.4.1.2011.5.25.219.1.26"]
]

// --- hwDiskInvalidResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.24.10
// Fields: hwEntPhysicalName
// Description: The alarm was cleared when the disk became available.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.24.10"] = [
    name: "hwDiskInvalidResume",
    fields: ["hwEntPhysicalName"],
    fieldOids: ["hwEntPhysicalName": "1.3.6.1.4.1.2011.5.25.219.1.26"]
]

// --- hwDiskBadPyhsicalBlocks (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.24.11
// Fields: hwEntPhysicalUbiIndex, hwEntCurrentBadPhysicalBlocks, hwEntBadPhysicalBlocksThreshold
// Description: An alarm was generated when the disk bad phsical blocks over the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.24.11"] = [
    name: "hwDiskBadPyhsicalBlocks",
    fields: ["hwEntPhysicalUbiIndex", "hwEntCurrentBadPhysicalBlocks", "hwEntBadPhysicalBlocksThreshold"],
    fieldOids: ["hwEntPhysicalUbiIndex": "1.3.6.1.4.1.2011.5.25.219.1.25.1.7", "hwEntCurrentBadPhysicalBlocks": "1.3.6.1.4.1.2011.5.25.219.1.25.1.8", "hwEntBadPhysicalBlocksThreshold": "1.3.6.1.4.1.2011.5.25.219.1.25.1.9"]
]

// --- hwDiskErasePyhsicalBlocks (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.24.12
// Fields: hwEntPhysicalUbiIndex, hwEntMaxErasePhysicalBlocks, hwEntErasePhysicalBlocksThreshold
// Description: An alarm was generated when the disk max erase phsical blocks over the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.24.12"] = [
    name: "hwDiskErasePyhsicalBlocks",
    fields: ["hwEntPhysicalUbiIndex", "hwEntMaxErasePhysicalBlocks", "hwEntErasePhysicalBlocksThreshold"],
    fieldOids: ["hwEntPhysicalUbiIndex": "1.3.6.1.4.1.2011.5.25.219.1.25.1.7", "hwEntMaxErasePhysicalBlocks": "1.3.6.1.4.1.2011.5.25.219.1.25.1.10", "hwEntErasePhysicalBlocksThreshold": "1.3.6.1.4.1.2011.5.25.219.1.25.1.11"]
]

// --- hwVMResInconsist (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.25.1
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapEntType, hwEntityTrapFaultID, vmName
// Description: Local VM resources are inconsistent with those on the MANO.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.25.1"] = [
    name: "hwVMResInconsist",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapEntType", "hwEntityTrapFaultID", "vmName"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapEntType": "1.3.6.1.4.1.2011.5.25.219.1.2", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3", "vmName": "1.3.6.1.4.1.2011.5.25.219.1.23"]
]

// --- hwVMResInconsistResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.25.2
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapEntType, hwEntityTrapFaultID, vmName
// Description: Local VM resources are consistent with those on the MANO.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.25.2"] = [
    name: "hwVMResInconsistResume",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapEntType", "hwEntityTrapFaultID", "vmName"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapEntType": "1.3.6.1.4.1.2011.5.25.219.1.2", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3", "vmName": "1.3.6.1.4.1.2011.5.25.219.1.23"]
]

// --- hwDataplaneCpuOverloadAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.29.1
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID
// Description: The dataplane CPU throughput exceeds specifications.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.29.1"] = [
    name: "hwDataplaneCpuOverloadAlarm",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwDataplaneCpuOverloadResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.29.2
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID
// Description: The dataplane CPU throughput exceeds specifications alarm cleared.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.29.2"] = [
    name: "hwDataplaneCpuOverloadResume",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwInsSpaceLackAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.30.1
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID
// Description: The instruction space required for the current configuration exceeds the total instruction space of the forwarding chip.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.30.1"] = [
    name: "hwInsSpaceLackAlarm",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwInsSpaceLackResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.30.2
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID
// Description: The instruction space required for the current configuration exceeds the total instruction space of the forwarding chip alarm cleared.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.30.2"] = [
    name: "hwInsSpaceLackResume",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwVfpSysCheckErr (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.31.1
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID, hwEntityTrapEntType
// Description: A kind of vfp system error occured.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.31.1"] = [
    name: "hwVfpSysCheckErr",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID", "hwEntityTrapEntType"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3", "hwEntityTrapEntType": "1.3.6.1.4.1.2011.5.25.219.1.2"]
]

// --- hwVfpSysCheckErrResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.31.2
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID, hwEntityTrapEntType
// Description: Vfp system error goes away.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.31.2"] = [
    name: "hwVfpSysCheckErrResume",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID", "hwEntityTrapEntType"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3", "hwEntityTrapEntType": "1.3.6.1.4.1.2011.5.25.219.1.2"]
]

// --- hwCapCPUUtilizationRising (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.32.1
// Fields: hwCapCPUThresholdCurrent, hwCapCPUThresholdValue, hwCapCPUThresholdType
// Description: The average value of Cap CPU Utilization exceeds specifications.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.32.1"] = [
    name: "hwCapCPUUtilizationRising",
    fields: ["hwCapCPUThresholdCurrent", "hwCapCPUThresholdValue", "hwCapCPUThresholdType"],
    fieldOids: ["hwCapCPUThresholdCurrent": "1.3.6.1.4.1.2011.5.25.219.1.32", "hwCapCPUThresholdValue": "1.3.6.1.4.1.2011.5.25.219.1.31", "hwCapCPUThresholdType": "1.3.6.1.4.1.2011.5.25.219.1.30"]
]

// --- hwCapCPUUtilizationResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.32.2
// Fields: hwCapCPUThresholdCurrent, hwCapCPUThresholdValue, hwCapCPUThresholdType
// Description: The average value of Cap CPU utilization back to normal level.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.32.2"] = [
    name: "hwCapCPUUtilizationResume",
    fields: ["hwCapCPUThresholdCurrent", "hwCapCPUThresholdValue", "hwCapCPUThresholdType"],
    fieldOids: ["hwCapCPUThresholdCurrent": "1.3.6.1.4.1.2011.5.25.219.1.32", "hwCapCPUThresholdValue": "1.3.6.1.4.1.2011.5.25.219.1.31", "hwCapCPUThresholdType": "1.3.6.1.4.1.2011.5.25.219.1.30"]
]

// --- hwCapSingleCoreCPUUtilizationRising (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.32.3
// Fields: hwCapSingleCoreThresholdCurrent, hwCapSingleCoreIndex, hwCapSingleCoreThresholdValue
// Description: The value of Cap single core CPU Utilization exceeds specifications.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.32.3"] = [
    name: "hwCapSingleCoreCPUUtilizationRising",
    fields: ["hwCapSingleCoreThresholdCurrent", "hwCapSingleCoreIndex", "hwCapSingleCoreThresholdValue"],
    fieldOids: ["hwCapSingleCoreThresholdCurrent": "1.3.6.1.4.1.2011.5.25.219.1.54", "hwCapSingleCoreIndex": "1.3.6.1.4.1.2011.5.25.219.1.55", "hwCapSingleCoreThresholdValue": "1.3.6.1.4.1.2011.5.25.219.1.56"]
]

// --- hwCapSingleCoreCPUUtilizationResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.32.4
// Fields: hwCapSingleCoreThresholdCurrent, hwCapSingleCoreIndex, hwCapSingleCoreThresholdValue
// Description: The value of Cap single core CPU utilization back to normal level.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.32.4"] = [
    name: "hwCapSingleCoreCPUUtilizationResume",
    fields: ["hwCapSingleCoreThresholdCurrent", "hwCapSingleCoreIndex", "hwCapSingleCoreThresholdValue"],
    fieldOids: ["hwCapSingleCoreThresholdCurrent": "1.3.6.1.4.1.2011.5.25.219.1.54", "hwCapSingleCoreIndex": "1.3.6.1.4.1.2011.5.25.219.1.55", "hwCapSingleCoreThresholdValue": "1.3.6.1.4.1.2011.5.25.219.1.56"]
]

// --- hwPduNotPresent (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.33.1
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID
// Description: The PDU is not present.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.33.1"] = [
    name: "hwPduNotPresent",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwPduPresent (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.33.2
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID
// Description: The PDU is present.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.33.2"] = [
    name: "hwPduPresent",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwPduCommLost (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.33.3
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID
// Description: Communication with the PDU was lost.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.33.3"] = [
    name: "hwPduCommLost",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwPduCommLostResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.33.4
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID
// Description: Communication with the PDU was restored.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.33.4"] = [
    name: "hwPduCommLostResume",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwPduDmuHardwareFault (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.33.5
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID
// Description: A hardware fault occurred on the DMU.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.33.5"] = [
    name: "hwPduDmuHardwareFault",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwPduDmuHardwareFaultResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.33.6
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID
// Description: The DMU recovered from a hardware fault.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.33.6"] = [
    name: "hwPduDmuHardwareFaultResume",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwPduDMUAutoUpgradeFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.33.7
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID
// Description: The automatic upgrade of DMU was failed.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.33.7"] = [
    name: "hwPduDMUAutoUpgradeFail",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwPduDMUAutoUpgradeFailResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.33.8
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID
// Description: Automatic upgrade of the DMU was successful.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.33.8"] = [
    name: "hwPduDMUAutoUpgradeFailResume",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwPduDacsHardwareFault (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.33.9
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID
// Description: A hardware fault occurred on the DACS.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.33.9"] = [
    name: "hwPduDacsHardwareFault",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwPduDacsHardwareFaultResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.33.10
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID
// Description: The DACS recovered from a hardware fault.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.33.10"] = [
    name: "hwPduDacsHardwareFaultResume",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwPduDacsTempAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.33.11
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID
// Description: The temperature of the temperature sensor on the DACS is too high.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.33.11"] = [
    name: "hwPduDacsTempAlarm",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwPduDacsTempAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.33.12
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID
// Description: The temperature of the temperature sensor on the DACS is normal.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.33.12"] = [
    name: "hwPduDacsTempAlarmResume",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwPduDacsI2CChannelFault (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.33.13
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID
// Description: The IIC channel of the DACS failed.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.33.13"] = [
    name: "hwPduDacsI2CChannelFault",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwPduDacsI2CChannelFaultResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.33.14
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID
// Description: The IIC channel of the DACS recovered.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.33.14"] = [
    name: "hwPduDacsI2CChannelFaultResume",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwReportSyslogInfo (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.34.1
// Fields: hwSyslogModuleName, hwSyslogTimeStamp, hwSyslogDescription, hwSyslogBrief, hwSyslogSeverityLevel
// Description: The information of syslog trap .
trapMap["1.3.6.1.4.1.2011.5.25.219.2.34.1"] = [
    name: "hwReportSyslogInfo",
    fields: ["hwSyslogModuleName", "hwSyslogTimeStamp", "hwSyslogDescription", "hwSyslogBrief", "hwSyslogSeverityLevel"],
    fieldOids: ["hwSyslogModuleName": "1.3.6.1.4.1.2011.5.25.219.1.33", "hwSyslogTimeStamp": "1.3.6.1.4.1.2011.5.25.219.1.37", "hwSyslogDescription": "1.3.6.1.4.1.2011.5.25.219.1.36", "hwSyslogBrief": "1.3.6.1.4.1.2011.5.25.219.1.35", "hwSyslogSeverityLevel": "1.3.6.1.4.1.2011.5.25.219.1.34"]
]

// --- hwEntityNpsPatchInstallFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.35.1
// Fields: hwEntityNpsPatchName, hwEntityNpsPatchVersion, hwEntityNpsErrorDescr
// Description: Patch package installation failed.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.35.1"] = [
    name: "hwEntityNpsPatchInstallFail",
    fields: ["hwEntityNpsPatchName", "hwEntityNpsPatchVersion", "hwEntityNpsErrorDescr"],
    fieldOids: ["hwEntityNpsPatchName": "1.3.6.1.4.1.2011.5.25.219.1.38.9", "hwEntityNpsPatchVersion": "1.3.6.1.4.1.2011.5.25.219.1.38.10", "hwEntityNpsErrorDescr": "1.3.6.1.4.1.2011.5.25.219.1.38.5"]
]

// --- hwEntityNpsPatchInstallFailResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.35.2
// Fields: hwEntityNpsPatchName, hwEntityNpsPatchVersion, hwEntityNpsErrorDescr
// Description: The patch-installation failure alarm is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.35.2"] = [
    name: "hwEntityNpsPatchInstallFailResume",
    fields: ["hwEntityNpsPatchName", "hwEntityNpsPatchVersion", "hwEntityNpsErrorDescr"],
    fieldOids: ["hwEntityNpsPatchName": "1.3.6.1.4.1.2011.5.25.219.1.38.9", "hwEntityNpsPatchVersion": "1.3.6.1.4.1.2011.5.25.219.1.38.10", "hwEntityNpsErrorDescr": "1.3.6.1.4.1.2011.5.25.219.1.38.5"]
]

// --- hwEntityNpsPatchPacketError (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.35.3
// Fields: hwEntityNpsPatchName
// Description: Patch package file error.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.35.3"] = [
    name: "hwEntityNpsPatchPacketError",
    fields: ["hwEntityNpsPatchName"],
    fieldOids: ["hwEntityNpsPatchName": "1.3.6.1.4.1.2011.5.25.219.1.38.9"]
]

// --- hwEntityNpsPatchPacketErrorResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.35.4
// Fields: hwEntityNpsPatchName
// Description: Patch package file error restored.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.35.4"] = [
    name: "hwEntityNpsPatchPacketErrorResume",
    fields: ["hwEntityNpsPatchName"],
    fieldOids: ["hwEntityNpsPatchName": "1.3.6.1.4.1.2011.5.25.219.1.38.9"]
]

// --- hwEntityNpsSysConfigError (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.35.5
// Fields: hwEntityNpsErrorCode
// Description: A system configuration error occurs.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.35.5"] = [
    name: "hwEntityNpsSysConfigError",
    fields: ["hwEntityNpsErrorCode"],
    fieldOids: ["hwEntityNpsErrorCode": "1.3.6.1.4.1.2011.5.25.219.1.38.4"]
]

// --- hwEntityNpsSysConfigErrorResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.35.6
// Fields: hwEntityNpsErrorCode
// Description: The system configuration error has been rectified.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.35.6"] = [
    name: "hwEntityNpsSysConfigErrorResume",
    fields: ["hwEntityNpsErrorCode"],
    fieldOids: ["hwEntityNpsErrorCode": "1.3.6.1.4.1.2011.5.25.219.1.38.4"]
]

// --- hwEntityNpsSslCertInvalidEarlyWarning (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.35.7
// Fields: hwEntityNpsCertType, hwEntityNpsCertRemainDays
// Description: The inner SSL certificate will expire.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.35.7"] = [
    name: "hwEntityNpsSslCertInvalidEarlyWarning",
    fields: ["hwEntityNpsCertType", "hwEntityNpsCertRemainDays"],
    fieldOids: ["hwEntityNpsCertType": "1.3.6.1.4.1.2011.5.25.219.1.38.12", "hwEntityNpsCertRemainDays": "1.3.6.1.4.1.2011.5.25.219.1.38.13"]
]

// --- hwEntityNpsSslCertInvalidEarlyResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.35.8
// Fields: hwEntityNpsCertType
// Description: The inner SSL certificate was upgraded.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.35.8"] = [
    name: "hwEntityNpsSslCertInvalidEarlyResume",
    fields: ["hwEntityNpsCertType"],
    fieldOids: ["hwEntityNpsCertType": "1.3.6.1.4.1.2011.5.25.219.1.38.12"]
]

// --- hwEntityNpsSslCertInvalid (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.35.9
// Fields: hwEntityNpsCertType, hwEntityNpsErrorDescr
// Description: The inner SSL certificate was invalid.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.35.9"] = [
    name: "hwEntityNpsSslCertInvalid",
    fields: ["hwEntityNpsCertType", "hwEntityNpsErrorDescr"],
    fieldOids: ["hwEntityNpsCertType": "1.3.6.1.4.1.2011.5.25.219.1.38.12", "hwEntityNpsErrorDescr": "1.3.6.1.4.1.2011.5.25.219.1.38.5"]
]

// --- hwEntityNpsSslCertInvalidResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.35.10
// Fields: hwEntityNpsCertType
// Description: The inner SSL certificate was repaired.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.35.10"] = [
    name: "hwEntityNpsSslCertInvalidResume",
    fields: ["hwEntityNpsCertType"],
    fieldOids: ["hwEntityNpsCertType": "1.3.6.1.4.1.2011.5.25.219.1.38.12"]
]

// --- hwEntityNpsDiskPartitionUsageExceedingThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.35.11
// Fields: hwEntityNpsVMName, hwEntityNpsPartitionName, hwEntityNpsPartitionUsage, hwEntityNpsPartitionUsageThreshold
// Description: The disk usage exceeded the pre-set overload threshold.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.35.11"] = [
    name: "hwEntityNpsDiskPartitionUsageExceedingThreshold",
    fields: ["hwEntityNpsVMName", "hwEntityNpsPartitionName", "hwEntityNpsPartitionUsage", "hwEntityNpsPartitionUsageThreshold"],
    fieldOids: ["hwEntityNpsVMName": "1.3.6.1.4.1.2011.5.25.219.1.38.1", "hwEntityNpsPartitionName": "1.3.6.1.4.1.2011.5.25.219.1.38.16", "hwEntityNpsPartitionUsage": "1.3.6.1.4.1.2011.5.25.219.1.38.17", "hwEntityNpsPartitionUsageThreshold": "1.3.6.1.4.1.2011.5.25.219.1.38.18"]
]

// --- hwEntityNpsDiskPartitionUsageExceedingThresholdResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.35.12
// Fields: hwEntityNpsVMName, hwEntityNpsPartitionName, hwEntityNpsPartitionUsage, hwEntityNpsPartitionUsageThreshold
// Description: The disk partition usage of the VM was 10% lower than the preset threshold.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.35.12"] = [
    name: "hwEntityNpsDiskPartitionUsageExceedingThresholdResume",
    fields: ["hwEntityNpsVMName", "hwEntityNpsPartitionName", "hwEntityNpsPartitionUsage", "hwEntityNpsPartitionUsageThreshold"],
    fieldOids: ["hwEntityNpsVMName": "1.3.6.1.4.1.2011.5.25.219.1.38.1", "hwEntityNpsPartitionName": "1.3.6.1.4.1.2011.5.25.219.1.38.16", "hwEntityNpsPartitionUsage": "1.3.6.1.4.1.2011.5.25.219.1.38.17", "hwEntityNpsPartitionUsageThreshold": "1.3.6.1.4.1.2011.5.25.219.1.38.18"]
]

// --- hwEntityNpsDiskPartitionUnavailable (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.35.13
// Fields: hwEntityNpsVMName, hwEntityNpsPartitionName
// Description: The VM's disk partition was unavailable.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.35.13"] = [
    name: "hwEntityNpsDiskPartitionUnavailable",
    fields: ["hwEntityNpsVMName", "hwEntityNpsPartitionName"],
    fieldOids: ["hwEntityNpsVMName": "1.3.6.1.4.1.2011.5.25.219.1.38.1", "hwEntityNpsPartitionName": "1.3.6.1.4.1.2011.5.25.219.1.38.16"]
]

// --- hwEntityNpsDiskPartitionUnavailableResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.35.14
// Fields: hwEntityNpsVMName, hwEntityNpsPartitionName
// Description: The fault where the VM's disk partition was unavailable was rectified.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.35.14"] = [
    name: "hwEntityNpsDiskPartitionUnavailableResume",
    fields: ["hwEntityNpsVMName", "hwEntityNpsPartitionName"],
    fieldOids: ["hwEntityNpsVMName": "1.3.6.1.4.1.2011.5.25.219.1.38.1", "hwEntityNpsPartitionName": "1.3.6.1.4.1.2011.5.25.219.1.38.16"]
]

// --- hwEntityNpsDiskPartitionSpaceInsufficient (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.35.15
// Fields: hwEntityNpsVMName, hwEntityNpsPartitionName, hwEntityNpsPartitionAvailableSpace, hwEntityNpsPartitionCapacityThreshold
// Description: The disk partition's available space was less than the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.35.15"] = [
    name: "hwEntityNpsDiskPartitionSpaceInsufficient",
    fields: ["hwEntityNpsVMName", "hwEntityNpsPartitionName", "hwEntityNpsPartitionAvailableSpace", "hwEntityNpsPartitionCapacityThreshold"],
    fieldOids: ["hwEntityNpsVMName": "1.3.6.1.4.1.2011.5.25.219.1.38.1", "hwEntityNpsPartitionName": "1.3.6.1.4.1.2011.5.25.219.1.38.16", "hwEntityNpsPartitionAvailableSpace": "1.3.6.1.4.1.2011.5.25.219.1.38.19", "hwEntityNpsPartitionCapacityThreshold": "1.3.6.1.4.1.2011.5.25.219.1.38.20"]
]

// --- hwEntityNpsDiskPartitionSpaceInsufficientResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.35.16
// Fields: hwEntityNpsVMName, hwEntityNpsPartitionName, hwEntityNpsPartitionAvailableSpace, hwEntityNpsPartitionCapacityThreshold
// Description: The disk partition's available space was more than the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.35.16"] = [
    name: "hwEntityNpsDiskPartitionSpaceInsufficientResume",
    fields: ["hwEntityNpsVMName", "hwEntityNpsPartitionName", "hwEntityNpsPartitionAvailableSpace", "hwEntityNpsPartitionCapacityThreshold"],
    fieldOids: ["hwEntityNpsVMName": "1.3.6.1.4.1.2011.5.25.219.1.38.1", "hwEntityNpsPartitionName": "1.3.6.1.4.1.2011.5.25.219.1.38.16", "hwEntityNpsPartitionAvailableSpace": "1.3.6.1.4.1.2011.5.25.219.1.38.19", "hwEntityNpsPartitionCapacityThreshold": "1.3.6.1.4.1.2011.5.25.219.1.38.20"]
]

// --- hwEntityNpsExecutableFilesIncomplete (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.35.17
// Fields: hwEntityNpsVMName
// Description: The file check failed.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.35.17"] = [
    name: "hwEntityNpsExecutableFilesIncomplete",
    fields: ["hwEntityNpsVMName"],
    fieldOids: ["hwEntityNpsVMName": "1.3.6.1.4.1.2011.5.25.219.1.38.1"]
]

// --- hwEntityNpsExecutableFilesIncompleteResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.35.18
// Fields: hwEntityNpsVMName
// Description: The file check success.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.35.18"] = [
    name: "hwEntityNpsExecutableFilesIncompleteResume",
    fields: ["hwEntityNpsVMName"],
    fieldOids: ["hwEntityNpsVMName": "1.3.6.1.4.1.2011.5.25.219.1.38.1"]
]

// --- hwEntityNpsSoftwareIntegrityError (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.35.19
// Fields: hwEntityNpsVNFCType, hwEntityNpsAPPType, hwEntityNpsSoftwareVersionType, hwEntityNpsSoftwareVersionID
// Description: The software check failed.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.35.19"] = [
    name: "hwEntityNpsSoftwareIntegrityError",
    fields: ["hwEntityNpsVNFCType", "hwEntityNpsAPPType", "hwEntityNpsSoftwareVersionType", "hwEntityNpsSoftwareVersionID"],
    fieldOids: ["hwEntityNpsVNFCType": "1.3.6.1.4.1.2011.5.25.219.1.38.23", "hwEntityNpsAPPType": "1.3.6.1.4.1.2011.5.25.219.1.38.24", "hwEntityNpsSoftwareVersionType": "1.3.6.1.4.1.2011.5.25.219.1.38.25", "hwEntityNpsSoftwareVersionID": "1.3.6.1.4.1.2011.5.25.219.1.38.26"]
]

// --- hwEntityNpsSoftwareIntegrityErrorResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.35.20
// Fields: hwEntityNpsVNFCType, hwEntityNpsAPPType, hwEntityNpsSoftwareVersionType, hwEntityNpsSoftwareVersionID
// Description: The software check success.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.35.20"] = [
    name: "hwEntityNpsSoftwareIntegrityErrorResume",
    fields: ["hwEntityNpsVNFCType", "hwEntityNpsAPPType", "hwEntityNpsSoftwareVersionType", "hwEntityNpsSoftwareVersionID"],
    fieldOids: ["hwEntityNpsVNFCType": "1.3.6.1.4.1.2011.5.25.219.1.38.23", "hwEntityNpsAPPType": "1.3.6.1.4.1.2011.5.25.219.1.38.24", "hwEntityNpsSoftwareVersionType": "1.3.6.1.4.1.2011.5.25.219.1.38.25", "hwEntityNpsSoftwareVersionID": "1.3.6.1.4.1.2011.5.25.219.1.38.26"]
]

// --- hwEntityNpsOMUSyncFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.35.21
// Fields: hwEntityNpsErrorDescr
// Description: Data failed to be synchronized from the master OMU to the slave OMU.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.35.21"] = [
    name: "hwEntityNpsOMUSyncFail",
    fields: ["hwEntityNpsErrorDescr"],
    fieldOids: ["hwEntityNpsErrorDescr": "1.3.6.1.4.1.2011.5.25.219.1.38.5"]
]

// --- hwEntityNpsOMUSyncFailResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.35.22
// Fields: hwEntityNpsErrorDescr
// Description: A master/slave OMU data synchronization failure was removed, or the slave OMU became absent after a master/slave OMU data synchronization failure occurred.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.35.22"] = [
    name: "hwEntityNpsOMUSyncFailResume",
    fields: ["hwEntityNpsErrorDescr"],
    fieldOids: ["hwEntityNpsErrorDescr": "1.3.6.1.4.1.2011.5.25.219.1.38.5"]
]

// --- hwEntityNpsVMDiskUnavailable (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.35.23
// Fields: hwEntityNpsVMName
// Description: A fault occurs on the VM disk.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.35.23"] = [
    name: "hwEntityNpsVMDiskUnavailable",
    fields: ["hwEntityNpsVMName"],
    fieldOids: ["hwEntityNpsVMName": "1.3.6.1.4.1.2011.5.25.219.1.38.1"]
]

// --- hwEntityNpsVMDiskUnavailableResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.35.24
// Fields: hwEntityNpsVMName
// Description: The fault on the VM disk is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.35.24"] = [
    name: "hwEntityNpsVMDiskUnavailableResume",
    fields: ["hwEntityNpsVMName"],
    fieldOids: ["hwEntityNpsVMName": "1.3.6.1.4.1.2011.5.25.219.1.38.1"]
]

// --- hwEntityNpsDatabaseRestoreFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.35.25
// Fields: hwEntityNpsErrorDescr
// Description: Database Restoration Failure.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.35.25"] = [
    name: "hwEntityNpsDatabaseRestoreFail",
    fields: ["hwEntityNpsErrorDescr"],
    fieldOids: ["hwEntityNpsErrorDescr": "1.3.6.1.4.1.2011.5.25.219.1.38.5"]
]

// --- hwEntityNpsSSLCertExpired (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.35.26
// Fields: hwEntityNpsCertName, hwEntityNpsCertType, hwEntityNpsCertValidBeginTime, hwEntityNpsCertValidEndTime
// Description: The certificate already expired.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.35.26"] = [
    name: "hwEntityNpsSSLCertExpired",
    fields: ["hwEntityNpsCertName", "hwEntityNpsCertType", "hwEntityNpsCertValidBeginTime", "hwEntityNpsCertValidEndTime"],
    fieldOids: ["hwEntityNpsCertName": "1.3.6.1.4.1.2011.5.25.219.1.38.11", "hwEntityNpsCertType": "1.3.6.1.4.1.2011.5.25.219.1.38.12", "hwEntityNpsCertValidBeginTime": "1.3.6.1.4.1.2011.5.25.219.1.38.14", "hwEntityNpsCertValidEndTime": "1.3.6.1.4.1.2011.5.25.219.1.38.15"]
]

// --- hwEntityNpsSSLCertExpiredEarlyWarning (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.35.27
// Fields: hwEntityNpsCertName, hwEntityNpsCertType, hwEntityNpsCertValidBeginTime, hwEntityNpsCertValidEndTime
// Description: The SSL certificate will expire.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.35.27"] = [
    name: "hwEntityNpsSSLCertExpiredEarlyWarning",
    fields: ["hwEntityNpsCertName", "hwEntityNpsCertType", "hwEntityNpsCertValidBeginTime", "hwEntityNpsCertValidEndTime"],
    fieldOids: ["hwEntityNpsCertName": "1.3.6.1.4.1.2011.5.25.219.1.38.11", "hwEntityNpsCertType": "1.3.6.1.4.1.2011.5.25.219.1.38.12", "hwEntityNpsCertValidBeginTime": "1.3.6.1.4.1.2011.5.25.219.1.38.14", "hwEntityNpsCertValidEndTime": "1.3.6.1.4.1.2011.5.25.219.1.38.15"]
]

// --- hwEntityNpsVMResInconsist (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.35.28
// Fields: hwEntityNpsVMName, hwEntityNpsVMID, hwEntityNpsPhyVMID, hwEntityNpsErrorDescr
// Description: Local VM resources are inconsistent with those on the MANO.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.35.28"] = [
    name: "hwEntityNpsVMResInconsist",
    fields: ["hwEntityNpsVMName", "hwEntityNpsVMID", "hwEntityNpsPhyVMID", "hwEntityNpsErrorDescr"],
    fieldOids: ["hwEntityNpsVMName": "1.3.6.1.4.1.2011.5.25.219.1.38.1", "hwEntityNpsVMID": "1.3.6.1.4.1.2011.5.25.219.1.38.2", "hwEntityNpsPhyVMID": "1.3.6.1.4.1.2011.5.25.219.1.38.3", "hwEntityNpsErrorDescr": "1.3.6.1.4.1.2011.5.25.219.1.38.5"]
]

// --- hwEntityNpsVMResInconsistResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.35.29
// Fields: hwEntityNpsVMName, hwEntityNpsVMID, hwEntityNpsPhyVMID, hwEntityNpsErrorDescr
// Description: Local VM resources are consistent with those on the MANO.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.35.29"] = [
    name: "hwEntityNpsVMResInconsistResume",
    fields: ["hwEntityNpsVMName", "hwEntityNpsVMID", "hwEntityNpsPhyVMID", "hwEntityNpsErrorDescr"],
    fieldOids: ["hwEntityNpsVMName": "1.3.6.1.4.1.2011.5.25.219.1.38.1", "hwEntityNpsVMID": "1.3.6.1.4.1.2011.5.25.219.1.38.2", "hwEntityNpsPhyVMID": "1.3.6.1.4.1.2011.5.25.219.1.38.3", "hwEntityNpsErrorDescr": "1.3.6.1.4.1.2011.5.25.219.1.38.5"]
]

// --- hwEntityNpsVmFault (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.35.30
// Fields: hwEntityNpsVMName, hwEntityNpsVMID, hwEntityNpsPhyVMID, hwEntityNpsErrorDescr
// Description: A fault occurs on a VM.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.35.30"] = [
    name: "hwEntityNpsVmFault",
    fields: ["hwEntityNpsVMName", "hwEntityNpsVMID", "hwEntityNpsPhyVMID", "hwEntityNpsErrorDescr"],
    fieldOids: ["hwEntityNpsVMName": "1.3.6.1.4.1.2011.5.25.219.1.38.1", "hwEntityNpsVMID": "1.3.6.1.4.1.2011.5.25.219.1.38.2", "hwEntityNpsPhyVMID": "1.3.6.1.4.1.2011.5.25.219.1.38.3", "hwEntityNpsErrorDescr": "1.3.6.1.4.1.2011.5.25.219.1.38.5"]
]

// --- hwEntityNpsVmFaultResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.35.31
// Fields: hwEntityNpsVMName, hwEntityNpsVMID, hwEntityNpsPhyVMID, hwEntityNpsErrorDescr
// Description: The fault on the VM is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.35.31"] = [
    name: "hwEntityNpsVmFaultResume",
    fields: ["hwEntityNpsVMName", "hwEntityNpsVMID", "hwEntityNpsPhyVMID", "hwEntityNpsErrorDescr"],
    fieldOids: ["hwEntityNpsVMName": "1.3.6.1.4.1.2011.5.25.219.1.38.1", "hwEntityNpsVMID": "1.3.6.1.4.1.2011.5.25.219.1.38.2", "hwEntityNpsPhyVMID": "1.3.6.1.4.1.2011.5.25.219.1.38.3", "hwEntityNpsErrorDescr": "1.3.6.1.4.1.2011.5.25.219.1.38.5"]
]

// --- hwEntityNpsVNFMConnectFault (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.35.32
// Fields: hwEntityNpsIPAddress, hwEntityNpsPort, hwEntityNpsErrorDescr
// Description: The connection between VNF and VNFM fault was faulty.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.35.32"] = [
    name: "hwEntityNpsVNFMConnectFault",
    fields: ["hwEntityNpsIPAddress", "hwEntityNpsPort", "hwEntityNpsErrorDescr"],
    fieldOids: ["hwEntityNpsIPAddress": "1.3.6.1.4.1.2011.5.25.219.1.38.8", "hwEntityNpsPort": "1.3.6.1.4.1.2011.5.25.219.1.38.6", "hwEntityNpsErrorDescr": "1.3.6.1.4.1.2011.5.25.219.1.38.5"]
]

// --- hwEntityNpsVNFMConnectResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.35.33
// Fields: hwEntityNpsIPAddress, hwEntityNpsPort, hwEntityNpsErrorDescr
// Description: The connection between VNF and VNFM fault was rectified.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.35.33"] = [
    name: "hwEntityNpsVNFMConnectResume",
    fields: ["hwEntityNpsIPAddress", "hwEntityNpsPort", "hwEntityNpsErrorDescr"],
    fieldOids: ["hwEntityNpsIPAddress": "1.3.6.1.4.1.2011.5.25.219.1.38.8", "hwEntityNpsPort": "1.3.6.1.4.1.2011.5.25.219.1.38.6", "hwEntityNpsErrorDescr": "1.3.6.1.4.1.2011.5.25.219.1.38.5"]
]

// --- hwEntityNpsFabricOamPlaneDown (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.35.34
// Fields: hwEntityNpsLocalVMName, hwEntityNpsRemoteVMName, hwEntityNpsNetworkPlaneID
// Description: Fabric plane goes Down.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.35.34"] = [
    name: "hwEntityNpsFabricOamPlaneDown",
    fields: ["hwEntityNpsLocalVMName", "hwEntityNpsRemoteVMName", "hwEntityNpsNetworkPlaneID"],
    fieldOids: ["hwEntityNpsLocalVMName": "1.3.6.1.4.1.2011.5.25.219.1.38.27", "hwEntityNpsRemoteVMName": "1.3.6.1.4.1.2011.5.25.219.1.38.28", "hwEntityNpsNetworkPlaneID": "1.3.6.1.4.1.2011.5.25.219.1.38.29"]
]

// --- hwEntityNpsFabricOamPlaneDownResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.35.35
// Fields: hwEntityNpsLocalVMName, hwEntityNpsRemoteVMName, hwEntityNpsNetworkPlaneID
// Description: Fabric plane down alarm was cleared.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.35.35"] = [
    name: "hwEntityNpsFabricOamPlaneDownResume",
    fields: ["hwEntityNpsLocalVMName", "hwEntityNpsRemoteVMName", "hwEntityNpsNetworkPlaneID"],
    fieldOids: ["hwEntityNpsLocalVMName": "1.3.6.1.4.1.2011.5.25.219.1.38.27", "hwEntityNpsRemoteVMName": "1.3.6.1.4.1.2011.5.25.219.1.38.28", "hwEntityNpsNetworkPlaneID": "1.3.6.1.4.1.2011.5.25.219.1.38.29"]
]

// --- hwEntityNpsFabricLinkSubhealthy (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.35.36
// Fields: hwEntityNpsLocalVMName, hwEntityNpsRemoteVMName, hwEntityNpsNetworkPlaneID, hwEntityNpsNetworkErrorThreshold
// Description: Fabric link goes subhealthy.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.35.36"] = [
    name: "hwEntityNpsFabricLinkSubhealthy",
    fields: ["hwEntityNpsLocalVMName", "hwEntityNpsRemoteVMName", "hwEntityNpsNetworkPlaneID", "hwEntityNpsNetworkErrorThreshold"],
    fieldOids: ["hwEntityNpsLocalVMName": "1.3.6.1.4.1.2011.5.25.219.1.38.27", "hwEntityNpsRemoteVMName": "1.3.6.1.4.1.2011.5.25.219.1.38.28", "hwEntityNpsNetworkPlaneID": "1.3.6.1.4.1.2011.5.25.219.1.38.29", "hwEntityNpsNetworkErrorThreshold": "1.3.6.1.4.1.2011.5.25.219.1.38.30"]
]

// --- hwEntityNpsFabricLinkSubhealthyResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.35.37
// Fields: hwEntityNpsLocalVMName, hwEntityNpsRemoteVMName, hwEntityNpsNetworkPlaneID, hwEntityNpsNetworkErrorThreshold
// Description: Fabric link resume from subhealthy.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.35.37"] = [
    name: "hwEntityNpsFabricLinkSubhealthyResume",
    fields: ["hwEntityNpsLocalVMName", "hwEntityNpsRemoteVMName", "hwEntityNpsNetworkPlaneID", "hwEntityNpsNetworkErrorThreshold"],
    fieldOids: ["hwEntityNpsLocalVMName": "1.3.6.1.4.1.2011.5.25.219.1.38.27", "hwEntityNpsRemoteVMName": "1.3.6.1.4.1.2011.5.25.219.1.38.28", "hwEntityNpsNetworkPlaneID": "1.3.6.1.4.1.2011.5.25.219.1.38.29", "hwEntityNpsNetworkErrorThreshold": "1.3.6.1.4.1.2011.5.25.219.1.38.30"]
]

// --- hwEntityNpsDriverTypeMismatch (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.35.38
// Fields: hwEntityNpsVMName, hwEntityNpsDriverVendor, hwEntityNpsDeviceID, hwEntityNpsDriverType, hwEntityNpsErrorDescr
// Description: Load vNIC driver failure.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.35.38"] = [
    name: "hwEntityNpsDriverTypeMismatch",
    fields: ["hwEntityNpsVMName", "hwEntityNpsDriverVendor", "hwEntityNpsDeviceID", "hwEntityNpsDriverType", "hwEntityNpsErrorDescr"],
    fieldOids: ["hwEntityNpsVMName": "1.3.6.1.4.1.2011.5.25.219.1.38.1", "hwEntityNpsDriverVendor": "1.3.6.1.4.1.2011.5.25.219.1.38.32", "hwEntityNpsDeviceID": "1.3.6.1.4.1.2011.5.25.219.1.38.31", "hwEntityNpsDriverType": "1.3.6.1.4.1.2011.5.25.219.1.38.33", "hwEntityNpsErrorDescr": "1.3.6.1.4.1.2011.5.25.219.1.38.5"]
]

// --- hwEntityNpsDriverTypeMismatchResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.35.39
// Fields: hwEntityNpsVMName, hwEntityNpsDriverVendor, hwEntityNpsDeviceID, hwEntityNpsDriverType, hwEntityNpsErrorDescr
// Description: Load vNIC driver success.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.35.39"] = [
    name: "hwEntityNpsDriverTypeMismatchResume",
    fields: ["hwEntityNpsVMName", "hwEntityNpsDriverVendor", "hwEntityNpsDeviceID", "hwEntityNpsDriverType", "hwEntityNpsErrorDescr"],
    fieldOids: ["hwEntityNpsVMName": "1.3.6.1.4.1.2011.5.25.219.1.38.1", "hwEntityNpsDriverVendor": "1.3.6.1.4.1.2011.5.25.219.1.38.32", "hwEntityNpsDeviceID": "1.3.6.1.4.1.2011.5.25.219.1.38.31", "hwEntityNpsDriverType": "1.3.6.1.4.1.2011.5.25.219.1.38.33", "hwEntityNpsErrorDescr": "1.3.6.1.4.1.2011.5.25.219.1.38.5"]
]

// --- hwEntityNpsRuCreateFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.35.40
// Fields: hwEntityNpsVMName, hwEntityNpsVNFCName, hwEntityNpsRUName, hwEntityNpsErrorDescr
// Description: The VM create RU failed.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.35.40"] = [
    name: "hwEntityNpsRuCreateFail",
    fields: ["hwEntityNpsVMName", "hwEntityNpsVNFCName", "hwEntityNpsRUName", "hwEntityNpsErrorDescr"],
    fieldOids: ["hwEntityNpsVMName": "1.3.6.1.4.1.2011.5.25.219.1.38.1", "hwEntityNpsVNFCName": "1.3.6.1.4.1.2011.5.25.219.1.38.22", "hwEntityNpsRUName": "1.3.6.1.4.1.2011.5.25.219.1.38.21", "hwEntityNpsErrorDescr": "1.3.6.1.4.1.2011.5.25.219.1.38.5"]
]

// --- hwEntityNpsRuCreateFailResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.35.41
// Fields: hwEntityNpsVMName, hwEntityNpsVNFCName, hwEntityNpsRUName, hwEntityNpsErrorDescr
// Description: The VM create RU succcess.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.35.41"] = [
    name: "hwEntityNpsRuCreateFailResume",
    fields: ["hwEntityNpsVMName", "hwEntityNpsVNFCName", "hwEntityNpsRUName", "hwEntityNpsErrorDescr"],
    fieldOids: ["hwEntityNpsVMName": "1.3.6.1.4.1.2011.5.25.219.1.38.1", "hwEntityNpsVNFCName": "1.3.6.1.4.1.2011.5.25.219.1.38.22", "hwEntityNpsRUName": "1.3.6.1.4.1.2011.5.25.219.1.38.21", "hwEntityNpsErrorDescr": "1.3.6.1.4.1.2011.5.25.219.1.38.5"]
]

// --- hwEntityNpsIpSecRuleFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.35.42
// Fields: hwEntityNpsVMName, hwEntityNpsPortName, hwEntityNpsIPAddress
// Description: Setting Security Group Rules Failed.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.35.42"] = [
    name: "hwEntityNpsIpSecRuleFail",
    fields: ["hwEntityNpsVMName", "hwEntityNpsPortName", "hwEntityNpsIPAddress"],
    fieldOids: ["hwEntityNpsVMName": "1.3.6.1.4.1.2011.5.25.219.1.38.1", "hwEntityNpsPortName": "1.3.6.1.4.1.2011.5.25.219.1.38.7", "hwEntityNpsIPAddress": "1.3.6.1.4.1.2011.5.25.219.1.38.8"]
]

// --- hwEntityNpsIpSecRuleFailResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.35.43
// Fields: hwEntityNpsVMName, hwEntityNpsPortName, hwEntityNpsIPAddress
// Description: Setting Security Group Rules Failed alarm clear.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.35.43"] = [
    name: "hwEntityNpsIpSecRuleFailResume",
    fields: ["hwEntityNpsVMName", "hwEntityNpsPortName", "hwEntityNpsIPAddress"],
    fieldOids: ["hwEntityNpsVMName": "1.3.6.1.4.1.2011.5.25.219.1.38.1", "hwEntityNpsPortName": "1.3.6.1.4.1.2011.5.25.219.1.38.7", "hwEntityNpsIPAddress": "1.3.6.1.4.1.2011.5.25.219.1.38.8"]
]

// --- hwEntityNpsBaseLinkSubhealthy (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.35.44
// Fields: hwEntityNpsLocalVMName, hwEntityNpsRemoteVMName, hwEntityNpsNetworkPlaneID, hwEntityNpsQuality
// Description: Base link goes subhealthy.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.35.44"] = [
    name: "hwEntityNpsBaseLinkSubhealthy",
    fields: ["hwEntityNpsLocalVMName", "hwEntityNpsRemoteVMName", "hwEntityNpsNetworkPlaneID", "hwEntityNpsQuality"],
    fieldOids: ["hwEntityNpsLocalVMName": "1.3.6.1.4.1.2011.5.25.219.1.38.27", "hwEntityNpsRemoteVMName": "1.3.6.1.4.1.2011.5.25.219.1.38.28", "hwEntityNpsNetworkPlaneID": "1.3.6.1.4.1.2011.5.25.219.1.38.29", "hwEntityNpsQuality": "1.3.6.1.4.1.2011.5.25.219.1.38.34"]
]

// --- hwEntityNpsBaseLinkSubhealthyResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.35.45
// Fields: hwEntityNpsLocalVMName, hwEntityNpsRemoteVMName, hwEntityNpsNetworkPlaneID, hwEntityNpsQuality
// Description: Base link resume from subhealthy.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.35.45"] = [
    name: "hwEntityNpsBaseLinkSubhealthyResume",
    fields: ["hwEntityNpsLocalVMName", "hwEntityNpsRemoteVMName", "hwEntityNpsNetworkPlaneID", "hwEntityNpsQuality"],
    fieldOids: ["hwEntityNpsLocalVMName": "1.3.6.1.4.1.2011.5.25.219.1.38.27", "hwEntityNpsRemoteVMName": "1.3.6.1.4.1.2011.5.25.219.1.38.28", "hwEntityNpsNetworkPlaneID": "1.3.6.1.4.1.2011.5.25.219.1.38.29", "hwEntityNpsQuality": "1.3.6.1.4.1.2011.5.25.219.1.38.34"]
]

// --- hwEntityConfigurationRollbackRising (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.36.1
// Fields: hwEntityConfigurationCurrent, hwEntityConfigurationRollbackReason
// Description: An alarm was generated when configuration rollback.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.36.1"] = [
    name: "hwEntityConfigurationRollbackRising",
    fields: ["hwEntityConfigurationCurrent", "hwEntityConfigurationRollbackReason"],
    fieldOids: ["hwEntityConfigurationCurrent": "1.3.6.1.4.1.2011.5.25.219.1.39.1", "hwEntityConfigurationRollbackReason": "1.3.6.1.4.1.2011.5.25.219.1.39.2"]
]

// --- hwNPDomainDropCauseCntNumabruptlyAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.37.1
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID, hwLpuSlotId, hwLpuFeId, hwDropCauseId, hwHelpinfo
// Description: The number of key dropcause count on the NP Chip increases abruptly and exceeds the preset threshold.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.37.1"] = [
    name: "hwNPDomainDropCauseCntNumabruptlyAlarm",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID", "hwLpuSlotId", "hwLpuFeId", "hwDropCauseId", "hwHelpinfo"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3", "hwLpuSlotId": "1.3.6.1.4.1.2011.5.25.219.1.41", "hwLpuFeId": "1.3.6.1.4.1.2011.5.25.219.1.42", "hwDropCauseId": "1.3.6.1.4.1.2011.5.25.219.1.43", "hwHelpinfo": "1.3.6.1.4.1.2011.5.25.219.1.68"]
]

// --- hwNPDomainDropCauseCntNumabruptlyResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.37.2
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID, hwLpuSlotId, hwLpuFeId, hwDropCauseId, hwHelpinfo
// Description: The number of key dropcause count on the NP Chip return normal .
trapMap["1.3.6.1.4.1.2011.5.25.219.2.37.2"] = [
    name: "hwNPDomainDropCauseCntNumabruptlyResume",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID", "hwLpuSlotId", "hwLpuFeId", "hwDropCauseId", "hwHelpinfo"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3", "hwLpuSlotId": "1.3.6.1.4.1.2011.5.25.219.1.41", "hwLpuFeId": "1.3.6.1.4.1.2011.5.25.219.1.42", "hwDropCauseId": "1.3.6.1.4.1.2011.5.25.219.1.43", "hwHelpinfo": "1.3.6.1.4.1.2011.5.25.219.1.68"]
]

// --- hwNPResourceExcAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.38.1
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID, hwLpuSlotId, hwLpuFeId
// Description: NP Resources abnormal.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.38.1"] = [
    name: "hwNPResourceExcAlarm",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID", "hwLpuSlotId", "hwLpuFeId"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3", "hwLpuSlotId": "1.3.6.1.4.1.2011.5.25.219.1.41", "hwLpuFeId": "1.3.6.1.4.1.2011.5.25.219.1.42"]
]

// --- hwNPResourceExcResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.38.2
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID, hwLpuSlotId, hwLpuFeId
// Description: NP resources returns to normal.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.38.2"] = [
    name: "hwNPResourceExcResume",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID", "hwLpuSlotId", "hwLpuFeId"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3", "hwLpuSlotId": "1.3.6.1.4.1.2011.5.25.219.1.41", "hwLpuFeId": "1.3.6.1.4.1.2011.5.25.219.1.42"]
]

// --- hwEntityFileSystemRebuild (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.39.1
// Description: An alarm was generated when file system rebuild.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.39.1"] = [
    name: "hwEntityFileSystemRebuild",
    fields: [],
    fieldOids: []
]

// --- hwEntityFileSystemAbnormal (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.39.2
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID, hwEntityTrapReasonDescr
// Description: The filesystem is abnormal.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.39.2"] = [
    name: "hwEntityFileSystemAbnormal",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID", "hwEntityTrapReasonDescr"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3", "hwEntityTrapReasonDescr": "1.3.6.1.4.1.2011.5.25.219.1.13"]
]

// --- hwEntityFileSystemFdAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.39.3
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwPorcessName
// Description: The file handle exceeds the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.39.3"] = [
    name: "hwEntityFileSystemFdAlarm",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwPorcessName"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwPorcessName": "1.3.6.1.4.1.2011.5.25.219.1.45"]
]

// --- hwEntityFileSystemFdResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.39.4
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwPorcessName
// Description: The file handle exceeds the threshold alarm cleared.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.39.4"] = [
    name: "hwEntityFileSystemFdResume",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwPorcessName"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwPorcessName": "1.3.6.1.4.1.2011.5.25.219.1.45"]
]

// --- hwEntityFileSystemAbnormalResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.39.5
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID, hwEntityTrapReasonDescr
// Description: The filesystem abnormal cleared.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.39.5"] = [
    name: "hwEntityFileSystemAbnormalResume",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID", "hwEntityTrapReasonDescr"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3", "hwEntityTrapReasonDescr": "1.3.6.1.4.1.2011.5.25.219.1.13"]
]

// --- hwEntityCODECHardewareFaultAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.40.1
// Description: CODEC Hardeware Fault.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.40.1"] = [
    name: "hwEntityCODECHardewareFaultAlarm",
    fields: [],
    fieldOids: []
]

// --- hwEntityTPMHardewareFaultAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.40.2
// Description: TPM Hardeware Fault.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.40.2"] = [
    name: "hwEntityTPMHardewareFaultAlarm",
    fields: [],
    fieldOids: []
]

// --- hwEntityMCUHardewareFaultAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.40.3
// Description: MCU Hardeware Fault.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.40.3"] = [
    name: "hwEntityMCUHardewareFaultAlarm",
    fields: [],
    fieldOids: []
]

// --- hwInternalProtocolNetworkPortFaultAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.41.1
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID
// Description: One of the internal protocol network ports failed.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.41.1"] = [
    name: "hwInternalProtocolNetworkPortFaultAlarm",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwInternalProtocolNetworkPortFaultResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.41.2
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID
// Description: The fault on internal protocol network port is cleared .
trapMap["1.3.6.1.4.1.2011.5.25.219.2.41.2"] = [
    name: "hwInternalProtocolNetworkPortFaultResume",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwContainerCpuUtilizationRising (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.42.1
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwContainerName, hwEntityThresholdType, hwEntityThresholdWarning, hwEntityThresholdCurrent, hwEntityTrapFaultID
// Description: Container CPU utilization overrun
trapMap["1.3.6.1.4.1.2011.5.25.219.2.42.1"] = [
    name: "hwContainerCpuUtilizationRising",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwContainerName", "hwEntityThresholdType", "hwEntityThresholdWarning", "hwEntityThresholdCurrent", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwContainerName": "1.3.6.1.4.1.2011.5.25.219.1.49", "hwEntityThresholdType": "1.3.6.1.4.1.2011.5.25.219.1.5.1.1", "hwEntityThresholdWarning": "1.3.6.1.4.1.2011.5.25.219.1.5.1.5", "hwEntityThresholdCurrent": "1.3.6.1.4.1.2011.5.25.219.1.5.1.3", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwContainerCpuUtilizationResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.42.2
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwContainerName, hwEntityThresholdType, hwEntityThresholdWarning, hwEntityThresholdCurrent, hwEntityTrapFaultID
// Description: Container CPU utilization back to normal level
trapMap["1.3.6.1.4.1.2011.5.25.219.2.42.2"] = [
    name: "hwContainerCpuUtilizationResume",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwContainerName", "hwEntityThresholdType", "hwEntityThresholdWarning", "hwEntityThresholdCurrent", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwContainerName": "1.3.6.1.4.1.2011.5.25.219.1.49", "hwEntityThresholdType": "1.3.6.1.4.1.2011.5.25.219.1.5.1.1", "hwEntityThresholdWarning": "1.3.6.1.4.1.2011.5.25.219.1.5.1.5", "hwEntityThresholdCurrent": "1.3.6.1.4.1.2011.5.25.219.1.5.1.3", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwContainerMemUtilizationRising (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.42.3
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwContainerName, hwEntityThresholdType, hwEntityThresholdWarning, hwEntityThresholdCurrent, hwEntityTrapFaultID
// Description: Container mem utilization overrun
trapMap["1.3.6.1.4.1.2011.5.25.219.2.42.3"] = [
    name: "hwContainerMemUtilizationRising",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwContainerName", "hwEntityThresholdType", "hwEntityThresholdWarning", "hwEntityThresholdCurrent", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwContainerName": "1.3.6.1.4.1.2011.5.25.219.1.49", "hwEntityThresholdType": "1.3.6.1.4.1.2011.5.25.219.1.5.1.1", "hwEntityThresholdWarning": "1.3.6.1.4.1.2011.5.25.219.1.5.1.5", "hwEntityThresholdCurrent": "1.3.6.1.4.1.2011.5.25.219.1.5.1.3", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwContainerMemUtilizationResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.42.4
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwContainerName, hwEntityThresholdType, hwEntityThresholdWarning, hwEntityThresholdCurrent, hwEntityTrapFaultID
// Description: Container mem utilization back to normal level
trapMap["1.3.6.1.4.1.2011.5.25.219.2.42.4"] = [
    name: "hwContainerMemUtilizationResume",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwContainerName", "hwEntityThresholdType", "hwEntityThresholdWarning", "hwEntityThresholdCurrent", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwContainerName": "1.3.6.1.4.1.2011.5.25.219.1.49", "hwEntityThresholdType": "1.3.6.1.4.1.2011.5.25.219.1.5.1.1", "hwEntityThresholdWarning": "1.3.6.1.4.1.2011.5.25.219.1.5.1.5", "hwEntityThresholdCurrent": "1.3.6.1.4.1.2011.5.25.219.1.5.1.3", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwContainerStorageInsufficient (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.42.5
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwContainerName, hwEntityThresholdType, hwEntityThresholdWarning, hwEntityThresholdCurrent, hwEntityTrapFaultID
// Description: Container storage insufficient
trapMap["1.3.6.1.4.1.2011.5.25.219.2.42.5"] = [
    name: "hwContainerStorageInsufficient",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwContainerName", "hwEntityThresholdType", "hwEntityThresholdWarning", "hwEntityThresholdCurrent", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwContainerName": "1.3.6.1.4.1.2011.5.25.219.1.49", "hwEntityThresholdType": "1.3.6.1.4.1.2011.5.25.219.1.5.1.1", "hwEntityThresholdWarning": "1.3.6.1.4.1.2011.5.25.219.1.5.1.5", "hwEntityThresholdCurrent": "1.3.6.1.4.1.2011.5.25.219.1.5.1.3", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwContainerStorageInsufficientResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.42.6
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwContainerName, hwEntityThresholdType, hwEntityThresholdWarning, hwEntityThresholdCurrent, hwEntityTrapFaultID
// Description: Container storage back to normal level
trapMap["1.3.6.1.4.1.2011.5.25.219.2.42.6"] = [
    name: "hwContainerStorageInsufficientResume",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwContainerName", "hwEntityThresholdType", "hwEntityThresholdWarning", "hwEntityThresholdCurrent", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwContainerName": "1.3.6.1.4.1.2011.5.25.219.1.49", "hwEntityThresholdType": "1.3.6.1.4.1.2011.5.25.219.1.5.1.1", "hwEntityThresholdWarning": "1.3.6.1.4.1.2011.5.25.219.1.5.1.5", "hwEntityThresholdCurrent": "1.3.6.1.4.1.2011.5.25.219.1.5.1.3", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwContainerAbnormal (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.42.7
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwContainerName, hwEntityTrapFaultID
// Description: Container run abnormal
trapMap["1.3.6.1.4.1.2011.5.25.219.2.42.7"] = [
    name: "hwContainerAbnormal",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwContainerName", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwContainerName": "1.3.6.1.4.1.2011.5.25.219.1.49", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwContainerAbnormalResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.42.8
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwContainerName, hwEntityTrapFaultID
// Description: Container run back to normal
trapMap["1.3.6.1.4.1.2011.5.25.219.2.42.8"] = [
    name: "hwContainerAbnormalResume",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwContainerName", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwContainerName": "1.3.6.1.4.1.2011.5.25.219.1.49", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwContainerAppAbnormal (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.42.9
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwContainerName, hwContainerAppName, hwEntityTrapFaultID
// Description: App in Container run abnormal
trapMap["1.3.6.1.4.1.2011.5.25.219.2.42.9"] = [
    name: "hwContainerAppAbnormal",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwContainerName", "hwContainerAppName", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwContainerName": "1.3.6.1.4.1.2011.5.25.219.1.49", "hwContainerAppName": "1.3.6.1.4.1.2011.5.25.219.1.50", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwContainerAppAbnormalResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.42.10
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwContainerName, hwContainerAppName, hwEntityTrapFaultID
// Description: App in Container back to normal level
trapMap["1.3.6.1.4.1.2011.5.25.219.2.42.10"] = [
    name: "hwContainerAppAbnormalResume",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwContainerName", "hwContainerAppName", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwContainerName": "1.3.6.1.4.1.2011.5.25.219.1.49", "hwContainerAppName": "1.3.6.1.4.1.2011.5.25.219.1.50", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwFrerLinkPacketLossTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.42.11
// Fields: hwEntityCpeRemoteStationMAC
// Description: Packet loss occurs on the FRER (dual fed and selective receiving) link on the CPE.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.42.11"] = [
    name: "hwFrerLinkPacketLossTrap",
    fields: ["hwEntityCpeRemoteStationMAC"],
    fieldOids: ["hwEntityCpeRemoteStationMAC": "1.3.6.1.4.1.2011.5.25.219.1.63"]
]

// --- hwFrerLinkPacketLossTrapRestore (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.42.12
// Fields: hwEntityCpeRemoteStationMAC
// Description: Cleared the alarm of packet loss on the FRER (dual fed and selective receiving) link on the CPE.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.42.12"] = [
    name: "hwFrerLinkPacketLossTrapRestore",
    fields: ["hwEntityCpeRemoteStationMAC"],
    fieldOids: ["hwEntityCpeRemoteStationMAC": "1.3.6.1.4.1.2011.5.25.219.1.63"]
]

// --- hwSipfpmFlowOverloadTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.43.1
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwCapCurSipfpmFlowRate, hwCapUpperSipfpmFlowThreshold, hwCapLowerSipfpmFlowThreshold
// Description: The s-ipfpm stream number overload.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.43.1"] = [
    name: "hwSipfpmFlowOverloadTrap",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwCapCurSipfpmFlowRate", "hwCapUpperSipfpmFlowThreshold", "hwCapLowerSipfpmFlowThreshold"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwCapCurSipfpmFlowRate": "1.3.6.1.4.1.2011.5.25.219.1.60", "hwCapUpperSipfpmFlowThreshold": "1.3.6.1.4.1.2011.5.25.219.1.61", "hwCapLowerSipfpmFlowThreshold": "1.3.6.1.4.1.2011.5.25.219.1.62"]
]

// --- hwSipfpmFlowOverloadRestoreTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.43.2
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwCapCurSipfpmFlowRate, hwCapUpperSipfpmFlowThreshold, hwCapLowerSipfpmFlowThreshold
// Description: The s-ipfpm stream number overload restore.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.43.2"] = [
    name: "hwSipfpmFlowOverloadRestoreTrap",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwCapCurSipfpmFlowRate", "hwCapUpperSipfpmFlowThreshold", "hwCapLowerSipfpmFlowThreshold"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwCapCurSipfpmFlowRate": "1.3.6.1.4.1.2011.5.25.219.1.60", "hwCapUpperSipfpmFlowThreshold": "1.3.6.1.4.1.2011.5.25.219.1.61", "hwCapLowerSipfpmFlowThreshold": "1.3.6.1.4.1.2011.5.25.219.1.62"]
]

// --- hwSACSessionOverloadTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.43.3
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwCapCurSACSessionRate, hwCapUpperSACSessionThreshold, hwCapLowerSACSessionThreshold
// Description: The SAC session usage exceeded the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.43.3"] = [
    name: "hwSACSessionOverloadTrap",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwCapCurSACSessionRate", "hwCapUpperSACSessionThreshold", "hwCapLowerSACSessionThreshold"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwCapCurSACSessionRate": "1.3.6.1.4.1.2011.5.25.219.1.65", "hwCapUpperSACSessionThreshold": "1.3.6.1.4.1.2011.5.25.219.1.66", "hwCapLowerSACSessionThreshold": "1.3.6.1.4.1.2011.5.25.219.1.67"]
]

// --- hwSACSessionOverloadRestoreTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.43.4
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwCapCurSACSessionRate, hwCapUpperSACSessionThreshold, hwCapLowerSACSessionThreshold
// Description: The SAC session usage was restored to the normal range.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.43.4"] = [
    name: "hwSACSessionOverloadRestoreTrap",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwCapCurSACSessionRate", "hwCapUpperSACSessionThreshold", "hwCapLowerSACSessionThreshold"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwCapCurSACSessionRate": "1.3.6.1.4.1.2011.5.25.219.1.65", "hwCapUpperSACSessionThreshold": "1.3.6.1.4.1.2011.5.25.219.1.66", "hwCapLowerSACSessionThreshold": "1.3.6.1.4.1.2011.5.25.219.1.67"]
]

// --- hwFwdPacketLoss (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.43.5
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityCoreIndex, hwEntityLossType, hwEntityLossCount
// Description: Packet loss occurs on the FWD Module.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.43.5"] = [
    name: "hwFwdPacketLoss",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityCoreIndex", "hwEntityLossType", "hwEntityLossCount"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityCoreIndex": "1.3.6.1.4.1.2011.5.25.219.1.75", "hwEntityLossType": "1.3.6.1.4.1.2011.5.25.219.1.73", "hwEntityLossCount": "1.3.6.1.4.1.2011.5.25.219.1.74"]
]

// --- hwSystemBakeupStartup (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.44.1
// Description: The device starts up from the backup software.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.44.1"] = [
    name: "hwSystemBakeupStartup",
    fields: [],
    fieldOids: []
]

// --- hwValveOffline (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.45.1
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID
// Description: This object indicates that the valve was not present.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.45.1"] = [
    name: "hwValveOffline",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwValveOnline (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.45.2
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID
// Description: This object indicates that the valve was present..
trapMap["1.3.6.1.4.1.2011.5.25.219.2.45.2"] = [
    name: "hwValveOnline",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwValveFault (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.45.3
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID
// Description: This object indicates that the valve was fault.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.45.3"] = [
    name: "hwValveFault",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwValveNormal (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.45.4
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID
// Description: This object indicates that the valve works normally.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.45.4"] = [
    name: "hwValveNormal",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwLiquidSensorOffline (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.45.5
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID
// Description: This object indicates that the liquid sensor was not present.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.45.5"] = [
    name: "hwLiquidSensorOffline",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwLiquidSensorOnline (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.45.6
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID
// Description: This object indicates that the liquid sensor was present.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.45.6"] = [
    name: "hwLiquidSensorOnline",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwLiquidLeak (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.45.7
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID
// Description: This object indicates that the board leakage.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.45.7"] = [
    name: "hwLiquidLeak",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwNoLeak (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.45.8
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID
// Description: This object indicates that the board liquid system normally.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.45.8"] = [
    name: "hwNoLeak",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwValveCommFault (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.45.9
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID
// Description: This object indicates that the valve was communicatie fault.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.45.9"] = [
    name: "hwValveCommFault",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwValveCommNormal (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.45.10
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID
// Description: This object indicates that the valve works normally.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.45.10"] = [
    name: "hwValveCommNormal",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwValveInspectFault (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.45.11
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID
// Description: This object indicates that the valve inspection is not executed.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.45.11"] = [
    name: "hwValveInspectFault",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwValveInspectNormal (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.45.12
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID
// Description: This object indicates that the valve inspection completed.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.45.12"] = [
    name: "hwValveInspectNormal",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwChannelFault (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.45.13
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID
// Description: This object indicates that the liquid valve channel was fault.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.45.13"] = [
    name: "hwChannelFault",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// --- hwChannelNormal (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.219.2.45.14
// Fields: hwEntityPhysicalIndex, entPhysicalName, hwEntityTrapFaultID
// Description: This object indicates that the liquid valve channel works normally.
trapMap["1.3.6.1.4.1.2011.5.25.219.2.45.14"] = [
    name: "hwChannelNormal",
    fields: ["hwEntityPhysicalIndex", "entPhysicalName", "hwEntityTrapFaultID"],
    fieldOids: ["hwEntityPhysicalIndex": "1.3.6.1.4.1.2011.5.25.219.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.219.1.3"]
]

// ===== Parsing logic =====

// Set to true to enable diagnostic logging for this MIB parser
DEBUG = false

LOG_PREFIX = "[HUAWEI-ENTITY-TRAP-MIB]"
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
