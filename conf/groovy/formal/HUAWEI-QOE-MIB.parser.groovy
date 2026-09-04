/**
 * Auto-generated from HUAWEI-QOE-MIB.mib
 * Generated: 2026-08-24T18:28:30.801960200
 * Traps/Notifications (18): hwEmdiRtpLrOverThreshold, hwEmdiRtpLrOverThresholdResume, hwEmdiRtpSerOverThreshold, hwEmdiRtpSerOverThresholdResume, hwEmdiRtpLrOverThresholdSlot, hwEmdiRtpLrOverThresholdSlotResume, hwEmdiOutRtpLrOverThreshold, hwEmdiOutRtpLrOverThresholdResume, hwEmdiOutRtpSerOverThreshold, hwEmdiOutRtpSerOverThresholdResume, hwEmdiBierRtpLrOverThreshold, hwEmdiBierRtpLrOverThresholdResume, hwEmdiBierRtpSerOverThreshold, hwEmdiBierRtpSerOverThresholdResume, hwEmdiBierOutRtpLrOverThreshold, hwEmdiBierOutRtpLrOverThresholdResume, hwEmdiBierOutRtpSerOverThreshold, hwEmdiBierOutRtpSerOverThresholdResume
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

// --- hwEmdiRtpLrOverThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.349.2.1.1
// Fields: hwEmdiChannelName, hwEmdiChannelSourceAddress, hwEmdiChannelGroupAddress, hwEmdiRtpLrThreshold, hwEmdiRtpLrValue
// Description: This trap indicates that RTP-LR of a multicast channel exceeds the threshold in some continuous monitor period.
trapMap["1.3.6.1.4.1.2011.5.25.349.2.1.1"] = [
    name: "hwEmdiRtpLrOverThreshold",
    fields: ["hwEmdiChannelName", "hwEmdiChannelSourceAddress", "hwEmdiChannelGroupAddress", "hwEmdiRtpLrThreshold", "hwEmdiRtpLrValue"],
    fieldOids: ["hwEmdiChannelName": "1.3.6.1.4.1.2011.5.25.349.1.1.1.1", "hwEmdiChannelSourceAddress": "1.3.6.1.4.1.2011.5.25.349.1.1.1.2", "hwEmdiChannelGroupAddress": "1.3.6.1.4.1.2011.5.25.349.1.1.1.3", "hwEmdiRtpLrThreshold": "1.3.6.1.4.1.2011.5.25.349.1.1.1.4", "hwEmdiRtpLrValue": "1.3.6.1.4.1.2011.5.25.349.1.1.1.5"]
]

// --- hwEmdiRtpLrOverThresholdResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.349.2.1.2
// Fields: hwEmdiChannelName, hwEmdiChannelSourceAddress, hwEmdiChannelGroupAddress, hwEmdiRtpLrThreshold, hwEmdiRtpLrValue
// Description: This trap indicates that RTP-LR of a multicast channel is lower than the threshold in some continuous monitor period.
trapMap["1.3.6.1.4.1.2011.5.25.349.2.1.2"] = [
    name: "hwEmdiRtpLrOverThresholdResume",
    fields: ["hwEmdiChannelName", "hwEmdiChannelSourceAddress", "hwEmdiChannelGroupAddress", "hwEmdiRtpLrThreshold", "hwEmdiRtpLrValue"],
    fieldOids: ["hwEmdiChannelName": "1.3.6.1.4.1.2011.5.25.349.1.1.1.1", "hwEmdiChannelSourceAddress": "1.3.6.1.4.1.2011.5.25.349.1.1.1.2", "hwEmdiChannelGroupAddress": "1.3.6.1.4.1.2011.5.25.349.1.1.1.3", "hwEmdiRtpLrThreshold": "1.3.6.1.4.1.2011.5.25.349.1.1.1.4", "hwEmdiRtpLrValue": "1.3.6.1.4.1.2011.5.25.349.1.1.1.5"]
]

// --- hwEmdiRtpSerOverThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.349.2.1.3
// Fields: hwEmdiChannelName, hwEmdiChannelSourceAddress, hwEmdiChannelGroupAddress, hwEmdiRtpSerThreshold, hwEmdiRtpSerValue
// Description: This trap indicates that RTP-SER of a multicast channel exceeds the threshold in some continuous monitor period.
trapMap["1.3.6.1.4.1.2011.5.25.349.2.1.3"] = [
    name: "hwEmdiRtpSerOverThreshold",
    fields: ["hwEmdiChannelName", "hwEmdiChannelSourceAddress", "hwEmdiChannelGroupAddress", "hwEmdiRtpSerThreshold", "hwEmdiRtpSerValue"],
    fieldOids: ["hwEmdiChannelName": "1.3.6.1.4.1.2011.5.25.349.1.1.1.1", "hwEmdiChannelSourceAddress": "1.3.6.1.4.1.2011.5.25.349.1.1.1.2", "hwEmdiChannelGroupAddress": "1.3.6.1.4.1.2011.5.25.349.1.1.1.3", "hwEmdiRtpSerThreshold": "1.3.6.1.4.1.2011.5.25.349.1.1.1.6", "hwEmdiRtpSerValue": "1.3.6.1.4.1.2011.5.25.349.1.1.1.7"]
]

// --- hwEmdiRtpSerOverThresholdResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.349.2.1.4
// Fields: hwEmdiChannelName, hwEmdiChannelSourceAddress, hwEmdiChannelGroupAddress, hwEmdiRtpSerThreshold, hwEmdiRtpSerValue
// Description: This trap indicates that RTP-SER of a multicast channel is lower than the threshold in some continuous monitor period.
trapMap["1.3.6.1.4.1.2011.5.25.349.2.1.4"] = [
    name: "hwEmdiRtpSerOverThresholdResume",
    fields: ["hwEmdiChannelName", "hwEmdiChannelSourceAddress", "hwEmdiChannelGroupAddress", "hwEmdiRtpSerThreshold", "hwEmdiRtpSerValue"],
    fieldOids: ["hwEmdiChannelName": "1.3.6.1.4.1.2011.5.25.349.1.1.1.1", "hwEmdiChannelSourceAddress": "1.3.6.1.4.1.2011.5.25.349.1.1.1.2", "hwEmdiChannelGroupAddress": "1.3.6.1.4.1.2011.5.25.349.1.1.1.3", "hwEmdiRtpSerThreshold": "1.3.6.1.4.1.2011.5.25.349.1.1.1.6", "hwEmdiRtpSerValue": "1.3.6.1.4.1.2011.5.25.349.1.1.1.7"]
]

// --- hwEmdiRtpLrOverThresholdSlot (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.349.2.1.7
// Fields: hwEmdiChannelSlot
// Description: The packet loss rate of a multicast channel exceeded the alarm threshold in three of five detection periods.
trapMap["1.3.6.1.4.1.2011.5.25.349.2.1.7"] = [
    name: "hwEmdiRtpLrOverThresholdSlot",
    fields: ["hwEmdiChannelSlot"],
    fieldOids: ["hwEmdiChannelSlot": "1.3.6.1.4.1.2011.5.25.349.1.1.1.8"]
]

// --- hwEmdiRtpLrOverThresholdSlotResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.349.2.1.8
// Fields: hwEmdiChannelSlot
// Description: The packet loss rate of a multicast channel belowed the alarm threshold in fifteen detection periods.
trapMap["1.3.6.1.4.1.2011.5.25.349.2.1.8"] = [
    name: "hwEmdiRtpLrOverThresholdSlotResume",
    fields: ["hwEmdiChannelSlot"],
    fieldOids: ["hwEmdiChannelSlot": "1.3.6.1.4.1.2011.5.25.349.1.1.1.8"]
]

// --- hwEmdiOutRtpLrOverThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.349.2.1.9
// Fields: hwEmdiChannelName, hwEmdiChannelSourceAddress, hwEmdiChannelGroupAddress, hwEmdiRtpLrThreshold, hwEmdiRtpLrValue, hwEmdiChannelSlot, hwEmdiChannelInterface
// Description: This trap indicates that outbound RTP-LR of a multicast channel exceeds the threshold in some continuous monitor period.
trapMap["1.3.6.1.4.1.2011.5.25.349.2.1.9"] = [
    name: "hwEmdiOutRtpLrOverThreshold",
    fields: ["hwEmdiChannelName", "hwEmdiChannelSourceAddress", "hwEmdiChannelGroupAddress", "hwEmdiRtpLrThreshold", "hwEmdiRtpLrValue", "hwEmdiChannelSlot", "hwEmdiChannelInterface"],
    fieldOids: ["hwEmdiChannelName": "1.3.6.1.4.1.2011.5.25.349.1.1.1.1", "hwEmdiChannelSourceAddress": "1.3.6.1.4.1.2011.5.25.349.1.1.1.2", "hwEmdiChannelGroupAddress": "1.3.6.1.4.1.2011.5.25.349.1.1.1.3", "hwEmdiRtpLrThreshold": "1.3.6.1.4.1.2011.5.25.349.1.1.1.4", "hwEmdiRtpLrValue": "1.3.6.1.4.1.2011.5.25.349.1.1.1.5", "hwEmdiChannelSlot": "1.3.6.1.4.1.2011.5.25.349.1.1.1.8", "hwEmdiChannelInterface": "1.3.6.1.4.1.2011.5.25.349.1.1.1.9"]
]

// --- hwEmdiOutRtpLrOverThresholdResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.349.2.1.10
// Fields: hwEmdiChannelName, hwEmdiChannelSourceAddress, hwEmdiChannelGroupAddress, hwEmdiRtpLrThreshold, hwEmdiRtpLrValue, hwEmdiChannelSlot, hwEmdiChannelInterface
// Description: This trap indicates that outbound RTP-LR of a multicast channel is lower than the threshold in some continuous monitor period.
trapMap["1.3.6.1.4.1.2011.5.25.349.2.1.10"] = [
    name: "hwEmdiOutRtpLrOverThresholdResume",
    fields: ["hwEmdiChannelName", "hwEmdiChannelSourceAddress", "hwEmdiChannelGroupAddress", "hwEmdiRtpLrThreshold", "hwEmdiRtpLrValue", "hwEmdiChannelSlot", "hwEmdiChannelInterface"],
    fieldOids: ["hwEmdiChannelName": "1.3.6.1.4.1.2011.5.25.349.1.1.1.1", "hwEmdiChannelSourceAddress": "1.3.6.1.4.1.2011.5.25.349.1.1.1.2", "hwEmdiChannelGroupAddress": "1.3.6.1.4.1.2011.5.25.349.1.1.1.3", "hwEmdiRtpLrThreshold": "1.3.6.1.4.1.2011.5.25.349.1.1.1.4", "hwEmdiRtpLrValue": "1.3.6.1.4.1.2011.5.25.349.1.1.1.5", "hwEmdiChannelSlot": "1.3.6.1.4.1.2011.5.25.349.1.1.1.8", "hwEmdiChannelInterface": "1.3.6.1.4.1.2011.5.25.349.1.1.1.9"]
]

// --- hwEmdiOutRtpSerOverThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.349.2.1.11
// Fields: hwEmdiChannelName, hwEmdiChannelSourceAddress, hwEmdiChannelGroupAddress, hwEmdiRtpSerThreshold, hwEmdiRtpSerValue, hwEmdiChannelSlot, hwEmdiChannelInterface
// Description: This trap indicates that outbound RTP-SER of a multicast channel exceeds the threshold in some continuous monitor period.
trapMap["1.3.6.1.4.1.2011.5.25.349.2.1.11"] = [
    name: "hwEmdiOutRtpSerOverThreshold",
    fields: ["hwEmdiChannelName", "hwEmdiChannelSourceAddress", "hwEmdiChannelGroupAddress", "hwEmdiRtpSerThreshold", "hwEmdiRtpSerValue", "hwEmdiChannelSlot", "hwEmdiChannelInterface"],
    fieldOids: ["hwEmdiChannelName": "1.3.6.1.4.1.2011.5.25.349.1.1.1.1", "hwEmdiChannelSourceAddress": "1.3.6.1.4.1.2011.5.25.349.1.1.1.2", "hwEmdiChannelGroupAddress": "1.3.6.1.4.1.2011.5.25.349.1.1.1.3", "hwEmdiRtpSerThreshold": "1.3.6.1.4.1.2011.5.25.349.1.1.1.6", "hwEmdiRtpSerValue": "1.3.6.1.4.1.2011.5.25.349.1.1.1.7", "hwEmdiChannelSlot": "1.3.6.1.4.1.2011.5.25.349.1.1.1.8", "hwEmdiChannelInterface": "1.3.6.1.4.1.2011.5.25.349.1.1.1.9"]
]

// --- hwEmdiOutRtpSerOverThresholdResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.349.2.1.12
// Fields: hwEmdiChannelName, hwEmdiChannelSourceAddress, hwEmdiChannelGroupAddress, hwEmdiRtpSerThreshold, hwEmdiRtpSerValue, hwEmdiChannelSlot, hwEmdiChannelInterface
// Description: This trap indicates that outbound RTP-SER of a multicast channel is lower than the threshold in some continuous monitor period.
trapMap["1.3.6.1.4.1.2011.5.25.349.2.1.12"] = [
    name: "hwEmdiOutRtpSerOverThresholdResume",
    fields: ["hwEmdiChannelName", "hwEmdiChannelSourceAddress", "hwEmdiChannelGroupAddress", "hwEmdiRtpSerThreshold", "hwEmdiRtpSerValue", "hwEmdiChannelSlot", "hwEmdiChannelInterface"],
    fieldOids: ["hwEmdiChannelName": "1.3.6.1.4.1.2011.5.25.349.1.1.1.1", "hwEmdiChannelSourceAddress": "1.3.6.1.4.1.2011.5.25.349.1.1.1.2", "hwEmdiChannelGroupAddress": "1.3.6.1.4.1.2011.5.25.349.1.1.1.3", "hwEmdiRtpSerThreshold": "1.3.6.1.4.1.2011.5.25.349.1.1.1.6", "hwEmdiRtpSerValue": "1.3.6.1.4.1.2011.5.25.349.1.1.1.7", "hwEmdiChannelSlot": "1.3.6.1.4.1.2011.5.25.349.1.1.1.8", "hwEmdiChannelInterface": "1.3.6.1.4.1.2011.5.25.349.1.1.1.9"]
]

// --- hwEmdiBierRtpLrOverThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.349.2.1.13
// Fields: hwEmdiChannelSourceAddress, hwEmdiChannelGroupAddress, hwEmdiVpnLabel, hwEmdiBfirId, hwEmdiSubDomain, hwEmdiBsl, hwEmdiSi, hwEmdiRtpLrThreshold, hwEmdiRtpLrValue
// Description: This trap indicates that RTP-LR of a BIER multicast channel exceeds the threshold in some continuous monitor period.
trapMap["1.3.6.1.4.1.2011.5.25.349.2.1.13"] = [
    name: "hwEmdiBierRtpLrOverThreshold",
    fields: ["hwEmdiChannelSourceAddress", "hwEmdiChannelGroupAddress", "hwEmdiVpnLabel", "hwEmdiBfirId", "hwEmdiSubDomain", "hwEmdiBsl", "hwEmdiSi", "hwEmdiRtpLrThreshold", "hwEmdiRtpLrValue"],
    fieldOids: ["hwEmdiChannelSourceAddress": "1.3.6.1.4.1.2011.5.25.349.1.1.1.2", "hwEmdiChannelGroupAddress": "1.3.6.1.4.1.2011.5.25.349.1.1.1.3", "hwEmdiVpnLabel": "1.3.6.1.4.1.2011.5.25.349.1.1.1.10", "hwEmdiBfirId": "1.3.6.1.4.1.2011.5.25.349.1.1.1.11", "hwEmdiSubDomain": "1.3.6.1.4.1.2011.5.25.349.1.1.1.12", "hwEmdiBsl": "1.3.6.1.4.1.2011.5.25.349.1.1.1.13", "hwEmdiSi": "1.3.6.1.4.1.2011.5.25.349.1.1.1.14", "hwEmdiRtpLrThreshold": "1.3.6.1.4.1.2011.5.25.349.1.1.1.4", "hwEmdiRtpLrValue": "1.3.6.1.4.1.2011.5.25.349.1.1.1.5"]
]

// --- hwEmdiBierRtpLrOverThresholdResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.349.2.1.14
// Fields: hwEmdiChannelSourceAddress, hwEmdiChannelGroupAddress, hwEmdiVpnLabel, hwEmdiBfirId, hwEmdiSubDomain, hwEmdiBsl, hwEmdiSi, hwEmdiRtpLrThreshold, hwEmdiRtpLrValue
// Description: This trap indicates that RTP-LR of a BIER multicast channel is lower than the threshold in some continuous monitor period.
trapMap["1.3.6.1.4.1.2011.5.25.349.2.1.14"] = [
    name: "hwEmdiBierRtpLrOverThresholdResume",
    fields: ["hwEmdiChannelSourceAddress", "hwEmdiChannelGroupAddress", "hwEmdiVpnLabel", "hwEmdiBfirId", "hwEmdiSubDomain", "hwEmdiBsl", "hwEmdiSi", "hwEmdiRtpLrThreshold", "hwEmdiRtpLrValue"],
    fieldOids: ["hwEmdiChannelSourceAddress": "1.3.6.1.4.1.2011.5.25.349.1.1.1.2", "hwEmdiChannelGroupAddress": "1.3.6.1.4.1.2011.5.25.349.1.1.1.3", "hwEmdiVpnLabel": "1.3.6.1.4.1.2011.5.25.349.1.1.1.10", "hwEmdiBfirId": "1.3.6.1.4.1.2011.5.25.349.1.1.1.11", "hwEmdiSubDomain": "1.3.6.1.4.1.2011.5.25.349.1.1.1.12", "hwEmdiBsl": "1.3.6.1.4.1.2011.5.25.349.1.1.1.13", "hwEmdiSi": "1.3.6.1.4.1.2011.5.25.349.1.1.1.14", "hwEmdiRtpLrThreshold": "1.3.6.1.4.1.2011.5.25.349.1.1.1.4", "hwEmdiRtpLrValue": "1.3.6.1.4.1.2011.5.25.349.1.1.1.5"]
]

// --- hwEmdiBierRtpSerOverThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.349.2.1.15
// Fields: hwEmdiChannelSourceAddress, hwEmdiChannelGroupAddress, hwEmdiVpnLabel, hwEmdiBfirId, hwEmdiSubDomain, hwEmdiBsl, hwEmdiSi, hwEmdiRtpSerThreshold, hwEmdiRtpSerValue
// Description: This trap indicates that RTP-SER of a BIER multicast channel exceeds the threshold in some continuous monitor period.
trapMap["1.3.6.1.4.1.2011.5.25.349.2.1.15"] = [
    name: "hwEmdiBierRtpSerOverThreshold",
    fields: ["hwEmdiChannelSourceAddress", "hwEmdiChannelGroupAddress", "hwEmdiVpnLabel", "hwEmdiBfirId", "hwEmdiSubDomain", "hwEmdiBsl", "hwEmdiSi", "hwEmdiRtpSerThreshold", "hwEmdiRtpSerValue"],
    fieldOids: ["hwEmdiChannelSourceAddress": "1.3.6.1.4.1.2011.5.25.349.1.1.1.2", "hwEmdiChannelGroupAddress": "1.3.6.1.4.1.2011.5.25.349.1.1.1.3", "hwEmdiVpnLabel": "1.3.6.1.4.1.2011.5.25.349.1.1.1.10", "hwEmdiBfirId": "1.3.6.1.4.1.2011.5.25.349.1.1.1.11", "hwEmdiSubDomain": "1.3.6.1.4.1.2011.5.25.349.1.1.1.12", "hwEmdiBsl": "1.3.6.1.4.1.2011.5.25.349.1.1.1.13", "hwEmdiSi": "1.3.6.1.4.1.2011.5.25.349.1.1.1.14", "hwEmdiRtpSerThreshold": "1.3.6.1.4.1.2011.5.25.349.1.1.1.6", "hwEmdiRtpSerValue": "1.3.6.1.4.1.2011.5.25.349.1.1.1.7"]
]

// --- hwEmdiBierRtpSerOverThresholdResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.349.2.1.16
// Fields: hwEmdiChannelSourceAddress, hwEmdiChannelGroupAddress, hwEmdiVpnLabel, hwEmdiBfirId, hwEmdiSubDomain, hwEmdiBsl, hwEmdiSi, hwEmdiRtpSerThreshold, hwEmdiRtpSerValue
// Description: This trap indicates that RTP-SER of a BIER multicast channel is lower than the threshold in some continuous monitor period.
trapMap["1.3.6.1.4.1.2011.5.25.349.2.1.16"] = [
    name: "hwEmdiBierRtpSerOverThresholdResume",
    fields: ["hwEmdiChannelSourceAddress", "hwEmdiChannelGroupAddress", "hwEmdiVpnLabel", "hwEmdiBfirId", "hwEmdiSubDomain", "hwEmdiBsl", "hwEmdiSi", "hwEmdiRtpSerThreshold", "hwEmdiRtpSerValue"],
    fieldOids: ["hwEmdiChannelSourceAddress": "1.3.6.1.4.1.2011.5.25.349.1.1.1.2", "hwEmdiChannelGroupAddress": "1.3.6.1.4.1.2011.5.25.349.1.1.1.3", "hwEmdiVpnLabel": "1.3.6.1.4.1.2011.5.25.349.1.1.1.10", "hwEmdiBfirId": "1.3.6.1.4.1.2011.5.25.349.1.1.1.11", "hwEmdiSubDomain": "1.3.6.1.4.1.2011.5.25.349.1.1.1.12", "hwEmdiBsl": "1.3.6.1.4.1.2011.5.25.349.1.1.1.13", "hwEmdiSi": "1.3.6.1.4.1.2011.5.25.349.1.1.1.14", "hwEmdiRtpSerThreshold": "1.3.6.1.4.1.2011.5.25.349.1.1.1.6", "hwEmdiRtpSerValue": "1.3.6.1.4.1.2011.5.25.349.1.1.1.7"]
]

// --- hwEmdiBierOutRtpLrOverThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.349.2.1.17
// Fields: hwEmdiChannelSourceAddress, hwEmdiChannelGroupAddress, hwEmdiVpnLabel, hwEmdiBfirId, hwEmdiSubDomain, hwEmdiBsl, hwEmdiSi, hwEmdiRtpLrThreshold, hwEmdiRtpLrValue, hwEmdiChannelSlot, hwEmdiChannelInterface, hwEmdiToken
// Description: This trap indicates that outbound RTP-LR of a BIER multicast channel exceeds the threshold in some continuous monitor period.
trapMap["1.3.6.1.4.1.2011.5.25.349.2.1.17"] = [
    name: "hwEmdiBierOutRtpLrOverThreshold",
    fields: ["hwEmdiChannelSourceAddress", "hwEmdiChannelGroupAddress", "hwEmdiVpnLabel", "hwEmdiBfirId", "hwEmdiSubDomain", "hwEmdiBsl", "hwEmdiSi", "hwEmdiRtpLrThreshold", "hwEmdiRtpLrValue", "hwEmdiChannelSlot", "hwEmdiChannelInterface", "hwEmdiToken"],
    fieldOids: ["hwEmdiChannelSourceAddress": "1.3.6.1.4.1.2011.5.25.349.1.1.1.2", "hwEmdiChannelGroupAddress": "1.3.6.1.4.1.2011.5.25.349.1.1.1.3", "hwEmdiVpnLabel": "1.3.6.1.4.1.2011.5.25.349.1.1.1.10", "hwEmdiBfirId": "1.3.6.1.4.1.2011.5.25.349.1.1.1.11", "hwEmdiSubDomain": "1.3.6.1.4.1.2011.5.25.349.1.1.1.12", "hwEmdiBsl": "1.3.6.1.4.1.2011.5.25.349.1.1.1.13", "hwEmdiSi": "1.3.6.1.4.1.2011.5.25.349.1.1.1.14", "hwEmdiRtpLrThreshold": "1.3.6.1.4.1.2011.5.25.349.1.1.1.4", "hwEmdiRtpLrValue": "1.3.6.1.4.1.2011.5.25.349.1.1.1.5", "hwEmdiChannelSlot": "1.3.6.1.4.1.2011.5.25.349.1.1.1.8", "hwEmdiChannelInterface": "1.3.6.1.4.1.2011.5.25.349.1.1.1.9", "hwEmdiToken": "1.3.6.1.4.1.2011.5.25.349.1.1.1.15"]
]

// --- hwEmdiBierOutRtpLrOverThresholdResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.349.2.1.18
// Fields: hwEmdiChannelSourceAddress, hwEmdiChannelGroupAddress, hwEmdiVpnLabel, hwEmdiBfirId, hwEmdiSubDomain, hwEmdiBsl, hwEmdiSi, hwEmdiRtpLrThreshold, hwEmdiRtpLrValue, hwEmdiChannelSlot, hwEmdiChannelInterface, hwEmdiToken
// Description: This trap indicates that outbound RTP-LR of a BIER multicast channel is lower than the threshold in some continuous monitor period.
trapMap["1.3.6.1.4.1.2011.5.25.349.2.1.18"] = [
    name: "hwEmdiBierOutRtpLrOverThresholdResume",
    fields: ["hwEmdiChannelSourceAddress", "hwEmdiChannelGroupAddress", "hwEmdiVpnLabel", "hwEmdiBfirId", "hwEmdiSubDomain", "hwEmdiBsl", "hwEmdiSi", "hwEmdiRtpLrThreshold", "hwEmdiRtpLrValue", "hwEmdiChannelSlot", "hwEmdiChannelInterface", "hwEmdiToken"],
    fieldOids: ["hwEmdiChannelSourceAddress": "1.3.6.1.4.1.2011.5.25.349.1.1.1.2", "hwEmdiChannelGroupAddress": "1.3.6.1.4.1.2011.5.25.349.1.1.1.3", "hwEmdiVpnLabel": "1.3.6.1.4.1.2011.5.25.349.1.1.1.10", "hwEmdiBfirId": "1.3.6.1.4.1.2011.5.25.349.1.1.1.11", "hwEmdiSubDomain": "1.3.6.1.4.1.2011.5.25.349.1.1.1.12", "hwEmdiBsl": "1.3.6.1.4.1.2011.5.25.349.1.1.1.13", "hwEmdiSi": "1.3.6.1.4.1.2011.5.25.349.1.1.1.14", "hwEmdiRtpLrThreshold": "1.3.6.1.4.1.2011.5.25.349.1.1.1.4", "hwEmdiRtpLrValue": "1.3.6.1.4.1.2011.5.25.349.1.1.1.5", "hwEmdiChannelSlot": "1.3.6.1.4.1.2011.5.25.349.1.1.1.8", "hwEmdiChannelInterface": "1.3.6.1.4.1.2011.5.25.349.1.1.1.9", "hwEmdiToken": "1.3.6.1.4.1.2011.5.25.349.1.1.1.15"]
]

// --- hwEmdiBierOutRtpSerOverThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.349.2.1.19
// Fields: hwEmdiChannelSourceAddress, hwEmdiChannelGroupAddress, hwEmdiVpnLabel, hwEmdiBfirId, hwEmdiSubDomain, hwEmdiBsl, hwEmdiSi, hwEmdiRtpSerThreshold, hwEmdiRtpSerValue, hwEmdiChannelSlot, hwEmdiChannelInterface, hwEmdiToken
// Description: This trap indicates that outbound RTP-SER of a BIER multicast channel exceeds the threshold in some continuous monitor period.
trapMap["1.3.6.1.4.1.2011.5.25.349.2.1.19"] = [
    name: "hwEmdiBierOutRtpSerOverThreshold",
    fields: ["hwEmdiChannelSourceAddress", "hwEmdiChannelGroupAddress", "hwEmdiVpnLabel", "hwEmdiBfirId", "hwEmdiSubDomain", "hwEmdiBsl", "hwEmdiSi", "hwEmdiRtpSerThreshold", "hwEmdiRtpSerValue", "hwEmdiChannelSlot", "hwEmdiChannelInterface", "hwEmdiToken"],
    fieldOids: ["hwEmdiChannelSourceAddress": "1.3.6.1.4.1.2011.5.25.349.1.1.1.2", "hwEmdiChannelGroupAddress": "1.3.6.1.4.1.2011.5.25.349.1.1.1.3", "hwEmdiVpnLabel": "1.3.6.1.4.1.2011.5.25.349.1.1.1.10", "hwEmdiBfirId": "1.3.6.1.4.1.2011.5.25.349.1.1.1.11", "hwEmdiSubDomain": "1.3.6.1.4.1.2011.5.25.349.1.1.1.12", "hwEmdiBsl": "1.3.6.1.4.1.2011.5.25.349.1.1.1.13", "hwEmdiSi": "1.3.6.1.4.1.2011.5.25.349.1.1.1.14", "hwEmdiRtpSerThreshold": "1.3.6.1.4.1.2011.5.25.349.1.1.1.6", "hwEmdiRtpSerValue": "1.3.6.1.4.1.2011.5.25.349.1.1.1.7", "hwEmdiChannelSlot": "1.3.6.1.4.1.2011.5.25.349.1.1.1.8", "hwEmdiChannelInterface": "1.3.6.1.4.1.2011.5.25.349.1.1.1.9", "hwEmdiToken": "1.3.6.1.4.1.2011.5.25.349.1.1.1.15"]
]

// --- hwEmdiBierOutRtpSerOverThresholdResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.349.2.1.20
// Fields: hwEmdiChannelSourceAddress, hwEmdiChannelGroupAddress, hwEmdiVpnLabel, hwEmdiBfirId, hwEmdiSubDomain, hwEmdiBsl, hwEmdiSi, hwEmdiRtpSerThreshold, hwEmdiRtpSerValue, hwEmdiChannelSlot, hwEmdiChannelInterface, hwEmdiToken
// Description: This trap indicates that outbound RTP-SER of a BIER multicast channel is lower than the threshold in some continuous monitor period.
trapMap["1.3.6.1.4.1.2011.5.25.349.2.1.20"] = [
    name: "hwEmdiBierOutRtpSerOverThresholdResume",
    fields: ["hwEmdiChannelSourceAddress", "hwEmdiChannelGroupAddress", "hwEmdiVpnLabel", "hwEmdiBfirId", "hwEmdiSubDomain", "hwEmdiBsl", "hwEmdiSi", "hwEmdiRtpSerThreshold", "hwEmdiRtpSerValue", "hwEmdiChannelSlot", "hwEmdiChannelInterface", "hwEmdiToken"],
    fieldOids: ["hwEmdiChannelSourceAddress": "1.3.6.1.4.1.2011.5.25.349.1.1.1.2", "hwEmdiChannelGroupAddress": "1.3.6.1.4.1.2011.5.25.349.1.1.1.3", "hwEmdiVpnLabel": "1.3.6.1.4.1.2011.5.25.349.1.1.1.10", "hwEmdiBfirId": "1.3.6.1.4.1.2011.5.25.349.1.1.1.11", "hwEmdiSubDomain": "1.3.6.1.4.1.2011.5.25.349.1.1.1.12", "hwEmdiBsl": "1.3.6.1.4.1.2011.5.25.349.1.1.1.13", "hwEmdiSi": "1.3.6.1.4.1.2011.5.25.349.1.1.1.14", "hwEmdiRtpSerThreshold": "1.3.6.1.4.1.2011.5.25.349.1.1.1.6", "hwEmdiRtpSerValue": "1.3.6.1.4.1.2011.5.25.349.1.1.1.7", "hwEmdiChannelSlot": "1.3.6.1.4.1.2011.5.25.349.1.1.1.8", "hwEmdiChannelInterface": "1.3.6.1.4.1.2011.5.25.349.1.1.1.9", "hwEmdiToken": "1.3.6.1.4.1.2011.5.25.349.1.1.1.15"]
]

// ===== Parsing logic =====

// Set to true to enable diagnostic logging for this MIB parser
DEBUG = false

LOG_PREFIX = "[HUAWEI-QOE-MIB]"
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
