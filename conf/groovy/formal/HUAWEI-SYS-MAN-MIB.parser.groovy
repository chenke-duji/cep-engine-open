/**
 * Auto-generated from HUAWEI-SYS-MAN-MIB.mib
 * Generated: 2026-08-25T16:47:04.831032
 * Traps/Notifications (94): hwSysWlanApUpgradeBeginNotify, hwSysWlanApUpgradeResultNotify, hwSysWlanApUpgradeUbootNotMatchNotify, hwSysWlanApUpgradeAssistantPackageNotMatchNotify, hwSysClockChangedNotification, hwSysReloadNotification, hwSysMasterHDError, hwSysSlaveHDError, hwPatchErrorTrap, hwPatchActiveOverTimeTrap, hwPatchMalfunctionComebackTrap, hwPatchUpdateTrap, hwPatchInstallFailSlot, hwPatchInstallFailSlotClear, hwPatchPackageError, hwPatchPackageErrorClear, hwSysMasterCfcardError, hwSysSlaveCfcardError, hwSysSlaveSwitchSuccessNotification, hwSysSlaveSwitchFailNotification, hwSysIssuNotification, hwPatchInstallFail, hwPatchInstallFailClear, hwSumUpgradeSuccess, hwSysCfgFileErrorNotification, hwSysImageErrorNotification, hwSysPafChangeNotification, hwSysLicenseChangeNotification, hwSystemBoardExclude, hwSystemBoardExcludeClear, hwEvmVmAbnormalRunNotification, hwEvmVmNotRunningNotification, hwEvmVmAbnormalRestartNotification, hwEvmDownloadFailedNotification, hwEvmInstallFailedNotification, hwTpmStaticMeasureAlarm, hwTpmStaticMeasureAlarmClear, hwSysImageDamagedNotification, hwInnerSSLCertsInvalidEarlyWarning, hwInnerSSLCertsInvalidEarlyWarningResume, hwInnerSSLCertificateInvalid, hwInnerSSLCertificateInvalidResume, hwBoardCommunicationLinkFaultAlarm, hwBoardCommunicationLinkFaultResume, hwOMUSyncFailAlarm, hwOMUSyncFailResume, hwSysPatchDamagedNotification, hwSysPatchDamagedClearNotification, hwSysColdPatchNotEffectNotification, hwSysColdPatchNotEffectClearNotification, hwTpmChipFault, hwTpmChipFaultClear, hwSysPackageVerifyFailed, hwSysImageDamagedResume, hwSysPackageVerifyFailedResume, hwApplicationFault, hwApplicationFaultClear, hwTrustemCertificateExpiredAlarm, hwTrustemCertificateExpiredResume, hwTrustemCertificateExpiredEarlyWarning, hwTrustemCertificateExpiredEarlyResume, hwStartupSecureVersionNeedRefresh, hwStartupSecureVersionNeedRefreshResume, hwSmartUpgradeUserDataRetentionPeriodHasExpired, hwSmartUpgradeUserDataRetentionPeriodHasExpiredResume, hwSysNetconfCfgRecoverFail, hwSecurityRisk, hwSecurityRiskClear, hwPackageOperationSuccess, hwPackageVersionDowngrade, hwPackageOperationFail, hwComponentBackupFail, hwComponentBackupFailResume, hwProcessFaultAlarm, hwProcessFaultAlarmResume, hwOnboardFirmwareDamaged, hwOncardFirmwareDamaged, hwOncardFirmwareDamagedResume, hwBIMMemoryFull, hwBIMMemoryFullResume, hwEulaNotSigned, hwEulaNotSignedResume, hw3rdPluginUpdateFailed, hwBoardRoleAbnormal, hwBoardRoleAbnormalResume, hwHipsAbnormalBehaviorDetected, hwHipsAbnormalBehaviorResolved, hwHipsAbnormalShellDetected, hwHipsFilePrivilegeEscalated, hwHipsKeyfileTampered, hwHipsRootkitAttack, hwHipsUnauthorizedRootUser, hwTimerResThresholdExceed, hwTimerResThresholdExceedResume
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

// --- hwSysWlanApUpgradeBeginNotify (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.19.1.24.3.1
// Description: This notification occurs when ap begin to update.
trapMap["1.3.6.1.4.1.2011.5.25.19.1.24.3.1"] = [
    name: "hwSysWlanApUpgradeBeginNotify",
    fields: [],
    fieldOids: []
]

// --- hwSysWlanApUpgradeResultNotify (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.19.1.24.3.2
// Fields: hwSysWlanApUpgradeProgressStatus
// Description: This notification occurs when ap has updated successfully or failed.
trapMap["1.3.6.1.4.1.2011.5.25.19.1.24.3.2"] = [
    name: "hwSysWlanApUpgradeResultNotify",
    fields: ["hwSysWlanApUpgradeProgressStatus"],
    fieldOids: ["hwSysWlanApUpgradeProgressStatus": "1.3.6.1.4.1.2011.5.25.19.1.24.2.1"]
]

// --- hwSysWlanApUpgradeUbootNotMatchNotify (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.19.1.24.3.3
// Description: This notification occurs when ap uboot not match version.
trapMap["1.3.6.1.4.1.2011.5.25.19.1.24.3.3"] = [
    name: "hwSysWlanApUpgradeUbootNotMatchNotify",
    fields: [],
    fieldOids: []
]

// --- hwSysWlanApUpgradeAssistantPackageNotMatchNotify (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.19.1.24.3.4
// Description: This notification occurs when ap upgrade-assistant-package not match version.
trapMap["1.3.6.1.4.1.2011.5.25.19.1.24.3.4"] = [
    name: "hwSysWlanApUpgradeAssistantPackageNotMatchNotify",
    fields: [],
    fieldOids: []
]

// --- hwSysClockChangedNotification (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.19.2.1
// Fields: hwSysLocalClock
// Description: This object indicates the notification sent when the system clock changes. When the system clock changes, this trap is triggered. For example, the system clock is changed through command lines.
trapMap["1.3.6.1.4.1.2011.5.25.19.2.1"] = [
    name: "hwSysClockChangedNotification",
    fields: ["hwSysLocalClock"],
    fieldOids: ["hwSysLocalClock": "1.3.6.1.4.1.2011.5.25.19.1.1.1"]
]

// --- hwSysReloadNotification (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.19.2.2
// Fields: hwSysReloadImage, hwSysReloadCfgFile, hwSysReloadReason, hwSysReloadScheduleTime, hwSysReloadAction, hwSysReloadPafFile, hwSysReloadLicenseFile, hwSysReloadPatchFile, hwSysReloadAndroidFile
// Description: This object indicates the restart notification.
trapMap["1.3.6.1.4.1.2011.5.25.19.2.2"] = [
    name: "hwSysReloadNotification",
    fields: ["hwSysReloadImage", "hwSysReloadCfgFile", "hwSysReloadReason", "hwSysReloadScheduleTime", "hwSysReloadAction", "hwSysReloadPafFile", "hwSysReloadLicenseFile", "hwSysReloadPatchFile", "hwSysReloadAndroidFile"],
    fieldOids: ["hwSysReloadImage": "1.3.6.1.4.1.2011.5.25.19.1.3.3.1.4", "hwSysReloadCfgFile": "1.3.6.1.4.1.2011.5.25.19.1.3.3.1.3", "hwSysReloadReason": "1.3.6.1.4.1.2011.5.25.19.1.3.3.1.5", "hwSysReloadScheduleTime": "1.3.6.1.4.1.2011.5.25.19.1.3.3.1.6", "hwSysReloadAction": "1.3.6.1.4.1.2011.5.25.19.1.3.2", "hwSysReloadPafFile": "1.3.6.1.4.1.2011.5.25.19.1.3.3.1.8", "hwSysReloadLicenseFile": "1.3.6.1.4.1.2011.5.25.19.1.3.3.1.9", "hwSysReloadPatchFile": "1.3.6.1.4.1.2011.5.25.19.1.3.3.1.10", "hwSysReloadAndroidFile": "1.3.6.1.4.1.2011.5.25.19.1.3.3.1.15"]
]

// --- hwSysMasterHDError (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.19.2.3
// Description: When the hard disk on master board cannot be read and written because of a certain error, the hard disk on master board is unregistered and the notification is sent.
trapMap["1.3.6.1.4.1.2011.5.25.19.2.3"] = [
    name: "hwSysMasterHDError",
    fields: [],
    fieldOids: []
]

// --- hwSysSlaveHDError (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.19.2.4
// Description: When the hard disk on slave board cannot be read and written because of a certain error, the hard disk on slave board is unregistered and the notification is sent.
trapMap["1.3.6.1.4.1.2011.5.25.19.2.4"] = [
    name: "hwSysSlaveHDError",
    fields: [],
    fieldOids: []
]

// --- hwPatchErrorTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.19.2.5.1
// Fields: hwPatchErrorSlot, hwPatchErrorPatchIndex, hwPatchErrorCode, hwPatchErrorPatchFileName
// Description: Notification about a patch operation failure. This trap is reported when patch installation or patch status configuration fails. The trap contents include hwPatchErrorSlot, hwPatchErrorPatchIndex, hwP...
trapMap["1.3.6.1.4.1.2011.5.25.19.2.5.1"] = [
    name: "hwPatchErrorTrap",
    fields: ["hwPatchErrorSlot", "hwPatchErrorPatchIndex", "hwPatchErrorCode", "hwPatchErrorPatchFileName"],
    fieldOids: ["hwPatchErrorSlot": "1.3.6.1.4.1.2011.5.25.19.1.8.5.4.1.2", "hwPatchErrorPatchIndex": "1.3.6.1.4.1.2011.5.25.19.1.8.5.4.1.4", "hwPatchErrorCode": "1.3.6.1.4.1.2011.5.25.19.1.8.5.4.1.5", "hwPatchErrorPatchFileName": "1.3.6.1.4.1.2011.5.25.19.1.8.5.4.1.3"]
]

// --- hwPatchActiveOverTimeTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.19.2.5.2
// Fields: hwPatchOperateState
// Description: The patch is not run within 24 hours after it is activated.
trapMap["1.3.6.1.4.1.2011.5.25.19.2.5.2"] = [
    name: "hwPatchActiveOverTimeTrap",
    fields: ["hwPatchOperateState"],
    fieldOids: ["hwPatchOperateState": "1.3.6.1.4.1.2011.5.25.19.1.8.5.1.1.14"]
]

// --- hwPatchMalfunctionComebackTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.19.2.5.3
// Fields: hwPatchOperateState
// Description: The patch operation is restored.
trapMap["1.3.6.1.4.1.2011.5.25.19.2.5.3"] = [
    name: "hwPatchMalfunctionComebackTrap",
    fields: ["hwPatchOperateState"],
    fieldOids: ["hwPatchOperateState": "1.3.6.1.4.1.2011.5.25.19.1.8.5.1.1.14"]
]

// --- hwPatchUpdateTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.19.2.5.4
// Fields: hwPatchVersion, hwPatchType, hwPatchOperateState
// Description: Notification about a trap status change. This trap is reported when patch installation or patch status configuration succeeds.
trapMap["1.3.6.1.4.1.2011.5.25.19.2.5.4"] = [
    name: "hwPatchUpdateTrap",
    fields: ["hwPatchVersion", "hwPatchType", "hwPatchOperateState"],
    fieldOids: ["hwPatchVersion": "1.3.6.1.4.1.2011.5.25.19.1.8.5.1.1.4", "hwPatchType": "1.3.6.1.4.1.2011.5.25.19.1.8.5.1.1.10", "hwPatchOperateState": "1.3.6.1.4.1.2011.5.25.19.1.8.5.1.1.14"]
]

// --- hwPatchInstallFailSlot (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.19.2.5.5
// Fields: hwEntPhysicalName, hwPatchInstallFileName, hwPatchInstallVersion, hwPatchInstallFailReason
// Description: The patch package install fail notification.
trapMap["1.3.6.1.4.1.2011.5.25.19.2.5.5"] = [
    name: "hwPatchInstallFailSlot",
    fields: ["hwEntPhysicalName", "hwPatchInstallFileName", "hwPatchInstallVersion", "hwPatchInstallFailReason"],
    fieldOids: ["hwEntPhysicalName": "1.3.6.1.4.1.2011.5.25.219.1.26", "hwPatchInstallFileName": "1.3.6.1.4.1.2011.5.25.19.1.29.1", "hwPatchInstallVersion": "1.3.6.1.4.1.2011.5.25.19.1.29.2", "hwPatchInstallFailReason": "1.3.6.1.4.1.2011.5.25.19.1.29.3"]
]

// --- hwPatchInstallFailSlotClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.19.2.5.6
// Fields: hwEntPhysicalName, hwPatchInstallFileName, hwPatchInstallVersion, hwPatchInstallFailReason
// Description: The patch package install fail clear notification.
trapMap["1.3.6.1.4.1.2011.5.25.19.2.5.6"] = [
    name: "hwPatchInstallFailSlotClear",
    fields: ["hwEntPhysicalName", "hwPatchInstallFileName", "hwPatchInstallVersion", "hwPatchInstallFailReason"],
    fieldOids: ["hwEntPhysicalName": "1.3.6.1.4.1.2011.5.25.219.1.26", "hwPatchInstallFileName": "1.3.6.1.4.1.2011.5.25.19.1.29.1", "hwPatchInstallVersion": "1.3.6.1.4.1.2011.5.25.19.1.29.2", "hwPatchInstallFailReason": "1.3.6.1.4.1.2011.5.25.19.1.29.3"]
]

// --- hwPatchPackageError (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.19.2.5.7
// Fields: hwPackageName
// Description: The patch package error notification.
trapMap["1.3.6.1.4.1.2011.5.25.19.2.5.7"] = [
    name: "hwPatchPackageError",
    fields: ["hwPackageName"],
    fieldOids: ["hwPackageName": "1.3.6.1.4.1.2011.5.25.19.1.8.1.9"]
]

// --- hwPatchPackageErrorClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.19.2.5.8
// Fields: hwPackageName
// Description: The patch package error clear notification.
trapMap["1.3.6.1.4.1.2011.5.25.19.2.5.8"] = [
    name: "hwPatchPackageErrorClear",
    fields: ["hwPackageName"],
    fieldOids: ["hwPackageName": "1.3.6.1.4.1.2011.5.25.19.1.8.1.9"]
]

// --- hwSysMasterCfcardError (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.19.2.6
// Description: When the cfcard on master board can't be read and written because of some error, the Cfcard on master board will be unregistered and the notification is sent.
trapMap["1.3.6.1.4.1.2011.5.25.19.2.6"] = [
    name: "hwSysMasterCfcardError",
    fields: [],
    fieldOids: []
]

// --- hwSysSlaveCfcardError (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.19.2.7
// Description: When the cfcard on slave board can't be read and written because of some error, the Cfcard on slave board will be unregistered and the notification is sent.
trapMap["1.3.6.1.4.1.2011.5.25.19.2.7"] = [
    name: "hwSysSlaveCfcardError",
    fields: [],
    fieldOids: []
]

// --- hwSysSlaveSwitchSuccessNotification (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.19.2.8
// Fields: hwSysSlaveSwitchChassisNum, hwSysSlaveSwitchSrc, hwSysSlaveSwitchDst
// Description: This object indicates that the hwSysSlaveSwitchChassisNum chassis is successfully switched.
trapMap["1.3.6.1.4.1.2011.5.25.19.2.8"] = [
    name: "hwSysSlaveSwitchSuccessNotification",
    fields: ["hwSysSlaveSwitchChassisNum", "hwSysSlaveSwitchSrc", "hwSysSlaveSwitchDst"],
    fieldOids: ["hwSysSlaveSwitchChassisNum": "1.3.6.1.4.1.2011.5.25.19.1.3.7.1.2", "hwSysSlaveSwitchSrc": "1.3.6.1.4.1.2011.5.25.19.1.3.7.1.5", "hwSysSlaveSwitchDst": "1.3.6.1.4.1.2011.5.25.19.1.3.7.1.6"]
]

// --- hwSysSlaveSwitchFailNotification (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.19.2.9
// Fields: hwSysSlaveSwitchChassisNum
// Description: This object indicates that the hwSysSlaveSwitchChassisNum chassis fails to be switched.
trapMap["1.3.6.1.4.1.2011.5.25.19.2.9"] = [
    name: "hwSysSlaveSwitchFailNotification",
    fields: ["hwSysSlaveSwitchChassisNum"],
    fieldOids: ["hwSysSlaveSwitchChassisNum": "1.3.6.1.4.1.2011.5.25.19.1.3.7.1.2"]
]

// --- hwSysIssuNotification (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.19.2.10
// Fields: hwIssuState, hwIssuConditionCheck
// Description: When the ISSU upgrade over, it will send success or failed message.
trapMap["1.3.6.1.4.1.2011.5.25.19.2.10"] = [
    name: "hwSysIssuNotification",
    fields: ["hwIssuState", "hwIssuConditionCheck"],
    fieldOids: ["hwIssuState": "1.3.6.1.4.1.2011.5.25.19.1.12.2", "hwIssuConditionCheck": "1.3.6.1.4.1.2011.5.25.19.1.12.3"]
]

// --- hwPatchInstallFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.19.2.11
// Fields: hwPatchUsedFileName, hwPatchVersion, hwPatchFailReason, hwEntPhysicalName
// Description: The patch package install fail notification.
trapMap["1.3.6.1.4.1.2011.5.25.19.2.11"] = [
    name: "hwPatchInstallFail",
    fields: ["hwPatchUsedFileName", "hwPatchVersion", "hwPatchFailReason", "hwEntPhysicalName"],
    fieldOids: ["hwPatchUsedFileName": "1.3.6.1.4.1.2011.5.25.19.1.8.5.1.1.3", "hwPatchVersion": "1.3.6.1.4.1.2011.5.25.19.1.8.5.1.1.4", "hwPatchFailReason": "1.3.6.1.4.1.2011.5.25.19.1.8.1.8", "hwEntPhysicalName": "1.3.6.1.4.1.2011.5.25.219.1.26"]
]

// --- hwPatchInstallFailClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.19.2.12
// Fields: hwPatchUsedFileName, hwPatchVersion, hwPatchFailReason, hwEntPhysicalName
// Description: The patch package install fail clear notification.
trapMap["1.3.6.1.4.1.2011.5.25.19.2.12"] = [
    name: "hwPatchInstallFailClear",
    fields: ["hwPatchUsedFileName", "hwPatchVersion", "hwPatchFailReason", "hwEntPhysicalName"],
    fieldOids: ["hwPatchUsedFileName": "1.3.6.1.4.1.2011.5.25.19.1.8.5.1.1.3", "hwPatchVersion": "1.3.6.1.4.1.2011.5.25.19.1.8.5.1.1.4", "hwPatchFailReason": "1.3.6.1.4.1.2011.5.25.19.1.8.1.8", "hwEntPhysicalName": "1.3.6.1.4.1.2011.5.25.219.1.26"]
]

// --- hwSumUpgradeSuccess (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.19.2.13
// Fields: hwSysImageVersion
// Description: The patch package upgrade success notification
trapMap["1.3.6.1.4.1.2011.5.25.19.2.13"] = [
    name: "hwSumUpgradeSuccess",
    fields: ["hwSysImageVersion"],
    fieldOids: ["hwSysImageVersion": "1.3.6.1.4.1.2011.5.25.19.1.4.2.1.5"]
]

// --- hwSysCfgFileErrorNotification (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.19.2.14
// Fields: hwSysCFGFileName, hwSysCFGFileReason
// Description: This object notifies that some error occurs when the configuration file is specified as the next startup configuration file.
trapMap["1.3.6.1.4.1.2011.5.25.19.2.14"] = [
    name: "hwSysCfgFileErrorNotification",
    fields: ["hwSysCFGFileName", "hwSysCFGFileReason"],
    fieldOids: ["hwSysCFGFileName": "1.3.6.1.4.1.2011.5.25.19.1.5.2.1.2", "hwSysCFGFileReason": "1.3.6.1.4.1.2011.5.25.19.1.5.2.1.5"]
]

// --- hwSysImageErrorNotification (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.19.2.15
// Fields: hwSysImageName, hwSysImageName, hwSysImageReason
// Description: The image file upgrade fail notification. The first hwSysImageName indicates the current image file, and the second hwSysImageName indicates the next startup image file.
trapMap["1.3.6.1.4.1.2011.5.25.19.2.15"] = [
    name: "hwSysImageErrorNotification",
    fields: ["hwSysImageName", "hwSysImageName", "hwSysImageReason"],
    fieldOids: ["hwSysImageName": "1.3.6.1.4.1.2011.5.25.19.1.4.2.1.2", "hwSysImageReason": "1.3.6.1.4.1.2011.5.25.19.1.4.2.1.6"]
]

// --- hwSysPafChangeNotification (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.19.2.16
// Fields: hwSysReloadEntity, hwSysPafFileName
// Description: This object indicates the notification sent when the system PAF file changes.The hwSysPafFileName indicates system PAF file, and the hwSysReloadEntity indicates the board type(1 means main board,2 mea...
trapMap["1.3.6.1.4.1.2011.5.25.19.2.16"] = [
    name: "hwSysPafChangeNotification",
    fields: ["hwSysReloadEntity", "hwSysPafFileName"],
    fieldOids: ["hwSysReloadEntity": "1.3.6.1.4.1.2011.5.25.19.1.3.3.1.2", "hwSysPafFileName": "1.3.6.1.4.1.2011.5.25.19.1.6.2.1.2"]
]

// --- hwSysLicenseChangeNotification (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.19.2.17
// Fields: hwSysReloadEntity, hwSysLicenseFileName
// Description: This object indicates the notification sent when the system license file changes.The hwSysLicenseFileName indicates the system license file, and the hwSysReloadEntity indicates the board type(1 means ...
trapMap["1.3.6.1.4.1.2011.5.25.19.2.17"] = [
    name: "hwSysLicenseChangeNotification",
    fields: ["hwSysReloadEntity", "hwSysLicenseFileName"],
    fieldOids: ["hwSysReloadEntity": "1.3.6.1.4.1.2011.5.25.19.1.3.3.1.2", "hwSysLicenseFileName": "1.3.6.1.4.1.2011.5.25.19.1.7.2.1.2"]
]

// --- hwSystemBoardExclude (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.19.2.18
// Fields: entPhysicalIndex, entPhysicalName
// Description: The board(s) excluded during software upgrading
trapMap["1.3.6.1.4.1.2011.5.25.19.2.18"] = [
    name: "hwSystemBoardExclude",
    fields: ["entPhysicalIndex", "entPhysicalName"],
    fieldOids: ["entPhysicalIndex": "1.3.6.1.2.1.47.1.1.1.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwSystemBoardExcludeClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.19.2.19
// Fields: entPhysicalIndex, entPhysicalName
// Description: The board(s) excluded retrieved during software upgrading
trapMap["1.3.6.1.4.1.2011.5.25.19.2.19"] = [
    name: "hwSystemBoardExcludeClear",
    fields: ["entPhysicalIndex", "entPhysicalName"],
    fieldOids: ["entPhysicalIndex": "1.3.6.1.2.1.47.1.1.1.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwEvmVmAbnormalRunNotification (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.19.2.20.2.1
// Fields: hwSysEvmRoleName
// Description: The board(s) excluded retrieved during software upgrading
trapMap["1.3.6.1.4.1.2011.5.25.19.2.20.2.1"] = [
    name: "hwEvmVmAbnormalRunNotification",
    fields: ["hwSysEvmRoleName"],
    fieldOids: ["hwSysEvmRoleName": "1.3.6.1.4.1.2011.5.25.19.2.20.1.1"]
]

// --- hwEvmVmNotRunningNotification (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.19.2.20.2.2
// Fields: hwSysEvmRoleName
// Description: The board(s) excluded retrieved during software upgrading
trapMap["1.3.6.1.4.1.2011.5.25.19.2.20.2.2"] = [
    name: "hwEvmVmNotRunningNotification",
    fields: ["hwSysEvmRoleName"],
    fieldOids: ["hwSysEvmRoleName": "1.3.6.1.4.1.2011.5.25.19.2.20.1.1"]
]

// --- hwEvmVmAbnormalRestartNotification (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.19.2.20.2.3
// Fields: hwSysEvmRoleName
// Description: The board(s) excluded retrieved during software upgrading
trapMap["1.3.6.1.4.1.2011.5.25.19.2.20.2.3"] = [
    name: "hwEvmVmAbnormalRestartNotification",
    fields: ["hwSysEvmRoleName"],
    fieldOids: ["hwSysEvmRoleName": "1.3.6.1.4.1.2011.5.25.19.2.20.1.1"]
]

// --- hwEvmDownloadFailedNotification (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.19.2.20.2.4
// Fields: hwSysEvmDownloadFileName
// Description: The board(s) excluded retrieved during software upgrading
trapMap["1.3.6.1.4.1.2011.5.25.19.2.20.2.4"] = [
    name: "hwEvmDownloadFailedNotification",
    fields: ["hwSysEvmDownloadFileName"],
    fieldOids: ["hwSysEvmDownloadFileName": "1.3.6.1.4.1.2011.5.25.19.2.20.1.2"]
]

// --- hwEvmInstallFailedNotification (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.19.2.20.2.5
// Fields: hwSysEvmInstallFileName
// Description: The board(s) excluded retrieved during software upgrading
trapMap["1.3.6.1.4.1.2011.5.25.19.2.20.2.5"] = [
    name: "hwEvmInstallFailedNotification",
    fields: ["hwSysEvmInstallFileName"],
    fieldOids: ["hwSysEvmInstallFileName": "1.3.6.1.4.1.2011.5.25.19.2.20.1.3"]
]

// --- hwTpmStaticMeasureAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.19.2.21
// Fields: hwTrustPhysicalName, hwTrustStartupReportItem
// Description: Results of static integrity measurement mismatch during a boot
trapMap["1.3.6.1.4.1.2011.5.25.19.2.21"] = [
    name: "hwTpmStaticMeasureAlarm",
    fields: ["hwTrustPhysicalName", "hwTrustStartupReportItem"],
    fieldOids: ["hwTrustPhysicalName": "1.3.6.1.4.1.2011.5.25.19.1.26.2.1.3", "hwTrustStartupReportItem": "1.3.6.1.4.1.2011.5.25.19.1.26.2.1.4"]
]

// --- hwTpmStaticMeasureAlarmClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.19.2.22
// Fields: hwTrustPhysicalName, hwTrustStartupReportItem
// Description: Results of static integrity measurement resume matching during a boot
trapMap["1.3.6.1.4.1.2011.5.25.19.2.22"] = [
    name: "hwTpmStaticMeasureAlarmClear",
    fields: ["hwTrustPhysicalName", "hwTrustStartupReportItem"],
    fieldOids: ["hwTrustPhysicalName": "1.3.6.1.4.1.2011.5.25.19.1.26.2.1.3", "hwTrustStartupReportItem": "1.3.6.1.4.1.2011.5.25.19.1.26.2.1.4"]
]

// --- hwSysImageDamagedNotification (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.19.2.23
// Fields: entPhysicalName, hwSysImageName
// Description: The image file in the board is damaged.
trapMap["1.3.6.1.4.1.2011.5.25.19.2.23"] = [
    name: "hwSysImageDamagedNotification",
    fields: ["entPhysicalName", "hwSysImageName"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwSysImageName": "1.3.6.1.4.1.2011.5.25.19.1.4.2.1.2"]
]

// --- hwInnerSSLCertsInvalidEarlyWarning (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.19.2.24.1
// Fields: hwRemainingDays, hwCaClass
// Description: The inner SSL certificate will expire. This warning is generated 60 days before the SSL certificate expires.
trapMap["1.3.6.1.4.1.2011.5.25.19.2.24.1"] = [
    name: "hwInnerSSLCertsInvalidEarlyWarning",
    fields: ["hwRemainingDays", "hwCaClass"],
    fieldOids: ["hwRemainingDays": "1.3.6.1.4.1.2011.5.25.19.1.28.1.1.2", "hwCaClass": "1.3.6.1.4.1.2011.5.25.19.1.28.1.1.1"]
]

// --- hwInnerSSLCertsInvalidEarlyWarningResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.19.2.24.2
// Fields: hwCaClass
// Description: The inner SSL certificate was upgraded.
trapMap["1.3.6.1.4.1.2011.5.25.19.2.24.2"] = [
    name: "hwInnerSSLCertsInvalidEarlyWarningResume",
    fields: ["hwCaClass"],
    fieldOids: ["hwCaClass": "1.3.6.1.4.1.2011.5.25.19.1.28.1.1.1"]
]

// --- hwInnerSSLCertificateInvalid (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.19.2.24.3
// Fields: hwInvalidReason, hwCaClass
// Description: The inner SSL certificate was invalid. This alarm is generated when the certificate file is damaged or expires.
trapMap["1.3.6.1.4.1.2011.5.25.19.2.24.3"] = [
    name: "hwInnerSSLCertificateInvalid",
    fields: ["hwInvalidReason", "hwCaClass"],
    fieldOids: ["hwInvalidReason": "1.3.6.1.4.1.2011.5.25.19.1.28.1.1.3", "hwCaClass": "1.3.6.1.4.1.2011.5.25.19.1.28.1.1.1"]
]

// --- hwInnerSSLCertificateInvalidResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.19.2.24.4
// Fields: hwCaClass
// Description: The inner SSL certificate was repaired.
trapMap["1.3.6.1.4.1.2011.5.25.19.2.24.4"] = [
    name: "hwInnerSSLCertificateInvalidResume",
    fields: ["hwCaClass"],
    fieldOids: ["hwCaClass": "1.3.6.1.4.1.2011.5.25.19.1.28.1.1.1"]
]

// --- hwBoardCommunicationLinkFaultAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.19.2.25.1
// Fields: entPhysicalIndex, entPhysicalName
// Description: This alarm is generated when a slot encounters a fault.
trapMap["1.3.6.1.4.1.2011.5.25.19.2.25.1"] = [
    name: "hwBoardCommunicationLinkFaultAlarm",
    fields: ["entPhysicalIndex", "entPhysicalName"],
    fieldOids: ["entPhysicalIndex": "1.3.6.1.2.1.47.1.1.1.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwBoardCommunicationLinkFaultResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.19.2.25.2
// Fields: entPhysicalIndex, entPhysicalName
// Description: This alarm is cleared when the fault in a slot is rectified.
trapMap["1.3.6.1.4.1.2011.5.25.19.2.25.2"] = [
    name: "hwBoardCommunicationLinkFaultResume",
    fields: ["entPhysicalIndex", "entPhysicalName"],
    fieldOids: ["entPhysicalIndex": "1.3.6.1.2.1.47.1.1.1.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwOMUSyncFailAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.19.2.26.1
// Fields: hwSyncBoardName, hwSyncAction
// Description: This alarm is generated when the OMU data synchronization timed out.
trapMap["1.3.6.1.4.1.2011.5.25.19.2.26.1"] = [
    name: "hwOMUSyncFailAlarm",
    fields: ["hwSyncBoardName", "hwSyncAction"],
    fieldOids: ["hwSyncBoardName": "1.3.6.1.4.1.2011.5.25.19.2.26.3", "hwSyncAction": "1.3.6.1.4.1.2011.5.25.19.2.26.4"]
]

// --- hwOMUSyncFailResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.19.2.26.2
// Fields: hwSyncBoardName, hwSyncAction
// Description: This alarm is cleared when the OMU data synchronization failure was removed.
trapMap["1.3.6.1.4.1.2011.5.25.19.2.26.2"] = [
    name: "hwOMUSyncFailResume",
    fields: ["hwSyncBoardName", "hwSyncAction"],
    fieldOids: ["hwSyncBoardName": "1.3.6.1.4.1.2011.5.25.19.2.26.3", "hwSyncAction": "1.3.6.1.4.1.2011.5.25.19.2.26.4"]
]

// --- hwSysPatchDamagedNotification (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.19.2.27
// Fields: entPhysicalName, hwPatchFileName
// Description: The patch package running on a board was damaged.
trapMap["1.3.6.1.4.1.2011.5.25.19.2.27"] = [
    name: "hwSysPatchDamagedNotification",
    fields: ["entPhysicalName", "hwPatchFileName"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwPatchFileName": "1.3.6.1.4.1.2011.5.25.19.1.8.2.1.2"]
]

// --- hwSysPatchDamagedClearNotification (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.19.2.28
// Fields: entPhysicalName, hwPatchFileName
// Description: The damaged patch package running on a board recovered.
trapMap["1.3.6.1.4.1.2011.5.25.19.2.28"] = [
    name: "hwSysPatchDamagedClearNotification",
    fields: ["entPhysicalName", "hwPatchFileName"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwPatchFileName": "1.3.6.1.4.1.2011.5.25.19.1.8.2.1.2"]
]

// --- hwSysColdPatchNotEffectNotification (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.19.2.29
// Fields: entPhysicalIndex, entPhysicalName, hwPatchAlarmReason
// Description: The running status of the cold patch is different from that expected.
trapMap["1.3.6.1.4.1.2011.5.25.19.2.29"] = [
    name: "hwSysColdPatchNotEffectNotification",
    fields: ["entPhysicalIndex", "entPhysicalName", "hwPatchAlarmReason"],
    fieldOids: ["entPhysicalIndex": "1.3.6.1.2.1.47.1.1.1.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwPatchAlarmReason": "1.3.6.1.4.1.2011.5.25.19.1.8.1.10"]
]

// --- hwSysColdPatchNotEffectClearNotification (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.19.2.30
// Fields: entPhysicalIndex, entPhysicalName, hwPatchAlarmReason
// Description: The running status of the cold patch becomes the same as that expected.
trapMap["1.3.6.1.4.1.2011.5.25.19.2.30"] = [
    name: "hwSysColdPatchNotEffectClearNotification",
    fields: ["entPhysicalIndex", "entPhysicalName", "hwPatchAlarmReason"],
    fieldOids: ["entPhysicalIndex": "1.3.6.1.2.1.47.1.1.1.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwPatchAlarmReason": "1.3.6.1.4.1.2011.5.25.19.1.8.1.10"]
]

// --- hwTpmChipFault (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.19.2.31
// Fields: entPhysicalIndex, entPhysicalName
// Description: A HTM fault occurred on a board.
trapMap["1.3.6.1.4.1.2011.5.25.19.2.31"] = [
    name: "hwTpmChipFault",
    fields: ["entPhysicalIndex", "entPhysicalName"],
    fieldOids: ["entPhysicalIndex": "1.3.6.1.2.1.47.1.1.1.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwTpmChipFaultClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.19.2.32
// Fields: entPhysicalIndex, entPhysicalName
// Description: The HTM fault on the board was rectified.
trapMap["1.3.6.1.4.1.2011.5.25.19.2.32"] = [
    name: "hwTpmChipFaultClear",
    fields: ["entPhysicalIndex", "entPhysicalName"],
    fieldOids: ["entPhysicalIndex": "1.3.6.1.2.1.47.1.1.1.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwSysPackageVerifyFailed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.19.2.33
// Fields: entPhysicalName, hwSysImageName, hwSysImageReason
// Description: The software package verify failed.
trapMap["1.3.6.1.4.1.2011.5.25.19.2.33"] = [
    name: "hwSysPackageVerifyFailed",
    fields: ["entPhysicalName", "hwSysImageName", "hwSysImageReason"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwSysImageName": "1.3.6.1.4.1.2011.5.25.19.1.4.2.1.2", "hwSysImageReason": "1.3.6.1.4.1.2011.5.25.19.1.4.2.1.6"]
]

// --- hwSysImageDamagedResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.19.2.34
// Fields: entPhysicalName, hwSysImageName
// Description: The damaged image file in the board was rectified.
trapMap["1.3.6.1.4.1.2011.5.25.19.2.34"] = [
    name: "hwSysImageDamagedResume",
    fields: ["entPhysicalName", "hwSysImageName"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwSysImageName": "1.3.6.1.4.1.2011.5.25.19.1.4.2.1.2"]
]

// --- hwSysPackageVerifyFailedResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.19.2.35
// Fields: entPhysicalName, hwSysImageName, hwSysImageReason
// Description: Verify the software package succeeded.
trapMap["1.3.6.1.4.1.2011.5.25.19.2.35"] = [
    name: "hwSysPackageVerifyFailedResume",
    fields: ["entPhysicalName", "hwSysImageName", "hwSysImageReason"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwSysImageName": "1.3.6.1.4.1.2011.5.25.19.1.4.2.1.2", "hwSysImageReason": "1.3.6.1.4.1.2011.5.25.19.1.4.2.1.6"]
]

// --- hwApplicationFault (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.19.2.36.1
// Fields: hwApplicationType, hwApplicationSlotId, hwFaultReason
// Description: This alarm is application start failed or abnormal exit.
trapMap["1.3.6.1.4.1.2011.5.25.19.2.36.1"] = [
    name: "hwApplicationFault",
    fields: ["hwApplicationType", "hwApplicationSlotId", "hwFaultReason"],
    fieldOids: ["hwApplicationType": "1.3.6.1.4.1.2011.5.25.19.1.30.1.1.1", "hwApplicationSlotId": "1.3.6.1.4.1.2011.5.25.19.1.30.1.1.2", "hwFaultReason": "1.3.6.1.4.1.2011.5.25.19.1.30.1.1.3"]
]

// --- hwApplicationFaultClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.19.2.36.2
// Fields: hwApplicationType, hwApplicationSlotId
// Description: This alarm is cleared when the application start successfully or undeploy.
trapMap["1.3.6.1.4.1.2011.5.25.19.2.36.2"] = [
    name: "hwApplicationFaultClear",
    fields: ["hwApplicationType", "hwApplicationSlotId"],
    fieldOids: ["hwApplicationType": "1.3.6.1.4.1.2011.5.25.19.1.30.1.1.1", "hwApplicationSlotId": "1.3.6.1.4.1.2011.5.25.19.1.30.1.1.2"]
]

// --- hwTrustemCertificateExpiredAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.19.2.37.1
// Fields: hwTrustemCertificateIndex, hwTrustemCertificateName
// Description: This alarm is generated when the trustem certificate expires.
trapMap["1.3.6.1.4.1.2011.5.25.19.2.37.1"] = [
    name: "hwTrustemCertificateExpiredAlarm",
    fields: ["hwTrustemCertificateIndex", "hwTrustemCertificateName"],
    fieldOids: ["hwTrustemCertificateIndex": "1.3.6.1.4.1.2011.5.25.19.1.26.3.1.1", "hwTrustemCertificateName": "1.3.6.1.4.1.2011.5.25.19.1.26.3.1.2"]
]

// --- hwTrustemCertificateExpiredResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.19.2.37.2
// Fields: hwTrustemCertificateIndex, hwTrustemCertificateName
// Description: Notification that the alarm has been cleared.
trapMap["1.3.6.1.4.1.2011.5.25.19.2.37.2"] = [
    name: "hwTrustemCertificateExpiredResume",
    fields: ["hwTrustemCertificateIndex", "hwTrustemCertificateName"],
    fieldOids: ["hwTrustemCertificateIndex": "1.3.6.1.4.1.2011.5.25.19.1.26.3.1.1", "hwTrustemCertificateName": "1.3.6.1.4.1.2011.5.25.19.1.26.3.1.2"]
]

// --- hwTrustemCertificateExpiredEarlyWarning (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.19.2.37.3
// Fields: hwTrustemCertificateIndex, hwTrustemCertificateName
// Description: This alarm is generated 30 days before the trustem certificate expires.
trapMap["1.3.6.1.4.1.2011.5.25.19.2.37.3"] = [
    name: "hwTrustemCertificateExpiredEarlyWarning",
    fields: ["hwTrustemCertificateIndex", "hwTrustemCertificateName"],
    fieldOids: ["hwTrustemCertificateIndex": "1.3.6.1.4.1.2011.5.25.19.1.26.3.1.1", "hwTrustemCertificateName": "1.3.6.1.4.1.2011.5.25.19.1.26.3.1.2"]
]

// --- hwTrustemCertificateExpiredEarlyResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.19.2.37.4
// Fields: hwTrustemCertificateIndex, hwTrustemCertificateName
// Description: Notification that the alarm has been cleared.
trapMap["1.3.6.1.4.1.2011.5.25.19.2.37.4"] = [
    name: "hwTrustemCertificateExpiredEarlyResume",
    fields: ["hwTrustemCertificateIndex", "hwTrustemCertificateName"],
    fieldOids: ["hwTrustemCertificateIndex": "1.3.6.1.4.1.2011.5.25.19.1.26.3.1.1", "hwTrustemCertificateName": "1.3.6.1.4.1.2011.5.25.19.1.26.3.1.2"]
]

// --- hwStartupSecureVersionNeedRefresh (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.19.2.38.2
// Fields: hwSecureSlot
// Description: The alarm is generated when the secure boot version configuration needs to be updated.
trapMap["1.3.6.1.4.1.2011.5.25.19.2.38.2"] = [
    name: "hwStartupSecureVersionNeedRefresh",
    fields: ["hwSecureSlot"],
    fieldOids: ["hwSecureSlot": "1.3.6.1.4.1.2011.5.25.19.2.38.1"]
]

// --- hwStartupSecureVersionNeedRefreshResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.19.2.38.3
// Fields: hwSecureSlot
// Description: This alarm is cleared when the secure boot version configuration is updated.
trapMap["1.3.6.1.4.1.2011.5.25.19.2.38.3"] = [
    name: "hwStartupSecureVersionNeedRefreshResume",
    fields: ["hwSecureSlot"],
    fieldOids: ["hwSecureSlot": "1.3.6.1.4.1.2011.5.25.19.2.38.1"]
]

// --- hwSmartUpgradeUserDataRetentionPeriodHasExpired (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.19.2.39.1
// Description: The alarm is generated when the smart-upgrade data retention period has expired.
trapMap["1.3.6.1.4.1.2011.5.25.19.2.39.1"] = [
    name: "hwSmartUpgradeUserDataRetentionPeriodHasExpired",
    fields: [],
    fieldOids: []
]

// --- hwSmartUpgradeUserDataRetentionPeriodHasExpiredResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.19.2.39.2
// Description: This alarm is cleared when the smart-upgrade data is updated.
trapMap["1.3.6.1.4.1.2011.5.25.19.2.39.2"] = [
    name: "hwSmartUpgradeUserDataRetentionPeriodHasExpiredResume",
    fields: [],
    fieldOids: []
]

// --- hwSysNetconfCfgRecoverFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.19.2.40
// Description: Restore netconf rdb cfg have some errors.
trapMap["1.3.6.1.4.1.2011.5.25.19.2.40"] = [
    name: "hwSysNetconfCfgRecoverFail",
    fields: [],
    fieldOids: []
]

// --- hwSecurityRisk (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.19.2.41
// Fields: hwSecurityRiskType
// Description: This alarm is generated when the system has insecure configurations.
trapMap["1.3.6.1.4.1.2011.5.25.19.2.41"] = [
    name: "hwSecurityRisk",
    fields: ["hwSecurityRiskType"],
    fieldOids: ["hwSecurityRiskType": "1.3.6.1.4.1.2011.5.25.19.1.31"]
]

// --- hwSecurityRiskClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.19.2.42
// Fields: hwSecurityRiskType
// Description: This alarm is cleared when the system has no insecure configurations.
trapMap["1.3.6.1.4.1.2011.5.25.19.2.42"] = [
    name: "hwSecurityRiskClear",
    fields: ["hwSecurityRiskType"],
    fieldOids: ["hwSecurityRiskType": "1.3.6.1.4.1.2011.5.25.19.1.31"]
]

// --- hwPackageOperationSuccess (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.19.2.43.2.1
// Fields: hwPackageOperationType, hwPackageType, hwPackageName, hwPackageVersion
// Description: Notification about a software package operation success. This trap is reported when software package installation, uninstallation, upgrade, or reboot succeeds. The trap content includes hwPackageOpera...
trapMap["1.3.6.1.4.1.2011.5.25.19.2.43.2.1"] = [
    name: "hwPackageOperationSuccess",
    fields: ["hwPackageOperationType", "hwPackageType", "hwPackageName", "hwPackageVersion"],
    fieldOids: ["hwPackageOperationType": "1.3.6.1.4.1.2011.5.25.19.2.43.1.1", "hwPackageType": "1.3.6.1.4.1.2011.5.25.19.2.43.1.2", "hwPackageName": "1.3.6.1.4.1.2011.5.25.19.1.8.1.9", "hwPackageVersion": "1.3.6.1.4.1.2011.5.25.19.2.43.1.3"]
]

// --- hwPackageVersionDowngrade (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.19.2.43.2.2
// Fields: hwPreviousPackage, hwPreviousVersion, hwPackageName, hwCurrentVersion
// Description: Notification about a software package version downgrade. This trap is reported when the software package version is downgraded. The trap content includes hwPreviousPackage, hwPreviousVersion, hwPackag...
trapMap["1.3.6.1.4.1.2011.5.25.19.2.43.2.2"] = [
    name: "hwPackageVersionDowngrade",
    fields: ["hwPreviousPackage", "hwPreviousVersion", "hwPackageName", "hwCurrentVersion"],
    fieldOids: ["hwPreviousPackage": "1.3.6.1.4.1.2011.5.25.19.2.43.1.6", "hwPreviousVersion": "1.3.6.1.4.1.2011.5.25.19.2.43.1.4", "hwPackageName": "1.3.6.1.4.1.2011.5.25.19.1.8.1.9", "hwCurrentVersion": "1.3.6.1.4.1.2011.5.25.19.2.43.1.5"]
]

// --- hwPackageOperationFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.19.2.43.2.3
// Fields: hwPackageOperationType, hwPackageType, hwPackageName, hwPackageVersion, hwFailReason
// Description: Notification about a software package operation fail. This trap is reported when startup system software, install feature software, uninstall feature software, upgrade feature software, startup featur...
trapMap["1.3.6.1.4.1.2011.5.25.19.2.43.2.3"] = [
    name: "hwPackageOperationFail",
    fields: ["hwPackageOperationType", "hwPackageType", "hwPackageName", "hwPackageVersion", "hwFailReason"],
    fieldOids: ["hwPackageOperationType": "1.3.6.1.4.1.2011.5.25.19.2.43.1.1", "hwPackageType": "1.3.6.1.4.1.2011.5.25.19.2.43.1.2", "hwPackageName": "1.3.6.1.4.1.2011.5.25.19.1.8.1.9", "hwPackageVersion": "1.3.6.1.4.1.2011.5.25.19.2.43.1.3", "hwFailReason": "1.3.6.1.4.1.2011.5.25.19.2.43.1.7"]
]

// --- hwComponentBackupFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.19.2.44.2.1
// Fields: hwBackupComponentName, hwBackupProcessId, hwBackupBlockId
// Description: This alarm is generated when data backup between the active and standby components fails.
trapMap["1.3.6.1.4.1.2011.5.25.19.2.44.2.1"] = [
    name: "hwComponentBackupFail",
    fields: ["hwBackupComponentName", "hwBackupProcessId", "hwBackupBlockId"],
    fieldOids: ["hwBackupComponentName": "1.3.6.1.4.1.2011.5.25.19.2.44.1.1", "hwBackupProcessId": "1.3.6.1.4.1.2011.5.25.19.2.44.1.2", "hwBackupBlockId": "1.3.6.1.4.1.2011.5.25.19.2.44.1.3"]
]

// --- hwComponentBackupFailResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.19.2.44.2.2
// Fields: hwBackupComponentName, hwBackupProcessId
// Description: This alarm is cleared when the data of the active and standby components is successfully backed up.
trapMap["1.3.6.1.4.1.2011.5.25.19.2.44.2.2"] = [
    name: "hwComponentBackupFailResume",
    fields: ["hwBackupComponentName", "hwBackupProcessId"],
    fieldOids: ["hwBackupComponentName": "1.3.6.1.4.1.2011.5.25.19.2.44.1.1", "hwBackupProcessId": "1.3.6.1.4.1.2011.5.25.19.2.44.1.2"]
]

// --- hwProcessFaultAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.19.2.52.2.1
// Fields: hwFaultSlotId, hwFaultProcessName, hwFaultProcessId, hwProcessFaultReason
// Description: The process is faulty.
trapMap["1.3.6.1.4.1.2011.5.25.19.2.52.2.1"] = [
    name: "hwProcessFaultAlarm",
    fields: ["hwFaultSlotId", "hwFaultProcessName", "hwFaultProcessId", "hwProcessFaultReason"],
    fieldOids: ["hwFaultSlotId": "1.3.6.1.4.1.2011.5.25.19.2.52.1.1", "hwFaultProcessName": "1.3.6.1.4.1.2011.5.25.19.2.52.1.3", "hwFaultProcessId": "1.3.6.1.4.1.2011.5.25.19.2.52.1.2", "hwProcessFaultReason": "1.3.6.1.4.1.2011.5.25.19.2.52.1.4"]
]

// --- hwProcessFaultAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.19.2.52.2.2
// Fields: hwFaultSlotId, hwFaultProcessName, hwFaultProcessId, hwProcessFaultReason
// Description: The process fault is rectified.
trapMap["1.3.6.1.4.1.2011.5.25.19.2.52.2.2"] = [
    name: "hwProcessFaultAlarmResume",
    fields: ["hwFaultSlotId", "hwFaultProcessName", "hwFaultProcessId", "hwProcessFaultReason"],
    fieldOids: ["hwFaultSlotId": "1.3.6.1.4.1.2011.5.25.19.2.52.1.1", "hwFaultProcessName": "1.3.6.1.4.1.2011.5.25.19.2.52.1.3", "hwFaultProcessId": "1.3.6.1.4.1.2011.5.25.19.2.52.1.2", "hwProcessFaultReason": "1.3.6.1.4.1.2011.5.25.19.2.52.1.4"]
]

// --- hwOnboardFirmwareDamaged (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.19.2.45
// Fields: entPhysicalIndex, entPhysicalName
// Description: The onboard firmware is damaged.
trapMap["1.3.6.1.4.1.2011.5.25.19.2.45"] = [
    name: "hwOnboardFirmwareDamaged",
    fields: ["entPhysicalIndex", "entPhysicalName"],
    fieldOids: ["entPhysicalIndex": "1.3.6.1.2.1.47.1.1.1.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwOncardFirmwareDamaged (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.19.2.47
// Fields: entPhysicalIndex, entPhysicalName
// Description: The on-card firmware is damaged.
trapMap["1.3.6.1.4.1.2011.5.25.19.2.47"] = [
    name: "hwOncardFirmwareDamaged",
    fields: ["entPhysicalIndex", "entPhysicalName"],
    fieldOids: ["entPhysicalIndex": "1.3.6.1.2.1.47.1.1.1.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwOncardFirmwareDamagedResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.19.2.51
// Fields: entPhysicalIndex, entPhysicalName
// Description: The damaged firmware on the card was rectified.
trapMap["1.3.6.1.4.1.2011.5.25.19.2.51"] = [
    name: "hwOncardFirmwareDamagedResume",
    fields: ["entPhysicalIndex", "entPhysicalName"],
    fieldOids: ["entPhysicalIndex": "1.3.6.1.2.1.47.1.1.1.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwBIMMemoryFull (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.19.2.46.2.1
// Fields: hwBIMChassisId, hwBIMSlotId, hwBIMLocationId, hwBIMErrorCode
// Description: The database that records resource allocation information is full.
trapMap["1.3.6.1.4.1.2011.5.25.19.2.46.2.1"] = [
    name: "hwBIMMemoryFull",
    fields: ["hwBIMChassisId", "hwBIMSlotId", "hwBIMLocationId", "hwBIMErrorCode"],
    fieldOids: ["hwBIMChassisId": "1.3.6.1.4.1.2011.5.25.19.2.46.1.1", "hwBIMSlotId": "1.3.6.1.4.1.2011.5.25.19.2.46.1.2", "hwBIMLocationId": "1.3.6.1.4.1.2011.5.25.19.2.46.1.3", "hwBIMErrorCode": "1.3.6.1.4.1.2011.5.25.19.2.46.1.4"]
]

// --- hwBIMMemoryFullResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.19.2.46.2.2
// Fields: hwBIMChassisId, hwBIMSlotId, hwBIMLocationId, hwBIMErrorCode
// Description: The database that records resource allocation information can be used.
trapMap["1.3.6.1.4.1.2011.5.25.19.2.46.2.2"] = [
    name: "hwBIMMemoryFullResume",
    fields: ["hwBIMChassisId", "hwBIMSlotId", "hwBIMLocationId", "hwBIMErrorCode"],
    fieldOids: ["hwBIMChassisId": "1.3.6.1.4.1.2011.5.25.19.2.46.1.1", "hwBIMSlotId": "1.3.6.1.4.1.2011.5.25.19.2.46.1.2", "hwBIMLocationId": "1.3.6.1.4.1.2011.5.25.19.2.46.1.3", "hwBIMErrorCode": "1.3.6.1.4.1.2011.5.25.19.2.46.1.4"]
]

// --- hwEulaNotSigned (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.19.2.48.1
// Fields: hwEulaRemainingDays
// Description: This alarm is generated when the End User License Agreement (EULA) has not been accepted.
trapMap["1.3.6.1.4.1.2011.5.25.19.2.48.1"] = [
    name: "hwEulaNotSigned",
    fields: ["hwEulaRemainingDays"],
    fieldOids: ["hwEulaRemainingDays": "1.3.6.1.4.1.2011.5.25.19.1.32.1"]
]

// --- hwEulaNotSignedResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.19.2.48.2
// Fields: hwEulaRemainingDays
// Description: Notification that the End User License Agreement (EULA) has been manually signed.
trapMap["1.3.6.1.4.1.2011.5.25.19.2.48.2"] = [
    name: "hwEulaNotSignedResume",
    fields: ["hwEulaRemainingDays"],
    fieldOids: ["hwEulaRemainingDays": "1.3.6.1.4.1.2011.5.25.19.1.32.1"]
]

// --- hw3rdPluginUpdateFailed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.19.2.49
// Fields: hwPluginSlotId, hwPluginName, hwPluginFailReason
// Description: The 3rd-party plug-in package update failed.
trapMap["1.3.6.1.4.1.2011.5.25.19.2.49"] = [
    name: "hw3rdPluginUpdateFailed",
    fields: ["hwPluginSlotId", "hwPluginName", "hwPluginFailReason"],
    fieldOids: ["hwPluginSlotId": "1.3.6.1.4.1.2011.5.25.19.1.33.1", "hwPluginName": "1.3.6.1.4.1.2011.5.25.19.1.33.2", "hwPluginFailReason": "1.3.6.1.4.1.2011.5.25.19.1.33.3"]
]

// --- hwBoardRoleAbnormal (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.19.2.53.1
// Fields: entPhysicalIndex, entPhysicalName
// Description: The alarm is generated when the active/standby role of the board is abnormal.
trapMap["1.3.6.1.4.1.2011.5.25.19.2.53.1"] = [
    name: "hwBoardRoleAbnormal",
    fields: ["entPhysicalIndex", "entPhysicalName"],
    fieldOids: ["entPhysicalIndex": "1.3.6.1.2.1.47.1.1.1.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwBoardRoleAbnormalResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.19.2.53.2
// Fields: entPhysicalIndex, entPhysicalName
// Description: The alarm is cleared when the active/standby role of the board becomes normal.
trapMap["1.3.6.1.4.1.2011.5.25.19.2.53.2"] = [
    name: "hwBoardRoleAbnormalResume",
    fields: ["entPhysicalIndex", "entPhysicalName"],
    fieldOids: ["entPhysicalIndex": "1.3.6.1.2.1.47.1.1.1.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwHipsAbnormalBehaviorDetected (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.19.2.50.1
// Fields: hwHipsEventCategory, hwHipsEventType, hwHipsEventLevel, hwHipsOccurTime, hwHipsOperationResult, hwHipsUserName, hwHipsVisitorIp, hwHipsEvidence, hwHipsSlotId, hwHipsCardId, hwHipsCpuId, hwHipsBarcode
// Description: This event is generated when the abnormal behavior has been detected.
trapMap["1.3.6.1.4.1.2011.5.25.19.2.50.1"] = [
    name: "hwHipsAbnormalBehaviorDetected",
    fields: ["hwHipsEventCategory", "hwHipsEventType", "hwHipsEventLevel", "hwHipsOccurTime", "hwHipsOperationResult", "hwHipsUserName", "hwHipsVisitorIp", "hwHipsEvidence", "hwHipsSlotId", "hwHipsCardId", "hwHipsCpuId", "hwHipsBarcode"],
    fieldOids: ["hwHipsEventCategory": "1.3.6.1.4.1.2011.5.25.19.1.34.1", "hwHipsEventType": "1.3.6.1.4.1.2011.5.25.19.1.34.2", "hwHipsEventLevel": "1.3.6.1.4.1.2011.5.25.19.1.34.3", "hwHipsOccurTime": "1.3.6.1.4.1.2011.5.25.19.1.34.4", "hwHipsOperationResult": "1.3.6.1.4.1.2011.5.25.19.1.34.5", "hwHipsUserName": "1.3.6.1.4.1.2011.5.25.19.1.34.6", "hwHipsVisitorIp": "1.3.6.1.4.1.2011.5.25.19.1.34.7", "hwHipsEvidence": "1.3.6.1.4.1.2011.5.25.19.1.34.8", "hwHipsSlotId": "1.3.6.1.4.1.2011.5.25.19.1.34.9", "hwHipsCardId": "1.3.6.1.4.1.2011.5.25.19.1.34.10", "hwHipsCpuId": "1.3.6.1.4.1.2011.5.25.19.1.34.11", "hwHipsBarcode": "1.3.6.1.4.1.2011.5.25.19.1.34.12"]
]

// --- hwHipsAbnormalBehaviorResolved (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.19.2.50.2
// Fields: hwHipsEventCategory, hwHipsEventType, hwHipsOperationResult, hwHipsEvidence, hwHipsSlotId, hwHipsCardId, hwHipsCpuId, hwHipsBarcode
// Description: Notification that the the abnormal behavior has been resolved.
trapMap["1.3.6.1.4.1.2011.5.25.19.2.50.2"] = [
    name: "hwHipsAbnormalBehaviorResolved",
    fields: ["hwHipsEventCategory", "hwHipsEventType", "hwHipsOperationResult", "hwHipsEvidence", "hwHipsSlotId", "hwHipsCardId", "hwHipsCpuId", "hwHipsBarcode"],
    fieldOids: ["hwHipsEventCategory": "1.3.6.1.4.1.2011.5.25.19.1.34.1", "hwHipsEventType": "1.3.6.1.4.1.2011.5.25.19.1.34.2", "hwHipsOperationResult": "1.3.6.1.4.1.2011.5.25.19.1.34.5", "hwHipsEvidence": "1.3.6.1.4.1.2011.5.25.19.1.34.8", "hwHipsSlotId": "1.3.6.1.4.1.2011.5.25.19.1.34.9", "hwHipsCardId": "1.3.6.1.4.1.2011.5.25.19.1.34.10", "hwHipsCpuId": "1.3.6.1.4.1.2011.5.25.19.1.34.11", "hwHipsBarcode": "1.3.6.1.4.1.2011.5.25.19.1.34.12"]
]

// --- hwHipsAbnormalShellDetected (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.19.2.50.3
// Fields: hwHipsEventCategory, hwHipsEventType, hwHipsEventLevel, hwHipsOccurTime, hwHipsOperationResult, hwHipsShellPath, hwHipsOperationType, hwHipsCmdLine, hwHipsAttributeType, hwHipsOldAttribute, hwHipsNewAttribute, hwHipsSlotId, hwHipsCardId, hwHipsCpuId, hwHipsBarcode
// Description: This event is generated when the abnormal shell behavior has been detected.
trapMap["1.3.6.1.4.1.2011.5.25.19.2.50.3"] = [
    name: "hwHipsAbnormalShellDetected",
    fields: ["hwHipsEventCategory", "hwHipsEventType", "hwHipsEventLevel", "hwHipsOccurTime", "hwHipsOperationResult", "hwHipsShellPath", "hwHipsOperationType", "hwHipsCmdLine", "hwHipsAttributeType", "hwHipsOldAttribute", "hwHipsNewAttribute", "hwHipsSlotId", "hwHipsCardId", "hwHipsCpuId", "hwHipsBarcode"],
    fieldOids: ["hwHipsEventCategory": "1.3.6.1.4.1.2011.5.25.19.1.34.1", "hwHipsEventType": "1.3.6.1.4.1.2011.5.25.19.1.34.2", "hwHipsEventLevel": "1.3.6.1.4.1.2011.5.25.19.1.34.3", "hwHipsOccurTime": "1.3.6.1.4.1.2011.5.25.19.1.34.4", "hwHipsOperationResult": "1.3.6.1.4.1.2011.5.25.19.1.34.5", "hwHipsShellPath": "1.3.6.1.4.1.2011.5.25.19.1.34.13", "hwHipsOperationType": "1.3.6.1.4.1.2011.5.25.19.1.34.14", "hwHipsCmdLine": "1.3.6.1.4.1.2011.5.25.19.1.34.15", "hwHipsAttributeType": "1.3.6.1.4.1.2011.5.25.19.1.34.16", "hwHipsOldAttribute": "1.3.6.1.4.1.2011.5.25.19.1.34.17", "hwHipsNewAttribute": "1.3.6.1.4.1.2011.5.25.19.1.34.18", "hwHipsSlotId": "1.3.6.1.4.1.2011.5.25.19.1.34.9", "hwHipsCardId": "1.3.6.1.4.1.2011.5.25.19.1.34.10", "hwHipsCpuId": "1.3.6.1.4.1.2011.5.25.19.1.34.11", "hwHipsBarcode": "1.3.6.1.4.1.2011.5.25.19.1.34.12"]
]

// --- hwHipsFilePrivilegeEscalated (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.19.2.50.4
// Fields: hwHipsEventCategory, hwHipsEventType, hwHipsEventLevel, hwHipsOccurTime, hwHipsOperationResult, hwHipsFilePath, hwHipsMethod, hwHipsSlotId, hwHipsCardId, hwHipsCpuId, hwHipsBarcode
// Description: This event is generated when the file privilege has been escalated.
trapMap["1.3.6.1.4.1.2011.5.25.19.2.50.4"] = [
    name: "hwHipsFilePrivilegeEscalated",
    fields: ["hwHipsEventCategory", "hwHipsEventType", "hwHipsEventLevel", "hwHipsOccurTime", "hwHipsOperationResult", "hwHipsFilePath", "hwHipsMethod", "hwHipsSlotId", "hwHipsCardId", "hwHipsCpuId", "hwHipsBarcode"],
    fieldOids: ["hwHipsEventCategory": "1.3.6.1.4.1.2011.5.25.19.1.34.1", "hwHipsEventType": "1.3.6.1.4.1.2011.5.25.19.1.34.2", "hwHipsEventLevel": "1.3.6.1.4.1.2011.5.25.19.1.34.3", "hwHipsOccurTime": "1.3.6.1.4.1.2011.5.25.19.1.34.4", "hwHipsOperationResult": "1.3.6.1.4.1.2011.5.25.19.1.34.5", "hwHipsFilePath": "1.3.6.1.4.1.2011.5.25.19.1.34.19", "hwHipsMethod": "1.3.6.1.4.1.2011.5.25.19.1.34.20", "hwHipsSlotId": "1.3.6.1.4.1.2011.5.25.19.1.34.9", "hwHipsCardId": "1.3.6.1.4.1.2011.5.25.19.1.34.10", "hwHipsCpuId": "1.3.6.1.4.1.2011.5.25.19.1.34.11", "hwHipsBarcode": "1.3.6.1.4.1.2011.5.25.19.1.34.12"]
]

// --- hwHipsKeyfileTampered (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.19.2.50.5
// Fields: hwHipsEventCategory, hwHipsEventType, hwHipsEventLevel, hwHipsOccurTime, hwHipsOperationResult, hwHipsUserName, hwHipsLoginTime, hwHipsVisitorIp, hwHipsFilePath, hwHipsOperationType, hwHipsProcessPath, hwHipsAttributeType, hwHipsOldAttribute, hwHipsNewAttribute, hwHipsSlotId, hwHipsCardId, hwHipsCpuId, hwHipsBarcode
// Description: The file is created or modified.
trapMap["1.3.6.1.4.1.2011.5.25.19.2.50.5"] = [
    name: "hwHipsKeyfileTampered",
    fields: ["hwHipsEventCategory", "hwHipsEventType", "hwHipsEventLevel", "hwHipsOccurTime", "hwHipsOperationResult", "hwHipsUserName", "hwHipsLoginTime", "hwHipsVisitorIp", "hwHipsFilePath", "hwHipsOperationType", "hwHipsProcessPath", "hwHipsAttributeType", "hwHipsOldAttribute", "hwHipsNewAttribute", "hwHipsSlotId", "hwHipsCardId", "hwHipsCpuId", "hwHipsBarcode"],
    fieldOids: ["hwHipsEventCategory": "1.3.6.1.4.1.2011.5.25.19.1.34.1", "hwHipsEventType": "1.3.6.1.4.1.2011.5.25.19.1.34.2", "hwHipsEventLevel": "1.3.6.1.4.1.2011.5.25.19.1.34.3", "hwHipsOccurTime": "1.3.6.1.4.1.2011.5.25.19.1.34.4", "hwHipsOperationResult": "1.3.6.1.4.1.2011.5.25.19.1.34.5", "hwHipsUserName": "1.3.6.1.4.1.2011.5.25.19.1.34.6", "hwHipsLoginTime": "1.3.6.1.4.1.2011.5.25.19.1.34.21", "hwHipsVisitorIp": "1.3.6.1.4.1.2011.5.25.19.1.34.7", "hwHipsFilePath": "1.3.6.1.4.1.2011.5.25.19.1.34.19", "hwHipsOperationType": "1.3.6.1.4.1.2011.5.25.19.1.34.14", "hwHipsProcessPath": "1.3.6.1.4.1.2011.5.25.19.1.34.22", "hwHipsAttributeType": "1.3.6.1.4.1.2011.5.25.19.1.34.16", "hwHipsOldAttribute": "1.3.6.1.4.1.2011.5.25.19.1.34.17", "hwHipsNewAttribute": "1.3.6.1.4.1.2011.5.25.19.1.34.18", "hwHipsSlotId": "1.3.6.1.4.1.2011.5.25.19.1.34.9", "hwHipsCardId": "1.3.6.1.4.1.2011.5.25.19.1.34.10", "hwHipsCpuId": "1.3.6.1.4.1.2011.5.25.19.1.34.11", "hwHipsBarcode": "1.3.6.1.4.1.2011.5.25.19.1.34.12"]
]

// --- hwHipsRootkitAttack (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.19.2.50.6
// Fields: hwHipsEventCategory, hwHipsOccurTime, hwHipsOperationResult, hwHipsRootkitName, hwHipsDetectionType, hwHipsDetectedThreat, hwHipsDetectionSource, hwHipsSlotId, hwHipsCardId, hwHipsCpuId, hwHipsBarcode
// Description: Rootkit is detected.
trapMap["1.3.6.1.4.1.2011.5.25.19.2.50.6"] = [
    name: "hwHipsRootkitAttack",
    fields: ["hwHipsEventCategory", "hwHipsOccurTime", "hwHipsOperationResult", "hwHipsRootkitName", "hwHipsDetectionType", "hwHipsDetectedThreat", "hwHipsDetectionSource", "hwHipsSlotId", "hwHipsCardId", "hwHipsCpuId", "hwHipsBarcode"],
    fieldOids: ["hwHipsEventCategory": "1.3.6.1.4.1.2011.5.25.19.1.34.1", "hwHipsOccurTime": "1.3.6.1.4.1.2011.5.25.19.1.34.4", "hwHipsOperationResult": "1.3.6.1.4.1.2011.5.25.19.1.34.5", "hwHipsRootkitName": "1.3.6.1.4.1.2011.5.25.19.1.34.23", "hwHipsDetectionType": "1.3.6.1.4.1.2011.5.25.19.1.34.24", "hwHipsDetectedThreat": "1.3.6.1.4.1.2011.5.25.19.1.34.25", "hwHipsDetectionSource": "1.3.6.1.4.1.2011.5.25.19.1.34.26", "hwHipsSlotId": "1.3.6.1.4.1.2011.5.25.19.1.34.9", "hwHipsCardId": "1.3.6.1.4.1.2011.5.25.19.1.34.10", "hwHipsCpuId": "1.3.6.1.4.1.2011.5.25.19.1.34.11", "hwHipsBarcode": "1.3.6.1.4.1.2011.5.25.19.1.34.12"]
]

// --- hwHipsUnauthorizedRootUser (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.19.2.50.7
// Fields: hwHipsEventCategory, hwHipsOccurTime, hwHipsOperationResult, hwHipsUnauthorizedUser, hwHipsGroupId, hwHipsHomePath, hwHipsShellPath, hwHipsUserId, hwHipsSlotId, hwHipsCardId, hwHipsCpuId, hwHipsBarcode
// Description: An unauthorized root user is detected.
trapMap["1.3.6.1.4.1.2011.5.25.19.2.50.7"] = [
    name: "hwHipsUnauthorizedRootUser",
    fields: ["hwHipsEventCategory", "hwHipsOccurTime", "hwHipsOperationResult", "hwHipsUnauthorizedUser", "hwHipsGroupId", "hwHipsHomePath", "hwHipsShellPath", "hwHipsUserId", "hwHipsSlotId", "hwHipsCardId", "hwHipsCpuId", "hwHipsBarcode"],
    fieldOids: ["hwHipsEventCategory": "1.3.6.1.4.1.2011.5.25.19.1.34.1", "hwHipsOccurTime": "1.3.6.1.4.1.2011.5.25.19.1.34.4", "hwHipsOperationResult": "1.3.6.1.4.1.2011.5.25.19.1.34.5", "hwHipsUnauthorizedUser": "1.3.6.1.4.1.2011.5.25.19.1.34.27", "hwHipsGroupId": "1.3.6.1.4.1.2011.5.25.19.1.34.28", "hwHipsHomePath": "1.3.6.1.4.1.2011.5.25.19.1.34.29", "hwHipsShellPath": "1.3.6.1.4.1.2011.5.25.19.1.34.13", "hwHipsUserId": "1.3.6.1.4.1.2011.5.25.19.1.34.30", "hwHipsSlotId": "1.3.6.1.4.1.2011.5.25.19.1.34.9", "hwHipsCardId": "1.3.6.1.4.1.2011.5.25.19.1.34.10", "hwHipsCpuId": "1.3.6.1.4.1.2011.5.25.19.1.34.11", "hwHipsBarcode": "1.3.6.1.4.1.2011.5.25.19.1.34.12"]
]

// --- hwTimerResThresholdExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.19.2.54.2.1
// Fields: hwTimerProcessName, hwTimerSlotId, hwTimerCpuId, hwTimerCurrentUsage, hwTimerThresholdUsage
// Description: The usage of timer resources exceeds the alarm threshold.
trapMap["1.3.6.1.4.1.2011.5.25.19.2.54.2.1"] = [
    name: "hwTimerResThresholdExceed",
    fields: ["hwTimerProcessName", "hwTimerSlotId", "hwTimerCpuId", "hwTimerCurrentUsage", "hwTimerThresholdUsage"],
    fieldOids: ["hwTimerProcessName": "1.3.6.1.4.1.2011.5.25.19.2.54.1.1", "hwTimerSlotId": "1.3.6.1.4.1.2011.5.25.19.2.54.1.2", "hwTimerCpuId": "1.3.6.1.4.1.2011.5.25.19.2.54.1.3", "hwTimerCurrentUsage": "1.3.6.1.4.1.2011.5.25.19.2.54.1.4", "hwTimerThresholdUsage": "1.3.6.1.4.1.2011.5.25.19.2.54.1.5"]
]

// --- hwTimerResThresholdExceedResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.19.2.54.2.2
// Fields: hwTimerProcessName, hwTimerSlotId, hwTimerCpuId, hwTimerCurrentUsage, hwTimerThresholdUsage
// Description: The usage of timer resources is less than the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.19.2.54.2.2"] = [
    name: "hwTimerResThresholdExceedResume",
    fields: ["hwTimerProcessName", "hwTimerSlotId", "hwTimerCpuId", "hwTimerCurrentUsage", "hwTimerThresholdUsage"],
    fieldOids: ["hwTimerProcessName": "1.3.6.1.4.1.2011.5.25.19.2.54.1.1", "hwTimerSlotId": "1.3.6.1.4.1.2011.5.25.19.2.54.1.2", "hwTimerCpuId": "1.3.6.1.4.1.2011.5.25.19.2.54.1.3", "hwTimerCurrentUsage": "1.3.6.1.4.1.2011.5.25.19.2.54.1.4", "hwTimerThresholdUsage": "1.3.6.1.4.1.2011.5.25.19.2.54.1.5"]
]

// ===== Lookup tables (inlined) =====
def lookupTables = [:]

// ===== Parsing logic =====

// Set to true to enable diagnostic logging for this MIB parser
DEBUG = false

LOG_PREFIX = "[HUAWEI-SYS-MAN-MIB]"
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
// --- Trap: hwSysClockChangedNotification (OID 1.3.6.1.4.1.2011.4.1.2.1) ---
if (trapRuleName == "hwSysClockChangedNotification") {
    event.setAlertGroup("System Clock Changed")
    def alertKey = ""
    event.setAlertKey(alertKey)
    def summary = "Hw Sys Clock Changed Notification" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(2)
    event.setEventType("13")
    def dyn = event.getDynamicFields() ?: [:]
    dyn["hwSysLocalClock"] = varbinds.get("hwSysLocalClock")
    event.setDynamicFields(dyn)
}
// --- Trap: hwSysReloadNotification (OID 1.3.6.1.4.1.2011.4.1.2.2) ---
if (trapRuleName == "hwSysReloadNotification") {
    event.setAlertGroup("System Reload")
    def alertKey = "hwSysReloadScheduleEntry." + (((resolveInstanceOid(1) =~ /\.([0-9+])$/) ? (resolveInstanceOid(1) =~ /\.([0-9+])$/)[0][1] : ''))
    event.setAlertKey(alertKey)
    def summary = "Hw Sys Reload Notification" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(2)
    event.setEventType("13")
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
