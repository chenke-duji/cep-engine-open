/**
 * Auto-generated from HUAWEI-CBQOS-MIB.mib
 * Generated: 2026-08-24T18:28:29.253266
 * Traps/Notifications (23): hwCBQoSGtsDiscardThresholdTrap, hwCBQoSCarOverSpeedThresholdTrap, hwCBQoSRuleNotSupportAlarm, hwCBQoSActionNotSupportAlarm, hwCBQoSGlobalAclNotSupportAlarm, hwCBQoSUpdateUserQueueResourceNotEnoughAlarm, hwCBQoSSetUserQueueResourceNotEnoughAlarm, hwCBQoSPbrInvalidAlarm, hwCBQoSPbrInvalidAlarmResume, hwCBQosMirrorResourceAlarm, hwCBQosMirrorResourceAlarmResume, hwCBQosMirrorFeatureVersionNotMatchAlarm, hwCBQosMirrorFeatureVersionNotMatchAlarmResume, hwCBQosMirrorArpResourceExceedAlarm, hwCBQosMirrorArpResourceExceedAlarmResume, hwCBQosSaFlowTableExceedAlarm, hwCBQosSaFlowTableExceedClearAlarm, hwCBQosSaTfcRedrctStartAlarm, hwCBQosSaTfcRedrctStopAlarm, hwCBQoSSacFlowTblResourceExceedAlarm, hwCBQoSSacFlowTblResourceExceedAlarmResume, hwCBQoSSacFlowTblResourceFullAlarm, hwCBQoSSacFlowTblResourceFullAlarmResume
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

// --- hwCBQoSGtsDiscardThresholdTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.32.1.2.1
// Fields: hwCBQoSFrameId, hwCBQoSSlotId, hwCBQoSPortId, hwCBQoSClassifierName, hwCBQoSBehaviorName, hwCBQoSTrapIfName, hwCBQoSTrapPolicyName, hwCBQoSTrapVlanId, hwCBQoSTrapEgressIfName, hwCBQoSTrapDiscardPackets
// Description: The SNMP trap is generated when the number of packages that Gts discard is larger than the configured threshold.
trapMap["1.3.6.1.4.1.2011.5.25.32.1.2.1"] = [
    name: "hwCBQoSGtsDiscardThresholdTrap",
    fields: ["hwCBQoSFrameId", "hwCBQoSSlotId", "hwCBQoSPortId", "hwCBQoSClassifierName", "hwCBQoSBehaviorName", "hwCBQoSTrapIfName", "hwCBQoSTrapPolicyName", "hwCBQoSTrapVlanId", "hwCBQoSTrapEgressIfName", "hwCBQoSTrapDiscardPackets"],
    fieldOids: ["hwCBQoSFrameId": "1.3.6.1.4.1.2011.5.25.32.1.1.6.1", "hwCBQoSSlotId": "1.3.6.1.4.1.2011.5.25.32.1.1.6.2", "hwCBQoSPortId": "1.3.6.1.4.1.2011.5.25.32.1.1.6.3", "hwCBQoSClassifierName": "1.3.6.1.4.1.2011.5.25.32.1.1.1.2.1.2", "hwCBQoSBehaviorName": "1.3.6.1.4.1.2011.5.25.32.1.1.2.2.1.2", "hwCBQoSTrapIfName": "1.3.6.1.4.1.2011.5.25.32.1.1.6.4", "hwCBQoSTrapPolicyName": "1.3.6.1.4.1.2011.5.25.32.1.1.6.7", "hwCBQoSTrapVlanId": "1.3.6.1.4.1.2011.5.25.32.1.1.6.8", "hwCBQoSTrapEgressIfName": "1.3.6.1.4.1.2011.5.25.32.1.1.6.9", "hwCBQoSTrapDiscardPackets": "1.3.6.1.4.1.2011.5.25.32.1.1.6.10"]
]

// --- hwCBQoSCarOverSpeedThresholdTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.32.1.2.2
// Fields: hwCBQoSFrameId, hwCBQoSSlotId, hwCBQoSPortId, hwCBQoSClassifierName, hwCBQoSBehaviorName, hwCBQoSTrapIfName, hwCBQoSTrapPolicyName, hwCBQoSTrapVlanId, hwCBQoSTrapType, hwCBQoSTrapAction, hwCBQoSTrapDiscardPackets
// Description: The SNMP trap is generated when the speed of cir or pir exceeds the configured threshold.
trapMap["1.3.6.1.4.1.2011.5.25.32.1.2.2"] = [
    name: "hwCBQoSCarOverSpeedThresholdTrap",
    fields: ["hwCBQoSFrameId", "hwCBQoSSlotId", "hwCBQoSPortId", "hwCBQoSClassifierName", "hwCBQoSBehaviorName", "hwCBQoSTrapIfName", "hwCBQoSTrapPolicyName", "hwCBQoSTrapVlanId", "hwCBQoSTrapType", "hwCBQoSTrapAction", "hwCBQoSTrapDiscardPackets"],
    fieldOids: ["hwCBQoSFrameId": "1.3.6.1.4.1.2011.5.25.32.1.1.6.1", "hwCBQoSSlotId": "1.3.6.1.4.1.2011.5.25.32.1.1.6.2", "hwCBQoSPortId": "1.3.6.1.4.1.2011.5.25.32.1.1.6.3", "hwCBQoSClassifierName": "1.3.6.1.4.1.2011.5.25.32.1.1.1.2.1.2", "hwCBQoSBehaviorName": "1.3.6.1.4.1.2011.5.25.32.1.1.2.2.1.2", "hwCBQoSTrapIfName": "1.3.6.1.4.1.2011.5.25.32.1.1.6.4", "hwCBQoSTrapPolicyName": "1.3.6.1.4.1.2011.5.25.32.1.1.6.7", "hwCBQoSTrapVlanId": "1.3.6.1.4.1.2011.5.25.32.1.1.6.8", "hwCBQoSTrapType": "1.3.6.1.4.1.2011.5.25.32.1.1.6.5", "hwCBQoSTrapAction": "1.3.6.1.4.1.2011.5.25.32.1.1.6.6", "hwCBQoSTrapDiscardPackets": "1.3.6.1.4.1.2011.5.25.32.1.1.6.10"]
]

// --- hwCBQoSRuleNotSupportAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.32.1.2.3
// Fields: hwCBQoSRuleDirection, hwCBQoSRuleSlotID, hwCBQoSRuleInfo
// Description: The SNMP trap is generated when the rule is not supported.
trapMap["1.3.6.1.4.1.2011.5.25.32.1.2.3"] = [
    name: "hwCBQoSRuleNotSupportAlarm",
    fields: ["hwCBQoSRuleDirection", "hwCBQoSRuleSlotID", "hwCBQoSRuleInfo"],
    fieldOids: ["hwCBQoSRuleDirection": "1.3.6.1.4.1.2011.5.25.32.1.1.4.8.1.1", "hwCBQoSRuleSlotID": "1.3.6.1.4.1.2011.5.25.32.1.1.4.8.1.2", "hwCBQoSRuleInfo": "1.3.6.1.4.1.2011.5.25.32.1.1.4.8.1.3"]
]

// --- hwCBQoSActionNotSupportAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.32.1.2.4
// Fields: hwCBQoSActionDirection, hwCBQoSActionSlotID, hwCBQoSActionInfo
// Description: The SNMP trap is generated when the action is not supported.
trapMap["1.3.6.1.4.1.2011.5.25.32.1.2.4"] = [
    name: "hwCBQoSActionNotSupportAlarm",
    fields: ["hwCBQoSActionDirection", "hwCBQoSActionSlotID", "hwCBQoSActionInfo"],
    fieldOids: ["hwCBQoSActionDirection": "1.3.6.1.4.1.2011.5.25.32.1.1.4.9.1.1", "hwCBQoSActionSlotID": "1.3.6.1.4.1.2011.5.25.32.1.1.4.9.1.2", "hwCBQoSActionInfo": "1.3.6.1.4.1.2011.5.25.32.1.1.4.9.1.3"]
]

// --- hwCBQoSGlobalAclNotSupportAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.32.1.2.5
// Fields: hwCBQoSGlobalAclDirection, hwCBQoSGlobalAclSlotID
// Description: The SNMP trap is generated when the Global ACL is not support the ACL.
trapMap["1.3.6.1.4.1.2011.5.25.32.1.2.5"] = [
    name: "hwCBQoSGlobalAclNotSupportAlarm",
    fields: ["hwCBQoSGlobalAclDirection", "hwCBQoSGlobalAclSlotID"],
    fieldOids: ["hwCBQoSGlobalAclDirection": "1.3.6.1.4.1.2011.5.25.32.1.1.4.12.1.1", "hwCBQoSGlobalAclSlotID": "1.3.6.1.4.1.2011.5.25.32.1.1.4.12.1.2"]
]

// --- hwCBQoSUpdateUserQueueResourceNotEnoughAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.32.1.2.6
// Fields: hwCBQoSUpdateUserQueueBehaviorName, hwCBQoSUpdateUserQueueSlotID, hwCBQoSUpdateUserQueueCir, hwCBQoSUpdateUserQueuePir
// Description: The SNMP trap is generated when the action user-queue update failed.
trapMap["1.3.6.1.4.1.2011.5.25.32.1.2.6"] = [
    name: "hwCBQoSUpdateUserQueueResourceNotEnoughAlarm",
    fields: ["hwCBQoSUpdateUserQueueBehaviorName", "hwCBQoSUpdateUserQueueSlotID", "hwCBQoSUpdateUserQueueCir", "hwCBQoSUpdateUserQueuePir"],
    fieldOids: ["hwCBQoSUpdateUserQueueBehaviorName": "1.3.6.1.4.1.2011.5.25.32.1.1.4.13.1.1", "hwCBQoSUpdateUserQueueSlotID": "1.3.6.1.4.1.2011.5.25.32.1.1.4.13.1.2", "hwCBQoSUpdateUserQueueCir": "1.3.6.1.4.1.2011.5.25.32.1.1.4.13.1.3", "hwCBQoSUpdateUserQueuePir": "1.3.6.1.4.1.2011.5.25.32.1.1.4.13.1.4"]
]

// --- hwCBQoSSetUserQueueResourceNotEnoughAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.32.1.2.7
// Fields: hwCBQoSSetUserQueueBehaviorName, hwCBQoSSetUserQueueSlotID
// Description: The SNMP trap is generated when the action user-queue config failed.
trapMap["1.3.6.1.4.1.2011.5.25.32.1.2.7"] = [
    name: "hwCBQoSSetUserQueueResourceNotEnoughAlarm",
    fields: ["hwCBQoSSetUserQueueBehaviorName", "hwCBQoSSetUserQueueSlotID"],
    fieldOids: ["hwCBQoSSetUserQueueBehaviorName": "1.3.6.1.4.1.2011.5.25.32.1.1.4.14.1.1", "hwCBQoSSetUserQueueSlotID": "1.3.6.1.4.1.2011.5.25.32.1.1.4.14.1.2"]
]

// --- hwCBQoSPbrInvalidAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.32.1.2.8
// Fields: hwCBQoSRdrRouteAlarmBehaviorName, hwCBQoSRdrRouteAlarmProtoFamily, hwCBQoSRdrRouteAlarmApplyType, hwCBQoSRdrRouteAlarmInterfaceName, hwCBQoSRdrRouteAlarmViewParam
// Description: PBR invalid.
trapMap["1.3.6.1.4.1.2011.5.25.32.1.2.8"] = [
    name: "hwCBQoSPbrInvalidAlarm",
    fields: ["hwCBQoSRdrRouteAlarmBehaviorName", "hwCBQoSRdrRouteAlarmProtoFamily", "hwCBQoSRdrRouteAlarmApplyType", "hwCBQoSRdrRouteAlarmInterfaceName", "hwCBQoSRdrRouteAlarmViewParam"],
    fieldOids: ["hwCBQoSRdrRouteAlarmBehaviorName": "1.3.6.1.4.1.2011.5.25.32.1.1.4.16.1.1", "hwCBQoSRdrRouteAlarmProtoFamily": "1.3.6.1.4.1.2011.5.25.32.1.1.4.16.1.2", "hwCBQoSRdrRouteAlarmApplyType": "1.3.6.1.4.1.2011.5.25.32.1.1.4.16.1.3", "hwCBQoSRdrRouteAlarmInterfaceName": "1.3.6.1.4.1.2011.5.25.32.1.1.4.16.1.4", "hwCBQoSRdrRouteAlarmViewParam": "1.3.6.1.4.1.2011.5.25.32.1.1.4.16.1.5"]
]

// --- hwCBQoSPbrInvalidAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.32.1.2.9
// Fields: hwCBQoSRdrRouteAlarmBehaviorName, hwCBQoSRdrRouteAlarmProtoFamily, hwCBQoSRdrRouteAlarmApplyType, hwCBQoSRdrRouteAlarmInterfaceName, hwCBQoSRdrRouteAlarmViewParam
// Description: PBR invalid recover.
trapMap["1.3.6.1.4.1.2011.5.25.32.1.2.9"] = [
    name: "hwCBQoSPbrInvalidAlarmResume",
    fields: ["hwCBQoSRdrRouteAlarmBehaviorName", "hwCBQoSRdrRouteAlarmProtoFamily", "hwCBQoSRdrRouteAlarmApplyType", "hwCBQoSRdrRouteAlarmInterfaceName", "hwCBQoSRdrRouteAlarmViewParam"],
    fieldOids: ["hwCBQoSRdrRouteAlarmBehaviorName": "1.3.6.1.4.1.2011.5.25.32.1.1.4.16.1.1", "hwCBQoSRdrRouteAlarmProtoFamily": "1.3.6.1.4.1.2011.5.25.32.1.1.4.16.1.2", "hwCBQoSRdrRouteAlarmApplyType": "1.3.6.1.4.1.2011.5.25.32.1.1.4.16.1.3", "hwCBQoSRdrRouteAlarmInterfaceName": "1.3.6.1.4.1.2011.5.25.32.1.1.4.16.1.4", "hwCBQoSRdrRouteAlarmViewParam": "1.3.6.1.4.1.2011.5.25.32.1.1.4.16.1.5"]
]

// --- hwCBQosMirrorResourceAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.32.1.2.11
// Fields: hwCBQoSMirrorSlotId, hwCBQoSMirrorServiceType, hwCBQoSMirrorDirection
// Description: Mirroring resources are used up.
trapMap["1.3.6.1.4.1.2011.5.25.32.1.2.11"] = [
    name: "hwCBQosMirrorResourceAlarm",
    fields: ["hwCBQoSMirrorSlotId", "hwCBQoSMirrorServiceType", "hwCBQoSMirrorDirection"],
    fieldOids: ["hwCBQoSMirrorSlotId": "1.3.6.1.4.1.2011.5.25.32.1.1.2.33.1.1", "hwCBQoSMirrorServiceType": "1.3.6.1.4.1.2011.5.25.32.1.1.2.33.1.2", "hwCBQoSMirrorDirection": "1.3.6.1.4.1.2011.5.25.32.1.1.2.33.1.3"]
]

// --- hwCBQosMirrorResourceAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.32.1.2.12
// Fields: hwCBQoSMirrorSlotId, hwCBQoSMirrorServiceType, hwCBQoSMirrorDirection
// Description: MIRR resources are sufficient.
trapMap["1.3.6.1.4.1.2011.5.25.32.1.2.12"] = [
    name: "hwCBQosMirrorResourceAlarmResume",
    fields: ["hwCBQoSMirrorSlotId", "hwCBQoSMirrorServiceType", "hwCBQoSMirrorDirection"],
    fieldOids: ["hwCBQoSMirrorSlotId": "1.3.6.1.4.1.2011.5.25.32.1.1.2.33.1.1", "hwCBQoSMirrorServiceType": "1.3.6.1.4.1.2011.5.25.32.1.1.2.33.1.2", "hwCBQoSMirrorDirection": "1.3.6.1.4.1.2011.5.25.32.1.1.2.33.1.3"]
]

// --- hwCBQosMirrorFeatureVersionNotMatchAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.32.1.2.13
// Description: The version of the mirror feature package does not match that of the system software package.
trapMap["1.3.6.1.4.1.2011.5.25.32.1.2.13"] = [
    name: "hwCBQosMirrorFeatureVersionNotMatchAlarm",
    fields: [],
    fieldOids: []
]

// --- hwCBQosMirrorFeatureVersionNotMatchAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.32.1.2.14
// Description: The alarm indicating that the mirror feature package version does not match the basic package version is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.32.1.2.14"] = [
    name: "hwCBQosMirrorFeatureVersionNotMatchAlarmResume",
    fields: [],
    fieldOids: []
]

// --- hwCBQosMirrorArpResourceExceedAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.32.1.2.15
// Fields: hwCBQoSMirrorSlotId
// Description: ARP link-layer encapsulation resources are insufficient, and ERSPAN fails to deliver ARP entries.
trapMap["1.3.6.1.4.1.2011.5.25.32.1.2.15"] = [
    name: "hwCBQosMirrorArpResourceExceedAlarm",
    fields: ["hwCBQoSMirrorSlotId"],
    fieldOids: ["hwCBQoSMirrorSlotId": "1.3.6.1.4.1.2011.5.25.32.1.1.2.33.1.1"]
]

// --- hwCBQosMirrorArpResourceExceedAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.32.1.2.16
// Fields: hwCBQoSMirrorSlotId
// Description: ARP link-layer encapsulation resources become sufficient, and ERSPAN successfully delivers ARP entries.
trapMap["1.3.6.1.4.1.2011.5.25.32.1.2.16"] = [
    name: "hwCBQosMirrorArpResourceExceedAlarmResume",
    fields: ["hwCBQoSMirrorSlotId"],
    fieldOids: ["hwCBQoSMirrorSlotId": "1.3.6.1.4.1.2011.5.25.32.1.1.2.33.1.1"]
]

// --- hwCBQosSaFlowTableExceedAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.32.1.2.17
// Fields: hwCBQoSSaSlotId, hwCBQoSSaFlowTableSpec, hwCBQoSSaCurrentPercentage, hwCBQoSSaAlarmThreshold
// Description: The percentage of the number of flow tables used for service awareness exceeds the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.32.1.2.17"] = [
    name: "hwCBQosSaFlowTableExceedAlarm",
    fields: ["hwCBQoSSaSlotId", "hwCBQoSSaFlowTableSpec", "hwCBQoSSaCurrentPercentage", "hwCBQoSSaAlarmThreshold"],
    fieldOids: ["hwCBQoSSaSlotId": "1.3.6.1.4.1.2011.5.25.32.1.1.8.1.1.1", "hwCBQoSSaFlowTableSpec": "1.3.6.1.4.1.2011.5.25.32.1.1.8.1.1.2", "hwCBQoSSaCurrentPercentage": "1.3.6.1.4.1.2011.5.25.32.1.1.8.1.1.3", "hwCBQoSSaAlarmThreshold": "1.3.6.1.4.1.2011.5.25.32.1.1.8.1.1.4"]
]

// --- hwCBQosSaFlowTableExceedClearAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.32.1.2.18
// Fields: hwCBQoSSaSlotId, hwCBQoSSaFlowTableSpec, hwCBQoSSaCurrentPercentage, hwCBQoSSaAlarmThreshold
// Description: The percentage of the number of flow tables used for service awareness falls below the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.32.1.2.18"] = [
    name: "hwCBQosSaFlowTableExceedClearAlarm",
    fields: ["hwCBQoSSaSlotId", "hwCBQoSSaFlowTableSpec", "hwCBQoSSaCurrentPercentage", "hwCBQoSSaAlarmThreshold"],
    fieldOids: ["hwCBQoSSaSlotId": "1.3.6.1.4.1.2011.5.25.32.1.1.8.1.1.1", "hwCBQoSSaFlowTableSpec": "1.3.6.1.4.1.2011.5.25.32.1.1.8.1.1.2", "hwCBQoSSaCurrentPercentage": "1.3.6.1.4.1.2011.5.25.32.1.1.8.1.1.3", "hwCBQoSSaAlarmThreshold": "1.3.6.1.4.1.2011.5.25.32.1.1.8.1.1.4"]
]

// --- hwCBQosSaTfcRedrctStartAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.32.1.2.19
// Fields: hwCBQoSSaSlotId
// Description: Traffic starts to be redirected for service awareness.
trapMap["1.3.6.1.4.1.2011.5.25.32.1.2.19"] = [
    name: "hwCBQosSaTfcRedrctStartAlarm",
    fields: ["hwCBQoSSaSlotId"],
    fieldOids: ["hwCBQoSSaSlotId": "1.3.6.1.4.1.2011.5.25.32.1.1.8.1.1.1"]
]

// --- hwCBQosSaTfcRedrctStopAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.32.1.2.20
// Fields: hwCBQoSSaStopCause
// Description: Traffic stops to be redirected for service awareness.
trapMap["1.3.6.1.4.1.2011.5.25.32.1.2.20"] = [
    name: "hwCBQosSaTfcRedrctStopAlarm",
    fields: ["hwCBQoSSaStopCause"],
    fieldOids: ["hwCBQoSSaStopCause": "1.3.6.1.4.1.2011.5.25.32.1.1.8.1.1.5"]
]

// --- hwCBQoSSacFlowTblResourceExceedAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.32.1.2.21
// Fields: hwCBQoSSacFlowTblResSlotId, hwCBQoSSacFlowTblResThreshold, hwCBQoSSacFlowTblResUsed, hwCBQoSSacFlowTblResTotal
// Description: The number of SAC flow table resources reaches the alarm threshold.
trapMap["1.3.6.1.4.1.2011.5.25.32.1.2.21"] = [
    name: "hwCBQoSSacFlowTblResourceExceedAlarm",
    fields: ["hwCBQoSSacFlowTblResSlotId", "hwCBQoSSacFlowTblResThreshold", "hwCBQoSSacFlowTblResUsed", "hwCBQoSSacFlowTblResTotal"],
    fieldOids: ["hwCBQoSSacFlowTblResSlotId": "1.3.6.1.4.1.2011.5.25.32.1.1.2.34.1.1", "hwCBQoSSacFlowTblResThreshold": "1.3.6.1.4.1.2011.5.25.32.1.1.2.34.1.2", "hwCBQoSSacFlowTblResUsed": "1.3.6.1.4.1.2011.5.25.32.1.1.2.34.1.3", "hwCBQoSSacFlowTblResTotal": "1.3.6.1.4.1.2011.5.25.32.1.1.2.34.1.4"]
]

// --- hwCBQoSSacFlowTblResourceExceedAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.32.1.2.22
// Fields: hwCBQoSSacFlowTblResSlotId, hwCBQoSSacFlowTblResThreshold, hwCBQoSSacFlowTblResUsed, hwCBQoSSacFlowTblResTotal
// Description: The number of SAC flow table resources become sufficient.
trapMap["1.3.6.1.4.1.2011.5.25.32.1.2.22"] = [
    name: "hwCBQoSSacFlowTblResourceExceedAlarmResume",
    fields: ["hwCBQoSSacFlowTblResSlotId", "hwCBQoSSacFlowTblResThreshold", "hwCBQoSSacFlowTblResUsed", "hwCBQoSSacFlowTblResTotal"],
    fieldOids: ["hwCBQoSSacFlowTblResSlotId": "1.3.6.1.4.1.2011.5.25.32.1.1.2.34.1.1", "hwCBQoSSacFlowTblResThreshold": "1.3.6.1.4.1.2011.5.25.32.1.1.2.34.1.2", "hwCBQoSSacFlowTblResUsed": "1.3.6.1.4.1.2011.5.25.32.1.1.2.34.1.3", "hwCBQoSSacFlowTblResTotal": "1.3.6.1.4.1.2011.5.25.32.1.1.2.34.1.4"]
]

// --- hwCBQoSSacFlowTblResourceFullAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.32.1.2.23
// Fields: hwCBQoSSacFlowTblResFullSlotId, hwCBQoSSacFlowTblResFullUsed, hwCBQoSSacFlowTblResFullTotal
// Description: The number of SAC flow table resources reaches the alarm threshold.
trapMap["1.3.6.1.4.1.2011.5.25.32.1.2.23"] = [
    name: "hwCBQoSSacFlowTblResourceFullAlarm",
    fields: ["hwCBQoSSacFlowTblResFullSlotId", "hwCBQoSSacFlowTblResFullUsed", "hwCBQoSSacFlowTblResFullTotal"],
    fieldOids: ["hwCBQoSSacFlowTblResFullSlotId": "1.3.6.1.4.1.2011.5.25.32.1.1.2.35.1.1", "hwCBQoSSacFlowTblResFullUsed": "1.3.6.1.4.1.2011.5.25.32.1.1.2.35.1.2", "hwCBQoSSacFlowTblResFullTotal": "1.3.6.1.4.1.2011.5.25.32.1.1.2.35.1.3"]
]

// --- hwCBQoSSacFlowTblResourceFullAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.32.1.2.24
// Fields: hwCBQoSSacFlowTblResFullSlotId, hwCBQoSSacFlowTblResFullUsed, hwCBQoSSacFlowTblResFullTotal
// Description: The number of SAC flow table resources become sufficient.
trapMap["1.3.6.1.4.1.2011.5.25.32.1.2.24"] = [
    name: "hwCBQoSSacFlowTblResourceFullAlarmResume",
    fields: ["hwCBQoSSacFlowTblResFullSlotId", "hwCBQoSSacFlowTblResFullUsed", "hwCBQoSSacFlowTblResFullTotal"],
    fieldOids: ["hwCBQoSSacFlowTblResFullSlotId": "1.3.6.1.4.1.2011.5.25.32.1.1.2.35.1.1", "hwCBQoSSacFlowTblResFullUsed": "1.3.6.1.4.1.2011.5.25.32.1.1.2.35.1.2", "hwCBQoSSacFlowTblResFullTotal": "1.3.6.1.4.1.2011.5.25.32.1.1.2.35.1.3"]
]

// ===== Parsing logic =====

// Set to true to enable diagnostic logging for this MIB parser
DEBUG = false

LOG_PREFIX = "[HUAWEI-CBQOS-MIB]"
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
