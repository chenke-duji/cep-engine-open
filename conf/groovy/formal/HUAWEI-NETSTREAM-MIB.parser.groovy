/**
 * Auto-generated from HUAWEI-NETSTREAM-MIB.mib
 * Generated: 2026-08-22T00:56:04.151835500
 * Traps/Notifications (8): hwNetStreamIndexStatusChanged, hwNetStreamIndexUsedUp, hwNetStreamSessionFull, hwNetStreamAggCpuOverThreshold, hwNsmSampleRateInconsistent, hwNsmSampleRateInconsistentResume, hwNsmIndexSwitchInconsistent, hwNsmIndexSwitchInconsistentResume
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

// --- hwNetStreamIndexStatusChanged (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.110.2.0.1
// Description: The object indicates if the hwNetStreamIfIndexTable has been changed when interface is deleted,created and board is inserted and drawed.
trapMap["1.3.6.1.4.1.2011.5.25.110.2.0.1"] = [
    name: "hwNetStreamIndexStatusChanged",
    fields: [],
    fieldOids: []
]

// --- hwNetStreamIndexUsedUp (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.110.2.0.2
// Description: The object indicates if there is enough index to be distributed, which is on the managed object.
trapMap["1.3.6.1.4.1.2011.5.25.110.2.0.2"] = [
    name: "hwNetStreamIndexUsedUp",
    fields: [],
    fieldOids: []
]

// --- hwNetStreamSessionFull (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.110.2.0.3
// Description: The object indicates if the session is full.
trapMap["1.3.6.1.4.1.2011.5.25.110.2.0.3"] = [
    name: "hwNetStreamSessionFull",
    fields: [],
    fieldOids: []
]

// --- hwNetStreamAggCpuOverThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.110.2.0.4
// Description: The object indicates if the current CPU usage exceeds the CPU threshold for aggregated traffic collection.
trapMap["1.3.6.1.4.1.2011.5.25.110.2.0.4"] = [
    name: "hwNetStreamAggCpuOverThreshold",
    fields: [],
    fieldOids: []
]

// --- hwNsmSampleRateInconsistent (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.110.2.1.1
// Fields: hwNsmSlotId, hwNsmFixPacketsLowerLimit, hwNsmRandomPacketsLowerLimit, hwNsmFixTimeLowerLimit
// Description: The configured NetStream sampling ratio was different from the effective one.
trapMap["1.3.6.1.4.1.2011.5.25.110.2.1.1"] = [
    name: "hwNsmSampleRateInconsistent",
    fields: ["hwNsmSlotId", "hwNsmFixPacketsLowerLimit", "hwNsmRandomPacketsLowerLimit", "hwNsmFixTimeLowerLimit"],
    fieldOids: ["hwNsmSlotId": "1.3.6.1.4.1.2011.5.25.110.1.4.1.1", "hwNsmFixPacketsLowerLimit": "1.3.6.1.4.1.2011.5.25.110.1.4.1.2", "hwNsmRandomPacketsLowerLimit": "1.3.6.1.4.1.2011.5.25.110.1.4.1.3", "hwNsmFixTimeLowerLimit": "1.3.6.1.4.1.2011.5.25.110.1.4.1.4"]
]

// --- hwNsmSampleRateInconsistentResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.110.2.1.2
// Fields: hwNsmSlotId, hwNsmFixPacketsLowerLimit, hwNsmRandomPacketsLowerLimit, hwNsmFixTimeLowerLimit
// Description: The configured NetStream sampling ratio was same from the effective one.
trapMap["1.3.6.1.4.1.2011.5.25.110.2.1.2"] = [
    name: "hwNsmSampleRateInconsistentResume",
    fields: ["hwNsmSlotId", "hwNsmFixPacketsLowerLimit", "hwNsmRandomPacketsLowerLimit", "hwNsmFixTimeLowerLimit"],
    fieldOids: ["hwNsmSlotId": "1.3.6.1.4.1.2011.5.25.110.1.4.1.1", "hwNsmFixPacketsLowerLimit": "1.3.6.1.4.1.2011.5.25.110.1.4.1.2", "hwNsmRandomPacketsLowerLimit": "1.3.6.1.4.1.2011.5.25.110.1.4.1.3", "hwNsmFixTimeLowerLimit": "1.3.6.1.4.1.2011.5.25.110.1.4.1.4"]
]

// --- hwNsmIndexSwitchInconsistent (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.110.2.1.3
// Fields: hwNsmIpv4IndexSwitch, hwNsmIpv6IndexSwitch
// Description: The interface index type of IPv4 packets differs from that of IPv6 packets.
trapMap["1.3.6.1.4.1.2011.5.25.110.2.1.3"] = [
    name: "hwNsmIndexSwitchInconsistent",
    fields: ["hwNsmIpv4IndexSwitch", "hwNsmIpv6IndexSwitch"],
    fieldOids: ["hwNsmIpv4IndexSwitch": "1.3.6.1.4.1.2011.5.25.110.1.5.1.1", "hwNsmIpv6IndexSwitch": "1.3.6.1.4.1.2011.5.25.110.1.5.1.2"]
]

// --- hwNsmIndexSwitchInconsistentResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.110.2.1.4
// Fields: hwNsmIpv4IndexSwitch, hwNsmIpv6IndexSwitch
// Description: The interface index type of IPv4 packets is the same as that of IPv6 packets.
trapMap["1.3.6.1.4.1.2011.5.25.110.2.1.4"] = [
    name: "hwNsmIndexSwitchInconsistentResume",
    fields: ["hwNsmIpv4IndexSwitch", "hwNsmIpv6IndexSwitch"],
    fieldOids: ["hwNsmIpv4IndexSwitch": "1.3.6.1.4.1.2011.5.25.110.1.5.1.1", "hwNsmIpv6IndexSwitch": "1.3.6.1.4.1.2011.5.25.110.1.5.1.2"]
]

// ===== Lookup tables (inlined) =====
def lookupTables = [:]

// ===== Parsing logic =====

// Set to true to enable diagnostic logging for this MIB parser
DEBUG = false

LOG_PREFIX = "[HUAWEI-NETSTREAM-MIB]"
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
event.setStatus("ACTIVE")
event.setEventClass("snmp_trap")
event.setSpecificTrap(trapOid ?: "")
event.setOriginalSeverity(event.getSeverity())
event.setOriginalSummary(event.getSummary())

// --- Trap rule overrides (alert group / severity) ---
def trapRuleName = trapInfo.name
def agent = ""
// --- Trap: hwNetStreamIndexStatusChanged (OID 1.3.6.1.4.1.2011.5.25.110.2.1) ---
if (trapRuleName == "hwNetStreamIndexStatusChanged") {
    event.setAlertGroup("Netstream Interface Status")
    def alertKey = ""
    event.setAlertKey(alertKey)
    def summary = "Hw Net Stream Index Status Changed"
    event.setSummary(summary)
    event.setSeverity(2)
    event.setEventType("13")
}
// --- Trap: hwNetStreamIndexUsedUp (OID 1.3.6.1.4.1.2011.5.25.110.2.2) ---
if (trapRuleName == "hwNetStreamIndexUsedUp") {
    event.setAlertGroup("Netstream Interface Status")
    def alertKey = ""
    event.setAlertKey(alertKey)
    def summary = "Hw Net Stream Index Used Up"
    event.setSummary(summary)
    event.setSeverity(2)
    event.setEventType("1")
}

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
