/**
 * Auto-generated from HUAWEI-SECURITY-STAT-MIB.mib
 * Generated: 2026-08-24T18:28:30.917042700
 * Traps/Notifications (66): hwSecStatSessOverThreshold, hwSecStatSessBelowThreshold, hwSecStatSessRateOverThreshold, hwSecStatSessRateBelowThreshold, hwSecStatFastSessOverThreshold, hwSecStatFastSessBelowThreshold, hwSecStatSessFastAgingOverThreshold, hwSecStatSessFastAgingBelowThreshold, hwSecStatIPv6SessFastAgingOverThreshold, hwSecStatIPv6SessFastAgingBelowThreshold, hwSecStatSessFastAgingBegin, hwSecStatSessFastAgingEnd, hwSecStatIPv6SessOverThreshold, hwSecStatIPv6SessBelowThreshold, hwSecStatIPv6SessRateOverThreshold, hwSecStatIPv6SessRateBelowThreshold, hwSecStatCPUFwdCongestionPacketLoss, hwSecStatCPUFwdCongestionPacketLossRecover, hwSecStatPerfTrapCpuOverThreshold, hwSecStatPerfTrapCpuBelowThreshold, hwSecStatPerfTrapMemOverThreshold, hwSecStatPerfTrapMemBelowThreshold, hwSecStatPerfTrapOverCpuCarThreshold, hwSecStatPerfTrapBelowCpuCarThreshold, hwSecStatPerfTrapOverProductCarThreshold, hwSecStatPerfTrapBelowProductCarThreshold, hwSecStatSvrMapTrapOverThreshold, hwSecStatSvrMapTrapBelowThreshold, hwSecStatSvrMap6TrapOverThreshold, hwSecStatSvrMap6TrapBelowThreshold, hwSecStatBLSTrapOverThreshold, hwSecStatBLSTrapBelowThreshold, hwSecStatSuddenChangeTrapOverThreshold, hwSecStatSessionCreateLimitTrapOverThreshold, hwSecStatSessionCreateLimitTrapBelowThreshold, hwSecStatFragSessOverThreshold, hwSecStatFragSessBelowThreshold, hwSecStatFrag6SessOverThreshold, hwSecStatFrag6SessBelowThreshold, hwSecStatSessCreateRateSuddenChangeTrapOverThreshold, hwSecStatFrag4CachePktOverThreshold, hwSecStatFrag4CachePktBelowThreshold, hwSecStatFrag6CachePktOverThreshold, hwSecStatFrag6CachePktBelowThreshold, hwSecStatFrag4MisorderPktOverThreshold, hwSecStatFrag4MisorderPktBelowThreshold, hwSecStatFrag6MisorderPktOverThreshold, hwSecStatFrag6MisorderPktBelowThreshold, hwSecStatFrag4ElephantFlowDetect, hwSecStatFrag4ElephantFlowDetectClear, hwSecStatFrag6ElephantFlowDetect, hwSecStatFrag6ElephantFlowDetectClear, hwSecStatSctpMhomeOverThreshold, hwSecStatSctpMhomeBelowThreshold, hwSecStatEmergencyFwdTimeoutWarning, hwSecStatEmergencyFwdTimeout, hwSecStatEmergencyDefendTimeoutWarning, hwSecStatEmergencyDefendTimeout, hwSecStatLogHostDown, hwSecStatLogHostUp, hwSecStatFbypassStart, hwSecStatFbypassEnd, hwSecStatDynamicResourceOverThreshold, hwSecStatDynamicResourceBelowThreshold, hwSecStatDevDynResOverThreshold, hwSecStatDevDynResBelowThreshold
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

// --- hwSecStatSessOverThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.122.15.3.2.1
// Fields: hwSecStatTrapSlot, hwSecStatTrapCPU, hwSecStatSessTrapCount, hwSecStatSessTrapThreshold
// Description: The session count of the CPU exceeds the upper limit of the threshold.
trapMap["1.3.6.1.4.1.2011.6.122.15.3.2.1"] = [
    name: "hwSecStatSessOverThreshold",
    fields: ["hwSecStatTrapSlot", "hwSecStatTrapCPU", "hwSecStatSessTrapCount", "hwSecStatSessTrapThreshold"],
    fieldOids: ["hwSecStatTrapSlot": "1.3.6.1.4.1.2011.6.122.15.3.1.2", "hwSecStatTrapCPU": "1.3.6.1.4.1.2011.6.122.15.3.1.3", "hwSecStatSessTrapCount": "1.3.6.1.4.1.2011.6.122.15.3.1.6", "hwSecStatSessTrapThreshold": "1.3.6.1.4.1.2011.6.122.15.3.1.7"]
]

// --- hwSecStatSessBelowThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.122.15.3.2.2
// Fields: hwSecStatTrapSlot, hwSecStatTrapCPU, hwSecStatSessTrapCount, hwSecStatSessTrapThreshold
// Description: The session count of the CPU restores to be lower than the threshold corresponding to the upper limit of the threshold.
trapMap["1.3.6.1.4.1.2011.6.122.15.3.2.2"] = [
    name: "hwSecStatSessBelowThreshold",
    fields: ["hwSecStatTrapSlot", "hwSecStatTrapCPU", "hwSecStatSessTrapCount", "hwSecStatSessTrapThreshold"],
    fieldOids: ["hwSecStatTrapSlot": "1.3.6.1.4.1.2011.6.122.15.3.1.2", "hwSecStatTrapCPU": "1.3.6.1.4.1.2011.6.122.15.3.1.3", "hwSecStatSessTrapCount": "1.3.6.1.4.1.2011.6.122.15.3.1.6", "hwSecStatSessTrapThreshold": "1.3.6.1.4.1.2011.6.122.15.3.1.7"]
]

// --- hwSecStatSessRateOverThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.122.15.3.2.3
// Fields: hwSecStatTrapSlot, hwSecStatTrapCPU, hwSecStatSessRateTrapCount, hwSecStatSessRateTrapThreshold
// Description: The rate of creating sessions exceeds the upper limit of the threshold.
trapMap["1.3.6.1.4.1.2011.6.122.15.3.2.3"] = [
    name: "hwSecStatSessRateOverThreshold",
    fields: ["hwSecStatTrapSlot", "hwSecStatTrapCPU", "hwSecStatSessRateTrapCount", "hwSecStatSessRateTrapThreshold"],
    fieldOids: ["hwSecStatTrapSlot": "1.3.6.1.4.1.2011.6.122.15.3.1.2", "hwSecStatTrapCPU": "1.3.6.1.4.1.2011.6.122.15.3.1.3", "hwSecStatSessRateTrapCount": "1.3.6.1.4.1.2011.6.122.15.3.1.8", "hwSecStatSessRateTrapThreshold": "1.3.6.1.4.1.2011.6.122.15.3.1.9"]
]

// --- hwSecStatSessRateBelowThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.122.15.3.2.4
// Fields: hwSecStatTrapSlot, hwSecStatTrapCPU, hwSecStatSessRateTrapCount, hwSecStatSessRateTrapThreshold
// Description: The rate of creating sessions restores to be lower than the threshold corresponding to the upper limit of the threshold.
trapMap["1.3.6.1.4.1.2011.6.122.15.3.2.4"] = [
    name: "hwSecStatSessRateBelowThreshold",
    fields: ["hwSecStatTrapSlot", "hwSecStatTrapCPU", "hwSecStatSessRateTrapCount", "hwSecStatSessRateTrapThreshold"],
    fieldOids: ["hwSecStatTrapSlot": "1.3.6.1.4.1.2011.6.122.15.3.1.2", "hwSecStatTrapCPU": "1.3.6.1.4.1.2011.6.122.15.3.1.3", "hwSecStatSessRateTrapCount": "1.3.6.1.4.1.2011.6.122.15.3.1.8", "hwSecStatSessRateTrapThreshold": "1.3.6.1.4.1.2011.6.122.15.3.1.9"]
]

// --- hwSecStatFastSessOverThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.122.15.3.2.5
// Fields: hwSecStatTrapSlot, hwSecStatTrapCPU, hwSecStatSessTrapCount, hwSecStatSessTrapThreshold
// Description: The fast-forwarding session count exceeds the upper limit of the threshold.
trapMap["1.3.6.1.4.1.2011.6.122.15.3.2.5"] = [
    name: "hwSecStatFastSessOverThreshold",
    fields: ["hwSecStatTrapSlot", "hwSecStatTrapCPU", "hwSecStatSessTrapCount", "hwSecStatSessTrapThreshold"],
    fieldOids: ["hwSecStatTrapSlot": "1.3.6.1.4.1.2011.6.122.15.3.1.2", "hwSecStatTrapCPU": "1.3.6.1.4.1.2011.6.122.15.3.1.3", "hwSecStatSessTrapCount": "1.3.6.1.4.1.2011.6.122.15.3.1.6", "hwSecStatSessTrapThreshold": "1.3.6.1.4.1.2011.6.122.15.3.1.7"]
]

// --- hwSecStatFastSessBelowThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.122.15.3.2.6
// Fields: hwSecStatTrapSlot, hwSecStatTrapCPU, hwSecStatSessTrapCount, hwSecStatSessTrapThreshold
// Description: The fast-forwarding session count restores to be lower than the threshold corresponding to the upper limit of the threshold.
trapMap["1.3.6.1.4.1.2011.6.122.15.3.2.6"] = [
    name: "hwSecStatFastSessBelowThreshold",
    fields: ["hwSecStatTrapSlot", "hwSecStatTrapCPU", "hwSecStatSessTrapCount", "hwSecStatSessTrapThreshold"],
    fieldOids: ["hwSecStatTrapSlot": "1.3.6.1.4.1.2011.6.122.15.3.1.2", "hwSecStatTrapCPU": "1.3.6.1.4.1.2011.6.122.15.3.1.3", "hwSecStatSessTrapCount": "1.3.6.1.4.1.2011.6.122.15.3.1.6", "hwSecStatSessTrapThreshold": "1.3.6.1.4.1.2011.6.122.15.3.1.7"]
]

// --- hwSecStatSessFastAgingOverThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.122.15.3.2.7
// Fields: hwSecStatTrapSlot, hwSecStatTrapCPU, hwSecStatSessTrapCount, hwSecStatSessTrapThreshold
// Description: The session count of the CPU exceeds the upper limit of the threshold. Session fast aging begins.
trapMap["1.3.6.1.4.1.2011.6.122.15.3.2.7"] = [
    name: "hwSecStatSessFastAgingOverThreshold",
    fields: ["hwSecStatTrapSlot", "hwSecStatTrapCPU", "hwSecStatSessTrapCount", "hwSecStatSessTrapThreshold"],
    fieldOids: ["hwSecStatTrapSlot": "1.3.6.1.4.1.2011.6.122.15.3.1.2", "hwSecStatTrapCPU": "1.3.6.1.4.1.2011.6.122.15.3.1.3", "hwSecStatSessTrapCount": "1.3.6.1.4.1.2011.6.122.15.3.1.6", "hwSecStatSessTrapThreshold": "1.3.6.1.4.1.2011.6.122.15.3.1.7"]
]

// --- hwSecStatSessFastAgingBelowThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.122.15.3.2.8
// Fields: hwSecStatTrapSlot, hwSecStatTrapCPU, hwSecStatSessTrapCount, hwSecStatSessTrapThreshold
// Description: The session count of the CPU falls below the threshold corresponding to the upper limit of the threshold. Session fast aging ends.
trapMap["1.3.6.1.4.1.2011.6.122.15.3.2.8"] = [
    name: "hwSecStatSessFastAgingBelowThreshold",
    fields: ["hwSecStatTrapSlot", "hwSecStatTrapCPU", "hwSecStatSessTrapCount", "hwSecStatSessTrapThreshold"],
    fieldOids: ["hwSecStatTrapSlot": "1.3.6.1.4.1.2011.6.122.15.3.1.2", "hwSecStatTrapCPU": "1.3.6.1.4.1.2011.6.122.15.3.1.3", "hwSecStatSessTrapCount": "1.3.6.1.4.1.2011.6.122.15.3.1.6", "hwSecStatSessTrapThreshold": "1.3.6.1.4.1.2011.6.122.15.3.1.7"]
]

// --- hwSecStatIPv6SessFastAgingOverThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.122.15.3.2.9
// Fields: hwSecStatTrapSlot, hwSecStatTrapCPU, hwSecStatSessTrapCount, hwSecStatSessTrapThreshold
// Description: The IPv6 session count of the CPU exceeds the upper limit of the threshold. IPv6 session fast aging begins.
trapMap["1.3.6.1.4.1.2011.6.122.15.3.2.9"] = [
    name: "hwSecStatIPv6SessFastAgingOverThreshold",
    fields: ["hwSecStatTrapSlot", "hwSecStatTrapCPU", "hwSecStatSessTrapCount", "hwSecStatSessTrapThreshold"],
    fieldOids: ["hwSecStatTrapSlot": "1.3.6.1.4.1.2011.6.122.15.3.1.2", "hwSecStatTrapCPU": "1.3.6.1.4.1.2011.6.122.15.3.1.3", "hwSecStatSessTrapCount": "1.3.6.1.4.1.2011.6.122.15.3.1.6", "hwSecStatSessTrapThreshold": "1.3.6.1.4.1.2011.6.122.15.3.1.7"]
]

// --- hwSecStatIPv6SessFastAgingBelowThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.122.15.3.2.10
// Fields: hwSecStatTrapSlot, hwSecStatTrapCPU, hwSecStatSessTrapCount, hwSecStatSessTrapThreshold
// Description: The IPv6 session count of the CPU falls below the threshold corresponding to the upper limit of the threshold. IPv6 session fast aging ends.
trapMap["1.3.6.1.4.1.2011.6.122.15.3.2.10"] = [
    name: "hwSecStatIPv6SessFastAgingBelowThreshold",
    fields: ["hwSecStatTrapSlot", "hwSecStatTrapCPU", "hwSecStatSessTrapCount", "hwSecStatSessTrapThreshold"],
    fieldOids: ["hwSecStatTrapSlot": "1.3.6.1.4.1.2011.6.122.15.3.1.2", "hwSecStatTrapCPU": "1.3.6.1.4.1.2011.6.122.15.3.1.3", "hwSecStatSessTrapCount": "1.3.6.1.4.1.2011.6.122.15.3.1.6", "hwSecStatSessTrapThreshold": "1.3.6.1.4.1.2011.6.122.15.3.1.7"]
]

// --- hwSecStatSessFastAgingBegin (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.122.15.3.2.11
// Fields: hwSecStatTrapSlot, hwSecStatTrapCPU, hwSecStatFastAgingMemUsage, hwSecStatFastAgingMemThreshold
// Description: The memory usage of the CPU exceeds the threshold. IPv4 and IPv6 session fast aging begins.
trapMap["1.3.6.1.4.1.2011.6.122.15.3.2.11"] = [
    name: "hwSecStatSessFastAgingBegin",
    fields: ["hwSecStatTrapSlot", "hwSecStatTrapCPU", "hwSecStatFastAgingMemUsage", "hwSecStatFastAgingMemThreshold"],
    fieldOids: ["hwSecStatTrapSlot": "1.3.6.1.4.1.2011.6.122.15.3.1.2", "hwSecStatTrapCPU": "1.3.6.1.4.1.2011.6.122.15.3.1.3", "hwSecStatFastAgingMemUsage": "1.3.6.1.4.1.2011.6.122.15.3.1.39", "hwSecStatFastAgingMemThreshold": "1.3.6.1.4.1.2011.6.122.15.3.1.40"]
]

// --- hwSecStatSessFastAgingEnd (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.122.15.3.2.12
// Fields: hwSecStatTrapSlot, hwSecStatTrapCPU, hwSecStatFastAgingMemUsage, hwSecStatFastAgingMemThreshold
// Description: The memory usage of the CPU falls below the threshold. IPv4 and IPV6 session fast aging ends.
trapMap["1.3.6.1.4.1.2011.6.122.15.3.2.12"] = [
    name: "hwSecStatSessFastAgingEnd",
    fields: ["hwSecStatTrapSlot", "hwSecStatTrapCPU", "hwSecStatFastAgingMemUsage", "hwSecStatFastAgingMemThreshold"],
    fieldOids: ["hwSecStatTrapSlot": "1.3.6.1.4.1.2011.6.122.15.3.1.2", "hwSecStatTrapCPU": "1.3.6.1.4.1.2011.6.122.15.3.1.3", "hwSecStatFastAgingMemUsage": "1.3.6.1.4.1.2011.6.122.15.3.1.39", "hwSecStatFastAgingMemThreshold": "1.3.6.1.4.1.2011.6.122.15.3.1.40"]
]

// --- hwSecStatIPv6SessOverThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.122.15.3.2.13
// Fields: hwSecStatTrapSlot, hwSecStatTrapCPU, hwSecStatSessTrapCount, hwSecStatSessTrapThreshold
// Description: The IPv6 session count of the CPU exceeds the upper limit of the threshold.
trapMap["1.3.6.1.4.1.2011.6.122.15.3.2.13"] = [
    name: "hwSecStatIPv6SessOverThreshold",
    fields: ["hwSecStatTrapSlot", "hwSecStatTrapCPU", "hwSecStatSessTrapCount", "hwSecStatSessTrapThreshold"],
    fieldOids: ["hwSecStatTrapSlot": "1.3.6.1.4.1.2011.6.122.15.3.1.2", "hwSecStatTrapCPU": "1.3.6.1.4.1.2011.6.122.15.3.1.3", "hwSecStatSessTrapCount": "1.3.6.1.4.1.2011.6.122.15.3.1.6", "hwSecStatSessTrapThreshold": "1.3.6.1.4.1.2011.6.122.15.3.1.7"]
]

// --- hwSecStatIPv6SessBelowThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.122.15.3.2.14
// Fields: hwSecStatTrapSlot, hwSecStatTrapCPU, hwSecStatSessTrapCount, hwSecStatSessTrapThreshold
// Description: The IPv6 session count of the CPU restores to be lower than the threshold corresponding to the upper limit of the threshold.
trapMap["1.3.6.1.4.1.2011.6.122.15.3.2.14"] = [
    name: "hwSecStatIPv6SessBelowThreshold",
    fields: ["hwSecStatTrapSlot", "hwSecStatTrapCPU", "hwSecStatSessTrapCount", "hwSecStatSessTrapThreshold"],
    fieldOids: ["hwSecStatTrapSlot": "1.3.6.1.4.1.2011.6.122.15.3.1.2", "hwSecStatTrapCPU": "1.3.6.1.4.1.2011.6.122.15.3.1.3", "hwSecStatSessTrapCount": "1.3.6.1.4.1.2011.6.122.15.3.1.6", "hwSecStatSessTrapThreshold": "1.3.6.1.4.1.2011.6.122.15.3.1.7"]
]

// --- hwSecStatIPv6SessRateOverThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.122.15.3.2.15
// Fields: hwSecStatTrapSlot, hwSecStatTrapCPU, hwSecStatSessRateTrapCount, hwSecStatSessRateTrapThreshold
// Description: The IPv6 session create rate exceeds the upper limit of the threshold.
trapMap["1.3.6.1.4.1.2011.6.122.15.3.2.15"] = [
    name: "hwSecStatIPv6SessRateOverThreshold",
    fields: ["hwSecStatTrapSlot", "hwSecStatTrapCPU", "hwSecStatSessRateTrapCount", "hwSecStatSessRateTrapThreshold"],
    fieldOids: ["hwSecStatTrapSlot": "1.3.6.1.4.1.2011.6.122.15.3.1.2", "hwSecStatTrapCPU": "1.3.6.1.4.1.2011.6.122.15.3.1.3", "hwSecStatSessRateTrapCount": "1.3.6.1.4.1.2011.6.122.15.3.1.8", "hwSecStatSessRateTrapThreshold": "1.3.6.1.4.1.2011.6.122.15.3.1.9"]
]

// --- hwSecStatIPv6SessRateBelowThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.122.15.3.2.16
// Fields: hwSecStatTrapSlot, hwSecStatTrapCPU, hwSecStatSessRateTrapCount, hwSecStatSessRateTrapThreshold
// Description: The IPv6 session create rate restores to be lower than the threshold corresponding to the upper limit of the threshold.
trapMap["1.3.6.1.4.1.2011.6.122.15.3.2.16"] = [
    name: "hwSecStatIPv6SessRateBelowThreshold",
    fields: ["hwSecStatTrapSlot", "hwSecStatTrapCPU", "hwSecStatSessRateTrapCount", "hwSecStatSessRateTrapThreshold"],
    fieldOids: ["hwSecStatTrapSlot": "1.3.6.1.4.1.2011.6.122.15.3.1.2", "hwSecStatTrapCPU": "1.3.6.1.4.1.2011.6.122.15.3.1.3", "hwSecStatSessRateTrapCount": "1.3.6.1.4.1.2011.6.122.15.3.1.8", "hwSecStatSessRateTrapThreshold": "1.3.6.1.4.1.2011.6.122.15.3.1.9"]
]

// --- hwSecStatCPUFwdCongestionPacketLoss (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.122.15.3.2.17
// Fields: hwSecStatslot, hwSecStatTrapCPU
// Description: Congestion and packet loss occur during CPU forwarding.
trapMap["1.3.6.1.4.1.2011.6.122.15.3.2.17"] = [
    name: "hwSecStatCPUFwdCongestionPacketLoss",
    fields: ["hwSecStatslot", "hwSecStatTrapCPU"],
    fieldOids: ["hwSecStatslot": "1.3.6.1.4.1.2011.6.122.15.3.1.61", "hwSecStatTrapCPU": "1.3.6.1.4.1.2011.6.122.15.3.1.3"]
]

// --- hwSecStatCPUFwdCongestionPacketLossRecover (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.122.15.3.2.18
// Fields: hwSecStatslot, hwSecStatTrapCPU
// Description: Congestion and packet loss during CPU forwarding recover.
trapMap["1.3.6.1.4.1.2011.6.122.15.3.2.18"] = [
    name: "hwSecStatCPUFwdCongestionPacketLossRecover",
    fields: ["hwSecStatslot", "hwSecStatTrapCPU"],
    fieldOids: ["hwSecStatslot": "1.3.6.1.4.1.2011.6.122.15.3.1.61", "hwSecStatTrapCPU": "1.3.6.1.4.1.2011.6.122.15.3.1.3"]
]

// --- hwSecStatPerfTrapCpuOverThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.122.15.3.3.1
// Fields: hwSecStatTrapBoardType, hwSecStatTrapSlot, hwSecStatTrapCPU, hwSecStatPerfTrapVcpu, hwSecStatPerfTrapCpuUsage, hwSecStatPerfTrapCpuThreshold
// Description: The usage of cpu exceeds the upper limit of the threshold.
trapMap["1.3.6.1.4.1.2011.6.122.15.3.3.1"] = [
    name: "hwSecStatPerfTrapCpuOverThreshold",
    fields: ["hwSecStatTrapBoardType", "hwSecStatTrapSlot", "hwSecStatTrapCPU", "hwSecStatPerfTrapVcpu", "hwSecStatPerfTrapCpuUsage", "hwSecStatPerfTrapCpuThreshold"],
    fieldOids: ["hwSecStatTrapBoardType": "1.3.6.1.4.1.2011.6.122.15.3.1.1", "hwSecStatTrapSlot": "1.3.6.1.4.1.2011.6.122.15.3.1.2", "hwSecStatTrapCPU": "1.3.6.1.4.1.2011.6.122.15.3.1.3", "hwSecStatPerfTrapVcpu": "1.3.6.1.4.1.2011.6.122.15.3.1.4", "hwSecStatPerfTrapCpuUsage": "1.3.6.1.4.1.2011.6.122.15.3.1.10", "hwSecStatPerfTrapCpuThreshold": "1.3.6.1.4.1.2011.6.122.15.3.1.11"]
]

// --- hwSecStatPerfTrapCpuBelowThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.122.15.3.3.2
// Fields: hwSecStatTrapBoardType, hwSecStatTrapSlot, hwSecStatTrapCPU, hwSecStatPerfTrapVcpu, hwSecStatPerfTrapCpuUsage, hwSecStatPerfTrapCpuThreshold
// Description: The usage of cpu restores to be lower than the threshold corresponding to the upper limit of the threshold.
trapMap["1.3.6.1.4.1.2011.6.122.15.3.3.2"] = [
    name: "hwSecStatPerfTrapCpuBelowThreshold",
    fields: ["hwSecStatTrapBoardType", "hwSecStatTrapSlot", "hwSecStatTrapCPU", "hwSecStatPerfTrapVcpu", "hwSecStatPerfTrapCpuUsage", "hwSecStatPerfTrapCpuThreshold"],
    fieldOids: ["hwSecStatTrapBoardType": "1.3.6.1.4.1.2011.6.122.15.3.1.1", "hwSecStatTrapSlot": "1.3.6.1.4.1.2011.6.122.15.3.1.2", "hwSecStatTrapCPU": "1.3.6.1.4.1.2011.6.122.15.3.1.3", "hwSecStatPerfTrapVcpu": "1.3.6.1.4.1.2011.6.122.15.3.1.4", "hwSecStatPerfTrapCpuUsage": "1.3.6.1.4.1.2011.6.122.15.3.1.10", "hwSecStatPerfTrapCpuThreshold": "1.3.6.1.4.1.2011.6.122.15.3.1.11"]
]

// --- hwSecStatPerfTrapMemOverThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.122.15.3.3.3
// Fields: hwSecStatTrapBoardType, hwSecStatTrapSlot, hwSecStatTrapCPU, hwSecStatPerfTrapMemType, hwSecStatPerfTrapMemUsage, hwSecStatPerfTrapMemThreshold
// Description: The usage of memory exceeds the upper limit of the threshold.
trapMap["1.3.6.1.4.1.2011.6.122.15.3.3.3"] = [
    name: "hwSecStatPerfTrapMemOverThreshold",
    fields: ["hwSecStatTrapBoardType", "hwSecStatTrapSlot", "hwSecStatTrapCPU", "hwSecStatPerfTrapMemType", "hwSecStatPerfTrapMemUsage", "hwSecStatPerfTrapMemThreshold"],
    fieldOids: ["hwSecStatTrapBoardType": "1.3.6.1.4.1.2011.6.122.15.3.1.1", "hwSecStatTrapSlot": "1.3.6.1.4.1.2011.6.122.15.3.1.2", "hwSecStatTrapCPU": "1.3.6.1.4.1.2011.6.122.15.3.1.3", "hwSecStatPerfTrapMemType": "1.3.6.1.4.1.2011.6.122.15.3.1.5", "hwSecStatPerfTrapMemUsage": "1.3.6.1.4.1.2011.6.122.15.3.1.12", "hwSecStatPerfTrapMemThreshold": "1.3.6.1.4.1.2011.6.122.15.3.1.13"]
]

// --- hwSecStatPerfTrapMemBelowThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.122.15.3.3.4
// Fields: hwSecStatTrapBoardType, hwSecStatTrapSlot, hwSecStatTrapCPU, hwSecStatPerfTrapMemType, hwSecStatPerfTrapMemUsage, hwSecStatPerfTrapMemThreshold
// Description: The usage of memory restores to be lower than the threshold corresponding to the upper limit of the threshold.
trapMap["1.3.6.1.4.1.2011.6.122.15.3.3.4"] = [
    name: "hwSecStatPerfTrapMemBelowThreshold",
    fields: ["hwSecStatTrapBoardType", "hwSecStatTrapSlot", "hwSecStatTrapCPU", "hwSecStatPerfTrapMemType", "hwSecStatPerfTrapMemUsage", "hwSecStatPerfTrapMemThreshold"],
    fieldOids: ["hwSecStatTrapBoardType": "1.3.6.1.4.1.2011.6.122.15.3.1.1", "hwSecStatTrapSlot": "1.3.6.1.4.1.2011.6.122.15.3.1.2", "hwSecStatTrapCPU": "1.3.6.1.4.1.2011.6.122.15.3.1.3", "hwSecStatPerfTrapMemType": "1.3.6.1.4.1.2011.6.122.15.3.1.5", "hwSecStatPerfTrapMemUsage": "1.3.6.1.4.1.2011.6.122.15.3.1.12", "hwSecStatPerfTrapMemThreshold": "1.3.6.1.4.1.2011.6.122.15.3.1.13"]
]

// --- hwSecStatPerfTrapOverCpuCarThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.122.15.3.3.5
// Fields: hwSecStatTrapSlot, hwSecStatTrapCPU, hwSecStatPerfTrapCpucarThreshold, hwSecStatPerfPerformanceCurSecond
// Description: The usage of cpu car exceeds the upper limit of the threshold.
trapMap["1.3.6.1.4.1.2011.6.122.15.3.3.5"] = [
    name: "hwSecStatPerfTrapOverCpuCarThreshold",
    fields: ["hwSecStatTrapSlot", "hwSecStatTrapCPU", "hwSecStatPerfTrapCpucarThreshold", "hwSecStatPerfPerformanceCurSecond"],
    fieldOids: ["hwSecStatTrapSlot": "1.3.6.1.4.1.2011.6.122.15.3.1.2", "hwSecStatTrapCPU": "1.3.6.1.4.1.2011.6.122.15.3.1.3", "hwSecStatPerfTrapCpucarThreshold": "1.3.6.1.4.1.2011.6.122.15.3.1.14", "hwSecStatPerfPerformanceCurSecond": "1.3.6.1.4.1.2011.6.122.15.3.1.15"]
]

// --- hwSecStatPerfTrapBelowCpuCarThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.122.15.3.3.6
// Fields: hwSecStatTrapSlot, hwSecStatTrapCPU, hwSecStatPerfTrapCpucarThreshold, hwSecStatPerfPerformanceCurSecond
// Description: The usage of cpu car fell below the upper limit of the threshold.
trapMap["1.3.6.1.4.1.2011.6.122.15.3.3.6"] = [
    name: "hwSecStatPerfTrapBelowCpuCarThreshold",
    fields: ["hwSecStatTrapSlot", "hwSecStatTrapCPU", "hwSecStatPerfTrapCpucarThreshold", "hwSecStatPerfPerformanceCurSecond"],
    fieldOids: ["hwSecStatTrapSlot": "1.3.6.1.4.1.2011.6.122.15.3.1.2", "hwSecStatTrapCPU": "1.3.6.1.4.1.2011.6.122.15.3.1.3", "hwSecStatPerfTrapCpucarThreshold": "1.3.6.1.4.1.2011.6.122.15.3.1.14", "hwSecStatPerfPerformanceCurSecond": "1.3.6.1.4.1.2011.6.122.15.3.1.15"]
]

// --- hwSecStatPerfTrapOverProductCarThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.122.15.3.3.7
// Fields: hwSecStatPerfTrapProductcarThreshold, hwSecStatPerfPerformanceProductCurSecond
// Description: The performance usage of the device exceeded the threshold.
trapMap["1.3.6.1.4.1.2011.6.122.15.3.3.7"] = [
    name: "hwSecStatPerfTrapOverProductCarThreshold",
    fields: ["hwSecStatPerfTrapProductcarThreshold", "hwSecStatPerfPerformanceProductCurSecond"],
    fieldOids: ["hwSecStatPerfTrapProductcarThreshold": "1.3.6.1.4.1.2011.6.122.15.3.1.37", "hwSecStatPerfPerformanceProductCurSecond": "1.3.6.1.4.1.2011.6.122.15.3.1.38"]
]

// --- hwSecStatPerfTrapBelowProductCarThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.122.15.3.3.8
// Fields: hwSecStatPerfTrapProductcarThreshold, hwSecStatPerfPerformanceProductCurSecond
// Description: The performance usage of the device fell below the threshold.
trapMap["1.3.6.1.4.1.2011.6.122.15.3.3.8"] = [
    name: "hwSecStatPerfTrapBelowProductCarThreshold",
    fields: ["hwSecStatPerfTrapProductcarThreshold", "hwSecStatPerfPerformanceProductCurSecond"],
    fieldOids: ["hwSecStatPerfTrapProductcarThreshold": "1.3.6.1.4.1.2011.6.122.15.3.1.37", "hwSecStatPerfPerformanceProductCurSecond": "1.3.6.1.4.1.2011.6.122.15.3.1.38"]
]

// --- hwSecStatSvrMapTrapOverThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.122.15.3.4.1
// Fields: hwSecStatTrapSlot, hwSecStatTrapCPU, hwSecStatSvrMapTableCount, hwSecStatSvrMapTableThreshold
// Description: The number of used server-map entries exceeded the threshold.
trapMap["1.3.6.1.4.1.2011.6.122.15.3.4.1"] = [
    name: "hwSecStatSvrMapTrapOverThreshold",
    fields: ["hwSecStatTrapSlot", "hwSecStatTrapCPU", "hwSecStatSvrMapTableCount", "hwSecStatSvrMapTableThreshold"],
    fieldOids: ["hwSecStatTrapSlot": "1.3.6.1.4.1.2011.6.122.15.3.1.2", "hwSecStatTrapCPU": "1.3.6.1.4.1.2011.6.122.15.3.1.3", "hwSecStatSvrMapTableCount": "1.3.6.1.4.1.2011.6.122.15.3.1.16", "hwSecStatSvrMapTableThreshold": "1.3.6.1.4.1.2011.6.122.15.3.1.17"]
]

// --- hwSecStatSvrMapTrapBelowThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.122.15.3.4.2
// Fields: hwSecStatTrapSlot, hwSecStatTrapCPU, hwSecStatSvrMapTableCount, hwSecStatSvrMapTableThreshold
// Description: the number of used server-map entries fell below the threshold.
trapMap["1.3.6.1.4.1.2011.6.122.15.3.4.2"] = [
    name: "hwSecStatSvrMapTrapBelowThreshold",
    fields: ["hwSecStatTrapSlot", "hwSecStatTrapCPU", "hwSecStatSvrMapTableCount", "hwSecStatSvrMapTableThreshold"],
    fieldOids: ["hwSecStatTrapSlot": "1.3.6.1.4.1.2011.6.122.15.3.1.2", "hwSecStatTrapCPU": "1.3.6.1.4.1.2011.6.122.15.3.1.3", "hwSecStatSvrMapTableCount": "1.3.6.1.4.1.2011.6.122.15.3.1.16", "hwSecStatSvrMapTableThreshold": "1.3.6.1.4.1.2011.6.122.15.3.1.17"]
]

// --- hwSecStatSvrMap6TrapOverThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.122.15.3.4.3
// Fields: hwSecStatTrapSlot, hwSecStatTrapCPU, hwSecStatSvrMap6TableCount, hwSecStatSvrMap6TableThreshold
// Description: The number of used server-map6 entries exceeded the threshold.
trapMap["1.3.6.1.4.1.2011.6.122.15.3.4.3"] = [
    name: "hwSecStatSvrMap6TrapOverThreshold",
    fields: ["hwSecStatTrapSlot", "hwSecStatTrapCPU", "hwSecStatSvrMap6TableCount", "hwSecStatSvrMap6TableThreshold"],
    fieldOids: ["hwSecStatTrapSlot": "1.3.6.1.4.1.2011.6.122.15.3.1.2", "hwSecStatTrapCPU": "1.3.6.1.4.1.2011.6.122.15.3.1.3", "hwSecStatSvrMap6TableCount": "1.3.6.1.4.1.2011.6.122.15.3.1.18", "hwSecStatSvrMap6TableThreshold": "1.3.6.1.4.1.2011.6.122.15.3.1.19"]
]

// --- hwSecStatSvrMap6TrapBelowThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.122.15.3.4.4
// Fields: hwSecStatTrapSlot, hwSecStatTrapCPU, hwSecStatSvrMap6TableCount, hwSecStatSvrMap6TableThreshold
// Description: The number of used server-map6 entries fell below the threshold.
trapMap["1.3.6.1.4.1.2011.6.122.15.3.4.4"] = [
    name: "hwSecStatSvrMap6TrapBelowThreshold",
    fields: ["hwSecStatTrapSlot", "hwSecStatTrapCPU", "hwSecStatSvrMap6TableCount", "hwSecStatSvrMap6TableThreshold"],
    fieldOids: ["hwSecStatTrapSlot": "1.3.6.1.4.1.2011.6.122.15.3.1.2", "hwSecStatTrapCPU": "1.3.6.1.4.1.2011.6.122.15.3.1.3", "hwSecStatSvrMap6TableCount": "1.3.6.1.4.1.2011.6.122.15.3.1.18", "hwSecStatSvrMap6TableThreshold": "1.3.6.1.4.1.2011.6.122.15.3.1.19"]
]

// --- hwSecStatBLSTrapOverThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.122.15.3.4.5
// Fields: hwSecStatTrapSlot, hwSecStatTrapCPU, hwSecStatBLSItemCount, hwSecStatBLSItemThreshold
// Description: The number of dynamic blacklist entries exceeded the threshold.
trapMap["1.3.6.1.4.1.2011.6.122.15.3.4.5"] = [
    name: "hwSecStatBLSTrapOverThreshold",
    fields: ["hwSecStatTrapSlot", "hwSecStatTrapCPU", "hwSecStatBLSItemCount", "hwSecStatBLSItemThreshold"],
    fieldOids: ["hwSecStatTrapSlot": "1.3.6.1.4.1.2011.6.122.15.3.1.2", "hwSecStatTrapCPU": "1.3.6.1.4.1.2011.6.122.15.3.1.3", "hwSecStatBLSItemCount": "1.3.6.1.4.1.2011.6.122.15.3.1.20", "hwSecStatBLSItemThreshold": "1.3.6.1.4.1.2011.6.122.15.3.1.21"]
]

// --- hwSecStatBLSTrapBelowThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.122.15.3.4.6
// Fields: hwSecStatTrapSlot, hwSecStatTrapCPU, hwSecStatBLSItemCount, hwSecStatBLSItemThreshold
// Description: The number of dynamic blacklist entries fell below the threshold.
trapMap["1.3.6.1.4.1.2011.6.122.15.3.4.6"] = [
    name: "hwSecStatBLSTrapBelowThreshold",
    fields: ["hwSecStatTrapSlot", "hwSecStatTrapCPU", "hwSecStatBLSItemCount", "hwSecStatBLSItemThreshold"],
    fieldOids: ["hwSecStatTrapSlot": "1.3.6.1.4.1.2011.6.122.15.3.1.2", "hwSecStatTrapCPU": "1.3.6.1.4.1.2011.6.122.15.3.1.3", "hwSecStatBLSItemCount": "1.3.6.1.4.1.2011.6.122.15.3.1.20", "hwSecStatBLSItemThreshold": "1.3.6.1.4.1.2011.6.122.15.3.1.21"]
]

// --- hwSecStatSuddenChangeTrapOverThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.122.15.3.4.7
// Fields: hwSecStatTrapSlot, hwSecStatTrapCPU, hwSecStatSuddenChangeLastSess, hwSecStatSuddenChangeCurSess, hwSecStatSuddenChangeRatio, hwSecStatSuddenChangeRatioThreshold
// Description: The ratio of suddenly changed sessions exceeded the threshold.
trapMap["1.3.6.1.4.1.2011.6.122.15.3.4.7"] = [
    name: "hwSecStatSuddenChangeTrapOverThreshold",
    fields: ["hwSecStatTrapSlot", "hwSecStatTrapCPU", "hwSecStatSuddenChangeLastSess", "hwSecStatSuddenChangeCurSess", "hwSecStatSuddenChangeRatio", "hwSecStatSuddenChangeRatioThreshold"],
    fieldOids: ["hwSecStatTrapSlot": "1.3.6.1.4.1.2011.6.122.15.3.1.2", "hwSecStatTrapCPU": "1.3.6.1.4.1.2011.6.122.15.3.1.3", "hwSecStatSuddenChangeLastSess": "1.3.6.1.4.1.2011.6.122.15.3.1.25", "hwSecStatSuddenChangeCurSess": "1.3.6.1.4.1.2011.6.122.15.3.1.24", "hwSecStatSuddenChangeRatio": "1.3.6.1.4.1.2011.6.122.15.3.1.22", "hwSecStatSuddenChangeRatioThreshold": "1.3.6.1.4.1.2011.6.122.15.3.1.23"]
]

// --- hwSecStatSessionCreateLimitTrapOverThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.122.15.3.4.8
// Fields: hwSecStatTrapSlot, hwSecStatTrapCPU, hwSecStatCreateLimitCpuUsage
// Description: New session suppression is triggered after the value exceeds the threshold.
trapMap["1.3.6.1.4.1.2011.6.122.15.3.4.8"] = [
    name: "hwSecStatSessionCreateLimitTrapOverThreshold",
    fields: ["hwSecStatTrapSlot", "hwSecStatTrapCPU", "hwSecStatCreateLimitCpuUsage"],
    fieldOids: ["hwSecStatTrapSlot": "1.3.6.1.4.1.2011.6.122.15.3.1.2", "hwSecStatTrapCPU": "1.3.6.1.4.1.2011.6.122.15.3.1.3", "hwSecStatCreateLimitCpuUsage": "1.3.6.1.4.1.2011.6.122.15.3.1.26"]
]

// --- hwSecStatSessionCreateLimitTrapBelowThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.122.15.3.4.9
// Fields: hwSecStatTrapSlot, hwSecStatTrapCPU, hwSecStatCreateLimitCpuUsage, hwSecStatCreateLimitPassPacketNum, hwSecStatCreateLimitBlockPacketNum
// Description: New session suppression is canceled after the value falls below the threshold.
trapMap["1.3.6.1.4.1.2011.6.122.15.3.4.9"] = [
    name: "hwSecStatSessionCreateLimitTrapBelowThreshold",
    fields: ["hwSecStatTrapSlot", "hwSecStatTrapCPU", "hwSecStatCreateLimitCpuUsage", "hwSecStatCreateLimitPassPacketNum", "hwSecStatCreateLimitBlockPacketNum"],
    fieldOids: ["hwSecStatTrapSlot": "1.3.6.1.4.1.2011.6.122.15.3.1.2", "hwSecStatTrapCPU": "1.3.6.1.4.1.2011.6.122.15.3.1.3", "hwSecStatCreateLimitCpuUsage": "1.3.6.1.4.1.2011.6.122.15.3.1.26", "hwSecStatCreateLimitPassPacketNum": "1.3.6.1.4.1.2011.6.122.15.3.1.27", "hwSecStatCreateLimitBlockPacketNum": "1.3.6.1.4.1.2011.6.122.15.3.1.28"]
]

// --- hwSecStatFragSessOverThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.122.15.3.4.10
// Fields: hwSecStatTrapSlot, hwSecStatTrapCPU, hwSecStatFragSessCount, hwSecStatFragSessThreshold
// Description: The number of used frag sessions exceeded the threshold.
trapMap["1.3.6.1.4.1.2011.6.122.15.3.4.10"] = [
    name: "hwSecStatFragSessOverThreshold",
    fields: ["hwSecStatTrapSlot", "hwSecStatTrapCPU", "hwSecStatFragSessCount", "hwSecStatFragSessThreshold"],
    fieldOids: ["hwSecStatTrapSlot": "1.3.6.1.4.1.2011.6.122.15.3.1.2", "hwSecStatTrapCPU": "1.3.6.1.4.1.2011.6.122.15.3.1.3", "hwSecStatFragSessCount": "1.3.6.1.4.1.2011.6.122.15.3.1.29", "hwSecStatFragSessThreshold": "1.3.6.1.4.1.2011.6.122.15.3.1.30"]
]

// --- hwSecStatFragSessBelowThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.122.15.3.4.11
// Fields: hwSecStatTrapSlot, hwSecStatTrapCPU, hwSecStatFragSessCount, hwSecStatFragSessThreshold
// Description: The number of used of frag sessions fell below the threshold.
trapMap["1.3.6.1.4.1.2011.6.122.15.3.4.11"] = [
    name: "hwSecStatFragSessBelowThreshold",
    fields: ["hwSecStatTrapSlot", "hwSecStatTrapCPU", "hwSecStatFragSessCount", "hwSecStatFragSessThreshold"],
    fieldOids: ["hwSecStatTrapSlot": "1.3.6.1.4.1.2011.6.122.15.3.1.2", "hwSecStatTrapCPU": "1.3.6.1.4.1.2011.6.122.15.3.1.3", "hwSecStatFragSessCount": "1.3.6.1.4.1.2011.6.122.15.3.1.29", "hwSecStatFragSessThreshold": "1.3.6.1.4.1.2011.6.122.15.3.1.30"]
]

// --- hwSecStatFrag6SessOverThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.122.15.3.4.12
// Fields: hwSecStatTrapSlot, hwSecStatTrapCPU, hwSecStatFrag6SessCount, hwSecStatFrag6SessThreshold
// Description: The number of used IPv6 frag sessions exceeded the threshold.
trapMap["1.3.6.1.4.1.2011.6.122.15.3.4.12"] = [
    name: "hwSecStatFrag6SessOverThreshold",
    fields: ["hwSecStatTrapSlot", "hwSecStatTrapCPU", "hwSecStatFrag6SessCount", "hwSecStatFrag6SessThreshold"],
    fieldOids: ["hwSecStatTrapSlot": "1.3.6.1.4.1.2011.6.122.15.3.1.2", "hwSecStatTrapCPU": "1.3.6.1.4.1.2011.6.122.15.3.1.3", "hwSecStatFrag6SessCount": "1.3.6.1.4.1.2011.6.122.15.3.1.31", "hwSecStatFrag6SessThreshold": "1.3.6.1.4.1.2011.6.122.15.3.1.32"]
]

// --- hwSecStatFrag6SessBelowThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.122.15.3.4.13
// Fields: hwSecStatTrapSlot, hwSecStatTrapCPU, hwSecStatFrag6SessCount, hwSecStatFrag6SessThreshold
// Description: The number of used of IPv6 frag sessions fell below the threshold.
trapMap["1.3.6.1.4.1.2011.6.122.15.3.4.13"] = [
    name: "hwSecStatFrag6SessBelowThreshold",
    fields: ["hwSecStatTrapSlot", "hwSecStatTrapCPU", "hwSecStatFrag6SessCount", "hwSecStatFrag6SessThreshold"],
    fieldOids: ["hwSecStatTrapSlot": "1.3.6.1.4.1.2011.6.122.15.3.1.2", "hwSecStatTrapCPU": "1.3.6.1.4.1.2011.6.122.15.3.1.3", "hwSecStatFrag6SessCount": "1.3.6.1.4.1.2011.6.122.15.3.1.31", "hwSecStatFrag6SessThreshold": "1.3.6.1.4.1.2011.6.122.15.3.1.32"]
]

// --- hwSecStatSessCreateRateSuddenChangeTrapOverThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.122.15.3.4.14
// Fields: hwSecStatTrapSlot, hwSecStatTrapCPU, hwSecStatSessCreateRateSuddenChangeLastRate, hwSecStatSessCreateRateSuddenChangeCurrRate, hwSecStatSessCreateRateSuddenChangeRatio, hwSecStatSessCreateRateSuddenChangeRatioThreshold
// Description: The ratio of suddenly changed sessions create rate exceeded the threshold.
trapMap["1.3.6.1.4.1.2011.6.122.15.3.4.14"] = [
    name: "hwSecStatSessCreateRateSuddenChangeTrapOverThreshold",
    fields: ["hwSecStatTrapSlot", "hwSecStatTrapCPU", "hwSecStatSessCreateRateSuddenChangeLastRate", "hwSecStatSessCreateRateSuddenChangeCurrRate", "hwSecStatSessCreateRateSuddenChangeRatio", "hwSecStatSessCreateRateSuddenChangeRatioThreshold"],
    fieldOids: ["hwSecStatTrapSlot": "1.3.6.1.4.1.2011.6.122.15.3.1.2", "hwSecStatTrapCPU": "1.3.6.1.4.1.2011.6.122.15.3.1.3", "hwSecStatSessCreateRateSuddenChangeLastRate": "1.3.6.1.4.1.2011.6.122.15.3.1.48", "hwSecStatSessCreateRateSuddenChangeCurrRate": "1.3.6.1.4.1.2011.6.122.15.3.1.49", "hwSecStatSessCreateRateSuddenChangeRatio": "1.3.6.1.4.1.2011.6.122.15.3.1.50", "hwSecStatSessCreateRateSuddenChangeRatioThreshold": "1.3.6.1.4.1.2011.6.122.15.3.1.51"]
]

// --- hwSecStatFrag4CachePktOverThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.122.15.3.4.15
// Fields: hwSecStatTrapSlot, hwSecStatTrapCPU, hwSecStatFrag4CachePktCount, hwSecStatFrag4CachePktThreshold
// Description: The total number of IPv4 fragment cache packet exceeded threshold
trapMap["1.3.6.1.4.1.2011.6.122.15.3.4.15"] = [
    name: "hwSecStatFrag4CachePktOverThreshold",
    fields: ["hwSecStatTrapSlot", "hwSecStatTrapCPU", "hwSecStatFrag4CachePktCount", "hwSecStatFrag4CachePktThreshold"],
    fieldOids: ["hwSecStatTrapSlot": "1.3.6.1.4.1.2011.6.122.15.3.1.2", "hwSecStatTrapCPU": "1.3.6.1.4.1.2011.6.122.15.3.1.3", "hwSecStatFrag4CachePktCount": "1.3.6.1.4.1.2011.6.122.15.3.1.62", "hwSecStatFrag4CachePktThreshold": "1.3.6.1.4.1.2011.6.122.15.3.1.63"]
]

// --- hwSecStatFrag4CachePktBelowThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.122.15.3.4.16
// Fields: hwSecStatTrapSlot, hwSecStatTrapCPU, hwSecStatFrag4CachePktCount, hwSecStatFrag4CachePktThreshold
// Description: The total number of IPv4 fragment cache packet fell below the threshold.
trapMap["1.3.6.1.4.1.2011.6.122.15.3.4.16"] = [
    name: "hwSecStatFrag4CachePktBelowThreshold",
    fields: ["hwSecStatTrapSlot", "hwSecStatTrapCPU", "hwSecStatFrag4CachePktCount", "hwSecStatFrag4CachePktThreshold"],
    fieldOids: ["hwSecStatTrapSlot": "1.3.6.1.4.1.2011.6.122.15.3.1.2", "hwSecStatTrapCPU": "1.3.6.1.4.1.2011.6.122.15.3.1.3", "hwSecStatFrag4CachePktCount": "1.3.6.1.4.1.2011.6.122.15.3.1.62", "hwSecStatFrag4CachePktThreshold": "1.3.6.1.4.1.2011.6.122.15.3.1.63"]
]

// --- hwSecStatFrag6CachePktOverThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.122.15.3.4.17
// Fields: hwSecStatTrapSlot, hwSecStatTrapCPU, hwSecStatFrag6CachePktCount, hwSecStatFrag6CachePktThreshold
// Description: The total number of IPv6 fragment cache packet exceeded threshold.
trapMap["1.3.6.1.4.1.2011.6.122.15.3.4.17"] = [
    name: "hwSecStatFrag6CachePktOverThreshold",
    fields: ["hwSecStatTrapSlot", "hwSecStatTrapCPU", "hwSecStatFrag6CachePktCount", "hwSecStatFrag6CachePktThreshold"],
    fieldOids: ["hwSecStatTrapSlot": "1.3.6.1.4.1.2011.6.122.15.3.1.2", "hwSecStatTrapCPU": "1.3.6.1.4.1.2011.6.122.15.3.1.3", "hwSecStatFrag6CachePktCount": "1.3.6.1.4.1.2011.6.122.15.3.1.64", "hwSecStatFrag6CachePktThreshold": "1.3.6.1.4.1.2011.6.122.15.3.1.65"]
]

// --- hwSecStatFrag6CachePktBelowThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.122.15.3.4.18
// Fields: hwSecStatTrapSlot, hwSecStatTrapCPU, hwSecStatFrag6CachePktCount, hwSecStatFrag6CachePktThreshold
// Description: The total number of IPv6 fragment cache packet fell below the threshold.
trapMap["1.3.6.1.4.1.2011.6.122.15.3.4.18"] = [
    name: "hwSecStatFrag6CachePktBelowThreshold",
    fields: ["hwSecStatTrapSlot", "hwSecStatTrapCPU", "hwSecStatFrag6CachePktCount", "hwSecStatFrag6CachePktThreshold"],
    fieldOids: ["hwSecStatTrapSlot": "1.3.6.1.4.1.2011.6.122.15.3.1.2", "hwSecStatTrapCPU": "1.3.6.1.4.1.2011.6.122.15.3.1.3", "hwSecStatFrag6CachePktCount": "1.3.6.1.4.1.2011.6.122.15.3.1.64", "hwSecStatFrag6CachePktThreshold": "1.3.6.1.4.1.2011.6.122.15.3.1.65"]
]

// --- hwSecStatFrag4MisorderPktOverThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.122.15.3.4.19
// Fields: hwSecStatTrapSlot, hwSecStatTrapCPU, hwSecStatFrag4CachePktCount, hwSecStatFrag4CachePktThreshold
// Description: The number of disordered IPv4 fragmented packets exceeds the threshold.
trapMap["1.3.6.1.4.1.2011.6.122.15.3.4.19"] = [
    name: "hwSecStatFrag4MisorderPktOverThreshold",
    fields: ["hwSecStatTrapSlot", "hwSecStatTrapCPU", "hwSecStatFrag4CachePktCount", "hwSecStatFrag4CachePktThreshold"],
    fieldOids: ["hwSecStatTrapSlot": "1.3.6.1.4.1.2011.6.122.15.3.1.2", "hwSecStatTrapCPU": "1.3.6.1.4.1.2011.6.122.15.3.1.3", "hwSecStatFrag4CachePktCount": "1.3.6.1.4.1.2011.6.122.15.3.1.62", "hwSecStatFrag4CachePktThreshold": "1.3.6.1.4.1.2011.6.122.15.3.1.63"]
]

// --- hwSecStatFrag4MisorderPktBelowThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.122.15.3.4.20
// Fields: hwSecStatTrapSlot, hwSecStatTrapCPU, hwSecStatFrag4CachePktCount, hwSecStatFrag4CachePktThreshold
// Description: The number of disordered IPv4 fragmented packets is lower than the threshold..
trapMap["1.3.6.1.4.1.2011.6.122.15.3.4.20"] = [
    name: "hwSecStatFrag4MisorderPktBelowThreshold",
    fields: ["hwSecStatTrapSlot", "hwSecStatTrapCPU", "hwSecStatFrag4CachePktCount", "hwSecStatFrag4CachePktThreshold"],
    fieldOids: ["hwSecStatTrapSlot": "1.3.6.1.4.1.2011.6.122.15.3.1.2", "hwSecStatTrapCPU": "1.3.6.1.4.1.2011.6.122.15.3.1.3", "hwSecStatFrag4CachePktCount": "1.3.6.1.4.1.2011.6.122.15.3.1.62", "hwSecStatFrag4CachePktThreshold": "1.3.6.1.4.1.2011.6.122.15.3.1.63"]
]

// --- hwSecStatFrag6MisorderPktOverThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.122.15.3.4.21
// Fields: hwSecStatTrapSlot, hwSecStatTrapCPU, hwSecStatFrag6CachePktCount, hwSecStatFrag6CachePktThreshold
// Description: The number of disordered IPv6 fragmented packets exceeds the threshold.
trapMap["1.3.6.1.4.1.2011.6.122.15.3.4.21"] = [
    name: "hwSecStatFrag6MisorderPktOverThreshold",
    fields: ["hwSecStatTrapSlot", "hwSecStatTrapCPU", "hwSecStatFrag6CachePktCount", "hwSecStatFrag6CachePktThreshold"],
    fieldOids: ["hwSecStatTrapSlot": "1.3.6.1.4.1.2011.6.122.15.3.1.2", "hwSecStatTrapCPU": "1.3.6.1.4.1.2011.6.122.15.3.1.3", "hwSecStatFrag6CachePktCount": "1.3.6.1.4.1.2011.6.122.15.3.1.64", "hwSecStatFrag6CachePktThreshold": "1.3.6.1.4.1.2011.6.122.15.3.1.65"]
]

// --- hwSecStatFrag6MisorderPktBelowThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.122.15.3.4.22
// Fields: hwSecStatTrapSlot, hwSecStatTrapCPU, hwSecStatFrag6CachePktCount, hwSecStatFrag6CachePktThreshold
// Description: The number of disordered IPv6 fragmented packets is lower than the threshold.
trapMap["1.3.6.1.4.1.2011.6.122.15.3.4.22"] = [
    name: "hwSecStatFrag6MisorderPktBelowThreshold",
    fields: ["hwSecStatTrapSlot", "hwSecStatTrapCPU", "hwSecStatFrag6CachePktCount", "hwSecStatFrag6CachePktThreshold"],
    fieldOids: ["hwSecStatTrapSlot": "1.3.6.1.4.1.2011.6.122.15.3.1.2", "hwSecStatTrapCPU": "1.3.6.1.4.1.2011.6.122.15.3.1.3", "hwSecStatFrag6CachePktCount": "1.3.6.1.4.1.2011.6.122.15.3.1.64", "hwSecStatFrag6CachePktThreshold": "1.3.6.1.4.1.2011.6.122.15.3.1.65"]
]

// --- hwSecStatFrag4ElephantFlowDetect (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.122.15.3.4.23
// Fields: hwSecStatTrapSlot, hwSecStatTrapCPU, hwSecStatFrag4ElephantFlowNum
// Description: IPv4 fragment elephant flows are detected.
trapMap["1.3.6.1.4.1.2011.6.122.15.3.4.23"] = [
    name: "hwSecStatFrag4ElephantFlowDetect",
    fields: ["hwSecStatTrapSlot", "hwSecStatTrapCPU", "hwSecStatFrag4ElephantFlowNum"],
    fieldOids: ["hwSecStatTrapSlot": "1.3.6.1.4.1.2011.6.122.15.3.1.2", "hwSecStatTrapCPU": "1.3.6.1.4.1.2011.6.122.15.3.1.3", "hwSecStatFrag4ElephantFlowNum": "1.3.6.1.4.1.2011.6.122.15.3.1.66"]
]

// --- hwSecStatFrag4ElephantFlowDetectClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.122.15.3.4.24
// Fields: hwSecStatTrapSlot, hwSecStatTrapCPU, hwSecStatFrag4ElephantFlowNum
// Description: IPv4 fragmented elephant flow detection recovery.
trapMap["1.3.6.1.4.1.2011.6.122.15.3.4.24"] = [
    name: "hwSecStatFrag4ElephantFlowDetectClear",
    fields: ["hwSecStatTrapSlot", "hwSecStatTrapCPU", "hwSecStatFrag4ElephantFlowNum"],
    fieldOids: ["hwSecStatTrapSlot": "1.3.6.1.4.1.2011.6.122.15.3.1.2", "hwSecStatTrapCPU": "1.3.6.1.4.1.2011.6.122.15.3.1.3", "hwSecStatFrag4ElephantFlowNum": "1.3.6.1.4.1.2011.6.122.15.3.1.66"]
]

// --- hwSecStatFrag6ElephantFlowDetect (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.122.15.3.4.25
// Fields: hwSecStatTrapSlot, hwSecStatTrapCPU, hwSecStatFrag6ElephantFlowNum
// Description: IPv6 fragment elephant flows are detected.
trapMap["1.3.6.1.4.1.2011.6.122.15.3.4.25"] = [
    name: "hwSecStatFrag6ElephantFlowDetect",
    fields: ["hwSecStatTrapSlot", "hwSecStatTrapCPU", "hwSecStatFrag6ElephantFlowNum"],
    fieldOids: ["hwSecStatTrapSlot": "1.3.6.1.4.1.2011.6.122.15.3.1.2", "hwSecStatTrapCPU": "1.3.6.1.4.1.2011.6.122.15.3.1.3", "hwSecStatFrag6ElephantFlowNum": "1.3.6.1.4.1.2011.6.122.15.3.1.67"]
]

// --- hwSecStatFrag6ElephantFlowDetectClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.122.15.3.4.26
// Fields: hwSecStatTrapSlot, hwSecStatTrapCPU, hwSecStatFrag6ElephantFlowNum
// Description: IPv6 fragmented elephant flow detection recovery.
trapMap["1.3.6.1.4.1.2011.6.122.15.3.4.26"] = [
    name: "hwSecStatFrag6ElephantFlowDetectClear",
    fields: ["hwSecStatTrapSlot", "hwSecStatTrapCPU", "hwSecStatFrag6ElephantFlowNum"],
    fieldOids: ["hwSecStatTrapSlot": "1.3.6.1.4.1.2011.6.122.15.3.1.2", "hwSecStatTrapCPU": "1.3.6.1.4.1.2011.6.122.15.3.1.3", "hwSecStatFrag6ElephantFlowNum": "1.3.6.1.4.1.2011.6.122.15.3.1.67"]
]

// --- hwSecStatSctpMhomeOverThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.122.15.3.4.27
// Fields: hwSecStatTrapSlot, hwSecStatTrapCPU, hwSecStatSctpMhomeCount, hwSecStatSctpMhomeTrapThreshold
// Description: The number of SCTP multihome exceeds the alarm threshold.
trapMap["1.3.6.1.4.1.2011.6.122.15.3.4.27"] = [
    name: "hwSecStatSctpMhomeOverThreshold",
    fields: ["hwSecStatTrapSlot", "hwSecStatTrapCPU", "hwSecStatSctpMhomeCount", "hwSecStatSctpMhomeTrapThreshold"],
    fieldOids: ["hwSecStatTrapSlot": "1.3.6.1.4.1.2011.6.122.15.3.1.2", "hwSecStatTrapCPU": "1.3.6.1.4.1.2011.6.122.15.3.1.3", "hwSecStatSctpMhomeCount": "1.3.6.1.4.1.2011.6.122.15.3.1.68", "hwSecStatSctpMhomeTrapThreshold": "1.3.6.1.4.1.2011.6.122.15.3.1.69"]
]

// --- hwSecStatSctpMhomeBelowThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.122.15.3.4.28
// Fields: hwSecStatTrapSlot, hwSecStatTrapCPU, hwSecStatSctpMhomeCount, hwSecStatSctpMhomeTrapThreshold
// Description: The number of SCTP multihome to be lower than the alarm threshold.
trapMap["1.3.6.1.4.1.2011.6.122.15.3.4.28"] = [
    name: "hwSecStatSctpMhomeBelowThreshold",
    fields: ["hwSecStatTrapSlot", "hwSecStatTrapCPU", "hwSecStatSctpMhomeCount", "hwSecStatSctpMhomeTrapThreshold"],
    fieldOids: ["hwSecStatTrapSlot": "1.3.6.1.4.1.2011.6.122.15.3.1.2", "hwSecStatTrapCPU": "1.3.6.1.4.1.2011.6.122.15.3.1.3", "hwSecStatSctpMhomeCount": "1.3.6.1.4.1.2011.6.122.15.3.1.68", "hwSecStatSctpMhomeTrapThreshold": "1.3.6.1.4.1.2011.6.122.15.3.1.69"]
]

// --- hwSecStatEmergencyFwdTimeoutWarning (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.122.15.3.5.1
// Fields: hwSecStatEmeFwdWarningTime, hwSecStatEmeFwdTotalTime
// Description: The execution time of emergency forwarding reachs 80% of the maximum execution time.
trapMap["1.3.6.1.4.1.2011.6.122.15.3.5.1"] = [
    name: "hwSecStatEmergencyFwdTimeoutWarning",
    fields: ["hwSecStatEmeFwdWarningTime", "hwSecStatEmeFwdTotalTime"],
    fieldOids: ["hwSecStatEmeFwdWarningTime": "1.3.6.1.4.1.2011.6.122.15.3.1.33", "hwSecStatEmeFwdTotalTime": "1.3.6.1.4.1.2011.6.122.15.3.1.34"]
]

// --- hwSecStatEmergencyFwdTimeout (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.122.15.3.5.2
// Fields: hwSecStatEmeFwdTotalTime
// Description: The emergency forwarding function has been disabled.
trapMap["1.3.6.1.4.1.2011.6.122.15.3.5.2"] = [
    name: "hwSecStatEmergencyFwdTimeout",
    fields: ["hwSecStatEmeFwdTotalTime"],
    fieldOids: ["hwSecStatEmeFwdTotalTime": "1.3.6.1.4.1.2011.6.122.15.3.1.34"]
]

// --- hwSecStatEmergencyDefendTimeoutWarning (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.122.15.3.5.3
// Fields: hwSecStatEmeDefendWarningTime, hwSecStatEmeDefendTotalTime
// Description: The execution time of emergency auto-defense reachs 80% of the maximum execution time.
trapMap["1.3.6.1.4.1.2011.6.122.15.3.5.3"] = [
    name: "hwSecStatEmergencyDefendTimeoutWarning",
    fields: ["hwSecStatEmeDefendWarningTime", "hwSecStatEmeDefendTotalTime"],
    fieldOids: ["hwSecStatEmeDefendWarningTime": "1.3.6.1.4.1.2011.6.122.15.3.1.35", "hwSecStatEmeDefendTotalTime": "1.3.6.1.4.1.2011.6.122.15.3.1.36"]
]

// --- hwSecStatEmergencyDefendTimeout (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.122.15.3.5.4
// Fields: hwSecStatEmeDefendTotalTime
// Description: The emergency auto-defense function has been disabled.
trapMap["1.3.6.1.4.1.2011.6.122.15.3.5.4"] = [
    name: "hwSecStatEmergencyDefendTimeout",
    fields: ["hwSecStatEmeDefendTotalTime"],
    fieldOids: ["hwSecStatEmeDefendTotalTime": "1.3.6.1.4.1.2011.6.122.15.3.1.36"]
]

// --- hwSecStatLogHostDown (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.122.15.3.6.1
// Fields: hwSecStatLogHostVsys, hwSecStatLogHostGroupID, hwSecStatLogHostID, hwSecStatLogHostIP, hwSecStatLogHostPort, hwSecStatLogHostOldState, hwSecStatLogHostNewState
// Description: The status of the log host changed to down.
trapMap["1.3.6.1.4.1.2011.6.122.15.3.6.1"] = [
    name: "hwSecStatLogHostDown",
    fields: ["hwSecStatLogHostVsys", "hwSecStatLogHostGroupID", "hwSecStatLogHostID", "hwSecStatLogHostIP", "hwSecStatLogHostPort", "hwSecStatLogHostOldState", "hwSecStatLogHostNewState"],
    fieldOids: ["hwSecStatLogHostVsys": "1.3.6.1.4.1.2011.6.122.15.3.1.41", "hwSecStatLogHostGroupID": "1.3.6.1.4.1.2011.6.122.15.3.1.42", "hwSecStatLogHostID": "1.3.6.1.4.1.2011.6.122.15.3.1.43", "hwSecStatLogHostIP": "1.3.6.1.4.1.2011.6.122.15.3.1.44", "hwSecStatLogHostPort": "1.3.6.1.4.1.2011.6.122.15.3.1.45", "hwSecStatLogHostOldState": "1.3.6.1.4.1.2011.6.122.15.3.1.46", "hwSecStatLogHostNewState": "1.3.6.1.4.1.2011.6.122.15.3.1.47"]
]

// --- hwSecStatLogHostUp (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.122.15.3.6.2
// Fields: hwSecStatLogHostVsys, hwSecStatLogHostGroupID, hwSecStatLogHostID, hwSecStatLogHostIP, hwSecStatLogHostPort, hwSecStatLogHostOldState, hwSecStatLogHostNewState
// Description: The status of the log host changed to up.
trapMap["1.3.6.1.4.1.2011.6.122.15.3.6.2"] = [
    name: "hwSecStatLogHostUp",
    fields: ["hwSecStatLogHostVsys", "hwSecStatLogHostGroupID", "hwSecStatLogHostID", "hwSecStatLogHostIP", "hwSecStatLogHostPort", "hwSecStatLogHostOldState", "hwSecStatLogHostNewState"],
    fieldOids: ["hwSecStatLogHostVsys": "1.3.6.1.4.1.2011.6.122.15.3.1.41", "hwSecStatLogHostGroupID": "1.3.6.1.4.1.2011.6.122.15.3.1.42", "hwSecStatLogHostID": "1.3.6.1.4.1.2011.6.122.15.3.1.43", "hwSecStatLogHostIP": "1.3.6.1.4.1.2011.6.122.15.3.1.44", "hwSecStatLogHostPort": "1.3.6.1.4.1.2011.6.122.15.3.1.45", "hwSecStatLogHostOldState": "1.3.6.1.4.1.2011.6.122.15.3.1.46", "hwSecStatLogHostNewState": "1.3.6.1.4.1.2011.6.122.15.3.1.47"]
]

// --- hwSecStatFbypassStart (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.122.15.3.7.1
// Fields: hwSecStatFypassModName, hwSecStatFypassLevel, hwSecStatFypassSlot, hwSecStatFypassCpu
// Description: The module started relegation.
trapMap["1.3.6.1.4.1.2011.6.122.15.3.7.1"] = [
    name: "hwSecStatFbypassStart",
    fields: ["hwSecStatFypassModName", "hwSecStatFypassLevel", "hwSecStatFypassSlot", "hwSecStatFypassCpu"],
    fieldOids: ["hwSecStatFypassModName": "1.3.6.1.4.1.2011.6.122.15.3.1.52", "hwSecStatFypassLevel": "1.3.6.1.4.1.2011.6.122.15.3.1.53", "hwSecStatFypassSlot": "1.3.6.1.4.1.2011.6.122.15.3.1.54", "hwSecStatFypassCpu": "1.3.6.1.4.1.2011.6.122.15.3.1.55"]
]

// --- hwSecStatFbypassEnd (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.122.15.3.7.2
// Fields: hwSecStatFypassModName, hwSecStatFypassSlot, hwSecStatFypassCpu
// Description: The module ended relegation.
trapMap["1.3.6.1.4.1.2011.6.122.15.3.7.2"] = [
    name: "hwSecStatFbypassEnd",
    fields: ["hwSecStatFypassModName", "hwSecStatFypassSlot", "hwSecStatFypassCpu"],
    fieldOids: ["hwSecStatFypassModName": "1.3.6.1.4.1.2011.6.122.15.3.1.52", "hwSecStatFypassSlot": "1.3.6.1.4.1.2011.6.122.15.3.1.54", "hwSecStatFypassCpu": "1.3.6.1.4.1.2011.6.122.15.3.1.55"]
]

// --- hwSecStatDynamicResourceOverThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.122.15.3.8.1
// Fields: hwSecStatDynamicResourceName, hwSecStatDynamicResourceSlot, hwSecStatDynamicResourceCpu, hwSecStatDynamicResourceCurrentNum, hwSecStatDynamicResourceThreshold
// Description: The number of dynamic-resource exceeded the alarm threshold.
trapMap["1.3.6.1.4.1.2011.6.122.15.3.8.1"] = [
    name: "hwSecStatDynamicResourceOverThreshold",
    fields: ["hwSecStatDynamicResourceName", "hwSecStatDynamicResourceSlot", "hwSecStatDynamicResourceCpu", "hwSecStatDynamicResourceCurrentNum", "hwSecStatDynamicResourceThreshold"],
    fieldOids: ["hwSecStatDynamicResourceName": "1.3.6.1.4.1.2011.6.122.15.3.1.56", "hwSecStatDynamicResourceSlot": "1.3.6.1.4.1.2011.6.122.15.3.1.57", "hwSecStatDynamicResourceCpu": "1.3.6.1.4.1.2011.6.122.15.3.1.58", "hwSecStatDynamicResourceCurrentNum": "1.3.6.1.4.1.2011.6.122.15.3.1.59", "hwSecStatDynamicResourceThreshold": "1.3.6.1.4.1.2011.6.122.15.3.1.60"]
]

// --- hwSecStatDynamicResourceBelowThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.122.15.3.8.2
// Fields: hwSecStatDynamicResourceName, hwSecStatDynamicResourceSlot, hwSecStatDynamicResourceCpu, hwSecStatDynamicResourceCurrentNum, hwSecStatDynamicResourceThreshold
// Description: The number of dynamic-resource below the alarm threshold.
trapMap["1.3.6.1.4.1.2011.6.122.15.3.8.2"] = [
    name: "hwSecStatDynamicResourceBelowThreshold",
    fields: ["hwSecStatDynamicResourceName", "hwSecStatDynamicResourceSlot", "hwSecStatDynamicResourceCpu", "hwSecStatDynamicResourceCurrentNum", "hwSecStatDynamicResourceThreshold"],
    fieldOids: ["hwSecStatDynamicResourceName": "1.3.6.1.4.1.2011.6.122.15.3.1.56", "hwSecStatDynamicResourceSlot": "1.3.6.1.4.1.2011.6.122.15.3.1.57", "hwSecStatDynamicResourceCpu": "1.3.6.1.4.1.2011.6.122.15.3.1.58", "hwSecStatDynamicResourceCurrentNum": "1.3.6.1.4.1.2011.6.122.15.3.1.59", "hwSecStatDynamicResourceThreshold": "1.3.6.1.4.1.2011.6.122.15.3.1.60"]
]

// --- hwSecStatDevDynResOverThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.122.15.3.9.1
// Fields: hwSecStatDynamicResourceName, hwSecStatDynamicResourceCurrentNum, hwSecStatDynamicResourceThreshold
// Description: The number of dynamic resources on the device exceeds the threshold.
trapMap["1.3.6.1.4.1.2011.6.122.15.3.9.1"] = [
    name: "hwSecStatDevDynResOverThreshold",
    fields: ["hwSecStatDynamicResourceName", "hwSecStatDynamicResourceCurrentNum", "hwSecStatDynamicResourceThreshold"],
    fieldOids: ["hwSecStatDynamicResourceName": "1.3.6.1.4.1.2011.6.122.15.3.1.56", "hwSecStatDynamicResourceCurrentNum": "1.3.6.1.4.1.2011.6.122.15.3.1.59", "hwSecStatDynamicResourceThreshold": "1.3.6.1.4.1.2011.6.122.15.3.1.60"]
]

// --- hwSecStatDevDynResBelowThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.122.15.3.9.2
// Fields: hwSecStatDynamicResourceName, hwSecStatDynamicResourceCurrentNum, hwSecStatDynamicResourceThreshold
// Description: The number of dynamic resources on the device below the threshold.
trapMap["1.3.6.1.4.1.2011.6.122.15.3.9.2"] = [
    name: "hwSecStatDevDynResBelowThreshold",
    fields: ["hwSecStatDynamicResourceName", "hwSecStatDynamicResourceCurrentNum", "hwSecStatDynamicResourceThreshold"],
    fieldOids: ["hwSecStatDynamicResourceName": "1.3.6.1.4.1.2011.6.122.15.3.1.56", "hwSecStatDynamicResourceCurrentNum": "1.3.6.1.4.1.2011.6.122.15.3.1.59", "hwSecStatDynamicResourceThreshold": "1.3.6.1.4.1.2011.6.122.15.3.1.60"]
]

// ===== Parsing logic =====

// Set to true to enable diagnostic logging for this MIB parser
DEBUG = false

LOG_PREFIX = "[HUAWEI-SECURITY-STAT-MIB]"
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
