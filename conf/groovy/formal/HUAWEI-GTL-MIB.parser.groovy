/**
 * Auto-generated from HUAWEI-GTL-MIB.mib
 * Generated: 2026-08-24T18:28:29.721709100
 * Traps/Notifications (61): hwGtlDefaultValue, hwGtlResourceUsedUp, hwGtlNearDeadline, hwGtlLicenseVerifyFailed, hwGtlExpired, hwGtlItemMismatch, hwGtlDefaultValueCleared, hwGtlNearDeadlineCleared, hwGtlItemMismatchCleared, hwGtlResourceUsedUpCleared, hwGtlLicenseNotCommeral, hwGtlEmergencyStart, hwGtlEmergencyStop, hwGtlTrialFeatureEnable, hwGtlTrialFeatureDisable, hwGtlTrialFeatureNearDeadline, hwGtlTrialFeatureNearDeadlineCleared, hwGtlResourceOverload, hwGtlResourceOverloadCleared, hwGtlEsnMismatch, hwGtlEsnMismatchCleared, hwGtlItemInactive, hwGtlItemInactiveCleared, hwGtlInitial, hwGtlInitialCleared, hwGtlFunctionInactive, hwGtlFunctionInactiveCleared, hwGtlResourceLack, hwGtlResourceLackCleared, hwGtlAbnormal, hwGtlAbnormalCleared, hwGtlTrialFeatureNearExpire, hwGtlTrialFeatureNearExpireCleared, hwGtlTrialFeatureExpire, hwGtlTrialFeatureExpireCleared, hwGtlTrialResFeatureEnable, hwGtlTrialResFeatureDisable, hwGtlFeatureFunInactive, hwGtlFeatureFunInactiveCleared, hwGtlLicenseStateChange, hwGtlSnsNearExpire, hwGtlSnsNearExpireCleared, hwGtlSnsExpire, hwGtlSnsExpireCleared, hwGtlItemNearExpire, hwGtlItemNearExpireResume, hwGtlItemExpire, hwGtlItemExpireResume, hwGtlCloudNearDeadline, hwGtlCloudNearDeadlineCleared, hwGtlMachineESNChanged, hwGtlCloudServerOffline, hwGtlCloudServerOfflineCleared, hwGtlCloudServerOfflineLocked, hwGtlCloudServerOfflineLockedCleared, hwGtlDataDamaged, hwGtlDataDamagedResume, hwGtlFeatureDefaultValue, hwGtlFeatureDefaultValueCleared, hwGtlResourceOverused, hwGtlResourceOverusedResume
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

// --- hwGtlDefaultValue (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.142.2.1
// Fields: hwGtlDefaultValueReason, hwGtlChassisID
// Description: Notification represents that the system will use default value if the license file fails to pass the verification.
trapMap["1.3.6.1.4.1.2011.5.25.142.2.1"] = [
    name: "hwGtlDefaultValue",
    fields: ["hwGtlDefaultValueReason", "hwGtlChassisID"],
    fieldOids: ["hwGtlDefaultValueReason": "1.3.6.1.4.1.2011.5.25.142.1.1", "hwGtlChassisID": "1.3.6.1.4.1.2011.5.25.142.1.9"]
]

// --- hwGtlResourceUsedUp (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.142.2.2
// Fields: hwGtlResourceItem, hwGtlItemDescription
// Description: Notification represents the resource is nearly exhausted.
trapMap["1.3.6.1.4.1.2011.5.25.142.2.2"] = [
    name: "hwGtlResourceUsedUp",
    fields: ["hwGtlResourceItem", "hwGtlItemDescription"],
    fieldOids: ["hwGtlResourceItem": "1.3.6.1.4.1.2011.5.25.142.1.2", "hwGtlItemDescription": "1.3.6.1.4.1.2011.5.25.142.1.8.1.5"]
]

// --- hwGtlNearDeadline (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.142.2.3
// Fields: hwGtlFeatureName, hwGtlRemainTime, hwGtlChassisID
// Description: Notification represents the feature is near deadline.
trapMap["1.3.6.1.4.1.2011.5.25.142.2.3"] = [
    name: "hwGtlNearDeadline",
    fields: ["hwGtlFeatureName", "hwGtlRemainTime", "hwGtlChassisID"],
    fieldOids: ["hwGtlFeatureName": "1.3.6.1.4.1.2011.5.25.142.1.3", "hwGtlRemainTime": "1.3.6.1.4.1.2011.5.25.142.1.4", "hwGtlChassisID": "1.3.6.1.4.1.2011.5.25.142.1.9"]
]

// --- hwGtlLicenseVerifyFailed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.142.2.4
// Fields: hwGtlVerifyCode
// Description: Notification represents license verification failed. The reason why license verification failed can be: 1 represents that the ESN or version of the device and the license file mismatch. 2 represents t...
trapMap["1.3.6.1.4.1.2011.5.25.142.2.4"] = [
    name: "hwGtlLicenseVerifyFailed",
    fields: ["hwGtlVerifyCode"],
    fieldOids: ["hwGtlVerifyCode": "1.3.6.1.4.1.2011.5.25.142.1.5"]
]

// --- hwGtlExpired (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.142.2.5
// Description: Notification represents the license has expired.
trapMap["1.3.6.1.4.1.2011.5.25.142.2.5"] = [
    name: "hwGtlExpired",
    fields: [],
    fieldOids: []
]

// --- hwGtlItemMismatch (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.142.2.6
// Fields: hwGtlChassisID
// Description: License item mismatch with the main chassis.
trapMap["1.3.6.1.4.1.2011.5.25.142.2.6"] = [
    name: "hwGtlItemMismatch",
    fields: ["hwGtlChassisID"],
    fieldOids: ["hwGtlChassisID": "1.3.6.1.4.1.2011.5.25.142.1.9"]
]

// --- hwGtlDefaultValueCleared (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.142.2.7
// Fields: hwGtlDefaultValueReason, hwGtlChassisID
// Description: The notification represents that the system will use default value if the license file fails to pass the verification is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.142.2.7"] = [
    name: "hwGtlDefaultValueCleared",
    fields: ["hwGtlDefaultValueReason", "hwGtlChassisID"],
    fieldOids: ["hwGtlDefaultValueReason": "1.3.6.1.4.1.2011.5.25.142.1.1", "hwGtlChassisID": "1.3.6.1.4.1.2011.5.25.142.1.9"]
]

// --- hwGtlNearDeadlineCleared (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.142.2.8
// Fields: hwGtlFeatureName, hwGtlRemainTime, hwGtlChassisID
// Description: The notification represents the feature is near deadline is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.142.2.8"] = [
    name: "hwGtlNearDeadlineCleared",
    fields: ["hwGtlFeatureName", "hwGtlRemainTime", "hwGtlChassisID"],
    fieldOids: ["hwGtlFeatureName": "1.3.6.1.4.1.2011.5.25.142.1.3", "hwGtlRemainTime": "1.3.6.1.4.1.2011.5.25.142.1.4", "hwGtlChassisID": "1.3.6.1.4.1.2011.5.25.142.1.9"]
]

// --- hwGtlItemMismatchCleared (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.142.2.9
// Fields: hwGtlChassisID
// Description: The notification represents the license item mismatch with the main chassis is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.142.2.9"] = [
    name: "hwGtlItemMismatchCleared",
    fields: ["hwGtlChassisID"],
    fieldOids: ["hwGtlChassisID": "1.3.6.1.4.1.2011.5.25.142.1.9"]
]

// --- hwGtlResourceUsedUpCleared (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.142.2.10
// Fields: hwGtlResourceItem, hwGtlItemDescription
// Description: The notification represents the resource is nearly exhausted is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.142.2.10"] = [
    name: "hwGtlResourceUsedUpCleared",
    fields: ["hwGtlResourceItem", "hwGtlItemDescription"],
    fieldOids: ["hwGtlResourceItem": "1.3.6.1.4.1.2011.5.25.142.1.2", "hwGtlItemDescription": "1.3.6.1.4.1.2011.5.25.142.1.8.1.5"]
]

// --- hwGtlLicenseNotCommeral (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.142.2.11
// Description: The notification represents the license is not commerial.
trapMap["1.3.6.1.4.1.2011.5.25.142.2.11"] = [
    name: "hwGtlLicenseNotCommeral",
    fields: [],
    fieldOids: []
]

// --- hwGtlEmergencyStart (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.142.2.12
// Description: Notification represents the license emergency is started.
trapMap["1.3.6.1.4.1.2011.5.25.142.2.12"] = [
    name: "hwGtlEmergencyStart",
    fields: [],
    fieldOids: []
]

// --- hwGtlEmergencyStop (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.142.2.13
// Description: Notification represents the license mergency is stopped after 7 days.
trapMap["1.3.6.1.4.1.2011.5.25.142.2.13"] = [
    name: "hwGtlEmergencyStop",
    fields: [],
    fieldOids: []
]

// --- hwGtlTrialFeatureEnable (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.142.2.14
// Fields: hwGtlFeatureName, hwGtlRemainTime
// Description: Notification represents the trial feature is enable.
trapMap["1.3.6.1.4.1.2011.5.25.142.2.14"] = [
    name: "hwGtlTrialFeatureEnable",
    fields: ["hwGtlFeatureName", "hwGtlRemainTime"],
    fieldOids: ["hwGtlFeatureName": "1.3.6.1.4.1.2011.5.25.142.1.3", "hwGtlRemainTime": "1.3.6.1.4.1.2011.5.25.142.1.4"]
]

// --- hwGtlTrialFeatureDisable (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.142.2.15
// Fields: hwGtlFeatureName
// Description: Notification represents the trial feature is disable .
trapMap["1.3.6.1.4.1.2011.5.25.142.2.15"] = [
    name: "hwGtlTrialFeatureDisable",
    fields: ["hwGtlFeatureName"],
    fieldOids: ["hwGtlFeatureName": "1.3.6.1.4.1.2011.5.25.142.1.3"]
]

// --- hwGtlTrialFeatureNearDeadline (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.142.2.16
// Fields: hwGtlFeatureName, hwGtlRemainTime, hwGtlChassisID
// Description: The trial feature is about to expire.
trapMap["1.3.6.1.4.1.2011.5.25.142.2.16"] = [
    name: "hwGtlTrialFeatureNearDeadline",
    fields: ["hwGtlFeatureName", "hwGtlRemainTime", "hwGtlChassisID"],
    fieldOids: ["hwGtlFeatureName": "1.3.6.1.4.1.2011.5.25.142.1.3", "hwGtlRemainTime": "1.3.6.1.4.1.2011.5.25.142.1.4", "hwGtlChassisID": "1.3.6.1.4.1.2011.5.25.142.1.9"]
]

// --- hwGtlTrialFeatureNearDeadlineCleared (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.142.2.17
// Fields: hwGtlFeatureName, hwGtlRemainTime, hwGtlChassisID
// Description: The alarm indicating that the trial feature is about to expire is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.142.2.17"] = [
    name: "hwGtlTrialFeatureNearDeadlineCleared",
    fields: ["hwGtlFeatureName", "hwGtlRemainTime", "hwGtlChassisID"],
    fieldOids: ["hwGtlFeatureName": "1.3.6.1.4.1.2011.5.25.142.1.3", "hwGtlRemainTime": "1.3.6.1.4.1.2011.5.25.142.1.4", "hwGtlChassisID": "1.3.6.1.4.1.2011.5.25.142.1.9"]
]

// --- hwGtlResourceOverload (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.142.2.18
// Fields: hwGtlResourceItem
// Description: Notification represents the resource has been used up.
trapMap["1.3.6.1.4.1.2011.5.25.142.2.18"] = [
    name: "hwGtlResourceOverload",
    fields: ["hwGtlResourceItem"],
    fieldOids: ["hwGtlResourceItem": "1.3.6.1.4.1.2011.5.25.142.1.2"]
]

// --- hwGtlResourceOverloadCleared (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.142.2.19
// Fields: hwGtlResourceItem
// Description: The notification represents the resource has been used up is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.142.2.19"] = [
    name: "hwGtlResourceOverloadCleared",
    fields: ["hwGtlResourceItem"],
    fieldOids: ["hwGtlResourceItem": "1.3.6.1.4.1.2011.5.25.142.1.2"]
]

// --- hwGtlEsnMismatch (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.142.2.20
// Fields: hwGtlChassisID
// Description: The notification represents the mismatch between the device ESN and license file.
trapMap["1.3.6.1.4.1.2011.5.25.142.2.20"] = [
    name: "hwGtlEsnMismatch",
    fields: ["hwGtlChassisID"],
    fieldOids: ["hwGtlChassisID": "1.3.6.1.4.1.2011.5.25.142.1.9"]
]

// --- hwGtlEsnMismatchCleared (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.142.2.21
// Fields: hwGtlChassisID
// Description: The notification represents the mismatch between the device ESN and license file is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.142.2.21"] = [
    name: "hwGtlEsnMismatchCleared",
    fields: ["hwGtlChassisID"],
    fieldOids: ["hwGtlChassisID": "1.3.6.1.4.1.2011.5.25.142.1.9"]
]

// --- hwGtlItemInactive (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.142.2.22
// Fields: hwGtlResourceItem
// Description: Notification represents the item is inactive.
trapMap["1.3.6.1.4.1.2011.5.25.142.2.22"] = [
    name: "hwGtlItemInactive",
    fields: ["hwGtlResourceItem"],
    fieldOids: ["hwGtlResourceItem": "1.3.6.1.4.1.2011.5.25.142.1.2"]
]

// --- hwGtlItemInactiveCleared (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.142.2.23
// Fields: hwGtlResourceItem
// Description: The notification represents the item is inactive is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.142.2.23"] = [
    name: "hwGtlItemInactiveCleared",
    fields: ["hwGtlResourceItem"],
    fieldOids: ["hwGtlResourceItem": "1.3.6.1.4.1.2011.5.25.142.1.2"]
]

// --- hwGtlInitial (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.142.2.24
// Fields: hwGtlChassisID, hwGtlBoardID
// Description: Notification represents current license had been initialized.
trapMap["1.3.6.1.4.1.2011.5.25.142.2.24"] = [
    name: "hwGtlInitial",
    fields: ["hwGtlChassisID", "hwGtlBoardID"],
    fieldOids: ["hwGtlChassisID": "1.3.6.1.4.1.2011.5.25.142.1.9", "hwGtlBoardID": "1.3.6.1.4.1.2011.5.25.142.1.10"]
]

// --- hwGtlInitialCleared (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.142.2.25
// Fields: hwGtlChassisID, hwGtlBoardID
// Description: The notification represents current license had been initialized is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.142.2.25"] = [
    name: "hwGtlInitialCleared",
    fields: ["hwGtlChassisID", "hwGtlBoardID"],
    fieldOids: ["hwGtlChassisID": "1.3.6.1.4.1.2011.5.25.142.1.9", "hwGtlBoardID": "1.3.6.1.4.1.2011.5.25.142.1.10"]
]

// --- hwGtlFunctionInactive (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.142.2.26
// Fields: hwGtlItemName
// Description: The alarm indicates that the control item is not activated.
trapMap["1.3.6.1.4.1.2011.5.25.142.2.26"] = [
    name: "hwGtlFunctionInactive",
    fields: ["hwGtlItemName"],
    fieldOids: ["hwGtlItemName": "1.3.6.1.4.1.2011.5.25.142.1.8.1.2"]
]

// --- hwGtlFunctionInactiveCleared (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.142.2.27
// Fields: hwGtlItemName
// Description: The alarm indicating that the control item is not activated is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.142.2.27"] = [
    name: "hwGtlFunctionInactiveCleared",
    fields: ["hwGtlItemName"],
    fieldOids: ["hwGtlItemName": "1.3.6.1.4.1.2011.5.25.142.1.8.1.2"]
]

// --- hwGtlResourceLack (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.142.2.28
// Fields: hwGtlItemName, hwGtlItemControlValue, hwGtlItemUsedValue, hwGtlItemDescription
// Description: The alarm indicates that the current resources are insufficient.
trapMap["1.3.6.1.4.1.2011.5.25.142.2.28"] = [
    name: "hwGtlResourceLack",
    fields: ["hwGtlItemName", "hwGtlItemControlValue", "hwGtlItemUsedValue", "hwGtlItemDescription"],
    fieldOids: ["hwGtlItemName": "1.3.6.1.4.1.2011.5.25.142.1.8.1.2", "hwGtlItemControlValue": "1.3.6.1.4.1.2011.5.25.142.1.8.1.3", "hwGtlItemUsedValue": "1.3.6.1.4.1.2011.5.25.142.1.8.1.4", "hwGtlItemDescription": "1.3.6.1.4.1.2011.5.25.142.1.8.1.5"]
]

// --- hwGtlResourceLackCleared (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.142.2.29
// Fields: hwGtlItemName, hwGtlItemControlValue, hwGtlItemUsedValue, hwGtlItemDescription
// Description: The alarm indicating that the current resources are insufficient is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.142.2.29"] = [
    name: "hwGtlResourceLackCleared",
    fields: ["hwGtlItemName", "hwGtlItemControlValue", "hwGtlItemUsedValue", "hwGtlItemDescription"],
    fieldOids: ["hwGtlItemName": "1.3.6.1.4.1.2011.5.25.142.1.8.1.2", "hwGtlItemControlValue": "1.3.6.1.4.1.2011.5.25.142.1.8.1.3", "hwGtlItemUsedValue": "1.3.6.1.4.1.2011.5.25.142.1.8.1.4", "hwGtlItemDescription": "1.3.6.1.4.1.2011.5.25.142.1.8.1.5"]
]

// --- hwGtlAbnormal (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.142.2.30
// Fields: hwGtlChassisID, hwGtlBoardID, hwGtlAbnormalReason
// Description: Notification represents license function is abnormal.
trapMap["1.3.6.1.4.1.2011.5.25.142.2.30"] = [
    name: "hwGtlAbnormal",
    fields: ["hwGtlChassisID", "hwGtlBoardID", "hwGtlAbnormalReason"],
    fieldOids: ["hwGtlChassisID": "1.3.6.1.4.1.2011.5.25.142.1.9", "hwGtlBoardID": "1.3.6.1.4.1.2011.5.25.142.1.10", "hwGtlAbnormalReason": "1.3.6.1.4.1.2011.5.25.142.1.11"]
]

// --- hwGtlAbnormalCleared (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.142.2.31
// Fields: hwGtlChassisID, hwGtlBoardID, hwGtlAbnormalReason
// Description: Notification represents license function is abnormal is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.142.2.31"] = [
    name: "hwGtlAbnormalCleared",
    fields: ["hwGtlChassisID", "hwGtlBoardID", "hwGtlAbnormalReason"],
    fieldOids: ["hwGtlChassisID": "1.3.6.1.4.1.2011.5.25.142.1.9", "hwGtlBoardID": "1.3.6.1.4.1.2011.5.25.142.1.10", "hwGtlAbnormalReason": "1.3.6.1.4.1.2011.5.25.142.1.11"]
]

// --- hwGtlTrialFeatureNearExpire (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.142.2.32
// Fields: hwGtlItemName, hwGtlItemDescription, hwGtlItemTrialRemainTime
// Description: The notification indicates that the trial of the license control item is about to expire.
trapMap["1.3.6.1.4.1.2011.5.25.142.2.32"] = [
    name: "hwGtlTrialFeatureNearExpire",
    fields: ["hwGtlItemName", "hwGtlItemDescription", "hwGtlItemTrialRemainTime"],
    fieldOids: ["hwGtlItemName": "1.3.6.1.4.1.2011.5.25.142.1.8.1.2", "hwGtlItemDescription": "1.3.6.1.4.1.2011.5.25.142.1.8.1.5", "hwGtlItemTrialRemainTime": "1.3.6.1.4.1.2011.5.25.142.1.8.1.8"]
]

// --- hwGtlTrialFeatureNearExpireCleared (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.142.2.33
// Fields: hwGtlItemName, hwGtlItemDescription, hwGtlItemTrialRemainTime
// Description: The notification indicates that the notification indicating that the trial of the license control item is about to expire is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.142.2.33"] = [
    name: "hwGtlTrialFeatureNearExpireCleared",
    fields: ["hwGtlItemName", "hwGtlItemDescription", "hwGtlItemTrialRemainTime"],
    fieldOids: ["hwGtlItemName": "1.3.6.1.4.1.2011.5.25.142.1.8.1.2", "hwGtlItemDescription": "1.3.6.1.4.1.2011.5.25.142.1.8.1.5", "hwGtlItemTrialRemainTime": "1.3.6.1.4.1.2011.5.25.142.1.8.1.8"]
]

// --- hwGtlTrialFeatureExpire (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.142.2.34
// Fields: hwGtlItemName, hwGtlItemDescription
// Description: The notification indicates that the trial of the license control item has expired.
trapMap["1.3.6.1.4.1.2011.5.25.142.2.34"] = [
    name: "hwGtlTrialFeatureExpire",
    fields: ["hwGtlItemName", "hwGtlItemDescription"],
    fieldOids: ["hwGtlItemName": "1.3.6.1.4.1.2011.5.25.142.1.8.1.2", "hwGtlItemDescription": "1.3.6.1.4.1.2011.5.25.142.1.8.1.5"]
]

// --- hwGtlTrialFeatureExpireCleared (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.142.2.35
// Fields: hwGtlItemName, hwGtlItemDescription
// Description: The notification indicates that the notification indicating that the trial of the license control item has expired is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.142.2.35"] = [
    name: "hwGtlTrialFeatureExpireCleared",
    fields: ["hwGtlItemName", "hwGtlItemDescription"],
    fieldOids: ["hwGtlItemName": "1.3.6.1.4.1.2011.5.25.142.1.8.1.2", "hwGtlItemDescription": "1.3.6.1.4.1.2011.5.25.142.1.8.1.5"]
]

// --- hwGtlTrialResFeatureEnable (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.142.2.36
// Fields: hwGtlItemTrialResRemainTime
// Description: Notification represents the trial of resource item is enable.
trapMap["1.3.6.1.4.1.2011.5.25.142.2.36"] = [
    name: "hwGtlTrialResFeatureEnable",
    fields: ["hwGtlItemTrialResRemainTime"],
    fieldOids: ["hwGtlItemTrialResRemainTime": "1.3.6.1.4.1.2011.5.25.142.1.8.1.9"]
]

// --- hwGtlTrialResFeatureDisable (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.142.2.37
// Description: Notification represents the trial of resource item is disable .
trapMap["1.3.6.1.4.1.2011.5.25.142.2.37"] = [
    name: "hwGtlTrialResFeatureDisable",
    fields: [],
    fieldOids: []
]

// --- hwGtlFeatureFunInactive (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.142.2.38
// Fields: hwGtlItemName, hwGtlFeatureName
// Description: The alarm indicates that the control item is not activated.
trapMap["1.3.6.1.4.1.2011.5.25.142.2.38"] = [
    name: "hwGtlFeatureFunInactive",
    fields: ["hwGtlItemName", "hwGtlFeatureName"],
    fieldOids: ["hwGtlItemName": "1.3.6.1.4.1.2011.5.25.142.1.8.1.2", "hwGtlFeatureName": "1.3.6.1.4.1.2011.5.25.142.1.3"]
]

// --- hwGtlFeatureFunInactiveCleared (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.142.2.39
// Fields: hwGtlItemName, hwGtlFeatureName
// Description: The alarm indicating that the control item is not activated is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.142.2.39"] = [
    name: "hwGtlFeatureFunInactiveCleared",
    fields: ["hwGtlItemName", "hwGtlFeatureName"],
    fieldOids: ["hwGtlItemName": "1.3.6.1.4.1.2011.5.25.142.1.8.1.2", "hwGtlFeatureName": "1.3.6.1.4.1.2011.5.25.142.1.3"]
]

// --- hwGtlLicenseStateChange (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.142.2.40
// Fields: hwGtlLicensePreviousState, hwGtlLicenseState
// Description: The alarm indicating that the license status has changed.
trapMap["1.3.6.1.4.1.2011.5.25.142.2.40"] = [
    name: "hwGtlLicenseStateChange",
    fields: ["hwGtlLicensePreviousState", "hwGtlLicenseState"],
    fieldOids: ["hwGtlLicensePreviousState": "1.3.6.1.4.1.2011.5.25.142.1.13", "hwGtlLicenseState": "1.3.6.1.4.1.2011.5.25.142.1.14"]
]

// --- hwGtlSnsNearExpire (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.142.2.41
// Fields: hwGtlSnsEndDate, hwGtlChassisID
// Description: The alarm indicates that the SnS is near deadline.
trapMap["1.3.6.1.4.1.2011.5.25.142.2.41"] = [
    name: "hwGtlSnsNearExpire",
    fields: ["hwGtlSnsEndDate", "hwGtlChassisID"],
    fieldOids: ["hwGtlSnsEndDate": "1.3.6.1.4.1.2011.5.25.142.1.15", "hwGtlChassisID": "1.3.6.1.4.1.2011.5.25.142.1.9"]
]

// --- hwGtlSnsNearExpireCleared (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.142.2.42
// Fields: hwGtlSnsEndDate, hwGtlChassisID
// Description: The alarm indicating that the SnS is near deadline is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.142.2.42"] = [
    name: "hwGtlSnsNearExpireCleared",
    fields: ["hwGtlSnsEndDate", "hwGtlChassisID"],
    fieldOids: ["hwGtlSnsEndDate": "1.3.6.1.4.1.2011.5.25.142.1.15", "hwGtlChassisID": "1.3.6.1.4.1.2011.5.25.142.1.9"]
]

// --- hwGtlSnsExpire (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.142.2.43
// Fields: hwGtlChassisID
// Description: The alarm indicates that the SnS is near deadline.
trapMap["1.3.6.1.4.1.2011.5.25.142.2.43"] = [
    name: "hwGtlSnsExpire",
    fields: ["hwGtlChassisID"],
    fieldOids: ["hwGtlChassisID": "1.3.6.1.4.1.2011.5.25.142.1.9"]
]

// --- hwGtlSnsExpireCleared (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.142.2.44
// Fields: hwGtlChassisID
// Description: The alarm indicating that the SnS is near deadline is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.142.2.44"] = [
    name: "hwGtlSnsExpireCleared",
    fields: ["hwGtlChassisID"],
    fieldOids: ["hwGtlChassisID": "1.3.6.1.4.1.2011.5.25.142.1.9"]
]

// --- hwGtlItemNearExpire (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.142.2.45
// Fields: hwGtlChassisID
// Description: The alarm indicates that the SnS of the cloud-based license sales item has expired.
trapMap["1.3.6.1.4.1.2011.5.25.142.2.45"] = [
    name: "hwGtlItemNearExpire",
    fields: ["hwGtlChassisID"],
    fieldOids: ["hwGtlChassisID": "1.3.6.1.4.1.2011.5.25.142.1.9"]
]

// --- hwGtlItemNearExpireResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.142.2.46
// Fields: hwGtlChassisID
// Description: The alarm indicating that the SnS of the cloud-based license sales item has expired is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.142.2.46"] = [
    name: "hwGtlItemNearExpireResume",
    fields: ["hwGtlChassisID"],
    fieldOids: ["hwGtlChassisID": "1.3.6.1.4.1.2011.5.25.142.1.9"]
]

// --- hwGtlItemExpire (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.142.2.47
// Fields: hwGtlChassisID
// Description: The alarm indicates that the SnS of the cloud-based license sales item expires.
trapMap["1.3.6.1.4.1.2011.5.25.142.2.47"] = [
    name: "hwGtlItemExpire",
    fields: ["hwGtlChassisID"],
    fieldOids: ["hwGtlChassisID": "1.3.6.1.4.1.2011.5.25.142.1.9"]
]

// --- hwGtlItemExpireResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.142.2.48
// Fields: hwGtlChassisID
// Description: The alarm indicating that the SnS of the cloud-based license sales item expires is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.142.2.48"] = [
    name: "hwGtlItemExpireResume",
    fields: ["hwGtlChassisID"],
    fieldOids: ["hwGtlChassisID": "1.3.6.1.4.1.2011.5.25.142.1.9"]
]

// --- hwGtlCloudNearDeadline (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.142.2.49
// Fields: hwGtlRemainTime
// Description: Notification represents the cloud license is near deadline.
trapMap["1.3.6.1.4.1.2011.5.25.142.2.49"] = [
    name: "hwGtlCloudNearDeadline",
    fields: ["hwGtlRemainTime"],
    fieldOids: ["hwGtlRemainTime": "1.3.6.1.4.1.2011.5.25.142.1.4"]
]

// --- hwGtlCloudNearDeadlineCleared (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.142.2.50
// Fields: hwGtlRemainTime
// Description: The alarm indicating that the cloud license is near deadline is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.142.2.50"] = [
    name: "hwGtlCloudNearDeadlineCleared",
    fields: ["hwGtlRemainTime"],
    fieldOids: ["hwGtlRemainTime": "1.3.6.1.4.1.2011.5.25.142.1.4"]
]

// --- hwGtlMachineESNChanged (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.142.2.51
// Fields: hwGtlLicenseRevokeTicket, hwGtlMachineESN
// Description: The alarm indicating the license is revoked because the ESN is changed.
trapMap["1.3.6.1.4.1.2011.5.25.142.2.51"] = [
    name: "hwGtlMachineESNChanged",
    fields: ["hwGtlLicenseRevokeTicket", "hwGtlMachineESN"],
    fieldOids: ["hwGtlLicenseRevokeTicket": "1.3.6.1.4.1.2011.5.25.142.1.16", "hwGtlMachineESN": "1.3.6.1.4.1.2011.5.25.142.1.17"]
]

// --- hwGtlCloudServerOffline (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.142.2.52
// Fields: hwGtlRemainingDays
// Description: The alarm indicating that the device is disconnected from the cloud license server.
trapMap["1.3.6.1.4.1.2011.5.25.142.2.52"] = [
    name: "hwGtlCloudServerOffline",
    fields: ["hwGtlRemainingDays"],
    fieldOids: ["hwGtlRemainingDays": "1.3.6.1.4.1.2011.5.25.142.1.19"]
]

// --- hwGtlCloudServerOfflineCleared (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.142.2.53
// Description: The alarm indicating disconnection between the device and the cloud license server is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.142.2.53"] = [
    name: "hwGtlCloudServerOfflineCleared",
    fields: [],
    fieldOids: []
]

// --- hwGtlCloudServerOfflineLocked (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.142.2.54
// Description: The device is locked because the device is disconnected from the cloud license server.
trapMap["1.3.6.1.4.1.2011.5.25.142.2.54"] = [
    name: "hwGtlCloudServerOfflineLocked",
    fields: [],
    fieldOids: []
]

// --- hwGtlCloudServerOfflineLockedCleared (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.142.2.55
// Description: The alarm indicating that the device is locked due to disconnection between the device and the cloud license server is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.142.2.55"] = [
    name: "hwGtlCloudServerOfflineLockedCleared",
    fields: [],
    fieldOids: []
]

// --- hwGtlDataDamaged (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.142.2.56
// Fields: hwGtlPosition
// Description: This notification indicates that the current license data is damaged.
trapMap["1.3.6.1.4.1.2011.5.25.142.2.56"] = [
    name: "hwGtlDataDamaged",
    fields: ["hwGtlPosition"],
    fieldOids: ["hwGtlPosition": "1.3.6.1.4.1.2011.5.25.142.1.20"]
]

// --- hwGtlDataDamagedResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.142.2.57
// Fields: hwGtlPosition
// Description: This notification indicates that the license data damage alarm has been cleared.
trapMap["1.3.6.1.4.1.2011.5.25.142.2.57"] = [
    name: "hwGtlDataDamagedResume",
    fields: ["hwGtlPosition"],
    fieldOids: ["hwGtlPosition": "1.3.6.1.4.1.2011.5.25.142.1.20"]
]

// --- hwGtlFeatureDefaultValue (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.142.2.58
// Fields: hwGtlFeatureName, hwGtlPosition, hwGtlDefaultValueReason
// Description: Notification represents the feature uses the default value.
trapMap["1.3.6.1.4.1.2011.5.25.142.2.58"] = [
    name: "hwGtlFeatureDefaultValue",
    fields: ["hwGtlFeatureName", "hwGtlPosition", "hwGtlDefaultValueReason"],
    fieldOids: ["hwGtlFeatureName": "1.3.6.1.4.1.2011.5.25.142.1.3", "hwGtlPosition": "1.3.6.1.4.1.2011.5.25.142.1.20", "hwGtlDefaultValueReason": "1.3.6.1.4.1.2011.5.25.142.1.1"]
]

// --- hwGtlFeatureDefaultValueCleared (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.142.2.59
// Fields: hwGtlFeatureName, hwGtlPosition, hwGtlDefaultValueReason
// Description: Notification represents the feature uses the default value is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.142.2.59"] = [
    name: "hwGtlFeatureDefaultValueCleared",
    fields: ["hwGtlFeatureName", "hwGtlPosition", "hwGtlDefaultValueReason"],
    fieldOids: ["hwGtlFeatureName": "1.3.6.1.4.1.2011.5.25.142.1.3", "hwGtlPosition": "1.3.6.1.4.1.2011.5.25.142.1.20", "hwGtlDefaultValueReason": "1.3.6.1.4.1.2011.5.25.142.1.1"]
]

// --- hwGtlResourceOverused (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.142.2.60
// Fields: hwGtlRunningDays, hwGtlRemainingDays
// Description: The license resources on the device have been overused.
trapMap["1.3.6.1.4.1.2011.5.25.142.2.60"] = [
    name: "hwGtlResourceOverused",
    fields: ["hwGtlRunningDays", "hwGtlRemainingDays"],
    fieldOids: ["hwGtlRunningDays": "1.3.6.1.4.1.2011.5.25.142.1.21", "hwGtlRemainingDays": "1.3.6.1.4.1.2011.5.25.142.1.19"]
]

// --- hwGtlResourceOverusedResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.142.2.61
// Description: The license resource overuse alarm has been cleared.
trapMap["1.3.6.1.4.1.2011.5.25.142.2.61"] = [
    name: "hwGtlResourceOverusedResume",
    fields: [],
    fieldOids: []
]

// ===== Parsing logic =====

// Set to true to enable diagnostic logging for this MIB parser
DEBUG = false

LOG_PREFIX = "[HUAWEI-GTL-MIB]"
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
