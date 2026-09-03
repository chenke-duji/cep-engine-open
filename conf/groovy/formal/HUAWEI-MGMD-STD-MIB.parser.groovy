/**
 * Auto-generated from HUAWEI-MGMD-STD-MIB.mib
 * Generated: 2026-08-24T18:28:30.296159200
 * Traps/Notifications (29): hwMgmdGlobalLimit, hwMgmdInterfaceLimit, hwMgmdTotalLimit, hwMgmdGmpJoin, hwMgmdGmpLeave, hwMgmdGMPGlobalLimit, hwMgmdGMPInterfaceLimit, hwMgmdGMPTotalLimit, hwMgmdGMPInterfaceLimitClear, hwMgmdGMPGlobalLimitClear, hwMgmdGMPTotalLimitClear, hwMgmdTotalLimitThresholdExceed, hwMgmdTotalLimitThresholdExceedClear, hwMgmdHostStarGThresholdExceed, hwMgmdHostStarGThresholdExceedClear, hwMgmdHostStarGExceed, hwMgmdHostStarGExceedClear, hwMgmdHostSGThresholdExceed, hwMgmdHostSGThresholdExceedClear, hwMgmdHostSGExceed, hwMgmdHostSGExceedClear, hwMgmdIfThresholdExceed, hwMgmdIfThresholdExceedClear, hwMgmdBoardLimitThresholdExceed, hwMgmdBoardLimitThresholdExceedClear, hwMgmdGMPBoardLimit, hwMgmdGMPBoardLimitClear, hwMgmdGmpJoinRecv, hwMgmdGmpGrpLeave
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

// --- hwMgmdGlobalLimit (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.149.3.3.1
// Fields: hwMgmdSource, hwMgmdGroup, hwMgmdGlobalEntries
// Description: A hwMgmdGlobalLimit notification signifies that an IGMP report has been limited for up to maximum entries of IGMP global routing-table. This notification is generated whenever an IGMP report failed to...
trapMap["1.3.6.1.4.1.2011.5.25.149.3.3.1"] = [
    name: "hwMgmdGlobalLimit",
    fields: ["hwMgmdSource", "hwMgmdGroup", "hwMgmdGlobalEntries"],
    fieldOids: ["hwMgmdSource": "1.3.6.1.4.1.2011.5.25.149.3.2.2", "hwMgmdGroup": "1.3.6.1.4.1.2011.5.25.149.3.2.1", "hwMgmdGlobalEntries": "1.3.6.1.4.1.2011.5.25.149.3.2.4"]
]

// --- hwMgmdInterfaceLimit (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.149.3.3.2
// Fields: hwMgmdSource, hwMgmdGroup, hwMgmdLimitInterfaceIfIndex, hwMgmdInterfaceEntries
// Description: A hwMgmdInterfaceLimit notification signifies that an IGMP report has been limited for up to maximum entries of IGMP interface routing-table. This notification is generated whenever an IGMP report fai...
trapMap["1.3.6.1.4.1.2011.5.25.149.3.3.2"] = [
    name: "hwMgmdInterfaceLimit",
    fields: ["hwMgmdSource", "hwMgmdGroup", "hwMgmdLimitInterfaceIfIndex", "hwMgmdInterfaceEntries"],
    fieldOids: ["hwMgmdSource": "1.3.6.1.4.1.2011.5.25.149.3.2.2", "hwMgmdGroup": "1.3.6.1.4.1.2011.5.25.149.3.2.1", "hwMgmdLimitInterfaceIfIndex": "1.3.6.1.4.1.2011.5.25.149.3.2.3", "hwMgmdInterfaceEntries": "1.3.6.1.4.1.2011.5.25.149.3.2.5"]
]

// --- hwMgmdTotalLimit (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.149.3.3.3
// Fields: hwMgmdSource, hwMgmdGroup, hwMgmdTotalEntries
// Description: A hwMgmdTotalLimit notification signifies that an IGMP report has been limited for up to maximum entries of IGMP total routing-table. This notification is generated whenever an IGMP report failed to c...
trapMap["1.3.6.1.4.1.2011.5.25.149.3.3.3"] = [
    name: "hwMgmdTotalLimit",
    fields: ["hwMgmdSource", "hwMgmdGroup", "hwMgmdTotalEntries"],
    fieldOids: ["hwMgmdSource": "1.3.6.1.4.1.2011.5.25.149.3.2.2", "hwMgmdGroup": "1.3.6.1.4.1.2011.5.25.149.3.2.1", "hwMgmdTotalEntries": "1.3.6.1.4.1.2011.5.25.149.3.2.6"]
]

// --- hwMgmdGmpJoin (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.149.3.3.4
// Fields: hwMgmdGmpInterfaceName, hwMgmdGmpInterfaceIfIndex, hwMgmdGmpJoinVersion, hwMgmdGmpJoinSrcAddr, hwMgmdGmpJoinGrpAddr, hwMgmdGmpJoinSenderIp, hwMgmdInstanceName
// Description: A hwMgmdGmpJoin notification signifies the IGMP or MLD join message was received.
trapMap["1.3.6.1.4.1.2011.5.25.149.3.3.4"] = [
    name: "hwMgmdGmpJoin",
    fields: ["hwMgmdGmpInterfaceName", "hwMgmdGmpInterfaceIfIndex", "hwMgmdGmpJoinVersion", "hwMgmdGmpJoinSrcAddr", "hwMgmdGmpJoinGrpAddr", "hwMgmdGmpJoinSenderIp", "hwMgmdInstanceName"],
    fieldOids: ["hwMgmdGmpInterfaceName": "1.3.6.1.4.1.2011.5.25.149.3.2.12", "hwMgmdGmpInterfaceIfIndex": "1.3.6.1.4.1.2011.5.25.149.3.2.11", "hwMgmdGmpJoinVersion": "1.3.6.1.4.1.2011.5.25.149.3.2.10", "hwMgmdGmpJoinSrcAddr": "1.3.6.1.4.1.2011.5.25.149.3.2.8", "hwMgmdGmpJoinGrpAddr": "1.3.6.1.4.1.2011.5.25.149.3.2.7", "hwMgmdGmpJoinSenderIp": "1.3.6.1.4.1.2011.5.25.149.3.2.9", "hwMgmdInstanceName": "1.3.6.1.4.1.2011.5.25.149.3.2.16"]
]

// --- hwMgmdGmpLeave (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.149.3.3.5
// Fields: hwMgmdGmpInterfaceName, hwMgmdGmpInterfaceIfIndex, hwMgmdGmpJoinSrcAddr, hwMgmdGmpJoinGrpAddr, hwMgmdInstanceName
// Description: A hwMgmdGmpLeave notification signifies the IGMP or MLD group leaved.
trapMap["1.3.6.1.4.1.2011.5.25.149.3.3.5"] = [
    name: "hwMgmdGmpLeave",
    fields: ["hwMgmdGmpInterfaceName", "hwMgmdGmpInterfaceIfIndex", "hwMgmdGmpJoinSrcAddr", "hwMgmdGmpJoinGrpAddr", "hwMgmdInstanceName"],
    fieldOids: ["hwMgmdGmpInterfaceName": "1.3.6.1.4.1.2011.5.25.149.3.2.12", "hwMgmdGmpInterfaceIfIndex": "1.3.6.1.4.1.2011.5.25.149.3.2.11", "hwMgmdGmpJoinSrcAddr": "1.3.6.1.4.1.2011.5.25.149.3.2.8", "hwMgmdGmpJoinGrpAddr": "1.3.6.1.4.1.2011.5.25.149.3.2.7", "hwMgmdInstanceName": "1.3.6.1.4.1.2011.5.25.149.3.2.16"]
]

// --- hwMgmdGMPGlobalLimit (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.149.3.3.6
// Fields: hwMgmdGmpLimitGroupAddressType, hwMgmdGmpLimitSource, hwMgmdGmpLimitGroup, hwMgmdGlobalEntries, hwMgmdInstanceName
// Description: This object indicates that the number of global IGMP or MLD entries of the instance reaches the upper limit. This trap message is generated when IGMP or MLD fails to create membership because the numb...
trapMap["1.3.6.1.4.1.2011.5.25.149.3.3.6"] = [
    name: "hwMgmdGMPGlobalLimit",
    fields: ["hwMgmdGmpLimitGroupAddressType", "hwMgmdGmpLimitSource", "hwMgmdGmpLimitGroup", "hwMgmdGlobalEntries", "hwMgmdInstanceName"],
    fieldOids: ["hwMgmdGmpLimitGroupAddressType": "1.3.6.1.4.1.2011.5.25.149.3.2.13", "hwMgmdGmpLimitSource": "1.3.6.1.4.1.2011.5.25.149.3.2.15", "hwMgmdGmpLimitGroup": "1.3.6.1.4.1.2011.5.25.149.3.2.14", "hwMgmdGlobalEntries": "1.3.6.1.4.1.2011.5.25.149.3.2.4", "hwMgmdInstanceName": "1.3.6.1.4.1.2011.5.25.149.3.2.16"]
]

// --- hwMgmdGMPInterfaceLimit (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.149.3.3.7
// Fields: hwMgmdGmpLimitGroupAddressType, hwMgmdGmpLimitSource, hwMgmdGmpLimitGroup, hwMgmdLimitInterfaceIfIndex, hwMgmdInterfaceEntries, hwMgmdGmpInterfaceName, hwMgmdInstanceName
// Description: This object indicates that the number of IGMP or MLD entries on the interface reaches the upper limit. This trap message is generated when IGMP or MLD fails to create membership because the number of ...
trapMap["1.3.6.1.4.1.2011.5.25.149.3.3.7"] = [
    name: "hwMgmdGMPInterfaceLimit",
    fields: ["hwMgmdGmpLimitGroupAddressType", "hwMgmdGmpLimitSource", "hwMgmdGmpLimitGroup", "hwMgmdLimitInterfaceIfIndex", "hwMgmdInterfaceEntries", "hwMgmdGmpInterfaceName", "hwMgmdInstanceName"],
    fieldOids: ["hwMgmdGmpLimitGroupAddressType": "1.3.6.1.4.1.2011.5.25.149.3.2.13", "hwMgmdGmpLimitSource": "1.3.6.1.4.1.2011.5.25.149.3.2.15", "hwMgmdGmpLimitGroup": "1.3.6.1.4.1.2011.5.25.149.3.2.14", "hwMgmdLimitInterfaceIfIndex": "1.3.6.1.4.1.2011.5.25.149.3.2.3", "hwMgmdInterfaceEntries": "1.3.6.1.4.1.2011.5.25.149.3.2.5", "hwMgmdGmpInterfaceName": "1.3.6.1.4.1.2011.5.25.149.3.2.12", "hwMgmdInstanceName": "1.3.6.1.4.1.2011.5.25.149.3.2.16"]
]

// --- hwMgmdGMPTotalLimit (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.149.3.3.8
// Fields: hwMgmdGmpLimitGroupAddressType, hwMgmdGmpLimitSource, hwMgmdGmpLimitGroup, hwMgmdTotalEntries
// Description: This object indicates that the number of IGMP or MLD entries of all instances reaches the upper limit. This trap message is generated when IGMP or MLD fails to create membership because the number of ...
trapMap["1.3.6.1.4.1.2011.5.25.149.3.3.8"] = [
    name: "hwMgmdGMPTotalLimit",
    fields: ["hwMgmdGmpLimitGroupAddressType", "hwMgmdGmpLimitSource", "hwMgmdGmpLimitGroup", "hwMgmdTotalEntries"],
    fieldOids: ["hwMgmdGmpLimitGroupAddressType": "1.3.6.1.4.1.2011.5.25.149.3.2.13", "hwMgmdGmpLimitSource": "1.3.6.1.4.1.2011.5.25.149.3.2.15", "hwMgmdGmpLimitGroup": "1.3.6.1.4.1.2011.5.25.149.3.2.14", "hwMgmdTotalEntries": "1.3.6.1.4.1.2011.5.25.149.3.2.6"]
]

// --- hwMgmdGMPInterfaceLimitClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.149.3.3.9
// Fields: hwMgmdGmpLimitGroupAddressType, hwMgmdGmpLimitSource, hwMgmdGmpLimitGroup, hwMgmdLimitInterfaceIfIndex, hwMgmdInterfaceEntries, hwMgmdGmpInterfaceName, hwMgmdInstanceName
// Description: This object indicates that the number of IGMP or MLD entries on the interface falls below the upper limit. This trap message is generated when IGMP or MLD delete an entry resulting in the number of IG...
trapMap["1.3.6.1.4.1.2011.5.25.149.3.3.9"] = [
    name: "hwMgmdGMPInterfaceLimitClear",
    fields: ["hwMgmdGmpLimitGroupAddressType", "hwMgmdGmpLimitSource", "hwMgmdGmpLimitGroup", "hwMgmdLimitInterfaceIfIndex", "hwMgmdInterfaceEntries", "hwMgmdGmpInterfaceName", "hwMgmdInstanceName"],
    fieldOids: ["hwMgmdGmpLimitGroupAddressType": "1.3.6.1.4.1.2011.5.25.149.3.2.13", "hwMgmdGmpLimitSource": "1.3.6.1.4.1.2011.5.25.149.3.2.15", "hwMgmdGmpLimitGroup": "1.3.6.1.4.1.2011.5.25.149.3.2.14", "hwMgmdLimitInterfaceIfIndex": "1.3.6.1.4.1.2011.5.25.149.3.2.3", "hwMgmdInterfaceEntries": "1.3.6.1.4.1.2011.5.25.149.3.2.5", "hwMgmdGmpInterfaceName": "1.3.6.1.4.1.2011.5.25.149.3.2.12", "hwMgmdInstanceName": "1.3.6.1.4.1.2011.5.25.149.3.2.16"]
]

// --- hwMgmdGMPGlobalLimitClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.149.3.3.10
// Fields: hwMgmdGmpLimitGroupAddressType, hwMgmdGmpLimitSource, hwMgmdGmpLimitGroup, hwMgmdGlobalEntries, hwMgmdInstanceName
// Description: This object indicates that the number of global IGMP or MLD entries of the instance falls blow the upper limit. This trap message is generated when IGMP or MLD delete an entry resulting in the number ...
trapMap["1.3.6.1.4.1.2011.5.25.149.3.3.10"] = [
    name: "hwMgmdGMPGlobalLimitClear",
    fields: ["hwMgmdGmpLimitGroupAddressType", "hwMgmdGmpLimitSource", "hwMgmdGmpLimitGroup", "hwMgmdGlobalEntries", "hwMgmdInstanceName"],
    fieldOids: ["hwMgmdGmpLimitGroupAddressType": "1.3.6.1.4.1.2011.5.25.149.3.2.13", "hwMgmdGmpLimitSource": "1.3.6.1.4.1.2011.5.25.149.3.2.15", "hwMgmdGmpLimitGroup": "1.3.6.1.4.1.2011.5.25.149.3.2.14", "hwMgmdGlobalEntries": "1.3.6.1.4.1.2011.5.25.149.3.2.4", "hwMgmdInstanceName": "1.3.6.1.4.1.2011.5.25.149.3.2.16"]
]

// --- hwMgmdGMPTotalLimitClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.149.3.3.11
// Fields: hwMgmdGmpLimitGroupAddressType, hwMgmdGmpLimitSource, hwMgmdGmpLimitGroup, hwMgmdTotalEntries
// Description: This object indicates that the number of IGMP or MLD entries of all instances falls below the upper limit. This trap message is generated when IGMP or MLD delete an entry resulting in the number of IG...
trapMap["1.3.6.1.4.1.2011.5.25.149.3.3.11"] = [
    name: "hwMgmdGMPTotalLimitClear",
    fields: ["hwMgmdGmpLimitGroupAddressType", "hwMgmdGmpLimitSource", "hwMgmdGmpLimitGroup", "hwMgmdTotalEntries"],
    fieldOids: ["hwMgmdGmpLimitGroupAddressType": "1.3.6.1.4.1.2011.5.25.149.3.2.13", "hwMgmdGmpLimitSource": "1.3.6.1.4.1.2011.5.25.149.3.2.15", "hwMgmdGmpLimitGroup": "1.3.6.1.4.1.2011.5.25.149.3.2.14", "hwMgmdTotalEntries": "1.3.6.1.4.1.2011.5.25.149.3.2.6"]
]

// --- hwMgmdTotalLimitThresholdExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.149.3.3.12
// Fields: hwMgmdNotificationAddressType, hwMgmdTotalLimitCurrentCount, hwMgmdTotalLimitThreshold, hwMgmdTotalEntries
// Description: A hwMgmdTotalLimitThresholdExceed notification signifies that IGMP or MLD entries count of all instances reached the upper threshold.
trapMap["1.3.6.1.4.1.2011.5.25.149.3.3.12"] = [
    name: "hwMgmdTotalLimitThresholdExceed",
    fields: ["hwMgmdNotificationAddressType", "hwMgmdTotalLimitCurrentCount", "hwMgmdTotalLimitThreshold", "hwMgmdTotalEntries"],
    fieldOids: ["hwMgmdNotificationAddressType": "1.3.6.1.4.1.2011.5.25.149.3.2.17", "hwMgmdTotalLimitCurrentCount": "1.3.6.1.4.1.2011.5.25.149.3.2.18", "hwMgmdTotalLimitThreshold": "1.3.6.1.4.1.2011.5.25.149.3.2.19", "hwMgmdTotalEntries": "1.3.6.1.4.1.2011.5.25.149.3.2.6"]
]

// --- hwMgmdTotalLimitThresholdExceedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.149.3.3.13
// Fields: hwMgmdNotificationAddressType, hwMgmdTotalLimitCurrentCount, hwMgmdTotalLimitThreshold, hwMgmdTotalEntries
// Description: A hwMgmdTotalLimitThresholdExceedClear notification signifies that IGMP or MLD entries count of all instances fell below the lower threshold.
trapMap["1.3.6.1.4.1.2011.5.25.149.3.3.13"] = [
    name: "hwMgmdTotalLimitThresholdExceedClear",
    fields: ["hwMgmdNotificationAddressType", "hwMgmdTotalLimitCurrentCount", "hwMgmdTotalLimitThreshold", "hwMgmdTotalEntries"],
    fieldOids: ["hwMgmdNotificationAddressType": "1.3.6.1.4.1.2011.5.25.149.3.2.17", "hwMgmdTotalLimitCurrentCount": "1.3.6.1.4.1.2011.5.25.149.3.2.18", "hwMgmdTotalLimitThreshold": "1.3.6.1.4.1.2011.5.25.149.3.2.19", "hwMgmdTotalEntries": "1.3.6.1.4.1.2011.5.25.149.3.2.6"]
]

// --- hwMgmdHostStarGThresholdExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.149.3.3.14
// Fields: hwMgmdNotificationAddressType, hwMgmdHostStarGCurrentCount, hwMgmdHostStarGThreshold, hwMgmdHostStarGTotalCount
// Description: A hwMgmdHostStarGThresholdExceed notification signifies that IGMP or MLD proxy (*, G) entries count of all instances reached the upper threshold.
trapMap["1.3.6.1.4.1.2011.5.25.149.3.3.14"] = [
    name: "hwMgmdHostStarGThresholdExceed",
    fields: ["hwMgmdNotificationAddressType", "hwMgmdHostStarGCurrentCount", "hwMgmdHostStarGThreshold", "hwMgmdHostStarGTotalCount"],
    fieldOids: ["hwMgmdNotificationAddressType": "1.3.6.1.4.1.2011.5.25.149.3.2.17", "hwMgmdHostStarGCurrentCount": "1.3.6.1.4.1.2011.5.25.149.3.2.20", "hwMgmdHostStarGThreshold": "1.3.6.1.4.1.2011.5.25.149.3.2.21", "hwMgmdHostStarGTotalCount": "1.3.6.1.4.1.2011.5.25.149.3.2.22"]
]

// --- hwMgmdHostStarGThresholdExceedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.149.3.3.15
// Fields: hwMgmdNotificationAddressType, hwMgmdHostStarGCurrentCount, hwMgmdHostStarGThreshold, hwMgmdHostStarGTotalCount
// Description: A hwMgmdHostStarGThresholdExceedClear notification signifies that IGMP or MLD proxy (*, G) entries count of all instances fell below the lower threshold.
trapMap["1.3.6.1.4.1.2011.5.25.149.3.3.15"] = [
    name: "hwMgmdHostStarGThresholdExceedClear",
    fields: ["hwMgmdNotificationAddressType", "hwMgmdHostStarGCurrentCount", "hwMgmdHostStarGThreshold", "hwMgmdHostStarGTotalCount"],
    fieldOids: ["hwMgmdNotificationAddressType": "1.3.6.1.4.1.2011.5.25.149.3.2.17", "hwMgmdHostStarGCurrentCount": "1.3.6.1.4.1.2011.5.25.149.3.2.20", "hwMgmdHostStarGThreshold": "1.3.6.1.4.1.2011.5.25.149.3.2.21", "hwMgmdHostStarGTotalCount": "1.3.6.1.4.1.2011.5.25.149.3.2.22"]
]

// --- hwMgmdHostStarGExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.149.3.3.16
// Fields: hwMgmdNotificationAddressType, hwMgmdHostNotificationSrcAddr, hwMgmdHostNotificationGrpAddr, hwMgmdHostStarGTotalCount, hwMgmdInstanceName
// Description: A hwMgmdHostStarGExceed notification signifies that IGMP or MLD proxy (*, G) entries can not be created because the limit is reached.
trapMap["1.3.6.1.4.1.2011.5.25.149.3.3.16"] = [
    name: "hwMgmdHostStarGExceed",
    fields: ["hwMgmdNotificationAddressType", "hwMgmdHostNotificationSrcAddr", "hwMgmdHostNotificationGrpAddr", "hwMgmdHostStarGTotalCount", "hwMgmdInstanceName"],
    fieldOids: ["hwMgmdNotificationAddressType": "1.3.6.1.4.1.2011.5.25.149.3.2.17", "hwMgmdHostNotificationSrcAddr": "1.3.6.1.4.1.2011.5.25.149.3.2.23", "hwMgmdHostNotificationGrpAddr": "1.3.6.1.4.1.2011.5.25.149.3.2.24", "hwMgmdHostStarGTotalCount": "1.3.6.1.4.1.2011.5.25.149.3.2.22", "hwMgmdInstanceName": "1.3.6.1.4.1.2011.5.25.149.3.2.16"]
]

// --- hwMgmdHostStarGExceedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.149.3.3.17
// Fields: hwMgmdNotificationAddressType, hwMgmdHostStarGTotalCount
// Description: A hwMgmdHostStarGExceedClear notification signifies that IGMP or MLD proxy (*, G) entries can be created because can be created because the number of IGMP or MLD (*, G) entries fell below the limit.
trapMap["1.3.6.1.4.1.2011.5.25.149.3.3.17"] = [
    name: "hwMgmdHostStarGExceedClear",
    fields: ["hwMgmdNotificationAddressType", "hwMgmdHostStarGTotalCount"],
    fieldOids: ["hwMgmdNotificationAddressType": "1.3.6.1.4.1.2011.5.25.149.3.2.17", "hwMgmdHostStarGTotalCount": "1.3.6.1.4.1.2011.5.25.149.3.2.22"]
]

// --- hwMgmdHostSGThresholdExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.149.3.3.18
// Fields: hwMgmdNotificationAddressType, hwMgmdHostSGCurrentCount, hwMgmdHostSGThreshold, hwMgmdHostSGTotalCount
// Description: A hwMgmdHostSGThresholdExceed notification signifies that IGMP or MLD proxy (S, G) entries count of all instances reached the upper threshold.
trapMap["1.3.6.1.4.1.2011.5.25.149.3.3.18"] = [
    name: "hwMgmdHostSGThresholdExceed",
    fields: ["hwMgmdNotificationAddressType", "hwMgmdHostSGCurrentCount", "hwMgmdHostSGThreshold", "hwMgmdHostSGTotalCount"],
    fieldOids: ["hwMgmdNotificationAddressType": "1.3.6.1.4.1.2011.5.25.149.3.2.17", "hwMgmdHostSGCurrentCount": "1.3.6.1.4.1.2011.5.25.149.3.2.25", "hwMgmdHostSGThreshold": "1.3.6.1.4.1.2011.5.25.149.3.2.26", "hwMgmdHostSGTotalCount": "1.3.6.1.4.1.2011.5.25.149.3.2.27"]
]

// --- hwMgmdHostSGThresholdExceedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.149.3.3.19
// Fields: hwMgmdNotificationAddressType, hwMgmdHostSGCurrentCount, hwMgmdHostSGThreshold, hwMgmdHostSGTotalCount
// Description: A hwMgmdHostSGThresholdExceedClear notification signifies that IGMP or MLD proxy (S, G) entries count of all instances fell below the lower threshold.
trapMap["1.3.6.1.4.1.2011.5.25.149.3.3.19"] = [
    name: "hwMgmdHostSGThresholdExceedClear",
    fields: ["hwMgmdNotificationAddressType", "hwMgmdHostSGCurrentCount", "hwMgmdHostSGThreshold", "hwMgmdHostSGTotalCount"],
    fieldOids: ["hwMgmdNotificationAddressType": "1.3.6.1.4.1.2011.5.25.149.3.2.17", "hwMgmdHostSGCurrentCount": "1.3.6.1.4.1.2011.5.25.149.3.2.25", "hwMgmdHostSGThreshold": "1.3.6.1.4.1.2011.5.25.149.3.2.26", "hwMgmdHostSGTotalCount": "1.3.6.1.4.1.2011.5.25.149.3.2.27"]
]

// --- hwMgmdHostSGExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.149.3.3.20
// Fields: hwMgmdNotificationAddressType, hwMgmdHostNotificationSrcAddr, hwMgmdHostNotificationGrpAddr, hwMgmdHostSGTotalCount, hwMgmdInstanceName
// Description: A hwMgmdHostSGExceed notification signifies that IGMP or MLD proxy (S, G) entries can not be created because the limit of all instances is reached.
trapMap["1.3.6.1.4.1.2011.5.25.149.3.3.20"] = [
    name: "hwMgmdHostSGExceed",
    fields: ["hwMgmdNotificationAddressType", "hwMgmdHostNotificationSrcAddr", "hwMgmdHostNotificationGrpAddr", "hwMgmdHostSGTotalCount", "hwMgmdInstanceName"],
    fieldOids: ["hwMgmdNotificationAddressType": "1.3.6.1.4.1.2011.5.25.149.3.2.17", "hwMgmdHostNotificationSrcAddr": "1.3.6.1.4.1.2011.5.25.149.3.2.23", "hwMgmdHostNotificationGrpAddr": "1.3.6.1.4.1.2011.5.25.149.3.2.24", "hwMgmdHostSGTotalCount": "1.3.6.1.4.1.2011.5.25.149.3.2.27", "hwMgmdInstanceName": "1.3.6.1.4.1.2011.5.25.149.3.2.16"]
]

// --- hwMgmdHostSGExceedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.149.3.3.21
// Fields: hwMgmdNotificationAddressType, hwMgmdHostSGTotalCount
// Description: A hwMgmdHostSGExceedClear notification signifies that IGMP or MLD proxy (S, G) entries can be created because can be created because the number of IGMP or MLD (S, G) entries of all instances fell belo...
trapMap["1.3.6.1.4.1.2011.5.25.149.3.3.21"] = [
    name: "hwMgmdHostSGExceedClear",
    fields: ["hwMgmdNotificationAddressType", "hwMgmdHostSGTotalCount"],
    fieldOids: ["hwMgmdNotificationAddressType": "1.3.6.1.4.1.2011.5.25.149.3.2.17", "hwMgmdHostSGTotalCount": "1.3.6.1.4.1.2011.5.25.149.3.2.27"]
]

// --- hwMgmdIfThresholdExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.149.3.3.22
// Fields: hwMgmdNotificationAddressType, hwMgmdThresholdInterfaceIfIndex, hwMgmdGmpIfCurrentCount, hwMgmdGmpIfThreshold, hwMgmdGmpInterfaceName, hwMgmdInstanceName
// Description: A hwMgmdIfThresholdExceed notification signifies that IGMP or MLD entries on the interface reached the upper threshold.
trapMap["1.3.6.1.4.1.2011.5.25.149.3.3.22"] = [
    name: "hwMgmdIfThresholdExceed",
    fields: ["hwMgmdNotificationAddressType", "hwMgmdThresholdInterfaceIfIndex", "hwMgmdGmpIfCurrentCount", "hwMgmdGmpIfThreshold", "hwMgmdGmpInterfaceName", "hwMgmdInstanceName"],
    fieldOids: ["hwMgmdNotificationAddressType": "1.3.6.1.4.1.2011.5.25.149.3.2.17", "hwMgmdThresholdInterfaceIfIndex": "1.3.6.1.4.1.2011.5.25.149.3.2.33", "hwMgmdGmpIfCurrentCount": "1.3.6.1.4.1.2011.5.25.149.3.2.31", "hwMgmdGmpIfThreshold": "1.3.6.1.4.1.2011.5.25.149.3.2.32", "hwMgmdGmpInterfaceName": "1.3.6.1.4.1.2011.5.25.149.3.2.12", "hwMgmdInstanceName": "1.3.6.1.4.1.2011.5.25.149.3.2.16"]
]

// --- hwMgmdIfThresholdExceedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.149.3.3.23
// Fields: hwMgmdNotificationAddressType, hwMgmdThresholdInterfaceIfIndex, hwMgmdGmpIfCurrentCount, hwMgmdGmpIfThreshold, hwMgmdGmpInterfaceName, hwMgmdInstanceName
// Description: A hwMgmdIfThresholdExceedClear notification signifies that IGMP or MLD entries on the interface fell below the lower threshold.
trapMap["1.3.6.1.4.1.2011.5.25.149.3.3.23"] = [
    name: "hwMgmdIfThresholdExceedClear",
    fields: ["hwMgmdNotificationAddressType", "hwMgmdThresholdInterfaceIfIndex", "hwMgmdGmpIfCurrentCount", "hwMgmdGmpIfThreshold", "hwMgmdGmpInterfaceName", "hwMgmdInstanceName"],
    fieldOids: ["hwMgmdNotificationAddressType": "1.3.6.1.4.1.2011.5.25.149.3.2.17", "hwMgmdThresholdInterfaceIfIndex": "1.3.6.1.4.1.2011.5.25.149.3.2.33", "hwMgmdGmpIfCurrentCount": "1.3.6.1.4.1.2011.5.25.149.3.2.31", "hwMgmdGmpIfThreshold": "1.3.6.1.4.1.2011.5.25.149.3.2.32", "hwMgmdGmpInterfaceName": "1.3.6.1.4.1.2011.5.25.149.3.2.12", "hwMgmdInstanceName": "1.3.6.1.4.1.2011.5.25.149.3.2.16"]
]

// --- hwMgmdBoardLimitThresholdExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.149.3.3.24
// Fields: hwMgmdNotificationAddressType, hwMgmdNotificationSlot, hwMgmdGmpBoardCurrentCount, hwMgmdGmpBoardLimitCount, hwMgmdGmpBoardThreshold
// Description: A hwMgmdBoardLimitThresholdExceed notification signifies that IGMP or MLD entries on the board reached the upper threshold.
trapMap["1.3.6.1.4.1.2011.5.25.149.3.3.24"] = [
    name: "hwMgmdBoardLimitThresholdExceed",
    fields: ["hwMgmdNotificationAddressType", "hwMgmdNotificationSlot", "hwMgmdGmpBoardCurrentCount", "hwMgmdGmpBoardLimitCount", "hwMgmdGmpBoardThreshold"],
    fieldOids: ["hwMgmdNotificationAddressType": "1.3.6.1.4.1.2011.5.25.149.3.2.17", "hwMgmdNotificationSlot": "1.3.6.1.4.1.2011.5.25.149.3.2.34", "hwMgmdGmpBoardCurrentCount": "1.3.6.1.4.1.2011.5.25.149.3.2.35", "hwMgmdGmpBoardLimitCount": "1.3.6.1.4.1.2011.5.25.149.3.2.36", "hwMgmdGmpBoardThreshold": "1.3.6.1.4.1.2011.5.25.149.3.2.37"]
]

// --- hwMgmdBoardLimitThresholdExceedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.149.3.3.25
// Fields: hwMgmdNotificationAddressType, hwMgmdNotificationSlot, hwMgmdGmpBoardCurrentCount, hwMgmdGmpBoardLimitCount, hwMgmdGmpBoardThreshold
// Description: A hwMgmdBoardLimitThresholdExceedClear notification signifies that IGMP or MLD entries on the board fell below the lower threshold.
trapMap["1.3.6.1.4.1.2011.5.25.149.3.3.25"] = [
    name: "hwMgmdBoardLimitThresholdExceedClear",
    fields: ["hwMgmdNotificationAddressType", "hwMgmdNotificationSlot", "hwMgmdGmpBoardCurrentCount", "hwMgmdGmpBoardLimitCount", "hwMgmdGmpBoardThreshold"],
    fieldOids: ["hwMgmdNotificationAddressType": "1.3.6.1.4.1.2011.5.25.149.3.2.17", "hwMgmdNotificationSlot": "1.3.6.1.4.1.2011.5.25.149.3.2.34", "hwMgmdGmpBoardCurrentCount": "1.3.6.1.4.1.2011.5.25.149.3.2.35", "hwMgmdGmpBoardLimitCount": "1.3.6.1.4.1.2011.5.25.149.3.2.36", "hwMgmdGmpBoardThreshold": "1.3.6.1.4.1.2011.5.25.149.3.2.37"]
]

// --- hwMgmdGMPBoardLimit (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.149.3.3.26
// Fields: hwMgmdGmpLimitGroupAddressType, hwMgmdNotificationSlot, hwMgmdGmpBoardLimitCount
// Description: A hwMgmdGMPBoardLimit notification signifies that IGMP or MLD entries on the board reaches the upper limit. This trap message is generated when IGMP or MLD fails to create membership because the numbe...
trapMap["1.3.6.1.4.1.2011.5.25.149.3.3.26"] = [
    name: "hwMgmdGMPBoardLimit",
    fields: ["hwMgmdGmpLimitGroupAddressType", "hwMgmdNotificationSlot", "hwMgmdGmpBoardLimitCount"],
    fieldOids: ["hwMgmdGmpLimitGroupAddressType": "1.3.6.1.4.1.2011.5.25.149.3.2.13", "hwMgmdNotificationSlot": "1.3.6.1.4.1.2011.5.25.149.3.2.34", "hwMgmdGmpBoardLimitCount": "1.3.6.1.4.1.2011.5.25.149.3.2.36"]
]

// --- hwMgmdGMPBoardLimitClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.149.3.3.27
// Fields: hwMgmdGmpLimitGroupAddressType, hwMgmdNotificationSlot, hwMgmdGmpBoardLimitCount
// Description: A hwMgmdGMPBoardLimitClear notification signifies that the IGMP or MLD entries on the board falls below the upper limit. This trap message is generated when IGMP or MLD delete an entry resulting in th...
trapMap["1.3.6.1.4.1.2011.5.25.149.3.3.27"] = [
    name: "hwMgmdGMPBoardLimitClear",
    fields: ["hwMgmdGmpLimitGroupAddressType", "hwMgmdNotificationSlot", "hwMgmdGmpBoardLimitCount"],
    fieldOids: ["hwMgmdGmpLimitGroupAddressType": "1.3.6.1.4.1.2011.5.25.149.3.2.13", "hwMgmdNotificationSlot": "1.3.6.1.4.1.2011.5.25.149.3.2.34", "hwMgmdGmpBoardLimitCount": "1.3.6.1.4.1.2011.5.25.149.3.2.36"]
]

// --- hwMgmdGmpJoinRecv (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.149.3.3.28
// Fields: hwMgmdGmpInterfaceName, hwMgmdGmpInterfaceIfIndex, hwMgmdGmpJoinVersion, hwMgmdGmpJoinSrcAddrType, hwMgmdGmpJoinSrcAddress, hwMgmdGmpJoinGrpAddrType, hwMgmdGmpJoinGrpAddress, hwMgmdGmpJoinSenderAddrType, hwMgmdGmpJoinSenderAddr, hwMgmdInstanceName
// Description: A hwMgmdGmpJoinRecv notification signifies the IGMP or MLD join message was received.
trapMap["1.3.6.1.4.1.2011.5.25.149.3.3.28"] = [
    name: "hwMgmdGmpJoinRecv",
    fields: ["hwMgmdGmpInterfaceName", "hwMgmdGmpInterfaceIfIndex", "hwMgmdGmpJoinVersion", "hwMgmdGmpJoinSrcAddrType", "hwMgmdGmpJoinSrcAddress", "hwMgmdGmpJoinGrpAddrType", "hwMgmdGmpJoinGrpAddress", "hwMgmdGmpJoinSenderAddrType", "hwMgmdGmpJoinSenderAddr", "hwMgmdInstanceName"],
    fieldOids: ["hwMgmdGmpInterfaceName": "1.3.6.1.4.1.2011.5.25.149.3.2.12", "hwMgmdGmpInterfaceIfIndex": "1.3.6.1.4.1.2011.5.25.149.3.2.11", "hwMgmdGmpJoinVersion": "1.3.6.1.4.1.2011.5.25.149.3.2.10", "hwMgmdGmpJoinSrcAddrType": "1.3.6.1.4.1.2011.5.25.149.3.2.40", "hwMgmdGmpJoinSrcAddress": "1.3.6.1.4.1.2011.5.25.149.3.2.41", "hwMgmdGmpJoinGrpAddrType": "1.3.6.1.4.1.2011.5.25.149.3.2.38", "hwMgmdGmpJoinGrpAddress": "1.3.6.1.4.1.2011.5.25.149.3.2.39", "hwMgmdGmpJoinSenderAddrType": "1.3.6.1.4.1.2011.5.25.149.3.2.42", "hwMgmdGmpJoinSenderAddr": "1.3.6.1.4.1.2011.5.25.149.3.2.43", "hwMgmdInstanceName": "1.3.6.1.4.1.2011.5.25.149.3.2.16"]
]

// --- hwMgmdGmpGrpLeave (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.149.3.3.29
// Fields: hwMgmdGmpInterfaceName, hwMgmdGmpInterfaceIfIndex, hwMgmdGmpJoinSrcAddrType, hwMgmdGmpJoinSrcAddress, hwMgmdGmpJoinGrpAddrType, hwMgmdGmpJoinGrpAddress, hwMgmdInstanceName
// Description: A hwMgmdGmpGrpLeave notification signifies the IGMP or MLD group leave.
trapMap["1.3.6.1.4.1.2011.5.25.149.3.3.29"] = [
    name: "hwMgmdGmpGrpLeave",
    fields: ["hwMgmdGmpInterfaceName", "hwMgmdGmpInterfaceIfIndex", "hwMgmdGmpJoinSrcAddrType", "hwMgmdGmpJoinSrcAddress", "hwMgmdGmpJoinGrpAddrType", "hwMgmdGmpJoinGrpAddress", "hwMgmdInstanceName"],
    fieldOids: ["hwMgmdGmpInterfaceName": "1.3.6.1.4.1.2011.5.25.149.3.2.12", "hwMgmdGmpInterfaceIfIndex": "1.3.6.1.4.1.2011.5.25.149.3.2.11", "hwMgmdGmpJoinSrcAddrType": "1.3.6.1.4.1.2011.5.25.149.3.2.40", "hwMgmdGmpJoinSrcAddress": "1.3.6.1.4.1.2011.5.25.149.3.2.41", "hwMgmdGmpJoinGrpAddrType": "1.3.6.1.4.1.2011.5.25.149.3.2.38", "hwMgmdGmpJoinGrpAddress": "1.3.6.1.4.1.2011.5.25.149.3.2.39", "hwMgmdInstanceName": "1.3.6.1.4.1.2011.5.25.149.3.2.16"]
]

// ===== Parsing logic =====

// Set to true to enable diagnostic logging for this MIB parser
DEBUG = false

LOG_PREFIX = "[HUAWEI-MGMD-STD-MIB]"
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
