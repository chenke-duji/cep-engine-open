/**
 * Auto-generated from HUAWEI-MULTICAST-MIB.mib
 * Generated: 2026-08-24T18:28:30.477357600
 * Traps/Notifications (66): hwCfgRefreshFailAlarm, hwMCastTableLoadAbnormalNotify, hwMCastTableLoadAbnormalResume, hwMCastVlanFailAlarm, hwMCastVlanOkNotify, hwMCastApsSwitchAlarm, hwMCastApsIdleNotify, hwL2mcCacGlobalCountExceed, hwL2mcCacGlobalBandwidthExceed, hwL2mcCacGlobalChannelCountExceed, hwL2mcCacGlobalChannelBandwidthExceed, hwL2mcCacVlanCountExceed, hwL2mcCacVlanBandwidthExceed, hwL2mcCacVlanChannelCountExceed, hwL2mcCacVlanChannelBandwidthExceed, hwL2mcCacVsiCountExceed, hwL2mcCacVsiBandwidthExceed, hwL2mcCacVsiChannelCountExceed, hwL2mcCacVsiChannelBandwidthExceed, hwL2mcCacPortCountExceed, hwL2mcCacPortBandwidthExceed, hwL2mcCacPortChannelCountExceed, hwL2mcCacPortChannelBandwidthExceed, hwL2mcCacPortVlanCountExceed, hwL2mcCacPortVlanBandwidthExceed, hwL2mcCacPortVlanChannelCountExceed, hwL2mcCacPortVlanChannelBandwidthExceed, hwL2mcCacSubIfCountExceed, hwL2mcCacSubIfBandwidthExceed, hwL2mcCacSubIfChannelCountExceed, hwL2mcCacSubIfChannelBandwidthExceed, hwL2mcCacLdpPwCountExceed, hwL2mcCacLdpPwBandwidthExceed, hwL2mcCacLdpPwChannelCountExceed, hwL2mcCacLdpPwChannelBandwidthExceed, hwL2mcCacBgpPwCountExceed, hwL2mcCacBgpPwBandwidthExceed, hwL2mcCacBgpPwChannelCountExceed, hwL2mcCacBgpPwChannelBandwidthExceed, hwL2mcCacVlanUnspecifiedChannelDeny, hwL2mcCacVsiUnspecifiedChannelDeny, hwL2mcCacGlobalUnspecifiedChannelDeny, hwL2mcCacQinQIfCountExceed, hwL2mcCacQinQIfBandwidthExceed, hwL2mcCacQinQIfChannelCountExceed, hwL2mcCacQinQIfChannelBandwidthExceed, hwL2mcReceiveIgmpVlanAlarm, hwL2mcReceiveIgmpVsiAlarm, hwL2mcReceiveIgmpVlanRecover, hwL2mcReceiveIgmpVsiRecover, hwL2mcDropIgmpVlanAlarm, hwL2mcDropIgmpVsiAlarm, hwL2mcDropIgmpVlanRecover, hwL2mcDropIgmpVsiRecover, hwL2mc24HReceiveIgmpVlanAlarm, hwL2mc24HReceiveIgmpVsiAlarm, hwL2mc24HReceiveIgmpVlanRecover, hwL2mc24HReceiveIgmpVsiRecover, hwL2mc24HDropIgmpVlanAlarm, hwL2mc24HDropIgmpVsiAlarm, hwL2mc24HDropIgmpVlanRecover, hwL2mc24HDropIgmpVsiRecover, hwMCastBasGroupDecreaseExceed, hwMCastBasGroupDecreaseResume, hwMgmdBrasUserLimit, hwMgmdBrasUserLimitClear
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

// --- hwCfgRefreshFailAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.44.99.1
// Fields: hwL2VlanDescr
// Description: Failed to refresh multicast table!
trapMap["1.3.6.1.4.1.2011.5.25.44.99.1"] = [
    name: "hwCfgRefreshFailAlarm",
    fields: ["hwL2VlanDescr"],
    fieldOids: ["hwL2VlanDescr": "1.3.6.1.4.1.2011.5.25.42.3.1.1.1.1.2"]
]

// --- hwMCastTableLoadAbnormalNotify (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.44.99.2
// Description: Multicast table of router was full!
trapMap["1.3.6.1.4.1.2011.5.25.44.99.2"] = [
    name: "hwMCastTableLoadAbnormalNotify",
    fields: [],
    fieldOids: []
]

// --- hwMCastTableLoadAbnormalResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.44.99.3
// Description: Multicast table of router was normal!
trapMap["1.3.6.1.4.1.2011.5.25.44.99.3"] = [
    name: "hwMCastTableLoadAbnormalResume",
    fields: [],
    fieldOids: []
]

// --- hwMCastVlanFailAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.44.99.4
// Fields: hwL2VlanDescr
// Description: VLAN which has been configed with protect-vlan failed!
trapMap["1.3.6.1.4.1.2011.5.25.44.99.4"] = [
    name: "hwMCastVlanFailAlarm",
    fields: ["hwL2VlanDescr"],
    fieldOids: ["hwL2VlanDescr": "1.3.6.1.4.1.2011.5.25.42.3.1.1.1.1.2"]
]

// --- hwMCastVlanOkNotify (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.44.99.5
// Fields: hwL2VlanDescr
// Description: VLAN which has been configed with protect-vlan has been OK!
trapMap["1.3.6.1.4.1.2011.5.25.44.99.5"] = [
    name: "hwMCastVlanOkNotify",
    fields: ["hwL2VlanDescr"],
    fieldOids: ["hwL2VlanDescr": "1.3.6.1.4.1.2011.5.25.42.3.1.1.1.1.2"]
]

// --- hwMCastApsSwitchAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.44.99.6
// Fields: hwL2VlanDescr
// Description: APS is switching!
trapMap["1.3.6.1.4.1.2011.5.25.44.99.6"] = [
    name: "hwMCastApsSwitchAlarm",
    fields: ["hwL2VlanDescr"],
    fieldOids: ["hwL2VlanDescr": "1.3.6.1.4.1.2011.5.25.42.3.1.1.1.1.2"]
]

// --- hwMCastApsIdleNotify (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.44.99.7
// Fields: hwL2VlanDescr
// Description: APS has finished switching and been idle!
trapMap["1.3.6.1.4.1.2011.5.25.44.99.7"] = [
    name: "hwMCastApsIdleNotify",
    fields: ["hwL2VlanDescr"],
    fieldOids: ["hwL2VlanDescr": "1.3.6.1.4.1.2011.5.25.42.3.1.1.1.1.2"]
]

// --- hwL2mcCacGlobalCountExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.44.99.8
// Fields: hwL2mcCacCount, hwL2mcCacGroupAddress, hwL2mcCacSourceAddress
// Description: Trap information about l2-multicast CAC:currently configured limit count,group IP address,source IP address.
trapMap["1.3.6.1.4.1.2011.5.25.44.99.8"] = [
    name: "hwL2mcCacGlobalCountExceed",
    fields: ["hwL2mcCacCount", "hwL2mcCacGroupAddress", "hwL2mcCacSourceAddress"],
    fieldOids: ["hwL2mcCacCount": "1.3.6.1.4.1.2011.5.25.44.5.1", "hwL2mcCacGroupAddress": "1.3.6.1.4.1.2011.5.25.44.5.3", "hwL2mcCacSourceAddress": "1.3.6.1.4.1.2011.5.25.44.5.12"]
]

// --- hwL2mcCacGlobalBandwidthExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.44.99.9
// Fields: hwL2mcCacBandwidth, hwL2mcCacGroupAddress, hwL2mcCacSourceAddress
// Description: Trap information about l2-multicast CAC:currently configured limit bandwidth,group IP address,source IP address.
trapMap["1.3.6.1.4.1.2011.5.25.44.99.9"] = [
    name: "hwL2mcCacGlobalBandwidthExceed",
    fields: ["hwL2mcCacBandwidth", "hwL2mcCacGroupAddress", "hwL2mcCacSourceAddress"],
    fieldOids: ["hwL2mcCacBandwidth": "1.3.6.1.4.1.2011.5.25.44.5.2", "hwL2mcCacGroupAddress": "1.3.6.1.4.1.2011.5.25.44.5.3", "hwL2mcCacSourceAddress": "1.3.6.1.4.1.2011.5.25.44.5.12"]
]

// --- hwL2mcCacGlobalChannelCountExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.44.99.10
// Fields: hwL2mcCacChannelName, hwL2mcCacCount, hwL2mcCacGroupAddress, hwL2mcCacSourceAddress
// Description: Trap information about l2-multicast CAC:channel name,currently configured limit count,group IP address,source IP address.
trapMap["1.3.6.1.4.1.2011.5.25.44.99.10"] = [
    name: "hwL2mcCacGlobalChannelCountExceed",
    fields: ["hwL2mcCacChannelName", "hwL2mcCacCount", "hwL2mcCacGroupAddress", "hwL2mcCacSourceAddress"],
    fieldOids: ["hwL2mcCacChannelName": "1.3.6.1.4.1.2011.5.25.44.5.4", "hwL2mcCacCount": "1.3.6.1.4.1.2011.5.25.44.5.1", "hwL2mcCacGroupAddress": "1.3.6.1.4.1.2011.5.25.44.5.3", "hwL2mcCacSourceAddress": "1.3.6.1.4.1.2011.5.25.44.5.12"]
]

// --- hwL2mcCacGlobalChannelBandwidthExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.44.99.11
// Fields: hwL2mcCacChannelName, hwL2mcCacBandwidth, hwL2mcCacGroupAddress, hwL2mcCacSourceAddress
// Description: Trap information about l2-multicast CAC:channel name,currently configured limit bandwidth,group IP address,source IP address.
trapMap["1.3.6.1.4.1.2011.5.25.44.99.11"] = [
    name: "hwL2mcCacGlobalChannelBandwidthExceed",
    fields: ["hwL2mcCacChannelName", "hwL2mcCacBandwidth", "hwL2mcCacGroupAddress", "hwL2mcCacSourceAddress"],
    fieldOids: ["hwL2mcCacChannelName": "1.3.6.1.4.1.2011.5.25.44.5.4", "hwL2mcCacBandwidth": "1.3.6.1.4.1.2011.5.25.44.5.2", "hwL2mcCacGroupAddress": "1.3.6.1.4.1.2011.5.25.44.5.3", "hwL2mcCacSourceAddress": "1.3.6.1.4.1.2011.5.25.44.5.12"]
]

// --- hwL2mcCacVlanCountExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.44.99.12
// Fields: hwL2mcCacVlanIndex, hwL2mcCacCount, hwL2mcCacGroupAddress, hwL2mcCacSourceAddress
// Description: Trap information about l2-multicast CAC:VLAN ID,currently configured limit count,group IP address,source IP address.
trapMap["1.3.6.1.4.1.2011.5.25.44.99.12"] = [
    name: "hwL2mcCacVlanCountExceed",
    fields: ["hwL2mcCacVlanIndex", "hwL2mcCacCount", "hwL2mcCacGroupAddress", "hwL2mcCacSourceAddress"],
    fieldOids: ["hwL2mcCacVlanIndex": "1.3.6.1.4.1.2011.5.25.44.5.5", "hwL2mcCacCount": "1.3.6.1.4.1.2011.5.25.44.5.1", "hwL2mcCacGroupAddress": "1.3.6.1.4.1.2011.5.25.44.5.3", "hwL2mcCacSourceAddress": "1.3.6.1.4.1.2011.5.25.44.5.12"]
]

// --- hwL2mcCacVlanBandwidthExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.44.99.13
// Fields: hwL2mcCacVlanIndex, hwL2mcCacBandwidth, hwL2mcCacGroupAddress, hwL2mcCacSourceAddress
// Description: Trap information about l2-multicast CAC:VLAN ID,currently configured limit bandwidth,group IP address,source IP address.
trapMap["1.3.6.1.4.1.2011.5.25.44.99.13"] = [
    name: "hwL2mcCacVlanBandwidthExceed",
    fields: ["hwL2mcCacVlanIndex", "hwL2mcCacBandwidth", "hwL2mcCacGroupAddress", "hwL2mcCacSourceAddress"],
    fieldOids: ["hwL2mcCacVlanIndex": "1.3.6.1.4.1.2011.5.25.44.5.5", "hwL2mcCacBandwidth": "1.3.6.1.4.1.2011.5.25.44.5.2", "hwL2mcCacGroupAddress": "1.3.6.1.4.1.2011.5.25.44.5.3", "hwL2mcCacSourceAddress": "1.3.6.1.4.1.2011.5.25.44.5.12"]
]

// --- hwL2mcCacVlanChannelCountExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.44.99.14
// Fields: hwL2mcCacChannelName, hwL2mcCacVlanIndex, hwL2mcCacCount, hwL2mcCacGroupAddress, hwL2mcCacSourceAddress
// Description: Trap information about l2-multicast CAC:channel name,VLAN ID,currently configured limit count,group IP address,source IP address.
trapMap["1.3.6.1.4.1.2011.5.25.44.99.14"] = [
    name: "hwL2mcCacVlanChannelCountExceed",
    fields: ["hwL2mcCacChannelName", "hwL2mcCacVlanIndex", "hwL2mcCacCount", "hwL2mcCacGroupAddress", "hwL2mcCacSourceAddress"],
    fieldOids: ["hwL2mcCacChannelName": "1.3.6.1.4.1.2011.5.25.44.5.4", "hwL2mcCacVlanIndex": "1.3.6.1.4.1.2011.5.25.44.5.5", "hwL2mcCacCount": "1.3.6.1.4.1.2011.5.25.44.5.1", "hwL2mcCacGroupAddress": "1.3.6.1.4.1.2011.5.25.44.5.3", "hwL2mcCacSourceAddress": "1.3.6.1.4.1.2011.5.25.44.5.12"]
]

// --- hwL2mcCacVlanChannelBandwidthExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.44.99.15
// Fields: hwL2mcCacChannelName, hwL2mcCacVlanIndex, hwL2mcCacBandwidth, hwL2mcCacGroupAddress, hwL2mcCacSourceAddress
// Description: Trap information about l2-multicast CAC:channel name,VLAN ID,currently configured limit bandwidth,group IP address,source IP address.
trapMap["1.3.6.1.4.1.2011.5.25.44.99.15"] = [
    name: "hwL2mcCacVlanChannelBandwidthExceed",
    fields: ["hwL2mcCacChannelName", "hwL2mcCacVlanIndex", "hwL2mcCacBandwidth", "hwL2mcCacGroupAddress", "hwL2mcCacSourceAddress"],
    fieldOids: ["hwL2mcCacChannelName": "1.3.6.1.4.1.2011.5.25.44.5.4", "hwL2mcCacVlanIndex": "1.3.6.1.4.1.2011.5.25.44.5.5", "hwL2mcCacBandwidth": "1.3.6.1.4.1.2011.5.25.44.5.2", "hwL2mcCacGroupAddress": "1.3.6.1.4.1.2011.5.25.44.5.3", "hwL2mcCacSourceAddress": "1.3.6.1.4.1.2011.5.25.44.5.12"]
]

// --- hwL2mcCacVsiCountExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.44.99.16
// Fields: hwL2mcCacVsiName, hwL2mcCacCount, hwL2mcCacGroupAddress, hwL2mcCacSourceAddress
// Description: Trap information about l2-multicast CAC:VSI name,currently configured limit count,group IP address,source IP address.
trapMap["1.3.6.1.4.1.2011.5.25.44.99.16"] = [
    name: "hwL2mcCacVsiCountExceed",
    fields: ["hwL2mcCacVsiName", "hwL2mcCacCount", "hwL2mcCacGroupAddress", "hwL2mcCacSourceAddress"],
    fieldOids: ["hwL2mcCacVsiName": "1.3.6.1.4.1.2011.5.25.44.5.6", "hwL2mcCacCount": "1.3.6.1.4.1.2011.5.25.44.5.1", "hwL2mcCacGroupAddress": "1.3.6.1.4.1.2011.5.25.44.5.3", "hwL2mcCacSourceAddress": "1.3.6.1.4.1.2011.5.25.44.5.12"]
]

// --- hwL2mcCacVsiBandwidthExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.44.99.17
// Fields: hwL2mcCacVsiName, hwL2mcCacBandwidth, hwL2mcCacGroupAddress, hwL2mcCacSourceAddress
// Description: Trap information about l2-multicast CAC:VSI name,currently configured limit bandwidth,group IP address,source IP address.
trapMap["1.3.6.1.4.1.2011.5.25.44.99.17"] = [
    name: "hwL2mcCacVsiBandwidthExceed",
    fields: ["hwL2mcCacVsiName", "hwL2mcCacBandwidth", "hwL2mcCacGroupAddress", "hwL2mcCacSourceAddress"],
    fieldOids: ["hwL2mcCacVsiName": "1.3.6.1.4.1.2011.5.25.44.5.6", "hwL2mcCacBandwidth": "1.3.6.1.4.1.2011.5.25.44.5.2", "hwL2mcCacGroupAddress": "1.3.6.1.4.1.2011.5.25.44.5.3", "hwL2mcCacSourceAddress": "1.3.6.1.4.1.2011.5.25.44.5.12"]
]

// --- hwL2mcCacVsiChannelCountExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.44.99.18
// Fields: hwL2mcCacChannelName, hwL2mcCacVsiName, hwL2mcCacCount, hwL2mcCacGroupAddress, hwL2mcCacSourceAddress
// Description: Trap information about l2-multicast CAC:channel name,VSI name,currently configured limit count,group IP address,source IP address.
trapMap["1.3.6.1.4.1.2011.5.25.44.99.18"] = [
    name: "hwL2mcCacVsiChannelCountExceed",
    fields: ["hwL2mcCacChannelName", "hwL2mcCacVsiName", "hwL2mcCacCount", "hwL2mcCacGroupAddress", "hwL2mcCacSourceAddress"],
    fieldOids: ["hwL2mcCacChannelName": "1.3.6.1.4.1.2011.5.25.44.5.4", "hwL2mcCacVsiName": "1.3.6.1.4.1.2011.5.25.44.5.6", "hwL2mcCacCount": "1.3.6.1.4.1.2011.5.25.44.5.1", "hwL2mcCacGroupAddress": "1.3.6.1.4.1.2011.5.25.44.5.3", "hwL2mcCacSourceAddress": "1.3.6.1.4.1.2011.5.25.44.5.12"]
]

// --- hwL2mcCacVsiChannelBandwidthExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.44.99.19
// Fields: hwL2mcCacChannelName, hwL2mcCacVsiName, hwL2mcCacBandwidth, hwL2mcCacGroupAddress, hwL2mcCacSourceAddress
// Description: Trap information about l2-multicast CAC:channel name,VSI name,currently configured limit bandwidth,group IP address,source IP address.
trapMap["1.3.6.1.4.1.2011.5.25.44.99.19"] = [
    name: "hwL2mcCacVsiChannelBandwidthExceed",
    fields: ["hwL2mcCacChannelName", "hwL2mcCacVsiName", "hwL2mcCacBandwidth", "hwL2mcCacGroupAddress", "hwL2mcCacSourceAddress"],
    fieldOids: ["hwL2mcCacChannelName": "1.3.6.1.4.1.2011.5.25.44.5.4", "hwL2mcCacVsiName": "1.3.6.1.4.1.2011.5.25.44.5.6", "hwL2mcCacBandwidth": "1.3.6.1.4.1.2011.5.25.44.5.2", "hwL2mcCacGroupAddress": "1.3.6.1.4.1.2011.5.25.44.5.3", "hwL2mcCacSourceAddress": "1.3.6.1.4.1.2011.5.25.44.5.12"]
]

// --- hwL2mcCacPortCountExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.44.99.20
// Fields: hwL2mcCacIfIndex, hwL2mcCacCount, hwL2mcCacGroupAddress, hwL2mcCacSourceAddress, hwL2mcCacIfName
// Description: Trap information about l2-multicast CAC:interface index,currently configured limit count,group IP address,source IP address,interface name.
trapMap["1.3.6.1.4.1.2011.5.25.44.99.20"] = [
    name: "hwL2mcCacPortCountExceed",
    fields: ["hwL2mcCacIfIndex", "hwL2mcCacCount", "hwL2mcCacGroupAddress", "hwL2mcCacSourceAddress", "hwL2mcCacIfName"],
    fieldOids: ["hwL2mcCacIfIndex": "1.3.6.1.4.1.2011.5.25.44.5.7", "hwL2mcCacCount": "1.3.6.1.4.1.2011.5.25.44.5.1", "hwL2mcCacGroupAddress": "1.3.6.1.4.1.2011.5.25.44.5.3", "hwL2mcCacSourceAddress": "1.3.6.1.4.1.2011.5.25.44.5.12", "hwL2mcCacIfName": "1.3.6.1.4.1.2011.5.25.44.5.11"]
]

// --- hwL2mcCacPortBandwidthExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.44.99.21
// Fields: hwL2mcCacIfIndex, hwL2mcCacBandwidth, hwL2mcCacGroupAddress, hwL2mcCacSourceAddress, hwL2mcCacIfName
// Description: Trap information about l2-multicast CAC:interface index,currently configured limit bandwidth,group IP address,source IP address,interface name.
trapMap["1.3.6.1.4.1.2011.5.25.44.99.21"] = [
    name: "hwL2mcCacPortBandwidthExceed",
    fields: ["hwL2mcCacIfIndex", "hwL2mcCacBandwidth", "hwL2mcCacGroupAddress", "hwL2mcCacSourceAddress", "hwL2mcCacIfName"],
    fieldOids: ["hwL2mcCacIfIndex": "1.3.6.1.4.1.2011.5.25.44.5.7", "hwL2mcCacBandwidth": "1.3.6.1.4.1.2011.5.25.44.5.2", "hwL2mcCacGroupAddress": "1.3.6.1.4.1.2011.5.25.44.5.3", "hwL2mcCacSourceAddress": "1.3.6.1.4.1.2011.5.25.44.5.12", "hwL2mcCacIfName": "1.3.6.1.4.1.2011.5.25.44.5.11"]
]

// --- hwL2mcCacPortChannelCountExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.44.99.22
// Fields: hwL2mcCacChannelName, hwL2mcCacIfIndex, hwL2mcCacCount, hwL2mcCacGroupAddress, hwL2mcCacSourceAddress, hwL2mcCacIfName
// Description: Trap information about l2-multicast CAC:channel name,interface index,currently configured limit count,group IP address,source IP address,interface name.
trapMap["1.3.6.1.4.1.2011.5.25.44.99.22"] = [
    name: "hwL2mcCacPortChannelCountExceed",
    fields: ["hwL2mcCacChannelName", "hwL2mcCacIfIndex", "hwL2mcCacCount", "hwL2mcCacGroupAddress", "hwL2mcCacSourceAddress", "hwL2mcCacIfName"],
    fieldOids: ["hwL2mcCacChannelName": "1.3.6.1.4.1.2011.5.25.44.5.4", "hwL2mcCacIfIndex": "1.3.6.1.4.1.2011.5.25.44.5.7", "hwL2mcCacCount": "1.3.6.1.4.1.2011.5.25.44.5.1", "hwL2mcCacGroupAddress": "1.3.6.1.4.1.2011.5.25.44.5.3", "hwL2mcCacSourceAddress": "1.3.6.1.4.1.2011.5.25.44.5.12", "hwL2mcCacIfName": "1.3.6.1.4.1.2011.5.25.44.5.11"]
]

// --- hwL2mcCacPortChannelBandwidthExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.44.99.23
// Fields: hwL2mcCacChannelName, hwL2mcCacIfIndex, hwL2mcCacBandwidth, hwL2mcCacGroupAddress, hwL2mcCacSourceAddress, hwL2mcCacIfName
// Description: Trap information about l2-multicast CAC:channel name,interface index,currently configured limit bandwidth,group IP address,source IP address,interface name.
trapMap["1.3.6.1.4.1.2011.5.25.44.99.23"] = [
    name: "hwL2mcCacPortChannelBandwidthExceed",
    fields: ["hwL2mcCacChannelName", "hwL2mcCacIfIndex", "hwL2mcCacBandwidth", "hwL2mcCacGroupAddress", "hwL2mcCacSourceAddress", "hwL2mcCacIfName"],
    fieldOids: ["hwL2mcCacChannelName": "1.3.6.1.4.1.2011.5.25.44.5.4", "hwL2mcCacIfIndex": "1.3.6.1.4.1.2011.5.25.44.5.7", "hwL2mcCacBandwidth": "1.3.6.1.4.1.2011.5.25.44.5.2", "hwL2mcCacGroupAddress": "1.3.6.1.4.1.2011.5.25.44.5.3", "hwL2mcCacSourceAddress": "1.3.6.1.4.1.2011.5.25.44.5.12", "hwL2mcCacIfName": "1.3.6.1.4.1.2011.5.25.44.5.11"]
]

// --- hwL2mcCacPortVlanCountExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.44.99.24
// Fields: hwL2mcCacVlanIndex, hwL2mcCacIfIndex, hwL2mcCacCount, hwL2mcCacGroupAddress, hwL2mcCacSourceAddress, hwL2mcCacIfName
// Description: Trap information about l2-multicast CAC:VLAN ID,interface index,currently configured limit count,group IP address,source IP address,interface name.
trapMap["1.3.6.1.4.1.2011.5.25.44.99.24"] = [
    name: "hwL2mcCacPortVlanCountExceed",
    fields: ["hwL2mcCacVlanIndex", "hwL2mcCacIfIndex", "hwL2mcCacCount", "hwL2mcCacGroupAddress", "hwL2mcCacSourceAddress", "hwL2mcCacIfName"],
    fieldOids: ["hwL2mcCacVlanIndex": "1.3.6.1.4.1.2011.5.25.44.5.5", "hwL2mcCacIfIndex": "1.3.6.1.4.1.2011.5.25.44.5.7", "hwL2mcCacCount": "1.3.6.1.4.1.2011.5.25.44.5.1", "hwL2mcCacGroupAddress": "1.3.6.1.4.1.2011.5.25.44.5.3", "hwL2mcCacSourceAddress": "1.3.6.1.4.1.2011.5.25.44.5.12", "hwL2mcCacIfName": "1.3.6.1.4.1.2011.5.25.44.5.11"]
]

// --- hwL2mcCacPortVlanBandwidthExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.44.99.25
// Fields: hwL2mcCacVlanIndex, hwL2mcCacIfIndex, hwL2mcCacBandwidth, hwL2mcCacGroupAddress, hwL2mcCacSourceAddress, hwL2mcCacIfName
// Description: Trap information about l2-multicast CAC:VLAN ID,interface index,currently configured limit bandwidth,group IP address,source IP address,interface name.
trapMap["1.3.6.1.4.1.2011.5.25.44.99.25"] = [
    name: "hwL2mcCacPortVlanBandwidthExceed",
    fields: ["hwL2mcCacVlanIndex", "hwL2mcCacIfIndex", "hwL2mcCacBandwidth", "hwL2mcCacGroupAddress", "hwL2mcCacSourceAddress", "hwL2mcCacIfName"],
    fieldOids: ["hwL2mcCacVlanIndex": "1.3.6.1.4.1.2011.5.25.44.5.5", "hwL2mcCacIfIndex": "1.3.6.1.4.1.2011.5.25.44.5.7", "hwL2mcCacBandwidth": "1.3.6.1.4.1.2011.5.25.44.5.2", "hwL2mcCacGroupAddress": "1.3.6.1.4.1.2011.5.25.44.5.3", "hwL2mcCacSourceAddress": "1.3.6.1.4.1.2011.5.25.44.5.12", "hwL2mcCacIfName": "1.3.6.1.4.1.2011.5.25.44.5.11"]
]

// --- hwL2mcCacPortVlanChannelCountExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.44.99.26
// Fields: hwL2mcCacChannelName, hwL2mcCacVlanIndex, hwL2mcCacIfIndex, hwL2mcCacCount, hwL2mcCacGroupAddress, hwL2mcCacSourceAddress, hwL2mcCacIfName
// Description: Trap information about l2-multicast CAC:channel name,VLAN ID,interface index,currently configured limit count,group IP address,source IP address,interface name.
trapMap["1.3.6.1.4.1.2011.5.25.44.99.26"] = [
    name: "hwL2mcCacPortVlanChannelCountExceed",
    fields: ["hwL2mcCacChannelName", "hwL2mcCacVlanIndex", "hwL2mcCacIfIndex", "hwL2mcCacCount", "hwL2mcCacGroupAddress", "hwL2mcCacSourceAddress", "hwL2mcCacIfName"],
    fieldOids: ["hwL2mcCacChannelName": "1.3.6.1.4.1.2011.5.25.44.5.4", "hwL2mcCacVlanIndex": "1.3.6.1.4.1.2011.5.25.44.5.5", "hwL2mcCacIfIndex": "1.3.6.1.4.1.2011.5.25.44.5.7", "hwL2mcCacCount": "1.3.6.1.4.1.2011.5.25.44.5.1", "hwL2mcCacGroupAddress": "1.3.6.1.4.1.2011.5.25.44.5.3", "hwL2mcCacSourceAddress": "1.3.6.1.4.1.2011.5.25.44.5.12", "hwL2mcCacIfName": "1.3.6.1.4.1.2011.5.25.44.5.11"]
]

// --- hwL2mcCacPortVlanChannelBandwidthExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.44.99.27
// Fields: hwL2mcCacChannelName, hwL2mcCacVlanIndex, hwL2mcCacIfIndex, hwL2mcCacBandwidth, hwL2mcCacGroupAddress, hwL2mcCacSourceAddress, hwL2mcCacIfName
// Description: Trap information about l2-multicast CAC:channel name,VLAN ID,interface index,currently configured limit bandwidth,group IP address,source IP address,interface name.
trapMap["1.3.6.1.4.1.2011.5.25.44.99.27"] = [
    name: "hwL2mcCacPortVlanChannelBandwidthExceed",
    fields: ["hwL2mcCacChannelName", "hwL2mcCacVlanIndex", "hwL2mcCacIfIndex", "hwL2mcCacBandwidth", "hwL2mcCacGroupAddress", "hwL2mcCacSourceAddress", "hwL2mcCacIfName"],
    fieldOids: ["hwL2mcCacChannelName": "1.3.6.1.4.1.2011.5.25.44.5.4", "hwL2mcCacVlanIndex": "1.3.6.1.4.1.2011.5.25.44.5.5", "hwL2mcCacIfIndex": "1.3.6.1.4.1.2011.5.25.44.5.7", "hwL2mcCacBandwidth": "1.3.6.1.4.1.2011.5.25.44.5.2", "hwL2mcCacGroupAddress": "1.3.6.1.4.1.2011.5.25.44.5.3", "hwL2mcCacSourceAddress": "1.3.6.1.4.1.2011.5.25.44.5.12", "hwL2mcCacIfName": "1.3.6.1.4.1.2011.5.25.44.5.11"]
]

// --- hwL2mcCacSubIfCountExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.44.99.28
// Fields: hwL2mcCacIfIndex, hwL2mcCacCount, hwL2mcCacGroupAddress, hwL2mcCacSourceAddress, hwL2mcCacIfName
// Description: Trap information about l2-multicast CAC:interface index,currently configured limit count,group IP address,source IP address,interface name.
trapMap["1.3.6.1.4.1.2011.5.25.44.99.28"] = [
    name: "hwL2mcCacSubIfCountExceed",
    fields: ["hwL2mcCacIfIndex", "hwL2mcCacCount", "hwL2mcCacGroupAddress", "hwL2mcCacSourceAddress", "hwL2mcCacIfName"],
    fieldOids: ["hwL2mcCacIfIndex": "1.3.6.1.4.1.2011.5.25.44.5.7", "hwL2mcCacCount": "1.3.6.1.4.1.2011.5.25.44.5.1", "hwL2mcCacGroupAddress": "1.3.6.1.4.1.2011.5.25.44.5.3", "hwL2mcCacSourceAddress": "1.3.6.1.4.1.2011.5.25.44.5.12", "hwL2mcCacIfName": "1.3.6.1.4.1.2011.5.25.44.5.11"]
]

// --- hwL2mcCacSubIfBandwidthExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.44.99.29
// Fields: hwL2mcCacIfIndex, hwL2mcCacBandwidth, hwL2mcCacGroupAddress, hwL2mcCacSourceAddress, hwL2mcCacIfName
// Description: Trap information about l2-multicast CAC:interface index,currently configured limit bandwidth,group IP address,source IP address,interface name.
trapMap["1.3.6.1.4.1.2011.5.25.44.99.29"] = [
    name: "hwL2mcCacSubIfBandwidthExceed",
    fields: ["hwL2mcCacIfIndex", "hwL2mcCacBandwidth", "hwL2mcCacGroupAddress", "hwL2mcCacSourceAddress", "hwL2mcCacIfName"],
    fieldOids: ["hwL2mcCacIfIndex": "1.3.6.1.4.1.2011.5.25.44.5.7", "hwL2mcCacBandwidth": "1.3.6.1.4.1.2011.5.25.44.5.2", "hwL2mcCacGroupAddress": "1.3.6.1.4.1.2011.5.25.44.5.3", "hwL2mcCacSourceAddress": "1.3.6.1.4.1.2011.5.25.44.5.12", "hwL2mcCacIfName": "1.3.6.1.4.1.2011.5.25.44.5.11"]
]

// --- hwL2mcCacSubIfChannelCountExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.44.99.30
// Fields: hwL2mcCacChannelName, hwL2mcCacIfIndex, hwL2mcCacCount, hwL2mcCacGroupAddress, hwL2mcCacSourceAddress, hwL2mcCacIfName
// Description: Trap information about l2-multicast CAC:channel name,interface index,currently configured limit count,group IP address,source IP address,interface name.
trapMap["1.3.6.1.4.1.2011.5.25.44.99.30"] = [
    name: "hwL2mcCacSubIfChannelCountExceed",
    fields: ["hwL2mcCacChannelName", "hwL2mcCacIfIndex", "hwL2mcCacCount", "hwL2mcCacGroupAddress", "hwL2mcCacSourceAddress", "hwL2mcCacIfName"],
    fieldOids: ["hwL2mcCacChannelName": "1.3.6.1.4.1.2011.5.25.44.5.4", "hwL2mcCacIfIndex": "1.3.6.1.4.1.2011.5.25.44.5.7", "hwL2mcCacCount": "1.3.6.1.4.1.2011.5.25.44.5.1", "hwL2mcCacGroupAddress": "1.3.6.1.4.1.2011.5.25.44.5.3", "hwL2mcCacSourceAddress": "1.3.6.1.4.1.2011.5.25.44.5.12", "hwL2mcCacIfName": "1.3.6.1.4.1.2011.5.25.44.5.11"]
]

// --- hwL2mcCacSubIfChannelBandwidthExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.44.99.31
// Fields: hwL2mcCacChannelName, hwL2mcCacIfIndex, hwL2mcCacBandwidth, hwL2mcCacGroupAddress, hwL2mcCacSourceAddress, hwL2mcCacIfName
// Description: Trap information about l2-multicast CAC:channel name,interface index,currently configured limit bandwidth,group IP address,source IP address,interface name.
trapMap["1.3.6.1.4.1.2011.5.25.44.99.31"] = [
    name: "hwL2mcCacSubIfChannelBandwidthExceed",
    fields: ["hwL2mcCacChannelName", "hwL2mcCacIfIndex", "hwL2mcCacBandwidth", "hwL2mcCacGroupAddress", "hwL2mcCacSourceAddress", "hwL2mcCacIfName"],
    fieldOids: ["hwL2mcCacChannelName": "1.3.6.1.4.1.2011.5.25.44.5.4", "hwL2mcCacIfIndex": "1.3.6.1.4.1.2011.5.25.44.5.7", "hwL2mcCacBandwidth": "1.3.6.1.4.1.2011.5.25.44.5.2", "hwL2mcCacGroupAddress": "1.3.6.1.4.1.2011.5.25.44.5.3", "hwL2mcCacSourceAddress": "1.3.6.1.4.1.2011.5.25.44.5.12", "hwL2mcCacIfName": "1.3.6.1.4.1.2011.5.25.44.5.11"]
]

// --- hwL2mcCacLdpPwCountExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.44.99.32
// Fields: hwL2mcCacPwId, hwL2mcCacRemoteIpAddress, hwL2mcCacCount, hwL2mcCacGroupAddress, hwL2mcCacSourceAddress
// Description: Trap information about l2-multicast CAC:PW ID,currently configured limit count,group IP address,source IP address.
trapMap["1.3.6.1.4.1.2011.5.25.44.99.32"] = [
    name: "hwL2mcCacLdpPwCountExceed",
    fields: ["hwL2mcCacPwId", "hwL2mcCacRemoteIpAddress", "hwL2mcCacCount", "hwL2mcCacGroupAddress", "hwL2mcCacSourceAddress"],
    fieldOids: ["hwL2mcCacPwId": "1.3.6.1.4.1.2011.5.25.44.5.8", "hwL2mcCacRemoteIpAddress": "1.3.6.1.4.1.2011.5.25.44.5.9", "hwL2mcCacCount": "1.3.6.1.4.1.2011.5.25.44.5.1", "hwL2mcCacGroupAddress": "1.3.6.1.4.1.2011.5.25.44.5.3", "hwL2mcCacSourceAddress": "1.3.6.1.4.1.2011.5.25.44.5.12"]
]

// --- hwL2mcCacLdpPwBandwidthExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.44.99.33
// Fields: hwL2mcCacPwId, hwL2mcCacRemoteIpAddress, hwL2mcCacBandwidth, hwL2mcCacGroupAddress, hwL2mcCacSourceAddress
// Description: Trap information about l2-multicast CAC:PW ID,currently configured limit bandwidth,group IP address.
trapMap["1.3.6.1.4.1.2011.5.25.44.99.33"] = [
    name: "hwL2mcCacLdpPwBandwidthExceed",
    fields: ["hwL2mcCacPwId", "hwL2mcCacRemoteIpAddress", "hwL2mcCacBandwidth", "hwL2mcCacGroupAddress", "hwL2mcCacSourceAddress"],
    fieldOids: ["hwL2mcCacPwId": "1.3.6.1.4.1.2011.5.25.44.5.8", "hwL2mcCacRemoteIpAddress": "1.3.6.1.4.1.2011.5.25.44.5.9", "hwL2mcCacBandwidth": "1.3.6.1.4.1.2011.5.25.44.5.2", "hwL2mcCacGroupAddress": "1.3.6.1.4.1.2011.5.25.44.5.3", "hwL2mcCacSourceAddress": "1.3.6.1.4.1.2011.5.25.44.5.12"]
]

// --- hwL2mcCacLdpPwChannelCountExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.44.99.34
// Fields: hwL2mcCacChannelName, hwL2mcCacPwId, hwL2mcCacRemoteIpAddress, hwL2mcCacCount, hwL2mcCacGroupAddress, hwL2mcCacSourceAddress
// Description: Trap information about l2-multicast CAC:channel name,PW ID,currently configured limit count,group IP address,source IP address.
trapMap["1.3.6.1.4.1.2011.5.25.44.99.34"] = [
    name: "hwL2mcCacLdpPwChannelCountExceed",
    fields: ["hwL2mcCacChannelName", "hwL2mcCacPwId", "hwL2mcCacRemoteIpAddress", "hwL2mcCacCount", "hwL2mcCacGroupAddress", "hwL2mcCacSourceAddress"],
    fieldOids: ["hwL2mcCacChannelName": "1.3.6.1.4.1.2011.5.25.44.5.4", "hwL2mcCacPwId": "1.3.6.1.4.1.2011.5.25.44.5.8", "hwL2mcCacRemoteIpAddress": "1.3.6.1.4.1.2011.5.25.44.5.9", "hwL2mcCacCount": "1.3.6.1.4.1.2011.5.25.44.5.1", "hwL2mcCacGroupAddress": "1.3.6.1.4.1.2011.5.25.44.5.3", "hwL2mcCacSourceAddress": "1.3.6.1.4.1.2011.5.25.44.5.12"]
]

// --- hwL2mcCacLdpPwChannelBandwidthExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.44.99.35
// Fields: hwL2mcCacChannelName, hwL2mcCacPwId, hwL2mcCacRemoteIpAddress, hwL2mcCacBandwidth, hwL2mcCacGroupAddress, hwL2mcCacSourceAddress
// Description: Trap information about l2-multicast CAC:channel name,PW ID,currently configured limit bandwidth,group IP address,source IP address.
trapMap["1.3.6.1.4.1.2011.5.25.44.99.35"] = [
    name: "hwL2mcCacLdpPwChannelBandwidthExceed",
    fields: ["hwL2mcCacChannelName", "hwL2mcCacPwId", "hwL2mcCacRemoteIpAddress", "hwL2mcCacBandwidth", "hwL2mcCacGroupAddress", "hwL2mcCacSourceAddress"],
    fieldOids: ["hwL2mcCacChannelName": "1.3.6.1.4.1.2011.5.25.44.5.4", "hwL2mcCacPwId": "1.3.6.1.4.1.2011.5.25.44.5.8", "hwL2mcCacRemoteIpAddress": "1.3.6.1.4.1.2011.5.25.44.5.9", "hwL2mcCacBandwidth": "1.3.6.1.4.1.2011.5.25.44.5.2", "hwL2mcCacGroupAddress": "1.3.6.1.4.1.2011.5.25.44.5.3", "hwL2mcCacSourceAddress": "1.3.6.1.4.1.2011.5.25.44.5.12"]
]

// --- hwL2mcCacBgpPwCountExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.44.99.36
// Fields: hwL2mcCacRemoteSiteId, hwL2mcCacCount, hwL2mcCacGroupAddress, hwL2mcCacSourceAddress
// Description: Trap information about l2-multicast CAC:remote site ID,PW ID,currently configured limit count,group IP address,source IP address.
trapMap["1.3.6.1.4.1.2011.5.25.44.99.36"] = [
    name: "hwL2mcCacBgpPwCountExceed",
    fields: ["hwL2mcCacRemoteSiteId", "hwL2mcCacCount", "hwL2mcCacGroupAddress", "hwL2mcCacSourceAddress"],
    fieldOids: ["hwL2mcCacRemoteSiteId": "1.3.6.1.4.1.2011.5.25.44.5.10", "hwL2mcCacCount": "1.3.6.1.4.1.2011.5.25.44.5.1", "hwL2mcCacGroupAddress": "1.3.6.1.4.1.2011.5.25.44.5.3", "hwL2mcCacSourceAddress": "1.3.6.1.4.1.2011.5.25.44.5.12"]
]

// --- hwL2mcCacBgpPwBandwidthExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.44.99.37
// Fields: hwL2mcCacRemoteSiteId, hwL2mcCacBandwidth, hwL2mcCacGroupAddress, hwL2mcCacSourceAddress
// Description: Trap information about l2-multicast CAC:remote site ID,PW ID,currently configured limit bandwidth,group IP address,source IP address.
trapMap["1.3.6.1.4.1.2011.5.25.44.99.37"] = [
    name: "hwL2mcCacBgpPwBandwidthExceed",
    fields: ["hwL2mcCacRemoteSiteId", "hwL2mcCacBandwidth", "hwL2mcCacGroupAddress", "hwL2mcCacSourceAddress"],
    fieldOids: ["hwL2mcCacRemoteSiteId": "1.3.6.1.4.1.2011.5.25.44.5.10", "hwL2mcCacBandwidth": "1.3.6.1.4.1.2011.5.25.44.5.2", "hwL2mcCacGroupAddress": "1.3.6.1.4.1.2011.5.25.44.5.3", "hwL2mcCacSourceAddress": "1.3.6.1.4.1.2011.5.25.44.5.12"]
]

// --- hwL2mcCacBgpPwChannelCountExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.44.99.38
// Fields: hwL2mcCacChannelName, hwL2mcCacRemoteSiteId, hwL2mcCacCount, hwL2mcCacGroupAddress, hwL2mcCacSourceAddress
// Description: Trap information about l2-multicast CAC:channel name,remote site ID,PW ID,currently configured limit count,group IP address,source IP address.
trapMap["1.3.6.1.4.1.2011.5.25.44.99.38"] = [
    name: "hwL2mcCacBgpPwChannelCountExceed",
    fields: ["hwL2mcCacChannelName", "hwL2mcCacRemoteSiteId", "hwL2mcCacCount", "hwL2mcCacGroupAddress", "hwL2mcCacSourceAddress"],
    fieldOids: ["hwL2mcCacChannelName": "1.3.6.1.4.1.2011.5.25.44.5.4", "hwL2mcCacRemoteSiteId": "1.3.6.1.4.1.2011.5.25.44.5.10", "hwL2mcCacCount": "1.3.6.1.4.1.2011.5.25.44.5.1", "hwL2mcCacGroupAddress": "1.3.6.1.4.1.2011.5.25.44.5.3", "hwL2mcCacSourceAddress": "1.3.6.1.4.1.2011.5.25.44.5.12"]
]

// --- hwL2mcCacBgpPwChannelBandwidthExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.44.99.39
// Fields: hwL2mcCacChannelName, hwL2mcCacRemoteSiteId, hwL2mcCacBandwidth, hwL2mcCacGroupAddress, hwL2mcCacSourceAddress
// Description: Trap information about l2-multicast CAC:channel name,remote site ID,PW ID,currently configured limit bandwidth,group IP address,source IP address.
trapMap["1.3.6.1.4.1.2011.5.25.44.99.39"] = [
    name: "hwL2mcCacBgpPwChannelBandwidthExceed",
    fields: ["hwL2mcCacChannelName", "hwL2mcCacRemoteSiteId", "hwL2mcCacBandwidth", "hwL2mcCacGroupAddress", "hwL2mcCacSourceAddress"],
    fieldOids: ["hwL2mcCacChannelName": "1.3.6.1.4.1.2011.5.25.44.5.4", "hwL2mcCacRemoteSiteId": "1.3.6.1.4.1.2011.5.25.44.5.10", "hwL2mcCacBandwidth": "1.3.6.1.4.1.2011.5.25.44.5.2", "hwL2mcCacGroupAddress": "1.3.6.1.4.1.2011.5.25.44.5.3", "hwL2mcCacSourceAddress": "1.3.6.1.4.1.2011.5.25.44.5.12"]
]

// --- hwL2mcCacVlanUnspecifiedChannelDeny (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.44.99.40
// Fields: hwL2mcCacVlanIndex, hwL2mcCacGroupAddress, hwL2mcCacSourceAddress
// Description: Trap information about l2-multicast CAC:VLAN ID,group IP address,source IP address.
trapMap["1.3.6.1.4.1.2011.5.25.44.99.40"] = [
    name: "hwL2mcCacVlanUnspecifiedChannelDeny",
    fields: ["hwL2mcCacVlanIndex", "hwL2mcCacGroupAddress", "hwL2mcCacSourceAddress"],
    fieldOids: ["hwL2mcCacVlanIndex": "1.3.6.1.4.1.2011.5.25.44.5.5", "hwL2mcCacGroupAddress": "1.3.6.1.4.1.2011.5.25.44.5.3", "hwL2mcCacSourceAddress": "1.3.6.1.4.1.2011.5.25.44.5.12"]
]

// --- hwL2mcCacVsiUnspecifiedChannelDeny (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.44.99.41
// Fields: hwL2mcCacVsiName, hwL2mcCacGroupAddress, hwL2mcCacSourceAddress
// Description: Trap information about l2-multicast CAC:VSI name,group IP address,source IP address.
trapMap["1.3.6.1.4.1.2011.5.25.44.99.41"] = [
    name: "hwL2mcCacVsiUnspecifiedChannelDeny",
    fields: ["hwL2mcCacVsiName", "hwL2mcCacGroupAddress", "hwL2mcCacSourceAddress"],
    fieldOids: ["hwL2mcCacVsiName": "1.3.6.1.4.1.2011.5.25.44.5.6", "hwL2mcCacGroupAddress": "1.3.6.1.4.1.2011.5.25.44.5.3", "hwL2mcCacSourceAddress": "1.3.6.1.4.1.2011.5.25.44.5.12"]
]

// --- hwL2mcCacGlobalUnspecifiedChannelDeny (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.44.99.42
// Fields: hwL2mcCacGroupAddress, hwL2mcCacSourceAddress
// Description: Trap information about l2-multicast CAC:group IP address,source IP address.
trapMap["1.3.6.1.4.1.2011.5.25.44.99.42"] = [
    name: "hwL2mcCacGlobalUnspecifiedChannelDeny",
    fields: ["hwL2mcCacGroupAddress", "hwL2mcCacSourceAddress"],
    fieldOids: ["hwL2mcCacGroupAddress": "1.3.6.1.4.1.2011.5.25.44.5.3", "hwL2mcCacSourceAddress": "1.3.6.1.4.1.2011.5.25.44.5.12"]
]

// --- hwL2mcCacQinQIfCountExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.44.99.43
// Fields: hwL2mcCacIfIndex, hwL2mcCacIfName, hwL2mcCacCount, hwL2mcCacGroupAddress, hwL2mcCacSourceAddress, hwL2mcCacPeVid, hwL2mcCacCeVid
// Description: Trap information about l2-multicast CAC:interface index,interface name,currently configured limit count,group IP address,source IP address,pe id,ce id.
trapMap["1.3.6.1.4.1.2011.5.25.44.99.43"] = [
    name: "hwL2mcCacQinQIfCountExceed",
    fields: ["hwL2mcCacIfIndex", "hwL2mcCacIfName", "hwL2mcCacCount", "hwL2mcCacGroupAddress", "hwL2mcCacSourceAddress", "hwL2mcCacPeVid", "hwL2mcCacCeVid"],
    fieldOids: ["hwL2mcCacIfIndex": "1.3.6.1.4.1.2011.5.25.44.5.7", "hwL2mcCacIfName": "1.3.6.1.4.1.2011.5.25.44.5.11", "hwL2mcCacCount": "1.3.6.1.4.1.2011.5.25.44.5.1", "hwL2mcCacGroupAddress": "1.3.6.1.4.1.2011.5.25.44.5.3", "hwL2mcCacSourceAddress": "1.3.6.1.4.1.2011.5.25.44.5.12", "hwL2mcCacPeVid": "1.3.6.1.4.1.2011.5.25.44.5.13", "hwL2mcCacCeVid": "1.3.6.1.4.1.2011.5.25.44.5.14"]
]

// --- hwL2mcCacQinQIfBandwidthExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.44.99.44
// Fields: hwL2mcCacIfIndex, hwL2mcCacIfName, hwL2mcCacBandwidth, hwL2mcCacGroupAddress, hwL2mcCacSourceAddress, hwL2mcCacPeVid, hwL2mcCacCeVid
// Description: Trap information about l2-multicast CAC:interface index,interface name,currently configured limit bandwidth,group IP address,source IP address,pe id,ce id.
trapMap["1.3.6.1.4.1.2011.5.25.44.99.44"] = [
    name: "hwL2mcCacQinQIfBandwidthExceed",
    fields: ["hwL2mcCacIfIndex", "hwL2mcCacIfName", "hwL2mcCacBandwidth", "hwL2mcCacGroupAddress", "hwL2mcCacSourceAddress", "hwL2mcCacPeVid", "hwL2mcCacCeVid"],
    fieldOids: ["hwL2mcCacIfIndex": "1.3.6.1.4.1.2011.5.25.44.5.7", "hwL2mcCacIfName": "1.3.6.1.4.1.2011.5.25.44.5.11", "hwL2mcCacBandwidth": "1.3.6.1.4.1.2011.5.25.44.5.2", "hwL2mcCacGroupAddress": "1.3.6.1.4.1.2011.5.25.44.5.3", "hwL2mcCacSourceAddress": "1.3.6.1.4.1.2011.5.25.44.5.12", "hwL2mcCacPeVid": "1.3.6.1.4.1.2011.5.25.44.5.13", "hwL2mcCacCeVid": "1.3.6.1.4.1.2011.5.25.44.5.14"]
]

// --- hwL2mcCacQinQIfChannelCountExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.44.99.45
// Fields: hwL2mcCacChannelName, hwL2mcCacIfIndex, hwL2mcCacIfName, hwL2mcCacCount, hwL2mcCacGroupAddress, hwL2mcCacSourceAddress, hwL2mcCacPeVid, hwL2mcCacCeVid
// Description: Trap information about l2-multicast CAC:channel name,interface index,interface name,currently configured limit count,group IP address,source IP address,pe id,ce id.
trapMap["1.3.6.1.4.1.2011.5.25.44.99.45"] = [
    name: "hwL2mcCacQinQIfChannelCountExceed",
    fields: ["hwL2mcCacChannelName", "hwL2mcCacIfIndex", "hwL2mcCacIfName", "hwL2mcCacCount", "hwL2mcCacGroupAddress", "hwL2mcCacSourceAddress", "hwL2mcCacPeVid", "hwL2mcCacCeVid"],
    fieldOids: ["hwL2mcCacChannelName": "1.3.6.1.4.1.2011.5.25.44.5.4", "hwL2mcCacIfIndex": "1.3.6.1.4.1.2011.5.25.44.5.7", "hwL2mcCacIfName": "1.3.6.1.4.1.2011.5.25.44.5.11", "hwL2mcCacCount": "1.3.6.1.4.1.2011.5.25.44.5.1", "hwL2mcCacGroupAddress": "1.3.6.1.4.1.2011.5.25.44.5.3", "hwL2mcCacSourceAddress": "1.3.6.1.4.1.2011.5.25.44.5.12", "hwL2mcCacPeVid": "1.3.6.1.4.1.2011.5.25.44.5.13", "hwL2mcCacCeVid": "1.3.6.1.4.1.2011.5.25.44.5.14"]
]

// --- hwL2mcCacQinQIfChannelBandwidthExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.44.99.46
// Fields: hwL2mcCacChannelName, hwL2mcCacIfIndex, hwL2mcCacIfName, hwL2mcCacBandwidth, hwL2mcCacGroupAddress, hwL2mcCacSourceAddress, hwL2mcCacPeVid, hwL2mcCacCeVid
// Description: Trap information about l2-multicast CAC:channel name,interface index,interface name,currently configured bandwidth count,group IP address,source IP address,pe id,ce id.
trapMap["1.3.6.1.4.1.2011.5.25.44.99.46"] = [
    name: "hwL2mcCacQinQIfChannelBandwidthExceed",
    fields: ["hwL2mcCacChannelName", "hwL2mcCacIfIndex", "hwL2mcCacIfName", "hwL2mcCacBandwidth", "hwL2mcCacGroupAddress", "hwL2mcCacSourceAddress", "hwL2mcCacPeVid", "hwL2mcCacCeVid"],
    fieldOids: ["hwL2mcCacChannelName": "1.3.6.1.4.1.2011.5.25.44.5.4", "hwL2mcCacIfIndex": "1.3.6.1.4.1.2011.5.25.44.5.7", "hwL2mcCacIfName": "1.3.6.1.4.1.2011.5.25.44.5.11", "hwL2mcCacBandwidth": "1.3.6.1.4.1.2011.5.25.44.5.2", "hwL2mcCacGroupAddress": "1.3.6.1.4.1.2011.5.25.44.5.3", "hwL2mcCacSourceAddress": "1.3.6.1.4.1.2011.5.25.44.5.12", "hwL2mcCacPeVid": "1.3.6.1.4.1.2011.5.25.44.5.13", "hwL2mcCacCeVid": "1.3.6.1.4.1.2011.5.25.44.5.14"]
]

// --- hwL2mcReceiveIgmpVlanAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.44.99.47
// Fields: hwL2mcTrapVlanIndex, hwL2mcRecvIgmpCount
// Description: Trap information about receive igmp packet in a vlan alarm.
trapMap["1.3.6.1.4.1.2011.5.25.44.99.47"] = [
    name: "hwL2mcReceiveIgmpVlanAlarm",
    fields: ["hwL2mcTrapVlanIndex", "hwL2mcRecvIgmpCount"],
    fieldOids: ["hwL2mcTrapVlanIndex": "1.3.6.1.4.1.2011.5.25.44.5.17", "hwL2mcRecvIgmpCount": "1.3.6.1.4.1.2011.5.25.44.5.15"]
]

// --- hwL2mcReceiveIgmpVsiAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.44.99.48
// Fields: hwL2mcTrapVsiName, hwL2mcRecvIgmpCount
// Description: Trap information about receive igmp packet in a VSI alarm..
trapMap["1.3.6.1.4.1.2011.5.25.44.99.48"] = [
    name: "hwL2mcReceiveIgmpVsiAlarm",
    fields: ["hwL2mcTrapVsiName", "hwL2mcRecvIgmpCount"],
    fieldOids: ["hwL2mcTrapVsiName": "1.3.6.1.4.1.2011.5.25.44.5.18", "hwL2mcRecvIgmpCount": "1.3.6.1.4.1.2011.5.25.44.5.15"]
]

// --- hwL2mcReceiveIgmpVlanRecover (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.44.99.49
// Fields: hwL2mcTrapVlanIndex, hwL2mcRecvIgmpCount
// Description: Trap information about receive igmp packet in a vlan alarm clear.
trapMap["1.3.6.1.4.1.2011.5.25.44.99.49"] = [
    name: "hwL2mcReceiveIgmpVlanRecover",
    fields: ["hwL2mcTrapVlanIndex", "hwL2mcRecvIgmpCount"],
    fieldOids: ["hwL2mcTrapVlanIndex": "1.3.6.1.4.1.2011.5.25.44.5.17", "hwL2mcRecvIgmpCount": "1.3.6.1.4.1.2011.5.25.44.5.15"]
]

// --- hwL2mcReceiveIgmpVsiRecover (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.44.99.50
// Fields: hwL2mcTrapVsiName, hwL2mcRecvIgmpCount
// Description: Trap information about receive igmp packet in a VSI alarm clear.
trapMap["1.3.6.1.4.1.2011.5.25.44.99.50"] = [
    name: "hwL2mcReceiveIgmpVsiRecover",
    fields: ["hwL2mcTrapVsiName", "hwL2mcRecvIgmpCount"],
    fieldOids: ["hwL2mcTrapVsiName": "1.3.6.1.4.1.2011.5.25.44.5.18", "hwL2mcRecvIgmpCount": "1.3.6.1.4.1.2011.5.25.44.5.15"]
]

// --- hwL2mcDropIgmpVlanAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.44.99.51
// Fields: hwL2mcTrapVlanIndex, hwL2mcDropIgmpCount
// Description: Trap information about drop igmp packet in a vlan alarm.
trapMap["1.3.6.1.4.1.2011.5.25.44.99.51"] = [
    name: "hwL2mcDropIgmpVlanAlarm",
    fields: ["hwL2mcTrapVlanIndex", "hwL2mcDropIgmpCount"],
    fieldOids: ["hwL2mcTrapVlanIndex": "1.3.6.1.4.1.2011.5.25.44.5.17", "hwL2mcDropIgmpCount": "1.3.6.1.4.1.2011.5.25.44.5.16"]
]

// --- hwL2mcDropIgmpVsiAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.44.99.52
// Fields: hwL2mcTrapVsiName, hwL2mcDropIgmpCount
// Description: Trap information about drop igmp packet in a VSI alarm.
trapMap["1.3.6.1.4.1.2011.5.25.44.99.52"] = [
    name: "hwL2mcDropIgmpVsiAlarm",
    fields: ["hwL2mcTrapVsiName", "hwL2mcDropIgmpCount"],
    fieldOids: ["hwL2mcTrapVsiName": "1.3.6.1.4.1.2011.5.25.44.5.18", "hwL2mcDropIgmpCount": "1.3.6.1.4.1.2011.5.25.44.5.16"]
]

// --- hwL2mcDropIgmpVlanRecover (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.44.99.53
// Fields: hwL2mcTrapVlanIndex, hwL2mcDropIgmpCount
// Description: Trap information about drop igmp packet in a vlan alarm clear.
trapMap["1.3.6.1.4.1.2011.5.25.44.99.53"] = [
    name: "hwL2mcDropIgmpVlanRecover",
    fields: ["hwL2mcTrapVlanIndex", "hwL2mcDropIgmpCount"],
    fieldOids: ["hwL2mcTrapVlanIndex": "1.3.6.1.4.1.2011.5.25.44.5.17", "hwL2mcDropIgmpCount": "1.3.6.1.4.1.2011.5.25.44.5.16"]
]

// --- hwL2mcDropIgmpVsiRecover (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.44.99.54
// Fields: hwL2mcTrapVsiName, hwL2mcDropIgmpCount
// Description: Trap information about drop igmp packet in a VSI alarm clear.
trapMap["1.3.6.1.4.1.2011.5.25.44.99.54"] = [
    name: "hwL2mcDropIgmpVsiRecover",
    fields: ["hwL2mcTrapVsiName", "hwL2mcDropIgmpCount"],
    fieldOids: ["hwL2mcTrapVsiName": "1.3.6.1.4.1.2011.5.25.44.5.18", "hwL2mcDropIgmpCount": "1.3.6.1.4.1.2011.5.25.44.5.16"]
]

// --- hwL2mc24HReceiveIgmpVlanAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.44.99.55
// Fields: hwL2mcTrapVlanIndex, hwL2mcRecvIgmpCount
// Description: Trap information about receive igmp packet in a vlan alarm in 24 hour.
trapMap["1.3.6.1.4.1.2011.5.25.44.99.55"] = [
    name: "hwL2mc24HReceiveIgmpVlanAlarm",
    fields: ["hwL2mcTrapVlanIndex", "hwL2mcRecvIgmpCount"],
    fieldOids: ["hwL2mcTrapVlanIndex": "1.3.6.1.4.1.2011.5.25.44.5.17", "hwL2mcRecvIgmpCount": "1.3.6.1.4.1.2011.5.25.44.5.15"]
]

// --- hwL2mc24HReceiveIgmpVsiAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.44.99.56
// Fields: hwL2mcTrapVsiName, hwL2mcRecvIgmpCount
// Description: Trap information about receive igmp packet in a vsi alarm in 24 hour.
trapMap["1.3.6.1.4.1.2011.5.25.44.99.56"] = [
    name: "hwL2mc24HReceiveIgmpVsiAlarm",
    fields: ["hwL2mcTrapVsiName", "hwL2mcRecvIgmpCount"],
    fieldOids: ["hwL2mcTrapVsiName": "1.3.6.1.4.1.2011.5.25.44.5.18", "hwL2mcRecvIgmpCount": "1.3.6.1.4.1.2011.5.25.44.5.15"]
]

// --- hwL2mc24HReceiveIgmpVlanRecover (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.44.99.57
// Fields: hwL2mcTrapVlanIndex, hwL2mcRecvIgmpCount
// Description: Trap information about receive igmp packet in a vlan alarm clear in 24 hour.
trapMap["1.3.6.1.4.1.2011.5.25.44.99.57"] = [
    name: "hwL2mc24HReceiveIgmpVlanRecover",
    fields: ["hwL2mcTrapVlanIndex", "hwL2mcRecvIgmpCount"],
    fieldOids: ["hwL2mcTrapVlanIndex": "1.3.6.1.4.1.2011.5.25.44.5.17", "hwL2mcRecvIgmpCount": "1.3.6.1.4.1.2011.5.25.44.5.15"]
]

// --- hwL2mc24HReceiveIgmpVsiRecover (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.44.99.58
// Fields: hwL2mcTrapVsiName, hwL2mcRecvIgmpCount
// Description: Trap information about receive igmp packet in a VSI alarm clear in 24 hour.
trapMap["1.3.6.1.4.1.2011.5.25.44.99.58"] = [
    name: "hwL2mc24HReceiveIgmpVsiRecover",
    fields: ["hwL2mcTrapVsiName", "hwL2mcRecvIgmpCount"],
    fieldOids: ["hwL2mcTrapVsiName": "1.3.6.1.4.1.2011.5.25.44.5.18", "hwL2mcRecvIgmpCount": "1.3.6.1.4.1.2011.5.25.44.5.15"]
]

// --- hwL2mc24HDropIgmpVlanAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.44.99.59
// Fields: hwL2mcTrapVlanIndex, hwL2mcDropIgmpCount
// Description: Trap information about drop igmp packet in a vlan alarm in 24 hour.
trapMap["1.3.6.1.4.1.2011.5.25.44.99.59"] = [
    name: "hwL2mc24HDropIgmpVlanAlarm",
    fields: ["hwL2mcTrapVlanIndex", "hwL2mcDropIgmpCount"],
    fieldOids: ["hwL2mcTrapVlanIndex": "1.3.6.1.4.1.2011.5.25.44.5.17", "hwL2mcDropIgmpCount": "1.3.6.1.4.1.2011.5.25.44.5.16"]
]

// --- hwL2mc24HDropIgmpVsiAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.44.99.60
// Fields: hwL2mcTrapVsiName, hwL2mcDropIgmpCount
// Description: Trap information about drop igmp packet in a VSI alarm in 24 hour.
trapMap["1.3.6.1.4.1.2011.5.25.44.99.60"] = [
    name: "hwL2mc24HDropIgmpVsiAlarm",
    fields: ["hwL2mcTrapVsiName", "hwL2mcDropIgmpCount"],
    fieldOids: ["hwL2mcTrapVsiName": "1.3.6.1.4.1.2011.5.25.44.5.18", "hwL2mcDropIgmpCount": "1.3.6.1.4.1.2011.5.25.44.5.16"]
]

// --- hwL2mc24HDropIgmpVlanRecover (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.44.99.61
// Fields: hwL2mcTrapVlanIndex, hwL2mcDropIgmpCount
// Description: Trap information about receive igmp packet in a vlan alarm clear in 24 hour.
trapMap["1.3.6.1.4.1.2011.5.25.44.99.61"] = [
    name: "hwL2mc24HDropIgmpVlanRecover",
    fields: ["hwL2mcTrapVlanIndex", "hwL2mcDropIgmpCount"],
    fieldOids: ["hwL2mcTrapVlanIndex": "1.3.6.1.4.1.2011.5.25.44.5.17", "hwL2mcDropIgmpCount": "1.3.6.1.4.1.2011.5.25.44.5.16"]
]

// --- hwL2mc24HDropIgmpVsiRecover (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.44.99.62
// Fields: hwL2mcTrapVsiName, hwL2mcDropIgmpCount
// Description: Trap information about receive igmp packet in a VSI alarm clear in 24 hour.
trapMap["1.3.6.1.4.1.2011.5.25.44.99.62"] = [
    name: "hwL2mc24HDropIgmpVsiRecover",
    fields: ["hwL2mcTrapVsiName", "hwL2mcDropIgmpCount"],
    fieldOids: ["hwL2mcTrapVsiName": "1.3.6.1.4.1.2011.5.25.44.5.18", "hwL2mcDropIgmpCount": "1.3.6.1.4.1.2011.5.25.44.5.16"]
]

// --- hwMCastBasGroupDecreaseExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.44.99.63
// Fields: hwMCastNotificationsAddressType, hwMCastNotificationsPortIfIndex, hwMCastNotificationsPortIfName, hwMCastNotificationsDecreaseThreshold, hwMCastNotificationsCurrentCount
// Description: A hwMCastBasGroupDecreaseExceed notification signifies that the number of user multicast entries decreased abnormally within a certain period of time exceeded the specified threshold.
trapMap["1.3.6.1.4.1.2011.5.25.44.99.63"] = [
    name: "hwMCastBasGroupDecreaseExceed",
    fields: ["hwMCastNotificationsAddressType", "hwMCastNotificationsPortIfIndex", "hwMCastNotificationsPortIfName", "hwMCastNotificationsDecreaseThreshold", "hwMCastNotificationsCurrentCount"],
    fieldOids: ["hwMCastNotificationsAddressType": "1.3.6.1.4.1.2011.5.25.44.7.3", "hwMCastNotificationsPortIfIndex": "1.3.6.1.4.1.2011.5.25.44.7.1", "hwMCastNotificationsPortIfName": "1.3.6.1.4.1.2011.5.25.44.7.2", "hwMCastNotificationsDecreaseThreshold": "1.3.6.1.4.1.2011.5.25.44.7.4", "hwMCastNotificationsCurrentCount": "1.3.6.1.4.1.2011.5.25.44.7.5"]
]

// --- hwMCastBasGroupDecreaseResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.44.99.64
// Fields: hwMCastNotificationsAddressType, hwMCastNotificationsPortIfIndex, hwMCastNotificationsPortIfName, hwMCastNotificationsDecreaseThreshold, hwMCastNotificationsCurrentCount, hwMCastNotificationsReasonType
// Description: A hwMCastBasGroupDecreaseResume notification signifies that the number of user multicast entries decreased abnormally within a certain period of time fell below the specified threshold.
trapMap["1.3.6.1.4.1.2011.5.25.44.99.64"] = [
    name: "hwMCastBasGroupDecreaseResume",
    fields: ["hwMCastNotificationsAddressType", "hwMCastNotificationsPortIfIndex", "hwMCastNotificationsPortIfName", "hwMCastNotificationsDecreaseThreshold", "hwMCastNotificationsCurrentCount", "hwMCastNotificationsReasonType"],
    fieldOids: ["hwMCastNotificationsAddressType": "1.3.6.1.4.1.2011.5.25.44.7.3", "hwMCastNotificationsPortIfIndex": "1.3.6.1.4.1.2011.5.25.44.7.1", "hwMCastNotificationsPortIfName": "1.3.6.1.4.1.2011.5.25.44.7.2", "hwMCastNotificationsDecreaseThreshold": "1.3.6.1.4.1.2011.5.25.44.7.4", "hwMCastNotificationsCurrentCount": "1.3.6.1.4.1.2011.5.25.44.7.5", "hwMCastNotificationsReasonType": "1.3.6.1.4.1.2011.5.25.44.7.6"]
]

// --- hwMgmdBrasUserLimit (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.44.102.1
// Fields: hwMgmdBrasUserAddressType, hwMgmdBrasNotificationSlot, hwMgmdBrasUserLimitCount
// Description: A hwMgmdBrasUserLimit notification signifies that the number of multicast users that join dynamic groups on the board reaches the upper limit. This trap message is generated when the number of multica...
trapMap["1.3.6.1.4.1.2011.5.25.44.102.1"] = [
    name: "hwMgmdBrasUserLimit",
    fields: ["hwMgmdBrasUserAddressType", "hwMgmdBrasNotificationSlot", "hwMgmdBrasUserLimitCount"],
    fieldOids: ["hwMgmdBrasUserAddressType": "1.3.6.1.4.1.2011.5.25.44.101.1", "hwMgmdBrasNotificationSlot": "1.3.6.1.4.1.2011.5.25.44.101.4", "hwMgmdBrasUserLimitCount": "1.3.6.1.4.1.2011.5.25.44.101.2"]
]

// --- hwMgmdBrasUserLimitClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.44.102.2
// Fields: hwMgmdBrasUserAddressType, hwMgmdBrasNotificationSlot, hwMgmdBrasUserCurrentCount
// Description: A hwMgmdBrasUserLimitClear notification signifies that The total number of multicast users that join dynamic groups on the board fell below the upper limit. This trap message is generated when The tot...
trapMap["1.3.6.1.4.1.2011.5.25.44.102.2"] = [
    name: "hwMgmdBrasUserLimitClear",
    fields: ["hwMgmdBrasUserAddressType", "hwMgmdBrasNotificationSlot", "hwMgmdBrasUserCurrentCount"],
    fieldOids: ["hwMgmdBrasUserAddressType": "1.3.6.1.4.1.2011.5.25.44.101.1", "hwMgmdBrasNotificationSlot": "1.3.6.1.4.1.2011.5.25.44.101.4", "hwMgmdBrasUserCurrentCount": "1.3.6.1.4.1.2011.5.25.44.101.3"]
]

// ===== Parsing logic =====

// Set to true to enable diagnostic logging for this MIB parser
DEBUG = false

LOG_PREFIX = "[HUAWEI-MULTICAST-MIB]"
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
