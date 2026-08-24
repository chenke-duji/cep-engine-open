/**
 * Auto-generated from HUAWEI-MSTP-MIB.mib
 * Generated: 2026-08-22T00:56:03.973125400
 * Traps/Notifications (38): hwMstpiPortStateForwarding, hwMstpiPortStateDiscarding, hwMstpiBridgeLostRootPrimary, hwMstpiPortRootGuarded, hwMstpiPortBpduGuarded, hwMstpiPortLoopGuarded, hwMstpiEdgePortChanged, hwMstpProPortStateForwarding, hwMstpProPortStateDiscarding, hwMstpProBridgeLostRootPrimary, hwMstpProPortRootGuarded, hwMstpProPortBpduGuarded, hwMstpProPortLoopGuarded, hwMstpProEdgePortChanged, hwMstpiTcGuarded, hwMstpProTcGuarded, hwMstpProRootChanged, hwMstpProNewPortStateForwarding, hwMstpProNewPortStateDiscarding, hwMstpProNewBridgeLostRootPrimary, hwMstpProNewPortRootGuarded, hwMstpProNewPortBpduGuarded, hwMstpProNewPortLoopGuarded, hwMstpProNewEdgePortChanged, hwMstpProLoopbackDetected, hwMstpPortCountExceedThreshold, hwMstpPortCountExceedThresholdResume, hwMstpProRootLost, hwMstpProRootResume, hwMstpProRootShake, hwMstpProRootShakeResume, hwMstpProTcFlap, hwMstpProTcFlapResume, hwMstpProRcvTcFlap, hwMstpProLoopDetectedRising, hwMstpProLoopDetectedResume, hwMstpVstpMacDiffRising, hwMstpVstpMacDiffResume
 *
 * Mapping rules:
 *   node       = trap source IP (rawEvent.sourceIp)
 *   alertGroup/summary/severity/type = per-trap rule overrides
 */

import com.raysdata.cep.model.AlarmEvent
import com.raysdata.cep.model.EventType
import com.raysdata.cep.model.Severity

// ===== Trap OID -> definition mapping =====
// Key: fully resolved numeric OID, Value: [name, fields, fieldOids]
def trapMap = [:]

// ===== Name -> definition mapping (fallback for unresolved OIDs) =====
def trapNameMap = [:]

// --- hwMstpiPortStateForwarding (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.4.2.1
// Fields: hwMstpInstanceID, hwMstpiPortIndex, ifName, hwMstpPwName
// Description: When an interface enters the forwarding state, an alarm is triggered. Reason: Changes occur on the link state and a new link joins the topology. Advice: Pay attention to the reason of change on the ne...
trapMap["1.3.6.1.4.1.2011.5.25.42.4.2.1"] = [
    name: "hwMstpiPortStateForwarding",
    fields: ["hwMstpInstanceID", "hwMstpiPortIndex", "ifName", "hwMstpPwName"],
    fieldOids: ["hwMstpInstanceID": "1.3.6.1.4.1.2011.5.25.42.4.1.19.1.1", "hwMstpiPortIndex": "1.3.6.1.4.1.2011.5.25.42.4.1.20.1.1", "ifName": "1.3.6.1.2.1.31.1.1.1.1", "hwMstpPwName": "1.3.6.1.4.1.2011.5.25.42.4.1.33"]
]

// --- hwMstpiPortStateDiscarding (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.4.2.2
// Fields: hwMstpInstanceID, hwMstpiPortIndex, ifName, hwMstpPwName
// Description: When a port enters the congestion state, it generates alarms. Reason: Changes occur on the link state and the link quits the topology. Advice: Pay attention to the reason of change on the network topo...
trapMap["1.3.6.1.4.1.2011.5.25.42.4.2.2"] = [
    name: "hwMstpiPortStateDiscarding",
    fields: ["hwMstpInstanceID", "hwMstpiPortIndex", "ifName", "hwMstpPwName"],
    fieldOids: ["hwMstpInstanceID": "1.3.6.1.4.1.2011.5.25.42.4.1.19.1.1", "hwMstpiPortIndex": "1.3.6.1.4.1.2011.5.25.42.4.1.20.1.1", "ifName": "1.3.6.1.2.1.31.1.1.1.1", "hwMstpPwName": "1.3.6.1.4.1.2011.5.25.42.4.1.33"]
]

