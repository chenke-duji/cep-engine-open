/**
 * Auto-generated from HUAWEI-BFD-MIB.mib
 * Generated: 2026-08-25T16:46:59.834820300
 * Traps/Notifications (31): hwBfdSessDown, hwBfdSessUp, hwBfdSessReachLimit, hwBfdSessReachLimitBindIf, hwBfdSessReachLimitResume, hwBfdSessReachLimitBindIfResume, hwBfdSessCfgRemoteFail, hwBfdSessFaultDown, hwBfdSessResume, hwBfdSessApOperFailed, hwBfdSessFsmDiscordant, hwBfdSessFsmAccordant, hwBfdIPv6SessDown, hwBfdIPv6SessUp, hwBfdBitErrorDetectSessReachLimit, hwBfdSessReachTotalLimit, hwBfdSessReachTotalLimitResume, hwBfdSessCreateFail, hwBfdSessCreateFailResume, hwBfdSliceAlarm, hwBfdSliceAlarmResume, hwBfdSelectBoardWarn, hwBfdSelectBoardWarnResume, hwBfdSessUpTrap, hwBfdSessDownTrap, hwBfdv6SingleHopSessUpTrap, hwBfdv6SingleHopSessDownTrap, hwBfdv6MultiHopSessUpTrap, hwBfdv6MultiHopSessDownTrap, hwBfdPWSessUp, hwBfdPWSessDown
 *
 * Mapping rules:
 *   node       = trap source IP (rawEvent.sourceIp)
 *   alertGroup/summary/severity/type = per-trap rule overrides
 */

import com.raysdata.cep.model.AlarmEvent
import com.raysdata.cep.model.EventType
import com.raysdata.cep.model.Severity

// ===== Trap OID -> definition mapping =====
// Key: fully resolved numeric OID, Value: [name, fields, fieldOids]
def trapMap = [:]

// ===== Name -> definition mapping (fallback for unresolved OIDs) =====
def trapNameMap = [:]

// --- hwBfdSessDown (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.38.3.1
// Fields: hwBfdSessCfgName, hwBfdSessPeerAddr, hwBfdSessBindIfIndex, hwBfdSessBindIfName, hwBfdSessDiag, hwBfdSessVrfIndex, hwBfdSessVPNName, hwBfdSessType, hwBfdSessDefaultIp, hwBfdSessBindType, hwBfdSessStaticLspName, hwBfdSessPWSecondaryFlag, hwBfdSessNextHop, hwBfdSessVcId, hwBfdSessVsiName, hwBfdSessVsiPeerAddr, hwBfdSessDiscrAuto, hwBfdSessPeerIpv6Addr, hwBfdSessIpv6NextHop, hwBfdSessEvplId
// Description: This trap occurred when the state of the BFD session became down. The BFD session is characterized by the objects in this node.
trapMap["1.3.6.1.4.1.2011.5.25.38.3.1"] = [
    name: "hwBfdSessDown",
    fields: ["hwBfdSessCfgName", "hwBfdSessPeerAddr", "hwBfdSessBindIfIndex", "hwBfdSessBindIfName", "hwBfdSessDiag", "hwBfdSessVrfIndex", "hwBfdSessVPNName", "hwBfdSessType", "hwBfdSessDefaultIp", "hwBfdSessBindType", "hwBfdSessStaticLspName", "hwBfdSessPWSecondaryFlag", "hwBfdSessNextHop", "hwBfdSessVcId", "hwBfdSessVsiName", "hwBfdSessVsiPeerAddr", "hwBfdSessDiscrAuto", "hwBfdSessPeerIpv6Addr", "hwBfdSessIpv6NextHop", "hwBfdSessEvplId"],
    fieldOids: ["hwBfdSessCfgName": "1.3.6.1.4.1.2011.5.25.38.2.3.1.4", "hwBfdSessPeerAddr": "1.3.6.1.4.1.2011.5.25.38.2.3.1.5", "hwBfdSessBindIfIndex": "1.3.6.1.4.1.2011.5.25.38.2.3.1.6", "hwBfdSessBindIfName": "1.3.6.1.4.1.2011.5.25.38.2.3.1.7", "hwBfdSessDiag": "1.3.6.1.4.1.2011.5.25.38.2.3.1.18", "hwBfdSessVrfIndex": "1.3.6.1.4.1.2011.5.25.38.2.3.1.20", "hwBfdSessVPNName": "1.3.6.1.4.1.2011.5.25.38.2.3.1.21", "hwBfdSessType": "1.3.6.1.4.1.2011.5.25.38.2.3.1.22", "hwBfdSessDefaultIp": "1.3.6.1.4.1.2011.5.25.38.2.3.1.24", "hwBfdSessBindType": "1.3.6.1.4.1.2011.5.25.38.2.3.1.26", "hwBfdSessStaticLspName": "1.3.6.1.4.1.2011.5.25.38.2.3.1.28", "hwBfdSessPWSecondaryFlag": "1.3.6.1.4.1.2011.5.25.38.2.3.1.30", "hwBfdSessNextHop": "1.3.6.1.4.1.2011.5.25.38.2.3.1.27", "hwBfdSessVcId": "1.3.6.1.4.1.2011.5.25.38.2.3.1.32", "hwBfdSessVsiName": "1.3.6.1.4.1.2011.5.25.38.2.3.1.33", "hwBfdSessVsiPeerAddr": "1.3.6.1.4.1.2011.5.25.38.2.3.1.34", "hwBfdSessDiscrAuto": "1.3.6.1.4.1.2011.5.25.38.2.3.1.35", "hwBfdSessPeerIpv6Addr": "1.3.6.1.4.1.2011.5.25.38.2.3.1.36", "hwBfdSessIpv6NextHop": "1.3.6.1.4.1.2011.5.25.38.2.3.1.38", "hwBfdSessEvplId": "1.3.6.1.4.1.2011.5.25.38.2.3.1.67"]
]

