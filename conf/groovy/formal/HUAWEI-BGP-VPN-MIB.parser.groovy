/**
 * Auto-generated from HUAWEI-BGP-VPN-MIB.mib
 * Generated: 2026-08-24T18:28:29.004629900
 * Traps/Notifications (78): hwBgpPeerRouteNumThresholdExceed, hwBgpPeerRouteNumThresholdClear, hwBgpPeerGRStatusChange, hwBgpPeerUnavailable, hwBgpPeerAvailable, hwBgpPeerRouteExceed, hwBgpPeerRouteExceedClear, hwL3vpnVrfRouteMidThreshCleared, hwBgpPeerEstablished, hwBgpPeerBackwardTransition, hwBgpRouteThresholdExceed, hwBgpRouteThresholdClear, hwBgpRouteMaxExceed, hwBgpRouteMaxClear, hwBgpPeerSessionExceed, hwBgpPeerSessionExceedClear, hwBgpDynamicPeerSessionExceed, hwBgpDynamicPeerSessionExceedClear, hwBgpPeerSessionThresholdExceed, hwBgpPeerSessionThresholdClear, hwBgpVrfRouteNumReachThreshold, hwBgpVrfRouteNumReachThresholdClear, hwEvpnRouteReachThreshold, hwEvpnRouteReachThresholdClear, hwVpnRouteLabelNumReachThresold, hwVpnRouteLabelNumReachThresoldClear, hwVpnRouteLabelNumReachMaximum, hwVpnRouteLabelNumReachMaximumClear, hwBgpPeerAddrFamilyRouteThresholdExceed, hwBgpPeerAddrFamilyRouteThresholdExceedClear, hwBgpPeerAddrFamilyRouteExceed, hwBgpPeerAddrFamilyRouteExceedClear, hwBgpPeerAddrFamilyPerRouteThresholdExceed, hwBgpPeerAddrFamilyPerRouteThresholdExceedClear, hwBgpPeerAddrFamilyPerRouteExceed, hwBgpPeerAddrFamilyPerRouteExceedClear, hwBgpRouteLoopDetected, hwBgpRouteLoopDetectedClear, hwBgpDiscardRecvRoute, hwBgpDiscardRecvRouteClear, hwBgpUnnumberedPeerBackwardTransition, hwBgpUnnumberedPeerEstablished, hwBgpUnnumberedPeerRouteExceed, hwBgpUnnumberedPeerRouteExceedClear, hwBgpUnnumberedPeerRouteNumThresholdExceed, hwBgpUnnumberedPeerRouteNumThresholdExceedClear, hwBgpRoaCheckFail, hwBgpSidLabelConflict, hwBgpSidLabelConflictClear, hwBgpPdPeerAddrFamilyRouteThresholdExceed, hwBgpPdPeerAddrFamilyRouteThresholdExceedClear, hwBgpPdPeerAddrFamilyRouteExceed, hwBgpPdPeerAddrFamilyRouteExceedClear, hwBgpMultiVpnRouteLabelNumReachMaximum, hwBgpMultiVpnRouteLabelNumReachMaximumClear, hwBgpMultiVpnRouteLabelNumReachThresold, hwBgpMultiVpnRouteLabelNumReachThresoldClear, hwBgpMultiDynamicPeerSessionExceed, hwBgpMultiDynamicPeerSessionExceedClear, hwBgpPacketSendFailed, hwBgpPacketSendFailedClear, hwBgpUnnumberedPacketSendFailed, hwBgpUnnumberedPacketSendFailedClear, hwBgpPeerAddrFamilyNegotiateFailed, hwBgpPeerAddrFamilyNegotiateFailedClear, hwBgpRpkiRoaInvalidAnnounce, hwBgpRpkiRoaInvalidAnnounceClear, hwBgpSUcmpRtAdjustAlm, hwBgpSUcmpRtAdjustAlmClear, hwBgpSUcmpRtAdjustStart, hwBgpSUcmpRtAdjustEnd, hwTnl2VpnTrapEvent, hwRpkiSessionRoaExceed, hwRpkiSessionRoaExceedClear, hwRpkiSessionAspaExceedLimit, hwRpkiSessionAspaExceedLimitClear, hwRpkiSessionASPAExceedThreshold, hwRpkiSessionASPAExceedThresholdClear
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

// --- hwBgpPeerRouteNumThresholdExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.177.1.3.1
// Fields: hwBgpPeerConfigRouteLimitNum, hwBgpPeerConfigRouteLimitThreshold
// Description: This notification is generated when the number of routes received from the BGP peer exceeds the alarm threshold.
trapMap["1.3.6.1.4.1.2011.5.25.177.1.3.1"] = [
    name: "hwBgpPeerRouteNumThresholdExceed",
    fields: ["hwBgpPeerConfigRouteLimitNum", "hwBgpPeerConfigRouteLimitThreshold"],
    fieldOids: ["hwBgpPeerConfigRouteLimitNum": "1.3.6.1.4.1.2011.5.25.177.1.1.5.1.1", "hwBgpPeerConfigRouteLimitThreshold": "1.3.6.1.4.1.2011.5.25.177.1.1.5.1.2"]
]

// --- hwBgpPeerRouteNumThresholdClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.177.1.3.2
// Fields: hwBgpPeerConfigRouteLimitNum, hwBgpPeerConfigRouteLimitThreshold
// Description: This notification is generated when the number of routes received from the BGP peer decreases below the alarm threshold.
trapMap["1.3.6.1.4.1.2011.5.25.177.1.3.2"] = [
    name: "hwBgpPeerRouteNumThresholdClear",
    fields: ["hwBgpPeerConfigRouteLimitNum", "hwBgpPeerConfigRouteLimitThreshold"],
    fieldOids: ["hwBgpPeerConfigRouteLimitNum": "1.3.6.1.4.1.2011.5.25.177.1.1.5.1.1", "hwBgpPeerConfigRouteLimitThreshold": "1.3.6.1.4.1.2011.5.25.177.1.1.5.1.2"]
]

// --- hwBgpPeerGRStatusChange (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.177.1.3.3
// Fields: hwBgpPeerGRStatus
// Description: This notification is generated when the graceful restart status described by hwBgpPeerGRStatus changes.
trapMap["1.3.6.1.4.1.2011.5.25.177.1.3.3"] = [
    name: "hwBgpPeerGRStatusChange",
    fields: ["hwBgpPeerGRStatus"],
    fieldOids: ["hwBgpPeerGRStatus": "1.3.6.1.4.1.2011.5.25.177.1.1.2.1.8"]
]

// --- hwBgpPeerUnavailable (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.177.1.3.4
// Fields: hwBgpPeerSessionLocalAddrType, hwBgpPeerSessionLocalAddr, hwBgpPeerSessionUnavailableType, hwBgpPeerSessionLocalIfName, hwBgpPeerSessionReason
// Description: This notification is generated when bgp peer session state change from up to down.
trapMap["1.3.6.1.4.1.2011.5.25.177.1.3.4"] = [
    name: "hwBgpPeerUnavailable",
    fields: ["hwBgpPeerSessionLocalAddrType", "hwBgpPeerSessionLocalAddr", "hwBgpPeerSessionUnavailableType", "hwBgpPeerSessionLocalIfName", "hwBgpPeerSessionReason"],
    fieldOids: ["hwBgpPeerSessionLocalAddrType": "1.3.6.1.4.1.2011.5.25.177.1.1.6.1.4", "hwBgpPeerSessionLocalAddr": "1.3.6.1.4.1.2011.5.25.177.1.1.6.1.5", "hwBgpPeerSessionUnavailableType": "1.3.6.1.4.1.2011.5.25.177.1.1.6.1.6", "hwBgpPeerSessionLocalIfName": "1.3.6.1.4.1.2011.5.25.177.1.1.6.1.7", "hwBgpPeerSessionReason": "1.3.6.1.4.1.2011.5.25.177.1.1.6.1.8"]
]

// --- hwBgpPeerAvailable (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.177.1.3.5
// Fields: hwBgpPeerSessionLocalAddrType, hwBgpPeerSessionLocalAddr, hwBgpPeerSessionUnavailableType, hwBgpPeerSessionLocalIfName, hwBgpPeerSessionReason
// Description: This notification is generated when bgp peer session state change from down to up.
trapMap["1.3.6.1.4.1.2011.5.25.177.1.3.5"] = [
    name: "hwBgpPeerAvailable",
    fields: ["hwBgpPeerSessionLocalAddrType", "hwBgpPeerSessionLocalAddr", "hwBgpPeerSessionUnavailableType", "hwBgpPeerSessionLocalIfName", "hwBgpPeerSessionReason"],
    fieldOids: ["hwBgpPeerSessionLocalAddrType": "1.3.6.1.4.1.2011.5.25.177.1.1.6.1.4", "hwBgpPeerSessionLocalAddr": "1.3.6.1.4.1.2011.5.25.177.1.1.6.1.5", "hwBgpPeerSessionUnavailableType": "1.3.6.1.4.1.2011.5.25.177.1.1.6.1.6", "hwBgpPeerSessionLocalIfName": "1.3.6.1.4.1.2011.5.25.177.1.1.6.1.7", "hwBgpPeerSessionReason": "1.3.6.1.4.1.2011.5.25.177.1.1.6.1.8"]
]

// --- hwBgpPeerRouteExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.177.1.3.6
// Fields: hwBgpPeerConfigRouteLimitNum, hwBgpPeerConfigRouteLimitThreshold
// Description: This notification is generated when bgp peer session route number exceed.
trapMap["1.3.6.1.4.1.2011.5.25.177.1.3.6"] = [
    name: "hwBgpPeerRouteExceed",
    fields: ["hwBgpPeerConfigRouteLimitNum", "hwBgpPeerConfigRouteLimitThreshold"],
    fieldOids: ["hwBgpPeerConfigRouteLimitNum": "1.3.6.1.4.1.2011.5.25.177.1.1.5.1.1", "hwBgpPeerConfigRouteLimitThreshold": "1.3.6.1.4.1.2011.5.25.177.1.1.5.1.2"]
]

// --- hwBgpPeerRouteExceedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.177.1.3.7
// Fields: hwBgpPeerConfigRouteLimitNum, hwBgpPeerConfigRouteLimitThreshold
// Description: This notification is generated when bgp peer session route number exceed clear.
trapMap["1.3.6.1.4.1.2011.5.25.177.1.3.7"] = [
    name: "hwBgpPeerRouteExceedClear",
    fields: ["hwBgpPeerConfigRouteLimitNum", "hwBgpPeerConfigRouteLimitThreshold"],
    fieldOids: ["hwBgpPeerConfigRouteLimitNum": "1.3.6.1.4.1.2011.5.25.177.1.1.5.1.1", "hwBgpPeerConfigRouteLimitThreshold": "1.3.6.1.4.1.2011.5.25.177.1.1.5.1.2"]
]

// --- hwL3vpnVrfRouteMidThreshCleared (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.177.1.3.8
// Fields: mplsL3VpnVrfPerfCurrNumRoutes, mplsL3VpnVrfConfMidRteThresh
// Description: This notification is generated when the number of routes contained by the specified VRF exceeds the value indicated by mplsL3VpnVrfMidRouteThreshold, and then falls below this value. A single notifica...
trapMap["1.3.6.1.4.1.2011.5.25.177.1.3.8"] = [
    name: "hwL3vpnVrfRouteMidThreshCleared",
    fields: ["mplsL3VpnVrfPerfCurrNumRoutes", "mplsL3VpnVrfConfMidRteThresh"],
    fieldOids: ["mplsL3VpnVrfPerfCurrNumRoutes": "1.3.6.1.2.1.10.166.11.1.3.1.1.3", "mplsL3VpnVrfConfMidRteThresh": "1.3.6.1.2.1.10.166.11.1.2.2.1.9"]
]

// --- hwBgpPeerEstablished (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.177.1.3.9
// Fields: hwBgpPeerLastError, hwBgpPeerState
// Description: The BGP Established event is generated when the BGP FSM enters the ESTABLISHED state.
trapMap["1.3.6.1.4.1.2011.5.25.177.1.3.9"] = [
    name: "hwBgpPeerEstablished",
    fields: ["hwBgpPeerLastError", "hwBgpPeerState"],
    fieldOids: ["hwBgpPeerLastError": "1.3.6.1.4.1.2011.5.25.177.1.1.2.1.9", "hwBgpPeerState": "1.3.6.1.4.1.2011.5.25.177.1.1.2.1.5"]
]

// --- hwBgpPeerBackwardTransition (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.177.1.3.10
// Fields: hwBgpPeerLastError, hwBgpPeerState, hwBgpPeerUnAvaiReason, ifName, hwBgpPeerDescription
// Description: The BGPBackwardTransition Event is generated when the BGP FSM moves from a higher numbered state to a lower numbered state.
trapMap["1.3.6.1.4.1.2011.5.25.177.1.3.10"] = [
    name: "hwBgpPeerBackwardTransition",
    fields: ["hwBgpPeerLastError", "hwBgpPeerState", "hwBgpPeerUnAvaiReason", "ifName", "hwBgpPeerDescription"],
    fieldOids: ["hwBgpPeerLastError": "1.3.6.1.4.1.2011.5.25.177.1.1.2.1.9", "hwBgpPeerState": "1.3.6.1.4.1.2011.5.25.177.1.1.2.1.5", "hwBgpPeerUnAvaiReason": "1.3.6.1.4.1.2011.5.25.177.1.1.2.1.10", "ifName": "1.3.6.1.2.1.31.1.1.1.1", "hwBgpPeerDescription": "1.3.6.1.4.1.2011.5.25.177.1.1.2.1.12"]
]

// --- hwBgpRouteThresholdExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.177.1.3.11
// Fields: hwBgpRouteLimitindex, hwBgpRouteCurNum, hwBgpRouteThreshold, hwBgpRouteMaxNum
// Description: This notification is generated when the number of bgp routes exceeds the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.177.1.3.11"] = [
    name: "hwBgpRouteThresholdExceed",
    fields: ["hwBgpRouteLimitindex", "hwBgpRouteCurNum", "hwBgpRouteThreshold", "hwBgpRouteMaxNum"],
    fieldOids: ["hwBgpRouteLimitindex": "1.3.6.1.4.1.2011.5.25.177.1.2.1.1", "hwBgpRouteCurNum": "1.3.6.1.4.1.2011.5.25.177.1.2.1.2", "hwBgpRouteThreshold": "1.3.6.1.4.1.2011.5.25.177.1.2.1.4", "hwBgpRouteMaxNum": "1.3.6.1.4.1.2011.5.25.177.1.2.1.3"]
]

// --- hwBgpRouteThresholdClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.177.1.3.12
// Fields: hwBgpRouteLimitindex
// Description: This notification is generated when the number of routes decreases below the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.177.1.3.12"] = [
    name: "hwBgpRouteThresholdClear",
    fields: ["hwBgpRouteLimitindex"],
    fieldOids: ["hwBgpRouteLimitindex": "1.3.6.1.4.1.2011.5.25.177.1.2.1.1"]
]

// --- hwBgpRouteMaxExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.177.1.3.13
// Fields: hwBgpRouteLimitindex, hwBgpRouteMaxNum
// Description: This notification is generated when the number of routes exceeds the maximum number.
trapMap["1.3.6.1.4.1.2011.5.25.177.1.3.13"] = [
    name: "hwBgpRouteMaxExceed",
    fields: ["hwBgpRouteLimitindex", "hwBgpRouteMaxNum"],
    fieldOids: ["hwBgpRouteLimitindex": "1.3.6.1.4.1.2011.5.25.177.1.2.1.1", "hwBgpRouteMaxNum": "1.3.6.1.4.1.2011.5.25.177.1.2.1.3"]
]

// --- hwBgpRouteMaxClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.177.1.3.14
// Fields: hwBgpRouteLimitindex
// Description: This notification is generated when the number of routes decreases below the maximum number.
trapMap["1.3.6.1.4.1.2011.5.25.177.1.3.14"] = [
    name: "hwBgpRouteMaxClear",
    fields: ["hwBgpRouteLimitindex"],
    fieldOids: ["hwBgpRouteLimitindex": "1.3.6.1.4.1.2011.5.25.177.1.2.1.1"]
]

// --- hwBgpPeerSessionExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.177.1.3.15
// Fields: hwBgpPeerSessionMaxNum
// Description: This notification is generated when the number of peer sessions exceeds the maximum number.
trapMap["1.3.6.1.4.1.2011.5.25.177.1.3.15"] = [
    name: "hwBgpPeerSessionExceed",
    fields: ["hwBgpPeerSessionMaxNum"],
    fieldOids: ["hwBgpPeerSessionMaxNum": "1.3.6.1.4.1.2011.5.25.177.1.4.4"]
]

// --- hwBgpPeerSessionExceedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.177.1.3.16
// Fields: hwBgpPeerSessionMaxNum, hwBgpPeerSessionNum
// Description: This notification is generated when the number of peer sessions decreases below the maximum number.
trapMap["1.3.6.1.4.1.2011.5.25.177.1.3.16"] = [
    name: "hwBgpPeerSessionExceedClear",
    fields: ["hwBgpPeerSessionMaxNum", "hwBgpPeerSessionNum"],
    fieldOids: ["hwBgpPeerSessionMaxNum": "1.3.6.1.4.1.2011.5.25.177.1.4.4", "hwBgpPeerSessionNum": "1.3.6.1.4.1.2011.5.25.177.1.4.1"]
]

// --- hwBgpDynamicPeerSessionExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.177.1.3.17
// Fields: hwBgpDynamicPeerSessionMaxNum
// Description: This notification is generated when the number of dynamic peer sessions exceeds the maximum number.
trapMap["1.3.6.1.4.1.2011.5.25.177.1.3.17"] = [
    name: "hwBgpDynamicPeerSessionExceed",
    fields: ["hwBgpDynamicPeerSessionMaxNum"],
    fieldOids: ["hwBgpDynamicPeerSessionMaxNum": "1.3.6.1.4.1.2011.5.25.177.1.4.6"]
]

// --- hwBgpDynamicPeerSessionExceedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.177.1.3.18
// Fields: hwBgpDynamicPeerSessionMaxNum, hwBgpDynamicPeerSessionNum
// Description: This notification is generated when the number of dynamic peer sessions decreases below the maximum number.
trapMap["1.3.6.1.4.1.2011.5.25.177.1.3.18"] = [
    name: "hwBgpDynamicPeerSessionExceedClear",
    fields: ["hwBgpDynamicPeerSessionMaxNum", "hwBgpDynamicPeerSessionNum"],
    fieldOids: ["hwBgpDynamicPeerSessionMaxNum": "1.3.6.1.4.1.2011.5.25.177.1.4.6", "hwBgpDynamicPeerSessionNum": "1.3.6.1.4.1.2011.5.25.177.1.4.5"]
]

// --- hwBgpPeerSessionThresholdExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.177.1.3.19
// Fields: hwBgpPeerSessionNum, hwBgpPeerSessionThreshold, hwBgpPeerSessionMaxNum
// Description: This notification is generated when the number of peer sessions exceeds the threshold number.
trapMap["1.3.6.1.4.1.2011.5.25.177.1.3.19"] = [
    name: "hwBgpPeerSessionThresholdExceed",
    fields: ["hwBgpPeerSessionNum", "hwBgpPeerSessionThreshold", "hwBgpPeerSessionMaxNum"],
    fieldOids: ["hwBgpPeerSessionNum": "1.3.6.1.4.1.2011.5.25.177.1.4.1", "hwBgpPeerSessionThreshold": "1.3.6.1.4.1.2011.5.25.177.1.4.7", "hwBgpPeerSessionMaxNum": "1.3.6.1.4.1.2011.5.25.177.1.4.4"]
]

// --- hwBgpPeerSessionThresholdClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.177.1.3.20
// Fields: hwBgpPeerSessionNum, hwBgpPeerSessionThreshold, hwBgpPeerSessionMaxNum
// Description: This notification is generated when the number of peer sessions decreases below the threshold number.
trapMap["1.3.6.1.4.1.2011.5.25.177.1.3.20"] = [
    name: "hwBgpPeerSessionThresholdClear",
    fields: ["hwBgpPeerSessionNum", "hwBgpPeerSessionThreshold", "hwBgpPeerSessionMaxNum"],
    fieldOids: ["hwBgpPeerSessionNum": "1.3.6.1.4.1.2011.5.25.177.1.4.1", "hwBgpPeerSessionThreshold": "1.3.6.1.4.1.2011.5.25.177.1.4.7", "hwBgpPeerSessionMaxNum": "1.3.6.1.4.1.2011.5.25.177.1.4.4"]
]

// --- hwBgpVrfRouteNumReachThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.177.1.3.21
// Fields: hwBgpVrfCurrRouteNum, hwBgpVrfThresholdValue, hwBgpVrfRouteType, hwBgpVrfInstName, hwBgpVrfAddressFamily
// Description: The number of routes in the VPN instance reached the alarm threshould.
trapMap["1.3.6.1.4.1.2011.5.25.177.1.3.21"] = [
    name: "hwBgpVrfRouteNumReachThreshold",
    fields: ["hwBgpVrfCurrRouteNum", "hwBgpVrfThresholdValue", "hwBgpVrfRouteType", "hwBgpVrfInstName", "hwBgpVrfAddressFamily"],
    fieldOids: ["hwBgpVrfCurrRouteNum": "1.3.6.1.4.1.2011.5.25.177.1.2.2.1.1", "hwBgpVrfThresholdValue": "1.3.6.1.4.1.2011.5.25.177.1.2.2.1.2", "hwBgpVrfRouteType": "1.3.6.1.4.1.2011.5.25.177.1.2.2.1.3", "hwBgpVrfInstName": "1.3.6.1.4.1.2011.5.25.177.1.2.2.1.4", "hwBgpVrfAddressFamily": "1.3.6.1.4.1.2011.5.25.177.1.2.2.1.5"]
]

// --- hwBgpVrfRouteNumReachThresholdClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.177.1.3.22
// Fields: hwBgpVrfCurrRouteNum, hwBgpVrfThresholdValue, hwBgpVrfRouteType, hwBgpVrfInstName, hwBgpVrfAddressFamily
// Description: The number of routes in the VPN instance fell below the clear alarm threshold.
trapMap["1.3.6.1.4.1.2011.5.25.177.1.3.22"] = [
    name: "hwBgpVrfRouteNumReachThresholdClear",
    fields: ["hwBgpVrfCurrRouteNum", "hwBgpVrfThresholdValue", "hwBgpVrfRouteType", "hwBgpVrfInstName", "hwBgpVrfAddressFamily"],
    fieldOids: ["hwBgpVrfCurrRouteNum": "1.3.6.1.4.1.2011.5.25.177.1.2.2.1.1", "hwBgpVrfThresholdValue": "1.3.6.1.4.1.2011.5.25.177.1.2.2.1.2", "hwBgpVrfRouteType": "1.3.6.1.4.1.2011.5.25.177.1.2.2.1.3", "hwBgpVrfInstName": "1.3.6.1.4.1.2011.5.25.177.1.2.2.1.4", "hwBgpVrfAddressFamily": "1.3.6.1.4.1.2011.5.25.177.1.2.2.1.5"]
]

// --- hwEvpnRouteReachThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.177.1.3.23
// Fields: hwEvpnCurrRouteNum, hwEvpnThresholdValue, hwEvpnRouteType, hwEvpnAddressFamily
// Description: The number of routes reached the alarm threshould.
trapMap["1.3.6.1.4.1.2011.5.25.177.1.3.23"] = [
    name: "hwEvpnRouteReachThreshold",
    fields: ["hwEvpnCurrRouteNum", "hwEvpnThresholdValue", "hwEvpnRouteType", "hwEvpnAddressFamily"],
    fieldOids: ["hwEvpnCurrRouteNum": "1.3.6.1.4.1.2011.5.25.177.1.2.3.1.1", "hwEvpnThresholdValue": "1.3.6.1.4.1.2011.5.25.177.1.2.3.1.2", "hwEvpnRouteType": "1.3.6.1.4.1.2011.5.25.177.1.2.3.1.3", "hwEvpnAddressFamily": "1.3.6.1.4.1.2011.5.25.177.1.2.3.1.4"]
]

// --- hwEvpnRouteReachThresholdClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.177.1.3.24
// Fields: hwEvpnCurrRouteNum, hwEvpnThresholdValue, hwEvpnRouteType, hwEvpnAddressFamily
// Description: The number of routes fell below the clear alarm threshold.
trapMap["1.3.6.1.4.1.2011.5.25.177.1.3.24"] = [
    name: "hwEvpnRouteReachThresholdClear",
    fields: ["hwEvpnCurrRouteNum", "hwEvpnThresholdValue", "hwEvpnRouteType", "hwEvpnAddressFamily"],
    fieldOids: ["hwEvpnCurrRouteNum": "1.3.6.1.4.1.2011.5.25.177.1.2.3.1.1", "hwEvpnThresholdValue": "1.3.6.1.4.1.2011.5.25.177.1.2.3.1.2", "hwEvpnRouteType": "1.3.6.1.4.1.2011.5.25.177.1.2.3.1.3", "hwEvpnAddressFamily": "1.3.6.1.4.1.2011.5.25.177.1.2.3.1.4"]
]

// --- hwVpnRouteLabelNumReachThresold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.177.1.3.25
// Fields: hwBgpAddrFamilyAfi, hwBgpAddrFamilySafi, hwBgpLabelMaxValue, hwBgpLabelLimitThreshold
// Description: The number of VPN route labels reached the alarm threshould.
trapMap["1.3.6.1.4.1.2011.5.25.177.1.3.25"] = [
    name: "hwVpnRouteLabelNumReachThresold",
    fields: ["hwBgpAddrFamilyAfi", "hwBgpAddrFamilySafi", "hwBgpLabelMaxValue", "hwBgpLabelLimitThreshold"],
    fieldOids: ["hwBgpAddrFamilyAfi": "1.3.6.1.4.1.2011.5.25.177.1.2.4.1", "hwBgpAddrFamilySafi": "1.3.6.1.4.1.2011.5.25.177.1.2.4.2", "hwBgpLabelMaxValue": "1.3.6.1.4.1.2011.5.25.177.1.2.4.3", "hwBgpLabelLimitThreshold": "1.3.6.1.4.1.2011.5.25.177.1.2.4.4"]
]

// --- hwVpnRouteLabelNumReachThresoldClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.177.1.3.26
// Fields: hwBgpAddrFamilyAfi, hwBgpAddrFamilySafi, hwBgpLabelMaxValue, hwBgpLabelLimitThreshold
// Description: The number of VPN route labels fell below the clear alarm threshold.
trapMap["1.3.6.1.4.1.2011.5.25.177.1.3.26"] = [
    name: "hwVpnRouteLabelNumReachThresoldClear",
    fields: ["hwBgpAddrFamilyAfi", "hwBgpAddrFamilySafi", "hwBgpLabelMaxValue", "hwBgpLabelLimitThreshold"],
    fieldOids: ["hwBgpAddrFamilyAfi": "1.3.6.1.4.1.2011.5.25.177.1.2.4.1", "hwBgpAddrFamilySafi": "1.3.6.1.4.1.2011.5.25.177.1.2.4.2", "hwBgpLabelMaxValue": "1.3.6.1.4.1.2011.5.25.177.1.2.4.3", "hwBgpLabelLimitThreshold": "1.3.6.1.4.1.2011.5.25.177.1.2.4.4"]
]

// --- hwVpnRouteLabelNumReachMaximum (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.177.1.3.27
// Fields: hwBgpAddrFamilyAfi, hwBgpAddrFamilySafi, hwBgpLabelMaxValue
// Description: The number of VPN route labels reached the maximum value.
trapMap["1.3.6.1.4.1.2011.5.25.177.1.3.27"] = [
    name: "hwVpnRouteLabelNumReachMaximum",
    fields: ["hwBgpAddrFamilyAfi", "hwBgpAddrFamilySafi", "hwBgpLabelMaxValue"],
    fieldOids: ["hwBgpAddrFamilyAfi": "1.3.6.1.4.1.2011.5.25.177.1.2.4.1", "hwBgpAddrFamilySafi": "1.3.6.1.4.1.2011.5.25.177.1.2.4.2", "hwBgpLabelMaxValue": "1.3.6.1.4.1.2011.5.25.177.1.2.4.3"]
]

// --- hwVpnRouteLabelNumReachMaximumClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.177.1.3.28
// Fields: hwBgpAddrFamilyAfi, hwBgpAddrFamilySafi, hwBgpLabelMaxValue
// Description: The number of VPN route labels fell below the maximum value.
trapMap["1.3.6.1.4.1.2011.5.25.177.1.3.28"] = [
    name: "hwVpnRouteLabelNumReachMaximumClear",
    fields: ["hwBgpAddrFamilyAfi", "hwBgpAddrFamilySafi", "hwBgpLabelMaxValue"],
    fieldOids: ["hwBgpAddrFamilyAfi": "1.3.6.1.4.1.2011.5.25.177.1.2.4.1", "hwBgpAddrFamilySafi": "1.3.6.1.4.1.2011.5.25.177.1.2.4.2", "hwBgpLabelMaxValue": "1.3.6.1.4.1.2011.5.25.177.1.2.4.3"]
]

// --- hwBgpPeerAddrFamilyRouteThresholdExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.177.1.3.29
// Fields: hwBgpVrfAddressFamily, hwBgpRouteMaxNum, hwBgpRouteThreshold, hwBgpProcessName
// Description: The number of routes received from peers in a BGP address family reached the alarm threshold.
trapMap["1.3.6.1.4.1.2011.5.25.177.1.3.29"] = [
    name: "hwBgpPeerAddrFamilyRouteThresholdExceed",
    fields: ["hwBgpVrfAddressFamily", "hwBgpRouteMaxNum", "hwBgpRouteThreshold", "hwBgpProcessName"],
    fieldOids: ["hwBgpVrfAddressFamily": "1.3.6.1.4.1.2011.5.25.177.1.2.2.1.5", "hwBgpRouteMaxNum": "1.3.6.1.4.1.2011.5.25.177.1.2.1.3", "hwBgpRouteThreshold": "1.3.6.1.4.1.2011.5.25.177.1.2.1.4", "hwBgpProcessName": "1.3.6.1.4.1.2011.5.25.177.1.5.1.1.1"]
]

// --- hwBgpPeerAddrFamilyRouteThresholdExceedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.177.1.3.30
// Fields: hwBgpVrfAddressFamily, hwBgpRouteMaxNum, hwBgpRouteThreshold, hwBgpProcessName
// Description: The number of routes received from peers in a BGP address family fell below the alarm threshold.
trapMap["1.3.6.1.4.1.2011.5.25.177.1.3.30"] = [
    name: "hwBgpPeerAddrFamilyRouteThresholdExceedClear",
    fields: ["hwBgpVrfAddressFamily", "hwBgpRouteMaxNum", "hwBgpRouteThreshold", "hwBgpProcessName"],
    fieldOids: ["hwBgpVrfAddressFamily": "1.3.6.1.4.1.2011.5.25.177.1.2.2.1.5", "hwBgpRouteMaxNum": "1.3.6.1.4.1.2011.5.25.177.1.2.1.3", "hwBgpRouteThreshold": "1.3.6.1.4.1.2011.5.25.177.1.2.1.4", "hwBgpProcessName": "1.3.6.1.4.1.2011.5.25.177.1.5.1.1.1"]
]

// --- hwBgpPeerAddrFamilyRouteExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.177.1.3.31
// Fields: hwBgpVrfAddressFamily, hwBgpRouteMaxNum, hwBgpProcessName
// Description: The number of routes received from peers in a BGP address family reached the maximum value.
trapMap["1.3.6.1.4.1.2011.5.25.177.1.3.31"] = [
    name: "hwBgpPeerAddrFamilyRouteExceed",
    fields: ["hwBgpVrfAddressFamily", "hwBgpRouteMaxNum", "hwBgpProcessName"],
    fieldOids: ["hwBgpVrfAddressFamily": "1.3.6.1.4.1.2011.5.25.177.1.2.2.1.5", "hwBgpRouteMaxNum": "1.3.6.1.4.1.2011.5.25.177.1.2.1.3", "hwBgpProcessName": "1.3.6.1.4.1.2011.5.25.177.1.5.1.1.1"]
]

// --- hwBgpPeerAddrFamilyRouteExceedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.177.1.3.32
// Fields: hwBgpVrfAddressFamily, hwBgpRouteMaxNum, hwBgpProcessName
// Description: The number of routes received from peers in a BGP address family fell below the maximum value.
trapMap["1.3.6.1.4.1.2011.5.25.177.1.3.32"] = [
    name: "hwBgpPeerAddrFamilyRouteExceedClear",
    fields: ["hwBgpVrfAddressFamily", "hwBgpRouteMaxNum", "hwBgpProcessName"],
    fieldOids: ["hwBgpVrfAddressFamily": "1.3.6.1.4.1.2011.5.25.177.1.2.2.1.5", "hwBgpRouteMaxNum": "1.3.6.1.4.1.2011.5.25.177.1.2.1.3", "hwBgpProcessName": "1.3.6.1.4.1.2011.5.25.177.1.5.1.1.1"]
]

// --- hwBgpPeerAddrFamilyPerRouteThresholdExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.177.1.3.33
// Fields: hwBgpVrfAddressFamily, hwBgpRouteType, hwBgpRouteMaxNum, hwBgpRouteThreshold, hwBgpProcessName
// Description: The number of specified routes received from peers in a BGP address family reached the alarm threshold.
trapMap["1.3.6.1.4.1.2011.5.25.177.1.3.33"] = [
    name: "hwBgpPeerAddrFamilyPerRouteThresholdExceed",
    fields: ["hwBgpVrfAddressFamily", "hwBgpRouteType", "hwBgpRouteMaxNum", "hwBgpRouteThreshold", "hwBgpProcessName"],
    fieldOids: ["hwBgpVrfAddressFamily": "1.3.6.1.4.1.2011.5.25.177.1.2.2.1.5", "hwBgpRouteType": "1.3.6.1.4.1.2011.5.25.177.1.2.1.5", "hwBgpRouteMaxNum": "1.3.6.1.4.1.2011.5.25.177.1.2.1.3", "hwBgpRouteThreshold": "1.3.6.1.4.1.2011.5.25.177.1.2.1.4", "hwBgpProcessName": "1.3.6.1.4.1.2011.5.25.177.1.5.1.1.1"]
]

// --- hwBgpPeerAddrFamilyPerRouteThresholdExceedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.177.1.3.34
// Fields: hwBgpVrfAddressFamily, hwBgpRouteType, hwBgpRouteMaxNum, hwBgpRouteThreshold, hwBgpProcessName
// Description: The number of specified routes received from peers in a BGP address family fell below the alarm threshold.
trapMap["1.3.6.1.4.1.2011.5.25.177.1.3.34"] = [
    name: "hwBgpPeerAddrFamilyPerRouteThresholdExceedClear",
    fields: ["hwBgpVrfAddressFamily", "hwBgpRouteType", "hwBgpRouteMaxNum", "hwBgpRouteThreshold", "hwBgpProcessName"],
    fieldOids: ["hwBgpVrfAddressFamily": "1.3.6.1.4.1.2011.5.25.177.1.2.2.1.5", "hwBgpRouteType": "1.3.6.1.4.1.2011.5.25.177.1.2.1.5", "hwBgpRouteMaxNum": "1.3.6.1.4.1.2011.5.25.177.1.2.1.3", "hwBgpRouteThreshold": "1.3.6.1.4.1.2011.5.25.177.1.2.1.4", "hwBgpProcessName": "1.3.6.1.4.1.2011.5.25.177.1.5.1.1.1"]
]

// --- hwBgpPeerAddrFamilyPerRouteExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.177.1.3.35
// Fields: hwBgpVrfAddressFamily, hwBgpRouteType, hwBgpRouteMaxNum, hwBgpProcessName
// Description: The number of specified routes received from peers in a BGP address family reached the maximum value.
trapMap["1.3.6.1.4.1.2011.5.25.177.1.3.35"] = [
    name: "hwBgpPeerAddrFamilyPerRouteExceed",
    fields: ["hwBgpVrfAddressFamily", "hwBgpRouteType", "hwBgpRouteMaxNum", "hwBgpProcessName"],
    fieldOids: ["hwBgpVrfAddressFamily": "1.3.6.1.4.1.2011.5.25.177.1.2.2.1.5", "hwBgpRouteType": "1.3.6.1.4.1.2011.5.25.177.1.2.1.5", "hwBgpRouteMaxNum": "1.3.6.1.4.1.2011.5.25.177.1.2.1.3", "hwBgpProcessName": "1.3.6.1.4.1.2011.5.25.177.1.5.1.1.1"]
]

// --- hwBgpPeerAddrFamilyPerRouteExceedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.177.1.3.36
// Fields: hwBgpVrfAddressFamily, hwBgpRouteType, hwBgpRouteMaxNum, hwBgpProcessName
// Description: The number of specified routes received from peers in a BGP address family fell below the maximum value.
trapMap["1.3.6.1.4.1.2011.5.25.177.1.3.36"] = [
    name: "hwBgpPeerAddrFamilyPerRouteExceedClear",
    fields: ["hwBgpVrfAddressFamily", "hwBgpRouteType", "hwBgpRouteMaxNum", "hwBgpProcessName"],
    fieldOids: ["hwBgpVrfAddressFamily": "1.3.6.1.4.1.2011.5.25.177.1.2.2.1.5", "hwBgpRouteType": "1.3.6.1.4.1.2011.5.25.177.1.2.1.5", "hwBgpRouteMaxNum": "1.3.6.1.4.1.2011.5.25.177.1.2.1.3", "hwBgpProcessName": "1.3.6.1.4.1.2011.5.25.177.1.5.1.1.1"]
]

// --- hwBgpRouteLoopDetected (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.177.1.3.37
// Fields: hwBgpProcessName, hwBgpVrfName, hwBgpAddrFamilyAfi, hwBgpAddrFamilySafi
// Description: The local device has detected a BGP routing loop.
trapMap["1.3.6.1.4.1.2011.5.25.177.1.3.37"] = [
    name: "hwBgpRouteLoopDetected",
    fields: ["hwBgpProcessName", "hwBgpVrfName", "hwBgpAddrFamilyAfi", "hwBgpAddrFamilySafi"],
    fieldOids: ["hwBgpProcessName": "1.3.6.1.4.1.2011.5.25.177.1.5.1.1.1", "hwBgpVrfName": "1.3.6.1.4.1.2011.5.25.177.1.2.5.1", "hwBgpAddrFamilyAfi": "1.3.6.1.4.1.2011.5.25.177.1.2.4.1", "hwBgpAddrFamilySafi": "1.3.6.1.4.1.2011.5.25.177.1.2.4.2"]
]

// --- hwBgpRouteLoopDetectedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.177.1.3.38
// Fields: hwBgpProcessName, hwBgpVrfName, hwBgpAddrFamilyAfi, hwBgpAddrFamilySafi
// Description: The BGP routing loop is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.177.1.3.38"] = [
    name: "hwBgpRouteLoopDetectedClear",
    fields: ["hwBgpProcessName", "hwBgpVrfName", "hwBgpAddrFamilyAfi", "hwBgpAddrFamilySafi"],
    fieldOids: ["hwBgpProcessName": "1.3.6.1.4.1.2011.5.25.177.1.5.1.1.1", "hwBgpVrfName": "1.3.6.1.4.1.2011.5.25.177.1.2.5.1", "hwBgpAddrFamilyAfi": "1.3.6.1.4.1.2011.5.25.177.1.2.4.1", "hwBgpAddrFamilySafi": "1.3.6.1.4.1.2011.5.25.177.1.2.4.2"]
]

// --- hwBgpDiscardRecvRoute (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.177.1.3.39
// Fields: hwBgpProcessName, hwBgpAddrFamilyAfi, hwBgpAddrFamilySafi, hwBgpMemReason
// Description: BGP discard received routes.
trapMap["1.3.6.1.4.1.2011.5.25.177.1.3.39"] = [
    name: "hwBgpDiscardRecvRoute",
    fields: ["hwBgpProcessName", "hwBgpAddrFamilyAfi", "hwBgpAddrFamilySafi", "hwBgpMemReason"],
    fieldOids: ["hwBgpProcessName": "1.3.6.1.4.1.2011.5.25.177.1.5.1.1.1", "hwBgpAddrFamilyAfi": "1.3.6.1.4.1.2011.5.25.177.1.2.4.1", "hwBgpAddrFamilySafi": "1.3.6.1.4.1.2011.5.25.177.1.2.4.2", "hwBgpMemReason": "1.3.6.1.4.1.2011.5.25.177.1.2.5.2"]
]

// --- hwBgpDiscardRecvRouteClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.177.1.3.40
// Fields: hwBgpProcessName, hwBgpAddrFamilyAfi, hwBgpAddrFamilySafi, hwBgpMemReason
// Description: BGP resume to process received routes.
trapMap["1.3.6.1.4.1.2011.5.25.177.1.3.40"] = [
    name: "hwBgpDiscardRecvRouteClear",
    fields: ["hwBgpProcessName", "hwBgpAddrFamilyAfi", "hwBgpAddrFamilySafi", "hwBgpMemReason"],
    fieldOids: ["hwBgpProcessName": "1.3.6.1.4.1.2011.5.25.177.1.5.1.1.1", "hwBgpAddrFamilyAfi": "1.3.6.1.4.1.2011.5.25.177.1.2.4.1", "hwBgpAddrFamilySafi": "1.3.6.1.4.1.2011.5.25.177.1.2.4.2", "hwBgpMemReason": "1.3.6.1.4.1.2011.5.25.177.1.2.5.2"]
]

// --- hwBgpUnnumberedPeerBackwardTransition (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.177.1.3.41
// Fields: hwBgpPeerLastError, hwBgpPeerState, hwBgpPeerUnAvaiReason, ifName, hwBgpPeerDescription
// Description: The BGPBackwardTransition Event is generated when the BGP FSM moves from a higher numbered state to a lower numbered state.
trapMap["1.3.6.1.4.1.2011.5.25.177.1.3.41"] = [
    name: "hwBgpUnnumberedPeerBackwardTransition",
    fields: ["hwBgpPeerLastError", "hwBgpPeerState", "hwBgpPeerUnAvaiReason", "ifName", "hwBgpPeerDescription"],
    fieldOids: ["hwBgpPeerLastError": "1.3.6.1.4.1.2011.5.25.177.1.1.2.1.9", "hwBgpPeerState": "1.3.6.1.4.1.2011.5.25.177.1.1.2.1.5", "hwBgpPeerUnAvaiReason": "1.3.6.1.4.1.2011.5.25.177.1.1.2.1.10", "ifName": "1.3.6.1.2.1.31.1.1.1.1", "hwBgpPeerDescription": "1.3.6.1.4.1.2011.5.25.177.1.1.2.1.12"]
]

// --- hwBgpUnnumberedPeerEstablished (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.177.1.3.42
// Fields: hwBgpPeerLastError, hwBgpPeerState, hwBgpPeerUnAvaiReason, ifName
// Description: The BGP Established event is generated when the BGP FSM enters the ESTABLISHED state.
trapMap["1.3.6.1.4.1.2011.5.25.177.1.3.42"] = [
    name: "hwBgpUnnumberedPeerEstablished",
    fields: ["hwBgpPeerLastError", "hwBgpPeerState", "hwBgpPeerUnAvaiReason", "ifName"],
    fieldOids: ["hwBgpPeerLastError": "1.3.6.1.4.1.2011.5.25.177.1.1.2.1.9", "hwBgpPeerState": "1.3.6.1.4.1.2011.5.25.177.1.1.2.1.5", "hwBgpPeerUnAvaiReason": "1.3.6.1.4.1.2011.5.25.177.1.1.2.1.10", "ifName": "1.3.6.1.2.1.31.1.1.1.1"]
]

// --- hwBgpUnnumberedPeerRouteExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.177.1.3.43
// Fields: hwBgpPeerConfigRouteLimitNum, hwBgpPeerConfigRouteLimitThreshold, ifName
// Description: This notification is generated when bgp peer session route number exceed.
trapMap["1.3.6.1.4.1.2011.5.25.177.1.3.43"] = [
    name: "hwBgpUnnumberedPeerRouteExceed",
    fields: ["hwBgpPeerConfigRouteLimitNum", "hwBgpPeerConfigRouteLimitThreshold", "ifName"],
    fieldOids: ["hwBgpPeerConfigRouteLimitNum": "1.3.6.1.4.1.2011.5.25.177.1.1.5.1.1", "hwBgpPeerConfigRouteLimitThreshold": "1.3.6.1.4.1.2011.5.25.177.1.1.5.1.2", "ifName": "1.3.6.1.2.1.31.1.1.1.1"]
]

// --- hwBgpUnnumberedPeerRouteExceedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.177.1.3.44
// Fields: hwBgpPeerConfigRouteLimitNum, hwBgpPeerConfigRouteLimitThreshold, ifName
// Description: This notification is generated when bgp peer session route number exceed clear.
trapMap["1.3.6.1.4.1.2011.5.25.177.1.3.44"] = [
    name: "hwBgpUnnumberedPeerRouteExceedClear",
    fields: ["hwBgpPeerConfigRouteLimitNum", "hwBgpPeerConfigRouteLimitThreshold", "ifName"],
    fieldOids: ["hwBgpPeerConfigRouteLimitNum": "1.3.6.1.4.1.2011.5.25.177.1.1.5.1.1", "hwBgpPeerConfigRouteLimitThreshold": "1.3.6.1.4.1.2011.5.25.177.1.1.5.1.2", "ifName": "1.3.6.1.2.1.31.1.1.1.1"]
]

// --- hwBgpUnnumberedPeerRouteNumThresholdExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.177.1.3.45
// Fields: hwBgpPeerConfigRouteLimitNum, hwBgpPeerConfigRouteLimitThreshold, ifName
// Description: This notification is generated when the number of routes received from the BGP peer exceeds the alarm threshold.
trapMap["1.3.6.1.4.1.2011.5.25.177.1.3.45"] = [
    name: "hwBgpUnnumberedPeerRouteNumThresholdExceed",
    fields: ["hwBgpPeerConfigRouteLimitNum", "hwBgpPeerConfigRouteLimitThreshold", "ifName"],
    fieldOids: ["hwBgpPeerConfigRouteLimitNum": "1.3.6.1.4.1.2011.5.25.177.1.1.5.1.1", "hwBgpPeerConfigRouteLimitThreshold": "1.3.6.1.4.1.2011.5.25.177.1.1.5.1.2", "ifName": "1.3.6.1.2.1.31.1.1.1.1"]
]

// --- hwBgpUnnumberedPeerRouteNumThresholdExceedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.177.1.3.46
// Fields: hwBgpPeerConfigRouteLimitNum, hwBgpPeerConfigRouteLimitThreshold, ifName
// Description: This notification is generated when the number of routes received from the BGP peer decreases below the alarm threshold.
trapMap["1.3.6.1.4.1.2011.5.25.177.1.3.46"] = [
    name: "hwBgpUnnumberedPeerRouteNumThresholdExceedClear",
    fields: ["hwBgpPeerConfigRouteLimitNum", "hwBgpPeerConfigRouteLimitThreshold", "ifName"],
    fieldOids: ["hwBgpPeerConfigRouteLimitNum": "1.3.6.1.4.1.2011.5.25.177.1.1.5.1.1", "hwBgpPeerConfigRouteLimitThreshold": "1.3.6.1.4.1.2011.5.25.177.1.1.5.1.2", "ifName": "1.3.6.1.2.1.31.1.1.1.1"]
]

// --- hwBgpRoaCheckFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.177.1.3.47
// Fields: hwBgpProcessName, hwBgpVrfName, hwBgpAddrFamilyAfi, hwBgpAddrFamilySafi
// Description: The checking result of export ROA is failed.
trapMap["1.3.6.1.4.1.2011.5.25.177.1.3.47"] = [
    name: "hwBgpRoaCheckFail",
    fields: ["hwBgpProcessName", "hwBgpVrfName", "hwBgpAddrFamilyAfi", "hwBgpAddrFamilySafi"],
    fieldOids: ["hwBgpProcessName": "1.3.6.1.4.1.2011.5.25.177.1.5.1.1.1", "hwBgpVrfName": "1.3.6.1.4.1.2011.5.25.177.1.2.5.1", "hwBgpAddrFamilyAfi": "1.3.6.1.4.1.2011.5.25.177.1.2.4.1", "hwBgpAddrFamilySafi": "1.3.6.1.4.1.2011.5.25.177.1.2.4.2"]
]

// --- hwBgpSidLabelConflict (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.177.1.3.48
// Fields: hwBgpVrfAddressFamily, hwBgpPrefixSidLabel, hwBgpProcessName, hwBgpVrfName, hwBgpRoutePrefix
// Description: The prefix-sid label conflict is detected.
trapMap["1.3.6.1.4.1.2011.5.25.177.1.3.48"] = [
    name: "hwBgpSidLabelConflict",
    fields: ["hwBgpVrfAddressFamily", "hwBgpPrefixSidLabel", "hwBgpProcessName", "hwBgpVrfName", "hwBgpRoutePrefix"],
    fieldOids: ["hwBgpVrfAddressFamily": "1.3.6.1.4.1.2011.5.25.177.1.2.2.1.5", "hwBgpPrefixSidLabel": "1.3.6.1.4.1.2011.5.25.177.1.2.6.1", "hwBgpProcessName": "1.3.6.1.4.1.2011.5.25.177.1.5.1.1.1", "hwBgpVrfName": "1.3.6.1.4.1.2011.5.25.177.1.2.5.1", "hwBgpRoutePrefix": "1.3.6.1.4.1.2011.5.25.177.1.2.6.2"]
]

// --- hwBgpSidLabelConflictClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.177.1.3.49
// Fields: hwBgpVrfAddressFamily, hwBgpPrefixSidLabel, hwBgpProcessName, hwBgpVrfName, hwBgpRoutePrefix
// Description: The prefix-sid label conflict is resolved.
trapMap["1.3.6.1.4.1.2011.5.25.177.1.3.49"] = [
    name: "hwBgpSidLabelConflictClear",
    fields: ["hwBgpVrfAddressFamily", "hwBgpPrefixSidLabel", "hwBgpProcessName", "hwBgpVrfName", "hwBgpRoutePrefix"],
    fieldOids: ["hwBgpVrfAddressFamily": "1.3.6.1.4.1.2011.5.25.177.1.2.2.1.5", "hwBgpPrefixSidLabel": "1.3.6.1.4.1.2011.5.25.177.1.2.6.1", "hwBgpProcessName": "1.3.6.1.4.1.2011.5.25.177.1.5.1.1.1", "hwBgpVrfName": "1.3.6.1.4.1.2011.5.25.177.1.2.5.1", "hwBgpRoutePrefix": "1.3.6.1.4.1.2011.5.25.177.1.2.6.2"]
]

// --- hwBgpPdPeerAddrFamilyRouteThresholdExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.177.1.3.50
// Fields: hwDistributeName, hwBgpProcessName, hwBgpVrfAddressFamily, hwBgpRouteMaxNum, hwBgpRouteThreshold
// Description: The number of routes received from distributed peers in a BGP address family reached the alarm threshold.
trapMap["1.3.6.1.4.1.2011.5.25.177.1.3.50"] = [
    name: "hwBgpPdPeerAddrFamilyRouteThresholdExceed",
    fields: ["hwDistributeName", "hwBgpProcessName", "hwBgpVrfAddressFamily", "hwBgpRouteMaxNum", "hwBgpRouteThreshold"],
    fieldOids: ["hwDistributeName": "1.3.6.1.4.1.2011.5.25.177.9.3.1.2", "hwBgpProcessName": "1.3.6.1.4.1.2011.5.25.177.1.5.1.1.1", "hwBgpVrfAddressFamily": "1.3.6.1.4.1.2011.5.25.177.1.2.2.1.5", "hwBgpRouteMaxNum": "1.3.6.1.4.1.2011.5.25.177.1.2.1.3", "hwBgpRouteThreshold": "1.3.6.1.4.1.2011.5.25.177.1.2.1.4"]
]

// --- hwBgpPdPeerAddrFamilyRouteThresholdExceedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.177.1.3.51
// Fields: hwDistributeName, hwBgpProcessName, hwBgpVrfAddressFamily, hwBgpRouteMaxNum, hwBgpRouteThreshold
// Description: The number of routes received from distributed peers in a BGP address family fell below the alarm threshold.
trapMap["1.3.6.1.4.1.2011.5.25.177.1.3.51"] = [
    name: "hwBgpPdPeerAddrFamilyRouteThresholdExceedClear",
    fields: ["hwDistributeName", "hwBgpProcessName", "hwBgpVrfAddressFamily", "hwBgpRouteMaxNum", "hwBgpRouteThreshold"],
    fieldOids: ["hwDistributeName": "1.3.6.1.4.1.2011.5.25.177.9.3.1.2", "hwBgpProcessName": "1.3.6.1.4.1.2011.5.25.177.1.5.1.1.1", "hwBgpVrfAddressFamily": "1.3.6.1.4.1.2011.5.25.177.1.2.2.1.5", "hwBgpRouteMaxNum": "1.3.6.1.4.1.2011.5.25.177.1.2.1.3", "hwBgpRouteThreshold": "1.3.6.1.4.1.2011.5.25.177.1.2.1.4"]
]

// --- hwBgpPdPeerAddrFamilyRouteExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.177.1.3.52
// Fields: hwDistributeName, hwBgpProcessName, hwBgpVrfAddressFamily, hwBgpRouteMaxNum
// Description: The number of routes received from distributed peers in a BGP address family reached the maximum value.
trapMap["1.3.6.1.4.1.2011.5.25.177.1.3.52"] = [
    name: "hwBgpPdPeerAddrFamilyRouteExceed",
    fields: ["hwDistributeName", "hwBgpProcessName", "hwBgpVrfAddressFamily", "hwBgpRouteMaxNum"],
    fieldOids: ["hwDistributeName": "1.3.6.1.4.1.2011.5.25.177.9.3.1.2", "hwBgpProcessName": "1.3.6.1.4.1.2011.5.25.177.1.5.1.1.1", "hwBgpVrfAddressFamily": "1.3.6.1.4.1.2011.5.25.177.1.2.2.1.5", "hwBgpRouteMaxNum": "1.3.6.1.4.1.2011.5.25.177.1.2.1.3"]
]

// --- hwBgpPdPeerAddrFamilyRouteExceedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.177.1.3.53
// Fields: hwDistributeName, hwBgpProcessName, hwBgpVrfAddressFamily, hwBgpRouteMaxNum
// Description: The number of routes received from distributed peers in a BGP address family fell below the maximum value.
trapMap["1.3.6.1.4.1.2011.5.25.177.1.3.53"] = [
    name: "hwBgpPdPeerAddrFamilyRouteExceedClear",
    fields: ["hwDistributeName", "hwBgpProcessName", "hwBgpVrfAddressFamily", "hwBgpRouteMaxNum"],
    fieldOids: ["hwDistributeName": "1.3.6.1.4.1.2011.5.25.177.9.3.1.2", "hwBgpProcessName": "1.3.6.1.4.1.2011.5.25.177.1.5.1.1.1", "hwBgpVrfAddressFamily": "1.3.6.1.4.1.2011.5.25.177.1.2.2.1.5", "hwBgpRouteMaxNum": "1.3.6.1.4.1.2011.5.25.177.1.2.1.3"]
]

// --- hwBgpMultiVpnRouteLabelNumReachMaximum (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.177.1.3.54
// Fields: hwBgpProcessName, hwBgpAddrFamilyAfi, hwBgpAddrFamilySafi, hwBgpLabelMaxValue
// Description: The number of VPN route labels reached the maximum value.
trapMap["1.3.6.1.4.1.2011.5.25.177.1.3.54"] = [
    name: "hwBgpMultiVpnRouteLabelNumReachMaximum",
    fields: ["hwBgpProcessName", "hwBgpAddrFamilyAfi", "hwBgpAddrFamilySafi", "hwBgpLabelMaxValue"],
    fieldOids: ["hwBgpProcessName": "1.3.6.1.4.1.2011.5.25.177.1.5.1.1.1", "hwBgpAddrFamilyAfi": "1.3.6.1.4.1.2011.5.25.177.1.2.4.1", "hwBgpAddrFamilySafi": "1.3.6.1.4.1.2011.5.25.177.1.2.4.2", "hwBgpLabelMaxValue": "1.3.6.1.4.1.2011.5.25.177.1.2.4.3"]
]

// --- hwBgpMultiVpnRouteLabelNumReachMaximumClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.177.1.3.55
// Fields: hwBgpProcessName, hwBgpAddrFamilyAfi, hwBgpAddrFamilySafi, hwBgpLabelMaxValue
// Description: The number of VPN route labels fell below the maximum value.
trapMap["1.3.6.1.4.1.2011.5.25.177.1.3.55"] = [
    name: "hwBgpMultiVpnRouteLabelNumReachMaximumClear",
    fields: ["hwBgpProcessName", "hwBgpAddrFamilyAfi", "hwBgpAddrFamilySafi", "hwBgpLabelMaxValue"],
    fieldOids: ["hwBgpProcessName": "1.3.6.1.4.1.2011.5.25.177.1.5.1.1.1", "hwBgpAddrFamilyAfi": "1.3.6.1.4.1.2011.5.25.177.1.2.4.1", "hwBgpAddrFamilySafi": "1.3.6.1.4.1.2011.5.25.177.1.2.4.2", "hwBgpLabelMaxValue": "1.3.6.1.4.1.2011.5.25.177.1.2.4.3"]
]

// --- hwBgpMultiVpnRouteLabelNumReachThresold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.177.1.3.56
// Fields: hwBgpProcessName, hwBgpAddrFamilyAfi, hwBgpAddrFamilySafi, hwBgpLabelMaxValue, hwBgpLabelLimitThreshold
// Description: The number of VPN route labels reached the alarm threshould.
trapMap["1.3.6.1.4.1.2011.5.25.177.1.3.56"] = [
    name: "hwBgpMultiVpnRouteLabelNumReachThresold",
    fields: ["hwBgpProcessName", "hwBgpAddrFamilyAfi", "hwBgpAddrFamilySafi", "hwBgpLabelMaxValue", "hwBgpLabelLimitThreshold"],
    fieldOids: ["hwBgpProcessName": "1.3.6.1.4.1.2011.5.25.177.1.5.1.1.1", "hwBgpAddrFamilyAfi": "1.3.6.1.4.1.2011.5.25.177.1.2.4.1", "hwBgpAddrFamilySafi": "1.3.6.1.4.1.2011.5.25.177.1.2.4.2", "hwBgpLabelMaxValue": "1.3.6.1.4.1.2011.5.25.177.1.2.4.3", "hwBgpLabelLimitThreshold": "1.3.6.1.4.1.2011.5.25.177.1.2.4.4"]
]

// --- hwBgpMultiVpnRouteLabelNumReachThresoldClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.177.1.3.57
// Fields: hwBgpProcessName, hwBgpAddrFamilyAfi, hwBgpAddrFamilySafi, hwBgpLabelMaxValue, hwBgpLabelLimitThreshold
// Description: The number of VPN route labels fell below the clear alarm threshold.
trapMap["1.3.6.1.4.1.2011.5.25.177.1.3.57"] = [
    name: "hwBgpMultiVpnRouteLabelNumReachThresoldClear",
    fields: ["hwBgpProcessName", "hwBgpAddrFamilyAfi", "hwBgpAddrFamilySafi", "hwBgpLabelMaxValue", "hwBgpLabelLimitThreshold"],
    fieldOids: ["hwBgpProcessName": "1.3.6.1.4.1.2011.5.25.177.1.5.1.1.1", "hwBgpAddrFamilyAfi": "1.3.6.1.4.1.2011.5.25.177.1.2.4.1", "hwBgpAddrFamilySafi": "1.3.6.1.4.1.2011.5.25.177.1.2.4.2", "hwBgpLabelMaxValue": "1.3.6.1.4.1.2011.5.25.177.1.2.4.3", "hwBgpLabelLimitThreshold": "1.3.6.1.4.1.2011.5.25.177.1.2.4.4"]
]

// --- hwBgpMultiDynamicPeerSessionExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.177.1.3.58
// Fields: hwBgpProcessName, hwBgpDynamicPeerSessionMaxNum
// Description: The number of BGP dynamic peer sessions exceeded the maximum number.
trapMap["1.3.6.1.4.1.2011.5.25.177.1.3.58"] = [
    name: "hwBgpMultiDynamicPeerSessionExceed",
    fields: ["hwBgpProcessName", "hwBgpDynamicPeerSessionMaxNum"],
    fieldOids: ["hwBgpProcessName": "1.3.6.1.4.1.2011.5.25.177.1.5.1.1.1", "hwBgpDynamicPeerSessionMaxNum": "1.3.6.1.4.1.2011.5.25.177.1.4.6"]
]

// --- hwBgpMultiDynamicPeerSessionExceedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.177.1.3.59
// Fields: hwBgpProcessName, hwBgpDynamicPeerSessionMaxNum, hwBgpDynamicPeerSessionNum
// Description: The number of BGP dynamic peer sessions decreased below the maximum number.
trapMap["1.3.6.1.4.1.2011.5.25.177.1.3.59"] = [
    name: "hwBgpMultiDynamicPeerSessionExceedClear",
    fields: ["hwBgpProcessName", "hwBgpDynamicPeerSessionMaxNum", "hwBgpDynamicPeerSessionNum"],
    fieldOids: ["hwBgpProcessName": "1.3.6.1.4.1.2011.5.25.177.1.5.1.1.1", "hwBgpDynamicPeerSessionMaxNum": "1.3.6.1.4.1.2011.5.25.177.1.4.6", "hwBgpDynamicPeerSessionNum": "1.3.6.1.4.1.2011.5.25.177.1.4.5"]
]

// --- hwBgpPacketSendFailed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.177.1.3.60
// Fields: hwBgpProcessName, hwBgpVrfName, hwBgpPeerAddress, ifIndex, ifName
// Description: The BGP peer cannot send packets for a long time.
trapMap["1.3.6.1.4.1.2011.5.25.177.1.3.60"] = [
    name: "hwBgpPacketSendFailed",
    fields: ["hwBgpProcessName", "hwBgpVrfName", "hwBgpPeerAddress", "ifIndex", "ifName"],
    fieldOids: ["hwBgpProcessName": "1.3.6.1.4.1.2011.5.25.177.1.5.1.1.1", "hwBgpVrfName": "1.3.6.1.4.1.2011.5.25.177.1.2.5.1", "hwBgpPeerAddress": "1.3.6.1.4.1.2011.5.25.177.1.5.1.1.2", "ifIndex": "1.3.6.1.2.1.2.2.1.1", "ifName": "1.3.6.1.2.1.31.1.1.1.1"]
]

// --- hwBgpPacketSendFailedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.177.1.3.61
// Fields: hwBgpProcessName, hwBgpVrfName, hwBgpPeerAddress, ifIndex, ifName
// Description: The alarm indicating that the BGP peer cannot send packets for a long time is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.177.1.3.61"] = [
    name: "hwBgpPacketSendFailedClear",
    fields: ["hwBgpProcessName", "hwBgpVrfName", "hwBgpPeerAddress", "ifIndex", "ifName"],
    fieldOids: ["hwBgpProcessName": "1.3.6.1.4.1.2011.5.25.177.1.5.1.1.1", "hwBgpVrfName": "1.3.6.1.4.1.2011.5.25.177.1.2.5.1", "hwBgpPeerAddress": "1.3.6.1.4.1.2011.5.25.177.1.5.1.1.2", "ifIndex": "1.3.6.1.2.1.2.2.1.1", "ifName": "1.3.6.1.2.1.31.1.1.1.1"]
]

// --- hwBgpUnnumberedPacketSendFailed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.177.1.3.62
// Fields: hwBgpProcessName, hwBgpVrfName, hwBgpPeerAddress, ifIndex, ifName
// Description: The BGP peer cannot send packets for a long time.
trapMap["1.3.6.1.4.1.2011.5.25.177.1.3.62"] = [
    name: "hwBgpUnnumberedPacketSendFailed",
    fields: ["hwBgpProcessName", "hwBgpVrfName", "hwBgpPeerAddress", "ifIndex", "ifName"],
    fieldOids: ["hwBgpProcessName": "1.3.6.1.4.1.2011.5.25.177.1.5.1.1.1", "hwBgpVrfName": "1.3.6.1.4.1.2011.5.25.177.1.2.5.1", "hwBgpPeerAddress": "1.3.6.1.4.1.2011.5.25.177.1.5.1.1.2", "ifIndex": "1.3.6.1.2.1.2.2.1.1", "ifName": "1.3.6.1.2.1.31.1.1.1.1"]
]

// --- hwBgpUnnumberedPacketSendFailedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.177.1.3.63
// Fields: hwBgpProcessName, hwBgpVrfName, hwBgpPeerAddress, ifIndex, ifName
// Description: The alarm indicating that the BGP peer cannot send packets for a long time is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.177.1.3.63"] = [
    name: "hwBgpUnnumberedPacketSendFailedClear",
    fields: ["hwBgpProcessName", "hwBgpVrfName", "hwBgpPeerAddress", "ifIndex", "ifName"],
    fieldOids: ["hwBgpProcessName": "1.3.6.1.4.1.2011.5.25.177.1.5.1.1.1", "hwBgpVrfName": "1.3.6.1.4.1.2011.5.25.177.1.2.5.1", "hwBgpPeerAddress": "1.3.6.1.4.1.2011.5.25.177.1.5.1.1.2", "ifIndex": "1.3.6.1.2.1.2.2.1.1", "ifName": "1.3.6.1.2.1.31.1.1.1.1"]
]

// --- hwBgpPeerAddrFamilyNegotiateFailed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.177.1.3.64
// Fields: hwBgpProcessName, hwBgpVrfName, hwBgpAddrFamilyAfi, hwBgpAddrFamilySafi, hwBgpPeerAddress
// Description: The address family capability of the BGP peer negotiate Failed.
trapMap["1.3.6.1.4.1.2011.5.25.177.1.3.64"] = [
    name: "hwBgpPeerAddrFamilyNegotiateFailed",
    fields: ["hwBgpProcessName", "hwBgpVrfName", "hwBgpAddrFamilyAfi", "hwBgpAddrFamilySafi", "hwBgpPeerAddress"],
    fieldOids: ["hwBgpProcessName": "1.3.6.1.4.1.2011.5.25.177.1.5.1.1.1", "hwBgpVrfName": "1.3.6.1.4.1.2011.5.25.177.1.2.5.1", "hwBgpAddrFamilyAfi": "1.3.6.1.4.1.2011.5.25.177.1.2.4.1", "hwBgpAddrFamilySafi": "1.3.6.1.4.1.2011.5.25.177.1.2.4.2", "hwBgpPeerAddress": "1.3.6.1.4.1.2011.5.25.177.1.5.1.1.2"]
]

// --- hwBgpPeerAddrFamilyNegotiateFailedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.177.1.3.65
// Fields: hwBgpProcessName, hwBgpVrfName, hwBgpAddrFamilyAfi, hwBgpAddrFamilySafi, hwBgpPeerAddress
// Description: The BGP peer relationship is successfully established.
trapMap["1.3.6.1.4.1.2011.5.25.177.1.3.65"] = [
    name: "hwBgpPeerAddrFamilyNegotiateFailedClear",
    fields: ["hwBgpProcessName", "hwBgpVrfName", "hwBgpAddrFamilyAfi", "hwBgpAddrFamilySafi", "hwBgpPeerAddress"],
    fieldOids: ["hwBgpProcessName": "1.3.6.1.4.1.2011.5.25.177.1.5.1.1.1", "hwBgpVrfName": "1.3.6.1.4.1.2011.5.25.177.1.2.5.1", "hwBgpAddrFamilyAfi": "1.3.6.1.4.1.2011.5.25.177.1.2.4.1", "hwBgpAddrFamilySafi": "1.3.6.1.4.1.2011.5.25.177.1.2.4.2", "hwBgpPeerAddress": "1.3.6.1.4.1.2011.5.25.177.1.5.1.1.2"]
]

// --- hwBgpRpkiRoaInvalidAnnounce (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.177.1.3.66
// Fields: hwBgpVrfName, hwBgpPrefixType, hwBgpPrefixAddr, hwBgpPrefixMaskLen, hwBgpRouteAs, hwBgpRoaPrefixType, hwBgpRoaPrefixAddr, hwBgpRoaMaskLen, hwBgpRoaMaxLen, hwBgpRoaAs
// Description: The route is announced by the local origin AS, but the AS is mismatch with a ROA.
trapMap["1.3.6.1.4.1.2011.5.25.177.1.3.66"] = [
    name: "hwBgpRpkiRoaInvalidAnnounce",
    fields: ["hwBgpVrfName", "hwBgpPrefixType", "hwBgpPrefixAddr", "hwBgpPrefixMaskLen", "hwBgpRouteAs", "hwBgpRoaPrefixType", "hwBgpRoaPrefixAddr", "hwBgpRoaMaskLen", "hwBgpRoaMaxLen", "hwBgpRoaAs"],
    fieldOids: ["hwBgpVrfName": "1.3.6.1.4.1.2011.5.25.177.1.2.5.1", "hwBgpPrefixType": "1.3.6.1.4.1.2011.5.25.177.1.2.7.1", "hwBgpPrefixAddr": "1.3.6.1.4.1.2011.5.25.177.1.2.7.2", "hwBgpPrefixMaskLen": "1.3.6.1.4.1.2011.5.25.177.1.2.7.3", "hwBgpRouteAs": "1.3.6.1.4.1.2011.5.25.177.1.2.7.4", "hwBgpRoaPrefixType": "1.3.6.1.4.1.2011.5.25.177.1.2.7.5", "hwBgpRoaPrefixAddr": "1.3.6.1.4.1.2011.5.25.177.1.2.7.6", "hwBgpRoaMaskLen": "1.3.6.1.4.1.2011.5.25.177.1.2.7.7", "hwBgpRoaMaxLen": "1.3.6.1.4.1.2011.5.25.177.1.2.7.8", "hwBgpRoaAs": "1.3.6.1.4.1.2011.5.25.177.1.2.7.9"]
]

// --- hwBgpRpkiRoaInvalidAnnounceClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.177.1.3.67
// Fields: hwBgpVrfName, hwBgpPrefixType, hwBgpPrefixAddr, hwBgpPrefixMaskLen, hwBgpRouteAs, hwBgpRoaPrefixType, hwBgpRoaPrefixAddr, hwBgpRoaMaskLen, hwBgpRoaMaxLen, hwBgpRoaAs
// Description: The alarm indicating that route AS mismatch ROA is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.177.1.3.67"] = [
    name: "hwBgpRpkiRoaInvalidAnnounceClear",
    fields: ["hwBgpVrfName", "hwBgpPrefixType", "hwBgpPrefixAddr", "hwBgpPrefixMaskLen", "hwBgpRouteAs", "hwBgpRoaPrefixType", "hwBgpRoaPrefixAddr", "hwBgpRoaMaskLen", "hwBgpRoaMaxLen", "hwBgpRoaAs"],
    fieldOids: ["hwBgpVrfName": "1.3.6.1.4.1.2011.5.25.177.1.2.5.1", "hwBgpPrefixType": "1.3.6.1.4.1.2011.5.25.177.1.2.7.1", "hwBgpPrefixAddr": "1.3.6.1.4.1.2011.5.25.177.1.2.7.2", "hwBgpPrefixMaskLen": "1.3.6.1.4.1.2011.5.25.177.1.2.7.3", "hwBgpRouteAs": "1.3.6.1.4.1.2011.5.25.177.1.2.7.4", "hwBgpRoaPrefixType": "1.3.6.1.4.1.2011.5.25.177.1.2.7.5", "hwBgpRoaPrefixAddr": "1.3.6.1.4.1.2011.5.25.177.1.2.7.6", "hwBgpRoaMaskLen": "1.3.6.1.4.1.2011.5.25.177.1.2.7.7", "hwBgpRoaMaxLen": "1.3.6.1.4.1.2011.5.25.177.1.2.7.8", "hwBgpRoaAs": "1.3.6.1.4.1.2011.5.25.177.1.2.7.9"]
]

// --- hwBgpSUcmpRtAdjustAlm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.177.1.3.68
// Fields: hwBgpProcessName, hwBgpVrfName, hwBgpSUcmpPolicyInstance, hwBgpSUcmpTrafDirection, hwBgpSUcmpTopoType, hwBgpSUcmpThreshold, hwBgpSUcmpCongestTopo, hwBgpSUcmpIdleTopo
// Description: The BGP peer link bandwidth utilization exceeded the threshold, triggering the S-UCMP functionality.
trapMap["1.3.6.1.4.1.2011.5.25.177.1.3.68"] = [
    name: "hwBgpSUcmpRtAdjustAlm",
    fields: ["hwBgpProcessName", "hwBgpVrfName", "hwBgpSUcmpPolicyInstance", "hwBgpSUcmpTrafDirection", "hwBgpSUcmpTopoType", "hwBgpSUcmpThreshold", "hwBgpSUcmpCongestTopo", "hwBgpSUcmpIdleTopo"],
    fieldOids: ["hwBgpProcessName": "1.3.6.1.4.1.2011.5.25.177.1.5.1.1.1", "hwBgpVrfName": "1.3.6.1.4.1.2011.5.25.177.1.2.5.1", "hwBgpSUcmpPolicyInstance": "1.3.6.1.4.1.2011.5.25.177.1.2.8.1.1", "hwBgpSUcmpTrafDirection": "1.3.6.1.4.1.2011.5.25.177.1.2.8.1.2", "hwBgpSUcmpTopoType": "1.3.6.1.4.1.2011.5.25.177.1.2.8.1.3", "hwBgpSUcmpThreshold": "1.3.6.1.4.1.2011.5.25.177.1.2.8.1.4", "hwBgpSUcmpCongestTopo": "1.3.6.1.4.1.2011.5.25.177.1.2.8.1.5", "hwBgpSUcmpIdleTopo": "1.3.6.1.4.1.2011.5.25.177.1.2.8.1.6"]
]

// --- hwBgpSUcmpRtAdjustAlmClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.177.1.3.69
// Fields: hwBgpProcessName, hwBgpVrfName, hwBgpSUcmpPolicyInstance, hwBgpSUcmpTrafDirection
// Description: The BGP peer link bandwidth utilization below the threshold, all the S-UCMP traffic scheduling policies have been revoked.
trapMap["1.3.6.1.4.1.2011.5.25.177.1.3.69"] = [
    name: "hwBgpSUcmpRtAdjustAlmClear",
    fields: ["hwBgpProcessName", "hwBgpVrfName", "hwBgpSUcmpPolicyInstance", "hwBgpSUcmpTrafDirection"],
    fieldOids: ["hwBgpProcessName": "1.3.6.1.4.1.2011.5.25.177.1.5.1.1.1", "hwBgpVrfName": "1.3.6.1.4.1.2011.5.25.177.1.2.5.1", "hwBgpSUcmpPolicyInstance": "1.3.6.1.4.1.2011.5.25.177.1.2.8.1.1", "hwBgpSUcmpTrafDirection": "1.3.6.1.4.1.2011.5.25.177.1.2.8.1.2"]
]

// --- hwBgpSUcmpRtAdjustStart (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.177.1.3.70
// Fields: hwBgpProcessName, hwBgpVrfName, hwBgpSUcmpPolicyInstance, hwBgpSUcmpTrafDirection, hwBgpSUcmpTopoType, hwBgpSUcmpThreshold, hwBgpSUcmpCongestTopo, hwBgpSUcmpIdleTopo
// Description: The BGP peer link bandwidth utilization exceeded the threshold, triggering the S-UCMP functionality.
trapMap["1.3.6.1.4.1.2011.5.25.177.1.3.70"] = [
    name: "hwBgpSUcmpRtAdjustStart",
    fields: ["hwBgpProcessName", "hwBgpVrfName", "hwBgpSUcmpPolicyInstance", "hwBgpSUcmpTrafDirection", "hwBgpSUcmpTopoType", "hwBgpSUcmpThreshold", "hwBgpSUcmpCongestTopo", "hwBgpSUcmpIdleTopo"],
    fieldOids: ["hwBgpProcessName": "1.3.6.1.4.1.2011.5.25.177.1.5.1.1.1", "hwBgpVrfName": "1.3.6.1.4.1.2011.5.25.177.1.2.5.1", "hwBgpSUcmpPolicyInstance": "1.3.6.1.4.1.2011.5.25.177.1.2.8.1.1", "hwBgpSUcmpTrafDirection": "1.3.6.1.4.1.2011.5.25.177.1.2.8.1.2", "hwBgpSUcmpTopoType": "1.3.6.1.4.1.2011.5.25.177.1.2.8.1.3", "hwBgpSUcmpThreshold": "1.3.6.1.4.1.2011.5.25.177.1.2.8.1.4", "hwBgpSUcmpCongestTopo": "1.3.6.1.4.1.2011.5.25.177.1.2.8.1.5", "hwBgpSUcmpIdleTopo": "1.3.6.1.4.1.2011.5.25.177.1.2.8.1.6"]
]

// --- hwBgpSUcmpRtAdjustEnd (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.177.1.3.71
// Fields: hwBgpProcessName, hwBgpVrfName, hwBgpSUcmpPolicyInstance, hwBgpSUcmpTrafDirection
// Description: The BGP peer link bandwidth utilization below the threshold, all the S-UCMP traffic scheduling policies have been revoked.
trapMap["1.3.6.1.4.1.2011.5.25.177.1.3.71"] = [
    name: "hwBgpSUcmpRtAdjustEnd",
    fields: ["hwBgpProcessName", "hwBgpVrfName", "hwBgpSUcmpPolicyInstance", "hwBgpSUcmpTrafDirection"],
    fieldOids: ["hwBgpProcessName": "1.3.6.1.4.1.2011.5.25.177.1.5.1.1.1", "hwBgpVrfName": "1.3.6.1.4.1.2011.5.25.177.1.2.5.1", "hwBgpSUcmpPolicyInstance": "1.3.6.1.4.1.2011.5.25.177.1.2.8.1.1", "hwBgpSUcmpTrafDirection": "1.3.6.1.4.1.2011.5.25.177.1.2.8.1.2"]
]

// --- hwTnl2VpnTrapEvent (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.177.8.1
// Fields: hwVpnId, hwVpnPublicNextHop, hwVpnTrapCkeyValue, hwTunnelReachablityEvent
// Description: This trap indicates whether the tunnel used by a VPN is reachable, If the tunnel is unreachable, a trap is sent to notify the user, hwTunnelReachablityEvent is 2. If the tunnel is reachable, a trap is...
trapMap["1.3.6.1.4.1.2011.5.25.177.8.1"] = [
    name: "hwTnl2VpnTrapEvent",
    fields: ["hwVpnId", "hwVpnPublicNextHop", "hwVpnTrapCkeyValue", "hwTunnelReachablityEvent"],
    fieldOids: ["hwVpnId": "1.3.6.1.4.1.2011.5.25.177.6.1.1.1", "hwVpnPublicNextHop": "1.3.6.1.4.1.2011.5.25.177.6.1.1.2", "hwVpnTrapCkeyValue": "1.3.6.1.4.1.2011.5.25.177.6.1.1.4", "hwTunnelReachablityEvent": "1.3.6.1.4.1.2011.5.25.177.6.1.1.3"]
]

// --- hwRpkiSessionRoaExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.177.11.2.1
// Fields: hwRpkiSessionRoaLimitNum
// Description: This notification is generated when rpki session ROA number exceed.
trapMap["1.3.6.1.4.1.2011.5.25.177.11.2.1"] = [
    name: "hwRpkiSessionRoaExceed",
    fields: ["hwRpkiSessionRoaLimitNum"],
    fieldOids: ["hwRpkiSessionRoaLimitNum": "1.3.6.1.4.1.2011.5.25.177.11.1.1.1.4"]
]

// --- hwRpkiSessionRoaExceedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.177.11.2.2
// Fields: hwRpkiSessionRoaLimitNum
// Description: This notification is generated when rpki session ROA number exceed clear.
trapMap["1.3.6.1.4.1.2011.5.25.177.11.2.2"] = [
    name: "hwRpkiSessionRoaExceedClear",
    fields: ["hwRpkiSessionRoaLimitNum"],
    fieldOids: ["hwRpkiSessionRoaLimitNum": "1.3.6.1.4.1.2011.5.25.177.11.1.1.1.4"]
]

// --- hwRpkiSessionAspaExceedLimit (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.177.11.2.3
// Fields: hwRpkiSessionAspaLimitNum
// Description: This notification is generated when rpki session ASPA number exceed limit.
trapMap["1.3.6.1.4.1.2011.5.25.177.11.2.3"] = [
    name: "hwRpkiSessionAspaExceedLimit",
    fields: ["hwRpkiSessionAspaLimitNum"],
    fieldOids: ["hwRpkiSessionAspaLimitNum": "1.3.6.1.4.1.2011.5.25.177.11.1.1.1.5"]
]

// --- hwRpkiSessionAspaExceedLimitClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.177.11.2.4
// Fields: hwRpkiSessionAspaLimitNum
// Description: This notification is generated when rpki session ASPA number exceed limit clear.
trapMap["1.3.6.1.4.1.2011.5.25.177.11.2.4"] = [
    name: "hwRpkiSessionAspaExceedLimitClear",
    fields: ["hwRpkiSessionAspaLimitNum"],
    fieldOids: ["hwRpkiSessionAspaLimitNum": "1.3.6.1.4.1.2011.5.25.177.11.1.1.1.5"]
]

// --- hwRpkiSessionASPAExceedThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.177.11.2.5
// Fields: hwRpkiSessionAspaLimitNum, hwRpkiSessionAspaLimitThreshold
// Description: This notification is generated when rpki session ASPA number exceed threshold.
trapMap["1.3.6.1.4.1.2011.5.25.177.11.2.5"] = [
    name: "hwRpkiSessionASPAExceedThreshold",
    fields: ["hwRpkiSessionAspaLimitNum", "hwRpkiSessionAspaLimitThreshold"],
    fieldOids: ["hwRpkiSessionAspaLimitNum": "1.3.6.1.4.1.2011.5.25.177.11.1.1.1.5", "hwRpkiSessionAspaLimitThreshold": "1.3.6.1.4.1.2011.5.25.177.11.1.1.1.6"]
]

// --- hwRpkiSessionASPAExceedThresholdClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.177.11.2.6
// Fields: hwRpkiSessionAspaLimitNum, hwRpkiSessionAspaLimitThreshold
// Description: This notification is generated when rpki session ASPA number exceed threshold clear.
trapMap["1.3.6.1.4.1.2011.5.25.177.11.2.6"] = [
    name: "hwRpkiSessionASPAExceedThresholdClear",
    fields: ["hwRpkiSessionAspaLimitNum", "hwRpkiSessionAspaLimitThreshold"],
    fieldOids: ["hwRpkiSessionAspaLimitNum": "1.3.6.1.4.1.2011.5.25.177.11.1.1.1.5", "hwRpkiSessionAspaLimitThreshold": "1.3.6.1.4.1.2011.5.25.177.11.1.1.1.6"]
]

// ===== Parsing logic =====

// Set to true to enable diagnostic logging for this MIB parser
DEBUG = false

LOG_PREFIX = "[HUAWEI-BGP-VPN-MIB]"
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
