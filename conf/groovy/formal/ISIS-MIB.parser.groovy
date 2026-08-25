/**
 * Auto-generated from ISIS-MIB.mib
 * Generated: 2026-08-25T16:47:05.997466500
 * Traps/Notifications (17): isisDatabaseOverload, isisManualAddressDrops, isisCorruptedLSPDetected, isisAttemptToExceedMaxSequence, isisIDLenMismatch, isisMaxAreaAddressesMismatch, isisOwnLSPPurge, isisSequenceNumberSkip, isisAuthenticationTypeFailure, isisAuthenticationFailure, isisVersionSkew, isisAreaMismatch, isisRejectedAdjacency, isisLSPTooLargeToPropagate, isisOrigLSPBuffSizeMismatch, isisProtocolsSupportedMismatch, isisAdjacencyChange
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

// --- isisDatabaseOverload (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.3.37.2.0.1
// Fields: isisSysInstance, isisSysLevelIndex, isisSysLevelOverloadState
// Description: This notification is generated when the system enters or leaves the Overload state. The number of times this has be generated and cleared is kept track of by isisSysStatLSPDbaseOloads.
trapMap["1.3.6.1.3.37.2.0.1"] = [
    name: "isisDatabaseOverload",
    fields: ["isisSysInstance", "isisSysLevelIndex", "isisSysLevelOverloadState"],
    fieldOids: ["isisSysInstance": "1.3.6.1.3.37.1.1.1.1.1", "isisSysLevelIndex": "1.3.6.1.3.37.1.2.1.1.1", "isisSysLevelOverloadState": "1.3.6.1.3.37.1.2.1.1.4"]
]

// --- isisManualAddressDrops (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.3.37.2.0.2
// Fields: isisSysInstance, isisSysLevelIndex, isisManAreaAddrExistState
// Description: This notification is generated when one of the manual areaAddresses assigned to this system is ignored when computing routes. The object isisManAreaAddrExistState describes the area that has been drop...
trapMap["1.3.6.1.3.37.2.0.2"] = [
    name: "isisManualAddressDrops",
    fields: ["isisSysInstance", "isisSysLevelIndex", "isisManAreaAddrExistState"],
    fieldOids: ["isisSysInstance": "1.3.6.1.3.37.1.1.1.1.1", "isisSysLevelIndex": "1.3.6.1.3.37.1.2.1.1.1", "isisManAreaAddrExistState": "1.3.6.1.3.37.1.1.2.1.2"]
]

// --- isisCorruptedLSPDetected (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.3.37.2.0.3
// Fields: isisSysInstance, isisSysLevelIndex, isisPduLspId
// Description: This notification is generated when we find that an LSP that was stored in memory has become corrupted. The number of times this has been generated is counted by isisSysCorrLSPs. We forward an LSP ID....
trapMap["1.3.6.1.3.37.2.0.3"] = [
    name: "isisCorruptedLSPDetected",
    fields: ["isisSysInstance", "isisSysLevelIndex", "isisPduLspId"],
    fieldOids: ["isisSysInstance": "1.3.6.1.3.37.1.1.1.1.1", "isisSysLevelIndex": "1.3.6.1.3.37.1.2.1.1.1", "isisPduLspId": "1.3.6.1.3.37.1.10.1.1.1"]
]

// --- isisAttemptToExceedMaxSequence (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.3.37.2.0.4
// Fields: isisSysInstance, isisSysLevelIndex, isisPduLspId
// Description: When the sequence number on an LSP we generate wraps the 32 bit sequence counter, we purge and wait to re-announce this information. This notification describes that event. Since these should not be g...
trapMap["1.3.6.1.3.37.2.0.4"] = [
    name: "isisAttemptToExceedMaxSequence",
    fields: ["isisSysInstance", "isisSysLevelIndex", "isisPduLspId"],
    fieldOids: ["isisSysInstance": "1.3.6.1.3.37.1.1.1.1.1", "isisSysLevelIndex": "1.3.6.1.3.37.1.2.1.1.1", "isisPduLspId": "1.3.6.1.3.37.1.10.1.1.1"]
]

// --- isisIDLenMismatch (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.3.37.2.0.5
// Fields: isisSysInstance, isisSysLevelIndex, isisPduFieldLen, isisCircIfIndex, isisPduFragment, ifName
// Description: A notification sent when we receive a PDU with a different value of the System ID Length. This notification includes the an index to identify the circuit where we saw the PDU and the header of the PDU...
trapMap["1.3.6.1.3.37.2.0.5"] = [
    name: "isisIDLenMismatch",
    fields: ["isisSysInstance", "isisSysLevelIndex", "isisPduFieldLen", "isisCircIfIndex", "isisPduFragment", "ifName"],
    fieldOids: ["isisSysInstance": "1.3.6.1.3.37.1.1.1.1.1", "isisSysLevelIndex": "1.3.6.1.3.37.1.2.1.1.1", "isisPduFieldLen": "1.3.6.1.3.37.1.10.1.1.3", "isisCircIfIndex": "1.3.6.1.3.37.1.3.1.1.2", "isisPduFragment": "1.3.6.1.3.37.1.10.1.1.2", "ifName": "1.3.6.1.2.1.31.1.1.1.1"]
]

// --- isisMaxAreaAddressesMismatch (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.3.37.2.0.6
// Fields: isisSysInstance, isisSysLevelIndex, isisPduMaxAreaAddress, isisCircIfIndex, isisPduFragment, ifName
// Description: A notification sent when we receive a PDU with a different value of the Maximum Area Addresses. This notification includes the header of the packet, which may help a network manager identify the sourc...
trapMap["1.3.6.1.3.37.2.0.6"] = [
    name: "isisMaxAreaAddressesMismatch",
    fields: ["isisSysInstance", "isisSysLevelIndex", "isisPduMaxAreaAddress", "isisCircIfIndex", "isisPduFragment", "ifName"],
    fieldOids: ["isisSysInstance": "1.3.6.1.3.37.1.1.1.1.1", "isisSysLevelIndex": "1.3.6.1.3.37.1.2.1.1.1", "isisPduMaxAreaAddress": "1.3.6.1.3.37.1.10.1.1.4", "isisCircIfIndex": "1.3.6.1.3.37.1.3.1.1.2", "isisPduFragment": "1.3.6.1.3.37.1.10.1.1.2", "ifName": "1.3.6.1.2.1.31.1.1.1.1"]
]

// --- isisOwnLSPPurge (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.3.37.2.0.7
// Fields: isisSysInstance, isisSysLevelIndex, isisCircIfIndex, isisPduLspId, isisPduRemoteRouterID, ifName
// Description: A notification sent when we receive a PDU with our systemID and zero age. This notification includes the circuit Index and router ID from the LSP, if available, which may help a network manager identi...
trapMap["1.3.6.1.3.37.2.0.7"] = [
    name: "isisOwnLSPPurge",
    fields: ["isisSysInstance", "isisSysLevelIndex", "isisCircIfIndex", "isisPduLspId", "isisPduRemoteRouterID", "ifName"],
    fieldOids: ["isisSysInstance": "1.3.6.1.3.37.1.1.1.1.1", "isisSysLevelIndex": "1.3.6.1.3.37.1.2.1.1.1", "isisCircIfIndex": "1.3.6.1.3.37.1.3.1.1.2", "isisPduLspId": "1.3.6.1.3.37.1.10.1.1.1", "isisPduRemoteRouterID": "1.3.6.1.3.37.1.10.1.1.10", "ifName": "1.3.6.1.2.1.31.1.1.1.1"]
]

// --- isisSequenceNumberSkip (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.3.37.2.0.8
// Fields: isisSysInstance, isisSysLevelIndex, isisCircIfIndex, isisPduLspId, ifName
// Description: When we receive an LSP with out System ID and different contents, we may need to reissue the LSP with a higher sequence number. We send this notification if we need to increase the sequence number by ...
trapMap["1.3.6.1.3.37.2.0.8"] = [
    name: "isisSequenceNumberSkip",
    fields: ["isisSysInstance", "isisSysLevelIndex", "isisCircIfIndex", "isisPduLspId", "ifName"],
    fieldOids: ["isisSysInstance": "1.3.6.1.3.37.1.1.1.1.1", "isisSysLevelIndex": "1.3.6.1.3.37.1.2.1.1.1", "isisCircIfIndex": "1.3.6.1.3.37.1.3.1.1.2", "isisPduLspId": "1.3.6.1.3.37.1.10.1.1.1", "ifName": "1.3.6.1.2.1.31.1.1.1.1"]
]

// --- isisAuthenticationTypeFailure (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.3.37.2.0.9
// Fields: isisSysInstance, isisSysLevelIndex, isisCircIfIndex, isisPduFragment, ifName
// Description: A notification sent when we receive a PDU with the wrong authentication type field. This notification includes the header of the packet, which may help a network manager identify the source of the con...
trapMap["1.3.6.1.3.37.2.0.9"] = [
    name: "isisAuthenticationTypeFailure",
    fields: ["isisSysInstance", "isisSysLevelIndex", "isisCircIfIndex", "isisPduFragment", "ifName"],
    fieldOids: ["isisSysInstance": "1.3.6.1.3.37.1.1.1.1.1", "isisSysLevelIndex": "1.3.6.1.3.37.1.2.1.1.1", "isisCircIfIndex": "1.3.6.1.3.37.1.3.1.1.2", "isisPduFragment": "1.3.6.1.3.37.1.10.1.1.2", "ifName": "1.3.6.1.2.1.31.1.1.1.1"]
]

// --- isisAuthenticationFailure (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.3.37.2.0.10
// Fields: isisSysInstance, isisSysLevelIndex, isisCircIfIndex, isisPduFragment, ifName
// Description: A notification sent when we receive a PDU with incorrect authentication information field. This notification includes the header of the packet, which may help a network manager identify the source of ...
trapMap["1.3.6.1.3.37.2.0.10"] = [
    name: "isisAuthenticationFailure",
    fields: ["isisSysInstance", "isisSysLevelIndex", "isisCircIfIndex", "isisPduFragment", "ifName"],
    fieldOids: ["isisSysInstance": "1.3.6.1.3.37.1.1.1.1.1", "isisSysLevelIndex": "1.3.6.1.3.37.1.2.1.1.1", "isisCircIfIndex": "1.3.6.1.3.37.1.3.1.1.2", "isisPduFragment": "1.3.6.1.3.37.1.10.1.1.2", "ifName": "1.3.6.1.2.1.31.1.1.1.1"]
]

// --- isisVersionSkew (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.3.37.2.0.11
// Fields: isisSysInstance, isisSysLevelIndex, isisCircIfIndex, isisPduProtocolVersion, isisPduFragment, ifName
// Description: A notification sent when we receive a Hello PDU from an IS running a different version of the protocol. This notification includes the header of the packet, which may help a network manager identify t...
trapMap["1.3.6.1.3.37.2.0.11"] = [
    name: "isisVersionSkew",
    fields: ["isisSysInstance", "isisSysLevelIndex", "isisCircIfIndex", "isisPduProtocolVersion", "isisPduFragment", "ifName"],
    fieldOids: ["isisSysInstance": "1.3.6.1.3.37.1.1.1.1.1", "isisSysLevelIndex": "1.3.6.1.3.37.1.2.1.1.1", "isisCircIfIndex": "1.3.6.1.3.37.1.3.1.1.2", "isisPduProtocolVersion": "1.3.6.1.3.37.1.10.1.1.5", "isisPduFragment": "1.3.6.1.3.37.1.10.1.1.2", "ifName": "1.3.6.1.2.1.31.1.1.1.1"]
]

// --- isisAreaMismatch (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.3.37.2.0.12
// Fields: isisSysInstance, isisSysLevelIndex, isisCircIfIndex, isisPduFragment, ifName
// Description: A notification sent when we receive a Hello PDU from an IS which does not share any area address. This notification includes the header of the packet, which may help a network manager identify the sou...
trapMap["1.3.6.1.3.37.2.0.12"] = [
    name: "isisAreaMismatch",
    fields: ["isisSysInstance", "isisSysLevelIndex", "isisCircIfIndex", "isisPduFragment", "ifName"],
    fieldOids: ["isisSysInstance": "1.3.6.1.3.37.1.1.1.1.1", "isisSysLevelIndex": "1.3.6.1.3.37.1.2.1.1.1", "isisCircIfIndex": "1.3.6.1.3.37.1.3.1.1.2", "isisPduFragment": "1.3.6.1.3.37.1.10.1.1.2", "ifName": "1.3.6.1.2.1.31.1.1.1.1"]
]

// --- isisRejectedAdjacency (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.3.37.2.0.13
// Fields: isisSysInstance, isisSysLevelIndex, isisCircIfIndex, isisPduFragment, ifName
// Description: A notification sent when we receive a Hello PDU from an IS, but do not establish an adjacency for some reason. This should be an edge-triggered notification. We should not send a second notification a...
trapMap["1.3.6.1.3.37.2.0.13"] = [
    name: "isisRejectedAdjacency",
    fields: ["isisSysInstance", "isisSysLevelIndex", "isisCircIfIndex", "isisPduFragment", "ifName"],
    fieldOids: ["isisSysInstance": "1.3.6.1.3.37.1.1.1.1.1", "isisSysLevelIndex": "1.3.6.1.3.37.1.2.1.1.1", "isisCircIfIndex": "1.3.6.1.3.37.1.3.1.1.2", "isisPduFragment": "1.3.6.1.3.37.1.10.1.1.2", "ifName": "1.3.6.1.2.1.31.1.1.1.1"]
]

// --- isisLSPTooLargeToPropagate (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.3.37.2.0.14
// Fields: isisSysInstance, isisSysLevelIndex, isisCircIfIndex, isisPduLspSize, isisPduLspId
// Description: A notification sent when we attempt to propagate an LSP which is larger than the dataLinkBlockSize for the circuit. This should be an edge-triggered notification. We should not send a second notificat...
trapMap["1.3.6.1.3.37.2.0.14"] = [
    name: "isisLSPTooLargeToPropagate",
    fields: ["isisSysInstance", "isisSysLevelIndex", "isisCircIfIndex", "isisPduLspSize", "isisPduLspId"],
    fieldOids: ["isisSysInstance": "1.3.6.1.3.37.1.1.1.1.1", "isisSysLevelIndex": "1.3.6.1.3.37.1.2.1.1.1", "isisCircIfIndex": "1.3.6.1.3.37.1.3.1.1.2", "isisPduLspSize": "1.3.6.1.3.37.1.10.1.1.6", "isisPduLspId": "1.3.6.1.3.37.1.10.1.1.1"]
]

// --- isisOrigLSPBuffSizeMismatch (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.3.37.2.0.15
// Fields: isisSysInstance, isisSysLevelIndex, isisCircIfIndex, isisPduLspId, isisPduOriginatingBufferSize, ifName
// Description: A notification sent when a Level 1 LSP or Level 2 LSP is received which is larger than the local value for isisOriginatingBufferSize, or when an LSP is received containing the isisOriginatingBufferSiz...
trapMap["1.3.6.1.3.37.2.0.15"] = [
    name: "isisOrigLSPBuffSizeMismatch",
    fields: ["isisSysInstance", "isisSysLevelIndex", "isisCircIfIndex", "isisPduLspId", "isisPduOriginatingBufferSize", "ifName"],
    fieldOids: ["isisSysInstance": "1.3.6.1.3.37.1.1.1.1.1", "isisSysLevelIndex": "1.3.6.1.3.37.1.2.1.1.1", "isisCircIfIndex": "1.3.6.1.3.37.1.3.1.1.2", "isisPduLspId": "1.3.6.1.3.37.1.10.1.1.1", "isisPduOriginatingBufferSize": "1.3.6.1.3.37.1.10.1.1.7", "ifName": "1.3.6.1.2.1.31.1.1.1.1"]
]

// --- isisProtocolsSupportedMismatch (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.3.37.2.0.16
// Fields: isisSysInstance, isisSysLevelIndex, isisCircIfIndex, isisPduProtocolsSupported, isisPduLspId, isisPduFragment, ifName
// Description: A notification sent when a non-pseudonode segment 0 LSP is received that has no matching protocols supported. This may be because the system does not generate the field, or because there are no common...
trapMap["1.3.6.1.3.37.2.0.16"] = [
    name: "isisProtocolsSupportedMismatch",
    fields: ["isisSysInstance", "isisSysLevelIndex", "isisCircIfIndex", "isisPduProtocolsSupported", "isisPduLspId", "isisPduFragment", "ifName"],
    fieldOids: ["isisSysInstance": "1.3.6.1.3.37.1.1.1.1.1", "isisSysLevelIndex": "1.3.6.1.3.37.1.2.1.1.1", "isisCircIfIndex": "1.3.6.1.3.37.1.3.1.1.2", "isisPduProtocolsSupported": "1.3.6.1.3.37.1.10.1.1.8", "isisPduLspId": "1.3.6.1.3.37.1.10.1.1.1", "isisPduFragment": "1.3.6.1.3.37.1.10.1.1.2", "ifName": "1.3.6.1.2.1.31.1.1.1.1"]
]

// --- isisAdjacencyChange (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.3.37.2.0.17
// Fields: isisSysInstance, isisSysLevelIndex, isisCircIfIndex, isisPduLspId, isisAdjState
// Description: A notification sent when an adjacency changes state, entering or leaving state up. The first 6 bytes of the isisPduLspId are the SystemID of the adjacent IS. The isisAdjState is the new state of the a...
trapMap["1.3.6.1.3.37.2.0.17"] = [
    name: "isisAdjacencyChange",
    fields: ["isisSysInstance", "isisSysLevelIndex", "isisCircIfIndex", "isisPduLspId", "isisAdjState"],
    fieldOids: ["isisSysInstance": "1.3.6.1.3.37.1.1.1.1.1", "isisSysLevelIndex": "1.3.6.1.3.37.1.2.1.1.1", "isisCircIfIndex": "1.3.6.1.3.37.1.3.1.1.2", "isisPduLspId": "1.3.6.1.3.37.1.10.1.1.1", "isisAdjState": "1.3.6.1.3.37.1.10.1.1.9"]
]

// ===== Lookup tables (inlined) =====
def lookupTables = [:]

// ===== Parsing logic =====

// Set to true to enable diagnostic logging for this MIB parser
DEBUG = false

LOG_PREFIX = "[ISIS-MIB]"
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
event.setStatus("ACTIVE")
event.setEventClass("snmp_trap")
event.setSpecificTrap(trapOid ?: "")
event.setOriginalSeverity(event.getSeverity())
event.setOriginalSummary(event.getSummary())

// --- Trap rule overrides (alert group / severity) ---
def trapRuleName = trapInfo.name
def agent = ""
// --- Trap: isisDatabaseOverload (OID 1.3.6.1.2.1.138.1) ---
if (trapRuleName == "isisDatabaseOverload") {
    event.setAlertGroup("System Database Status")
    def alertKey = "isisSysLevelEntry." + (((resolveInstanceOid(2) =~ /\.([0-9]+)$/) ? (resolveInstanceOid(2) =~ /\.([0-9]+)$/)[0][1] : ''))
    event.setAlertKey(alertKey)
    def summary = "Isis Database Overload" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    if (gf[2] == "1") {
        event.setSeverity(2)
        event.setEventType("1")
    }
    else if (gf[2] == "2") {
        event.setSeverity(1)
        event.setEventType("2")
    }
    else if (gf[2] == "3") {
        event.setSeverity(2)
        event.setEventType("13")
        if (event.getDynamicFields() == null) event.setDynamicFields([:])
        event.getDynamicFields()["_expireTime"] = 1800
    }
    else if (gf[2] == "4") {
        event.setSeverity(3)
        event.setEventType("1")
    }
    else if (true) {
        event.setSeverity(2)
        event.setEventType("1")
    }
    def dyn = event.getDynamicFields() ?: [:]
    dyn["isisNotificationSysLevelIndex"] = varbinds.get("isisNotificationSysLevelIndex")
    dyn["isisSysLevelState"] = varbinds.get("isisSysLevelState")
    dyn["isisSysLevelIndex"] = varbinds.get("isisSysLevelIndex")
    event.setDynamicFields(dyn)
}
// --- Trap: isisManualAddressDrops (OID 1.3.6.1.2.1.138.2) ---
if (trapRuleName == "isisManualAddressDrops") {
    event.setAlertGroup("ISIS Status")
    def alertKey = "Area Address: " + (gf[1])
    event.setAlertKey(alertKey)
    def summary = "Isis Manual Address Drops" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(3)
    event.setEventType("1")
    def dyn = event.getDynamicFields() ?: [:]
    dyn["isisNotificationAreaAddress"] = varbinds.get("isisNotificationAreaAddress")
    event.setDynamicFields(dyn)
}
// --- Trap: isisCorruptedLSPDetected (OID 1.3.6.1.2.1.138.3) ---
if (trapRuleName == "isisCorruptedLSPDetected") {
    event.setAlertGroup("ISIS LSP Status")
    def alertKey = "LSP ID: " + (gf[2])
    event.setAlertKey(alertKey)
    def summary = "Isis Corrupted LSPDetected" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(3)
    event.setEventType("1")
    def dyn = event.getDynamicFields() ?: [:]
    dyn["isisNotificationSysLevelIndex"] = varbinds.get("isisNotificationSysLevelIndex")
    dyn["isisPduLspId"] = varbinds.get("isisPduLspId")
    event.setDynamicFields(dyn)
}
// --- Trap: isisAttemptToExceedMaxSequence (OID 1.3.6.1.2.1.138.4) ---
if (trapRuleName == "isisAttemptToExceedMaxSequence") {
    event.setAlertGroup("ISIS LSP Status")
    def alertKey = "LSP ID: " + (gf[2])
    event.setAlertKey(alertKey)
    def summary = "Isis Attempt To Exceed Max Sequence" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(3)
    event.setEventType("1")
    def dyn = event.getDynamicFields() ?: [:]
    dyn["isisNotificationSysLevelIndex"] = varbinds.get("isisNotificationSysLevelIndex")
    dyn["isisPduLspId"] = varbinds.get("isisPduLspId")
    event.setDynamicFields(dyn)
}
// --- Trap: isisIDLenMismatch (OID 1.3.6.1.2.1.138.5) ---
if (trapRuleName == "isisIDLenMismatch") {
    event.setAlertGroup("ISIS PDU Status")
    def alertKey = "Circuit ID: " + (gf[3])
    event.setAlertKey(alertKey)
    def summary = "Isis IDLen Mismatch" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(3)
    event.setEventType("1")
}
// --- Trap: isisMaxAreaAddressesMismatch (OID 1.3.6.1.2.1.138.6) ---
if (trapRuleName == "isisMaxAreaAddressesMismatch") {
    event.setAlertGroup("ISIS PDU Status")
    def alertKey = "Circuit ID: " + (gf[3])
    event.setAlertKey(alertKey)
    def summary = "Isis Max Area Addresses Mismatch" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(3)
    event.setEventType("1")
}
// --- Trap: isisOwnLSPPurge (OID 1.3.6.1.2.1.138.7) ---
if (trapRuleName == "isisOwnLSPPurge") {
    event.setAlertGroup("ISIS PDU Status")
    def alertKey = "Circuit ID: " + (gf[2])
    event.setAlertKey(alertKey)
    def summary = "Isis Own LSPPurge" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(3)
    event.setEventType("1")
    def dyn = event.getDynamicFields() ?: [:]
    dyn["isisNotificationSysLevelIndex"] = varbinds.get("isisNotificationSysLevelIndex")
    dyn["isisNotificationCircIfIndex"] = varbinds.get("isisNotificationCircIfIndex")
    dyn["isisPduLspId"] = varbinds.get("isisPduLspId")
    event.setDynamicFields(dyn)
}
// --- Trap: isisSequenceNumberSkip (OID 1.3.6.1.2.1.138.8) ---
if (trapRuleName == "isisSequenceNumberSkip") {
    event.setAlertGroup("ISIS LSP Status")
    def alertKey = "Circuit ID: " + (gf[2])
    event.setAlertKey(alertKey)
    def summary = "Isis Sequence Number Skip" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(3)
    event.setEventType("1")
    def dyn = event.getDynamicFields() ?: [:]
    dyn["isisNotificationSysLevelIndex"] = varbinds.get("isisNotificationSysLevelIndex")
    dyn["isisNotificationCircIfIndex"] = varbinds.get("isisNotificationCircIfIndex")
    dyn["isisPduLspId"] = varbinds.get("isisPduLspId")
    event.setDynamicFields(dyn)
}
// --- Trap: isisAuthenticationTypeFailure (OID 1.3.6.1.2.1.138.9) ---
if (trapRuleName == "isisAuthenticationTypeFailure") {
    event.setAlertGroup("ISIS PDU Status")
    def alertKey = "Circuit ID: " + (gf[2])
    event.setAlertKey(alertKey)
    def summary = "Isis Authentication Type Failure" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(3)
    event.setEventType("1")
    def dyn = event.getDynamicFields() ?: [:]
    dyn["isisNotificationSysLevelIndex"] = varbinds.get("isisNotificationSysLevelIndex")
    dyn["isisNotificationCircIfIndex"] = varbinds.get("isisNotificationCircIfIndex")
    dyn["isisPduFragment"] = varbinds.get("isisPduFragment")
    event.setDynamicFields(dyn)
}
// --- Trap: isisAuthenticationFailure (OID 1.3.6.1.2.1.138.10) ---
if (trapRuleName == "isisAuthenticationFailure") {
    event.setAlertGroup("ISIS PDU Status")
    def alertKey = "Circuit ID: " + (gf[2])
    event.setAlertKey(alertKey)
    def summary = "Isis Authentication Failure" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(3)
    event.setEventType("1")
    def dyn = event.getDynamicFields() ?: [:]
    dyn["isisNotificationSysLevelIndex"] = varbinds.get("isisNotificationSysLevelIndex")
    dyn["isisNotificationCircIfIndex"] = varbinds.get("isisNotificationCircIfIndex")
    dyn["isisPduFragment"] = varbinds.get("isisPduFragment")
    event.setDynamicFields(dyn)
}
// --- Trap: isisVersionSkew (OID 1.3.6.1.2.1.138.11) ---
if (trapRuleName == "isisVersionSkew") {
    event.setAlertGroup("ISIS PDU Status")
    def alertKey = "Circuit ID: " + (gf[2])
    event.setAlertKey(alertKey)
    def summary = "Isis Version Skew" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(2)
    event.setEventType("1")
}
// --- Trap: isisAreaMismatch (OID 1.3.6.1.2.1.138.12) ---
if (trapRuleName == "isisAreaMismatch") {
    event.setAlertGroup("ISIS PDU Status")
    def alertKey = "Circuit ID: " + (gf[1])
    event.setAlertKey(alertKey)
    def summary = "Isis Area Mismatch" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(2)
    event.setEventType("13")
    def dyn = event.getDynamicFields() ?: [:]
    dyn["isisNotificationCircIfIndex"] = varbinds.get("isisNotificationCircIfIndex")
    dyn["isisPduFragment"] = varbinds.get("isisPduFragment")
    event.setDynamicFields(dyn)
}
// --- Trap: isisRejectedAdjacency (OID 1.3.6.1.2.1.138.13) ---
if (trapRuleName == "isisRejectedAdjacency") {
    event.setAlertGroup("ISIS PDU Status")
    def alertKey = "Circuit ID: " + (gf[2])
    event.setAlertKey(alertKey)
    def summary = "Isis Rejected Adjacency" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(2)
    event.setEventType("1")
    def dyn = event.getDynamicFields() ?: [:]
    dyn["isisNotificationSysLevelIndex"] = varbinds.get("isisNotificationSysLevelIndex")
    dyn["isisNotificationCircIfIndex"] = varbinds.get("isisNotificationCircIfIndex")
    dyn["isisPduFragment"] = varbinds.get("isisPduFragment")
    event.setDynamicFields(dyn)
}
// --- Trap: isisLSPTooLargeToPropagate (OID 1.3.6.1.2.1.138.14) ---
if (trapRuleName == "isisLSPTooLargeToPropagate") {
    event.setAlertGroup("ISIS LSP Status")
    def alertKey = "Circuit ID: " + (gf[2])
    event.setAlertKey(alertKey)
    def summary = "Isis LSPToo Large To Propagate" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(2)
    event.setEventType("1")
}
// --- Trap: isisOrigLSPBuffSizeMismatch (OID 1.3.6.1.2.1.138.15) ---
if (trapRuleName == "isisOrigLSPBuffSizeMismatch") {
    event.setAlertGroup("ISIS LSP Status")
    def alertKey = "Circuit ID: " + (gf[2])
    event.setAlertKey(alertKey)
    def summary = "Isis Orig LSPBuff Size Mismatch" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(2)
    event.setEventType("1")
}
// --- Trap: isisProtocolsSupportedMismatch (OID 1.3.6.1.2.1.138.16) ---
if (trapRuleName == "isisProtocolsSupportedMismatch") {
    event.setAlertGroup("ISIS LSP Status")
    def alertKey = "Circuit ID: " + (gf[2])
    event.setAlertKey(alertKey)
    def summary = "Isis Protocols Supported Mismatch" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(2)
    event.setEventType("1")
}
// --- Trap: isisAdjacencyChange (OID 1.3.6.1.2.1.138.17) ---
if (trapRuleName == "isisAdjacencyChange") {
    event.setAlertGroup("ISIS Status")
    def alertKey = "Circuit ID: " + (gf[2])
    event.setAlertKey(alertKey)
    def summary = "Isis Adjacency Change" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    if (gf[4] == "1") {
        event.setSeverity(3)
        event.setEventType("1")
    }
    else if (gf[4] == "2") {
        event.setSeverity(2)
        event.setEventType("13")
        if (event.getDynamicFields() == null) event.setDynamicFields([:])
        event.getDynamicFields()["_expireTime"] = 1800
    }
    else if (gf[4] == "3") {
        event.setSeverity(1)
        event.setEventType("2")
    }
    else if (gf[4] == "4") {
        event.setSeverity(3)
        event.setEventType("1")
    }
    else if (true) {
        event.setSeverity(2)
        event.setEventType("1")
    }
}
// --- Trap: isisLSPErrorDetected (OID 1.3.6.1.2.1.138.18) ---
if (trapRuleName == "isisLSPErrorDetected") {
    event.setAlertGroup("ISIS LSP Status")
    def alertKey = "Circuit ID: " + (gf[3])
    event.setAlertKey(alertKey)
    def summary = "Isis LSPError Detected" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(2)
    event.setEventType("1")
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
