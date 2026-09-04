/**
 * Auto-generated from HUAWEI-ETHARP-MIB.mib
 * Generated: 2026-08-24T18:28:29.586770900
 * Traps/Notifications (43): hwEthernetARPSpeedLimitAlarm, hwEthernetARPAntiAttackAlarm, hwEthernetARPAntiGatewayConflictAlarm, hwEthernetARPThresholdExceedAlarm, hwEthernetARPThresholdResumeAlarm, hwEthernetARPIPConflictEvent, hwEthernetARPMACIPConflict, hwEthernetARPMACIPConflictResolved, hwEthernetARPLearnStopAlarm, hwEthernetARPLearnResumeAlarm, hwEthernetARPRemoteBackupFailAlarm, hwEthernetARPRemoteBackupFailResumeAlarm, hwEthernetARPHostIPConflict, hwEthernetARPHostIPConflictResume, hwEthernetARPGateWayDuplicateAlarm, hwEthernetARPGateWayDuplicateAlarmResume, hwFwdArpAlarmOccur, hwFwdArpAlarmResume, hwEthernetARPLimitExceed, hwEthernetARPLimitExceedResume, hwARPBDHostConflictAlarm, hwARPBDHostConflictResume, hwEthernetARPDuplicateIPaddr, hwEthernetARPDuplicateIPaddrClear, hwEthernetARPProbeFailure, hwEthernetARPProbeFailureClear, hwEthernetARPReplaceExceed, hwEthernetARPReplaceExceedClear, hwEthernetARPSpeedLimit, hwEthernetARPSpeedLimitClear, hwEthernetARPDuplicateMacEvent, hwEthernetARPEntryExceedAlarm, hwEthernetARPEntryResumeAlarm, hwEthernetARPDynamicEntryExceedAlarm, hwEthernetARPDynamicEntryResumeAlarm, hwEthernetARPMACConflict, hwEthernetARPMACConflictClear, hwEthernetARPMACMismatch, hwEthernetARPMACMismatchClear, hwEthernetARPBdSuppressEntryExceedAlarm, hwEthernetARPBdSuppressEntryResumeAlarm, hwEthernetARPDetectAbnormalAlarm, hwEthernetARPDetectResumeAlarm
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

// --- hwEthernetARPSpeedLimitAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.123.2.1
// Fields: hwEthernetARPSpeedLimitIfIndex, hwEthernetARPSpeedLimitConfigured, hwEthernetARPSpeedLimitCurrent, hwEthernetARPSpeedLimitType, hwEthernetARPSpeedLimitSrcIPAddr, hwEthernetARPSpeedLimitDstIPAddr, hwEthernetARPSpeedLimitVPNinstance, hwEthernetARPInterfaceName
// Description: This object indicates that the packet rate exceeds the configured threshold.
trapMap["1.3.6.1.4.1.2011.5.25.123.2.1"] = [
    name: "hwEthernetARPSpeedLimitAlarm",
    fields: ["hwEthernetARPSpeedLimitIfIndex", "hwEthernetARPSpeedLimitConfigured", "hwEthernetARPSpeedLimitCurrent", "hwEthernetARPSpeedLimitType", "hwEthernetARPSpeedLimitSrcIPAddr", "hwEthernetARPSpeedLimitDstIPAddr", "hwEthernetARPSpeedLimitVPNinstance", "hwEthernetARPInterfaceName"],
    fieldOids: ["hwEthernetARPSpeedLimitIfIndex": "1.3.6.1.4.1.2011.5.25.123.1.4", "hwEthernetARPSpeedLimitConfigured": "1.3.6.1.4.1.2011.5.25.123.1.5", "hwEthernetARPSpeedLimitCurrent": "1.3.6.1.4.1.2011.5.25.123.1.6", "hwEthernetARPSpeedLimitType": "1.3.6.1.4.1.2011.5.25.123.1.7", "hwEthernetARPSpeedLimitSrcIPAddr": "1.3.6.1.4.1.2011.5.25.123.1.8", "hwEthernetARPSpeedLimitDstIPAddr": "1.3.6.1.4.1.2011.5.25.123.1.9", "hwEthernetARPSpeedLimitVPNinstance": "1.3.6.1.4.1.2011.5.25.123.1.10", "hwEthernetARPInterfaceName": "1.3.6.1.4.1.2011.5.25.123.1.39.4"]
]

// --- hwEthernetARPAntiAttackAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.123.2.2
// Fields: hwEthernetARPAntiAttackIpAddress, hwEthernetARPAntiAttackMacAddress, hwEthernetARPAntiAttackVlanId, hwEthernetARPAntiAttackIfName
// Description: Trap information about ARP anti-attack: IP address, MAC, VLAN id, interface index.
trapMap["1.3.6.1.4.1.2011.5.25.123.2.2"] = [
    name: "hwEthernetARPAntiAttackAlarm",
    fields: ["hwEthernetARPAntiAttackIpAddress", "hwEthernetARPAntiAttackMacAddress", "hwEthernetARPAntiAttackVlanId", "hwEthernetARPAntiAttackIfName"],
    fieldOids: ["hwEthernetARPAntiAttackIpAddress": "1.3.6.1.4.1.2011.5.25.123.1.22.1", "hwEthernetARPAntiAttackMacAddress": "1.3.6.1.4.1.2011.5.25.123.1.22.2", "hwEthernetARPAntiAttackVlanId": "1.3.6.1.4.1.2011.5.25.123.1.22.3", "hwEthernetARPAntiAttackIfName": "1.3.6.1.4.1.2011.5.25.123.1.22.4"]
]

// --- hwEthernetARPAntiGatewayConflictAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.123.2.3
// Fields: hwEthernetARPAntiGatewayConflictIpAddress, hwEthernetARPAntiGatewayConflictMacAddress, hwEthernetARPAntiGatewayConflictVlanId, hwEthernetARPAntiGatewayConflictIfName
// Description: Trap information about ARP anti-attack: IP address, MAC, VLAN ID, interface index.
trapMap["1.3.6.1.4.1.2011.5.25.123.2.3"] = [
    name: "hwEthernetARPAntiGatewayConflictAlarm",
    fields: ["hwEthernetARPAntiGatewayConflictIpAddress", "hwEthernetARPAntiGatewayConflictMacAddress", "hwEthernetARPAntiGatewayConflictVlanId", "hwEthernetARPAntiGatewayConflictIfName"],
    fieldOids: ["hwEthernetARPAntiGatewayConflictIpAddress": "1.3.6.1.4.1.2011.5.25.123.1.23.1.2", "hwEthernetARPAntiGatewayConflictMacAddress": "1.3.6.1.4.1.2011.5.25.123.1.23.1.3", "hwEthernetARPAntiGatewayConflictVlanId": "1.3.6.1.4.1.2011.5.25.123.1.23.1.4", "hwEthernetARPAntiGatewayConflictIfName": "1.3.6.1.4.1.2011.5.25.123.1.23.1.5"]
]

// --- hwEthernetARPThresholdExceedAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.123.2.4
// Fields: entPhysicalName, hwEthernetARPThresholdValue, hwEthernetARPThresholdDynamicNumber, hwEthernetARPThresholdStaticNumber
// Description: Trap information about ARP exceed threshold: slot, threshold, number of dynamic ARP, number of static ARP.
trapMap["1.3.6.1.4.1.2011.5.25.123.2.4"] = [
    name: "hwEthernetARPThresholdExceedAlarm",
    fields: ["entPhysicalName", "hwEthernetARPThresholdValue", "hwEthernetARPThresholdDynamicNumber", "hwEthernetARPThresholdStaticNumber"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEthernetARPThresholdValue": "1.3.6.1.4.1.2011.5.25.123.1.26.1", "hwEthernetARPThresholdDynamicNumber": "1.3.6.1.4.1.2011.5.25.123.1.26.2", "hwEthernetARPThresholdStaticNumber": "1.3.6.1.4.1.2011.5.25.123.1.26.3"]
]

// --- hwEthernetARPThresholdResumeAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.123.2.5
// Fields: entPhysicalName, hwEthernetARPThresholdValue, hwEthernetARPThresholdDynamicNumber, hwEthernetARPThresholdStaticNumber
// Description: Trap information about ARP resume threshold: slot, threshold, number of dynamic ARP, number of static ARP.
trapMap["1.3.6.1.4.1.2011.5.25.123.2.5"] = [
    name: "hwEthernetARPThresholdResumeAlarm",
    fields: ["entPhysicalName", "hwEthernetARPThresholdValue", "hwEthernetARPThresholdDynamicNumber", "hwEthernetARPThresholdStaticNumber"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEthernetARPThresholdValue": "1.3.6.1.4.1.2011.5.25.123.1.26.1", "hwEthernetARPThresholdDynamicNumber": "1.3.6.1.4.1.2011.5.25.123.1.26.2", "hwEthernetARPThresholdStaticNumber": "1.3.6.1.4.1.2011.5.25.123.1.26.3"]
]

// --- hwEthernetARPIPConflictEvent (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.123.2.6
// Fields: hwEthernetARPIPConflictIPAddress, hwEthernetARPIPConflictLocalMAC, hwEthernetARPIPConflictLocalInterfaceName, hwEthernetARPIPConflictLocalVLAN, hwEthernetARPIPConflictLocalCEVLAN, hwEthernetARPIPConflictReceiveMAC, hwEthernetARPIPConflictReceiveInterfaceName, hwEthernetARPIPConflictReceiveVLAN, hwEthernetARPIPConflictReceiveCEVLAN, hwEthernetARPIPConflictType
// Description: Trap information about ARP IP conflict.
trapMap["1.3.6.1.4.1.2011.5.25.123.2.6"] = [
    name: "hwEthernetARPIPConflictEvent",
    fields: ["hwEthernetARPIPConflictIPAddress", "hwEthernetARPIPConflictLocalMAC", "hwEthernetARPIPConflictLocalInterfaceName", "hwEthernetARPIPConflictLocalVLAN", "hwEthernetARPIPConflictLocalCEVLAN", "hwEthernetARPIPConflictReceiveMAC", "hwEthernetARPIPConflictReceiveInterfaceName", "hwEthernetARPIPConflictReceiveVLAN", "hwEthernetARPIPConflictReceiveCEVLAN", "hwEthernetARPIPConflictType"],
    fieldOids: ["hwEthernetARPIPConflictIPAddress": "1.3.6.1.4.1.2011.5.25.123.1.28.1", "hwEthernetARPIPConflictLocalMAC": "1.3.6.1.4.1.2011.5.25.123.1.28.3", "hwEthernetARPIPConflictLocalInterfaceName": "1.3.6.1.4.1.2011.5.25.123.1.28.2", "hwEthernetARPIPConflictLocalVLAN": "1.3.6.1.4.1.2011.5.25.123.1.28.4", "hwEthernetARPIPConflictLocalCEVLAN": "1.3.6.1.4.1.2011.5.25.123.1.28.5", "hwEthernetARPIPConflictReceiveMAC": "1.3.6.1.4.1.2011.5.25.123.1.28.7", "hwEthernetARPIPConflictReceiveInterfaceName": "1.3.6.1.4.1.2011.5.25.123.1.28.6", "hwEthernetARPIPConflictReceiveVLAN": "1.3.6.1.4.1.2011.5.25.123.1.28.8", "hwEthernetARPIPConflictReceiveCEVLAN": "1.3.6.1.4.1.2011.5.25.123.1.28.9", "hwEthernetARPIPConflictType": "1.3.6.1.4.1.2011.5.25.123.1.28.10"]
]

// --- hwEthernetARPMACIPConflict (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.123.2.7
// Fields: hwEthernetARPIPConflictLocalInterfaceName, hwEthernetARPIPConflictReceiveMAC, hwEthernetARPIPConflictIPAddress, hwEthernetARPReceiveDstMAC, hwEthernetARPReceiveDstIPAddr, hwEthernetARPIPConflictReceiveVLAN, hwEthernetARPIPConflictReceiveCEVLAN, hwEthernetARPIPConflictReceiveInterfaceName
// Description: This object indicates a MAC or IP address conflict.
trapMap["1.3.6.1.4.1.2011.5.25.123.2.7"] = [
    name: "hwEthernetARPMACIPConflict",
    fields: ["hwEthernetARPIPConflictLocalInterfaceName", "hwEthernetARPIPConflictReceiveMAC", "hwEthernetARPIPConflictIPAddress", "hwEthernetARPReceiveDstMAC", "hwEthernetARPReceiveDstIPAddr", "hwEthernetARPIPConflictReceiveVLAN", "hwEthernetARPIPConflictReceiveCEVLAN", "hwEthernetARPIPConflictReceiveInterfaceName"],
    fieldOids: ["hwEthernetARPIPConflictLocalInterfaceName": "1.3.6.1.4.1.2011.5.25.123.1.28.2", "hwEthernetARPIPConflictReceiveMAC": "1.3.6.1.4.1.2011.5.25.123.1.28.7", "hwEthernetARPIPConflictIPAddress": "1.3.6.1.4.1.2011.5.25.123.1.28.1", "hwEthernetARPReceiveDstMAC": "1.3.6.1.4.1.2011.5.25.123.1.28.12", "hwEthernetARPReceiveDstIPAddr": "1.3.6.1.4.1.2011.5.25.123.1.28.11", "hwEthernetARPIPConflictReceiveVLAN": "1.3.6.1.4.1.2011.5.25.123.1.28.8", "hwEthernetARPIPConflictReceiveCEVLAN": "1.3.6.1.4.1.2011.5.25.123.1.28.9", "hwEthernetARPIPConflictReceiveInterfaceName": "1.3.6.1.4.1.2011.5.25.123.1.28.6"]
]

// --- hwEthernetARPMACIPConflictResolved (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.123.2.8
// Fields: hwEthernetARPIPConflictLocalInterfaceName, hwEthernetARPIPConflictReceiveMAC, hwEthernetARPIPConflictIPAddress
// Description: This object indicates a MAC or IP address conflict.
trapMap["1.3.6.1.4.1.2011.5.25.123.2.8"] = [
    name: "hwEthernetARPMACIPConflictResolved",
    fields: ["hwEthernetARPIPConflictLocalInterfaceName", "hwEthernetARPIPConflictReceiveMAC", "hwEthernetARPIPConflictIPAddress"],
    fieldOids: ["hwEthernetARPIPConflictLocalInterfaceName": "1.3.6.1.4.1.2011.5.25.123.1.28.2", "hwEthernetARPIPConflictReceiveMAC": "1.3.6.1.4.1.2011.5.25.123.1.28.7", "hwEthernetARPIPConflictIPAddress": "1.3.6.1.4.1.2011.5.25.123.1.28.1"]
]

// --- hwEthernetARPLearnStopAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.123.2.9
// Fields: hwEthernetARPLearnStopSlot, hwEthernetARPLearnStopThreshold
// Description: Trap information about ARP learning disable: memory usage threshold.
trapMap["1.3.6.1.4.1.2011.5.25.123.2.9"] = [
    name: "hwEthernetARPLearnStopAlarm",
    fields: ["hwEthernetARPLearnStopSlot", "hwEthernetARPLearnStopThreshold"],
    fieldOids: ["hwEthernetARPLearnStopSlot": "1.3.6.1.4.1.2011.5.25.123.1.29.1.1", "hwEthernetARPLearnStopThreshold": "1.3.6.1.4.1.2011.5.25.123.1.29.1.2"]
]

// --- hwEthernetARPLearnResumeAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.123.2.10
// Fields: hwEthernetARPLearnStopSlot, hwEthernetARPLearnStopThreshold
// Description: Trap information about ARP learning enable: memory usage threshold.
trapMap["1.3.6.1.4.1.2011.5.25.123.2.10"] = [
    name: "hwEthernetARPLearnResumeAlarm",
    fields: ["hwEthernetARPLearnStopSlot", "hwEthernetARPLearnStopThreshold"],
    fieldOids: ["hwEthernetARPLearnStopSlot": "1.3.6.1.4.1.2011.5.25.123.1.29.1.1", "hwEthernetARPLearnStopThreshold": "1.3.6.1.4.1.2011.5.25.123.1.29.1.2"]
]

// --- hwEthernetARPRemoteBackupFailAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.123.2.11
// Fields: hwEthernetARPRemoteBackupFailMainIfName
// Description: Trap information about the remote ARP entry backup failure.
trapMap["1.3.6.1.4.1.2011.5.25.123.2.11"] = [
    name: "hwEthernetARPRemoteBackupFailAlarm",
    fields: ["hwEthernetARPRemoteBackupFailMainIfName"],
    fieldOids: ["hwEthernetARPRemoteBackupFailMainIfName": "1.3.6.1.4.1.2011.5.25.123.1.31.1"]
]

// --- hwEthernetARPRemoteBackupFailResumeAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.123.2.12
// Fields: hwEthernetARPRemoteBackupFailMainIfName
// Description: Trap clearing information when the backup device detects that ARP entries are successfully backed up within a period.
trapMap["1.3.6.1.4.1.2011.5.25.123.2.12"] = [
    name: "hwEthernetARPRemoteBackupFailResumeAlarm",
    fields: ["hwEthernetARPRemoteBackupFailMainIfName"],
    fieldOids: ["hwEthernetARPRemoteBackupFailMainIfName": "1.3.6.1.4.1.2011.5.25.123.1.31.1"]
]

// --- hwEthernetARPHostIPConflict (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.123.2.13
// Fields: hwEthernetARPHostMAC, hwEthernetARPGatewayVtepIP, hwEthernetARPHostMAC, hwEthernetARPGatewayVtepIP, hwEthernetARPInterface, hwEthernetARPInterface
// Description: Trap information about host IP address conflict: local host MAC address, local gateway VTEP IP address, remote host MAC address, remote gateway VTEP IP address, local host interface, remote host confl...
trapMap["1.3.6.1.4.1.2011.5.25.123.2.13"] = [
    name: "hwEthernetARPHostIPConflict",
    fields: ["hwEthernetARPHostMAC", "hwEthernetARPGatewayVtepIP", "hwEthernetARPHostMAC", "hwEthernetARPGatewayVtepIP", "hwEthernetARPInterface", "hwEthernetARPInterface"],
    fieldOids: ["hwEthernetARPHostMAC": "1.3.6.1.4.1.2011.5.25.123.1.32.1.3", "hwEthernetARPGatewayVtepIP": "1.3.6.1.4.1.2011.5.25.123.1.32.1.4", "hwEthernetARPInterface": "1.3.6.1.4.1.2011.5.25.123.1.32.1.5"]
]

// --- hwEthernetARPHostIPConflictResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.123.2.14
// Fields: hwEthernetARPHostMAC, hwEthernetARPGatewayVtepIP, hwEthernetARPHostMAC, hwEthernetARPGatewayVtepIP, hwEthernetARPInterface, hwEthernetARPInterface
// Description: Trap information about host IP address conflict resolved: local host MAC address, local gateway VTEP IP address, remote host MAC address, remote gateway VTEP IP address, local host interface, remote h...
trapMap["1.3.6.1.4.1.2011.5.25.123.2.14"] = [
    name: "hwEthernetARPHostIPConflictResume",
    fields: ["hwEthernetARPHostMAC", "hwEthernetARPGatewayVtepIP", "hwEthernetARPHostMAC", "hwEthernetARPGatewayVtepIP", "hwEthernetARPInterface", "hwEthernetARPInterface"],
    fieldOids: ["hwEthernetARPHostMAC": "1.3.6.1.4.1.2011.5.25.123.1.32.1.3", "hwEthernetARPGatewayVtepIP": "1.3.6.1.4.1.2011.5.25.123.1.32.1.4", "hwEthernetARPInterface": "1.3.6.1.4.1.2011.5.25.123.1.32.1.5"]
]

// --- hwEthernetARPGateWayDuplicateAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.123.2.15
// Fields: hwEthernetARPGateWayIfName, hwEthernetARPGateWayPortName, hwEthernetARPGateWayIP
// Description: Trap information about ARP gateway duplicate: Received an ARP packet with a duplicate IP address from the interface.
trapMap["1.3.6.1.4.1.2011.5.25.123.2.15"] = [
    name: "hwEthernetARPGateWayDuplicateAlarm",
    fields: ["hwEthernetARPGateWayIfName", "hwEthernetARPGateWayPortName", "hwEthernetARPGateWayIP"],
    fieldOids: ["hwEthernetARPGateWayIfName": "1.3.6.1.4.1.2011.5.25.123.1.34.1.1", "hwEthernetARPGateWayPortName": "1.3.6.1.4.1.2011.5.25.123.1.34.1.2", "hwEthernetARPGateWayIP": "1.3.6.1.4.1.2011.5.25.123.1.34.1.3"]
]

// --- hwEthernetARPGateWayDuplicateAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.123.2.16
// Fields: hwEthernetARPGateWayIfName, hwEthernetARPGateWayPortName, hwEthernetARPGateWayIP
// Description: Trap information about ARP gateway duplicate resolved: Received an ARP packet with a duplicate IP address from the interface.
trapMap["1.3.6.1.4.1.2011.5.25.123.2.16"] = [
    name: "hwEthernetARPGateWayDuplicateAlarmResume",
    fields: ["hwEthernetARPGateWayIfName", "hwEthernetARPGateWayPortName", "hwEthernetARPGateWayIP"],
    fieldOids: ["hwEthernetARPGateWayIfName": "1.3.6.1.4.1.2011.5.25.123.1.34.1.1", "hwEthernetARPGateWayPortName": "1.3.6.1.4.1.2011.5.25.123.1.34.1.2", "hwEthernetARPGateWayIP": "1.3.6.1.4.1.2011.5.25.123.1.34.1.3"]
]

// --- hwFwdArpAlarmOccur (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.123.2.17
// Fields: hwFwdArpSlotName, hwFwdArpPortName
// Description: This object indicates that an alarm is reported.
trapMap["1.3.6.1.4.1.2011.5.25.123.2.17"] = [
    name: "hwFwdArpAlarmOccur",
    fields: ["hwFwdArpSlotName", "hwFwdArpPortName"],
    fieldOids: ["hwFwdArpSlotName": "1.3.6.1.4.1.2011.5.25.123.1.35", "hwFwdArpPortName": "1.3.6.1.4.1.2011.5.25.123.1.36"]
]

// --- hwFwdArpAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.123.2.18
// Fields: hwFwdArpSlotName, hwFwdArpPortName
// Description: This object indicates that the alarm is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.123.2.18"] = [
    name: "hwFwdArpAlarmResume",
    fields: ["hwFwdArpSlotName", "hwFwdArpPortName"],
    fieldOids: ["hwFwdArpSlotName": "1.3.6.1.4.1.2011.5.25.123.1.35", "hwFwdArpPortName": "1.3.6.1.4.1.2011.5.25.123.1.36"]
]

// --- hwEthernetARPLimitExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.123.2.19
// Fields: hwEthernetARPLimitExceedInterface, hwEthernetARPLimitExceedLimitNumber, hwEthernetARPLimitExceedLearnedNumber
// Description: This object indicates the alarm generated when the number of ARP entries on an interface exceeds the specified alarm threshold.
trapMap["1.3.6.1.4.1.2011.5.25.123.2.19"] = [
    name: "hwEthernetARPLimitExceed",
    fields: ["hwEthernetARPLimitExceedInterface", "hwEthernetARPLimitExceedLimitNumber", "hwEthernetARPLimitExceedLearnedNumber"],
    fieldOids: ["hwEthernetARPLimitExceedInterface": "1.3.6.1.4.1.2011.5.25.123.1.37.1.1", "hwEthernetARPLimitExceedLimitNumber": "1.3.6.1.4.1.2011.5.25.123.1.37.1.2", "hwEthernetARPLimitExceedLearnedNumber": "1.3.6.1.4.1.2011.5.25.123.1.37.1.3"]
]

// --- hwEthernetARPLimitExceedResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.123.2.20
// Fields: hwEthernetARPLimitExceedInterface, hwEthernetARPLimitExceedLimitNumber, hwEthernetARPLimitExceedLearnedNumber, hwEthernetARPLimitExceedRecoverReason
// Description: This object indicates the clear alarm of the alarm generated when the number of ARP entries on an interface exceeds the specified alarm threshold.
trapMap["1.3.6.1.4.1.2011.5.25.123.2.20"] = [
    name: "hwEthernetARPLimitExceedResume",
    fields: ["hwEthernetARPLimitExceedInterface", "hwEthernetARPLimitExceedLimitNumber", "hwEthernetARPLimitExceedLearnedNumber", "hwEthernetARPLimitExceedRecoverReason"],
    fieldOids: ["hwEthernetARPLimitExceedInterface": "1.3.6.1.4.1.2011.5.25.123.1.37.1.1", "hwEthernetARPLimitExceedLimitNumber": "1.3.6.1.4.1.2011.5.25.123.1.37.1.2", "hwEthernetARPLimitExceedLearnedNumber": "1.3.6.1.4.1.2011.5.25.123.1.37.1.3", "hwEthernetARPLimitExceedRecoverReason": "1.3.6.1.4.1.2011.5.25.123.1.37.1.4"]
]

// --- hwARPBDHostConflictAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.123.2.21
// Fields: hwARPLocalIPAddr, hwARPLocalBDId, hwARPLocalMAC, hwARPRemoteIPAddr, hwARPRemoteBDId, hwARPRemoteMAC, hwARPLocalInterface, hwARPRemoteInterface, hwARPTunnelPeer
// Description: Trap information about host conflict: local IP address, local MAC address, local bridge domain, remote IP address, remote MAC address, remote bridge domain.
trapMap["1.3.6.1.4.1.2011.5.25.123.2.21"] = [
    name: "hwARPBDHostConflictAlarm",
    fields: ["hwARPLocalIPAddr", "hwARPLocalBDId", "hwARPLocalMAC", "hwARPRemoteIPAddr", "hwARPRemoteBDId", "hwARPRemoteMAC", "hwARPLocalInterface", "hwARPRemoteInterface", "hwARPTunnelPeer"],
    fieldOids: ["hwARPLocalIPAddr": "1.3.6.1.4.1.2011.5.25.123.1.38.1", "hwARPLocalBDId": "1.3.6.1.4.1.2011.5.25.123.1.38.2", "hwARPLocalMAC": "1.3.6.1.4.1.2011.5.25.123.1.38.3", "hwARPRemoteIPAddr": "1.3.6.1.4.1.2011.5.25.123.1.38.4", "hwARPRemoteBDId": "1.3.6.1.4.1.2011.5.25.123.1.38.5", "hwARPRemoteMAC": "1.3.6.1.4.1.2011.5.25.123.1.38.6", "hwARPLocalInterface": "1.3.6.1.4.1.2011.5.25.123.1.38.7", "hwARPRemoteInterface": "1.3.6.1.4.1.2011.5.25.123.1.38.8", "hwARPTunnelPeer": "1.3.6.1.4.1.2011.5.25.123.1.38.9"]
]

// --- hwARPBDHostConflictResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.123.2.22
// Fields: hwARPLocalIPAddr, hwARPLocalBDId, hwARPLocalMAC, hwARPRemoteIPAddr, hwARPRemoteBDId, hwARPRemoteMAC, hwARPLocalInterface, hwARPRemoteInterface, hwARPTunnelPeer
// Description: Trap information about host conflict resolved: local IP address, local MAC address, local bridge domain, remote IP address, remote MAC address, remote bridge domain.
trapMap["1.3.6.1.4.1.2011.5.25.123.2.22"] = [
    name: "hwARPBDHostConflictResume",
    fields: ["hwARPLocalIPAddr", "hwARPLocalBDId", "hwARPLocalMAC", "hwARPRemoteIPAddr", "hwARPRemoteBDId", "hwARPRemoteMAC", "hwARPLocalInterface", "hwARPRemoteInterface", "hwARPTunnelPeer"],
    fieldOids: ["hwARPLocalIPAddr": "1.3.6.1.4.1.2011.5.25.123.1.38.1", "hwARPLocalBDId": "1.3.6.1.4.1.2011.5.25.123.1.38.2", "hwARPLocalMAC": "1.3.6.1.4.1.2011.5.25.123.1.38.3", "hwARPRemoteIPAddr": "1.3.6.1.4.1.2011.5.25.123.1.38.4", "hwARPRemoteBDId": "1.3.6.1.4.1.2011.5.25.123.1.38.5", "hwARPRemoteMAC": "1.3.6.1.4.1.2011.5.25.123.1.38.6", "hwARPLocalInterface": "1.3.6.1.4.1.2011.5.25.123.1.38.7", "hwARPRemoteInterface": "1.3.6.1.4.1.2011.5.25.123.1.38.8", "hwARPTunnelPeer": "1.3.6.1.4.1.2011.5.25.123.1.38.9"]
]

// --- hwEthernetARPDuplicateIPaddr (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.123.2.23
// Fields: hwEthernetARPInterfaceName, hwEthernetARPIPAddress, hwEthernetARPLocalMAC, hwEthernetARPReceivePeVLAN, hwEthernetARPReceiveCEVLAN
// Description: When customer config interface IP address with the same as the current IP address on the network, trigger the warning.
trapMap["1.3.6.1.4.1.2011.5.25.123.2.23"] = [
    name: "hwEthernetARPDuplicateIPaddr",
    fields: ["hwEthernetARPInterfaceName", "hwEthernetARPIPAddress", "hwEthernetARPLocalMAC", "hwEthernetARPReceivePeVLAN", "hwEthernetARPReceiveCEVLAN"],
    fieldOids: ["hwEthernetARPInterfaceName": "1.3.6.1.4.1.2011.5.25.123.1.39.4", "hwEthernetARPIPAddress": "1.3.6.1.4.1.2011.5.25.123.1.39.5", "hwEthernetARPLocalMAC": "1.3.6.1.4.1.2011.5.25.123.1.39.6", "hwEthernetARPReceivePeVLAN": "1.3.6.1.4.1.2011.5.25.123.1.39.7", "hwEthernetARPReceiveCEVLAN": "1.3.6.1.4.1.2011.5.25.123.1.39.8"]
]

// --- hwEthernetARPDuplicateIPaddrClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.123.2.24
// Fields: hwEthernetARPInterfaceName, hwEthernetARPIPAddress, hwEthernetARPLocalMAC, hwEthernetARPReceivePeVLAN, hwEthernetARPReceiveCEVLAN
// Description: The alarm of Received an ARP packet with a duplicate IP address from the interface is resolved.
trapMap["1.3.6.1.4.1.2011.5.25.123.2.24"] = [
    name: "hwEthernetARPDuplicateIPaddrClear",
    fields: ["hwEthernetARPInterfaceName", "hwEthernetARPIPAddress", "hwEthernetARPLocalMAC", "hwEthernetARPReceivePeVLAN", "hwEthernetARPReceiveCEVLAN"],
    fieldOids: ["hwEthernetARPInterfaceName": "1.3.6.1.4.1.2011.5.25.123.1.39.4", "hwEthernetARPIPAddress": "1.3.6.1.4.1.2011.5.25.123.1.39.5", "hwEthernetARPLocalMAC": "1.3.6.1.4.1.2011.5.25.123.1.39.6", "hwEthernetARPReceivePeVLAN": "1.3.6.1.4.1.2011.5.25.123.1.39.7", "hwEthernetARPReceiveCEVLAN": "1.3.6.1.4.1.2011.5.25.123.1.39.8"]
]

// --- hwEthernetARPProbeFailure (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.123.2.25
// Fields: hwEthernetARPInterfaceName, hwEthernetARPProbePortName, hwEthernetARPIPAddress
// Description: The ARP on the interface failed to probe the IPv4 address of the peer-end device.
trapMap["1.3.6.1.4.1.2011.5.25.123.2.25"] = [
    name: "hwEthernetARPProbeFailure",
    fields: ["hwEthernetARPInterfaceName", "hwEthernetARPProbePortName", "hwEthernetARPIPAddress"],
    fieldOids: ["hwEthernetARPInterfaceName": "1.3.6.1.4.1.2011.5.25.123.1.39.4", "hwEthernetARPProbePortName": "1.3.6.1.4.1.2011.5.25.123.1.39.9", "hwEthernetARPIPAddress": "1.3.6.1.4.1.2011.5.25.123.1.39.5"]
]

// --- hwEthernetARPProbeFailureClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.123.2.26
// Fields: hwEthernetARPInterfaceName, hwEthernetARPProbePortName, hwEthernetARPIPAddress
// Description: The probe failure of ARP on the interface was resolved.
trapMap["1.3.6.1.4.1.2011.5.25.123.2.26"] = [
    name: "hwEthernetARPProbeFailureClear",
    fields: ["hwEthernetARPInterfaceName", "hwEthernetARPProbePortName", "hwEthernetARPIPAddress"],
    fieldOids: ["hwEthernetARPInterfaceName": "1.3.6.1.4.1.2011.5.25.123.1.39.4", "hwEthernetARPProbePortName": "1.3.6.1.4.1.2011.5.25.123.1.39.9", "hwEthernetARPIPAddress": "1.3.6.1.4.1.2011.5.25.123.1.39.5"]
]

// --- hwEthernetARPReplaceExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.123.2.27
// Fields: hwEthernetARPInterfaceName, hwEthernetARPIPAddress, hwEthernetARPReplaceRateOldMAC, hwEthernetARPReplaceRateNewMAC, hwEthernetARPReplaceRateThresholdValue
// Description: When the times of ARP table replaced in one minute exceed the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.123.2.27"] = [
    name: "hwEthernetARPReplaceExceed",
    fields: ["hwEthernetARPInterfaceName", "hwEthernetARPIPAddress", "hwEthernetARPReplaceRateOldMAC", "hwEthernetARPReplaceRateNewMAC", "hwEthernetARPReplaceRateThresholdValue"],
    fieldOids: ["hwEthernetARPInterfaceName": "1.3.6.1.4.1.2011.5.25.123.1.39.4", "hwEthernetARPIPAddress": "1.3.6.1.4.1.2011.5.25.123.1.39.5", "hwEthernetARPReplaceRateOldMAC": "1.3.6.1.4.1.2011.5.25.123.1.39.10", "hwEthernetARPReplaceRateNewMAC": "1.3.6.1.4.1.2011.5.25.123.1.39.11", "hwEthernetARPReplaceRateThresholdValue": "1.3.6.1.4.1.2011.5.25.123.1.39.12"]
]

// --- hwEthernetARPReplaceExceedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.123.2.28
// Fields: hwEthernetARPInterfaceName, hwEthernetARPIPAddress, hwEthernetARPReplaceRateOldMAC, hwEthernetARPReplaceRateNewMAC, hwEthernetARPReplaceRateThresholdValue
// Description: The alarm of ARP table replace rate exceeding threshold is resolved.
trapMap["1.3.6.1.4.1.2011.5.25.123.2.28"] = [
    name: "hwEthernetARPReplaceExceedClear",
    fields: ["hwEthernetARPInterfaceName", "hwEthernetARPIPAddress", "hwEthernetARPReplaceRateOldMAC", "hwEthernetARPReplaceRateNewMAC", "hwEthernetARPReplaceRateThresholdValue"],
    fieldOids: ["hwEthernetARPInterfaceName": "1.3.6.1.4.1.2011.5.25.123.1.39.4", "hwEthernetARPIPAddress": "1.3.6.1.4.1.2011.5.25.123.1.39.5", "hwEthernetARPReplaceRateOldMAC": "1.3.6.1.4.1.2011.5.25.123.1.39.10", "hwEthernetARPReplaceRateNewMAC": "1.3.6.1.4.1.2011.5.25.123.1.39.11", "hwEthernetARPReplaceRateThresholdValue": "1.3.6.1.4.1.2011.5.25.123.1.39.12"]
]

// --- hwEthernetARPSpeedLimit (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.123.2.29
// Fields: hwEthernetARPInterfaceName, hwEthernetARPSpeedLimitOldValue, hwEthernetARPSpeedLimitCurValue, hwEthernetARPSpeedLimitSupType, hwEthernetARPSpeedLimitSrcIp, hwEthernetARPSpeedLimitDstIp, hwEthernetARPSpeedLimitVpnName
// Description: ARP packet speed in 1s exceeded the configured speed limit.
trapMap["1.3.6.1.4.1.2011.5.25.123.2.29"] = [
    name: "hwEthernetARPSpeedLimit",
    fields: ["hwEthernetARPInterfaceName", "hwEthernetARPSpeedLimitOldValue", "hwEthernetARPSpeedLimitCurValue", "hwEthernetARPSpeedLimitSupType", "hwEthernetARPSpeedLimitSrcIp", "hwEthernetARPSpeedLimitDstIp", "hwEthernetARPSpeedLimitVpnName"],
    fieldOids: ["hwEthernetARPInterfaceName": "1.3.6.1.4.1.2011.5.25.123.1.39.4", "hwEthernetARPSpeedLimitOldValue": "1.3.6.1.4.1.2011.5.25.123.1.39.13", "hwEthernetARPSpeedLimitCurValue": "1.3.6.1.4.1.2011.5.25.123.1.39.14", "hwEthernetARPSpeedLimitSupType": "1.3.6.1.4.1.2011.5.25.123.1.39.15", "hwEthernetARPSpeedLimitSrcIp": "1.3.6.1.4.1.2011.5.25.123.1.39.16", "hwEthernetARPSpeedLimitDstIp": "1.3.6.1.4.1.2011.5.25.123.1.39.17", "hwEthernetARPSpeedLimitVpnName": "1.3.6.1.4.1.2011.5.25.123.1.39.18"]
]

// --- hwEthernetARPSpeedLimitClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.123.2.30
// Fields: hwEthernetARPInterfaceName, hwEthernetARPSpeedLimitOldValue, hwEthernetARPSpeedLimitCurValue, hwEthernetARPSpeedLimitSupType, hwEthernetARPSpeedLimitSrcIp, hwEthernetARPSpeedLimitDstIp, hwEthernetARPSpeedLimitVpnName
// Description: ARP packet speed in 1s belowed 90 percent of the configured speed limit.
trapMap["1.3.6.1.4.1.2011.5.25.123.2.30"] = [
    name: "hwEthernetARPSpeedLimitClear",
    fields: ["hwEthernetARPInterfaceName", "hwEthernetARPSpeedLimitOldValue", "hwEthernetARPSpeedLimitCurValue", "hwEthernetARPSpeedLimitSupType", "hwEthernetARPSpeedLimitSrcIp", "hwEthernetARPSpeedLimitDstIp", "hwEthernetARPSpeedLimitVpnName"],
    fieldOids: ["hwEthernetARPInterfaceName": "1.3.6.1.4.1.2011.5.25.123.1.39.4", "hwEthernetARPSpeedLimitOldValue": "1.3.6.1.4.1.2011.5.25.123.1.39.13", "hwEthernetARPSpeedLimitCurValue": "1.3.6.1.4.1.2011.5.25.123.1.39.14", "hwEthernetARPSpeedLimitSupType": "1.3.6.1.4.1.2011.5.25.123.1.39.15", "hwEthernetARPSpeedLimitSrcIp": "1.3.6.1.4.1.2011.5.25.123.1.39.16", "hwEthernetARPSpeedLimitDstIp": "1.3.6.1.4.1.2011.5.25.123.1.39.17", "hwEthernetARPSpeedLimitVpnName": "1.3.6.1.4.1.2011.5.25.123.1.39.18"]
]

// --- hwEthernetARPDuplicateMacEvent (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.123.2.31
// Fields: hwEthernetARPInterfaceName, hwEthernetARPIPAddress, hwEthernetARPLocalMAC, hwEthernetARPReceivePeVLAN, hwEthernetARPReceiveCEVLAN
// Description: Received an ARP packet with a conflictive MAC address from the interface: interface name, IP address, MAC address, PE VLAN and CE VLAN.
trapMap["1.3.6.1.4.1.2011.5.25.123.2.31"] = [
    name: "hwEthernetARPDuplicateMacEvent",
    fields: ["hwEthernetARPInterfaceName", "hwEthernetARPIPAddress", "hwEthernetARPLocalMAC", "hwEthernetARPReceivePeVLAN", "hwEthernetARPReceiveCEVLAN"],
    fieldOids: ["hwEthernetARPInterfaceName": "1.3.6.1.4.1.2011.5.25.123.1.39.4", "hwEthernetARPIPAddress": "1.3.6.1.4.1.2011.5.25.123.1.39.5", "hwEthernetARPLocalMAC": "1.3.6.1.4.1.2011.5.25.123.1.39.6", "hwEthernetARPReceivePeVLAN": "1.3.6.1.4.1.2011.5.25.123.1.39.7", "hwEthernetARPReceiveCEVLAN": "1.3.6.1.4.1.2011.5.25.123.1.39.8"]
]

// --- hwEthernetARPEntryExceedAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.123.2.32
// Fields: entPhysicalName, hwEthernetARPEntrySpecValue, hwEthernetARPEntrySpecDynamicNumber, hwEthernetARPEntrySpecStaticNumber
// Description: Trap information about ARP entries exceed spec: slot, spec, number of dynamic ARP and number of static ARP.
trapMap["1.3.6.1.4.1.2011.5.25.123.2.32"] = [
    name: "hwEthernetARPEntryExceedAlarm",
    fields: ["entPhysicalName", "hwEthernetARPEntrySpecValue", "hwEthernetARPEntrySpecDynamicNumber", "hwEthernetARPEntrySpecStaticNumber"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEthernetARPEntrySpecValue": "1.3.6.1.4.1.2011.5.25.123.1.39.1", "hwEthernetARPEntrySpecDynamicNumber": "1.3.6.1.4.1.2011.5.25.123.1.39.2", "hwEthernetARPEntrySpecStaticNumber": "1.3.6.1.4.1.2011.5.25.123.1.39.3"]
]

// --- hwEthernetARPEntryResumeAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.123.2.33
// Fields: entPhysicalName, hwEthernetARPEntrySpecValue, hwEthernetARPEntrySpecDynamicNumber, hwEthernetARPEntrySpecStaticNumber
// Description: Trap information about ARP entries resume spec: slot, spec, number of dynamic ARP and number of static ARP.
trapMap["1.3.6.1.4.1.2011.5.25.123.2.33"] = [
    name: "hwEthernetARPEntryResumeAlarm",
    fields: ["entPhysicalName", "hwEthernetARPEntrySpecValue", "hwEthernetARPEntrySpecDynamicNumber", "hwEthernetARPEntrySpecStaticNumber"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEthernetARPEntrySpecValue": "1.3.6.1.4.1.2011.5.25.123.1.39.1", "hwEthernetARPEntrySpecDynamicNumber": "1.3.6.1.4.1.2011.5.25.123.1.39.2", "hwEthernetARPEntrySpecStaticNumber": "1.3.6.1.4.1.2011.5.25.123.1.39.3"]
]

// --- hwEthernetARPDynamicEntryExceedAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.123.2.34
// Fields: entPhysicalName, hwEthernetARPEntrySpecValue, hwEthernetARPEntrySpecDynamicNumber
// Description: Trap information about ARP dynamic entries exceed spec: slot, spec, number of dynamic ARP.
trapMap["1.3.6.1.4.1.2011.5.25.123.2.34"] = [
    name: "hwEthernetARPDynamicEntryExceedAlarm",
    fields: ["entPhysicalName", "hwEthernetARPEntrySpecValue", "hwEthernetARPEntrySpecDynamicNumber"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEthernetARPEntrySpecValue": "1.3.6.1.4.1.2011.5.25.123.1.39.1", "hwEthernetARPEntrySpecDynamicNumber": "1.3.6.1.4.1.2011.5.25.123.1.39.2"]
]

// --- hwEthernetARPDynamicEntryResumeAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.123.2.35
// Fields: entPhysicalName, hwEthernetARPEntrySpecValue, hwEthernetARPEntrySpecDynamicNumber
// Description: Trap information about ARP dynamic entries resume spec: slot, spec, number of dynamic ARP.
trapMap["1.3.6.1.4.1.2011.5.25.123.2.35"] = [
    name: "hwEthernetARPDynamicEntryResumeAlarm",
    fields: ["entPhysicalName", "hwEthernetARPEntrySpecValue", "hwEthernetARPEntrySpecDynamicNumber"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEthernetARPEntrySpecValue": "1.3.6.1.4.1.2011.5.25.123.1.39.1", "hwEthernetARPEntrySpecDynamicNumber": "1.3.6.1.4.1.2011.5.25.123.1.39.2"]
]

// --- hwEthernetARPMACConflict (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.123.2.36
// Fields: hwEthernetARPInterfaceName, hwEthernetARPLocalMAC, hwEthernetARPReceiveSrcIPAddr, hwEthernetARPReceivePeVLAN, hwEthernetARPReceiveCEVLAN, hwEthernetARPReceiveInterfaceName
// Description: Trap information about the alarm of received an ARP packet with a conflictive MAC address from the interface.
trapMap["1.3.6.1.4.1.2011.5.25.123.2.36"] = [
    name: "hwEthernetARPMACConflict",
    fields: ["hwEthernetARPInterfaceName", "hwEthernetARPLocalMAC", "hwEthernetARPReceiveSrcIPAddr", "hwEthernetARPReceivePeVLAN", "hwEthernetARPReceiveCEVLAN", "hwEthernetARPReceiveInterfaceName"],
    fieldOids: ["hwEthernetARPInterfaceName": "1.3.6.1.4.1.2011.5.25.123.1.39.4", "hwEthernetARPLocalMAC": "1.3.6.1.4.1.2011.5.25.123.1.39.6", "hwEthernetARPReceiveSrcIPAddr": "1.3.6.1.4.1.2011.5.25.123.1.39.20", "hwEthernetARPReceivePeVLAN": "1.3.6.1.4.1.2011.5.25.123.1.39.7", "hwEthernetARPReceiveCEVLAN": "1.3.6.1.4.1.2011.5.25.123.1.39.8", "hwEthernetARPReceiveInterfaceName": "1.3.6.1.4.1.2011.5.25.123.1.39.19"]
]

// --- hwEthernetARPMACConflictClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.123.2.37
// Fields: hwEthernetARPInterfaceName, hwEthernetARPLocalMAC, hwEthernetARPReceiveSrcIPAddr, hwEthernetARPReceivePeVLAN, hwEthernetARPReceiveCEVLAN, hwEthernetARPReceiveInterfaceName
// Description: Trap information about the resolved alarm of received an ARP packet with a conflictive MAC address from the interface.
trapMap["1.3.6.1.4.1.2011.5.25.123.2.37"] = [
    name: "hwEthernetARPMACConflictClear",
    fields: ["hwEthernetARPInterfaceName", "hwEthernetARPLocalMAC", "hwEthernetARPReceiveSrcIPAddr", "hwEthernetARPReceivePeVLAN", "hwEthernetARPReceiveCEVLAN", "hwEthernetARPReceiveInterfaceName"],
    fieldOids: ["hwEthernetARPInterfaceName": "1.3.6.1.4.1.2011.5.25.123.1.39.4", "hwEthernetARPLocalMAC": "1.3.6.1.4.1.2011.5.25.123.1.39.6", "hwEthernetARPReceiveSrcIPAddr": "1.3.6.1.4.1.2011.5.25.123.1.39.20", "hwEthernetARPReceivePeVLAN": "1.3.6.1.4.1.2011.5.25.123.1.39.7", "hwEthernetARPReceiveCEVLAN": "1.3.6.1.4.1.2011.5.25.123.1.39.8", "hwEthernetARPReceiveInterfaceName": "1.3.6.1.4.1.2011.5.25.123.1.39.19"]
]

// --- hwEthernetARPMACMismatch (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.123.2.38
// Fields: hwARPLocalIPAddr, hwEthernetARPVpnName, hwARPLocalMAC, hwARPRemoteMAC
// Description: Trap information about the alarm of received an ARP packet with a conflictive MAC address from the static ARP.
trapMap["1.3.6.1.4.1.2011.5.25.123.2.38"] = [
    name: "hwEthernetARPMACMismatch",
    fields: ["hwARPLocalIPAddr", "hwEthernetARPVpnName", "hwARPLocalMAC", "hwARPRemoteMAC"],
    fieldOids: ["hwARPLocalIPAddr": "1.3.6.1.4.1.2011.5.25.123.1.38.1", "hwEthernetARPVpnName": "1.3.6.1.4.1.2011.5.25.123.1.39.21", "hwARPLocalMAC": "1.3.6.1.4.1.2011.5.25.123.1.38.3", "hwARPRemoteMAC": "1.3.6.1.4.1.2011.5.25.123.1.38.6"]
]

// --- hwEthernetARPMACMismatchClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.123.2.39
// Fields: hwARPLocalIPAddr, hwEthernetARPVpnName, hwARPLocalMAC
// Description: Trap information about the resolved alarm of received an ARP packet with a conflictive MAC address from the static ARP.
trapMap["1.3.6.1.4.1.2011.5.25.123.2.39"] = [
    name: "hwEthernetARPMACMismatchClear",
    fields: ["hwARPLocalIPAddr", "hwEthernetARPVpnName", "hwARPLocalMAC"],
    fieldOids: ["hwARPLocalIPAddr": "1.3.6.1.4.1.2011.5.25.123.1.38.1", "hwEthernetARPVpnName": "1.3.6.1.4.1.2011.5.25.123.1.39.21", "hwARPLocalMAC": "1.3.6.1.4.1.2011.5.25.123.1.38.3"]
]

// --- hwEthernetARPBdSuppressEntryExceedAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.123.2.40
// Fields: entPhysicalName, hwEthernetARPEntrySpecValue, hwEthernetARPEntrySpecBdSuppressNumber
// Description: Trap information about ARP broadcast-suppress entries exceed spec: slot, spec, number of broadcast-suppress ARP.
trapMap["1.3.6.1.4.1.2011.5.25.123.2.40"] = [
    name: "hwEthernetARPBdSuppressEntryExceedAlarm",
    fields: ["entPhysicalName", "hwEthernetARPEntrySpecValue", "hwEthernetARPEntrySpecBdSuppressNumber"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEthernetARPEntrySpecValue": "1.3.6.1.4.1.2011.5.25.123.1.39.1", "hwEthernetARPEntrySpecBdSuppressNumber": "1.3.6.1.4.1.2011.5.25.123.1.39.22"]
]

// --- hwEthernetARPBdSuppressEntryResumeAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.123.2.41
// Fields: entPhysicalName, hwEthernetARPEntrySpecValue, hwEthernetARPEntrySpecBdSuppressNumber
// Description: Trap information about ARP broadcast-suppress entries resume spec: slot, spec, number of broadcast-suppress ARP.
trapMap["1.3.6.1.4.1.2011.5.25.123.2.41"] = [
    name: "hwEthernetARPBdSuppressEntryResumeAlarm",
    fields: ["entPhysicalName", "hwEthernetARPEntrySpecValue", "hwEthernetARPEntrySpecBdSuppressNumber"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEthernetARPEntrySpecValue": "1.3.6.1.4.1.2011.5.25.123.1.39.1", "hwEthernetARPEntrySpecBdSuppressNumber": "1.3.6.1.4.1.2011.5.25.123.1.39.22"]
]

// --- hwEthernetARPDetectAbnormalAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.123.2.42
// Fields: hwEthernetARPInterfaceName, hwEthernetARPIPAddress, hwEthernetARPMacAdd, hwEthernetARPVlanId, hwEthernetARPCeVlanId, hwEthernetARPReceiveInterfaceName
// Description: Trap information about the alarm of the abnormal ARP detection.
trapMap["1.3.6.1.4.1.2011.5.25.123.2.42"] = [
    name: "hwEthernetARPDetectAbnormalAlarm",
    fields: ["hwEthernetARPInterfaceName", "hwEthernetARPIPAddress", "hwEthernetARPMacAdd", "hwEthernetARPVlanId", "hwEthernetARPCeVlanId", "hwEthernetARPReceiveInterfaceName"],
    fieldOids: ["hwEthernetARPInterfaceName": "1.3.6.1.4.1.2011.5.25.123.1.39.4", "hwEthernetARPIPAddress": "1.3.6.1.4.1.2011.5.25.123.1.39.5", "hwEthernetARPMacAdd": "1.3.6.1.4.1.2011.5.25.123.1.39.23", "hwEthernetARPVlanId": "1.3.6.1.4.1.2011.5.25.123.1.39.24", "hwEthernetARPCeVlanId": "1.3.6.1.4.1.2011.5.25.123.1.39.25", "hwEthernetARPReceiveInterfaceName": "1.3.6.1.4.1.2011.5.25.123.1.39.19"]
]

// --- hwEthernetARPDetectResumeAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.123.2.43
// Fields: hwEthernetARPInterfaceName, hwEthernetARPIPAddress, hwEthernetARPMacAdd, hwEthernetARPVlanId, hwEthernetARPCeVlanId, hwEthernetARPReceiveInterfaceName
// Description: Trap information about the resolved alarm of the abnormal ARP detection.
trapMap["1.3.6.1.4.1.2011.5.25.123.2.43"] = [
    name: "hwEthernetARPDetectResumeAlarm",
    fields: ["hwEthernetARPInterfaceName", "hwEthernetARPIPAddress", "hwEthernetARPMacAdd", "hwEthernetARPVlanId", "hwEthernetARPCeVlanId", "hwEthernetARPReceiveInterfaceName"],
    fieldOids: ["hwEthernetARPInterfaceName": "1.3.6.1.4.1.2011.5.25.123.1.39.4", "hwEthernetARPIPAddress": "1.3.6.1.4.1.2011.5.25.123.1.39.5", "hwEthernetARPMacAdd": "1.3.6.1.4.1.2011.5.25.123.1.39.23", "hwEthernetARPVlanId": "1.3.6.1.4.1.2011.5.25.123.1.39.24", "hwEthernetARPCeVlanId": "1.3.6.1.4.1.2011.5.25.123.1.39.25", "hwEthernetARPReceiveInterfaceName": "1.3.6.1.4.1.2011.5.25.123.1.39.19"]
]

// ===== Parsing logic =====

// Set to true to enable diagnostic logging for this MIB parser
DEBUG = false

LOG_PREFIX = "[HUAWEI-ETHARP-MIB]"
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
