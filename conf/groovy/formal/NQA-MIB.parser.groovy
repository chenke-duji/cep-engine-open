/**
 * Auto-generated from NQA-MIB.mib
 * Generated: 2026-08-24T18:28:31.975138300
 * Traps/Notifications (31): nqaResultsProbeFailed, nqaResultsTestFailed, nqaResultsTestCompleted, nqaResultsThresholdNotification, nqaHTTPStatsProbeFailed, nqaHTTPStatsTestFailed, nqaHTTPStatsTestCompleted, nqaHTTPStatsThresholdNotification, nqaJitterStatsProbeFailed, nqaJitterStatsTestFailed, nqaJitterStatsTestCompleted, nqaFTPStatsProbeFailed, nqaFTPStatsTestFailed, nqaFTPStatsTestCompleted, nqaFTPStatsThresholdNotification, nqaJitterStatsRTDThresholdNotification, nqaJitterStatsOWDThresholdNotificationSD, nqaJitterStatsOWDThresholdNotificationDS, nqaNegotiateFailed, nqaRisingAlarmNotification, nqaFallingAlarmNotification, nqaFtpSaveRecordNotification, nqaPppoeStatsTestFailed, nqaPppoeStatsTestCompleted, nqaJitterStatsJitterThresholdNotificationSD, nqaJitterStatsJitterThresholdNotificationDS, nqaReflectorStateChangeNotification, nqaResultsTestResultChange, nqaResultsTestResultChangePackedNotification, nqaResultsTestResultStatusChange, nqaResultsProbeFailedVerbose
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

// --- nqaResultsProbeFailed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.111.6.1
// Fields: nqaAdminParaTargetAddressType, nqaAdminParaTargetAddress, nqaScheduleOperStatus, nqaResultsAddressType, nqaResultsAddress, nqaResultsCompletionTimeMin, nqaResultsCompletionTimeMax, nqaResultsSumCompletionTime, nqaResultsProbeResponses, nqaResultsSentProbes, nqaResultsSumCompletionTime2Low, nqaResultsSumCompletionTime2High, nqaResultsLastGoodProbe, nqaResultsLastGoodPath
// Description: Generated when a probe failure is detected when the corresponding nqaAdminParaTrapGeneration object is set to probeFailure(0) subject to the value of nqaAdminParaTrapProbeFailureFilter. The object nqa...
trapMap["1.3.6.1.4.1.2011.5.25.111.6.1"] = [
    name: "nqaResultsProbeFailed",
    fields: ["nqaAdminParaTargetAddressType", "nqaAdminParaTargetAddress", "nqaScheduleOperStatus", "nqaResultsAddressType", "nqaResultsAddress", "nqaResultsCompletionTimeMin", "nqaResultsCompletionTimeMax", "nqaResultsSumCompletionTime", "nqaResultsProbeResponses", "nqaResultsSentProbes", "nqaResultsSumCompletionTime2Low", "nqaResultsSumCompletionTime2High", "nqaResultsLastGoodProbe", "nqaResultsLastGoodPath"],
    fieldOids: ["nqaAdminParaTargetAddressType": "1.3.6.1.4.1.2011.5.25.111.2.2.1.1", "nqaAdminParaTargetAddress": "1.3.6.1.4.1.2011.5.25.111.2.2.1.2", "nqaScheduleOperStatus": "1.3.6.1.4.1.2011.5.25.111.2.3.1.9", "nqaResultsAddressType": "1.3.6.1.4.1.2011.5.25.111.4.1.1.19", "nqaResultsAddress": "1.3.6.1.4.1.2011.5.25.111.4.1.1.20", "nqaResultsCompletionTimeMin": "1.3.6.1.4.1.2011.5.25.111.4.1.1.11", "nqaResultsCompletionTimeMax": "1.3.6.1.4.1.2011.5.25.111.4.1.1.12", "nqaResultsSumCompletionTime": "1.3.6.1.4.1.2011.5.25.111.4.1.1.8", "nqaResultsProbeResponses": "1.3.6.1.4.1.2011.5.25.111.4.1.1.21", "nqaResultsSentProbes": "1.3.6.1.4.1.2011.5.25.111.4.1.1.22", "nqaResultsSumCompletionTime2Low": "1.3.6.1.4.1.2011.5.25.111.4.1.1.9", "nqaResultsSumCompletionTime2High": "1.3.6.1.4.1.2011.5.25.111.4.1.1.10", "nqaResultsLastGoodProbe": "1.3.6.1.4.1.2011.5.25.111.4.1.1.23", "nqaResultsLastGoodPath": "1.3.6.1.4.1.2011.5.25.111.4.1.1.24"]
]

// --- nqaResultsTestFailed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.111.6.2
// Fields: nqaAdminParaTargetAddressType, nqaAdminParaTargetAddress, nqaScheduleOperStatus, nqaResultsAddressType, nqaResultsAddress, nqaResultsCompletionTimeMin, nqaResultsCompletionTimeMax, nqaResultsSumCompletionTime, nqaResultsProbeResponses, nqaResultsSentProbes, nqaResultsSumCompletionTime2Low, nqaResultsSumCompletionTime2High, nqaResultsLastGoodProbe, nqaResultsLastGoodPath
// Description: Generated when a nqa test is determined to have failed when the corresponding nqaAdminParaTrapGeneration object is set to testFailure(1). In this instance nqaAdminParaTrapTestFailureFilter should spec...
trapMap["1.3.6.1.4.1.2011.5.25.111.6.2"] = [
    name: "nqaResultsTestFailed",
    fields: ["nqaAdminParaTargetAddressType", "nqaAdminParaTargetAddress", "nqaScheduleOperStatus", "nqaResultsAddressType", "nqaResultsAddress", "nqaResultsCompletionTimeMin", "nqaResultsCompletionTimeMax", "nqaResultsSumCompletionTime", "nqaResultsProbeResponses", "nqaResultsSentProbes", "nqaResultsSumCompletionTime2Low", "nqaResultsSumCompletionTime2High", "nqaResultsLastGoodProbe", "nqaResultsLastGoodPath"],
    fieldOids: ["nqaAdminParaTargetAddressType": "1.3.6.1.4.1.2011.5.25.111.2.2.1.1", "nqaAdminParaTargetAddress": "1.3.6.1.4.1.2011.5.25.111.2.2.1.2", "nqaScheduleOperStatus": "1.3.6.1.4.1.2011.5.25.111.2.3.1.9", "nqaResultsAddressType": "1.3.6.1.4.1.2011.5.25.111.4.1.1.19", "nqaResultsAddress": "1.3.6.1.4.1.2011.5.25.111.4.1.1.20", "nqaResultsCompletionTimeMin": "1.3.6.1.4.1.2011.5.25.111.4.1.1.11", "nqaResultsCompletionTimeMax": "1.3.6.1.4.1.2011.5.25.111.4.1.1.12", "nqaResultsSumCompletionTime": "1.3.6.1.4.1.2011.5.25.111.4.1.1.8", "nqaResultsProbeResponses": "1.3.6.1.4.1.2011.5.25.111.4.1.1.21", "nqaResultsSentProbes": "1.3.6.1.4.1.2011.5.25.111.4.1.1.22", "nqaResultsSumCompletionTime2Low": "1.3.6.1.4.1.2011.5.25.111.4.1.1.9", "nqaResultsSumCompletionTime2High": "1.3.6.1.4.1.2011.5.25.111.4.1.1.10", "nqaResultsLastGoodProbe": "1.3.6.1.4.1.2011.5.25.111.4.1.1.23", "nqaResultsLastGoodPath": "1.3.6.1.4.1.2011.5.25.111.4.1.1.24"]
]

// --- nqaResultsTestCompleted (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.111.6.3
// Fields: nqaAdminParaTargetAddressType, nqaAdminParaTargetAddress, nqaScheduleOperStatus, nqaResultsAddressType, nqaResultsAddress, nqaResultsCompletionTimeMin, nqaResultsCompletionTimeMax, nqaResultsSumCompletionTime, nqaResultsProbeResponses, nqaResultsSentProbes, nqaResultsSumCompletionTime2Low, nqaResultsSumCompletionTime2High, nqaResultsLastGoodProbe, nqaResultsLastGoodPath
// Description: Generated at the completion of a nqa test when the corresponding nqaAdminParaTrapGeneration object is set to testCompletion(2).(except for HTTP or Jitter or FTP)
trapMap["1.3.6.1.4.1.2011.5.25.111.6.3"] = [
    name: "nqaResultsTestCompleted",
    fields: ["nqaAdminParaTargetAddressType", "nqaAdminParaTargetAddress", "nqaScheduleOperStatus", "nqaResultsAddressType", "nqaResultsAddress", "nqaResultsCompletionTimeMin", "nqaResultsCompletionTimeMax", "nqaResultsSumCompletionTime", "nqaResultsProbeResponses", "nqaResultsSentProbes", "nqaResultsSumCompletionTime2Low", "nqaResultsSumCompletionTime2High", "nqaResultsLastGoodProbe", "nqaResultsLastGoodPath"],
    fieldOids: ["nqaAdminParaTargetAddressType": "1.3.6.1.4.1.2011.5.25.111.2.2.1.1", "nqaAdminParaTargetAddress": "1.3.6.1.4.1.2011.5.25.111.2.2.1.2", "nqaScheduleOperStatus": "1.3.6.1.4.1.2011.5.25.111.2.3.1.9", "nqaResultsAddressType": "1.3.6.1.4.1.2011.5.25.111.4.1.1.19", "nqaResultsAddress": "1.3.6.1.4.1.2011.5.25.111.4.1.1.20", "nqaResultsCompletionTimeMin": "1.3.6.1.4.1.2011.5.25.111.4.1.1.11", "nqaResultsCompletionTimeMax": "1.3.6.1.4.1.2011.5.25.111.4.1.1.12", "nqaResultsSumCompletionTime": "1.3.6.1.4.1.2011.5.25.111.4.1.1.8", "nqaResultsProbeResponses": "1.3.6.1.4.1.2011.5.25.111.4.1.1.21", "nqaResultsSentProbes": "1.3.6.1.4.1.2011.5.25.111.4.1.1.22", "nqaResultsSumCompletionTime2Low": "1.3.6.1.4.1.2011.5.25.111.4.1.1.9", "nqaResultsSumCompletionTime2High": "1.3.6.1.4.1.2011.5.25.111.4.1.1.10", "nqaResultsLastGoodProbe": "1.3.6.1.4.1.2011.5.25.111.4.1.1.23", "nqaResultsLastGoodPath": "1.3.6.1.4.1.2011.5.25.111.4.1.1.24"]
]

// --- nqaResultsThresholdNotification (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.111.6.4
// Fields: nqaAdminParaTargetAddressType, nqaAdminParaTargetAddress, nqaResultsAddressType, nqaResultsAddress, nqaAdminCtrlThreshold1, nqaResultsCompletionTimeMax, nqaResultsRTDOverThresholds
// Description: If the time of executing tests exceeds the nqaAdminCtrlThreshold1, the system sends trap information.(except for HTTP or Jitter or FTP)
trapMap["1.3.6.1.4.1.2011.5.25.111.6.4"] = [
    name: "nqaResultsThresholdNotification",
    fields: ["nqaAdminParaTargetAddressType", "nqaAdminParaTargetAddress", "nqaResultsAddressType", "nqaResultsAddress", "nqaAdminCtrlThreshold1", "nqaResultsCompletionTimeMax", "nqaResultsRTDOverThresholds"],
    fieldOids: ["nqaAdminParaTargetAddressType": "1.3.6.1.4.1.2011.5.25.111.2.2.1.1", "nqaAdminParaTargetAddress": "1.3.6.1.4.1.2011.5.25.111.2.2.1.2", "nqaResultsAddressType": "1.3.6.1.4.1.2011.5.25.111.4.1.1.19", "nqaResultsAddress": "1.3.6.1.4.1.2011.5.25.111.4.1.1.20", "nqaAdminCtrlThreshold1": "1.3.6.1.4.1.2011.5.25.111.2.1.1.7", "nqaResultsCompletionTimeMax": "1.3.6.1.4.1.2011.5.25.111.4.1.1.12", "nqaResultsRTDOverThresholds": "1.3.6.1.4.1.2011.5.25.111.4.1.1.7"]
]

// --- nqaHTTPStatsProbeFailed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.111.6.5
// Fields: nqaAdminParaTargetAddressType, nqaAdminParaTargetAddress, nqaScheduleOperStatus, nqaHTTPStatsDNSRTTSum, nqaHTTPStatsTCPConnectRTTSum, nqaHTTPStatsTransactionRTTSum, nqaHTTPStatsDNSServerTimeouts, nqaHTTPStatsTCPConnectTimeouts, nqaHTTPStatsTransactionTimeouts, nqaHTTPStatsDNSQueryErrors, nqaHTTPStatsTcpConnErrors, nqaHTTPStatsErrors, nqaHTTPStatsProbeResponses, nqaHTTPStatsSendProbes
// Description: Generated when a probe failure is detected when the corresponding nqaAdminParaTrapGeneration object is set to probeFailure(0) subject to the value of nqaAdminParaTrapProbeFailureFilter. The object nqa...
trapMap["1.3.6.1.4.1.2011.5.25.111.6.5"] = [
    name: "nqaHTTPStatsProbeFailed",
    fields: ["nqaAdminParaTargetAddressType", "nqaAdminParaTargetAddress", "nqaScheduleOperStatus", "nqaHTTPStatsDNSRTTSum", "nqaHTTPStatsTCPConnectRTTSum", "nqaHTTPStatsTransactionRTTSum", "nqaHTTPStatsDNSServerTimeouts", "nqaHTTPStatsTCPConnectTimeouts", "nqaHTTPStatsTransactionTimeouts", "nqaHTTPStatsDNSQueryErrors", "nqaHTTPStatsTcpConnErrors", "nqaHTTPStatsErrors", "nqaHTTPStatsProbeResponses", "nqaHTTPStatsSendProbes"],
    fieldOids: ["nqaAdminParaTargetAddressType": "1.3.6.1.4.1.2011.5.25.111.2.2.1.1", "nqaAdminParaTargetAddress": "1.3.6.1.4.1.2011.5.25.111.2.2.1.2", "nqaScheduleOperStatus": "1.3.6.1.4.1.2011.5.25.111.2.3.1.9", "nqaHTTPStatsDNSRTTSum": "1.3.6.1.4.1.2011.5.25.111.4.2.1.7", "nqaHTTPStatsTCPConnectRTTSum": "1.3.6.1.4.1.2011.5.25.111.4.2.1.10", "nqaHTTPStatsTransactionRTTSum": "1.3.6.1.4.1.2011.5.25.111.4.2.1.13", "nqaHTTPStatsDNSServerTimeouts": "1.3.6.1.4.1.2011.5.25.111.4.2.1.17", "nqaHTTPStatsTCPConnectTimeouts": "1.3.6.1.4.1.2011.5.25.111.4.2.1.18", "nqaHTTPStatsTransactionTimeouts": "1.3.6.1.4.1.2011.5.25.111.4.2.1.19", "nqaHTTPStatsDNSQueryErrors": "1.3.6.1.4.1.2011.5.25.111.4.2.1.20", "nqaHTTPStatsTcpConnErrors": "1.3.6.1.4.1.2011.5.25.111.4.2.1.22", "nqaHTTPStatsErrors": "1.3.6.1.4.1.2011.5.25.111.4.2.1.21", "nqaHTTPStatsProbeResponses": "1.3.6.1.4.1.2011.5.25.111.4.2.1.23", "nqaHTTPStatsSendProbes": "1.3.6.1.4.1.2011.5.25.111.4.2.1.24"]
]

// --- nqaHTTPStatsTestFailed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.111.6.6
// Fields: nqaAdminParaTargetAddressType, nqaAdminParaTargetAddress, nqaScheduleOperStatus, nqaHTTPStatsDNSRTTSum, nqaHTTPStatsTCPConnectRTTSum, nqaHTTPStatsTransactionRTTSum, nqaHTTPStatsDNSServerTimeouts, nqaHTTPStatsTCPConnectTimeouts, nqaHTTPStatsTransactionTimeouts, nqaHTTPStatsDNSQueryErrors, nqaHTTPStatsTcpConnErrors, nqaHTTPStatsErrors, nqaHTTPStatsProbeResponses, nqaHTTPStatsSendProbes
// Description: Generated when a HTTP test is determined to have failed when the corresponding nqaAdminParaTrapGeneration object is set to testFailure(1). In this instance nqaAdminParaTrapTestFailureFilter should spe...
trapMap["1.3.6.1.4.1.2011.5.25.111.6.6"] = [
    name: "nqaHTTPStatsTestFailed",
    fields: ["nqaAdminParaTargetAddressType", "nqaAdminParaTargetAddress", "nqaScheduleOperStatus", "nqaHTTPStatsDNSRTTSum", "nqaHTTPStatsTCPConnectRTTSum", "nqaHTTPStatsTransactionRTTSum", "nqaHTTPStatsDNSServerTimeouts", "nqaHTTPStatsTCPConnectTimeouts", "nqaHTTPStatsTransactionTimeouts", "nqaHTTPStatsDNSQueryErrors", "nqaHTTPStatsTcpConnErrors", "nqaHTTPStatsErrors", "nqaHTTPStatsProbeResponses", "nqaHTTPStatsSendProbes"],
    fieldOids: ["nqaAdminParaTargetAddressType": "1.3.6.1.4.1.2011.5.25.111.2.2.1.1", "nqaAdminParaTargetAddress": "1.3.6.1.4.1.2011.5.25.111.2.2.1.2", "nqaScheduleOperStatus": "1.3.6.1.4.1.2011.5.25.111.2.3.1.9", "nqaHTTPStatsDNSRTTSum": "1.3.6.1.4.1.2011.5.25.111.4.2.1.7", "nqaHTTPStatsTCPConnectRTTSum": "1.3.6.1.4.1.2011.5.25.111.4.2.1.10", "nqaHTTPStatsTransactionRTTSum": "1.3.6.1.4.1.2011.5.25.111.4.2.1.13", "nqaHTTPStatsDNSServerTimeouts": "1.3.6.1.4.1.2011.5.25.111.4.2.1.17", "nqaHTTPStatsTCPConnectTimeouts": "1.3.6.1.4.1.2011.5.25.111.4.2.1.18", "nqaHTTPStatsTransactionTimeouts": "1.3.6.1.4.1.2011.5.25.111.4.2.1.19", "nqaHTTPStatsDNSQueryErrors": "1.3.6.1.4.1.2011.5.25.111.4.2.1.20", "nqaHTTPStatsTcpConnErrors": "1.3.6.1.4.1.2011.5.25.111.4.2.1.22", "nqaHTTPStatsErrors": "1.3.6.1.4.1.2011.5.25.111.4.2.1.21", "nqaHTTPStatsProbeResponses": "1.3.6.1.4.1.2011.5.25.111.4.2.1.23", "nqaHTTPStatsSendProbes": "1.3.6.1.4.1.2011.5.25.111.4.2.1.24"]
]

// --- nqaHTTPStatsTestCompleted (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.111.6.7
// Fields: nqaAdminParaTargetAddressType, nqaAdminParaTargetAddress, nqaScheduleOperStatus, nqaHTTPStatsDNSRTTSum, nqaHTTPStatsTCPConnectRTTSum, nqaHTTPStatsTransactionRTTSum, nqaHTTPStatsDNSServerTimeouts, nqaHTTPStatsTCPConnectTimeouts, nqaHTTPStatsTransactionTimeouts, nqaHTTPStatsDNSQueryErrors, nqaHTTPStatsTcpConnErrors, nqaHTTPStatsErrors, nqaHTTPStatsProbeResponses, nqaHTTPStatsSendProbes
// Description: Generated at the completion of a HTTP test when the corresponding nqaAdminParaTrapGeneration object is set to testCompletion(2).
trapMap["1.3.6.1.4.1.2011.5.25.111.6.7"] = [
    name: "nqaHTTPStatsTestCompleted",
    fields: ["nqaAdminParaTargetAddressType", "nqaAdminParaTargetAddress", "nqaScheduleOperStatus", "nqaHTTPStatsDNSRTTSum", "nqaHTTPStatsTCPConnectRTTSum", "nqaHTTPStatsTransactionRTTSum", "nqaHTTPStatsDNSServerTimeouts", "nqaHTTPStatsTCPConnectTimeouts", "nqaHTTPStatsTransactionTimeouts", "nqaHTTPStatsDNSQueryErrors", "nqaHTTPStatsTcpConnErrors", "nqaHTTPStatsErrors", "nqaHTTPStatsProbeResponses", "nqaHTTPStatsSendProbes"],
    fieldOids: ["nqaAdminParaTargetAddressType": "1.3.6.1.4.1.2011.5.25.111.2.2.1.1", "nqaAdminParaTargetAddress": "1.3.6.1.4.1.2011.5.25.111.2.2.1.2", "nqaScheduleOperStatus": "1.3.6.1.4.1.2011.5.25.111.2.3.1.9", "nqaHTTPStatsDNSRTTSum": "1.3.6.1.4.1.2011.5.25.111.4.2.1.7", "nqaHTTPStatsTCPConnectRTTSum": "1.3.6.1.4.1.2011.5.25.111.4.2.1.10", "nqaHTTPStatsTransactionRTTSum": "1.3.6.1.4.1.2011.5.25.111.4.2.1.13", "nqaHTTPStatsDNSServerTimeouts": "1.3.6.1.4.1.2011.5.25.111.4.2.1.17", "nqaHTTPStatsTCPConnectTimeouts": "1.3.6.1.4.1.2011.5.25.111.4.2.1.18", "nqaHTTPStatsTransactionTimeouts": "1.3.6.1.4.1.2011.5.25.111.4.2.1.19", "nqaHTTPStatsDNSQueryErrors": "1.3.6.1.4.1.2011.5.25.111.4.2.1.20", "nqaHTTPStatsTcpConnErrors": "1.3.6.1.4.1.2011.5.25.111.4.2.1.22", "nqaHTTPStatsErrors": "1.3.6.1.4.1.2011.5.25.111.4.2.1.21", "nqaHTTPStatsProbeResponses": "1.3.6.1.4.1.2011.5.25.111.4.2.1.23", "nqaHTTPStatsSendProbes": "1.3.6.1.4.1.2011.5.25.111.4.2.1.24"]
]

// --- nqaHTTPStatsThresholdNotification (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.111.6.8
// Fields: nqaAdminParaTargetAddressType, nqaAdminParaTargetAddress, nqaAdminCtrlThreshold1, nqaAdminCtrlThreshold2, nqaAdminCtrlThreshold3, nqaHTTPStatsDNSRTTMax, nqaHTTPStatsTCPConnectRTTMax, nqaHTTPStatsTransactionRTTMax, nqaHTTPStatsRTDOverThresholds
// Description: If the time of executing tests exceeds the nqaAdminCtrlThreshold1 or nqaAdminCtrlThreshold2 or nqaAdminCtrlThreshold3, the system sends trap information.(Only for HTTP)
trapMap["1.3.6.1.4.1.2011.5.25.111.6.8"] = [
    name: "nqaHTTPStatsThresholdNotification",
    fields: ["nqaAdminParaTargetAddressType", "nqaAdminParaTargetAddress", "nqaAdminCtrlThreshold1", "nqaAdminCtrlThreshold2", "nqaAdminCtrlThreshold3", "nqaHTTPStatsDNSRTTMax", "nqaHTTPStatsTCPConnectRTTMax", "nqaHTTPStatsTransactionRTTMax", "nqaHTTPStatsRTDOverThresholds"],
    fieldOids: ["nqaAdminParaTargetAddressType": "1.3.6.1.4.1.2011.5.25.111.2.2.1.1", "nqaAdminParaTargetAddress": "1.3.6.1.4.1.2011.5.25.111.2.2.1.2", "nqaAdminCtrlThreshold1": "1.3.6.1.4.1.2011.5.25.111.2.1.1.7", "nqaAdminCtrlThreshold2": "1.3.6.1.4.1.2011.5.25.111.2.1.1.8", "nqaAdminCtrlThreshold3": "1.3.6.1.4.1.2011.5.25.111.2.1.1.9", "nqaHTTPStatsDNSRTTMax": "1.3.6.1.4.1.2011.5.25.111.4.2.1.9", "nqaHTTPStatsTCPConnectRTTMax": "1.3.6.1.4.1.2011.5.25.111.4.2.1.12", "nqaHTTPStatsTransactionRTTMax": "1.3.6.1.4.1.2011.5.25.111.4.2.1.15", "nqaHTTPStatsRTDOverThresholds": "1.3.6.1.4.1.2011.5.25.111.4.2.1.3"]
]

// --- nqaJitterStatsProbeFailed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.111.6.9
// Fields: nqaAdminParaTargetAddressType, nqaAdminParaTargetAddress, nqaScheduleOperStatus, nqaJitterStatsRTTSum, nqaJitterStatsRTTSum2Low, nqaJitterStatsRTTSum2High, nqaJitterStatsRTTMin, nqaJitterStatsRTTMax, nqaJitterStatsPacketOutOfSequences, nqaJitterStatsErrors, nqaJitterStatsBusies, nqaJitterStatsTimeouts, nqaJitterStatsDrops, nqaJitterStatsProbeResponses, nqaJitterStatsSentProbes, nqaJitterStatsMaxDelaySD, nqaJitterStatsMaxDelayDS, nqaJitterStatsJitterOut, nqaJitterStatsJitterIn, nqaJitterStatsOWSumSD, nqaJitterStatsOWSumDS
// Description: Generated when a probe failure is detected when the corresponding nqaAdminParaTrapGeneration object is set to probeFailure(0) subject to the value of nqaAdminParaTrapProbeFailureFilter. The object nqa...
trapMap["1.3.6.1.4.1.2011.5.25.111.6.9"] = [
    name: "nqaJitterStatsProbeFailed",
    fields: ["nqaAdminParaTargetAddressType", "nqaAdminParaTargetAddress", "nqaScheduleOperStatus", "nqaJitterStatsRTTSum", "nqaJitterStatsRTTSum2Low", "nqaJitterStatsRTTSum2High", "nqaJitterStatsRTTMin", "nqaJitterStatsRTTMax", "nqaJitterStatsPacketOutOfSequences", "nqaJitterStatsErrors", "nqaJitterStatsBusies", "nqaJitterStatsTimeouts", "nqaJitterStatsDrops", "nqaJitterStatsProbeResponses", "nqaJitterStatsSentProbes", "nqaJitterStatsMaxDelaySD", "nqaJitterStatsMaxDelayDS", "nqaJitterStatsJitterOut", "nqaJitterStatsJitterIn", "nqaJitterStatsOWSumSD", "nqaJitterStatsOWSumDS"],
    fieldOids: ["nqaAdminParaTargetAddressType": "1.3.6.1.4.1.2011.5.25.111.2.2.1.1", "nqaAdminParaTargetAddress": "1.3.6.1.4.1.2011.5.25.111.2.2.1.2", "nqaScheduleOperStatus": "1.3.6.1.4.1.2011.5.25.111.2.3.1.9", "nqaJitterStatsRTTSum": "1.3.6.1.4.1.2011.5.25.111.4.3.1.5", "nqaJitterStatsRTTSum2Low": "1.3.6.1.4.1.2011.5.25.111.4.3.1.6", "nqaJitterStatsRTTSum2High": "1.3.6.1.4.1.2011.5.25.111.4.3.1.7", "nqaJitterStatsRTTMin": "1.3.6.1.4.1.2011.5.25.111.4.3.1.8", "nqaJitterStatsRTTMax": "1.3.6.1.4.1.2011.5.25.111.4.3.1.9", "nqaJitterStatsPacketOutOfSequences": "1.3.6.1.4.1.2011.5.25.111.4.3.1.36", "nqaJitterStatsErrors": "1.3.6.1.4.1.2011.5.25.111.4.3.1.37", "nqaJitterStatsBusies": "1.3.6.1.4.1.2011.5.25.111.4.3.1.38", "nqaJitterStatsTimeouts": "1.3.6.1.4.1.2011.5.25.111.4.3.1.39", "nqaJitterStatsDrops": "1.3.6.1.4.1.2011.5.25.111.4.3.1.42", "nqaJitterStatsProbeResponses": "1.3.6.1.4.1.2011.5.25.111.4.3.1.40", "nqaJitterStatsSentProbes": "1.3.6.1.4.1.2011.5.25.111.4.3.1.41", "nqaJitterStatsMaxDelaySD": "1.3.6.1.4.1.2011.5.25.111.4.3.1.44", "nqaJitterStatsMaxDelayDS": "1.3.6.1.4.1.2011.5.25.111.4.3.1.45", "nqaJitterStatsJitterOut": "1.3.6.1.4.1.2011.5.25.111.4.3.1.51", "nqaJitterStatsJitterIn": "1.3.6.1.4.1.2011.5.25.111.4.3.1.52", "nqaJitterStatsOWSumSD": "1.3.6.1.4.1.2011.5.25.111.4.3.1.56", "nqaJitterStatsOWSumDS": "1.3.6.1.4.1.2011.5.25.111.4.3.1.57"]
]

// --- nqaJitterStatsTestFailed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.111.6.10
// Fields: nqaAdminParaTargetAddressType, nqaAdminParaTargetAddress, nqaScheduleOperStatus, nqaJitterStatsRTTSum, nqaJitterStatsRTTSum2Low, nqaJitterStatsRTTSum2High, nqaJitterStatsRTTMin, nqaJitterStatsRTTMax, nqaJitterStatsPacketOutOfSequences, nqaJitterStatsErrors, nqaJitterStatsBusies, nqaJitterStatsTimeouts, nqaJitterStatsDrops, nqaJitterStatsProbeResponses, nqaJitterStatsSentProbes, nqaJitterStatsMaxDelaySD, nqaJitterStatsMaxDelayDS, nqaJitterStatsJitterOut, nqaJitterStatsJitterIn, nqaJitterStatsOWSumSD, nqaJitterStatsOWSumDS
// Description: Generated when a Jitter test is determined to have failed when the corresponding nqaAdminParaTrapGeneration object is set to testFailure(1). In this instance nqaAdminParaTrapTestFailureFilter should s...
trapMap["1.3.6.1.4.1.2011.5.25.111.6.10"] = [
    name: "nqaJitterStatsTestFailed",
    fields: ["nqaAdminParaTargetAddressType", "nqaAdminParaTargetAddress", "nqaScheduleOperStatus", "nqaJitterStatsRTTSum", "nqaJitterStatsRTTSum2Low", "nqaJitterStatsRTTSum2High", "nqaJitterStatsRTTMin", "nqaJitterStatsRTTMax", "nqaJitterStatsPacketOutOfSequences", "nqaJitterStatsErrors", "nqaJitterStatsBusies", "nqaJitterStatsTimeouts", "nqaJitterStatsDrops", "nqaJitterStatsProbeResponses", "nqaJitterStatsSentProbes", "nqaJitterStatsMaxDelaySD", "nqaJitterStatsMaxDelayDS", "nqaJitterStatsJitterOut", "nqaJitterStatsJitterIn", "nqaJitterStatsOWSumSD", "nqaJitterStatsOWSumDS"],
    fieldOids: ["nqaAdminParaTargetAddressType": "1.3.6.1.4.1.2011.5.25.111.2.2.1.1", "nqaAdminParaTargetAddress": "1.3.6.1.4.1.2011.5.25.111.2.2.1.2", "nqaScheduleOperStatus": "1.3.6.1.4.1.2011.5.25.111.2.3.1.9", "nqaJitterStatsRTTSum": "1.3.6.1.4.1.2011.5.25.111.4.3.1.5", "nqaJitterStatsRTTSum2Low": "1.3.6.1.4.1.2011.5.25.111.4.3.1.6", "nqaJitterStatsRTTSum2High": "1.3.6.1.4.1.2011.5.25.111.4.3.1.7", "nqaJitterStatsRTTMin": "1.3.6.1.4.1.2011.5.25.111.4.3.1.8", "nqaJitterStatsRTTMax": "1.3.6.1.4.1.2011.5.25.111.4.3.1.9", "nqaJitterStatsPacketOutOfSequences": "1.3.6.1.4.1.2011.5.25.111.4.3.1.36", "nqaJitterStatsErrors": "1.3.6.1.4.1.2011.5.25.111.4.3.1.37", "nqaJitterStatsBusies": "1.3.6.1.4.1.2011.5.25.111.4.3.1.38", "nqaJitterStatsTimeouts": "1.3.6.1.4.1.2011.5.25.111.4.3.1.39", "nqaJitterStatsDrops": "1.3.6.1.4.1.2011.5.25.111.4.3.1.42", "nqaJitterStatsProbeResponses": "1.3.6.1.4.1.2011.5.25.111.4.3.1.40", "nqaJitterStatsSentProbes": "1.3.6.1.4.1.2011.5.25.111.4.3.1.41", "nqaJitterStatsMaxDelaySD": "1.3.6.1.4.1.2011.5.25.111.4.3.1.44", "nqaJitterStatsMaxDelayDS": "1.3.6.1.4.1.2011.5.25.111.4.3.1.45", "nqaJitterStatsJitterOut": "1.3.6.1.4.1.2011.5.25.111.4.3.1.51", "nqaJitterStatsJitterIn": "1.3.6.1.4.1.2011.5.25.111.4.3.1.52", "nqaJitterStatsOWSumSD": "1.3.6.1.4.1.2011.5.25.111.4.3.1.56", "nqaJitterStatsOWSumDS": "1.3.6.1.4.1.2011.5.25.111.4.3.1.57"]
]

// --- nqaJitterStatsTestCompleted (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.111.6.11
// Fields: nqaAdminParaTargetAddressType, nqaAdminParaTargetAddress, nqaScheduleOperStatus, nqaJitterStatsRTTSum, nqaJitterStatsRTTSum2Low, nqaJitterStatsRTTSum2High, nqaJitterStatsRTTMin, nqaJitterStatsRTTMax, nqaJitterStatsPacketOutOfSequences, nqaJitterStatsErrors, nqaJitterStatsBusies, nqaJitterStatsTimeouts, nqaJitterStatsDrops, nqaJitterStatsProbeResponses, nqaJitterStatsSentProbes, nqaJitterStatsMaxDelaySD, nqaJitterStatsMaxDelayDS, nqaJitterStatsJitterOut, nqaJitterStatsJitterIn, nqaJitterStatsOWSumSD, nqaJitterStatsOWSumDS
// Description: Generated at the completion of a Jitter test when the corresponding nqaAdminParaTrapGeneration object is set to testCompletion(2). (Only for Jitter,ICMPJitter,LSPJitter,GMACPing,MACPing,vplspwping)
trapMap["1.3.6.1.4.1.2011.5.25.111.6.11"] = [
    name: "nqaJitterStatsTestCompleted",
    fields: ["nqaAdminParaTargetAddressType", "nqaAdminParaTargetAddress", "nqaScheduleOperStatus", "nqaJitterStatsRTTSum", "nqaJitterStatsRTTSum2Low", "nqaJitterStatsRTTSum2High", "nqaJitterStatsRTTMin", "nqaJitterStatsRTTMax", "nqaJitterStatsPacketOutOfSequences", "nqaJitterStatsErrors", "nqaJitterStatsBusies", "nqaJitterStatsTimeouts", "nqaJitterStatsDrops", "nqaJitterStatsProbeResponses", "nqaJitterStatsSentProbes", "nqaJitterStatsMaxDelaySD", "nqaJitterStatsMaxDelayDS", "nqaJitterStatsJitterOut", "nqaJitterStatsJitterIn", "nqaJitterStatsOWSumSD", "nqaJitterStatsOWSumDS"],
    fieldOids: ["nqaAdminParaTargetAddressType": "1.3.6.1.4.1.2011.5.25.111.2.2.1.1", "nqaAdminParaTargetAddress": "1.3.6.1.4.1.2011.5.25.111.2.2.1.2", "nqaScheduleOperStatus": "1.3.6.1.4.1.2011.5.25.111.2.3.1.9", "nqaJitterStatsRTTSum": "1.3.6.1.4.1.2011.5.25.111.4.3.1.5", "nqaJitterStatsRTTSum2Low": "1.3.6.1.4.1.2011.5.25.111.4.3.1.6", "nqaJitterStatsRTTSum2High": "1.3.6.1.4.1.2011.5.25.111.4.3.1.7", "nqaJitterStatsRTTMin": "1.3.6.1.4.1.2011.5.25.111.4.3.1.8", "nqaJitterStatsRTTMax": "1.3.6.1.4.1.2011.5.25.111.4.3.1.9", "nqaJitterStatsPacketOutOfSequences": "1.3.6.1.4.1.2011.5.25.111.4.3.1.36", "nqaJitterStatsErrors": "1.3.6.1.4.1.2011.5.25.111.4.3.1.37", "nqaJitterStatsBusies": "1.3.6.1.4.1.2011.5.25.111.4.3.1.38", "nqaJitterStatsTimeouts": "1.3.6.1.4.1.2011.5.25.111.4.3.1.39", "nqaJitterStatsDrops": "1.3.6.1.4.1.2011.5.25.111.4.3.1.42", "nqaJitterStatsProbeResponses": "1.3.6.1.4.1.2011.5.25.111.4.3.1.40", "nqaJitterStatsSentProbes": "1.3.6.1.4.1.2011.5.25.111.4.3.1.41", "nqaJitterStatsMaxDelaySD": "1.3.6.1.4.1.2011.5.25.111.4.3.1.44", "nqaJitterStatsMaxDelayDS": "1.3.6.1.4.1.2011.5.25.111.4.3.1.45", "nqaJitterStatsJitterOut": "1.3.6.1.4.1.2011.5.25.111.4.3.1.51", "nqaJitterStatsJitterIn": "1.3.6.1.4.1.2011.5.25.111.4.3.1.52", "nqaJitterStatsOWSumSD": "1.3.6.1.4.1.2011.5.25.111.4.3.1.56", "nqaJitterStatsOWSumDS": "1.3.6.1.4.1.2011.5.25.111.4.3.1.57"]
]

// --- nqaFTPStatsProbeFailed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.111.6.12
// Fields: nqaAdminParaTargetAddressType, nqaAdminParaTargetAddress, nqaScheduleOperStatus, nqaFTPStatsCtrlConnMaxTime, nqaFTPStatsDataConnMaxTime, nqaFTPStatsConnectSumTimeMax, nqaFTPStatsErrors, nqaFTPStatsTimeouts, nqaFTPStatsProbeResponses, nqaFTPStatsSendProbes
// Description: Generated when a probe failure is detected when the corresponding nqaAdminParaTrapGeneration object is set to probeFailure(0) subject to the value of nqaAdminParaTrapProbeFailureFilter. The object nqa...
trapMap["1.3.6.1.4.1.2011.5.25.111.6.12"] = [
    name: "nqaFTPStatsProbeFailed",
    fields: ["nqaAdminParaTargetAddressType", "nqaAdminParaTargetAddress", "nqaScheduleOperStatus", "nqaFTPStatsCtrlConnMaxTime", "nqaFTPStatsDataConnMaxTime", "nqaFTPStatsConnectSumTimeMax", "nqaFTPStatsErrors", "nqaFTPStatsTimeouts", "nqaFTPStatsProbeResponses", "nqaFTPStatsSendProbes"],
    fieldOids: ["nqaAdminParaTargetAddressType": "1.3.6.1.4.1.2011.5.25.111.2.2.1.1", "nqaAdminParaTargetAddress": "1.3.6.1.4.1.2011.5.25.111.2.2.1.2", "nqaScheduleOperStatus": "1.3.6.1.4.1.2011.5.25.111.2.3.1.9", "nqaFTPStatsCtrlConnMaxTime": "1.3.6.1.4.1.2011.5.25.111.4.4.1.4", "nqaFTPStatsDataConnMaxTime": "1.3.6.1.4.1.2011.5.25.111.4.4.1.7", "nqaFTPStatsConnectSumTimeMax": "1.3.6.1.4.1.2011.5.25.111.4.4.1.10", "nqaFTPStatsErrors": "1.3.6.1.4.1.2011.5.25.111.4.4.1.14", "nqaFTPStatsTimeouts": "1.3.6.1.4.1.2011.5.25.111.4.4.1.15", "nqaFTPStatsProbeResponses": "1.3.6.1.4.1.2011.5.25.111.4.4.1.17", "nqaFTPStatsSendProbes": "1.3.6.1.4.1.2011.5.25.111.4.4.1.18"]
]

// --- nqaFTPStatsTestFailed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.111.6.13
// Fields: nqaAdminParaTargetAddressType, nqaAdminParaTargetAddress, nqaScheduleOperStatus, nqaFTPStatsCtrlConnMaxTime, nqaFTPStatsDataConnMaxTime, nqaFTPStatsConnectSumTimeMax, nqaFTPStatsErrors, nqaFTPStatsTimeouts, nqaFTPStatsProbeResponses, nqaFTPStatsSendProbes
// Description: Generated when a FTP test is determined to have failed when the corresponding nqaAdminParaTrapGeneration object is set to testFailure(1). In this instance nqaAdminParaTrapTestFailureFilter should spec...
trapMap["1.3.6.1.4.1.2011.5.25.111.6.13"] = [
    name: "nqaFTPStatsTestFailed",
    fields: ["nqaAdminParaTargetAddressType", "nqaAdminParaTargetAddress", "nqaScheduleOperStatus", "nqaFTPStatsCtrlConnMaxTime", "nqaFTPStatsDataConnMaxTime", "nqaFTPStatsConnectSumTimeMax", "nqaFTPStatsErrors", "nqaFTPStatsTimeouts", "nqaFTPStatsProbeResponses", "nqaFTPStatsSendProbes"],
    fieldOids: ["nqaAdminParaTargetAddressType": "1.3.6.1.4.1.2011.5.25.111.2.2.1.1", "nqaAdminParaTargetAddress": "1.3.6.1.4.1.2011.5.25.111.2.2.1.2", "nqaScheduleOperStatus": "1.3.6.1.4.1.2011.5.25.111.2.3.1.9", "nqaFTPStatsCtrlConnMaxTime": "1.3.6.1.4.1.2011.5.25.111.4.4.1.4", "nqaFTPStatsDataConnMaxTime": "1.3.6.1.4.1.2011.5.25.111.4.4.1.7", "nqaFTPStatsConnectSumTimeMax": "1.3.6.1.4.1.2011.5.25.111.4.4.1.10", "nqaFTPStatsErrors": "1.3.6.1.4.1.2011.5.25.111.4.4.1.14", "nqaFTPStatsTimeouts": "1.3.6.1.4.1.2011.5.25.111.4.4.1.15", "nqaFTPStatsProbeResponses": "1.3.6.1.4.1.2011.5.25.111.4.4.1.17", "nqaFTPStatsSendProbes": "1.3.6.1.4.1.2011.5.25.111.4.4.1.18"]
]

// --- nqaFTPStatsTestCompleted (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.111.6.14
// Fields: nqaAdminParaTargetAddressType, nqaAdminParaTargetAddress, nqaScheduleOperStatus, nqaFTPStatsCtrlConnMaxTime, nqaFTPStatsDataConnMaxTime, nqaFTPStatsConnectSumTimeMax, nqaFTPStatsErrors, nqaFTPStatsTimeouts, nqaFTPStatsProbeResponses, nqaFTPStatsSendProbes
// Description: Generated at the completion of a FTP test when the corresponding nqaAdminParaTrapGeneration object is set to testCompletion(2). (Only for FTP)
trapMap["1.3.6.1.4.1.2011.5.25.111.6.14"] = [
    name: "nqaFTPStatsTestCompleted",
    fields: ["nqaAdminParaTargetAddressType", "nqaAdminParaTargetAddress", "nqaScheduleOperStatus", "nqaFTPStatsCtrlConnMaxTime", "nqaFTPStatsDataConnMaxTime", "nqaFTPStatsConnectSumTimeMax", "nqaFTPStatsErrors", "nqaFTPStatsTimeouts", "nqaFTPStatsProbeResponses", "nqaFTPStatsSendProbes"],
    fieldOids: ["nqaAdminParaTargetAddressType": "1.3.6.1.4.1.2011.5.25.111.2.2.1.1", "nqaAdminParaTargetAddress": "1.3.6.1.4.1.2011.5.25.111.2.2.1.2", "nqaScheduleOperStatus": "1.3.6.1.4.1.2011.5.25.111.2.3.1.9", "nqaFTPStatsCtrlConnMaxTime": "1.3.6.1.4.1.2011.5.25.111.4.4.1.4", "nqaFTPStatsDataConnMaxTime": "1.3.6.1.4.1.2011.5.25.111.4.4.1.7", "nqaFTPStatsConnectSumTimeMax": "1.3.6.1.4.1.2011.5.25.111.4.4.1.10", "nqaFTPStatsErrors": "1.3.6.1.4.1.2011.5.25.111.4.4.1.14", "nqaFTPStatsTimeouts": "1.3.6.1.4.1.2011.5.25.111.4.4.1.15", "nqaFTPStatsProbeResponses": "1.3.6.1.4.1.2011.5.25.111.4.4.1.17", "nqaFTPStatsSendProbes": "1.3.6.1.4.1.2011.5.25.111.4.4.1.18"]
]

// --- nqaFTPStatsThresholdNotification (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.111.6.15
// Fields: nqaAdminParaTargetAddressType, nqaAdminParaTargetAddress, nqaAdminCtrlThreshold1, nqaAdminCtrlThreshold2, nqaFTPStatsCtrlConnMaxTime, nqaFTPStatsDataConnMaxTime, nqaFTPStatsRTDOverThresholds
// Description: If the time of executing tests exceeds the nqaAdminCtrlThreshold1 or nqaAdminCtrlThreshold2, the system sends trap information.(Only for FTP)
trapMap["1.3.6.1.4.1.2011.5.25.111.6.15"] = [
    name: "nqaFTPStatsThresholdNotification",
    fields: ["nqaAdminParaTargetAddressType", "nqaAdminParaTargetAddress", "nqaAdminCtrlThreshold1", "nqaAdminCtrlThreshold2", "nqaFTPStatsCtrlConnMaxTime", "nqaFTPStatsDataConnMaxTime", "nqaFTPStatsRTDOverThresholds"],
    fieldOids: ["nqaAdminParaTargetAddressType": "1.3.6.1.4.1.2011.5.25.111.2.2.1.1", "nqaAdminParaTargetAddress": "1.3.6.1.4.1.2011.5.25.111.2.2.1.2", "nqaAdminCtrlThreshold1": "1.3.6.1.4.1.2011.5.25.111.2.1.1.7", "nqaAdminCtrlThreshold2": "1.3.6.1.4.1.2011.5.25.111.2.1.1.8", "nqaFTPStatsCtrlConnMaxTime": "1.3.6.1.4.1.2011.5.25.111.4.4.1.4", "nqaFTPStatsDataConnMaxTime": "1.3.6.1.4.1.2011.5.25.111.4.4.1.7", "nqaFTPStatsRTDOverThresholds": "1.3.6.1.4.1.2011.5.25.111.4.4.1.3"]
]

// --- nqaJitterStatsRTDThresholdNotification (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.111.6.16
// Fields: nqaAdminParaTargetAddressType, nqaAdminParaTargetAddress, nqaAdminCtrlThreshold1, nqaJitterStatsRTTMax, nqaJitterStatsMaxDelaySD, nqaJitterStatsMaxDelayDS, nqaJitterStatsRTDOverThresholds
// Description: If the time of executing tests exceeds the nqaAdminCtrlThreshold1, the system sends trap information. (Only for jitter,ICMPJitter,LSPJitter,GMACPing,MACPing,vplspwping)
trapMap["1.3.6.1.4.1.2011.5.25.111.6.16"] = [
    name: "nqaJitterStatsRTDThresholdNotification",
    fields: ["nqaAdminParaTargetAddressType", "nqaAdminParaTargetAddress", "nqaAdminCtrlThreshold1", "nqaJitterStatsRTTMax", "nqaJitterStatsMaxDelaySD", "nqaJitterStatsMaxDelayDS", "nqaJitterStatsRTDOverThresholds"],
    fieldOids: ["nqaAdminParaTargetAddressType": "1.3.6.1.4.1.2011.5.25.111.2.2.1.1", "nqaAdminParaTargetAddress": "1.3.6.1.4.1.2011.5.25.111.2.2.1.2", "nqaAdminCtrlThreshold1": "1.3.6.1.4.1.2011.5.25.111.2.1.1.7", "nqaJitterStatsRTTMax": "1.3.6.1.4.1.2011.5.25.111.4.3.1.9", "nqaJitterStatsMaxDelaySD": "1.3.6.1.4.1.2011.5.25.111.4.3.1.44", "nqaJitterStatsMaxDelayDS": "1.3.6.1.4.1.2011.5.25.111.4.3.1.45", "nqaJitterStatsRTDOverThresholds": "1.3.6.1.4.1.2011.5.25.111.4.3.1.3"]
]

// --- nqaJitterStatsOWDThresholdNotificationSD (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.111.6.17
// Fields: nqaAdminParaTargetAddressType, nqaAdminParaTargetAddress, nqaAdminCtrlThreshold2, nqaJitterStatsRTTMax, nqaJitterStatsMaxDelaySD, nqaJitterStatsMaxDelayDS, nqaJitterStatsOWDOverThresholdsSD
// Description: If the time of executing tests exceeds the nqaAdminCtrlThreshold2 the system sends trap information. (Only for jitter,ICMPJitter,LSPJitter,GMACPing,MACPing)
trapMap["1.3.6.1.4.1.2011.5.25.111.6.17"] = [
    name: "nqaJitterStatsOWDThresholdNotificationSD",
    fields: ["nqaAdminParaTargetAddressType", "nqaAdminParaTargetAddress", "nqaAdminCtrlThreshold2", "nqaJitterStatsRTTMax", "nqaJitterStatsMaxDelaySD", "nqaJitterStatsMaxDelayDS", "nqaJitterStatsOWDOverThresholdsSD"],
    fieldOids: ["nqaAdminParaTargetAddressType": "1.3.6.1.4.1.2011.5.25.111.2.2.1.1", "nqaAdminParaTargetAddress": "1.3.6.1.4.1.2011.5.25.111.2.2.1.2", "nqaAdminCtrlThreshold2": "1.3.6.1.4.1.2011.5.25.111.2.1.1.8", "nqaJitterStatsRTTMax": "1.3.6.1.4.1.2011.5.25.111.4.3.1.9", "nqaJitterStatsMaxDelaySD": "1.3.6.1.4.1.2011.5.25.111.4.3.1.44", "nqaJitterStatsMaxDelayDS": "1.3.6.1.4.1.2011.5.25.111.4.3.1.45", "nqaJitterStatsOWDOverThresholdsSD": "1.3.6.1.4.1.2011.5.25.111.4.3.1.53"]
]

// --- nqaJitterStatsOWDThresholdNotificationDS (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.111.6.18
// Fields: nqaAdminParaTargetAddressType, nqaAdminParaTargetAddress, nqaAdminCtrlThreshold3, nqaJitterStatsRTTMax, nqaJitterStatsMaxDelaySD, nqaJitterStatsMaxDelayDS, nqaJitterStatsOWDOverThresholdsDS
// Description: If the time of executing tests exceeds the nqaAdminCtrlThreshold3 the system sends trap information. (Only for jitter,ICMPJitter,LSPJitter,GMACPing,MACPing)
trapMap["1.3.6.1.4.1.2011.5.25.111.6.18"] = [
    name: "nqaJitterStatsOWDThresholdNotificationDS",
    fields: ["nqaAdminParaTargetAddressType", "nqaAdminParaTargetAddress", "nqaAdminCtrlThreshold3", "nqaJitterStatsRTTMax", "nqaJitterStatsMaxDelaySD", "nqaJitterStatsMaxDelayDS", "nqaJitterStatsOWDOverThresholdsDS"],
    fieldOids: ["nqaAdminParaTargetAddressType": "1.3.6.1.4.1.2011.5.25.111.2.2.1.1", "nqaAdminParaTargetAddress": "1.3.6.1.4.1.2011.5.25.111.2.2.1.2", "nqaAdminCtrlThreshold3": "1.3.6.1.4.1.2011.5.25.111.2.1.1.9", "nqaJitterStatsRTTMax": "1.3.6.1.4.1.2011.5.25.111.4.3.1.9", "nqaJitterStatsMaxDelaySD": "1.3.6.1.4.1.2011.5.25.111.4.3.1.44", "nqaJitterStatsMaxDelayDS": "1.3.6.1.4.1.2011.5.25.111.4.3.1.45", "nqaJitterStatsOWDOverThresholdsDS": "1.3.6.1.4.1.2011.5.25.111.4.3.1.58"]
]

// --- nqaNegotiateFailed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.111.6.19
// Fields: nqaAdminParaTargetAddressType, nqaAdminParaTargetAddress, nqaAdminParaTargetPort, nqaAdminParaVrfName
// Description: If negotiation between client and server failed,the system sends trap information.
trapMap["1.3.6.1.4.1.2011.5.25.111.6.19"] = [
    name: "nqaNegotiateFailed",
    fields: ["nqaAdminParaTargetAddressType", "nqaAdminParaTargetAddress", "nqaAdminParaTargetPort", "nqaAdminParaVrfName"],
    fieldOids: ["nqaAdminParaTargetAddressType": "1.3.6.1.4.1.2011.5.25.111.2.2.1.1", "nqaAdminParaTargetAddress": "1.3.6.1.4.1.2011.5.25.111.2.2.1.2", "nqaAdminParaTargetPort": "1.3.6.1.4.1.2011.5.25.111.2.2.1.3", "nqaAdminParaVrfName": "1.3.6.1.4.1.2011.5.25.111.2.2.1.34"]
]

// --- nqaRisingAlarmNotification (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.111.6.20
// Fields: nqaAlarmVariable, nqaAlarmSampleType, nqaAlarmValue, nqaAlarmRisingThreshold, nqaAlarmDescription
// Description: Sending trap messages when the value of the monitored object exceeds nqaAlarmUpperThreshold.
trapMap["1.3.6.1.4.1.2011.5.25.111.6.20"] = [
    name: "nqaRisingAlarmNotification",
    fields: ["nqaAlarmVariable", "nqaAlarmSampleType", "nqaAlarmValue", "nqaAlarmRisingThreshold", "nqaAlarmDescription"],
    fieldOids: ["nqaAlarmVariable": "1.3.6.1.4.1.2011.5.25.111.9.3.1.11", "nqaAlarmSampleType": "1.3.6.1.4.1.2011.5.25.111.9.3.1.12", "nqaAlarmValue": "1.3.6.1.4.1.2011.5.25.111.9.3.1.13", "nqaAlarmRisingThreshold": "1.3.6.1.4.1.2011.5.25.111.9.3.1.15", "nqaAlarmDescription": "1.3.6.1.4.1.2011.5.25.111.9.3.1.19"]
]

// --- nqaFallingAlarmNotification (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.111.6.21
// Fields: nqaAlarmVariable, nqaAlarmSampleType, nqaAlarmValue, nqaAlarmFallingThreshold, nqaAlarmDescription
// Description: Sending trap messages when the value of the monitored object is under nqaAlarmLowerThreshold.
trapMap["1.3.6.1.4.1.2011.5.25.111.6.21"] = [
    name: "nqaFallingAlarmNotification",
    fields: ["nqaAlarmVariable", "nqaAlarmSampleType", "nqaAlarmValue", "nqaAlarmFallingThreshold", "nqaAlarmDescription"],
    fieldOids: ["nqaAlarmVariable": "1.3.6.1.4.1.2011.5.25.111.9.3.1.11", "nqaAlarmSampleType": "1.3.6.1.4.1.2011.5.25.111.9.3.1.12", "nqaAlarmValue": "1.3.6.1.4.1.2011.5.25.111.9.3.1.13", "nqaAlarmFallingThreshold": "1.3.6.1.4.1.2011.5.25.111.9.3.1.16", "nqaAlarmDescription": "1.3.6.1.4.1.2011.5.25.111.9.3.1.19"]
]

// --- nqaFtpSaveRecordNotification (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.111.6.22
// Fields: nqaFtpSaveRecordLastFileName
// Description: Sending trap messages when saving a test result to the FTP server is completed.
trapMap["1.3.6.1.4.1.2011.5.25.111.6.22"] = [
    name: "nqaFtpSaveRecordNotification",
    fields: ["nqaFtpSaveRecordLastFileName"],
    fieldOids: ["nqaFtpSaveRecordLastFileName": "1.3.6.1.4.1.2011.5.25.111.10.10"]
]

// --- nqaPppoeStatsTestFailed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.111.6.23
// Fields: nqaPppoeStatsCompletions, nqaPppoeStatsCurrentPhase, nqaPppoeStatsErrorMessage, nqaPppoeDiscoveryTimeout, nqaPppoeLcpTimeout, nqaPppoeAuthorizationTimeout, nqaPppoeNcpTimeout, nqaPppoeConnectionTime, nqaPppoeClientSessionId, nqaPppoeClientIpAddress, nqaPppoeGatewayIpAddress
// Description: Generated when a PPPoE test is determined to have failed when the corresponding nqaAdminParaTrapGeneration object is set to testFailure(1). (Only for PPPoE))
trapMap["1.3.6.1.4.1.2011.5.25.111.6.23"] = [
    name: "nqaPppoeStatsTestFailed",
    fields: ["nqaPppoeStatsCompletions", "nqaPppoeStatsCurrentPhase", "nqaPppoeStatsErrorMessage", "nqaPppoeDiscoveryTimeout", "nqaPppoeLcpTimeout", "nqaPppoeAuthorizationTimeout", "nqaPppoeNcpTimeout", "nqaPppoeConnectionTime", "nqaPppoeClientSessionId", "nqaPppoeClientIpAddress", "nqaPppoeGatewayIpAddress"],
    fieldOids: ["nqaPppoeStatsCompletions": "1.3.6.1.4.1.2011.5.25.111.4.9.1.3", "nqaPppoeStatsCurrentPhase": "1.3.6.1.4.1.2011.5.25.111.4.9.1.4", "nqaPppoeStatsErrorMessage": "1.3.6.1.4.1.2011.5.25.111.4.9.1.5", "nqaPppoeDiscoveryTimeout": "1.3.6.1.4.1.2011.5.25.111.4.9.1.6", "nqaPppoeLcpTimeout": "1.3.6.1.4.1.2011.5.25.111.4.9.1.7", "nqaPppoeAuthorizationTimeout": "1.3.6.1.4.1.2011.5.25.111.4.9.1.8", "nqaPppoeNcpTimeout": "1.3.6.1.4.1.2011.5.25.111.4.9.1.9", "nqaPppoeConnectionTime": "1.3.6.1.4.1.2011.5.25.111.4.9.1.10", "nqaPppoeClientSessionId": "1.3.6.1.4.1.2011.5.25.111.4.9.1.11", "nqaPppoeClientIpAddress": "1.3.6.1.4.1.2011.5.25.111.4.9.1.12", "nqaPppoeGatewayIpAddress": "1.3.6.1.4.1.2011.5.25.111.4.9.1.13"]
]

// --- nqaPppoeStatsTestCompleted (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.111.6.24
// Fields: nqaPppoeStatsCompletions, nqaPppoeStatsCurrentPhase, nqaPppoeStatsErrorMessage, nqaPppoeDiscoveryTimeout, nqaPppoeLcpTimeout, nqaPppoeAuthorizationTimeout, nqaPppoeNcpTimeout, nqaPppoeConnectionTime, nqaPppoeClientSessionId, nqaPppoeClientIpAddress, nqaPppoeGatewayIpAddress
// Description: Generated at the completion of a PPPoE test when the corresponding nqaAdminParaTrapGeneration object is set to testCompletion(2). (Only for PPPoE)
trapMap["1.3.6.1.4.1.2011.5.25.111.6.24"] = [
    name: "nqaPppoeStatsTestCompleted",
    fields: ["nqaPppoeStatsCompletions", "nqaPppoeStatsCurrentPhase", "nqaPppoeStatsErrorMessage", "nqaPppoeDiscoveryTimeout", "nqaPppoeLcpTimeout", "nqaPppoeAuthorizationTimeout", "nqaPppoeNcpTimeout", "nqaPppoeConnectionTime", "nqaPppoeClientSessionId", "nqaPppoeClientIpAddress", "nqaPppoeGatewayIpAddress"],
    fieldOids: ["nqaPppoeStatsCompletions": "1.3.6.1.4.1.2011.5.25.111.4.9.1.3", "nqaPppoeStatsCurrentPhase": "1.3.6.1.4.1.2011.5.25.111.4.9.1.4", "nqaPppoeStatsErrorMessage": "1.3.6.1.4.1.2011.5.25.111.4.9.1.5", "nqaPppoeDiscoveryTimeout": "1.3.6.1.4.1.2011.5.25.111.4.9.1.6", "nqaPppoeLcpTimeout": "1.3.6.1.4.1.2011.5.25.111.4.9.1.7", "nqaPppoeAuthorizationTimeout": "1.3.6.1.4.1.2011.5.25.111.4.9.1.8", "nqaPppoeNcpTimeout": "1.3.6.1.4.1.2011.5.25.111.4.9.1.9", "nqaPppoeConnectionTime": "1.3.6.1.4.1.2011.5.25.111.4.9.1.10", "nqaPppoeClientSessionId": "1.3.6.1.4.1.2011.5.25.111.4.9.1.11", "nqaPppoeClientIpAddress": "1.3.6.1.4.1.2011.5.25.111.4.9.1.12", "nqaPppoeGatewayIpAddress": "1.3.6.1.4.1.2011.5.25.111.4.9.1.13"]
]

// --- nqaJitterStatsJitterThresholdNotificationSD (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.111.6.25
// Fields: nqaAdminParaTargetAddressType, nqaAdminParaTargetAddress, nqaAdminCtrlJitterThresholdSD, nqaJitterStatsRTTMax, nqaJitterStatsMaxDelaySD, nqaJitterStatsMaxDelayDS, nqaJitterStatsJitterOverThresholdsSD
// Description: If the time of executing tests exceeds the nqaAdminCtrlJitterThresholdSD the system sends trap information. (Only for jitter)
trapMap["1.3.6.1.4.1.2011.5.25.111.6.25"] = [
    name: "nqaJitterStatsJitterThresholdNotificationSD",
    fields: ["nqaAdminParaTargetAddressType", "nqaAdminParaTargetAddress", "nqaAdminCtrlJitterThresholdSD", "nqaJitterStatsRTTMax", "nqaJitterStatsMaxDelaySD", "nqaJitterStatsMaxDelayDS", "nqaJitterStatsJitterOverThresholdsSD"],
    fieldOids: ["nqaAdminParaTargetAddressType": "1.3.6.1.4.1.2011.5.25.111.2.2.1.1", "nqaAdminParaTargetAddress": "1.3.6.1.4.1.2011.5.25.111.2.2.1.2", "nqaAdminCtrlJitterThresholdSD": "1.3.6.1.4.1.2011.5.25.111.2.1.1.11", "nqaJitterStatsRTTMax": "1.3.6.1.4.1.2011.5.25.111.4.3.1.9", "nqaJitterStatsMaxDelaySD": "1.3.6.1.4.1.2011.5.25.111.4.3.1.44", "nqaJitterStatsMaxDelayDS": "1.3.6.1.4.1.2011.5.25.111.4.3.1.45", "nqaJitterStatsJitterOverThresholdsSD": "1.3.6.1.4.1.2011.5.25.111.4.3.1.76"]
]

// --- nqaJitterStatsJitterThresholdNotificationDS (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.111.6.26
// Fields: nqaAdminParaTargetAddressType, nqaAdminParaTargetAddress, nqaAdminCtrlJitterThresholdDS, nqaJitterStatsRTTMax, nqaJitterStatsMaxDelaySD, nqaJitterStatsMaxDelayDS, nqaJitterStatsJitterOverThresholdsDS
// Description: If the time of executing tests exceeds the nqaAdminCtrlJitterThresholdDS the system sends trap information. (Only for jitter)
trapMap["1.3.6.1.4.1.2011.5.25.111.6.26"] = [
    name: "nqaJitterStatsJitterThresholdNotificationDS",
    fields: ["nqaAdminParaTargetAddressType", "nqaAdminParaTargetAddress", "nqaAdminCtrlJitterThresholdDS", "nqaJitterStatsRTTMax", "nqaJitterStatsMaxDelaySD", "nqaJitterStatsMaxDelayDS", "nqaJitterStatsJitterOverThresholdsDS"],
    fieldOids: ["nqaAdminParaTargetAddressType": "1.3.6.1.4.1.2011.5.25.111.2.2.1.1", "nqaAdminParaTargetAddress": "1.3.6.1.4.1.2011.5.25.111.2.2.1.2", "nqaAdminCtrlJitterThresholdDS": "1.3.6.1.4.1.2011.5.25.111.2.1.1.12", "nqaJitterStatsRTTMax": "1.3.6.1.4.1.2011.5.25.111.4.3.1.9", "nqaJitterStatsMaxDelaySD": "1.3.6.1.4.1.2011.5.25.111.4.3.1.44", "nqaJitterStatsMaxDelayDS": "1.3.6.1.4.1.2011.5.25.111.4.3.1.45", "nqaJitterStatsJitterOverThresholdsDS": "1.3.6.1.4.1.2011.5.25.111.4.3.1.77"]
]

// --- nqaReflectorStateChangeNotification (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.111.6.27
// Fields: nqaReflectorID, nqaReflectorState
// Description: If the status of the reflector changes, the system sends trap information (only for the reflector).
trapMap["1.3.6.1.4.1.2011.5.25.111.6.27"] = [
    name: "nqaReflectorStateChangeNotification",
    fields: ["nqaReflectorID", "nqaReflectorState"],
    fieldOids: ["nqaReflectorID": "1.3.6.1.4.1.2011.5.25.111.11.1.1.1", "nqaReflectorState": "1.3.6.1.4.1.2011.5.25.111.11.1.1.13"]
]

// --- nqaResultsTestResultChange (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.111.6.28
// Fields: nqaResultsCompletions, nqaResultsCompletions
// Description: If the test result changes, the system sends trap information.
trapMap["1.3.6.1.4.1.2011.5.25.111.6.28"] = [
    name: "nqaResultsTestResultChange",
    fields: ["nqaResultsCompletions", "nqaResultsCompletions"],
    fieldOids: ["nqaResultsCompletions": "1.3.6.1.4.1.2011.5.25.111.4.1.1.3"]
]

// --- nqaResultsTestResultChangePackedNotification (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.111.6.29
// Fields: nqaResultChangeRecord
// Description: If the test result changes, the system sends packed trap information. No more than two traps will be sent in one second and each trap contains at most ten records.
trapMap["1.3.6.1.4.1.2011.5.25.111.6.29"] = [
    name: "nqaResultsTestResultChangePackedNotification",
    fields: ["nqaResultChangeRecord"],
    fieldOids: ["nqaResultChangeRecord": "1.3.6.1.4.1.2011.5.25.111.4.1.1.29"]
]

// --- nqaResultsTestResultStatusChange (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.111.6.30
// Fields: nqaResultsTestType, nqaResultsSourceIP, nqaResultsSourceIfName, nqaResultsDestinationIP, nqaResultsLastCompletions, nqaResultsCompletions, nqaResultsChangeToFailureTimes, nqaResultsChangeToSuccessTimes, nqaResultsChangeToNoResultTimes, nqaResultsChangeToNegotiationFailureTimes, nqaResultsChangeToAbnormalTimes, nqaResultsFailureTimes, nqaResultsSuccessTimes, nqaResultsNoResultTimes, nqaResultsNegotiationFailureTimes, nqaResultsAbnormalTimes
// Description: If the test result changes, the system sends trap information.
trapMap["1.3.6.1.4.1.2011.5.25.111.6.30"] = [
    name: "nqaResultsTestResultStatusChange",
    fields: ["nqaResultsTestType", "nqaResultsSourceIP", "nqaResultsSourceIfName", "nqaResultsDestinationIP", "nqaResultsLastCompletions", "nqaResultsCompletions", "nqaResultsChangeToFailureTimes", "nqaResultsChangeToSuccessTimes", "nqaResultsChangeToNoResultTimes", "nqaResultsChangeToNegotiationFailureTimes", "nqaResultsChangeToAbnormalTimes", "nqaResultsFailureTimes", "nqaResultsSuccessTimes", "nqaResultsNoResultTimes", "nqaResultsNegotiationFailureTimes", "nqaResultsAbnormalTimes"],
    fieldOids: ["nqaResultsTestType": "1.3.6.1.4.1.2011.5.25.111.4.1.1.42", "nqaResultsSourceIP": "1.3.6.1.4.1.2011.5.25.111.4.1.1.43", "nqaResultsSourceIfName": "1.3.6.1.4.1.2011.5.25.111.4.1.1.44", "nqaResultsDestinationIP": "1.3.6.1.4.1.2011.5.25.111.4.1.1.45", "nqaResultsLastCompletions": "1.3.6.1.4.1.2011.5.25.111.4.1.1.41", "nqaResultsCompletions": "1.3.6.1.4.1.2011.5.25.111.4.1.1.3", "nqaResultsChangeToFailureTimes": "1.3.6.1.4.1.2011.5.25.111.4.1.1.31", "nqaResultsChangeToSuccessTimes": "1.3.6.1.4.1.2011.5.25.111.4.1.1.32", "nqaResultsChangeToNoResultTimes": "1.3.6.1.4.1.2011.5.25.111.4.1.1.33", "nqaResultsChangeToNegotiationFailureTimes": "1.3.6.1.4.1.2011.5.25.111.4.1.1.34", "nqaResultsChangeToAbnormalTimes": "1.3.6.1.4.1.2011.5.25.111.4.1.1.35", "nqaResultsFailureTimes": "1.3.6.1.4.1.2011.5.25.111.4.1.1.36", "nqaResultsSuccessTimes": "1.3.6.1.4.1.2011.5.25.111.4.1.1.37", "nqaResultsNoResultTimes": "1.3.6.1.4.1.2011.5.25.111.4.1.1.38", "nqaResultsNegotiationFailureTimes": "1.3.6.1.4.1.2011.5.25.111.4.1.1.39", "nqaResultsAbnormalTimes": "1.3.6.1.4.1.2011.5.25.111.4.1.1.40"]
]

// --- nqaResultsProbeFailedVerbose (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.111.6.31
// Fields: nqaAdminCtrlOwnerIndex, nqaAdminCtrlTestName, nqaAdminCtrlTag, nqaAdminParaTargetAddressType, nqaAdminParaTargetAddress, nqaScheduleOperStatus, nqaResultsAddressType, nqaResultsAddress, nqaResultsCompletionTimeMin, nqaResultsCompletionTimeMax, nqaResultsSumCompletionTime, nqaResultsProbeResponses, nqaResultsSentProbes, nqaResultsSumCompletionTime2Low, nqaResultsSumCompletionTime2High, nqaResultsLastGoodProbe, nqaResultsLastGoodPath
// Description: Generated when a probe failure is detected when the corresponding nqaAdminParaTrapGeneration object is set to probeFailure(0) subject to the value of nqaAdminParaTrapProbeFailureFilter. The object nqa...
trapMap["1.3.6.1.4.1.2011.5.25.111.6.31"] = [
    name: "nqaResultsProbeFailedVerbose",
    fields: ["nqaAdminCtrlOwnerIndex", "nqaAdminCtrlTestName", "nqaAdminCtrlTag", "nqaAdminParaTargetAddressType", "nqaAdminParaTargetAddress", "nqaScheduleOperStatus", "nqaResultsAddressType", "nqaResultsAddress", "nqaResultsCompletionTimeMin", "nqaResultsCompletionTimeMax", "nqaResultsSumCompletionTime", "nqaResultsProbeResponses", "nqaResultsSentProbes", "nqaResultsSumCompletionTime2Low", "nqaResultsSumCompletionTime2High", "nqaResultsLastGoodProbe", "nqaResultsLastGoodPath"],
    fieldOids: ["nqaAdminCtrlOwnerIndex": "1.3.6.1.4.1.2011.5.25.111.2.1.1.1", "nqaAdminCtrlTestName": "1.3.6.1.4.1.2011.5.25.111.2.1.1.2", "nqaAdminCtrlTag": "1.3.6.1.4.1.2011.5.25.111.2.1.1.3", "nqaAdminParaTargetAddressType": "1.3.6.1.4.1.2011.5.25.111.2.2.1.1", "nqaAdminParaTargetAddress": "1.3.6.1.4.1.2011.5.25.111.2.2.1.2", "nqaScheduleOperStatus": "1.3.6.1.4.1.2011.5.25.111.2.3.1.9", "nqaResultsAddressType": "1.3.6.1.4.1.2011.5.25.111.4.1.1.19", "nqaResultsAddress": "1.3.6.1.4.1.2011.5.25.111.4.1.1.20", "nqaResultsCompletionTimeMin": "1.3.6.1.4.1.2011.5.25.111.4.1.1.11", "nqaResultsCompletionTimeMax": "1.3.6.1.4.1.2011.5.25.111.4.1.1.12", "nqaResultsSumCompletionTime": "1.3.6.1.4.1.2011.5.25.111.4.1.1.8", "nqaResultsProbeResponses": "1.3.6.1.4.1.2011.5.25.111.4.1.1.21", "nqaResultsSentProbes": "1.3.6.1.4.1.2011.5.25.111.4.1.1.22", "nqaResultsSumCompletionTime2Low": "1.3.6.1.4.1.2011.5.25.111.4.1.1.9", "nqaResultsSumCompletionTime2High": "1.3.6.1.4.1.2011.5.25.111.4.1.1.10", "nqaResultsLastGoodProbe": "1.3.6.1.4.1.2011.5.25.111.4.1.1.23", "nqaResultsLastGoodPath": "1.3.6.1.4.1.2011.5.25.111.4.1.1.24"]
]

// ===== Parsing logic =====

// Set to true to enable diagnostic logging for this MIB parser
DEBUG = false

LOG_PREFIX = "[NQA-MIB]"
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
