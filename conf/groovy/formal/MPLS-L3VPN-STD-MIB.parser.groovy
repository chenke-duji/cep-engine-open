/**
 * Auto-generated from MPLS-L3VPN-STD-MIB.mib
 * Generated: 2026-08-25T16:47:06.193153100
 * Traps/Notifications (6): mplsL3VpnVrfUp, mplsL3VpnVrfDown, mplsL3VpnVrfRouteMidThreshExceeded, mplsL3VpnVrfNumVrfRouteMaxThreshExceeded, mplsL3VpnNumVrfSecIllglLblThrshExcd, mplsL3VpnNumVrfRouteMaxThreshCleared
 *
 * Mapping rules:
 *   node       = trap source IP (rawEvent.sourceIp)
 *   alertGroup/summary/severity/type = per-trap rule overrides
 */

import com.dujitech.cep.model.AlarmEvent
import com.dujitech.cep.model.EventType
import com.dujitech.cep.model.Severity

// ===== Trap OID -> definition mapping =====
// Key: fully resolved numeric OID, Value: [name, fields, fieldOids]
def trapMap = [:]

// ===== Name -> definition mapping (fallback for unresolved OIDs) =====
def trapNameMap = [:]

// --- mplsL3VpnVrfUp (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.2.1.10.166.11.0.1
// Fields: mplsL3VpnIfConfRowStatus, mplsL3VpnVrfOperStatus
// Description: This notification is generated when: a. No interface is associated with this VRF, and the first (and only first) interface associated with it has its ifOperStatus change to up(1). b. One interface is ...
trapMap["1.3.6.1.2.1.10.166.11.0.1"] = [
    name: "mplsL3VpnVrfUp",
    fields: ["mplsL3VpnIfConfRowStatus", "mplsL3VpnVrfOperStatus"],
    fieldOids: ["mplsL3VpnIfConfRowStatus": "1.3.6.1.2.1.10.166.11.1.2.1.1.5", "mplsL3VpnVrfOperStatus": "1.3.6.1.2.1.10.166.11.1.2.2.1.6"]
]

// --- mplsL3VpnVrfDown (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.2.1.10.166.11.0.2
// Fields: mplsL3VpnIfConfRowStatus, mplsL3VpnVrfOperStatus
// Description: This notification is generated when: a. One interface is associated with this VRF, and the ifOperStatus of this interface changes from up(1) to down(2). b. Multiple interfaces are associated with this...
trapMap["1.3.6.1.2.1.10.166.11.0.2"] = [
    name: "mplsL3VpnVrfDown",
    fields: ["mplsL3VpnIfConfRowStatus", "mplsL3VpnVrfOperStatus"],
    fieldOids: ["mplsL3VpnIfConfRowStatus": "1.3.6.1.2.1.10.166.11.1.2.1.1.5", "mplsL3VpnVrfOperStatus": "1.3.6.1.2.1.10.166.11.1.2.2.1.6"]
]

// --- mplsL3VpnVrfRouteMidThreshExceeded (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.2.1.10.166.11.0.3
// Fields: mplsL3VpnVrfPerfCurrNumRoutes, mplsL3VpnVrfConfMidRteThresh
// Description: This notification is generated when the number of routes contained by the specified VRF exceeds the value indicated by mplsL3VpnVrfMidRouteThreshold. A single notification MUST be generated when this ...
trapMap["1.3.6.1.2.1.10.166.11.0.3"] = [
    name: "mplsL3VpnVrfRouteMidThreshExceeded",
    fields: ["mplsL3VpnVrfPerfCurrNumRoutes", "mplsL3VpnVrfConfMidRteThresh"],
    fieldOids: ["mplsL3VpnVrfPerfCurrNumRoutes": "1.3.6.1.2.1.10.166.11.1.3.1.1.3", "mplsL3VpnVrfConfMidRteThresh": "1.3.6.1.2.1.10.166.11.1.2.2.1.9"]
]

// --- mplsL3VpnVrfNumVrfRouteMaxThreshExceeded (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.2.1.10.166.11.0.4
// Fields: mplsL3VpnVrfPerfCurrNumRoutes, mplsL3VpnVrfConfHighRteThresh
// Description: This notification is generated when the number of routes contained by the specified VRF exceeds or attempts to exceed the maximum allowed value as indicated by mplsL3VpnVrfMaxRouteThreshold. In cases ...
trapMap["1.3.6.1.2.1.10.166.11.0.4"] = [
    name: "mplsL3VpnVrfNumVrfRouteMaxThreshExceeded",
    fields: ["mplsL3VpnVrfPerfCurrNumRoutes", "mplsL3VpnVrfConfHighRteThresh"],
    fieldOids: ["mplsL3VpnVrfPerfCurrNumRoutes": "1.3.6.1.2.1.10.166.11.1.3.1.1.3", "mplsL3VpnVrfConfHighRteThresh": "1.3.6.1.2.1.10.166.11.1.2.2.1.10"]
]

