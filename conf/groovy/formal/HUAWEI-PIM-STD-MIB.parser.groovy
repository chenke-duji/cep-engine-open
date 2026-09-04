/**
 * Auto-generated from HUAWEI-PIM-STD-MIB.mib
 * Generated: 2026-08-24T18:28:30.635971
 * Traps/Notifications (46): hwPimNeighborLoss, hwPimInvalidRegister, hwPimInvalidJoinPrune, hwPimRpMappingChange, hwPimInterfaceElection, hwPimNeighborAdd, hwPimGRStart, hwPimGREnd, hwPimMrtLimit, hwPimNeighborUnavailable, hwPimNeighborUnavailableClear, hwPimMrtLimitClear, hwPimStarGThresholdExceed, hwPimStarGThresholdExceedClear, hwPimStarGExceed, hwPimStarGExceedClear, hwPimSGThresholdExceed, hwPimSGThresholdExceedClear, hwPimSGExceed, hwPimSGExceedClear, hwPimGlobalTypeSGThresholdExceed, hwPimGlobalTypeSGThresholdExceedClear, hwPimGlobalTypeSGExceed, hwPimGlobalTypeSGExceedClear, hwPimSrcNumLimit, hwPimSrcNumLimitClear, hwPimBasNeighborLoss, hwPimBasNeighborExceed, hwPimBasNeighborExceedClear, hwPimVrfTypeSGThresholdExceed, hwPimVrfTypeSGThresholdExceedClear, hwPimVrfTypeSGExceed, hwPimVrfTypeSGExceedClear, hwPimRpfRtFlapping, hwPimRpfRtFlappingClear, hwPimRpfAssertWinnerFlapping, hwPimRpfAssertWinnerFlappingClear, hwPimGlobalTypeOifThresholdExceed, hwPimGlobalTypeOifThresholdExceedClear, hwPimSGInactiveThreshold, hwPimSrcPerGrpNumLimit, hwPimSrcPerGrpNumLimitClear, hwBsrCrpReachLimit, hwBsrCrpReachLimitResume, hwBsrBsmReachLimit, hwBsrBsmReachLimitResume
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

// --- hwPimNeighborLoss (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.149.4.0.1
// Fields: hwPimNeighborUpTime, hwPimNeighborIfName, hwPimInstanceID, hwPimInstanceName, hwPimNeighborNotificationReason
// Description: A hwPimNeighborLoss notification signifies the loss of an adjacency with a neighbor. This notification should be generated when the neighbor is lost. This notification is generated whenever the counte...
trapMap["1.3.6.1.4.1.2011.5.25.149.4.0.1"] = [
    name: "hwPimNeighborLoss",
    fields: ["hwPimNeighborUpTime", "hwPimNeighborIfName", "hwPimInstanceID", "hwPimInstanceName", "hwPimNeighborNotificationReason"],
    fieldOids: ["hwPimNeighborUpTime": "1.3.6.1.4.1.2011.5.25.149.4.1.2.1.6", "hwPimNeighborIfName": "1.3.6.1.4.1.2011.5.25.149.4.1.2.1.16", "hwPimInstanceID": "1.3.6.1.4.1.2011.5.25.149.4.1.57", "hwPimInstanceName": "1.3.6.1.4.1.2011.5.25.149.4.1.60", "hwPimNeighborNotificationReason": "1.3.6.1.4.1.2011.5.25.149.4.1.61"]
]

// --- hwPimInvalidRegister (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.149.4.0.2
// Fields: hwPimGroupMappingPimMode, hwPimInvalidRegisterAddressType, hwPimInvalidRegisterOrigin, hwPimInvalidRegisterGroup, hwPimInvalidRegisterRp, hwPimInstanceID, hwPimInstanceName
// Description: A hwPimInvalidRegister notification signifies that an invalid PIM Register message was received by this device. This notification is generated whenever the counter hwPimInvalidRegisterMsgsRcvd is incr...
trapMap["1.3.6.1.4.1.2011.5.25.149.4.0.2"] = [
    name: "hwPimInvalidRegister",
    fields: ["hwPimGroupMappingPimMode", "hwPimInvalidRegisterAddressType", "hwPimInvalidRegisterOrigin", "hwPimInvalidRegisterGroup", "hwPimInvalidRegisterRp", "hwPimInstanceID", "hwPimInstanceName"],
    fieldOids: ["hwPimGroupMappingPimMode": "1.3.6.1.4.1.2011.5.25.149.4.1.13.1.7", "hwPimInvalidRegisterAddressType": "1.3.6.1.4.1.2011.5.25.149.4.1.33", "hwPimInvalidRegisterOrigin": "1.3.6.1.4.1.2011.5.25.149.4.1.34", "hwPimInvalidRegisterGroup": "1.3.6.1.4.1.2011.5.25.149.4.1.35", "hwPimInvalidRegisterRp": "1.3.6.1.4.1.2011.5.25.149.4.1.36", "hwPimInstanceID": "1.3.6.1.4.1.2011.5.25.149.4.1.57", "hwPimInstanceName": "1.3.6.1.4.1.2011.5.25.149.4.1.60"]
]

// --- hwPimInvalidJoinPrune (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.149.4.0.3
// Fields: hwPimGroupMappingPimMode, hwPimInvalidJoinPruneAddressType, hwPimInvalidJoinPruneOrigin, hwPimInvalidJoinPruneGroup, hwPimInvalidJoinPruneRp, hwPimNeighborUpTime, hwPimNeighborIfName, hwPimInstanceID, hwPimInstanceName
// Description: A hwPimInvalidJoinPrune notification signifies that an invalid PIM Join/Prune message was received by this device. This notification is generated whenever the counter hwPimInvalidJoinPruneMsgsRcvd is ...
trapMap["1.3.6.1.4.1.2011.5.25.149.4.0.3"] = [
    name: "hwPimInvalidJoinPrune",
    fields: ["hwPimGroupMappingPimMode", "hwPimInvalidJoinPruneAddressType", "hwPimInvalidJoinPruneOrigin", "hwPimInvalidJoinPruneGroup", "hwPimInvalidJoinPruneRp", "hwPimNeighborUpTime", "hwPimNeighborIfName", "hwPimInstanceID", "hwPimInstanceName"],
    fieldOids: ["hwPimGroupMappingPimMode": "1.3.6.1.4.1.2011.5.25.149.4.1.13.1.7", "hwPimInvalidJoinPruneAddressType": "1.3.6.1.4.1.2011.5.25.149.4.1.39", "hwPimInvalidJoinPruneOrigin": "1.3.6.1.4.1.2011.5.25.149.4.1.40", "hwPimInvalidJoinPruneGroup": "1.3.6.1.4.1.2011.5.25.149.4.1.41", "hwPimInvalidJoinPruneRp": "1.3.6.1.4.1.2011.5.25.149.4.1.42", "hwPimNeighborUpTime": "1.3.6.1.4.1.2011.5.25.149.4.1.2.1.6", "hwPimNeighborIfName": "1.3.6.1.4.1.2011.5.25.149.4.1.2.1.16", "hwPimInstanceID": "1.3.6.1.4.1.2011.5.25.149.4.1.57", "hwPimInstanceName": "1.3.6.1.4.1.2011.5.25.149.4.1.60"]
]

// --- hwPimRpMappingChange (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.149.4.0.4
// Fields: hwPimGroupMappingPimMode, hwPimGroupMappingPrecedence, hwPimInstanceID, hwPimInstanceName
// Description: A hwPimRpMappingChange notification signifies a change to the active RP mapping on this device. This notification is generated whenever the counter hwPimRpMappingChangeCount is incremented, subject to...
trapMap["1.3.6.1.4.1.2011.5.25.149.4.0.4"] = [
    name: "hwPimRpMappingChange",
    fields: ["hwPimGroupMappingPimMode", "hwPimGroupMappingPrecedence", "hwPimInstanceID", "hwPimInstanceName"],
    fieldOids: ["hwPimGroupMappingPimMode": "1.3.6.1.4.1.2011.5.25.149.4.1.13.1.7", "hwPimGroupMappingPrecedence": "1.3.6.1.4.1.2011.5.25.149.4.1.13.1.8", "hwPimInstanceID": "1.3.6.1.4.1.2011.5.25.149.4.1.57", "hwPimInstanceName": "1.3.6.1.4.1.2011.5.25.149.4.1.60"]
]

// --- hwPimInterfaceElection (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.149.4.0.5
// Fields: hwPimInterfaceAddressType, hwPimInterfaceAddress, hwPimInterfaceName, hwPimInstanceID, hwPimInstanceName
// Description: A hwPimInterfaceElection notification signifies that a new DR or DF has been elected on a network. This notification is generated whenever the counter hwPimInterfaceElectionWinCount is incremented, su...
trapMap["1.3.6.1.4.1.2011.5.25.149.4.0.5"] = [
    name: "hwPimInterfaceElection",
    fields: ["hwPimInterfaceAddressType", "hwPimInterfaceAddress", "hwPimInterfaceName", "hwPimInstanceID", "hwPimInstanceName"],
    fieldOids: ["hwPimInterfaceAddressType": "1.3.6.1.4.1.2011.5.25.149.4.1.1.1.3", "hwPimInterfaceAddress": "1.3.6.1.4.1.2011.5.25.149.4.1.1.1.4", "hwPimInterfaceName": "1.3.6.1.4.1.2011.5.25.149.4.1.1.1.29", "hwPimInstanceID": "1.3.6.1.4.1.2011.5.25.149.4.1.57", "hwPimInstanceName": "1.3.6.1.4.1.2011.5.25.149.4.1.60"]
]

// --- hwPimNeighborAdd (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.149.4.0.6
// Fields: hwPimNeighborExpiryTime, hwPimInstanceID, hwPimInstanceName
// Description: A hwPimNeighborAdd notification signifies the new neighbor. This notification should be generated when receiving the hello report of a new neighbor. This notification is generated whenever the counter...
trapMap["1.3.6.1.4.1.2011.5.25.149.4.0.6"] = [
    name: "hwPimNeighborAdd",
    fields: ["hwPimNeighborExpiryTime", "hwPimInstanceID", "hwPimInstanceName"],
    fieldOids: ["hwPimNeighborExpiryTime": "1.3.6.1.4.1.2011.5.25.149.4.1.2.1.7", "hwPimInstanceID": "1.3.6.1.4.1.2011.5.25.149.4.1.57", "hwPimInstanceName": "1.3.6.1.4.1.2011.5.25.149.4.1.60"]
]

// --- hwPimGRStart (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.149.4.0.7
// Fields: hwPimGRStartTime, hwPimGRInterval, hwPimInstanceID
// Description: A hwPimGRStart notification signifies that the router enters the PIM GR state.
trapMap["1.3.6.1.4.1.2011.5.25.149.4.0.7"] = [
    name: "hwPimGRStart",
    fields: ["hwPimGRStartTime", "hwPimGRInterval", "hwPimInstanceID"],
    fieldOids: ["hwPimGRStartTime": "1.3.6.1.4.1.2011.5.25.149.4.1.51", "hwPimGRInterval": "1.3.6.1.4.1.2011.5.25.149.4.1.52", "hwPimInstanceID": "1.3.6.1.4.1.2011.5.25.149.4.1.57"]
]

// --- hwPimGREnd (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.149.4.0.8
// Fields: hwPimGREndTime, hwPimInstanceID
// Description: A hwPimGREnd notification signifies that the router leaves the PIM GR state.
trapMap["1.3.6.1.4.1.2011.5.25.149.4.0.8"] = [
    name: "hwPimGREnd",
    fields: ["hwPimGREndTime", "hwPimInstanceID"],
    fieldOids: ["hwPimGREndTime": "1.3.6.1.4.1.2011.5.25.149.4.1.53", "hwPimInstanceID": "1.3.6.1.4.1.2011.5.25.149.4.1.57"]
]

// --- hwPimMrtLimit (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.149.4.0.9
// Fields: hwPimMrtLimitAddressType, hwPimMrtLimitSource, hwPimMrtLimitGroup, hwPimInstanceID, hwPimInstanceName
// Description: A hwPimMrtLimit notification signifies that PIM entries cannot be created because the upper limit is crossed.
trapMap["1.3.6.1.4.1.2011.5.25.149.4.0.9"] = [
    name: "hwPimMrtLimit",
    fields: ["hwPimMrtLimitAddressType", "hwPimMrtLimitSource", "hwPimMrtLimitGroup", "hwPimInstanceID", "hwPimInstanceName"],
    fieldOids: ["hwPimMrtLimitAddressType": "1.3.6.1.4.1.2011.5.25.149.4.1.54", "hwPimMrtLimitSource": "1.3.6.1.4.1.2011.5.25.149.4.1.55", "hwPimMrtLimitGroup": "1.3.6.1.4.1.2011.5.25.149.4.1.56", "hwPimInstanceID": "1.3.6.1.4.1.2011.5.25.149.4.1.57", "hwPimInstanceName": "1.3.6.1.4.1.2011.5.25.149.4.1.60"]
]

// --- hwPimNeighborUnavailable (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.149.4.0.10
// Fields: hwPimNeighborIfName, hwPimInstanceID, hwPimInstanceName, hwPimNeighborNotificationReason
// Description: A hwPimNeighborUnavailable notification signifies that the PIM neighbor is unavailable.
trapMap["1.3.6.1.4.1.2011.5.25.149.4.0.10"] = [
    name: "hwPimNeighborUnavailable",
    fields: ["hwPimNeighborIfName", "hwPimInstanceID", "hwPimInstanceName", "hwPimNeighborNotificationReason"],
    fieldOids: ["hwPimNeighborIfName": "1.3.6.1.4.1.2011.5.25.149.4.1.2.1.16", "hwPimInstanceID": "1.3.6.1.4.1.2011.5.25.149.4.1.57", "hwPimInstanceName": "1.3.6.1.4.1.2011.5.25.149.4.1.60", "hwPimNeighborNotificationReason": "1.3.6.1.4.1.2011.5.25.149.4.1.61"]
]

// --- hwPimNeighborUnavailableClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.149.4.0.11
// Fields: hwPimNeighborIfName, hwPimInstanceID, hwPimInstanceName, hwPimNeighborNotificationReason
// Description: A hwPimNeighborUnavailableClear notification signifies that the PIM neighbor is available.
trapMap["1.3.6.1.4.1.2011.5.25.149.4.0.11"] = [
    name: "hwPimNeighborUnavailableClear",
    fields: ["hwPimNeighborIfName", "hwPimInstanceID", "hwPimInstanceName", "hwPimNeighborNotificationReason"],
    fieldOids: ["hwPimNeighborIfName": "1.3.6.1.4.1.2011.5.25.149.4.1.2.1.16", "hwPimInstanceID": "1.3.6.1.4.1.2011.5.25.149.4.1.57", "hwPimInstanceName": "1.3.6.1.4.1.2011.5.25.149.4.1.60", "hwPimNeighborNotificationReason": "1.3.6.1.4.1.2011.5.25.149.4.1.61"]
]

// --- hwPimMrtLimitClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.149.4.0.12
// Fields: hwPimMrtLimitAddressType, hwPimMrtLimitSource, hwPimMrtLimitGroup, hwPimInstanceID, hwPimInstanceName
// Description: A hwPimMrtLimit notification signifies that PIM entries can created.
trapMap["1.3.6.1.4.1.2011.5.25.149.4.0.12"] = [
    name: "hwPimMrtLimitClear",
    fields: ["hwPimMrtLimitAddressType", "hwPimMrtLimitSource", "hwPimMrtLimitGroup", "hwPimInstanceID", "hwPimInstanceName"],
    fieldOids: ["hwPimMrtLimitAddressType": "1.3.6.1.4.1.2011.5.25.149.4.1.54", "hwPimMrtLimitSource": "1.3.6.1.4.1.2011.5.25.149.4.1.55", "hwPimMrtLimitGroup": "1.3.6.1.4.1.2011.5.25.149.4.1.56", "hwPimInstanceID": "1.3.6.1.4.1.2011.5.25.149.4.1.57", "hwPimInstanceName": "1.3.6.1.4.1.2011.5.25.149.4.1.60"]
]

// --- hwPimStarGThresholdExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.149.4.0.13
// Fields: hwPimNotificationAddressType, hwPimStarGCurrentCount, hwPimStarGThreshold, hwPimStarGTotalCount
// Description: A hwPimStarGThresholdExceed notification signifies that PIM (*, G) entries count of all instances reached the upper threshold.
trapMap["1.3.6.1.4.1.2011.5.25.149.4.0.13"] = [
    name: "hwPimStarGThresholdExceed",
    fields: ["hwPimNotificationAddressType", "hwPimStarGCurrentCount", "hwPimStarGThreshold", "hwPimStarGTotalCount"],
    fieldOids: ["hwPimNotificationAddressType": "1.3.6.1.4.1.2011.5.25.149.4.1.62", "hwPimStarGCurrentCount": "1.3.6.1.4.1.2011.5.25.149.4.1.63", "hwPimStarGThreshold": "1.3.6.1.4.1.2011.5.25.149.4.1.65", "hwPimStarGTotalCount": "1.3.6.1.4.1.2011.5.25.149.4.1.64"]
]

// --- hwPimStarGThresholdExceedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.149.4.0.14
// Fields: hwPimNotificationAddressType, hwPimStarGCurrentCount, hwPimStarGThreshold, hwPimStarGTotalCount
// Description: A hwPimStarGThresholdExceedClear notification signifies that PIM (*, G) entries count of all instances fell below the lower threshold.
trapMap["1.3.6.1.4.1.2011.5.25.149.4.0.14"] = [
    name: "hwPimStarGThresholdExceedClear",
    fields: ["hwPimNotificationAddressType", "hwPimStarGCurrentCount", "hwPimStarGThreshold", "hwPimStarGTotalCount"],
    fieldOids: ["hwPimNotificationAddressType": "1.3.6.1.4.1.2011.5.25.149.4.1.62", "hwPimStarGCurrentCount": "1.3.6.1.4.1.2011.5.25.149.4.1.63", "hwPimStarGThreshold": "1.3.6.1.4.1.2011.5.25.149.4.1.65", "hwPimStarGTotalCount": "1.3.6.1.4.1.2011.5.25.149.4.1.64"]
]

// --- hwPimStarGExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.149.4.0.15
// Fields: hwPimNotificationAddressType, hwPimNotificationSrcAddr, hwPimNotificationGrpAddr, hwPimStarGTotalCount, hwPimInstanceName
// Description: A hwPimStarGExceed notification signifies that PIM (*, G) entries count of all instances reached the limit.
trapMap["1.3.6.1.4.1.2011.5.25.149.4.0.15"] = [
    name: "hwPimStarGExceed",
    fields: ["hwPimNotificationAddressType", "hwPimNotificationSrcAddr", "hwPimNotificationGrpAddr", "hwPimStarGTotalCount", "hwPimInstanceName"],
    fieldOids: ["hwPimNotificationAddressType": "1.3.6.1.4.1.2011.5.25.149.4.1.62", "hwPimNotificationSrcAddr": "1.3.6.1.4.1.2011.5.25.149.4.1.69", "hwPimNotificationGrpAddr": "1.3.6.1.4.1.2011.5.25.149.4.1.70", "hwPimStarGTotalCount": "1.3.6.1.4.1.2011.5.25.149.4.1.64", "hwPimInstanceName": "1.3.6.1.4.1.2011.5.25.149.4.1.60"]
]

// --- hwPimStarGExceedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.149.4.0.16
// Fields: hwPimNotificationAddressType
// Description: A hwPimStarGExceedClear notification signifies that PIM(*, G) entries count of all instances fell below the limit.
trapMap["1.3.6.1.4.1.2011.5.25.149.4.0.16"] = [
    name: "hwPimStarGExceedClear",
    fields: ["hwPimNotificationAddressType"],
    fieldOids: ["hwPimNotificationAddressType": "1.3.6.1.4.1.2011.5.25.149.4.1.62"]
]

// --- hwPimSGThresholdExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.149.4.0.17
// Fields: hwPimNotificationAddressType, hwPimSGCurrentCount, hwPimSGThreshold, hwPimSGTotalCount
// Description: A hwPimSGThresholdExceed notification signifies that PIM (S, G) entries count of all instances reached the upper threshold.
trapMap["1.3.6.1.4.1.2011.5.25.149.4.0.17"] = [
    name: "hwPimSGThresholdExceed",
    fields: ["hwPimNotificationAddressType", "hwPimSGCurrentCount", "hwPimSGThreshold", "hwPimSGTotalCount"],
    fieldOids: ["hwPimNotificationAddressType": "1.3.6.1.4.1.2011.5.25.149.4.1.62", "hwPimSGCurrentCount": "1.3.6.1.4.1.2011.5.25.149.4.1.66", "hwPimSGThreshold": "1.3.6.1.4.1.2011.5.25.149.4.1.68", "hwPimSGTotalCount": "1.3.6.1.4.1.2011.5.25.149.4.1.67"]
]

// --- hwPimSGThresholdExceedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.149.4.0.18
// Fields: hwPimNotificationAddressType, hwPimSGCurrentCount, hwPimSGThreshold, hwPimSGTotalCount
// Description: A hwPimSGThresholdExceedClear notification signifies that PIM (S, G) entries count of all instances fell below the lower threshold.
trapMap["1.3.6.1.4.1.2011.5.25.149.4.0.18"] = [
    name: "hwPimSGThresholdExceedClear",
    fields: ["hwPimNotificationAddressType", "hwPimSGCurrentCount", "hwPimSGThreshold", "hwPimSGTotalCount"],
    fieldOids: ["hwPimNotificationAddressType": "1.3.6.1.4.1.2011.5.25.149.4.1.62", "hwPimSGCurrentCount": "1.3.6.1.4.1.2011.5.25.149.4.1.66", "hwPimSGThreshold": "1.3.6.1.4.1.2011.5.25.149.4.1.68", "hwPimSGTotalCount": "1.3.6.1.4.1.2011.5.25.149.4.1.67"]
]

// --- hwPimSGExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.149.4.0.19
// Fields: hwPimNotificationAddressType, hwPimNotificationSrcAddr, hwPimNotificationGrpAddr, hwPimSGTotalCount, hwPimInstanceName
// Description: A hwPimSGExceed notification signifies that PIM (S, G) entries count of all instances reached the limit.
trapMap["1.3.6.1.4.1.2011.5.25.149.4.0.19"] = [
    name: "hwPimSGExceed",
    fields: ["hwPimNotificationAddressType", "hwPimNotificationSrcAddr", "hwPimNotificationGrpAddr", "hwPimSGTotalCount", "hwPimInstanceName"],
    fieldOids: ["hwPimNotificationAddressType": "1.3.6.1.4.1.2011.5.25.149.4.1.62", "hwPimNotificationSrcAddr": "1.3.6.1.4.1.2011.5.25.149.4.1.69", "hwPimNotificationGrpAddr": "1.3.6.1.4.1.2011.5.25.149.4.1.70", "hwPimSGTotalCount": "1.3.6.1.4.1.2011.5.25.149.4.1.67", "hwPimInstanceName": "1.3.6.1.4.1.2011.5.25.149.4.1.60"]
]

// --- hwPimSGExceedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.149.4.0.20
// Fields: hwPimNotificationAddressType
// Description: A hwPimSGExceedClear notification signifies that the number of PIM(S, G) entries count of all instances fell below the limit.
trapMap["1.3.6.1.4.1.2011.5.25.149.4.0.20"] = [
    name: "hwPimSGExceedClear",
    fields: ["hwPimNotificationAddressType"],
    fieldOids: ["hwPimNotificationAddressType": "1.3.6.1.4.1.2011.5.25.149.4.1.62"]
]

// --- hwPimGlobalTypeSGThresholdExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.149.4.0.21
// Fields: hwPimNotificationLimitType, hwPimNotificationAddressType, hwPimNotificationTypeTotalCount, hwPimNotificationLimitUpperThreshold, hwPimNotificationThresholdReasonType
// Description: A hwPimGlobalTypeSGThresholdExceed notification signifies that PIM specified type entries count of all instances reached the upper threshold.
trapMap["1.3.6.1.4.1.2011.5.25.149.4.0.21"] = [
    name: "hwPimGlobalTypeSGThresholdExceed",
    fields: ["hwPimNotificationLimitType", "hwPimNotificationAddressType", "hwPimNotificationTypeTotalCount", "hwPimNotificationLimitUpperThreshold", "hwPimNotificationThresholdReasonType"],
    fieldOids: ["hwPimNotificationLimitType": "1.3.6.1.4.1.2011.5.25.149.4.1.74", "hwPimNotificationAddressType": "1.3.6.1.4.1.2011.5.25.149.4.1.62", "hwPimNotificationTypeTotalCount": "1.3.6.1.4.1.2011.5.25.149.4.1.72", "hwPimNotificationLimitUpperThreshold": "1.3.6.1.4.1.2011.5.25.149.4.1.75", "hwPimNotificationThresholdReasonType": "1.3.6.1.4.1.2011.5.25.149.4.1.78"]
]

// --- hwPimGlobalTypeSGThresholdExceedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.149.4.0.22
// Fields: hwPimNotificationLimitType, hwPimNotificationAddressType, hwPimNotificationTypeTotalCount, hwPimNotificationLimitLowerThreshold, hwPimNotificationThresholdClearReasonType
// Description: A hwPimGlobalTypeSGThresholdExceedClear notification signifies that PIM specified type entries count of all instances fell below the lower threshold.
trapMap["1.3.6.1.4.1.2011.5.25.149.4.0.22"] = [
    name: "hwPimGlobalTypeSGThresholdExceedClear",
    fields: ["hwPimNotificationLimitType", "hwPimNotificationAddressType", "hwPimNotificationTypeTotalCount", "hwPimNotificationLimitLowerThreshold", "hwPimNotificationThresholdClearReasonType"],
    fieldOids: ["hwPimNotificationLimitType": "1.3.6.1.4.1.2011.5.25.149.4.1.74", "hwPimNotificationAddressType": "1.3.6.1.4.1.2011.5.25.149.4.1.62", "hwPimNotificationTypeTotalCount": "1.3.6.1.4.1.2011.5.25.149.4.1.72", "hwPimNotificationLimitLowerThreshold": "1.3.6.1.4.1.2011.5.25.149.4.1.76", "hwPimNotificationThresholdClearReasonType": "1.3.6.1.4.1.2011.5.25.149.4.1.79"]
]

// --- hwPimGlobalTypeSGExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.149.4.0.23
// Fields: hwPimNotificationLimitType, hwPimNotificationAddressType, hwPimNotificationTypeTotalCount, hwPimNotificationTypeLimit, hwPimNotificationSrcAddr, hwPimNotificationGrpAddr, hwPimInstanceName
// Description: A hwPimGlobalTypeSGExceed notification signifies that PIM specified type entries count of all instances reached the limit.
trapMap["1.3.6.1.4.1.2011.5.25.149.4.0.23"] = [
    name: "hwPimGlobalTypeSGExceed",
    fields: ["hwPimNotificationLimitType", "hwPimNotificationAddressType", "hwPimNotificationTypeTotalCount", "hwPimNotificationTypeLimit", "hwPimNotificationSrcAddr", "hwPimNotificationGrpAddr", "hwPimInstanceName"],
    fieldOids: ["hwPimNotificationLimitType": "1.3.6.1.4.1.2011.5.25.149.4.1.74", "hwPimNotificationAddressType": "1.3.6.1.4.1.2011.5.25.149.4.1.62", "hwPimNotificationTypeTotalCount": "1.3.6.1.4.1.2011.5.25.149.4.1.72", "hwPimNotificationTypeLimit": "1.3.6.1.4.1.2011.5.25.149.4.1.73", "hwPimNotificationSrcAddr": "1.3.6.1.4.1.2011.5.25.149.4.1.69", "hwPimNotificationGrpAddr": "1.3.6.1.4.1.2011.5.25.149.4.1.70", "hwPimInstanceName": "1.3.6.1.4.1.2011.5.25.149.4.1.60"]
]

// --- hwPimGlobalTypeSGExceedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.149.4.0.24
// Fields: hwPimNotificationLimitType, hwPimNotificationAddressType, hwPimNotificationTypeTotalCount, hwPimNotificationTypeLimit, hwPimNotificationSrcAddr, hwPimNotificationGrpAddr, hwPimInstanceName, hwPimNotificationLimitReasonType
// Description: A hwPimGlobalTypeSGExceedClear notification signifies that the number of PIM specified type entries count of all instances fell below the limit.
trapMap["1.3.6.1.4.1.2011.5.25.149.4.0.24"] = [
    name: "hwPimGlobalTypeSGExceedClear",
    fields: ["hwPimNotificationLimitType", "hwPimNotificationAddressType", "hwPimNotificationTypeTotalCount", "hwPimNotificationTypeLimit", "hwPimNotificationSrcAddr", "hwPimNotificationGrpAddr", "hwPimInstanceName", "hwPimNotificationLimitReasonType"],
    fieldOids: ["hwPimNotificationLimitType": "1.3.6.1.4.1.2011.5.25.149.4.1.74", "hwPimNotificationAddressType": "1.3.6.1.4.1.2011.5.25.149.4.1.62", "hwPimNotificationTypeTotalCount": "1.3.6.1.4.1.2011.5.25.149.4.1.72", "hwPimNotificationTypeLimit": "1.3.6.1.4.1.2011.5.25.149.4.1.73", "hwPimNotificationSrcAddr": "1.3.6.1.4.1.2011.5.25.149.4.1.69", "hwPimNotificationGrpAddr": "1.3.6.1.4.1.2011.5.25.149.4.1.70", "hwPimInstanceName": "1.3.6.1.4.1.2011.5.25.149.4.1.60", "hwPimNotificationLimitReasonType": "1.3.6.1.4.1.2011.5.25.149.4.1.77"]
]

// --- hwPimSrcNumLimit (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.149.4.0.25
// Fields: hwPimNotificationAddressType, hwPimNotificationGrpAddr, hwPimInstanceID, hwPimInstanceName
// Description: A hwPimSrcNumLimit notification signifies that the number of multicast sources for a multicast group exceeded the upper limit.
trapMap["1.3.6.1.4.1.2011.5.25.149.4.0.25"] = [
    name: "hwPimSrcNumLimit",
    fields: ["hwPimNotificationAddressType", "hwPimNotificationGrpAddr", "hwPimInstanceID", "hwPimInstanceName"],
    fieldOids: ["hwPimNotificationAddressType": "1.3.6.1.4.1.2011.5.25.149.4.1.62", "hwPimNotificationGrpAddr": "1.3.6.1.4.1.2011.5.25.149.4.1.70", "hwPimInstanceID": "1.3.6.1.4.1.2011.5.25.149.4.1.57", "hwPimInstanceName": "1.3.6.1.4.1.2011.5.25.149.4.1.60"]
]

// --- hwPimSrcNumLimitClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.149.4.0.26
// Fields: hwPimNotificationAddressType, hwPimNotificationGrpAddr, hwPimInstanceID, hwPimInstanceName
// Description: A hwPimSrcNumLimitClear notification signifies that the number of multicast sources for a multicast group fell below 90% of the specification.
trapMap["1.3.6.1.4.1.2011.5.25.149.4.0.26"] = [
    name: "hwPimSrcNumLimitClear",
    fields: ["hwPimNotificationAddressType", "hwPimNotificationGrpAddr", "hwPimInstanceID", "hwPimInstanceName"],
    fieldOids: ["hwPimNotificationAddressType": "1.3.6.1.4.1.2011.5.25.149.4.1.62", "hwPimNotificationGrpAddr": "1.3.6.1.4.1.2011.5.25.149.4.1.70", "hwPimInstanceID": "1.3.6.1.4.1.2011.5.25.149.4.1.57", "hwPimInstanceName": "1.3.6.1.4.1.2011.5.25.149.4.1.60"]
]

// --- hwPimBasNeighborLoss (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.149.4.0.27
// Fields: hwPimNeighborUpTime, hwPimNeighborIfName, hwPimInstanceID, hwPimInstanceName, hwPimNeighborNotificationReason
// Description: A hwPimBasNeighborLoss notification signifies the loss of an adjacency with a neighbor. This notification should be generated when the bas neighbor is lost.
trapMap["1.3.6.1.4.1.2011.5.25.149.4.0.27"] = [
    name: "hwPimBasNeighborLoss",
    fields: ["hwPimNeighborUpTime", "hwPimNeighborIfName", "hwPimInstanceID", "hwPimInstanceName", "hwPimNeighborNotificationReason"],
    fieldOids: ["hwPimNeighborUpTime": "1.3.6.1.4.1.2011.5.25.149.4.1.2.1.6", "hwPimNeighborIfName": "1.3.6.1.4.1.2011.5.25.149.4.1.2.1.16", "hwPimInstanceID": "1.3.6.1.4.1.2011.5.25.149.4.1.57", "hwPimInstanceName": "1.3.6.1.4.1.2011.5.25.149.4.1.60", "hwPimNeighborNotificationReason": "1.3.6.1.4.1.2011.5.25.149.4.1.61"]
]

// --- hwPimBasNeighborExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.149.4.0.28
// Fields: hwPimNotificationAddressType, hwPimNotificationSlot, hwPimNotificationTypeTotalCount
// Description: A hwPimBasNeighborExceed notification signifies that PIM neighbors reached the upper limit.
trapMap["1.3.6.1.4.1.2011.5.25.149.4.0.28"] = [
    name: "hwPimBasNeighborExceed",
    fields: ["hwPimNotificationAddressType", "hwPimNotificationSlot", "hwPimNotificationTypeTotalCount"],
    fieldOids: ["hwPimNotificationAddressType": "1.3.6.1.4.1.2011.5.25.149.4.1.62", "hwPimNotificationSlot": "1.3.6.1.4.1.2011.5.25.149.4.1.80", "hwPimNotificationTypeTotalCount": "1.3.6.1.4.1.2011.5.25.149.4.1.72"]
]

// --- hwPimBasNeighborExceedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.149.4.0.29
// Fields: hwPimNotificationAddressType, hwPimNotificationSlot, hwPimNotificationTypeTotalCount
// Description: A hwPimBasNeighborExceedClear notification signifies that PIM neighbors below the upper limit.
trapMap["1.3.6.1.4.1.2011.5.25.149.4.0.29"] = [
    name: "hwPimBasNeighborExceedClear",
    fields: ["hwPimNotificationAddressType", "hwPimNotificationSlot", "hwPimNotificationTypeTotalCount"],
    fieldOids: ["hwPimNotificationAddressType": "1.3.6.1.4.1.2011.5.25.149.4.1.62", "hwPimNotificationSlot": "1.3.6.1.4.1.2011.5.25.149.4.1.80", "hwPimNotificationTypeTotalCount": "1.3.6.1.4.1.2011.5.25.149.4.1.72"]
]

// --- hwPimVrfTypeSGThresholdExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.149.4.0.30
// Fields: hwPimNotificationLimitType, hwPimNotificationAddressType, hwPimInstanceName, hwPimNotificationTypeTotalCount, hwPimNotificationTypeLimit, hwPimNotificationLimitUpperThreshold
// Description: A hwPimVrfTypeSGThresholdExceed notification signifies that PIM specified type entries count of vpn instance reached the upper threshold.
trapMap["1.3.6.1.4.1.2011.5.25.149.4.0.30"] = [
    name: "hwPimVrfTypeSGThresholdExceed",
    fields: ["hwPimNotificationLimitType", "hwPimNotificationAddressType", "hwPimInstanceName", "hwPimNotificationTypeTotalCount", "hwPimNotificationTypeLimit", "hwPimNotificationLimitUpperThreshold"],
    fieldOids: ["hwPimNotificationLimitType": "1.3.6.1.4.1.2011.5.25.149.4.1.74", "hwPimNotificationAddressType": "1.3.6.1.4.1.2011.5.25.149.4.1.62", "hwPimInstanceName": "1.3.6.1.4.1.2011.5.25.149.4.1.60", "hwPimNotificationTypeTotalCount": "1.3.6.1.4.1.2011.5.25.149.4.1.72", "hwPimNotificationTypeLimit": "1.3.6.1.4.1.2011.5.25.149.4.1.73", "hwPimNotificationLimitUpperThreshold": "1.3.6.1.4.1.2011.5.25.149.4.1.75"]
]

// --- hwPimVrfTypeSGThresholdExceedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.149.4.0.31
// Fields: hwPimNotificationLimitType, hwPimNotificationAddressType, hwPimInstanceName, hwPimNotificationTypeTotalCount, hwPimNotificationTypeLimit, hwPimNotificationLimitLowerThreshold, hwPimNotificationThresholdClearReasonType
// Description: A hwPimVrfTypeSGThresholdExceedClear notification signifies that PIM specified type entries count of vpn instance fell below the lower threshold.
trapMap["1.3.6.1.4.1.2011.5.25.149.4.0.31"] = [
    name: "hwPimVrfTypeSGThresholdExceedClear",
    fields: ["hwPimNotificationLimitType", "hwPimNotificationAddressType", "hwPimInstanceName", "hwPimNotificationTypeTotalCount", "hwPimNotificationTypeLimit", "hwPimNotificationLimitLowerThreshold", "hwPimNotificationThresholdClearReasonType"],
    fieldOids: ["hwPimNotificationLimitType": "1.3.6.1.4.1.2011.5.25.149.4.1.74", "hwPimNotificationAddressType": "1.3.6.1.4.1.2011.5.25.149.4.1.62", "hwPimInstanceName": "1.3.6.1.4.1.2011.5.25.149.4.1.60", "hwPimNotificationTypeTotalCount": "1.3.6.1.4.1.2011.5.25.149.4.1.72", "hwPimNotificationTypeLimit": "1.3.6.1.4.1.2011.5.25.149.4.1.73", "hwPimNotificationLimitLowerThreshold": "1.3.6.1.4.1.2011.5.25.149.4.1.76", "hwPimNotificationThresholdClearReasonType": "1.3.6.1.4.1.2011.5.25.149.4.1.79"]
]

// --- hwPimVrfTypeSGExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.149.4.0.32
// Fields: hwPimNotificationLimitType, hwPimNotificationAddressType, hwPimInstanceName, hwPimNotificationTypeTotalCount, hwPimNotificationTypeLimit, hwPimNotificationSrcAddr, hwPimNotificationGrpAddr
// Description: A hwPimVrfTypeSGExceed notification signifies that PIM specified type entries count of vpn instances reached the limit.
trapMap["1.3.6.1.4.1.2011.5.25.149.4.0.32"] = [
    name: "hwPimVrfTypeSGExceed",
    fields: ["hwPimNotificationLimitType", "hwPimNotificationAddressType", "hwPimInstanceName", "hwPimNotificationTypeTotalCount", "hwPimNotificationTypeLimit", "hwPimNotificationSrcAddr", "hwPimNotificationGrpAddr"],
    fieldOids: ["hwPimNotificationLimitType": "1.3.6.1.4.1.2011.5.25.149.4.1.74", "hwPimNotificationAddressType": "1.3.6.1.4.1.2011.5.25.149.4.1.62", "hwPimInstanceName": "1.3.6.1.4.1.2011.5.25.149.4.1.60", "hwPimNotificationTypeTotalCount": "1.3.6.1.4.1.2011.5.25.149.4.1.72", "hwPimNotificationTypeLimit": "1.3.6.1.4.1.2011.5.25.149.4.1.73", "hwPimNotificationSrcAddr": "1.3.6.1.4.1.2011.5.25.149.4.1.69", "hwPimNotificationGrpAddr": "1.3.6.1.4.1.2011.5.25.149.4.1.70"]
]

// --- hwPimVrfTypeSGExceedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.149.4.0.33
// Fields: hwPimNotificationLimitType, hwPimNotificationAddressType, hwPimInstanceName, hwPimNotificationTypeTotalCount, hwPimNotificationTypeLimit, hwPimNotificationSrcAddr, hwPimNotificationGrpAddr, hwPimNotificationLimitReasonType
// Description: A hwPimVrfTypeSGExceedClear notification signifies that the number of PIM specified type entries count of vpn instances fell below the limit.
trapMap["1.3.6.1.4.1.2011.5.25.149.4.0.33"] = [
    name: "hwPimVrfTypeSGExceedClear",
    fields: ["hwPimNotificationLimitType", "hwPimNotificationAddressType", "hwPimInstanceName", "hwPimNotificationTypeTotalCount", "hwPimNotificationTypeLimit", "hwPimNotificationSrcAddr", "hwPimNotificationGrpAddr", "hwPimNotificationLimitReasonType"],
    fieldOids: ["hwPimNotificationLimitType": "1.3.6.1.4.1.2011.5.25.149.4.1.74", "hwPimNotificationAddressType": "1.3.6.1.4.1.2011.5.25.149.4.1.62", "hwPimInstanceName": "1.3.6.1.4.1.2011.5.25.149.4.1.60", "hwPimNotificationTypeTotalCount": "1.3.6.1.4.1.2011.5.25.149.4.1.72", "hwPimNotificationTypeLimit": "1.3.6.1.4.1.2011.5.25.149.4.1.73", "hwPimNotificationSrcAddr": "1.3.6.1.4.1.2011.5.25.149.4.1.69", "hwPimNotificationGrpAddr": "1.3.6.1.4.1.2011.5.25.149.4.1.70", "hwPimNotificationLimitReasonType": "1.3.6.1.4.1.2011.5.25.149.4.1.77"]
]

// --- hwPimRpfRtFlapping (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.149.4.0.34
// Fields: hwPimNotificationAddressType, hwPimNotificationSrcAddr, hwPimInstanceName
// Description: A hwPimRpfRtFlapping notification signifies that PIM RPF route is flapping.
trapMap["1.3.6.1.4.1.2011.5.25.149.4.0.34"] = [
    name: "hwPimRpfRtFlapping",
    fields: ["hwPimNotificationAddressType", "hwPimNotificationSrcAddr", "hwPimInstanceName"],
    fieldOids: ["hwPimNotificationAddressType": "1.3.6.1.4.1.2011.5.25.149.4.1.62", "hwPimNotificationSrcAddr": "1.3.6.1.4.1.2011.5.25.149.4.1.69", "hwPimInstanceName": "1.3.6.1.4.1.2011.5.25.149.4.1.60"]
]

// --- hwPimRpfRtFlappingClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.149.4.0.35
// Fields: hwPimNotificationAddressType, hwPimNotificationSrcAddr, hwPimInstanceName
// Description: A hwPimRpfRtFlappingClear notification signifies that the flapping of PIM RPF route is clear.
trapMap["1.3.6.1.4.1.2011.5.25.149.4.0.35"] = [
    name: "hwPimRpfRtFlappingClear",
    fields: ["hwPimNotificationAddressType", "hwPimNotificationSrcAddr", "hwPimInstanceName"],
    fieldOids: ["hwPimNotificationAddressType": "1.3.6.1.4.1.2011.5.25.149.4.1.62", "hwPimNotificationSrcAddr": "1.3.6.1.4.1.2011.5.25.149.4.1.69", "hwPimInstanceName": "1.3.6.1.4.1.2011.5.25.149.4.1.60"]
]

// --- hwPimRpfAssertWinnerFlapping (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.149.4.0.36
// Fields: hwPimNotificationAddressType, hwPimNotificationSrcAddr, hwPimNotificationGrpAddr, hwPimInterfaceName, hwPimNotificationAssertWinnerAddress, hwPimInstanceName
// Description: A hwPimRpfAssertWinnerFlapping notification signifies that PIM RPF Assert winner is flapping.
trapMap["1.3.6.1.4.1.2011.5.25.149.4.0.36"] = [
    name: "hwPimRpfAssertWinnerFlapping",
    fields: ["hwPimNotificationAddressType", "hwPimNotificationSrcAddr", "hwPimNotificationGrpAddr", "hwPimInterfaceName", "hwPimNotificationAssertWinnerAddress", "hwPimInstanceName"],
    fieldOids: ["hwPimNotificationAddressType": "1.3.6.1.4.1.2011.5.25.149.4.1.62", "hwPimNotificationSrcAddr": "1.3.6.1.4.1.2011.5.25.149.4.1.69", "hwPimNotificationGrpAddr": "1.3.6.1.4.1.2011.5.25.149.4.1.70", "hwPimInterfaceName": "1.3.6.1.4.1.2011.5.25.149.4.1.1.1.29", "hwPimNotificationAssertWinnerAddress": "1.3.6.1.4.1.2011.5.25.149.4.1.83", "hwPimInstanceName": "1.3.6.1.4.1.2011.5.25.149.4.1.60"]
]

// --- hwPimRpfAssertWinnerFlappingClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.149.4.0.37
// Fields: hwPimNotificationAddressType, hwPimNotificationSrcAddr, hwPimNotificationGrpAddr, hwPimInterfaceName, hwPimNotificationAssertWinnerAddress, hwPimInstanceName, hwPimNotificationAssertWinnerFlapClearReasonType
// Description: A hwPimRpfAssertWinnerFlappingClear notification signifies that the flapping of PIM Assert winner is clear.
trapMap["1.3.6.1.4.1.2011.5.25.149.4.0.37"] = [
    name: "hwPimRpfAssertWinnerFlappingClear",
    fields: ["hwPimNotificationAddressType", "hwPimNotificationSrcAddr", "hwPimNotificationGrpAddr", "hwPimInterfaceName", "hwPimNotificationAssertWinnerAddress", "hwPimInstanceName", "hwPimNotificationAssertWinnerFlapClearReasonType"],
    fieldOids: ["hwPimNotificationAddressType": "1.3.6.1.4.1.2011.5.25.149.4.1.62", "hwPimNotificationSrcAddr": "1.3.6.1.4.1.2011.5.25.149.4.1.69", "hwPimNotificationGrpAddr": "1.3.6.1.4.1.2011.5.25.149.4.1.70", "hwPimInterfaceName": "1.3.6.1.4.1.2011.5.25.149.4.1.1.1.29", "hwPimNotificationAssertWinnerAddress": "1.3.6.1.4.1.2011.5.25.149.4.1.83", "hwPimInstanceName": "1.3.6.1.4.1.2011.5.25.149.4.1.60", "hwPimNotificationAssertWinnerFlapClearReasonType": "1.3.6.1.4.1.2011.5.25.149.4.1.84"]
]

// --- hwPimGlobalTypeOifThresholdExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.149.4.0.38
// Fields: hwPimNotificationOifLimitType, hwPimNotificationAddressType, hwPimNotificationTypeOifLimitValue, hwPimNotificationTypeOifUpperThresholdValue, hwPimNotificationOifThresholdReasonType
// Description: A hwPimGlobalTypeOifThresholdExceed notification signifies that outgoing interfaces of PIM entries reached the upper threshold.
trapMap["1.3.6.1.4.1.2011.5.25.149.4.0.38"] = [
    name: "hwPimGlobalTypeOifThresholdExceed",
    fields: ["hwPimNotificationOifLimitType", "hwPimNotificationAddressType", "hwPimNotificationTypeOifLimitValue", "hwPimNotificationTypeOifUpperThresholdValue", "hwPimNotificationOifThresholdReasonType"],
    fieldOids: ["hwPimNotificationOifLimitType": "1.3.6.1.4.1.2011.5.25.149.4.1.85", "hwPimNotificationAddressType": "1.3.6.1.4.1.2011.5.25.149.4.1.62", "hwPimNotificationTypeOifLimitValue": "1.3.6.1.4.1.2011.5.25.149.4.1.86", "hwPimNotificationTypeOifUpperThresholdValue": "1.3.6.1.4.1.2011.5.25.149.4.1.87", "hwPimNotificationOifThresholdReasonType": "1.3.6.1.4.1.2011.5.25.149.4.1.89"]
]

// --- hwPimGlobalTypeOifThresholdExceedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.149.4.0.39
// Fields: hwPimNotificationOifLimitType, hwPimNotificationAddressType, hwPimNotificationTypeOifLimitValue, hwPimNotificationTypeOifLowerThresholdValue, hwPimNotificationOifThresholdClearReasonType
// Description: A hwPimGlobalTypeOifThresholdExceedClear notification signifies that outgoing interfaces of PIM entries fell below the lower threshold.
trapMap["1.3.6.1.4.1.2011.5.25.149.4.0.39"] = [
    name: "hwPimGlobalTypeOifThresholdExceedClear",
    fields: ["hwPimNotificationOifLimitType", "hwPimNotificationAddressType", "hwPimNotificationTypeOifLimitValue", "hwPimNotificationTypeOifLowerThresholdValue", "hwPimNotificationOifThresholdClearReasonType"],
    fieldOids: ["hwPimNotificationOifLimitType": "1.3.6.1.4.1.2011.5.25.149.4.1.85", "hwPimNotificationAddressType": "1.3.6.1.4.1.2011.5.25.149.4.1.62", "hwPimNotificationTypeOifLimitValue": "1.3.6.1.4.1.2011.5.25.149.4.1.86", "hwPimNotificationTypeOifLowerThresholdValue": "1.3.6.1.4.1.2011.5.25.149.4.1.88", "hwPimNotificationOifThresholdClearReasonType": "1.3.6.1.4.1.2011.5.25.149.4.1.90"]
]

// --- hwPimSGInactiveThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.149.4.0.40
// Fields: hwPimNotificationAddressType, hwPimInstanceName, hwPimNotificationAlarmInterval, hwPimNotificationInactiveThreshold, hwPimNotificationInactiveCount
// Description: A hwPimSGInactiveThreshold notification signifies that the number of inactive (S,G) entries reached threshold.
trapMap["1.3.6.1.4.1.2011.5.25.149.4.0.40"] = [
    name: "hwPimSGInactiveThreshold",
    fields: ["hwPimNotificationAddressType", "hwPimInstanceName", "hwPimNotificationAlarmInterval", "hwPimNotificationInactiveThreshold", "hwPimNotificationInactiveCount"],
    fieldOids: ["hwPimNotificationAddressType": "1.3.6.1.4.1.2011.5.25.149.4.1.62", "hwPimInstanceName": "1.3.6.1.4.1.2011.5.25.149.4.1.60", "hwPimNotificationAlarmInterval": "1.3.6.1.4.1.2011.5.25.149.4.1.91", "hwPimNotificationInactiveThreshold": "1.3.6.1.4.1.2011.5.25.149.4.1.92", "hwPimNotificationInactiveCount": "1.3.6.1.4.1.2011.5.25.149.4.1.93"]
]

// --- hwPimSrcPerGrpNumLimit (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.149.4.0.41
// Fields: hwPimNotificationAddressType, hwPimInstanceName, hwPimSrcPerGrpLimitCount
// Description: A hwPimSrcPerGrpNumLimit notification signifies that at least one multicast group's multicast source number reached the upper limit. .
trapMap["1.3.6.1.4.1.2011.5.25.149.4.0.41"] = [
    name: "hwPimSrcPerGrpNumLimit",
    fields: ["hwPimNotificationAddressType", "hwPimInstanceName", "hwPimSrcPerGrpLimitCount"],
    fieldOids: ["hwPimNotificationAddressType": "1.3.6.1.4.1.2011.5.25.149.4.1.62", "hwPimInstanceName": "1.3.6.1.4.1.2011.5.25.149.4.1.60", "hwPimSrcPerGrpLimitCount": "1.3.6.1.4.1.2011.5.25.149.4.1.94"]
]

// --- hwPimSrcPerGrpNumLimitClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.149.4.0.42
// Fields: hwPimNotificationAddressType, hwPimInstanceName, hwPimSrcPerGrpLimitCount
// Description: A hwPimSrcPerGrpNumLimitClear notification signifies that all multicast group's multicast source number fell below the upper limit.
trapMap["1.3.6.1.4.1.2011.5.25.149.4.0.42"] = [
    name: "hwPimSrcPerGrpNumLimitClear",
    fields: ["hwPimNotificationAddressType", "hwPimInstanceName", "hwPimSrcPerGrpLimitCount"],
    fieldOids: ["hwPimNotificationAddressType": "1.3.6.1.4.1.2011.5.25.149.4.1.62", "hwPimInstanceName": "1.3.6.1.4.1.2011.5.25.149.4.1.60", "hwPimSrcPerGrpLimitCount": "1.3.6.1.4.1.2011.5.25.149.4.1.94"]
]

// --- hwBsrCrpReachLimit (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.149.4.0.43
// Fields: hwPimNotificationAddressType, hwPimInstanceName, hwPimNotificationBsrAddr, hwPimNotificationAdminScope, hwPimNotificationCrpCurrentCount, hwPimNotificationCrpLimit
// Description: A hwBsrCrpReachLimit notification signifies that tThe number of C-RP entries received by the BSR reached the upper limit.
trapMap["1.3.6.1.4.1.2011.5.25.149.4.0.43"] = [
    name: "hwBsrCrpReachLimit",
    fields: ["hwPimNotificationAddressType", "hwPimInstanceName", "hwPimNotificationBsrAddr", "hwPimNotificationAdminScope", "hwPimNotificationCrpCurrentCount", "hwPimNotificationCrpLimit"],
    fieldOids: ["hwPimNotificationAddressType": "1.3.6.1.4.1.2011.5.25.149.4.1.62", "hwPimInstanceName": "1.3.6.1.4.1.2011.5.25.149.4.1.60", "hwPimNotificationBsrAddr": "1.3.6.1.4.1.2011.5.25.149.4.1.95", "hwPimNotificationAdminScope": "1.3.6.1.4.1.2011.5.25.149.4.1.98", "hwPimNotificationCrpCurrentCount": "1.3.6.1.4.1.2011.5.25.149.4.1.96", "hwPimNotificationCrpLimit": "1.3.6.1.4.1.2011.5.25.149.4.1.97"]
]

// --- hwBsrCrpReachLimitResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.149.4.0.44
// Fields: hwPimNotificationAddressType, hwPimInstanceName, hwPimNotificationBsrAddr, hwPimNotificationAdminScope, hwPimNotificationCrpCurrentCount, hwPimNotificationCrpLimit
// Description: A hwBsrCrpReachLimitResume notification signifies that the number of C-RP entries received by the BSR fell below the upper limit.
trapMap["1.3.6.1.4.1.2011.5.25.149.4.0.44"] = [
    name: "hwBsrCrpReachLimitResume",
    fields: ["hwPimNotificationAddressType", "hwPimInstanceName", "hwPimNotificationBsrAddr", "hwPimNotificationAdminScope", "hwPimNotificationCrpCurrentCount", "hwPimNotificationCrpLimit"],
    fieldOids: ["hwPimNotificationAddressType": "1.3.6.1.4.1.2011.5.25.149.4.1.62", "hwPimInstanceName": "1.3.6.1.4.1.2011.5.25.149.4.1.60", "hwPimNotificationBsrAddr": "1.3.6.1.4.1.2011.5.25.149.4.1.95", "hwPimNotificationAdminScope": "1.3.6.1.4.1.2011.5.25.149.4.1.98", "hwPimNotificationCrpCurrentCount": "1.3.6.1.4.1.2011.5.25.149.4.1.96", "hwPimNotificationCrpLimit": "1.3.6.1.4.1.2011.5.25.149.4.1.97"]
]

// --- hwBsrBsmReachLimit (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.149.4.0.45
// Fields: hwPimNotificationAddressType, hwPimInstanceName, hwPimNotificationBsrAddr, hwPimNotificationAdminScope
// Description: A hwBsrBsmReachLimit notification signifies that the size of the BSM packet has reached the upper limit.
trapMap["1.3.6.1.4.1.2011.5.25.149.4.0.45"] = [
    name: "hwBsrBsmReachLimit",
    fields: ["hwPimNotificationAddressType", "hwPimInstanceName", "hwPimNotificationBsrAddr", "hwPimNotificationAdminScope"],
    fieldOids: ["hwPimNotificationAddressType": "1.3.6.1.4.1.2011.5.25.149.4.1.62", "hwPimInstanceName": "1.3.6.1.4.1.2011.5.25.149.4.1.60", "hwPimNotificationBsrAddr": "1.3.6.1.4.1.2011.5.25.149.4.1.95", "hwPimNotificationAdminScope": "1.3.6.1.4.1.2011.5.25.149.4.1.98"]
]

// --- hwBsrBsmReachLimitResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.149.4.0.46
// Fields: hwPimNotificationAddressType, hwPimInstanceName, hwPimNotificationBsrAddr, hwPimNotificationAdminScope
// Description: A hwBsrBsmReachLimitResume notification signifies that the size of the BSM packet fell below the upper limit.
trapMap["1.3.6.1.4.1.2011.5.25.149.4.0.46"] = [
    name: "hwBsrBsmReachLimitResume",
    fields: ["hwPimNotificationAddressType", "hwPimInstanceName", "hwPimNotificationBsrAddr", "hwPimNotificationAdminScope"],
    fieldOids: ["hwPimNotificationAddressType": "1.3.6.1.4.1.2011.5.25.149.4.1.62", "hwPimInstanceName": "1.3.6.1.4.1.2011.5.25.149.4.1.60", "hwPimNotificationBsrAddr": "1.3.6.1.4.1.2011.5.25.149.4.1.95", "hwPimNotificationAdminScope": "1.3.6.1.4.1.2011.5.25.149.4.1.98"]
]

// ===== Parsing logic =====

// Set to true to enable diagnostic logging for this MIB parser
DEBUG = false

LOG_PREFIX = "[HUAWEI-PIM-STD-MIB]"
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