// --- hwBfdSessUp (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.38.3.2
// Fields: hwBfdSessCfgName, hwBfdSessPeerAddr, hwBfdSessBindIfIndex, hwBfdSessBindIfName, hwBfdSessDiag, hwBfdSessVrfIndex, hwBfdSessVPNName, hwBfdSessType, hwBfdSessDefaultIp, hwBfdSessBindType, hwBfdSessStaticLspName, hwBfdSessPWSecondaryFlag, hwBfdSessNextHop, hwBfdSessVcId, hwBfdSessVsiName, hwBfdSessVsiPeerAddr, hwBfdSessDiscrAuto, hwBfdSessPeerIpv6Addr, hwBfdSessIpv6NextHop, hwBfdSessEvplId
// Description: This trap occurred when the state of the BFD session became up. The BFD session is characterized by the objects in this node.
trapMap["1.3.6.1.4.1.2011.5.25.38.3.2"] = [
    name: "hwBfdSessUp",
    fields: ["hwBfdSessCfgName", "hwBfdSessPeerAddr", "hwBfdSessBindIfIndex", "hwBfdSessBindIfName", "hwBfdSessDiag", "hwBfdSessVrfIndex", "hwBfdSessVPNName", "hwBfdSessType", "hwBfdSessDefaultIp", "hwBfdSessBindType", "hwBfdSessStaticLspName", "hwBfdSessPWSecondaryFlag", "hwBfdSessNextHop", "hwBfdSessVcId", "hwBfdSessVsiName", "hwBfdSessVsiPeerAddr", "hwBfdSessDiscrAuto", "hwBfdSessPeerIpv6Addr", "hwBfdSessIpv6NextHop", "hwBfdSessEvplId"],
    fieldOids: ["hwBfdSessCfgName": "1.3.6.1.4.1.2011.5.25.38.2.3.1.4", "hwBfdSessPeerAddr": "1.3.6.1.4.1.2011.5.25.38.2.3.1.5", "hwBfdSessBindIfIndex": "1.3.6.1.4.1.2011.5.25.38.2.3.1.6", "hwBfdSessBindIfName": "1.3.6.1.4.1.2011.5.25.38.2.3.1.7", "hwBfdSessDiag": "1.3.6.1.4.1.2011.5.25.38.2.3.1.18", "hwBfdSessVrfIndex": "1.3.6.1.4.1.2011.5.25.38.2.3.1.20", "hwBfdSessVPNName": "1.3.6.1.4.1.2011.5.25.38.2.3.1.21", "hwBfdSessType": "1.3.6.1.4.1.2011.5.25.38.2.3.1.22", "hwBfdSessDefaultIp": "1.3.6.1.4.1.2011.5.25.38.2.3.1.24", "hwBfdSessBindType": "1.3.6.1.4.1.2011.5.25.38.2.3.1.26", "hwBfdSessStaticLspName": "1.3.6.1.4.1.2011.5.25.38.2.3.1.28", "hwBfdSessPWSecondaryFlag": "1.3.6.1.4.1.2011.5.25.38.2.3.1.30", "hwBfdSessNextHop": "1.3.6.1.4.1.2011.5.25.38.2.3.1.27", "hwBfdSessVcId": "1.3.6.1.4.1.2011.5.25.38.2.3.1.32", "hwBfdSessVsiName": "1.3.6.1.4.1.2011.5.25.38.2.3.1.33", "hwBfdSessVsiPeerAddr": "1.3.6.1.4.1.2011.5.25.38.2.3.1.34", "hwBfdSessDiscrAuto": "1.3.6.1.4.1.2011.5.25.38.2.3.1.35", "hwBfdSessPeerIpv6Addr": "1.3.6.1.4.1.2011.5.25.38.2.3.1.36", "hwBfdSessIpv6NextHop": "1.3.6.1.4.1.2011.5.25.38.2.3.1.38", "hwBfdSessEvplId": "1.3.6.1.4.1.2011.5.25.38.2.3.1.67"]
]

// --- hwBfdSessReachLimit (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.38.3.3
// Fields: hwBfdSessLimitNumber
// Description: There is the notify when the session number reach the global limit.
trapMap["1.3.6.1.4.1.2011.5.25.38.3.3"] = [
    name: "hwBfdSessReachLimit",
    fields: ["hwBfdSessLimitNumber"],
    fieldOids: ["hwBfdSessLimitNumber": "1.3.6.1.4.1.2011.5.25.38.1.3"]
]

// --- hwBfdSessReachLimitBindIf (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.38.3.4
// Fields: hwBfdSessConfBindIfName, hwBfdSessInterfaceLimitNumber
// Description: There is the notify when the session number reach the interface limit.
trapMap["1.3.6.1.4.1.2011.5.25.38.3.4"] = [
    name: "hwBfdSessReachLimitBindIf",
    fields: ["hwBfdSessConfBindIfName", "hwBfdSessInterfaceLimitNumber"],
    fieldOids: ["hwBfdSessConfBindIfName": "1.3.6.1.4.1.2011.5.25.38.2.2.1.7", "hwBfdSessInterfaceLimitNumber": "1.3.6.1.4.1.2011.5.25.38.1.4"]
]

// --- hwBfdSessReachLimitResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.38.3.5
// Fields: hwBfdSessLimitNumber
// Description: There is the notify when the session number reach the global limit was cleared.
trapMap["1.3.6.1.4.1.2011.5.25.38.3.5"] = [
    name: "hwBfdSessReachLimitResume",
    fields: ["hwBfdSessLimitNumber"],
    fieldOids: ["hwBfdSessLimitNumber": "1.3.6.1.4.1.2011.5.25.38.1.3"]
]

// --- hwBfdSessReachLimitBindIfResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.38.3.6
// Fields: hwBfdSessConfBindIfName, hwBfdSessInterfaceLimitNumber, hwBfdLimitDeviceName
// Description: There is the notify when the session number reach the interface limit was cleared.
trapMap["1.3.6.1.4.1.2011.5.25.38.3.6"] = [
    name: "hwBfdSessReachLimitBindIfResume",
    fields: ["hwBfdSessConfBindIfName", "hwBfdSessInterfaceLimitNumber", "hwBfdLimitDeviceName"],
    fieldOids: ["hwBfdSessConfBindIfName": "1.3.6.1.4.1.2011.5.25.38.2.2.1.7", "hwBfdSessInterfaceLimitNumber": "1.3.6.1.4.1.2011.5.25.38.1.4", "hwBfdLimitDeviceName": "1.3.6.1.4.1.2011.5.25.38.1.15"]
]

// --- hwBfdSessCfgRemoteFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.38.3.7
// Fields: hwBfdSessCfgName, hwBfdSessLocalDiscr, hwBfdSessCfgRemoteFailType
// Description: This notification is generated when the virtual access AP process BFD configuration failed.
trapMap["1.3.6.1.4.1.2011.5.25.38.3.7"] = [
    name: "hwBfdSessCfgRemoteFail",
    fields: ["hwBfdSessCfgName", "hwBfdSessLocalDiscr", "hwBfdSessCfgRemoteFailType"],
    fieldOids: ["hwBfdSessCfgName": "1.3.6.1.4.1.2011.5.25.38.2.3.1.4", "hwBfdSessLocalDiscr": "1.3.6.1.4.1.2011.5.25.38.2.3.1.8", "hwBfdSessCfgRemoteFailType": "1.3.6.1.4.1.2011.5.25.38.1.19"]
]

// --- hwBfdSessFaultDown (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.38.3.8
// Fields: hwBfdSessCfgName, hwBfdSessLocalDiscr, hwBfdSessDiag, hwBfdSessBindIfName, hwBfdSessDescription, hwBfdSessFeNodeID, hwBfdSessPeerInetAddr, hwBfdSessLinkType, hwBfdSessVPNName, hwBfdSessTunnelName, hwBfdSessDownReason
// Description: This trap occurred when the state of the BFD session became down. The BFD session is characterized by the objects in this node.
trapMap["1.3.6.1.4.1.2011.5.25.38.3.8"] = [
    name: "hwBfdSessFaultDown",
    fields: ["hwBfdSessCfgName", "hwBfdSessLocalDiscr", "hwBfdSessDiag", "hwBfdSessBindIfName", "hwBfdSessDescription", "hwBfdSessFeNodeID", "hwBfdSessPeerInetAddr", "hwBfdSessLinkType", "hwBfdSessVPNName", "hwBfdSessTunnelName", "hwBfdSessDownReason"],
    fieldOids: ["hwBfdSessCfgName": "1.3.6.1.4.1.2011.5.25.38.2.3.1.4", "hwBfdSessLocalDiscr": "1.3.6.1.4.1.2011.5.25.38.2.3.1.8", "hwBfdSessDiag": "1.3.6.1.4.1.2011.5.25.38.2.3.1.18", "hwBfdSessBindIfName": "1.3.6.1.4.1.2011.5.25.38.2.3.1.7", "hwBfdSessDescription": "1.3.6.1.4.1.2011.5.25.38.2.3.1.62", "hwBfdSessFeNodeID": "1.3.6.1.4.1.2011.5.25.38.2.3.1.63", "hwBfdSessPeerInetAddr": "1.3.6.1.4.1.2011.5.25.38.2.3.1.56", "hwBfdSessLinkType": "1.3.6.1.4.1.2011.5.25.38.2.3.1.64", "hwBfdSessVPNName": "1.3.6.1.4.1.2011.5.25.38.2.3.1.21", "hwBfdSessTunnelName": "1.3.6.1.4.1.2011.5.25.38.2.3.1.65", "hwBfdSessDownReason": "1.3.6.1.4.1.2011.5.25.38.2.3.1.66"]
]

// --- hwBfdSessResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.38.3.9
// Fields: hwBfdSessCfgName, hwBfdSessLocalDiscr, hwBfdSessDiag, hwBfdSessBindIfName, hwBfdSessDescription, hwBfdSessFeNodeID, hwBfdSessPeerInetAddr, hwBfdSessLinkType, hwBfdSessVPNName, hwBfdSessTunnelName, hwBfdSessDownReason
// Description: This trap occurred when the state of the BFD session resume from down state. The BFD session is characterized by the objects in this node.
trapMap["1.3.6.1.4.1.2011.5.25.38.3.9"] = [
    name: "hwBfdSessResume",
    fields: ["hwBfdSessCfgName", "hwBfdSessLocalDiscr", "hwBfdSessDiag", "hwBfdSessBindIfName", "hwBfdSessDescription", "hwBfdSessFeNodeID", "hwBfdSessPeerInetAddr", "hwBfdSessLinkType", "hwBfdSessVPNName", "hwBfdSessTunnelName", "hwBfdSessDownReason"],
    fieldOids: ["hwBfdSessCfgName": "1.3.6.1.4.1.2011.5.25.38.2.3.1.4", "hwBfdSessLocalDiscr": "1.3.6.1.4.1.2011.5.25.38.2.3.1.8", "hwBfdSessDiag": "1.3.6.1.4.1.2011.5.25.38.2.3.1.18", "hwBfdSessBindIfName": "1.3.6.1.4.1.2011.5.25.38.2.3.1.7", "hwBfdSessDescription": "1.3.6.1.4.1.2011.5.25.38.2.3.1.62", "hwBfdSessFeNodeID": "1.3.6.1.4.1.2011.5.25.38.2.3.1.63", "hwBfdSessPeerInetAddr": "1.3.6.1.4.1.2011.5.25.38.2.3.1.56", "hwBfdSessLinkType": "1.3.6.1.4.1.2011.5.25.38.2.3.1.64", "hwBfdSessVPNName": "1.3.6.1.4.1.2011.5.25.38.2.3.1.21", "hwBfdSessTunnelName": "1.3.6.1.4.1.2011.5.25.38.2.3.1.65", "hwBfdSessDownReason": "1.3.6.1.4.1.2011.5.25.38.2.3.1.66"]
]

