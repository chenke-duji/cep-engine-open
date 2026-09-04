/**
 * Auto-generated from HUAWEI-VIRTUALACCESS-MIB.mib
 * Generated: 2026-08-24T18:28:31.290177200
 * Traps/Notifications (13): hwVirtualAccessLspDown, hwVirtualAccessLspDownClear, hwVirtualAccessTunnelDown, hwVirtualAccessTunnelDownClear, hwVirtualAccessTunnelHSBSwitch, hwVirtualAccessTunnelHSBResume, hwVirtualAccessTunnelReOpt, hwVirtualAccessLinkDown, hwVirtualAccessLinkDownClear, hwVirtualAccessExterLinkDown, hwVirtualAccessExterLinkDownClear, hwVirtualAccessApSelectedMaster, hwVirtualAccessApConflictingMaster
 *
 * Mapping rules:
 *   node       = trap source IP (rawEvent.sourceIp)
 *   alertGroup = trap/notification name
 *   summary    = all field key-value pairs concatenated
 */

import com.dujitech.cep.model.AlarmEvent
import com.dujitech.cep.model.EventType
import com.dujitech.cep.model.Severity

// ===== Trap OID -> definition mapping =====
// Key: fully resolved numeric OID, Value: [name, fields, fieldOids]
def trapMap = [:]

// ===== Name -> definition mapping (fallback for unresolved OIDs) =====
def trapNameMap = [:]

// --- hwVirtualAccessLspDown (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.343.2.1.1
// Fields: hwVirtualAccessLspId, hwVirtualAccessLspApId, hwVirtualAccessLspIfIndex, hwVirtualAccessLspIfName, hwVirtualAccessLspOperState
// Description: This notification indicates that virtual access LSP changes to down.
trapMap["1.3.6.1.4.1.2011.5.25.343.2.1.1"] = [
    name: "hwVirtualAccessLspDown",
    fields: ["hwVirtualAccessLspId", "hwVirtualAccessLspApId", "hwVirtualAccessLspIfIndex", "hwVirtualAccessLspIfName", "hwVirtualAccessLspOperState"],
    fieldOids: ["hwVirtualAccessLspId": "1.3.6.1.4.1.2011.5.25.343.1.1.1.1.9", "hwVirtualAccessLspApId": "1.3.6.1.4.1.2011.5.25.343.1.1.1.1.5", "hwVirtualAccessLspIfIndex": "1.3.6.1.4.1.2011.5.25.343.1.1.1.1.6", "hwVirtualAccessLspIfName": "1.3.6.1.4.1.2011.5.25.343.1.1.1.1.7", "hwVirtualAccessLspOperState": "1.3.6.1.4.1.2011.5.25.343.1.1.1.1.8"]
]

// --- hwVirtualAccessLspDownClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.343.2.1.2
// Fields: hwVirtualAccessLspId, hwVirtualAccessLspApId, hwVirtualAccessLspIfIndex, hwVirtualAccessLspIfName, hwVirtualAccessLspOperState
// Description: This notification indicates that virtual access LSP changes to up.
trapMap["1.3.6.1.4.1.2011.5.25.343.2.1.2"] = [
    name: "hwVirtualAccessLspDownClear",
    fields: ["hwVirtualAccessLspId", "hwVirtualAccessLspApId", "hwVirtualAccessLspIfIndex", "hwVirtualAccessLspIfName", "hwVirtualAccessLspOperState"],
    fieldOids: ["hwVirtualAccessLspId": "1.3.6.1.4.1.2011.5.25.343.1.1.1.1.9", "hwVirtualAccessLspApId": "1.3.6.1.4.1.2011.5.25.343.1.1.1.1.5", "hwVirtualAccessLspIfIndex": "1.3.6.1.4.1.2011.5.25.343.1.1.1.1.6", "hwVirtualAccessLspIfName": "1.3.6.1.4.1.2011.5.25.343.1.1.1.1.7", "hwVirtualAccessLspOperState": "1.3.6.1.4.1.2011.5.25.343.1.1.1.1.8"]
]

