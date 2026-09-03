/**
 * Auto-generated from HUAWEI-L2MAM-MIB.mib
 * Generated: 2026-08-24T18:28:30.124649600
 * Traps/Notifications (81): hwMacUsageRaisingThreshold, hwMacUsageFallingThreshold, hwMacLimitNumRaisingThreshold, hwMacLimitNumFallingThreshold, hwUntargetMacNumAlarm, hwPortSecRcvInsecurePktAlarm, hwPwMacLimitNumRaisingThreshold, hwPwMacLimitNumFallingThreshold, hwPortStickyReachMaxAlarm, hwRecIllegalMacPktAlarm, hwMacLimitOverThresholdAlarm, hwMacFlappingAlarm, hwSlotMacLimitNumRaisingThreshold, hwSlotMacLimitNumFallingThreshold, hwL2ProtocolTunnelDropThresholdRaising, hwL2ProtocolTunnelDropThresholdFalling, hwVsiMacLimitNumRaisingThresholdAlarm, hwVsiMacLimitNumRaisingThresholdAlarmClear, hwMacLimitOverThresholdAlarmResume, hwSlotMacNumRaisingThreshold, hwSlotMacNumFallingThreshold, hwMacLimitRuleNumRaisingThreshold, hwMacLimitRuleNumFallingThreshold, hwVplsOverGRENotSupportForwardRising, hwVplsOverGRENotSupportForwardRisingResume, hwIfInputUnucFlowRisingThreshold, hwIfInputUnucFlowFallingThreshold, hwMacHopAlarmRaisingThreshold, hwMacHopAlarmFallingThreshold, hwPstBroadcastLostAlarm, hwPstBroadcastLostResume, hwPwMacSpoofingAttackAlarm, hwPwMacSpoofingAttackAlarmClear, hwBdMacLimitOverThresholdAlarm, hwBdMacLimitOverThresholdAlarmResume, hwPWOverLdpOverGRENotSupportForwardAlarm, hwPWOverLdpOverGRENotSupportForwardResume, hwPwSourceTunnelCheckAlarm, hwPwSourceTunnelCheckResume, hwPwSourceTunnelNoTeCheckAlarm, hwPwSourceTunnelNoTeCheckResume, hwBoardServiceMisMatchGenerate, hwBoardServiceMisMatchCancel, hwEVPNNotSupportTunnelAlarm, hwEVPNNotSupportTunnelAlarmResume, hwVPLSNotSupportTunnelAlarm, hwVPLSNotSupportTunnelAlarmResume, hwServiceNotSupportNodeSrteLoadBanlance, hwVplsPwHqosNotSupportTunnelAlarm, hwVplsPwHqosNotSupportTunnelAlarmResume, hwPbbEvpnNotSupportTunnelAlarm, hwPbbEvpnNotSupportTunnelAlarmResume, hwVllVpnQosNotSupportTunnelAlarm, hwVllVpnQosNotSupportTunnelAlarmResume, hwVllVpnQosOverTunnelAlarm, hwVllVpnQosOverTunnelAlarmResume, hwBroadcastDomainElbAlarm, hwBroadcastDomainElbAlarmResume, hwL2DomainMacLimitNumRaisingThreshold, hwL2DomainMacLimitNumFallingThreshold, hwVxlanTunnelMacLimitOverThresholdAlarm, hwVxlanTunnelMacLimitOverThresholdAlarmResume, hwTunnelNotSupportInterface, hwServiceNotSupportDscpSrte, hwVlanMacLimitOverThreshold, hwVlanMacLimitOverThresholdResume, hwPortMacLimitOverThreshold, hwPortMacLimitOverThresholdResume, hwNotSupportTeOverGre, hwPortSecRcvInsecurePktAlarmResume, hwStickyMacConflictAlarm, hwStickyMacConflictAlarmResume, hwMacHashConflict, hwTraffSuppAlarm, hwTraffSuppAlarmResume, hwVlanTraffSuppAlarm, hwVlanTraffSuppAlarmResume, hwEvplMacLimitNumRaisingThresholdAlarm, hwEvplMacLimitNumRaisingThresholdAlarmResume, hwVsiMacLimitOverThresholdAlarm, hwVsiMacLimitOverThresholdAlarmResume
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

// --- hwMacUsageRaisingThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.2.1.7.1
// Fields: hwBaseTrapSeverity, hwBaseTrapProbableCause, hwBaseTrapEventType, entPhysicalName, hwMacEntityUsage, hwMacEntityUsageThreshold
// Description: This object indicates that the MAC address table usage reached the alarm threshold.
trapMap["1.3.6.1.4.1.2011.5.25.42.2.1.7.1"] = [
    name: "hwMacUsageRaisingThreshold",
    fields: ["hwBaseTrapSeverity", "hwBaseTrapProbableCause", "hwBaseTrapEventType", "entPhysicalName", "hwMacEntityUsage", "hwMacEntityUsageThreshold"],
    fieldOids: ["hwBaseTrapSeverity": "1.3.6.1.4.1.2011.5.25.129.1.1", "hwBaseTrapProbableCause": "1.3.6.1.4.1.2011.5.25.129.1.2", "hwBaseTrapEventType": "1.3.6.1.4.1.2011.5.25.129.1.3", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwMacEntityUsage": "1.3.6.1.4.1.2011.5.25.42.2.1.5.1.1", "hwMacEntityUsageThreshold": "1.3.6.1.4.1.2011.5.25.42.2.1.5.1.2"]
]

// --- hwMacUsageFallingThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.2.1.7.2
// Fields: hwBaseTrapSeverity, hwBaseTrapProbableCause, hwBaseTrapEventType, entPhysicalName, hwMacEntityUsage, hwMacEntityUsageThreshold
// Description: This object indicates that the MAC address usage fell below the alarm threshold.
trapMap["1.3.6.1.4.1.2011.5.25.42.2.1.7.2"] = [
    name: "hwMacUsageFallingThreshold",
    fields: ["hwBaseTrapSeverity", "hwBaseTrapProbableCause", "hwBaseTrapEventType", "entPhysicalName", "hwMacEntityUsage", "hwMacEntityUsageThreshold"],
    fieldOids: ["hwBaseTrapSeverity": "1.3.6.1.4.1.2011.5.25.129.1.1", "hwBaseTrapProbableCause": "1.3.6.1.4.1.2011.5.25.129.1.2", "hwBaseTrapEventType": "1.3.6.1.4.1.2011.5.25.129.1.3", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwMacEntityUsage": "1.3.6.1.4.1.2011.5.25.42.2.1.5.1.1", "hwMacEntityUsageThreshold": "1.3.6.1.4.1.2011.5.25.42.2.1.5.1.2"]
]

// --- hwMacLimitNumRaisingThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.2.1.7.3
// Fields: hwBaseTrapSeverity, hwBaseTrapProbableCause, hwBaseTrapEventType, hwMacDynAddressLearnNum, hwMacLimitMaxMac, hwL2IfPortName, hwMacLimitBdId, hwMacLimitEVPName
// Description: This object indicates that the number of MAC addresses learned by the interface reached the upper limit.
trapMap["1.3.6.1.4.1.2011.5.25.42.2.1.7.3"] = [
    name: "hwMacLimitNumRaisingThreshold",
    fields: ["hwBaseTrapSeverity", "hwBaseTrapProbableCause", "hwBaseTrapEventType", "hwMacDynAddressLearnNum", "hwMacLimitMaxMac", "hwL2IfPortName", "hwMacLimitBdId", "hwMacLimitEVPName"],
    fieldOids: ["hwBaseTrapSeverity": "1.3.6.1.4.1.2011.5.25.129.1.1", "hwBaseTrapProbableCause": "1.3.6.1.4.1.2011.5.25.129.1.2", "hwBaseTrapEventType": "1.3.6.1.4.1.2011.5.25.129.1.3", "hwMacDynAddressLearnNum": "1.3.6.1.4.1.2011.5.25.42.2.1.4.1.10", "hwMacLimitMaxMac": "1.3.6.1.4.1.2011.5.25.42.2.1.4.1.4", "hwL2IfPortName": "1.3.6.1.4.1.2011.5.25.42.1.1.1.3.1.19", "hwMacLimitBdId": "1.3.6.1.4.1.2011.5.25.42.2.1.4.1.12", "hwMacLimitEVPName": "1.3.6.1.4.1.2011.5.25.42.2.1.4.1.13"]
]

// --- hwMacLimitNumFallingThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.2.1.7.4
// Fields: hwBaseTrapSeverity, hwBaseTrapProbableCause, hwBaseTrapEventType, hwMacDynAddressLearnNum, hwMacLimitMaxMac, hwL2IfPortName, hwMacLimitBdId, hwMacLimitEVPName
// Description: This object indicates that the number of MAC addresses learned by the interface fell below the upper limit.
trapMap["1.3.6.1.4.1.2011.5.25.42.2.1.7.4"] = [
    name: "hwMacLimitNumFallingThreshold",
    fields: ["hwBaseTrapSeverity", "hwBaseTrapProbableCause", "hwBaseTrapEventType", "hwMacDynAddressLearnNum", "hwMacLimitMaxMac", "hwL2IfPortName", "hwMacLimitBdId", "hwMacLimitEVPName"],
    fieldOids: ["hwBaseTrapSeverity": "1.3.6.1.4.1.2011.5.25.129.1.1", "hwBaseTrapProbableCause": "1.3.6.1.4.1.2011.5.25.129.1.2", "hwBaseTrapEventType": "1.3.6.1.4.1.2011.5.25.129.1.3", "hwMacDynAddressLearnNum": "1.3.6.1.4.1.2011.5.25.42.2.1.4.1.10", "hwMacLimitMaxMac": "1.3.6.1.4.1.2011.5.25.42.2.1.4.1.4", "hwL2IfPortName": "1.3.6.1.4.1.2011.5.25.42.1.1.1.3.1.19", "hwMacLimitBdId": "1.3.6.1.4.1.2011.5.25.42.2.1.4.1.12", "hwMacLimitEVPName": "1.3.6.1.4.1.2011.5.25.42.2.1.4.1.13"]
]

// --- hwUntargetMacNumAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.2.1.7.5
// Fields: hwBaseTrapSeverity, hwBaseTrapProbableCause, hwBaseTrapEventType, hwUntargetMacNum
// Description: Warning of untarget mac-address numbers.
trapMap["1.3.6.1.4.1.2011.5.25.42.2.1.7.5"] = [
    name: "hwUntargetMacNumAlarm",
    fields: ["hwBaseTrapSeverity", "hwBaseTrapProbableCause", "hwBaseTrapEventType", "hwUntargetMacNum"],
    fieldOids: ["hwBaseTrapSeverity": "1.3.6.1.4.1.2011.5.25.129.1.1", "hwBaseTrapProbableCause": "1.3.6.1.4.1.2011.5.25.129.1.2", "hwBaseTrapEventType": "1.3.6.1.4.1.2011.5.25.129.1.3", "hwUntargetMacNum": "1.3.6.1.4.1.2011.5.25.42.2.1.8"]
]

// --- hwPortSecRcvInsecurePktAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.2.1.7.6
// Fields: ifDescr, hwPortSecurityProtectAction
// Description: Alarm of port perform the protect action shutdown or restrict when receiving insecure mac packets in the interface.
trapMap["1.3.6.1.4.1.2011.5.25.42.2.1.7.6"] = [
    name: "hwPortSecRcvInsecurePktAlarm",
    fields: ["ifDescr", "hwPortSecurityProtectAction"],
    fieldOids: ["ifDescr": "1.3.6.1.2.1.2.2.1.2", "hwPortSecurityProtectAction": "1.3.6.1.4.1.2011.5.25.42.2.1.11.1.3"]
]

// --- hwPwMacLimitNumRaisingThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.2.1.7.7
// Fields: hwBaseTrapSeverity, hwBaseTrapProbableCause, hwBaseTrapEventType, hwPwMacDynAddressLearnNum, hwPwMacLimitMaxMac
// Description: This object indicates that the number of MAC addresses learned by the PW reached the upper limit.
trapMap["1.3.6.1.4.1.2011.5.25.42.2.1.7.7"] = [
    name: "hwPwMacLimitNumRaisingThreshold",
    fields: ["hwBaseTrapSeverity", "hwBaseTrapProbableCause", "hwBaseTrapEventType", "hwPwMacDynAddressLearnNum", "hwPwMacLimitMaxMac"],
    fieldOids: ["hwBaseTrapSeverity": "1.3.6.1.4.1.2011.5.25.129.1.1", "hwBaseTrapProbableCause": "1.3.6.1.4.1.2011.5.25.129.1.2", "hwBaseTrapEventType": "1.3.6.1.4.1.2011.5.25.129.1.3", "hwPwMacDynAddressLearnNum": "1.3.6.1.4.1.2011.5.25.42.2.1.19.1.9", "hwPwMacLimitMaxMac": "1.3.6.1.4.1.2011.5.25.42.2.1.19.1.3"]
]

// --- hwPwMacLimitNumFallingThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.2.1.7.8
// Fields: hwBaseTrapSeverity, hwBaseTrapProbableCause, hwBaseTrapEventType, hwPwMacDynAddressLearnNum, hwPwMacLimitMaxMac
// Description: This object indicates that the PW-based MAC address learning trap was cleared.
trapMap["1.3.6.1.4.1.2011.5.25.42.2.1.7.8"] = [
    name: "hwPwMacLimitNumFallingThreshold",
    fields: ["hwBaseTrapSeverity", "hwBaseTrapProbableCause", "hwBaseTrapEventType", "hwPwMacDynAddressLearnNum", "hwPwMacLimitMaxMac"],
    fieldOids: ["hwBaseTrapSeverity": "1.3.6.1.4.1.2011.5.25.129.1.1", "hwBaseTrapProbableCause": "1.3.6.1.4.1.2011.5.25.129.1.2", "hwBaseTrapEventType": "1.3.6.1.4.1.2011.5.25.129.1.3", "hwPwMacDynAddressLearnNum": "1.3.6.1.4.1.2011.5.25.42.2.1.19.1.9", "hwPwMacLimitMaxMac": "1.3.6.1.4.1.2011.5.25.42.2.1.19.1.3"]
]

// --- hwPortStickyReachMaxAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.2.1.7.9
// Description: An alarm is generated when the number of sticky MAC address entries reaches the maximum value.
trapMap["1.3.6.1.4.1.2011.5.25.42.2.1.7.9"] = [
    name: "hwPortStickyReachMaxAlarm",
    fields: [],
    fieldOids: []
]

// --- hwRecIllegalMacPktAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.2.1.7.10
// Fields: hwL2IfPortName
// Description: The MAC addresses that received are illegal.
trapMap["1.3.6.1.4.1.2011.5.25.42.2.1.7.10"] = [
    name: "hwRecIllegalMacPktAlarm",
    fields: ["hwL2IfPortName"],
    fieldOids: ["hwL2IfPortName": "1.3.6.1.4.1.2011.5.25.42.1.1.1.3.1.19"]
]

// --- hwMacLimitOverThresholdAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.2.1.7.11
// Fields: hwBaseTrapSeverity, hwBaseTrapProbableCause, hwBaseTrapEventType, hwMacDynAddressLearnNum, hwMacLimitMaxMac, hwL2IfPortName, hwMacLimitVlanId, hwMacLimitVsiName
// Description: Beyond the mac limited learning number.
trapMap["1.3.6.1.4.1.2011.5.25.42.2.1.7.11"] = [
    name: "hwMacLimitOverThresholdAlarm",
    fields: ["hwBaseTrapSeverity", "hwBaseTrapProbableCause", "hwBaseTrapEventType", "hwMacDynAddressLearnNum", "hwMacLimitMaxMac", "hwL2IfPortName", "hwMacLimitVlanId", "hwMacLimitVsiName"],
    fieldOids: ["hwBaseTrapSeverity": "1.3.6.1.4.1.2011.5.25.129.1.1", "hwBaseTrapProbableCause": "1.3.6.1.4.1.2011.5.25.129.1.2", "hwBaseTrapEventType": "1.3.6.1.4.1.2011.5.25.129.1.3", "hwMacDynAddressLearnNum": "1.3.6.1.4.1.2011.5.25.42.2.1.4.1.10", "hwMacLimitMaxMac": "1.3.6.1.4.1.2011.5.25.42.2.1.4.1.4", "hwL2IfPortName": "1.3.6.1.4.1.2011.5.25.42.1.1.1.3.1.19", "hwMacLimitVlanId": "1.3.6.1.4.1.2011.5.25.42.2.1.4.1.2", "hwMacLimitVsiName": "1.3.6.1.4.1.2011.5.25.42.2.1.4.1.3"]
]

// --- hwMacFlappingAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.2.1.7.12
// Fields: hwBaseTrapSeverity, hwBaseTrapProbableCause, hwBaseTrapEventType, hwMacflappingMac, hwMacFlappingVlan, hwL2IfPortName, hwL2IfPortName, entPhysicalName
// Description: Mac flapping alarm .
trapMap["1.3.6.1.4.1.2011.5.25.42.2.1.7.12"] = [
    name: "hwMacFlappingAlarm",
    fields: ["hwBaseTrapSeverity", "hwBaseTrapProbableCause", "hwBaseTrapEventType", "hwMacflappingMac", "hwMacFlappingVlan", "hwL2IfPortName", "hwL2IfPortName", "entPhysicalName"],
    fieldOids: ["hwBaseTrapSeverity": "1.3.6.1.4.1.2011.5.25.129.1.1", "hwBaseTrapProbableCause": "1.3.6.1.4.1.2011.5.25.129.1.2", "hwBaseTrapEventType": "1.3.6.1.4.1.2011.5.25.129.1.3", "hwMacflappingMac": "1.3.6.1.4.1.2011.5.25.42.2.1.24.1", "hwMacFlappingVlan": "1.3.6.1.4.1.2011.5.25.42.2.1.24.2", "hwL2IfPortName": "1.3.6.1.4.1.2011.5.25.42.1.1.1.3.1.19", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwSlotMacLimitNumRaisingThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.2.1.7.13
// Fields: hwBaseTrapSeverity, hwBaseTrapProbableCause, hwBaseTrapEventType, hwMacDynAddressLearnNum, hwMacLimitMaxMac, entPhysicalName, entPhysicalName
// Description: This object indicates that the number of MAC addresses learned per slot in the upstream direction reached the alarm threshold.
trapMap["1.3.6.1.4.1.2011.5.25.42.2.1.7.13"] = [
    name: "hwSlotMacLimitNumRaisingThreshold",
    fields: ["hwBaseTrapSeverity", "hwBaseTrapProbableCause", "hwBaseTrapEventType", "hwMacDynAddressLearnNum", "hwMacLimitMaxMac", "entPhysicalName", "entPhysicalName"],
    fieldOids: ["hwBaseTrapSeverity": "1.3.6.1.4.1.2011.5.25.129.1.1", "hwBaseTrapProbableCause": "1.3.6.1.4.1.2011.5.25.129.1.2", "hwBaseTrapEventType": "1.3.6.1.4.1.2011.5.25.129.1.3", "hwMacDynAddressLearnNum": "1.3.6.1.4.1.2011.5.25.42.2.1.4.1.10", "hwMacLimitMaxMac": "1.3.6.1.4.1.2011.5.25.42.2.1.4.1.4", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwSlotMacLimitNumFallingThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.2.1.7.14
// Fields: hwBaseTrapSeverity, hwBaseTrapProbableCause, hwBaseTrapEventType, hwMacDynAddressLearnNum, hwMacLimitMaxMac, entPhysicalName, entPhysicalName
// Description: The number of MAC addresses that are learnt based on the SLOT falls below the upper limit.
trapMap["1.3.6.1.4.1.2011.5.25.42.2.1.7.14"] = [
    name: "hwSlotMacLimitNumFallingThreshold",
    fields: ["hwBaseTrapSeverity", "hwBaseTrapProbableCause", "hwBaseTrapEventType", "hwMacDynAddressLearnNum", "hwMacLimitMaxMac", "entPhysicalName", "entPhysicalName"],
    fieldOids: ["hwBaseTrapSeverity": "1.3.6.1.4.1.2011.5.25.129.1.1", "hwBaseTrapProbableCause": "1.3.6.1.4.1.2011.5.25.129.1.2", "hwBaseTrapEventType": "1.3.6.1.4.1.2011.5.25.129.1.3", "hwMacDynAddressLearnNum": "1.3.6.1.4.1.2011.5.25.42.2.1.4.1.10", "hwMacLimitMaxMac": "1.3.6.1.4.1.2011.5.25.42.2.1.4.1.4", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwL2ProtocolTunnelDropThresholdRaising (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.2.1.7.15
// Fields: hwL2ProtocolTunnelTrapPortName, hwL2ProtocolTunnelTrapProtocolName, hwL2ProtocolTunnelTrapDropThreshold
// Description: This object indicates that the number of L2PDUs that were transparently transmitted reached the drop threshold.
trapMap["1.3.6.1.4.1.2011.5.25.42.2.1.7.15"] = [
    name: "hwL2ProtocolTunnelDropThresholdRaising",
    fields: ["hwL2ProtocolTunnelTrapPortName", "hwL2ProtocolTunnelTrapProtocolName", "hwL2ProtocolTunnelTrapDropThreshold"],
    fieldOids: ["hwL2ProtocolTunnelTrapPortName": "1.3.6.1.4.1.2011.5.25.42.2.1.26.1", "hwL2ProtocolTunnelTrapProtocolName": "1.3.6.1.4.1.2011.5.25.42.2.1.26.2", "hwL2ProtocolTunnelTrapDropThreshold": "1.3.6.1.4.1.2011.5.25.42.2.1.26.3"]
]

// --- hwL2ProtocolTunnelDropThresholdFalling (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.2.1.7.16
// Fields: hwL2ProtocolTunnelTrapPortName, hwL2ProtocolTunnelTrapProtocolName, hwL2ProtocolTunnelTrapDropThreshold
// Description: This object indicates that the number of L2PDUs that were transparently transmitted fell below the drop threshold.
trapMap["1.3.6.1.4.1.2011.5.25.42.2.1.7.16"] = [
    name: "hwL2ProtocolTunnelDropThresholdFalling",
    fields: ["hwL2ProtocolTunnelTrapPortName", "hwL2ProtocolTunnelTrapProtocolName", "hwL2ProtocolTunnelTrapDropThreshold"],
    fieldOids: ["hwL2ProtocolTunnelTrapPortName": "1.3.6.1.4.1.2011.5.25.42.2.1.26.1", "hwL2ProtocolTunnelTrapProtocolName": "1.3.6.1.4.1.2011.5.25.42.2.1.26.2", "hwL2ProtocolTunnelTrapDropThreshold": "1.3.6.1.4.1.2011.5.25.42.2.1.26.3"]
]

// --- hwVsiMacLimitNumRaisingThresholdAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.2.1.7.17
// Fields: hwBaseTrapSeverity, hwBaseTrapProbableCause, hwBaseTrapEventType, hwMacLimitVsiName
// Description: The vsi Beyond the mac limited learning number .
trapMap["1.3.6.1.4.1.2011.5.25.42.2.1.7.17"] = [
    name: "hwVsiMacLimitNumRaisingThresholdAlarm",
    fields: ["hwBaseTrapSeverity", "hwBaseTrapProbableCause", "hwBaseTrapEventType", "hwMacLimitVsiName"],
    fieldOids: ["hwBaseTrapSeverity": "1.3.6.1.4.1.2011.5.25.129.1.1", "hwBaseTrapProbableCause": "1.3.6.1.4.1.2011.5.25.129.1.2", "hwBaseTrapEventType": "1.3.6.1.4.1.2011.5.25.129.1.3", "hwMacLimitVsiName": "1.3.6.1.4.1.2011.5.25.42.2.1.4.1.3"]
]

// --- hwVsiMacLimitNumRaisingThresholdAlarmClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.2.1.7.18
// Fields: hwBaseTrapSeverity, hwBaseTrapProbableCause, hwBaseTrapEventType, hwMacLimitVsiName
// Description: The vsi release from the mac limited learning number .
trapMap["1.3.6.1.4.1.2011.5.25.42.2.1.7.18"] = [
    name: "hwVsiMacLimitNumRaisingThresholdAlarmClear",
    fields: ["hwBaseTrapSeverity", "hwBaseTrapProbableCause", "hwBaseTrapEventType", "hwMacLimitVsiName"],
    fieldOids: ["hwBaseTrapSeverity": "1.3.6.1.4.1.2011.5.25.129.1.1", "hwBaseTrapProbableCause": "1.3.6.1.4.1.2011.5.25.129.1.2", "hwBaseTrapEventType": "1.3.6.1.4.1.2011.5.25.129.1.3", "hwMacLimitVsiName": "1.3.6.1.4.1.2011.5.25.42.2.1.4.1.3"]
]

// --- hwMacLimitOverThresholdAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.2.1.7.19
// Fields: hwBaseTrapSeverity, hwBaseTrapProbableCause, hwBaseTrapEventType, hwMacDynAddressLearnNum, hwMacLimitMaxMac, hwL2IfPortName, hwMacLimitVlanId, hwMacLimitVsiName
// Description: Less than the mac limited learning number .
trapMap["1.3.6.1.4.1.2011.5.25.42.2.1.7.19"] = [
    name: "hwMacLimitOverThresholdAlarmResume",
    fields: ["hwBaseTrapSeverity", "hwBaseTrapProbableCause", "hwBaseTrapEventType", "hwMacDynAddressLearnNum", "hwMacLimitMaxMac", "hwL2IfPortName", "hwMacLimitVlanId", "hwMacLimitVsiName"],
    fieldOids: ["hwBaseTrapSeverity": "1.3.6.1.4.1.2011.5.25.129.1.1", "hwBaseTrapProbableCause": "1.3.6.1.4.1.2011.5.25.129.1.2", "hwBaseTrapEventType": "1.3.6.1.4.1.2011.5.25.129.1.3", "hwMacDynAddressLearnNum": "1.3.6.1.4.1.2011.5.25.42.2.1.4.1.10", "hwMacLimitMaxMac": "1.3.6.1.4.1.2011.5.25.42.2.1.4.1.4", "hwL2IfPortName": "1.3.6.1.4.1.2011.5.25.42.1.1.1.3.1.19", "hwMacLimitVlanId": "1.3.6.1.4.1.2011.5.25.42.2.1.4.1.2", "hwMacLimitVsiName": "1.3.6.1.4.1.2011.5.25.42.2.1.4.1.3"]
]

// --- hwSlotMacNumRaisingThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.2.1.7.20
// Fields: hwMacSlotStatistics, hwMacSlotStatisticsSpecify
// Description: This notification indicates the MAC usage of the slot raising the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.42.2.1.7.20"] = [
    name: "hwSlotMacNumRaisingThreshold",
    fields: ["hwMacSlotStatistics", "hwMacSlotStatisticsSpecify"],
    fieldOids: ["hwMacSlotStatistics": "1.3.6.1.4.1.2011.5.25.42.2.1.16.1.2", "hwMacSlotStatisticsSpecify": "1.3.6.1.4.1.2011.5.25.42.2.1.16.1.3"]
]

// --- hwSlotMacNumFallingThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.2.1.7.21
// Fields: hwMacSlotStatistics, hwMacSlotStatisticsSpecify
// Description: This notification indicates the MAC usage of the slot falling the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.42.2.1.7.21"] = [
    name: "hwSlotMacNumFallingThreshold",
    fields: ["hwMacSlotStatistics", "hwMacSlotStatisticsSpecify"],
    fieldOids: ["hwMacSlotStatistics": "1.3.6.1.4.1.2011.5.25.42.2.1.16.1.2", "hwMacSlotStatisticsSpecify": "1.3.6.1.4.1.2011.5.25.42.2.1.16.1.3"]
]

// --- hwMacLimitRuleNumRaisingThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.2.1.7.22
// Fields: entPhysicalName, hwMacRuleDynAddressLearnNum, hwMacLimitRuleMaxMac
// Description: This object indicates that the number of MAC addresses learned by a board reached the MAC address limit specified in a global rule.
trapMap["1.3.6.1.4.1.2011.5.25.42.2.1.7.22"] = [
    name: "hwMacLimitRuleNumRaisingThreshold",
    fields: ["entPhysicalName", "hwMacRuleDynAddressLearnNum", "hwMacLimitRuleMaxMac"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwMacRuleDynAddressLearnNum": "1.3.6.1.4.1.2011.5.25.42.2.1.12.1.52", "hwMacLimitRuleMaxMac": "1.3.6.1.4.1.2011.5.25.42.2.1.12.1.11"]
]

// --- hwMacLimitRuleNumFallingThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.2.1.7.23
// Fields: entPhysicalName, hwMacRuleDynAddressLearnNum, hwMacLimitRuleMaxMac
// Description: This object indicates that the number of MAC addresses learned by a board fell below the MAC address limit specified in a global rule.
trapMap["1.3.6.1.4.1.2011.5.25.42.2.1.7.23"] = [
    name: "hwMacLimitRuleNumFallingThreshold",
    fields: ["entPhysicalName", "hwMacRuleDynAddressLearnNum", "hwMacLimitRuleMaxMac"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwMacRuleDynAddressLearnNum": "1.3.6.1.4.1.2011.5.25.42.2.1.12.1.52", "hwMacLimitRuleMaxMac": "1.3.6.1.4.1.2011.5.25.42.2.1.12.1.11"]
]

// --- hwVplsOverGRENotSupportForwardRising (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.2.1.7.24
// Fields: hwVplsOverGreVsiName, hwRemoteIp
// Description: The public network tunnel used to carry the VPLS PW is a GRE tunnel and the VPLS PW cannot forward traffic.
trapMap["1.3.6.1.4.1.2011.5.25.42.2.1.7.24"] = [
    name: "hwVplsOverGRENotSupportForwardRising",
    fields: ["hwVplsOverGreVsiName", "hwRemoteIp"],
    fieldOids: ["hwVplsOverGreVsiName": "1.3.6.1.4.1.2011.5.25.42.2.1.35.1.3", "hwRemoteIp": "1.3.6.1.4.1.2011.5.25.42.2.1.35.1.2"]
]

// --- hwVplsOverGRENotSupportForwardRisingResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.2.1.7.25
// Fields: hwVplsOverGreVsiName, hwRemoteIp
// Description: The public network tunnel used to carry the VPLS PW is a non-GRE tunnel and the VPLS PW can forward traffic again.
trapMap["1.3.6.1.4.1.2011.5.25.42.2.1.7.25"] = [
    name: "hwVplsOverGRENotSupportForwardRisingResume",
    fields: ["hwVplsOverGreVsiName", "hwRemoteIp"],
    fieldOids: ["hwVplsOverGreVsiName": "1.3.6.1.4.1.2011.5.25.42.2.1.35.1.3", "hwRemoteIp": "1.3.6.1.4.1.2011.5.25.42.2.1.35.1.2"]
]

// --- hwIfInputUnucFlowRisingThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.2.1.7.28
// Fields: hwUNUCPortName, hwUNUCPortAlarmThreshold, hwUNUCPortRealFlow
// Description: This object indicates that the unknown unicast traffic volume on the inbound interface exceeded the alarm threshold.
trapMap["1.3.6.1.4.1.2011.5.25.42.2.1.7.28"] = [
    name: "hwIfInputUnucFlowRisingThreshold",
    fields: ["hwUNUCPortName", "hwUNUCPortAlarmThreshold", "hwUNUCPortRealFlow"],
    fieldOids: ["hwUNUCPortName": "1.3.6.1.4.1.2011.5.25.42.2.1.37.1.2", "hwUNUCPortAlarmThreshold": "1.3.6.1.4.1.2011.5.25.42.2.1.37.1.3", "hwUNUCPortRealFlow": "1.3.6.1.4.1.2011.5.25.42.2.1.37.1.4"]
]

// --- hwIfInputUnucFlowFallingThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.2.1.7.29
// Fields: hwUNUCPortName, hwUNUCPortAlarmThreshold, hwUNUCPortRealFlow
// Description: This object indicates that the unknown unicast traffic volume on the inbound interface fell below the alarm threshold.
trapMap["1.3.6.1.4.1.2011.5.25.42.2.1.7.29"] = [
    name: "hwIfInputUnucFlowFallingThreshold",
    fields: ["hwUNUCPortName", "hwUNUCPortAlarmThreshold", "hwUNUCPortRealFlow"],
    fieldOids: ["hwUNUCPortName": "1.3.6.1.4.1.2011.5.25.42.2.1.37.1.2", "hwUNUCPortAlarmThreshold": "1.3.6.1.4.1.2011.5.25.42.2.1.37.1.3", "hwUNUCPortRealFlow": "1.3.6.1.4.1.2011.5.25.42.2.1.37.1.4"]
]

// --- hwMacHopAlarmRaisingThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.2.1.7.30
// Fields: hwMacHopVlan, hwMacHopVsiName, hwMacHopBdID, hwMacHopPortName1, hwMacHopPortName2, hwMacHopPortName3, hwMacHopPortName4, hwMacHopPWInfo, hwMacHopDetectMac, hwMacHopTrustPort, hwMacHopTrustPeer
// Description: This object indicates the MAC address flapping alarm.
trapMap["1.3.6.1.4.1.2011.5.25.42.2.1.7.30"] = [
    name: "hwMacHopAlarmRaisingThreshold",
    fields: ["hwMacHopVlan", "hwMacHopVsiName", "hwMacHopBdID", "hwMacHopPortName1", "hwMacHopPortName2", "hwMacHopPortName3", "hwMacHopPortName4", "hwMacHopPWInfo", "hwMacHopDetectMac", "hwMacHopTrustPort", "hwMacHopTrustPeer"],
    fieldOids: ["hwMacHopVlan": "1.3.6.1.4.1.2011.5.25.42.2.1.38.1.1", "hwMacHopVsiName": "1.3.6.1.4.1.2011.5.25.42.2.1.38.1.2", "hwMacHopBdID": "1.3.6.1.4.1.2011.5.25.42.2.1.38.1.3", "hwMacHopPortName1": "1.3.6.1.4.1.2011.5.25.42.2.1.38.1.4", "hwMacHopPortName2": "1.3.6.1.4.1.2011.5.25.42.2.1.38.1.5", "hwMacHopPortName3": "1.3.6.1.4.1.2011.5.25.42.2.1.38.1.6", "hwMacHopPortName4": "1.3.6.1.4.1.2011.5.25.42.2.1.38.1.7", "hwMacHopPWInfo": "1.3.6.1.4.1.2011.5.25.42.2.1.38.1.8", "hwMacHopDetectMac": "1.3.6.1.4.1.2011.5.25.42.2.1.38.1.9", "hwMacHopTrustPort": "1.3.6.1.4.1.2011.5.25.42.2.1.38.1.10", "hwMacHopTrustPeer": "1.3.6.1.4.1.2011.5.25.42.2.1.38.1.11"]
]

// --- hwMacHopAlarmFallingThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.2.1.7.31
// Fields: hwMacHopVlan, hwMacHopVsiName, hwMacHopBdID
// Description: This object indicates that the MAC address flapping alarm is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.42.2.1.7.31"] = [
    name: "hwMacHopAlarmFallingThreshold",
    fields: ["hwMacHopVlan", "hwMacHopVsiName", "hwMacHopBdID"],
    fieldOids: ["hwMacHopVlan": "1.3.6.1.4.1.2011.5.25.42.2.1.38.1.1", "hwMacHopVsiName": "1.3.6.1.4.1.2011.5.25.42.2.1.38.1.2", "hwMacHopBdID": "1.3.6.1.4.1.2011.5.25.42.2.1.38.1.3"]
]

// --- hwPstBroadcastLostAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.2.1.7.32
// Fields: entPhysicalIndex, entPhysicalName
// Description: This object indicates the alarm that a board does not receive PST broadcast packets from other boards within one minute.
trapMap["1.3.6.1.4.1.2011.5.25.42.2.1.7.32"] = [
    name: "hwPstBroadcastLostAlarm",
    fields: ["entPhysicalIndex", "entPhysicalName"],
    fieldOids: ["entPhysicalIndex": "1.3.6.1.2.1.47.1.1.1.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwPstBroadcastLostResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.2.1.7.33
// Fields: entPhysicalIndex, entPhysicalName
// Description: This object indicates that the board receives PST broadcast packets from other boards within one minute and the alarm is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.42.2.1.7.33"] = [
    name: "hwPstBroadcastLostResume",
    fields: ["entPhysicalIndex", "entPhysicalName"],
    fieldOids: ["entPhysicalIndex": "1.3.6.1.2.1.47.1.1.1.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwPwMacSpoofingAttackAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.2.1.7.34
// Fields: hwVplsVsiName, entPhysicalName, hwPwMacSpoofingAttackMacAddr
// Description: A PW received MAC spoofing packets from an interface.
trapMap["1.3.6.1.4.1.2011.5.25.42.2.1.7.34"] = [
    name: "hwPwMacSpoofingAttackAlarm",
    fields: ["hwVplsVsiName", "entPhysicalName", "hwPwMacSpoofingAttackMacAddr"],
    fieldOids: ["hwVplsVsiName": "1.3.6.1.4.1.2011.5.25.119.1.1.1.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwPwMacSpoofingAttackMacAddr": "1.3.6.1.4.1.2011.5.25.42.2.1.39"]
]

// --- hwPwMacSpoofingAttackAlarmClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.2.1.7.35
// Fields: hwVplsVsiName, entPhysicalName
// Description: The alarm indicating that a PW received MAC spoofing packets from an interface was cleared.
trapMap["1.3.6.1.4.1.2011.5.25.42.2.1.7.35"] = [
    name: "hwPwMacSpoofingAttackAlarmClear",
    fields: ["hwVplsVsiName", "entPhysicalName"],
    fieldOids: ["hwVplsVsiName": "1.3.6.1.4.1.2011.5.25.119.1.1.1.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwBdMacLimitOverThresholdAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.2.1.7.36
// Fields: hwBdMacLimitBdId, hwBdMacLimitMaxMac
// Description: Beyond the mac limited learning number.
trapMap["1.3.6.1.4.1.2011.5.25.42.2.1.7.36"] = [
    name: "hwBdMacLimitOverThresholdAlarm",
    fields: ["hwBdMacLimitBdId", "hwBdMacLimitMaxMac"],
    fieldOids: ["hwBdMacLimitBdId": "1.3.6.1.4.1.2011.5.25.42.2.1.40", "hwBdMacLimitMaxMac": "1.3.6.1.4.1.2011.5.25.42.2.1.41"]
]

// --- hwBdMacLimitOverThresholdAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.2.1.7.37
// Fields: hwBdMacLimitBdId, hwBdMacLimitMaxMac
// Description: Less than the mac limited learning number.
trapMap["1.3.6.1.4.1.2011.5.25.42.2.1.7.37"] = [
    name: "hwBdMacLimitOverThresholdAlarmResume",
    fields: ["hwBdMacLimitBdId", "hwBdMacLimitMaxMac"],
    fieldOids: ["hwBdMacLimitBdId": "1.3.6.1.4.1.2011.5.25.42.2.1.40", "hwBdMacLimitMaxMac": "1.3.6.1.4.1.2011.5.25.42.2.1.41"]
]

// --- hwPWOverLdpOverGRENotSupportForwardAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.2.1.7.38
// Fields: hwVplsOverLdpOverGreVsiName, hwPeerRemoteIp, hwEvpnOverLdpOverGreEvpnName
// Description: The public network tunnel used to carry the VPLS PW or EVPN is a LDP over GRE tunnel and the VPLS PW or EVPN cannot forward traffic.
trapMap["1.3.6.1.4.1.2011.5.25.42.2.1.7.38"] = [
    name: "hwPWOverLdpOverGRENotSupportForwardAlarm",
    fields: ["hwVplsOverLdpOverGreVsiName", "hwPeerRemoteIp", "hwEvpnOverLdpOverGreEvpnName"],
    fieldOids: ["hwVplsOverLdpOverGreVsiName": "1.3.6.1.4.1.2011.5.25.42.2.1.42.1.3", "hwPeerRemoteIp": "1.3.6.1.4.1.2011.5.25.42.2.1.42.1.2", "hwEvpnOverLdpOverGreEvpnName": "1.3.6.1.4.1.2011.5.25.42.2.1.42.1.4"]
]

// --- hwPWOverLdpOverGRENotSupportForwardResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.2.1.7.39
// Fields: hwVplsOverLdpOverGreVsiName, hwPeerRemoteIp, hwEvpnOverLdpOverGreEvpnName
// Description: The public network tunnel used to carry the VPLS PW or EVPN is a not a LDP over GRE tunnel.
trapMap["1.3.6.1.4.1.2011.5.25.42.2.1.7.39"] = [
    name: "hwPWOverLdpOverGRENotSupportForwardResume",
    fields: ["hwVplsOverLdpOverGreVsiName", "hwPeerRemoteIp", "hwEvpnOverLdpOverGreEvpnName"],
    fieldOids: ["hwVplsOverLdpOverGreVsiName": "1.3.6.1.4.1.2011.5.25.42.2.1.42.1.3", "hwPeerRemoteIp": "1.3.6.1.4.1.2011.5.25.42.2.1.42.1.2", "hwEvpnOverLdpOverGreEvpnName": "1.3.6.1.4.1.2011.5.25.42.2.1.42.1.4"]
]

// --- hwPwSourceTunnelCheckAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.2.1.7.40
// Fields: hwPwLabel, hwTeLabel, hwPortName
// Description: This object indicates that packets are dropped because they do not match the PW's source tunnel check.
trapMap["1.3.6.1.4.1.2011.5.25.42.2.1.7.40"] = [
    name: "hwPwSourceTunnelCheckAlarm",
    fields: ["hwPwLabel", "hwTeLabel", "hwPortName"],
    fieldOids: ["hwPwLabel": "1.3.6.1.4.1.2011.5.25.42.2.1.43.1.1", "hwTeLabel": "1.3.6.1.4.1.2011.5.25.42.2.1.43.1.2", "hwPortName": "1.3.6.1.4.1.2011.5.25.42.2.1.43.1.3"]
]

// --- hwPwSourceTunnelCheckResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.2.1.7.41
// Fields: hwPwLabel, hwTeLabel, hwPortName
// Description: This object indicates that all packets match during the PW's source tunnel check.
trapMap["1.3.6.1.4.1.2011.5.25.42.2.1.7.41"] = [
    name: "hwPwSourceTunnelCheckResume",
    fields: ["hwPwLabel", "hwTeLabel", "hwPortName"],
    fieldOids: ["hwPwLabel": "1.3.6.1.4.1.2011.5.25.42.2.1.43.1.1", "hwTeLabel": "1.3.6.1.4.1.2011.5.25.42.2.1.43.1.2", "hwPortName": "1.3.6.1.4.1.2011.5.25.42.2.1.43.1.3"]
]

// --- hwPwSourceTunnelNoTeCheckAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.2.1.7.42
// Fields: hwPwLabel, hwPortName
// Description: This object indicates that packets are discarded because they do not match the PW's source tunnel check and the packets do not carry public network labels.
trapMap["1.3.6.1.4.1.2011.5.25.42.2.1.7.42"] = [
    name: "hwPwSourceTunnelNoTeCheckAlarm",
    fields: ["hwPwLabel", "hwPortName"],
    fieldOids: ["hwPwLabel": "1.3.6.1.4.1.2011.5.25.42.2.1.43.1.1", "hwPortName": "1.3.6.1.4.1.2011.5.25.42.2.1.43.1.3"]
]

// --- hwPwSourceTunnelNoTeCheckResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.2.1.7.43
// Fields: hwPwLabel, hwPortName
// Description: This object indicates that all packets match during the PW's source tunnel check.
trapMap["1.3.6.1.4.1.2011.5.25.42.2.1.7.43"] = [
    name: "hwPwSourceTunnelNoTeCheckResume",
    fields: ["hwPwLabel", "hwPortName"],
    fieldOids: ["hwPwLabel": "1.3.6.1.4.1.2011.5.25.42.2.1.43.1.1", "hwPortName": "1.3.6.1.4.1.2011.5.25.42.2.1.43.1.3"]
]

// --- hwBoardServiceMisMatchGenerate (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.2.1.7.44
// Fields: entPhysicalIndex, entPhysicalName, hwBoardServiceMisMatchServiceName, hwBoardServiceMisMatchPrecautions
// Description: This object indicates the alarm that the board does not support this service.
trapMap["1.3.6.1.4.1.2011.5.25.42.2.1.7.44"] = [
    name: "hwBoardServiceMisMatchGenerate",
    fields: ["entPhysicalIndex", "entPhysicalName", "hwBoardServiceMisMatchServiceName", "hwBoardServiceMisMatchPrecautions"],
    fieldOids: ["entPhysicalIndex": "1.3.6.1.2.1.47.1.1.1.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwBoardServiceMisMatchServiceName": "1.3.6.1.4.1.2011.5.25.42.2.1.44.1.1", "hwBoardServiceMisMatchPrecautions": "1.3.6.1.4.1.2011.5.25.42.2.1.44.1.2"]
]

// --- hwBoardServiceMisMatchCancel (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.2.1.7.45
// Fields: entPhysicalIndex, entPhysicalName, hwBoardServiceMisMatchServiceName
// Description: This object indicates that the unsupported service is removed or the non-supportive board is replaced.
trapMap["1.3.6.1.4.1.2011.5.25.42.2.1.7.45"] = [
    name: "hwBoardServiceMisMatchCancel",
    fields: ["entPhysicalIndex", "entPhysicalName", "hwBoardServiceMisMatchServiceName"],
    fieldOids: ["entPhysicalIndex": "1.3.6.1.2.1.47.1.1.1.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwBoardServiceMisMatchServiceName": "1.3.6.1.4.1.2011.5.25.42.2.1.44.1.1"]
]

// --- hwEVPNNotSupportTunnelAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.2.1.7.46
// Fields: hwEVPNPeerRemoteIp, hwNotSupportTunnelEvpnName, hwNotSupportTunnelType
// Description: This object indicates the alarm that the EVPN public network does not support traffic forwarding.
trapMap["1.3.6.1.4.1.2011.5.25.42.2.1.7.46"] = [
    name: "hwEVPNNotSupportTunnelAlarm",
    fields: ["hwEVPNPeerRemoteIp", "hwNotSupportTunnelEvpnName", "hwNotSupportTunnelType"],
    fieldOids: ["hwEVPNPeerRemoteIp": "1.3.6.1.4.1.2011.5.25.42.2.1.45.1.1", "hwNotSupportTunnelEvpnName": "1.3.6.1.4.1.2011.5.25.42.2.1.45.1.2", "hwNotSupportTunnelType": "1.3.6.1.4.1.2011.5.25.42.2.1.47"]
]

// --- hwEVPNNotSupportTunnelAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.2.1.7.47
// Fields: hwEVPNPeerRemoteIp, hwNotSupportTunnelEvpnName, hwNotSupportTunnelType
// Description: This object indicates that the EVPN public network supports traffic forwarding and the alarm is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.42.2.1.7.47"] = [
    name: "hwEVPNNotSupportTunnelAlarmResume",
    fields: ["hwEVPNPeerRemoteIp", "hwNotSupportTunnelEvpnName", "hwNotSupportTunnelType"],
    fieldOids: ["hwEVPNPeerRemoteIp": "1.3.6.1.4.1.2011.5.25.42.2.1.45.1.1", "hwNotSupportTunnelEvpnName": "1.3.6.1.4.1.2011.5.25.42.2.1.45.1.2", "hwNotSupportTunnelType": "1.3.6.1.4.1.2011.5.25.42.2.1.47"]
]

// --- hwVPLSNotSupportTunnelAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.2.1.7.48
// Fields: hwNotSupportTunnelPwId, hwPWPeerRemoteIp, hwNotSupportTunnelVSIName, hwNotSupportTunnelType
// Description: This object indicates the alarm that the VPLS public network does not support traffic forwarding.
trapMap["1.3.6.1.4.1.2011.5.25.42.2.1.7.48"] = [
    name: "hwVPLSNotSupportTunnelAlarm",
    fields: ["hwNotSupportTunnelPwId", "hwPWPeerRemoteIp", "hwNotSupportTunnelVSIName", "hwNotSupportTunnelType"],
    fieldOids: ["hwNotSupportTunnelPwId": "1.3.6.1.4.1.2011.5.25.42.2.1.46.1.1", "hwPWPeerRemoteIp": "1.3.6.1.4.1.2011.5.25.42.2.1.46.1.2", "hwNotSupportTunnelVSIName": "1.3.6.1.4.1.2011.5.25.42.2.1.46.1.3", "hwNotSupportTunnelType": "1.3.6.1.4.1.2011.5.25.42.2.1.47"]
]

// --- hwVPLSNotSupportTunnelAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.2.1.7.49
// Fields: hwNotSupportTunnelPwId, hwPWPeerRemoteIp, hwNotSupportTunnelVSIName, hwNotSupportTunnelType
// Description: This object indicates that the VPLS public network supports traffic forwarding and the alarm is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.42.2.1.7.49"] = [
    name: "hwVPLSNotSupportTunnelAlarmResume",
    fields: ["hwNotSupportTunnelPwId", "hwPWPeerRemoteIp", "hwNotSupportTunnelVSIName", "hwNotSupportTunnelType"],
    fieldOids: ["hwNotSupportTunnelPwId": "1.3.6.1.4.1.2011.5.25.42.2.1.46.1.1", "hwPWPeerRemoteIp": "1.3.6.1.4.1.2011.5.25.42.2.1.46.1.2", "hwNotSupportTunnelVSIName": "1.3.6.1.4.1.2011.5.25.42.2.1.46.1.3", "hwNotSupportTunnelType": "1.3.6.1.4.1.2011.5.25.42.2.1.47"]
]

// --- hwServiceNotSupportNodeSrteLoadBanlance (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.2.1.7.50
// Fields: hwNodeSrteTunnelName, hwNodeSrteServiceName
// Description: This object indicates the alarm that traffic for the service cannot be balanced over node SR TE tunnels.
trapMap["1.3.6.1.4.1.2011.5.25.42.2.1.7.50"] = [
    name: "hwServiceNotSupportNodeSrteLoadBanlance",
    fields: ["hwNodeSrteTunnelName", "hwNodeSrteServiceName"],
    fieldOids: ["hwNodeSrteTunnelName": "1.3.6.1.4.1.2011.5.25.42.2.1.51.1.1", "hwNodeSrteServiceName": "1.3.6.1.4.1.2011.5.25.42.2.1.51.1.2"]
]

// --- hwVplsPwHqosNotSupportTunnelAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.2.1.7.51
// Fields: hwNotSupportTunnelVSIName, hwPWPeerRemoteIp, hwNotSupportTunnelPwId, hwNotSupportTunnelType
// Description: This object indicates that the VPLS PW HQoS service does not support the current public network tunnel.
trapMap["1.3.6.1.4.1.2011.5.25.42.2.1.7.51"] = [
    name: "hwVplsPwHqosNotSupportTunnelAlarm",
    fields: ["hwNotSupportTunnelVSIName", "hwPWPeerRemoteIp", "hwNotSupportTunnelPwId", "hwNotSupportTunnelType"],
    fieldOids: ["hwNotSupportTunnelVSIName": "1.3.6.1.4.1.2011.5.25.42.2.1.46.1.3", "hwPWPeerRemoteIp": "1.3.6.1.4.1.2011.5.25.42.2.1.46.1.2", "hwNotSupportTunnelPwId": "1.3.6.1.4.1.2011.5.25.42.2.1.46.1.1", "hwNotSupportTunnelType": "1.3.6.1.4.1.2011.5.25.42.2.1.47"]
]

// --- hwVplsPwHqosNotSupportTunnelAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.2.1.7.52
// Fields: hwNotSupportTunnelVSIName, hwPWPeerRemoteIp, hwNotSupportTunnelPwId, hwNotSupportTunnelType
// Description: This object indicates that the VPLS PW HQoS service supports the current public network tunnel.
trapMap["1.3.6.1.4.1.2011.5.25.42.2.1.7.52"] = [
    name: "hwVplsPwHqosNotSupportTunnelAlarmResume",
    fields: ["hwNotSupportTunnelVSIName", "hwPWPeerRemoteIp", "hwNotSupportTunnelPwId", "hwNotSupportTunnelType"],
    fieldOids: ["hwNotSupportTunnelVSIName": "1.3.6.1.4.1.2011.5.25.42.2.1.46.1.3", "hwPWPeerRemoteIp": "1.3.6.1.4.1.2011.5.25.42.2.1.46.1.2", "hwNotSupportTunnelPwId": "1.3.6.1.4.1.2011.5.25.42.2.1.46.1.1", "hwNotSupportTunnelType": "1.3.6.1.4.1.2011.5.25.42.2.1.47"]
]

// --- hwPbbEvpnNotSupportTunnelAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.2.1.7.53
// Fields: hwEVPNPeerRemoteIp, hwNotSupportTunnelEvpnName, hwNotSupportTunnelType
// Description: This object indicates the alarm that the PBB EVPN public network does not support traffic forwarding.
trapMap["1.3.6.1.4.1.2011.5.25.42.2.1.7.53"] = [
    name: "hwPbbEvpnNotSupportTunnelAlarm",
    fields: ["hwEVPNPeerRemoteIp", "hwNotSupportTunnelEvpnName", "hwNotSupportTunnelType"],
    fieldOids: ["hwEVPNPeerRemoteIp": "1.3.6.1.4.1.2011.5.25.42.2.1.45.1.1", "hwNotSupportTunnelEvpnName": "1.3.6.1.4.1.2011.5.25.42.2.1.45.1.2", "hwNotSupportTunnelType": "1.3.6.1.4.1.2011.5.25.42.2.1.47"]
]

// --- hwPbbEvpnNotSupportTunnelAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.2.1.7.54
// Fields: hwEVPNPeerRemoteIp, hwNotSupportTunnelEvpnName, hwNotSupportTunnelType
// Description: This object indicates that the PBB EVPN public network supports traffic forwarding and the alarm is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.42.2.1.7.54"] = [
    name: "hwPbbEvpnNotSupportTunnelAlarmResume",
    fields: ["hwEVPNPeerRemoteIp", "hwNotSupportTunnelEvpnName", "hwNotSupportTunnelType"],
    fieldOids: ["hwEVPNPeerRemoteIp": "1.3.6.1.4.1.2011.5.25.42.2.1.45.1.1", "hwNotSupportTunnelEvpnName": "1.3.6.1.4.1.2011.5.25.42.2.1.45.1.2", "hwNotSupportTunnelType": "1.3.6.1.4.1.2011.5.25.42.2.1.47"]
]

// --- hwVllVpnQosNotSupportTunnelAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.2.1.7.55
// Fields: hwVLLACIfName, hwVLLPeerRemoteIp, hwNotSupportTunnelType
// Description: The public network tunnel used to carry the VLL cannot forward traffic.
trapMap["1.3.6.1.4.1.2011.5.25.42.2.1.7.55"] = [
    name: "hwVllVpnQosNotSupportTunnelAlarm",
    fields: ["hwVLLACIfName", "hwVLLPeerRemoteIp", "hwNotSupportTunnelType"],
    fieldOids: ["hwVLLACIfName": "1.3.6.1.4.1.2011.5.25.42.2.1.52.1.1", "hwVLLPeerRemoteIp": "1.3.6.1.4.1.2011.5.25.42.2.1.52.1.2", "hwNotSupportTunnelType": "1.3.6.1.4.1.2011.5.25.42.2.1.47"]
]

// --- hwVllVpnQosNotSupportTunnelAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.2.1.7.56
// Fields: hwVLLACIfName, hwVLLPeerRemoteIp, hwNotSupportTunnelType
// Description: The public network tunnel used to carry the VLL support forwarded traffic successfully.
trapMap["1.3.6.1.4.1.2011.5.25.42.2.1.7.56"] = [
    name: "hwVllVpnQosNotSupportTunnelAlarmResume",
    fields: ["hwVLLACIfName", "hwVLLPeerRemoteIp", "hwNotSupportTunnelType"],
    fieldOids: ["hwVLLACIfName": "1.3.6.1.4.1.2011.5.25.42.2.1.52.1.1", "hwVLLPeerRemoteIp": "1.3.6.1.4.1.2011.5.25.42.2.1.52.1.2", "hwNotSupportTunnelType": "1.3.6.1.4.1.2011.5.25.42.2.1.47"]
]

// --- hwVllVpnQosOverTunnelAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.2.1.7.57
// Fields: hwVLLACIfName, hwVLLPeerRemoteIp, hwNotSupportTunnelType
// Description: VLL VPN QoS services are not supported on the public network tunnel.
trapMap["1.3.6.1.4.1.2011.5.25.42.2.1.7.57"] = [
    name: "hwVllVpnQosOverTunnelAlarm",
    fields: ["hwVLLACIfName", "hwVLLPeerRemoteIp", "hwNotSupportTunnelType"],
    fieldOids: ["hwVLLACIfName": "1.3.6.1.4.1.2011.5.25.42.2.1.52.1.1", "hwVLLPeerRemoteIp": "1.3.6.1.4.1.2011.5.25.42.2.1.52.1.2", "hwNotSupportTunnelType": "1.3.6.1.4.1.2011.5.25.42.2.1.47"]
]

// --- hwVllVpnQosOverTunnelAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.2.1.7.58
// Fields: hwVLLACIfName, hwVLLPeerRemoteIp, hwNotSupportTunnelType
// Description: VLL VPN QoS services are supported on the public network tunnel.
trapMap["1.3.6.1.4.1.2011.5.25.42.2.1.7.58"] = [
    name: "hwVllVpnQosOverTunnelAlarmResume",
    fields: ["hwVLLACIfName", "hwVLLPeerRemoteIp", "hwNotSupportTunnelType"],
    fieldOids: ["hwVLLACIfName": "1.3.6.1.4.1.2011.5.25.42.2.1.52.1.1", "hwVLLPeerRemoteIp": "1.3.6.1.4.1.2011.5.25.42.2.1.52.1.2", "hwNotSupportTunnelType": "1.3.6.1.4.1.2011.5.25.42.2.1.47"]
]

// --- hwBroadcastDomainElbAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.2.1.7.59
// Fields: hwMacLimitVlanId, hwMacLimitBdId, hwVplsVsiName, hwMacLimitEVPName
// Description: The number of broadcast domain leaves exceeded the limit.
trapMap["1.3.6.1.4.1.2011.5.25.42.2.1.7.59"] = [
    name: "hwBroadcastDomainElbAlarm",
    fields: ["hwMacLimitVlanId", "hwMacLimitBdId", "hwVplsVsiName", "hwMacLimitEVPName"],
    fieldOids: ["hwMacLimitVlanId": "1.3.6.1.4.1.2011.5.25.42.2.1.4.1.2", "hwMacLimitBdId": "1.3.6.1.4.1.2011.5.25.42.2.1.4.1.12", "hwVplsVsiName": "1.3.6.1.4.1.2011.5.25.119.1.1.1.1.1", "hwMacLimitEVPName": "1.3.6.1.4.1.2011.5.25.42.2.1.4.1.13"]
]

// --- hwBroadcastDomainElbAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.2.1.7.60
// Fields: hwMacLimitVlanId, hwMacLimitBdId, hwVplsVsiName, hwMacLimitEVPName
// Description: The number of broadcast domain leaves fell below the limit.
trapMap["1.3.6.1.4.1.2011.5.25.42.2.1.7.60"] = [
    name: "hwBroadcastDomainElbAlarmResume",
    fields: ["hwMacLimitVlanId", "hwMacLimitBdId", "hwVplsVsiName", "hwMacLimitEVPName"],
    fieldOids: ["hwMacLimitVlanId": "1.3.6.1.4.1.2011.5.25.42.2.1.4.1.2", "hwMacLimitBdId": "1.3.6.1.4.1.2011.5.25.42.2.1.4.1.12", "hwVplsVsiName": "1.3.6.1.4.1.2011.5.25.119.1.1.1.1.1", "hwMacLimitEVPName": "1.3.6.1.4.1.2011.5.25.42.2.1.4.1.13"]
]

// --- hwL2DomainMacLimitNumRaisingThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.2.1.7.61
// Fields: hwBaseTrapSeverity, hwBaseTrapProbableCause, hwBaseTrapEventType, entPhysicalName, hwMacLimitAlarmDynNum, hwMacLimitAlarmMaxMac, hwMacLimitAlarmUpthreshold, hwMacLimitAlarmDownthreshold
// Description: The number of MAC addresses learned reached the upper threshold.
trapMap["1.3.6.1.4.1.2011.5.25.42.2.1.7.61"] = [
    name: "hwL2DomainMacLimitNumRaisingThreshold",
    fields: ["hwBaseTrapSeverity", "hwBaseTrapProbableCause", "hwBaseTrapEventType", "entPhysicalName", "hwMacLimitAlarmDynNum", "hwMacLimitAlarmMaxMac", "hwMacLimitAlarmUpthreshold", "hwMacLimitAlarmDownthreshold"],
    fieldOids: ["hwBaseTrapSeverity": "1.3.6.1.4.1.2011.5.25.129.1.1", "hwBaseTrapProbableCause": "1.3.6.1.4.1.2011.5.25.129.1.2", "hwBaseTrapEventType": "1.3.6.1.4.1.2011.5.25.129.1.3", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwMacLimitAlarmDynNum": "1.3.6.1.4.1.2011.5.25.42.2.1.53.1.5", "hwMacLimitAlarmMaxMac": "1.3.6.1.4.1.2011.5.25.42.2.1.53.1.6", "hwMacLimitAlarmUpthreshold": "1.3.6.1.4.1.2011.5.25.42.2.1.53.1.7", "hwMacLimitAlarmDownthreshold": "1.3.6.1.4.1.2011.5.25.42.2.1.53.1.8"]
]

// --- hwL2DomainMacLimitNumFallingThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.2.1.7.62
// Fields: hwBaseTrapSeverity, hwBaseTrapProbableCause, hwBaseTrapEventType, entPhysicalName, hwMacLimitAlarmDynNum, hwMacLimitAlarmMaxMac, hwMacLimitAlarmUpthreshold, hwMacLimitAlarmDownthreshold
// Description: The MAC address learning trap was cleared.
trapMap["1.3.6.1.4.1.2011.5.25.42.2.1.7.62"] = [
    name: "hwL2DomainMacLimitNumFallingThreshold",
    fields: ["hwBaseTrapSeverity", "hwBaseTrapProbableCause", "hwBaseTrapEventType", "entPhysicalName", "hwMacLimitAlarmDynNum", "hwMacLimitAlarmMaxMac", "hwMacLimitAlarmUpthreshold", "hwMacLimitAlarmDownthreshold"],
    fieldOids: ["hwBaseTrapSeverity": "1.3.6.1.4.1.2011.5.25.129.1.1", "hwBaseTrapProbableCause": "1.3.6.1.4.1.2011.5.25.129.1.2", "hwBaseTrapEventType": "1.3.6.1.4.1.2011.5.25.129.1.3", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwMacLimitAlarmDynNum": "1.3.6.1.4.1.2011.5.25.42.2.1.53.1.5", "hwMacLimitAlarmMaxMac": "1.3.6.1.4.1.2011.5.25.42.2.1.53.1.6", "hwMacLimitAlarmUpthreshold": "1.3.6.1.4.1.2011.5.25.42.2.1.53.1.7", "hwMacLimitAlarmDownthreshold": "1.3.6.1.4.1.2011.5.25.42.2.1.53.1.8"]
]

// --- hwVxlanTunnelMacLimitOverThresholdAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.2.1.7.63
// Fields: hwVxlanTnlMacLimitSourceIp, hwVxlanTnlMacLimitPeerIp, hwVxlanTnlMacLimitMaxMac
// Description: Beyond the mac limited learning number.
trapMap["1.3.6.1.4.1.2011.5.25.42.2.1.7.63"] = [
    name: "hwVxlanTunnelMacLimitOverThresholdAlarm",
    fields: ["hwVxlanTnlMacLimitSourceIp", "hwVxlanTnlMacLimitPeerIp", "hwVxlanTnlMacLimitMaxMac"],
    fieldOids: ["hwVxlanTnlMacLimitSourceIp": "1.3.6.1.4.1.2011.5.25.42.2.1.54", "hwVxlanTnlMacLimitPeerIp": "1.3.6.1.4.1.2011.5.25.42.2.1.55", "hwVxlanTnlMacLimitMaxMac": "1.3.6.1.4.1.2011.5.25.42.2.1.56"]
]

// --- hwVxlanTunnelMacLimitOverThresholdAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.2.1.7.64
// Fields: hwVxlanTnlMacLimitSourceIp, hwVxlanTnlMacLimitPeerIp, hwVxlanTnlMacLimitMaxMac
// Description: Less than the mac limited learning number.
trapMap["1.3.6.1.4.1.2011.5.25.42.2.1.7.64"] = [
    name: "hwVxlanTunnelMacLimitOverThresholdAlarmResume",
    fields: ["hwVxlanTnlMacLimitSourceIp", "hwVxlanTnlMacLimitPeerIp", "hwVxlanTnlMacLimitMaxMac"],
    fieldOids: ["hwVxlanTnlMacLimitSourceIp": "1.3.6.1.4.1.2011.5.25.42.2.1.54", "hwVxlanTnlMacLimitPeerIp": "1.3.6.1.4.1.2011.5.25.42.2.1.55", "hwVxlanTnlMacLimitMaxMac": "1.3.6.1.4.1.2011.5.25.42.2.1.56"]
]

// --- hwTunnelNotSupportInterface (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.2.1.7.65
// Fields: hwTunnelName, hwNotSupIfName, hwDescription
// Description: The tunnel can not support the interface.
trapMap["1.3.6.1.4.1.2011.5.25.42.2.1.7.65"] = [
    name: "hwTunnelNotSupportInterface",
    fields: ["hwTunnelName", "hwNotSupIfName", "hwDescription"],
    fieldOids: ["hwTunnelName": "1.3.6.1.4.1.2011.5.25.42.2.1.57.1.1", "hwNotSupIfName": "1.3.6.1.4.1.2011.5.25.42.2.1.57.1.2", "hwDescription": "1.3.6.1.4.1.2011.5.25.42.2.1.57.1.3"]
]

// --- hwServiceNotSupportDscpSrte (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.2.1.7.66
// Fields: hwDscpSrteServiceName
// Description: This object indicates the alarm that the service cannot support srte dscp function.
trapMap["1.3.6.1.4.1.2011.5.25.42.2.1.7.66"] = [
    name: "hwServiceNotSupportDscpSrte",
    fields: ["hwDscpSrteServiceName"],
    fieldOids: ["hwDscpSrteServiceName": "1.3.6.1.4.1.2011.5.25.42.2.1.58.1.1"]
]

// --- hwVlanMacLimitOverThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.2.1.7.67
// Fields: hwVlanMacLimitVlanId, hwVlanMacLimitMaxMac
// Description: This object indicates that the number of MAC addresses learned based on a VLAN reaches the upper threshold.
trapMap["1.3.6.1.4.1.2011.5.25.42.2.1.7.67"] = [
    name: "hwVlanMacLimitOverThreshold",
    fields: ["hwVlanMacLimitVlanId", "hwVlanMacLimitMaxMac"],
    fieldOids: ["hwVlanMacLimitVlanId": "1.3.6.1.4.1.2011.5.25.42.2.1.61", "hwVlanMacLimitMaxMac": "1.3.6.1.4.1.2011.5.25.42.2.1.62"]
]

// --- hwVlanMacLimitOverThresholdResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.2.1.7.68
// Fields: hwVlanMacLimitVlanId, hwVlanMacLimitMaxMac
// Description: This object indicates that the number of MAC addresses learned based on a VLAN falls below the upper threshold.
trapMap["1.3.6.1.4.1.2011.5.25.42.2.1.7.68"] = [
    name: "hwVlanMacLimitOverThresholdResume",
    fields: ["hwVlanMacLimitVlanId", "hwVlanMacLimitMaxMac"],
    fieldOids: ["hwVlanMacLimitVlanId": "1.3.6.1.4.1.2011.5.25.42.2.1.61", "hwVlanMacLimitMaxMac": "1.3.6.1.4.1.2011.5.25.42.2.1.62"]
]

// --- hwPortMacLimitOverThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.2.1.7.69
// Fields: hwPortMacLimitPortName, hwPortMacLimitMaxMac
// Description: This object indicates that the number of MAC addresses learned by an interface reaches the upper threshold.
trapMap["1.3.6.1.4.1.2011.5.25.42.2.1.7.69"] = [
    name: "hwPortMacLimitOverThreshold",
    fields: ["hwPortMacLimitPortName", "hwPortMacLimitMaxMac"],
    fieldOids: ["hwPortMacLimitPortName": "1.3.6.1.4.1.2011.5.25.42.2.1.63", "hwPortMacLimitMaxMac": "1.3.6.1.4.1.2011.5.25.42.2.1.64"]
]

// --- hwPortMacLimitOverThresholdResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.2.1.7.70
// Fields: hwPortMacLimitPortName, hwPortMacLimitMaxMac
// Description: This object indicates that the number of MAC addresses learned by an interface falls below the upper threshold.
trapMap["1.3.6.1.4.1.2011.5.25.42.2.1.7.70"] = [
    name: "hwPortMacLimitOverThresholdResume",
    fields: ["hwPortMacLimitPortName", "hwPortMacLimitMaxMac"],
    fieldOids: ["hwPortMacLimitPortName": "1.3.6.1.4.1.2011.5.25.42.2.1.63", "hwPortMacLimitMaxMac": "1.3.6.1.4.1.2011.5.25.42.2.1.64"]
]

// --- hwNotSupportTeOverGre (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.2.1.7.71
// Fields: hwMplsBoardId
// Description: This object indicates the board cannot support te over gre.
trapMap["1.3.6.1.4.1.2011.5.25.42.2.1.7.71"] = [
    name: "hwNotSupportTeOverGre",
    fields: ["hwMplsBoardId"],
    fieldOids: ["hwMplsBoardId": "1.3.6.1.4.1.2011.5.25.42.2.1.59.1.1"]
]

// --- hwPortSecRcvInsecurePktAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.2.1.7.72
// Fields: ifDescr
// Description: This object indicates port perform of the protect action shutdown or restrict is resumed.
trapMap["1.3.6.1.4.1.2011.5.25.42.2.1.7.72"] = [
    name: "hwPortSecRcvInsecurePktAlarmResume",
    fields: ["ifDescr"],
    fieldOids: ["ifDescr": "1.3.6.1.2.1.2.2.1.2"]
]

// --- hwStickyMacConflictAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.2.1.7.73
// Fields: hwStickyMacConflictDomainType, hwStickyMacConflictDomainName, hwStickyMacConflictSlotName
// Description: This object indicates the name of the instance with sticky MAC addresses conflicting.
trapMap["1.3.6.1.4.1.2011.5.25.42.2.1.7.73"] = [
    name: "hwStickyMacConflictAlarm",
    fields: ["hwStickyMacConflictDomainType", "hwStickyMacConflictDomainName", "hwStickyMacConflictSlotName"],
    fieldOids: ["hwStickyMacConflictDomainType": "1.3.6.1.4.1.2011.5.25.42.2.1.65", "hwStickyMacConflictDomainName": "1.3.6.1.4.1.2011.5.25.42.2.1.66", "hwStickyMacConflictSlotName": "1.3.6.1.4.1.2011.5.25.42.2.1.67"]
]

// --- hwStickyMacConflictAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.2.1.7.74
// Fields: hwStickyMacConflictDomainType, hwStickyMacConflictDomainName, hwStickyMacConflictSlotName
// Description: This object indicates the name of the instance which sticky MAC addresses conflicting has been resumed.
trapMap["1.3.6.1.4.1.2011.5.25.42.2.1.7.74"] = [
    name: "hwStickyMacConflictAlarmResume",
    fields: ["hwStickyMacConflictDomainType", "hwStickyMacConflictDomainName", "hwStickyMacConflictSlotName"],
    fieldOids: ["hwStickyMacConflictDomainType": "1.3.6.1.4.1.2011.5.25.42.2.1.65", "hwStickyMacConflictDomainName": "1.3.6.1.4.1.2011.5.25.42.2.1.66", "hwStickyMacConflictSlotName": "1.3.6.1.4.1.2011.5.25.42.2.1.67"]
]

// --- hwMacHashConflict (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.2.1.7.75
// Description: This object indicates a hash conflict occurs in MAC addresses.
trapMap["1.3.6.1.4.1.2011.5.25.42.2.1.7.75"] = [
    name: "hwMacHashConflict",
    fields: [],
    fieldOids: []
]

// --- hwTraffSuppAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.2.1.7.76
// Fields: hwTraffSuppAlarmIfName, hwTraffSuppAlarmServiceType, hwTraffSuppAlarmDirection
// Description: This object indicates traffic over the suppression threshold.
trapMap["1.3.6.1.4.1.2011.5.25.42.2.1.7.76"] = [
    name: "hwTraffSuppAlarm",
    fields: ["hwTraffSuppAlarmIfName", "hwTraffSuppAlarmServiceType", "hwTraffSuppAlarmDirection"],
    fieldOids: ["hwTraffSuppAlarmIfName": "1.3.6.1.4.1.2011.5.25.42.2.1.68.1.2", "hwTraffSuppAlarmServiceType": "1.3.6.1.4.1.2011.5.25.42.2.1.68.1.3", "hwTraffSuppAlarmDirection": "1.3.6.1.4.1.2011.5.25.42.2.1.68.1.4"]
]

// --- hwTraffSuppAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.2.1.7.77
// Fields: hwTraffSuppAlarmIfName, hwTraffSuppAlarmServiceType, hwTraffSuppAlarmDirection
// Description: This object indicates traffic under the suppression threshold.
trapMap["1.3.6.1.4.1.2011.5.25.42.2.1.7.77"] = [
    name: "hwTraffSuppAlarmResume",
    fields: ["hwTraffSuppAlarmIfName", "hwTraffSuppAlarmServiceType", "hwTraffSuppAlarmDirection"],
    fieldOids: ["hwTraffSuppAlarmIfName": "1.3.6.1.4.1.2011.5.25.42.2.1.68.1.2", "hwTraffSuppAlarmServiceType": "1.3.6.1.4.1.2011.5.25.42.2.1.68.1.3", "hwTraffSuppAlarmDirection": "1.3.6.1.4.1.2011.5.25.42.2.1.68.1.4"]
]

// --- hwVlanTraffSuppAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.2.1.7.78
// Fields: hwTraffSuppAlarmIfName, hwTraffSuppAlarmServiceType, hwTraffSuppAlarmDirection, hwTraffSuppAlarmVlanId
// Description: This object indicates vlan type traffic over the suppression threshold.
trapMap["1.3.6.1.4.1.2011.5.25.42.2.1.7.78"] = [
    name: "hwVlanTraffSuppAlarm",
    fields: ["hwTraffSuppAlarmIfName", "hwTraffSuppAlarmServiceType", "hwTraffSuppAlarmDirection", "hwTraffSuppAlarmVlanId"],
    fieldOids: ["hwTraffSuppAlarmIfName": "1.3.6.1.4.1.2011.5.25.42.2.1.68.1.2", "hwTraffSuppAlarmServiceType": "1.3.6.1.4.1.2011.5.25.42.2.1.68.1.3", "hwTraffSuppAlarmDirection": "1.3.6.1.4.1.2011.5.25.42.2.1.68.1.4", "hwTraffSuppAlarmVlanId": "1.3.6.1.4.1.2011.5.25.42.2.1.68.1.5"]
]

// --- hwVlanTraffSuppAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.2.1.7.79
// Fields: hwTraffSuppAlarmIfName, hwTraffSuppAlarmServiceType, hwTraffSuppAlarmDirection, hwTraffSuppAlarmVlanId
// Description: This object indicates vlan type traffic under the suppression threshold.
trapMap["1.3.6.1.4.1.2011.5.25.42.2.1.7.79"] = [
    name: "hwVlanTraffSuppAlarmResume",
    fields: ["hwTraffSuppAlarmIfName", "hwTraffSuppAlarmServiceType", "hwTraffSuppAlarmDirection", "hwTraffSuppAlarmVlanId"],
    fieldOids: ["hwTraffSuppAlarmIfName": "1.3.6.1.4.1.2011.5.25.42.2.1.68.1.2", "hwTraffSuppAlarmServiceType": "1.3.6.1.4.1.2011.5.25.42.2.1.68.1.3", "hwTraffSuppAlarmDirection": "1.3.6.1.4.1.2011.5.25.42.2.1.68.1.4", "hwTraffSuppAlarmVlanId": "1.3.6.1.4.1.2011.5.25.42.2.1.68.1.5"]
]

// --- hwEvplMacLimitNumRaisingThresholdAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.2.1.7.80
// Fields: hwBaseTrapSeverity, hwBaseTrapProbableCause, hwBaseTrapEventType, hwMacDynAddressLearnNum, hwMacLimitMaxMac, hwEvplMacLimitBdId, hwEvplMacLimitEvplId
// Description: The evpl beyond the mac limited learning number.
trapMap["1.3.6.1.4.1.2011.5.25.42.2.1.7.80"] = [
    name: "hwEvplMacLimitNumRaisingThresholdAlarm",
    fields: ["hwBaseTrapSeverity", "hwBaseTrapProbableCause", "hwBaseTrapEventType", "hwMacDynAddressLearnNum", "hwMacLimitMaxMac", "hwEvplMacLimitBdId", "hwEvplMacLimitEvplId"],
    fieldOids: ["hwBaseTrapSeverity": "1.3.6.1.4.1.2011.5.25.129.1.1", "hwBaseTrapProbableCause": "1.3.6.1.4.1.2011.5.25.129.1.2", "hwBaseTrapEventType": "1.3.6.1.4.1.2011.5.25.129.1.3", "hwMacDynAddressLearnNum": "1.3.6.1.4.1.2011.5.25.42.2.1.4.1.10", "hwMacLimitMaxMac": "1.3.6.1.4.1.2011.5.25.42.2.1.4.1.4", "hwEvplMacLimitBdId": "1.3.6.1.4.1.2011.5.25.42.2.1.70.1.1", "hwEvplMacLimitEvplId": "1.3.6.1.4.1.2011.5.25.42.2.1.70.1.2"]
]

// --- hwEvplMacLimitNumRaisingThresholdAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.2.1.7.81
// Fields: hwBaseTrapSeverity, hwBaseTrapProbableCause, hwBaseTrapEventType, hwMacDynAddressLearnNum, hwMacLimitMaxMac, hwEvplMacLimitBdId, hwEvplMacLimitEvplId
// Description: The evpl release from the mac limited learning number.
trapMap["1.3.6.1.4.1.2011.5.25.42.2.1.7.81"] = [
    name: "hwEvplMacLimitNumRaisingThresholdAlarmResume",
    fields: ["hwBaseTrapSeverity", "hwBaseTrapProbableCause", "hwBaseTrapEventType", "hwMacDynAddressLearnNum", "hwMacLimitMaxMac", "hwEvplMacLimitBdId", "hwEvplMacLimitEvplId"],
    fieldOids: ["hwBaseTrapSeverity": "1.3.6.1.4.1.2011.5.25.129.1.1", "hwBaseTrapProbableCause": "1.3.6.1.4.1.2011.5.25.129.1.2", "hwBaseTrapEventType": "1.3.6.1.4.1.2011.5.25.129.1.3", "hwMacDynAddressLearnNum": "1.3.6.1.4.1.2011.5.25.42.2.1.4.1.10", "hwMacLimitMaxMac": "1.3.6.1.4.1.2011.5.25.42.2.1.4.1.4", "hwEvplMacLimitBdId": "1.3.6.1.4.1.2011.5.25.42.2.1.70.1.1", "hwEvplMacLimitEvplId": "1.3.6.1.4.1.2011.5.25.42.2.1.70.1.2"]
]

// --- hwVsiMacLimitOverThresholdAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.2.1.7.82
// Fields: hwMacLimitVsiName, hwMacLimitMaxMac
// Description: Beyond the mac limited learning number.
trapMap["1.3.6.1.4.1.2011.5.25.42.2.1.7.82"] = [
    name: "hwVsiMacLimitOverThresholdAlarm",
    fields: ["hwMacLimitVsiName", "hwMacLimitMaxMac"],
    fieldOids: ["hwMacLimitVsiName": "1.3.6.1.4.1.2011.5.25.42.2.1.4.1.3", "hwMacLimitMaxMac": "1.3.6.1.4.1.2011.5.25.42.2.1.4.1.4"]
]

// --- hwVsiMacLimitOverThresholdAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.2.1.7.83
// Fields: hwMacLimitVsiName, hwMacLimitMaxMac
// Description: Less than the mac limited learning number.
trapMap["1.3.6.1.4.1.2011.5.25.42.2.1.7.83"] = [
    name: "hwVsiMacLimitOverThresholdAlarmResume",
    fields: ["hwMacLimitVsiName", "hwMacLimitMaxMac"],
    fieldOids: ["hwMacLimitVsiName": "1.3.6.1.4.1.2011.5.25.42.2.1.4.1.3", "hwMacLimitMaxMac": "1.3.6.1.4.1.2011.5.25.42.2.1.4.1.4"]
]

// ===== Parsing logic =====

// Set to true to enable diagnostic logging for this MIB parser
DEBUG = false

LOG_PREFIX = "[HUAWEI-L2MAM-MIB]"
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