// --- hwBfdSessApOperFailed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.38.3.10
// Fields: hwBfdCfgApUserName, hwBfdCfgApIPAddress, hwBfdCfgApID, hwBfdCfgApOperation, hwBfdCfgApReason
// Description: This trap occurred when failed to config access point.
trapMap["1.3.6.1.4.1.2011.5.25.38.3.10"] = [
    name: "hwBfdSessApOperFailed",
    fields: ["hwBfdCfgApUserName", "hwBfdCfgApIPAddress", "hwBfdCfgApID", "hwBfdCfgApOperation", "hwBfdCfgApReason"],
    fieldOids: ["hwBfdCfgApUserName": "1.3.6.1.4.1.2011.5.25.38.5.2", "hwBfdCfgApIPAddress": "1.3.6.1.4.1.2011.5.25.38.5.3", "hwBfdCfgApID": "1.3.6.1.4.1.2011.5.25.38.5.4", "hwBfdCfgApOperation": "1.3.6.1.4.1.2011.5.25.38.5.5", "hwBfdCfgApReason": "1.3.6.1.4.1.2011.5.25.38.5.6"]
]

// --- hwBfdSessFsmDiscordant (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.38.3.11
// Fields: hwBfdSessCfgName, hwBfdSessLocalDiscr, hwBfdSessDiag, hwBfdSessBindIfName
// Description: This trap occurred when the state of the BFD session FSM's board is different from the monitored link's board. The BFD session is characterized by the objects in this node.
trapMap["1.3.6.1.4.1.2011.5.25.38.3.11"] = [
    name: "hwBfdSessFsmDiscordant",
    fields: ["hwBfdSessCfgName", "hwBfdSessLocalDiscr", "hwBfdSessDiag", "hwBfdSessBindIfName"],
    fieldOids: ["hwBfdSessCfgName": "1.3.6.1.4.1.2011.5.25.38.2.3.1.4", "hwBfdSessLocalDiscr": "1.3.6.1.4.1.2011.5.25.38.2.3.1.8", "hwBfdSessDiag": "1.3.6.1.4.1.2011.5.25.38.2.3.1.18", "hwBfdSessBindIfName": "1.3.6.1.4.1.2011.5.25.38.2.3.1.7"]
]

// --- hwBfdSessFsmAccordant (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.38.3.12
// Fields: hwBfdSessCfgName, hwBfdSessLocalDiscr, hwBfdSessDiag, hwBfdSessBindIfName
// Description: This trap occurred when the state of the BFD session FSM's board is the same as the monitored link's board. The BFD session is characterized by the objects in this node.
trapMap["1.3.6.1.4.1.2011.5.25.38.3.12"] = [
    name: "hwBfdSessFsmAccordant",
    fields: ["hwBfdSessCfgName", "hwBfdSessLocalDiscr", "hwBfdSessDiag", "hwBfdSessBindIfName"],
    fieldOids: ["hwBfdSessCfgName": "1.3.6.1.4.1.2011.5.25.38.2.3.1.4", "hwBfdSessLocalDiscr": "1.3.6.1.4.1.2011.5.25.38.2.3.1.8", "hwBfdSessDiag": "1.3.6.1.4.1.2011.5.25.38.2.3.1.18", "hwBfdSessBindIfName": "1.3.6.1.4.1.2011.5.25.38.2.3.1.7"]
]

// --- hwBfdIPv6SessDown (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.38.3.13
// Fields: hwBfdSessCfgName, hwBfdSessBindIfIndex, hwBfdSessBindIfName, hwBfdSessDiag, hwBfdSessVrfIndex, hwBfdSessVPNName, hwBfdSessType, hwBfdSessBindType, hwBfdSessStaticLspName, hwBfdSessPWSecondaryFlag, hwBfdSessVcId, hwBfdSessVsiName, hwBfdSessVsiPeerAddr, hwBfdSessDiscrAuto, hwBfdSessPeerIpv6Addr, hwBfdSessIpv6NextHop, hwBfdSessEvplId
// Description: This trap occurred when the state of the BFD IPv6 session became down. The BFD session is characterized by the objects in this node.
trapMap["1.3.6.1.4.1.2011.5.25.38.3.13"] = [
    name: "hwBfdIPv6SessDown",
    fields: ["hwBfdSessCfgName", "hwBfdSessBindIfIndex", "hwBfdSessBindIfName", "hwBfdSessDiag", "hwBfdSessVrfIndex", "hwBfdSessVPNName", "hwBfdSessType", "hwBfdSessBindType", "hwBfdSessStaticLspName", "hwBfdSessPWSecondaryFlag", "hwBfdSessVcId", "hwBfdSessVsiName", "hwBfdSessVsiPeerAddr", "hwBfdSessDiscrAuto", "hwBfdSessPeerIpv6Addr", "hwBfdSessIpv6NextHop", "hwBfdSessEvplId"],
    fieldOids: ["hwBfdSessCfgName": "1.3.6.1.4.1.2011.5.25.38.2.3.1.4", "hwBfdSessBindIfIndex": "1.3.6.1.4.1.2011.5.25.38.2.3.1.6", "hwBfdSessBindIfName": "1.3.6.1.4.1.2011.5.25.38.2.3.1.7", "hwBfdSessDiag": "1.3.6.1.4.1.2011.5.25.38.2.3.1.18", "hwBfdSessVrfIndex": "1.3.6.1.4.1.2011.5.25.38.2.3.1.20", "hwBfdSessVPNName": "1.3.6.1.4.1.2011.5.25.38.2.3.1.21", "hwBfdSessType": "1.3.6.1.4.1.2011.5.25.38.2.3.1.22", "hwBfdSessBindType": "1.3.6.1.4.1.2011.5.25.38.2.3.1.26", "hwBfdSessStaticLspName": "1.3.6.1.4.1.2011.5.25.38.2.3.1.28", "hwBfdSessPWSecondaryFlag": "1.3.6.1.4.1.2011.5.25.38.2.3.1.30", "hwBfdSessVcId": "1.3.6.1.4.1.2011.5.25.38.2.3.1.32", "hwBfdSessVsiName": "1.3.6.1.4.1.2011.5.25.38.2.3.1.33", "hwBfdSessVsiPeerAddr": "1.3.6.1.4.1.2011.5.25.38.2.3.1.34", "hwBfdSessDiscrAuto": "1.3.6.1.4.1.2011.5.25.38.2.3.1.35", "hwBfdSessPeerIpv6Addr": "1.3.6.1.4.1.2011.5.25.38.2.3.1.36", "hwBfdSessIpv6NextHop": "1.3.6.1.4.1.2011.5.25.38.2.3.1.38", "hwBfdSessEvplId": "1.3.6.1.4.1.2011.5.25.38.2.3.1.67"]
]