// --- hwMstpiBridgeLostRootPrimary (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.4.2.3
// Fields: hwMstpInstanceID
// Description: When a switch loses the role of the root bridge, an alarm message is generated. Reason: The status of root bridge cannot be kept because a switch with a higher priority on the network becomes the root...
trapMap["1.3.6.1.4.1.2011.5.25.42.4.2.3"] = [
    name: "hwMstpiBridgeLostRootPrimary",
    fields: ["hwMstpInstanceID"],
    fieldOids: ["hwMstpInstanceID": "1.3.6.1.4.1.2011.5.25.42.4.1.19.1.1"]
]

// --- hwMstpiPortRootGuarded (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.4.2.4
// Fields: hwMstpInstanceID, hwMstpiPortIndex, ifName, hwMstpPwName
// Description: When the port of root bridge protection receives packets with higher priority, it triggers alarm. Reason: A switch with higher priority and out of the root bridge protection circle attempts to preempt...
trapMap["1.3.6.1.4.1.2011.5.25.42.4.2.4"] = [
    name: "hwMstpiPortRootGuarded",
    fields: ["hwMstpInstanceID", "hwMstpiPortIndex", "ifName", "hwMstpPwName"],
    fieldOids: ["hwMstpInstanceID": "1.3.6.1.4.1.2011.5.25.42.4.1.19.1.1", "hwMstpiPortIndex": "1.3.6.1.4.1.2011.5.25.42.4.1.20.1.1", "ifName": "1.3.6.1.2.1.31.1.1.1.1", "hwMstpPwName": "1.3.6.1.4.1.2011.5.25.42.4.1.33"]
]

// --- hwMstpiPortBpduGuarded (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.4.2.5
// Fields: hwMstpiPortIndex, ifName
// Description: When the BPDU guard port receives the BPDU packets, it generates alarms. Reason: An edge port enabled with the BPDU guard function receives BPDUs. Advice: The port receives BPDU packets that are likel...
trapMap["1.3.6.1.4.1.2011.5.25.42.4.2.5"] = [
    name: "hwMstpiPortBpduGuarded",
    fields: ["hwMstpiPortIndex", "ifName"],
    fieldOids: ["hwMstpiPortIndex": "1.3.6.1.4.1.2011.5.25.42.4.1.20.1.1", "ifName": "1.3.6.1.2.1.31.1.1.1.1"]
]

// --- hwMstpiPortLoopGuarded (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.4.2.6
// Fields: hwMstpInstanceID, hwMstpiPortIndex, ifName, hwMstpPwName
// Description: The SNMP trap that is generated when an Alternate-Port or Root-Port is aged out.
trapMap["1.3.6.1.4.1.2011.5.25.42.4.2.6"] = [
    name: "hwMstpiPortLoopGuarded",
    fields: ["hwMstpInstanceID", "hwMstpiPortIndex", "ifName", "hwMstpPwName"],
    fieldOids: ["hwMstpInstanceID": "1.3.6.1.4.1.2011.5.25.42.4.1.19.1.1", "hwMstpiPortIndex": "1.3.6.1.4.1.2011.5.25.42.4.1.20.1.1", "ifName": "1.3.6.1.2.1.31.1.1.1.1", "hwMstpPwName": "1.3.6.1.4.1.2011.5.25.42.4.1.33"]
]

// --- hwMstpiEdgePortChanged (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.4.2.7
// Fields: hwMstpiStpPortEdgeport, ifName, hwMstpPwName
// Description: When the edged-port receives a BPDU packet, the edged-port attribute will be disabled. Then the SNMP trap is generated.
trapMap["1.3.6.1.4.1.2011.5.25.42.4.2.7"] = [
    name: "hwMstpiEdgePortChanged",
    fields: ["hwMstpiStpPortEdgeport", "ifName", "hwMstpPwName"],
    fieldOids: ["hwMstpiStpPortEdgeport": "1.3.6.1.4.1.2011.5.25.42.4.1.20.1.9", "ifName": "1.3.6.1.2.1.31.1.1.1.1", "hwMstpPwName": "1.3.6.1.4.1.2011.5.25.42.4.1.33"]
]

