/**
 * Auto-generated from HUAWEI-VIRTUALCLUSTERACCESS-MIB.mib
 * Generated: 2026-08-24T18:28:31.302271700
 * Traps/Notifications (16): hwVpDown, hwVpDownClear, hwVpGroupDown, hwVpGroupDownClear, hwVpGroupSwitch, hwVcDown, hwVcDownClear, hwRemoteApIfDown, hwRemoteApIfDownClear, hwApDown, hwApDownClear, hwApLogin, hwMasterPeerDown, hwMasterPeerDownClear, hwVirtualClusterAccessLinkDown, hwVirtualClusterAccessLinkDownClear
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

// --- hwVpDown (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.318.2.1.1
// Fields: hwVirtualClusterAccessVpId, hwVirtualClusterAccessVpApId, hwVirtualClusterAccessVpIfIndex, hwVirtualClusterAccessVpIfName, hwVirtualClusterAccessVpOperState, hwVirtualClusterAccessVpReason
// Description: This notification indicates that VP changes to down.
trapMap["1.3.6.1.4.1.2011.5.25.318.2.1.1"] = [
    name: "hwVpDown",
    fields: ["hwVirtualClusterAccessVpId", "hwVirtualClusterAccessVpApId", "hwVirtualClusterAccessVpIfIndex", "hwVirtualClusterAccessVpIfName", "hwVirtualClusterAccessVpOperState", "hwVirtualClusterAccessVpReason"],
    fieldOids: ["hwVirtualClusterAccessVpId": "1.3.6.1.4.1.2011.5.25.318.1.2.1.1.10", "hwVirtualClusterAccessVpApId": "1.3.6.1.4.1.2011.5.25.318.1.2.1.1.5", "hwVirtualClusterAccessVpIfIndex": "1.3.6.1.4.1.2011.5.25.318.1.2.1.1.6", "hwVirtualClusterAccessVpIfName": "1.3.6.1.4.1.2011.5.25.318.1.2.1.1.7", "hwVirtualClusterAccessVpOperState": "1.3.6.1.4.1.2011.5.25.318.1.2.1.1.8", "hwVirtualClusterAccessVpReason": "1.3.6.1.4.1.2011.5.25.318.1.2.1.1.9"]
]

// --- hwVpDownClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.318.2.1.2
// Fields: hwVirtualClusterAccessVpId, hwVirtualClusterAccessVpApId, hwVirtualClusterAccessVpIfIndex, hwVirtualClusterAccessVpIfName, hwVirtualClusterAccessVpOperState, hwVirtualClusterAccessVpReason
// Description: This notification indicates that VP changes to up.
trapMap["1.3.6.1.4.1.2011.5.25.318.2.1.2"] = [
    name: "hwVpDownClear",
    fields: ["hwVirtualClusterAccessVpId", "hwVirtualClusterAccessVpApId", "hwVirtualClusterAccessVpIfIndex", "hwVirtualClusterAccessVpIfName", "hwVirtualClusterAccessVpOperState", "hwVirtualClusterAccessVpReason"],
    fieldOids: ["hwVirtualClusterAccessVpId": "1.3.6.1.4.1.2011.5.25.318.1.2.1.1.10", "hwVirtualClusterAccessVpApId": "1.3.6.1.4.1.2011.5.25.318.1.2.1.1.5", "hwVirtualClusterAccessVpIfIndex": "1.3.6.1.4.1.2011.5.25.318.1.2.1.1.6", "hwVirtualClusterAccessVpIfName": "1.3.6.1.4.1.2011.5.25.318.1.2.1.1.7", "hwVirtualClusterAccessVpOperState": "1.3.6.1.4.1.2011.5.25.318.1.2.1.1.8", "hwVirtualClusterAccessVpReason": "1.3.6.1.4.1.2011.5.25.318.1.2.1.1.9"]
]

// --- hwVpGroupDown (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.318.2.2.1
// Fields: hwVirtualClusterAccessVpGroupVpId, hwVirtualClusterAccessVpGroupOperState, hwVirtualClusterAccessVpGroupReason
// Description: This notification indicates that VP group changes to down.
trapMap["1.3.6.1.4.1.2011.5.25.318.2.2.1"] = [
    name: "hwVpGroupDown",
    fields: ["hwVirtualClusterAccessVpGroupVpId", "hwVirtualClusterAccessVpGroupOperState", "hwVirtualClusterAccessVpGroupReason"],
    fieldOids: ["hwVirtualClusterAccessVpGroupVpId": "1.3.6.1.4.1.2011.5.25.318.1.2.2.1.4", "hwVirtualClusterAccessVpGroupOperState": "1.3.6.1.4.1.2011.5.25.318.1.2.2.1.5", "hwVirtualClusterAccessVpGroupReason": "1.3.6.1.4.1.2011.5.25.318.1.2.2.1.6"]
]

// --- hwVpGroupDownClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.318.2.2.2
// Fields: hwVirtualClusterAccessVpGroupVpId, hwVirtualClusterAccessVpGroupOperState, hwVirtualClusterAccessVpGroupReason
// Description: This notification indicates that VP group changes to up.
trapMap["1.3.6.1.4.1.2011.5.25.318.2.2.2"] = [
    name: "hwVpGroupDownClear",
    fields: ["hwVirtualClusterAccessVpGroupVpId", "hwVirtualClusterAccessVpGroupOperState", "hwVirtualClusterAccessVpGroupReason"],
    fieldOids: ["hwVirtualClusterAccessVpGroupVpId": "1.3.6.1.4.1.2011.5.25.318.1.2.2.1.4", "hwVirtualClusterAccessVpGroupOperState": "1.3.6.1.4.1.2011.5.25.318.1.2.2.1.5", "hwVirtualClusterAccessVpGroupReason": "1.3.6.1.4.1.2011.5.25.318.1.2.2.1.6"]
]

// --- hwVpGroupSwitch (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.318.2.2.3
// Fields: hwVirtualClusterAccessVpGroupPrimaryVpId, hwVirtualClusterAccessVpGroupStandbyVpId, hwVirtualClusterAccessVpGroupSwitchDirection, hwVirtualClusterAccessVpGroupReason
// Description: This notification indicates that traffic switch occurred in VP group.
trapMap["1.3.6.1.4.1.2011.5.25.318.2.2.3"] = [
    name: "hwVpGroupSwitch",
    fields: ["hwVirtualClusterAccessVpGroupPrimaryVpId", "hwVirtualClusterAccessVpGroupStandbyVpId", "hwVirtualClusterAccessVpGroupSwitchDirection", "hwVirtualClusterAccessVpGroupReason"],
    fieldOids: ["hwVirtualClusterAccessVpGroupPrimaryVpId": "1.3.6.1.4.1.2011.5.25.318.1.2.2.1.7", "hwVirtualClusterAccessVpGroupStandbyVpId": "1.3.6.1.4.1.2011.5.25.318.1.2.2.1.8", "hwVirtualClusterAccessVpGroupSwitchDirection": "1.3.6.1.4.1.2011.5.25.318.1.2.2.1.9", "hwVirtualClusterAccessVpGroupReason": "1.3.6.1.4.1.2011.5.25.318.1.2.2.1.6"]
]

// --- hwVcDown (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.318.2.3.1
// Fields: hwVirtualClusterAccessVcRemoteApIfName, hwVirtualClusterAccessVcAcIfName, hwVirtualClusterAccessVcVpSourceNodeId, hwVirtualClusterAccessVcVpDestNodeId, hwVirtualClusterAccessVcVpGroupId, hwVirtualClusterAccessVcId, hwVirtualClusterAccessVcType, hwVirtualClusterAccessVcPeerIpAddr, hwVirtualClusterAccessVcOperState, hwVirtualClusterAccessVcReason
// Description: This notification indicates that VC changes to down.
trapMap["1.3.6.1.4.1.2011.5.25.318.2.3.1"] = [
    name: "hwVcDown",
    fields: ["hwVirtualClusterAccessVcRemoteApIfName", "hwVirtualClusterAccessVcAcIfName", "hwVirtualClusterAccessVcVpSourceNodeId", "hwVirtualClusterAccessVcVpDestNodeId", "hwVirtualClusterAccessVcVpGroupId", "hwVirtualClusterAccessVcId", "hwVirtualClusterAccessVcType", "hwVirtualClusterAccessVcPeerIpAddr", "hwVirtualClusterAccessVcOperState", "hwVirtualClusterAccessVcReason"],
    fieldOids: ["hwVirtualClusterAccessVcRemoteApIfName": "1.3.6.1.4.1.2011.5.25.318.1.2.3.1.5", "hwVirtualClusterAccessVcAcIfName": "1.3.6.1.4.1.2011.5.25.318.1.2.3.1.6", "hwVirtualClusterAccessVcVpSourceNodeId": "1.3.6.1.4.1.2011.5.25.318.1.2.3.1.7", "hwVirtualClusterAccessVcVpDestNodeId": "1.3.6.1.4.1.2011.5.25.318.1.2.3.1.8", "hwVirtualClusterAccessVcVpGroupId": "1.3.6.1.4.1.2011.5.25.318.1.2.3.1.9", "hwVirtualClusterAccessVcId": "1.3.6.1.4.1.2011.5.25.318.1.2.3.1.10", "hwVirtualClusterAccessVcType": "1.3.6.1.4.1.2011.5.25.318.1.2.3.1.11", "hwVirtualClusterAccessVcPeerIpAddr": "1.3.6.1.4.1.2011.5.25.318.1.2.3.1.12", "hwVirtualClusterAccessVcOperState": "1.3.6.1.4.1.2011.5.25.318.1.2.3.1.13", "hwVirtualClusterAccessVcReason": "1.3.6.1.4.1.2011.5.25.318.1.2.3.1.14"]
]

// --- hwVcDownClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.318.2.3.2
// Fields: hwVirtualClusterAccessVcRemoteApIfName, hwVirtualClusterAccessVcAcIfName, hwVirtualClusterAccessVcVpSourceNodeId, hwVirtualClusterAccessVcVpDestNodeId, hwVirtualClusterAccessVcVpGroupId, hwVirtualClusterAccessVcId, hwVirtualClusterAccessVcType, hwVirtualClusterAccessVcPeerIpAddr, hwVirtualClusterAccessVcOperState, hwVirtualClusterAccessVcReason
// Description: This notification indicates that VC changes to up.
trapMap["1.3.6.1.4.1.2011.5.25.318.2.3.2"] = [
    name: "hwVcDownClear",
    fields: ["hwVirtualClusterAccessVcRemoteApIfName", "hwVirtualClusterAccessVcAcIfName", "hwVirtualClusterAccessVcVpSourceNodeId", "hwVirtualClusterAccessVcVpDestNodeId", "hwVirtualClusterAccessVcVpGroupId", "hwVirtualClusterAccessVcId", "hwVirtualClusterAccessVcType", "hwVirtualClusterAccessVcPeerIpAddr", "hwVirtualClusterAccessVcOperState", "hwVirtualClusterAccessVcReason"],
    fieldOids: ["hwVirtualClusterAccessVcRemoteApIfName": "1.3.6.1.4.1.2011.5.25.318.1.2.3.1.5", "hwVirtualClusterAccessVcAcIfName": "1.3.6.1.4.1.2011.5.25.318.1.2.3.1.6", "hwVirtualClusterAccessVcVpSourceNodeId": "1.3.6.1.4.1.2011.5.25.318.1.2.3.1.7", "hwVirtualClusterAccessVcVpDestNodeId": "1.3.6.1.4.1.2011.5.25.318.1.2.3.1.8", "hwVirtualClusterAccessVcVpGroupId": "1.3.6.1.4.1.2011.5.25.318.1.2.3.1.9", "hwVirtualClusterAccessVcId": "1.3.6.1.4.1.2011.5.25.318.1.2.3.1.10", "hwVirtualClusterAccessVcType": "1.3.6.1.4.1.2011.5.25.318.1.2.3.1.11", "hwVirtualClusterAccessVcPeerIpAddr": "1.3.6.1.4.1.2011.5.25.318.1.2.3.1.12", "hwVirtualClusterAccessVcOperState": "1.3.6.1.4.1.2011.5.25.318.1.2.3.1.13", "hwVirtualClusterAccessVcReason": "1.3.6.1.4.1.2011.5.25.318.1.2.3.1.14"]
]

// --- hwRemoteApIfDown (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.318.2.4.1
// Fields: hwVirtualClusterAccessRemoteApIfName, hwVirtualClusterAccessRemoteApIfOperState, hwVirtualClusterAccessRemoteApIfReason
// Description: This notification indicates that remote AP interface changes to down.
trapMap["1.3.6.1.4.1.2011.5.25.318.2.4.1"] = [
    name: "hwRemoteApIfDown",
    fields: ["hwVirtualClusterAccessRemoteApIfName", "hwVirtualClusterAccessRemoteApIfOperState", "hwVirtualClusterAccessRemoteApIfReason"],
    fieldOids: ["hwVirtualClusterAccessRemoteApIfName": "1.3.6.1.4.1.2011.5.25.318.1.2.4.1.3", "hwVirtualClusterAccessRemoteApIfOperState": "1.3.6.1.4.1.2011.5.25.318.1.2.4.1.4", "hwVirtualClusterAccessRemoteApIfReason": "1.3.6.1.4.1.2011.5.25.318.1.2.4.1.5"]
]

// --- hwRemoteApIfDownClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.318.2.4.2
// Fields: hwVirtualClusterAccessRemoteApIfName, hwVirtualClusterAccessRemoteApIfOperState, hwVirtualClusterAccessRemoteApIfReason
// Description: This notification indicates that remote AP interface changes to up.
trapMap["1.3.6.1.4.1.2011.5.25.318.2.4.2"] = [
    name: "hwRemoteApIfDownClear",
    fields: ["hwVirtualClusterAccessRemoteApIfName", "hwVirtualClusterAccessRemoteApIfOperState", "hwVirtualClusterAccessRemoteApIfReason"],
    fieldOids: ["hwVirtualClusterAccessRemoteApIfName": "1.3.6.1.4.1.2011.5.25.318.1.2.4.1.3", "hwVirtualClusterAccessRemoteApIfOperState": "1.3.6.1.4.1.2011.5.25.318.1.2.4.1.4", "hwVirtualClusterAccessRemoteApIfReason": "1.3.6.1.4.1.2011.5.25.318.1.2.4.1.5"]
]

// --- hwApDown (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.318.2.5.1
// Fields: hwVirtualClusterAccessApOperState, hwVirtualClusterAccessApReason
// Description: This notification indicates that AP changes to down.
trapMap["1.3.6.1.4.1.2011.5.25.318.2.5.1"] = [
    name: "hwApDown",
    fields: ["hwVirtualClusterAccessApOperState", "hwVirtualClusterAccessApReason"],
    fieldOids: ["hwVirtualClusterAccessApOperState": "1.3.6.1.4.1.2011.5.25.318.1.2.5.1.3", "hwVirtualClusterAccessApReason": "1.3.6.1.4.1.2011.5.25.318.1.2.5.1.4"]
]

// --- hwApDownClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.318.2.5.2
// Fields: hwVirtualClusterAccessApOperState, hwVirtualClusterAccessApReason
// Description: This notification indicates that AP changes to up.
trapMap["1.3.6.1.4.1.2011.5.25.318.2.5.2"] = [
    name: "hwApDownClear",
    fields: ["hwVirtualClusterAccessApOperState", "hwVirtualClusterAccessApReason"],
    fieldOids: ["hwVirtualClusterAccessApOperState": "1.3.6.1.4.1.2011.5.25.318.1.2.5.1.3", "hwVirtualClusterAccessApReason": "1.3.6.1.4.1.2011.5.25.318.1.2.5.1.4"]
]

// --- hwApLogin (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.318.2.5.3
// Fields: hwVirtualClusterAccessApOperState
// Description: This notification indicates that AP changes to up.
trapMap["1.3.6.1.4.1.2011.5.25.318.2.5.3"] = [
    name: "hwApLogin",
    fields: ["hwVirtualClusterAccessApOperState"],
    fieldOids: ["hwVirtualClusterAccessApOperState": "1.3.6.1.4.1.2011.5.25.318.1.2.5.1.3"]
]

// --- hwMasterPeerDown (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.318.2.6.1
// Fields: hwVirtualClusterAccessMasterPeerDownOperState, hwVirtualClusterAccessMasterPeerDownReason
// Description: This notification indicates that peer master was lost.
trapMap["1.3.6.1.4.1.2011.5.25.318.2.6.1"] = [
    name: "hwMasterPeerDown",
    fields: ["hwVirtualClusterAccessMasterPeerDownOperState", "hwVirtualClusterAccessMasterPeerDownReason"],
    fieldOids: ["hwVirtualClusterAccessMasterPeerDownOperState": "1.3.6.1.4.1.2011.5.25.318.1.2.6.1.3", "hwVirtualClusterAccessMasterPeerDownReason": "1.3.6.1.4.1.2011.5.25.318.1.2.6.1.4"]
]

// --- hwMasterPeerDownClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.318.2.6.2
// Fields: hwVirtualClusterAccessMasterPeerDownOperState, hwVirtualClusterAccessMasterPeerDownReason
// Description: This notification indicates that peer master lost resumed.
trapMap["1.3.6.1.4.1.2011.5.25.318.2.6.2"] = [
    name: "hwMasterPeerDownClear",
    fields: ["hwVirtualClusterAccessMasterPeerDownOperState", "hwVirtualClusterAccessMasterPeerDownReason"],
    fieldOids: ["hwVirtualClusterAccessMasterPeerDownOperState": "1.3.6.1.4.1.2011.5.25.318.1.2.6.1.3", "hwVirtualClusterAccessMasterPeerDownReason": "1.3.6.1.4.1.2011.5.25.318.1.2.6.1.4"]
]

// --- hwVirtualClusterAccessLinkDown (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.318.2.7.1
// Fields: hwVirtualClusterAccessLinkDownIfName, hwVirtualClusterAccessLinkDownIfAdminStatus, hwVirtualClusterAccessLinkDownIfOperStatus, hwVirtualClusterAccessLinkDownReason
// Description: This notification indicates that interface changes to down.
trapMap["1.3.6.1.4.1.2011.5.25.318.2.7.1"] = [
    name: "hwVirtualClusterAccessLinkDown",
    fields: ["hwVirtualClusterAccessLinkDownIfName", "hwVirtualClusterAccessLinkDownIfAdminStatus", "hwVirtualClusterAccessLinkDownIfOperStatus", "hwVirtualClusterAccessLinkDownReason"],
    fieldOids: ["hwVirtualClusterAccessLinkDownIfName": "1.3.6.1.4.1.2011.5.25.318.1.2.7.1.5", "hwVirtualClusterAccessLinkDownIfAdminStatus": "1.3.6.1.4.1.2011.5.25.318.1.2.7.1.3", "hwVirtualClusterAccessLinkDownIfOperStatus": "1.3.6.1.4.1.2011.5.25.318.1.2.7.1.4", "hwVirtualClusterAccessLinkDownReason": "1.3.6.1.4.1.2011.5.25.318.1.2.7.1.6"]
]

// --- hwVirtualClusterAccessLinkDownClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.318.2.7.2
// Fields: hwVirtualClusterAccessLinkDownIfName, hwVirtualClusterAccessLinkDownIfAdminStatus, hwVirtualClusterAccessLinkDownIfOperStatus, hwVirtualClusterAccessLinkDownReason
// Description: This notification indicates that interface changes to up.
trapMap["1.3.6.1.4.1.2011.5.25.318.2.7.2"] = [
    name: "hwVirtualClusterAccessLinkDownClear",
    fields: ["hwVirtualClusterAccessLinkDownIfName", "hwVirtualClusterAccessLinkDownIfAdminStatus", "hwVirtualClusterAccessLinkDownIfOperStatus", "hwVirtualClusterAccessLinkDownReason"],
    fieldOids: ["hwVirtualClusterAccessLinkDownIfName": "1.3.6.1.4.1.2011.5.25.318.1.2.7.1.5", "hwVirtualClusterAccessLinkDownIfAdminStatus": "1.3.6.1.4.1.2011.5.25.318.1.2.7.1.3", "hwVirtualClusterAccessLinkDownIfOperStatus": "1.3.6.1.4.1.2011.5.25.318.1.2.7.1.4", "hwVirtualClusterAccessLinkDownReason": "1.3.6.1.4.1.2011.5.25.318.1.2.7.1.6"]
]

// ===== Parsing logic =====

// Set to true to enable diagnostic logging for this MIB parser
DEBUG = false

LOG_PREFIX = "[HUAWEI-VIRTUALCLUSTERACCESS-MIB]"
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