// --- hwBfdIPv6SessUp (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.38.3.14
// Fields: hwBfdSessCfgName, hwBfdSessBindIfIndex, hwBfdSessBindIfName, hwBfdSessDiag, hwBfdSessVrfIndex, hwBfdSessVPNName, hwBfdSessType, hwBfdSessBindType, hwBfdSessStaticLspName, hwBfdSessPWSecondaryFlag, hwBfdSessVcId, hwBfdSessVsiName, hwBfdSessVsiPeerAddr, hwBfdSessDiscrAuto, hwBfdSessPeerIpv6Addr, hwBfdSessIpv6NextHop, hwBfdSessEvplId
// Description: This trap occurred when the state of the BFD IPv6 session became up. The BFD session is characterized by the objects in this node.
trapMap["1.3.6.1.4.1.2011.5.25.38.3.14"] = [
    name: "hwBfdIPv6SessUp",
    fields: ["hwBfdSessCfgName", "hwBfdSessBindIfIndex", "hwBfdSessBindIfName", "hwBfdSessDiag", "hwBfdSessVrfIndex", "hwBfdSessVPNName", "hwBfdSessType", "hwBfdSessBindType", "hwBfdSessStaticLspName", "hwBfdSessPWSecondaryFlag", "hwBfdSessVcId", "hwBfdSessVsiName", "hwBfdSessVsiPeerAddr", "hwBfdSessDiscrAuto", "hwBfdSessPeerIpv6Addr", "hwBfdSessIpv6NextHop", "hwBfdSessEvplId"],
    fieldOids: ["hwBfdSessCfgName": "1.3.6.1.4.1.2011.5.25.38.2.3.1.4", "hwBfdSessBindIfIndex": "1.3.6.1.4.1.2011.5.25.38.2.3.1.6", "hwBfdSessBindIfName": "1.3.6.1.4.1.2011.5.25.38.2.3.1.7", "hwBfdSessDiag": "1.3.6.1.4.1.2011.5.25.38.2.3.1.18", "hwBfdSessVrfIndex": "1.3.6.1.4.1.2011.5.25.38.2.3.1.20", "hwBfdSessVPNName": "1.3.6.1.4.1.2011.5.25.38.2.3.1.21", "hwBfdSessType": "1.3.6.1.4.1.2011.5.25.38.2.3.1.22", "hwBfdSessBindType": "1.3.6.1.4.1.2011.5.25.38.2.3.1.26", "hwBfdSessStaticLspName": "1.3.6.1.4.1.2011.5.25.38.2.3.1.28", "hwBfdSessPWSecondaryFlag": "1.3.6.1.4.1.2011.5.25.38.2.3.1.30", "hwBfdSessVcId": "1.3.6.1.4.1.2011.5.25.38.2.3.1.32", "hwBfdSessVsiName": "1.3.6.1.4.1.2011.5.25.38.2.3.1.33", "hwBfdSessVsiPeerAddr": "1.3.6.1.4.1.2011.5.25.38.2.3.1.34", "hwBfdSessDiscrAuto": "1.3.6.1.4.1.2011.5.25.38.2.3.1.35", "hwBfdSessPeerIpv6Addr": "1.3.6.1.4.1.2011.5.25.38.2.3.1.36", "hwBfdSessIpv6NextHop": "1.3.6.1.4.1.2011.5.25.38.2.3.1.38", "hwBfdSessEvplId": "1.3.6.1.4.1.2011.5.25.38.2.3.1.67"]
]

// --- hwBfdBitErrorDetectSessReachLimit (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.38.3.15
// Fields: hwBfdBitErrorDetectSessLimitNumber
// Description: There is the notify when the bit-error-detection session number reach the global limit.
trapMap["1.3.6.1.4.1.2011.5.25.38.3.15"] = [
    name: "hwBfdBitErrorDetectSessReachLimit",
    fields: ["hwBfdBitErrorDetectSessLimitNumber"],
    fieldOids: ["hwBfdBitErrorDetectSessLimitNumber": "1.3.6.1.4.1.2011.5.25.38.1.20"]
]

// --- hwBfdSessReachTotalLimit (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.38.3.16
// Fields: hwBfdSessLimitNumber
// Description: The session number in all the IO boards has reached the limit, the new session can not be created.
trapMap["1.3.6.1.4.1.2011.5.25.38.3.16"] = [
    name: "hwBfdSessReachTotalLimit",
    fields: ["hwBfdSessLimitNumber"],
    fieldOids: ["hwBfdSessLimitNumber": "1.3.6.1.4.1.2011.5.25.38.1.3"]
]

// --- hwBfdSessReachTotalLimitResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.38.3.17
// Fields: hwBfdSessLimitNumber
// Description: The number of BFD sessions is restored within the specified range, the new session can be created.
trapMap["1.3.6.1.4.1.2011.5.25.38.3.17"] = [
    name: "hwBfdSessReachTotalLimitResume",
    fields: ["hwBfdSessLimitNumber"],
    fieldOids: ["hwBfdSessLimitNumber": "1.3.6.1.4.1.2011.5.25.38.1.3"]
]

// --- hwBfdSessCreateFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.38.3.18
// Fields: hwBfdServiceName
// Description: The BFD session fails to be created for the service.
trapMap["1.3.6.1.4.1.2011.5.25.38.3.18"] = [
    name: "hwBfdSessCreateFail",
    fields: ["hwBfdServiceName"],
    fieldOids: ["hwBfdServiceName": "1.3.6.1.4.1.2011.5.25.38.1.22"]
]

// --- hwBfdSessCreateFailResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.38.3.19
// Fields: hwBfdServiceName
// Description: The alarm indicating that the BFD session fails to be created is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.38.3.19"] = [
    name: "hwBfdSessCreateFailResume",
    fields: ["hwBfdServiceName"],
    fieldOids: ["hwBfdServiceName": "1.3.6.1.4.1.2011.5.25.38.1.22"]
]

// --- hwBfdSliceAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.38.3.20
// Fields: hwBfdAlarmSlotId
// Description: In HBH network slicing scenarios, the BFD for SRv6 TE Policy session does not support the loose mode on the board.
trapMap["1.3.6.1.4.1.2011.5.25.38.3.20"] = [
    name: "hwBfdSliceAlarm",
    fields: ["hwBfdAlarmSlotId"],
    fieldOids: ["hwBfdAlarmSlotId": "1.3.6.1.4.1.2011.5.25.38.1.23"]
]

// --- hwBfdSliceAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.38.3.21
// Fields: hwBfdAlarmSlotId
// Description: The alarm indicating that the BFD for SRv6 TE Policy session does not support the loose mode on the board in HBH network slicing scenarios is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.38.3.21"] = [
    name: "hwBfdSliceAlarmResume",
    fields: ["hwBfdAlarmSlotId"],
    fieldOids: ["hwBfdAlarmSlotId": "1.3.6.1.4.1.2011.5.25.38.1.23"]
]

// --- hwBfdSelectBoardWarn (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.38.3.22
// Fields: hwBfdSelectBoardAlarmSlotId
// Description: When the board selection result of a board selection session is the board but the board is not a member board of the session, an alarm about the board is reported.
trapMap["1.3.6.1.4.1.2011.5.25.38.3.22"] = [
    name: "hwBfdSelectBoardWarn",
    fields: ["hwBfdSelectBoardAlarmSlotId"],
    fieldOids: ["hwBfdSelectBoardAlarmSlotId": "1.3.6.1.4.1.2011.5.25.38.1.24"]
]

// --- hwBfdSelectBoardWarnResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.38.3.23
// Fields: hwBfdSelectBoardAlarmSlotId
// Description: This alarm is cleared when the board is a member board of all member interfaces on the board.
trapMap["1.3.6.1.4.1.2011.5.25.38.3.23"] = [
    name: "hwBfdSelectBoardWarnResume",
    fields: ["hwBfdSelectBoardAlarmSlotId"],
    fieldOids: ["hwBfdSelectBoardAlarmSlotId": "1.3.6.1.4.1.2011.5.25.38.1.24"]
]

// --- hwBfdSessUpTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.38.6.2.0.1
// Fields: hwBfdSessLocalDiscr, hwBfdSessVlanID, hwBfdSessSourceAddr, hwBfdSessNextHop, hwBfdSessIndex, hwBfdSessPeerAddr, hwBfdSessBindType, hwBfdSessVrfIndex
// Description: This notification is generated when the bfdSessState object for one entry in bfdSessionTable is about to enter the up(3) state from some other state.
trapMap["1.3.6.1.4.1.2011.5.25.38.6.2.0.1"] = [
    name: "hwBfdSessUpTrap",
    fields: ["hwBfdSessLocalDiscr", "hwBfdSessVlanID", "hwBfdSessSourceAddr", "hwBfdSessNextHop", "hwBfdSessIndex", "hwBfdSessPeerAddr", "hwBfdSessBindType", "hwBfdSessVrfIndex"],
    fieldOids: ["hwBfdSessLocalDiscr": "1.3.6.1.4.1.2011.5.25.38.2.3.1.8", "hwBfdSessVlanID": "1.3.6.1.4.1.2011.5.25.38.5.1", "hwBfdSessSourceAddr": "1.3.6.1.4.1.2011.5.25.38.2.3.1.19", "hwBfdSessNextHop": "1.3.6.1.4.1.2011.5.25.38.2.3.1.27", "hwBfdSessIndex": "1.3.6.1.4.1.2011.5.25.38.2.3.1.1", "hwBfdSessPeerAddr": "1.3.6.1.4.1.2011.5.25.38.2.3.1.5", "hwBfdSessBindType": "1.3.6.1.4.1.2011.5.25.38.2.3.1.26", "hwBfdSessVrfIndex": "1.3.6.1.4.1.2011.5.25.38.2.3.1.20"]
]

// --- hwBfdSessDownTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.38.6.2.0.2
// Fields: hwBfdSessLocalDiscr, hwBfdSessVlanID, hwBfdSessSourceAddr, hwBfdSessNextHop, hwBfdSessIndex, hwBfdSessPeerAddr, hwBfdSessBindType, hwBfdSessVrfIndex
// Description: This notification is generated when the bfdSessState object for one entry in bfdSessionTable is about to enter the down(1) or adminDown(0) states from some other state.
trapMap["1.3.6.1.4.1.2011.5.25.38.6.2.0.2"] = [
    name: "hwBfdSessDownTrap",
    fields: ["hwBfdSessLocalDiscr", "hwBfdSessVlanID", "hwBfdSessSourceAddr", "hwBfdSessNextHop", "hwBfdSessIndex", "hwBfdSessPeerAddr", "hwBfdSessBindType", "hwBfdSessVrfIndex"],
    fieldOids: ["hwBfdSessLocalDiscr": "1.3.6.1.4.1.2011.5.25.38.2.3.1.8", "hwBfdSessVlanID": "1.3.6.1.4.1.2011.5.25.38.5.1", "hwBfdSessSourceAddr": "1.3.6.1.4.1.2011.5.25.38.2.3.1.19", "hwBfdSessNextHop": "1.3.6.1.4.1.2011.5.25.38.2.3.1.27", "hwBfdSessIndex": "1.3.6.1.4.1.2011.5.25.38.2.3.1.1", "hwBfdSessPeerAddr": "1.3.6.1.4.1.2011.5.25.38.2.3.1.5", "hwBfdSessBindType": "1.3.6.1.4.1.2011.5.25.38.2.3.1.26", "hwBfdSessVrfIndex": "1.3.6.1.4.1.2011.5.25.38.2.3.1.20"]
]

