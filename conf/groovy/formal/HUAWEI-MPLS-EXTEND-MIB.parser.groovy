/**
 * Auto-generated from HUAWEI-MPLS-EXTEND-MIB.mib
 * Generated: 2026-08-24T18:28:30.376634800
 * Traps/Notifications (154): hwMplsStaticLspUp, hwMplsStaticLspDown, hwMplsStaticCRLspUp, hwMplsStaticCRLspDown, hwMplsTeFrrProtAval, hwMplsTeFrrProtNotAval, hwMplsTeFrrSwitch, hwMplsTeFrrResume, hwMplsTunnelHSBSwitch, hwMplsTunnelHSBResume, hwMplsTunnelOBSwitch, hwMplsTunnelOBResume, hwMplsTunnelUp, hwMplsTunnelDown, hwMplsTunnelChangeBw, hwMplsTunnelTpOamLossSD, hwMplsOamSDRecovery, hwMplsOamLoss, hwMplsOamLossRecovery, hwMplsOamAis, hwMplsOamAisRecovery, hwMplsOamRdi, hwMplsOamRdiRecovery, hwMplsOamMeg, hwMplsOamMegRecovery, hwMplsOamMep, hwMplsOamMepRecovery, hwMplsOamSF, hwMplsOamSFRecovery, hwMplsOamPeriod, hwMplsOamPeriodRecovery, hwMplsOamLck, hwMplsOamLckRecovery, hwMplsOamExcess, hwMplsOamExcessRecovery, hwMplsOamMisMatch, hwMplsOamMisMatchRecovery, hwMplsOamMisMerge, hwMplsOamMisMergeRecovery, hwMplsOamUnknown, hwMplsOamUnknownRecovery, hwMplsOamBDI, hwMplsOamBDIRecovery, hwMplsOamFail, hwMplsOamFailRecovery, hwMplsTunnelPrimaryUp, hwMplsTunnelPrimaryDown, hwMplsTunnelHotstandbyUp, hwMplsTunnelHotstandbyDown, hwMplsTunnelOrdinaryUp, hwMplsTunnelOrdinaryDown, hwMplsTunnelBesteffortUp, hwMplsTunnelBesteffortDown, hwMplsTeAutoTunnelDownClear, hwMplsTeAutoTunnelPrimaryDownClear, hwMplsTunnelBBSwitch, hwMplsTunnelBBResume, hwMplsExtTunnelDown, hwMplsExtTunnelDownClear, hwMplsOamLocalLock, hwMplsOamLocalLockRecovery, hwMplsTunnelDelete, hwMplsLspThresholdExceed, hwMplsLspThresholdExceedClear, hwMplsLspTotalCountExceed, hwMplsLspTotalCountExceedClear, hwMplsDynamicLabelThresholdExceed, hwMplsDynamicLabelThresholdExceedClear, hwMplsDynamicLabelTotalCountExceed, hwMplsDynamicLabelTotalCountExceedClear, hwMplsResourceThresholdExceed, hwMplsResourceThresholdExceedClear, hwMplsResourceTotalCountExceed, hwMplsResourceTotalCountExceedClear, hwMplsLspLoopBack, hwMplsLspLoopBackClear, hwMplsTunnelCommitLost, hwMplsTunnelCommitLostClear, hwMplsTunnelHotstandbySwitch, hwMplsTunnelHotstandbyResume, hwMplsTunnelBfdPathMismatch, hwMplsTunnelBfdPathMismatchClear, hwMplsTeLspBfdDown, hwMplsTeLspBfdDownClear, hwMplsTunnelDelegationReturn, hwMplsTunnelDelegationReturnClear, hwMplsOamFDI, hwMplsOamFDIRecovery, hwP2mpTeTunnelDown, hwP2mpTeTunnelDownClear, hwP2mpTeSubLspDown, hwBlockLabelThresholdExceed, hwBlockLabelThresholdExceedClear, hwBlockLabelTotalCountExceed, hwBlockLabelTotalCountExceedClear, hwMplsInsecureAlgorithm, hwMplsInsecureAlgorithmClear, hwMplsSlotResTotalCountExceed, hwMplsSlotResTotalCountExceedClear, hwP2mpTeSubLspDownAlarm, hwP2mpTeSubLspDownAlarmClear, hwMplsTeBandwidthExceed, hwMplsTeBandwidthExceedClear, hwMplsTunnelFrrConfigChange, hwMplsRingSwitch, hwMplsRingResume, hwMplsRingWestOamLoss, hwMplsRingWestOamLossClear, hwMplsRingEastOamLoss, hwMplsRingEastOamLossClear, hwMplsRingWestOamRDI, hwMplsRingWestOamRDIClear, hwMplsRingEastOamRDI, hwMplsRingEastOamRDIClear, hwMplsRingWestOamUnexpectedMEG, hwMplsRingWestOamUnexpectedMEGClear, hwMplsRingEastOamUnexpectedMEG, hwMplsRingEastOamUnexpectedMEGClear, hwMplsRingWestOamUnexpectedPeriod, hwMplsRingWestOamUnexpectedPeriodClear, hwMplsRingEastOamUnexpectedPeriod, hwMplsRingEastOamUnexpectedPeriodClear, hwMplsRingWestOamExcess, hwMplsRingWestOamExcessClear, hwMplsRingEastOamExcess, hwMplsRingEastOamExcessClear, hwMplsRingWestOamSD, hwMplsRingWestOamSDClear, hwMplsRingEastOamSD, hwMplsRingEastOamSDClear, hwMplsRingWestOamSF, hwMplsRingWestOamSFClear, hwMplsRingEastOamSF, hwMplsRingEastOamSFClear, hwMplsRingWestAPSSwitch, hwMplsRingWestAPSResume, hwMplsRingEastAPSSwitch, hwMplsRingEastAPSResume, hwMplsRingWestAPSSwitchFail, hwMplsRingWestAPSSwitchFailClear, hwMplsRingEastAPSSwitchFail, hwMplsRingEastAPSSwitchFailClear, hwMplsRingWestAPSLost, hwMplsRingWestAPSLostClear, hwMplsRingEastAPSLost, hwMplsRingEastAPSLostClear, hwMplsRingWestAPSMismatch, hwMplsRingWestAPSMismatchClear, hwMplsRingEastAPSMismatch, hwMplsRingEastAPSMismatchClear, hwMplsRingWestOamUnexpectedMEP, hwMplsRingWestOamUnexpectedMEPClear, hwMplsRingEastOamUnexpectedMEP, hwMplsRingEastOamUnexpectedMEPClear
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

// --- hwMplsStaticLspUp (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.2.1.1
// Fields: hwStaticLspName, hwStaticLspStatus, ifName, hwStaticLspInIfIndex, hwStaticLspInIfName, hwStaticLspDownReason
// Description: This notification indicates that the status of referred static LSP changes to Up.
trapMap["1.3.6.1.4.1.2011.5.25.121.2.1.1"] = [
    name: "hwMplsStaticLspUp",
    fields: ["hwStaticLspName", "hwStaticLspStatus", "ifName", "hwStaticLspInIfIndex", "hwStaticLspInIfName", "hwStaticLspDownReason"],
    fieldOids: ["hwStaticLspName": "1.3.6.1.4.1.2011.5.25.121.1.5.1.5", "hwStaticLspStatus": "1.3.6.1.4.1.2011.5.25.121.1.5.1.6", "ifName": "1.3.6.1.2.1.31.1.1.1.1", "hwStaticLspInIfIndex": "1.3.6.1.4.1.2011.5.25.121.1.11", "hwStaticLspInIfName": "1.3.6.1.4.1.2011.5.25.121.1.12", "hwStaticLspDownReason": "1.3.6.1.4.1.2011.5.25.121.1.13"]
]

// --- hwMplsStaticLspDown (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.2.1.2
// Fields: hwStaticLspName, hwStaticLspStatus, ifName, hwStaticLspInIfIndex, hwStaticLspInIfName, hwStaticLspDownReason
// Description: This notification indicates that the status of referred static LSP changes to Down.
trapMap["1.3.6.1.4.1.2011.5.25.121.2.1.2"] = [
    name: "hwMplsStaticLspDown",
    fields: ["hwStaticLspName", "hwStaticLspStatus", "ifName", "hwStaticLspInIfIndex", "hwStaticLspInIfName", "hwStaticLspDownReason"],
    fieldOids: ["hwStaticLspName": "1.3.6.1.4.1.2011.5.25.121.1.5.1.5", "hwStaticLspStatus": "1.3.6.1.4.1.2011.5.25.121.1.5.1.6", "ifName": "1.3.6.1.2.1.31.1.1.1.1", "hwStaticLspInIfIndex": "1.3.6.1.4.1.2011.5.25.121.1.11", "hwStaticLspInIfName": "1.3.6.1.4.1.2011.5.25.121.1.12", "hwStaticLspDownReason": "1.3.6.1.4.1.2011.5.25.121.1.13"]
]

// --- hwMplsStaticCRLspUp (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.2.1.3
// Fields: hwStaticLspName, hwStaticLspStatus, ifName, hwStaticLspInIfIndex, hwStaticLspInIfName, hwStaticLspDownReason
// Description: This notification indicates that the status of referred static CR-LSP changes to Up.
trapMap["1.3.6.1.4.1.2011.5.25.121.2.1.3"] = [
    name: "hwMplsStaticCRLspUp",
    fields: ["hwStaticLspName", "hwStaticLspStatus", "ifName", "hwStaticLspInIfIndex", "hwStaticLspInIfName", "hwStaticLspDownReason"],
    fieldOids: ["hwStaticLspName": "1.3.6.1.4.1.2011.5.25.121.1.5.1.5", "hwStaticLspStatus": "1.3.6.1.4.1.2011.5.25.121.1.5.1.6", "ifName": "1.3.6.1.2.1.31.1.1.1.1", "hwStaticLspInIfIndex": "1.3.6.1.4.1.2011.5.25.121.1.11", "hwStaticLspInIfName": "1.3.6.1.4.1.2011.5.25.121.1.12", "hwStaticLspDownReason": "1.3.6.1.4.1.2011.5.25.121.1.13"]
]

// --- hwMplsStaticCRLspDown (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.2.1.4
// Fields: hwStaticLspName, hwStaticLspStatus, ifName, hwStaticLspInIfIndex, hwStaticLspInIfName, hwStaticLspDownReason
// Description: This notification indicates that the status of referred static CR-LSP changes to Down.
trapMap["1.3.6.1.4.1.2011.5.25.121.2.1.4"] = [
    name: "hwMplsStaticCRLspDown",
    fields: ["hwStaticLspName", "hwStaticLspStatus", "ifName", "hwStaticLspInIfIndex", "hwStaticLspInIfName", "hwStaticLspDownReason"],
    fieldOids: ["hwStaticLspName": "1.3.6.1.4.1.2011.5.25.121.1.5.1.5", "hwStaticLspStatus": "1.3.6.1.4.1.2011.5.25.121.1.5.1.6", "ifName": "1.3.6.1.2.1.31.1.1.1.1", "hwStaticLspInIfIndex": "1.3.6.1.4.1.2011.5.25.121.1.11", "hwStaticLspInIfName": "1.3.6.1.4.1.2011.5.25.121.1.12", "hwStaticLspDownReason": "1.3.6.1.4.1.2011.5.25.121.1.13"]
]

// --- hwMplsTeFrrProtAval (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.2.1.5
// Fields: hwTunnelFrrRouteDBBypassIfIndex, hwTunnelFrrRouteDBInnerLabel
// Description: This notification indicates that the primary tunnel is bound to TE FRR bypass tunnel.
trapMap["1.3.6.1.4.1.2011.5.25.121.2.1.5"] = [
    name: "hwMplsTeFrrProtAval",
    fields: ["hwTunnelFrrRouteDBBypassIfIndex", "hwTunnelFrrRouteDBInnerLabel"],
    fieldOids: ["hwTunnelFrrRouteDBBypassIfIndex": "1.3.6.1.4.1.2011.5.25.121.1.4.1.5", "hwTunnelFrrRouteDBInnerLabel": "1.3.6.1.4.1.2011.5.25.121.1.4.1.6"]
]

// --- hwMplsTeFrrProtNotAval (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.2.1.6
// Fields: hwTunnelFrrRouteDBBypassIfIndex
// Description: This notification indicates that the primary tunnel is unbound to bypass tunnel.
trapMap["1.3.6.1.4.1.2011.5.25.121.2.1.6"] = [
    name: "hwMplsTeFrrProtNotAval",
    fields: ["hwTunnelFrrRouteDBBypassIfIndex"],
    fieldOids: ["hwTunnelFrrRouteDBBypassIfIndex": "1.3.6.1.4.1.2011.5.25.121.1.4.1.5"]
]

// --- hwMplsTeFrrSwitch (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.2.1.7
// Fields: hwMplsTunnelAdminStatus, hwMplsTunnelOperStatus, hwMplsSessionTunnelId, hwMplsLocalLspId, hwMplsIngressLsrId, hwMplsEgressLsrId
// Description: This notification indicates that the primary tunnel is switches to the TE FRR bypass tunnel.
trapMap["1.3.6.1.4.1.2011.5.25.121.2.1.7"] = [
    name: "hwMplsTeFrrSwitch",
    fields: ["hwMplsTunnelAdminStatus", "hwMplsTunnelOperStatus", "hwMplsSessionTunnelId", "hwMplsLocalLspId", "hwMplsIngressLsrId", "hwMplsEgressLsrId"],
    fieldOids: ["hwMplsTunnelAdminStatus": "1.3.6.1.4.1.2011.5.25.121.1.1.1.7", "hwMplsTunnelOperStatus": "1.3.6.1.4.1.2011.5.25.121.1.1.1.8", "hwMplsSessionTunnelId": "1.3.6.1.4.1.2011.5.25.121.2.2.15", "hwMplsLocalLspId": "1.3.6.1.4.1.2011.5.25.121.2.2.16", "hwMplsIngressLsrId": "1.3.6.1.4.1.2011.5.25.121.2.2.17", "hwMplsEgressLsrId": "1.3.6.1.4.1.2011.5.25.121.2.2.18"]
]

// --- hwMplsTeFrrResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.2.1.8
// Fields: hwMplsTunnelAdminStatus, hwMplsTunnelOperStatus
// Description: This notification indicates that the primary tunnel is switched back from the TE FRR bypass tunnel.
trapMap["1.3.6.1.4.1.2011.5.25.121.2.1.8"] = [
    name: "hwMplsTeFrrResume",
    fields: ["hwMplsTunnelAdminStatus", "hwMplsTunnelOperStatus"],
    fieldOids: ["hwMplsTunnelAdminStatus": "1.3.6.1.4.1.2011.5.25.121.1.1.1.7", "hwMplsTunnelOperStatus": "1.3.6.1.4.1.2011.5.25.121.1.1.1.8"]
]

// --- hwMplsTunnelHSBSwitch (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.2.1.9
// Fields: hwMplsTunnelAdminStatus, hwMplsTunnelOperStatus
// Description: This notification indicates that the data is switched from the primary CR-LSP to the HSB CR-LSP.
trapMap["1.3.6.1.4.1.2011.5.25.121.2.1.9"] = [
    name: "hwMplsTunnelHSBSwitch",
    fields: ["hwMplsTunnelAdminStatus", "hwMplsTunnelOperStatus"],
    fieldOids: ["hwMplsTunnelAdminStatus": "1.3.6.1.4.1.2011.5.25.121.1.1.1.7", "hwMplsTunnelOperStatus": "1.3.6.1.4.1.2011.5.25.121.1.1.1.8"]
]

// --- hwMplsTunnelHSBResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.2.1.10
// Fields: hwMplsTunnelAdminStatus, hwMplsTunnelOperStatus
// Description: This notification indicates that the data is switched from the HSB CR-LSP to the primary CR-LSP.
trapMap["1.3.6.1.4.1.2011.5.25.121.2.1.10"] = [
    name: "hwMplsTunnelHSBResume",
    fields: ["hwMplsTunnelAdminStatus", "hwMplsTunnelOperStatus"],
    fieldOids: ["hwMplsTunnelAdminStatus": "1.3.6.1.4.1.2011.5.25.121.1.1.1.7", "hwMplsTunnelOperStatus": "1.3.6.1.4.1.2011.5.25.121.1.1.1.8"]
]

// --- hwMplsTunnelOBSwitch (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.2.1.11
// Fields: hwMplsTunnelAdminStatus, hwMplsTunnelOperStatus
// Description: This notification indicates that the primary CR-LSP is down and the Ordinary backup CR-LSP is up.
trapMap["1.3.6.1.4.1.2011.5.25.121.2.1.11"] = [
    name: "hwMplsTunnelOBSwitch",
    fields: ["hwMplsTunnelAdminStatus", "hwMplsTunnelOperStatus"],
    fieldOids: ["hwMplsTunnelAdminStatus": "1.3.6.1.4.1.2011.5.25.121.1.1.1.7", "hwMplsTunnelOperStatus": "1.3.6.1.4.1.2011.5.25.121.1.1.1.8"]
]

// --- hwMplsTunnelOBResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.2.1.12
// Fields: hwMplsTunnelAdminStatus, hwMplsTunnelOperStatus
// Description: This notification indicates that the data is switched from the Ordinary backup CR-LSP to the primary CR-LSP.
trapMap["1.3.6.1.4.1.2011.5.25.121.2.1.12"] = [
    name: "hwMplsTunnelOBResume",
    fields: ["hwMplsTunnelAdminStatus", "hwMplsTunnelOperStatus"],
    fieldOids: ["hwMplsTunnelAdminStatus": "1.3.6.1.4.1.2011.5.25.121.1.1.1.7", "hwMplsTunnelOperStatus": "1.3.6.1.4.1.2011.5.25.121.1.1.1.8"]
]

// --- hwMplsTunnelUp (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.2.1.13
// Fields: hwMplsTunnelInterfaceName, hwMplsTunnelAdminStatus, hwMplsTunnelOperStatus
// Description: The hwMplsTunnelUp trap indicates that the staus of the tunnel changes into Up.
trapMap["1.3.6.1.4.1.2011.5.25.121.2.1.13"] = [
    name: "hwMplsTunnelUp",
    fields: ["hwMplsTunnelInterfaceName", "hwMplsTunnelAdminStatus", "hwMplsTunnelOperStatus"],
    fieldOids: ["hwMplsTunnelInterfaceName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.29", "hwMplsTunnelAdminStatus": "1.3.6.1.4.1.2011.5.25.121.1.1.1.7", "hwMplsTunnelOperStatus": "1.3.6.1.4.1.2011.5.25.121.1.1.1.8"]
]

// --- hwMplsTunnelDown (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.2.1.14
// Fields: hwMplsTunnelInterfaceName, hwMplsTunnelAdminStatus, hwMplsTunnelOperStatus
// Description: The hwMplsTunnelDown trap indicates that the staus of the tunnel changes into Down.
trapMap["1.3.6.1.4.1.2011.5.25.121.2.1.14"] = [
    name: "hwMplsTunnelDown",
    fields: ["hwMplsTunnelInterfaceName", "hwMplsTunnelAdminStatus", "hwMplsTunnelOperStatus"],
    fieldOids: ["hwMplsTunnelInterfaceName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.29", "hwMplsTunnelAdminStatus": "1.3.6.1.4.1.2011.5.25.121.1.1.1.7", "hwMplsTunnelOperStatus": "1.3.6.1.4.1.2011.5.25.121.1.1.1.8"]
]

// --- hwMplsTunnelChangeBw (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.2.1.15
// Fields: hwMplsTunnelInterfaceName, hwMplsTunnelIfIndex, hwMplsTunnelPreBandwidth, hwMplsTunnelNextBandwidth
// Description: This notification indicates that the bandwidth of the tunnel is changed.
trapMap["1.3.6.1.4.1.2011.5.25.121.2.1.15"] = [
    name: "hwMplsTunnelChangeBw",
    fields: ["hwMplsTunnelInterfaceName", "hwMplsTunnelIfIndex", "hwMplsTunnelPreBandwidth", "hwMplsTunnelNextBandwidth"],
    fieldOids: ["hwMplsTunnelInterfaceName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.29", "hwMplsTunnelIfIndex": "1.3.6.1.4.1.2011.5.25.121.1.1.1.17", "hwMplsTunnelPreBandwidth": "1.3.6.1.4.1.2011.5.25.121.1.1.1.18", "hwMplsTunnelNextBandwidth": "1.3.6.1.4.1.2011.5.25.121.1.1.1.19"]
]

// --- hwMplsTunnelTpOamLossSD (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.2.1.16
// Fields: hwMplsTunnelInterfaceName, hwMplsTunnelSignalProto, hwMplsTunnelSignalledTunnelName
// Description: This object indicates that the loss ratio of the packets carried by the tunnel exceeded the first threshold.
trapMap["1.3.6.1.4.1.2011.5.25.121.2.1.16"] = [
    name: "hwMplsTunnelTpOamLossSD",
    fields: ["hwMplsTunnelInterfaceName", "hwMplsTunnelSignalProto", "hwMplsTunnelSignalledTunnelName"],
    fieldOids: ["hwMplsTunnelInterfaceName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.29", "hwMplsTunnelSignalProto": "1.3.6.1.4.1.2011.5.25.121.1.1.1.30", "hwMplsTunnelSignalledTunnelName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.33"]
]

// --- hwMplsOamSDRecovery (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.2.1.17
// Fields: hwMplsTunnelInterfaceName, hwMplsTunnelSignalProto, hwMplsTunnelSignalledTunnelName
// Description: This object indicates that the loss ratio of the packets carried by the tunnel dropped below the first threshold.
trapMap["1.3.6.1.4.1.2011.5.25.121.2.1.17"] = [
    name: "hwMplsOamSDRecovery",
    fields: ["hwMplsTunnelInterfaceName", "hwMplsTunnelSignalProto", "hwMplsTunnelSignalledTunnelName"],
    fieldOids: ["hwMplsTunnelInterfaceName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.29", "hwMplsTunnelSignalProto": "1.3.6.1.4.1.2011.5.25.121.1.1.1.30", "hwMplsTunnelSignalledTunnelName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.33"]
]

// --- hwMplsOamLoss (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.2.1.18
// Fields: hwMplsTunnelInterfaceName, hwMplsTunnelSignalProto, ifName, hwMplsTunnelSignalledTunnelName, hwMplsBackwardTunnelName
// Description: This object indicates that TP OAM detected tunnel connectivity faults.
trapMap["1.3.6.1.4.1.2011.5.25.121.2.1.18"] = [
    name: "hwMplsOamLoss",
    fields: ["hwMplsTunnelInterfaceName", "hwMplsTunnelSignalProto", "ifName", "hwMplsTunnelSignalledTunnelName", "hwMplsBackwardTunnelName"],
    fieldOids: ["hwMplsTunnelInterfaceName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.29", "hwMplsTunnelSignalProto": "1.3.6.1.4.1.2011.5.25.121.1.1.1.30", "ifName": "1.3.6.1.2.1.31.1.1.1.1", "hwMplsTunnelSignalledTunnelName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.33", "hwMplsBackwardTunnelName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.34"]
]

// --- hwMplsOamLossRecovery (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.2.1.19
// Fields: hwMplsTunnelInterfaceName, hwMplsTunnelSignalProto, hwMplsTunnelSignalledTunnelName, hwMplsBackwardTunnelName
// Description: This object indicates that TP OAM did not detect tunnel connectivity faults.
trapMap["1.3.6.1.4.1.2011.5.25.121.2.1.19"] = [
    name: "hwMplsOamLossRecovery",
    fields: ["hwMplsTunnelInterfaceName", "hwMplsTunnelSignalProto", "hwMplsTunnelSignalledTunnelName", "hwMplsBackwardTunnelName"],
    fieldOids: ["hwMplsTunnelInterfaceName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.29", "hwMplsTunnelSignalProto": "1.3.6.1.4.1.2011.5.25.121.1.1.1.30", "hwMplsTunnelSignalledTunnelName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.33", "hwMplsBackwardTunnelName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.34"]
]

// --- hwMplsOamAis (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.2.1.20
// Fields: hwMplsTunnelInterfaceName, hwMplsTunnelSignalProto, hwMplsTunnelSignalledTunnelName
// Description: This object indicates that TP OAM detected an alarm indication signal.
trapMap["1.3.6.1.4.1.2011.5.25.121.2.1.20"] = [
    name: "hwMplsOamAis",
    fields: ["hwMplsTunnelInterfaceName", "hwMplsTunnelSignalProto", "hwMplsTunnelSignalledTunnelName"],
    fieldOids: ["hwMplsTunnelInterfaceName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.29", "hwMplsTunnelSignalProto": "1.3.6.1.4.1.2011.5.25.121.1.1.1.30", "hwMplsTunnelSignalledTunnelName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.33"]
]

// --- hwMplsOamAisRecovery (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.2.1.21
// Fields: hwMplsTunnelInterfaceName, hwMplsTunnelSignalProto, hwMplsTunnelSignalledTunnelName
// Description: This object indicates that TP OAM no longer detected alarm indication signals.
trapMap["1.3.6.1.4.1.2011.5.25.121.2.1.21"] = [
    name: "hwMplsOamAisRecovery",
    fields: ["hwMplsTunnelInterfaceName", "hwMplsTunnelSignalProto", "hwMplsTunnelSignalledTunnelName"],
    fieldOids: ["hwMplsTunnelInterfaceName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.29", "hwMplsTunnelSignalProto": "1.3.6.1.4.1.2011.5.25.121.1.1.1.30", "hwMplsTunnelSignalledTunnelName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.33"]
]

// --- hwMplsOamRdi (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.2.1.22
// Fields: hwMplsTunnelInterfaceName, hwMplsTunnelSignalProto, ifName, hwMplsTunnelSignalledTunnelName
// Description: This object indicates that TP OAM detected remote defects.
trapMap["1.3.6.1.4.1.2011.5.25.121.2.1.22"] = [
    name: "hwMplsOamRdi",
    fields: ["hwMplsTunnelInterfaceName", "hwMplsTunnelSignalProto", "ifName", "hwMplsTunnelSignalledTunnelName"],
    fieldOids: ["hwMplsTunnelInterfaceName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.29", "hwMplsTunnelSignalProto": "1.3.6.1.4.1.2011.5.25.121.1.1.1.30", "ifName": "1.3.6.1.2.1.31.1.1.1.1", "hwMplsTunnelSignalledTunnelName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.33"]
]

// --- hwMplsOamRdiRecovery (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.2.1.23
// Fields: hwMplsTunnelInterfaceName, hwMplsTunnelSignalProto, hwMplsTunnelSignalledTunnelName
// Description: This object indicates that the remote defects detected by TP OAM were removed.
trapMap["1.3.6.1.4.1.2011.5.25.121.2.1.23"] = [
    name: "hwMplsOamRdiRecovery",
    fields: ["hwMplsTunnelInterfaceName", "hwMplsTunnelSignalProto", "hwMplsTunnelSignalledTunnelName"],
    fieldOids: ["hwMplsTunnelInterfaceName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.29", "hwMplsTunnelSignalProto": "1.3.6.1.4.1.2011.5.25.121.1.1.1.30", "hwMplsTunnelSignalledTunnelName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.33"]
]

// --- hwMplsOamMeg (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.2.1.24
// Fields: hwMplsTunnelInterfaceName, hwMplsTunnelSignalProto, hwMplsTunnelSignalledTunnelName
// Description: This object indicates that the names configured on the two ends of the tunnel are inconsistent.
trapMap["1.3.6.1.4.1.2011.5.25.121.2.1.24"] = [
    name: "hwMplsOamMeg",
    fields: ["hwMplsTunnelInterfaceName", "hwMplsTunnelSignalProto", "hwMplsTunnelSignalledTunnelName"],
    fieldOids: ["hwMplsTunnelInterfaceName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.29", "hwMplsTunnelSignalProto": "1.3.6.1.4.1.2011.5.25.121.1.1.1.30", "hwMplsTunnelSignalledTunnelName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.33"]
]

// --- hwMplsOamMegRecovery (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.2.1.25
// Fields: hwMplsTunnelInterfaceName, hwMplsTunnelSignalProto, hwMplsTunnelSignalledTunnelName
// Description: This object indicates that the names configured on the two ends of the tunnel now are consistent.
trapMap["1.3.6.1.4.1.2011.5.25.121.2.1.25"] = [
    name: "hwMplsOamMegRecovery",
    fields: ["hwMplsTunnelInterfaceName", "hwMplsTunnelSignalProto", "hwMplsTunnelSignalledTunnelName"],
    fieldOids: ["hwMplsTunnelInterfaceName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.29", "hwMplsTunnelSignalProto": "1.3.6.1.4.1.2011.5.25.121.1.1.1.30", "hwMplsTunnelSignalledTunnelName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.33"]
]

// --- hwMplsOamMep (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.2.1.26
// Fields: hwMplsTunnelInterfaceName, hwMplsTunnelSignalProto
// Description: This object indicates that the MEP-IDs configured on the two ends of the tunnel are inconsistent.
trapMap["1.3.6.1.4.1.2011.5.25.121.2.1.26"] = [
    name: "hwMplsOamMep",
    fields: ["hwMplsTunnelInterfaceName", "hwMplsTunnelSignalProto"],
    fieldOids: ["hwMplsTunnelInterfaceName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.29", "hwMplsTunnelSignalProto": "1.3.6.1.4.1.2011.5.25.121.1.1.1.30"]
]

// --- hwMplsOamMepRecovery (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.2.1.27
// Fields: hwMplsTunnelInterfaceName, hwMplsTunnelSignalProto
// Description: This object indicates that the MEP-IDs configured on the two ends of the tunnel now are consistent.
trapMap["1.3.6.1.4.1.2011.5.25.121.2.1.27"] = [
    name: "hwMplsOamMepRecovery",
    fields: ["hwMplsTunnelInterfaceName", "hwMplsTunnelSignalProto"],
    fieldOids: ["hwMplsTunnelInterfaceName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.29", "hwMplsTunnelSignalProto": "1.3.6.1.4.1.2011.5.25.121.1.1.1.30"]
]

// --- hwMplsOamSF (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.2.1.28
// Fields: hwMplsTunnelInterfaceName, hwMplsTunnelSignalProto, hwMplsTunnelSignalledTunnelName
// Description: This object indicates that the loss ratio of the packets carried by the tunnel exceeded the second threshold in the local link.
trapMap["1.3.6.1.4.1.2011.5.25.121.2.1.28"] = [
    name: "hwMplsOamSF",
    fields: ["hwMplsTunnelInterfaceName", "hwMplsTunnelSignalProto", "hwMplsTunnelSignalledTunnelName"],
    fieldOids: ["hwMplsTunnelInterfaceName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.29", "hwMplsTunnelSignalProto": "1.3.6.1.4.1.2011.5.25.121.1.1.1.30", "hwMplsTunnelSignalledTunnelName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.33"]
]

// --- hwMplsOamSFRecovery (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.2.1.29
// Fields: hwMplsTunnelInterfaceName, hwMplsTunnelSignalProto, hwMplsTunnelSignalledTunnelName
// Description: This object indicates that the loss ratio of the packets carried by the tunnel dropped below the second threshold in the local link.
trapMap["1.3.6.1.4.1.2011.5.25.121.2.1.29"] = [
    name: "hwMplsOamSFRecovery",
    fields: ["hwMplsTunnelInterfaceName", "hwMplsTunnelSignalProto", "hwMplsTunnelSignalledTunnelName"],
    fieldOids: ["hwMplsTunnelInterfaceName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.29", "hwMplsTunnelSignalProto": "1.3.6.1.4.1.2011.5.25.121.1.1.1.30", "hwMplsTunnelSignalledTunnelName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.33"]
]

// --- hwMplsOamPeriod (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.2.1.30
// Fields: hwMplsTunnelInterfaceName, hwMplsTunnelSignalProto, hwMplsTunnelSignalledTunnelName
// Description: This object indicates that the TP OAM detection periods on the two ends of the tunnel are inconsistent.
trapMap["1.3.6.1.4.1.2011.5.25.121.2.1.30"] = [
    name: "hwMplsOamPeriod",
    fields: ["hwMplsTunnelInterfaceName", "hwMplsTunnelSignalProto", "hwMplsTunnelSignalledTunnelName"],
    fieldOids: ["hwMplsTunnelInterfaceName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.29", "hwMplsTunnelSignalProto": "1.3.6.1.4.1.2011.5.25.121.1.1.1.30", "hwMplsTunnelSignalledTunnelName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.33"]
]

// --- hwMplsOamPeriodRecovery (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.2.1.31
// Fields: hwMplsTunnelInterfaceName, hwMplsTunnelSignalProto, hwMplsTunnelSignalledTunnelName
// Description: This object indicates that the TP OAM detection periods on the two ends of the tunnel now are consistent.
trapMap["1.3.6.1.4.1.2011.5.25.121.2.1.31"] = [
    name: "hwMplsOamPeriodRecovery",
    fields: ["hwMplsTunnelInterfaceName", "hwMplsTunnelSignalProto", "hwMplsTunnelSignalledTunnelName"],
    fieldOids: ["hwMplsTunnelInterfaceName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.29", "hwMplsTunnelSignalProto": "1.3.6.1.4.1.2011.5.25.121.1.1.1.30", "hwMplsTunnelSignalledTunnelName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.33"]
]

// --- hwMplsOamLck (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.2.1.32
// Fields: hwMplsTunnelInterfaceName, hwMplsTunnelSignalProto, hwMplsTunnelSignalledTunnelName
// Description: This object indicates that TP OAM detected the service level of the tunnel has been locked.
trapMap["1.3.6.1.4.1.2011.5.25.121.2.1.32"] = [
    name: "hwMplsOamLck",
    fields: ["hwMplsTunnelInterfaceName", "hwMplsTunnelSignalProto", "hwMplsTunnelSignalledTunnelName"],
    fieldOids: ["hwMplsTunnelInterfaceName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.29", "hwMplsTunnelSignalProto": "1.3.6.1.4.1.2011.5.25.121.1.1.1.30", "hwMplsTunnelSignalledTunnelName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.33"]
]

// --- hwMplsOamLckRecovery (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.2.1.33
// Fields: hwMplsTunnelInterfaceName, hwMplsTunnelSignalProto, hwMplsTunnelSignalledTunnelName
// Description: This object indicates that TP OAM detected the service level of the tunnel has not been locked.
trapMap["1.3.6.1.4.1.2011.5.25.121.2.1.33"] = [
    name: "hwMplsOamLckRecovery",
    fields: ["hwMplsTunnelInterfaceName", "hwMplsTunnelSignalProto", "hwMplsTunnelSignalledTunnelName"],
    fieldOids: ["hwMplsTunnelInterfaceName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.29", "hwMplsTunnelSignalProto": "1.3.6.1.4.1.2011.5.25.121.1.1.1.30", "hwMplsTunnelSignalledTunnelName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.33"]
]

// --- hwMplsOamExcess (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.2.1.34
// Fields: hwMplsTunnelInterfaceName, hwMplsTunnelSignalProto, hwMplsTunnelSignalledTunnelName
// Description: This object indicates that MPLS OAM detected the tunnel received excess alarm.
trapMap["1.3.6.1.4.1.2011.5.25.121.2.1.34"] = [
    name: "hwMplsOamExcess",
    fields: ["hwMplsTunnelInterfaceName", "hwMplsTunnelSignalProto", "hwMplsTunnelSignalledTunnelName"],
    fieldOids: ["hwMplsTunnelInterfaceName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.29", "hwMplsTunnelSignalProto": "1.3.6.1.4.1.2011.5.25.121.1.1.1.30", "hwMplsTunnelSignalledTunnelName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.33"]
]

// --- hwMplsOamExcessRecovery (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.2.1.35
// Fields: hwMplsTunnelInterfaceName, hwMplsTunnelSignalProto, hwMplsTunnelSignalledTunnelName
// Description: This object indicates that MPLS OAM detected the tunnel received excess alarm end.
trapMap["1.3.6.1.4.1.2011.5.25.121.2.1.35"] = [
    name: "hwMplsOamExcessRecovery",
    fields: ["hwMplsTunnelInterfaceName", "hwMplsTunnelSignalProto", "hwMplsTunnelSignalledTunnelName"],
    fieldOids: ["hwMplsTunnelInterfaceName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.29", "hwMplsTunnelSignalProto": "1.3.6.1.4.1.2011.5.25.121.1.1.1.30", "hwMplsTunnelSignalledTunnelName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.33"]
]

// --- hwMplsOamMisMatch (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.2.1.36
// Fields: hwMplsTunnelInterfaceName, hwMplsTunnelSignalProto, hwMplsTunnelSignalledTunnelName
// Description: This object indicates that MPLS OAM detected the tunnel received MisMatch alarm.
trapMap["1.3.6.1.4.1.2011.5.25.121.2.1.36"] = [
    name: "hwMplsOamMisMatch",
    fields: ["hwMplsTunnelInterfaceName", "hwMplsTunnelSignalProto", "hwMplsTunnelSignalledTunnelName"],
    fieldOids: ["hwMplsTunnelInterfaceName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.29", "hwMplsTunnelSignalProto": "1.3.6.1.4.1.2011.5.25.121.1.1.1.30", "hwMplsTunnelSignalledTunnelName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.33"]
]

// --- hwMplsOamMisMatchRecovery (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.2.1.37
// Fields: hwMplsTunnelInterfaceName, hwMplsTunnelSignalProto, hwMplsTunnelSignalledTunnelName
// Description: This object indicates that MPLS OAM detected the tunnel received MisMatch alarm end.
trapMap["1.3.6.1.4.1.2011.5.25.121.2.1.37"] = [
    name: "hwMplsOamMisMatchRecovery",
    fields: ["hwMplsTunnelInterfaceName", "hwMplsTunnelSignalProto", "hwMplsTunnelSignalledTunnelName"],
    fieldOids: ["hwMplsTunnelInterfaceName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.29", "hwMplsTunnelSignalProto": "1.3.6.1.4.1.2011.5.25.121.1.1.1.30", "hwMplsTunnelSignalledTunnelName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.33"]
]

// --- hwMplsOamMisMerge (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.2.1.38
// Fields: hwMplsTunnelInterfaceName, hwMplsTunnelSignalProto, hwMplsTunnelSignalledTunnelName
// Description: This object indicates that MPLS OAM detected the tunnel received MisMerge alarm.
trapMap["1.3.6.1.4.1.2011.5.25.121.2.1.38"] = [
    name: "hwMplsOamMisMerge",
    fields: ["hwMplsTunnelInterfaceName", "hwMplsTunnelSignalProto", "hwMplsTunnelSignalledTunnelName"],
    fieldOids: ["hwMplsTunnelInterfaceName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.29", "hwMplsTunnelSignalProto": "1.3.6.1.4.1.2011.5.25.121.1.1.1.30", "hwMplsTunnelSignalledTunnelName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.33"]
]

// --- hwMplsOamMisMergeRecovery (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.2.1.39
// Fields: hwMplsTunnelInterfaceName, hwMplsTunnelSignalProto, hwMplsTunnelSignalledTunnelName
// Description: This object indicates that MPLS OAM detected the tunnel received MisMerge alarm end.
trapMap["1.3.6.1.4.1.2011.5.25.121.2.1.39"] = [
    name: "hwMplsOamMisMergeRecovery",
    fields: ["hwMplsTunnelInterfaceName", "hwMplsTunnelSignalProto", "hwMplsTunnelSignalledTunnelName"],
    fieldOids: ["hwMplsTunnelInterfaceName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.29", "hwMplsTunnelSignalProto": "1.3.6.1.4.1.2011.5.25.121.1.1.1.30", "hwMplsTunnelSignalledTunnelName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.33"]
]

// --- hwMplsOamUnknown (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.2.1.40
// Fields: hwMplsTunnelInterfaceName, hwMplsTunnelSignalProto, hwMplsTunnelSignalledTunnelName
// Description: This object indicates that MPLS OAM detected the tunnel received Unknown alarm.
trapMap["1.3.6.1.4.1.2011.5.25.121.2.1.40"] = [
    name: "hwMplsOamUnknown",
    fields: ["hwMplsTunnelInterfaceName", "hwMplsTunnelSignalProto", "hwMplsTunnelSignalledTunnelName"],
    fieldOids: ["hwMplsTunnelInterfaceName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.29", "hwMplsTunnelSignalProto": "1.3.6.1.4.1.2011.5.25.121.1.1.1.30", "hwMplsTunnelSignalledTunnelName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.33"]
]

// --- hwMplsOamUnknownRecovery (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.2.1.41
// Fields: hwMplsTunnelInterfaceName, hwMplsTunnelSignalProto, hwMplsTunnelSignalledTunnelName
// Description: This object indicates that MPLS OAM detected the tunnel received Unknown alarm end.
trapMap["1.3.6.1.4.1.2011.5.25.121.2.1.41"] = [
    name: "hwMplsOamUnknownRecovery",
    fields: ["hwMplsTunnelInterfaceName", "hwMplsTunnelSignalProto", "hwMplsTunnelSignalledTunnelName"],
    fieldOids: ["hwMplsTunnelInterfaceName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.29", "hwMplsTunnelSignalProto": "1.3.6.1.4.1.2011.5.25.121.1.1.1.30", "hwMplsTunnelSignalledTunnelName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.33"]
]

// --- hwMplsOamBDI (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.2.1.42
// Fields: hwMplsTunnelInterfaceName, hwMplsTunnelSignalProto, ifName, hwMplsTunnelSignalledTunnelName
// Description: This object indicates that MPLS OAM detected the tunnel received BDI alarm.
trapMap["1.3.6.1.4.1.2011.5.25.121.2.1.42"] = [
    name: "hwMplsOamBDI",
    fields: ["hwMplsTunnelInterfaceName", "hwMplsTunnelSignalProto", "ifName", "hwMplsTunnelSignalledTunnelName"],
    fieldOids: ["hwMplsTunnelInterfaceName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.29", "hwMplsTunnelSignalProto": "1.3.6.1.4.1.2011.5.25.121.1.1.1.30", "ifName": "1.3.6.1.2.1.31.1.1.1.1", "hwMplsTunnelSignalledTunnelName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.33"]
]

// --- hwMplsOamBDIRecovery (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.2.1.43
// Fields: hwMplsTunnelInterfaceName, hwMplsTunnelSignalProto, hwMplsTunnelSignalledTunnelName
// Description: This object indicates that MPLS OAM detected the tunnel received BDI alarm end.
trapMap["1.3.6.1.4.1.2011.5.25.121.2.1.43"] = [
    name: "hwMplsOamBDIRecovery",
    fields: ["hwMplsTunnelInterfaceName", "hwMplsTunnelSignalProto", "hwMplsTunnelSignalledTunnelName"],
    fieldOids: ["hwMplsTunnelInterfaceName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.29", "hwMplsTunnelSignalProto": "1.3.6.1.4.1.2011.5.25.121.1.1.1.30", "hwMplsTunnelSignalledTunnelName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.33"]
]

// --- hwMplsOamFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.2.1.44
// Fields: hwMplsTunnelInterfaceName, hwMplsTunnelSignalProto, ifName, hwMplsTunnelSignalledTunnelName
// Description: This object indicates that MPLS OAM detected the tunnel received OAMFAIL alarm.
trapMap["1.3.6.1.4.1.2011.5.25.121.2.1.44"] = [
    name: "hwMplsOamFail",
    fields: ["hwMplsTunnelInterfaceName", "hwMplsTunnelSignalProto", "ifName", "hwMplsTunnelSignalledTunnelName"],
    fieldOids: ["hwMplsTunnelInterfaceName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.29", "hwMplsTunnelSignalProto": "1.3.6.1.4.1.2011.5.25.121.1.1.1.30", "ifName": "1.3.6.1.2.1.31.1.1.1.1", "hwMplsTunnelSignalledTunnelName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.33"]
]

// --- hwMplsOamFailRecovery (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.2.1.45
// Fields: hwMplsTunnelInterfaceName, hwMplsTunnelSignalProto, hwMplsTunnelSignalledTunnelName
// Description: This object indicates that MPLS OAM detected the tunnel received OAMFAIL alarm end.
trapMap["1.3.6.1.4.1.2011.5.25.121.2.1.45"] = [
    name: "hwMplsOamFailRecovery",
    fields: ["hwMplsTunnelInterfaceName", "hwMplsTunnelSignalProto", "hwMplsTunnelSignalledTunnelName"],
    fieldOids: ["hwMplsTunnelInterfaceName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.29", "hwMplsTunnelSignalProto": "1.3.6.1.4.1.2011.5.25.121.1.1.1.30", "hwMplsTunnelSignalledTunnelName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.33"]
]

// --- hwMplsTunnelPrimaryUp (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.2.1.46
// Fields: hwMplsTunnelInterfaceName, hwMplsTunnelSignalledTunnelName
// Description: This notification indicates that the status of the RSVP-TE Primary LSP changes to Up.
trapMap["1.3.6.1.4.1.2011.5.25.121.2.1.46"] = [
    name: "hwMplsTunnelPrimaryUp",
    fields: ["hwMplsTunnelInterfaceName", "hwMplsTunnelSignalledTunnelName"],
    fieldOids: ["hwMplsTunnelInterfaceName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.29", "hwMplsTunnelSignalledTunnelName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.33"]
]

// --- hwMplsTunnelPrimaryDown (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.2.1.47
// Fields: hwMplsTunnelInterfaceName, hwMplsTunnelDownReason, hwMplsTunnelDownLSRID, hwMplsTunnelDownIfIpAddrType, hwMplsTunnelDownIfIpAddr, hwMplsTunnelSignalledTunnelName
// Description: This notification indicates that the status of the RSVP-TE Primary LSP changes to Down.
trapMap["1.3.6.1.4.1.2011.5.25.121.2.1.47"] = [
    name: "hwMplsTunnelPrimaryDown",
    fields: ["hwMplsTunnelInterfaceName", "hwMplsTunnelDownReason", "hwMplsTunnelDownLSRID", "hwMplsTunnelDownIfIpAddrType", "hwMplsTunnelDownIfIpAddr", "hwMplsTunnelSignalledTunnelName"],
    fieldOids: ["hwMplsTunnelInterfaceName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.29", "hwMplsTunnelDownReason": "1.3.6.1.4.1.2011.5.25.121.2.2.3", "hwMplsTunnelDownLSRID": "1.3.6.1.4.1.2011.5.25.121.2.2.8", "hwMplsTunnelDownIfIpAddrType": "1.3.6.1.4.1.2011.5.25.121.2.2.10", "hwMplsTunnelDownIfIpAddr": "1.3.6.1.4.1.2011.5.25.121.2.2.9", "hwMplsTunnelSignalledTunnelName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.33"]
]

// --- hwMplsTunnelHotstandbyUp (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.2.1.48
// Fields: hwMplsTunnelInterfaceName, hwMplsTunnelSignalledTunnelName
// Description: This notification indicates that the status of the RSVP-TE Hot-standby LSP changes to Up.
trapMap["1.3.6.1.4.1.2011.5.25.121.2.1.48"] = [
    name: "hwMplsTunnelHotstandbyUp",
    fields: ["hwMplsTunnelInterfaceName", "hwMplsTunnelSignalledTunnelName"],
    fieldOids: ["hwMplsTunnelInterfaceName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.29", "hwMplsTunnelSignalledTunnelName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.33"]
]

// --- hwMplsTunnelHotstandbyDown (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.2.1.49
// Fields: hwMplsTunnelInterfaceName, hwMplsTunnelDownReason, hwMplsTunnelDownLSRID, hwMplsTunnelDownIfIpAddrType, hwMplsTunnelDownIfIpAddr, hwMplsTunnelSignalledTunnelName
// Description: This notification indicates that the status of the RSVP-TE Hot-standby LSP changes to Down.
trapMap["1.3.6.1.4.1.2011.5.25.121.2.1.49"] = [
    name: "hwMplsTunnelHotstandbyDown",
    fields: ["hwMplsTunnelInterfaceName", "hwMplsTunnelDownReason", "hwMplsTunnelDownLSRID", "hwMplsTunnelDownIfIpAddrType", "hwMplsTunnelDownIfIpAddr", "hwMplsTunnelSignalledTunnelName"],
    fieldOids: ["hwMplsTunnelInterfaceName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.29", "hwMplsTunnelDownReason": "1.3.6.1.4.1.2011.5.25.121.2.2.3", "hwMplsTunnelDownLSRID": "1.3.6.1.4.1.2011.5.25.121.2.2.8", "hwMplsTunnelDownIfIpAddrType": "1.3.6.1.4.1.2011.5.25.121.2.2.10", "hwMplsTunnelDownIfIpAddr": "1.3.6.1.4.1.2011.5.25.121.2.2.9", "hwMplsTunnelSignalledTunnelName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.33"]
]

// --- hwMplsTunnelOrdinaryUp (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.2.1.50
// Fields: hwMplsTunnelInterfaceName, hwMplsTunnelSignalledTunnelName
// Description: This notification indicates that the status of the RSVP-TE Ordinary LSP changes to Up.
trapMap["1.3.6.1.4.1.2011.5.25.121.2.1.50"] = [
    name: "hwMplsTunnelOrdinaryUp",
    fields: ["hwMplsTunnelInterfaceName", "hwMplsTunnelSignalledTunnelName"],
    fieldOids: ["hwMplsTunnelInterfaceName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.29", "hwMplsTunnelSignalledTunnelName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.33"]
]

// --- hwMplsTunnelOrdinaryDown (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.2.1.51
// Fields: hwMplsTunnelInterfaceName, hwMplsTunnelDownReason, hwMplsTunnelDownLSRID, hwMplsTunnelDownIfIpAddrType, hwMplsTunnelDownIfIpAddr, hwMplsTunnelSignalledTunnelName
// Description: This notification indicates that the status of the RSVP-TE Ordinary LSP changes to Down.
trapMap["1.3.6.1.4.1.2011.5.25.121.2.1.51"] = [
    name: "hwMplsTunnelOrdinaryDown",
    fields: ["hwMplsTunnelInterfaceName", "hwMplsTunnelDownReason", "hwMplsTunnelDownLSRID", "hwMplsTunnelDownIfIpAddrType", "hwMplsTunnelDownIfIpAddr", "hwMplsTunnelSignalledTunnelName"],
    fieldOids: ["hwMplsTunnelInterfaceName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.29", "hwMplsTunnelDownReason": "1.3.6.1.4.1.2011.5.25.121.2.2.3", "hwMplsTunnelDownLSRID": "1.3.6.1.4.1.2011.5.25.121.2.2.8", "hwMplsTunnelDownIfIpAddrType": "1.3.6.1.4.1.2011.5.25.121.2.2.10", "hwMplsTunnelDownIfIpAddr": "1.3.6.1.4.1.2011.5.25.121.2.2.9", "hwMplsTunnelSignalledTunnelName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.33"]
]

// --- hwMplsTunnelBesteffortUp (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.2.1.52
// Fields: hwMplsTunnelInterfaceName, hwMplsTunnelSignalledTunnelName
// Description: This notification indicates that the status of the RSVP-TE Best-effort LSP changes to Up.
trapMap["1.3.6.1.4.1.2011.5.25.121.2.1.52"] = [
    name: "hwMplsTunnelBesteffortUp",
    fields: ["hwMplsTunnelInterfaceName", "hwMplsTunnelSignalledTunnelName"],
    fieldOids: ["hwMplsTunnelInterfaceName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.29", "hwMplsTunnelSignalledTunnelName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.33"]
]

// --- hwMplsTunnelBesteffortDown (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.2.1.53
// Fields: hwMplsTunnelInterfaceName, hwMplsTunnelDownReason, hwMplsTunnelDownLSRID, hwMplsTunnelDownIfIpAddrType, hwMplsTunnelDownIfIpAddr, hwMplsTunnelSignalledTunnelName
// Description: This notification indicates that the status of the RSVP-TE Best-effort LSP changes to Down.
trapMap["1.3.6.1.4.1.2011.5.25.121.2.1.53"] = [
    name: "hwMplsTunnelBesteffortDown",
    fields: ["hwMplsTunnelInterfaceName", "hwMplsTunnelDownReason", "hwMplsTunnelDownLSRID", "hwMplsTunnelDownIfIpAddrType", "hwMplsTunnelDownIfIpAddr", "hwMplsTunnelSignalledTunnelName"],
    fieldOids: ["hwMplsTunnelInterfaceName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.29", "hwMplsTunnelDownReason": "1.3.6.1.4.1.2011.5.25.121.2.2.3", "hwMplsTunnelDownLSRID": "1.3.6.1.4.1.2011.5.25.121.2.2.8", "hwMplsTunnelDownIfIpAddrType": "1.3.6.1.4.1.2011.5.25.121.2.2.10", "hwMplsTunnelDownIfIpAddr": "1.3.6.1.4.1.2011.5.25.121.2.2.9", "hwMplsTunnelSignalledTunnelName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.33"]
]

// --- hwMplsTeAutoTunnelDownClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.2.1.54
// Fields: mplsTunnelAdminStatus, mplsTunnelOperStatus, hwMplsTunnelIfName
// Description: This notification indicates that the TE Auto tunnel Down alarm was cleared.
trapMap["1.3.6.1.4.1.2011.5.25.121.2.1.54"] = [
    name: "hwMplsTeAutoTunnelDownClear",
    fields: ["mplsTunnelAdminStatus", "mplsTunnelOperStatus", "hwMplsTunnelIfName"],
    fieldOids: ["mplsTunnelAdminStatus": "1.3.6.1.2.1.10.166.3.2.2.1.34", "mplsTunnelOperStatus": "1.3.6.1.2.1.10.166.3.2.2.1.35", "hwMplsTunnelIfName": "1.3.6.1.4.1.2011.5.25.121.2.2.1"]
]

// --- hwMplsTeAutoTunnelPrimaryDownClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.2.1.55
// Fields: hwMplsTunnelInterfaceName
// Description: This notification indicates that the Down alarm about the primary LSP in the TE Auto tunnel was cleared.
trapMap["1.3.6.1.4.1.2011.5.25.121.2.1.55"] = [
    name: "hwMplsTeAutoTunnelPrimaryDownClear",
    fields: ["hwMplsTunnelInterfaceName"],
    fieldOids: ["hwMplsTunnelInterfaceName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.29"]
]

// --- hwMplsTunnelBBSwitch (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.2.1.56
// Fields: hwMplsTunnelAdminStatus, hwMplsTunnelOperStatus
// Description: This notification indicates that the primary CR-LSP is Down and the Best-effort backup CR-LSP is Up.
trapMap["1.3.6.1.4.1.2011.5.25.121.2.1.56"] = [
    name: "hwMplsTunnelBBSwitch",
    fields: ["hwMplsTunnelAdminStatus", "hwMplsTunnelOperStatus"],
    fieldOids: ["hwMplsTunnelAdminStatus": "1.3.6.1.4.1.2011.5.25.121.1.1.1.7", "hwMplsTunnelOperStatus": "1.3.6.1.4.1.2011.5.25.121.1.1.1.8"]
]

// --- hwMplsTunnelBBResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.2.1.57
// Fields: hwMplsTunnelAdminStatus, hwMplsTunnelOperStatus
// Description: This notification indicates that data is switched from the Best-effort backup CR-LSP to the primary CR-LSP.
trapMap["1.3.6.1.4.1.2011.5.25.121.2.1.57"] = [
    name: "hwMplsTunnelBBResume",
    fields: ["hwMplsTunnelAdminStatus", "hwMplsTunnelOperStatus"],
    fieldOids: ["hwMplsTunnelAdminStatus": "1.3.6.1.4.1.2011.5.25.121.1.1.1.7", "hwMplsTunnelOperStatus": "1.3.6.1.4.1.2011.5.25.121.1.1.1.8"]
]

// --- hwMplsExtTunnelDown (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.2.1.58
// Fields: hwMplsTunnelInterfaceName, hwMplsTunnelType, hwMplsTunnelAdminStatus, hwMplsTunnelOperStatus, hwMplsTunnelDownReason, ifName, hwMplsTunnelDownLSRID, hwMplsTunnelDownIfIpAddrType, hwMplsTunnelDownIfIpAddr, hwMplsTunnelSignalledTunnelName
// Description: This notification indicates that the status of te tunnel changes to Down.
trapMap["1.3.6.1.4.1.2011.5.25.121.2.1.58"] = [
    name: "hwMplsExtTunnelDown",
    fields: ["hwMplsTunnelInterfaceName", "hwMplsTunnelType", "hwMplsTunnelAdminStatus", "hwMplsTunnelOperStatus", "hwMplsTunnelDownReason", "ifName", "hwMplsTunnelDownLSRID", "hwMplsTunnelDownIfIpAddrType", "hwMplsTunnelDownIfIpAddr", "hwMplsTunnelSignalledTunnelName"],
    fieldOids: ["hwMplsTunnelInterfaceName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.29", "hwMplsTunnelType": "1.3.6.1.4.1.2011.5.25.121.1.1.1.31", "hwMplsTunnelAdminStatus": "1.3.6.1.4.1.2011.5.25.121.1.1.1.7", "hwMplsTunnelOperStatus": "1.3.6.1.4.1.2011.5.25.121.1.1.1.8", "hwMplsTunnelDownReason": "1.3.6.1.4.1.2011.5.25.121.2.2.3", "ifName": "1.3.6.1.2.1.31.1.1.1.1", "hwMplsTunnelDownLSRID": "1.3.6.1.4.1.2011.5.25.121.2.2.8", "hwMplsTunnelDownIfIpAddrType": "1.3.6.1.4.1.2011.5.25.121.2.2.10", "hwMplsTunnelDownIfIpAddr": "1.3.6.1.4.1.2011.5.25.121.2.2.9", "hwMplsTunnelSignalledTunnelName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.33"]
]

// --- hwMplsExtTunnelDownClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.2.1.59
// Fields: hwMplsTunnelInterfaceName, hwMplsTunnelType, hwMplsTunnelAdminStatus, hwMplsTunnelOperStatus, hwMplsTunnelDownReason, ifName, hwMplsTunnelSignalledTunnelName
// Description: This notification indicates that the down alarm of te tunnel was cleared.
trapMap["1.3.6.1.4.1.2011.5.25.121.2.1.59"] = [
    name: "hwMplsExtTunnelDownClear",
    fields: ["hwMplsTunnelInterfaceName", "hwMplsTunnelType", "hwMplsTunnelAdminStatus", "hwMplsTunnelOperStatus", "hwMplsTunnelDownReason", "ifName", "hwMplsTunnelSignalledTunnelName"],
    fieldOids: ["hwMplsTunnelInterfaceName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.29", "hwMplsTunnelType": "1.3.6.1.4.1.2011.5.25.121.1.1.1.31", "hwMplsTunnelAdminStatus": "1.3.6.1.4.1.2011.5.25.121.1.1.1.7", "hwMplsTunnelOperStatus": "1.3.6.1.4.1.2011.5.25.121.1.1.1.8", "hwMplsTunnelDownReason": "1.3.6.1.4.1.2011.5.25.121.2.2.3", "ifName": "1.3.6.1.2.1.31.1.1.1.1", "hwMplsTunnelSignalledTunnelName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.33"]
]

// --- hwMplsOamLocalLock (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.2.1.60
// Fields: hwMplsTunnelInterfaceName, hwMplsTunnelSignalProto, hwMplsTunnelSignalledTunnelName
// Description: This object indicates that TP OAM detected the tunnel has been locked.
trapMap["1.3.6.1.4.1.2011.5.25.121.2.1.60"] = [
    name: "hwMplsOamLocalLock",
    fields: ["hwMplsTunnelInterfaceName", "hwMplsTunnelSignalProto", "hwMplsTunnelSignalledTunnelName"],
    fieldOids: ["hwMplsTunnelInterfaceName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.29", "hwMplsTunnelSignalProto": "1.3.6.1.4.1.2011.5.25.121.1.1.1.30", "hwMplsTunnelSignalledTunnelName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.33"]
]

// --- hwMplsOamLocalLockRecovery (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.2.1.61
// Fields: hwMplsTunnelInterfaceName, hwMplsTunnelSignalProto, hwMplsTunnelSignalledTunnelName
// Description: This object indicates that TP OAM detected the tunnel has not been locked.
trapMap["1.3.6.1.4.1.2011.5.25.121.2.1.61"] = [
    name: "hwMplsOamLocalLockRecovery",
    fields: ["hwMplsTunnelInterfaceName", "hwMplsTunnelSignalProto", "hwMplsTunnelSignalledTunnelName"],
    fieldOids: ["hwMplsTunnelInterfaceName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.29", "hwMplsTunnelSignalProto": "1.3.6.1.4.1.2011.5.25.121.1.1.1.30", "hwMplsTunnelSignalledTunnelName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.33"]
]

// --- hwMplsTunnelDelete (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.2.1.62
// Fields: mplsTunnelAdminStatus, mplsTunnelOperStatus, hwMplsTunnelIfName
// Description: This notification indicates that the mpls te tunnel was deleted.
trapMap["1.3.6.1.4.1.2011.5.25.121.2.1.62"] = [
    name: "hwMplsTunnelDelete",
    fields: ["mplsTunnelAdminStatus", "mplsTunnelOperStatus", "hwMplsTunnelIfName"],
    fieldOids: ["mplsTunnelAdminStatus": "1.3.6.1.2.1.10.166.3.2.2.1.34", "mplsTunnelOperStatus": "1.3.6.1.2.1.10.166.3.2.2.1.35", "hwMplsTunnelIfName": "1.3.6.1.4.1.2011.5.25.121.2.2.1"]
]

// --- hwMplsLspThresholdExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.2.1.63
// Fields: hwMplsLspProtocol, hwMplsLspCurrentCount, hwMplsLspThreshold, hwMplsLspTotalCount
// Description: This object indicates that lsp count has exceeded the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.121.2.1.63"] = [
    name: "hwMplsLspThresholdExceed",
    fields: ["hwMplsLspProtocol", "hwMplsLspCurrentCount", "hwMplsLspThreshold", "hwMplsLspTotalCount"],
    fieldOids: ["hwMplsLspProtocol": "1.3.6.1.4.1.2011.5.25.121.2.2.4", "hwMplsLspCurrentCount": "1.3.6.1.4.1.2011.5.25.121.2.2.7", "hwMplsLspThreshold": "1.3.6.1.4.1.2011.5.25.121.2.2.5", "hwMplsLspTotalCount": "1.3.6.1.4.1.2011.5.25.121.2.2.6"]
]

// --- hwMplsLspThresholdExceedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.2.1.64
// Fields: hwMplsLspProtocol
// Description: This object indicates that lsp count has resumed from exceeding the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.121.2.1.64"] = [
    name: "hwMplsLspThresholdExceedClear",
    fields: ["hwMplsLspProtocol"],
    fieldOids: ["hwMplsLspProtocol": "1.3.6.1.4.1.2011.5.25.121.2.2.4"]
]

// --- hwMplsLspTotalCountExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.2.1.65
// Fields: hwMplsLspProtocol, hwMplsLspTotalCount
// Description: This object indicates that lsp count has reached the total count.
trapMap["1.3.6.1.4.1.2011.5.25.121.2.1.65"] = [
    name: "hwMplsLspTotalCountExceed",
    fields: ["hwMplsLspProtocol", "hwMplsLspTotalCount"],
    fieldOids: ["hwMplsLspProtocol": "1.3.6.1.4.1.2011.5.25.121.2.2.4", "hwMplsLspTotalCount": "1.3.6.1.4.1.2011.5.25.121.2.2.6"]
]

// --- hwMplsLspTotalCountExceedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.2.1.66
// Fields: hwMplsLspProtocol
// Description: This object indicates that lsp count has resumed from reaching the total count.
trapMap["1.3.6.1.4.1.2011.5.25.121.2.1.66"] = [
    name: "hwMplsLspTotalCountExceedClear",
    fields: ["hwMplsLspProtocol"],
    fieldOids: ["hwMplsLspProtocol": "1.3.6.1.4.1.2011.5.25.121.2.2.4"]
]

// --- hwMplsDynamicLabelThresholdExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.2.1.67
// Fields: hwMplsDynamicLabelTotalCount, hwMplsDynamicLabelCurrentCount, hwMplsDynamicLabelThresholdUpperLimit, hwMplsDynamicLabelThresholdLowerLimit
// Description: This object indicates that label usage has exceeded the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.121.2.1.67"] = [
    name: "hwMplsDynamicLabelThresholdExceed",
    fields: ["hwMplsDynamicLabelTotalCount", "hwMplsDynamicLabelCurrentCount", "hwMplsDynamicLabelThresholdUpperLimit", "hwMplsDynamicLabelThresholdLowerLimit"],
    fieldOids: ["hwMplsDynamicLabelTotalCount": "1.3.6.1.4.1.2011.5.25.121.3.3", "hwMplsDynamicLabelCurrentCount": "1.3.6.1.4.1.2011.5.25.121.3.4", "hwMplsDynamicLabelThresholdUpperLimit": "1.3.6.1.4.1.2011.5.25.121.3.5", "hwMplsDynamicLabelThresholdLowerLimit": "1.3.6.1.4.1.2011.5.25.121.3.6"]
]

// --- hwMplsDynamicLabelThresholdExceedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.2.1.68
// Fields: hwMplsDynamicLabelTotalCount, hwMplsDynamicLabelCurrentCount, hwMplsDynamicLabelThresholdUpperLimit, hwMplsDynamicLabelThresholdLowerLimit
// Description: This object indicates that label usage has resumed from exceeding the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.121.2.1.68"] = [
    name: "hwMplsDynamicLabelThresholdExceedClear",
    fields: ["hwMplsDynamicLabelTotalCount", "hwMplsDynamicLabelCurrentCount", "hwMplsDynamicLabelThresholdUpperLimit", "hwMplsDynamicLabelThresholdLowerLimit"],
    fieldOids: ["hwMplsDynamicLabelTotalCount": "1.3.6.1.4.1.2011.5.25.121.3.3", "hwMplsDynamicLabelCurrentCount": "1.3.6.1.4.1.2011.5.25.121.3.4", "hwMplsDynamicLabelThresholdUpperLimit": "1.3.6.1.4.1.2011.5.25.121.3.5", "hwMplsDynamicLabelThresholdLowerLimit": "1.3.6.1.4.1.2011.5.25.121.3.6"]
]

// --- hwMplsDynamicLabelTotalCountExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.2.1.69
// Fields: hwMplsDynamicLabelTotalCount, hwMplsDynamicLabelCurrentCount
// Description: This object indicates that label count has reached the total count.
trapMap["1.3.6.1.4.1.2011.5.25.121.2.1.69"] = [
    name: "hwMplsDynamicLabelTotalCountExceed",
    fields: ["hwMplsDynamicLabelTotalCount", "hwMplsDynamicLabelCurrentCount"],
    fieldOids: ["hwMplsDynamicLabelTotalCount": "1.3.6.1.4.1.2011.5.25.121.3.3", "hwMplsDynamicLabelCurrentCount": "1.3.6.1.4.1.2011.5.25.121.3.4"]
]

// --- hwMplsDynamicLabelTotalCountExceedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.2.1.70
// Fields: hwMplsDynamicLabelTotalCount, hwMplsDynamicLabelCurrentCount
// Description: This object indicates that label usage count has resumed from reaching the total count.
trapMap["1.3.6.1.4.1.2011.5.25.121.2.1.70"] = [
    name: "hwMplsDynamicLabelTotalCountExceedClear",
    fields: ["hwMplsDynamicLabelTotalCount", "hwMplsDynamicLabelCurrentCount"],
    fieldOids: ["hwMplsDynamicLabelTotalCount": "1.3.6.1.4.1.2011.5.25.121.3.3", "hwMplsDynamicLabelCurrentCount": "1.3.6.1.4.1.2011.5.25.121.3.4"]
]

// --- hwMplsResourceThresholdExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.2.1.71
// Fields: hwMplsResourceType, hwMplsResourceCurrentCount, hwMplsResourceThreshold, hwMplsResourceTotalCount
// Description: This object indicates that the number of MPLS resources has exceeded the upper threshold.
trapMap["1.3.6.1.4.1.2011.5.25.121.2.1.71"] = [
    name: "hwMplsResourceThresholdExceed",
    fields: ["hwMplsResourceType", "hwMplsResourceCurrentCount", "hwMplsResourceThreshold", "hwMplsResourceTotalCount"],
    fieldOids: ["hwMplsResourceType": "1.3.6.1.4.1.2011.5.25.121.2.2.11", "hwMplsResourceCurrentCount": "1.3.6.1.4.1.2011.5.25.121.2.2.12", "hwMplsResourceThreshold": "1.3.6.1.4.1.2011.5.25.121.2.2.13", "hwMplsResourceTotalCount": "1.3.6.1.4.1.2011.5.25.121.2.2.14"]
]

// --- hwMplsResourceThresholdExceedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.2.1.72
// Fields: hwMplsResourceType
// Description: This object indicates that the number of MPLS resources has fallen below the lower threshold.
trapMap["1.3.6.1.4.1.2011.5.25.121.2.1.72"] = [
    name: "hwMplsResourceThresholdExceedClear",
    fields: ["hwMplsResourceType"],
    fieldOids: ["hwMplsResourceType": "1.3.6.1.4.1.2011.5.25.121.2.2.11"]
]

// --- hwMplsResourceTotalCountExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.2.1.73
// Fields: hwMplsResourceType, hwMplsResourceTotalCount
// Description: This object indicates that the number of MPLS resources has reached the maximum number.
trapMap["1.3.6.1.4.1.2011.5.25.121.2.1.73"] = [
    name: "hwMplsResourceTotalCountExceed",
    fields: ["hwMplsResourceType", "hwMplsResourceTotalCount"],
    fieldOids: ["hwMplsResourceType": "1.3.6.1.4.1.2011.5.25.121.2.2.11", "hwMplsResourceTotalCount": "1.3.6.1.4.1.2011.5.25.121.2.2.14"]
]

// --- hwMplsResourceTotalCountExceedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.2.1.74
// Fields: hwMplsResourceType
// Description: This object indicates that the number of MPLS resources fallen below the recovery number.
trapMap["1.3.6.1.4.1.2011.5.25.121.2.1.74"] = [
    name: "hwMplsResourceTotalCountExceedClear",
    fields: ["hwMplsResourceType"],
    fieldOids: ["hwMplsResourceType": "1.3.6.1.4.1.2011.5.25.121.2.2.11"]
]

// --- hwMplsLspLoopBack (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.2.1.75
// Fields: hwMplsSessionTunnelId, hwMplsLocalLspId, hwMplsIngressLsrId, hwMplsEgressLsrId, hwMplsLspName
// Description: This object indicates that the lsp was looped back.
trapMap["1.3.6.1.4.1.2011.5.25.121.2.1.75"] = [
    name: "hwMplsLspLoopBack",
    fields: ["hwMplsSessionTunnelId", "hwMplsLocalLspId", "hwMplsIngressLsrId", "hwMplsEgressLsrId", "hwMplsLspName"],
    fieldOids: ["hwMplsSessionTunnelId": "1.3.6.1.4.1.2011.5.25.121.2.2.15", "hwMplsLocalLspId": "1.3.6.1.4.1.2011.5.25.121.2.2.16", "hwMplsIngressLsrId": "1.3.6.1.4.1.2011.5.25.121.2.2.17", "hwMplsEgressLsrId": "1.3.6.1.4.1.2011.5.25.121.2.2.18", "hwMplsLspName": "1.3.6.1.4.1.2011.5.25.121.2.2.19"]
]

// --- hwMplsLspLoopBackClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.2.1.76
// Fields: hwMplsSessionTunnelId, hwMplsLocalLspId, hwMplsIngressLsrId, hwMplsEgressLsrId, hwMplsLspName
// Description: This object indicates that loopback of the LSP is restored.
trapMap["1.3.6.1.4.1.2011.5.25.121.2.1.76"] = [
    name: "hwMplsLspLoopBackClear",
    fields: ["hwMplsSessionTunnelId", "hwMplsLocalLspId", "hwMplsIngressLsrId", "hwMplsEgressLsrId", "hwMplsLspName"],
    fieldOids: ["hwMplsSessionTunnelId": "1.3.6.1.4.1.2011.5.25.121.2.2.15", "hwMplsLocalLspId": "1.3.6.1.4.1.2011.5.25.121.2.2.16", "hwMplsIngressLsrId": "1.3.6.1.4.1.2011.5.25.121.2.2.17", "hwMplsEgressLsrId": "1.3.6.1.4.1.2011.5.25.121.2.2.18", "hwMplsLspName": "1.3.6.1.4.1.2011.5.25.121.2.2.19"]
]

// --- hwMplsTunnelCommitLost (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.2.1.77
// Description: This object indicates that, after the device saves MPLS TE tunnel configurations, the device commits only some MPLS tunnel configurations.
trapMap["1.3.6.1.4.1.2011.5.25.121.2.1.77"] = [
    name: "hwMplsTunnelCommitLost",
    fields: [],
    fieldOids: []
]

// --- hwMplsTunnelCommitLostClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.2.1.78
// Description: This object indicates that, after the device saves MPLS TE tunnel configurations, the device commits all MPLS tunnel configurations.
trapMap["1.3.6.1.4.1.2011.5.25.121.2.1.78"] = [
    name: "hwMplsTunnelCommitLostClear",
    fields: [],
    fieldOids: []
]

// --- hwMplsTunnelHotstandbySwitch (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.2.1.79
// Fields: hwMplsTunnelInterfaceName, hwMplsTunnelSignalledTunnelName
// Description: This notification indicates that the data is switched from the primary CR-LSP to the HSB CR-LSP.
trapMap["1.3.6.1.4.1.2011.5.25.121.2.1.79"] = [
    name: "hwMplsTunnelHotstandbySwitch",
    fields: ["hwMplsTunnelInterfaceName", "hwMplsTunnelSignalledTunnelName"],
    fieldOids: ["hwMplsTunnelInterfaceName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.29", "hwMplsTunnelSignalledTunnelName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.33"]
]

// --- hwMplsTunnelHotstandbyResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.2.1.80
// Fields: hwMplsTunnelInterfaceName, hwMplsTunnelSignalledTunnelName
// Description: This notification indicates that the data is switched from the HSB CR-LSP to the primary CR-LSP.
trapMap["1.3.6.1.4.1.2011.5.25.121.2.1.80"] = [
    name: "hwMplsTunnelHotstandbyResume",
    fields: ["hwMplsTunnelInterfaceName", "hwMplsTunnelSignalledTunnelName"],
    fieldOids: ["hwMplsTunnelInterfaceName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.29", "hwMplsTunnelSignalledTunnelName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.33"]
]

// --- hwMplsTunnelBfdPathMismatch (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.2.1.81
// Fields: hwMplsTunnelInterfaceName, hwMplsSessionTunnelId, hwMplsLocalLspId, hwMplsIngressLsrId, hwMplsEgressLsrId, hwMplsTunnelIfName, hwMplsTunnelSignalledTunnelName
// Description: This notification indicates the forward primary LSP path is the same as the reverse hot-standby LSP path, and the reverse primary LSP path is the same as the forward hot-standby LSP path, causing path...
trapMap["1.3.6.1.4.1.2011.5.25.121.2.1.81"] = [
    name: "hwMplsTunnelBfdPathMismatch",
    fields: ["hwMplsTunnelInterfaceName", "hwMplsSessionTunnelId", "hwMplsLocalLspId", "hwMplsIngressLsrId", "hwMplsEgressLsrId", "hwMplsTunnelIfName", "hwMplsTunnelSignalledTunnelName"],
    fieldOids: ["hwMplsTunnelInterfaceName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.29", "hwMplsSessionTunnelId": "1.3.6.1.4.1.2011.5.25.121.2.2.15", "hwMplsLocalLspId": "1.3.6.1.4.1.2011.5.25.121.2.2.16", "hwMplsIngressLsrId": "1.3.6.1.4.1.2011.5.25.121.2.2.17", "hwMplsEgressLsrId": "1.3.6.1.4.1.2011.5.25.121.2.2.18", "hwMplsTunnelIfName": "1.3.6.1.4.1.2011.5.25.121.2.2.1", "hwMplsTunnelSignalledTunnelName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.33"]
]

// --- hwMplsTunnelBfdPathMismatchClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.2.1.82
// Fields: hwMplsTunnelInterfaceName, hwMplsSessionTunnelId, hwMplsLocalLspId, hwMplsIngressLsrId, hwMplsEgressLsrId, hwMplsTunnelIfName, hwMplsTunnelSignalledTunnelName
// Description: This notification indicates that either or both path mismatches were rectified.
trapMap["1.3.6.1.4.1.2011.5.25.121.2.1.82"] = [
    name: "hwMplsTunnelBfdPathMismatchClear",
    fields: ["hwMplsTunnelInterfaceName", "hwMplsSessionTunnelId", "hwMplsLocalLspId", "hwMplsIngressLsrId", "hwMplsEgressLsrId", "hwMplsTunnelIfName", "hwMplsTunnelSignalledTunnelName"],
    fieldOids: ["hwMplsTunnelInterfaceName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.29", "hwMplsSessionTunnelId": "1.3.6.1.4.1.2011.5.25.121.2.2.15", "hwMplsLocalLspId": "1.3.6.1.4.1.2011.5.25.121.2.2.16", "hwMplsIngressLsrId": "1.3.6.1.4.1.2011.5.25.121.2.2.17", "hwMplsEgressLsrId": "1.3.6.1.4.1.2011.5.25.121.2.2.18", "hwMplsTunnelIfName": "1.3.6.1.4.1.2011.5.25.121.2.2.1", "hwMplsTunnelSignalledTunnelName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.33"]
]

// --- hwMplsTeLspBfdDown (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.2.1.83
// Fields: hwMplsTunnelInterfaceName, hwMplsTunnelLspType, hwMplsTunnelSignalledTunnelName
// Description: This notification indicates the bfd status of te-lsp changes to down.
trapMap["1.3.6.1.4.1.2011.5.25.121.2.1.83"] = [
    name: "hwMplsTeLspBfdDown",
    fields: ["hwMplsTunnelInterfaceName", "hwMplsTunnelLspType", "hwMplsTunnelSignalledTunnelName"],
    fieldOids: ["hwMplsTunnelInterfaceName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.29", "hwMplsTunnelLspType": "1.3.6.1.4.1.2011.5.25.121.1.1.1.28", "hwMplsTunnelSignalledTunnelName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.33"]
]

// --- hwMplsTeLspBfdDownClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.2.1.84
// Fields: hwMplsTunnelInterfaceName, hwMplsTunnelLspType, hwMplsTunnelSignalledTunnelName
// Description: This notification indicates that the down alarm of bfd was cleared.
trapMap["1.3.6.1.4.1.2011.5.25.121.2.1.84"] = [
    name: "hwMplsTeLspBfdDownClear",
    fields: ["hwMplsTunnelInterfaceName", "hwMplsTunnelLspType", "hwMplsTunnelSignalledTunnelName"],
    fieldOids: ["hwMplsTunnelInterfaceName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.29", "hwMplsTunnelLspType": "1.3.6.1.4.1.2011.5.25.121.1.1.1.28", "hwMplsTunnelSignalledTunnelName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.33"]
]

// --- hwMplsTunnelDelegationReturn (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.2.1.85
// Fields: hwMplsTunnelInterfaceName
// Description: This notification indicates that the delegation of Tunnel LSP is returned by server.
trapMap["1.3.6.1.4.1.2011.5.25.121.2.1.85"] = [
    name: "hwMplsTunnelDelegationReturn",
    fields: ["hwMplsTunnelInterfaceName"],
    fieldOids: ["hwMplsTunnelInterfaceName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.29"]
]

// --- hwMplsTunnelDelegationReturnClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.2.1.86
// Fields: hwMplsTunnelInterfaceName
// Description: This notification indicates that the delegation of Tunnel LSP is returned by server.
trapMap["1.3.6.1.4.1.2011.5.25.121.2.1.86"] = [
    name: "hwMplsTunnelDelegationReturnClear",
    fields: ["hwMplsTunnelInterfaceName"],
    fieldOids: ["hwMplsTunnelInterfaceName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.29"]
]

// --- hwMplsOamFDI (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.2.1.87
// Fields: hwMplsTunnelInterfaceName, hwMplsTunnelSignalProto, hwMplsTunnelDirection, ifName, hwMplsTunnelSignalledTunnelName
// Description: This object indicates that MPLS OAM detected the tunnel received FDI alarm.
trapMap["1.3.6.1.4.1.2011.5.25.121.2.1.87"] = [
    name: "hwMplsOamFDI",
    fields: ["hwMplsTunnelInterfaceName", "hwMplsTunnelSignalProto", "hwMplsTunnelDirection", "ifName", "hwMplsTunnelSignalledTunnelName"],
    fieldOids: ["hwMplsTunnelInterfaceName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.29", "hwMplsTunnelSignalProto": "1.3.6.1.4.1.2011.5.25.121.1.1.1.30", "hwMplsTunnelDirection": "1.3.6.1.4.1.2011.5.25.121.1.1.1.32", "ifName": "1.3.6.1.2.1.31.1.1.1.1", "hwMplsTunnelSignalledTunnelName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.33"]
]

// --- hwMplsOamFDIRecovery (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.2.1.88
// Fields: hwMplsTunnelInterfaceName, hwMplsTunnelSignalProto, hwMplsTunnelDirection, hwMplsTunnelSignalledTunnelName
// Description: This object indicates that MPLS OAM detected the tunnel received FDI alarm end.
trapMap["1.3.6.1.4.1.2011.5.25.121.2.1.88"] = [
    name: "hwMplsOamFDIRecovery",
    fields: ["hwMplsTunnelInterfaceName", "hwMplsTunnelSignalProto", "hwMplsTunnelDirection", "hwMplsTunnelSignalledTunnelName"],
    fieldOids: ["hwMplsTunnelInterfaceName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.29", "hwMplsTunnelSignalProto": "1.3.6.1.4.1.2011.5.25.121.1.1.1.30", "hwMplsTunnelDirection": "1.3.6.1.4.1.2011.5.25.121.1.1.1.32", "hwMplsTunnelSignalledTunnelName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.33"]
]

// --- hwP2mpTeTunnelDown (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.2.1.89
// Fields: hwMplsTunnelInterfaceName, hwMplsP2mpId, hwMplsTunnelDownReason
// Description: This object indicates that the status of the P2MP tunnel changes to Down.
trapMap["1.3.6.1.4.1.2011.5.25.121.2.1.89"] = [
    name: "hwP2mpTeTunnelDown",
    fields: ["hwMplsTunnelInterfaceName", "hwMplsP2mpId", "hwMplsTunnelDownReason"],
    fieldOids: ["hwMplsTunnelInterfaceName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.29", "hwMplsP2mpId": "1.3.6.1.4.1.2011.5.25.121.2.2.20", "hwMplsTunnelDownReason": "1.3.6.1.4.1.2011.5.25.121.2.2.3"]
]

// --- hwP2mpTeTunnelDownClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.2.1.90
// Fields: hwMplsTunnelInterfaceName, hwMplsP2mpId, hwMplsTunnelDownReason
// Description: This object indicates that the alarm of the P2MP tunnel was cleared.
trapMap["1.3.6.1.4.1.2011.5.25.121.2.1.90"] = [
    name: "hwP2mpTeTunnelDownClear",
    fields: ["hwMplsTunnelInterfaceName", "hwMplsP2mpId", "hwMplsTunnelDownReason"],
    fieldOids: ["hwMplsTunnelInterfaceName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.29", "hwMplsP2mpId": "1.3.6.1.4.1.2011.5.25.121.2.2.20", "hwMplsTunnelDownReason": "1.3.6.1.4.1.2011.5.25.121.2.2.3"]
]

// --- hwP2mpTeSubLspDown (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.2.1.91
// Fields: hwMplsTunnelInterfaceName, hwMplsTunnelLspType, hwMplsP2mpId, hwMplsTunnelDownReason, hwMplsTunnelDownLSRID, hwMplsTunnelDownIfIpAddrType, hwMplsTunnelDownIfIpAddr
// Description: This object indicates that the status of the P2MP tunnel sub-lsp changes to down.
trapMap["1.3.6.1.4.1.2011.5.25.121.2.1.91"] = [
    name: "hwP2mpTeSubLspDown",
    fields: ["hwMplsTunnelInterfaceName", "hwMplsTunnelLspType", "hwMplsP2mpId", "hwMplsTunnelDownReason", "hwMplsTunnelDownLSRID", "hwMplsTunnelDownIfIpAddrType", "hwMplsTunnelDownIfIpAddr"],
    fieldOids: ["hwMplsTunnelInterfaceName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.29", "hwMplsTunnelLspType": "1.3.6.1.4.1.2011.5.25.121.1.1.1.28", "hwMplsP2mpId": "1.3.6.1.4.1.2011.5.25.121.2.2.20", "hwMplsTunnelDownReason": "1.3.6.1.4.1.2011.5.25.121.2.2.3", "hwMplsTunnelDownLSRID": "1.3.6.1.4.1.2011.5.25.121.2.2.8", "hwMplsTunnelDownIfIpAddrType": "1.3.6.1.4.1.2011.5.25.121.2.2.10", "hwMplsTunnelDownIfIpAddr": "1.3.6.1.4.1.2011.5.25.121.2.2.9"]
]

// --- hwBlockLabelThresholdExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.2.1.92
// Fields: hwBlockLabelTotalCount, hwBlockLabelCurrentCount, hwBlockLabelThresholdUpperLimit, hwBlockLabelThresholdLowerLimit
// Description: This object indicates that label usage has exceeded the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.121.2.1.92"] = [
    name: "hwBlockLabelThresholdExceed",
    fields: ["hwBlockLabelTotalCount", "hwBlockLabelCurrentCount", "hwBlockLabelThresholdUpperLimit", "hwBlockLabelThresholdLowerLimit"],
    fieldOids: ["hwBlockLabelTotalCount": "1.3.6.1.4.1.2011.5.25.121.3.7", "hwBlockLabelCurrentCount": "1.3.6.1.4.1.2011.5.25.121.3.8", "hwBlockLabelThresholdUpperLimit": "1.3.6.1.4.1.2011.5.25.121.3.9", "hwBlockLabelThresholdLowerLimit": "1.3.6.1.4.1.2011.5.25.121.3.10"]
]

// --- hwBlockLabelThresholdExceedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.2.1.93
// Fields: hwBlockLabelTotalCount, hwBlockLabelCurrentCount, hwBlockLabelThresholdUpperLimit, hwBlockLabelThresholdLowerLimit
// Description: This object indicates that label usage has resumed from exceeding the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.121.2.1.93"] = [
    name: "hwBlockLabelThresholdExceedClear",
    fields: ["hwBlockLabelTotalCount", "hwBlockLabelCurrentCount", "hwBlockLabelThresholdUpperLimit", "hwBlockLabelThresholdLowerLimit"],
    fieldOids: ["hwBlockLabelTotalCount": "1.3.6.1.4.1.2011.5.25.121.3.7", "hwBlockLabelCurrentCount": "1.3.6.1.4.1.2011.5.25.121.3.8", "hwBlockLabelThresholdUpperLimit": "1.3.6.1.4.1.2011.5.25.121.3.9", "hwBlockLabelThresholdLowerLimit": "1.3.6.1.4.1.2011.5.25.121.3.10"]
]

// --- hwBlockLabelTotalCountExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.2.1.94
// Fields: hwBlockLabelTotalCount, hwBlockLabelCurrentCount
// Description: This object indicates that label count has reached the total count.
trapMap["1.3.6.1.4.1.2011.5.25.121.2.1.94"] = [
    name: "hwBlockLabelTotalCountExceed",
    fields: ["hwBlockLabelTotalCount", "hwBlockLabelCurrentCount"],
    fieldOids: ["hwBlockLabelTotalCount": "1.3.6.1.4.1.2011.5.25.121.3.7", "hwBlockLabelCurrentCount": "1.3.6.1.4.1.2011.5.25.121.3.8"]
]

// --- hwBlockLabelTotalCountExceedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.2.1.95
// Fields: hwBlockLabelTotalCount, hwBlockLabelCurrentCount
// Description: This object indicates that label usage count has resumed from reaching the total count.
trapMap["1.3.6.1.4.1.2011.5.25.121.2.1.95"] = [
    name: "hwBlockLabelTotalCountExceedClear",
    fields: ["hwBlockLabelTotalCount", "hwBlockLabelCurrentCount"],
    fieldOids: ["hwBlockLabelTotalCount": "1.3.6.1.4.1.2011.5.25.121.3.7", "hwBlockLabelCurrentCount": "1.3.6.1.4.1.2011.5.25.121.3.8"]
]

// --- hwMplsInsecureAlgorithm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.2.1.96
// Fields: hwMplsFeatureName, hwMplsAlgorithmName
// Description: This object indicates that an insecure encryption algorithm is used, which has security risks.
trapMap["1.3.6.1.4.1.2011.5.25.121.2.1.96"] = [
    name: "hwMplsInsecureAlgorithm",
    fields: ["hwMplsFeatureName", "hwMplsAlgorithmName"],
    fieldOids: ["hwMplsFeatureName": "1.3.6.1.4.1.2011.5.25.121.2.2.21", "hwMplsAlgorithmName": "1.3.6.1.4.1.2011.5.25.121.2.2.22"]
]

// --- hwMplsInsecureAlgorithmClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.2.1.97
// Fields: hwMplsFeatureName, hwMplsAlgorithmName
// Description: This object indicates that the insecure encryption algorithm alarm is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.121.2.1.97"] = [
    name: "hwMplsInsecureAlgorithmClear",
    fields: ["hwMplsFeatureName", "hwMplsAlgorithmName"],
    fieldOids: ["hwMplsFeatureName": "1.3.6.1.4.1.2011.5.25.121.2.2.21", "hwMplsAlgorithmName": "1.3.6.1.4.1.2011.5.25.121.2.2.22"]
]

// --- hwMplsSlotResTotalCountExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.2.1.98
// Fields: hwMplsResourceType, hwMplsChassis, hwMplsSlot, hwMplsResourceTotalCount
// Description: This object indicates that the number of MPLS resources on the interface board has reached the maximum number.
trapMap["1.3.6.1.4.1.2011.5.25.121.2.1.98"] = [
    name: "hwMplsSlotResTotalCountExceed",
    fields: ["hwMplsResourceType", "hwMplsChassis", "hwMplsSlot", "hwMplsResourceTotalCount"],
    fieldOids: ["hwMplsResourceType": "1.3.6.1.4.1.2011.5.25.121.2.2.11", "hwMplsChassis": "1.3.6.1.4.1.2011.5.25.121.2.2.24", "hwMplsSlot": "1.3.6.1.4.1.2011.5.25.121.2.2.23", "hwMplsResourceTotalCount": "1.3.6.1.4.1.2011.5.25.121.2.2.14"]
]

// --- hwMplsSlotResTotalCountExceedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.2.1.99
// Fields: hwMplsResourceType, hwMplsChassis, hwMplsSlot
// Description: This object indicates that the number of MPLS resources on the interface board fallen below the recovery number.
trapMap["1.3.6.1.4.1.2011.5.25.121.2.1.99"] = [
    name: "hwMplsSlotResTotalCountExceedClear",
    fields: ["hwMplsResourceType", "hwMplsChassis", "hwMplsSlot"],
    fieldOids: ["hwMplsResourceType": "1.3.6.1.4.1.2011.5.25.121.2.2.11", "hwMplsChassis": "1.3.6.1.4.1.2011.5.25.121.2.2.24", "hwMplsSlot": "1.3.6.1.4.1.2011.5.25.121.2.2.23"]
]

// --- hwP2mpTeSubLspDownAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.2.1.100
// Fields: hwMplsTunnelInterfaceName, hwMplsTunnelLspType, hwMplsP2mpId, hwMplsTunnelDownReason, hwMplsTunnelDownLSRID, hwMplsTunnelDownIfIpAddrType, hwMplsTunnelDownIfIpAddr
// Description: This object indicates that the status of the P2MP tunnel sub-lsp changes to down.
trapMap["1.3.6.1.4.1.2011.5.25.121.2.1.100"] = [
    name: "hwP2mpTeSubLspDownAlarm",
    fields: ["hwMplsTunnelInterfaceName", "hwMplsTunnelLspType", "hwMplsP2mpId", "hwMplsTunnelDownReason", "hwMplsTunnelDownLSRID", "hwMplsTunnelDownIfIpAddrType", "hwMplsTunnelDownIfIpAddr"],
    fieldOids: ["hwMplsTunnelInterfaceName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.29", "hwMplsTunnelLspType": "1.3.6.1.4.1.2011.5.25.121.1.1.1.28", "hwMplsP2mpId": "1.3.6.1.4.1.2011.5.25.121.2.2.20", "hwMplsTunnelDownReason": "1.3.6.1.4.1.2011.5.25.121.2.2.3", "hwMplsTunnelDownLSRID": "1.3.6.1.4.1.2011.5.25.121.2.2.8", "hwMplsTunnelDownIfIpAddrType": "1.3.6.1.4.1.2011.5.25.121.2.2.10", "hwMplsTunnelDownIfIpAddr": "1.3.6.1.4.1.2011.5.25.121.2.2.9"]
]

// --- hwP2mpTeSubLspDownAlarmClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.2.1.101
// Fields: hwMplsTunnelInterfaceName, hwMplsTunnelLspType, hwMplsP2mpId, hwMplsTunnelDownReason, hwMplsTunnelDownLSRID, hwMplsTunnelDownIfIpAddrType, hwMplsTunnelDownIfIpAddr
// Description: This object indicates that the alarm of the P2MP tunnel sub-lsp was cleared.
trapMap["1.3.6.1.4.1.2011.5.25.121.2.1.101"] = [
    name: "hwP2mpTeSubLspDownAlarmClear",
    fields: ["hwMplsTunnelInterfaceName", "hwMplsTunnelLspType", "hwMplsP2mpId", "hwMplsTunnelDownReason", "hwMplsTunnelDownLSRID", "hwMplsTunnelDownIfIpAddrType", "hwMplsTunnelDownIfIpAddr"],
    fieldOids: ["hwMplsTunnelInterfaceName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.29", "hwMplsTunnelLspType": "1.3.6.1.4.1.2011.5.25.121.1.1.1.28", "hwMplsP2mpId": "1.3.6.1.4.1.2011.5.25.121.2.2.20", "hwMplsTunnelDownReason": "1.3.6.1.4.1.2011.5.25.121.2.2.3", "hwMplsTunnelDownLSRID": "1.3.6.1.4.1.2011.5.25.121.2.2.8", "hwMplsTunnelDownIfIpAddrType": "1.3.6.1.4.1.2011.5.25.121.2.2.10", "hwMplsTunnelDownIfIpAddr": "1.3.6.1.4.1.2011.5.25.121.2.2.9"]
]

// --- hwMplsTeBandwidthExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.2.1.102
// Fields: ifIndex, ifName
// Description: This object indicates that the configured maximum reservable bandwidth of MPLS TE is greater than the remaining bandwidth of the interface.
trapMap["1.3.6.1.4.1.2011.5.25.121.2.1.102"] = [
    name: "hwMplsTeBandwidthExceed",
    fields: ["ifIndex", "ifName"],
    fieldOids: ["ifIndex": "1.3.6.1.2.1.2.2.1.1", "ifName": "1.3.6.1.2.1.31.1.1.1.1"]
]

// --- hwMplsTeBandwidthExceedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.2.1.103
// Fields: ifIndex, ifName
// Description: This object indicates that the MPLS-TE bandwidth exceed alarm was cleared.
trapMap["1.3.6.1.4.1.2011.5.25.121.2.1.103"] = [
    name: "hwMplsTeBandwidthExceedClear",
    fields: ["ifIndex", "ifName"],
    fieldOids: ["ifIndex": "1.3.6.1.2.1.2.2.1.1", "ifName": "1.3.6.1.2.1.31.1.1.1.1"]
]

// --- hwMplsTunnelFrrConfigChange (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.2.3
// Fields: hwMplsTunnelIfName, hwMplsTunnelFrrConfigOper
// Description: When the trap indicating that TE-Frr configuration of Tunnel is changed is sent, the cause for the change of TE-FRR configuration of Tunnel is displayed.
trapMap["1.3.6.1.4.1.2011.5.25.121.2.3"] = [
    name: "hwMplsTunnelFrrConfigChange",
    fields: ["hwMplsTunnelIfName", "hwMplsTunnelFrrConfigOper"],
    fieldOids: ["hwMplsTunnelIfName": "1.3.6.1.4.1.2011.5.25.121.2.2.1", "hwMplsTunnelFrrConfigOper": "1.3.6.1.4.1.2011.5.25.121.2.2.2"]
]

// --- hwMplsRingSwitch (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.7.2.1
// Fields: hwMplsRingNodeID, hwMplsRingName, hwMplsRingDirection, hwMplsRingSwitchReason
// Description: The notification indicates that the MPLS ring switched.
trapMap["1.3.6.1.4.1.2011.5.25.121.7.2.1"] = [
    name: "hwMplsRingSwitch",
    fields: ["hwMplsRingNodeID", "hwMplsRingName", "hwMplsRingDirection", "hwMplsRingSwitchReason"],
    fieldOids: ["hwMplsRingNodeID": "1.3.6.1.4.1.2011.5.25.121.7.1.1.2", "hwMplsRingName": "1.3.6.1.4.1.2011.5.25.121.7.1.1.3", "hwMplsRingDirection": "1.3.6.1.4.1.2011.5.25.121.7.1.1.4", "hwMplsRingSwitchReason": "1.3.6.1.4.1.2011.5.25.121.7.1.1.5"]
]

// --- hwMplsRingResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.7.2.2
// Fields: hwMplsRingNodeID, hwMplsRingName, hwMplsRingDirection
// Description: The notification indicates that the MPLS ring resumed.
trapMap["1.3.6.1.4.1.2011.5.25.121.7.2.2"] = [
    name: "hwMplsRingResume",
    fields: ["hwMplsRingNodeID", "hwMplsRingName", "hwMplsRingDirection"],
    fieldOids: ["hwMplsRingNodeID": "1.3.6.1.4.1.2011.5.25.121.7.1.1.2", "hwMplsRingName": "1.3.6.1.4.1.2011.5.25.121.7.1.1.3", "hwMplsRingDirection": "1.3.6.1.4.1.2011.5.25.121.7.1.1.4"]
]

// --- hwMplsRingWestOamLoss (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.7.2.3
// Fields: hwMplsRingName
// Description: The notification indicates that no expected CV/FFD packet is received for three consecutive cycles in the west of the MPLS ring.
trapMap["1.3.6.1.4.1.2011.5.25.121.7.2.3"] = [
    name: "hwMplsRingWestOamLoss",
    fields: ["hwMplsRingName"],
    fieldOids: ["hwMplsRingName": "1.3.6.1.4.1.2011.5.25.121.7.1.1.3"]
]

// --- hwMplsRingWestOamLossClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.7.2.4
// Fields: hwMplsRingName
// Description: The notification indicates that the hwMplsRingWestOamLoss alarm was cleared.
trapMap["1.3.6.1.4.1.2011.5.25.121.7.2.4"] = [
    name: "hwMplsRingWestOamLossClear",
    fields: ["hwMplsRingName"],
    fieldOids: ["hwMplsRingName": "1.3.6.1.4.1.2011.5.25.121.7.1.1.3"]
]

// --- hwMplsRingEastOamLoss (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.7.2.5
// Fields: hwMplsRingName
// Description: The notification indicates that no expected CV/FFD packet is received for three consecutive cycles in the east of the MPLS ring.
trapMap["1.3.6.1.4.1.2011.5.25.121.7.2.5"] = [
    name: "hwMplsRingEastOamLoss",
    fields: ["hwMplsRingName"],
    fieldOids: ["hwMplsRingName": "1.3.6.1.4.1.2011.5.25.121.7.1.1.3"]
]

// --- hwMplsRingEastOamLossClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.7.2.6
// Fields: hwMplsRingName
// Description: The notification indicates that the hwMplsRingEastOamLoss alarm was cleared.
trapMap["1.3.6.1.4.1.2011.5.25.121.7.2.6"] = [
    name: "hwMplsRingEastOamLossClear",
    fields: ["hwMplsRingName"],
    fieldOids: ["hwMplsRingName": "1.3.6.1.4.1.2011.5.25.121.7.1.1.3"]
]

// --- hwMplsRingWestOamRDI (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.7.2.7
// Fields: hwMplsRingName
// Description: The notification indicates that RDI packets are received in the west of the MPLS ring, indicating that a fault occurs on the forward ring.
trapMap["1.3.6.1.4.1.2011.5.25.121.7.2.7"] = [
    name: "hwMplsRingWestOamRDI",
    fields: ["hwMplsRingName"],
    fieldOids: ["hwMplsRingName": "1.3.6.1.4.1.2011.5.25.121.7.1.1.3"]
]

// --- hwMplsRingWestOamRDIClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.7.2.8
// Fields: hwMplsRingName
// Description: The notification indicates that the hwMplsRingWestOamRDI alarm was cleared.
trapMap["1.3.6.1.4.1.2011.5.25.121.7.2.8"] = [
    name: "hwMplsRingWestOamRDIClear",
    fields: ["hwMplsRingName"],
    fieldOids: ["hwMplsRingName": "1.3.6.1.4.1.2011.5.25.121.7.1.1.3"]
]

// --- hwMplsRingEastOamRDI (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.7.2.9
// Fields: hwMplsRingName
// Description: The notification indicates that RDI packets are received in the east of the MPLS ring, indicating that a fault occurs on the forward ring.
trapMap["1.3.6.1.4.1.2011.5.25.121.7.2.9"] = [
    name: "hwMplsRingEastOamRDI",
    fields: ["hwMplsRingName"],
    fieldOids: ["hwMplsRingName": "1.3.6.1.4.1.2011.5.25.121.7.1.1.3"]
]

// --- hwMplsRingEastOamRDIClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.7.2.10
// Fields: hwMplsRingName
// Description: The notification indicates that the hwMplsRingEastOamRDI alarm was cleared.
trapMap["1.3.6.1.4.1.2011.5.25.121.7.2.10"] = [
    name: "hwMplsRingEastOamRDIClear",
    fields: ["hwMplsRingName"],
    fieldOids: ["hwMplsRingName": "1.3.6.1.4.1.2011.5.25.121.7.1.1.3"]
]

// --- hwMplsRingWestOamUnexpectedMEG (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.7.2.11
// Fields: hwMplsRingName
// Description: The notification indicates that a CCM frame carrying a correct MEG level but incorrect MEG ID is received in the west of the MPLS ring.
trapMap["1.3.6.1.4.1.2011.5.25.121.7.2.11"] = [
    name: "hwMplsRingWestOamUnexpectedMEG",
    fields: ["hwMplsRingName"],
    fieldOids: ["hwMplsRingName": "1.3.6.1.4.1.2011.5.25.121.7.1.1.3"]
]

// --- hwMplsRingWestOamUnexpectedMEGClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.7.2.12
// Fields: hwMplsRingName
// Description: The notification indicates that the hwMplsRingWestOamUnexpectedMEG alarm was cleared.
trapMap["1.3.6.1.4.1.2011.5.25.121.7.2.12"] = [
    name: "hwMplsRingWestOamUnexpectedMEGClear",
    fields: ["hwMplsRingName"],
    fieldOids: ["hwMplsRingName": "1.3.6.1.4.1.2011.5.25.121.7.1.1.3"]
]

// --- hwMplsRingEastOamUnexpectedMEG (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.7.2.13
// Fields: hwMplsRingName
// Description: The notification indicates that a CCM frame carrying a correct MEG level but incorrect MEG ID is received in the east of the MPLS ring.
trapMap["1.3.6.1.4.1.2011.5.25.121.7.2.13"] = [
    name: "hwMplsRingEastOamUnexpectedMEG",
    fields: ["hwMplsRingName"],
    fieldOids: ["hwMplsRingName": "1.3.6.1.4.1.2011.5.25.121.7.1.1.3"]
]

// --- hwMplsRingEastOamUnexpectedMEGClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.7.2.14
// Fields: hwMplsRingName
// Description: The notification indicates that the hwMplsRingEastOamUnexpectedMEG alarm was cleared.
trapMap["1.3.6.1.4.1.2011.5.25.121.7.2.14"] = [
    name: "hwMplsRingEastOamUnexpectedMEGClear",
    fields: ["hwMplsRingName"],
    fieldOids: ["hwMplsRingName": "1.3.6.1.4.1.2011.5.25.121.7.1.1.3"]
]

// --- hwMplsRingWestOamUnexpectedPeriod (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.7.2.15
// Fields: hwMplsRingName
// Description: The notification indicates that a CCM frame carrying a correct MEG level, MEG ID, and MEP ID but incorrect period value is received in the west MEP of the MPLS ring.
trapMap["1.3.6.1.4.1.2011.5.25.121.7.2.15"] = [
    name: "hwMplsRingWestOamUnexpectedPeriod",
    fields: ["hwMplsRingName"],
    fieldOids: ["hwMplsRingName": "1.3.6.1.4.1.2011.5.25.121.7.1.1.3"]
]

// --- hwMplsRingWestOamUnexpectedPeriodClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.7.2.16
// Fields: hwMplsRingName
// Description: The notification indicates that the hwMplsRingWestOamUnexpectedPeriod alarm was cleared.
trapMap["1.3.6.1.4.1.2011.5.25.121.7.2.16"] = [
    name: "hwMplsRingWestOamUnexpectedPeriodClear",
    fields: ["hwMplsRingName"],
    fieldOids: ["hwMplsRingName": "1.3.6.1.4.1.2011.5.25.121.7.1.1.3"]
]

// --- hwMplsRingEastOamUnexpectedPeriod (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.7.2.17
// Fields: hwMplsRingName
// Description: The notification indicates that a CCM frame carrying a correct MEG level, MEG ID, and MEP ID but incorrect period value is received in the east MEP of the MPLS ring.
trapMap["1.3.6.1.4.1.2011.5.25.121.7.2.17"] = [
    name: "hwMplsRingEastOamUnexpectedPeriod",
    fields: ["hwMplsRingName"],
    fieldOids: ["hwMplsRingName": "1.3.6.1.4.1.2011.5.25.121.7.1.1.3"]
]

// --- hwMplsRingEastOamUnexpectedPeriodClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.7.2.18
// Fields: hwMplsRingName
// Description: The notification indicates that the hwMplsRingEastOamUnexpectedPeriod alarm was cleared.
trapMap["1.3.6.1.4.1.2011.5.25.121.7.2.18"] = [
    name: "hwMplsRingEastOamUnexpectedPeriodClear",
    fields: ["hwMplsRingName"],
    fieldOids: ["hwMplsRingName": "1.3.6.1.4.1.2011.5.25.121.7.1.1.3"]
]

// --- hwMplsRingWestOamExcess (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.7.2.19
// Fields: hwMplsRingName
// Description: The notification indicates that five or more CV/FFD packets are correctly received within three consecutive cycles in the west of the MPLS ring.
trapMap["1.3.6.1.4.1.2011.5.25.121.7.2.19"] = [
    name: "hwMplsRingWestOamExcess",
    fields: ["hwMplsRingName"],
    fieldOids: ["hwMplsRingName": "1.3.6.1.4.1.2011.5.25.121.7.1.1.3"]
]

// --- hwMplsRingWestOamExcessClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.7.2.20
// Fields: hwMplsRingName
// Description: The notification indicates that the hwMplsRingWestOamExcess alarm was cleared.
trapMap["1.3.6.1.4.1.2011.5.25.121.7.2.20"] = [
    name: "hwMplsRingWestOamExcessClear",
    fields: ["hwMplsRingName"],
    fieldOids: ["hwMplsRingName": "1.3.6.1.4.1.2011.5.25.121.7.1.1.3"]
]

// --- hwMplsRingEastOamExcess (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.7.2.21
// Fields: hwMplsRingName
// Description: The notification indicates that five or more CV/FFD packets are correctly received within three consecutive cycles in the east of the MPLS ring.
trapMap["1.3.6.1.4.1.2011.5.25.121.7.2.21"] = [
    name: "hwMplsRingEastOamExcess",
    fields: ["hwMplsRingName"],
    fieldOids: ["hwMplsRingName": "1.3.6.1.4.1.2011.5.25.121.7.1.1.3"]
]

// --- hwMplsRingEastOamExcessClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.7.2.22
// Fields: hwMplsRingName
// Description: The notification indicates that the hwMplsRingEastOamExcess alarm was cleared.
trapMap["1.3.6.1.4.1.2011.5.25.121.7.2.22"] = [
    name: "hwMplsRingEastOamExcessClear",
    fields: ["hwMplsRingName"],
    fieldOids: ["hwMplsRingName": "1.3.6.1.4.1.2011.5.25.121.7.1.1.3"]
]

// --- hwMplsRingWestOamSD (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.7.2.23
// Fields: hwMplsRingName
// Description: The notification indicates that the number of packets for connectivity check received in the west of the MPLS ring is smaller than the SD threshold.
trapMap["1.3.6.1.4.1.2011.5.25.121.7.2.23"] = [
    name: "hwMplsRingWestOamSD",
    fields: ["hwMplsRingName"],
    fieldOids: ["hwMplsRingName": "1.3.6.1.4.1.2011.5.25.121.7.1.1.3"]
]

// --- hwMplsRingWestOamSDClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.7.2.24
// Fields: hwMplsRingName
// Description: The notification indicates that the hwMplsRingWestOamSD alarm was cleared.
trapMap["1.3.6.1.4.1.2011.5.25.121.7.2.24"] = [
    name: "hwMplsRingWestOamSDClear",
    fields: ["hwMplsRingName"],
    fieldOids: ["hwMplsRingName": "1.3.6.1.4.1.2011.5.25.121.7.1.1.3"]
]

// --- hwMplsRingEastOamSD (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.7.2.25
// Fields: hwMplsRingName
// Description: The notification indicates that the number of packets for connectivity check received in the east of the MPLS ring is smaller than the SD threshold.
trapMap["1.3.6.1.4.1.2011.5.25.121.7.2.25"] = [
    name: "hwMplsRingEastOamSD",
    fields: ["hwMplsRingName"],
    fieldOids: ["hwMplsRingName": "1.3.6.1.4.1.2011.5.25.121.7.1.1.3"]
]

// --- hwMplsRingEastOamSDClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.7.2.26
// Fields: hwMplsRingName
// Description: The notification indicates that the hwMplsRingEastOamSD alarm was cleared.
trapMap["1.3.6.1.4.1.2011.5.25.121.7.2.26"] = [
    name: "hwMplsRingEastOamSDClear",
    fields: ["hwMplsRingName"],
    fieldOids: ["hwMplsRingName": "1.3.6.1.4.1.2011.5.25.121.7.1.1.3"]
]

// --- hwMplsRingWestOamSF (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.7.2.27
// Fields: hwMplsRingName
// Description: The notification indicates that the number of packets for connectivity check received in the west of the MPLS ring is smaller than the SF threshold.
trapMap["1.3.6.1.4.1.2011.5.25.121.7.2.27"] = [
    name: "hwMplsRingWestOamSF",
    fields: ["hwMplsRingName"],
    fieldOids: ["hwMplsRingName": "1.3.6.1.4.1.2011.5.25.121.7.1.1.3"]
]

// --- hwMplsRingWestOamSFClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.7.2.28
// Fields: hwMplsRingName
// Description: The notification indicates that the hwMplsRingWestOamSF alarm was cleared.
trapMap["1.3.6.1.4.1.2011.5.25.121.7.2.28"] = [
    name: "hwMplsRingWestOamSFClear",
    fields: ["hwMplsRingName"],
    fieldOids: ["hwMplsRingName": "1.3.6.1.4.1.2011.5.25.121.7.1.1.3"]
]

// --- hwMplsRingEastOamSF (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.7.2.29
// Fields: hwMplsRingName
// Description: The notification indicates that the number of packets for connectivity check received in the east of the MPLS ring is smaller than the SF threshold.
trapMap["1.3.6.1.4.1.2011.5.25.121.7.2.29"] = [
    name: "hwMplsRingEastOamSF",
    fields: ["hwMplsRingName"],
    fieldOids: ["hwMplsRingName": "1.3.6.1.4.1.2011.5.25.121.7.1.1.3"]
]

// --- hwMplsRingEastOamSFClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.7.2.30
// Fields: hwMplsRingName
// Description: The notification indicates that the hwMplsRingEastOamSF alarm was cleared.
trapMap["1.3.6.1.4.1.2011.5.25.121.7.2.30"] = [
    name: "hwMplsRingEastOamSFClear",
    fields: ["hwMplsRingName"],
    fieldOids: ["hwMplsRingName": "1.3.6.1.4.1.2011.5.25.121.7.1.1.3"]
]

// --- hwMplsRingWestAPSSwitch (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.7.2.31
// Fields: hwMplsRingName
// Description: The notification indicates that APS switching occurs in the west of the MPLS ring.
trapMap["1.3.6.1.4.1.2011.5.25.121.7.2.31"] = [
    name: "hwMplsRingWestAPSSwitch",
    fields: ["hwMplsRingName"],
    fieldOids: ["hwMplsRingName": "1.3.6.1.4.1.2011.5.25.121.7.1.1.3"]
]

// --- hwMplsRingWestAPSResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.7.2.32
// Fields: hwMplsRingName
// Description: The notification indicates that APS switches back in the west of the MPLS ring.
trapMap["1.3.6.1.4.1.2011.5.25.121.7.2.32"] = [
    name: "hwMplsRingWestAPSResume",
    fields: ["hwMplsRingName"],
    fieldOids: ["hwMplsRingName": "1.3.6.1.4.1.2011.5.25.121.7.1.1.3"]
]

// --- hwMplsRingEastAPSSwitch (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.7.2.33
// Fields: hwMplsRingName
// Description: The notification indicates that APS switching occurs in the east of the MPLS ring.
trapMap["1.3.6.1.4.1.2011.5.25.121.7.2.33"] = [
    name: "hwMplsRingEastAPSSwitch",
    fields: ["hwMplsRingName"],
    fieldOids: ["hwMplsRingName": "1.3.6.1.4.1.2011.5.25.121.7.1.1.3"]
]

// --- hwMplsRingEastAPSResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.7.2.34
// Fields: hwMplsRingName
// Description: The notification indicates that APS switches back in the east of the MPLS ring.
trapMap["1.3.6.1.4.1.2011.5.25.121.7.2.34"] = [
    name: "hwMplsRingEastAPSResume",
    fields: ["hwMplsRingName"],
    fieldOids: ["hwMplsRingName": "1.3.6.1.4.1.2011.5.25.121.7.1.1.3"]
]

// --- hwMplsRingWestAPSSwitchFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.7.2.35
// Fields: hwMplsRingName
// Description: The notification indicates that the remote APS switching fails in the west of the MPLS ring.
trapMap["1.3.6.1.4.1.2011.5.25.121.7.2.35"] = [
    name: "hwMplsRingWestAPSSwitchFail",
    fields: ["hwMplsRingName"],
    fieldOids: ["hwMplsRingName": "1.3.6.1.4.1.2011.5.25.121.7.1.1.3"]
]

// --- hwMplsRingWestAPSSwitchFailClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.7.2.36
// Fields: hwMplsRingName
// Description: The notification indicates that the hwMplsRingWestAPSSwitchFail alarm was cleared.
trapMap["1.3.6.1.4.1.2011.5.25.121.7.2.36"] = [
    name: "hwMplsRingWestAPSSwitchFailClear",
    fields: ["hwMplsRingName"],
    fieldOids: ["hwMplsRingName": "1.3.6.1.4.1.2011.5.25.121.7.1.1.3"]
]

// --- hwMplsRingEastAPSSwitchFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.7.2.37
// Fields: hwMplsRingName
// Description: The notification indicates that the remote APS switching fails in the east of the MPLS ring.
trapMap["1.3.6.1.4.1.2011.5.25.121.7.2.37"] = [
    name: "hwMplsRingEastAPSSwitchFail",
    fields: ["hwMplsRingName"],
    fieldOids: ["hwMplsRingName": "1.3.6.1.4.1.2011.5.25.121.7.1.1.3"]
]

// --- hwMplsRingEastAPSSwitchFailClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.7.2.38
// Fields: hwMplsRingName
// Description: The notification indicates that the hwMplsRingEastAPSSwitchFail alarm was cleared.
trapMap["1.3.6.1.4.1.2011.5.25.121.7.2.38"] = [
    name: "hwMplsRingEastAPSSwitchFailClear",
    fields: ["hwMplsRingName"],
    fieldOids: ["hwMplsRingName": "1.3.6.1.4.1.2011.5.25.121.7.1.1.3"]
]

// --- hwMplsRingWestAPSLost (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.7.2.39
// Fields: hwMplsRingName
// Description: The notification indicates that APS packets are missing in the west of the MPLS ring.
trapMap["1.3.6.1.4.1.2011.5.25.121.7.2.39"] = [
    name: "hwMplsRingWestAPSLost",
    fields: ["hwMplsRingName"],
    fieldOids: ["hwMplsRingName": "1.3.6.1.4.1.2011.5.25.121.7.1.1.3"]
]

// --- hwMplsRingWestAPSLostClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.7.2.40
// Fields: hwMplsRingName
// Description: The notification indicates that the hwMplsRingWestAPSLost alarm was cleared.
trapMap["1.3.6.1.4.1.2011.5.25.121.7.2.40"] = [
    name: "hwMplsRingWestAPSLostClear",
    fields: ["hwMplsRingName"],
    fieldOids: ["hwMplsRingName": "1.3.6.1.4.1.2011.5.25.121.7.1.1.3"]
]

// --- hwMplsRingEastAPSLost (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.7.2.41
// Fields: hwMplsRingName
// Description: The notification indicates that APS packets are missing in the east of the MPLS ring.
trapMap["1.3.6.1.4.1.2011.5.25.121.7.2.41"] = [
    name: "hwMplsRingEastAPSLost",
    fields: ["hwMplsRingName"],
    fieldOids: ["hwMplsRingName": "1.3.6.1.4.1.2011.5.25.121.7.1.1.3"]
]

// --- hwMplsRingEastAPSLostClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.7.2.42
// Fields: hwMplsRingName
// Description: The notification indicates that the hwMplsRingEastAPSLost alarm was cleared.
trapMap["1.3.6.1.4.1.2011.5.25.121.7.2.42"] = [
    name: "hwMplsRingEastAPSLostClear",
    fields: ["hwMplsRingName"],
    fieldOids: ["hwMplsRingName": "1.3.6.1.4.1.2011.5.25.121.7.1.1.3"]
]

// --- hwMplsRingWestAPSMismatch (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.7.2.43
// Fields: hwMplsRingName
// Description: The notification indicates that the source ID carried by APS packets received in the west is different from the peer source ID configured for the west state machine on the MPLS ring.
trapMap["1.3.6.1.4.1.2011.5.25.121.7.2.43"] = [
    name: "hwMplsRingWestAPSMismatch",
    fields: ["hwMplsRingName"],
    fieldOids: ["hwMplsRingName": "1.3.6.1.4.1.2011.5.25.121.7.1.1.3"]
]

// --- hwMplsRingWestAPSMismatchClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.7.2.44
// Fields: hwMplsRingName
// Description: The notification indicates that the hwMplsRingWestAPSMismatch alarm was cleared.
trapMap["1.3.6.1.4.1.2011.5.25.121.7.2.44"] = [
    name: "hwMplsRingWestAPSMismatchClear",
    fields: ["hwMplsRingName"],
    fieldOids: ["hwMplsRingName": "1.3.6.1.4.1.2011.5.25.121.7.1.1.3"]
]

// --- hwMplsRingEastAPSMismatch (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.7.2.45
// Fields: hwMplsRingName
// Description: The notification indicates that the source ID carried by APS packets received in the east is different from the peer source ID configured for the east state machine on the MPLS ring.
trapMap["1.3.6.1.4.1.2011.5.25.121.7.2.45"] = [
    name: "hwMplsRingEastAPSMismatch",
    fields: ["hwMplsRingName"],
    fieldOids: ["hwMplsRingName": "1.3.6.1.4.1.2011.5.25.121.7.1.1.3"]
]

// --- hwMplsRingEastAPSMismatchClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.7.2.46
// Fields: hwMplsRingName
// Description: The notification indicates that the hwMplsRingEastAPSMismatch alarm was cleared.
trapMap["1.3.6.1.4.1.2011.5.25.121.7.2.46"] = [
    name: "hwMplsRingEastAPSMismatchClear",
    fields: ["hwMplsRingName"],
    fieldOids: ["hwMplsRingName": "1.3.6.1.4.1.2011.5.25.121.7.1.1.3"]
]

// --- hwMplsRingWestOamUnexpectedMEP (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.7.2.47
// Fields: hwMplsRingName
// Description: The notification indicates that a CCM frame carrying a correct MEG level and correct MEG ID but not the expected MEP ID is received in the west of the MPLS ring.
trapMap["1.3.6.1.4.1.2011.5.25.121.7.2.47"] = [
    name: "hwMplsRingWestOamUnexpectedMEP",
    fields: ["hwMplsRingName"],
    fieldOids: ["hwMplsRingName": "1.3.6.1.4.1.2011.5.25.121.7.1.1.3"]
]

// --- hwMplsRingWestOamUnexpectedMEPClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.7.2.48
// Fields: hwMplsRingName
// Description: The notification indicates that the hwMplsRingWestOamUnexpectedMEP alarm was cleared.
trapMap["1.3.6.1.4.1.2011.5.25.121.7.2.48"] = [
    name: "hwMplsRingWestOamUnexpectedMEPClear",
    fields: ["hwMplsRingName"],
    fieldOids: ["hwMplsRingName": "1.3.6.1.4.1.2011.5.25.121.7.1.1.3"]
]

// --- hwMplsRingEastOamUnexpectedMEP (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.7.2.49
// Fields: hwMplsRingName
// Description: The notification indicates that a CCM frame carrying a correct MEG level and correct MEG ID but not the expected MEP ID is received in the east of the MPLS ring.
trapMap["1.3.6.1.4.1.2011.5.25.121.7.2.49"] = [
    name: "hwMplsRingEastOamUnexpectedMEP",
    fields: ["hwMplsRingName"],
    fieldOids: ["hwMplsRingName": "1.3.6.1.4.1.2011.5.25.121.7.1.1.3"]
]

// --- hwMplsRingEastOamUnexpectedMEPClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.121.7.2.50
// Fields: hwMplsRingName
// Description: The notification indicates that the hwMplsRingEastOamUnexpectedMEP alarm was cleared.
trapMap["1.3.6.1.4.1.2011.5.25.121.7.2.50"] = [
    name: "hwMplsRingEastOamUnexpectedMEPClear",
    fields: ["hwMplsRingName"],
    fieldOids: ["hwMplsRingName": "1.3.6.1.4.1.2011.5.25.121.7.1.1.3"]
]

// ===== Parsing logic =====

// Set to true to enable diagnostic logging for this MIB parser
DEBUG = false

LOG_PREFIX = "[HUAWEI-MPLS-EXTEND-MIB]"
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
