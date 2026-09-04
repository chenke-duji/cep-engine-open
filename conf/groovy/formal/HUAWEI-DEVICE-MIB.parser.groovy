/**
 * Auto-generated from HUAWEI-DEVICE-MIB.mib
 * Generated: 2026-08-25T16:47:00.771682500
 * Traps/Notifications (145): hwDevBoardDetectTrap, hwDevBoardDisappearedTrap, hwDevBoardStateChangedTrap, hwDevBoardStaChgOffLineTrap, hwDevBoardAutoLoadTrap, hwDevUserlabelChangeTrap, hwDevSystemStateChangeTrap, hwDevFrameDetectTrap, hwDevFrameDisappearedTrap, hwDevFrameStateChangeTrap, hwDevExtendedFramePortChangeTrap, hwDevSnmpProbeRecordTrap, hwDevStackFrameStateChangeTrap, hwDevSystemDataSynCancelTrap, hwDevActiveStandbyContolBoardInconsistentTrap, hwDevActiveStandbyDataSynCancelTrap, hwDevActiveStandbyDataSynCancelRecoverTrap, hwDevSystemPoweroffTrap, hwDevSystemAutoDeployFailTrap, hwDevSystemDeviceNameChangeTrap, hwDevFrameTypeInconsistentTrap, hwDevFrameRestoreTrap, hwDevFrameFaultTrap, hwDevExtendedFrameTypeInconsistentTrap, hwDevExtendedFrameDyingGaspAlarmTrap, hwDevExtendedFrameDyingGaspRestoreTrap, hwDevFrameIdOverLoadTrap, hwDevFrameCmtsAntitheftAuthFailTrap, hwDevFrameCmtsAntitheftAuthRestoreTrap, hwVccDataLinkFault, hwVccDataLinkFaultResume, hwVccDataChannelFault, hwVccDataChannelFaultResume, hwDevStackFrameFaultTrap, hwDevStackFrameRestoreTrap, hwDevStandbyFrameTypeInconsistentTrap, hwDeviceHighTemperatureMinorFaultTrap, hwDeviceHighTemperatureMinorRestoreTrap, hwDeviceHighTemperatureMajorFaultTrap, hwDeviceHighTemperatureMajorRestoreTrap, hwDeviceHighTemperatureCriticalFaultTrap, hwDeviceHighTemperatureCriticalRestoreTrap, hwFwdChannelFault, hwFwdChannelFaultResume, hwDevTlsCertifyFailTrap, hwDevTlsCertifyRestoreTrap, hwDevExtendedFrameRestoreTrap, hwDevExtendedFrameFaultTrap, hwDevFramePacketLossFaultTrap, hwDevFramePacketLossRestoreTrap, hwDevFrameDustAccumulationRiskFaultTrap, hwDevFrameDustAccumulationRiskRestoreTrap, hwDevBoardMisMatchTrap, hwDevBoardFaultTrap, hwDevBoardRestoreTrap, hwDevBoardReplacedTrap, hwDevBoardEnterTemperatureProctectModeTrap, hwDevBoardExitTemperatureProctectModeTrap, hwDevBoardTemperatureTooHighTrap, hwDevBoardTemperatureTooHighRecoverTrap, hwDevBoardTemperatureTooLowTrap, hwDevBoardTemperatureTooLowRecoverTrap, hwDevPowerInputFaultTrap, hwDevPowerInputRecoverTrap, hwDevBoardOnlineStateTrap, hwDevBoardPower5VFaultTrap, hwDevBoardPower5VResumeTrap, hwDevStorageFaultTrap, hwDevStorageFaultRestoreTrap, hwFtpConfigureTrap, hwDevBoardAutomaticExpandFailTrap, hwDevBoardAutomaticExpandRestoreTrap, hwDevBoardInputFaultTrap, hwDevBoardInputRecoverTrap, hwDevPowerLackVoltageFaultTrap, hwDevPowerLackVolitageRecoverTrap, hwDevBoardReplaceFailTrap, hwDevPowerPortInputFaultTrap, hwDevPowerPortInputRecoverTrap, hwDevPowerPortInputUnderVolFaultTrap, hwDevPowerPortInputUnderVolRecoverTrap, hwDevImportantFileBrokenTrap, hwDevImportantFileBrokenRestoreTrap, hwDevRtuLicCapacityExceedFaultTrap, hwDevRtuLicCapacityExceedRestoreTrap, hwDevExBiosPasswordFaultTrap, hwDevExBiosPasswordRecoverTrap, hwDevLoadLowerVersionTrap, hwDevPowerOverThresholdFaultTrap, hwDevPowerOverThresholdRestoreTrap, hwDevBoardIsolatedTrap, hwDevBoardIsolatedRecoverTrap, hwDevSeIsolatedTrap, hwDevSeIsolatedTrapRestore, hwDevVoiceFileLZMATrap, hwDevFileIntegrityCheckFailedTrap, hwDevFileIntegrityCheckSuccessTrap, hwDevBoardAddConfigReplaceSuccessTrap, hwDevBoardAddConfigReplaceFailTrap, hwUnauthDistributionFaultTrap, hwUnauthDistributionRestoreTrap, hwDevPowerPortInputOverVolFaultTrap, hwDevPowerPortInputOverVolRecoverTrap, hwClkInputSignalNotMatchConfigurationTrap, hwClkInputSignalRecoverMatchConfigurationTrap, hwDevUbifsFaultTrap, hwDevUbifsRestoreTrap, hwDevBoardHotResetTrap, hwDevMemFragmentationExcessiveFaultTrap, hwDevMemFragmentationExcessiveRestoreTrap, hwDevBoardSoftWareMisMatchTrap, hwDevPowerBoardCapInconsistencyFaultTrap, hwDevPowerBoardCapInconsistencyRestoreTrap, hwDevBoardCriticalHardFaultTrap, hwDevBoardCriticalHardRestoreTrap, hwDevBoardMinorHardFaultTrap, hwDevBoardMinorHardRestoreTrap, hwDevAreaPowerOverThresholdFaultTrap, hwDevAreaPowerOverThresholdRestoreTrap, hwDevRtuResOverloadFaultTrap, hwDevRtuResOverloadRestoreTrap, hwDevTactSwitchOpenFaultTrap, hwDevTactSwitchOpenRestoreTrap, hwDevEmergencyPartitionTrap, hwDevEmergencyPartitionRestoreTrap, hwDevSubBoardTypeInconsistentTrap, hwDevSubBoardMisMatchTrap, hwDevSubBoardReplacedTrap, hwDevSubBoardTemperatureTooHighTrap, hwDevSubBoardTemperatureTooHighRecoverTrap, hwDevSubBoardFaultTrap, hwDevSubBoardFaultRecoverTrap, hwDevSubBoardActStdInconsistentTrap, hwDevSubBoardActStdInconsistentRestoreTrap, hwDiagResOverloadFaultTrap, hwDiagResOverloadRestoreTrap, hwFrameAdminResultTrap, hwSlotAdminResultTrap, hwSubSlotAdminResultTrap, hwPortAdminResultTrap, hwDevAntiTheftLockTraps, hwDevAntiTheftUnAuthTraps, hwDevAntiTheftUnAuthResumeTraps, hwDevAntiTheftLockedTraps, hwDevAntiTheftLockedResumeTraps
 *
 * Mapping rules:
 *   node       = trap source IP (rawEvent.sourceIp)
 *   alertGroup/summary/severity/type = per-trap rule overrides
 */

import com.dujitech.cep.model.AlarmEvent
import com.dujitech.cep.model.EventType
import com.dujitech.cep.model.Severity

// ===== Trap OID -> definition mapping =====
// Key: fully resolved numeric OID, Value: [name, fields, fieldOids]
def trapMap = [:]

// ===== Name -> definition mapping (fallback for unresolved OIDs) =====
def trapNameMap = [:]