// --- hwBfdv6SingleHopSessUpTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.38.6.2.0.3
// Fields: hwBfdSessIndex, hwBfdSessVlanID, hwBfdSessSourceIpv6Addr, hwBfdSessPeerIpv6Addr
// Description: This notification is generated when the bfdSessState object for one entry in bfdSessionTable is about to enter the up(3) state from some other state.
trapMap["1.3.6.1.4.1.2011.5.25.38.6.2.0.3"] = [
    name: "hwBfdv6SingleHopSessUpTrap",
    fields: ["hwBfdSessIndex", "hwBfdSessVlanID", "hwBfdSessSourceIpv6Addr", "hwBfdSessPeerIpv6Addr"],
    fieldOids: ["hwBfdSessIndex": "1.3.6.1.4.1.2011.5.25.38.2.3.1.1", "hwBfdSessVlanID": "1.3.6.1.4.1.2011.5.25.38.5.1", "hwBfdSessSourceIpv6Addr": "1.3.6.1.4.1.2011.5.25.38.2.3.1.37", "hwBfdSessPeerIpv6Addr": "1.3.6.1.4.1.2011.5.25.38.2.3.1.36"]
]

// --- hwBfdv6SingleHopSessDownTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.38.6.2.0.4
// Fields: hwBfdSessIndex, hwBfdSessVlanID, hwBfdSessSourceIpv6Addr, hwBfdSessPeerIpv6Addr
// Description: This notification is generated when the bfdSessState object for one entry in bfdSessionTable is about to enter the down(1) or adminDown(0) states from some other state.
trapMap["1.3.6.1.4.1.2011.5.25.38.6.2.0.4"] = [
    name: "hwBfdv6SingleHopSessDownTrap",
    fields: ["hwBfdSessIndex", "hwBfdSessVlanID", "hwBfdSessSourceIpv6Addr", "hwBfdSessPeerIpv6Addr"],
    fieldOids: ["hwBfdSessIndex": "1.3.6.1.4.1.2011.5.25.38.2.3.1.1", "hwBfdSessVlanID": "1.3.6.1.4.1.2011.5.25.38.5.1", "hwBfdSessSourceIpv6Addr": "1.3.6.1.4.1.2011.5.25.38.2.3.1.37", "hwBfdSessPeerIpv6Addr": "1.3.6.1.4.1.2011.5.25.38.2.3.1.36"]
]

// --- hwBfdv6MultiHopSessUpTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.38.6.2.0.5
// Fields: hwBfdSessIndex, hwBfdSessVrfIndex, hwBfdSessSourceIpv6Addr, hwBfdSessPeerIpv6Addr
// Description: This notification is generated when the bfdSessState object for one entry in bfdSessionTable is about to enter the up(3) state from some other state.
trapMap["1.3.6.1.4.1.2011.5.25.38.6.2.0.5"] = [
    name: "hwBfdv6MultiHopSessUpTrap",
    fields: ["hwBfdSessIndex", "hwBfdSessVrfIndex", "hwBfdSessSourceIpv6Addr", "hwBfdSessPeerIpv6Addr"],
    fieldOids: ["hwBfdSessIndex": "1.3.6.1.4.1.2011.5.25.38.2.3.1.1", "hwBfdSessVrfIndex": "1.3.6.1.4.1.2011.5.25.38.2.3.1.20", "hwBfdSessSourceIpv6Addr": "1.3.6.1.4.1.2011.5.25.38.2.3.1.37", "hwBfdSessPeerIpv6Addr": "1.3.6.1.4.1.2011.5.25.38.2.3.1.36"]
]

// --- hwBfdv6MultiHopSessDownTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.38.6.2.0.6
// Fields: hwBfdSessIndex, hwBfdSessVrfIndex, hwBfdSessSourceIpv6Addr, hwBfdSessPeerIpv6Addr
// Description: This notification is generated when the bfdSessState object for one entry in bfdSessionTable is about to enter the down(1) or adminDown(0) states from some other state.
trapMap["1.3.6.1.4.1.2011.5.25.38.6.2.0.6"] = [
    name: "hwBfdv6MultiHopSessDownTrap",
    fields: ["hwBfdSessIndex", "hwBfdSessVrfIndex", "hwBfdSessSourceIpv6Addr", "hwBfdSessPeerIpv6Addr"],
    fieldOids: ["hwBfdSessIndex": "1.3.6.1.4.1.2011.5.25.38.2.3.1.1", "hwBfdSessVrfIndex": "1.3.6.1.4.1.2011.5.25.38.2.3.1.20", "hwBfdSessSourceIpv6Addr": "1.3.6.1.4.1.2011.5.25.38.2.3.1.37", "hwBfdSessPeerIpv6Addr": "1.3.6.1.4.1.2011.5.25.38.2.3.1.36"]
]

// --- hwBfdPWSessUp (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.38.6.2.0.7
// Fields: hwBfdSessIndex, hwBfdSessCfgName, hwBfdSessLocalDiscr, hwBfdSessDiag, hwBfdSessBindType, hwBfdSessPWSecondaryFlag, hwBfdSessPWId, hwBfdSessVsiName, hwBfdSessVsiPeerAddr
// Description: This notification is generated when the bfdSessState object for one entry in bfdSessionTable is about to enter the up(3) state from some other state.
trapMap["1.3.6.1.4.1.2011.5.25.38.6.2.0.7"] = [
    name: "hwBfdPWSessUp",
    fields: ["hwBfdSessIndex", "hwBfdSessCfgName", "hwBfdSessLocalDiscr", "hwBfdSessDiag", "hwBfdSessBindType", "hwBfdSessPWSecondaryFlag", "hwBfdSessPWId", "hwBfdSessVsiName", "hwBfdSessVsiPeerAddr"],
    fieldOids: ["hwBfdSessIndex": "1.3.6.1.4.1.2011.5.25.38.2.3.1.1", "hwBfdSessCfgName": "1.3.6.1.4.1.2011.5.25.38.2.3.1.4", "hwBfdSessLocalDiscr": "1.3.6.1.4.1.2011.5.25.38.2.3.1.8", "hwBfdSessDiag": "1.3.6.1.4.1.2011.5.25.38.2.3.1.18", "hwBfdSessBindType": "1.3.6.1.4.1.2011.5.25.38.2.3.1.26", "hwBfdSessPWSecondaryFlag": "1.3.6.1.4.1.2011.5.25.38.2.3.1.30", "hwBfdSessPWId": "1.3.6.1.4.1.2011.5.25.38.2.3.1.61", "hwBfdSessVsiName": "1.3.6.1.4.1.2011.5.25.38.2.3.1.33", "hwBfdSessVsiPeerAddr": "1.3.6.1.4.1.2011.5.25.38.2.3.1.34"]
]

