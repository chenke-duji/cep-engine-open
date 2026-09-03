/**
 * Auto-generated from HUAWEI-CONFIG-MAN-MIB.mib
 * Generated: 2026-08-25T16:47:00.474553300
 * Traps/Notifications (28): hwCfgManEventlog, hwCfgOperateCompletion, hwCfgInconsistent, hwCfgInconsistentResume, hwCfgB2STransferFail, hwCfgB2SOperate, hwCfgRestoreFail, hwCfgRestoreSuccess, hwConfigInconsistent, hwConfigInconsistentResume, hwCfgAppDataInconsistent, hwCfgAppDataInconsistentResume, hwNextStartupFileInconsistent, hwNextStartupFileInconsistentResume, hwCfgLockConfigurationByUser, hwCfgUnlockConfigurationByUser, hwCfgConfigChangeLog, hwCfgMemoryInsufficient, hwCfgMemoryInsufficientResume, hwCfgNextStartupFileIntegrityFail, hwcfgStartupFileIntegrityFail, hwcfgStartupFileIntegrityFailResume, hwCfgMinisystemConfigRecovery, hwCfgMinisystemConfigRecoveryClear, hwCfgBackupFailure, hwCfgBackupFailureClear, hwCfgConfigUnsaved, hwCfgConfigUnsavedClear
 *
 * Mapping rules:
 *   node       = trap source IP (rawEvent.sourceIp)
 *   alertGroup/summary/severity/type = per-trap rule overrides
 */

import com.raysdata.cep.model.AlarmEvent
import com.raysdata.cep.model.EventType
import com.raysdata.cep.model.Severity

// ===== Trap OID -> definition mapping =====
// Key: fully resolved numeric OID, Value: [name, fields, fieldOids]
def trapMap = [:]

// ===== Name -> definition mapping (fallback for unresolved OIDs) =====
def trapNameMap = [:]

// --- hwCfgManEventlog (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.10.2.1
// Fields: hwCfgLogSrcCmd, hwCfgLogSrcData, hwCfgLogDesData, hwCfgLogTerminalUser, hwCfgLogCmdSrcAddress, hwCfgLogConfigChangeId, hwCfgLogTime, hwCfgLogCfgBaselineTime
// Description: If the system configuration is changed, a notification is generated.
trapMap["1.3.6.1.4.1.2011.6.10.2.1"] = [
    name: "hwCfgManEventlog",
    fields: ["hwCfgLogSrcCmd", "hwCfgLogSrcData", "hwCfgLogDesData", "hwCfgLogTerminalUser", "hwCfgLogCmdSrcAddress", "hwCfgLogConfigChangeId", "hwCfgLogTime", "hwCfgLogCfgBaselineTime"],
    fieldOids: ["hwCfgLogSrcCmd": "1.3.6.1.4.1.2011.6.10.1.1.7.1.3", "hwCfgLogSrcData": "1.3.6.1.4.1.2011.6.10.1.1.7.1.4", "hwCfgLogDesData": "1.3.6.1.4.1.2011.6.10.1.1.7.1.5", "hwCfgLogTerminalUser": "1.3.6.1.4.1.2011.6.10.1.1.7.1.7", "hwCfgLogCmdSrcAddress": "1.3.6.1.4.1.2011.6.10.1.1.7.1.10", "hwCfgLogConfigChangeId": "1.3.6.1.4.1.2011.6.10.1.1.7.1.15", "hwCfgLogTime": "1.3.6.1.4.1.2011.6.10.1.1.7.1.2", "hwCfgLogCfgBaselineTime": "1.3.6.1.4.1.2011.6.10.1.1.7.1.16"]
]

