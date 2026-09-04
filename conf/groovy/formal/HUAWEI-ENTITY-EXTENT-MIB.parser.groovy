/**
 * Auto-generated from HUAWEI-ENTITY-EXTENT-MIB.mib
 * Generated: 2026-08-25T16:47:01.103616800
 * Traps/Notifications (79): hwEntityExtTemperatureThresholdNotification, hwEntityExtVoltageLowThresholdNotification, hwEntityExtVoltageHighThresholdNotification, hwEntityExtCpuUsageThresholdNotfication, hwEntityExtMemUsageThresholdNotification, hwEntityExtOperEnabled, hwEntityExtOperDisabled, hwEntityExtMonitorBoardAbnormalNotification, hwEntityExtMonitorBoardNormalNotification, hwEntityExtMonitorPortAbnormalNotification, hwEntityExtMonitorPortNormalNotification, hwEntityExtCpuUsageLowThresholdNotfication, hwEntityExtCpuUsageThresholdNotficationClear, hwEntityExtMemUsageThresholdNotificationClear, hwEntityExtProcessErrorNotification, hwEntityExtDiskDamaged, hwEntityExtDiskFull, hwEntityExtHda1UsageThresholdNotfication, hwEntityExtHda1UsageResumeThresholdNotfication, hwEntityExtEncryptionCardFail, hwEntityExtHardDiskFull, hwEntityExtHardDiskFullResume, hwEntityExtHardDiskPlugIn, hwEntityExtHardDiskPlugOut, hwEntityExtHardDiskOnline, hwEntityExtHardDiskOffline, hwEntityExtLPUPlugIn, hwEntityExtLPUPlugOut, hwEntityExtCpuUsageSuddenChangeNotification, hwEntityExtMemoryUsageSuddenChangeNotification, hwEntityExtCPUOverInterfaceDown, hwEntityExtDevConfigurationRecovered, hwEntityExtHotPatchReservedFirst, hwEntityExtHotPatchReservedSecond, hwEntityExtHotPatchReservedThird, hwEntityExtHotPatchReservedFourth, hwEntityExtHotPatchReservedFifth, hwEntityExtSDCardFsErrorAlarm, hwEntityExtSDCardFsErrorResume, hwEntityExtSDCardUsageOver, hwEntityExtSDCardUsageBelow, hwEntityExtCFCardFaultAlarm, hwEntityExtCFCardFaultResume, hwEntityNVRAMFaultAlarmNotification, hwEntityNVRAMFaultResumeNotification, hwEntityExtBootPasswordAlarm, hwEntityExtSmallBootPasswordAlarm, hwEntityExtCpuUsageNotfication, hwEntityExtCpuUsageNotficationClear, hwEntityExtHardDiskOnlineFail, hwEntityExtHardDiskOfflineFail, hwBoardSoftwareVersionIncompatible, hwBoardSplitPorts, hwEntityInputRateThresholdAlarm, hwEntityInputRateThresholdAlarmResume, hwEntityOutputRateThresholdAlarm, hwEntityOutputRateThresholdAlarmResume, hwEntityStatusChange, hwEntityHigErrorPacketThresholdAlarm, hwEntityHigStateChangeNotify, hwEntityHigStateDownNotify, hwEntityPositionMismatchNotify, hwEntityRuntPacketCheckNotify, hwEntityHigCrcErrorAlarm, hwEntityHigCrcErrorAlarmResume, hwEntityHigDown, hwEntityHigDownResume, hwBoardDropRuntPacketNotify, hwEntityHigDiscardPacketNotify, hwEntitySerdesChangeNotify, hwEntitySerdesDownNotify, hwHardwareCapaChangeNotification, hwAlarmPnPChangeNotification, hwEntityHeartbeatTrap, hwHda1Error, hwInsertDiffFromPreDisposed, hwPreDisposedChangeNotification, hwEntityExtUnconnected, hwEntityExtUnconnectedResume
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

// --- hwEntityExtTemperatureThresholdNotification (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.31.2.0.1
// Fields: hwEntityTemperature, hwEntityTemperatureThreshold, hwEntityAdminStatus, hwEntityAlarmLight
// Description: The hwEntityEnvTemperatureThresholdNotification indicates the temperature have been exceed the threshold. In the condition, user should check the hardware and the environment of the entity, sometimes ...
trapMap["1.3.6.1.4.1.2011.5.25.31.2.0.1"] = [
    name: "hwEntityExtTemperatureThresholdNotification",
    fields: ["hwEntityTemperature", "hwEntityTemperatureThreshold", "hwEntityAdminStatus", "hwEntityAlarmLight"],
    fieldOids: ["hwEntityTemperature": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.11", "hwEntityTemperatureThreshold": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.12", "hwEntityAdminStatus": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.1", "hwEntityAlarmLight": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.4"]
]

// --- hwEntityExtVoltageLowThresholdNotification (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.31.2.0.2
// Fields: hwEntityVoltage, hwEntityVoltageLowThreshold, hwEntityAdminStatus, hwEntityAlarmLight
// Description: The hwEntityExtVoltageLowThresholdNotification indicates the voltage is lower than the threshold. This may decrease the usability of the entity. If the voltage is lower too much than the hardware need...
trapMap["1.3.6.1.4.1.2011.5.25.31.2.0.2"] = [
    name: "hwEntityExtVoltageLowThresholdNotification",
    fields: ["hwEntityVoltage", "hwEntityVoltageLowThreshold", "hwEntityAdminStatus", "hwEntityAlarmLight"],
    fieldOids: ["hwEntityVoltage": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.13", "hwEntityVoltageLowThreshold": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.14", "hwEntityAdminStatus": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.1", "hwEntityAlarmLight": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.4"]
]

// --- hwEntityExtVoltageHighThresholdNotification (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.31.2.0.3
// Fields: hwEntityVoltage, hwEntityVoltageHighThreshold, hwEntityAdminStatus, hwEntityAlarmLight
// Description: The hwEntityExtVoltageHighThresholdNotification indicates the voltage is higher than the threshold. This may decrease the usability of the entity. If the voltage is higher too much than the hardware n...
trapMap["1.3.6.1.4.1.2011.5.25.31.2.0.3"] = [
    name: "hwEntityExtVoltageHighThresholdNotification",
    fields: ["hwEntityVoltage", "hwEntityVoltageHighThreshold", "hwEntityAdminStatus", "hwEntityAlarmLight"],
    fieldOids: ["hwEntityVoltage": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.13", "hwEntityVoltageHighThreshold": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.15", "hwEntityAdminStatus": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.1", "hwEntityAlarmLight": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.4"]
]

// --- hwEntityExtCpuUsageThresholdNotfication (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.31.2.0.4
// Fields: hwEntityCpuUsage, hwEntityCpuUsageThreshold, hwEntityTemperature, hwEntityTemperatureThreshold, hwEntityAdminStatus, hwEntityAlarmLight
// Description: The hwEntityExtCpuUsageThresholdNotfication indicates the entity is overload, and the service running in the entity will not get the performance it should because of CPU's performance. Anyway, the thr...
trapMap["1.3.6.1.4.1.2011.5.25.31.2.0.4"] = [
    name: "hwEntityExtCpuUsageThresholdNotfication",
    fields: ["hwEntityCpuUsage", "hwEntityCpuUsageThreshold", "hwEntityTemperature", "hwEntityTemperatureThreshold", "hwEntityAdminStatus", "hwEntityAlarmLight"],
    fieldOids: ["hwEntityCpuUsage": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.5", "hwEntityCpuUsageThreshold": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.6", "hwEntityTemperature": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.11", "hwEntityTemperatureThreshold": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.12", "hwEntityAdminStatus": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.1", "hwEntityAlarmLight": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.4"]
]

// --- hwEntityExtMemUsageThresholdNotification (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.31.2.0.5
// Fields: hwEntityMemUsage, hwEntityMemUsageThreshold, hwEntityMemSize, hwEntityAdminStatus, hwEntityAlarmLight
// Description: The hwEntityExtMemUsageThresholdNotification indicates the entity is overload, and the service running in the entity will not get the performance it should because of lower memory. Anyway, the thresho...
trapMap["1.3.6.1.4.1.2011.5.25.31.2.0.5"] = [
    name: "hwEntityExtMemUsageThresholdNotification",
    fields: ["hwEntityMemUsage", "hwEntityMemUsageThreshold", "hwEntityMemSize", "hwEntityAdminStatus", "hwEntityAlarmLight"],
    fieldOids: ["hwEntityMemUsage": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.7", "hwEntityMemUsageThreshold": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.8", "hwEntityMemSize": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.9", "hwEntityAdminStatus": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.1", "hwEntityAlarmLight": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.4"]
]

// --- hwEntityExtOperEnabled (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.31.2.0.6
// Fields: hwEntityAdminStatus, hwEntityAlarmLight
// Description: The entity is operational. The entity this notification refers can be identified by extracting the entPhysicalIndex from one of the variable bindings.
trapMap["1.3.6.1.4.1.2011.5.25.31.2.0.6"] = [
    name: "hwEntityExtOperEnabled",
    fields: ["hwEntityAdminStatus", "hwEntityAlarmLight"],
    fieldOids: ["hwEntityAdminStatus": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.1", "hwEntityAlarmLight": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.4"]
]

// --- hwEntityExtOperDisabled (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.31.2.0.7
// Fields: hwEntityAdminStatus, hwEntityAlarmLight
// Description: The entity is operational. The entity this notification refers can be identified by extracting the entPhysicalIndex from one of the variable bindings.
trapMap["1.3.6.1.4.1.2011.5.25.31.2.0.7"] = [
    name: "hwEntityExtOperDisabled",
    fields: ["hwEntityAdminStatus", "hwEntityAlarmLight"],
    fieldOids: ["hwEntityAdminStatus": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.1", "hwEntityAlarmLight": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.4"]
]

// --- hwEntityExtMonitorBoardAbnormalNotification (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.31.2.0.8
// Description: The monitor board turns normal to abnormal.
trapMap["1.3.6.1.4.1.2011.5.25.31.2.0.8"] = [
    name: "hwEntityExtMonitorBoardAbnormalNotification",
    fields: [],
    fieldOids: []
]

// --- hwEntityExtMonitorBoardNormalNotification (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.31.2.0.9
// Description: The monitor board turns abnormal to normal.
trapMap["1.3.6.1.4.1.2011.5.25.31.2.0.9"] = [
    name: "hwEntityExtMonitorBoardNormalNotification",
    fields: [],
    fieldOids: []
]

// --- hwEntityExtMonitorPortAbnormalNotification (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.31.2.0.10
// Fields: hwMonitorInputState, hwMonitorInputName
// Description: The monitor port turns normal to abnormal.
trapMap["1.3.6.1.4.1.2011.5.25.31.2.0.10"] = [
    name: "hwEntityExtMonitorPortAbnormalNotification",
    fields: ["hwMonitorInputState", "hwMonitorInputName"],
    fieldOids: ["hwMonitorInputState": "1.3.6.1.4.1.2011.5.25.31.1.1.4.1.3", "hwMonitorInputName": "1.3.6.1.4.1.2011.5.25.31.1.1.4.1.2"]
]

// --- hwEntityExtMonitorPortNormalNotification (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.31.2.0.11
// Fields: hwMonitorInputState, hwMonitorInputName
// Description: The monitor port turns abnormal to normal.
trapMap["1.3.6.1.4.1.2011.5.25.31.2.0.11"] = [
    name: "hwEntityExtMonitorPortNormalNotification",
    fields: ["hwMonitorInputState", "hwMonitorInputName"],
    fieldOids: ["hwMonitorInputState": "1.3.6.1.4.1.2011.5.25.31.1.1.4.1.3", "hwMonitorInputName": "1.3.6.1.4.1.2011.5.25.31.1.1.4.1.2"]
]

// --- hwEntityExtCpuUsageLowThresholdNotfication (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.31.2.0.12
// Fields: hwEntityCpuUsage, hwEntityCpuUsageThreshold, hwEntityTemperature, hwEntityTemperatureThreshold, hwEntityAdminStatus, hwEntityAlarmLight
// Description: The hwEntityExtCpuUsageThresholdNotfication indicates the entity is overload, and the service running in the entity will not get the performance it should because of CPU's performance. Anyway, the thr...
trapMap["1.3.6.1.4.1.2011.5.25.31.2.0.12"] = [
    name: "hwEntityExtCpuUsageLowThresholdNotfication",
    fields: ["hwEntityCpuUsage", "hwEntityCpuUsageThreshold", "hwEntityTemperature", "hwEntityTemperatureThreshold", "hwEntityAdminStatus", "hwEntityAlarmLight"],
    fieldOids: ["hwEntityCpuUsage": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.5", "hwEntityCpuUsageThreshold": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.6", "hwEntityTemperature": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.11", "hwEntityTemperatureThreshold": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.12", "hwEntityAdminStatus": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.1", "hwEntityAlarmLight": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.4"]
]

// --- hwEntityExtCpuUsageThresholdNotficationClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.31.2.0.13
// Fields: hwEntityCpuUsage, hwEntityCpuUsageThreshold, hwEntityTemperature, hwEntityTemperatureThreshold, hwEntityAdminStatus, hwEntityAlarmLight
// Description: The hwEntityExtCpuUsageThresholdNotficationClear indicates the entity CPU usage fell below the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.31.2.0.13"] = [
    name: "hwEntityExtCpuUsageThresholdNotficationClear",
    fields: ["hwEntityCpuUsage", "hwEntityCpuUsageThreshold", "hwEntityTemperature", "hwEntityTemperatureThreshold", "hwEntityAdminStatus", "hwEntityAlarmLight"],
    fieldOids: ["hwEntityCpuUsage": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.5", "hwEntityCpuUsageThreshold": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.6", "hwEntityTemperature": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.11", "hwEntityTemperatureThreshold": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.12", "hwEntityAdminStatus": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.1", "hwEntityAlarmLight": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.4"]
]

// --- hwEntityExtMemUsageThresholdNotificationClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.31.2.0.14
// Fields: hwEntityMemUsage, hwEntityMemUsageThreshold, hwEntityMemSize, hwEntityAdminStatus, hwEntityAlarmLight
// Description: The hwEntityExtMemUsageThresholdNotificationClear indicates the memory usage fell below the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.31.2.0.14"] = [
    name: "hwEntityExtMemUsageThresholdNotificationClear",
    fields: ["hwEntityMemUsage", "hwEntityMemUsageThreshold", "hwEntityMemSize", "hwEntityAdminStatus", "hwEntityAlarmLight"],
    fieldOids: ["hwEntityMemUsage": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.7", "hwEntityMemUsageThreshold": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.8", "hwEntityMemSize": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.9", "hwEntityAdminStatus": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.1", "hwEntityAlarmLight": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.4"]
]

// --- hwEntityExtProcessErrorNotification (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.31.2.0.15
// Fields: hwProcessName
// Description: The hwEntityExtProcessErrorNotification indicates some important process had exception.
trapMap["1.3.6.1.4.1.2011.5.25.31.2.0.15"] = [
    name: "hwEntityExtProcessErrorNotification",
    fields: ["hwProcessName"],
    fieldOids: ["hwProcessName": "1.3.6.1.4.1.2011.5.25.31.1.1.21.1"]
]

// --- hwEntityExtDiskDamaged (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.31.2.0.16
// Fields: hwDiskType
// Description: The hwEntityExtDiskDamaged indicates disk was damaged.
trapMap["1.3.6.1.4.1.2011.5.25.31.2.0.16"] = [
    name: "hwEntityExtDiskDamaged",
    fields: ["hwDiskType"],
    fieldOids: ["hwDiskType": "1.3.6.1.4.1.2011.5.25.31.1.1.22.1"]
]

// --- hwEntityExtDiskFull (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.31.2.0.17
// Fields: hwDiskType
// Description: The hwEntityExtDiskFull indicates disk was full.
trapMap["1.3.6.1.4.1.2011.5.25.31.2.0.17"] = [
    name: "hwEntityExtDiskFull",
    fields: ["hwDiskType"],
    fieldOids: ["hwDiskType": "1.3.6.1.4.1.2011.5.25.31.1.1.22.1"]
]

// --- hwEntityExtHda1UsageThresholdNotfication (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.31.2.0.18
// Fields: hwEntityHda1Usage, hwEntityHda1UsageThreshold
// Description: The hwEntityExtHda1UsageThresholdNotfication indicates the hda1 usage is overload.
trapMap["1.3.6.1.4.1.2011.5.25.31.2.0.18"] = [
    name: "hwEntityExtHda1UsageThresholdNotfication",
    fields: ["hwEntityHda1Usage", "hwEntityHda1UsageThreshold"],
    fieldOids: ["hwEntityHda1Usage": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.51", "hwEntityHda1UsageThreshold": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.52"]
]

// --- hwEntityExtHda1UsageResumeThresholdNotfication (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.31.2.0.19
// Fields: hwEntityHda1Usage, hwEntityHda1UsageResumeThreshold
// Description: The hwEntityExtHda1UsageResumeThresholdNotfication indicates the hda1 usage fell below the resume threshold.
trapMap["1.3.6.1.4.1.2011.5.25.31.2.0.19"] = [
    name: "hwEntityExtHda1UsageResumeThresholdNotfication",
    fields: ["hwEntityHda1Usage", "hwEntityHda1UsageResumeThreshold"],
    fieldOids: ["hwEntityHda1Usage": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.51", "hwEntityHda1UsageResumeThreshold": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.53"]
]

// --- hwEntityExtEncryptionCardFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.31.2.0.20
// Description: The hwEntityExtEncryptionCardFail indicates the encryption card is faulty.
trapMap["1.3.6.1.4.1.2011.5.25.31.2.0.20"] = [
    name: "hwEntityExtEncryptionCardFail",
    fields: [],
    fieldOids: []
]

// --- hwEntityExtHardDiskFull (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.31.2.0.21
// Fields: hwDiskType, hwDiskSN, hwDiskUsage, hwDiskUsageThreshold
// Description: hwEntityExtHardDiskFull indicates that the hard disk's spare space is insufficient.
trapMap["1.3.6.1.4.1.2011.5.25.31.2.0.21"] = [
    name: "hwEntityExtHardDiskFull",
    fields: ["hwDiskType", "hwDiskSN", "hwDiskUsage", "hwDiskUsageThreshold"],
    fieldOids: ["hwDiskType": "1.3.6.1.4.1.2011.5.25.31.1.1.22.1", "hwDiskSN": "1.3.6.1.4.1.2011.5.25.31.1.1.22.2", "hwDiskUsage": "1.3.6.1.4.1.2011.5.25.31.1.1.22.3", "hwDiskUsageThreshold": "1.3.6.1.4.1.2011.5.25.31.1.1.22.4"]
]

// --- hwEntityExtHardDiskFullResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.31.2.0.22
// Fields: hwDiskType, hwDiskSN, hwDiskUsage, hwDiskUsageThreshold
// Description: hwEntityExtHardDiskFullResume indicates that the hard disk's usage fell below the alarm clearing threshold.
trapMap["1.3.6.1.4.1.2011.5.25.31.2.0.22"] = [
    name: "hwEntityExtHardDiskFullResume",
    fields: ["hwDiskType", "hwDiskSN", "hwDiskUsage", "hwDiskUsageThreshold"],
    fieldOids: ["hwDiskType": "1.3.6.1.4.1.2011.5.25.31.1.1.22.1", "hwDiskSN": "1.3.6.1.4.1.2011.5.25.31.1.1.22.2", "hwDiskUsage": "1.3.6.1.4.1.2011.5.25.31.1.1.22.3", "hwDiskUsageThreshold": "1.3.6.1.4.1.2011.5.25.31.1.1.22.4"]
]

// --- hwEntityExtHardDiskPlugIn (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.31.2.0.23
// Fields: hwDiskType, hwDiskSN, hwDiskSlot
// Description: hwEntityExtHardDiskPlugIn indicates that the hard disk was plugged in.
trapMap["1.3.6.1.4.1.2011.5.25.31.2.0.23"] = [
    name: "hwEntityExtHardDiskPlugIn",
    fields: ["hwDiskType", "hwDiskSN", "hwDiskSlot"],
    fieldOids: ["hwDiskType": "1.3.6.1.4.1.2011.5.25.31.1.1.22.1", "hwDiskSN": "1.3.6.1.4.1.2011.5.25.31.1.1.22.2", "hwDiskSlot": "1.3.6.1.4.1.2011.5.25.31.1.1.22.5"]
]

// --- hwEntityExtHardDiskPlugOut (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.31.2.0.24
// Fields: hwDiskType, hwDiskSN, hwDiskSlot
// Description: hwEntityExtHardDiskPlugOut indicates that the hard disk was pulled out.
trapMap["1.3.6.1.4.1.2011.5.25.31.2.0.24"] = [
    name: "hwEntityExtHardDiskPlugOut",
    fields: ["hwDiskType", "hwDiskSN", "hwDiskSlot"],
    fieldOids: ["hwDiskType": "1.3.6.1.4.1.2011.5.25.31.1.1.22.1", "hwDiskSN": "1.3.6.1.4.1.2011.5.25.31.1.1.22.2", "hwDiskSlot": "1.3.6.1.4.1.2011.5.25.31.1.1.22.5"]
]

// --- hwEntityExtHardDiskOnline (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.31.2.0.25
// Fields: hwDiskType, hwDiskSN, hwDiskSlot
// Description: hwEntityExtHardDiskOnline indicates that the hard disk went online successfully.
trapMap["1.3.6.1.4.1.2011.5.25.31.2.0.25"] = [
    name: "hwEntityExtHardDiskOnline",
    fields: ["hwDiskType", "hwDiskSN", "hwDiskSlot"],
    fieldOids: ["hwDiskType": "1.3.6.1.4.1.2011.5.25.31.1.1.22.1", "hwDiskSN": "1.3.6.1.4.1.2011.5.25.31.1.1.22.2", "hwDiskSlot": "1.3.6.1.4.1.2011.5.25.31.1.1.22.5"]
]

// --- hwEntityExtHardDiskOffline (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.31.2.0.26
// Fields: hwDiskType, hwDiskSN, hwDiskSlot
// Description: hwEntityExtHardDiskOffline indicates that the hard disk went offline.
trapMap["1.3.6.1.4.1.2011.5.25.31.2.0.26"] = [
    name: "hwEntityExtHardDiskOffline",
    fields: ["hwDiskType", "hwDiskSN", "hwDiskSlot"],
    fieldOids: ["hwDiskType": "1.3.6.1.4.1.2011.5.25.31.1.1.22.1", "hwDiskSN": "1.3.6.1.4.1.2011.5.25.31.1.1.22.2", "hwDiskSlot": "1.3.6.1.4.1.2011.5.25.31.1.1.22.5"]
]

// --- hwEntityExtLPUPlugIn (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.31.2.0.27
// Fields: hwLPUSlot
// Description: hwEntityExtLPUPlugIn indicates that the LPU was plugged in.
trapMap["1.3.6.1.4.1.2011.5.25.31.2.0.27"] = [
    name: "hwEntityExtLPUPlugIn",
    fields: ["hwLPUSlot"],
    fieldOids: ["hwLPUSlot": "1.3.6.1.4.1.2011.5.25.31.1.1.23.2"]
]

// --- hwEntityExtLPUPlugOut (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.31.2.0.28
// Fields: hwLPUSlot
// Description: hwEntityExtLPUPlugOut indicates that the LPU was pulled out.
trapMap["1.3.6.1.4.1.2011.5.25.31.2.0.28"] = [
    name: "hwEntityExtLPUPlugOut",
    fields: ["hwLPUSlot"],
    fieldOids: ["hwLPUSlot": "1.3.6.1.4.1.2011.5.25.31.1.1.23.2"]
]

// --- hwEntityExtCpuUsageSuddenChangeNotification (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.31.2.0.29
// Fields: hwEntitySlotID, hwEntityCpuID, hwEntityPreviousValue, hwEntityCurrentValue, hwEntityChangeValue, hwEntityChangeValueThreshold
// Description: The hwEntityExtCpuUsageSuddenChangeNotification indicates that the CPU usage suddenly changed.
trapMap["1.3.6.1.4.1.2011.5.25.31.2.0.29"] = [
    name: "hwEntityExtCpuUsageSuddenChangeNotification",
    fields: ["hwEntitySlotID", "hwEntityCpuID", "hwEntityPreviousValue", "hwEntityCurrentValue", "hwEntityChangeValue", "hwEntityChangeValueThreshold"],
    fieldOids: ["hwEntitySlotID": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.54", "hwEntityCpuID": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.55", "hwEntityPreviousValue": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.56", "hwEntityCurrentValue": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.57", "hwEntityChangeValue": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.58", "hwEntityChangeValueThreshold": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.59"]
]

// --- hwEntityExtMemoryUsageSuddenChangeNotification (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.31.2.0.30
// Fields: hwEntitySlotID, hwEntityCpuID, hwEntityPreviousValue, hwEntityCurrentValue, hwEntityChangeValue, hwEntityChangeValueThreshold
// Description: The hwEntityExtMemoryUsageSuddenChangeNotification indicates that the memory usage suddenly changed.
trapMap["1.3.6.1.4.1.2011.5.25.31.2.0.30"] = [
    name: "hwEntityExtMemoryUsageSuddenChangeNotification",
    fields: ["hwEntitySlotID", "hwEntityCpuID", "hwEntityPreviousValue", "hwEntityCurrentValue", "hwEntityChangeValue", "hwEntityChangeValueThreshold"],
    fieldOids: ["hwEntitySlotID": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.54", "hwEntityCpuID": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.55", "hwEntityPreviousValue": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.56", "hwEntityCurrentValue": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.57", "hwEntityChangeValue": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.58", "hwEntityChangeValueThreshold": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.59"]
]

// --- hwEntityExtCPUOverInterfaceDown (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.31.2.0.31
// Fields: hwEntitySlotID, hwEntityCpuID
// Description: The hwEntityExtCPUOverInterfaceDown indicates that the cpu usage reached the threshold for interface management ,and the interface was shutdown.
trapMap["1.3.6.1.4.1.2011.5.25.31.2.0.31"] = [
    name: "hwEntityExtCPUOverInterfaceDown",
    fields: ["hwEntitySlotID", "hwEntityCpuID"],
    fieldOids: ["hwEntitySlotID": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.54", "hwEntityCpuID": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.55"]
]

// --- hwEntityExtDevConfigurationRecovered (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.31.2.0.32
// Description: The hwEntityExtDevConfigurationRecovered indicates the device configuration was recovered.
trapMap["1.3.6.1.4.1.2011.5.25.31.2.0.32"] = [
    name: "hwEntityExtDevConfigurationRecovered",
    fields: [],
    fieldOids: []
]

// --- hwEntityExtHotPatchReservedFirst (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.31.2.0.33
// Fields: hwProcessName
// Description: The hwEntityExtHotPatchReservedFirst indicates the first reserved information of hot patch.
trapMap["1.3.6.1.4.1.2011.5.25.31.2.0.33"] = [
    name: "hwEntityExtHotPatchReservedFirst",
    fields: ["hwProcessName"],
    fieldOids: ["hwProcessName": "1.3.6.1.4.1.2011.5.25.31.1.1.21.1"]
]

// --- hwEntityExtHotPatchReservedSecond (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.31.2.0.34
// Fields: hwProcessName
// Description: The hwEntityExtHotPatchReservedSecond indicates the second reserved information of hot patch.
trapMap["1.3.6.1.4.1.2011.5.25.31.2.0.34"] = [
    name: "hwEntityExtHotPatchReservedSecond",
    fields: ["hwProcessName"],
    fieldOids: ["hwProcessName": "1.3.6.1.4.1.2011.5.25.31.1.1.21.1"]
]

// --- hwEntityExtHotPatchReservedThird (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.31.2.0.35
// Fields: hwProcessName
// Description: The hwEntityExtHotPatchReservedThird indicates the third reserved information of hot patch.
trapMap["1.3.6.1.4.1.2011.5.25.31.2.0.35"] = [
    name: "hwEntityExtHotPatchReservedThird",
    fields: ["hwProcessName"],
    fieldOids: ["hwProcessName": "1.3.6.1.4.1.2011.5.25.31.1.1.21.1"]
]

// --- hwEntityExtHotPatchReservedFourth (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.31.2.0.36
// Fields: hwProcessName
// Description: The hwEntityExtHotPatchReservedFourth indicates the fourth reserved information of hot patch.
trapMap["1.3.6.1.4.1.2011.5.25.31.2.0.36"] = [
    name: "hwEntityExtHotPatchReservedFourth",
    fields: ["hwProcessName"],
    fieldOids: ["hwProcessName": "1.3.6.1.4.1.2011.5.25.31.1.1.21.1"]
]

// --- hwEntityExtHotPatchReservedFifth (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.31.2.0.37
// Fields: hwProcessName
// Description: The hwEntityExtHotPatchReservedFifth indicates the fifth reserved information of hot patch.
trapMap["1.3.6.1.4.1.2011.5.25.31.2.0.37"] = [
    name: "hwEntityExtHotPatchReservedFifth",
    fields: ["hwProcessName"],
    fieldOids: ["hwProcessName": "1.3.6.1.4.1.2011.5.25.31.1.1.21.1"]
]

// --- hwEntityExtSDCardFsErrorAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.31.2.0.38
// Description: The hwEntityExtSDCardFsErrorAlarm indicates the SDCard was damaged.
trapMap["1.3.6.1.4.1.2011.5.25.31.2.0.38"] = [
    name: "hwEntityExtSDCardFsErrorAlarm",
    fields: [],
    fieldOids: []
]

// --- hwEntityExtSDCardFsErrorResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.31.2.0.39
// Description: The hwEntityExtSDCardFsErrorResume indicates the SDCard was restored.
trapMap["1.3.6.1.4.1.2011.5.25.31.2.0.39"] = [
    name: "hwEntityExtSDCardFsErrorResume",
    fields: [],
    fieldOids: []
]

// --- hwEntityExtSDCardUsageOver (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.31.2.0.40
// Fields: hwEntitySDCardUsage, hwEntitySDCardUsageThreshold
// Description: The hwEntityExtSDCardUsageOver indicates the SDCard usage is overload.
trapMap["1.3.6.1.4.1.2011.5.25.31.2.0.40"] = [
    name: "hwEntityExtSDCardUsageOver",
    fields: ["hwEntitySDCardUsage", "hwEntitySDCardUsageThreshold"],
    fieldOids: ["hwEntitySDCardUsage": "1.3.6.1.4.1.2011.5.25.31.1.1.24.1.7", "hwEntitySDCardUsageThreshold": "1.3.6.1.4.1.2011.5.25.31.1.1.24.1.8"]
]

// --- hwEntityExtSDCardUsageBelow (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.31.2.0.41
// Fields: hwEntitySDCardUsage, hwEntitySDCardUsageThreshold
// Description: The hwEntityExtSDCardUsageBelow indicates the SDCard usage fell below the resume threshold.
trapMap["1.3.6.1.4.1.2011.5.25.31.2.0.41"] = [
    name: "hwEntityExtSDCardUsageBelow",
    fields: ["hwEntitySDCardUsage", "hwEntitySDCardUsageThreshold"],
    fieldOids: ["hwEntitySDCardUsage": "1.3.6.1.4.1.2011.5.25.31.1.1.24.1.7", "hwEntitySDCardUsageThreshold": "1.3.6.1.4.1.2011.5.25.31.1.1.24.1.8"]
]

// --- hwEntityExtCFCardFaultAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.31.2.0.42
// Description: The hwEntityExtCFCardFaultAlarm indicates the CFCard was damaged.
trapMap["1.3.6.1.4.1.2011.5.25.31.2.0.42"] = [
    name: "hwEntityExtCFCardFaultAlarm",
    fields: [],
    fieldOids: []
]

// --- hwEntityExtCFCardFaultResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.31.2.0.43
// Description: The hwEntityExtCFCardFaultResume indicates the CFCard was restored.
trapMap["1.3.6.1.4.1.2011.5.25.31.2.0.43"] = [
    name: "hwEntityExtCFCardFaultResume",
    fields: [],
    fieldOids: []
]

// --- hwEntityNVRAMFaultAlarmNotification (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.31.2.0.44
// Fields: hwProcessName
// Description: The hwEntityNVRAMFaultAlarmNotification indicates the main NVRAM was damaged.
trapMap["1.3.6.1.4.1.2011.5.25.31.2.0.44"] = [
    name: "hwEntityNVRAMFaultAlarmNotification",
    fields: ["hwProcessName"],
    fieldOids: ["hwProcessName": "1.3.6.1.4.1.2011.5.25.31.1.1.21.1"]
]

// --- hwEntityNVRAMFaultResumeNotification (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.31.2.0.45
// Fields: hwProcessName
// Description: The hwEntityNVRAMFaultResumeNotification indicates that it was successful to switch main NVRAM to backup NVRAM .
trapMap["1.3.6.1.4.1.2011.5.25.31.2.0.45"] = [
    name: "hwEntityNVRAMFaultResumeNotification",
    fields: ["hwProcessName"],
    fieldOids: ["hwProcessName": "1.3.6.1.4.1.2011.5.25.31.1.1.21.1"]
]

// --- hwEntityExtBootPasswordAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.31.2.0.46
// Description: The hwEntityNVRAMFaultResume indicates that the BootLoader password is not set, which poses security risks. You are advised to change the password.
trapMap["1.3.6.1.4.1.2011.5.25.31.2.0.46"] = [
    name: "hwEntityExtBootPasswordAlarm",
    fields: [],
    fieldOids: []
]

// --- hwEntityExtSmallBootPasswordAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.31.2.0.47
// Description: The hwEntityExtSmallBootPasswordAlarm indicates that the small boot password was initial password and needed to change.
trapMap["1.3.6.1.4.1.2011.5.25.31.2.0.47"] = [
    name: "hwEntityExtSmallBootPasswordAlarm",
    fields: [],
    fieldOids: []
]

// --- hwEntityExtCpuUsageNotfication (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.31.2.0.48
// Fields: hwCpuUsageTrapType, hwCpuUsageTrapSlot, hwCpuUsageTrapCpu, hwCpuUsageCurrentUsage, hwCpuUsageThreashold
// Description: The hwEntityExtCpuUsageNotfication indicates the entity is overload, and the service running in the entity will not get the performance it should because of CPU's performance. Anyway, the threshold sh...
trapMap["1.3.6.1.4.1.2011.5.25.31.2.0.48"] = [
    name: "hwEntityExtCpuUsageNotfication",
    fields: ["hwCpuUsageTrapType", "hwCpuUsageTrapSlot", "hwCpuUsageTrapCpu", "hwCpuUsageCurrentUsage", "hwCpuUsageThreashold"],
    fieldOids: ["hwCpuUsageTrapType": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.70", "hwCpuUsageTrapSlot": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.71", "hwCpuUsageTrapCpu": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.72", "hwCpuUsageCurrentUsage": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.73", "hwCpuUsageThreashold": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.74"]
]

// --- hwEntityExtCpuUsageNotficationClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.31.2.0.49
// Fields: hwCpuUsageTrapType, hwCpuUsageTrapSlot, hwCpuUsageTrapCpu, hwCpuUsageCurrentUsage, hwCpuUsageThreashold
// Description: The hwEntityExtCpuUsageNotficationClear indicates the entity CPU usage fell below the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.31.2.0.49"] = [
    name: "hwEntityExtCpuUsageNotficationClear",
    fields: ["hwCpuUsageTrapType", "hwCpuUsageTrapSlot", "hwCpuUsageTrapCpu", "hwCpuUsageCurrentUsage", "hwCpuUsageThreashold"],
    fieldOids: ["hwCpuUsageTrapType": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.70", "hwCpuUsageTrapSlot": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.71", "hwCpuUsageTrapCpu": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.72", "hwCpuUsageCurrentUsage": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.73", "hwCpuUsageThreashold": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.74"]
]

// --- hwEntityExtHardDiskOnlineFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.31.2.0.50
// Fields: hwDiskType, hwDiskSN, hwDiskSlot
// Description: The object indicates that the hard disk went online fail.
trapMap["1.3.6.1.4.1.2011.5.25.31.2.0.50"] = [
    name: "hwEntityExtHardDiskOnlineFail",
    fields: ["hwDiskType", "hwDiskSN", "hwDiskSlot"],
    fieldOids: ["hwDiskType": "1.3.6.1.4.1.2011.5.25.31.1.1.22.1", "hwDiskSN": "1.3.6.1.4.1.2011.5.25.31.1.1.22.2", "hwDiskSlot": "1.3.6.1.4.1.2011.5.25.31.1.1.22.5"]
]

// --- hwEntityExtHardDiskOfflineFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.31.2.0.51
// Fields: hwDiskType, hwDiskSN, hwDiskSlot
// Description: The object indicates that the hard disk went offline fail.
trapMap["1.3.6.1.4.1.2011.5.25.31.2.0.51"] = [
    name: "hwEntityExtHardDiskOfflineFail",
    fields: ["hwDiskType", "hwDiskSN", "hwDiskSlot"],
    fieldOids: ["hwDiskType": "1.3.6.1.4.1.2011.5.25.31.1.1.22.1", "hwDiskSN": "1.3.6.1.4.1.2011.5.25.31.1.1.22.2", "hwDiskSlot": "1.3.6.1.4.1.2011.5.25.31.1.1.22.5"]
]

// --- hwBoardSoftwareVersionIncompatible (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.31.2.2.1
// Fields: entPhysicalName, hwEntityExtTrapBaseSoftwareVersion, hwEntityExtTrapBoardSoftwareVersion
// Description: Board software version incompatible with basic software version.
trapMap["1.3.6.1.4.1.2011.5.25.31.2.2.1"] = [
    name: "hwBoardSoftwareVersionIncompatible",
    fields: ["entPhysicalName", "hwEntityExtTrapBaseSoftwareVersion", "hwEntityExtTrapBoardSoftwareVersion"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityExtTrapBaseSoftwareVersion": "1.3.6.1.4.1.2011.5.25.31.2.1.1", "hwEntityExtTrapBoardSoftwareVersion": "1.3.6.1.4.1.2011.5.25.31.2.1.2"]
]

// --- hwBoardSplitPorts (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.31.2.2.2
// Fields: hwPhysicalName
// Description: When the split ports exist on the board, send a SNMP trap to network manager.
trapMap["1.3.6.1.4.1.2011.5.25.31.2.2.2"] = [
    name: "hwBoardSplitPorts",
    fields: ["hwPhysicalName"],
    fieldOids: ["hwPhysicalName": "1.3.6.1.4.1.2011.5.25.31.2.1.3"]
]

// --- hwEntityInputRateThresholdAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.31.2.2.3
// Fields: hwEntityExtTrapBoardSlotID, hwEntityExtTrapUnitID, hwEntityExtTrapHigPortID, hwEntityExtTrapPeerBoardSlotID, hwEntityExtTrapChannelCurUsage, hwEntityExtTrapChannelThreshold
// Description: When the input usage of channel is more than the threshold of alarm, send a SNMP trap to network manager.
trapMap["1.3.6.1.4.1.2011.5.25.31.2.2.3"] = [
    name: "hwEntityInputRateThresholdAlarm",
    fields: ["hwEntityExtTrapBoardSlotID", "hwEntityExtTrapUnitID", "hwEntityExtTrapHigPortID", "hwEntityExtTrapPeerBoardSlotID", "hwEntityExtTrapChannelCurUsage", "hwEntityExtTrapChannelThreshold"],
    fieldOids: ["hwEntityExtTrapBoardSlotID": "1.3.6.1.4.1.2011.5.25.31.2.1.4", "hwEntityExtTrapUnitID": "1.3.6.1.4.1.2011.5.25.31.2.1.5", "hwEntityExtTrapHigPortID": "1.3.6.1.4.1.2011.5.25.31.2.1.6", "hwEntityExtTrapPeerBoardSlotID": "1.3.6.1.4.1.2011.5.25.31.2.1.9", "hwEntityExtTrapChannelCurUsage": "1.3.6.1.4.1.2011.5.25.31.2.1.7", "hwEntityExtTrapChannelThreshold": "1.3.6.1.4.1.2011.5.25.31.2.1.8"]
]

// --- hwEntityInputRateThresholdAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.31.2.2.4
// Fields: hwEntityExtTrapBoardSlotID, hwEntityExtTrapUnitID, hwEntityExtTrapHigPortID, hwEntityExtTrapPeerBoardSlotID, hwEntityExtTrapChannelCurUsage, hwEntityExtTrapChannelThreshold
// Description: When the input usage of channel is less than the threshold of resume, send a SNMP trap to network manager.
trapMap["1.3.6.1.4.1.2011.5.25.31.2.2.4"] = [
    name: "hwEntityInputRateThresholdAlarmResume",
    fields: ["hwEntityExtTrapBoardSlotID", "hwEntityExtTrapUnitID", "hwEntityExtTrapHigPortID", "hwEntityExtTrapPeerBoardSlotID", "hwEntityExtTrapChannelCurUsage", "hwEntityExtTrapChannelThreshold"],
    fieldOids: ["hwEntityExtTrapBoardSlotID": "1.3.6.1.4.1.2011.5.25.31.2.1.4", "hwEntityExtTrapUnitID": "1.3.6.1.4.1.2011.5.25.31.2.1.5", "hwEntityExtTrapHigPortID": "1.3.6.1.4.1.2011.5.25.31.2.1.6", "hwEntityExtTrapPeerBoardSlotID": "1.3.6.1.4.1.2011.5.25.31.2.1.9", "hwEntityExtTrapChannelCurUsage": "1.3.6.1.4.1.2011.5.25.31.2.1.7", "hwEntityExtTrapChannelThreshold": "1.3.6.1.4.1.2011.5.25.31.2.1.8"]
]

// --- hwEntityOutputRateThresholdAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.31.2.2.5
// Fields: hwEntityExtTrapBoardSlotID, hwEntityExtTrapUnitID, hwEntityExtTrapHigPortID, hwEntityExtTrapPeerBoardSlotID, hwEntityExtTrapChannelCurUsage, hwEntityExtTrapChannelThreshold
// Description: When the output usage of channel is more than the threshold of alarm, send a SNMP trap to network manager.
trapMap["1.3.6.1.4.1.2011.5.25.31.2.2.5"] = [
    name: "hwEntityOutputRateThresholdAlarm",
    fields: ["hwEntityExtTrapBoardSlotID", "hwEntityExtTrapUnitID", "hwEntityExtTrapHigPortID", "hwEntityExtTrapPeerBoardSlotID", "hwEntityExtTrapChannelCurUsage", "hwEntityExtTrapChannelThreshold"],
    fieldOids: ["hwEntityExtTrapBoardSlotID": "1.3.6.1.4.1.2011.5.25.31.2.1.4", "hwEntityExtTrapUnitID": "1.3.6.1.4.1.2011.5.25.31.2.1.5", "hwEntityExtTrapHigPortID": "1.3.6.1.4.1.2011.5.25.31.2.1.6", "hwEntityExtTrapPeerBoardSlotID": "1.3.6.1.4.1.2011.5.25.31.2.1.9", "hwEntityExtTrapChannelCurUsage": "1.3.6.1.4.1.2011.5.25.31.2.1.7", "hwEntityExtTrapChannelThreshold": "1.3.6.1.4.1.2011.5.25.31.2.1.8"]
]

// --- hwEntityOutputRateThresholdAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.31.2.2.6
// Fields: hwEntityExtTrapBoardSlotID, hwEntityExtTrapUnitID, hwEntityExtTrapHigPortID, hwEntityExtTrapPeerBoardSlotID, hwEntityExtTrapChannelCurUsage, hwEntityExtTrapChannelThreshold
// Description: When the output usage of channel is less than the threshold of resume, send a SNMP trap to network manager.
trapMap["1.3.6.1.4.1.2011.5.25.31.2.2.6"] = [
    name: "hwEntityOutputRateThresholdAlarmResume",
    fields: ["hwEntityExtTrapBoardSlotID", "hwEntityExtTrapUnitID", "hwEntityExtTrapHigPortID", "hwEntityExtTrapPeerBoardSlotID", "hwEntityExtTrapChannelCurUsage", "hwEntityExtTrapChannelThreshold"],
    fieldOids: ["hwEntityExtTrapBoardSlotID": "1.3.6.1.4.1.2011.5.25.31.2.1.4", "hwEntityExtTrapUnitID": "1.3.6.1.4.1.2011.5.25.31.2.1.5", "hwEntityExtTrapHigPortID": "1.3.6.1.4.1.2011.5.25.31.2.1.6", "hwEntityExtTrapPeerBoardSlotID": "1.3.6.1.4.1.2011.5.25.31.2.1.9", "hwEntityExtTrapChannelCurUsage": "1.3.6.1.4.1.2011.5.25.31.2.1.7", "hwEntityExtTrapChannelThreshold": "1.3.6.1.4.1.2011.5.25.31.2.1.8"]
]

// --- hwEntityStatusChange (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.31.2.2.7
// Fields: entPhysicalIndex, entPhysicalName, entPhysicalClass, hwEntityOperStatus
// Description: The entity status was changed.
trapMap["1.3.6.1.4.1.2011.5.25.31.2.2.7"] = [
    name: "hwEntityStatusChange",
    fields: ["entPhysicalIndex", "entPhysicalName", "entPhysicalClass", "hwEntityOperStatus"],
    fieldOids: ["entPhysicalIndex": "1.3.6.1.2.1.47.1.1.1.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "entPhysicalClass": "1.3.6.1.2.1.47.1.1.1.1.5", "hwEntityOperStatus": "1.3.6.1.4.1.2011.5.25.31.1.1.1.1.2"]
]

// --- hwEntityHigErrorPacketThresholdAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.31.2.2.8
// Fields: hwEntityExtTrapBoardSlotID, hwEntityExtTrapUnitID, hwEntityExtTrapHigPortID, hwEntityExtTrapPeerBoardSlotID, hwEntityExtTrapErrorPacketStatistics, hwEntityExtTrapErrorPacketThreshold, hwEntityExtTrapMonitorInterval
// Description: When the CRC errors of HIG port are more than the threshold, send a SNMP trap to network manager.
trapMap["1.3.6.1.4.1.2011.5.25.31.2.2.8"] = [
    name: "hwEntityHigErrorPacketThresholdAlarm",
    fields: ["hwEntityExtTrapBoardSlotID", "hwEntityExtTrapUnitID", "hwEntityExtTrapHigPortID", "hwEntityExtTrapPeerBoardSlotID", "hwEntityExtTrapErrorPacketStatistics", "hwEntityExtTrapErrorPacketThreshold", "hwEntityExtTrapMonitorInterval"],
    fieldOids: ["hwEntityExtTrapBoardSlotID": "1.3.6.1.4.1.2011.5.25.31.2.1.4", "hwEntityExtTrapUnitID": "1.3.6.1.4.1.2011.5.25.31.2.1.5", "hwEntityExtTrapHigPortID": "1.3.6.1.4.1.2011.5.25.31.2.1.6", "hwEntityExtTrapPeerBoardSlotID": "1.3.6.1.4.1.2011.5.25.31.2.1.9", "hwEntityExtTrapErrorPacketStatistics": "1.3.6.1.4.1.2011.5.25.31.2.1.10", "hwEntityExtTrapErrorPacketThreshold": "1.3.6.1.4.1.2011.5.25.31.2.1.11", "hwEntityExtTrapMonitorInterval": "1.3.6.1.4.1.2011.5.25.31.2.1.13"]
]

// --- hwEntityHigStateChangeNotify (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.31.2.2.9
// Fields: hwEntityExtTrapBoardSlotID, hwEntityExtTrapUnitID, hwEntityExtTrapHigPortID, hwEntityExtTrapPeerBoardSlotID, hwEntityExtTrapHigStateChangeTimes
// Description: When the CRC errors of Serdes channel are more than the threshold, send a SNMP trap to network manager.
trapMap["1.3.6.1.4.1.2011.5.25.31.2.2.9"] = [
    name: "hwEntityHigStateChangeNotify",
    fields: ["hwEntityExtTrapBoardSlotID", "hwEntityExtTrapUnitID", "hwEntityExtTrapHigPortID", "hwEntityExtTrapPeerBoardSlotID", "hwEntityExtTrapHigStateChangeTimes"],
    fieldOids: ["hwEntityExtTrapBoardSlotID": "1.3.6.1.4.1.2011.5.25.31.2.1.4", "hwEntityExtTrapUnitID": "1.3.6.1.4.1.2011.5.25.31.2.1.5", "hwEntityExtTrapHigPortID": "1.3.6.1.4.1.2011.5.25.31.2.1.6", "hwEntityExtTrapPeerBoardSlotID": "1.3.6.1.4.1.2011.5.25.31.2.1.9", "hwEntityExtTrapHigStateChangeTimes": "1.3.6.1.4.1.2011.5.25.31.2.1.12"]
]

// --- hwEntityHigStateDownNotify (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.31.2.2.10
// Fields: hwEntityExtTrapBoardSlotID, hwEntityExtTrapUnitID, hwEntityExtTrapHigPortID, hwEntityExtTrapPeerBoardSlotID, hwEntityExtTrapMonitorInterval
// Description: When the state of Serdes channel is always down, send a SNMP trap to network manager.
trapMap["1.3.6.1.4.1.2011.5.25.31.2.2.10"] = [
    name: "hwEntityHigStateDownNotify",
    fields: ["hwEntityExtTrapBoardSlotID", "hwEntityExtTrapUnitID", "hwEntityExtTrapHigPortID", "hwEntityExtTrapPeerBoardSlotID", "hwEntityExtTrapMonitorInterval"],
    fieldOids: ["hwEntityExtTrapBoardSlotID": "1.3.6.1.4.1.2011.5.25.31.2.1.4", "hwEntityExtTrapUnitID": "1.3.6.1.4.1.2011.5.25.31.2.1.5", "hwEntityExtTrapHigPortID": "1.3.6.1.4.1.2011.5.25.31.2.1.6", "hwEntityExtTrapPeerBoardSlotID": "1.3.6.1.4.1.2011.5.25.31.2.1.9", "hwEntityExtTrapMonitorInterval": "1.3.6.1.4.1.2011.5.25.31.2.1.13"]
]

// --- hwEntityPositionMismatchNotify (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.31.2.2.11
// Fields: hwEntityExtTrapBoardSlotID
// Description: When the board type and slotID is mismatch,send a SNMP notify to network manager.
trapMap["1.3.6.1.4.1.2011.5.25.31.2.2.11"] = [
    name: "hwEntityPositionMismatchNotify",
    fields: ["hwEntityExtTrapBoardSlotID"],
    fieldOids: ["hwEntityExtTrapBoardSlotID": "1.3.6.1.4.1.2011.5.25.31.2.1.4"]
]

// --- hwEntityRuntPacketCheckNotify (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.31.2.2.12
// Fields: hwEntityExtTrapBoardSlotID, hwEntityExtTrapUnitID, hwEntityExtTrapHigPortID
// Description: When the statistics of runt packets is more than the threshold, send a SNMP trap to network manager.
trapMap["1.3.6.1.4.1.2011.5.25.31.2.2.12"] = [
    name: "hwEntityRuntPacketCheckNotify",
    fields: ["hwEntityExtTrapBoardSlotID", "hwEntityExtTrapUnitID", "hwEntityExtTrapHigPortID"],
    fieldOids: ["hwEntityExtTrapBoardSlotID": "1.3.6.1.4.1.2011.5.25.31.2.1.4", "hwEntityExtTrapUnitID": "1.3.6.1.4.1.2011.5.25.31.2.1.5", "hwEntityExtTrapHigPortID": "1.3.6.1.4.1.2011.5.25.31.2.1.6"]
]

// --- hwEntityHigCrcErrorAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.31.2.2.17
// Fields: hwEntityExtTrapBoardSlotID, hwEntityExtTrapUnitID, hwEntityExtTrapHigPortID, hwEntityExtTrapPeerBoardSlotID, hwEntityExtTrapErrorPacketStatistics, hwEntityExtTrapErrorPacketThreshold, hwEntityExtTrapMonitorInterval
// Description: When the CRC errors of HIG port are more than the threshold, send a SNMP alarm trap to network manager.
trapMap["1.3.6.1.4.1.2011.5.25.31.2.2.17"] = [
    name: "hwEntityHigCrcErrorAlarm",
    fields: ["hwEntityExtTrapBoardSlotID", "hwEntityExtTrapUnitID", "hwEntityExtTrapHigPortID", "hwEntityExtTrapPeerBoardSlotID", "hwEntityExtTrapErrorPacketStatistics", "hwEntityExtTrapErrorPacketThreshold", "hwEntityExtTrapMonitorInterval"],
    fieldOids: ["hwEntityExtTrapBoardSlotID": "1.3.6.1.4.1.2011.5.25.31.2.1.4", "hwEntityExtTrapUnitID": "1.3.6.1.4.1.2011.5.25.31.2.1.5", "hwEntityExtTrapHigPortID": "1.3.6.1.4.1.2011.5.25.31.2.1.6", "hwEntityExtTrapPeerBoardSlotID": "1.3.6.1.4.1.2011.5.25.31.2.1.9", "hwEntityExtTrapErrorPacketStatistics": "1.3.6.1.4.1.2011.5.25.31.2.1.10", "hwEntityExtTrapErrorPacketThreshold": "1.3.6.1.4.1.2011.5.25.31.2.1.11", "hwEntityExtTrapMonitorInterval": "1.3.6.1.4.1.2011.5.25.31.2.1.13"]
]

// --- hwEntityHigCrcErrorAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.31.2.2.18
// Fields: hwEntityExtTrapBoardSlotID, hwEntityExtTrapUnitID, hwEntityExtTrapHigPortID, hwEntityExtTrapPeerBoardSlotID, hwEntityExtTrapErrorPacketStatistics, hwEntityExtTrapErrorPacketThreshold, hwEntityExtTrapMonitorInterval
// Description: When the number of CRC errors on the HIG port falls below the threshold, an SNMP trap is sent to the network manager.
trapMap["1.3.6.1.4.1.2011.5.25.31.2.2.18"] = [
    name: "hwEntityHigCrcErrorAlarmResume",
    fields: ["hwEntityExtTrapBoardSlotID", "hwEntityExtTrapUnitID", "hwEntityExtTrapHigPortID", "hwEntityExtTrapPeerBoardSlotID", "hwEntityExtTrapErrorPacketStatistics", "hwEntityExtTrapErrorPacketThreshold", "hwEntityExtTrapMonitorInterval"],
    fieldOids: ["hwEntityExtTrapBoardSlotID": "1.3.6.1.4.1.2011.5.25.31.2.1.4", "hwEntityExtTrapUnitID": "1.3.6.1.4.1.2011.5.25.31.2.1.5", "hwEntityExtTrapHigPortID": "1.3.6.1.4.1.2011.5.25.31.2.1.6", "hwEntityExtTrapPeerBoardSlotID": "1.3.6.1.4.1.2011.5.25.31.2.1.9", "hwEntityExtTrapErrorPacketStatistics": "1.3.6.1.4.1.2011.5.25.31.2.1.10", "hwEntityExtTrapErrorPacketThreshold": "1.3.6.1.4.1.2011.5.25.31.2.1.11", "hwEntityExtTrapMonitorInterval": "1.3.6.1.4.1.2011.5.25.31.2.1.13"]
]

// --- hwEntityHigDown (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.31.2.2.19
// Fields: hwEntityExtTrapBoardSlotID, hwEntityExtTrapUnitID, hwEntityExtTrapHigPortID, hwEntityExtTrapPeerBoardSlotID, hwEntityExtTrapMonitorInterval
// Description: When the state of Serdes channel is always down, send a SNMP trap to network manager.
trapMap["1.3.6.1.4.1.2011.5.25.31.2.2.19"] = [
    name: "hwEntityHigDown",
    fields: ["hwEntityExtTrapBoardSlotID", "hwEntityExtTrapUnitID", "hwEntityExtTrapHigPortID", "hwEntityExtTrapPeerBoardSlotID", "hwEntityExtTrapMonitorInterval"],
    fieldOids: ["hwEntityExtTrapBoardSlotID": "1.3.6.1.4.1.2011.5.25.31.2.1.4", "hwEntityExtTrapUnitID": "1.3.6.1.4.1.2011.5.25.31.2.1.5", "hwEntityExtTrapHigPortID": "1.3.6.1.4.1.2011.5.25.31.2.1.6", "hwEntityExtTrapPeerBoardSlotID": "1.3.6.1.4.1.2011.5.25.31.2.1.9", "hwEntityExtTrapMonitorInterval": "1.3.6.1.4.1.2011.5.25.31.2.1.13"]
]

// --- hwEntityHigDownResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.31.2.2.20
// Fields: hwEntityExtTrapBoardSlotID, hwEntityExtTrapUnitID, hwEntityExtTrapHigPortID, hwEntityExtTrapPeerBoardSlotID, hwEntityExtTrapMonitorInterval
// Description: When the Serdes channel goes Up, an SNMP trap is sent to the network manager.
trapMap["1.3.6.1.4.1.2011.5.25.31.2.2.20"] = [
    name: "hwEntityHigDownResume",
    fields: ["hwEntityExtTrapBoardSlotID", "hwEntityExtTrapUnitID", "hwEntityExtTrapHigPortID", "hwEntityExtTrapPeerBoardSlotID", "hwEntityExtTrapMonitorInterval"],
    fieldOids: ["hwEntityExtTrapBoardSlotID": "1.3.6.1.4.1.2011.5.25.31.2.1.4", "hwEntityExtTrapUnitID": "1.3.6.1.4.1.2011.5.25.31.2.1.5", "hwEntityExtTrapHigPortID": "1.3.6.1.4.1.2011.5.25.31.2.1.6", "hwEntityExtTrapPeerBoardSlotID": "1.3.6.1.4.1.2011.5.25.31.2.1.9", "hwEntityExtTrapMonitorInterval": "1.3.6.1.4.1.2011.5.25.31.2.1.13"]
]

// --- hwBoardDropRuntPacketNotify (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.31.2.2.13
// Fields: entPhysicalName, hwEntityExtTrapBoardDropRuntPktStatistics, hwEntityExtTrapBoardDropRuntPktTimeInterval
// Description: When the statistics of dropped runt packets on the board is more than the threshold, send a SNMP trap to network manager.
trapMap["1.3.6.1.4.1.2011.5.25.31.2.2.13"] = [
    name: "hwBoardDropRuntPacketNotify",
    fields: ["entPhysicalName", "hwEntityExtTrapBoardDropRuntPktStatistics", "hwEntityExtTrapBoardDropRuntPktTimeInterval"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityExtTrapBoardDropRuntPktStatistics": "1.3.6.1.4.1.2011.5.25.31.2.1.14", "hwEntityExtTrapBoardDropRuntPktTimeInterval": "1.3.6.1.4.1.2011.5.25.31.2.1.15"]
]

// --- hwEntityHigDiscardPacketNotify (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.31.2.2.14
// Fields: hwEntityExtTrapBoardSlotID, hwEntityExtTrapUnitID, hwEntityExtTrapHigPortID, hwEntityExtTrapPeerBoardSlotID, hwEntityExtTrapDiscardNumber, hwEntityExtTrapThreshold, hwEntityExtTrapInterval
// Description: When the congistion drop packets of HIG port are more than the threshold, send a SNMP trap to network manager.
trapMap["1.3.6.1.4.1.2011.5.25.31.2.2.14"] = [
    name: "hwEntityHigDiscardPacketNotify",
    fields: ["hwEntityExtTrapBoardSlotID", "hwEntityExtTrapUnitID", "hwEntityExtTrapHigPortID", "hwEntityExtTrapPeerBoardSlotID", "hwEntityExtTrapDiscardNumber", "hwEntityExtTrapThreshold", "hwEntityExtTrapInterval"],
    fieldOids: ["hwEntityExtTrapBoardSlotID": "1.3.6.1.4.1.2011.5.25.31.2.1.4", "hwEntityExtTrapUnitID": "1.3.6.1.4.1.2011.5.25.31.2.1.5", "hwEntityExtTrapHigPortID": "1.3.6.1.4.1.2011.5.25.31.2.1.6", "hwEntityExtTrapPeerBoardSlotID": "1.3.6.1.4.1.2011.5.25.31.2.1.9", "hwEntityExtTrapDiscardNumber": "1.3.6.1.4.1.2011.5.25.31.2.1.16", "hwEntityExtTrapThreshold": "1.3.6.1.4.1.2011.5.25.31.2.1.17", "hwEntityExtTrapInterval": "1.3.6.1.4.1.2011.5.25.31.2.1.18"]
]

// --- hwEntitySerdesChangeNotify (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.31.2.2.15
// Fields: hwEntityExtTrapBoardSlotID, hwEntityExtTrapUnitID, hwEntityExtTrapHigPortID, hwEntityExtTrapPeerBoardSlotID, hwEntityExtTrapHigStateChangeTimes
// Description: When the CRC errors of Fic port are more than the threshold, send a SNMP trap to network manager.
trapMap["1.3.6.1.4.1.2011.5.25.31.2.2.15"] = [
    name: "hwEntitySerdesChangeNotify",
    fields: ["hwEntityExtTrapBoardSlotID", "hwEntityExtTrapUnitID", "hwEntityExtTrapHigPortID", "hwEntityExtTrapPeerBoardSlotID", "hwEntityExtTrapHigStateChangeTimes"],
    fieldOids: ["hwEntityExtTrapBoardSlotID": "1.3.6.1.4.1.2011.5.25.31.2.1.4", "hwEntityExtTrapUnitID": "1.3.6.1.4.1.2011.5.25.31.2.1.5", "hwEntityExtTrapHigPortID": "1.3.6.1.4.1.2011.5.25.31.2.1.6", "hwEntityExtTrapPeerBoardSlotID": "1.3.6.1.4.1.2011.5.25.31.2.1.9", "hwEntityExtTrapHigStateChangeTimes": "1.3.6.1.4.1.2011.5.25.31.2.1.12"]
]

// --- hwEntitySerdesDownNotify (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.31.2.2.16
// Fields: hwEntityExtTrapBoardSlotID, hwEntityExtTrapUnitID, hwEntityExtTrapHigPortID, hwEntityExtTrapPeerBoardSlotID, hwEntityExtTrapMonitorInterval
// Description: When the state of Fic port is always down, send a SNMP trap to network manager.
trapMap["1.3.6.1.4.1.2011.5.25.31.2.2.16"] = [
    name: "hwEntitySerdesDownNotify",
    fields: ["hwEntityExtTrapBoardSlotID", "hwEntityExtTrapUnitID", "hwEntityExtTrapHigPortID", "hwEntityExtTrapPeerBoardSlotID", "hwEntityExtTrapMonitorInterval"],
    fieldOids: ["hwEntityExtTrapBoardSlotID": "1.3.6.1.4.1.2011.5.25.31.2.1.4", "hwEntityExtTrapUnitID": "1.3.6.1.4.1.2011.5.25.31.2.1.5", "hwEntityExtTrapHigPortID": "1.3.6.1.4.1.2011.5.25.31.2.1.6", "hwEntityExtTrapPeerBoardSlotID": "1.3.6.1.4.1.2011.5.25.31.2.1.9", "hwEntityExtTrapMonitorInterval": "1.3.6.1.4.1.2011.5.25.31.2.1.13"]
]

// --- hwHardwareCapaChangeNotification (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.31.5.2.1
// Fields: hwHardwareCapaSequenceNo
// Description: This object indicates the change of the 'hardware capability file'. An alarm is generated if the sequence number of the 'hardware capability file' in the current startup file is different from that in...
trapMap["1.3.6.1.4.1.2011.5.25.31.5.2.1"] = [
    name: "hwHardwareCapaChangeNotification",
    fields: ["hwHardwareCapaSequenceNo"],
    fieldOids: ["hwHardwareCapaSequenceNo": "1.3.6.1.4.1.2011.5.25.31.5.1.1"]
]

// --- hwAlarmPnPChangeNotification (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.31.5.2.2
// Fields: hwAlarmPnPSequenceNo
// Description: This object indicates the change of the 'alarm capability file'. An alarm is generated if the sequence number of the 'alarm capability file' in the current startup file is different from that in the l...
trapMap["1.3.6.1.4.1.2011.5.25.31.5.2.2"] = [
    name: "hwAlarmPnPChangeNotification",
    fields: ["hwAlarmPnPSequenceNo"],
    fieldOids: ["hwAlarmPnPSequenceNo": "1.3.6.1.4.1.2011.5.25.31.5.1.2"]
]

// --- hwEntityHeartbeatTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.31.7.2.1
// Description: Heartbeat trap.
trapMap["1.3.6.1.4.1.2011.5.25.31.7.2.1"] = [
    name: "hwEntityHeartbeatTrap",
    fields: [],
    fieldOids: []
]

// --- hwHda1Error (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.31.1.1.25.1
// Description: The file system in the hda1 directory has errors.
trapMap["1.3.6.1.4.1.2011.5.25.31.1.1.25.1"] = [
    name: "hwHda1Error",
    fields: [],
    fieldOids: []
]

// --- hwInsertDiffFromPreDisposed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.31.8.2.1
// Fields: hwDisposeEntPhysicalIndex, hwDisposeEntPhysicalVendorType, entPhysicalVendorType
// Description: This object indicates the type of the inserted entity is different from that of pre-disposed entity on the slot.
trapMap["1.3.6.1.4.1.2011.5.25.31.8.2.1"] = [
    name: "hwInsertDiffFromPreDisposed",
    fields: ["hwDisposeEntPhysicalIndex", "hwDisposeEntPhysicalVendorType", "entPhysicalVendorType"],
    fieldOids: ["hwDisposeEntPhysicalIndex": "1.3.6.1.4.1.2011.5.25.31.8.4.1.1", "hwDisposeEntPhysicalVendorType": "1.3.6.1.4.1.2011.5.25.31.8.4.1.3", "entPhysicalVendorType": "1.3.6.1.2.1.47.1.1.1.1.3"]
]

// --- hwPreDisposedChangeNotification (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.31.8.2.2
// Fields: hwPreDisposeSequenceNo
// Description: This object indicates the change of the 'predispose capability file'. An alarm is generated if the sequence number of the 'predispose capability file' in the current startup file is different from tha...
trapMap["1.3.6.1.4.1.2011.5.25.31.8.2.2"] = [
    name: "hwPreDisposedChangeNotification",
    fields: ["hwPreDisposeSequenceNo"],
    fieldOids: ["hwPreDisposeSequenceNo": "1.3.6.1.4.1.2011.5.25.31.8.1.1"]
]

// --- hwEntityExtUnconnected (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.31.9.1.1
// Fields: entPhysicalIndex, entPhysicalName
// Description: Board become unconnected for some reason.
trapMap["1.3.6.1.4.1.2011.5.25.31.9.1.1"] = [
    name: "hwEntityExtUnconnected",
    fields: ["entPhysicalIndex", "entPhysicalName"],
    fieldOids: ["entPhysicalIndex": "1.3.6.1.2.1.47.1.1.1.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwEntityExtUnconnectedResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.31.9.1.2
// Fields: entPhysicalIndex, entPhysicalName
// Description: Board resume from unconnected
trapMap["1.3.6.1.4.1.2011.5.25.31.9.1.2"] = [
    name: "hwEntityExtUnconnectedResume",
    fields: ["entPhysicalIndex", "entPhysicalName"],
    fieldOids: ["entPhysicalIndex": "1.3.6.1.2.1.47.1.1.1.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// ===== Lookup tables (inlined) =====
def lookupTables = [:]

// ===== Parsing logic =====

// Set to true to enable diagnostic logging for this MIB parser
DEBUG = false

LOG_PREFIX = "[HUAWEI-ENTITY-EXTENT-MIB]"
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
// --- Trap: hwEntityExtTemperatureThresholdNotification (OID 1.3.6.1.4.1.2011.5.25.31.2.1) ---
if (trapRuleName == "hwEntityExtTemperatureThresholdNotification") {
    event.setAlertGroup("Temperature Threshold")
    def alertKey = "hwEntityStateEntry." + (((resolveInstanceOid(3) =~ /\.([0-9]+)$/) ? (resolveInstanceOid(3) =~ /\.([0-9]+)$/)[0][1] : ''))
    event.setAlertKey(alertKey)
    def summary = "Hw Entity Ext Temperature Threshold Notification" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(3)
    event.setEventType("1")
}
// --- Trap: hwEntityExtVoltageLowThresholdNotification (OID 1.3.6.1.4.1.2011.5.25.31.2.2) ---
if (trapRuleName == "hwEntityExtVoltageLowThresholdNotification") {
    event.setAlertGroup("Voltage Low Threshold")
    def alertKey = "hwEntityStateEntry." + (((resolveInstanceOid(3) =~ /\.([0-9]+)$/) ? (resolveInstanceOid(3) =~ /\.([0-9]+)$/)[0][1] : ''))
    event.setAlertKey(alertKey)
    def summary = "Hw Entity Ext Voltage Low Threshold Notification" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(3)
    event.setEventType("1")
}
// --- Trap: hwEntityExtVoltageHighThresholdNotification (OID 1.3.6.1.4.1.2011.5.25.31.2.3) ---
if (trapRuleName == "hwEntityExtVoltageHighThresholdNotification") {
    event.setAlertGroup("Voltage High Threshold")
    def alertKey = "hwEntityStateEntry." + (((resolveInstanceOid(3) =~ /\.([0-9]+)$/) ? (resolveInstanceOid(3) =~ /\.([0-9]+)$/)[0][1] : ''))
    event.setAlertKey(alertKey)
    def summary = "Hw Entity Ext Voltage High Threshold Notification" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(3)
    event.setEventType("1")
}
// --- Trap: hwEntityExtCpuUsageThresholdNotfication (OID 1.3.6.1.4.1.2011.5.25.31.2.4) ---
if (trapRuleName == "hwEntityExtCpuUsageThresholdNotfication") {
    event.setAlertGroup("CPU Usage Threshold")
    def alertKey = "hwEntityStateEntry." + (((resolveInstanceOid(5) =~ /\.([0-9]+)$/) ? (resolveInstanceOid(5) =~ /\.([0-9]+)$/)[0][1] : ''))
    event.setAlertKey(alertKey)
    def summary = "Hw Entity Ext Cpu Usage Threshold Notfication" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(3)
    event.setEventType("1")
}
// --- Trap: hwEntityExtMemUsageThresholdNotification (OID 1.3.6.1.4.1.2011.5.25.31.2.5) ---
if (trapRuleName == "hwEntityExtMemUsageThresholdNotification") {
    event.setAlertGroup("Memory Usage Threshold")
    def alertKey = "hwEntityStateEntry." + (((resolveInstanceOid(4) =~ /\.([0-9]+)$/) ? (resolveInstanceOid(4) =~ /\.([0-9]+)$/)[0][1] : ''))
    event.setAlertKey(alertKey)
    def summary = "Hw Entity Ext Mem Usage Threshold Notification" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(3)
    event.setEventType("1")
}
// --- Trap: hwEntityExtOperEnabled (OID 1.3.6.1.4.1.2011.5.25.31.2.6) ---
if (trapRuleName == "hwEntityExtOperEnabled") {
    event.setAlertGroup("Entity Oper Status")
    def alertKey = "hwEntityStateEntry." + (((resolveInstanceOid(1) =~ /\.([0-9]+)$/) ? (resolveInstanceOid(1) =~ /\.([0-9]+)$/)[0][1] : ''))
    event.setAlertKey(alertKey)
    def summary = "Hw Entity Ext Oper Enabled" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(1)
    event.setEventType("2")
    def dyn = event.getDynamicFields() ?: [:]
    dyn["hwEntityAdminStatus"] = varbinds.get("hwEntityAdminStatus")
    dyn["hwEntityAlarmLight"] = varbinds.get("hwEntityAlarmLight")
    dyn["entPhysicalIndex"] = varbinds.get("entPhysicalIndex")
    event.setDynamicFields(dyn)
}
// --- Trap: hwEntityExtOperDisabled (OID 1.3.6.1.4.1.2011.5.25.31.2.7) ---
if (trapRuleName == "hwEntityExtOperDisabled") {
    event.setAlertGroup("Entity Oper Status")
    def alertKey = "hwEntityStateEntry." + (((resolveInstanceOid(1) =~ /\.([0-9]+)$/) ? (resolveInstanceOid(1) =~ /\.([0-9]+)$/)[0][1] : ''))
    event.setAlertKey(alertKey)
    def summary = "Hw Entity Ext Oper Disabled" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(2)
    event.setEventType("1")
    def dyn = event.getDynamicFields() ?: [:]
    dyn["hwEntityAdminStatus"] = varbinds.get("hwEntityAdminStatus")
    dyn["hwEntityAlarmLight"] = varbinds.get("hwEntityAlarmLight")
    dyn["entPhysicalIndex"] = varbinds.get("entPhysicalIndex")
    event.setDynamicFields(dyn)
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
