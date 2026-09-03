/**
 * Auto-generated from HUAWEI-DATA-PROCESSING-MIB.mib
 * Generated: 2026-08-24T18:28:29.331274400
 * Traps/Notifications (42): hwDpsBandWidthUsageReachThreshold, hwDpsBandWidthUsageReachThresholdResume, hwDpsBandWidthExhaust, hwDpsBandWidthExhaustResume, hwDpsPackFail, hwDpsPackFailResume, hwDpsEngineUnpackFail, hwDpsEngineUnpackFailResume, hwDpsServiceLocationScaleIn, hwDpsServiceLocationScaleInResume, hwDpsRevokeDueToLocal, hwDpsRevokeDueToLocalResume, hwDpsRevokeDueToRedirect, hwDpsRevokeDueToRedirectResume, hwDpsAppDictPackRatio, hwDpsAppDictPackRatioResume, hwDpsDictPackFault, hwDpsDictPackFaultResume, hwDpsDictFileFault, hwDpsDictFileFaultResume, hwDpsDictLoadFail, hwDpsDictLoadFailResume, hwDpsDictFileLost, hwDpsDictFileLostResume, hwDpsDictEngineLoadFail, hwDpsDictEngineLoadFailResume, hwDpsReceiveDictionaryFail, hwDpsReceiveDictionaryFailResume, hwDpsPackDictMismatch, hwDpsPackDictMismatchResume, hwDpsUnpackDictMismatch, hwDpsUnpackDictMismatchResume, hwDpsCpuSoftDown, hwDpsCpuSoftDownResume, hwDpsDictionarySoftFailure, hwDpsDictionarySoftFailureResume, hwDpsDictMismatch, hwDpsDictMismatchResume, hwDpsServiceLocationSlotScaleIn, hwDpsServiceLocationSlotScaleInResume, hwDpsSlotSoftDown, hwDpsSlotSoftDownResume
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

// --- hwDpsBandWidthUsageReachThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.371.1.2.1
// Fields: hwDpsSlotId, hwDpsThreshold, hwDpsbpsRateInUse, hwDpsMbpsRate, hwDpsLicenseBandwidth
// Description: The data processing bandwidth usage of the slot exceeds the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.371.1.2.1"] = [
    name: "hwDpsBandWidthUsageReachThreshold",
    fields: ["hwDpsSlotId", "hwDpsThreshold", "hwDpsbpsRateInUse", "hwDpsMbpsRate", "hwDpsLicenseBandwidth"],
    fieldOids: ["hwDpsSlotId": "1.3.6.1.4.1.2011.5.25.371.1.1.1", "hwDpsThreshold": "1.3.6.1.4.1.2011.5.25.371.1.1.2", "hwDpsbpsRateInUse": "1.3.6.1.4.1.2011.5.25.371.1.1.3", "hwDpsMbpsRate": "1.3.6.1.4.1.2011.5.25.371.1.1.4", "hwDpsLicenseBandwidth": "1.3.6.1.4.1.2011.5.25.371.1.1.5"]
]

// --- hwDpsBandWidthUsageReachThresholdResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.371.1.2.2
// Fields: hwDpsSlotId, hwDpsThreshold, hwDpsbpsRateInUse, hwDpsMbpsRate, hwDpsLicenseBandwidth
// Description: The data processing bandwidth usage of the slot fell below the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.371.1.2.2"] = [
    name: "hwDpsBandWidthUsageReachThresholdResume",
    fields: ["hwDpsSlotId", "hwDpsThreshold", "hwDpsbpsRateInUse", "hwDpsMbpsRate", "hwDpsLicenseBandwidth"],
    fieldOids: ["hwDpsSlotId": "1.3.6.1.4.1.2011.5.25.371.1.1.1", "hwDpsThreshold": "1.3.6.1.4.1.2011.5.25.371.1.1.2", "hwDpsbpsRateInUse": "1.3.6.1.4.1.2011.5.25.371.1.1.3", "hwDpsMbpsRate": "1.3.6.1.4.1.2011.5.25.371.1.1.4", "hwDpsLicenseBandwidth": "1.3.6.1.4.1.2011.5.25.371.1.1.5"]
]

// --- hwDpsBandWidthExhaust (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.371.1.2.3
// Fields: hwDpsSlotId, hwDpsbpsRateInUse, hwDpsMbpsRate, hwDpsLicenseBandwidth
// Description: The data processing bandwidth of the slot was exhausted.
trapMap["1.3.6.1.4.1.2011.5.25.371.1.2.3"] = [
    name: "hwDpsBandWidthExhaust",
    fields: ["hwDpsSlotId", "hwDpsbpsRateInUse", "hwDpsMbpsRate", "hwDpsLicenseBandwidth"],
    fieldOids: ["hwDpsSlotId": "1.3.6.1.4.1.2011.5.25.371.1.1.1", "hwDpsbpsRateInUse": "1.3.6.1.4.1.2011.5.25.371.1.1.3", "hwDpsMbpsRate": "1.3.6.1.4.1.2011.5.25.371.1.1.4", "hwDpsLicenseBandwidth": "1.3.6.1.4.1.2011.5.25.371.1.1.5"]
]

// --- hwDpsBandWidthExhaustResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.371.1.2.4
// Fields: hwDpsSlotId, hwDpsbpsRateInUse, hwDpsMbpsRate, hwDpsLicenseBandwidth
// Description: The slot data processing bandwidth resources became available again.
trapMap["1.3.6.1.4.1.2011.5.25.371.1.2.4"] = [
    name: "hwDpsBandWidthExhaustResume",
    fields: ["hwDpsSlotId", "hwDpsbpsRateInUse", "hwDpsMbpsRate", "hwDpsLicenseBandwidth"],
    fieldOids: ["hwDpsSlotId": "1.3.6.1.4.1.2011.5.25.371.1.1.1", "hwDpsbpsRateInUse": "1.3.6.1.4.1.2011.5.25.371.1.1.3", "hwDpsMbpsRate": "1.3.6.1.4.1.2011.5.25.371.1.1.4", "hwDpsLicenseBandwidth": "1.3.6.1.4.1.2011.5.25.371.1.1.5"]
]

// --- hwDpsPackFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.371.1.2.5
// Fields: hwDpsInstanceName
// Description: More than 10% of traffic failed to be packaged by the data processing instance in the last 5 minutes.
trapMap["1.3.6.1.4.1.2011.5.25.371.1.2.5"] = [
    name: "hwDpsPackFail",
    fields: ["hwDpsInstanceName"],
    fieldOids: ["hwDpsInstanceName": "1.3.6.1.4.1.2011.5.25.371.1.1.6"]
]

// --- hwDpsPackFailResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.371.1.2.6
// Fields: hwDpsInstanceName
// Description: Less than 10% of traffic failed to be packaged by the data processing instance in the last 5 minutes.
trapMap["1.3.6.1.4.1.2011.5.25.371.1.2.6"] = [
    name: "hwDpsPackFailResume",
    fields: ["hwDpsInstanceName"],
    fieldOids: ["hwDpsInstanceName": "1.3.6.1.4.1.2011.5.25.371.1.1.6"]
]

// --- hwDpsEngineUnpackFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.371.1.2.7
// Fields: hwDpsInstanceName
// Description: More than 10% of traffic failed to be unpackaged by the data processing instance in the last 5 minutes.
trapMap["1.3.6.1.4.1.2011.5.25.371.1.2.7"] = [
    name: "hwDpsEngineUnpackFail",
    fields: ["hwDpsInstanceName"],
    fieldOids: ["hwDpsInstanceName": "1.3.6.1.4.1.2011.5.25.371.1.1.6"]
]

// --- hwDpsEngineUnpackFailResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.371.1.2.8
// Fields: hwDpsInstanceName
// Description: Less than 10% of traffic failed to be unpackaged by the data processing instance in the last 5 minutes.
trapMap["1.3.6.1.4.1.2011.5.25.371.1.2.8"] = [
    name: "hwDpsEngineUnpackFailResume",
    fields: ["hwDpsInstanceName"],
    fieldOids: ["hwDpsInstanceName": "1.3.6.1.4.1.2011.5.25.371.1.1.6"]
]

// --- hwDpsServiceLocationScaleIn (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.371.1.2.9
// Fields: hwDpsSlotId, hwDpsEngineId
// Description: The engine does not exist, and the data processing functions related to the engine configuration do not take effect.
trapMap["1.3.6.1.4.1.2011.5.25.371.1.2.9"] = [
    name: "hwDpsServiceLocationScaleIn",
    fields: ["hwDpsSlotId", "hwDpsEngineId"],
    fieldOids: ["hwDpsSlotId": "1.3.6.1.4.1.2011.5.25.371.1.1.1", "hwDpsEngineId": "1.3.6.1.4.1.2011.5.25.371.1.1.7"]
]

// --- hwDpsServiceLocationScaleInResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.371.1.2.10
// Fields: hwDpsSlotId, hwDpsEngineId
// Description: The board is removed or the engine-related configuration is deleted.
trapMap["1.3.6.1.4.1.2011.5.25.371.1.2.10"] = [
    name: "hwDpsServiceLocationScaleInResume",
    fields: ["hwDpsSlotId", "hwDpsEngineId"],
    fieldOids: ["hwDpsSlotId": "1.3.6.1.4.1.2011.5.25.371.1.1.1", "hwDpsEngineId": "1.3.6.1.4.1.2011.5.25.371.1.1.7"]
]

// --- hwDpsRevokeDueToLocal (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.371.1.2.11
// Fields: hwDpsInstanceName, hwDpsMinimumCPU, hwDpsWorkCPU, hwDpsConfigCPU
// Description: The data redundancy elimination service did not take effect due to a local fault.
trapMap["1.3.6.1.4.1.2011.5.25.371.1.2.11"] = [
    name: "hwDpsRevokeDueToLocal",
    fields: ["hwDpsInstanceName", "hwDpsMinimumCPU", "hwDpsWorkCPU", "hwDpsConfigCPU"],
    fieldOids: ["hwDpsInstanceName": "1.3.6.1.4.1.2011.5.25.371.1.1.6", "hwDpsMinimumCPU": "1.3.6.1.4.1.2011.5.25.371.1.1.8", "hwDpsWorkCPU": "1.3.6.1.4.1.2011.5.25.371.1.1.9", "hwDpsConfigCPU": "1.3.6.1.4.1.2011.5.25.371.1.1.10"]
]

// --- hwDpsRevokeDueToLocalResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.371.1.2.12
// Fields: hwDpsInstanceName, hwDpsMinimumCPU, hwDpsWorkCPU, hwDpsConfigCPU
// Description: The data redundancy elimination service took effect because the local fault was rectified.
trapMap["1.3.6.1.4.1.2011.5.25.371.1.2.12"] = [
    name: "hwDpsRevokeDueToLocalResume",
    fields: ["hwDpsInstanceName", "hwDpsMinimumCPU", "hwDpsWorkCPU", "hwDpsConfigCPU"],
    fieldOids: ["hwDpsInstanceName": "1.3.6.1.4.1.2011.5.25.371.1.1.6", "hwDpsMinimumCPU": "1.3.6.1.4.1.2011.5.25.371.1.1.8", "hwDpsWorkCPU": "1.3.6.1.4.1.2011.5.25.371.1.1.9", "hwDpsConfigCPU": "1.3.6.1.4.1.2011.5.25.371.1.1.10"]
]

// --- hwDpsRevokeDueToRedirect (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.371.1.2.13
// Fields: hwDpsInstanceName
// Description: The data redundancy elimination service did not take effect because the redirection link was unreachable.
trapMap["1.3.6.1.4.1.2011.5.25.371.1.2.13"] = [
    name: "hwDpsRevokeDueToRedirect",
    fields: ["hwDpsInstanceName"],
    fieldOids: ["hwDpsInstanceName": "1.3.6.1.4.1.2011.5.25.371.1.1.6"]
]

// --- hwDpsRevokeDueToRedirectResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.371.1.2.14
// Fields: hwDpsInstanceName
// Description: The data redundancy elimination service took effect because the redirection link was reachable.
trapMap["1.3.6.1.4.1.2011.5.25.371.1.2.14"] = [
    name: "hwDpsRevokeDueToRedirectResume",
    fields: ["hwDpsInstanceName"],
    fieldOids: ["hwDpsInstanceName": "1.3.6.1.4.1.2011.5.25.371.1.1.6"]
]

// --- hwDpsAppDictPackRatio (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.371.1.2.15
// Fields: hwDpsApplicationId, hwDpsDictionaryFileName, hwDpsThreshold, hwDpsPackRatioValue, hwDpsBenchmarkRatioValue
// Description: The pack ratio of the dictionary file used in the application fell below the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.371.1.2.15"] = [
    name: "hwDpsAppDictPackRatio",
    fields: ["hwDpsApplicationId", "hwDpsDictionaryFileName", "hwDpsThreshold", "hwDpsPackRatioValue", "hwDpsBenchmarkRatioValue"],
    fieldOids: ["hwDpsApplicationId": "1.3.6.1.4.1.2011.5.25.371.1.1.11", "hwDpsDictionaryFileName": "1.3.6.1.4.1.2011.5.25.371.1.1.12", "hwDpsThreshold": "1.3.6.1.4.1.2011.5.25.371.1.1.2", "hwDpsPackRatioValue": "1.3.6.1.4.1.2011.5.25.371.1.1.13", "hwDpsBenchmarkRatioValue": "1.3.6.1.4.1.2011.5.25.371.1.1.14"]
]

// --- hwDpsAppDictPackRatioResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.371.1.2.16
// Fields: hwDpsApplicationId, hwDpsDictionaryFileName, hwDpsThreshold, hwDpsPackRatioValue, hwDpsBenchmarkRatioValue
// Description: The pack ratio of the dictionary file used in the application exceeded the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.371.1.2.16"] = [
    name: "hwDpsAppDictPackRatioResume",
    fields: ["hwDpsApplicationId", "hwDpsDictionaryFileName", "hwDpsThreshold", "hwDpsPackRatioValue", "hwDpsBenchmarkRatioValue"],
    fieldOids: ["hwDpsApplicationId": "1.3.6.1.4.1.2011.5.25.371.1.1.11", "hwDpsDictionaryFileName": "1.3.6.1.4.1.2011.5.25.371.1.1.12", "hwDpsThreshold": "1.3.6.1.4.1.2011.5.25.371.1.1.2", "hwDpsPackRatioValue": "1.3.6.1.4.1.2011.5.25.371.1.1.13", "hwDpsBenchmarkRatioValue": "1.3.6.1.4.1.2011.5.25.371.1.1.14"]
]

// --- hwDpsDictPackFault (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.371.1.2.17
// Fields: hwDpsApplicationId, hwDpsDictionaryFileName, hwDpsFaultReason
// Description: Data redundancy elimination based on the dictionary file was unavailable.
trapMap["1.3.6.1.4.1.2011.5.25.371.1.2.17"] = [
    name: "hwDpsDictPackFault",
    fields: ["hwDpsApplicationId", "hwDpsDictionaryFileName", "hwDpsFaultReason"],
    fieldOids: ["hwDpsApplicationId": "1.3.6.1.4.1.2011.5.25.371.1.1.11", "hwDpsDictionaryFileName": "1.3.6.1.4.1.2011.5.25.371.1.1.12", "hwDpsFaultReason": "1.3.6.1.4.1.2011.5.25.371.1.1.15"]
]

// --- hwDpsDictPackFaultResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.371.1.2.18
// Fields: hwDpsApplicationId, hwDpsDictionaryFileName, hwDpsFaultReason
// Description: Data redundancy elimination based on the dictionary file was available again.
trapMap["1.3.6.1.4.1.2011.5.25.371.1.2.18"] = [
    name: "hwDpsDictPackFaultResume",
    fields: ["hwDpsApplicationId", "hwDpsDictionaryFileName", "hwDpsFaultReason"],
    fieldOids: ["hwDpsApplicationId": "1.3.6.1.4.1.2011.5.25.371.1.1.11", "hwDpsDictionaryFileName": "1.3.6.1.4.1.2011.5.25.371.1.1.12", "hwDpsFaultReason": "1.3.6.1.4.1.2011.5.25.371.1.1.15"]
]

// --- hwDpsDictFileFault (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.371.1.2.19
// Fields: hwDpsDictionaryFileName, hwDpsFaultReason
// Description: The dictionary file of data redundancy elimination was unavailable.
trapMap["1.3.6.1.4.1.2011.5.25.371.1.2.19"] = [
    name: "hwDpsDictFileFault",
    fields: ["hwDpsDictionaryFileName", "hwDpsFaultReason"],
    fieldOids: ["hwDpsDictionaryFileName": "1.3.6.1.4.1.2011.5.25.371.1.1.12", "hwDpsFaultReason": "1.3.6.1.4.1.2011.5.25.371.1.1.15"]
]

// --- hwDpsDictFileFaultResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.371.1.2.20
// Fields: hwDpsDictionaryFileName, hwDpsFaultReason
// Description: The dictionary file of data redundancy elimination had been deleted.
trapMap["1.3.6.1.4.1.2011.5.25.371.1.2.20"] = [
    name: "hwDpsDictFileFaultResume",
    fields: ["hwDpsDictionaryFileName", "hwDpsFaultReason"],
    fieldOids: ["hwDpsDictionaryFileName": "1.3.6.1.4.1.2011.5.25.371.1.1.12", "hwDpsFaultReason": "1.3.6.1.4.1.2011.5.25.371.1.1.15"]
]

// --- hwDpsDictLoadFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.371.1.2.21
// Fields: hwDpsDictionaryFileName, hwDpsSlotId, hwDpsReasonId, hwDpsFaultReason
// Description: The dictionary file of data redundancy elimination failed to be loaded.
trapMap["1.3.6.1.4.1.2011.5.25.371.1.2.21"] = [
    name: "hwDpsDictLoadFail",
    fields: ["hwDpsDictionaryFileName", "hwDpsSlotId", "hwDpsReasonId", "hwDpsFaultReason"],
    fieldOids: ["hwDpsDictionaryFileName": "1.3.6.1.4.1.2011.5.25.371.1.1.12", "hwDpsSlotId": "1.3.6.1.4.1.2011.5.25.371.1.1.1", "hwDpsReasonId": "1.3.6.1.4.1.2011.5.25.371.1.1.17", "hwDpsFaultReason": "1.3.6.1.4.1.2011.5.25.371.1.1.15"]
]

// --- hwDpsDictLoadFailResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.371.1.2.22
// Fields: hwDpsDictionaryFileName, hwDpsSlotId, hwDpsReasonId, hwDpsFaultReason
// Description: The dictionary file of data redundancy elimination was successfully loaded.
trapMap["1.3.6.1.4.1.2011.5.25.371.1.2.22"] = [
    name: "hwDpsDictLoadFailResume",
    fields: ["hwDpsDictionaryFileName", "hwDpsSlotId", "hwDpsReasonId", "hwDpsFaultReason"],
    fieldOids: ["hwDpsDictionaryFileName": "1.3.6.1.4.1.2011.5.25.371.1.1.12", "hwDpsSlotId": "1.3.6.1.4.1.2011.5.25.371.1.1.1", "hwDpsReasonId": "1.3.6.1.4.1.2011.5.25.371.1.1.17", "hwDpsFaultReason": "1.3.6.1.4.1.2011.5.25.371.1.1.15"]
]

// --- hwDpsDictFileLost (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.371.1.2.23
// Fields: hwDpsDictionaryFileName
// Description: The loaded dictionary file of data redundancy elimination was lost.
trapMap["1.3.6.1.4.1.2011.5.25.371.1.2.23"] = [
    name: "hwDpsDictFileLost",
    fields: ["hwDpsDictionaryFileName"],
    fieldOids: ["hwDpsDictionaryFileName": "1.3.6.1.4.1.2011.5.25.371.1.1.12"]
]

// --- hwDpsDictFileLostResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.371.1.2.24
// Fields: hwDpsDictionaryFileName
// Description: The loaded dictionary file of data redundancy elimination recovered.
trapMap["1.3.6.1.4.1.2011.5.25.371.1.2.24"] = [
    name: "hwDpsDictFileLostResume",
    fields: ["hwDpsDictionaryFileName"],
    fieldOids: ["hwDpsDictionaryFileName": "1.3.6.1.4.1.2011.5.25.371.1.1.12"]
]

// --- hwDpsDictEngineLoadFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.371.1.2.25
// Fields: hwDpsDictionaryFileName, hwDpsSlotId, hwDpsEngineId, hwDpsReasonId, hwDpsFaultReason
// Description: The dictionary file of data redundancy elimination failed to be loaded.
trapMap["1.3.6.1.4.1.2011.5.25.371.1.2.25"] = [
    name: "hwDpsDictEngineLoadFail",
    fields: ["hwDpsDictionaryFileName", "hwDpsSlotId", "hwDpsEngineId", "hwDpsReasonId", "hwDpsFaultReason"],
    fieldOids: ["hwDpsDictionaryFileName": "1.3.6.1.4.1.2011.5.25.371.1.1.12", "hwDpsSlotId": "1.3.6.1.4.1.2011.5.25.371.1.1.1", "hwDpsEngineId": "1.3.6.1.4.1.2011.5.25.371.1.1.7", "hwDpsReasonId": "1.3.6.1.4.1.2011.5.25.371.1.1.17", "hwDpsFaultReason": "1.3.6.1.4.1.2011.5.25.371.1.1.15"]
]

// --- hwDpsDictEngineLoadFailResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.371.1.2.26
// Fields: hwDpsDictionaryFileName, hwDpsSlotId, hwDpsEngineId, hwDpsReasonId, hwDpsFaultReason
// Description: The dictionary file of data redundancy elimination was successfully loaded.
trapMap["1.3.6.1.4.1.2011.5.25.371.1.2.26"] = [
    name: "hwDpsDictEngineLoadFailResume",
    fields: ["hwDpsDictionaryFileName", "hwDpsSlotId", "hwDpsEngineId", "hwDpsReasonId", "hwDpsFaultReason"],
    fieldOids: ["hwDpsDictionaryFileName": "1.3.6.1.4.1.2011.5.25.371.1.1.12", "hwDpsSlotId": "1.3.6.1.4.1.2011.5.25.371.1.1.1", "hwDpsEngineId": "1.3.6.1.4.1.2011.5.25.371.1.1.7", "hwDpsReasonId": "1.3.6.1.4.1.2011.5.25.371.1.1.17", "hwDpsFaultReason": "1.3.6.1.4.1.2011.5.25.371.1.1.15"]
]

// --- hwDpsReceiveDictionaryFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.371.1.2.27
// Fields: hwDpsApplicationId, hwDpsDictionaryFileName, hwDpsDictionarySegmentIndex, hwDpsReasonId, hwDpsFaultReason
// Description: The device fails to receive the dictionary file.
trapMap["1.3.6.1.4.1.2011.5.25.371.1.2.27"] = [
    name: "hwDpsReceiveDictionaryFail",
    fields: ["hwDpsApplicationId", "hwDpsDictionaryFileName", "hwDpsDictionarySegmentIndex", "hwDpsReasonId", "hwDpsFaultReason"],
    fieldOids: ["hwDpsApplicationId": "1.3.6.1.4.1.2011.5.25.371.1.1.11", "hwDpsDictionaryFileName": "1.3.6.1.4.1.2011.5.25.371.1.1.12", "hwDpsDictionarySegmentIndex": "1.3.6.1.4.1.2011.5.25.371.1.1.16", "hwDpsReasonId": "1.3.6.1.4.1.2011.5.25.371.1.1.17", "hwDpsFaultReason": "1.3.6.1.4.1.2011.5.25.371.1.1.15"]
]

// --- hwDpsReceiveDictionaryFailResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.371.1.2.28
// Fields: hwDpsApplicationId, hwDpsDictionaryFileName, hwDpsDictionarySegmentIndex, hwDpsReasonId, hwDpsFaultReason
// Description: The device receives the dictionary file successfully or does not need to receive again.
trapMap["1.3.6.1.4.1.2011.5.25.371.1.2.28"] = [
    name: "hwDpsReceiveDictionaryFailResume",
    fields: ["hwDpsApplicationId", "hwDpsDictionaryFileName", "hwDpsDictionarySegmentIndex", "hwDpsReasonId", "hwDpsFaultReason"],
    fieldOids: ["hwDpsApplicationId": "1.3.6.1.4.1.2011.5.25.371.1.1.11", "hwDpsDictionaryFileName": "1.3.6.1.4.1.2011.5.25.371.1.1.12", "hwDpsDictionarySegmentIndex": "1.3.6.1.4.1.2011.5.25.371.1.1.16", "hwDpsReasonId": "1.3.6.1.4.1.2011.5.25.371.1.1.17", "hwDpsFaultReason": "1.3.6.1.4.1.2011.5.25.371.1.1.15"]
]

// --- hwDpsPackDictMismatch (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.371.1.2.29
// Fields: hwDpsApplicationId, hwDpsDictionaryFileName
// Description: The dictionary at the compressing end is inconsistent with that at the decompressing end.
trapMap["1.3.6.1.4.1.2011.5.25.371.1.2.29"] = [
    name: "hwDpsPackDictMismatch",
    fields: ["hwDpsApplicationId", "hwDpsDictionaryFileName"],
    fieldOids: ["hwDpsApplicationId": "1.3.6.1.4.1.2011.5.25.371.1.1.11", "hwDpsDictionaryFileName": "1.3.6.1.4.1.2011.5.25.371.1.1.12"]
]

// --- hwDpsPackDictMismatchResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.371.1.2.30
// Fields: hwDpsApplicationId, hwDpsDictionaryFileName
// Description: The dictionary at the compressing end is consistent with that at the decompressing end, or the consistency check conditions are not met.
trapMap["1.3.6.1.4.1.2011.5.25.371.1.2.30"] = [
    name: "hwDpsPackDictMismatchResume",
    fields: ["hwDpsApplicationId", "hwDpsDictionaryFileName"],
    fieldOids: ["hwDpsApplicationId": "1.3.6.1.4.1.2011.5.25.371.1.1.11", "hwDpsDictionaryFileName": "1.3.6.1.4.1.2011.5.25.371.1.1.12"]
]

// --- hwDpsUnpackDictMismatch (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.371.1.2.31
// Fields: hwDpsApplicationId, hwDpsDictionaryFileName
// Description: The dictionary at the local decompressing end is inconsistent with that at the peer decompressing end.
trapMap["1.3.6.1.4.1.2011.5.25.371.1.2.31"] = [
    name: "hwDpsUnpackDictMismatch",
    fields: ["hwDpsApplicationId", "hwDpsDictionaryFileName"],
    fieldOids: ["hwDpsApplicationId": "1.3.6.1.4.1.2011.5.25.371.1.1.11", "hwDpsDictionaryFileName": "1.3.6.1.4.1.2011.5.25.371.1.1.12"]
]

// --- hwDpsUnpackDictMismatchResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.371.1.2.32
// Fields: hwDpsApplicationId, hwDpsDictionaryFileName
// Description: The dictionary at the local decompressing end is consistent with that at the peer decompressing end, or the consistency check conditions are not met.
trapMap["1.3.6.1.4.1.2011.5.25.371.1.2.32"] = [
    name: "hwDpsUnpackDictMismatchResume",
    fields: ["hwDpsApplicationId", "hwDpsDictionaryFileName"],
    fieldOids: ["hwDpsApplicationId": "1.3.6.1.4.1.2011.5.25.371.1.1.11", "hwDpsDictionaryFileName": "1.3.6.1.4.1.2011.5.25.371.1.1.12"]
]

// --- hwDpsCpuSoftDown (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.371.1.2.33
// Fields: hwDpsInstanceName, hwDpsSlotId, hwDpsEngineId
// Description: The CPU is faulty.
trapMap["1.3.6.1.4.1.2011.5.25.371.1.2.33"] = [
    name: "hwDpsCpuSoftDown",
    fields: ["hwDpsInstanceName", "hwDpsSlotId", "hwDpsEngineId"],
    fieldOids: ["hwDpsInstanceName": "1.3.6.1.4.1.2011.5.25.371.1.1.6", "hwDpsSlotId": "1.3.6.1.4.1.2011.5.25.371.1.1.1", "hwDpsEngineId": "1.3.6.1.4.1.2011.5.25.371.1.1.7"]
]

// --- hwDpsCpuSoftDownResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.371.1.2.34
// Fields: hwDpsInstanceName, hwDpsSlotId, hwDpsEngineId
// Description: The CPU fault is rectified.
trapMap["1.3.6.1.4.1.2011.5.25.371.1.2.34"] = [
    name: "hwDpsCpuSoftDownResume",
    fields: ["hwDpsInstanceName", "hwDpsSlotId", "hwDpsEngineId"],
    fieldOids: ["hwDpsInstanceName": "1.3.6.1.4.1.2011.5.25.371.1.1.6", "hwDpsSlotId": "1.3.6.1.4.1.2011.5.25.371.1.1.1", "hwDpsEngineId": "1.3.6.1.4.1.2011.5.25.371.1.1.7"]
]

// --- hwDpsDictionarySoftFailure (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.371.1.2.35
// Fields: hwDpsInstanceName, hwDpsApplicationId, hwDpsDictionaryFileName
// Description: The dictionary is faulty.
trapMap["1.3.6.1.4.1.2011.5.25.371.1.2.35"] = [
    name: "hwDpsDictionarySoftFailure",
    fields: ["hwDpsInstanceName", "hwDpsApplicationId", "hwDpsDictionaryFileName"],
    fieldOids: ["hwDpsInstanceName": "1.3.6.1.4.1.2011.5.25.371.1.1.6", "hwDpsApplicationId": "1.3.6.1.4.1.2011.5.25.371.1.1.11", "hwDpsDictionaryFileName": "1.3.6.1.4.1.2011.5.25.371.1.1.12"]
]

// --- hwDpsDictionarySoftFailureResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.371.1.2.36
// Fields: hwDpsInstanceName, hwDpsApplicationId, hwDpsDictionaryFileName
// Description: The dictionary fault is rectified.
trapMap["1.3.6.1.4.1.2011.5.25.371.1.2.36"] = [
    name: "hwDpsDictionarySoftFailureResume",
    fields: ["hwDpsInstanceName", "hwDpsApplicationId", "hwDpsDictionaryFileName"],
    fieldOids: ["hwDpsInstanceName": "1.3.6.1.4.1.2011.5.25.371.1.1.6", "hwDpsApplicationId": "1.3.6.1.4.1.2011.5.25.371.1.1.11", "hwDpsDictionaryFileName": "1.3.6.1.4.1.2011.5.25.371.1.1.12"]
]

// --- hwDpsDictMismatch (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.371.1.2.37
// Fields: hwDpsApplicationId, hwDpsDictionaryFileName
// Description: The dictionary at the local decompressing end is inconsistent with that at the peer decompressing end.
trapMap["1.3.6.1.4.1.2011.5.25.371.1.2.37"] = [
    name: "hwDpsDictMismatch",
    fields: ["hwDpsApplicationId", "hwDpsDictionaryFileName"],
    fieldOids: ["hwDpsApplicationId": "1.3.6.1.4.1.2011.5.25.371.1.1.11", "hwDpsDictionaryFileName": "1.3.6.1.4.1.2011.5.25.371.1.1.12"]
]

// --- hwDpsDictMismatchResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.371.1.2.38
// Fields: hwDpsApplicationId, hwDpsDictionaryFileName
// Description: The dictionary at the local decompressing end is consistent with that at the peer decompressing end, or the consistency check conditions are not met.
trapMap["1.3.6.1.4.1.2011.5.25.371.1.2.38"] = [
    name: "hwDpsDictMismatchResume",
    fields: ["hwDpsApplicationId", "hwDpsDictionaryFileName"],
    fieldOids: ["hwDpsApplicationId": "1.3.6.1.4.1.2011.5.25.371.1.1.11", "hwDpsDictionaryFileName": "1.3.6.1.4.1.2011.5.25.371.1.1.12"]
]

// --- hwDpsServiceLocationSlotScaleIn (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.371.1.2.39
// Fields: hwDpsSlotId
// Description: The slot does not exist, and the data processing functions related to the slot configuration do not take effect.
trapMap["1.3.6.1.4.1.2011.5.25.371.1.2.39"] = [
    name: "hwDpsServiceLocationSlotScaleIn",
    fields: ["hwDpsSlotId"],
    fieldOids: ["hwDpsSlotId": "1.3.6.1.4.1.2011.5.25.371.1.1.1"]
]

// --- hwDpsServiceLocationSlotScaleInResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.371.1.2.40
// Fields: hwDpsSlotId
// Description: The board is removed or the slot-related configuration is deleted.
trapMap["1.3.6.1.4.1.2011.5.25.371.1.2.40"] = [
    name: "hwDpsServiceLocationSlotScaleInResume",
    fields: ["hwDpsSlotId"],
    fieldOids: ["hwDpsSlotId": "1.3.6.1.4.1.2011.5.25.371.1.1.1"]
]

// --- hwDpsSlotSoftDown (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.371.1.2.41
// Fields: hwDpsInstanceName, hwDpsSlotId
// Description: The CPU is faulty.
trapMap["1.3.6.1.4.1.2011.5.25.371.1.2.41"] = [
    name: "hwDpsSlotSoftDown",
    fields: ["hwDpsInstanceName", "hwDpsSlotId"],
    fieldOids: ["hwDpsInstanceName": "1.3.6.1.4.1.2011.5.25.371.1.1.6", "hwDpsSlotId": "1.3.6.1.4.1.2011.5.25.371.1.1.1"]
]

// --- hwDpsSlotSoftDownResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.371.1.2.42
// Fields: hwDpsInstanceName, hwDpsSlotId
// Description: The CPU fault is rectified.
trapMap["1.3.6.1.4.1.2011.5.25.371.1.2.42"] = [
    name: "hwDpsSlotSoftDownResume",
    fields: ["hwDpsInstanceName", "hwDpsSlotId"],
    fieldOids: ["hwDpsInstanceName": "1.3.6.1.4.1.2011.5.25.371.1.1.6", "hwDpsSlotId": "1.3.6.1.4.1.2011.5.25.371.1.1.1"]
]

// ===== Parsing logic =====

// Set to true to enable diagnostic logging for this MIB parser
DEBUG = false

LOG_PREFIX = "[HUAWEI-DATA-PROCESSING-MIB]"
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
