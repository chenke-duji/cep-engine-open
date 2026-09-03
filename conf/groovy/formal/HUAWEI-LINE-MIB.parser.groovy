/**
 * Auto-generated from HUAWEI-LINE-MIB.mib
 * Generated: 2026-08-24T18:28:30.225986300
 * Traps/Notifications (15): hwVtyNumExceed, hwUserLogin, hwUserLoginFail, hwUserLogout, hwUserSshLogin, hwUserSshLogout, hwTelnetLoginFailed, hwSSHLoginFailed, hwTelnetLoginFailedClear, hwSSHLoginFailedClear, hwIpLocked, hwIpUnLocked, hwVtyExceed, hwVtyExceedClear, hwConAuthModeIncomplete
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

// --- hwVtyNumExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.207.2.1
// Fields: hwMaxVtyNumber
// Description: This object indicates the alarm reported when the number of Telnet users reaches the maximum number of Telnet connections. In addition, the maximum number of Telnet connections is displayed.
trapMap["1.3.6.1.4.1.2011.5.25.207.2.1"] = [
    name: "hwVtyNumExceed",
    fields: ["hwMaxVtyNumber"],
    fieldOids: ["hwMaxVtyNumber": "1.3.6.1.4.1.2011.5.25.207.1.1.1"]
]

// --- hwUserLogin (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.207.2.2
// Fields: hwUserInfoName, hwUserInfoIpAddr, hwUserInfoChannel, hwAuthType, hwVpnInstName
// Description: When a user logs in through Telnet/Stelnet, the user name, IP address for login, used tunnel, authentication type and vpn name are reported.
trapMap["1.3.6.1.4.1.2011.5.25.207.2.2"] = [
    name: "hwUserLogin",
    fields: ["hwUserInfoName", "hwUserInfoIpAddr", "hwUserInfoChannel", "hwAuthType", "hwVpnInstName"],
    fieldOids: ["hwUserInfoName": "1.3.6.1.4.1.2011.5.25.207.1.2.1.1.2", "hwUserInfoIpAddr": "1.3.6.1.4.1.2011.5.25.207.1.2.1.1.3", "hwUserInfoChannel": "1.3.6.1.4.1.2011.5.25.207.1.2.1.1.4", "hwAuthType": "1.3.6.1.4.1.2011.5.25.207.1.2.1.1.5", "hwVpnInstName": "1.3.6.1.4.1.2011.5.25.207.1.2.1.1.6"]
]

// --- hwUserLoginFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.207.2.3
// Fields: hwUserInfoName, hwUserInfoIpAddr, hwUserInfoChannel, hwAuthType, hwVpnInstName
// Description: When a user fails to log in through Telnet/Stelnet, the user name, IP address for login, used tunnel, authentication type and vpn name are reported.
trapMap["1.3.6.1.4.1.2011.5.25.207.2.3"] = [
    name: "hwUserLoginFail",
    fields: ["hwUserInfoName", "hwUserInfoIpAddr", "hwUserInfoChannel", "hwAuthType", "hwVpnInstName"],
    fieldOids: ["hwUserInfoName": "1.3.6.1.4.1.2011.5.25.207.1.2.1.1.2", "hwUserInfoIpAddr": "1.3.6.1.4.1.2011.5.25.207.1.2.1.1.3", "hwUserInfoChannel": "1.3.6.1.4.1.2011.5.25.207.1.2.1.1.4", "hwAuthType": "1.3.6.1.4.1.2011.5.25.207.1.2.1.1.5", "hwVpnInstName": "1.3.6.1.4.1.2011.5.25.207.1.2.1.1.6"]
]

// --- hwUserLogout (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.207.2.4
// Fields: hwUserInfoName, hwUserInfoIpAddr, hwUserInfoChannel, hwAuthType, hwVpnInstName
// Description: When a user logs out of the Telnet/Stelnet server, the user name, IP address for logout, used tunnel, authentication type and vpn name are reported.
trapMap["1.3.6.1.4.1.2011.5.25.207.2.4"] = [
    name: "hwUserLogout",
    fields: ["hwUserInfoName", "hwUserInfoIpAddr", "hwUserInfoChannel", "hwAuthType", "hwVpnInstName"],
    fieldOids: ["hwUserInfoName": "1.3.6.1.4.1.2011.5.25.207.1.2.1.1.2", "hwUserInfoIpAddr": "1.3.6.1.4.1.2011.5.25.207.1.2.1.1.3", "hwUserInfoChannel": "1.3.6.1.4.1.2011.5.25.207.1.2.1.1.4", "hwAuthType": "1.3.6.1.4.1.2011.5.25.207.1.2.1.1.5", "hwVpnInstName": "1.3.6.1.4.1.2011.5.25.207.1.2.1.1.6"]
]

// --- hwUserSshLogin (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.207.2.5
// Fields: hwUserInfoName, hwUserInfoIpAddr, hwUserInfoChannel, hwAuthType, hwVpnInstName
// Description: When a user logs in to SSH server, the user name, IP address for login, used tunnel, authentication type and vpn name are reported.
trapMap["1.3.6.1.4.1.2011.5.25.207.2.5"] = [
    name: "hwUserSshLogin",
    fields: ["hwUserInfoName", "hwUserInfoIpAddr", "hwUserInfoChannel", "hwAuthType", "hwVpnInstName"],
    fieldOids: ["hwUserInfoName": "1.3.6.1.4.1.2011.5.25.207.1.2.1.1.2", "hwUserInfoIpAddr": "1.3.6.1.4.1.2011.5.25.207.1.2.1.1.3", "hwUserInfoChannel": "1.3.6.1.4.1.2011.5.25.207.1.2.1.1.4", "hwAuthType": "1.3.6.1.4.1.2011.5.25.207.1.2.1.1.5", "hwVpnInstName": "1.3.6.1.4.1.2011.5.25.207.1.2.1.1.6"]
]

// --- hwUserSshLogout (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.207.2.6
// Fields: hwUserInfoName, hwUserInfoIpAddr, hwUserInfoChannel, hwAuthType, hwVpnInstName
// Description: When a user logs out of the SSH server, the user name, IP address for logout, and used tunnel are reported.
trapMap["1.3.6.1.4.1.2011.5.25.207.2.6"] = [
    name: "hwUserSshLogout",
    fields: ["hwUserInfoName", "hwUserInfoIpAddr", "hwUserInfoChannel", "hwAuthType", "hwVpnInstName"],
    fieldOids: ["hwUserInfoName": "1.3.6.1.4.1.2011.5.25.207.1.2.1.1.2", "hwUserInfoIpAddr": "1.3.6.1.4.1.2011.5.25.207.1.2.1.1.3", "hwUserInfoChannel": "1.3.6.1.4.1.2011.5.25.207.1.2.1.1.4", "hwAuthType": "1.3.6.1.4.1.2011.5.25.207.1.2.1.1.5", "hwVpnInstName": "1.3.6.1.4.1.2011.5.25.207.1.2.1.1.6"]
]

// --- hwTelnetLoginFailed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.207.2.7
// Fields: hwUserInfoLoginFailedTimes, hwUserInfoStatisticPeriod
// Description: When users failed to login telnet server too frequently, login fail times and statistics period are reported.
trapMap["1.3.6.1.4.1.2011.5.25.207.2.7"] = [
    name: "hwTelnetLoginFailed",
    fields: ["hwUserInfoLoginFailedTimes", "hwUserInfoStatisticPeriod"],
    fieldOids: ["hwUserInfoLoginFailedTimes": "1.3.6.1.4.1.2011.5.25.207.1.5.1", "hwUserInfoStatisticPeriod": "1.3.6.1.4.1.2011.5.25.207.1.5.2"]
]

// --- hwSSHLoginFailed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.207.2.8
// Fields: hwUserInfoLoginFailedTimes, hwUserInfoStatisticPeriod
// Description: When users failed to login ssh server too frequently, login fail times and statistics period are reported.
trapMap["1.3.6.1.4.1.2011.5.25.207.2.8"] = [
    name: "hwSSHLoginFailed",
    fields: ["hwUserInfoLoginFailedTimes", "hwUserInfoStatisticPeriod"],
    fieldOids: ["hwUserInfoLoginFailedTimes": "1.3.6.1.4.1.2011.5.25.207.1.5.1", "hwUserInfoStatisticPeriod": "1.3.6.1.4.1.2011.5.25.207.1.5.2"]
]

// --- hwTelnetLoginFailedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.207.2.9
// Fields: hwUserInfoLoginFailedTimes, hwUserInfoStatisticPeriod
// Description: When users failed to login telnet server too frequently, login fail times and statistics period are reported.
trapMap["1.3.6.1.4.1.2011.5.25.207.2.9"] = [
    name: "hwTelnetLoginFailedClear",
    fields: ["hwUserInfoLoginFailedTimes", "hwUserInfoStatisticPeriod"],
    fieldOids: ["hwUserInfoLoginFailedTimes": "1.3.6.1.4.1.2011.5.25.207.1.5.1", "hwUserInfoStatisticPeriod": "1.3.6.1.4.1.2011.5.25.207.1.5.2"]
]

// --- hwSSHLoginFailedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.207.2.10
// Fields: hwUserInfoLoginFailedTimes, hwUserInfoStatisticPeriod
// Description: When users failed to login ssh server too frequently, login fail times and statistics period are reported.
trapMap["1.3.6.1.4.1.2011.5.25.207.2.10"] = [
    name: "hwSSHLoginFailedClear",
    fields: ["hwUserInfoLoginFailedTimes", "hwUserInfoStatisticPeriod"],
    fieldOids: ["hwUserInfoLoginFailedTimes": "1.3.6.1.4.1.2011.5.25.207.1.5.1", "hwUserInfoStatisticPeriod": "1.3.6.1.4.1.2011.5.25.207.1.5.2"]
]

// --- hwIpLocked (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.207.2.11
// Fields: hwUserInfoIpAddress, hwUserInfoVpnName, hwUserInfoStatisticPeriod
// Description: when the number of user login failures from the same IP address reaches the threshold, the trap of hwIpLocked is reported.
trapMap["1.3.6.1.4.1.2011.5.25.207.2.11"] = [
    name: "hwIpLocked",
    fields: ["hwUserInfoIpAddress", "hwUserInfoVpnName", "hwUserInfoStatisticPeriod"],
    fieldOids: ["hwUserInfoIpAddress": "1.3.6.1.4.1.2011.5.25.207.1.5.3", "hwUserInfoVpnName": "1.3.6.1.4.1.2011.5.25.207.1.5.4", "hwUserInfoStatisticPeriod": "1.3.6.1.4.1.2011.5.25.207.1.5.2"]
]

// --- hwIpUnLocked (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.207.2.12
// Fields: hwUserInfoIpAddress, hwUserInfoVpnName
// Description: When the IP is unlocked, the trap of hwIpUnLocked is reported.
trapMap["1.3.6.1.4.1.2011.5.25.207.2.12"] = [
    name: "hwIpUnLocked",
    fields: ["hwUserInfoIpAddress", "hwUserInfoVpnName"],
    fieldOids: ["hwUserInfoIpAddress": "1.3.6.1.4.1.2011.5.25.207.1.5.3", "hwUserInfoVpnName": "1.3.6.1.4.1.2011.5.25.207.1.5.4"]
]

// --- hwVtyExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.207.2.13
// Fields: hwCurrentVty, hwMaxVty
// Description: When the number of available VTY channels was lower than or equal to the threshold value, an alarm is generated.
trapMap["1.3.6.1.4.1.2011.5.25.207.2.13"] = [
    name: "hwVtyExceed",
    fields: ["hwCurrentVty", "hwMaxVty"],
    fieldOids: ["hwCurrentVty": "1.3.6.1.4.1.2011.5.25.207.1.5.5", "hwMaxVty": "1.3.6.1.4.1.2011.5.25.207.1.5.6"]
]

// --- hwVtyExceedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.207.2.14
// Fields: hwCurrentVty, hwMaxVty
// Description: When the number of available VTY channels is higher than or equal to the threshold value, the alarm is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.207.2.14"] = [
    name: "hwVtyExceedClear",
    fields: ["hwCurrentVty", "hwMaxVty"],
    fieldOids: ["hwCurrentVty": "1.3.6.1.4.1.2011.5.25.207.1.5.5", "hwMaxVty": "1.3.6.1.4.1.2011.5.25.207.1.5.6"]
]

// --- hwConAuthModeIncomplete (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.207.2.15
// Fields: hwConSlot, hwConAuthMode
// Description: When device startup and check console authentication mode that is not suit for first-login after upgrade, an event is generated.
trapMap["1.3.6.1.4.1.2011.5.25.207.2.15"] = [
    name: "hwConAuthModeIncomplete",
    fields: ["hwConSlot", "hwConAuthMode"],
    fieldOids: ["hwConSlot": "1.3.6.1.4.1.2011.5.25.207.1.5.8", "hwConAuthMode": "1.3.6.1.4.1.2011.5.25.207.1.5.7"]
]

// ===== Parsing logic =====

// Set to true to enable diagnostic logging for this MIB parser
DEBUG = false

LOG_PREFIX = "[HUAWEI-LINE-MIB]"
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