// --- mplsL3VpnNumVrfSecIllglLblThrshExcd (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.2.1.10.166.11.0.5
// Fields: mplsL3VpnVrfSecIllegalLblVltns
// Description: This notification is generated when the number of illegal label violations on a VRF as indicated by mplsL3VpnVrfSecIllegalLblVltns has exceeded mplsL3VpnIllLblRcvThrsh. The threshold is not included i...
trapMap["1.3.6.1.2.1.10.166.11.0.5"] = [
    name: "mplsL3VpnNumVrfSecIllglLblThrshExcd",
    fields: ["mplsL3VpnVrfSecIllegalLblVltns"],
    fieldOids: ["mplsL3VpnVrfSecIllegalLblVltns": "1.3.6.1.2.1.10.166.11.1.2.6.1.1"]
]

// --- mplsL3VpnNumVrfRouteMaxThreshCleared (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.2.1.10.166.11.0.6
// Fields: mplsL3VpnVrfPerfCurrNumRoutes, mplsL3VpnVrfConfHighRteThresh
// Description: This notification is generated only after the number of routes contained by the specified VRF exceeds or attempts to exceed the maximum allowed value as indicated by mplsVrfMaxRouteThreshold, and then...
trapMap["1.3.6.1.2.1.10.166.11.0.6"] = [
    name: "mplsL3VpnNumVrfRouteMaxThreshCleared",
    fields: ["mplsL3VpnVrfPerfCurrNumRoutes", "mplsL3VpnVrfConfHighRteThresh"],
    fieldOids: ["mplsL3VpnVrfPerfCurrNumRoutes": "1.3.6.1.2.1.10.166.11.1.3.1.1.3", "mplsL3VpnVrfConfHighRteThresh": "1.3.6.1.2.1.10.166.11.1.2.2.1.10"]
]

// ===== Lookup tables (inlined) =====
def lookupTables = [:]

// ===== Parsing logic =====

// Set to true to enable diagnostic logging for this MIB parser
DEBUG = false

LOG_PREFIX = "[MPLS-L3VPN-STD-MIB]"
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
event.setStatus("UnAcked")
event.setEventClass("snmp_trap")
event.setSpecificTrap(trapOid ?: "")
event.setOriginalSeverity(event.getSeverity())
event.setOriginalSummary(event.getSummary())

