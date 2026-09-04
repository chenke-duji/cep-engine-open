/**
 * Auto-generated from OSPF-TRAP-MIB.mib
 * Generated: 2026-08-25T16:47:06.619665500
 * Traps/Notifications (20): ospfVirtIfStateChange, ospfNbrStateChange, ospfVirtNbrStateChange, ospfIfConfigError, ospfVirtIfConfigError, ospfIfAuthFailure, ospfVirtIfAuthFailure, ospfIfRxBadPacket, ospfVirtIfRxBadPacket, ospfTxRetransmit, ospfVirtIfTxRetransmit, ospfOriginateLsa, ospfMaxAgeLsa, ospfLsdbOverflow, ospfLsdbApproachingOverflow, ospfIfStateChange, ospfNssaTranslatorStatusChange, ospfRestartStatusChange, ospfNbrRestartHelperStatusChange, ospfVirtNbrRestartHelperStatusChange
 *
 * Mapping rules:
 *   node       = trap source IP (rawEvent.sourceIp)
 *   alertGroup/summary/severity/type = per-trap rule overrides
 */

import com.dujitech.cep.model.AlarmEvent
import com.dujitech.cep.model.EventType
import com.dujitech.cep.model.Severity

// ===== Trap OID -> definition mapping =====
// Key: fully resolved numeric OID, Value: [name, fields, fieldOids]
def trapMap = [:]

// ===== Name -> definition mapping (fallback for unresolved OIDs) =====
def trapNameMap = [:]

// --- ospfVirtIfStateChange (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.2.1.14.16.2.1
// Fields: ospfRouterId, ospfVirtIfAreaId, ospfVirtIfNeighbor, ospfVirtIfState
// Description: An ospfVirtIfStateChange trap signifies that there has been a change in the state of an OSPF virtual interface. This trap should be generated when the interface state regresses (e.g., goes from Point-...
trapMap["1.3.6.1.2.1.14.16.2.1"] = [
    name: "ospfVirtIfStateChange",
    fields: ["ospfRouterId", "ospfVirtIfAreaId", "ospfVirtIfNeighbor", "ospfVirtIfState"],
    fieldOids: ["ospfRouterId": "1.3.6.1.2.1.14.1.1", "ospfVirtIfAreaId": "1.3.6.1.2.1.14.9.1.1", "ospfVirtIfNeighbor": "1.3.6.1.2.1.14.9.1.2", "ospfVirtIfState": "1.3.6.1.2.1.14.9.1.7"]
]

// --- ospfNbrStateChange (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.2.1.14.16.2.2
// Fields: ospfRouterId, ospfNbrIpAddr, ospfNbrAddressLessIndex, ospfNbrRtrId, ospfNbrState
// Description: An ospfNbrStateChange trap signifies that there has been a change in the state of a non-virtual OSPF neighbor. This trap should be generated when the neighbor state regresses (e.g., goes from Attempt ...
trapMap["1.3.6.1.2.1.14.16.2.2"] = [
    name: "ospfNbrStateChange",
    fields: ["ospfRouterId", "ospfNbrIpAddr", "ospfNbrAddressLessIndex", "ospfNbrRtrId", "ospfNbrState"],
    fieldOids: ["ospfRouterId": "1.3.6.1.2.1.14.1.1", "ospfNbrIpAddr": "1.3.6.1.2.1.14.10.1.1", "ospfNbrAddressLessIndex": "1.3.6.1.2.1.14.10.1.2", "ospfNbrRtrId": "1.3.6.1.2.1.14.10.1.3", "ospfNbrState": "1.3.6.1.2.1.14.10.1.6"]
]

// --- ospfVirtNbrStateChange (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.2.1.14.16.2.3
// Fields: ospfRouterId, ospfVirtNbrArea, ospfVirtNbrRtrId, ospfVirtNbrState
// Description: An ospfVirtNbrStateChange trap signifies that there has been a change in the state of an OSPF virtual neighbor. This trap should be generated when the neighbor state regresses (e.g., goes from Attempt...
trapMap["1.3.6.1.2.1.14.16.2.3"] = [
    name: "ospfVirtNbrStateChange",
    fields: ["ospfRouterId", "ospfVirtNbrArea", "ospfVirtNbrRtrId", "ospfVirtNbrState"],
    fieldOids: ["ospfRouterId": "1.3.6.1.2.1.14.1.1", "ospfVirtNbrArea": "1.3.6.1.2.1.14.11.1.1", "ospfVirtNbrRtrId": "1.3.6.1.2.1.14.11.1.2", "ospfVirtNbrState": "1.3.6.1.2.1.14.11.1.5"]
]

