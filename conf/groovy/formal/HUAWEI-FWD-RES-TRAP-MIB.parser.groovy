/**
 * Auto-generated from HUAWEI-FWD-RES-TRAP-MIB.mib
 * Generated: 2026-08-24T18:28:29.713716600
 * Traps/Notifications (160): hwWholeFwdResLack, hwWholeFwdResLackResume, hwBoardFwdResLack, hwBoardFwdResLackResume, hwBoardL3FwdResLack, hwBoardL3FwdResLackResume, hwBoardL3ACLResLack, hwBoardL2mcResLack, hwBoardL2mcResLackResume, hwBoardIpmcResLack, hwBoardIpmcResLackResume, hwBoardServiceFailed, hwWholeFwdResThresholdExceed, hwWholeFwdResThresholdExceedResume, hwBoardFwdResThresholdExceed, hwBoardFwdResThresholdExceedResume, hwBoardMplsPhpNonsupport, hwBoardResThresholdExceed, hwBoardResThresholdExceedResume, hwBoardResWarningThresholdExceed, hwBoardResWarningThresholdExceedResume, hwBoardIPv6ACLResLack, hwBoardMplsPhpResLack, hwFwdProcFailForLCS, hwFwdProcFailForLCSResume, hwFwdEntryConflict, hwFwdEntryConflictResume, hwFwdEntryInconsistent, hwFwdEntryInconsistentResume, hwFibDeliverFailed, hwFibDeliverFailedResume, hwFwdDataSyncIncomplete, hwFwdDataSyncIncompleteResume, hwResourceOverwrittenAlarm, hwResourceOverwrittenAlarmResume, hwBoardFwdMsgCongest, hwBoardFwdMsgCongestResume, hwMcLeafCfcCheck, hwMcLeafCfcCheckResume, hwMplsLabelExceedAlarm, hwMplsLabelExceedAlarmResume, hwVxlanNveMacConflict, hwVxlanNveMacConflictClear, hwNsOrigFlexFlowExceedAlarm, hwNsOrigFlexFlowExceedResume, hwNsAggFlowExceedAlarm, hwNsAggFlowExceedResume, hwNvo3VxlanSrcIpDiffAlarm, hwNvo3VxlanSrcIpDiffAlarmResume, hwPacketChange, hwPacketChangeClear, hwFesEnterSpecialMode, hwFesEnterSpecialModeResume, hwNvo3VxlanVniConflict, hwNvo3VxlanVniConflictResume, hwBoardMplsNonSupport, hwBoardMplsFwdResLack, hwBoardMplsFwdResLackResume, hwFwdResOverLimit, hwFwdResOverLimitResume, hwFwdResOverThresh, hwFwdResOverThreshResume, hwFpResourceThresholdExceed, hwFpResourceThresholdExceedClear, hwFpResourceTotalCountExceed, hwFpResourceTotalCountExceedClear, hwVpresExceed, hwFwdSessionResLack, hwFwdSessionResLackResume, hwFwdFastTableResLack, hwFwdFastTableResLackResume, hwNotsuppDecapVxlanFragPackets, hwBoardVbdifResLack, hwVxlanTnlCfgFailed, hwNotsuppDecapVxlanPackets, hwBoardL3NDResLack, hwBoardL3FIBResLack, hwBoardMplsFlowLabelNonSupp, hwTrunkWeightExceed, hwTrunkWeightExceedResume, hwSidResourceThresholdExceed, hwSidResourceThresholdExceedClear, hwSidResourceTotalCountExceed, hwSidResourceTotalCountExceedClear, hwBoardMcResFull, hwBoardMplsFwdResFull, hwBoardL3ResFull, hwFwdComponentSmoothFailed, hwFwdComponentSmoothFailedClear, hwEMDIIndicatorOverThreshold, hwEMDIIndicatorOverThresholdResume, hwEMDIReceiveDuplicatePackets, hwEMDIReceiveDuplicatePacketsResume, hwBoardMcResLack, hwBoardMcResLackResume, hwAutoDiagnoseAlarm, hwAutoDiagnoseAlarmResume, hwEcmpMemberLimitOverThresholdAlarm, hwSysResChangedAlarm, hwSysResChangedAlarmResume, hwSessExceed, hwSessExceedClear, hwSessThresholdExceed, hwSessThresholdExceedClear, hwPingfFail, hwAclRuleExceed, hwAclRuleExceedClear, hwAclGroupExceed, hwAclGroupExceedClear, hwBoardResCriticalThresholdExceed, hwBoardResCriticalThresholdExceedResume, hwEMDIResLack, hwEMDIResLackResume, hwSaidPingPktModifiedAlarm, hwNetStreamIPv4OriginalFlowExceeded, hwNetStreamIPv4OriginalFlowFellBelow, hwNetStreamIPv4FlexibleFlowExceeded, hwNetStreamIPv4FlexibleFlowFellBelow, hwFwmFaultAlarm, hwFwmFaultAlarmResume, hwBoardNetworkSliceResourceInsufficient, hwBoardNetworkSliceResourceInsufficientResume, hwBoardNetworkSliceTrafficAbnormal, hwBoardNetworkSliceTrafficAbnormalResume, hwSessLeakEntryNumberThresholdExceed, hwSessLeakEntryNumberThresholdExceedClear, hwSessUnrecEntryNumberThresholdExceed, hwVlanSrcExeedAlarm, hwVlanSrcExeedResume, hwMcastElbExceed, hwMcastElbExceedClear, hwFwdTblmScanHndOverload, hwFwdTblmScanHndThresholdExceed, hwFwdTblmScanHndOverloadClear, hwFwdTblmScanHndThresholdExceedClear, hwCapwapNoFragmentAlarm, hwCapwapDiscardBroadcastAlarm, hwBoardNetworkSliceConflict, hwBoardNetworkSliceConflictResume, hwFwdTblResThresholdExceed, hwFwdTblResThresholdExceedClear, hwFwdEngineNotReady, hwFwdEngineNotReadyClear, hwIPv6SessLeakEntryNumberThresholdExceed, hwIPv6SessLeakEntryNumberThresholdExceedClear, hwIPv6SessUnrecEntryNumberThresholdExceed, hwIPv6SessExceed, hwIPv6SessExceedClear, hwIPv6SessThresholdExceed, hwIPv6SessThresholdExceedClear, hwHardwareSessThresholdExceed, hwHardwareSessThresholdExceedClear, hwHardwareSessExceedLimit, hwHardwareSessExceedLimitClear, hwNetStreamIPv6OriginalFlowExceeded, hwNetStreamIPv6OriginalFlowFellBelow, hwNetStreamIPv6FlexibleFlowExceeded, hwNetStreamIPv6FlexibleFlowFellBelow, hwFwmModuleFaultAlarm, hwFwmModuleFaultAlarmResume
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

// --- hwWholeFwdResLack (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.1
// Fields: hwEntPhysicalindex, entPhysicalName, hwFwdResLackReasonId
// Description: The alarm is generated when the system's forwarding engine resources are insufficient.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.1"] = [
    name: "hwWholeFwdResLack",
    fields: ["hwEntPhysicalindex", "entPhysicalName", "hwFwdResLackReasonId"],
    fieldOids: ["hwEntPhysicalindex": "1.3.6.1.4.1.2011.5.25.227.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwFwdResLackReasonId": "1.3.6.1.4.1.2011.5.25.227.1.3"]
]

// --- hwWholeFwdResLackResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.2
// Fields: hwEntPhysicalindex, entPhysicalName, hwFwdResLackReasonId
// Description: The alarm is generated when the system's forwarding engine resources are no longer insufficient.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.2"] = [
    name: "hwWholeFwdResLackResume",
    fields: ["hwEntPhysicalindex", "entPhysicalName", "hwFwdResLackReasonId"],
    fieldOids: ["hwEntPhysicalindex": "1.3.6.1.4.1.2011.5.25.227.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwFwdResLackReasonId": "1.3.6.1.4.1.2011.5.25.227.1.3"]
]

// --- hwBoardFwdResLack (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.3
// Fields: hwEntPhysicalindex, entPhysicalName, hwFwdResLackSlotStr, hwFwdResLackReasonId
// Description: The alarm is generated when a board's forwarding engine resources are insufficient.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.3"] = [
    name: "hwBoardFwdResLack",
    fields: ["hwEntPhysicalindex", "entPhysicalName", "hwFwdResLackSlotStr", "hwFwdResLackReasonId"],
    fieldOids: ["hwEntPhysicalindex": "1.3.6.1.4.1.2011.5.25.227.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwFwdResLackSlotStr": "1.3.6.1.4.1.2011.5.25.227.1.2", "hwFwdResLackReasonId": "1.3.6.1.4.1.2011.5.25.227.1.3"]
]

// --- hwBoardFwdResLackResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.4
// Fields: hwEntPhysicalindex, entPhysicalName, hwFwdResLackSlotStr, hwFwdResLackReasonId
// Description: The alarm is generated when a board's forwarding engine resources are no longer insufficient.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.4"] = [
    name: "hwBoardFwdResLackResume",
    fields: ["hwEntPhysicalindex", "entPhysicalName", "hwFwdResLackSlotStr", "hwFwdResLackReasonId"],
    fieldOids: ["hwEntPhysicalindex": "1.3.6.1.4.1.2011.5.25.227.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwFwdResLackSlotStr": "1.3.6.1.4.1.2011.5.25.227.1.2", "hwFwdResLackReasonId": "1.3.6.1.4.1.2011.5.25.227.1.3"]
]

// --- hwBoardL3FwdResLack (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.5
// Fields: hwFwdResThreshold, hwEntPhysicalindex, entPhysicalName, hwFwdResLackSlotStr, hwFwdResLackReasonId
// Description: The L3 forwarding engine resources were overloaded.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.5"] = [
    name: "hwBoardL3FwdResLack",
    fields: ["hwFwdResThreshold", "hwEntPhysicalindex", "entPhysicalName", "hwFwdResLackSlotStr", "hwFwdResLackReasonId"],
    fieldOids: ["hwFwdResThreshold": "1.3.6.1.4.1.2011.5.25.227.1.4", "hwEntPhysicalindex": "1.3.6.1.4.1.2011.5.25.227.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwFwdResLackSlotStr": "1.3.6.1.4.1.2011.5.25.227.1.2", "hwFwdResLackReasonId": "1.3.6.1.4.1.2011.5.25.227.1.3"]
]

// --- hwBoardL3FwdResLackResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.6
// Fields: hwFwdResThreshold, hwEntPhysicalindex, entPhysicalName, hwFwdResLackSlotStr, hwFwdResLackReasonId
// Description: The L3 forwarding engine resources were resumed.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.6"] = [
    name: "hwBoardL3FwdResLackResume",
    fields: ["hwFwdResThreshold", "hwEntPhysicalindex", "entPhysicalName", "hwFwdResLackSlotStr", "hwFwdResLackReasonId"],
    fieldOids: ["hwFwdResThreshold": "1.3.6.1.4.1.2011.5.25.227.1.4", "hwEntPhysicalindex": "1.3.6.1.4.1.2011.5.25.227.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwFwdResLackSlotStr": "1.3.6.1.4.1.2011.5.25.227.1.2", "hwFwdResLackReasonId": "1.3.6.1.4.1.2011.5.25.227.1.3"]
]

// --- hwBoardL3ACLResLack (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.7
// Fields: hwL3FailedService, hwFwdResLackSlotStr, hwFwdResLackReasonId
// Description: ACL failed to be delivered.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.7"] = [
    name: "hwBoardL3ACLResLack",
    fields: ["hwL3FailedService", "hwFwdResLackSlotStr", "hwFwdResLackReasonId"],
    fieldOids: ["hwL3FailedService": "1.3.6.1.4.1.2011.5.25.227.1.5", "hwFwdResLackSlotStr": "1.3.6.1.4.1.2011.5.25.227.1.2", "hwFwdResLackReasonId": "1.3.6.1.4.1.2011.5.25.227.1.3"]
]

// --- hwBoardL2mcResLack (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.8
// Fields: hwFwdResThreshold, hwFwdResLackSlotStr, hwFwdResLackReasonId
// Description: The l2mc index resources were overloaded.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.8"] = [
    name: "hwBoardL2mcResLack",
    fields: ["hwFwdResThreshold", "hwFwdResLackSlotStr", "hwFwdResLackReasonId"],
    fieldOids: ["hwFwdResThreshold": "1.3.6.1.4.1.2011.5.25.227.1.4", "hwFwdResLackSlotStr": "1.3.6.1.4.1.2011.5.25.227.1.2", "hwFwdResLackReasonId": "1.3.6.1.4.1.2011.5.25.227.1.3"]
]

// --- hwBoardL2mcResLackResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.9
// Fields: hwFwdResThreshold, hwFwdResLackSlotStr, hwFwdResLackReasonId
// Description: The l2mc index resources were resumed.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.9"] = [
    name: "hwBoardL2mcResLackResume",
    fields: ["hwFwdResThreshold", "hwFwdResLackSlotStr", "hwFwdResLackReasonId"],
    fieldOids: ["hwFwdResThreshold": "1.3.6.1.4.1.2011.5.25.227.1.4", "hwFwdResLackSlotStr": "1.3.6.1.4.1.2011.5.25.227.1.2", "hwFwdResLackReasonId": "1.3.6.1.4.1.2011.5.25.227.1.3"]
]

// --- hwBoardIpmcResLack (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.10
// Fields: hwFwdResThreshold, hwFwdResLackSlotStr, hwFwdResLackReasonId
// Description: The ipmc index resources were overloaded.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.10"] = [
    name: "hwBoardIpmcResLack",
    fields: ["hwFwdResThreshold", "hwFwdResLackSlotStr", "hwFwdResLackReasonId"],
    fieldOids: ["hwFwdResThreshold": "1.3.6.1.4.1.2011.5.25.227.1.4", "hwFwdResLackSlotStr": "1.3.6.1.4.1.2011.5.25.227.1.2", "hwFwdResLackReasonId": "1.3.6.1.4.1.2011.5.25.227.1.3"]
]

// --- hwBoardIpmcResLackResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.11
// Fields: hwFwdResThreshold, hwFwdResLackSlotStr, hwFwdResLackReasonId
// Description: The ipmc index resources were resumed.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.11"] = [
    name: "hwBoardIpmcResLackResume",
    fields: ["hwFwdResThreshold", "hwFwdResLackSlotStr", "hwFwdResLackReasonId"],
    fieldOids: ["hwFwdResThreshold": "1.3.6.1.4.1.2011.5.25.227.1.4", "hwFwdResLackSlotStr": "1.3.6.1.4.1.2011.5.25.227.1.2", "hwFwdResLackReasonId": "1.3.6.1.4.1.2011.5.25.227.1.3"]
]

// --- hwBoardServiceFailed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.12
// Fields: hwCommand, hwViewName, hwFwdResLackReasonId, hwReasonDescription, hwFwdResLackSlotStr
// Description: Service failed because resources were overloaded.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.12"] = [
    name: "hwBoardServiceFailed",
    fields: ["hwCommand", "hwViewName", "hwFwdResLackReasonId", "hwReasonDescription", "hwFwdResLackSlotStr"],
    fieldOids: ["hwCommand": "1.3.6.1.4.1.2011.5.25.227.1.6", "hwViewName": "1.3.6.1.4.1.2011.5.25.227.1.7", "hwFwdResLackReasonId": "1.3.6.1.4.1.2011.5.25.227.1.3", "hwReasonDescription": "1.3.6.1.4.1.2011.5.25.227.1.8", "hwFwdResLackSlotStr": "1.3.6.1.4.1.2011.5.25.227.1.2"]
]

// --- hwWholeFwdResThresholdExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.13
// Fields: hwEntPhysicalindex, entPhysicalName, hwFwdResLackReasonId
// Description: Too many services are configured, and the upper limit of the system's forwarding resources is reached.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.13"] = [
    name: "hwWholeFwdResThresholdExceed",
    fields: ["hwEntPhysicalindex", "entPhysicalName", "hwFwdResLackReasonId"],
    fieldOids: ["hwEntPhysicalindex": "1.3.6.1.4.1.2011.5.25.227.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwFwdResLackReasonId": "1.3.6.1.4.1.2011.5.25.227.1.3"]
]

// --- hwWholeFwdResThresholdExceedResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.14
// Fields: hwEntPhysicalindex, entPhysicalName, hwFwdResLackReasonId
// Description: The value of this object identifies an FP resource type. 1: Label resources (1) 2. IID resources (2) 3. Resources of an unknown type (100).
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.14"] = [
    name: "hwWholeFwdResThresholdExceedResume",
    fields: ["hwEntPhysicalindex", "entPhysicalName", "hwFwdResLackReasonId"],
    fieldOids: ["hwEntPhysicalindex": "1.3.6.1.4.1.2011.5.25.227.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwFwdResLackReasonId": "1.3.6.1.4.1.2011.5.25.227.1.3"]
]

// --- hwBoardFwdResThresholdExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.15
// Fields: hwEntPhysicalindex, entPhysicalName, hwFwdResLackSlotStr, hwFwdResLackReasonId
// Description: The value of this object identifies the number of current FP resources.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.15"] = [
    name: "hwBoardFwdResThresholdExceed",
    fields: ["hwEntPhysicalindex", "entPhysicalName", "hwFwdResLackSlotStr", "hwFwdResLackReasonId"],
    fieldOids: ["hwEntPhysicalindex": "1.3.6.1.4.1.2011.5.25.227.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwFwdResLackSlotStr": "1.3.6.1.4.1.2011.5.25.227.1.2", "hwFwdResLackReasonId": "1.3.6.1.4.1.2011.5.25.227.1.3"]
]

// --- hwBoardFwdResThresholdExceedResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.16
// Fields: hwEntPhysicalindex, entPhysicalName, hwFwdResLackSlotStr, hwFwdResLackReasonId
// Description: The value of this object identifies the total number of FP resources.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.16"] = [
    name: "hwBoardFwdResThresholdExceedResume",
    fields: ["hwEntPhysicalindex", "entPhysicalName", "hwFwdResLackSlotStr", "hwFwdResLackReasonId"],
    fieldOids: ["hwEntPhysicalindex": "1.3.6.1.4.1.2011.5.25.227.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwFwdResLackSlotStr": "1.3.6.1.4.1.2011.5.25.227.1.2", "hwFwdResLackReasonId": "1.3.6.1.4.1.2011.5.25.227.1.3"]
]

// --- hwBoardMplsPhpNonsupport (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.17
// Fields: hwFwdResLackSlotStr
// Description: One or more boards do not support MPLS PHP.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.17"] = [
    name: "hwBoardMplsPhpNonsupport",
    fields: ["hwFwdResLackSlotStr"],
    fieldOids: ["hwFwdResLackSlotStr": "1.3.6.1.4.1.2011.5.25.227.1.2"]
]

// --- hwBoardResThresholdExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.18
// Fields: hwFwdResLackSlotStr, hwFwdResThreshold, hwFwdResLackReasonId, hwReasonDescription
// Description: The number of forwarding resources reaches the alarm threshold.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.18"] = [
    name: "hwBoardResThresholdExceed",
    fields: ["hwFwdResLackSlotStr", "hwFwdResThreshold", "hwFwdResLackReasonId", "hwReasonDescription"],
    fieldOids: ["hwFwdResLackSlotStr": "1.3.6.1.4.1.2011.5.25.227.1.2", "hwFwdResThreshold": "1.3.6.1.4.1.2011.5.25.227.1.4", "hwFwdResLackReasonId": "1.3.6.1.4.1.2011.5.25.227.1.3", "hwReasonDescription": "1.3.6.1.4.1.2011.5.25.227.1.8"]
]

// --- hwBoardResThresholdExceedResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.19
// Fields: hwFwdResLackSlotStr, hwFwdResThreshold, hwFwdResLackReasonId, hwReasonDescription
// Description: The number of forwarding engine resources is less than the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.19"] = [
    name: "hwBoardResThresholdExceedResume",
    fields: ["hwFwdResLackSlotStr", "hwFwdResThreshold", "hwFwdResLackReasonId", "hwReasonDescription"],
    fieldOids: ["hwFwdResLackSlotStr": "1.3.6.1.4.1.2011.5.25.227.1.2", "hwFwdResThreshold": "1.3.6.1.4.1.2011.5.25.227.1.4", "hwFwdResLackReasonId": "1.3.6.1.4.1.2011.5.25.227.1.3", "hwReasonDescription": "1.3.6.1.4.1.2011.5.25.227.1.8"]
]

// --- hwBoardResWarningThresholdExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.20
// Fields: hwFwdResLackSlotStr, hwFwdResThreshold, hwFwdResLackReasonId, hwReasonDescription
// Description: The number of board forwarding engine resources reaches the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.20"] = [
    name: "hwBoardResWarningThresholdExceed",
    fields: ["hwFwdResLackSlotStr", "hwFwdResThreshold", "hwFwdResLackReasonId", "hwReasonDescription"],
    fieldOids: ["hwFwdResLackSlotStr": "1.3.6.1.4.1.2011.5.25.227.1.2", "hwFwdResThreshold": "1.3.6.1.4.1.2011.5.25.227.1.4", "hwFwdResLackReasonId": "1.3.6.1.4.1.2011.5.25.227.1.3", "hwReasonDescription": "1.3.6.1.4.1.2011.5.25.227.1.8"]
]

// --- hwBoardResWarningThresholdExceedResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.21
// Fields: hwFwdResLackSlotStr, hwFwdResThreshold, hwFwdResLackReasonId, hwReasonDescription
// Description: The number of board forwarding engine resources is less than the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.21"] = [
    name: "hwBoardResWarningThresholdExceedResume",
    fields: ["hwFwdResLackSlotStr", "hwFwdResThreshold", "hwFwdResLackReasonId", "hwReasonDescription"],
    fieldOids: ["hwFwdResLackSlotStr": "1.3.6.1.4.1.2011.5.25.227.1.2", "hwFwdResThreshold": "1.3.6.1.4.1.2011.5.25.227.1.4", "hwFwdResLackReasonId": "1.3.6.1.4.1.2011.5.25.227.1.3", "hwReasonDescription": "1.3.6.1.4.1.2011.5.25.227.1.8"]
]

// --- hwBoardIPv6ACLResLack (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.22
// Fields: hwViewName, hwFwdResLackSlotStr
// Description: Service failed because of insufficient resources.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.22"] = [
    name: "hwBoardIPv6ACLResLack",
    fields: ["hwViewName", "hwFwdResLackSlotStr"],
    fieldOids: ["hwViewName": "1.3.6.1.4.1.2011.5.25.227.1.7", "hwFwdResLackSlotStr": "1.3.6.1.4.1.2011.5.25.227.1.2"]
]

// --- hwBoardMplsPhpResLack (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.23
// Fields: hwFwdResLackSlotStr
// Description: PHP labels added failed because of insufficient resource.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.23"] = [
    name: "hwBoardMplsPhpResLack",
    fields: ["hwFwdResLackSlotStr"],
    fieldOids: ["hwFwdResLackSlotStr": "1.3.6.1.4.1.2011.5.25.227.1.2"]
]

// --- hwFwdProcFailForLCS (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.2.1
// Fields: hwFwdLicenseName, hwFwdResLackSlotStr, hwFwdProcFailForLCSOperationId
// Description: Operation is failed by reason of the license is not authorized.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.2.1"] = [
    name: "hwFwdProcFailForLCS",
    fields: ["hwFwdLicenseName", "hwFwdResLackSlotStr", "hwFwdProcFailForLCSOperationId"],
    fieldOids: ["hwFwdLicenseName": "1.3.6.1.4.1.2011.5.25.227.1.11", "hwFwdResLackSlotStr": "1.3.6.1.4.1.2011.5.25.227.1.2", "hwFwdProcFailForLCSOperationId": "1.3.6.1.4.1.2011.5.25.227.1.10"]
]

// --- hwFwdProcFailForLCSResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.2.2
// Fields: hwFwdLicenseName, hwFwdResLackSlotStr, hwFwdProcFailForLCSOperationId
// Description: The license is authorized.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.2.2"] = [
    name: "hwFwdProcFailForLCSResume",
    fields: ["hwFwdLicenseName", "hwFwdResLackSlotStr", "hwFwdProcFailForLCSOperationId"],
    fieldOids: ["hwFwdLicenseName": "1.3.6.1.4.1.2011.5.25.227.1.11", "hwFwdResLackSlotStr": "1.3.6.1.4.1.2011.5.25.227.1.2", "hwFwdProcFailForLCSOperationId": "1.3.6.1.4.1.2011.5.25.227.1.10"]
]

// --- hwFwdEntryConflict (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.3.1
// Fields: hwFwdResLackSlotStr, hwFwdResLackReasonId
// Description: Table check failed.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.3.1"] = [
    name: "hwFwdEntryConflict",
    fields: ["hwFwdResLackSlotStr", "hwFwdResLackReasonId"],
    fieldOids: ["hwFwdResLackSlotStr": "1.3.6.1.4.1.2011.5.25.227.1.2", "hwFwdResLackReasonId": "1.3.6.1.4.1.2011.5.25.227.1.3"]
]

// --- hwFwdEntryConflictResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.3.2
// Fields: hwFwdResLackSlotStr, hwFwdResLackReasonId
// Description: The table check failure was removed.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.3.2"] = [
    name: "hwFwdEntryConflictResume",
    fields: ["hwFwdResLackSlotStr", "hwFwdResLackReasonId"],
    fieldOids: ["hwFwdResLackSlotStr": "1.3.6.1.4.1.2011.5.25.227.1.2", "hwFwdResLackReasonId": "1.3.6.1.4.1.2011.5.25.227.1.3"]
]

// --- hwFwdEntryInconsistent (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.3.3
// Fields: hwServiceType, hwServiceIndex, hwServiceIndex2, hwServiceIndex3, hwServiceIndex4, hwReasonDescription
// Description: Service table check inconsistent.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.3.3"] = [
    name: "hwFwdEntryInconsistent",
    fields: ["hwServiceType", "hwServiceIndex", "hwServiceIndex2", "hwServiceIndex3", "hwServiceIndex4", "hwReasonDescription"],
    fieldOids: ["hwServiceType": "1.3.6.1.4.1.2011.5.25.227.1.20", "hwServiceIndex": "1.3.6.1.4.1.2011.5.25.227.1.21", "hwServiceIndex2": "1.3.6.1.4.1.2011.5.25.227.1.22", "hwServiceIndex3": "1.3.6.1.4.1.2011.5.25.227.1.23", "hwServiceIndex4": "1.3.6.1.4.1.2011.5.25.227.1.24", "hwReasonDescription": "1.3.6.1.4.1.2011.5.25.227.1.8"]
]

// --- hwFwdEntryInconsistentResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.3.4
// Fields: hwServiceType, hwServiceIndex, hwServiceIndex2, hwServiceIndex3, hwServiceIndex4, hwReasonDescription
// Description: The service table check inconsistent was removed.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.3.4"] = [
    name: "hwFwdEntryInconsistentResume",
    fields: ["hwServiceType", "hwServiceIndex", "hwServiceIndex2", "hwServiceIndex3", "hwServiceIndex4", "hwReasonDescription"],
    fieldOids: ["hwServiceType": "1.3.6.1.4.1.2011.5.25.227.1.20", "hwServiceIndex": "1.3.6.1.4.1.2011.5.25.227.1.21", "hwServiceIndex2": "1.3.6.1.4.1.2011.5.25.227.1.22", "hwServiceIndex3": "1.3.6.1.4.1.2011.5.25.227.1.23", "hwServiceIndex4": "1.3.6.1.4.1.2011.5.25.227.1.24", "hwReasonDescription": "1.3.6.1.4.1.2011.5.25.227.1.8"]
]

// --- hwFibDeliverFailed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.3.7
// Fields: hwFibDeliverSlotId
// Description: The route failed to be delivered because of internal error.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.3.7"] = [
    name: "hwFibDeliverFailed",
    fields: ["hwFibDeliverSlotId"],
    fieldOids: ["hwFibDeliverSlotId": "1.3.6.1.4.1.2011.5.25.227.1.54"]
]

// --- hwFibDeliverFailedResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.3.8
// Fields: hwFibDeliverSlotId
// Description: The route success to be delivered in 24hours.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.3.8"] = [
    name: "hwFibDeliverFailedResume",
    fields: ["hwFibDeliverSlotId"],
    fieldOids: ["hwFibDeliverSlotId": "1.3.6.1.4.1.2011.5.25.227.1.54"]
]

// --- hwFwdDataSyncIncomplete (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.4.1
// Fields: hwFwdResIncomReasonId
// Description: Data synchronization is incomplete.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.4.1"] = [
    name: "hwFwdDataSyncIncomplete",
    fields: ["hwFwdResIncomReasonId"],
    fieldOids: ["hwFwdResIncomReasonId": "1.3.6.1.4.1.2011.5.25.227.1.31"]
]

// --- hwFwdDataSyncIncompleteResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.4.2
// Fields: hwFwdResIncomReasonId
// Description: Data synchronization is restored.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.4.2"] = [
    name: "hwFwdDataSyncIncompleteResume",
    fields: ["hwFwdResIncomReasonId"],
    fieldOids: ["hwFwdResIncomReasonId": "1.3.6.1.4.1.2011.5.25.227.1.31"]
]

// --- hwResourceOverwrittenAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.5.1
// Fields: hwResOverwrittenSlot, hwResOverwrittenResType
// Description: Chip resources are overwritten.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.5.1"] = [
    name: "hwResourceOverwrittenAlarm",
    fields: ["hwResOverwrittenSlot", "hwResOverwrittenResType"],
    fieldOids: ["hwResOverwrittenSlot": "1.3.6.1.4.1.2011.5.25.227.1.32", "hwResOverwrittenResType": "1.3.6.1.4.1.2011.5.25.227.1.33"]
]

// --- hwResourceOverwrittenAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.5.2
// Fields: hwResOverwrittenSlot, hwResOverwrittenResType
// Description: Overwritten chip resources are recovered.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.5.2"] = [
    name: "hwResourceOverwrittenAlarmResume",
    fields: ["hwResOverwrittenSlot", "hwResOverwrittenResType"],
    fieldOids: ["hwResOverwrittenSlot": "1.3.6.1.4.1.2011.5.25.227.1.32", "hwResOverwrittenResType": "1.3.6.1.4.1.2011.5.25.227.1.33"]
]

// --- hwBoardFwdMsgCongest (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.6.1
// Fields: hwFwdResLackSlotStr, hwFwdResLackFeNodeId, hwFwdResCongestReasonId
// Description: The message forwarding on the board is congested.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.6.1"] = [
    name: "hwBoardFwdMsgCongest",
    fields: ["hwFwdResLackSlotStr", "hwFwdResLackFeNodeId", "hwFwdResCongestReasonId"],
    fieldOids: ["hwFwdResLackSlotStr": "1.3.6.1.4.1.2011.5.25.227.1.2", "hwFwdResLackFeNodeId": "1.3.6.1.4.1.2011.5.25.227.1.35", "hwFwdResCongestReasonId": "1.3.6.1.4.1.2011.5.25.227.1.34"]
]

// --- hwBoardFwdMsgCongestResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.6.2
// Fields: hwFwdResLackSlotStr, hwFwdResLackFeNodeId, hwFwdResCongestReasonId
// Description: The message forwarding congestion is resolved.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.6.2"] = [
    name: "hwBoardFwdMsgCongestResume",
    fields: ["hwFwdResLackSlotStr", "hwFwdResLackFeNodeId", "hwFwdResCongestReasonId"],
    fieldOids: ["hwFwdResLackSlotStr": "1.3.6.1.4.1.2011.5.25.227.1.2", "hwFwdResLackFeNodeId": "1.3.6.1.4.1.2011.5.25.227.1.35", "hwFwdResCongestReasonId": "1.3.6.1.4.1.2011.5.25.227.1.34"]
]

// --- hwMcLeafCfcCheck (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.7.1
// Fields: hwMcLeafCfcCheckSlot
// Description: The multicast leaf count check inconsistent.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.7.1"] = [
    name: "hwMcLeafCfcCheck",
    fields: ["hwMcLeafCfcCheckSlot"],
    fieldOids: ["hwMcLeafCfcCheckSlot": "1.3.6.1.4.1.2011.5.25.227.1.49"]
]

// --- hwMcLeafCfcCheckResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.7.2
// Fields: hwMcLeafCfcCheckSlot
// Description: The multicast leaf count check inconsistent was removed.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.7.2"] = [
    name: "hwMcLeafCfcCheckResume",
    fields: ["hwMcLeafCfcCheckSlot"],
    fieldOids: ["hwMcLeafCfcCheckSlot": "1.3.6.1.4.1.2011.5.25.227.1.49"]
]

// --- hwMplsLabelExceedAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.8.1
// Description: The number of labels exceeds the device's encapsulation capability.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.8.1"] = [
    name: "hwMplsLabelExceedAlarm",
    fields: [],
    fieldOids: []
]

// --- hwMplsLabelExceedAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.8.2
// Description: The problem that the number of labels exceeds the device's encapsulation capability has been resolved.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.8.2"] = [
    name: "hwMplsLabelExceedAlarmResume",
    fields: [],
    fieldOids: []
]

// --- hwVxlanNveMacConflict (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.9.1
// Fields: hwVxlanNveMac, hwVxlanTnlPeerIpAddr
// Description: MAC addresses of NVE interfaces on distributed VXLAN gateways conflict.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.9.1"] = [
    name: "hwVxlanNveMacConflict",
    fields: ["hwVxlanNveMac", "hwVxlanTnlPeerIpAddr"],
    fieldOids: ["hwVxlanNveMac": "1.3.6.1.4.1.2011.5.25.227.1.52", "hwVxlanTnlPeerIpAddr": "1.3.6.1.4.1.2011.5.25.227.1.51"]
]

// --- hwVxlanNveMacConflictClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.9.2
// Fields: hwVxlanNveMac, hwVxlanTnlPeerIpAddr
// Description: MAC addresses of NVE interfaces on distributed VXLAN gateways conflict resolved.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.9.2"] = [
    name: "hwVxlanNveMacConflictClear",
    fields: ["hwVxlanNveMac", "hwVxlanTnlPeerIpAddr"],
    fieldOids: ["hwVxlanNveMac": "1.3.6.1.4.1.2011.5.25.227.1.52", "hwVxlanTnlPeerIpAddr": "1.3.6.1.4.1.2011.5.25.227.1.51"]
]

// --- hwNsOrigFlexFlowExceedAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.10.1
// Fields: hwFwdResLackSlotStr
// Description: The usage of NetStream original and flexible flow entries exceeded 80%.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.10.1"] = [
    name: "hwNsOrigFlexFlowExceedAlarm",
    fields: ["hwFwdResLackSlotStr"],
    fieldOids: ["hwFwdResLackSlotStr": "1.3.6.1.4.1.2011.5.25.227.1.2"]
]

// --- hwNsOrigFlexFlowExceedResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.10.2
// Fields: hwFwdResLackSlotStr
// Description: The usage of NetStream original and flexible flow entries fell below 70%.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.10.2"] = [
    name: "hwNsOrigFlexFlowExceedResume",
    fields: ["hwFwdResLackSlotStr"],
    fieldOids: ["hwFwdResLackSlotStr": "1.3.6.1.4.1.2011.5.25.227.1.2"]
]

// --- hwNsAggFlowExceedAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.10.3
// Fields: hwFwdResLackSlotStr
// Description: The usage of NetStream aggregation flow entries exceeded 80%.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.10.3"] = [
    name: "hwNsAggFlowExceedAlarm",
    fields: ["hwFwdResLackSlotStr"],
    fieldOids: ["hwFwdResLackSlotStr": "1.3.6.1.4.1.2011.5.25.227.1.2"]
]

// --- hwNsAggFlowExceedResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.10.4
// Fields: hwFwdResLackSlotStr
// Description: The usage of NetStream aggregation flow entries fell below 70%.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.10.4"] = [
    name: "hwNsAggFlowExceedResume",
    fields: ["hwFwdResLackSlotStr"],
    fieldOids: ["hwFwdResLackSlotStr": "1.3.6.1.4.1.2011.5.25.227.1.2"]
]

// --- hwNvo3VxlanSrcIpDiffAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.11.1
// Fields: hwVxlanTnlPeerIpAddr
// Description: Multiple VXLAN tunnels have different local IP addresses and the same destination IP address, which may affect traffic forwarding. Change the local IP addresses to be the same.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.11.1"] = [
    name: "hwNvo3VxlanSrcIpDiffAlarm",
    fields: ["hwVxlanTnlPeerIpAddr"],
    fieldOids: ["hwVxlanTnlPeerIpAddr": "1.3.6.1.4.1.2011.5.25.227.1.51"]
]

// --- hwNvo3VxlanSrcIpDiffAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.11.2
// Fields: hwVxlanTnlPeerIpAddr
// Description: The alarm caused by different local IP addresses of multiple VXLAN tunnels is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.11.2"] = [
    name: "hwNvo3VxlanSrcIpDiffAlarmResume",
    fields: ["hwVxlanTnlPeerIpAddr"],
    fieldOids: ["hwVxlanTnlPeerIpAddr": "1.3.6.1.4.1.2011.5.25.227.1.51"]
]

// --- hwPacketChange (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.12.1
// Fields: hwPacketChangeInPort, hwPacketChangeOutPort
// Description: Packets are changed.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.12.1"] = [
    name: "hwPacketChange",
    fields: ["hwPacketChangeInPort", "hwPacketChangeOutPort"],
    fieldOids: ["hwPacketChangeInPort": "1.3.6.1.4.1.2011.5.25.227.1.66", "hwPacketChangeOutPort": "1.3.6.1.4.1.2011.5.25.227.1.67"]
]

// --- hwPacketChangeClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.12.2
// Fields: hwPacketChangeInPort, hwPacketChangeOutPort
// Description: Packets are no longer changed.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.12.2"] = [
    name: "hwPacketChangeClear",
    fields: ["hwPacketChangeInPort", "hwPacketChangeOutPort"],
    fieldOids: ["hwPacketChangeInPort": "1.3.6.1.4.1.2011.5.25.227.1.66", "hwPacketChangeOutPort": "1.3.6.1.4.1.2011.5.25.227.1.67"]
]

// --- hwFesEnterSpecialMode (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.13.1
// Fields: hwEnterModeReasonId, hwEnterModeId, hwEnterModeReasonDescription
// Description: FES enters the special processing mode.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.13.1"] = [
    name: "hwFesEnterSpecialMode",
    fields: ["hwEnterModeReasonId", "hwEnterModeId", "hwEnterModeReasonDescription"],
    fieldOids: ["hwEnterModeReasonId": "1.3.6.1.4.1.2011.5.25.227.1.102", "hwEnterModeId": "1.3.6.1.4.1.2011.5.25.227.1.103", "hwEnterModeReasonDescription": "1.3.6.1.4.1.2011.5.25.227.1.105"]
]

// --- hwFesEnterSpecialModeResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.13.2
// Fields: hwEnterModeReasonId, hwEnterModeId, hwEnterModeReasonDescription
// Description: FES restores to the normal processing mode.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.13.2"] = [
    name: "hwFesEnterSpecialModeResume",
    fields: ["hwEnterModeReasonId", "hwEnterModeId", "hwEnterModeReasonDescription"],
    fieldOids: ["hwEnterModeReasonId": "1.3.6.1.4.1.2011.5.25.227.1.102", "hwEnterModeId": "1.3.6.1.4.1.2011.5.25.227.1.103", "hwEnterModeReasonDescription": "1.3.6.1.4.1.2011.5.25.227.1.105"]
]

// --- hwNvo3VxlanVniConflict (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.14.1
// Fields: hwVxlanVni
// Description: The VNI bound to the local BD conflicts with the VNI bound to the VPN advertised by the remote end to the local end.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.14.1"] = [
    name: "hwNvo3VxlanVniConflict",
    fields: ["hwVxlanVni"],
    fieldOids: ["hwVxlanVni": "1.3.6.1.4.1.2011.5.25.227.1.104"]
]

// --- hwNvo3VxlanVniConflictResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.14.2
// Fields: hwVxlanVni
// Description: The conflict between the VNI bound to the local BD and the VNI bound to the VPN advertised by the remote end to the local end is resolved.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.14.2"] = [
    name: "hwNvo3VxlanVniConflictResume",
    fields: ["hwVxlanVni"],
    fieldOids: ["hwVxlanVni": "1.3.6.1.4.1.2011.5.25.227.1.104"]
]

// --- hwBoardMplsNonSupport (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.24
// Fields: hwFwdResLackSlotStr
// Description: The board does not support the MPLS function due to hardware limit, it will be reset.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.24"] = [
    name: "hwBoardMplsNonSupport",
    fields: ["hwFwdResLackSlotStr"],
    fieldOids: ["hwFwdResLackSlotStr": "1.3.6.1.4.1.2011.5.25.227.1.2"]
]

// --- hwBoardMplsFwdResLack (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.25
// Fields: hwEntPhysicalindex, hwFwdResLackSlotStr, hwFwdResLackReasonId, hwFwdResThreshold
// Description: The MPLS forwarding engine resources were overloaded.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.25"] = [
    name: "hwBoardMplsFwdResLack",
    fields: ["hwEntPhysicalindex", "hwFwdResLackSlotStr", "hwFwdResLackReasonId", "hwFwdResThreshold"],
    fieldOids: ["hwEntPhysicalindex": "1.3.6.1.4.1.2011.5.25.227.1.1", "hwFwdResLackSlotStr": "1.3.6.1.4.1.2011.5.25.227.1.2", "hwFwdResLackReasonId": "1.3.6.1.4.1.2011.5.25.227.1.3", "hwFwdResThreshold": "1.3.6.1.4.1.2011.5.25.227.1.4"]
]

// --- hwBoardMplsFwdResLackResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.26
// Fields: hwEntPhysicalindex, hwFwdResLackSlotStr, hwFwdResLackReasonId, hwFwdResThreshold
// Description: The MPLS forwarding engine resources were resumed.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.26"] = [
    name: "hwBoardMplsFwdResLackResume",
    fields: ["hwEntPhysicalindex", "hwFwdResLackSlotStr", "hwFwdResLackReasonId", "hwFwdResThreshold"],
    fieldOids: ["hwEntPhysicalindex": "1.3.6.1.4.1.2011.5.25.227.1.1", "hwFwdResLackSlotStr": "1.3.6.1.4.1.2011.5.25.227.1.2", "hwFwdResLackReasonId": "1.3.6.1.4.1.2011.5.25.227.1.3", "hwFwdResThreshold": "1.3.6.1.4.1.2011.5.25.227.1.4"]
]

// --- hwFwdResOverLimit (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.27
// Fields: hwFwdResLimit, hwFwdResCurThroughput
// Description: The current average system throughput exceeded the bandwidth configured for the license.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.27"] = [
    name: "hwFwdResOverLimit",
    fields: ["hwFwdResLimit", "hwFwdResCurThroughput"],
    fieldOids: ["hwFwdResLimit": "1.3.6.1.4.1.2011.5.25.227.1.12.1.2", "hwFwdResCurThroughput": "1.3.6.1.4.1.2011.5.25.227.1.12.1.3"]
]

// --- hwFwdResOverLimitResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.28
// Fields: hwFwdResLimit, hwFwdResCurThroughput
// Description: The current average system throughput decreased below the bandwidth configured for the license.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.28"] = [
    name: "hwFwdResOverLimitResume",
    fields: ["hwFwdResLimit", "hwFwdResCurThroughput"],
    fieldOids: ["hwFwdResLimit": "1.3.6.1.4.1.2011.5.25.227.1.12.1.2", "hwFwdResCurThroughput": "1.3.6.1.4.1.2011.5.25.227.1.12.1.3"]
]

// --- hwFwdResOverThresh (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.29
// Fields: hwFwdResLimit, hwFwdResCurThroughput
// Description: The current average system throughput exceeded 95% of the bandwidth configured for the license.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.29"] = [
    name: "hwFwdResOverThresh",
    fields: ["hwFwdResLimit", "hwFwdResCurThroughput"],
    fieldOids: ["hwFwdResLimit": "1.3.6.1.4.1.2011.5.25.227.1.12.1.2", "hwFwdResCurThroughput": "1.3.6.1.4.1.2011.5.25.227.1.12.1.3"]
]

// --- hwFwdResOverThreshResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.30
// Fields: hwFwdResLimit, hwFwdResCurThroughput
// Description: The current average system throughput decreased below 95% of the bandwidth configured for the license
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.30"] = [
    name: "hwFwdResOverThreshResume",
    fields: ["hwFwdResLimit", "hwFwdResCurThroughput"],
    fieldOids: ["hwFwdResLimit": "1.3.6.1.4.1.2011.5.25.227.1.12.1.2", "hwFwdResCurThroughput": "1.3.6.1.4.1.2011.5.25.227.1.12.1.3"]
]

// --- hwFpResourceThresholdExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.31
// Fields: hwFpId, hwFpResourceType, hwFpResourceCurrentCount, hwFpResourceTotalCount, hwFpResourceThresholdUpperLimit, hwFpResourceThresholdLowerLimit
// Description: This object indicates that the number of FP resources has exceeded the upper threshold.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.31"] = [
    name: "hwFpResourceThresholdExceed",
    fields: ["hwFpId", "hwFpResourceType", "hwFpResourceCurrentCount", "hwFpResourceTotalCount", "hwFpResourceThresholdUpperLimit", "hwFpResourceThresholdLowerLimit"],
    fieldOids: ["hwFpId": "1.3.6.1.4.1.2011.5.25.227.1.13", "hwFpResourceType": "1.3.6.1.4.1.2011.5.25.227.1.14", "hwFpResourceCurrentCount": "1.3.6.1.4.1.2011.5.25.227.1.15", "hwFpResourceTotalCount": "1.3.6.1.4.1.2011.5.25.227.1.16", "hwFpResourceThresholdUpperLimit": "1.3.6.1.4.1.2011.5.25.227.1.17", "hwFpResourceThresholdLowerLimit": "1.3.6.1.4.1.2011.5.25.227.1.18"]
]

// --- hwFpResourceThresholdExceedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.32
// Fields: hwFpId, hwFpResourceType, hwFpResourceCurrentCount, hwFpResourceTotalCount, hwFpResourceThresholdUpperLimit, hwFpResourceThresholdLowerLimit
// Description: This object indicates that the number of FP resources has fallen below the lower threshold.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.32"] = [
    name: "hwFpResourceThresholdExceedClear",
    fields: ["hwFpId", "hwFpResourceType", "hwFpResourceCurrentCount", "hwFpResourceTotalCount", "hwFpResourceThresholdUpperLimit", "hwFpResourceThresholdLowerLimit"],
    fieldOids: ["hwFpId": "1.3.6.1.4.1.2011.5.25.227.1.13", "hwFpResourceType": "1.3.6.1.4.1.2011.5.25.227.1.14", "hwFpResourceCurrentCount": "1.3.6.1.4.1.2011.5.25.227.1.15", "hwFpResourceTotalCount": "1.3.6.1.4.1.2011.5.25.227.1.16", "hwFpResourceThresholdUpperLimit": "1.3.6.1.4.1.2011.5.25.227.1.17", "hwFpResourceThresholdLowerLimit": "1.3.6.1.4.1.2011.5.25.227.1.18"]
]

// --- hwFpResourceTotalCountExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.33
// Fields: hwFpId, hwFpResourceType, hwFpResourceCurrentCount, hwFpResourceTotalCount
// Description: This object indicates that the number of FP resources has reached the maximum number.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.33"] = [
    name: "hwFpResourceTotalCountExceed",
    fields: ["hwFpId", "hwFpResourceType", "hwFpResourceCurrentCount", "hwFpResourceTotalCount"],
    fieldOids: ["hwFpId": "1.3.6.1.4.1.2011.5.25.227.1.13", "hwFpResourceType": "1.3.6.1.4.1.2011.5.25.227.1.14", "hwFpResourceCurrentCount": "1.3.6.1.4.1.2011.5.25.227.1.15", "hwFpResourceTotalCount": "1.3.6.1.4.1.2011.5.25.227.1.16"]
]

// --- hwFpResourceTotalCountExceedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.34
// Fields: hwFpId, hwFpResourceType, hwFpResourceCurrentCount, hwFpResourceTotalCount
// Description: This object indicates that the number of FP resources fallen below the clear alarm threshold.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.34"] = [
    name: "hwFpResourceTotalCountExceedClear",
    fields: ["hwFpId", "hwFpResourceType", "hwFpResourceCurrentCount", "hwFpResourceTotalCount"],
    fieldOids: ["hwFpId": "1.3.6.1.4.1.2011.5.25.227.1.13", "hwFpResourceType": "1.3.6.1.4.1.2011.5.25.227.1.14", "hwFpResourceCurrentCount": "1.3.6.1.4.1.2011.5.25.227.1.15", "hwFpResourceTotalCount": "1.3.6.1.4.1.2011.5.25.227.1.16"]
]

// --- hwVpresExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.35
// Fields: hwVpFeatureName, hwFwdResLackSlotStr
// Description: The number of Virtual Ports exceeded the specification of the forwarding engine resources.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.35"] = [
    name: "hwVpresExceed",
    fields: ["hwVpFeatureName", "hwFwdResLackSlotStr"],
    fieldOids: ["hwVpFeatureName": "1.3.6.1.4.1.2011.5.25.227.1.19", "hwFwdResLackSlotStr": "1.3.6.1.4.1.2011.5.25.227.1.2"]
]

// --- hwFwdSessionResLack (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.36
// Fields: hwFwdSessionResUsage
// Description: The device session resources were overloaded.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.36"] = [
    name: "hwFwdSessionResLack",
    fields: ["hwFwdSessionResUsage"],
    fieldOids: ["hwFwdSessionResUsage": "1.3.6.1.4.1.2011.5.25.227.1.36"]
]

// --- hwFwdSessionResLackResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.37
// Fields: hwFwdSessionResUsage
// Description: The device session resources were resumed.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.37"] = [
    name: "hwFwdSessionResLackResume",
    fields: ["hwFwdSessionResUsage"],
    fieldOids: ["hwFwdSessionResUsage": "1.3.6.1.4.1.2011.5.25.227.1.36"]
]

// --- hwFwdFastTableResLack (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.38
// Description: The device fastforwarding table resources were overloadeds.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.38"] = [
    name: "hwFwdFastTableResLack",
    fields: [],
    fieldOids: []
]

// --- hwFwdFastTableResLackResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.39
// Description: The device fastforwarding table resources were resumed.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.39"] = [
    name: "hwFwdFastTableResLackResume",
    fields: [],
    fieldOids: []
]

// --- hwNotsuppDecapVxlanFragPackets (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.40
// Description: The slot does not support decapsulate VXLAN fragments.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.40"] = [
    name: "hwNotsuppDecapVxlanFragPackets",
    fields: [],
    fieldOids: []
]

// --- hwBoardVbdifResLack (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.41
// Description: The current configuration of the number of VBDIF has exceeded the maximum number of this slot can support, which may cause traffic forwarding anomalies.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.41"] = [
    name: "hwBoardVbdifResLack",
    fields: [],
    fieldOids: []
]

// --- hwVxlanTnlCfgFailed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.42
// Description: Failed to add VXLAN tunnel table due to hash conflict.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.42"] = [
    name: "hwVxlanTnlCfgFailed",
    fields: [],
    fieldOids: []
]

// --- hwNotsuppDecapVxlanPackets (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.43
// Description: The slot does not support to decapsulate VXLAN packets.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.43"] = [
    name: "hwNotsuppDecapVxlanPackets",
    fields: [],
    fieldOids: []
]

// --- hwBoardL3NDResLack (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.44
// Fields: hwFwdResLackIPStr, hwFwdResLackVrfId, hwFwdResLackSlotStr
// Description: This object indicates that fail to download ND entry because of Hash Collision.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.44"] = [
    name: "hwBoardL3NDResLack",
    fields: ["hwFwdResLackIPStr", "hwFwdResLackVrfId", "hwFwdResLackSlotStr"],
    fieldOids: ["hwFwdResLackIPStr": "1.3.6.1.4.1.2011.5.25.227.1.28", "hwFwdResLackVrfId": "1.3.6.1.4.1.2011.5.25.227.1.29", "hwFwdResLackSlotStr": "1.3.6.1.4.1.2011.5.25.227.1.2"]
]

// --- hwBoardL3FIBResLack (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.45
// Fields: hwFwdResLackIPStr, hwFwdResLackVrfId, hwFwdResLackSlotStr
// Description: This object indicates that fail to download FIB entry because of LPM failure.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.45"] = [
    name: "hwBoardL3FIBResLack",
    fields: ["hwFwdResLackIPStr", "hwFwdResLackVrfId", "hwFwdResLackSlotStr"],
    fieldOids: ["hwFwdResLackIPStr": "1.3.6.1.4.1.2011.5.25.227.1.28", "hwFwdResLackVrfId": "1.3.6.1.4.1.2011.5.25.227.1.29", "hwFwdResLackSlotStr": "1.3.6.1.4.1.2011.5.25.227.1.2"]
]

// --- hwBoardMplsFlowLabelNonSupp (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.46
// Fields: hwFwdResLackSlotStr
// Description: The board does not support MPLS flow label.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.46"] = [
    name: "hwBoardMplsFlowLabelNonSupp",
    fields: ["hwFwdResLackSlotStr"],
    fieldOids: ["hwFwdResLackSlotStr": "1.3.6.1.4.1.2011.5.25.227.1.2"]
]

// --- hwTrunkWeightExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.47
// Fields: hwEntPhysicalindex, entPhysicalName, hwFwdResLackSlotStr, hwFwdResLackReasonId
// Description: The sum of all member interfaces' weights of a trunk interface exceeded the maximum value supported by the board.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.47"] = [
    name: "hwTrunkWeightExceed",
    fields: ["hwEntPhysicalindex", "entPhysicalName", "hwFwdResLackSlotStr", "hwFwdResLackReasonId"],
    fieldOids: ["hwEntPhysicalindex": "1.3.6.1.4.1.2011.5.25.227.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwFwdResLackSlotStr": "1.3.6.1.4.1.2011.5.25.227.1.2", "hwFwdResLackReasonId": "1.3.6.1.4.1.2011.5.25.227.1.3"]
]

// --- hwTrunkWeightExceedResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.48
// Fields: hwEntPhysicalindex, entPhysicalName, hwFwdResLackSlotStr, hwFwdResLackReasonId
// Description: The sum of all member interfaces' weights of each trunk interface is less than the maximum value supported by the board.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.48"] = [
    name: "hwTrunkWeightExceedResume",
    fields: ["hwEntPhysicalindex", "entPhysicalName", "hwFwdResLackSlotStr", "hwFwdResLackReasonId"],
    fieldOids: ["hwEntPhysicalindex": "1.3.6.1.4.1.2011.5.25.227.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwFwdResLackSlotStr": "1.3.6.1.4.1.2011.5.25.227.1.2", "hwFwdResLackReasonId": "1.3.6.1.4.1.2011.5.25.227.1.3"]
]

// --- hwSidResourceThresholdExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.49
// Fields: hwSIDPoolID, hwSIDResourceCurrentCount, hwSIDResourceTotalCount, hwSIDResourceThresholdUpperLimit, hwSIDResourceThresholdLowerLimit
// Description: This object indicates that the number of SID pool has fallen below the upper threshol.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.49"] = [
    name: "hwSidResourceThresholdExceed",
    fields: ["hwSIDPoolID", "hwSIDResourceCurrentCount", "hwSIDResourceTotalCount", "hwSIDResourceThresholdUpperLimit", "hwSIDResourceThresholdLowerLimit"],
    fieldOids: ["hwSIDPoolID": "1.3.6.1.4.1.2011.5.25.227.1.37", "hwSIDResourceCurrentCount": "1.3.6.1.4.1.2011.5.25.227.1.38", "hwSIDResourceTotalCount": "1.3.6.1.4.1.2011.5.25.227.1.39", "hwSIDResourceThresholdUpperLimit": "1.3.6.1.4.1.2011.5.25.227.1.40", "hwSIDResourceThresholdLowerLimit": "1.3.6.1.4.1.2011.5.25.227.1.41"]
]

// --- hwSidResourceThresholdExceedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.50
// Fields: hwSIDPoolID, hwSIDResourceCurrentCount, hwSIDResourceTotalCount, hwSIDResourceThresholdUpperLimit, hwSIDResourceThresholdLowerLimit
// Description: This object indicates that the number of SID pool has fallen below the lower threshol.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.50"] = [
    name: "hwSidResourceThresholdExceedClear",
    fields: ["hwSIDPoolID", "hwSIDResourceCurrentCount", "hwSIDResourceTotalCount", "hwSIDResourceThresholdUpperLimit", "hwSIDResourceThresholdLowerLimit"],
    fieldOids: ["hwSIDPoolID": "1.3.6.1.4.1.2011.5.25.227.1.37", "hwSIDResourceCurrentCount": "1.3.6.1.4.1.2011.5.25.227.1.38", "hwSIDResourceTotalCount": "1.3.6.1.4.1.2011.5.25.227.1.39", "hwSIDResourceThresholdUpperLimit": "1.3.6.1.4.1.2011.5.25.227.1.40", "hwSIDResourceThresholdLowerLimit": "1.3.6.1.4.1.2011.5.25.227.1.41"]
]

// --- hwSidResourceTotalCountExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.51
// Fields: hwSIDPoolID, hwSIDResourceCurrentCount, hwSIDResourceTotalCount
// Description: This object indicates that the number of SID pool has reached the maximum number.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.51"] = [
    name: "hwSidResourceTotalCountExceed",
    fields: ["hwSIDPoolID", "hwSIDResourceCurrentCount", "hwSIDResourceTotalCount"],
    fieldOids: ["hwSIDPoolID": "1.3.6.1.4.1.2011.5.25.227.1.37", "hwSIDResourceCurrentCount": "1.3.6.1.4.1.2011.5.25.227.1.38", "hwSIDResourceTotalCount": "1.3.6.1.4.1.2011.5.25.227.1.39"]
]

// --- hwSidResourceTotalCountExceedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.52
// Fields: hwSIDPoolID, hwSIDResourceCurrentCount, hwSIDResourceTotalCount
// Description: This object indicates that the number of SID pool fallen below the clear alarm threshold.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.52"] = [
    name: "hwSidResourceTotalCountExceedClear",
    fields: ["hwSIDPoolID", "hwSIDResourceCurrentCount", "hwSIDResourceTotalCount"],
    fieldOids: ["hwSIDPoolID": "1.3.6.1.4.1.2011.5.25.227.1.37", "hwSIDResourceCurrentCount": "1.3.6.1.4.1.2011.5.25.227.1.38", "hwSIDResourceTotalCount": "1.3.6.1.4.1.2011.5.25.227.1.39"]
]

// --- hwBoardMcResFull (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.53
// Fields: hwFwdResLackSlotStr, hwFwdResLackReasonId
// Description: This object indicates that multicast resource is full.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.53"] = [
    name: "hwBoardMcResFull",
    fields: ["hwFwdResLackSlotStr", "hwFwdResLackReasonId"],
    fieldOids: ["hwFwdResLackSlotStr": "1.3.6.1.4.1.2011.5.25.227.1.2", "hwFwdResLackReasonId": "1.3.6.1.4.1.2011.5.25.227.1.3"]
]

// --- hwBoardMplsFwdResFull (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.54
// Fields: hwFwdResLackSlotStr, hwFwdResLackReasonId
// Description: This object indicates that MPLS resource is full.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.54"] = [
    name: "hwBoardMplsFwdResFull",
    fields: ["hwFwdResLackSlotStr", "hwFwdResLackReasonId"],
    fieldOids: ["hwFwdResLackSlotStr": "1.3.6.1.4.1.2011.5.25.227.1.2", "hwFwdResLackReasonId": "1.3.6.1.4.1.2011.5.25.227.1.3"]
]

// --- hwBoardL3ResFull (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.55
// Fields: hwFwdResLackSlotStr, hwFwdResLackReasonId
// Description: This object indicates that l3 resource is full.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.55"] = [
    name: "hwBoardL3ResFull",
    fields: ["hwFwdResLackSlotStr", "hwFwdResLackReasonId"],
    fieldOids: ["hwFwdResLackSlotStr": "1.3.6.1.4.1.2011.5.25.227.1.2", "hwFwdResLackReasonId": "1.3.6.1.4.1.2011.5.25.227.1.3"]
]

// --- hwFwdComponentSmoothFailed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.56
// Fields: entPhysicalName, hwFwdResLackSlotStr, hwProducerComponentName, hwConsumerComponentName, hwSmoothFailedReasonId
// Description: This object indicates that component smooth failed to finish.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.56"] = [
    name: "hwFwdComponentSmoothFailed",
    fields: ["entPhysicalName", "hwFwdResLackSlotStr", "hwProducerComponentName", "hwConsumerComponentName", "hwSmoothFailedReasonId"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwFwdResLackSlotStr": "1.3.6.1.4.1.2011.5.25.227.1.2", "hwProducerComponentName": "1.3.6.1.4.1.2011.5.25.227.1.42", "hwConsumerComponentName": "1.3.6.1.4.1.2011.5.25.227.1.43", "hwSmoothFailedReasonId": "1.3.6.1.4.1.2011.5.25.227.1.44"]
]

// --- hwFwdComponentSmoothFailedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.57
// Fields: entPhysicalName, hwFwdResLackSlotStr, hwProducerComponentName, hwConsumerComponentName, hwSmoothFailedReasonId
// Description: This object indicates that component smooth end.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.57"] = [
    name: "hwFwdComponentSmoothFailedClear",
    fields: ["entPhysicalName", "hwFwdResLackSlotStr", "hwProducerComponentName", "hwConsumerComponentName", "hwSmoothFailedReasonId"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwFwdResLackSlotStr": "1.3.6.1.4.1.2011.5.25.227.1.2", "hwProducerComponentName": "1.3.6.1.4.1.2011.5.25.227.1.42", "hwConsumerComponentName": "1.3.6.1.4.1.2011.5.25.227.1.43", "hwSmoothFailedReasonId": "1.3.6.1.4.1.2011.5.25.227.1.44"]
]

// --- hwEMDIIndicatorOverThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.58
// Fields: hwEMDIInstanceId, hwEMDIIndicatorType, hwEMDIIndicatorValue, hwEMDIThreshold
// Description: The monitor indicator exceeded the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.58"] = [
    name: "hwEMDIIndicatorOverThreshold",
    fields: ["hwEMDIInstanceId", "hwEMDIIndicatorType", "hwEMDIIndicatorValue", "hwEMDIThreshold"],
    fieldOids: ["hwEMDIInstanceId": "1.3.6.1.4.1.2011.5.25.227.1.45", "hwEMDIIndicatorType": "1.3.6.1.4.1.2011.5.25.227.1.46", "hwEMDIIndicatorValue": "1.3.6.1.4.1.2011.5.25.227.1.47", "hwEMDIThreshold": "1.3.6.1.4.1.2011.5.25.227.1.48"]
]

// --- hwEMDIIndicatorOverThresholdResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.59
// Fields: hwEMDIInstanceId, hwEMDIIndicatorType, hwEMDIIndicatorValue, hwEMDIThreshold
// Description: The monitor indicator exceeded trap resume.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.59"] = [
    name: "hwEMDIIndicatorOverThresholdResume",
    fields: ["hwEMDIInstanceId", "hwEMDIIndicatorType", "hwEMDIIndicatorValue", "hwEMDIThreshold"],
    fieldOids: ["hwEMDIInstanceId": "1.3.6.1.4.1.2011.5.25.227.1.45", "hwEMDIIndicatorType": "1.3.6.1.4.1.2011.5.25.227.1.46", "hwEMDIIndicatorValue": "1.3.6.1.4.1.2011.5.25.227.1.47", "hwEMDIThreshold": "1.3.6.1.4.1.2011.5.25.227.1.48"]
]

// --- hwEMDIReceiveDuplicatePackets (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.60
// Fields: hwEMDIThreshold
// Description: The device received duplicate packets.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.60"] = [
    name: "hwEMDIReceiveDuplicatePackets",
    fields: ["hwEMDIThreshold"],
    fieldOids: ["hwEMDIThreshold": "1.3.6.1.4.1.2011.5.25.227.1.48"]
]

// --- hwEMDIReceiveDuplicatePacketsResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.61
// Fields: hwEMDIThreshold
// Description: The device didn't received duplicate packets.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.61"] = [
    name: "hwEMDIReceiveDuplicatePacketsResume",
    fields: ["hwEMDIThreshold"],
    fieldOids: ["hwEMDIThreshold": "1.3.6.1.4.1.2011.5.25.227.1.48"]
]

// --- hwBoardMcResLack (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.62
// Fields: hwFwdResThreshold, hwFwdResLackSlotStr, hwFwdResLackReasonId
// Description: This object indicates that multicast entry resources were overloaded.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.62"] = [
    name: "hwBoardMcResLack",
    fields: ["hwFwdResThreshold", "hwFwdResLackSlotStr", "hwFwdResLackReasonId"],
    fieldOids: ["hwFwdResThreshold": "1.3.6.1.4.1.2011.5.25.227.1.4", "hwFwdResLackSlotStr": "1.3.6.1.4.1.2011.5.25.227.1.2", "hwFwdResLackReasonId": "1.3.6.1.4.1.2011.5.25.227.1.3"]
]

// --- hwBoardMcResLackResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.63
// Fields: hwFwdResThreshold, hwFwdResLackSlotStr, hwFwdResLackReasonId
// Description: This object indicates that multicast entry resources were resumed.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.63"] = [
    name: "hwBoardMcResLackResume",
    fields: ["hwFwdResThreshold", "hwFwdResLackSlotStr", "hwFwdResLackReasonId"],
    fieldOids: ["hwFwdResThreshold": "1.3.6.1.4.1.2011.5.25.227.1.4", "hwFwdResLackSlotStr": "1.3.6.1.4.1.2011.5.25.227.1.2", "hwFwdResLackReasonId": "1.3.6.1.4.1.2011.5.25.227.1.3"]
]

// --- hwAutoDiagnoseAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.64
// Fields: hwAutoDiagnoseReasonId, hwReasonDescription
// Description: The AutoDiagnose system detects that the device is faulty.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.64"] = [
    name: "hwAutoDiagnoseAlarm",
    fields: ["hwAutoDiagnoseReasonId", "hwReasonDescription"],
    fieldOids: ["hwAutoDiagnoseReasonId": "1.3.6.1.4.1.2011.5.25.227.1.50", "hwReasonDescription": "1.3.6.1.4.1.2011.5.25.227.1.8"]
]

// --- hwAutoDiagnoseAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.65
// Fields: hwAutoDiagnoseReasonId, hwReasonDescription
// Description: The AutoDiagnose system detects that the faulty device recovers.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.65"] = [
    name: "hwAutoDiagnoseAlarmResume",
    fields: ["hwAutoDiagnoseReasonId", "hwReasonDescription"],
    fieldOids: ["hwAutoDiagnoseReasonId": "1.3.6.1.4.1.2011.5.25.227.1.50", "hwReasonDescription": "1.3.6.1.4.1.2011.5.25.227.1.8"]
]

// --- hwEcmpMemberLimitOverThresholdAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.66
// Fields: hwFwdResLackSlotStr
// Description: The number of next hops to which routes recurse exceeds the device capability. During route convergence, load balancing may fail on some links.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.66"] = [
    name: "hwEcmpMemberLimitOverThresholdAlarm",
    fields: ["hwFwdResLackSlotStr"],
    fieldOids: ["hwFwdResLackSlotStr": "1.3.6.1.4.1.2011.5.25.227.1.2"]
]

// --- hwSysResChangedAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.67
// Fields: hwSysResChgSlotStr, hwSysResChgReasonId, hwSysResChgReasonDescription
// Description: The mode of forwarding resourecs was changed.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.67"] = [
    name: "hwSysResChangedAlarm",
    fields: ["hwSysResChgSlotStr", "hwSysResChgReasonId", "hwSysResChgReasonDescription"],
    fieldOids: ["hwSysResChgSlotStr": "1.3.6.1.4.1.2011.5.25.227.1.55", "hwSysResChgReasonId": "1.3.6.1.4.1.2011.5.25.227.1.56", "hwSysResChgReasonDescription": "1.3.6.1.4.1.2011.5.25.227.1.57"]
]

// --- hwSysResChangedAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.68
// Fields: hwSysResChgSlotStr, hwSysResChgReasonId, hwSysResChgReasonDescription
// Description: The mode of forwarding resourecs was resumed.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.68"] = [
    name: "hwSysResChangedAlarmResume",
    fields: ["hwSysResChgSlotStr", "hwSysResChgReasonId", "hwSysResChgReasonDescription"],
    fieldOids: ["hwSysResChgSlotStr": "1.3.6.1.4.1.2011.5.25.227.1.55", "hwSysResChgReasonId": "1.3.6.1.4.1.2011.5.25.227.1.56", "hwSysResChgReasonDescription": "1.3.6.1.4.1.2011.5.25.227.1.57"]
]

// --- hwSessExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.69
// Fields: hwFwdSessionResUsage, hwSessThreshold, TopNSourceIpAddress
// Description: The number of session resources exceeds the limit.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.69"] = [
    name: "hwSessExceed",
    fields: ["hwFwdSessionResUsage", "hwSessThreshold", "TopNSourceIpAddress"],
    fieldOids: ["hwFwdSessionResUsage": "1.3.6.1.4.1.2011.5.25.227.1.36", "hwSessThreshold": "1.3.6.1.4.1.2011.5.25.227.1.58", "TopNSourceIpAddress": "1.3.6.1.4.1.2011.5.25.227.1.85"]
]

// --- hwSessExceedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.70
// Fields: hwFwdSessionResUsage, hwSessThreshold
// Description: The number of session resources falls below the limit.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.70"] = [
    name: "hwSessExceedClear",
    fields: ["hwFwdSessionResUsage", "hwSessThreshold"],
    fieldOids: ["hwFwdSessionResUsage": "1.3.6.1.4.1.2011.5.25.227.1.36", "hwSessThreshold": "1.3.6.1.4.1.2011.5.25.227.1.58"]
]

// --- hwSessThresholdExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.71
// Fields: hwFwdSessionResUsage, hwSessThreshold, TopNSourceIpAddress
// Description: The number of session resources exceeds the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.71"] = [
    name: "hwSessThresholdExceed",
    fields: ["hwFwdSessionResUsage", "hwSessThreshold", "TopNSourceIpAddress"],
    fieldOids: ["hwFwdSessionResUsage": "1.3.6.1.4.1.2011.5.25.227.1.36", "hwSessThreshold": "1.3.6.1.4.1.2011.5.25.227.1.58", "TopNSourceIpAddress": "1.3.6.1.4.1.2011.5.25.227.1.85"]
]

// --- hwSessThresholdExceedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.72
// Fields: hwFwdSessionResUsage, hwSessThreshold
// Description: The number of session resources falls below the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.72"] = [
    name: "hwSessThresholdExceedClear",
    fields: ["hwFwdSessionResUsage", "hwSessThreshold"],
    fieldOids: ["hwFwdSessionResUsage": "1.3.6.1.4.1.2011.5.25.227.1.36", "hwSessThreshold": "1.3.6.1.4.1.2011.5.25.227.1.58"]
]

// --- hwPingfFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.73
// Description: This object indicates that pingf fail.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.73"] = [
    name: "hwPingfFail",
    fields: [],
    fieldOids: []
]

// --- hwAclRuleExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.74
// Fields: hwAclRuleResUsage, hwAclRuleThreshold
// Description: The number of acl rule resource is full.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.74"] = [
    name: "hwAclRuleExceed",
    fields: ["hwAclRuleResUsage", "hwAclRuleThreshold"],
    fieldOids: ["hwAclRuleResUsage": "1.3.6.1.4.1.2011.5.25.227.1.59", "hwAclRuleThreshold": "1.3.6.1.4.1.2011.5.25.227.1.60"]
]

// --- hwAclRuleExceedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.75
// Fields: hwAclRuleResUsage, hwAclRuleThreshold
// Description: The number of acl rule resource falls below the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.75"] = [
    name: "hwAclRuleExceedClear",
    fields: ["hwAclRuleResUsage", "hwAclRuleThreshold"],
    fieldOids: ["hwAclRuleResUsage": "1.3.6.1.4.1.2011.5.25.227.1.59", "hwAclRuleThreshold": "1.3.6.1.4.1.2011.5.25.227.1.60"]
]

// --- hwAclGroupExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.76
// Fields: hwAclGroupResUsage, hwAclGroupThreshold
// Description: The number of acl group resource is full.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.76"] = [
    name: "hwAclGroupExceed",
    fields: ["hwAclGroupResUsage", "hwAclGroupThreshold"],
    fieldOids: ["hwAclGroupResUsage": "1.3.6.1.4.1.2011.5.25.227.1.61", "hwAclGroupThreshold": "1.3.6.1.4.1.2011.5.25.227.1.62"]
]

// --- hwAclGroupExceedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.77
// Fields: hwAclGroupResUsage, hwAclGroupThreshold
// Description: The number of acl group resource falls below the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.77"] = [
    name: "hwAclGroupExceedClear",
    fields: ["hwAclGroupResUsage", "hwAclGroupThreshold"],
    fieldOids: ["hwAclGroupResUsage": "1.3.6.1.4.1.2011.5.25.227.1.61", "hwAclGroupThreshold": "1.3.6.1.4.1.2011.5.25.227.1.62"]
]

// --- hwBoardResCriticalThresholdExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.78
// Fields: hwFwdResLackSlotStr, hwFwdResThreshold, hwFwdResLackReasonId, hwReasonDescription
// Description: The number of forwarding resources reaches the alarm threshold.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.78"] = [
    name: "hwBoardResCriticalThresholdExceed",
    fields: ["hwFwdResLackSlotStr", "hwFwdResThreshold", "hwFwdResLackReasonId", "hwReasonDescription"],
    fieldOids: ["hwFwdResLackSlotStr": "1.3.6.1.4.1.2011.5.25.227.1.2", "hwFwdResThreshold": "1.3.6.1.4.1.2011.5.25.227.1.4", "hwFwdResLackReasonId": "1.3.6.1.4.1.2011.5.25.227.1.3", "hwReasonDescription": "1.3.6.1.4.1.2011.5.25.227.1.8"]
]

// --- hwBoardResCriticalThresholdExceedResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.79
// Fields: hwFwdResLackSlotStr, hwFwdResThreshold, hwFwdResLackReasonId, hwReasonDescription
// Description: The number of forwarding engine resources is less than the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.79"] = [
    name: "hwBoardResCriticalThresholdExceedResume",
    fields: ["hwFwdResLackSlotStr", "hwFwdResThreshold", "hwFwdResLackReasonId", "hwReasonDescription"],
    fieldOids: ["hwFwdResLackSlotStr": "1.3.6.1.4.1.2011.5.25.227.1.2", "hwFwdResThreshold": "1.3.6.1.4.1.2011.5.25.227.1.4", "hwFwdResLackReasonId": "1.3.6.1.4.1.2011.5.25.227.1.3", "hwReasonDescription": "1.3.6.1.4.1.2011.5.25.227.1.8"]
]

// --- hwEMDIResLack (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.80
// Fields: hwEMDIThreshold, hwEMDISlotStr, hwEMDIResUsed, hwEMDIResTotal
// Description: The number of emdi resources reaches the alarm threshold..
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.80"] = [
    name: "hwEMDIResLack",
    fields: ["hwEMDIThreshold", "hwEMDISlotStr", "hwEMDIResUsed", "hwEMDIResTotal"],
    fieldOids: ["hwEMDIThreshold": "1.3.6.1.4.1.2011.5.25.227.1.48", "hwEMDISlotStr": "1.3.6.1.4.1.2011.5.25.227.1.63", "hwEMDIResUsed": "1.3.6.1.4.1.2011.5.25.227.1.64", "hwEMDIResTotal": "1.3.6.1.4.1.2011.5.25.227.1.65"]
]

// --- hwEMDIResLackResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.81
// Fields: hwEMDIThreshold, hwEMDISlotStr, hwEMDIResUsed, hwEMDIResTotal
// Description: The number of emdi resources is less than the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.81"] = [
    name: "hwEMDIResLackResume",
    fields: ["hwEMDIThreshold", "hwEMDISlotStr", "hwEMDIResUsed", "hwEMDIResTotal"],
    fieldOids: ["hwEMDIThreshold": "1.3.6.1.4.1.2011.5.25.227.1.48", "hwEMDISlotStr": "1.3.6.1.4.1.2011.5.25.227.1.63", "hwEMDIResUsed": "1.3.6.1.4.1.2011.5.25.227.1.64", "hwEMDIResTotal": "1.3.6.1.4.1.2011.5.25.227.1.65"]
]

// --- hwSaidPingPktModifiedAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.82
// Fields: hwSaidPingDetectInterface
// Description: The SAID PING function detected that the packet modification.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.82"] = [
    name: "hwSaidPingPktModifiedAlarm",
    fields: ["hwSaidPingDetectInterface"],
    fieldOids: ["hwSaidPingDetectInterface": "1.3.6.1.4.1.2011.5.25.227.1.68"]
]

// --- hwNetStreamIPv4OriginalFlowExceeded (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.83
// Fields: hwNetStreamIPv4OriginalFlowUsage, hwNetStreamIPv4OriginalFlowThreshold
// Description: The number of used NetStream IPv4 original flows exceeded the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.83"] = [
    name: "hwNetStreamIPv4OriginalFlowExceeded",
    fields: ["hwNetStreamIPv4OriginalFlowUsage", "hwNetStreamIPv4OriginalFlowThreshold"],
    fieldOids: ["hwNetStreamIPv4OriginalFlowUsage": "1.3.6.1.4.1.2011.5.25.227.1.69", "hwNetStreamIPv4OriginalFlowThreshold": "1.3.6.1.4.1.2011.5.25.227.1.70"]
]

// --- hwNetStreamIPv4OriginalFlowFellBelow (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.84
// Fields: hwNetStreamIPv4OriginalFlowUsage, hwNetStreamIPv4OriginalFlowThreshold
// Description: The number of used NetStream IPv4 original flows fell below the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.84"] = [
    name: "hwNetStreamIPv4OriginalFlowFellBelow",
    fields: ["hwNetStreamIPv4OriginalFlowUsage", "hwNetStreamIPv4OriginalFlowThreshold"],
    fieldOids: ["hwNetStreamIPv4OriginalFlowUsage": "1.3.6.1.4.1.2011.5.25.227.1.69", "hwNetStreamIPv4OriginalFlowThreshold": "1.3.6.1.4.1.2011.5.25.227.1.70"]
]

// --- hwNetStreamIPv4FlexibleFlowExceeded (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.85
// Fields: hwNetStreamIPv4FlexibleFlowUsage, hwNetStreamIPv4FlexibleFlowThreshold
// Description: The number of used NetStream IPv4 flexible flows exceeded the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.85"] = [
    name: "hwNetStreamIPv4FlexibleFlowExceeded",
    fields: ["hwNetStreamIPv4FlexibleFlowUsage", "hwNetStreamIPv4FlexibleFlowThreshold"],
    fieldOids: ["hwNetStreamIPv4FlexibleFlowUsage": "1.3.6.1.4.1.2011.5.25.227.1.71", "hwNetStreamIPv4FlexibleFlowThreshold": "1.3.6.1.4.1.2011.5.25.227.1.72"]
]

// --- hwNetStreamIPv4FlexibleFlowFellBelow (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.86
// Fields: hwNetStreamIPv4FlexibleFlowUsage, hwNetStreamIPv4FlexibleFlowThreshold
// Description: The number of used NetStream IPv4 flexible flows fell below the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.86"] = [
    name: "hwNetStreamIPv4FlexibleFlowFellBelow",
    fields: ["hwNetStreamIPv4FlexibleFlowUsage", "hwNetStreamIPv4FlexibleFlowThreshold"],
    fieldOids: ["hwNetStreamIPv4FlexibleFlowUsage": "1.3.6.1.4.1.2011.5.25.227.1.71", "hwNetStreamIPv4FlexibleFlowThreshold": "1.3.6.1.4.1.2011.5.25.227.1.72"]
]

// --- hwFwmFaultAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.87
// Fields: hwFwmFaultSlotStr, hwFwmFaultCpuStr, hwFwmFaultReasonId, hwFwmFaultReasonDescription
// Description: This object indicates that a forwarding manage module encounters a partial failure.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.87"] = [
    name: "hwFwmFaultAlarm",
    fields: ["hwFwmFaultSlotStr", "hwFwmFaultCpuStr", "hwFwmFaultReasonId", "hwFwmFaultReasonDescription"],
    fieldOids: ["hwFwmFaultSlotStr": "1.3.6.1.4.1.2011.5.25.227.1.73", "hwFwmFaultCpuStr": "1.3.6.1.4.1.2011.5.25.227.1.74", "hwFwmFaultReasonId": "1.3.6.1.4.1.2011.5.25.227.1.75", "hwFwmFaultReasonDescription": "1.3.6.1.4.1.2011.5.25.227.1.76"]
]

// --- hwFwmFaultAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.88
// Fields: hwFwmFaultSlotStr, hwFwmFaultCpuStr, hwFwmFaultReasonId, hwFwmFaultReasonDescription
// Description: This object indicates that a forwarding manage module recovers from a partial failure.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.88"] = [
    name: "hwFwmFaultAlarmResume",
    fields: ["hwFwmFaultSlotStr", "hwFwmFaultCpuStr", "hwFwmFaultReasonId", "hwFwmFaultReasonDescription"],
    fieldOids: ["hwFwmFaultSlotStr": "1.3.6.1.4.1.2011.5.25.227.1.73", "hwFwmFaultCpuStr": "1.3.6.1.4.1.2011.5.25.227.1.74", "hwFwmFaultReasonId": "1.3.6.1.4.1.2011.5.25.227.1.75", "hwFwmFaultReasonDescription": "1.3.6.1.4.1.2011.5.25.227.1.76"]
]

// --- hwBoardNetworkSliceResourceInsufficient (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.89
// Fields: hwFwmSliceSlotStr, hwFwmSliceInterfaceName, hwFwmSliceId, hwFwmSliceTrunkInterfaceName, hwFwmSliceResourceReasonId, hwFwmSliceReasonDescription
// Description: This object indicates that the service specifications configured for the system exceeded those of the forwarding engine.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.89"] = [
    name: "hwBoardNetworkSliceResourceInsufficient",
    fields: ["hwFwmSliceSlotStr", "hwFwmSliceInterfaceName", "hwFwmSliceId", "hwFwmSliceTrunkInterfaceName", "hwFwmSliceResourceReasonId", "hwFwmSliceReasonDescription"],
    fieldOids: ["hwFwmSliceSlotStr": "1.3.6.1.4.1.2011.5.25.227.1.83", "hwFwmSliceInterfaceName": "1.3.6.1.4.1.2011.5.25.227.1.77", "hwFwmSliceId": "1.3.6.1.4.1.2011.5.25.227.1.78", "hwFwmSliceTrunkInterfaceName": "1.3.6.1.4.1.2011.5.25.227.1.79", "hwFwmSliceResourceReasonId": "1.3.6.1.4.1.2011.5.25.227.1.81", "hwFwmSliceReasonDescription": "1.3.6.1.4.1.2011.5.25.227.1.84"]
]

// --- hwBoardNetworkSliceResourceInsufficientResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.90
// Fields: hwFwmSliceSlotStr, hwFwmSliceInterfaceName, hwFwmSliceId, hwFwmSliceTrunkInterfaceName, hwFwmSliceResourceReasonId, hwFwmSliceReasonDescription
// Description: This object indicates that the service specifications configured for the system do not exceed those of the forwarding engine.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.90"] = [
    name: "hwBoardNetworkSliceResourceInsufficientResume",
    fields: ["hwFwmSliceSlotStr", "hwFwmSliceInterfaceName", "hwFwmSliceId", "hwFwmSliceTrunkInterfaceName", "hwFwmSliceResourceReasonId", "hwFwmSliceReasonDescription"],
    fieldOids: ["hwFwmSliceSlotStr": "1.3.6.1.4.1.2011.5.25.227.1.83", "hwFwmSliceInterfaceName": "1.3.6.1.4.1.2011.5.25.227.1.77", "hwFwmSliceId": "1.3.6.1.4.1.2011.5.25.227.1.78", "hwFwmSliceTrunkInterfaceName": "1.3.6.1.4.1.2011.5.25.227.1.79", "hwFwmSliceResourceReasonId": "1.3.6.1.4.1.2011.5.25.227.1.81", "hwFwmSliceReasonDescription": "1.3.6.1.4.1.2011.5.25.227.1.84"]
]

// --- hwBoardNetworkSliceTrafficAbnormal (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.91
// Fields: hwFwmSliceSlotStr, hwFwmSliceInterfaceName, hwFwmSliceId, hwFwmSliceTrunkInterfaceName, hwFwmSliceSrcInterfaceName, hwFwmSliceFwdReasonId, hwFwmSliceReasonDescription
// Description: This object indicates that the service configured for the system is wrong.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.91"] = [
    name: "hwBoardNetworkSliceTrafficAbnormal",
    fields: ["hwFwmSliceSlotStr", "hwFwmSliceInterfaceName", "hwFwmSliceId", "hwFwmSliceTrunkInterfaceName", "hwFwmSliceSrcInterfaceName", "hwFwmSliceFwdReasonId", "hwFwmSliceReasonDescription"],
    fieldOids: ["hwFwmSliceSlotStr": "1.3.6.1.4.1.2011.5.25.227.1.83", "hwFwmSliceInterfaceName": "1.3.6.1.4.1.2011.5.25.227.1.77", "hwFwmSliceId": "1.3.6.1.4.1.2011.5.25.227.1.78", "hwFwmSliceTrunkInterfaceName": "1.3.6.1.4.1.2011.5.25.227.1.79", "hwFwmSliceSrcInterfaceName": "1.3.6.1.4.1.2011.5.25.227.1.80", "hwFwmSliceFwdReasonId": "1.3.6.1.4.1.2011.5.25.227.1.82", "hwFwmSliceReasonDescription": "1.3.6.1.4.1.2011.5.25.227.1.84"]
]

// --- hwBoardNetworkSliceTrafficAbnormalResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.92
// Fields: hwFwmSliceSlotStr, hwFwmSliceInterfaceName, hwFwmSliceId, hwFwmSliceTrunkInterfaceName, hwFwmSliceSrcInterfaceName, hwFwmSliceFwdReasonId, hwFwmSliceReasonDescription
// Description: This object indicates that the service configured for the system has been configured correctly.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.92"] = [
    name: "hwBoardNetworkSliceTrafficAbnormalResume",
    fields: ["hwFwmSliceSlotStr", "hwFwmSliceInterfaceName", "hwFwmSliceId", "hwFwmSliceTrunkInterfaceName", "hwFwmSliceSrcInterfaceName", "hwFwmSliceFwdReasonId", "hwFwmSliceReasonDescription"],
    fieldOids: ["hwFwmSliceSlotStr": "1.3.6.1.4.1.2011.5.25.227.1.83", "hwFwmSliceInterfaceName": "1.3.6.1.4.1.2011.5.25.227.1.77", "hwFwmSliceId": "1.3.6.1.4.1.2011.5.25.227.1.78", "hwFwmSliceTrunkInterfaceName": "1.3.6.1.4.1.2011.5.25.227.1.79", "hwFwmSliceSrcInterfaceName": "1.3.6.1.4.1.2011.5.25.227.1.80", "hwFwmSliceFwdReasonId": "1.3.6.1.4.1.2011.5.25.227.1.82", "hwFwmSliceReasonDescription": "1.3.6.1.4.1.2011.5.25.227.1.84"]
]

// --- hwSessLeakEntryNumberThresholdExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.93
// Fields: hwSessionCurEntryNum, hwSessionLeakEntryNum, hwSessionUnrecEntryNum, hwSessionSpecification, hwSessionLeakUsage, hwSessionLeakThreshold
// Description: The number of session leak entries exceeds the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.93"] = [
    name: "hwSessLeakEntryNumberThresholdExceed",
    fields: ["hwSessionCurEntryNum", "hwSessionLeakEntryNum", "hwSessionUnrecEntryNum", "hwSessionSpecification", "hwSessionLeakUsage", "hwSessionLeakThreshold"],
    fieldOids: ["hwSessionCurEntryNum": "1.3.6.1.4.1.2011.5.25.227.1.86", "hwSessionLeakEntryNum": "1.3.6.1.4.1.2011.5.25.227.1.87", "hwSessionUnrecEntryNum": "1.3.6.1.4.1.2011.5.25.227.1.88", "hwSessionSpecification": "1.3.6.1.4.1.2011.5.25.227.1.89", "hwSessionLeakUsage": "1.3.6.1.4.1.2011.5.25.227.1.90", "hwSessionLeakThreshold": "1.3.6.1.4.1.2011.5.25.227.1.91"]
]

// --- hwSessLeakEntryNumberThresholdExceedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.94
// Fields: hwSessionCurEntryNum, hwSessionLeakEntryNum, hwSessionUnrecEntryNum, hwSessionSpecification, hwSessionLeakUsage, hwSessionLeakThreshold
// Description: The number of session leak entries fell below the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.94"] = [
    name: "hwSessLeakEntryNumberThresholdExceedClear",
    fields: ["hwSessionCurEntryNum", "hwSessionLeakEntryNum", "hwSessionUnrecEntryNum", "hwSessionSpecification", "hwSessionLeakUsage", "hwSessionLeakThreshold"],
    fieldOids: ["hwSessionCurEntryNum": "1.3.6.1.4.1.2011.5.25.227.1.86", "hwSessionLeakEntryNum": "1.3.6.1.4.1.2011.5.25.227.1.87", "hwSessionUnrecEntryNum": "1.3.6.1.4.1.2011.5.25.227.1.88", "hwSessionSpecification": "1.3.6.1.4.1.2011.5.25.227.1.89", "hwSessionLeakUsage": "1.3.6.1.4.1.2011.5.25.227.1.90", "hwSessionLeakThreshold": "1.3.6.1.4.1.2011.5.25.227.1.91"]
]

// --- hwSessUnrecEntryNumberThresholdExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.95
// Fields: hwSessionCurEntryNum, hwSessionLeakEntryNum, hwSessionUnrecEntryNum, hwSessionSpecification, hwSessionUnrecUsage, hwSessionUnrecThreshold
// Description: The number of session unrecoverable entries exceeds the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.95"] = [
    name: "hwSessUnrecEntryNumberThresholdExceed",
    fields: ["hwSessionCurEntryNum", "hwSessionLeakEntryNum", "hwSessionUnrecEntryNum", "hwSessionSpecification", "hwSessionUnrecUsage", "hwSessionUnrecThreshold"],
    fieldOids: ["hwSessionCurEntryNum": "1.3.6.1.4.1.2011.5.25.227.1.86", "hwSessionLeakEntryNum": "1.3.6.1.4.1.2011.5.25.227.1.87", "hwSessionUnrecEntryNum": "1.3.6.1.4.1.2011.5.25.227.1.88", "hwSessionSpecification": "1.3.6.1.4.1.2011.5.25.227.1.89", "hwSessionUnrecUsage": "1.3.6.1.4.1.2011.5.25.227.1.92", "hwSessionUnrecThreshold": "1.3.6.1.4.1.2011.5.25.227.1.93"]
]

// --- hwVlanSrcExeedAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.96
// Fields: hwL2mcGrpAddress, hwL2mcVlanIdx
// Description: The number of multicast sources of a multicast group reaches the alarm threshold.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.96"] = [
    name: "hwVlanSrcExeedAlarm",
    fields: ["hwL2mcGrpAddress", "hwL2mcVlanIdx"],
    fieldOids: ["hwL2mcGrpAddress": "1.3.6.1.4.1.2011.5.25.227.1.94", "hwL2mcVlanIdx": "1.3.6.1.4.1.2011.5.25.227.1.95"]
]

// --- hwVlanSrcExeedResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.97
// Fields: hwL2mcGrpAddress, hwL2mcVlanIdx
// Description: The number of multicast sources of a multicast group is less than the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.97"] = [
    name: "hwVlanSrcExeedResume",
    fields: ["hwL2mcGrpAddress", "hwL2mcVlanIdx"],
    fieldOids: ["hwL2mcGrpAddress": "1.3.6.1.4.1.2011.5.25.227.1.94", "hwL2mcVlanIdx": "1.3.6.1.4.1.2011.5.25.227.1.95"]
]

// --- hwMcastElbExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.98
// Fields: hwMcastElbUsage, hwMcastElbThreshold
// Description: The number of multicast egress interfaces resource is full.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.98"] = [
    name: "hwMcastElbExceed",
    fields: ["hwMcastElbUsage", "hwMcastElbThreshold"],
    fieldOids: ["hwMcastElbUsage": "1.3.6.1.4.1.2011.5.25.227.1.96", "hwMcastElbThreshold": "1.3.6.1.4.1.2011.5.25.227.1.97"]
]

// --- hwMcastElbExceedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.99
// Fields: hwMcastElbUsage, hwMcastElbThreshold
// Description: The number of multicast egress interfaces resource falls below the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.99"] = [
    name: "hwMcastElbExceedClear",
    fields: ["hwMcastElbUsage", "hwMcastElbThreshold"],
    fieldOids: ["hwMcastElbUsage": "1.3.6.1.4.1.2011.5.25.227.1.96", "hwMcastElbThreshold": "1.3.6.1.4.1.2011.5.25.227.1.97"]
]

// --- hwFwdTblmScanHndOverload (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.100
// Fields: hwEntiyPhysicalindex, entPhysicalIndex, entPhysicalName, hwFwdTableId, hwFwdTableName
// Description: The number of handles traversed in the forwarding resource table exceeded the maximum number supported.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.100"] = [
    name: "hwFwdTblmScanHndOverload",
    fields: ["hwEntiyPhysicalindex", "entPhysicalIndex", "entPhysicalName", "hwFwdTableId", "hwFwdTableName"],
    fieldOids: ["hwEntiyPhysicalindex": "1.3.6.1.4.1.2011.5.25.227.1.98", "entPhysicalIndex": "1.3.6.1.2.1.47.1.1.1.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwFwdTableId": "1.3.6.1.4.1.2011.5.25.227.1.99", "hwFwdTableName": "1.3.6.1.4.1.2011.5.25.227.1.100"]
]

// --- hwFwdTblmScanHndThresholdExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.101
// Fields: hwEntiyPhysicalindex, entPhysicalIndex, entPhysicalName, hwFwdTableId, hwFwdTableName
// Description: The number of handles traversed in the forwarding resource table exceeded the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.101"] = [
    name: "hwFwdTblmScanHndThresholdExceed",
    fields: ["hwEntiyPhysicalindex", "entPhysicalIndex", "entPhysicalName", "hwFwdTableId", "hwFwdTableName"],
    fieldOids: ["hwEntiyPhysicalindex": "1.3.6.1.4.1.2011.5.25.227.1.98", "entPhysicalIndex": "1.3.6.1.2.1.47.1.1.1.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwFwdTableId": "1.3.6.1.4.1.2011.5.25.227.1.99", "hwFwdTableName": "1.3.6.1.4.1.2011.5.25.227.1.100"]
]

// --- hwFwdTblmScanHndOverloadClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.102
// Fields: hwEntiyPhysicalindex, entPhysicalIndex, entPhysicalName, hwFwdTableId, hwFwdTableName
// Description: The number of handles traversed in the forwarding resource table is less than the maximum number supported.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.102"] = [
    name: "hwFwdTblmScanHndOverloadClear",
    fields: ["hwEntiyPhysicalindex", "entPhysicalIndex", "entPhysicalName", "hwFwdTableId", "hwFwdTableName"],
    fieldOids: ["hwEntiyPhysicalindex": "1.3.6.1.4.1.2011.5.25.227.1.98", "entPhysicalIndex": "1.3.6.1.2.1.47.1.1.1.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwFwdTableId": "1.3.6.1.4.1.2011.5.25.227.1.99", "hwFwdTableName": "1.3.6.1.4.1.2011.5.25.227.1.100"]
]

// --- hwFwdTblmScanHndThresholdExceedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.103
// Fields: hwEntiyPhysicalindex, entPhysicalIndex, entPhysicalName, hwFwdTableId, hwFwdTableName
// Description: The number of handles traversed in the forwarding resource table is less than the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.103"] = [
    name: "hwFwdTblmScanHndThresholdExceedClear",
    fields: ["hwEntiyPhysicalindex", "entPhysicalIndex", "entPhysicalName", "hwFwdTableId", "hwFwdTableName"],
    fieldOids: ["hwEntiyPhysicalindex": "1.3.6.1.4.1.2011.5.25.227.1.98", "entPhysicalIndex": "1.3.6.1.2.1.47.1.1.1.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwFwdTableId": "1.3.6.1.4.1.2011.5.25.227.1.99", "hwFwdTableName": "1.3.6.1.4.1.2011.5.25.227.1.100"]
]

// --- hwCapwapNoFragmentAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.104
// Fields: hwFwdResLackSlotStr
// Description: There is too much wireless traffic, and some packets cannot be fragmented.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.104"] = [
    name: "hwCapwapNoFragmentAlarm",
    fields: ["hwFwdResLackSlotStr"],
    fieldOids: ["hwFwdResLackSlotStr": "1.3.6.1.4.1.2011.5.25.227.1.2"]
]

// --- hwCapwapDiscardBroadcastAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.105
// Fields: hwFwdResLackSlotStr
// Description: There is too much wireless traffic, and some packets cannot be broadcast.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.105"] = [
    name: "hwCapwapDiscardBroadcastAlarm",
    fields: ["hwFwdResLackSlotStr"],
    fieldOids: ["hwFwdResLackSlotStr": "1.3.6.1.4.1.2011.5.25.227.1.2"]
]

// --- hwBoardNetworkSliceConflict (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.106
// Fields: hwFwmSliceSlotStr, hwFwmSliceInterfaceName, hwFwmSliceId, hwFwmSliceTrunkInterfaceName, hwFwmSliceConflitReasonId, hwFwmSliceReasonDescription
// Description: The slice configuration conflicted with other configurations.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.106"] = [
    name: "hwBoardNetworkSliceConflict",
    fields: ["hwFwmSliceSlotStr", "hwFwmSliceInterfaceName", "hwFwmSliceId", "hwFwmSliceTrunkInterfaceName", "hwFwmSliceConflitReasonId", "hwFwmSliceReasonDescription"],
    fieldOids: ["hwFwmSliceSlotStr": "1.3.6.1.4.1.2011.5.25.227.1.83", "hwFwmSliceInterfaceName": "1.3.6.1.4.1.2011.5.25.227.1.77", "hwFwmSliceId": "1.3.6.1.4.1.2011.5.25.227.1.78", "hwFwmSliceTrunkInterfaceName": "1.3.6.1.4.1.2011.5.25.227.1.79", "hwFwmSliceConflitReasonId": "1.3.6.1.4.1.2011.5.25.227.1.101", "hwFwmSliceReasonDescription": "1.3.6.1.4.1.2011.5.25.227.1.84"]
]

// --- hwBoardNetworkSliceConflictResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.107
// Fields: hwFwmSliceSlotStr, hwFwmSliceInterfaceName, hwFwmSliceId, hwFwmSliceTrunkInterfaceName, hwFwmSliceConflitReasonId, hwFwmSliceReasonDescription
// Description: The conflicting slice configuration was deleted.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.107"] = [
    name: "hwBoardNetworkSliceConflictResume",
    fields: ["hwFwmSliceSlotStr", "hwFwmSliceInterfaceName", "hwFwmSliceId", "hwFwmSliceTrunkInterfaceName", "hwFwmSliceConflitReasonId", "hwFwmSliceReasonDescription"],
    fieldOids: ["hwFwmSliceSlotStr": "1.3.6.1.4.1.2011.5.25.227.1.83", "hwFwmSliceInterfaceName": "1.3.6.1.4.1.2011.5.25.227.1.77", "hwFwmSliceId": "1.3.6.1.4.1.2011.5.25.227.1.78", "hwFwmSliceTrunkInterfaceName": "1.3.6.1.4.1.2011.5.25.227.1.79", "hwFwmSliceConflitReasonId": "1.3.6.1.4.1.2011.5.25.227.1.101", "hwFwmSliceReasonDescription": "1.3.6.1.4.1.2011.5.25.227.1.84"]
]

// --- hwFwdTblResThresholdExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.108
// Fields: hwFwdTableName, hwFwdTableUsage, hwFwdTableAlarmThreshold
// Description: The usage of fwd table resources exceeds the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.108"] = [
    name: "hwFwdTblResThresholdExceed",
    fields: ["hwFwdTableName", "hwFwdTableUsage", "hwFwdTableAlarmThreshold"],
    fieldOids: ["hwFwdTableName": "1.3.6.1.4.1.2011.5.25.227.1.100", "hwFwdTableUsage": "1.3.6.1.4.1.2011.5.25.227.1.106", "hwFwdTableAlarmThreshold": "1.3.6.1.4.1.2011.5.25.227.1.107"]
]

// --- hwFwdTblResThresholdExceedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.109
// Fields: hwFwdTableName, hwFwdTableUsage, hwFwdTableAlarmThreshold
// Description: The usage of fwd table resources falls below the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.109"] = [
    name: "hwFwdTblResThresholdExceedClear",
    fields: ["hwFwdTableName", "hwFwdTableUsage", "hwFwdTableAlarmThreshold"],
    fieldOids: ["hwFwdTableName": "1.3.6.1.4.1.2011.5.25.227.1.100", "hwFwdTableUsage": "1.3.6.1.4.1.2011.5.25.227.1.106", "hwFwdTableAlarmThreshold": "1.3.6.1.4.1.2011.5.25.227.1.107"]
]

// --- hwFwdEngineNotReady (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.110
// Fields: hwEntiyPhysicalindex, entPhysicalIndex, entPhysicalName
// Description: The Board forward engine is not ready.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.110"] = [
    name: "hwFwdEngineNotReady",
    fields: ["hwEntiyPhysicalindex", "entPhysicalIndex", "entPhysicalName"],
    fieldOids: ["hwEntiyPhysicalindex": "1.3.6.1.4.1.2011.5.25.227.1.98", "entPhysicalIndex": "1.3.6.1.2.1.47.1.1.1.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwFwdEngineNotReadyClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.111
// Fields: hwEntiyPhysicalindex, entPhysicalIndex, entPhysicalName
// Description: The Board forward engine is ready.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.111"] = [
    name: "hwFwdEngineNotReadyClear",
    fields: ["hwEntiyPhysicalindex", "entPhysicalIndex", "entPhysicalName"],
    fieldOids: ["hwEntiyPhysicalindex": "1.3.6.1.4.1.2011.5.25.227.1.98", "entPhysicalIndex": "1.3.6.1.2.1.47.1.1.1.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwIPv6SessLeakEntryNumberThresholdExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.112
// Fields: hwSessionCurEntryNum, hwSessionLeakEntryNum, hwSessionUnrecEntryNum, hwSessionSpecification, hwSessionLeakUsage, hwSessionLeakThreshold
// Description: The number of IPv6 session leak entries exceeds the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.112"] = [
    name: "hwIPv6SessLeakEntryNumberThresholdExceed",
    fields: ["hwSessionCurEntryNum", "hwSessionLeakEntryNum", "hwSessionUnrecEntryNum", "hwSessionSpecification", "hwSessionLeakUsage", "hwSessionLeakThreshold"],
    fieldOids: ["hwSessionCurEntryNum": "1.3.6.1.4.1.2011.5.25.227.1.86", "hwSessionLeakEntryNum": "1.3.6.1.4.1.2011.5.25.227.1.87", "hwSessionUnrecEntryNum": "1.3.6.1.4.1.2011.5.25.227.1.88", "hwSessionSpecification": "1.3.6.1.4.1.2011.5.25.227.1.89", "hwSessionLeakUsage": "1.3.6.1.4.1.2011.5.25.227.1.90", "hwSessionLeakThreshold": "1.3.6.1.4.1.2011.5.25.227.1.91"]
]

// --- hwIPv6SessLeakEntryNumberThresholdExceedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.113
// Fields: hwSessionCurEntryNum, hwSessionLeakEntryNum, hwSessionUnrecEntryNum, hwSessionSpecification, hwSessionLeakUsage, hwSessionLeakThreshold
// Description: The number of IPv6 session leak entries fell below the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.113"] = [
    name: "hwIPv6SessLeakEntryNumberThresholdExceedClear",
    fields: ["hwSessionCurEntryNum", "hwSessionLeakEntryNum", "hwSessionUnrecEntryNum", "hwSessionSpecification", "hwSessionLeakUsage", "hwSessionLeakThreshold"],
    fieldOids: ["hwSessionCurEntryNum": "1.3.6.1.4.1.2011.5.25.227.1.86", "hwSessionLeakEntryNum": "1.3.6.1.4.1.2011.5.25.227.1.87", "hwSessionUnrecEntryNum": "1.3.6.1.4.1.2011.5.25.227.1.88", "hwSessionSpecification": "1.3.6.1.4.1.2011.5.25.227.1.89", "hwSessionLeakUsage": "1.3.6.1.4.1.2011.5.25.227.1.90", "hwSessionLeakThreshold": "1.3.6.1.4.1.2011.5.25.227.1.91"]
]

// --- hwIPv6SessUnrecEntryNumberThresholdExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.114
// Fields: hwSessionCurEntryNum, hwSessionLeakEntryNum, hwSessionUnrecEntryNum, hwSessionSpecification, hwSessionUnrecUsage, hwSessionUnrecThreshold
// Description: The number of IPv6 session unrecoverable entries exceeds the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.114"] = [
    name: "hwIPv6SessUnrecEntryNumberThresholdExceed",
    fields: ["hwSessionCurEntryNum", "hwSessionLeakEntryNum", "hwSessionUnrecEntryNum", "hwSessionSpecification", "hwSessionUnrecUsage", "hwSessionUnrecThreshold"],
    fieldOids: ["hwSessionCurEntryNum": "1.3.6.1.4.1.2011.5.25.227.1.86", "hwSessionLeakEntryNum": "1.3.6.1.4.1.2011.5.25.227.1.87", "hwSessionUnrecEntryNum": "1.3.6.1.4.1.2011.5.25.227.1.88", "hwSessionSpecification": "1.3.6.1.4.1.2011.5.25.227.1.89", "hwSessionUnrecUsage": "1.3.6.1.4.1.2011.5.25.227.1.92", "hwSessionUnrecThreshold": "1.3.6.1.4.1.2011.5.25.227.1.93"]
]

// --- hwIPv6SessExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.115
// Fields: hwFwdSessionResUsage, hwSessThreshold, TopNSourceIpAddress
// Description: The number of IPv6 session resources exceeds the limit.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.115"] = [
    name: "hwIPv6SessExceed",
    fields: ["hwFwdSessionResUsage", "hwSessThreshold", "TopNSourceIpAddress"],
    fieldOids: ["hwFwdSessionResUsage": "1.3.6.1.4.1.2011.5.25.227.1.36", "hwSessThreshold": "1.3.6.1.4.1.2011.5.25.227.1.58", "TopNSourceIpAddress": "1.3.6.1.4.1.2011.5.25.227.1.85"]
]

// --- hwIPv6SessExceedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.116
// Fields: hwFwdSessionResUsage, hwSessThreshold
// Description: The number of IPv6 session resources falls below the limit.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.116"] = [
    name: "hwIPv6SessExceedClear",
    fields: ["hwFwdSessionResUsage", "hwSessThreshold"],
    fieldOids: ["hwFwdSessionResUsage": "1.3.6.1.4.1.2011.5.25.227.1.36", "hwSessThreshold": "1.3.6.1.4.1.2011.5.25.227.1.58"]
]

// --- hwIPv6SessThresholdExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.117
// Fields: hwFwdSessionResUsage, hwSessThreshold, TopNSourceIpAddress
// Description: The number of IPv6 session resources exceeds the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.117"] = [
    name: "hwIPv6SessThresholdExceed",
    fields: ["hwFwdSessionResUsage", "hwSessThreshold", "TopNSourceIpAddress"],
    fieldOids: ["hwFwdSessionResUsage": "1.3.6.1.4.1.2011.5.25.227.1.36", "hwSessThreshold": "1.3.6.1.4.1.2011.5.25.227.1.58", "TopNSourceIpAddress": "1.3.6.1.4.1.2011.5.25.227.1.85"]
]

// --- hwIPv6SessThresholdExceedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.118
// Fields: hwFwdSessionResUsage, hwSessThreshold
// Description: The number of IPv6 session resources falls below the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.118"] = [
    name: "hwIPv6SessThresholdExceedClear",
    fields: ["hwFwdSessionResUsage", "hwSessThreshold"],
    fieldOids: ["hwFwdSessionResUsage": "1.3.6.1.4.1.2011.5.25.227.1.36", "hwSessThreshold": "1.3.6.1.4.1.2011.5.25.227.1.58"]
]

// --- hwHardwareSessThresholdExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.119
// Fields: hwFwdSessionResUsage, hwSessThreshold, hwFwdMaxSessNum
// Description: The number of hardware session resources exceeds the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.119"] = [
    name: "hwHardwareSessThresholdExceed",
    fields: ["hwFwdSessionResUsage", "hwSessThreshold", "hwFwdMaxSessNum"],
    fieldOids: ["hwFwdSessionResUsage": "1.3.6.1.4.1.2011.5.25.227.1.36", "hwSessThreshold": "1.3.6.1.4.1.2011.5.25.227.1.58", "hwFwdMaxSessNum": "1.3.6.1.4.1.2011.5.25.227.1.108"]
]

// --- hwHardwareSessThresholdExceedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.120
// Fields: hwFwdSessionResUsage, hwSessThreshold, hwFwdMaxSessNum
// Description: The number of hardware session resources falls below the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.120"] = [
    name: "hwHardwareSessThresholdExceedClear",
    fields: ["hwFwdSessionResUsage", "hwSessThreshold", "hwFwdMaxSessNum"],
    fieldOids: ["hwFwdSessionResUsage": "1.3.6.1.4.1.2011.5.25.227.1.36", "hwSessThreshold": "1.3.6.1.4.1.2011.5.25.227.1.58", "hwFwdMaxSessNum": "1.3.6.1.4.1.2011.5.25.227.1.108"]
]

// --- hwHardwareSessExceedLimit (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.121
// Fields: hwFwdSessionResUsage, hwSessThreshold, hwFwdMaxSessNum
// Description: The number of hardware session resources exceeds the limit.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.121"] = [
    name: "hwHardwareSessExceedLimit",
    fields: ["hwFwdSessionResUsage", "hwSessThreshold", "hwFwdMaxSessNum"],
    fieldOids: ["hwFwdSessionResUsage": "1.3.6.1.4.1.2011.5.25.227.1.36", "hwSessThreshold": "1.3.6.1.4.1.2011.5.25.227.1.58", "hwFwdMaxSessNum": "1.3.6.1.4.1.2011.5.25.227.1.108"]
]

// --- hwHardwareSessExceedLimitClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.122
// Fields: hwFwdSessionResUsage, hwSessThreshold, hwFwdMaxSessNum
// Description: The number of hardware session resources falls below the limit.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.122"] = [
    name: "hwHardwareSessExceedLimitClear",
    fields: ["hwFwdSessionResUsage", "hwSessThreshold", "hwFwdMaxSessNum"],
    fieldOids: ["hwFwdSessionResUsage": "1.3.6.1.4.1.2011.5.25.227.1.36", "hwSessThreshold": "1.3.6.1.4.1.2011.5.25.227.1.58", "hwFwdMaxSessNum": "1.3.6.1.4.1.2011.5.25.227.1.108"]
]

// --- hwNetStreamIPv6OriginalFlowExceeded (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.123
// Fields: hwNetStreamIPv6OriginalFlowUsage, hwNetStreamIPv6OriginalFlowThreshold
// Description: The number of used NetStream IPv6 original flows exceeded the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.123"] = [
    name: "hwNetStreamIPv6OriginalFlowExceeded",
    fields: ["hwNetStreamIPv6OriginalFlowUsage", "hwNetStreamIPv6OriginalFlowThreshold"],
    fieldOids: ["hwNetStreamIPv6OriginalFlowUsage": "1.3.6.1.4.1.2011.5.25.227.1.109", "hwNetStreamIPv6OriginalFlowThreshold": "1.3.6.1.4.1.2011.5.25.227.1.110"]
]

// --- hwNetStreamIPv6OriginalFlowFellBelow (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.124
// Fields: hwNetStreamIPv6OriginalFlowUsage, hwNetStreamIPv6OriginalFlowThreshold
// Description: The number of used NetStream IPv6 original flows fell below the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.124"] = [
    name: "hwNetStreamIPv6OriginalFlowFellBelow",
    fields: ["hwNetStreamIPv6OriginalFlowUsage", "hwNetStreamIPv6OriginalFlowThreshold"],
    fieldOids: ["hwNetStreamIPv6OriginalFlowUsage": "1.3.6.1.4.1.2011.5.25.227.1.109", "hwNetStreamIPv6OriginalFlowThreshold": "1.3.6.1.4.1.2011.5.25.227.1.110"]
]

// --- hwNetStreamIPv6FlexibleFlowExceeded (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.125
// Fields: hwNetStreamIPv6FlexibleFlowUsage, hwNetStreamIPv6FlexibleFlowThreshold
// Description: The number of used NetStream IPv6 flexible flows exceeded the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.125"] = [
    name: "hwNetStreamIPv6FlexibleFlowExceeded",
    fields: ["hwNetStreamIPv6FlexibleFlowUsage", "hwNetStreamIPv6FlexibleFlowThreshold"],
    fieldOids: ["hwNetStreamIPv6FlexibleFlowUsage": "1.3.6.1.4.1.2011.5.25.227.1.111", "hwNetStreamIPv6FlexibleFlowThreshold": "1.3.6.1.4.1.2011.5.25.227.1.112"]
]

// --- hwNetStreamIPv6FlexibleFlowFellBelow (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.126
// Fields: hwNetStreamIPv6FlexibleFlowUsage, hwNetStreamIPv6FlexibleFlowThreshold
// Description: The number of used NetStream IPv6 flexible flows fell below the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.126"] = [
    name: "hwNetStreamIPv6FlexibleFlowFellBelow",
    fields: ["hwNetStreamIPv6FlexibleFlowUsage", "hwNetStreamIPv6FlexibleFlowThreshold"],
    fieldOids: ["hwNetStreamIPv6FlexibleFlowUsage": "1.3.6.1.4.1.2011.5.25.227.1.111", "hwNetStreamIPv6FlexibleFlowThreshold": "1.3.6.1.4.1.2011.5.25.227.1.112"]
]

// --- hwFwmModuleFaultAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.127
// Fields: hwFwmFaultSlotStr, hwFwmFaultCpuStr, hwFwmModuleName, hwFwmModuleFaultReasonId, hwFwmModuleFaultReasonDescription
// Description: This object indicates that a forwarding module encounters failure.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.127"] = [
    name: "hwFwmModuleFaultAlarm",
    fields: ["hwFwmFaultSlotStr", "hwFwmFaultCpuStr", "hwFwmModuleName", "hwFwmModuleFaultReasonId", "hwFwmModuleFaultReasonDescription"],
    fieldOids: ["hwFwmFaultSlotStr": "1.3.6.1.4.1.2011.5.25.227.1.73", "hwFwmFaultCpuStr": "1.3.6.1.4.1.2011.5.25.227.1.74", "hwFwmModuleName": "1.3.6.1.4.1.2011.5.25.227.1.113", "hwFwmModuleFaultReasonId": "1.3.6.1.4.1.2011.5.25.227.1.114", "hwFwmModuleFaultReasonDescription": "1.3.6.1.4.1.2011.5.25.227.1.115"]
]

// --- hwFwmModuleFaultAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.227.2.1.128
// Fields: hwFwmFaultSlotStr, hwFwmFaultCpuStr, hwFwmModuleName, hwFwmModuleFaultReasonId, hwFwmModuleFaultReasonDescription
// Description: This object indicates that a forwarding module recovers from failure.
trapMap["1.3.6.1.4.1.2011.5.25.227.2.1.128"] = [
    name: "hwFwmModuleFaultAlarmResume",
    fields: ["hwFwmFaultSlotStr", "hwFwmFaultCpuStr", "hwFwmModuleName", "hwFwmModuleFaultReasonId", "hwFwmModuleFaultReasonDescription"],
    fieldOids: ["hwFwmFaultSlotStr": "1.3.6.1.4.1.2011.5.25.227.1.73", "hwFwmFaultCpuStr": "1.3.6.1.4.1.2011.5.25.227.1.74", "hwFwmModuleName": "1.3.6.1.4.1.2011.5.25.227.1.113", "hwFwmModuleFaultReasonId": "1.3.6.1.4.1.2011.5.25.227.1.114", "hwFwmModuleFaultReasonDescription": "1.3.6.1.4.1.2011.5.25.227.1.115"]
]

// ===== Parsing logic =====

// Set to true to enable diagnostic logging for this MIB parser
DEBUG = false

LOG_PREFIX = "[HUAWEI-FWD-RES-TRAP-MIB]"
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
