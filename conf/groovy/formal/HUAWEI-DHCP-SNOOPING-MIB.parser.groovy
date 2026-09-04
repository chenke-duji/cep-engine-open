/**
 * Auto-generated from HUAWEI-DHCP-SNOOPING-MIB.mib
 * Generated: 2026-08-24T18:28:29.406992
 * Traps/Notifications (50): hwDhcpSnpChaddrAlarm, hwArpNomatchSnpBindTblPktAlarm, hwIpNomatchSnpBindTblPktAlarm, hwUntrustedReplyPktAlarm, hwNomatchSnpBindTblDhcpPktAlarm, hwDhcpPktRateAlarm, hwSnpUserNumberAlarm, hwSnpUserNumberAlarmIf, hwSnpUserNumberAlarmIfResume, hwSnpUserNumberAlarmVlan, hwSnpUserNumberAlarmVlanResume, hwSnpUserNumberAlarmGlobal, hwSnpUserNumberAlarmGlobalResume, hwNdSnpUserNumberAlarmIf, hwNdSnpUserNumberAlarmIfResume, hwNdSnpUserNumberAlarmGlobal, hwNdSnpUserNumberAlarmGlobalResume, hwBdNomatchSnpBindTblDhcpPktAlarm, hwBdDhcpSnpChaddrAlarm, hwBdArpNomatchSnpBindTblPktAlarm, hwBdIpNomatchSnpBindTblPktAlarm, hwBdUntrustedReplyPktAlarm, hwBdSnpUserNumberAlarm, hwDhcpSnpChaddrAlarmResume, hwArpNomatchSnpBindTblPktAlarmResume, hwIpNomatchSnpBindTblPktAlarmResume, hwUntrustedReplyPktAlarmResume, hwNomatchSnpBindTblDhcpPktAlarmResume, hwSnpUserNumberAlarmResume, hwSnpBindingItemResourceAlarm, hwNomatchSnpBindTblDhcpv6PktAlarm, hwNomatchSnpBindTblNDPktAlarm, hwSnpRemoteBackupAlarm, hwSnpRemoteBackupAlarmResume, hwRequestNoTrustPktAlarm, hwNomatchSnpBindTblNDPktAlarmBd, hwDhcpSnpChaddrAlarmBd, hwNomatchSnpBindTblDhcpPktAlarmBd, hwUntrustedReplyPktAlarmBd, hwDhcpSnpBindTblThreshold, hwDhcpSnpBindTblThresholdResume, hwDhcpSnpBindTblExhaust, hwDhcpSnpBindTblExhaustResume, hwDhcpv6SnpBindTblThreshold, hwDhcpv6SnpBindTblThresholdResume, hwDhcpv6SnpBindTblExhaust, hwDhcpv6SnpBindTblExhaustResume, hwIpv6NomatchV6SnpBindTblPktAlarm, hwDHCPv6SnpDetectAlarm, hwRequestNoTrustPktAlarmBd
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

// --- hwDhcpSnpChaddrAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.112.2.1
// Fields: hwDhcpSnpStatisticIfDescr, hwDhcpSnpStatisticVlanId, hwChaddrNomatchSrcMacDhcpPktNum
// Description: The CHADDR field value in the packet is inconsistent with the source MAC address.
trapMap["1.3.6.1.4.1.2011.5.25.112.2.1"] = [
    name: "hwDhcpSnpChaddrAlarm",
    fields: ["hwDhcpSnpStatisticIfDescr", "hwDhcpSnpStatisticVlanId", "hwChaddrNomatchSrcMacDhcpPktNum"],
    fieldOids: ["hwDhcpSnpStatisticIfDescr": "1.3.6.1.4.1.2011.5.25.112.1.15.1.1", "hwDhcpSnpStatisticVlanId": "1.3.6.1.4.1.2011.5.25.112.1.15.1.2", "hwChaddrNomatchSrcMacDhcpPktNum": "1.3.6.1.4.1.2011.5.25.112.1.15.1.3"]
]

// --- hwArpNomatchSnpBindTblPktAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.112.2.2
// Fields: hwDhcpSnpStatisticIfDescr, hwDhcpSnpStatisticVlanId, hwArpNomatchSnpBindTblPktNum
// Description: Arp packets do not match the snooping bind table.
trapMap["1.3.6.1.4.1.2011.5.25.112.2.2"] = [
    name: "hwArpNomatchSnpBindTblPktAlarm",
    fields: ["hwDhcpSnpStatisticIfDescr", "hwDhcpSnpStatisticVlanId", "hwArpNomatchSnpBindTblPktNum"],
    fieldOids: ["hwDhcpSnpStatisticIfDescr": "1.3.6.1.4.1.2011.5.25.112.1.15.1.1", "hwDhcpSnpStatisticVlanId": "1.3.6.1.4.1.2011.5.25.112.1.15.1.2", "hwArpNomatchSnpBindTblPktNum": "1.3.6.1.4.1.2011.5.25.112.1.15.1.4"]
]

// --- hwIpNomatchSnpBindTblPktAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.112.2.3
// Fields: hwDhcpSnpStatisticIfDescr, hwDhcpSnpStatisticVlanId, hwIpNomatchSnpBindTblPktNum
// Description: Ip packets do not match the snooping bind table.
trapMap["1.3.6.1.4.1.2011.5.25.112.2.3"] = [
    name: "hwIpNomatchSnpBindTblPktAlarm",
    fields: ["hwDhcpSnpStatisticIfDescr", "hwDhcpSnpStatisticVlanId", "hwIpNomatchSnpBindTblPktNum"],
    fieldOids: ["hwDhcpSnpStatisticIfDescr": "1.3.6.1.4.1.2011.5.25.112.1.15.1.1", "hwDhcpSnpStatisticVlanId": "1.3.6.1.4.1.2011.5.25.112.1.15.1.2", "hwIpNomatchSnpBindTblPktNum": "1.3.6.1.4.1.2011.5.25.112.1.15.1.5"]
]

// --- hwUntrustedReplyPktAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.112.2.4
// Fields: hwDhcpSnpStatisticIfDescr, hwDhcpSnpStatisticVlanId, hwUntrustedReplyPktNum
// Description: Untrusted ports have received the Dhcp reply packets.
trapMap["1.3.6.1.4.1.2011.5.25.112.2.4"] = [
    name: "hwUntrustedReplyPktAlarm",
    fields: ["hwDhcpSnpStatisticIfDescr", "hwDhcpSnpStatisticVlanId", "hwUntrustedReplyPktNum"],
    fieldOids: ["hwDhcpSnpStatisticIfDescr": "1.3.6.1.4.1.2011.5.25.112.1.15.1.1", "hwDhcpSnpStatisticVlanId": "1.3.6.1.4.1.2011.5.25.112.1.15.1.2", "hwUntrustedReplyPktNum": "1.3.6.1.4.1.2011.5.25.112.1.15.1.7"]
]

// --- hwNomatchSnpBindTblDhcpPktAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.112.2.5
// Fields: hwDhcpSnpStatisticIfDescr, hwDhcpSnpStatisticVlanId, hwNomatchSnpBindTblDhcpPktNum
// Description: There are Dhcp request packets do not match the snooping bind table.
trapMap["1.3.6.1.4.1.2011.5.25.112.2.5"] = [
    name: "hwNomatchSnpBindTblDhcpPktAlarm",
    fields: ["hwDhcpSnpStatisticIfDescr", "hwDhcpSnpStatisticVlanId", "hwNomatchSnpBindTblDhcpPktNum"],
    fieldOids: ["hwDhcpSnpStatisticIfDescr": "1.3.6.1.4.1.2011.5.25.112.1.15.1.1", "hwDhcpSnpStatisticVlanId": "1.3.6.1.4.1.2011.5.25.112.1.15.1.2", "hwNomatchSnpBindTblDhcpPktNum": "1.3.6.1.4.1.2011.5.25.112.1.15.1.6"]
]

// --- hwDhcpPktRateAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.112.2.6
// Fields: hwDhcpPktRateDiscardNum
// Description: The rate of Dhcp packets received is too large.
trapMap["1.3.6.1.4.1.2011.5.25.112.2.6"] = [
    name: "hwDhcpPktRateAlarm",
    fields: ["hwDhcpPktRateDiscardNum"],
    fieldOids: ["hwDhcpPktRateDiscardNum": "1.3.6.1.4.1.2011.5.25.112.1.11"]
]

// --- hwSnpUserNumberAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.112.2.7
// Fields: hwDhcpSnpStatisticIfDescr, hwDhcpSnpStatisticVlanId, hwSnpBindingItemNum, hwSnpCfgMaxUserNum
// Description: The number of the binding items exceeds the threshold of user-limit on the interface.
trapMap["1.3.6.1.4.1.2011.5.25.112.2.7"] = [
    name: "hwSnpUserNumberAlarm",
    fields: ["hwDhcpSnpStatisticIfDescr", "hwDhcpSnpStatisticVlanId", "hwSnpBindingItemNum", "hwSnpCfgMaxUserNum"],
    fieldOids: ["hwDhcpSnpStatisticIfDescr": "1.3.6.1.4.1.2011.5.25.112.1.15.1.1", "hwDhcpSnpStatisticVlanId": "1.3.6.1.4.1.2011.5.25.112.1.15.1.2", "hwSnpBindingItemNum": "1.3.6.1.4.1.2011.5.25.112.1.15.1.9", "hwSnpCfgMaxUserNum": "1.3.6.1.4.1.2011.5.25.112.1.15.1.10"]
]

// --- hwSnpUserNumberAlarmIf (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.112.2.8
// Fields: hwDhcpSnpStatisticIfDescr, hwSnpBindingItemNum, hwSnpCfgMaxUserNum
// Description: The number of DHCP user on the interface exceeds alarm threshold.
trapMap["1.3.6.1.4.1.2011.5.25.112.2.8"] = [
    name: "hwSnpUserNumberAlarmIf",
    fields: ["hwDhcpSnpStatisticIfDescr", "hwSnpBindingItemNum", "hwSnpCfgMaxUserNum"],
    fieldOids: ["hwDhcpSnpStatisticIfDescr": "1.3.6.1.4.1.2011.5.25.112.1.15.1.1", "hwSnpBindingItemNum": "1.3.6.1.4.1.2011.5.25.112.1.15.1.9", "hwSnpCfgMaxUserNum": "1.3.6.1.4.1.2011.5.25.112.1.15.1.10"]
]

// --- hwSnpUserNumberAlarmIfResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.112.2.9
// Fields: hwDhcpSnpStatisticIfDescr, hwSnpBindingItemNum, hwSnpCfgMaxUserNum
// Description: The number of DHCP user on the interface descends to alarm threshold.
trapMap["1.3.6.1.4.1.2011.5.25.112.2.9"] = [
    name: "hwSnpUserNumberAlarmIfResume",
    fields: ["hwDhcpSnpStatisticIfDescr", "hwSnpBindingItemNum", "hwSnpCfgMaxUserNum"],
    fieldOids: ["hwDhcpSnpStatisticIfDescr": "1.3.6.1.4.1.2011.5.25.112.1.15.1.1", "hwSnpBindingItemNum": "1.3.6.1.4.1.2011.5.25.112.1.15.1.9", "hwSnpCfgMaxUserNum": "1.3.6.1.4.1.2011.5.25.112.1.15.1.10"]
]

// --- hwSnpUserNumberAlarmVlan (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.112.2.10
// Fields: hwDhcpSnpStatisticVlanId, hwSnpBindingItemNum, hwSnpCfgMaxUserNum
// Description: The number of DHCP user on the vlan exceeds alarm threshold.
trapMap["1.3.6.1.4.1.2011.5.25.112.2.10"] = [
    name: "hwSnpUserNumberAlarmVlan",
    fields: ["hwDhcpSnpStatisticVlanId", "hwSnpBindingItemNum", "hwSnpCfgMaxUserNum"],
    fieldOids: ["hwDhcpSnpStatisticVlanId": "1.3.6.1.4.1.2011.5.25.112.1.15.1.2", "hwSnpBindingItemNum": "1.3.6.1.4.1.2011.5.25.112.1.15.1.9", "hwSnpCfgMaxUserNum": "1.3.6.1.4.1.2011.5.25.112.1.15.1.10"]
]

// --- hwSnpUserNumberAlarmVlanResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.112.2.11
// Fields: hwDhcpSnpStatisticVlanId, hwSnpBindingItemNum, hwSnpCfgMaxUserNum
// Description: The number of DHCP user on the vlan descends to alarm threshold.
trapMap["1.3.6.1.4.1.2011.5.25.112.2.11"] = [
    name: "hwSnpUserNumberAlarmVlanResume",
    fields: ["hwDhcpSnpStatisticVlanId", "hwSnpBindingItemNum", "hwSnpCfgMaxUserNum"],
    fieldOids: ["hwDhcpSnpStatisticVlanId": "1.3.6.1.4.1.2011.5.25.112.1.15.1.2", "hwSnpBindingItemNum": "1.3.6.1.4.1.2011.5.25.112.1.15.1.9", "hwSnpCfgMaxUserNum": "1.3.6.1.4.1.2011.5.25.112.1.15.1.10"]
]

// --- hwSnpUserNumberAlarmGlobal (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.112.2.12
// Fields: hwSnpBindingItemNum, hwSnpCfgMaxUserNum
// Description: The number of DHCP global user exceeds alarm threshold.
trapMap["1.3.6.1.4.1.2011.5.25.112.2.12"] = [
    name: "hwSnpUserNumberAlarmGlobal",
    fields: ["hwSnpBindingItemNum", "hwSnpCfgMaxUserNum"],
    fieldOids: ["hwSnpBindingItemNum": "1.3.6.1.4.1.2011.5.25.112.1.15.1.9", "hwSnpCfgMaxUserNum": "1.3.6.1.4.1.2011.5.25.112.1.15.1.10"]
]

// --- hwSnpUserNumberAlarmGlobalResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.112.2.13
// Fields: hwSnpBindingItemNum, hwSnpCfgMaxUserNum
// Description: The number of DHCP global user descends to alarm threshold.
trapMap["1.3.6.1.4.1.2011.5.25.112.2.13"] = [
    name: "hwSnpUserNumberAlarmGlobalResume",
    fields: ["hwSnpBindingItemNum", "hwSnpCfgMaxUserNum"],
    fieldOids: ["hwSnpBindingItemNum": "1.3.6.1.4.1.2011.5.25.112.1.15.1.9", "hwSnpCfgMaxUserNum": "1.3.6.1.4.1.2011.5.25.112.1.15.1.10"]
]

// --- hwNdSnpUserNumberAlarmIf (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.112.2.14
// Fields: hwDhcpSnpStatisticIfDescr, hwSnpBindingItemNum, hwSnpCfgMaxUserNum
// Description: The number of ND user on the interface exceeds alarm threshold.
trapMap["1.3.6.1.4.1.2011.5.25.112.2.14"] = [
    name: "hwNdSnpUserNumberAlarmIf",
    fields: ["hwDhcpSnpStatisticIfDescr", "hwSnpBindingItemNum", "hwSnpCfgMaxUserNum"],
    fieldOids: ["hwDhcpSnpStatisticIfDescr": "1.3.6.1.4.1.2011.5.25.112.1.15.1.1", "hwSnpBindingItemNum": "1.3.6.1.4.1.2011.5.25.112.1.15.1.9", "hwSnpCfgMaxUserNum": "1.3.6.1.4.1.2011.5.25.112.1.15.1.10"]
]

// --- hwNdSnpUserNumberAlarmIfResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.112.2.15
// Fields: hwDhcpSnpStatisticIfDescr, hwSnpBindingItemNum, hwSnpCfgMaxUserNum
// Description: The number of ND user on the interface descends to alarm threshold.
trapMap["1.3.6.1.4.1.2011.5.25.112.2.15"] = [
    name: "hwNdSnpUserNumberAlarmIfResume",
    fields: ["hwDhcpSnpStatisticIfDescr", "hwSnpBindingItemNum", "hwSnpCfgMaxUserNum"],
    fieldOids: ["hwDhcpSnpStatisticIfDescr": "1.3.6.1.4.1.2011.5.25.112.1.15.1.1", "hwSnpBindingItemNum": "1.3.6.1.4.1.2011.5.25.112.1.15.1.9", "hwSnpCfgMaxUserNum": "1.3.6.1.4.1.2011.5.25.112.1.15.1.10"]
]

// --- hwNdSnpUserNumberAlarmGlobal (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.112.2.16
// Fields: hwSnpBindingItemNum, hwSnpCfgMaxUserNum
// Description: The number of ND global user exceeds alarm threshold.
trapMap["1.3.6.1.4.1.2011.5.25.112.2.16"] = [
    name: "hwNdSnpUserNumberAlarmGlobal",
    fields: ["hwSnpBindingItemNum", "hwSnpCfgMaxUserNum"],
    fieldOids: ["hwSnpBindingItemNum": "1.3.6.1.4.1.2011.5.25.112.1.15.1.9", "hwSnpCfgMaxUserNum": "1.3.6.1.4.1.2011.5.25.112.1.15.1.10"]
]

// --- hwNdSnpUserNumberAlarmGlobalResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.112.2.17
// Fields: hwSnpBindingItemNum, hwSnpCfgMaxUserNum
// Description: The number of ND global user descends to alarm threshold.
trapMap["1.3.6.1.4.1.2011.5.25.112.2.17"] = [
    name: "hwNdSnpUserNumberAlarmGlobalResume",
    fields: ["hwSnpBindingItemNum", "hwSnpCfgMaxUserNum"],
    fieldOids: ["hwSnpBindingItemNum": "1.3.6.1.4.1.2011.5.25.112.1.15.1.9", "hwSnpCfgMaxUserNum": "1.3.6.1.4.1.2011.5.25.112.1.15.1.10"]
]

// --- hwBdNomatchSnpBindTblDhcpPktAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.112.2.18
// Fields: hwBdNomatchSnpBindTblDhcpPktNum
// Description: There are Dhcp request packets do not match the snooping bind table on the bridge domain.
trapMap["1.3.6.1.4.1.2011.5.25.112.2.18"] = [
    name: "hwBdNomatchSnpBindTblDhcpPktAlarm",
    fields: ["hwBdNomatchSnpBindTblDhcpPktNum"],
    fieldOids: ["hwBdNomatchSnpBindTblDhcpPktNum": "1.3.6.1.4.1.2011.5.25.112.1.25.1.2"]
]

// --- hwBdDhcpSnpChaddrAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.112.2.19
// Fields: hwBdChaddrNomatchSrcMacDhcpPktNum
// Description: CHADDR in Dhcp packets do not match source Mac-address in Ethernet frame on the bridge domain.
trapMap["1.3.6.1.4.1.2011.5.25.112.2.19"] = [
    name: "hwBdDhcpSnpChaddrAlarm",
    fields: ["hwBdChaddrNomatchSrcMacDhcpPktNum"],
    fieldOids: ["hwBdChaddrNomatchSrcMacDhcpPktNum": "1.3.6.1.4.1.2011.5.25.112.1.25.1.3"]
]

// --- hwBdArpNomatchSnpBindTblPktAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.112.2.20
// Fields: hwBdArpNomatchSnpBindTblPktNum
// Description: Arp packets do not match the snooping bind table on the bridge domain.
trapMap["1.3.6.1.4.1.2011.5.25.112.2.20"] = [
    name: "hwBdArpNomatchSnpBindTblPktAlarm",
    fields: ["hwBdArpNomatchSnpBindTblPktNum"],
    fieldOids: ["hwBdArpNomatchSnpBindTblPktNum": "1.3.6.1.4.1.2011.5.25.112.1.25.1.4"]
]

// --- hwBdIpNomatchSnpBindTblPktAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.112.2.21
// Fields: hwBdIpNomatchSnpBindTblPktNum
// Description: Ip packets do not match the snooping bind table on the bridge domain.
trapMap["1.3.6.1.4.1.2011.5.25.112.2.21"] = [
    name: "hwBdIpNomatchSnpBindTblPktAlarm",
    fields: ["hwBdIpNomatchSnpBindTblPktNum"],
    fieldOids: ["hwBdIpNomatchSnpBindTblPktNum": "1.3.6.1.4.1.2011.5.25.112.1.25.1.5"]
]

// --- hwBdUntrustedReplyPktAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.112.2.22
// Fields: hwBdUntrustedReplyPktNum
// Description: Untrusted ports have received the Dhcp reply packets on the bridge domain.
trapMap["1.3.6.1.4.1.2011.5.25.112.2.22"] = [
    name: "hwBdUntrustedReplyPktAlarm",
    fields: ["hwBdUntrustedReplyPktNum"],
    fieldOids: ["hwBdUntrustedReplyPktNum": "1.3.6.1.4.1.2011.5.25.112.1.25.1.6"]
]

// --- hwBdSnpUserNumberAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.112.2.23
// Fields: hwBdSnpBindingItemNum, hwBdSnpCfgMaxUserNum
// Description: The number of the binding items exceeds the threshold of user-limit on the bridge domain.
trapMap["1.3.6.1.4.1.2011.5.25.112.2.23"] = [
    name: "hwBdSnpUserNumberAlarm",
    fields: ["hwBdSnpBindingItemNum", "hwBdSnpCfgMaxUserNum"],
    fieldOids: ["hwBdSnpBindingItemNum": "1.3.6.1.4.1.2011.5.25.112.1.25.1.7", "hwBdSnpCfgMaxUserNum": "1.3.6.1.4.1.2011.5.25.112.1.25.1.8"]
]

// --- hwDhcpSnpChaddrAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.112.2.24
// Fields: hwDhcpSnpStatisticIfDescr, hwDhcpSnpStatisticVlanId, hwChaddrNomatchSrcMacDhcpPktNum
// Description: The number of the discarded DHCP packets in which the CHADDR field is inconsistent with the source MAC address descends to the threshold on the interface.
trapMap["1.3.6.1.4.1.2011.5.25.112.2.24"] = [
    name: "hwDhcpSnpChaddrAlarmResume",
    fields: ["hwDhcpSnpStatisticIfDescr", "hwDhcpSnpStatisticVlanId", "hwChaddrNomatchSrcMacDhcpPktNum"],
    fieldOids: ["hwDhcpSnpStatisticIfDescr": "1.3.6.1.4.1.2011.5.25.112.1.15.1.1", "hwDhcpSnpStatisticVlanId": "1.3.6.1.4.1.2011.5.25.112.1.15.1.2", "hwChaddrNomatchSrcMacDhcpPktNum": "1.3.6.1.4.1.2011.5.25.112.1.15.1.3"]
]

// --- hwArpNomatchSnpBindTblPktAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.112.2.25
// Fields: hwDhcpSnpStatisticIfDescr, hwDhcpSnpStatisticVlanId, hwArpNomatchSnpBindTblPktNum
// Description: The number of the discarded ARP packets that do not match the binding table descends to the threshold on the interface.
trapMap["1.3.6.1.4.1.2011.5.25.112.2.25"] = [
    name: "hwArpNomatchSnpBindTblPktAlarmResume",
    fields: ["hwDhcpSnpStatisticIfDescr", "hwDhcpSnpStatisticVlanId", "hwArpNomatchSnpBindTblPktNum"],
    fieldOids: ["hwDhcpSnpStatisticIfDescr": "1.3.6.1.4.1.2011.5.25.112.1.15.1.1", "hwDhcpSnpStatisticVlanId": "1.3.6.1.4.1.2011.5.25.112.1.15.1.2", "hwArpNomatchSnpBindTblPktNum": "1.3.6.1.4.1.2011.5.25.112.1.15.1.4"]
]

// --- hwIpNomatchSnpBindTblPktAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.112.2.26
// Fields: hwDhcpSnpStatisticIfDescr, hwDhcpSnpStatisticVlanId, hwIpNomatchSnpBindTblPktNum
// Description: The number of the discarded IP packets that do not match the binding table descends to the threshold on the interface.
trapMap["1.3.6.1.4.1.2011.5.25.112.2.26"] = [
    name: "hwIpNomatchSnpBindTblPktAlarmResume",
    fields: ["hwDhcpSnpStatisticIfDescr", "hwDhcpSnpStatisticVlanId", "hwIpNomatchSnpBindTblPktNum"],
    fieldOids: ["hwDhcpSnpStatisticIfDescr": "1.3.6.1.4.1.2011.5.25.112.1.15.1.1", "hwDhcpSnpStatisticVlanId": "1.3.6.1.4.1.2011.5.25.112.1.15.1.2", "hwIpNomatchSnpBindTblPktNum": "1.3.6.1.4.1.2011.5.25.112.1.15.1.5"]
]

// --- hwUntrustedReplyPktAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.112.2.27
// Fields: hwDhcpSnpStatisticIfDescr, hwDhcpSnpStatisticVlanId, hwUntrustedReplyPktNum
// Description: The number of the discarded DHCP reply packets on the untrusted interface descends to the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.112.2.27"] = [
    name: "hwUntrustedReplyPktAlarmResume",
    fields: ["hwDhcpSnpStatisticIfDescr", "hwDhcpSnpStatisticVlanId", "hwUntrustedReplyPktNum"],
    fieldOids: ["hwDhcpSnpStatisticIfDescr": "1.3.6.1.4.1.2011.5.25.112.1.15.1.1", "hwDhcpSnpStatisticVlanId": "1.3.6.1.4.1.2011.5.25.112.1.15.1.2", "hwUntrustedReplyPktNum": "1.3.6.1.4.1.2011.5.25.112.1.15.1.7"]
]

// --- hwNomatchSnpBindTblDhcpPktAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.112.2.28
// Fields: hwDhcpSnpStatisticIfDescr, hwDhcpSnpStatisticVlanId, hwNomatchSnpBindTblDhcpPktNum
// Description: The number of the discarded DHCP request packets that do not match the binding table descends to the threshold on the interface.
trapMap["1.3.6.1.4.1.2011.5.25.112.2.28"] = [
    name: "hwNomatchSnpBindTblDhcpPktAlarmResume",
    fields: ["hwDhcpSnpStatisticIfDescr", "hwDhcpSnpStatisticVlanId", "hwNomatchSnpBindTblDhcpPktNum"],
    fieldOids: ["hwDhcpSnpStatisticIfDescr": "1.3.6.1.4.1.2011.5.25.112.1.15.1.1", "hwDhcpSnpStatisticVlanId": "1.3.6.1.4.1.2011.5.25.112.1.15.1.2", "hwNomatchSnpBindTblDhcpPktNum": "1.3.6.1.4.1.2011.5.25.112.1.15.1.6"]
]

// --- hwSnpUserNumberAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.112.2.29
// Fields: hwDhcpSnpStatisticIfDescr, hwDhcpSnpStatisticVlanId, hwSnpBindingItemNum, hwSnpCfgMaxUserNum
// Description: The number of the binding items descends to the threshold of user-limit on the interface.
trapMap["1.3.6.1.4.1.2011.5.25.112.2.29"] = [
    name: "hwSnpUserNumberAlarmResume",
    fields: ["hwDhcpSnpStatisticIfDescr", "hwDhcpSnpStatisticVlanId", "hwSnpBindingItemNum", "hwSnpCfgMaxUserNum"],
    fieldOids: ["hwDhcpSnpStatisticIfDescr": "1.3.6.1.4.1.2011.5.25.112.1.15.1.1", "hwDhcpSnpStatisticVlanId": "1.3.6.1.4.1.2011.5.25.112.1.15.1.2", "hwSnpBindingItemNum": "1.3.6.1.4.1.2011.5.25.112.1.15.1.9", "hwSnpCfgMaxUserNum": "1.3.6.1.4.1.2011.5.25.112.1.15.1.10"]
]

// --- hwSnpBindingItemResourceAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.112.2.30
// Fields: hwSnpBindingItemGlobalNum, hwSnpBindingItemResourceSize
// Description: The number of binding items exceeded the resource threshold of the whole device.
trapMap["1.3.6.1.4.1.2011.5.25.112.2.30"] = [
    name: "hwSnpBindingItemResourceAlarm",
    fields: ["hwSnpBindingItemGlobalNum", "hwSnpBindingItemResourceSize"],
    fieldOids: ["hwSnpBindingItemGlobalNum": "1.3.6.1.4.1.2011.5.25.112.1.31", "hwSnpBindingItemResourceSize": "1.3.6.1.4.1.2011.5.25.112.1.32"]
]

// --- hwNomatchSnpBindTblDhcpv6PktAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.112.2.31
// Fields: hwDhcpSnpStatisticIfDescr, hwDhcpSnpStatisticVlanId
// Description: There are Dhcpv6 request packets do not match the snooping bind table.
trapMap["1.3.6.1.4.1.2011.5.25.112.2.31"] = [
    name: "hwNomatchSnpBindTblDhcpv6PktAlarm",
    fields: ["hwDhcpSnpStatisticIfDescr", "hwDhcpSnpStatisticVlanId"],
    fieldOids: ["hwDhcpSnpStatisticIfDescr": "1.3.6.1.4.1.2011.5.25.112.1.15.1.1", "hwDhcpSnpStatisticVlanId": "1.3.6.1.4.1.2011.5.25.112.1.15.1.2"]
]

// --- hwNomatchSnpBindTblNDPktAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.112.2.32
// Fields: hwDhcpSnpStatisticIfDescr, hwDhcpSnpStatisticVlanId
// Description: There are ND packets do not match the snooping bind table.
trapMap["1.3.6.1.4.1.2011.5.25.112.2.32"] = [
    name: "hwNomatchSnpBindTblNDPktAlarm",
    fields: ["hwDhcpSnpStatisticIfDescr", "hwDhcpSnpStatisticVlanId"],
    fieldOids: ["hwDhcpSnpStatisticIfDescr": "1.3.6.1.4.1.2011.5.25.112.1.15.1.1", "hwDhcpSnpStatisticVlanId": "1.3.6.1.4.1.2011.5.25.112.1.15.1.2"]
]

// --- hwSnpRemoteBackupAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.112.2.33
// Fields: hwDhcpSnpTrapRemoteBackupType
// Description: DHCP snooping user-bind table failed to be recovered from remote server.
trapMap["1.3.6.1.4.1.2011.5.25.112.2.33"] = [
    name: "hwSnpRemoteBackupAlarm",
    fields: ["hwDhcpSnpTrapRemoteBackupType"],
    fieldOids: ["hwDhcpSnpTrapRemoteBackupType": "1.3.6.1.4.1.2011.5.25.112.1.33"]
]

// --- hwSnpRemoteBackupAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.112.2.34
// Fields: hwDhcpSnpTrapRemoteBackupType
// Description: DHCP snooping user-bind table is successfully recovered from remote server.
trapMap["1.3.6.1.4.1.2011.5.25.112.2.34"] = [
    name: "hwSnpRemoteBackupAlarmResume",
    fields: ["hwDhcpSnpTrapRemoteBackupType"],
    fieldOids: ["hwDhcpSnpTrapRemoteBackupType": "1.3.6.1.4.1.2011.5.25.112.1.33"]
]

// --- hwRequestNoTrustPktAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.112.2.35
// Fields: hwDhcpSnpStatisticIfDescr, hwDhcpSnpStatisticVlanId, hwRequestNoTrustPktNum
// Description: Drop DHCP request packets because of dhcp snooping trust port is not configured or trust port is down.
trapMap["1.3.6.1.4.1.2011.5.25.112.2.35"] = [
    name: "hwRequestNoTrustPktAlarm",
    fields: ["hwDhcpSnpStatisticIfDescr", "hwDhcpSnpStatisticVlanId", "hwRequestNoTrustPktNum"],
    fieldOids: ["hwDhcpSnpStatisticIfDescr": "1.3.6.1.4.1.2011.5.25.112.1.15.1.1", "hwDhcpSnpStatisticVlanId": "1.3.6.1.4.1.2011.5.25.112.1.15.1.2", "hwRequestNoTrustPktNum": "1.3.6.1.4.1.2011.5.25.112.1.15.1.12"]
]

// --- hwNomatchSnpBindTblNDPktAlarmBd (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.112.2.36
// Fields: hwDhcpSnpStatisticIfDescr, hwDhcpSnpStatisticBdId
// Description: There are ND packets do not match the snooping bind table.
trapMap["1.3.6.1.4.1.2011.5.25.112.2.36"] = [
    name: "hwNomatchSnpBindTblNDPktAlarmBd",
    fields: ["hwDhcpSnpStatisticIfDescr", "hwDhcpSnpStatisticBdId"],
    fieldOids: ["hwDhcpSnpStatisticIfDescr": "1.3.6.1.4.1.2011.5.25.112.1.15.1.1", "hwDhcpSnpStatisticBdId": "1.3.6.1.4.1.2011.5.25.112.1.15.1.13"]
]

// --- hwDhcpSnpChaddrAlarmBd (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.112.2.37
// Fields: hwDhcpSnpStatisticIfDescr, hwDhcpSnpStatisticBdId, hwChaddrNomatchSrcMacDhcpPktNum
// Description: There are Dhcp request packets do not match the snooping bind table.
trapMap["1.3.6.1.4.1.2011.5.25.112.2.37"] = [
    name: "hwDhcpSnpChaddrAlarmBd",
    fields: ["hwDhcpSnpStatisticIfDescr", "hwDhcpSnpStatisticBdId", "hwChaddrNomatchSrcMacDhcpPktNum"],
    fieldOids: ["hwDhcpSnpStatisticIfDescr": "1.3.6.1.4.1.2011.5.25.112.1.15.1.1", "hwDhcpSnpStatisticBdId": "1.3.6.1.4.1.2011.5.25.112.1.15.1.13", "hwChaddrNomatchSrcMacDhcpPktNum": "1.3.6.1.4.1.2011.5.25.112.1.15.1.3"]
]

// --- hwNomatchSnpBindTblDhcpPktAlarmBd (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.112.2.38
// Fields: hwDhcpSnpStatisticIfDescr, hwDhcpSnpStatisticBdId, hwNomatchSnpBindTblDhcpPktNum
// Description: There are Dhcp request packets do not match the snooping bind table.
trapMap["1.3.6.1.4.1.2011.5.25.112.2.38"] = [
    name: "hwNomatchSnpBindTblDhcpPktAlarmBd",
    fields: ["hwDhcpSnpStatisticIfDescr", "hwDhcpSnpStatisticBdId", "hwNomatchSnpBindTblDhcpPktNum"],
    fieldOids: ["hwDhcpSnpStatisticIfDescr": "1.3.6.1.4.1.2011.5.25.112.1.15.1.1", "hwDhcpSnpStatisticBdId": "1.3.6.1.4.1.2011.5.25.112.1.15.1.13", "hwNomatchSnpBindTblDhcpPktNum": "1.3.6.1.4.1.2011.5.25.112.1.15.1.6"]
]

// --- hwUntrustedReplyPktAlarmBd (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.112.2.39
// Fields: hwDhcpSnpStatisticIfDescr, hwDhcpSnpStatisticBdId, hwUntrustedReplyPktNum
// Description: Untrusted ports have received the Dhcp reply packets.
trapMap["1.3.6.1.4.1.2011.5.25.112.2.39"] = [
    name: "hwUntrustedReplyPktAlarmBd",
    fields: ["hwDhcpSnpStatisticIfDescr", "hwDhcpSnpStatisticBdId", "hwUntrustedReplyPktNum"],
    fieldOids: ["hwDhcpSnpStatisticIfDescr": "1.3.6.1.4.1.2011.5.25.112.1.15.1.1", "hwDhcpSnpStatisticBdId": "1.3.6.1.4.1.2011.5.25.112.1.15.1.13", "hwUntrustedReplyPktNum": "1.3.6.1.4.1.2011.5.25.112.1.15.1.7"]
]

// --- hwDhcpSnpBindTblThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.112.2.40
// Fields: hwDhcpSnpUsrNum, hwDhcpSnpMaxUsrNum
// Description: This object indicates that an alarm is generated when the number of DHCP snooping entries on the device exceeds 80% of the upper limit.
trapMap["1.3.6.1.4.1.2011.5.25.112.2.40"] = [
    name: "hwDhcpSnpBindTblThreshold",
    fields: ["hwDhcpSnpUsrNum", "hwDhcpSnpMaxUsrNum"],
    fieldOids: ["hwDhcpSnpUsrNum": "1.3.6.1.4.1.2011.5.25.112.1.34.1", "hwDhcpSnpMaxUsrNum": "1.3.6.1.4.1.2011.5.25.112.1.34.2"]
]

// --- hwDhcpSnpBindTblThresholdResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.112.2.41
// Fields: hwDhcpSnpUsrNum, hwDhcpSnpMaxUsrNum
// Description: This object indicates that a clear alarm is generated when the number of DHCP snooping entries on the device falls below 70% of the upper limit.
trapMap["1.3.6.1.4.1.2011.5.25.112.2.41"] = [
    name: "hwDhcpSnpBindTblThresholdResume",
    fields: ["hwDhcpSnpUsrNum", "hwDhcpSnpMaxUsrNum"],
    fieldOids: ["hwDhcpSnpUsrNum": "1.3.6.1.4.1.2011.5.25.112.1.34.1", "hwDhcpSnpMaxUsrNum": "1.3.6.1.4.1.2011.5.25.112.1.34.2"]
]

// --- hwDhcpSnpBindTblExhaust (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.112.2.42
// Fields: hwDhcpSnpMaxUsrNum
// Description: This object indicates that an alarm is generated when the number of DHCP snooping entries on the device reaches the upper limit.
trapMap["1.3.6.1.4.1.2011.5.25.112.2.42"] = [
    name: "hwDhcpSnpBindTblExhaust",
    fields: ["hwDhcpSnpMaxUsrNum"],
    fieldOids: ["hwDhcpSnpMaxUsrNum": "1.3.6.1.4.1.2011.5.25.112.1.34.2"]
]

// --- hwDhcpSnpBindTblExhaustResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.112.2.43
// Fields: hwDhcpSnpMaxUsrNum
// Description: This object indicates that a clear alarm is generated when the number of DHCP snooping entries on the device falls below 90% of the upper limit.
trapMap["1.3.6.1.4.1.2011.5.25.112.2.43"] = [
    name: "hwDhcpSnpBindTblExhaustResume",
    fields: ["hwDhcpSnpMaxUsrNum"],
    fieldOids: ["hwDhcpSnpMaxUsrNum": "1.3.6.1.4.1.2011.5.25.112.1.34.2"]
]

// --- hwDhcpv6SnpBindTblThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.112.2.44
// Fields: hwDhcpv6SnpUsrNum, hwDhcpv6SnpMaxUsrNum
// Description: This object indicates that an alarm is generated when the number of DHCPv6 snooping entries on the device exceeds 80% of the upper limit.
trapMap["1.3.6.1.4.1.2011.5.25.112.2.44"] = [
    name: "hwDhcpv6SnpBindTblThreshold",
    fields: ["hwDhcpv6SnpUsrNum", "hwDhcpv6SnpMaxUsrNum"],
    fieldOids: ["hwDhcpv6SnpUsrNum": "1.3.6.1.4.1.2011.5.25.112.1.34.3", "hwDhcpv6SnpMaxUsrNum": "1.3.6.1.4.1.2011.5.25.112.1.34.4"]
]

// --- hwDhcpv6SnpBindTblThresholdResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.112.2.45
// Fields: hwDhcpv6SnpUsrNum, hwDhcpv6SnpMaxUsrNum
// Description: This object indicates that a clear alarm is generated when the number of DHCPv6 snooping entries on the device falls below 70% of the upper limit.
trapMap["1.3.6.1.4.1.2011.5.25.112.2.45"] = [
    name: "hwDhcpv6SnpBindTblThresholdResume",
    fields: ["hwDhcpv6SnpUsrNum", "hwDhcpv6SnpMaxUsrNum"],
    fieldOids: ["hwDhcpv6SnpUsrNum": "1.3.6.1.4.1.2011.5.25.112.1.34.3", "hwDhcpv6SnpMaxUsrNum": "1.3.6.1.4.1.2011.5.25.112.1.34.4"]
]

// --- hwDhcpv6SnpBindTblExhaust (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.112.2.46
// Fields: hwDhcpv6SnpMaxUsrNum
// Description: This object indicates that an alarm is generated when the number of DHCPv6 snooping entries on the device reaches the upper limit.
trapMap["1.3.6.1.4.1.2011.5.25.112.2.46"] = [
    name: "hwDhcpv6SnpBindTblExhaust",
    fields: ["hwDhcpv6SnpMaxUsrNum"],
    fieldOids: ["hwDhcpv6SnpMaxUsrNum": "1.3.6.1.4.1.2011.5.25.112.1.34.4"]
]

// --- hwDhcpv6SnpBindTblExhaustResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.112.2.47
// Fields: hwDhcpv6SnpMaxUsrNum
// Description: This object indicates that a clear alarm is generated when the number of DHCPv6 snooping entries on the device falls below 90% of the upper limit.
trapMap["1.3.6.1.4.1.2011.5.25.112.2.47"] = [
    name: "hwDhcpv6SnpBindTblExhaustResume",
    fields: ["hwDhcpv6SnpMaxUsrNum"],
    fieldOids: ["hwDhcpv6SnpMaxUsrNum": "1.3.6.1.4.1.2011.5.25.112.1.34.4"]
]

// --- hwIpv6NomatchV6SnpBindTblPktAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.112.2.48
// Fields: hwDhcpv6SnpIfIndex, hwDhcpv6SnpIfName, hwIpv6Nomatchv6SnpBindTblPktNum
// Description: The number of the discarded IPv6 packets that do not match the binding table exceeded the threshold on the interface.
trapMap["1.3.6.1.4.1.2011.5.25.112.2.48"] = [
    name: "hwIpv6NomatchV6SnpBindTblPktAlarm",
    fields: ["hwDhcpv6SnpIfIndex", "hwDhcpv6SnpIfName", "hwIpv6Nomatchv6SnpBindTblPktNum"],
    fieldOids: ["hwDhcpv6SnpIfIndex": "1.3.6.1.4.1.2011.5.25.112.1.34.5", "hwDhcpv6SnpIfName": "1.3.6.1.4.1.2011.5.25.112.1.34.6", "hwIpv6Nomatchv6SnpBindTblPktNum": "1.3.6.1.4.1.2011.5.25.112.1.34.7"]
]

// --- hwDHCPv6SnpDetectAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.112.2.49
// Fields: hwDhcpSnpBindMac, hwDhcpSnpBindIfDescr, hwDhcpSnpBindPVlanId
// Description: There are Dhcpv6 request packets do not match the snooping bind table.
trapMap["1.3.6.1.4.1.2011.5.25.112.2.49"] = [
    name: "hwDHCPv6SnpDetectAlarm",
    fields: ["hwDhcpSnpBindMac", "hwDhcpSnpBindIfDescr", "hwDhcpSnpBindPVlanId"],
    fieldOids: ["hwDhcpSnpBindMac": "1.3.6.1.4.1.2011.5.25.112.1.14.1.11", "hwDhcpSnpBindIfDescr": "1.3.6.1.4.1.2011.5.25.112.1.14.1.6", "hwDhcpSnpBindPVlanId": "1.3.6.1.4.1.2011.5.25.112.1.14.1.7"]
]

// --- hwRequestNoTrustPktAlarmBd (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.112.2.50
// Fields: hwDhcpSnpStatisticIfDescr, hwDhcpSnpStatisticBdId, hwRequestNoTrustPktNumBd
// Description: Drop DHCP request packets because of dhcp snooping trust port is not configured or trust port is down.
trapMap["1.3.6.1.4.1.2011.5.25.112.2.50"] = [
    name: "hwRequestNoTrustPktAlarmBd",
    fields: ["hwDhcpSnpStatisticIfDescr", "hwDhcpSnpStatisticBdId", "hwRequestNoTrustPktNumBd"],
    fieldOids: ["hwDhcpSnpStatisticIfDescr": "1.3.6.1.4.1.2011.5.25.112.1.15.1.1", "hwDhcpSnpStatisticBdId": "1.3.6.1.4.1.2011.5.25.112.1.15.1.13", "hwRequestNoTrustPktNumBd": "1.3.6.1.4.1.2011.5.25.112.1.15.1.14"]
]

// ===== Parsing logic =====

// Set to true to enable diagnostic logging for this MIB parser
DEBUG = false

LOG_PREFIX = "[HUAWEI-DHCP-SNOOPING-MIB]"
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
