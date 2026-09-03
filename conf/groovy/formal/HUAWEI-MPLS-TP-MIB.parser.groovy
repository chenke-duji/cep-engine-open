/**
 * Auto-generated from HUAWEI-MPLS-TP-MIB.mib
 * Generated: 2026-08-24T18:28:30.384756300
 * Traps/Notifications (16): hwMplsTpTunnelDownClear, hwMplsTpTunnelDown, hwMplsTpTunnelResume, hwMplsTpTunnelSwitch, hwMplsTpLspOamDlocClear, hwMplsTpLspOamDloc, hwMplsTpLspOamRdiClear, hwMplsTpLspOamRdi, hwMplsTpLspOamMisconnectionEncapClear, hwMplsTpLspOamMisconnectionEncap, hwMplsTpLspOamMisconnectionDiscrClear, hwMplsTpLspOamMisconnectionDiscr, hwMplsTpLspOamMisconnectionMEPClear, hwMplsTpLspOamMisconnectionMEP, hwMplsTpLspOamMisconnectionSECClear, hwMplsTpLspOamMisconnectionSEC
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

// --- hwMplsTpTunnelDownClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.305.2.2.1
// Fields: hwMplsTpTunnelIfName, hwMplsTpTunnelAdminStatus, hwMplsTpTunnelOperStatus, ifName
// Description: This notification is generated when a mplsTpTunnelOperStatus object for one of the configured tunnels is about to leave the down state and transition into some other state (but not into the notPresent...
trapMap["1.3.6.1.4.1.2011.5.25.305.2.2.1"] = [
    name: "hwMplsTpTunnelDownClear",
    fields: ["hwMplsTpTunnelIfName", "hwMplsTpTunnelAdminStatus", "hwMplsTpTunnelOperStatus", "ifName"],
    fieldOids: ["hwMplsTpTunnelIfName": "1.3.6.1.4.1.2011.5.25.305.1.1.1.1.7", "hwMplsTpTunnelAdminStatus": "1.3.6.1.4.1.2011.5.25.305.1.1.1.1.8", "hwMplsTpTunnelOperStatus": "1.3.6.1.4.1.2011.5.25.305.1.1.1.1.9", "ifName": "1.3.6.1.2.1.31.1.1.1.1"]
]

// --- hwMplsTpTunnelDown (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.305.2.2.2
// Fields: hwMplsTpTunnelIfName, hwMplsTpTunnelAdminStatus, hwMplsTpTunnelOperStatus, ifName
// Description: This notification is generated when a mplsTpTunnelOperStatus object for one of the configured tunnels is about to enter the down state from some other state (but not from the notPresent state). This o...
trapMap["1.3.6.1.4.1.2011.5.25.305.2.2.2"] = [
    name: "hwMplsTpTunnelDown",
    fields: ["hwMplsTpTunnelIfName", "hwMplsTpTunnelAdminStatus", "hwMplsTpTunnelOperStatus", "ifName"],
    fieldOids: ["hwMplsTpTunnelIfName": "1.3.6.1.4.1.2011.5.25.305.1.1.1.1.7", "hwMplsTpTunnelAdminStatus": "1.3.6.1.4.1.2011.5.25.305.1.1.1.1.8", "hwMplsTpTunnelOperStatus": "1.3.6.1.4.1.2011.5.25.305.1.1.1.1.9", "ifName": "1.3.6.1.2.1.31.1.1.1.1"]
]

// --- hwMplsTpTunnelResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.305.2.2.3
// Fields: hwMplsTpTunnelIfName
// Description: This object is used to indicate that data switching from protection Lsp to Working Lsp.
trapMap["1.3.6.1.4.1.2011.5.25.305.2.2.3"] = [
    name: "hwMplsTpTunnelResume",
    fields: ["hwMplsTpTunnelIfName"],
    fieldOids: ["hwMplsTpTunnelIfName": "1.3.6.1.4.1.2011.5.25.305.1.1.1.1.7"]
]

// --- hwMplsTpTunnelSwitch (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.305.2.2.4
// Fields: hwMplsTpTunnelIfName
// Description: This object is used to indicate that data switching from protection Lsp to Working Lsp.
trapMap["1.3.6.1.4.1.2011.5.25.305.2.2.4"] = [
    name: "hwMplsTpTunnelSwitch",
    fields: ["hwMplsTpTunnelIfName"],
    fieldOids: ["hwMplsTpTunnelIfName": "1.3.6.1.4.1.2011.5.25.305.1.1.1.1.7"]
]

// --- hwMplsTpLspOamDlocClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.305.2.3.1
// Fields: hwMplsTpTunnelIfName, hwMplsTpLspType, ifName
// Description: This object indicates that the link recovers from a connectivity fault.
trapMap["1.3.6.1.4.1.2011.5.25.305.2.3.1"] = [
    name: "hwMplsTpLspOamDlocClear",
    fields: ["hwMplsTpTunnelIfName", "hwMplsTpLspType", "ifName"],
    fieldOids: ["hwMplsTpTunnelIfName": "1.3.6.1.4.1.2011.5.25.305.1.1.1.1.7", "hwMplsTpLspType": "1.3.6.1.4.1.2011.5.25.305.1.1.2.1.3", "ifName": "1.3.6.1.2.1.31.1.1.1.1"]
]

// --- hwMplsTpLspOamDloc (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.305.2.3.2
// Fields: hwMplsTpTunnelIfName, hwMplsTpLspType, ifName
// Description: This object is used to indicates the connectivity fault of the link.
trapMap["1.3.6.1.4.1.2011.5.25.305.2.3.2"] = [
    name: "hwMplsTpLspOamDloc",
    fields: ["hwMplsTpTunnelIfName", "hwMplsTpLspType", "ifName"],
    fieldOids: ["hwMplsTpTunnelIfName": "1.3.6.1.4.1.2011.5.25.305.1.1.1.1.7", "hwMplsTpLspType": "1.3.6.1.4.1.2011.5.25.305.1.1.2.1.3", "ifName": "1.3.6.1.2.1.31.1.1.1.1"]
]

// --- hwMplsTpLspOamRdiClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.305.2.3.3
// Fields: hwMplsTpTunnelIfName, hwMplsTpLspType, ifName
// Description: This object indicates that the link recovers from a remote defect.
trapMap["1.3.6.1.4.1.2011.5.25.305.2.3.3"] = [
    name: "hwMplsTpLspOamRdiClear",
    fields: ["hwMplsTpTunnelIfName", "hwMplsTpLspType", "ifName"],
    fieldOids: ["hwMplsTpTunnelIfName": "1.3.6.1.4.1.2011.5.25.305.1.1.1.1.7", "hwMplsTpLspType": "1.3.6.1.4.1.2011.5.25.305.1.1.2.1.3", "ifName": "1.3.6.1.2.1.31.1.1.1.1"]
]

// --- hwMplsTpLspOamRdi (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.305.2.3.4
// Fields: hwMplsTpTunnelIfName, hwMplsTpLspType, ifName
// Description: This object is used to indicates the remote defect of the link.
trapMap["1.3.6.1.4.1.2011.5.25.305.2.3.4"] = [
    name: "hwMplsTpLspOamRdi",
    fields: ["hwMplsTpTunnelIfName", "hwMplsTpLspType", "ifName"],
    fieldOids: ["hwMplsTpTunnelIfName": "1.3.6.1.4.1.2011.5.25.305.1.1.1.1.7", "hwMplsTpLspType": "1.3.6.1.4.1.2011.5.25.305.1.1.2.1.3", "ifName": "1.3.6.1.2.1.31.1.1.1.1"]
]

// --- hwMplsTpLspOamMisconnectionEncapClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.305.2.3.5
// Fields: hwMplsTpTunnelIfName, hwMplsTpLspType
// Description: This object indicates that the link recovers from an misconnection encap defect.
trapMap["1.3.6.1.4.1.2011.5.25.305.2.3.5"] = [
    name: "hwMplsTpLspOamMisconnectionEncapClear",
    fields: ["hwMplsTpTunnelIfName", "hwMplsTpLspType"],
    fieldOids: ["hwMplsTpTunnelIfName": "1.3.6.1.4.1.2011.5.25.305.1.1.1.1.7", "hwMplsTpLspType": "1.3.6.1.4.1.2011.5.25.305.1.1.2.1.3"]
]

// --- hwMplsTpLspOamMisconnectionEncap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.305.2.3.6
// Fields: hwMplsTpTunnelIfName, hwMplsTpLspType
// Description: This object indicates that the link receivs from an misconnection encap defect.
trapMap["1.3.6.1.4.1.2011.5.25.305.2.3.6"] = [
    name: "hwMplsTpLspOamMisconnectionEncap",
    fields: ["hwMplsTpTunnelIfName", "hwMplsTpLspType"],
    fieldOids: ["hwMplsTpTunnelIfName": "1.3.6.1.4.1.2011.5.25.305.1.1.1.1.7", "hwMplsTpLspType": "1.3.6.1.4.1.2011.5.25.305.1.1.2.1.3"]
]

// --- hwMplsTpLspOamMisconnectionDiscrClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.305.2.3.7
// Fields: hwMplsTpTunnelIfName, hwMplsTpLspType
// Description: This object indicates that the link recovers from an misconnection discription defect.
trapMap["1.3.6.1.4.1.2011.5.25.305.2.3.7"] = [
    name: "hwMplsTpLspOamMisconnectionDiscrClear",
    fields: ["hwMplsTpTunnelIfName", "hwMplsTpLspType"],
    fieldOids: ["hwMplsTpTunnelIfName": "1.3.6.1.4.1.2011.5.25.305.1.1.1.1.7", "hwMplsTpLspType": "1.3.6.1.4.1.2011.5.25.305.1.1.2.1.3"]
]

// --- hwMplsTpLspOamMisconnectionDiscr (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.305.2.3.8
// Fields: hwMplsTpTunnelIfName, hwMplsTpLspType
// Description: This object indicates that the link receivs from an misconnection discription defect.
trapMap["1.3.6.1.4.1.2011.5.25.305.2.3.8"] = [
    name: "hwMplsTpLspOamMisconnectionDiscr",
    fields: ["hwMplsTpTunnelIfName", "hwMplsTpLspType"],
    fieldOids: ["hwMplsTpTunnelIfName": "1.3.6.1.4.1.2011.5.25.305.1.1.1.1.7", "hwMplsTpLspType": "1.3.6.1.4.1.2011.5.25.305.1.1.2.1.3"]
]

// --- hwMplsTpLspOamMisconnectionMEPClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.305.2.3.9
// Fields: hwMplsTpTunnelIfName, hwMplsTpLspType
// Description: This object indicates that the link recovers from an unexpect MEG-ID defect.
trapMap["1.3.6.1.4.1.2011.5.25.305.2.3.9"] = [
    name: "hwMplsTpLspOamMisconnectionMEPClear",
    fields: ["hwMplsTpTunnelIfName", "hwMplsTpLspType"],
    fieldOids: ["hwMplsTpTunnelIfName": "1.3.6.1.4.1.2011.5.25.305.1.1.1.1.7", "hwMplsTpLspType": "1.3.6.1.4.1.2011.5.25.305.1.1.2.1.3"]
]

// --- hwMplsTpLspOamMisconnectionMEP (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.305.2.3.10
// Fields: hwMplsTpTunnelIfName, hwMplsTpLspType
// Description: This object indicates the link receivs an unexpect MEG-ID defect.
trapMap["1.3.6.1.4.1.2011.5.25.305.2.3.10"] = [
    name: "hwMplsTpLspOamMisconnectionMEP",
    fields: ["hwMplsTpTunnelIfName", "hwMplsTpLspType"],
    fieldOids: ["hwMplsTpTunnelIfName": "1.3.6.1.4.1.2011.5.25.305.1.1.1.1.7", "hwMplsTpLspType": "1.3.6.1.4.1.2011.5.25.305.1.1.2.1.3"]
]

// --- hwMplsTpLspOamMisconnectionSECClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.305.2.3.11
// Fields: hwMplsTpTunnelIfName, hwMplsTpLspType
// Description: This object indicates that the link recovers from an Misconnection SEC defect .
trapMap["1.3.6.1.4.1.2011.5.25.305.2.3.11"] = [
    name: "hwMplsTpLspOamMisconnectionSECClear",
    fields: ["hwMplsTpTunnelIfName", "hwMplsTpLspType"],
    fieldOids: ["hwMplsTpTunnelIfName": "1.3.6.1.4.1.2011.5.25.305.1.1.1.1.7", "hwMplsTpLspType": "1.3.6.1.4.1.2011.5.25.305.1.1.2.1.3"]
]

// --- hwMplsTpLspOamMisconnectionSEC (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.305.2.3.12
// Fields: hwMplsTpTunnelIfName, hwMplsTpLspType
// Description: This object indicates that the link receivs from an Misconnection SEC defect.
trapMap["1.3.6.1.4.1.2011.5.25.305.2.3.12"] = [
    name: "hwMplsTpLspOamMisconnectionSEC",
    fields: ["hwMplsTpTunnelIfName", "hwMplsTpLspType"],
    fieldOids: ["hwMplsTpTunnelIfName": "1.3.6.1.4.1.2011.5.25.305.1.1.1.1.7", "hwMplsTpLspType": "1.3.6.1.4.1.2011.5.25.305.1.1.2.1.3"]
]

// ===== Parsing logic =====

// Set to true to enable diagnostic logging for this MIB parser
DEBUG = false

LOG_PREFIX = "[HUAWEI-MPLS-TP-MIB]"
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
