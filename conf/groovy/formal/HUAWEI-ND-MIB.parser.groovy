/**
 * Auto-generated from HUAWEI-ND-MIB.mib
 * Generated: 2026-08-24T18:28:30.493649
 * Traps/Notifications (17): hwSlotNDThresholdExceedAlarm, hwSlotNDThresholdResumeAlarm, hwInterfaceNDThresholdExceedAlarm, hwInterfaceNDThresholdResumeAlarm, hwNDHostIPConflict, hwNDHostIPConflictResume, hwNDDuplicateIPv6, hwNDDuplicateIPv6Resume, hwNDDADNotFinished, hwNDAntiAttackRateLimit, hwNDProxyDynThresholdExceedAlarm, hwNDProxyDynThresholdResumeAlarm, hwNDIPv6ConflictEvent, hwSlotMultiNDThresholdExceedAlarm, hwSlotMultiNDThresholdResumeAlarm, hwMultiNDProxyDynThresholdExceedAlarm, hwMultiNDProxyDynThresholdResumeAlarm
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

// --- hwSlotNDThresholdExceedAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.332.2.1
// Fields: entPhysicalName, hwNDSlotThresholdExceedValue, hwNDSlotDynamicNumber, hwNDSlotStaticNumber, hwNDSlotRemoteNumber
// Description: This object indicates that an alarm is generated when the ratio of the number of ND entries on a board to the maximum number of ND entries supported on the board is greater than or equal to the 80% th...
trapMap["1.3.6.1.4.1.2011.5.25.332.2.1"] = [
    name: "hwSlotNDThresholdExceedAlarm",
    fields: ["entPhysicalName", "hwNDSlotThresholdExceedValue", "hwNDSlotDynamicNumber", "hwNDSlotStaticNumber", "hwNDSlotRemoteNumber"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwNDSlotThresholdExceedValue": "1.3.6.1.4.1.2011.5.25.332.1.1.1.2", "hwNDSlotDynamicNumber": "1.3.6.1.4.1.2011.5.25.332.1.1.1.4", "hwNDSlotStaticNumber": "1.3.6.1.4.1.2011.5.25.332.1.1.1.5", "hwNDSlotRemoteNumber": "1.3.6.1.4.1.2011.5.25.332.1.1.1.7"]
]

// --- hwSlotNDThresholdResumeAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.332.2.2
// Fields: entPhysicalName, hwNDSlotThresholdResumeValue, hwNDSlotDynamicNumber, hwNDSlotStaticNumber, hwNDSlotRemoteNumber
// Description: This object indicates that a clear alarm is generated when the ratio of the number of ND entries on a board to the maximum number of ND entries supported on the board is less than or equal to the 70% ...
trapMap["1.3.6.1.4.1.2011.5.25.332.2.2"] = [
    name: "hwSlotNDThresholdResumeAlarm",
    fields: ["entPhysicalName", "hwNDSlotThresholdResumeValue", "hwNDSlotDynamicNumber", "hwNDSlotStaticNumber", "hwNDSlotRemoteNumber"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwNDSlotThresholdResumeValue": "1.3.6.1.4.1.2011.5.25.332.1.1.1.3", "hwNDSlotDynamicNumber": "1.3.6.1.4.1.2011.5.25.332.1.1.1.4", "hwNDSlotStaticNumber": "1.3.6.1.4.1.2011.5.25.332.1.1.1.5", "hwNDSlotRemoteNumber": "1.3.6.1.4.1.2011.5.25.332.1.1.1.7"]
]

// --- hwInterfaceNDThresholdExceedAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.332.2.3
// Fields: entPhysicalName, ifDescr, hwNDIntfThresholdExceedValue, hwNDIntfDynamicNumber, hwNDIntfStaticNumber, hwNDIntfRemoteNumber
// Description: This object indicates that an alarm is generated when the ratio of the number of ND entries on an interface to the maximum number of ND entries supported on the interface is greater than or equal to t...
trapMap["1.3.6.1.4.1.2011.5.25.332.2.3"] = [
    name: "hwInterfaceNDThresholdExceedAlarm",
    fields: ["entPhysicalName", "ifDescr", "hwNDIntfThresholdExceedValue", "hwNDIntfDynamicNumber", "hwNDIntfStaticNumber", "hwNDIntfRemoteNumber"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "ifDescr": "1.3.6.1.2.1.2.2.1.2", "hwNDIntfThresholdExceedValue": "1.3.6.1.4.1.2011.5.25.332.1.2.1.2", "hwNDIntfDynamicNumber": "1.3.6.1.4.1.2011.5.25.332.1.2.1.4", "hwNDIntfStaticNumber": "1.3.6.1.4.1.2011.5.25.332.1.2.1.5", "hwNDIntfRemoteNumber": "1.3.6.1.4.1.2011.5.25.332.1.2.1.7"]
]

// --- hwInterfaceNDThresholdResumeAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.332.2.4
// Fields: entPhysicalName, ifDescr, hwNDIntfThresholdResumeValue, hwNDIntfDynamicNumber, hwNDIntfStaticNumber, hwNDIntfRemoteNumber
// Description: This object indicates that a clear alarm is generated when the ratio of the number of ND entries on an interface to the maximum number of ND entries supported on the interface is less than or equal to...
trapMap["1.3.6.1.4.1.2011.5.25.332.2.4"] = [
    name: "hwInterfaceNDThresholdResumeAlarm",
    fields: ["entPhysicalName", "ifDescr", "hwNDIntfThresholdResumeValue", "hwNDIntfDynamicNumber", "hwNDIntfStaticNumber", "hwNDIntfRemoteNumber"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "ifDescr": "1.3.6.1.2.1.2.2.1.2", "hwNDIntfThresholdResumeValue": "1.3.6.1.4.1.2011.5.25.332.1.2.1.3", "hwNDIntfDynamicNumber": "1.3.6.1.4.1.2011.5.25.332.1.2.1.4", "hwNDIntfStaticNumber": "1.3.6.1.4.1.2011.5.25.332.1.2.1.5", "hwNDIntfRemoteNumber": "1.3.6.1.4.1.2011.5.25.332.1.2.1.7"]
]

// --- hwNDHostIPConflict (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.332.2.5
// Fields: hwNDHostBdId, hwNDHostIpv6Addr, hwNDHostLocalMAC, hwNDHostLocalIf, hwNDHostLocalPevid, hwNDHostLocalCevid, hwNDHostRemoteMAC, hwNDHostRemoteIf, hwNDHostRemotePevid, hwNDHostRemoteCevid
// Description: This object indicates that an alarm is generated when there may be two host have the same IPv6 address.
trapMap["1.3.6.1.4.1.2011.5.25.332.2.5"] = [
    name: "hwNDHostIPConflict",
    fields: ["hwNDHostBdId", "hwNDHostIpv6Addr", "hwNDHostLocalMAC", "hwNDHostLocalIf", "hwNDHostLocalPevid", "hwNDHostLocalCevid", "hwNDHostRemoteMAC", "hwNDHostRemoteIf", "hwNDHostRemotePevid", "hwNDHostRemoteCevid"],
    fieldOids: ["hwNDHostBdId": "1.3.6.1.4.1.2011.5.25.332.1.3.1.1", "hwNDHostIpv6Addr": "1.3.6.1.4.1.2011.5.25.332.1.3.1.2", "hwNDHostLocalMAC": "1.3.6.1.4.1.2011.5.25.332.1.3.1.3", "hwNDHostLocalIf": "1.3.6.1.4.1.2011.5.25.332.1.3.1.4", "hwNDHostLocalPevid": "1.3.6.1.4.1.2011.5.25.332.1.3.1.5", "hwNDHostLocalCevid": "1.3.6.1.4.1.2011.5.25.332.1.3.1.6", "hwNDHostRemoteMAC": "1.3.6.1.4.1.2011.5.25.332.1.3.1.7", "hwNDHostRemoteIf": "1.3.6.1.4.1.2011.5.25.332.1.3.1.8", "hwNDHostRemotePevid": "1.3.6.1.4.1.2011.5.25.332.1.3.1.9", "hwNDHostRemoteCevid": "1.3.6.1.4.1.2011.5.25.332.1.3.1.10"]
]

// --- hwNDHostIPConflictResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.332.2.6
// Fields: hwNDHostBdId, hwNDHostIpv6Addr, hwNDHostLocalMAC, hwNDHostLocalIf, hwNDHostLocalPevid, hwNDHostLocalCevid, hwNDHostRemoteMAC, hwNDHostRemoteIf, hwNDHostRemotePevid, hwNDHostRemoteCevid
// Description: This object indicates the clear alarm of the alarm generated when there may be two host have the same IPv6 address.
trapMap["1.3.6.1.4.1.2011.5.25.332.2.6"] = [
    name: "hwNDHostIPConflictResume",
    fields: ["hwNDHostBdId", "hwNDHostIpv6Addr", "hwNDHostLocalMAC", "hwNDHostLocalIf", "hwNDHostLocalPevid", "hwNDHostLocalCevid", "hwNDHostRemoteMAC", "hwNDHostRemoteIf", "hwNDHostRemotePevid", "hwNDHostRemoteCevid"],
    fieldOids: ["hwNDHostBdId": "1.3.6.1.4.1.2011.5.25.332.1.3.1.1", "hwNDHostIpv6Addr": "1.3.6.1.4.1.2011.5.25.332.1.3.1.2", "hwNDHostLocalMAC": "1.3.6.1.4.1.2011.5.25.332.1.3.1.3", "hwNDHostLocalIf": "1.3.6.1.4.1.2011.5.25.332.1.3.1.4", "hwNDHostLocalPevid": "1.3.6.1.4.1.2011.5.25.332.1.3.1.5", "hwNDHostLocalCevid": "1.3.6.1.4.1.2011.5.25.332.1.3.1.6", "hwNDHostRemoteMAC": "1.3.6.1.4.1.2011.5.25.332.1.3.1.7", "hwNDHostRemoteIf": "1.3.6.1.4.1.2011.5.25.332.1.3.1.8", "hwNDHostRemotePevid": "1.3.6.1.4.1.2011.5.25.332.1.3.1.9", "hwNDHostRemoteCevid": "1.3.6.1.4.1.2011.5.25.332.1.3.1.10"]
]

// --- hwNDDuplicateIPv6 (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.332.2.7
// Fields: hwNDDulicatePktType, hwNDDulicateTgtIPv6Addr, hwNDDulicateTgtIf, hwNDDulicateLocalIf, hwNDDulicateSrcMAC, hwNDDulicateDstMAC, hwNDDulicateSrcIPv6Addr, hwNDDulicateDstIPv6Addr, hwNDDulicatePeVLAN, hwNDDulicateCeVLAN, hwNDDulicateSelfLoop, hwNDDulicateDadAttempts
// Description: This object indicates that an alarm is generated when customer config interface IPv6 address with the same as the current IPv6 address on the network.
trapMap["1.3.6.1.4.1.2011.5.25.332.2.7"] = [
    name: "hwNDDuplicateIPv6",
    fields: ["hwNDDulicatePktType", "hwNDDulicateTgtIPv6Addr", "hwNDDulicateTgtIf", "hwNDDulicateLocalIf", "hwNDDulicateSrcMAC", "hwNDDulicateDstMAC", "hwNDDulicateSrcIPv6Addr", "hwNDDulicateDstIPv6Addr", "hwNDDulicatePeVLAN", "hwNDDulicateCeVLAN", "hwNDDulicateSelfLoop", "hwNDDulicateDadAttempts"],
    fieldOids: ["hwNDDulicatePktType": "1.3.6.1.4.1.2011.5.25.332.1.4.1.1", "hwNDDulicateTgtIPv6Addr": "1.3.6.1.4.1.2011.5.25.332.1.4.1.2", "hwNDDulicateTgtIf": "1.3.6.1.4.1.2011.5.25.332.1.4.1.3", "hwNDDulicateLocalIf": "1.3.6.1.4.1.2011.5.25.332.1.4.1.4", "hwNDDulicateSrcMAC": "1.3.6.1.4.1.2011.5.25.332.1.4.1.5", "hwNDDulicateDstMAC": "1.3.6.1.4.1.2011.5.25.332.1.4.1.6", "hwNDDulicateSrcIPv6Addr": "1.3.6.1.4.1.2011.5.25.332.1.4.1.7", "hwNDDulicateDstIPv6Addr": "1.3.6.1.4.1.2011.5.25.332.1.4.1.8", "hwNDDulicatePeVLAN": "1.3.6.1.4.1.2011.5.25.332.1.4.1.9", "hwNDDulicateCeVLAN": "1.3.6.1.4.1.2011.5.25.332.1.4.1.10", "hwNDDulicateSelfLoop": "1.3.6.1.4.1.2011.5.25.332.1.4.1.11", "hwNDDulicateDadAttempts": "1.3.6.1.4.1.2011.5.25.332.1.4.1.12"]
]

// --- hwNDDuplicateIPv6Resume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.332.2.8
// Fields: hwNDDulicatePktType, hwNDDulicateTgtIPv6Addr, hwNDDulicateTgtIf, hwNDDulicateLocalIf, hwNDDulicateSrcMAC, hwNDDulicateDstMAC, hwNDDulicateSrcIPv6Addr, hwNDDulicateDstIPv6Addr, hwNDDulicatePeVLAN, hwNDDulicateCeVLAN, hwNDDulicateSelfLoop, hwNDDulicateDadAttempts
// Description: This object indicates the clear alarm of the alarm generated when there may not be an IPv6 address that has been used by any node to the interface
trapMap["1.3.6.1.4.1.2011.5.25.332.2.8"] = [
    name: "hwNDDuplicateIPv6Resume",
    fields: ["hwNDDulicatePktType", "hwNDDulicateTgtIPv6Addr", "hwNDDulicateTgtIf", "hwNDDulicateLocalIf", "hwNDDulicateSrcMAC", "hwNDDulicateDstMAC", "hwNDDulicateSrcIPv6Addr", "hwNDDulicateDstIPv6Addr", "hwNDDulicatePeVLAN", "hwNDDulicateCeVLAN", "hwNDDulicateSelfLoop", "hwNDDulicateDadAttempts"],
    fieldOids: ["hwNDDulicatePktType": "1.3.6.1.4.1.2011.5.25.332.1.4.1.1", "hwNDDulicateTgtIPv6Addr": "1.3.6.1.4.1.2011.5.25.332.1.4.1.2", "hwNDDulicateTgtIf": "1.3.6.1.4.1.2011.5.25.332.1.4.1.3", "hwNDDulicateLocalIf": "1.3.6.1.4.1.2011.5.25.332.1.4.1.4", "hwNDDulicateSrcMAC": "1.3.6.1.4.1.2011.5.25.332.1.4.1.5", "hwNDDulicateDstMAC": "1.3.6.1.4.1.2011.5.25.332.1.4.1.6", "hwNDDulicateSrcIPv6Addr": "1.3.6.1.4.1.2011.5.25.332.1.4.1.7", "hwNDDulicateDstIPv6Addr": "1.3.6.1.4.1.2011.5.25.332.1.4.1.8", "hwNDDulicatePeVLAN": "1.3.6.1.4.1.2011.5.25.332.1.4.1.9", "hwNDDulicateCeVLAN": "1.3.6.1.4.1.2011.5.25.332.1.4.1.10", "hwNDDulicateSelfLoop": "1.3.6.1.4.1.2011.5.25.332.1.4.1.11", "hwNDDulicateDadAttempts": "1.3.6.1.4.1.2011.5.25.332.1.4.1.12"]
]

// --- hwNDDADNotFinished (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.332.2.9
// Fields: hwNDDADIf, hwNDDADAddr, hwNDDADTimeout
// Description: This object indicates that an alarm is generated when DAD is not finished.
trapMap["1.3.6.1.4.1.2011.5.25.332.2.9"] = [
    name: "hwNDDADNotFinished",
    fields: ["hwNDDADIf", "hwNDDADAddr", "hwNDDADTimeout"],
    fieldOids: ["hwNDDADIf": "1.3.6.1.4.1.2011.5.25.332.1.5.1.1", "hwNDDADAddr": "1.3.6.1.4.1.2011.5.25.332.1.5.1.2", "hwNDDADTimeout": "1.3.6.1.4.1.2011.5.25.332.1.5.1.3"]
]

// --- hwNDAntiAttackRateLimit (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.332.2.10
// Fields: hwNDLimitPacketType, hwNDLimitSuppressVal, hwNDLimitCurrentVal, hwNDLimitSuppressType, hwNDLimitIf, hwNDLimitWorkIf, hwNDLimitSrcMAC, hwNDLimitDstMAC, hwNDLimitSrcIP, hwNDLimitDstIP, hwNDLimitTargetIP, hwNDLimitPeVLAN, hwNDLimitCeVLAN
// Description: This object indicates that an alarm is generated when ND packet or ND Miss message speed exceeds the rate limit.
trapMap["1.3.6.1.4.1.2011.5.25.332.2.10"] = [
    name: "hwNDAntiAttackRateLimit",
    fields: ["hwNDLimitPacketType", "hwNDLimitSuppressVal", "hwNDLimitCurrentVal", "hwNDLimitSuppressType", "hwNDLimitIf", "hwNDLimitWorkIf", "hwNDLimitSrcMAC", "hwNDLimitDstMAC", "hwNDLimitSrcIP", "hwNDLimitDstIP", "hwNDLimitTargetIP", "hwNDLimitPeVLAN", "hwNDLimitCeVLAN"],
    fieldOids: ["hwNDLimitPacketType": "1.3.6.1.4.1.2011.5.25.332.1.6.1.1", "hwNDLimitSuppressVal": "1.3.6.1.4.1.2011.5.25.332.1.6.1.2", "hwNDLimitCurrentVal": "1.3.6.1.4.1.2011.5.25.332.1.6.1.3", "hwNDLimitSuppressType": "1.3.6.1.4.1.2011.5.25.332.1.6.1.4", "hwNDLimitIf": "1.3.6.1.4.1.2011.5.25.332.1.6.1.5", "hwNDLimitWorkIf": "1.3.6.1.4.1.2011.5.25.332.1.6.1.6", "hwNDLimitSrcMAC": "1.3.6.1.4.1.2011.5.25.332.1.6.1.7", "hwNDLimitDstMAC": "1.3.6.1.4.1.2011.5.25.332.1.6.1.8", "hwNDLimitSrcIP": "1.3.6.1.4.1.2011.5.25.332.1.6.1.9", "hwNDLimitDstIP": "1.3.6.1.4.1.2011.5.25.332.1.6.1.10", "hwNDLimitTargetIP": "1.3.6.1.4.1.2011.5.25.332.1.6.1.11", "hwNDLimitPeVLAN": "1.3.6.1.4.1.2011.5.25.332.1.6.1.12", "hwNDLimitCeVLAN": "1.3.6.1.4.1.2011.5.25.332.1.6.1.13"]
]

// --- hwNDProxyDynThresholdExceedAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.332.2.11
// Fields: hwNDProxyThresholdExceedValue, hwNDProxyDynamicNumber
// Description: This object indicates that an alarm is generated when the ratio of the number of proxy ND dynamic entries on a board to the maximum number of proxy ND entries supported on the board is greater than or...
trapMap["1.3.6.1.4.1.2011.5.25.332.2.11"] = [
    name: "hwNDProxyDynThresholdExceedAlarm",
    fields: ["hwNDProxyThresholdExceedValue", "hwNDProxyDynamicNumber"],
    fieldOids: ["hwNDProxyThresholdExceedValue": "1.3.6.1.4.1.2011.5.25.332.1.7.1", "hwNDProxyDynamicNumber": "1.3.6.1.4.1.2011.5.25.332.1.7.3"]
]

// --- hwNDProxyDynThresholdResumeAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.332.2.12
// Fields: hwNDProxyThresholdResumeValue, hwNDProxyDynamicNumber
// Description: This object indicates that a clear alarm is generated when the ratio of the number of proxy ND dynmic entries on a board to the maximum number of proxy ND entries supported on the board is less than o...
trapMap["1.3.6.1.4.1.2011.5.25.332.2.12"] = [
    name: "hwNDProxyDynThresholdResumeAlarm",
    fields: ["hwNDProxyThresholdResumeValue", "hwNDProxyDynamicNumber"],
    fieldOids: ["hwNDProxyThresholdResumeValue": "1.3.6.1.4.1.2011.5.25.332.1.7.2", "hwNDProxyDynamicNumber": "1.3.6.1.4.1.2011.5.25.332.1.7.3"]
]

// --- hwNDIPv6ConflictEvent (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.332.2.13
// Fields: hwNDIPv6ConflictIPv6Address, hwNDIPv6ConflictLocalMAC, hwNDIPv6ConflictLocalInterfaceName, hwNDIPv6ConflictLocalWorkInterfaceName, hwNDIPv6ConflictLocalPEVLAN, hwNDIPv6ConflictLocalCEVLAN, hwNDIPv6ConflictReceiveMAC, hwNDIPv6ConflictReceiveInterfaceName, hwNDIPv6ConflictReceiveWorkInterfaceName, hwNDIPv6ConflictReceivePEVLAN, hwNDIPv6ConflictReceiveCEVLAN
// Description: Trap about ND IPv6 address conflict information.
trapMap["1.3.6.1.4.1.2011.5.25.332.2.13"] = [
    name: "hwNDIPv6ConflictEvent",
    fields: ["hwNDIPv6ConflictIPv6Address", "hwNDIPv6ConflictLocalMAC", "hwNDIPv6ConflictLocalInterfaceName", "hwNDIPv6ConflictLocalWorkInterfaceName", "hwNDIPv6ConflictLocalPEVLAN", "hwNDIPv6ConflictLocalCEVLAN", "hwNDIPv6ConflictReceiveMAC", "hwNDIPv6ConflictReceiveInterfaceName", "hwNDIPv6ConflictReceiveWorkInterfaceName", "hwNDIPv6ConflictReceivePEVLAN", "hwNDIPv6ConflictReceiveCEVLAN"],
    fieldOids: ["hwNDIPv6ConflictIPv6Address": "1.3.6.1.4.1.2011.5.25.332.1.8.1.1", "hwNDIPv6ConflictLocalMAC": "1.3.6.1.4.1.2011.5.25.332.1.8.1.2", "hwNDIPv6ConflictLocalInterfaceName": "1.3.6.1.4.1.2011.5.25.332.1.8.1.3", "hwNDIPv6ConflictLocalWorkInterfaceName": "1.3.6.1.4.1.2011.5.25.332.1.8.1.4", "hwNDIPv6ConflictLocalPEVLAN": "1.3.6.1.4.1.2011.5.25.332.1.8.1.5", "hwNDIPv6ConflictLocalCEVLAN": "1.3.6.1.4.1.2011.5.25.332.1.8.1.6", "hwNDIPv6ConflictReceiveMAC": "1.3.6.1.4.1.2011.5.25.332.1.8.1.7", "hwNDIPv6ConflictReceiveInterfaceName": "1.3.6.1.4.1.2011.5.25.332.1.8.1.8", "hwNDIPv6ConflictReceiveWorkInterfaceName": "1.3.6.1.4.1.2011.5.25.332.1.8.1.9", "hwNDIPv6ConflictReceivePEVLAN": "1.3.6.1.4.1.2011.5.25.332.1.8.1.10", "hwNDIPv6ConflictReceiveCEVLAN": "1.3.6.1.4.1.2011.5.25.332.1.8.1.11"]
]

// --- hwSlotMultiNDThresholdExceedAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.332.2.14
// Fields: entPhysicalName, hwNDComponentPid, hwNDCompThresholdExceedValue, hwNDCompDynamicNumber, hwNDCompStaticNumber, hwNDCompRemoteNumber
// Description: This object indicates that an alarm is generated when the ratio of the number of ND entries in a ND component to the maximum number of ND entries supported in the ND component is greater than or equal...
trapMap["1.3.6.1.4.1.2011.5.25.332.2.14"] = [
    name: "hwSlotMultiNDThresholdExceedAlarm",
    fields: ["entPhysicalName", "hwNDComponentPid", "hwNDCompThresholdExceedValue", "hwNDCompDynamicNumber", "hwNDCompStaticNumber", "hwNDCompRemoteNumber"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwNDComponentPid": "1.3.6.1.4.1.2011.5.25.332.1.9.1.2", "hwNDCompThresholdExceedValue": "1.3.6.1.4.1.2011.5.25.332.1.9.1.3", "hwNDCompDynamicNumber": "1.3.6.1.4.1.2011.5.25.332.1.9.1.5", "hwNDCompStaticNumber": "1.3.6.1.4.1.2011.5.25.332.1.9.1.6", "hwNDCompRemoteNumber": "1.3.6.1.4.1.2011.5.25.332.1.9.1.8"]
]

// --- hwSlotMultiNDThresholdResumeAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.332.2.15
// Fields: entPhysicalName, hwNDComponentPid, hwNDCompThresholdResumeValue, hwNDCompDynamicNumber, hwNDCompStaticNumber, hwNDCompRemoteNumber
// Description: This object indicates that a clear alarm is generated when the ratio of the number of ND entries in a ND component to the maximum number of ND entries supported in the ND component is less than or equ...
trapMap["1.3.6.1.4.1.2011.5.25.332.2.15"] = [
    name: "hwSlotMultiNDThresholdResumeAlarm",
    fields: ["entPhysicalName", "hwNDComponentPid", "hwNDCompThresholdResumeValue", "hwNDCompDynamicNumber", "hwNDCompStaticNumber", "hwNDCompRemoteNumber"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwNDComponentPid": "1.3.6.1.4.1.2011.5.25.332.1.9.1.2", "hwNDCompThresholdResumeValue": "1.3.6.1.4.1.2011.5.25.332.1.9.1.4", "hwNDCompDynamicNumber": "1.3.6.1.4.1.2011.5.25.332.1.9.1.5", "hwNDCompStaticNumber": "1.3.6.1.4.1.2011.5.25.332.1.9.1.6", "hwNDCompRemoteNumber": "1.3.6.1.4.1.2011.5.25.332.1.9.1.8"]
]

// --- hwMultiNDProxyDynThresholdExceedAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.332.2.16
// Fields: hwNDProxyComponentPid, hwNDProxyCompThresholdExceedValue, hwNDProxyCompDynamicNumber
// Description: This object indicates that an alarm is generated when the ratio of the number of proxy ND dynamic entries in a ND component to the maximum number of proxy ND entries supported in the ND component is g...
trapMap["1.3.6.1.4.1.2011.5.25.332.2.16"] = [
    name: "hwMultiNDProxyDynThresholdExceedAlarm",
    fields: ["hwNDProxyComponentPid", "hwNDProxyCompThresholdExceedValue", "hwNDProxyCompDynamicNumber"],
    fieldOids: ["hwNDProxyComponentPid": "1.3.6.1.4.1.2011.5.25.332.1.10.1.1", "hwNDProxyCompThresholdExceedValue": "1.3.6.1.4.1.2011.5.25.332.1.10.1.2", "hwNDProxyCompDynamicNumber": "1.3.6.1.4.1.2011.5.25.332.1.10.1.4"]
]

// --- hwMultiNDProxyDynThresholdResumeAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.332.2.17
// Fields: hwNDProxyComponentPid, hwNDProxyCompThresholdResumeValue, hwNDProxyCompDynamicNumber
// Description: This object indicates that a clear alarm is generated when the ratio of the number of proxy ND dynmic entries in a ND component to the maximum number of proxy ND entries supported in the ND component ...
trapMap["1.3.6.1.4.1.2011.5.25.332.2.17"] = [
    name: "hwMultiNDProxyDynThresholdResumeAlarm",
    fields: ["hwNDProxyComponentPid", "hwNDProxyCompThresholdResumeValue", "hwNDProxyCompDynamicNumber"],
    fieldOids: ["hwNDProxyComponentPid": "1.3.6.1.4.1.2011.5.25.332.1.10.1.1", "hwNDProxyCompThresholdResumeValue": "1.3.6.1.4.1.2011.5.25.332.1.10.1.3", "hwNDProxyCompDynamicNumber": "1.3.6.1.4.1.2011.5.25.332.1.10.1.4"]
]

// ===== Parsing logic =====

// Set to true to enable diagnostic logging for this MIB parser
DEBUG = false

LOG_PREFIX = "[HUAWEI-ND-MIB]"
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