// --- hwVirtualAccessTunnelDown (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.343.2.2.1
// Fields: hwVirtualAccessTunnelApAdminIp, hwVirtualAccessIfIndex, hwVirtualAccessTunnelOperState, hwVirtualAccessTunnelReason, hwVirtualAccessTunnelName, hwVirtualAccessExplicitPathName
// Description: This notification indicates that virtual access tunnel changes to down.
trapMap["1.3.6.1.4.1.2011.5.25.343.2.2.1"] = [
    name: "hwVirtualAccessTunnelDown",
    fields: ["hwVirtualAccessTunnelApAdminIp", "hwVirtualAccessIfIndex", "hwVirtualAccessTunnelOperState", "hwVirtualAccessTunnelReason", "hwVirtualAccessTunnelName", "hwVirtualAccessExplicitPathName"],
    fieldOids: ["hwVirtualAccessTunnelApAdminIp": "1.3.6.1.4.1.2011.5.25.343.1.1.2.1.4", "hwVirtualAccessIfIndex": "1.3.6.1.4.1.2011.5.25.343.1.1.2.1.5", "hwVirtualAccessTunnelOperState": "1.3.6.1.4.1.2011.5.25.343.1.1.2.1.6", "hwVirtualAccessTunnelReason": "1.3.6.1.4.1.2011.5.25.343.1.1.2.1.7", "hwVirtualAccessTunnelName": "1.3.6.1.4.1.2011.5.25.343.1.1.2.1.8", "hwVirtualAccessExplicitPathName": "1.3.6.1.4.1.2011.5.25.343.1.1.2.1.9"]
]

// --- hwVirtualAccessTunnelDownClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.343.2.2.2
// Fields: hwVirtualAccessTunnelOperState, hwVirtualAccessTunnelReason
// Description: This notification indicates that virtual access tunnel changes to up.
trapMap["1.3.6.1.4.1.2011.5.25.343.2.2.2"] = [
    name: "hwVirtualAccessTunnelDownClear",
    fields: ["hwVirtualAccessTunnelOperState", "hwVirtualAccessTunnelReason"],
    fieldOids: ["hwVirtualAccessTunnelOperState": "1.3.6.1.4.1.2011.5.25.343.1.1.2.1.6", "hwVirtualAccessTunnelReason": "1.3.6.1.4.1.2011.5.25.343.1.1.2.1.7"]
]

// --- hwVirtualAccessTunnelHSBSwitch (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.343.2.2.3
// Fields: hwVirtualAccessTunnelSourceNodeId, hwVirtualAccessTunnelDestNodeId, hwVirtualAccessTunnelId, hwVirtualAccessTunnelSwitchReason
// Description: This notification indicates that virtual access tunnel switches to hot-standby LSP.
trapMap["1.3.6.1.4.1.2011.5.25.343.2.2.3"] = [
    name: "hwVirtualAccessTunnelHSBSwitch",
    fields: ["hwVirtualAccessTunnelSourceNodeId", "hwVirtualAccessTunnelDestNodeId", "hwVirtualAccessTunnelId", "hwVirtualAccessTunnelSwitchReason"],
    fieldOids: ["hwVirtualAccessTunnelSourceNodeId": "1.3.6.1.4.1.2011.5.25.343.1.1.2.1.1", "hwVirtualAccessTunnelDestNodeId": "1.3.6.1.4.1.2011.5.25.343.1.1.2.1.2", "hwVirtualAccessTunnelId": "1.3.6.1.4.1.2011.5.25.343.1.1.2.1.3", "hwVirtualAccessTunnelSwitchReason": "1.3.6.1.4.1.2011.5.25.343.2.6.1"]
]

// --- hwVirtualAccessTunnelHSBResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.343.2.2.4
// Fields: hwVirtualAccessTunnelSourceNodeId, hwVirtualAccessTunnelDestNodeId, hwVirtualAccessTunnelId
// Description: This notification indicates that virtual access tunnel resumes from hot-standby LSP.
trapMap["1.3.6.1.4.1.2011.5.25.343.2.2.4"] = [
    name: "hwVirtualAccessTunnelHSBResume",
    fields: ["hwVirtualAccessTunnelSourceNodeId", "hwVirtualAccessTunnelDestNodeId", "hwVirtualAccessTunnelId"],
    fieldOids: ["hwVirtualAccessTunnelSourceNodeId": "1.3.6.1.4.1.2011.5.25.343.1.1.2.1.1", "hwVirtualAccessTunnelDestNodeId": "1.3.6.1.4.1.2011.5.25.343.1.1.2.1.2", "hwVirtualAccessTunnelId": "1.3.6.1.4.1.2011.5.25.343.1.1.2.1.3"]
]

