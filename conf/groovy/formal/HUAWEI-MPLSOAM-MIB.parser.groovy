/**
 * Auto-generated from HUAWEI-MPLSOAM-MIB.mib
 * Generated: 2026-08-24T18:28:30.422260100
 * Traps/Notifications (35): hwMplsOamIgrLSPOutDefect, hwMplsOamIgrLSPInDefect, hwMplsOamIgrLSPAva, hwMplsOamIgrLSPUnAva, hwMplsOamEgrLSPOutDefect, hwMplsOamEgrLSPInDefect, hwMplsOamEgrLSPAva, hwMplsOamEgrLSPUnAva, hwMplsOamEgrFirstPkt, hwMplsOamEgrAutoProFDI, hwMplsOamEgrRlsnDown, hwMplsOamL2vcOutDefect, hwMplsOamL2vcInDefect, hwMplsOamL2vcAva, hwMplsOamL2vcUnAva, hwMplsOamBidirectionalTunnelOutDefect, hwMplsOamBidirectionalTunnelInDefect, hwMplsOamBidirectionalTunnelAva, hwMplsOamBidirectionalTunnelUnAva, hwMplsPsSwitchPtoW, hwMplsPsSwitchWtoP, hwMplsApsMismatch, hwMplsApsMismatchRecovery, hwMplsApsLost, hwMplsApsLostRecovery, hwMplsApsOutage, hwMplsApsOutageRecovery, hwMplsApsDegraded, hwMplsApsDegradedRecovery, hwMplsApsSwitchFail, hwMplsApsSwitchFailRecovery, hwMplsApsPathMisMatch, hwMplsApsPathMisMatchRecovery, hwMplsApsTypeMisMatch, hwMplsApsTypeMisMatchRecovery
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

// --- hwMplsOamIgrLSPOutDefect (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.12.7.1.2.1
// Fields: hwMplsOamIgrIndex, hwMplsOamIgrTunnName, hwMplsOamIgrAvaState, hwMplsOamIgrDefectType
// Description: This notification is generated when the LSP is found not in the defect state at the LSP ingress.
trapMap["1.3.6.1.4.1.2011.5.12.7.1.2.1"] = [
    name: "hwMplsOamIgrLSPOutDefect",
    fields: ["hwMplsOamIgrIndex", "hwMplsOamIgrTunnName", "hwMplsOamIgrAvaState", "hwMplsOamIgrDefectType"],
    fieldOids: ["hwMplsOamIgrIndex": "1.3.6.1.4.1.2011.5.12.7.1.1.2.1.1", "hwMplsOamIgrTunnName": "1.3.6.1.4.1.2011.5.12.7.1.1.2.1.2", "hwMplsOamIgrAvaState": "1.3.6.1.4.1.2011.5.12.7.1.1.2.1.11", "hwMplsOamIgrDefectType": "1.3.6.1.4.1.2011.5.12.7.1.1.2.1.12"]
]

// --- hwMplsOamIgrLSPInDefect (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.12.7.1.2.2
// Fields: hwMplsOamIgrIndex, hwMplsOamIgrTunnName, hwMplsOamIgrAvaState, hwMplsOamIgrDefectType
// Description: This notification is generated when the LSP is found in the defect state at the LSP ingress.
trapMap["1.3.6.1.4.1.2011.5.12.7.1.2.2"] = [
    name: "hwMplsOamIgrLSPInDefect",
    fields: ["hwMplsOamIgrIndex", "hwMplsOamIgrTunnName", "hwMplsOamIgrAvaState", "hwMplsOamIgrDefectType"],
    fieldOids: ["hwMplsOamIgrIndex": "1.3.6.1.4.1.2011.5.12.7.1.1.2.1.1", "hwMplsOamIgrTunnName": "1.3.6.1.4.1.2011.5.12.7.1.1.2.1.2", "hwMplsOamIgrAvaState": "1.3.6.1.4.1.2011.5.12.7.1.1.2.1.11", "hwMplsOamIgrDefectType": "1.3.6.1.4.1.2011.5.12.7.1.1.2.1.12"]
]

// --- hwMplsOamIgrLSPAva (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.12.7.1.2.3
// Fields: hwMplsOamIgrIndex, hwMplsOamIgrTunnName, hwMplsOamIgrAvaState, hwMplsOamIgrDefectType
// Description: This notification is generated when the LSP is found in the available state at the LSP ingress.
trapMap["1.3.6.1.4.1.2011.5.12.7.1.2.3"] = [
    name: "hwMplsOamIgrLSPAva",
    fields: ["hwMplsOamIgrIndex", "hwMplsOamIgrTunnName", "hwMplsOamIgrAvaState", "hwMplsOamIgrDefectType"],
    fieldOids: ["hwMplsOamIgrIndex": "1.3.6.1.4.1.2011.5.12.7.1.1.2.1.1", "hwMplsOamIgrTunnName": "1.3.6.1.4.1.2011.5.12.7.1.1.2.1.2", "hwMplsOamIgrAvaState": "1.3.6.1.4.1.2011.5.12.7.1.1.2.1.11", "hwMplsOamIgrDefectType": "1.3.6.1.4.1.2011.5.12.7.1.1.2.1.12"]
]

// --- hwMplsOamIgrLSPUnAva (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.12.7.1.2.4
// Fields: hwMplsOamIgrIndex, hwMplsOamIgrTunnName, hwMplsOamIgrAvaState, hwMplsOamIgrDefectType
// Description: This notification is generated when the LSP is found in the unavailable state at the LSP ingress.
trapMap["1.3.6.1.4.1.2011.5.12.7.1.2.4"] = [
    name: "hwMplsOamIgrLSPUnAva",
    fields: ["hwMplsOamIgrIndex", "hwMplsOamIgrTunnName", "hwMplsOamIgrAvaState", "hwMplsOamIgrDefectType"],
    fieldOids: ["hwMplsOamIgrIndex": "1.3.6.1.4.1.2011.5.12.7.1.1.2.1.1", "hwMplsOamIgrTunnName": "1.3.6.1.4.1.2011.5.12.7.1.1.2.1.2", "hwMplsOamIgrAvaState": "1.3.6.1.4.1.2011.5.12.7.1.1.2.1.11", "hwMplsOamIgrDefectType": "1.3.6.1.4.1.2011.5.12.7.1.1.2.1.12"]
]

// --- hwMplsOamEgrLSPOutDefect (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.12.7.1.2.5
// Fields: hwMplsOamEgrLspName, hwMplsOamEgrLsrId, hwMplsOamEgrSessTunnId, hwMplsOamEgrAvaState, hwMplsOamEgrDefectType
// Description: This notification is generated when the LSP is found not in the defect state at the LSP egress.
trapMap["1.3.6.1.4.1.2011.5.12.7.1.2.5"] = [
    name: "hwMplsOamEgrLSPOutDefect",
    fields: ["hwMplsOamEgrLspName", "hwMplsOamEgrLsrId", "hwMplsOamEgrSessTunnId", "hwMplsOamEgrAvaState", "hwMplsOamEgrDefectType"],
    fieldOids: ["hwMplsOamEgrLspName": "1.3.6.1.4.1.2011.5.12.7.1.1.3.1.1", "hwMplsOamEgrLsrId": "1.3.6.1.4.1.2011.5.12.7.1.1.3.1.2", "hwMplsOamEgrSessTunnId": "1.3.6.1.4.1.2011.5.12.7.1.1.3.1.3", "hwMplsOamEgrAvaState": "1.3.6.1.4.1.2011.5.12.7.1.1.3.1.13", "hwMplsOamEgrDefectType": "1.3.6.1.4.1.2011.5.12.7.1.1.3.1.14"]
]

// --- hwMplsOamEgrLSPInDefect (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.12.7.1.2.6
// Fields: hwMplsOamEgrLspName, hwMplsOamEgrLsrId, hwMplsOamEgrSessTunnId, hwMplsOamEgrAvaState, hwMplsOamEgrDefectType
// Description: This notification is generated when the LSP is found in the defect state at the LSP egress.
trapMap["1.3.6.1.4.1.2011.5.12.7.1.2.6"] = [
    name: "hwMplsOamEgrLSPInDefect",
    fields: ["hwMplsOamEgrLspName", "hwMplsOamEgrLsrId", "hwMplsOamEgrSessTunnId", "hwMplsOamEgrAvaState", "hwMplsOamEgrDefectType"],
    fieldOids: ["hwMplsOamEgrLspName": "1.3.6.1.4.1.2011.5.12.7.1.1.3.1.1", "hwMplsOamEgrLsrId": "1.3.6.1.4.1.2011.5.12.7.1.1.3.1.2", "hwMplsOamEgrSessTunnId": "1.3.6.1.4.1.2011.5.12.7.1.1.3.1.3", "hwMplsOamEgrAvaState": "1.3.6.1.4.1.2011.5.12.7.1.1.3.1.13", "hwMplsOamEgrDefectType": "1.3.6.1.4.1.2011.5.12.7.1.1.3.1.14"]
]

// --- hwMplsOamEgrLSPAva (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.12.7.1.2.7
// Fields: hwMplsOamEgrLspName, hwMplsOamEgrLsrId, hwMplsOamEgrSessTunnId, hwMplsOamEgrAvaState, hwMplsOamEgrDefectType
// Description: This notification is generated when the LSP is found in the available state at the LSP egress.
trapMap["1.3.6.1.4.1.2011.5.12.7.1.2.7"] = [
    name: "hwMplsOamEgrLSPAva",
    fields: ["hwMplsOamEgrLspName", "hwMplsOamEgrLsrId", "hwMplsOamEgrSessTunnId", "hwMplsOamEgrAvaState", "hwMplsOamEgrDefectType"],
    fieldOids: ["hwMplsOamEgrLspName": "1.3.6.1.4.1.2011.5.12.7.1.1.3.1.1", "hwMplsOamEgrLsrId": "1.3.6.1.4.1.2011.5.12.7.1.1.3.1.2", "hwMplsOamEgrSessTunnId": "1.3.6.1.4.1.2011.5.12.7.1.1.3.1.3", "hwMplsOamEgrAvaState": "1.3.6.1.4.1.2011.5.12.7.1.1.3.1.13", "hwMplsOamEgrDefectType": "1.3.6.1.4.1.2011.5.12.7.1.1.3.1.14"]
]

// --- hwMplsOamEgrLSPUnAva (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.12.7.1.2.8
// Fields: hwMplsOamEgrLspName, hwMplsOamEgrLsrId, hwMplsOamEgrSessTunnId, hwMplsOamEgrAvaState, hwMplsOamEgrDefectType
// Description: This notification is generated when the LSP is found in the unavailable state at the LSP egress.
trapMap["1.3.6.1.4.1.2011.5.12.7.1.2.8"] = [
    name: "hwMplsOamEgrLSPUnAva",
    fields: ["hwMplsOamEgrLspName", "hwMplsOamEgrLsrId", "hwMplsOamEgrSessTunnId", "hwMplsOamEgrAvaState", "hwMplsOamEgrDefectType"],
    fieldOids: ["hwMplsOamEgrLspName": "1.3.6.1.4.1.2011.5.12.7.1.1.3.1.1", "hwMplsOamEgrLsrId": "1.3.6.1.4.1.2011.5.12.7.1.1.3.1.2", "hwMplsOamEgrSessTunnId": "1.3.6.1.4.1.2011.5.12.7.1.1.3.1.3", "hwMplsOamEgrAvaState": "1.3.6.1.4.1.2011.5.12.7.1.1.3.1.13", "hwMplsOamEgrDefectType": "1.3.6.1.4.1.2011.5.12.7.1.1.3.1.14"]
]

// --- hwMplsOamEgrFirstPkt (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.12.7.1.2.9
// Fields: hwMplsOamEgrLspName, hwMplsOamEgrLsrId, hwMplsOamEgrSessTunnId, hwMplsOamEgrDetType, hwMplsOamEgrDetFreq
// Description: If autoprotocol is enabled, this notification is generated when egress receives the first CV/FFD packet.
trapMap["1.3.6.1.4.1.2011.5.12.7.1.2.9"] = [
    name: "hwMplsOamEgrFirstPkt",
    fields: ["hwMplsOamEgrLspName", "hwMplsOamEgrLsrId", "hwMplsOamEgrSessTunnId", "hwMplsOamEgrDetType", "hwMplsOamEgrDetFreq"],
    fieldOids: ["hwMplsOamEgrLspName": "1.3.6.1.4.1.2011.5.12.7.1.1.3.1.1", "hwMplsOamEgrLsrId": "1.3.6.1.4.1.2011.5.12.7.1.1.3.1.2", "hwMplsOamEgrSessTunnId": "1.3.6.1.4.1.2011.5.12.7.1.1.3.1.3", "hwMplsOamEgrDetType": "1.3.6.1.4.1.2011.5.12.7.1.1.3.1.4", "hwMplsOamEgrDetFreq": "1.3.6.1.4.1.2011.5.12.7.1.1.3.1.5"]
]

// --- hwMplsOamEgrAutoProFDI (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.12.7.1.2.10
// Fields: hwMplsOamEgrLspName, hwMplsOamEgrLsrId, hwMplsOamEgrSessTunnId, hwMplsOamEgrEnable
// Description: The FDI packet is used by the upstream node in an LSP to inform the egress of the defect information. It is also generated when the auto protocol is enabled, with which the LSP ingress notifies the eg...
trapMap["1.3.6.1.4.1.2011.5.12.7.1.2.10"] = [
    name: "hwMplsOamEgrAutoProFDI",
    fields: ["hwMplsOamEgrLspName", "hwMplsOamEgrLsrId", "hwMplsOamEgrSessTunnId", "hwMplsOamEgrEnable"],
    fieldOids: ["hwMplsOamEgrLspName": "1.3.6.1.4.1.2011.5.12.7.1.1.3.1.1", "hwMplsOamEgrLsrId": "1.3.6.1.4.1.2011.5.12.7.1.1.3.1.2", "hwMplsOamEgrSessTunnId": "1.3.6.1.4.1.2011.5.12.7.1.1.3.1.3", "hwMplsOamEgrEnable": "1.3.6.1.4.1.2011.5.12.7.1.1.3.1.11"]
]

// --- hwMplsOamEgrRlsnDown (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.12.7.1.2.11
// Fields: hwMplsOamRlsnLspName, hwMplsOamRlsnLsrId, hwMplsOamRlsnIsDown, hwMplsOamRlsnIfName, hwMplsOamRlsnSessTunnId
// Description: This notification is generated when the Rlsn is down.
trapMap["1.3.6.1.4.1.2011.5.12.7.1.2.11"] = [
    name: "hwMplsOamEgrRlsnDown",
    fields: ["hwMplsOamRlsnLspName", "hwMplsOamRlsnLsrId", "hwMplsOamRlsnIsDown", "hwMplsOamRlsnIfName", "hwMplsOamRlsnSessTunnId"],
    fieldOids: ["hwMplsOamRlsnLspName": "1.3.6.1.4.1.2011.5.12.7.1.1.4.1.1", "hwMplsOamRlsnLsrId": "1.3.6.1.4.1.2011.5.12.7.1.1.4.1.2", "hwMplsOamRlsnIsDown": "1.3.6.1.4.1.2011.5.12.7.1.1.4.1.6", "hwMplsOamRlsnIfName": "1.3.6.1.4.1.2011.5.12.7.1.1.4.1.5", "hwMplsOamRlsnSessTunnId": "1.3.6.1.4.1.2011.5.12.7.1.1.4.1.3"]
]

// --- hwMplsOamL2vcOutDefect (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.12.7.1.2.12
// Fields: hwMplsOamL2vcPeerIp, hwMplsOamL2vcVcType, hwMplsOamL2vcVcId, hwMplsOamL2vcAvaState, hwMplsOamL2vcDefectType, hwMplsOamL2vcBdiDefectType
// Description: OAM detected that the local L2VC exited the defect state.
trapMap["1.3.6.1.4.1.2011.5.12.7.1.2.12"] = [
    name: "hwMplsOamL2vcOutDefect",
    fields: ["hwMplsOamL2vcPeerIp", "hwMplsOamL2vcVcType", "hwMplsOamL2vcVcId", "hwMplsOamL2vcAvaState", "hwMplsOamL2vcDefectType", "hwMplsOamL2vcBdiDefectType"],
    fieldOids: ["hwMplsOamL2vcPeerIp": "1.3.6.1.4.1.2011.5.12.7.1.1.6.1.1", "hwMplsOamL2vcVcType": "1.3.6.1.4.1.2011.5.12.7.1.1.6.1.2", "hwMplsOamL2vcVcId": "1.3.6.1.4.1.2011.5.12.7.1.1.6.1.3", "hwMplsOamL2vcAvaState": "1.3.6.1.4.1.2011.5.12.7.1.1.6.1.16", "hwMplsOamL2vcDefectType": "1.3.6.1.4.1.2011.5.12.7.1.1.6.1.17", "hwMplsOamL2vcBdiDefectType": "1.3.6.1.4.1.2011.5.12.7.1.1.6.1.18"]
]

// --- hwMplsOamL2vcInDefect (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.12.7.1.2.13
// Fields: hwMplsOamL2vcPeerIp, hwMplsOamL2vcVcType, hwMplsOamL2vcVcId, hwMplsOamL2vcAvaState, hwMplsOamL2vcDefectType, hwMplsOamL2vcBdiDefectType
// Description: OAM detected that the local L2VC entered the defect state.
trapMap["1.3.6.1.4.1.2011.5.12.7.1.2.13"] = [
    name: "hwMplsOamL2vcInDefect",
    fields: ["hwMplsOamL2vcPeerIp", "hwMplsOamL2vcVcType", "hwMplsOamL2vcVcId", "hwMplsOamL2vcAvaState", "hwMplsOamL2vcDefectType", "hwMplsOamL2vcBdiDefectType"],
    fieldOids: ["hwMplsOamL2vcPeerIp": "1.3.6.1.4.1.2011.5.12.7.1.1.6.1.1", "hwMplsOamL2vcVcType": "1.3.6.1.4.1.2011.5.12.7.1.1.6.1.2", "hwMplsOamL2vcVcId": "1.3.6.1.4.1.2011.5.12.7.1.1.6.1.3", "hwMplsOamL2vcAvaState": "1.3.6.1.4.1.2011.5.12.7.1.1.6.1.16", "hwMplsOamL2vcDefectType": "1.3.6.1.4.1.2011.5.12.7.1.1.6.1.17", "hwMplsOamL2vcBdiDefectType": "1.3.6.1.4.1.2011.5.12.7.1.1.6.1.18"]
]

// --- hwMplsOamL2vcAva (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.12.7.1.2.14
// Fields: hwMplsOamL2vcPeerIp, hwMplsOamL2vcVcType, hwMplsOamL2vcVcId, hwMplsOamL2vcAvaState, hwMplsOamL2vcDefectType, hwMplsOamL2vcBdiDefectType
// Description: OAM detected that the local L2VC entered the available state.
trapMap["1.3.6.1.4.1.2011.5.12.7.1.2.14"] = [
    name: "hwMplsOamL2vcAva",
    fields: ["hwMplsOamL2vcPeerIp", "hwMplsOamL2vcVcType", "hwMplsOamL2vcVcId", "hwMplsOamL2vcAvaState", "hwMplsOamL2vcDefectType", "hwMplsOamL2vcBdiDefectType"],
    fieldOids: ["hwMplsOamL2vcPeerIp": "1.3.6.1.4.1.2011.5.12.7.1.1.6.1.1", "hwMplsOamL2vcVcType": "1.3.6.1.4.1.2011.5.12.7.1.1.6.1.2", "hwMplsOamL2vcVcId": "1.3.6.1.4.1.2011.5.12.7.1.1.6.1.3", "hwMplsOamL2vcAvaState": "1.3.6.1.4.1.2011.5.12.7.1.1.6.1.16", "hwMplsOamL2vcDefectType": "1.3.6.1.4.1.2011.5.12.7.1.1.6.1.17", "hwMplsOamL2vcBdiDefectType": "1.3.6.1.4.1.2011.5.12.7.1.1.6.1.18"]
]

// --- hwMplsOamL2vcUnAva (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.12.7.1.2.15
// Fields: hwMplsOamL2vcPeerIp, hwMplsOamL2vcVcType, hwMplsOamL2vcVcId, hwMplsOamL2vcAvaState, hwMplsOamL2vcDefectType, hwMplsOamL2vcBdiDefectType
// Description: OAM detected that the local L2VC entered the unavailable state.
trapMap["1.3.6.1.4.1.2011.5.12.7.1.2.15"] = [
    name: "hwMplsOamL2vcUnAva",
    fields: ["hwMplsOamL2vcPeerIp", "hwMplsOamL2vcVcType", "hwMplsOamL2vcVcId", "hwMplsOamL2vcAvaState", "hwMplsOamL2vcDefectType", "hwMplsOamL2vcBdiDefectType"],
    fieldOids: ["hwMplsOamL2vcPeerIp": "1.3.6.1.4.1.2011.5.12.7.1.1.6.1.1", "hwMplsOamL2vcVcType": "1.3.6.1.4.1.2011.5.12.7.1.1.6.1.2", "hwMplsOamL2vcVcId": "1.3.6.1.4.1.2011.5.12.7.1.1.6.1.3", "hwMplsOamL2vcAvaState": "1.3.6.1.4.1.2011.5.12.7.1.1.6.1.16", "hwMplsOamL2vcDefectType": "1.3.6.1.4.1.2011.5.12.7.1.1.6.1.17", "hwMplsOamL2vcBdiDefectType": "1.3.6.1.4.1.2011.5.12.7.1.1.6.1.18"]
]

// --- hwMplsOamBidirectionalTunnelOutDefect (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.12.7.1.2.16
// Fields: hwMplsOamBidirectionalTunnelIndex, hwMplsOamBidirectionalTunnelAvaState, hwMplsOamBidirectionalTunnelDefectType, hwMplsOamBidirectionalTunnelBdiDefectType
// Description: This notification is generated when the CO-ROUTE is found not in the defect state.
trapMap["1.3.6.1.4.1.2011.5.12.7.1.2.16"] = [
    name: "hwMplsOamBidirectionalTunnelOutDefect",
    fields: ["hwMplsOamBidirectionalTunnelIndex", "hwMplsOamBidirectionalTunnelAvaState", "hwMplsOamBidirectionalTunnelDefectType", "hwMplsOamBidirectionalTunnelBdiDefectType"],
    fieldOids: ["hwMplsOamBidirectionalTunnelIndex": "1.3.6.1.4.1.2011.5.12.7.1.1.7.1.1", "hwMplsOamBidirectionalTunnelAvaState": "1.3.6.1.4.1.2011.5.12.7.1.1.7.1.12", "hwMplsOamBidirectionalTunnelDefectType": "1.3.6.1.4.1.2011.5.12.7.1.1.7.1.13", "hwMplsOamBidirectionalTunnelBdiDefectType": "1.3.6.1.4.1.2011.5.12.7.1.1.7.1.14"]
]

// --- hwMplsOamBidirectionalTunnelInDefect (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.12.7.1.2.17
// Fields: hwMplsOamBidirectionalTunnelIndex, hwMplsOamBidirectionalTunnelAvaState, hwMplsOamBidirectionalTunnelDefectType, hwMplsOamBidirectionalTunnelBdiDefectType
// Description: This notification is generated when the CO-ROUTE is found in the defect state.
trapMap["1.3.6.1.4.1.2011.5.12.7.1.2.17"] = [
    name: "hwMplsOamBidirectionalTunnelInDefect",
    fields: ["hwMplsOamBidirectionalTunnelIndex", "hwMplsOamBidirectionalTunnelAvaState", "hwMplsOamBidirectionalTunnelDefectType", "hwMplsOamBidirectionalTunnelBdiDefectType"],
    fieldOids: ["hwMplsOamBidirectionalTunnelIndex": "1.3.6.1.4.1.2011.5.12.7.1.1.7.1.1", "hwMplsOamBidirectionalTunnelAvaState": "1.3.6.1.4.1.2011.5.12.7.1.1.7.1.12", "hwMplsOamBidirectionalTunnelDefectType": "1.3.6.1.4.1.2011.5.12.7.1.1.7.1.13", "hwMplsOamBidirectionalTunnelBdiDefectType": "1.3.6.1.4.1.2011.5.12.7.1.1.7.1.14"]
]

// --- hwMplsOamBidirectionalTunnelAva (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.12.7.1.2.18
// Fields: hwMplsOamBidirectionalTunnelIndex, hwMplsOamBidirectionalTunnelAvaState, hwMplsOamBidirectionalTunnelDefectType, hwMplsOamBidirectionalTunnelBdiDefectType
// Description: This notification is generated when the CO-ROUTE is found in the available state.
trapMap["1.3.6.1.4.1.2011.5.12.7.1.2.18"] = [
    name: "hwMplsOamBidirectionalTunnelAva",
    fields: ["hwMplsOamBidirectionalTunnelIndex", "hwMplsOamBidirectionalTunnelAvaState", "hwMplsOamBidirectionalTunnelDefectType", "hwMplsOamBidirectionalTunnelBdiDefectType"],
    fieldOids: ["hwMplsOamBidirectionalTunnelIndex": "1.3.6.1.4.1.2011.5.12.7.1.1.7.1.1", "hwMplsOamBidirectionalTunnelAvaState": "1.3.6.1.4.1.2011.5.12.7.1.1.7.1.12", "hwMplsOamBidirectionalTunnelDefectType": "1.3.6.1.4.1.2011.5.12.7.1.1.7.1.13", "hwMplsOamBidirectionalTunnelBdiDefectType": "1.3.6.1.4.1.2011.5.12.7.1.1.7.1.14"]
]

// --- hwMplsOamBidirectionalTunnelUnAva (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.12.7.1.2.19
// Fields: hwMplsOamBidirectionalTunnelIndex, hwMplsOamBidirectionalTunnelAvaState, hwMplsOamBidirectionalTunnelDefectType, hwMplsOamBidirectionalTunnelBdiDefectType
// Description: This notification is generated when the CO-ROUTE is found in the unavailable state.
trapMap["1.3.6.1.4.1.2011.5.12.7.1.2.19"] = [
    name: "hwMplsOamBidirectionalTunnelUnAva",
    fields: ["hwMplsOamBidirectionalTunnelIndex", "hwMplsOamBidirectionalTunnelAvaState", "hwMplsOamBidirectionalTunnelDefectType", "hwMplsOamBidirectionalTunnelBdiDefectType"],
    fieldOids: ["hwMplsOamBidirectionalTunnelIndex": "1.3.6.1.4.1.2011.5.12.7.1.1.7.1.1", "hwMplsOamBidirectionalTunnelAvaState": "1.3.6.1.4.1.2011.5.12.7.1.1.7.1.12", "hwMplsOamBidirectionalTunnelDefectType": "1.3.6.1.4.1.2011.5.12.7.1.1.7.1.13", "hwMplsOamBidirectionalTunnelBdiDefectType": "1.3.6.1.4.1.2011.5.12.7.1.1.7.1.14"]
]

// --- hwMplsPsSwitchPtoW (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.12.7.1.4.1
// Fields: hwMplsPsWorkTunnName, hwMplsPsWorkTunnId, hwMplsPsProtectTunnName, hwMplsPsProtectTunnId, hwMplsPsSwitchResult, hwMplsPsWorkTunnelState, hwMplsPsProtTunnelState, hwMplsPsLocalState
// Description: This notification is generated when switching from protection-lsp to working-lsp occured.
trapMap["1.3.6.1.4.1.2011.5.12.7.1.4.1"] = [
    name: "hwMplsPsSwitchPtoW",
    fields: ["hwMplsPsWorkTunnName", "hwMplsPsWorkTunnId", "hwMplsPsProtectTunnName", "hwMplsPsProtectTunnId", "hwMplsPsSwitchResult", "hwMplsPsWorkTunnelState", "hwMplsPsProtTunnelState", "hwMplsPsLocalState"],
    fieldOids: ["hwMplsPsWorkTunnName": "1.3.6.1.4.1.2011.5.12.7.1.3.1.1.3", "hwMplsPsWorkTunnId": "1.3.6.1.4.1.2011.5.12.7.1.3.1.1.4", "hwMplsPsProtectTunnName": "1.3.6.1.4.1.2011.5.12.7.1.3.1.1.5", "hwMplsPsProtectTunnId": "1.3.6.1.4.1.2011.5.12.7.1.3.1.1.6", "hwMplsPsSwitchResult": "1.3.6.1.4.1.2011.5.12.7.1.3.1.1.13", "hwMplsPsWorkTunnelState": "1.3.6.1.4.1.2011.5.12.7.1.3.1.1.11", "hwMplsPsProtTunnelState": "1.3.6.1.4.1.2011.5.12.7.1.3.1.1.12", "hwMplsPsLocalState": "1.3.6.1.4.1.2011.5.12.7.1.3.1.1.20"]
]

// --- hwMplsPsSwitchWtoP (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.12.7.1.4.2
// Fields: hwMplsPsWorkTunnName, hwMplsPsWorkTunnId, hwMplsPsProtectTunnName, hwMplsPsProtectTunnId, hwMplsPsSwitchResult, hwMplsPsWorkTunnelState, hwMplsPsProtTunnelState, hwMplsPsLocalState
// Description: This notification is generated when switching from woking-lsp to protection-lsp occured.
trapMap["1.3.6.1.4.1.2011.5.12.7.1.4.2"] = [
    name: "hwMplsPsSwitchWtoP",
    fields: ["hwMplsPsWorkTunnName", "hwMplsPsWorkTunnId", "hwMplsPsProtectTunnName", "hwMplsPsProtectTunnId", "hwMplsPsSwitchResult", "hwMplsPsWorkTunnelState", "hwMplsPsProtTunnelState", "hwMplsPsLocalState"],
    fieldOids: ["hwMplsPsWorkTunnName": "1.3.6.1.4.1.2011.5.12.7.1.3.1.1.3", "hwMplsPsWorkTunnId": "1.3.6.1.4.1.2011.5.12.7.1.3.1.1.4", "hwMplsPsProtectTunnName": "1.3.6.1.4.1.2011.5.12.7.1.3.1.1.5", "hwMplsPsProtectTunnId": "1.3.6.1.4.1.2011.5.12.7.1.3.1.1.6", "hwMplsPsSwitchResult": "1.3.6.1.4.1.2011.5.12.7.1.3.1.1.13", "hwMplsPsWorkTunnelState": "1.3.6.1.4.1.2011.5.12.7.1.3.1.1.11", "hwMplsPsProtTunnelState": "1.3.6.1.4.1.2011.5.12.7.1.3.1.1.12", "hwMplsPsLocalState": "1.3.6.1.4.1.2011.5.12.7.1.3.1.1.20"]
]

// --- hwMplsApsMismatch (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.12.7.1.4.3
// Fields: hwMplsPsWorkTunnName, hwMplsApsMismatchReason
// Description: Trap information indicates fully incompatible provisioning and working/protection configuration mismatch are detected by APS frame.
trapMap["1.3.6.1.4.1.2011.5.12.7.1.4.3"] = [
    name: "hwMplsApsMismatch",
    fields: ["hwMplsPsWorkTunnName", "hwMplsApsMismatchReason"],
    fieldOids: ["hwMplsPsWorkTunnName": "1.3.6.1.4.1.2011.5.12.7.1.3.1.1.3", "hwMplsApsMismatchReason": "1.3.6.1.4.1.2011.5.12.7.1.3.4"]
]

// --- hwMplsApsMismatchRecovery (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.12.7.1.4.4
// Fields: hwMplsPsWorkTunnName, hwMplsApsMismatchReason
// Description: Trap information indicates fully incompatible provisioning and working/protection configuration mismatch recovery are detected by APS frame.
trapMap["1.3.6.1.4.1.2011.5.12.7.1.4.4"] = [
    name: "hwMplsApsMismatchRecovery",
    fields: ["hwMplsPsWorkTunnName", "hwMplsApsMismatchReason"],
    fieldOids: ["hwMplsPsWorkTunnName": "1.3.6.1.4.1.2011.5.12.7.1.3.1.1.3", "hwMplsApsMismatchReason": "1.3.6.1.4.1.2011.5.12.7.1.3.4"]
]

// --- hwMplsApsLost (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.12.7.1.4.5
// Fields: hwMplsPsWorkTunnName, hwMplsTunnelSignalProto, hwMplsTunnelSignalledTunnelName
// Description: Tunnel protection group did not receive APS frames from protection tunnel.
trapMap["1.3.6.1.4.1.2011.5.12.7.1.4.5"] = [
    name: "hwMplsApsLost",
    fields: ["hwMplsPsWorkTunnName", "hwMplsTunnelSignalProto", "hwMplsTunnelSignalledTunnelName"],
    fieldOids: ["hwMplsPsWorkTunnName": "1.3.6.1.4.1.2011.5.12.7.1.3.1.1.3", "hwMplsTunnelSignalProto": "1.3.6.1.4.1.2011.5.25.121.1.1.1.30", "hwMplsTunnelSignalledTunnelName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.33"]
]

// --- hwMplsApsLostRecovery (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.12.7.1.4.6
// Fields: hwMplsPsWorkTunnName, hwMplsTunnelSignalProto, hwMplsTunnelSignalledTunnelName
// Description: Tunnel protection group received APS frames from protection tunnel.
trapMap["1.3.6.1.4.1.2011.5.12.7.1.4.6"] = [
    name: "hwMplsApsLostRecovery",
    fields: ["hwMplsPsWorkTunnName", "hwMplsTunnelSignalProto", "hwMplsTunnelSignalledTunnelName"],
    fieldOids: ["hwMplsPsWorkTunnName": "1.3.6.1.4.1.2011.5.12.7.1.3.1.1.3", "hwMplsTunnelSignalProto": "1.3.6.1.4.1.2011.5.25.121.1.1.1.30", "hwMplsTunnelSignalledTunnelName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.33"]
]

// --- hwMplsApsOutage (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.12.7.1.4.7
// Fields: hwMplsPsWorkTunnName, hwMplsTunnelSignalProto, hwMplsTunnelSignalledTunnelName
// Description: Tunnel protection group changed to defect state.
trapMap["1.3.6.1.4.1.2011.5.12.7.1.4.7"] = [
    name: "hwMplsApsOutage",
    fields: ["hwMplsPsWorkTunnName", "hwMplsTunnelSignalProto", "hwMplsTunnelSignalledTunnelName"],
    fieldOids: ["hwMplsPsWorkTunnName": "1.3.6.1.4.1.2011.5.12.7.1.3.1.1.3", "hwMplsTunnelSignalProto": "1.3.6.1.4.1.2011.5.25.121.1.1.1.30", "hwMplsTunnelSignalledTunnelName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.33"]
]

// --- hwMplsApsOutageRecovery (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.12.7.1.4.8
// Fields: hwMplsPsWorkTunnName, hwMplsTunnelSignalProto, hwMplsTunnelSignalledTunnelName
// Description: Tunnel protection group recovered from defect state.
trapMap["1.3.6.1.4.1.2011.5.12.7.1.4.8"] = [
    name: "hwMplsApsOutageRecovery",
    fields: ["hwMplsPsWorkTunnName", "hwMplsTunnelSignalProto", "hwMplsTunnelSignalledTunnelName"],
    fieldOids: ["hwMplsPsWorkTunnName": "1.3.6.1.4.1.2011.5.12.7.1.3.1.1.3", "hwMplsTunnelSignalProto": "1.3.6.1.4.1.2011.5.25.121.1.1.1.30", "hwMplsTunnelSignalledTunnelName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.33"]
]

// --- hwMplsApsDegraded (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.12.7.1.4.9
// Fields: hwMplsPsWorkTunnName, hwMplsTunnelSignalProto, hwMplsTunnelSignalledTunnelName
// Description: Protection tunnel changed to defect state.
trapMap["1.3.6.1.4.1.2011.5.12.7.1.4.9"] = [
    name: "hwMplsApsDegraded",
    fields: ["hwMplsPsWorkTunnName", "hwMplsTunnelSignalProto", "hwMplsTunnelSignalledTunnelName"],
    fieldOids: ["hwMplsPsWorkTunnName": "1.3.6.1.4.1.2011.5.12.7.1.3.1.1.3", "hwMplsTunnelSignalProto": "1.3.6.1.4.1.2011.5.25.121.1.1.1.30", "hwMplsTunnelSignalledTunnelName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.33"]
]

// --- hwMplsApsDegradedRecovery (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.12.7.1.4.10
// Fields: hwMplsPsWorkTunnName, hwMplsTunnelSignalProto, hwMplsTunnelSignalledTunnelName
// Description: Protection tunnel recovered from defect state.
trapMap["1.3.6.1.4.1.2011.5.12.7.1.4.10"] = [
    name: "hwMplsApsDegradedRecovery",
    fields: ["hwMplsPsWorkTunnName", "hwMplsTunnelSignalProto", "hwMplsTunnelSignalledTunnelName"],
    fieldOids: ["hwMplsPsWorkTunnName": "1.3.6.1.4.1.2011.5.12.7.1.3.1.1.3", "hwMplsTunnelSignalProto": "1.3.6.1.4.1.2011.5.25.121.1.1.1.30", "hwMplsTunnelSignalledTunnelName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.33"]
]

// --- hwMplsApsSwitchFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.12.7.1.4.11
// Fields: hwMplsPsWorkTunnName, hwMplsTunnelSignalProto, hwMplsTunnelSignalledTunnelName
// Description: Tunnel protection group changed to defect state.
trapMap["1.3.6.1.4.1.2011.5.12.7.1.4.11"] = [
    name: "hwMplsApsSwitchFail",
    fields: ["hwMplsPsWorkTunnName", "hwMplsTunnelSignalProto", "hwMplsTunnelSignalledTunnelName"],
    fieldOids: ["hwMplsPsWorkTunnName": "1.3.6.1.4.1.2011.5.12.7.1.3.1.1.3", "hwMplsTunnelSignalProto": "1.3.6.1.4.1.2011.5.25.121.1.1.1.30", "hwMplsTunnelSignalledTunnelName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.33"]
]

// --- hwMplsApsSwitchFailRecovery (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.12.7.1.4.12
// Fields: hwMplsPsWorkTunnName, hwMplsTunnelSignalProto, hwMplsTunnelSignalledTunnelName
// Description: Tunnel protection group recovered from defect state.
trapMap["1.3.6.1.4.1.2011.5.12.7.1.4.12"] = [
    name: "hwMplsApsSwitchFailRecovery",
    fields: ["hwMplsPsWorkTunnName", "hwMplsTunnelSignalProto", "hwMplsTunnelSignalledTunnelName"],
    fieldOids: ["hwMplsPsWorkTunnName": "1.3.6.1.4.1.2011.5.12.7.1.3.1.1.3", "hwMplsTunnelSignalProto": "1.3.6.1.4.1.2011.5.25.121.1.1.1.30", "hwMplsTunnelSignalledTunnelName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.33"]
]

// --- hwMplsApsPathMisMatch (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.12.7.1.4.13
// Fields: hwMplsPsWorkTunnName, hwMplsApsMismatchReason, hwMplsTunnelSignalledTunnelName
// Description: Working or protection path mismatch are detected by APS frame.
trapMap["1.3.6.1.4.1.2011.5.12.7.1.4.13"] = [
    name: "hwMplsApsPathMisMatch",
    fields: ["hwMplsPsWorkTunnName", "hwMplsApsMismatchReason", "hwMplsTunnelSignalledTunnelName"],
    fieldOids: ["hwMplsPsWorkTunnName": "1.3.6.1.4.1.2011.5.12.7.1.3.1.1.3", "hwMplsApsMismatchReason": "1.3.6.1.4.1.2011.5.12.7.1.3.4", "hwMplsTunnelSignalledTunnelName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.33"]
]

// --- hwMplsApsPathMisMatchRecovery (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.12.7.1.4.14
// Fields: hwMplsPsWorkTunnName, hwMplsApsMismatchReason, hwMplsTunnelSignalledTunnelName
// Description: Working or protection path mismatch recovery are detected by APS frame.
trapMap["1.3.6.1.4.1.2011.5.12.7.1.4.14"] = [
    name: "hwMplsApsPathMisMatchRecovery",
    fields: ["hwMplsPsWorkTunnName", "hwMplsApsMismatchReason", "hwMplsTunnelSignalledTunnelName"],
    fieldOids: ["hwMplsPsWorkTunnName": "1.3.6.1.4.1.2011.5.12.7.1.3.1.1.3", "hwMplsApsMismatchReason": "1.3.6.1.4.1.2011.5.12.7.1.3.4", "hwMplsTunnelSignalledTunnelName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.33"]
]

// --- hwMplsApsTypeMisMatch (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.12.7.1.4.15
// Fields: hwMplsPsWorkTunnName, hwMplsApsMismatchReason, hwMplsTunnelSignalledTunnelName
// Description: Working or protection type mismatch are detected by APS frame.
trapMap["1.3.6.1.4.1.2011.5.12.7.1.4.15"] = [
    name: "hwMplsApsTypeMisMatch",
    fields: ["hwMplsPsWorkTunnName", "hwMplsApsMismatchReason", "hwMplsTunnelSignalledTunnelName"],
    fieldOids: ["hwMplsPsWorkTunnName": "1.3.6.1.4.1.2011.5.12.7.1.3.1.1.3", "hwMplsApsMismatchReason": "1.3.6.1.4.1.2011.5.12.7.1.3.4", "hwMplsTunnelSignalledTunnelName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.33"]
]

// --- hwMplsApsTypeMisMatchRecovery (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.12.7.1.4.16
// Fields: hwMplsPsWorkTunnName, hwMplsApsMismatchReason, hwMplsTunnelSignalledTunnelName
// Description: Working or protection type mismatch recovery are detected by APS frame.
trapMap["1.3.6.1.4.1.2011.5.12.7.1.4.16"] = [
    name: "hwMplsApsTypeMisMatchRecovery",
    fields: ["hwMplsPsWorkTunnName", "hwMplsApsMismatchReason", "hwMplsTunnelSignalledTunnelName"],
    fieldOids: ["hwMplsPsWorkTunnName": "1.3.6.1.4.1.2011.5.12.7.1.3.1.1.3", "hwMplsApsMismatchReason": "1.3.6.1.4.1.2011.5.12.7.1.3.4", "hwMplsTunnelSignalledTunnelName": "1.3.6.1.4.1.2011.5.25.121.1.1.1.33"]
]

// ===== Parsing logic =====

// Set to true to enable diagnostic logging for this MIB parser
DEBUG = false

LOG_PREFIX = "[HUAWEI-MPLSOAM-MIB]"
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