// --- ospfIfConfigError (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.2.1.14.16.2.4
// Fields: ospfRouterId, ospfIfIpAddress, ospfAddressLessIf, ospfPacketSrc, ospfConfigErrorType, ospfPacketType
// Description: An ospfIfConfigError trap signifies that a packet has been received on a non-virtual interface from a router whose configuration parameters conflict with this router's configuration parameters. Note t...
trapMap["1.3.6.1.2.1.14.16.2.4"] = [
    name: "ospfIfConfigError",
    fields: ["ospfRouterId", "ospfIfIpAddress", "ospfAddressLessIf", "ospfPacketSrc", "ospfConfigErrorType", "ospfPacketType"],
    fieldOids: ["ospfRouterId": "1.3.6.1.2.1.14.1.1", "ospfIfIpAddress": "1.3.6.1.2.1.14.7.1.1", "ospfAddressLessIf": "1.3.6.1.2.1.14.7.1.2", "ospfPacketSrc": "1.3.6.1.2.1.14.16.1.4", "ospfConfigErrorType": "1.3.6.1.2.1.14.16.1.2", "ospfPacketType": "1.3.6.1.2.1.14.16.1.3"]
]

// --- ospfVirtIfConfigError (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.2.1.14.16.2.5
// Fields: ospfRouterId, ospfVirtIfAreaId, ospfVirtIfNeighbor, ospfConfigErrorType, ospfPacketType
// Description: An ospfVirtIfConfigError trap signifies that a packet has been received on a virtual interface from a router whose configuration parameters conflict with this router's configuration parameters. Note t...
trapMap["1.3.6.1.2.1.14.16.2.5"] = [
    name: "ospfVirtIfConfigError",
    fields: ["ospfRouterId", "ospfVirtIfAreaId", "ospfVirtIfNeighbor", "ospfConfigErrorType", "ospfPacketType"],
    fieldOids: ["ospfRouterId": "1.3.6.1.2.1.14.1.1", "ospfVirtIfAreaId": "1.3.6.1.2.1.14.9.1.1", "ospfVirtIfNeighbor": "1.3.6.1.2.1.14.9.1.2", "ospfConfigErrorType": "1.3.6.1.2.1.14.16.1.2", "ospfPacketType": "1.3.6.1.2.1.14.16.1.3"]
]

// --- ospfIfAuthFailure (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.2.1.14.16.2.6
// Fields: ospfRouterId, ospfIfIpAddress, ospfAddressLessIf, ospfPacketSrc, ospfConfigErrorType, ospfPacketType
// Description: An ospfIfAuthFailure trap signifies that a packet has been received on a non-virtual interface from a router whose authentication key or authentication type conflicts with this router's authentication...
trapMap["1.3.6.1.2.1.14.16.2.6"] = [
    name: "ospfIfAuthFailure",
    fields: ["ospfRouterId", "ospfIfIpAddress", "ospfAddressLessIf", "ospfPacketSrc", "ospfConfigErrorType", "ospfPacketType"],
    fieldOids: ["ospfRouterId": "1.3.6.1.2.1.14.1.1", "ospfIfIpAddress": "1.3.6.1.2.1.14.7.1.1", "ospfAddressLessIf": "1.3.6.1.2.1.14.7.1.2", "ospfPacketSrc": "1.3.6.1.2.1.14.16.1.4", "ospfConfigErrorType": "1.3.6.1.2.1.14.16.1.2", "ospfPacketType": "1.3.6.1.2.1.14.16.1.3"]
]

// --- ospfVirtIfAuthFailure (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.2.1.14.16.2.7
// Fields: ospfRouterId, ospfVirtIfAreaId, ospfVirtIfNeighbor, ospfConfigErrorType, ospfPacketType
// Description: An ospfVirtIfAuthFailure trap signifies that a packet has been received on a virtual interface from a router whose authentication key or authentication type conflicts with this router's authentication...
trapMap["1.3.6.1.2.1.14.16.2.7"] = [
    name: "ospfVirtIfAuthFailure",
    fields: ["ospfRouterId", "ospfVirtIfAreaId", "ospfVirtIfNeighbor", "ospfConfigErrorType", "ospfPacketType"],
    fieldOids: ["ospfRouterId": "1.3.6.1.2.1.14.1.1", "ospfVirtIfAreaId": "1.3.6.1.2.1.14.9.1.1", "ospfVirtIfNeighbor": "1.3.6.1.2.1.14.9.1.2", "ospfConfigErrorType": "1.3.6.1.2.1.14.16.1.2", "ospfPacketType": "1.3.6.1.2.1.14.16.1.3"]
]