// --- Trap rule overrides (alert group / severity) ---
def trapRuleName = trapInfo.name
def agent = ""
// --- Trap: mplsL3VpnVrfUp (OID 1.3.6.1.2.1.10.166.11.1) ---
if (trapRuleName == "mplsL3VpnVrfUp") {
    event.setAlertGroup("VRF Interface Status")
    def alertKey = "mplsL3VpnIfConfEntry." + (((resolveInstanceOid(1) =~ /3\.6\.1\.2\.1\.10\.166\.11\.1\.2\.1\.1\.5\.(.*)\.[0-9]+$/) ? (resolveInstanceOid(1) =~ /3\.6\.1\.2\.1\.10\.166\.11\.1\.2\.1\.1\.5\.(.*)\.[0-9]+$/)[0][1] : '')) + "." + (((resolveInstanceOid(1) =~ /\.([0-9]+)$/) ? (resolveInstanceOid(1) =~ /\.([0-9]+)$/)[0][1] : ''))
    event.setAlertKey(alertKey)
    def summary = "Mpls L3 Vpn Vrf Up" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(1)
    event.setEventType("2")
}
// --- Trap: mplsL3VpnVrfDown (OID 1.3.6.1.2.1.10.166.11.2) ---
if (trapRuleName == "mplsL3VpnVrfDown") {
    event.setAlertGroup("VRF Interface Status")
    def alertKey = "mplsL3VpnIfConfEntry." + (((resolveInstanceOid(1) =~ /3\.6\.1\.2\.1\.10\.166\.11\.1\.2\.1\.1\.5\.(.*)\.[0-9]+$/) ? (resolveInstanceOid(1) =~ /3\.6\.1\.2\.1\.10\.166\.11\.1\.2\.1\.1\.5\.(.*)\.[0-9]+$/)[0][1] : '')) + "." + (((resolveInstanceOid(1) =~ /\.([0-9]+)$/) ? (resolveInstanceOid(1) =~ /\.([0-9]+)$/)[0][1] : ''))
    event.setAlertKey(alertKey)
    def summary = "Mpls L3 Vpn Vrf Down" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(4)
    event.setEventType("1")
}
// --- Trap: mplsL3VpnVrfRouteMidThreshExceeded (OID 1.3.6.1.2.1.10.166.11.3) ---
if (trapRuleName == "mplsL3VpnVrfRouteMidThreshExceeded") {
    event.setAlertGroup("VRF Route Mid Threshold")
    def alertKey = "mplsL3VpnVrfEntry." + (((resolveInstanceOid(2) =~ /3\.6\.1\.2\.1\.10\.166\.11\.1\.2\.2\.1\.9\.(.*)$/) ? (resolveInstanceOid(2) =~ /3\.6\.1\.2\.1\.10\.166\.11\.1\.2\.2\.1\.9\.(.*)$/)[0][1] : ''))
    event.setAlertKey(alertKey)
    def summary = "Mpls L3 Vpn Vrf Route Mid Thresh Exceeded" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(3)
    event.setEventType("1")
    def dyn = event.getDynamicFields() ?: [:]
    dyn["mplsL3VpnVrfPerfCurrNumRoutes"] = varbinds.get("mplsL3VpnVrfPerfCurrNumRoutes")
    dyn["mplsL3VpnVrfConfMidRteThresh"] = varbinds.get("mplsL3VpnVrfConfMidRteThresh")
    dyn["mplsL3VpnVrfName"] = varbinds.get("mplsL3VpnVrfName")
    event.setDynamicFields(dyn)
}
// --- Trap: mplsL3VpnVrfNumVrfRouteMaxThreshExceeded (OID 1.3.6.1.2.1.10.166.11.4) ---
if (trapRuleName == "mplsL3VpnVrfNumVrfRouteMaxThreshExceeded") {
    event.setAlertGroup("VRF Route Maximum Threshold")
    def alertKey = "mplsL3VpnVrfEntry." + (((resolveInstanceOid(2) =~ /3\.6\.1\.2\.1\.10\.166\.11\.1\.2\.2\.1\.10\.(.*)$/) ? (resolveInstanceOid(2) =~ /3\.6\.1\.2\.1\.10\.166\.11\.1\.2\.2\.1\.10\.(.*)$/)[0][1] : ''))
    event.setAlertKey(alertKey)
    def summary = "Mpls L3 Vpn Vrf Num Vrf Route Max Thresh Exceeded" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(4)
    event.setEventType("1")
    def dyn = event.getDynamicFields() ?: [:]
    dyn["mplsL3VpnVrfPerfCurrNumRoutes"] = varbinds.get("mplsL3VpnVrfPerfCurrNumRoutes")
    dyn["mplsL3VpnVrfConfHighRteThresh"] = varbinds.get("mplsL3VpnVrfConfHighRteThresh")
    dyn["mplsL3VpnVrfName"] = varbinds.get("mplsL3VpnVrfName")
    event.setDynamicFields(dyn)
}
// --- Trap: mplsL3VpnNumVrfSecIllglLblThrshExcd (OID 1.3.6.1.2.1.10.166.11.5) ---
if (trapRuleName == "mplsL3VpnNumVrfSecIllglLblThrshExcd") {
    event.setAlertGroup("VRF Illegal Label Violations Threshold")
    def alertKey = "mplsL3VpnVrfSecEntry." + (((resolveInstanceOid(1) =~ /3\.6\.1\.2\.1\.10\.166\.11\.1\.2\.6\.1\.1\.(.*)$/) ? (resolveInstanceOid(1) =~ /3\.6\.1\.2\.1\.10\.166\.11\.1\.2\.6\.1\.1\.(.*)$/)[0][1] : ''))
    event.setAlertKey(alertKey)
    def summary = "Mpls L3 Vpn Num Vrf Sec Illgl Lbl Thrsh Excd" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(3)
    event.setEventType("1")
    def dyn = event.getDynamicFields() ?: [:]
    dyn["mplsL3VpnVrfSecIllegalLblVltns"] = varbinds.get("mplsL3VpnVrfSecIllegalLblVltns")
    dyn["mplsL3VpnVrfName"] = varbinds.get("mplsL3VpnVrfName")
    event.setDynamicFields(dyn)
}
// --- Trap: mplsL3VpnNumVrfRouteMaxThreshCleared (OID 1.3.6.1.2.1.10.166.11.6) ---
if (trapRuleName == "mplsL3VpnNumVrfRouteMaxThreshCleared") {
    event.setAlertGroup("VRF Route Maximum Threshold")
    def alertKey = "mplsL3VpnVrfEntry." + (((resolveInstanceOid(2) =~ /3\.6\.1\.2\.1\.10\.166\.11\.1\.2\.2\.1\.10\.(.*)$/) ? (resolveInstanceOid(2) =~ /3\.6\.1\.2\.1\.10\.166\.11\.1\.2\.2\.1\.10\.(.*)$/)[0][1] : ''))
    event.setAlertKey(alertKey)
    def summary = "Mpls L3 Vpn Num Vrf Route Max Thresh Cleared" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(1)
    event.setEventType("2")
    def dyn = event.getDynamicFields() ?: [:]
    dyn["mplsL3VpnVrfPerfCurrNumRoutes"] = varbinds.get("mplsL3VpnVrfPerfCurrNumRoutes")
    dyn["mplsL3VpnVrfConfHighRteThresh"] = varbinds.get("mplsL3VpnVrfConfHighRteThresh")
    dyn["mplsL3VpnVrfName"] = varbinds.get("mplsL3VpnVrfName")
    event.setDynamicFields(dyn)
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
