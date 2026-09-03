/**
 * Auto-generated from HUAWEI-LLDP-MIB.mib
 * Generated: 2026-08-24T18:28:30.239954300
 * Traps/Notifications (14): hwLldpEnabled, hwLldpDisabled, hwLldpLocSysCapSupportedChange, hwLldpLocSysCapEnabledChange, hwLldpLocManIPAddrChange, hwLldpMdnRemTablesChange, hwLldpRateExcessive, hwLldpInterfaceRemTablesChange, hwLldpDdpNotifyDeviceAuthenTrap, hwLldpInterfaceParaChange, hwLldpMdnInterfaceRemTablesChange, hwLldpInterfaceNeighborChange, hwlldpNeighborUnexpectedAlarm, hwlldpNeighborUnexpectedResume
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

// --- hwLldpEnabled (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.134.2.1
// Description: Notify the NMS that the LLDP is globally enabled. This alarm is not restricted by the alarm delay.
trapMap["1.3.6.1.4.1.2011.5.25.134.2.1"] = [
    name: "hwLldpEnabled",
    fields: [],
    fieldOids: []
]

// --- hwLldpDisabled (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.134.2.2
// Description: Notify the NMS that the LLDP is globally disabled. This alarm is not restricted by the alarm delay.
trapMap["1.3.6.1.4.1.2011.5.25.134.2.2"] = [
    name: "hwLldpDisabled",
    fields: [],
    fieldOids: []
]

// --- hwLldpLocSysCapSupportedChange (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.134.2.3
// Fields: lldpLocSysCapSupported
// Description: Alarm on the change of capabilities supported of a local device.
trapMap["1.3.6.1.4.1.2011.5.25.134.2.3"] = [
    name: "hwLldpLocSysCapSupportedChange",
    fields: ["lldpLocSysCapSupported"],
    fieldOids: ["lldpLocSysCapSupported": "1.0.8802.1.1.2.1.3.5"]
]

// --- hwLldpLocSysCapEnabledChange (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.134.2.4
// Fields: lldpLocSysCapEnabled
// Description: Alarm on the change of capabilities enabled of a local device.
trapMap["1.3.6.1.4.1.2011.5.25.134.2.4"] = [
    name: "hwLldpLocSysCapEnabledChange",
    fields: ["lldpLocSysCapEnabled"],
    fieldOids: ["lldpLocSysCapEnabled": "1.0.8802.1.1.2.1.3.6"]
]

// --- hwLldpLocManIPAddrChange (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.134.2.5
// Fields: hwLldpLocManIPAddr
// Description: Alarm on the change of management IP address of a local device.
trapMap["1.3.6.1.4.1.2011.5.25.134.2.5"] = [
    name: "hwLldpLocManIPAddrChange",
    fields: ["hwLldpLocManIPAddr"],
    fieldOids: ["hwLldpLocManIPAddr": "1.3.6.1.4.1.2011.5.25.134.1.1.2"]
]

// --- hwLldpMdnRemTablesChange (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.134.2.6
// Description: Notify the NMS that the MacAddress discovery neighbor is changed.
trapMap["1.3.6.1.4.1.2011.5.25.134.2.6"] = [
    name: "hwLldpMdnRemTablesChange",
    fields: [],
    fieldOids: []
]

// --- hwLldpRateExcessive (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.134.2.7
// Fields: hwLldpTrapIfName
// Description: Notify the NMS that the received PDU rate has exceeded the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.134.2.7"] = [
    name: "hwLldpRateExcessive",
    fields: ["hwLldpTrapIfName"],
    fieldOids: ["hwLldpTrapIfName": "1.3.6.1.4.1.2011.5.25.134.1.51.1"]
]

// --- hwLldpInterfaceRemTablesChange (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.134.2.8
// Fields: hwLldpRemTablesChangeType, hwLldpInterfaceRemAdds, hwLldpInterfaceRemDeletes
// Description: Notify the NMS that the LLDP neighbor information of the interface was changed.
trapMap["1.3.6.1.4.1.2011.5.25.134.2.8"] = [
    name: "hwLldpInterfaceRemTablesChange",
    fields: ["hwLldpRemTablesChangeType", "hwLldpInterfaceRemAdds", "hwLldpInterfaceRemDeletes"],
    fieldOids: ["hwLldpRemTablesChangeType": "1.3.6.1.4.1.2011.5.25.134.1.3.1.1.2", "hwLldpInterfaceRemAdds": "1.3.6.1.4.1.2011.5.25.134.1.3.1.1.3", "hwLldpInterfaceRemDeletes": "1.3.6.1.4.1.2011.5.25.134.1.3.1.1.4"]
]

// --- hwLldpDdpNotifyDeviceAuthenTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.134.2.9
// Fields: hwLldpDdpTrapLocalSN, hwLldpDdpTrapLocalIfindex, hwLldpDdpTrapLocalIP, hwLldpDdpTrapLocalMAC, hwLldpDdpTrapNbrSN, hwLldpDdpTrapNbrIfindex, hwLldpDdpTrapNbrIP, hwLldpDdpTrapNbrMAC
// Description: Description.
trapMap["1.3.6.1.4.1.2011.5.25.134.2.9"] = [
    name: "hwLldpDdpNotifyDeviceAuthenTrap",
    fields: ["hwLldpDdpTrapLocalSN", "hwLldpDdpTrapLocalIfindex", "hwLldpDdpTrapLocalIP", "hwLldpDdpTrapLocalMAC", "hwLldpDdpTrapNbrSN", "hwLldpDdpTrapNbrIfindex", "hwLldpDdpTrapNbrIP", "hwLldpDdpTrapNbrMAC"],
    fieldOids: ["hwLldpDdpTrapLocalSN": "1.3.6.1.4.1.2011.5.25.134.1.52.1", "hwLldpDdpTrapLocalIfindex": "1.3.6.1.4.1.2011.5.25.134.1.52.2", "hwLldpDdpTrapLocalIP": "1.3.6.1.4.1.2011.5.25.134.1.52.3", "hwLldpDdpTrapLocalMAC": "1.3.6.1.4.1.2011.5.25.134.1.52.4", "hwLldpDdpTrapNbrSN": "1.3.6.1.4.1.2011.5.25.134.1.52.5", "hwLldpDdpTrapNbrIfindex": "1.3.6.1.4.1.2011.5.25.134.1.52.6", "hwLldpDdpTrapNbrIP": "1.3.6.1.4.1.2011.5.25.134.1.52.7", "hwLldpDdpTrapNbrMAC": "1.3.6.1.4.1.2011.5.25.134.1.52.8"]
]

// --- hwLldpInterfaceParaChange (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.134.2.10
// Fields: hwLldpParaTrapLocPortId, hwLldpParaTrapPeerPortId, hwLldpParaTrapLocStatus, hwLldpParaTrapLocChassisId, hwLldpParaTrapLocTTL, hwLldpParaTrapLocMngIp, hwLldpParaTrapPeerChassisId, hwLldpParaTrapPeerPortDesc, hwLldpParaTrapPeerSysName, hwLldpParaTrapPeerSysDesc, hwLldpParaTrapPeerSysCap, hwLldpParaTrapPeerMngIp
// Description: Notify the NMS that the LLDP parament of the interface was changed.
trapMap["1.3.6.1.4.1.2011.5.25.134.2.10"] = [
    name: "hwLldpInterfaceParaChange",
    fields: ["hwLldpParaTrapLocPortId", "hwLldpParaTrapPeerPortId", "hwLldpParaTrapLocStatus", "hwLldpParaTrapLocChassisId", "hwLldpParaTrapLocTTL", "hwLldpParaTrapLocMngIp", "hwLldpParaTrapPeerChassisId", "hwLldpParaTrapPeerPortDesc", "hwLldpParaTrapPeerSysName", "hwLldpParaTrapPeerSysDesc", "hwLldpParaTrapPeerSysCap", "hwLldpParaTrapPeerMngIp"],
    fieldOids: ["hwLldpParaTrapLocPortId": "1.3.6.1.4.1.2011.5.25.134.1.54.1", "hwLldpParaTrapPeerPortId": "1.3.6.1.4.1.2011.5.25.134.1.54.2", "hwLldpParaTrapLocStatus": "1.3.6.1.4.1.2011.5.25.134.1.54.3", "hwLldpParaTrapLocChassisId": "1.3.6.1.4.1.2011.5.25.134.1.54.4", "hwLldpParaTrapLocTTL": "1.3.6.1.4.1.2011.5.25.134.1.54.5", "hwLldpParaTrapLocMngIp": "1.3.6.1.4.1.2011.5.25.134.1.54.6", "hwLldpParaTrapPeerChassisId": "1.3.6.1.4.1.2011.5.25.134.1.54.7", "hwLldpParaTrapPeerPortDesc": "1.3.6.1.4.1.2011.5.25.134.1.54.8", "hwLldpParaTrapPeerSysName": "1.3.6.1.4.1.2011.5.25.134.1.54.9", "hwLldpParaTrapPeerSysDesc": "1.3.6.1.4.1.2011.5.25.134.1.54.10", "hwLldpParaTrapPeerSysCap": "1.3.6.1.4.1.2011.5.25.134.1.54.11", "hwLldpParaTrapPeerMngIp": "1.3.6.1.4.1.2011.5.25.134.1.54.12"]
]

// --- hwLldpMdnInterfaceRemTablesChange (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.134.2.11
// Fields: hwLldpMdnInterfaceRemChangeType, hwLldpMdnInterfaceRemIndex, hwLldpMdnInterfaceRemDeviceId, hwLldpMdnInterfaceRemInterface, hwLldpMdnInterfaceRemMacAddr
// Description: Notify the NMS that the LLDP MDN neighbor information of the interface was changed.
trapMap["1.3.6.1.4.1.2011.5.25.134.2.11"] = [
    name: "hwLldpMdnInterfaceRemTablesChange",
    fields: ["hwLldpMdnInterfaceRemChangeType", "hwLldpMdnInterfaceRemIndex", "hwLldpMdnInterfaceRemDeviceId", "hwLldpMdnInterfaceRemInterface", "hwLldpMdnInterfaceRemMacAddr"],
    fieldOids: ["hwLldpMdnInterfaceRemChangeType": "1.3.6.1.4.1.2011.5.25.134.1.4.1.1.2", "hwLldpMdnInterfaceRemIndex": "1.3.6.1.4.1.2011.5.25.134.1.4.1.1.3", "hwLldpMdnInterfaceRemDeviceId": "1.3.6.1.4.1.2011.5.25.134.1.4.1.1.4", "hwLldpMdnInterfaceRemInterface": "1.3.6.1.4.1.2011.5.25.134.1.4.1.1.5", "hwLldpMdnInterfaceRemMacAddr": "1.3.6.1.4.1.2011.5.25.134.1.4.1.1.6"]
]

// --- hwLldpInterfaceNeighborChange (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.134.2.12
// Fields: hwLldpInterfaceNeiIndex, hwLldpInterfaceNeiChangeType, hwLldpInterfaceNeiChassisType, hwLldpInterfaceNeiChassisId, hwLldpInterfaceNeiPortIdType, hwLldpInterfaceNeiPortId, hwLldpInterfaceNeiSysName, hwLldpInterfaceNeiSysDescription, hwLldpInterfaceNeiSysCapSup, hwLldpInterfaceNeiSysCapEnabled, hwLldpInterfaceNeiMgtAddrType, hwLldpInterfaceNeiMgtAddr, hwLldpInterfaceNeiManufacturerName, hwLldpInterfaceNeiModelName
// Description: Notify the NMS that the LLDP neighbor information of the interface was changed.
trapMap["1.3.6.1.4.1.2011.5.25.134.2.12"] = [
    name: "hwLldpInterfaceNeighborChange",
    fields: ["hwLldpInterfaceNeiIndex", "hwLldpInterfaceNeiChangeType", "hwLldpInterfaceNeiChassisType", "hwLldpInterfaceNeiChassisId", "hwLldpInterfaceNeiPortIdType", "hwLldpInterfaceNeiPortId", "hwLldpInterfaceNeiSysName", "hwLldpInterfaceNeiSysDescription", "hwLldpInterfaceNeiSysCapSup", "hwLldpInterfaceNeiSysCapEnabled", "hwLldpInterfaceNeiMgtAddrType", "hwLldpInterfaceNeiMgtAddr", "hwLldpInterfaceNeiManufacturerName", "hwLldpInterfaceNeiModelName"],
    fieldOids: ["hwLldpInterfaceNeiIndex": "1.3.6.1.4.1.2011.5.25.134.1.5.1.1.1", "hwLldpInterfaceNeiChangeType": "1.3.6.1.4.1.2011.5.25.134.1.5.1.1.2", "hwLldpInterfaceNeiChassisType": "1.3.6.1.4.1.2011.5.25.134.1.5.1.1.4", "hwLldpInterfaceNeiChassisId": "1.3.6.1.4.1.2011.5.25.134.1.5.1.1.5", "hwLldpInterfaceNeiPortIdType": "1.3.6.1.4.1.2011.5.25.134.1.5.1.1.6", "hwLldpInterfaceNeiPortId": "1.3.6.1.4.1.2011.5.25.134.1.5.1.1.7", "hwLldpInterfaceNeiSysName": "1.3.6.1.4.1.2011.5.25.134.1.5.1.1.8", "hwLldpInterfaceNeiSysDescription": "1.3.6.1.4.1.2011.5.25.134.1.5.1.1.9", "hwLldpInterfaceNeiSysCapSup": "1.3.6.1.4.1.2011.5.25.134.1.5.1.1.10", "hwLldpInterfaceNeiSysCapEnabled": "1.3.6.1.4.1.2011.5.25.134.1.5.1.1.11", "hwLldpInterfaceNeiMgtAddrType": "1.3.6.1.4.1.2011.5.25.134.1.5.1.1.12", "hwLldpInterfaceNeiMgtAddr": "1.3.6.1.4.1.2011.5.25.134.1.5.1.1.13", "hwLldpInterfaceNeiManufacturerName": "1.3.6.1.4.1.2011.5.25.134.1.5.1.1.14", "hwLldpInterfaceNeiModelName": "1.3.6.1.4.1.2011.5.25.134.1.5.1.1.15"]
]

// --- hwlldpNeighborUnexpectedAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.134.2.13
// Fields: hwLldpInterfaceLocalInterface, hwLldpInterfaceNeiChassisType, hwLldpInterfaceNeiChassisId, hwLldpInterfaceNeiPortIdType, hwLldpInterfaceNeiPortId, hwLldpInterfaceNeiReason
// Description: Notify the NMS that the LLDP neighbor information of the interface was unexpected.
trapMap["1.3.6.1.4.1.2011.5.25.134.2.13"] = [
    name: "hwlldpNeighborUnexpectedAlarm",
    fields: ["hwLldpInterfaceLocalInterface", "hwLldpInterfaceNeiChassisType", "hwLldpInterfaceNeiChassisId", "hwLldpInterfaceNeiPortIdType", "hwLldpInterfaceNeiPortId", "hwLldpInterfaceNeiReason"],
    fieldOids: ["hwLldpInterfaceLocalInterface": "1.3.6.1.4.1.2011.5.25.134.1.5.1.1.17", "hwLldpInterfaceNeiChassisType": "1.3.6.1.4.1.2011.5.25.134.1.5.1.1.4", "hwLldpInterfaceNeiChassisId": "1.3.6.1.4.1.2011.5.25.134.1.5.1.1.5", "hwLldpInterfaceNeiPortIdType": "1.3.6.1.4.1.2011.5.25.134.1.5.1.1.6", "hwLldpInterfaceNeiPortId": "1.3.6.1.4.1.2011.5.25.134.1.5.1.1.7", "hwLldpInterfaceNeiReason": "1.3.6.1.4.1.2011.5.25.134.1.5.1.1.16"]
]

// --- hwlldpNeighborUnexpectedResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.134.2.14
// Fields: hwLldpInterfaceLocalInterface, hwLldpInterfaceNeiChassisType, hwLldpInterfaceNeiChassisId, hwLldpInterfaceNeiPortIdType, hwLldpInterfaceNeiPortId, hwLldpInterfaceNeiReason
// Description: Notify the NMS that the unexpected LLDP neighbor information of the interface was resume.
trapMap["1.3.6.1.4.1.2011.5.25.134.2.14"] = [
    name: "hwlldpNeighborUnexpectedResume",
    fields: ["hwLldpInterfaceLocalInterface", "hwLldpInterfaceNeiChassisType", "hwLldpInterfaceNeiChassisId", "hwLldpInterfaceNeiPortIdType", "hwLldpInterfaceNeiPortId", "hwLldpInterfaceNeiReason"],
    fieldOids: ["hwLldpInterfaceLocalInterface": "1.3.6.1.4.1.2011.5.25.134.1.5.1.1.17", "hwLldpInterfaceNeiChassisType": "1.3.6.1.4.1.2011.5.25.134.1.5.1.1.4", "hwLldpInterfaceNeiChassisId": "1.3.6.1.4.1.2011.5.25.134.1.5.1.1.5", "hwLldpInterfaceNeiPortIdType": "1.3.6.1.4.1.2011.5.25.134.1.5.1.1.6", "hwLldpInterfaceNeiPortId": "1.3.6.1.4.1.2011.5.25.134.1.5.1.1.7", "hwLldpInterfaceNeiReason": "1.3.6.1.4.1.2011.5.25.134.1.5.1.1.16"]
]

// ===== Parsing logic =====

// Set to true to enable diagnostic logging for this MIB parser
DEBUG = false

LOG_PREFIX = "[HUAWEI-LLDP-MIB]"
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