// --- ospfIfRxBadPacket (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.2.1.14.16.2.8
// Fields: ospfRouterId, ospfIfIpAddress, ospfAddressLessIf, ospfPacketSrc, ospfPacketType
// Description: An ospfIfRxBadPacket trap signifies that an OSPF packet has been received on a non-virtual interface that cannot be parsed.
trapMap["1.3.6.1.2.1.14.16.2.8"] = [
    name: "ospfIfRxBadPacket",
    fields: ["ospfRouterId", "ospfIfIpAddress", "ospfAddressLessIf", "ospfPacketSrc", "ospfPacketType"],
    fieldOids: ["ospfRouterId": "1.3.6.1.2.1.14.1.1", "ospfIfIpAddress": "1.3.6.1.2.1.14.7.1.1", "ospfAddressLessIf": "1.3.6.1.2.1.14.7.1.2", "ospfPacketSrc": "1.3.6.1.2.1.14.16.1.4", "ospfPacketType": "1.3.6.1.2.1.14.16.1.3"]
]

// --- ospfVirtIfRxBadPacket (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.2.1.14.16.2.9
// Fields: ospfRouterId, ospfVirtIfAreaId, ospfVirtIfNeighbor, ospfPacketType
// Description: An ospfVirtIfRxBadPacket trap signifies that an OSPF packet has been received on a virtual interface that cannot be parsed.
trapMap["1.3.6.1.2.1.14.16.2.9"] = [
    name: "ospfVirtIfRxBadPacket",
    fields: ["ospfRouterId", "ospfVirtIfAreaId", "ospfVirtIfNeighbor", "ospfPacketType"],
    fieldOids: ["ospfRouterId": "1.3.6.1.2.1.14.1.1", "ospfVirtIfAreaId": "1.3.6.1.2.1.14.9.1.1", "ospfVirtIfNeighbor": "1.3.6.1.2.1.14.9.1.2", "ospfPacketType": "1.3.6.1.2.1.14.16.1.3"]
]

// --- ospfTxRetransmit (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.2.1.14.16.2.10
// Fields: ospfRouterId, ospfIfIpAddress, ospfAddressLessIf, ospfNbrRtrId, ospfPacketType, ospfLsdbType, ospfLsdbLsid, ospfLsdbRouterId
// Description: An ospfTxRetransmit trap signifies than an OSPF packet has been retransmitted on a non-virtual interface. All packets that may be retransmitted are associated with an LSDB entry. The LS type, LS ID, a...
trapMap["1.3.6.1.2.1.14.16.2.10"] = [
    name: "ospfTxRetransmit",
    fields: ["ospfRouterId", "ospfIfIpAddress", "ospfAddressLessIf", "ospfNbrRtrId", "ospfPacketType", "ospfLsdbType", "ospfLsdbLsid", "ospfLsdbRouterId"],
    fieldOids: ["ospfRouterId": "1.3.6.1.2.1.14.1.1", "ospfIfIpAddress": "1.3.6.1.2.1.14.7.1.1", "ospfAddressLessIf": "1.3.6.1.2.1.14.7.1.2", "ospfNbrRtrId": "1.3.6.1.2.1.14.10.1.3", "ospfPacketType": "1.3.6.1.2.1.14.16.1.3", "ospfLsdbType": "1.3.6.1.2.1.14.4.1.2", "ospfLsdbLsid": "1.3.6.1.2.1.14.4.1.3", "ospfLsdbRouterId": "1.3.6.1.2.1.14.4.1.4"]
]

// --- ospfVirtIfTxRetransmit (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.2.1.14.16.2.11
// Fields: ospfRouterId, ospfVirtIfAreaId, ospfVirtIfNeighbor, ospfPacketType, ospfLsdbType, ospfLsdbLsid, ospfLsdbRouterId
// Description: An ospfVirtIfTxRetransmit trap signifies than an OSPF packet has been retransmitted on a virtual interface. All packets that may be retransmitted are associated with an LSDB entry. The LS type, LS ID,...
trapMap["1.3.6.1.2.1.14.16.2.11"] = [
    name: "ospfVirtIfTxRetransmit",
    fields: ["ospfRouterId", "ospfVirtIfAreaId", "ospfVirtIfNeighbor", "ospfPacketType", "ospfLsdbType", "ospfLsdbLsid", "ospfLsdbRouterId"],
    fieldOids: ["ospfRouterId": "1.3.6.1.2.1.14.1.1", "ospfVirtIfAreaId": "1.3.6.1.2.1.14.9.1.1", "ospfVirtIfNeighbor": "1.3.6.1.2.1.14.9.1.2", "ospfPacketType": "1.3.6.1.2.1.14.16.1.3", "ospfLsdbType": "1.3.6.1.2.1.14.4.1.2", "ospfLsdbLsid": "1.3.6.1.2.1.14.4.1.3", "ospfLsdbRouterId": "1.3.6.1.2.1.14.4.1.4"]
]