// --- hwVirtualAccessTunnelReOpt (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.343.2.2.5
// Fields: hwVirtualAccessTunnelSourceNodeId, hwVirtualAccessTunnelDestNodeId, hwVirtualAccessTunnelId, hwVirtualAccessLspType, hwVirtualAccessLspPath, hwVirtualAccessTunnelName, hwVirtualAccessExplicitPathName
// Description: This notification indicates that virtual access tunnel re-optimized.
trapMap["1.3.6.1.4.1.2011.5.25.343.2.2.5"] = [
    name: "hwVirtualAccessTunnelReOpt",
    fields: ["hwVirtualAccessTunnelSourceNodeId", "hwVirtualAccessTunnelDestNodeId", "hwVirtualAccessTunnelId", "hwVirtualAccessLspType", "hwVirtualAccessLspPath", "hwVirtualAccessTunnelName", "hwVirtualAccessExplicitPathName"],
    fieldOids: ["hwVirtualAccessTunnelSourceNodeId": "1.3.6.1.4.1.2011.5.25.343.1.1.2.1.1", "hwVirtualAccessTunnelDestNodeId": "1.3.6.1.4.1.2011.5.25.343.1.1.2.1.2", "hwVirtualAccessTunnelId": "1.3.6.1.4.1.2011.5.25.343.1.1.2.1.3", "hwVirtualAccessLspType": "1.3.6.1.4.1.2011.5.25.343.1.1.1.1.4", "hwVirtualAccessLspPath": "1.3.6.1.4.1.2011.5.25.343.2.6.2", "hwVirtualAccessTunnelName": "1.3.6.1.4.1.2011.5.25.343.1.1.2.1.8", "hwVirtualAccessExplicitPathName": "1.3.6.1.4.1.2011.5.25.343.1.1.2.1.9"]
]

// --- hwVirtualAccessLinkDown (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.343.2.3.1
// Fields: hwVirtualAccessLinkDownIfName, hwVirtualAccessLinkDownIfAdminStatus, hwVirtualAccessLinkDownIfOperStatus, hwVirtualAccessLinkDownReason
// Description: This notification indicates that interface changes to down.
trapMap["1.3.6.1.4.1.2011.5.25.343.2.3.1"] = [
    name: "hwVirtualAccessLinkDown",
    fields: ["hwVirtualAccessLinkDownIfName", "hwVirtualAccessLinkDownIfAdminStatus", "hwVirtualAccessLinkDownIfOperStatus", "hwVirtualAccessLinkDownReason"],
    fieldOids: ["hwVirtualAccessLinkDownIfName": "1.3.6.1.4.1.2011.5.25.343.1.1.3.1.5", "hwVirtualAccessLinkDownIfAdminStatus": "1.3.6.1.4.1.2011.5.25.343.1.1.3.1.3", "hwVirtualAccessLinkDownIfOperStatus": "1.3.6.1.4.1.2011.5.25.343.1.1.3.1.4", "hwVirtualAccessLinkDownReason": "1.3.6.1.4.1.2011.5.25.343.1.1.3.1.6"]
]

// --- hwVirtualAccessLinkDownClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.343.2.3.2
// Fields: hwVirtualAccessLinkDownIfName, hwVirtualAccessLinkDownIfAdminStatus, hwVirtualAccessLinkDownIfOperStatus, hwVirtualAccessLinkDownReason
// Description: This notification indicates that interface changes to up.
trapMap["1.3.6.1.4.1.2011.5.25.343.2.3.2"] = [
    name: "hwVirtualAccessLinkDownClear",
    fields: ["hwVirtualAccessLinkDownIfName", "hwVirtualAccessLinkDownIfAdminStatus", "hwVirtualAccessLinkDownIfOperStatus", "hwVirtualAccessLinkDownReason"],
    fieldOids: ["hwVirtualAccessLinkDownIfName": "1.3.6.1.4.1.2011.5.25.343.1.1.3.1.5", "hwVirtualAccessLinkDownIfAdminStatus": "1.3.6.1.4.1.2011.5.25.343.1.1.3.1.3", "hwVirtualAccessLinkDownIfOperStatus": "1.3.6.1.4.1.2011.5.25.343.1.1.3.1.4", "hwVirtualAccessLinkDownReason": "1.3.6.1.4.1.2011.5.25.343.1.1.3.1.6"]
]