// --- hwMstpProPortStateForwarding (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.4.2.8
// Fields: hwMstpProPortState
// Description: The SNMP trap that is generated when a port turns into forwarding state from other state in the MSTP process.
trapMap["1.3.6.1.4.1.2011.5.25.42.4.2.8"] = [
    name: "hwMstpProPortStateForwarding",
    fields: ["hwMstpProPortState"],
    fieldOids: ["hwMstpProPortState": "1.3.6.1.4.1.2011.5.25.42.4.1.25.1.2"]
]

// --- hwMstpProPortStateDiscarding (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.4.2.9
// Fields: hwMstpProPortState
// Description: The SNMP trap that is generated when a port turns into discarding state from forwarding state in the MSTP process.
trapMap["1.3.6.1.4.1.2011.5.25.42.4.2.9"] = [
    name: "hwMstpProPortStateDiscarding",
    fields: ["hwMstpProPortState"],
    fieldOids: ["hwMstpProPortState": "1.3.6.1.4.1.2011.5.25.42.4.1.25.1.2"]
]

// --- hwMstpProBridgeLostRootPrimary (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.4.2.10
// Fields: hwMstpProPortState
// Description: The SNMP trap that is generated when the bridge is no longer the root bridge of the MSTP process Spanning Tree. Another switch with higher priority has already been the root bridge.
trapMap["1.3.6.1.4.1.2011.5.25.42.4.2.10"] = [
    name: "hwMstpProBridgeLostRootPrimary",
    fields: ["hwMstpProPortState"],
    fieldOids: ["hwMstpProPortState": "1.3.6.1.4.1.2011.5.25.42.4.1.25.1.2"]
]

// --- hwMstpProPortRootGuarded (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.4.2.11
// Fields: hwMstpProPortState
// Description: The SNMP trap that is generated when a root-guard port receives a superior message in the MSTP process.
trapMap["1.3.6.1.4.1.2011.5.25.42.4.2.11"] = [
    name: "hwMstpProPortRootGuarded",
    fields: ["hwMstpProPortState"],
    fieldOids: ["hwMstpProPortState": "1.3.6.1.4.1.2011.5.25.42.4.1.25.1.2"]
]

// --- hwMstpProPortBpduGuarded (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.4.2.12
// Fields: hwMstpProPortState
// Description: The SNMP trap that is generated when an edged port of the BPDU-guard MSTP process receives BPDU packets.
trapMap["1.3.6.1.4.1.2011.5.25.42.4.2.12"] = [
    name: "hwMstpProPortBpduGuarded",
    fields: ["hwMstpProPortState"],
    fieldOids: ["hwMstpProPortState": "1.3.6.1.4.1.2011.5.25.42.4.1.25.1.2"]
]

// --- hwMstpProPortLoopGuarded (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.4.2.13
// Fields: hwMstpProPortState
// Description: The SNMP trap that is generated when an Alternate-Port or Root-Port is aged out in the MSTP process.
trapMap["1.3.6.1.4.1.2011.5.25.42.4.2.13"] = [
    name: "hwMstpProPortLoopGuarded",
    fields: ["hwMstpProPortState"],
    fieldOids: ["hwMstpProPortState": "1.3.6.1.4.1.2011.5.25.42.4.1.25.1.2"]
]

// --- hwMstpProEdgePortChanged (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.4.2.14
// Fields: hwMstpProPortStpEdgeport
// Description: When the edged-port receives a BPDU packet, the edged-port attribute will be disabled. Then the SNMP trap is generated.
trapMap["1.3.6.1.4.1.2011.5.25.42.4.2.14"] = [
    name: "hwMstpProEdgePortChanged",
    fields: ["hwMstpProPortStpEdgeport"],
    fieldOids: ["hwMstpProPortStpEdgeport": "1.3.6.1.4.1.2011.5.25.42.4.1.25.1.9"]
]

// --- hwMstpiTcGuarded (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.4.2.15
// Fields: hwMstpiBridgePriority
// Description: The SNMP trap that is generated when an MSTP instance receive TC BPDUs' number exceeds the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.42.4.2.15"] = [
    name: "hwMstpiTcGuarded",
    fields: ["hwMstpiBridgePriority"],
    fieldOids: ["hwMstpiBridgePriority": "1.3.6.1.4.1.2011.5.25.42.4.1.19.1.3"]
]

