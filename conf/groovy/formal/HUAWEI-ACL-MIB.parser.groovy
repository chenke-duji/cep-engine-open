/**
 * Auto-generated from HUAWEI-ACL-MIB.mib
 * Generated: 2026-08-24T18:28:28.913341500
 * Traps/Notifications (17): hwAclResThresholdExceedClearTrap, hwAclResThresholdExceedTrap, hwAclResTotalCountExceedClearTrap, hwAclResTotalCountExceedTrap, hwCounterResThresholdExceedClear, hwCounterResThresholdExceed, hwCounterResTotalCountExceedClear, hwCounterResTotalCountExceed, hwMeterResThresholdExceedClear, hwMeterResThresholdExceed, hwMeterResTotalCountExceedClear, hwMeterResTotalCountExceed, hwAclUrlIPExceedClear, hwAclUrlIPExceed, hwAclResourceOverloadTrap, hwAclResourceResumeTrap, hwAclResourceEmptyTrap
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

// --- hwAclResThresholdExceedClearTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.1.2.2.1.1.4.1
// Fields: hwAclResLimit, hwAclResSlotStr, hwAclResStage
// Description: Acl resource lack clear trap
trapMap["1.3.6.1.4.1.2011.5.1.2.2.1.1.4.1"] = [
    name: "hwAclResThresholdExceedClearTrap",
    fields: ["hwAclResLimit", "hwAclResSlotStr", "hwAclResStage"],
    fieldOids: ["hwAclResLimit": "1.3.6.1.4.1.2011.5.1.2.2.1.1.3", "hwAclResSlotStr": "1.3.6.1.4.1.2011.5.1.2.2.1.1.1", "hwAclResStage": "1.3.6.1.4.1.2011.5.1.2.2.1.1.2"]
]

// --- hwAclResThresholdExceedTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.1.2.2.1.1.4.2
// Fields: hwAclResLimit, hwAclResSlotStr, hwAclResStage
// Description: Acl resource lack trap
trapMap["1.3.6.1.4.1.2011.5.1.2.2.1.1.4.2"] = [
    name: "hwAclResThresholdExceedTrap",
    fields: ["hwAclResLimit", "hwAclResSlotStr", "hwAclResStage"],
    fieldOids: ["hwAclResLimit": "1.3.6.1.4.1.2011.5.1.2.2.1.1.3", "hwAclResSlotStr": "1.3.6.1.4.1.2011.5.1.2.2.1.1.1", "hwAclResStage": "1.3.6.1.4.1.2011.5.1.2.2.1.1.2"]
]

// --- hwAclResTotalCountExceedClearTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.1.2.2.1.1.4.3
// Fields: hwAclResLimit, hwAclResSlotStr, hwAclResStage
// Description: Acl resource full clear trap
trapMap["1.3.6.1.4.1.2011.5.1.2.2.1.1.4.3"] = [
    name: "hwAclResTotalCountExceedClearTrap",
    fields: ["hwAclResLimit", "hwAclResSlotStr", "hwAclResStage"],
    fieldOids: ["hwAclResLimit": "1.3.6.1.4.1.2011.5.1.2.2.1.1.3", "hwAclResSlotStr": "1.3.6.1.4.1.2011.5.1.2.2.1.1.1", "hwAclResStage": "1.3.6.1.4.1.2011.5.1.2.2.1.1.2"]
]

// --- hwAclResTotalCountExceedTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.1.2.2.1.1.4.4
// Fields: hwAclResLimit, hwAclResSlotStr, hwAclResStage
// Description: Acl resource full trap
trapMap["1.3.6.1.4.1.2011.5.1.2.2.1.1.4.4"] = [
    name: "hwAclResTotalCountExceedTrap",
    fields: ["hwAclResLimit", "hwAclResSlotStr", "hwAclResStage"],
    fieldOids: ["hwAclResLimit": "1.3.6.1.4.1.2011.5.1.2.2.1.1.3", "hwAclResSlotStr": "1.3.6.1.4.1.2011.5.1.2.2.1.1.1", "hwAclResStage": "1.3.6.1.4.1.2011.5.1.2.2.1.1.2"]
]

// --- hwCounterResThresholdExceedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.1.2.2.1.2.4.1
// Fields: hwCounterResLimit, hwCounterResSlotStr, hwCounterResStage
// Description: Acl counter resource lack clear trap
trapMap["1.3.6.1.4.1.2011.5.1.2.2.1.2.4.1"] = [
    name: "hwCounterResThresholdExceedClear",
    fields: ["hwCounterResLimit", "hwCounterResSlotStr", "hwCounterResStage"],
    fieldOids: ["hwCounterResLimit": "1.3.6.1.4.1.2011.5.1.2.2.1.2.3", "hwCounterResSlotStr": "1.3.6.1.4.1.2011.5.1.2.2.1.2.1", "hwCounterResStage": "1.3.6.1.4.1.2011.5.1.2.2.1.2.2"]
]

// --- hwCounterResThresholdExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.1.2.2.1.2.4.2
// Fields: hwCounterResLimit, hwCounterResSlotStr, hwCounterResStage
// Description: Acl counter resource lack trap
trapMap["1.3.6.1.4.1.2011.5.1.2.2.1.2.4.2"] = [
    name: "hwCounterResThresholdExceed",
    fields: ["hwCounterResLimit", "hwCounterResSlotStr", "hwCounterResStage"],
    fieldOids: ["hwCounterResLimit": "1.3.6.1.4.1.2011.5.1.2.2.1.2.3", "hwCounterResSlotStr": "1.3.6.1.4.1.2011.5.1.2.2.1.2.1", "hwCounterResStage": "1.3.6.1.4.1.2011.5.1.2.2.1.2.2"]
]

// --- hwCounterResTotalCountExceedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.1.2.2.1.2.4.3
// Fields: hwCounterResLimit, hwCounterResSlotStr, hwCounterResStage
// Description: Acl counter resource full clear trap
trapMap["1.3.6.1.4.1.2011.5.1.2.2.1.2.4.3"] = [
    name: "hwCounterResTotalCountExceedClear",
    fields: ["hwCounterResLimit", "hwCounterResSlotStr", "hwCounterResStage"],
    fieldOids: ["hwCounterResLimit": "1.3.6.1.4.1.2011.5.1.2.2.1.2.3", "hwCounterResSlotStr": "1.3.6.1.4.1.2011.5.1.2.2.1.2.1", "hwCounterResStage": "1.3.6.1.4.1.2011.5.1.2.2.1.2.2"]
]

// --- hwCounterResTotalCountExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.1.2.2.1.2.4.4
// Fields: hwCounterResLimit, hwCounterResSlotStr, hwCounterResStage
// Description: Acl counter resource full trap
trapMap["1.3.6.1.4.1.2011.5.1.2.2.1.2.4.4"] = [
    name: "hwCounterResTotalCountExceed",
    fields: ["hwCounterResLimit", "hwCounterResSlotStr", "hwCounterResStage"],
    fieldOids: ["hwCounterResLimit": "1.3.6.1.4.1.2011.5.1.2.2.1.2.3", "hwCounterResSlotStr": "1.3.6.1.4.1.2011.5.1.2.2.1.2.1", "hwCounterResStage": "1.3.6.1.4.1.2011.5.1.2.2.1.2.2"]
]

// --- hwMeterResThresholdExceedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.1.2.2.1.3.4.1
// Fields: hwMeterResLimit, hwMeterResSlotStr, hwMeterResStage
// Description: Acl meter resource lack clear trap
trapMap["1.3.6.1.4.1.2011.5.1.2.2.1.3.4.1"] = [
    name: "hwMeterResThresholdExceedClear",
    fields: ["hwMeterResLimit", "hwMeterResSlotStr", "hwMeterResStage"],
    fieldOids: ["hwMeterResLimit": "1.3.6.1.4.1.2011.5.1.2.2.1.3.3", "hwMeterResSlotStr": "1.3.6.1.4.1.2011.5.1.2.2.1.3.1", "hwMeterResStage": "1.3.6.1.4.1.2011.5.1.2.2.1.3.2"]
]

// --- hwMeterResThresholdExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.1.2.2.1.3.4.2
// Fields: hwMeterResLimit, hwMeterResSlotStr, hwMeterResStage
// Description: Acl meter resource lack trap
trapMap["1.3.6.1.4.1.2011.5.1.2.2.1.3.4.2"] = [
    name: "hwMeterResThresholdExceed",
    fields: ["hwMeterResLimit", "hwMeterResSlotStr", "hwMeterResStage"],
    fieldOids: ["hwMeterResLimit": "1.3.6.1.4.1.2011.5.1.2.2.1.3.3", "hwMeterResSlotStr": "1.3.6.1.4.1.2011.5.1.2.2.1.3.1", "hwMeterResStage": "1.3.6.1.4.1.2011.5.1.2.2.1.3.2"]
]

// --- hwMeterResTotalCountExceedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.1.2.2.1.3.4.3
// Fields: hwMeterResLimit, hwMeterResSlotStr, hwMeterResStage
// Description: Acl meter resource full clear trap
trapMap["1.3.6.1.4.1.2011.5.1.2.2.1.3.4.3"] = [
    name: "hwMeterResTotalCountExceedClear",
    fields: ["hwMeterResLimit", "hwMeterResSlotStr", "hwMeterResStage"],
    fieldOids: ["hwMeterResLimit": "1.3.6.1.4.1.2011.5.1.2.2.1.3.3", "hwMeterResSlotStr": "1.3.6.1.4.1.2011.5.1.2.2.1.3.1", "hwMeterResStage": "1.3.6.1.4.1.2011.5.1.2.2.1.3.2"]
]

// --- hwMeterResTotalCountExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.1.2.2.1.3.4.4
// Fields: hwMeterResLimit, hwMeterResSlotStr, hwMeterResStage
// Description: Acl meter resource full trap
trapMap["1.3.6.1.4.1.2011.5.1.2.2.1.3.4.4"] = [
    name: "hwMeterResTotalCountExceed",
    fields: ["hwMeterResLimit", "hwMeterResSlotStr", "hwMeterResStage"],
    fieldOids: ["hwMeterResLimit": "1.3.6.1.4.1.2011.5.1.2.2.1.3.3", "hwMeterResSlotStr": "1.3.6.1.4.1.2011.5.1.2.2.1.3.1", "hwMeterResStage": "1.3.6.1.4.1.2011.5.1.2.2.1.3.2"]
]

// --- hwAclUrlIPExceedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.1.2.2.1.4.3.1
// Fields: hwAclUrlNetType, hwAclUrlIpSpec
// Description: Acl url exceed clear trap
trapMap["1.3.6.1.4.1.2011.5.1.2.2.1.4.3.1"] = [
    name: "hwAclUrlIPExceedClear",
    fields: ["hwAclUrlNetType", "hwAclUrlIpSpec"],
    fieldOids: ["hwAclUrlNetType": "1.3.6.1.4.1.2011.5.1.2.2.1.4.1", "hwAclUrlIpSpec": "1.3.6.1.4.1.2011.5.1.2.2.1.4.2"]
]

// --- hwAclUrlIPExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.1.2.2.1.4.3.2
// Fields: hwAclUrlNetType, hwAclUrlIpSpec
// Description: Acl url exceed trap
trapMap["1.3.6.1.4.1.2011.5.1.2.2.1.4.3.2"] = [
    name: "hwAclUrlIPExceed",
    fields: ["hwAclUrlNetType", "hwAclUrlIpSpec"],
    fieldOids: ["hwAclUrlNetType": "1.3.6.1.4.1.2011.5.1.2.2.1.4.1", "hwAclUrlIpSpec": "1.3.6.1.4.1.2011.5.1.2.2.1.4.2"]
]

// --- hwAclResourceOverloadTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.1.2.3.1
// Fields: hwAclResourceTotal, hwAclResourceUsed, hwAclResourceUsage
// Description: The device acl resources were overloaded
trapMap["1.3.6.1.4.1.2011.5.1.2.3.1"] = [
    name: "hwAclResourceOverloadTrap",
    fields: ["hwAclResourceTotal", "hwAclResourceUsed", "hwAclResourceUsage"],
    fieldOids: ["hwAclResourceTotal": "1.3.6.1.4.1.2011.5.1.2.3.4.1", "hwAclResourceUsed": "1.3.6.1.4.1.2011.5.1.2.3.4.2", "hwAclResourceUsage": "1.3.6.1.4.1.2011.5.1.2.3.4.3"]
]

// --- hwAclResourceResumeTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.1.2.3.2
// Fields: hwAclResourceTotal, hwAclResourceUsed, hwAclResourceUsage
// Description: The device acl resources were resumed
trapMap["1.3.6.1.4.1.2011.5.1.2.3.2"] = [
    name: "hwAclResourceResumeTrap",
    fields: ["hwAclResourceTotal", "hwAclResourceUsed", "hwAclResourceUsage"],
    fieldOids: ["hwAclResourceTotal": "1.3.6.1.4.1.2011.5.1.2.3.4.1", "hwAclResourceUsed": "1.3.6.1.4.1.2011.5.1.2.3.4.2", "hwAclResourceUsage": "1.3.6.1.4.1.2011.5.1.2.3.4.3"]
]

// --- hwAclResourceEmptyTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.1.2.3.3
// Fields: hwAclResourceTotal, hwAclResourceUsed, hwAclResourceAlamInfo
// Description: The device acl resources were not enough
trapMap["1.3.6.1.4.1.2011.5.1.2.3.3"] = [
    name: "hwAclResourceEmptyTrap",
    fields: ["hwAclResourceTotal", "hwAclResourceUsed", "hwAclResourceAlamInfo"],
    fieldOids: ["hwAclResourceTotal": "1.3.6.1.4.1.2011.5.1.2.3.4.1", "hwAclResourceUsed": "1.3.6.1.4.1.2011.5.1.2.3.4.2", "hwAclResourceAlamInfo": "1.3.6.1.4.1.2011.5.1.2.3.4.4"]
]

// ===== Parsing logic =====

// Set to true to enable diagnostic logging for this MIB parser
DEBUG = false

LOG_PREFIX = "[HUAWEI-ACL-MIB]"
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
