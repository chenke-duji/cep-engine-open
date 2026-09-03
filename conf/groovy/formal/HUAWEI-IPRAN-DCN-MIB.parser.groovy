/**
 * Auto-generated from HUAWEI-IPRAN-DCN-MIB.mib
 * Generated: 2026-08-24T18:28:29.988100200
 * Traps/Notifications (16): hwIpRanDcnNeNumberOverLoad, hwIpRanDcnNeNumberOverLoadRecovery, hwIpRanDcnNeOnline, hwIpRanDcnNeOffline, hwIpRanCTDcnNeOnline, hwIpRanDcnGNENeOnline, hwIpRanSSLAuthFailure, hwIpRanDcnApVerMismatch, hwIpRanDcnNeIncreaseExceedLimit, hwIpRanDcnForceUserLogout, hwIpRanDcnNeIdConflict, hwIpRanDcnNeIdConflictRecovery, hwIpRanDcnNeIpConflict, hwIpRanDcnNeIpConflictRecovery, hwIpRanDcnSerialReachLimit, hwIpRanDcnSerialReachLimitClear
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

// --- hwIpRanDcnNeNumberOverLoad (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.300.1.3.1
// Fields: hwIpRanDcnNeNumber
// Description: This object is used to indicate NE number overload.
trapMap["1.3.6.1.4.1.2011.5.25.300.1.3.1"] = [
    name: "hwIpRanDcnNeNumberOverLoad",
    fields: ["hwIpRanDcnNeNumber"],
    fieldOids: ["hwIpRanDcnNeNumber": "1.3.6.1.4.1.2011.5.25.300.1.2.1"]
]

// --- hwIpRanDcnNeNumberOverLoadRecovery (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.300.1.3.2
// Fields: hwIpRanDcnNeNumber
// Description: This object is used to indicate NE number overload recovery.
trapMap["1.3.6.1.4.1.2011.5.25.300.1.3.2"] = [
    name: "hwIpRanDcnNeNumberOverLoadRecovery",
    fields: ["hwIpRanDcnNeNumber"],
    fieldOids: ["hwIpRanDcnNeNumber": "1.3.6.1.4.1.2011.5.25.300.1.2.1"]
]

// --- hwIpRanDcnNeOnline (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.300.1.3.3
// Fields: hwIpRanDcnNeChangeMode, hwIpRanDcnNeInfoNeId, hwIpRanDcnNeInfoNeIpType, hwIpRanDcnNeInfoNeIp, hwIpRanDcnNeInfoNeIpMask, hwIpRanDcnNeNumber, hwIpRanDcnNeInfoNeLoginMode, hwIpRanDcnNeInfoPnpState, hwIpRanDcnNeInfoEsn, hwIpRanDcnNeInfoVlanId
// Description: This object is used to indicate NE on-line.
trapMap["1.3.6.1.4.1.2011.5.25.300.1.3.3"] = [
    name: "hwIpRanDcnNeOnline",
    fields: ["hwIpRanDcnNeChangeMode", "hwIpRanDcnNeInfoNeId", "hwIpRanDcnNeInfoNeIpType", "hwIpRanDcnNeInfoNeIp", "hwIpRanDcnNeInfoNeIpMask", "hwIpRanDcnNeNumber", "hwIpRanDcnNeInfoNeLoginMode", "hwIpRanDcnNeInfoPnpState", "hwIpRanDcnNeInfoEsn", "hwIpRanDcnNeInfoVlanId"],
    fieldOids: ["hwIpRanDcnNeChangeMode": "1.3.6.1.4.1.2011.5.25.300.1.2.2", "hwIpRanDcnNeInfoNeId": "1.3.6.1.4.1.2011.5.25.300.1.1.2.1.1", "hwIpRanDcnNeInfoNeIpType": "1.3.6.1.4.1.2011.5.25.300.1.1.2.1.2", "hwIpRanDcnNeInfoNeIp": "1.3.6.1.4.1.2011.5.25.300.1.1.2.1.3", "hwIpRanDcnNeInfoNeIpMask": "1.3.6.1.4.1.2011.5.25.300.1.1.2.1.7", "hwIpRanDcnNeNumber": "1.3.6.1.4.1.2011.5.25.300.1.2.1", "hwIpRanDcnNeInfoNeLoginMode": "1.3.6.1.4.1.2011.5.25.300.1.1.2.1.8", "hwIpRanDcnNeInfoPnpState": "1.3.6.1.4.1.2011.5.25.300.1.1.2.1.9", "hwIpRanDcnNeInfoEsn": "1.3.6.1.4.1.2011.5.25.300.1.1.2.1.10", "hwIpRanDcnNeInfoVlanId": "1.3.6.1.4.1.2011.5.25.300.1.1.2.1.11"]
]

// --- hwIpRanDcnNeOffline (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.300.1.3.4
// Fields: hwIpRanDcnNeInfoNeId, hwIpRanDcnNeInfoNeIpType, hwIpRanDcnNeInfoNeIp, hwIpRanDcnNeInfoNeLoginMode
// Description: This object is used to indicate NE off-line.
trapMap["1.3.6.1.4.1.2011.5.25.300.1.3.4"] = [
    name: "hwIpRanDcnNeOffline",
    fields: ["hwIpRanDcnNeInfoNeId", "hwIpRanDcnNeInfoNeIpType", "hwIpRanDcnNeInfoNeIp", "hwIpRanDcnNeInfoNeLoginMode"],
    fieldOids: ["hwIpRanDcnNeInfoNeId": "1.3.6.1.4.1.2011.5.25.300.1.1.2.1.1", "hwIpRanDcnNeInfoNeIpType": "1.3.6.1.4.1.2011.5.25.300.1.1.2.1.2", "hwIpRanDcnNeInfoNeIp": "1.3.6.1.4.1.2011.5.25.300.1.1.2.1.3", "hwIpRanDcnNeInfoNeLoginMode": "1.3.6.1.4.1.2011.5.25.300.1.1.2.1.8"]
]

// --- hwIpRanCTDcnNeOnline (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.300.1.3.5
// Fields: hwIpRanDcnElementInfoNeId, hwIpRanDcnElementInfoNeIp, hwIpRanDcnElementInfoCompany, hwIpRanDcnElementInfoDeviceType, hwIpRanDcnElementInfoMacAddress
// Description: This object is used to indicate CT NE on-line.
trapMap["1.3.6.1.4.1.2011.5.25.300.1.3.5"] = [
    name: "hwIpRanCTDcnNeOnline",
    fields: ["hwIpRanDcnElementInfoNeId", "hwIpRanDcnElementInfoNeIp", "hwIpRanDcnElementInfoCompany", "hwIpRanDcnElementInfoDeviceType", "hwIpRanDcnElementInfoMacAddress"],
    fieldOids: ["hwIpRanDcnElementInfoNeId": "1.3.6.1.4.1.2011.5.25.300.1.1.3.1.1", "hwIpRanDcnElementInfoNeIp": "1.3.6.1.4.1.2011.5.25.300.1.1.3.1.3", "hwIpRanDcnElementInfoCompany": "1.3.6.1.4.1.2011.5.25.300.1.1.3.1.4", "hwIpRanDcnElementInfoDeviceType": "1.3.6.1.4.1.2011.5.25.300.1.1.3.1.5", "hwIpRanDcnElementInfoMacAddress": "1.3.6.1.4.1.2011.5.25.300.1.1.3.1.6"]
]

// --- hwIpRanDcnGNENeOnline (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.300.1.3.6
// Fields: hwIpRanDcnFlag, hwIpRanDcnGNEFlag, hwIpRanDcnElementInfoNeId, hwIpRanDcnNeIpType, hwIpRanDcnNeIp, hwIpRanDcnNodeId, hwIpRanDcnGNENSAP, hwIpRanDcnElementInfoDeviceType, hwIpRanDcnNeInfoHostName, hwIpRanDcnNeInfoNeId
// Description: When an NE went online in PTN mode, this trap will be triggered.
trapMap["1.3.6.1.4.1.2011.5.25.300.1.3.6"] = [
    name: "hwIpRanDcnGNENeOnline",
    fields: ["hwIpRanDcnFlag", "hwIpRanDcnGNEFlag", "hwIpRanDcnElementInfoNeId", "hwIpRanDcnNeIpType", "hwIpRanDcnNeIp", "hwIpRanDcnNodeId", "hwIpRanDcnGNENSAP", "hwIpRanDcnElementInfoDeviceType", "hwIpRanDcnNeInfoHostName", "hwIpRanDcnNeInfoNeId"],
    fieldOids: ["hwIpRanDcnFlag": "1.3.6.1.4.1.2011.5.25.300.1.2.3", "hwIpRanDcnGNEFlag": "1.3.6.1.4.1.2011.5.25.300.1.2.4", "hwIpRanDcnElementInfoNeId": "1.3.6.1.4.1.2011.5.25.300.1.1.3.1.1", "hwIpRanDcnNeIpType": "1.3.6.1.4.1.2011.5.25.300.1.1.1.2", "hwIpRanDcnNeIp": "1.3.6.1.4.1.2011.5.25.300.1.1.1.3", "hwIpRanDcnNodeId": "1.3.6.1.4.1.2011.5.25.300.1.2.5", "hwIpRanDcnGNENSAP": "1.3.6.1.4.1.2011.5.25.300.1.2.6", "hwIpRanDcnElementInfoDeviceType": "1.3.6.1.4.1.2011.5.25.300.1.1.3.1.5", "hwIpRanDcnNeInfoHostName": "1.3.6.1.4.1.2011.5.25.300.1.1.2.1.6", "hwIpRanDcnNeInfoNeId": "1.3.6.1.4.1.2011.5.25.300.1.1.2.1.1"]
]

// --- hwIpRanSSLAuthFailure (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.300.1.3.7
// Fields: hwIpRanSourceAddress, hwIpRanSourcePort, hwIpRanDestinationAddress, hwIpRanDestinationPort, hwIpRanVpn, hwIpRanSSLAuthFailedTimes, hwIpRanSSLAuthFailedPeriod
// Description: This object is used to indicate SSL certificate login failure times during 60s. The default login failure report times is 10.
trapMap["1.3.6.1.4.1.2011.5.25.300.1.3.7"] = [
    name: "hwIpRanSSLAuthFailure",
    fields: ["hwIpRanSourceAddress", "hwIpRanSourcePort", "hwIpRanDestinationAddress", "hwIpRanDestinationPort", "hwIpRanVpn", "hwIpRanSSLAuthFailedTimes", "hwIpRanSSLAuthFailedPeriod"],
    fieldOids: ["hwIpRanSourceAddress": "1.3.6.1.4.1.2011.5.25.300.1.2.7", "hwIpRanSourcePort": "1.3.6.1.4.1.2011.5.25.300.1.2.8", "hwIpRanDestinationAddress": "1.3.6.1.4.1.2011.5.25.300.1.2.9", "hwIpRanDestinationPort": "1.3.6.1.4.1.2011.5.25.300.1.2.10", "hwIpRanVpn": "1.3.6.1.4.1.2011.5.25.300.1.2.11", "hwIpRanSSLAuthFailedTimes": "1.3.6.1.4.1.2011.5.25.300.1.2.12", "hwIpRanSSLAuthFailedPeriod": "1.3.6.1.4.1.2011.5.25.300.1.2.13"]
]

// --- hwIpRanDcnApVerMismatch (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.300.1.3.8
// Fields: hwIpRanDcnNvInfoApId, hwIpRanDcnNvInfoApVer, hwIpRanDcnNvInfoMasterVer
// Description: This object is used to indicate AP version mismatch with Master.
trapMap["1.3.6.1.4.1.2011.5.25.300.1.3.8"] = [
    name: "hwIpRanDcnApVerMismatch",
    fields: ["hwIpRanDcnNvInfoApId", "hwIpRanDcnNvInfoApVer", "hwIpRanDcnNvInfoMasterVer"],
    fieldOids: ["hwIpRanDcnNvInfoApId": "1.3.6.1.4.1.2011.5.25.300.1.2.14", "hwIpRanDcnNvInfoApVer": "1.3.6.1.4.1.2011.5.25.300.1.2.15", "hwIpRanDcnNvInfoMasterVer": "1.3.6.1.4.1.2011.5.25.300.1.2.16"]
]

// --- hwIpRanDcnNeIncreaseExceedLimit (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.300.1.3.9
// Fields: hwIpRanDcnIfName, hwIpRanDcnMainIfName, hwIpRanDcnLastNumber, hwIpRanDcnCurrNumber, hwIpRanDcnExceedTime
// Description: This object is used to indicate the DCN NE increase rate exceeds the upper limit.
trapMap["1.3.6.1.4.1.2011.5.25.300.1.3.9"] = [
    name: "hwIpRanDcnNeIncreaseExceedLimit",
    fields: ["hwIpRanDcnIfName", "hwIpRanDcnMainIfName", "hwIpRanDcnLastNumber", "hwIpRanDcnCurrNumber", "hwIpRanDcnExceedTime"],
    fieldOids: ["hwIpRanDcnIfName": "1.3.6.1.4.1.2011.5.25.300.1.2.17", "hwIpRanDcnMainIfName": "1.3.6.1.4.1.2011.5.25.300.1.2.18", "hwIpRanDcnLastNumber": "1.3.6.1.4.1.2011.5.25.300.1.2.19", "hwIpRanDcnCurrNumber": "1.3.6.1.4.1.2011.5.25.300.1.2.20", "hwIpRanDcnExceedTime": "1.3.6.1.4.1.2011.5.25.300.1.2.21"]
]

// --- hwIpRanDcnForceUserLogout (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.300.1.3.10
// Fields: hwIpRanDcnAddress, hwIpRanDcnUserName, hwIpRanDcnOperatorName, hwIpRanDcnUserType
// Description: This object is used to indicate the user was forced logout.
trapMap["1.3.6.1.4.1.2011.5.25.300.1.3.10"] = [
    name: "hwIpRanDcnForceUserLogout",
    fields: ["hwIpRanDcnAddress", "hwIpRanDcnUserName", "hwIpRanDcnOperatorName", "hwIpRanDcnUserType"],
    fieldOids: ["hwIpRanDcnAddress": "1.3.6.1.4.1.2011.5.25.300.1.2.22", "hwIpRanDcnUserName": "1.3.6.1.4.1.2011.5.25.300.1.2.23", "hwIpRanDcnOperatorName": "1.3.6.1.4.1.2011.5.25.300.1.2.24", "hwIpRanDcnUserType": "1.3.6.1.4.1.2011.5.25.300.1.2.25"]
]

// --- hwIpRanDcnNeIdConflict (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.300.1.3.11
// Fields: hwIpRanDcnNeIdIp
// Description: This object is used to indicate NEID conflict.
trapMap["1.3.6.1.4.1.2011.5.25.300.1.3.11"] = [
    name: "hwIpRanDcnNeIdConflict",
    fields: ["hwIpRanDcnNeIdIp"],
    fieldOids: ["hwIpRanDcnNeIdIp": "1.3.6.1.4.1.2011.5.25.300.1.2.26"]
]

// --- hwIpRanDcnNeIdConflictRecovery (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.300.1.3.12
// Fields: hwIpRanDcnNeIdIp
// Description: This object is used to indicate NEID conflict recovery.
trapMap["1.3.6.1.4.1.2011.5.25.300.1.3.12"] = [
    name: "hwIpRanDcnNeIdConflictRecovery",
    fields: ["hwIpRanDcnNeIdIp"],
    fieldOids: ["hwIpRanDcnNeIdIp": "1.3.6.1.4.1.2011.5.25.300.1.2.26"]
]

// --- hwIpRanDcnNeIpConflict (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.300.1.3.13
// Fields: hwIpRanDcnNeIdIp
// Description: This object is used to indicate NEIP conflict.
trapMap["1.3.6.1.4.1.2011.5.25.300.1.3.13"] = [
    name: "hwIpRanDcnNeIpConflict",
    fields: ["hwIpRanDcnNeIdIp"],
    fieldOids: ["hwIpRanDcnNeIdIp": "1.3.6.1.4.1.2011.5.25.300.1.2.26"]
]

// --- hwIpRanDcnNeIpConflictRecovery (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.300.1.3.14
// Fields: hwIpRanDcnNeIdIp
// Description: This object is used to indicate NEIP conflict recovery.
trapMap["1.3.6.1.4.1.2011.5.25.300.1.3.14"] = [
    name: "hwIpRanDcnNeIpConflictRecovery",
    fields: ["hwIpRanDcnNeIdIp"],
    fieldOids: ["hwIpRanDcnNeIdIp": "1.3.6.1.4.1.2011.5.25.300.1.2.26"]
]

// --- hwIpRanDcnSerialReachLimit (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.300.1.3.17
// Fields: hwIpRanDcnSerial
// Description: This object is used to indicate that the number of DCN serial interfaces reached the upper limit.
trapMap["1.3.6.1.4.1.2011.5.25.300.1.3.17"] = [
    name: "hwIpRanDcnSerialReachLimit",
    fields: ["hwIpRanDcnSerial"],
    fieldOids: ["hwIpRanDcnSerial": "1.3.6.1.4.1.2011.5.25.300.1.2.29"]
]

// --- hwIpRanDcnSerialReachLimitClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.300.1.3.18
// Fields: hwIpRanDcnSerial
// Description: This object is used to indicate that the alarm indicating that the number of DCN serial interfaces reached the upper limit was cleared.
trapMap["1.3.6.1.4.1.2011.5.25.300.1.3.18"] = [
    name: "hwIpRanDcnSerialReachLimitClear",
    fields: ["hwIpRanDcnSerial"],
    fieldOids: ["hwIpRanDcnSerial": "1.3.6.1.4.1.2011.5.25.300.1.2.29"]
]

// ===== Parsing logic =====

// Set to true to enable diagnostic logging for this MIB parser
DEBUG = false

LOG_PREFIX = "[HUAWEI-IPRAN-DCN-MIB]"
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
