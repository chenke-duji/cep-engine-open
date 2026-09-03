/**
 * Auto-generated from HUAWEI-CLOCK-MIB.mib
 * Generated: 2026-08-24T18:28:29.304267900
 * Traps/Notifications (32): hwClockSourceSwitch, hwClockSourceSysClkLockModeChange, hwClockSourceStateChange, hwClockSourceStateResume, hwClockSourceFreqCheck, hwClockSourceOutputBelowThreshold, hwClockNotInLockedMode, hwClockInLockedMode, hwClockSourceFailed, hwClockSourceValid, hwClockSourceFreqCheckResume, hwClockSourceOutputBelowThresholdResume, hwClockCesAcrMasterPwChange, hwClockCesAcrLockFail, hwClockCesAcrLockFailResume, hwClockClusterTopoFail, hwClockClusterTopoFailResume, hwClockSourceInputBelowThreshold, hwClockSourceInputBelowThresholdResume, hwClockSsmPktLos, hwClockSsmPktLosResume, hwClockCesDcrMasterPwChange, hwClockCesDcrLockFail, hwClockCesDcrLockFailResume, hwClockSourceSsmChange, hwClockFMSwitch, hwClockFMSwitchResume, hwClockSyncBad, hwClockSyncBadResume, hwClockPortNonSupport, hwClockPortNonSupportResume, hwClockGnssModelChange
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

// --- hwClockSourceSwitch (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.186.1.8.1
// Fields: hwClockChassisId, hwClockPllId, hwClockLastSourceName, hwClockCurSourceName, hwClockSrcSelMode
// Description: This object indicates the notification of the switchover of clock reference sources.
trapMap["1.3.6.1.4.1.2011.5.25.186.1.8.1"] = [
    name: "hwClockSourceSwitch",
    fields: ["hwClockChassisId", "hwClockPllId", "hwClockLastSourceName", "hwClockCurSourceName", "hwClockSrcSelMode"],
    fieldOids: ["hwClockChassisId": "1.3.6.1.4.1.2011.5.25.186.1.7.4", "hwClockPllId": "1.3.6.1.4.1.2011.5.25.186.1.7.6", "hwClockLastSourceName": "1.3.6.1.4.1.2011.5.25.186.1.7.1", "hwClockCurSourceName": "1.3.6.1.4.1.2011.5.25.186.1.7.2", "hwClockSrcSelMode": "1.3.6.1.4.1.2011.5.25.186.1.10.1.3"]
]

// --- hwClockSourceSysClkLockModeChange (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.186.1.8.2
// Fields: hwClockChassisId, hwClockSourceOldLockMode, hwClockAttributeSysClkLockMode
// Description: This object indicates the notification of the change on the working mode of the system clock.
trapMap["1.3.6.1.4.1.2011.5.25.186.1.8.2"] = [
    name: "hwClockSourceSysClkLockModeChange",
    fields: ["hwClockChassisId", "hwClockSourceOldLockMode", "hwClockAttributeSysClkLockMode"],
    fieldOids: ["hwClockChassisId": "1.3.6.1.4.1.2011.5.25.186.1.7.4", "hwClockSourceOldLockMode": "1.3.6.1.4.1.2011.5.25.186.1.7.3", "hwClockAttributeSysClkLockMode": "1.3.6.1.4.1.2011.5.25.186.1.9.1.12"]
]

// --- hwClockSourceStateChange (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.186.1.8.3
// Fields: hwClockChassisId, hwClockCurSourceName, hwClockOldSourceState, hwClockSrcCfgSourceState
// Description: The state of clock source change notification.
trapMap["1.3.6.1.4.1.2011.5.25.186.1.8.3"] = [
    name: "hwClockSourceStateChange",
    fields: ["hwClockChassisId", "hwClockCurSourceName", "hwClockOldSourceState", "hwClockSrcCfgSourceState"],
    fieldOids: ["hwClockChassisId": "1.3.6.1.4.1.2011.5.25.186.1.7.4", "hwClockCurSourceName": "1.3.6.1.4.1.2011.5.25.186.1.7.2", "hwClockOldSourceState": "1.3.6.1.4.1.2011.5.25.186.1.7.5", "hwClockSrcCfgSourceState": "1.3.6.1.4.1.2011.5.25.186.1.11.1.11"]
]

// --- hwClockSourceStateResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.186.1.8.4
// Fields: hwClockChassisId, hwClockCurSourceName, hwClockOldSourceState, hwClockSrcCfgSourceState
// Description: The state of clock source resume notification.
trapMap["1.3.6.1.4.1.2011.5.25.186.1.8.4"] = [
    name: "hwClockSourceStateResume",
    fields: ["hwClockChassisId", "hwClockCurSourceName", "hwClockOldSourceState", "hwClockSrcCfgSourceState"],
    fieldOids: ["hwClockChassisId": "1.3.6.1.4.1.2011.5.25.186.1.7.4", "hwClockCurSourceName": "1.3.6.1.4.1.2011.5.25.186.1.7.2", "hwClockOldSourceState": "1.3.6.1.4.1.2011.5.25.186.1.7.5", "hwClockSrcCfgSourceState": "1.3.6.1.4.1.2011.5.25.186.1.11.1.11"]
]

// --- hwClockSourceFreqCheck (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.186.1.8.5
// Fields: hwClockChassisId, hwClockSrcCfgSourceDescr, hwClockSrcCfgFreqCheckResult
// Description: This object indicates the notification of the abnormal result of frequency offset detection of the clock reference clock.
trapMap["1.3.6.1.4.1.2011.5.25.186.1.8.5"] = [
    name: "hwClockSourceFreqCheck",
    fields: ["hwClockChassisId", "hwClockSrcCfgSourceDescr", "hwClockSrcCfgFreqCheckResult"],
    fieldOids: ["hwClockChassisId": "1.3.6.1.4.1.2011.5.25.186.1.7.4", "hwClockSrcCfgSourceDescr": "1.3.6.1.4.1.2011.5.25.186.1.11.1.4", "hwClockSrcCfgFreqCheckResult": "1.3.6.1.4.1.2011.5.25.186.1.11.1.12"]
]

// --- hwClockSourceOutputBelowThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.186.1.8.6
// Fields: hwClockChassisId, hwClockPllId, hwClockAttributeOutThreshold, hwClockAttributeOutValue, hwClockCurSourceName
// Description: This object indicates that the SSM level output by the clock source is lower than the configured threshold.
trapMap["1.3.6.1.4.1.2011.5.25.186.1.8.6"] = [
    name: "hwClockSourceOutputBelowThreshold",
    fields: ["hwClockChassisId", "hwClockPllId", "hwClockAttributeOutThreshold", "hwClockAttributeOutValue", "hwClockCurSourceName"],
    fieldOids: ["hwClockChassisId": "1.3.6.1.4.1.2011.5.25.186.1.7.4", "hwClockPllId": "1.3.6.1.4.1.2011.5.25.186.1.7.6", "hwClockAttributeOutThreshold": "1.3.6.1.4.1.2011.5.25.186.1.9.1.8", "hwClockAttributeOutValue": "1.3.6.1.4.1.2011.5.25.186.1.7.7", "hwClockCurSourceName": "1.3.6.1.4.1.2011.5.25.186.1.7.2"]
]

// --- hwClockNotInLockedMode (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.186.1.8.7
// Fields: hwClockChassisId, hwClockAttributeSysClkLockMode
// Description: This object indicates that the system clock is in the unlocked state.
trapMap["1.3.6.1.4.1.2011.5.25.186.1.8.7"] = [
    name: "hwClockNotInLockedMode",
    fields: ["hwClockChassisId", "hwClockAttributeSysClkLockMode"],
    fieldOids: ["hwClockChassisId": "1.3.6.1.4.1.2011.5.25.186.1.7.4", "hwClockAttributeSysClkLockMode": "1.3.6.1.4.1.2011.5.25.186.1.9.1.12"]
]

// --- hwClockInLockedMode (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.186.1.8.8
// Fields: hwClockChassisId, hwClockAttributeSysClkLockMode
// Description: This object indicates that the system clock is in the locked state.
trapMap["1.3.6.1.4.1.2011.5.25.186.1.8.8"] = [
    name: "hwClockInLockedMode",
    fields: ["hwClockChassisId", "hwClockAttributeSysClkLockMode"],
    fieldOids: ["hwClockChassisId": "1.3.6.1.4.1.2011.5.25.186.1.7.4", "hwClockAttributeSysClkLockMode": "1.3.6.1.4.1.2011.5.25.186.1.9.1.12"]
]

// --- hwClockSourceFailed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.186.1.8.11
// Fields: hwClockChassisId, hwClockCurSourceName, hwClockSrcCfgSourceState, hwClockSrcFailedReason
// Description: This object indicates that the clock source is invalid.
trapMap["1.3.6.1.4.1.2011.5.25.186.1.8.11"] = [
    name: "hwClockSourceFailed",
    fields: ["hwClockChassisId", "hwClockCurSourceName", "hwClockSrcCfgSourceState", "hwClockSrcFailedReason"],
    fieldOids: ["hwClockChassisId": "1.3.6.1.4.1.2011.5.25.186.1.7.4", "hwClockCurSourceName": "1.3.6.1.4.1.2011.5.25.186.1.7.2", "hwClockSrcCfgSourceState": "1.3.6.1.4.1.2011.5.25.186.1.11.1.11", "hwClockSrcFailedReason": "1.3.6.1.4.1.2011.5.25.186.1.11.1.25"]
]

// --- hwClockSourceValid (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.186.1.8.12
// Fields: hwClockChassisId, hwClockCurSourceName, hwClockSrcCfgSourceState
// Description: This object indicates that the clock source is valid.
trapMap["1.3.6.1.4.1.2011.5.25.186.1.8.12"] = [
    name: "hwClockSourceValid",
    fields: ["hwClockChassisId", "hwClockCurSourceName", "hwClockSrcCfgSourceState"],
    fieldOids: ["hwClockChassisId": "1.3.6.1.4.1.2011.5.25.186.1.7.4", "hwClockCurSourceName": "1.3.6.1.4.1.2011.5.25.186.1.7.2", "hwClockSrcCfgSourceState": "1.3.6.1.4.1.2011.5.25.186.1.11.1.11"]
]

// --- hwClockSourceFreqCheckResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.186.1.8.13
// Fields: hwClockChassisId, hwClockSrcCfgSourceDescr, hwClockSrcCfgFreqCheckResult
// Description: This object indicates an alarm that the clock source frequency detection is normal.
trapMap["1.3.6.1.4.1.2011.5.25.186.1.8.13"] = [
    name: "hwClockSourceFreqCheckResume",
    fields: ["hwClockChassisId", "hwClockSrcCfgSourceDescr", "hwClockSrcCfgFreqCheckResult"],
    fieldOids: ["hwClockChassisId": "1.3.6.1.4.1.2011.5.25.186.1.7.4", "hwClockSrcCfgSourceDescr": "1.3.6.1.4.1.2011.5.25.186.1.11.1.4", "hwClockSrcCfgFreqCheckResult": "1.3.6.1.4.1.2011.5.25.186.1.11.1.12"]
]

// --- hwClockSourceOutputBelowThresholdResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.186.1.8.14
// Fields: hwClockChassisId, hwClockPllId, hwClockAttributeOutThreshold, hwClockAttributeOutValue, hwClockCurSourceName
// Description: This object indicates an alarm that the SSM level output by the clock source is higher than the configured threshold.
trapMap["1.3.6.1.4.1.2011.5.25.186.1.8.14"] = [
    name: "hwClockSourceOutputBelowThresholdResume",
    fields: ["hwClockChassisId", "hwClockPllId", "hwClockAttributeOutThreshold", "hwClockAttributeOutValue", "hwClockCurSourceName"],
    fieldOids: ["hwClockChassisId": "1.3.6.1.4.1.2011.5.25.186.1.7.4", "hwClockPllId": "1.3.6.1.4.1.2011.5.25.186.1.7.6", "hwClockAttributeOutThreshold": "1.3.6.1.4.1.2011.5.25.186.1.9.1.8", "hwClockAttributeOutValue": "1.3.6.1.4.1.2011.5.25.186.1.7.7", "hwClockCurSourceName": "1.3.6.1.4.1.2011.5.25.186.1.7.2"]
]

// --- hwClockCesAcrMasterPwChange (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.186.1.8.15
// Fields: hwClockCesAcrSlot, hwClockCesAcrCard, hwClockCesAcrDomain, hwClockCesAcrOldMasterPwName, hwClockCesAcrNewMasterPwName
// Description: This object indicates a master PW change event. The object associated is hwClockCesAcrSlot, hwClockCesAcrCard, hwClockCesAcrDomain, hwClockCesAcrOldMasterPwName, hwClockCesAcrNewMasterPwName.
trapMap["1.3.6.1.4.1.2011.5.25.186.1.8.15"] = [
    name: "hwClockCesAcrMasterPwChange",
    fields: ["hwClockCesAcrSlot", "hwClockCesAcrCard", "hwClockCesAcrDomain", "hwClockCesAcrOldMasterPwName", "hwClockCesAcrNewMasterPwName"],
    fieldOids: ["hwClockCesAcrSlot": "1.3.6.1.4.1.2011.5.25.186.1.7.8", "hwClockCesAcrCard": "1.3.6.1.4.1.2011.5.25.186.1.7.9", "hwClockCesAcrDomain": "1.3.6.1.4.1.2011.5.25.186.1.7.10", "hwClockCesAcrOldMasterPwName": "1.3.6.1.4.1.2011.5.25.186.1.7.11", "hwClockCesAcrNewMasterPwName": "1.3.6.1.4.1.2011.5.25.186.1.7.12"]
]

// --- hwClockCesAcrLockFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.186.1.8.16
// Fields: hwClockCesAcrSlot, hwClockCesAcrCard, hwClockCesAcrDomain, hwClockCesAcrLockState
// Description: This object indicates an alarm that a CES ACR clock source is unlocked. The object associated is hwClockCesAcrSlot, hwClockCesAcrCard, hwClockCesAcrDomain, hwClockCesAcrLockState.
trapMap["1.3.6.1.4.1.2011.5.25.186.1.8.16"] = [
    name: "hwClockCesAcrLockFail",
    fields: ["hwClockCesAcrSlot", "hwClockCesAcrCard", "hwClockCesAcrDomain", "hwClockCesAcrLockState"],
    fieldOids: ["hwClockCesAcrSlot": "1.3.6.1.4.1.2011.5.25.186.1.7.8", "hwClockCesAcrCard": "1.3.6.1.4.1.2011.5.25.186.1.7.9", "hwClockCesAcrDomain": "1.3.6.1.4.1.2011.5.25.186.1.7.10", "hwClockCesAcrLockState": "1.3.6.1.4.1.2011.5.25.186.1.7.13"]
]

// --- hwClockCesAcrLockFailResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.186.1.8.17
// Fields: hwClockCesAcrSlot, hwClockCesAcrCard, hwClockCesAcrDomain, hwClockCesAcrLockState
// Description: This object indicates an alarm that a CES ACR clock source is locked. The object associated is wClockCesAcrSlothwClockCesAcrCardhwClockCesAcrDomainhwClockCesAcrLockState.
trapMap["1.3.6.1.4.1.2011.5.25.186.1.8.17"] = [
    name: "hwClockCesAcrLockFailResume",
    fields: ["hwClockCesAcrSlot", "hwClockCesAcrCard", "hwClockCesAcrDomain", "hwClockCesAcrLockState"],
    fieldOids: ["hwClockCesAcrSlot": "1.3.6.1.4.1.2011.5.25.186.1.7.8", "hwClockCesAcrCard": "1.3.6.1.4.1.2011.5.25.186.1.7.9", "hwClockCesAcrDomain": "1.3.6.1.4.1.2011.5.25.186.1.7.10", "hwClockCesAcrLockState": "1.3.6.1.4.1.2011.5.25.186.1.7.13"]
]

// --- hwClockClusterTopoFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.186.1.8.22
// Fields: hwClockClusterNewSyncType, hwClockClusterNewTopoType, hwClockClusterNewTopoLinkType, hwClockClusterNewTopoStatus
// Description: This object indicates a clock synchronization topology planning failure between chassis in a cluster.
trapMap["1.3.6.1.4.1.2011.5.25.186.1.8.22"] = [
    name: "hwClockClusterTopoFail",
    fields: ["hwClockClusterNewSyncType", "hwClockClusterNewTopoType", "hwClockClusterNewTopoLinkType", "hwClockClusterNewTopoStatus"],
    fieldOids: ["hwClockClusterNewSyncType": "1.3.6.1.4.1.2011.5.25.186.1.7.22", "hwClockClusterNewTopoType": "1.3.6.1.4.1.2011.5.25.186.1.7.23", "hwClockClusterNewTopoLinkType": "1.3.6.1.4.1.2011.5.25.186.1.7.24", "hwClockClusterNewTopoStatus": "1.3.6.1.4.1.2011.5.25.186.1.7.25"]
]

// --- hwClockClusterTopoFailResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.186.1.8.23
// Fields: hwClockClusterNewSyncType, hwClockClusterNewTopoType, hwClockClusterNewTopoLinkType, hwClockClusterNewTopoStatus
// Description: This object indicates a clock synchronization topology planning success between chassis in a cluster.
trapMap["1.3.6.1.4.1.2011.5.25.186.1.8.23"] = [
    name: "hwClockClusterTopoFailResume",
    fields: ["hwClockClusterNewSyncType", "hwClockClusterNewTopoType", "hwClockClusterNewTopoLinkType", "hwClockClusterNewTopoStatus"],
    fieldOids: ["hwClockClusterNewSyncType": "1.3.6.1.4.1.2011.5.25.186.1.7.22", "hwClockClusterNewTopoType": "1.3.6.1.4.1.2011.5.25.186.1.7.23", "hwClockClusterNewTopoLinkType": "1.3.6.1.4.1.2011.5.25.186.1.7.24", "hwClockClusterNewTopoStatus": "1.3.6.1.4.1.2011.5.25.186.1.7.25"]
]

// --- hwClockSourceInputBelowThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.186.1.8.24
// Fields: hwClockChassisId, hwClockPllId, hwClockAttributeInputThreshold, hwClockSrcCfgSourceSsm
// Description: This object indicates an alarm that the input SSM level of the clock source is lower than the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.186.1.8.24"] = [
    name: "hwClockSourceInputBelowThreshold",
    fields: ["hwClockChassisId", "hwClockPllId", "hwClockAttributeInputThreshold", "hwClockSrcCfgSourceSsm"],
    fieldOids: ["hwClockChassisId": "1.3.6.1.4.1.2011.5.25.186.1.7.4", "hwClockPllId": "1.3.6.1.4.1.2011.5.25.186.1.7.6", "hwClockAttributeInputThreshold": "1.3.6.1.4.1.2011.5.25.186.1.9.1.17", "hwClockSrcCfgSourceSsm": "1.3.6.1.4.1.2011.5.25.186.1.11.1.9"]
]

// --- hwClockSourceInputBelowThresholdResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.186.1.8.25
// Fields: hwClockChassisId, hwClockPllId, hwClockAttributeInputThreshold, hwClockSrcCfgSourceSsm
// Description: This object indicates an alarm that the input SSM level of the clock source reaches or exceeds the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.186.1.8.25"] = [
    name: "hwClockSourceInputBelowThresholdResume",
    fields: ["hwClockChassisId", "hwClockPllId", "hwClockAttributeInputThreshold", "hwClockSrcCfgSourceSsm"],
    fieldOids: ["hwClockChassisId": "1.3.6.1.4.1.2011.5.25.186.1.7.4", "hwClockPllId": "1.3.6.1.4.1.2011.5.25.186.1.7.6", "hwClockAttributeInputThreshold": "1.3.6.1.4.1.2011.5.25.186.1.9.1.17", "hwClockSrcCfgSourceSsm": "1.3.6.1.4.1.2011.5.25.186.1.11.1.9"]
]

// --- hwClockSsmPktLos (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.186.1.8.26
// Fields: hwClockCurSourceName
// Description: This object indicates an alarm that ESMC packets are lost.
trapMap["1.3.6.1.4.1.2011.5.25.186.1.8.26"] = [
    name: "hwClockSsmPktLos",
    fields: ["hwClockCurSourceName"],
    fieldOids: ["hwClockCurSourceName": "1.3.6.1.4.1.2011.5.25.186.1.7.2"]
]

// --- hwClockSsmPktLosResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.186.1.8.27
// Fields: hwClockCurSourceName
// Description: This object indicates that ESMC packet loss recovers.
trapMap["1.3.6.1.4.1.2011.5.25.186.1.8.27"] = [
    name: "hwClockSsmPktLosResume",
    fields: ["hwClockCurSourceName"],
    fieldOids: ["hwClockCurSourceName": "1.3.6.1.4.1.2011.5.25.186.1.7.2"]
]

// --- hwClockCesDcrMasterPwChange (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.186.1.8.28
// Fields: hwClockCesDcrSlot, hwClockCesDcrCard, hwClockCesDcrDomain, hwClockCesDcrOldMasterPwName, hwClockCesDcrNewMasterPwName
// Description: CES DCR master PW status change.
trapMap["1.3.6.1.4.1.2011.5.25.186.1.8.28"] = [
    name: "hwClockCesDcrMasterPwChange",
    fields: ["hwClockCesDcrSlot", "hwClockCesDcrCard", "hwClockCesDcrDomain", "hwClockCesDcrOldMasterPwName", "hwClockCesDcrNewMasterPwName"],
    fieldOids: ["hwClockCesDcrSlot": "1.3.6.1.4.1.2011.5.25.186.1.7.14", "hwClockCesDcrCard": "1.3.6.1.4.1.2011.5.25.186.1.7.15", "hwClockCesDcrDomain": "1.3.6.1.4.1.2011.5.25.186.1.7.16", "hwClockCesDcrOldMasterPwName": "1.3.6.1.4.1.2011.5.25.186.1.7.17", "hwClockCesDcrNewMasterPwName": "1.3.6.1.4.1.2011.5.25.186.1.7.18"]
]

// --- hwClockCesDcrLockFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.186.1.8.29
// Fields: hwClockCesDcrSlot, hwClockCesDcrCard, hwClockCesDcrDomain, hwClockCesDcrLockState
// Description: CES DCR clock source lock fail.
trapMap["1.3.6.1.4.1.2011.5.25.186.1.8.29"] = [
    name: "hwClockCesDcrLockFail",
    fields: ["hwClockCesDcrSlot", "hwClockCesDcrCard", "hwClockCesDcrDomain", "hwClockCesDcrLockState"],
    fieldOids: ["hwClockCesDcrSlot": "1.3.6.1.4.1.2011.5.25.186.1.7.14", "hwClockCesDcrCard": "1.3.6.1.4.1.2011.5.25.186.1.7.15", "hwClockCesDcrDomain": "1.3.6.1.4.1.2011.5.25.186.1.7.16", "hwClockCesDcrLockState": "1.3.6.1.4.1.2011.5.25.186.1.7.19"]
]

// --- hwClockCesDcrLockFailResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.186.1.8.30
// Fields: hwClockCesDcrSlot, hwClockCesDcrCard, hwClockCesDcrDomain, hwClockCesDcrLockState
// Description: CES DCR clock source lock fail resume.
trapMap["1.3.6.1.4.1.2011.5.25.186.1.8.30"] = [
    name: "hwClockCesDcrLockFailResume",
    fields: ["hwClockCesDcrSlot", "hwClockCesDcrCard", "hwClockCesDcrDomain", "hwClockCesDcrLockState"],
    fieldOids: ["hwClockCesDcrSlot": "1.3.6.1.4.1.2011.5.25.186.1.7.14", "hwClockCesDcrCard": "1.3.6.1.4.1.2011.5.25.186.1.7.15", "hwClockCesDcrDomain": "1.3.6.1.4.1.2011.5.25.186.1.7.16", "hwClockCesDcrLockState": "1.3.6.1.4.1.2011.5.25.186.1.7.19"]
]

// --- hwClockSourceSsmChange (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.186.1.8.31
// Fields: hwClockChassisId, hwClockCurSourceName, hwClockOldSourceSsm, hwClockNewSourceSsm
// Description: This object indicates that the clock source SSM is changed.
trapMap["1.3.6.1.4.1.2011.5.25.186.1.8.31"] = [
    name: "hwClockSourceSsmChange",
    fields: ["hwClockChassisId", "hwClockCurSourceName", "hwClockOldSourceSsm", "hwClockNewSourceSsm"],
    fieldOids: ["hwClockChassisId": "1.3.6.1.4.1.2011.5.25.186.1.7.4", "hwClockCurSourceName": "1.3.6.1.4.1.2011.5.25.186.1.7.2", "hwClockOldSourceSsm": "1.3.6.1.4.1.2011.5.25.186.1.7.20", "hwClockNewSourceSsm": "1.3.6.1.4.1.2011.5.25.186.1.7.21"]
]

// --- hwClockFMSwitch (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.186.1.8.32
// Fields: hwClockChassisId, hwClockPllId
// Description: Clock select mode is force or manual.
trapMap["1.3.6.1.4.1.2011.5.25.186.1.8.32"] = [
    name: "hwClockFMSwitch",
    fields: ["hwClockChassisId", "hwClockPllId"],
    fieldOids: ["hwClockChassisId": "1.3.6.1.4.1.2011.5.25.186.1.7.4", "hwClockPllId": "1.3.6.1.4.1.2011.5.25.186.1.7.6"]
]

// --- hwClockFMSwitchResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.186.1.8.33
// Fields: hwClockChassisId, hwClockPllId
// Description: Clock select mode is automative.
trapMap["1.3.6.1.4.1.2011.5.25.186.1.8.33"] = [
    name: "hwClockFMSwitchResume",
    fields: ["hwClockChassisId", "hwClockPllId"],
    fieldOids: ["hwClockChassisId": "1.3.6.1.4.1.2011.5.25.186.1.7.4", "hwClockPllId": "1.3.6.1.4.1.2011.5.25.186.1.7.6"]
]

// --- hwClockSyncBad (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.186.1.8.34
// Fields: hwClockChassisId
// Description: Clock frequency synchronization bad.
trapMap["1.3.6.1.4.1.2011.5.25.186.1.8.34"] = [
    name: "hwClockSyncBad",
    fields: ["hwClockChassisId"],
    fieldOids: ["hwClockChassisId": "1.3.6.1.4.1.2011.5.25.186.1.7.4"]
]

// --- hwClockSyncBadResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.186.1.8.35
// Fields: hwClockChassisId
// Description: Clock frequency synchronization bad resume.
trapMap["1.3.6.1.4.1.2011.5.25.186.1.8.35"] = [
    name: "hwClockSyncBadResume",
    fields: ["hwClockChassisId"],
    fieldOids: ["hwClockChassisId": "1.3.6.1.4.1.2011.5.25.186.1.7.4"]
]

// --- hwClockPortNonSupport (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.186.1.8.36
// Fields: hwClockChassisId, hwClockPortIfIndex, hwClockCurSourceName
// Description: This object indicates an alarm that the interface does not support physical layer clock synchronization.
trapMap["1.3.6.1.4.1.2011.5.25.186.1.8.36"] = [
    name: "hwClockPortNonSupport",
    fields: ["hwClockChassisId", "hwClockPortIfIndex", "hwClockCurSourceName"],
    fieldOids: ["hwClockChassisId": "1.3.6.1.4.1.2011.5.25.186.1.7.4", "hwClockPortIfIndex": "1.3.6.1.4.1.2011.5.25.186.1.7.26", "hwClockCurSourceName": "1.3.6.1.4.1.2011.5.25.186.1.7.2"]
]

// --- hwClockPortNonSupportResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.186.1.8.37
// Fields: hwClockChassisId, hwClockPortIfIndex, hwClockCurSourceName
// Description: This object indicates an alarm that the interface supports physical layer clock synchronization.
trapMap["1.3.6.1.4.1.2011.5.25.186.1.8.37"] = [
    name: "hwClockPortNonSupportResume",
    fields: ["hwClockChassisId", "hwClockPortIfIndex", "hwClockCurSourceName"],
    fieldOids: ["hwClockChassisId": "1.3.6.1.4.1.2011.5.25.186.1.7.4", "hwClockPortIfIndex": "1.3.6.1.4.1.2011.5.25.186.1.7.26", "hwClockCurSourceName": "1.3.6.1.4.1.2011.5.25.186.1.7.2"]
]

// --- hwClockGnssModelChange (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.186.1.8.38
// Fields: hwClockPortIfIndex, hwClockPortName, hwClockGnssModel, hwClockOldGnssModel
// Description: The smart clock gnss model changed.
trapMap["1.3.6.1.4.1.2011.5.25.186.1.8.38"] = [
    name: "hwClockGnssModelChange",
    fields: ["hwClockPortIfIndex", "hwClockPortName", "hwClockGnssModel", "hwClockOldGnssModel"],
    fieldOids: ["hwClockPortIfIndex": "1.3.6.1.4.1.2011.5.25.186.1.7.26", "hwClockPortName": "1.3.6.1.4.1.2011.5.25.186.1.7.27", "hwClockGnssModel": "1.3.6.1.4.1.2011.5.25.186.1.7.28", "hwClockOldGnssModel": "1.3.6.1.4.1.2011.5.25.186.1.7.29"]
]

// ===== Parsing logic =====

// Set to true to enable diagnostic logging for this MIB parser
DEBUG = false

LOG_PREFIX = "[HUAWEI-CLOCK-MIB]"
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
