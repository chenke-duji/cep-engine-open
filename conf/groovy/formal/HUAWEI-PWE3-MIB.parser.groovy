/**
 * Auto-generated from HUAWEI-PWE3-MIB.mib
 * Generated: 2026-08-24T18:28:30.779752400
 * Traps/Notifications (23): hwPWVcSwitchWtoP, hwPWVcSwitchPtoW, hwPWVcDown, hwPWVcUp, hwPWVcDeleted, hwPWVcBackup, hwLdpPWVcDown, hwLdpPWVcUp, hwPWVcStatusChange, hwVpwsPwRedundancyDegraded, hwVpwsPwRedundancyDegradedClear, hwRemoteApPwParaMisMatch, hwRemoteApPwParaMisMatchResume, hwSvcSwitchWtoP, hwSvcSwitchPtoW, hwSvcDown, hwSvcUp, hwSvcDeleted, hwPWTemplateCannotDeleted, hwPWVcSwitchWtoPExpand, hwPWVcSwitchPtoWExpand, hwVpwsPwRedundancyDegradedExpand, hwVpwsPwRedundancyDegradedClearExpand
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

// --- hwPWVcSwitchWtoP (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.119.4.1.2.1
// Fields: hwPWVcCtrlWord, hwPWVcSwitchRmtID, hwPWVcStateChangeReason, hwPWVcIfName
// Description: This notification is generated when switch from working PW to protect PW happens.
trapMap["1.3.6.1.4.1.2011.5.25.119.4.1.2.1"] = [
    name: "hwPWVcSwitchWtoP",
    fields: ["hwPWVcCtrlWord", "hwPWVcSwitchRmtID", "hwPWVcStateChangeReason", "hwPWVcIfName"],
    fieldOids: ["hwPWVcCtrlWord": "1.3.6.1.4.1.2011.5.25.119.4.1.1.1.1.19", "hwPWVcSwitchRmtID": "1.3.6.1.4.1.2011.5.25.119.4.1.1.9", "hwPWVcStateChangeReason": "1.3.6.1.4.1.2011.5.25.119.4.1.1.8", "hwPWVcIfName": "1.3.6.1.4.1.2011.5.25.119.4.1.1.1.1.49"]
]

// --- hwPWVcSwitchPtoW (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.119.4.1.2.2
// Fields: hwPWVcCtrlWord, hwPWVcSwitchRmtID, hwPWVcStateChangeReason, hwPWVcIfName
// Description: This notification is generated when switch from protect PW to working PW happens.
trapMap["1.3.6.1.4.1.2011.5.25.119.4.1.2.2"] = [
    name: "hwPWVcSwitchPtoW",
    fields: ["hwPWVcCtrlWord", "hwPWVcSwitchRmtID", "hwPWVcStateChangeReason", "hwPWVcIfName"],
    fieldOids: ["hwPWVcCtrlWord": "1.3.6.1.4.1.2011.5.25.119.4.1.1.1.1.19", "hwPWVcSwitchRmtID": "1.3.6.1.4.1.2011.5.25.119.4.1.1.9", "hwPWVcStateChangeReason": "1.3.6.1.4.1.2011.5.25.119.4.1.1.8", "hwPWVcIfName": "1.3.6.1.4.1.2011.5.25.119.4.1.1.1.1.49"]
]

// --- hwPWVcDown (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.119.4.1.2.3
// Fields: hwPWVcPeerAddr, hwPWVcIfIndex, hwPWVcInboundLabel, hwPWVcOutboundLabel, hwPWVcSecondary, hwPWVcStateChangeReason, sysUpTime, hwPWVcIfName, hwPWVcSwitchID, hwPWVcTnlPolicyName
// Description: This notification indicates the VC's state changes to down.
trapMap["1.3.6.1.4.1.2011.5.25.119.4.1.2.3"] = [
    name: "hwPWVcDown",
    fields: ["hwPWVcPeerAddr", "hwPWVcIfIndex", "hwPWVcInboundLabel", "hwPWVcOutboundLabel", "hwPWVcSecondary", "hwPWVcStateChangeReason", "sysUpTime", "hwPWVcIfName", "hwPWVcSwitchID", "hwPWVcTnlPolicyName"],
    fieldOids: ["hwPWVcPeerAddr": "1.3.6.1.4.1.2011.5.25.119.4.1.1.1.1.4", "hwPWVcIfIndex": "1.3.6.1.4.1.2011.5.25.119.4.1.1.1.1.15", "hwPWVcInboundLabel": "1.3.6.1.4.1.2011.5.25.119.4.1.1.1.1.6", "hwPWVcOutboundLabel": "1.3.6.1.4.1.2011.5.25.119.4.1.1.1.1.7", "hwPWVcSecondary": "1.3.6.1.4.1.2011.5.25.119.4.1.1.1.1.27", "hwPWVcStateChangeReason": "1.3.6.1.4.1.2011.5.25.119.4.1.1.8", "sysUpTime": "1.3.6.1.2.1.1.3", "hwPWVcIfName": "1.3.6.1.4.1.2011.5.25.119.4.1.1.1.1.49", "hwPWVcSwitchID": "1.3.6.1.4.1.2011.5.25.119.4.1.1.1.1.9", "hwPWVcTnlPolicyName": "1.3.6.1.4.1.2011.5.25.119.4.1.1.1.1.23"]
]

// --- hwPWVcUp (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.119.4.1.2.4
// Fields: hwPWVcPeerAddr, hwPWVcIfIndex, hwPWVcInboundLabel, hwPWVcOutboundLabel, hwPWVcSecondary, hwPWVcStateChangeReason, sysUpTime, hwPWVcIfName, hwPWVcSwitchID, hwPWVcTnlPolicyName
// Description: This notification indicates the VC's state changes to up.
trapMap["1.3.6.1.4.1.2011.5.25.119.4.1.2.4"] = [
    name: "hwPWVcUp",
    fields: ["hwPWVcPeerAddr", "hwPWVcIfIndex", "hwPWVcInboundLabel", "hwPWVcOutboundLabel", "hwPWVcSecondary", "hwPWVcStateChangeReason", "sysUpTime", "hwPWVcIfName", "hwPWVcSwitchID", "hwPWVcTnlPolicyName"],
    fieldOids: ["hwPWVcPeerAddr": "1.3.6.1.4.1.2011.5.25.119.4.1.1.1.1.4", "hwPWVcIfIndex": "1.3.6.1.4.1.2011.5.25.119.4.1.1.1.1.15", "hwPWVcInboundLabel": "1.3.6.1.4.1.2011.5.25.119.4.1.1.1.1.6", "hwPWVcOutboundLabel": "1.3.6.1.4.1.2011.5.25.119.4.1.1.1.1.7", "hwPWVcSecondary": "1.3.6.1.4.1.2011.5.25.119.4.1.1.1.1.27", "hwPWVcStateChangeReason": "1.3.6.1.4.1.2011.5.25.119.4.1.1.8", "sysUpTime": "1.3.6.1.2.1.1.3", "hwPWVcIfName": "1.3.6.1.4.1.2011.5.25.119.4.1.1.1.1.49", "hwPWVcSwitchID": "1.3.6.1.4.1.2011.5.25.119.4.1.1.1.1.9", "hwPWVcTnlPolicyName": "1.3.6.1.4.1.2011.5.25.119.4.1.1.1.1.23"]
]

// --- hwPWVcDeleted (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.119.4.1.2.5
// Fields: hwPWVcPeerAddr, hwPWVcIfIndex, hwPWVcInboundLabel, hwPWVcOutboundLabel, hwPWVcSecondary, hwPWVcIfName, hwPWVcSwitchID
// Description: This notification indicates the VC is deleted.
trapMap["1.3.6.1.4.1.2011.5.25.119.4.1.2.5"] = [
    name: "hwPWVcDeleted",
    fields: ["hwPWVcPeerAddr", "hwPWVcIfIndex", "hwPWVcInboundLabel", "hwPWVcOutboundLabel", "hwPWVcSecondary", "hwPWVcIfName", "hwPWVcSwitchID"],
    fieldOids: ["hwPWVcPeerAddr": "1.3.6.1.4.1.2011.5.25.119.4.1.1.1.1.4", "hwPWVcIfIndex": "1.3.6.1.4.1.2011.5.25.119.4.1.1.1.1.15", "hwPWVcInboundLabel": "1.3.6.1.4.1.2011.5.25.119.4.1.1.1.1.6", "hwPWVcOutboundLabel": "1.3.6.1.4.1.2011.5.25.119.4.1.1.1.1.7", "hwPWVcSecondary": "1.3.6.1.4.1.2011.5.25.119.4.1.1.1.1.27", "hwPWVcIfName": "1.3.6.1.4.1.2011.5.25.119.4.1.1.1.1.49", "hwPWVcSwitchID": "1.3.6.1.4.1.2011.5.25.119.4.1.1.1.1.9"]
]

// --- hwPWVcBackup (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.119.4.1.2.6
// Fields: hwPWVcPeerAddr, hwPWVcIfIndex, hwPWVcInboundLabel, hwPWVcOutboundLabel, hwPWVcSecondary, hwPWVcStateChangeReason, sysUpTime, hwPWVcIfName, hwPWVcSwitchID
// Description: This notification indicates the VC's state changes to backup.
trapMap["1.3.6.1.4.1.2011.5.25.119.4.1.2.6"] = [
    name: "hwPWVcBackup",
    fields: ["hwPWVcPeerAddr", "hwPWVcIfIndex", "hwPWVcInboundLabel", "hwPWVcOutboundLabel", "hwPWVcSecondary", "hwPWVcStateChangeReason", "sysUpTime", "hwPWVcIfName", "hwPWVcSwitchID"],
    fieldOids: ["hwPWVcPeerAddr": "1.3.6.1.4.1.2011.5.25.119.4.1.1.1.1.4", "hwPWVcIfIndex": "1.3.6.1.4.1.2011.5.25.119.4.1.1.1.1.15", "hwPWVcInboundLabel": "1.3.6.1.4.1.2011.5.25.119.4.1.1.1.1.6", "hwPWVcOutboundLabel": "1.3.6.1.4.1.2011.5.25.119.4.1.1.1.1.7", "hwPWVcSecondary": "1.3.6.1.4.1.2011.5.25.119.4.1.1.1.1.27", "hwPWVcStateChangeReason": "1.3.6.1.4.1.2011.5.25.119.4.1.1.8", "sysUpTime": "1.3.6.1.2.1.1.3", "hwPWVcIfName": "1.3.6.1.4.1.2011.5.25.119.4.1.1.1.1.49", "hwPWVcSwitchID": "1.3.6.1.4.1.2011.5.25.119.4.1.1.1.1.9"]
]

// --- hwLdpPWVcDown (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.119.4.1.2.7
// Fields: hwPWVcPeerAddr, hwLdpPWStateChangeReason
// Description: This notification indicates the LDP PW VC's state changes to down.
trapMap["1.3.6.1.4.1.2011.5.25.119.4.1.2.7"] = [
    name: "hwLdpPWVcDown",
    fields: ["hwPWVcPeerAddr", "hwLdpPWStateChangeReason"],
    fieldOids: ["hwPWVcPeerAddr": "1.3.6.1.4.1.2011.5.25.119.4.1.1.1.1.4", "hwLdpPWStateChangeReason": "1.3.6.1.4.1.2011.5.25.119.4.1.1.10"]
]

// --- hwLdpPWVcUp (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.119.4.1.2.8
// Fields: hwPWVcPeerAddr, hwLdpPWStateChangeReason
// Description: This notification indicates the Ldp PW VC's state changes to up.
trapMap["1.3.6.1.4.1.2011.5.25.119.4.1.2.8"] = [
    name: "hwLdpPWVcUp",
    fields: ["hwPWVcPeerAddr", "hwLdpPWStateChangeReason"],
    fieldOids: ["hwPWVcPeerAddr": "1.3.6.1.4.1.2011.5.25.119.4.1.1.1.1.4", "hwLdpPWStateChangeReason": "1.3.6.1.4.1.2011.5.25.119.4.1.1.10"]
]

// --- hwPWVcStatusChange (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.119.4.1.2.9
// Fields: hwPWVcPeerAddr, hwPWVcStatus, hwPWVcActive
// Description: This notification indicates the VC's Active state changed.
trapMap["1.3.6.1.4.1.2011.5.25.119.4.1.2.9"] = [
    name: "hwPWVcStatusChange",
    fields: ["hwPWVcPeerAddr", "hwPWVcStatus", "hwPWVcActive"],
    fieldOids: ["hwPWVcPeerAddr": "1.3.6.1.4.1.2011.5.25.119.4.1.1.1.1.4", "hwPWVcStatus": "1.3.6.1.4.1.2011.5.25.119.4.1.1.1.1.5", "hwPWVcActive": "1.3.6.1.4.1.2011.5.25.119.4.1.1.1.1.37"]
]

// --- hwVpwsPwRedundancyDegraded (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.119.4.1.2.10
// Fields: hwPWVcIfIndex, hwPWVcIfName
// Description: VPWS PW redundancy reported a protect degraded alarm.
trapMap["1.3.6.1.4.1.2011.5.25.119.4.1.2.10"] = [
    name: "hwVpwsPwRedundancyDegraded",
    fields: ["hwPWVcIfIndex", "hwPWVcIfName"],
    fieldOids: ["hwPWVcIfIndex": "1.3.6.1.4.1.2011.5.25.119.4.1.1.1.1.15", "hwPWVcIfName": "1.3.6.1.4.1.2011.5.25.119.4.1.1.1.1.49"]
]

// --- hwVpwsPwRedundancyDegradedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.119.4.1.2.11
// Fields: hwPWVcIfIndex, hwPWVcIfName
// Description: VPWS PW redundancy reported the clearing of the protect degraded alarm.
trapMap["1.3.6.1.4.1.2011.5.25.119.4.1.2.11"] = [
    name: "hwVpwsPwRedundancyDegradedClear",
    fields: ["hwPWVcIfIndex", "hwPWVcIfName"],
    fieldOids: ["hwPWVcIfIndex": "1.3.6.1.4.1.2011.5.25.119.4.1.1.1.1.15", "hwPWVcIfName": "1.3.6.1.4.1.2011.5.25.119.4.1.1.1.1.49"]
]

// --- hwRemoteApPwParaMisMatch (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.119.4.1.2.12
// Fields: hwPWVcPeerAddr, hwPWVcPwTdmEncapsulationNum, hwPWVcPwJitterBufferDepth, hwPWVcPwRtpHeader, hwPWVcPwIdleCode, hwPWVcIfName, hwL2vpnAcIfPhyType, hwL2vpnAcIfLinkType, hwL2vpnAcIfEncap, hwL2vpnAcIfMinEncapNum, hwL2vpnAcIfMaxEncapNum, hwL2vpnAcIfEncapStep, hwL2vpnAcIfMinJitterBuffer, hwL2vpnAcIfMaxJitterBuffer, hwL2vpnAcIfJitterBufferStep, hwL2vpnAcIfCfgTtpHeader, hwL2vpnAcIfMinIdleCode, hwL2vpnAcIfMaxIdleCode
// Description: This notification indicates the low-speed interface parameter settings reported by the remoter AP mismatch those of the PW.
trapMap["1.3.6.1.4.1.2011.5.25.119.4.1.2.12"] = [
    name: "hwRemoteApPwParaMisMatch",
    fields: ["hwPWVcPeerAddr", "hwPWVcPwTdmEncapsulationNum", "hwPWVcPwJitterBufferDepth", "hwPWVcPwRtpHeader", "hwPWVcPwIdleCode", "hwPWVcIfName", "hwL2vpnAcIfPhyType", "hwL2vpnAcIfLinkType", "hwL2vpnAcIfEncap", "hwL2vpnAcIfMinEncapNum", "hwL2vpnAcIfMaxEncapNum", "hwL2vpnAcIfEncapStep", "hwL2vpnAcIfMinJitterBuffer", "hwL2vpnAcIfMaxJitterBuffer", "hwL2vpnAcIfJitterBufferStep", "hwL2vpnAcIfCfgTtpHeader", "hwL2vpnAcIfMinIdleCode", "hwL2vpnAcIfMaxIdleCode"],
    fieldOids: ["hwPWVcPeerAddr": "1.3.6.1.4.1.2011.5.25.119.4.1.1.1.1.4", "hwPWVcPwTdmEncapsulationNum": "1.3.6.1.4.1.2011.5.25.119.4.1.1.1.1.54", "hwPWVcPwJitterBufferDepth": "1.3.6.1.4.1.2011.5.25.119.4.1.1.1.1.53", "hwPWVcPwRtpHeader": "1.3.6.1.4.1.2011.5.25.119.4.1.1.1.1.56", "hwPWVcPwIdleCode": "1.3.6.1.4.1.2011.5.25.119.4.1.1.1.1.55", "hwPWVcIfName": "1.3.6.1.4.1.2011.5.25.119.4.1.1.1.1.49", "hwL2vpnAcIfPhyType": "1.3.6.1.4.1.2011.5.25.119.8.16.1.2", "hwL2vpnAcIfLinkType": "1.3.6.1.4.1.2011.5.25.119.8.16.1.3", "hwL2vpnAcIfEncap": "1.3.6.1.4.1.2011.5.25.119.8.16.1.4", "hwL2vpnAcIfMinEncapNum": "1.3.6.1.4.1.2011.5.25.119.8.16.1.5", "hwL2vpnAcIfMaxEncapNum": "1.3.6.1.4.1.2011.5.25.119.8.16.1.6", "hwL2vpnAcIfEncapStep": "1.3.6.1.4.1.2011.5.25.119.8.16.1.7", "hwL2vpnAcIfMinJitterBuffer": "1.3.6.1.4.1.2011.5.25.119.8.16.1.8", "hwL2vpnAcIfMaxJitterBuffer": "1.3.6.1.4.1.2011.5.25.119.8.16.1.9", "hwL2vpnAcIfJitterBufferStep": "1.3.6.1.4.1.2011.5.25.119.8.16.1.10", "hwL2vpnAcIfCfgTtpHeader": "1.3.6.1.4.1.2011.5.25.119.8.16.1.11", "hwL2vpnAcIfMinIdleCode": "1.3.6.1.4.1.2011.5.25.119.8.16.1.12", "hwL2vpnAcIfMaxIdleCode": "1.3.6.1.4.1.2011.5.25.119.8.16.1.13"]
]

// --- hwRemoteApPwParaMisMatchResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.119.4.1.2.13
// Fields: hwPWVcPeerAddr, hwPWVcPwTdmEncapsulationNum, hwPWVcPwJitterBufferDepth, hwPWVcPwRtpHeader, hwPWVcPwIdleCode, hwPWVcIfName, hwL2vpnAcIfPhyType, hwL2vpnAcIfLinkType, hwL2vpnAcIfEncap, hwL2vpnAcIfMinEncapNum, hwL2vpnAcIfMaxEncapNum, hwL2vpnAcIfEncapStep, hwL2vpnAcIfMinJitterBuffer, hwL2vpnAcIfMaxJitterBuffer, hwL2vpnAcIfJitterBufferStep, hwL2vpnAcIfCfgTtpHeader, hwL2vpnAcIfMinIdleCode, hwL2vpnAcIfMaxIdleCode
// Description: This notification indicates the low-speed interface parameter settings reported by the remoter AP match those of the PW.
trapMap["1.3.6.1.4.1.2011.5.25.119.4.1.2.13"] = [
    name: "hwRemoteApPwParaMisMatchResume",
    fields: ["hwPWVcPeerAddr", "hwPWVcPwTdmEncapsulationNum", "hwPWVcPwJitterBufferDepth", "hwPWVcPwRtpHeader", "hwPWVcPwIdleCode", "hwPWVcIfName", "hwL2vpnAcIfPhyType", "hwL2vpnAcIfLinkType", "hwL2vpnAcIfEncap", "hwL2vpnAcIfMinEncapNum", "hwL2vpnAcIfMaxEncapNum", "hwL2vpnAcIfEncapStep", "hwL2vpnAcIfMinJitterBuffer", "hwL2vpnAcIfMaxJitterBuffer", "hwL2vpnAcIfJitterBufferStep", "hwL2vpnAcIfCfgTtpHeader", "hwL2vpnAcIfMinIdleCode", "hwL2vpnAcIfMaxIdleCode"],
    fieldOids: ["hwPWVcPeerAddr": "1.3.6.1.4.1.2011.5.25.119.4.1.1.1.1.4", "hwPWVcPwTdmEncapsulationNum": "1.3.6.1.4.1.2011.5.25.119.4.1.1.1.1.54", "hwPWVcPwJitterBufferDepth": "1.3.6.1.4.1.2011.5.25.119.4.1.1.1.1.53", "hwPWVcPwRtpHeader": "1.3.6.1.4.1.2011.5.25.119.4.1.1.1.1.56", "hwPWVcPwIdleCode": "1.3.6.1.4.1.2011.5.25.119.4.1.1.1.1.55", "hwPWVcIfName": "1.3.6.1.4.1.2011.5.25.119.4.1.1.1.1.49", "hwL2vpnAcIfPhyType": "1.3.6.1.4.1.2011.5.25.119.8.16.1.2", "hwL2vpnAcIfLinkType": "1.3.6.1.4.1.2011.5.25.119.8.16.1.3", "hwL2vpnAcIfEncap": "1.3.6.1.4.1.2011.5.25.119.8.16.1.4", "hwL2vpnAcIfMinEncapNum": "1.3.6.1.4.1.2011.5.25.119.8.16.1.5", "hwL2vpnAcIfMaxEncapNum": "1.3.6.1.4.1.2011.5.25.119.8.16.1.6", "hwL2vpnAcIfEncapStep": "1.3.6.1.4.1.2011.5.25.119.8.16.1.7", "hwL2vpnAcIfMinJitterBuffer": "1.3.6.1.4.1.2011.5.25.119.8.16.1.8", "hwL2vpnAcIfMaxJitterBuffer": "1.3.6.1.4.1.2011.5.25.119.8.16.1.9", "hwL2vpnAcIfJitterBufferStep": "1.3.6.1.4.1.2011.5.25.119.8.16.1.10", "hwL2vpnAcIfCfgTtpHeader": "1.3.6.1.4.1.2011.5.25.119.8.16.1.11", "hwL2vpnAcIfMinIdleCode": "1.3.6.1.4.1.2011.5.25.119.8.16.1.12", "hwL2vpnAcIfMaxIdleCode": "1.3.6.1.4.1.2011.5.25.119.8.16.1.13"]
]

// --- hwSvcSwitchWtoP (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.119.4.1.4.1
// Fields: hwSvcID, hwSvcType, hwSvcCtrlWord, hwSvcStateChangeReason, ifName
// Description: This notification is generated when switch from working PW to protect PW happens.Currently, can't support.
trapMap["1.3.6.1.4.1.2011.5.25.119.4.1.4.1"] = [
    name: "hwSvcSwitchWtoP",
    fields: ["hwSvcID", "hwSvcType", "hwSvcCtrlWord", "hwSvcStateChangeReason", "ifName"],
    fieldOids: ["hwSvcID": "1.3.6.1.4.1.2011.5.25.119.4.1.3.1.1.2", "hwSvcType": "1.3.6.1.4.1.2011.5.25.119.4.1.3.1.1.3", "hwSvcCtrlWord": "1.3.6.1.4.1.2011.5.25.119.4.1.3.1.1.13", "hwSvcStateChangeReason": "1.3.6.1.4.1.2011.5.25.119.4.1.3.7", "ifName": "1.3.6.1.2.1.31.1.1.1.1"]
]

// --- hwSvcSwitchPtoW (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.119.4.1.4.2
// Fields: hwSvcID, hwSvcType, hwSvcCtrlWord, hwSvcStateChangeReason, ifName
// Description: This notification is generated when switch from protect PW to working PW happens.Currently, can't support.
trapMap["1.3.6.1.4.1.2011.5.25.119.4.1.4.2"] = [
    name: "hwSvcSwitchPtoW",
    fields: ["hwSvcID", "hwSvcType", "hwSvcCtrlWord", "hwSvcStateChangeReason", "ifName"],
    fieldOids: ["hwSvcID": "1.3.6.1.4.1.2011.5.25.119.4.1.3.1.1.2", "hwSvcType": "1.3.6.1.4.1.2011.5.25.119.4.1.3.1.1.3", "hwSvcCtrlWord": "1.3.6.1.4.1.2011.5.25.119.4.1.3.1.1.13", "hwSvcStateChangeReason": "1.3.6.1.4.1.2011.5.25.119.4.1.3.7", "ifName": "1.3.6.1.2.1.31.1.1.1.1"]
]

// --- hwSvcDown (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.119.4.1.4.3
// Fields: hwSvcID, hwSvcType, hwSvcPeerAddr, hwSvcInboundLabel, hwSvcOutboundLabel, hwSvcStateChangeReason, ifName, hwSvcTnlPolicyName
// Description: This notification indicates the SVC's state changes to down.
trapMap["1.3.6.1.4.1.2011.5.25.119.4.1.4.3"] = [
    name: "hwSvcDown",
    fields: ["hwSvcID", "hwSvcType", "hwSvcPeerAddr", "hwSvcInboundLabel", "hwSvcOutboundLabel", "hwSvcStateChangeReason", "ifName", "hwSvcTnlPolicyName"],
    fieldOids: ["hwSvcID": "1.3.6.1.4.1.2011.5.25.119.4.1.3.1.1.2", "hwSvcType": "1.3.6.1.4.1.2011.5.25.119.4.1.3.1.1.3", "hwSvcPeerAddr": "1.3.6.1.4.1.2011.5.25.119.4.1.3.1.1.5", "hwSvcInboundLabel": "1.3.6.1.4.1.2011.5.25.119.4.1.3.1.1.7", "hwSvcOutboundLabel": "1.3.6.1.4.1.2011.5.25.119.4.1.3.1.1.8", "hwSvcStateChangeReason": "1.3.6.1.4.1.2011.5.25.119.4.1.3.7", "ifName": "1.3.6.1.2.1.31.1.1.1.1", "hwSvcTnlPolicyName": "1.3.6.1.4.1.2011.5.25.119.4.1.3.1.1.17"]
]

// --- hwSvcUp (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.119.4.1.4.4
// Fields: hwSvcID, hwSvcType, hwSvcPeerAddr, hwSvcInboundLabel, hwSvcOutboundLabel, hwSvcStateChangeReason, ifName, hwSvcTnlPolicyName
// Description: This notification indicates the SVC's state changes to up.
trapMap["1.3.6.1.4.1.2011.5.25.119.4.1.4.4"] = [
    name: "hwSvcUp",
    fields: ["hwSvcID", "hwSvcType", "hwSvcPeerAddr", "hwSvcInboundLabel", "hwSvcOutboundLabel", "hwSvcStateChangeReason", "ifName", "hwSvcTnlPolicyName"],
    fieldOids: ["hwSvcID": "1.3.6.1.4.1.2011.5.25.119.4.1.3.1.1.2", "hwSvcType": "1.3.6.1.4.1.2011.5.25.119.4.1.3.1.1.3", "hwSvcPeerAddr": "1.3.6.1.4.1.2011.5.25.119.4.1.3.1.1.5", "hwSvcInboundLabel": "1.3.6.1.4.1.2011.5.25.119.4.1.3.1.1.7", "hwSvcOutboundLabel": "1.3.6.1.4.1.2011.5.25.119.4.1.3.1.1.8", "hwSvcStateChangeReason": "1.3.6.1.4.1.2011.5.25.119.4.1.3.7", "ifName": "1.3.6.1.2.1.31.1.1.1.1", "hwSvcTnlPolicyName": "1.3.6.1.4.1.2011.5.25.119.4.1.3.1.1.17"]
]

// --- hwSvcDeleted (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.119.4.1.4.5
// Fields: hwSvcID, hwSvcType, hwSvcPeerAddr, hwSvcInboundLabel, hwSvcOutboundLabel, ifName
// Description: This notification indicates the SVC is deleted.
trapMap["1.3.6.1.4.1.2011.5.25.119.4.1.4.5"] = [
    name: "hwSvcDeleted",
    fields: ["hwSvcID", "hwSvcType", "hwSvcPeerAddr", "hwSvcInboundLabel", "hwSvcOutboundLabel", "ifName"],
    fieldOids: ["hwSvcID": "1.3.6.1.4.1.2011.5.25.119.4.1.3.1.1.2", "hwSvcType": "1.3.6.1.4.1.2011.5.25.119.4.1.3.1.1.3", "hwSvcPeerAddr": "1.3.6.1.4.1.2011.5.25.119.4.1.3.1.1.5", "hwSvcInboundLabel": "1.3.6.1.4.1.2011.5.25.119.4.1.3.1.1.7", "hwSvcOutboundLabel": "1.3.6.1.4.1.2011.5.25.119.4.1.3.1.1.8", "ifName": "1.3.6.1.2.1.31.1.1.1.1"]
]

// --- hwPWTemplateCannotDeleted (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.119.4.1.6.1
// Fields: hwPWTemplateName
// Description: This notification indicates the PWTemplate cannot be deleted.
trapMap["1.3.6.1.4.1.2011.5.25.119.4.1.6.1"] = [
    name: "hwPWTemplateCannotDeleted",
    fields: ["hwPWTemplateName"],
    fieldOids: ["hwPWTemplateName": "1.3.6.1.4.1.2011.5.25.119.4.1.5.1.1"]
]

// --- hwPWVcSwitchWtoPExpand (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.119.4.1.9.1
// Fields: hwPWVcCtrlWordExpand, hwPWVcSwitchRmtID, hwPWVcStateChangeReason, hwPWVcIfNameExpand
// Description: This notification is generated when switch from working PW to protect PW happens.
trapMap["1.3.6.1.4.1.2011.5.25.119.4.1.9.1"] = [
    name: "hwPWVcSwitchWtoPExpand",
    fields: ["hwPWVcCtrlWordExpand", "hwPWVcSwitchRmtID", "hwPWVcStateChangeReason", "hwPWVcIfNameExpand"],
    fieldOids: ["hwPWVcCtrlWordExpand": "1.3.6.1.4.1.2011.5.25.119.4.1.8.1.1.19", "hwPWVcSwitchRmtID": "1.3.6.1.4.1.2011.5.25.119.4.1.1.9", "hwPWVcStateChangeReason": "1.3.6.1.4.1.2011.5.25.119.4.1.1.8", "hwPWVcIfNameExpand": "1.3.6.1.4.1.2011.5.25.119.4.1.8.1.1.49"]
]

// --- hwPWVcSwitchPtoWExpand (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.119.4.1.9.2
// Fields: hwPWVcCtrlWordExpand, hwPWVcSwitchRmtID, hwPWVcStateChangeReason, hwPWVcIfNameExpand
// Description: This notification is generated when switch from protect PW to working PW happens.
trapMap["1.3.6.1.4.1.2011.5.25.119.4.1.9.2"] = [
    name: "hwPWVcSwitchPtoWExpand",
    fields: ["hwPWVcCtrlWordExpand", "hwPWVcSwitchRmtID", "hwPWVcStateChangeReason", "hwPWVcIfNameExpand"],
    fieldOids: ["hwPWVcCtrlWordExpand": "1.3.6.1.4.1.2011.5.25.119.4.1.8.1.1.19", "hwPWVcSwitchRmtID": "1.3.6.1.4.1.2011.5.25.119.4.1.1.9", "hwPWVcStateChangeReason": "1.3.6.1.4.1.2011.5.25.119.4.1.1.8", "hwPWVcIfNameExpand": "1.3.6.1.4.1.2011.5.25.119.4.1.8.1.1.49"]
]

// --- hwVpwsPwRedundancyDegradedExpand (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.119.4.1.9.3
// Fields: hwPWVcIfIndexExpand, hwPWVcIfNameExpand
// Description: VPWS PW redundancy reported a protect degraded alarm.
trapMap["1.3.6.1.4.1.2011.5.25.119.4.1.9.3"] = [
    name: "hwVpwsPwRedundancyDegradedExpand",
    fields: ["hwPWVcIfIndexExpand", "hwPWVcIfNameExpand"],
    fieldOids: ["hwPWVcIfIndexExpand": "1.3.6.1.4.1.2011.5.25.119.4.1.8.1.1.15", "hwPWVcIfNameExpand": "1.3.6.1.4.1.2011.5.25.119.4.1.8.1.1.49"]
]

// --- hwVpwsPwRedundancyDegradedClearExpand (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.119.4.1.9.4
// Fields: hwPWVcIfIndexExpand, hwPWVcIfNameExpand
// Description: VPWS PW redundancy reported the clearing of the protect degraded alarm.
trapMap["1.3.6.1.4.1.2011.5.25.119.4.1.9.4"] = [
    name: "hwVpwsPwRedundancyDegradedClearExpand",
    fields: ["hwPWVcIfIndexExpand", "hwPWVcIfNameExpand"],
    fieldOids: ["hwPWVcIfIndexExpand": "1.3.6.1.4.1.2011.5.25.119.4.1.8.1.1.15", "hwPWVcIfNameExpand": "1.3.6.1.4.1.2011.5.25.119.4.1.8.1.1.49"]
]

// ===== Parsing logic =====

// Set to true to enable diagnostic logging for this MIB parser
DEBUG = false

LOG_PREFIX = "[HUAWEI-PWE3-MIB]"
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
