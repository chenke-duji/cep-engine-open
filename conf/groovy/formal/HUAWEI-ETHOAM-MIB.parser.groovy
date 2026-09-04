/**
 * Auto-generated from HUAWEI-ETHOAM-MIB.mib
 * Generated: 2026-08-24T18:28:29.648273600
 * Traps/Notifications (44): hwDot1agCfmFaultAlarm, hwTestMessageFailed, hwTestMessageCompleted, hwDot3ahEfmThresholdEvent, hwDot3ahEfmNonThresholdEvent, hwDot3ahEfmRemoteDyingGaspEvent, hwDot3ahEfmNonThresholdRecovery, hwCfmVlanOnewayDelay, hwCfmVlanOnewayDelayRecovery, hwCfmVlanTwowayDelay, hwCfmVlanTwowayDelayRecovery, hwDot3ahEfmLoopbackFailed, hwY1731AisDefectAlarm, hwY1731AisDefectAlarmRecovery, hwDot1agCfmUnexpectedMEGLevel, hwDot1agCfmUnexpectedMEGLevelCleared, hwDot1agCfmMismerge, hwDot1agCfmMismergeCleared, hwDot1agCfmUnexpectedMEP, hwDot1agCfmUnexpectedMEPCleared, hwDot1agCfmUnexpectedPeriod, hwDot1agCfmUnexpectedPeriodCleared, hwDot1agCfmUnexpectedMAC, hwDot1agCfmUnexpectedMACCleared, hwDot1agCfmLOC, hwDot1agCfmLOCCleared, hwDot1agCfmExceptionalMACStatus, hwDot1agCfmExceptionalMACStatusCleared, hwDot1agCfmRDI, hwDot1agCfmRDICleared, hwY1731AisExceedMaxPktNum, hwY1731AisExceedMaxPktNumCleared, hwY1731LckDefect, hwY1731LckDefectCleared, hwY1731Statistic, hwY1731StatisticClear, hwY1731LckExceedThreshold, hwY1731LckExceedThresholdRecovery, hwY1731TunnelNonSupport, hwY1731TunnelNonSupportResumed, hwY1731TestIdStatistic, hwY1731TestIdStatisticClear, hwY1731PwTrunkNonSupport, hwY1731PwTrunkNonSupportResumed
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

// --- hwDot1agCfmFaultAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.136.1.6.1
// Fields: hwDot1agCfmRMepMacAddress, hwDot1agCfmRMepHighestPrDefect, hwDot1agCfmMdName, hwDot1agCfmMdMdLevel, hwDot1agCfmMaName
// Description: A MEP has lost contact with one or more MEPs. A notification (fault alarm) is sent to the management entity with the OID of the MEP that has detected the fault. Whenever a MEP loses contact with one o...
trapMap["1.3.6.1.4.1.2011.5.25.136.1.6.1"] = [
    name: "hwDot1agCfmFaultAlarm",
    fields: ["hwDot1agCfmRMepMacAddress", "hwDot1agCfmRMepHighestPrDefect", "hwDot1agCfmMdName", "hwDot1agCfmMdMdLevel", "hwDot1agCfmMaName"],
    fieldOids: ["hwDot1agCfmRMepMacAddress": "1.3.6.1.4.1.2011.5.25.136.1.1.6.1.1.2", "hwDot1agCfmRMepHighestPrDefect": "1.3.6.1.4.1.2011.5.25.136.1.1.6.1.1.5", "hwDot1agCfmMdName": "1.3.6.1.4.1.2011.5.25.136.1.1.3.2.1.3", "hwDot1agCfmMdMdLevel": "1.3.6.1.4.1.2011.5.25.136.1.1.3.2.1.4", "hwDot1agCfmMaName": "1.3.6.1.4.1.2011.5.25.136.1.1.4.2.1.2"]
]

// --- hwTestMessageFailed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.136.1.6.2
// Fields: hwTestMessageSendFinished
// Description: The events after tests are reported. 1,2,3,4, and 5 indicate has not run/is running/the previous test terminates normally/the previous test terminate abnormally/the previous test is interrupted. (thro...
trapMap["1.3.6.1.4.1.2011.5.25.136.1.6.2"] = [
    name: "hwTestMessageFailed",
    fields: ["hwTestMessageSendFinished"],
    fieldOids: ["hwTestMessageSendFinished": "1.3.6.1.4.1.2011.5.25.136.1.4.1.2.1.19"]
]

// --- hwTestMessageCompleted (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.136.1.6.3
// Fields: hwTestMessageSendFinished, hwTestMessageResultSendPackets, hwTestMessageResultReceivedPackets, hwTestMessageResultPacketsLost, hwTestMessageResultSendBytes, hwTestMessageResultReceivedBytes, hwTestMessageResultBytesLost, hwTestMessageBeginTimeStamp, hwTestMessageEndTimeStamp
// Description: After the test is complete, report the results to the network management.
trapMap["1.3.6.1.4.1.2011.5.25.136.1.6.3"] = [
    name: "hwTestMessageCompleted",
    fields: ["hwTestMessageSendFinished", "hwTestMessageResultSendPackets", "hwTestMessageResultReceivedPackets", "hwTestMessageResultPacketsLost", "hwTestMessageResultSendBytes", "hwTestMessageResultReceivedBytes", "hwTestMessageResultBytesLost", "hwTestMessageBeginTimeStamp", "hwTestMessageEndTimeStamp"],
    fieldOids: ["hwTestMessageSendFinished": "1.3.6.1.4.1.2011.5.25.136.1.4.1.2.1.19", "hwTestMessageResultSendPackets": "1.3.6.1.4.1.2011.5.25.136.1.4.1.3.1.11", "hwTestMessageResultReceivedPackets": "1.3.6.1.4.1.2011.5.25.136.1.4.1.3.1.12", "hwTestMessageResultPacketsLost": "1.3.6.1.4.1.2011.5.25.136.1.4.1.3.1.13", "hwTestMessageResultSendBytes": "1.3.6.1.4.1.2011.5.25.136.1.4.1.3.1.14", "hwTestMessageResultReceivedBytes": "1.3.6.1.4.1.2011.5.25.136.1.4.1.3.1.15", "hwTestMessageResultBytesLost": "1.3.6.1.4.1.2011.5.25.136.1.4.1.3.1.16", "hwTestMessageBeginTimeStamp": "1.3.6.1.4.1.2011.5.25.136.1.4.1.3.1.17", "hwTestMessageEndTimeStamp": "1.3.6.1.4.1.2011.5.25.136.1.4.1.3.1.18"]
]

// --- hwDot3ahEfmThresholdEvent (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.136.1.6.4
// Fields: hwDot3ahEfmEventLogTimestamp, hwDot3ahEfmEventLogOui, hwDot3ahEfmEventLogType, hwDot3ahEfmEventLogLocation, hwDot3ahEfmEventLogWindowHi, hwDot3ahEfmEventLogWindowLo, hwDot3ahEfmEventLogThresholdHi, hwDot3ahEfmEventLogThresholdLo, hwDot3ahEfmEventLogValue, hwDot3ahEfmEventLogRunningTotal, hwDot3ahEfmEventLogEventTotal
// Description: This object indicates that an hwDot3ahEfmThresholdEvent notification is sent when a local or remote threshold-crossing event is detected. A local threshold-crossing event is detected by the local enti...
trapMap["1.3.6.1.4.1.2011.5.25.136.1.6.4"] = [
    name: "hwDot3ahEfmThresholdEvent",
    fields: ["hwDot3ahEfmEventLogTimestamp", "hwDot3ahEfmEventLogOui", "hwDot3ahEfmEventLogType", "hwDot3ahEfmEventLogLocation", "hwDot3ahEfmEventLogWindowHi", "hwDot3ahEfmEventLogWindowLo", "hwDot3ahEfmEventLogThresholdHi", "hwDot3ahEfmEventLogThresholdLo", "hwDot3ahEfmEventLogValue", "hwDot3ahEfmEventLogRunningTotal", "hwDot3ahEfmEventLogEventTotal"],
    fieldOids: ["hwDot3ahEfmEventLogTimestamp": "1.3.6.1.4.1.2011.5.25.136.1.2.2.7.1.2", "hwDot3ahEfmEventLogOui": "1.3.6.1.4.1.2011.5.25.136.1.2.2.7.1.3", "hwDot3ahEfmEventLogType": "1.3.6.1.4.1.2011.5.25.136.1.2.2.7.1.4", "hwDot3ahEfmEventLogLocation": "1.3.6.1.4.1.2011.5.25.136.1.2.2.7.1.5", "hwDot3ahEfmEventLogWindowHi": "1.3.6.1.4.1.2011.5.25.136.1.2.2.7.1.6", "hwDot3ahEfmEventLogWindowLo": "1.3.6.1.4.1.2011.5.25.136.1.2.2.7.1.7", "hwDot3ahEfmEventLogThresholdHi": "1.3.6.1.4.1.2011.5.25.136.1.2.2.7.1.8", "hwDot3ahEfmEventLogThresholdLo": "1.3.6.1.4.1.2011.5.25.136.1.2.2.7.1.9", "hwDot3ahEfmEventLogValue": "1.3.6.1.4.1.2011.5.25.136.1.2.2.7.1.10", "hwDot3ahEfmEventLogRunningTotal": "1.3.6.1.4.1.2011.5.25.136.1.2.2.7.1.11", "hwDot3ahEfmEventLogEventTotal": "1.3.6.1.4.1.2011.5.25.136.1.2.2.7.1.12"]
]

// --- hwDot3ahEfmNonThresholdEvent (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.136.1.6.5
// Fields: hwDot3ahEfmEventLogTimestamp, hwDot3ahEfmEventLogOui, hwDot3ahEfmEventLogType, hwDot3ahEfmEventLogLocation
// Description: This object indicates that an hwDot3ahEfmNonThresholdEvent notification is sent when a local or remote non-threshold-crossing event is detected. A local event is detected by the local entity, whereas ...
trapMap["1.3.6.1.4.1.2011.5.25.136.1.6.5"] = [
    name: "hwDot3ahEfmNonThresholdEvent",
    fields: ["hwDot3ahEfmEventLogTimestamp", "hwDot3ahEfmEventLogOui", "hwDot3ahEfmEventLogType", "hwDot3ahEfmEventLogLocation"],
    fieldOids: ["hwDot3ahEfmEventLogTimestamp": "1.3.6.1.4.1.2011.5.25.136.1.2.2.7.1.2", "hwDot3ahEfmEventLogOui": "1.3.6.1.4.1.2011.5.25.136.1.2.2.7.1.3", "hwDot3ahEfmEventLogType": "1.3.6.1.4.1.2011.5.25.136.1.2.2.7.1.4", "hwDot3ahEfmEventLogLocation": "1.3.6.1.4.1.2011.5.25.136.1.2.2.7.1.5"]
]

// --- hwDot3ahEfmRemoteDyingGaspEvent (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.136.1.6.8
// Fields: hwDot3ahEfmPeerMacAddress, ifDescr
// Description: This object indicates that an hwDot3ahEfmRemoteDyingGaspEvent notification is sent when a remote Dying-Gasp event is detected. A remote event is detected through the reception of an Ethernet OAM Event...
trapMap["1.3.6.1.4.1.2011.5.25.136.1.6.8"] = [
    name: "hwDot3ahEfmRemoteDyingGaspEvent",
    fields: ["hwDot3ahEfmPeerMacAddress", "ifDescr"],
    fieldOids: ["hwDot3ahEfmPeerMacAddress": "1.3.6.1.4.1.2011.5.25.136.1.2.2.3.1.1", "ifDescr": "1.3.6.1.2.1.2.2.1.2"]
]

// --- hwDot3ahEfmNonThresholdRecovery (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.136.1.6.17
// Fields: hwDot3ahEfmEventLogTimestamp, hwDot3ahEfmEventLogOui, hwDot3ahEfmEventLogType, hwDot3ahEfmEventLogLocation
// Description: This object indicates that the non-threshold-crossing event is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.136.1.6.17"] = [
    name: "hwDot3ahEfmNonThresholdRecovery",
    fields: ["hwDot3ahEfmEventLogTimestamp", "hwDot3ahEfmEventLogOui", "hwDot3ahEfmEventLogType", "hwDot3ahEfmEventLogLocation"],
    fieldOids: ["hwDot3ahEfmEventLogTimestamp": "1.3.6.1.4.1.2011.5.25.136.1.2.2.7.1.2", "hwDot3ahEfmEventLogOui": "1.3.6.1.4.1.2011.5.25.136.1.2.2.7.1.3", "hwDot3ahEfmEventLogType": "1.3.6.1.4.1.2011.5.25.136.1.2.2.7.1.4", "hwDot3ahEfmEventLogLocation": "1.3.6.1.4.1.2011.5.25.136.1.2.2.7.1.5"]
]

// --- hwCfmVlanOnewayDelay (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.136.1.6.23
// Fields: hwCfmOneDelayTrapLogMacAddress, hwCfmVlanOneDelayTrapLogTimestamp, hwCfmVlanOneDelayTrapLogDelayValue, hwCfmVlanOneDelayTrapLogThreshold, hwCfmVlanOneDelayTrapLogDelayValueHigh, hwCfmVlanOneDelayTrapLogDelayValueLow
// Description: This object indicates that the one-way delay exceeds the trap threshold in the VLAN networking.
trapMap["1.3.6.1.4.1.2011.5.25.136.1.6.23"] = [
    name: "hwCfmVlanOnewayDelay",
    fields: ["hwCfmOneDelayTrapLogMacAddress", "hwCfmVlanOneDelayTrapLogTimestamp", "hwCfmVlanOneDelayTrapLogDelayValue", "hwCfmVlanOneDelayTrapLogThreshold", "hwCfmVlanOneDelayTrapLogDelayValueHigh", "hwCfmVlanOneDelayTrapLogDelayValueLow"],
    fieldOids: ["hwCfmOneDelayTrapLogMacAddress": "1.3.6.1.4.1.2011.5.25.136.1.8.2.3.1.1", "hwCfmVlanOneDelayTrapLogTimestamp": "1.3.6.1.4.1.2011.5.25.136.1.8.2.3.1.2", "hwCfmVlanOneDelayTrapLogDelayValue": "1.3.6.1.4.1.2011.5.25.136.1.8.2.3.1.3", "hwCfmVlanOneDelayTrapLogThreshold": "1.3.6.1.4.1.2011.5.25.136.1.8.2.3.1.4", "hwCfmVlanOneDelayTrapLogDelayValueHigh": "1.3.6.1.4.1.2011.5.25.136.1.8.2.3.1.5", "hwCfmVlanOneDelayTrapLogDelayValueLow": "1.3.6.1.4.1.2011.5.25.136.1.8.2.3.1.6"]
]

// --- hwCfmVlanOnewayDelayRecovery (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.136.1.6.24
// Fields: hwCfmOneDelayRecoveryTrapMacAddress, hwCfmVlanOneDelayRecoveryTrapLogTimestamp, hwCfmVlanOneDelayRecoveryTrapLogDelayValue, hwCfmVlanOneDelayRecoveryTrapLogThreshold, hwCfmVlanOneDelayRecoveryTrapLogDelayValueHigh, hwCfmVlanOneDelayRecoveryTrapLogDelayValueLow
// Description: This object indicates that the one-way delay falls below the trap threshold in the VLAN networking.
trapMap["1.3.6.1.4.1.2011.5.25.136.1.6.24"] = [
    name: "hwCfmVlanOnewayDelayRecovery",
    fields: ["hwCfmOneDelayRecoveryTrapMacAddress", "hwCfmVlanOneDelayRecoveryTrapLogTimestamp", "hwCfmVlanOneDelayRecoveryTrapLogDelayValue", "hwCfmVlanOneDelayRecoveryTrapLogThreshold", "hwCfmVlanOneDelayRecoveryTrapLogDelayValueHigh", "hwCfmVlanOneDelayRecoveryTrapLogDelayValueLow"],
    fieldOids: ["hwCfmOneDelayRecoveryTrapMacAddress": "1.3.6.1.4.1.2011.5.25.136.1.8.2.4.1.1", "hwCfmVlanOneDelayRecoveryTrapLogTimestamp": "1.3.6.1.4.1.2011.5.25.136.1.8.2.4.1.2", "hwCfmVlanOneDelayRecoveryTrapLogDelayValue": "1.3.6.1.4.1.2011.5.25.136.1.8.2.4.1.3", "hwCfmVlanOneDelayRecoveryTrapLogThreshold": "1.3.6.1.4.1.2011.5.25.136.1.8.2.4.1.4", "hwCfmVlanOneDelayRecoveryTrapLogDelayValueHigh": "1.3.6.1.4.1.2011.5.25.136.1.8.2.4.1.5", "hwCfmVlanOneDelayRecoveryTrapLogDelayValueLow": "1.3.6.1.4.1.2011.5.25.136.1.8.2.4.1.6"]
]

// --- hwCfmVlanTwowayDelay (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.136.1.6.25
// Fields: hwCfmTwoDelayTrapMacAddress, hwCfmVlanTwoDelayTrapLogTimestamp, hwCfmVlanTwoDelayTrapLogDelayValue, hwCfmVlanTwoDelayTrapLogThreshold, hwCfmVlanTwoDelayTrapLogDelayValueHigh, hwCfmVlanTwoDelayTrapLogDelayValueLow
// Description: This object indicates that the two-way delay exceeds the trap threshold in the VLAN networking.
trapMap["1.3.6.1.4.1.2011.5.25.136.1.6.25"] = [
    name: "hwCfmVlanTwowayDelay",
    fields: ["hwCfmTwoDelayTrapMacAddress", "hwCfmVlanTwoDelayTrapLogTimestamp", "hwCfmVlanTwoDelayTrapLogDelayValue", "hwCfmVlanTwoDelayTrapLogThreshold", "hwCfmVlanTwoDelayTrapLogDelayValueHigh", "hwCfmVlanTwoDelayTrapLogDelayValueLow"],
    fieldOids: ["hwCfmTwoDelayTrapMacAddress": "1.3.6.1.4.1.2011.5.25.136.1.8.2.5.1.1", "hwCfmVlanTwoDelayTrapLogTimestamp": "1.3.6.1.4.1.2011.5.25.136.1.8.2.5.1.2", "hwCfmVlanTwoDelayTrapLogDelayValue": "1.3.6.1.4.1.2011.5.25.136.1.8.2.5.1.3", "hwCfmVlanTwoDelayTrapLogThreshold": "1.3.6.1.4.1.2011.5.25.136.1.8.2.5.1.4", "hwCfmVlanTwoDelayTrapLogDelayValueHigh": "1.3.6.1.4.1.2011.5.25.136.1.8.2.5.1.5", "hwCfmVlanTwoDelayTrapLogDelayValueLow": "1.3.6.1.4.1.2011.5.25.136.1.8.2.5.1.6"]
]

// --- hwCfmVlanTwowayDelayRecovery (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.136.1.6.26
// Fields: hwCfmTwoDelayRecoveryTrapMacAddress, hwCfmVlanTwoDelayRecoveryTrapLogTimestamp, hwCfmVlanTwoDelayRecoveryTrapLogDelayValue, hwCfmVlanTwoDelayRecoveryTrapLogThreshold, hwCfmVlanTwoDelayRecoveryTrapLogDelayValueHigh, hwCfmVlanTwoDelayRecoveryTrapLogDelayValueLow
// Description: This object indicates that the two-way delay falls below the trap threshold in the VLAN networking.
trapMap["1.3.6.1.4.1.2011.5.25.136.1.6.26"] = [
    name: "hwCfmVlanTwowayDelayRecovery",
    fields: ["hwCfmTwoDelayRecoveryTrapMacAddress", "hwCfmVlanTwoDelayRecoveryTrapLogTimestamp", "hwCfmVlanTwoDelayRecoveryTrapLogDelayValue", "hwCfmVlanTwoDelayRecoveryTrapLogThreshold", "hwCfmVlanTwoDelayRecoveryTrapLogDelayValueHigh", "hwCfmVlanTwoDelayRecoveryTrapLogDelayValueLow"],
    fieldOids: ["hwCfmTwoDelayRecoveryTrapMacAddress": "1.3.6.1.4.1.2011.5.25.136.1.8.2.6.1.1", "hwCfmVlanTwoDelayRecoveryTrapLogTimestamp": "1.3.6.1.4.1.2011.5.25.136.1.8.2.6.1.2", "hwCfmVlanTwoDelayRecoveryTrapLogDelayValue": "1.3.6.1.4.1.2011.5.25.136.1.8.2.6.1.3", "hwCfmVlanTwoDelayRecoveryTrapLogThreshold": "1.3.6.1.4.1.2011.5.25.136.1.8.2.6.1.4", "hwCfmVlanTwoDelayRecoveryTrapLogDelayValueHigh": "1.3.6.1.4.1.2011.5.25.136.1.8.2.6.1.5", "hwCfmVlanTwoDelayRecoveryTrapLogDelayValueLow": "1.3.6.1.4.1.2011.5.25.136.1.8.2.6.1.6"]
]

// --- hwDot3ahEfmLoopbackFailed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.136.1.6.29
// Fields: ifDescr
// Description: This object indicates that an hwDot3ahEfmLoopbackFailed notification is sent when loopback fails to start on an interface. This notification should not be sent more than once per second.
trapMap["1.3.6.1.4.1.2011.5.25.136.1.6.29"] = [
    name: "hwDot3ahEfmLoopbackFailed",
    fields: ["ifDescr"],
    fieldOids: ["ifDescr": "1.3.6.1.2.1.2.2.1.2"]
]

// --- hwY1731AisDefectAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.136.1.6.30
// Fields: hwDot1agCfmMdName, hwDot1agCfmMaName, hwDot1agCfmMepIdentifier
// Description: This object indicates that the MEP receives an AIS PDU and enters the faulty state.
trapMap["1.3.6.1.4.1.2011.5.25.136.1.6.30"] = [
    name: "hwY1731AisDefectAlarm",
    fields: ["hwDot1agCfmMdName", "hwDot1agCfmMaName", "hwDot1agCfmMepIdentifier"],
    fieldOids: ["hwDot1agCfmMdName": "1.3.6.1.4.1.2011.5.25.136.1.1.3.2.1.3", "hwDot1agCfmMaName": "1.3.6.1.4.1.2011.5.25.136.1.1.4.2.1.2", "hwDot1agCfmMepIdentifier": "1.3.6.1.4.1.2011.5.25.136.1.1.5.1.1.1"]
]

// --- hwY1731AisDefectAlarmRecovery (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.136.1.6.31
// Fields: hwDot1agCfmMdName, hwDot1agCfmMaName, hwDot1agCfmMepIdentifier
// Description: This object indicates that the MEP does not receive an AIS PDU within the AIS PDU timeout period and exits the faulty state.
trapMap["1.3.6.1.4.1.2011.5.25.136.1.6.31"] = [
    name: "hwY1731AisDefectAlarmRecovery",
    fields: ["hwDot1agCfmMdName", "hwDot1agCfmMaName", "hwDot1agCfmMepIdentifier"],
    fieldOids: ["hwDot1agCfmMdName": "1.3.6.1.4.1.2011.5.25.136.1.1.3.2.1.3", "hwDot1agCfmMaName": "1.3.6.1.4.1.2011.5.25.136.1.1.4.2.1.2", "hwDot1agCfmMepIdentifier": "1.3.6.1.4.1.2011.5.25.136.1.1.5.1.1.1"]
]

// --- hwDot1agCfmUnexpectedMEGLevel (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.136.1.6.32
// Fields: hwDot1agCfmMdName, hwDot1agCfmMaName, hwDot1agCfmMepIdentifier
// Description: This object indicates that the MEP receives a CCM with an unexpected MEG level.
trapMap["1.3.6.1.4.1.2011.5.25.136.1.6.32"] = [
    name: "hwDot1agCfmUnexpectedMEGLevel",
    fields: ["hwDot1agCfmMdName", "hwDot1agCfmMaName", "hwDot1agCfmMepIdentifier"],
    fieldOids: ["hwDot1agCfmMdName": "1.3.6.1.4.1.2011.5.25.136.1.1.3.2.1.3", "hwDot1agCfmMaName": "1.3.6.1.4.1.2011.5.25.136.1.1.4.2.1.2", "hwDot1agCfmMepIdentifier": "1.3.6.1.4.1.2011.5.25.136.1.1.5.1.1.1"]
]

// --- hwDot1agCfmUnexpectedMEGLevelCleared (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.136.1.6.33
// Fields: hwDot1agCfmMdName, hwDot1agCfmMaName, hwDot1agCfmMepIdentifier
// Description: This object indicates that the MEP does not receive a CCM with an unexpected MEG level within the CCM timeout period.
trapMap["1.3.6.1.4.1.2011.5.25.136.1.6.33"] = [
    name: "hwDot1agCfmUnexpectedMEGLevelCleared",
    fields: ["hwDot1agCfmMdName", "hwDot1agCfmMaName", "hwDot1agCfmMepIdentifier"],
    fieldOids: ["hwDot1agCfmMdName": "1.3.6.1.4.1.2011.5.25.136.1.1.3.2.1.3", "hwDot1agCfmMaName": "1.3.6.1.4.1.2011.5.25.136.1.1.4.2.1.2", "hwDot1agCfmMepIdentifier": "1.3.6.1.4.1.2011.5.25.136.1.1.5.1.1.1"]
]

// --- hwDot1agCfmMismerge (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.136.1.6.34
// Fields: hwDot1agCfmMdName, hwDot1agCfmMaName, hwDot1agCfmMepIdentifier
// Description: This object indicates that the MEP receives a CCM carrying the correct MEG level but the incorrect MEG ID.
trapMap["1.3.6.1.4.1.2011.5.25.136.1.6.34"] = [
    name: "hwDot1agCfmMismerge",
    fields: ["hwDot1agCfmMdName", "hwDot1agCfmMaName", "hwDot1agCfmMepIdentifier"],
    fieldOids: ["hwDot1agCfmMdName": "1.3.6.1.4.1.2011.5.25.136.1.1.3.2.1.3", "hwDot1agCfmMaName": "1.3.6.1.4.1.2011.5.25.136.1.1.4.2.1.2", "hwDot1agCfmMepIdentifier": "1.3.6.1.4.1.2011.5.25.136.1.1.5.1.1.1"]
]

// --- hwDot1agCfmMismergeCleared (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.136.1.6.35
// Fields: hwDot1agCfmMdName, hwDot1agCfmMaName, hwDot1agCfmMepIdentifier
// Description: This object indicates that the MEP does not receive a CCM with an unexpected MEG ID within the CCM timeout period.
trapMap["1.3.6.1.4.1.2011.5.25.136.1.6.35"] = [
    name: "hwDot1agCfmMismergeCleared",
    fields: ["hwDot1agCfmMdName", "hwDot1agCfmMaName", "hwDot1agCfmMepIdentifier"],
    fieldOids: ["hwDot1agCfmMdName": "1.3.6.1.4.1.2011.5.25.136.1.1.3.2.1.3", "hwDot1agCfmMaName": "1.3.6.1.4.1.2011.5.25.136.1.1.4.2.1.2", "hwDot1agCfmMepIdentifier": "1.3.6.1.4.1.2011.5.25.136.1.1.5.1.1.1"]
]

// --- hwDot1agCfmUnexpectedMEP (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.136.1.6.36
// Fields: hwDot1agCfmMdName, hwDot1agCfmMaName, hwDot1agCfmMepIdentifier
// Description: This object indicates that the MEP receives a CCM that has the correct MEG level, correct MEG ID, and unexpected MEP ID.
trapMap["1.3.6.1.4.1.2011.5.25.136.1.6.36"] = [
    name: "hwDot1agCfmUnexpectedMEP",
    fields: ["hwDot1agCfmMdName", "hwDot1agCfmMaName", "hwDot1agCfmMepIdentifier"],
    fieldOids: ["hwDot1agCfmMdName": "1.3.6.1.4.1.2011.5.25.136.1.1.3.2.1.3", "hwDot1agCfmMaName": "1.3.6.1.4.1.2011.5.25.136.1.1.4.2.1.2", "hwDot1agCfmMepIdentifier": "1.3.6.1.4.1.2011.5.25.136.1.1.5.1.1.1"]
]

// --- hwDot1agCfmUnexpectedMEPCleared (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.136.1.6.37
// Fields: hwDot1agCfmMdName, hwDot1agCfmMaName, hwDot1agCfmMepIdentifier
// Description: This object indicates that the MEP does not receive a CCM with an unexpected MEP ID within the CCM timeout period.
trapMap["1.3.6.1.4.1.2011.5.25.136.1.6.37"] = [
    name: "hwDot1agCfmUnexpectedMEPCleared",
    fields: ["hwDot1agCfmMdName", "hwDot1agCfmMaName", "hwDot1agCfmMepIdentifier"],
    fieldOids: ["hwDot1agCfmMdName": "1.3.6.1.4.1.2011.5.25.136.1.1.3.2.1.3", "hwDot1agCfmMaName": "1.3.6.1.4.1.2011.5.25.136.1.1.4.2.1.2", "hwDot1agCfmMepIdentifier": "1.3.6.1.4.1.2011.5.25.136.1.1.5.1.1.1"]
]

// --- hwDot1agCfmUnexpectedPeriod (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.136.1.6.38
// Fields: hwDot1agCfmMdName, hwDot1agCfmMaName, hwDot1agCfmMepIdentifier, hwDot1agCfmRMepIdentifier
// Description: This object indicates that the MEP receives a CCM that has the correct MEG level, correct MEG ID, correct MEP ID, and unexpected period.
trapMap["1.3.6.1.4.1.2011.5.25.136.1.6.38"] = [
    name: "hwDot1agCfmUnexpectedPeriod",
    fields: ["hwDot1agCfmMdName", "hwDot1agCfmMaName", "hwDot1agCfmMepIdentifier", "hwDot1agCfmRMepIdentifier"],
    fieldOids: ["hwDot1agCfmMdName": "1.3.6.1.4.1.2011.5.25.136.1.1.3.2.1.3", "hwDot1agCfmMaName": "1.3.6.1.4.1.2011.5.25.136.1.1.4.2.1.2", "hwDot1agCfmMepIdentifier": "1.3.6.1.4.1.2011.5.25.136.1.1.5.1.1.1", "hwDot1agCfmRMepIdentifier": "1.3.6.1.4.1.2011.5.25.136.1.1.6.1.1.1"]
]

// --- hwDot1agCfmUnexpectedPeriodCleared (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.136.1.6.39
// Fields: hwDot1agCfmMdName, hwDot1agCfmMaName, hwDot1agCfmMepIdentifier, hwDot1agCfmRMepIdentifier
// Description: This object indicates that the MEP does not receive a CCM with an unexpected period within the CCM timeout period.
trapMap["1.3.6.1.4.1.2011.5.25.136.1.6.39"] = [
    name: "hwDot1agCfmUnexpectedPeriodCleared",
    fields: ["hwDot1agCfmMdName", "hwDot1agCfmMaName", "hwDot1agCfmMepIdentifier", "hwDot1agCfmRMepIdentifier"],
    fieldOids: ["hwDot1agCfmMdName": "1.3.6.1.4.1.2011.5.25.136.1.1.3.2.1.3", "hwDot1agCfmMaName": "1.3.6.1.4.1.2011.5.25.136.1.1.4.2.1.2", "hwDot1agCfmMepIdentifier": "1.3.6.1.4.1.2011.5.25.136.1.1.5.1.1.1", "hwDot1agCfmRMepIdentifier": "1.3.6.1.4.1.2011.5.25.136.1.1.6.1.1.1"]
]

// --- hwDot1agCfmUnexpectedMAC (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.136.1.6.40
// Fields: hwDot1agCfmMdName, hwDot1agCfmMaName, hwDot1agCfmMepIdentifier, hwDot1agCfmRMepIdentifier
// Description: This object indicates that the MEP receives a CCM with an unexpected MAC address.
trapMap["1.3.6.1.4.1.2011.5.25.136.1.6.40"] = [
    name: "hwDot1agCfmUnexpectedMAC",
    fields: ["hwDot1agCfmMdName", "hwDot1agCfmMaName", "hwDot1agCfmMepIdentifier", "hwDot1agCfmRMepIdentifier"],
    fieldOids: ["hwDot1agCfmMdName": "1.3.6.1.4.1.2011.5.25.136.1.1.3.2.1.3", "hwDot1agCfmMaName": "1.3.6.1.4.1.2011.5.25.136.1.1.4.2.1.2", "hwDot1agCfmMepIdentifier": "1.3.6.1.4.1.2011.5.25.136.1.1.5.1.1.1", "hwDot1agCfmRMepIdentifier": "1.3.6.1.4.1.2011.5.25.136.1.1.6.1.1.1"]
]

// --- hwDot1agCfmUnexpectedMACCleared (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.136.1.6.41
// Fields: hwDot1agCfmMdName, hwDot1agCfmMaName, hwDot1agCfmMepIdentifier, hwDot1agCfmRMepIdentifier
// Description: This object indicates that the MEP does not receive a CCM with an unexpected MAC address within the CCM timeout period.
trapMap["1.3.6.1.4.1.2011.5.25.136.1.6.41"] = [
    name: "hwDot1agCfmUnexpectedMACCleared",
    fields: ["hwDot1agCfmMdName", "hwDot1agCfmMaName", "hwDot1agCfmMepIdentifier", "hwDot1agCfmRMepIdentifier"],
    fieldOids: ["hwDot1agCfmMdName": "1.3.6.1.4.1.2011.5.25.136.1.1.3.2.1.3", "hwDot1agCfmMaName": "1.3.6.1.4.1.2011.5.25.136.1.1.4.2.1.2", "hwDot1agCfmMepIdentifier": "1.3.6.1.4.1.2011.5.25.136.1.1.5.1.1.1", "hwDot1agCfmRMepIdentifier": "1.3.6.1.4.1.2011.5.25.136.1.1.6.1.1.1"]
]

// --- hwDot1agCfmLOC (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.136.1.6.42
// Fields: hwDot1agCfmMdName, hwDot1agCfmMaName, hwDot1agCfmMepIdentifier, hwDot1agCfmRMepIdentifier
// Description: This object indicates that the MEP does not receive any CCM from the RMEP within the CCM timeout period.
trapMap["1.3.6.1.4.1.2011.5.25.136.1.6.42"] = [
    name: "hwDot1agCfmLOC",
    fields: ["hwDot1agCfmMdName", "hwDot1agCfmMaName", "hwDot1agCfmMepIdentifier", "hwDot1agCfmRMepIdentifier"],
    fieldOids: ["hwDot1agCfmMdName": "1.3.6.1.4.1.2011.5.25.136.1.1.3.2.1.3", "hwDot1agCfmMaName": "1.3.6.1.4.1.2011.5.25.136.1.1.4.2.1.2", "hwDot1agCfmMepIdentifier": "1.3.6.1.4.1.2011.5.25.136.1.1.5.1.1.1", "hwDot1agCfmRMepIdentifier": "1.3.6.1.4.1.2011.5.25.136.1.1.6.1.1.1"]
]

// --- hwDot1agCfmLOCCleared (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.136.1.6.43
// Fields: hwDot1agCfmMdName, hwDot1agCfmMaName, hwDot1agCfmMepIdentifier, hwDot1agCfmRMepIdentifier
// Description: This object indicates that the MEP receives n (n is greater than or equal to 3) CCMs from the RMEP (MEP ID = i) within the CCM timeout period.
trapMap["1.3.6.1.4.1.2011.5.25.136.1.6.43"] = [
    name: "hwDot1agCfmLOCCleared",
    fields: ["hwDot1agCfmMdName", "hwDot1agCfmMaName", "hwDot1agCfmMepIdentifier", "hwDot1agCfmRMepIdentifier"],
    fieldOids: ["hwDot1agCfmMdName": "1.3.6.1.4.1.2011.5.25.136.1.1.3.2.1.3", "hwDot1agCfmMaName": "1.3.6.1.4.1.2011.5.25.136.1.1.4.2.1.2", "hwDot1agCfmMepIdentifier": "1.3.6.1.4.1.2011.5.25.136.1.1.5.1.1.1", "hwDot1agCfmRMepIdentifier": "1.3.6.1.4.1.2011.5.25.136.1.1.6.1.1.1"]
]

// --- hwDot1agCfmExceptionalMACStatus (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.136.1.6.44
// Fields: hwDot1agCfmMdName, hwDot1agCfmMaName, hwDot1agCfmMepIdentifier, hwDot1agCfmRMepIdentifier
// Description: This object indicates that the remote MEP is reporting an error status in its Port Status TLV or Interface Status TLV.
trapMap["1.3.6.1.4.1.2011.5.25.136.1.6.44"] = [
    name: "hwDot1agCfmExceptionalMACStatus",
    fields: ["hwDot1agCfmMdName", "hwDot1agCfmMaName", "hwDot1agCfmMepIdentifier", "hwDot1agCfmRMepIdentifier"],
    fieldOids: ["hwDot1agCfmMdName": "1.3.6.1.4.1.2011.5.25.136.1.1.3.2.1.3", "hwDot1agCfmMaName": "1.3.6.1.4.1.2011.5.25.136.1.1.4.2.1.2", "hwDot1agCfmMepIdentifier": "1.3.6.1.4.1.2011.5.25.136.1.1.5.1.1.1", "hwDot1agCfmRMepIdentifier": "1.3.6.1.4.1.2011.5.25.136.1.1.6.1.1.1"]
]

// --- hwDot1agCfmExceptionalMACStatusCleared (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.136.1.6.45
// Fields: hwDot1agCfmMdName, hwDot1agCfmMaName, hwDot1agCfmMepIdentifier, hwDot1agCfmRMepIdentifier
// Description: This object indicates that the remote MEP resumes from an error status indicated in its Port Status TLV or Interface Status TLV.
trapMap["1.3.6.1.4.1.2011.5.25.136.1.6.45"] = [
    name: "hwDot1agCfmExceptionalMACStatusCleared",
    fields: ["hwDot1agCfmMdName", "hwDot1agCfmMaName", "hwDot1agCfmMepIdentifier", "hwDot1agCfmRMepIdentifier"],
    fieldOids: ["hwDot1agCfmMdName": "1.3.6.1.4.1.2011.5.25.136.1.1.3.2.1.3", "hwDot1agCfmMaName": "1.3.6.1.4.1.2011.5.25.136.1.1.4.2.1.2", "hwDot1agCfmMepIdentifier": "1.3.6.1.4.1.2011.5.25.136.1.1.5.1.1.1", "hwDot1agCfmRMepIdentifier": "1.3.6.1.4.1.2011.5.25.136.1.1.6.1.1.1"]
]

// --- hwDot1agCfmRDI (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.136.1.6.46
// Fields: hwDot1agCfmMdName, hwDot1agCfmMaName, hwDot1agCfmMepIdentifier, hwDot1agCfmRMepIdentifier
// Description: This object indicates that the MEP receives a CCM with the RDI field set.
trapMap["1.3.6.1.4.1.2011.5.25.136.1.6.46"] = [
    name: "hwDot1agCfmRDI",
    fields: ["hwDot1agCfmMdName", "hwDot1agCfmMaName", "hwDot1agCfmMepIdentifier", "hwDot1agCfmRMepIdentifier"],
    fieldOids: ["hwDot1agCfmMdName": "1.3.6.1.4.1.2011.5.25.136.1.1.3.2.1.3", "hwDot1agCfmMaName": "1.3.6.1.4.1.2011.5.25.136.1.1.4.2.1.2", "hwDot1agCfmMepIdentifier": "1.3.6.1.4.1.2011.5.25.136.1.1.5.1.1.1", "hwDot1agCfmRMepIdentifier": "1.3.6.1.4.1.2011.5.25.136.1.1.6.1.1.1"]
]

// --- hwDot1agCfmRDICleared (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.136.1.6.47
// Fields: hwDot1agCfmMdName, hwDot1agCfmMaName, hwDot1agCfmMepIdentifier, hwDot1agCfmRMepIdentifier
// Description: This object indicates that the MEP receives a CCM with the RDI field cleared.
trapMap["1.3.6.1.4.1.2011.5.25.136.1.6.47"] = [
    name: "hwDot1agCfmRDICleared",
    fields: ["hwDot1agCfmMdName", "hwDot1agCfmMaName", "hwDot1agCfmMepIdentifier", "hwDot1agCfmRMepIdentifier"],
    fieldOids: ["hwDot1agCfmMdName": "1.3.6.1.4.1.2011.5.25.136.1.1.3.2.1.3", "hwDot1agCfmMaName": "1.3.6.1.4.1.2011.5.25.136.1.1.4.2.1.2", "hwDot1agCfmMepIdentifier": "1.3.6.1.4.1.2011.5.25.136.1.1.5.1.1.1", "hwDot1agCfmRMepIdentifier": "1.3.6.1.4.1.2011.5.25.136.1.1.6.1.1.1"]
]

// --- hwY1731AisExceedMaxPktNum (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.136.1.6.48
// Fields: hwY1731AisMaxPktNum
// Description: This object indicates that the number of packets sent or received in 1s exceeds the maximum value.
trapMap["1.3.6.1.4.1.2011.5.25.136.1.6.48"] = [
    name: "hwY1731AisExceedMaxPktNum",
    fields: ["hwY1731AisMaxPktNum"],
    fieldOids: ["hwY1731AisMaxPktNum": "1.3.6.1.4.1.2011.5.25.136.1.8.3"]
]

// --- hwY1731AisExceedMaxPktNumCleared (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.136.1.6.49
// Description: This object indicates that the number of packets sent or received in 1s falls below the maximum value.
trapMap["1.3.6.1.4.1.2011.5.25.136.1.6.49"] = [
    name: "hwY1731AisExceedMaxPktNumCleared",
    fields: [],
    fieldOids: []
]

// --- hwY1731LckDefect (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.136.1.6.50
// Fields: hwDot1agCfmMdName, hwDot1agCfmMaName, hwDot1agCfmMepIdentifier
// Description: This object indicates that the MEP enters the LCK faulty state.
trapMap["1.3.6.1.4.1.2011.5.25.136.1.6.50"] = [
    name: "hwY1731LckDefect",
    fields: ["hwDot1agCfmMdName", "hwDot1agCfmMaName", "hwDot1agCfmMepIdentifier"],
    fieldOids: ["hwDot1agCfmMdName": "1.3.6.1.4.1.2011.5.25.136.1.1.3.2.1.3", "hwDot1agCfmMaName": "1.3.6.1.4.1.2011.5.25.136.1.1.4.2.1.2", "hwDot1agCfmMepIdentifier": "1.3.6.1.4.1.2011.5.25.136.1.1.5.1.1.1"]
]

// --- hwY1731LckDefectCleared (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.136.1.6.51
// Fields: hwDot1agCfmMdName, hwDot1agCfmMaName, hwDot1agCfmMepIdentifier
// Description: This object indicates that the MEP exits from the LCK faulty state.
trapMap["1.3.6.1.4.1.2011.5.25.136.1.6.51"] = [
    name: "hwY1731LckDefectCleared",
    fields: ["hwDot1agCfmMdName", "hwDot1agCfmMaName", "hwDot1agCfmMepIdentifier"],
    fieldOids: ["hwDot1agCfmMdName": "1.3.6.1.4.1.2011.5.25.136.1.1.3.2.1.3", "hwDot1agCfmMaName": "1.3.6.1.4.1.2011.5.25.136.1.1.4.2.1.2", "hwDot1agCfmMepIdentifier": "1.3.6.1.4.1.2011.5.25.136.1.1.5.1.1.1"]
]

// --- hwY1731Statistic (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.136.1.6.52
// Fields: hwDot1agCfmMdName, hwDot1agCfmMaName, hwDot1agCfmMepIdentifier, hwY1731StatisticTrapLogValue, hwY1731StatisticTrapLogUpperLimitThreshold, hwY1731StatisticTrapLogLowerLimitThreshold, hwY1731StatisticTrapLogValueHigh, hwY1731StatisticTrapLogValueLow
// Description: This object indicates that the Y.1731 statistic value exceeds the upper threshold.
trapMap["1.3.6.1.4.1.2011.5.25.136.1.6.52"] = [
    name: "hwY1731Statistic",
    fields: ["hwDot1agCfmMdName", "hwDot1agCfmMaName", "hwDot1agCfmMepIdentifier", "hwY1731StatisticTrapLogValue", "hwY1731StatisticTrapLogUpperLimitThreshold", "hwY1731StatisticTrapLogLowerLimitThreshold", "hwY1731StatisticTrapLogValueHigh", "hwY1731StatisticTrapLogValueLow"],
    fieldOids: ["hwDot1agCfmMdName": "1.3.6.1.4.1.2011.5.25.136.1.1.3.2.1.3", "hwDot1agCfmMaName": "1.3.6.1.4.1.2011.5.25.136.1.1.4.2.1.2", "hwDot1agCfmMepIdentifier": "1.3.6.1.4.1.2011.5.25.136.1.1.5.1.1.1", "hwY1731StatisticTrapLogValue": "1.3.6.1.4.1.2011.5.25.136.1.8.2.7.1.4", "hwY1731StatisticTrapLogUpperLimitThreshold": "1.3.6.1.4.1.2011.5.25.136.1.8.2.7.1.5", "hwY1731StatisticTrapLogLowerLimitThreshold": "1.3.6.1.4.1.2011.5.25.136.1.8.2.7.1.6", "hwY1731StatisticTrapLogValueHigh": "1.3.6.1.4.1.2011.5.25.136.1.8.2.7.1.7", "hwY1731StatisticTrapLogValueLow": "1.3.6.1.4.1.2011.5.25.136.1.8.2.7.1.8"]
]

// --- hwY1731StatisticClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.136.1.6.53
// Fields: hwDot1agCfmMdName, hwDot1agCfmMaName, hwDot1agCfmMepIdentifier, hwY1731StatisticTrapLogValue, hwY1731StatisticTrapLogUpperLimitThreshold, hwY1731StatisticTrapLogLowerLimitThreshold, hwY1731StatisticTrapLogValueHigh, hwY1731StatisticTrapLogValueLow
// Description: This object indicates that the Y.1731 statistic value falls below the lower threshold.
trapMap["1.3.6.1.4.1.2011.5.25.136.1.6.53"] = [
    name: "hwY1731StatisticClear",
    fields: ["hwDot1agCfmMdName", "hwDot1agCfmMaName", "hwDot1agCfmMepIdentifier", "hwY1731StatisticTrapLogValue", "hwY1731StatisticTrapLogUpperLimitThreshold", "hwY1731StatisticTrapLogLowerLimitThreshold", "hwY1731StatisticTrapLogValueHigh", "hwY1731StatisticTrapLogValueLow"],
    fieldOids: ["hwDot1agCfmMdName": "1.3.6.1.4.1.2011.5.25.136.1.1.3.2.1.3", "hwDot1agCfmMaName": "1.3.6.1.4.1.2011.5.25.136.1.1.4.2.1.2", "hwDot1agCfmMepIdentifier": "1.3.6.1.4.1.2011.5.25.136.1.1.5.1.1.1", "hwY1731StatisticTrapLogValue": "1.3.6.1.4.1.2011.5.25.136.1.8.2.7.1.4", "hwY1731StatisticTrapLogUpperLimitThreshold": "1.3.6.1.4.1.2011.5.25.136.1.8.2.7.1.5", "hwY1731StatisticTrapLogLowerLimitThreshold": "1.3.6.1.4.1.2011.5.25.136.1.8.2.7.1.6", "hwY1731StatisticTrapLogValueHigh": "1.3.6.1.4.1.2011.5.25.136.1.8.2.7.1.7", "hwY1731StatisticTrapLogValueLow": "1.3.6.1.4.1.2011.5.25.136.1.8.2.7.1.8"]
]

// --- hwY1731LckExceedThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.136.1.6.54
// Fields: hwY1731LckMaxPktNum, hwY1731LckCurrentPktNum, hwY1731LckUpperThreshold, hwY1731LckLowerThreshold
// Description: Indicates that the number of LCK packets transmitted in 1 second exceeds the upper limit.
trapMap["1.3.6.1.4.1.2011.5.25.136.1.6.54"] = [
    name: "hwY1731LckExceedThreshold",
    fields: ["hwY1731LckMaxPktNum", "hwY1731LckCurrentPktNum", "hwY1731LckUpperThreshold", "hwY1731LckLowerThreshold"],
    fieldOids: ["hwY1731LckMaxPktNum": "1.3.6.1.4.1.2011.5.25.136.1.8.5.2", "hwY1731LckCurrentPktNum": "1.3.6.1.4.1.2011.5.25.136.1.8.5.3", "hwY1731LckUpperThreshold": "1.3.6.1.4.1.2011.5.25.136.1.8.5.4", "hwY1731LckLowerThreshold": "1.3.6.1.4.1.2011.5.25.136.1.8.5.5"]
]

// --- hwY1731LckExceedThresholdRecovery (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.136.1.6.55
// Fields: hwY1731LckMaxPktNum, hwY1731LckCurrentPktNum, hwY1731LckUpperThreshold, hwY1731LckLowerThreshold
// Description: Indicates that the number of LCK packets transmitted in 1 second falls below the lower limit.
trapMap["1.3.6.1.4.1.2011.5.25.136.1.6.55"] = [
    name: "hwY1731LckExceedThresholdRecovery",
    fields: ["hwY1731LckMaxPktNum", "hwY1731LckCurrentPktNum", "hwY1731LckUpperThreshold", "hwY1731LckLowerThreshold"],
    fieldOids: ["hwY1731LckMaxPktNum": "1.3.6.1.4.1.2011.5.25.136.1.8.5.2", "hwY1731LckCurrentPktNum": "1.3.6.1.4.1.2011.5.25.136.1.8.5.3", "hwY1731LckUpperThreshold": "1.3.6.1.4.1.2011.5.25.136.1.8.5.4", "hwY1731LckLowerThreshold": "1.3.6.1.4.1.2011.5.25.136.1.8.5.5"]
]

// --- hwY1731TunnelNonSupport (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.136.1.6.56
// Fields: hwDot1agCfmMdName, hwDot1agCfmMaName, hwDot1agCfmMepIdentifier
// Description: This object indicates that Y.1731 does not support the current public tunnel.
trapMap["1.3.6.1.4.1.2011.5.25.136.1.6.56"] = [
    name: "hwY1731TunnelNonSupport",
    fields: ["hwDot1agCfmMdName", "hwDot1agCfmMaName", "hwDot1agCfmMepIdentifier"],
    fieldOids: ["hwDot1agCfmMdName": "1.3.6.1.4.1.2011.5.25.136.1.1.3.2.1.3", "hwDot1agCfmMaName": "1.3.6.1.4.1.2011.5.25.136.1.1.4.2.1.2", "hwDot1agCfmMepIdentifier": "1.3.6.1.4.1.2011.5.25.136.1.1.5.1.1.1"]
]

// --- hwY1731TunnelNonSupportResumed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.136.1.6.57
// Fields: hwDot1agCfmMdName, hwDot1agCfmMaName, hwDot1agCfmMepIdentifier
// Description: This object indicates that the alarm that Y.1731 does not support the current public tunnel is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.136.1.6.57"] = [
    name: "hwY1731TunnelNonSupportResumed",
    fields: ["hwDot1agCfmMdName", "hwDot1agCfmMaName", "hwDot1agCfmMepIdentifier"],
    fieldOids: ["hwDot1agCfmMdName": "1.3.6.1.4.1.2011.5.25.136.1.1.3.2.1.3", "hwDot1agCfmMaName": "1.3.6.1.4.1.2011.5.25.136.1.1.4.2.1.2", "hwDot1agCfmMepIdentifier": "1.3.6.1.4.1.2011.5.25.136.1.1.5.1.1.1"]
]

// --- hwY1731TestIdStatistic (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.136.1.6.58
// Fields: hwY1731TestIdStatTrapLogTypeString, hwY1731TestIdStatTrapLogValue, hwY1731TestIdStatTrapLogUpperLimitThreshold, hwY1731TestIdStatTrapLogLowerLimitThreshold
// Description: The Y.1731 statistic value exceeded the upper limit value of the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.136.1.6.58"] = [
    name: "hwY1731TestIdStatistic",
    fields: ["hwY1731TestIdStatTrapLogTypeString", "hwY1731TestIdStatTrapLogValue", "hwY1731TestIdStatTrapLogUpperLimitThreshold", "hwY1731TestIdStatTrapLogLowerLimitThreshold"],
    fieldOids: ["hwY1731TestIdStatTrapLogTypeString": "1.3.6.1.4.1.2011.5.25.136.1.8.2.17.1.5", "hwY1731TestIdStatTrapLogValue": "1.3.6.1.4.1.2011.5.25.136.1.8.2.17.1.2", "hwY1731TestIdStatTrapLogUpperLimitThreshold": "1.3.6.1.4.1.2011.5.25.136.1.8.2.17.1.3", "hwY1731TestIdStatTrapLogLowerLimitThreshold": "1.3.6.1.4.1.2011.5.25.136.1.8.2.17.1.4"]
]

// --- hwY1731TestIdStatisticClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.136.1.6.59
// Fields: hwY1731TestIdStatTrapLogTypeString, hwY1731TestIdStatTrapLogValue, hwY1731TestIdStatTrapLogUpperLimitThreshold, hwY1731TestIdStatTrapLogLowerLimitThreshold
// Description: The Y.1731 statistic value fell below lower limit value of the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.136.1.6.59"] = [
    name: "hwY1731TestIdStatisticClear",
    fields: ["hwY1731TestIdStatTrapLogTypeString", "hwY1731TestIdStatTrapLogValue", "hwY1731TestIdStatTrapLogUpperLimitThreshold", "hwY1731TestIdStatTrapLogLowerLimitThreshold"],
    fieldOids: ["hwY1731TestIdStatTrapLogTypeString": "1.3.6.1.4.1.2011.5.25.136.1.8.2.17.1.5", "hwY1731TestIdStatTrapLogValue": "1.3.6.1.4.1.2011.5.25.136.1.8.2.17.1.2", "hwY1731TestIdStatTrapLogUpperLimitThreshold": "1.3.6.1.4.1.2011.5.25.136.1.8.2.17.1.3", "hwY1731TestIdStatTrapLogLowerLimitThreshold": "1.3.6.1.4.1.2011.5.25.136.1.8.2.17.1.4"]
]

// --- hwY1731PwTrunkNonSupport (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.136.1.6.60
// Fields: hwDot1agCfmMdName, hwDot1agCfmMaName, hwDot1agCfmMepIdentifier
// Description: This object indicates that Y.1731 PW-side frame loss measurement is not supported on an Eth-Trunk interface configured as the PW's public network-side interface.
trapMap["1.3.6.1.4.1.2011.5.25.136.1.6.60"] = [
    name: "hwY1731PwTrunkNonSupport",
    fields: ["hwDot1agCfmMdName", "hwDot1agCfmMaName", "hwDot1agCfmMepIdentifier"],
    fieldOids: ["hwDot1agCfmMdName": "1.3.6.1.4.1.2011.5.25.136.1.1.3.2.1.3", "hwDot1agCfmMaName": "1.3.6.1.4.1.2011.5.25.136.1.1.4.2.1.2", "hwDot1agCfmMepIdentifier": "1.3.6.1.4.1.2011.5.25.136.1.1.5.1.1.1"]
]

// --- hwY1731PwTrunkNonSupportResumed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.136.1.6.61
// Fields: hwDot1agCfmMdName, hwDot1agCfmMaName, hwDot1agCfmMepIdentifier
// Description: This object indicates that The alarm that Y.1731 PW-side frame loss measurement is not supported on an Eth-Trunk interface configured as the PW's public network-side interface is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.136.1.6.61"] = [
    name: "hwY1731PwTrunkNonSupportResumed",
    fields: ["hwDot1agCfmMdName", "hwDot1agCfmMaName", "hwDot1agCfmMepIdentifier"],
    fieldOids: ["hwDot1agCfmMdName": "1.3.6.1.4.1.2011.5.25.136.1.1.3.2.1.3", "hwDot1agCfmMaName": "1.3.6.1.4.1.2011.5.25.136.1.1.4.2.1.2", "hwDot1agCfmMepIdentifier": "1.3.6.1.4.1.2011.5.25.136.1.1.5.1.1.1"]
]

// ===== Parsing logic =====

// Set to true to enable diagnostic logging for this MIB parser
DEBUG = false

LOG_PREFIX = "[HUAWEI-ETHOAM-MIB]"
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
