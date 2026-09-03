/**
 * Auto-generated from HUAWEI-SECURITY-MIB.mib
 * Generated: 2026-08-24T18:28:30.892156900
 * Traps/Notifications (102): hwBaseSecurityUrpfDiscardedRateRising, hwBaseSecurityUrpfDiscardedRateResume, hwBaseSecurityTcpIpAttackDiscardedRateRising, hwBaseSecurityTcpIpAttackDiscardedRateResume, hwBaseSecurityMaDiscardedRateRising, hwBaseSecurityMaDiscardedRateResume, hwBaseSecurityApplicationApperceiveDiscardedRateRising, hwBaseSecurityApplicationApperceiveDiscardedRateResume, hwBaseSecurityStormControlInterface, hwBaseSocAttackTrap, hwBaseSocAttackResumeTrap, hwBaseSecurityStormControlInterfaceResume, hwBaseArpVlanCarTrap, hwBaseArpVlanCarResumeTrap, hwBaseSecurityAntiAttackRateRising, hwBaseSecurityAntiAttackRateResume, hwBaseArpVlanCarEnhanceTrap, hwBaseArpVlanCarEnhanceResumeTrap, hwL3LoopDetectAlarm, hwL3LoopDetectAlarmResume, hwBaseNdVlanCarTrap, hwBaseNdVlanCarResumeTrap, hwL3LoopDetectAlarmVpn, hwL3LoopDetectAlarmVpnResume, hwStrackUserInfo, hwStrackIfVlanInfo, hwStrackDenyPacket, hwStrackErrorDown, hwStrackIpInfo, hwStrackUserAbnormal, hwArpsGatewayConflict, hwArpsEntryCheck, hwArpsPacketCheck, hwArpsDaiDropALarm, hwArpGlobleSpeedLimitALarm, hwArpIfSpeedLimitALarm, hwArpVlanSpeedLimitALarm, hwArpMissGlobleSpeedLimitALarm, hwArpMissIfSpeedLimitALarm, hwArpMissVlanSpeedLimitALarm, hwArpSourceIpSpeedLimitALarm, hwArpMissSourceIpSpeedLimitALarm, hwArpIfRateLimitBlockALarm, hwArpsLearnStrictCheck, hwArpSourceMacSpeedLimitALarm, hwArpsDaiBDDropALarm, hwArpsDaiVlanDropALarm, hwArpsVbdifGatewayConflict, hwIpsgDropALarm, hwIpsgVlanDropALarm, hwIpsgv4ResourceALarm, hwIpsgv4ResourceResume, hwIpsgv6ResourceALarm, hwIpsgv6ResourceResume, hwIcmpGlobleDropALarm, hwIcmpIfDropALarm, hwDapMibPortChange, hwDapMibAuthRequest, hwCfgApTrapFailAlarm, hwCpcarDropPacketAlarm, hwCpcarDropPacketAlarmResume, hwCpcarAutoPortDefendAlarm, hwCpcarAutoPortDefendAlarmResume, hwCpcarReduceCarAlarm, hwCpcarReduceCarAlarmResume, hwAutoPortDefendViaMflpAlarm, hwAutoPortDefendViaMflpAlarmResume, hwMACsecFailNotify, hwStrackPortAtk, hwTeSourceInterfaceCheckAlarm, hwTeSourceInterfaceCheckResume, hwOlcStartAlarm, hwOlcStopAlarm, hwEngineSessThresholdAlarm, hwEngineSessThresholdResume, hwWeakEAConfigAlarm, hwPPEDropPacketAlarm, hwPPEDropPacketAlarmResume, hwTerminalStatusAbnormal, hwTerminalStatusResume, hwTerminalNumAlarm, hwSessionCarAttackInfo, hwAccessRateRemainsLowAlarm, hwAccessRateRemainsLowAlarmResume, hwCuFirstAccessRateRemainsLowAlarm, hwCuFirstAccessRateRemainsLowAlarmResume, hwCuSecondAccessRateRemainsLowAlarm, hwCuSecondAccessRateRemainsLowAlarmResume, hwEngineFlowAlarm, hwEngineFlowAlarmResume, hwEngineAppFeatureAlarm, hwEngineAppFeatureAlarmResume, hwSSHAttackAlarm, hwStormSuppIfmAlarm, hwStormSuppIfmAlarmResume, hwStormSuppVlanAlarm, hwStormSuppVlanAlarmResume, hwStormSuppBdAlarm, hwStormSuppBdAlarmResume, hwLinkupCarDropPacketAlarm, hwLinkupCarDropPacketAlarmResume, hwBoardNotSupoortArpCheckDIPTrap
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

// --- hwBaseSecurityUrpfDiscardedRateRising (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.165.1.11.1
// Fields: hwLocalUrpfCurrentRateLow, hwLocalUrpfCurrentRateHigh, hwLocalUrpfNotifyEnabledStatus, hwLocalUrpfRateThreshold, hwLocalUrpfRateInterval, hwLocalUrpfChassisId, hwLocalUrpfSlotId
// Description: This object indicates that the alarm about packet discarding through URPF is generated.
trapMap["1.3.6.1.4.1.2011.5.25.165.1.11.1"] = [
    name: "hwBaseSecurityUrpfDiscardedRateRising",
    fields: ["hwLocalUrpfCurrentRateLow", "hwLocalUrpfCurrentRateHigh", "hwLocalUrpfNotifyEnabledStatus", "hwLocalUrpfRateThreshold", "hwLocalUrpfRateInterval", "hwLocalUrpfChassisId", "hwLocalUrpfSlotId"],
    fieldOids: ["hwLocalUrpfCurrentRateLow": "1.3.6.1.4.1.2011.5.25.165.1.2.1.1.11", "hwLocalUrpfCurrentRateHigh": "1.3.6.1.4.1.2011.5.25.165.1.2.1.1.12", "hwLocalUrpfNotifyEnabledStatus": "1.3.6.1.4.1.2011.5.25.165.1.2.1.1.13", "hwLocalUrpfRateThreshold": "1.3.6.1.4.1.2011.5.25.165.1.2.1.1.14", "hwLocalUrpfRateInterval": "1.3.6.1.4.1.2011.5.25.165.1.2.1.1.15", "hwLocalUrpfChassisId": "1.3.6.1.4.1.2011.5.25.165.1.2.1.1.1", "hwLocalUrpfSlotId": "1.3.6.1.4.1.2011.5.25.165.1.2.1.1.2"]
]

// --- hwBaseSecurityUrpfDiscardedRateResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.165.1.11.2
// Fields: hwLocalUrpfCurrentRateLow, hwLocalUrpfCurrentRateHigh, hwLocalUrpfNotifyEnabledStatus, hwLocalUrpfRateThreshold, hwLocalUrpfRateInterval, hwLocalUrpfChassisId, hwLocalUrpfSlotId
// Description: This object indicates that the alarm about packet discarding through URPF is rectified.
trapMap["1.3.6.1.4.1.2011.5.25.165.1.11.2"] = [
    name: "hwBaseSecurityUrpfDiscardedRateResume",
    fields: ["hwLocalUrpfCurrentRateLow", "hwLocalUrpfCurrentRateHigh", "hwLocalUrpfNotifyEnabledStatus", "hwLocalUrpfRateThreshold", "hwLocalUrpfRateInterval", "hwLocalUrpfChassisId", "hwLocalUrpfSlotId"],
    fieldOids: ["hwLocalUrpfCurrentRateLow": "1.3.6.1.4.1.2011.5.25.165.1.2.1.1.11", "hwLocalUrpfCurrentRateHigh": "1.3.6.1.4.1.2011.5.25.165.1.2.1.1.12", "hwLocalUrpfNotifyEnabledStatus": "1.3.6.1.4.1.2011.5.25.165.1.2.1.1.13", "hwLocalUrpfRateThreshold": "1.3.6.1.4.1.2011.5.25.165.1.2.1.1.14", "hwLocalUrpfRateInterval": "1.3.6.1.4.1.2011.5.25.165.1.2.1.1.15", "hwLocalUrpfChassisId": "1.3.6.1.4.1.2011.5.25.165.1.2.1.1.1", "hwLocalUrpfSlotId": "1.3.6.1.4.1.2011.5.25.165.1.2.1.1.2"]
]

// --- hwBaseSecurityTcpIpAttackDiscardedRateRising (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.165.1.11.3
// Fields: hwTcpIpDefendCurrentRateLow, hwTcpIpDefendCurrentRateHigh, hwTcpIpDefendRateThreshold, hwTcpIpDefendRateInterval, hwTcpIpDefendChassisId, hwTcpIpDefendSlotId, hwTcpIpDefendType, hwTcpIpDefendProtocolDescirption
// Description: This object indicates that an alarm is generated when the number of bytes of discarded TCP/IP attack packets exceeds the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.165.1.11.3"] = [
    name: "hwBaseSecurityTcpIpAttackDiscardedRateRising",
    fields: ["hwTcpIpDefendCurrentRateLow", "hwTcpIpDefendCurrentRateHigh", "hwTcpIpDefendRateThreshold", "hwTcpIpDefendRateInterval", "hwTcpIpDefendChassisId", "hwTcpIpDefendSlotId", "hwTcpIpDefendType", "hwTcpIpDefendProtocolDescirption"],
    fieldOids: ["hwTcpIpDefendCurrentRateLow": "1.3.6.1.4.1.2011.5.25.165.1.3.1.1.11", "hwTcpIpDefendCurrentRateHigh": "1.3.6.1.4.1.2011.5.25.165.1.3.1.1.12", "hwTcpIpDefendRateThreshold": "1.3.6.1.4.1.2011.5.25.165.1.3.1.1.14", "hwTcpIpDefendRateInterval": "1.3.6.1.4.1.2011.5.25.165.1.3.1.1.15", "hwTcpIpDefendChassisId": "1.3.6.1.4.1.2011.5.25.165.1.3.1.1.1", "hwTcpIpDefendSlotId": "1.3.6.1.4.1.2011.5.25.165.1.3.1.1.2", "hwTcpIpDefendType": "1.3.6.1.4.1.2011.5.25.165.1.3.1.1.3", "hwTcpIpDefendProtocolDescirption": "1.3.6.1.4.1.2011.5.25.165.1.3.1.1.16"]
]

// --- hwBaseSecurityTcpIpAttackDiscardedRateResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.165.1.11.4
// Fields: hwTcpIpDefendCurrentRateLow, hwTcpIpDefendCurrentRateHigh, hwTcpIpDefendRateThreshold, hwTcpIpDefendRateInterval, hwTcpIpDefendChassisId, hwTcpIpDefendSlotId, hwTcpIpDefendType, hwTcpIpDefendProtocolDescirption
// Description: This object indicates that the alarm is cleared when the number of bytes of discarded TCP/IP attack packets falls below the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.165.1.11.4"] = [
    name: "hwBaseSecurityTcpIpAttackDiscardedRateResume",
    fields: ["hwTcpIpDefendCurrentRateLow", "hwTcpIpDefendCurrentRateHigh", "hwTcpIpDefendRateThreshold", "hwTcpIpDefendRateInterval", "hwTcpIpDefendChassisId", "hwTcpIpDefendSlotId", "hwTcpIpDefendType", "hwTcpIpDefendProtocolDescirption"],
    fieldOids: ["hwTcpIpDefendCurrentRateLow": "1.3.6.1.4.1.2011.5.25.165.1.3.1.1.11", "hwTcpIpDefendCurrentRateHigh": "1.3.6.1.4.1.2011.5.25.165.1.3.1.1.12", "hwTcpIpDefendRateThreshold": "1.3.6.1.4.1.2011.5.25.165.1.3.1.1.14", "hwTcpIpDefendRateInterval": "1.3.6.1.4.1.2011.5.25.165.1.3.1.1.15", "hwTcpIpDefendChassisId": "1.3.6.1.4.1.2011.5.25.165.1.3.1.1.1", "hwTcpIpDefendSlotId": "1.3.6.1.4.1.2011.5.25.165.1.3.1.1.2", "hwTcpIpDefendType": "1.3.6.1.4.1.2011.5.25.165.1.3.1.1.3", "hwTcpIpDefendProtocolDescirption": "1.3.6.1.4.1.2011.5.25.165.1.3.1.1.16"]
]

// --- hwBaseSecurityMaDiscardedRateRising (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.165.1.11.5
// Fields: hwMaDefendCurrentRateLow, hwMaDefendCurrentRateHigh, hwMaDefendRateThreshold, hwMaDefendRateInterval, hwMaDefendChassisId, hwMaDefendSlotId, hwMaDefendProtocol
// Description: This object indicates that an alarm is generated when the rate for discarding packets by the management and service protection plane exceeds the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.165.1.11.5"] = [
    name: "hwBaseSecurityMaDiscardedRateRising",
    fields: ["hwMaDefendCurrentRateLow", "hwMaDefendCurrentRateHigh", "hwMaDefendRateThreshold", "hwMaDefendRateInterval", "hwMaDefendChassisId", "hwMaDefendSlotId", "hwMaDefendProtocol"],
    fieldOids: ["hwMaDefendCurrentRateLow": "1.3.6.1.4.1.2011.5.25.165.1.4.1.1.11", "hwMaDefendCurrentRateHigh": "1.3.6.1.4.1.2011.5.25.165.1.4.1.1.12", "hwMaDefendRateThreshold": "1.3.6.1.4.1.2011.5.25.165.1.4.1.1.14", "hwMaDefendRateInterval": "1.3.6.1.4.1.2011.5.25.165.1.4.1.1.15", "hwMaDefendChassisId": "1.3.6.1.4.1.2011.5.25.165.1.4.1.1.1", "hwMaDefendSlotId": "1.3.6.1.4.1.2011.5.25.165.1.4.1.1.2", "hwMaDefendProtocol": "1.3.6.1.4.1.2011.5.25.165.1.4.1.1.3"]
]

// --- hwBaseSecurityMaDiscardedRateResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.165.1.11.6
// Fields: hwMaDefendCurrentRateLow, hwMaDefendCurrentRateHigh, hwMaDefendRateThreshold, hwMaDefendRateInterval, hwMaDefendChassisId, hwMaDefendSlotId, hwMaDefendProtocol
// Description: This object indicates that the alarm is cleared when the rate for discarding packets by the management and service protection plane becomes normal again.
trapMap["1.3.6.1.4.1.2011.5.25.165.1.11.6"] = [
    name: "hwBaseSecurityMaDiscardedRateResume",
    fields: ["hwMaDefendCurrentRateLow", "hwMaDefendCurrentRateHigh", "hwMaDefendRateThreshold", "hwMaDefendRateInterval", "hwMaDefendChassisId", "hwMaDefendSlotId", "hwMaDefendProtocol"],
    fieldOids: ["hwMaDefendCurrentRateLow": "1.3.6.1.4.1.2011.5.25.165.1.4.1.1.11", "hwMaDefendCurrentRateHigh": "1.3.6.1.4.1.2011.5.25.165.1.4.1.1.12", "hwMaDefendRateThreshold": "1.3.6.1.4.1.2011.5.25.165.1.4.1.1.14", "hwMaDefendRateInterval": "1.3.6.1.4.1.2011.5.25.165.1.4.1.1.15", "hwMaDefendChassisId": "1.3.6.1.4.1.2011.5.25.165.1.4.1.1.1", "hwMaDefendSlotId": "1.3.6.1.4.1.2011.5.25.165.1.4.1.1.2", "hwMaDefendProtocol": "1.3.6.1.4.1.2011.5.25.165.1.4.1.1.3"]
]

// --- hwBaseSecurityApplicationApperceiveDiscardedRateRising (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.165.1.11.7
// Fields: hwAppliApperCurrentRateLow, hwAppliApperCurrentRateHigh, hwAppliApperRateThreshold, hwAppliApperRateInterval, hwAppliApperChassisId, hwAppliApperSlotId, hwAppliApperProtocol, hwAppliApperProtocolDescirption
// Description: This object indicates that an alarm is generated when the number of discarded attack packets detected by application layer association exceeds the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.165.1.11.7"] = [
    name: "hwBaseSecurityApplicationApperceiveDiscardedRateRising",
    fields: ["hwAppliApperCurrentRateLow", "hwAppliApperCurrentRateHigh", "hwAppliApperRateThreshold", "hwAppliApperRateInterval", "hwAppliApperChassisId", "hwAppliApperSlotId", "hwAppliApperProtocol", "hwAppliApperProtocolDescirption"],
    fieldOids: ["hwAppliApperCurrentRateLow": "1.3.6.1.4.1.2011.5.25.165.1.5.1.1.11", "hwAppliApperCurrentRateHigh": "1.3.6.1.4.1.2011.5.25.165.1.5.1.1.12", "hwAppliApperRateThreshold": "1.3.6.1.4.1.2011.5.25.165.1.5.1.1.14", "hwAppliApperRateInterval": "1.3.6.1.4.1.2011.5.25.165.1.5.1.1.15", "hwAppliApperChassisId": "1.3.6.1.4.1.2011.5.25.165.1.5.1.1.1", "hwAppliApperSlotId": "1.3.6.1.4.1.2011.5.25.165.1.5.1.1.2", "hwAppliApperProtocol": "1.3.6.1.4.1.2011.5.25.165.1.5.1.1.3", "hwAppliApperProtocolDescirption": "1.3.6.1.4.1.2011.5.25.165.1.5.1.1.16"]
]

// --- hwBaseSecurityApplicationApperceiveDiscardedRateResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.165.1.11.8
// Fields: hwAppliApperCurrentRateLow, hwAppliApperCurrentRateHigh, hwAppliApperRateThreshold, hwAppliApperRateInterval, hwAppliApperChassisId, hwAppliApperSlotId, hwAppliApperProtocol, hwAppliApperProtocolDescirption
// Description: This object indicates that the alarm is cleared when the number of discarded attack packets detected by application layer association falls below the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.165.1.11.8"] = [
    name: "hwBaseSecurityApplicationApperceiveDiscardedRateResume",
    fields: ["hwAppliApperCurrentRateLow", "hwAppliApperCurrentRateHigh", "hwAppliApperRateThreshold", "hwAppliApperRateInterval", "hwAppliApperChassisId", "hwAppliApperSlotId", "hwAppliApperProtocol", "hwAppliApperProtocolDescirption"],
    fieldOids: ["hwAppliApperCurrentRateLow": "1.3.6.1.4.1.2011.5.25.165.1.5.1.1.11", "hwAppliApperCurrentRateHigh": "1.3.6.1.4.1.2011.5.25.165.1.5.1.1.12", "hwAppliApperRateThreshold": "1.3.6.1.4.1.2011.5.25.165.1.5.1.1.14", "hwAppliApperRateInterval": "1.3.6.1.4.1.2011.5.25.165.1.5.1.1.15", "hwAppliApperChassisId": "1.3.6.1.4.1.2011.5.25.165.1.5.1.1.1", "hwAppliApperSlotId": "1.3.6.1.4.1.2011.5.25.165.1.5.1.1.2", "hwAppliApperProtocol": "1.3.6.1.4.1.2011.5.25.165.1.5.1.1.3", "hwAppliApperProtocolDescirption": "1.3.6.1.4.1.2011.5.25.165.1.5.1.1.16"]
]

// --- hwBaseSecurityStormControlInterface (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.165.1.11.9
// Fields: hwBaseSecurityStormControlInterfaceChassisId, hwBaseSecurityStormControlInterfaceSlotId, hwBaseSecurityStormControlInterfaceName, hwBaseSecurityStormControlInterfaceVlanID
// Description: This object indicates that an alarm is generated when the number of discarded attack packets in case of an interface loop exceeds the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.165.1.11.9"] = [
    name: "hwBaseSecurityStormControlInterface",
    fields: ["hwBaseSecurityStormControlInterfaceChassisId", "hwBaseSecurityStormControlInterfaceSlotId", "hwBaseSecurityStormControlInterfaceName", "hwBaseSecurityStormControlInterfaceVlanID"],
    fieldOids: ["hwBaseSecurityStormControlInterfaceChassisId": "1.3.6.1.4.1.2011.5.25.165.1.13.1.1.1", "hwBaseSecurityStormControlInterfaceSlotId": "1.3.6.1.4.1.2011.5.25.165.1.13.1.1.2", "hwBaseSecurityStormControlInterfaceName": "1.3.6.1.4.1.2011.5.25.165.1.13.1.1.3", "hwBaseSecurityStormControlInterfaceVlanID": "1.3.6.1.4.1.2011.5.25.165.1.13.1.1.4"]
]

// --- hwBaseSocAttackTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.165.1.11.12
// Fields: hwSocAttackSeqNo, hwSocAttackPossib, hwSocAttackReason, hwSocAttackIfName, hwSocAttackSubIfName, hwSocAttackVlanIndex, hwSocAttackUserQinQIndex, hwSocAttackMacAddr, hwSocAttackIPAddr, hwSocAttackIPv6Addr, hwSocAttackVniIndex
// Description: This object indicates that an alarm is generated when the CPU usages of the device and packet delivery process go high and a large number of packets monitored by the Security Management Center are dis...
trapMap["1.3.6.1.4.1.2011.5.25.165.1.11.12"] = [
    name: "hwBaseSocAttackTrap",
    fields: ["hwSocAttackSeqNo", "hwSocAttackPossib", "hwSocAttackReason", "hwSocAttackIfName", "hwSocAttackSubIfName", "hwSocAttackVlanIndex", "hwSocAttackUserQinQIndex", "hwSocAttackMacAddr", "hwSocAttackIPAddr", "hwSocAttackIPv6Addr", "hwSocAttackVniIndex"],
    fieldOids: ["hwSocAttackSeqNo": "1.3.6.1.4.1.2011.5.25.165.1.7.1.1.1", "hwSocAttackPossib": "1.3.6.1.4.1.2011.5.25.165.1.7.1.1.2", "hwSocAttackReason": "1.3.6.1.4.1.2011.5.25.165.1.7.1.1.3", "hwSocAttackIfName": "1.3.6.1.4.1.2011.5.25.165.1.7.1.1.4", "hwSocAttackSubIfName": "1.3.6.1.4.1.2011.5.25.165.1.7.1.1.5", "hwSocAttackVlanIndex": "1.3.6.1.4.1.2011.5.25.165.1.7.1.1.6", "hwSocAttackUserQinQIndex": "1.3.6.1.4.1.2011.5.25.165.1.7.1.1.7", "hwSocAttackMacAddr": "1.3.6.1.4.1.2011.5.25.165.1.7.1.1.8", "hwSocAttackIPAddr": "1.3.6.1.4.1.2011.5.25.165.1.7.1.1.9", "hwSocAttackIPv6Addr": "1.3.6.1.4.1.2011.5.25.165.1.7.1.1.10", "hwSocAttackVniIndex": "1.3.6.1.4.1.2011.5.25.165.1.7.1.1.11"]
]

// --- hwBaseSocAttackResumeTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.165.1.11.13
// Fields: hwSocAttackSeqNo, hwSocAttackPossib, hwSocAttackReason, hwSocAttackIfName, hwSocAttackSubIfName, hwSocAttackVlanIndex, hwSocAttackUserQinQIndex, hwSocAttackMacAddr, hwSocAttackIPAddr, hwSocAttackIPv6Addr, hwSocAttackVniIndex
// Description: This object indicates that the alarm is cleared when an attack event does not reoccur within half an hour.
trapMap["1.3.6.1.4.1.2011.5.25.165.1.11.13"] = [
    name: "hwBaseSocAttackResumeTrap",
    fields: ["hwSocAttackSeqNo", "hwSocAttackPossib", "hwSocAttackReason", "hwSocAttackIfName", "hwSocAttackSubIfName", "hwSocAttackVlanIndex", "hwSocAttackUserQinQIndex", "hwSocAttackMacAddr", "hwSocAttackIPAddr", "hwSocAttackIPv6Addr", "hwSocAttackVniIndex"],
    fieldOids: ["hwSocAttackSeqNo": "1.3.6.1.4.1.2011.5.25.165.1.7.1.1.1", "hwSocAttackPossib": "1.3.6.1.4.1.2011.5.25.165.1.7.1.1.2", "hwSocAttackReason": "1.3.6.1.4.1.2011.5.25.165.1.7.1.1.3", "hwSocAttackIfName": "1.3.6.1.4.1.2011.5.25.165.1.7.1.1.4", "hwSocAttackSubIfName": "1.3.6.1.4.1.2011.5.25.165.1.7.1.1.5", "hwSocAttackVlanIndex": "1.3.6.1.4.1.2011.5.25.165.1.7.1.1.6", "hwSocAttackUserQinQIndex": "1.3.6.1.4.1.2011.5.25.165.1.7.1.1.7", "hwSocAttackMacAddr": "1.3.6.1.4.1.2011.5.25.165.1.7.1.1.8", "hwSocAttackIPAddr": "1.3.6.1.4.1.2011.5.25.165.1.7.1.1.9", "hwSocAttackIPv6Addr": "1.3.6.1.4.1.2011.5.25.165.1.7.1.1.10", "hwSocAttackVniIndex": "1.3.6.1.4.1.2011.5.25.165.1.7.1.1.11"]
]

// --- hwBaseSecurityStormControlInterfaceResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.165.1.11.14
// Fields: hwBaseSecurityStormControlInterfaceChassisId, hwBaseSecurityStormControlInterfaceSlotId, hwBaseSecurityStormControlInterfaceName, hwBaseSecurityStormControlInterfaceVlanID
// Description: This object indicates that the alarm is cleared when an interface loop is removed.
trapMap["1.3.6.1.4.1.2011.5.25.165.1.11.14"] = [
    name: "hwBaseSecurityStormControlInterfaceResume",
    fields: ["hwBaseSecurityStormControlInterfaceChassisId", "hwBaseSecurityStormControlInterfaceSlotId", "hwBaseSecurityStormControlInterfaceName", "hwBaseSecurityStormControlInterfaceVlanID"],
    fieldOids: ["hwBaseSecurityStormControlInterfaceChassisId": "1.3.6.1.4.1.2011.5.25.165.1.13.1.1.1", "hwBaseSecurityStormControlInterfaceSlotId": "1.3.6.1.4.1.2011.5.25.165.1.13.1.1.2", "hwBaseSecurityStormControlInterfaceName": "1.3.6.1.4.1.2011.5.25.165.1.13.1.1.3", "hwBaseSecurityStormControlInterfaceVlanID": "1.3.6.1.4.1.2011.5.25.165.1.13.1.1.4"]
]

// --- hwBaseArpVlanCarTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.165.1.11.17
// Fields: hwBaseArpVlanCarLogIfName, hwBaseArpVlanCarPhyIfName, hwBaseArpVlanCarVlanId
// Description: This object indicates that the ARP VLAN CAR configuration takes effect, and the interface may experience a loop or an attack.
trapMap["1.3.6.1.4.1.2011.5.25.165.1.11.17"] = [
    name: "hwBaseArpVlanCarTrap",
    fields: ["hwBaseArpVlanCarLogIfName", "hwBaseArpVlanCarPhyIfName", "hwBaseArpVlanCarVlanId"],
    fieldOids: ["hwBaseArpVlanCarLogIfName": "1.3.6.1.4.1.2011.5.25.165.1.14.1.1.1", "hwBaseArpVlanCarPhyIfName": "1.3.6.1.4.1.2011.5.25.165.1.14.1.1.2", "hwBaseArpVlanCarVlanId": "1.3.6.1.4.1.2011.5.25.165.1.14.1.1.3"]
]

// --- hwBaseArpVlanCarResumeTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.165.1.11.18
// Fields: hwBaseArpVlanCarLogIfName, hwBaseArpVlanCarPhyIfName, hwBaseArpVlanCarVlanId
// Description: This object indicates that the ARP VLAN CAR configuration is cancelled.
trapMap["1.3.6.1.4.1.2011.5.25.165.1.11.18"] = [
    name: "hwBaseArpVlanCarResumeTrap",
    fields: ["hwBaseArpVlanCarLogIfName", "hwBaseArpVlanCarPhyIfName", "hwBaseArpVlanCarVlanId"],
    fieldOids: ["hwBaseArpVlanCarLogIfName": "1.3.6.1.4.1.2011.5.25.165.1.14.1.1.1", "hwBaseArpVlanCarPhyIfName": "1.3.6.1.4.1.2011.5.25.165.1.14.1.1.2", "hwBaseArpVlanCarVlanId": "1.3.6.1.4.1.2011.5.25.165.1.14.1.1.3"]
]

// --- hwBaseSecurityAntiAttackRateRising (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.165.1.11.19
// Fields: hwAntiAttackType, hwAntiAttackRateThreshold, hwAntiAttackCurrentRate
// Description: The rate of packets exceed the threshold of anti-attack alarm.
trapMap["1.3.6.1.4.1.2011.5.25.165.1.11.19"] = [
    name: "hwBaseSecurityAntiAttackRateRising",
    fields: ["hwAntiAttackType", "hwAntiAttackRateThreshold", "hwAntiAttackCurrentRate"],
    fieldOids: ["hwAntiAttackType": "1.3.6.1.4.1.2011.5.25.165.1.16.1.1.1", "hwAntiAttackRateThreshold": "1.3.6.1.4.1.2011.5.25.165.1.16.1.1.2", "hwAntiAttackCurrentRate": "1.3.6.1.4.1.2011.5.25.165.1.16.1.1.3"]
]

// --- hwBaseSecurityAntiAttackRateResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.165.1.11.20
// Fields: hwAntiAttackType, hwAntiAttackRateThreshold, hwAntiAttackCurrentRate
// Description: The alarm of anti-attack alarm is resumed.
trapMap["1.3.6.1.4.1.2011.5.25.165.1.11.20"] = [
    name: "hwBaseSecurityAntiAttackRateResume",
    fields: ["hwAntiAttackType", "hwAntiAttackRateThreshold", "hwAntiAttackCurrentRate"],
    fieldOids: ["hwAntiAttackType": "1.3.6.1.4.1.2011.5.25.165.1.16.1.1.1", "hwAntiAttackRateThreshold": "1.3.6.1.4.1.2011.5.25.165.1.16.1.1.2", "hwAntiAttackCurrentRate": "1.3.6.1.4.1.2011.5.25.165.1.16.1.1.3"]
]

// --- hwBaseArpVlanCarEnhanceTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.165.1.11.21
// Fields: hwBaseArpVlanCarEnhanceLogIfName, hwBaseArpVlanCarEnhancePhyIfName, hwBaseArpVlanCarEnhancePeVlanId, hwBaseArpVlanCarEnhanceCeVlanId, hwBaseArpVlanCarEnhanceSampleRate
// Description: This object indicates that the ARP VLAN CAR configuration takes effect, and the interface may experience a loop or an attack.
trapMap["1.3.6.1.4.1.2011.5.25.165.1.11.21"] = [
    name: "hwBaseArpVlanCarEnhanceTrap",
    fields: ["hwBaseArpVlanCarEnhanceLogIfName", "hwBaseArpVlanCarEnhancePhyIfName", "hwBaseArpVlanCarEnhancePeVlanId", "hwBaseArpVlanCarEnhanceCeVlanId", "hwBaseArpVlanCarEnhanceSampleRate"],
    fieldOids: ["hwBaseArpVlanCarEnhanceLogIfName": "1.3.6.1.4.1.2011.5.25.165.1.17.1.1.1", "hwBaseArpVlanCarEnhancePhyIfName": "1.3.6.1.4.1.2011.5.25.165.1.17.1.1.2", "hwBaseArpVlanCarEnhancePeVlanId": "1.3.6.1.4.1.2011.5.25.165.1.17.1.1.3", "hwBaseArpVlanCarEnhanceCeVlanId": "1.3.6.1.4.1.2011.5.25.165.1.17.1.1.4", "hwBaseArpVlanCarEnhanceSampleRate": "1.3.6.1.4.1.2011.5.25.165.1.17.1.1.5"]
]

// --- hwBaseArpVlanCarEnhanceResumeTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.165.1.11.22
// Fields: hwBaseArpVlanCarEnhanceLogIfName, hwBaseArpVlanCarEnhancePhyIfName, hwBaseArpVlanCarEnhancePeVlanId, hwBaseArpVlanCarEnhanceCeVlanId, hwBaseArpVlanCarEnhanceSampleRate
// Description: This object indicates that the ARP VLAN CAR configuration is cancelled.
trapMap["1.3.6.1.4.1.2011.5.25.165.1.11.22"] = [
    name: "hwBaseArpVlanCarEnhanceResumeTrap",
    fields: ["hwBaseArpVlanCarEnhanceLogIfName", "hwBaseArpVlanCarEnhancePhyIfName", "hwBaseArpVlanCarEnhancePeVlanId", "hwBaseArpVlanCarEnhanceCeVlanId", "hwBaseArpVlanCarEnhanceSampleRate"],
    fieldOids: ["hwBaseArpVlanCarEnhanceLogIfName": "1.3.6.1.4.1.2011.5.25.165.1.17.1.1.1", "hwBaseArpVlanCarEnhancePhyIfName": "1.3.6.1.4.1.2011.5.25.165.1.17.1.1.2", "hwBaseArpVlanCarEnhancePeVlanId": "1.3.6.1.4.1.2011.5.25.165.1.17.1.1.3", "hwBaseArpVlanCarEnhanceCeVlanId": "1.3.6.1.4.1.2011.5.25.165.1.17.1.1.4", "hwBaseArpVlanCarEnhanceSampleRate": "1.3.6.1.4.1.2011.5.25.165.1.17.1.1.5"]
]

// --- hwL3LoopDetectAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.165.1.11.23
// Fields: hwL3LoopDetectChassisID, hwL3LoopDetectSlotID, hwL3LoopDetectIPAddr
// Description: The alarm of l3 loop detect.
trapMap["1.3.6.1.4.1.2011.5.25.165.1.11.23"] = [
    name: "hwL3LoopDetectAlarm",
    fields: ["hwL3LoopDetectChassisID", "hwL3LoopDetectSlotID", "hwL3LoopDetectIPAddr"],
    fieldOids: ["hwL3LoopDetectChassisID": "1.3.6.1.4.1.2011.5.25.165.1.18.1.1.1", "hwL3LoopDetectSlotID": "1.3.6.1.4.1.2011.5.25.165.1.18.1.1.2", "hwL3LoopDetectIPAddr": "1.3.6.1.4.1.2011.5.25.165.1.18.1.1.3"]
]

// --- hwL3LoopDetectAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.165.1.11.24
// Fields: hwL3LoopDetectChassisID, hwL3LoopDetectSlotID, hwL3LoopDetectIPAddr
// Description: L3 loop detect alarm cleared.
trapMap["1.3.6.1.4.1.2011.5.25.165.1.11.24"] = [
    name: "hwL3LoopDetectAlarmResume",
    fields: ["hwL3LoopDetectChassisID", "hwL3LoopDetectSlotID", "hwL3LoopDetectIPAddr"],
    fieldOids: ["hwL3LoopDetectChassisID": "1.3.6.1.4.1.2011.5.25.165.1.18.1.1.1", "hwL3LoopDetectSlotID": "1.3.6.1.4.1.2011.5.25.165.1.18.1.1.2", "hwL3LoopDetectIPAddr": "1.3.6.1.4.1.2011.5.25.165.1.18.1.1.3"]
]

// --- hwBaseNdVlanCarTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.165.1.11.25
// Fields: hwBaseNdVlanCarNdType, hwBaseNdVlanCarLogIfName, hwBaseNdVlanCarPhyIfName, hwBaseNdVlanCarPeVlanId, hwBaseNdVlanCarCeVlanId, hwBaseNdVlanCarSampleRate
// Description: This object indicates that the ND VLAN CAR configuration takes effect, and the interface may experience an attack.
trapMap["1.3.6.1.4.1.2011.5.25.165.1.11.25"] = [
    name: "hwBaseNdVlanCarTrap",
    fields: ["hwBaseNdVlanCarNdType", "hwBaseNdVlanCarLogIfName", "hwBaseNdVlanCarPhyIfName", "hwBaseNdVlanCarPeVlanId", "hwBaseNdVlanCarCeVlanId", "hwBaseNdVlanCarSampleRate"],
    fieldOids: ["hwBaseNdVlanCarNdType": "1.3.6.1.4.1.2011.5.25.165.1.19.1.1.1", "hwBaseNdVlanCarLogIfName": "1.3.6.1.4.1.2011.5.25.165.1.19.1.1.2", "hwBaseNdVlanCarPhyIfName": "1.3.6.1.4.1.2011.5.25.165.1.19.1.1.3", "hwBaseNdVlanCarPeVlanId": "1.3.6.1.4.1.2011.5.25.165.1.19.1.1.4", "hwBaseNdVlanCarCeVlanId": "1.3.6.1.4.1.2011.5.25.165.1.19.1.1.5", "hwBaseNdVlanCarSampleRate": "1.3.6.1.4.1.2011.5.25.165.1.19.1.1.6"]
]

// --- hwBaseNdVlanCarResumeTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.165.1.11.26
// Fields: hwBaseNdVlanCarNdType, hwBaseNdVlanCarLogIfName, hwBaseNdVlanCarPhyIfName, hwBaseNdVlanCarPeVlanId, hwBaseNdVlanCarCeVlanId, hwBaseNdVlanCarSampleRate
// Description: This object indicates that the ND VLAN CAR configuration is cancelled.
trapMap["1.3.6.1.4.1.2011.5.25.165.1.11.26"] = [
    name: "hwBaseNdVlanCarResumeTrap",
    fields: ["hwBaseNdVlanCarNdType", "hwBaseNdVlanCarLogIfName", "hwBaseNdVlanCarPhyIfName", "hwBaseNdVlanCarPeVlanId", "hwBaseNdVlanCarCeVlanId", "hwBaseNdVlanCarSampleRate"],
    fieldOids: ["hwBaseNdVlanCarNdType": "1.3.6.1.4.1.2011.5.25.165.1.19.1.1.1", "hwBaseNdVlanCarLogIfName": "1.3.6.1.4.1.2011.5.25.165.1.19.1.1.2", "hwBaseNdVlanCarPhyIfName": "1.3.6.1.4.1.2011.5.25.165.1.19.1.1.3", "hwBaseNdVlanCarPeVlanId": "1.3.6.1.4.1.2011.5.25.165.1.19.1.1.4", "hwBaseNdVlanCarCeVlanId": "1.3.6.1.4.1.2011.5.25.165.1.19.1.1.5", "hwBaseNdVlanCarSampleRate": "1.3.6.1.4.1.2011.5.25.165.1.19.1.1.6"]
]

// --- hwL3LoopDetectAlarmVpn (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.165.1.11.27
// Fields: hwL3LoopDetectVpnChassisID, hwL3LoopDetectVpnSlotID, hwL3LoopDetectVpnIPAddr, hwL3LoopDetectVpnName
// Description: The alarm of l3 loop detect.
trapMap["1.3.6.1.4.1.2011.5.25.165.1.11.27"] = [
    name: "hwL3LoopDetectAlarmVpn",
    fields: ["hwL3LoopDetectVpnChassisID", "hwL3LoopDetectVpnSlotID", "hwL3LoopDetectVpnIPAddr", "hwL3LoopDetectVpnName"],
    fieldOids: ["hwL3LoopDetectVpnChassisID": "1.3.6.1.4.1.2011.5.25.165.1.20.1.1.1", "hwL3LoopDetectVpnSlotID": "1.3.6.1.4.1.2011.5.25.165.1.20.1.1.2", "hwL3LoopDetectVpnIPAddr": "1.3.6.1.4.1.2011.5.25.165.1.20.1.1.3", "hwL3LoopDetectVpnName": "1.3.6.1.4.1.2011.5.25.165.1.20.1.1.4"]
]

// --- hwL3LoopDetectAlarmVpnResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.165.1.11.28
// Fields: hwL3LoopDetectVpnChassisID, hwL3LoopDetectVpnSlotID, hwL3LoopDetectVpnIPAddr, hwL3LoopDetectVpnName
// Description: L3 loop detect alarm cleared.
trapMap["1.3.6.1.4.1.2011.5.25.165.1.11.28"] = [
    name: "hwL3LoopDetectAlarmVpnResume",
    fields: ["hwL3LoopDetectVpnChassisID", "hwL3LoopDetectVpnSlotID", "hwL3LoopDetectVpnIPAddr", "hwL3LoopDetectVpnName"],
    fieldOids: ["hwL3LoopDetectVpnChassisID": "1.3.6.1.4.1.2011.5.25.165.1.20.1.1.1", "hwL3LoopDetectVpnSlotID": "1.3.6.1.4.1.2011.5.25.165.1.20.1.1.2", "hwL3LoopDetectVpnIPAddr": "1.3.6.1.4.1.2011.5.25.165.1.20.1.1.3", "hwL3LoopDetectVpnName": "1.3.6.1.4.1.2011.5.25.165.1.20.1.1.4"]
]

// --- hwStrackUserInfo (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.165.2.2.1.1
// Fields: hwStrackPacketIfName, hwStrackSourceMac, hwStrackPacketCVlan, hwStrackPacketPVlan, hwStrackEndTime, hwStrackTotalPacket
// Description: The user mac data of strack.
trapMap["1.3.6.1.4.1.2011.5.25.165.2.2.1.1"] = [
    name: "hwStrackUserInfo",
    fields: ["hwStrackPacketIfName", "hwStrackSourceMac", "hwStrackPacketCVlan", "hwStrackPacketPVlan", "hwStrackEndTime", "hwStrackTotalPacket"],
    fieldOids: ["hwStrackPacketIfName": "1.3.6.1.4.1.2011.5.25.165.2.1.1.6", "hwStrackSourceMac": "1.3.6.1.4.1.2011.5.25.165.2.1.1.3", "hwStrackPacketCVlan": "1.3.6.1.4.1.2011.5.25.165.2.1.1.5", "hwStrackPacketPVlan": "1.3.6.1.4.1.2011.5.25.165.2.1.1.4", "hwStrackEndTime": "1.3.6.1.4.1.2011.5.25.165.2.1.1.2", "hwStrackTotalPacket": "1.3.6.1.4.1.2011.5.25.165.2.1.1.1"]
]

// --- hwStrackIfVlanInfo (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.165.2.2.1.2
// Fields: hwStrackPacketIfName, hwStrackPacketCVlan, hwStrackPacketPVlan, hwStrackEndTime, hwStrackTotalPacket
// Description: The user port and vlan data of strack.
trapMap["1.3.6.1.4.1.2011.5.25.165.2.2.1.2"] = [
    name: "hwStrackIfVlanInfo",
    fields: ["hwStrackPacketIfName", "hwStrackPacketCVlan", "hwStrackPacketPVlan", "hwStrackEndTime", "hwStrackTotalPacket"],
    fieldOids: ["hwStrackPacketIfName": "1.3.6.1.4.1.2011.5.25.165.2.1.1.6", "hwStrackPacketCVlan": "1.3.6.1.4.1.2011.5.25.165.2.1.1.5", "hwStrackPacketPVlan": "1.3.6.1.4.1.2011.5.25.165.2.1.1.4", "hwStrackEndTime": "1.3.6.1.4.1.2011.5.25.165.2.1.1.2", "hwStrackTotalPacket": "1.3.6.1.4.1.2011.5.25.165.2.1.1.1"]
]

// --- hwStrackDenyPacket (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.165.2.2.1.3
// Fields: hwStrackPacketIfName, hwStrackSourceMac, hwStrackSourceIp, hwStrackPacketCVlan, hwStrackPacketPVlan
// Description: The information of the packets discarded by strack.
trapMap["1.3.6.1.4.1.2011.5.25.165.2.2.1.3"] = [
    name: "hwStrackDenyPacket",
    fields: ["hwStrackPacketIfName", "hwStrackSourceMac", "hwStrackSourceIp", "hwStrackPacketCVlan", "hwStrackPacketPVlan"],
    fieldOids: ["hwStrackPacketIfName": "1.3.6.1.4.1.2011.5.25.165.2.1.1.6", "hwStrackSourceMac": "1.3.6.1.4.1.2011.5.25.165.2.1.1.3", "hwStrackSourceIp": "1.3.6.1.4.1.2011.5.25.165.2.1.1.7", "hwStrackPacketCVlan": "1.3.6.1.4.1.2011.5.25.165.2.1.1.5", "hwStrackPacketPVlan": "1.3.6.1.4.1.2011.5.25.165.2.1.1.4"]
]

// --- hwStrackErrorDown (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.165.2.2.1.4
// Fields: hwStrackPacketIfName
// Description: The interface that is shutdown by strack.
trapMap["1.3.6.1.4.1.2011.5.25.165.2.2.1.4"] = [
    name: "hwStrackErrorDown",
    fields: ["hwStrackPacketIfName"],
    fieldOids: ["hwStrackPacketIfName": "1.3.6.1.4.1.2011.5.25.165.2.1.1.6"]
]

// --- hwStrackIpInfo (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.165.2.2.1.5
// Fields: hwStrackPacketIfName, hwStrackSourceIp, hwStrackPacketCVlan, hwStrackPacketPVlan, hwStrackEndTime, hwStrackTotalPacket
// Description: The user ip data of strack.
trapMap["1.3.6.1.4.1.2011.5.25.165.2.2.1.5"] = [
    name: "hwStrackIpInfo",
    fields: ["hwStrackPacketIfName", "hwStrackSourceIp", "hwStrackPacketCVlan", "hwStrackPacketPVlan", "hwStrackEndTime", "hwStrackTotalPacket"],
    fieldOids: ["hwStrackPacketIfName": "1.3.6.1.4.1.2011.5.25.165.2.1.1.6", "hwStrackSourceIp": "1.3.6.1.4.1.2011.5.25.165.2.1.1.7", "hwStrackPacketCVlan": "1.3.6.1.4.1.2011.5.25.165.2.1.1.5", "hwStrackPacketPVlan": "1.3.6.1.4.1.2011.5.25.165.2.1.1.4", "hwStrackEndTime": "1.3.6.1.4.1.2011.5.25.165.2.1.1.2", "hwStrackTotalPacket": "1.3.6.1.4.1.2011.5.25.165.2.1.1.1"]
]

// --- hwStrackUserAbnormal (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.165.2.2.1.6
// Fields: hwStrackSlotid, hwStrackSourceIp, hwStrackPacketType, hwStrackNormalAverage, hwStrackActualRate
// Description: Description.
trapMap["1.3.6.1.4.1.2011.5.25.165.2.2.1.6"] = [
    name: "hwStrackUserAbnormal",
    fields: ["hwStrackSlotid", "hwStrackSourceIp", "hwStrackPacketType", "hwStrackNormalAverage", "hwStrackActualRate"],
    fieldOids: ["hwStrackSlotid": "1.3.6.1.4.1.2011.5.25.165.2.1.1.8", "hwStrackSourceIp": "1.3.6.1.4.1.2011.5.25.165.2.1.1.7", "hwStrackPacketType": "1.3.6.1.4.1.2011.5.25.165.2.1.1.11", "hwStrackNormalAverage": "1.3.6.1.4.1.2011.5.25.165.2.1.1.9", "hwStrackActualRate": "1.3.6.1.4.1.2011.5.25.165.2.1.1.10"]
]

// --- hwArpsGatewayConflict (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.165.2.2.2.1
// Fields: hwArpsSourceInterface, hwArpsSourceIp, hwArpsSourceMac, hwArpsPVlan, hwArpsCVlan
// Description: The gateway conflict alarm is resumed.
trapMap["1.3.6.1.4.1.2011.5.25.165.2.2.2.1"] = [
    name: "hwArpsGatewayConflict",
    fields: ["hwArpsSourceInterface", "hwArpsSourceIp", "hwArpsSourceMac", "hwArpsPVlan", "hwArpsCVlan"],
    fieldOids: ["hwArpsSourceInterface": "1.3.6.1.4.1.2011.5.25.165.2.1.2.1", "hwArpsSourceIp": "1.3.6.1.4.1.2011.5.25.165.2.1.2.2", "hwArpsSourceMac": "1.3.6.1.4.1.2011.5.25.165.2.1.2.3", "hwArpsPVlan": "1.3.6.1.4.1.2011.5.25.165.2.1.2.4", "hwArpsCVlan": "1.3.6.1.4.1.2011.5.25.165.2.1.2.5"]
]

// --- hwArpsEntryCheck (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.165.2.2.2.2
// Fields: hwArpsSourceInterface, hwArpsSourceIp, hwArpsSourceMac, hwArpsPVlan, hwArpsCVlan
// Description: The arp talbe chekc alarm is resumed.
trapMap["1.3.6.1.4.1.2011.5.25.165.2.2.2.2"] = [
    name: "hwArpsEntryCheck",
    fields: ["hwArpsSourceInterface", "hwArpsSourceIp", "hwArpsSourceMac", "hwArpsPVlan", "hwArpsCVlan"],
    fieldOids: ["hwArpsSourceInterface": "1.3.6.1.4.1.2011.5.25.165.2.1.2.1", "hwArpsSourceIp": "1.3.6.1.4.1.2011.5.25.165.2.1.2.2", "hwArpsSourceMac": "1.3.6.1.4.1.2011.5.25.165.2.1.2.3", "hwArpsPVlan": "1.3.6.1.4.1.2011.5.25.165.2.1.2.4", "hwArpsCVlan": "1.3.6.1.4.1.2011.5.25.165.2.1.2.5"]
]

// --- hwArpsPacketCheck (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.165.2.2.2.3
// Fields: hwArpsSourceInterface, hwArpsSourceIp, hwArpsSourceMac, hwArpsPVlan, hwArpsCVlan
// Description: The arp packet check alarm is resumed.
trapMap["1.3.6.1.4.1.2011.5.25.165.2.2.2.3"] = [
    name: "hwArpsPacketCheck",
    fields: ["hwArpsSourceInterface", "hwArpsSourceIp", "hwArpsSourceMac", "hwArpsPVlan", "hwArpsCVlan"],
    fieldOids: ["hwArpsSourceInterface": "1.3.6.1.4.1.2011.5.25.165.2.1.2.1", "hwArpsSourceIp": "1.3.6.1.4.1.2011.5.25.165.2.1.2.2", "hwArpsSourceMac": "1.3.6.1.4.1.2011.5.25.165.2.1.2.3", "hwArpsPVlan": "1.3.6.1.4.1.2011.5.25.165.2.1.2.4", "hwArpsCVlan": "1.3.6.1.4.1.2011.5.25.165.2.1.2.5"]
]

// --- hwArpsDaiDropALarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.165.2.2.2.4
// Fields: hwArpsPacketDropNum, hwArpsAlarmThreshold, hwArpsSourceInterface
// Description: The DAI alarm is resumed.
trapMap["1.3.6.1.4.1.2011.5.25.165.2.2.2.4"] = [
    name: "hwArpsDaiDropALarm",
    fields: ["hwArpsPacketDropNum", "hwArpsAlarmThreshold", "hwArpsSourceInterface"],
    fieldOids: ["hwArpsPacketDropNum": "1.3.6.1.4.1.2011.5.25.165.2.1.2.6", "hwArpsAlarmThreshold": "1.3.6.1.4.1.2011.5.25.165.2.1.2.7", "hwArpsSourceInterface": "1.3.6.1.4.1.2011.5.25.165.2.1.2.1"]
]

// --- hwArpGlobleSpeedLimitALarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.165.2.2.2.5
// Fields: hwArpsAlarmThreshold
// Description: The arp rate limit alarm is resumed.
trapMap["1.3.6.1.4.1.2011.5.25.165.2.2.2.5"] = [
    name: "hwArpGlobleSpeedLimitALarm",
    fields: ["hwArpsAlarmThreshold"],
    fieldOids: ["hwArpsAlarmThreshold": "1.3.6.1.4.1.2011.5.25.165.2.1.2.7"]
]

// --- hwArpIfSpeedLimitALarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.165.2.2.2.6
// Fields: hwArpsAlarmThreshold, hwArpsSourceInterface
// Description: TThe arp rate limit alarm is resumed.
trapMap["1.3.6.1.4.1.2011.5.25.165.2.2.2.6"] = [
    name: "hwArpIfSpeedLimitALarm",
    fields: ["hwArpsAlarmThreshold", "hwArpsSourceInterface"],
    fieldOids: ["hwArpsAlarmThreshold": "1.3.6.1.4.1.2011.5.25.165.2.1.2.7", "hwArpsSourceInterface": "1.3.6.1.4.1.2011.5.25.165.2.1.2.1"]
]

// --- hwArpVlanSpeedLimitALarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.165.2.2.2.7
// Fields: hwArpsAlarmThreshold, hwArpsPVlan
// Description: The arp rate limit alarm is resumed.
trapMap["1.3.6.1.4.1.2011.5.25.165.2.2.2.7"] = [
    name: "hwArpVlanSpeedLimitALarm",
    fields: ["hwArpsAlarmThreshold", "hwArpsPVlan"],
    fieldOids: ["hwArpsAlarmThreshold": "1.3.6.1.4.1.2011.5.25.165.2.1.2.7", "hwArpsPVlan": "1.3.6.1.4.1.2011.5.25.165.2.1.2.4"]
]

// --- hwArpMissGlobleSpeedLimitALarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.165.2.2.2.8
// Fields: hwArpsAlarmThreshold
// Description: The arp miss rate limit alarm is resumed.
trapMap["1.3.6.1.4.1.2011.5.25.165.2.2.2.8"] = [
    name: "hwArpMissGlobleSpeedLimitALarm",
    fields: ["hwArpsAlarmThreshold"],
    fieldOids: ["hwArpsAlarmThreshold": "1.3.6.1.4.1.2011.5.25.165.2.1.2.7"]
]

// --- hwArpMissIfSpeedLimitALarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.165.2.2.2.9
// Fields: hwArpsAlarmThreshold, hwArpsSourceInterface
// Description: The arp miss rate limit alarm is resumed.
trapMap["1.3.6.1.4.1.2011.5.25.165.2.2.2.9"] = [
    name: "hwArpMissIfSpeedLimitALarm",
    fields: ["hwArpsAlarmThreshold", "hwArpsSourceInterface"],
    fieldOids: ["hwArpsAlarmThreshold": "1.3.6.1.4.1.2011.5.25.165.2.1.2.7", "hwArpsSourceInterface": "1.3.6.1.4.1.2011.5.25.165.2.1.2.1"]
]

// --- hwArpMissVlanSpeedLimitALarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.165.2.2.2.10
// Fields: hwArpsAlarmThreshold, hwArpsPVlan
// Description: The arp miss rate limit alarm is resumed.
trapMap["1.3.6.1.4.1.2011.5.25.165.2.2.2.10"] = [
    name: "hwArpMissVlanSpeedLimitALarm",
    fields: ["hwArpsAlarmThreshold", "hwArpsPVlan"],
    fieldOids: ["hwArpsAlarmThreshold": "1.3.6.1.4.1.2011.5.25.165.2.1.2.7", "hwArpsPVlan": "1.3.6.1.4.1.2011.5.25.165.2.1.2.4"]
]

// --- hwArpSourceIpSpeedLimitALarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.165.2.2.2.11
// Fields: hwArpsSourceIp, hwArpsAlarmThreshold
// Description: The alarm of arp speed limit.
trapMap["1.3.6.1.4.1.2011.5.25.165.2.2.2.11"] = [
    name: "hwArpSourceIpSpeedLimitALarm",
    fields: ["hwArpsSourceIp", "hwArpsAlarmThreshold"],
    fieldOids: ["hwArpsSourceIp": "1.3.6.1.4.1.2011.5.25.165.2.1.2.2", "hwArpsAlarmThreshold": "1.3.6.1.4.1.2011.5.25.165.2.1.2.7"]
]

// --- hwArpMissSourceIpSpeedLimitALarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.165.2.2.2.12
// Fields: hwArpsSourceIp, hwArpsAlarmThreshold
// Description: The alarm of arp miss speed limit.
trapMap["1.3.6.1.4.1.2011.5.25.165.2.2.2.12"] = [
    name: "hwArpMissSourceIpSpeedLimitALarm",
    fields: ["hwArpsSourceIp", "hwArpsAlarmThreshold"],
    fieldOids: ["hwArpsSourceIp": "1.3.6.1.4.1.2011.5.25.165.2.1.2.2", "hwArpsAlarmThreshold": "1.3.6.1.4.1.2011.5.25.165.2.1.2.7"]
]

// --- hwArpIfRateLimitBlockALarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.165.2.2.2.13
// Fields: hwArpsSourceInterface, hwArpsBlockTime
// Description: The arp rate limit block alarm is resumed.
trapMap["1.3.6.1.4.1.2011.5.25.165.2.2.2.13"] = [
    name: "hwArpIfRateLimitBlockALarm",
    fields: ["hwArpsSourceInterface", "hwArpsBlockTime"],
    fieldOids: ["hwArpsSourceInterface": "1.3.6.1.4.1.2011.5.25.165.2.1.2.1", "hwArpsBlockTime": "1.3.6.1.4.1.2011.5.25.165.2.1.2.8"]
]

// --- hwArpsLearnStrictCheck (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.165.2.2.2.14
// Fields: hwArpsSourceInterface, hwArpsSourceIp, hwArpsSourceMac, hwArpsPVlan
// Description: The alarm of arp learn strict check.
trapMap["1.3.6.1.4.1.2011.5.25.165.2.2.2.14"] = [
    name: "hwArpsLearnStrictCheck",
    fields: ["hwArpsSourceInterface", "hwArpsSourceIp", "hwArpsSourceMac", "hwArpsPVlan"],
    fieldOids: ["hwArpsSourceInterface": "1.3.6.1.4.1.2011.5.25.165.2.1.2.1", "hwArpsSourceIp": "1.3.6.1.4.1.2011.5.25.165.2.1.2.2", "hwArpsSourceMac": "1.3.6.1.4.1.2011.5.25.165.2.1.2.3", "hwArpsPVlan": "1.3.6.1.4.1.2011.5.25.165.2.1.2.4"]
]

// --- hwArpSourceMacSpeedLimitALarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.165.2.2.2.15
// Fields: hwArpsSourceMac, hwArpsAlarmThreshold
// Description: The alarm of arp speed limit.
trapMap["1.3.6.1.4.1.2011.5.25.165.2.2.2.15"] = [
    name: "hwArpSourceMacSpeedLimitALarm",
    fields: ["hwArpsSourceMac", "hwArpsAlarmThreshold"],
    fieldOids: ["hwArpsSourceMac": "1.3.6.1.4.1.2011.5.25.165.2.1.2.3", "hwArpsAlarmThreshold": "1.3.6.1.4.1.2011.5.25.165.2.1.2.7"]
]

// --- hwArpsDaiBDDropALarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.165.2.2.2.16
// Fields: hwArpsPacketDropNum, hwArpsAlarmThreshold, hwArpsBD, hwArpsPktInfo
// Description: The alarm of BD Dai.
trapMap["1.3.6.1.4.1.2011.5.25.165.2.2.2.16"] = [
    name: "hwArpsDaiBDDropALarm",
    fields: ["hwArpsPacketDropNum", "hwArpsAlarmThreshold", "hwArpsBD", "hwArpsPktInfo"],
    fieldOids: ["hwArpsPacketDropNum": "1.3.6.1.4.1.2011.5.25.165.2.1.2.6", "hwArpsAlarmThreshold": "1.3.6.1.4.1.2011.5.25.165.2.1.2.7", "hwArpsBD": "1.3.6.1.4.1.2011.5.25.165.2.1.2.9", "hwArpsPktInfo": "1.3.6.1.4.1.2011.5.25.165.2.1.2.10"]
]

// --- hwArpsDaiVlanDropALarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.165.2.2.2.17
// Fields: hwArpsPacketDropNum, hwArpsAlarmThreshold, hwArpsPVlan, hwArpsPktInfo
// Description: The alarm of VLAN Dai.
trapMap["1.3.6.1.4.1.2011.5.25.165.2.2.2.17"] = [
    name: "hwArpsDaiVlanDropALarm",
    fields: ["hwArpsPacketDropNum", "hwArpsAlarmThreshold", "hwArpsPVlan", "hwArpsPktInfo"],
    fieldOids: ["hwArpsPacketDropNum": "1.3.6.1.4.1.2011.5.25.165.2.1.2.6", "hwArpsAlarmThreshold": "1.3.6.1.4.1.2011.5.25.165.2.1.2.7", "hwArpsPVlan": "1.3.6.1.4.1.2011.5.25.165.2.1.2.4", "hwArpsPktInfo": "1.3.6.1.4.1.2011.5.25.165.2.1.2.10"]
]

// --- hwArpsVbdifGatewayConflict (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.165.2.2.2.18
// Fields: hwArpsSourceInterface, hwArpsSourceIp, hwArpsSourceMac, hwArpsBD
// Description: VBDIF gateway conflict.
trapMap["1.3.6.1.4.1.2011.5.25.165.2.2.2.18"] = [
    name: "hwArpsVbdifGatewayConflict",
    fields: ["hwArpsSourceInterface", "hwArpsSourceIp", "hwArpsSourceMac", "hwArpsBD"],
    fieldOids: ["hwArpsSourceInterface": "1.3.6.1.4.1.2011.5.25.165.2.1.2.1", "hwArpsSourceIp": "1.3.6.1.4.1.2011.5.25.165.2.1.2.2", "hwArpsSourceMac": "1.3.6.1.4.1.2011.5.25.165.2.1.2.3", "hwArpsBD": "1.3.6.1.4.1.2011.5.25.165.2.1.2.9"]
]

// --- hwIpsgDropALarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.165.2.2.3.1
// Fields: hwIpsgPacketDropNum, hwIpsgAlarmThreshold, hwIpsgSourceInterface
// Description: The alarm of ipsg.
trapMap["1.3.6.1.4.1.2011.5.25.165.2.2.3.1"] = [
    name: "hwIpsgDropALarm",
    fields: ["hwIpsgPacketDropNum", "hwIpsgAlarmThreshold", "hwIpsgSourceInterface"],
    fieldOids: ["hwIpsgPacketDropNum": "1.3.6.1.4.1.2011.5.25.165.2.1.3.1", "hwIpsgAlarmThreshold": "1.3.6.1.4.1.2011.5.25.165.2.1.3.2", "hwIpsgSourceInterface": "1.3.6.1.4.1.2011.5.25.165.2.1.3.3"]
]

// --- hwIpsgVlanDropALarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.165.2.2.3.2
// Fields: hwIpsgPacketDropNum, hwIpsgAlarmThreshold, hwIpsgVlan, hwIpsgPktInfo
// Description: The alarm of vlan ipsg.
trapMap["1.3.6.1.4.1.2011.5.25.165.2.2.3.2"] = [
    name: "hwIpsgVlanDropALarm",
    fields: ["hwIpsgPacketDropNum", "hwIpsgAlarmThreshold", "hwIpsgVlan", "hwIpsgPktInfo"],
    fieldOids: ["hwIpsgPacketDropNum": "1.3.6.1.4.1.2011.5.25.165.2.1.3.1", "hwIpsgAlarmThreshold": "1.3.6.1.4.1.2011.5.25.165.2.1.3.2", "hwIpsgVlan": "1.3.6.1.4.1.2011.5.25.165.2.1.3.4", "hwIpsgPktInfo": "1.3.6.1.4.1.2011.5.25.165.2.1.3.5"]
]

// --- hwIpsgv4ResourceALarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.165.2.2.3.3
// Fields: hwIpsgPercent, hwIpsgSlot
// Description: The alarm of ipsgv4 resource full.
trapMap["1.3.6.1.4.1.2011.5.25.165.2.2.3.3"] = [
    name: "hwIpsgv4ResourceALarm",
    fields: ["hwIpsgPercent", "hwIpsgSlot"],
    fieldOids: ["hwIpsgPercent": "1.3.6.1.4.1.2011.5.25.165.2.1.3.6", "hwIpsgSlot": "1.3.6.1.4.1.2011.5.25.165.2.1.3.7"]
]

// --- hwIpsgv4ResourceResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.165.2.2.3.4
// Fields: hwIpsgPercent, hwIpsgSlot
// Description: The alarm of ipsgv4 resource full resume.
trapMap["1.3.6.1.4.1.2011.5.25.165.2.2.3.4"] = [
    name: "hwIpsgv4ResourceResume",
    fields: ["hwIpsgPercent", "hwIpsgSlot"],
    fieldOids: ["hwIpsgPercent": "1.3.6.1.4.1.2011.5.25.165.2.1.3.6", "hwIpsgSlot": "1.3.6.1.4.1.2011.5.25.165.2.1.3.7"]
]

// --- hwIpsgv6ResourceALarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.165.2.2.3.5
// Fields: hwIpsgPercent, hwIpsgSlot
// Description: The alarm of ipsgv6 resource full.
trapMap["1.3.6.1.4.1.2011.5.25.165.2.2.3.5"] = [
    name: "hwIpsgv6ResourceALarm",
    fields: ["hwIpsgPercent", "hwIpsgSlot"],
    fieldOids: ["hwIpsgPercent": "1.3.6.1.4.1.2011.5.25.165.2.1.3.6", "hwIpsgSlot": "1.3.6.1.4.1.2011.5.25.165.2.1.3.7"]
]

// --- hwIpsgv6ResourceResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.165.2.2.3.6
// Fields: hwIpsgPercent, hwIpsgSlot
// Description: The alarm of ipsgv6 resource full resume.
trapMap["1.3.6.1.4.1.2011.5.25.165.2.2.3.6"] = [
    name: "hwIpsgv6ResourceResume",
    fields: ["hwIpsgPercent", "hwIpsgSlot"],
    fieldOids: ["hwIpsgPercent": "1.3.6.1.4.1.2011.5.25.165.2.1.3.6", "hwIpsgSlot": "1.3.6.1.4.1.2011.5.25.165.2.1.3.7"]
]

// --- hwIcmpGlobleDropALarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.165.2.2.4.1
// Fields: hwIcmpAlarmThreshold
// Description: The icmp rate limit alarm is resumed.
trapMap["1.3.6.1.4.1.2011.5.25.165.2.2.4.1"] = [
    name: "hwIcmpGlobleDropALarm",
    fields: ["hwIcmpAlarmThreshold"],
    fieldOids: ["hwIcmpAlarmThreshold": "1.3.6.1.4.1.2011.5.25.165.2.1.4.2"]
]

// --- hwIcmpIfDropALarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.165.2.2.4.2
// Fields: hwIcmpAlarmThreshold, hwIcmpSourceInterface
// Description: The icmp rate limit alarm is resumed.
trapMap["1.3.6.1.4.1.2011.5.25.165.2.2.4.2"] = [
    name: "hwIcmpIfDropALarm",
    fields: ["hwIcmpAlarmThreshold", "hwIcmpSourceInterface"],
    fieldOids: ["hwIcmpAlarmThreshold": "1.3.6.1.4.1.2011.5.25.165.2.1.4.2", "hwIcmpSourceInterface": "1.3.6.1.4.1.2011.5.25.165.2.1.4.3"]
]

// --- hwDapMibPortChange (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.165.2.2.5.1
// Fields: hwDapPortChange
// Description: The dap port is changed.
trapMap["1.3.6.1.4.1.2011.5.25.165.2.2.5.1"] = [
    name: "hwDapMibPortChange",
    fields: ["hwDapPortChange"],
    fieldOids: ["hwDapPortChange": "1.3.6.1.4.1.2011.5.25.165.2.1.5.1"]
]

// --- hwDapMibAuthRequest (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.165.2.2.5.2
// Fields: hwDapDeviceIP
// Description: New device request authentication.
trapMap["1.3.6.1.4.1.2011.5.25.165.2.2.5.2"] = [
    name: "hwDapMibAuthRequest",
    fields: ["hwDapDeviceIP"],
    fieldOids: ["hwDapDeviceIP": "1.3.6.1.4.1.2011.5.25.165.2.1.5.2"]
]

// --- hwCfgApTrapFailAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.165.2.2.6.1
// Fields: hwCfgApUserName, hwCfgApIPAddress, hwCfgApApID, hwCfgApOperation, hwCfgApReason
// Description: The operation failed to config access point.
trapMap["1.3.6.1.4.1.2011.5.25.165.2.2.6.1"] = [
    name: "hwCfgApTrapFailAlarm",
    fields: ["hwCfgApUserName", "hwCfgApIPAddress", "hwCfgApApID", "hwCfgApOperation", "hwCfgApReason"],
    fieldOids: ["hwCfgApUserName": "1.3.6.1.4.1.2011.5.25.165.2.1.6.1", "hwCfgApIPAddress": "1.3.6.1.4.1.2011.5.25.165.2.1.6.2", "hwCfgApApID": "1.3.6.1.4.1.2011.5.25.165.2.1.6.3", "hwCfgApOperation": "1.3.6.1.4.1.2011.5.25.165.2.1.6.4", "hwCfgApReason": "1.3.6.1.4.1.2011.5.25.165.2.1.6.5"]
]

// --- hwCpcarDropPacketAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.165.2.2.7.1
// Fields: hwCpcarDropPacketSlotStr, hwCpcarDropPacketProtocol, hwCpcarDropPacketCir, hwCpcarDropPacketCbs, hwCpcarDropPacketNum
// Description: The alarm of cpcar drop packets.
trapMap["1.3.6.1.4.1.2011.5.25.165.2.2.7.1"] = [
    name: "hwCpcarDropPacketAlarm",
    fields: ["hwCpcarDropPacketSlotStr", "hwCpcarDropPacketProtocol", "hwCpcarDropPacketCir", "hwCpcarDropPacketCbs", "hwCpcarDropPacketNum"],
    fieldOids: ["hwCpcarDropPacketSlotStr": "1.3.6.1.4.1.2011.5.25.165.2.1.7.1", "hwCpcarDropPacketProtocol": "1.3.6.1.4.1.2011.5.25.165.2.1.7.2", "hwCpcarDropPacketCir": "1.3.6.1.4.1.2011.5.25.165.2.1.7.3", "hwCpcarDropPacketCbs": "1.3.6.1.4.1.2011.5.25.165.2.1.7.4", "hwCpcarDropPacketNum": "1.3.6.1.4.1.2011.5.25.165.2.1.7.5"]
]

// --- hwCpcarDropPacketAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.165.2.2.7.2
// Fields: hwCpcarDropPacketSlotStr, hwCpcarDropPacketProtocol, hwCpcarDropPacketCir, hwCpcarDropPacketCbs, hwCpcarDropPacketNum
// Description: The resume alarm of cpcar drop packets.
trapMap["1.3.6.1.4.1.2011.5.25.165.2.2.7.2"] = [
    name: "hwCpcarDropPacketAlarmResume",
    fields: ["hwCpcarDropPacketSlotStr", "hwCpcarDropPacketProtocol", "hwCpcarDropPacketCir", "hwCpcarDropPacketCbs", "hwCpcarDropPacketNum"],
    fieldOids: ["hwCpcarDropPacketSlotStr": "1.3.6.1.4.1.2011.5.25.165.2.1.7.1", "hwCpcarDropPacketProtocol": "1.3.6.1.4.1.2011.5.25.165.2.1.7.2", "hwCpcarDropPacketCir": "1.3.6.1.4.1.2011.5.25.165.2.1.7.3", "hwCpcarDropPacketCbs": "1.3.6.1.4.1.2011.5.25.165.2.1.7.4", "hwCpcarDropPacketNum": "1.3.6.1.4.1.2011.5.25.165.2.1.7.5"]
]

// --- hwCpcarAutoPortDefendAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.165.2.2.7.3
// Fields: hwCpcarAutoDefendSlotStr, hwCpcarAutoDefendProtocol, hwCpcarAutoDefendIfName, hwCpcarAutoDefendReasonDescription
// Description: The alarm of cpcar auto-port-defend.
trapMap["1.3.6.1.4.1.2011.5.25.165.2.2.7.3"] = [
    name: "hwCpcarAutoPortDefendAlarm",
    fields: ["hwCpcarAutoDefendSlotStr", "hwCpcarAutoDefendProtocol", "hwCpcarAutoDefendIfName", "hwCpcarAutoDefendReasonDescription"],
    fieldOids: ["hwCpcarAutoDefendSlotStr": "1.3.6.1.4.1.2011.5.25.165.2.1.7.7", "hwCpcarAutoDefendProtocol": "1.3.6.1.4.1.2011.5.25.165.2.1.7.8", "hwCpcarAutoDefendIfName": "1.3.6.1.4.1.2011.5.25.165.2.1.7.6", "hwCpcarAutoDefendReasonDescription": "1.3.6.1.4.1.2011.5.25.165.2.1.7.9"]
]

// --- hwCpcarAutoPortDefendAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.165.2.2.7.4
// Fields: hwCpcarAutoDefendSlotStr, hwCpcarAutoDefendProtocol, hwCpcarAutoDefendIfName, hwCpcarAutoDefendReasonDescription
// Description: The resume alarm of cpcar auto-port-defend.
trapMap["1.3.6.1.4.1.2011.5.25.165.2.2.7.4"] = [
    name: "hwCpcarAutoPortDefendAlarmResume",
    fields: ["hwCpcarAutoDefendSlotStr", "hwCpcarAutoDefendProtocol", "hwCpcarAutoDefendIfName", "hwCpcarAutoDefendReasonDescription"],
    fieldOids: ["hwCpcarAutoDefendSlotStr": "1.3.6.1.4.1.2011.5.25.165.2.1.7.7", "hwCpcarAutoDefendProtocol": "1.3.6.1.4.1.2011.5.25.165.2.1.7.8", "hwCpcarAutoDefendIfName": "1.3.6.1.4.1.2011.5.25.165.2.1.7.6", "hwCpcarAutoDefendReasonDescription": "1.3.6.1.4.1.2011.5.25.165.2.1.7.9"]
]

// --- hwCpcarReduceCarAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.165.2.2.7.5
// Fields: hwCpcarReduceCarSlotStr
// Description: The alarm of cpcar reduce-car.
trapMap["1.3.6.1.4.1.2011.5.25.165.2.2.7.5"] = [
    name: "hwCpcarReduceCarAlarm",
    fields: ["hwCpcarReduceCarSlotStr"],
    fieldOids: ["hwCpcarReduceCarSlotStr": "1.3.6.1.4.1.2011.5.25.165.2.1.7.10"]
]

// --- hwCpcarReduceCarAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.165.2.2.7.6
// Fields: hwCpcarReduceCarSlotStr
// Description: The alarm of cpcar reduce-car.
trapMap["1.3.6.1.4.1.2011.5.25.165.2.2.7.6"] = [
    name: "hwCpcarReduceCarAlarmResume",
    fields: ["hwCpcarReduceCarSlotStr"],
    fieldOids: ["hwCpcarReduceCarSlotStr": "1.3.6.1.4.1.2011.5.25.165.2.1.7.10"]
]

// --- hwAutoPortDefendViaMflpAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.165.2.2.7.7
// Fields: hwAutoPortViaMflpSlotStr, hwAutoPortViaMflpProtocol, hwAutoPortViaMflpIfName, hwAutoPortViaMflpReasonDescription
// Description: The alarm of cpcar auto-port-defend.
trapMap["1.3.6.1.4.1.2011.5.25.165.2.2.7.7"] = [
    name: "hwAutoPortDefendViaMflpAlarm",
    fields: ["hwAutoPortViaMflpSlotStr", "hwAutoPortViaMflpProtocol", "hwAutoPortViaMflpIfName", "hwAutoPortViaMflpReasonDescription"],
    fieldOids: ["hwAutoPortViaMflpSlotStr": "1.3.6.1.4.1.2011.5.25.165.2.1.7.12", "hwAutoPortViaMflpProtocol": "1.3.6.1.4.1.2011.5.25.165.2.1.7.13", "hwAutoPortViaMflpIfName": "1.3.6.1.4.1.2011.5.25.165.2.1.7.11", "hwAutoPortViaMflpReasonDescription": "1.3.6.1.4.1.2011.5.25.165.2.1.7.14"]
]

// --- hwAutoPortDefendViaMflpAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.165.2.2.7.8
// Fields: hwAutoPortViaMflpSlotStr, hwAutoPortViaMflpProtocol, hwAutoPortViaMflpIfName, hwAutoPortViaMflpReasonDescription
// Description: The resume alarm of cpcar auto-port-defend.
trapMap["1.3.6.1.4.1.2011.5.25.165.2.2.7.8"] = [
    name: "hwAutoPortDefendViaMflpAlarmResume",
    fields: ["hwAutoPortViaMflpSlotStr", "hwAutoPortViaMflpProtocol", "hwAutoPortViaMflpIfName", "hwAutoPortViaMflpReasonDescription"],
    fieldOids: ["hwAutoPortViaMflpSlotStr": "1.3.6.1.4.1.2011.5.25.165.2.1.7.12", "hwAutoPortViaMflpProtocol": "1.3.6.1.4.1.2011.5.25.165.2.1.7.13", "hwAutoPortViaMflpIfName": "1.3.6.1.4.1.2011.5.25.165.2.1.7.11", "hwAutoPortViaMflpReasonDescription": "1.3.6.1.4.1.2011.5.25.165.2.1.7.14"]
]

// --- hwMACsecFailNotify (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.165.2.2.8.1
// Fields: hwMACsecIfName, hwMACsecReason
// Description: The alarm of MACsec fail.
trapMap["1.3.6.1.4.1.2011.5.25.165.2.2.8.1"] = [
    name: "hwMACsecFailNotify",
    fields: ["hwMACsecIfName", "hwMACsecReason"],
    fieldOids: ["hwMACsecIfName": "1.3.6.1.4.1.2011.5.25.165.2.1.8.1", "hwMACsecReason": "1.3.6.1.4.1.2011.5.25.165.2.1.8.2"]
]

// --- hwStrackPortAtk (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.165.2.2.9.1
// Fields: hwStrackPortPacketIfName, hwStrackPortPacketType
// Description: The alarm of auto-port-defend occurs.
trapMap["1.3.6.1.4.1.2011.5.25.165.2.2.9.1"] = [
    name: "hwStrackPortAtk",
    fields: ["hwStrackPortPacketIfName", "hwStrackPortPacketType"],
    fieldOids: ["hwStrackPortPacketIfName": "1.3.6.1.4.1.2011.5.25.165.2.1.9.1", "hwStrackPortPacketType": "1.3.6.1.4.1.2011.5.25.165.2.1.9.2"]
]

// --- hwTeSourceInterfaceCheckAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.165.2.2.10.1
// Fields: hwRpfTeLabel, hwRpfPortName
// Description: This object indicates that packets are discarded due to mismatching of TE source port check.
trapMap["1.3.6.1.4.1.2011.5.25.165.2.2.10.1"] = [
    name: "hwTeSourceInterfaceCheckAlarm",
    fields: ["hwRpfTeLabel", "hwRpfPortName"],
    fieldOids: ["hwRpfTeLabel": "1.3.6.1.4.1.2011.5.25.165.2.1.10.1.1.1", "hwRpfPortName": "1.3.6.1.4.1.2011.5.25.165.2.1.10.1.1.2"]
]

// --- hwTeSourceInterfaceCheckResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.165.2.2.10.2
// Fields: hwRpfTeLabel, hwRpfPortName
// Description: No mismatch packets are found during the TE source interface check.
trapMap["1.3.6.1.4.1.2011.5.25.165.2.2.10.2"] = [
    name: "hwTeSourceInterfaceCheckResume",
    fields: ["hwRpfTeLabel", "hwRpfPortName"],
    fieldOids: ["hwRpfTeLabel": "1.3.6.1.4.1.2011.5.25.165.2.1.10.1.1.1", "hwRpfPortName": "1.3.6.1.4.1.2011.5.25.165.2.1.10.1.1.2"]
]

// --- hwOlcStartAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.165.2.2.11.1
// Fields: hwOlcSlotStr, hwOlcThreshold1, hwOlcCurrentCpuUsage, hwOlcCpuSampleCycle
// Description: This object indicates that OLC function is start due to CPU overloaded.
trapMap["1.3.6.1.4.1.2011.5.25.165.2.2.11.1"] = [
    name: "hwOlcStartAlarm",
    fields: ["hwOlcSlotStr", "hwOlcThreshold1", "hwOlcCurrentCpuUsage", "hwOlcCpuSampleCycle"],
    fieldOids: ["hwOlcSlotStr": "1.3.6.1.4.1.2011.5.25.165.2.1.11.1", "hwOlcThreshold1": "1.3.6.1.4.1.2011.5.25.165.2.1.11.2", "hwOlcCurrentCpuUsage": "1.3.6.1.4.1.2011.5.25.165.2.1.11.3", "hwOlcCpuSampleCycle": "1.3.6.1.4.1.2011.5.25.165.2.1.11.4"]
]

// --- hwOlcStopAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.165.2.2.11.2
// Fields: hwOlcSlotStr, hwOlcThreshold1, hwOlcCurrentCpuUsage, hwOlcCpuSampleCycle
// Description: This object indicates that OLC function is stop due to low CPU usage.
trapMap["1.3.6.1.4.1.2011.5.25.165.2.2.11.2"] = [
    name: "hwOlcStopAlarm",
    fields: ["hwOlcSlotStr", "hwOlcThreshold1", "hwOlcCurrentCpuUsage", "hwOlcCpuSampleCycle"],
    fieldOids: ["hwOlcSlotStr": "1.3.6.1.4.1.2011.5.25.165.2.1.11.1", "hwOlcThreshold1": "1.3.6.1.4.1.2011.5.25.165.2.1.11.2", "hwOlcCurrentCpuUsage": "1.3.6.1.4.1.2011.5.25.165.2.1.11.3", "hwOlcCpuSampleCycle": "1.3.6.1.4.1.2011.5.25.165.2.1.11.4"]
]

// --- hwEngineSessThresholdAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.165.2.2.12.1
// Fields: hwEngineCurrSessNum
// Description: The number of sessions exceeds the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.165.2.2.12.1"] = [
    name: "hwEngineSessThresholdAlarm",
    fields: ["hwEngineCurrSessNum"],
    fieldOids: ["hwEngineCurrSessNum": "1.3.6.1.4.1.2011.5.25.165.2.1.12.1"]
]

// --- hwEngineSessThresholdResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.165.2.2.12.2
// Fields: hwEngineCurrSessNum
// Description: The number of sessions fell below the upper limit.
trapMap["1.3.6.1.4.1.2011.5.25.165.2.2.12.2"] = [
    name: "hwEngineSessThresholdResume",
    fields: ["hwEngineCurrSessNum"],
    fieldOids: ["hwEngineCurrSessNum": "1.3.6.1.4.1.2011.5.25.165.2.1.12.1"]
]

// --- hwWeakEAConfigAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.165.2.2.13.1
// Description: Insecure encryption algorithms exist.
trapMap["1.3.6.1.4.1.2011.5.25.165.2.2.13.1"] = [
    name: "hwWeakEAConfigAlarm",
    fields: [],
    fieldOids: []
]

// --- hwPPEDropPacketAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.165.2.2.14.1
// Fields: hwPPEDropPacketSlotStr, hwPPEDropPacketNum
// Description: The alarm of ppe drop packets.
trapMap["1.3.6.1.4.1.2011.5.25.165.2.2.14.1"] = [
    name: "hwPPEDropPacketAlarm",
    fields: ["hwPPEDropPacketSlotStr", "hwPPEDropPacketNum"],
    fieldOids: ["hwPPEDropPacketSlotStr": "1.3.6.1.4.1.2011.5.25.165.2.1.14.1", "hwPPEDropPacketNum": "1.3.6.1.4.1.2011.5.25.165.2.1.14.2"]
]

// --- hwPPEDropPacketAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.165.2.2.14.2
// Fields: hwPPEDropPacketSlotStr, hwPPEDropPacketNum
// Description: The resume alarm of ppe drop packets.
trapMap["1.3.6.1.4.1.2011.5.25.165.2.2.14.2"] = [
    name: "hwPPEDropPacketAlarmResume",
    fields: ["hwPPEDropPacketSlotStr", "hwPPEDropPacketNum"],
    fieldOids: ["hwPPEDropPacketSlotStr": "1.3.6.1.4.1.2011.5.25.165.2.1.14.1", "hwPPEDropPacketNum": "1.3.6.1.4.1.2011.5.25.165.2.1.14.2"]
]

// --- hwTerminalStatusAbnormal (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.165.2.2.15.1
// Fields: hwTerminalIfName, hwTerminalSourceMac, hwTerminalType, hwTerminalSourceIp
// Description: The status of the terminal is abnormal.
trapMap["1.3.6.1.4.1.2011.5.25.165.2.2.15.1"] = [
    name: "hwTerminalStatusAbnormal",
    fields: ["hwTerminalIfName", "hwTerminalSourceMac", "hwTerminalType", "hwTerminalSourceIp"],
    fieldOids: ["hwTerminalIfName": "1.3.6.1.4.1.2011.5.25.165.2.1.15.1", "hwTerminalSourceMac": "1.3.6.1.4.1.2011.5.25.165.2.1.15.2", "hwTerminalType": "1.3.6.1.4.1.2011.5.25.165.2.1.15.3", "hwTerminalSourceIp": "1.3.6.1.4.1.2011.5.25.165.2.1.15.4"]
]

// --- hwTerminalStatusResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.165.2.2.15.2
// Fields: hwTerminalIfName, hwTerminalSourceMac, hwTerminalType, hwTerminalSourceIp
// Description: The status of the terminal is normal.
trapMap["1.3.6.1.4.1.2011.5.25.165.2.2.15.2"] = [
    name: "hwTerminalStatusResume",
    fields: ["hwTerminalIfName", "hwTerminalSourceMac", "hwTerminalType", "hwTerminalSourceIp"],
    fieldOids: ["hwTerminalIfName": "1.3.6.1.4.1.2011.5.25.165.2.1.15.1", "hwTerminalSourceMac": "1.3.6.1.4.1.2011.5.25.165.2.1.15.2", "hwTerminalType": "1.3.6.1.4.1.2011.5.25.165.2.1.15.3", "hwTerminalSourceIp": "1.3.6.1.4.1.2011.5.25.165.2.1.15.4"]
]

// --- hwTerminalNumAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.165.2.2.16.1
// Description: The number of terminal entries has reached the maximum.
trapMap["1.3.6.1.4.1.2011.5.25.165.2.2.16.1"] = [
    name: "hwTerminalNumAlarm",
    fields: [],
    fieldOids: []
]

// --- hwSessionCarAttackInfo (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.165.2.2.17.1
// Fields: hwSessionCarProtoType, hwSessionCarSrcIP, hwSessionCarDstIP, hwSessionCarSrcIPV6, hwSessionCarDstIPV6, hwSessionCarSrcPort, hwSessionCarDstPort, hwSessionCarSrcMAC, hwSessionCarDstMAC
// Description: One of the linkup session is detected as an attack.
trapMap["1.3.6.1.4.1.2011.5.25.165.2.2.17.1"] = [
    name: "hwSessionCarAttackInfo",
    fields: ["hwSessionCarProtoType", "hwSessionCarSrcIP", "hwSessionCarDstIP", "hwSessionCarSrcIPV6", "hwSessionCarDstIPV6", "hwSessionCarSrcPort", "hwSessionCarDstPort", "hwSessionCarSrcMAC", "hwSessionCarDstMAC"],
    fieldOids: ["hwSessionCarProtoType": "1.3.6.1.4.1.2011.5.25.165.2.1.17.1", "hwSessionCarSrcIP": "1.3.6.1.4.1.2011.5.25.165.2.1.17.2", "hwSessionCarDstIP": "1.3.6.1.4.1.2011.5.25.165.2.1.17.3", "hwSessionCarSrcIPV6": "1.3.6.1.4.1.2011.5.25.165.2.1.17.4", "hwSessionCarDstIPV6": "1.3.6.1.4.1.2011.5.25.165.2.1.17.5", "hwSessionCarSrcPort": "1.3.6.1.4.1.2011.5.25.165.2.1.17.6", "hwSessionCarDstPort": "1.3.6.1.4.1.2011.5.25.165.2.1.17.7", "hwSessionCarSrcMAC": "1.3.6.1.4.1.2011.5.25.165.2.1.17.8", "hwSessionCarDstMAC": "1.3.6.1.4.1.2011.5.25.165.2.1.17.9"]
]

// --- hwAccessRateRemainsLowAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.165.2.2.18.1
// Fields: hwAccessRateRemainsLowSlot, hwAccessRateRemainsLowInterval, hwAccessRateRemainsLowThreshold, hwAccessRateRemainsLowConfigPercent, hwAccessRateRemainsLowActualPercent
// Description: Access rate remains low alarmed.
trapMap["1.3.6.1.4.1.2011.5.25.165.2.2.18.1"] = [
    name: "hwAccessRateRemainsLowAlarm",
    fields: ["hwAccessRateRemainsLowSlot", "hwAccessRateRemainsLowInterval", "hwAccessRateRemainsLowThreshold", "hwAccessRateRemainsLowConfigPercent", "hwAccessRateRemainsLowActualPercent"],
    fieldOids: ["hwAccessRateRemainsLowSlot": "1.3.6.1.4.1.2011.5.25.165.2.1.18.1", "hwAccessRateRemainsLowInterval": "1.3.6.1.4.1.2011.5.25.165.2.1.18.2", "hwAccessRateRemainsLowThreshold": "1.3.6.1.4.1.2011.5.25.165.2.1.18.3", "hwAccessRateRemainsLowConfigPercent": "1.3.6.1.4.1.2011.5.25.165.2.1.18.4", "hwAccessRateRemainsLowActualPercent": "1.3.6.1.4.1.2011.5.25.165.2.1.18.5"]
]

// --- hwAccessRateRemainsLowAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.165.2.2.18.2
// Fields: hwAccessRateRemainsLowSlot, hwAccessRateRemainsLowInterval, hwAccessRateRemainsLowThreshold, hwAccessRateRemainsLowConfigPercent, hwAccessRateRemainsLowActualPercent
// Description: Access rate remains low alarm cleared.
trapMap["1.3.6.1.4.1.2011.5.25.165.2.2.18.2"] = [
    name: "hwAccessRateRemainsLowAlarmResume",
    fields: ["hwAccessRateRemainsLowSlot", "hwAccessRateRemainsLowInterval", "hwAccessRateRemainsLowThreshold", "hwAccessRateRemainsLowConfigPercent", "hwAccessRateRemainsLowActualPercent"],
    fieldOids: ["hwAccessRateRemainsLowSlot": "1.3.6.1.4.1.2011.5.25.165.2.1.18.1", "hwAccessRateRemainsLowInterval": "1.3.6.1.4.1.2011.5.25.165.2.1.18.2", "hwAccessRateRemainsLowThreshold": "1.3.6.1.4.1.2011.5.25.165.2.1.18.3", "hwAccessRateRemainsLowConfigPercent": "1.3.6.1.4.1.2011.5.25.165.2.1.18.4", "hwAccessRateRemainsLowActualPercent": "1.3.6.1.4.1.2011.5.25.165.2.1.18.5"]
]

// --- hwCuFirstAccessRateRemainsLowAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.165.2.2.18.3
// Fields: hwAccessRateRemainsLowSlot, hwAccessRateRemainsLowUpId, hwAccessRateRemainsLowInterval, hwAccessRateRemainsLowThreshold, hwAccessRateRemainsLowConfigPercent, hwAccessRateRemainsLowActualPercent
// Description: First access rate remains low alarmed.
trapMap["1.3.6.1.4.1.2011.5.25.165.2.2.18.3"] = [
    name: "hwCuFirstAccessRateRemainsLowAlarm",
    fields: ["hwAccessRateRemainsLowSlot", "hwAccessRateRemainsLowUpId", "hwAccessRateRemainsLowInterval", "hwAccessRateRemainsLowThreshold", "hwAccessRateRemainsLowConfigPercent", "hwAccessRateRemainsLowActualPercent"],
    fieldOids: ["hwAccessRateRemainsLowSlot": "1.3.6.1.4.1.2011.5.25.165.2.1.18.1", "hwAccessRateRemainsLowUpId": "1.3.6.1.4.1.2011.5.25.165.2.1.18.6", "hwAccessRateRemainsLowInterval": "1.3.6.1.4.1.2011.5.25.165.2.1.18.2", "hwAccessRateRemainsLowThreshold": "1.3.6.1.4.1.2011.5.25.165.2.1.18.3", "hwAccessRateRemainsLowConfigPercent": "1.3.6.1.4.1.2011.5.25.165.2.1.18.4", "hwAccessRateRemainsLowActualPercent": "1.3.6.1.4.1.2011.5.25.165.2.1.18.5"]
]

// --- hwCuFirstAccessRateRemainsLowAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.165.2.2.18.4
// Fields: hwAccessRateRemainsLowSlot, hwAccessRateRemainsLowUpId, hwAccessRateRemainsLowInterval, hwAccessRateRemainsLowThreshold, hwAccessRateRemainsLowConfigPercent, hwAccessRateRemainsLowActualPercent
// Description: First access rate remains low alarm cleared.
trapMap["1.3.6.1.4.1.2011.5.25.165.2.2.18.4"] = [
    name: "hwCuFirstAccessRateRemainsLowAlarmResume",
    fields: ["hwAccessRateRemainsLowSlot", "hwAccessRateRemainsLowUpId", "hwAccessRateRemainsLowInterval", "hwAccessRateRemainsLowThreshold", "hwAccessRateRemainsLowConfigPercent", "hwAccessRateRemainsLowActualPercent"],
    fieldOids: ["hwAccessRateRemainsLowSlot": "1.3.6.1.4.1.2011.5.25.165.2.1.18.1", "hwAccessRateRemainsLowUpId": "1.3.6.1.4.1.2011.5.25.165.2.1.18.6", "hwAccessRateRemainsLowInterval": "1.3.6.1.4.1.2011.5.25.165.2.1.18.2", "hwAccessRateRemainsLowThreshold": "1.3.6.1.4.1.2011.5.25.165.2.1.18.3", "hwAccessRateRemainsLowConfigPercent": "1.3.6.1.4.1.2011.5.25.165.2.1.18.4", "hwAccessRateRemainsLowActualPercent": "1.3.6.1.4.1.2011.5.25.165.2.1.18.5"]
]

// --- hwCuSecondAccessRateRemainsLowAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.165.2.2.18.5
// Fields: hwAccessRateRemainsLowSlot, hwAccessRateRemainsLowInstanceId, hwAccessRateRemainsLowInterval, hwAccessRateRemainsLowThreshold, hwAccessRateRemainsLowConfigPercent, hwAccessRateRemainsLowActualPercent
// Description: Second access rate remains low alarmed.
trapMap["1.3.6.1.4.1.2011.5.25.165.2.2.18.5"] = [
    name: "hwCuSecondAccessRateRemainsLowAlarm",
    fields: ["hwAccessRateRemainsLowSlot", "hwAccessRateRemainsLowInstanceId", "hwAccessRateRemainsLowInterval", "hwAccessRateRemainsLowThreshold", "hwAccessRateRemainsLowConfigPercent", "hwAccessRateRemainsLowActualPercent"],
    fieldOids: ["hwAccessRateRemainsLowSlot": "1.3.6.1.4.1.2011.5.25.165.2.1.18.1", "hwAccessRateRemainsLowInstanceId": "1.3.6.1.4.1.2011.5.25.165.2.1.18.7", "hwAccessRateRemainsLowInterval": "1.3.6.1.4.1.2011.5.25.165.2.1.18.2", "hwAccessRateRemainsLowThreshold": "1.3.6.1.4.1.2011.5.25.165.2.1.18.3", "hwAccessRateRemainsLowConfigPercent": "1.3.6.1.4.1.2011.5.25.165.2.1.18.4", "hwAccessRateRemainsLowActualPercent": "1.3.6.1.4.1.2011.5.25.165.2.1.18.5"]
]

// --- hwCuSecondAccessRateRemainsLowAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.165.2.2.18.6
// Fields: hwAccessRateRemainsLowSlot, hwAccessRateRemainsLowInstanceId, hwAccessRateRemainsLowInterval, hwAccessRateRemainsLowThreshold, hwAccessRateRemainsLowConfigPercent, hwAccessRateRemainsLowActualPercent
// Description: Second access rate remains low alarm cleared.
trapMap["1.3.6.1.4.1.2011.5.25.165.2.2.18.6"] = [
    name: "hwCuSecondAccessRateRemainsLowAlarmResume",
    fields: ["hwAccessRateRemainsLowSlot", "hwAccessRateRemainsLowInstanceId", "hwAccessRateRemainsLowInterval", "hwAccessRateRemainsLowThreshold", "hwAccessRateRemainsLowConfigPercent", "hwAccessRateRemainsLowActualPercent"],
    fieldOids: ["hwAccessRateRemainsLowSlot": "1.3.6.1.4.1.2011.5.25.165.2.1.18.1", "hwAccessRateRemainsLowInstanceId": "1.3.6.1.4.1.2011.5.25.165.2.1.18.7", "hwAccessRateRemainsLowInterval": "1.3.6.1.4.1.2011.5.25.165.2.1.18.2", "hwAccessRateRemainsLowThreshold": "1.3.6.1.4.1.2011.5.25.165.2.1.18.3", "hwAccessRateRemainsLowConfigPercent": "1.3.6.1.4.1.2011.5.25.165.2.1.18.4", "hwAccessRateRemainsLowActualPercent": "1.3.6.1.4.1.2011.5.25.165.2.1.18.5"]
]

// --- hwEngineFlowAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.165.2.2.19.1
// Fields: hwEngineFlowSlot, hwEngineFlowTotalNum, hwEngineFlowUsedNum, hwEngineFlowThreshold
// Description: Description.
trapMap["1.3.6.1.4.1.2011.5.25.165.2.2.19.1"] = [
    name: "hwEngineFlowAlarm",
    fields: ["hwEngineFlowSlot", "hwEngineFlowTotalNum", "hwEngineFlowUsedNum", "hwEngineFlowThreshold"],
    fieldOids: ["hwEngineFlowSlot": "1.3.6.1.4.1.2011.5.25.165.2.1.19.1", "hwEngineFlowTotalNum": "1.3.6.1.4.1.2011.5.25.165.2.1.19.2", "hwEngineFlowUsedNum": "1.3.6.1.4.1.2011.5.25.165.2.1.19.3", "hwEngineFlowThreshold": "1.3.6.1.4.1.2011.5.25.165.2.1.19.4"]
]

// --- hwEngineFlowAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.165.2.2.19.2
// Fields: hwEngineFlowSlot, hwEngineFlowTotalNum, hwEngineFlowUsedNum, hwEngineFlowThreshold
// Description: Description.
trapMap["1.3.6.1.4.1.2011.5.25.165.2.2.19.2"] = [
    name: "hwEngineFlowAlarmResume",
    fields: ["hwEngineFlowSlot", "hwEngineFlowTotalNum", "hwEngineFlowUsedNum", "hwEngineFlowThreshold"],
    fieldOids: ["hwEngineFlowSlot": "1.3.6.1.4.1.2011.5.25.165.2.1.19.1", "hwEngineFlowTotalNum": "1.3.6.1.4.1.2011.5.25.165.2.1.19.2", "hwEngineFlowUsedNum": "1.3.6.1.4.1.2011.5.25.165.2.1.19.3", "hwEngineFlowThreshold": "1.3.6.1.4.1.2011.5.25.165.2.1.19.4"]
]

// --- hwEngineAppFeatureAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.165.2.2.20.1
// Fields: hwEngineAppFeatureSlot, hwEngineAppFeatureTotalNum, hwEngineAppFeatureUsedNum, hwEngineAppFeatureThreshold
// Description: Description.
trapMap["1.3.6.1.4.1.2011.5.25.165.2.2.20.1"] = [
    name: "hwEngineAppFeatureAlarm",
    fields: ["hwEngineAppFeatureSlot", "hwEngineAppFeatureTotalNum", "hwEngineAppFeatureUsedNum", "hwEngineAppFeatureThreshold"],
    fieldOids: ["hwEngineAppFeatureSlot": "1.3.6.1.4.1.2011.5.25.165.2.1.20.1", "hwEngineAppFeatureTotalNum": "1.3.6.1.4.1.2011.5.25.165.2.1.20.2", "hwEngineAppFeatureUsedNum": "1.3.6.1.4.1.2011.5.25.165.2.1.20.3", "hwEngineAppFeatureThreshold": "1.3.6.1.4.1.2011.5.25.165.2.1.20.4"]
]

// --- hwEngineAppFeatureAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.165.2.2.20.2
// Fields: hwEngineAppFeatureSlot, hwEngineAppFeatureTotalNum, hwEngineAppFeatureUsedNum, hwEngineAppFeatureThreshold
// Description: Description.
trapMap["1.3.6.1.4.1.2011.5.25.165.2.2.20.2"] = [
    name: "hwEngineAppFeatureAlarmResume",
    fields: ["hwEngineAppFeatureSlot", "hwEngineAppFeatureTotalNum", "hwEngineAppFeatureUsedNum", "hwEngineAppFeatureThreshold"],
    fieldOids: ["hwEngineAppFeatureSlot": "1.3.6.1.4.1.2011.5.25.165.2.1.20.1", "hwEngineAppFeatureTotalNum": "1.3.6.1.4.1.2011.5.25.165.2.1.20.2", "hwEngineAppFeatureUsedNum": "1.3.6.1.4.1.2011.5.25.165.2.1.20.3", "hwEngineAppFeatureThreshold": "1.3.6.1.4.1.2011.5.25.165.2.1.20.4"]
]

// --- hwSSHAttackAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.165.2.2.21.1
// Description: SSH attack occurred.
trapMap["1.3.6.1.4.1.2011.5.25.165.2.2.21.1"] = [
    name: "hwSSHAttackAlarm",
    fields: [],
    fieldOids: []
]

// --- hwStormSuppIfmAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.165.2.2.22.1
// Fields: hwStormSuppIfName, hwStormSuppPktType, hwStormSuppThreshold, hwStormSuppMode, hwStormSuppDropCnt
// Description: The alarm of interface storm suppression drop packets.
trapMap["1.3.6.1.4.1.2011.5.25.165.2.2.22.1"] = [
    name: "hwStormSuppIfmAlarm",
    fields: ["hwStormSuppIfName", "hwStormSuppPktType", "hwStormSuppThreshold", "hwStormSuppMode", "hwStormSuppDropCnt"],
    fieldOids: ["hwStormSuppIfName": "1.3.6.1.4.1.2011.5.25.165.2.1.21.1", "hwStormSuppPktType": "1.3.6.1.4.1.2011.5.25.165.2.1.21.3", "hwStormSuppThreshold": "1.3.6.1.4.1.2011.5.25.165.2.1.21.4", "hwStormSuppMode": "1.3.6.1.4.1.2011.5.25.165.2.1.21.5", "hwStormSuppDropCnt": "1.3.6.1.4.1.2011.5.25.165.2.1.21.6"]
]

// --- hwStormSuppIfmAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.165.2.2.22.2
// Fields: hwStormSuppIfName, hwStormSuppPktType, hwStormSuppThreshold, hwStormSuppMode
// Description: The resume alarm of interface storm suppression drop packets.
trapMap["1.3.6.1.4.1.2011.5.25.165.2.2.22.2"] = [
    name: "hwStormSuppIfmAlarmResume",
    fields: ["hwStormSuppIfName", "hwStormSuppPktType", "hwStormSuppThreshold", "hwStormSuppMode"],
    fieldOids: ["hwStormSuppIfName": "1.3.6.1.4.1.2011.5.25.165.2.1.21.1", "hwStormSuppPktType": "1.3.6.1.4.1.2011.5.25.165.2.1.21.3", "hwStormSuppThreshold": "1.3.6.1.4.1.2011.5.25.165.2.1.21.4", "hwStormSuppMode": "1.3.6.1.4.1.2011.5.25.165.2.1.21.5"]
]

// --- hwStormSuppVlanAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.165.2.2.22.3
// Fields: hwStormSupptVsiId, hwStormSuppPktType, hwStormSuppThreshold, hwStormSuppMode, hwStormSuppDropCnt
// Description: The alarm of vlan storm suppression drop packets.
trapMap["1.3.6.1.4.1.2011.5.25.165.2.2.22.3"] = [
    name: "hwStormSuppVlanAlarm",
    fields: ["hwStormSupptVsiId", "hwStormSuppPktType", "hwStormSuppThreshold", "hwStormSuppMode", "hwStormSuppDropCnt"],
    fieldOids: ["hwStormSupptVsiId": "1.3.6.1.4.1.2011.5.25.165.2.1.21.2", "hwStormSuppPktType": "1.3.6.1.4.1.2011.5.25.165.2.1.21.3", "hwStormSuppThreshold": "1.3.6.1.4.1.2011.5.25.165.2.1.21.4", "hwStormSuppMode": "1.3.6.1.4.1.2011.5.25.165.2.1.21.5", "hwStormSuppDropCnt": "1.3.6.1.4.1.2011.5.25.165.2.1.21.6"]
]

// --- hwStormSuppVlanAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.165.2.2.22.4
// Fields: hwStormSupptVsiId, hwStormSuppPktType, hwStormSuppThreshold, hwStormSuppMode
// Description: The resume alarm of vlan storm suppression drop packets.
trapMap["1.3.6.1.4.1.2011.5.25.165.2.2.22.4"] = [
    name: "hwStormSuppVlanAlarmResume",
    fields: ["hwStormSupptVsiId", "hwStormSuppPktType", "hwStormSuppThreshold", "hwStormSuppMode"],
    fieldOids: ["hwStormSupptVsiId": "1.3.6.1.4.1.2011.5.25.165.2.1.21.2", "hwStormSuppPktType": "1.3.6.1.4.1.2011.5.25.165.2.1.21.3", "hwStormSuppThreshold": "1.3.6.1.4.1.2011.5.25.165.2.1.21.4", "hwStormSuppMode": "1.3.6.1.4.1.2011.5.25.165.2.1.21.5"]
]

// --- hwStormSuppBdAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.165.2.2.22.5
// Fields: hwStormSupptVsiId, hwStormSuppPktType, hwStormSuppThreshold, hwStormSuppMode, hwStormSuppDropCnt
// Description: The alarm of bd storm suppression drop packets.
trapMap["1.3.6.1.4.1.2011.5.25.165.2.2.22.5"] = [
    name: "hwStormSuppBdAlarm",
    fields: ["hwStormSupptVsiId", "hwStormSuppPktType", "hwStormSuppThreshold", "hwStormSuppMode", "hwStormSuppDropCnt"],
    fieldOids: ["hwStormSupptVsiId": "1.3.6.1.4.1.2011.5.25.165.2.1.21.2", "hwStormSuppPktType": "1.3.6.1.4.1.2011.5.25.165.2.1.21.3", "hwStormSuppThreshold": "1.3.6.1.4.1.2011.5.25.165.2.1.21.4", "hwStormSuppMode": "1.3.6.1.4.1.2011.5.25.165.2.1.21.5", "hwStormSuppDropCnt": "1.3.6.1.4.1.2011.5.25.165.2.1.21.6"]
]

// --- hwStormSuppBdAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.165.2.2.22.6
// Fields: hwStormSupptVsiId, hwStormSuppPktType, hwStormSuppThreshold, hwStormSuppMode
// Description: The resume alarm of bd storm suppression drop packets.
trapMap["1.3.6.1.4.1.2011.5.25.165.2.2.22.6"] = [
    name: "hwStormSuppBdAlarmResume",
    fields: ["hwStormSupptVsiId", "hwStormSuppPktType", "hwStormSuppThreshold", "hwStormSuppMode"],
    fieldOids: ["hwStormSupptVsiId": "1.3.6.1.4.1.2011.5.25.165.2.1.21.2", "hwStormSuppPktType": "1.3.6.1.4.1.2011.5.25.165.2.1.21.3", "hwStormSuppThreshold": "1.3.6.1.4.1.2011.5.25.165.2.1.21.4", "hwStormSuppMode": "1.3.6.1.4.1.2011.5.25.165.2.1.21.5"]
]

// --- hwLinkupCarDropPacketAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.165.2.2.23.1
// Fields: hwLinkupCarDropPacketSlotStr, hwLinkupCarDropPacketProtocol, hwLinkupCarDropPacketCir, hwLinkupCarDropPacketNum
// Description: The alarm of linkup car drop packets.
trapMap["1.3.6.1.4.1.2011.5.25.165.2.2.23.1"] = [
    name: "hwLinkupCarDropPacketAlarm",
    fields: ["hwLinkupCarDropPacketSlotStr", "hwLinkupCarDropPacketProtocol", "hwLinkupCarDropPacketCir", "hwLinkupCarDropPacketNum"],
    fieldOids: ["hwLinkupCarDropPacketSlotStr": "1.3.6.1.4.1.2011.5.25.165.2.1.23.1", "hwLinkupCarDropPacketProtocol": "1.3.6.1.4.1.2011.5.25.165.2.1.23.2", "hwLinkupCarDropPacketCir": "1.3.6.1.4.1.2011.5.25.165.2.1.23.3", "hwLinkupCarDropPacketNum": "1.3.6.1.4.1.2011.5.25.165.2.1.23.4"]
]

// --- hwLinkupCarDropPacketAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.165.2.2.23.2
// Fields: hwLinkupCarDropPacketSlotStr, hwLinkupCarDropPacketProtocol, hwLinkupCarDropPacketCir, hwLinkupCarDropPacketNum
// Description: The resume alarm of linkup car drop packets.
trapMap["1.3.6.1.4.1.2011.5.25.165.2.2.23.2"] = [
    name: "hwLinkupCarDropPacketAlarmResume",
    fields: ["hwLinkupCarDropPacketSlotStr", "hwLinkupCarDropPacketProtocol", "hwLinkupCarDropPacketCir", "hwLinkupCarDropPacketNum"],
    fieldOids: ["hwLinkupCarDropPacketSlotStr": "1.3.6.1.4.1.2011.5.25.165.2.1.23.1", "hwLinkupCarDropPacketProtocol": "1.3.6.1.4.1.2011.5.25.165.2.1.23.2", "hwLinkupCarDropPacketCir": "1.3.6.1.4.1.2011.5.25.165.2.1.23.3", "hwLinkupCarDropPacketNum": "1.3.6.1.4.1.2011.5.25.165.2.1.23.4"]
]

// --- hwBoardNotSupoortArpCheckDIPTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.165.2.2.24.1
// Fields: hwCfgApSlotID
// Description: The board does not support ARP packet filtering for direct routes.
trapMap["1.3.6.1.4.1.2011.5.25.165.2.2.24.1"] = [
    name: "hwBoardNotSupoortArpCheckDIPTrap",
    fields: ["hwCfgApSlotID"],
    fieldOids: ["hwCfgApSlotID": "1.3.6.1.4.1.2011.5.25.165.2.1.24.1"]
]

// ===== Parsing logic =====

// Set to true to enable diagnostic logging for this MIB parser
DEBUG = false

LOG_PREFIX = "[HUAWEI-SECURITY-MIB]"
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
