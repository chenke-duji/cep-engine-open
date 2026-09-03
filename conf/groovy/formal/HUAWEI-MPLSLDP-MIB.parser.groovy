/**
 * Auto-generated from HUAWEI-MPLSLDP-MIB.mib
 * Generated: 2026-08-24T18:28:30.401941400
 * Traps/Notifications (12): hwMplsLdpSessionDown, hwMplsLdpLspDown, hwMplsLdpHostIngressLspDownClear, hwMplsLdpHostIngressLspDown, hwMplsLdpMultiLinkCfgInconsistent, hwMplsLdpMultiLinkCfgInconsistentClear, hwMplsLdpPeerAddressCountExceed, hwMplsLdpPeerAddressCountExceedClear, hwMplsLdpMappingCountExceed, hwMplsLdpMappingCountExceedClear, hwMplsLdpLastLocalAdjDown, hwMplsLdpLastLocalAdjDownClear
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

// --- hwMplsLdpSessionDown (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.143.2.1
// Fields: hwMplsLdpSessionDownReason, hwMplsLdpSessionIfIndex
// Description: When the trap indicating that a session is down is sent, the cause for the down LDP session is displayed.
trapMap["1.3.6.1.4.1.2011.5.25.143.2.1"] = [
    name: "hwMplsLdpSessionDown",
    fields: ["hwMplsLdpSessionDownReason", "hwMplsLdpSessionIfIndex"],
    fieldOids: ["hwMplsLdpSessionDownReason": "1.3.6.1.4.1.2011.5.25.143.1.7.1.3", "hwMplsLdpSessionIfIndex": "1.3.6.1.4.1.2011.5.25.143.1.7.1.2"]
]

// --- hwMplsLdpLspDown (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.143.2.2
// Fields: hwMplsLdpLspFec, hwMplsLdpLspInLabel, hwMplsLdpLspOutLabel, hwMplsLdpLspOutIfIndex, hwMplsLdpLspDownReason
// Description: When the trap indicating that a session is down is sent, the cause for the down LSP session is displayed.
trapMap["1.3.6.1.4.1.2011.5.25.143.2.2"] = [
    name: "hwMplsLdpLspDown",
    fields: ["hwMplsLdpLspFec", "hwMplsLdpLspInLabel", "hwMplsLdpLspOutLabel", "hwMplsLdpLspOutIfIndex", "hwMplsLdpLspDownReason"],
    fieldOids: ["hwMplsLdpLspFec": "1.3.6.1.4.1.2011.5.25.143.1.2", "hwMplsLdpLspInLabel": "1.3.6.1.4.1.2011.5.25.143.1.3", "hwMplsLdpLspOutLabel": "1.3.6.1.4.1.2011.5.25.143.1.4", "hwMplsLdpLspOutIfIndex": "1.3.6.1.4.1.2011.5.25.143.1.5", "hwMplsLdpLspDownReason": "1.3.6.1.4.1.2011.5.25.143.1.6"]
]

// --- hwMplsLdpHostIngressLspDownClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.143.2.3
// Fields: hwMplsLdpLspFec
// Description: A trap is sent to clear the down trap of a specified FEC's ingress lsp.
trapMap["1.3.6.1.4.1.2011.5.25.143.2.3"] = [
    name: "hwMplsLdpHostIngressLspDownClear",
    fields: ["hwMplsLdpLspFec"],
    fieldOids: ["hwMplsLdpLspFec": "1.3.6.1.4.1.2011.5.25.143.1.2"]
]

// --- hwMplsLdpHostIngressLspDown (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.143.2.4
// Fields: hwMplsLdpLspFec, hwLdpLspDownReason, hwLdpLspDownMplsLsrId, hwLdpLspDownOutIfIndex, hwLdpLspDownOutIfMainIp, hwLdpLspDownOutIfState, hwLdpLspDownDownstreamPeerLsrId
// Description: A trap is sent when all the ingress lsp of a specified FEC went down.
trapMap["1.3.6.1.4.1.2011.5.25.143.2.4"] = [
    name: "hwMplsLdpHostIngressLspDown",
    fields: ["hwMplsLdpLspFec", "hwLdpLspDownReason", "hwLdpLspDownMplsLsrId", "hwLdpLspDownOutIfIndex", "hwLdpLspDownOutIfMainIp", "hwLdpLspDownOutIfState", "hwLdpLspDownDownstreamPeerLsrId"],
    fieldOids: ["hwMplsLdpLspFec": "1.3.6.1.4.1.2011.5.25.143.1.2", "hwLdpLspDownReason": "1.3.6.1.4.1.2011.5.25.143.1.67", "hwLdpLspDownMplsLsrId": "1.3.6.1.4.1.2011.5.25.143.1.68", "hwLdpLspDownOutIfIndex": "1.3.6.1.4.1.2011.5.25.143.1.69", "hwLdpLspDownOutIfMainIp": "1.3.6.1.4.1.2011.5.25.143.1.70", "hwLdpLspDownOutIfState": "1.3.6.1.4.1.2011.5.25.143.1.71", "hwLdpLspDownDownstreamPeerLsrId": "1.3.6.1.4.1.2011.5.25.143.1.72"]
]

// --- hwMplsLdpMultiLinkCfgInconsistent (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.143.2.5
// Fields: hwMplsLdpConsistentState, hwMplsLdpEffectKeepAlive, hwMplsLdpEffectTransportAddr, hwMplsLdpEffectLabelAdvertisementMode
// Description: Indicates that MPLS LDP multi-link configurations are Inconsistent.
trapMap["1.3.6.1.4.1.2011.5.25.143.2.5"] = [
    name: "hwMplsLdpMultiLinkCfgInconsistent",
    fields: ["hwMplsLdpConsistentState", "hwMplsLdpEffectKeepAlive", "hwMplsLdpEffectTransportAddr", "hwMplsLdpEffectLabelAdvertisementMode"],
    fieldOids: ["hwMplsLdpConsistentState": "1.3.6.1.4.1.2011.5.25.143.1.74.1.7", "hwMplsLdpEffectKeepAlive": "1.3.6.1.4.1.2011.5.25.143.1.74.1.8", "hwMplsLdpEffectTransportAddr": "1.3.6.1.4.1.2011.5.25.143.1.74.1.9", "hwMplsLdpEffectLabelAdvertisementMode": "1.3.6.1.4.1.2011.5.25.143.1.74.1.10"]
]

// --- hwMplsLdpMultiLinkCfgInconsistentClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.143.2.6
// Fields: hwMplsLdpConsistentState, hwMplsLdpEffectKeepAlive, hwMplsLdpEffectTransportAddr, hwMplsLdpEffectLabelAdvertisementMode
// Description: Indicates that MPLS LDP multi-link configurations are consistent.
trapMap["1.3.6.1.4.1.2011.5.25.143.2.6"] = [
    name: "hwMplsLdpMultiLinkCfgInconsistentClear",
    fields: ["hwMplsLdpConsistentState", "hwMplsLdpEffectKeepAlive", "hwMplsLdpEffectTransportAddr", "hwMplsLdpEffectLabelAdvertisementMode"],
    fieldOids: ["hwMplsLdpConsistentState": "1.3.6.1.4.1.2011.5.25.143.1.74.1.7", "hwMplsLdpEffectKeepAlive": "1.3.6.1.4.1.2011.5.25.143.1.74.1.8", "hwMplsLdpEffectTransportAddr": "1.3.6.1.4.1.2011.5.25.143.1.74.1.9", "hwMplsLdpEffectLabelAdvertisementMode": "1.3.6.1.4.1.2011.5.25.143.1.74.1.10"]
]

// --- hwMplsLdpPeerAddressCountExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.143.2.7
// Fields: hwLdpPeerAddressLsrId, hwLdpPeerVrfIndex, hwLdpAddressTotalCount
// Description: Indicates that peer address count reaches the upper limit.
trapMap["1.3.6.1.4.1.2011.5.25.143.2.7"] = [
    name: "hwMplsLdpPeerAddressCountExceed",
    fields: ["hwLdpPeerAddressLsrId", "hwLdpPeerVrfIndex", "hwLdpAddressTotalCount"],
    fieldOids: ["hwLdpPeerAddressLsrId": "1.3.6.1.4.1.2011.5.25.143.1.75.1.1", "hwLdpPeerVrfIndex": "1.3.6.1.4.1.2011.5.25.143.1.75.1.2", "hwLdpAddressTotalCount": "1.3.6.1.4.1.2011.5.25.143.1.75.1.3"]
]

// --- hwMplsLdpPeerAddressCountExceedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.143.2.8
// Fields: hwLdpPeerAddressLsrId, hwLdpPeerVrfIndex
// Description: Indicates that peer address count falls from the upper limit.
trapMap["1.3.6.1.4.1.2011.5.25.143.2.8"] = [
    name: "hwMplsLdpPeerAddressCountExceedClear",
    fields: ["hwLdpPeerAddressLsrId", "hwLdpPeerVrfIndex"],
    fieldOids: ["hwLdpPeerAddressLsrId": "1.3.6.1.4.1.2011.5.25.143.1.75.1.1", "hwLdpPeerVrfIndex": "1.3.6.1.4.1.2011.5.25.143.1.75.1.2"]
]

// --- hwMplsLdpMappingCountExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.143.2.9
// Fields: hwLdpMappingType, hwLdpVrfIndex, hwLdpMappingTotalCount
// Description: Indicates that the number of LDP label mapping sent or received on the device exceeded the upper limit.
trapMap["1.3.6.1.4.1.2011.5.25.143.2.9"] = [
    name: "hwMplsLdpMappingCountExceed",
    fields: ["hwLdpMappingType", "hwLdpVrfIndex", "hwLdpMappingTotalCount"],
    fieldOids: ["hwLdpMappingType": "1.3.6.1.4.1.2011.5.25.143.1.76.1.1", "hwLdpVrfIndex": "1.3.6.1.4.1.2011.5.25.143.1.76.1.2", "hwLdpMappingTotalCount": "1.3.6.1.4.1.2011.5.25.143.1.76.1.3"]
]

// --- hwMplsLdpMappingCountExceedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.143.2.10
// Fields: hwLdpMappingType, hwLdpVrfIndex
// Description: Indicates that the number of LDP label mapping sent or received on the device falls from the upper limit.
trapMap["1.3.6.1.4.1.2011.5.25.143.2.10"] = [
    name: "hwMplsLdpMappingCountExceedClear",
    fields: ["hwLdpMappingType", "hwLdpVrfIndex"],
    fieldOids: ["hwLdpMappingType": "1.3.6.1.4.1.2011.5.25.143.1.76.1.1", "hwLdpVrfIndex": "1.3.6.1.4.1.2011.5.25.143.1.76.1.2"]
]

// --- hwMplsLdpLastLocalAdjDown (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.143.2.11
// Fields: hwLdpVrfName, hwLdpAdjPeerLsrId, hwLdpInterfaceName
// Description: The last local adjacency in the local-and-remote LDP session went Down due to hello timeout.
trapMap["1.3.6.1.4.1.2011.5.25.143.2.11"] = [
    name: "hwMplsLdpLastLocalAdjDown",
    fields: ["hwLdpVrfName", "hwLdpAdjPeerLsrId", "hwLdpInterfaceName"],
    fieldOids: ["hwLdpVrfName": "1.3.6.1.4.1.2011.5.25.143.1.77.1.1", "hwLdpAdjPeerLsrId": "1.3.6.1.4.1.2011.5.25.143.1.77.1.2", "hwLdpInterfaceName": "1.3.6.1.4.1.2011.5.25.143.1.77.1.3"]
]

// --- hwMplsLdpLastLocalAdjDownClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.143.2.12
// Fields: hwLdpVrfName, hwLdpAdjPeerLsrId
// Description: A local adjacency is established, and the alarm is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.143.2.12"] = [
    name: "hwMplsLdpLastLocalAdjDownClear",
    fields: ["hwLdpVrfName", "hwLdpAdjPeerLsrId"],
    fieldOids: ["hwLdpVrfName": "1.3.6.1.4.1.2011.5.25.143.1.77.1.1", "hwLdpAdjPeerLsrId": "1.3.6.1.4.1.2011.5.25.143.1.77.1.2"]
]

// ===== Parsing logic =====

// Set to true to enable diagnostic logging for this MIB parser
DEBUG = false

LOG_PREFIX = "[HUAWEI-MPLSLDP-MIB]"
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
