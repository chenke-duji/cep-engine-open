/**
 * Auto-generated from HUAWEI-SRPOLICY-TRAP-MIB.mib
 * Generated: 2026-08-24T18:28:30.970330700
 * Traps/Notifications (18): hwSrPolicyStatusChange, hwSrPolicyBsidConflict, hwSrPolicyBsidConflictClear, hwSrPolicyDown, hwSrPolicyDownClear, hwSrPolicyResourceThresholdExceed, hwSrPolicyResourceThresholdExceedClear, hwSrPolicyResourceTotalCountExceed, hwSrPolicyResourceTotalCountExceedClear, hwSrPolicyCandipathDown, hwSrPolicyCandipathDownClear, hwSprInstancePathSwitch, hwSrPolicyCandiPathDeleteHold, hwSrPolicyCandiPathDeleteHoldClear, hwSrPolicyPathMTUTooLarge, hwSrPolicyPathMTUTooLargeClear, hwSrPolicyListResourceIdConflict, hwSrPolicyListResourceIdConflictClear
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

// --- hwSrPolicyStatusChange (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.359.2.1
// Fields: hwSrPolicyEndpoint, hwSrPolicyColor, hwSrPolicyStatus, hwSrPolicyDownReason
// Description: An hwSrPolicyStatusChange trap signifies that a SRTE Policy Status is detected.
trapMap["1.3.6.1.4.1.2011.5.25.359.2.1"] = [
    name: "hwSrPolicyStatusChange",
    fields: ["hwSrPolicyEndpoint", "hwSrPolicyColor", "hwSrPolicyStatus", "hwSrPolicyDownReason"],
    fieldOids: ["hwSrPolicyEndpoint": "1.3.6.1.4.1.2011.5.25.359.1.1", "hwSrPolicyColor": "1.3.6.1.4.1.2011.5.25.359.1.2", "hwSrPolicyStatus": "1.3.6.1.4.1.2011.5.25.359.1.3", "hwSrPolicyDownReason": "1.3.6.1.4.1.2011.5.25.359.1.4"]
]

// --- hwSrPolicyBsidConflict (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.359.2.2
// Fields: hwSrPolicyEndpoint, hwSrPolicyColor, hwSrPolicyBsid, hwSrPolicyBsidFailReason, hwSrPolicyConflictState
// Description: A hwSrPolicyBsidConflict trap signifies that allocating a binding SID to an SR Policy fails.
trapMap["1.3.6.1.4.1.2011.5.25.359.2.2"] = [
    name: "hwSrPolicyBsidConflict",
    fields: ["hwSrPolicyEndpoint", "hwSrPolicyColor", "hwSrPolicyBsid", "hwSrPolicyBsidFailReason", "hwSrPolicyConflictState"],
    fieldOids: ["hwSrPolicyEndpoint": "1.3.6.1.4.1.2011.5.25.359.1.1", "hwSrPolicyColor": "1.3.6.1.4.1.2011.5.25.359.1.2", "hwSrPolicyBsid": "1.3.6.1.4.1.2011.5.25.359.1.5", "hwSrPolicyBsidFailReason": "1.3.6.1.4.1.2011.5.25.359.1.6", "hwSrPolicyConflictState": "1.3.6.1.4.1.2011.5.25.359.1.7"]
]

// --- hwSrPolicyBsidConflictClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.359.2.3
// Fields: hwSrPolicyEndpoint, hwSrPolicyColor, hwSrPolicyBsid, hwSrPolicyBsidFailReason, hwSrPolicyConflictState
// Description: A hwSrPolicyBsidConflictClear trap signifies that the binding SID allocation failure is resolved.
trapMap["1.3.6.1.4.1.2011.5.25.359.2.3"] = [
    name: "hwSrPolicyBsidConflictClear",
    fields: ["hwSrPolicyEndpoint", "hwSrPolicyColor", "hwSrPolicyBsid", "hwSrPolicyBsidFailReason", "hwSrPolicyConflictState"],
    fieldOids: ["hwSrPolicyEndpoint": "1.3.6.1.4.1.2011.5.25.359.1.1", "hwSrPolicyColor": "1.3.6.1.4.1.2011.5.25.359.1.2", "hwSrPolicyBsid": "1.3.6.1.4.1.2011.5.25.359.1.5", "hwSrPolicyBsidFailReason": "1.3.6.1.4.1.2011.5.25.359.1.6", "hwSrPolicyConflictState": "1.3.6.1.4.1.2011.5.25.359.1.7"]
]

// --- hwSrPolicyDown (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.359.2.4
// Fields: hwSrPolicyEndpoint, hwSrPolicyColor, hwSrPolicyDownReason
// Description: This notification indicates that the status of SR Policy changes to down.
trapMap["1.3.6.1.4.1.2011.5.25.359.2.4"] = [
    name: "hwSrPolicyDown",
    fields: ["hwSrPolicyEndpoint", "hwSrPolicyColor", "hwSrPolicyDownReason"],
    fieldOids: ["hwSrPolicyEndpoint": "1.3.6.1.4.1.2011.5.25.359.1.1", "hwSrPolicyColor": "1.3.6.1.4.1.2011.5.25.359.1.2", "hwSrPolicyDownReason": "1.3.6.1.4.1.2011.5.25.359.1.4"]
]

// --- hwSrPolicyDownClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.359.2.5
// Fields: hwSrPolicyEndpoint, hwSrPolicyColor
// Description: This notification indicates that the down alarm of SR Policy was cleared.
trapMap["1.3.6.1.4.1.2011.5.25.359.2.5"] = [
    name: "hwSrPolicyDownClear",
    fields: ["hwSrPolicyEndpoint", "hwSrPolicyColor"],
    fieldOids: ["hwSrPolicyEndpoint": "1.3.6.1.4.1.2011.5.25.359.1.1", "hwSrPolicyColor": "1.3.6.1.4.1.2011.5.25.359.1.2"]
]

// --- hwSrPolicyResourceThresholdExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.359.2.6
// Fields: hwSrPolicyResourceType, hwResourceCurrentCount, hwResourceThresholdUpperLimit, hwResourceThresholdLowerLimit, hwResourceTotalCount
// Description: This object indicates that SR Policy resource count has exceeded the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.359.2.6"] = [
    name: "hwSrPolicyResourceThresholdExceed",
    fields: ["hwSrPolicyResourceType", "hwResourceCurrentCount", "hwResourceThresholdUpperLimit", "hwResourceThresholdLowerLimit", "hwResourceTotalCount"],
    fieldOids: ["hwSrPolicyResourceType": "1.3.6.1.4.1.2011.5.25.359.1.8", "hwResourceCurrentCount": "1.3.6.1.4.1.2011.5.25.359.1.9", "hwResourceThresholdUpperLimit": "1.3.6.1.4.1.2011.5.25.359.1.10", "hwResourceThresholdLowerLimit": "1.3.6.1.4.1.2011.5.25.359.1.11", "hwResourceTotalCount": "1.3.6.1.4.1.2011.5.25.359.1.12"]
]

// --- hwSrPolicyResourceThresholdExceedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.359.2.7
// Fields: hwSrPolicyResourceType, hwResourceCurrentCount, hwResourceThresholdUpperLimit, hwResourceThresholdLowerLimit, hwResourceTotalCount
// Description: This object indicates that SR Policy resource count has resumed from exceeding the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.359.2.7"] = [
    name: "hwSrPolicyResourceThresholdExceedClear",
    fields: ["hwSrPolicyResourceType", "hwResourceCurrentCount", "hwResourceThresholdUpperLimit", "hwResourceThresholdLowerLimit", "hwResourceTotalCount"],
    fieldOids: ["hwSrPolicyResourceType": "1.3.6.1.4.1.2011.5.25.359.1.8", "hwResourceCurrentCount": "1.3.6.1.4.1.2011.5.25.359.1.9", "hwResourceThresholdUpperLimit": "1.3.6.1.4.1.2011.5.25.359.1.10", "hwResourceThresholdLowerLimit": "1.3.6.1.4.1.2011.5.25.359.1.11", "hwResourceTotalCount": "1.3.6.1.4.1.2011.5.25.359.1.12"]
]

// --- hwSrPolicyResourceTotalCountExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.359.2.8
// Fields: hwSrPolicyResourceType, hwResourceCurrentCount, hwResourceTotalCount
// Description: This object indicates that SR Policy resource count has reached the total count.
trapMap["1.3.6.1.4.1.2011.5.25.359.2.8"] = [
    name: "hwSrPolicyResourceTotalCountExceed",
    fields: ["hwSrPolicyResourceType", "hwResourceCurrentCount", "hwResourceTotalCount"],
    fieldOids: ["hwSrPolicyResourceType": "1.3.6.1.4.1.2011.5.25.359.1.8", "hwResourceCurrentCount": "1.3.6.1.4.1.2011.5.25.359.1.9", "hwResourceTotalCount": "1.3.6.1.4.1.2011.5.25.359.1.12"]
]

// --- hwSrPolicyResourceTotalCountExceedClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.359.2.9
// Fields: hwSrPolicyResourceType, hwResourceCurrentCount, hwResourceTotalCount
// Description: This object indicates that SR Policy resource count has resumed from reaching the total count.
trapMap["1.3.6.1.4.1.2011.5.25.359.2.9"] = [
    name: "hwSrPolicyResourceTotalCountExceedClear",
    fields: ["hwSrPolicyResourceType", "hwResourceCurrentCount", "hwResourceTotalCount"],
    fieldOids: ["hwSrPolicyResourceType": "1.3.6.1.4.1.2011.5.25.359.1.8", "hwResourceCurrentCount": "1.3.6.1.4.1.2011.5.25.359.1.9", "hwResourceTotalCount": "1.3.6.1.4.1.2011.5.25.359.1.12"]
]

// --- hwSrPolicyCandipathDown (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.359.2.10
// Fields: hwSrPolicyEndpoint, hwSrPolicyColor, hwProtocolOrigin, hwNodeAddress, hwASN, hwDiscriminator, hwPreference, hwCandipathDownReason
// Description: This notification indicates that the status of SR Policy's candidate path changed to down.
trapMap["1.3.6.1.4.1.2011.5.25.359.2.10"] = [
    name: "hwSrPolicyCandipathDown",
    fields: ["hwSrPolicyEndpoint", "hwSrPolicyColor", "hwProtocolOrigin", "hwNodeAddress", "hwASN", "hwDiscriminator", "hwPreference", "hwCandipathDownReason"],
    fieldOids: ["hwSrPolicyEndpoint": "1.3.6.1.4.1.2011.5.25.359.1.1", "hwSrPolicyColor": "1.3.6.1.4.1.2011.5.25.359.1.2", "hwProtocolOrigin": "1.3.6.1.4.1.2011.5.25.359.1.13", "hwNodeAddress": "1.3.6.1.4.1.2011.5.25.359.1.14", "hwASN": "1.3.6.1.4.1.2011.5.25.359.1.15", "hwDiscriminator": "1.3.6.1.4.1.2011.5.25.359.1.16", "hwPreference": "1.3.6.1.4.1.2011.5.25.359.1.17", "hwCandipathDownReason": "1.3.6.1.4.1.2011.5.25.359.1.18"]
]

// --- hwSrPolicyCandipathDownClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.359.2.11
// Fields: hwSrPolicyEndpoint, hwSrPolicyColor, hwProtocolOrigin, hwNodeAddress, hwASN, hwDiscriminator, hwPreference
// Description: This notification indicates that the down alarm of SR Policy's candidate path was cleared.
trapMap["1.3.6.1.4.1.2011.5.25.359.2.11"] = [
    name: "hwSrPolicyCandipathDownClear",
    fields: ["hwSrPolicyEndpoint", "hwSrPolicyColor", "hwProtocolOrigin", "hwNodeAddress", "hwASN", "hwDiscriminator", "hwPreference"],
    fieldOids: ["hwSrPolicyEndpoint": "1.3.6.1.4.1.2011.5.25.359.1.1", "hwSrPolicyColor": "1.3.6.1.4.1.2011.5.25.359.1.2", "hwProtocolOrigin": "1.3.6.1.4.1.2011.5.25.359.1.13", "hwNodeAddress": "1.3.6.1.4.1.2011.5.25.359.1.14", "hwASN": "1.3.6.1.4.1.2011.5.25.359.1.15", "hwDiscriminator": "1.3.6.1.4.1.2011.5.25.359.1.16", "hwPreference": "1.3.6.1.4.1.2011.5.25.359.1.17"]
]

// --- hwSprInstancePathSwitch (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.359.2.12
// Fields: hwSprInstanceEndpoint, hwSprPlcyName, hwPreviousSrPolicyColor, hwCurrentSrPolicyColor, hwSprSwitchReason
// Description: The hwSprInstancePathSwitch trap indicates that an SPR instance-specific path switchover was detected.
trapMap["1.3.6.1.4.1.2011.5.25.359.2.12"] = [
    name: "hwSprInstancePathSwitch",
    fields: ["hwSprInstanceEndpoint", "hwSprPlcyName", "hwPreviousSrPolicyColor", "hwCurrentSrPolicyColor", "hwSprSwitchReason"],
    fieldOids: ["hwSprInstanceEndpoint": "1.3.6.1.4.1.2011.5.25.359.1.19", "hwSprPlcyName": "1.3.6.1.4.1.2011.5.25.359.1.20", "hwPreviousSrPolicyColor": "1.3.6.1.4.1.2011.5.25.359.1.21", "hwCurrentSrPolicyColor": "1.3.6.1.4.1.2011.5.25.359.1.22", "hwSprSwitchReason": "1.3.6.1.4.1.2011.5.25.359.1.23"]
]

// --- hwSrPolicyCandiPathDeleteHold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.359.2.13
// Fields: hwSrPolicyEndpoint, hwSrPolicyColor, hwProtocolOrigin, hwNodeAddress, hwASN, hwDiscriminator, hwPreference
// Description: The status of an SR Policy's candidate path changed to delete-hold.
trapMap["1.3.6.1.4.1.2011.5.25.359.2.13"] = [
    name: "hwSrPolicyCandiPathDeleteHold",
    fields: ["hwSrPolicyEndpoint", "hwSrPolicyColor", "hwProtocolOrigin", "hwNodeAddress", "hwASN", "hwDiscriminator", "hwPreference"],
    fieldOids: ["hwSrPolicyEndpoint": "1.3.6.1.4.1.2011.5.25.359.1.1", "hwSrPolicyColor": "1.3.6.1.4.1.2011.5.25.359.1.2", "hwProtocolOrigin": "1.3.6.1.4.1.2011.5.25.359.1.13", "hwNodeAddress": "1.3.6.1.4.1.2011.5.25.359.1.14", "hwASN": "1.3.6.1.4.1.2011.5.25.359.1.15", "hwDiscriminator": "1.3.6.1.4.1.2011.5.25.359.1.16", "hwPreference": "1.3.6.1.4.1.2011.5.25.359.1.17"]
]

// --- hwSrPolicyCandiPathDeleteHoldClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.359.2.14
// Fields: hwSrPolicyEndpoint, hwSrPolicyColor, hwProtocolOrigin, hwNodeAddress, hwASN, hwDiscriminator, hwPreference
// Description: The alarm indicating that the status of an SR Policy's candidate path changed to delete-hold was cleared.
trapMap["1.3.6.1.4.1.2011.5.25.359.2.14"] = [
    name: "hwSrPolicyCandiPathDeleteHoldClear",
    fields: ["hwSrPolicyEndpoint", "hwSrPolicyColor", "hwProtocolOrigin", "hwNodeAddress", "hwASN", "hwDiscriminator", "hwPreference"],
    fieldOids: ["hwSrPolicyEndpoint": "1.3.6.1.4.1.2011.5.25.359.1.1", "hwSrPolicyColor": "1.3.6.1.4.1.2011.5.25.359.1.2", "hwProtocolOrigin": "1.3.6.1.4.1.2011.5.25.359.1.13", "hwNodeAddress": "1.3.6.1.4.1.2011.5.25.359.1.14", "hwASN": "1.3.6.1.4.1.2011.5.25.359.1.15", "hwDiscriminator": "1.3.6.1.4.1.2011.5.25.359.1.16", "hwPreference": "1.3.6.1.4.1.2011.5.25.359.1.17"]
]

// --- hwSrPolicyPathMTUTooLarge (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.359.2.15
// Fields: hwSrPolicyEndpoint, hwSrPolicyColor, hwSrListId, hwSpecifiedPathMTU, hwDetectedMinMTU, hwReplyNodeAddress
// Description: The specified path MTU of the SR Policy is greater than the detected minimum path MTU.
trapMap["1.3.6.1.4.1.2011.5.25.359.2.15"] = [
    name: "hwSrPolicyPathMTUTooLarge",
    fields: ["hwSrPolicyEndpoint", "hwSrPolicyColor", "hwSrListId", "hwSpecifiedPathMTU", "hwDetectedMinMTU", "hwReplyNodeAddress"],
    fieldOids: ["hwSrPolicyEndpoint": "1.3.6.1.4.1.2011.5.25.359.1.1", "hwSrPolicyColor": "1.3.6.1.4.1.2011.5.25.359.1.2", "hwSrListId": "1.3.6.1.4.1.2011.5.25.359.1.24", "hwSpecifiedPathMTU": "1.3.6.1.4.1.2011.5.25.359.1.25", "hwDetectedMinMTU": "1.3.6.1.4.1.2011.5.25.359.1.26", "hwReplyNodeAddress": "1.3.6.1.4.1.2011.5.25.359.1.27"]
]

// --- hwSrPolicyPathMTUTooLargeClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.359.2.16
// Fields: hwSrPolicyEndpoint, hwSrPolicyColor, hwSrListId, hwSpecifiedPathMTU, hwDetectedMinMTU, hwReplyNodeAddress
// Description: The alarm indicating that the specified path MTU of an SR Policy is greater than the detected minimum path MTU was cleared.
trapMap["1.3.6.1.4.1.2011.5.25.359.2.16"] = [
    name: "hwSrPolicyPathMTUTooLargeClear",
    fields: ["hwSrPolicyEndpoint", "hwSrPolicyColor", "hwSrListId", "hwSpecifiedPathMTU", "hwDetectedMinMTU", "hwReplyNodeAddress"],
    fieldOids: ["hwSrPolicyEndpoint": "1.3.6.1.4.1.2011.5.25.359.1.1", "hwSrPolicyColor": "1.3.6.1.4.1.2011.5.25.359.1.2", "hwSrListId": "1.3.6.1.4.1.2011.5.25.359.1.24", "hwSpecifiedPathMTU": "1.3.6.1.4.1.2011.5.25.359.1.25", "hwDetectedMinMTU": "1.3.6.1.4.1.2011.5.25.359.1.26", "hwReplyNodeAddress": "1.3.6.1.4.1.2011.5.25.359.1.27"]
]

// --- hwSrPolicyListResourceIdConflict (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.359.2.17
// Fields: hwSrPolicyEndpoint, hwSrPolicyColor, hwSrListId, hwSrPolicyListResourceId, hwSrPolicyListResourceIdType, hwSrPolicyListResourceIdFailReason, hwSrPolicyConflictState
// Description: The alarm indicating that the resource ID to be used as the identifier of an SR Policy's segment list fails to be allocated is generated.
trapMap["1.3.6.1.4.1.2011.5.25.359.2.17"] = [
    name: "hwSrPolicyListResourceIdConflict",
    fields: ["hwSrPolicyEndpoint", "hwSrPolicyColor", "hwSrListId", "hwSrPolicyListResourceId", "hwSrPolicyListResourceIdType", "hwSrPolicyListResourceIdFailReason", "hwSrPolicyConflictState"],
    fieldOids: ["hwSrPolicyEndpoint": "1.3.6.1.4.1.2011.5.25.359.1.1", "hwSrPolicyColor": "1.3.6.1.4.1.2011.5.25.359.1.2", "hwSrListId": "1.3.6.1.4.1.2011.5.25.359.1.24", "hwSrPolicyListResourceId": "1.3.6.1.4.1.2011.5.25.359.1.28", "hwSrPolicyListResourceIdType": "1.3.6.1.4.1.2011.5.25.359.1.29", "hwSrPolicyListResourceIdFailReason": "1.3.6.1.4.1.2011.5.25.359.1.30", "hwSrPolicyConflictState": "1.3.6.1.4.1.2011.5.25.359.1.7"]
]

// --- hwSrPolicyListResourceIdConflictClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.359.2.18
// Fields: hwSrPolicyEndpoint, hwSrPolicyColor, hwSrListId, hwSrPolicyListResourceId, hwSrPolicyListResourceIdType, hwSrPolicyListResourceIdFailReason, hwSrPolicyConflictState
// Description: The alarm indicating that the resource ID to be used as the identifier of an SR Policy's segment list fails to be allocated is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.359.2.18"] = [
    name: "hwSrPolicyListResourceIdConflictClear",
    fields: ["hwSrPolicyEndpoint", "hwSrPolicyColor", "hwSrListId", "hwSrPolicyListResourceId", "hwSrPolicyListResourceIdType", "hwSrPolicyListResourceIdFailReason", "hwSrPolicyConflictState"],
    fieldOids: ["hwSrPolicyEndpoint": "1.3.6.1.4.1.2011.5.25.359.1.1", "hwSrPolicyColor": "1.3.6.1.4.1.2011.5.25.359.1.2", "hwSrListId": "1.3.6.1.4.1.2011.5.25.359.1.24", "hwSrPolicyListResourceId": "1.3.6.1.4.1.2011.5.25.359.1.28", "hwSrPolicyListResourceIdType": "1.3.6.1.4.1.2011.5.25.359.1.29", "hwSrPolicyListResourceIdFailReason": "1.3.6.1.4.1.2011.5.25.359.1.30", "hwSrPolicyConflictState": "1.3.6.1.4.1.2011.5.25.359.1.7"]
]

// ===== Parsing logic =====

// Set to true to enable diagnostic logging for this MIB parser
DEBUG = false

LOG_PREFIX = "[HUAWEI-SRPOLICY-TRAP-MIB]"
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