// --- ospfOriginateLsa (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.2.1.14.16.2.12
// Fields: ospfRouterId, ospfLsdbAreaId, ospfLsdbType, ospfLsdbLsid, ospfLsdbRouterId
// Description: An ospfOriginateLsa trap signifies that a new LSA has been originated by this router. This trap should not be invoked for simple refreshes of LSAs (which happens every 30 minutes), but instead will on...
trapMap["1.3.6.1.2.1.14.16.2.12"] = [
    name: "ospfOriginateLsa",
    fields: ["ospfRouterId", "ospfLsdbAreaId", "ospfLsdbType", "ospfLsdbLsid", "ospfLsdbRouterId"],
    fieldOids: ["ospfRouterId": "1.3.6.1.2.1.14.1.1", "ospfLsdbAreaId": "1.3.6.1.2.1.14.4.1.1", "ospfLsdbType": "1.3.6.1.2.1.14.4.1.2", "ospfLsdbLsid": "1.3.6.1.2.1.14.4.1.3", "ospfLsdbRouterId": "1.3.6.1.2.1.14.4.1.4"]
]

// --- ospfMaxAgeLsa (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.2.1.14.16.2.13
// Fields: ospfRouterId, ospfLsdbAreaId, ospfLsdbType, ospfLsdbLsid, ospfLsdbRouterId
// Description: An ospfMaxAgeLsa trap signifies that one of the LSAs in the router's link state database has aged to MaxAge.
trapMap["1.3.6.1.2.1.14.16.2.13"] = [
    name: "ospfMaxAgeLsa",
    fields: ["ospfRouterId", "ospfLsdbAreaId", "ospfLsdbType", "ospfLsdbLsid", "ospfLsdbRouterId"],
    fieldOids: ["ospfRouterId": "1.3.6.1.2.1.14.1.1", "ospfLsdbAreaId": "1.3.6.1.2.1.14.4.1.1", "ospfLsdbType": "1.3.6.1.2.1.14.4.1.2", "ospfLsdbLsid": "1.3.6.1.2.1.14.4.1.3", "ospfLsdbRouterId": "1.3.6.1.2.1.14.4.1.4"]
]

// --- ospfLsdbOverflow (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.2.1.14.16.2.14
// Fields: ospfRouterId, ospfExtLsdbLimit
// Description: An ospfLsdbOverflow trap signifies that the number of LSAs in the router's link state database has exceeded ospfExtLsdbLimit.
trapMap["1.3.6.1.2.1.14.16.2.14"] = [
    name: "ospfLsdbOverflow",
    fields: ["ospfRouterId", "ospfExtLsdbLimit"],
    fieldOids: ["ospfRouterId": "1.3.6.1.2.1.14.1.1", "ospfExtLsdbLimit": "1.3.6.1.2.1.14.1.11"]
]

// --- ospfLsdbApproachingOverflow (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.2.1.14.16.2.15
// Fields: ospfRouterId, ospfExtLsdbLimit
// Description: An ospfLsdbApproachingOverflow trap signifies that the number of LSAs in the router's link state database has exceeded ninety percent of ospfExtLsdbLimit.
trapMap["1.3.6.1.2.1.14.16.2.15"] = [
    name: "ospfLsdbApproachingOverflow",
    fields: ["ospfRouterId", "ospfExtLsdbLimit"],
    fieldOids: ["ospfRouterId": "1.3.6.1.2.1.14.1.1", "ospfExtLsdbLimit": "1.3.6.1.2.1.14.1.11"]
]

// --- ospfIfStateChange (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.2.1.14.16.2.16
// Fields: ospfRouterId, ospfIfIpAddress, ospfAddressLessIf, ospfIfState
// Description: An ospfIfStateChange trap signifies that there has been a change in the state of a non-virtual OSPF interface. This trap should be generated when the interface state regresses (e.g., goes from Dr to D...
trapMap["1.3.6.1.2.1.14.16.2.16"] = [
    name: "ospfIfStateChange",
    fields: ["ospfRouterId", "ospfIfIpAddress", "ospfAddressLessIf", "ospfIfState"],
    fieldOids: ["ospfRouterId": "1.3.6.1.2.1.14.1.1", "ospfIfIpAddress": "1.3.6.1.2.1.14.7.1.1", "ospfAddressLessIf": "1.3.6.1.2.1.14.7.1.2", "ospfIfState": "1.3.6.1.2.1.14.7.1.12"]
]

// --- ospfNssaTranslatorStatusChange (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.2.1.14.16.2.17
// Fields: ospfRouterId, ospfAreaId, ospfAreaNssaTranslatorState
// Description: An ospfNssaTranslatorStatusChange trap indicates that there has been a change in the router's ability to translate OSPF type-7 LSAs into OSPF type-5 LSAs. This trap should be generated when the transl...
trapMap["1.3.6.1.2.1.14.16.2.17"] = [
    name: "ospfNssaTranslatorStatusChange",
    fields: ["ospfRouterId", "ospfAreaId", "ospfAreaNssaTranslatorState"],
    fieldOids: ["ospfRouterId": "1.3.6.1.2.1.14.1.1", "ospfAreaId": "1.3.6.1.2.1.14.2.1.1", "ospfAreaNssaTranslatorState": "1.3.6.1.2.1.14.2.1.12"]
]