// --- hwMstpProTcGuarded (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.4.2.16
// Fields: hwMstpProTcGuard, hwMstpProInstanceBridgePriority
// Description: The SNMP trap that is generated when an MSTP process receive TC BPDUs' number exceeds the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.42.4.2.16"] = [
    name: "hwMstpProTcGuarded",
    fields: ["hwMstpProTcGuard", "hwMstpProInstanceBridgePriority"],
    fieldOids: ["hwMstpProTcGuard": "1.3.6.1.4.1.2011.5.25.42.4.1.23.1.21", "hwMstpProInstanceBridgePriority": "1.3.6.1.4.1.2011.5.25.42.4.1.28.1.2"]
]

// --- hwMstpProRootChanged (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.4.2.17
// Fields: hwMstpProInstanceRootPort
// Description: When the root bridge status of a MSTI in a specified MSTP process changes, an alarm message is generated. The changes include: 1 indicates the the local bridge becomes a root bridge. 2 indicates the l...
trapMap["1.3.6.1.4.1.2011.5.25.42.4.2.17"] = [
    name: "hwMstpProRootChanged",
    fields: ["hwMstpProInstanceRootPort"],
    fieldOids: ["hwMstpProInstanceRootPort": "1.3.6.1.4.1.2011.5.25.42.4.1.28.1.5"]
]

// --- hwMstpProNewPortStateForwarding (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.4.2.18
// Fields: hwMstpProNewPortState, ifName, hwMstpPwName
// Description: When a port belonging to the MSTP process enters the forwarding state, an alarm message is generated. Reason: The link status of an MSTP process changes and a new link is added to the network. Advice:...
trapMap["1.3.6.1.4.1.2011.5.25.42.4.2.18"] = [
    name: "hwMstpProNewPortStateForwarding",
    fields: ["hwMstpProNewPortState", "ifName", "hwMstpPwName"],
    fieldOids: ["hwMstpProNewPortState": "1.3.6.1.4.1.2011.5.25.42.4.1.29.1.1", "ifName": "1.3.6.1.2.1.31.1.1.1.1", "hwMstpPwName": "1.3.6.1.4.1.2011.5.25.42.4.1.33"]
]

// --- hwMstpProNewPortStateDiscarding (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.4.2.19
// Fields: hwMstpProNewPortState, ifName, hwMstpPwName
// Description: When a port belonging to the MSTP process enters the block state, an alarm message is generated. Reason: Changes occur on the link state and a link is removed from the network. Advice: Pay attention t...
trapMap["1.3.6.1.4.1.2011.5.25.42.4.2.19"] = [
    name: "hwMstpProNewPortStateDiscarding",
    fields: ["hwMstpProNewPortState", "ifName", "hwMstpPwName"],
    fieldOids: ["hwMstpProNewPortState": "1.3.6.1.4.1.2011.5.25.42.4.1.29.1.1", "ifName": "1.3.6.1.2.1.31.1.1.1.1", "hwMstpPwName": "1.3.6.1.4.1.2011.5.25.42.4.1.33"]
]

// --- hwMstpProNewBridgeLostRootPrimary (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.4.2.20
// Fields: hwMstpProInstanceRootType
// Description: When the MSTP process stop functioning as a root bridge, an alarm message is generated. Cause: The MSTP process can no longer play the role of the root bridge because another MSTP process with a highe...
trapMap["1.3.6.1.4.1.2011.5.25.42.4.2.20"] = [
    name: "hwMstpProNewBridgeLostRootPrimary",
    fields: ["hwMstpProInstanceRootType"],
    fieldOids: ["hwMstpProInstanceRootType": "1.3.6.1.4.1.2011.5.25.42.4.1.28.1.6"]
]

// --- hwMstpProNewPortRootGuarded (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.4.2.21
// Fields: hwMstpProNewPortState, ifName, hwMstpPwName
// Description: When a port enabled with the root guard function on the root bridge receives a packet of a higher priority, an alarm message is generated. Cause: An MSTP process attempts to compete for the role of th...
trapMap["1.3.6.1.4.1.2011.5.25.42.4.2.21"] = [
    name: "hwMstpProNewPortRootGuarded",
    fields: ["hwMstpProNewPortState", "ifName", "hwMstpPwName"],
    fieldOids: ["hwMstpProNewPortState": "1.3.6.1.4.1.2011.5.25.42.4.1.29.1.1", "ifName": "1.3.6.1.2.1.31.1.1.1.1", "hwMstpPwName": "1.3.6.1.4.1.2011.5.25.42.4.1.33"]
]

