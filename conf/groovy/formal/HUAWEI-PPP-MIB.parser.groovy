/**
 * Auto-generated from HUAWEI-PPP-MIB.mib
 * Generated: 2026-08-24T18:28:30.732986600
 * Traps/Notifications (8): hwPppLoopbackDetect, hwPppLoopbackDetResume, hwLcpNegotiateFailed, hwLcpNegotiateResumed, hwNcpNegotiateFailed, hwNcpNegotiateResumed, hwMpDown, hwMpUp
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

// --- hwPppLoopbackDetect (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.169.2.1
// Fields: ifName
// Description: The interface Loopback is detected.
trapMap["1.3.6.1.4.1.2011.5.25.169.2.1"] = [
    name: "hwPppLoopbackDetect",
    fields: ["ifName"],
    fieldOids: ["ifName": "1.3.6.1.2.1.31.1.1.1.1"]
]

// --- hwPppLoopbackDetResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.169.2.2
// Fields: ifName
// Description: The interface is recovered from Loopback.
trapMap["1.3.6.1.4.1.2011.5.25.169.2.2"] = [
    name: "hwPppLoopbackDetResume",
    fields: ["ifName"],
    fieldOids: ["ifName": "1.3.6.1.2.1.31.1.1.1.1"]
]

// --- hwLcpNegotiateFailed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.169.2.3
// Fields: ifName, hwPppNegotiationFailReason
// Description: The PPP LCP negotiation failed. Send this trap when LCP protocol negotiation failed. 1.ifName: interface name. 2.hwPppNegotiationFailReason: the reason of LCP protocol negotiation failure.
trapMap["1.3.6.1.4.1.2011.5.25.169.2.3"] = [
    name: "hwLcpNegotiateFailed",
    fields: ["ifName", "hwPppNegotiationFailReason"],
    fieldOids: ["ifName": "1.3.6.1.2.1.31.1.1.1.1", "hwPppNegotiationFailReason": "1.3.6.1.4.1.2011.5.25.169.1.3.1"]
]

// --- hwLcpNegotiateResumed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.169.2.4
// Fields: ifName
// Description: The PPP LCP negotiation resumed. 1.ifName: interface name.
trapMap["1.3.6.1.4.1.2011.5.25.169.2.4"] = [
    name: "hwLcpNegotiateResumed",
    fields: ["ifName"],
    fieldOids: ["ifName": "1.3.6.1.2.1.31.1.1.1.1"]
]

// --- hwNcpNegotiateFailed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.169.2.5
// Fields: ifName, hwPppNcpName, hwPppNegotiationFailReason
// Description: The PPP NCP negotiation failed. Send this trap when NCP protocol negotiation failed. 1.ifName: interface name. 2.hwPppNcpName: NCP name. 3.hwPppNegotiationFailReason: the reason of NCP protocol negoti...
trapMap["1.3.6.1.4.1.2011.5.25.169.2.5"] = [
    name: "hwNcpNegotiateFailed",
    fields: ["ifName", "hwPppNcpName", "hwPppNegotiationFailReason"],
    fieldOids: ["ifName": "1.3.6.1.2.1.31.1.1.1.1", "hwPppNcpName": "1.3.6.1.4.1.2011.5.25.169.1.3.2", "hwPppNegotiationFailReason": "1.3.6.1.4.1.2011.5.25.169.1.3.1"]
]

// --- hwNcpNegotiateResumed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.169.2.6
// Fields: ifName, hwPppNcpName
// Description: The PPP NCP negotiation resumed. 1.ifName: interface name. 2.hwPppNcpName: NCP name.
trapMap["1.3.6.1.4.1.2011.5.25.169.2.6"] = [
    name: "hwNcpNegotiateResumed",
    fields: ["ifName", "hwPppNcpName"],
    fieldOids: ["ifName": "1.3.6.1.2.1.31.1.1.1.1", "hwPppNcpName": "1.3.6.1.4.1.2011.5.25.169.1.3.2"]
]

// --- hwMpDown (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.169.2.7
// Fields: ifIndex, ifName
// Description: MP is Down because Bind Number is Smaller than threshold-least.
trapMap["1.3.6.1.4.1.2011.5.25.169.2.7"] = [
    name: "hwMpDown",
    fields: ["ifIndex", "ifName"],
    fieldOids: ["ifIndex": "1.3.6.1.2.1.2.2.1.1", "ifName": "1.3.6.1.2.1.31.1.1.1.1"]
]

// --- hwMpUp (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.169.2.8
// Fields: ifIndex, ifName
// Description: MP is Up because Bind Number is Larger than threshold-least
trapMap["1.3.6.1.4.1.2011.5.25.169.2.8"] = [
    name: "hwMpUp",
    fields: ["ifIndex", "ifName"],
    fieldOids: ["ifIndex": "1.3.6.1.2.1.2.2.1.1", "ifName": "1.3.6.1.2.1.31.1.1.1.1"]
]

// ===== Parsing logic =====

// Set to true to enable diagnostic logging for this MIB parser
DEBUG = false

LOG_PREFIX = "[HUAWEI-PPP-MIB]"
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
