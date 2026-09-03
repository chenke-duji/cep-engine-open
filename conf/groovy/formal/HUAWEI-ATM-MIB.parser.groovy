/**
 * Auto-generated from HUAWEI-ATM-MIB.mib
 * Generated: 2026-08-24T18:28:28.941264500
 * Traps/Notifications (15): hwAtmVpcConnectivityTestResultNotify, hwAtmVccConnectivityTestResultNotify, hwVpAis, hwVpAisResume, hwVpRdi, hwVpRdiResume, hwVcAis, hwVcAisResume, hwVcRdi, hwVcRdiResume, hwVpLoc, hwVpLocResume, hwVcLoc, hwVcLocResume, hwNoAtmResourceAlarmTrap
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

// --- hwAtmVpcConnectivityTestResultNotify (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.156.2.1.1
// Fields: hwAtmVpcConnectivityTestIfIndex, hwAtmVpcConnectivityTestVpi, hwAtmVpcConnectivityTestLLID, hwAtmVpcConnectivityTestResult, hwAtmVpcConnectivityTestIfName
// Description: This object indicates that the connectivity test on ATM VPC services is ended.
trapMap["1.3.6.1.4.1.2011.5.25.156.2.1.1"] = [
    name: "hwAtmVpcConnectivityTestResultNotify",
    fields: ["hwAtmVpcConnectivityTestIfIndex", "hwAtmVpcConnectivityTestVpi", "hwAtmVpcConnectivityTestLLID", "hwAtmVpcConnectivityTestResult", "hwAtmVpcConnectivityTestIfName"],
    fieldOids: ["hwAtmVpcConnectivityTestIfIndex": "1.3.6.1.4.1.2011.5.25.156.1.25.1.1", "hwAtmVpcConnectivityTestVpi": "1.3.6.1.4.1.2011.5.25.156.1.25.1.2", "hwAtmVpcConnectivityTestLLID": "1.3.6.1.4.1.2011.5.25.156.1.25.1.3", "hwAtmVpcConnectivityTestResult": "1.3.6.1.4.1.2011.5.25.156.1.25.1.4", "hwAtmVpcConnectivityTestIfName": "1.3.6.1.4.1.2011.5.25.156.1.25.1.5"]
]

// --- hwAtmVccConnectivityTestResultNotify (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.156.2.2.1
// Fields: hwAtmVccConnectivityTestIfIndex, hwAtmVccConnectivityTestVpi, hwAtmVccConnectivityTestVci, hwAtmVccConnectivityTestLLID, hwAtmVccConnectivityTestResult, hwAtmVccConnectivityTestIfName
// Description: This object indicates that the connectivity test on ATM VCC services is ended.
trapMap["1.3.6.1.4.1.2011.5.25.156.2.2.1"] = [
    name: "hwAtmVccConnectivityTestResultNotify",
    fields: ["hwAtmVccConnectivityTestIfIndex", "hwAtmVccConnectivityTestVpi", "hwAtmVccConnectivityTestVci", "hwAtmVccConnectivityTestLLID", "hwAtmVccConnectivityTestResult", "hwAtmVccConnectivityTestIfName"],
    fieldOids: ["hwAtmVccConnectivityTestIfIndex": "1.3.6.1.4.1.2011.5.25.156.1.26.1.1", "hwAtmVccConnectivityTestVpi": "1.3.6.1.4.1.2011.5.25.156.1.26.1.2", "hwAtmVccConnectivityTestVci": "1.3.6.1.4.1.2011.5.25.156.1.26.1.3", "hwAtmVccConnectivityTestLLID": "1.3.6.1.4.1.2011.5.25.156.1.26.1.4", "hwAtmVccConnectivityTestResult": "1.3.6.1.4.1.2011.5.25.156.1.26.1.5", "hwAtmVccConnectivityTestIfName": "1.3.6.1.4.1.2011.5.25.156.1.26.1.6"]
]

// --- hwVpAis (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.156.12.1
// Fields: hwAtmVplIfIndex, hwAtmVplVpi, hwOamAlmDirection, ifName
// Description: The AIS alarm of the VP is found.
trapMap["1.3.6.1.4.1.2011.5.25.156.12.1"] = [
    name: "hwVpAis",
    fields: ["hwAtmVplIfIndex", "hwAtmVplVpi", "hwOamAlmDirection", "ifName"],
    fieldOids: ["hwAtmVplIfIndex": "1.3.6.1.4.1.2011.5.25.156.1.12.1.1", "hwAtmVplVpi": "1.3.6.1.4.1.2011.5.25.156.1.12.1.2", "hwOamAlmDirection": "1.3.6.1.4.1.2011.5.25.156.13", "ifName": "1.3.6.1.2.1.31.1.1.1.1"]
]

// --- hwVpAisResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.156.12.2
// Fields: hwAtmVplIfIndex, hwAtmVplVpi, hwOamAlmDirection, ifName
// Description: The AIS alarm of the VP is cancelled.
trapMap["1.3.6.1.4.1.2011.5.25.156.12.2"] = [
    name: "hwVpAisResume",
    fields: ["hwAtmVplIfIndex", "hwAtmVplVpi", "hwOamAlmDirection", "ifName"],
    fieldOids: ["hwAtmVplIfIndex": "1.3.6.1.4.1.2011.5.25.156.1.12.1.1", "hwAtmVplVpi": "1.3.6.1.4.1.2011.5.25.156.1.12.1.2", "hwOamAlmDirection": "1.3.6.1.4.1.2011.5.25.156.13", "ifName": "1.3.6.1.2.1.31.1.1.1.1"]
]

// --- hwVpRdi (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.156.12.3
// Fields: hwAtmVplIfIndex, hwAtmVplVpi, hwOamAlmDirection, ifName
// Description: The RDI alarm of the VP is found.
trapMap["1.3.6.1.4.1.2011.5.25.156.12.3"] = [
    name: "hwVpRdi",
    fields: ["hwAtmVplIfIndex", "hwAtmVplVpi", "hwOamAlmDirection", "ifName"],
    fieldOids: ["hwAtmVplIfIndex": "1.3.6.1.4.1.2011.5.25.156.1.12.1.1", "hwAtmVplVpi": "1.3.6.1.4.1.2011.5.25.156.1.12.1.2", "hwOamAlmDirection": "1.3.6.1.4.1.2011.5.25.156.13", "ifName": "1.3.6.1.2.1.31.1.1.1.1"]
]

// --- hwVpRdiResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.156.12.4
// Fields: hwAtmVplIfIndex, hwAtmVplVpi, hwOamAlmDirection, ifName
// Description: The RDI alarm of the VP is cancelled.
trapMap["1.3.6.1.4.1.2011.5.25.156.12.4"] = [
    name: "hwVpRdiResume",
    fields: ["hwAtmVplIfIndex", "hwAtmVplVpi", "hwOamAlmDirection", "ifName"],
    fieldOids: ["hwAtmVplIfIndex": "1.3.6.1.4.1.2011.5.25.156.1.12.1.1", "hwAtmVplVpi": "1.3.6.1.4.1.2011.5.25.156.1.12.1.2", "hwOamAlmDirection": "1.3.6.1.4.1.2011.5.25.156.13", "ifName": "1.3.6.1.2.1.31.1.1.1.1"]
]

// --- hwVcAis (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.156.12.5
// Fields: hwAtmVclIfIndex, hwAtmVclVpi, hwAtmVclVci, hwOamAlmDirection, ifName
// Description: The AIS alarm of the VC is found.
trapMap["1.3.6.1.4.1.2011.5.25.156.12.5"] = [
    name: "hwVcAis",
    fields: ["hwAtmVclIfIndex", "hwAtmVclVpi", "hwAtmVclVci", "hwOamAlmDirection", "ifName"],
    fieldOids: ["hwAtmVclIfIndex": "1.3.6.1.4.1.2011.5.25.156.1.13.1.1", "hwAtmVclVpi": "1.3.6.1.4.1.2011.5.25.156.1.13.1.2", "hwAtmVclVci": "1.3.6.1.4.1.2011.5.25.156.1.13.1.3", "hwOamAlmDirection": "1.3.6.1.4.1.2011.5.25.156.13", "ifName": "1.3.6.1.2.1.31.1.1.1.1"]
]

// --- hwVcAisResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.156.12.6
// Fields: hwAtmVclIfIndex, hwAtmVclVpi, hwAtmVclVci, hwOamAlmDirection, ifName
// Description: The AIS alarm of the VC is cancelled.
trapMap["1.3.6.1.4.1.2011.5.25.156.12.6"] = [
    name: "hwVcAisResume",
    fields: ["hwAtmVclIfIndex", "hwAtmVclVpi", "hwAtmVclVci", "hwOamAlmDirection", "ifName"],
    fieldOids: ["hwAtmVclIfIndex": "1.3.6.1.4.1.2011.5.25.156.1.13.1.1", "hwAtmVclVpi": "1.3.6.1.4.1.2011.5.25.156.1.13.1.2", "hwAtmVclVci": "1.3.6.1.4.1.2011.5.25.156.1.13.1.3", "hwOamAlmDirection": "1.3.6.1.4.1.2011.5.25.156.13", "ifName": "1.3.6.1.2.1.31.1.1.1.1"]
]

// --- hwVcRdi (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.156.12.7
// Fields: hwAtmVclIfIndex, hwAtmVclVpi, hwAtmVclVci, hwOamAlmDirection, ifName
// Description: The RDI alarm of the VC is found.
trapMap["1.3.6.1.4.1.2011.5.25.156.12.7"] = [
    name: "hwVcRdi",
    fields: ["hwAtmVclIfIndex", "hwAtmVclVpi", "hwAtmVclVci", "hwOamAlmDirection", "ifName"],
    fieldOids: ["hwAtmVclIfIndex": "1.3.6.1.4.1.2011.5.25.156.1.13.1.1", "hwAtmVclVpi": "1.3.6.1.4.1.2011.5.25.156.1.13.1.2", "hwAtmVclVci": "1.3.6.1.4.1.2011.5.25.156.1.13.1.3", "hwOamAlmDirection": "1.3.6.1.4.1.2011.5.25.156.13", "ifName": "1.3.6.1.2.1.31.1.1.1.1"]
]

// --- hwVcRdiResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.156.12.8
// Fields: hwAtmVclIfIndex, hwAtmVclVpi, hwAtmVclVci, hwOamAlmDirection, ifName
// Description: The RDI alarm of the VC is cancelled.
trapMap["1.3.6.1.4.1.2011.5.25.156.12.8"] = [
    name: "hwVcRdiResume",
    fields: ["hwAtmVclIfIndex", "hwAtmVclVpi", "hwAtmVclVci", "hwOamAlmDirection", "ifName"],
    fieldOids: ["hwAtmVclIfIndex": "1.3.6.1.4.1.2011.5.25.156.1.13.1.1", "hwAtmVclVpi": "1.3.6.1.4.1.2011.5.25.156.1.13.1.2", "hwAtmVclVci": "1.3.6.1.4.1.2011.5.25.156.1.13.1.3", "hwOamAlmDirection": "1.3.6.1.4.1.2011.5.25.156.13", "ifName": "1.3.6.1.2.1.31.1.1.1.1"]
]

// --- hwVpLoc (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.156.12.9
// Fields: hwAtmVplIfIndex, hwAtmVplVpi, hwOamAlmDirection, ifName
// Description: The CC-LOC alarm of the VP is found.
trapMap["1.3.6.1.4.1.2011.5.25.156.12.9"] = [
    name: "hwVpLoc",
    fields: ["hwAtmVplIfIndex", "hwAtmVplVpi", "hwOamAlmDirection", "ifName"],
    fieldOids: ["hwAtmVplIfIndex": "1.3.6.1.4.1.2011.5.25.156.1.12.1.1", "hwAtmVplVpi": "1.3.6.1.4.1.2011.5.25.156.1.12.1.2", "hwOamAlmDirection": "1.3.6.1.4.1.2011.5.25.156.13", "ifName": "1.3.6.1.2.1.31.1.1.1.1"]
]

// --- hwVpLocResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.156.12.10
// Fields: hwAtmVplIfIndex, hwAtmVplVpi, hwOamAlmDirection, ifName
// Description: The CC-LOC alarm of the VP is cancelled.
trapMap["1.3.6.1.4.1.2011.5.25.156.12.10"] = [
    name: "hwVpLocResume",
    fields: ["hwAtmVplIfIndex", "hwAtmVplVpi", "hwOamAlmDirection", "ifName"],
    fieldOids: ["hwAtmVplIfIndex": "1.3.6.1.4.1.2011.5.25.156.1.12.1.1", "hwAtmVplVpi": "1.3.6.1.4.1.2011.5.25.156.1.12.1.2", "hwOamAlmDirection": "1.3.6.1.4.1.2011.5.25.156.13", "ifName": "1.3.6.1.2.1.31.1.1.1.1"]
]

// --- hwVcLoc (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.156.12.11
// Fields: hwAtmVclIfIndex, hwAtmVclVpi, hwAtmVclVci, hwOamAlmDirection, ifName
// Description: The CC-LOC alarm of the VC is found.
trapMap["1.3.6.1.4.1.2011.5.25.156.12.11"] = [
    name: "hwVcLoc",
    fields: ["hwAtmVclIfIndex", "hwAtmVclVpi", "hwAtmVclVci", "hwOamAlmDirection", "ifName"],
    fieldOids: ["hwAtmVclIfIndex": "1.3.6.1.4.1.2011.5.25.156.1.13.1.1", "hwAtmVclVpi": "1.3.6.1.4.1.2011.5.25.156.1.13.1.2", "hwAtmVclVci": "1.3.6.1.4.1.2011.5.25.156.1.13.1.3", "hwOamAlmDirection": "1.3.6.1.4.1.2011.5.25.156.13", "ifName": "1.3.6.1.2.1.31.1.1.1.1"]
]

// --- hwVcLocResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.156.12.12
// Fields: hwAtmVclIfIndex, hwAtmVclVpi, hwAtmVclVci, hwOamAlmDirection, ifName
// Description: The CC-LOC alarm of the VC is cancelled.
trapMap["1.3.6.1.4.1.2011.5.25.156.12.12"] = [
    name: "hwVcLocResume",
    fields: ["hwAtmVclIfIndex", "hwAtmVclVpi", "hwAtmVclVci", "hwOamAlmDirection", "ifName"],
    fieldOids: ["hwAtmVclIfIndex": "1.3.6.1.4.1.2011.5.25.156.1.13.1.1", "hwAtmVclVpi": "1.3.6.1.4.1.2011.5.25.156.1.13.1.2", "hwAtmVclVci": "1.3.6.1.4.1.2011.5.25.156.1.13.1.3", "hwOamAlmDirection": "1.3.6.1.4.1.2011.5.25.156.13", "ifName": "1.3.6.1.2.1.31.1.1.1.1"]
]

// --- hwNoAtmResourceAlarmTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.156.12.13
// Fields: hwFrameIndex, hwSlotIndex, hwPortIndex
// Description: When ATM resources of the system are insufficient, this trap will be generated.
trapMap["1.3.6.1.4.1.2011.5.25.156.12.13"] = [
    name: "hwNoAtmResourceAlarmTrap",
    fields: ["hwFrameIndex", "hwSlotIndex", "hwPortIndex"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwSlotIndex": "1.3.6.1.4.1.2011.6.3.3.2.1.1", "hwPortIndex": "1.3.6.1.4.1.2011.6.3.3.4.1.1"]
]

// ===== Parsing logic =====

// Set to true to enable diagnostic logging for this MIB parser
DEBUG = false

LOG_PREFIX = "[HUAWEI-ATM-MIB]"
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
