/**
 * Auto-generated from HUAWEI-NETCONF-MIB.mib
 * Generated: 2026-08-24T18:28:30.504654400
 * Traps/Notifications (17): hwNetconfSyncFullFtpFailed, hwNetconfClientConnectionInterrupt, hwNetconfClientConnectionResume, hwNetconfServerConnectionInterrupt, hwNetconfServerConnectionResume, hwNetconfServerSyncConfigFail, hwNetconfClientConfigFailed, hwNetconfClientConfigSynchronizedSuccess, hwNetconfClientSyncConfigFailed, hwNetconfClientSyncConfigSuccess, hwNetconfClientPeerConnectionInterrupt, hwNetconfClientPeerConnectionResume, hwNetconfClientPeerConnectFailed, hwNetconfClientPeerConnectSuccess, hwNetconfServerSessionStart, hwNetconfServerSessionEnd, hwNetconfMdaResourceChange
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

// --- hwNetconfSyncFullFtpFailed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.217.2.1
// Fields: hwNetconfSyncFullFtpFilename, hwNetconfSyncFullFtpServerAddr, hwNetconfSyncFullFtpFailReason
// Description: This notification is sent when the FTP transfer of the sync full operation file to the remote FTP Server failed.
trapMap["1.3.6.1.4.1.2011.5.25.217.2.1"] = [
    name: "hwNetconfSyncFullFtpFailed",
    fields: ["hwNetconfSyncFullFtpFilename", "hwNetconfSyncFullFtpServerAddr", "hwNetconfSyncFullFtpFailReason"],
    fieldOids: ["hwNetconfSyncFullFtpFilename": "1.3.6.1.4.1.2011.5.25.217.1.1", "hwNetconfSyncFullFtpServerAddr": "1.3.6.1.4.1.2011.5.25.217.1.2", "hwNetconfSyncFullFtpFailReason": "1.3.6.1.4.1.2011.5.25.217.1.3"]
]

// --- hwNetconfClientConnectionInterrupt (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.217.2.2
// Fields: hwNetconfSessionInetAddrType, hwNetconfSessionPeerIPAddress, hwNetconfSessionVpnName
// Description: Remote netconf connection is interrupted.
trapMap["1.3.6.1.4.1.2011.5.25.217.2.2"] = [
    name: "hwNetconfClientConnectionInterrupt",
    fields: ["hwNetconfSessionInetAddrType", "hwNetconfSessionPeerIPAddress", "hwNetconfSessionVpnName"],
    fieldOids: ["hwNetconfSessionInetAddrType": "1.3.6.1.4.1.2011.5.25.217.1.4", "hwNetconfSessionPeerIPAddress": "1.3.6.1.4.1.2011.5.25.217.1.5", "hwNetconfSessionVpnName": "1.3.6.1.4.1.2011.5.25.217.1.6"]
]

// --- hwNetconfClientConnectionResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.217.2.3
// Fields: hwNetconfSessionInetAddrType, hwNetconfSessionPeerIPAddress, hwNetconfSessionVpnName
// Description: Remote netconf connection is resumed.
trapMap["1.3.6.1.4.1.2011.5.25.217.2.3"] = [
    name: "hwNetconfClientConnectionResume",
    fields: ["hwNetconfSessionInetAddrType", "hwNetconfSessionPeerIPAddress", "hwNetconfSessionVpnName"],
    fieldOids: ["hwNetconfSessionInetAddrType": "1.3.6.1.4.1.2011.5.25.217.1.4", "hwNetconfSessionPeerIPAddress": "1.3.6.1.4.1.2011.5.25.217.1.5", "hwNetconfSessionVpnName": "1.3.6.1.4.1.2011.5.25.217.1.6"]
]

// --- hwNetconfServerConnectionInterrupt (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.217.2.4
// Fields: hwNetconfSessionInetAddrType, hwNetconfSessionPeerIPAddress, hwNetconfSessionVpnName, hwNetconfSessionTerminationReason
// Description: The connection between a NETCONF server and its peer is torn down.
trapMap["1.3.6.1.4.1.2011.5.25.217.2.4"] = [
    name: "hwNetconfServerConnectionInterrupt",
    fields: ["hwNetconfSessionInetAddrType", "hwNetconfSessionPeerIPAddress", "hwNetconfSessionVpnName", "hwNetconfSessionTerminationReason"],
    fieldOids: ["hwNetconfSessionInetAddrType": "1.3.6.1.4.1.2011.5.25.217.1.4", "hwNetconfSessionPeerIPAddress": "1.3.6.1.4.1.2011.5.25.217.1.5", "hwNetconfSessionVpnName": "1.3.6.1.4.1.2011.5.25.217.1.6", "hwNetconfSessionTerminationReason": "1.3.6.1.4.1.2011.5.25.217.1.13"]
]

// --- hwNetconfServerConnectionResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.217.2.5
// Fields: hwNetconfSessionInetAddrType, hwNetconfSessionPeerIPAddress, hwNetconfSessionVpnName, hwNetconfSessionTerminationResumeReason
// Description: The connection between a NETCONF server and its peer is restored.
trapMap["1.3.6.1.4.1.2011.5.25.217.2.5"] = [
    name: "hwNetconfServerConnectionResume",
    fields: ["hwNetconfSessionInetAddrType", "hwNetconfSessionPeerIPAddress", "hwNetconfSessionVpnName", "hwNetconfSessionTerminationResumeReason"],
    fieldOids: ["hwNetconfSessionInetAddrType": "1.3.6.1.4.1.2011.5.25.217.1.4", "hwNetconfSessionPeerIPAddress": "1.3.6.1.4.1.2011.5.25.217.1.5", "hwNetconfSessionVpnName": "1.3.6.1.4.1.2011.5.25.217.1.6", "hwNetconfSessionTerminationResumeReason": "1.3.6.1.4.1.2011.5.25.217.1.15"]
]

// --- hwNetconfServerSyncConfigFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.217.2.6
// Fields: hwNetconfSessionInetAddrType, hwNetconfSyncConfigIPAddress, hwNetconfSessionVpnName
// Description: This notification is sent when application virtual access configurations synchronization is failed.
trapMap["1.3.6.1.4.1.2011.5.25.217.2.6"] = [
    name: "hwNetconfServerSyncConfigFail",
    fields: ["hwNetconfSessionInetAddrType", "hwNetconfSyncConfigIPAddress", "hwNetconfSessionVpnName"],
    fieldOids: ["hwNetconfSessionInetAddrType": "1.3.6.1.4.1.2011.5.25.217.1.4", "hwNetconfSyncConfigIPAddress": "1.3.6.1.4.1.2011.5.25.217.1.7", "hwNetconfSessionVpnName": "1.3.6.1.4.1.2011.5.25.217.1.6"]
]

// --- hwNetconfClientConfigFailed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.217.2.7
// Fields: hwNetconfClientPeerName, hwNetconfSessionInetAddrType, hwNetconfSessionPeerIPAddress, hwNetconfClientAppFeatureName
// Description: Failed to deliver configurations to a peer device.
trapMap["1.3.6.1.4.1.2011.5.25.217.2.7"] = [
    name: "hwNetconfClientConfigFailed",
    fields: ["hwNetconfClientPeerName", "hwNetconfSessionInetAddrType", "hwNetconfSessionPeerIPAddress", "hwNetconfClientAppFeatureName"],
    fieldOids: ["hwNetconfClientPeerName": "1.3.6.1.4.1.2011.5.25.217.1.8", "hwNetconfSessionInetAddrType": "1.3.6.1.4.1.2011.5.25.217.1.4", "hwNetconfSessionPeerIPAddress": "1.3.6.1.4.1.2011.5.25.217.1.5", "hwNetconfClientAppFeatureName": "1.3.6.1.4.1.2011.5.25.217.1.9"]
]

// --- hwNetconfClientConfigSynchronizedSuccess (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.217.2.8
// Fields: hwNetconfClientPeerName, hwNetconfSessionInetAddrType, hwNetconfSessionPeerIPAddress, hwNetconfClientAppFeatureName
// Description: Successfully synchronized configurations to a peer device.
trapMap["1.3.6.1.4.1.2011.5.25.217.2.8"] = [
    name: "hwNetconfClientConfigSynchronizedSuccess",
    fields: ["hwNetconfClientPeerName", "hwNetconfSessionInetAddrType", "hwNetconfSessionPeerIPAddress", "hwNetconfClientAppFeatureName"],
    fieldOids: ["hwNetconfClientPeerName": "1.3.6.1.4.1.2011.5.25.217.1.8", "hwNetconfSessionInetAddrType": "1.3.6.1.4.1.2011.5.25.217.1.4", "hwNetconfSessionPeerIPAddress": "1.3.6.1.4.1.2011.5.25.217.1.5", "hwNetconfClientAppFeatureName": "1.3.6.1.4.1.2011.5.25.217.1.9"]
]

// --- hwNetconfClientSyncConfigFailed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.217.2.9
// Fields: hwNetconfClientPeerName, hwNetconfSessionInetAddrType, hwNetconfSessionPeerIPAddress
// Description: Failed to synchronize configurations to a peer device.
trapMap["1.3.6.1.4.1.2011.5.25.217.2.9"] = [
    name: "hwNetconfClientSyncConfigFailed",
    fields: ["hwNetconfClientPeerName", "hwNetconfSessionInetAddrType", "hwNetconfSessionPeerIPAddress"],
    fieldOids: ["hwNetconfClientPeerName": "1.3.6.1.4.1.2011.5.25.217.1.8", "hwNetconfSessionInetAddrType": "1.3.6.1.4.1.2011.5.25.217.1.4", "hwNetconfSessionPeerIPAddress": "1.3.6.1.4.1.2011.5.25.217.1.5"]
]

// --- hwNetconfClientSyncConfigSuccess (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.217.2.10
// Fields: hwNetconfClientPeerName, hwNetconfSessionInetAddrType, hwNetconfSessionPeerIPAddress
// Description: Successfully synchronized configurations to a peer device.
trapMap["1.3.6.1.4.1.2011.5.25.217.2.10"] = [
    name: "hwNetconfClientSyncConfigSuccess",
    fields: ["hwNetconfClientPeerName", "hwNetconfSessionInetAddrType", "hwNetconfSessionPeerIPAddress"],
    fieldOids: ["hwNetconfClientPeerName": "1.3.6.1.4.1.2011.5.25.217.1.8", "hwNetconfSessionInetAddrType": "1.3.6.1.4.1.2011.5.25.217.1.4", "hwNetconfSessionPeerIPAddress": "1.3.6.1.4.1.2011.5.25.217.1.5"]
]

// --- hwNetconfClientPeerConnectionInterrupt (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.217.2.11
// Fields: hwNetconfClientPeerName, hwNetconfSessionInetAddrType, hwNetconfSessionPeerIPAddress, hwNetconfSessionUserName
// Description: The NETCONF connection with a peer device was torn down.
trapMap["1.3.6.1.4.1.2011.5.25.217.2.11"] = [
    name: "hwNetconfClientPeerConnectionInterrupt",
    fields: ["hwNetconfClientPeerName", "hwNetconfSessionInetAddrType", "hwNetconfSessionPeerIPAddress", "hwNetconfSessionUserName"],
    fieldOids: ["hwNetconfClientPeerName": "1.3.6.1.4.1.2011.5.25.217.1.8", "hwNetconfSessionInetAddrType": "1.3.6.1.4.1.2011.5.25.217.1.4", "hwNetconfSessionPeerIPAddress": "1.3.6.1.4.1.2011.5.25.217.1.5", "hwNetconfSessionUserName": "1.3.6.1.4.1.2011.5.25.217.1.10"]
]

// --- hwNetconfClientPeerConnectionResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.217.2.12
// Fields: hwNetconfClientPeerName, hwNetconfSessionInetAddrType, hwNetconfSessionPeerIPAddress, hwNetconfSessionUserName
// Description: The NETCONF connection with a peer device is resumed.
trapMap["1.3.6.1.4.1.2011.5.25.217.2.12"] = [
    name: "hwNetconfClientPeerConnectionResume",
    fields: ["hwNetconfClientPeerName", "hwNetconfSessionInetAddrType", "hwNetconfSessionPeerIPAddress", "hwNetconfSessionUserName"],
    fieldOids: ["hwNetconfClientPeerName": "1.3.6.1.4.1.2011.5.25.217.1.8", "hwNetconfSessionInetAddrType": "1.3.6.1.4.1.2011.5.25.217.1.4", "hwNetconfSessionPeerIPAddress": "1.3.6.1.4.1.2011.5.25.217.1.5", "hwNetconfSessionUserName": "1.3.6.1.4.1.2011.5.25.217.1.10"]
]

// --- hwNetconfClientPeerConnectFailed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.217.2.13
// Fields: hwNetconfClientPeerName, hwNetconfSessionInetAddrType, hwNetconfSessionPeerIPAddress, hwNetconfSessionUserName
// Description: Failed to establish NETCONF connection with a peer device.
trapMap["1.3.6.1.4.1.2011.5.25.217.2.13"] = [
    name: "hwNetconfClientPeerConnectFailed",
    fields: ["hwNetconfClientPeerName", "hwNetconfSessionInetAddrType", "hwNetconfSessionPeerIPAddress", "hwNetconfSessionUserName"],
    fieldOids: ["hwNetconfClientPeerName": "1.3.6.1.4.1.2011.5.25.217.1.8", "hwNetconfSessionInetAddrType": "1.3.6.1.4.1.2011.5.25.217.1.4", "hwNetconfSessionPeerIPAddress": "1.3.6.1.4.1.2011.5.25.217.1.5", "hwNetconfSessionUserName": "1.3.6.1.4.1.2011.5.25.217.1.10"]
]

// --- hwNetconfClientPeerConnectSuccess (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.217.2.14
// Fields: hwNetconfClientPeerName, hwNetconfSessionInetAddrType, hwNetconfSessionPeerIPAddress, hwNetconfSessionUserName
// Description: Successfully established NETCONF connection with a peer device.
trapMap["1.3.6.1.4.1.2011.5.25.217.2.14"] = [
    name: "hwNetconfClientPeerConnectSuccess",
    fields: ["hwNetconfClientPeerName", "hwNetconfSessionInetAddrType", "hwNetconfSessionPeerIPAddress", "hwNetconfSessionUserName"],
    fieldOids: ["hwNetconfClientPeerName": "1.3.6.1.4.1.2011.5.25.217.1.8", "hwNetconfSessionInetAddrType": "1.3.6.1.4.1.2011.5.25.217.1.4", "hwNetconfSessionPeerIPAddress": "1.3.6.1.4.1.2011.5.25.217.1.5", "hwNetconfSessionUserName": "1.3.6.1.4.1.2011.5.25.217.1.10"]
]

// --- hwNetconfServerSessionStart (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.217.2.15
// Fields: hwNetconfSessionUserName, hwNetconfSessionId, hwNetconfSessionPeerIPAddress, hwNetconfSessionVpnName
// Description: Generated when a NETCONF server detects that a NETCONF session has started. A server MAY generate this event for non-NETCONF management sessions. Indicates the identity of the user that started the se...
trapMap["1.3.6.1.4.1.2011.5.25.217.2.15"] = [
    name: "hwNetconfServerSessionStart",
    fields: ["hwNetconfSessionUserName", "hwNetconfSessionId", "hwNetconfSessionPeerIPAddress", "hwNetconfSessionVpnName"],
    fieldOids: ["hwNetconfSessionUserName": "1.3.6.1.4.1.2011.5.25.217.1.10", "hwNetconfSessionId": "1.3.6.1.4.1.2011.5.25.217.1.11", "hwNetconfSessionPeerIPAddress": "1.3.6.1.4.1.2011.5.25.217.1.5", "hwNetconfSessionVpnName": "1.3.6.1.4.1.2011.5.25.217.1.6"]
]

// --- hwNetconfServerSessionEnd (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.217.2.16
// Fields: hwNetconfSessionUserName, hwNetconfSessionId, hwNetconfSessionPeerIPAddress, hwNetconfKilledBySessionId, hwNetconfSessionTerminationReason, hwNetconfSessionVpnName
// Description: Generated when a NETCONF server detects that a NETCONF session has terminated. A server MAY optionally generate this event for non-NETCONF management sessions. Indicates the identity of the user that ...
trapMap["1.3.6.1.4.1.2011.5.25.217.2.16"] = [
    name: "hwNetconfServerSessionEnd",
    fields: ["hwNetconfSessionUserName", "hwNetconfSessionId", "hwNetconfSessionPeerIPAddress", "hwNetconfKilledBySessionId", "hwNetconfSessionTerminationReason", "hwNetconfSessionVpnName"],
    fieldOids: ["hwNetconfSessionUserName": "1.3.6.1.4.1.2011.5.25.217.1.10", "hwNetconfSessionId": "1.3.6.1.4.1.2011.5.25.217.1.11", "hwNetconfSessionPeerIPAddress": "1.3.6.1.4.1.2011.5.25.217.1.5", "hwNetconfKilledBySessionId": "1.3.6.1.4.1.2011.5.25.217.1.12", "hwNetconfSessionTerminationReason": "1.3.6.1.4.1.2011.5.25.217.1.13", "hwNetconfSessionVpnName": "1.3.6.1.4.1.2011.5.25.217.1.6"]
]

// --- hwNetconfMdaResourceChange (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.217.2.17
// Fields: hwNetconfMdaResourceType
// Description: The mda resource files changed.
trapMap["1.3.6.1.4.1.2011.5.25.217.2.17"] = [
    name: "hwNetconfMdaResourceChange",
    fields: ["hwNetconfMdaResourceType"],
    fieldOids: ["hwNetconfMdaResourceType": "1.3.6.1.4.1.2011.5.25.217.1.14"]
]

// ===== Parsing logic =====

// Set to true to enable diagnostic logging for this MIB parser
DEBUG = false

LOG_PREFIX = "[HUAWEI-NETCONF-MIB]"
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