// --- hwMstpProNewPortBpduGuarded (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.4.2.22
// Fields: hwMstpProNewPortState, ifName
// Description: When a port enabled with the BPDU guard function of the MSTP process receives BPDUs, an alarm message is generated. Cause: An edge port enabled with the BPDU guard function receives BPDUs. Solution: M...
trapMap["1.3.6.1.4.1.2011.5.25.42.4.2.22"] = [
    name: "hwMstpProNewPortBpduGuarded",
    fields: ["hwMstpProNewPortState", "ifName"],
    fieldOids: ["hwMstpProNewPortState": "1.3.6.1.4.1.2011.5.25.42.4.1.29.1.1", "ifName": "1.3.6.1.2.1.31.1.1.1.1"]
]

// --- hwMstpProNewPortLoopGuarded (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.4.2.23
// Fields: hwMstpProNewPortState, ifName, hwMstpPwName
// Description: Specify that the root port has not received any BPDU packets for a long time when loop protection is enabled in MSTP process.
trapMap["1.3.6.1.4.1.2011.5.25.42.4.2.23"] = [
    name: "hwMstpProNewPortLoopGuarded",
    fields: ["hwMstpProNewPortState", "ifName", "hwMstpPwName"],
    fieldOids: ["hwMstpProNewPortState": "1.3.6.1.4.1.2011.5.25.42.4.1.29.1.1", "ifName": "1.3.6.1.2.1.31.1.1.1.1", "hwMstpPwName": "1.3.6.1.4.1.2011.5.25.42.4.1.33"]
]

// --- hwMstpProNewEdgePortChanged (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.4.2.24
// Fields: hwMstpProNewPortState, ifName, hwMstpPwName
// Description: Specify that the edge port is invalid because of receiving a BPDU packet.
trapMap["1.3.6.1.4.1.2011.5.25.42.4.2.24"] = [
    name: "hwMstpProNewEdgePortChanged",
    fields: ["hwMstpProNewPortState", "ifName", "hwMstpPwName"],
    fieldOids: ["hwMstpProNewPortState": "1.3.6.1.4.1.2011.5.25.42.4.1.29.1.1", "ifName": "1.3.6.1.2.1.31.1.1.1.1", "hwMstpPwName": "1.3.6.1.4.1.2011.5.25.42.4.1.33"]
]

// --- hwMstpProLoopbackDetected (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.4.2.25
// Fields: hwMstpProNewPortState, ifName, hwMstpPwName
// Description: When port detected loopback, block the port and arise trap.
trapMap["1.3.6.1.4.1.2011.5.25.42.4.2.25"] = [
    name: "hwMstpProLoopbackDetected",
    fields: ["hwMstpProNewPortState", "ifName", "hwMstpPwName"],
    fieldOids: ["hwMstpProNewPortState": "1.3.6.1.4.1.2011.5.25.42.4.1.29.1.1", "ifName": "1.3.6.1.2.1.31.1.1.1.1", "hwMstpPwName": "1.3.6.1.4.1.2011.5.25.42.4.1.33"]
]

// --- hwMstpPortCountExceedThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.4.2.26
// Fields: hwMstpPortCountUpperThreshold
// Description: This notification indicates that the number of Up STP-capable interfaces exceeded the upper threshold.
trapMap["1.3.6.1.4.1.2011.5.25.42.4.2.26"] = [
    name: "hwMstpPortCountExceedThreshold",
    fields: ["hwMstpPortCountUpperThreshold"],
    fieldOids: ["hwMstpPortCountUpperThreshold": "1.3.6.1.4.1.2011.5.25.42.4.1.35"]
]

// --- hwMstpPortCountExceedThresholdResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.4.2.27
// Fields: hwMstpPortCountLowerThreshold
// Description: This notification indicates that the number of Up STP-capable interfaces fell below the lower threshold.
trapMap["1.3.6.1.4.1.2011.5.25.42.4.2.27"] = [
    name: "hwMstpPortCountExceedThresholdResume",
    fields: ["hwMstpPortCountLowerThreshold"],
    fieldOids: ["hwMstpPortCountLowerThreshold": "1.3.6.1.4.1.2011.5.25.42.4.1.36"]
]