// --- hwBfdPWSessDown (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.38.6.2.0.8
// Fields: hwBfdSessIndex, hwBfdSessCfgName, hwBfdSessLocalDiscr, hwBfdSessDiag, hwBfdSessBindType, hwBfdSessPWSecondaryFlag, hwBfdSessPWId, hwBfdSessVsiName, hwBfdSessVsiPeerAddr
// Description: This notification is generated when the bfdSessState object for one entry in bfdSessionTable is about to enter the down(1) or adminDown(0) states from some other state.
trapMap["1.3.6.1.4.1.2011.5.25.38.6.2.0.8"] = [
    name: "hwBfdPWSessDown",
    fields: ["hwBfdSessIndex", "hwBfdSessCfgName", "hwBfdSessLocalDiscr", "hwBfdSessDiag", "hwBfdSessBindType", "hwBfdSessPWSecondaryFlag", "hwBfdSessPWId", "hwBfdSessVsiName", "hwBfdSessVsiPeerAddr"],
    fieldOids: ["hwBfdSessIndex": "1.3.6.1.4.1.2011.5.25.38.2.3.1.1", "hwBfdSessCfgName": "1.3.6.1.4.1.2011.5.25.38.2.3.1.4", "hwBfdSessLocalDiscr": "1.3.6.1.4.1.2011.5.25.38.2.3.1.8", "hwBfdSessDiag": "1.3.6.1.4.1.2011.5.25.38.2.3.1.18", "hwBfdSessBindType": "1.3.6.1.4.1.2011.5.25.38.2.3.1.26", "hwBfdSessPWSecondaryFlag": "1.3.6.1.4.1.2011.5.25.38.2.3.1.30", "hwBfdSessPWId": "1.3.6.1.4.1.2011.5.25.38.2.3.1.61", "hwBfdSessVsiName": "1.3.6.1.4.1.2011.5.25.38.2.3.1.33", "hwBfdSessVsiPeerAddr": "1.3.6.1.4.1.2011.5.25.38.2.3.1.34"]
]

// ===== Lookup tables (inlined) =====
def lookupTables = [:]

// ===== Parsing logic =====

// Set to true to enable diagnostic logging for this MIB parser
DEBUG = false

LOG_PREFIX = "[HUAWEI-BFD-MIB]"
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

// --- Trap rule overrides (alert group / severity) ---
def trapRuleName = trapInfo.name
def agent = ""
// --- Trap: hwBfdSessUp (OID 1.3.6.1.4.1.2011.5.25.38.3.2) ---
if (trapRuleName == "hwBfdSessUp") {
    event.setAlertGroup("BFD Session Status")
    def alertKey = "hwBfdSessionEntry." + gf[1]
    event.setAlertKey(alertKey)
    def summary = "Hw Bfd Sess Up" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(1)
    event.setEventType("2")
}
// --- Trap: hwBfdSessDown (OID 1.3.6.1.4.1.2011.5.25.38.3.1) ---
if (trapRuleName == "hwBfdSessDown") {
    event.setAlertGroup("BFD Session Status")
    def alertKey = "hwBfdSessionEntry." + gf[1]
    event.setAlertKey(alertKey)
    def summary = "Hw Bfd Sess Down" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(2)
    event.setEventType("1")
}
// --- Trap: hwBfdSessReachLimit (OID 1.3.6.1.4.1.2011.5.25.38.3.3) ---
if (trapRuleName == "hwBfdSessReachLimit") {
    event.setAlertGroup("BFD Session Limit")
    def alertKey = ""
    event.setAlertKey(alertKey)
    def summary = "Hw Bfd Sess Reach Limit" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(2)
    event.setEventType("13")
    def dyn = event.getDynamicFields() ?: [:]
    dyn["hwBfdSessLimitNumber"] = varbinds.get("hwBfdSessLimitNumber")
    event.setDynamicFields(dyn)
}
// --- Trap: hwBfdSessReachLimitBindIf (OID 1.3.6.1.4.1.2011.5.25.38.3.4) ---
if (trapRuleName == "hwBfdSessReachLimitBindIf") {
    event.setAlertGroup("BFD Session Limit")
    def alertKey = "hwBfdSessionEntry." + gf[1]
    event.setAlertKey(alertKey)
    def summary = "Hw Bfd Sess Reach Limit Bind If" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(2)
    event.setEventType("1")
    def dyn = event.getDynamicFields() ?: [:]
    dyn["hwBfdSessBindIfName"] = varbinds.get("hwBfdSessBindIfName")
    dyn["hwBfdSessInterfaceLimitNumber"] = varbinds.get("hwBfdSessInterfaceLimitNumber")
    event.setDynamicFields(dyn)
}

if (event.getAgentType() == null || event.getAgentType().trim().isEmpty()) {
    event.setAgentType(metadata?.get("agentType")?.toString() ?: "generic")
}
def pairKey = [event.getDomainId(), event.getAgentType(), event.getNode(), event.getAlertGroup(), event.getAlertKey()]
                    .findAll { it != null && it.toString().trim() != "" }
                    .collect { it.toString().trim() }.join("|")
event.setIdentifier(pairKey + "|" + event.getEventType())

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