// --- ospfRestartStatusChange (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.2.1.14.16.2.18
// Fields: ospfRouterId, ospfRestartStatus, ospfRestartInterval, ospfRestartExitReason
// Description: An ospfRestartStatusChange trap signifies that there has been a change in the graceful restart state for the router. This trap should be generated when the router restart status changes.
trapMap["1.3.6.1.2.1.14.16.2.18"] = [
    name: "ospfRestartStatusChange",
    fields: ["ospfRouterId", "ospfRestartStatus", "ospfRestartInterval", "ospfRestartExitReason"],
    fieldOids: ["ospfRouterId": "1.3.6.1.2.1.14.1.1", "ospfRestartStatus": "1.3.6.1.2.1.14.1.21", "ospfRestartInterval": "1.3.6.1.2.1.14.1.19", "ospfRestartExitReason": "1.3.6.1.2.1.14.1.23"]
]

// --- ospfNbrRestartHelperStatusChange (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.2.1.14.16.2.19
// Fields: ospfRouterId, ospfNbrIpAddr, ospfNbrAddressLessIndex, ospfNbrRtrId, ospfNbrRestartHelperStatus, ospfNbrRestartHelperAge, ospfNbrRestartHelperExitReason
// Description: An ospfNbrRestartHelperStatusChange trap signifies that there has been a change in the graceful restart helper state for the neighbor. This trap should be generated when the neighbor restart helper st...
trapMap["1.3.6.1.2.1.14.16.2.19"] = [
    name: "ospfNbrRestartHelperStatusChange",
    fields: ["ospfRouterId", "ospfNbrIpAddr", "ospfNbrAddressLessIndex", "ospfNbrRtrId", "ospfNbrRestartHelperStatus", "ospfNbrRestartHelperAge", "ospfNbrRestartHelperExitReason"],
    fieldOids: ["ospfRouterId": "1.3.6.1.2.1.14.1.1", "ospfNbrIpAddr": "1.3.6.1.2.1.14.10.1.1", "ospfNbrAddressLessIndex": "1.3.6.1.2.1.14.10.1.2", "ospfNbrRtrId": "1.3.6.1.2.1.14.10.1.3", "ospfNbrRestartHelperStatus": "1.3.6.1.2.1.14.10.1.12", "ospfNbrRestartHelperAge": "1.3.6.1.2.1.14.10.1.13", "ospfNbrRestartHelperExitReason": "1.3.6.1.2.1.14.10.1.14"]
]

// --- ospfVirtNbrRestartHelperStatusChange (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.2.1.14.16.2.20
// Fields: ospfRouterId, ospfVirtNbrArea, ospfVirtNbrRtrId, ospfVirtNbrRestartHelperStatus, ospfVirtNbrRestartHelperAge, ospfVirtNbrRestartHelperExitReason
// Description: An ospfVirtNbrRestartHelperStatusChange trap signifies that there has been a change in the graceful restart helper state for the virtual neighbor. This trap should be generated when the virtual neighb...
trapMap["1.3.6.1.2.1.14.16.2.20"] = [
    name: "ospfVirtNbrRestartHelperStatusChange",
    fields: ["ospfRouterId", "ospfVirtNbrArea", "ospfVirtNbrRtrId", "ospfVirtNbrRestartHelperStatus", "ospfVirtNbrRestartHelperAge", "ospfVirtNbrRestartHelperExitReason"],
    fieldOids: ["ospfRouterId": "1.3.6.1.2.1.14.1.1", "ospfVirtNbrArea": "1.3.6.1.2.1.14.11.1.1", "ospfVirtNbrRtrId": "1.3.6.1.2.1.14.11.1.2", "ospfVirtNbrRestartHelperStatus": "1.3.6.1.2.1.14.11.1.9", "ospfVirtNbrRestartHelperAge": "1.3.6.1.2.1.14.11.1.10", "ospfVirtNbrRestartHelperExitReason": "1.3.6.1.2.1.14.11.1.11"]
]

// ===== Lookup tables (inlined) =====
def lookupTables = [:]

// ===== Parsing logic =====

// Set to true to enable diagnostic logging for this MIB parser
DEBUG = false

