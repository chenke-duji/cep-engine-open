/**
 * Auto-generated from HUAWEI-SNMP-NOTIFICATION-MIB.mib
 * Generated: 2026-08-24T18:28:30.958265700
 * Traps/Notifications (18): hwSynAlarm, hwMessageReportTrap, hwShakeMessageTrap, hwAlmSynBeginTrap, hwAlmSynEndTrap, hwAlarmClearedReportTrap, hwOperationFromNmsTrap, hwIllegalMessageTrap, hwTargetHostDeletedTrap, hwCertExpireTrap, hwSslCertExpiringFaultTrap, hwSslCertExpiringRestoreTrap, hwSslCertExpiredFaultTrap, hwSslCertExpiredRestoreTrap, hwBoardSslCertExpiringFaultTrap, hwBoardSslCertExpiringRestoreTrap, hwBoardSslCertExpiredFaultTrap, hwBoardSslCertExpiredRestoreTrap
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

// --- hwSynAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.30.2.2.0.1
// Fields: hwAlarmSynAdminStatus, hwAlarmSn, hwTrapType
// Description: Currently, the object is not supported. This trap is reported when syn operation from NMS.
trapMap["1.3.6.1.4.1.2011.6.30.2.2.0.1"] = [
    name: "hwSynAlarm",
    fields: ["hwAlarmSynAdminStatus", "hwAlarmSn", "hwTrapType"],
    fieldOids: ["hwAlarmSynAdminStatus": "1.3.6.1.4.1.2011.6.30.1.5", "hwAlarmSn": "1.3.6.1.4.1.2011.20021210.3", "hwTrapType": "1.3.6.1.4.1.2011.20021210.5"]
]

// --- hwMessageReportTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.30.18.1.0.1
// Fields: hwNewDeviceIpAddr, hwOldDeviceIpAddr, hwLogHostMacAddress, hwSysVersion, hwProtocolVersion, hwCommunityReadName, hwCommunityWriteName
// Description: The register trap message is reported by the host to the NMS when the function of handshake between the host and the NMS is enabled.
trapMap["1.3.6.1.4.1.2011.6.30.18.1.0.1"] = [
    name: "hwMessageReportTrap",
    fields: ["hwNewDeviceIpAddr", "hwOldDeviceIpAddr", "hwLogHostMacAddress", "hwSysVersion", "hwProtocolVersion", "hwCommunityReadName", "hwCommunityWriteName"],
    fieldOids: ["hwNewDeviceIpAddr": "1.3.6.1.4.1.2011.6.3.8.1.14", "hwOldDeviceIpAddr": "1.3.6.1.4.1.2011.6.3.8.1.13", "hwLogHostMacAddress": "1.3.6.1.4.1.2011.6.30.17.8", "hwSysVersion": "1.3.6.1.4.1.2011.6.3.1.3", "hwProtocolVersion": "1.3.6.1.4.1.2011.6.30.17.9", "hwCommunityReadName": "1.3.6.1.4.1.2011.6.30.17.10", "hwCommunityWriteName": "1.3.6.1.4.1.2011.6.30.17.11"]
]

// --- hwShakeMessageTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.30.18.1.0.2
// Fields: hwSysIpAddr, hwSysVersion
// Description: Shake between host and NMS. After the function of handshake between the host and the NMS is enabled, the host periodically sends a trap message to the NMS if it registers with the NMS successfully.
trapMap["1.3.6.1.4.1.2011.6.30.18.1.0.2"] = [
    name: "hwShakeMessageTrap",
    fields: ["hwSysIpAddr", "hwSysVersion"],
    fieldOids: ["hwSysIpAddr": "1.3.6.1.4.1.2011.6.3.1.1", "hwSysVersion": "1.3.6.1.4.1.2011.6.3.1.3"]
]

// --- hwAlmSynBeginTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.30.18.1.0.3
// Fields: hwTrapSynType, hwTrapSynAdminStatus, hwTrapNum
// Description: The agent generates this trap when alarm synchronization starts.
trapMap["1.3.6.1.4.1.2011.6.30.18.1.0.3"] = [
    name: "hwAlmSynBeginTrap",
    fields: ["hwTrapSynType", "hwTrapSynAdminStatus", "hwTrapNum"],
    fieldOids: ["hwTrapSynType": "1.3.6.1.4.1.2011.6.30.11.1.1.1", "hwTrapSynAdminStatus": "1.3.6.1.4.1.2011.6.30.11.1.1.6", "hwTrapNum": "1.3.6.1.4.1.2011.6.30.17.12"]
]

// --- hwAlmSynEndTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.30.18.1.0.4
// Fields: hwTrapSynType, hwTrapSynAdminStatus, hwTrapNum
// Description: The agent generates this trap when alarm synchronization completes.
trapMap["1.3.6.1.4.1.2011.6.30.18.1.0.4"] = [
    name: "hwAlmSynEndTrap",
    fields: ["hwTrapSynType", "hwTrapSynAdminStatus", "hwTrapNum"],
    fieldOids: ["hwTrapSynType": "1.3.6.1.4.1.2011.6.30.11.1.1.1", "hwTrapSynAdminStatus": "1.3.6.1.4.1.2011.6.30.11.1.1.6", "hwTrapNum": "1.3.6.1.4.1.2011.6.30.17.12"]
]

// --- hwAlarmClearedReportTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.30.18.1.0.5
// Fields: hwAlarmClearedNum, hwAlarmClearedSnList
// Description: The agent generates this trap when clear active alarm completed.
trapMap["1.3.6.1.4.1.2011.6.30.18.1.0.5"] = [
    name: "hwAlarmClearedReportTrap",
    fields: ["hwAlarmClearedNum", "hwAlarmClearedSnList"],
    fieldOids: ["hwAlarmClearedNum": "1.3.6.1.4.1.2011.6.30.17.15", "hwAlarmClearedSnList": "1.3.6.1.4.1.2011.6.30.17.16"]
]

// --- hwOperationFromNmsTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.30.18.2.0.1
// Fields: hwFrameIndex, hwSlotIndex, hwNMSIPAddr
// Description: This trap is reported when important operation from NMS.
trapMap["1.3.6.1.4.1.2011.6.30.18.2.0.1"] = [
    name: "hwOperationFromNmsTrap",
    fields: ["hwFrameIndex", "hwSlotIndex", "hwNMSIPAddr"],
    fieldOids: ["hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwSlotIndex": "1.3.6.1.4.1.2011.6.3.3.2.1.1", "hwNMSIPAddr": "1.3.6.1.4.1.2011.6.30.17.13"]
]

// --- hwIllegalMessageTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.30.18.2.0.2
// Fields: hwNMSIPAddr
// Description: After the firewall is enabled, this trap message is reported when the system receives an SNMP packet whose IP address is refused by the firewall. A maximum of 15 such trap messages are sent in 15 minu...
trapMap["1.3.6.1.4.1.2011.6.30.18.2.0.2"] = [
    name: "hwIllegalMessageTrap",
    fields: ["hwNMSIPAddr"],
    fieldOids: ["hwNMSIPAddr": "1.3.6.1.4.1.2011.6.30.17.13"]
]

// --- hwTargetHostDeletedTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.30.18.2.0.3
// Fields: snmpTargetAddrName, snmpTargetAddrTAddress
// Description: This trap message is reported when the destination host of the trap message is deleted.
trapMap["1.3.6.1.4.1.2011.6.30.18.2.0.3"] = [
    name: "hwTargetHostDeletedTrap",
    fields: ["snmpTargetAddrName", "snmpTargetAddrTAddress"],
    fieldOids: ["snmpTargetAddrName": "1.3.6.1.6.3.12.1.2.1.1", "snmpTargetAddrTAddress": "1.3.6.1.6.3.12.1.2.1.3"]
]

// --- hwCertExpireTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.30.21.1
// Fields: hwCertUsage, hwCertIndex, hwCertExpireDate
// Description: This trap message is reported when the certificate is about to expire.
trapMap["1.3.6.1.4.1.2011.6.30.21.1"] = [
    name: "hwCertExpireTrap",
    fields: ["hwCertUsage", "hwCertIndex", "hwCertExpireDate"],
    fieldOids: ["hwCertUsage": "1.3.6.1.4.1.2011.6.30.20.1", "hwCertIndex": "1.3.6.1.4.1.2011.6.30.20.2", "hwCertExpireDate": "1.3.6.1.4.1.2011.6.30.20.3"]
]

// --- hwSslCertExpiringFaultTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.30.22.1
// Fields: hwSSLCertName, hwSSLCertType, hwSSLCertBeginTime, hwSSLCertEndTime
// Description: This trap message is reported when the SSL certificate is about to expire.
trapMap["1.3.6.1.4.1.2011.6.30.22.1"] = [
    name: "hwSslCertExpiringFaultTrap",
    fields: ["hwSSLCertName", "hwSSLCertType", "hwSSLCertBeginTime", "hwSSLCertEndTime"],
    fieldOids: ["hwSSLCertName": "1.3.6.1.4.1.2011.6.30.20.4", "hwSSLCertType": "1.3.6.1.4.1.2011.6.30.20.5", "hwSSLCertBeginTime": "1.3.6.1.4.1.2011.6.30.20.6", "hwSSLCertEndTime": "1.3.6.1.4.1.2011.6.30.20.7"]
]

// --- hwSslCertExpiringRestoreTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.30.22.2
// Fields: hwSSLCertName, hwSSLCertType, hwSSLCertBeginTime, hwSSLCertEndTime
// Description: This trap message is reported when the alarm indicating that the SSL certificate is about to expire is cleared.
trapMap["1.3.6.1.4.1.2011.6.30.22.2"] = [
    name: "hwSslCertExpiringRestoreTrap",
    fields: ["hwSSLCertName", "hwSSLCertType", "hwSSLCertBeginTime", "hwSSLCertEndTime"],
    fieldOids: ["hwSSLCertName": "1.3.6.1.4.1.2011.6.30.20.4", "hwSSLCertType": "1.3.6.1.4.1.2011.6.30.20.5", "hwSSLCertBeginTime": "1.3.6.1.4.1.2011.6.30.20.6", "hwSSLCertEndTime": "1.3.6.1.4.1.2011.6.30.20.7"]
]

// --- hwSslCertExpiredFaultTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.30.22.3
// Fields: hwSSLCertName, hwSSLCertType, hwSSLCertBeginTime, hwSSLCertEndTime
// Description: This trap message is reported when the certificate has expired.
trapMap["1.3.6.1.4.1.2011.6.30.22.3"] = [
    name: "hwSslCertExpiredFaultTrap",
    fields: ["hwSSLCertName", "hwSSLCertType", "hwSSLCertBeginTime", "hwSSLCertEndTime"],
    fieldOids: ["hwSSLCertName": "1.3.6.1.4.1.2011.6.30.20.4", "hwSSLCertType": "1.3.6.1.4.1.2011.6.30.20.5", "hwSSLCertBeginTime": "1.3.6.1.4.1.2011.6.30.20.6", "hwSSLCertEndTime": "1.3.6.1.4.1.2011.6.30.20.7"]
]

// --- hwSslCertExpiredRestoreTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.30.22.4
// Fields: hwSSLCertName, hwSSLCertType, hwSSLCertBeginTime, hwSSLCertEndTime
// Description: This trap message is reported when the SSL certificate expiration alarm is cleared.
trapMap["1.3.6.1.4.1.2011.6.30.22.4"] = [
    name: "hwSslCertExpiredRestoreTrap",
    fields: ["hwSSLCertName", "hwSSLCertType", "hwSSLCertBeginTime", "hwSSLCertEndTime"],
    fieldOids: ["hwSSLCertName": "1.3.6.1.4.1.2011.6.30.20.4", "hwSSLCertType": "1.3.6.1.4.1.2011.6.30.20.5", "hwSSLCertBeginTime": "1.3.6.1.4.1.2011.6.30.20.6", "hwSSLCertEndTime": "1.3.6.1.4.1.2011.6.30.20.7"]
]

// --- hwBoardSslCertExpiringFaultTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.30.24.1
// Fields: hwSSLCertName, hwSSLCertType, hwSSLCertBeginTime, hwSSLCertEndTime, hwSSLCertFrameId, hwSSLCertSlotId
// Description: This trap message is reported when the board certificate is about to expire.
trapMap["1.3.6.1.4.1.2011.6.30.24.1"] = [
    name: "hwBoardSslCertExpiringFaultTrap",
    fields: ["hwSSLCertName", "hwSSLCertType", "hwSSLCertBeginTime", "hwSSLCertEndTime", "hwSSLCertFrameId", "hwSSLCertSlotId"],
    fieldOids: ["hwSSLCertName": "1.3.6.1.4.1.2011.6.30.20.4", "hwSSLCertType": "1.3.6.1.4.1.2011.6.30.20.5", "hwSSLCertBeginTime": "1.3.6.1.4.1.2011.6.30.20.6", "hwSSLCertEndTime": "1.3.6.1.4.1.2011.6.30.20.7", "hwSSLCertFrameId": "1.3.6.1.4.1.2011.6.30.20.8", "hwSSLCertSlotId": "1.3.6.1.4.1.2011.6.30.20.9"]
]

// --- hwBoardSslCertExpiringRestoreTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.30.24.2
// Fields: hwSSLCertName, hwSSLCertType, hwSSLCertBeginTime, hwSSLCertEndTime, hwSSLCertFrameId, hwSSLCertSlotId
// Description: This trap message is reported when the alarm indicating that the board certificate is about to expire is cleared.
trapMap["1.3.6.1.4.1.2011.6.30.24.2"] = [
    name: "hwBoardSslCertExpiringRestoreTrap",
    fields: ["hwSSLCertName", "hwSSLCertType", "hwSSLCertBeginTime", "hwSSLCertEndTime", "hwSSLCertFrameId", "hwSSLCertSlotId"],
    fieldOids: ["hwSSLCertName": "1.3.6.1.4.1.2011.6.30.20.4", "hwSSLCertType": "1.3.6.1.4.1.2011.6.30.20.5", "hwSSLCertBeginTime": "1.3.6.1.4.1.2011.6.30.20.6", "hwSSLCertEndTime": "1.3.6.1.4.1.2011.6.30.20.7", "hwSSLCertFrameId": "1.3.6.1.4.1.2011.6.30.20.8", "hwSSLCertSlotId": "1.3.6.1.4.1.2011.6.30.20.9"]
]

// --- hwBoardSslCertExpiredFaultTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.30.24.3
// Fields: hwSSLCertName, hwSSLCertType, hwSSLCertBeginTime, hwSSLCertEndTime, hwSSLCertFrameId, hwSSLCertSlotId
// Description: This trap message is reported when the board certificate has expired.
trapMap["1.3.6.1.4.1.2011.6.30.24.3"] = [
    name: "hwBoardSslCertExpiredFaultTrap",
    fields: ["hwSSLCertName", "hwSSLCertType", "hwSSLCertBeginTime", "hwSSLCertEndTime", "hwSSLCertFrameId", "hwSSLCertSlotId"],
    fieldOids: ["hwSSLCertName": "1.3.6.1.4.1.2011.6.30.20.4", "hwSSLCertType": "1.3.6.1.4.1.2011.6.30.20.5", "hwSSLCertBeginTime": "1.3.6.1.4.1.2011.6.30.20.6", "hwSSLCertEndTime": "1.3.6.1.4.1.2011.6.30.20.7", "hwSSLCertFrameId": "1.3.6.1.4.1.2011.6.30.20.8", "hwSSLCertSlotId": "1.3.6.1.4.1.2011.6.30.20.9"]
]

// --- hwBoardSslCertExpiredRestoreTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.30.24.4
// Fields: hwSSLCertName, hwSSLCertType, hwSSLCertBeginTime, hwSSLCertEndTime, hwSSLCertFrameId, hwSSLCertSlotId
// Description: This trap message is reported when the board certificate expiration alarm is cleared.
trapMap["1.3.6.1.4.1.2011.6.30.24.4"] = [
    name: "hwBoardSslCertExpiredRestoreTrap",
    fields: ["hwSSLCertName", "hwSSLCertType", "hwSSLCertBeginTime", "hwSSLCertEndTime", "hwSSLCertFrameId", "hwSSLCertSlotId"],
    fieldOids: ["hwSSLCertName": "1.3.6.1.4.1.2011.6.30.20.4", "hwSSLCertType": "1.3.6.1.4.1.2011.6.30.20.5", "hwSSLCertBeginTime": "1.3.6.1.4.1.2011.6.30.20.6", "hwSSLCertEndTime": "1.3.6.1.4.1.2011.6.30.20.7", "hwSSLCertFrameId": "1.3.6.1.4.1.2011.6.30.20.8", "hwSSLCertSlotId": "1.3.6.1.4.1.2011.6.30.20.9"]
]

// ===== Parsing logic =====

// Set to true to enable diagnostic logging for this MIB parser
DEBUG = false

LOG_PREFIX = "[HUAWEI-SNMP-NOTIFICATION-MIB]"
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
