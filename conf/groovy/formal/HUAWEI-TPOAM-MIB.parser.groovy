/**
 * Auto-generated from HUAWEI-TPOAM-MIB.mib
 * Generated: 2026-08-24T18:28:31.230643300
 * Traps/Notifications (58): hwMplsTpOamLossOfConnection, hwMplsTpOamLossOfConnectionRecovery, hwMplsTpOamRemoteDefectIndication, hwMplsTpOamRemoteDefectIndicationRecovery, hwMplsTpOamUnExpectMeg, hwMplsTpOamUnExpectMegRecovery, hwMplsTpOamUnExpectMep, hwMplsTpOamUnExpectMepRecovery, hwMplsTpOamUnExpectPeriod, hwMplsTpOamUnExpectPeriodRecovery, hwMplsTpOamUnExpectPhb, hwMplsTpOamUnExpectPhbRecovery, hwMplsTpOamAlarmIndicationSignal, hwMplsTpOamAlarmIndicationSignalRecovery, hwMplsTpOamNearDualLossSD1, hwMplsTpOamNearDualLossSD1Recovery, hwMplsTpOamFarDualLossSD1, hwMplsTpOamFarDualLossSD1Recovery, hwMplsTpOamNearDualLossSD2, hwMplsTpOamNearDualLossSD2Recovery, hwMplsTpOamFarDualLossSD2, hwMplsTpOamFarDualLossSD2Recovery, hwMplsTpOamLCK, hwMplsTpOamLCKRecovery, hwMplsTpOamCSF, hwMplsTpOamCSFRecovery, hwMplsTpOamUnExpectMegLevel, hwMplsTpOamUnExpectMegLevelRecovery, hwMplsTpOamSectionLossOfConnection, hwMplsTpOamSectionLossOfConnectionRecovery, hwMplsTpOamSectionRemoteDefectIndication, hwMplsTpOamSectionRemoteDefectIndicationRecovery, hwMplsTpOamSectionUnExpectMeg, hwMplsTpOamSectionUnExpectMegRecovery, hwMplsTpOamSectionUnExpectMep, hwMplsTpOamSectionUnExpectMepRecovery, hwMplsTpOamSectionUnExpectPeriod, hwMplsTpOamSectionUnExpectPeriodRecovery, hwMplsTpOamSectionUnExpectPhb, hwMplsTpOamSectionUnExpectPhbRecovery, hwMplsTpOamSectionNearDualLossSD1, hwMplsTpOamSectionNearDualLossSD1Recovery, hwMplsTpOamSectionFarDualLossSD1, hwMplsTpOamSectionFarDualLossSD1Recovery, hwMplsTpOamSectionNearDualLossSD2, hwMplsTpOamSectionNearDualLossSD2Recovery, hwMplsTpOamSectionFarDualLossSD2, hwMplsTpOamSectionFarDualLossSD2Recovery, hwMplsTpOamSectionLCK, hwMplsTpOamSectionLCKRecovery, hwMplsTpOamSectionUnExpectMegLevel, hwMplsTpOamSectionUnExpectMegLevelRecovery, hwMplsTpOamSectionLocalLock, hwMplsTpOamSectionLocalLockRecovery, hwMplsTpOamLocalLock, hwMplsTpOamLocalLockRecovery, hwMplsTpOamIpMegPingTrap, hwMplsTpOamIpMegTracertTrap
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

// --- hwMplsTpOamLossOfConnection (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.235.1.5.1
// Fields: hwMplsTpOamMegId, hwMplsTpOamMeType, hwMplsTpOamMeDirection, hwMplsTpOamMeIfName, hwMplsTpOamMePeerip, hwMplsTpOamMeVcId, hwMplsTpOamMeVcType, hwMplsTpOamMeVllRemotePeerIp, hwMplsTpOamMEVllTTL, hwMplsTpOamMeMepId, hwMplsTpOamMeRemoteMepId, hwMplsTpOamMeLspName, hwMplsTpOamMeVsiName
// Description: This object is used to indicates the connectivity fault of the link.
trapMap["1.3.6.1.4.1.2011.5.25.235.1.5.1"] = [
    name: "hwMplsTpOamLossOfConnection",
    fields: ["hwMplsTpOamMegId", "hwMplsTpOamMeType", "hwMplsTpOamMeDirection", "hwMplsTpOamMeIfName", "hwMplsTpOamMePeerip", "hwMplsTpOamMeVcId", "hwMplsTpOamMeVcType", "hwMplsTpOamMeVllRemotePeerIp", "hwMplsTpOamMEVllTTL", "hwMplsTpOamMeMepId", "hwMplsTpOamMeRemoteMepId", "hwMplsTpOamMeLspName", "hwMplsTpOamMeVsiName"],
    fieldOids: ["hwMplsTpOamMegId": "1.3.6.1.4.1.2011.5.25.235.1.1.1.1.1", "hwMplsTpOamMeType": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.2", "hwMplsTpOamMeDirection": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.3", "hwMplsTpOamMeIfName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.4", "hwMplsTpOamMePeerip": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.5", "hwMplsTpOamMeVcId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.6", "hwMplsTpOamMeVcType": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.7", "hwMplsTpOamMeVllRemotePeerIp": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.8", "hwMplsTpOamMEVllTTL": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.9", "hwMplsTpOamMeMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.10", "hwMplsTpOamMeRemoteMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.11", "hwMplsTpOamMeLspName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.13", "hwMplsTpOamMeVsiName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.14"]
]

// --- hwMplsTpOamLossOfConnectionRecovery (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.235.1.5.2
// Fields: hwMplsTpOamMegId, hwMplsTpOamMeType, hwMplsTpOamMeDirection, hwMplsTpOamMeIfName, hwMplsTpOamMePeerip, hwMplsTpOamMeVcId, hwMplsTpOamMeVcType, hwMplsTpOamMeVllRemotePeerIp, hwMplsTpOamMEVllTTL, hwMplsTpOamMeMepId, hwMplsTpOamMeRemoteMepId, hwMplsTpOamMeLspName, hwMplsTpOamMeVsiName
// Description: This object indicates that the link recovers from a connectivity fault.
trapMap["1.3.6.1.4.1.2011.5.25.235.1.5.2"] = [
    name: "hwMplsTpOamLossOfConnectionRecovery",
    fields: ["hwMplsTpOamMegId", "hwMplsTpOamMeType", "hwMplsTpOamMeDirection", "hwMplsTpOamMeIfName", "hwMplsTpOamMePeerip", "hwMplsTpOamMeVcId", "hwMplsTpOamMeVcType", "hwMplsTpOamMeVllRemotePeerIp", "hwMplsTpOamMEVllTTL", "hwMplsTpOamMeMepId", "hwMplsTpOamMeRemoteMepId", "hwMplsTpOamMeLspName", "hwMplsTpOamMeVsiName"],
    fieldOids: ["hwMplsTpOamMegId": "1.3.6.1.4.1.2011.5.25.235.1.1.1.1.1", "hwMplsTpOamMeType": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.2", "hwMplsTpOamMeDirection": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.3", "hwMplsTpOamMeIfName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.4", "hwMplsTpOamMePeerip": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.5", "hwMplsTpOamMeVcId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.6", "hwMplsTpOamMeVcType": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.7", "hwMplsTpOamMeVllRemotePeerIp": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.8", "hwMplsTpOamMEVllTTL": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.9", "hwMplsTpOamMeMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.10", "hwMplsTpOamMeRemoteMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.11", "hwMplsTpOamMeLspName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.13", "hwMplsTpOamMeVsiName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.14"]
]

// --- hwMplsTpOamRemoteDefectIndication (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.235.1.5.3
// Fields: hwMplsTpOamMegId, hwMplsTpOamMeType, hwMplsTpOamMeDirection, hwMplsTpOamMeIfName, hwMplsTpOamMePeerip, hwMplsTpOamMeVcId, hwMplsTpOamMeVcType, hwMplsTpOamMeVllRemotePeerIp, hwMplsTpOamMEVllTTL, hwMplsTpOamMeMepId, hwMplsTpOamMeRemoteMepId, hwMplsTpOamMeLspName, hwMplsTpOamMeVsiName
// Description: This object is used to indicates the remote defect of the link.
trapMap["1.3.6.1.4.1.2011.5.25.235.1.5.3"] = [
    name: "hwMplsTpOamRemoteDefectIndication",
    fields: ["hwMplsTpOamMegId", "hwMplsTpOamMeType", "hwMplsTpOamMeDirection", "hwMplsTpOamMeIfName", "hwMplsTpOamMePeerip", "hwMplsTpOamMeVcId", "hwMplsTpOamMeVcType", "hwMplsTpOamMeVllRemotePeerIp", "hwMplsTpOamMEVllTTL", "hwMplsTpOamMeMepId", "hwMplsTpOamMeRemoteMepId", "hwMplsTpOamMeLspName", "hwMplsTpOamMeVsiName"],
    fieldOids: ["hwMplsTpOamMegId": "1.3.6.1.4.1.2011.5.25.235.1.1.1.1.1", "hwMplsTpOamMeType": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.2", "hwMplsTpOamMeDirection": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.3", "hwMplsTpOamMeIfName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.4", "hwMplsTpOamMePeerip": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.5", "hwMplsTpOamMeVcId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.6", "hwMplsTpOamMeVcType": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.7", "hwMplsTpOamMeVllRemotePeerIp": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.8", "hwMplsTpOamMEVllTTL": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.9", "hwMplsTpOamMeMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.10", "hwMplsTpOamMeRemoteMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.11", "hwMplsTpOamMeLspName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.13", "hwMplsTpOamMeVsiName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.14"]
]

// --- hwMplsTpOamRemoteDefectIndicationRecovery (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.235.1.5.4
// Fields: hwMplsTpOamMegId, hwMplsTpOamMeType, hwMplsTpOamMeDirection, hwMplsTpOamMeIfName, hwMplsTpOamMePeerip, hwMplsTpOamMeVcId, hwMplsTpOamMeVcType, hwMplsTpOamMeVllRemotePeerIp, hwMplsTpOamMEVllTTL, hwMplsTpOamMeMepId, hwMplsTpOamMeRemoteMepId, hwMplsTpOamMeLspName, hwMplsTpOamMeVsiName
// Description: This object indicates that the link recovers from a remote defect.
trapMap["1.3.6.1.4.1.2011.5.25.235.1.5.4"] = [
    name: "hwMplsTpOamRemoteDefectIndicationRecovery",
    fields: ["hwMplsTpOamMegId", "hwMplsTpOamMeType", "hwMplsTpOamMeDirection", "hwMplsTpOamMeIfName", "hwMplsTpOamMePeerip", "hwMplsTpOamMeVcId", "hwMplsTpOamMeVcType", "hwMplsTpOamMeVllRemotePeerIp", "hwMplsTpOamMEVllTTL", "hwMplsTpOamMeMepId", "hwMplsTpOamMeRemoteMepId", "hwMplsTpOamMeLspName", "hwMplsTpOamMeVsiName"],
    fieldOids: ["hwMplsTpOamMegId": "1.3.6.1.4.1.2011.5.25.235.1.1.1.1.1", "hwMplsTpOamMeType": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.2", "hwMplsTpOamMeDirection": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.3", "hwMplsTpOamMeIfName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.4", "hwMplsTpOamMePeerip": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.5", "hwMplsTpOamMeVcId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.6", "hwMplsTpOamMeVcType": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.7", "hwMplsTpOamMeVllRemotePeerIp": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.8", "hwMplsTpOamMEVllTTL": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.9", "hwMplsTpOamMeMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.10", "hwMplsTpOamMeRemoteMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.11", "hwMplsTpOamMeLspName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.13", "hwMplsTpOamMeVsiName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.14"]
]

// --- hwMplsTpOamUnExpectMeg (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.235.1.5.5
// Fields: hwMplsTpOamMegId, hwMplsTpOamMeType, hwMplsTpOamMeDirection, hwMplsTpOamMeIfName, hwMplsTpOamMePeerip, hwMplsTpOamMeVcId, hwMplsTpOamMeVcType, hwMplsTpOamMeVllRemotePeerIp, hwMplsTpOamMEVllTTL, hwMplsTpOamMeMepId, hwMplsTpOamMeRemoteMepId, hwMplsTpOamMeLspName, hwMplsTpOamMeVsiName
// Description: This object indicates the link receivs an unexpect MEG-ID defect.
trapMap["1.3.6.1.4.1.2011.5.25.235.1.5.5"] = [
    name: "hwMplsTpOamUnExpectMeg",
    fields: ["hwMplsTpOamMegId", "hwMplsTpOamMeType", "hwMplsTpOamMeDirection", "hwMplsTpOamMeIfName", "hwMplsTpOamMePeerip", "hwMplsTpOamMeVcId", "hwMplsTpOamMeVcType", "hwMplsTpOamMeVllRemotePeerIp", "hwMplsTpOamMEVllTTL", "hwMplsTpOamMeMepId", "hwMplsTpOamMeRemoteMepId", "hwMplsTpOamMeLspName", "hwMplsTpOamMeVsiName"],
    fieldOids: ["hwMplsTpOamMegId": "1.3.6.1.4.1.2011.5.25.235.1.1.1.1.1", "hwMplsTpOamMeType": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.2", "hwMplsTpOamMeDirection": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.3", "hwMplsTpOamMeIfName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.4", "hwMplsTpOamMePeerip": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.5", "hwMplsTpOamMeVcId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.6", "hwMplsTpOamMeVcType": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.7", "hwMplsTpOamMeVllRemotePeerIp": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.8", "hwMplsTpOamMEVllTTL": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.9", "hwMplsTpOamMeMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.10", "hwMplsTpOamMeRemoteMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.11", "hwMplsTpOamMeLspName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.13", "hwMplsTpOamMeVsiName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.14"]
]

// --- hwMplsTpOamUnExpectMegRecovery (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.235.1.5.6
// Fields: hwMplsTpOamMegId, hwMplsTpOamMeType, hwMplsTpOamMeDirection, hwMplsTpOamMeIfName, hwMplsTpOamMePeerip, hwMplsTpOamMeVcId, hwMplsTpOamMeVcType, hwMplsTpOamMeVllRemotePeerIp, hwMplsTpOamMEVllTTL, hwMplsTpOamMeMepId, hwMplsTpOamMeRemoteMepId, hwMplsTpOamMeLspName, hwMplsTpOamMeVsiName
// Description: This object indicates that the link recovers from an unexpect MEG-ID defect.
trapMap["1.3.6.1.4.1.2011.5.25.235.1.5.6"] = [
    name: "hwMplsTpOamUnExpectMegRecovery",
    fields: ["hwMplsTpOamMegId", "hwMplsTpOamMeType", "hwMplsTpOamMeDirection", "hwMplsTpOamMeIfName", "hwMplsTpOamMePeerip", "hwMplsTpOamMeVcId", "hwMplsTpOamMeVcType", "hwMplsTpOamMeVllRemotePeerIp", "hwMplsTpOamMEVllTTL", "hwMplsTpOamMeMepId", "hwMplsTpOamMeRemoteMepId", "hwMplsTpOamMeLspName", "hwMplsTpOamMeVsiName"],
    fieldOids: ["hwMplsTpOamMegId": "1.3.6.1.4.1.2011.5.25.235.1.1.1.1.1", "hwMplsTpOamMeType": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.2", "hwMplsTpOamMeDirection": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.3", "hwMplsTpOamMeIfName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.4", "hwMplsTpOamMePeerip": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.5", "hwMplsTpOamMeVcId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.6", "hwMplsTpOamMeVcType": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.7", "hwMplsTpOamMeVllRemotePeerIp": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.8", "hwMplsTpOamMEVllTTL": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.9", "hwMplsTpOamMeMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.10", "hwMplsTpOamMeRemoteMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.11", "hwMplsTpOamMeLspName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.13", "hwMplsTpOamMeVsiName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.14"]
]

// --- hwMplsTpOamUnExpectMep (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.235.1.5.7
// Fields: hwMplsTpOamMegId, hwMplsTpOamMeType, hwMplsTpOamMeDirection, hwMplsTpOamMeIfName, hwMplsTpOamMePeerip, hwMplsTpOamMeVcId, hwMplsTpOamMeVcType, hwMplsTpOamMeVllRemotePeerIp, hwMplsTpOamMEVllTTL, hwMplsTpOamMeMepId, hwMplsTpOamMeRemoteMepId, hwMplsTpOamMeLspName, hwMplsTpOamMeVsiName
// Description: This object indicates the link receivs an unexpect MEP-ID defect.
trapMap["1.3.6.1.4.1.2011.5.25.235.1.5.7"] = [
    name: "hwMplsTpOamUnExpectMep",
    fields: ["hwMplsTpOamMegId", "hwMplsTpOamMeType", "hwMplsTpOamMeDirection", "hwMplsTpOamMeIfName", "hwMplsTpOamMePeerip", "hwMplsTpOamMeVcId", "hwMplsTpOamMeVcType", "hwMplsTpOamMeVllRemotePeerIp", "hwMplsTpOamMEVllTTL", "hwMplsTpOamMeMepId", "hwMplsTpOamMeRemoteMepId", "hwMplsTpOamMeLspName", "hwMplsTpOamMeVsiName"],
    fieldOids: ["hwMplsTpOamMegId": "1.3.6.1.4.1.2011.5.25.235.1.1.1.1.1", "hwMplsTpOamMeType": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.2", "hwMplsTpOamMeDirection": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.3", "hwMplsTpOamMeIfName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.4", "hwMplsTpOamMePeerip": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.5", "hwMplsTpOamMeVcId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.6", "hwMplsTpOamMeVcType": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.7", "hwMplsTpOamMeVllRemotePeerIp": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.8", "hwMplsTpOamMEVllTTL": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.9", "hwMplsTpOamMeMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.10", "hwMplsTpOamMeRemoteMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.11", "hwMplsTpOamMeLspName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.13", "hwMplsTpOamMeVsiName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.14"]
]

// --- hwMplsTpOamUnExpectMepRecovery (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.235.1.5.8
// Fields: hwMplsTpOamMegId, hwMplsTpOamMeType, hwMplsTpOamMeDirection, hwMplsTpOamMeIfName, hwMplsTpOamMePeerip, hwMplsTpOamMeVcId, hwMplsTpOamMeVcType, hwMplsTpOamMeVllRemotePeerIp, hwMplsTpOamMEVllTTL, hwMplsTpOamMeMepId, hwMplsTpOamMeRemoteMepId, hwMplsTpOamMeLspName, hwMplsTpOamMeVsiName
// Description: This object indicates that the link recovers from an unexpect MEP-ID defect.
trapMap["1.3.6.1.4.1.2011.5.25.235.1.5.8"] = [
    name: "hwMplsTpOamUnExpectMepRecovery",
    fields: ["hwMplsTpOamMegId", "hwMplsTpOamMeType", "hwMplsTpOamMeDirection", "hwMplsTpOamMeIfName", "hwMplsTpOamMePeerip", "hwMplsTpOamMeVcId", "hwMplsTpOamMeVcType", "hwMplsTpOamMeVllRemotePeerIp", "hwMplsTpOamMEVllTTL", "hwMplsTpOamMeMepId", "hwMplsTpOamMeRemoteMepId", "hwMplsTpOamMeLspName", "hwMplsTpOamMeVsiName"],
    fieldOids: ["hwMplsTpOamMegId": "1.3.6.1.4.1.2011.5.25.235.1.1.1.1.1", "hwMplsTpOamMeType": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.2", "hwMplsTpOamMeDirection": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.3", "hwMplsTpOamMeIfName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.4", "hwMplsTpOamMePeerip": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.5", "hwMplsTpOamMeVcId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.6", "hwMplsTpOamMeVcType": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.7", "hwMplsTpOamMeVllRemotePeerIp": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.8", "hwMplsTpOamMEVllTTL": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.9", "hwMplsTpOamMeMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.10", "hwMplsTpOamMeRemoteMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.11", "hwMplsTpOamMeLspName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.13", "hwMplsTpOamMeVsiName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.14"]
]

// --- hwMplsTpOamUnExpectPeriod (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.235.1.5.9
// Fields: hwMplsTpOamMegId, hwMplsTpOamMeType, hwMplsTpOamMeDirection, hwMplsTpOamMeIfName, hwMplsTpOamMePeerip, hwMplsTpOamMeVcId, hwMplsTpOamMeVcType, hwMplsTpOamMeVllRemotePeerIp, hwMplsTpOamMEVllTTL, hwMplsTpOamMeMepId, hwMplsTpOamMeRemoteMepId, hwMplsTpOamMeLspName, hwMplsTpOamMeVsiName
// Description: This object indicates the link receivs an unexpect period defect.
trapMap["1.3.6.1.4.1.2011.5.25.235.1.5.9"] = [
    name: "hwMplsTpOamUnExpectPeriod",
    fields: ["hwMplsTpOamMegId", "hwMplsTpOamMeType", "hwMplsTpOamMeDirection", "hwMplsTpOamMeIfName", "hwMplsTpOamMePeerip", "hwMplsTpOamMeVcId", "hwMplsTpOamMeVcType", "hwMplsTpOamMeVllRemotePeerIp", "hwMplsTpOamMEVllTTL", "hwMplsTpOamMeMepId", "hwMplsTpOamMeRemoteMepId", "hwMplsTpOamMeLspName", "hwMplsTpOamMeVsiName"],
    fieldOids: ["hwMplsTpOamMegId": "1.3.6.1.4.1.2011.5.25.235.1.1.1.1.1", "hwMplsTpOamMeType": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.2", "hwMplsTpOamMeDirection": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.3", "hwMplsTpOamMeIfName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.4", "hwMplsTpOamMePeerip": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.5", "hwMplsTpOamMeVcId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.6", "hwMplsTpOamMeVcType": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.7", "hwMplsTpOamMeVllRemotePeerIp": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.8", "hwMplsTpOamMEVllTTL": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.9", "hwMplsTpOamMeMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.10", "hwMplsTpOamMeRemoteMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.11", "hwMplsTpOamMeLspName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.13", "hwMplsTpOamMeVsiName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.14"]
]

// --- hwMplsTpOamUnExpectPeriodRecovery (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.235.1.5.10
// Fields: hwMplsTpOamMegId, hwMplsTpOamMeType, hwMplsTpOamMeDirection, hwMplsTpOamMeIfName, hwMplsTpOamMePeerip, hwMplsTpOamMeVcId, hwMplsTpOamMeVcType, hwMplsTpOamMeVllRemotePeerIp, hwMplsTpOamMEVllTTL, hwMplsTpOamMeMepId, hwMplsTpOamMeRemoteMepId, hwMplsTpOamMeLspName, hwMplsTpOamMeVsiName
// Description: This object indicates that the link recovers from an unexpect period defect.
trapMap["1.3.6.1.4.1.2011.5.25.235.1.5.10"] = [
    name: "hwMplsTpOamUnExpectPeriodRecovery",
    fields: ["hwMplsTpOamMegId", "hwMplsTpOamMeType", "hwMplsTpOamMeDirection", "hwMplsTpOamMeIfName", "hwMplsTpOamMePeerip", "hwMplsTpOamMeVcId", "hwMplsTpOamMeVcType", "hwMplsTpOamMeVllRemotePeerIp", "hwMplsTpOamMEVllTTL", "hwMplsTpOamMeMepId", "hwMplsTpOamMeRemoteMepId", "hwMplsTpOamMeLspName", "hwMplsTpOamMeVsiName"],
    fieldOids: ["hwMplsTpOamMegId": "1.3.6.1.4.1.2011.5.25.235.1.1.1.1.1", "hwMplsTpOamMeType": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.2", "hwMplsTpOamMeDirection": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.3", "hwMplsTpOamMeIfName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.4", "hwMplsTpOamMePeerip": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.5", "hwMplsTpOamMeVcId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.6", "hwMplsTpOamMeVcType": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.7", "hwMplsTpOamMeVllRemotePeerIp": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.8", "hwMplsTpOamMEVllTTL": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.9", "hwMplsTpOamMeMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.10", "hwMplsTpOamMeRemoteMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.11", "hwMplsTpOamMeLspName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.13", "hwMplsTpOamMeVsiName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.14"]
]

// --- hwMplsTpOamUnExpectPhb (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.235.1.5.11
// Fields: hwMplsTpOamMegId, hwMplsTpOamMeType, hwMplsTpOamMeDirection, hwMplsTpOamMeIfName, hwMplsTpOamMePeerip, hwMplsTpOamMeVcId, hwMplsTpOamMeVcType, hwMplsTpOamMeVllRemotePeerIp, hwMplsTpOamMEVllTTL, hwMplsTpOamMeMepId, hwMplsTpOamMeRemoteMepId, hwMplsTpOamMeLspName, hwMplsTpOamMeVsiName
// Description: This object indicates the link receivs an unexpect PHB defect.
trapMap["1.3.6.1.4.1.2011.5.25.235.1.5.11"] = [
    name: "hwMplsTpOamUnExpectPhb",
    fields: ["hwMplsTpOamMegId", "hwMplsTpOamMeType", "hwMplsTpOamMeDirection", "hwMplsTpOamMeIfName", "hwMplsTpOamMePeerip", "hwMplsTpOamMeVcId", "hwMplsTpOamMeVcType", "hwMplsTpOamMeVllRemotePeerIp", "hwMplsTpOamMEVllTTL", "hwMplsTpOamMeMepId", "hwMplsTpOamMeRemoteMepId", "hwMplsTpOamMeLspName", "hwMplsTpOamMeVsiName"],
    fieldOids: ["hwMplsTpOamMegId": "1.3.6.1.4.1.2011.5.25.235.1.1.1.1.1", "hwMplsTpOamMeType": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.2", "hwMplsTpOamMeDirection": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.3", "hwMplsTpOamMeIfName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.4", "hwMplsTpOamMePeerip": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.5", "hwMplsTpOamMeVcId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.6", "hwMplsTpOamMeVcType": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.7", "hwMplsTpOamMeVllRemotePeerIp": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.8", "hwMplsTpOamMEVllTTL": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.9", "hwMplsTpOamMeMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.10", "hwMplsTpOamMeRemoteMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.11", "hwMplsTpOamMeLspName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.13", "hwMplsTpOamMeVsiName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.14"]
]

// --- hwMplsTpOamUnExpectPhbRecovery (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.235.1.5.12
// Fields: hwMplsTpOamMegId, hwMplsTpOamMeType, hwMplsTpOamMeDirection, hwMplsTpOamMeIfName, hwMplsTpOamMePeerip, hwMplsTpOamMeVcId, hwMplsTpOamMeVcType, hwMplsTpOamMeVllRemotePeerIp, hwMplsTpOamMEVllTTL, hwMplsTpOamMeMepId, hwMplsTpOamMeRemoteMepId, hwMplsTpOamMeLspName, hwMplsTpOamMeVsiName
// Description: This object indicates that the link recovers from an unexpect PHB defect.
trapMap["1.3.6.1.4.1.2011.5.25.235.1.5.12"] = [
    name: "hwMplsTpOamUnExpectPhbRecovery",
    fields: ["hwMplsTpOamMegId", "hwMplsTpOamMeType", "hwMplsTpOamMeDirection", "hwMplsTpOamMeIfName", "hwMplsTpOamMePeerip", "hwMplsTpOamMeVcId", "hwMplsTpOamMeVcType", "hwMplsTpOamMeVllRemotePeerIp", "hwMplsTpOamMEVllTTL", "hwMplsTpOamMeMepId", "hwMplsTpOamMeRemoteMepId", "hwMplsTpOamMeLspName", "hwMplsTpOamMeVsiName"],
    fieldOids: ["hwMplsTpOamMegId": "1.3.6.1.4.1.2011.5.25.235.1.1.1.1.1", "hwMplsTpOamMeType": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.2", "hwMplsTpOamMeDirection": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.3", "hwMplsTpOamMeIfName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.4", "hwMplsTpOamMePeerip": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.5", "hwMplsTpOamMeVcId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.6", "hwMplsTpOamMeVcType": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.7", "hwMplsTpOamMeVllRemotePeerIp": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.8", "hwMplsTpOamMEVllTTL": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.9", "hwMplsTpOamMeMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.10", "hwMplsTpOamMeRemoteMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.11", "hwMplsTpOamMeLspName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.13", "hwMplsTpOamMeVsiName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.14"]
]

// --- hwMplsTpOamAlarmIndicationSignal (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.235.1.5.13
// Fields: hwMplsTpOamMegId, hwMplsTpOamMeType, hwMplsTpOamMeDirection, hwMplsTpOamMeIfName, hwMplsTpOamMePeerip, hwMplsTpOamMeVcId, hwMplsTpOamMeVcType, hwMplsTpOamMeVllRemotePeerIp, hwMplsTpOamMEVllTTL, hwMplsTpOamMeMepId, hwMplsTpOamMeRemoteMepId, hwMplsTpOamMeLspName, hwMplsTpOamMeVsiName
// Description: This object indicates the link receivs an alarm indication signal defect.
trapMap["1.3.6.1.4.1.2011.5.25.235.1.5.13"] = [
    name: "hwMplsTpOamAlarmIndicationSignal",
    fields: ["hwMplsTpOamMegId", "hwMplsTpOamMeType", "hwMplsTpOamMeDirection", "hwMplsTpOamMeIfName", "hwMplsTpOamMePeerip", "hwMplsTpOamMeVcId", "hwMplsTpOamMeVcType", "hwMplsTpOamMeVllRemotePeerIp", "hwMplsTpOamMEVllTTL", "hwMplsTpOamMeMepId", "hwMplsTpOamMeRemoteMepId", "hwMplsTpOamMeLspName", "hwMplsTpOamMeVsiName"],
    fieldOids: ["hwMplsTpOamMegId": "1.3.6.1.4.1.2011.5.25.235.1.1.1.1.1", "hwMplsTpOamMeType": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.2", "hwMplsTpOamMeDirection": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.3", "hwMplsTpOamMeIfName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.4", "hwMplsTpOamMePeerip": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.5", "hwMplsTpOamMeVcId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.6", "hwMplsTpOamMeVcType": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.7", "hwMplsTpOamMeVllRemotePeerIp": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.8", "hwMplsTpOamMEVllTTL": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.9", "hwMplsTpOamMeMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.10", "hwMplsTpOamMeRemoteMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.11", "hwMplsTpOamMeLspName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.13", "hwMplsTpOamMeVsiName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.14"]
]

// --- hwMplsTpOamAlarmIndicationSignalRecovery (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.235.1.5.14
// Fields: hwMplsTpOamMegId, hwMplsTpOamMeType, hwMplsTpOamMeDirection, hwMplsTpOamMeIfName, hwMplsTpOamMePeerip, hwMplsTpOamMeVcId, hwMplsTpOamMeVcType, hwMplsTpOamMeVllRemotePeerIp, hwMplsTpOamMEVllTTL, hwMplsTpOamMeMepId, hwMplsTpOamMeRemoteMepId, hwMplsTpOamMeLspName, hwMplsTpOamMeVsiName
// Description: This object indicates that the link recovers from an alarm indication signal defect.
trapMap["1.3.6.1.4.1.2011.5.25.235.1.5.14"] = [
    name: "hwMplsTpOamAlarmIndicationSignalRecovery",
    fields: ["hwMplsTpOamMegId", "hwMplsTpOamMeType", "hwMplsTpOamMeDirection", "hwMplsTpOamMeIfName", "hwMplsTpOamMePeerip", "hwMplsTpOamMeVcId", "hwMplsTpOamMeVcType", "hwMplsTpOamMeVllRemotePeerIp", "hwMplsTpOamMEVllTTL", "hwMplsTpOamMeMepId", "hwMplsTpOamMeRemoteMepId", "hwMplsTpOamMeLspName", "hwMplsTpOamMeVsiName"],
    fieldOids: ["hwMplsTpOamMegId": "1.3.6.1.4.1.2011.5.25.235.1.1.1.1.1", "hwMplsTpOamMeType": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.2", "hwMplsTpOamMeDirection": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.3", "hwMplsTpOamMeIfName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.4", "hwMplsTpOamMePeerip": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.5", "hwMplsTpOamMeVcId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.6", "hwMplsTpOamMeVcType": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.7", "hwMplsTpOamMeVllRemotePeerIp": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.8", "hwMplsTpOamMEVllTTL": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.9", "hwMplsTpOamMeMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.10", "hwMplsTpOamMeRemoteMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.11", "hwMplsTpOamMeLspName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.13", "hwMplsTpOamMeVsiName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.14"]
]

// --- hwMplsTpOamNearDualLossSD1 (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.235.1.5.15
// Fields: hwMplsTpOamMegId, hwMplsTpOamMeType, hwMplsTpOamMeDirection, hwMplsTpOamMeIfName, hwMplsTpOamMePeerip, hwMplsTpOamMeVcId, hwMplsTpOamMeVcType, hwMplsTpOamMeVllRemotePeerIp, hwMplsTpOamMEVllTTL, hwMplsTpOamMeMepId, hwMplsTpOamMeRemoteMepId, hwMplsTpOamDualLossLossRatio, hwMplsTpOamDualLossSD1Threshold, hwMplsTpOamMeLspName, hwMplsTpOamMeVsiName
// Description: This object indicates the link receivs a packet lost exceed signal degrade threshold defect.
trapMap["1.3.6.1.4.1.2011.5.25.235.1.5.15"] = [
    name: "hwMplsTpOamNearDualLossSD1",
    fields: ["hwMplsTpOamMegId", "hwMplsTpOamMeType", "hwMplsTpOamMeDirection", "hwMplsTpOamMeIfName", "hwMplsTpOamMePeerip", "hwMplsTpOamMeVcId", "hwMplsTpOamMeVcType", "hwMplsTpOamMeVllRemotePeerIp", "hwMplsTpOamMEVllTTL", "hwMplsTpOamMeMepId", "hwMplsTpOamMeRemoteMepId", "hwMplsTpOamDualLossLossRatio", "hwMplsTpOamDualLossSD1Threshold", "hwMplsTpOamMeLspName", "hwMplsTpOamMeVsiName"],
    fieldOids: ["hwMplsTpOamMegId": "1.3.6.1.4.1.2011.5.25.235.1.1.1.1.1", "hwMplsTpOamMeType": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.2", "hwMplsTpOamMeDirection": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.3", "hwMplsTpOamMeIfName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.4", "hwMplsTpOamMePeerip": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.5", "hwMplsTpOamMeVcId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.6", "hwMplsTpOamMeVcType": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.7", "hwMplsTpOamMeVllRemotePeerIp": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.8", "hwMplsTpOamMEVllTTL": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.9", "hwMplsTpOamMeMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.10", "hwMplsTpOamMeRemoteMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.11", "hwMplsTpOamDualLossLossRatio": "1.3.6.1.4.1.2011.5.25.235.1.4", "hwMplsTpOamDualLossSD1Threshold": "1.3.6.1.4.1.2011.5.25.235.1.1.1.1.13", "hwMplsTpOamMeLspName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.13", "hwMplsTpOamMeVsiName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.14"]
]

// --- hwMplsTpOamNearDualLossSD1Recovery (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.235.1.5.16
// Fields: hwMplsTpOamMegId, hwMplsTpOamMeType, hwMplsTpOamMeDirection, hwMplsTpOamMeIfName, hwMplsTpOamMePeerip, hwMplsTpOamMeVcId, hwMplsTpOamMeVcType, hwMplsTpOamMeVllRemotePeerIp, hwMplsTpOamMEVllTTL, hwMplsTpOamMeMepId, hwMplsTpOamMeRemoteMepId, hwMplsTpOamDualLossLossRatio, hwMplsTpOamDualLossSD1Threshold, hwMplsTpOamMeLspName, hwMplsTpOamMeVsiName
// Description: This object indicates that the link recovers from a packet lost exceed signal degrade threshold defect.
trapMap["1.3.6.1.4.1.2011.5.25.235.1.5.16"] = [
    name: "hwMplsTpOamNearDualLossSD1Recovery",
    fields: ["hwMplsTpOamMegId", "hwMplsTpOamMeType", "hwMplsTpOamMeDirection", "hwMplsTpOamMeIfName", "hwMplsTpOamMePeerip", "hwMplsTpOamMeVcId", "hwMplsTpOamMeVcType", "hwMplsTpOamMeVllRemotePeerIp", "hwMplsTpOamMEVllTTL", "hwMplsTpOamMeMepId", "hwMplsTpOamMeRemoteMepId", "hwMplsTpOamDualLossLossRatio", "hwMplsTpOamDualLossSD1Threshold", "hwMplsTpOamMeLspName", "hwMplsTpOamMeVsiName"],
    fieldOids: ["hwMplsTpOamMegId": "1.3.6.1.4.1.2011.5.25.235.1.1.1.1.1", "hwMplsTpOamMeType": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.2", "hwMplsTpOamMeDirection": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.3", "hwMplsTpOamMeIfName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.4", "hwMplsTpOamMePeerip": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.5", "hwMplsTpOamMeVcId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.6", "hwMplsTpOamMeVcType": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.7", "hwMplsTpOamMeVllRemotePeerIp": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.8", "hwMplsTpOamMEVllTTL": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.9", "hwMplsTpOamMeMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.10", "hwMplsTpOamMeRemoteMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.11", "hwMplsTpOamDualLossLossRatio": "1.3.6.1.4.1.2011.5.25.235.1.4", "hwMplsTpOamDualLossSD1Threshold": "1.3.6.1.4.1.2011.5.25.235.1.1.1.1.13", "hwMplsTpOamMeLspName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.13", "hwMplsTpOamMeVsiName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.14"]
]

// --- hwMplsTpOamFarDualLossSD1 (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.235.1.5.17
// Fields: hwMplsTpOamMegId, hwMplsTpOamMeType, hwMplsTpOamMeDirection, hwMplsTpOamMeIfName, hwMplsTpOamMePeerip, hwMplsTpOamMeVcId, hwMplsTpOamMeVcType, hwMplsTpOamMeVllRemotePeerIp, hwMplsTpOamMEVllTTL, hwMplsTpOamMeMepId, hwMplsTpOamMeRemoteMepId, hwMplsTpOamDualLossLossRatio, hwMplsTpOamDualLossSD1Threshold, hwMplsTpOamMeLspName, hwMplsTpOamMeVsiName
// Description: This object indicates the link receivs a packet lost exceed signal degrade threshold defect from the remote link.
trapMap["1.3.6.1.4.1.2011.5.25.235.1.5.17"] = [
    name: "hwMplsTpOamFarDualLossSD1",
    fields: ["hwMplsTpOamMegId", "hwMplsTpOamMeType", "hwMplsTpOamMeDirection", "hwMplsTpOamMeIfName", "hwMplsTpOamMePeerip", "hwMplsTpOamMeVcId", "hwMplsTpOamMeVcType", "hwMplsTpOamMeVllRemotePeerIp", "hwMplsTpOamMEVllTTL", "hwMplsTpOamMeMepId", "hwMplsTpOamMeRemoteMepId", "hwMplsTpOamDualLossLossRatio", "hwMplsTpOamDualLossSD1Threshold", "hwMplsTpOamMeLspName", "hwMplsTpOamMeVsiName"],
    fieldOids: ["hwMplsTpOamMegId": "1.3.6.1.4.1.2011.5.25.235.1.1.1.1.1", "hwMplsTpOamMeType": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.2", "hwMplsTpOamMeDirection": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.3", "hwMplsTpOamMeIfName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.4", "hwMplsTpOamMePeerip": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.5", "hwMplsTpOamMeVcId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.6", "hwMplsTpOamMeVcType": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.7", "hwMplsTpOamMeVllRemotePeerIp": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.8", "hwMplsTpOamMEVllTTL": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.9", "hwMplsTpOamMeMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.10", "hwMplsTpOamMeRemoteMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.11", "hwMplsTpOamDualLossLossRatio": "1.3.6.1.4.1.2011.5.25.235.1.4", "hwMplsTpOamDualLossSD1Threshold": "1.3.6.1.4.1.2011.5.25.235.1.1.1.1.13", "hwMplsTpOamMeLspName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.13", "hwMplsTpOamMeVsiName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.14"]
]

// --- hwMplsTpOamFarDualLossSD1Recovery (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.235.1.5.18
// Fields: hwMplsTpOamMegId, hwMplsTpOamMeType, hwMplsTpOamMeDirection, hwMplsTpOamMeIfName, hwMplsTpOamMePeerip, hwMplsTpOamMeVcId, hwMplsTpOamMeVcType, hwMplsTpOamMeVllRemotePeerIp, hwMplsTpOamMEVllTTL, hwMplsTpOamMeMepId, hwMplsTpOamMeRemoteMepId, hwMplsTpOamDualLossLossRatio, hwMplsTpOamDualLossSD1Threshold, hwMplsTpOamMeLspName, hwMplsTpOamMeVsiName
// Description: This object indicates that the link recovers from a packet lost exceed signal degrade threshold defect from the remote link.
trapMap["1.3.6.1.4.1.2011.5.25.235.1.5.18"] = [
    name: "hwMplsTpOamFarDualLossSD1Recovery",
    fields: ["hwMplsTpOamMegId", "hwMplsTpOamMeType", "hwMplsTpOamMeDirection", "hwMplsTpOamMeIfName", "hwMplsTpOamMePeerip", "hwMplsTpOamMeVcId", "hwMplsTpOamMeVcType", "hwMplsTpOamMeVllRemotePeerIp", "hwMplsTpOamMEVllTTL", "hwMplsTpOamMeMepId", "hwMplsTpOamMeRemoteMepId", "hwMplsTpOamDualLossLossRatio", "hwMplsTpOamDualLossSD1Threshold", "hwMplsTpOamMeLspName", "hwMplsTpOamMeVsiName"],
    fieldOids: ["hwMplsTpOamMegId": "1.3.6.1.4.1.2011.5.25.235.1.1.1.1.1", "hwMplsTpOamMeType": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.2", "hwMplsTpOamMeDirection": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.3", "hwMplsTpOamMeIfName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.4", "hwMplsTpOamMePeerip": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.5", "hwMplsTpOamMeVcId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.6", "hwMplsTpOamMeVcType": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.7", "hwMplsTpOamMeVllRemotePeerIp": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.8", "hwMplsTpOamMEVllTTL": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.9", "hwMplsTpOamMeMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.10", "hwMplsTpOamMeRemoteMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.11", "hwMplsTpOamDualLossLossRatio": "1.3.6.1.4.1.2011.5.25.235.1.4", "hwMplsTpOamDualLossSD1Threshold": "1.3.6.1.4.1.2011.5.25.235.1.1.1.1.13", "hwMplsTpOamMeLspName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.13", "hwMplsTpOamMeVsiName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.14"]
]

// --- hwMplsTpOamNearDualLossSD2 (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.235.1.5.19
// Fields: hwMplsTpOamMegId, hwMplsTpOamMeType, hwMplsTpOamMeDirection, hwMplsTpOamMeIfName, hwMplsTpOamMePeerip, hwMplsTpOamMeVcId, hwMplsTpOamMeVcType, hwMplsTpOamMeVllRemotePeerIp, hwMplsTpOamMEVllTTL, hwMplsTpOamMeMepId, hwMplsTpOamMeRemoteMepId, hwMplsTpOamDualLossLossRatio, hwMplsTpOamDualLossSD2Threshold, hwMplsTpOamMeLspName, hwMplsTpOamMeVsiName
// Description: This object indicates the link receivs a packet lost exceed signal degrade threshold defect.
trapMap["1.3.6.1.4.1.2011.5.25.235.1.5.19"] = [
    name: "hwMplsTpOamNearDualLossSD2",
    fields: ["hwMplsTpOamMegId", "hwMplsTpOamMeType", "hwMplsTpOamMeDirection", "hwMplsTpOamMeIfName", "hwMplsTpOamMePeerip", "hwMplsTpOamMeVcId", "hwMplsTpOamMeVcType", "hwMplsTpOamMeVllRemotePeerIp", "hwMplsTpOamMEVllTTL", "hwMplsTpOamMeMepId", "hwMplsTpOamMeRemoteMepId", "hwMplsTpOamDualLossLossRatio", "hwMplsTpOamDualLossSD2Threshold", "hwMplsTpOamMeLspName", "hwMplsTpOamMeVsiName"],
    fieldOids: ["hwMplsTpOamMegId": "1.3.6.1.4.1.2011.5.25.235.1.1.1.1.1", "hwMplsTpOamMeType": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.2", "hwMplsTpOamMeDirection": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.3", "hwMplsTpOamMeIfName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.4", "hwMplsTpOamMePeerip": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.5", "hwMplsTpOamMeVcId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.6", "hwMplsTpOamMeVcType": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.7", "hwMplsTpOamMeVllRemotePeerIp": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.8", "hwMplsTpOamMEVllTTL": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.9", "hwMplsTpOamMeMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.10", "hwMplsTpOamMeRemoteMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.11", "hwMplsTpOamDualLossLossRatio": "1.3.6.1.4.1.2011.5.25.235.1.4", "hwMplsTpOamDualLossSD2Threshold": "1.3.6.1.4.1.2011.5.25.235.1.1.1.1.14", "hwMplsTpOamMeLspName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.13", "hwMplsTpOamMeVsiName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.14"]
]

// --- hwMplsTpOamNearDualLossSD2Recovery (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.235.1.5.20
// Fields: hwMplsTpOamMegId, hwMplsTpOamMeType, hwMplsTpOamMeDirection, hwMplsTpOamMeIfName, hwMplsTpOamMePeerip, hwMplsTpOamMeVcId, hwMplsTpOamMeVcType, hwMplsTpOamMeVllRemotePeerIp, hwMplsTpOamMEVllTTL, hwMplsTpOamMeMepId, hwMplsTpOamMeRemoteMepId, hwMplsTpOamDualLossLossRatio, hwMplsTpOamDualLossSD2Threshold, hwMplsTpOamMeLspName, hwMplsTpOamMeVsiName
// Description: This object indicates that the link recovers from a packet lost exceed signal degrade threshold.
trapMap["1.3.6.1.4.1.2011.5.25.235.1.5.20"] = [
    name: "hwMplsTpOamNearDualLossSD2Recovery",
    fields: ["hwMplsTpOamMegId", "hwMplsTpOamMeType", "hwMplsTpOamMeDirection", "hwMplsTpOamMeIfName", "hwMplsTpOamMePeerip", "hwMplsTpOamMeVcId", "hwMplsTpOamMeVcType", "hwMplsTpOamMeVllRemotePeerIp", "hwMplsTpOamMEVllTTL", "hwMplsTpOamMeMepId", "hwMplsTpOamMeRemoteMepId", "hwMplsTpOamDualLossLossRatio", "hwMplsTpOamDualLossSD2Threshold", "hwMplsTpOamMeLspName", "hwMplsTpOamMeVsiName"],
    fieldOids: ["hwMplsTpOamMegId": "1.3.6.1.4.1.2011.5.25.235.1.1.1.1.1", "hwMplsTpOamMeType": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.2", "hwMplsTpOamMeDirection": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.3", "hwMplsTpOamMeIfName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.4", "hwMplsTpOamMePeerip": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.5", "hwMplsTpOamMeVcId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.6", "hwMplsTpOamMeVcType": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.7", "hwMplsTpOamMeVllRemotePeerIp": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.8", "hwMplsTpOamMEVllTTL": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.9", "hwMplsTpOamMeMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.10", "hwMplsTpOamMeRemoteMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.11", "hwMplsTpOamDualLossLossRatio": "1.3.6.1.4.1.2011.5.25.235.1.4", "hwMplsTpOamDualLossSD2Threshold": "1.3.6.1.4.1.2011.5.25.235.1.1.1.1.14", "hwMplsTpOamMeLspName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.13", "hwMplsTpOamMeVsiName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.14"]
]

// --- hwMplsTpOamFarDualLossSD2 (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.235.1.5.21
// Fields: hwMplsTpOamMegId, hwMplsTpOamMeType, hwMplsTpOamMeDirection, hwMplsTpOamMeIfName, hwMplsTpOamMePeerip, hwMplsTpOamMeVcId, hwMplsTpOamMeVcType, hwMplsTpOamMeVllRemotePeerIp, hwMplsTpOamMEVllTTL, hwMplsTpOamMeMepId, hwMplsTpOamMeRemoteMepId, hwMplsTpOamDualLossLossRatio, hwMplsTpOamDualLossSD2Threshold, hwMplsTpOamMeLspName, hwMplsTpOamMeVsiName
// Description: This object indicates the link receivs a packet lost exceed signal degrade threshold defect from the remote link.
trapMap["1.3.6.1.4.1.2011.5.25.235.1.5.21"] = [
    name: "hwMplsTpOamFarDualLossSD2",
    fields: ["hwMplsTpOamMegId", "hwMplsTpOamMeType", "hwMplsTpOamMeDirection", "hwMplsTpOamMeIfName", "hwMplsTpOamMePeerip", "hwMplsTpOamMeVcId", "hwMplsTpOamMeVcType", "hwMplsTpOamMeVllRemotePeerIp", "hwMplsTpOamMEVllTTL", "hwMplsTpOamMeMepId", "hwMplsTpOamMeRemoteMepId", "hwMplsTpOamDualLossLossRatio", "hwMplsTpOamDualLossSD2Threshold", "hwMplsTpOamMeLspName", "hwMplsTpOamMeVsiName"],
    fieldOids: ["hwMplsTpOamMegId": "1.3.6.1.4.1.2011.5.25.235.1.1.1.1.1", "hwMplsTpOamMeType": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.2", "hwMplsTpOamMeDirection": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.3", "hwMplsTpOamMeIfName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.4", "hwMplsTpOamMePeerip": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.5", "hwMplsTpOamMeVcId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.6", "hwMplsTpOamMeVcType": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.7", "hwMplsTpOamMeVllRemotePeerIp": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.8", "hwMplsTpOamMEVllTTL": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.9", "hwMplsTpOamMeMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.10", "hwMplsTpOamMeRemoteMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.11", "hwMplsTpOamDualLossLossRatio": "1.3.6.1.4.1.2011.5.25.235.1.4", "hwMplsTpOamDualLossSD2Threshold": "1.3.6.1.4.1.2011.5.25.235.1.1.1.1.14", "hwMplsTpOamMeLspName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.13", "hwMplsTpOamMeVsiName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.14"]
]

// --- hwMplsTpOamFarDualLossSD2Recovery (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.235.1.5.22
// Fields: hwMplsTpOamMegId, hwMplsTpOamMeType, hwMplsTpOamMeDirection, hwMplsTpOamMeIfName, hwMplsTpOamMePeerip, hwMplsTpOamMeVcId, hwMplsTpOamMeVcType, hwMplsTpOamMeVllRemotePeerIp, hwMplsTpOamMEVllTTL, hwMplsTpOamMeMepId, hwMplsTpOamMeRemoteMepId, hwMplsTpOamDualLossLossRatio, hwMplsTpOamDualLossSD2Threshold, hwMplsTpOamMeLspName, hwMplsTpOamMeVsiName
// Description: This object indicates that the link recovers from a packet lost exceed signal degrade threshold defect from the remote link.
trapMap["1.3.6.1.4.1.2011.5.25.235.1.5.22"] = [
    name: "hwMplsTpOamFarDualLossSD2Recovery",
    fields: ["hwMplsTpOamMegId", "hwMplsTpOamMeType", "hwMplsTpOamMeDirection", "hwMplsTpOamMeIfName", "hwMplsTpOamMePeerip", "hwMplsTpOamMeVcId", "hwMplsTpOamMeVcType", "hwMplsTpOamMeVllRemotePeerIp", "hwMplsTpOamMEVllTTL", "hwMplsTpOamMeMepId", "hwMplsTpOamMeRemoteMepId", "hwMplsTpOamDualLossLossRatio", "hwMplsTpOamDualLossSD2Threshold", "hwMplsTpOamMeLspName", "hwMplsTpOamMeVsiName"],
    fieldOids: ["hwMplsTpOamMegId": "1.3.6.1.4.1.2011.5.25.235.1.1.1.1.1", "hwMplsTpOamMeType": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.2", "hwMplsTpOamMeDirection": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.3", "hwMplsTpOamMeIfName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.4", "hwMplsTpOamMePeerip": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.5", "hwMplsTpOamMeVcId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.6", "hwMplsTpOamMeVcType": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.7", "hwMplsTpOamMeVllRemotePeerIp": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.8", "hwMplsTpOamMEVllTTL": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.9", "hwMplsTpOamMeMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.10", "hwMplsTpOamMeRemoteMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.11", "hwMplsTpOamDualLossLossRatio": "1.3.6.1.4.1.2011.5.25.235.1.4", "hwMplsTpOamDualLossSD2Threshold": "1.3.6.1.4.1.2011.5.25.235.1.1.1.1.14", "hwMplsTpOamMeLspName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.13", "hwMplsTpOamMeVsiName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.14"]
]

// --- hwMplsTpOamLCK (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.235.1.5.23
// Fields: hwMplsTpOamMegId, hwMplsTpOamMeType, hwMplsTpOamMeDirection, hwMplsTpOamMeIfName, hwMplsTpOamMePeerip, hwMplsTpOamMeVcId, hwMplsTpOamMeVcType, hwMplsTpOamMeVllRemotePeerIp, hwMplsTpOamMEVllTTL, hwMplsTpOamMeMepId, hwMplsTpOamMeRemoteMepId, hwMplsTpOamMeLspName, hwMplsTpOamMeVsiName
// Description: This object indicates that the client level detected lock signal from the service level.
trapMap["1.3.6.1.4.1.2011.5.25.235.1.5.23"] = [
    name: "hwMplsTpOamLCK",
    fields: ["hwMplsTpOamMegId", "hwMplsTpOamMeType", "hwMplsTpOamMeDirection", "hwMplsTpOamMeIfName", "hwMplsTpOamMePeerip", "hwMplsTpOamMeVcId", "hwMplsTpOamMeVcType", "hwMplsTpOamMeVllRemotePeerIp", "hwMplsTpOamMEVllTTL", "hwMplsTpOamMeMepId", "hwMplsTpOamMeRemoteMepId", "hwMplsTpOamMeLspName", "hwMplsTpOamMeVsiName"],
    fieldOids: ["hwMplsTpOamMegId": "1.3.6.1.4.1.2011.5.25.235.1.1.1.1.1", "hwMplsTpOamMeType": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.2", "hwMplsTpOamMeDirection": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.3", "hwMplsTpOamMeIfName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.4", "hwMplsTpOamMePeerip": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.5", "hwMplsTpOamMeVcId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.6", "hwMplsTpOamMeVcType": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.7", "hwMplsTpOamMeVllRemotePeerIp": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.8", "hwMplsTpOamMEVllTTL": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.9", "hwMplsTpOamMeMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.10", "hwMplsTpOamMeRemoteMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.11", "hwMplsTpOamMeLspName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.13", "hwMplsTpOamMeVsiName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.14"]
]

// --- hwMplsTpOamLCKRecovery (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.235.1.5.24
// Fields: hwMplsTpOamMegId, hwMplsTpOamMeType, hwMplsTpOamMeDirection, hwMplsTpOamMeIfName, hwMplsTpOamMePeerip, hwMplsTpOamMeVcId, hwMplsTpOamMeVcType, hwMplsTpOamMeVllRemotePeerIp, hwMplsTpOamMEVllTTL, hwMplsTpOamMeMepId, hwMplsTpOamMeRemoteMepId, hwMplsTpOamMeLspName, hwMplsTpOamMeVsiName
// Description: This object indicates that the client level can not detect lock signal from the service level.
trapMap["1.3.6.1.4.1.2011.5.25.235.1.5.24"] = [
    name: "hwMplsTpOamLCKRecovery",
    fields: ["hwMplsTpOamMegId", "hwMplsTpOamMeType", "hwMplsTpOamMeDirection", "hwMplsTpOamMeIfName", "hwMplsTpOamMePeerip", "hwMplsTpOamMeVcId", "hwMplsTpOamMeVcType", "hwMplsTpOamMeVllRemotePeerIp", "hwMplsTpOamMEVllTTL", "hwMplsTpOamMeMepId", "hwMplsTpOamMeRemoteMepId", "hwMplsTpOamMeLspName", "hwMplsTpOamMeVsiName"],
    fieldOids: ["hwMplsTpOamMegId": "1.3.6.1.4.1.2011.5.25.235.1.1.1.1.1", "hwMplsTpOamMeType": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.2", "hwMplsTpOamMeDirection": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.3", "hwMplsTpOamMeIfName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.4", "hwMplsTpOamMePeerip": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.5", "hwMplsTpOamMeVcId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.6", "hwMplsTpOamMeVcType": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.7", "hwMplsTpOamMeVllRemotePeerIp": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.8", "hwMplsTpOamMEVllTTL": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.9", "hwMplsTpOamMeMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.10", "hwMplsTpOamMeRemoteMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.11", "hwMplsTpOamMeLspName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.13", "hwMplsTpOamMeVsiName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.14"]
]

// --- hwMplsTpOamCSF (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.235.1.5.25
// Fields: hwMplsTpOamMegId, hwMplsTpOamMeType, hwMplsTpOamMeDirection, hwMplsTpOamMeIfName, hwMplsTpOamMePeerip, hwMplsTpOamMeVcId, hwMplsTpOamMeVcType, hwMplsTpOamMeVllRemotePeerIp, hwMplsTpOamMEVllTTL, hwMplsTpOamMeMepId, hwMplsTpOamMeRemoteMepId, hwMplsTpOamMeLspName, hwMplsTpOamMeVsiName
// Description: This object is used to indicates client failed signal degrade in the AC.
trapMap["1.3.6.1.4.1.2011.5.25.235.1.5.25"] = [
    name: "hwMplsTpOamCSF",
    fields: ["hwMplsTpOamMegId", "hwMplsTpOamMeType", "hwMplsTpOamMeDirection", "hwMplsTpOamMeIfName", "hwMplsTpOamMePeerip", "hwMplsTpOamMeVcId", "hwMplsTpOamMeVcType", "hwMplsTpOamMeVllRemotePeerIp", "hwMplsTpOamMEVllTTL", "hwMplsTpOamMeMepId", "hwMplsTpOamMeRemoteMepId", "hwMplsTpOamMeLspName", "hwMplsTpOamMeVsiName"],
    fieldOids: ["hwMplsTpOamMegId": "1.3.6.1.4.1.2011.5.25.235.1.1.1.1.1", "hwMplsTpOamMeType": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.2", "hwMplsTpOamMeDirection": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.3", "hwMplsTpOamMeIfName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.4", "hwMplsTpOamMePeerip": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.5", "hwMplsTpOamMeVcId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.6", "hwMplsTpOamMeVcType": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.7", "hwMplsTpOamMeVllRemotePeerIp": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.8", "hwMplsTpOamMEVllTTL": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.9", "hwMplsTpOamMeMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.10", "hwMplsTpOamMeRemoteMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.11", "hwMplsTpOamMeLspName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.13", "hwMplsTpOamMeVsiName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.14"]
]

// --- hwMplsTpOamCSFRecovery (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.235.1.5.26
// Fields: hwMplsTpOamMegId, hwMplsTpOamMeType, hwMplsTpOamMeDirection, hwMplsTpOamMeIfName, hwMplsTpOamMePeerip, hwMplsTpOamMeVcId, hwMplsTpOamMeVcType, hwMplsTpOamMeVllRemotePeerIp, hwMplsTpOamMEVllTTL, hwMplsTpOamMeMepId, hwMplsTpOamMeRemoteMepId, hwMplsTpOamMeLspName, hwMplsTpOamMeVsiName
// Description: This object indicates that the link recovers from a client failed signal in the AC.
trapMap["1.3.6.1.4.1.2011.5.25.235.1.5.26"] = [
    name: "hwMplsTpOamCSFRecovery",
    fields: ["hwMplsTpOamMegId", "hwMplsTpOamMeType", "hwMplsTpOamMeDirection", "hwMplsTpOamMeIfName", "hwMplsTpOamMePeerip", "hwMplsTpOamMeVcId", "hwMplsTpOamMeVcType", "hwMplsTpOamMeVllRemotePeerIp", "hwMplsTpOamMEVllTTL", "hwMplsTpOamMeMepId", "hwMplsTpOamMeRemoteMepId", "hwMplsTpOamMeLspName", "hwMplsTpOamMeVsiName"],
    fieldOids: ["hwMplsTpOamMegId": "1.3.6.1.4.1.2011.5.25.235.1.1.1.1.1", "hwMplsTpOamMeType": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.2", "hwMplsTpOamMeDirection": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.3", "hwMplsTpOamMeIfName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.4", "hwMplsTpOamMePeerip": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.5", "hwMplsTpOamMeVcId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.6", "hwMplsTpOamMeVcType": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.7", "hwMplsTpOamMeVllRemotePeerIp": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.8", "hwMplsTpOamMEVllTTL": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.9", "hwMplsTpOamMeMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.10", "hwMplsTpOamMeRemoteMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.11", "hwMplsTpOamMeLspName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.13", "hwMplsTpOamMeVsiName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.14"]
]

// --- hwMplsTpOamUnExpectMegLevel (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.235.1.5.27
// Fields: hwMplsTpOamMegId, hwMplsTpOamMeType, hwMplsTpOamMeDirection, hwMplsTpOamMeIfName, hwMplsTpOamMePeerip, hwMplsTpOamMeVcId, hwMplsTpOamMeVcType, hwMplsTpOamMeVllRemotePeerIp, hwMplsTpOamMEVllTTL, hwMplsTpOamMeMepId, hwMplsTpOamMeRemoteMepId, hwMplsTpOamMeLspName, hwMplsTpOamMeVsiName
// Description: This object is used to indicates receiving an unexpect MEG-LEVEL defect of the link.
trapMap["1.3.6.1.4.1.2011.5.25.235.1.5.27"] = [
    name: "hwMplsTpOamUnExpectMegLevel",
    fields: ["hwMplsTpOamMegId", "hwMplsTpOamMeType", "hwMplsTpOamMeDirection", "hwMplsTpOamMeIfName", "hwMplsTpOamMePeerip", "hwMplsTpOamMeVcId", "hwMplsTpOamMeVcType", "hwMplsTpOamMeVllRemotePeerIp", "hwMplsTpOamMEVllTTL", "hwMplsTpOamMeMepId", "hwMplsTpOamMeRemoteMepId", "hwMplsTpOamMeLspName", "hwMplsTpOamMeVsiName"],
    fieldOids: ["hwMplsTpOamMegId": "1.3.6.1.4.1.2011.5.25.235.1.1.1.1.1", "hwMplsTpOamMeType": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.2", "hwMplsTpOamMeDirection": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.3", "hwMplsTpOamMeIfName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.4", "hwMplsTpOamMePeerip": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.5", "hwMplsTpOamMeVcId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.6", "hwMplsTpOamMeVcType": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.7", "hwMplsTpOamMeVllRemotePeerIp": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.8", "hwMplsTpOamMEVllTTL": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.9", "hwMplsTpOamMeMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.10", "hwMplsTpOamMeRemoteMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.11", "hwMplsTpOamMeLspName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.13", "hwMplsTpOamMeVsiName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.14"]
]

// --- hwMplsTpOamUnExpectMegLevelRecovery (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.235.1.5.28
// Fields: hwMplsTpOamMegId, hwMplsTpOamMeType, hwMplsTpOamMeDirection, hwMplsTpOamMeIfName, hwMplsTpOamMePeerip, hwMplsTpOamMeVcId, hwMplsTpOamMeVcType, hwMplsTpOamMeVllRemotePeerIp, hwMplsTpOamMEVllTTL, hwMplsTpOamMeMepId, hwMplsTpOamMeRemoteMepId, hwMplsTpOamMeLspName, hwMplsTpOamMeVsiName
// Description: This object indicates that the link recovers from an unexpect MEG-LEVEL defect.
trapMap["1.3.6.1.4.1.2011.5.25.235.1.5.28"] = [
    name: "hwMplsTpOamUnExpectMegLevelRecovery",
    fields: ["hwMplsTpOamMegId", "hwMplsTpOamMeType", "hwMplsTpOamMeDirection", "hwMplsTpOamMeIfName", "hwMplsTpOamMePeerip", "hwMplsTpOamMeVcId", "hwMplsTpOamMeVcType", "hwMplsTpOamMeVllRemotePeerIp", "hwMplsTpOamMEVllTTL", "hwMplsTpOamMeMepId", "hwMplsTpOamMeRemoteMepId", "hwMplsTpOamMeLspName", "hwMplsTpOamMeVsiName"],
    fieldOids: ["hwMplsTpOamMegId": "1.3.6.1.4.1.2011.5.25.235.1.1.1.1.1", "hwMplsTpOamMeType": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.2", "hwMplsTpOamMeDirection": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.3", "hwMplsTpOamMeIfName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.4", "hwMplsTpOamMePeerip": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.5", "hwMplsTpOamMeVcId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.6", "hwMplsTpOamMeVcType": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.7", "hwMplsTpOamMeVllRemotePeerIp": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.8", "hwMplsTpOamMEVllTTL": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.9", "hwMplsTpOamMeMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.10", "hwMplsTpOamMeRemoteMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.11", "hwMplsTpOamMeLspName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.13", "hwMplsTpOamMeVsiName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.14"]
]

// --- hwMplsTpOamSectionLossOfConnection (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.235.1.5.29
// Fields: hwMplsTpOamMegId, hwMplsTpOamMeType, hwMplsTpOamMeDirection, hwMplsTpOamMeIfName, hwMplsTpOamMePeerip, hwMplsTpOamMeMepId, hwMplsTpOamMeRemoteMepId
// Description: This object is used to indicates the connectivity fault of the link.
trapMap["1.3.6.1.4.1.2011.5.25.235.1.5.29"] = [
    name: "hwMplsTpOamSectionLossOfConnection",
    fields: ["hwMplsTpOamMegId", "hwMplsTpOamMeType", "hwMplsTpOamMeDirection", "hwMplsTpOamMeIfName", "hwMplsTpOamMePeerip", "hwMplsTpOamMeMepId", "hwMplsTpOamMeRemoteMepId"],
    fieldOids: ["hwMplsTpOamMegId": "1.3.6.1.4.1.2011.5.25.235.1.1.1.1.1", "hwMplsTpOamMeType": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.2", "hwMplsTpOamMeDirection": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.3", "hwMplsTpOamMeIfName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.4", "hwMplsTpOamMePeerip": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.5", "hwMplsTpOamMeMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.10", "hwMplsTpOamMeRemoteMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.11"]
]

// --- hwMplsTpOamSectionLossOfConnectionRecovery (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.235.1.5.30
// Fields: hwMplsTpOamMegId, hwMplsTpOamMeType, hwMplsTpOamMeDirection, hwMplsTpOamMeIfName, hwMplsTpOamMePeerip, hwMplsTpOamMeMepId, hwMplsTpOamMeRemoteMepId
// Description: This object indicates that the link recovers from a connectivity fault.
trapMap["1.3.6.1.4.1.2011.5.25.235.1.5.30"] = [
    name: "hwMplsTpOamSectionLossOfConnectionRecovery",
    fields: ["hwMplsTpOamMegId", "hwMplsTpOamMeType", "hwMplsTpOamMeDirection", "hwMplsTpOamMeIfName", "hwMplsTpOamMePeerip", "hwMplsTpOamMeMepId", "hwMplsTpOamMeRemoteMepId"],
    fieldOids: ["hwMplsTpOamMegId": "1.3.6.1.4.1.2011.5.25.235.1.1.1.1.1", "hwMplsTpOamMeType": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.2", "hwMplsTpOamMeDirection": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.3", "hwMplsTpOamMeIfName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.4", "hwMplsTpOamMePeerip": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.5", "hwMplsTpOamMeMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.10", "hwMplsTpOamMeRemoteMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.11"]
]

// --- hwMplsTpOamSectionRemoteDefectIndication (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.235.1.5.31
// Fields: hwMplsTpOamMegId, hwMplsTpOamMeType, hwMplsTpOamMeDirection, hwMplsTpOamMeIfName, hwMplsTpOamMePeerip, hwMplsTpOamMeMepId, hwMplsTpOamMeRemoteMepId
// Description: This object is used to indicates the remote defect of the link.
trapMap["1.3.6.1.4.1.2011.5.25.235.1.5.31"] = [
    name: "hwMplsTpOamSectionRemoteDefectIndication",
    fields: ["hwMplsTpOamMegId", "hwMplsTpOamMeType", "hwMplsTpOamMeDirection", "hwMplsTpOamMeIfName", "hwMplsTpOamMePeerip", "hwMplsTpOamMeMepId", "hwMplsTpOamMeRemoteMepId"],
    fieldOids: ["hwMplsTpOamMegId": "1.3.6.1.4.1.2011.5.25.235.1.1.1.1.1", "hwMplsTpOamMeType": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.2", "hwMplsTpOamMeDirection": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.3", "hwMplsTpOamMeIfName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.4", "hwMplsTpOamMePeerip": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.5", "hwMplsTpOamMeMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.10", "hwMplsTpOamMeRemoteMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.11"]
]

// --- hwMplsTpOamSectionRemoteDefectIndicationRecovery (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.235.1.5.32
// Fields: hwMplsTpOamMegId, hwMplsTpOamMeType, hwMplsTpOamMeDirection, hwMplsTpOamMeIfName, hwMplsTpOamMePeerip, hwMplsTpOamMeMepId, hwMplsTpOamMeRemoteMepId
// Description: This object indicates that the link recovers from a remote defect.
trapMap["1.3.6.1.4.1.2011.5.25.235.1.5.32"] = [
    name: "hwMplsTpOamSectionRemoteDefectIndicationRecovery",
    fields: ["hwMplsTpOamMegId", "hwMplsTpOamMeType", "hwMplsTpOamMeDirection", "hwMplsTpOamMeIfName", "hwMplsTpOamMePeerip", "hwMplsTpOamMeMepId", "hwMplsTpOamMeRemoteMepId"],
    fieldOids: ["hwMplsTpOamMegId": "1.3.6.1.4.1.2011.5.25.235.1.1.1.1.1", "hwMplsTpOamMeType": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.2", "hwMplsTpOamMeDirection": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.3", "hwMplsTpOamMeIfName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.4", "hwMplsTpOamMePeerip": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.5", "hwMplsTpOamMeMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.10", "hwMplsTpOamMeRemoteMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.11"]
]

// --- hwMplsTpOamSectionUnExpectMeg (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.235.1.5.33
// Fields: hwMplsTpOamMegId, hwMplsTpOamMeType, hwMplsTpOamMeDirection, hwMplsTpOamMeIfName, hwMplsTpOamMePeerip, hwMplsTpOamMeMepId, hwMplsTpOamMeRemoteMepId
// Description: This object is used to indicates receiving an unexpect MEG-ID defect of the link.
trapMap["1.3.6.1.4.1.2011.5.25.235.1.5.33"] = [
    name: "hwMplsTpOamSectionUnExpectMeg",
    fields: ["hwMplsTpOamMegId", "hwMplsTpOamMeType", "hwMplsTpOamMeDirection", "hwMplsTpOamMeIfName", "hwMplsTpOamMePeerip", "hwMplsTpOamMeMepId", "hwMplsTpOamMeRemoteMepId"],
    fieldOids: ["hwMplsTpOamMegId": "1.3.6.1.4.1.2011.5.25.235.1.1.1.1.1", "hwMplsTpOamMeType": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.2", "hwMplsTpOamMeDirection": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.3", "hwMplsTpOamMeIfName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.4", "hwMplsTpOamMePeerip": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.5", "hwMplsTpOamMeMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.10", "hwMplsTpOamMeRemoteMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.11"]
]

// --- hwMplsTpOamSectionUnExpectMegRecovery (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.235.1.5.34
// Fields: hwMplsTpOamMegId, hwMplsTpOamMeType, hwMplsTpOamMeDirection, hwMplsTpOamMeIfName, hwMplsTpOamMePeerip, hwMplsTpOamMeMepId, hwMplsTpOamMeRemoteMepId
// Description: This object indicates that the link recovers from an unexpect MEG-ID defect.
trapMap["1.3.6.1.4.1.2011.5.25.235.1.5.34"] = [
    name: "hwMplsTpOamSectionUnExpectMegRecovery",
    fields: ["hwMplsTpOamMegId", "hwMplsTpOamMeType", "hwMplsTpOamMeDirection", "hwMplsTpOamMeIfName", "hwMplsTpOamMePeerip", "hwMplsTpOamMeMepId", "hwMplsTpOamMeRemoteMepId"],
    fieldOids: ["hwMplsTpOamMegId": "1.3.6.1.4.1.2011.5.25.235.1.1.1.1.1", "hwMplsTpOamMeType": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.2", "hwMplsTpOamMeDirection": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.3", "hwMplsTpOamMeIfName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.4", "hwMplsTpOamMePeerip": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.5", "hwMplsTpOamMeMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.10", "hwMplsTpOamMeRemoteMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.11"]
]

// --- hwMplsTpOamSectionUnExpectMep (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.235.1.5.35
// Fields: hwMplsTpOamMegId, hwMplsTpOamMeType, hwMplsTpOamMeDirection, hwMplsTpOamMeIfName, hwMplsTpOamMePeerip, hwMplsTpOamMeMepId, hwMplsTpOamMeRemoteMepId
// Description: This object is used to indicates receiving an unexpect MEP-ID defect of the link.
trapMap["1.3.6.1.4.1.2011.5.25.235.1.5.35"] = [
    name: "hwMplsTpOamSectionUnExpectMep",
    fields: ["hwMplsTpOamMegId", "hwMplsTpOamMeType", "hwMplsTpOamMeDirection", "hwMplsTpOamMeIfName", "hwMplsTpOamMePeerip", "hwMplsTpOamMeMepId", "hwMplsTpOamMeRemoteMepId"],
    fieldOids: ["hwMplsTpOamMegId": "1.3.6.1.4.1.2011.5.25.235.1.1.1.1.1", "hwMplsTpOamMeType": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.2", "hwMplsTpOamMeDirection": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.3", "hwMplsTpOamMeIfName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.4", "hwMplsTpOamMePeerip": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.5", "hwMplsTpOamMeMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.10", "hwMplsTpOamMeRemoteMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.11"]
]

// --- hwMplsTpOamSectionUnExpectMepRecovery (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.235.1.5.36
// Fields: hwMplsTpOamMegId, hwMplsTpOamMeType, hwMplsTpOamMeDirection, hwMplsTpOamMeIfName, hwMplsTpOamMePeerip, hwMplsTpOamMeMepId, hwMplsTpOamMeRemoteMepId
// Description: This object indicates that the link recovers from an unexpect MEP-ID defect.
trapMap["1.3.6.1.4.1.2011.5.25.235.1.5.36"] = [
    name: "hwMplsTpOamSectionUnExpectMepRecovery",
    fields: ["hwMplsTpOamMegId", "hwMplsTpOamMeType", "hwMplsTpOamMeDirection", "hwMplsTpOamMeIfName", "hwMplsTpOamMePeerip", "hwMplsTpOamMeMepId", "hwMplsTpOamMeRemoteMepId"],
    fieldOids: ["hwMplsTpOamMegId": "1.3.6.1.4.1.2011.5.25.235.1.1.1.1.1", "hwMplsTpOamMeType": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.2", "hwMplsTpOamMeDirection": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.3", "hwMplsTpOamMeIfName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.4", "hwMplsTpOamMePeerip": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.5", "hwMplsTpOamMeMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.10", "hwMplsTpOamMeRemoteMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.11"]
]

// --- hwMplsTpOamSectionUnExpectPeriod (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.235.1.5.37
// Fields: hwMplsTpOamMegId, hwMplsTpOamMeType, hwMplsTpOamMeDirection, hwMplsTpOamMeIfName, hwMplsTpOamMePeerip, hwMplsTpOamMeMepId, hwMplsTpOamMeRemoteMepId
// Description: This object is used to indicates receiving an unexpect period defect of the link.
trapMap["1.3.6.1.4.1.2011.5.25.235.1.5.37"] = [
    name: "hwMplsTpOamSectionUnExpectPeriod",
    fields: ["hwMplsTpOamMegId", "hwMplsTpOamMeType", "hwMplsTpOamMeDirection", "hwMplsTpOamMeIfName", "hwMplsTpOamMePeerip", "hwMplsTpOamMeMepId", "hwMplsTpOamMeRemoteMepId"],
    fieldOids: ["hwMplsTpOamMegId": "1.3.6.1.4.1.2011.5.25.235.1.1.1.1.1", "hwMplsTpOamMeType": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.2", "hwMplsTpOamMeDirection": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.3", "hwMplsTpOamMeIfName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.4", "hwMplsTpOamMePeerip": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.5", "hwMplsTpOamMeMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.10", "hwMplsTpOamMeRemoteMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.11"]
]

// --- hwMplsTpOamSectionUnExpectPeriodRecovery (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.235.1.5.38
// Fields: hwMplsTpOamMegId, hwMplsTpOamMeType, hwMplsTpOamMeDirection, hwMplsTpOamMeIfName, hwMplsTpOamMePeerip, hwMplsTpOamMeMepId, hwMplsTpOamMeRemoteMepId
// Description: This object indicates that the link recovers from an unexpect period defect.
trapMap["1.3.6.1.4.1.2011.5.25.235.1.5.38"] = [
    name: "hwMplsTpOamSectionUnExpectPeriodRecovery",
    fields: ["hwMplsTpOamMegId", "hwMplsTpOamMeType", "hwMplsTpOamMeDirection", "hwMplsTpOamMeIfName", "hwMplsTpOamMePeerip", "hwMplsTpOamMeMepId", "hwMplsTpOamMeRemoteMepId"],
    fieldOids: ["hwMplsTpOamMegId": "1.3.6.1.4.1.2011.5.25.235.1.1.1.1.1", "hwMplsTpOamMeType": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.2", "hwMplsTpOamMeDirection": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.3", "hwMplsTpOamMeIfName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.4", "hwMplsTpOamMePeerip": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.5", "hwMplsTpOamMeMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.10", "hwMplsTpOamMeRemoteMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.11"]
]

// --- hwMplsTpOamSectionUnExpectPhb (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.235.1.5.39
// Fields: hwMplsTpOamMegId, hwMplsTpOamMeType, hwMplsTpOamMeDirection, hwMplsTpOamMeIfName, hwMplsTpOamMePeerip, hwMplsTpOamMeMepId, hwMplsTpOamMeRemoteMepId
// Description: This object is used to indicates receiving an unexpect PHB defect of the link.
trapMap["1.3.6.1.4.1.2011.5.25.235.1.5.39"] = [
    name: "hwMplsTpOamSectionUnExpectPhb",
    fields: ["hwMplsTpOamMegId", "hwMplsTpOamMeType", "hwMplsTpOamMeDirection", "hwMplsTpOamMeIfName", "hwMplsTpOamMePeerip", "hwMplsTpOamMeMepId", "hwMplsTpOamMeRemoteMepId"],
    fieldOids: ["hwMplsTpOamMegId": "1.3.6.1.4.1.2011.5.25.235.1.1.1.1.1", "hwMplsTpOamMeType": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.2", "hwMplsTpOamMeDirection": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.3", "hwMplsTpOamMeIfName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.4", "hwMplsTpOamMePeerip": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.5", "hwMplsTpOamMeMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.10", "hwMplsTpOamMeRemoteMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.11"]
]

// --- hwMplsTpOamSectionUnExpectPhbRecovery (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.235.1.5.40
// Fields: hwMplsTpOamMegId, hwMplsTpOamMeType, hwMplsTpOamMeDirection, hwMplsTpOamMeIfName, hwMplsTpOamMePeerip, hwMplsTpOamMeMepId, hwMplsTpOamMeRemoteMepId
// Description: This object indicates that the link recovers from an unexpect PHB defect.
trapMap["1.3.6.1.4.1.2011.5.25.235.1.5.40"] = [
    name: "hwMplsTpOamSectionUnExpectPhbRecovery",
    fields: ["hwMplsTpOamMegId", "hwMplsTpOamMeType", "hwMplsTpOamMeDirection", "hwMplsTpOamMeIfName", "hwMplsTpOamMePeerip", "hwMplsTpOamMeMepId", "hwMplsTpOamMeRemoteMepId"],
    fieldOids: ["hwMplsTpOamMegId": "1.3.6.1.4.1.2011.5.25.235.1.1.1.1.1", "hwMplsTpOamMeType": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.2", "hwMplsTpOamMeDirection": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.3", "hwMplsTpOamMeIfName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.4", "hwMplsTpOamMePeerip": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.5", "hwMplsTpOamMeMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.10", "hwMplsTpOamMeRemoteMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.11"]
]

// --- hwMplsTpOamSectionNearDualLossSD1 (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.235.1.5.41
// Fields: hwMplsTpOamMegId, hwMplsTpOamMeType, hwMplsTpOamMeDirection, hwMplsTpOamMeIfName, hwMplsTpOamMePeerip, hwMplsTpOamMeMepId, hwMplsTpOamMeRemoteMepId, hwMplsTpOamDualLossLossRatio, hwMplsTpOamDualLossSD1Threshold
// Description: This object is used to indicates packet lost exceed signal degrade threshold in the local link.
trapMap["1.3.6.1.4.1.2011.5.25.235.1.5.41"] = [
    name: "hwMplsTpOamSectionNearDualLossSD1",
    fields: ["hwMplsTpOamMegId", "hwMplsTpOamMeType", "hwMplsTpOamMeDirection", "hwMplsTpOamMeIfName", "hwMplsTpOamMePeerip", "hwMplsTpOamMeMepId", "hwMplsTpOamMeRemoteMepId", "hwMplsTpOamDualLossLossRatio", "hwMplsTpOamDualLossSD1Threshold"],
    fieldOids: ["hwMplsTpOamMegId": "1.3.6.1.4.1.2011.5.25.235.1.1.1.1.1", "hwMplsTpOamMeType": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.2", "hwMplsTpOamMeDirection": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.3", "hwMplsTpOamMeIfName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.4", "hwMplsTpOamMePeerip": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.5", "hwMplsTpOamMeMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.10", "hwMplsTpOamMeRemoteMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.11", "hwMplsTpOamDualLossLossRatio": "1.3.6.1.4.1.2011.5.25.235.1.4", "hwMplsTpOamDualLossSD1Threshold": "1.3.6.1.4.1.2011.5.25.235.1.1.1.1.13"]
]

// --- hwMplsTpOamSectionNearDualLossSD1Recovery (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.235.1.5.42
// Fields: hwMplsTpOamMegId, hwMplsTpOamMeType, hwMplsTpOamMeDirection, hwMplsTpOamMeIfName, hwMplsTpOamMePeerip, hwMplsTpOamMeMepId, hwMplsTpOamMeRemoteMepId, hwMplsTpOamDualLossLossRatio, hwMplsTpOamDualLossSD1Threshold
// Description: This object indicates that the link recovers from a packet lost exceed signal degrade threshold.
trapMap["1.3.6.1.4.1.2011.5.25.235.1.5.42"] = [
    name: "hwMplsTpOamSectionNearDualLossSD1Recovery",
    fields: ["hwMplsTpOamMegId", "hwMplsTpOamMeType", "hwMplsTpOamMeDirection", "hwMplsTpOamMeIfName", "hwMplsTpOamMePeerip", "hwMplsTpOamMeMepId", "hwMplsTpOamMeRemoteMepId", "hwMplsTpOamDualLossLossRatio", "hwMplsTpOamDualLossSD1Threshold"],
    fieldOids: ["hwMplsTpOamMegId": "1.3.6.1.4.1.2011.5.25.235.1.1.1.1.1", "hwMplsTpOamMeType": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.2", "hwMplsTpOamMeDirection": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.3", "hwMplsTpOamMeIfName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.4", "hwMplsTpOamMePeerip": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.5", "hwMplsTpOamMeMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.10", "hwMplsTpOamMeRemoteMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.11", "hwMplsTpOamDualLossLossRatio": "1.3.6.1.4.1.2011.5.25.235.1.4", "hwMplsTpOamDualLossSD1Threshold": "1.3.6.1.4.1.2011.5.25.235.1.1.1.1.13"]
]

// --- hwMplsTpOamSectionFarDualLossSD1 (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.235.1.5.43
// Fields: hwMplsTpOamMegId, hwMplsTpOamMeType, hwMplsTpOamMeDirection, hwMplsTpOamMeIfName, hwMplsTpOamMePeerip, hwMplsTpOamMeMepId, hwMplsTpOamMeRemoteMepId, hwMplsTpOamDualLossLossRatio, hwMplsTpOamDualLossSD1Threshold
// Description: This object is used to indicates packet lost exceed signal degrade threshold in the remote link.
trapMap["1.3.6.1.4.1.2011.5.25.235.1.5.43"] = [
    name: "hwMplsTpOamSectionFarDualLossSD1",
    fields: ["hwMplsTpOamMegId", "hwMplsTpOamMeType", "hwMplsTpOamMeDirection", "hwMplsTpOamMeIfName", "hwMplsTpOamMePeerip", "hwMplsTpOamMeMepId", "hwMplsTpOamMeRemoteMepId", "hwMplsTpOamDualLossLossRatio", "hwMplsTpOamDualLossSD1Threshold"],
    fieldOids: ["hwMplsTpOamMegId": "1.3.6.1.4.1.2011.5.25.235.1.1.1.1.1", "hwMplsTpOamMeType": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.2", "hwMplsTpOamMeDirection": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.3", "hwMplsTpOamMeIfName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.4", "hwMplsTpOamMePeerip": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.5", "hwMplsTpOamMeMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.10", "hwMplsTpOamMeRemoteMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.11", "hwMplsTpOamDualLossLossRatio": "1.3.6.1.4.1.2011.5.25.235.1.4", "hwMplsTpOamDualLossSD1Threshold": "1.3.6.1.4.1.2011.5.25.235.1.1.1.1.13"]
]

// --- hwMplsTpOamSectionFarDualLossSD1Recovery (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.235.1.5.44
// Fields: hwMplsTpOamMegId, hwMplsTpOamMeType, hwMplsTpOamMeDirection, hwMplsTpOamMeIfName, hwMplsTpOamMePeerip, hwMplsTpOamMeMepId, hwMplsTpOamMeRemoteMepId, hwMplsTpOamDualLossLossRatio, hwMplsTpOamDualLossSD1Threshold
// Description: This object indicates that the link recovers from a packet lost exceed signal degrade threshold in the remote link.
trapMap["1.3.6.1.4.1.2011.5.25.235.1.5.44"] = [
    name: "hwMplsTpOamSectionFarDualLossSD1Recovery",
    fields: ["hwMplsTpOamMegId", "hwMplsTpOamMeType", "hwMplsTpOamMeDirection", "hwMplsTpOamMeIfName", "hwMplsTpOamMePeerip", "hwMplsTpOamMeMepId", "hwMplsTpOamMeRemoteMepId", "hwMplsTpOamDualLossLossRatio", "hwMplsTpOamDualLossSD1Threshold"],
    fieldOids: ["hwMplsTpOamMegId": "1.3.6.1.4.1.2011.5.25.235.1.1.1.1.1", "hwMplsTpOamMeType": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.2", "hwMplsTpOamMeDirection": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.3", "hwMplsTpOamMeIfName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.4", "hwMplsTpOamMePeerip": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.5", "hwMplsTpOamMeMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.10", "hwMplsTpOamMeRemoteMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.11", "hwMplsTpOamDualLossLossRatio": "1.3.6.1.4.1.2011.5.25.235.1.4", "hwMplsTpOamDualLossSD1Threshold": "1.3.6.1.4.1.2011.5.25.235.1.1.1.1.13"]
]

// --- hwMplsTpOamSectionNearDualLossSD2 (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.235.1.5.45
// Fields: hwMplsTpOamMegId, hwMplsTpOamMeType, hwMplsTpOamMeDirection, hwMplsTpOamMeIfName, hwMplsTpOamMePeerip, hwMplsTpOamMeMepId, hwMplsTpOamMeRemoteMepId, hwMplsTpOamDualLossLossRatio, hwMplsTpOamDualLossSD2Threshold
// Description: This object is used to indicates packet lost exceed signal degrade threshold in the local link.
trapMap["1.3.6.1.4.1.2011.5.25.235.1.5.45"] = [
    name: "hwMplsTpOamSectionNearDualLossSD2",
    fields: ["hwMplsTpOamMegId", "hwMplsTpOamMeType", "hwMplsTpOamMeDirection", "hwMplsTpOamMeIfName", "hwMplsTpOamMePeerip", "hwMplsTpOamMeMepId", "hwMplsTpOamMeRemoteMepId", "hwMplsTpOamDualLossLossRatio", "hwMplsTpOamDualLossSD2Threshold"],
    fieldOids: ["hwMplsTpOamMegId": "1.3.6.1.4.1.2011.5.25.235.1.1.1.1.1", "hwMplsTpOamMeType": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.2", "hwMplsTpOamMeDirection": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.3", "hwMplsTpOamMeIfName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.4", "hwMplsTpOamMePeerip": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.5", "hwMplsTpOamMeMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.10", "hwMplsTpOamMeRemoteMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.11", "hwMplsTpOamDualLossLossRatio": "1.3.6.1.4.1.2011.5.25.235.1.4", "hwMplsTpOamDualLossSD2Threshold": "1.3.6.1.4.1.2011.5.25.235.1.1.1.1.14"]
]

// --- hwMplsTpOamSectionNearDualLossSD2Recovery (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.235.1.5.46
// Fields: hwMplsTpOamMegId, hwMplsTpOamMeType, hwMplsTpOamMeDirection, hwMplsTpOamMeIfName, hwMplsTpOamMePeerip, hwMplsTpOamMeMepId, hwMplsTpOamMeRemoteMepId, hwMplsTpOamDualLossLossRatio, hwMplsTpOamDualLossSD2Threshold
// Description: This object indicates that the link recovers from a packet lost exceed signal degrade threshold.
trapMap["1.3.6.1.4.1.2011.5.25.235.1.5.46"] = [
    name: "hwMplsTpOamSectionNearDualLossSD2Recovery",
    fields: ["hwMplsTpOamMegId", "hwMplsTpOamMeType", "hwMplsTpOamMeDirection", "hwMplsTpOamMeIfName", "hwMplsTpOamMePeerip", "hwMplsTpOamMeMepId", "hwMplsTpOamMeRemoteMepId", "hwMplsTpOamDualLossLossRatio", "hwMplsTpOamDualLossSD2Threshold"],
    fieldOids: ["hwMplsTpOamMegId": "1.3.6.1.4.1.2011.5.25.235.1.1.1.1.1", "hwMplsTpOamMeType": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.2", "hwMplsTpOamMeDirection": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.3", "hwMplsTpOamMeIfName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.4", "hwMplsTpOamMePeerip": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.5", "hwMplsTpOamMeMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.10", "hwMplsTpOamMeRemoteMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.11", "hwMplsTpOamDualLossLossRatio": "1.3.6.1.4.1.2011.5.25.235.1.4", "hwMplsTpOamDualLossSD2Threshold": "1.3.6.1.4.1.2011.5.25.235.1.1.1.1.14"]
]

// --- hwMplsTpOamSectionFarDualLossSD2 (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.235.1.5.47
// Fields: hwMplsTpOamMegId, hwMplsTpOamMeType, hwMplsTpOamMeDirection, hwMplsTpOamMeIfName, hwMplsTpOamMePeerip, hwMplsTpOamMeMepId, hwMplsTpOamMeRemoteMepId, hwMplsTpOamDualLossLossRatio, hwMplsTpOamDualLossSD2Threshold
// Description: This object is used to indicates packet lost exceed signal degrade threshold in the remote link.
trapMap["1.3.6.1.4.1.2011.5.25.235.1.5.47"] = [
    name: "hwMplsTpOamSectionFarDualLossSD2",
    fields: ["hwMplsTpOamMegId", "hwMplsTpOamMeType", "hwMplsTpOamMeDirection", "hwMplsTpOamMeIfName", "hwMplsTpOamMePeerip", "hwMplsTpOamMeMepId", "hwMplsTpOamMeRemoteMepId", "hwMplsTpOamDualLossLossRatio", "hwMplsTpOamDualLossSD2Threshold"],
    fieldOids: ["hwMplsTpOamMegId": "1.3.6.1.4.1.2011.5.25.235.1.1.1.1.1", "hwMplsTpOamMeType": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.2", "hwMplsTpOamMeDirection": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.3", "hwMplsTpOamMeIfName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.4", "hwMplsTpOamMePeerip": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.5", "hwMplsTpOamMeMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.10", "hwMplsTpOamMeRemoteMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.11", "hwMplsTpOamDualLossLossRatio": "1.3.6.1.4.1.2011.5.25.235.1.4", "hwMplsTpOamDualLossSD2Threshold": "1.3.6.1.4.1.2011.5.25.235.1.1.1.1.14"]
]

// --- hwMplsTpOamSectionFarDualLossSD2Recovery (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.235.1.5.48
// Fields: hwMplsTpOamMegId, hwMplsTpOamMeType, hwMplsTpOamMeDirection, hwMplsTpOamMeIfName, hwMplsTpOamMePeerip, hwMplsTpOamMeMepId, hwMplsTpOamMeRemoteMepId, hwMplsTpOamDualLossLossRatio, hwMplsTpOamDualLossSD2Threshold
// Description: This object indicates that the link recovers from a packet lost exceed signal degrade threshold in the remote link.
trapMap["1.3.6.1.4.1.2011.5.25.235.1.5.48"] = [
    name: "hwMplsTpOamSectionFarDualLossSD2Recovery",
    fields: ["hwMplsTpOamMegId", "hwMplsTpOamMeType", "hwMplsTpOamMeDirection", "hwMplsTpOamMeIfName", "hwMplsTpOamMePeerip", "hwMplsTpOamMeMepId", "hwMplsTpOamMeRemoteMepId", "hwMplsTpOamDualLossLossRatio", "hwMplsTpOamDualLossSD2Threshold"],
    fieldOids: ["hwMplsTpOamMegId": "1.3.6.1.4.1.2011.5.25.235.1.1.1.1.1", "hwMplsTpOamMeType": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.2", "hwMplsTpOamMeDirection": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.3", "hwMplsTpOamMeIfName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.4", "hwMplsTpOamMePeerip": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.5", "hwMplsTpOamMeMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.10", "hwMplsTpOamMeRemoteMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.11", "hwMplsTpOamDualLossLossRatio": "1.3.6.1.4.1.2011.5.25.235.1.4", "hwMplsTpOamDualLossSD2Threshold": "1.3.6.1.4.1.2011.5.25.235.1.1.1.1.14"]
]

// --- hwMplsTpOamSectionLCK (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.235.1.5.49
// Fields: hwMplsTpOamMegId, hwMplsTpOamMeType, hwMplsTpOamMeDirection, hwMplsTpOamMeIfName, hwMplsTpOamMePeerip, hwMplsTpOamMeMepId, hwMplsTpOamMeRemoteMepId
// Description: This object indicates that the link detected lock signal from the service level.
trapMap["1.3.6.1.4.1.2011.5.25.235.1.5.49"] = [
    name: "hwMplsTpOamSectionLCK",
    fields: ["hwMplsTpOamMegId", "hwMplsTpOamMeType", "hwMplsTpOamMeDirection", "hwMplsTpOamMeIfName", "hwMplsTpOamMePeerip", "hwMplsTpOamMeMepId", "hwMplsTpOamMeRemoteMepId"],
    fieldOids: ["hwMplsTpOamMegId": "1.3.6.1.4.1.2011.5.25.235.1.1.1.1.1", "hwMplsTpOamMeType": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.2", "hwMplsTpOamMeDirection": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.3", "hwMplsTpOamMeIfName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.4", "hwMplsTpOamMePeerip": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.5", "hwMplsTpOamMeMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.10", "hwMplsTpOamMeRemoteMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.11"]
]

// --- hwMplsTpOamSectionLCKRecovery (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.235.1.5.50
// Fields: hwMplsTpOamMegId, hwMplsTpOamMeType, hwMplsTpOamMeDirection, hwMplsTpOamMeIfName, hwMplsTpOamMePeerip, hwMplsTpOamMeMepId, hwMplsTpOamMeRemoteMepId
// Description: This object indicates that the link can not detect lock signal from the service level.
trapMap["1.3.6.1.4.1.2011.5.25.235.1.5.50"] = [
    name: "hwMplsTpOamSectionLCKRecovery",
    fields: ["hwMplsTpOamMegId", "hwMplsTpOamMeType", "hwMplsTpOamMeDirection", "hwMplsTpOamMeIfName", "hwMplsTpOamMePeerip", "hwMplsTpOamMeMepId", "hwMplsTpOamMeRemoteMepId"],
    fieldOids: ["hwMplsTpOamMegId": "1.3.6.1.4.1.2011.5.25.235.1.1.1.1.1", "hwMplsTpOamMeType": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.2", "hwMplsTpOamMeDirection": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.3", "hwMplsTpOamMeIfName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.4", "hwMplsTpOamMePeerip": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.5", "hwMplsTpOamMeMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.10", "hwMplsTpOamMeRemoteMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.11"]
]

// --- hwMplsTpOamSectionUnExpectMegLevel (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.235.1.5.51
// Fields: hwMplsTpOamMegId, hwMplsTpOamMeType, hwMplsTpOamMeDirection, hwMplsTpOamMeIfName, hwMplsTpOamMePeerip, hwMplsTpOamMeMepId, hwMplsTpOamMeRemoteMepId
// Description: This object is used to indicates receiving an unexpect MEG-LEVEL defect of the link.
trapMap["1.3.6.1.4.1.2011.5.25.235.1.5.51"] = [
    name: "hwMplsTpOamSectionUnExpectMegLevel",
    fields: ["hwMplsTpOamMegId", "hwMplsTpOamMeType", "hwMplsTpOamMeDirection", "hwMplsTpOamMeIfName", "hwMplsTpOamMePeerip", "hwMplsTpOamMeMepId", "hwMplsTpOamMeRemoteMepId"],
    fieldOids: ["hwMplsTpOamMegId": "1.3.6.1.4.1.2011.5.25.235.1.1.1.1.1", "hwMplsTpOamMeType": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.2", "hwMplsTpOamMeDirection": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.3", "hwMplsTpOamMeIfName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.4", "hwMplsTpOamMePeerip": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.5", "hwMplsTpOamMeMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.10", "hwMplsTpOamMeRemoteMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.11"]
]

// --- hwMplsTpOamSectionUnExpectMegLevelRecovery (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.235.1.5.52
// Fields: hwMplsTpOamMegId, hwMplsTpOamMeType, hwMplsTpOamMeDirection, hwMplsTpOamMeIfName, hwMplsTpOamMePeerip, hwMplsTpOamMeMepId, hwMplsTpOamMeRemoteMepId
// Description: This object indicates that the link recovers from an unexpect MEG-LEVEL defect.
trapMap["1.3.6.1.4.1.2011.5.25.235.1.5.52"] = [
    name: "hwMplsTpOamSectionUnExpectMegLevelRecovery",
    fields: ["hwMplsTpOamMegId", "hwMplsTpOamMeType", "hwMplsTpOamMeDirection", "hwMplsTpOamMeIfName", "hwMplsTpOamMePeerip", "hwMplsTpOamMeMepId", "hwMplsTpOamMeRemoteMepId"],
    fieldOids: ["hwMplsTpOamMegId": "1.3.6.1.4.1.2011.5.25.235.1.1.1.1.1", "hwMplsTpOamMeType": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.2", "hwMplsTpOamMeDirection": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.3", "hwMplsTpOamMeIfName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.4", "hwMplsTpOamMePeerip": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.5", "hwMplsTpOamMeMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.10", "hwMplsTpOamMeRemoteMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.11"]
]

// --- hwMplsTpOamSectionLocalLock (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.235.1.5.53
// Fields: hwMplsTpOamMegId, hwMplsTpOamMeType, hwMplsTpOamMeDirection, hwMplsTpOamMeIfName, hwMplsTpOamMePeerip, hwMplsTpOamMeMepId, hwMplsTpOamMeRemoteMepId
// Description: This object indicates that the link has been locked by user.
trapMap["1.3.6.1.4.1.2011.5.25.235.1.5.53"] = [
    name: "hwMplsTpOamSectionLocalLock",
    fields: ["hwMplsTpOamMegId", "hwMplsTpOamMeType", "hwMplsTpOamMeDirection", "hwMplsTpOamMeIfName", "hwMplsTpOamMePeerip", "hwMplsTpOamMeMepId", "hwMplsTpOamMeRemoteMepId"],
    fieldOids: ["hwMplsTpOamMegId": "1.3.6.1.4.1.2011.5.25.235.1.1.1.1.1", "hwMplsTpOamMeType": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.2", "hwMplsTpOamMeDirection": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.3", "hwMplsTpOamMeIfName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.4", "hwMplsTpOamMePeerip": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.5", "hwMplsTpOamMeMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.10", "hwMplsTpOamMeRemoteMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.11"]
]

// --- hwMplsTpOamSectionLocalLockRecovery (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.235.1.5.54
// Fields: hwMplsTpOamMegId, hwMplsTpOamMeType, hwMplsTpOamMeDirection, hwMplsTpOamMeIfName, hwMplsTpOamMePeerip, hwMplsTpOamMeMepId, hwMplsTpOamMeRemoteMepId
// Description: This object indicates that the user cancelled lock signal of the link.
trapMap["1.3.6.1.4.1.2011.5.25.235.1.5.54"] = [
    name: "hwMplsTpOamSectionLocalLockRecovery",
    fields: ["hwMplsTpOamMegId", "hwMplsTpOamMeType", "hwMplsTpOamMeDirection", "hwMplsTpOamMeIfName", "hwMplsTpOamMePeerip", "hwMplsTpOamMeMepId", "hwMplsTpOamMeRemoteMepId"],
    fieldOids: ["hwMplsTpOamMegId": "1.3.6.1.4.1.2011.5.25.235.1.1.1.1.1", "hwMplsTpOamMeType": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.2", "hwMplsTpOamMeDirection": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.3", "hwMplsTpOamMeIfName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.4", "hwMplsTpOamMePeerip": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.5", "hwMplsTpOamMeMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.10", "hwMplsTpOamMeRemoteMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.11"]
]

// --- hwMplsTpOamLocalLock (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.235.1.5.55
// Fields: hwMplsTpOamMegId, hwMplsTpOamMeType, hwMplsTpOamMeDirection, hwMplsTpOamMeIfName, hwMplsTpOamMePeerip, hwMplsTpOamMeVcId, hwMplsTpOamMeVcType, hwMplsTpOamMeVllRemotePeerIp, hwMplsTpOamMEVllTTL, hwMplsTpOamMeMepId, hwMplsTpOamMeRemoteMepId, hwMplsTpOamMeLspName, hwMplsTpOamMeVsiName
// Description: This object indicates that the service has been locked by user.
trapMap["1.3.6.1.4.1.2011.5.25.235.1.5.55"] = [
    name: "hwMplsTpOamLocalLock",
    fields: ["hwMplsTpOamMegId", "hwMplsTpOamMeType", "hwMplsTpOamMeDirection", "hwMplsTpOamMeIfName", "hwMplsTpOamMePeerip", "hwMplsTpOamMeVcId", "hwMplsTpOamMeVcType", "hwMplsTpOamMeVllRemotePeerIp", "hwMplsTpOamMEVllTTL", "hwMplsTpOamMeMepId", "hwMplsTpOamMeRemoteMepId", "hwMplsTpOamMeLspName", "hwMplsTpOamMeVsiName"],
    fieldOids: ["hwMplsTpOamMegId": "1.3.6.1.4.1.2011.5.25.235.1.1.1.1.1", "hwMplsTpOamMeType": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.2", "hwMplsTpOamMeDirection": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.3", "hwMplsTpOamMeIfName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.4", "hwMplsTpOamMePeerip": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.5", "hwMplsTpOamMeVcId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.6", "hwMplsTpOamMeVcType": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.7", "hwMplsTpOamMeVllRemotePeerIp": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.8", "hwMplsTpOamMEVllTTL": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.9", "hwMplsTpOamMeMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.10", "hwMplsTpOamMeRemoteMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.11", "hwMplsTpOamMeLspName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.13", "hwMplsTpOamMeVsiName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.14"]
]

// --- hwMplsTpOamLocalLockRecovery (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.235.1.5.56
// Fields: hwMplsTpOamMegId, hwMplsTpOamMeType, hwMplsTpOamMeDirection, hwMplsTpOamMeIfName, hwMplsTpOamMePeerip, hwMplsTpOamMeVcId, hwMplsTpOamMeVcType, hwMplsTpOamMeVllRemotePeerIp, hwMplsTpOamMEVllTTL, hwMplsTpOamMeMepId, hwMplsTpOamMeRemoteMepId, hwMplsTpOamMeLspName, hwMplsTpOamMeVsiName
// Description: This object indicates that the user cancelled lock signal of the service.
trapMap["1.3.6.1.4.1.2011.5.25.235.1.5.56"] = [
    name: "hwMplsTpOamLocalLockRecovery",
    fields: ["hwMplsTpOamMegId", "hwMplsTpOamMeType", "hwMplsTpOamMeDirection", "hwMplsTpOamMeIfName", "hwMplsTpOamMePeerip", "hwMplsTpOamMeVcId", "hwMplsTpOamMeVcType", "hwMplsTpOamMeVllRemotePeerIp", "hwMplsTpOamMEVllTTL", "hwMplsTpOamMeMepId", "hwMplsTpOamMeRemoteMepId", "hwMplsTpOamMeLspName", "hwMplsTpOamMeVsiName"],
    fieldOids: ["hwMplsTpOamMegId": "1.3.6.1.4.1.2011.5.25.235.1.1.1.1.1", "hwMplsTpOamMeType": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.2", "hwMplsTpOamMeDirection": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.3", "hwMplsTpOamMeIfName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.4", "hwMplsTpOamMePeerip": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.5", "hwMplsTpOamMeVcId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.6", "hwMplsTpOamMeVcType": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.7", "hwMplsTpOamMeVllRemotePeerIp": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.8", "hwMplsTpOamMEVllTTL": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.9", "hwMplsTpOamMeMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.10", "hwMplsTpOamMeRemoteMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.11", "hwMplsTpOamMeLspName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.13", "hwMplsTpOamMeVsiName": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.14"]
]

// --- hwMplsTpOamIpMegPingTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.235.1.5.57
// Fields: hwMplsTpOamMegId, hwMplsTpOamMeIndex, hwMplsTpOamMeMepId, hwMplsTpOamIpMegPingNum, hwMplsTpOamIpMegPingSeqNum, hwMplsTpOamIpMegPingMepId, hwMplsTpOamIpMegPingLsrId, hwMplsTpOamIpMegPingTtl, hwMplsTpOamIpMegPingServiceType, hwMplsTpOamIpMegPingIfIndex, hwMplsTpOamIpMegPingVpnName
// Description: This object indicates that the ip-meg ping info.
trapMap["1.3.6.1.4.1.2011.5.25.235.1.5.57"] = [
    name: "hwMplsTpOamIpMegPingTrap",
    fields: ["hwMplsTpOamMegId", "hwMplsTpOamMeIndex", "hwMplsTpOamMeMepId", "hwMplsTpOamIpMegPingNum", "hwMplsTpOamIpMegPingSeqNum", "hwMplsTpOamIpMegPingMepId", "hwMplsTpOamIpMegPingLsrId", "hwMplsTpOamIpMegPingTtl", "hwMplsTpOamIpMegPingServiceType", "hwMplsTpOamIpMegPingIfIndex", "hwMplsTpOamIpMegPingVpnName"],
    fieldOids: ["hwMplsTpOamMegId": "1.3.6.1.4.1.2011.5.25.235.1.1.1.1.1", "hwMplsTpOamMeIndex": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.1", "hwMplsTpOamMeMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.10", "hwMplsTpOamIpMegPingNum": "1.3.6.1.4.1.2011.5.25.235.1.11.1.1.1", "hwMplsTpOamIpMegPingSeqNum": "1.3.6.1.4.1.2011.5.25.235.1.11.1.1.2", "hwMplsTpOamIpMegPingMepId": "1.3.6.1.4.1.2011.5.25.235.1.11.1.1.4", "hwMplsTpOamIpMegPingLsrId": "1.3.6.1.4.1.2011.5.25.235.1.11.1.1.5", "hwMplsTpOamIpMegPingTtl": "1.3.6.1.4.1.2011.5.25.235.1.11.1.1.8", "hwMplsTpOamIpMegPingServiceType": "1.3.6.1.4.1.2011.5.25.235.1.11.1.1.9", "hwMplsTpOamIpMegPingIfIndex": "1.3.6.1.4.1.2011.5.25.235.1.11.1.1.11", "hwMplsTpOamIpMegPingVpnName": "1.3.6.1.4.1.2011.5.25.235.1.11.1.1.12"]
]

// --- hwMplsTpOamIpMegTracertTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.235.1.5.58
// Fields: hwMplsTpOamMegId, hwMplsTpOamMeIndex, hwMplsTpOamMeMepId, hwMplsTpOamIpMegTracertSeqNum, hwMplsTpOamIpMegTracertMepId, hwMplsTpOamIpMegTracertLsrId, hwMplsTpOamIpMegTracertTtl, hwMplsTpOamIpMegTracertServiceType, hwMplsTpOamIpMegTracertIfIndex, hwMplsTpOamIpMegTracertVpnName
// Description: This object indicates that the ip-meg tracert info.
trapMap["1.3.6.1.4.1.2011.5.25.235.1.5.58"] = [
    name: "hwMplsTpOamIpMegTracertTrap",
    fields: ["hwMplsTpOamMegId", "hwMplsTpOamMeIndex", "hwMplsTpOamMeMepId", "hwMplsTpOamIpMegTracertSeqNum", "hwMplsTpOamIpMegTracertMepId", "hwMplsTpOamIpMegTracertLsrId", "hwMplsTpOamIpMegTracertTtl", "hwMplsTpOamIpMegTracertServiceType", "hwMplsTpOamIpMegTracertIfIndex", "hwMplsTpOamIpMegTracertVpnName"],
    fieldOids: ["hwMplsTpOamMegId": "1.3.6.1.4.1.2011.5.25.235.1.1.1.1.1", "hwMplsTpOamMeIndex": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.1", "hwMplsTpOamMeMepId": "1.3.6.1.4.1.2011.5.25.235.1.2.1.1.10", "hwMplsTpOamIpMegTracertSeqNum": "1.3.6.1.4.1.2011.5.25.235.1.11.3.1.1", "hwMplsTpOamIpMegTracertMepId": "1.3.6.1.4.1.2011.5.25.235.1.11.3.1.3", "hwMplsTpOamIpMegTracertLsrId": "1.3.6.1.4.1.2011.5.25.235.1.11.3.1.4", "hwMplsTpOamIpMegTracertTtl": "1.3.6.1.4.1.2011.5.25.235.1.11.3.1.7", "hwMplsTpOamIpMegTracertServiceType": "1.3.6.1.4.1.2011.5.25.235.1.11.3.1.8", "hwMplsTpOamIpMegTracertIfIndex": "1.3.6.1.4.1.2011.5.25.235.1.11.3.1.10", "hwMplsTpOamIpMegTracertVpnName": "1.3.6.1.4.1.2011.5.25.235.1.11.3.1.11"]
]

// ===== Parsing logic =====

// Set to true to enable diagnostic logging for this MIB parser
DEBUG = false

LOG_PREFIX = "[HUAWEI-TPOAM-MIB]"
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
