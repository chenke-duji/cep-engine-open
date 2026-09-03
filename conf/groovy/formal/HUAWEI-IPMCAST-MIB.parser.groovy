/**
 * Auto-generated from HUAWEI-IPMCAST-MIB.mib
 * Generated: 2026-08-24T18:28:29.949907400
 * Traps/Notifications (18): hwIpMcastDownstreamChannelLimit, hwIpMcastDownstreamTotalLimit, hwIpMcastGlobalChannelLimit, hwIpMcastGlobalTotalLimit, hwIpMcastOutChannelExceededLimit, hwIpMcastOutTotalExceededLimit, hwIpMcastGlobalChannelExceededLimit, hwIpMcastGlobalTotalExceededLimit, hwMFIBEntryOverloadSuspend, hwMFIBEntryOverloadSusResume, hwMFIBEntryOifOverloadSuspend, hwMFIBEntryOifOverloadSusResume, hwIpMcastSGThresholdExceed, hwIpMcastSGThresholdExceedClear, hwIpMcastSGExceed, hwIpMcastSGExceedClear, hwMcastEntryExceed, hwMcastEntryExceedClear
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

// --- hwIpMcastDownstreamChannelLimit (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.149.1.2.1
// Fields: hwIpMcastChannelSource, hwIpMcastChannelGroup, hwIpMcastChannelInterfaceIfIndex, hwIpMcastChannelName, hwIpMcastChannelDownstreamEntries, hwIpMcastChannelDownstreamBandWidth, hwIpMcastChannelInterfaceName, hwIpMcastInstanceName
// Description: A hwIpMcastDownstreamChannelLimit notification signifies that an entry belongs to specified channel has been limited. This notification is generated whenever an entry belongs to specified channel fail...
trapMap["1.3.6.1.4.1.2011.5.25.149.1.2.1"] = [
    name: "hwIpMcastDownstreamChannelLimit",
    fields: ["hwIpMcastChannelSource", "hwIpMcastChannelGroup", "hwIpMcastChannelInterfaceIfIndex", "hwIpMcastChannelName", "hwIpMcastChannelDownstreamEntries", "hwIpMcastChannelDownstreamBandWidth", "hwIpMcastChannelInterfaceName", "hwIpMcastInstanceName"],
    fieldOids: ["hwIpMcastChannelSource": "1.3.6.1.4.1.2011.5.25.149.1.1.1.10", "hwIpMcastChannelGroup": "1.3.6.1.4.1.2011.5.25.149.1.1.1.9", "hwIpMcastChannelInterfaceIfIndex": "1.3.6.1.4.1.2011.5.25.149.1.1.1.17", "hwIpMcastChannelName": "1.3.6.1.4.1.2011.5.25.149.1.1.1.8", "hwIpMcastChannelDownstreamEntries": "1.3.6.1.4.1.2011.5.25.149.1.1.1.11", "hwIpMcastChannelDownstreamBandWidth": "1.3.6.1.4.1.2011.5.25.149.1.1.1.12", "hwIpMcastChannelInterfaceName": "1.3.6.1.4.1.2011.5.25.149.1.1.1.18", "hwIpMcastInstanceName": "1.3.6.1.4.1.2011.5.25.149.1.1.1.25"]
]

// --- hwIpMcastDownstreamTotalLimit (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.149.1.2.2
// Fields: hwIpMcastChannelSource, hwIpMcastChannelGroup, hwIpMcastChannelInterfaceIfIndex, hwIpMcastChannelDownstreamEntries, hwIpMcastChannelDownstreamBandWidth, hwIpMcastChannelInterfaceName, hwIpMcastInstanceName
// Description: A hwIpMcastDownstreamTotalLimit notification signifies that an entry has been limited. This notification is generated whenever an entry failed to add downstream cause total downstream entry or bandwid...
trapMap["1.3.6.1.4.1.2011.5.25.149.1.2.2"] = [
    name: "hwIpMcastDownstreamTotalLimit",
    fields: ["hwIpMcastChannelSource", "hwIpMcastChannelGroup", "hwIpMcastChannelInterfaceIfIndex", "hwIpMcastChannelDownstreamEntries", "hwIpMcastChannelDownstreamBandWidth", "hwIpMcastChannelInterfaceName", "hwIpMcastInstanceName"],
    fieldOids: ["hwIpMcastChannelSource": "1.3.6.1.4.1.2011.5.25.149.1.1.1.10", "hwIpMcastChannelGroup": "1.3.6.1.4.1.2011.5.25.149.1.1.1.9", "hwIpMcastChannelInterfaceIfIndex": "1.3.6.1.4.1.2011.5.25.149.1.1.1.17", "hwIpMcastChannelDownstreamEntries": "1.3.6.1.4.1.2011.5.25.149.1.1.1.11", "hwIpMcastChannelDownstreamBandWidth": "1.3.6.1.4.1.2011.5.25.149.1.1.1.12", "hwIpMcastChannelInterfaceName": "1.3.6.1.4.1.2011.5.25.149.1.1.1.18", "hwIpMcastInstanceName": "1.3.6.1.4.1.2011.5.25.149.1.1.1.25"]
]

// --- hwIpMcastGlobalChannelLimit (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.149.1.2.3
// Fields: hwIpMcastChannelSource, hwIpMcastChannelGroup, hwIpMcastChannelName, hwIpMcastChannelGlobalEntries, hwIpMcastInstanceName
// Description: A hwIpMcastGlobalChannelLimit notification signifies that an entry belongs to specified channel has been limited for global limit. This notification is generated whenever an entry belongs to specified...
trapMap["1.3.6.1.4.1.2011.5.25.149.1.2.3"] = [
    name: "hwIpMcastGlobalChannelLimit",
    fields: ["hwIpMcastChannelSource", "hwIpMcastChannelGroup", "hwIpMcastChannelName", "hwIpMcastChannelGlobalEntries", "hwIpMcastInstanceName"],
    fieldOids: ["hwIpMcastChannelSource": "1.3.6.1.4.1.2011.5.25.149.1.1.1.10", "hwIpMcastChannelGroup": "1.3.6.1.4.1.2011.5.25.149.1.1.1.9", "hwIpMcastChannelName": "1.3.6.1.4.1.2011.5.25.149.1.1.1.8", "hwIpMcastChannelGlobalEntries": "1.3.6.1.4.1.2011.5.25.149.1.1.1.13", "hwIpMcastInstanceName": "1.3.6.1.4.1.2011.5.25.149.1.1.1.25"]
]

// --- hwIpMcastGlobalTotalLimit (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.149.1.2.4
// Fields: hwIpMcastChannelSource, hwIpMcastChannelGroup, hwIpMcastChannelGlobalEntries, hwIpMcastInstanceName
// Description: A hwIpMcastGlobalTotalLimit notification signifies that an entry has been limited for global total entries limit. This notification is generated whenever an entry failed to create as global total entr...
trapMap["1.3.6.1.4.1.2011.5.25.149.1.2.4"] = [
    name: "hwIpMcastGlobalTotalLimit",
    fields: ["hwIpMcastChannelSource", "hwIpMcastChannelGroup", "hwIpMcastChannelGlobalEntries", "hwIpMcastInstanceName"],
    fieldOids: ["hwIpMcastChannelSource": "1.3.6.1.4.1.2011.5.25.149.1.1.1.10", "hwIpMcastChannelGroup": "1.3.6.1.4.1.2011.5.25.149.1.1.1.9", "hwIpMcastChannelGlobalEntries": "1.3.6.1.4.1.2011.5.25.149.1.1.1.13", "hwIpMcastInstanceName": "1.3.6.1.4.1.2011.5.25.149.1.1.1.25"]
]

// --- hwIpMcastOutChannelExceededLimit (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.149.1.2.5
// Fields: hwIpMcastChannelName, hwIpMcastChannelInterfaceIfIndex, hwIpMcastChannelDownstreamEntries, hwIpMcastChannelDownstreamBandWidth, hwIpMcastChannelDownstreamLimitEntries, hwIpMcastChannelDownstreamLimitBandWidth, hwIpMcastChannelInterfaceName
// Description: A hwIpMcastOutChannelExceededLimit notification signifies that existed entries exceeded channel downstream entry or bandwidth limit of pim routing-table. This notification is generated whenever existe...
trapMap["1.3.6.1.4.1.2011.5.25.149.1.2.5"] = [
    name: "hwIpMcastOutChannelExceededLimit",
    fields: ["hwIpMcastChannelName", "hwIpMcastChannelInterfaceIfIndex", "hwIpMcastChannelDownstreamEntries", "hwIpMcastChannelDownstreamBandWidth", "hwIpMcastChannelDownstreamLimitEntries", "hwIpMcastChannelDownstreamLimitBandWidth", "hwIpMcastChannelInterfaceName"],
    fieldOids: ["hwIpMcastChannelName": "1.3.6.1.4.1.2011.5.25.149.1.1.1.8", "hwIpMcastChannelInterfaceIfIndex": "1.3.6.1.4.1.2011.5.25.149.1.1.1.17", "hwIpMcastChannelDownstreamEntries": "1.3.6.1.4.1.2011.5.25.149.1.1.1.11", "hwIpMcastChannelDownstreamBandWidth": "1.3.6.1.4.1.2011.5.25.149.1.1.1.12", "hwIpMcastChannelDownstreamLimitEntries": "1.3.6.1.4.1.2011.5.25.149.1.1.1.15", "hwIpMcastChannelDownstreamLimitBandWidth": "1.3.6.1.4.1.2011.5.25.149.1.1.1.14", "hwIpMcastChannelInterfaceName": "1.3.6.1.4.1.2011.5.25.149.1.1.1.18"]
]

// --- hwIpMcastOutTotalExceededLimit (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.149.1.2.6
// Fields: hwIpMcastChannelInterfaceIfIndex, hwIpMcastChannelDownstreamEntries, hwIpMcastChannelDownstreamBandWidth, hwIpMcastChannelDownstreamLimitEntries, hwIpMcastChannelDownstreamLimitBandWidth, hwIpMcastChannelInterfaceName
// Description: A hwIpMcastOutTotalExceededLimit notification signifies that existed entries exceeded total downstream entry or bandwidth limit of pim routing-table. This notification is generated whenever existed en...
trapMap["1.3.6.1.4.1.2011.5.25.149.1.2.6"] = [
    name: "hwIpMcastOutTotalExceededLimit",
    fields: ["hwIpMcastChannelInterfaceIfIndex", "hwIpMcastChannelDownstreamEntries", "hwIpMcastChannelDownstreamBandWidth", "hwIpMcastChannelDownstreamLimitEntries", "hwIpMcastChannelDownstreamLimitBandWidth", "hwIpMcastChannelInterfaceName"],
    fieldOids: ["hwIpMcastChannelInterfaceIfIndex": "1.3.6.1.4.1.2011.5.25.149.1.1.1.17", "hwIpMcastChannelDownstreamEntries": "1.3.6.1.4.1.2011.5.25.149.1.1.1.11", "hwIpMcastChannelDownstreamBandWidth": "1.3.6.1.4.1.2011.5.25.149.1.1.1.12", "hwIpMcastChannelDownstreamLimitEntries": "1.3.6.1.4.1.2011.5.25.149.1.1.1.15", "hwIpMcastChannelDownstreamLimitBandWidth": "1.3.6.1.4.1.2011.5.25.149.1.1.1.14", "hwIpMcastChannelInterfaceName": "1.3.6.1.4.1.2011.5.25.149.1.1.1.18"]
]

// --- hwIpMcastGlobalChannelExceededLimit (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.149.1.2.7
// Fields: hwIpMcastChannelName, hwIpMcastChannelGlobalEntries, hwIpMcastChannelGlobalLimitEntries
// Description: A hwIpMcastGlobalChannelExceededLimit notification signifies that existed entries exceeded global entry limit of pim routing-table. This notification is generated whenever existed entries belongs to s...
trapMap["1.3.6.1.4.1.2011.5.25.149.1.2.7"] = [
    name: "hwIpMcastGlobalChannelExceededLimit",
    fields: ["hwIpMcastChannelName", "hwIpMcastChannelGlobalEntries", "hwIpMcastChannelGlobalLimitEntries"],
    fieldOids: ["hwIpMcastChannelName": "1.3.6.1.4.1.2011.5.25.149.1.1.1.8", "hwIpMcastChannelGlobalEntries": "1.3.6.1.4.1.2011.5.25.149.1.1.1.13", "hwIpMcastChannelGlobalLimitEntries": "1.3.6.1.4.1.2011.5.25.149.1.1.1.16"]
]

// --- hwIpMcastGlobalTotalExceededLimit (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.149.1.2.8
// Fields: hwIpMcastChannelGlobalEntries, hwIpMcastChannelGlobalLimitEntries
// Description: A hwIpMcastGlobalTotalExceededLimit notification signifies that existed entries exceeded global total entry limit of pim routing-table. This notification is generated whenever existed entries exceeded...
trapMap["1.3.6.1.4.1.2011.5.25.149.1.2.8"] = [
    name: "hwIpMcastGlobalTotalExceededLimit",
    fields: ["hwIpMcastChannelGlobalEntries", "hwIpMcastChannelGlobalLimitEntries"],
    fieldOids: ["hwIpMcastChannelGlobalEntries": "1.3.6.1.4.1.2011.5.25.149.1.1.1.13", "hwIpMcastChannelGlobalLimitEntries": "1.3.6.1.4.1.2011.5.25.149.1.1.1.16"]
]

// --- hwMFIBEntryOverloadSuspend (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.149.1.2.9
// Fields: hwIpMcastOverloadAddressType, hwIpMcastInstanceName, hwBoardIndex
// Description: A hwMFIBEntryOverloadSuspend notification signifies that the MFIB module is overloaded. This notification is generated whenever the MFIB module is overloaded in the board.
trapMap["1.3.6.1.4.1.2011.5.25.149.1.2.9"] = [
    name: "hwMFIBEntryOverloadSuspend",
    fields: ["hwIpMcastOverloadAddressType", "hwIpMcastInstanceName", "hwBoardIndex"],
    fieldOids: ["hwIpMcastOverloadAddressType": "1.3.6.1.4.1.2011.5.25.149.1.1.1.27", "hwIpMcastInstanceName": "1.3.6.1.4.1.2011.5.25.149.1.1.1.25", "hwBoardIndex": "1.3.6.1.4.1.2011.5.25.149.1.1.1.26"]
]

// --- hwMFIBEntryOverloadSusResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.149.1.2.10
// Fields: hwIpMcastOverloadAddressType, hwIpMcastInstanceName, hwBoardIndex
// Description: A hwMFIBEntryOverloadSusResume notification signifies that the board MFIB module changes from the overload suspension state to the normal state. This notification is generated whenever the MFIB module...
trapMap["1.3.6.1.4.1.2011.5.25.149.1.2.10"] = [
    name: "hwMFIBEntryOverloadSusResume",
    fields: ["hwIpMcastOverloadAddressType", "hwIpMcastInstanceName", "hwBoardIndex"],
    fieldOids: ["hwIpMcastOverloadAddressType": "1.3.6.1.4.1.2011.5.25.149.1.1.1.27", "hwIpMcastInstanceName": "1.3.6.1.4.1.2011.5.25.149.1.1.1.25", "hwBoardIndex": "1.3.6.1.4.1.2011.5.25.149.1.1.1.26"]
]

// --- hwMFIBEntryOifOverloadSuspend (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.149.1.2.11
// Fields: hwIpMcastOverloadAddressType, hwIpMcastOverloadSource, hwIpMcastOverloadGroup, hwIpMcastInstanceName, hwBoardIndex
// Description: A hwMFIBEntryOifOverloadSuspend notification signifies that the downstream of the MFIB entry is overloaded. This notification is generated whenever the downstream of the MFIB entry is overloaded.
trapMap["1.3.6.1.4.1.2011.5.25.149.1.2.11"] = [
    name: "hwMFIBEntryOifOverloadSuspend",
    fields: ["hwIpMcastOverloadAddressType", "hwIpMcastOverloadSource", "hwIpMcastOverloadGroup", "hwIpMcastInstanceName", "hwBoardIndex"],
    fieldOids: ["hwIpMcastOverloadAddressType": "1.3.6.1.4.1.2011.5.25.149.1.1.1.27", "hwIpMcastOverloadSource": "1.3.6.1.4.1.2011.5.25.149.1.1.1.28", "hwIpMcastOverloadGroup": "1.3.6.1.4.1.2011.5.25.149.1.1.1.29", "hwIpMcastInstanceName": "1.3.6.1.4.1.2011.5.25.149.1.1.1.25", "hwBoardIndex": "1.3.6.1.4.1.2011.5.25.149.1.1.1.26"]
]

// --- hwMFIBEntryOifOverloadSusResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.149.1.2.12
// Fields: hwIpMcastOverloadAddressType, hwIpMcastOverloadSource, hwIpMcastOverloadGroup, hwIpMcastInstanceName, hwBoardIndex
// Description: A hwMFIBEntryOifOverloadSuspend notification signifies that the MFIB entry changes from the overload suspension state to the normal state. This notification is generated whenever the MFIB entry change...
trapMap["1.3.6.1.4.1.2011.5.25.149.1.2.12"] = [
    name: "hwMFIBEntryOifOverloadSusResume",
    fields: ["hwIpMcastOverloadAddressType", "hwIpMcastOverloadSource", "hwIpMcastOverloadGroup", "hwIpMcastInstanceName", "hwBoardIndex"],
    fieldOids: ["hwIpMcastOverloadAddressType": "1.3.6.1.4.1.2011.5.25.149.1.1.1.27", "hwIpMcastOverloadSource": "1.3.6.1.4.1.2011.5.25.149.1.1.1.28", "hwIpMcastOverloadGroup": "1.3.6.1.4.1.2011.5.25.149.1.1.1.29", "hwIpMcastInstanceName": "1.3.6.1.4.1.2011.5.25.149.1.1.1.25", "hwBoardIndex": "1.3.6.1.4.1.2011.5.25.149.1.1.1.26"]
]

// --- hwIpMcastSGThresholdExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.149.1.2.13
// Fields: hwIpMcastSGCurrentCount, hwIpMcastSGThreshold, hwIpMcastSGTotalCount
// Description: A hwIpMcastSGThresholdExceed notification signifies that multicast routing (S, G) entries count of all instances reached the upper threshold.
trapMap["1.3.6.1.4.1.2011.5.25.149.1.2.13"] = [
    name: "hwIpMcastSGThresholdExceed",
    fields: ["hwIpMcastSGCurrentCount", "hwIpMcastSGThreshold", "hwIpMcastSGTotalCount"],
    fieldOids: ["hwIpMcastSGCurrentCount": "1.3.6.1.4.1.2011.5.25.149.1.1.1.30", "hwIpMcastSGThreshold": "1.3.6.1.4.1.2011.5.25.149.1.1.1.31", "hwIpMcastSGTotalCount": "1.3.6.1.4.1.2011.5.25.149.1.1.1.32"]
]

// --- hwIpMcastSGThresholdExceedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.149.1.2.14
// Fields: hwIpMcastSGCurrentCount, hwIpMcastSGThreshold, hwIpMcastSGTotalCount
// Description: A hwIpMcastSGThresholdExceedClear notification signifies that multicast routing (S, G) entries count of all instances fell below the lower threshold.
trapMap["1.3.6.1.4.1.2011.5.25.149.1.2.14"] = [
    name: "hwIpMcastSGThresholdExceedClear",
    fields: ["hwIpMcastSGCurrentCount", "hwIpMcastSGThreshold", "hwIpMcastSGTotalCount"],
    fieldOids: ["hwIpMcastSGCurrentCount": "1.3.6.1.4.1.2011.5.25.149.1.1.1.30", "hwIpMcastSGThreshold": "1.3.6.1.4.1.2011.5.25.149.1.1.1.31", "hwIpMcastSGTotalCount": "1.3.6.1.4.1.2011.5.25.149.1.1.1.32"]
]

// --- hwIpMcastSGExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.149.1.2.15
// Fields: hwIpMcastSGTotalCount
// Description: A hwIpMcastSGExceed notification signifies that multicast routing (S, G) entries count of all instances reached the limit.
trapMap["1.3.6.1.4.1.2011.5.25.149.1.2.15"] = [
    name: "hwIpMcastSGExceed",
    fields: ["hwIpMcastSGTotalCount"],
    fieldOids: ["hwIpMcastSGTotalCount": "1.3.6.1.4.1.2011.5.25.149.1.1.1.32"]
]

// --- hwIpMcastSGExceedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.149.1.2.16
// Fields: hwIpMcastSGTotalCount
// Description: A hwIpMcastSGExceedClear notification signifies that multicast routing (S, G) entries count of all instances fell below the limit.
trapMap["1.3.6.1.4.1.2011.5.25.149.1.2.16"] = [
    name: "hwIpMcastSGExceedClear",
    fields: ["hwIpMcastSGTotalCount"],
    fieldOids: ["hwIpMcastSGTotalCount": "1.3.6.1.4.1.2011.5.25.149.1.1.1.32"]
]

// --- hwMcastEntryExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.149.1.2.17
// Fields: hwMcastEntryLimitType, hwMcastNotificationAddressType, hwMcastEntryTotalCount
// Description: A hwMcastEntryExceed notification signifies that multicast routing entries count of all instances reached the limit.
trapMap["1.3.6.1.4.1.2011.5.25.149.1.2.17"] = [
    name: "hwMcastEntryExceed",
    fields: ["hwMcastEntryLimitType", "hwMcastNotificationAddressType", "hwMcastEntryTotalCount"],
    fieldOids: ["hwMcastEntryLimitType": "1.3.6.1.4.1.2011.5.25.149.1.1.1.33", "hwMcastNotificationAddressType": "1.3.6.1.4.1.2011.5.25.149.1.1.1.34", "hwMcastEntryTotalCount": "1.3.6.1.4.1.2011.5.25.149.1.1.1.35"]
]

// --- hwMcastEntryExceedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.149.1.2.18
// Fields: hwMcastEntryLimitType, hwMcastNotificationAddressType, hwMcastEntryTotalCount, hwMcastEntryLimitReasonType
// Description: A hwMcastEntryExceedClear notification signifies that multicast routing entries count of all instances fell below the limit.
trapMap["1.3.6.1.4.1.2011.5.25.149.1.2.18"] = [
    name: "hwMcastEntryExceedClear",
    fields: ["hwMcastEntryLimitType", "hwMcastNotificationAddressType", "hwMcastEntryTotalCount", "hwMcastEntryLimitReasonType"],
    fieldOids: ["hwMcastEntryLimitType": "1.3.6.1.4.1.2011.5.25.149.1.1.1.33", "hwMcastNotificationAddressType": "1.3.6.1.4.1.2011.5.25.149.1.1.1.34", "hwMcastEntryTotalCount": "1.3.6.1.4.1.2011.5.25.149.1.1.1.35", "hwMcastEntryLimitReasonType": "1.3.6.1.4.1.2011.5.25.149.1.1.1.36"]
]

// ===== Parsing logic =====

// Set to true to enable diagnostic logging for this MIB parser
DEBUG = false

LOG_PREFIX = "[HUAWEI-IPMCAST-MIB]"
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
