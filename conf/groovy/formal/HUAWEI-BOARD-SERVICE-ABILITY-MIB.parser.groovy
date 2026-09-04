/**
 * Auto-generated from HUAWEI-BOARD-SERVICE-ABILITY-MIB.mib
 * Generated: 2026-08-24T18:28:29.036314
 * Traps/Notifications (55): hwBoardServiceMismatchTrap, hwMplsLabelstackNumExceed, hwMplsLabelstackNumExceedClear, hwL3ucBoardNotSupportLoadBalanceHashKeyIpAlarmOccur, hwL3ucBoardNotSupportLoadBalanceHashKeyIpAlarmResume, hwFwdResLackForLicenseAlarmOccur, hwFwdResLackForLicenseAlarmResume, hwL3ucBoardNotSupportNdProxyAlarmOccur, hwL3ucBoardNotSupportNdProxyAlarmResume, hwBoardNotSupportLoadBalanceL2VxlanDeepHashAlarmOccur, hwBoardNotSupportLoadBalanceL2VxlanDeepHashAlarmResume, hwIFITNotSupportTunnelEventAlarmOccur, hwIFITNotSupportTunnelEventAlarmResume, hwLCVrrpResourceOverloadAlarmOccur, hwLCVrrpResourceOverloadAlarmResume, hwL3ucBoardNotSupportEVPNSRv6AlarmOccur, hwL3ucBoardNotSupportEVPNSRv6AlarmResume, hwL3ucBoardNotSupportPerSidPopGoAlarmOccur, hwL3ucBoardNotSupportPerSidPopGoAlarmResume, hwL3ucBoardNotSupportSRv6PolicyAlarmOccur, hwL3ucBoardNotSupportSRv6PolicyAlarmResume, hwL3ucBoardNotSupportNetworkSliceAlarmOccur, hwL3ucBoardNotSupportNetworkSliceAlarmResume, hwL3ucBoardNotSupportSRv6OverGREAlarmOccur, hwL3ucBoardNotSupportSRv6OverGREAlarmResume, hwL3ucResLackForNetworkSliceSQIDAlarmOccur, hwL3ucResLackForNetworkSliceSQIDAlarmResume, hwL3ucNotSupportP2PNetworkSliceAlarmOccur, hwL3ucNotSupportP2PNetworkSliceAlarmResume, hwL3ucBoardNotSupportSrv6InterworkingMplsAlarmOccur, hwL3ucBoardNotSupportSrv6InterworkingMplsAlarmResume, hwL3ucBoardNotSupportDsvpnAlarmOccur, hwL3ucBoardNotSupportDsvpnAlarmResume, hwL3ucBoardNotSupportIpv6GreAlarmOccur, hwL3ucBoardNotSupportIpv6GreAlarmResume, hwL3ucBoardSrv6SliceResourceNotSufficientAlarmOccur, hwL3ucBoardSrv6SliceResourceNotSufficientAlarmResume, hwIPv4FIBUserDefinedThresholdAlarmOccur, hwIPv4FIBUserDefinedThresholdAlarmResume, hwIPv6FIBUserDefinedThresholdAlarmOccur, hwIPv6FIBUserDefinedThresholdAlarmResume, hwL3ucBoardNotSupportAPN6AlarmOccur, hwL3ucBoardNotSupportAPN6AlarmResume, hwL3ucBoardNotSupportNetworkSliceExclusiveAlarmOccur, hwL3ucBoardNotSupportNetworkSliceExclusiveAlarmResume, hwMcBoardNotSupportFairForwardAlarmOccur, hwMcBoardNotSupportFairForwardAlarmResume, hwL3ucBoardNotSupportSASLICEAlarmOccur, hwL3ucBoardNotSupportSASLICEAlarmResume, hwL3ucBoardNotSupportFunctionAlarmOccur, hwL3ucBoardNotSupportFunctionAlarmResume, hwL3ucBoardNotSupportAFRAlarmOccur, hwL3ucBoardNotSupportAFRAlarmResume, hwL3ucBoardNotSupportSPFCAlarmOccur, hwL3ucBoardNotSupportSPFCAlarmResume
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

// --- hwBoardServiceMismatchTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.321.2.1
// Fields: entPhysicalIndex, hwBoardAbilityServiceID, entPhysicalName, hwBoardAbilityServiceName, hwBoardAbilityPrecautions
// Description: The service is not supported for the board hardware.
trapMap["1.3.6.1.4.1.2011.5.25.321.2.1"] = [
    name: "hwBoardServiceMismatchTrap",
    fields: ["entPhysicalIndex", "hwBoardAbilityServiceID", "entPhysicalName", "hwBoardAbilityServiceName", "hwBoardAbilityPrecautions"],
    fieldOids: ["entPhysicalIndex": "1.3.6.1.2.1.47.1.1.1.1.1", "hwBoardAbilityServiceID": "1.3.6.1.4.1.2011.5.25.321.1.1.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwBoardAbilityServiceName": "1.3.6.1.4.1.2011.5.25.321.1.1.1.2", "hwBoardAbilityPrecautions": "1.3.6.1.4.1.2011.5.25.321.1.1.1.3"]
]

// --- hwMplsLabelstackNumExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.321.6.1
// Fields: hwStitchLabel
// Description: This notification indicates that the stitch label stack number exceed two.
trapMap["1.3.6.1.4.1.2011.5.25.321.6.1"] = [
    name: "hwMplsLabelstackNumExceed",
    fields: ["hwStitchLabel"],
    fieldOids: ["hwStitchLabel": "1.3.6.1.4.1.2011.5.25.321.5.1.1.1"]
]

// --- hwMplsLabelstackNumExceedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.321.6.2
// Fields: hwStitchLabel
// Description: This notification indicates that the stitch label stack number exceed two was cleared.
trapMap["1.3.6.1.4.1.2011.5.25.321.6.2"] = [
    name: "hwMplsLabelstackNumExceedClear",
    fields: ["hwStitchLabel"],
    fieldOids: ["hwStitchLabel": "1.3.6.1.4.1.2011.5.25.321.5.1.1.1"]
]

// --- hwL3ucBoardNotSupportLoadBalanceHashKeyIpAlarmOccur (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.321.7.2
// Fields: hwLoadBalanceHashKeyIpSlotId
// Description: This object indicates that the board does not support ECMP based on a specified source or destination IP address.
trapMap["1.3.6.1.4.1.2011.5.25.321.7.2"] = [
    name: "hwL3ucBoardNotSupportLoadBalanceHashKeyIpAlarmOccur",
    fields: ["hwLoadBalanceHashKeyIpSlotId"],
    fieldOids: ["hwLoadBalanceHashKeyIpSlotId": "1.3.6.1.4.1.2011.5.25.321.7.1.1.1"]
]

// --- hwL3ucBoardNotSupportLoadBalanceHashKeyIpAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.321.7.3
// Fields: hwLoadBalanceHashKeyIpSlotId
// Description: This object indicates that a clear alarm is generated when ECMP based on a specified source or destination IP address is disabled or the board is replaced by a board that supports this function.
trapMap["1.3.6.1.4.1.2011.5.25.321.7.3"] = [
    name: "hwL3ucBoardNotSupportLoadBalanceHashKeyIpAlarmResume",
    fields: ["hwLoadBalanceHashKeyIpSlotId"],
    fieldOids: ["hwLoadBalanceHashKeyIpSlotId": "1.3.6.1.4.1.2011.5.25.321.7.1.1.1"]
]

// --- hwFwdResLackForLicenseAlarmOccur (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.321.8.2
// Fields: hwFwdResLackForLicensehwItemName, hwFwdResLackForLicensehwSlotId, hwFwdResLackForLicensehwhwResDesc
// Description: This object indicates that the number of used resources on the board has exceeded the upper threshold and to continue using these resources, purchase and activate corresponding license resource items ...
trapMap["1.3.6.1.4.1.2011.5.25.321.8.2"] = [
    name: "hwFwdResLackForLicenseAlarmOccur",
    fields: ["hwFwdResLackForLicensehwItemName", "hwFwdResLackForLicensehwSlotId", "hwFwdResLackForLicensehwhwResDesc"],
    fieldOids: ["hwFwdResLackForLicensehwItemName": "1.3.6.1.4.1.2011.5.25.321.8.1.1.1", "hwFwdResLackForLicensehwSlotId": "1.3.6.1.4.1.2011.5.25.321.8.1.1.2", "hwFwdResLackForLicensehwhwResDesc": "1.3.6.1.4.1.2011.5.25.321.8.1.1.3"]
]

// --- hwFwdResLackForLicenseAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.321.8.3
// Fields: hwFwdResLackForLicensehwItemName, hwFwdResLackForLicensehwSlotId, hwFwdResLackForLicensehwhwResDesc
// Description: This object indicates that a clear alarm is generated when activate corresponding license is activated for the board.
trapMap["1.3.6.1.4.1.2011.5.25.321.8.3"] = [
    name: "hwFwdResLackForLicenseAlarmResume",
    fields: ["hwFwdResLackForLicensehwItemName", "hwFwdResLackForLicensehwSlotId", "hwFwdResLackForLicensehwhwResDesc"],
    fieldOids: ["hwFwdResLackForLicensehwItemName": "1.3.6.1.4.1.2011.5.25.321.8.1.1.1", "hwFwdResLackForLicensehwSlotId": "1.3.6.1.4.1.2011.5.25.321.8.1.1.2", "hwFwdResLackForLicensehwhwResDesc": "1.3.6.1.4.1.2011.5.25.321.8.1.1.3"]
]

// --- hwL3ucBoardNotSupportNdProxyAlarmOccur (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.321.9.2
// Fields: hwL3ucBoardNotSupportNdProxySlotId
// Description: This object indicates that the board does not support proxy ND on VLANIF interfaces.
trapMap["1.3.6.1.4.1.2011.5.25.321.9.2"] = [
    name: "hwL3ucBoardNotSupportNdProxyAlarmOccur",
    fields: ["hwL3ucBoardNotSupportNdProxySlotId"],
    fieldOids: ["hwL3ucBoardNotSupportNdProxySlotId": "1.3.6.1.4.1.2011.5.25.321.9.1.1.1"]
]

// --- hwL3ucBoardNotSupportNdProxyAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.321.9.3
// Fields: hwL3ucBoardNotSupportNdProxySlotId
// Description: This object indicates that a clear alarm is generated when proxy ND configuration has been deleted on the current VLANIF interface or the board has been replaced with one that supports proxy ND on VLA...
trapMap["1.3.6.1.4.1.2011.5.25.321.9.3"] = [
    name: "hwL3ucBoardNotSupportNdProxyAlarmResume",
    fields: ["hwL3ucBoardNotSupportNdProxySlotId"],
    fieldOids: ["hwL3ucBoardNotSupportNdProxySlotId": "1.3.6.1.4.1.2011.5.25.321.9.1.1.1"]
]

// --- hwBoardNotSupportLoadBalanceL2VxlanDeepHashAlarmOccur (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.321.10.2
// Fields: hwLoadBalanceL2VxlanDeepHashSlotId
// Description: This object indicates that the board does not support L2vxlan deep hash function.
trapMap["1.3.6.1.4.1.2011.5.25.321.10.2"] = [
    name: "hwBoardNotSupportLoadBalanceL2VxlanDeepHashAlarmOccur",
    fields: ["hwLoadBalanceL2VxlanDeepHashSlotId"],
    fieldOids: ["hwLoadBalanceL2VxlanDeepHashSlotId": "1.3.6.1.4.1.2011.5.25.321.10.1.1.1"]
]

// --- hwBoardNotSupportLoadBalanceL2VxlanDeepHashAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.321.10.3
// Fields: hwLoadBalanceL2VxlanDeepHashSlotId
// Description: This object indicates that a clear alarm is generated when L2vxlan deep hash function is disabled or the board is replaced by a board that supports this function.
trapMap["1.3.6.1.4.1.2011.5.25.321.10.3"] = [
    name: "hwBoardNotSupportLoadBalanceL2VxlanDeepHashAlarmResume",
    fields: ["hwLoadBalanceL2VxlanDeepHashSlotId"],
    fieldOids: ["hwLoadBalanceL2VxlanDeepHashSlotId": "1.3.6.1.4.1.2011.5.25.321.10.1.1.1"]
]

// --- hwIFITNotSupportTunnelEventAlarmOccur (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.321.11.2
// Fields: hwIFITNotSupportTunnelPeerIp, hwIFITNotSupportTunnelType
// Description: This object indicates that the IFIT statistics collection does not support the public network tunnel over which traffic is recursed using this peer IP address.
trapMap["1.3.6.1.4.1.2011.5.25.321.11.2"] = [
    name: "hwIFITNotSupportTunnelEventAlarmOccur",
    fields: ["hwIFITNotSupportTunnelPeerIp", "hwIFITNotSupportTunnelType"],
    fieldOids: ["hwIFITNotSupportTunnelPeerIp": "1.3.6.1.4.1.2011.5.25.321.11.1.1.1", "hwIFITNotSupportTunnelType": "1.3.6.1.4.1.2011.5.25.321.11.1.1.2"]
]

// --- hwIFITNotSupportTunnelEventAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.321.11.3
// Fields: hwIFITNotSupportTunnelPeerIp, hwIFITNotSupportTunnelType
// Description: This object indicates that a clear alarm is generated when the public network tunnel over which traffic is recursed using this peer IP address is disabled.
trapMap["1.3.6.1.4.1.2011.5.25.321.11.3"] = [
    name: "hwIFITNotSupportTunnelEventAlarmResume",
    fields: ["hwIFITNotSupportTunnelPeerIp", "hwIFITNotSupportTunnelType"],
    fieldOids: ["hwIFITNotSupportTunnelPeerIp": "1.3.6.1.4.1.2011.5.25.321.11.1.1.1", "hwIFITNotSupportTunnelType": "1.3.6.1.4.1.2011.5.25.321.11.1.1.2"]
]

// --- hwLCVrrpResourceOverloadAlarmOccur (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.321.12.2
// Fields: hwLCVrrpResourceOverloadSlotId
// Description: This object indicates that the board VRRP resources were overloaded.
trapMap["1.3.6.1.4.1.2011.5.25.321.12.2"] = [
    name: "hwLCVrrpResourceOverloadAlarmOccur",
    fields: ["hwLCVrrpResourceOverloadSlotId"],
    fieldOids: ["hwLCVrrpResourceOverloadSlotId": "1.3.6.1.4.1.2011.5.25.321.12.1.1.1"]
]

// --- hwLCVrrpResourceOverloadAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.321.12.3
// Fields: hwLCVrrpResourceOverloadSlotId
// Description: This object indicates that a clear alarm is generated when some VRRP have been deleted on the board or the board has been replaced by the board with bigger specifications.
trapMap["1.3.6.1.4.1.2011.5.25.321.12.3"] = [
    name: "hwLCVrrpResourceOverloadAlarmResume",
    fields: ["hwLCVrrpResourceOverloadSlotId"],
    fieldOids: ["hwLCVrrpResourceOverloadSlotId": "1.3.6.1.4.1.2011.5.25.321.12.1.1.1"]
]

// --- hwL3ucBoardNotSupportEVPNSRv6AlarmOccur (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.321.13.2
// Fields: hwL3ucBoardNotSupportEVPNSRv6SlotId
// Description: This object indicates that the board does not support EVPN Segment-Routing IPv6 function.
trapMap["1.3.6.1.4.1.2011.5.25.321.13.2"] = [
    name: "hwL3ucBoardNotSupportEVPNSRv6AlarmOccur",
    fields: ["hwL3ucBoardNotSupportEVPNSRv6SlotId"],
    fieldOids: ["hwL3ucBoardNotSupportEVPNSRv6SlotId": "1.3.6.1.4.1.2011.5.25.321.13.1.1.1"]
]

// --- hwL3ucBoardNotSupportEVPNSRv6AlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.321.13.3
// Fields: hwL3ucBoardNotSupportEVPNSRv6SlotId
// Description: This object indicates that a clear alarm is generated when the Segment-Routing IPv6 compatible configuration has been deleted on the system or the board has been replaced with one that supports Segmen...
trapMap["1.3.6.1.4.1.2011.5.25.321.13.3"] = [
    name: "hwL3ucBoardNotSupportEVPNSRv6AlarmResume",
    fields: ["hwL3ucBoardNotSupportEVPNSRv6SlotId"],
    fieldOids: ["hwL3ucBoardNotSupportEVPNSRv6SlotId": "1.3.6.1.4.1.2011.5.25.321.13.1.1.1"]
]

// --- hwL3ucBoardNotSupportPerSidPopGoAlarmOccur (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.321.14.2
// Fields: hwL3ucBoardNotSupportPerSidPopGoSlotId
// Description: This object indicates that the board does not support SID allocation based on the next hop.
trapMap["1.3.6.1.4.1.2011.5.25.321.14.2"] = [
    name: "hwL3ucBoardNotSupportPerSidPopGoAlarmOccur",
    fields: ["hwL3ucBoardNotSupportPerSidPopGoSlotId"],
    fieldOids: ["hwL3ucBoardNotSupportPerSidPopGoSlotId": "1.3.6.1.4.1.2011.5.25.321.14.1.1.1"]
]

// --- hwL3ucBoardNotSupportPerSidPopGoAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.321.14.3
// Fields: hwL3ucBoardNotSupportPerSidPopGoSlotId
// Description: This object indicates that a clear alarm is generated when the segment-routing ipv6 apply-sid per-nexthop pop-go command configuration has been deleted in the system, or the board has been replaced wi...
trapMap["1.3.6.1.4.1.2011.5.25.321.14.3"] = [
    name: "hwL3ucBoardNotSupportPerSidPopGoAlarmResume",
    fields: ["hwL3ucBoardNotSupportPerSidPopGoSlotId"],
    fieldOids: ["hwL3ucBoardNotSupportPerSidPopGoSlotId": "1.3.6.1.4.1.2011.5.25.321.14.1.1.1"]
]

// --- hwL3ucBoardNotSupportSRv6PolicyAlarmOccur (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.321.15.2
// Fields: hwL3ucBoardNotSupportSRv6PolicySlotId
// Description: This object indicates that the board does not support SRv6 TE Policy function.
trapMap["1.3.6.1.4.1.2011.5.25.321.15.2"] = [
    name: "hwL3ucBoardNotSupportSRv6PolicyAlarmOccur",
    fields: ["hwL3ucBoardNotSupportSRv6PolicySlotId"],
    fieldOids: ["hwL3ucBoardNotSupportSRv6PolicySlotId": "1.3.6.1.4.1.2011.5.25.321.15.1.1.1"]
]

// --- hwL3ucBoardNotSupportSRv6PolicyAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.321.15.3
// Fields: hwL3ucBoardNotSupportSRv6PolicySlotId
// Description: This object indicates that a clear alarm is generated when the SRv6 TE Policy configuration has been deleted from the system or the board has been replaced with one that supports SRv6 TE Policy.
trapMap["1.3.6.1.4.1.2011.5.25.321.15.3"] = [
    name: "hwL3ucBoardNotSupportSRv6PolicyAlarmResume",
    fields: ["hwL3ucBoardNotSupportSRv6PolicySlotId"],
    fieldOids: ["hwL3ucBoardNotSupportSRv6PolicySlotId": "1.3.6.1.4.1.2011.5.25.321.15.1.1.1"]
]

// --- hwL3ucBoardNotSupportNetworkSliceAlarmOccur (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.321.16.2
// Fields: hwL3ucBoardNotSupportNetworkSliceSlotId
// Description: This object indicates that the board does not support Network Slice function.
trapMap["1.3.6.1.4.1.2011.5.25.321.16.2"] = [
    name: "hwL3ucBoardNotSupportNetworkSliceAlarmOccur",
    fields: ["hwL3ucBoardNotSupportNetworkSliceSlotId"],
    fieldOids: ["hwL3ucBoardNotSupportNetworkSliceSlotId": "1.3.6.1.4.1.2011.5.25.321.16.1.1.1"]
]

// --- hwL3ucBoardNotSupportNetworkSliceAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.321.16.3
// Fields: hwL3ucBoardNotSupportNetworkSliceSlotId
// Description: This object indicates that a clear alarm is generated when the Network Slice configuration has been deleted on the board or the board has been replaced with one that supports Network Slice.
trapMap["1.3.6.1.4.1.2011.5.25.321.16.3"] = [
    name: "hwL3ucBoardNotSupportNetworkSliceAlarmResume",
    fields: ["hwL3ucBoardNotSupportNetworkSliceSlotId"],
    fieldOids: ["hwL3ucBoardNotSupportNetworkSliceSlotId": "1.3.6.1.4.1.2011.5.25.321.16.1.1.1"]
]

// --- hwL3ucBoardNotSupportSRv6OverGREAlarmOccur (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.321.17.2
// Fields: hwL3ucBoardNotSupportSRv6OverGRESlotId
// Description: This object indicates that the board does not support SRv6 over GRE function.
trapMap["1.3.6.1.4.1.2011.5.25.321.17.2"] = [
    name: "hwL3ucBoardNotSupportSRv6OverGREAlarmOccur",
    fields: ["hwL3ucBoardNotSupportSRv6OverGRESlotId"],
    fieldOids: ["hwL3ucBoardNotSupportSRv6OverGRESlotId": "1.3.6.1.4.1.2011.5.25.321.17.1.1.1"]
]

// --- hwL3ucBoardNotSupportSRv6OverGREAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.321.17.3
// Fields: hwL3ucBoardNotSupportSRv6OverGRESlotId
// Description: This object indicates that a clear alarm is generated when the SRv6 over GRE configuration has been deleted from the system or the board has been replaced with one that supports SRv6 over GRE.
trapMap["1.3.6.1.4.1.2011.5.25.321.17.3"] = [
    name: "hwL3ucBoardNotSupportSRv6OverGREAlarmResume",
    fields: ["hwL3ucBoardNotSupportSRv6OverGRESlotId"],
    fieldOids: ["hwL3ucBoardNotSupportSRv6OverGRESlotId": "1.3.6.1.4.1.2011.5.25.321.17.1.1.1"]
]

// --- hwL3ucResLackForNetworkSliceSQIDAlarmOccur (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.321.18.2
// Fields: hwL3ucResLackForNetworkSliceSQIDInterfaceName
// Description: This object indicates that the network slice resources are insufficient, and the rate limiting function does not take effect.
trapMap["1.3.6.1.4.1.2011.5.25.321.18.2"] = [
    name: "hwL3ucResLackForNetworkSliceSQIDAlarmOccur",
    fields: ["hwL3ucResLackForNetworkSliceSQIDInterfaceName"],
    fieldOids: ["hwL3ucResLackForNetworkSliceSQIDInterfaceName": "1.3.6.1.4.1.2011.5.25.321.18.1.1.1"]
]

// --- hwL3ucResLackForNetworkSliceSQIDAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.321.18.3
// Fields: hwL3ucResLackForNetworkSliceSQIDInterfaceName
// Description: This object indicates that a clear alarm is generated when the SQ resources are successfully applied for.
trapMap["1.3.6.1.4.1.2011.5.25.321.18.3"] = [
    name: "hwL3ucResLackForNetworkSliceSQIDAlarmResume",
    fields: ["hwL3ucResLackForNetworkSliceSQIDInterfaceName"],
    fieldOids: ["hwL3ucResLackForNetworkSliceSQIDInterfaceName": "1.3.6.1.4.1.2011.5.25.321.18.1.1.1"]
]

// --- hwL3ucNotSupportP2PNetworkSliceAlarmOccur (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.321.19.2
// Fields: hwL3ucNotSupportP2PNetworkSliceInterfaceName
// Description: This object indicates that the interface does not support P2P Network Slice function.
trapMap["1.3.6.1.4.1.2011.5.25.321.19.2"] = [
    name: "hwL3ucNotSupportP2PNetworkSliceAlarmOccur",
    fields: ["hwL3ucNotSupportP2PNetworkSliceInterfaceName"],
    fieldOids: ["hwL3ucNotSupportP2PNetworkSliceInterfaceName": "1.3.6.1.4.1.2011.5.25.321.19.1.1.1"]
]

// --- hwL3ucNotSupportP2PNetworkSliceAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.321.19.3
// Fields: hwL3ucNotSupportP2PNetworkSliceInterfaceName
// Description: This object indicates that a clear alarm is generated when the P2P Network Slice configuration has been deleted from the system or the board has been replaced with one that supports P2P Network Slice.
trapMap["1.3.6.1.4.1.2011.5.25.321.19.3"] = [
    name: "hwL3ucNotSupportP2PNetworkSliceAlarmResume",
    fields: ["hwL3ucNotSupportP2PNetworkSliceInterfaceName"],
    fieldOids: ["hwL3ucNotSupportP2PNetworkSliceInterfaceName": "1.3.6.1.4.1.2011.5.25.321.19.1.1.1"]
]

// --- hwL3ucBoardNotSupportSrv6InterworkingMplsAlarmOccur (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.321.20.2
// Fields: hwL3ucBoardNotSupportSrv6InterworkingMplsSlotId
// Description: This object indicates that the board does not support OptionB SRv6 And Mpls Interworking function.
trapMap["1.3.6.1.4.1.2011.5.25.321.20.2"] = [
    name: "hwL3ucBoardNotSupportSrv6InterworkingMplsAlarmOccur",
    fields: ["hwL3ucBoardNotSupportSrv6InterworkingMplsSlotId"],
    fieldOids: ["hwL3ucBoardNotSupportSrv6InterworkingMplsSlotId": "1.3.6.1.4.1.2011.5.25.321.20.1.1.1"]
]

// --- hwL3ucBoardNotSupportSrv6InterworkingMplsAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.321.20.3
// Fields: hwL3ucBoardNotSupportSrv6InterworkingMplsSlotId
// Description: This object indicates that a clear alarm is generated when the OptionB SRv6 And Mpls Interworking configuration has been deleted from the system or the board has been replaced with one that supports O...
trapMap["1.3.6.1.4.1.2011.5.25.321.20.3"] = [
    name: "hwL3ucBoardNotSupportSrv6InterworkingMplsAlarmResume",
    fields: ["hwL3ucBoardNotSupportSrv6InterworkingMplsSlotId"],
    fieldOids: ["hwL3ucBoardNotSupportSrv6InterworkingMplsSlotId": "1.3.6.1.4.1.2011.5.25.321.20.1.1.1"]
]

// --- hwL3ucBoardNotSupportDsvpnAlarmOccur (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.321.21.2
// Fields: hwL3ucBoardNotSupportDsvpnSlotId
// Description: This object indicates that the board does not support Dsvpn function.
trapMap["1.3.6.1.4.1.2011.5.25.321.21.2"] = [
    name: "hwL3ucBoardNotSupportDsvpnAlarmOccur",
    fields: ["hwL3ucBoardNotSupportDsvpnSlotId"],
    fieldOids: ["hwL3ucBoardNotSupportDsvpnSlotId": "1.3.6.1.4.1.2011.5.25.321.21.1.1.1"]
]

// --- hwL3ucBoardNotSupportDsvpnAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.321.21.3
// Fields: hwL3ucBoardNotSupportDsvpnSlotId
// Description: This object indicates that a clear alarm is generated when the Dsvpn configuration has been deleted from the system or the board has been replaced with one that supports Dsvpn.
trapMap["1.3.6.1.4.1.2011.5.25.321.21.3"] = [
    name: "hwL3ucBoardNotSupportDsvpnAlarmResume",
    fields: ["hwL3ucBoardNotSupportDsvpnSlotId"],
    fieldOids: ["hwL3ucBoardNotSupportDsvpnSlotId": "1.3.6.1.4.1.2011.5.25.321.21.1.1.1"]
]

// --- hwL3ucBoardNotSupportIpv6GreAlarmOccur (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.321.22.2
// Fields: hwL3ucBoardNotSupportIpv6GreSlotId
// Description: This object indicates that the board does not support Ipv6 Gre function.
trapMap["1.3.6.1.4.1.2011.5.25.321.22.2"] = [
    name: "hwL3ucBoardNotSupportIpv6GreAlarmOccur",
    fields: ["hwL3ucBoardNotSupportIpv6GreSlotId"],
    fieldOids: ["hwL3ucBoardNotSupportIpv6GreSlotId": "1.3.6.1.4.1.2011.5.25.321.22.1.1.1"]
]

// --- hwL3ucBoardNotSupportIpv6GreAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.321.22.3
// Fields: hwL3ucBoardNotSupportIpv6GreSlotId
// Description: This object indicates that a clear alarm is generated when the Ipv6 Gre configuration has been deleted from the system or the board has been replaced with one that supports Ipv6 Gre.
trapMap["1.3.6.1.4.1.2011.5.25.321.22.3"] = [
    name: "hwL3ucBoardNotSupportIpv6GreAlarmResume",
    fields: ["hwL3ucBoardNotSupportIpv6GreSlotId"],
    fieldOids: ["hwL3ucBoardNotSupportIpv6GreSlotId": "1.3.6.1.4.1.2011.5.25.321.22.1.1.1"]
]

// --- hwL3ucBoardSrv6SliceResourceNotSufficientAlarmOccur (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.321.23.2
// Fields: hwL3ucBoardSrv6SliceResourceNotSufficientInterfaceName
// Description: This object indicates that for boards with insufficient slice resources, and the bandwidth of the slice interface on which services are transmitted cannot be guaranteed.
trapMap["1.3.6.1.4.1.2011.5.25.321.23.2"] = [
    name: "hwL3ucBoardSrv6SliceResourceNotSufficientAlarmOccur",
    fields: ["hwL3ucBoardSrv6SliceResourceNotSufficientInterfaceName"],
    fieldOids: ["hwL3ucBoardSrv6SliceResourceNotSufficientInterfaceName": "1.3.6.1.4.1.2011.5.25.321.23.1.1.1"]
]

// --- hwL3ucBoardSrv6SliceResourceNotSufficientAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.321.23.3
// Fields: hwL3ucBoardSrv6SliceResourceNotSufficientInterfaceName
// Description: This object indicates that a clear alarm is generated when the SRv6 slice resource has been sufficient.
trapMap["1.3.6.1.4.1.2011.5.25.321.23.3"] = [
    name: "hwL3ucBoardSrv6SliceResourceNotSufficientAlarmResume",
    fields: ["hwL3ucBoardSrv6SliceResourceNotSufficientInterfaceName"],
    fieldOids: ["hwL3ucBoardSrv6SliceResourceNotSufficientInterfaceName": "1.3.6.1.4.1.2011.5.25.321.23.1.1.1"]
]

// --- hwIPv4FIBUserDefinedThresholdAlarmOccur (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.321.24.2
// Fields: hwIPv4FIBUserDefinedThresholdSlotId, hwIPv4FIBUserDefinedThresholdUpperLimit, hwIPv4FIBUserDefinedThresholdLowerLimit, hwIPv4FIBUserDefinedThresholdResTotalCount
// Description: This object indicates that the number of used IPv4 FIB resources exceeded the user-defined upper threshold.
trapMap["1.3.6.1.4.1.2011.5.25.321.24.2"] = [
    name: "hwIPv4FIBUserDefinedThresholdAlarmOccur",
    fields: ["hwIPv4FIBUserDefinedThresholdSlotId", "hwIPv4FIBUserDefinedThresholdUpperLimit", "hwIPv4FIBUserDefinedThresholdLowerLimit", "hwIPv4FIBUserDefinedThresholdResTotalCount"],
    fieldOids: ["hwIPv4FIBUserDefinedThresholdSlotId": "1.3.6.1.4.1.2011.5.25.321.24.1.1.1", "hwIPv4FIBUserDefinedThresholdUpperLimit": "1.3.6.1.4.1.2011.5.25.321.24.1.1.2", "hwIPv4FIBUserDefinedThresholdLowerLimit": "1.3.6.1.4.1.2011.5.25.321.24.1.1.3", "hwIPv4FIBUserDefinedThresholdResTotalCount": "1.3.6.1.4.1.2011.5.25.321.24.1.1.4"]
]

// --- hwIPv4FIBUserDefinedThresholdAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.321.24.3
// Fields: hwIPv4FIBUserDefinedThresholdSlotId, hwIPv4FIBUserDefinedThresholdUpperLimit, hwIPv4FIBUserDefinedThresholdLowerLimit, hwIPv4FIBUserDefinedThresholdResTotalCount
// Description: This object indicates that the number of used IPv4 FIB resources are lower than the user-defined lower threshold.
trapMap["1.3.6.1.4.1.2011.5.25.321.24.3"] = [
    name: "hwIPv4FIBUserDefinedThresholdAlarmResume",
    fields: ["hwIPv4FIBUserDefinedThresholdSlotId", "hwIPv4FIBUserDefinedThresholdUpperLimit", "hwIPv4FIBUserDefinedThresholdLowerLimit", "hwIPv4FIBUserDefinedThresholdResTotalCount"],
    fieldOids: ["hwIPv4FIBUserDefinedThresholdSlotId": "1.3.6.1.4.1.2011.5.25.321.24.1.1.1", "hwIPv4FIBUserDefinedThresholdUpperLimit": "1.3.6.1.4.1.2011.5.25.321.24.1.1.2", "hwIPv4FIBUserDefinedThresholdLowerLimit": "1.3.6.1.4.1.2011.5.25.321.24.1.1.3", "hwIPv4FIBUserDefinedThresholdResTotalCount": "1.3.6.1.4.1.2011.5.25.321.24.1.1.4"]
]

// --- hwIPv6FIBUserDefinedThresholdAlarmOccur (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.321.25.2
// Fields: hwIPv6FIBUserDefinedThresholdSlotId, hwIPv6FIBUserDefinedThresholdUpperLimit, hwIPv6FIBUserDefinedThresholdLowerLimit, hwIPv6FIBUserDefinedThresholdResTotalCount
// Description: This object indicates that the number of used IPv6 FIB resources exceeded the user-defined upper threshold.
trapMap["1.3.6.1.4.1.2011.5.25.321.25.2"] = [
    name: "hwIPv6FIBUserDefinedThresholdAlarmOccur",
    fields: ["hwIPv6FIBUserDefinedThresholdSlotId", "hwIPv6FIBUserDefinedThresholdUpperLimit", "hwIPv6FIBUserDefinedThresholdLowerLimit", "hwIPv6FIBUserDefinedThresholdResTotalCount"],
    fieldOids: ["hwIPv6FIBUserDefinedThresholdSlotId": "1.3.6.1.4.1.2011.5.25.321.25.1.1.1", "hwIPv6FIBUserDefinedThresholdUpperLimit": "1.3.6.1.4.1.2011.5.25.321.25.1.1.2", "hwIPv6FIBUserDefinedThresholdLowerLimit": "1.3.6.1.4.1.2011.5.25.321.25.1.1.3", "hwIPv6FIBUserDefinedThresholdResTotalCount": "1.3.6.1.4.1.2011.5.25.321.25.1.1.4"]
]

// --- hwIPv6FIBUserDefinedThresholdAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.321.25.3
// Fields: hwIPv6FIBUserDefinedThresholdSlotId, hwIPv6FIBUserDefinedThresholdUpperLimit, hwIPv6FIBUserDefinedThresholdLowerLimit, hwIPv6FIBUserDefinedThresholdResTotalCount
// Description: This object indicates that the number of used IPv6 FIB resources are lower than the user-defined lower threshold.
trapMap["1.3.6.1.4.1.2011.5.25.321.25.3"] = [
    name: "hwIPv6FIBUserDefinedThresholdAlarmResume",
    fields: ["hwIPv6FIBUserDefinedThresholdSlotId", "hwIPv6FIBUserDefinedThresholdUpperLimit", "hwIPv6FIBUserDefinedThresholdLowerLimit", "hwIPv6FIBUserDefinedThresholdResTotalCount"],
    fieldOids: ["hwIPv6FIBUserDefinedThresholdSlotId": "1.3.6.1.4.1.2011.5.25.321.25.1.1.1", "hwIPv6FIBUserDefinedThresholdUpperLimit": "1.3.6.1.4.1.2011.5.25.321.25.1.1.2", "hwIPv6FIBUserDefinedThresholdLowerLimit": "1.3.6.1.4.1.2011.5.25.321.25.1.1.3", "hwIPv6FIBUserDefinedThresholdResTotalCount": "1.3.6.1.4.1.2011.5.25.321.25.1.1.4"]
]

// --- hwL3ucBoardNotSupportAPN6AlarmOccur (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.321.26.2
// Fields: hwL3ucBoardNotSupportAPN6SlotId
// Description: This object indicates that the board does not support APN6 function.
trapMap["1.3.6.1.4.1.2011.5.25.321.26.2"] = [
    name: "hwL3ucBoardNotSupportAPN6AlarmOccur",
    fields: ["hwL3ucBoardNotSupportAPN6SlotId"],
    fieldOids: ["hwL3ucBoardNotSupportAPN6SlotId": "1.3.6.1.4.1.2011.5.25.321.26.1.1.1"]
]

// --- hwL3ucBoardNotSupportAPN6AlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.321.26.3
// Fields: hwL3ucBoardNotSupportAPN6SlotId
// Description: This object indicates that a clear alarm is generated when the APN6 configuration has been deleted from the system or the board has been replaced with one that supports APN6.
trapMap["1.3.6.1.4.1.2011.5.25.321.26.3"] = [
    name: "hwL3ucBoardNotSupportAPN6AlarmResume",
    fields: ["hwL3ucBoardNotSupportAPN6SlotId"],
    fieldOids: ["hwL3ucBoardNotSupportAPN6SlotId": "1.3.6.1.4.1.2011.5.25.321.26.1.1.1"]
]

// --- hwL3ucBoardNotSupportNetworkSliceExclusiveAlarmOccur (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.321.27.2
// Fields: hwL3ucBoardNotSupportNetworkSliceExclusiveSlotId
// Description: This object indicates that the board does not support the network slice bandwidth unreusable function.
trapMap["1.3.6.1.4.1.2011.5.25.321.27.2"] = [
    name: "hwL3ucBoardNotSupportNetworkSliceExclusiveAlarmOccur",
    fields: ["hwL3ucBoardNotSupportNetworkSliceExclusiveSlotId"],
    fieldOids: ["hwL3ucBoardNotSupportNetworkSliceExclusiveSlotId": "1.3.6.1.4.1.2011.5.25.321.27.1.1.1"]
]

// --- hwL3ucBoardNotSupportNetworkSliceExclusiveAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.321.27.3
// Fields: hwL3ucBoardNotSupportNetworkSliceExclusiveSlotId
// Description: This object indicates that a clear alarm is generated when the network slice bandwidth unreusable function has been deleted from the system or the board has been replaced with one that supports the ne...
trapMap["1.3.6.1.4.1.2011.5.25.321.27.3"] = [
    name: "hwL3ucBoardNotSupportNetworkSliceExclusiveAlarmResume",
    fields: ["hwL3ucBoardNotSupportNetworkSliceExclusiveSlotId"],
    fieldOids: ["hwL3ucBoardNotSupportNetworkSliceExclusiveSlotId": "1.3.6.1.4.1.2011.5.25.321.27.1.1.1"]
]

// --- hwMcBoardNotSupportFairForwardAlarmOccur (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.321.28.2
// Fields: hwMcFairForwardSlotId
// Description: This object indicates that the board does not support multicast fair-forward function.
trapMap["1.3.6.1.4.1.2011.5.25.321.28.2"] = [
    name: "hwMcBoardNotSupportFairForwardAlarmOccur",
    fields: ["hwMcFairForwardSlotId"],
    fieldOids: ["hwMcFairForwardSlotId": "1.3.6.1.4.1.2011.5.25.321.28.1.1.1"]
]

// --- hwMcBoardNotSupportFairForwardAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.321.28.3
// Fields: hwMcFairForwardSlotId
// Description: This object indicates that a clear alarm is generated when multicast fair-forward function is disabled or the board is replaced by a board that supports this function.
trapMap["1.3.6.1.4.1.2011.5.25.321.28.3"] = [
    name: "hwMcBoardNotSupportFairForwardAlarmResume",
    fields: ["hwMcFairForwardSlotId"],
    fieldOids: ["hwMcFairForwardSlotId": "1.3.6.1.4.1.2011.5.25.321.28.1.1.1"]
]

// --- hwL3ucBoardNotSupportSASLICEAlarmOccur (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.321.29.2
// Fields: hwL3ucBoardNotSupportSASLICESlotId
// Description: This object indicates that the board does not support source address slice function.
trapMap["1.3.6.1.4.1.2011.5.25.321.29.2"] = [
    name: "hwL3ucBoardNotSupportSASLICEAlarmOccur",
    fields: ["hwL3ucBoardNotSupportSASLICESlotId"],
    fieldOids: ["hwL3ucBoardNotSupportSASLICESlotId": "1.3.6.1.4.1.2011.5.25.321.29.1.1.1"]
]

// --- hwL3ucBoardNotSupportSASLICEAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.321.29.3
// Fields: hwL3ucBoardNotSupportSASLICESlotId
// Description: This object indicates that a clear alarm is generated when the source address slice configuration has been deleted from the system or the board has been replaced with one that supports source address ...
trapMap["1.3.6.1.4.1.2011.5.25.321.29.3"] = [
    name: "hwL3ucBoardNotSupportSASLICEAlarmResume",
    fields: ["hwL3ucBoardNotSupportSASLICESlotId"],
    fieldOids: ["hwL3ucBoardNotSupportSASLICESlotId": "1.3.6.1.4.1.2011.5.25.321.29.1.1.1"]
]

// --- hwL3ucBoardNotSupportFunctionAlarmOccur (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.321.30.2
// Fields: hwL3ucBoardNotSupportFunctionSlotID, hwL3ucBoardNotSupportFunctionReasonID, hwL3ucBoardNotSupportFunctionReasonDescription
// Description: This object indicates that the board does not support function.
trapMap["1.3.6.1.4.1.2011.5.25.321.30.2"] = [
    name: "hwL3ucBoardNotSupportFunctionAlarmOccur",
    fields: ["hwL3ucBoardNotSupportFunctionSlotID", "hwL3ucBoardNotSupportFunctionReasonID", "hwL3ucBoardNotSupportFunctionReasonDescription"],
    fieldOids: ["hwL3ucBoardNotSupportFunctionSlotID": "1.3.6.1.4.1.2011.5.25.321.30.1.1.1", "hwL3ucBoardNotSupportFunctionReasonID": "1.3.6.1.4.1.2011.5.25.321.30.1.1.2", "hwL3ucBoardNotSupportFunctionReasonDescription": "1.3.6.1.4.1.2011.5.25.321.30.1.1.3"]
]

// --- hwL3ucBoardNotSupportFunctionAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.321.30.3
// Fields: hwL3ucBoardNotSupportFunctionSlotID, hwL3ucBoardNotSupportFunctionReasonID, hwL3ucBoardNotSupportFunctionReasonDescription
// Description: This object indicates that a clear alarm is generated when the configuration has been deleted from the system or the board has been replaced with one that supports the function.
trapMap["1.3.6.1.4.1.2011.5.25.321.30.3"] = [
    name: "hwL3ucBoardNotSupportFunctionAlarmResume",
    fields: ["hwL3ucBoardNotSupportFunctionSlotID", "hwL3ucBoardNotSupportFunctionReasonID", "hwL3ucBoardNotSupportFunctionReasonDescription"],
    fieldOids: ["hwL3ucBoardNotSupportFunctionSlotID": "1.3.6.1.4.1.2011.5.25.321.30.1.1.1", "hwL3ucBoardNotSupportFunctionReasonID": "1.3.6.1.4.1.2011.5.25.321.30.1.1.2", "hwL3ucBoardNotSupportFunctionReasonDescription": "1.3.6.1.4.1.2011.5.25.321.30.1.1.3"]
]

// --- hwL3ucBoardNotSupportAFRAlarmOccur (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.321.31.2
// Fields: hwL3ucBoardNotSupportAFRSlotId
// Description: This object indicates that the board does not support AFR function.
trapMap["1.3.6.1.4.1.2011.5.25.321.31.2"] = [
    name: "hwL3ucBoardNotSupportAFRAlarmOccur",
    fields: ["hwL3ucBoardNotSupportAFRSlotId"],
    fieldOids: ["hwL3ucBoardNotSupportAFRSlotId": "1.3.6.1.4.1.2011.5.25.321.31.1.1.1"]
]

// --- hwL3ucBoardNotSupportAFRAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.321.31.3
// Fields: hwL3ucBoardNotSupportAFRSlotId
// Description: This object indicates that a clear alarm is generated when the AFR configuration has been deleted from the system or the board has been replaced with one that supports AFR.
trapMap["1.3.6.1.4.1.2011.5.25.321.31.3"] = [
    name: "hwL3ucBoardNotSupportAFRAlarmResume",
    fields: ["hwL3ucBoardNotSupportAFRSlotId"],
    fieldOids: ["hwL3ucBoardNotSupportAFRSlotId": "1.3.6.1.4.1.2011.5.25.321.31.1.1.1"]
]

// --- hwL3ucBoardNotSupportSPFCAlarmOccur (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.321.32.2
// Fields: hwL3ucBoardNotSupportSPFCSlotId
// Description: This object indicates that the board does not support SPFC function.
trapMap["1.3.6.1.4.1.2011.5.25.321.32.2"] = [
    name: "hwL3ucBoardNotSupportSPFCAlarmOccur",
    fields: ["hwL3ucBoardNotSupportSPFCSlotId"],
    fieldOids: ["hwL3ucBoardNotSupportSPFCSlotId": "1.3.6.1.4.1.2011.5.25.321.32.1.1.1"]
]

// --- hwL3ucBoardNotSupportSPFCAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.321.32.3
// Fields: hwL3ucBoardNotSupportSPFCSlotId
// Description: This object indicates that a clear alarm is generated when the SPFC configuration has been deleted from the system or the board has been replaced with one that supports SPFC.
trapMap["1.3.6.1.4.1.2011.5.25.321.32.3"] = [
    name: "hwL3ucBoardNotSupportSPFCAlarmResume",
    fields: ["hwL3ucBoardNotSupportSPFCSlotId"],
    fieldOids: ["hwL3ucBoardNotSupportSPFCSlotId": "1.3.6.1.4.1.2011.5.25.321.32.1.1.1"]
]

// ===== Parsing logic =====

// Set to true to enable diagnostic logging for this MIB parser
DEBUG = false

LOG_PREFIX = "[HUAWEI-BOARD-SERVICE-ABILITY-MIB]"
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