// --- hwCfgOperateCompletion (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.10.2.2
// Fields: hwCfgOperateType, hwCfgOperateTime, hwCfgOperateState, hwCfgOperateEndTime
// Description: When a configuration operation has been done, a notification may be generated.
trapMap["1.3.6.1.4.1.2011.6.10.2.2"] = [
    name: "hwCfgOperateCompletion",
    fields: ["hwCfgOperateType", "hwCfgOperateTime", "hwCfgOperateState", "hwCfgOperateEndTime"],
    fieldOids: ["hwCfgOperateType": "1.3.6.1.4.1.2011.6.10.1.2.4.1.2", "hwCfgOperateTime": "1.3.6.1.4.1.2011.6.10.1.2.5.1.5", "hwCfgOperateState": "1.3.6.1.4.1.2011.6.10.1.2.5.1.4", "hwCfgOperateEndTime": "1.3.6.1.4.1.2011.6.10.1.2.5.1.6"]
]

// --- hwCfgInconsistent (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.10.2.3
// Description: When the system automatically detects that configurations of the AMB and the SMB are inconsistent, the trap is generated.
trapMap["1.3.6.1.4.1.2011.6.10.2.3"] = [
    name: "hwCfgInconsistent",
    fields: [],
    fieldOids: []
]

// --- hwCfgInconsistentResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.10.2.4
// Description: When the system automatically detects that configurations of the AMB and the SMB change from inconsistent to consistent, the trap is generated.
trapMap["1.3.6.1.4.1.2011.6.10.2.4"] = [
    name: "hwCfgInconsistentResume",
    fields: [],
    fieldOids: []
]

// --- hwCfgB2STransferFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.10.2.5
// Fields: hwCfgBackupIndex, hwCfgBackupServerIp, hwCfgBackupProtocol
// Description: When the system failed to backup current configuration to specified server, this trap will generate to indicates the details information.
trapMap["1.3.6.1.4.1.2011.6.10.2.5"] = [
    name: "hwCfgB2STransferFail",
    fields: ["hwCfgBackupIndex", "hwCfgBackupServerIp", "hwCfgBackupProtocol"],
    fieldOids: ["hwCfgBackupIndex": "1.3.6.1.4.1.2011.6.10.1.3.7.1.1", "hwCfgBackupServerIp": "1.3.6.1.4.1.2011.6.10.1.3.7.1.2", "hwCfgBackupProtocol": "1.3.6.1.4.1.2011.6.10.1.3.7.1.3"]
]

// --- hwCfgB2SOperate (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.10.2.6
// Description: When the system begin to backup current configuration to servers, this trap will generate.
trapMap["1.3.6.1.4.1.2011.6.10.2.6"] = [
    name: "hwCfgB2SOperate",
    fields: [],
    fieldOids: []
]

// --- hwCfgRestoreFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.10.2.7
// Fields: hwCfgRestoreErrCode
// Description: When configuration restoration fails, this trap is generated.
trapMap["1.3.6.1.4.1.2011.6.10.2.7"] = [
    name: "hwCfgRestoreFail",
    fields: ["hwCfgRestoreErrCode"],
    fieldOids: ["hwCfgRestoreErrCode": "1.3.6.1.4.1.2011.6.10.1.2.8"]
]

// --- hwCfgRestoreSuccess (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.10.2.8
// Description: When configuration restoration succeeds, this trap is generated.
trapMap["1.3.6.1.4.1.2011.6.10.2.8"] = [
    name: "hwCfgRestoreSuccess",
    fields: [],
    fieldOids: []
]

// --- hwConfigInconsistent (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.10.2.9
// Description: When system automatically detects that configurations of the main board and the slave board are inconsistent, this trap is generated.
trapMap["1.3.6.1.4.1.2011.6.10.2.9"] = [
    name: "hwConfigInconsistent",
    fields: [],
    fieldOids: []
]

// --- hwConfigInconsistentResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.10.2.10
// Description: When system automatically detects that configurations of the main board and the slave board change from inconsistent to consistent, this trap is generated.
trapMap["1.3.6.1.4.1.2011.6.10.2.10"] = [
    name: "hwConfigInconsistentResume",
    fields: [],
    fieldOids: []
]

