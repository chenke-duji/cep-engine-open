/**
 * Auto-generated from HUAWEI-PTP-MIB.mib
 * Generated: 2026-08-24T18:28:30.751332
 * Traps/Notifications (51): hwPtpPortStateChange, hwPtpClockSourceChange, hwPtpTimeSyncFaulty, hwPtpTimeSyncResume, hwPtpAdaptiveServerStateChange, hwPtpAdaptiveClientListChange, hwPtpAdaptiveNegoStateChange, hwPTPRingFiberLengthChange, hwPTPRingFiberLengthChangeResume, hwPtpTimeLockFail, hwPtpTimeLockFailResume, hwPtpTimeStampUnChanged, hwPtpTimeStampUnChangedResume, hwPtpFrequencyLockFail, hwPtpFrequencyLockResume, hwPtpExtTimePortLost, hwPtpExtTimePortLostResume, hwPtpPdvOverflow, hwPtpPdvOverflowResume, hwPtpPassiveFiberLengthChange, hwPtpAcrSyncBad, hwPtpAcrSyncBadResume, hwPtpPdvLimitExceed, hwPtpPdvLimitExceedResume, hwPtpAdaptiveNegoInfoChange, hwPtpAdaptiveTraceSourceChange, hwPtpPortBmcInfoChange, hwPtpTimeSourceClockClassDecline, hwPtpTimeSourceClockClassDeclineResume, hwPtpPktLos, hwPtpPktLosResume, hwPtpStandardTimeOffsetOver, hwPtpStandardTimeOffsetOverResume, hwPtpTimeOffsetSumOver, hwPtpTimeOffsetSumOverResume, hwPtpLcsResNotEnough, hwPtpLcsResNotEnoughResume, hwPtpAdaptivePtsfStateChange, hwPtpaATRLicenseInactive, hwPtpaATRLicenseInactiveResume, hwPtpPortNonSupport, hwPtpPortNonSupportResume, hwPtpPortAttrMisMatch, hwPtpPortAttrMisMatchResume, hwPtpPassiveMeasureOverflow, hwPtpPassiveMeasureOverflowResume, hwPtpPortPtsf, hwPtpPortPtsfResume, hwPtpaPortStateChange, hwPtpClusterTimeLockFail, hwPtpClusterTimeLockFailResume
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

// --- hwPtpPortStateChange (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.187.5.1
// Fields: hwPtpPortName, hwPtpPortState, hwPtpOldPortState
// Description: This object indicates an interface status change alarm.
trapMap["1.3.6.1.4.1.2011.5.25.187.5.1"] = [
    name: "hwPtpPortStateChange",
    fields: ["hwPtpPortName", "hwPtpPortState", "hwPtpOldPortState"],
    fieldOids: ["hwPtpPortName": "1.3.6.1.4.1.2011.5.25.187.2.1.1.43", "hwPtpPortState": "1.3.6.1.4.1.2011.5.25.187.2.1.1.41", "hwPtpOldPortState": "1.3.6.1.4.1.2011.5.25.187.2.1.1.28"]
]

// --- hwPtpClockSourceChange (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.187.5.2
// Fields: hwPtpOldMasterClockId, hwPtpCurrentMasterClockId, hwPtpPortOldSourcePortNum, hwPtpPortSourcePortNum, hwPtpOldPortName, hwPtpPortName
// Description: This object indicates a clock source change alarm.
trapMap["1.3.6.1.4.1.2011.5.25.187.5.2"] = [
    name: "hwPtpClockSourceChange",
    fields: ["hwPtpOldMasterClockId", "hwPtpCurrentMasterClockId", "hwPtpPortOldSourcePortNum", "hwPtpPortSourcePortNum", "hwPtpOldPortName", "hwPtpPortName"],
    fieldOids: ["hwPtpOldMasterClockId": "1.3.6.1.4.1.2011.5.25.187.1.14", "hwPtpCurrentMasterClockId": "1.3.6.1.4.1.2011.5.25.187.1.32", "hwPtpPortOldSourcePortNum": "1.3.6.1.4.1.2011.5.25.187.2.1.1.47", "hwPtpPortSourcePortNum": "1.3.6.1.4.1.2011.5.25.187.2.1.1.30", "hwPtpOldPortName": "1.3.6.1.4.1.2011.5.25.187.2.1.1.48", "hwPtpPortName": "1.3.6.1.4.1.2011.5.25.187.2.1.1.43"]
]

// --- hwPtpTimeSyncFaulty (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.187.5.3
// Fields: hwPtpTimeSynchronizationStatus
// Description: This object indicates an alarm that the device loses synchronization with the clock.
trapMap["1.3.6.1.4.1.2011.5.25.187.5.3"] = [
    name: "hwPtpTimeSyncFaulty",
    fields: ["hwPtpTimeSynchronizationStatus"],
    fieldOids: ["hwPtpTimeSynchronizationStatus": "1.3.6.1.4.1.2011.5.25.187.1.22"]
]

// --- hwPtpTimeSyncResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.187.5.4
// Fields: hwPtpTimeSynchronizationStatus
// Description: This object indicates that the device recovers synchronization with the clock.
trapMap["1.3.6.1.4.1.2011.5.25.187.5.4"] = [
    name: "hwPtpTimeSyncResume",
    fields: ["hwPtpTimeSynchronizationStatus"],
    fieldOids: ["hwPtpTimeSynchronizationStatus": "1.3.6.1.4.1.2011.5.25.187.1.22"]
]

// --- hwPtpAdaptiveServerStateChange (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.187.5.8
// Fields: hwPtpAdaptiveUserMode, hwPtpAdaptiveUserState
// Description: Description.
trapMap["1.3.6.1.4.1.2011.5.25.187.5.8"] = [
    name: "hwPtpAdaptiveServerStateChange",
    fields: ["hwPtpAdaptiveUserMode", "hwPtpAdaptiveUserState"],
    fieldOids: ["hwPtpAdaptiveUserMode": "1.3.6.1.4.1.2011.5.25.187.1.38", "hwPtpAdaptiveUserState": "1.3.6.1.4.1.2011.5.25.187.1.39"]
]

// --- hwPtpAdaptiveClientListChange (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.187.5.9
// Fields: hwPtpAdaptiveClientIpList, hwPtpAdaptiveClientIpChangeFlag, hwPtpAdaptiveClientId
// Description: This object indicates an alarm that client information saved on a server is refreshed.
trapMap["1.3.6.1.4.1.2011.5.25.187.5.9"] = [
    name: "hwPtpAdaptiveClientListChange",
    fields: ["hwPtpAdaptiveClientIpList", "hwPtpAdaptiveClientIpChangeFlag", "hwPtpAdaptiveClientId"],
    fieldOids: ["hwPtpAdaptiveClientIpList": "1.3.6.1.4.1.2011.5.25.187.7.1.1.1", "hwPtpAdaptiveClientIpChangeFlag": "1.3.6.1.4.1.2011.5.25.187.1.55", "hwPtpAdaptiveClientId": "1.3.6.1.4.1.2011.5.25.187.8.1.1.2"]
]

// --- hwPtpAdaptiveNegoStateChange (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.187.5.10
// Fields: hwPtpAdaptiveRemoteServer1NegoState, hwPtpAdaptiveRemoteServer2NegoState
// Description: Indicates the client device's negotiate state with remote-server.
trapMap["1.3.6.1.4.1.2011.5.25.187.5.10"] = [
    name: "hwPtpAdaptiveNegoStateChange",
    fields: ["hwPtpAdaptiveRemoteServer1NegoState", "hwPtpAdaptiveRemoteServer2NegoState"],
    fieldOids: ["hwPtpAdaptiveRemoteServer1NegoState": "1.3.6.1.4.1.2011.5.25.187.1.50", "hwPtpAdaptiveRemoteServer2NegoState": "1.3.6.1.4.1.2011.5.25.187.1.53"]
]

// --- hwPTPRingFiberLengthChange (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.187.5.11
// Fields: hwPtpPortName, hwPtpPortRingFiberLengthChangeValue, hwPtpPortRingFiberLengthChangeValueFlag
// Description: This object indicates a fiber length change alarm.
trapMap["1.3.6.1.4.1.2011.5.25.187.5.11"] = [
    name: "hwPTPRingFiberLengthChange",
    fields: ["hwPtpPortName", "hwPtpPortRingFiberLengthChangeValue", "hwPtpPortRingFiberLengthChangeValueFlag"],
    fieldOids: ["hwPtpPortName": "1.3.6.1.4.1.2011.5.25.187.2.1.1.43", "hwPtpPortRingFiberLengthChangeValue": "1.3.6.1.4.1.2011.5.25.187.2.1.1.45", "hwPtpPortRingFiberLengthChangeValueFlag": "1.3.6.1.4.1.2011.5.25.187.2.1.1.46"]
]

// --- hwPTPRingFiberLengthChangeResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.187.5.12
// Fields: hwPtpPortName, hwPtpPortRingFiberLengthChangeValue, hwPtpPortRingFiberLengthChangeValueFlag
// Description: This object indicates that the fiber length recovers.
trapMap["1.3.6.1.4.1.2011.5.25.187.5.12"] = [
    name: "hwPTPRingFiberLengthChangeResume",
    fields: ["hwPtpPortName", "hwPtpPortRingFiberLengthChangeValue", "hwPtpPortRingFiberLengthChangeValueFlag"],
    fieldOids: ["hwPtpPortName": "1.3.6.1.4.1.2011.5.25.187.2.1.1.43", "hwPtpPortRingFiberLengthChangeValue": "1.3.6.1.4.1.2011.5.25.187.2.1.1.45", "hwPtpPortRingFiberLengthChangeValueFlag": "1.3.6.1.4.1.2011.5.25.187.2.1.1.46"]
]

// --- hwPtpTimeLockFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.187.5.13
// Fields: hwPtpTimeLockStatus, hwPtpTimeLockFailReason
// Description: This object indicates a time unlock alarm.
trapMap["1.3.6.1.4.1.2011.5.25.187.5.13"] = [
    name: "hwPtpTimeLockFail",
    fields: ["hwPtpTimeLockStatus", "hwPtpTimeLockFailReason"],
    fieldOids: ["hwPtpTimeLockStatus": "1.3.6.1.4.1.2011.5.25.187.1.86", "hwPtpTimeLockFailReason": "1.3.6.1.4.1.2011.5.25.187.1.144"]
]

// --- hwPtpTimeLockFailResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.187.5.14
// Fields: hwPtpTimeLockStatus, hwPtpTimeLockFailReason
// Description: This object indicates that a clear alarm is generated when the time is locked.
trapMap["1.3.6.1.4.1.2011.5.25.187.5.14"] = [
    name: "hwPtpTimeLockFailResume",
    fields: ["hwPtpTimeLockStatus", "hwPtpTimeLockFailReason"],
    fieldOids: ["hwPtpTimeLockStatus": "1.3.6.1.4.1.2011.5.25.187.1.86", "hwPtpTimeLockFailReason": "1.3.6.1.4.1.2011.5.25.187.1.144"]
]

// --- hwPtpTimeStampUnChanged (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.187.5.15
// Fields: hwPtpTimeStampStatus
// Description: Current time stamp in the sync-message isn't changed.
trapMap["1.3.6.1.4.1.2011.5.25.187.5.15"] = [
    name: "hwPtpTimeStampUnChanged",
    fields: ["hwPtpTimeStampStatus"],
    fieldOids: ["hwPtpTimeStampStatus": "1.3.6.1.4.1.2011.5.25.187.1.87"]
]

// --- hwPtpTimeStampUnChangedResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.187.5.16
// Fields: hwPtpTimeStampStatus
// Description: Current time stamp in the sync-message is changed.
trapMap["1.3.6.1.4.1.2011.5.25.187.5.16"] = [
    name: "hwPtpTimeStampUnChangedResume",
    fields: ["hwPtpTimeStampStatus"],
    fieldOids: ["hwPtpTimeStampStatus": "1.3.6.1.4.1.2011.5.25.187.1.87"]
]

// --- hwPtpFrequencyLockFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.187.5.17
// Fields: hwPtpFreqLockStatus
// Description: This object indicates a frequency out-of-sync alarm.
trapMap["1.3.6.1.4.1.2011.5.25.187.5.17"] = [
    name: "hwPtpFrequencyLockFail",
    fields: ["hwPtpFreqLockStatus"],
    fieldOids: ["hwPtpFreqLockStatus": "1.3.6.1.4.1.2011.5.25.187.1.88"]
]

// --- hwPtpFrequencyLockResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.187.5.18
// Fields: hwPtpFreqLockStatus
// Description: This object indicates that frequency out-of-sync recovers.
trapMap["1.3.6.1.4.1.2011.5.25.187.5.18"] = [
    name: "hwPtpFrequencyLockResume",
    fields: ["hwPtpFreqLockStatus"],
    fieldOids: ["hwPtpFreqLockStatus": "1.3.6.1.4.1.2011.5.25.187.1.88"]
]

// --- hwPtpExtTimePortLost (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.187.5.19
// Fields: hwPtpExtTimePortStatus, hwPtpExtTimePortType
// Description: This object indicates an alarm that the external time port is lost.
trapMap["1.3.6.1.4.1.2011.5.25.187.5.19"] = [
    name: "hwPtpExtTimePortLost",
    fields: ["hwPtpExtTimePortStatus", "hwPtpExtTimePortType"],
    fieldOids: ["hwPtpExtTimePortStatus": "1.3.6.1.4.1.2011.5.25.187.1.89", "hwPtpExtTimePortType": "1.3.6.1.4.1.2011.5.25.187.1.90"]
]

// --- hwPtpExtTimePortLostResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.187.5.20
// Fields: hwPtpExtTimePortStatus, hwPtpExtTimePortType
// Description: This object indicates an alarm that the external time port loss recovers.
trapMap["1.3.6.1.4.1.2011.5.25.187.5.20"] = [
    name: "hwPtpExtTimePortLostResume",
    fields: ["hwPtpExtTimePortStatus", "hwPtpExtTimePortType"],
    fieldOids: ["hwPtpExtTimePortStatus": "1.3.6.1.4.1.2011.5.25.187.1.89", "hwPtpExtTimePortType": "1.3.6.1.4.1.2011.5.25.187.1.90"]
]

// --- hwPtpPdvOverflow (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.187.5.21
// Description: Packet delay variety overflow.
trapMap["1.3.6.1.4.1.2011.5.25.187.5.21"] = [
    name: "hwPtpPdvOverflow",
    fields: [],
    fieldOids: []
]

// --- hwPtpPdvOverflowResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.187.5.22
// Description: Packet delay variety overflow resume.
trapMap["1.3.6.1.4.1.2011.5.25.187.5.22"] = [
    name: "hwPtpPdvOverflowResume",
    fields: [],
    fieldOids: []
]

// --- hwPtpPassiveFiberLengthChange (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.187.5.23
// Fields: hwPtpPortName, hwPtpPortRingFiberLengthChangeValue, hwPtpPortRingFiberLengthChangeValueFlag
// Description: This object indicates that the fiber length of the passive port changes.
trapMap["1.3.6.1.4.1.2011.5.25.187.5.23"] = [
    name: "hwPtpPassiveFiberLengthChange",
    fields: ["hwPtpPortName", "hwPtpPortRingFiberLengthChangeValue", "hwPtpPortRingFiberLengthChangeValueFlag"],
    fieldOids: ["hwPtpPortName": "1.3.6.1.4.1.2011.5.25.187.2.1.1.43", "hwPtpPortRingFiberLengthChangeValue": "1.3.6.1.4.1.2011.5.25.187.2.1.1.45", "hwPtpPortRingFiberLengthChangeValueFlag": "1.3.6.1.4.1.2011.5.25.187.2.1.1.46"]
]

// --- hwPtpAcrSyncBad (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.187.5.24
// Fields: hwPtpAcrSyncBadStatus
// Description: This object indicates a synbad alarm.
trapMap["1.3.6.1.4.1.2011.5.25.187.5.24"] = [
    name: "hwPtpAcrSyncBad",
    fields: ["hwPtpAcrSyncBadStatus"],
    fieldOids: ["hwPtpAcrSyncBadStatus": "1.3.6.1.4.1.2011.5.25.187.1.106"]
]

// --- hwPtpAcrSyncBadResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.187.5.25
// Fields: hwPtpAcrSyncBadStatus
// Description: This object indicates a synbad clear alarm.
trapMap["1.3.6.1.4.1.2011.5.25.187.5.25"] = [
    name: "hwPtpAcrSyncBadResume",
    fields: ["hwPtpAcrSyncBadStatus"],
    fieldOids: ["hwPtpAcrSyncBadStatus": "1.3.6.1.4.1.2011.5.25.187.1.106"]
]

// --- hwPtpPdvLimitExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.187.5.26
// Fields: hwPtpPdvLimitExceedStatus
// Description: This object indicates an event that the PDV exceeds the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.187.5.26"] = [
    name: "hwPtpPdvLimitExceed",
    fields: ["hwPtpPdvLimitExceedStatus"],
    fieldOids: ["hwPtpPdvLimitExceedStatus": "1.3.6.1.4.1.2011.5.25.187.1.107"]
]

// --- hwPtpPdvLimitExceedResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.187.5.27
// Fields: hwPtpPdvLimitExceedStatus
// Description: 1588 ACR PDV limit exceed resume.
trapMap["1.3.6.1.4.1.2011.5.25.187.5.27"] = [
    name: "hwPtpPdvLimitExceedResume",
    fields: ["hwPtpPdvLimitExceedStatus"],
    fieldOids: ["hwPtpPdvLimitExceedStatus": "1.3.6.1.4.1.2011.5.25.187.1.107"]
]

// --- hwPtpAdaptiveNegoInfoChange (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.187.5.28
// Fields: hwPtpAdaptiveRemoteServerId, hwPtpAdaptiveRemoteServerNegoState, hwPtpAdaptiveNegoErrorReason
// Description: This object indicates that the client negotiation information changes.
trapMap["1.3.6.1.4.1.2011.5.25.187.5.28"] = [
    name: "hwPtpAdaptiveNegoInfoChange",
    fields: ["hwPtpAdaptiveRemoteServerId", "hwPtpAdaptiveRemoteServerNegoState", "hwPtpAdaptiveNegoErrorReason"],
    fieldOids: ["hwPtpAdaptiveRemoteServerId": "1.3.6.1.4.1.2011.5.25.187.1.109", "hwPtpAdaptiveRemoteServerNegoState": "1.3.6.1.4.1.2011.5.25.187.1.110", "hwPtpAdaptiveNegoErrorReason": "1.3.6.1.4.1.2011.5.25.187.1.111"]
]

// --- hwPtpAdaptiveTraceSourceChange (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.187.5.29
// Fields: hwPtpAdaptiveOldTraceSource, hwPtpAdaptiveTraceSource
// Description: This object indicates a switchover of the server source that the client synchronizes.
trapMap["1.3.6.1.4.1.2011.5.25.187.5.29"] = [
    name: "hwPtpAdaptiveTraceSourceChange",
    fields: ["hwPtpAdaptiveOldTraceSource", "hwPtpAdaptiveTraceSource"],
    fieldOids: ["hwPtpAdaptiveOldTraceSource": "1.3.6.1.4.1.2011.5.25.187.1.117", "hwPtpAdaptiveTraceSource": "1.3.6.1.4.1.2011.5.25.187.1.108"]
]

// --- hwPtpPortBmcInfoChange (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.187.5.30
// Fields: hwPtpPortName, hwPtpPortSourcePortClockId, hwPtpPortSourcePortNum, hwPtpPortSourceStepsRemoved, hwPtpCurrentMasterClockId
// Description: This object indicates a port BMC information change.
trapMap["1.3.6.1.4.1.2011.5.25.187.5.30"] = [
    name: "hwPtpPortBmcInfoChange",
    fields: ["hwPtpPortName", "hwPtpPortSourcePortClockId", "hwPtpPortSourcePortNum", "hwPtpPortSourceStepsRemoved", "hwPtpCurrentMasterClockId"],
    fieldOids: ["hwPtpPortName": "1.3.6.1.4.1.2011.5.25.187.2.1.1.43", "hwPtpPortSourcePortClockId": "1.3.6.1.4.1.2011.5.25.187.2.1.1.29", "hwPtpPortSourcePortNum": "1.3.6.1.4.1.2011.5.25.187.2.1.1.30", "hwPtpPortSourceStepsRemoved": "1.3.6.1.4.1.2011.5.25.187.2.1.1.52", "hwPtpCurrentMasterClockId": "1.3.6.1.4.1.2011.5.25.187.1.32"]
]

// --- hwPtpTimeSourceClockClassDecline (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.187.5.31
// Description: This object indicates an alarm that the time source input deteriorates.
trapMap["1.3.6.1.4.1.2011.5.25.187.5.31"] = [
    name: "hwPtpTimeSourceClockClassDecline",
    fields: [],
    fieldOids: []
]

// --- hwPtpTimeSourceClockClassDeclineResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.187.5.32
// Description: This object indicates an alarm that the time source input deterioration recovers.
trapMap["1.3.6.1.4.1.2011.5.25.187.5.32"] = [
    name: "hwPtpTimeSourceClockClassDeclineResume",
    fields: [],
    fieldOids: []
]

// --- hwPtpPktLos (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.187.5.33
// Fields: hwPtpPktType
// Description: This object indicates an alarm that PTP packets are lost.
trapMap["1.3.6.1.4.1.2011.5.25.187.5.33"] = [
    name: "hwPtpPktLos",
    fields: ["hwPtpPktType"],
    fieldOids: ["hwPtpPktType": "1.3.6.1.4.1.2011.5.25.187.1.121"]
]

// --- hwPtpPktLosResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.187.5.34
// Fields: hwPtpPktType
// Description: This object indicates an alarm that PTP packet loss recovers.
trapMap["1.3.6.1.4.1.2011.5.25.187.5.34"] = [
    name: "hwPtpPktLosResume",
    fields: ["hwPtpPktType"],
    fieldOids: ["hwPtpPktType": "1.3.6.1.4.1.2011.5.25.187.1.121"]
]

// --- hwPtpStandardTimeOffsetOver (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.187.5.35
// Fields: hwPtpStandardTimeOffset, hwPtpAlarmThresholdStandardTimeOffset
// Description: This object indicates that the value of the standard time offset exceeds the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.187.5.35"] = [
    name: "hwPtpStandardTimeOffsetOver",
    fields: ["hwPtpStandardTimeOffset", "hwPtpAlarmThresholdStandardTimeOffset"],
    fieldOids: ["hwPtpStandardTimeOffset": "1.3.6.1.4.1.2011.5.25.187.1.127", "hwPtpAlarmThresholdStandardTimeOffset": "1.3.6.1.4.1.2011.5.25.187.1.123"]
]

// --- hwPtpStandardTimeOffsetOverResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.187.5.36
// Fields: hwPtpStandardTimeOffset, hwPtpAlarmThresholdStandardTimeOffset
// Description: This object indicates that the value of the standard time offset recovers.
trapMap["1.3.6.1.4.1.2011.5.25.187.5.36"] = [
    name: "hwPtpStandardTimeOffsetOverResume",
    fields: ["hwPtpStandardTimeOffset", "hwPtpAlarmThresholdStandardTimeOffset"],
    fieldOids: ["hwPtpStandardTimeOffset": "1.3.6.1.4.1.2011.5.25.187.1.127", "hwPtpAlarmThresholdStandardTimeOffset": "1.3.6.1.4.1.2011.5.25.187.1.123"]
]

// --- hwPtpTimeOffsetSumOver (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.187.5.37
// Fields: hwPtpTimeOffsetSumP2P, hwPtpAlarmThresholdOffsetSum
// Description: This object indicates that the accumulated PTP time offsets exceeds the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.187.5.37"] = [
    name: "hwPtpTimeOffsetSumOver",
    fields: ["hwPtpTimeOffsetSumP2P", "hwPtpAlarmThresholdOffsetSum"],
    fieldOids: ["hwPtpTimeOffsetSumP2P": "1.3.6.1.4.1.2011.5.25.187.1.129", "hwPtpAlarmThresholdOffsetSum": "1.3.6.1.4.1.2011.5.25.187.1.128"]
]

// --- hwPtpTimeOffsetSumOverResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.187.5.38
// Fields: hwPtpTimeOffsetSumP2P, hwPtpAlarmThresholdOffsetSum
// Description: This object indicates that the accumulated PTP time offsets recovers.
trapMap["1.3.6.1.4.1.2011.5.25.187.5.38"] = [
    name: "hwPtpTimeOffsetSumOverResume",
    fields: ["hwPtpTimeOffsetSumP2P", "hwPtpAlarmThresholdOffsetSum"],
    fieldOids: ["hwPtpTimeOffsetSumP2P": "1.3.6.1.4.1.2011.5.25.187.1.129", "hwPtpAlarmThresholdOffsetSum": "1.3.6.1.4.1.2011.5.25.187.1.128"]
]

// --- hwPtpLcsResNotEnough (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.187.5.39
// Fields: hwPtpChassisId, hwPtpSlotId
// Description: PTP license resources are not enough.
trapMap["1.3.6.1.4.1.2011.5.25.187.5.39"] = [
    name: "hwPtpLcsResNotEnough",
    fields: ["hwPtpChassisId", "hwPtpSlotId"],
    fieldOids: ["hwPtpChassisId": "1.3.6.1.4.1.2011.5.25.187.1.141", "hwPtpSlotId": "1.3.6.1.4.1.2011.5.25.187.1.142"]
]

// --- hwPtpLcsResNotEnoughResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.187.5.40
// Fields: hwPtpChassisId, hwPtpSlotId
// Description: PTP license resources are enough.
trapMap["1.3.6.1.4.1.2011.5.25.187.5.40"] = [
    name: "hwPtpLcsResNotEnoughResume",
    fields: ["hwPtpChassisId", "hwPtpSlotId"],
    fieldOids: ["hwPtpChassisId": "1.3.6.1.4.1.2011.5.25.187.1.141", "hwPtpSlotId": "1.3.6.1.4.1.2011.5.25.187.1.142"]
]

// --- hwPtpAdaptivePtsfStateChange (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.187.5.41
// Fields: hwPtpAdaptiveServerIndex, hwPtpAdaptivePtsfType, hwPtpAdaptivePtsfState
// Description: PTP adaptive PTSF state change notification.
trapMap["1.3.6.1.4.1.2011.5.25.187.5.41"] = [
    name: "hwPtpAdaptivePtsfStateChange",
    fields: ["hwPtpAdaptiveServerIndex", "hwPtpAdaptivePtsfType", "hwPtpAdaptivePtsfState"],
    fieldOids: ["hwPtpAdaptiveServerIndex": "1.3.6.1.4.1.2011.5.25.187.9.1.1.1", "hwPtpAdaptivePtsfType": "1.3.6.1.4.1.2011.5.25.187.9.1.1.14", "hwPtpAdaptivePtsfState": "1.3.6.1.4.1.2011.5.25.187.9.1.1.15"]
]

// --- hwPtpaATRLicenseInactive (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.187.5.42
// Description: The 1588V2 ATR function license was not activated. To ensure you can properly use 1588V2 ATR function, please purchase and activate 1588V2 ATR license.
trapMap["1.3.6.1.4.1.2011.5.25.187.5.42"] = [
    name: "hwPtpaATRLicenseInactive",
    fields: [],
    fieldOids: []
]

// --- hwPtpaATRLicenseInactiveResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.187.5.43
// Description: The 1588V2 ATR function license inactivation alarm was cleared.
trapMap["1.3.6.1.4.1.2011.5.25.187.5.43"] = [
    name: "hwPtpaATRLicenseInactiveResume",
    fields: [],
    fieldOids: []
]

// --- hwPtpPortNonSupport (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.187.5.44
// Fields: hwPtpChassisId, hwPtpPortName
// Description: This object indicates that the interface does not support a PTP time synchronization alarm.
trapMap["1.3.6.1.4.1.2011.5.25.187.5.44"] = [
    name: "hwPtpPortNonSupport",
    fields: ["hwPtpChassisId", "hwPtpPortName"],
    fieldOids: ["hwPtpChassisId": "1.3.6.1.4.1.2011.5.25.187.1.141", "hwPtpPortName": "1.3.6.1.4.1.2011.5.25.187.2.1.1.43"]
]

// --- hwPtpPortNonSupportResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.187.5.45
// Fields: hwPtpChassisId, hwPtpPortName
// Description: This object indicates that the interface does not support a PTP time synchronization clear alarm.
trapMap["1.3.6.1.4.1.2011.5.25.187.5.45"] = [
    name: "hwPtpPortNonSupportResume",
    fields: ["hwPtpChassisId", "hwPtpPortName"],
    fieldOids: ["hwPtpChassisId": "1.3.6.1.4.1.2011.5.25.187.1.141", "hwPtpPortName": "1.3.6.1.4.1.2011.5.25.187.2.1.1.43"]
]

// --- hwPtpPortAttrMisMatch (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.187.5.46
// Fields: hwPtpChassisId, hwPtpPortName, hwPtpPortAttrMisMatchReason
// Description: PTP attribute mismatching at both ends.
trapMap["1.3.6.1.4.1.2011.5.25.187.5.46"] = [
    name: "hwPtpPortAttrMisMatch",
    fields: ["hwPtpChassisId", "hwPtpPortName", "hwPtpPortAttrMisMatchReason"],
    fieldOids: ["hwPtpChassisId": "1.3.6.1.4.1.2011.5.25.187.1.141", "hwPtpPortName": "1.3.6.1.4.1.2011.5.25.187.2.1.1.43", "hwPtpPortAttrMisMatchReason": "1.3.6.1.4.1.2011.5.25.187.2.1.1.54"]
]

// --- hwPtpPortAttrMisMatchResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.187.5.47
// Fields: hwPtpChassisId, hwPtpPortName, hwPtpPortAttrMisMatchReason
// Description: PTP attribute mismatching resumed.
trapMap["1.3.6.1.4.1.2011.5.25.187.5.47"] = [
    name: "hwPtpPortAttrMisMatchResume",
    fields: ["hwPtpChassisId", "hwPtpPortName", "hwPtpPortAttrMisMatchReason"],
    fieldOids: ["hwPtpChassisId": "1.3.6.1.4.1.2011.5.25.187.1.141", "hwPtpPortName": "1.3.6.1.4.1.2011.5.25.187.2.1.1.43", "hwPtpPortAttrMisMatchReason": "1.3.6.1.4.1.2011.5.25.187.2.1.1.54"]
]

// --- hwPtpPassiveMeasureOverflow (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.187.5.48
// Fields: hwPtpPortName, hwPtpPortRingFiberLengthChangeValue, hwPtpPortRingFiberLengthChangeValueFlag, hwPtpPassiveAlarmThreshold
// Description: This object indicates that the fiber length of the passive port overflows the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.187.5.48"] = [
    name: "hwPtpPassiveMeasureOverflow",
    fields: ["hwPtpPortName", "hwPtpPortRingFiberLengthChangeValue", "hwPtpPortRingFiberLengthChangeValueFlag", "hwPtpPassiveAlarmThreshold"],
    fieldOids: ["hwPtpPortName": "1.3.6.1.4.1.2011.5.25.187.2.1.1.43", "hwPtpPortRingFiberLengthChangeValue": "1.3.6.1.4.1.2011.5.25.187.2.1.1.45", "hwPtpPortRingFiberLengthChangeValueFlag": "1.3.6.1.4.1.2011.5.25.187.2.1.1.46", "hwPtpPassiveAlarmThreshold": "1.3.6.1.4.1.2011.5.25.187.1.92"]
]

// --- hwPtpPassiveMeasureOverflowResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.187.5.49
// Fields: hwPtpPortName, hwPtpPortRingFiberLengthChangeValue, hwPtpPortRingFiberLengthChangeValueFlag, hwPtpPassiveAlarmThreshold
// Description: This object indicates that the fiber length of the passive port recovers.
trapMap["1.3.6.1.4.1.2011.5.25.187.5.49"] = [
    name: "hwPtpPassiveMeasureOverflowResume",
    fields: ["hwPtpPortName", "hwPtpPortRingFiberLengthChangeValue", "hwPtpPortRingFiberLengthChangeValueFlag", "hwPtpPassiveAlarmThreshold"],
    fieldOids: ["hwPtpPortName": "1.3.6.1.4.1.2011.5.25.187.2.1.1.43", "hwPtpPortRingFiberLengthChangeValue": "1.3.6.1.4.1.2011.5.25.187.2.1.1.45", "hwPtpPortRingFiberLengthChangeValueFlag": "1.3.6.1.4.1.2011.5.25.187.2.1.1.46", "hwPtpPassiveAlarmThreshold": "1.3.6.1.4.1.2011.5.25.187.1.92"]
]

// --- hwPtpPortPtsf (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.187.5.50
// Fields: hwPtpPortName, hwPtpPortPtsfReason
// Description: PTP ptsf alarm
trapMap["1.3.6.1.4.1.2011.5.25.187.5.50"] = [
    name: "hwPtpPortPtsf",
    fields: ["hwPtpPortName", "hwPtpPortPtsfReason"],
    fieldOids: ["hwPtpPortName": "1.3.6.1.4.1.2011.5.25.187.2.1.1.43", "hwPtpPortPtsfReason": "1.3.6.1.4.1.2011.5.25.187.2.1.1.55"]
]

// --- hwPtpPortPtsfResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.187.5.51
// Fields: hwPtpPortName, hwPtpPortPtsfReason
// Description: PTP ptsf alarm recover
trapMap["1.3.6.1.4.1.2011.5.25.187.5.51"] = [
    name: "hwPtpPortPtsfResume",
    fields: ["hwPtpPortName", "hwPtpPortPtsfReason"],
    fieldOids: ["hwPtpPortName": "1.3.6.1.4.1.2011.5.25.187.2.1.1.43", "hwPtpPortPtsfReason": "1.3.6.1.4.1.2011.5.25.187.2.1.1.55"]
]

// --- hwPtpaPortStateChange (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.187.5.52
// Fields: hwPtpaVPortId, hwPtpaPortState, hwPtpaOldPortState
// Description: PTP adaptive vport state change notification.
trapMap["1.3.6.1.4.1.2011.5.25.187.5.52"] = [
    name: "hwPtpaPortStateChange",
    fields: ["hwPtpaVPortId", "hwPtpaPortState", "hwPtpaOldPortState"],
    fieldOids: ["hwPtpaVPortId": "1.3.6.1.4.1.2011.5.25.187.11.1.1.1", "hwPtpaPortState": "1.3.6.1.4.1.2011.5.25.187.11.1.1.2", "hwPtpaOldPortState": "1.3.6.1.4.1.2011.5.25.187.11.1.1.3"]
]

// --- hwPtpClusterTimeLockFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.187.5.53
// Fields: hwPtpChassisId, hwPtpTimeLockStatus, hwPtpTimeLockFailReason
// Description: The time lock status is failed.
trapMap["1.3.6.1.4.1.2011.5.25.187.5.53"] = [
    name: "hwPtpClusterTimeLockFail",
    fields: ["hwPtpChassisId", "hwPtpTimeLockStatus", "hwPtpTimeLockFailReason"],
    fieldOids: ["hwPtpChassisId": "1.3.6.1.4.1.2011.5.25.187.1.141", "hwPtpTimeLockStatus": "1.3.6.1.4.1.2011.5.25.187.1.86", "hwPtpTimeLockFailReason": "1.3.6.1.4.1.2011.5.25.187.1.144"]
]

// --- hwPtpClusterTimeLockFailResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.187.5.54
// Fields: hwPtpChassisId, hwPtpTimeLockStatus, hwPtpTimeLockFailReason
// Description: This object indicates that a clear alarm is generated when the time is locked.
trapMap["1.3.6.1.4.1.2011.5.25.187.5.54"] = [
    name: "hwPtpClusterTimeLockFailResume",
    fields: ["hwPtpChassisId", "hwPtpTimeLockStatus", "hwPtpTimeLockFailReason"],
    fieldOids: ["hwPtpChassisId": "1.3.6.1.4.1.2011.5.25.187.1.141", "hwPtpTimeLockStatus": "1.3.6.1.4.1.2011.5.25.187.1.86", "hwPtpTimeLockFailReason": "1.3.6.1.4.1.2011.5.25.187.1.144"]
]

// ===== Parsing logic =====

// Set to true to enable diagnostic logging for this MIB parser
DEBUG = false

LOG_PREFIX = "[HUAWEI-PTP-MIB]"
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
