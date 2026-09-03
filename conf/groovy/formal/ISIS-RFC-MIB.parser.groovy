/**
 * Auto-generated from ISIS-RFC-MIB.mib
 * Generated: 2026-08-24T18:28:31.739182100
 * Traps/Notifications (18): isisDatabaseOverload, isisManualAddressDrops, isisCorruptedLSPDetected, isisAttemptToExceedMaxSequence, isisIDLenMismatch, isisMaxAreaAddressesMismatch, isisOwnLSPPurge, isisSequenceNumberSkip, isisAuthenticationTypeFailure, isisAuthenticationFailure, isisVersionSkew, isisAreaMismatch, isisRejectedAdjacency, isisLSPTooLargeToPropagate, isisOrigLSPBuffSizeMismatch, isisProtocolsSupportedMismatch, isisAdjacencyChange, isisLSPErrorDetected
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

// --- isisDatabaseOverload (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.2.1.138.0.1
// Fields: isisNotificationSysLevelIndex, isisSysLevelState
// Description: This notification is generated when the system enters or leaves the Overload state. The number of times this has been generated and cleared is kept track of by isisSysStatLSPDbaseOloads.
trapMap["1.3.6.1.2.1.138.0.1"] = [
    name: "isisDatabaseOverload",
    fields: ["isisNotificationSysLevelIndex", "isisSysLevelState"],
    fieldOids: ["isisNotificationSysLevelIndex": "1.3.6.1.2.1.138.1.10.1.1", "isisSysLevelState": "1.3.6.1.2.1.138.1.2.1.1.4"]
]

// --- isisManualAddressDrops (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.2.1.138.0.2
// Fields: isisNotificationAreaAddress
// Description: This notification is generated when one of the manual areaAddresses assigned to this system is ignored when computing routes. The object isisNotificationAreaAddress describes the area that has been dr...
trapMap["1.3.6.1.2.1.138.0.2"] = [
    name: "isisManualAddressDrops",
    fields: ["isisNotificationAreaAddress"],
    fieldOids: ["isisNotificationAreaAddress": "1.3.6.1.2.1.138.1.10.1.15"]
]

// --- isisCorruptedLSPDetected (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.2.1.138.0.3
// Fields: isisNotificationSysLevelIndex, isisPduLspId
// Description: This notification is generated when we find that an LSP that was stored in memory has become corrupted. The number of times this has been generated is counted by isisSysCorrLSPs. We forward an LSP ID....
trapMap["1.3.6.1.2.1.138.0.3"] = [
    name: "isisCorruptedLSPDetected",
    fields: ["isisNotificationSysLevelIndex", "isisPduLspId"],
    fieldOids: ["isisNotificationSysLevelIndex": "1.3.6.1.2.1.138.1.10.1.1", "isisPduLspId": "1.3.6.1.2.1.138.1.10.1.3"]
]

// --- isisAttemptToExceedMaxSequence (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.2.1.138.0.4
// Fields: isisNotificationSysLevelIndex, isisPduLspId
// Description: When the sequence number on an LSP we generate wraps the 32-bit sequence counter, we purge and wait to re-announce this information. This notification describes that event. Since these should not be g...
trapMap["1.3.6.1.2.1.138.0.4"] = [
    name: "isisAttemptToExceedMaxSequence",
    fields: ["isisNotificationSysLevelIndex", "isisPduLspId"],
    fieldOids: ["isisNotificationSysLevelIndex": "1.3.6.1.2.1.138.1.10.1.1", "isisPduLspId": "1.3.6.1.2.1.138.1.10.1.3"]
]

// --- isisIDLenMismatch (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.2.1.138.0.5
// Fields: isisNotificationSysLevelIndex, isisPduFieldLen, isisNotificationCircIfIndex, isisPduFragment
// Description: A notification sent when we receive a PDU with a different value for the System ID Length. This notification includes an index to identify the circuit where we saw the PDU and the header of the PDU, w...
trapMap["1.3.6.1.2.1.138.0.5"] = [
    name: "isisIDLenMismatch",
    fields: ["isisNotificationSysLevelIndex", "isisPduFieldLen", "isisNotificationCircIfIndex", "isisPduFragment"],
    fieldOids: ["isisNotificationSysLevelIndex": "1.3.6.1.2.1.138.1.10.1.1", "isisPduFieldLen": "1.3.6.1.2.1.138.1.10.1.5", "isisNotificationCircIfIndex": "1.3.6.1.2.1.138.1.10.1.2", "isisPduFragment": "1.3.6.1.2.1.138.1.10.1.4"]
]

// --- isisMaxAreaAddressesMismatch (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.2.1.138.0.6
// Fields: isisNotificationSysLevelIndex, isisPduMaxAreaAddress, isisNotificationCircIfIndex, isisPduFragment
// Description: A notification sent when we receive a PDU with a different value for the Maximum Area Addresses. This notification includes the header of the packet, which may help a network manager identify the sour...
trapMap["1.3.6.1.2.1.138.0.6"] = [
    name: "isisMaxAreaAddressesMismatch",
    fields: ["isisNotificationSysLevelIndex", "isisPduMaxAreaAddress", "isisNotificationCircIfIndex", "isisPduFragment"],
    fieldOids: ["isisNotificationSysLevelIndex": "1.3.6.1.2.1.138.1.10.1.1", "isisPduMaxAreaAddress": "1.3.6.1.2.1.138.1.10.1.6", "isisNotificationCircIfIndex": "1.3.6.1.2.1.138.1.10.1.2", "isisPduFragment": "1.3.6.1.2.1.138.1.10.1.4"]
]

// --- isisOwnLSPPurge (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.2.1.138.0.7
// Fields: isisNotificationSysLevelIndex, isisNotificationCircIfIndex, isisPduLspId
// Description: A notification sent when we receive a PDU with our systemID and zero age. This notification includes the circuit Index and router ID from the LSP, if available, which may help a network manager identi...
trapMap["1.3.6.1.2.1.138.0.7"] = [
    name: "isisOwnLSPPurge",
    fields: ["isisNotificationSysLevelIndex", "isisNotificationCircIfIndex", "isisPduLspId"],
    fieldOids: ["isisNotificationSysLevelIndex": "1.3.6.1.2.1.138.1.10.1.1", "isisNotificationCircIfIndex": "1.3.6.1.2.1.138.1.10.1.2", "isisPduLspId": "1.3.6.1.2.1.138.1.10.1.3"]
]

// --- isisSequenceNumberSkip (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.2.1.138.0.8
// Fields: isisNotificationSysLevelIndex, isisNotificationCircIfIndex, isisPduLspId
// Description: When we receive an LSP with our System ID and different contents, we may need to reissue the LSP with a higher sequence number. We send this notification if we need to increase the sequence number by ...
trapMap["1.3.6.1.2.1.138.0.8"] = [
    name: "isisSequenceNumberSkip",
    fields: ["isisNotificationSysLevelIndex", "isisNotificationCircIfIndex", "isisPduLspId"],
    fieldOids: ["isisNotificationSysLevelIndex": "1.3.6.1.2.1.138.1.10.1.1", "isisNotificationCircIfIndex": "1.3.6.1.2.1.138.1.10.1.2", "isisPduLspId": "1.3.6.1.2.1.138.1.10.1.3"]
]

// --- isisAuthenticationTypeFailure (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.2.1.138.0.9
// Fields: isisNotificationSysLevelIndex, isisNotificationCircIfIndex, isisPduFragment
// Description: A notification sent when we receive a PDU with the wrong authentication type field. This notification includes the header of the packet, which may help a network manager identify the source of the con...
trapMap["1.3.6.1.2.1.138.0.9"] = [
    name: "isisAuthenticationTypeFailure",
    fields: ["isisNotificationSysLevelIndex", "isisNotificationCircIfIndex", "isisPduFragment"],
    fieldOids: ["isisNotificationSysLevelIndex": "1.3.6.1.2.1.138.1.10.1.1", "isisNotificationCircIfIndex": "1.3.6.1.2.1.138.1.10.1.2", "isisPduFragment": "1.3.6.1.2.1.138.1.10.1.4"]
]

// --- isisAuthenticationFailure (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.2.1.138.0.10
// Fields: isisNotificationSysLevelIndex, isisNotificationCircIfIndex, isisPduFragment
// Description: A notification sent when we receive a PDU with an incorrect authentication information field. This notification includes the header of the packet, which may help a network manager identify the source ...
trapMap["1.3.6.1.2.1.138.0.10"] = [
    name: "isisAuthenticationFailure",
    fields: ["isisNotificationSysLevelIndex", "isisNotificationCircIfIndex", "isisPduFragment"],
    fieldOids: ["isisNotificationSysLevelIndex": "1.3.6.1.2.1.138.1.10.1.1", "isisNotificationCircIfIndex": "1.3.6.1.2.1.138.1.10.1.2", "isisPduFragment": "1.3.6.1.2.1.138.1.10.1.4"]
]

// --- isisVersionSkew (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.2.1.138.0.11
// Fields: isisNotificationSysLevelIndex, isisNotificationCircIfIndex, isisPduProtocolVersion, isisPduFragment
// Description: A notification sent when we receive a Hello PDU from an IS running a different version of the protocol. This notification includes the header of the packet, which may help a network manager identify t...
trapMap["1.3.6.1.2.1.138.0.11"] = [
    name: "isisVersionSkew",
    fields: ["isisNotificationSysLevelIndex", "isisNotificationCircIfIndex", "isisPduProtocolVersion", "isisPduFragment"],
    fieldOids: ["isisNotificationSysLevelIndex": "1.3.6.1.2.1.138.1.10.1.1", "isisNotificationCircIfIndex": "1.3.6.1.2.1.138.1.10.1.2", "isisPduProtocolVersion": "1.3.6.1.2.1.138.1.10.1.7", "isisPduFragment": "1.3.6.1.2.1.138.1.10.1.4"]
]

// --- isisAreaMismatch (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.2.1.138.0.12
// Fields: isisNotificationCircIfIndex, isisPduFragment
// Description: A notification sent when we receive a Hello PDU from an IS that does not share any area address. This notification includes the header of the packet, which may help a network manager identify the sour...
trapMap["1.3.6.1.2.1.138.0.12"] = [
    name: "isisAreaMismatch",
    fields: ["isisNotificationCircIfIndex", "isisPduFragment"],
    fieldOids: ["isisNotificationCircIfIndex": "1.3.6.1.2.1.138.1.10.1.2", "isisPduFragment": "1.3.6.1.2.1.138.1.10.1.4"]
]

// --- isisRejectedAdjacency (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.2.1.138.0.13
// Fields: isisNotificationSysLevelIndex, isisNotificationCircIfIndex, isisPduFragment
// Description: A notification sent when we receive a Hello PDU from an IS but do not establish an adjacency for some reason. The agent must throttle the generation of consecutive isisRejectedAdjacency notifications ...
trapMap["1.3.6.1.2.1.138.0.13"] = [
    name: "isisRejectedAdjacency",
    fields: ["isisNotificationSysLevelIndex", "isisNotificationCircIfIndex", "isisPduFragment"],
    fieldOids: ["isisNotificationSysLevelIndex": "1.3.6.1.2.1.138.1.10.1.1", "isisNotificationCircIfIndex": "1.3.6.1.2.1.138.1.10.1.2", "isisPduFragment": "1.3.6.1.2.1.138.1.10.1.4"]
]

// --- isisLSPTooLargeToPropagate (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.2.1.138.0.14
// Fields: isisNotificationSysLevelIndex, isisNotificationCircIfIndex, isisPduLspSize, isisPduLspId
// Description: A notification sent when we attempt to propagate an LSP that is larger than the dataLinkBlockSize for the circuit. The agent must throttle the generation of consecutive isisLSPTooLargeToPropagate noti...
trapMap["1.3.6.1.2.1.138.0.14"] = [
    name: "isisLSPTooLargeToPropagate",
    fields: ["isisNotificationSysLevelIndex", "isisNotificationCircIfIndex", "isisPduLspSize", "isisPduLspId"],
    fieldOids: ["isisNotificationSysLevelIndex": "1.3.6.1.2.1.138.1.10.1.1", "isisNotificationCircIfIndex": "1.3.6.1.2.1.138.1.10.1.2", "isisPduLspSize": "1.3.6.1.2.1.138.1.10.1.8", "isisPduLspId": "1.3.6.1.2.1.138.1.10.1.3"]
]

// --- isisOrigLSPBuffSizeMismatch (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.2.1.138.0.15
// Fields: isisNotificationSysLevelIndex, isisNotificationCircIfIndex, isisPduLspId, isisPduOriginatingBufferSize, isisPduBufferSize
// Description: A notification sent when a Level 1 LSP or Level 2 LSP is received that is larger than the local value for isisSysLevelOrigLSPBuffSize, or when an LSP is received that contains the supported Buffer Siz...
trapMap["1.3.6.1.2.1.138.0.15"] = [
    name: "isisOrigLSPBuffSizeMismatch",
    fields: ["isisNotificationSysLevelIndex", "isisNotificationCircIfIndex", "isisPduLspId", "isisPduOriginatingBufferSize", "isisPduBufferSize"],
    fieldOids: ["isisNotificationSysLevelIndex": "1.3.6.1.2.1.138.1.10.1.1", "isisNotificationCircIfIndex": "1.3.6.1.2.1.138.1.10.1.2", "isisPduLspId": "1.3.6.1.2.1.138.1.10.1.3", "isisPduOriginatingBufferSize": "1.3.6.1.2.1.138.1.10.1.9", "isisPduBufferSize": "1.3.6.1.2.1.138.1.10.1.10"]
]

// --- isisProtocolsSupportedMismatch (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.2.1.138.0.16
// Fields: isisNotificationSysLevelIndex, isisNotificationCircIfIndex, isisPduProtocolsSupported, isisPduLspId, isisPduFragment
// Description: A notification sent when a non-pseudonode segment 0 LSP is received that has no matching protocols supported. This may be because the system does not generate the field, or because there are no common...
trapMap["1.3.6.1.2.1.138.0.16"] = [
    name: "isisProtocolsSupportedMismatch",
    fields: ["isisNotificationSysLevelIndex", "isisNotificationCircIfIndex", "isisPduProtocolsSupported", "isisPduLspId", "isisPduFragment"],
    fieldOids: ["isisNotificationSysLevelIndex": "1.3.6.1.2.1.138.1.10.1.1", "isisNotificationCircIfIndex": "1.3.6.1.2.1.138.1.10.1.2", "isisPduProtocolsSupported": "1.3.6.1.2.1.138.1.10.1.11", "isisPduLspId": "1.3.6.1.2.1.138.1.10.1.3", "isisPduFragment": "1.3.6.1.2.1.138.1.10.1.4"]
]

// --- isisAdjacencyChange (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.2.1.138.0.17
// Fields: isisNotificationSysLevelIndex, isisNotificationCircIfIndex, isisPduLspId, isisAdjState
// Description: A notification sent when an adjacency changes state, entering or leaving state up. The first 6 bytes of the isisPduLspId are the SystemID of the adjacent IS. The isisAdjState is the new state of the a...
trapMap["1.3.6.1.2.1.138.0.17"] = [
    name: "isisAdjacencyChange",
    fields: ["isisNotificationSysLevelIndex", "isisNotificationCircIfIndex", "isisPduLspId", "isisAdjState"],
    fieldOids: ["isisNotificationSysLevelIndex": "1.3.6.1.2.1.138.1.10.1.1", "isisNotificationCircIfIndex": "1.3.6.1.2.1.138.1.10.1.2", "isisPduLspId": "1.3.6.1.2.1.138.1.10.1.3", "isisAdjState": "1.3.6.1.2.1.138.1.10.1.12"]
]

// --- isisLSPErrorDetected (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.2.1.138.0.18
// Fields: isisNotificationSysLevelIndex, isisPduLspId, isisNotificationCircIfIndex, isisPduFragment, isisErrorOffset, isisErrorTLVType
// Description: This notification is generated when we receive an LSP with a parse error. The isisCircIfIndex holds an index of the circuit on which the PDU arrived. The isisPduFragment holds the start of the LSP, an...
trapMap["1.3.6.1.2.1.138.0.18"] = [
    name: "isisLSPErrorDetected",
    fields: ["isisNotificationSysLevelIndex", "isisPduLspId", "isisNotificationCircIfIndex", "isisPduFragment", "isisErrorOffset", "isisErrorTLVType"],
    fieldOids: ["isisNotificationSysLevelIndex": "1.3.6.1.2.1.138.1.10.1.1", "isisPduLspId": "1.3.6.1.2.1.138.1.10.1.3", "isisNotificationCircIfIndex": "1.3.6.1.2.1.138.1.10.1.2", "isisPduFragment": "1.3.6.1.2.1.138.1.10.1.4", "isisErrorOffset": "1.3.6.1.2.1.138.1.10.1.13", "isisErrorTLVType": "1.3.6.1.2.1.138.1.10.1.14"]
]

// ===== Parsing logic =====

// Set to true to enable diagnostic logging for this MIB parser
DEBUG = false

LOG_PREFIX = "[ISIS-RFC-MIB]"
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
