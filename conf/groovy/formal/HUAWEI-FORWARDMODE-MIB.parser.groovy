/**
 * Auto-generated from HUAWEI-FORWARDMODE-MIB.mib
 * Generated: 2026-08-24T18:28:29.677251300
 * Traps/Notifications (4): hwFwdFibAlarmOccur, hwFwdFibAlarmResume, hwSeuIgpDownRiskingOccur, hwSeuIgpDownRiskingResume
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

// --- hwFwdFibAlarmOccur (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.231.3.1
// Fields: hwForwardModeStaVpnSlotId, hwForwardModeV4V6Flag
// Description: This object indicates that import of IPv4/IPv6 static routes between public networks and VPN instances is not supported on the board.
trapMap["1.3.6.1.4.1.2011.5.25.231.3.1"] = [
    name: "hwFwdFibAlarmOccur",
    fields: ["hwForwardModeStaVpnSlotId", "hwForwardModeV4V6Flag"],
    fieldOids: ["hwForwardModeStaVpnSlotId": "1.3.6.1.4.1.2011.5.25.231.1.2.1.1", "hwForwardModeV4V6Flag": "1.3.6.1.4.1.2011.5.25.231.1.2.1.2"]
]

// --- hwFwdFibAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.231.3.2
// Fields: hwForwardModeStaVpnSlotId, hwForwardModeV4V6Flag
// Description: This object indicates that the board in the current slot supports IPv4 or IPv6 static routes imported between VPN and public network instances.
trapMap["1.3.6.1.4.1.2011.5.25.231.3.2"] = [
    name: "hwFwdFibAlarmResume",
    fields: ["hwForwardModeStaVpnSlotId", "hwForwardModeV4V6Flag"],
    fieldOids: ["hwForwardModeStaVpnSlotId": "1.3.6.1.4.1.2011.5.25.231.1.2.1.1", "hwForwardModeV4V6Flag": "1.3.6.1.4.1.2011.5.25.231.1.2.1.2"]
]

// --- hwSeuIgpDownRiskingOccur (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.231.4.2
// Fields: hwSeuIgpDownRiskingCardId, hwSeuIgpDownRiskingPortId, hwSeuIgpDownRiskingInterfaceName, hwSeuIgpDownRiskingProtocolName
// Description: A SEU logic error occurred on the subcard of the current board, causing the IGP interruption.
trapMap["1.3.6.1.4.1.2011.5.25.231.4.2"] = [
    name: "hwSeuIgpDownRiskingOccur",
    fields: ["hwSeuIgpDownRiskingCardId", "hwSeuIgpDownRiskingPortId", "hwSeuIgpDownRiskingInterfaceName", "hwSeuIgpDownRiskingProtocolName"],
    fieldOids: ["hwSeuIgpDownRiskingCardId": "1.3.6.1.4.1.2011.5.25.231.4.1.1.1", "hwSeuIgpDownRiskingPortId": "1.3.6.1.4.1.2011.5.25.231.4.1.1.2", "hwSeuIgpDownRiskingInterfaceName": "1.3.6.1.4.1.2011.5.25.231.4.1.1.3", "hwSeuIgpDownRiskingProtocolName": "1.3.6.1.4.1.2011.5.25.231.4.1.1.4"]
]

// --- hwSeuIgpDownRiskingResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.231.4.3
// Fields: hwSeuIgpDownRiskingCardId, hwSeuIgpDownRiskingPortId, hwSeuIgpDownRiskingInterfaceName, hwSeuIgpDownRiskingProtocolName
// Description: The alarm was cleared because the IGP went Up again or stayed Down for an hour or a longer time.
trapMap["1.3.6.1.4.1.2011.5.25.231.4.3"] = [
    name: "hwSeuIgpDownRiskingResume",
    fields: ["hwSeuIgpDownRiskingCardId", "hwSeuIgpDownRiskingPortId", "hwSeuIgpDownRiskingInterfaceName", "hwSeuIgpDownRiskingProtocolName"],
    fieldOids: ["hwSeuIgpDownRiskingCardId": "1.3.6.1.4.1.2011.5.25.231.4.1.1.1", "hwSeuIgpDownRiskingPortId": "1.3.6.1.4.1.2011.5.25.231.4.1.1.2", "hwSeuIgpDownRiskingInterfaceName": "1.3.6.1.4.1.2011.5.25.231.4.1.1.3", "hwSeuIgpDownRiskingProtocolName": "1.3.6.1.4.1.2011.5.25.231.4.1.1.4"]
]

// ===== Parsing logic =====

// Set to true to enable diagnostic logging for this MIB parser
DEBUG = false

LOG_PREFIX = "[HUAWEI-FORWARDMODE-MIB]"
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