// --- hwCfgAppDataInconsistent (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.10.2.11
// Description: When the system automatically detects that configurations of the application and the Master Main Board are inconsistent, the trap is generated.
trapMap["1.3.6.1.4.1.2011.6.10.2.11"] = [
    name: "hwCfgAppDataInconsistent",
    fields: [],
    fieldOids: []
]

// --- hwCfgAppDataInconsistentResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.10.2.12
// Description: When the system automatically detects that configurations of the application and the Master Main Board change from inconsistent to consistent, the trap is generated.
trapMap["1.3.6.1.4.1.2011.6.10.2.12"] = [
    name: "hwCfgAppDataInconsistentResume",
    fields: [],
    fieldOids: []
]

// --- hwNextStartupFileInconsistent (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.10.2.13
// Description: When the system automatically detects that the next startup files of the master and slave main control boards are inconsistent, this trap is generated.
trapMap["1.3.6.1.4.1.2011.6.10.2.13"] = [
    name: "hwNextStartupFileInconsistent",
    fields: [],
    fieldOids: []
]

// --- hwNextStartupFileInconsistentResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.10.2.14
// Description: When the system automatically detects that the next startup files of the master and slave main control boards become consistent, this trap is generated.
trapMap["1.3.6.1.4.1.2011.6.10.2.14"] = [
    name: "hwNextStartupFileInconsistentResume",
    fields: [],
    fieldOids: []
]

// --- hwCfgLockConfigurationByUser (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.10.2.15
// Fields: hwCfgOperateLockByUserUserName, hwCfgOperateLockByUserLockId, hwCfgOperateLockByUserLockedTime
// Description: The trap is generated when a user locks system configurations.
trapMap["1.3.6.1.4.1.2011.6.10.2.15"] = [
    name: "hwCfgLockConfigurationByUser",
    fields: ["hwCfgOperateLockByUserUserName", "hwCfgOperateLockByUserLockId", "hwCfgOperateLockByUserLockedTime"],
    fieldOids: ["hwCfgOperateLockByUserUserName": "1.3.6.1.4.1.2011.6.10.1.5.1", "hwCfgOperateLockByUserLockId": "1.3.6.1.4.1.2011.6.10.1.5.3", "hwCfgOperateLockByUserLockedTime": "1.3.6.1.4.1.2011.6.10.1.5.4"]
]

// --- hwCfgUnlockConfigurationByUser (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.10.2.16
// Fields: hwCfgOperateUnlockByUserUserName, hwCfgOperateUnlockByUserUnlockedTime
// Description: The trap is generated when a user unlocks system configurations.
trapMap["1.3.6.1.4.1.2011.6.10.2.16"] = [
    name: "hwCfgUnlockConfigurationByUser",
    fields: ["hwCfgOperateUnlockByUserUserName", "hwCfgOperateUnlockByUserUnlockedTime"],
    fieldOids: ["hwCfgOperateUnlockByUserUserName": "1.3.6.1.4.1.2011.6.10.1.5.2", "hwCfgOperateUnlockByUserUnlockedTime": "1.3.6.1.4.1.2011.6.10.1.5.5"]
]

// --- hwCfgConfigChangeLog (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.10.2.17
// Fields: hwCfgConfigChangeIsInner, hwCfgConfigChangeUserName, hwCfgConfigChangeSessionId, hwCfgConfigChangeSrcAddress, hwCfgConfigChangeStorageType, hwCfgConfigChangeTerminalType
// Description: The trap is generated when a configuration changes.
trapMap["1.3.6.1.4.1.2011.6.10.2.17"] = [
    name: "hwCfgConfigChangeLog",
    fields: ["hwCfgConfigChangeIsInner", "hwCfgConfigChangeUserName", "hwCfgConfigChangeSessionId", "hwCfgConfigChangeSrcAddress", "hwCfgConfigChangeStorageType", "hwCfgConfigChangeTerminalType"],
    fieldOids: ["hwCfgConfigChangeIsInner": "1.3.6.1.4.1.2011.6.10.1.5.6", "hwCfgConfigChangeUserName": "1.3.6.1.4.1.2011.6.10.1.5.7", "hwCfgConfigChangeSessionId": "1.3.6.1.4.1.2011.6.10.1.5.8", "hwCfgConfigChangeSrcAddress": "1.3.6.1.4.1.2011.6.10.1.5.9", "hwCfgConfigChangeStorageType": "1.3.6.1.4.1.2011.6.10.1.5.10", "hwCfgConfigChangeTerminalType": "1.3.6.1.4.1.2011.6.10.1.5.11"]
]

