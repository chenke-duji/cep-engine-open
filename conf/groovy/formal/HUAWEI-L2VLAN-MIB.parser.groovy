/**
 * Auto-generated from HUAWEI-L2VLAN-MIB.mib
 * Generated: 2026-08-24T18:28:30.188669100
 * Traps/Notifications (11): hwL2VlanUnkownPacketAlarm, hwVcmpServerMacConflict, hwVcmpRevisionConflict, hwMuxVlanGroupCountExceedThreshold, hwMuxVlanGroupCountExceedThresholdResume, hwVlantransCountExceedThreshold, hwVlantransCountExceedThresholdResume, hwVlantransExceedChipSpec, hwVlantransExceedChipSpecResume, hwVcmpServerMacConflictResume, hwVcmpRevisionConflictResume
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

// --- hwL2VlanUnkownPacketAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.3.1.4.1
// Fields: hwBaseTrapSeverity, hwBaseTrapProbableCause, hwBaseTrapEventType, hwL2VlanStatUnknownUcastDiscardPkts, hwL2VlanStatUnknownMcastDiscardPkts, hwL2VlanStatBcastDiscardPkts
// Description: Warning of unkown Packets in vlan.
trapMap["1.3.6.1.4.1.2011.5.25.42.3.1.4.1"] = [
    name: "hwL2VlanUnkownPacketAlarm",
    fields: ["hwBaseTrapSeverity", "hwBaseTrapProbableCause", "hwBaseTrapEventType", "hwL2VlanStatUnknownUcastDiscardPkts", "hwL2VlanStatUnknownMcastDiscardPkts", "hwL2VlanStatBcastDiscardPkts"],
    fieldOids: ["hwBaseTrapSeverity": "1.3.6.1.4.1.2011.5.25.129.1.1", "hwBaseTrapProbableCause": "1.3.6.1.4.1.2011.5.25.129.1.2", "hwBaseTrapEventType": "1.3.6.1.4.1.2011.5.25.129.1.3", "hwL2VlanStatUnknownUcastDiscardPkts": "1.3.6.1.4.1.2011.5.25.42.3.1.3.4.1.6", "hwL2VlanStatUnknownMcastDiscardPkts": "1.3.6.1.4.1.2011.5.25.42.3.1.3.4.1.7", "hwL2VlanStatBcastDiscardPkts": "1.3.6.1.4.1.2011.5.25.42.3.1.3.4.1.8"]
]

// --- hwVcmpServerMacConflict (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.3.1.4.2
// Fields: hwVcmpDeviceMac
// Description: More than one server exists in the VCMP domain.
trapMap["1.3.6.1.4.1.2011.5.25.42.3.1.4.2"] = [
    name: "hwVcmpServerMacConflict",
    fields: ["hwVcmpDeviceMac"],
    fieldOids: ["hwVcmpDeviceMac": "1.3.6.1.4.1.2011.5.25.42.3.1.5.1"]
]

// --- hwVcmpRevisionConflict (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.3.1.4.3
// Fields: hwVcmpDeviceMac
// Description: A server received a VCMP packet with a higher revision number.
trapMap["1.3.6.1.4.1.2011.5.25.42.3.1.4.3"] = [
    name: "hwVcmpRevisionConflict",
    fields: ["hwVcmpDeviceMac"],
    fieldOids: ["hwVcmpDeviceMac": "1.3.6.1.4.1.2011.5.25.42.3.1.5.1"]
]

// --- hwMuxVlanGroupCountExceedThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.3.1.4.4
// Fields: hwPrincipalVlanID, hwMuxVlanUpperThreshold
// Description: The number of the group VLANs in the principal VLAN exceeded the upper threshold.
trapMap["1.3.6.1.4.1.2011.5.25.42.3.1.4.4"] = [
    name: "hwMuxVlanGroupCountExceedThreshold",
    fields: ["hwPrincipalVlanID", "hwMuxVlanUpperThreshold"],
    fieldOids: ["hwPrincipalVlanID": "1.3.6.1.4.1.2011.5.25.42.3.1.5.2", "hwMuxVlanUpperThreshold": "1.3.6.1.4.1.2011.5.25.42.3.1.5.3"]
]

// --- hwMuxVlanGroupCountExceedThresholdResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.3.1.4.5
// Fields: hwPrincipalVlanID, hwMuxVlanLowerThreshold
// Description: The number of the group VLANs in the principal VLAN fell below the lower threshold.
trapMap["1.3.6.1.4.1.2011.5.25.42.3.1.4.5"] = [
    name: "hwMuxVlanGroupCountExceedThresholdResume",
    fields: ["hwPrincipalVlanID", "hwMuxVlanLowerThreshold"],
    fieldOids: ["hwPrincipalVlanID": "1.3.6.1.4.1.2011.5.25.42.3.1.5.2", "hwMuxVlanLowerThreshold": "1.3.6.1.4.1.2011.5.25.42.3.1.5.4"]
]

// --- hwVlantransCountExceedThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.3.1.4.6
// Fields: hwVlantransIfIndex, hwVlantransUpperThreshold
// Description: The number of VLAN mapping or VLAN stacking configurations on the interface exceeded the upper threshold.
trapMap["1.3.6.1.4.1.2011.5.25.42.3.1.4.6"] = [
    name: "hwVlantransCountExceedThreshold",
    fields: ["hwVlantransIfIndex", "hwVlantransUpperThreshold"],
    fieldOids: ["hwVlantransIfIndex": "1.3.6.1.4.1.2011.5.25.42.3.1.5.5", "hwVlantransUpperThreshold": "1.3.6.1.4.1.2011.5.25.42.3.1.5.6"]
]

// --- hwVlantransCountExceedThresholdResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.3.1.4.7
// Fields: hwVlantransIfIndex, hwVlantransLowerThreshold
// Description: The number of the VLAN mapping and VLAN stacking configurations on the interface fell below the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.42.3.1.4.7"] = [
    name: "hwVlantransCountExceedThresholdResume",
    fields: ["hwVlantransIfIndex", "hwVlantransLowerThreshold"],
    fieldOids: ["hwVlantransIfIndex": "1.3.6.1.4.1.2011.5.25.42.3.1.5.5", "hwVlantransLowerThreshold": "1.3.6.1.4.1.2011.5.25.42.3.1.5.7"]
]

// --- hwVlantransExceedChipSpec (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.3.1.4.8
// Fields: hwVlantransIfName, hwVlantransVlanBgn, hwVlantransVlanEnd, hwVlantransVlanPriBgn, hwVlantransVlanPriEnd, hwVlantransInnerVlanBgn, hwVlantransInnerVlanEnd, hwVlantransChipSpec
// Description: The number of VLAN mapping or VLAN stacking configurations exceeded the chip specification.
trapMap["1.3.6.1.4.1.2011.5.25.42.3.1.4.8"] = [
    name: "hwVlantransExceedChipSpec",
    fields: ["hwVlantransIfName", "hwVlantransVlanBgn", "hwVlantransVlanEnd", "hwVlantransVlanPriBgn", "hwVlantransVlanPriEnd", "hwVlantransInnerVlanBgn", "hwVlantransInnerVlanEnd", "hwVlantransChipSpec"],
    fieldOids: ["hwVlantransIfName": "1.3.6.1.4.1.2011.5.25.42.3.1.5.8", "hwVlantransVlanBgn": "1.3.6.1.4.1.2011.5.25.42.3.1.5.9", "hwVlantransVlanEnd": "1.3.6.1.4.1.2011.5.25.42.3.1.5.10", "hwVlantransVlanPriBgn": "1.3.6.1.4.1.2011.5.25.42.3.1.5.11", "hwVlantransVlanPriEnd": "1.3.6.1.4.1.2011.5.25.42.3.1.5.12", "hwVlantransInnerVlanBgn": "1.3.6.1.4.1.2011.5.25.42.3.1.5.13", "hwVlantransInnerVlanEnd": "1.3.6.1.4.1.2011.5.25.42.3.1.5.14", "hwVlantransChipSpec": "1.3.6.1.4.1.2011.5.25.42.3.1.5.15"]
]

// --- hwVlantransExceedChipSpecResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.3.1.4.9
// Fields: hwVlantransIfName, hwVlantransVlanBgn, hwVlantransVlanEnd, hwVlantransVlanPriBgn, hwVlantransVlanPriEnd, hwVlantransInnerVlanBgn, hwVlantransInnerVlanEnd, hwVlantransChipSpec
// Description: The number of VLAN mapping or VLAN stacking configurations fell below the chip specification.
trapMap["1.3.6.1.4.1.2011.5.25.42.3.1.4.9"] = [
    name: "hwVlantransExceedChipSpecResume",
    fields: ["hwVlantransIfName", "hwVlantransVlanBgn", "hwVlantransVlanEnd", "hwVlantransVlanPriBgn", "hwVlantransVlanPriEnd", "hwVlantransInnerVlanBgn", "hwVlantransInnerVlanEnd", "hwVlantransChipSpec"],
    fieldOids: ["hwVlantransIfName": "1.3.6.1.4.1.2011.5.25.42.3.1.5.8", "hwVlantransVlanBgn": "1.3.6.1.4.1.2011.5.25.42.3.1.5.9", "hwVlantransVlanEnd": "1.3.6.1.4.1.2011.5.25.42.3.1.5.10", "hwVlantransVlanPriBgn": "1.3.6.1.4.1.2011.5.25.42.3.1.5.11", "hwVlantransVlanPriEnd": "1.3.6.1.4.1.2011.5.25.42.3.1.5.12", "hwVlantransInnerVlanBgn": "1.3.6.1.4.1.2011.5.25.42.3.1.5.13", "hwVlantransInnerVlanEnd": "1.3.6.1.4.1.2011.5.25.42.3.1.5.14", "hwVlantransChipSpec": "1.3.6.1.4.1.2011.5.25.42.3.1.5.15"]
]

// --- hwVcmpServerMacConflictResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.3.1.4.10
// Fields: hwVcmpDeviceMac
// Description: The VCMP role of the device is changed to a non-server.
trapMap["1.3.6.1.4.1.2011.5.25.42.3.1.4.10"] = [
    name: "hwVcmpServerMacConflictResume",
    fields: ["hwVcmpDeviceMac"],
    fieldOids: ["hwVcmpDeviceMac": "1.3.6.1.4.1.2011.5.25.42.3.1.5.1"]
]

// --- hwVcmpRevisionConflictResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.3.1.4.11
// Fields: hwVcmpDeviceMac
// Description: The VCMP role of the device is changed to a non-server or the device received a VCMP packet with a correct revision number.
trapMap["1.3.6.1.4.1.2011.5.25.42.3.1.4.11"] = [
    name: "hwVcmpRevisionConflictResume",
    fields: ["hwVcmpDeviceMac"],
    fieldOids: ["hwVcmpDeviceMac": "1.3.6.1.4.1.2011.5.25.42.3.1.5.1"]
]

// ===== Parsing logic =====

// Set to true to enable diagnostic logging for this MIB parser
DEBUG = false

LOG_PREFIX = "[HUAWEI-L2VLAN-MIB]"
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