// --- hwMstpProRootLost (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.4.2.28
// Fields: hwMstpProInstanceRootType
// Description: This notification indicates that the bridge is no longer the root bridge.
trapMap["1.3.6.1.4.1.2011.5.25.42.4.2.28"] = [
    name: "hwMstpProRootLost",
    fields: ["hwMstpProInstanceRootType"],
    fieldOids: ["hwMstpProInstanceRootType": "1.3.6.1.4.1.2011.5.25.42.4.1.28.1.6"]
]

// --- hwMstpProRootResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.4.2.29
// Fields: hwMstpProInstanceRootType
// Description: This notification indicates that the bridge is the root bridge.
trapMap["1.3.6.1.4.1.2011.5.25.42.4.2.29"] = [
    name: "hwMstpProRootResume",
    fields: ["hwMstpProInstanceRootType"],
    fieldOids: ["hwMstpProInstanceRootType": "1.3.6.1.4.1.2011.5.25.42.4.1.28.1.6"]
]

// --- hwMstpProRootShake (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.4.2.30
// Fields: hwMstpProID, hwMstpInstanceID
// Description: This notification indicates that the root bridge role flapped.
trapMap["1.3.6.1.4.1.2011.5.25.42.4.2.30"] = [
    name: "hwMstpProRootShake",
    fields: ["hwMstpProID", "hwMstpInstanceID"],
    fieldOids: ["hwMstpProID": "1.3.6.1.4.1.2011.5.25.42.4.1.23.1.1", "hwMstpInstanceID": "1.3.6.1.4.1.2011.5.25.42.4.1.19.1.1"]
]

// --- hwMstpProRootShakeResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.4.2.31
// Fields: hwMstpProID, hwMstpInstanceID
// Description: This notification indicates that the flapping of the root bridge role resumed.
trapMap["1.3.6.1.4.1.2011.5.25.42.4.2.31"] = [
    name: "hwMstpProRootShakeResume",
    fields: ["hwMstpProID", "hwMstpInstanceID"],
    fieldOids: ["hwMstpProID": "1.3.6.1.4.1.2011.5.25.42.4.1.23.1.1", "hwMstpInstanceID": "1.3.6.1.4.1.2011.5.25.42.4.1.19.1.1"]
]

// --- hwMstpProTcFlap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.4.2.32
// Fields: hwMstpProID, hwMstpInstanceID
// Description: This notification indicates that the local device proactively detected its STP topology was flapping.
trapMap["1.3.6.1.4.1.2011.5.25.42.4.2.32"] = [
    name: "hwMstpProTcFlap",
    fields: ["hwMstpProID", "hwMstpInstanceID"],
    fieldOids: ["hwMstpProID": "1.3.6.1.4.1.2011.5.25.42.4.1.23.1.1", "hwMstpInstanceID": "1.3.6.1.4.1.2011.5.25.42.4.1.19.1.1"]
]

// --- hwMstpProTcFlapResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.4.2.33
// Fields: hwMstpProID, hwMstpInstanceID
// Description: This notification indicates that the STP topology of the local device stopped flapping.
trapMap["1.3.6.1.4.1.2011.5.25.42.4.2.33"] = [
    name: "hwMstpProTcFlapResume",
    fields: ["hwMstpProID", "hwMstpInstanceID"],
    fieldOids: ["hwMstpProID": "1.3.6.1.4.1.2011.5.25.42.4.1.23.1.1", "hwMstpInstanceID": "1.3.6.1.4.1.2011.5.25.42.4.1.19.1.1"]
]

// --- hwMstpProRcvTcFlap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.4.2.34
// Fields: hwMstpProID, hwMstpInstanceID, ifName, hwMstpPwName, hwMstpSrcMacAddress
// Description: This notification indicates that the local device received many TC BPDUs from neighbors
trapMap["1.3.6.1.4.1.2011.5.25.42.4.2.34"] = [
    name: "hwMstpProRcvTcFlap",
    fields: ["hwMstpProID", "hwMstpInstanceID", "ifName", "hwMstpPwName", "hwMstpSrcMacAddress"],
    fieldOids: ["hwMstpProID": "1.3.6.1.4.1.2011.5.25.42.4.1.23.1.1", "hwMstpInstanceID": "1.3.6.1.4.1.2011.5.25.42.4.1.19.1.1", "ifName": "1.3.6.1.2.1.31.1.1.1.1", "hwMstpPwName": "1.3.6.1.4.1.2011.5.25.42.4.1.33", "hwMstpSrcMacAddress": "1.3.6.1.4.1.2011.5.25.42.4.1.37"]
]

