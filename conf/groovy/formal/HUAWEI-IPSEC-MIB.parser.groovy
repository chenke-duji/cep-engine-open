/**
 * Auto-generated from HUAWEI-IPSEC-MIB.mib
 * Generated: 2026-08-24T18:28:30.032350700
 * Traps/Notifications (92): hwIPSecTunnelStateUp, hwIPSecTunnelStateDown, hwIPSecPkiHttpGetCrlSuccess, hwIPSecPkiHttpGetCrlFail, hwIPSecPkiLdapGetCrlSuccess, hwIPSecPkiLdapGetCrlFail, hwIPSecPkiHttpGetCertSuccess, hwIPSecPkiHttpGetCertFail, hwIPSecPkiLdapGetCertSuccess, hwIPSecPkiLdapGetCertFail, hwIPSecPkiCACertInValid, hwIPSecPkiCACertValid, hwIPSecPkiCACertExpired, hwIPSecPkiLocalCertInValid, hwIPSecPkiLocalCertValid, hwIPSecPkiLocalCertExpired, hwIPSecPkiCrlInValid, hwIPSecPkiCrlValid, hwIPSecPkiCrlExpired, hwIPSecPkiRsaKeyRemoteInValid, hwIPSecPkiKeyUpdateInValid, hwIPSecPkiKeyUpdateValid, hwIPSecPkiCACertUnexpired, hwIPSecPkiLocalCertUnexpired, hwIPSecPkiCrlUnexpired, hwIPSecPKIWriteToCFFail, hwIPSecPKIWriteToCFSuccess, hwIPSecHotStandbyWithoutDpd, hwIPSecHotStandbyWithDpd, hwIPSecPkiWhitelistCnNumberTrap, hwIPSecPkiWhitelistCnNumberResumeTrap, hwIPSecPkiWhitelistNegotiationFail, hwIKEDPDProbeFail, hwIKEDPDProbeSuccess, hwIkeSANegotiationFail, hwIkeSANegotiationSuccess, hwIPSECSANegotiationFail, hwIPSECSANegotiationSuccess, hwIPSecPkiLocalCertAboutToExpire, hwIPSecPkiLocalCertAlrValid, hwIPSecPkiCALocalCertExpired, hwIPSecPkiCALocalCertValid, hwIPSecLicenseExhaustAlarm, hwIPSecLicenseExhaustAlarmResume, hwIPSecPkiCmpDownloadCertSuc, hwIPSecPkiCmpDownloadCertFail, hwIPSecPkiLocalCertClrFSuc, hwIPSecPkiLocalCertClrFail, hwIPSecPkiCertExpiredCritical, hwIPSecPkiCertUnexpiredCritical, hwIPSecNegotiationConflict, hwIPsecServiceFaultAlarm, hwIPsecServiceFaultResumeAlarm, hwxSECServiceFaultAlarm, hwxSECServiceFaultResumeAlarm, hwIPSecHotStandbyConfigurationInconsistent, hwIPSecNegotiationFail, hwIPSecNegotiationSuccess, hwIPSecPkiCertChainInValid, hwIPSecPkiCertChainValid, hwXsecPafExhaustAlarm, hwXsecPafExhaustAlarmResume, hwIPSecMhOutOfResourcesAlarm, hwIPSecMhOutOfResourcesAlarmResume, hwIPSecMhLocalPoolThresholdAlarm, hwIPSecMhLocalPoolThresholdAlarmResume, hwXsecNegoFailAlarm, hwXsecNegoFailAlarmResume, hwXsecPlainSwitchAlarm, hwXsecPlainSwitchAlarmResume, hwIPsecSaCountThresholdAlarm, hwIPsecSaCountThresholdAlarmResume, hwIPsecSaCountExhaustAlarm, hwIPsecSaCountExhaustAlarmResume, hwIPsecSessionThresholdAlarm, hwIPsecSessionThresholdAlarmResume, hwIPsecSessionExhaustAlarm, hwIPsecSessionExhaustAlarmResume, hwIPSECVSUBBandwidthAlarm, hwIPSECVSUBBandwidthResumeAlarm, hwIPSECVSUBBandwidthExhaustAlarm, hwIPSECVSUBBandwidthExhaustResumeAlarm, hwIPSecIKEV1UnsupportedAlarm, hwIPSecIKEV1UnsupportedAlarmResume, hwIPSECBandwidthLicenseResLackAlarm, hwIPSECBandwidthLicenseResLackResumeAlarm, hwxSECVSUBBandwidthAlarm, hwxSECVSUBBandwidthResumeAlarm, hwxSECVSUBBandwidthExhaustAlarm, hwxSECVSUBBandwidthExhaustResumeAlarm, hwIPSecVsuBoardMatchAlarm, hwIPSecVsuBoardMatchAlarmResume
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

// --- hwIPSecTunnelStateUp (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.224.2.1.1
// Fields: hwIPSecPolicyName, hwIPSecPolicySeq, hwIPSecInterface, hwIPSecLocalIp, hwIPSecRemoteIp, hwIPSecRemotePort
// Description: IPSec tunnel statues is up.
trapMap["1.3.6.1.4.1.2011.5.25.224.2.1.1"] = [
    name: "hwIPSecTunnelStateUp",
    fields: ["hwIPSecPolicyName", "hwIPSecPolicySeq", "hwIPSecInterface", "hwIPSecLocalIp", "hwIPSecRemoteIp", "hwIPSecRemotePort"],
    fieldOids: ["hwIPSecPolicyName": "1.3.6.1.4.1.2011.5.25.224.1.19.1", "hwIPSecPolicySeq": "1.3.6.1.4.1.2011.5.25.224.1.19.2", "hwIPSecInterface": "1.3.6.1.4.1.2011.5.25.224.1.19.3", "hwIPSecLocalIp": "1.3.6.1.4.1.2011.5.25.224.1.19.4", "hwIPSecRemoteIp": "1.3.6.1.4.1.2011.5.25.224.1.19.5", "hwIPSecRemotePort": "1.3.6.1.4.1.2011.5.25.224.1.19.6"]
]

// --- hwIPSecTunnelStateDown (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.224.2.1.2
// Fields: hwIPSecPolicyName, hwIPSecPolicySeq, hwIPSecInterface, hwIPSecLocalIp, hwIPSecRemoteIp, hwIPSecRemotePort
// Description: IPSec tunnel statues is dowm.
trapMap["1.3.6.1.4.1.2011.5.25.224.2.1.2"] = [
    name: "hwIPSecTunnelStateDown",
    fields: ["hwIPSecPolicyName", "hwIPSecPolicySeq", "hwIPSecInterface", "hwIPSecLocalIp", "hwIPSecRemoteIp", "hwIPSecRemotePort"],
    fieldOids: ["hwIPSecPolicyName": "1.3.6.1.4.1.2011.5.25.224.1.19.1", "hwIPSecPolicySeq": "1.3.6.1.4.1.2011.5.25.224.1.19.2", "hwIPSecInterface": "1.3.6.1.4.1.2011.5.25.224.1.19.3", "hwIPSecLocalIp": "1.3.6.1.4.1.2011.5.25.224.1.19.4", "hwIPSecRemoteIp": "1.3.6.1.4.1.2011.5.25.224.1.19.5", "hwIPSecRemotePort": "1.3.6.1.4.1.2011.5.25.224.1.19.6"]
]

// --- hwIPSecPkiHttpGetCrlSuccess (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.224.2.1.3
// Fields: hwIPSecPkiGetCertUrl, hwIPSecPkiIkeFailedVrfName
// Description: IPSec get crl by http success.
trapMap["1.3.6.1.4.1.2011.5.25.224.2.1.3"] = [
    name: "hwIPSecPkiHttpGetCrlSuccess",
    fields: ["hwIPSecPkiGetCertUrl", "hwIPSecPkiIkeFailedVrfName"],
    fieldOids: ["hwIPSecPkiGetCertUrl": "1.3.6.1.4.1.2011.5.25.224.1.19.7", "hwIPSecPkiIkeFailedVrfName": "1.3.6.1.4.1.2011.5.25.224.1.19.23"]
]

// --- hwIPSecPkiHttpGetCrlFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.224.2.1.4
// Fields: hwIPSecPkiGetCertUrl, hwIPSecPkiIkeFailedVrfName
// Description: IPSec get crl by http failed.
trapMap["1.3.6.1.4.1.2011.5.25.224.2.1.4"] = [
    name: "hwIPSecPkiHttpGetCrlFail",
    fields: ["hwIPSecPkiGetCertUrl", "hwIPSecPkiIkeFailedVrfName"],
    fieldOids: ["hwIPSecPkiGetCertUrl": "1.3.6.1.4.1.2011.5.25.224.1.19.7", "hwIPSecPkiIkeFailedVrfName": "1.3.6.1.4.1.2011.5.25.224.1.19.23"]
]

// --- hwIPSecPkiLdapGetCrlSuccess (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.224.2.1.5
// Fields: hwIPSecPkiGetCertIp, hwIPSecPkiGetCertPort, hwIPSecPkiCertAttr, hwIPSecPkiCertDiffName, hwIPSecPkiGetCertLdapVersion, hwIPSecPkiIkeFailedVrfName
// Description: IPSec get crl by ldap success.
trapMap["1.3.6.1.4.1.2011.5.25.224.2.1.5"] = [
    name: "hwIPSecPkiLdapGetCrlSuccess",
    fields: ["hwIPSecPkiGetCertIp", "hwIPSecPkiGetCertPort", "hwIPSecPkiCertAttr", "hwIPSecPkiCertDiffName", "hwIPSecPkiGetCertLdapVersion", "hwIPSecPkiIkeFailedVrfName"],
    fieldOids: ["hwIPSecPkiGetCertIp": "1.3.6.1.4.1.2011.5.25.224.1.19.8", "hwIPSecPkiGetCertPort": "1.3.6.1.4.1.2011.5.25.224.1.19.9", "hwIPSecPkiCertAttr": "1.3.6.1.4.1.2011.5.25.224.1.19.11", "hwIPSecPkiCertDiffName": "1.3.6.1.4.1.2011.5.25.224.1.19.12", "hwIPSecPkiGetCertLdapVersion": "1.3.6.1.4.1.2011.5.25.224.1.19.10", "hwIPSecPkiIkeFailedVrfName": "1.3.6.1.4.1.2011.5.25.224.1.19.23"]
]

// --- hwIPSecPkiLdapGetCrlFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.224.2.1.6
// Fields: hwIPSecPkiGetCertIp, hwIPSecPkiGetCertPort, hwIPSecPkiCertAttr, hwIPSecPkiCertDiffName, hwIPSecPkiGetCertLdapVersion, hwIPSecPkiIkeFailedVrfName
// Description: IPSec get crl by ldap failed.
trapMap["1.3.6.1.4.1.2011.5.25.224.2.1.6"] = [
    name: "hwIPSecPkiLdapGetCrlFail",
    fields: ["hwIPSecPkiGetCertIp", "hwIPSecPkiGetCertPort", "hwIPSecPkiCertAttr", "hwIPSecPkiCertDiffName", "hwIPSecPkiGetCertLdapVersion", "hwIPSecPkiIkeFailedVrfName"],
    fieldOids: ["hwIPSecPkiGetCertIp": "1.3.6.1.4.1.2011.5.25.224.1.19.8", "hwIPSecPkiGetCertPort": "1.3.6.1.4.1.2011.5.25.224.1.19.9", "hwIPSecPkiCertAttr": "1.3.6.1.4.1.2011.5.25.224.1.19.11", "hwIPSecPkiCertDiffName": "1.3.6.1.4.1.2011.5.25.224.1.19.12", "hwIPSecPkiGetCertLdapVersion": "1.3.6.1.4.1.2011.5.25.224.1.19.10", "hwIPSecPkiIkeFailedVrfName": "1.3.6.1.4.1.2011.5.25.224.1.19.23"]
]

// --- hwIPSecPkiHttpGetCertSuccess (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.224.2.1.7
// Fields: hwIPSecPkiGetCertUrl, hwIPSecPkiSaveDwLdCaName, hwIPSecPkiIkeFailedVrfName
// Description: IPSec get cert by http success.
trapMap["1.3.6.1.4.1.2011.5.25.224.2.1.7"] = [
    name: "hwIPSecPkiHttpGetCertSuccess",
    fields: ["hwIPSecPkiGetCertUrl", "hwIPSecPkiSaveDwLdCaName", "hwIPSecPkiIkeFailedVrfName"],
    fieldOids: ["hwIPSecPkiGetCertUrl": "1.3.6.1.4.1.2011.5.25.224.1.19.7", "hwIPSecPkiSaveDwLdCaName": "1.3.6.1.4.1.2011.5.25.224.1.19.28", "hwIPSecPkiIkeFailedVrfName": "1.3.6.1.4.1.2011.5.25.224.1.19.23"]
]

// --- hwIPSecPkiHttpGetCertFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.224.2.1.8
// Fields: hwIPSecPkiGetCertUrl, hwIPSecPkiSaveDwLdCaName, hwIPSecPkiIkeFailedVrfName
// Description: IPSec get cert by http fail
trapMap["1.3.6.1.4.1.2011.5.25.224.2.1.8"] = [
    name: "hwIPSecPkiHttpGetCertFail",
    fields: ["hwIPSecPkiGetCertUrl", "hwIPSecPkiSaveDwLdCaName", "hwIPSecPkiIkeFailedVrfName"],
    fieldOids: ["hwIPSecPkiGetCertUrl": "1.3.6.1.4.1.2011.5.25.224.1.19.7", "hwIPSecPkiSaveDwLdCaName": "1.3.6.1.4.1.2011.5.25.224.1.19.28", "hwIPSecPkiIkeFailedVrfName": "1.3.6.1.4.1.2011.5.25.224.1.19.23"]
]

// --- hwIPSecPkiLdapGetCertSuccess (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.224.2.1.9
// Fields: hwIPSecPkiGetCertIp, hwIPSecPkiGetCertPort, hwIPSecPkiCertAttr, hwIPSecPkiCertDiffName, hwIPSecPkiGetCertLdapVersion, hwIPSecPkiSaveDwLdCaName, hwIPSecPkiIkeFailedVrfName
// Description: IPSec get cert by ldap success.
trapMap["1.3.6.1.4.1.2011.5.25.224.2.1.9"] = [
    name: "hwIPSecPkiLdapGetCertSuccess",
    fields: ["hwIPSecPkiGetCertIp", "hwIPSecPkiGetCertPort", "hwIPSecPkiCertAttr", "hwIPSecPkiCertDiffName", "hwIPSecPkiGetCertLdapVersion", "hwIPSecPkiSaveDwLdCaName", "hwIPSecPkiIkeFailedVrfName"],
    fieldOids: ["hwIPSecPkiGetCertIp": "1.3.6.1.4.1.2011.5.25.224.1.19.8", "hwIPSecPkiGetCertPort": "1.3.6.1.4.1.2011.5.25.224.1.19.9", "hwIPSecPkiCertAttr": "1.3.6.1.4.1.2011.5.25.224.1.19.11", "hwIPSecPkiCertDiffName": "1.3.6.1.4.1.2011.5.25.224.1.19.12", "hwIPSecPkiGetCertLdapVersion": "1.3.6.1.4.1.2011.5.25.224.1.19.10", "hwIPSecPkiSaveDwLdCaName": "1.3.6.1.4.1.2011.5.25.224.1.19.28", "hwIPSecPkiIkeFailedVrfName": "1.3.6.1.4.1.2011.5.25.224.1.19.23"]
]

// --- hwIPSecPkiLdapGetCertFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.224.2.1.10
// Fields: hwIPSecPkiGetCertIp, hwIPSecPkiGetCertPort, hwIPSecPkiCertAttr, hwIPSecPkiCertDiffName, hwIPSecPkiGetCertLdapVersion, hwIPSecPkiSaveDwLdCaName, hwIPSecPkiIkeFailedVrfName
// Description: IPSec get cert by ldap fail
trapMap["1.3.6.1.4.1.2011.5.25.224.2.1.10"] = [
    name: "hwIPSecPkiLdapGetCertFail",
    fields: ["hwIPSecPkiGetCertIp", "hwIPSecPkiGetCertPort", "hwIPSecPkiCertAttr", "hwIPSecPkiCertDiffName", "hwIPSecPkiGetCertLdapVersion", "hwIPSecPkiSaveDwLdCaName", "hwIPSecPkiIkeFailedVrfName"],
    fieldOids: ["hwIPSecPkiGetCertIp": "1.3.6.1.4.1.2011.5.25.224.1.19.8", "hwIPSecPkiGetCertPort": "1.3.6.1.4.1.2011.5.25.224.1.19.9", "hwIPSecPkiCertAttr": "1.3.6.1.4.1.2011.5.25.224.1.19.11", "hwIPSecPkiCertDiffName": "1.3.6.1.4.1.2011.5.25.224.1.19.12", "hwIPSecPkiGetCertLdapVersion": "1.3.6.1.4.1.2011.5.25.224.1.19.10", "hwIPSecPkiSaveDwLdCaName": "1.3.6.1.4.1.2011.5.25.224.1.19.28", "hwIPSecPkiIkeFailedVrfName": "1.3.6.1.4.1.2011.5.25.224.1.19.23"]
]

// --- hwIPSecPkiCACertInValid (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.224.2.1.11
// Fields: hwIPSecPkiStartValidTime, hwIPSecPkiExpiredTime, hwIPSecPkiCAIssuer, hwIPSecPkiCASubject, hwIPSecPkiGetCertFileName, hwIPSecPkiGetCertInvalidReason
// Description: IPsec pki CA certificate is invalid.
trapMap["1.3.6.1.4.1.2011.5.25.224.2.1.11"] = [
    name: "hwIPSecPkiCACertInValid",
    fields: ["hwIPSecPkiStartValidTime", "hwIPSecPkiExpiredTime", "hwIPSecPkiCAIssuer", "hwIPSecPkiCASubject", "hwIPSecPkiGetCertFileName", "hwIPSecPkiGetCertInvalidReason"],
    fieldOids: ["hwIPSecPkiStartValidTime": "1.3.6.1.4.1.2011.5.25.224.1.19.16", "hwIPSecPkiExpiredTime": "1.3.6.1.4.1.2011.5.25.224.1.19.17", "hwIPSecPkiCAIssuer": "1.3.6.1.4.1.2011.5.25.224.1.19.13", "hwIPSecPkiCASubject": "1.3.6.1.4.1.2011.5.25.224.1.19.14", "hwIPSecPkiGetCertFileName": "1.3.6.1.4.1.2011.5.25.224.1.19.35", "hwIPSecPkiGetCertInvalidReason": "1.3.6.1.4.1.2011.5.25.224.1.19.36"]
]

// --- hwIPSecPkiCACertValid (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.224.2.1.12
// Fields: hwIPSecPkiStartValidTime, hwIPSecPkiExpiredTime, hwIPSecPkiCAIssuer, hwIPSecPkiCASubject, hwIPSecPkiGetCertFileName
// Description: IPsec pki CA certificate is valid.
trapMap["1.3.6.1.4.1.2011.5.25.224.2.1.12"] = [
    name: "hwIPSecPkiCACertValid",
    fields: ["hwIPSecPkiStartValidTime", "hwIPSecPkiExpiredTime", "hwIPSecPkiCAIssuer", "hwIPSecPkiCASubject", "hwIPSecPkiGetCertFileName"],
    fieldOids: ["hwIPSecPkiStartValidTime": "1.3.6.1.4.1.2011.5.25.224.1.19.16", "hwIPSecPkiExpiredTime": "1.3.6.1.4.1.2011.5.25.224.1.19.17", "hwIPSecPkiCAIssuer": "1.3.6.1.4.1.2011.5.25.224.1.19.13", "hwIPSecPkiCASubject": "1.3.6.1.4.1.2011.5.25.224.1.19.14", "hwIPSecPkiGetCertFileName": "1.3.6.1.4.1.2011.5.25.224.1.19.35"]
]

// --- hwIPSecPkiCACertExpired (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.224.2.1.13
// Fields: hwIPSecPkiStartValidTime, hwIPSecPkiExpiredTime, hwIPSecPkiCAIssuer, hwIPSecPkiCASubject, hwIPSecPkiGetCertFileName
// Description: IPsec pki CA certificate will be expired.
trapMap["1.3.6.1.4.1.2011.5.25.224.2.1.13"] = [
    name: "hwIPSecPkiCACertExpired",
    fields: ["hwIPSecPkiStartValidTime", "hwIPSecPkiExpiredTime", "hwIPSecPkiCAIssuer", "hwIPSecPkiCASubject", "hwIPSecPkiGetCertFileName"],
    fieldOids: ["hwIPSecPkiStartValidTime": "1.3.6.1.4.1.2011.5.25.224.1.19.16", "hwIPSecPkiExpiredTime": "1.3.6.1.4.1.2011.5.25.224.1.19.17", "hwIPSecPkiCAIssuer": "1.3.6.1.4.1.2011.5.25.224.1.19.13", "hwIPSecPkiCASubject": "1.3.6.1.4.1.2011.5.25.224.1.19.14", "hwIPSecPkiGetCertFileName": "1.3.6.1.4.1.2011.5.25.224.1.19.35"]
]

// --- hwIPSecPkiLocalCertInValid (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.224.2.1.14
// Fields: hwIPSecPkiStartValidTime, hwIPSecPkiExpiredTime, hwIPSecPkiCAIssuer, hwIPSecPkiCASubject, hwIPSecPkiGetCertFileName, hwIPSecPkiGetCertInvalidReason
// Description: IPsec pki local certificate is invalid.
trapMap["1.3.6.1.4.1.2011.5.25.224.2.1.14"] = [
    name: "hwIPSecPkiLocalCertInValid",
    fields: ["hwIPSecPkiStartValidTime", "hwIPSecPkiExpiredTime", "hwIPSecPkiCAIssuer", "hwIPSecPkiCASubject", "hwIPSecPkiGetCertFileName", "hwIPSecPkiGetCertInvalidReason"],
    fieldOids: ["hwIPSecPkiStartValidTime": "1.3.6.1.4.1.2011.5.25.224.1.19.16", "hwIPSecPkiExpiredTime": "1.3.6.1.4.1.2011.5.25.224.1.19.17", "hwIPSecPkiCAIssuer": "1.3.6.1.4.1.2011.5.25.224.1.19.13", "hwIPSecPkiCASubject": "1.3.6.1.4.1.2011.5.25.224.1.19.14", "hwIPSecPkiGetCertFileName": "1.3.6.1.4.1.2011.5.25.224.1.19.35", "hwIPSecPkiGetCertInvalidReason": "1.3.6.1.4.1.2011.5.25.224.1.19.36"]
]

// --- hwIPSecPkiLocalCertValid (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.224.2.1.15
// Fields: hwIPSecPkiStartValidTime, hwIPSecPkiExpiredTime, hwIPSecPkiCAIssuer, hwIPSecPkiCASubject, hwIPSecPkiGetCertFileName
// Description: IPsec pki local certificate is valid.
trapMap["1.3.6.1.4.1.2011.5.25.224.2.1.15"] = [
    name: "hwIPSecPkiLocalCertValid",
    fields: ["hwIPSecPkiStartValidTime", "hwIPSecPkiExpiredTime", "hwIPSecPkiCAIssuer", "hwIPSecPkiCASubject", "hwIPSecPkiGetCertFileName"],
    fieldOids: ["hwIPSecPkiStartValidTime": "1.3.6.1.4.1.2011.5.25.224.1.19.16", "hwIPSecPkiExpiredTime": "1.3.6.1.4.1.2011.5.25.224.1.19.17", "hwIPSecPkiCAIssuer": "1.3.6.1.4.1.2011.5.25.224.1.19.13", "hwIPSecPkiCASubject": "1.3.6.1.4.1.2011.5.25.224.1.19.14", "hwIPSecPkiGetCertFileName": "1.3.6.1.4.1.2011.5.25.224.1.19.35"]
]

// --- hwIPSecPkiLocalCertExpired (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.224.2.1.16
// Fields: hwIPSecPkiStartValidTime, hwIPSecPkiExpiredTime, hwIPSecPkiCAIssuer, hwIPSecPkiCASubject, hwIPSecPkiGetCertFileName
// Description: IPsec pki local certificate will be expired.
trapMap["1.3.6.1.4.1.2011.5.25.224.2.1.16"] = [
    name: "hwIPSecPkiLocalCertExpired",
    fields: ["hwIPSecPkiStartValidTime", "hwIPSecPkiExpiredTime", "hwIPSecPkiCAIssuer", "hwIPSecPkiCASubject", "hwIPSecPkiGetCertFileName"],
    fieldOids: ["hwIPSecPkiStartValidTime": "1.3.6.1.4.1.2011.5.25.224.1.19.16", "hwIPSecPkiExpiredTime": "1.3.6.1.4.1.2011.5.25.224.1.19.17", "hwIPSecPkiCAIssuer": "1.3.6.1.4.1.2011.5.25.224.1.19.13", "hwIPSecPkiCASubject": "1.3.6.1.4.1.2011.5.25.224.1.19.14", "hwIPSecPkiGetCertFileName": "1.3.6.1.4.1.2011.5.25.224.1.19.35"]
]

// --- hwIPSecPkiCrlInValid (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.224.2.1.17
// Fields: hwIPSecPkiStartValidTime, hwIPSecPkiExpiredTime, hwIPSecPkiCrlIssuer, hwIPSecPkiGetCertFileName, hwIPSecPkiGetCertInvalidReason
// Description: IPsec pki crl is invalid.
trapMap["1.3.6.1.4.1.2011.5.25.224.2.1.17"] = [
    name: "hwIPSecPkiCrlInValid",
    fields: ["hwIPSecPkiStartValidTime", "hwIPSecPkiExpiredTime", "hwIPSecPkiCrlIssuer", "hwIPSecPkiGetCertFileName", "hwIPSecPkiGetCertInvalidReason"],
    fieldOids: ["hwIPSecPkiStartValidTime": "1.3.6.1.4.1.2011.5.25.224.1.19.16", "hwIPSecPkiExpiredTime": "1.3.6.1.4.1.2011.5.25.224.1.19.17", "hwIPSecPkiCrlIssuer": "1.3.6.1.4.1.2011.5.25.224.1.19.15", "hwIPSecPkiGetCertFileName": "1.3.6.1.4.1.2011.5.25.224.1.19.35", "hwIPSecPkiGetCertInvalidReason": "1.3.6.1.4.1.2011.5.25.224.1.19.36"]
]

// --- hwIPSecPkiCrlValid (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.224.2.1.18
// Fields: hwIPSecPkiStartValidTime, hwIPSecPkiExpiredTime, hwIPSecPkiCrlIssuer, hwIPSecPkiGetCertFileName
// Description: IPsec pki crl is valid.
trapMap["1.3.6.1.4.1.2011.5.25.224.2.1.18"] = [
    name: "hwIPSecPkiCrlValid",
    fields: ["hwIPSecPkiStartValidTime", "hwIPSecPkiExpiredTime", "hwIPSecPkiCrlIssuer", "hwIPSecPkiGetCertFileName"],
    fieldOids: ["hwIPSecPkiStartValidTime": "1.3.6.1.4.1.2011.5.25.224.1.19.16", "hwIPSecPkiExpiredTime": "1.3.6.1.4.1.2011.5.25.224.1.19.17", "hwIPSecPkiCrlIssuer": "1.3.6.1.4.1.2011.5.25.224.1.19.15", "hwIPSecPkiGetCertFileName": "1.3.6.1.4.1.2011.5.25.224.1.19.35"]
]

// --- hwIPSecPkiCrlExpired (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.224.2.1.19
// Fields: hwIPSecPkiStartValidTime, hwIPSecPkiExpiredTime, hwIPSecPkiCrlIssuer, hwIPSecPkiGetCertFileName
// Description: IPsec pki crl will be expired.
trapMap["1.3.6.1.4.1.2011.5.25.224.2.1.19"] = [
    name: "hwIPSecPkiCrlExpired",
    fields: ["hwIPSecPkiStartValidTime", "hwIPSecPkiExpiredTime", "hwIPSecPkiCrlIssuer", "hwIPSecPkiGetCertFileName"],
    fieldOids: ["hwIPSecPkiStartValidTime": "1.3.6.1.4.1.2011.5.25.224.1.19.16", "hwIPSecPkiExpiredTime": "1.3.6.1.4.1.2011.5.25.224.1.19.17", "hwIPSecPkiCrlIssuer": "1.3.6.1.4.1.2011.5.25.224.1.19.15", "hwIPSecPkiGetCertFileName": "1.3.6.1.4.1.2011.5.25.224.1.19.35"]
]

// --- hwIPSecPkiRsaKeyRemoteInValid (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.224.2.1.20
// Fields: hwIPSecPkiStartValidTime, hwIPSecPkiExpiredTime, hwIPSecPkiCrlIssuer
// Description: RSA keys in master and slave device are different.
trapMap["1.3.6.1.4.1.2011.5.25.224.2.1.20"] = [
    name: "hwIPSecPkiRsaKeyRemoteInValid",
    fields: ["hwIPSecPkiStartValidTime", "hwIPSecPkiExpiredTime", "hwIPSecPkiCrlIssuer"],
    fieldOids: ["hwIPSecPkiStartValidTime": "1.3.6.1.4.1.2011.5.25.224.1.19.16", "hwIPSecPkiExpiredTime": "1.3.6.1.4.1.2011.5.25.224.1.19.17", "hwIPSecPkiCrlIssuer": "1.3.6.1.4.1.2011.5.25.224.1.19.15"]
]

// --- hwIPSecPkiKeyUpdateInValid (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.224.2.1.21
// Fields: hwIPSecPkiStartValidTime, hwIPSecPkiExpiredTime, hwIPSecPkiCrlIssuer
// Description: Automatically updating certificates failed.
trapMap["1.3.6.1.4.1.2011.5.25.224.2.1.21"] = [
    name: "hwIPSecPkiKeyUpdateInValid",
    fields: ["hwIPSecPkiStartValidTime", "hwIPSecPkiExpiredTime", "hwIPSecPkiCrlIssuer"],
    fieldOids: ["hwIPSecPkiStartValidTime": "1.3.6.1.4.1.2011.5.25.224.1.19.16", "hwIPSecPkiExpiredTime": "1.3.6.1.4.1.2011.5.25.224.1.19.17", "hwIPSecPkiCrlIssuer": "1.3.6.1.4.1.2011.5.25.224.1.19.15"]
]

// --- hwIPSecPkiKeyUpdateValid (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.224.2.1.22
// Fields: hwIPSecPkiStartValidTime, hwIPSecPkiExpiredTime, hwIPSecPkiCrlIssuer
// Description: Automatically updating certificates successful.
trapMap["1.3.6.1.4.1.2011.5.25.224.2.1.22"] = [
    name: "hwIPSecPkiKeyUpdateValid",
    fields: ["hwIPSecPkiStartValidTime", "hwIPSecPkiExpiredTime", "hwIPSecPkiCrlIssuer"],
    fieldOids: ["hwIPSecPkiStartValidTime": "1.3.6.1.4.1.2011.5.25.224.1.19.16", "hwIPSecPkiExpiredTime": "1.3.6.1.4.1.2011.5.25.224.1.19.17", "hwIPSecPkiCrlIssuer": "1.3.6.1.4.1.2011.5.25.224.1.19.15"]
]

// --- hwIPSecPkiCACertUnexpired (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.224.2.1.23
// Fields: hwIPSecPkiStartValidTime, hwIPSecPkiExpiredTime, hwIPSecPkiCAIssuer, hwIPSecPkiCASubject, hwIPSecPkiGetCertFileName
// Description: IPsec pki CA certificate has been updated.
trapMap["1.3.6.1.4.1.2011.5.25.224.2.1.23"] = [
    name: "hwIPSecPkiCACertUnexpired",
    fields: ["hwIPSecPkiStartValidTime", "hwIPSecPkiExpiredTime", "hwIPSecPkiCAIssuer", "hwIPSecPkiCASubject", "hwIPSecPkiGetCertFileName"],
    fieldOids: ["hwIPSecPkiStartValidTime": "1.3.6.1.4.1.2011.5.25.224.1.19.16", "hwIPSecPkiExpiredTime": "1.3.6.1.4.1.2011.5.25.224.1.19.17", "hwIPSecPkiCAIssuer": "1.3.6.1.4.1.2011.5.25.224.1.19.13", "hwIPSecPkiCASubject": "1.3.6.1.4.1.2011.5.25.224.1.19.14", "hwIPSecPkiGetCertFileName": "1.3.6.1.4.1.2011.5.25.224.1.19.35"]
]

// --- hwIPSecPkiLocalCertUnexpired (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.224.2.1.24
// Fields: hwIPSecPkiStartValidTime, hwIPSecPkiExpiredTime, hwIPSecPkiCAIssuer, hwIPSecPkiCASubject, hwIPSecPkiGetCertFileName
// Description: IPsec pki local certificate has been updated.
trapMap["1.3.6.1.4.1.2011.5.25.224.2.1.24"] = [
    name: "hwIPSecPkiLocalCertUnexpired",
    fields: ["hwIPSecPkiStartValidTime", "hwIPSecPkiExpiredTime", "hwIPSecPkiCAIssuer", "hwIPSecPkiCASubject", "hwIPSecPkiGetCertFileName"],
    fieldOids: ["hwIPSecPkiStartValidTime": "1.3.6.1.4.1.2011.5.25.224.1.19.16", "hwIPSecPkiExpiredTime": "1.3.6.1.4.1.2011.5.25.224.1.19.17", "hwIPSecPkiCAIssuer": "1.3.6.1.4.1.2011.5.25.224.1.19.13", "hwIPSecPkiCASubject": "1.3.6.1.4.1.2011.5.25.224.1.19.14", "hwIPSecPkiGetCertFileName": "1.3.6.1.4.1.2011.5.25.224.1.19.35"]
]

// --- hwIPSecPkiCrlUnexpired (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.224.2.1.25
// Fields: hwIPSecPkiStartValidTime, hwIPSecPkiExpiredTime, hwIPSecPkiCrlIssuer, hwIPSecPkiGetCertFileName
// Description: IPsec pki crl has been updated.
trapMap["1.3.6.1.4.1.2011.5.25.224.2.1.25"] = [
    name: "hwIPSecPkiCrlUnexpired",
    fields: ["hwIPSecPkiStartValidTime", "hwIPSecPkiExpiredTime", "hwIPSecPkiCrlIssuer", "hwIPSecPkiGetCertFileName"],
    fieldOids: ["hwIPSecPkiStartValidTime": "1.3.6.1.4.1.2011.5.25.224.1.19.16", "hwIPSecPkiExpiredTime": "1.3.6.1.4.1.2011.5.25.224.1.19.17", "hwIPSecPkiCrlIssuer": "1.3.6.1.4.1.2011.5.25.224.1.19.15", "hwIPSecPkiGetCertFileName": "1.3.6.1.4.1.2011.5.25.224.1.19.35"]
]

// --- hwIPSecPKIWriteToCFFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.224.2.1.26
// Description: The file is written to the cfcard unsuccessfully.
trapMap["1.3.6.1.4.1.2011.5.25.224.2.1.26"] = [
    name: "hwIPSecPKIWriteToCFFail",
    fields: [],
    fieldOids: []
]

// --- hwIPSecPKIWriteToCFSuccess (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.224.2.1.27
// Description: The file is written to the cfcard successfully.
trapMap["1.3.6.1.4.1.2011.5.25.224.2.1.27"] = [
    name: "hwIPSecPKIWriteToCFSuccess",
    fields: [],
    fieldOids: []
]

// --- hwIPSecHotStandbyWithoutDpd (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.224.2.1.28
// Description: Using IPsec hot standby function without enable DPD detection.
trapMap["1.3.6.1.4.1.2011.5.25.224.2.1.28"] = [
    name: "hwIPSecHotStandbyWithoutDpd",
    fields: [],
    fieldOids: []
]

// --- hwIPSecHotStandbyWithDpd (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.224.2.1.29
// Description: DPD detection has enabled in IPsec hot standby function, or IPsec hot standby function is disabled.
trapMap["1.3.6.1.4.1.2011.5.25.224.2.1.29"] = [
    name: "hwIPSecHotStandbyWithDpd",
    fields: [],
    fieldOids: []
]

// --- hwIPSecPkiWhitelistCnNumberTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.224.2.1.30
// Fields: hwIPSecPkiThrehold, hwIPSecPkiConfigureCnt
// Description: The number of data in PKI whitelists reached the alarm threshold.
trapMap["1.3.6.1.4.1.2011.5.25.224.2.1.30"] = [
    name: "hwIPSecPkiWhitelistCnNumberTrap",
    fields: ["hwIPSecPkiThrehold", "hwIPSecPkiConfigureCnt"],
    fieldOids: ["hwIPSecPkiThrehold": "1.3.6.1.4.1.2011.5.25.224.1.19.21", "hwIPSecPkiConfigureCnt": "1.3.6.1.4.1.2011.5.25.224.1.19.22"]
]

// --- hwIPSecPkiWhitelistCnNumberResumeTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.224.2.1.31
// Fields: hwIPSecPkiThrehold, hwIPSecPkiConfigureCnt
// Description: The number of data in PKI whitelists fell below the alarm threshold.
trapMap["1.3.6.1.4.1.2011.5.25.224.2.1.31"] = [
    name: "hwIPSecPkiWhitelistCnNumberResumeTrap",
    fields: ["hwIPSecPkiThrehold", "hwIPSecPkiConfigureCnt"],
    fieldOids: ["hwIPSecPkiThrehold": "1.3.6.1.4.1.2011.5.25.224.1.19.21", "hwIPSecPkiConfigureCnt": "1.3.6.1.4.1.2011.5.25.224.1.19.22"]
]

// --- hwIPSecPkiWhitelistNegotiationFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.224.2.1.32
// Fields: hwIPSecPkiIkeFailedIP, hwIPSecPkiIkeFailedCN, hwIPSecPkiIkeFailedVrfName, hwIPSecPkiIkeFailedPort
// Description: IPSec negotiation failed due to pki whitelist.
trapMap["1.3.6.1.4.1.2011.5.25.224.2.1.32"] = [
    name: "hwIPSecPkiWhitelistNegotiationFail",
    fields: ["hwIPSecPkiIkeFailedIP", "hwIPSecPkiIkeFailedCN", "hwIPSecPkiIkeFailedVrfName", "hwIPSecPkiIkeFailedPort"],
    fieldOids: ["hwIPSecPkiIkeFailedIP": "1.3.6.1.4.1.2011.5.25.224.1.19.19", "hwIPSecPkiIkeFailedCN": "1.3.6.1.4.1.2011.5.25.224.1.19.20", "hwIPSecPkiIkeFailedVrfName": "1.3.6.1.4.1.2011.5.25.224.1.19.23", "hwIPSecPkiIkeFailedPort": "1.3.6.1.4.1.2011.5.25.224.1.19.24"]
]

// --- hwIKEDPDProbeFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.224.2.1.33
// Fields: hwIPSecPkiIkeFailedVrfName, hwIPSecLocalIp, hwIPSecRemoteIp, hwIPSecPolicyName, hwIPSecInterface, hwIpsecIkeSaNegoFailDesc, hwIpsecIkeVersion
// Description: IPSec negotiation failed due to DPD Probe.
trapMap["1.3.6.1.4.1.2011.5.25.224.2.1.33"] = [
    name: "hwIKEDPDProbeFail",
    fields: ["hwIPSecPkiIkeFailedVrfName", "hwIPSecLocalIp", "hwIPSecRemoteIp", "hwIPSecPolicyName", "hwIPSecInterface", "hwIpsecIkeSaNegoFailDesc", "hwIpsecIkeVersion"],
    fieldOids: ["hwIPSecPkiIkeFailedVrfName": "1.3.6.1.4.1.2011.5.25.224.1.19.23", "hwIPSecLocalIp": "1.3.6.1.4.1.2011.5.25.224.1.19.4", "hwIPSecRemoteIp": "1.3.6.1.4.1.2011.5.25.224.1.19.5", "hwIPSecPolicyName": "1.3.6.1.4.1.2011.5.25.224.1.19.1", "hwIPSecInterface": "1.3.6.1.4.1.2011.5.25.224.1.19.3", "hwIpsecIkeSaNegoFailDesc": "1.3.6.1.4.1.2011.5.25.224.1.19.26", "hwIpsecIkeVersion": "1.3.6.1.4.1.2011.5.25.224.1.19.25"]
]

// --- hwIKEDPDProbeSuccess (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.224.2.1.34
// Fields: hwIPSecPkiIkeFailedVrfName, hwIPSecLocalIp, hwIPSecRemoteIp, hwIPSecPolicyName, hwIPSecInterface, hwIpsecIkeSaNegoFailDesc, hwIpsecIkeVersion
// Description: IKE SA negotiation success or configuration deleted.
trapMap["1.3.6.1.4.1.2011.5.25.224.2.1.34"] = [
    name: "hwIKEDPDProbeSuccess",
    fields: ["hwIPSecPkiIkeFailedVrfName", "hwIPSecLocalIp", "hwIPSecRemoteIp", "hwIPSecPolicyName", "hwIPSecInterface", "hwIpsecIkeSaNegoFailDesc", "hwIpsecIkeVersion"],
    fieldOids: ["hwIPSecPkiIkeFailedVrfName": "1.3.6.1.4.1.2011.5.25.224.1.19.23", "hwIPSecLocalIp": "1.3.6.1.4.1.2011.5.25.224.1.19.4", "hwIPSecRemoteIp": "1.3.6.1.4.1.2011.5.25.224.1.19.5", "hwIPSecPolicyName": "1.3.6.1.4.1.2011.5.25.224.1.19.1", "hwIPSecInterface": "1.3.6.1.4.1.2011.5.25.224.1.19.3", "hwIpsecIkeSaNegoFailDesc": "1.3.6.1.4.1.2011.5.25.224.1.19.26", "hwIpsecIkeVersion": "1.3.6.1.4.1.2011.5.25.224.1.19.25"]
]

// --- hwIkeSANegotiationFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.224.2.1.35
// Fields: hwIPSecPkiIkeFailedVrfName, hwIPSecLocalIp, hwIPSecRemoteIp, hwIPSecPolicyName, hwIPSecInterface, hwIpsecIkeVersion
// Description: IKE SA negotiation failed
trapMap["1.3.6.1.4.1.2011.5.25.224.2.1.35"] = [
    name: "hwIkeSANegotiationFail",
    fields: ["hwIPSecPkiIkeFailedVrfName", "hwIPSecLocalIp", "hwIPSecRemoteIp", "hwIPSecPolicyName", "hwIPSecInterface", "hwIpsecIkeVersion"],
    fieldOids: ["hwIPSecPkiIkeFailedVrfName": "1.3.6.1.4.1.2011.5.25.224.1.19.23", "hwIPSecLocalIp": "1.3.6.1.4.1.2011.5.25.224.1.19.4", "hwIPSecRemoteIp": "1.3.6.1.4.1.2011.5.25.224.1.19.5", "hwIPSecPolicyName": "1.3.6.1.4.1.2011.5.25.224.1.19.1", "hwIPSecInterface": "1.3.6.1.4.1.2011.5.25.224.1.19.3", "hwIpsecIkeVersion": "1.3.6.1.4.1.2011.5.25.224.1.19.25"]
]

// --- hwIkeSANegotiationSuccess (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.224.2.1.36
// Fields: hwIPSecPkiIkeFailedVrfName, hwIPSecLocalIp, hwIPSecRemoteIp, hwIPSecPolicyName, hwIPSecInterface, hwIpsecIkeVersion
// Description: IKE SA negotiation success or configuration deleted.
trapMap["1.3.6.1.4.1.2011.5.25.224.2.1.36"] = [
    name: "hwIkeSANegotiationSuccess",
    fields: ["hwIPSecPkiIkeFailedVrfName", "hwIPSecLocalIp", "hwIPSecRemoteIp", "hwIPSecPolicyName", "hwIPSecInterface", "hwIpsecIkeVersion"],
    fieldOids: ["hwIPSecPkiIkeFailedVrfName": "1.3.6.1.4.1.2011.5.25.224.1.19.23", "hwIPSecLocalIp": "1.3.6.1.4.1.2011.5.25.224.1.19.4", "hwIPSecRemoteIp": "1.3.6.1.4.1.2011.5.25.224.1.19.5", "hwIPSecPolicyName": "1.3.6.1.4.1.2011.5.25.224.1.19.1", "hwIPSecInterface": "1.3.6.1.4.1.2011.5.25.224.1.19.3", "hwIpsecIkeVersion": "1.3.6.1.4.1.2011.5.25.224.1.19.25"]
]

// --- hwIPSECSANegotiationFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.224.2.1.37
// Fields: hwIPSecPkiIkeFailedVrfName, hwIPSecLocalIp, hwIPSecRemoteIp, hwIPSecPolicyName, hwIPSecInterface, hwIPSecPolicySeq, hwIpsecIkeVersion
// Description: IPSEC SA negotiation failed.
trapMap["1.3.6.1.4.1.2011.5.25.224.2.1.37"] = [
    name: "hwIPSECSANegotiationFail",
    fields: ["hwIPSecPkiIkeFailedVrfName", "hwIPSecLocalIp", "hwIPSecRemoteIp", "hwIPSecPolicyName", "hwIPSecInterface", "hwIPSecPolicySeq", "hwIpsecIkeVersion"],
    fieldOids: ["hwIPSecPkiIkeFailedVrfName": "1.3.6.1.4.1.2011.5.25.224.1.19.23", "hwIPSecLocalIp": "1.3.6.1.4.1.2011.5.25.224.1.19.4", "hwIPSecRemoteIp": "1.3.6.1.4.1.2011.5.25.224.1.19.5", "hwIPSecPolicyName": "1.3.6.1.4.1.2011.5.25.224.1.19.1", "hwIPSecInterface": "1.3.6.1.4.1.2011.5.25.224.1.19.3", "hwIPSecPolicySeq": "1.3.6.1.4.1.2011.5.25.224.1.19.2", "hwIpsecIkeVersion": "1.3.6.1.4.1.2011.5.25.224.1.19.25"]
]

// --- hwIPSECSANegotiationSuccess (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.224.2.1.38
// Fields: hwIPSecPkiIkeFailedVrfName, hwIPSecLocalIp, hwIPSecRemoteIp, hwIPSecPolicyName, hwIPSecInterface, hwIPSecPolicySeq, hwIpsecIkeVersion
// Description: IPSEC SA negotiation success or configuration deleted.
trapMap["1.3.6.1.4.1.2011.5.25.224.2.1.38"] = [
    name: "hwIPSECSANegotiationSuccess",
    fields: ["hwIPSecPkiIkeFailedVrfName", "hwIPSecLocalIp", "hwIPSecRemoteIp", "hwIPSecPolicyName", "hwIPSecInterface", "hwIPSecPolicySeq", "hwIpsecIkeVersion"],
    fieldOids: ["hwIPSecPkiIkeFailedVrfName": "1.3.6.1.4.1.2011.5.25.224.1.19.23", "hwIPSecLocalIp": "1.3.6.1.4.1.2011.5.25.224.1.19.4", "hwIPSecRemoteIp": "1.3.6.1.4.1.2011.5.25.224.1.19.5", "hwIPSecPolicyName": "1.3.6.1.4.1.2011.5.25.224.1.19.1", "hwIPSecInterface": "1.3.6.1.4.1.2011.5.25.224.1.19.3", "hwIPSecPolicySeq": "1.3.6.1.4.1.2011.5.25.224.1.19.2", "hwIpsecIkeVersion": "1.3.6.1.4.1.2011.5.25.224.1.19.25"]
]

// --- hwIPSecPkiLocalCertAboutToExpire (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.224.2.1.39
// Fields: hwIPSecPkiCAName, hwIPSecPkiStartValidTime, hwIPSecPkiExpiredTime, hwIPSecPkiCAIssuer, hwIPSecPkiCASubject
// Description: The certificate is about to expire.
trapMap["1.3.6.1.4.1.2011.5.25.224.2.1.39"] = [
    name: "hwIPSecPkiLocalCertAboutToExpire",
    fields: ["hwIPSecPkiCAName", "hwIPSecPkiStartValidTime", "hwIPSecPkiExpiredTime", "hwIPSecPkiCAIssuer", "hwIPSecPkiCASubject"],
    fieldOids: ["hwIPSecPkiCAName": "1.3.6.1.4.1.2011.5.25.224.1.19.27", "hwIPSecPkiStartValidTime": "1.3.6.1.4.1.2011.5.25.224.1.19.16", "hwIPSecPkiExpiredTime": "1.3.6.1.4.1.2011.5.25.224.1.19.17", "hwIPSecPkiCAIssuer": "1.3.6.1.4.1.2011.5.25.224.1.19.13", "hwIPSecPkiCASubject": "1.3.6.1.4.1.2011.5.25.224.1.19.14"]
]

// --- hwIPSecPkiLocalCertAlrValid (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.224.2.1.40
// Fields: hwIPSecPkiCAName, hwIPSecPkiStartValidTime, hwIPSecPkiExpiredTime, hwIPSecPkiCAIssuer, hwIPSecPkiCASubject
// Description: The certificate has been deleted or renewed.
trapMap["1.3.6.1.4.1.2011.5.25.224.2.1.40"] = [
    name: "hwIPSecPkiLocalCertAlrValid",
    fields: ["hwIPSecPkiCAName", "hwIPSecPkiStartValidTime", "hwIPSecPkiExpiredTime", "hwIPSecPkiCAIssuer", "hwIPSecPkiCASubject"],
    fieldOids: ["hwIPSecPkiCAName": "1.3.6.1.4.1.2011.5.25.224.1.19.27", "hwIPSecPkiStartValidTime": "1.3.6.1.4.1.2011.5.25.224.1.19.16", "hwIPSecPkiExpiredTime": "1.3.6.1.4.1.2011.5.25.224.1.19.17", "hwIPSecPkiCAIssuer": "1.3.6.1.4.1.2011.5.25.224.1.19.13", "hwIPSecPkiCASubject": "1.3.6.1.4.1.2011.5.25.224.1.19.14"]
]

// --- hwIPSecPkiCALocalCertExpired (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.224.2.1.41
// Fields: hwIPSecPkiCAName, hwIPSecPkiStartValidTime, hwIPSecPkiExpiredTime, hwIPSecPkiCAIssuer, hwIPSecPkiCASubject
// Description: The certificate has expired
trapMap["1.3.6.1.4.1.2011.5.25.224.2.1.41"] = [
    name: "hwIPSecPkiCALocalCertExpired",
    fields: ["hwIPSecPkiCAName", "hwIPSecPkiStartValidTime", "hwIPSecPkiExpiredTime", "hwIPSecPkiCAIssuer", "hwIPSecPkiCASubject"],
    fieldOids: ["hwIPSecPkiCAName": "1.3.6.1.4.1.2011.5.25.224.1.19.27", "hwIPSecPkiStartValidTime": "1.3.6.1.4.1.2011.5.25.224.1.19.16", "hwIPSecPkiExpiredTime": "1.3.6.1.4.1.2011.5.25.224.1.19.17", "hwIPSecPkiCAIssuer": "1.3.6.1.4.1.2011.5.25.224.1.19.13", "hwIPSecPkiCASubject": "1.3.6.1.4.1.2011.5.25.224.1.19.14"]
]

// --- hwIPSecPkiCALocalCertValid (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.224.2.1.42
// Fields: hwIPSecPkiCAName, hwIPSecPkiStartValidTime, hwIPSecPkiExpiredTime, hwIPSecPkiCAIssuer, hwIPSecPkiCASubject
// Description: The certificate has been deleted or renewed.
trapMap["1.3.6.1.4.1.2011.5.25.224.2.1.42"] = [
    name: "hwIPSecPkiCALocalCertValid",
    fields: ["hwIPSecPkiCAName", "hwIPSecPkiStartValidTime", "hwIPSecPkiExpiredTime", "hwIPSecPkiCAIssuer", "hwIPSecPkiCASubject"],
    fieldOids: ["hwIPSecPkiCAName": "1.3.6.1.4.1.2011.5.25.224.1.19.27", "hwIPSecPkiStartValidTime": "1.3.6.1.4.1.2011.5.25.224.1.19.16", "hwIPSecPkiExpiredTime": "1.3.6.1.4.1.2011.5.25.224.1.19.17", "hwIPSecPkiCAIssuer": "1.3.6.1.4.1.2011.5.25.224.1.19.13", "hwIPSecPkiCASubject": "1.3.6.1.4.1.2011.5.25.224.1.19.14"]
]

// --- hwIPSecLicenseExhaustAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.224.2.1.43
// Fields: hwIPSecSvcType, hwIPSecPAFCapacity
// Description: The number of IKE services has reached the maximum of PAF's capacity defined by the license file.
trapMap["1.3.6.1.4.1.2011.5.25.224.2.1.43"] = [
    name: "hwIPSecLicenseExhaustAlarm",
    fields: ["hwIPSecSvcType", "hwIPSecPAFCapacity"],
    fieldOids: ["hwIPSecSvcType": "1.3.6.1.4.1.2011.5.25.224.1.19.29", "hwIPSecPAFCapacity": "1.3.6.1.4.1.2011.5.25.224.1.19.30"]
]

// --- hwIPSecLicenseExhaustAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.224.2.1.44
// Fields: hwIPSecSvcType, hwIPSecPAFCapacity
// Description: The IKE services PAF's capacity were sufficient.
trapMap["1.3.6.1.4.1.2011.5.25.224.2.1.44"] = [
    name: "hwIPSecLicenseExhaustAlarmResume",
    fields: ["hwIPSecSvcType", "hwIPSecPAFCapacity"],
    fieldOids: ["hwIPSecSvcType": "1.3.6.1.4.1.2011.5.25.224.1.19.29", "hwIPSecPAFCapacity": "1.3.6.1.4.1.2011.5.25.224.1.19.30"]
]

// --- hwIPSecPkiCmpDownloadCertSuc (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.224.2.1.45
// Fields: hwIPSecPkiGetCmpSessionName, hwIPSecPkiGetCmpRequireType
// Description: The CMP session download certificate successfully.
trapMap["1.3.6.1.4.1.2011.5.25.224.2.1.45"] = [
    name: "hwIPSecPkiCmpDownloadCertSuc",
    fields: ["hwIPSecPkiGetCmpSessionName", "hwIPSecPkiGetCmpRequireType"],
    fieldOids: ["hwIPSecPkiGetCmpSessionName": "1.3.6.1.4.1.2011.5.25.224.1.19.31", "hwIPSecPkiGetCmpRequireType": "1.3.6.1.4.1.2011.5.25.224.1.19.32"]
]

// --- hwIPSecPkiCmpDownloadCertFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.224.2.1.46
// Fields: hwIPSecPkiGetCmpSessionName, hwIPSecPkiGetCmpRequireType
// Description: The CMP session failed to download certificate.
trapMap["1.3.6.1.4.1.2011.5.25.224.2.1.46"] = [
    name: "hwIPSecPkiCmpDownloadCertFail",
    fields: ["hwIPSecPkiGetCmpSessionName", "hwIPSecPkiGetCmpRequireType"],
    fieldOids: ["hwIPSecPkiGetCmpSessionName": "1.3.6.1.4.1.2011.5.25.224.1.19.31", "hwIPSecPkiGetCmpRequireType": "1.3.6.1.4.1.2011.5.25.224.1.19.32"]
]

// --- hwIPSecPkiLocalCertClrFSuc (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.224.2.1.47
// Fields: hwIPSecPkiGetCertIssuer, hwIPSecPkiGetCertSubject
// Description: The local certificate validate successfully.
trapMap["1.3.6.1.4.1.2011.5.25.224.2.1.47"] = [
    name: "hwIPSecPkiLocalCertClrFSuc",
    fields: ["hwIPSecPkiGetCertIssuer", "hwIPSecPkiGetCertSubject"],
    fieldOids: ["hwIPSecPkiGetCertIssuer": "1.3.6.1.4.1.2011.5.25.224.1.19.33", "hwIPSecPkiGetCertSubject": "1.3.6.1.4.1.2011.5.25.224.1.19.34"]
]

// --- hwIPSecPkiLocalCertClrFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.224.2.1.48
// Fields: hwIPSecPkiGetCertIssuer, hwIPSecPkiGetCertSubject
// Description: The local certificate was validated failed.
trapMap["1.3.6.1.4.1.2011.5.25.224.2.1.48"] = [
    name: "hwIPSecPkiLocalCertClrFail",
    fields: ["hwIPSecPkiGetCertIssuer", "hwIPSecPkiGetCertSubject"],
    fieldOids: ["hwIPSecPkiGetCertIssuer": "1.3.6.1.4.1.2011.5.25.224.1.19.33", "hwIPSecPkiGetCertSubject": "1.3.6.1.4.1.2011.5.25.224.1.19.34"]
]

// --- hwIPSecPkiCertExpiredCritical (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.224.2.1.49
// Fields: hwIPSecPkiStartValidTime, hwIPSecPkiExpiredTime, hwIPSecPkiCAIssuer, hwIPSecPkiCASubject, hwIPSecPkiGetCertFileName
// Description: IPsec pki certificate will be expired.
trapMap["1.3.6.1.4.1.2011.5.25.224.2.1.49"] = [
    name: "hwIPSecPkiCertExpiredCritical",
    fields: ["hwIPSecPkiStartValidTime", "hwIPSecPkiExpiredTime", "hwIPSecPkiCAIssuer", "hwIPSecPkiCASubject", "hwIPSecPkiGetCertFileName"],
    fieldOids: ["hwIPSecPkiStartValidTime": "1.3.6.1.4.1.2011.5.25.224.1.19.16", "hwIPSecPkiExpiredTime": "1.3.6.1.4.1.2011.5.25.224.1.19.17", "hwIPSecPkiCAIssuer": "1.3.6.1.4.1.2011.5.25.224.1.19.13", "hwIPSecPkiCASubject": "1.3.6.1.4.1.2011.5.25.224.1.19.14", "hwIPSecPkiGetCertFileName": "1.3.6.1.4.1.2011.5.25.224.1.19.35"]
]

// --- hwIPSecPkiCertUnexpiredCritical (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.224.2.1.50
// Fields: hwIPSecPkiStartValidTime, hwIPSecPkiExpiredTime, hwIPSecPkiCAIssuer, hwIPSecPkiCASubject, hwIPSecPkiGetCertFileName
// Description: IPsec pki certificate has been updated.
trapMap["1.3.6.1.4.1.2011.5.25.224.2.1.50"] = [
    name: "hwIPSecPkiCertUnexpiredCritical",
    fields: ["hwIPSecPkiStartValidTime", "hwIPSecPkiExpiredTime", "hwIPSecPkiCAIssuer", "hwIPSecPkiCASubject", "hwIPSecPkiGetCertFileName"],
    fieldOids: ["hwIPSecPkiStartValidTime": "1.3.6.1.4.1.2011.5.25.224.1.19.16", "hwIPSecPkiExpiredTime": "1.3.6.1.4.1.2011.5.25.224.1.19.17", "hwIPSecPkiCAIssuer": "1.3.6.1.4.1.2011.5.25.224.1.19.13", "hwIPSecPkiCASubject": "1.3.6.1.4.1.2011.5.25.224.1.19.14", "hwIPSecPkiGetCertFileName": "1.3.6.1.4.1.2011.5.25.224.1.19.35"]
]

// --- hwIPSecNegotiationConflict (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.224.2.1.51
// Fields: hwIPSecNewTunnelPeerAddress, hwIPSecNewTunnelPeerPort, hwIPSecNewTunnelVrfName, hwIPSecNewAclSourceAddress, hwIPSecNewAclDestinationAddress, hwIPSecNewACLVrfName, hwIPSecExistTunnelPeerAddress, hwIPSecExistTunnelPeerPort, hwIPSecExistTunnelVrfName, hwIPSecExistAclSourceAddress, hwIPSecExistAclDestinationAddress, hwIPSecExistACLVrfName
// Description: IPsec negotiation failed because the ACL range already exists.
trapMap["1.3.6.1.4.1.2011.5.25.224.2.1.51"] = [
    name: "hwIPSecNegotiationConflict",
    fields: ["hwIPSecNewTunnelPeerAddress", "hwIPSecNewTunnelPeerPort", "hwIPSecNewTunnelVrfName", "hwIPSecNewAclSourceAddress", "hwIPSecNewAclDestinationAddress", "hwIPSecNewACLVrfName", "hwIPSecExistTunnelPeerAddress", "hwIPSecExistTunnelPeerPort", "hwIPSecExistTunnelVrfName", "hwIPSecExistAclSourceAddress", "hwIPSecExistAclDestinationAddress", "hwIPSecExistACLVrfName"],
    fieldOids: ["hwIPSecNewTunnelPeerAddress": "1.3.6.1.4.1.2011.5.25.224.1.19.37", "hwIPSecNewTunnelPeerPort": "1.3.6.1.4.1.2011.5.25.224.1.19.38", "hwIPSecNewTunnelVrfName": "1.3.6.1.4.1.2011.5.25.224.1.19.39", "hwIPSecNewAclSourceAddress": "1.3.6.1.4.1.2011.5.25.224.1.19.40", "hwIPSecNewAclDestinationAddress": "1.3.6.1.4.1.2011.5.25.224.1.19.41", "hwIPSecNewACLVrfName": "1.3.6.1.4.1.2011.5.25.224.1.19.42", "hwIPSecExistTunnelPeerAddress": "1.3.6.1.4.1.2011.5.25.224.1.19.43", "hwIPSecExistTunnelPeerPort": "1.3.6.1.4.1.2011.5.25.224.1.19.44", "hwIPSecExistTunnelVrfName": "1.3.6.1.4.1.2011.5.25.224.1.19.45", "hwIPSecExistAclSourceAddress": "1.3.6.1.4.1.2011.5.25.224.1.19.46", "hwIPSecExistAclDestinationAddress": "1.3.6.1.4.1.2011.5.25.224.1.19.47", "hwIPSecExistACLVrfName": "1.3.6.1.4.1.2011.5.25.224.1.19.48"]
]

// --- hwIPsecServiceFaultAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.224.2.1.52
// Fields: hwIPsecServiceFaultCode, hwIPsecServiceFaultKey, hwIPsecReasonDescription, hwIPsecAlarmBoardName, hwIPsecAlarmCpu
// Description: The object indicates the alarm generated when a IPsec service fails.
trapMap["1.3.6.1.4.1.2011.5.25.224.2.1.52"] = [
    name: "hwIPsecServiceFaultAlarm",
    fields: ["hwIPsecServiceFaultCode", "hwIPsecServiceFaultKey", "hwIPsecReasonDescription", "hwIPsecAlarmBoardName", "hwIPsecAlarmCpu"],
    fieldOids: ["hwIPsecServiceFaultCode": "1.3.6.1.4.1.2011.5.25.224.1.1.16", "hwIPsecServiceFaultKey": "1.3.6.1.4.1.2011.5.25.224.1.1.17", "hwIPsecReasonDescription": "1.3.6.1.4.1.2011.5.25.224.1.1.18", "hwIPsecAlarmBoardName": "1.3.6.1.4.1.2011.5.25.224.1.1.19", "hwIPsecAlarmCpu": "1.3.6.1.4.1.2011.5.25.224.1.1.20"]
]

// --- hwIPsecServiceFaultResumeAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.224.2.1.53
// Fields: hwIPsecServiceFaultCode, hwIPsecServiceFaultKey, hwIPsecReasonDescription, hwIPsecAlarmBoardName, hwIPsecAlarmCpu
// Description: The object indicates the clear alarm generated when a IPsec service becomes available again.
trapMap["1.3.6.1.4.1.2011.5.25.224.2.1.53"] = [
    name: "hwIPsecServiceFaultResumeAlarm",
    fields: ["hwIPsecServiceFaultCode", "hwIPsecServiceFaultKey", "hwIPsecReasonDescription", "hwIPsecAlarmBoardName", "hwIPsecAlarmCpu"],
    fieldOids: ["hwIPsecServiceFaultCode": "1.3.6.1.4.1.2011.5.25.224.1.1.16", "hwIPsecServiceFaultKey": "1.3.6.1.4.1.2011.5.25.224.1.1.17", "hwIPsecReasonDescription": "1.3.6.1.4.1.2011.5.25.224.1.1.18", "hwIPsecAlarmBoardName": "1.3.6.1.4.1.2011.5.25.224.1.1.19", "hwIPsecAlarmCpu": "1.3.6.1.4.1.2011.5.25.224.1.1.20"]
]

// --- hwxSECServiceFaultAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.224.2.1.54
// Fields: hwxSECServiceFaultCode, hwxSECReasonDescription, hwxSECAlarmBoardName, hwxSECAlarmCpu
// Description: The object indicates the alarm generated when a xSEC service fails.
trapMap["1.3.6.1.4.1.2011.5.25.224.2.1.54"] = [
    name: "hwxSECServiceFaultAlarm",
    fields: ["hwxSECServiceFaultCode", "hwxSECReasonDescription", "hwxSECAlarmBoardName", "hwxSECAlarmCpu"],
    fieldOids: ["hwxSECServiceFaultCode": "1.3.6.1.4.1.2011.5.25.224.1.1.21", "hwxSECReasonDescription": "1.3.6.1.4.1.2011.5.25.224.1.1.22", "hwxSECAlarmBoardName": "1.3.6.1.4.1.2011.5.25.224.1.1.23", "hwxSECAlarmCpu": "1.3.6.1.4.1.2011.5.25.224.1.1.24"]
]

// --- hwxSECServiceFaultResumeAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.224.2.1.55
// Fields: hwxSECServiceFaultCode, hwxSECReasonDescription, hwxSECAlarmBoardName, hwxSECAlarmCpu
// Description: The object indicates the clear alarm generated when a xSEC service becomes available again.
trapMap["1.3.6.1.4.1.2011.5.25.224.2.1.55"] = [
    name: "hwxSECServiceFaultResumeAlarm",
    fields: ["hwxSECServiceFaultCode", "hwxSECReasonDescription", "hwxSECAlarmBoardName", "hwxSECAlarmCpu"],
    fieldOids: ["hwxSECServiceFaultCode": "1.3.6.1.4.1.2011.5.25.224.1.1.21", "hwxSECReasonDescription": "1.3.6.1.4.1.2011.5.25.224.1.1.22", "hwxSECAlarmBoardName": "1.3.6.1.4.1.2011.5.25.224.1.1.23", "hwxSECAlarmCpu": "1.3.6.1.4.1.2011.5.25.224.1.1.24"]
]

// --- hwIPSecHotStandbyConfigurationInconsistent (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.224.2.1.56
// Fields: hwIPSecHotStandbyConfigInstance, hwIPSecHotStandbyConfigPolicy, hwIPSecHotStandbyConfigErrorCode, hwIPSecHotStandbyConfigErrorDescription
// Description: The IPsec configurations of the master and backup devices are inconsistent.
trapMap["1.3.6.1.4.1.2011.5.25.224.2.1.56"] = [
    name: "hwIPSecHotStandbyConfigurationInconsistent",
    fields: ["hwIPSecHotStandbyConfigInstance", "hwIPSecHotStandbyConfigPolicy", "hwIPSecHotStandbyConfigErrorCode", "hwIPSecHotStandbyConfigErrorDescription"],
    fieldOids: ["hwIPSecHotStandbyConfigInstance": "1.3.6.1.4.1.2011.5.25.224.1.1.25", "hwIPSecHotStandbyConfigPolicy": "1.3.6.1.4.1.2011.5.25.224.1.1.26", "hwIPSecHotStandbyConfigErrorCode": "1.3.6.1.4.1.2011.5.25.224.1.1.27", "hwIPSecHotStandbyConfigErrorDescription": "1.3.6.1.4.1.2011.5.25.224.1.1.28"]
]

// --- hwIPSecNegotiationFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.224.2.1.57
// Fields: hwIPSecNegoFailReason, hwIPSecRemoteIp, hwIPSecPkiIkeFailedVrfName, hwIPSecInterface, hwIpsecIkeVersion
// Description: IPSec SA negotiation failed.
trapMap["1.3.6.1.4.1.2011.5.25.224.2.1.57"] = [
    name: "hwIPSecNegotiationFail",
    fields: ["hwIPSecNegoFailReason", "hwIPSecRemoteIp", "hwIPSecPkiIkeFailedVrfName", "hwIPSecInterface", "hwIpsecIkeVersion"],
    fieldOids: ["hwIPSecNegoFailReason": "1.3.6.1.4.1.2011.5.25.224.1.19.49", "hwIPSecRemoteIp": "1.3.6.1.4.1.2011.5.25.224.1.19.5", "hwIPSecPkiIkeFailedVrfName": "1.3.6.1.4.1.2011.5.25.224.1.19.23", "hwIPSecInterface": "1.3.6.1.4.1.2011.5.25.224.1.19.3", "hwIpsecIkeVersion": "1.3.6.1.4.1.2011.5.25.224.1.19.25"]
]

// --- hwIPSecNegotiationSuccess (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.224.2.1.58
// Fields: hwIPSecNegoFailReason, hwIPSecRemoteIp, hwIPSecPkiIkeFailedVrfName, hwIPSecInterface, hwIpsecIkeVersion
// Description: IPSec SA negotiation success or configuration deleted.
trapMap["1.3.6.1.4.1.2011.5.25.224.2.1.58"] = [
    name: "hwIPSecNegotiationSuccess",
    fields: ["hwIPSecNegoFailReason", "hwIPSecRemoteIp", "hwIPSecPkiIkeFailedVrfName", "hwIPSecInterface", "hwIpsecIkeVersion"],
    fieldOids: ["hwIPSecNegoFailReason": "1.3.6.1.4.1.2011.5.25.224.1.19.49", "hwIPSecRemoteIp": "1.3.6.1.4.1.2011.5.25.224.1.19.5", "hwIPSecPkiIkeFailedVrfName": "1.3.6.1.4.1.2011.5.25.224.1.19.23", "hwIPSecInterface": "1.3.6.1.4.1.2011.5.25.224.1.19.3", "hwIpsecIkeVersion": "1.3.6.1.4.1.2011.5.25.224.1.19.25"]
]

// --- hwIPSecPkiCertChainInValid (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.224.2.1.59
// Fields: hwPkiCertChainInValidReason, hwIPSecPkiGetCertIssuer, hwIPSecPkiGetCertSubject, hwIPSecPkiGetCertFileName, hwPkiCertDomainName
// Description: The local certificate Chain is invalid.
trapMap["1.3.6.1.4.1.2011.5.25.224.2.1.59"] = [
    name: "hwIPSecPkiCertChainInValid",
    fields: ["hwPkiCertChainInValidReason", "hwIPSecPkiGetCertIssuer", "hwIPSecPkiGetCertSubject", "hwIPSecPkiGetCertFileName", "hwPkiCertDomainName"],
    fieldOids: ["hwPkiCertChainInValidReason": "1.3.6.1.4.1.2011.5.25.224.1.19.50", "hwIPSecPkiGetCertIssuer": "1.3.6.1.4.1.2011.5.25.224.1.19.33", "hwIPSecPkiGetCertSubject": "1.3.6.1.4.1.2011.5.25.224.1.19.34", "hwIPSecPkiGetCertFileName": "1.3.6.1.4.1.2011.5.25.224.1.19.35", "hwPkiCertDomainName": "1.3.6.1.4.1.2011.5.25.224.1.19.51"]
]

// --- hwIPSecPkiCertChainValid (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.224.2.1.60
// Fields: hwPkiCertChainInValidReason, hwIPSecPkiGetCertIssuer, hwIPSecPkiGetCertSubject, hwIPSecPkiGetCertFileName, hwPkiCertDomainName
// Description: The local certificate Chain is valid.
trapMap["1.3.6.1.4.1.2011.5.25.224.2.1.60"] = [
    name: "hwIPSecPkiCertChainValid",
    fields: ["hwPkiCertChainInValidReason", "hwIPSecPkiGetCertIssuer", "hwIPSecPkiGetCertSubject", "hwIPSecPkiGetCertFileName", "hwPkiCertDomainName"],
    fieldOids: ["hwPkiCertChainInValidReason": "1.3.6.1.4.1.2011.5.25.224.1.19.50", "hwIPSecPkiGetCertIssuer": "1.3.6.1.4.1.2011.5.25.224.1.19.33", "hwIPSecPkiGetCertSubject": "1.3.6.1.4.1.2011.5.25.224.1.19.34", "hwIPSecPkiGetCertFileName": "1.3.6.1.4.1.2011.5.25.224.1.19.35", "hwPkiCertDomainName": "1.3.6.1.4.1.2011.5.25.224.1.19.51"]
]

// --- hwXsecPafExhaustAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.224.2.1.61
// Fields: hwXsecSvcType, hwXsecPAFCapacity
// Description: The number of Xsec services has reached the maximum of PAF's capacity.
trapMap["1.3.6.1.4.1.2011.5.25.224.2.1.61"] = [
    name: "hwXsecPafExhaustAlarm",
    fields: ["hwXsecSvcType", "hwXsecPAFCapacity"],
    fieldOids: ["hwXsecSvcType": "1.3.6.1.4.1.2011.5.25.224.1.19.52", "hwXsecPAFCapacity": "1.3.6.1.4.1.2011.5.25.224.1.19.53"]
]

// --- hwXsecPafExhaustAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.224.2.1.62
// Fields: hwXsecSvcType, hwXsecPAFCapacity
// Description: The Xsec services PAF's capacity were sufficient.
trapMap["1.3.6.1.4.1.2011.5.25.224.2.1.62"] = [
    name: "hwXsecPafExhaustAlarmResume",
    fields: ["hwXsecSvcType", "hwXsecPAFCapacity"],
    fieldOids: ["hwXsecSvcType": "1.3.6.1.4.1.2011.5.25.224.1.19.52", "hwXsecPAFCapacity": "1.3.6.1.4.1.2011.5.25.224.1.19.53"]
]

// --- hwIPSecMhOutOfResourcesAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.224.2.1.63
// Fields: hwIPSecMhUserTotal, hwIPSecMhTriggerSuccess, hwIPSecMhTriggerFail, hwIPSecMhReason
// Description: The IPsec mobile-home policy trigger negotiation out of resources.
trapMap["1.3.6.1.4.1.2011.5.25.224.2.1.63"] = [
    name: "hwIPSecMhOutOfResourcesAlarm",
    fields: ["hwIPSecMhUserTotal", "hwIPSecMhTriggerSuccess", "hwIPSecMhTriggerFail", "hwIPSecMhReason"],
    fieldOids: ["hwIPSecMhUserTotal": "1.3.6.1.4.1.2011.5.25.224.1.19.54", "hwIPSecMhTriggerSuccess": "1.3.6.1.4.1.2011.5.25.224.1.19.55", "hwIPSecMhTriggerFail": "1.3.6.1.4.1.2011.5.25.224.1.19.56", "hwIPSecMhReason": "1.3.6.1.4.1.2011.5.25.224.1.19.57"]
]

// --- hwIPSecMhOutOfResourcesAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.224.2.1.64
// Fields: hwIPSecMhUserTotal, hwIPSecMhTriggerSuccess, hwIPSecMhTriggerFail, hwIPSecMhReason
// Description: The IPsec mobile-home policy triggers negotiation within resources.
trapMap["1.3.6.1.4.1.2011.5.25.224.2.1.64"] = [
    name: "hwIPSecMhOutOfResourcesAlarmResume",
    fields: ["hwIPSecMhUserTotal", "hwIPSecMhTriggerSuccess", "hwIPSecMhTriggerFail", "hwIPSecMhReason"],
    fieldOids: ["hwIPSecMhUserTotal": "1.3.6.1.4.1.2011.5.25.224.1.19.54", "hwIPSecMhTriggerSuccess": "1.3.6.1.4.1.2011.5.25.224.1.19.55", "hwIPSecMhTriggerFail": "1.3.6.1.4.1.2011.5.25.224.1.19.56", "hwIPSecMhReason": "1.3.6.1.4.1.2011.5.25.224.1.19.57"]
]

// --- hwIPSecMhLocalPoolThresholdAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.224.2.1.65
// Fields: hwIPSecMhVpnName, hwIPSecMhIPTotal, hwIPSecMhIPUsed
// Description: The IPsec mobile-home local address pool usage reaches the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.224.2.1.65"] = [
    name: "hwIPSecMhLocalPoolThresholdAlarm",
    fields: ["hwIPSecMhVpnName", "hwIPSecMhIPTotal", "hwIPSecMhIPUsed"],
    fieldOids: ["hwIPSecMhVpnName": "1.3.6.1.4.1.2011.5.25.224.1.19.58", "hwIPSecMhIPTotal": "1.3.6.1.4.1.2011.5.25.224.1.19.59", "hwIPSecMhIPUsed": "1.3.6.1.4.1.2011.5.25.224.1.19.60"]
]

// --- hwIPSecMhLocalPoolThresholdAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.224.2.1.66
// Fields: hwIPSecMhVpnName, hwIPSecMhIPTotal, hwIPSecMhIPUsed
// Description: The IPsec mobile-home local address pool usage blow the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.224.2.1.66"] = [
    name: "hwIPSecMhLocalPoolThresholdAlarmResume",
    fields: ["hwIPSecMhVpnName", "hwIPSecMhIPTotal", "hwIPSecMhIPUsed"],
    fieldOids: ["hwIPSecMhVpnName": "1.3.6.1.4.1.2011.5.25.224.1.19.58", "hwIPSecMhIPTotal": "1.3.6.1.4.1.2011.5.25.224.1.19.59", "hwIPSecMhIPUsed": "1.3.6.1.4.1.2011.5.25.224.1.19.60"]
]

// --- hwXsecNegoFailAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.224.2.1.67
// Fields: hwXsecNegoFailReason, hwXsecRemoteRouterId, hwXsecRemoteConnectionId, hwXsecPolicyName, hwXsecNegoFailReasonCode
// Description: Xsec SA negotiation failed.
trapMap["1.3.6.1.4.1.2011.5.25.224.2.1.67"] = [
    name: "hwXsecNegoFailAlarm",
    fields: ["hwXsecNegoFailReason", "hwXsecRemoteRouterId", "hwXsecRemoteConnectionId", "hwXsecPolicyName", "hwXsecNegoFailReasonCode"],
    fieldOids: ["hwXsecNegoFailReason": "1.3.6.1.4.1.2011.5.25.224.1.19.61", "hwXsecRemoteRouterId": "1.3.6.1.4.1.2011.5.25.224.1.19.62", "hwXsecRemoteConnectionId": "1.3.6.1.4.1.2011.5.25.224.1.19.63", "hwXsecPolicyName": "1.3.6.1.4.1.2011.5.25.224.1.19.64", "hwXsecNegoFailReasonCode": "1.3.6.1.4.1.2011.5.25.224.1.19.65"]
]

// --- hwXsecNegoFailAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.224.2.1.68
// Fields: hwXsecNegoFailReason, hwXsecRemoteRouterId, hwXsecRemoteConnectionId, hwXsecPolicyName, hwXsecNegoFailReasonCode
// Description: Xsec SA negotiation success or configuration deleted.
trapMap["1.3.6.1.4.1.2011.5.25.224.2.1.68"] = [
    name: "hwXsecNegoFailAlarmResume",
    fields: ["hwXsecNegoFailReason", "hwXsecRemoteRouterId", "hwXsecRemoteConnectionId", "hwXsecPolicyName", "hwXsecNegoFailReasonCode"],
    fieldOids: ["hwXsecNegoFailReason": "1.3.6.1.4.1.2011.5.25.224.1.19.61", "hwXsecRemoteRouterId": "1.3.6.1.4.1.2011.5.25.224.1.19.62", "hwXsecRemoteConnectionId": "1.3.6.1.4.1.2011.5.25.224.1.19.63", "hwXsecPolicyName": "1.3.6.1.4.1.2011.5.25.224.1.19.64", "hwXsecNegoFailReasonCode": "1.3.6.1.4.1.2011.5.25.224.1.19.65"]
]

// --- hwXsecPlainSwitchAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.224.2.1.69
// Fields: hwXsecSlotID, hwXsecEngineID, hwXsecPlainSwitchReasonDetail, hwXsecPlainSwitchReasonID
// Description: Xsec plain switch alarm occurred.
trapMap["1.3.6.1.4.1.2011.5.25.224.2.1.69"] = [
    name: "hwXsecPlainSwitchAlarm",
    fields: ["hwXsecSlotID", "hwXsecEngineID", "hwXsecPlainSwitchReasonDetail", "hwXsecPlainSwitchReasonID"],
    fieldOids: ["hwXsecSlotID": "1.3.6.1.4.1.2011.5.25.224.1.19.66", "hwXsecEngineID": "1.3.6.1.4.1.2011.5.25.224.1.19.67", "hwXsecPlainSwitchReasonDetail": "1.3.6.1.4.1.2011.5.25.224.1.19.68", "hwXsecPlainSwitchReasonID": "1.3.6.1.4.1.2011.5.25.224.1.19.69"]
]

// --- hwXsecPlainSwitchAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.224.2.1.70
// Fields: hwXsecSlotID, hwXsecEngineID, hwXsecPlainSwitchReasonDetail, hwXsecPlainSwitchReasonID
// Description: Xsec plain switch alarm resume.
trapMap["1.3.6.1.4.1.2011.5.25.224.2.1.70"] = [
    name: "hwXsecPlainSwitchAlarmResume",
    fields: ["hwXsecSlotID", "hwXsecEngineID", "hwXsecPlainSwitchReasonDetail", "hwXsecPlainSwitchReasonID"],
    fieldOids: ["hwXsecSlotID": "1.3.6.1.4.1.2011.5.25.224.1.19.66", "hwXsecEngineID": "1.3.6.1.4.1.2011.5.25.224.1.19.67", "hwXsecPlainSwitchReasonDetail": "1.3.6.1.4.1.2011.5.25.224.1.19.68", "hwXsecPlainSwitchReasonID": "1.3.6.1.4.1.2011.5.25.224.1.19.69"]
]

// --- hwIPsecSaCountThresholdAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.224.2.1.71
// Fields: hwIPSecSaSlotID, hwIPSecSessionNumber
// Description: The number of IPSec SAs exceeds the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.224.2.1.71"] = [
    name: "hwIPsecSaCountThresholdAlarm",
    fields: ["hwIPSecSaSlotID", "hwIPSecSessionNumber"],
    fieldOids: ["hwIPSecSaSlotID": "1.3.6.1.4.1.2011.5.25.224.1.19.70", "hwIPSecSessionNumber": "1.3.6.1.4.1.2011.5.25.224.1.19.71"]
]

// --- hwIPsecSaCountThresholdAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.224.2.1.72
// Fields: hwIPSecSaSlotID, hwIPSecSessionNumber
// Description: The number of IPSec SAs is lower than the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.224.2.1.72"] = [
    name: "hwIPsecSaCountThresholdAlarmResume",
    fields: ["hwIPSecSaSlotID", "hwIPSecSessionNumber"],
    fieldOids: ["hwIPSecSaSlotID": "1.3.6.1.4.1.2011.5.25.224.1.19.70", "hwIPSecSessionNumber": "1.3.6.1.4.1.2011.5.25.224.1.19.71"]
]

// --- hwIPsecSaCountExhaustAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.224.2.1.73
// Fields: hwIPSecSaSlotID, hwIPSecSessionNumber
// Description: The number of IPSec SAs reaches the maximum value.
trapMap["1.3.6.1.4.1.2011.5.25.224.2.1.73"] = [
    name: "hwIPsecSaCountExhaustAlarm",
    fields: ["hwIPSecSaSlotID", "hwIPSecSessionNumber"],
    fieldOids: ["hwIPSecSaSlotID": "1.3.6.1.4.1.2011.5.25.224.1.19.70", "hwIPSecSessionNumber": "1.3.6.1.4.1.2011.5.25.224.1.19.71"]
]

// --- hwIPsecSaCountExhaustAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.224.2.1.74
// Fields: hwIPSecSaSlotID, hwIPSecSessionNumber
// Description: The number of IPSec SAs is lower than the maximum value.
trapMap["1.3.6.1.4.1.2011.5.25.224.2.1.74"] = [
    name: "hwIPsecSaCountExhaustAlarmResume",
    fields: ["hwIPSecSaSlotID", "hwIPSecSessionNumber"],
    fieldOids: ["hwIPSecSaSlotID": "1.3.6.1.4.1.2011.5.25.224.1.19.70", "hwIPSecSessionNumber": "1.3.6.1.4.1.2011.5.25.224.1.19.71"]
]

// --- hwIPsecSessionThresholdAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.224.5.1
// Fields: hwIPSecTrapSlotID, hwIPSecTrapCpuID, hwIPSecSaNumber
// Description: This object indicates that an alarm is generated when the number of IPsec SA session resources exceeds 80% of the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.224.5.1"] = [
    name: "hwIPsecSessionThresholdAlarm",
    fields: ["hwIPSecTrapSlotID", "hwIPSecTrapCpuID", "hwIPSecSaNumber"],
    fieldOids: ["hwIPSecTrapSlotID": "1.3.6.1.4.1.2011.5.25.224.1.22.1", "hwIPSecTrapCpuID": "1.3.6.1.4.1.2011.5.25.224.1.22.2", "hwIPSecSaNumber": "1.3.6.1.4.1.2011.5.25.224.1.22.3"]
]

// --- hwIPsecSessionThresholdAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.224.5.2
// Fields: hwIPSecTrapSlotID, hwIPSecTrapCpuID, hwIPSecSaNumber
// Description: This object indicates that the alarm is cleared when the number of IPsec SA session resources falls below 80% of the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.224.5.2"] = [
    name: "hwIPsecSessionThresholdAlarmResume",
    fields: ["hwIPSecTrapSlotID", "hwIPSecTrapCpuID", "hwIPSecSaNumber"],
    fieldOids: ["hwIPSecTrapSlotID": "1.3.6.1.4.1.2011.5.25.224.1.22.1", "hwIPSecTrapCpuID": "1.3.6.1.4.1.2011.5.25.224.1.22.2", "hwIPSecSaNumber": "1.3.6.1.4.1.2011.5.25.224.1.22.3"]
]

// --- hwIPsecSessionExhaustAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.224.5.3
// Fields: hwIPSecTrapSlotID, hwIPSecTrapCpuID, hwIPSecSaNumber
// Description: This object indicates that an alarm is generated when IPsec SA session resources are used up.
trapMap["1.3.6.1.4.1.2011.5.25.224.5.3"] = [
    name: "hwIPsecSessionExhaustAlarm",
    fields: ["hwIPSecTrapSlotID", "hwIPSecTrapCpuID", "hwIPSecSaNumber"],
    fieldOids: ["hwIPSecTrapSlotID": "1.3.6.1.4.1.2011.5.25.224.1.22.1", "hwIPSecTrapCpuID": "1.3.6.1.4.1.2011.5.25.224.1.22.2", "hwIPSecSaNumber": "1.3.6.1.4.1.2011.5.25.224.1.22.3"]
]

// --- hwIPsecSessionExhaustAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.224.5.4
// Fields: hwIPSecTrapSlotID, hwIPSecTrapCpuID, hwIPSecSaNumber
// Description: This object indicates that the alarm generated when IPsec SA session resources are used up is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.224.5.4"] = [
    name: "hwIPsecSessionExhaustAlarmResume",
    fields: ["hwIPSecTrapSlotID", "hwIPSecTrapCpuID", "hwIPSecSaNumber"],
    fieldOids: ["hwIPSecTrapSlotID": "1.3.6.1.4.1.2011.5.25.224.1.22.1", "hwIPSecTrapCpuID": "1.3.6.1.4.1.2011.5.25.224.1.22.2", "hwIPSecSaNumber": "1.3.6.1.4.1.2011.5.25.224.1.22.3"]
]

// --- hwIPSECVSUBBandwidthAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.224.5.5
// Fields: hwIPSecVSUAlarmThreshold, hwIPSecVSUAlarmbpsRateInUse, hwIPSecVSUAlarmMbpsRate, hwIPSecLicenseBandwidth, hwIPSecVSUSlotStr
// Description: The IPSec bandwidth usage of the slot exceeds the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.224.5.5"] = [
    name: "hwIPSECVSUBBandwidthAlarm",
    fields: ["hwIPSecVSUAlarmThreshold", "hwIPSecVSUAlarmbpsRateInUse", "hwIPSecVSUAlarmMbpsRate", "hwIPSecLicenseBandwidth", "hwIPSecVSUSlotStr"],
    fieldOids: ["hwIPSecVSUAlarmThreshold": "1.3.6.1.4.1.2011.5.25.224.1.22.4", "hwIPSecVSUAlarmbpsRateInUse": "1.3.6.1.4.1.2011.5.25.224.1.22.5", "hwIPSecVSUAlarmMbpsRate": "1.3.6.1.4.1.2011.5.25.224.1.22.6", "hwIPSecLicenseBandwidth": "1.3.6.1.4.1.2011.5.25.224.1.22.7", "hwIPSecVSUSlotStr": "1.3.6.1.4.1.2011.5.25.224.1.22.8"]
]

// --- hwIPSECVSUBBandwidthResumeAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.224.5.6
// Fields: hwIPSecVSUAlarmThreshold, hwIPSecVSUAlarmbpsRateInUse, hwIPSecVSUAlarmMbpsRate, hwIPSecLicenseBandwidth, hwIPSecVSUSlotStr
// Description: The IPSec bandwidth usage of the slot fell below the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.224.5.6"] = [
    name: "hwIPSECVSUBBandwidthResumeAlarm",
    fields: ["hwIPSecVSUAlarmThreshold", "hwIPSecVSUAlarmbpsRateInUse", "hwIPSecVSUAlarmMbpsRate", "hwIPSecLicenseBandwidth", "hwIPSecVSUSlotStr"],
    fieldOids: ["hwIPSecVSUAlarmThreshold": "1.3.6.1.4.1.2011.5.25.224.1.22.4", "hwIPSecVSUAlarmbpsRateInUse": "1.3.6.1.4.1.2011.5.25.224.1.22.5", "hwIPSecVSUAlarmMbpsRate": "1.3.6.1.4.1.2011.5.25.224.1.22.6", "hwIPSecLicenseBandwidth": "1.3.6.1.4.1.2011.5.25.224.1.22.7", "hwIPSecVSUSlotStr": "1.3.6.1.4.1.2011.5.25.224.1.22.8"]
]

// --- hwIPSECVSUBBandwidthExhaustAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.224.5.7
// Fields: hwIPSecVSUAlarmbpsRateInUse, hwIPSecVSUAlarmMbpsRate, hwIPSecLicenseBandwidth, hwIPSecVSUSlotStr
// Description: The IPSec bandwidth of the slot was exhausted.
trapMap["1.3.6.1.4.1.2011.5.25.224.5.7"] = [
    name: "hwIPSECVSUBBandwidthExhaustAlarm",
    fields: ["hwIPSecVSUAlarmbpsRateInUse", "hwIPSecVSUAlarmMbpsRate", "hwIPSecLicenseBandwidth", "hwIPSecVSUSlotStr"],
    fieldOids: ["hwIPSecVSUAlarmbpsRateInUse": "1.3.6.1.4.1.2011.5.25.224.1.22.5", "hwIPSecVSUAlarmMbpsRate": "1.3.6.1.4.1.2011.5.25.224.1.22.6", "hwIPSecLicenseBandwidth": "1.3.6.1.4.1.2011.5.25.224.1.22.7", "hwIPSecVSUSlotStr": "1.3.6.1.4.1.2011.5.25.224.1.22.8"]
]

// --- hwIPSECVSUBBandwidthExhaustResumeAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.224.5.8
// Fields: hwIPSecVSUAlarmbpsRateInUse, hwIPSecVSUAlarmMbpsRate, hwIPSecLicenseBandwidth, hwIPSecVSUSlotStr
// Description: The slot IPSec bandwidth resources became available again.
trapMap["1.3.6.1.4.1.2011.5.25.224.5.8"] = [
    name: "hwIPSECVSUBBandwidthExhaustResumeAlarm",
    fields: ["hwIPSecVSUAlarmbpsRateInUse", "hwIPSecVSUAlarmMbpsRate", "hwIPSecLicenseBandwidth", "hwIPSecVSUSlotStr"],
    fieldOids: ["hwIPSecVSUAlarmbpsRateInUse": "1.3.6.1.4.1.2011.5.25.224.1.22.5", "hwIPSecVSUAlarmMbpsRate": "1.3.6.1.4.1.2011.5.25.224.1.22.6", "hwIPSecLicenseBandwidth": "1.3.6.1.4.1.2011.5.25.224.1.22.7", "hwIPSecVSUSlotStr": "1.3.6.1.4.1.2011.5.25.224.1.22.8"]
]

// --- hwIPSecIKEV1UnsupportedAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.224.5.9
// Description: The local device does not support IKE V1 service.
trapMap["1.3.6.1.4.1.2011.5.25.224.5.9"] = [
    name: "hwIPSecIKEV1UnsupportedAlarm",
    fields: [],
    fieldOids: []
]

// --- hwIPSecIKEV1UnsupportedAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.224.5.10
// Description: The IKEv1 patch has been installed on the local device to support IKEv1 services.
trapMap["1.3.6.1.4.1.2011.5.25.224.5.10"] = [
    name: "hwIPSecIKEV1UnsupportedAlarmResume",
    fields: [],
    fieldOids: []
]

// --- hwIPSECBandwidthLicenseResLackAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.224.5.11
// Fields: hwIPSecLicenseItemName, hwIPSecLicenseDescription, hwIPSecVSUSlotStr
// Description: The object indicates the alarm generated when the IPSec license enhanced bandwidth resources become insufficient.
trapMap["1.3.6.1.4.1.2011.5.25.224.5.11"] = [
    name: "hwIPSECBandwidthLicenseResLackAlarm",
    fields: ["hwIPSecLicenseItemName", "hwIPSecLicenseDescription", "hwIPSecVSUSlotStr"],
    fieldOids: ["hwIPSecLicenseItemName": "1.3.6.1.4.1.2011.5.25.224.1.22.9", "hwIPSecLicenseDescription": "1.3.6.1.4.1.2011.5.25.224.1.22.10", "hwIPSecVSUSlotStr": "1.3.6.1.4.1.2011.5.25.224.1.22.8"]
]

// --- hwIPSECBandwidthLicenseResLackResumeAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.224.5.12
// Fields: hwIPSecLicenseItemName, hwIPSecLicenseDescription, hwIPSecVSUSlotStr
// Description: The object indicates the clear alarm generated when the IPSec license enhanced bandwidth resources become sufficient.
trapMap["1.3.6.1.4.1.2011.5.25.224.5.12"] = [
    name: "hwIPSECBandwidthLicenseResLackResumeAlarm",
    fields: ["hwIPSecLicenseItemName", "hwIPSecLicenseDescription", "hwIPSecVSUSlotStr"],
    fieldOids: ["hwIPSecLicenseItemName": "1.3.6.1.4.1.2011.5.25.224.1.22.9", "hwIPSecLicenseDescription": "1.3.6.1.4.1.2011.5.25.224.1.22.10", "hwIPSecVSUSlotStr": "1.3.6.1.4.1.2011.5.25.224.1.22.8"]
]

// --- hwxSECVSUBBandwidthAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.224.5.13
// Fields: hwxSECVSUAlarmThreshold, hwxSECVSUAlarmbpsRateInUse, hwxSECVSUAlarmMbpsRate, hwxSECLicenseBandwidth, hwxSECVSUSlotStr, hwxSECVSUCpuId
// Description: The xSEC bandwidth usage of the slot exceeds the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.224.5.13"] = [
    name: "hwxSECVSUBBandwidthAlarm",
    fields: ["hwxSECVSUAlarmThreshold", "hwxSECVSUAlarmbpsRateInUse", "hwxSECVSUAlarmMbpsRate", "hwxSECLicenseBandwidth", "hwxSECVSUSlotStr", "hwxSECVSUCpuId"],
    fieldOids: ["hwxSECVSUAlarmThreshold": "1.3.6.1.4.1.2011.5.25.224.1.22.11", "hwxSECVSUAlarmbpsRateInUse": "1.3.6.1.4.1.2011.5.25.224.1.22.12", "hwxSECVSUAlarmMbpsRate": "1.3.6.1.4.1.2011.5.25.224.1.22.13", "hwxSECLicenseBandwidth": "1.3.6.1.4.1.2011.5.25.224.1.22.14", "hwxSECVSUSlotStr": "1.3.6.1.4.1.2011.5.25.224.1.22.15", "hwxSECVSUCpuId": "1.3.6.1.4.1.2011.5.25.224.1.22.16"]
]

// --- hwxSECVSUBBandwidthResumeAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.224.5.14
// Fields: hwxSECVSUAlarmThreshold, hwxSECVSUAlarmbpsRateInUse, hwxSECVSUAlarmMbpsRate, hwxSECLicenseBandwidth, hwxSECVSUSlotStr, hwxSECVSUCpuId
// Description: The xSEC bandwidth usage of the slot fell below the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.224.5.14"] = [
    name: "hwxSECVSUBBandwidthResumeAlarm",
    fields: ["hwxSECVSUAlarmThreshold", "hwxSECVSUAlarmbpsRateInUse", "hwxSECVSUAlarmMbpsRate", "hwxSECLicenseBandwidth", "hwxSECVSUSlotStr", "hwxSECVSUCpuId"],
    fieldOids: ["hwxSECVSUAlarmThreshold": "1.3.6.1.4.1.2011.5.25.224.1.22.11", "hwxSECVSUAlarmbpsRateInUse": "1.3.6.1.4.1.2011.5.25.224.1.22.12", "hwxSECVSUAlarmMbpsRate": "1.3.6.1.4.1.2011.5.25.224.1.22.13", "hwxSECLicenseBandwidth": "1.3.6.1.4.1.2011.5.25.224.1.22.14", "hwxSECVSUSlotStr": "1.3.6.1.4.1.2011.5.25.224.1.22.15", "hwxSECVSUCpuId": "1.3.6.1.4.1.2011.5.25.224.1.22.16"]
]

// --- hwxSECVSUBBandwidthExhaustAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.224.5.15
// Fields: hwxSECVSUAlarmbpsRateInUse, hwxSECVSUAlarmMbpsRate, hwxSECLicenseBandwidth, hwxSECVSUSlotStr, hwxSECVSUCpuId
// Description: The xSEC bandwidth of the slot was exhausted.
trapMap["1.3.6.1.4.1.2011.5.25.224.5.15"] = [
    name: "hwxSECVSUBBandwidthExhaustAlarm",
    fields: ["hwxSECVSUAlarmbpsRateInUse", "hwxSECVSUAlarmMbpsRate", "hwxSECLicenseBandwidth", "hwxSECVSUSlotStr", "hwxSECVSUCpuId"],
    fieldOids: ["hwxSECVSUAlarmbpsRateInUse": "1.3.6.1.4.1.2011.5.25.224.1.22.12", "hwxSECVSUAlarmMbpsRate": "1.3.6.1.4.1.2011.5.25.224.1.22.13", "hwxSECLicenseBandwidth": "1.3.6.1.4.1.2011.5.25.224.1.22.14", "hwxSECVSUSlotStr": "1.3.6.1.4.1.2011.5.25.224.1.22.15", "hwxSECVSUCpuId": "1.3.6.1.4.1.2011.5.25.224.1.22.16"]
]

// --- hwxSECVSUBBandwidthExhaustResumeAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.224.5.16
// Fields: hwxSECVSUAlarmbpsRateInUse, hwxSECVSUAlarmMbpsRate, hwxSECLicenseBandwidth, hwxSECVSUSlotStr, hwxSECVSUCpuId
// Description: The slot xSEC bandwidth resources became available again.
trapMap["1.3.6.1.4.1.2011.5.25.224.5.16"] = [
    name: "hwxSECVSUBBandwidthExhaustResumeAlarm",
    fields: ["hwxSECVSUAlarmbpsRateInUse", "hwxSECVSUAlarmMbpsRate", "hwxSECLicenseBandwidth", "hwxSECVSUSlotStr", "hwxSECVSUCpuId"],
    fieldOids: ["hwxSECVSUAlarmbpsRateInUse": "1.3.6.1.4.1.2011.5.25.224.1.22.12", "hwxSECVSUAlarmMbpsRate": "1.3.6.1.4.1.2011.5.25.224.1.22.13", "hwxSECLicenseBandwidth": "1.3.6.1.4.1.2011.5.25.224.1.22.14", "hwxSECVSUSlotStr": "1.3.6.1.4.1.2011.5.25.224.1.22.15", "hwxSECVSUCpuId": "1.3.6.1.4.1.2011.5.25.224.1.22.16"]
]

// --- hwIPSecVsuBoardMatchAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.224.5.17
// Fields: hwIPSecVSUSlotStr, hwIPSecLicenseDescription
// Description: The corresponding service board's license has not been loaded.
trapMap["1.3.6.1.4.1.2011.5.25.224.5.17"] = [
    name: "hwIPSecVsuBoardMatchAlarm",
    fields: ["hwIPSecVSUSlotStr", "hwIPSecLicenseDescription"],
    fieldOids: ["hwIPSecVSUSlotStr": "1.3.6.1.4.1.2011.5.25.224.1.22.8", "hwIPSecLicenseDescription": "1.3.6.1.4.1.2011.5.25.224.1.22.10"]
]

// --- hwIPSecVsuBoardMatchAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.224.5.18
// Fields: hwIPSecVSUSlotStr, hwIPSecLicenseDescription
// Description: The corresponding service board's license has been loaded.
trapMap["1.3.6.1.4.1.2011.5.25.224.5.18"] = [
    name: "hwIPSecVsuBoardMatchAlarmResume",
    fields: ["hwIPSecVSUSlotStr", "hwIPSecLicenseDescription"],
    fieldOids: ["hwIPSecVSUSlotStr": "1.3.6.1.4.1.2011.5.25.224.1.22.8", "hwIPSecLicenseDescription": "1.3.6.1.4.1.2011.5.25.224.1.22.10"]
]

// ===== Parsing logic =====

// Set to true to enable diagnostic logging for this MIB parser
DEBUG = false

LOG_PREFIX = "[HUAWEI-IPSEC-MIB]"
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
