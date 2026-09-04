/**
 * Auto-generated from HUAWEI-MNGT-MIB.mib
 * Generated: 2026-08-24T18:28:30.345796
 * Traps/Notifications (15): hwMngtUserLogonStateTrap, hwMngtUserLogonStateInetTrap, hwUserLogWillFullTrap, hwMngtUserLockedTrap, hwMngtUserStateChangeTrap, hwMngtUserNameWillExpireTrap, hwMngtUserPasswordWillExpireTrap, hwUserPasswordFaultTrap, hwUserPasswordRestoreTrap, hwMngtUserUnlockedTrap, hwMngtUserModifyAuthTrap, hwConfigLockStateTrap, hwMngtUserStateChangeInetTrap, hwMngtIpv6UserLockedTrap, hwMngtIpv6UserUnlockedTrap
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

// --- hwMngtUserLogonStateTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.10.9.1.0.1
// Fields: hwCliUserName, hwUserLogMode, hwCliClientIp, hwUserAdminStatus, hwCliOnlineUserNum
// Description: This trap message is reported when the user login or logoff.
trapMap["1.3.6.1.4.1.2011.6.3.10.9.1.0.1"] = [
    name: "hwMngtUserLogonStateTrap",
    fields: ["hwCliUserName", "hwUserLogMode", "hwCliClientIp", "hwUserAdminStatus", "hwCliOnlineUserNum"],
    fieldOids: ["hwCliUserName": "1.3.6.1.4.1.2011.6.3.10.1.1.1", "hwUserLogMode": "1.3.6.1.4.1.2011.6.3.10.8.2", "hwCliClientIp": "1.3.6.1.4.1.2011.6.3.10.2.1.4", "hwUserAdminStatus": "1.3.6.1.4.1.2011.6.3.10.8.1", "hwCliOnlineUserNum": "1.3.6.1.4.1.2011.6.3.10.8.6"]
]

// --- hwMngtUserLogonStateInetTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.10.9.1.0.2
// Fields: hwCliUserName, hwUserLogMode, hwCliClientInetAddress, hwUserAdminStatus, hwCliOnlineUserNum
// Description: This trap message is reported when the user login or logoff.
trapMap["1.3.6.1.4.1.2011.6.3.10.9.1.0.2"] = [
    name: "hwMngtUserLogonStateInetTrap",
    fields: ["hwCliUserName", "hwUserLogMode", "hwCliClientInetAddress", "hwUserAdminStatus", "hwCliOnlineUserNum"],
    fieldOids: ["hwCliUserName": "1.3.6.1.4.1.2011.6.3.10.1.1.1", "hwUserLogMode": "1.3.6.1.4.1.2011.6.3.10.8.2", "hwCliClientInetAddress": "1.3.6.1.4.1.2011.6.3.10.2.1.9", "hwUserAdminStatus": "1.3.6.1.4.1.2011.6.3.10.8.1", "hwCliOnlineUserNum": "1.3.6.1.4.1.2011.6.3.10.8.6"]
]

// --- hwUserLogWillFullTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.10.9.2.0.1
// Fields: hwUserLogType
// Description: This trap message is reported when the system log database will be full.
trapMap["1.3.6.1.4.1.2011.6.3.10.9.2.0.1"] = [
    name: "hwUserLogWillFullTrap",
    fields: ["hwUserLogType"],
    fieldOids: ["hwUserLogType": "1.3.6.1.4.1.2011.6.3.10.8.3"]
]

// --- hwMngtUserLockedTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.10.9.2.0.2
// Fields: hwCliUserName, hwUserLogMode, hwCliClientIp, hwCliSysLockType
// Description: This trap message is reported when the managing user of the equipment is locked.
trapMap["1.3.6.1.4.1.2011.6.3.10.9.2.0.2"] = [
    name: "hwMngtUserLockedTrap",
    fields: ["hwCliUserName", "hwUserLogMode", "hwCliClientIp", "hwCliSysLockType"],
    fieldOids: ["hwCliUserName": "1.3.6.1.4.1.2011.6.3.10.1.1.1", "hwUserLogMode": "1.3.6.1.4.1.2011.6.3.10.8.2", "hwCliClientIp": "1.3.6.1.4.1.2011.6.3.10.2.1.4", "hwCliSysLockType": "1.3.6.1.4.1.2011.6.3.10.6.4"]
]

// --- hwMngtUserStateChangeTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.10.9.2.0.3
// Fields: hwCliUserName, hwUserLogMode, hwCliClientIp, hwUserAdminStatus
// Description: This trap message is reported when the maintenance user's state changes.
trapMap["1.3.6.1.4.1.2011.6.3.10.9.2.0.3"] = [
    name: "hwMngtUserStateChangeTrap",
    fields: ["hwCliUserName", "hwUserLogMode", "hwCliClientIp", "hwUserAdminStatus"],
    fieldOids: ["hwCliUserName": "1.3.6.1.4.1.2011.6.3.10.1.1.1", "hwUserLogMode": "1.3.6.1.4.1.2011.6.3.10.8.2", "hwCliClientIp": "1.3.6.1.4.1.2011.6.3.10.2.1.4", "hwUserAdminStatus": "1.3.6.1.4.1.2011.6.3.10.8.1"]
]

// --- hwMngtUserNameWillExpireTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.10.9.2.0.4
// Fields: hwCliUserName, hwCliUserNameLastDays
// Description: This trap message is reported when the user name will expire soon.
trapMap["1.3.6.1.4.1.2011.6.3.10.9.2.0.4"] = [
    name: "hwMngtUserNameWillExpireTrap",
    fields: ["hwCliUserName", "hwCliUserNameLastDays"],
    fieldOids: ["hwCliUserName": "1.3.6.1.4.1.2011.6.3.10.1.1.1", "hwCliUserNameLastDays": "1.3.6.1.4.1.2011.6.3.10.1.1.10"]
]

// --- hwMngtUserPasswordWillExpireTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.10.9.2.0.5
// Fields: hwCliUserName, hwCliUserPwdLastDays
// Description: This trap message is reported when the user password will expire soon.
trapMap["1.3.6.1.4.1.2011.6.3.10.9.2.0.5"] = [
    name: "hwMngtUserPasswordWillExpireTrap",
    fields: ["hwCliUserName", "hwCliUserPwdLastDays"],
    fieldOids: ["hwCliUserName": "1.3.6.1.4.1.2011.6.3.10.1.1.1", "hwCliUserPwdLastDays": "1.3.6.1.4.1.2011.6.3.10.1.1.11"]
]

// --- hwUserPasswordFaultTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.10.9.2.0.6
// Description: This trap is sent when the default password for user root is not changed.
trapMap["1.3.6.1.4.1.2011.6.3.10.9.2.0.6"] = [
    name: "hwUserPasswordFaultTrap",
    fields: [],
    fieldOids: []
]

// --- hwUserPasswordRestoreTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.10.9.2.0.7
// Description: This trap is sent when the default password for user root is changed.
trapMap["1.3.6.1.4.1.2011.6.3.10.9.2.0.7"] = [
    name: "hwUserPasswordRestoreTrap",
    fields: [],
    fieldOids: []
]

// --- hwMngtUserUnlockedTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.10.9.2.0.8
// Fields: hwCliUserName, hwCliClientIp, hwCliSysUnlockType
// Description: This trap message is reported when the managing user of the equipment is unlocked.
trapMap["1.3.6.1.4.1.2011.6.3.10.9.2.0.8"] = [
    name: "hwMngtUserUnlockedTrap",
    fields: ["hwCliUserName", "hwCliClientIp", "hwCliSysUnlockType"],
    fieldOids: ["hwCliUserName": "1.3.6.1.4.1.2011.6.3.10.1.1.1", "hwCliClientIp": "1.3.6.1.4.1.2011.6.3.10.2.1.4", "hwCliSysUnlockType": "1.3.6.1.4.1.2011.6.3.10.6.7"]
]

// --- hwMngtUserModifyAuthTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.10.9.2.0.9
// Fields: hwCliUserName, hwCliSysOldUserLevel, hwCliSysNewUserLevel
// Description: This trap message is reported when the managing user change the permissions .
trapMap["1.3.6.1.4.1.2011.6.3.10.9.2.0.9"] = [
    name: "hwMngtUserModifyAuthTrap",
    fields: ["hwCliUserName", "hwCliSysOldUserLevel", "hwCliSysNewUserLevel"],
    fieldOids: ["hwCliUserName": "1.3.6.1.4.1.2011.6.3.10.1.1.1", "hwCliSysOldUserLevel": "1.3.6.1.4.1.2011.6.3.10.8.4", "hwCliSysNewUserLevel": "1.3.6.1.4.1.2011.6.3.10.8.5"]
]

// --- hwConfigLockStateTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.10.9.2.0.10
// Fields: hwConfigLockState
// Description: This trap message is reported when user change the config lock state.
trapMap["1.3.6.1.4.1.2011.6.3.10.9.2.0.10"] = [
    name: "hwConfigLockStateTrap",
    fields: ["hwConfigLockState"],
    fieldOids: ["hwConfigLockState": "1.3.6.1.4.1.2011.6.3.24.1"]
]

// --- hwMngtUserStateChangeInetTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.10.9.2.0.11
// Fields: hwCliUserName, hwUserLogMode, hwCliClientInetAddress, hwUserAdminStatus
// Description: This trap message is reported when the maintenance user's state changes.
trapMap["1.3.6.1.4.1.2011.6.3.10.9.2.0.11"] = [
    name: "hwMngtUserStateChangeInetTrap",
    fields: ["hwCliUserName", "hwUserLogMode", "hwCliClientInetAddress", "hwUserAdminStatus"],
    fieldOids: ["hwCliUserName": "1.3.6.1.4.1.2011.6.3.10.1.1.1", "hwUserLogMode": "1.3.6.1.4.1.2011.6.3.10.8.2", "hwCliClientInetAddress": "1.3.6.1.4.1.2011.6.3.10.2.1.9", "hwUserAdminStatus": "1.3.6.1.4.1.2011.6.3.10.8.1"]
]

// --- hwMngtIpv6UserLockedTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.10.9.2.0.12
// Fields: hwCliUserName, hwUserLogMode, hwCliClientInetAddress, hwCliSysLockType
// Description: This trap message is reported when the managing user of the equipment is locked.
trapMap["1.3.6.1.4.1.2011.6.3.10.9.2.0.12"] = [
    name: "hwMngtIpv6UserLockedTrap",
    fields: ["hwCliUserName", "hwUserLogMode", "hwCliClientInetAddress", "hwCliSysLockType"],
    fieldOids: ["hwCliUserName": "1.3.6.1.4.1.2011.6.3.10.1.1.1", "hwUserLogMode": "1.3.6.1.4.1.2011.6.3.10.8.2", "hwCliClientInetAddress": "1.3.6.1.4.1.2011.6.3.10.2.1.9", "hwCliSysLockType": "1.3.6.1.4.1.2011.6.3.10.6.4"]
]

// --- hwMngtIpv6UserUnlockedTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.3.10.9.2.0.13
// Fields: hwCliUserName, hwCliClientInetAddress, hwCliSysUnlockType
// Description: This trap message is reported when the managing user of the equipment is unlocked.
trapMap["1.3.6.1.4.1.2011.6.3.10.9.2.0.13"] = [
    name: "hwMngtIpv6UserUnlockedTrap",
    fields: ["hwCliUserName", "hwCliClientInetAddress", "hwCliSysUnlockType"],
    fieldOids: ["hwCliUserName": "1.3.6.1.4.1.2011.6.3.10.1.1.1", "hwCliClientInetAddress": "1.3.6.1.4.1.2011.6.3.10.2.1.9", "hwCliSysUnlockType": "1.3.6.1.4.1.2011.6.3.10.6.7"]
]

// ===== Parsing logic =====

// Set to true to enable diagnostic logging for this MIB parser
DEBUG = false

LOG_PREFIX = "[HUAWEI-MNGT-MIB]"
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