// --- hwCfgMemoryInsufficient (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.10.2.18
// Description: The trap is generated when system memory is not enough to complete configuration editing.
trapMap["1.3.6.1.4.1.2011.6.10.2.18"] = [
    name: "hwCfgMemoryInsufficient",
    fields: [],
    fieldOids: []
]

// --- hwCfgMemoryInsufficientResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.10.2.19
// Description: The trap is generated when the hwCfgMemoryInsufficient trap is manually cleared by user.
trapMap["1.3.6.1.4.1.2011.6.10.2.19"] = [
    name: "hwCfgMemoryInsufficientResume",
    fields: [],
    fieldOids: []
]

// --- hwCfgNextStartupFileIntegrityFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.10.2.20
// Description: The trap is generated when the integrity check of the next startup configuration file fails.
trapMap["1.3.6.1.4.1.2011.6.10.2.20"] = [
    name: "hwCfgNextStartupFileIntegrityFail",
    fields: [],
    fieldOids: []
]

// --- hwcfgStartupFileIntegrityFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.10.2.21
// Fields: hwcfgStartupFileIntegrityFailFileType
// Description: The trap is generated when the integrity check of the startup configuration file fails.
trapMap["1.3.6.1.4.1.2011.6.10.2.21"] = [
    name: "hwcfgStartupFileIntegrityFail",
    fields: ["hwcfgStartupFileIntegrityFailFileType"],
    fieldOids: ["hwcfgStartupFileIntegrityFailFileType": "1.3.6.1.4.1.2011.6.10.1.5.12"]
]

// --- hwcfgStartupFileIntegrityFailResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.10.2.22
// Fields: hwcfgStartupFileIntegrityFailFileType
// Description: The trap is generated when the hwcfgStartupFileIntegrityFail trap is manually cleared by user.
trapMap["1.3.6.1.4.1.2011.6.10.2.22"] = [
    name: "hwcfgStartupFileIntegrityFailResume",
    fields: ["hwcfgStartupFileIntegrityFailFileType"],
    fieldOids: ["hwcfgStartupFileIntegrityFailFileType": "1.3.6.1.4.1.2011.6.10.1.5.12"]
]

// --- hwCfgMinisystemConfigRecovery (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.10.2.23
// Description: The trap is generated when the system restores to the minimum system configuration.
trapMap["1.3.6.1.4.1.2011.6.10.2.23"] = [
    name: "hwCfgMinisystemConfigRecovery",
    fields: [],
    fieldOids: []
]

// --- hwCfgMinisystemConfigRecoveryClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.10.2.24
// Description: The trap is generated when the system does not restore the system to the minimum system configuration.
trapMap["1.3.6.1.4.1.2011.6.10.2.24"] = [
    name: "hwCfgMinisystemConfigRecoveryClear",
    fields: [],
    fieldOids: []
]

// --- hwCfgBackupFailure (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.10.2.25
// Fields: hwCfgBackupFailureReason
// Description: The trap is generated when backup failed.
trapMap["1.3.6.1.4.1.2011.6.10.2.25"] = [
    name: "hwCfgBackupFailure",
    fields: ["hwCfgBackupFailureReason"],
    fieldOids: ["hwCfgBackupFailureReason": "1.3.6.1.4.1.2011.6.10.1.5.13"]
]

// --- hwCfgBackupFailureClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.10.2.26
// Fields: hwCfgBackupFailureReason
// Description: The trap is generated when backup success.
trapMap["1.3.6.1.4.1.2011.6.10.2.26"] = [
    name: "hwCfgBackupFailureClear",
    fields: ["hwCfgBackupFailureReason"],
    fieldOids: ["hwCfgBackupFailureReason": "1.3.6.1.4.1.2011.6.10.1.5.13"]
]

// --- hwCfgConfigUnsaved (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.10.2.27
// Description: The trap is generated when configuration changes are not saved within the specified time.
trapMap["1.3.6.1.4.1.2011.6.10.2.27"] = [
    name: "hwCfgConfigUnsaved",
    fields: [],
    fieldOids: []
]

// --- hwCfgConfigUnsavedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.10.2.28
// Description: The trap is generated when a new configuration file for the next startup is saved or set.
trapMap["1.3.6.1.4.1.2011.6.10.2.28"] = [
    name: "hwCfgConfigUnsavedClear",
    fields: [],
    fieldOids: []
]

// ===== Lookup tables (inlined) =====
def lookupTables = [:]

// ===== Parsing logic =====

// Set to true to enable diagnostic logging for this MIB parser
DEBUG = false

LOG_PREFIX = "[HUAWEI-CONFIG-MAN-MIB]"
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

// --- Trap rule overrides (alert group / severity) ---
def trapRuleName = trapInfo.name
def agent = ""
// --- Trap: hwCfgManEventlog (OID 1.3.6.1.4.1.2011.6.10.2.1) ---
if (trapRuleName == "hwCfgManEventlog") {
    event.setAlertGroup("Configuration Change")
    def alertKey = "Cmd: " + ((((lookupTables?."hwCfgLogSrcCmd" as Map)?.get(gf[1] ?: "") ?: "Unknown")) + " ( " + gf[1] + " )") + ", Src: " + ((((lookupTables?."hwCfgLogSrcData" as Map)?.get(gf[2] ?: "") ?: "Unknown")) + " ( " + gf[2] + " )") + ", Dest: " + ((((lookupTables?."hwCfgLogDesData" as Map)?.get(gf[3] ?: "") ?: "Unknown")) + " ( " + gf[3] + " )")
    event.setAlertKey(alertKey)
    def summary = "Hw Cfg Man Eventlog" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(2)
    event.setEventType("13")
    def dyn = event.getDynamicFields() ?: [:]
    dyn["hwCfgLogSrcCmd"] = varbinds.get("hwCfgLogSrcCmd")
    dyn["hwCfgLogSrcData"] = varbinds.get("hwCfgLogSrcData")
    dyn["hwCfgLogDesData"] = varbinds.get("hwCfgLogDesData")
    event.setDynamicFields(dyn)
}
// --- Trap: hwCfgOperateCompletion (OID 1.3.6.1.4.1.2011.6.10.2.2) ---
if (trapRuleName == "hwCfgOperateCompletion") {
    event.setAlertGroup("Configuration Operation Status")
    def alertKey = "Type: " + ((((lookupTables?."hwCfgOperateType" as Map)?.get(gf[1] ?: "") ?: "Unknown")) + " ( " + gf[1] + " )")
    event.setAlertKey(alertKey)
    def summary = "Hw Cfg Operate Completion" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    if (gf[3] == "1") {
        event.setSeverity(2)
        event.setEventType("1")
    }
    else if (gf[3] == "2") {
        event.setSeverity(1)
        event.setEventType("2")
    }
    else if (gf[3] == "3") {
        event.setSeverity(2)
        event.setEventType("1")
    }
}

if (event.getAgentType() == null || event.getAgentType().trim().isEmpty()) {
    event.setAgentType(metadata?.get("agentType")?.toString() ?: "generic")
}
def pairKey = [event.getDomainId(), event.getAgentType(), event.getNode(), event.getAlertGroup(), event.getAlertKey()]
                    .findAll { it != null && it.toString().trim() != "" }
                    .collect { it.toString().trim() }.join("|")
event.setIdentifier(pairKey + "|" + event.getEventType())

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
