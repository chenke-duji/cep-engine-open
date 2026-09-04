/**
 * Auto-generated from HUAWEI-PORTAL-MIB.mib
 * Generated: 2026-08-24T18:28:30.727329300
 * Traps/Notifications (13): hwPortalServerUp, hwPortalServerDown, hwPortalMaxUserAlarm, hwPortalUserClearAlarm, hwPortalPassDNS, hwHttpsCertNearlyExpired, hwHttpsCertNearlyExpiredClear, hwHttpsCertInvalid, hwHttpsCertInvalidClear, hwHttpsImportedPKICertOverSized, hwHttpsImportedPKICertOverSizedResume, hwCUPortalServerUp, hwCUPortalServerDown
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

// --- hwPortalServerUp (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.4.2.2.1.1
// Fields: hwStateChangePortalServerIp, hwStateChangePortalServerVrf
// Description: This object indicates that the portal server is Up.
trapMap["1.3.6.1.4.1.2011.5.4.2.2.1.1"] = [
    name: "hwPortalServerUp",
    fields: ["hwStateChangePortalServerIp", "hwStateChangePortalServerVrf"],
    fieldOids: ["hwStateChangePortalServerIp": "1.3.6.1.4.1.2011.5.4.2.1.1", "hwStateChangePortalServerVrf": "1.3.6.1.4.1.2011.5.4.2.1.2"]
]

// --- hwPortalServerDown (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.4.2.2.1.2
// Fields: hwStateChangePortalServerIp, hwStateChangePortalServerVrf
// Description: This object indicates that the portal server is Down.
trapMap["1.3.6.1.4.1.2011.5.4.2.2.1.2"] = [
    name: "hwPortalServerDown",
    fields: ["hwStateChangePortalServerIp", "hwStateChangePortalServerVrf"],
    fieldOids: ["hwStateChangePortalServerIp": "1.3.6.1.4.1.2011.5.4.2.1.1", "hwStateChangePortalServerVrf": "1.3.6.1.4.1.2011.5.4.2.1.2"]
]

// --- hwPortalMaxUserAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.4.2.2.1.3
// Fields: hwPortalUserSlot, hwPortalUserNum, hwPortalPercentage
// Description: 1 Notice/Trap name: Portal Max User Alarm 2 Notice/Trap generation cause: The number of portal users reached the maximum 3 Repair suggestions:
trapMap["1.3.6.1.4.1.2011.5.4.2.2.1.3"] = [
    name: "hwPortalMaxUserAlarm",
    fields: ["hwPortalUserSlot", "hwPortalUserNum", "hwPortalPercentage"],
    fieldOids: ["hwPortalUserSlot": "1.3.6.1.4.1.2011.5.4.2.1.3", "hwPortalUserNum": "1.3.6.1.4.1.2011.5.4.2.1.4", "hwPortalPercentage": "1.3.6.1.4.1.2011.5.4.2.1.5"]
]

// --- hwPortalUserClearAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.4.2.2.1.4
// Fields: hwPortalUserSlot, hwPortalUserNum, hwPortalPercentage
// Description: 1 Notice/Trap name: Portal User Clear Alarm 2 Notice/Trap generation cause: The Portal Max User Alarm is cleared 3 Repair suggestions:
trapMap["1.3.6.1.4.1.2011.5.4.2.2.1.4"] = [
    name: "hwPortalUserClearAlarm",
    fields: ["hwPortalUserSlot", "hwPortalUserNum", "hwPortalPercentage"],
    fieldOids: ["hwPortalUserSlot": "1.3.6.1.4.1.2011.5.4.2.1.3", "hwPortalUserNum": "1.3.6.1.4.1.2011.5.4.2.1.4", "hwPortalPercentage": "1.3.6.1.4.1.2011.5.4.2.1.5"]
]

// --- hwPortalPassDNS (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.4.2.2.1.5
// Description: This object indicates that DNS packets are allowed to pass through during Portal authentication.
trapMap["1.3.6.1.4.1.2011.5.4.2.2.1.5"] = [
    name: "hwPortalPassDNS",
    fields: [],
    fieldOids: []
]

// --- hwHttpsCertNearlyExpired (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.4.2.2.1.6
// Fields: hwPortalCertStartTime, hwPortalCertFinishTime
// Description: This object indicates that an alarm is generated when the imported HTTPS redirection certificate is expiring.
trapMap["1.3.6.1.4.1.2011.5.4.2.2.1.6"] = [
    name: "hwHttpsCertNearlyExpired",
    fields: ["hwPortalCertStartTime", "hwPortalCertFinishTime"],
    fieldOids: ["hwPortalCertStartTime": "1.3.6.1.4.1.2011.5.4.2.1.6", "hwPortalCertFinishTime": "1.3.6.1.4.1.2011.5.4.2.1.7"]
]

// --- hwHttpsCertNearlyExpiredClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.4.2.2.1.7
// Fields: hwPortalCertStartTime, hwPortalCertFinishTime
// Description: This object indicates that the alarm generated when the imported HTTPS redirection certificate is expiring is cleared.
trapMap["1.3.6.1.4.1.2011.5.4.2.2.1.7"] = [
    name: "hwHttpsCertNearlyExpiredClear",
    fields: ["hwPortalCertStartTime", "hwPortalCertFinishTime"],
    fieldOids: ["hwPortalCertStartTime": "1.3.6.1.4.1.2011.5.4.2.1.6", "hwPortalCertFinishTime": "1.3.6.1.4.1.2011.5.4.2.1.7"]
]

// --- hwHttpsCertInvalid (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.4.2.2.1.8
// Fields: hwPortalCertStartTime, hwPortalCertFinishTime
// Description: This object indicates that an alarm is generated when the imported HTTPS redirection certificate becomes invalid.
trapMap["1.3.6.1.4.1.2011.5.4.2.2.1.8"] = [
    name: "hwHttpsCertInvalid",
    fields: ["hwPortalCertStartTime", "hwPortalCertFinishTime"],
    fieldOids: ["hwPortalCertStartTime": "1.3.6.1.4.1.2011.5.4.2.1.6", "hwPortalCertFinishTime": "1.3.6.1.4.1.2011.5.4.2.1.7"]
]

// --- hwHttpsCertInvalidClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.4.2.2.1.9
// Fields: hwPortalCertStartTime, hwPortalCertFinishTime
// Description: This object indicates that the alarm generated when the imported HTTPS redirection certificate becomes invalid is cleared.
trapMap["1.3.6.1.4.1.2011.5.4.2.2.1.9"] = [
    name: "hwHttpsCertInvalidClear",
    fields: ["hwPortalCertStartTime", "hwPortalCertFinishTime"],
    fieldOids: ["hwPortalCertStartTime": "1.3.6.1.4.1.2011.5.4.2.1.6", "hwPortalCertFinishTime": "1.3.6.1.4.1.2011.5.4.2.1.7"]
]

// --- hwHttpsImportedPKICertOverSized (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.4.2.2.1.10
// Fields: hwPortalPkiDomainName, hwPortalFileName
// Description: This object indicates that an alarm is generated when the certificate required for HTTPS redirection imported from PKI is too large.
trapMap["1.3.6.1.4.1.2011.5.4.2.2.1.10"] = [
    name: "hwHttpsImportedPKICertOverSized",
    fields: ["hwPortalPkiDomainName", "hwPortalFileName"],
    fieldOids: ["hwPortalPkiDomainName": "1.3.6.1.4.1.2011.5.4.2.1.8", "hwPortalFileName": "1.3.6.1.4.1.2011.5.4.2.1.9"]
]

// --- hwHttpsImportedPKICertOverSizedResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.4.2.2.1.11
// Fields: hwPortalPkiDomainName, hwPortalFileName
// Description: This object indicates that the alarm generated when the certificate required for HTTPS redirection imported from PKI is too large is cleared.
trapMap["1.3.6.1.4.1.2011.5.4.2.2.1.11"] = [
    name: "hwHttpsImportedPKICertOverSizedResume",
    fields: ["hwPortalPkiDomainName", "hwPortalFileName"],
    fieldOids: ["hwPortalPkiDomainName": "1.3.6.1.4.1.2011.5.4.2.1.8", "hwPortalFileName": "1.3.6.1.4.1.2011.5.4.2.1.9"]
]

// --- hwCUPortalServerUp (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.4.2.2.1.12
// Fields: hwPortalUpmngInstance, hwPortalLoadBalanceInstance, hwStateChangePortalServerIp, hwStateChangePortalServerVrf
// Description: This object indicates that the portal server is Up.
trapMap["1.3.6.1.4.1.2011.5.4.2.2.1.12"] = [
    name: "hwCUPortalServerUp",
    fields: ["hwPortalUpmngInstance", "hwPortalLoadBalanceInstance", "hwStateChangePortalServerIp", "hwStateChangePortalServerVrf"],
    fieldOids: ["hwPortalUpmngInstance": "1.3.6.1.4.1.2011.5.4.2.1.10", "hwPortalLoadBalanceInstance": "1.3.6.1.4.1.2011.5.4.2.1.11", "hwStateChangePortalServerIp": "1.3.6.1.4.1.2011.5.4.2.1.1", "hwStateChangePortalServerVrf": "1.3.6.1.4.1.2011.5.4.2.1.2"]
]

// --- hwCUPortalServerDown (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.4.2.2.1.13
// Fields: hwPortalUpmngInstance, hwPortalLoadBalanceInstance, hwStateChangePortalServerIp, hwStateChangePortalServerVrf
// Description: This object indicates that the portal server is Down.
trapMap["1.3.6.1.4.1.2011.5.4.2.2.1.13"] = [
    name: "hwCUPortalServerDown",
    fields: ["hwPortalUpmngInstance", "hwPortalLoadBalanceInstance", "hwStateChangePortalServerIp", "hwStateChangePortalServerVrf"],
    fieldOids: ["hwPortalUpmngInstance": "1.3.6.1.4.1.2011.5.4.2.1.10", "hwPortalLoadBalanceInstance": "1.3.6.1.4.1.2011.5.4.2.1.11", "hwStateChangePortalServerIp": "1.3.6.1.4.1.2011.5.4.2.1.1", "hwStateChangePortalServerVrf": "1.3.6.1.4.1.2011.5.4.2.1.2"]
]

// ===== Parsing logic =====

// Set to true to enable diagnostic logging for this MIB parser
DEBUG = false

LOG_PREFIX = "[HUAWEI-PORTAL-MIB]"
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
