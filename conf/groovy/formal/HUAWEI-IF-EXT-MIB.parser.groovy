/**
 * Auto-generated from HUAWEI-IF-EXT-MIB.mib
 * Generated: 2026-08-24T18:28:29.864822100
 * Traps/Notifications (109): hwTrunkWorkingSwitch, hwLacpNegotiateFailed, hwLacpTotalLinkLoss, hwLacpPartialLinkLoss, hwIfFlowDown, hwIfFlowUp, hwIfNameChange, hwIfNameChangeResume, hwExtLinkDown, hwExtLinkUp, hwLoopbackBlock, hwLoopbackResume, hwLacpNegotiateResume, hwLacpTotalLinkLossResume, hwLacpPartialLinkLossResume, hwTrunkSubIfStateToMaster, hwTrunkSubIfStateToSlave, hwEntityExtCfmOverSlot, hwEntityExtCfmOverCard, hwExtAllMemberDownNotify, hwExtAllMemberDownResume, hwTrunkMemNumberChange, hwIfControlFlapSuppress, hwIfControlFlapResume, hwExtInterfaceDelete, hwLacpPartnerExpiredLoss, hwLacpPDUChange, hwLacpPDUChangeResume, hwIfEfmDown, hwIfEfmUp, hwExtTrunkMemberCountExceedThreshold, hwExtTrunkMemberCountExceedThresholdResume, hwExtTrunkWorkingStatusChange, hwIfControlFlapSuppressIPv6, hwIfControlFlapResumeIPv6, hwLagMemberDown, hwLagMemberDownResume, hwLicenseEffectServiceAlarm, hwLicenseEffectServiceResume, hwTrunkAllMemUpNotify, hwPhysicalAdminIfDown, hwPhysicalAdminIfUp, hwLacpPartnerMisconnect, hwLacpPartnerMisconnectResume, hwTrunkMemberChange, hwTrunkStatusChange, hwIfDampSuppress, hwIfDampResume, hwTrunkBwChange, hwLacpStateDown, hwLacpStateDownResume, hwIfIPConflict, hwIfIPConflictResume, hwIPv4IfStateAlarm, hwIPv4IfStateAlarmResume, hwLacpMlagPartnerMisconnect, hwLacpMlagPartnerMisconnectResume, hwSliceIfBwNotEnough, hwSliceIfBwNotEnoughResume, hwIfMonitorCrcErrorRising, hwIfMonitorCrcErrorResume, hwIfMonitorSdhErrorRising, hwIfMonitorSdhErrorResume, hwIfMonitorInputRateRising, hwIfMonitorInputRateResume, hwIfMonitorOutputRateRising, hwIfMonitorOutputRateResume, hwIfMonitorHalfDuplexRising, hwIfMonitorPauseFrameRising, hwIfMonitorPauseFrameRisingResume, hwIfPortControlUp, hwIfPortControlDown, hwIfMonitorSdhB1ErrorRising, hwIfMonitorSdhB1ErrorResume, hwIfMonitorSdhB2ErrorRising, hwIfMonitorSdhB2ErrorResume, hwIfMonitorSymbolErrorRising, hwIfMonitorSymbolErrorResume, hwIfMonitorBadBytesErrorRising, hwIfMonitorBadBytesErrorResume, hwIfMonitorTxPauseFrameRising, hwIfMonitorTxPauseFrameRisingResume, hwIfMonitorPostfecErrorRising, hwIfMonitorPostfecErrorRisingResume, hwModeChannelRecvExceedThreshold, hwModeChannelRecvExceedThresholdResume, hwModeChannelSendExceedThreshold, hwModeChannelSendExceedThresholdResume, hwSubChannelBandwidthRising, hwSubChannelBandwidthResume, hwModeChannelRecvExceedGeneralThreshold, hwModeChannelRecvExceedGeneralThresholdResume, hwModeChannelSendExceedGeneralThreshold, hwModeChannelSendExceedGeneralThresholdResume, hwModeChannelRecvExceedSeriousThreshold, hwModeChannelRecvExceedSeriousThresholdResume, hwModeChannelSendExceedSeriousThreshold, hwModeChannelSendExceedSeriousThresholdResume, hwModeChannelBandwidthAlarm, hwModeChannelBandwidthResume, hwTrunkBandwidthAlarm, hwTrunkBandwidthResume, hwModeFlexeBandwidthAlarm, hwModeFlexeBandwidthResume, hwVirtualEthernetChipMismatchAlarm, hwVirtualEthernetChipMismatchResume, hwFlexeChannelNotSupportAlarm, hwFlexeChannelNotSupportResume, hwIfIpAddressChange
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

// --- hwTrunkWorkingSwitch (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.41.3.1
// Fields: hwTrunkIfID, hwTrunkIfWorkingState
// Description: This notification indicates that the trunk working mode is switched.
trapMap["1.3.6.1.4.1.2011.5.25.41.3.1"] = [
    name: "hwTrunkWorkingSwitch",
    fields: ["hwTrunkIfID", "hwTrunkIfWorkingState"],
    fieldOids: ["hwTrunkIfID": "1.3.6.1.4.1.2011.5.25.41.1.3.3.1.2", "hwTrunkIfWorkingState": "1.3.6.1.4.1.2011.5.25.41.1.3.3.1.10"]
]

// --- hwLacpNegotiateFailed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.41.3.2
// Fields: hwTrunkIfID, ifName, ifName
// Description: The member of LAG neither can take over PDU nor transmit PDUs. Send this trap when LACP protocol negotiation fails. 1. hwTrunkIfID: The identification of the Trunk interface; 2. ifName: It is the name...
trapMap["1.3.6.1.4.1.2011.5.25.41.3.2"] = [
    name: "hwLacpNegotiateFailed",
    fields: ["hwTrunkIfID", "ifName", "ifName"],
    fieldOids: ["hwTrunkIfID": "1.3.6.1.4.1.2011.5.25.41.1.3.3.1.2", "ifName": "1.3.6.1.2.1.31.1.1.1.1"]
]

// --- hwLacpTotalLinkLoss (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.41.3.3
// Fields: hwTrunkIfID, ifName
// Description: This notification indicates that all the link bandwidths are lost. Some member interfaces in the LAG do not work, and the number of working interfaces is smaller than the hwTrunkIfMinLinkNum value. Th...
trapMap["1.3.6.1.4.1.2011.5.25.41.3.3"] = [
    name: "hwLacpTotalLinkLoss",
    fields: ["hwTrunkIfID", "ifName"],
    fieldOids: ["hwTrunkIfID": "1.3.6.1.4.1.2011.5.25.41.1.3.3.1.2", "ifName": "1.3.6.1.2.1.31.1.1.1.1"]
]

// --- hwLacpPartialLinkLoss (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.41.3.4
// Fields: hwTrunkIfID, ifName
// Description: Part loss of link bandwidth: it means that some members in the LAG group aren't in the working-state, making the number of ports in working-state smaller than the hwTrunkIfMinLinkNum. The trap of PLL(...
trapMap["1.3.6.1.4.1.2011.5.25.41.3.4"] = [
    name: "hwLacpPartialLinkLoss",
    fields: ["hwTrunkIfID", "ifName"],
    fieldOids: ["hwTrunkIfID": "1.3.6.1.4.1.2011.5.25.41.1.3.3.1.2", "ifName": "1.3.6.1.2.1.31.1.1.1.1"]
]

// --- hwIfFlowDown (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.41.3.5
// Fields: sysUpTime, hwIFExtFlowStatus, ifName
// Description: This notification indicates that the interface's flow status changes to flow Down. This object can be bound to two variables: 1. sysUpTime: indicates the time when the event occurs. 2. hwIFExtFlowStat...
trapMap["1.3.6.1.4.1.2011.5.25.41.3.5"] = [
    name: "hwIfFlowDown",
    fields: ["sysUpTime", "hwIFExtFlowStatus", "ifName"],
    fieldOids: ["sysUpTime": "1.3.6.1.2.1.1.3", "hwIFExtFlowStatus": "1.3.6.1.4.1.2011.5.25.41.1.1.1.1.8", "ifName": "1.3.6.1.2.1.31.1.1.1.1"]
]

// --- hwIfFlowUp (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.41.3.6
// Fields: sysUpTime, hwIFExtFlowStatus, ifName
// Description: This notification indicates that the interface's flow status is restored to flow Up. This object can be bound to two variables: 1. sysUpTime: indicates the time when the event occurs. 2. hwIFExtFlowSt...
trapMap["1.3.6.1.4.1.2011.5.25.41.3.6"] = [
    name: "hwIfFlowUp",
    fields: ["sysUpTime", "hwIFExtFlowStatus", "ifName"],
    fieldOids: ["sysUpTime": "1.3.6.1.2.1.1.3", "hwIFExtFlowStatus": "1.3.6.1.4.1.2011.5.25.41.1.1.1.1.8", "ifName": "1.3.6.1.2.1.31.1.1.1.1"]
]

// --- hwIfNameChange (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.41.3.7
// Description: When a single-chassis device is upgraded to a multi-chassis device, the interface information is changed and then the system sends a trap.
trapMap["1.3.6.1.4.1.2011.5.25.41.3.7"] = [
    name: "hwIfNameChange",
    fields: [],
    fieldOids: []
]

// --- hwIfNameChangeResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.41.3.8
// Description: When a multi-chassis restore a single-chassis device, the interface information is changed and then the system sends a trap.
trapMap["1.3.6.1.4.1.2011.5.25.41.3.8"] = [
    name: "hwIfNameChangeResume",
    fields: [],
    fieldOids: []
]

// --- hwExtLinkDown (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.41.3.9
// Fields: ifIndex, ifAdminStatus, ifOperStatus, ifDescr, hwIFExtPhyStatus, hwIFExtMemberOf
// Description: This object indicates that the link protocol of a trunk member interface goes Down.
trapMap["1.3.6.1.4.1.2011.5.25.41.3.9"] = [
    name: "hwExtLinkDown",
    fields: ["ifIndex", "ifAdminStatus", "ifOperStatus", "ifDescr", "hwIFExtPhyStatus", "hwIFExtMemberOf"],
    fieldOids: ["ifIndex": "1.3.6.1.2.1.2.2.1.1", "ifAdminStatus": "1.3.6.1.2.1.2.2.1.7", "ifOperStatus": "1.3.6.1.2.1.2.2.1.8", "ifDescr": "1.3.6.1.2.1.2.2.1.2", "hwIFExtPhyStatus": "1.3.6.1.4.1.2011.5.25.41.1.1.2", "hwIFExtMemberOf": "1.3.6.1.4.1.2011.5.25.41.1.1.3"]
]

// --- hwExtLinkUp (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.41.3.10
// Fields: ifIndex, ifAdminStatus, ifOperStatus, ifDescr, hwIFExtPhyStatus, hwIFExtMemberOf
// Description: This object indicates that the link protocol of a trunk member interface goes Up.
trapMap["1.3.6.1.4.1.2011.5.25.41.3.10"] = [
    name: "hwExtLinkUp",
    fields: ["ifIndex", "ifAdminStatus", "ifOperStatus", "ifDescr", "hwIFExtPhyStatus", "hwIFExtMemberOf"],
    fieldOids: ["ifIndex": "1.3.6.1.2.1.2.2.1.1", "ifAdminStatus": "1.3.6.1.2.1.2.2.1.7", "ifOperStatus": "1.3.6.1.2.1.2.2.1.8", "ifDescr": "1.3.6.1.2.1.2.2.1.2", "hwIFExtPhyStatus": "1.3.6.1.4.1.2011.5.25.41.1.1.2", "hwIFExtMemberOf": "1.3.6.1.4.1.2011.5.25.41.1.1.3"]
]

// --- hwLoopbackBlock (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.41.3.11
// Fields: ifDescr, hwNewIfTimeslot
// Description: This notification indicates block state of the interface.
trapMap["1.3.6.1.4.1.2011.5.25.41.3.11"] = [
    name: "hwLoopbackBlock",
    fields: ["ifDescr", "hwNewIfTimeslot"],
    fieldOids: ["ifDescr": "1.3.6.1.2.1.2.2.1.2", "hwNewIfTimeslot": "1.3.6.1.4.1.2011.5.25.41.1.1.4.1.2"]
]

// --- hwLoopbackResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.41.3.12
// Fields: hwIfName
// Description: This notification indicates normal state of the interface.
trapMap["1.3.6.1.4.1.2011.5.25.41.3.12"] = [
    name: "hwLoopbackResume",
    fields: ["hwIfName"],
    fieldOids: ["hwIfName": "1.3.6.1.4.1.2011.5.25.41.1.12.1.1.1"]
]

// --- hwLacpNegotiateResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.41.3.13
// Fields: hwTrunkIfID, ifName, ifName
// Description: Negotiation failure alarm is resumed. 1. hwTrunkIfID: The identification of the Trunk interface; 2. ifName: It is the name of the trunk in the ifXTable of IF-MIB. 3. ifName: It is the name of the port...
trapMap["1.3.6.1.4.1.2011.5.25.41.3.13"] = [
    name: "hwLacpNegotiateResume",
    fields: ["hwTrunkIfID", "ifName", "ifName"],
    fieldOids: ["hwTrunkIfID": "1.3.6.1.4.1.2011.5.25.41.1.3.3.1.2", "ifName": "1.3.6.1.2.1.31.1.1.1.1"]
]

// --- hwLacpTotalLinkLossResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.41.3.14
// Fields: hwTrunkIfID, ifName
// Description: Link bandwidth lost totally is resumed. 1. hwTrunkIfID: The identification of the Trunk interface; 2. ifName: It is in the ifXTable of IF-MIB. Index: hwTrunkIndex.
trapMap["1.3.6.1.4.1.2011.5.25.41.3.14"] = [
    name: "hwLacpTotalLinkLossResume",
    fields: ["hwTrunkIfID", "ifName"],
    fieldOids: ["hwTrunkIfID": "1.3.6.1.4.1.2011.5.25.41.1.3.3.1.2", "ifName": "1.3.6.1.2.1.31.1.1.1.1"]
]

// --- hwLacpPartialLinkLossResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.41.3.15
// Fields: hwTrunkIfID, ifName
// Description: Link bandwidth lost partly is resumed. 1. hwTrunkIfID: The identification of the Trunk interface; 2. ifName: It is in the ifXTable of IF-MIB. Index: hwTrunkIndex.
trapMap["1.3.6.1.4.1.2011.5.25.41.3.15"] = [
    name: "hwLacpPartialLinkLossResume",
    fields: ["hwTrunkIfID", "ifName"],
    fieldOids: ["hwTrunkIfID": "1.3.6.1.4.1.2011.5.25.41.1.3.3.1.2", "ifName": "1.3.6.1.2.1.31.1.1.1.1"]
]

// --- hwTrunkSubIfStateToMaster (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.41.3.24
// Fields: hwIfName, hwBackupStatus
// Description: This notification indicates BackupState of the Trunk subinterface. 1.hwIfName: The identification of the Trunk subinterface; 2.hwBackupStatus: Current working state of Trunk subinterface.
trapMap["1.3.6.1.4.1.2011.5.25.41.3.24"] = [
    name: "hwTrunkSubIfStateToMaster",
    fields: ["hwIfName", "hwBackupStatus"],
    fieldOids: ["hwIfName": "1.3.6.1.4.1.2011.5.25.41.1.12.1.1.1", "hwBackupStatus": "1.3.6.1.4.1.2011.5.25.41.1.18.1.1.2"]
]

// --- hwTrunkSubIfStateToSlave (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.41.3.25
// Fields: hwIfName, hwBackupStatus
// Description: This notification indicates BackupState of the Trunk subinterface. 1.hwIfName: The identification of the Trunk subinterface; 2.hwBackupStatus: Current working state of Trunk subinterface.
trapMap["1.3.6.1.4.1.2011.5.25.41.3.25"] = [
    name: "hwTrunkSubIfStateToSlave",
    fields: ["hwIfName", "hwBackupStatus"],
    fieldOids: ["hwIfName": "1.3.6.1.4.1.2011.5.25.41.1.12.1.1.1", "hwBackupStatus": "1.3.6.1.4.1.2011.5.25.41.1.18.1.1.2"]
]

// --- hwEntityExtCfmOverSlot (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.41.3.26
// Fields: hwCfmOverPhysicalName
// Description: The hwEntityExtCfmOverSlot notification will be displayed when the configuration of an interface board is restored. The object hwCfmOverPhysicalName idicates the name of the interface board.
trapMap["1.3.6.1.4.1.2011.5.25.41.3.26"] = [
    name: "hwEntityExtCfmOverSlot",
    fields: ["hwCfmOverPhysicalName"],
    fieldOids: ["hwCfmOverPhysicalName": "1.3.6.1.4.1.2011.5.25.41.1.20.3"]
]

// --- hwEntityExtCfmOverCard (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.41.3.27
// Fields: hwCfmOverPhysicalName
// Description: The hwEntityExtCfmOverCard notification will be displayed when the configuration of an interface card is restored. The object hwCfmOverPhysicalName idicates the name of the interface card.
trapMap["1.3.6.1.4.1.2011.5.25.41.3.27"] = [
    name: "hwEntityExtCfmOverCard",
    fields: ["hwCfmOverPhysicalName"],
    fieldOids: ["hwCfmOverPhysicalName": "1.3.6.1.4.1.2011.5.25.41.1.20.3"]
]

// --- hwExtAllMemberDownNotify (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.41.3.28
// Fields: ifName
// Description: This notification indicates the time when the last member interface link status changes to down. The ifName indicates the name of the Trunk interface.
trapMap["1.3.6.1.4.1.2011.5.25.41.3.28"] = [
    name: "hwExtAllMemberDownNotify",
    fields: ["ifName"],
    fieldOids: ["ifName": "1.3.6.1.2.1.31.1.1.1.1"]
]

// --- hwExtAllMemberDownResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.41.3.29
// Fields: ifName
// Description: This notification indicates the time when the first member interface link status changes to up. The ifName indicates the name of the Trunk interface.
trapMap["1.3.6.1.4.1.2011.5.25.41.3.29"] = [
    name: "hwExtAllMemberDownResume",
    fields: ["ifName"],
    fieldOids: ["ifName": "1.3.6.1.2.1.31.1.1.1.1"]
]

// --- hwTrunkMemNumberChange (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.41.3.30
// Fields: hwTrunkIfDescr, hwTrunkMemIfDescr, hwTrunkActiveMember, hwIfExtTrapReason
// Description: The number of active trunk members changed.
trapMap["1.3.6.1.4.1.2011.5.25.41.3.30"] = [
    name: "hwTrunkMemNumberChange",
    fields: ["hwTrunkIfDescr", "hwTrunkMemIfDescr", "hwTrunkActiveMember", "hwIfExtTrapReason"],
    fieldOids: ["hwTrunkIfDescr": "1.3.6.1.4.1.2011.5.25.41.1.20.5", "hwTrunkMemIfDescr": "1.3.6.1.4.1.2011.5.25.41.1.20.6", "hwTrunkActiveMember": "1.3.6.1.4.1.2011.5.25.41.1.20.7", "hwIfExtTrapReason": "1.3.6.1.4.1.2011.5.25.41.1.20.8"]
]

// --- hwIfControlFlapSuppress (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.41.3.31
// Fields: ifName, hwIFExtSuppressStatus
// Description: This notification indicates the time when the interface's status changes from unsuppress to suppress.
trapMap["1.3.6.1.4.1.2011.5.25.41.3.31"] = [
    name: "hwIfControlFlapSuppress",
    fields: ["ifName", "hwIFExtSuppressStatus"],
    fieldOids: ["ifName": "1.3.6.1.2.1.31.1.1.1.1", "hwIFExtSuppressStatus": "1.3.6.1.4.1.2011.5.25.41.1.1.1.1.13"]
]

// --- hwIfControlFlapResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.41.3.32
// Fields: ifName, hwIFExtSuppressStatus
// Description: This notification indicates the time when the interface's status changes from suppress to unsuppress.
trapMap["1.3.6.1.4.1.2011.5.25.41.3.32"] = [
    name: "hwIfControlFlapResume",
    fields: ["ifName", "hwIFExtSuppressStatus"],
    fieldOids: ["ifName": "1.3.6.1.2.1.31.1.1.1.1", "hwIFExtSuppressStatus": "1.3.6.1.4.1.2011.5.25.41.1.1.1.1.13"]
]

// --- hwExtInterfaceDelete (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.41.3.33
// Fields: ifIndex, ifDescr
// Description: This notification indicates the time when the interface was deleted.
trapMap["1.3.6.1.4.1.2011.5.25.41.3.33"] = [
    name: "hwExtInterfaceDelete",
    fields: ["ifIndex", "ifDescr"],
    fieldOids: ["ifIndex": "1.3.6.1.2.1.2.2.1.1", "ifDescr": "1.3.6.1.2.1.2.2.1.2"]
]

// --- hwLacpPartnerExpiredLoss (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.41.3.34
// Fields: hwTrunkIfID, ifName, ifName
// Description: The member of LAG receive expired PDU from partner. Send this trap when LACP protocol negotiation fails. 1. hwTrunkIfID: The identification of the Trunk interface; 2. ifName: It is the name of the tru...
trapMap["1.3.6.1.4.1.2011.5.25.41.3.34"] = [
    name: "hwLacpPartnerExpiredLoss",
    fields: ["hwTrunkIfID", "ifName", "ifName"],
    fieldOids: ["hwTrunkIfID": "1.3.6.1.4.1.2011.5.25.41.1.3.3.1.2", "ifName": "1.3.6.1.2.1.31.1.1.1.1"]
]

// --- hwLacpPDUChange (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.41.3.35
// Fields: hwTrunkIfID, ifName, ifName, hwLacpOldPDUInfo, hwLacpNewPDUInfo, hwIfExtTrapReason
// Description: The LACP member interface's status changed from selected to unselected due to the PDU change. 1. hwTrunkIfID: The identification of the Trunk interface; 2. ifName: It is the name of the trunk in the i...
trapMap["1.3.6.1.4.1.2011.5.25.41.3.35"] = [
    name: "hwLacpPDUChange",
    fields: ["hwTrunkIfID", "ifName", "ifName", "hwLacpOldPDUInfo", "hwLacpNewPDUInfo", "hwIfExtTrapReason"],
    fieldOids: ["hwTrunkIfID": "1.3.6.1.4.1.2011.5.25.41.1.3.3.1.2", "ifName": "1.3.6.1.2.1.31.1.1.1.1", "hwLacpOldPDUInfo": "1.3.6.1.4.1.2011.5.25.41.1.20.9", "hwLacpNewPDUInfo": "1.3.6.1.4.1.2011.5.25.41.1.20.10", "hwIfExtTrapReason": "1.3.6.1.4.1.2011.5.25.41.1.20.8"]
]

// --- hwLacpPDUChangeResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.41.3.36
// Fields: hwTrunkIfID, ifName, ifName
// Description: The LACP member interface's status changed from unselected to selected. 1. hwTrunkIfID: The identification of the Trunk interface; 2. ifName: It is the name of the trunk in the ifXTable of IF-MIB. 3. ...
trapMap["1.3.6.1.4.1.2011.5.25.41.3.36"] = [
    name: "hwLacpPDUChangeResume",
    fields: ["hwTrunkIfID", "ifName", "ifName"],
    fieldOids: ["hwTrunkIfID": "1.3.6.1.4.1.2011.5.25.41.1.3.3.1.2", "ifName": "1.3.6.1.2.1.31.1.1.1.1"]
]

// --- hwIfEfmDown (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.41.3.37
// Fields: ifName
// Description: This notification indicates that the interface status changes to EFM Down because the interface has tracked EFM session and the EFM session goes Down.
trapMap["1.3.6.1.4.1.2011.5.25.41.3.37"] = [
    name: "hwIfEfmDown",
    fields: ["ifName"],
    fieldOids: ["ifName": "1.3.6.1.2.1.31.1.1.1.1"]
]

// --- hwIfEfmUp (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.41.3.38
// Fields: ifName
// Description: This notification indicates that the interface status changes to EFM Up because the interface has tracked EFM session and the EFM session goes Up.
trapMap["1.3.6.1.4.1.2011.5.25.41.3.38"] = [
    name: "hwIfEfmUp",
    fields: ["ifName"],
    fieldOids: ["ifName": "1.3.6.1.2.1.31.1.1.1.1"]
]

// --- hwExtTrunkMemberCountExceedThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.41.3.39
// Fields: hwTrunkMemberCountUpperThreshold
// Description: The number of members of the Eth-Trunk in LACP mode exceeded the upper threshold.
trapMap["1.3.6.1.4.1.2011.5.25.41.3.39"] = [
    name: "hwExtTrunkMemberCountExceedThreshold",
    fields: ["hwTrunkMemberCountUpperThreshold"],
    fieldOids: ["hwTrunkMemberCountUpperThreshold": "1.3.6.1.4.1.2011.5.25.41.1.3.9"]
]

// --- hwExtTrunkMemberCountExceedThresholdResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.41.3.40
// Fields: hwTrunkMemberCountLowerThreshold
// Description: The number of members of the Eth-Trunk in LACP mode fell below the lower threshold.
trapMap["1.3.6.1.4.1.2011.5.25.41.3.40"] = [
    name: "hwExtTrunkMemberCountExceedThresholdResume",
    fields: ["hwTrunkMemberCountLowerThreshold"],
    fieldOids: ["hwTrunkMemberCountLowerThreshold": "1.3.6.1.4.1.2011.5.25.41.1.3.10"]
]

// --- hwExtTrunkWorkingStatusChange (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.41.3.41
// Fields: ifName, ifName
// Description: This notification indicates that the working status of the backup trunk changed.
trapMap["1.3.6.1.4.1.2011.5.25.41.3.41"] = [
    name: "hwExtTrunkWorkingStatusChange",
    fields: ["ifName", "ifName"],
    fieldOids: ["ifName": "1.3.6.1.2.1.31.1.1.1.1"]
]

// --- hwIfControlFlapSuppressIPv6 (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.41.3.42
// Fields: ifName, hwIFExtSuppressStatusIPv6
// Description: This notification indicates the time when the interface's status changes from unsuppress to suppress(IPv6).
trapMap["1.3.6.1.4.1.2011.5.25.41.3.42"] = [
    name: "hwIfControlFlapSuppressIPv6",
    fields: ["ifName", "hwIFExtSuppressStatusIPv6"],
    fieldOids: ["ifName": "1.3.6.1.2.1.31.1.1.1.1", "hwIFExtSuppressStatusIPv6": "1.3.6.1.4.1.2011.5.25.41.1.1.1.1.24"]
]

// --- hwIfControlFlapResumeIPv6 (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.41.3.43
// Fields: ifName, hwIFExtSuppressStatusIPv6
// Description: This notification indicates the time when the interface's status changes from suppress to unsuppress(IPv6).
trapMap["1.3.6.1.4.1.2011.5.25.41.3.43"] = [
    name: "hwIfControlFlapResumeIPv6",
    fields: ["ifName", "hwIFExtSuppressStatusIPv6"],
    fieldOids: ["ifName": "1.3.6.1.2.1.31.1.1.1.1", "hwIFExtSuppressStatusIPv6": "1.3.6.1.4.1.2011.5.25.41.1.1.1.1.24"]
]

// --- hwLagMemberDown (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.41.3.44
// Fields: hwTrunkIfID, ifName, ifName, hwLagMemberDownReason
// Description: The LAG member status changes. 1. hwTrunkIfID: The identification of the Trunk interface; 2. ifName: It is the name of the trunk in the ifXTable of IF-MIB. 3. ifName: It is the name of the port in the...
trapMap["1.3.6.1.4.1.2011.5.25.41.3.44"] = [
    name: "hwLagMemberDown",
    fields: ["hwTrunkIfID", "ifName", "ifName", "hwLagMemberDownReason"],
    fieldOids: ["hwTrunkIfID": "1.3.6.1.4.1.2011.5.25.41.1.3.3.1.2", "ifName": "1.3.6.1.2.1.31.1.1.1.1", "hwLagMemberDownReason": "1.3.6.1.4.1.2011.5.25.41.1.20.11"]
]

// --- hwLagMemberDownResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.41.3.45
// Fields: hwTrunkIfID, ifName, ifName, hwLagMemberDownReason
// Description: The LAG member status resumes. 1. hwTrunkIfID: The identification of the Trunk interface; 2. ifName: It is the name of the trunk in the ifXTable of IF-MIB. 3. ifName: It is the name of the port in the...
trapMap["1.3.6.1.4.1.2011.5.25.41.3.45"] = [
    name: "hwLagMemberDownResume",
    fields: ["hwTrunkIfID", "ifName", "ifName", "hwLagMemberDownReason"],
    fieldOids: ["hwTrunkIfID": "1.3.6.1.4.1.2011.5.25.41.1.3.3.1.2", "ifName": "1.3.6.1.2.1.31.1.1.1.1", "hwLagMemberDownReason": "1.3.6.1.4.1.2011.5.25.41.1.20.11"]
]

// --- hwLicenseEffectServiceAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.41.3.46
// Fields: hwLicenseItemName, ifName, hwLicenseServiceDesc
// Description: the license was not activated for the physical interface, the service of the corresponding interface or sub-interface is invalid
trapMap["1.3.6.1.4.1.2011.5.25.41.3.46"] = [
    name: "hwLicenseEffectServiceAlarm",
    fields: ["hwLicenseItemName", "ifName", "hwLicenseServiceDesc"],
    fieldOids: ["hwLicenseItemName": "1.3.6.1.4.1.2011.5.25.41.1.20.12", "ifName": "1.3.6.1.2.1.31.1.1.1.1", "hwLicenseServiceDesc": "1.3.6.1.4.1.2011.5.25.41.1.20.13"]
]

// --- hwLicenseEffectServiceResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.41.3.47
// Fields: hwLicenseItemName, ifName, hwLicenseServiceDesc
// Description: The license has been activated for the physical interface or the service of the corresponding interface and sub-interface has been removed.
trapMap["1.3.6.1.4.1.2011.5.25.41.3.47"] = [
    name: "hwLicenseEffectServiceResume",
    fields: ["hwLicenseItemName", "ifName", "hwLicenseServiceDesc"],
    fieldOids: ["hwLicenseItemName": "1.3.6.1.4.1.2011.5.25.41.1.20.12", "ifName": "1.3.6.1.2.1.31.1.1.1.1", "hwLicenseServiceDesc": "1.3.6.1.4.1.2011.5.25.41.1.20.13"]
]

// --- hwTrunkAllMemUpNotify (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.41.3.48
// Fields: hwTrunkIfDescr
// Description: All trunk members's status change to up.
trapMap["1.3.6.1.4.1.2011.5.25.41.3.48"] = [
    name: "hwTrunkAllMemUpNotify",
    fields: ["hwTrunkIfDescr"],
    fieldOids: ["hwTrunkIfDescr": "1.3.6.1.4.1.2011.5.25.41.1.20.5"]
]

// --- hwPhysicalAdminIfDown (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.41.3.49
// Fields: ifIndex, ifName, ifOperStatus
// Description: The physical manage interface physical status changes to down.
trapMap["1.3.6.1.4.1.2011.5.25.41.3.49"] = [
    name: "hwPhysicalAdminIfDown",
    fields: ["ifIndex", "ifName", "ifOperStatus"],
    fieldOids: ["ifIndex": "1.3.6.1.2.1.2.2.1.1", "ifName": "1.3.6.1.2.1.31.1.1.1.1", "ifOperStatus": "1.3.6.1.2.1.2.2.1.8"]
]

// --- hwPhysicalAdminIfUp (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.41.3.50
// Fields: ifIndex, ifName, ifOperStatus
// Description: The physical manage interface physical status changes to up.
trapMap["1.3.6.1.4.1.2011.5.25.41.3.50"] = [
    name: "hwPhysicalAdminIfUp",
    fields: ["ifIndex", "ifName", "ifOperStatus"],
    fieldOids: ["ifIndex": "1.3.6.1.2.1.2.2.1.1", "ifName": "1.3.6.1.2.1.31.1.1.1.1", "ifOperStatus": "1.3.6.1.2.1.2.2.1.8"]
]

// --- hwLacpPartnerMisconnect (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.41.3.51
// Fields: hwTrunkIfID, ifName, ifName
// Description: The peer link of the LACP member interface might be incorrectly connected. 1. hwTrunkIfID: The identification of the Trunk interface; 2. ifName: It is the name of the trunk in the ifXTable of IF-MIB. ...
trapMap["1.3.6.1.4.1.2011.5.25.41.3.51"] = [
    name: "hwLacpPartnerMisconnect",
    fields: ["hwTrunkIfID", "ifName", "ifName"],
    fieldOids: ["hwTrunkIfID": "1.3.6.1.4.1.2011.5.25.41.1.3.3.1.2", "ifName": "1.3.6.1.2.1.31.1.1.1.1"]
]

// --- hwLacpPartnerMisconnectResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.41.3.52
// Fields: hwTrunkIfID, ifName, ifName
// Description: The peer link of the LACP member interface was correctly connected. 1. hwTrunkIfID: The identification of the Trunk interface; 2. ifName: It is the name of the trunk in the ifXTable of IF-MIB. 3. ifNa...
trapMap["1.3.6.1.4.1.2011.5.25.41.3.52"] = [
    name: "hwLacpPartnerMisconnectResume",
    fields: ["hwTrunkIfID", "ifName", "ifName"],
    fieldOids: ["hwTrunkIfID": "1.3.6.1.4.1.2011.5.25.41.1.3.3.1.2", "ifName": "1.3.6.1.2.1.31.1.1.1.1"]
]

// --- hwTrunkMemberChange (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.41.3.53
// Fields: hwType, hwEthTrunkIfIndex, hwTrunkName, hwPortIfIndexList, hwPortNameList
// Description: Trap message is generated when eth-trunk member changed.
trapMap["1.3.6.1.4.1.2011.5.25.41.3.53"] = [
    name: "hwTrunkMemberChange",
    fields: ["hwType", "hwEthTrunkIfIndex", "hwTrunkName", "hwPortIfIndexList", "hwPortNameList"],
    fieldOids: ["hwType": "1.3.6.1.4.1.2011.5.25.41.1.20.15", "hwEthTrunkIfIndex": "1.3.6.1.4.1.2011.5.25.41.1.20.16", "hwTrunkName": "1.3.6.1.4.1.2011.5.25.41.1.20.17", "hwPortIfIndexList": "1.3.6.1.4.1.2011.5.25.41.1.20.18", "hwPortNameList": "1.3.6.1.4.1.2011.5.25.41.1.20.19"]
]

// --- hwTrunkStatusChange (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.41.3.54
// Fields: hwTrunkIfDescr, ifAdminStatus, hwTrunkIfStatus
// Description: The trunk interface status changes.
trapMap["1.3.6.1.4.1.2011.5.25.41.3.54"] = [
    name: "hwTrunkStatusChange",
    fields: ["hwTrunkIfDescr", "ifAdminStatus", "hwTrunkIfStatus"],
    fieldOids: ["hwTrunkIfDescr": "1.3.6.1.4.1.2011.5.25.41.1.20.5", "ifAdminStatus": "1.3.6.1.2.1.2.2.1.7", "hwTrunkIfStatus": "1.3.6.1.4.1.2011.5.25.41.1.20.14"]
]

// --- hwIfDampSuppress (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.41.3.55
// Fields: ifName, hwIFExtDampStatus
// Description: This notification indicates the time when the interface's physical status changes from unsuppress to suppress.
trapMap["1.3.6.1.4.1.2011.5.25.41.3.55"] = [
    name: "hwIfDampSuppress",
    fields: ["ifName", "hwIFExtDampStatus"],
    fieldOids: ["ifName": "1.3.6.1.2.1.31.1.1.1.1", "hwIFExtDampStatus": "1.3.6.1.4.1.2011.5.25.41.1.1.1.1.41"]
]

// --- hwIfDampResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.41.3.56
// Fields: ifName, hwIFExtDampStatus
// Description: This notification indicates the time when the interface's physical status changes from suppress to unsuppress.
trapMap["1.3.6.1.4.1.2011.5.25.41.3.56"] = [
    name: "hwIfDampResume",
    fields: ["ifName", "hwIFExtDampStatus"],
    fieldOids: ["ifName": "1.3.6.1.2.1.31.1.1.1.1", "hwIFExtDampStatus": "1.3.6.1.4.1.2011.5.25.41.1.1.1.1.41"]
]

// --- hwTrunkBwChange (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.41.3.57
// Fields: hwTrunkIfDescr, hwIfBandWidth, hwIfBandWidth
// Description: The trunk interface bandwidth changes.
trapMap["1.3.6.1.4.1.2011.5.25.41.3.57"] = [
    name: "hwTrunkBwChange",
    fields: ["hwTrunkIfDescr", "hwIfBandWidth", "hwIfBandWidth"],
    fieldOids: ["hwTrunkIfDescr": "1.3.6.1.4.1.2011.5.25.41.1.20.5", "hwIfBandWidth": "1.3.6.1.4.1.2011.5.25.41.1.20.20"]
]

// --- hwLacpStateDown (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.41.3.58
// Fields: hwTrunkIfID, ifName, ifName
// Description: he LACP status of the member port changes. 1. hwTrunkIfID: The identification of the Trunk interface; 2. ifName: It is the name of the trunk in the ifXTable of IF-MIB. 3. ifName: It is the name of the...
trapMap["1.3.6.1.4.1.2011.5.25.41.3.58"] = [
    name: "hwLacpStateDown",
    fields: ["hwTrunkIfID", "ifName", "ifName"],
    fieldOids: ["hwTrunkIfID": "1.3.6.1.4.1.2011.5.25.41.1.3.3.1.2", "ifName": "1.3.6.1.2.1.31.1.1.1.1"]
]

// --- hwLacpStateDownResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.41.3.59
// Fields: hwTrunkIfID, ifName, ifName
// Description: he LACP status of the member port changes. 1. hwTrunkIfID: The identification of the Trunk interface; 2. ifName: It is the name of the trunk in the ifXTable of IF-MIB. 3. ifName: It is the name of the...
trapMap["1.3.6.1.4.1.2011.5.25.41.3.59"] = [
    name: "hwLacpStateDownResume",
    fields: ["hwTrunkIfID", "ifName", "ifName"],
    fieldOids: ["hwTrunkIfID": "1.3.6.1.4.1.2011.5.25.41.1.3.3.1.2", "ifName": "1.3.6.1.2.1.31.1.1.1.1"]
]

// --- hwIfIPConflict (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.41.3.60
// Fields: ifIndex, ifName
// Description: This notification is generated when an IPv4 address of the interface conflicts with that of another interface.
trapMap["1.3.6.1.4.1.2011.5.25.41.3.60"] = [
    name: "hwIfIPConflict",
    fields: ["ifIndex", "ifName"],
    fieldOids: ["ifIndex": "1.3.6.1.2.1.2.2.1.1", "ifName": "1.3.6.1.2.1.31.1.1.1.1"]
]

// --- hwIfIPConflictResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.41.3.61
// Fields: ifIndex, ifName
// Description: The IPv4 address conflict is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.41.3.61"] = [
    name: "hwIfIPConflictResume",
    fields: ["ifIndex", "ifName"],
    fieldOids: ["ifIndex": "1.3.6.1.2.1.2.2.1.1", "ifName": "1.3.6.1.2.1.31.1.1.1.1"]
]

// --- hwIPv4IfStateAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.41.3.62
// Fields: ifIndex, ifName, ifOperStatus, hwIPv4StateChangeReason
// Description: The interface IPv4 status changes.
trapMap["1.3.6.1.4.1.2011.5.25.41.3.62"] = [
    name: "hwIPv4IfStateAlarm",
    fields: ["ifIndex", "ifName", "ifOperStatus", "hwIPv4StateChangeReason"],
    fieldOids: ["ifIndex": "1.3.6.1.2.1.2.2.1.1", "ifName": "1.3.6.1.2.1.31.1.1.1.1", "ifOperStatus": "1.3.6.1.2.1.2.2.1.8", "hwIPv4StateChangeReason": "1.3.6.1.4.1.2011.5.25.41.1.20.21"]
]

// --- hwIPv4IfStateAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.41.3.63
// Fields: ifIndex, ifName, ifOperStatus, hwIPv4StateChangeReason
// Description: The interface IPv4 status changes.
trapMap["1.3.6.1.4.1.2011.5.25.41.3.63"] = [
    name: "hwIPv4IfStateAlarmResume",
    fields: ["ifIndex", "ifName", "ifOperStatus", "hwIPv4StateChangeReason"],
    fieldOids: ["ifIndex": "1.3.6.1.2.1.2.2.1.1", "ifName": "1.3.6.1.2.1.31.1.1.1.1", "ifOperStatus": "1.3.6.1.2.1.2.2.1.8", "hwIPv4StateChangeReason": "1.3.6.1.4.1.2011.5.25.41.1.20.21"]
]

// --- hwLacpMlagPartnerMisconnect (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.41.3.64
// Fields: ifName, hwTrunkETrunkId, hwLacpLPartnerSystemID, hwLacpPPartnerSystemID
// Description: The local device in the M-LAG connected to an incorrect partner device.
trapMap["1.3.6.1.4.1.2011.5.25.41.3.64"] = [
    name: "hwLacpMlagPartnerMisconnect",
    fields: ["ifName", "hwTrunkETrunkId", "hwLacpLPartnerSystemID", "hwLacpPPartnerSystemID"],
    fieldOids: ["ifName": "1.3.6.1.2.1.31.1.1.1.1", "hwTrunkETrunkId": "1.3.6.1.4.1.2011.5.25.41.1.20.22", "hwLacpLPartnerSystemID": "1.3.6.1.4.1.2011.5.25.41.1.20.23", "hwLacpPPartnerSystemID": "1.3.6.1.4.1.2011.5.25.41.1.20.24"]
]

// --- hwLacpMlagPartnerMisconnectResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.41.3.65
// Fields: ifName, hwTrunkETrunkId
// Description: The local device in the M-LAG connected to an correct partner device.
trapMap["1.3.6.1.4.1.2011.5.25.41.3.65"] = [
    name: "hwLacpMlagPartnerMisconnectResume",
    fields: ["ifName", "hwTrunkETrunkId"],
    fieldOids: ["ifName": "1.3.6.1.2.1.31.1.1.1.1", "hwTrunkETrunkId": "1.3.6.1.4.1.2011.5.25.41.1.20.22"]
]

// --- hwSliceIfBwNotEnough (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.41.3.66
// Fields: ifIndex, ifName, hwIfBandWidth, hwIfBandWidth
// Description: The slice interface bandwidth is less than the outer interface bandwidth.
trapMap["1.3.6.1.4.1.2011.5.25.41.3.66"] = [
    name: "hwSliceIfBwNotEnough",
    fields: ["ifIndex", "ifName", "hwIfBandWidth", "hwIfBandWidth"],
    fieldOids: ["ifIndex": "1.3.6.1.2.1.2.2.1.1", "ifName": "1.3.6.1.2.1.31.1.1.1.1", "hwIfBandWidth": "1.3.6.1.4.1.2011.5.25.41.1.20.20"]
]

// --- hwSliceIfBwNotEnoughResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.41.3.67
// Fields: ifIndex, ifName, hwIfBandWidth, hwIfBandWidth
// Description: The slice interface bandwidth is not less than the outer interface bandwidth.
trapMap["1.3.6.1.4.1.2011.5.25.41.3.67"] = [
    name: "hwSliceIfBwNotEnoughResume",
    fields: ["ifIndex", "ifName", "hwIfBandWidth", "hwIfBandWidth"],
    fieldOids: ["ifIndex": "1.3.6.1.2.1.2.2.1.1", "ifName": "1.3.6.1.2.1.31.1.1.1.1", "hwIfBandWidth": "1.3.6.1.4.1.2011.5.25.41.1.20.20"]
]

// --- hwIfMonitorCrcErrorRising (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.41.4.1
// Fields: hwIfMonitorCrcErrorStatistics, hwIfMonitorCrcErrorThreshold, hwIfMonitorCrcErrorInterval, hwIfMonitorName, hwIfMonitorAllStatistics
// Description: This object indicates that an alarm is generated when a CRC error occurs.
trapMap["1.3.6.1.4.1.2011.5.25.41.4.1"] = [
    name: "hwIfMonitorCrcErrorRising",
    fields: ["hwIfMonitorCrcErrorStatistics", "hwIfMonitorCrcErrorThreshold", "hwIfMonitorCrcErrorInterval", "hwIfMonitorName", "hwIfMonitorAllStatistics"],
    fieldOids: ["hwIfMonitorCrcErrorStatistics": "1.3.6.1.4.1.2011.5.25.41.1.7.1.1.2", "hwIfMonitorCrcErrorThreshold": "1.3.6.1.4.1.2011.5.25.41.1.7.1.1.3", "hwIfMonitorCrcErrorInterval": "1.3.6.1.4.1.2011.5.25.41.1.7.1.1.4", "hwIfMonitorName": "1.3.6.1.4.1.2011.5.25.41.1.7.1.1.19", "hwIfMonitorAllStatistics": "1.3.6.1.4.1.2011.5.25.41.1.7.1.1.29"]
]

// --- hwIfMonitorCrcErrorResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.41.4.2
// Fields: hwIfMonitorCrcErrorStatistics, hwIfMonitorCrcErrorThreshold, hwIfMonitorCrcErrorInterval, hwIfMonitorName, hwIfMonitorAllStatistics
// Description: This object indicates that a clear alarm is generated when the CRC error is removed.
trapMap["1.3.6.1.4.1.2011.5.25.41.4.2"] = [
    name: "hwIfMonitorCrcErrorResume",
    fields: ["hwIfMonitorCrcErrorStatistics", "hwIfMonitorCrcErrorThreshold", "hwIfMonitorCrcErrorInterval", "hwIfMonitorName", "hwIfMonitorAllStatistics"],
    fieldOids: ["hwIfMonitorCrcErrorStatistics": "1.3.6.1.4.1.2011.5.25.41.1.7.1.1.2", "hwIfMonitorCrcErrorThreshold": "1.3.6.1.4.1.2011.5.25.41.1.7.1.1.3", "hwIfMonitorCrcErrorInterval": "1.3.6.1.4.1.2011.5.25.41.1.7.1.1.4", "hwIfMonitorName": "1.3.6.1.4.1.2011.5.25.41.1.7.1.1.19", "hwIfMonitorAllStatistics": "1.3.6.1.4.1.2011.5.25.41.1.7.1.1.29"]
]

// --- hwIfMonitorSdhErrorRising (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.41.4.3
// Fields: hwIfMonitorSdhErrorStatistics, hwIfMonitorSdhErrorThreshold, hwIfMonitorSdhErrorInterval, hwIfMonitorName
// Description: This object indicates that an alarm is generated when an SDH B3 error occurs.
trapMap["1.3.6.1.4.1.2011.5.25.41.4.3"] = [
    name: "hwIfMonitorSdhErrorRising",
    fields: ["hwIfMonitorSdhErrorStatistics", "hwIfMonitorSdhErrorThreshold", "hwIfMonitorSdhErrorInterval", "hwIfMonitorName"],
    fieldOids: ["hwIfMonitorSdhErrorStatistics": "1.3.6.1.4.1.2011.5.25.41.1.7.1.1.5", "hwIfMonitorSdhErrorThreshold": "1.3.6.1.4.1.2011.5.25.41.1.7.1.1.6", "hwIfMonitorSdhErrorInterval": "1.3.6.1.4.1.2011.5.25.41.1.7.1.1.7", "hwIfMonitorName": "1.3.6.1.4.1.2011.5.25.41.1.7.1.1.19"]
]

// --- hwIfMonitorSdhErrorResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.41.4.4
// Fields: hwIfMonitorSdhErrorStatistics, hwIfMonitorSdhErrorThreshold, hwIfMonitorSdhErrorInterval, hwIfMonitorName
// Description: This object indicates that a clear alarm is generated when the SDH B3 error is removed.
trapMap["1.3.6.1.4.1.2011.5.25.41.4.4"] = [
    name: "hwIfMonitorSdhErrorResume",
    fields: ["hwIfMonitorSdhErrorStatistics", "hwIfMonitorSdhErrorThreshold", "hwIfMonitorSdhErrorInterval", "hwIfMonitorName"],
    fieldOids: ["hwIfMonitorSdhErrorStatistics": "1.3.6.1.4.1.2011.5.25.41.1.7.1.1.5", "hwIfMonitorSdhErrorThreshold": "1.3.6.1.4.1.2011.5.25.41.1.7.1.1.6", "hwIfMonitorSdhErrorInterval": "1.3.6.1.4.1.2011.5.25.41.1.7.1.1.7", "hwIfMonitorName": "1.3.6.1.4.1.2011.5.25.41.1.7.1.1.19"]
]

// --- hwIfMonitorInputRateRising (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.41.4.5
// Fields: hwIfMonitorInputRate, hwIfMonitorInputRateThreshold, hwIfMonitorName
// Description: Input rate alarm notification
trapMap["1.3.6.1.4.1.2011.5.25.41.4.5"] = [
    name: "hwIfMonitorInputRateRising",
    fields: ["hwIfMonitorInputRate", "hwIfMonitorInputRateThreshold", "hwIfMonitorName"],
    fieldOids: ["hwIfMonitorInputRate": "1.3.6.1.4.1.2011.5.25.41.1.7.1.1.8", "hwIfMonitorInputRateThreshold": "1.3.6.1.4.1.2011.5.25.41.1.7.1.1.9", "hwIfMonitorName": "1.3.6.1.4.1.2011.5.25.41.1.7.1.1.19"]
]

// --- hwIfMonitorInputRateResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.41.4.6
// Fields: hwIfMonitorInputRate, hwIfMonitorInputRateThreshold, hwIfMonitorName
// Description: Input rate alarm resume
trapMap["1.3.6.1.4.1.2011.5.25.41.4.6"] = [
    name: "hwIfMonitorInputRateResume",
    fields: ["hwIfMonitorInputRate", "hwIfMonitorInputRateThreshold", "hwIfMonitorName"],
    fieldOids: ["hwIfMonitorInputRate": "1.3.6.1.4.1.2011.5.25.41.1.7.1.1.8", "hwIfMonitorInputRateThreshold": "1.3.6.1.4.1.2011.5.25.41.1.7.1.1.9", "hwIfMonitorName": "1.3.6.1.4.1.2011.5.25.41.1.7.1.1.19"]
]

// --- hwIfMonitorOutputRateRising (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.41.4.7
// Fields: hwIfMonitorOutputRate, hwIfMonitorOutputRateThreshold, hwIfMonitorName
// Description: Output rate alarm notification
trapMap["1.3.6.1.4.1.2011.5.25.41.4.7"] = [
    name: "hwIfMonitorOutputRateRising",
    fields: ["hwIfMonitorOutputRate", "hwIfMonitorOutputRateThreshold", "hwIfMonitorName"],
    fieldOids: ["hwIfMonitorOutputRate": "1.3.6.1.4.1.2011.5.25.41.1.7.1.1.10", "hwIfMonitorOutputRateThreshold": "1.3.6.1.4.1.2011.5.25.41.1.7.1.1.11", "hwIfMonitorName": "1.3.6.1.4.1.2011.5.25.41.1.7.1.1.19"]
]

// --- hwIfMonitorOutputRateResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.41.4.8
// Fields: hwIfMonitorOutputRate, hwIfMonitorOutputRateThreshold, hwIfMonitorName
// Description: Output rate alarm resume
trapMap["1.3.6.1.4.1.2011.5.25.41.4.8"] = [
    name: "hwIfMonitorOutputRateResume",
    fields: ["hwIfMonitorOutputRate", "hwIfMonitorOutputRateThreshold", "hwIfMonitorName"],
    fieldOids: ["hwIfMonitorOutputRate": "1.3.6.1.4.1.2011.5.25.41.1.7.1.1.10", "hwIfMonitorOutputRateThreshold": "1.3.6.1.4.1.2011.5.25.41.1.7.1.1.11", "hwIfMonitorName": "1.3.6.1.4.1.2011.5.25.41.1.7.1.1.19"]
]

// --- hwIfMonitorHalfDuplexRising (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.41.4.9
// Fields: ifDescr
// Description: Interface half duplex alarm norification
trapMap["1.3.6.1.4.1.2011.5.25.41.4.9"] = [
    name: "hwIfMonitorHalfDuplexRising",
    fields: ["ifDescr"],
    fieldOids: ["ifDescr": "1.3.6.1.2.1.2.2.1.2"]
]

// --- hwIfMonitorPauseFrameRising (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.41.4.10
// Fields: hwIfMonitorPauseFrameStatistics, hwIfMonitorPauseFrameThreshold, hwIfMonitorPauseFrameInterval, hwIfMonitorName
// Description: This object indicates the pause frame alarm.
trapMap["1.3.6.1.4.1.2011.5.25.41.4.10"] = [
    name: "hwIfMonitorPauseFrameRising",
    fields: ["hwIfMonitorPauseFrameStatistics", "hwIfMonitorPauseFrameThreshold", "hwIfMonitorPauseFrameInterval", "hwIfMonitorName"],
    fieldOids: ["hwIfMonitorPauseFrameStatistics": "1.3.6.1.4.1.2011.5.25.41.1.7.1.1.12", "hwIfMonitorPauseFrameThreshold": "1.3.6.1.4.1.2011.5.25.41.1.7.1.1.13", "hwIfMonitorPauseFrameInterval": "1.3.6.1.4.1.2011.5.25.41.1.7.1.1.14", "hwIfMonitorName": "1.3.6.1.4.1.2011.5.25.41.1.7.1.1.19"]
]

// --- hwIfMonitorPauseFrameRisingResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.41.4.11
// Fields: hwIfMonitorPauseFrameStatistics, hwIfMonitorPauseFrameThreshold, hwIfMonitorPauseFrameInterval, hwIfMonitorName
// Description: This object indicates that the pause frame alarm is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.41.4.11"] = [
    name: "hwIfMonitorPauseFrameRisingResume",
    fields: ["hwIfMonitorPauseFrameStatistics", "hwIfMonitorPauseFrameThreshold", "hwIfMonitorPauseFrameInterval", "hwIfMonitorName"],
    fieldOids: ["hwIfMonitorPauseFrameStatistics": "1.3.6.1.4.1.2011.5.25.41.1.7.1.1.12", "hwIfMonitorPauseFrameThreshold": "1.3.6.1.4.1.2011.5.25.41.1.7.1.1.13", "hwIfMonitorPauseFrameInterval": "1.3.6.1.4.1.2011.5.25.41.1.7.1.1.14", "hwIfMonitorName": "1.3.6.1.4.1.2011.5.25.41.1.7.1.1.19"]
]

// --- hwIfPortControlUp (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.41.4.12
// Fields: ifName
// Description: Control Up alarm notification
trapMap["1.3.6.1.4.1.2011.5.25.41.4.12"] = [
    name: "hwIfPortControlUp",
    fields: ["ifName"],
    fieldOids: ["ifName": "1.3.6.1.2.1.31.1.1.1.1"]
]

// --- hwIfPortControlDown (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.41.4.13
// Fields: ifName
// Description: Control Down alarm notification
trapMap["1.3.6.1.4.1.2011.5.25.41.4.13"] = [
    name: "hwIfPortControlDown",
    fields: ["ifName"],
    fieldOids: ["ifName": "1.3.6.1.2.1.31.1.1.1.1"]
]

// --- hwIfMonitorSdhB1ErrorRising (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.41.4.14
// Fields: hwIfMonitorSdhB1ErrorStatistics, hwIfMonitorSdhB1ErrorThreshold, hwIfMonitorSdhB1ErrorInterval, hwIfMonitorName
// Description: This object indicates that an alarm is generated when the number of SDH B1 bit errors exceeds the upper threshold.
trapMap["1.3.6.1.4.1.2011.5.25.41.4.14"] = [
    name: "hwIfMonitorSdhB1ErrorRising",
    fields: ["hwIfMonitorSdhB1ErrorStatistics", "hwIfMonitorSdhB1ErrorThreshold", "hwIfMonitorSdhB1ErrorInterval", "hwIfMonitorName"],
    fieldOids: ["hwIfMonitorSdhB1ErrorStatistics": "1.3.6.1.4.1.2011.5.25.41.1.7.1.1.20", "hwIfMonitorSdhB1ErrorThreshold": "1.3.6.1.4.1.2011.5.25.41.1.7.1.1.21", "hwIfMonitorSdhB1ErrorInterval": "1.3.6.1.4.1.2011.5.25.41.1.7.1.1.22", "hwIfMonitorName": "1.3.6.1.4.1.2011.5.25.41.1.7.1.1.19"]
]

// --- hwIfMonitorSdhB1ErrorResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.41.4.15
// Fields: hwIfMonitorSdhB1ErrorStatistics, hwIfMonitorSdhB1ErrorThreshold, hwIfMonitorSdhB1ErrorInterval, hwIfMonitorName
// Description: This object indicates that a clear alarm is generated when the number of SDH B1 bit errors falls below the upper threshold.
trapMap["1.3.6.1.4.1.2011.5.25.41.4.15"] = [
    name: "hwIfMonitorSdhB1ErrorResume",
    fields: ["hwIfMonitorSdhB1ErrorStatistics", "hwIfMonitorSdhB1ErrorThreshold", "hwIfMonitorSdhB1ErrorInterval", "hwIfMonitorName"],
    fieldOids: ["hwIfMonitorSdhB1ErrorStatistics": "1.3.6.1.4.1.2011.5.25.41.1.7.1.1.20", "hwIfMonitorSdhB1ErrorThreshold": "1.3.6.1.4.1.2011.5.25.41.1.7.1.1.21", "hwIfMonitorSdhB1ErrorInterval": "1.3.6.1.4.1.2011.5.25.41.1.7.1.1.22", "hwIfMonitorName": "1.3.6.1.4.1.2011.5.25.41.1.7.1.1.19"]
]

// --- hwIfMonitorSdhB2ErrorRising (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.41.4.16
// Fields: hwIfMonitorSdhB2ErrorStatistics, hwIfMonitorSdhB2ErrorThreshold, hwIfMonitorSdhB2ErrorInterval, hwIfMonitorName
// Description: This object indicates that an alarm is generated when the number of SDH B2 bit errors exceeds the upper threshold.
trapMap["1.3.6.1.4.1.2011.5.25.41.4.16"] = [
    name: "hwIfMonitorSdhB2ErrorRising",
    fields: ["hwIfMonitorSdhB2ErrorStatistics", "hwIfMonitorSdhB2ErrorThreshold", "hwIfMonitorSdhB2ErrorInterval", "hwIfMonitorName"],
    fieldOids: ["hwIfMonitorSdhB2ErrorStatistics": "1.3.6.1.4.1.2011.5.25.41.1.7.1.1.23", "hwIfMonitorSdhB2ErrorThreshold": "1.3.6.1.4.1.2011.5.25.41.1.7.1.1.24", "hwIfMonitorSdhB2ErrorInterval": "1.3.6.1.4.1.2011.5.25.41.1.7.1.1.25", "hwIfMonitorName": "1.3.6.1.4.1.2011.5.25.41.1.7.1.1.19"]
]

// --- hwIfMonitorSdhB2ErrorResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.41.4.17
// Fields: hwIfMonitorSdhB2ErrorStatistics, hwIfMonitorSdhB2ErrorThreshold, hwIfMonitorSdhB2ErrorInterval, hwIfMonitorName
// Description: This object indicates that a clear alarm is generated when the number of SDH B2 bit errors falls below the upper threshold.
trapMap["1.3.6.1.4.1.2011.5.25.41.4.17"] = [
    name: "hwIfMonitorSdhB2ErrorResume",
    fields: ["hwIfMonitorSdhB2ErrorStatistics", "hwIfMonitorSdhB2ErrorThreshold", "hwIfMonitorSdhB2ErrorInterval", "hwIfMonitorName"],
    fieldOids: ["hwIfMonitorSdhB2ErrorStatistics": "1.3.6.1.4.1.2011.5.25.41.1.7.1.1.23", "hwIfMonitorSdhB2ErrorThreshold": "1.3.6.1.4.1.2011.5.25.41.1.7.1.1.24", "hwIfMonitorSdhB2ErrorInterval": "1.3.6.1.4.1.2011.5.25.41.1.7.1.1.25", "hwIfMonitorName": "1.3.6.1.4.1.2011.5.25.41.1.7.1.1.19"]
]

// --- hwIfMonitorSymbolErrorRising (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.41.4.18
// Fields: hwIfMonitorSymbolErrorStatistics, hwIfMonitorSymbolErrorThreshold, hwIfMonitorSymbolErrorInterval, hwIfMonitorName
// Description: This object indicates that an alarm is generated when a symbol error occurs on an interface.
trapMap["1.3.6.1.4.1.2011.5.25.41.4.18"] = [
    name: "hwIfMonitorSymbolErrorRising",
    fields: ["hwIfMonitorSymbolErrorStatistics", "hwIfMonitorSymbolErrorThreshold", "hwIfMonitorSymbolErrorInterval", "hwIfMonitorName"],
    fieldOids: ["hwIfMonitorSymbolErrorStatistics": "1.3.6.1.4.1.2011.5.25.41.1.7.1.1.26", "hwIfMonitorSymbolErrorThreshold": "1.3.6.1.4.1.2011.5.25.41.1.7.1.1.27", "hwIfMonitorSymbolErrorInterval": "1.3.6.1.4.1.2011.5.25.41.1.7.1.1.28", "hwIfMonitorName": "1.3.6.1.4.1.2011.5.25.41.1.7.1.1.19"]
]

// --- hwIfMonitorSymbolErrorResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.41.4.19
// Fields: hwIfMonitorSymbolErrorStatistics, hwIfMonitorSymbolErrorThreshold, hwIfMonitorSymbolErrorInterval, hwIfMonitorName
// Description: This object indicates that a clear alarm is generated when the symbol error on the interface is removed.
trapMap["1.3.6.1.4.1.2011.5.25.41.4.19"] = [
    name: "hwIfMonitorSymbolErrorResume",
    fields: ["hwIfMonitorSymbolErrorStatistics", "hwIfMonitorSymbolErrorThreshold", "hwIfMonitorSymbolErrorInterval", "hwIfMonitorName"],
    fieldOids: ["hwIfMonitorSymbolErrorStatistics": "1.3.6.1.4.1.2011.5.25.41.1.7.1.1.26", "hwIfMonitorSymbolErrorThreshold": "1.3.6.1.4.1.2011.5.25.41.1.7.1.1.27", "hwIfMonitorSymbolErrorInterval": "1.3.6.1.4.1.2011.5.25.41.1.7.1.1.28", "hwIfMonitorName": "1.3.6.1.4.1.2011.5.25.41.1.7.1.1.19"]
]

// --- hwIfMonitorBadBytesErrorRising (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.41.4.40
// Fields: hwIfMonitorBadBytesErrorStatistics, hwIfMonitorBadBytesErrorThreshold, hwIfMonitorBadBytesErrorInterval, hwIfMonitorName
// Description: This object indicates that an alarm is generated when the number of bytes of error packets exceeds the upper threshold.
trapMap["1.3.6.1.4.1.2011.5.25.41.4.40"] = [
    name: "hwIfMonitorBadBytesErrorRising",
    fields: ["hwIfMonitorBadBytesErrorStatistics", "hwIfMonitorBadBytesErrorThreshold", "hwIfMonitorBadBytesErrorInterval", "hwIfMonitorName"],
    fieldOids: ["hwIfMonitorBadBytesErrorStatistics": "1.3.6.1.4.1.2011.5.25.41.1.7.1.1.40", "hwIfMonitorBadBytesErrorThreshold": "1.3.6.1.4.1.2011.5.25.41.1.7.1.1.41", "hwIfMonitorBadBytesErrorInterval": "1.3.6.1.4.1.2011.5.25.41.1.7.1.1.42", "hwIfMonitorName": "1.3.6.1.4.1.2011.5.25.41.1.7.1.1.19"]
]

// --- hwIfMonitorBadBytesErrorResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.41.4.41
// Fields: hwIfMonitorBadBytesErrorStatistics, hwIfMonitorBadBytesErrorThreshold, hwIfMonitorBadBytesErrorInterval, hwIfMonitorName
// Description: This object indicates that a clear alarm is generated when the number of bytes of error packets falls below the upper threshold.
trapMap["1.3.6.1.4.1.2011.5.25.41.4.41"] = [
    name: "hwIfMonitorBadBytesErrorResume",
    fields: ["hwIfMonitorBadBytesErrorStatistics", "hwIfMonitorBadBytesErrorThreshold", "hwIfMonitorBadBytesErrorInterval", "hwIfMonitorName"],
    fieldOids: ["hwIfMonitorBadBytesErrorStatistics": "1.3.6.1.4.1.2011.5.25.41.1.7.1.1.40", "hwIfMonitorBadBytesErrorThreshold": "1.3.6.1.4.1.2011.5.25.41.1.7.1.1.41", "hwIfMonitorBadBytesErrorInterval": "1.3.6.1.4.1.2011.5.25.41.1.7.1.1.42", "hwIfMonitorName": "1.3.6.1.4.1.2011.5.25.41.1.7.1.1.19"]
]

// --- hwIfMonitorTxPauseFrameRising (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.41.4.42
// Fields: hwIfMonitorTxPauseFrameStatistics, hwIfMonitorTxPauseFrameHighThreshold, hwIfMonitorTxPauseFrameLowThreshold, hwIfMonitorTxPauseFrameInterval, hwIfMonitorName
// Description: This object indicates that an alarm is generated when pause frames are sent.
trapMap["1.3.6.1.4.1.2011.5.25.41.4.42"] = [
    name: "hwIfMonitorTxPauseFrameRising",
    fields: ["hwIfMonitorTxPauseFrameStatistics", "hwIfMonitorTxPauseFrameHighThreshold", "hwIfMonitorTxPauseFrameLowThreshold", "hwIfMonitorTxPauseFrameInterval", "hwIfMonitorName"],
    fieldOids: ["hwIfMonitorTxPauseFrameStatistics": "1.3.6.1.4.1.2011.5.25.41.1.7.1.1.43", "hwIfMonitorTxPauseFrameHighThreshold": "1.3.6.1.4.1.2011.5.25.41.1.7.1.1.44", "hwIfMonitorTxPauseFrameLowThreshold": "1.3.6.1.4.1.2011.5.25.41.1.7.1.1.45", "hwIfMonitorTxPauseFrameInterval": "1.3.6.1.4.1.2011.5.25.41.1.7.1.1.46", "hwIfMonitorName": "1.3.6.1.4.1.2011.5.25.41.1.7.1.1.19"]
]

// --- hwIfMonitorTxPauseFrameRisingResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.41.4.43
// Fields: hwIfMonitorTxPauseFrameStatistics, hwIfMonitorTxPauseFrameHighThreshold, hwIfMonitorTxPauseFrameLowThreshold, hwIfMonitorTxPauseFrameInterval, hwIfMonitorName
// Description: This object indicates that a clear alarm is generated when sending pause frames is stopped.
trapMap["1.3.6.1.4.1.2011.5.25.41.4.43"] = [
    name: "hwIfMonitorTxPauseFrameRisingResume",
    fields: ["hwIfMonitorTxPauseFrameStatistics", "hwIfMonitorTxPauseFrameHighThreshold", "hwIfMonitorTxPauseFrameLowThreshold", "hwIfMonitorTxPauseFrameInterval", "hwIfMonitorName"],
    fieldOids: ["hwIfMonitorTxPauseFrameStatistics": "1.3.6.1.4.1.2011.5.25.41.1.7.1.1.43", "hwIfMonitorTxPauseFrameHighThreshold": "1.3.6.1.4.1.2011.5.25.41.1.7.1.1.44", "hwIfMonitorTxPauseFrameLowThreshold": "1.3.6.1.4.1.2011.5.25.41.1.7.1.1.45", "hwIfMonitorTxPauseFrameInterval": "1.3.6.1.4.1.2011.5.25.41.1.7.1.1.46", "hwIfMonitorName": "1.3.6.1.4.1.2011.5.25.41.1.7.1.1.19"]
]

// --- hwIfMonitorPostfecErrorRising (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.41.4.44
// Fields: hwIfMonitorName, hwIfMonitorPostFECErrorStatistics
// Description: The post fec error crooected alarm appears.
trapMap["1.3.6.1.4.1.2011.5.25.41.4.44"] = [
    name: "hwIfMonitorPostfecErrorRising",
    fields: ["hwIfMonitorName", "hwIfMonitorPostFECErrorStatistics"],
    fieldOids: ["hwIfMonitorName": "1.3.6.1.4.1.2011.5.25.41.1.7.1.1.19", "hwIfMonitorPostFECErrorStatistics": "1.3.6.1.4.1.2011.5.25.41.1.7.1.1.47"]
]

// --- hwIfMonitorPostfecErrorRisingResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.41.4.45
// Fields: hwIfMonitorName, hwIfMonitorPostFECErrorStatistics
// Description: The post fec error crooected alarm disappears.
trapMap["1.3.6.1.4.1.2011.5.25.41.4.45"] = [
    name: "hwIfMonitorPostfecErrorRisingResume",
    fields: ["hwIfMonitorName", "hwIfMonitorPostFECErrorStatistics"],
    fieldOids: ["hwIfMonitorName": "1.3.6.1.4.1.2011.5.25.41.1.7.1.1.19", "hwIfMonitorPostFECErrorStatistics": "1.3.6.1.4.1.2011.5.25.41.1.7.1.1.47"]
]

// --- hwModeChannelRecvExceedThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.41.4.46
// Fields: hwModeChannelRecvFlowOverIfIndex, hwModeChannelRecvFlowOverPercentage, hwModeChannelRecvFlowOverThreshold, hwModeChannelRecvFlowOverInterfaceName
// Description: The alarm appear when the inflow at the channel mode subinterface exceeds the warning threshold.
trapMap["1.3.6.1.4.1.2011.5.25.41.4.46"] = [
    name: "hwModeChannelRecvExceedThreshold",
    fields: ["hwModeChannelRecvFlowOverIfIndex", "hwModeChannelRecvFlowOverPercentage", "hwModeChannelRecvFlowOverThreshold", "hwModeChannelRecvFlowOverInterfaceName"],
    fieldOids: ["hwModeChannelRecvFlowOverIfIndex": "1.3.6.1.4.1.2011.5.25.41.1.24.1.1.1", "hwModeChannelRecvFlowOverPercentage": "1.3.6.1.4.1.2011.5.25.41.1.24.1.1.2", "hwModeChannelRecvFlowOverThreshold": "1.3.6.1.4.1.2011.5.25.41.1.24.1.1.3", "hwModeChannelRecvFlowOverInterfaceName": "1.3.6.1.4.1.2011.5.25.41.1.24.1.1.7"]
]

// --- hwModeChannelRecvExceedThresholdResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.41.4.47
// Fields: hwModeChannelRecvFlowOverIfIndex, hwModeChannelRecvFlowOverPercentage, hwModeChannelRecvFlowOverThreshold, hwModeChannelRecvFlowOverInterfaceName
// Description: The alarm disappear when the inflow at the channel mode subinterface lower than the warning threshold.
trapMap["1.3.6.1.4.1.2011.5.25.41.4.47"] = [
    name: "hwModeChannelRecvExceedThresholdResume",
    fields: ["hwModeChannelRecvFlowOverIfIndex", "hwModeChannelRecvFlowOverPercentage", "hwModeChannelRecvFlowOverThreshold", "hwModeChannelRecvFlowOverInterfaceName"],
    fieldOids: ["hwModeChannelRecvFlowOverIfIndex": "1.3.6.1.4.1.2011.5.25.41.1.24.1.1.1", "hwModeChannelRecvFlowOverPercentage": "1.3.6.1.4.1.2011.5.25.41.1.24.1.1.2", "hwModeChannelRecvFlowOverThreshold": "1.3.6.1.4.1.2011.5.25.41.1.24.1.1.3", "hwModeChannelRecvFlowOverInterfaceName": "1.3.6.1.4.1.2011.5.25.41.1.24.1.1.7"]
]

// --- hwModeChannelSendExceedThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.41.4.48
// Fields: hwModeChannelSendFlowOverIfIndex, hwModeChannelSendFlowOverPercentage, hwModeChannelSendFlowOverThreshold, hwModeChannelSendFlowOverInterfaceName
// Description: The alarm appear when the inflow at the channel mode subinterface exceeds the warning threshold.
trapMap["1.3.6.1.4.1.2011.5.25.41.4.48"] = [
    name: "hwModeChannelSendExceedThreshold",
    fields: ["hwModeChannelSendFlowOverIfIndex", "hwModeChannelSendFlowOverPercentage", "hwModeChannelSendFlowOverThreshold", "hwModeChannelSendFlowOverInterfaceName"],
    fieldOids: ["hwModeChannelSendFlowOverIfIndex": "1.3.6.1.4.1.2011.5.25.41.1.24.2.1.1", "hwModeChannelSendFlowOverPercentage": "1.3.6.1.4.1.2011.5.25.41.1.24.2.1.2", "hwModeChannelSendFlowOverThreshold": "1.3.6.1.4.1.2011.5.25.41.1.24.2.1.3", "hwModeChannelSendFlowOverInterfaceName": "1.3.6.1.4.1.2011.5.25.41.1.24.2.1.4"]
]

// --- hwModeChannelSendExceedThresholdResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.41.4.49
// Fields: hwModeChannelSendFlowOverIfIndex, hwModeChannelSendFlowOverPercentage, hwModeChannelSendFlowOverThreshold, hwModeChannelSendFlowOverInterfaceName
// Description: The alarm disappear when the inflow at the channel mode subinterface lower than the warning threshold.
trapMap["1.3.6.1.4.1.2011.5.25.41.4.49"] = [
    name: "hwModeChannelSendExceedThresholdResume",
    fields: ["hwModeChannelSendFlowOverIfIndex", "hwModeChannelSendFlowOverPercentage", "hwModeChannelSendFlowOverThreshold", "hwModeChannelSendFlowOverInterfaceName"],
    fieldOids: ["hwModeChannelSendFlowOverIfIndex": "1.3.6.1.4.1.2011.5.25.41.1.24.2.1.1", "hwModeChannelSendFlowOverPercentage": "1.3.6.1.4.1.2011.5.25.41.1.24.2.1.2", "hwModeChannelSendFlowOverThreshold": "1.3.6.1.4.1.2011.5.25.41.1.24.2.1.3", "hwModeChannelSendFlowOverInterfaceName": "1.3.6.1.4.1.2011.5.25.41.1.24.2.1.4"]
]

// --- hwSubChannelBandwidthRising (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.41.4.50
// Fields: hwSubChannelBandwidthIfIndex, hwSubChannelBandwidthValue
// Description: The alarm appear when the sum of channel mode subinterfaces bandwitch exceeded the bandwitch of father interface.
trapMap["1.3.6.1.4.1.2011.5.25.41.4.50"] = [
    name: "hwSubChannelBandwidthRising",
    fields: ["hwSubChannelBandwidthIfIndex", "hwSubChannelBandwidthValue"],
    fieldOids: ["hwSubChannelBandwidthIfIndex": "1.3.6.1.4.1.2011.5.25.41.1.24.3.1.1", "hwSubChannelBandwidthValue": "1.3.6.1.4.1.2011.5.25.41.1.24.3.1.2"]
]

// --- hwSubChannelBandwidthResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.41.4.51
// Fields: hwSubChannelBandwidthIfIndex, hwSubChannelBandwidthValue
// Description: The alarm disappear when the sum of channel mode subinterfaces bandwitch lower than the bandwitch of father interface.
trapMap["1.3.6.1.4.1.2011.5.25.41.4.51"] = [
    name: "hwSubChannelBandwidthResume",
    fields: ["hwSubChannelBandwidthIfIndex", "hwSubChannelBandwidthValue"],
    fieldOids: ["hwSubChannelBandwidthIfIndex": "1.3.6.1.4.1.2011.5.25.41.1.24.3.1.1", "hwSubChannelBandwidthValue": "1.3.6.1.4.1.2011.5.25.41.1.24.3.1.2"]
]

// --- hwModeChannelRecvExceedGeneralThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.41.4.52
// Fields: hwModeChannelRecvFlowOverIfIndex, hwModeChannelRecvFlowOverPercentage, hwModeChannelRecvFlowOverThreshold, hwModeChannelRecvFlowOverInterfaceName
// Description: The alarm appear when the inflow at the channel mode subinterface exceeds the general threshold.
trapMap["1.3.6.1.4.1.2011.5.25.41.4.52"] = [
    name: "hwModeChannelRecvExceedGeneralThreshold",
    fields: ["hwModeChannelRecvFlowOverIfIndex", "hwModeChannelRecvFlowOverPercentage", "hwModeChannelRecvFlowOverThreshold", "hwModeChannelRecvFlowOverInterfaceName"],
    fieldOids: ["hwModeChannelRecvFlowOverIfIndex": "1.3.6.1.4.1.2011.5.25.41.1.24.1.1.1", "hwModeChannelRecvFlowOverPercentage": "1.3.6.1.4.1.2011.5.25.41.1.24.1.1.2", "hwModeChannelRecvFlowOverThreshold": "1.3.6.1.4.1.2011.5.25.41.1.24.1.1.3", "hwModeChannelRecvFlowOverInterfaceName": "1.3.6.1.4.1.2011.5.25.41.1.24.1.1.7"]
]

// --- hwModeChannelRecvExceedGeneralThresholdResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.41.4.53
// Fields: hwModeChannelRecvFlowOverIfIndex, hwModeChannelRecvFlowOverPercentage, hwModeChannelRecvFlowOverThreshold, hwModeChannelRecvFlowOverInterfaceName
// Description: The alarm disappear when the inflow at the channel mode subinterface lower than the general threshold.
trapMap["1.3.6.1.4.1.2011.5.25.41.4.53"] = [
    name: "hwModeChannelRecvExceedGeneralThresholdResume",
    fields: ["hwModeChannelRecvFlowOverIfIndex", "hwModeChannelRecvFlowOverPercentage", "hwModeChannelRecvFlowOverThreshold", "hwModeChannelRecvFlowOverInterfaceName"],
    fieldOids: ["hwModeChannelRecvFlowOverIfIndex": "1.3.6.1.4.1.2011.5.25.41.1.24.1.1.1", "hwModeChannelRecvFlowOverPercentage": "1.3.6.1.4.1.2011.5.25.41.1.24.1.1.2", "hwModeChannelRecvFlowOverThreshold": "1.3.6.1.4.1.2011.5.25.41.1.24.1.1.3", "hwModeChannelRecvFlowOverInterfaceName": "1.3.6.1.4.1.2011.5.25.41.1.24.1.1.7"]
]

// --- hwModeChannelSendExceedGeneralThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.41.4.54
// Fields: hwModeChannelSendFlowOverIfIndex, hwModeChannelSendFlowOverPercentage, hwModeChannelSendFlowOverThreshold, hwModeChannelSendFlowOverInterfaceName
// Description: The alarm appear when the inflow at the channel mode subinterface exceeds the general threshold.
trapMap["1.3.6.1.4.1.2011.5.25.41.4.54"] = [
    name: "hwModeChannelSendExceedGeneralThreshold",
    fields: ["hwModeChannelSendFlowOverIfIndex", "hwModeChannelSendFlowOverPercentage", "hwModeChannelSendFlowOverThreshold", "hwModeChannelSendFlowOverInterfaceName"],
    fieldOids: ["hwModeChannelSendFlowOverIfIndex": "1.3.6.1.4.1.2011.5.25.41.1.24.2.1.1", "hwModeChannelSendFlowOverPercentage": "1.3.6.1.4.1.2011.5.25.41.1.24.2.1.2", "hwModeChannelSendFlowOverThreshold": "1.3.6.1.4.1.2011.5.25.41.1.24.2.1.3", "hwModeChannelSendFlowOverInterfaceName": "1.3.6.1.4.1.2011.5.25.41.1.24.2.1.4"]
]

// --- hwModeChannelSendExceedGeneralThresholdResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.41.4.55
// Fields: hwModeChannelSendFlowOverIfIndex, hwModeChannelSendFlowOverPercentage, hwModeChannelSendFlowOverThreshold, hwModeChannelSendFlowOverInterfaceName
// Description: The alarm disappear when the inflow at the channel mode subinterface lower than the general threshold.
trapMap["1.3.6.1.4.1.2011.5.25.41.4.55"] = [
    name: "hwModeChannelSendExceedGeneralThresholdResume",
    fields: ["hwModeChannelSendFlowOverIfIndex", "hwModeChannelSendFlowOverPercentage", "hwModeChannelSendFlowOverThreshold", "hwModeChannelSendFlowOverInterfaceName"],
    fieldOids: ["hwModeChannelSendFlowOverIfIndex": "1.3.6.1.4.1.2011.5.25.41.1.24.2.1.1", "hwModeChannelSendFlowOverPercentage": "1.3.6.1.4.1.2011.5.25.41.1.24.2.1.2", "hwModeChannelSendFlowOverThreshold": "1.3.6.1.4.1.2011.5.25.41.1.24.2.1.3", "hwModeChannelSendFlowOverInterfaceName": "1.3.6.1.4.1.2011.5.25.41.1.24.2.1.4"]
]

// --- hwModeChannelRecvExceedSeriousThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.41.4.56
// Fields: hwModeChannelRecvFlowOverIfIndex, hwModeChannelRecvFlowOverPercentage, hwModeChannelRecvFlowOverThreshold, hwModeChannelRecvFlowOverInterfaceName
// Description: The alarm appear when the inflow at the channel mode subinterface exceeds the serious threshold.
trapMap["1.3.6.1.4.1.2011.5.25.41.4.56"] = [
    name: "hwModeChannelRecvExceedSeriousThreshold",
    fields: ["hwModeChannelRecvFlowOverIfIndex", "hwModeChannelRecvFlowOverPercentage", "hwModeChannelRecvFlowOverThreshold", "hwModeChannelRecvFlowOverInterfaceName"],
    fieldOids: ["hwModeChannelRecvFlowOverIfIndex": "1.3.6.1.4.1.2011.5.25.41.1.24.1.1.1", "hwModeChannelRecvFlowOverPercentage": "1.3.6.1.4.1.2011.5.25.41.1.24.1.1.2", "hwModeChannelRecvFlowOverThreshold": "1.3.6.1.4.1.2011.5.25.41.1.24.1.1.3", "hwModeChannelRecvFlowOverInterfaceName": "1.3.6.1.4.1.2011.5.25.41.1.24.1.1.7"]
]

// --- hwModeChannelRecvExceedSeriousThresholdResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.41.4.57
// Fields: hwModeChannelRecvFlowOverIfIndex, hwModeChannelRecvFlowOverPercentage, hwModeChannelRecvFlowOverThreshold, hwModeChannelRecvFlowOverInterfaceName
// Description: The alarm disappear when the inflow at the channel mode subinterface lower than the serious threshold.
trapMap["1.3.6.1.4.1.2011.5.25.41.4.57"] = [
    name: "hwModeChannelRecvExceedSeriousThresholdResume",
    fields: ["hwModeChannelRecvFlowOverIfIndex", "hwModeChannelRecvFlowOverPercentage", "hwModeChannelRecvFlowOverThreshold", "hwModeChannelRecvFlowOverInterfaceName"],
    fieldOids: ["hwModeChannelRecvFlowOverIfIndex": "1.3.6.1.4.1.2011.5.25.41.1.24.1.1.1", "hwModeChannelRecvFlowOverPercentage": "1.3.6.1.4.1.2011.5.25.41.1.24.1.1.2", "hwModeChannelRecvFlowOverThreshold": "1.3.6.1.4.1.2011.5.25.41.1.24.1.1.3", "hwModeChannelRecvFlowOverInterfaceName": "1.3.6.1.4.1.2011.5.25.41.1.24.1.1.7"]
]

// --- hwModeChannelSendExceedSeriousThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.41.4.58
// Fields: hwModeChannelSendFlowOverIfIndex, hwModeChannelSendFlowOverPercentage, hwModeChannelSendFlowOverThreshold, hwModeChannelSendFlowOverInterfaceName
// Description: The alarm appear when the inflow at the channel mode subinterface exceeds the serious threshold.
trapMap["1.3.6.1.4.1.2011.5.25.41.4.58"] = [
    name: "hwModeChannelSendExceedSeriousThreshold",
    fields: ["hwModeChannelSendFlowOverIfIndex", "hwModeChannelSendFlowOverPercentage", "hwModeChannelSendFlowOverThreshold", "hwModeChannelSendFlowOverInterfaceName"],
    fieldOids: ["hwModeChannelSendFlowOverIfIndex": "1.3.6.1.4.1.2011.5.25.41.1.24.2.1.1", "hwModeChannelSendFlowOverPercentage": "1.3.6.1.4.1.2011.5.25.41.1.24.2.1.2", "hwModeChannelSendFlowOverThreshold": "1.3.6.1.4.1.2011.5.25.41.1.24.2.1.3", "hwModeChannelSendFlowOverInterfaceName": "1.3.6.1.4.1.2011.5.25.41.1.24.2.1.4"]
]

// --- hwModeChannelSendExceedSeriousThresholdResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.41.4.59
// Fields: hwModeChannelSendFlowOverIfIndex, hwModeChannelSendFlowOverPercentage, hwModeChannelSendFlowOverThreshold, hwModeChannelSendFlowOverInterfaceName
// Description: The alarm disappear when the inflow at the channel mode subinterface lower than the serious threshold.
trapMap["1.3.6.1.4.1.2011.5.25.41.4.59"] = [
    name: "hwModeChannelSendExceedSeriousThresholdResume",
    fields: ["hwModeChannelSendFlowOverIfIndex", "hwModeChannelSendFlowOverPercentage", "hwModeChannelSendFlowOverThreshold", "hwModeChannelSendFlowOverInterfaceName"],
    fieldOids: ["hwModeChannelSendFlowOverIfIndex": "1.3.6.1.4.1.2011.5.25.41.1.24.2.1.1", "hwModeChannelSendFlowOverPercentage": "1.3.6.1.4.1.2011.5.25.41.1.24.2.1.2", "hwModeChannelSendFlowOverThreshold": "1.3.6.1.4.1.2011.5.25.41.1.24.2.1.3", "hwModeChannelSendFlowOverInterfaceName": "1.3.6.1.4.1.2011.5.25.41.1.24.2.1.4"]
]

// --- hwModeChannelBandwidthAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.41.4.60
// Fields: hwModeChannelBandwidthIfIndex, hwModeChannelBandwidthValue, hwModeChannelSubIfBandwidthSum, hwModeChannelIfName
// Description: The alarm appear when the total bandwidth of the channelized sub-interfaces on the same physical interface has exceeded the maximum available bandwidth of the physical interface.
trapMap["1.3.6.1.4.1.2011.5.25.41.4.60"] = [
    name: "hwModeChannelBandwidthAlarm",
    fields: ["hwModeChannelBandwidthIfIndex", "hwModeChannelBandwidthValue", "hwModeChannelSubIfBandwidthSum", "hwModeChannelIfName"],
    fieldOids: ["hwModeChannelBandwidthIfIndex": "1.3.6.1.4.1.2011.5.25.41.1.25.1.1.1", "hwModeChannelBandwidthValue": "1.3.6.1.4.1.2011.5.25.41.1.25.1.1.2", "hwModeChannelSubIfBandwidthSum": "1.3.6.1.4.1.2011.5.25.41.1.25.1.1.3", "hwModeChannelIfName": "1.3.6.1.4.1.2011.5.25.41.1.25.1.1.4"]
]

// --- hwModeChannelBandwidthResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.41.4.61
// Fields: hwModeChannelBandwidthIfIndex, hwModeChannelBandwidthValue, hwModeChannelSubIfBandwidthSum, hwModeChannelIfName
// Description: The alarm disappear when the total bandwidth of the channelized sub-interfaces on the same physical interface less than the maximum available bandwidth of the physical interface.
trapMap["1.3.6.1.4.1.2011.5.25.41.4.61"] = [
    name: "hwModeChannelBandwidthResume",
    fields: ["hwModeChannelBandwidthIfIndex", "hwModeChannelBandwidthValue", "hwModeChannelSubIfBandwidthSum", "hwModeChannelIfName"],
    fieldOids: ["hwModeChannelBandwidthIfIndex": "1.3.6.1.4.1.2011.5.25.41.1.25.1.1.1", "hwModeChannelBandwidthValue": "1.3.6.1.4.1.2011.5.25.41.1.25.1.1.2", "hwModeChannelSubIfBandwidthSum": "1.3.6.1.4.1.2011.5.25.41.1.25.1.1.3", "hwModeChannelIfName": "1.3.6.1.4.1.2011.5.25.41.1.25.1.1.4"]
]

// --- hwTrunkBandwidthAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.41.4.62
// Fields: hwTrunkBandwidthTrunkName, hwTrunkBandwidthIfName
// Description: The alarm appear when the bandwidth of the member interfaces of trunk differs greatly.
trapMap["1.3.6.1.4.1.2011.5.25.41.4.62"] = [
    name: "hwTrunkBandwidthAlarm",
    fields: ["hwTrunkBandwidthTrunkName", "hwTrunkBandwidthIfName"],
    fieldOids: ["hwTrunkBandwidthTrunkName": "1.3.6.1.4.1.2011.5.25.41.1.26.1.1.1", "hwTrunkBandwidthIfName": "1.3.6.1.4.1.2011.5.25.41.1.26.1.1.2"]
]

// --- hwTrunkBandwidthResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.41.4.63
// Fields: hwTrunkBandwidthTrunkName, hwTrunkBandwidthIfName
// Description: The alarm disappear when the bandwidth ratio between trunk member interfaces is within the normal range.
trapMap["1.3.6.1.4.1.2011.5.25.41.4.63"] = [
    name: "hwTrunkBandwidthResume",
    fields: ["hwTrunkBandwidthTrunkName", "hwTrunkBandwidthIfName"],
    fieldOids: ["hwTrunkBandwidthTrunkName": "1.3.6.1.4.1.2011.5.25.41.1.26.1.1.1", "hwTrunkBandwidthIfName": "1.3.6.1.4.1.2011.5.25.41.1.26.1.1.2"]
]

// --- hwModeFlexeBandwidthAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.41.4.64
// Fields: hwModeFlexeBandwidthIfIndex, hwModeFlexeBandwidthValue, hwModeFlexeSubIfBandwidthSum, hwModeFlexeIfName
// Description: The alarm appear when the total bandwidth of the sliced sub-interfaces on the same physical interface has exceeded the maximum available bandwidth of the physical interface.
trapMap["1.3.6.1.4.1.2011.5.25.41.4.64"] = [
    name: "hwModeFlexeBandwidthAlarm",
    fields: ["hwModeFlexeBandwidthIfIndex", "hwModeFlexeBandwidthValue", "hwModeFlexeSubIfBandwidthSum", "hwModeFlexeIfName"],
    fieldOids: ["hwModeFlexeBandwidthIfIndex": "1.3.6.1.4.1.2011.5.25.41.1.27.1.1.1", "hwModeFlexeBandwidthValue": "1.3.6.1.4.1.2011.5.25.41.1.27.1.1.2", "hwModeFlexeSubIfBandwidthSum": "1.3.6.1.4.1.2011.5.25.41.1.27.1.1.3", "hwModeFlexeIfName": "1.3.6.1.4.1.2011.5.25.41.1.27.1.1.4"]
]

// --- hwModeFlexeBandwidthResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.41.4.65
// Fields: hwModeFlexeBandwidthIfIndex, hwModeFlexeBandwidthValue, hwModeFlexeSubIfBandwidthSum, hwModeFlexeIfName
// Description: The alarm disappear when the total bandwidth of the sliced sub-interfaces on the same physical interface less than the maximum available bandwidth of the physical interface.
trapMap["1.3.6.1.4.1.2011.5.25.41.4.65"] = [
    name: "hwModeFlexeBandwidthResume",
    fields: ["hwModeFlexeBandwidthIfIndex", "hwModeFlexeBandwidthValue", "hwModeFlexeSubIfBandwidthSum", "hwModeFlexeIfName"],
    fieldOids: ["hwModeFlexeBandwidthIfIndex": "1.3.6.1.4.1.2011.5.25.41.1.27.1.1.1", "hwModeFlexeBandwidthValue": "1.3.6.1.4.1.2011.5.25.41.1.27.1.1.2", "hwModeFlexeSubIfBandwidthSum": "1.3.6.1.4.1.2011.5.25.41.1.27.1.1.3", "hwModeFlexeIfName": "1.3.6.1.4.1.2011.5.25.41.1.27.1.1.4"]
]

// --- hwVirtualEthernetChipMismatchAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.41.4.66
// Fields: hwVirtualEthernetChipIfName, hwVirtualEthernetChipIfIndex
// Description: The alarm appear when the chip of the Virtual-Ethernet port is inconsistent with the chip of the internal binding channel port.
trapMap["1.3.6.1.4.1.2011.5.25.41.4.66"] = [
    name: "hwVirtualEthernetChipMismatchAlarm",
    fields: ["hwVirtualEthernetChipIfName", "hwVirtualEthernetChipIfIndex"],
    fieldOids: ["hwVirtualEthernetChipIfName": "1.3.6.1.4.1.2011.5.25.41.1.28.1.1.1", "hwVirtualEthernetChipIfIndex": "1.3.6.1.4.1.2011.5.25.41.1.28.1.1.2"]
]

// --- hwVirtualEthernetChipMismatchResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.41.4.67
// Fields: hwVirtualEthernetChipIfName, hwVirtualEthernetChipIfIndex
// Description: The alarm disappear when this Virtual-Ethernet Interface configuration has been deleted.
trapMap["1.3.6.1.4.1.2011.5.25.41.4.67"] = [
    name: "hwVirtualEthernetChipMismatchResume",
    fields: ["hwVirtualEthernetChipIfName", "hwVirtualEthernetChipIfIndex"],
    fieldOids: ["hwVirtualEthernetChipIfName": "1.3.6.1.4.1.2011.5.25.41.1.28.1.1.1", "hwVirtualEthernetChipIfIndex": "1.3.6.1.4.1.2011.5.25.41.1.28.1.1.2"]
]

// --- hwFlexeChannelNotSupportAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.41.4.68
// Fields: hwFlexeChannelNotSupportIfName
// Description: The alarm appear when the mode flexe enable is configured on the sub-interface, and the main interface is not a GigabitEthernet interface, or the main interface works in non-1GE mode.
trapMap["1.3.6.1.4.1.2011.5.25.41.4.68"] = [
    name: "hwFlexeChannelNotSupportAlarm",
    fields: ["hwFlexeChannelNotSupportIfName"],
    fieldOids: ["hwFlexeChannelNotSupportIfName": "1.3.6.1.4.1.2011.5.25.41.1.29.1.1.1"]
]

// --- hwFlexeChannelNotSupportResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.41.4.69
// Fields: hwFlexeChannelNotSupportIfName
// Description: The alarm disappear when the mode flexe enable is not configured on the sub-interface, and the main interface is a GigabitEthernet interface, or the main interface works in 1GE mode.
trapMap["1.3.6.1.4.1.2011.5.25.41.4.69"] = [
    name: "hwFlexeChannelNotSupportResume",
    fields: ["hwFlexeChannelNotSupportIfName"],
    fieldOids: ["hwFlexeChannelNotSupportIfName": "1.3.6.1.4.1.2011.5.25.41.1.29.1.1.1"]
]

// --- hwIfIpAddressChange (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.41.6.1
// Fields: ipAdEntNetMask, ipAdEntNetMask, ifName
// Description: IP Trap Group. The trap will be generated when the primary IP address of an interface changes.
trapMap["1.3.6.1.4.1.2011.5.25.41.6.1"] = [
    name: "hwIfIpAddressChange",
    fields: ["ipAdEntNetMask", "ipAdEntNetMask", "ifName"],
    fieldOids: ["ipAdEntNetMask": "1.3.6.1.2.1.4.20.1.3", "ifName": "1.3.6.1.2.1.31.1.1.1.1"]
]

// ===== Parsing logic =====

// Set to true to enable diagnostic logging for this MIB parser
DEBUG = false

LOG_PREFIX = "[HUAWEI-IF-EXT-MIB]"
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
