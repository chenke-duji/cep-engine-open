/**
 * Auto-generated from HUAWEI-VRRP-EXT-MIB.mib
 * Generated: 2026-08-24T18:28:31.417847200
 * Traps/Notifications (8): hwVrrpExtTrapMasterDown, hwVrrpExtTrapNonMaster, hwVrrpExtTrapExpectStateChange, hwVrrpExtTrapExpectStateResume, hwVrrpExtTrapVirtualIPConflict, hwVrrpExtTrapVirtualIPConflictResume, hwVrrpExtTrapResLimit, hwVrrp6ExtTrapResLimit
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

// --- hwVrrpExtTrapMasterDown (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.127.2.30.1
// Fields: vrrpOperMasterIpAddr, sysName, ifName, vrrpOperState, hwVrrpExtStateChangeReasonString
// Description: The MasterDown trap indicates that the state of vrrp has transitioned from 'Master' to other state. The other state can be noactive(0), initialize(1) and backup(2).
trapMap["1.3.6.1.4.1.2011.5.25.127.2.30.1"] = [
    name: "hwVrrpExtTrapMasterDown",
    fields: ["vrrpOperMasterIpAddr", "sysName", "ifName", "vrrpOperState", "hwVrrpExtStateChangeReasonString"],
    fieldOids: ["vrrpOperMasterIpAddr": "1.3.6.1.2.1.68.1.3.1.7", "sysName": "1.3.6.1.2.1.1.5", "ifName": "1.3.6.1.2.1.31.1.1.1.1", "vrrpOperState": "1.3.6.1.2.1.68.1.3.1.3", "hwVrrpExtStateChangeReasonString": "1.3.6.1.4.1.2011.5.25.127.1.7"]
]

// --- hwVrrpExtTrapNonMaster (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.127.2.30.2
// Fields: vrrpOperPrimaryIpAddr, sysName, ifName, vrrpOperState, hwVrrpExtStateChangeReasonString
// Description: The NonMaster trap indicates that the state of vrrp has transitioned between Backup and Initialize state.
trapMap["1.3.6.1.4.1.2011.5.25.127.2.30.2"] = [
    name: "hwVrrpExtTrapNonMaster",
    fields: ["vrrpOperPrimaryIpAddr", "sysName", "ifName", "vrrpOperState", "hwVrrpExtStateChangeReasonString"],
    fieldOids: ["vrrpOperPrimaryIpAddr": "1.3.6.1.2.1.68.1.3.1.8", "sysName": "1.3.6.1.2.1.1.5", "ifName": "1.3.6.1.2.1.31.1.1.1.1", "vrrpOperState": "1.3.6.1.2.1.68.1.3.1.3", "hwVrrpExtStateChangeReasonString": "1.3.6.1.4.1.2011.5.25.127.1.7"]
]

// --- hwVrrpExtTrapExpectStateChange (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.127.2.30.3
// Fields: ifName, hwVrrpExpectState, hwVrrpExtStateChangeReasonString
// Description: The ExpectStateChange trap indicates that the state of vrrp is inconsistant with the expected state.
trapMap["1.3.6.1.4.1.2011.5.25.127.2.30.3"] = [
    name: "hwVrrpExtTrapExpectStateChange",
    fields: ["ifName", "hwVrrpExpectState", "hwVrrpExtStateChangeReasonString"],
    fieldOids: ["ifName": "1.3.6.1.2.1.31.1.1.1.1", "hwVrrpExpectState": "1.3.6.1.4.1.2011.5.25.127.2.9.1.5", "hwVrrpExtStateChangeReasonString": "1.3.6.1.4.1.2011.5.25.127.1.7"]
]

// --- hwVrrpExtTrapExpectStateResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.127.2.30.4
// Fields: ifName, hwVrrpExpectState, hwVrrpExtStateChangeReasonString
// Description: The ExpectStateResume trap indicates that the state of vrrp is consistant with the expected state.
trapMap["1.3.6.1.4.1.2011.5.25.127.2.30.4"] = [
    name: "hwVrrpExtTrapExpectStateResume",
    fields: ["ifName", "hwVrrpExpectState", "hwVrrpExtStateChangeReasonString"],
    fieldOids: ["ifName": "1.3.6.1.2.1.31.1.1.1.1", "hwVrrpExpectState": "1.3.6.1.4.1.2011.5.25.127.2.9.1.5", "hwVrrpExtStateChangeReasonString": "1.3.6.1.4.1.2011.5.25.127.1.7"]
]

// --- hwVrrpExtTrapVirtualIPConflict (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.127.2.30.5
// Fields: vrrpv3OperationsPrimaryIpAddr
// Description: The hwVrrpExtTrapVirtualIPConflict trap indicates that VRRP detects a virtual IP address conflict.
trapMap["1.3.6.1.4.1.2011.5.25.127.2.30.5"] = [
    name: "hwVrrpExtTrapVirtualIPConflict",
    fields: ["vrrpv3OperationsPrimaryIpAddr"],
    fieldOids: ["vrrpv3OperationsPrimaryIpAddr": "1.3.6.1.2.1.207.1.1.1.1.4"]
]

// --- hwVrrpExtTrapVirtualIPConflictResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.127.2.30.6
// Fields: vrrpv3OperationsPrimaryIpAddr
// Description: The hwVrrpExtTrapVirtualIPConflictResume trap indicates that the VRRP virtual IP address conflict is rectified.
trapMap["1.3.6.1.4.1.2011.5.25.127.2.30.6"] = [
    name: "hwVrrpExtTrapVirtualIPConflictResume",
    fields: ["vrrpv3OperationsPrimaryIpAddr"],
    fieldOids: ["vrrpv3OperationsPrimaryIpAddr": "1.3.6.1.2.1.207.1.1.1.1.4"]
]

// --- hwVrrpExtTrapResLimit (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.127.2.30.7
// Fields: ifIndex, ifName, vrrpOperVrId
// Description: The hwVrrpExtTrapResLimit trap indicates that The board resources used for VRRP negotiation exceeded the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.127.2.30.7"] = [
    name: "hwVrrpExtTrapResLimit",
    fields: ["ifIndex", "ifName", "vrrpOperVrId"],
    fieldOids: ["ifIndex": "1.3.6.1.2.1.2.2.1.1", "ifName": "1.3.6.1.2.1.31.1.1.1.1", "vrrpOperVrId": "1.3.6.1.2.1.68.1.3.1.1"]
]

// --- hwVrrp6ExtTrapResLimit (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.127.2.30.8
// Fields: ifIndex, ifName, vrrpOperVrId
// Description: The hwVrrp6ExtTrapResLimit trap indicates that The board resources used for VRRP6 negotiation exceeded the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.127.2.30.8"] = [
    name: "hwVrrp6ExtTrapResLimit",
    fields: ["ifIndex", "ifName", "vrrpOperVrId"],
    fieldOids: ["ifIndex": "1.3.6.1.2.1.2.2.1.1", "ifName": "1.3.6.1.2.1.31.1.1.1.1", "vrrpOperVrId": "1.3.6.1.2.1.68.1.3.1.1"]
]

// ===== Parsing logic =====

// Set to true to enable diagnostic logging for this MIB parser
DEBUG = false

LOG_PREFIX = "[HUAWEI-VRRP-EXT-MIB]"
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
