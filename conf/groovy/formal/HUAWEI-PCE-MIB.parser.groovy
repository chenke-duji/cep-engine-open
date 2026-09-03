/**
 * Auto-generated from HUAWEI-PCE-MIB.mib
 * Generated: 2026-08-24T18:28:30.594477400
 * Traps/Notifications (26): hwPceLspPathChange, hwPceDelegateStateChange, hwPceLspPathChangeResult, hwPceLspOutOfCtrl, hwPceLspOutOfCtrlClear, hwPceAdjacencySIDChange, hwPceTerminalPointStatus, hwPceServerSystemStart, hwPceWaitHaDataSmoothExpire, hwPceWaitHaDataSmoothExpireClear, hwPceUnKnownSessionReceived, hwPceUnKnownSessionReceivedClear, hwPceSessionHasNoDelegatedLsp, hwPceSessionHasNoDelegatedLspClear, hwPceDelgLspReachThreshold, hwPceDelgLspReachThresholdClear, hwPceDelgateResLimitExceed, hwPceDelgateResLimitExceedClear, hwPcePccNodeReachThreshold, hwPcePccNodeReachThresholdClear, hwPceBetterPathFound, hwPceLspPathChangeBuild, hwPceInitiatedLspThreshold, hwPceInitiatedLspThresholdClear, hwPceInitiatedLspLimitExceed, hwPceInitiatedLspLimitExceedClear
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

// --- hwPceLspPathChange (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.322.2.1
// Fields: hwPceLspPathChangeReason, hwPceLspPathChangeTransNumber, hwPceUserHandle
// Description: This notification indicates that LSP path's computation result change.
trapMap["1.3.6.1.4.1.2011.5.25.322.2.1"] = [
    name: "hwPceLspPathChange",
    fields: ["hwPceLspPathChangeReason", "hwPceLspPathChangeTransNumber", "hwPceUserHandle"],
    fieldOids: ["hwPceLspPathChangeReason": "1.3.6.1.4.1.2011.5.25.322.1.1", "hwPceLspPathChangeTransNumber": "1.3.6.1.4.1.2011.5.25.322.1.17", "hwPceUserHandle": "1.3.6.1.4.1.2011.5.25.322.1.19"]
]

// --- hwPceDelegateStateChange (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.322.2.2
// Fields: hwPceDelegateStateChangeReason
// Description: This notification indicates that delegate LSP State change.
trapMap["1.3.6.1.4.1.2011.5.25.322.2.2"] = [
    name: "hwPceDelegateStateChange",
    fields: ["hwPceDelegateStateChangeReason"],
    fieldOids: ["hwPceDelegateStateChangeReason": "1.3.6.1.4.1.2011.5.25.322.1.2"]
]

// --- hwPceLspPathChangeResult (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.322.2.3
// Fields: hwPceLspPathChangeSN, hwPceLspPathChangeResultInfo, hwPceUserHandle
// Description: This notification indicates current Path changed LSP Batch ID information.
trapMap["1.3.6.1.4.1.2011.5.25.322.2.3"] = [
    name: "hwPceLspPathChangeResult",
    fields: ["hwPceLspPathChangeSN", "hwPceLspPathChangeResultInfo", "hwPceUserHandle"],
    fieldOids: ["hwPceLspPathChangeSN": "1.3.6.1.4.1.2011.5.25.322.1.3", "hwPceLspPathChangeResultInfo": "1.3.6.1.4.1.2011.5.25.322.1.4", "hwPceUserHandle": "1.3.6.1.4.1.2011.5.25.322.1.19"]
]

// --- hwPceLspOutOfCtrl (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.322.2.4
// Description: This notification indicates that some PCE LSP is out of control.
trapMap["1.3.6.1.4.1.2011.5.25.322.2.4"] = [
    name: "hwPceLspOutOfCtrl",
    fields: [],
    fieldOids: []
]

// --- hwPceLspOutOfCtrlClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.322.2.5
// Description: This notification indicates that no more PCE LSP is out of control.
trapMap["1.3.6.1.4.1.2011.5.25.322.2.5"] = [
    name: "hwPceLspOutOfCtrlClear",
    fields: [],
    fieldOids: []
]

// --- hwPceAdjacencySIDChange (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.322.2.6
// Fields: hwPceAdjSIDTransactionNum, hwPceAdjacencyLocalNodeId, hwPceAdjacencyLocalTpId, hwPceAdjacencyRemoteNodeId, hwPceAdjacencyRemoteTpId, hwPceAdjacencySIDOper, hwPceAdjacencySID
// Description: This notification indicates the adjency SID change.
trapMap["1.3.6.1.4.1.2011.5.25.322.2.6"] = [
    name: "hwPceAdjacencySIDChange",
    fields: ["hwPceAdjSIDTransactionNum", "hwPceAdjacencyLocalNodeId", "hwPceAdjacencyLocalTpId", "hwPceAdjacencyRemoteNodeId", "hwPceAdjacencyRemoteTpId", "hwPceAdjacencySIDOper", "hwPceAdjacencySID"],
    fieldOids: ["hwPceAdjSIDTransactionNum": "1.3.6.1.4.1.2011.5.25.322.1.11", "hwPceAdjacencyLocalNodeId": "1.3.6.1.4.1.2011.5.25.322.1.5", "hwPceAdjacencyLocalTpId": "1.3.6.1.4.1.2011.5.25.322.1.6", "hwPceAdjacencyRemoteNodeId": "1.3.6.1.4.1.2011.5.25.322.1.7", "hwPceAdjacencyRemoteTpId": "1.3.6.1.4.1.2011.5.25.322.1.8", "hwPceAdjacencySIDOper": "1.3.6.1.4.1.2011.5.25.322.1.9", "hwPceAdjacencySID": "1.3.6.1.4.1.2011.5.25.322.1.10"]
]

// --- hwPceTerminalPointStatus (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.322.2.7
// Fields: hwPceTPStatusNodeType, hwPceTPStatusNodeId, hwPceTPStatusTPKeyType, hwPceTPStatusTPKeyId, hwPceTPStatusPortStatus
// Description: This notification indicates the terminal point status.
trapMap["1.3.6.1.4.1.2011.5.25.322.2.7"] = [
    name: "hwPceTerminalPointStatus",
    fields: ["hwPceTPStatusNodeType", "hwPceTPStatusNodeId", "hwPceTPStatusTPKeyType", "hwPceTPStatusTPKeyId", "hwPceTPStatusPortStatus"],
    fieldOids: ["hwPceTPStatusNodeType": "1.3.6.1.4.1.2011.5.25.322.1.13", "hwPceTPStatusNodeId": "1.3.6.1.4.1.2011.5.25.322.1.14", "hwPceTPStatusTPKeyType": "1.3.6.1.4.1.2011.5.25.322.1.15", "hwPceTPStatusTPKeyId": "1.3.6.1.4.1.2011.5.25.322.1.16", "hwPceTPStatusPortStatus": "1.3.6.1.4.1.2011.5.25.322.1.12"]
]

// --- hwPceServerSystemStart (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.322.2.8
// Description: This notification indicates that PCE server system is started and waiting for role type.
trapMap["1.3.6.1.4.1.2011.5.25.322.2.8"] = [
    name: "hwPceServerSystemStart",
    fields: [],
    fieldOids: []
]

// --- hwPceWaitHaDataSmoothExpire (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.322.2.9
// Fields: hwPceWaitHaDataSmoothExpireTime
// Description: This notification indicates that PCE server wait ha batch update message expired.
trapMap["1.3.6.1.4.1.2011.5.25.322.2.9"] = [
    name: "hwPceWaitHaDataSmoothExpire",
    fields: ["hwPceWaitHaDataSmoothExpireTime"],
    fieldOids: ["hwPceWaitHaDataSmoothExpireTime": "1.3.6.1.4.1.2011.5.25.322.1.18"]
]

// --- hwPceWaitHaDataSmoothExpireClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.322.2.10
// Description: This notification indicates that PCE erver has received ha batch message.
trapMap["1.3.6.1.4.1.2011.5.25.322.2.10"] = [
    name: "hwPceWaitHaDataSmoothExpireClear",
    fields: [],
    fieldOids: []
]

// --- hwPceUnKnownSessionReceived (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.322.2.11
// Fields: pcePcepSessState
// Description: This notification indicates that PCE server received request from unknown client.
trapMap["1.3.6.1.4.1.2011.5.25.322.2.11"] = [
    name: "hwPceUnKnownSessionReceived",
    fields: ["pcePcepSessState"],
    fieldOids: ["pcePcepSessState": "1.3.6.1.2.1.227.1.3.1.3"]
]

// --- hwPceUnKnownSessionReceivedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.322.2.12
// Fields: pcePcepSessState
// Description: This notification indicates that PCEP session has confirmed.
trapMap["1.3.6.1.4.1.2011.5.25.322.2.12"] = [
    name: "hwPceUnKnownSessionReceivedClear",
    fields: ["pcePcepSessState"],
    fieldOids: ["pcePcepSessState": "1.3.6.1.2.1.227.1.3.1.3"]
]

// --- hwPceSessionHasNoDelegatedLsp (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.322.2.13
// Fields: pcePcepSessState
// Description: This notification indicates that PCEP session has non delegete LSP.
trapMap["1.3.6.1.4.1.2011.5.25.322.2.13"] = [
    name: "hwPceSessionHasNoDelegatedLsp",
    fields: ["pcePcepSessState"],
    fieldOids: ["pcePcepSessState": "1.3.6.1.2.1.227.1.3.1.3"]
]

// --- hwPceSessionHasNoDelegatedLspClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.322.2.14
// Fields: pcePcepSessState
// Description: This notification indicates that PCEP session receive delegated LSP.
trapMap["1.3.6.1.4.1.2011.5.25.322.2.14"] = [
    name: "hwPceSessionHasNoDelegatedLspClear",
    fields: ["pcePcepSessState"],
    fieldOids: ["pcePcepSessState": "1.3.6.1.2.1.227.1.3.1.3"]
]

// --- hwPceDelgLspReachThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.322.2.15
// Fields: hwPceDelegateLspThresholdCount, hwPceDelegateLspLimitCount
// Description: This notification indicates that the number of delegated LSP count reached threshold limit.
trapMap["1.3.6.1.4.1.2011.5.25.322.2.15"] = [
    name: "hwPceDelgLspReachThreshold",
    fields: ["hwPceDelegateLspThresholdCount", "hwPceDelegateLspLimitCount"],
    fieldOids: ["hwPceDelegateLspThresholdCount": "1.3.6.1.4.1.2011.5.25.322.1.20", "hwPceDelegateLspLimitCount": "1.3.6.1.4.1.2011.5.25.322.1.21"]
]

// --- hwPceDelgLspReachThresholdClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.322.2.16
// Fields: hwPceDelegateLspThresholdCount, hwPceDelegateLspLimitCount
// Description: This notification indicates that the number of delegated LSP count falls under threshold limit.
trapMap["1.3.6.1.4.1.2011.5.25.322.2.16"] = [
    name: "hwPceDelgLspReachThresholdClear",
    fields: ["hwPceDelegateLspThresholdCount", "hwPceDelegateLspLimitCount"],
    fieldOids: ["hwPceDelegateLspThresholdCount": "1.3.6.1.4.1.2011.5.25.322.1.20", "hwPceDelegateLspLimitCount": "1.3.6.1.4.1.2011.5.25.322.1.21"]
]

// --- hwPceDelgateResLimitExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.322.2.17
// Description: This notification indicates that PCE server is entering resource limit exceeded state.
trapMap["1.3.6.1.4.1.2011.5.25.322.2.17"] = [
    name: "hwPceDelgateResLimitExceed",
    fields: [],
    fieldOids: []
]

// --- hwPceDelgateResLimitExceedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.322.2.18
// Description: This notification indicates that PCE server is exiting resource limit exceeded state.
trapMap["1.3.6.1.4.1.2011.5.25.322.2.18"] = [
    name: "hwPceDelgateResLimitExceedClear",
    fields: [],
    fieldOids: []
]

// --- hwPcePccNodeReachThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.322.2.19
// Fields: hwPcePccNodeThresholdCount, hwPcePccNodeLimitCount
// Description: This notification indicates that the number of Pcc Node count reached threshold limit.
trapMap["1.3.6.1.4.1.2011.5.25.322.2.19"] = [
    name: "hwPcePccNodeReachThreshold",
    fields: ["hwPcePccNodeThresholdCount", "hwPcePccNodeLimitCount"],
    fieldOids: ["hwPcePccNodeThresholdCount": "1.3.6.1.4.1.2011.5.25.322.1.22", "hwPcePccNodeLimitCount": "1.3.6.1.4.1.2011.5.25.322.1.23"]
]

// --- hwPcePccNodeReachThresholdClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.322.2.20
// Fields: hwPcePccNodeThresholdCount, hwPcePccNodeLimitCount
// Description: This notification indicates that the number of Pcc Node count falls under threshold limit.
trapMap["1.3.6.1.4.1.2011.5.25.322.2.20"] = [
    name: "hwPcePccNodeReachThresholdClear",
    fields: ["hwPcePccNodeThresholdCount", "hwPcePccNodeLimitCount"],
    fieldOids: ["hwPcePccNodeThresholdCount": "1.3.6.1.4.1.2011.5.25.322.1.22", "hwPcePccNodeLimitCount": "1.3.6.1.4.1.2011.5.25.322.1.23"]
]

// --- hwPceBetterPathFound (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.322.2.21
// Fields: hwPceLinkLeftNodeId, hwPceLinkLeftTpIp, hwPceLinkRightNodeId, hwPceLinkRightTpIp
// Description: This notification indicates that the TE tunnel has a better path.
trapMap["1.3.6.1.4.1.2011.5.25.322.2.21"] = [
    name: "hwPceBetterPathFound",
    fields: ["hwPceLinkLeftNodeId", "hwPceLinkLeftTpIp", "hwPceLinkRightNodeId", "hwPceLinkRightTpIp"],
    fieldOids: ["hwPceLinkLeftNodeId": "1.3.6.1.4.1.2011.5.25.322.1.24", "hwPceLinkLeftTpIp": "1.3.6.1.4.1.2011.5.25.322.1.25", "hwPceLinkRightNodeId": "1.3.6.1.4.1.2011.5.25.322.1.26", "hwPceLinkRightTpIp": "1.3.6.1.4.1.2011.5.25.322.1.27"]
]

// --- hwPceLspPathChangeBuild (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.322.2.22
// Fields: hwPceLspPathChangeReason, hwPceLspPathChangeSN, hwPceUserHandle
// Description: This notification indicates that the TE tunnel is building.
trapMap["1.3.6.1.4.1.2011.5.25.322.2.22"] = [
    name: "hwPceLspPathChangeBuild",
    fields: ["hwPceLspPathChangeReason", "hwPceLspPathChangeSN", "hwPceUserHandle"],
    fieldOids: ["hwPceLspPathChangeReason": "1.3.6.1.4.1.2011.5.25.322.1.1", "hwPceLspPathChangeSN": "1.3.6.1.4.1.2011.5.25.322.1.3", "hwPceUserHandle": "1.3.6.1.4.1.2011.5.25.322.1.19"]
]

// --- hwPceInitiatedLspThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.322.2.23
// Fields: hwPceInitiatedLspCurrCount, hwPceInitiatedLspThresholdCount, hwPceInitiatedLspLimitCount
// Description: This notification indicates that the number of PCE-Initiated LSPs reaches threshold limit.
trapMap["1.3.6.1.4.1.2011.5.25.322.2.23"] = [
    name: "hwPceInitiatedLspThreshold",
    fields: ["hwPceInitiatedLspCurrCount", "hwPceInitiatedLspThresholdCount", "hwPceInitiatedLspLimitCount"],
    fieldOids: ["hwPceInitiatedLspCurrCount": "1.3.6.1.4.1.2011.5.25.322.1.30", "hwPceInitiatedLspThresholdCount": "1.3.6.1.4.1.2011.5.25.322.1.28", "hwPceInitiatedLspLimitCount": "1.3.6.1.4.1.2011.5.25.322.1.29"]
]

// --- hwPceInitiatedLspThresholdClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.322.2.24
// Fields: hwPceInitiatedLspCurrCount, hwPceInitiatedLspThresholdCount, hwPceInitiatedLspLimitCount
// Description: This notification indicates that the number of PCE-Initiated LSPs falls below threshold limit.
trapMap["1.3.6.1.4.1.2011.5.25.322.2.24"] = [
    name: "hwPceInitiatedLspThresholdClear",
    fields: ["hwPceInitiatedLspCurrCount", "hwPceInitiatedLspThresholdCount", "hwPceInitiatedLspLimitCount"],
    fieldOids: ["hwPceInitiatedLspCurrCount": "1.3.6.1.4.1.2011.5.25.322.1.30", "hwPceInitiatedLspThresholdCount": "1.3.6.1.4.1.2011.5.25.322.1.28", "hwPceInitiatedLspLimitCount": "1.3.6.1.4.1.2011.5.25.322.1.29"]
]

// --- hwPceInitiatedLspLimitExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.322.2.25
// Fields: hwPceInitiatedLspLimitCount
// Description: This notification indicates that PCE-Initiated LSPs reaches upper limit.
trapMap["1.3.6.1.4.1.2011.5.25.322.2.25"] = [
    name: "hwPceInitiatedLspLimitExceed",
    fields: ["hwPceInitiatedLspLimitCount"],
    fieldOids: ["hwPceInitiatedLspLimitCount": "1.3.6.1.4.1.2011.5.25.322.1.29"]
]

// --- hwPceInitiatedLspLimitExceedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.322.2.26
// Fields: hwPceInitiatedLspLimitCount
// Description: This notification indicates that PCE-Initiated LSPs falls below upper limit.
trapMap["1.3.6.1.4.1.2011.5.25.322.2.26"] = [
    name: "hwPceInitiatedLspLimitExceedClear",
    fields: ["hwPceInitiatedLspLimitCount"],
    fieldOids: ["hwPceInitiatedLspLimitCount": "1.3.6.1.4.1.2011.5.25.322.1.29"]
]

// ===== Parsing logic =====

// Set to true to enable diagnostic logging for this MIB parser
DEBUG = false

LOG_PREFIX = "[HUAWEI-PCE-MIB]"
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