// --- hwMstpProLoopDetectedRising (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.4.2.35
// Fields: hwMstpProNewPortState, ifName, hwMstpPwName
// Description: This notification indicates that loopback of protocol packets is detected on the port.
trapMap["1.3.6.1.4.1.2011.5.25.42.4.2.35"] = [
    name: "hwMstpProLoopDetectedRising",
    fields: ["hwMstpProNewPortState", "ifName", "hwMstpPwName"],
    fieldOids: ["hwMstpProNewPortState": "1.3.6.1.4.1.2011.5.25.42.4.1.29.1.1", "ifName": "1.3.6.1.2.1.31.1.1.1.1", "hwMstpPwName": "1.3.6.1.4.1.2011.5.25.42.4.1.33"]
]

// --- hwMstpProLoopDetectedResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.4.2.36
// Fields: hwMstpProNewPortState, ifName, hwMstpPwName
// Description: This notification indicates that loopback of protocol packets is not detected on the port for a long time.
trapMap["1.3.6.1.4.1.2011.5.25.42.4.2.36"] = [
    name: "hwMstpProLoopDetectedResume",
    fields: ["hwMstpProNewPortState", "ifName", "hwMstpPwName"],
    fieldOids: ["hwMstpProNewPortState": "1.3.6.1.4.1.2011.5.25.42.4.1.29.1.1", "ifName": "1.3.6.1.2.1.31.1.1.1.1", "hwMstpPwName": "1.3.6.1.4.1.2011.5.25.42.4.1.33"]
]

// --- hwMstpVstpMacDiffRising (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.4.2.37
// Fields: hwMstpVstpMasterMac, hwMstpVstpBackupMac
// Description: This notification indicates that the configured bridge MAC addresses of master and backup devices in V-STP mode are different.
trapMap["1.3.6.1.4.1.2011.5.25.42.4.2.37"] = [
    name: "hwMstpVstpMacDiffRising",
    fields: ["hwMstpVstpMasterMac", "hwMstpVstpBackupMac"],
    fieldOids: ["hwMstpVstpMasterMac": "1.3.6.1.4.1.2011.5.25.42.4.1.38", "hwMstpVstpBackupMac": "1.3.6.1.4.1.2011.5.25.42.4.1.39"]
]

// --- hwMstpVstpMacDiffResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.42.4.2.38
// Fields: hwMstpVstpMasterMac, hwMstpVstpBackupMac
// Description: This notification indicates that the configured bridge MAC addresses of master and backup devices in V-STP mode are the same.
trapMap["1.3.6.1.4.1.2011.5.25.42.4.2.38"] = [
    name: "hwMstpVstpMacDiffResume",
    fields: ["hwMstpVstpMasterMac", "hwMstpVstpBackupMac"],
    fieldOids: ["hwMstpVstpMasterMac": "1.3.6.1.4.1.2011.5.25.42.4.1.38", "hwMstpVstpBackupMac": "1.3.6.1.4.1.2011.5.25.42.4.1.39"]
]

// ===== Lookup tables (inlined) =====
def lookupTables = [:]

// ===== Parsing logic =====

// Set to true to enable diagnostic logging for this MIB parser
DEBUG = false

LOG_PREFIX = "[HUAWEI-MSTP-MIB]"
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
event.setStatus("ACTIVE")
event.setEventClass("snmp_trap")
event.setSpecificTrap(trapOid ?: "")
event.setOriginalSeverity(event.getSeverity())
event.setOriginalSummary(event.getSummary())

