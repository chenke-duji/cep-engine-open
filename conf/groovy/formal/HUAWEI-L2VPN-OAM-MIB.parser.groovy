/**
 * Auto-generated from HUAWEI-L2VPN-OAM-MIB.mib
 * Generated: 2026-08-24T18:28:30.199106800
 * Traps/Notifications (44): hwL2vpnOamDloc, hwL2vpnOamDlocClear, hwL2vpnOamSd1Near, hwL2vpnOamSd1NearClear, hwL2vpnOamRdi, hwL2vpnOamRdiClear, hwL2vpnOamMeg, hwL2vpnOamMegClear, hwL2vpnOamMep, hwL2vpnOamMepClear, hwL2vpnOamPeriod, hwL2vpnOamPeriodClear, hwL2vpnOamAis, hwL2vpnOamAisClear, hwL2vpnOamSd2Near, hwL2vpnOamSd2NearClear, hwL2vpnOamLck, hwL2vpnOamLckClear, hwL2vpnOamCsf, hwL2vpnOamCsfClear, hwL2vpnOamExcess, hwL2vpnOamExcessClear, hwL2vpnOamMismatch, hwL2vpnOamMismatchClear, hwL2vpnOamMismerge, hwL2vpnOamMismergeClear, hwL2vpnOamFail, hwL2vpnOamFailClear, hwL2vpnOamDbdi, hwL2vpnOamDbdiClear, hwL2vpnOamUnknown, hwL2vpnOamUnknownClear, hwL2vpnOamLocalLock, hwL2vpnOamLocalLockClear, hwL2vpnOamSd1Far, hwL2vpnOamSd1FarClear, hwL2vpnOamSd2Far, hwL2vpnOamSd2FarClear, hwL2vpnOamFdi, hwL2vpnOamFdiClear, hwL2vpnOamTunnelNonSupport, hwL2vpnOamTunnelNonSupportResumed, hwL2vpnOamPmNonSupport, hwL2vpnOamPmNonSupportResumed
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

// --- hwL2vpnOamDloc (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.119.9.2.1
// Fields: hwL2vpnServiceType, hwL2vpnProtocolType, hwL2vpnVcID, hwL2vpnVcType, hwL2vpnPeerAddr, hwL2vpnIfIndex, hwL2vpnPwMaster, hwL2vpnRmtSiteID, hwL2vpnInLabel, hwL2vpnOutLabel, hwL2vpnIfName, hwL2vpnVsiName
// Description: This object indicates that OAM reports an alarm for the loss of PW connectivity.
trapMap["1.3.6.1.4.1.2011.5.25.119.9.2.1"] = [
    name: "hwL2vpnOamDloc",
    fields: ["hwL2vpnServiceType", "hwL2vpnProtocolType", "hwL2vpnVcID", "hwL2vpnVcType", "hwL2vpnPeerAddr", "hwL2vpnIfIndex", "hwL2vpnPwMaster", "hwL2vpnRmtSiteID", "hwL2vpnInLabel", "hwL2vpnOutLabel", "hwL2vpnIfName", "hwL2vpnVsiName"],
    fieldOids: ["hwL2vpnServiceType": "1.3.6.1.4.1.2011.5.25.119.9.1.1", "hwL2vpnProtocolType": "1.3.6.1.4.1.2011.5.25.119.9.1.2", "hwL2vpnVcID": "1.3.6.1.4.1.2011.5.25.119.9.1.3", "hwL2vpnVcType": "1.3.6.1.4.1.2011.5.25.119.9.1.4", "hwL2vpnPeerAddr": "1.3.6.1.4.1.2011.5.25.119.9.1.5", "hwL2vpnIfIndex": "1.3.6.1.4.1.2011.5.25.119.9.1.6", "hwL2vpnPwMaster": "1.3.6.1.4.1.2011.5.25.119.9.1.7", "hwL2vpnRmtSiteID": "1.3.6.1.4.1.2011.5.25.119.9.1.8", "hwL2vpnInLabel": "1.3.6.1.4.1.2011.5.25.119.9.1.9", "hwL2vpnOutLabel": "1.3.6.1.4.1.2011.5.25.119.9.1.10", "hwL2vpnIfName": "1.3.6.1.4.1.2011.5.25.119.9.1.11", "hwL2vpnVsiName": "1.3.6.1.4.1.2011.5.25.119.9.1.12"]
]

// --- hwL2vpnOamDlocClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.119.9.2.2
// Fields: hwL2vpnServiceType, hwL2vpnProtocolType, hwL2vpnVcID, hwL2vpnVcType, hwL2vpnPeerAddr, hwL2vpnIfIndex, hwL2vpnPwMaster, hwL2vpnRmtSiteID, hwL2vpnInLabel, hwL2vpnOutLabel, hwL2vpnIfName, hwL2vpnVsiName
// Description: This object indicates that the OAM-reported alarm for the loss of PW connectivity is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.119.9.2.2"] = [
    name: "hwL2vpnOamDlocClear",
    fields: ["hwL2vpnServiceType", "hwL2vpnProtocolType", "hwL2vpnVcID", "hwL2vpnVcType", "hwL2vpnPeerAddr", "hwL2vpnIfIndex", "hwL2vpnPwMaster", "hwL2vpnRmtSiteID", "hwL2vpnInLabel", "hwL2vpnOutLabel", "hwL2vpnIfName", "hwL2vpnVsiName"],
    fieldOids: ["hwL2vpnServiceType": "1.3.6.1.4.1.2011.5.25.119.9.1.1", "hwL2vpnProtocolType": "1.3.6.1.4.1.2011.5.25.119.9.1.2", "hwL2vpnVcID": "1.3.6.1.4.1.2011.5.25.119.9.1.3", "hwL2vpnVcType": "1.3.6.1.4.1.2011.5.25.119.9.1.4", "hwL2vpnPeerAddr": "1.3.6.1.4.1.2011.5.25.119.9.1.5", "hwL2vpnIfIndex": "1.3.6.1.4.1.2011.5.25.119.9.1.6", "hwL2vpnPwMaster": "1.3.6.1.4.1.2011.5.25.119.9.1.7", "hwL2vpnRmtSiteID": "1.3.6.1.4.1.2011.5.25.119.9.1.8", "hwL2vpnInLabel": "1.3.6.1.4.1.2011.5.25.119.9.1.9", "hwL2vpnOutLabel": "1.3.6.1.4.1.2011.5.25.119.9.1.10", "hwL2vpnIfName": "1.3.6.1.4.1.2011.5.25.119.9.1.11", "hwL2vpnVsiName": "1.3.6.1.4.1.2011.5.25.119.9.1.12"]
]

// --- hwL2vpnOamSd1Near (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.119.9.2.3
// Fields: hwL2vpnServiceType, hwL2vpnProtocolType, hwL2vpnVcID, hwL2vpnVcType, hwL2vpnPeerAddr, hwL2vpnIfIndex, hwL2vpnPwMaster, hwL2vpnRmtSiteID, hwL2vpnInLabel, hwL2vpnOutLabel, hwL2vpnIfName, hwL2vpnVsiName
// Description: This object indicates that OAM reports an alarm when the near-end packet loss ratio exceeds the sd1 threshold.
trapMap["1.3.6.1.4.1.2011.5.25.119.9.2.3"] = [
    name: "hwL2vpnOamSd1Near",
    fields: ["hwL2vpnServiceType", "hwL2vpnProtocolType", "hwL2vpnVcID", "hwL2vpnVcType", "hwL2vpnPeerAddr", "hwL2vpnIfIndex", "hwL2vpnPwMaster", "hwL2vpnRmtSiteID", "hwL2vpnInLabel", "hwL2vpnOutLabel", "hwL2vpnIfName", "hwL2vpnVsiName"],
    fieldOids: ["hwL2vpnServiceType": "1.3.6.1.4.1.2011.5.25.119.9.1.1", "hwL2vpnProtocolType": "1.3.6.1.4.1.2011.5.25.119.9.1.2", "hwL2vpnVcID": "1.3.6.1.4.1.2011.5.25.119.9.1.3", "hwL2vpnVcType": "1.3.6.1.4.1.2011.5.25.119.9.1.4", "hwL2vpnPeerAddr": "1.3.6.1.4.1.2011.5.25.119.9.1.5", "hwL2vpnIfIndex": "1.3.6.1.4.1.2011.5.25.119.9.1.6", "hwL2vpnPwMaster": "1.3.6.1.4.1.2011.5.25.119.9.1.7", "hwL2vpnRmtSiteID": "1.3.6.1.4.1.2011.5.25.119.9.1.8", "hwL2vpnInLabel": "1.3.6.1.4.1.2011.5.25.119.9.1.9", "hwL2vpnOutLabel": "1.3.6.1.4.1.2011.5.25.119.9.1.10", "hwL2vpnIfName": "1.3.6.1.4.1.2011.5.25.119.9.1.11", "hwL2vpnVsiName": "1.3.6.1.4.1.2011.5.25.119.9.1.12"]
]

// --- hwL2vpnOamSd1NearClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.119.9.2.4
// Fields: hwL2vpnServiceType, hwL2vpnProtocolType, hwL2vpnVcID, hwL2vpnVcType, hwL2vpnPeerAddr, hwL2vpnIfIndex, hwL2vpnPwMaster, hwL2vpnRmtSiteID, hwL2vpnInLabel, hwL2vpnOutLabel, hwL2vpnIfName, hwL2vpnVsiName
// Description: This object indicates that the OAM-reported alarm, which was generated when the near-end packet loss ratio exceeded the sd1 threshold, is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.119.9.2.4"] = [
    name: "hwL2vpnOamSd1NearClear",
    fields: ["hwL2vpnServiceType", "hwL2vpnProtocolType", "hwL2vpnVcID", "hwL2vpnVcType", "hwL2vpnPeerAddr", "hwL2vpnIfIndex", "hwL2vpnPwMaster", "hwL2vpnRmtSiteID", "hwL2vpnInLabel", "hwL2vpnOutLabel", "hwL2vpnIfName", "hwL2vpnVsiName"],
    fieldOids: ["hwL2vpnServiceType": "1.3.6.1.4.1.2011.5.25.119.9.1.1", "hwL2vpnProtocolType": "1.3.6.1.4.1.2011.5.25.119.9.1.2", "hwL2vpnVcID": "1.3.6.1.4.1.2011.5.25.119.9.1.3", "hwL2vpnVcType": "1.3.6.1.4.1.2011.5.25.119.9.1.4", "hwL2vpnPeerAddr": "1.3.6.1.4.1.2011.5.25.119.9.1.5", "hwL2vpnIfIndex": "1.3.6.1.4.1.2011.5.25.119.9.1.6", "hwL2vpnPwMaster": "1.3.6.1.4.1.2011.5.25.119.9.1.7", "hwL2vpnRmtSiteID": "1.3.6.1.4.1.2011.5.25.119.9.1.8", "hwL2vpnInLabel": "1.3.6.1.4.1.2011.5.25.119.9.1.9", "hwL2vpnOutLabel": "1.3.6.1.4.1.2011.5.25.119.9.1.10", "hwL2vpnIfName": "1.3.6.1.4.1.2011.5.25.119.9.1.11", "hwL2vpnVsiName": "1.3.6.1.4.1.2011.5.25.119.9.1.12"]
]

// --- hwL2vpnOamRdi (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.119.9.2.5
// Fields: hwL2vpnServiceType, hwL2vpnProtocolType, hwL2vpnVcID, hwL2vpnVcType, hwL2vpnPeerAddr, hwL2vpnIfIndex, hwL2vpnPwMaster, hwL2vpnRmtSiteID, hwL2vpnInLabel, hwL2vpnOutLabel, hwL2vpnIfName, hwL2vpnVsiName
// Description: This object indicates that OAM reports a remote defect indication (RDI) alarm.
trapMap["1.3.6.1.4.1.2011.5.25.119.9.2.5"] = [
    name: "hwL2vpnOamRdi",
    fields: ["hwL2vpnServiceType", "hwL2vpnProtocolType", "hwL2vpnVcID", "hwL2vpnVcType", "hwL2vpnPeerAddr", "hwL2vpnIfIndex", "hwL2vpnPwMaster", "hwL2vpnRmtSiteID", "hwL2vpnInLabel", "hwL2vpnOutLabel", "hwL2vpnIfName", "hwL2vpnVsiName"],
    fieldOids: ["hwL2vpnServiceType": "1.3.6.1.4.1.2011.5.25.119.9.1.1", "hwL2vpnProtocolType": "1.3.6.1.4.1.2011.5.25.119.9.1.2", "hwL2vpnVcID": "1.3.6.1.4.1.2011.5.25.119.9.1.3", "hwL2vpnVcType": "1.3.6.1.4.1.2011.5.25.119.9.1.4", "hwL2vpnPeerAddr": "1.3.6.1.4.1.2011.5.25.119.9.1.5", "hwL2vpnIfIndex": "1.3.6.1.4.1.2011.5.25.119.9.1.6", "hwL2vpnPwMaster": "1.3.6.1.4.1.2011.5.25.119.9.1.7", "hwL2vpnRmtSiteID": "1.3.6.1.4.1.2011.5.25.119.9.1.8", "hwL2vpnInLabel": "1.3.6.1.4.1.2011.5.25.119.9.1.9", "hwL2vpnOutLabel": "1.3.6.1.4.1.2011.5.25.119.9.1.10", "hwL2vpnIfName": "1.3.6.1.4.1.2011.5.25.119.9.1.11", "hwL2vpnVsiName": "1.3.6.1.4.1.2011.5.25.119.9.1.12"]
]

// --- hwL2vpnOamRdiClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.119.9.2.6
// Fields: hwL2vpnServiceType, hwL2vpnProtocolType, hwL2vpnVcID, hwL2vpnVcType, hwL2vpnPeerAddr, hwL2vpnIfIndex, hwL2vpnPwMaster, hwL2vpnRmtSiteID, hwL2vpnInLabel, hwL2vpnOutLabel, hwL2vpnIfName, hwL2vpnVsiName
// Description: This object indicates that the OAM-reported RDI alarm is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.119.9.2.6"] = [
    name: "hwL2vpnOamRdiClear",
    fields: ["hwL2vpnServiceType", "hwL2vpnProtocolType", "hwL2vpnVcID", "hwL2vpnVcType", "hwL2vpnPeerAddr", "hwL2vpnIfIndex", "hwL2vpnPwMaster", "hwL2vpnRmtSiteID", "hwL2vpnInLabel", "hwL2vpnOutLabel", "hwL2vpnIfName", "hwL2vpnVsiName"],
    fieldOids: ["hwL2vpnServiceType": "1.3.6.1.4.1.2011.5.25.119.9.1.1", "hwL2vpnProtocolType": "1.3.6.1.4.1.2011.5.25.119.9.1.2", "hwL2vpnVcID": "1.3.6.1.4.1.2011.5.25.119.9.1.3", "hwL2vpnVcType": "1.3.6.1.4.1.2011.5.25.119.9.1.4", "hwL2vpnPeerAddr": "1.3.6.1.4.1.2011.5.25.119.9.1.5", "hwL2vpnIfIndex": "1.3.6.1.4.1.2011.5.25.119.9.1.6", "hwL2vpnPwMaster": "1.3.6.1.4.1.2011.5.25.119.9.1.7", "hwL2vpnRmtSiteID": "1.3.6.1.4.1.2011.5.25.119.9.1.8", "hwL2vpnInLabel": "1.3.6.1.4.1.2011.5.25.119.9.1.9", "hwL2vpnOutLabel": "1.3.6.1.4.1.2011.5.25.119.9.1.10", "hwL2vpnIfName": "1.3.6.1.4.1.2011.5.25.119.9.1.11", "hwL2vpnVsiName": "1.3.6.1.4.1.2011.5.25.119.9.1.12"]
]

// --- hwL2vpnOamMeg (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.119.9.2.7
// Fields: hwL2vpnServiceType, hwL2vpnProtocolType, hwL2vpnVcID, hwL2vpnVcType, hwL2vpnPeerAddr, hwL2vpnIfIndex, hwL2vpnPwMaster, hwL2vpnRmtSiteID, hwL2vpnInLabel, hwL2vpnOutLabel, hwL2vpnIfName, hwL2vpnVsiName
// Description: This object indicates that OAM reports an alarm for the unexpected MEG.
trapMap["1.3.6.1.4.1.2011.5.25.119.9.2.7"] = [
    name: "hwL2vpnOamMeg",
    fields: ["hwL2vpnServiceType", "hwL2vpnProtocolType", "hwL2vpnVcID", "hwL2vpnVcType", "hwL2vpnPeerAddr", "hwL2vpnIfIndex", "hwL2vpnPwMaster", "hwL2vpnRmtSiteID", "hwL2vpnInLabel", "hwL2vpnOutLabel", "hwL2vpnIfName", "hwL2vpnVsiName"],
    fieldOids: ["hwL2vpnServiceType": "1.3.6.1.4.1.2011.5.25.119.9.1.1", "hwL2vpnProtocolType": "1.3.6.1.4.1.2011.5.25.119.9.1.2", "hwL2vpnVcID": "1.3.6.1.4.1.2011.5.25.119.9.1.3", "hwL2vpnVcType": "1.3.6.1.4.1.2011.5.25.119.9.1.4", "hwL2vpnPeerAddr": "1.3.6.1.4.1.2011.5.25.119.9.1.5", "hwL2vpnIfIndex": "1.3.6.1.4.1.2011.5.25.119.9.1.6", "hwL2vpnPwMaster": "1.3.6.1.4.1.2011.5.25.119.9.1.7", "hwL2vpnRmtSiteID": "1.3.6.1.4.1.2011.5.25.119.9.1.8", "hwL2vpnInLabel": "1.3.6.1.4.1.2011.5.25.119.9.1.9", "hwL2vpnOutLabel": "1.3.6.1.4.1.2011.5.25.119.9.1.10", "hwL2vpnIfName": "1.3.6.1.4.1.2011.5.25.119.9.1.11", "hwL2vpnVsiName": "1.3.6.1.4.1.2011.5.25.119.9.1.12"]
]

// --- hwL2vpnOamMegClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.119.9.2.8
// Fields: hwL2vpnServiceType, hwL2vpnProtocolType, hwL2vpnVcID, hwL2vpnVcType, hwL2vpnPeerAddr, hwL2vpnIfIndex, hwL2vpnPwMaster, hwL2vpnRmtSiteID, hwL2vpnInLabel, hwL2vpnOutLabel, hwL2vpnIfName, hwL2vpnVsiName
// Description: This object indicates that the OAM-reported alarm for the unexpected MEG is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.119.9.2.8"] = [
    name: "hwL2vpnOamMegClear",
    fields: ["hwL2vpnServiceType", "hwL2vpnProtocolType", "hwL2vpnVcID", "hwL2vpnVcType", "hwL2vpnPeerAddr", "hwL2vpnIfIndex", "hwL2vpnPwMaster", "hwL2vpnRmtSiteID", "hwL2vpnInLabel", "hwL2vpnOutLabel", "hwL2vpnIfName", "hwL2vpnVsiName"],
    fieldOids: ["hwL2vpnServiceType": "1.3.6.1.4.1.2011.5.25.119.9.1.1", "hwL2vpnProtocolType": "1.3.6.1.4.1.2011.5.25.119.9.1.2", "hwL2vpnVcID": "1.3.6.1.4.1.2011.5.25.119.9.1.3", "hwL2vpnVcType": "1.3.6.1.4.1.2011.5.25.119.9.1.4", "hwL2vpnPeerAddr": "1.3.6.1.4.1.2011.5.25.119.9.1.5", "hwL2vpnIfIndex": "1.3.6.1.4.1.2011.5.25.119.9.1.6", "hwL2vpnPwMaster": "1.3.6.1.4.1.2011.5.25.119.9.1.7", "hwL2vpnRmtSiteID": "1.3.6.1.4.1.2011.5.25.119.9.1.8", "hwL2vpnInLabel": "1.3.6.1.4.1.2011.5.25.119.9.1.9", "hwL2vpnOutLabel": "1.3.6.1.4.1.2011.5.25.119.9.1.10", "hwL2vpnIfName": "1.3.6.1.4.1.2011.5.25.119.9.1.11", "hwL2vpnVsiName": "1.3.6.1.4.1.2011.5.25.119.9.1.12"]
]

// --- hwL2vpnOamMep (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.119.9.2.9
// Fields: hwL2vpnServiceType, hwL2vpnProtocolType, hwL2vpnVcID, hwL2vpnVcType, hwL2vpnPeerAddr, hwL2vpnIfIndex, hwL2vpnPwMaster, hwL2vpnRmtSiteID, hwL2vpnInLabel, hwL2vpnOutLabel, hwL2vpnIfName, hwL2vpnVsiName
// Description: This object indicates that OAM reports an alarm for the unexpected MEP.
trapMap["1.3.6.1.4.1.2011.5.25.119.9.2.9"] = [
    name: "hwL2vpnOamMep",
    fields: ["hwL2vpnServiceType", "hwL2vpnProtocolType", "hwL2vpnVcID", "hwL2vpnVcType", "hwL2vpnPeerAddr", "hwL2vpnIfIndex", "hwL2vpnPwMaster", "hwL2vpnRmtSiteID", "hwL2vpnInLabel", "hwL2vpnOutLabel", "hwL2vpnIfName", "hwL2vpnVsiName"],
    fieldOids: ["hwL2vpnServiceType": "1.3.6.1.4.1.2011.5.25.119.9.1.1", "hwL2vpnProtocolType": "1.3.6.1.4.1.2011.5.25.119.9.1.2", "hwL2vpnVcID": "1.3.6.1.4.1.2011.5.25.119.9.1.3", "hwL2vpnVcType": "1.3.6.1.4.1.2011.5.25.119.9.1.4", "hwL2vpnPeerAddr": "1.3.6.1.4.1.2011.5.25.119.9.1.5", "hwL2vpnIfIndex": "1.3.6.1.4.1.2011.5.25.119.9.1.6", "hwL2vpnPwMaster": "1.3.6.1.4.1.2011.5.25.119.9.1.7", "hwL2vpnRmtSiteID": "1.3.6.1.4.1.2011.5.25.119.9.1.8", "hwL2vpnInLabel": "1.3.6.1.4.1.2011.5.25.119.9.1.9", "hwL2vpnOutLabel": "1.3.6.1.4.1.2011.5.25.119.9.1.10", "hwL2vpnIfName": "1.3.6.1.4.1.2011.5.25.119.9.1.11", "hwL2vpnVsiName": "1.3.6.1.4.1.2011.5.25.119.9.1.12"]
]

// --- hwL2vpnOamMepClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.119.9.2.10
// Fields: hwL2vpnServiceType, hwL2vpnProtocolType, hwL2vpnVcID, hwL2vpnVcType, hwL2vpnPeerAddr, hwL2vpnIfIndex, hwL2vpnPwMaster, hwL2vpnRmtSiteID, hwL2vpnInLabel, hwL2vpnOutLabel, hwL2vpnIfName, hwL2vpnVsiName
// Description: This object indicates that the OAM-reported alarm for the unexpected MEP is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.119.9.2.10"] = [
    name: "hwL2vpnOamMepClear",
    fields: ["hwL2vpnServiceType", "hwL2vpnProtocolType", "hwL2vpnVcID", "hwL2vpnVcType", "hwL2vpnPeerAddr", "hwL2vpnIfIndex", "hwL2vpnPwMaster", "hwL2vpnRmtSiteID", "hwL2vpnInLabel", "hwL2vpnOutLabel", "hwL2vpnIfName", "hwL2vpnVsiName"],
    fieldOids: ["hwL2vpnServiceType": "1.3.6.1.4.1.2011.5.25.119.9.1.1", "hwL2vpnProtocolType": "1.3.6.1.4.1.2011.5.25.119.9.1.2", "hwL2vpnVcID": "1.3.6.1.4.1.2011.5.25.119.9.1.3", "hwL2vpnVcType": "1.3.6.1.4.1.2011.5.25.119.9.1.4", "hwL2vpnPeerAddr": "1.3.6.1.4.1.2011.5.25.119.9.1.5", "hwL2vpnIfIndex": "1.3.6.1.4.1.2011.5.25.119.9.1.6", "hwL2vpnPwMaster": "1.3.6.1.4.1.2011.5.25.119.9.1.7", "hwL2vpnRmtSiteID": "1.3.6.1.4.1.2011.5.25.119.9.1.8", "hwL2vpnInLabel": "1.3.6.1.4.1.2011.5.25.119.9.1.9", "hwL2vpnOutLabel": "1.3.6.1.4.1.2011.5.25.119.9.1.10", "hwL2vpnIfName": "1.3.6.1.4.1.2011.5.25.119.9.1.11", "hwL2vpnVsiName": "1.3.6.1.4.1.2011.5.25.119.9.1.12"]
]

// --- hwL2vpnOamPeriod (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.119.9.2.11
// Fields: hwL2vpnServiceType, hwL2vpnProtocolType, hwL2vpnVcID, hwL2vpnVcType, hwL2vpnPeerAddr, hwL2vpnIfIndex, hwL2vpnPwMaster, hwL2vpnRmtSiteID, hwL2vpnInLabel, hwL2vpnOutLabel, hwL2vpnIfName, hwL2vpnVsiName
// Description: This object indicates that OAM reports an alarm for the unexpected CV packet transmission interval.
trapMap["1.3.6.1.4.1.2011.5.25.119.9.2.11"] = [
    name: "hwL2vpnOamPeriod",
    fields: ["hwL2vpnServiceType", "hwL2vpnProtocolType", "hwL2vpnVcID", "hwL2vpnVcType", "hwL2vpnPeerAddr", "hwL2vpnIfIndex", "hwL2vpnPwMaster", "hwL2vpnRmtSiteID", "hwL2vpnInLabel", "hwL2vpnOutLabel", "hwL2vpnIfName", "hwL2vpnVsiName"],
    fieldOids: ["hwL2vpnServiceType": "1.3.6.1.4.1.2011.5.25.119.9.1.1", "hwL2vpnProtocolType": "1.3.6.1.4.1.2011.5.25.119.9.1.2", "hwL2vpnVcID": "1.3.6.1.4.1.2011.5.25.119.9.1.3", "hwL2vpnVcType": "1.3.6.1.4.1.2011.5.25.119.9.1.4", "hwL2vpnPeerAddr": "1.3.6.1.4.1.2011.5.25.119.9.1.5", "hwL2vpnIfIndex": "1.3.6.1.4.1.2011.5.25.119.9.1.6", "hwL2vpnPwMaster": "1.3.6.1.4.1.2011.5.25.119.9.1.7", "hwL2vpnRmtSiteID": "1.3.6.1.4.1.2011.5.25.119.9.1.8", "hwL2vpnInLabel": "1.3.6.1.4.1.2011.5.25.119.9.1.9", "hwL2vpnOutLabel": "1.3.6.1.4.1.2011.5.25.119.9.1.10", "hwL2vpnIfName": "1.3.6.1.4.1.2011.5.25.119.9.1.11", "hwL2vpnVsiName": "1.3.6.1.4.1.2011.5.25.119.9.1.12"]
]

// --- hwL2vpnOamPeriodClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.119.9.2.12
// Fields: hwL2vpnServiceType, hwL2vpnProtocolType, hwL2vpnVcID, hwL2vpnVcType, hwL2vpnPeerAddr, hwL2vpnIfIndex, hwL2vpnPwMaster, hwL2vpnRmtSiteID, hwL2vpnInLabel, hwL2vpnOutLabel, hwL2vpnIfName, hwL2vpnVsiName
// Description: This object indicates that the OAM-reported alarm for the unexpected CV packet interval is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.119.9.2.12"] = [
    name: "hwL2vpnOamPeriodClear",
    fields: ["hwL2vpnServiceType", "hwL2vpnProtocolType", "hwL2vpnVcID", "hwL2vpnVcType", "hwL2vpnPeerAddr", "hwL2vpnIfIndex", "hwL2vpnPwMaster", "hwL2vpnRmtSiteID", "hwL2vpnInLabel", "hwL2vpnOutLabel", "hwL2vpnIfName", "hwL2vpnVsiName"],
    fieldOids: ["hwL2vpnServiceType": "1.3.6.1.4.1.2011.5.25.119.9.1.1", "hwL2vpnProtocolType": "1.3.6.1.4.1.2011.5.25.119.9.1.2", "hwL2vpnVcID": "1.3.6.1.4.1.2011.5.25.119.9.1.3", "hwL2vpnVcType": "1.3.6.1.4.1.2011.5.25.119.9.1.4", "hwL2vpnPeerAddr": "1.3.6.1.4.1.2011.5.25.119.9.1.5", "hwL2vpnIfIndex": "1.3.6.1.4.1.2011.5.25.119.9.1.6", "hwL2vpnPwMaster": "1.3.6.1.4.1.2011.5.25.119.9.1.7", "hwL2vpnRmtSiteID": "1.3.6.1.4.1.2011.5.25.119.9.1.8", "hwL2vpnInLabel": "1.3.6.1.4.1.2011.5.25.119.9.1.9", "hwL2vpnOutLabel": "1.3.6.1.4.1.2011.5.25.119.9.1.10", "hwL2vpnIfName": "1.3.6.1.4.1.2011.5.25.119.9.1.11", "hwL2vpnVsiName": "1.3.6.1.4.1.2011.5.25.119.9.1.12"]
]

// --- hwL2vpnOamAis (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.119.9.2.13
// Fields: hwL2vpnServiceType, hwL2vpnProtocolType, hwL2vpnVcID, hwL2vpnVcType, hwL2vpnPeerAddr, hwL2vpnIfIndex, hwL2vpnPwMaster, hwL2vpnRmtSiteID, hwL2vpnInLabel, hwL2vpnOutLabel, hwL2vpnIfName, hwL2vpnVsiName
// Description: This object indicates that OAM reports an alarm indication signal (AIS) alarm.
trapMap["1.3.6.1.4.1.2011.5.25.119.9.2.13"] = [
    name: "hwL2vpnOamAis",
    fields: ["hwL2vpnServiceType", "hwL2vpnProtocolType", "hwL2vpnVcID", "hwL2vpnVcType", "hwL2vpnPeerAddr", "hwL2vpnIfIndex", "hwL2vpnPwMaster", "hwL2vpnRmtSiteID", "hwL2vpnInLabel", "hwL2vpnOutLabel", "hwL2vpnIfName", "hwL2vpnVsiName"],
    fieldOids: ["hwL2vpnServiceType": "1.3.6.1.4.1.2011.5.25.119.9.1.1", "hwL2vpnProtocolType": "1.3.6.1.4.1.2011.5.25.119.9.1.2", "hwL2vpnVcID": "1.3.6.1.4.1.2011.5.25.119.9.1.3", "hwL2vpnVcType": "1.3.6.1.4.1.2011.5.25.119.9.1.4", "hwL2vpnPeerAddr": "1.3.6.1.4.1.2011.5.25.119.9.1.5", "hwL2vpnIfIndex": "1.3.6.1.4.1.2011.5.25.119.9.1.6", "hwL2vpnPwMaster": "1.3.6.1.4.1.2011.5.25.119.9.1.7", "hwL2vpnRmtSiteID": "1.3.6.1.4.1.2011.5.25.119.9.1.8", "hwL2vpnInLabel": "1.3.6.1.4.1.2011.5.25.119.9.1.9", "hwL2vpnOutLabel": "1.3.6.1.4.1.2011.5.25.119.9.1.10", "hwL2vpnIfName": "1.3.6.1.4.1.2011.5.25.119.9.1.11", "hwL2vpnVsiName": "1.3.6.1.4.1.2011.5.25.119.9.1.12"]
]

// --- hwL2vpnOamAisClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.119.9.2.14
// Fields: hwL2vpnServiceType, hwL2vpnProtocolType, hwL2vpnVcID, hwL2vpnVcType, hwL2vpnPeerAddr, hwL2vpnIfIndex, hwL2vpnPwMaster, hwL2vpnRmtSiteID, hwL2vpnInLabel, hwL2vpnOutLabel, hwL2vpnIfName, hwL2vpnVsiName
// Description: This object indicates that the OAM-reported AIS alarm is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.119.9.2.14"] = [
    name: "hwL2vpnOamAisClear",
    fields: ["hwL2vpnServiceType", "hwL2vpnProtocolType", "hwL2vpnVcID", "hwL2vpnVcType", "hwL2vpnPeerAddr", "hwL2vpnIfIndex", "hwL2vpnPwMaster", "hwL2vpnRmtSiteID", "hwL2vpnInLabel", "hwL2vpnOutLabel", "hwL2vpnIfName", "hwL2vpnVsiName"],
    fieldOids: ["hwL2vpnServiceType": "1.3.6.1.4.1.2011.5.25.119.9.1.1", "hwL2vpnProtocolType": "1.3.6.1.4.1.2011.5.25.119.9.1.2", "hwL2vpnVcID": "1.3.6.1.4.1.2011.5.25.119.9.1.3", "hwL2vpnVcType": "1.3.6.1.4.1.2011.5.25.119.9.1.4", "hwL2vpnPeerAddr": "1.3.6.1.4.1.2011.5.25.119.9.1.5", "hwL2vpnIfIndex": "1.3.6.1.4.1.2011.5.25.119.9.1.6", "hwL2vpnPwMaster": "1.3.6.1.4.1.2011.5.25.119.9.1.7", "hwL2vpnRmtSiteID": "1.3.6.1.4.1.2011.5.25.119.9.1.8", "hwL2vpnInLabel": "1.3.6.1.4.1.2011.5.25.119.9.1.9", "hwL2vpnOutLabel": "1.3.6.1.4.1.2011.5.25.119.9.1.10", "hwL2vpnIfName": "1.3.6.1.4.1.2011.5.25.119.9.1.11", "hwL2vpnVsiName": "1.3.6.1.4.1.2011.5.25.119.9.1.12"]
]

// --- hwL2vpnOamSd2Near (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.119.9.2.15
// Fields: hwL2vpnServiceType, hwL2vpnProtocolType, hwL2vpnVcID, hwL2vpnVcType, hwL2vpnPeerAddr, hwL2vpnIfIndex, hwL2vpnPwMaster, hwL2vpnRmtSiteID, hwL2vpnInLabel, hwL2vpnOutLabel, hwL2vpnIfName, hwL2vpnVsiName
// Description: This object indicates that OAM reports an alarm when the near-end packet loss ratio exceeds the sd2 threshold.
trapMap["1.3.6.1.4.1.2011.5.25.119.9.2.15"] = [
    name: "hwL2vpnOamSd2Near",
    fields: ["hwL2vpnServiceType", "hwL2vpnProtocolType", "hwL2vpnVcID", "hwL2vpnVcType", "hwL2vpnPeerAddr", "hwL2vpnIfIndex", "hwL2vpnPwMaster", "hwL2vpnRmtSiteID", "hwL2vpnInLabel", "hwL2vpnOutLabel", "hwL2vpnIfName", "hwL2vpnVsiName"],
    fieldOids: ["hwL2vpnServiceType": "1.3.6.1.4.1.2011.5.25.119.9.1.1", "hwL2vpnProtocolType": "1.3.6.1.4.1.2011.5.25.119.9.1.2", "hwL2vpnVcID": "1.3.6.1.4.1.2011.5.25.119.9.1.3", "hwL2vpnVcType": "1.3.6.1.4.1.2011.5.25.119.9.1.4", "hwL2vpnPeerAddr": "1.3.6.1.4.1.2011.5.25.119.9.1.5", "hwL2vpnIfIndex": "1.3.6.1.4.1.2011.5.25.119.9.1.6", "hwL2vpnPwMaster": "1.3.6.1.4.1.2011.5.25.119.9.1.7", "hwL2vpnRmtSiteID": "1.3.6.1.4.1.2011.5.25.119.9.1.8", "hwL2vpnInLabel": "1.3.6.1.4.1.2011.5.25.119.9.1.9", "hwL2vpnOutLabel": "1.3.6.1.4.1.2011.5.25.119.9.1.10", "hwL2vpnIfName": "1.3.6.1.4.1.2011.5.25.119.9.1.11", "hwL2vpnVsiName": "1.3.6.1.4.1.2011.5.25.119.9.1.12"]
]

// --- hwL2vpnOamSd2NearClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.119.9.2.16
// Fields: hwL2vpnServiceType, hwL2vpnProtocolType, hwL2vpnVcID, hwL2vpnVcType, hwL2vpnPeerAddr, hwL2vpnIfIndex, hwL2vpnPwMaster, hwL2vpnRmtSiteID, hwL2vpnInLabel, hwL2vpnOutLabel, hwL2vpnIfName, hwL2vpnVsiName
// Description: This object indicates that the OAM-reported alarm, which was generated when the near-end packet loss ratio exceeded the sd2 threshold, is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.119.9.2.16"] = [
    name: "hwL2vpnOamSd2NearClear",
    fields: ["hwL2vpnServiceType", "hwL2vpnProtocolType", "hwL2vpnVcID", "hwL2vpnVcType", "hwL2vpnPeerAddr", "hwL2vpnIfIndex", "hwL2vpnPwMaster", "hwL2vpnRmtSiteID", "hwL2vpnInLabel", "hwL2vpnOutLabel", "hwL2vpnIfName", "hwL2vpnVsiName"],
    fieldOids: ["hwL2vpnServiceType": "1.3.6.1.4.1.2011.5.25.119.9.1.1", "hwL2vpnProtocolType": "1.3.6.1.4.1.2011.5.25.119.9.1.2", "hwL2vpnVcID": "1.3.6.1.4.1.2011.5.25.119.9.1.3", "hwL2vpnVcType": "1.3.6.1.4.1.2011.5.25.119.9.1.4", "hwL2vpnPeerAddr": "1.3.6.1.4.1.2011.5.25.119.9.1.5", "hwL2vpnIfIndex": "1.3.6.1.4.1.2011.5.25.119.9.1.6", "hwL2vpnPwMaster": "1.3.6.1.4.1.2011.5.25.119.9.1.7", "hwL2vpnRmtSiteID": "1.3.6.1.4.1.2011.5.25.119.9.1.8", "hwL2vpnInLabel": "1.3.6.1.4.1.2011.5.25.119.9.1.9", "hwL2vpnOutLabel": "1.3.6.1.4.1.2011.5.25.119.9.1.10", "hwL2vpnIfName": "1.3.6.1.4.1.2011.5.25.119.9.1.11", "hwL2vpnVsiName": "1.3.6.1.4.1.2011.5.25.119.9.1.12"]
]

// --- hwL2vpnOamLck (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.119.9.2.17
// Fields: hwL2vpnServiceType, hwL2vpnProtocolType, hwL2vpnVcID, hwL2vpnVcType, hwL2vpnPeerAddr, hwL2vpnIfIndex, hwL2vpnPwMaster, hwL2vpnRmtSiteID, hwL2vpnInLabel, hwL2vpnOutLabel, hwL2vpnIfName, hwL2vpnVsiName
// Description: This object indicates that OAM reports a locking (LCK) alarm.
trapMap["1.3.6.1.4.1.2011.5.25.119.9.2.17"] = [
    name: "hwL2vpnOamLck",
    fields: ["hwL2vpnServiceType", "hwL2vpnProtocolType", "hwL2vpnVcID", "hwL2vpnVcType", "hwL2vpnPeerAddr", "hwL2vpnIfIndex", "hwL2vpnPwMaster", "hwL2vpnRmtSiteID", "hwL2vpnInLabel", "hwL2vpnOutLabel", "hwL2vpnIfName", "hwL2vpnVsiName"],
    fieldOids: ["hwL2vpnServiceType": "1.3.6.1.4.1.2011.5.25.119.9.1.1", "hwL2vpnProtocolType": "1.3.6.1.4.1.2011.5.25.119.9.1.2", "hwL2vpnVcID": "1.3.6.1.4.1.2011.5.25.119.9.1.3", "hwL2vpnVcType": "1.3.6.1.4.1.2011.5.25.119.9.1.4", "hwL2vpnPeerAddr": "1.3.6.1.4.1.2011.5.25.119.9.1.5", "hwL2vpnIfIndex": "1.3.6.1.4.1.2011.5.25.119.9.1.6", "hwL2vpnPwMaster": "1.3.6.1.4.1.2011.5.25.119.9.1.7", "hwL2vpnRmtSiteID": "1.3.6.1.4.1.2011.5.25.119.9.1.8", "hwL2vpnInLabel": "1.3.6.1.4.1.2011.5.25.119.9.1.9", "hwL2vpnOutLabel": "1.3.6.1.4.1.2011.5.25.119.9.1.10", "hwL2vpnIfName": "1.3.6.1.4.1.2011.5.25.119.9.1.11", "hwL2vpnVsiName": "1.3.6.1.4.1.2011.5.25.119.9.1.12"]
]

// --- hwL2vpnOamLckClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.119.9.2.18
// Fields: hwL2vpnServiceType, hwL2vpnProtocolType, hwL2vpnVcID, hwL2vpnVcType, hwL2vpnPeerAddr, hwL2vpnIfIndex, hwL2vpnPwMaster, hwL2vpnRmtSiteID, hwL2vpnInLabel, hwL2vpnOutLabel, hwL2vpnIfName, hwL2vpnVsiName
// Description: This object indicates that the OAM-reported alarm for the LCK failure is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.119.9.2.18"] = [
    name: "hwL2vpnOamLckClear",
    fields: ["hwL2vpnServiceType", "hwL2vpnProtocolType", "hwL2vpnVcID", "hwL2vpnVcType", "hwL2vpnPeerAddr", "hwL2vpnIfIndex", "hwL2vpnPwMaster", "hwL2vpnRmtSiteID", "hwL2vpnInLabel", "hwL2vpnOutLabel", "hwL2vpnIfName", "hwL2vpnVsiName"],
    fieldOids: ["hwL2vpnServiceType": "1.3.6.1.4.1.2011.5.25.119.9.1.1", "hwL2vpnProtocolType": "1.3.6.1.4.1.2011.5.25.119.9.1.2", "hwL2vpnVcID": "1.3.6.1.4.1.2011.5.25.119.9.1.3", "hwL2vpnVcType": "1.3.6.1.4.1.2011.5.25.119.9.1.4", "hwL2vpnPeerAddr": "1.3.6.1.4.1.2011.5.25.119.9.1.5", "hwL2vpnIfIndex": "1.3.6.1.4.1.2011.5.25.119.9.1.6", "hwL2vpnPwMaster": "1.3.6.1.4.1.2011.5.25.119.9.1.7", "hwL2vpnRmtSiteID": "1.3.6.1.4.1.2011.5.25.119.9.1.8", "hwL2vpnInLabel": "1.3.6.1.4.1.2011.5.25.119.9.1.9", "hwL2vpnOutLabel": "1.3.6.1.4.1.2011.5.25.119.9.1.10", "hwL2vpnIfName": "1.3.6.1.4.1.2011.5.25.119.9.1.11", "hwL2vpnVsiName": "1.3.6.1.4.1.2011.5.25.119.9.1.12"]
]

// --- hwL2vpnOamCsf (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.119.9.2.19
// Fields: hwL2vpnServiceType, hwL2vpnProtocolType, hwL2vpnVcID, hwL2vpnVcType, hwL2vpnPeerAddr, hwL2vpnIfIndex, hwL2vpnPwMaster, hwL2vpnRmtSiteID, hwL2vpnInLabel, hwL2vpnOutLabel, hwL2vpnIfName, hwL2vpnVsiName
// Description: This object indicates that OAM reports an alarm when a client-layer signal fails.
trapMap["1.3.6.1.4.1.2011.5.25.119.9.2.19"] = [
    name: "hwL2vpnOamCsf",
    fields: ["hwL2vpnServiceType", "hwL2vpnProtocolType", "hwL2vpnVcID", "hwL2vpnVcType", "hwL2vpnPeerAddr", "hwL2vpnIfIndex", "hwL2vpnPwMaster", "hwL2vpnRmtSiteID", "hwL2vpnInLabel", "hwL2vpnOutLabel", "hwL2vpnIfName", "hwL2vpnVsiName"],
    fieldOids: ["hwL2vpnServiceType": "1.3.6.1.4.1.2011.5.25.119.9.1.1", "hwL2vpnProtocolType": "1.3.6.1.4.1.2011.5.25.119.9.1.2", "hwL2vpnVcID": "1.3.6.1.4.1.2011.5.25.119.9.1.3", "hwL2vpnVcType": "1.3.6.1.4.1.2011.5.25.119.9.1.4", "hwL2vpnPeerAddr": "1.3.6.1.4.1.2011.5.25.119.9.1.5", "hwL2vpnIfIndex": "1.3.6.1.4.1.2011.5.25.119.9.1.6", "hwL2vpnPwMaster": "1.3.6.1.4.1.2011.5.25.119.9.1.7", "hwL2vpnRmtSiteID": "1.3.6.1.4.1.2011.5.25.119.9.1.8", "hwL2vpnInLabel": "1.3.6.1.4.1.2011.5.25.119.9.1.9", "hwL2vpnOutLabel": "1.3.6.1.4.1.2011.5.25.119.9.1.10", "hwL2vpnIfName": "1.3.6.1.4.1.2011.5.25.119.9.1.11", "hwL2vpnVsiName": "1.3.6.1.4.1.2011.5.25.119.9.1.12"]
]

// --- hwL2vpnOamCsfClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.119.9.2.20
// Fields: hwL2vpnServiceType, hwL2vpnProtocolType, hwL2vpnVcID, hwL2vpnVcType, hwL2vpnPeerAddr, hwL2vpnIfIndex, hwL2vpnPwMaster, hwL2vpnRmtSiteID, hwL2vpnInLabel, hwL2vpnOutLabel, hwL2vpnIfName, hwL2vpnVsiName
// Description: This object indicates that the OAM-reported alarm for the client-layer signal failure is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.119.9.2.20"] = [
    name: "hwL2vpnOamCsfClear",
    fields: ["hwL2vpnServiceType", "hwL2vpnProtocolType", "hwL2vpnVcID", "hwL2vpnVcType", "hwL2vpnPeerAddr", "hwL2vpnIfIndex", "hwL2vpnPwMaster", "hwL2vpnRmtSiteID", "hwL2vpnInLabel", "hwL2vpnOutLabel", "hwL2vpnIfName", "hwL2vpnVsiName"],
    fieldOids: ["hwL2vpnServiceType": "1.3.6.1.4.1.2011.5.25.119.9.1.1", "hwL2vpnProtocolType": "1.3.6.1.4.1.2011.5.25.119.9.1.2", "hwL2vpnVcID": "1.3.6.1.4.1.2011.5.25.119.9.1.3", "hwL2vpnVcType": "1.3.6.1.4.1.2011.5.25.119.9.1.4", "hwL2vpnPeerAddr": "1.3.6.1.4.1.2011.5.25.119.9.1.5", "hwL2vpnIfIndex": "1.3.6.1.4.1.2011.5.25.119.9.1.6", "hwL2vpnPwMaster": "1.3.6.1.4.1.2011.5.25.119.9.1.7", "hwL2vpnRmtSiteID": "1.3.6.1.4.1.2011.5.25.119.9.1.8", "hwL2vpnInLabel": "1.3.6.1.4.1.2011.5.25.119.9.1.9", "hwL2vpnOutLabel": "1.3.6.1.4.1.2011.5.25.119.9.1.10", "hwL2vpnIfName": "1.3.6.1.4.1.2011.5.25.119.9.1.11", "hwL2vpnVsiName": "1.3.6.1.4.1.2011.5.25.119.9.1.12"]
]

// --- hwL2vpnOamExcess (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.119.9.2.21
// Fields: hwL2vpnServiceType, hwL2vpnProtocolType, hwL2vpnVcID, hwL2vpnVcType, hwL2vpnPeerAddr, hwL2vpnIfIndex, hwL2vpnPwMaster, hwL2vpnRmtSiteID, hwL2vpnInLabel, hwL2vpnOutLabel, hwL2vpnIfName, hwL2vpnVsiName
// Description: This object indicates that OAM reports an alarm when the number of received TTSIs on a PW exceeds the upper threshold.
trapMap["1.3.6.1.4.1.2011.5.25.119.9.2.21"] = [
    name: "hwL2vpnOamExcess",
    fields: ["hwL2vpnServiceType", "hwL2vpnProtocolType", "hwL2vpnVcID", "hwL2vpnVcType", "hwL2vpnPeerAddr", "hwL2vpnIfIndex", "hwL2vpnPwMaster", "hwL2vpnRmtSiteID", "hwL2vpnInLabel", "hwL2vpnOutLabel", "hwL2vpnIfName", "hwL2vpnVsiName"],
    fieldOids: ["hwL2vpnServiceType": "1.3.6.1.4.1.2011.5.25.119.9.1.1", "hwL2vpnProtocolType": "1.3.6.1.4.1.2011.5.25.119.9.1.2", "hwL2vpnVcID": "1.3.6.1.4.1.2011.5.25.119.9.1.3", "hwL2vpnVcType": "1.3.6.1.4.1.2011.5.25.119.9.1.4", "hwL2vpnPeerAddr": "1.3.6.1.4.1.2011.5.25.119.9.1.5", "hwL2vpnIfIndex": "1.3.6.1.4.1.2011.5.25.119.9.1.6", "hwL2vpnPwMaster": "1.3.6.1.4.1.2011.5.25.119.9.1.7", "hwL2vpnRmtSiteID": "1.3.6.1.4.1.2011.5.25.119.9.1.8", "hwL2vpnInLabel": "1.3.6.1.4.1.2011.5.25.119.9.1.9", "hwL2vpnOutLabel": "1.3.6.1.4.1.2011.5.25.119.9.1.10", "hwL2vpnIfName": "1.3.6.1.4.1.2011.5.25.119.9.1.11", "hwL2vpnVsiName": "1.3.6.1.4.1.2011.5.25.119.9.1.12"]
]

// --- hwL2vpnOamExcessClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.119.9.2.22
// Fields: hwL2vpnServiceType, hwL2vpnProtocolType, hwL2vpnVcID, hwL2vpnVcType, hwL2vpnPeerAddr, hwL2vpnIfIndex, hwL2vpnPwMaster, hwL2vpnRmtSiteID, hwL2vpnInLabel, hwL2vpnOutLabel, hwL2vpnIfName, hwL2vpnVsiName
// Description: This object indicates that the OAM-reported alarm, which was generated when the number of received TTSIs on a PW exceeded the upper threshold, is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.119.9.2.22"] = [
    name: "hwL2vpnOamExcessClear",
    fields: ["hwL2vpnServiceType", "hwL2vpnProtocolType", "hwL2vpnVcID", "hwL2vpnVcType", "hwL2vpnPeerAddr", "hwL2vpnIfIndex", "hwL2vpnPwMaster", "hwL2vpnRmtSiteID", "hwL2vpnInLabel", "hwL2vpnOutLabel", "hwL2vpnIfName", "hwL2vpnVsiName"],
    fieldOids: ["hwL2vpnServiceType": "1.3.6.1.4.1.2011.5.25.119.9.1.1", "hwL2vpnProtocolType": "1.3.6.1.4.1.2011.5.25.119.9.1.2", "hwL2vpnVcID": "1.3.6.1.4.1.2011.5.25.119.9.1.3", "hwL2vpnVcType": "1.3.6.1.4.1.2011.5.25.119.9.1.4", "hwL2vpnPeerAddr": "1.3.6.1.4.1.2011.5.25.119.9.1.5", "hwL2vpnIfIndex": "1.3.6.1.4.1.2011.5.25.119.9.1.6", "hwL2vpnPwMaster": "1.3.6.1.4.1.2011.5.25.119.9.1.7", "hwL2vpnRmtSiteID": "1.3.6.1.4.1.2011.5.25.119.9.1.8", "hwL2vpnInLabel": "1.3.6.1.4.1.2011.5.25.119.9.1.9", "hwL2vpnOutLabel": "1.3.6.1.4.1.2011.5.25.119.9.1.10", "hwL2vpnIfName": "1.3.6.1.4.1.2011.5.25.119.9.1.11", "hwL2vpnVsiName": "1.3.6.1.4.1.2011.5.25.119.9.1.12"]
]

// --- hwL2vpnOamMismatch (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.119.9.2.23
// Fields: hwL2vpnServiceType, hwL2vpnProtocolType, hwL2vpnVcID, hwL2vpnVcType, hwL2vpnPeerAddr, hwL2vpnIfIndex, hwL2vpnPwMaster, hwL2vpnRmtSiteID, hwL2vpnInLabel, hwL2vpnOutLabel, hwL2vpnIfName, hwL2vpnVsiName
// Description: OAM reported a TTSI mismatch alarm.
trapMap["1.3.6.1.4.1.2011.5.25.119.9.2.23"] = [
    name: "hwL2vpnOamMismatch",
    fields: ["hwL2vpnServiceType", "hwL2vpnProtocolType", "hwL2vpnVcID", "hwL2vpnVcType", "hwL2vpnPeerAddr", "hwL2vpnIfIndex", "hwL2vpnPwMaster", "hwL2vpnRmtSiteID", "hwL2vpnInLabel", "hwL2vpnOutLabel", "hwL2vpnIfName", "hwL2vpnVsiName"],
    fieldOids: ["hwL2vpnServiceType": "1.3.6.1.4.1.2011.5.25.119.9.1.1", "hwL2vpnProtocolType": "1.3.6.1.4.1.2011.5.25.119.9.1.2", "hwL2vpnVcID": "1.3.6.1.4.1.2011.5.25.119.9.1.3", "hwL2vpnVcType": "1.3.6.1.4.1.2011.5.25.119.9.1.4", "hwL2vpnPeerAddr": "1.3.6.1.4.1.2011.5.25.119.9.1.5", "hwL2vpnIfIndex": "1.3.6.1.4.1.2011.5.25.119.9.1.6", "hwL2vpnPwMaster": "1.3.6.1.4.1.2011.5.25.119.9.1.7", "hwL2vpnRmtSiteID": "1.3.6.1.4.1.2011.5.25.119.9.1.8", "hwL2vpnInLabel": "1.3.6.1.4.1.2011.5.25.119.9.1.9", "hwL2vpnOutLabel": "1.3.6.1.4.1.2011.5.25.119.9.1.10", "hwL2vpnIfName": "1.3.6.1.4.1.2011.5.25.119.9.1.11", "hwL2vpnVsiName": "1.3.6.1.4.1.2011.5.25.119.9.1.12"]
]

// --- hwL2vpnOamMismatchClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.119.9.2.24
// Fields: hwL2vpnServiceType, hwL2vpnProtocolType, hwL2vpnVcID, hwL2vpnVcType, hwL2vpnPeerAddr, hwL2vpnIfIndex, hwL2vpnPwMaster, hwL2vpnRmtSiteID, hwL2vpnInLabel, hwL2vpnOutLabel, hwL2vpnIfName, hwL2vpnVsiName
// Description: OAM reported the TTSI mismatch alarm disappearance.
trapMap["1.3.6.1.4.1.2011.5.25.119.9.2.24"] = [
    name: "hwL2vpnOamMismatchClear",
    fields: ["hwL2vpnServiceType", "hwL2vpnProtocolType", "hwL2vpnVcID", "hwL2vpnVcType", "hwL2vpnPeerAddr", "hwL2vpnIfIndex", "hwL2vpnPwMaster", "hwL2vpnRmtSiteID", "hwL2vpnInLabel", "hwL2vpnOutLabel", "hwL2vpnIfName", "hwL2vpnVsiName"],
    fieldOids: ["hwL2vpnServiceType": "1.3.6.1.4.1.2011.5.25.119.9.1.1", "hwL2vpnProtocolType": "1.3.6.1.4.1.2011.5.25.119.9.1.2", "hwL2vpnVcID": "1.3.6.1.4.1.2011.5.25.119.9.1.3", "hwL2vpnVcType": "1.3.6.1.4.1.2011.5.25.119.9.1.4", "hwL2vpnPeerAddr": "1.3.6.1.4.1.2011.5.25.119.9.1.5", "hwL2vpnIfIndex": "1.3.6.1.4.1.2011.5.25.119.9.1.6", "hwL2vpnPwMaster": "1.3.6.1.4.1.2011.5.25.119.9.1.7", "hwL2vpnRmtSiteID": "1.3.6.1.4.1.2011.5.25.119.9.1.8", "hwL2vpnInLabel": "1.3.6.1.4.1.2011.5.25.119.9.1.9", "hwL2vpnOutLabel": "1.3.6.1.4.1.2011.5.25.119.9.1.10", "hwL2vpnIfName": "1.3.6.1.4.1.2011.5.25.119.9.1.11", "hwL2vpnVsiName": "1.3.6.1.4.1.2011.5.25.119.9.1.12"]
]

// --- hwL2vpnOamMismerge (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.119.9.2.25
// Fields: hwL2vpnServiceType, hwL2vpnProtocolType, hwL2vpnVcID, hwL2vpnVcType, hwL2vpnPeerAddr, hwL2vpnIfIndex, hwL2vpnPwMaster, hwL2vpnRmtSiteID, hwL2vpnInLabel, hwL2vpnOutLabel, hwL2vpnIfName, hwL2vpnVsiName
// Description: OAM reported a TTSI mismerge alarm.
trapMap["1.3.6.1.4.1.2011.5.25.119.9.2.25"] = [
    name: "hwL2vpnOamMismerge",
    fields: ["hwL2vpnServiceType", "hwL2vpnProtocolType", "hwL2vpnVcID", "hwL2vpnVcType", "hwL2vpnPeerAddr", "hwL2vpnIfIndex", "hwL2vpnPwMaster", "hwL2vpnRmtSiteID", "hwL2vpnInLabel", "hwL2vpnOutLabel", "hwL2vpnIfName", "hwL2vpnVsiName"],
    fieldOids: ["hwL2vpnServiceType": "1.3.6.1.4.1.2011.5.25.119.9.1.1", "hwL2vpnProtocolType": "1.3.6.1.4.1.2011.5.25.119.9.1.2", "hwL2vpnVcID": "1.3.6.1.4.1.2011.5.25.119.9.1.3", "hwL2vpnVcType": "1.3.6.1.4.1.2011.5.25.119.9.1.4", "hwL2vpnPeerAddr": "1.3.6.1.4.1.2011.5.25.119.9.1.5", "hwL2vpnIfIndex": "1.3.6.1.4.1.2011.5.25.119.9.1.6", "hwL2vpnPwMaster": "1.3.6.1.4.1.2011.5.25.119.9.1.7", "hwL2vpnRmtSiteID": "1.3.6.1.4.1.2011.5.25.119.9.1.8", "hwL2vpnInLabel": "1.3.6.1.4.1.2011.5.25.119.9.1.9", "hwL2vpnOutLabel": "1.3.6.1.4.1.2011.5.25.119.9.1.10", "hwL2vpnIfName": "1.3.6.1.4.1.2011.5.25.119.9.1.11", "hwL2vpnVsiName": "1.3.6.1.4.1.2011.5.25.119.9.1.12"]
]

// --- hwL2vpnOamMismergeClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.119.9.2.26
// Fields: hwL2vpnServiceType, hwL2vpnProtocolType, hwL2vpnVcID, hwL2vpnVcType, hwL2vpnPeerAddr, hwL2vpnIfIndex, hwL2vpnPwMaster, hwL2vpnRmtSiteID, hwL2vpnInLabel, hwL2vpnOutLabel, hwL2vpnIfName, hwL2vpnVsiName
// Description: OAM reported the TTSI mismerge alarm disappearance.
trapMap["1.3.6.1.4.1.2011.5.25.119.9.2.26"] = [
    name: "hwL2vpnOamMismergeClear",
    fields: ["hwL2vpnServiceType", "hwL2vpnProtocolType", "hwL2vpnVcID", "hwL2vpnVcType", "hwL2vpnPeerAddr", "hwL2vpnIfIndex", "hwL2vpnPwMaster", "hwL2vpnRmtSiteID", "hwL2vpnInLabel", "hwL2vpnOutLabel", "hwL2vpnIfName", "hwL2vpnVsiName"],
    fieldOids: ["hwL2vpnServiceType": "1.3.6.1.4.1.2011.5.25.119.9.1.1", "hwL2vpnProtocolType": "1.3.6.1.4.1.2011.5.25.119.9.1.2", "hwL2vpnVcID": "1.3.6.1.4.1.2011.5.25.119.9.1.3", "hwL2vpnVcType": "1.3.6.1.4.1.2011.5.25.119.9.1.4", "hwL2vpnPeerAddr": "1.3.6.1.4.1.2011.5.25.119.9.1.5", "hwL2vpnIfIndex": "1.3.6.1.4.1.2011.5.25.119.9.1.6", "hwL2vpnPwMaster": "1.3.6.1.4.1.2011.5.25.119.9.1.7", "hwL2vpnRmtSiteID": "1.3.6.1.4.1.2011.5.25.119.9.1.8", "hwL2vpnInLabel": "1.3.6.1.4.1.2011.5.25.119.9.1.9", "hwL2vpnOutLabel": "1.3.6.1.4.1.2011.5.25.119.9.1.10", "hwL2vpnIfName": "1.3.6.1.4.1.2011.5.25.119.9.1.11", "hwL2vpnVsiName": "1.3.6.1.4.1.2011.5.25.119.9.1.12"]
]

// --- hwL2vpnOamFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.119.9.2.27
// Fields: hwL2vpnServiceType, hwL2vpnProtocolType, hwL2vpnVcID, hwL2vpnVcType, hwL2vpnPeerAddr, hwL2vpnIfIndex, hwL2vpnPwMaster, hwL2vpnRmtSiteID, hwL2vpnInLabel, hwL2vpnOutLabel, hwL2vpnIfName, hwL2vpnVsiName
// Description: This object indicates that OAM reports an alarm when no detection-triggering packet is received from the remote end after automatic protocol-based detection expires.
trapMap["1.3.6.1.4.1.2011.5.25.119.9.2.27"] = [
    name: "hwL2vpnOamFail",
    fields: ["hwL2vpnServiceType", "hwL2vpnProtocolType", "hwL2vpnVcID", "hwL2vpnVcType", "hwL2vpnPeerAddr", "hwL2vpnIfIndex", "hwL2vpnPwMaster", "hwL2vpnRmtSiteID", "hwL2vpnInLabel", "hwL2vpnOutLabel", "hwL2vpnIfName", "hwL2vpnVsiName"],
    fieldOids: ["hwL2vpnServiceType": "1.3.6.1.4.1.2011.5.25.119.9.1.1", "hwL2vpnProtocolType": "1.3.6.1.4.1.2011.5.25.119.9.1.2", "hwL2vpnVcID": "1.3.6.1.4.1.2011.5.25.119.9.1.3", "hwL2vpnVcType": "1.3.6.1.4.1.2011.5.25.119.9.1.4", "hwL2vpnPeerAddr": "1.3.6.1.4.1.2011.5.25.119.9.1.5", "hwL2vpnIfIndex": "1.3.6.1.4.1.2011.5.25.119.9.1.6", "hwL2vpnPwMaster": "1.3.6.1.4.1.2011.5.25.119.9.1.7", "hwL2vpnRmtSiteID": "1.3.6.1.4.1.2011.5.25.119.9.1.8", "hwL2vpnInLabel": "1.3.6.1.4.1.2011.5.25.119.9.1.9", "hwL2vpnOutLabel": "1.3.6.1.4.1.2011.5.25.119.9.1.10", "hwL2vpnIfName": "1.3.6.1.4.1.2011.5.25.119.9.1.11", "hwL2vpnVsiName": "1.3.6.1.4.1.2011.5.25.119.9.1.12"]
]

// --- hwL2vpnOamFailClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.119.9.2.28
// Fields: hwL2vpnServiceType, hwL2vpnProtocolType, hwL2vpnVcID, hwL2vpnVcType, hwL2vpnPeerAddr, hwL2vpnIfIndex, hwL2vpnPwMaster, hwL2vpnRmtSiteID, hwL2vpnInLabel, hwL2vpnOutLabel, hwL2vpnIfName, hwL2vpnVsiName
// Description: This object indicates that the OAM-reported alarm, which was generated when a detection-triggering packet was received from the remote end after automatic protocol-based detection expired, is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.119.9.2.28"] = [
    name: "hwL2vpnOamFailClear",
    fields: ["hwL2vpnServiceType", "hwL2vpnProtocolType", "hwL2vpnVcID", "hwL2vpnVcType", "hwL2vpnPeerAddr", "hwL2vpnIfIndex", "hwL2vpnPwMaster", "hwL2vpnRmtSiteID", "hwL2vpnInLabel", "hwL2vpnOutLabel", "hwL2vpnIfName", "hwL2vpnVsiName"],
    fieldOids: ["hwL2vpnServiceType": "1.3.6.1.4.1.2011.5.25.119.9.1.1", "hwL2vpnProtocolType": "1.3.6.1.4.1.2011.5.25.119.9.1.2", "hwL2vpnVcID": "1.3.6.1.4.1.2011.5.25.119.9.1.3", "hwL2vpnVcType": "1.3.6.1.4.1.2011.5.25.119.9.1.4", "hwL2vpnPeerAddr": "1.3.6.1.4.1.2011.5.25.119.9.1.5", "hwL2vpnIfIndex": "1.3.6.1.4.1.2011.5.25.119.9.1.6", "hwL2vpnPwMaster": "1.3.6.1.4.1.2011.5.25.119.9.1.7", "hwL2vpnRmtSiteID": "1.3.6.1.4.1.2011.5.25.119.9.1.8", "hwL2vpnInLabel": "1.3.6.1.4.1.2011.5.25.119.9.1.9", "hwL2vpnOutLabel": "1.3.6.1.4.1.2011.5.25.119.9.1.10", "hwL2vpnIfName": "1.3.6.1.4.1.2011.5.25.119.9.1.11", "hwL2vpnVsiName": "1.3.6.1.4.1.2011.5.25.119.9.1.12"]
]

// --- hwL2vpnOamDbdi (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.119.9.2.29
// Fields: hwL2vpnServiceType, hwL2vpnProtocolType, hwL2vpnVcID, hwL2vpnVcType, hwL2vpnPeerAddr, hwL2vpnIfIndex, hwL2vpnPwMaster, hwL2vpnRmtSiteID, hwL2vpnInLabel, hwL2vpnOutLabel, hwL2vpnIfName, hwL2vpnVsiName
// Description: This object indicates that OAM reports a PW backward defect indication (BDI) alarm.
trapMap["1.3.6.1.4.1.2011.5.25.119.9.2.29"] = [
    name: "hwL2vpnOamDbdi",
    fields: ["hwL2vpnServiceType", "hwL2vpnProtocolType", "hwL2vpnVcID", "hwL2vpnVcType", "hwL2vpnPeerAddr", "hwL2vpnIfIndex", "hwL2vpnPwMaster", "hwL2vpnRmtSiteID", "hwL2vpnInLabel", "hwL2vpnOutLabel", "hwL2vpnIfName", "hwL2vpnVsiName"],
    fieldOids: ["hwL2vpnServiceType": "1.3.6.1.4.1.2011.5.25.119.9.1.1", "hwL2vpnProtocolType": "1.3.6.1.4.1.2011.5.25.119.9.1.2", "hwL2vpnVcID": "1.3.6.1.4.1.2011.5.25.119.9.1.3", "hwL2vpnVcType": "1.3.6.1.4.1.2011.5.25.119.9.1.4", "hwL2vpnPeerAddr": "1.3.6.1.4.1.2011.5.25.119.9.1.5", "hwL2vpnIfIndex": "1.3.6.1.4.1.2011.5.25.119.9.1.6", "hwL2vpnPwMaster": "1.3.6.1.4.1.2011.5.25.119.9.1.7", "hwL2vpnRmtSiteID": "1.3.6.1.4.1.2011.5.25.119.9.1.8", "hwL2vpnInLabel": "1.3.6.1.4.1.2011.5.25.119.9.1.9", "hwL2vpnOutLabel": "1.3.6.1.4.1.2011.5.25.119.9.1.10", "hwL2vpnIfName": "1.3.6.1.4.1.2011.5.25.119.9.1.11", "hwL2vpnVsiName": "1.3.6.1.4.1.2011.5.25.119.9.1.12"]
]

// --- hwL2vpnOamDbdiClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.119.9.2.30
// Fields: hwL2vpnServiceType, hwL2vpnProtocolType, hwL2vpnVcID, hwL2vpnVcType, hwL2vpnPeerAddr, hwL2vpnIfIndex, hwL2vpnPwMaster, hwL2vpnRmtSiteID, hwL2vpnInLabel, hwL2vpnOutLabel, hwL2vpnIfName, hwL2vpnVsiName
// Description: This object indicates that the OAM-reported PW BDI alarm is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.119.9.2.30"] = [
    name: "hwL2vpnOamDbdiClear",
    fields: ["hwL2vpnServiceType", "hwL2vpnProtocolType", "hwL2vpnVcID", "hwL2vpnVcType", "hwL2vpnPeerAddr", "hwL2vpnIfIndex", "hwL2vpnPwMaster", "hwL2vpnRmtSiteID", "hwL2vpnInLabel", "hwL2vpnOutLabel", "hwL2vpnIfName", "hwL2vpnVsiName"],
    fieldOids: ["hwL2vpnServiceType": "1.3.6.1.4.1.2011.5.25.119.9.1.1", "hwL2vpnProtocolType": "1.3.6.1.4.1.2011.5.25.119.9.1.2", "hwL2vpnVcID": "1.3.6.1.4.1.2011.5.25.119.9.1.3", "hwL2vpnVcType": "1.3.6.1.4.1.2011.5.25.119.9.1.4", "hwL2vpnPeerAddr": "1.3.6.1.4.1.2011.5.25.119.9.1.5", "hwL2vpnIfIndex": "1.3.6.1.4.1.2011.5.25.119.9.1.6", "hwL2vpnPwMaster": "1.3.6.1.4.1.2011.5.25.119.9.1.7", "hwL2vpnRmtSiteID": "1.3.6.1.4.1.2011.5.25.119.9.1.8", "hwL2vpnInLabel": "1.3.6.1.4.1.2011.5.25.119.9.1.9", "hwL2vpnOutLabel": "1.3.6.1.4.1.2011.5.25.119.9.1.10", "hwL2vpnIfName": "1.3.6.1.4.1.2011.5.25.119.9.1.11", "hwL2vpnVsiName": "1.3.6.1.4.1.2011.5.25.119.9.1.12"]
]

// --- hwL2vpnOamUnknown (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.119.9.2.31
// Fields: hwL2vpnServiceType, hwL2vpnProtocolType, hwL2vpnVcID, hwL2vpnVcType, hwL2vpnPeerAddr, hwL2vpnIfIndex, hwL2vpnPwMaster, hwL2vpnRmtSiteID, hwL2vpnInLabel, hwL2vpnOutLabel, hwL2vpnIfName, hwL2vpnVsiName
// Description: OAM reported an unknown limitation alarm.
trapMap["1.3.6.1.4.1.2011.5.25.119.9.2.31"] = [
    name: "hwL2vpnOamUnknown",
    fields: ["hwL2vpnServiceType", "hwL2vpnProtocolType", "hwL2vpnVcID", "hwL2vpnVcType", "hwL2vpnPeerAddr", "hwL2vpnIfIndex", "hwL2vpnPwMaster", "hwL2vpnRmtSiteID", "hwL2vpnInLabel", "hwL2vpnOutLabel", "hwL2vpnIfName", "hwL2vpnVsiName"],
    fieldOids: ["hwL2vpnServiceType": "1.3.6.1.4.1.2011.5.25.119.9.1.1", "hwL2vpnProtocolType": "1.3.6.1.4.1.2011.5.25.119.9.1.2", "hwL2vpnVcID": "1.3.6.1.4.1.2011.5.25.119.9.1.3", "hwL2vpnVcType": "1.3.6.1.4.1.2011.5.25.119.9.1.4", "hwL2vpnPeerAddr": "1.3.6.1.4.1.2011.5.25.119.9.1.5", "hwL2vpnIfIndex": "1.3.6.1.4.1.2011.5.25.119.9.1.6", "hwL2vpnPwMaster": "1.3.6.1.4.1.2011.5.25.119.9.1.7", "hwL2vpnRmtSiteID": "1.3.6.1.4.1.2011.5.25.119.9.1.8", "hwL2vpnInLabel": "1.3.6.1.4.1.2011.5.25.119.9.1.9", "hwL2vpnOutLabel": "1.3.6.1.4.1.2011.5.25.119.9.1.10", "hwL2vpnIfName": "1.3.6.1.4.1.2011.5.25.119.9.1.11", "hwL2vpnVsiName": "1.3.6.1.4.1.2011.5.25.119.9.1.12"]
]

// --- hwL2vpnOamUnknownClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.119.9.2.32
// Fields: hwL2vpnServiceType, hwL2vpnProtocolType, hwL2vpnVcID, hwL2vpnVcType, hwL2vpnPeerAddr, hwL2vpnIfIndex, hwL2vpnPwMaster, hwL2vpnRmtSiteID, hwL2vpnInLabel, hwL2vpnOutLabel, hwL2vpnIfName, hwL2vpnVsiName
// Description: OAM reported the unknown limitation alarm disappearance.
trapMap["1.3.6.1.4.1.2011.5.25.119.9.2.32"] = [
    name: "hwL2vpnOamUnknownClear",
    fields: ["hwL2vpnServiceType", "hwL2vpnProtocolType", "hwL2vpnVcID", "hwL2vpnVcType", "hwL2vpnPeerAddr", "hwL2vpnIfIndex", "hwL2vpnPwMaster", "hwL2vpnRmtSiteID", "hwL2vpnInLabel", "hwL2vpnOutLabel", "hwL2vpnIfName", "hwL2vpnVsiName"],
    fieldOids: ["hwL2vpnServiceType": "1.3.6.1.4.1.2011.5.25.119.9.1.1", "hwL2vpnProtocolType": "1.3.6.1.4.1.2011.5.25.119.9.1.2", "hwL2vpnVcID": "1.3.6.1.4.1.2011.5.25.119.9.1.3", "hwL2vpnVcType": "1.3.6.1.4.1.2011.5.25.119.9.1.4", "hwL2vpnPeerAddr": "1.3.6.1.4.1.2011.5.25.119.9.1.5", "hwL2vpnIfIndex": "1.3.6.1.4.1.2011.5.25.119.9.1.6", "hwL2vpnPwMaster": "1.3.6.1.4.1.2011.5.25.119.9.1.7", "hwL2vpnRmtSiteID": "1.3.6.1.4.1.2011.5.25.119.9.1.8", "hwL2vpnInLabel": "1.3.6.1.4.1.2011.5.25.119.9.1.9", "hwL2vpnOutLabel": "1.3.6.1.4.1.2011.5.25.119.9.1.10", "hwL2vpnIfName": "1.3.6.1.4.1.2011.5.25.119.9.1.11", "hwL2vpnVsiName": "1.3.6.1.4.1.2011.5.25.119.9.1.12"]
]

// --- hwL2vpnOamLocalLock (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.119.9.2.33
// Fields: hwL2vpnServiceType, hwL2vpnProtocolType, hwL2vpnVcID, hwL2vpnVcType, hwL2vpnPeerAddr, hwL2vpnIfIndex, hwL2vpnPwMaster, hwL2vpnRmtSiteID, hwL2vpnInLabel, hwL2vpnOutLabel, hwL2vpnIfName, hwL2vpnVsiName
// Description: This object indicates that OAM reports an LCK alarm at the PW layer.
trapMap["1.3.6.1.4.1.2011.5.25.119.9.2.33"] = [
    name: "hwL2vpnOamLocalLock",
    fields: ["hwL2vpnServiceType", "hwL2vpnProtocolType", "hwL2vpnVcID", "hwL2vpnVcType", "hwL2vpnPeerAddr", "hwL2vpnIfIndex", "hwL2vpnPwMaster", "hwL2vpnRmtSiteID", "hwL2vpnInLabel", "hwL2vpnOutLabel", "hwL2vpnIfName", "hwL2vpnVsiName"],
    fieldOids: ["hwL2vpnServiceType": "1.3.6.1.4.1.2011.5.25.119.9.1.1", "hwL2vpnProtocolType": "1.3.6.1.4.1.2011.5.25.119.9.1.2", "hwL2vpnVcID": "1.3.6.1.4.1.2011.5.25.119.9.1.3", "hwL2vpnVcType": "1.3.6.1.4.1.2011.5.25.119.9.1.4", "hwL2vpnPeerAddr": "1.3.6.1.4.1.2011.5.25.119.9.1.5", "hwL2vpnIfIndex": "1.3.6.1.4.1.2011.5.25.119.9.1.6", "hwL2vpnPwMaster": "1.3.6.1.4.1.2011.5.25.119.9.1.7", "hwL2vpnRmtSiteID": "1.3.6.1.4.1.2011.5.25.119.9.1.8", "hwL2vpnInLabel": "1.3.6.1.4.1.2011.5.25.119.9.1.9", "hwL2vpnOutLabel": "1.3.6.1.4.1.2011.5.25.119.9.1.10", "hwL2vpnIfName": "1.3.6.1.4.1.2011.5.25.119.9.1.11", "hwL2vpnVsiName": "1.3.6.1.4.1.2011.5.25.119.9.1.12"]
]

// --- hwL2vpnOamLocalLockClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.119.9.2.34
// Fields: hwL2vpnServiceType, hwL2vpnProtocolType, hwL2vpnVcID, hwL2vpnVcType, hwL2vpnPeerAddr, hwL2vpnIfIndex, hwL2vpnPwMaster, hwL2vpnRmtSiteID, hwL2vpnInLabel, hwL2vpnOutLabel, hwL2vpnIfName, hwL2vpnVsiName
// Description: This object indicates that the OAM-reported LCK alarm at the PW layer is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.119.9.2.34"] = [
    name: "hwL2vpnOamLocalLockClear",
    fields: ["hwL2vpnServiceType", "hwL2vpnProtocolType", "hwL2vpnVcID", "hwL2vpnVcType", "hwL2vpnPeerAddr", "hwL2vpnIfIndex", "hwL2vpnPwMaster", "hwL2vpnRmtSiteID", "hwL2vpnInLabel", "hwL2vpnOutLabel", "hwL2vpnIfName", "hwL2vpnVsiName"],
    fieldOids: ["hwL2vpnServiceType": "1.3.6.1.4.1.2011.5.25.119.9.1.1", "hwL2vpnProtocolType": "1.3.6.1.4.1.2011.5.25.119.9.1.2", "hwL2vpnVcID": "1.3.6.1.4.1.2011.5.25.119.9.1.3", "hwL2vpnVcType": "1.3.6.1.4.1.2011.5.25.119.9.1.4", "hwL2vpnPeerAddr": "1.3.6.1.4.1.2011.5.25.119.9.1.5", "hwL2vpnIfIndex": "1.3.6.1.4.1.2011.5.25.119.9.1.6", "hwL2vpnPwMaster": "1.3.6.1.4.1.2011.5.25.119.9.1.7", "hwL2vpnRmtSiteID": "1.3.6.1.4.1.2011.5.25.119.9.1.8", "hwL2vpnInLabel": "1.3.6.1.4.1.2011.5.25.119.9.1.9", "hwL2vpnOutLabel": "1.3.6.1.4.1.2011.5.25.119.9.1.10", "hwL2vpnIfName": "1.3.6.1.4.1.2011.5.25.119.9.1.11", "hwL2vpnVsiName": "1.3.6.1.4.1.2011.5.25.119.9.1.12"]
]

// --- hwL2vpnOamSd1Far (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.119.9.2.35
// Fields: hwL2vpnServiceType, hwL2vpnProtocolType, hwL2vpnVcID, hwL2vpnVcType, hwL2vpnPeerAddr, hwL2vpnIfIndex, hwL2vpnPwMaster, hwL2vpnRmtSiteID, hwL2vpnInLabel, hwL2vpnOutLabel, hwL2vpnIfName, hwL2vpnVsiName
// Description: This object indicates that OAM reports an alarm when the far-end packet loss ratio exceeds the sd1 threshold.
trapMap["1.3.6.1.4.1.2011.5.25.119.9.2.35"] = [
    name: "hwL2vpnOamSd1Far",
    fields: ["hwL2vpnServiceType", "hwL2vpnProtocolType", "hwL2vpnVcID", "hwL2vpnVcType", "hwL2vpnPeerAddr", "hwL2vpnIfIndex", "hwL2vpnPwMaster", "hwL2vpnRmtSiteID", "hwL2vpnInLabel", "hwL2vpnOutLabel", "hwL2vpnIfName", "hwL2vpnVsiName"],
    fieldOids: ["hwL2vpnServiceType": "1.3.6.1.4.1.2011.5.25.119.9.1.1", "hwL2vpnProtocolType": "1.3.6.1.4.1.2011.5.25.119.9.1.2", "hwL2vpnVcID": "1.3.6.1.4.1.2011.5.25.119.9.1.3", "hwL2vpnVcType": "1.3.6.1.4.1.2011.5.25.119.9.1.4", "hwL2vpnPeerAddr": "1.3.6.1.4.1.2011.5.25.119.9.1.5", "hwL2vpnIfIndex": "1.3.6.1.4.1.2011.5.25.119.9.1.6", "hwL2vpnPwMaster": "1.3.6.1.4.1.2011.5.25.119.9.1.7", "hwL2vpnRmtSiteID": "1.3.6.1.4.1.2011.5.25.119.9.1.8", "hwL2vpnInLabel": "1.3.6.1.4.1.2011.5.25.119.9.1.9", "hwL2vpnOutLabel": "1.3.6.1.4.1.2011.5.25.119.9.1.10", "hwL2vpnIfName": "1.3.6.1.4.1.2011.5.25.119.9.1.11", "hwL2vpnVsiName": "1.3.6.1.4.1.2011.5.25.119.9.1.12"]
]

// --- hwL2vpnOamSd1FarClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.119.9.2.36
// Fields: hwL2vpnServiceType, hwL2vpnProtocolType, hwL2vpnVcID, hwL2vpnVcType, hwL2vpnPeerAddr, hwL2vpnIfIndex, hwL2vpnPwMaster, hwL2vpnRmtSiteID, hwL2vpnInLabel, hwL2vpnOutLabel, hwL2vpnIfName, hwL2vpnVsiName
// Description: This object indicates that the OAM-reported alarm, which was generated when the far-end packet loss ratio exceeded the sd1 threshold, is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.119.9.2.36"] = [
    name: "hwL2vpnOamSd1FarClear",
    fields: ["hwL2vpnServiceType", "hwL2vpnProtocolType", "hwL2vpnVcID", "hwL2vpnVcType", "hwL2vpnPeerAddr", "hwL2vpnIfIndex", "hwL2vpnPwMaster", "hwL2vpnRmtSiteID", "hwL2vpnInLabel", "hwL2vpnOutLabel", "hwL2vpnIfName", "hwL2vpnVsiName"],
    fieldOids: ["hwL2vpnServiceType": "1.3.6.1.4.1.2011.5.25.119.9.1.1", "hwL2vpnProtocolType": "1.3.6.1.4.1.2011.5.25.119.9.1.2", "hwL2vpnVcID": "1.3.6.1.4.1.2011.5.25.119.9.1.3", "hwL2vpnVcType": "1.3.6.1.4.1.2011.5.25.119.9.1.4", "hwL2vpnPeerAddr": "1.3.6.1.4.1.2011.5.25.119.9.1.5", "hwL2vpnIfIndex": "1.3.6.1.4.1.2011.5.25.119.9.1.6", "hwL2vpnPwMaster": "1.3.6.1.4.1.2011.5.25.119.9.1.7", "hwL2vpnRmtSiteID": "1.3.6.1.4.1.2011.5.25.119.9.1.8", "hwL2vpnInLabel": "1.3.6.1.4.1.2011.5.25.119.9.1.9", "hwL2vpnOutLabel": "1.3.6.1.4.1.2011.5.25.119.9.1.10", "hwL2vpnIfName": "1.3.6.1.4.1.2011.5.25.119.9.1.11", "hwL2vpnVsiName": "1.3.6.1.4.1.2011.5.25.119.9.1.12"]
]

// --- hwL2vpnOamSd2Far (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.119.9.2.37
// Fields: hwL2vpnServiceType, hwL2vpnProtocolType, hwL2vpnVcID, hwL2vpnVcType, hwL2vpnPeerAddr, hwL2vpnIfIndex, hwL2vpnPwMaster, hwL2vpnRmtSiteID, hwL2vpnInLabel, hwL2vpnOutLabel, hwL2vpnIfName, hwL2vpnVsiName
// Description: This object indicates that OAM reports an alarm when the far-end packet loss ratio exceeds the sd2 threshold.
trapMap["1.3.6.1.4.1.2011.5.25.119.9.2.37"] = [
    name: "hwL2vpnOamSd2Far",
    fields: ["hwL2vpnServiceType", "hwL2vpnProtocolType", "hwL2vpnVcID", "hwL2vpnVcType", "hwL2vpnPeerAddr", "hwL2vpnIfIndex", "hwL2vpnPwMaster", "hwL2vpnRmtSiteID", "hwL2vpnInLabel", "hwL2vpnOutLabel", "hwL2vpnIfName", "hwL2vpnVsiName"],
    fieldOids: ["hwL2vpnServiceType": "1.3.6.1.4.1.2011.5.25.119.9.1.1", "hwL2vpnProtocolType": "1.3.6.1.4.1.2011.5.25.119.9.1.2", "hwL2vpnVcID": "1.3.6.1.4.1.2011.5.25.119.9.1.3", "hwL2vpnVcType": "1.3.6.1.4.1.2011.5.25.119.9.1.4", "hwL2vpnPeerAddr": "1.3.6.1.4.1.2011.5.25.119.9.1.5", "hwL2vpnIfIndex": "1.3.6.1.4.1.2011.5.25.119.9.1.6", "hwL2vpnPwMaster": "1.3.6.1.4.1.2011.5.25.119.9.1.7", "hwL2vpnRmtSiteID": "1.3.6.1.4.1.2011.5.25.119.9.1.8", "hwL2vpnInLabel": "1.3.6.1.4.1.2011.5.25.119.9.1.9", "hwL2vpnOutLabel": "1.3.6.1.4.1.2011.5.25.119.9.1.10", "hwL2vpnIfName": "1.3.6.1.4.1.2011.5.25.119.9.1.11", "hwL2vpnVsiName": "1.3.6.1.4.1.2011.5.25.119.9.1.12"]
]

// --- hwL2vpnOamSd2FarClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.119.9.2.38
// Fields: hwL2vpnServiceType, hwL2vpnProtocolType, hwL2vpnVcID, hwL2vpnVcType, hwL2vpnPeerAddr, hwL2vpnIfIndex, hwL2vpnPwMaster, hwL2vpnRmtSiteID, hwL2vpnInLabel, hwL2vpnOutLabel, hwL2vpnIfName, hwL2vpnVsiName
// Description: This object indicates that the OAM-reported alarm, which was generated when the far-end packet loss ratio exceeded the sd2 threshold, is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.119.9.2.38"] = [
    name: "hwL2vpnOamSd2FarClear",
    fields: ["hwL2vpnServiceType", "hwL2vpnProtocolType", "hwL2vpnVcID", "hwL2vpnVcType", "hwL2vpnPeerAddr", "hwL2vpnIfIndex", "hwL2vpnPwMaster", "hwL2vpnRmtSiteID", "hwL2vpnInLabel", "hwL2vpnOutLabel", "hwL2vpnIfName", "hwL2vpnVsiName"],
    fieldOids: ["hwL2vpnServiceType": "1.3.6.1.4.1.2011.5.25.119.9.1.1", "hwL2vpnProtocolType": "1.3.6.1.4.1.2011.5.25.119.9.1.2", "hwL2vpnVcID": "1.3.6.1.4.1.2011.5.25.119.9.1.3", "hwL2vpnVcType": "1.3.6.1.4.1.2011.5.25.119.9.1.4", "hwL2vpnPeerAddr": "1.3.6.1.4.1.2011.5.25.119.9.1.5", "hwL2vpnIfIndex": "1.3.6.1.4.1.2011.5.25.119.9.1.6", "hwL2vpnPwMaster": "1.3.6.1.4.1.2011.5.25.119.9.1.7", "hwL2vpnRmtSiteID": "1.3.6.1.4.1.2011.5.25.119.9.1.8", "hwL2vpnInLabel": "1.3.6.1.4.1.2011.5.25.119.9.1.9", "hwL2vpnOutLabel": "1.3.6.1.4.1.2011.5.25.119.9.1.10", "hwL2vpnIfName": "1.3.6.1.4.1.2011.5.25.119.9.1.11", "hwL2vpnVsiName": "1.3.6.1.4.1.2011.5.25.119.9.1.12"]
]

// --- hwL2vpnOamFdi (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.119.9.2.39
// Fields: hwL2vpnServiceType, hwL2vpnProtocolType, hwL2vpnVcID, hwL2vpnVcType, hwL2vpnPeerAddr, hwL2vpnIfIndex, hwL2vpnPwMaster, hwL2vpnRmtSiteID, hwL2vpnInLabel, hwL2vpnOutLabel, hwL2vpnIfName, hwL2vpnVsiName
// Description: This object indicates that OAM reports a forward defect indication (FDI) alarm.
trapMap["1.3.6.1.4.1.2011.5.25.119.9.2.39"] = [
    name: "hwL2vpnOamFdi",
    fields: ["hwL2vpnServiceType", "hwL2vpnProtocolType", "hwL2vpnVcID", "hwL2vpnVcType", "hwL2vpnPeerAddr", "hwL2vpnIfIndex", "hwL2vpnPwMaster", "hwL2vpnRmtSiteID", "hwL2vpnInLabel", "hwL2vpnOutLabel", "hwL2vpnIfName", "hwL2vpnVsiName"],
    fieldOids: ["hwL2vpnServiceType": "1.3.6.1.4.1.2011.5.25.119.9.1.1", "hwL2vpnProtocolType": "1.3.6.1.4.1.2011.5.25.119.9.1.2", "hwL2vpnVcID": "1.3.6.1.4.1.2011.5.25.119.9.1.3", "hwL2vpnVcType": "1.3.6.1.4.1.2011.5.25.119.9.1.4", "hwL2vpnPeerAddr": "1.3.6.1.4.1.2011.5.25.119.9.1.5", "hwL2vpnIfIndex": "1.3.6.1.4.1.2011.5.25.119.9.1.6", "hwL2vpnPwMaster": "1.3.6.1.4.1.2011.5.25.119.9.1.7", "hwL2vpnRmtSiteID": "1.3.6.1.4.1.2011.5.25.119.9.1.8", "hwL2vpnInLabel": "1.3.6.1.4.1.2011.5.25.119.9.1.9", "hwL2vpnOutLabel": "1.3.6.1.4.1.2011.5.25.119.9.1.10", "hwL2vpnIfName": "1.3.6.1.4.1.2011.5.25.119.9.1.11", "hwL2vpnVsiName": "1.3.6.1.4.1.2011.5.25.119.9.1.12"]
]

// --- hwL2vpnOamFdiClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.119.9.2.40
// Fields: hwL2vpnServiceType, hwL2vpnProtocolType, hwL2vpnVcID, hwL2vpnVcType, hwL2vpnPeerAddr, hwL2vpnIfIndex, hwL2vpnPwMaster, hwL2vpnRmtSiteID, hwL2vpnInLabel, hwL2vpnOutLabel, hwL2vpnIfName, hwL2vpnVsiName
// Description: This object indicates that the OAM-reported FDI alarm is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.119.9.2.40"] = [
    name: "hwL2vpnOamFdiClear",
    fields: ["hwL2vpnServiceType", "hwL2vpnProtocolType", "hwL2vpnVcID", "hwL2vpnVcType", "hwL2vpnPeerAddr", "hwL2vpnIfIndex", "hwL2vpnPwMaster", "hwL2vpnRmtSiteID", "hwL2vpnInLabel", "hwL2vpnOutLabel", "hwL2vpnIfName", "hwL2vpnVsiName"],
    fieldOids: ["hwL2vpnServiceType": "1.3.6.1.4.1.2011.5.25.119.9.1.1", "hwL2vpnProtocolType": "1.3.6.1.4.1.2011.5.25.119.9.1.2", "hwL2vpnVcID": "1.3.6.1.4.1.2011.5.25.119.9.1.3", "hwL2vpnVcType": "1.3.6.1.4.1.2011.5.25.119.9.1.4", "hwL2vpnPeerAddr": "1.3.6.1.4.1.2011.5.25.119.9.1.5", "hwL2vpnIfIndex": "1.3.6.1.4.1.2011.5.25.119.9.1.6", "hwL2vpnPwMaster": "1.3.6.1.4.1.2011.5.25.119.9.1.7", "hwL2vpnRmtSiteID": "1.3.6.1.4.1.2011.5.25.119.9.1.8", "hwL2vpnInLabel": "1.3.6.1.4.1.2011.5.25.119.9.1.9", "hwL2vpnOutLabel": "1.3.6.1.4.1.2011.5.25.119.9.1.10", "hwL2vpnIfName": "1.3.6.1.4.1.2011.5.25.119.9.1.11", "hwL2vpnVsiName": "1.3.6.1.4.1.2011.5.25.119.9.1.12"]
]

// --- hwL2vpnOamTunnelNonSupport (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.119.9.2.41
// Fields: hwL2vpnVcID, hwL2vpnVcType, hwL2vpnPeerAddr, hwL2vpnOamType
// Description: This object indicates that an alarm is generated when MPLS OAM or MPLS-TP OAM for a PW detects a non-supported public network tunnel.
trapMap["1.3.6.1.4.1.2011.5.25.119.9.2.41"] = [
    name: "hwL2vpnOamTunnelNonSupport",
    fields: ["hwL2vpnVcID", "hwL2vpnVcType", "hwL2vpnPeerAddr", "hwL2vpnOamType"],
    fieldOids: ["hwL2vpnVcID": "1.3.6.1.4.1.2011.5.25.119.9.1.3", "hwL2vpnVcType": "1.3.6.1.4.1.2011.5.25.119.9.1.4", "hwL2vpnPeerAddr": "1.3.6.1.4.1.2011.5.25.119.9.1.5", "hwL2vpnOamType": "1.3.6.1.4.1.2011.5.25.119.9.1.13"]
]

// --- hwL2vpnOamTunnelNonSupportResumed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.119.9.2.42
// Fields: hwL2vpnVcID, hwL2vpnVcType, hwL2vpnPeerAddr, hwL2vpnOamType
// Description: This object indicates that the alarm, which was generated when MPLS OAM or MPLS-TP OAM for a PW detected a non-supported public network tunnel, is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.119.9.2.42"] = [
    name: "hwL2vpnOamTunnelNonSupportResumed",
    fields: ["hwL2vpnVcID", "hwL2vpnVcType", "hwL2vpnPeerAddr", "hwL2vpnOamType"],
    fieldOids: ["hwL2vpnVcID": "1.3.6.1.4.1.2011.5.25.119.9.1.3", "hwL2vpnVcType": "1.3.6.1.4.1.2011.5.25.119.9.1.4", "hwL2vpnPeerAddr": "1.3.6.1.4.1.2011.5.25.119.9.1.5", "hwL2vpnOamType": "1.3.6.1.4.1.2011.5.25.119.9.1.13"]
]

// --- hwL2vpnOamPmNonSupport (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.119.9.2.43
// Fields: hwL2vpnVcID, hwL2vpnVcType, hwL2vpnPeerAddr, hwL2vpnOamType
// Description: This object indicates that an alarm is generated when MPLS OAM or MPLS-TP OAM for a PW performance measurement detects a non-supported public network tunnel.
trapMap["1.3.6.1.4.1.2011.5.25.119.9.2.43"] = [
    name: "hwL2vpnOamPmNonSupport",
    fields: ["hwL2vpnVcID", "hwL2vpnVcType", "hwL2vpnPeerAddr", "hwL2vpnOamType"],
    fieldOids: ["hwL2vpnVcID": "1.3.6.1.4.1.2011.5.25.119.9.1.3", "hwL2vpnVcType": "1.3.6.1.4.1.2011.5.25.119.9.1.4", "hwL2vpnPeerAddr": "1.3.6.1.4.1.2011.5.25.119.9.1.5", "hwL2vpnOamType": "1.3.6.1.4.1.2011.5.25.119.9.1.13"]
]

// --- hwL2vpnOamPmNonSupportResumed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.119.9.2.44
// Fields: hwL2vpnVcID, hwL2vpnVcType, hwL2vpnPeerAddr, hwL2vpnOamType
// Description: This object indicates that the alarm, which was generated when MPLS OAM or MPLS-TP OAM for a PW performance measurement detected a non-supported public network tunnel, is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.119.9.2.44"] = [
    name: "hwL2vpnOamPmNonSupportResumed",
    fields: ["hwL2vpnVcID", "hwL2vpnVcType", "hwL2vpnPeerAddr", "hwL2vpnOamType"],
    fieldOids: ["hwL2vpnVcID": "1.3.6.1.4.1.2011.5.25.119.9.1.3", "hwL2vpnVcType": "1.3.6.1.4.1.2011.5.25.119.9.1.4", "hwL2vpnPeerAddr": "1.3.6.1.4.1.2011.5.25.119.9.1.5", "hwL2vpnOamType": "1.3.6.1.4.1.2011.5.25.119.9.1.13"]
]

// ===== Parsing logic =====

// Set to true to enable diagnostic logging for this MIB parser
DEBUG = false

LOG_PREFIX = "[HUAWEI-L2VPN-OAM-MIB]"
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
