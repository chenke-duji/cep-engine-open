/**
 * Auto-generated from HUAWEI-TUNNEL-MIB.mib
 * Generated: 2026-08-24T18:28:31.246940300
 * Traps/Notifications (8): hwTunnelCreateFailOverThreshold, hwOverflowTunnelTimeoutOverThreshold, hwPriorTunnelTimeoutOverThreshold, hwHybridTunnelCreateFail, hwHybridSwitch2PriorTunnel, hwHybridSwitch2OverflowTunnel, hwHybridDynBwPunish, hwHybridDynBwResume
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

// --- hwTunnelCreateFailOverThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.201.3.1
// Fields: hwTunnelCreateFailCheckPeriod, hwTunnelCreateFailThreshold, hwTunnelCreateFailCnt, hwTunnelCreateFailCnt
// Description: This object indicates that an alarm is generated if the number of tunnel failures exceeds the threshold during a period.
trapMap["1.3.6.1.4.1.2011.5.25.201.3.1"] = [
    name: "hwTunnelCreateFailOverThreshold",
    fields: ["hwTunnelCreateFailCheckPeriod", "hwTunnelCreateFailThreshold", "hwTunnelCreateFailCnt", "hwTunnelCreateFailCnt"],
    fieldOids: ["hwTunnelCreateFailCheckPeriod": "1.3.6.1.4.1.2011.5.25.201.1.3.1", "hwTunnelCreateFailThreshold": "1.3.6.1.4.1.2011.5.25.201.1.3.2", "hwTunnelCreateFailCnt": "1.3.6.1.4.1.2011.5.25.201.1.4.1.12"]
]

// --- hwOverflowTunnelTimeoutOverThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.201.3.2
// Fields: hwTunnelKeepaliveTimeoutPeriod, hwTunnelKeepaliveTimeoutThreshold, hwTunnelTimeOutCnt
// Description: This object indicates that an alarm is generated if the number of overflow tunnel timeouts of hello packets exceeds the threshold during a period.
trapMap["1.3.6.1.4.1.2011.5.25.201.3.2"] = [
    name: "hwOverflowTunnelTimeoutOverThreshold",
    fields: ["hwTunnelKeepaliveTimeoutPeriod", "hwTunnelKeepaliveTimeoutThreshold", "hwTunnelTimeOutCnt"],
    fieldOids: ["hwTunnelKeepaliveTimeoutPeriod": "1.3.6.1.4.1.2011.5.25.201.1.3.3", "hwTunnelKeepaliveTimeoutThreshold": "1.3.6.1.4.1.2011.5.25.201.1.3.4", "hwTunnelTimeOutCnt": "1.3.6.1.4.1.2011.5.25.201.1.4.1.8"]
]

// --- hwPriorTunnelTimeoutOverThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.201.3.3
// Fields: hwTunnelKeepaliveTimeoutPeriod, hwTunnelKeepaliveTimeoutThreshold, hwTunnelTimeOutCnt
// Description: This object indicates that an alarm is generated if the number of priority tunnel timeouts of hello packets exceeds the threshold during a period.
trapMap["1.3.6.1.4.1.2011.5.25.201.3.3"] = [
    name: "hwPriorTunnelTimeoutOverThreshold",
    fields: ["hwTunnelKeepaliveTimeoutPeriod", "hwTunnelKeepaliveTimeoutThreshold", "hwTunnelTimeOutCnt"],
    fieldOids: ["hwTunnelKeepaliveTimeoutPeriod": "1.3.6.1.4.1.2011.5.25.201.1.3.3", "hwTunnelKeepaliveTimeoutThreshold": "1.3.6.1.4.1.2011.5.25.201.1.3.4", "hwTunnelTimeOutCnt": "1.3.6.1.4.1.2011.5.25.201.1.4.1.8"]
]

// --- hwHybridTunnelCreateFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.201.3.4
// Fields: ifIndex, hwHybridTunnelType, hwHybridCreateFailValue
// Description: This object indicates that the overflow or priority tunnel fails to be created.
trapMap["1.3.6.1.4.1.2011.5.25.201.3.4"] = [
    name: "hwHybridTunnelCreateFail",
    fields: ["ifIndex", "hwHybridTunnelType", "hwHybridCreateFailValue"],
    fieldOids: ["ifIndex": "1.3.6.1.2.1.2.2.1.1", "hwHybridTunnelType": "1.3.6.1.4.1.2011.5.25.201.1.5.4", "hwHybridCreateFailValue": "1.3.6.1.4.1.2011.5.25.201.1.5.3"]
]

// --- hwHybridSwitch2PriorTunnel (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.201.3.5
// Fields: ifIndex, hwHybridRttThreshold, hwHybridRttCheckTimes
// Description: This object indicates that the delay of the overflow tunnel exceeds the threshold and traffic is switched to the priority tunnel.
trapMap["1.3.6.1.4.1.2011.5.25.201.3.5"] = [
    name: "hwHybridSwitch2PriorTunnel",
    fields: ["ifIndex", "hwHybridRttThreshold", "hwHybridRttCheckTimes"],
    fieldOids: ["ifIndex": "1.3.6.1.2.1.2.2.1.1", "hwHybridRttThreshold": "1.3.6.1.4.1.2011.5.25.201.1.5.1", "hwHybridRttCheckTimes": "1.3.6.1.4.1.2011.5.25.201.1.5.2"]
]

// --- hwHybridSwitch2OverflowTunnel (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.201.3.6
// Fields: ifIndex, hwHybridRttThreshold, hwHybridRttCheckTimes
// Description: This object indicates that that the delay of the overflow tunnel falls below the threshold and can be used to forward traffic again.
trapMap["1.3.6.1.4.1.2011.5.25.201.3.6"] = [
    name: "hwHybridSwitch2OverflowTunnel",
    fields: ["ifIndex", "hwHybridRttThreshold", "hwHybridRttCheckTimes"],
    fieldOids: ["ifIndex": "1.3.6.1.2.1.2.2.1.1", "hwHybridRttThreshold": "1.3.6.1.4.1.2011.5.25.201.1.5.1", "hwHybridRttCheckTimes": "1.3.6.1.4.1.2011.5.25.201.1.5.2"]
]

// --- hwHybridDynBwPunish (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.201.3.7
// Fields: ifIndex, hwHybridDynDLBwAdjustValue, hwHybridDynULBwAdjustValue
// Description: This object indicates that the bandwidth of the priority tunnel needs to be reduced.
trapMap["1.3.6.1.4.1.2011.5.25.201.3.7"] = [
    name: "hwHybridDynBwPunish",
    fields: ["ifIndex", "hwHybridDynDLBwAdjustValue", "hwHybridDynULBwAdjustValue"],
    fieldOids: ["ifIndex": "1.3.6.1.2.1.2.2.1.1", "hwHybridDynDLBwAdjustValue": "1.3.6.1.4.1.2011.5.25.201.1.5.5", "hwHybridDynULBwAdjustValue": "1.3.6.1.4.1.2011.5.25.201.1.5.6"]
]

// --- hwHybridDynBwResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.201.3.8
// Fields: ifIndex, hwHybridDynDLBwAdjustValue, hwHybridDynULBwAdjustValue
// Description: This object indicates that the bandwidth of the priority tunnel needs to be increased.
trapMap["1.3.6.1.4.1.2011.5.25.201.3.8"] = [
    name: "hwHybridDynBwResume",
    fields: ["ifIndex", "hwHybridDynDLBwAdjustValue", "hwHybridDynULBwAdjustValue"],
    fieldOids: ["ifIndex": "1.3.6.1.2.1.2.2.1.1", "hwHybridDynDLBwAdjustValue": "1.3.6.1.4.1.2011.5.25.201.1.5.5", "hwHybridDynULBwAdjustValue": "1.3.6.1.4.1.2011.5.25.201.1.5.6"]
]

// ===== Parsing logic =====

// Set to true to enable diagnostic logging for this MIB parser
DEBUG = false

LOG_PREFIX = "[HUAWEI-TUNNEL-MIB]"
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