// --- hwDevBoardDetectTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.2.0.1
// Fields: hwFrameIndex, hwSlotIndex, hwSlotType, hwSlotOperStatus, hwSlotTypeName, hwSlotPrimaryStatus, hwSlotSecondaryStatus
// Description: This trap message is reported when a board is detected.
trapMap["1.3.6.1.4.1.2011.6.3.8.2.0.1"] = [
    name: "hwDevBoardDetectTrap",
    fields: ["hwFrameIndex", "hwSlotIndex", "hwSlotType", "hwSlotOperStatus", "hwSlotTypeName", "hwSlotPrimaryStatus", "hwSlotSecondaryStatus"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwSlotIndex": "1.3.6.1.4.1.2011.6.3.3.2.1.1", "hwSlotType": "1.3.6.1.4.1.2011.6.3.3.2.1.2", "hwSlotOperStatus": "1.3.6.1.4.1.2011.6.3.3.2.1.8", "hwSlotTypeName": "1.3.6.1.4.1.2011.6.3.3.2.1.21", "hwSlotPrimaryStatus": "1.3.6.1.4.1.2011.6.3.3.2.1.22", "hwSlotSecondaryStatus": "1.3.6.1.4.1.2011.6.3.3.2.1.23"]
]

// --- hwDevBoardDisappearedTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.2.0.2
// Fields: hwFrameIndex, hwSlotIndex, hwSlotType, hwSlotTypeName
// Description: This trap message is reported when a board disappears.
trapMap["1.3.6.1.4.1.2011.6.3.8.2.0.2"] = [
    name: "hwDevBoardDisappearedTrap",
    fields: ["hwFrameIndex", "hwSlotIndex", "hwSlotType", "hwSlotTypeName"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwSlotIndex": "1.3.6.1.4.1.2011.6.3.3.2.1.1", "hwSlotType": "1.3.6.1.4.1.2011.6.3.3.2.1.2", "hwSlotTypeName": "1.3.6.1.4.1.2011.6.3.3.2.1.21"]
]

// --- hwDevBoardStateChangedTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.2.0.3
// Fields: hwFrameIndex, hwSlotIndex, hwSlotType, hwSlotOperStatus, hwSlotPrimaryStatus, hwSlotSecondaryStatus
// Description: This trap message is reported when a board's state changes.
trapMap["1.3.6.1.4.1.2011.6.3.8.2.0.3"] = [
    name: "hwDevBoardStateChangedTrap",
    fields: ["hwFrameIndex", "hwSlotIndex", "hwSlotType", "hwSlotOperStatus", "hwSlotPrimaryStatus", "hwSlotSecondaryStatus"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwSlotIndex": "1.3.6.1.4.1.2011.6.3.3.2.1.1", "hwSlotType": "1.3.6.1.4.1.2011.6.3.3.2.1.2", "hwSlotOperStatus": "1.3.6.1.4.1.2011.6.3.3.2.1.8", "hwSlotPrimaryStatus": "1.3.6.1.4.1.2011.6.3.3.2.1.22", "hwSlotSecondaryStatus": "1.3.6.1.4.1.2011.6.3.3.2.1.23"]
]

// --- hwDevBoardStaChgOffLineTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.2.0.4
// Fields: hwFrameIndex, hwSlotIndex, hwSlotType, hwSlotOperStatus, hwSlotPrimaryStatus, hwSlotSecondaryStatus
// Description: This trap message is reported when a board's state changes from online to offline.
trapMap["1.3.6.1.4.1.2011.6.3.8.2.0.4"] = [
    name: "hwDevBoardStaChgOffLineTrap",
    fields: ["hwFrameIndex", "hwSlotIndex", "hwSlotType", "hwSlotOperStatus", "hwSlotPrimaryStatus", "hwSlotSecondaryStatus"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwSlotIndex": "1.3.6.1.4.1.2011.6.3.3.2.1.1", "hwSlotType": "1.3.6.1.4.1.2011.6.3.3.2.1.2", "hwSlotOperStatus": "1.3.6.1.4.1.2011.6.3.3.2.1.8", "hwSlotPrimaryStatus": "1.3.6.1.4.1.2011.6.3.3.2.1.22", "hwSlotSecondaryStatus": "1.3.6.1.4.1.2011.6.3.3.2.1.23"]
]

// --- hwDevBoardAutoLoadTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.2.0.5
// Fields: hwFrameIndex, hwSlotIndex, hwSlotType, hwSlotOperStatus, hwSlotTypeName
// Description: This trap message is reported when a board starts to autoload.
trapMap["1.3.6.1.4.1.2011.6.3.8.2.0.5"] = [
    name: "hwDevBoardAutoLoadTrap",
    fields: ["hwFrameIndex", "hwSlotIndex", "hwSlotType", "hwSlotOperStatus", "hwSlotTypeName"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwSlotIndex": "1.3.6.1.4.1.2011.6.3.3.2.1.1", "hwSlotType": "1.3.6.1.4.1.2011.6.3.3.2.1.2", "hwSlotOperStatus": "1.3.6.1.4.1.2011.6.3.3.2.1.8", "hwSlotTypeName": "1.3.6.1.4.1.2011.6.3.3.2.1.21"]
]

// --- hwDevUserlabelChangeTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.2.0.6
// Fields: hwConfigChangeIP, hwDevUserLabelType, hwDevUserLabel, hwFrameIndex, hwSlotIndex, hwSubslotIndex, hwPortIndex, hwDevVPI, hwDevVCI, hwDevVlanId
// Description: This trap message is reported when a board's userlabel changes. The binding parameters hwDevVPI, hwDevVCI and hwDevVlanId are reserved and have no actual meaning.
trapMap["1.3.6.1.4.1.2011.6.3.8.2.0.6"] = [
    name: "hwDevUserlabelChangeTrap",
    fields: ["hwConfigChangeIP", "hwDevUserLabelType", "hwDevUserLabel", "hwFrameIndex", "hwSlotIndex", "hwSubslotIndex", "hwPortIndex", "hwDevVPI", "hwDevVCI", "hwDevVlanId"],
    fieldOids: ["hwConfigChangeIP": "1.3.6.1.4.1.2011.6.3.8.1.5", "hwDevUserLabelType": "1.3.6.1.4.1.2011.6.3.8.1.6", "hwDevUserLabel": "1.3.6.1.4.1.2011.6.3.8.1.7", "hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwSlotIndex": "1.3.6.1.4.1.2011.6.3.3.2.1.1", "hwSubslotIndex": "1.3.6.1.4.1.2011.6.3.3.3.1.1", "hwPortIndex": "1.3.6.1.4.1.2011.6.3.3.4.1.1", "hwDevVPI": "1.3.6.1.4.1.2011.6.3.8.1.8", "hwDevVCI": "1.3.6.1.4.1.2011.6.3.8.1.9", "hwDevVlanId": "1.3.6.1.4.1.2011.6.3.8.1.10"]
]

// --- hwDevSystemStateChangeTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.2.0.7
// Fields: hwSystemPrimaryStatus
// Description: This trap message is reported when the system state changes.
trapMap["1.3.6.1.4.1.2011.6.3.8.2.0.7"] = [
    name: "hwDevSystemStateChangeTrap",
    fields: ["hwSystemPrimaryStatus"],
    fieldOids: ["hwSystemPrimaryStatus": "1.3.6.1.4.1.2011.6.3.1.23"]
]

// --- hwDevFrameDetectTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.2.0.8
// Fields: hwFrameIndex, hwFrameType, hwFrameExtendPort, hwFrameUplinkPort, hwFrameOperStatus, hwFrameTypeName
// Description: This trap message is reported when a frame is detected.
trapMap["1.3.6.1.4.1.2011.6.3.8.2.0.8"] = [
    name: "hwDevFrameDetectTrap",
    fields: ["hwFrameIndex", "hwFrameType", "hwFrameExtendPort", "hwFrameUplinkPort", "hwFrameOperStatus", "hwFrameTypeName"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwFrameType": "1.3.6.1.4.1.2011.6.3.3.1.1.2", "hwFrameExtendPort": "1.3.6.1.4.1.2011.6.3.3.1.1.13", "hwFrameUplinkPort": "1.3.6.1.4.1.2011.6.3.3.1.1.14", "hwFrameOperStatus": "1.3.6.1.4.1.2011.6.3.3.1.1.5", "hwFrameTypeName": "1.3.6.1.4.1.2011.6.3.3.1.1.12"]
]

// --- hwDevFrameDisappearedTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.2.0.9
// Fields: hwFrameIndex, hwFrameType, hwFrameExtendPort, hwFrameUplinkPort, hwFrameTypeName
// Description: This trap message is reported when a frame disappears.
trapMap["1.3.6.1.4.1.2011.6.3.8.2.0.9"] = [
    name: "hwDevFrameDisappearedTrap",
    fields: ["hwFrameIndex", "hwFrameType", "hwFrameExtendPort", "hwFrameUplinkPort", "hwFrameTypeName"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwFrameType": "1.3.6.1.4.1.2011.6.3.3.1.1.2", "hwFrameExtendPort": "1.3.6.1.4.1.2011.6.3.3.1.1.13", "hwFrameUplinkPort": "1.3.6.1.4.1.2011.6.3.3.1.1.14", "hwFrameTypeName": "1.3.6.1.4.1.2011.6.3.3.1.1.12"]
]

// --- hwDevFrameStateChangeTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.2.0.10
// Fields: hwFrameIndex, hwFrameType, hwFrameOperStatus, hwFrameExtendPort, hwFrameUplinkPort
// Description: This trap message is reported when a frame's state changes.
trapMap["1.3.6.1.4.1.2011.6.3.8.2.0.10"] = [
    name: "hwDevFrameStateChangeTrap",
    fields: ["hwFrameIndex", "hwFrameType", "hwFrameOperStatus", "hwFrameExtendPort", "hwFrameUplinkPort"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwFrameType": "1.3.6.1.4.1.2011.6.3.3.1.1.2", "hwFrameOperStatus": "1.3.6.1.4.1.2011.6.3.3.1.1.5", "hwFrameExtendPort": "1.3.6.1.4.1.2011.6.3.3.1.1.13", "hwFrameUplinkPort": "1.3.6.1.4.1.2011.6.3.3.1.1.14"]
]

// --- hwDevExtendedFramePortChangeTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.2.0.11
// Fields: hwFrameIndex, hwFrameType, hwFrameUplinkPort, hwExtendedFrameUplinkPort
// Description: This trap message is reported when a extended frame's uplink port changes.
trapMap["1.3.6.1.4.1.2011.6.3.8.2.0.11"] = [
    name: "hwDevExtendedFramePortChangeTrap",
    fields: ["hwFrameIndex", "hwFrameType", "hwFrameUplinkPort", "hwExtendedFrameUplinkPort"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwFrameType": "1.3.6.1.4.1.2011.6.3.3.1.1.2", "hwFrameUplinkPort": "1.3.6.1.4.1.2011.6.3.3.1.1.14", "hwExtendedFrameUplinkPort": "1.3.6.1.4.1.2011.6.3.8.1.24"]
]

// --- hwDevSnmpProbeRecordTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.2.0.12
// Fields: hwDevSnmpHostIpAddress, hwDevSnmpLastReceivedTime, hwDevSnmpAverageInterval, hwDevSnmpMinimumInterval, hwDevSnmpMaxmumInterval, hwDevSnmpReceivedCount
// Description: This trap message is reported when the abnormal record of SNMP probe monitor occurs.
trapMap["1.3.6.1.4.1.2011.6.3.8.2.0.12"] = [
    name: "hwDevSnmpProbeRecordTrap",
    fields: ["hwDevSnmpHostIpAddress", "hwDevSnmpLastReceivedTime", "hwDevSnmpAverageInterval", "hwDevSnmpMinimumInterval", "hwDevSnmpMaxmumInterval", "hwDevSnmpReceivedCount"],
    fieldOids: ["hwDevSnmpHostIpAddress": "1.3.6.1.4.1.2011.6.3.8.1.42", "hwDevSnmpLastReceivedTime": "1.3.6.1.4.1.2011.6.3.8.1.43", "hwDevSnmpAverageInterval": "1.3.6.1.4.1.2011.6.3.8.1.44", "hwDevSnmpMinimumInterval": "1.3.6.1.4.1.2011.6.3.8.1.45", "hwDevSnmpMaxmumInterval": "1.3.6.1.4.1.2011.6.3.8.1.46", "hwDevSnmpReceivedCount": "1.3.6.1.4.1.2011.6.3.8.1.47"]
]

// --- hwDevStackFrameStateChangeTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.2.0.13
// Fields: hwFrameIndex, hwFrameType, hwFrameOperStatus
// Description: This trap message is reported when a frame's state changes.
trapMap["1.3.6.1.4.1.2011.6.3.8.2.0.13"] = [
    name: "hwDevStackFrameStateChangeTrap",
    fields: ["hwFrameIndex", "hwFrameType", "hwFrameOperStatus"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwFrameType": "1.3.6.1.4.1.2011.6.3.3.1.1.2", "hwFrameOperStatus": "1.3.6.1.4.1.2011.6.3.3.1.1.5"]
]

// --- hwDevSystemDataSynCancelTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.1.0.2
// Fields: hwFrameIndex, hwSlotIndex, hwSlotIndex
// Description: This trap message is reported when the data synchronization between the active and standby control boards is canceled. The first hwSlotIndex indicates active main board index, the second hwSlotIndex i...
trapMap["1.3.6.1.4.1.2011.6.3.8.3.1.0.2"] = [
    name: "hwDevSystemDataSynCancelTrap",
    fields: ["hwFrameIndex", "hwSlotIndex", "hwSlotIndex"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwSlotIndex": "1.3.6.1.4.1.2011.6.3.3.2.1.1"]
]

// --- hwDevActiveStandbyContolBoardInconsistentTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.1.0.3
// Fields: hwSlotTypeName, hwDevStandbyMainSlotTypeName
// Description: This trap message is reported when the active control board type is inconsistent with standby ctrol board type.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.1.0.3"] = [
    name: "hwDevActiveStandbyContolBoardInconsistentTrap",
    fields: ["hwSlotTypeName", "hwDevStandbyMainSlotTypeName"],
    fieldOids: ["hwSlotTypeName": "1.3.6.1.4.1.2011.6.3.3.2.1.21", "hwDevStandbyMainSlotTypeName": "1.3.6.1.4.1.2011.6.3.8.1.19"]
]

// --- hwDevActiveStandbyDataSynCancelTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.1.0.5
// Fields: hwFrameIndex, hwSlotIndex, hwSlotIndex
// Description: This trap message is reported when the data synchronization between the active and standby control boards is canceled. The first hwSlotIndex indicates active main board index, the second hwSlotIndex i...
trapMap["1.3.6.1.4.1.2011.6.3.8.3.1.0.5"] = [
    name: "hwDevActiveStandbyDataSynCancelTrap",
    fields: ["hwFrameIndex", "hwSlotIndex", "hwSlotIndex"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwSlotIndex": "1.3.6.1.4.1.2011.6.3.3.2.1.1"]
]

// --- hwDevActiveStandbyDataSynCancelRecoverTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.1.0.6
// Fields: hwFrameIndex, hwSlotIndex, hwSlotIndex
// Description: This trap message is reported when the data synchronization between the active and standby control boards recovers. The first hwSlotIndex indicates active main board index, the second hwSlotIndex indi...
trapMap["1.3.6.1.4.1.2011.6.3.8.3.1.0.6"] = [
    name: "hwDevActiveStandbyDataSynCancelRecoverTrap",
    fields: ["hwFrameIndex", "hwSlotIndex", "hwSlotIndex"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwSlotIndex": "1.3.6.1.4.1.2011.6.3.3.2.1.1"]
]

// --- hwDevSystemPoweroffTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.1.0.7
// Description: This trap message is reported when the device is cut off.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.1.0.7"] = [
    name: "hwDevSystemPoweroffTrap",
    fields: [],
    fieldOids: []
]

// --- hwDevSystemAutoDeployFailTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.1.0.8
// Fields: hwDevAutoDeployPhase
// Description: This trap message is reported when the auto-deployment fails.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.1.0.8"] = [
    name: "hwDevSystemAutoDeployFailTrap",
    fields: ["hwDevAutoDeployPhase"],
    fieldOids: ["hwDevAutoDeployPhase": "1.3.6.1.4.1.2011.6.3.8.1.31"]
]

// --- hwDevSystemDeviceNameChangeTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.1.0.9
// Description: This trap message is reported when the device name is changed.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.1.0.9"] = [
    name: "hwDevSystemDeviceNameChangeTrap",
    fields: [],
    fieldOids: []
]

// --- hwDevFrameTypeInconsistentTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.2.0.1
// Fields: hwFrameIndex, hwFrameType, hwFrameTypeConfigured
// Description: This trap message is reported when the actual shelf type is inconsistent with the configuration in the database of device. In this case, the configuration data delivery fails.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.2.0.1"] = [
    name: "hwDevFrameTypeInconsistentTrap",
    fields: ["hwFrameIndex", "hwFrameType", "hwFrameTypeConfigured"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwFrameType": "1.3.6.1.4.1.2011.6.3.3.1.1.2", "hwFrameTypeConfigured": "1.3.6.1.4.1.2011.6.3.8.1.11"]
]

// --- hwDevFrameRestoreTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.2.0.2
// Fields: hwFrameIndex, hwFrameTypeName, hwExtendBoardFrameIndex, hwExtendBoardSlotIndex, hwExtendBoardPortIndex
// Description: This trap message is reported when the communication of the frame restored.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.2.0.2"] = [
    name: "hwDevFrameRestoreTrap",
    fields: ["hwFrameIndex", "hwFrameTypeName", "hwExtendBoardFrameIndex", "hwExtendBoardSlotIndex", "hwExtendBoardPortIndex"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwFrameTypeName": "1.3.6.1.4.1.2011.6.3.3.1.1.12", "hwExtendBoardFrameIndex": "1.3.6.1.4.1.2011.6.3.8.1.23", "hwExtendBoardSlotIndex": "1.3.6.1.4.1.2011.6.3.8.1.25", "hwExtendBoardPortIndex": "1.3.6.1.4.1.2011.6.3.8.1.26"]
]

// --- hwDevFrameFaultTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.2.0.3
// Fields: hwFrameIndex, hwFrameTypeName, hwExtendBoardFrameIndex, hwExtendBoardSlotIndex, hwExtendBoardPortIndex
// Description: This trap message is reported when the communication of the frame interrupted, the services in the frame fail.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.2.0.3"] = [
    name: "hwDevFrameFaultTrap",
    fields: ["hwFrameIndex", "hwFrameTypeName", "hwExtendBoardFrameIndex", "hwExtendBoardSlotIndex", "hwExtendBoardPortIndex"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwFrameTypeName": "1.3.6.1.4.1.2011.6.3.3.1.1.12", "hwExtendBoardFrameIndex": "1.3.6.1.4.1.2011.6.3.8.1.23", "hwExtendBoardSlotIndex": "1.3.6.1.4.1.2011.6.3.8.1.25", "hwExtendBoardPortIndex": "1.3.6.1.4.1.2011.6.3.8.1.26"]
]

// --- hwDevExtendedFrameTypeInconsistentTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.2.0.4
// Fields: hwFrameIndex, hwFrameTypeConfigured, hwFrameType, hwExtendBoardFrameIndex, hwExtendBoardSlotIndex, hwExtendBoardPortIndex
// Description: This trap message is reported when the actual shelf type is inconsistent with the configuration in the database of device. In this case, the configuration data delivery fails.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.2.0.4"] = [
    name: "hwDevExtendedFrameTypeInconsistentTrap",
    fields: ["hwFrameIndex", "hwFrameTypeConfigured", "hwFrameType", "hwExtendBoardFrameIndex", "hwExtendBoardSlotIndex", "hwExtendBoardPortIndex"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwFrameTypeConfigured": "1.3.6.1.4.1.2011.6.3.8.1.11", "hwFrameType": "1.3.6.1.4.1.2011.6.3.3.1.1.2", "hwExtendBoardFrameIndex": "1.3.6.1.4.1.2011.6.3.8.1.23", "hwExtendBoardSlotIndex": "1.3.6.1.4.1.2011.6.3.8.1.25", "hwExtendBoardPortIndex": "1.3.6.1.4.1.2011.6.3.8.1.26"]
]

// --- hwDevExtendedFrameDyingGaspAlarmTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.2.0.5
// Fields: hwFrameIndex, hwFrameTypeName, hwExtendBoardFrameIndex, hwExtendBoardSlotIndex, hwExtendBoardPortIndex
// Description: This trap message is reported when the dying-gasp of the extended frame occurs.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.2.0.5"] = [
    name: "hwDevExtendedFrameDyingGaspAlarmTrap",
    fields: ["hwFrameIndex", "hwFrameTypeName", "hwExtendBoardFrameIndex", "hwExtendBoardSlotIndex", "hwExtendBoardPortIndex"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwFrameTypeName": "1.3.6.1.4.1.2011.6.3.3.1.1.12", "hwExtendBoardFrameIndex": "1.3.6.1.4.1.2011.6.3.8.1.23", "hwExtendBoardSlotIndex": "1.3.6.1.4.1.2011.6.3.8.1.25", "hwExtendBoardPortIndex": "1.3.6.1.4.1.2011.6.3.8.1.26"]
]

// --- hwDevExtendedFrameDyingGaspRestoreTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.2.0.6
// Fields: hwFrameIndex, hwFrameTypeName, hwExtendBoardFrameIndex, hwExtendBoardSlotIndex, hwExtendBoardPortIndex
// Description: This trap message is reported when the dying-gasp of the extended frame recovers.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.2.0.6"] = [
    name: "hwDevExtendedFrameDyingGaspRestoreTrap",
    fields: ["hwFrameIndex", "hwFrameTypeName", "hwExtendBoardFrameIndex", "hwExtendBoardSlotIndex", "hwExtendBoardPortIndex"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwFrameTypeName": "1.3.6.1.4.1.2011.6.3.3.1.1.12", "hwExtendBoardFrameIndex": "1.3.6.1.4.1.2011.6.3.8.1.23", "hwExtendBoardSlotIndex": "1.3.6.1.4.1.2011.6.3.8.1.25", "hwExtendBoardPortIndex": "1.3.6.1.4.1.2011.6.3.8.1.26"]
]

// --- hwDevFrameIdOverLoadTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.2.0.7
// Fields: hwFrameTypeName, hwExtendBoardFrameIndex, hwExtendBoardSlotIndex, hwExtendBoardPortIndex
// Description: This trap message is reported when the frame ID exceeded the maximal number.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.2.0.7"] = [
    name: "hwDevFrameIdOverLoadTrap",
    fields: ["hwFrameTypeName", "hwExtendBoardFrameIndex", "hwExtendBoardSlotIndex", "hwExtendBoardPortIndex"],
    fieldOids: ["hwFrameTypeName": "1.3.6.1.4.1.2011.6.3.3.1.1.12", "hwExtendBoardFrameIndex": "1.3.6.1.4.1.2011.6.3.8.1.23", "hwExtendBoardSlotIndex": "1.3.6.1.4.1.2011.6.3.8.1.25", "hwExtendBoardPortIndex": "1.3.6.1.4.1.2011.6.3.8.1.26"]
]

// --- hwDevFrameCmtsAntitheftAuthFailTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.2.0.8
// Fields: hwFrameIndex, hwFrameTypeName, hwExtendBoardFrameIndex, hwExtendBoardSlotIndex, hwExtendBoardPortIndex
// Description: This trap message is reported when the anti-theft authentication of the extended frame fails.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.2.0.8"] = [
    name: "hwDevFrameCmtsAntitheftAuthFailTrap",
    fields: ["hwFrameIndex", "hwFrameTypeName", "hwExtendBoardFrameIndex", "hwExtendBoardSlotIndex", "hwExtendBoardPortIndex"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwFrameTypeName": "1.3.6.1.4.1.2011.6.3.3.1.1.12", "hwExtendBoardFrameIndex": "1.3.6.1.4.1.2011.6.3.8.1.23", "hwExtendBoardSlotIndex": "1.3.6.1.4.1.2011.6.3.8.1.25", "hwExtendBoardPortIndex": "1.3.6.1.4.1.2011.6.3.8.1.26"]
]

// --- hwDevFrameCmtsAntitheftAuthRestoreTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.2.0.9
// Fields: hwFrameIndex, hwFrameTypeName, hwExtendBoardFrameIndex, hwExtendBoardSlotIndex, hwExtendBoardPortIndex
// Description: This trap message is reported when the anti-theft authentication of the extended frame succeeds.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.2.0.9"] = [
    name: "hwDevFrameCmtsAntitheftAuthRestoreTrap",
    fields: ["hwFrameIndex", "hwFrameTypeName", "hwExtendBoardFrameIndex", "hwExtendBoardSlotIndex", "hwExtendBoardPortIndex"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwFrameTypeName": "1.3.6.1.4.1.2011.6.3.3.1.1.12", "hwExtendBoardFrameIndex": "1.3.6.1.4.1.2011.6.3.8.1.23", "hwExtendBoardSlotIndex": "1.3.6.1.4.1.2011.6.3.8.1.25", "hwExtendBoardPortIndex": "1.3.6.1.4.1.2011.6.3.8.1.26"]
]

// --- hwVccDataLinkFault (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.2.0.10
// Fields: hwVccLocalChassisId, hwVccNeighbourChassisId, hwVccGroupId, hwVccLinkIfPhysicIndex, hwVccLinkIfPhysicName
// Description: This object indicates that when the data link goes Down, the device sends a trap.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.2.0.10"] = [
    name: "hwVccDataLinkFault",
    fields: ["hwVccLocalChassisId", "hwVccNeighbourChassisId", "hwVccGroupId", "hwVccLinkIfPhysicIndex", "hwVccLinkIfPhysicName"],
    fieldOids: ["hwVccLocalChassisId": "1.3.6.1.4.1.2011.6.3.8.1.32", "hwVccNeighbourChassisId": "1.3.6.1.4.1.2011.6.3.8.1.33", "hwVccGroupId": "1.3.6.1.4.1.2011.6.3.8.1.34", "hwVccLinkIfPhysicIndex": "1.3.6.1.4.1.2011.6.3.8.1.35", "hwVccLinkIfPhysicName": "1.3.6.1.4.1.2011.6.3.8.1.36"]
]

// --- hwVccDataLinkFaultResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.2.0.11
// Fields: hwVccLocalChassisId, hwVccNeighbourChassisId, hwVccGroupId, hwVccLinkIfPhysicIndex, hwVccLinkIfPhysicName
// Description: This object indicates that when the data link goes Up, the device sends a trap.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.2.0.11"] = [
    name: "hwVccDataLinkFaultResume",
    fields: ["hwVccLocalChassisId", "hwVccNeighbourChassisId", "hwVccGroupId", "hwVccLinkIfPhysicIndex", "hwVccLinkIfPhysicName"],
    fieldOids: ["hwVccLocalChassisId": "1.3.6.1.4.1.2011.6.3.8.1.32", "hwVccNeighbourChassisId": "1.3.6.1.4.1.2011.6.3.8.1.33", "hwVccGroupId": "1.3.6.1.4.1.2011.6.3.8.1.34", "hwVccLinkIfPhysicIndex": "1.3.6.1.4.1.2011.6.3.8.1.35", "hwVccLinkIfPhysicName": "1.3.6.1.4.1.2011.6.3.8.1.36"]
]

// --- hwVccDataChannelFault (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.2.0.12
// Fields: hwVccLocalChassisId, hwVccNeighbourChassisId, hwVccGroupId
// Description: This object indicates that when the data channel is down, the device sends a trap.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.2.0.12"] = [
    name: "hwVccDataChannelFault",
    fields: ["hwVccLocalChassisId", "hwVccNeighbourChassisId", "hwVccGroupId"],
    fieldOids: ["hwVccLocalChassisId": "1.3.6.1.4.1.2011.6.3.8.1.32", "hwVccNeighbourChassisId": "1.3.6.1.4.1.2011.6.3.8.1.33", "hwVccGroupId": "1.3.6.1.4.1.2011.6.3.8.1.34"]
]

// --- hwVccDataChannelFaultResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.2.0.13
// Fields: hwVccLocalChassisId, hwVccNeighbourChassisId, hwVccGroupId
// Description: This object indicates that when the data channel goes Up, the device sends a trap.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.2.0.13"] = [
    name: "hwVccDataChannelFaultResume",
    fields: ["hwVccLocalChassisId", "hwVccNeighbourChassisId", "hwVccGroupId"],
    fieldOids: ["hwVccLocalChassisId": "1.3.6.1.4.1.2011.6.3.8.1.32", "hwVccNeighbourChassisId": "1.3.6.1.4.1.2011.6.3.8.1.33", "hwVccGroupId": "1.3.6.1.4.1.2011.6.3.8.1.34"]
]

// --- hwDevStackFrameFaultTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.2.0.20
// Fields: hwFrameIndex, hwFrameTypeName
// Description: This trap message is reported when the communication of the frame interrupted, the services in the frame fail.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.2.0.20"] = [
    name: "hwDevStackFrameFaultTrap",
    fields: ["hwFrameIndex", "hwFrameTypeName"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwFrameTypeName": "1.3.6.1.4.1.2011.6.3.3.1.1.12"]
]

// --- hwDevStackFrameRestoreTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.2.0.21
// Fields: hwFrameIndex, hwFrameTypeName
// Description: This trap message is reported when the communication of the frame restored.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.2.0.21"] = [
    name: "hwDevStackFrameRestoreTrap",
    fields: ["hwFrameIndex", "hwFrameTypeName"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwFrameTypeName": "1.3.6.1.4.1.2011.6.3.3.1.1.12"]
]

// --- hwDevStandbyFrameTypeInconsistentTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.2.0.22
// Fields: hwFrameIndex, hwFrameTypeName, hwRegisterFrameTypeName
// Description: This trap message is reported when the standby frame type is inconsistent with the active frame.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.2.0.22"] = [
    name: "hwDevStandbyFrameTypeInconsistentTrap",
    fields: ["hwFrameIndex", "hwFrameTypeName", "hwRegisterFrameTypeName"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwFrameTypeName": "1.3.6.1.4.1.2011.6.3.3.1.1.12", "hwRegisterFrameTypeName": "1.3.6.1.4.1.2011.6.3.8.1.59"]
]

// --- hwDeviceHighTemperatureMinorFaultTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.2.0.14
// Fields: hwFrameIndex, hwDeviceCurrentTemp, hwDevTempMinorAlmThreshold
// Description: This trap message is reported when the device temperature exceeds the level-1 high temperature alarm threshold.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.2.0.14"] = [
    name: "hwDeviceHighTemperatureMinorFaultTrap",
    fields: ["hwFrameIndex", "hwDeviceCurrentTemp", "hwDevTempMinorAlmThreshold"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwDeviceCurrentTemp": "1.3.6.1.4.1.2011.6.3.8.1.41", "hwDevTempMinorAlmThreshold": "1.3.6.1.4.1.2011.6.3.8.1.38"]
]

// --- hwDeviceHighTemperatureMinorRestoreTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.2.0.15
// Fields: hwFrameIndex, hwDeviceCurrentTemp, hwDevTempMinorAlmThreshold
// Description: This trap message is reported when the device temperature exceeds the threshold for level-1 high temperature alarm recovery.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.2.0.15"] = [
    name: "hwDeviceHighTemperatureMinorRestoreTrap",
    fields: ["hwFrameIndex", "hwDeviceCurrentTemp", "hwDevTempMinorAlmThreshold"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwDeviceCurrentTemp": "1.3.6.1.4.1.2011.6.3.8.1.41", "hwDevTempMinorAlmThreshold": "1.3.6.1.4.1.2011.6.3.8.1.38"]
]

// --- hwDeviceHighTemperatureMajorFaultTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.2.0.16
// Fields: hwFrameIndex, hwDeviceCurrentTemp, hwDevTempMajorAlmThreshold
// Description: This trap message is reported when the device temperature exceeds the level-2 high temperature alarm threshold.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.2.0.16"] = [
    name: "hwDeviceHighTemperatureMajorFaultTrap",
    fields: ["hwFrameIndex", "hwDeviceCurrentTemp", "hwDevTempMajorAlmThreshold"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwDeviceCurrentTemp": "1.3.6.1.4.1.2011.6.3.8.1.41", "hwDevTempMajorAlmThreshold": "1.3.6.1.4.1.2011.6.3.8.1.39"]
]

// --- hwDeviceHighTemperatureMajorRestoreTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.2.0.17
// Fields: hwFrameIndex, hwDeviceCurrentTemp, hwDevTempMajorAlmThreshold
// Description: This trap message is reported when the device temperature exceeds the threshold for level-2 high temperature alarm recovery.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.2.0.17"] = [
    name: "hwDeviceHighTemperatureMajorRestoreTrap",
    fields: ["hwFrameIndex", "hwDeviceCurrentTemp", "hwDevTempMajorAlmThreshold"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwDeviceCurrentTemp": "1.3.6.1.4.1.2011.6.3.8.1.41", "hwDevTempMajorAlmThreshold": "1.3.6.1.4.1.2011.6.3.8.1.39"]
]

// --- hwDeviceHighTemperatureCriticalFaultTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.2.0.18
// Fields: hwFrameIndex, hwDeviceCurrentTemp, hwDevTempCriticalAlmThreshold
// Description: This trap message is reported when the device temperature exceeds the level-3 high temperature alarm threshold.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.2.0.18"] = [
    name: "hwDeviceHighTemperatureCriticalFaultTrap",
    fields: ["hwFrameIndex", "hwDeviceCurrentTemp", "hwDevTempCriticalAlmThreshold"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwDeviceCurrentTemp": "1.3.6.1.4.1.2011.6.3.8.1.41", "hwDevTempCriticalAlmThreshold": "1.3.6.1.4.1.2011.6.3.8.1.40"]
]

// --- hwDeviceHighTemperatureCriticalRestoreTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.2.0.19
// Fields: hwFrameIndex, hwDeviceCurrentTemp, hwDevTempCriticalAlmThreshold
// Description: This trap message is reported when the device temperature exceeds the threshold for level-3 high temperature alarm recovery.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.2.0.19"] = [
    name: "hwDeviceHighTemperatureCriticalRestoreTrap",
    fields: ["hwFrameIndex", "hwDeviceCurrentTemp", "hwDevTempCriticalAlmThreshold"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwDeviceCurrentTemp": "1.3.6.1.4.1.2011.6.3.8.1.41", "hwDevTempCriticalAlmThreshold": "1.3.6.1.4.1.2011.6.3.8.1.40"]
]

// --- hwFwdChannelFault (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.2.0.23
// Fields: hwFrameIndex, hwSlotIndex, hwSubslotIndex, hwCheckType
// Description: This trap message is reported when the forwarding channel detected fault.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.2.0.23"] = [
    name: "hwFwdChannelFault",
    fields: ["hwFrameIndex", "hwSlotIndex", "hwSubslotIndex", "hwCheckType"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwSlotIndex": "1.3.6.1.4.1.2011.6.3.3.2.1.1", "hwSubslotIndex": "1.3.6.1.4.1.2011.6.3.3.3.1.1", "hwCheckType": "1.3.6.1.4.1.2011.6.3.8.1.60"]
]

// --- hwFwdChannelFaultResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.2.0.24
// Fields: hwFrameIndex, hwSlotIndex, hwSubslotIndex, hwCheckType
// Description: This trap message is reported when the forwarding channel fault recovery.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.2.0.24"] = [
    name: "hwFwdChannelFaultResume",
    fields: ["hwFrameIndex", "hwSlotIndex", "hwSubslotIndex", "hwCheckType"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwSlotIndex": "1.3.6.1.4.1.2011.6.3.3.2.1.1", "hwSubslotIndex": "1.3.6.1.4.1.2011.6.3.3.3.1.1", "hwCheckType": "1.3.6.1.4.1.2011.6.3.8.1.60"]
]

// --- hwDevTlsCertifyFailTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.2.0.26
// Fields: hwFrameIndex, hwFrameTypeName
// Description: This trap message is reported when the tls certify failed.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.2.0.26"] = [
    name: "hwDevTlsCertifyFailTrap",
    fields: ["hwFrameIndex", "hwFrameTypeName"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwFrameTypeName": "1.3.6.1.4.1.2011.6.3.3.1.1.12"]
]

// --- hwDevTlsCertifyRestoreTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.2.0.27
// Fields: hwFrameIndex, hwFrameTypeName
// Description: This trap message is reported when the tls certify recovered.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.2.0.27"] = [
    name: "hwDevTlsCertifyRestoreTrap",
    fields: ["hwFrameIndex", "hwFrameTypeName"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwFrameTypeName": "1.3.6.1.4.1.2011.6.3.3.1.1.12"]
]

// --- hwDevExtendedFrameRestoreTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.2.0.28
// Fields: hwFrameIndex, hwFrameTypeName, hwFramePhySerialNum
// Description: This trap message is reported when the communication of the frame restored.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.2.0.28"] = [
    name: "hwDevExtendedFrameRestoreTrap",
    fields: ["hwFrameIndex", "hwFrameTypeName", "hwFramePhySerialNum"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwFrameTypeName": "1.3.6.1.4.1.2011.6.3.3.1.1.12", "hwFramePhySerialNum": "1.3.6.1.4.1.2011.6.3.3.1.1.20"]
]

// --- hwDevExtendedFrameFaultTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.2.0.29
// Fields: hwFrameIndex, hwFrameTypeName, hwFramePhySerialNum
// Description: This trap message is reported when the communication between the slave frame and the master frame is abnormal, the services in the slave frame fail.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.2.0.29"] = [
    name: "hwDevExtendedFrameFaultTrap",
    fields: ["hwFrameIndex", "hwFrameTypeName", "hwFramePhySerialNum"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwFrameTypeName": "1.3.6.1.4.1.2011.6.3.3.1.1.12", "hwFramePhySerialNum": "1.3.6.1.4.1.2011.6.3.3.1.1.20"]
]

// --- hwDevFramePacketLossFaultTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.2.0.30
// Fields: hwFrameIndex
// Description: This trap message is reported when the packet loss occurs on the device.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.2.0.30"] = [
    name: "hwDevFramePacketLossFaultTrap",
    fields: ["hwFrameIndex"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1"]
]

// --- hwDevFramePacketLossRestoreTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.2.0.31
// Fields: hwFrameIndex
// Description: This trap message is reported when the packet loss on the device recovers.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.2.0.31"] = [
    name: "hwDevFramePacketLossRestoreTrap",
    fields: ["hwFrameIndex"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1"]
]

// --- hwDevFrameDustAccumulationRiskFaultTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.2.0.32
// Fields: hwFrameIndex, hwSlotLists
// Description: This trap message is reported when there are vacant slots in the frame that are not installed with boards.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.2.0.32"] = [
    name: "hwDevFrameDustAccumulationRiskFaultTrap",
    fields: ["hwFrameIndex", "hwSlotLists"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwSlotLists": "1.3.6.1.4.1.2011.6.3.8.1.66"]
]

// --- hwDevFrameDustAccumulationRiskRestoreTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.2.0.33
// Fields: hwFrameIndex, hwSlotLists
// Description: This trap message is reported when there are no vacant slots in the frame that are not installed with boards.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.2.0.33"] = [
    name: "hwDevFrameDustAccumulationRiskRestoreTrap",
    fields: ["hwFrameIndex", "hwSlotLists"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwSlotLists": "1.3.6.1.4.1.2011.6.3.8.1.66"]
]

// --- hwDevBoardMisMatchTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.3.0.1
// Fields: hwFrameIndex, hwSlotIndex, hwSlotTypeName, hwActualSlotTypeName
// Description: This trap message is reported when the type of the board that the user configured is inconsistent with the type of the board that is actually inserted.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.3.0.1"] = [
    name: "hwDevBoardMisMatchTrap",
    fields: ["hwFrameIndex", "hwSlotIndex", "hwSlotTypeName", "hwActualSlotTypeName"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwSlotIndex": "1.3.6.1.4.1.2011.6.3.3.2.1.1", "hwSlotTypeName": "1.3.6.1.4.1.2011.6.3.3.2.1.21", "hwActualSlotTypeName": "1.3.6.1.4.1.2011.6.3.8.1.12"]
]

// --- hwDevBoardFaultTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.3.0.3
// Fields: hwFrameIndex, hwSlotIndex, hwSlotTypeName
// Description: This trap message is reported when the communication of the board interrupted, the services in the board fail.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.3.0.3"] = [
    name: "hwDevBoardFaultTrap",
    fields: ["hwFrameIndex", "hwSlotIndex", "hwSlotTypeName"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwSlotIndex": "1.3.6.1.4.1.2011.6.3.3.2.1.1", "hwSlotTypeName": "1.3.6.1.4.1.2011.6.3.3.2.1.21"]
]

// --- hwDevBoardRestoreTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.3.0.4
// Fields: hwFrameIndex, hwSlotIndex, hwSlotTypeName
// Description: This trap message is reported when the communication of the board restored.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.3.0.4"] = [
    name: "hwDevBoardRestoreTrap",
    fields: ["hwFrameIndex", "hwSlotIndex", "hwSlotTypeName"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwSlotIndex": "1.3.6.1.4.1.2011.6.3.3.2.1.1", "hwSlotTypeName": "1.3.6.1.4.1.2011.6.3.3.2.1.21"]
]

// --- hwDevBoardReplacedTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.3.0.5
// Fields: hwFrameIndex, hwSlotIndex, hwDevPreSlotTypeName, hwSlotTypeName, hwDevPreSlotPhySerialNum, hwSlotPhySerialNum
// Description: This trap message is reported when the board is successfully replaced by another board of the same type.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.3.0.5"] = [
    name: "hwDevBoardReplacedTrap",
    fields: ["hwFrameIndex", "hwSlotIndex", "hwDevPreSlotTypeName", "hwSlotTypeName", "hwDevPreSlotPhySerialNum", "hwSlotPhySerialNum"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwSlotIndex": "1.3.6.1.4.1.2011.6.3.3.2.1.1", "hwDevPreSlotTypeName": "1.3.6.1.4.1.2011.6.3.8.1.20.1.1", "hwSlotTypeName": "1.3.6.1.4.1.2011.6.3.3.2.1.21", "hwDevPreSlotPhySerialNum": "1.3.6.1.4.1.2011.6.3.8.1.20.1.2", "hwSlotPhySerialNum": "1.3.6.1.4.1.2011.6.3.3.2.1.11"]
]

// --- hwDevBoardEnterTemperatureProctectModeTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.3.0.6
// Fields: hwFrameIndex, hwSlotIndex, hwSlotTemperature
// Description: This trap message is reported when the temperature of active control board is too high, all the LAN switch ports of the service board will be powered off except GIU board.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.3.0.6"] = [
    name: "hwDevBoardEnterTemperatureProctectModeTrap",
    fields: ["hwFrameIndex", "hwSlotIndex", "hwSlotTemperature"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwSlotIndex": "1.3.6.1.4.1.2011.6.3.3.2.1.1", "hwSlotTemperature": "1.3.6.1.4.1.2011.6.3.3.2.1.13"]
]

// --- hwDevBoardExitTemperatureProctectModeTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.3.0.7
// Fields: hwFrameIndex, hwSlotIndex, hwSlotTemperature
// Description: This trap message is reported when the temperature of active control board recovers to safe region from high temperature risk region, all the LAN switch ports of the service board will be powered on.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.3.0.7"] = [
    name: "hwDevBoardExitTemperatureProctectModeTrap",
    fields: ["hwFrameIndex", "hwSlotIndex", "hwSlotTemperature"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwSlotIndex": "1.3.6.1.4.1.2011.6.3.3.2.1.1", "hwSlotTemperature": "1.3.6.1.4.1.2011.6.3.3.2.1.13"]
]

// --- hwDevBoardTemperatureTooHighTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.3.0.8
// Fields: hwFrameIndex, hwSlotIndex, hwSlotTemperature
// Description: This trap message is reported when the current temperature of service board exceed the high temperature threshold.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.3.0.8"] = [
    name: "hwDevBoardTemperatureTooHighTrap",
    fields: ["hwFrameIndex", "hwSlotIndex", "hwSlotTemperature"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwSlotIndex": "1.3.6.1.4.1.2011.6.3.3.2.1.1", "hwSlotTemperature": "1.3.6.1.4.1.2011.6.3.3.2.1.13"]
]

// --- hwDevBoardTemperatureTooHighRecoverTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.3.0.9
// Fields: hwFrameIndex, hwSlotIndex, hwSlotTemperature
// Description: This trap message is reported when the current temperature of service board recovers to the normal range from high temperature.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.3.0.9"] = [
    name: "hwDevBoardTemperatureTooHighRecoverTrap",
    fields: ["hwFrameIndex", "hwSlotIndex", "hwSlotTemperature"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwSlotIndex": "1.3.6.1.4.1.2011.6.3.3.2.1.1", "hwSlotTemperature": "1.3.6.1.4.1.2011.6.3.3.2.1.13"]
]

// --- hwDevBoardTemperatureTooLowTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.3.0.10
// Fields: hwFrameIndex, hwSlotIndex, hwSlotTemperature
// Description: This trap message is reported when the current temperature of service board is exceed the low temperature threshold.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.3.0.10"] = [
    name: "hwDevBoardTemperatureTooLowTrap",
    fields: ["hwFrameIndex", "hwSlotIndex", "hwSlotTemperature"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwSlotIndex": "1.3.6.1.4.1.2011.6.3.3.2.1.1", "hwSlotTemperature": "1.3.6.1.4.1.2011.6.3.3.2.1.13"]
]

// --- hwDevBoardTemperatureTooLowRecoverTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.3.0.11
// Fields: hwFrameIndex, hwSlotIndex, hwSlotTemperature
// Description: This trap message is reported when the current temperature of service board recovers to normal range from low temperature.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.3.0.11"] = [
    name: "hwDevBoardTemperatureTooLowRecoverTrap",
    fields: ["hwFrameIndex", "hwSlotIndex", "hwSlotTemperature"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwSlotIndex": "1.3.6.1.4.1.2011.6.3.3.2.1.1", "hwSlotTemperature": "1.3.6.1.4.1.2011.6.3.3.2.1.13"]
]

// --- hwDevPowerInputFaultTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.3.0.12
// Fields: hwFrameIndex, hwSlotIndex
// Description: This trap message is reported when the power input of the local shelf fails.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.3.0.12"] = [
    name: "hwDevPowerInputFaultTrap",
    fields: ["hwFrameIndex", "hwSlotIndex"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwSlotIndex": "1.3.6.1.4.1.2011.6.3.3.2.1.1"]
]

// --- hwDevPowerInputRecoverTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.3.0.13
// Fields: hwFrameIndex, hwSlotIndex
// Description: This trap message is reported when the power input of the local shelf Recovers.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.3.0.13"] = [
    name: "hwDevPowerInputRecoverTrap",
    fields: ["hwFrameIndex", "hwSlotIndex"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwSlotIndex": "1.3.6.1.4.1.2011.6.3.3.2.1.1"]
]

// --- hwDevBoardOnlineStateTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.3.0.14
// Fields: hwFrameIndex, hwSlotIndex, hwSlotType, hwSlotOperStatus
// Description: This trap message is reported when the state of the board is online.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.3.0.14"] = [
    name: "hwDevBoardOnlineStateTrap",
    fields: ["hwFrameIndex", "hwSlotIndex", "hwSlotType", "hwSlotOperStatus"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwSlotIndex": "1.3.6.1.4.1.2011.6.3.3.2.1.1", "hwSlotType": "1.3.6.1.4.1.2011.6.3.3.2.1.2", "hwSlotOperStatus": "1.3.6.1.4.1.2011.6.3.3.2.1.8"]
]

// --- hwDevBoardPower5VFaultTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.3.0.16
// Fields: hwFrameIndex, hwSlotIndex, hwSlotTypeName
// Description: This trap message is reported when the inner power of the board is abnormal.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.3.0.16"] = [
    name: "hwDevBoardPower5VFaultTrap",
    fields: ["hwFrameIndex", "hwSlotIndex", "hwSlotTypeName"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwSlotIndex": "1.3.6.1.4.1.2011.6.3.3.2.1.1", "hwSlotTypeName": "1.3.6.1.4.1.2011.6.3.3.2.1.21"]
]

// --- hwDevBoardPower5VResumeTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.3.0.17
// Fields: hwFrameIndex, hwSlotIndex, hwSlotTypeName
// Description: This trap message is reported when the inner power of the board resumes.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.3.0.17"] = [
    name: "hwDevBoardPower5VResumeTrap",
    fields: ["hwFrameIndex", "hwSlotIndex", "hwSlotTypeName"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwSlotIndex": "1.3.6.1.4.1.2011.6.3.3.2.1.1", "hwSlotTypeName": "1.3.6.1.4.1.2011.6.3.3.2.1.21"]
]

// --- hwDevStorageFaultTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.3.0.18
// Fields: hwFrameIndex, hwSlotIndex, hwTrapStorageName
// Description: This trap message is reported when the certain storage is hardware fault or software fault.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.3.0.18"] = [
    name: "hwDevStorageFaultTrap",
    fields: ["hwFrameIndex", "hwSlotIndex", "hwTrapStorageName"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwSlotIndex": "1.3.6.1.4.1.2011.6.3.3.2.1.1", "hwTrapStorageName": "1.3.6.1.4.1.2011.6.3.8.1.22"]
]

// --- hwDevStorageFaultRestoreTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.3.0.21
// Fields: hwFrameIndex, hwSlotIndex, hwTrapStorageName
// Description: This trap message is reported when the certain storage is hardware fault or software fault recovers.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.3.0.21"] = [
    name: "hwDevStorageFaultRestoreTrap",
    fields: ["hwFrameIndex", "hwSlotIndex", "hwTrapStorageName"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwSlotIndex": "1.3.6.1.4.1.2011.6.3.3.2.1.1", "hwTrapStorageName": "1.3.6.1.4.1.2011.6.3.8.1.22"]
]

// --- hwFtpConfigureTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.3.0.22
// Fields: hwSysVersion
// Description: This trap message is reported when the board need automatic expand.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.3.0.22"] = [
    name: "hwFtpConfigureTrap",
    fields: ["hwSysVersion"],
    fieldOids: ["hwSysVersion": "1.3.6.1.4.1.2011.6.3.1.3"]
]

// --- hwDevBoardAutomaticExpandFailTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.3.0.23
// Fields: hwFrameIndex, hwSlotIndex
// Description: This trap message is reported when the board automatic expand fail.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.3.0.23"] = [
    name: "hwDevBoardAutomaticExpandFailTrap",
    fields: ["hwFrameIndex", "hwSlotIndex"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwSlotIndex": "1.3.6.1.4.1.2011.6.3.3.2.1.1"]
]

// --- hwDevBoardAutomaticExpandRestoreTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.3.0.24
// Fields: hwFrameIndex, hwSlotIndex
// Description: This trap message is reported when the board automatic expand fail recovers.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.3.0.24"] = [
    name: "hwDevBoardAutomaticExpandRestoreTrap",
    fields: ["hwFrameIndex", "hwSlotIndex"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwSlotIndex": "1.3.6.1.4.1.2011.6.3.3.2.1.1"]
]

// --- hwDevBoardInputFaultTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.3.0.26
// Fields: hwFrameIndex, hwSlotIndex, hwSlotInputIdIndex, hwSlotInputType, hwPowerSupplyDescription
// Description: This trap message is reported when the input voltage of a line cannot be detected.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.3.0.26"] = [
    name: "hwDevBoardInputFaultTrap",
    fields: ["hwFrameIndex", "hwSlotIndex", "hwSlotInputIdIndex", "hwSlotInputType", "hwPowerSupplyDescription"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwSlotIndex": "1.3.6.1.4.1.2011.6.3.3.2.1.1", "hwSlotInputIdIndex": "1.3.6.1.4.1.2011.6.3.8.1.29", "hwSlotInputType": "1.3.6.1.4.1.2011.6.3.8.1.30", "hwPowerSupplyDescription": "1.3.6.1.4.1.2011.6.3.8.1.50"]
]

// --- hwDevBoardInputRecoverTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.3.0.27
// Fields: hwFrameIndex, hwSlotIndex, hwSlotInputIdIndex, hwSlotInputType, hwPowerSupplyDescription
// Description: This trap message is reported when detected power unit singals recover.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.3.0.27"] = [
    name: "hwDevBoardInputRecoverTrap",
    fields: ["hwFrameIndex", "hwSlotIndex", "hwSlotInputIdIndex", "hwSlotInputType", "hwPowerSupplyDescription"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwSlotIndex": "1.3.6.1.4.1.2011.6.3.3.2.1.1", "hwSlotInputIdIndex": "1.3.6.1.4.1.2011.6.3.8.1.29", "hwSlotInputType": "1.3.6.1.4.1.2011.6.3.8.1.30", "hwPowerSupplyDescription": "1.3.6.1.4.1.2011.6.3.8.1.50"]
]

// --- hwDevPowerLackVoltageFaultTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.3.0.28
// Fields: hwFrameIndex, hwSlotInputIdIndex, hwPowerSupplyChannelVoltage, hwPowerSupplyDescription
// Description: This trap message is reported when remote power supply input is under-voltage.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.3.0.28"] = [
    name: "hwDevPowerLackVoltageFaultTrap",
    fields: ["hwFrameIndex", "hwSlotInputIdIndex", "hwPowerSupplyChannelVoltage", "hwPowerSupplyDescription"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwSlotInputIdIndex": "1.3.6.1.4.1.2011.6.3.8.1.29", "hwPowerSupplyChannelVoltage": "1.3.6.1.4.1.2011.6.3.8.1.49", "hwPowerSupplyDescription": "1.3.6.1.4.1.2011.6.3.8.1.50"]
]

// --- hwDevPowerLackVolitageRecoverTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.3.0.29
// Fields: hwFrameIndex, hwSlotInputIdIndex, hwPowerSupplyChannelVoltage, hwPowerSupplyDescription
// Description: This trap message is reported when voltage in the subrack recovers.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.3.0.29"] = [
    name: "hwDevPowerLackVolitageRecoverTrap",
    fields: ["hwFrameIndex", "hwSlotInputIdIndex", "hwPowerSupplyChannelVoltage", "hwPowerSupplyDescription"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwSlotInputIdIndex": "1.3.6.1.4.1.2011.6.3.8.1.29", "hwPowerSupplyChannelVoltage": "1.3.6.1.4.1.2011.6.3.8.1.49", "hwPowerSupplyDescription": "1.3.6.1.4.1.2011.6.3.8.1.50"]
]

// --- hwDevBoardReplaceFailTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.3.0.30
// Fields: hwFrameIndex, hwSlotIndex, hwSlotTypeName, hwActualSlotTypeName
// Description: This trap message is reported when the original board failed to replace with a new board.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.3.0.30"] = [
    name: "hwDevBoardReplaceFailTrap",
    fields: ["hwFrameIndex", "hwSlotIndex", "hwSlotTypeName", "hwActualSlotTypeName"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwSlotIndex": "1.3.6.1.4.1.2011.6.3.3.2.1.1", "hwSlotTypeName": "1.3.6.1.4.1.2011.6.3.3.2.1.21", "hwActualSlotTypeName": "1.3.6.1.4.1.2011.6.3.8.1.12"]
]

// --- hwDevPowerPortInputFaultTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.3.0.31
// Fields: hwFrameIndex, hwSlotIndex, hwTrapPowerPortIndex
// Description: This trap message is reported when the power input of the local shelf fails.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.3.0.31"] = [
    name: "hwDevPowerPortInputFaultTrap",
    fields: ["hwFrameIndex", "hwSlotIndex", "hwTrapPowerPortIndex"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwSlotIndex": "1.3.6.1.4.1.2011.6.3.3.2.1.1", "hwTrapPowerPortIndex": "1.3.6.1.4.1.2011.6.3.8.1.37"]
]

// --- hwDevPowerPortInputRecoverTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.3.0.32
// Fields: hwFrameIndex, hwSlotIndex, hwTrapPowerPortIndex
// Description: This trap message is reported when the power input of the local shelf Recovers.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.3.0.32"] = [
    name: "hwDevPowerPortInputRecoverTrap",
    fields: ["hwFrameIndex", "hwSlotIndex", "hwTrapPowerPortIndex"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwSlotIndex": "1.3.6.1.4.1.2011.6.3.3.2.1.1", "hwTrapPowerPortIndex": "1.3.6.1.4.1.2011.6.3.8.1.37"]
]

// --- hwDevPowerPortInputUnderVolFaultTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.3.0.33
// Fields: hwFrameIndex, hwSlotIndex, hwTrapPowerPortIndex
// Description: This trap message is reported when the input power of the subrack is undervoltage.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.3.0.33"] = [
    name: "hwDevPowerPortInputUnderVolFaultTrap",
    fields: ["hwFrameIndex", "hwSlotIndex", "hwTrapPowerPortIndex"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwSlotIndex": "1.3.6.1.4.1.2011.6.3.3.2.1.1", "hwTrapPowerPortIndex": "1.3.6.1.4.1.2011.6.3.8.1.37"]
]

// --- hwDevPowerPortInputUnderVolRecoverTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.3.0.34
// Fields: hwFrameIndex, hwSlotIndex, hwTrapPowerPortIndex
// Description: This trap message is reported when the undervoltage power input of the subrack recovers.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.3.0.34"] = [
    name: "hwDevPowerPortInputUnderVolRecoverTrap",
    fields: ["hwFrameIndex", "hwSlotIndex", "hwTrapPowerPortIndex"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwSlotIndex": "1.3.6.1.4.1.2011.6.3.3.2.1.1", "hwTrapPowerPortIndex": "1.3.6.1.4.1.2011.6.3.8.1.37"]
]

// --- hwDevImportantFileBrokenTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.3.0.35
// Fields: hwFrameIndex, hwSlotIndex, hwBrokenFileName
// Description: This trap message is reported when the important file is broken.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.3.0.35"] = [
    name: "hwDevImportantFileBrokenTrap",
    fields: ["hwFrameIndex", "hwSlotIndex", "hwBrokenFileName"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwSlotIndex": "1.3.6.1.4.1.2011.6.3.3.2.1.1", "hwBrokenFileName": "1.3.6.1.4.1.2011.6.3.8.1.51"]
]

// --- hwDevImportantFileBrokenRestoreTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.3.0.36
// Fields: hwFrameIndex, hwSlotIndex, hwBrokenFileName
// Description: This trap message is reported when the important file is recovery.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.3.0.36"] = [
    name: "hwDevImportantFileBrokenRestoreTrap",
    fields: ["hwFrameIndex", "hwSlotIndex", "hwBrokenFileName"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwSlotIndex": "1.3.6.1.4.1.2011.6.3.3.2.1.1", "hwBrokenFileName": "1.3.6.1.4.1.2011.6.3.8.1.51"]
]

// --- hwDevRtuLicCapacityExceedFaultTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.3.0.37
// Fields: hwFrameIndex, hwSlotIndex, hwRtuRunCapacity, hwRtuLicenseCapcity
// Description: This trap message is reported when the running Rtu capacity exceed the license resource.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.3.0.37"] = [
    name: "hwDevRtuLicCapacityExceedFaultTrap",
    fields: ["hwFrameIndex", "hwSlotIndex", "hwRtuRunCapacity", "hwRtuLicenseCapcity"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwSlotIndex": "1.3.6.1.4.1.2011.6.3.3.2.1.1", "hwRtuRunCapacity": "1.3.6.1.4.1.2011.6.3.8.1.52", "hwRtuLicenseCapcity": "1.3.6.1.4.1.2011.6.3.8.1.53"]
]

// --- hwDevRtuLicCapacityExceedRestoreTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.3.0.38
// Fields: hwFrameIndex, hwSlotIndex, hwRtuRunCapacity, hwRtuLicenseCapcity
// Description: This trap message is reported when the running Rtu capacity restore to the same the license resource.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.3.0.38"] = [
    name: "hwDevRtuLicCapacityExceedRestoreTrap",
    fields: ["hwFrameIndex", "hwSlotIndex", "hwRtuRunCapacity", "hwRtuLicenseCapcity"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwSlotIndex": "1.3.6.1.4.1.2011.6.3.3.2.1.1", "hwRtuRunCapacity": "1.3.6.1.4.1.2011.6.3.8.1.52", "hwRtuLicenseCapcity": "1.3.6.1.4.1.2011.6.3.8.1.53"]
]

// --- hwDevExBiosPasswordFaultTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.3.0.39
// Fields: hwFrameIndex, hwSlotIndex
// Description: This trap message is reported when the extended BIOS password is not set.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.3.0.39"] = [
    name: "hwDevExBiosPasswordFaultTrap",
    fields: ["hwFrameIndex", "hwSlotIndex"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwSlotIndex": "1.3.6.1.4.1.2011.6.3.3.2.1.1"]
]

// --- hwDevExBiosPasswordRecoverTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.3.0.40
// Fields: hwFrameIndex, hwSlotIndex
// Description: This trap message is reported when the extended BIOS password is set.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.3.0.40"] = [
    name: "hwDevExBiosPasswordRecoverTrap",
    fields: ["hwFrameIndex", "hwSlotIndex"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwSlotIndex": "1.3.6.1.4.1.2011.6.3.3.2.1.1"]
]

// --- hwDevLoadLowerVersionTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.3.0.41
// Fields: hwFrameIndex, hwSlotIndex, hwVersionName
// Description: This trap message is reported when load the lower version package.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.3.0.41"] = [
    name: "hwDevLoadLowerVersionTrap",
    fields: ["hwFrameIndex", "hwSlotIndex", "hwVersionName"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwSlotIndex": "1.3.6.1.4.1.2011.6.3.3.2.1.1", "hwVersionName": "1.3.6.1.4.1.2011.6.3.8.1.56"]
]

// --- hwDevPowerOverThresholdFaultTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.3.0.42
// Fields: hwFrameIndex, hwPowerThreshold, hwRemainingPowerSupplyCapability
// Description: This trap message is reported when the maximum power consumption of the current system exceeds the maximum power supply capability threshold.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.3.0.42"] = [
    name: "hwDevPowerOverThresholdFaultTrap",
    fields: ["hwFrameIndex", "hwPowerThreshold", "hwRemainingPowerSupplyCapability"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwPowerThreshold": "1.3.6.1.4.1.2011.6.3.8.1.57", "hwRemainingPowerSupplyCapability": "1.3.6.1.4.1.2011.6.3.8.1.58"]
]

// --- hwDevPowerOverThresholdRestoreTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.3.0.43
// Fields: hwFrameIndex, hwPowerThreshold, hwRemainingPowerSupplyCapability
// Description: This trap message is reported when the maximum power consumption of the current system is cleared from the threshold of the maximum power supply capability.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.3.0.43"] = [
    name: "hwDevPowerOverThresholdRestoreTrap",
    fields: ["hwFrameIndex", "hwPowerThreshold", "hwRemainingPowerSupplyCapability"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwPowerThreshold": "1.3.6.1.4.1.2011.6.3.8.1.57", "hwRemainingPowerSupplyCapability": "1.3.6.1.4.1.2011.6.3.8.1.58"]
]

// --- hwDevBoardIsolatedTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.3.0.44
// Fields: hwFrameIndex, hwSlotIndex, hwSlotTypeName
// Description: This trap message is reported when the board is isolated.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.3.0.44"] = [
    name: "hwDevBoardIsolatedTrap",
    fields: ["hwFrameIndex", "hwSlotIndex", "hwSlotTypeName"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwSlotIndex": "1.3.6.1.4.1.2011.6.3.3.2.1.1", "hwSlotTypeName": "1.3.6.1.4.1.2011.6.3.3.2.1.21"]
]

// --- hwDevBoardIsolatedRecoverTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.3.0.45
// Fields: hwFrameIndex, hwSlotIndex, hwSlotTypeName
// Description: This trap message is reported when the isolation of board recovered.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.3.0.45"] = [
    name: "hwDevBoardIsolatedRecoverTrap",
    fields: ["hwFrameIndex", "hwSlotIndex", "hwSlotTypeName"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwSlotIndex": "1.3.6.1.4.1.2011.6.3.3.2.1.1", "hwSlotTypeName": "1.3.6.1.4.1.2011.6.3.3.2.1.21"]
]

// --- hwDevSeIsolatedTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.3.0.46
// Fields: hwFrameIndex, hwSlotIndex
// Description: This trap message is reported when the se is isolated.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.3.0.46"] = [
    name: "hwDevSeIsolatedTrap",
    fields: ["hwFrameIndex", "hwSlotIndex"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwSlotIndex": "1.3.6.1.4.1.2011.6.3.3.2.1.1"]
]

// --- hwDevSeIsolatedTrapRestore (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.3.0.47
// Fields: hwFrameIndex, hwSlotIndex
// Description: This trap message is reported when the isolation of se recovered.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.3.0.47"] = [
    name: "hwDevSeIsolatedTrapRestore",
    fields: ["hwFrameIndex", "hwSlotIndex"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwSlotIndex": "1.3.6.1.4.1.2011.6.3.3.2.1.1"]
]

// --- hwDevVoiceFileLZMATrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.3.0.48
// Fields: hwFrameIndex, hwSlotIndex
// Description: This trap message is reported when the voice file format does not match the current version.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.3.0.48"] = [
    name: "hwDevVoiceFileLZMATrap",
    fields: ["hwFrameIndex", "hwSlotIndex"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwSlotIndex": "1.3.6.1.4.1.2011.6.3.3.2.1.1"]
]

// --- hwDevFileIntegrityCheckFailedTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.3.0.49
// Fields: hwFrameIndex, hwSlotIndex, hwDevIntegrityCheckFileType
// Description: This trap message is reported when the file integrity check failed.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.3.0.49"] = [
    name: "hwDevFileIntegrityCheckFailedTrap",
    fields: ["hwFrameIndex", "hwSlotIndex", "hwDevIntegrityCheckFileType"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwSlotIndex": "1.3.6.1.4.1.2011.6.3.3.2.1.1", "hwDevIntegrityCheckFileType": "1.3.6.1.4.1.2011.6.3.8.1.61"]
]

// --- hwDevFileIntegrityCheckSuccessTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.3.0.50
// Fields: hwFrameIndex, hwSlotIndex, hwDevIntegrityCheckFileType
// Description: This trap message is reported when the file integrity check success.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.3.0.50"] = [
    name: "hwDevFileIntegrityCheckSuccessTrap",
    fields: ["hwFrameIndex", "hwSlotIndex", "hwDevIntegrityCheckFileType"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwSlotIndex": "1.3.6.1.4.1.2011.6.3.3.2.1.1", "hwDevIntegrityCheckFileType": "1.3.6.1.4.1.2011.6.3.8.1.61"]
]

// --- hwDevBoardAddConfigReplaceSuccessTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.3.0.51
// Fields: hwFrameIndex, hwSlotIndex, hwConfigBoardName, hwBasicBoardName
// Description: This trap message is reported when the board add config replace success.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.3.0.51"] = [
    name: "hwDevBoardAddConfigReplaceSuccessTrap",
    fields: ["hwFrameIndex", "hwSlotIndex", "hwConfigBoardName", "hwBasicBoardName"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwSlotIndex": "1.3.6.1.4.1.2011.6.3.3.2.1.1", "hwConfigBoardName": "1.3.6.1.4.1.2011.6.3.3.2.1.28", "hwBasicBoardName": "1.3.6.1.4.1.2011.6.3.3.2.1.29"]
]

// --- hwDevBoardAddConfigReplaceFailTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.3.0.52
// Fields: hwFrameIndex, hwSlotIndex, hwConfigBoardName, hwBasicBoardName
// Description: This trap message is reported when the board add config replace fail.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.3.0.52"] = [
    name: "hwDevBoardAddConfigReplaceFailTrap",
    fields: ["hwFrameIndex", "hwSlotIndex", "hwConfigBoardName", "hwBasicBoardName"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwSlotIndex": "1.3.6.1.4.1.2011.6.3.3.2.1.1", "hwConfigBoardName": "1.3.6.1.4.1.2011.6.3.3.2.1.28", "hwBasicBoardName": "1.3.6.1.4.1.2011.6.3.3.2.1.29"]
]

// --- hwUnauthDistributionFaultTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.3.0.55
// Fields: hwFrameIndex, hwSlotIndex
// Description: This trap message is reported when the device is not authorized.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.3.0.55"] = [
    name: "hwUnauthDistributionFaultTrap",
    fields: ["hwFrameIndex", "hwSlotIndex"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwSlotIndex": "1.3.6.1.4.1.2011.6.3.3.2.1.1"]
]

// --- hwUnauthDistributionRestoreTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.3.0.56
// Fields: hwFrameIndex, hwSlotIndex
// Description: This trap message is reported when The device unauthorized alarms cleared.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.3.0.56"] = [
    name: "hwUnauthDistributionRestoreTrap",
    fields: ["hwFrameIndex", "hwSlotIndex"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwSlotIndex": "1.3.6.1.4.1.2011.6.3.3.2.1.1"]
]

// --- hwDevPowerPortInputOverVolFaultTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.3.0.57
// Fields: hwFrameIndex, hwSlotIndex, hwTrapPowerPortIndex
// Description: This trap message is reported when the input power of the subrack is overvoltage.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.3.0.57"] = [
    name: "hwDevPowerPortInputOverVolFaultTrap",
    fields: ["hwFrameIndex", "hwSlotIndex", "hwTrapPowerPortIndex"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwSlotIndex": "1.3.6.1.4.1.2011.6.3.3.2.1.1", "hwTrapPowerPortIndex": "1.3.6.1.4.1.2011.6.3.8.1.37"]
]

// --- hwDevPowerPortInputOverVolRecoverTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.3.0.58
// Fields: hwFrameIndex, hwSlotIndex, hwTrapPowerPortIndex
// Description: This trap message is reported when the overvoltage power input of the subrack recovers.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.3.0.58"] = [
    name: "hwDevPowerPortInputOverVolRecoverTrap",
    fields: ["hwFrameIndex", "hwSlotIndex", "hwTrapPowerPortIndex"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwSlotIndex": "1.3.6.1.4.1.2011.6.3.3.2.1.1", "hwTrapPowerPortIndex": "1.3.6.1.4.1.2011.6.3.8.1.37"]
]

// --- hwClkInputSignalNotMatchConfigurationTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.3.0.59
// Fields: hwFrameIndex, hwSlotIndex
// Description: The input signal does not match the clock configuration.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.3.0.59"] = [
    name: "hwClkInputSignalNotMatchConfigurationTrap",
    fields: ["hwFrameIndex", "hwSlotIndex"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwSlotIndex": "1.3.6.1.4.1.2011.6.3.3.2.1.1"]
]

// --- hwClkInputSignalRecoverMatchConfigurationTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.3.0.60
// Fields: hwFrameIndex, hwSlotIndex
// Description: The input signal is consistent with the clock configuration.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.3.0.60"] = [
    name: "hwClkInputSignalRecoverMatchConfigurationTrap",
    fields: ["hwFrameIndex", "hwSlotIndex"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwSlotIndex": "1.3.6.1.4.1.2011.6.3.3.2.1.1"]
]

// --- hwDevUbifsFaultTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.3.0.61
// Fields: hwFrameIndex, hwSlotIndex
// Description: This trap message is reported when the file system is damaged.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.3.0.61"] = [
    name: "hwDevUbifsFaultTrap",
    fields: ["hwFrameIndex", "hwSlotIndex"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwSlotIndex": "1.3.6.1.4.1.2011.6.3.3.2.1.1"]
]

// --- hwDevUbifsRestoreTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.3.0.62
// Fields: hwFrameIndex, hwSlotIndex
// Description: This trap message is reported when the file system is recovery.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.3.0.62"] = [
    name: "hwDevUbifsRestoreTrap",
    fields: ["hwFrameIndex", "hwSlotIndex"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwSlotIndex": "1.3.6.1.4.1.2011.6.3.3.2.1.1"]
]

// --- hwDevBoardHotResetTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.3.0.63
// Fields: hwFrameIndex, hwSlotIndex, hwSlotTypeName
// Description: This trap message is reported when the board is hot reset during an ISSU upgrade.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.3.0.63"] = [
    name: "hwDevBoardHotResetTrap",
    fields: ["hwFrameIndex", "hwSlotIndex", "hwSlotTypeName"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwSlotIndex": "1.3.6.1.4.1.2011.6.3.3.2.1.1", "hwSlotTypeName": "1.3.6.1.4.1.2011.6.3.3.2.1.21"]
]

// --- hwDevMemFragmentationExcessiveFaultTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.3.0.64
// Fields: hwFrameIndex, hwSlotIndex
// Description: This trap message is reported when there are excessive memory fragmentation on the board.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.3.0.64"] = [
    name: "hwDevMemFragmentationExcessiveFaultTrap",
    fields: ["hwFrameIndex", "hwSlotIndex"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwSlotIndex": "1.3.6.1.4.1.2011.6.3.3.2.1.1"]
]

// --- hwDevMemFragmentationExcessiveRestoreTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.3.0.65
// Fields: hwFrameIndex, hwSlotIndex
// Description: This trap message is reported when the memory fragmentation recovery on the board.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.3.0.65"] = [
    name: "hwDevMemFragmentationExcessiveRestoreTrap",
    fields: ["hwFrameIndex", "hwSlotIndex"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwSlotIndex": "1.3.6.1.4.1.2011.6.3.3.2.1.1"]
]

// --- hwDevBoardSoftWareMisMatchTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.3.0.66
// Fields: hwFrameIndex, hwSlotIndex, hwActualSlotTypeName
// Description: This trap message is reported when the configured board software does not match the current product.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.3.0.66"] = [
    name: "hwDevBoardSoftWareMisMatchTrap",
    fields: ["hwFrameIndex", "hwSlotIndex", "hwActualSlotTypeName"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwSlotIndex": "1.3.6.1.4.1.2011.6.3.3.2.1.1", "hwActualSlotTypeName": "1.3.6.1.4.1.2011.6.3.8.1.12"]
]

// --- hwDevPowerBoardCapInconsistencyFaultTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.3.0.68
// Fields: hwFrameIndex, hwSlotIndex
// Description: This trap message is reported when the power supply capabilities of the power boards are inconsistent.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.3.0.68"] = [
    name: "hwDevPowerBoardCapInconsistencyFaultTrap",
    fields: ["hwFrameIndex", "hwSlotIndex"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwSlotIndex": "1.3.6.1.4.1.2011.6.3.3.2.1.1"]
]

// --- hwDevPowerBoardCapInconsistencyRestoreTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.3.0.69
// Fields: hwFrameIndex, hwSlotIndex
// Description: This trap message is reported when the power supply capabilities of the power boards are consistent.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.3.0.69"] = [
    name: "hwDevPowerBoardCapInconsistencyRestoreTrap",
    fields: ["hwFrameIndex", "hwSlotIndex"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwSlotIndex": "1.3.6.1.4.1.2011.6.3.3.2.1.1"]
]

// --- hwDevBoardCriticalHardFaultTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.3.0.72
// Fields: hwFrameIndex, hwSlotIndex, hwTrapHardFaultPara1, hwTrapHardFaultPara2, hwTrapHardFaultLocation, hwTrapHardFaultName, hwTrapHardFaultEffect
// Description: This trap message is reported when a critical board hardware exception occurs.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.3.0.72"] = [
    name: "hwDevBoardCriticalHardFaultTrap",
    fields: ["hwFrameIndex", "hwSlotIndex", "hwTrapHardFaultPara1", "hwTrapHardFaultPara2", "hwTrapHardFaultLocation", "hwTrapHardFaultName", "hwTrapHardFaultEffect"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwSlotIndex": "1.3.6.1.4.1.2011.6.3.3.2.1.1", "hwTrapHardFaultPara1": "1.3.6.1.4.1.2011.6.3.8.1.1", "hwTrapHardFaultPara2": "1.3.6.1.4.1.2011.6.3.8.1.2", "hwTrapHardFaultLocation": "1.3.6.1.4.1.2011.6.3.8.1.4", "hwTrapHardFaultName": "1.3.6.1.4.1.2011.6.3.8.1.27", "hwTrapHardFaultEffect": "1.3.6.1.4.1.2011.6.3.8.1.28"]
]

// --- hwDevBoardCriticalHardRestoreTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.3.0.73
// Fields: hwFrameIndex, hwSlotIndex, hwTrapHardFaultPara1, hwTrapHardFaultPara2, hwTrapHardFaultLocation, hwTrapHardFaultName, hwTrapHardFaultEffect
// Description: This trap message is reported when the critical board hardware abnormity recovers.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.3.0.73"] = [
    name: "hwDevBoardCriticalHardRestoreTrap",
    fields: ["hwFrameIndex", "hwSlotIndex", "hwTrapHardFaultPara1", "hwTrapHardFaultPara2", "hwTrapHardFaultLocation", "hwTrapHardFaultName", "hwTrapHardFaultEffect"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwSlotIndex": "1.3.6.1.4.1.2011.6.3.3.2.1.1", "hwTrapHardFaultPara1": "1.3.6.1.4.1.2011.6.3.8.1.1", "hwTrapHardFaultPara2": "1.3.6.1.4.1.2011.6.3.8.1.2", "hwTrapHardFaultLocation": "1.3.6.1.4.1.2011.6.3.8.1.4", "hwTrapHardFaultName": "1.3.6.1.4.1.2011.6.3.8.1.27", "hwTrapHardFaultEffect": "1.3.6.1.4.1.2011.6.3.8.1.28"]
]

// --- hwDevBoardMinorHardFaultTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.3.0.74
// Fields: hwFrameIndex, hwSlotIndex, hwTrapHardFaultPara1, hwTrapHardFaultPara2, hwTrapHardFaultLocation, hwTrapHardFaultName, hwTrapHardFaultEffect
// Description: This trap message is reported when a minor board hardware exception occurs.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.3.0.74"] = [
    name: "hwDevBoardMinorHardFaultTrap",
    fields: ["hwFrameIndex", "hwSlotIndex", "hwTrapHardFaultPara1", "hwTrapHardFaultPara2", "hwTrapHardFaultLocation", "hwTrapHardFaultName", "hwTrapHardFaultEffect"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwSlotIndex": "1.3.6.1.4.1.2011.6.3.3.2.1.1", "hwTrapHardFaultPara1": "1.3.6.1.4.1.2011.6.3.8.1.1", "hwTrapHardFaultPara2": "1.3.6.1.4.1.2011.6.3.8.1.2", "hwTrapHardFaultLocation": "1.3.6.1.4.1.2011.6.3.8.1.4", "hwTrapHardFaultName": "1.3.6.1.4.1.2011.6.3.8.1.27", "hwTrapHardFaultEffect": "1.3.6.1.4.1.2011.6.3.8.1.28"]
]

// --- hwDevBoardMinorHardRestoreTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.3.0.75
// Fields: hwFrameIndex, hwSlotIndex, hwTrapHardFaultPara1, hwTrapHardFaultPara2, hwTrapHardFaultLocation, hwTrapHardFaultName, hwTrapHardFaultEffect
// Description: This trap message is reported when the minor board hardware abnormity recovers.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.3.0.75"] = [
    name: "hwDevBoardMinorHardRestoreTrap",
    fields: ["hwFrameIndex", "hwSlotIndex", "hwTrapHardFaultPara1", "hwTrapHardFaultPara2", "hwTrapHardFaultLocation", "hwTrapHardFaultName", "hwTrapHardFaultEffect"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwSlotIndex": "1.3.6.1.4.1.2011.6.3.3.2.1.1", "hwTrapHardFaultPara1": "1.3.6.1.4.1.2011.6.3.8.1.1", "hwTrapHardFaultPara2": "1.3.6.1.4.1.2011.6.3.8.1.2", "hwTrapHardFaultLocation": "1.3.6.1.4.1.2011.6.3.8.1.4", "hwTrapHardFaultName": "1.3.6.1.4.1.2011.6.3.8.1.27", "hwTrapHardFaultEffect": "1.3.6.1.4.1.2011.6.3.8.1.28"]
]

// --- hwDevAreaPowerOverThresholdFaultTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.3.0.76
// Fields: hwFrameIndex, hwPowerSupplyAreaIndex, hwPowerThreshold, hwRemainingPowerSupplyCapability
// Description: This trap message is reported when the maximum power consumption of the current power supply area exceeds the threshold on the maximum power supply capability.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.3.0.76"] = [
    name: "hwDevAreaPowerOverThresholdFaultTrap",
    fields: ["hwFrameIndex", "hwPowerSupplyAreaIndex", "hwPowerThreshold", "hwRemainingPowerSupplyCapability"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwPowerSupplyAreaIndex": "1.3.6.1.4.1.2011.6.3.8.1.62", "hwPowerThreshold": "1.3.6.1.4.1.2011.6.3.8.1.57", "hwRemainingPowerSupplyCapability": "1.3.6.1.4.1.2011.6.3.8.1.58"]
]

// --- hwDevAreaPowerOverThresholdRestoreTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.3.0.77
// Fields: hwFrameIndex, hwPowerSupplyAreaIndex, hwPowerThreshold, hwRemainingPowerSupplyCapability
// Description: This trap message is reported when the power consumption of the current power supply area is restored to normal.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.3.0.77"] = [
    name: "hwDevAreaPowerOverThresholdRestoreTrap",
    fields: ["hwFrameIndex", "hwPowerSupplyAreaIndex", "hwPowerThreshold", "hwRemainingPowerSupplyCapability"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwPowerSupplyAreaIndex": "1.3.6.1.4.1.2011.6.3.8.1.62", "hwPowerThreshold": "1.3.6.1.4.1.2011.6.3.8.1.57", "hwRemainingPowerSupplyCapability": "1.3.6.1.4.1.2011.6.3.8.1.58"]
]

// --- hwDevRtuResOverloadFaultTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.3.0.79
// Fields: hwFrameIndex, hwSlotIndex, hwRTUName, hwConfigurationNum, hwRTUNum
// Description: This trap message is reported when RTU resource overload.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.3.0.79"] = [
    name: "hwDevRtuResOverloadFaultTrap",
    fields: ["hwFrameIndex", "hwSlotIndex", "hwRTUName", "hwConfigurationNum", "hwRTUNum"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwSlotIndex": "1.3.6.1.4.1.2011.6.3.3.2.1.1", "hwRTUName": "1.3.6.1.4.1.2011.6.3.8.1.63", "hwConfigurationNum": "1.3.6.1.4.1.2011.6.3.8.1.64", "hwRTUNum": "1.3.6.1.4.1.2011.6.3.8.1.65"]
]

// --- hwDevRtuResOverloadRestoreTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.3.0.80
// Fields: hwFrameIndex, hwSlotIndex, hwRTUName, hwConfigurationNum, hwRTUNum
// Description: This trap message is reported when RTU resource not overload.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.3.0.80"] = [
    name: "hwDevRtuResOverloadRestoreTrap",
    fields: ["hwFrameIndex", "hwSlotIndex", "hwRTUName", "hwConfigurationNum", "hwRTUNum"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwSlotIndex": "1.3.6.1.4.1.2011.6.3.3.2.1.1", "hwRTUName": "1.3.6.1.4.1.2011.6.3.8.1.63", "hwConfigurationNum": "1.3.6.1.4.1.2011.6.3.8.1.64", "hwRTUNum": "1.3.6.1.4.1.2011.6.3.8.1.65"]
]

// --- hwDevTactSwitchOpenFaultTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.3.0.81
// Fields: hwFrameIndex, hwSlotIndex, hwSwitchIndex
// Description: This trap message is reported when tact switch is open.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.3.0.81"] = [
    name: "hwDevTactSwitchOpenFaultTrap",
    fields: ["hwFrameIndex", "hwSlotIndex", "hwSwitchIndex"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwSlotIndex": "1.3.6.1.4.1.2011.6.3.3.2.1.1", "hwSwitchIndex": "1.3.6.1.4.1.2011.6.3.8.1.67"]
]

// --- hwDevTactSwitchOpenRestoreTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.3.0.82
// Fields: hwFrameIndex, hwSlotIndex, hwSwitchIndex
// Description: This trap message is reported when tact switch is closed.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.3.0.82"] = [
    name: "hwDevTactSwitchOpenRestoreTrap",
    fields: ["hwFrameIndex", "hwSlotIndex", "hwSwitchIndex"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwSlotIndex": "1.3.6.1.4.1.2011.6.3.3.2.1.1", "hwSwitchIndex": "1.3.6.1.4.1.2011.6.3.8.1.67"]
]

// --- hwDevEmergencyPartitionTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.3.0.83
// Fields: hwFrameIndex, hwSlotIndex
// Description: This trap message is reported when the system starts from the emergency flash partition.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.3.0.83"] = [
    name: "hwDevEmergencyPartitionTrap",
    fields: ["hwFrameIndex", "hwSlotIndex"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwSlotIndex": "1.3.6.1.4.1.2011.6.3.3.2.1.1"]
]

// --- hwDevEmergencyPartitionRestoreTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.3.0.84
// Fields: hwFrameIndex, hwSlotIndex
// Description: This trap message is reported when the system is restored to start from the normal flash partition.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.3.0.84"] = [
    name: "hwDevEmergencyPartitionRestoreTrap",
    fields: ["hwFrameIndex", "hwSlotIndex"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwSlotIndex": "1.3.6.1.4.1.2011.6.3.3.2.1.1"]
]

// --- hwDevSubBoardTypeInconsistentTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.4.0.1
// Fields: hwFrameIndex, hwSlotIndex
// Description: This trap message is reported when the configured daughter board type or quantity is not the same as the actual type or quantity.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.4.0.1"] = [
    name: "hwDevSubBoardTypeInconsistentTrap",
    fields: ["hwFrameIndex", "hwSlotIndex"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwSlotIndex": "1.3.6.1.4.1.2011.6.3.3.2.1.1"]
]

// --- hwDevSubBoardMisMatchTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.4.0.2
// Fields: hwFrameIndex, hwSlotIndex, hwSubslotTypeName, hwSubslotTypeName
// Description: This trap message is reported when the combination of daughter board type in main control board is not supported.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.4.0.2"] = [
    name: "hwDevSubBoardMisMatchTrap",
    fields: ["hwFrameIndex", "hwSlotIndex", "hwSubslotTypeName", "hwSubslotTypeName"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwSlotIndex": "1.3.6.1.4.1.2011.6.3.3.2.1.1", "hwSubslotTypeName": "1.3.6.1.4.1.2011.6.3.3.3.1.12"]
]

// --- hwDevSubBoardReplacedTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.4.0.3
// Fields: hwFrameIndex, hwSlotIndex, hwOldSubslotType0, hwSubslotType, hwOldSubslotType1, hwSubslotType, hwOldSubslotType2, hwSubslotType, hwOldSubslotType3, hwSubslotType
// Description: This trap message is reported when the board is successfully replaced by another board of the same type.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.4.0.3"] = [
    name: "hwDevSubBoardReplacedTrap",
    fields: ["hwFrameIndex", "hwSlotIndex", "hwOldSubslotType0", "hwSubslotType", "hwOldSubslotType1", "hwSubslotType", "hwOldSubslotType2", "hwSubslotType", "hwOldSubslotType3", "hwSubslotType"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwSlotIndex": "1.3.6.1.4.1.2011.6.3.3.2.1.1", "hwOldSubslotType0": "1.3.6.1.4.1.2011.6.3.8.1.15", "hwSubslotType": "1.3.6.1.4.1.2011.6.3.3.3.1.2", "hwOldSubslotType1": "1.3.6.1.4.1.2011.6.3.8.1.16", "hwOldSubslotType2": "1.3.6.1.4.1.2011.6.3.8.1.17", "hwOldSubslotType3": "1.3.6.1.4.1.2011.6.3.8.1.18"]
]

// --- hwDevSubBoardTemperatureTooHighTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.4.0.4
// Fields: hwFrameIndex, hwSlotIndex, hwSubboardID, hwSlotTemperature
// Description: This trap message is reported when the current temperature of service sub board exceed the high temperature threshold.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.4.0.4"] = [
    name: "hwDevSubBoardTemperatureTooHighTrap",
    fields: ["hwFrameIndex", "hwSlotIndex", "hwSubboardID", "hwSlotTemperature"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwSlotIndex": "1.3.6.1.4.1.2011.6.3.3.2.1.1", "hwSubboardID": "1.3.6.1.4.1.2011.6.3.8.1.48", "hwSlotTemperature": "1.3.6.1.4.1.2011.6.3.3.2.1.13"]
]

// --- hwDevSubBoardTemperatureTooHighRecoverTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.4.0.5
// Fields: hwFrameIndex, hwSlotIndex, hwSubboardID, hwSlotTemperature
// Description: This trap message is reported when the current temperature of service sub board recovers to the normal range from high temperature.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.4.0.5"] = [
    name: "hwDevSubBoardTemperatureTooHighRecoverTrap",
    fields: ["hwFrameIndex", "hwSlotIndex", "hwSubboardID", "hwSlotTemperature"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwSlotIndex": "1.3.6.1.4.1.2011.6.3.3.2.1.1", "hwSubboardID": "1.3.6.1.4.1.2011.6.3.8.1.48", "hwSlotTemperature": "1.3.6.1.4.1.2011.6.3.3.2.1.13"]
]

// --- hwDevSubBoardFaultTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.4.0.6
// Fields: hwFrameIndex, hwSlotIndex, hwSubboardID
// Description: This trap message is reported when the communication of the board interrupted.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.4.0.6"] = [
    name: "hwDevSubBoardFaultTrap",
    fields: ["hwFrameIndex", "hwSlotIndex", "hwSubboardID"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwSlotIndex": "1.3.6.1.4.1.2011.6.3.3.2.1.1", "hwSubboardID": "1.3.6.1.4.1.2011.6.3.8.1.48"]
]

// --- hwDevSubBoardFaultRecoverTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.4.0.7
// Fields: hwFrameIndex, hwSlotIndex, hwSubboardID
// Description: This trap message is reported when the communication of the board restored.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.4.0.7"] = [
    name: "hwDevSubBoardFaultRecoverTrap",
    fields: ["hwFrameIndex", "hwSlotIndex", "hwSubboardID"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwSlotIndex": "1.3.6.1.4.1.2011.6.3.3.2.1.1", "hwSubboardID": "1.3.6.1.4.1.2011.6.3.8.1.48"]
]

// --- hwDevSubBoardActStdInconsistentTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.4.0.8
// Fields: hwFrameIndex, hwSlotIndex, hwSubslotTypeName, hwSubslotTypeName
// Description: This trap message is reported when the subboards on the active and standby control boards are inconsistent.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.4.0.8"] = [
    name: "hwDevSubBoardActStdInconsistentTrap",
    fields: ["hwFrameIndex", "hwSlotIndex", "hwSubslotTypeName", "hwSubslotTypeName"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwSlotIndex": "1.3.6.1.4.1.2011.6.3.3.2.1.1", "hwSubslotTypeName": "1.3.6.1.4.1.2011.6.3.3.3.1.12"]
]

// --- hwDevSubBoardActStdInconsistentRestoreTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.4.0.9
// Fields: hwFrameIndex, hwSlotIndex, hwSubslotTypeName, hwSubslotTypeName
// Description: This trap message is reported when the subboards on the active and standby control boards recover consistent.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.4.0.9"] = [
    name: "hwDevSubBoardActStdInconsistentRestoreTrap",
    fields: ["hwFrameIndex", "hwSlotIndex", "hwSubslotTypeName", "hwSubslotTypeName"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwSlotIndex": "1.3.6.1.4.1.2011.6.3.3.2.1.1", "hwSubslotTypeName": "1.3.6.1.4.1.2011.6.3.3.3.1.12"]
]

// --- hwDiagResOverloadFaultTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.5.0.1
// Fields: hwResType, hwResOccupancy
// Description: This trap message is reported when the system resources usage exceeds the threshold The system resources include system CPU, system memory, system messages, and system storage.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.5.0.1"] = [
    name: "hwDiagResOverloadFaultTrap",
    fields: ["hwResType", "hwResOccupancy"],
    fieldOids: ["hwResType": "1.3.6.1.4.1.2011.6.3.17.1.1.1", "hwResOccupancy": "1.3.6.1.4.1.2011.6.3.17.1.1.3"]
]

// --- hwDiagResOverloadRestoreTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.3.5.0.2
// Fields: hwResType, hwResOccupancy
// Description: This trap message is reported when the system resources usage recovers from the overload state to the normal state.
trapMap["1.3.6.1.4.1.2011.6.3.8.3.5.0.2"] = [
    name: "hwDiagResOverloadRestoreTrap",
    fields: ["hwResType", "hwResOccupancy"],
    fieldOids: ["hwResType": "1.3.6.1.4.1.2011.6.3.17.1.1.1", "hwResOccupancy": "1.3.6.1.4.1.2011.6.3.17.1.1.3"]
]

// --- hwFrameAdminResultTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.5.0.1
// Fields: hwFrameIndex, hwFrameAdminStatus, hwTrapHardFaultPara1
// Description: Frame administration result Trap report
trapMap["1.3.6.1.4.1.2011.6.3.8.5.0.1"] = [
    name: "hwFrameAdminResultTrap",
    fields: ["hwFrameIndex", "hwFrameAdminStatus", "hwTrapHardFaultPara1"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwFrameAdminStatus": "1.3.6.1.4.1.2011.6.3.3.1.1.6", "hwTrapHardFaultPara1": "1.3.6.1.4.1.2011.6.3.8.1.1"]
]

// --- hwSlotAdminResultTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.5.0.2
// Fields: hwFrameIndex, hwSlotIndex, hwSlotAdminStatus, hwTrapHardFaultPara2
// Description: Slot administration result Trap report
trapMap["1.3.6.1.4.1.2011.6.3.8.5.0.2"] = [
    name: "hwSlotAdminResultTrap",
    fields: ["hwFrameIndex", "hwSlotIndex", "hwSlotAdminStatus", "hwTrapHardFaultPara2"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwSlotIndex": "1.3.6.1.4.1.2011.6.3.3.2.1.1", "hwSlotAdminStatus": "1.3.6.1.4.1.2011.6.3.3.2.1.9", "hwTrapHardFaultPara2": "1.3.6.1.4.1.2011.6.3.8.1.2"]
]

// --- hwSubSlotAdminResultTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.5.0.3
// Fields: hwFrameIndex, hwSlotIndex, hwSubslotIndex, hwSubslotAdminStatus, hwTrapSystemRebootCause
// Description: Subslot administration result Trap report
trapMap["1.3.6.1.4.1.2011.6.3.8.5.0.3"] = [
    name: "hwSubSlotAdminResultTrap",
    fields: ["hwFrameIndex", "hwSlotIndex", "hwSubslotIndex", "hwSubslotAdminStatus", "hwTrapSystemRebootCause"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwSlotIndex": "1.3.6.1.4.1.2011.6.3.3.2.1.1", "hwSubslotIndex": "1.3.6.1.4.1.2011.6.3.3.3.1.1", "hwSubslotAdminStatus": "1.3.6.1.4.1.2011.6.3.3.3.1.7", "hwTrapSystemRebootCause": "1.3.6.1.4.1.2011.6.3.8.1.3"]
]

// --- hwPortAdminResultTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.5.0.4
// Fields: hwFrameIndex, hwSlotIndex, hwSubslotIndex, hwPortIndex, hwPortAdminStatus, hwTrapHardFaultLocation
// Description: Port administration result Trap report
trapMap["1.3.6.1.4.1.2011.6.3.8.5.0.4"] = [
    name: "hwPortAdminResultTrap",
    fields: ["hwFrameIndex", "hwSlotIndex", "hwSubslotIndex", "hwPortIndex", "hwPortAdminStatus", "hwTrapHardFaultLocation"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwSlotIndex": "1.3.6.1.4.1.2011.6.3.3.2.1.1", "hwSubslotIndex": "1.3.6.1.4.1.2011.6.3.3.3.1.1", "hwPortIndex": "1.3.6.1.4.1.2011.6.3.3.4.1.1", "hwPortAdminStatus": "1.3.6.1.4.1.2011.6.3.3.4.1.6", "hwTrapHardFaultLocation": "1.3.6.1.4.1.2011.6.3.8.1.4"]
]

// --- hwDevAntiTheftLockTraps (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.6.0.1
// Fields: hwDevAntiTheftStatus
// Description: This trap message is reported periodically when device anti-theft is locked.
trapMap["1.3.6.1.4.1.2011.6.3.8.6.0.1"] = [
    name: "hwDevAntiTheftLockTraps",
    fields: ["hwDevAntiTheftStatus"],
    fieldOids: ["hwDevAntiTheftStatus": "1.3.6.1.4.1.2011.6.3.8.1.54"]
]

// --- hwDevAntiTheftUnAuthTraps (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.6.0.2
// Fields: hwDevAntiTheftTrapReason
// Description: This trap message is reported when the device anti-theft is not authorized.
trapMap["1.3.6.1.4.1.2011.6.3.8.6.0.2"] = [
    name: "hwDevAntiTheftUnAuthTraps",
    fields: ["hwDevAntiTheftTrapReason"],
    fieldOids: ["hwDevAntiTheftTrapReason": "1.3.6.1.4.1.2011.6.3.8.1.55"]
]

// --- hwDevAntiTheftUnAuthResumeTraps (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.6.0.3
// Fields: hwDevAntiTheftTrapReason
// Description: This trap message is reported when the device anti-theft is authorized.
trapMap["1.3.6.1.4.1.2011.6.3.8.6.0.3"] = [
    name: "hwDevAntiTheftUnAuthResumeTraps",
    fields: ["hwDevAntiTheftTrapReason"],
    fieldOids: ["hwDevAntiTheftTrapReason": "1.3.6.1.4.1.2011.6.3.8.1.55"]
]

// --- hwDevAntiTheftLockedTraps (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.6.0.4
// Fields: hwDevAntiTheftTrapReason
// Description: This trap message is reported when the device anti-theft is locked.
trapMap["1.3.6.1.4.1.2011.6.3.8.6.0.4"] = [
    name: "hwDevAntiTheftLockedTraps",
    fields: ["hwDevAntiTheftTrapReason"],
    fieldOids: ["hwDevAntiTheftTrapReason": "1.3.6.1.4.1.2011.6.3.8.1.55"]
]

// --- hwDevAntiTheftLockedResumeTraps (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.8.6.0.5
// Fields: hwDevAntiTheftTrapReason
// Description: This trap message is reported when the device anti-theft is not locked.
trapMap["1.3.6.1.4.1.2011.6.3.8.6.0.5"] = [
    name: "hwDevAntiTheftLockedResumeTraps",
    fields: ["hwDevAntiTheftTrapReason"],
    fieldOids: ["hwDevAntiTheftTrapReason": "1.3.6.1.4.1.2011.6.3.8.1.55"]
]

// ===== Lookup tables (inlined) =====
def lookupTables = [:]

// ===== Parsing logic =====

// Set to true to enable diagnostic logging for this MIB parser
DEBUG = false

LOG_PREFIX = "[HUAWEI-DEVICE-MIB]"
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

// --- Trap rule overrides (alert group / severity) ---
def trapRuleName = trapInfo.name
def agent = ""
// --- Trap: hwFrameAdminResultTrap (OID 1.3.6.1.4.1.2011.6.3.8.5.1) ---
if (trapRuleName == "hwFrameAdminResultTrap") {
    event.setAlertGroup("Frame Administration Status")
    def alertKey = "hwFrameEntry." + gf[1]
    event.setAlertKey(alertKey)
    def summary = "Hw Frame Admin Result Trap" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    if ((gf[2] == "1") && (gf[3] == "1")) {
        event.setSeverity(1)
        event.setEventType("2")
    }
    else if ((gf[2] == "1") && (gf[3] == "2")) {
        event.setSeverity(2)
        event.setEventType("1")
    }
    else if (gf[2] == "1") {
        event.setSeverity(2)
        event.setEventType("1")
    }
    else if ((gf[2] == "2") && (gf[3] == "1")) {
        event.setSeverity(1)
        event.setEventType("2")
    }
    else if ((gf[2] == "2") && (gf[3] == "2")) {
        event.setSeverity(3)
        event.setEventType("1")
    }
    else if (gf[2] == "2") {
        event.setSeverity(2)
        event.setEventType("1")
    }
    else if ((gf[2] == "3") && (gf[3] == "1")) {
        event.setSeverity(1)
        event.setEventType("2")
    }
    else if ((gf[2] == "3") && (gf[3] == "2")) {
        event.setSeverity(2)
        event.setEventType("12")
    }
    else if (gf[2] == "3") {
        event.setSeverity(2)
        event.setEventType("1")
    }
    else if ((gf[2] == "4") && (gf[3] == "1")) {
        event.setSeverity(1)
        event.setEventType("2")
    }
    else if ((gf[2] == "4") && (gf[3] == "2")) {
        event.setSeverity(2)
        event.setEventType("12")
    }
    else if (gf[2] == "4") {
        event.setSeverity(2)
        event.setEventType("1")
    }
    else if ((gf[2] == "5") && (gf[3] == "1")) {
        event.setSeverity(1)
        event.setEventType("2")
    }
    else if ((gf[2] == "5") && (gf[3] == "2")) {
        event.setSeverity(2)
        event.setEventType("12")
    }
    else if (gf[2] == "5") {
        event.setSeverity(2)
        event.setEventType("1")
    }
    else if ((gf[2] == "6") && (gf[3] == "1")) {
        event.setSeverity(1)
        event.setEventType("2")
    }
    else if ((gf[2] == "6") && (gf[3] == "2")) {
        event.setSeverity(2)
        event.setEventType("1")
    }
    else if (gf[2] == "6") {
        event.setSeverity(2)
        event.setEventType("1")
    }
    else if (gf[3] == "1") {
        event.setSeverity(1)
        event.setEventType("2")
    }
    else if (gf[3] == "2") {
        event.setSeverity(2)
        event.setEventType("1")
    }
    else if (true) {
        event.setSeverity(2)
        event.setEventType("1")
    }
    def dyn = event.getDynamicFields() ?: [:]
    dyn["hwFrameIndex"] = varbinds.get("hwFrameIndex")
    dyn["hwFrameAdminStatus"] = varbinds.get("hwFrameAdminStatus")
    dyn["hwFrameAdminResult"] = varbinds.get("hwFrameAdminResult")
    event.setDynamicFields(dyn)
}
// --- Trap: hwSlotAdminResultTrap (OID 1.3.6.1.4.1.2011.6.3.8.5.2) ---
if (trapRuleName == "hwSlotAdminResultTrap") {
    event.setAlertGroup("Slot Administration Status")
    def alertKey = "hwSlotEntry." + gf[1] + "." + gf[2]
    event.setAlertKey(alertKey)
    def summary = "Hw Slot Admin Result Trap" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    if ((gf[3] == "1") && (gf[4] == "1")) {
        event.setSeverity(1)
        event.setEventType("2")
    }
    else if ((gf[3] == "1") && (gf[4] == "2")) {
        event.setSeverity(2)
        event.setEventType("1")
    }
    else if (gf[3] == "1") {
        event.setSeverity(2)
        event.setEventType("1")
    }
    else if ((gf[3] == "2") && (gf[4] == "1")) {
        event.setSeverity(1)
        event.setEventType("2")
    }
    else if ((gf[3] == "2") && (gf[4] == "2")) {
        event.setSeverity(3)
        event.setEventType("1")
    }
    else if (gf[3] == "2") {
        event.setSeverity(2)
        event.setEventType("1")
    }
    else if ((gf[3] == "3") && (gf[4] == "1")) {
        event.setSeverity(1)
        event.setEventType("2")
    }
    else if ((gf[3] == "3") && (gf[4] == "2")) {
        event.setSeverity(2)
        event.setEventType("12")
    }
    else if (gf[3] == "3") {
        event.setSeverity(2)
        event.setEventType("1")
    }
    else if ((gf[3] == "4") && (gf[4] == "1")) {
        event.setSeverity(1)
        event.setEventType("2")
    }
    else if ((gf[3] == "4") && (gf[4] == "2")) {
        event.setSeverity(2)
        event.setEventType("12")
    }
    else if (gf[3] == "4") {
        event.setSeverity(2)
        event.setEventType("1")
    }
    else if ((gf[3] == "5") && (gf[4] == "1")) {
        event.setSeverity(1)
        event.setEventType("2")
    }
    else if ((gf[3] == "5") && (gf[4] == "2")) {
        event.setSeverity(2)
        event.setEventType("1")
    }
    else if (gf[3] == "5") {
        event.setSeverity(2)
        event.setEventType("1")
    }
    else if ((gf[3] == "6") && (gf[4] == "1")) {
        event.setSeverity(1)
        event.setEventType("2")
    }
    else if ((gf[3] == "6") && (gf[4] == "2")) {
        event.setSeverity(2)
        event.setEventType("1")
    }
    else if (gf[3] == "6") {
        event.setSeverity(2)
        event.setEventType("1")
    }
    else if ((gf[3] == "7") && (gf[4] == "1")) {
        event.setSeverity(1)
        event.setEventType("2")
    }
    else if ((gf[3] == "7") && (gf[4] == "2")) {
        event.setSeverity(2)
        event.setEventType("1")
    }
    else if (gf[3] == "7") {
        event.setSeverity(2)
        event.setEventType("1")
    }
    else if ((gf[3] == "8") && (gf[4] == "1")) {
        event.setSeverity(1)
        event.setEventType("2")
    }
    else if ((gf[3] == "8") && (gf[4] == "2")) {
        event.setSeverity(3)
        event.setEventType("1")
    }
    else if (gf[3] == "8") {
        event.setSeverity(2)
        event.setEventType("1")
    }
    else if ((gf[3] == "9") && (gf[4] == "1")) {
        event.setSeverity(1)
        event.setEventType("2")
    }
    else if ((gf[3] == "9") && (gf[4] == "2")) {
        event.setSeverity(2)
        event.setEventType("1")
    }
    else if (gf[3] == "9") {
        event.setSeverity(2)
        event.setEventType("1")
    }
    else if (gf[4] == "1") {
        event.setSeverity(1)
        event.setEventType("2")
    }
    else if (gf[4] == "2") {
        event.setSeverity(2)
        event.setEventType("1")
    }
    else if (true) {
        event.setSeverity(2)
        event.setEventType("1")
    }
}
// --- Trap: hwSubSlotAdminResultTrap (OID 1.3.6.1.4.1.2011.6.3.8.5.3) ---
if (trapRuleName == "hwSubSlotAdminResultTrap") {
    event.setAlertGroup("Sub-Slot Administration Status")
    def alertKey = "hwSubslotEntry." + gf[1] + "." + gf[2] + "." + gf[3]
    event.setAlertKey(alertKey)
    def summary = "Hw Sub Slot Admin Result Trap" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    if ((gf[4] == "1") && (gf[5] == "1")) {
        event.setSeverity(1)
        event.setEventType("2")
    }
    else if ((gf[4] == "1") && (gf[5] == "2")) {
        event.setSeverity(2)
        event.setEventType("1")
    }
    else if (gf[4] == "1") {
        event.setSeverity(2)
        event.setEventType("1")
    }
    else if ((gf[4] == "2") && (gf[5] == "1")) {
        event.setSeverity(1)
        event.setEventType("2")
    }
    else if ((gf[4] == "2") && (gf[5] == "2")) {
        event.setSeverity(3)
        event.setEventType("1")
    }
    else if (gf[4] == "2") {
        event.setSeverity(2)
        event.setEventType("1")
    }
    else if ((gf[4] == "3") && (gf[5] == "1")) {
        event.setSeverity(1)
        event.setEventType("2")
    }
    else if ((gf[4] == "3") && (gf[5] == "2")) {
        event.setSeverity(2)
        event.setEventType("12")
    }
    else if (gf[4] == "3") {
        event.setSeverity(2)
        event.setEventType("1")
    }
    else if ((gf[4] == "4") && (gf[5] == "1")) {
        event.setSeverity(1)
        event.setEventType("2")
    }
    else if ((gf[4] == "4") && (gf[5] == "2")) {
        event.setSeverity(2)
        event.setEventType("12")
    }
    else if (gf[4] == "4") {
        event.setSeverity(2)
        event.setEventType("1")
    }
    else if ((gf[4] == "5") && (gf[5] == "1")) {
        event.setSeverity(1)
        event.setEventType("2")
    }
    else if ((gf[4] == "5") && (gf[5] == "2")) {
        event.setSeverity(2)
        event.setEventType("12")
    }
    else if (gf[4] == "5") {
        event.setSeverity(2)
        event.setEventType("1")
    }
    else if ((gf[4] == "6") && (gf[5] == "1")) {
        event.setSeverity(1)
        event.setEventType("2")
    }
    else if ((gf[4] == "6") && (gf[5] == "2")) {
        event.setSeverity(2)
        event.setEventType("1")
    }
    else if (gf[4] == "6") {
        event.setSeverity(2)
        event.setEventType("1")
    }
    else if (gf[5] == "1") {
        event.setSeverity(1)
        event.setEventType("2")
    }
    else if (gf[5] == "2") {
        event.setSeverity(2)
        event.setEventType("1")
    }
    else if (true) {
        event.setSeverity(2)
        event.setEventType("1")
    }
}
// --- Trap: hwPortAdminResultTrap (OID 1.3.6.1.4.1.2011.6.3.8.5.4) ---
if (trapRuleName == "hwPortAdminResultTrap") {
    event.setAlertGroup("Port Administration Status")
    def alertKey = "hwPortEntry." + gf[1] + "." + gf[2] + "." + gf[3] + "." + gf[4]
    event.setAlertKey(alertKey)
    def summary = "Hw Port Admin Result Trap" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    if ((gf[5] == "1") && (gf[6] == "1")) {
        event.setSeverity(1)
        event.setEventType("2")
    }
    else if ((gf[5] == "1") && (gf[6] == "2")) {
        event.setSeverity(3)
        event.setEventType("1")
    }
    else if (gf[5] == "1") {
        event.setSeverity(2)
        event.setEventType("1")
    }
    else if ((gf[5] == "2") && (gf[3] == "1")) {
        event.setSeverity(1)
        event.setEventType("2")
    }
    else if ((gf[5] == "2") && (gf[3] == "2")) {
        event.setSeverity(2)
        event.setEventType("1")
    }
    else if (gf[5] == "2") {
        event.setSeverity(2)
        event.setEventType("1")
    }
    else if ((gf[5] == "3") && (gf[3] == "1")) {
        event.setSeverity(1)
        event.setEventType("2")
    }
    else if ((gf[5] == "3") && (gf[3] == "2")) {
        event.setSeverity(2)
        event.setEventType("1")
    }
    else if (gf[5] == "3") {
        event.setSeverity(2)
        event.setEventType("1")
    }
    else if ((gf[5] == "4") && (gf[3] == "1")) {
        event.setSeverity(1)
        event.setEventType("2")
    }
    else if ((gf[5] == "4") && (gf[3] == "2")) {
        event.setSeverity(3)
        event.setEventType("1")
    }
    else if (gf[5] == "4") {
        event.setSeverity(2)
        event.setEventType("1")
    }
    else if ((gf[5] == "5") && (gf[3] == "1")) {
        event.setSeverity(1)
        event.setEventType("2")
    }
    else if ((gf[5] == "5") && (gf[3] == "2")) {
        event.setSeverity(2)
        event.setEventType("12")
    }
    else if (gf[5] == "5") {
        event.setSeverity(2)
        event.setEventType("1")
    }
    else if ((gf[5] == "6") && (gf[3] == "1")) {
        event.setSeverity(1)
        event.setEventType("2")
    }
    else if ((gf[5] == "6") && (gf[3] == "2")) {
        event.setSeverity(2)
        event.setEventType("1")
    }
    else if (gf[5] == "6") {
        event.setSeverity(2)
        event.setEventType("1")
    }
    else if ((gf[5] == "7") && (gf[3] == "1")) {
        event.setSeverity(1)
        event.setEventType("2")
    }
    else if ((gf[5] == "7") && (gf[3] == "2")) {
        event.setSeverity(2)
        event.setEventType("12")
    }
    else if (gf[5] == "7") {
        event.setSeverity(2)
        event.setEventType("1")
    }
    else if ((gf[5] == "8") && (gf[3] == "1")) {
        event.setSeverity(1)
        event.setEventType("2")
    }
    else if ((gf[5] == "8") && (gf[3] == "2")) {
        event.setSeverity(2)
        event.setEventType("1")
    }
    else if (gf[5] == "8") {
        event.setSeverity(2)
        event.setEventType("1")
    }
    else if ((gf[5] == "9") && (gf[3] == "1")) {
        event.setSeverity(1)
        event.setEventType("2")
    }
    else if ((gf[5] == "9") && (gf[3] == "2")) {
        event.setSeverity(3)
        event.setEventType("1")
    }
    else if (gf[5] == "9") {
        event.setSeverity(2)
        event.setEventType("1")
    }
    else if ((gf[5] == "11") && (gf[3] == "1")) {
        event.setSeverity(1)
        event.setEventType("2")
    }
    else if ((gf[5] == "11") && (gf[3] == "2")) {
        event.setSeverity(2)
        event.setEventType("1")
    }
    else if (gf[5] == "11") {
        event.setSeverity(2)
        event.setEventType("1")
    }
    else if ((gf[5] == "12") && (gf[3] == "1")) {
        event.setSeverity(1)
        event.setEventType("2")
    }
    else if ((gf[5] == "12") && (gf[3] == "2")) {
        event.setSeverity(2)
        event.setEventType("1")
    }
    else if (gf[5] == "12") {
        event.setSeverity(2)
        event.setEventType("1")
    }
    else if ((gf[5] == "13") && (gf[3] == "1")) {
        event.setSeverity(1)
        event.setEventType("2")
    }
    else if ((gf[5] == "13") && (gf[3] == "2")) {
        event.setSeverity(3)
        event.setEventType("1")
    }
    else if (gf[5] == "13") {
        event.setSeverity(2)
        event.setEventType("1")
    }
    else if ((gf[5] == "14") && (gf[3] == "1")) {
        event.setSeverity(1)
        event.setEventType("2")
    }
    else if ((gf[5] == "14") && (gf[3] == "2")) {
        event.setSeverity(2)
        event.setEventType("1")
    }
    else if (gf[5] == "14") {
        event.setSeverity(2)
        event.setEventType("1")
    }
    else if ((gf[5] == "15") && (gf[3] == "1")) {
        event.setSeverity(1)
        event.setEventType("2")
    }
    else if ((gf[5] == "15") && (gf[3] == "2")) {
        event.setSeverity(3)
        event.setEventType("1")
    }
    else if (gf[5] == "15") {
        event.setSeverity(2)
        event.setEventType("1")
    }
    else if (gf[3] == "1") {
        event.setSeverity(1)
        event.setEventType("2")
    }
    else if (gf[3] == "2") {
        event.setSeverity(2)
        event.setEventType("1")
    }
    else if (true) {
        event.setSeverity(2)
        event.setEventType("1")
    }
}

if (event.getAgentType() == null || event.getAgentType().trim().isEmpty()) {
    event.setAgentType(metadata?.get("agentType")?.toString() ?: "generic")
}
def pairKey = [event.getDomainId(), event.getAgentType(), event.getNode(), event.getAlertGroup(), event.getAlertKey()]
                    .findAll { it != null && it.toString().trim() != "" }
                    .collect { it.toString().trim() }.join("|")
event.setIdentifier(pairKey + "|" + event.getEventType())

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
