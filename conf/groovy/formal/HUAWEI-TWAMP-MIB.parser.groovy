/**
 * Auto-generated from HUAWEI-TWAMP-MIB.mib
 * Generated: 2026-08-24T18:28:31.273806800
 * Traps/Notifications (24): hwTwampTwoWayLossRatioExceed, hwTwampTwoWayLossRatioRecovery, hwTwampTwoWayDelayExceed, hwTwampTwoWayDelayRecovery, hwTwampTwoWayJitterExceed, hwTwampTwoWayJitterRecovery, hwTwampTwoWayLocExceed, hwTwampTwoWayLocRecovery, hwTwampSenderSessionNumExceed, hwTwampSenderSessionNumRecovery, hwTwampNotSupportServiceUnderIntf, hwTwampNotSupportServiceUnderIntfRecovery, hwTwampMemTwoWayLossRatioExceed, hwTwampMemTwoWayLossRatioRecovery, hwTwampMemTwoWayDelayExceed, hwTwampMemTwoWayDelayRecovery, hwTwampMemTwoWayJitterExceed, hwTwampMemTwoWayJitterRecovery, hwTwampMemTwoWayLocExceed, hwTwampMemTwoWayLocRecovery, hwTwampResponderSessionNumExceed, hwTwampResponderSessionNumRecovery, hwTwampControlSessionNumExceed, hwTwampControlSessionNumRecovery
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

// --- hwTwampTwoWayLossRatioExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.333.1.4.1
// Fields: hwTwampTwoWayLossRatio, hwTwampTwoWayLossRatioUpperLimitThreshold, hwTwampTwoWayLossRatioLowerLimitThreshold, hwTwampSenderLocalIpAddress, hwTwampSenderRemoteIpAddress, hwTwampSenderLocalUDPPort, hwTwampSenderRemoteUDPPort, hwTwampSenderVrfName
// Description: This object indicates that dual-ended packet loss rate exceeds the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.333.1.4.1"] = [
    name: "hwTwampTwoWayLossRatioExceed",
    fields: ["hwTwampTwoWayLossRatio", "hwTwampTwoWayLossRatioUpperLimitThreshold", "hwTwampTwoWayLossRatioLowerLimitThreshold", "hwTwampSenderLocalIpAddress", "hwTwampSenderRemoteIpAddress", "hwTwampSenderLocalUDPPort", "hwTwampSenderRemoteUDPPort", "hwTwampSenderVrfName"],
    fieldOids: ["hwTwampTwoWayLossRatio": "1.3.6.1.4.1.2011.5.25.333.1.1.10.1.1", "hwTwampTwoWayLossRatioUpperLimitThreshold": "1.3.6.1.4.1.2011.5.25.333.1.1.10.1.2", "hwTwampTwoWayLossRatioLowerLimitThreshold": "1.3.6.1.4.1.2011.5.25.333.1.1.10.1.3", "hwTwampSenderLocalIpAddress": "1.3.6.1.4.1.2011.5.25.333.1.1.3.1.3", "hwTwampSenderRemoteIpAddress": "1.3.6.1.4.1.2011.5.25.333.1.1.3.1.5", "hwTwampSenderLocalUDPPort": "1.3.6.1.4.1.2011.5.25.333.1.1.3.1.6", "hwTwampSenderRemoteUDPPort": "1.3.6.1.4.1.2011.5.25.333.1.1.3.1.7", "hwTwampSenderVrfName": "1.3.6.1.4.1.2011.5.25.333.1.1.3.1.8"]
]

// --- hwTwampTwoWayLossRatioRecovery (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.333.1.4.2
// Fields: hwTwampTwoWayLossRatio, hwTwampTwoWayLossRatioUpperLimitThreshold, hwTwampTwoWayLossRatioLowerLimitThreshold, hwTwampSenderLocalIpAddress, hwTwampSenderRemoteIpAddress, hwTwampSenderLocalUDPPort, hwTwampSenderRemoteUDPPort, hwTwampSenderVrfName
// Description: This object indicates that dual-ended packet loss rate restores.
trapMap["1.3.6.1.4.1.2011.5.25.333.1.4.2"] = [
    name: "hwTwampTwoWayLossRatioRecovery",
    fields: ["hwTwampTwoWayLossRatio", "hwTwampTwoWayLossRatioUpperLimitThreshold", "hwTwampTwoWayLossRatioLowerLimitThreshold", "hwTwampSenderLocalIpAddress", "hwTwampSenderRemoteIpAddress", "hwTwampSenderLocalUDPPort", "hwTwampSenderRemoteUDPPort", "hwTwampSenderVrfName"],
    fieldOids: ["hwTwampTwoWayLossRatio": "1.3.6.1.4.1.2011.5.25.333.1.1.10.1.1", "hwTwampTwoWayLossRatioUpperLimitThreshold": "1.3.6.1.4.1.2011.5.25.333.1.1.10.1.2", "hwTwampTwoWayLossRatioLowerLimitThreshold": "1.3.6.1.4.1.2011.5.25.333.1.1.10.1.3", "hwTwampSenderLocalIpAddress": "1.3.6.1.4.1.2011.5.25.333.1.1.3.1.3", "hwTwampSenderRemoteIpAddress": "1.3.6.1.4.1.2011.5.25.333.1.1.3.1.5", "hwTwampSenderLocalUDPPort": "1.3.6.1.4.1.2011.5.25.333.1.1.3.1.6", "hwTwampSenderRemoteUDPPort": "1.3.6.1.4.1.2011.5.25.333.1.1.3.1.7", "hwTwampSenderVrfName": "1.3.6.1.4.1.2011.5.25.333.1.1.3.1.8"]
]

// --- hwTwampTwoWayDelayExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.333.1.4.3
// Fields: hwTwampTwoWayDelayValue, hwTwampTwoWayDelayValueUpperLimitThreshold, hwTwampTwoWayDelayValueLowerLimitThreshold, hwTwampSenderLocalIpAddress, hwTwampSenderRemoteIpAddress, hwTwampSenderLocalUDPPort, hwTwampSenderRemoteUDPPort, hwTwampSenderVrfName
// Description: This object indicates that dual-ended delay exceeds the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.333.1.4.3"] = [
    name: "hwTwampTwoWayDelayExceed",
    fields: ["hwTwampTwoWayDelayValue", "hwTwampTwoWayDelayValueUpperLimitThreshold", "hwTwampTwoWayDelayValueLowerLimitThreshold", "hwTwampSenderLocalIpAddress", "hwTwampSenderRemoteIpAddress", "hwTwampSenderLocalUDPPort", "hwTwampSenderRemoteUDPPort", "hwTwampSenderVrfName"],
    fieldOids: ["hwTwampTwoWayDelayValue": "1.3.6.1.4.1.2011.5.25.333.1.1.11.1.1", "hwTwampTwoWayDelayValueUpperLimitThreshold": "1.3.6.1.4.1.2011.5.25.333.1.1.11.1.2", "hwTwampTwoWayDelayValueLowerLimitThreshold": "1.3.6.1.4.1.2011.5.25.333.1.1.11.1.3", "hwTwampSenderLocalIpAddress": "1.3.6.1.4.1.2011.5.25.333.1.1.3.1.3", "hwTwampSenderRemoteIpAddress": "1.3.6.1.4.1.2011.5.25.333.1.1.3.1.5", "hwTwampSenderLocalUDPPort": "1.3.6.1.4.1.2011.5.25.333.1.1.3.1.6", "hwTwampSenderRemoteUDPPort": "1.3.6.1.4.1.2011.5.25.333.1.1.3.1.7", "hwTwampSenderVrfName": "1.3.6.1.4.1.2011.5.25.333.1.1.3.1.8"]
]

// --- hwTwampTwoWayDelayRecovery (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.333.1.4.4
// Fields: hwTwampTwoWayDelayValue, hwTwampTwoWayDelayValueUpperLimitThreshold, hwTwampTwoWayDelayValueLowerLimitThreshold, hwTwampSenderLocalIpAddress, hwTwampSenderRemoteIpAddress, hwTwampSenderLocalUDPPort, hwTwampSenderRemoteUDPPort, hwTwampSenderVrfName
// Description: This object indicates that dual-ended delay restores.
trapMap["1.3.6.1.4.1.2011.5.25.333.1.4.4"] = [
    name: "hwTwampTwoWayDelayRecovery",
    fields: ["hwTwampTwoWayDelayValue", "hwTwampTwoWayDelayValueUpperLimitThreshold", "hwTwampTwoWayDelayValueLowerLimitThreshold", "hwTwampSenderLocalIpAddress", "hwTwampSenderRemoteIpAddress", "hwTwampSenderLocalUDPPort", "hwTwampSenderRemoteUDPPort", "hwTwampSenderVrfName"],
    fieldOids: ["hwTwampTwoWayDelayValue": "1.3.6.1.4.1.2011.5.25.333.1.1.11.1.1", "hwTwampTwoWayDelayValueUpperLimitThreshold": "1.3.6.1.4.1.2011.5.25.333.1.1.11.1.2", "hwTwampTwoWayDelayValueLowerLimitThreshold": "1.3.6.1.4.1.2011.5.25.333.1.1.11.1.3", "hwTwampSenderLocalIpAddress": "1.3.6.1.4.1.2011.5.25.333.1.1.3.1.3", "hwTwampSenderRemoteIpAddress": "1.3.6.1.4.1.2011.5.25.333.1.1.3.1.5", "hwTwampSenderLocalUDPPort": "1.3.6.1.4.1.2011.5.25.333.1.1.3.1.6", "hwTwampSenderRemoteUDPPort": "1.3.6.1.4.1.2011.5.25.333.1.1.3.1.7", "hwTwampSenderVrfName": "1.3.6.1.4.1.2011.5.25.333.1.1.3.1.8"]
]

// --- hwTwampTwoWayJitterExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.333.1.4.5
// Fields: hwTwampTwoWayJitterValue, hwTwampTwoWayJitterValueUpperLimitThreshold, hwTwampTwoWayJitterValueLowerLimitThreshold, hwTwampSenderLocalIpAddress, hwTwampSenderRemoteIpAddress, hwTwampSenderLocalUDPPort, hwTwampSenderRemoteUDPPort, hwTwampSenderVrfName
// Description: This object indicates that dual-ended jitter exceeds the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.333.1.4.5"] = [
    name: "hwTwampTwoWayJitterExceed",
    fields: ["hwTwampTwoWayJitterValue", "hwTwampTwoWayJitterValueUpperLimitThreshold", "hwTwampTwoWayJitterValueLowerLimitThreshold", "hwTwampSenderLocalIpAddress", "hwTwampSenderRemoteIpAddress", "hwTwampSenderLocalUDPPort", "hwTwampSenderRemoteUDPPort", "hwTwampSenderVrfName"],
    fieldOids: ["hwTwampTwoWayJitterValue": "1.3.6.1.4.1.2011.5.25.333.1.1.12.1.1", "hwTwampTwoWayJitterValueUpperLimitThreshold": "1.3.6.1.4.1.2011.5.25.333.1.1.12.1.2", "hwTwampTwoWayJitterValueLowerLimitThreshold": "1.3.6.1.4.1.2011.5.25.333.1.1.12.1.3", "hwTwampSenderLocalIpAddress": "1.3.6.1.4.1.2011.5.25.333.1.1.3.1.3", "hwTwampSenderRemoteIpAddress": "1.3.6.1.4.1.2011.5.25.333.1.1.3.1.5", "hwTwampSenderLocalUDPPort": "1.3.6.1.4.1.2011.5.25.333.1.1.3.1.6", "hwTwampSenderRemoteUDPPort": "1.3.6.1.4.1.2011.5.25.333.1.1.3.1.7", "hwTwampSenderVrfName": "1.3.6.1.4.1.2011.5.25.333.1.1.3.1.8"]
]

// --- hwTwampTwoWayJitterRecovery (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.333.1.4.6
// Fields: hwTwampTwoWayJitterValue, hwTwampTwoWayJitterValueUpperLimitThreshold, hwTwampTwoWayJitterValueLowerLimitThreshold, hwTwampSenderLocalIpAddress, hwTwampSenderRemoteIpAddress, hwTwampSenderLocalUDPPort, hwTwampSenderRemoteUDPPort, hwTwampSenderVrfName
// Description: This object indicates that dual-ended jitter restores.
trapMap["1.3.6.1.4.1.2011.5.25.333.1.4.6"] = [
    name: "hwTwampTwoWayJitterRecovery",
    fields: ["hwTwampTwoWayJitterValue", "hwTwampTwoWayJitterValueUpperLimitThreshold", "hwTwampTwoWayJitterValueLowerLimitThreshold", "hwTwampSenderLocalIpAddress", "hwTwampSenderRemoteIpAddress", "hwTwampSenderLocalUDPPort", "hwTwampSenderRemoteUDPPort", "hwTwampSenderVrfName"],
    fieldOids: ["hwTwampTwoWayJitterValue": "1.3.6.1.4.1.2011.5.25.333.1.1.12.1.1", "hwTwampTwoWayJitterValueUpperLimitThreshold": "1.3.6.1.4.1.2011.5.25.333.1.1.12.1.2", "hwTwampTwoWayJitterValueLowerLimitThreshold": "1.3.6.1.4.1.2011.5.25.333.1.1.12.1.3", "hwTwampSenderLocalIpAddress": "1.3.6.1.4.1.2011.5.25.333.1.1.3.1.3", "hwTwampSenderRemoteIpAddress": "1.3.6.1.4.1.2011.5.25.333.1.1.3.1.5", "hwTwampSenderLocalUDPPort": "1.3.6.1.4.1.2011.5.25.333.1.1.3.1.6", "hwTwampSenderRemoteUDPPort": "1.3.6.1.4.1.2011.5.25.333.1.1.3.1.7", "hwTwampSenderVrfName": "1.3.6.1.4.1.2011.5.25.333.1.1.3.1.8"]
]

// --- hwTwampTwoWayLocExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.333.1.4.7
// Fields: hwTwampTwoWayLossRatio, hwTwampSenderLocalIpAddress, hwTwampSenderRemoteIpAddress, hwTwampSenderLocalUDPPort, hwTwampSenderRemoteUDPPort, hwTwampSenderVrfName
// Description: This object indicates that the connection between the two ends fails.
trapMap["1.3.6.1.4.1.2011.5.25.333.1.4.7"] = [
    name: "hwTwampTwoWayLocExceed",
    fields: ["hwTwampTwoWayLossRatio", "hwTwampSenderLocalIpAddress", "hwTwampSenderRemoteIpAddress", "hwTwampSenderLocalUDPPort", "hwTwampSenderRemoteUDPPort", "hwTwampSenderVrfName"],
    fieldOids: ["hwTwampTwoWayLossRatio": "1.3.6.1.4.1.2011.5.25.333.1.1.10.1.1", "hwTwampSenderLocalIpAddress": "1.3.6.1.4.1.2011.5.25.333.1.1.3.1.3", "hwTwampSenderRemoteIpAddress": "1.3.6.1.4.1.2011.5.25.333.1.1.3.1.5", "hwTwampSenderLocalUDPPort": "1.3.6.1.4.1.2011.5.25.333.1.1.3.1.6", "hwTwampSenderRemoteUDPPort": "1.3.6.1.4.1.2011.5.25.333.1.1.3.1.7", "hwTwampSenderVrfName": "1.3.6.1.4.1.2011.5.25.333.1.1.3.1.8"]
]

// --- hwTwampTwoWayLocRecovery (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.333.1.4.8
// Fields: hwTwampTwoWayLossRatio, hwTwampSenderLocalIpAddress, hwTwampSenderRemoteIpAddress, hwTwampSenderLocalUDPPort, hwTwampSenderRemoteUDPPort, hwTwampSenderVrfName
// Description: This object indicates that the connection between the two ends restores.
trapMap["1.3.6.1.4.1.2011.5.25.333.1.4.8"] = [
    name: "hwTwampTwoWayLocRecovery",
    fields: ["hwTwampTwoWayLossRatio", "hwTwampSenderLocalIpAddress", "hwTwampSenderRemoteIpAddress", "hwTwampSenderLocalUDPPort", "hwTwampSenderRemoteUDPPort", "hwTwampSenderVrfName"],
    fieldOids: ["hwTwampTwoWayLossRatio": "1.3.6.1.4.1.2011.5.25.333.1.1.10.1.1", "hwTwampSenderLocalIpAddress": "1.3.6.1.4.1.2011.5.25.333.1.1.3.1.3", "hwTwampSenderRemoteIpAddress": "1.3.6.1.4.1.2011.5.25.333.1.1.3.1.5", "hwTwampSenderLocalUDPPort": "1.3.6.1.4.1.2011.5.25.333.1.1.3.1.6", "hwTwampSenderRemoteUDPPort": "1.3.6.1.4.1.2011.5.25.333.1.1.3.1.7", "hwTwampSenderVrfName": "1.3.6.1.4.1.2011.5.25.333.1.1.3.1.8"]
]

// --- hwTwampSenderSessionNumExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.333.1.4.9
// Description: This object indicates that the number of sessions exceeds the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.333.1.4.9"] = [
    name: "hwTwampSenderSessionNumExceed",
    fields: [],
    fieldOids: []
]

// --- hwTwampSenderSessionNumRecovery (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.333.1.4.10
// Description: This object indicates that the number of sessions restores.
trapMap["1.3.6.1.4.1.2011.5.25.333.1.4.10"] = [
    name: "hwTwampSenderSessionNumRecovery",
    fields: [],
    fieldOids: []
]

// --- hwTwampNotSupportServiceUnderIntf (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.333.1.4.11
// Fields: hwTwampResponderIDWithInterface
// Description: This object indicates that TWAMP does not support services on the bound interface.
trapMap["1.3.6.1.4.1.2011.5.25.333.1.4.11"] = [
    name: "hwTwampNotSupportServiceUnderIntf",
    fields: ["hwTwampResponderIDWithInterface"],
    fieldOids: ["hwTwampResponderIDWithInterface": "1.3.6.1.4.1.2011.5.25.333.1.2.3"]
]

// --- hwTwampNotSupportServiceUnderIntfRecovery (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.333.1.4.12
// Fields: hwTwampResponderIDWithInterface
// Description: This object indicates that TWAMP does not support service alarm clearing on the bound interface.
trapMap["1.3.6.1.4.1.2011.5.25.333.1.4.12"] = [
    name: "hwTwampNotSupportServiceUnderIntfRecovery",
    fields: ["hwTwampResponderIDWithInterface"],
    fieldOids: ["hwTwampResponderIDWithInterface": "1.3.6.1.4.1.2011.5.25.333.1.2.3"]
]

// --- hwTwampMemTwoWayLossRatioExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.333.1.4.13
// Fields: hwTwampSenderMemberName, hwTwampMemTwoWayLossRatio, hwTwampMemTwoWayLossRatioUpperLimitThreshold, hwTwampMemTwoWayLossRatioLowerLimitThreshold, hwTwampSenderLocalIpAddress, hwTwampSenderRemoteIpAddress, hwTwampSenderLocalUDPPort, hwTwampSenderRemoteUDPPort, hwTwampSenderVrfName
// Description: This object indicates that dual-ended packet loss rate exceeds the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.333.1.4.13"] = [
    name: "hwTwampMemTwoWayLossRatioExceed",
    fields: ["hwTwampSenderMemberName", "hwTwampMemTwoWayLossRatio", "hwTwampMemTwoWayLossRatioUpperLimitThreshold", "hwTwampMemTwoWayLossRatioLowerLimitThreshold", "hwTwampSenderLocalIpAddress", "hwTwampSenderRemoteIpAddress", "hwTwampSenderLocalUDPPort", "hwTwampSenderRemoteUDPPort", "hwTwampSenderVrfName"],
    fieldOids: ["hwTwampSenderMemberName": "1.3.6.1.4.1.2011.5.25.333.1.1.15.1.2", "hwTwampMemTwoWayLossRatio": "1.3.6.1.4.1.2011.5.25.333.1.1.15.1.3", "hwTwampMemTwoWayLossRatioUpperLimitThreshold": "1.3.6.1.4.1.2011.5.25.333.1.1.15.1.4", "hwTwampMemTwoWayLossRatioLowerLimitThreshold": "1.3.6.1.4.1.2011.5.25.333.1.1.15.1.5", "hwTwampSenderLocalIpAddress": "1.3.6.1.4.1.2011.5.25.333.1.1.3.1.3", "hwTwampSenderRemoteIpAddress": "1.3.6.1.4.1.2011.5.25.333.1.1.3.1.5", "hwTwampSenderLocalUDPPort": "1.3.6.1.4.1.2011.5.25.333.1.1.3.1.6", "hwTwampSenderRemoteUDPPort": "1.3.6.1.4.1.2011.5.25.333.1.1.3.1.7", "hwTwampSenderVrfName": "1.3.6.1.4.1.2011.5.25.333.1.1.3.1.8"]
]

// --- hwTwampMemTwoWayLossRatioRecovery (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.333.1.4.14
// Fields: hwTwampSenderMemberName, hwTwampMemTwoWayLossRatio, hwTwampMemTwoWayLossRatioUpperLimitThreshold, hwTwampMemTwoWayLossRatioLowerLimitThreshold, hwTwampSenderLocalIpAddress, hwTwampSenderRemoteIpAddress, hwTwampSenderLocalUDPPort, hwTwampSenderRemoteUDPPort, hwTwampSenderVrfName
// Description: This object indicates that dual-ended packet loss rate restores.
trapMap["1.3.6.1.4.1.2011.5.25.333.1.4.14"] = [
    name: "hwTwampMemTwoWayLossRatioRecovery",
    fields: ["hwTwampSenderMemberName", "hwTwampMemTwoWayLossRatio", "hwTwampMemTwoWayLossRatioUpperLimitThreshold", "hwTwampMemTwoWayLossRatioLowerLimitThreshold", "hwTwampSenderLocalIpAddress", "hwTwampSenderRemoteIpAddress", "hwTwampSenderLocalUDPPort", "hwTwampSenderRemoteUDPPort", "hwTwampSenderVrfName"],
    fieldOids: ["hwTwampSenderMemberName": "1.3.6.1.4.1.2011.5.25.333.1.1.15.1.2", "hwTwampMemTwoWayLossRatio": "1.3.6.1.4.1.2011.5.25.333.1.1.15.1.3", "hwTwampMemTwoWayLossRatioUpperLimitThreshold": "1.3.6.1.4.1.2011.5.25.333.1.1.15.1.4", "hwTwampMemTwoWayLossRatioLowerLimitThreshold": "1.3.6.1.4.1.2011.5.25.333.1.1.15.1.5", "hwTwampSenderLocalIpAddress": "1.3.6.1.4.1.2011.5.25.333.1.1.3.1.3", "hwTwampSenderRemoteIpAddress": "1.3.6.1.4.1.2011.5.25.333.1.1.3.1.5", "hwTwampSenderLocalUDPPort": "1.3.6.1.4.1.2011.5.25.333.1.1.3.1.6", "hwTwampSenderRemoteUDPPort": "1.3.6.1.4.1.2011.5.25.333.1.1.3.1.7", "hwTwampSenderVrfName": "1.3.6.1.4.1.2011.5.25.333.1.1.3.1.8"]
]

// --- hwTwampMemTwoWayDelayExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.333.1.4.15
// Fields: hwTwampSenderMemberName, hwTwampMemTwoWayDelayValue, hwTwampMemTwoWayDelayValueUpperLimitThreshold, hwTwampMemTwoWayDelayValueLowerLimitThreshold, hwTwampSenderLocalIpAddress, hwTwampSenderRemoteIpAddress, hwTwampSenderLocalUDPPort, hwTwampSenderRemoteUDPPort, hwTwampSenderVrfName
// Description: This object indicates that dual-ended delay exceeds the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.333.1.4.15"] = [
    name: "hwTwampMemTwoWayDelayExceed",
    fields: ["hwTwampSenderMemberName", "hwTwampMemTwoWayDelayValue", "hwTwampMemTwoWayDelayValueUpperLimitThreshold", "hwTwampMemTwoWayDelayValueLowerLimitThreshold", "hwTwampSenderLocalIpAddress", "hwTwampSenderRemoteIpAddress", "hwTwampSenderLocalUDPPort", "hwTwampSenderRemoteUDPPort", "hwTwampSenderVrfName"],
    fieldOids: ["hwTwampSenderMemberName": "1.3.6.1.4.1.2011.5.25.333.1.1.15.1.2", "hwTwampMemTwoWayDelayValue": "1.3.6.1.4.1.2011.5.25.333.1.1.16.1.1", "hwTwampMemTwoWayDelayValueUpperLimitThreshold": "1.3.6.1.4.1.2011.5.25.333.1.1.16.1.2", "hwTwampMemTwoWayDelayValueLowerLimitThreshold": "1.3.6.1.4.1.2011.5.25.333.1.1.16.1.3", "hwTwampSenderLocalIpAddress": "1.3.6.1.4.1.2011.5.25.333.1.1.3.1.3", "hwTwampSenderRemoteIpAddress": "1.3.6.1.4.1.2011.5.25.333.1.1.3.1.5", "hwTwampSenderLocalUDPPort": "1.3.6.1.4.1.2011.5.25.333.1.1.3.1.6", "hwTwampSenderRemoteUDPPort": "1.3.6.1.4.1.2011.5.25.333.1.1.3.1.7", "hwTwampSenderVrfName": "1.3.6.1.4.1.2011.5.25.333.1.1.3.1.8"]
]

// --- hwTwampMemTwoWayDelayRecovery (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.333.1.4.16
// Fields: hwTwampSenderMemberName, hwTwampMemTwoWayDelayValue, hwTwampMemTwoWayDelayValueUpperLimitThreshold, hwTwampMemTwoWayDelayValueLowerLimitThreshold, hwTwampSenderLocalIpAddress, hwTwampSenderRemoteIpAddress, hwTwampSenderLocalUDPPort, hwTwampSenderRemoteUDPPort, hwTwampSenderVrfName
// Description: This object indicates that dual-ended delay restores.
trapMap["1.3.6.1.4.1.2011.5.25.333.1.4.16"] = [
    name: "hwTwampMemTwoWayDelayRecovery",
    fields: ["hwTwampSenderMemberName", "hwTwampMemTwoWayDelayValue", "hwTwampMemTwoWayDelayValueUpperLimitThreshold", "hwTwampMemTwoWayDelayValueLowerLimitThreshold", "hwTwampSenderLocalIpAddress", "hwTwampSenderRemoteIpAddress", "hwTwampSenderLocalUDPPort", "hwTwampSenderRemoteUDPPort", "hwTwampSenderVrfName"],
    fieldOids: ["hwTwampSenderMemberName": "1.3.6.1.4.1.2011.5.25.333.1.1.15.1.2", "hwTwampMemTwoWayDelayValue": "1.3.6.1.4.1.2011.5.25.333.1.1.16.1.1", "hwTwampMemTwoWayDelayValueUpperLimitThreshold": "1.3.6.1.4.1.2011.5.25.333.1.1.16.1.2", "hwTwampMemTwoWayDelayValueLowerLimitThreshold": "1.3.6.1.4.1.2011.5.25.333.1.1.16.1.3", "hwTwampSenderLocalIpAddress": "1.3.6.1.4.1.2011.5.25.333.1.1.3.1.3", "hwTwampSenderRemoteIpAddress": "1.3.6.1.4.1.2011.5.25.333.1.1.3.1.5", "hwTwampSenderLocalUDPPort": "1.3.6.1.4.1.2011.5.25.333.1.1.3.1.6", "hwTwampSenderRemoteUDPPort": "1.3.6.1.4.1.2011.5.25.333.1.1.3.1.7", "hwTwampSenderVrfName": "1.3.6.1.4.1.2011.5.25.333.1.1.3.1.8"]
]

// --- hwTwampMemTwoWayJitterExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.333.1.4.17
// Fields: hwTwampSenderMemberName, hwTwampMemTwoWayJitterValue, hwTwampMemTwoWayJitterValueUpperLimitThreshold, hwTwampMemTwoWayJitterValueLowerLimitThreshold, hwTwampSenderLocalIpAddress, hwTwampSenderRemoteIpAddress, hwTwampSenderLocalUDPPort, hwTwampSenderRemoteUDPPort, hwTwampSenderVrfName
// Description: This object indicates that dual-ended jitter exceeds the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.333.1.4.17"] = [
    name: "hwTwampMemTwoWayJitterExceed",
    fields: ["hwTwampSenderMemberName", "hwTwampMemTwoWayJitterValue", "hwTwampMemTwoWayJitterValueUpperLimitThreshold", "hwTwampMemTwoWayJitterValueLowerLimitThreshold", "hwTwampSenderLocalIpAddress", "hwTwampSenderRemoteIpAddress", "hwTwampSenderLocalUDPPort", "hwTwampSenderRemoteUDPPort", "hwTwampSenderVrfName"],
    fieldOids: ["hwTwampSenderMemberName": "1.3.6.1.4.1.2011.5.25.333.1.1.15.1.2", "hwTwampMemTwoWayJitterValue": "1.3.6.1.4.1.2011.5.25.333.1.1.17.1.1", "hwTwampMemTwoWayJitterValueUpperLimitThreshold": "1.3.6.1.4.1.2011.5.25.333.1.1.17.1.2", "hwTwampMemTwoWayJitterValueLowerLimitThreshold": "1.3.6.1.4.1.2011.5.25.333.1.1.17.1.3", "hwTwampSenderLocalIpAddress": "1.3.6.1.4.1.2011.5.25.333.1.1.3.1.3", "hwTwampSenderRemoteIpAddress": "1.3.6.1.4.1.2011.5.25.333.1.1.3.1.5", "hwTwampSenderLocalUDPPort": "1.3.6.1.4.1.2011.5.25.333.1.1.3.1.6", "hwTwampSenderRemoteUDPPort": "1.3.6.1.4.1.2011.5.25.333.1.1.3.1.7", "hwTwampSenderVrfName": "1.3.6.1.4.1.2011.5.25.333.1.1.3.1.8"]
]

// --- hwTwampMemTwoWayJitterRecovery (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.333.1.4.18
// Fields: hwTwampSenderMemberName, hwTwampMemTwoWayJitterValue, hwTwampMemTwoWayJitterValueUpperLimitThreshold, hwTwampMemTwoWayJitterValueLowerLimitThreshold, hwTwampSenderLocalIpAddress, hwTwampSenderRemoteIpAddress, hwTwampSenderLocalUDPPort, hwTwampSenderRemoteUDPPort, hwTwampSenderVrfName
// Description: This object indicates that dual-ended jitter restores.
trapMap["1.3.6.1.4.1.2011.5.25.333.1.4.18"] = [
    name: "hwTwampMemTwoWayJitterRecovery",
    fields: ["hwTwampSenderMemberName", "hwTwampMemTwoWayJitterValue", "hwTwampMemTwoWayJitterValueUpperLimitThreshold", "hwTwampMemTwoWayJitterValueLowerLimitThreshold", "hwTwampSenderLocalIpAddress", "hwTwampSenderRemoteIpAddress", "hwTwampSenderLocalUDPPort", "hwTwampSenderRemoteUDPPort", "hwTwampSenderVrfName"],
    fieldOids: ["hwTwampSenderMemberName": "1.3.6.1.4.1.2011.5.25.333.1.1.15.1.2", "hwTwampMemTwoWayJitterValue": "1.3.6.1.4.1.2011.5.25.333.1.1.17.1.1", "hwTwampMemTwoWayJitterValueUpperLimitThreshold": "1.3.6.1.4.1.2011.5.25.333.1.1.17.1.2", "hwTwampMemTwoWayJitterValueLowerLimitThreshold": "1.3.6.1.4.1.2011.5.25.333.1.1.17.1.3", "hwTwampSenderLocalIpAddress": "1.3.6.1.4.1.2011.5.25.333.1.1.3.1.3", "hwTwampSenderRemoteIpAddress": "1.3.6.1.4.1.2011.5.25.333.1.1.3.1.5", "hwTwampSenderLocalUDPPort": "1.3.6.1.4.1.2011.5.25.333.1.1.3.1.6", "hwTwampSenderRemoteUDPPort": "1.3.6.1.4.1.2011.5.25.333.1.1.3.1.7", "hwTwampSenderVrfName": "1.3.6.1.4.1.2011.5.25.333.1.1.3.1.8"]
]

// --- hwTwampMemTwoWayLocExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.333.1.4.19
// Fields: hwTwampSenderMemberName, hwTwampMemTwoWayLossRatio, hwTwampSenderLocalIpAddress, hwTwampSenderRemoteIpAddress, hwTwampSenderLocalUDPPort, hwTwampSenderRemoteUDPPort, hwTwampSenderVrfName
// Description: This object indicates that the connection between the two ends fails.
trapMap["1.3.6.1.4.1.2011.5.25.333.1.4.19"] = [
    name: "hwTwampMemTwoWayLocExceed",
    fields: ["hwTwampSenderMemberName", "hwTwampMemTwoWayLossRatio", "hwTwampSenderLocalIpAddress", "hwTwampSenderRemoteIpAddress", "hwTwampSenderLocalUDPPort", "hwTwampSenderRemoteUDPPort", "hwTwampSenderVrfName"],
    fieldOids: ["hwTwampSenderMemberName": "1.3.6.1.4.1.2011.5.25.333.1.1.15.1.2", "hwTwampMemTwoWayLossRatio": "1.3.6.1.4.1.2011.5.25.333.1.1.15.1.3", "hwTwampSenderLocalIpAddress": "1.3.6.1.4.1.2011.5.25.333.1.1.3.1.3", "hwTwampSenderRemoteIpAddress": "1.3.6.1.4.1.2011.5.25.333.1.1.3.1.5", "hwTwampSenderLocalUDPPort": "1.3.6.1.4.1.2011.5.25.333.1.1.3.1.6", "hwTwampSenderRemoteUDPPort": "1.3.6.1.4.1.2011.5.25.333.1.1.3.1.7", "hwTwampSenderVrfName": "1.3.6.1.4.1.2011.5.25.333.1.1.3.1.8"]
]

// --- hwTwampMemTwoWayLocRecovery (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.333.1.4.20
// Fields: hwTwampSenderMemberName, hwTwampMemTwoWayLossRatio, hwTwampSenderLocalIpAddress, hwTwampSenderRemoteIpAddress, hwTwampSenderLocalUDPPort, hwTwampSenderRemoteUDPPort, hwTwampSenderVrfName
// Description: This object indicates that the connection between the two ends restores.
trapMap["1.3.6.1.4.1.2011.5.25.333.1.4.20"] = [
    name: "hwTwampMemTwoWayLocRecovery",
    fields: ["hwTwampSenderMemberName", "hwTwampMemTwoWayLossRatio", "hwTwampSenderLocalIpAddress", "hwTwampSenderRemoteIpAddress", "hwTwampSenderLocalUDPPort", "hwTwampSenderRemoteUDPPort", "hwTwampSenderVrfName"],
    fieldOids: ["hwTwampSenderMemberName": "1.3.6.1.4.1.2011.5.25.333.1.1.15.1.2", "hwTwampMemTwoWayLossRatio": "1.3.6.1.4.1.2011.5.25.333.1.1.15.1.3", "hwTwampSenderLocalIpAddress": "1.3.6.1.4.1.2011.5.25.333.1.1.3.1.3", "hwTwampSenderRemoteIpAddress": "1.3.6.1.4.1.2011.5.25.333.1.1.3.1.5", "hwTwampSenderLocalUDPPort": "1.3.6.1.4.1.2011.5.25.333.1.1.3.1.6", "hwTwampSenderRemoteUDPPort": "1.3.6.1.4.1.2011.5.25.333.1.1.3.1.7", "hwTwampSenderVrfName": "1.3.6.1.4.1.2011.5.25.333.1.1.3.1.8"]
]

// --- hwTwampResponderSessionNumExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.333.1.4.21
// Description: This object indicates that the number of sessions exceeds the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.333.1.4.21"] = [
    name: "hwTwampResponderSessionNumExceed",
    fields: [],
    fieldOids: []
]

// --- hwTwampResponderSessionNumRecovery (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.333.1.4.22
// Description: This object indicates that the number of sessions restores.
trapMap["1.3.6.1.4.1.2011.5.25.333.1.4.22"] = [
    name: "hwTwampResponderSessionNumRecovery",
    fields: [],
    fieldOids: []
]

// --- hwTwampControlSessionNumExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.333.1.4.23
// Description: This object indicates that the number of TWAMP control sessions is out of device capability.
trapMap["1.3.6.1.4.1.2011.5.25.333.1.4.23"] = [
    name: "hwTwampControlSessionNumExceed",
    fields: [],
    fieldOids: []
]

// --- hwTwampControlSessionNumRecovery (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.333.1.4.24
// Description: This object indicates that the number of TWAMP control sessions is under device capability.
trapMap["1.3.6.1.4.1.2011.5.25.333.1.4.24"] = [
    name: "hwTwampControlSessionNumRecovery",
    fields: [],
    fieldOids: []
]

// ===== Parsing logic =====

// Set to true to enable diagnostic logging for this MIB parser
DEBUG = false

LOG_PREFIX = "[HUAWEI-TWAMP-MIB]"
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
