/**
 * Auto-generated from HUAWEI-POE-MIB.mib
 * Generated: 2026-08-24T18:28:30.644747500
 * Traps/Notifications (44): hwPoeDimmError, hwPoePowerOff, hwPoePowerOn, hwPoeSlotPowerOverload, hwPoeSlotPowerOverloadResume, hwPoePdPowerOverload, hwPoePdPowerOverloadResume, hwPoePdConnected, hwPoePdDisconnected, hwPoePdClassInvalid, hwPoePdClassOvercurrent, hwPoePdPowerOvercurrent, hwPoePdPowerOvercurrentResume, hwPoePowerOnFail, hwPoePowerOffCurrentLimits, hwPoePdPriorityDifferent, hwPoePowerOverUtilizationThreshold, hwPoePowerOverUtilizationThresholdResume, hwPoeBoardInsertedWrongFrame, hwPoePowerAbsent, hwPoePowerAbsentResume, hwPoeRpsPowerOutputAlarm, hwPoeRpsPowerOutputAlarmResume, hwPoeControlChipFail, hwPoeControlChipFailResume, hwPoePSEPowerCut, hwPoePSEPowerCutResume, hwPoeSlotPowerCut, hwPoeSlotPowerCutResume, hwPoeNotAvailable, hwPoeNotAvailableResume, hwPoeCardAbsent, hwPoePortFail, hwPoePortFailResume, hwPdPowerCut, hwPdPowerCutResume, hwPoeChipFail, hwPoeChipFailResume, hwPdVltLow, hwPdVltLowResume, hwPdVltHigh, hwPdVltHighResume, hwPseVltLow, hwPseVltLowResume
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

// --- hwPoeDimmError (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.195.40.1
// Fields: hwPoeSlotNum, hwPoeDimmId
// Description: This object indicates the Dimm chip error.
trapMap["1.3.6.1.4.1.2011.5.25.195.40.1"] = [
    name: "hwPoeDimmError",
    fields: ["hwPoeSlotNum", "hwPoeDimmId"],
    fieldOids: ["hwPoeSlotNum": "1.3.6.1.4.1.2011.5.25.195.39.2", "hwPoeDimmId": "1.3.6.1.4.1.2011.5.25.195.2.1.10"]
]

// --- hwPoePowerOff (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.195.40.2
// Fields: hwPoePortName
// Description: This object indicates a PD connected to an interface is powered off.
trapMap["1.3.6.1.4.1.2011.5.25.195.40.2"] = [
    name: "hwPoePowerOff",
    fields: ["hwPoePortName"],
    fieldOids: ["hwPoePortName": "1.3.6.1.4.1.2011.5.25.195.3.1.2"]
]

// --- hwPoePowerOn (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.195.40.3
// Fields: hwPoePortName
// Description: This object indicates that a PD connected to an interface is powered on.
trapMap["1.3.6.1.4.1.2011.5.25.195.40.3"] = [
    name: "hwPoePowerOn",
    fields: ["hwPoePortName"],
    fieldOids: ["hwPoePortName": "1.3.6.1.4.1.2011.5.25.195.3.1.2"]
]

// --- hwPoeSlotPowerOverload (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.195.40.4
// Fields: hwPoeSlotNum, hwPoeSlotConsumingPower
// Description: This object indicates that the power consumed by a slot exceeds the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.195.40.4"] = [
    name: "hwPoeSlotPowerOverload",
    fields: ["hwPoeSlotNum", "hwPoeSlotConsumingPower"],
    fieldOids: ["hwPoeSlotNum": "1.3.6.1.4.1.2011.5.25.195.39.2", "hwPoeSlotConsumingPower": "1.3.6.1.4.1.2011.5.25.195.2.1.5"]
]

// --- hwPoeSlotPowerOverloadResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.195.40.5
// Fields: hwPoeSlotNum, hwPoeSlotConsumingPower
// Description: This object indicates that the power consumed by a slot does not exceed the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.195.40.5"] = [
    name: "hwPoeSlotPowerOverloadResume",
    fields: ["hwPoeSlotNum", "hwPoeSlotConsumingPower"],
    fieldOids: ["hwPoeSlotNum": "1.3.6.1.4.1.2011.5.25.195.39.2", "hwPoeSlotConsumingPower": "1.3.6.1.4.1.2011.5.25.195.2.1.5"]
]

// --- hwPoePdPowerOverload (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.195.40.6
// Fields: hwPoePortName, hwPoePortConsumingPower, hwPoePortMaximumPower
// Description: This object indicates the power consumed by a PD connected to an interface exceeds the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.195.40.6"] = [
    name: "hwPoePdPowerOverload",
    fields: ["hwPoePortName", "hwPoePortConsumingPower", "hwPoePortMaximumPower"],
    fieldOids: ["hwPoePortName": "1.3.6.1.4.1.2011.5.25.195.3.1.2", "hwPoePortConsumingPower": "1.3.6.1.4.1.2011.5.25.195.3.1.10", "hwPoePortMaximumPower": "1.3.6.1.4.1.2011.5.25.195.3.1.5"]
]

// --- hwPoePdPowerOverloadResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.195.40.7
// Fields: hwPoePortName, hwPoePortConsumingPower, hwPoePortMaximumPower
// Description: This object indicates that the power consumed by a PD connected to an interface does not exceed the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.195.40.7"] = [
    name: "hwPoePdPowerOverloadResume",
    fields: ["hwPoePortName", "hwPoePortConsumingPower", "hwPoePortMaximumPower"],
    fieldOids: ["hwPoePortName": "1.3.6.1.4.1.2011.5.25.195.3.1.2", "hwPoePortConsumingPower": "1.3.6.1.4.1.2011.5.25.195.3.1.10", "hwPoePortMaximumPower": "1.3.6.1.4.1.2011.5.25.195.3.1.5"]
]

// --- hwPoePdConnected (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.195.40.8
// Fields: hwPoePortName
// Description: This object indicates that a PD is connected to an interface.
trapMap["1.3.6.1.4.1.2011.5.25.195.40.8"] = [
    name: "hwPoePdConnected",
    fields: ["hwPoePortName"],
    fieldOids: ["hwPoePortName": "1.3.6.1.4.1.2011.5.25.195.3.1.2"]
]

// --- hwPoePdDisconnected (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.195.40.9
// Fields: hwPoePortName
// Description: This object indicates that a PD is disconnected from an interface.
trapMap["1.3.6.1.4.1.2011.5.25.195.40.9"] = [
    name: "hwPoePdDisconnected",
    fields: ["hwPoePortName"],
    fieldOids: ["hwPoePortName": "1.3.6.1.4.1.2011.5.25.195.3.1.2"]
]

// --- hwPoePdClassInvalid (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.195.40.10
// Fields: hwPoePortName
// Description: This object indicates that a PD of an invalid class is detected.
trapMap["1.3.6.1.4.1.2011.5.25.195.40.10"] = [
    name: "hwPoePdClassInvalid",
    fields: ["hwPoePortName"],
    fieldOids: ["hwPoePortName": "1.3.6.1.4.1.2011.5.25.195.3.1.2"]
]

// --- hwPoePdClassOvercurrent (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.195.40.11
// Fields: hwPoePortName
// Description: This object indicates that overcurrent occurs during the classification of a PD.
trapMap["1.3.6.1.4.1.2011.5.25.195.40.11"] = [
    name: "hwPoePdClassOvercurrent",
    fields: ["hwPoePortName"],
    fieldOids: ["hwPoePortName": "1.3.6.1.4.1.2011.5.25.195.3.1.2"]
]

// --- hwPoePdPowerOvercurrent (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.195.40.12
// Fields: hwPoePortName
// Description: This object indicates that overcurrent occurs during the powering of a PD.
trapMap["1.3.6.1.4.1.2011.5.25.195.40.12"] = [
    name: "hwPoePdPowerOvercurrent",
    fields: ["hwPoePortName"],
    fieldOids: ["hwPoePortName": "1.3.6.1.4.1.2011.5.25.195.3.1.2"]
]

// --- hwPoePdPowerOvercurrentResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.195.40.13
// Fields: hwPoePortName
// Description: This object indicates that overcurrent is rectified.
trapMap["1.3.6.1.4.1.2011.5.25.195.40.13"] = [
    name: "hwPoePdPowerOvercurrentResume",
    fields: ["hwPoePortName"],
    fieldOids: ["hwPoePortName": "1.3.6.1.4.1.2011.5.25.195.3.1.2"]
]

// --- hwPoePowerOnFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.195.40.14
// Fields: hwPoePortName
// Description: This object indicates that a PD fails to be powered on.
trapMap["1.3.6.1.4.1.2011.5.25.195.40.14"] = [
    name: "hwPoePowerOnFail",
    fields: ["hwPoePortName"],
    fieldOids: ["hwPoePortName": "1.3.6.1.4.1.2011.5.25.195.3.1.2"]
]

// --- hwPoePowerOffCurrentLimits (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.195.40.15
// Fields: hwPoePortName
// Description: This object indicates that a PD is powered off because its current meets or exceeds the limit of current.
trapMap["1.3.6.1.4.1.2011.5.25.195.40.15"] = [
    name: "hwPoePowerOffCurrentLimits",
    fields: ["hwPoePortName"],
    fieldOids: ["hwPoePortName": "1.3.6.1.4.1.2011.5.25.195.3.1.2"]
]

// --- hwPoePdPriorityDifferent (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.195.40.16
// Fields: hwPoePortName, hwPoePortPriority, hwPoePdPriority
// Description: This object indicates that the priority of PD is different from the port.
trapMap["1.3.6.1.4.1.2011.5.25.195.40.16"] = [
    name: "hwPoePdPriorityDifferent",
    fields: ["hwPoePortName", "hwPoePortPriority", "hwPoePdPriority"],
    fieldOids: ["hwPoePortName": "1.3.6.1.4.1.2011.5.25.195.3.1.2", "hwPoePortPriority": "1.3.6.1.4.1.2011.5.25.195.3.1.4", "hwPoePdPriority": "1.3.6.1.4.1.2011.5.25.195.39.1"]
]

// --- hwPoePowerOverUtilizationThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.195.40.17
// Fields: hwPoeDeviceID, hwPoeCurConsumPower, hwPoeConsumPowerThreshold
// Description: This object indicates that the PSE is overdrawing power.
trapMap["1.3.6.1.4.1.2011.5.25.195.40.17"] = [
    name: "hwPoePowerOverUtilizationThreshold",
    fields: ["hwPoeDeviceID", "hwPoeCurConsumPower", "hwPoeConsumPowerThreshold"],
    fieldOids: ["hwPoeDeviceID": "1.3.6.1.4.1.2011.5.25.195.39.5", "hwPoeCurConsumPower": "1.3.6.1.4.1.2011.5.25.195.39.3", "hwPoeConsumPowerThreshold": "1.3.6.1.4.1.2011.5.25.195.39.4"]
]

// --- hwPoePowerOverUtilizationThresholdResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.195.40.18
// Fields: hwPoeDeviceID, hwPoeCurConsumPower, hwPoeConsumPowerThreshold
// Description: This object indicates that the PSE is not overdrawing power.
trapMap["1.3.6.1.4.1.2011.5.25.195.40.18"] = [
    name: "hwPoePowerOverUtilizationThresholdResume",
    fields: ["hwPoeDeviceID", "hwPoeCurConsumPower", "hwPoeConsumPowerThreshold"],
    fieldOids: ["hwPoeDeviceID": "1.3.6.1.4.1.2011.5.25.195.39.5", "hwPoeCurConsumPower": "1.3.6.1.4.1.2011.5.25.195.39.3", "hwPoeConsumPowerThreshold": "1.3.6.1.4.1.2011.5.25.195.39.4"]
]

// --- hwPoeBoardInsertedWrongFrame (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.195.40.19
// Fields: hwFrameID, hwPoeSlotNum
// Description: This object indicates that the poe board is inserted in the frame does not support poe.
trapMap["1.3.6.1.4.1.2011.5.25.195.40.19"] = [
    name: "hwPoeBoardInsertedWrongFrame",
    fields: ["hwFrameID", "hwPoeSlotNum"],
    fieldOids: ["hwFrameID": "1.3.6.1.4.1.2011.5.25.195.39.6", "hwPoeSlotNum": "1.3.6.1.4.1.2011.5.25.195.39.2"]
]

// --- hwPoePowerAbsent (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.195.40.20
// Fields: hwFrameID, hwPoeSlotNum
// Description: This object indicates that the poe power is absent.
trapMap["1.3.6.1.4.1.2011.5.25.195.40.20"] = [
    name: "hwPoePowerAbsent",
    fields: ["hwFrameID", "hwPoeSlotNum"],
    fieldOids: ["hwFrameID": "1.3.6.1.4.1.2011.5.25.195.39.6", "hwPoeSlotNum": "1.3.6.1.4.1.2011.5.25.195.39.2"]
]

// --- hwPoePowerAbsentResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.195.40.21
// Fields: hwFrameID, hwPoeSlotNum
// Description: This object indicates that the poe power is present.
trapMap["1.3.6.1.4.1.2011.5.25.195.40.21"] = [
    name: "hwPoePowerAbsentResume",
    fields: ["hwFrameID", "hwPoeSlotNum"],
    fieldOids: ["hwFrameID": "1.3.6.1.4.1.2011.5.25.195.39.6", "hwPoeSlotNum": "1.3.6.1.4.1.2011.5.25.195.39.2"]
]

// --- hwPoeRpsPowerOutputAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.195.40.22
// Fields: hwPoeSlotNum
// Description: This object indicates that the RPS power can not provide POE power for this device.
trapMap["1.3.6.1.4.1.2011.5.25.195.40.22"] = [
    name: "hwPoeRpsPowerOutputAlarm",
    fields: ["hwPoeSlotNum"],
    fieldOids: ["hwPoeSlotNum": "1.3.6.1.4.1.2011.5.25.195.39.2"]
]

// --- hwPoeRpsPowerOutputAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.195.40.23
// Fields: hwPoeSlotNum
// Description: This object indicates that the RPS power can provide POE power for this device.
trapMap["1.3.6.1.4.1.2011.5.25.195.40.23"] = [
    name: "hwPoeRpsPowerOutputAlarmResume",
    fields: ["hwPoeSlotNum"],
    fieldOids: ["hwPoeSlotNum": "1.3.6.1.4.1.2011.5.25.195.39.2"]
]

// --- hwPoeControlChipFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.195.40.24
// Fields: hwPoeChipID, hwPoeSlotNum
// Description: This object indicates that the poe control chip is failed.
trapMap["1.3.6.1.4.1.2011.5.25.195.40.24"] = [
    name: "hwPoeControlChipFail",
    fields: ["hwPoeChipID", "hwPoeSlotNum"],
    fieldOids: ["hwPoeChipID": "1.3.6.1.4.1.2011.5.25.195.39.7", "hwPoeSlotNum": "1.3.6.1.4.1.2011.5.25.195.39.2"]
]

// --- hwPoeControlChipFailResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.195.40.25
// Fields: hwPoeChipID, hwPoeSlotNum
// Description: This object indicates that the poe control chip has resumed.
trapMap["1.3.6.1.4.1.2011.5.25.195.40.25"] = [
    name: "hwPoeControlChipFailResume",
    fields: ["hwPoeChipID", "hwPoeSlotNum"],
    fieldOids: ["hwPoeChipID": "1.3.6.1.4.1.2011.5.25.195.39.7", "hwPoeSlotNum": "1.3.6.1.4.1.2011.5.25.195.39.2"]
]

// --- hwPoePSEPowerCut (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.195.40.26
// Description: This object indicates that the poe pse power is not enough.
trapMap["1.3.6.1.4.1.2011.5.25.195.40.26"] = [
    name: "hwPoePSEPowerCut",
    fields: [],
    fieldOids: []
]

// --- hwPoePSEPowerCutResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.195.40.27
// Description: This object indicates that the poe pse power cut has resumed.
trapMap["1.3.6.1.4.1.2011.5.25.195.40.27"] = [
    name: "hwPoePSEPowerCutResume",
    fields: [],
    fieldOids: []
]

// --- hwPoeSlotPowerCut (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.195.40.28
// Fields: hwPoeSlotNum
// Description: This object indicates that the poe slot power is not enough.
trapMap["1.3.6.1.4.1.2011.5.25.195.40.28"] = [
    name: "hwPoeSlotPowerCut",
    fields: ["hwPoeSlotNum"],
    fieldOids: ["hwPoeSlotNum": "1.3.6.1.4.1.2011.5.25.195.39.2"]
]

// --- hwPoeSlotPowerCutResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.195.40.29
// Fields: hwPoeSlotNum
// Description: This object indicates that the poe slot power cut has resumed.
trapMap["1.3.6.1.4.1.2011.5.25.195.40.29"] = [
    name: "hwPoeSlotPowerCutResume",
    fields: ["hwPoeSlotNum"],
    fieldOids: ["hwPoeSlotNum": "1.3.6.1.4.1.2011.5.25.195.39.2"]
]

// --- hwPoeNotAvailable (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.195.40.30
// Fields: hwFrameID, hwPoeSlotNum, hwTrapProbableCause
// Description: PoE function is not available.
trapMap["1.3.6.1.4.1.2011.5.25.195.40.30"] = [
    name: "hwPoeNotAvailable",
    fields: ["hwFrameID", "hwPoeSlotNum", "hwTrapProbableCause"],
    fieldOids: ["hwFrameID": "1.3.6.1.4.1.2011.5.25.195.39.6", "hwPoeSlotNum": "1.3.6.1.4.1.2011.5.25.195.39.2", "hwTrapProbableCause": "1.3.6.1.4.1.2011.5.25.195.39.8"]
]

// --- hwPoeNotAvailableResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.195.40.31
// Fields: hwFrameID, hwPoeSlotNum
// Description: PoE function is available.
trapMap["1.3.6.1.4.1.2011.5.25.195.40.31"] = [
    name: "hwPoeNotAvailableResume",
    fields: ["hwFrameID", "hwPoeSlotNum"],
    fieldOids: ["hwFrameID": "1.3.6.1.4.1.2011.5.25.195.39.6", "hwPoeSlotNum": "1.3.6.1.4.1.2011.5.25.195.39.2"]
]

// --- hwPoeCardAbsent (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.195.40.32
// Fields: hwPoeSlotNum, hwPoeCardID
// Description: This object indicates that the poe card is absent.
trapMap["1.3.6.1.4.1.2011.5.25.195.40.32"] = [
    name: "hwPoeCardAbsent",
    fields: ["hwPoeSlotNum", "hwPoeCardID"],
    fieldOids: ["hwPoeSlotNum": "1.3.6.1.4.1.2011.5.25.195.39.2", "hwPoeCardID": "1.3.6.1.4.1.2011.5.25.195.39.9"]
]

// --- hwPoePortFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.195.40.33
// Fields: hwPoePortName
// Description: This object indicates that the poe port is abnormal.
trapMap["1.3.6.1.4.1.2011.5.25.195.40.33"] = [
    name: "hwPoePortFail",
    fields: ["hwPoePortName"],
    fieldOids: ["hwPoePortName": "1.3.6.1.4.1.2011.5.25.195.3.1.2"]
]

// --- hwPoePortFailResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.195.40.34
// Fields: hwPoePortName
// Description: This object indicates that the poe port has recoverd.
trapMap["1.3.6.1.4.1.2011.5.25.195.40.34"] = [
    name: "hwPoePortFailResume",
    fields: ["hwPoePortName"],
    fieldOids: ["hwPoePortName": "1.3.6.1.4.1.2011.5.25.195.3.1.2"]
]

// --- hwPdPowerCut (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.195.40.35
// Fields: hwPoePortName, hwPoeTrapFaultID
// Description: PoE power is not enough.
trapMap["1.3.6.1.4.1.2011.5.25.195.40.35"] = [
    name: "hwPdPowerCut",
    fields: ["hwPoePortName", "hwPoeTrapFaultID"],
    fieldOids: ["hwPoePortName": "1.3.6.1.4.1.2011.5.25.195.3.1.2", "hwPoeTrapFaultID": "1.3.6.1.4.1.2011.5.25.195.39.11"]
]

// --- hwPdPowerCutResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.195.40.36
// Fields: hwPoePortName, hwPoeTrapFaultID
// Description: PoE power is enough.
trapMap["1.3.6.1.4.1.2011.5.25.195.40.36"] = [
    name: "hwPdPowerCutResume",
    fields: ["hwPoePortName", "hwPoeTrapFaultID"],
    fieldOids: ["hwPoePortName": "1.3.6.1.4.1.2011.5.25.195.3.1.2", "hwPoeTrapFaultID": "1.3.6.1.4.1.2011.5.25.195.39.11"]
]

// --- hwPoeChipFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.195.40.37
// Fields: hwPoeChipID, hwPoeSlotStr
// Description: This object indicates that the poe chip is failed.
trapMap["1.3.6.1.4.1.2011.5.25.195.40.37"] = [
    name: "hwPoeChipFail",
    fields: ["hwPoeChipID", "hwPoeSlotStr"],
    fieldOids: ["hwPoeChipID": "1.3.6.1.4.1.2011.5.25.195.39.7", "hwPoeSlotStr": "1.3.6.1.4.1.2011.5.25.195.39.10"]
]

// --- hwPoeChipFailResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.195.40.38
// Fields: hwPoeChipID, hwPoeSlotStr
// Description: This object indicates that the poe chip has resumed.
trapMap["1.3.6.1.4.1.2011.5.25.195.40.38"] = [
    name: "hwPoeChipFailResume",
    fields: ["hwPoeChipID", "hwPoeSlotStr"],
    fieldOids: ["hwPoeChipID": "1.3.6.1.4.1.2011.5.25.195.39.7", "hwPoeSlotStr": "1.3.6.1.4.1.2011.5.25.195.39.10"]
]

// --- hwPdVltLow (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.195.40.39
// Fields: hwPoePortName
// Description: PD voltage is lower.
trapMap["1.3.6.1.4.1.2011.5.25.195.40.39"] = [
    name: "hwPdVltLow",
    fields: ["hwPoePortName"],
    fieldOids: ["hwPoePortName": "1.3.6.1.4.1.2011.5.25.195.3.1.2"]
]

// --- hwPdVltLowResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.195.40.40
// Fields: hwPoePortName
// Description: PD voltage becomes normal from lower.
trapMap["1.3.6.1.4.1.2011.5.25.195.40.40"] = [
    name: "hwPdVltLowResume",
    fields: ["hwPoePortName"],
    fieldOids: ["hwPoePortName": "1.3.6.1.4.1.2011.5.25.195.3.1.2"]
]

// --- hwPdVltHigh (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.195.40.41
// Fields: hwPoePortName
// Description: PD voltage is high.
trapMap["1.3.6.1.4.1.2011.5.25.195.40.41"] = [
    name: "hwPdVltHigh",
    fields: ["hwPoePortName"],
    fieldOids: ["hwPoePortName": "1.3.6.1.4.1.2011.5.25.195.3.1.2"]
]

// --- hwPdVltHighResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.195.40.42
// Fields: hwPoePortName
// Description: PD voltage becomes normal from high.
trapMap["1.3.6.1.4.1.2011.5.25.195.40.42"] = [
    name: "hwPdVltHighResume",
    fields: ["hwPoePortName"],
    fieldOids: ["hwPoePortName": "1.3.6.1.4.1.2011.5.25.195.3.1.2"]
]

// --- hwPseVltLow (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.195.40.43
// Fields: hwPoeChipID, hwPoeSlotStr
// Description: PSE voltage is lower.
trapMap["1.3.6.1.4.1.2011.5.25.195.40.43"] = [
    name: "hwPseVltLow",
    fields: ["hwPoeChipID", "hwPoeSlotStr"],
    fieldOids: ["hwPoeChipID": "1.3.6.1.4.1.2011.5.25.195.39.7", "hwPoeSlotStr": "1.3.6.1.4.1.2011.5.25.195.39.10"]
]

// --- hwPseVltLowResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.195.40.44
// Fields: hwPoeChipID, hwPoeSlotStr
// Description: PSE voltage becomes normal from lower.
trapMap["1.3.6.1.4.1.2011.5.25.195.40.44"] = [
    name: "hwPseVltLowResume",
    fields: ["hwPoeChipID", "hwPoeSlotStr"],
    fieldOids: ["hwPoeChipID": "1.3.6.1.4.1.2011.5.25.195.39.7", "hwPoeSlotStr": "1.3.6.1.4.1.2011.5.25.195.39.10"]
]

// ===== Parsing logic =====

// Set to true to enable diagnostic logging for this MIB parser
DEBUG = false

LOG_PREFIX = "[HUAWEI-POE-MIB]"
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