LOG_PREFIX = "[OSPF-TRAP-MIB]"
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
// --- Trap: ospfVirtIfStateChange (OID 1.3.6.1.2.1.14.16.2.1) ---
if (trapRuleName == "ospfVirtIfStateChange") {
    event.setAlertGroup("OSPF Virtual Interface Status")
    def alertKey = "ospfVirtIfEntry." + gf[2] + "." + gf[3]
    event.setAlertKey(alertKey)
    def summary = "Ospf Virt If State Change" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    if (gf[4] == "1") {
        event.setSeverity(4)
        event.setEventType("1")
    }
    else if (gf[4] == "4") {
        event.setSeverity(1)
        event.setEventType("2")
    }
    else if (true) {
        event.setSeverity(2)
        event.setEventType("1")
    }
}
// --- Trap: ospfNbrStateChange (OID 1.3.6.1.2.1.14.16.2.2) ---
if (trapRuleName == "ospfNbrStateChange") {
    event.setAlertGroup("OSPF Neighbor Status")
    def alertKey = "ospfNbrEntry." + gf[2] + "." + gf[3]
    event.setAlertKey(alertKey)
    def summary = "Ospf Nbr State Change" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    if (gf[5] == "1") {
        event.setSeverity(4)
        event.setEventType("1")
    }
    else if (gf[5] == "2") {
        event.setSeverity(2)
        event.setEventType("12")
    }
    else if (gf[5] == "3") {
        event.setSeverity(2)
        event.setEventType("12")
    }
    else if (gf[5] == "4") {
        event.setSeverity(2)
        event.setEventType("12")
    }
    else if (gf[5] == "5") {
        event.setSeverity(2)
        event.setEventType("12")
    }
    else if (gf[5] == "6") {
        event.setSeverity(2)
        event.setEventType("12")
    }
    else if (gf[5] == "7") {
        event.setSeverity(2)
        event.setEventType("12")
    }
    else if (gf[5] == "8") {
        event.setSeverity(1)
        event.setEventType("2")
    }
    else if (true) {
        event.setSeverity(2)
        event.setEventType("1")
    }
}
// --- Trap: ospfVirtNbrStateChange (OID 1.3.6.1.2.1.14.16.2.3) ---
if (trapRuleName == "ospfVirtNbrStateChange") {
    event.setAlertGroup("OSPF Virtual Neighbor Status")
    def alertKey = "ospfVirtNbrEntry." + gf[2] + "." + gf[3]
    event.setAlertKey(alertKey)
    def summary = "Ospf Virt Nbr State Change" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    if (gf[4] == "1") {
        event.setSeverity(4)
        event.setEventType("1")
    }
    else if (gf[4] == "2") {
        event.setSeverity(2)
        event.setEventType("12")
    }
    else if (gf[4] == "3") {
        event.setSeverity(2)
        event.setEventType("12")
    }
    else if (gf[4] == "4") {
        event.setSeverity(2)
        event.setEventType("12")
    }
    else if (gf[4] == "5") {
        event.setSeverity(2)
        event.setEventType("12")
    }
    else if (gf[4] == "6") {
        event.setSeverity(2)
        event.setEventType("12")
    }
    else if (gf[4] == "7") {
        event.setSeverity(2)
        event.setEventType("12")
    }
    else if (gf[4] == "8") {
        event.setSeverity(1)
        event.setEventType("2")
    }
    else if (true) {
        event.setSeverity(2)
        event.setEventType("1")
    }
}
// --- Trap: ospfIfConfigError (OID 1.3.6.1.2.1.14.16.2.4) ---
if (trapRuleName == "ospfIfConfigError") {
    event.setAlertGroup("OSPF Interface Configuration")
    def alertKey = "ospfIfEntry." + gf[2] + "." + gf[3]
    event.setAlertKey(alertKey)
    def summary = "Ospf If Config Error" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(3)
    event.setEventType("1")
}
// --- Trap: ospfVirtIfConfigError (OID 1.3.6.1.2.1.14.16.2.5) ---
if (trapRuleName == "ospfVirtIfConfigError") {
    event.setAlertGroup("OSPF Virtual Interface Configuration")
    def alertKey = "ospfVirtIfEntry." + gf[2] + "." + gf[3]
    event.setAlertKey(alertKey)
    def summary = "Ospf Virt If Config Error" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(3)
    event.setEventType("1")
}
// --- Trap: ospfIfAuthFailure (OID 1.3.6.1.2.1.14.16.2.6) ---
if (trapRuleName == "ospfIfAuthFailure") {
    event.setAlertGroup("OSPF Interface Authorization")
    def alertKey = "ospfIfEntry." + gf[2] + "." + gf[3]
    event.setAlertKey(alertKey)
    def summary = "Ospf If Auth Failure" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(3)
    event.setEventType("1")
}
// --- Trap: ospfVirtIfAuthFailure (OID 1.3.6.1.2.1.14.16.2.7) ---
if (trapRuleName == "ospfVirtIfAuthFailure") {
    event.setAlertGroup("OSPF Virtual Interface Authorization")
    def alertKey = "ospfVirtIfEntry." + gf[2] + "." + gf[3]
    event.setAlertKey(alertKey)
    def summary = "Ospf Virt If Auth Failure" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(3)
    event.setEventType("1")
}
// --- Trap: ospfIfRxBadPacket (OID 1.3.6.1.2.1.14.16.2.8) ---
if (trapRuleName == "ospfIfRxBadPacket") {
    event.setAlertGroup("OSPF Interface Rx Packet")
    def alertKey = "ospfIfEntry." + gf[2] + "." + gf[3]
    event.setAlertKey(alertKey)
    def summary = "Ospf If Rx Bad Packet" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(3)
    event.setEventType("1")
}
// --- Trap: ospfVirtIfRxBadPacket (OID 1.3.6.1.2.1.14.16.2.9) ---
if (trapRuleName == "ospfVirtIfRxBadPacket") {
    event.setAlertGroup("OSPF Virtual Interface Rx Packet")
    def alertKey = "ospfVirtIfEntry." + gf[2] + "." + gf[3]
    event.setAlertKey(alertKey)
    def summary = "Ospf Virt If Rx Bad Packet" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(3)
    event.setEventType("1")
}
// --- Trap: ospfTxRetransmit (OID 1.3.6.1.2.1.14.16.2.10) ---
if (trapRuleName == "ospfTxRetransmit") {
    event.setAlertGroup("OSPF Interface Retransmit")
    def alertKey = "ospfIfEntry." + gf[2] + "." + gf[3]
    event.setAlertKey(alertKey)
    def summary = "Ospf Tx Retransmit" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(3)
    event.setEventType("1")
}
// --- Trap: ospfVirtIfTxRetransmit (OID 1.3.6.1.2.1.14.16.2.11) ---
if (trapRuleName == "ospfVirtIfTxRetransmit") {
    event.setAlertGroup("OSPF Virtual Interface Retransmit")
    def alertKey = "ospfVirtIfEntry." + gf[2] + "." + gf[3]
    event.setAlertKey(alertKey)
    def summary = "Ospf Virt If Tx Retransmit" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(3)
    event.setEventType("1")
}
// --- Trap: ospfOriginateLsa (OID 1.3.6.1.2.1.14.16.2.12) ---
if (trapRuleName == "ospfOriginateLsa") {
    event.setAlertGroup("OSPF LSA Status")
    def alertKey = "ospfLsdbEntry." + gf[2] + "." + gf[3] + "." + gf[4] + "." + gf[5]
    event.setAlertKey(alertKey)
    def summary = "Ospf Originate Lsa" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(2)
    event.setEventType("13")
}
// --- Trap: ospfMaxAgeLsa (OID 1.3.6.1.2.1.14.16.2.13) ---
if (trapRuleName == "ospfMaxAgeLsa") {
    event.setAlertGroup("OSPF LSA Age")
    def alertKey = "ospfLsdbEntry." + gf[2] + "." + gf[3] + "." + gf[4] + "." + gf[5]
    event.setAlertKey(alertKey)
    def summary = "Ospf Max Age Lsa" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(2)
    event.setEventType("1")
}
// --- Trap: ospfLsdbOverflow (OID 1.3.6.1.2.1.14.16.2.14) ---
if (trapRuleName == "ospfLsdbOverflow") {
    event.setAlertGroup("OSPF LSDB Status")
    def alertKey = ""
    event.setAlertKey(alertKey)
    def summary = "Ospf Lsdb Overflow" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(4)
    event.setEventType("1")
    def dyn = event.getDynamicFields() ?: [:]
    dyn["snmpTrapEnterprise"] = varbinds.get("snmpTrapEnterprise")
    dyn["ospfRouterId"] = varbinds.get("ospfRouterId")
    dyn["ospfExtLsdbLimit"] = varbinds.get("ospfExtLsdbLimit")
    dyn["ospfRouterId"] = varbinds.get("ospfRouterId")
    dyn["ospfExtLsdbLimit"] = varbinds.get("ospfExtLsdbLimit")
    event.setDynamicFields(dyn)
}
// --- Trap: ospfLsdbApproachingOverflow (OID 1.3.6.1.2.1.14.16.2.15) ---
if (trapRuleName == "ospfLsdbApproachingOverflow") {
    event.setAlertGroup("OSPF LSDB Status")
    def alertKey = ""
    event.setAlertKey(alertKey)
    def summary = "Ospf Lsdb Approaching Overflow" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(2)
    event.setEventType("1")
    def dyn = event.getDynamicFields() ?: [:]
    dyn["snmpTrapEnterprise"] = varbinds.get("snmpTrapEnterprise")
    dyn["ospfRouterId"] = varbinds.get("ospfRouterId")
    dyn["ospfExtLsdbLimit"] = varbinds.get("ospfExtLsdbLimit")
    dyn["ospfRouterId"] = varbinds.get("ospfRouterId")
    dyn["ospfExtLsdbLimit"] = varbinds.get("ospfExtLsdbLimit")
    event.setDynamicFields(dyn)
}
// --- Trap: ospfIfStateChange (OID 1.3.6.1.2.1.14.16.2.16) ---
if (trapRuleName == "ospfIfStateChange") {
    event.setAlertGroup("OSPF Interface Status")
    def alertKey = "ospfIfEntry." + gf[2] + "." + gf[3]
    event.setAlertKey(alertKey)
    def summary = "Ospf If State Change" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    if (gf[4] == "1") {
        event.setSeverity(4)
        event.setEventType("1")
    }
    else if (gf[4] == "2") {
        event.setSeverity(2)
        event.setEventType("12")
    }
    else if (gf[4] == "3") {
        event.setSeverity(2)
        event.setEventType("1")
    }
    else if (gf[4] == "4") {
        event.setSeverity(1)
        event.setEventType("2")
    }
    else if (gf[4] == "5") {
        event.setSeverity(1)
        event.setEventType("2")
    }
    else if (gf[4] == "6") {
        event.setSeverity(1)
        event.setEventType("2")
    }
    else if (gf[4] == "7") {
        event.setSeverity(1)
        event.setEventType("2")
    }
    else if (true) {
        event.setSeverity(2)
        event.setEventType("1")
    }
}
// --- Trap: ospfNssaTranslatorStatusChange (OID 1.3.6.1.2.1.14.16.2.17) ---
if (trapRuleName == "ospfNssaTranslatorStatusChange") {
    event.setAlertGroup("OSPF NSSA Translator Status")
    def alertKey = "ospfAreaEntry." + gf[2]
    event.setAlertKey(alertKey)
    def summary = "Ospf Nssa Translator Status Change" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    if (gf[3] == "1") {
        event.setSeverity(2)
        event.setEventType("13")
        if (event.getDynamicFields() == null) event.setDynamicFields([:])
        event.getDynamicFields()["_expireTime"] = 1800
    }
    else if (gf[3] == "2") {
        event.setSeverity(1)
        event.setEventType("2")
    }
    else if (gf[3] == "3") {
        event.setSeverity(2)
        event.setEventType("1")
    }
    else if (true) {
        event.setSeverity(2)
        event.setEventType("1")
    }
    def dyn = event.getDynamicFields() ?: [:]
    dyn["ospfRouterId"] = varbinds.get("ospfRouterId")
    dyn["ospfAreaId"] = varbinds.get("ospfAreaId")
    dyn["ospfAreaNssaTranslatorState"] = varbinds.get("ospfAreaNssaTranslatorState")
    event.setDynamicFields(dyn)
}
// --- Trap: ospfRestartStatusChange (OID 1.3.6.1.2.1.14.16.2.18) ---
if (trapRuleName == "ospfRestartStatusChange") {
    event.setAlertGroup("OSPF Restart Status")
    def alertKey = ""
    event.setAlertKey(alertKey)
    def summary = "Ospf Restart Status Change" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    if (gf[2] == "1") {
        event.setSeverity(4)
        event.setEventType("1")
    }
    else if (gf[2] == "2") {
        event.setSeverity(2)
        event.setEventType("1")
    }
    else if (gf[2] == "3") {
        event.setSeverity(3)
        event.setEventType("1")
    }
    else if (true) {
        event.setSeverity(2)
        event.setEventType("1")
    }
}
// --- Trap: ospfNbrRestartHelperStatusChange (OID 1.3.6.1.2.1.14.16.2.19) ---
if (trapRuleName == "ospfNbrRestartHelperStatusChange") {
    event.setAlertGroup("OSPF Neighbor Restart Helper Status")
    def alertKey = "ospfNbrEntry." + gf[2] + "." + gf[3]
    event.setAlertKey(alertKey)
    def summary = "Ospf Nbr Restart Helper Status Change" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    if (gf[5] == "1") {
        event.setSeverity(3)
        event.setEventType("1")
    }
    else if (gf[5] == "2") {
        event.setSeverity(1)
        event.setEventType("2")
    }
    else if (true) {
        event.setSeverity(2)
        event.setEventType("1")
    }
}
// --- Trap: ospfVirtNbrRestartHelperStatusChange (OID 1.3.6.1.2.1.14.16.2.20) ---
if (trapRuleName == "ospfVirtNbrRestartHelperStatusChange") {
    event.setAlertGroup("OSPF Virtual Neighbor Restart Helper Status")
    def alertKey = "ospfVirtNbrEntry." + gf[2] + "." + gf[3]
    event.setAlertKey(alertKey)
    def summary = "Ospf Virt Nbr Restart Helper Status Change" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    if (gf[4] == "1") {
        event.setSeverity(3)
        event.setEventType("1")
    }
    else if (gf[4] == "2") {
        event.setSeverity(1)
        event.setEventType("2")
    }
    else if (true) {
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
