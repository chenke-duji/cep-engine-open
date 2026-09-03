/**
 * Auto-generated from HUAWEI-BRAS-RADIUS-MIB.mib
 * Generated: 2026-08-24T18:28:29.091310100
 * Traps/Notifications (20): hwRadiusAuthServerUp, hwRadiusAuthServerDown, hwRadiusAcctServerUp, hwRadiusAcctServerDown, hwRadiusDiscardCachePacket, hwRadiusCachePacketThresholdAlarm, hwRadiusCachePacketThresholdResume, hwRadiusAcctServerUpCp, hwRadiusAcctServerDownCp, hwRadiusAuthServerUpCp, hwRadiusAuthServerDownCp, hwRadiusCachePacketThresholdCpAlarm, hwRadiusCachePacketThresholdCpResume, hwRadiusServerGroupDown, hwRadiusServerGroupUp, hwRadiusServerGroupDownCp, hwRadiusServerGroupUpCp, hwRadiusAuthServerForceUp, hwRadiusAcctServerForceUp, hwCURadiusDiscardCachePacket
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

// --- hwRadiusAuthServerUp (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.40.15.2.2.1.1
// Fields: hwStateChangeServerIp, hwStateChangeServerVrf, hwStateChangeServerPort
// Description: This object indicates that the RADIUS authentication server is Up.
trapMap["1.3.6.1.4.1.2011.5.25.40.15.2.2.1.1"] = [
    name: "hwRadiusAuthServerUp",
    fields: ["hwStateChangeServerIp", "hwStateChangeServerVrf", "hwStateChangeServerPort"],
    fieldOids: ["hwStateChangeServerIp": "1.3.6.1.4.1.2011.5.25.40.15.2.1.1", "hwStateChangeServerVrf": "1.3.6.1.4.1.2011.5.25.40.15.2.1.2", "hwStateChangeServerPort": "1.3.6.1.4.1.2011.5.25.40.15.2.1.3"]
]

// --- hwRadiusAuthServerDown (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.40.15.2.2.1.2
// Fields: hwStateChangeServerIp, hwStateChangeServerVrf, hwStateChangeServerPort
// Description: This object indicates that the RADIUS authentication server is Down.
trapMap["1.3.6.1.4.1.2011.5.25.40.15.2.2.1.2"] = [
    name: "hwRadiusAuthServerDown",
    fields: ["hwStateChangeServerIp", "hwStateChangeServerVrf", "hwStateChangeServerPort"],
    fieldOids: ["hwStateChangeServerIp": "1.3.6.1.4.1.2011.5.25.40.15.2.1.1", "hwStateChangeServerVrf": "1.3.6.1.4.1.2011.5.25.40.15.2.1.2", "hwStateChangeServerPort": "1.3.6.1.4.1.2011.5.25.40.15.2.1.3"]
]

// --- hwRadiusAcctServerUp (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.40.15.2.2.1.3
// Fields: hwStateChangeServerIp, hwStateChangeServerVrf, hwStateChangeServerPort
// Description: This object indicates that the RADIUS accounting server is Up.
trapMap["1.3.6.1.4.1.2011.5.25.40.15.2.2.1.3"] = [
    name: "hwRadiusAcctServerUp",
    fields: ["hwStateChangeServerIp", "hwStateChangeServerVrf", "hwStateChangeServerPort"],
    fieldOids: ["hwStateChangeServerIp": "1.3.6.1.4.1.2011.5.25.40.15.2.1.1", "hwStateChangeServerVrf": "1.3.6.1.4.1.2011.5.25.40.15.2.1.2", "hwStateChangeServerPort": "1.3.6.1.4.1.2011.5.25.40.15.2.1.3"]
]

// --- hwRadiusAcctServerDown (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.40.15.2.2.1.4
// Fields: hwStateChangeServerIp, hwStateChangeServerVrf, hwStateChangeServerPort
// Description: This object indicates that the RADIUS accounting server is Down.
trapMap["1.3.6.1.4.1.2011.5.25.40.15.2.2.1.4"] = [
    name: "hwRadiusAcctServerDown",
    fields: ["hwStateChangeServerIp", "hwStateChangeServerVrf", "hwStateChangeServerPort"],
    fieldOids: ["hwStateChangeServerIp": "1.3.6.1.4.1.2011.5.25.40.15.2.1.1", "hwStateChangeServerVrf": "1.3.6.1.4.1.2011.5.25.40.15.2.1.2", "hwStateChangeServerPort": "1.3.6.1.4.1.2011.5.25.40.15.2.1.3"]
]

// --- hwRadiusDiscardCachePacket (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.40.15.2.2.1.5
// Fields: hwRadiusMemoryUsage, hwRadiusThreshold, hwRadiusCachePackets
// Description: This object indicates that the memory usage reaches the threshold and the device discards all packets of the earliest user from the cache queue.
trapMap["1.3.6.1.4.1.2011.5.25.40.15.2.2.1.5"] = [
    name: "hwRadiusDiscardCachePacket",
    fields: ["hwRadiusMemoryUsage", "hwRadiusThreshold", "hwRadiusCachePackets"],
    fieldOids: ["hwRadiusMemoryUsage": "1.3.6.1.4.1.2011.5.25.40.15.2.1.4", "hwRadiusThreshold": "1.3.6.1.4.1.2011.5.25.40.15.2.1.5", "hwRadiusCachePackets": "1.3.6.1.4.1.2011.5.25.40.15.2.1.6"]
]

// --- hwRadiusCachePacketThresholdAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.40.15.2.2.1.6
// Fields: hwRadiusMaxCachePackets, hwRadiusThreshold
// Description: This object indicates that the number of cached packets reaches the upper alarm threshold.
trapMap["1.3.6.1.4.1.2011.5.25.40.15.2.2.1.6"] = [
    name: "hwRadiusCachePacketThresholdAlarm",
    fields: ["hwRadiusMaxCachePackets", "hwRadiusThreshold"],
    fieldOids: ["hwRadiusMaxCachePackets": "1.3.6.1.4.1.2011.5.25.40.15.2.1.7", "hwRadiusThreshold": "1.3.6.1.4.1.2011.5.25.40.15.2.1.5"]
]

// --- hwRadiusCachePacketThresholdResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.40.15.2.2.1.7
// Fields: hwRadiusMaxCachePackets, hwRadiusThreshold
// Description: This object indicates that the number of cached packets falls below the lower alarm threshold.
trapMap["1.3.6.1.4.1.2011.5.25.40.15.2.2.1.7"] = [
    name: "hwRadiusCachePacketThresholdResume",
    fields: ["hwRadiusMaxCachePackets", "hwRadiusThreshold"],
    fieldOids: ["hwRadiusMaxCachePackets": "1.3.6.1.4.1.2011.5.25.40.15.2.1.7", "hwRadiusThreshold": "1.3.6.1.4.1.2011.5.25.40.15.2.1.5"]
]

// --- hwRadiusAcctServerUpCp (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.40.15.2.2.1.8
// Fields: hwStateChangeServerCpIp, hwStateChangeServerCpVrf, hwStateChangeServerCpPort, hwStateChangeServerCpInstanceId
// Description: This object indicates that the RADIUS accounting server is Up.
trapMap["1.3.6.1.4.1.2011.5.25.40.15.2.2.1.8"] = [
    name: "hwRadiusAcctServerUpCp",
    fields: ["hwStateChangeServerCpIp", "hwStateChangeServerCpVrf", "hwStateChangeServerCpPort", "hwStateChangeServerCpInstanceId"],
    fieldOids: ["hwStateChangeServerCpIp": "1.3.6.1.4.1.2011.5.25.40.15.2.1.8", "hwStateChangeServerCpVrf": "1.3.6.1.4.1.2011.5.25.40.15.2.1.9", "hwStateChangeServerCpPort": "1.3.6.1.4.1.2011.5.25.40.15.2.1.10", "hwStateChangeServerCpInstanceId": "1.3.6.1.4.1.2011.5.25.40.15.2.1.11"]
]

// --- hwRadiusAcctServerDownCp (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.40.15.2.2.1.9
// Fields: hwStateChangeServerCpIp, hwStateChangeServerCpVrf, hwStateChangeServerCpPort, hwStateChangeServerCpInstanceId
// Description: This object indicates that the RADIUS accounting server is Down.
trapMap["1.3.6.1.4.1.2011.5.25.40.15.2.2.1.9"] = [
    name: "hwRadiusAcctServerDownCp",
    fields: ["hwStateChangeServerCpIp", "hwStateChangeServerCpVrf", "hwStateChangeServerCpPort", "hwStateChangeServerCpInstanceId"],
    fieldOids: ["hwStateChangeServerCpIp": "1.3.6.1.4.1.2011.5.25.40.15.2.1.8", "hwStateChangeServerCpVrf": "1.3.6.1.4.1.2011.5.25.40.15.2.1.9", "hwStateChangeServerCpPort": "1.3.6.1.4.1.2011.5.25.40.15.2.1.10", "hwStateChangeServerCpInstanceId": "1.3.6.1.4.1.2011.5.25.40.15.2.1.11"]
]

// --- hwRadiusAuthServerUpCp (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.40.15.2.2.1.10
// Fields: hwStateChangeServerCpIp, hwStateChangeServerCpVrf, hwStateChangeServerCpPort, hwStateChangeServerCpInstanceId
// Description: This object indicates that the RADIUS authentication server is Up.
trapMap["1.3.6.1.4.1.2011.5.25.40.15.2.2.1.10"] = [
    name: "hwRadiusAuthServerUpCp",
    fields: ["hwStateChangeServerCpIp", "hwStateChangeServerCpVrf", "hwStateChangeServerCpPort", "hwStateChangeServerCpInstanceId"],
    fieldOids: ["hwStateChangeServerCpIp": "1.3.6.1.4.1.2011.5.25.40.15.2.1.8", "hwStateChangeServerCpVrf": "1.3.6.1.4.1.2011.5.25.40.15.2.1.9", "hwStateChangeServerCpPort": "1.3.6.1.4.1.2011.5.25.40.15.2.1.10", "hwStateChangeServerCpInstanceId": "1.3.6.1.4.1.2011.5.25.40.15.2.1.11"]
]

// --- hwRadiusAuthServerDownCp (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.40.15.2.2.1.11
// Fields: hwStateChangeServerCpIp, hwStateChangeServerCpVrf, hwStateChangeServerCpPort, hwStateChangeServerCpInstanceId
// Description: This object indicates that the RADIUS authentication server is Down.
trapMap["1.3.6.1.4.1.2011.5.25.40.15.2.2.1.11"] = [
    name: "hwRadiusAuthServerDownCp",
    fields: ["hwStateChangeServerCpIp", "hwStateChangeServerCpVrf", "hwStateChangeServerCpPort", "hwStateChangeServerCpInstanceId"],
    fieldOids: ["hwStateChangeServerCpIp": "1.3.6.1.4.1.2011.5.25.40.15.2.1.8", "hwStateChangeServerCpVrf": "1.3.6.1.4.1.2011.5.25.40.15.2.1.9", "hwStateChangeServerCpPort": "1.3.6.1.4.1.2011.5.25.40.15.2.1.10", "hwStateChangeServerCpInstanceId": "1.3.6.1.4.1.2011.5.25.40.15.2.1.11"]
]

// --- hwRadiusCachePacketThresholdCpAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.40.15.2.2.1.12
// Fields: hwRadiusMaxCachePacketsCp, hwRadiusThresholdCp, hwRadiusInstanceIdCp
// Description: This object indicates that the number of cached packets reaches the upper alarm threshold.
trapMap["1.3.6.1.4.1.2011.5.25.40.15.2.2.1.12"] = [
    name: "hwRadiusCachePacketThresholdCpAlarm",
    fields: ["hwRadiusMaxCachePacketsCp", "hwRadiusThresholdCp", "hwRadiusInstanceIdCp"],
    fieldOids: ["hwRadiusMaxCachePacketsCp": "1.3.6.1.4.1.2011.5.25.40.15.2.1.12", "hwRadiusThresholdCp": "1.3.6.1.4.1.2011.5.25.40.15.2.1.13", "hwRadiusInstanceIdCp": "1.3.6.1.4.1.2011.5.25.40.15.2.1.14"]
]

// --- hwRadiusCachePacketThresholdCpResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.40.15.2.2.1.13
// Fields: hwRadiusMaxCachePacketsCp, hwRadiusThresholdCp, hwRadiusInstanceIdCp
// Description: This object indicates that the number of cached packets falls below the lower alarm threshold.
trapMap["1.3.6.1.4.1.2011.5.25.40.15.2.2.1.13"] = [
    name: "hwRadiusCachePacketThresholdCpResume",
    fields: ["hwRadiusMaxCachePacketsCp", "hwRadiusThresholdCp", "hwRadiusInstanceIdCp"],
    fieldOids: ["hwRadiusMaxCachePacketsCp": "1.3.6.1.4.1.2011.5.25.40.15.2.1.12", "hwRadiusThresholdCp": "1.3.6.1.4.1.2011.5.25.40.15.2.1.13", "hwRadiusInstanceIdCp": "1.3.6.1.4.1.2011.5.25.40.15.2.1.14"]
]

// --- hwRadiusServerGroupDown (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.40.15.2.2.1.14
// Fields: hwRadiusGroupName, hwRadiusServerTypeAlarm
// Description: This object indicates that all the configured servers in the RADIUS server group are down.
trapMap["1.3.6.1.4.1.2011.5.25.40.15.2.2.1.14"] = [
    name: "hwRadiusServerGroupDown",
    fields: ["hwRadiusGroupName", "hwRadiusServerTypeAlarm"],
    fieldOids: ["hwRadiusGroupName": "1.3.6.1.4.1.2011.5.25.40.15.1.1.1.1", "hwRadiusServerTypeAlarm": "1.3.6.1.4.1.2011.5.25.40.15.2.1.15"]
]

// --- hwRadiusServerGroupUp (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.40.15.2.2.1.15
// Fields: hwRadiusGroupName, hwRadiusServerTypeAlarm
// Description: This object indicates that one of the configured servers in the RADIUS server group is up.
trapMap["1.3.6.1.4.1.2011.5.25.40.15.2.2.1.15"] = [
    name: "hwRadiusServerGroupUp",
    fields: ["hwRadiusGroupName", "hwRadiusServerTypeAlarm"],
    fieldOids: ["hwRadiusGroupName": "1.3.6.1.4.1.2011.5.25.40.15.1.1.1.1", "hwRadiusServerTypeAlarm": "1.3.6.1.4.1.2011.5.25.40.15.2.1.15"]
]

// --- hwRadiusServerGroupDownCp (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.40.15.2.2.1.16
// Fields: hwRadiusUpmngInstance, hwRadiusGroupName, hwRadiusServerTypeAlarm
// Description: This object indicates that all the configured servers in the RADIUS server group are down in cp.
trapMap["1.3.6.1.4.1.2011.5.25.40.15.2.2.1.16"] = [
    name: "hwRadiusServerGroupDownCp",
    fields: ["hwRadiusUpmngInstance", "hwRadiusGroupName", "hwRadiusServerTypeAlarm"],
    fieldOids: ["hwRadiusUpmngInstance": "1.3.6.1.4.1.2011.5.25.40.15.2.1.16", "hwRadiusGroupName": "1.3.6.1.4.1.2011.5.25.40.15.1.1.1.1", "hwRadiusServerTypeAlarm": "1.3.6.1.4.1.2011.5.25.40.15.2.1.15"]
]

// --- hwRadiusServerGroupUpCp (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.40.15.2.2.1.17
// Fields: hwRadiusUpmngInstance, hwRadiusGroupName, hwRadiusServerTypeAlarm
// Description: This object indicates that one of the configured servers in the RADIUS server group is up in cp.
trapMap["1.3.6.1.4.1.2011.5.25.40.15.2.2.1.17"] = [
    name: "hwRadiusServerGroupUpCp",
    fields: ["hwRadiusUpmngInstance", "hwRadiusGroupName", "hwRadiusServerTypeAlarm"],
    fieldOids: ["hwRadiusUpmngInstance": "1.3.6.1.4.1.2011.5.25.40.15.2.1.16", "hwRadiusGroupName": "1.3.6.1.4.1.2011.5.25.40.15.1.1.1.1", "hwRadiusServerTypeAlarm": "1.3.6.1.4.1.2011.5.25.40.15.2.1.15"]
]

// --- hwRadiusAuthServerForceUp (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.40.15.2.2.1.18
// Fields: hwStateChangeServerIp, hwStateChangeServerVrf, hwStateChangeServerPort
// Description: This object indicates that the RADIUS authentication server is Force-Up.
trapMap["1.3.6.1.4.1.2011.5.25.40.15.2.2.1.18"] = [
    name: "hwRadiusAuthServerForceUp",
    fields: ["hwStateChangeServerIp", "hwStateChangeServerVrf", "hwStateChangeServerPort"],
    fieldOids: ["hwStateChangeServerIp": "1.3.6.1.4.1.2011.5.25.40.15.2.1.1", "hwStateChangeServerVrf": "1.3.6.1.4.1.2011.5.25.40.15.2.1.2", "hwStateChangeServerPort": "1.3.6.1.4.1.2011.5.25.40.15.2.1.3"]
]

// --- hwRadiusAcctServerForceUp (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.40.15.2.2.1.19
// Fields: hwStateChangeServerIp, hwStateChangeServerVrf, hwStateChangeServerPort
// Description: This object indicates that the RADIUS accounting server is Force-Up.
trapMap["1.3.6.1.4.1.2011.5.25.40.15.2.2.1.19"] = [
    name: "hwRadiusAcctServerForceUp",
    fields: ["hwStateChangeServerIp", "hwStateChangeServerVrf", "hwStateChangeServerPort"],
    fieldOids: ["hwStateChangeServerIp": "1.3.6.1.4.1.2011.5.25.40.15.2.1.1", "hwStateChangeServerVrf": "1.3.6.1.4.1.2011.5.25.40.15.2.1.2", "hwStateChangeServerPort": "1.3.6.1.4.1.2011.5.25.40.15.2.1.3"]
]

// --- hwCURadiusDiscardCachePacket (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.40.15.2.2.1.20
// Fields: hwRadiusUpmngInstance, hwRadiusLoadBalanceInstance, hwRadiusMemoryUsage, hwRadiusThreshold, hwRadiusCachePackets
// Description: This object indicates that the memory usage reaches the threshold and the load balance instance discards all packets of the earliest user from the cache queue.
trapMap["1.3.6.1.4.1.2011.5.25.40.15.2.2.1.20"] = [
    name: "hwCURadiusDiscardCachePacket",
    fields: ["hwRadiusUpmngInstance", "hwRadiusLoadBalanceInstance", "hwRadiusMemoryUsage", "hwRadiusThreshold", "hwRadiusCachePackets"],
    fieldOids: ["hwRadiusUpmngInstance": "1.3.6.1.4.1.2011.5.25.40.15.2.1.16", "hwRadiusLoadBalanceInstance": "1.3.6.1.4.1.2011.5.25.40.15.2.1.17", "hwRadiusMemoryUsage": "1.3.6.1.4.1.2011.5.25.40.15.2.1.4", "hwRadiusThreshold": "1.3.6.1.4.1.2011.5.25.40.15.2.1.5", "hwRadiusCachePackets": "1.3.6.1.4.1.2011.5.25.40.15.2.1.6"]
]

// ===== Parsing logic =====

// Set to true to enable diagnostic logging for this MIB parser
DEBUG = false

LOG_PREFIX = "[HUAWEI-BRAS-RADIUS-MIB]"
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
