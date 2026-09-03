/**
 * Auto-generated from HUAWEI-NVO3-MIB.mib
 * Generated: 2026-08-24T18:28:30.537462
 * Traps/Notifications (18): hwNvo3VxlanTnlDown, hwNvo3VxlanTnlUp, hwNvo3VxlanVni2Vrf, hwNvo3VxlanVni2VrfClear, hwNvo3VxlanVrf2Vni, hwNvo3VxlanVrf2VniClear, hwIPv4VxlanTunnelDown, hwIPv4VxlanTunnelUp, hwIPv6VxlanTunnelDown, hwIPv6VxlanTunnelUp, hwNvo3VxlanIPv6TnlDown, hwNvo3VxlanIPv6TnlUp, hwNvo3IpPathDetectResultIpv4Pkt, hwNvo3IpPathDetectResultIpv6Pkt, hwEvplCccDown, hwEvplCccUp, hwNvo3VxlanTnlDel, hwNvo3VxlanIpv6TnlDel
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

// --- hwNvo3VxlanTnlDown (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.335.2.1
// Fields: hwNvo3VxlanTnlStatus
// Description: The SNMP trap that is generated when an vxlan tunnel status change. When alarm is down trigger, hwNvo3VxlanTnlStatus is 1, when alarm is up trigger, hwNvo3VxlanTnlStatus is 2.
trapMap["1.3.6.1.4.1.2011.5.25.335.2.1"] = [
    name: "hwNvo3VxlanTnlDown",
    fields: ["hwNvo3VxlanTnlStatus"],
    fieldOids: ["hwNvo3VxlanTnlStatus": "1.3.6.1.4.1.2011.5.25.335.1.3.1.3"]
]

// --- hwNvo3VxlanTnlUp (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.335.2.2
// Fields: hwNvo3VxlanTnlStatus
// Description: The SNMP trap that is generated when an vxlan tunnel status change. When alarm is down trigger, hwNvo3VxlanTnlStatus is 0, when alarm is up trigger, hwNvo3VxlanTnlStatus is 1.
trapMap["1.3.6.1.4.1.2011.5.25.335.2.2"] = [
    name: "hwNvo3VxlanTnlUp",
    fields: ["hwNvo3VxlanTnlStatus"],
    fieldOids: ["hwNvo3VxlanTnlStatus": "1.3.6.1.4.1.2011.5.25.335.1.3.1.3"]
]

// --- hwNvo3VxlanVni2Vrf (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.335.6.1
// Fields: hwNvo3TnlTnlId, hwNvo3TnlVniId, hwNvo3TnlVrId, hwNvo3TnlVrfId
// Description: The VXLAN tunnel and VNI have been mapped to a VRF instance, and cannot be mapped to other VRF instances.
trapMap["1.3.6.1.4.1.2011.5.25.335.6.1"] = [
    name: "hwNvo3VxlanVni2Vrf",
    fields: ["hwNvo3TnlTnlId", "hwNvo3TnlVniId", "hwNvo3TnlVrId", "hwNvo3TnlVrfId"],
    fieldOids: ["hwNvo3TnlTnlId": "1.3.6.1.4.1.2011.5.25.335.5.1", "hwNvo3TnlVniId": "1.3.6.1.4.1.2011.5.25.335.5.2", "hwNvo3TnlVrId": "1.3.6.1.4.1.2011.5.25.335.5.4", "hwNvo3TnlVrfId": "1.3.6.1.4.1.2011.5.25.335.5.3"]
]

// --- hwNvo3VxlanVni2VrfClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.335.6.2
// Fields: hwNvo3TnlTnlId, hwNvo3TnlVniId, hwNvo3TnlVrId, hwNvo3TnlVrfId
// Description: The VXLAN tunnel and VNI are no longer mapped to more than one VRF instance.
trapMap["1.3.6.1.4.1.2011.5.25.335.6.2"] = [
    name: "hwNvo3VxlanVni2VrfClear",
    fields: ["hwNvo3TnlTnlId", "hwNvo3TnlVniId", "hwNvo3TnlVrId", "hwNvo3TnlVrfId"],
    fieldOids: ["hwNvo3TnlTnlId": "1.3.6.1.4.1.2011.5.25.335.5.1", "hwNvo3TnlVniId": "1.3.6.1.4.1.2011.5.25.335.5.2", "hwNvo3TnlVrId": "1.3.6.1.4.1.2011.5.25.335.5.4", "hwNvo3TnlVrfId": "1.3.6.1.4.1.2011.5.25.335.5.3"]
]

// --- hwNvo3VxlanVrf2Vni (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.335.6.3
// Fields: hwNvo3TnlTnlId, hwNvo3TnlVrfId, hwNvo3TnlVniId
// Description: The VXLAN tunnel and VRF instance have been mapped to a VNI, and cannot be mapped to other VNIs.
trapMap["1.3.6.1.4.1.2011.5.25.335.6.3"] = [
    name: "hwNvo3VxlanVrf2Vni",
    fields: ["hwNvo3TnlTnlId", "hwNvo3TnlVrfId", "hwNvo3TnlVniId"],
    fieldOids: ["hwNvo3TnlTnlId": "1.3.6.1.4.1.2011.5.25.335.5.1", "hwNvo3TnlVrfId": "1.3.6.1.4.1.2011.5.25.335.5.3", "hwNvo3TnlVniId": "1.3.6.1.4.1.2011.5.25.335.5.2"]
]

// --- hwNvo3VxlanVrf2VniClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.335.6.4
// Fields: hwNvo3TnlTnlId, hwNvo3TnlVrfId, hwNvo3TnlVniId
// Description: The VXLAN tunnel and VRF instance are no longer mapped to more than one VNI.
trapMap["1.3.6.1.4.1.2011.5.25.335.6.4"] = [
    name: "hwNvo3VxlanVrf2VniClear",
    fields: ["hwNvo3TnlTnlId", "hwNvo3TnlVrfId", "hwNvo3TnlVniId"],
    fieldOids: ["hwNvo3TnlTnlId": "1.3.6.1.4.1.2011.5.25.335.5.1", "hwNvo3TnlVrfId": "1.3.6.1.4.1.2011.5.25.335.5.3", "hwNvo3TnlVniId": "1.3.6.1.4.1.2011.5.25.335.5.2"]
]

// --- hwIPv4VxlanTunnelDown (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.335.6.5
// Fields: hwNvo3VxlanTnlStatus
// Description: The IPv4 vxlan tunnel status changes.
trapMap["1.3.6.1.4.1.2011.5.25.335.6.5"] = [
    name: "hwIPv4VxlanTunnelDown",
    fields: ["hwNvo3VxlanTnlStatus"],
    fieldOids: ["hwNvo3VxlanTnlStatus": "1.3.6.1.4.1.2011.5.25.335.1.3.1.3"]
]

// --- hwIPv4VxlanTunnelUp (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.335.6.6
// Fields: hwNvo3VxlanTnlStatus
// Description: The IPv4 vxlan tunnel status changes.
trapMap["1.3.6.1.4.1.2011.5.25.335.6.6"] = [
    name: "hwIPv4VxlanTunnelUp",
    fields: ["hwNvo3VxlanTnlStatus"],
    fieldOids: ["hwNvo3VxlanTnlStatus": "1.3.6.1.4.1.2011.5.25.335.1.3.1.3"]
]

// --- hwIPv6VxlanTunnelDown (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.335.6.7
// Fields: hwNvo3VxlanIPv6TnlStatus
// Description: The IPv6 vxlan tunnel status changes.
trapMap["1.3.6.1.4.1.2011.5.25.335.6.7"] = [
    name: "hwIPv6VxlanTunnelDown",
    fields: ["hwNvo3VxlanIPv6TnlStatus"],
    fieldOids: ["hwNvo3VxlanIPv6TnlStatus": "1.3.6.1.4.1.2011.5.25.335.1.4.1.3"]
]

// --- hwIPv6VxlanTunnelUp (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.335.6.8
// Fields: hwNvo3VxlanIPv6TnlStatus
// Description: The IPv6 vxlan tunnel status changes.
trapMap["1.3.6.1.4.1.2011.5.25.335.6.8"] = [
    name: "hwIPv6VxlanTunnelUp",
    fields: ["hwNvo3VxlanIPv6TnlStatus"],
    fieldOids: ["hwNvo3VxlanIPv6TnlStatus": "1.3.6.1.4.1.2011.5.25.335.1.4.1.3"]
]

// --- hwNvo3VxlanIPv6TnlDown (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.335.7.1
// Fields: hwNvo3VxlanIPv6TnlStatus
// Description: The SNMP trap that is generated when an vxlan tunnel status change. When alarm is down trigger, hwNvo3VxlanIPv6TnlStatus is 1, when alarm is up trigger, hwNvo3VxlanIPv6TnlStatus is 2.
trapMap["1.3.6.1.4.1.2011.5.25.335.7.1"] = [
    name: "hwNvo3VxlanIPv6TnlDown",
    fields: ["hwNvo3VxlanIPv6TnlStatus"],
    fieldOids: ["hwNvo3VxlanIPv6TnlStatus": "1.3.6.1.4.1.2011.5.25.335.1.4.1.3"]
]

// --- hwNvo3VxlanIPv6TnlUp (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.335.7.2
// Fields: hwNvo3VxlanIPv6TnlStatus
// Description: The SNMP trap that is generated when an vxlan tunnel status change. When alarm is down trigger, hwNvo3VxlanIPv6TnlStatus is 0, when alarm is up trigger, hwNvo3VxlanIPv6TnlStatus is 1.
trapMap["1.3.6.1.4.1.2011.5.25.335.7.2"] = [
    name: "hwNvo3VxlanIPv6TnlUp",
    fields: ["hwNvo3VxlanIPv6TnlStatus"],
    fieldOids: ["hwNvo3VxlanIPv6TnlStatus": "1.3.6.1.4.1.2011.5.25.335.1.4.1.3"]
]

// --- hwNvo3IpPathDetectResultIpv4Pkt (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.335.8.1
// Fields: hwVxlanPathDetectTestId, hwVxlanPathDetectSipv4Addr, hwVxlanPathDetectDipv4Addr, hwVxlanPathDetectProtocol, hwVxlanPathDetectSrcPort, hwVxlanPathDetectDstPort, hwVxlanPathDetectDscp, hwVxlanPathDetectVrfName, hwVxlanPathDetectIfName, hwVxlanPathDetectDirection, hwVxlanPathDetectTtl
// Description: If receive the ip path detect ipv4 packet, the system sends packed trap information.
trapMap["1.3.6.1.4.1.2011.5.25.335.8.1"] = [
    name: "hwNvo3IpPathDetectResultIpv4Pkt",
    fields: ["hwVxlanPathDetectTestId", "hwVxlanPathDetectSipv4Addr", "hwVxlanPathDetectDipv4Addr", "hwVxlanPathDetectProtocol", "hwVxlanPathDetectSrcPort", "hwVxlanPathDetectDstPort", "hwVxlanPathDetectDscp", "hwVxlanPathDetectVrfName", "hwVxlanPathDetectIfName", "hwVxlanPathDetectDirection", "hwVxlanPathDetectTtl"],
    fieldOids: ["hwVxlanPathDetectTestId": "1.3.6.1.4.1.2011.5.25.335.1.6.1.1", "hwVxlanPathDetectSipv4Addr": "1.3.6.1.4.1.2011.5.25.335.1.6.1.2", "hwVxlanPathDetectDipv4Addr": "1.3.6.1.4.1.2011.5.25.335.1.6.1.3", "hwVxlanPathDetectProtocol": "1.3.6.1.4.1.2011.5.25.335.1.6.1.6", "hwVxlanPathDetectSrcPort": "1.3.6.1.4.1.2011.5.25.335.1.6.1.7", "hwVxlanPathDetectDstPort": "1.3.6.1.4.1.2011.5.25.335.1.6.1.8", "hwVxlanPathDetectDscp": "1.3.6.1.4.1.2011.5.25.335.1.6.1.9", "hwVxlanPathDetectVrfName": "1.3.6.1.4.1.2011.5.25.335.1.6.1.10", "hwVxlanPathDetectIfName": "1.3.6.1.4.1.2011.5.25.335.1.6.1.11", "hwVxlanPathDetectDirection": "1.3.6.1.4.1.2011.5.25.335.1.6.1.12", "hwVxlanPathDetectTtl": "1.3.6.1.4.1.2011.5.25.335.1.6.1.13"]
]

// --- hwNvo3IpPathDetectResultIpv6Pkt (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.335.8.2
// Fields: hwVxlanPathDetectTestId, hwVxlanPathDetectSipv6Addr, hwVxlanPathDetectDipv6Addr, hwVxlanPathDetectProtocol, hwVxlanPathDetectSrcPort, hwVxlanPathDetectDstPort, hwVxlanPathDetectDscp, hwVxlanPathDetectVrfName, hwVxlanPathDetectIfName, hwVxlanPathDetectDirection, hwVxlanPathDetectTtl
// Description: If receive the ip path detect ipv6 packet, the system sends packed trap information.
trapMap["1.3.6.1.4.1.2011.5.25.335.8.2"] = [
    name: "hwNvo3IpPathDetectResultIpv6Pkt",
    fields: ["hwVxlanPathDetectTestId", "hwVxlanPathDetectSipv6Addr", "hwVxlanPathDetectDipv6Addr", "hwVxlanPathDetectProtocol", "hwVxlanPathDetectSrcPort", "hwVxlanPathDetectDstPort", "hwVxlanPathDetectDscp", "hwVxlanPathDetectVrfName", "hwVxlanPathDetectIfName", "hwVxlanPathDetectDirection", "hwVxlanPathDetectTtl"],
    fieldOids: ["hwVxlanPathDetectTestId": "1.3.6.1.4.1.2011.5.25.335.1.6.1.1", "hwVxlanPathDetectSipv6Addr": "1.3.6.1.4.1.2011.5.25.335.1.6.1.4", "hwVxlanPathDetectDipv6Addr": "1.3.6.1.4.1.2011.5.25.335.1.6.1.5", "hwVxlanPathDetectProtocol": "1.3.6.1.4.1.2011.5.25.335.1.6.1.6", "hwVxlanPathDetectSrcPort": "1.3.6.1.4.1.2011.5.25.335.1.6.1.7", "hwVxlanPathDetectDstPort": "1.3.6.1.4.1.2011.5.25.335.1.6.1.8", "hwVxlanPathDetectDscp": "1.3.6.1.4.1.2011.5.25.335.1.6.1.9", "hwVxlanPathDetectVrfName": "1.3.6.1.4.1.2011.5.25.335.1.6.1.10", "hwVxlanPathDetectIfName": "1.3.6.1.4.1.2011.5.25.335.1.6.1.11", "hwVxlanPathDetectDirection": "1.3.6.1.4.1.2011.5.25.335.1.6.1.12", "hwVxlanPathDetectTtl": "1.3.6.1.4.1.2011.5.25.335.1.6.1.13"]
]

// --- hwEvplCccDown (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.335.10.1
// Fields: hwEvplIndex, hwEvplCccIfname1, hwEvplCccIfname2
// Description: The Evpl Ccc status changes.
trapMap["1.3.6.1.4.1.2011.5.25.335.10.1"] = [
    name: "hwEvplCccDown",
    fields: ["hwEvplIndex", "hwEvplCccIfname1", "hwEvplCccIfname2"],
    fieldOids: ["hwEvplIndex": "1.3.6.1.4.1.2011.5.25.335.9.1.1.1", "hwEvplCccIfname1": "1.3.6.1.4.1.2011.5.25.335.9.1.1.2", "hwEvplCccIfname2": "1.3.6.1.4.1.2011.5.25.335.9.1.1.3"]
]

// --- hwEvplCccUp (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.335.10.2
// Fields: hwEvplIndex, hwEvplCccIfname1, hwEvplCccIfname2
// Description: The Evpl Ccc status changes.
trapMap["1.3.6.1.4.1.2011.5.25.335.10.2"] = [
    name: "hwEvplCccUp",
    fields: ["hwEvplIndex", "hwEvplCccIfname1", "hwEvplCccIfname2"],
    fieldOids: ["hwEvplIndex": "1.3.6.1.4.1.2011.5.25.335.9.1.1.1", "hwEvplCccIfname1": "1.3.6.1.4.1.2011.5.25.335.9.1.1.2", "hwEvplCccIfname2": "1.3.6.1.4.1.2011.5.25.335.9.1.1.3"]
]

// --- hwNvo3VxlanTnlDel (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.335.11.1
// Fields: hwNvo3VxlanTnlDelSrcIpAddr, hwNvo3VxlanTnlDelDestIpAddr
// Description: The SNMP trap that is generated when an IPv4 VXLAN tunnel was deleted.
trapMap["1.3.6.1.4.1.2011.5.25.335.11.1"] = [
    name: "hwNvo3VxlanTnlDel",
    fields: ["hwNvo3VxlanTnlDelSrcIpAddr", "hwNvo3VxlanTnlDelDestIpAddr"],
    fieldOids: ["hwNvo3VxlanTnlDelSrcIpAddr": "1.3.6.1.4.1.2011.5.25.335.1.7.1.1", "hwNvo3VxlanTnlDelDestIpAddr": "1.3.6.1.4.1.2011.5.25.335.1.7.1.2"]
]

// --- hwNvo3VxlanIpv6TnlDel (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.335.11.2
// Fields: hwNvo3VxlanTnlDelSrcIpv6Addr, hwNvo3VxlanTnlDelDestIpv6Addr
// Description: The SNMP trap that is generated when an IPv6 VXLAN tunnel was deleted.
trapMap["1.3.6.1.4.1.2011.5.25.335.11.2"] = [
    name: "hwNvo3VxlanIpv6TnlDel",
    fields: ["hwNvo3VxlanTnlDelSrcIpv6Addr", "hwNvo3VxlanTnlDelDestIpv6Addr"],
    fieldOids: ["hwNvo3VxlanTnlDelSrcIpv6Addr": "1.3.6.1.4.1.2011.5.25.335.1.8.1.1", "hwNvo3VxlanTnlDelDestIpv6Addr": "1.3.6.1.4.1.2011.5.25.335.1.8.1.2"]
]

// ===== Parsing logic =====

// Set to true to enable diagnostic logging for this MIB parser
DEBUG = false

LOG_PREFIX = "[HUAWEI-NVO3-MIB]"
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