// --- Trap rule overrides (alert group / severity) ---
def trapRuleName = trapInfo.name
def agent = ""
// --- Trap: hwMstpiPortStateForwarding (OID 1.3.6.1.4.1.2011.5.25.42.4.2.1) ---
if (trapRuleName == "hwMstpiPortStateForwarding") {
    event.setAlertGroup("MSTP Bridge Port Status")
    def alertKey = "hwMstpPortEntry." + gf[1] + "." + gf[2]
    event.setAlertKey(alertKey)
    def summary = "Hw Mstpi Port State Forwarding" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(2)
    event.setEventType("13")
    def dyn = event.getDynamicFields() ?: [:]
    dyn["hwMstpInstanceID"] = varbinds.get("hwMstpInstanceID")
    dyn["hwMstpiPortIndex"] = varbinds.get("hwMstpiPortIndex")
    event.setDynamicFields(dyn)
}
// --- Trap: hwMstpiPortStateDiscarding (OID 1.3.6.1.4.1.2011.5.25.42.4.2.2) ---
if (trapRuleName == "hwMstpiPortStateDiscarding") {
    event.setAlertGroup("MSTP Bridge Port Status")
    def alertKey = "hwMstpPortEntry." + gf[1] + "." + gf[2]
    event.setAlertKey(alertKey)
    def summary = "Hw Mstpi Port State Discarding" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(2)
    event.setEventType("13")
    def dyn = event.getDynamicFields() ?: [:]
    dyn["hwMstpInstanceID"] = varbinds.get("hwMstpInstanceID")
    dyn["hwMstpiPortIndex"] = varbinds.get("hwMstpiPortIndex")
    event.setDynamicFields(dyn)
}
// --- Trap: hwMstpiBridgeLostRootPrimary (OID 1.3.6.1.4.1.2011.5.25.42.4.2.3) ---
if (trapRuleName == "hwMstpiBridgeLostRootPrimary") {
    event.setAlertGroup("MSTP Bridge Status")
    def alertKey = "hwMstpInstanceEntry." + gf[1]
    event.setAlertKey(alertKey)
    def summary = "Hw Mstpi Bridge Lost Root Primary" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(2)
    event.setEventType("1")
    def dyn = event.getDynamicFields() ?: [:]
    dyn["hwMstpInstanceID"] = varbinds.get("hwMstpInstanceID")
    event.setDynamicFields(dyn)
}
// --- Trap: hwMstpiPortRootGuarded (OID 1.3.6.1.4.1.2011.5.25.42.4.2.4) ---
if (trapRuleName == "hwMstpiPortRootGuarded") {
    event.setAlertGroup("MSTP Bridge Root Port Status")
    def alertKey = "hwMstpPortEntry." + gf[1] + "." + gf[2]
    event.setAlertKey(alertKey)
    def summary = "Hw Mstpi Port Root Guarded" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(2)
    event.setEventType("13")
    def dyn = event.getDynamicFields() ?: [:]
    dyn["hwMstpInstanceID"] = varbinds.get("hwMstpInstanceID")
    dyn["hwMstpiPortIndex"] = varbinds.get("hwMstpiPortIndex")
    event.setDynamicFields(dyn)
}
// --- Trap: hwMstpiPortBpduGuarded (OID 1.3.6.1.4.1.2011.5.25.42.4.2.5) ---
if (trapRuleName == "hwMstpiPortBpduGuarded") {
    event.setAlertGroup("MSTP Bridge Port Status")
    def alertKey = "hwMstpPortEntry." + (((resolveInstanceOid(1) =~ /\.([0-9]+)$/) ? (resolveInstanceOid(1) =~ /\.([0-9]+)$/)[0][1] : '')) + "." + gf[1]
    event.setAlertKey(alertKey)
    def summary = "Hw Mstpi Port Bpdu Guarded" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(2)
    event.setEventType("13")
    def dyn = event.getDynamicFields() ?: [:]
    dyn["hwMstpiPortIndex"] = varbinds.get("hwMstpiPortIndex")
    event.setDynamicFields(dyn)
}
// --- Trap: hwMstpiPortLoopGuarded (OID 1.3.6.1.4.1.2011.5.25.42.4.2.6) ---
if (trapRuleName == "hwMstpiPortLoopGuarded") {
    event.setAlertGroup("MSTP Bridge Root Port Status")
    def alertKey = "hwMstpPortEntry." + gf[1] + "." + gf[2]
    event.setAlertKey(alertKey)
    def summary = "Hw Mstpi Port Loop Guarded" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(2)
    event.setEventType("1")
    def dyn = event.getDynamicFields() ?: [:]
    dyn["hwMstpInstanceID"] = varbinds.get("hwMstpInstanceID")
    dyn["hwMstpiPortIndex"] = varbinds.get("hwMstpiPortIndex")
    event.setDynamicFields(dyn)
}

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
