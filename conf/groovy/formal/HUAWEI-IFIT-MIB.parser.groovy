/**
 * Auto-generated from HUAWEI-IFIT-MIB.mib
 * Generated: 2026-08-24T18:28:29.877893400
 * Traps/Notifications (26): hwIfitStaticFlowNumExceedAlarm, hwIfitStaticFlowNumExceedResume, hwIfitDynamicFlowNumExceedAlarm, hwIfitDynamicFlowNumExceedResume, hwIfitExceedInstanceAlarm, hwIfitExceedInstanceAlarmResume, hwIfitDynFlowMidEgressNumExceedAlarm, hwIfitDynFlowMidEgressNumExceedResume, hwIfitDynFlowIngressNumExceedAlarm, hwIfitDynFlowIngressNumExceedResume, hwIfitIngressNumExceedAlarm, hwIfitIngressNumExceedResume, hwIfitMeasureFlowNumExceedAlarm, hwIfitMeasureFlowNumExceedResume, hwIfitmcpSlaDataAlarm, hwIfitmcpSlaDataResume, hwIfitDynFlowMidEgressNumAlmostExceedAlarm, hwIfitDynFlowMidEgressNumAlmostExceedResume, hwIfitDynFlowIngressNumAlmostExceedAlarm, hwIfitDynFlowIngressNumAlmostExceedResume, hwIfitIngressNumAlmostExceedAlarm, hwIfitIngressNumAlmostExceedResume, hwIfitMeasureFlowNumAlmostExceedAlarm, hwIfitMeasureFlowNumAlmostExceedResume, hwIfitMeasureFlowNumThresholdExceedAlarm, hwIfitMeasureFlowNumThresholdExceedResume
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

// --- hwIfitStaticFlowNumExceedAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.364.2.1.1
// Fields: hwIfitFlowExceedBoard, hwIfitMaxFlowInBoard
// Description: The total number of IFIT static flows and reverse flows in the board reaches the upper limit.
trapMap["1.3.6.1.4.1.2011.5.25.364.2.1.1"] = [
    name: "hwIfitStaticFlowNumExceedAlarm",
    fields: ["hwIfitFlowExceedBoard", "hwIfitMaxFlowInBoard"],
    fieldOids: ["hwIfitFlowExceedBoard": "1.3.6.1.4.1.2011.5.25.364.1.1.1.1.1", "hwIfitMaxFlowInBoard": "1.3.6.1.4.1.2011.5.25.364.1.1.1.1.2"]
]

// --- hwIfitStaticFlowNumExceedResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.364.2.1.2
// Fields: hwIfitFlowExceedBoard, hwIfitMaxFlowInBoard
// Description: The total number of IFIT static flows and reverse flows in the board has been lower than the upper limit.
trapMap["1.3.6.1.4.1.2011.5.25.364.2.1.2"] = [
    name: "hwIfitStaticFlowNumExceedResume",
    fields: ["hwIfitFlowExceedBoard", "hwIfitMaxFlowInBoard"],
    fieldOids: ["hwIfitFlowExceedBoard": "1.3.6.1.4.1.2011.5.25.364.1.1.1.1.1", "hwIfitMaxFlowInBoard": "1.3.6.1.4.1.2011.5.25.364.1.1.1.1.2"]
]

// --- hwIfitDynamicFlowNumExceedAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.364.2.1.3
// Fields: hwIfitFlowExceedBoard, hwIfitMaxFlowInBoard
// Description: The total number of IFIT dynamic flows in the board reaches the upper limit.
trapMap["1.3.6.1.4.1.2011.5.25.364.2.1.3"] = [
    name: "hwIfitDynamicFlowNumExceedAlarm",
    fields: ["hwIfitFlowExceedBoard", "hwIfitMaxFlowInBoard"],
    fieldOids: ["hwIfitFlowExceedBoard": "1.3.6.1.4.1.2011.5.25.364.1.1.1.1.1", "hwIfitMaxFlowInBoard": "1.3.6.1.4.1.2011.5.25.364.1.1.1.1.2"]
]

// --- hwIfitDynamicFlowNumExceedResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.364.2.1.4
// Fields: hwIfitFlowExceedBoard, hwIfitMaxFlowInBoard
// Description: The total number of IFIT dynamic flows in the board has been lower than the upper limit.
trapMap["1.3.6.1.4.1.2011.5.25.364.2.1.4"] = [
    name: "hwIfitDynamicFlowNumExceedResume",
    fields: ["hwIfitFlowExceedBoard", "hwIfitMaxFlowInBoard"],
    fieldOids: ["hwIfitFlowExceedBoard": "1.3.6.1.4.1.2011.5.25.364.1.1.1.1.1", "hwIfitMaxFlowInBoard": "1.3.6.1.4.1.2011.5.25.364.1.1.1.1.2"]
]

// --- hwIfitExceedInstanceAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.364.2.1.5
// Fields: hwIfitInstanceType, hwIfitInstanceBoard, hwIfitMaxInstanceInBoard
// Description: The total number of IFIT instances on the interface board reaches the upper limit.
trapMap["1.3.6.1.4.1.2011.5.25.364.2.1.5"] = [
    name: "hwIfitExceedInstanceAlarm",
    fields: ["hwIfitInstanceType", "hwIfitInstanceBoard", "hwIfitMaxInstanceInBoard"],
    fieldOids: ["hwIfitInstanceType": "1.3.6.1.4.1.2011.5.25.364.1.5.1.1.1", "hwIfitInstanceBoard": "1.3.6.1.4.1.2011.5.25.364.1.5.1.1.2", "hwIfitMaxInstanceInBoard": "1.3.6.1.4.1.2011.5.25.364.1.5.1.1.3"]
]

// --- hwIfitExceedInstanceAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.364.2.1.6
// Fields: hwIfitInstanceType, hwIfitInstanceBoard, hwIfitMaxInstanceInBoard
// Description: The total number of IFIT instances on the interface board has been lower the upper limit.
trapMap["1.3.6.1.4.1.2011.5.25.364.2.1.6"] = [
    name: "hwIfitExceedInstanceAlarmResume",
    fields: ["hwIfitInstanceType", "hwIfitInstanceBoard", "hwIfitMaxInstanceInBoard"],
    fieldOids: ["hwIfitInstanceType": "1.3.6.1.4.1.2011.5.25.364.1.5.1.1.1", "hwIfitInstanceBoard": "1.3.6.1.4.1.2011.5.25.364.1.5.1.1.2", "hwIfitMaxInstanceInBoard": "1.3.6.1.4.1.2011.5.25.364.1.5.1.1.3"]
]

// --- hwIfitDynFlowMidEgressNumExceedAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.364.2.2.1
// Fields: hwIfitMaxDynFlowMidEgress
// Description: The total number of IFIT dynamic flows in the machine reaches the upper limit.
trapMap["1.3.6.1.4.1.2011.5.25.364.2.2.1"] = [
    name: "hwIfitDynFlowMidEgressNumExceedAlarm",
    fields: ["hwIfitMaxDynFlowMidEgress"],
    fieldOids: ["hwIfitMaxDynFlowMidEgress": "1.3.6.1.4.1.2011.5.25.364.1.4.1.1.1"]
]

// --- hwIfitDynFlowMidEgressNumExceedResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.364.2.2.2
// Fields: hwIfitMaxDynFlowMidEgress
// Description: The total number of IFIT dynamic flows in the machine has been lower than the upper limit.
trapMap["1.3.6.1.4.1.2011.5.25.364.2.2.2"] = [
    name: "hwIfitDynFlowMidEgressNumExceedResume",
    fields: ["hwIfitMaxDynFlowMidEgress"],
    fieldOids: ["hwIfitMaxDynFlowMidEgress": "1.3.6.1.4.1.2011.5.25.364.1.4.1.1.1"]
]

// --- hwIfitDynFlowIngressNumExceedAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.364.2.3.1
// Fields: hwIfitDynFlowIngressUpperLimit
// Description: The number of IFIT dynamic ingress flow reaches the upper limit.
trapMap["1.3.6.1.4.1.2011.5.25.364.2.3.1"] = [
    name: "hwIfitDynFlowIngressNumExceedAlarm",
    fields: ["hwIfitDynFlowIngressUpperLimit"],
    fieldOids: ["hwIfitDynFlowIngressUpperLimit": "1.3.6.1.4.1.2011.5.25.364.1.6.1.1.1"]
]

// --- hwIfitDynFlowIngressNumExceedResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.364.2.3.2
// Fields: hwIfitDynFlowIngressUpperLimit
// Description: The number of IFIT dynamic ingress flow is below the upper limit.
trapMap["1.3.6.1.4.1.2011.5.25.364.2.3.2"] = [
    name: "hwIfitDynFlowIngressNumExceedResume",
    fields: ["hwIfitDynFlowIngressUpperLimit"],
    fieldOids: ["hwIfitDynFlowIngressUpperLimit": "1.3.6.1.4.1.2011.5.25.364.1.6.1.1.1"]
]

// --- hwIfitIngressNumExceedAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.364.2.4.1
// Fields: hwIfitIngressUpperLimit
// Description: The number of IFIT ingress flow reaches the upper limit.
trapMap["1.3.6.1.4.1.2011.5.25.364.2.4.1"] = [
    name: "hwIfitIngressNumExceedAlarm",
    fields: ["hwIfitIngressUpperLimit"],
    fieldOids: ["hwIfitIngressUpperLimit": "1.3.6.1.4.1.2011.5.25.364.1.7.1.1.1"]
]

// --- hwIfitIngressNumExceedResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.364.2.4.2
// Fields: hwIfitIngressUpperLimit
// Description: The number of IFIT ingress flow is below the upper limit.
trapMap["1.3.6.1.4.1.2011.5.25.364.2.4.2"] = [
    name: "hwIfitIngressNumExceedResume",
    fields: ["hwIfitIngressUpperLimit"],
    fieldOids: ["hwIfitIngressUpperLimit": "1.3.6.1.4.1.2011.5.25.364.1.7.1.1.1"]
]

// --- hwIfitMeasureFlowNumExceedAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.364.2.5.1
// Fields: hwIfitMeasureFlowNodeType, hwIfitMeasureFlowType, hwIfitMeasureFlowUpperLimit
// Description: The number of IFIT measurement flow reaches the upper limit.
trapMap["1.3.6.1.4.1.2011.5.25.364.2.5.1"] = [
    name: "hwIfitMeasureFlowNumExceedAlarm",
    fields: ["hwIfitMeasureFlowNodeType", "hwIfitMeasureFlowType", "hwIfitMeasureFlowUpperLimit"],
    fieldOids: ["hwIfitMeasureFlowNodeType": "1.3.6.1.4.1.2011.5.25.364.1.8.1.1.1", "hwIfitMeasureFlowType": "1.3.6.1.4.1.2011.5.25.364.1.8.1.1.2", "hwIfitMeasureFlowUpperLimit": "1.3.6.1.4.1.2011.5.25.364.1.8.1.1.3"]
]

// --- hwIfitMeasureFlowNumExceedResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.364.2.5.2
// Fields: hwIfitMeasureFlowNodeType, hwIfitMeasureFlowType, hwIfitMeasureFlowUpperLimit
// Description: The number of IFIT measurement flow is below the upper limit.
trapMap["1.3.6.1.4.1.2011.5.25.364.2.5.2"] = [
    name: "hwIfitMeasureFlowNumExceedResume",
    fields: ["hwIfitMeasureFlowNodeType", "hwIfitMeasureFlowType", "hwIfitMeasureFlowUpperLimit"],
    fieldOids: ["hwIfitMeasureFlowNodeType": "1.3.6.1.4.1.2011.5.25.364.1.8.1.1.1", "hwIfitMeasureFlowType": "1.3.6.1.4.1.2011.5.25.364.1.8.1.1.2", "hwIfitMeasureFlowUpperLimit": "1.3.6.1.4.1.2011.5.25.364.1.8.1.1.3"]
]

// --- hwIfitmcpSlaDataAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.364.2.6.1
// Description: IFITMCP has not been generating SLA data for a noticeable period of time.
trapMap["1.3.6.1.4.1.2011.5.25.364.2.6.1"] = [
    name: "hwIfitmcpSlaDataAlarm",
    fields: [],
    fieldOids: []
]

// --- hwIfitmcpSlaDataResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.364.2.6.2
// Description: IFITMCP is generating SLA data now.
trapMap["1.3.6.1.4.1.2011.5.25.364.2.6.2"] = [
    name: "hwIfitmcpSlaDataResume",
    fields: [],
    fieldOids: []
]

// --- hwIfitDynFlowMidEgressNumAlmostExceedAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.364.2.7.1
// Fields: hwIfitDynFlowMidEgressMaxLimit
// Description: The total number of IFIT dynamic flows in the machine almost reaches the upper limit.
trapMap["1.3.6.1.4.1.2011.5.25.364.2.7.1"] = [
    name: "hwIfitDynFlowMidEgressNumAlmostExceedAlarm",
    fields: ["hwIfitDynFlowMidEgressMaxLimit"],
    fieldOids: ["hwIfitDynFlowMidEgressMaxLimit": "1.3.6.1.4.1.2011.5.25.364.1.9.1.1.1"]
]

// --- hwIfitDynFlowMidEgressNumAlmostExceedResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.364.2.7.2
// Fields: hwIfitDynFlowMidEgressMaxLimit
// Description: The total number of IFIT dynamic flows in the machine is below 80% of the upper limit.
trapMap["1.3.6.1.4.1.2011.5.25.364.2.7.2"] = [
    name: "hwIfitDynFlowMidEgressNumAlmostExceedResume",
    fields: ["hwIfitDynFlowMidEgressMaxLimit"],
    fieldOids: ["hwIfitDynFlowMidEgressMaxLimit": "1.3.6.1.4.1.2011.5.25.364.1.9.1.1.1"]
]

// --- hwIfitDynFlowIngressNumAlmostExceedAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.364.2.8.1
// Fields: hwIfitDynFlowIngressMaxLimit
// Description: The number of IFIT dynamic ingress flows almost reaches the upper limit.
trapMap["1.3.6.1.4.1.2011.5.25.364.2.8.1"] = [
    name: "hwIfitDynFlowIngressNumAlmostExceedAlarm",
    fields: ["hwIfitDynFlowIngressMaxLimit"],
    fieldOids: ["hwIfitDynFlowIngressMaxLimit": "1.3.6.1.4.1.2011.5.25.364.1.10.1.1.1"]
]

// --- hwIfitDynFlowIngressNumAlmostExceedResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.364.2.8.2
// Fields: hwIfitDynFlowIngressMaxLimit
// Description: The number of IFIT dynamic ingress flows is below 80% of the upper limit.
trapMap["1.3.6.1.4.1.2011.5.25.364.2.8.2"] = [
    name: "hwIfitDynFlowIngressNumAlmostExceedResume",
    fields: ["hwIfitDynFlowIngressMaxLimit"],
    fieldOids: ["hwIfitDynFlowIngressMaxLimit": "1.3.6.1.4.1.2011.5.25.364.1.10.1.1.1"]
]

// --- hwIfitIngressNumAlmostExceedAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.364.2.9.1
// Fields: hwIfitIngressMaxLimit
// Description: The number of IFIT ingress flows almost reaches the upper limit.
trapMap["1.3.6.1.4.1.2011.5.25.364.2.9.1"] = [
    name: "hwIfitIngressNumAlmostExceedAlarm",
    fields: ["hwIfitIngressMaxLimit"],
    fieldOids: ["hwIfitIngressMaxLimit": "1.3.6.1.4.1.2011.5.25.364.1.11.1.1.1"]
]

// --- hwIfitIngressNumAlmostExceedResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.364.2.9.2
// Fields: hwIfitIngressMaxLimit
// Description: The number of IFIT ingress flows is below 80% of the upper limit.
trapMap["1.3.6.1.4.1.2011.5.25.364.2.9.2"] = [
    name: "hwIfitIngressNumAlmostExceedResume",
    fields: ["hwIfitIngressMaxLimit"],
    fieldOids: ["hwIfitIngressMaxLimit": "1.3.6.1.4.1.2011.5.25.364.1.11.1.1.1"]
]

// --- hwIfitMeasureFlowNumAlmostExceedAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.364.2.10.1
// Fields: hwMeasureFlowNodeType, hwMeasureFlowType, hwMeasureFlowMaxLimit
// Description: The number of IFIT measurement flows almost reaches the upper limit.
trapMap["1.3.6.1.4.1.2011.5.25.364.2.10.1"] = [
    name: "hwIfitMeasureFlowNumAlmostExceedAlarm",
    fields: ["hwMeasureFlowNodeType", "hwMeasureFlowType", "hwMeasureFlowMaxLimit"],
    fieldOids: ["hwMeasureFlowNodeType": "1.3.6.1.4.1.2011.5.25.364.1.12.1.1.1", "hwMeasureFlowType": "1.3.6.1.4.1.2011.5.25.364.1.12.1.1.2", "hwMeasureFlowMaxLimit": "1.3.6.1.4.1.2011.5.25.364.1.12.1.1.3"]
]

// --- hwIfitMeasureFlowNumAlmostExceedResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.364.2.10.2
// Fields: hwMeasureFlowNodeType, hwMeasureFlowType, hwMeasureFlowMaxLimit
// Description: The number of IFIT measurement flows is below 80% of the upper limit.
trapMap["1.3.6.1.4.1.2011.5.25.364.2.10.2"] = [
    name: "hwIfitMeasureFlowNumAlmostExceedResume",
    fields: ["hwMeasureFlowNodeType", "hwMeasureFlowType", "hwMeasureFlowMaxLimit"],
    fieldOids: ["hwMeasureFlowNodeType": "1.3.6.1.4.1.2011.5.25.364.1.12.1.1.1", "hwMeasureFlowType": "1.3.6.1.4.1.2011.5.25.364.1.12.1.1.2", "hwMeasureFlowMaxLimit": "1.3.6.1.4.1.2011.5.25.364.1.12.1.1.3"]
]

// --- hwIfitMeasureFlowNumThresholdExceedAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.364.2.11.1
// Fields: hwThrdExcMeasureFlowNodeType, hwThrdExcMeasureFlowType, hwThrdExcMeasureFlowUpperThrd, hwThrdExcMeasureFlowLowerThrd, hwThrdExcMeasureFlowSpecVal
// Description: The number of IFIT measurement flows reaches the upper threshold.
trapMap["1.3.6.1.4.1.2011.5.25.364.2.11.1"] = [
    name: "hwIfitMeasureFlowNumThresholdExceedAlarm",
    fields: ["hwThrdExcMeasureFlowNodeType", "hwThrdExcMeasureFlowType", "hwThrdExcMeasureFlowUpperThrd", "hwThrdExcMeasureFlowLowerThrd", "hwThrdExcMeasureFlowSpecVal"],
    fieldOids: ["hwThrdExcMeasureFlowNodeType": "1.3.6.1.4.1.2011.5.25.364.1.13.1.1.1", "hwThrdExcMeasureFlowType": "1.3.6.1.4.1.2011.5.25.364.1.13.1.1.2", "hwThrdExcMeasureFlowUpperThrd": "1.3.6.1.4.1.2011.5.25.364.1.13.1.1.3", "hwThrdExcMeasureFlowLowerThrd": "1.3.6.1.4.1.2011.5.25.364.1.13.1.1.4", "hwThrdExcMeasureFlowSpecVal": "1.3.6.1.4.1.2011.5.25.364.1.13.1.1.5"]
]

// --- hwIfitMeasureFlowNumThresholdExceedResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.364.2.11.2
// Fields: hwThrdExcMeasureFlowNodeType, hwThrdExcMeasureFlowType, hwThrdExcMeasureFlowUpperThrd, hwThrdExcMeasureFlowLowerThrd, hwThrdExcMeasureFlowSpecVal
// Description: The number of IFIT measurement flows is below the lower threshold.
trapMap["1.3.6.1.4.1.2011.5.25.364.2.11.2"] = [
    name: "hwIfitMeasureFlowNumThresholdExceedResume",
    fields: ["hwThrdExcMeasureFlowNodeType", "hwThrdExcMeasureFlowType", "hwThrdExcMeasureFlowUpperThrd", "hwThrdExcMeasureFlowLowerThrd", "hwThrdExcMeasureFlowSpecVal"],
    fieldOids: ["hwThrdExcMeasureFlowNodeType": "1.3.6.1.4.1.2011.5.25.364.1.13.1.1.1", "hwThrdExcMeasureFlowType": "1.3.6.1.4.1.2011.5.25.364.1.13.1.1.2", "hwThrdExcMeasureFlowUpperThrd": "1.3.6.1.4.1.2011.5.25.364.1.13.1.1.3", "hwThrdExcMeasureFlowLowerThrd": "1.3.6.1.4.1.2011.5.25.364.1.13.1.1.4", "hwThrdExcMeasureFlowSpecVal": "1.3.6.1.4.1.2011.5.25.364.1.13.1.1.5"]
]

// ===== Parsing logic =====

// Set to true to enable diagnostic logging for this MIB parser
DEBUG = false

LOG_PREFIX = "[HUAWEI-IFIT-MIB]"
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
