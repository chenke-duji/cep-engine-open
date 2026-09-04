/**
 * Auto-generated from HUAWEI-DHCPR-MIB.mib
 * Generated: 2026-08-24T18:28:29.421971500
 * Traps/Notifications (18): hwPDRouteExceed, hwPDRouteExceedResume, hwDHCPRelayIpUnnumberedUsrThreshold, hwDHCPRelayIpUnnumberedUsrThresholdResume, hwDHCPRelayIpUnnumberedUsrExhaust, hwDHCPRelayIpUnnumberedUsrExhaustResume, hwDHCP6RelayUsrTblThreshold, hwDHCP6RelayUsrTblThresholdResume, hwDHCP6RelayUsrTblExhaust, hwDHCP6RelayUsrTblExhaustResume, hwDHCP6RelayUsrIPThreshold, hwDHCP6RelayUsrIPThresholdResume, hwDHCP6RelayUsrIPExhaust, hwDHCP6RelayUsrIPExhaustResume, hwDHCPRelayProxyUsrThreshold, hwDHCPRelayProxyUsrThresholdResume, hwDHCPRelayProxyUsrExhaust, hwDHCPRelayProxyUsrExhaustResume
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

// --- hwPDRouteExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.7.1.3.1
// Description: The number of PD route for DHCPv6 relay reached the maximum.
trapMap["1.3.6.1.4.1.2011.5.7.1.3.1"] = [
    name: "hwPDRouteExceed",
    fields: [],
    fieldOids: []
]

// --- hwPDRouteExceedResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.7.1.3.2
// Description: The number of PD route for DHCPv6 relay descends to alarm threshold.
trapMap["1.3.6.1.4.1.2011.5.7.1.3.2"] = [
    name: "hwPDRouteExceedResume",
    fields: [],
    fieldOids: []
]

// --- hwDHCPRelayIpUnnumberedUsrThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.7.1.3.3
// Fields: hwDHCPRelayIpUnnumberedUsrNum, hwDHCPRelayMaxIpUnnumberedUsrNum
// Description: This object indicates that an alarm is generated when the number of DHCP relay IP unnumbered tables on the device exceeds 80% of the upper limit.
trapMap["1.3.6.1.4.1.2011.5.7.1.3.3"] = [
    name: "hwDHCPRelayIpUnnumberedUsrThreshold",
    fields: ["hwDHCPRelayIpUnnumberedUsrNum", "hwDHCPRelayMaxIpUnnumberedUsrNum"],
    fieldOids: ["hwDHCPRelayIpUnnumberedUsrNum": "1.3.6.1.4.1.2011.5.7.1.1.26.1", "hwDHCPRelayMaxIpUnnumberedUsrNum": "1.3.6.1.4.1.2011.5.7.1.1.26.2"]
]

// --- hwDHCPRelayIpUnnumberedUsrThresholdResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.7.1.3.4
// Fields: hwDHCPRelayIpUnnumberedUsrNum, hwDHCPRelayMaxIpUnnumberedUsrNum
// Description: This object indicates that a clear alarm is generated when the number of DHCP relay IP unnumbered tables on the device falls below 70% of the upper limit.
trapMap["1.3.6.1.4.1.2011.5.7.1.3.4"] = [
    name: "hwDHCPRelayIpUnnumberedUsrThresholdResume",
    fields: ["hwDHCPRelayIpUnnumberedUsrNum", "hwDHCPRelayMaxIpUnnumberedUsrNum"],
    fieldOids: ["hwDHCPRelayIpUnnumberedUsrNum": "1.3.6.1.4.1.2011.5.7.1.1.26.1", "hwDHCPRelayMaxIpUnnumberedUsrNum": "1.3.6.1.4.1.2011.5.7.1.1.26.2"]
]

// --- hwDHCPRelayIpUnnumberedUsrExhaust (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.7.1.3.5
// Fields: hwDHCPRelayMaxIpUnnumberedUsrNum
// Description: This object indicates that an alarm is generated when the number of DHCP relay IP unnumbered tables on the device reaches the upper limit.
trapMap["1.3.6.1.4.1.2011.5.7.1.3.5"] = [
    name: "hwDHCPRelayIpUnnumberedUsrExhaust",
    fields: ["hwDHCPRelayMaxIpUnnumberedUsrNum"],
    fieldOids: ["hwDHCPRelayMaxIpUnnumberedUsrNum": "1.3.6.1.4.1.2011.5.7.1.1.26.2"]
]

// --- hwDHCPRelayIpUnnumberedUsrExhaustResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.7.1.3.6
// Fields: hwDHCPRelayMaxIpUnnumberedUsrNum
// Description: This object indicates that a clear alarm is generated when the number of DHCP relay IP unnumbered tables on the device falls below 90% of the upper limit.
trapMap["1.3.6.1.4.1.2011.5.7.1.3.6"] = [
    name: "hwDHCPRelayIpUnnumberedUsrExhaustResume",
    fields: ["hwDHCPRelayMaxIpUnnumberedUsrNum"],
    fieldOids: ["hwDHCPRelayMaxIpUnnumberedUsrNum": "1.3.6.1.4.1.2011.5.7.1.1.26.2"]
]

// --- hwDHCP6RelayUsrTblThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.7.1.3.7
// Fields: hwDHCPv6RelayUsrNum, hwDHCPv6RelayMaxUsrNum
// Description: This object indicates that an alarm is generated when the number of DHCPv6 relay tables on the device exceeds 80% of the upper limit.
trapMap["1.3.6.1.4.1.2011.5.7.1.3.7"] = [
    name: "hwDHCP6RelayUsrTblThreshold",
    fields: ["hwDHCPv6RelayUsrNum", "hwDHCPv6RelayMaxUsrNum"],
    fieldOids: ["hwDHCPv6RelayUsrNum": "1.3.6.1.4.1.2011.5.7.1.1.26.3", "hwDHCPv6RelayMaxUsrNum": "1.3.6.1.4.1.2011.5.7.1.1.26.4"]
]

// --- hwDHCP6RelayUsrTblThresholdResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.7.1.3.8
// Fields: hwDHCPv6RelayUsrNum, hwDHCPv6RelayMaxUsrNum
// Description: This object indicates that a clear alarm is generated when the number of DHCPv6 relay tables on the device falls below 70% of the upper limit.
trapMap["1.3.6.1.4.1.2011.5.7.1.3.8"] = [
    name: "hwDHCP6RelayUsrTblThresholdResume",
    fields: ["hwDHCPv6RelayUsrNum", "hwDHCPv6RelayMaxUsrNum"],
    fieldOids: ["hwDHCPv6RelayUsrNum": "1.3.6.1.4.1.2011.5.7.1.1.26.3", "hwDHCPv6RelayMaxUsrNum": "1.3.6.1.4.1.2011.5.7.1.1.26.4"]
]

// --- hwDHCP6RelayUsrTblExhaust (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.7.1.3.9
// Fields: hwDHCPv6RelayMaxUsrNum
// Description: This object indicates that an alarm is generated when the number of DHCPv6 relay tables on the device reaches the upper limit.
trapMap["1.3.6.1.4.1.2011.5.7.1.3.9"] = [
    name: "hwDHCP6RelayUsrTblExhaust",
    fields: ["hwDHCPv6RelayMaxUsrNum"],
    fieldOids: ["hwDHCPv6RelayMaxUsrNum": "1.3.6.1.4.1.2011.5.7.1.1.26.4"]
]

// --- hwDHCP6RelayUsrTblExhaustResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.7.1.3.10
// Fields: hwDHCPv6RelayMaxUsrNum
// Description: This object indicates that a clear alarm is generated when the number of DHCPv6 relay tables on the device falls below 90% of the upper limit.
trapMap["1.3.6.1.4.1.2011.5.7.1.3.10"] = [
    name: "hwDHCP6RelayUsrTblExhaustResume",
    fields: ["hwDHCPv6RelayMaxUsrNum"],
    fieldOids: ["hwDHCPv6RelayMaxUsrNum": "1.3.6.1.4.1.2011.5.7.1.1.26.4"]
]

// --- hwDHCP6RelayUsrIPThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.7.1.3.11
// Fields: hwDHCPv6RelayIpNum, hwDHCPv6RelayMaxIpNum
// Description: This object indicates that an alarm is generated when the number of DHCPv6 relay IP tables on the device exceeds 80% of the upper limit.
trapMap["1.3.6.1.4.1.2011.5.7.1.3.11"] = [
    name: "hwDHCP6RelayUsrIPThreshold",
    fields: ["hwDHCPv6RelayIpNum", "hwDHCPv6RelayMaxIpNum"],
    fieldOids: ["hwDHCPv6RelayIpNum": "1.3.6.1.4.1.2011.5.7.1.1.26.5", "hwDHCPv6RelayMaxIpNum": "1.3.6.1.4.1.2011.5.7.1.1.26.6"]
]

// --- hwDHCP6RelayUsrIPThresholdResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.7.1.3.12
// Fields: hwDHCPv6RelayIpNum, hwDHCPv6RelayMaxIpNum
// Description: This object indicates that a clear alarm is generated when the number of DHCPv6 relay IP tables on the device falls below 70% of the upper limit.
trapMap["1.3.6.1.4.1.2011.5.7.1.3.12"] = [
    name: "hwDHCP6RelayUsrIPThresholdResume",
    fields: ["hwDHCPv6RelayIpNum", "hwDHCPv6RelayMaxIpNum"],
    fieldOids: ["hwDHCPv6RelayIpNum": "1.3.6.1.4.1.2011.5.7.1.1.26.5", "hwDHCPv6RelayMaxIpNum": "1.3.6.1.4.1.2011.5.7.1.1.26.6"]
]

// --- hwDHCP6RelayUsrIPExhaust (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.7.1.3.13
// Fields: hwDHCPv6RelayMaxIpNum
// Description: This object indicates that an alarm is generated when the number of DHCPv6 relay IP tables on the device reaches the upper limit.
trapMap["1.3.6.1.4.1.2011.5.7.1.3.13"] = [
    name: "hwDHCP6RelayUsrIPExhaust",
    fields: ["hwDHCPv6RelayMaxIpNum"],
    fieldOids: ["hwDHCPv6RelayMaxIpNum": "1.3.6.1.4.1.2011.5.7.1.1.26.6"]
]

// --- hwDHCP6RelayUsrIPExhaustResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.7.1.3.14
// Fields: hwDHCPv6RelayMaxIpNum
// Description: This object indicates that a clear alarm is generated when the number of DHCPv6 relay IP tables on the device falls below 90% of the upper limit.
trapMap["1.3.6.1.4.1.2011.5.7.1.3.14"] = [
    name: "hwDHCP6RelayUsrIPExhaustResume",
    fields: ["hwDHCPv6RelayMaxIpNum"],
    fieldOids: ["hwDHCPv6RelayMaxIpNum": "1.3.6.1.4.1.2011.5.7.1.1.26.6"]
]

// --- hwDHCPRelayProxyUsrThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.7.1.3.15
// Fields: hwDHCPRelayProxyUsrNum, hwDHCPRelayMaxProxyUsrNum
// Description: This object indicates that an alarm is generated when the number of DHCP relay proxy tables on the device exceeds 80% of the upper limit.
trapMap["1.3.6.1.4.1.2011.5.7.1.3.15"] = [
    name: "hwDHCPRelayProxyUsrThreshold",
    fields: ["hwDHCPRelayProxyUsrNum", "hwDHCPRelayMaxProxyUsrNum"],
    fieldOids: ["hwDHCPRelayProxyUsrNum": "1.3.6.1.4.1.2011.5.7.1.1.26.7", "hwDHCPRelayMaxProxyUsrNum": "1.3.6.1.4.1.2011.5.7.1.1.26.8"]
]

// --- hwDHCPRelayProxyUsrThresholdResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.7.1.3.16
// Fields: hwDHCPRelayProxyUsrNum, hwDHCPRelayMaxProxyUsrNum
// Description: This object indicates that a clear alarm is generated when the number of DHCP relay proxy tables on the device falls below 70% of the upper limit.
trapMap["1.3.6.1.4.1.2011.5.7.1.3.16"] = [
    name: "hwDHCPRelayProxyUsrThresholdResume",
    fields: ["hwDHCPRelayProxyUsrNum", "hwDHCPRelayMaxProxyUsrNum"],
    fieldOids: ["hwDHCPRelayProxyUsrNum": "1.3.6.1.4.1.2011.5.7.1.1.26.7", "hwDHCPRelayMaxProxyUsrNum": "1.3.6.1.4.1.2011.5.7.1.1.26.8"]
]

// --- hwDHCPRelayProxyUsrExhaust (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.7.1.3.17
// Fields: hwDHCPRelayMaxProxyUsrNum
// Description: This object indicates that an alarm is generated when the number of DHCP relay proxy tables on the device reaches the upper limit.
trapMap["1.3.6.1.4.1.2011.5.7.1.3.17"] = [
    name: "hwDHCPRelayProxyUsrExhaust",
    fields: ["hwDHCPRelayMaxProxyUsrNum"],
    fieldOids: ["hwDHCPRelayMaxProxyUsrNum": "1.3.6.1.4.1.2011.5.7.1.1.26.8"]
]

// --- hwDHCPRelayProxyUsrExhaustResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.7.1.3.18
// Fields: hwDHCPRelayMaxProxyUsrNum
// Description: This object indicates that a clear alarm is generated when the number of DHCP relay proxy tables on the device falls below 90% of the upper limit.
trapMap["1.3.6.1.4.1.2011.5.7.1.3.18"] = [
    name: "hwDHCPRelayProxyUsrExhaustResume",
    fields: ["hwDHCPRelayMaxProxyUsrNum"],
    fieldOids: ["hwDHCPRelayMaxProxyUsrNum": "1.3.6.1.4.1.2011.5.7.1.1.26.8"]
]

// ===== Parsing logic =====

// Set to true to enable diagnostic logging for this MIB parser
DEBUG = false

LOG_PREFIX = "[HUAWEI-DHCPR-MIB]"
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