// --- hwVirtualAccessExterLinkDown (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.343.2.4.1
// Fields: hwVirtualAccessExterLinkDownIfName, hwVirtualAccessExterLinkDownIfAdminStatus, hwVirtualAccessExterLinkDownIfOperStatus, hwVirtualAccessExterLinkDownReason
// Description: This notification indicates that interface changes to down.
trapMap["1.3.6.1.4.1.2011.5.25.343.2.4.1"] = [
    name: "hwVirtualAccessExterLinkDown",
    fields: ["hwVirtualAccessExterLinkDownIfName", "hwVirtualAccessExterLinkDownIfAdminStatus", "hwVirtualAccessExterLinkDownIfOperStatus", "hwVirtualAccessExterLinkDownReason"],
    fieldOids: ["hwVirtualAccessExterLinkDownIfName": "1.3.6.1.4.1.2011.5.25.343.1.1.5.1.5", "hwVirtualAccessExterLinkDownIfAdminStatus": "1.3.6.1.4.1.2011.5.25.343.1.1.5.1.3", "hwVirtualAccessExterLinkDownIfOperStatus": "1.3.6.1.4.1.2011.5.25.343.1.1.5.1.4", "hwVirtualAccessExterLinkDownReason": "1.3.6.1.4.1.2011.5.25.343.1.1.5.1.6"]
]

// --- hwVirtualAccessExterLinkDownClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.343.2.4.2
// Fields: hwVirtualAccessExterLinkDownIfName, hwVirtualAccessExterLinkDownIfAdminStatus, hwVirtualAccessExterLinkDownIfOperStatus, hwVirtualAccessExterLinkDownReason
// Description: This notification indicates that interface changes to up.
trapMap["1.3.6.1.4.1.2011.5.25.343.2.4.2"] = [
    name: "hwVirtualAccessExterLinkDownClear",
    fields: ["hwVirtualAccessExterLinkDownIfName", "hwVirtualAccessExterLinkDownIfAdminStatus", "hwVirtualAccessExterLinkDownIfOperStatus", "hwVirtualAccessExterLinkDownReason"],
    fieldOids: ["hwVirtualAccessExterLinkDownIfName": "1.3.6.1.4.1.2011.5.25.343.1.1.5.1.5", "hwVirtualAccessExterLinkDownIfAdminStatus": "1.3.6.1.4.1.2011.5.25.343.1.1.5.1.3", "hwVirtualAccessExterLinkDownIfOperStatus": "1.3.6.1.4.1.2011.5.25.343.1.1.5.1.4", "hwVirtualAccessExterLinkDownReason": "1.3.6.1.4.1.2011.5.25.343.1.1.5.1.6"]
]

// --- hwVirtualAccessApSelectedMaster (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.343.2.5.1
// Fields: hwVirtualAccessApIpAddress, hwVirtualAccessPrimaryMasterIpAddress, hwVirtualAccessSecondaryMasterIpAddress
// Description: This notification indicates that the master of ap have been selected .
trapMap["1.3.6.1.4.1.2011.5.25.343.2.5.1"] = [
    name: "hwVirtualAccessApSelectedMaster",
    fields: ["hwVirtualAccessApIpAddress", "hwVirtualAccessPrimaryMasterIpAddress", "hwVirtualAccessSecondaryMasterIpAddress"],
    fieldOids: ["hwVirtualAccessApIpAddress": "1.3.6.1.4.1.2011.5.25.343.1.1.4.1.1", "hwVirtualAccessPrimaryMasterIpAddress": "1.3.6.1.4.1.2011.5.25.343.1.1.4.1.2", "hwVirtualAccessSecondaryMasterIpAddress": "1.3.6.1.4.1.2011.5.25.343.1.1.4.1.3"]
]

// --- hwVirtualAccessApConflictingMaster (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.343.2.7.1
// Fields: hwVirtualAccessConflictingApIpAddress, hwVirtualAccessConflictingMasterIpAddressList
// Description: This notification indicates the conflicting masters of an AP.
trapMap["1.3.6.1.4.1.2011.5.25.343.2.7.1"] = [
    name: "hwVirtualAccessApConflictingMaster",
    fields: ["hwVirtualAccessConflictingApIpAddress", "hwVirtualAccessConflictingMasterIpAddressList"],
    fieldOids: ["hwVirtualAccessConflictingApIpAddress": "1.3.6.1.4.1.2011.5.25.343.1.1.6.1.1", "hwVirtualAccessConflictingMasterIpAddressList": "1.3.6.1.4.1.2011.5.25.343.1.1.6.1.2"]
]

// ===== Parsing logic =====

// Set to true to enable diagnostic logging for this MIB parser
DEBUG = false

LOG_PREFIX = "[HUAWEI-VIRTUALACCESS-MIB]"
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
