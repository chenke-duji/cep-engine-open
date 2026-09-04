/**
 * Auto-generated from HUAWEI-IPDSLAM-L3PROTOCOL-MIB.mib
 * Generated: 2026-08-24T18:28:29.912750500
 * Traps/Notifications (9): hwIpNeighborDownloadFailTrap, hwBgpPeerEstablishedTrap, hwBgpPeerStateTransitionTrap, hwOspfNbrStateChangeTrap, hwOspfVirtNbrStateChangeTrap, hwOspfv3NbrStateChangeTrap, hwOspfv3VirtNbrStateChangeTrap, hwPimNeighborLossTrap, hwPimNeighborAddTrap
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

// --- hwIpNeighborDownloadFailTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.125.1.5.1
// Fields: hwNbIpAddress, hwNbMacAddress, hwVlanID, hwARPNum, hwIPv6NBNum, hwFrameIndex, hwSlotIndex, hwPortIndex, hwOntIndex
// Description: This notification is generated when IP Neighbors download fail.
trapMap["1.3.6.1.4.1.2011.6.125.1.5.1"] = [
    name: "hwIpNeighborDownloadFailTrap",
    fields: ["hwNbIpAddress", "hwNbMacAddress", "hwVlanID", "hwARPNum", "hwIPv6NBNum", "hwFrameIndex", "hwSlotIndex", "hwPortIndex", "hwOntIndex"],
    fieldOids: ["hwNbIpAddress": "1.3.6.1.4.1.2011.6.125.1.4.1", "hwNbMacAddress": "1.3.6.1.4.1.2011.6.125.1.4.2", "hwVlanID": "1.3.6.1.4.1.2011.5.6.1.2.1.2", "hwARPNum": "1.3.6.1.4.1.2011.6.125.1.4.3", "hwIPv6NBNum": "1.3.6.1.4.1.2011.6.125.1.4.4", "hwFrameIndex": "1.3.6.1.4.1.2011.6.3.3.1.1.1", "hwSlotIndex": "1.3.6.1.4.1.2011.6.3.3.2.1.1", "hwPortIndex": "1.3.6.1.4.1.2011.6.3.3.4.1.1", "hwOntIndex": "1.3.6.1.4.1.2011.6.3.23.1.1"]
]

// --- hwBgpPeerEstablishedTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.125.1.7.1
// Fields: hwBgpPeerInstanceId, hwBgpAfi, hwBgpSafi, hwBgpPeerType, hwBgpPeerIPAddr, hwBgpPeerLastError, hwBgpPeerState
// Description: This notification is generated when the BGP FSM was in the Established state.
trapMap["1.3.6.1.4.1.2011.6.125.1.7.1"] = [
    name: "hwBgpPeerEstablishedTrap",
    fields: ["hwBgpPeerInstanceId", "hwBgpAfi", "hwBgpSafi", "hwBgpPeerType", "hwBgpPeerIPAddr", "hwBgpPeerLastError", "hwBgpPeerState"],
    fieldOids: ["hwBgpPeerInstanceId": "1.3.6.1.4.1.2011.6.125.1.6.9", "hwBgpAfi": "1.3.6.1.4.1.2011.6.125.1.6.1", "hwBgpSafi": "1.3.6.1.4.1.2011.6.125.1.6.2", "hwBgpPeerType": "1.3.6.1.4.1.2011.6.125.1.6.5", "hwBgpPeerIPAddr": "1.3.6.1.4.1.2011.6.125.1.6.6", "hwBgpPeerLastError": "1.3.6.1.4.1.2011.6.125.1.6.4", "hwBgpPeerState": "1.3.6.1.4.1.2011.6.125.1.6.3"]
]

// --- hwBgpPeerStateTransitionTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.125.1.7.2
// Fields: hwBgpPeerInstanceId, hwBgpAfi, hwBgpSafi, hwBgpPeerType, hwBgpPeerIPAddr, hwBgpPeerIfindex, hwBgpPeerLastError, hwBgpPeerState, hwBgpPeerUnAvaiReason
// Description: This notification is generated when the BGP state machine moved from a higher numbered state, namely, Openconfirm or Established, to a lower numbered state.
trapMap["1.3.6.1.4.1.2011.6.125.1.7.2"] = [
    name: "hwBgpPeerStateTransitionTrap",
    fields: ["hwBgpPeerInstanceId", "hwBgpAfi", "hwBgpSafi", "hwBgpPeerType", "hwBgpPeerIPAddr", "hwBgpPeerIfindex", "hwBgpPeerLastError", "hwBgpPeerState", "hwBgpPeerUnAvaiReason"],
    fieldOids: ["hwBgpPeerInstanceId": "1.3.6.1.4.1.2011.6.125.1.6.9", "hwBgpAfi": "1.3.6.1.4.1.2011.6.125.1.6.1", "hwBgpSafi": "1.3.6.1.4.1.2011.6.125.1.6.2", "hwBgpPeerType": "1.3.6.1.4.1.2011.6.125.1.6.5", "hwBgpPeerIPAddr": "1.3.6.1.4.1.2011.6.125.1.6.6", "hwBgpPeerIfindex": "1.3.6.1.4.1.2011.6.125.1.6.8", "hwBgpPeerLastError": "1.3.6.1.4.1.2011.6.125.1.6.4", "hwBgpPeerState": "1.3.6.1.4.1.2011.6.125.1.6.3", "hwBgpPeerUnAvaiReason": "1.3.6.1.4.1.2011.6.125.1.6.7"]
]

// --- hwOspfNbrStateChangeTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.125.1.10.1
// Fields: hwOspfNbrIpAddr, hwOspfNbrAddressLessIndex, hwOspfProcessIdIndex, hwOspfIfAreaId, hwOspfIfindex, hwOspfIfIpAddress, hwOspfRouterId, hwOspfNbrRtrId, hwOspfNbrState, hwOspfv2NbrChgReason
// Description: This notification is generated when the status of the OSPF neighbor changed.
trapMap["1.3.6.1.4.1.2011.6.125.1.10.1"] = [
    name: "hwOspfNbrStateChangeTrap",
    fields: ["hwOspfNbrIpAddr", "hwOspfNbrAddressLessIndex", "hwOspfProcessIdIndex", "hwOspfIfAreaId", "hwOspfIfindex", "hwOspfIfIpAddress", "hwOspfRouterId", "hwOspfNbrRtrId", "hwOspfNbrState", "hwOspfv2NbrChgReason"],
    fieldOids: ["hwOspfNbrIpAddr": "1.3.6.1.4.1.2011.6.125.1.9.2", "hwOspfNbrAddressLessIndex": "1.3.6.1.4.1.2011.6.125.1.9.6", "hwOspfProcessIdIndex": "1.3.6.1.4.1.2011.6.125.1.9.9", "hwOspfIfAreaId": "1.3.6.1.4.1.2011.6.125.1.9.5", "hwOspfIfindex": "1.3.6.1.4.1.2011.6.125.1.9.12", "hwOspfIfIpAddress": "1.3.6.1.4.1.2011.6.125.1.9.4", "hwOspfRouterId": "1.3.6.1.4.1.2011.6.125.1.9.1", "hwOspfNbrRtrId": "1.3.6.1.4.1.2011.6.125.1.9.3", "hwOspfNbrState": "1.3.6.1.4.1.2011.6.125.1.9.7", "hwOspfv2NbrChgReason": "1.3.6.1.4.1.2011.6.125.1.9.8"]
]

// --- hwOspfVirtNbrStateChangeTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.125.1.10.2
// Fields: hwOspfIfAreaId, hwOspfVirtNbrRtrId, hwOspfProcessIdIndex, hwOspfRouterId, hwOspfVirtNbrState
// Description: This notification is generated when the status of the neighbor on the OSPF virtual link changed.
trapMap["1.3.6.1.4.1.2011.6.125.1.10.2"] = [
    name: "hwOspfVirtNbrStateChangeTrap",
    fields: ["hwOspfIfAreaId", "hwOspfVirtNbrRtrId", "hwOspfProcessIdIndex", "hwOspfRouterId", "hwOspfVirtNbrState"],
    fieldOids: ["hwOspfIfAreaId": "1.3.6.1.4.1.2011.6.125.1.9.5", "hwOspfVirtNbrRtrId": "1.3.6.1.4.1.2011.6.125.1.9.10", "hwOspfProcessIdIndex": "1.3.6.1.4.1.2011.6.125.1.9.9", "hwOspfRouterId": "1.3.6.1.4.1.2011.6.125.1.9.1", "hwOspfVirtNbrState": "1.3.6.1.4.1.2011.6.125.1.9.11"]
]

// --- hwOspfv3NbrStateChangeTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.125.1.12.1
// Fields: hwOspfv3IfIndex, hwOspfv3IfInstId, hwOspfv3RouterId, hwOspfv3NbrRtrId, hwOspfv3NbrState, hwOspfv3NbrStateChgReason
// Description: This notification is generated when the status of the OSPFv3 neighbor changed.
trapMap["1.3.6.1.4.1.2011.6.125.1.12.1"] = [
    name: "hwOspfv3NbrStateChangeTrap",
    fields: ["hwOspfv3IfIndex", "hwOspfv3IfInstId", "hwOspfv3RouterId", "hwOspfv3NbrRtrId", "hwOspfv3NbrState", "hwOspfv3NbrStateChgReason"],
    fieldOids: ["hwOspfv3IfIndex": "1.3.6.1.4.1.2011.6.125.1.11.1", "hwOspfv3IfInstId": "1.3.6.1.4.1.2011.6.125.1.11.2", "hwOspfv3RouterId": "1.3.6.1.4.1.2011.6.125.1.11.4", "hwOspfv3NbrRtrId": "1.3.6.1.4.1.2011.6.125.1.11.8", "hwOspfv3NbrState": "1.3.6.1.4.1.2011.6.125.1.11.5", "hwOspfv3NbrStateChgReason": "1.3.6.1.4.1.2011.6.125.1.11.6"]
]

// --- hwOspfv3VirtNbrStateChangeTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.125.1.12.2
// Fields: hwOspfv3AreaId, hwOspfv3RouterId, hwOspfv3VirtNbrRtrId, hwOspfv3VirtNbrState, hwOspfv3NbrStateChgReason
// Description: This notification is generated when the status of the OSPFv3 neighbor on the virtual link changed.
trapMap["1.3.6.1.4.1.2011.6.125.1.12.2"] = [
    name: "hwOspfv3VirtNbrStateChangeTrap",
    fields: ["hwOspfv3AreaId", "hwOspfv3RouterId", "hwOspfv3VirtNbrRtrId", "hwOspfv3VirtNbrState", "hwOspfv3NbrStateChgReason"],
    fieldOids: ["hwOspfv3AreaId": "1.3.6.1.4.1.2011.6.125.1.11.3", "hwOspfv3RouterId": "1.3.6.1.4.1.2011.6.125.1.11.4", "hwOspfv3VirtNbrRtrId": "1.3.6.1.4.1.2011.6.125.1.11.7", "hwOspfv3VirtNbrState": "1.3.6.1.4.1.2011.6.125.1.11.9", "hwOspfv3NbrStateChgReason": "1.3.6.1.4.1.2011.6.125.1.11.6"]
]

// --- hwPimNeighborLossTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.125.1.14.1
// Fields: hwPimInterfaceIndex, hwPimInterfaceAddressType, hwPimInterfaceAddress, hwPimNeighborUpTime, hwPimInstanceID, hwPimNeighborNotificationReason
// Description: This notification is generated when the PIM neighbor was lost.
trapMap["1.3.6.1.4.1.2011.6.125.1.14.1"] = [
    name: "hwPimNeighborLossTrap",
    fields: ["hwPimInterfaceIndex", "hwPimInterfaceAddressType", "hwPimInterfaceAddress", "hwPimNeighborUpTime", "hwPimInstanceID", "hwPimNeighborNotificationReason"],
    fieldOids: ["hwPimInterfaceIndex": "1.3.6.1.4.1.2011.6.125.1.13.1", "hwPimInterfaceAddressType": "1.3.6.1.4.1.2011.6.125.1.13.2", "hwPimInterfaceAddress": "1.3.6.1.4.1.2011.6.125.1.13.3", "hwPimNeighborUpTime": "1.3.6.1.4.1.2011.6.125.1.13.4", "hwPimInstanceID": "1.3.6.1.4.1.2011.6.125.1.13.5", "hwPimNeighborNotificationReason": "1.3.6.1.4.1.2011.6.125.1.13.6"]
]

// --- hwPimNeighborAddTrap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.125.1.14.2
// Fields: hwPimInterfaceIndex, hwPimInterfaceAddressType, hwPimInterfaceAddress, hwPimNeighborExpiryTime, hwPimInstanceID
// Description: This notification is generated when a new PIM neighbor is created.
trapMap["1.3.6.1.4.1.2011.6.125.1.14.2"] = [
    name: "hwPimNeighborAddTrap",
    fields: ["hwPimInterfaceIndex", "hwPimInterfaceAddressType", "hwPimInterfaceAddress", "hwPimNeighborExpiryTime", "hwPimInstanceID"],
    fieldOids: ["hwPimInterfaceIndex": "1.3.6.1.4.1.2011.6.125.1.13.1", "hwPimInterfaceAddressType": "1.3.6.1.4.1.2011.6.125.1.13.2", "hwPimInterfaceAddress": "1.3.6.1.4.1.2011.6.125.1.13.3", "hwPimNeighborExpiryTime": "1.3.6.1.4.1.2011.6.125.1.13.7", "hwPimInstanceID": "1.3.6.1.4.1.2011.6.125.1.13.5"]
]

// ===== Parsing logic =====

// Set to true to enable diagnostic logging for this MIB parser
DEBUG = false

LOG_PREFIX = "[HUAWEI-IPDSLAM-L3PROTOCOL-MIB]"
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
