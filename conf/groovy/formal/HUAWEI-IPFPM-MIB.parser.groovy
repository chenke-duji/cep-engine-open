/**
 * Auto-generated from HUAWEI-IPFPM-MIB.mib
 * Generated: 2026-08-24T18:28:29.934580500
 * Traps/Notifications (13): hwIpfpmLossRatioExceed, hwIpfpmLossRatioRecovery, hwIpfpmOneDelayExceed, hwIpfpmOneDelayRecovery, hwIpfpmTwoDelayExceed, hwIpfpmTwoDelayRecovery, hwIpfpmDcpFlowConflict, hwIpfpmTlpExceed, hwIpfpmTlpRecovery, hwIpfpmMultiOneDelayExceed, hwIpfpmMultiOneDelayRecovery, hwIpfpmMultiTwoDelayExceed, hwIpfpmMultiTwoDelayRecovery
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

// --- hwIpfpmLossRatioExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.316.3.1
// Fields: hwIpfpmMcpFlowType, hwIpfpmMcpForwardLossRatio, hwIpfpmMcpBackwardLossRatio, hwIpfpmMcpInstDesc
// Description: A hwIpfpmLossRatioExceed trap is sent when the loss ratio of IPFPM test instance exceeds the uppper threshold in continuous five test intervals.
trapMap["1.3.6.1.4.1.2011.5.25.316.3.1"] = [
    name: "hwIpfpmLossRatioExceed",
    fields: ["hwIpfpmMcpFlowType", "hwIpfpmMcpForwardLossRatio", "hwIpfpmMcpBackwardLossRatio", "hwIpfpmMcpInstDesc"],
    fieldOids: ["hwIpfpmMcpFlowType": "1.3.6.1.4.1.2011.5.25.316.1.1.7.1.2", "hwIpfpmMcpForwardLossRatio": "1.3.6.1.4.1.2011.5.25.316.1.2.4.1.10", "hwIpfpmMcpBackwardLossRatio": "1.3.6.1.4.1.2011.5.25.316.1.2.4.1.17", "hwIpfpmMcpInstDesc": "1.3.6.1.4.1.2011.5.25.316.1.1.5.1.2"]
]

// --- hwIpfpmLossRatioRecovery (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.316.3.2
// Fields: hwIpfpmMcpFlowType, hwIpfpmMcpForwardLossRatio, hwIpfpmMcpBackwardLossRatio, hwIpfpmMcpInstDesc
// Description: A hwIpfpmLossRatioRecovery trap is sent when the loss ratio of IPFPM test instance is under the lower threshold in continuous five test intervals.
trapMap["1.3.6.1.4.1.2011.5.25.316.3.2"] = [
    name: "hwIpfpmLossRatioRecovery",
    fields: ["hwIpfpmMcpFlowType", "hwIpfpmMcpForwardLossRatio", "hwIpfpmMcpBackwardLossRatio", "hwIpfpmMcpInstDesc"],
    fieldOids: ["hwIpfpmMcpFlowType": "1.3.6.1.4.1.2011.5.25.316.1.1.7.1.2", "hwIpfpmMcpForwardLossRatio": "1.3.6.1.4.1.2011.5.25.316.1.2.4.1.10", "hwIpfpmMcpBackwardLossRatio": "1.3.6.1.4.1.2011.5.25.316.1.2.4.1.17", "hwIpfpmMcpInstDesc": "1.3.6.1.4.1.2011.5.25.316.1.1.5.1.2"]
]

// --- hwIpfpmOneDelayExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.316.3.3
// Fields: hwIpfpmMcpFlowType, hwIpfpmMcpForwardOneDelay, hwIpfpmMcpBackwardOneDelay, hwIpfpmMcpInstDesc
// Description: A hwIpfpmOneDelayExceed trap is sent when the one-way delay of IPFPM test instance exceeds the uppper threshold in continuous five test intervals.
trapMap["1.3.6.1.4.1.2011.5.25.316.3.3"] = [
    name: "hwIpfpmOneDelayExceed",
    fields: ["hwIpfpmMcpFlowType", "hwIpfpmMcpForwardOneDelay", "hwIpfpmMcpBackwardOneDelay", "hwIpfpmMcpInstDesc"],
    fieldOids: ["hwIpfpmMcpFlowType": "1.3.6.1.4.1.2011.5.25.316.1.1.7.1.2", "hwIpfpmMcpForwardOneDelay": "1.3.6.1.4.1.2011.5.25.316.1.2.5.1.2", "hwIpfpmMcpBackwardOneDelay": "1.3.6.1.4.1.2011.5.25.316.1.2.5.1.4", "hwIpfpmMcpInstDesc": "1.3.6.1.4.1.2011.5.25.316.1.1.5.1.2"]
]

// --- hwIpfpmOneDelayRecovery (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.316.3.4
// Fields: hwIpfpmMcpFlowType, hwIpfpmMcpForwardOneDelay, hwIpfpmMcpBackwardOneDelay, hwIpfpmMcpInstDesc
// Description: A hwIpfpmOneDelayRecovery trap is sent when the one-way delay of IPFPM test instance is under the lower threshold in continuous five test intervals.
trapMap["1.3.6.1.4.1.2011.5.25.316.3.4"] = [
    name: "hwIpfpmOneDelayRecovery",
    fields: ["hwIpfpmMcpFlowType", "hwIpfpmMcpForwardOneDelay", "hwIpfpmMcpBackwardOneDelay", "hwIpfpmMcpInstDesc"],
    fieldOids: ["hwIpfpmMcpFlowType": "1.3.6.1.4.1.2011.5.25.316.1.1.7.1.2", "hwIpfpmMcpForwardOneDelay": "1.3.6.1.4.1.2011.5.25.316.1.2.5.1.2", "hwIpfpmMcpBackwardOneDelay": "1.3.6.1.4.1.2011.5.25.316.1.2.5.1.4", "hwIpfpmMcpInstDesc": "1.3.6.1.4.1.2011.5.25.316.1.1.5.1.2"]
]

// --- hwIpfpmTwoDelayExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.316.3.5
// Fields: hwIpfpmMcpTwoDelay, hwIpfpmMcpInstDesc
// Description: A hwIpfpmTwoDelayExceed trap is sent when the two-way delay of IPFPM test instance exceeds the uppper threshold in continuous five test intervals.
trapMap["1.3.6.1.4.1.2011.5.25.316.3.5"] = [
    name: "hwIpfpmTwoDelayExceed",
    fields: ["hwIpfpmMcpTwoDelay", "hwIpfpmMcpInstDesc"],
    fieldOids: ["hwIpfpmMcpTwoDelay": "1.3.6.1.4.1.2011.5.25.316.1.2.6.1.2", "hwIpfpmMcpInstDesc": "1.3.6.1.4.1.2011.5.25.316.1.1.5.1.2"]
]

// --- hwIpfpmTwoDelayRecovery (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.316.3.6
// Fields: hwIpfpmMcpTwoDelay, hwIpfpmMcpInstDesc
// Description: A hwIpfpmTwoDelayRecovery trap is sent when the two-way delay of IPFPM test instance is under the lower threshold in continuous five test intervals.
trapMap["1.3.6.1.4.1.2011.5.25.316.3.6"] = [
    name: "hwIpfpmTwoDelayRecovery",
    fields: ["hwIpfpmMcpTwoDelay", "hwIpfpmMcpInstDesc"],
    fieldOids: ["hwIpfpmMcpTwoDelay": "1.3.6.1.4.1.2011.5.25.316.1.2.6.1.2", "hwIpfpmMcpInstDesc": "1.3.6.1.4.1.2011.5.25.316.1.1.5.1.2"]
]

// --- hwIpfpmDcpFlowConflict (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.316.3.7
// Fields: hwIpfpmDcpInstId, hwIpfpmDcpFlowType, hwIpfpmDcpInstId, hwIpfpmDcpFlowType
// Description: A hwIpfpmDcpFlowConflict trap is sent when the flow configuration conflicts with another existing flow configuration. The first hwIpfpmDcpInstId and hwIpfpmDcpFlowType indicates the specified flow. Th...
trapMap["1.3.6.1.4.1.2011.5.25.316.3.7"] = [
    name: "hwIpfpmDcpFlowConflict",
    fields: ["hwIpfpmDcpInstId", "hwIpfpmDcpFlowType", "hwIpfpmDcpInstId", "hwIpfpmDcpFlowType"],
    fieldOids: ["hwIpfpmDcpInstId": "1.3.6.1.4.1.2011.5.25.316.2.1.8.1.1", "hwIpfpmDcpFlowType": "1.3.6.1.4.1.2011.5.25.316.2.1.10.1.1"]
]

// --- hwIpfpmTlpExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.316.3.8
// Fields: hwIpfpmTlpExceedBoardId, hwIpfpmTlpNumber, hwIpfpmTlpThreshold
// Description: A hwIpfpmTlpExceed trap is sent when the number of board tlp exceeds the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.316.3.8"] = [
    name: "hwIpfpmTlpExceed",
    fields: ["hwIpfpmTlpExceedBoardId", "hwIpfpmTlpNumber", "hwIpfpmTlpThreshold"],
    fieldOids: ["hwIpfpmTlpExceedBoardId": "1.3.6.1.4.1.2011.5.25.316.2.2.1", "hwIpfpmTlpNumber": "1.3.6.1.4.1.2011.5.25.316.2.2.2", "hwIpfpmTlpThreshold": "1.3.6.1.4.1.2011.5.25.316.2.2.3"]
]

// --- hwIpfpmTlpRecovery (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.316.3.9
// Fields: hwIpfpmTlpExceedBoardId, hwIpfpmTlpNumber, hwIpfpmTlpThreshold
// Description: A hwIpfpmTlpRecovery trap is sent when the number of board tlp is under the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.316.3.9"] = [
    name: "hwIpfpmTlpRecovery",
    fields: ["hwIpfpmTlpExceedBoardId", "hwIpfpmTlpNumber", "hwIpfpmTlpThreshold"],
    fieldOids: ["hwIpfpmTlpExceedBoardId": "1.3.6.1.4.1.2011.5.25.316.2.2.1", "hwIpfpmTlpNumber": "1.3.6.1.4.1.2011.5.25.316.2.2.2", "hwIpfpmTlpThreshold": "1.3.6.1.4.1.2011.5.25.316.2.2.3"]
]

// --- hwIpfpmMultiOneDelayExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.316.3.10
// Fields: hwIpfpmMcpOneDelayMulti
// Description: A hwIpfpmMultiOneDelayExceed trap is sent when the one-way delay of IPFPM test instance exceeds the uppper threshold in continuous five test intervals. This trap supports multi one-way delay for a per...
trapMap["1.3.6.1.4.1.2011.5.25.316.3.10"] = [
    name: "hwIpfpmMultiOneDelayExceed",
    fields: ["hwIpfpmMcpOneDelayMulti"],
    fieldOids: ["hwIpfpmMcpOneDelayMulti": "1.3.6.1.4.1.2011.5.25.316.1.2.7.1.7"]
]

// --- hwIpfpmMultiOneDelayRecovery (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.316.3.11
// Fields: hwIpfpmMcpOneDelayMulti
// Description: A hwIpfpmMultiOneDelayRecovery trap is sent when the one-way delay of IPFPM test instance is under the lower threshold in continuous five test intervals. This trap supports multi one-way delay for a p...
trapMap["1.3.6.1.4.1.2011.5.25.316.3.11"] = [
    name: "hwIpfpmMultiOneDelayRecovery",
    fields: ["hwIpfpmMcpOneDelayMulti"],
    fieldOids: ["hwIpfpmMcpOneDelayMulti": "1.3.6.1.4.1.2011.5.25.316.1.2.7.1.7"]
]

// --- hwIpfpmMultiTwoDelayExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.316.3.12
// Fields: hwIpfpmMcpTwoDelayMulti
// Description: A hwIpfpmMultiTwoDelayExceed trap is sent when the two-way delay of IPFPM test instance exceeds the uppper threshold in continuous five test intervals. This trap supports multi two-way delay for a per...
trapMap["1.3.6.1.4.1.2011.5.25.316.3.12"] = [
    name: "hwIpfpmMultiTwoDelayExceed",
    fields: ["hwIpfpmMcpTwoDelayMulti"],
    fieldOids: ["hwIpfpmMcpTwoDelayMulti": "1.3.6.1.4.1.2011.5.25.316.1.2.8.1.10"]
]

// --- hwIpfpmMultiTwoDelayRecovery (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.316.3.13
// Fields: hwIpfpmMcpTwoDelayMulti
// Description: A hwIpfpmMultiTwoDelayRecovery trap is sent when the two-way delay of IPFPM test instance is under the lower threshold in continuous five test intervals. This trap supports multi two-way delay for a p...
trapMap["1.3.6.1.4.1.2011.5.25.316.3.13"] = [
    name: "hwIpfpmMultiTwoDelayRecovery",
    fields: ["hwIpfpmMcpTwoDelayMulti"],
    fieldOids: ["hwIpfpmMcpTwoDelayMulti": "1.3.6.1.4.1.2011.5.25.316.1.2.8.1.10"]
]

// ===== Parsing logic =====

// Set to true to enable diagnostic logging for this MIB parser
DEBUG = false

LOG_PREFIX = "[HUAWEI-IPFPM-MIB]"
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
