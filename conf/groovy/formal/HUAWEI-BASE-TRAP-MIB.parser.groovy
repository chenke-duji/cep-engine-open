/**
 * Auto-generated from HUAWEI-BASE-TRAP-MIB.mib
 * Generated: 2026-08-25T16:46:59.750002400
 * Traps/Notifications (139): hwEntityRemove, hwEntityInsert, hwEntityUnstable, hwEntityUnstableResume, hwEntityReset, hwEntityResetDone, hwEntityCommunicateError, hwEntityCommunicateResume, hwEntityInvalid, hwEntityResume, hwEntityLeaveMaster, hwEntityBecomeMaster, hwEntityOffline, hwEntityOnline, hwEntityCheckFail, hwEntityCheckResume, hwEntityRegFail, hwEntityRegSuccess, hwEntityDyingGasp, hwEntityBandwidthModeChange, hwCmuAlarm, hwCmuAlarmResume, hwEntityWarning, hwEntityWarningResume, hwTempRisingAlarm, hwTempRisingResume, hwTempFallingAlarm, hwTempFallingResume, hwHumidityRisingAlarm, hwHumidityRisingResume, hwHumidityFallingAlarm, hwHumidityFallingResume, hwVoltRisingAlarm, hwVoltRisingResume, hwVoltFallingAlarm, hwVoltFallingResume, hwCurrentRisingAlarm, hwCurrentRisingResume, hwCurrentFallingAlarm, hwCurrentFallingResume, hwPowerRisingAlarm, hwPowerRisingResume, hwPowerFallingAlarm, hwPowerFallingResume, hwPowerInsufficiencyAlarm, hwPowerInsufficiencyResume, hwAcuSoftwareUpgradeFailure, hwPowerOff, hwPowerOn, hwPowerMixed, hwPowerMixedResume, hwCPUUtilizationRisingAlarm, hwCPUUtilizationResume, hwPortPhysicalDown, hwPortPhysicalUp, hwPortPhysicalNoTrafficAlarm, hwPortPhysicalNoTrafficClear, hwPortPhysicalTrafficRisingAlarm, hwPortPhysicalTrafficClear, hwPortPhysicalCrcErrorRisingAlarm, hwPortPhysicalCrcErrorClear, hwPortPhysicalEthBroadcastRisingAlarm, hwPortPhysicalEthBroadcastClear, hwPortPhysicalEthHalfDuplexAlarm, hwPortPhysicalEthFullDuplexClear, hwPortPhysicalPortTypeChange, hwPortPhysicalAutoNegotiateFail, hwPortPhysicalAutoNegotiateResume, hwStorageUtilizationRisingAlarm, hwStorageUtilizationResume, hwVsDiskFullAlarm, hwVsDiskResume, hwSystemMemoryOverload, hwSystemMemoryOverloadResume, hwFIBOverloadSuspend, hwFIBOverloadSusResume, hwFIBOverloadForward, hwFIBOverloadFwResume, hwFESInconsistencyForMemoryLack, hwFESInconsistencyForMemoryLackResume, hwPppLoopbackDetect, hwPppLoopbackDetResume, hwFlowCongestion, hwFlowCongestionResume, hwDeviceAbnormalRisingAlarm, hwResExhaustBfdAlarm, hwResExhaustBfdResume, hwResExhaustOamAlarm, hwResExhaustOamResume, hwHdlcLoopbackDetect, hwHdlcLoopbackDetResume, hwHdlcIICPacketCrcErr, hwHdlcIICPacketCrcErrResume, hwAutoFtpFailAlarm, hwOpticalPowerAbnormal, hwOpticalPowerResume, hwNpsPatchInstallationFail, hwNpsPatchInstallationResume, hwNpsPatchPacketError, hwNpsPatchPacketResume, hwNpsSysConfigError, hwNpsSysConfigResume, hwNpsInnerSslCertificateInvalidEarlyWarning, hwNpsInnerSslCertificateInvalidEarlyResume, hwNpsInnerSslCertificateInvalidAlarm, hwNpsInnerSslCertificateInvalidResume, hwNpsDiskPartitionUsageExceedingThreshold, hwNpsDiskPartitionUsageExceedingThresholdResume, hwNpsDiskPartitionUnavailable, hwNpsDiskPartitionUnavailableResume, hwNpsDiskPartitionSpaceInsufficient, hwNpsDiskPartitionSpaceInsufficientResume, hwNpsExecutableFilesIncomplete, hwNpsExecutableFilesIncompleteResume, hwNpsSoftwareIntegrityError, hwNpsSoftwareIntegrityResume, hwNpsMasterAdnSlaveSyncFail, hwNpsMasterAdnSlaveSyncResume, hwNpsVirtualMachineDiskInvalid, hwNpsVirtualMachineDiskResume, hwNpsDatabaseRestoreFail, hwNpsSSLCertificateExpired, hwNpsSSLCertificateExpiredEarlyWarning, hwNpsVMResInconsistAlarm, hwNpsVMResInconsistResume, hwNpsVmFauldAlarm, hwNpsVmFauldResume, hwNpsVNFMConnectFault, hwNpsVNFMConnectResume, hwNpsFabricOamPlaneDown, hwNpsFabricOamPlaneDownResume, hwNpsFabricLinkSubhealthy, hwNpsFabricLinkSubhealthyResume, hwNpsDriverTypeMismatch, hwNpsDriverTypeMismatchResume, hwNpsRuCreateFail, hwNpsRuCreateResume, hwNpsIpSecRuleFail, hwNpsIpSecRuleResume
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

// --- hwEntityRemove (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.1.1
// Fields: hwBaseTrapSeverity, hwBaseTrapProbableCause, hwBaseTrapEventType, entPhysicalContainedIn, entPhysicalName
// Description: This object indicates that a physical entity is removed.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.1.1"] = [
    name: "hwEntityRemove",
    fields: ["hwBaseTrapSeverity", "hwBaseTrapProbableCause", "hwBaseTrapEventType", "entPhysicalContainedIn", "entPhysicalName"],
    fieldOids: ["hwBaseTrapSeverity": "1.3.6.1.4.1.2011.5.25.129.1.1", "hwBaseTrapProbableCause": "1.3.6.1.4.1.2011.5.25.129.1.2", "hwBaseTrapEventType": "1.3.6.1.4.1.2011.5.25.129.1.3", "entPhysicalContainedIn": "1.3.6.1.2.1.47.1.1.1.1.4", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwEntityInsert (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.1.2
// Fields: hwBaseTrapSeverity, hwBaseTrapProbableCause, hwBaseTrapEventType, entPhysicalContainedIn, entPhysicalName
// Description: This object indicates that a physical entity is inserted.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.1.2"] = [
    name: "hwEntityInsert",
    fields: ["hwBaseTrapSeverity", "hwBaseTrapProbableCause", "hwBaseTrapEventType", "entPhysicalContainedIn", "entPhysicalName"],
    fieldOids: ["hwBaseTrapSeverity": "1.3.6.1.4.1.2011.5.25.129.1.1", "hwBaseTrapProbableCause": "1.3.6.1.4.1.2011.5.25.129.1.2", "hwBaseTrapEventType": "1.3.6.1.4.1.2011.5.25.129.1.3", "entPhysicalContainedIn": "1.3.6.1.2.1.47.1.1.1.1.4", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwEntityUnstable (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.1.3
// Fields: hwBaseTrapSeverity, hwBaseTrapProbableCause, hwBaseTrapEventType, entPhysicalContainedIn, entPhysicalName
// Description: This object indicates that an alarm is generated when a physical entity is not securely inserted.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.1.3"] = [
    name: "hwEntityUnstable",
    fields: ["hwBaseTrapSeverity", "hwBaseTrapProbableCause", "hwBaseTrapEventType", "entPhysicalContainedIn", "entPhysicalName"],
    fieldOids: ["hwBaseTrapSeverity": "1.3.6.1.4.1.2011.5.25.129.1.1", "hwBaseTrapProbableCause": "1.3.6.1.4.1.2011.5.25.129.1.2", "hwBaseTrapEventType": "1.3.6.1.4.1.2011.5.25.129.1.3", "entPhysicalContainedIn": "1.3.6.1.2.1.47.1.1.1.1.4", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwEntityUnstableResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.1.4
// Fields: hwBaseTrapSeverity, hwBaseTrapProbableCause, hwBaseTrapEventType, entPhysicalContainedIn, entPhysicalName
// Description: This object indicates that the alarm generated when a physical entity is not securely inserted is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.1.4"] = [
    name: "hwEntityUnstableResume",
    fields: ["hwBaseTrapSeverity", "hwBaseTrapProbableCause", "hwBaseTrapEventType", "entPhysicalContainedIn", "entPhysicalName"],
    fieldOids: ["hwBaseTrapSeverity": "1.3.6.1.4.1.2011.5.25.129.1.1", "hwBaseTrapProbableCause": "1.3.6.1.4.1.2011.5.25.129.1.2", "hwBaseTrapEventType": "1.3.6.1.4.1.2011.5.25.129.1.3", "entPhysicalContainedIn": "1.3.6.1.2.1.47.1.1.1.1.4", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwEntityReset (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.1.5
// Fields: hwBaseTrapSeverity, hwBaseTrapProbableCause, hwBaseTrapEventType, entPhysicalContainedIn, entPhysicalName, hwBaseTrapRelativeResource, hwBaseTrapReasonDescr
// Description: This object indicates that a physical entity is reset.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.1.5"] = [
    name: "hwEntityReset",
    fields: ["hwBaseTrapSeverity", "hwBaseTrapProbableCause", "hwBaseTrapEventType", "entPhysicalContainedIn", "entPhysicalName", "hwBaseTrapRelativeResource", "hwBaseTrapReasonDescr"],
    fieldOids: ["hwBaseTrapSeverity": "1.3.6.1.4.1.2011.5.25.129.1.1", "hwBaseTrapProbableCause": "1.3.6.1.4.1.2011.5.25.129.1.2", "hwBaseTrapEventType": "1.3.6.1.4.1.2011.5.25.129.1.3", "entPhysicalContainedIn": "1.3.6.1.2.1.47.1.1.1.1.4", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwBaseTrapRelativeResource": "1.3.6.1.4.1.2011.5.25.129.1.4", "hwBaseTrapReasonDescr": "1.3.6.1.4.1.2011.5.25.129.1.5"]
]

// --- hwEntityResetDone (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.1.6
// Fields: hwBaseTrapSeverity, hwBaseTrapProbableCause, hwBaseTrapEventType, entPhysicalContainedIn, entPhysicalName, hwBaseTrapRelativeResource, hwBaseTrapReasonDescr
// Description: This object indicates that a physical entity is restarted and runs properly.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.1.6"] = [
    name: "hwEntityResetDone",
    fields: ["hwBaseTrapSeverity", "hwBaseTrapProbableCause", "hwBaseTrapEventType", "entPhysicalContainedIn", "entPhysicalName", "hwBaseTrapRelativeResource", "hwBaseTrapReasonDescr"],
    fieldOids: ["hwBaseTrapSeverity": "1.3.6.1.4.1.2011.5.25.129.1.1", "hwBaseTrapProbableCause": "1.3.6.1.4.1.2011.5.25.129.1.2", "hwBaseTrapEventType": "1.3.6.1.4.1.2011.5.25.129.1.3", "entPhysicalContainedIn": "1.3.6.1.2.1.47.1.1.1.1.4", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwBaseTrapRelativeResource": "1.3.6.1.4.1.2011.5.25.129.1.4", "hwBaseTrapReasonDescr": "1.3.6.1.4.1.2011.5.25.129.1.5"]
]

// --- hwEntityCommunicateError (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.1.7
// Fields: hwBaseTrapSeverity, hwBaseTrapProbableCause, hwBaseTrapEventType, entPhysicalContainedIn, entPhysicalName, hwBaseTrapRelativeResource, hwBaseTrapReasonDescr
// Description: This object indicates that channel detection fails.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.1.7"] = [
    name: "hwEntityCommunicateError",
    fields: ["hwBaseTrapSeverity", "hwBaseTrapProbableCause", "hwBaseTrapEventType", "entPhysicalContainedIn", "entPhysicalName", "hwBaseTrapRelativeResource", "hwBaseTrapReasonDescr"],
    fieldOids: ["hwBaseTrapSeverity": "1.3.6.1.4.1.2011.5.25.129.1.1", "hwBaseTrapProbableCause": "1.3.6.1.4.1.2011.5.25.129.1.2", "hwBaseTrapEventType": "1.3.6.1.4.1.2011.5.25.129.1.3", "entPhysicalContainedIn": "1.3.6.1.2.1.47.1.1.1.1.4", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwBaseTrapRelativeResource": "1.3.6.1.4.1.2011.5.25.129.1.4", "hwBaseTrapReasonDescr": "1.3.6.1.4.1.2011.5.25.129.1.5"]
]

// --- hwEntityCommunicateResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.1.8
// Fields: hwBaseTrapSeverity, hwBaseTrapProbableCause, hwBaseTrapEventType, entPhysicalContainedIn, entPhysicalName, hwBaseTrapRelativeResource, hwBaseTrapReasonDescr
// Description: This object indicates that channel detection recovers.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.1.8"] = [
    name: "hwEntityCommunicateResume",
    fields: ["hwBaseTrapSeverity", "hwBaseTrapProbableCause", "hwBaseTrapEventType", "entPhysicalContainedIn", "entPhysicalName", "hwBaseTrapRelativeResource", "hwBaseTrapReasonDescr"],
    fieldOids: ["hwBaseTrapSeverity": "1.3.6.1.4.1.2011.5.25.129.1.1", "hwBaseTrapProbableCause": "1.3.6.1.4.1.2011.5.25.129.1.2", "hwBaseTrapEventType": "1.3.6.1.4.1.2011.5.25.129.1.3", "entPhysicalContainedIn": "1.3.6.1.2.1.47.1.1.1.1.4", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwBaseTrapRelativeResource": "1.3.6.1.4.1.2011.5.25.129.1.4", "hwBaseTrapReasonDescr": "1.3.6.1.4.1.2011.5.25.129.1.5"]
]

// --- hwEntityInvalid (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.1.9
// Fields: hwBaseTrapSeverity, hwBaseTrapProbableCause, hwBaseTrapEventType, entPhysicalContainedIn, entPhysicalName, hwBaseTrapRelativeResource, hwBaseTrapReasonDescr
// Description: This object indicates that a physical entity is faulty.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.1.9"] = [
    name: "hwEntityInvalid",
    fields: ["hwBaseTrapSeverity", "hwBaseTrapProbableCause", "hwBaseTrapEventType", "entPhysicalContainedIn", "entPhysicalName", "hwBaseTrapRelativeResource", "hwBaseTrapReasonDescr"],
    fieldOids: ["hwBaseTrapSeverity": "1.3.6.1.4.1.2011.5.25.129.1.1", "hwBaseTrapProbableCause": "1.3.6.1.4.1.2011.5.25.129.1.2", "hwBaseTrapEventType": "1.3.6.1.4.1.2011.5.25.129.1.3", "entPhysicalContainedIn": "1.3.6.1.2.1.47.1.1.1.1.4", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwBaseTrapRelativeResource": "1.3.6.1.4.1.2011.5.25.129.1.4", "hwBaseTrapReasonDescr": "1.3.6.1.4.1.2011.5.25.129.1.5"]
]

// --- hwEntityResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.1.10
// Fields: hwBaseTrapSeverity, hwBaseTrapProbableCause, hwBaseTrapEventType, entPhysicalContainedIn, entPhysicalName, hwBaseTrapRelativeResource, hwBaseTrapReasonDescr
// Description: This object indicates that a physical entity recovers from a fault.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.1.10"] = [
    name: "hwEntityResume",
    fields: ["hwBaseTrapSeverity", "hwBaseTrapProbableCause", "hwBaseTrapEventType", "entPhysicalContainedIn", "entPhysicalName", "hwBaseTrapRelativeResource", "hwBaseTrapReasonDescr"],
    fieldOids: ["hwBaseTrapSeverity": "1.3.6.1.4.1.2011.5.25.129.1.1", "hwBaseTrapProbableCause": "1.3.6.1.4.1.2011.5.25.129.1.2", "hwBaseTrapEventType": "1.3.6.1.4.1.2011.5.25.129.1.3", "entPhysicalContainedIn": "1.3.6.1.2.1.47.1.1.1.1.4", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwBaseTrapRelativeResource": "1.3.6.1.4.1.2011.5.25.129.1.4", "hwBaseTrapReasonDescr": "1.3.6.1.4.1.2011.5.25.129.1.5"]
]

// --- hwEntityLeaveMaster (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.1.11
// Fields: hwBaseTrapSeverity, hwBaseTrapProbableCause, hwBaseTrapEventType, entPhysicalContainedIn, entPhysicalName, hwBaseTrapRelativeResource, hwBaseTrapReasonDescr
// Description: This object indicates that a physical entity exits from the active state.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.1.11"] = [
    name: "hwEntityLeaveMaster",
    fields: ["hwBaseTrapSeverity", "hwBaseTrapProbableCause", "hwBaseTrapEventType", "entPhysicalContainedIn", "entPhysicalName", "hwBaseTrapRelativeResource", "hwBaseTrapReasonDescr"],
    fieldOids: ["hwBaseTrapSeverity": "1.3.6.1.4.1.2011.5.25.129.1.1", "hwBaseTrapProbableCause": "1.3.6.1.4.1.2011.5.25.129.1.2", "hwBaseTrapEventType": "1.3.6.1.4.1.2011.5.25.129.1.3", "entPhysicalContainedIn": "1.3.6.1.2.1.47.1.1.1.1.4", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwBaseTrapRelativeResource": "1.3.6.1.4.1.2011.5.25.129.1.4", "hwBaseTrapReasonDescr": "1.3.6.1.4.1.2011.5.25.129.1.5"]
]

// --- hwEntityBecomeMaster (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.1.12
// Fields: hwBaseTrapSeverity, hwBaseTrapProbableCause, hwBaseTrapEventType, entPhysicalContainedIn, entPhysicalName, hwBaseTrapRelativeResource, hwBaseTrapReasonDescr
// Description: This object indicates that a physical entity becomes active.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.1.12"] = [
    name: "hwEntityBecomeMaster",
    fields: ["hwBaseTrapSeverity", "hwBaseTrapProbableCause", "hwBaseTrapEventType", "entPhysicalContainedIn", "entPhysicalName", "hwBaseTrapRelativeResource", "hwBaseTrapReasonDescr"],
    fieldOids: ["hwBaseTrapSeverity": "1.3.6.1.4.1.2011.5.25.129.1.1", "hwBaseTrapProbableCause": "1.3.6.1.4.1.2011.5.25.129.1.2", "hwBaseTrapEventType": "1.3.6.1.4.1.2011.5.25.129.1.3", "entPhysicalContainedIn": "1.3.6.1.2.1.47.1.1.1.1.4", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwBaseTrapRelativeResource": "1.3.6.1.4.1.2011.5.25.129.1.4", "hwBaseTrapReasonDescr": "1.3.6.1.4.1.2011.5.25.129.1.5"]
]

// --- hwEntityOffline (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.1.13
// Fields: hwBaseTrapSeverity, hwBaseTrapProbableCause, hwBaseTrapEventType, entPhysicalContainedIn, entPhysicalName, hwBaseTrapRelativeResource, hwBaseTrapReasonDescr
// Description: This object indicates that a physical entity becomes offline.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.1.13"] = [
    name: "hwEntityOffline",
    fields: ["hwBaseTrapSeverity", "hwBaseTrapProbableCause", "hwBaseTrapEventType", "entPhysicalContainedIn", "entPhysicalName", "hwBaseTrapRelativeResource", "hwBaseTrapReasonDescr"],
    fieldOids: ["hwBaseTrapSeverity": "1.3.6.1.4.1.2011.5.25.129.1.1", "hwBaseTrapProbableCause": "1.3.6.1.4.1.2011.5.25.129.1.2", "hwBaseTrapEventType": "1.3.6.1.4.1.2011.5.25.129.1.3", "entPhysicalContainedIn": "1.3.6.1.2.1.47.1.1.1.1.4", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwBaseTrapRelativeResource": "1.3.6.1.4.1.2011.5.25.129.1.4", "hwBaseTrapReasonDescr": "1.3.6.1.4.1.2011.5.25.129.1.5"]
]

// --- hwEntityOnline (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.1.14
// Fields: hwBaseTrapSeverity, hwBaseTrapProbableCause, hwBaseTrapEventType, entPhysicalContainedIn, entPhysicalName, hwBaseTrapRelativeResource, hwBaseTrapReasonDescr
// Description: This object indicates that a physical entity becomes online.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.1.14"] = [
    name: "hwEntityOnline",
    fields: ["hwBaseTrapSeverity", "hwBaseTrapProbableCause", "hwBaseTrapEventType", "entPhysicalContainedIn", "entPhysicalName", "hwBaseTrapRelativeResource", "hwBaseTrapReasonDescr"],
    fieldOids: ["hwBaseTrapSeverity": "1.3.6.1.4.1.2011.5.25.129.1.1", "hwBaseTrapProbableCause": "1.3.6.1.4.1.2011.5.25.129.1.2", "hwBaseTrapEventType": "1.3.6.1.4.1.2011.5.25.129.1.3", "entPhysicalContainedIn": "1.3.6.1.2.1.47.1.1.1.1.4", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwBaseTrapRelativeResource": "1.3.6.1.4.1.2011.5.25.129.1.4", "hwBaseTrapReasonDescr": "1.3.6.1.4.1.2011.5.25.129.1.5"]
]

// --- hwEntityCheckFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.1.15
// Fields: hwBaseTrapSeverity, hwBaseTrapProbableCause, hwBaseTrapEventType, entPhysicalContainedIn, entPhysicalName, hwBaseTrapRelativeResource, hwBaseTrapReasonDescr
// Description: This object indicates that physical entity detection fails.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.1.15"] = [
    name: "hwEntityCheckFail",
    fields: ["hwBaseTrapSeverity", "hwBaseTrapProbableCause", "hwBaseTrapEventType", "entPhysicalContainedIn", "entPhysicalName", "hwBaseTrapRelativeResource", "hwBaseTrapReasonDescr"],
    fieldOids: ["hwBaseTrapSeverity": "1.3.6.1.4.1.2011.5.25.129.1.1", "hwBaseTrapProbableCause": "1.3.6.1.4.1.2011.5.25.129.1.2", "hwBaseTrapEventType": "1.3.6.1.4.1.2011.5.25.129.1.3", "entPhysicalContainedIn": "1.3.6.1.2.1.47.1.1.1.1.4", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwBaseTrapRelativeResource": "1.3.6.1.4.1.2011.5.25.129.1.4", "hwBaseTrapReasonDescr": "1.3.6.1.4.1.2011.5.25.129.1.5"]
]

// --- hwEntityCheckResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.1.16
// Fields: hwBaseTrapSeverity, hwBaseTrapProbableCause, hwBaseTrapEventType, entPhysicalContainedIn, entPhysicalName, hwBaseTrapRelativeResource, hwBaseTrapReasonDescr
// Description: This object indicates that physical entity detection recovers.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.1.16"] = [
    name: "hwEntityCheckResume",
    fields: ["hwBaseTrapSeverity", "hwBaseTrapProbableCause", "hwBaseTrapEventType", "entPhysicalContainedIn", "entPhysicalName", "hwBaseTrapRelativeResource", "hwBaseTrapReasonDescr"],
    fieldOids: ["hwBaseTrapSeverity": "1.3.6.1.4.1.2011.5.25.129.1.1", "hwBaseTrapProbableCause": "1.3.6.1.4.1.2011.5.25.129.1.2", "hwBaseTrapEventType": "1.3.6.1.4.1.2011.5.25.129.1.3", "entPhysicalContainedIn": "1.3.6.1.2.1.47.1.1.1.1.4", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwBaseTrapRelativeResource": "1.3.6.1.4.1.2011.5.25.129.1.4", "hwBaseTrapReasonDescr": "1.3.6.1.4.1.2011.5.25.129.1.5"]
]

// --- hwEntityRegFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.1.17
// Fields: hwBaseTrapSeverity, hwBaseTrapProbableCause, hwBaseTrapEventType, entPhysicalContainedIn, entPhysicalName, hwBaseTrapRelativeResource, hwBaseTrapReasonDescr
// Description: This object indicates that physical entity registration fails.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.1.17"] = [
    name: "hwEntityRegFail",
    fields: ["hwBaseTrapSeverity", "hwBaseTrapProbableCause", "hwBaseTrapEventType", "entPhysicalContainedIn", "entPhysicalName", "hwBaseTrapRelativeResource", "hwBaseTrapReasonDescr"],
    fieldOids: ["hwBaseTrapSeverity": "1.3.6.1.4.1.2011.5.25.129.1.1", "hwBaseTrapProbableCause": "1.3.6.1.4.1.2011.5.25.129.1.2", "hwBaseTrapEventType": "1.3.6.1.4.1.2011.5.25.129.1.3", "entPhysicalContainedIn": "1.3.6.1.2.1.47.1.1.1.1.4", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwBaseTrapRelativeResource": "1.3.6.1.4.1.2011.5.25.129.1.4", "hwBaseTrapReasonDescr": "1.3.6.1.4.1.2011.5.25.129.1.5"]
]

// --- hwEntityRegSuccess (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.1.18
// Fields: hwBaseTrapSeverity, hwBaseTrapProbableCause, hwBaseTrapEventType, entPhysicalContainedIn, entPhysicalName, hwBaseTrapRelativeResource, hwBaseTrapReasonDescr
// Description: This object indicates that physical entity registration succeeds.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.1.18"] = [
    name: "hwEntityRegSuccess",
    fields: ["hwBaseTrapSeverity", "hwBaseTrapProbableCause", "hwBaseTrapEventType", "entPhysicalContainedIn", "entPhysicalName", "hwBaseTrapRelativeResource", "hwBaseTrapReasonDescr"],
    fieldOids: ["hwBaseTrapSeverity": "1.3.6.1.4.1.2011.5.25.129.1.1", "hwBaseTrapProbableCause": "1.3.6.1.4.1.2011.5.25.129.1.2", "hwBaseTrapEventType": "1.3.6.1.4.1.2011.5.25.129.1.3", "entPhysicalContainedIn": "1.3.6.1.2.1.47.1.1.1.1.4", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwBaseTrapRelativeResource": "1.3.6.1.4.1.2011.5.25.129.1.4", "hwBaseTrapReasonDescr": "1.3.6.1.4.1.2011.5.25.129.1.5"]
]

// --- hwEntityDyingGasp (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.1.19
// Fields: hwBaseTrapRelativeResource, hwBaseTrapProbableCause, hwBaseTrapReasonDescr
// Description: Dying gasp event is occurred.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.1.19"] = [
    name: "hwEntityDyingGasp",
    fields: ["hwBaseTrapRelativeResource", "hwBaseTrapProbableCause", "hwBaseTrapReasonDescr"],
    fieldOids: ["hwBaseTrapRelativeResource": "1.3.6.1.4.1.2011.5.25.129.1.4", "hwBaseTrapProbableCause": "1.3.6.1.4.1.2011.5.25.129.1.2", "hwBaseTrapReasonDescr": "1.3.6.1.4.1.2011.5.25.129.1.5"]
]

// --- hwEntityBandwidthModeChange (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.1.20
// Fields: hwBaseTrapSeverity, hwBaseTrapEventType, entPhysicalIndex, entPhysicalContainedIn, entPhysicalName, hwEntBandwidthMode
// Description: The bandwidth mode of physical entity is changed.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.1.20"] = [
    name: "hwEntityBandwidthModeChange",
    fields: ["hwBaseTrapSeverity", "hwBaseTrapEventType", "entPhysicalIndex", "entPhysicalContainedIn", "entPhysicalName", "hwEntBandwidthMode"],
    fieldOids: ["hwBaseTrapSeverity": "1.3.6.1.4.1.2011.5.25.129.1.1", "hwBaseTrapEventType": "1.3.6.1.4.1.2011.5.25.129.1.3", "entPhysicalIndex": "1.3.6.1.2.1.47.1.1.1.1.1", "entPhysicalContainedIn": "1.3.6.1.2.1.47.1.1.1.1.4", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntBandwidthMode": "1.3.6.1.4.1.2011.5.25.129.1.18"]
]

// --- hwCmuAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.1.21
// Fields: hwBaseTrapSeverity, hwBaseTrapProbableCause, hwBaseTrapEventType, entPhysicalContainedIn, entPhysicalName, hwBaseTrapRelativeResource, hwBaseTrapReasonDescr
// Description: The CMU monitoring module alarm.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.1.21"] = [
    name: "hwCmuAlarm",
    fields: ["hwBaseTrapSeverity", "hwBaseTrapProbableCause", "hwBaseTrapEventType", "entPhysicalContainedIn", "entPhysicalName", "hwBaseTrapRelativeResource", "hwBaseTrapReasonDescr"],
    fieldOids: ["hwBaseTrapSeverity": "1.3.6.1.4.1.2011.5.25.129.1.1", "hwBaseTrapProbableCause": "1.3.6.1.4.1.2011.5.25.129.1.2", "hwBaseTrapEventType": "1.3.6.1.4.1.2011.5.25.129.1.3", "entPhysicalContainedIn": "1.3.6.1.2.1.47.1.1.1.1.4", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwBaseTrapRelativeResource": "1.3.6.1.4.1.2011.5.25.129.1.4", "hwBaseTrapReasonDescr": "1.3.6.1.4.1.2011.5.25.129.1.5"]
]

// --- hwCmuAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.1.22
// Fields: hwBaseTrapSeverity, hwBaseTrapProbableCause, hwBaseTrapEventType, entPhysicalContainedIn, entPhysicalName, hwBaseTrapRelativeResource, hwBaseTrapReasonDescr
// Description: The CMU monitoring module alarm recovered.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.1.22"] = [
    name: "hwCmuAlarmResume",
    fields: ["hwBaseTrapSeverity", "hwBaseTrapProbableCause", "hwBaseTrapEventType", "entPhysicalContainedIn", "entPhysicalName", "hwBaseTrapRelativeResource", "hwBaseTrapReasonDescr"],
    fieldOids: ["hwBaseTrapSeverity": "1.3.6.1.4.1.2011.5.25.129.1.1", "hwBaseTrapProbableCause": "1.3.6.1.4.1.2011.5.25.129.1.2", "hwBaseTrapEventType": "1.3.6.1.4.1.2011.5.25.129.1.3", "entPhysicalContainedIn": "1.3.6.1.2.1.47.1.1.1.1.4", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwBaseTrapRelativeResource": "1.3.6.1.4.1.2011.5.25.129.1.4", "hwBaseTrapReasonDescr": "1.3.6.1.4.1.2011.5.25.129.1.5"]
]

// --- hwEntityWarning (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.1.23
// Fields: hwBaseTrapSeverity, hwBaseTrapProbableCause, hwBaseTrapEventType, entPhysicalContainedIn, entPhysicalName, hwBaseTrapRelativeResource, hwBaseTrapReasonDescr
// Description: The entity experienced a minor fault.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.1.23"] = [
    name: "hwEntityWarning",
    fields: ["hwBaseTrapSeverity", "hwBaseTrapProbableCause", "hwBaseTrapEventType", "entPhysicalContainedIn", "entPhysicalName", "hwBaseTrapRelativeResource", "hwBaseTrapReasonDescr"],
    fieldOids: ["hwBaseTrapSeverity": "1.3.6.1.4.1.2011.5.25.129.1.1", "hwBaseTrapProbableCause": "1.3.6.1.4.1.2011.5.25.129.1.2", "hwBaseTrapEventType": "1.3.6.1.4.1.2011.5.25.129.1.3", "entPhysicalContainedIn": "1.3.6.1.2.1.47.1.1.1.1.4", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwBaseTrapRelativeResource": "1.3.6.1.4.1.2011.5.25.129.1.4", "hwBaseTrapReasonDescr": "1.3.6.1.4.1.2011.5.25.129.1.5"]
]

// --- hwEntityWarningResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.1.24
// Fields: hwBaseTrapSeverity, hwBaseTrapProbableCause, hwBaseTrapEventType, entPhysicalContainedIn, entPhysicalName, hwBaseTrapRelativeResource, hwBaseTrapReasonDescr
// Description: The entity resumed from the minor fault.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.1.24"] = [
    name: "hwEntityWarningResume",
    fields: ["hwBaseTrapSeverity", "hwBaseTrapProbableCause", "hwBaseTrapEventType", "entPhysicalContainedIn", "entPhysicalName", "hwBaseTrapRelativeResource", "hwBaseTrapReasonDescr"],
    fieldOids: ["hwBaseTrapSeverity": "1.3.6.1.4.1.2011.5.25.129.1.1", "hwBaseTrapProbableCause": "1.3.6.1.4.1.2011.5.25.129.1.2", "hwBaseTrapEventType": "1.3.6.1.4.1.2011.5.25.129.1.3", "entPhysicalContainedIn": "1.3.6.1.2.1.47.1.1.1.1.4", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwBaseTrapRelativeResource": "1.3.6.1.4.1.2011.5.25.129.1.4", "hwBaseTrapReasonDescr": "1.3.6.1.4.1.2011.5.25.129.1.5"]
]

// --- hwTempRisingAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.2.1
// Fields: hwBaseTrapSeverity, hwBaseTrapProbableCause, hwBaseTrapEventType, entPhysicalName, hwBaseThresholdValue, hwBaseThresholdUnit, hwBaseThresholdHighWarning, hwBaseThresholdHighCritical
// Description: This object indicates that an alarm is generated when the temperature sensor exceeds the upper threshold.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.2.1"] = [
    name: "hwTempRisingAlarm",
    fields: ["hwBaseTrapSeverity", "hwBaseTrapProbableCause", "hwBaseTrapEventType", "entPhysicalName", "hwBaseThresholdValue", "hwBaseThresholdUnit", "hwBaseThresholdHighWarning", "hwBaseThresholdHighCritical"],
    fieldOids: ["hwBaseTrapSeverity": "1.3.6.1.4.1.2011.5.25.129.1.1", "hwBaseTrapProbableCause": "1.3.6.1.4.1.2011.5.25.129.1.2", "hwBaseTrapEventType": "1.3.6.1.4.1.2011.5.25.129.1.3", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwBaseThresholdValue": "1.3.6.1.4.1.2011.5.25.129.1.6.1.3", "hwBaseThresholdUnit": "1.3.6.1.4.1.2011.5.25.129.1.6.1.4", "hwBaseThresholdHighWarning": "1.3.6.1.4.1.2011.5.25.129.1.6.1.7", "hwBaseThresholdHighCritical": "1.3.6.1.4.1.2011.5.25.129.1.6.1.8"]
]

// --- hwTempRisingResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.2.2
// Fields: hwBaseTrapSeverity, hwBaseTrapProbableCause, hwBaseTrapEventType, entPhysicalName, hwBaseThresholdValue, hwBaseThresholdUnit, hwBaseThresholdHighWarning, hwBaseThresholdHighCritical
// Description: This object indicates that the alarm generated when the temperature sensor exceeds the upper threshold is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.2.2"] = [
    name: "hwTempRisingResume",
    fields: ["hwBaseTrapSeverity", "hwBaseTrapProbableCause", "hwBaseTrapEventType", "entPhysicalName", "hwBaseThresholdValue", "hwBaseThresholdUnit", "hwBaseThresholdHighWarning", "hwBaseThresholdHighCritical"],
    fieldOids: ["hwBaseTrapSeverity": "1.3.6.1.4.1.2011.5.25.129.1.1", "hwBaseTrapProbableCause": "1.3.6.1.4.1.2011.5.25.129.1.2", "hwBaseTrapEventType": "1.3.6.1.4.1.2011.5.25.129.1.3", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwBaseThresholdValue": "1.3.6.1.4.1.2011.5.25.129.1.6.1.3", "hwBaseThresholdUnit": "1.3.6.1.4.1.2011.5.25.129.1.6.1.4", "hwBaseThresholdHighWarning": "1.3.6.1.4.1.2011.5.25.129.1.6.1.7", "hwBaseThresholdHighCritical": "1.3.6.1.4.1.2011.5.25.129.1.6.1.8"]
]

// --- hwTempFallingAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.2.3
// Fields: hwBaseTrapSeverity, hwBaseTrapProbableCause, hwBaseTrapEventType, entPhysicalName, hwBaseThresholdValue, hwBaseThresholdUnit, hwBaseThresholdLowCritical, hwBaseThresholdLowWarning
// Description: Temperature fall below LOW threshold.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.2.3"] = [
    name: "hwTempFallingAlarm",
    fields: ["hwBaseTrapSeverity", "hwBaseTrapProbableCause", "hwBaseTrapEventType", "entPhysicalName", "hwBaseThresholdValue", "hwBaseThresholdUnit", "hwBaseThresholdLowCritical", "hwBaseThresholdLowWarning"],
    fieldOids: ["hwBaseTrapSeverity": "1.3.6.1.4.1.2011.5.25.129.1.1", "hwBaseTrapProbableCause": "1.3.6.1.4.1.2011.5.25.129.1.2", "hwBaseTrapEventType": "1.3.6.1.4.1.2011.5.25.129.1.3", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwBaseThresholdValue": "1.3.6.1.4.1.2011.5.25.129.1.6.1.3", "hwBaseThresholdUnit": "1.3.6.1.4.1.2011.5.25.129.1.6.1.4", "hwBaseThresholdLowCritical": "1.3.6.1.4.1.2011.5.25.129.1.6.1.5", "hwBaseThresholdLowWarning": "1.3.6.1.4.1.2011.5.25.129.1.6.1.6"]
]

// --- hwTempFallingResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.2.4
// Fields: hwBaseTrapSeverity, hwBaseTrapProbableCause, hwBaseTrapEventType, entPhysicalName, hwBaseThresholdValue, hwBaseThresholdUnit, hwBaseThresholdLowCritical, hwBaseThresholdLowWarning
// Description: Temperature back to normal level.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.2.4"] = [
    name: "hwTempFallingResume",
    fields: ["hwBaseTrapSeverity", "hwBaseTrapProbableCause", "hwBaseTrapEventType", "entPhysicalName", "hwBaseThresholdValue", "hwBaseThresholdUnit", "hwBaseThresholdLowCritical", "hwBaseThresholdLowWarning"],
    fieldOids: ["hwBaseTrapSeverity": "1.3.6.1.4.1.2011.5.25.129.1.1", "hwBaseTrapProbableCause": "1.3.6.1.4.1.2011.5.25.129.1.2", "hwBaseTrapEventType": "1.3.6.1.4.1.2011.5.25.129.1.3", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwBaseThresholdValue": "1.3.6.1.4.1.2011.5.25.129.1.6.1.3", "hwBaseThresholdUnit": "1.3.6.1.4.1.2011.5.25.129.1.6.1.4", "hwBaseThresholdLowCritical": "1.3.6.1.4.1.2011.5.25.129.1.6.1.5", "hwBaseThresholdLowWarning": "1.3.6.1.4.1.2011.5.25.129.1.6.1.6"]
]

// --- hwHumidityRisingAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.2.5
// Fields: hwBaseTrapSeverity, hwBaseTrapProbableCause, hwBaseTrapEventType, entPhysicalName, hwBaseThresholdValue, hwBaseThresholdUnit, hwBaseThresholdHighWarning, hwBaseThresholdHighCritical
// Description: Humidity rise over HIGH threshold.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.2.5"] = [
    name: "hwHumidityRisingAlarm",
    fields: ["hwBaseTrapSeverity", "hwBaseTrapProbableCause", "hwBaseTrapEventType", "entPhysicalName", "hwBaseThresholdValue", "hwBaseThresholdUnit", "hwBaseThresholdHighWarning", "hwBaseThresholdHighCritical"],
    fieldOids: ["hwBaseTrapSeverity": "1.3.6.1.4.1.2011.5.25.129.1.1", "hwBaseTrapProbableCause": "1.3.6.1.4.1.2011.5.25.129.1.2", "hwBaseTrapEventType": "1.3.6.1.4.1.2011.5.25.129.1.3", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwBaseThresholdValue": "1.3.6.1.4.1.2011.5.25.129.1.6.1.3", "hwBaseThresholdUnit": "1.3.6.1.4.1.2011.5.25.129.1.6.1.4", "hwBaseThresholdHighWarning": "1.3.6.1.4.1.2011.5.25.129.1.6.1.7", "hwBaseThresholdHighCritical": "1.3.6.1.4.1.2011.5.25.129.1.6.1.8"]
]

// --- hwHumidityRisingResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.2.6
// Fields: hwBaseTrapSeverity, hwBaseTrapProbableCause, hwBaseTrapEventType, entPhysicalName, hwBaseThresholdValue, hwBaseThresholdUnit, hwBaseThresholdHighWarning, hwBaseThresholdHighCritical
// Description: Humidity back to normal level.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.2.6"] = [
    name: "hwHumidityRisingResume",
    fields: ["hwBaseTrapSeverity", "hwBaseTrapProbableCause", "hwBaseTrapEventType", "entPhysicalName", "hwBaseThresholdValue", "hwBaseThresholdUnit", "hwBaseThresholdHighWarning", "hwBaseThresholdHighCritical"],
    fieldOids: ["hwBaseTrapSeverity": "1.3.6.1.4.1.2011.5.25.129.1.1", "hwBaseTrapProbableCause": "1.3.6.1.4.1.2011.5.25.129.1.2", "hwBaseTrapEventType": "1.3.6.1.4.1.2011.5.25.129.1.3", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwBaseThresholdValue": "1.3.6.1.4.1.2011.5.25.129.1.6.1.3", "hwBaseThresholdUnit": "1.3.6.1.4.1.2011.5.25.129.1.6.1.4", "hwBaseThresholdHighWarning": "1.3.6.1.4.1.2011.5.25.129.1.6.1.7", "hwBaseThresholdHighCritical": "1.3.6.1.4.1.2011.5.25.129.1.6.1.8"]
]

// --- hwHumidityFallingAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.2.7
// Fields: hwBaseTrapSeverity, hwBaseTrapProbableCause, hwBaseTrapEventType, entPhysicalName, hwBaseThresholdValue, hwBaseThresholdUnit, hwBaseThresholdLowCritical, hwBaseThresholdLowWarning
// Description: Humidity fall below LOW threshold.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.2.7"] = [
    name: "hwHumidityFallingAlarm",
    fields: ["hwBaseTrapSeverity", "hwBaseTrapProbableCause", "hwBaseTrapEventType", "entPhysicalName", "hwBaseThresholdValue", "hwBaseThresholdUnit", "hwBaseThresholdLowCritical", "hwBaseThresholdLowWarning"],
    fieldOids: ["hwBaseTrapSeverity": "1.3.6.1.4.1.2011.5.25.129.1.1", "hwBaseTrapProbableCause": "1.3.6.1.4.1.2011.5.25.129.1.2", "hwBaseTrapEventType": "1.3.6.1.4.1.2011.5.25.129.1.3", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwBaseThresholdValue": "1.3.6.1.4.1.2011.5.25.129.1.6.1.3", "hwBaseThresholdUnit": "1.3.6.1.4.1.2011.5.25.129.1.6.1.4", "hwBaseThresholdLowCritical": "1.3.6.1.4.1.2011.5.25.129.1.6.1.5", "hwBaseThresholdLowWarning": "1.3.6.1.4.1.2011.5.25.129.1.6.1.6"]
]

// --- hwHumidityFallingResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.2.8
// Fields: hwBaseTrapSeverity, hwBaseTrapProbableCause, hwBaseTrapEventType, entPhysicalName, hwBaseThresholdValue, hwBaseThresholdUnit, hwBaseThresholdLowCritical, hwBaseThresholdLowWarning
// Description: Humidity back to normal level.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.2.8"] = [
    name: "hwHumidityFallingResume",
    fields: ["hwBaseTrapSeverity", "hwBaseTrapProbableCause", "hwBaseTrapEventType", "entPhysicalName", "hwBaseThresholdValue", "hwBaseThresholdUnit", "hwBaseThresholdLowCritical", "hwBaseThresholdLowWarning"],
    fieldOids: ["hwBaseTrapSeverity": "1.3.6.1.4.1.2011.5.25.129.1.1", "hwBaseTrapProbableCause": "1.3.6.1.4.1.2011.5.25.129.1.2", "hwBaseTrapEventType": "1.3.6.1.4.1.2011.5.25.129.1.3", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwBaseThresholdValue": "1.3.6.1.4.1.2011.5.25.129.1.6.1.3", "hwBaseThresholdUnit": "1.3.6.1.4.1.2011.5.25.129.1.6.1.4", "hwBaseThresholdLowCritical": "1.3.6.1.4.1.2011.5.25.129.1.6.1.5", "hwBaseThresholdLowWarning": "1.3.6.1.4.1.2011.5.25.129.1.6.1.6"]
]

// --- hwVoltRisingAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.2.9
// Fields: hwBaseTrapSeverity, hwBaseTrapProbableCause, hwBaseTrapEventType, entPhysicalName, hwBaseThresholdValue, hwBaseThresholdUnit, hwBaseThresholdHighWarning, hwBaseThresholdHighCritical
// Description: This object indicates that an alarm is generated when the voltage sensor exceeds the upper threshold.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.2.9"] = [
    name: "hwVoltRisingAlarm",
    fields: ["hwBaseTrapSeverity", "hwBaseTrapProbableCause", "hwBaseTrapEventType", "entPhysicalName", "hwBaseThresholdValue", "hwBaseThresholdUnit", "hwBaseThresholdHighWarning", "hwBaseThresholdHighCritical"],
    fieldOids: ["hwBaseTrapSeverity": "1.3.6.1.4.1.2011.5.25.129.1.1", "hwBaseTrapProbableCause": "1.3.6.1.4.1.2011.5.25.129.1.2", "hwBaseTrapEventType": "1.3.6.1.4.1.2011.5.25.129.1.3", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwBaseThresholdValue": "1.3.6.1.4.1.2011.5.25.129.1.6.1.3", "hwBaseThresholdUnit": "1.3.6.1.4.1.2011.5.25.129.1.6.1.4", "hwBaseThresholdHighWarning": "1.3.6.1.4.1.2011.5.25.129.1.6.1.7", "hwBaseThresholdHighCritical": "1.3.6.1.4.1.2011.5.25.129.1.6.1.8"]
]

// --- hwVoltRisingResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.2.10
// Fields: hwBaseTrapSeverity, hwBaseTrapProbableCause, hwBaseTrapEventType, entPhysicalName, hwBaseThresholdValue, hwBaseThresholdUnit, hwBaseThresholdHighWarning, hwBaseThresholdHighCritical
// Description: This object indicates that the alarm generated when the voltage sensor exceeds the upper threshold is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.2.10"] = [
    name: "hwVoltRisingResume",
    fields: ["hwBaseTrapSeverity", "hwBaseTrapProbableCause", "hwBaseTrapEventType", "entPhysicalName", "hwBaseThresholdValue", "hwBaseThresholdUnit", "hwBaseThresholdHighWarning", "hwBaseThresholdHighCritical"],
    fieldOids: ["hwBaseTrapSeverity": "1.3.6.1.4.1.2011.5.25.129.1.1", "hwBaseTrapProbableCause": "1.3.6.1.4.1.2011.5.25.129.1.2", "hwBaseTrapEventType": "1.3.6.1.4.1.2011.5.25.129.1.3", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwBaseThresholdValue": "1.3.6.1.4.1.2011.5.25.129.1.6.1.3", "hwBaseThresholdUnit": "1.3.6.1.4.1.2011.5.25.129.1.6.1.4", "hwBaseThresholdHighWarning": "1.3.6.1.4.1.2011.5.25.129.1.6.1.7", "hwBaseThresholdHighCritical": "1.3.6.1.4.1.2011.5.25.129.1.6.1.8"]
]

// --- hwVoltFallingAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.2.11
// Fields: hwBaseTrapSeverity, hwBaseTrapProbableCause, hwBaseTrapEventType, entPhysicalName, hwBaseThresholdValue, hwBaseThresholdUnit, hwBaseThresholdLowCritical, hwBaseThresholdLowWarning
// Description: This object indicates that an alarm is generated when the voltage sensor exceeds the lower threshold.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.2.11"] = [
    name: "hwVoltFallingAlarm",
    fields: ["hwBaseTrapSeverity", "hwBaseTrapProbableCause", "hwBaseTrapEventType", "entPhysicalName", "hwBaseThresholdValue", "hwBaseThresholdUnit", "hwBaseThresholdLowCritical", "hwBaseThresholdLowWarning"],
    fieldOids: ["hwBaseTrapSeverity": "1.3.6.1.4.1.2011.5.25.129.1.1", "hwBaseTrapProbableCause": "1.3.6.1.4.1.2011.5.25.129.1.2", "hwBaseTrapEventType": "1.3.6.1.4.1.2011.5.25.129.1.3", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwBaseThresholdValue": "1.3.6.1.4.1.2011.5.25.129.1.6.1.3", "hwBaseThresholdUnit": "1.3.6.1.4.1.2011.5.25.129.1.6.1.4", "hwBaseThresholdLowCritical": "1.3.6.1.4.1.2011.5.25.129.1.6.1.5", "hwBaseThresholdLowWarning": "1.3.6.1.4.1.2011.5.25.129.1.6.1.6"]
]

// --- hwVoltFallingResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.2.12
// Fields: hwBaseTrapSeverity, hwBaseTrapProbableCause, hwBaseTrapEventType, entPhysicalName, hwBaseThresholdValue, hwBaseThresholdUnit, hwBaseThresholdLowCritical, hwBaseThresholdLowWarning
// Description: This object indicates that the alarm generated when the voltage sensor exceeds the lower threshold is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.2.12"] = [
    name: "hwVoltFallingResume",
    fields: ["hwBaseTrapSeverity", "hwBaseTrapProbableCause", "hwBaseTrapEventType", "entPhysicalName", "hwBaseThresholdValue", "hwBaseThresholdUnit", "hwBaseThresholdLowCritical", "hwBaseThresholdLowWarning"],
    fieldOids: ["hwBaseTrapSeverity": "1.3.6.1.4.1.2011.5.25.129.1.1", "hwBaseTrapProbableCause": "1.3.6.1.4.1.2011.5.25.129.1.2", "hwBaseTrapEventType": "1.3.6.1.4.1.2011.5.25.129.1.3", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwBaseThresholdValue": "1.3.6.1.4.1.2011.5.25.129.1.6.1.3", "hwBaseThresholdUnit": "1.3.6.1.4.1.2011.5.25.129.1.6.1.4", "hwBaseThresholdLowCritical": "1.3.6.1.4.1.2011.5.25.129.1.6.1.5", "hwBaseThresholdLowWarning": "1.3.6.1.4.1.2011.5.25.129.1.6.1.6"]
]

// --- hwCurrentRisingAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.2.13
// Fields: hwBaseTrapSeverity, hwBaseTrapProbableCause, hwBaseTrapEventType, entPhysicalName, hwBaseThresholdValue, hwBaseThresholdUnit, hwBaseThresholdHighWarning, hwBaseThresholdHighCritical
// Description: Current rise over HIGH threshold.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.2.13"] = [
    name: "hwCurrentRisingAlarm",
    fields: ["hwBaseTrapSeverity", "hwBaseTrapProbableCause", "hwBaseTrapEventType", "entPhysicalName", "hwBaseThresholdValue", "hwBaseThresholdUnit", "hwBaseThresholdHighWarning", "hwBaseThresholdHighCritical"],
    fieldOids: ["hwBaseTrapSeverity": "1.3.6.1.4.1.2011.5.25.129.1.1", "hwBaseTrapProbableCause": "1.3.6.1.4.1.2011.5.25.129.1.2", "hwBaseTrapEventType": "1.3.6.1.4.1.2011.5.25.129.1.3", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwBaseThresholdValue": "1.3.6.1.4.1.2011.5.25.129.1.6.1.3", "hwBaseThresholdUnit": "1.3.6.1.4.1.2011.5.25.129.1.6.1.4", "hwBaseThresholdHighWarning": "1.3.6.1.4.1.2011.5.25.129.1.6.1.7", "hwBaseThresholdHighCritical": "1.3.6.1.4.1.2011.5.25.129.1.6.1.8"]
]

// --- hwCurrentRisingResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.2.14
// Fields: hwBaseTrapSeverity, hwBaseTrapProbableCause, hwBaseTrapEventType, entPhysicalName, hwBaseThresholdValue, hwBaseThresholdUnit, hwBaseThresholdHighWarning, hwBaseThresholdHighCritical
// Description: Current back to normal level.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.2.14"] = [
    name: "hwCurrentRisingResume",
    fields: ["hwBaseTrapSeverity", "hwBaseTrapProbableCause", "hwBaseTrapEventType", "entPhysicalName", "hwBaseThresholdValue", "hwBaseThresholdUnit", "hwBaseThresholdHighWarning", "hwBaseThresholdHighCritical"],
    fieldOids: ["hwBaseTrapSeverity": "1.3.6.1.4.1.2011.5.25.129.1.1", "hwBaseTrapProbableCause": "1.3.6.1.4.1.2011.5.25.129.1.2", "hwBaseTrapEventType": "1.3.6.1.4.1.2011.5.25.129.1.3", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwBaseThresholdValue": "1.3.6.1.4.1.2011.5.25.129.1.6.1.3", "hwBaseThresholdUnit": "1.3.6.1.4.1.2011.5.25.129.1.6.1.4", "hwBaseThresholdHighWarning": "1.3.6.1.4.1.2011.5.25.129.1.6.1.7", "hwBaseThresholdHighCritical": "1.3.6.1.4.1.2011.5.25.129.1.6.1.8"]
]

// --- hwCurrentFallingAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.2.15
// Fields: hwBaseTrapSeverity, hwBaseTrapProbableCause, hwBaseTrapEventType, entPhysicalName, hwBaseThresholdValue, hwBaseThresholdUnit, hwBaseThresholdLowCritical, hwBaseThresholdLowWarning
// Description: Current fall below LOW threshold.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.2.15"] = [
    name: "hwCurrentFallingAlarm",
    fields: ["hwBaseTrapSeverity", "hwBaseTrapProbableCause", "hwBaseTrapEventType", "entPhysicalName", "hwBaseThresholdValue", "hwBaseThresholdUnit", "hwBaseThresholdLowCritical", "hwBaseThresholdLowWarning"],
    fieldOids: ["hwBaseTrapSeverity": "1.3.6.1.4.1.2011.5.25.129.1.1", "hwBaseTrapProbableCause": "1.3.6.1.4.1.2011.5.25.129.1.2", "hwBaseTrapEventType": "1.3.6.1.4.1.2011.5.25.129.1.3", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwBaseThresholdValue": "1.3.6.1.4.1.2011.5.25.129.1.6.1.3", "hwBaseThresholdUnit": "1.3.6.1.4.1.2011.5.25.129.1.6.1.4", "hwBaseThresholdLowCritical": "1.3.6.1.4.1.2011.5.25.129.1.6.1.5", "hwBaseThresholdLowWarning": "1.3.6.1.4.1.2011.5.25.129.1.6.1.6"]
]

// --- hwCurrentFallingResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.2.16
// Fields: hwBaseTrapSeverity, hwBaseTrapProbableCause, hwBaseTrapEventType, entPhysicalName, hwBaseThresholdValue, hwBaseThresholdUnit, hwBaseThresholdLowCritical, hwBaseThresholdLowWarning
// Description: Current back to normal level.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.2.16"] = [
    name: "hwCurrentFallingResume",
    fields: ["hwBaseTrapSeverity", "hwBaseTrapProbableCause", "hwBaseTrapEventType", "entPhysicalName", "hwBaseThresholdValue", "hwBaseThresholdUnit", "hwBaseThresholdLowCritical", "hwBaseThresholdLowWarning"],
    fieldOids: ["hwBaseTrapSeverity": "1.3.6.1.4.1.2011.5.25.129.1.1", "hwBaseTrapProbableCause": "1.3.6.1.4.1.2011.5.25.129.1.2", "hwBaseTrapEventType": "1.3.6.1.4.1.2011.5.25.129.1.3", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwBaseThresholdValue": "1.3.6.1.4.1.2011.5.25.129.1.6.1.3", "hwBaseThresholdUnit": "1.3.6.1.4.1.2011.5.25.129.1.6.1.4", "hwBaseThresholdLowCritical": "1.3.6.1.4.1.2011.5.25.129.1.6.1.5", "hwBaseThresholdLowWarning": "1.3.6.1.4.1.2011.5.25.129.1.6.1.6"]
]

// --- hwPowerRisingAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.2.17
// Fields: hwBaseTrapSeverity, hwBaseTrapProbableCause, hwBaseTrapEventType, entPhysicalName, hwBaseThresholdValue, hwBaseThresholdUnit, hwBaseThresholdHighWarning, hwBaseThresholdHighCritical, hwPowerDirection
// Description: Photoelectric power rise over HIGH threshold.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.2.17"] = [
    name: "hwPowerRisingAlarm",
    fields: ["hwBaseTrapSeverity", "hwBaseTrapProbableCause", "hwBaseTrapEventType", "entPhysicalName", "hwBaseThresholdValue", "hwBaseThresholdUnit", "hwBaseThresholdHighWarning", "hwBaseThresholdHighCritical", "hwPowerDirection"],
    fieldOids: ["hwBaseTrapSeverity": "1.3.6.1.4.1.2011.5.25.129.1.1", "hwBaseTrapProbableCause": "1.3.6.1.4.1.2011.5.25.129.1.2", "hwBaseTrapEventType": "1.3.6.1.4.1.2011.5.25.129.1.3", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwBaseThresholdValue": "1.3.6.1.4.1.2011.5.25.129.1.6.1.3", "hwBaseThresholdUnit": "1.3.6.1.4.1.2011.5.25.129.1.6.1.4", "hwBaseThresholdHighWarning": "1.3.6.1.4.1.2011.5.25.129.1.6.1.7", "hwBaseThresholdHighCritical": "1.3.6.1.4.1.2011.5.25.129.1.6.1.8", "hwPowerDirection": "1.3.6.1.4.1.2011.5.25.129.1.10"]
]

// --- hwPowerRisingResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.2.18
// Fields: hwBaseTrapSeverity, hwBaseTrapProbableCause, hwBaseTrapEventType, entPhysicalName, hwBaseThresholdValue, hwBaseThresholdUnit, hwBaseThresholdHighWarning, hwBaseThresholdHighCritical, hwPowerDirection
// Description: Photoelectric power back to normal level.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.2.18"] = [
    name: "hwPowerRisingResume",
    fields: ["hwBaseTrapSeverity", "hwBaseTrapProbableCause", "hwBaseTrapEventType", "entPhysicalName", "hwBaseThresholdValue", "hwBaseThresholdUnit", "hwBaseThresholdHighWarning", "hwBaseThresholdHighCritical", "hwPowerDirection"],
    fieldOids: ["hwBaseTrapSeverity": "1.3.6.1.4.1.2011.5.25.129.1.1", "hwBaseTrapProbableCause": "1.3.6.1.4.1.2011.5.25.129.1.2", "hwBaseTrapEventType": "1.3.6.1.4.1.2011.5.25.129.1.3", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwBaseThresholdValue": "1.3.6.1.4.1.2011.5.25.129.1.6.1.3", "hwBaseThresholdUnit": "1.3.6.1.4.1.2011.5.25.129.1.6.1.4", "hwBaseThresholdHighWarning": "1.3.6.1.4.1.2011.5.25.129.1.6.1.7", "hwBaseThresholdHighCritical": "1.3.6.1.4.1.2011.5.25.129.1.6.1.8", "hwPowerDirection": "1.3.6.1.4.1.2011.5.25.129.1.10"]
]

// --- hwPowerFallingAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.2.19
// Fields: hwBaseTrapSeverity, hwBaseTrapProbableCause, hwBaseTrapEventType, entPhysicalName, hwBaseThresholdValue, hwBaseThresholdUnit, hwBaseThresholdLowCritical, hwBaseThresholdLowWarning, hwPowerDirection
// Description: Photoelectric power fall below LOW threshold.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.2.19"] = [
    name: "hwPowerFallingAlarm",
    fields: ["hwBaseTrapSeverity", "hwBaseTrapProbableCause", "hwBaseTrapEventType", "entPhysicalName", "hwBaseThresholdValue", "hwBaseThresholdUnit", "hwBaseThresholdLowCritical", "hwBaseThresholdLowWarning", "hwPowerDirection"],
    fieldOids: ["hwBaseTrapSeverity": "1.3.6.1.4.1.2011.5.25.129.1.1", "hwBaseTrapProbableCause": "1.3.6.1.4.1.2011.5.25.129.1.2", "hwBaseTrapEventType": "1.3.6.1.4.1.2011.5.25.129.1.3", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwBaseThresholdValue": "1.3.6.1.4.1.2011.5.25.129.1.6.1.3", "hwBaseThresholdUnit": "1.3.6.1.4.1.2011.5.25.129.1.6.1.4", "hwBaseThresholdLowCritical": "1.3.6.1.4.1.2011.5.25.129.1.6.1.5", "hwBaseThresholdLowWarning": "1.3.6.1.4.1.2011.5.25.129.1.6.1.6", "hwPowerDirection": "1.3.6.1.4.1.2011.5.25.129.1.10"]
]

// --- hwPowerFallingResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.2.20
// Fields: hwBaseTrapSeverity, hwBaseTrapProbableCause, hwBaseTrapEventType, entPhysicalName, hwBaseThresholdValue, hwBaseThresholdUnit, hwBaseThresholdLowCritical, hwBaseThresholdLowWarning, hwPowerDirection
// Description: Photoelectric power back to normal level.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.2.20"] = [
    name: "hwPowerFallingResume",
    fields: ["hwBaseTrapSeverity", "hwBaseTrapProbableCause", "hwBaseTrapEventType", "entPhysicalName", "hwBaseThresholdValue", "hwBaseThresholdUnit", "hwBaseThresholdLowCritical", "hwBaseThresholdLowWarning", "hwPowerDirection"],
    fieldOids: ["hwBaseTrapSeverity": "1.3.6.1.4.1.2011.5.25.129.1.1", "hwBaseTrapProbableCause": "1.3.6.1.4.1.2011.5.25.129.1.2", "hwBaseTrapEventType": "1.3.6.1.4.1.2011.5.25.129.1.3", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwBaseThresholdValue": "1.3.6.1.4.1.2011.5.25.129.1.6.1.3", "hwBaseThresholdUnit": "1.3.6.1.4.1.2011.5.25.129.1.6.1.4", "hwBaseThresholdLowCritical": "1.3.6.1.4.1.2011.5.25.129.1.6.1.5", "hwBaseThresholdLowWarning": "1.3.6.1.4.1.2011.5.25.129.1.6.1.6", "hwPowerDirection": "1.3.6.1.4.1.2011.5.25.129.1.10"]
]

// --- hwPowerInsufficiencyAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.2.21
// Fields: hwBaseTrapSeverity, hwBaseTrapProbableCause, hwBaseTrapEventType, entPhysicalContainedIn, entPhysicalName, hwEntityRatedPower, hwDevAvailablePower, hwDeviceTotalPower
// Description: The available power of device is not enough for the board.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.2.21"] = [
    name: "hwPowerInsufficiencyAlarm",
    fields: ["hwBaseTrapSeverity", "hwBaseTrapProbableCause", "hwBaseTrapEventType", "entPhysicalContainedIn", "entPhysicalName", "hwEntityRatedPower", "hwDevAvailablePower", "hwDeviceTotalPower"],
    fieldOids: ["hwBaseTrapSeverity": "1.3.6.1.4.1.2011.5.25.129.1.1", "hwBaseTrapProbableCause": "1.3.6.1.4.1.2011.5.25.129.1.2", "hwBaseTrapEventType": "1.3.6.1.4.1.2011.5.25.129.1.3", "entPhysicalContainedIn": "1.3.6.1.2.1.47.1.1.1.1.4", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityRatedPower": "1.3.6.1.4.1.2011.5.25.129.1.12", "hwDevAvailablePower": "1.3.6.1.4.1.2011.5.25.129.1.13", "hwDeviceTotalPower": "1.3.6.1.4.1.2011.5.25.129.1.14"]
]

// --- hwPowerInsufficiencyResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.2.22
// Fields: hwBaseTrapSeverity, hwBaseTrapProbableCause, hwBaseTrapEventType, entPhysicalContainedIn, entPhysicalName, hwEntityRatedPower, hwDevAvailablePower, hwDeviceTotalPower
// Description: The available power of device becomes sufficient for the board.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.2.22"] = [
    name: "hwPowerInsufficiencyResume",
    fields: ["hwBaseTrapSeverity", "hwBaseTrapProbableCause", "hwBaseTrapEventType", "entPhysicalContainedIn", "entPhysicalName", "hwEntityRatedPower", "hwDevAvailablePower", "hwDeviceTotalPower"],
    fieldOids: ["hwBaseTrapSeverity": "1.3.6.1.4.1.2011.5.25.129.1.1", "hwBaseTrapProbableCause": "1.3.6.1.4.1.2011.5.25.129.1.2", "hwBaseTrapEventType": "1.3.6.1.4.1.2011.5.25.129.1.3", "entPhysicalContainedIn": "1.3.6.1.2.1.47.1.1.1.1.4", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwEntityRatedPower": "1.3.6.1.4.1.2011.5.25.129.1.12", "hwDevAvailablePower": "1.3.6.1.4.1.2011.5.25.129.1.13", "hwDeviceTotalPower": "1.3.6.1.4.1.2011.5.25.129.1.14"]
]

// --- hwAcuSoftwareUpgradeFailure (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.2.23
// Description: ACU current startup system software and next startup system software are difference.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.2.23"] = [
    name: "hwAcuSoftwareUpgradeFailure",
    fields: [],
    fieldOids: []
]

// --- hwPowerOff (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.3.1
// Fields: hwBaseTrapSeverity, hwBaseTrapProbableCause, hwBaseTrapEventType, entPhysicalContainedIn, entPhysicalName
// Description: One of the power is shutting down.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.3.1"] = [
    name: "hwPowerOff",
    fields: ["hwBaseTrapSeverity", "hwBaseTrapProbableCause", "hwBaseTrapEventType", "entPhysicalContainedIn", "entPhysicalName"],
    fieldOids: ["hwBaseTrapSeverity": "1.3.6.1.4.1.2011.5.25.129.1.1", "hwBaseTrapProbableCause": "1.3.6.1.4.1.2011.5.25.129.1.2", "hwBaseTrapEventType": "1.3.6.1.4.1.2011.5.25.129.1.3", "entPhysicalContainedIn": "1.3.6.1.2.1.47.1.1.1.1.4", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwPowerOn (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.3.2
// Fields: hwBaseTrapSeverity, hwBaseTrapProbableCause, hwBaseTrapEventType, entPhysicalContainedIn, entPhysicalName
// Description: One of the power is starting up.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.3.2"] = [
    name: "hwPowerOn",
    fields: ["hwBaseTrapSeverity", "hwBaseTrapProbableCause", "hwBaseTrapEventType", "entPhysicalContainedIn", "entPhysicalName"],
    fieldOids: ["hwBaseTrapSeverity": "1.3.6.1.4.1.2011.5.25.129.1.1", "hwBaseTrapProbableCause": "1.3.6.1.4.1.2011.5.25.129.1.2", "hwBaseTrapEventType": "1.3.6.1.4.1.2011.5.25.129.1.3", "entPhysicalContainedIn": "1.3.6.1.2.1.47.1.1.1.1.4", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwPowerMixed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.3.3
// Fields: hwBaseTrapSeverity, hwBaseTrapProbableCause, hwBaseTrapEventType, entPhysicalContainedIn, entPhysicalName
// Description: The power is not of the same type!
trapMap["1.3.6.1.4.1.2011.5.25.129.2.3.3"] = [
    name: "hwPowerMixed",
    fields: ["hwBaseTrapSeverity", "hwBaseTrapProbableCause", "hwBaseTrapEventType", "entPhysicalContainedIn", "entPhysicalName"],
    fieldOids: ["hwBaseTrapSeverity": "1.3.6.1.4.1.2011.5.25.129.1.1", "hwBaseTrapProbableCause": "1.3.6.1.4.1.2011.5.25.129.1.2", "hwBaseTrapEventType": "1.3.6.1.4.1.2011.5.25.129.1.3", "entPhysicalContainedIn": "1.3.6.1.2.1.47.1.1.1.1.4", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwPowerMixedResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.3.4
// Fields: hwBaseTrapSeverity, hwBaseTrapProbableCause, hwBaseTrapEventType, entPhysicalContainedIn, entPhysicalName
// Description: The power is changed to the same type!
trapMap["1.3.6.1.4.1.2011.5.25.129.2.3.4"] = [
    name: "hwPowerMixedResume",
    fields: ["hwBaseTrapSeverity", "hwBaseTrapProbableCause", "hwBaseTrapEventType", "entPhysicalContainedIn", "entPhysicalName"],
    fieldOids: ["hwBaseTrapSeverity": "1.3.6.1.4.1.2011.5.25.129.1.1", "hwBaseTrapProbableCause": "1.3.6.1.4.1.2011.5.25.129.1.2", "hwBaseTrapEventType": "1.3.6.1.4.1.2011.5.25.129.1.3", "entPhysicalContainedIn": "1.3.6.1.2.1.47.1.1.1.1.4", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwCPUUtilizationRisingAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.4.1
// Fields: hwBaseTrapSeverity, hwBaseTrapProbableCause, hwBaseTrapEventType, entPhysicalName, hwBaseTrapRelativeResource, hwBaseUsageValue, hwBaseUsageUnit, hwBaseUsageThreshold
// Description: CPU utilization exceed threshold.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.4.1"] = [
    name: "hwCPUUtilizationRisingAlarm",
    fields: ["hwBaseTrapSeverity", "hwBaseTrapProbableCause", "hwBaseTrapEventType", "entPhysicalName", "hwBaseTrapRelativeResource", "hwBaseUsageValue", "hwBaseUsageUnit", "hwBaseUsageThreshold"],
    fieldOids: ["hwBaseTrapSeverity": "1.3.6.1.4.1.2011.5.25.129.1.1", "hwBaseTrapProbableCause": "1.3.6.1.4.1.2011.5.25.129.1.2", "hwBaseTrapEventType": "1.3.6.1.4.1.2011.5.25.129.1.3", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwBaseTrapRelativeResource": "1.3.6.1.4.1.2011.5.25.129.1.4", "hwBaseUsageValue": "1.3.6.1.4.1.2011.5.25.129.1.7.1.3", "hwBaseUsageUnit": "1.3.6.1.4.1.2011.5.25.129.1.7.1.4", "hwBaseUsageThreshold": "1.3.6.1.4.1.2011.5.25.129.1.7.1.5"]
]

// --- hwCPUUtilizationResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.4.2
// Fields: hwBaseTrapSeverity, hwBaseTrapProbableCause, hwBaseTrapEventType, entPhysicalName, hwBaseTrapRelativeResource, hwBaseUsageValue, hwBaseUsageUnit, hwBaseUsageThreshold
// Description: CPU utilization back to normal level.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.4.2"] = [
    name: "hwCPUUtilizationResume",
    fields: ["hwBaseTrapSeverity", "hwBaseTrapProbableCause", "hwBaseTrapEventType", "entPhysicalName", "hwBaseTrapRelativeResource", "hwBaseUsageValue", "hwBaseUsageUnit", "hwBaseUsageThreshold"],
    fieldOids: ["hwBaseTrapSeverity": "1.3.6.1.4.1.2011.5.25.129.1.1", "hwBaseTrapProbableCause": "1.3.6.1.4.1.2011.5.25.129.1.2", "hwBaseTrapEventType": "1.3.6.1.4.1.2011.5.25.129.1.3", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwBaseTrapRelativeResource": "1.3.6.1.4.1.2011.5.25.129.1.4", "hwBaseUsageValue": "1.3.6.1.4.1.2011.5.25.129.1.7.1.3", "hwBaseUsageUnit": "1.3.6.1.4.1.2011.5.25.129.1.7.1.4", "hwBaseUsageThreshold": "1.3.6.1.4.1.2011.5.25.129.1.7.1.5"]
]

// --- hwPortPhysicalDown (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.5.1
// Fields: hwBaseTrapSeverity, hwBaseTrapProbableCause, hwBaseTrapEventType, entPhysicalName, hwPortPhysicalDownReason, ifOperStatus, ifAdminStatus
// Description: One of the port physical connect down.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.5.1"] = [
    name: "hwPortPhysicalDown",
    fields: ["hwBaseTrapSeverity", "hwBaseTrapProbableCause", "hwBaseTrapEventType", "entPhysicalName", "hwPortPhysicalDownReason", "ifOperStatus", "ifAdminStatus"],
    fieldOids: ["hwBaseTrapSeverity": "1.3.6.1.4.1.2011.5.25.129.1.1", "hwBaseTrapProbableCause": "1.3.6.1.4.1.2011.5.25.129.1.2", "hwBaseTrapEventType": "1.3.6.1.4.1.2011.5.25.129.1.3", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwPortPhysicalDownReason": "1.3.6.1.4.1.2011.5.25.129.1.17", "ifOperStatus": "1.3.6.1.2.1.2.2.1.8", "ifAdminStatus": "1.3.6.1.2.1.2.2.1.7"]
]

// --- hwPortPhysicalUp (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.5.2
// Fields: hwBaseTrapSeverity, hwBaseTrapProbableCause, hwBaseTrapEventType, entPhysicalName, ifOperStatus, ifAdminStatus
// Description: One of the port physical connect up.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.5.2"] = [
    name: "hwPortPhysicalUp",
    fields: ["hwBaseTrapSeverity", "hwBaseTrapProbableCause", "hwBaseTrapEventType", "entPhysicalName", "ifOperStatus", "ifAdminStatus"],
    fieldOids: ["hwBaseTrapSeverity": "1.3.6.1.4.1.2011.5.25.129.1.1", "hwBaseTrapProbableCause": "1.3.6.1.4.1.2011.5.25.129.1.2", "hwBaseTrapEventType": "1.3.6.1.4.1.2011.5.25.129.1.3", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "ifOperStatus": "1.3.6.1.2.1.2.2.1.8", "ifAdminStatus": "1.3.6.1.2.1.2.2.1.7"]
]

// --- hwPortPhysicalNoTrafficAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.5.3
// Fields: hwBaseTrapSeverity, hwBaseTrapProbableCause, hwBaseTrapEventType, entPhysicalName, hwBaseTrapRelativeResource, hwBaseTrapTrafficDir
// Description: One of the port has none traffic.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.5.3"] = [
    name: "hwPortPhysicalNoTrafficAlarm",
    fields: ["hwBaseTrapSeverity", "hwBaseTrapProbableCause", "hwBaseTrapEventType", "entPhysicalName", "hwBaseTrapRelativeResource", "hwBaseTrapTrafficDir"],
    fieldOids: ["hwBaseTrapSeverity": "1.3.6.1.4.1.2011.5.25.129.1.1", "hwBaseTrapProbableCause": "1.3.6.1.4.1.2011.5.25.129.1.2", "hwBaseTrapEventType": "1.3.6.1.4.1.2011.5.25.129.1.3", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwBaseTrapRelativeResource": "1.3.6.1.4.1.2011.5.25.129.1.4", "hwBaseTrapTrafficDir": "1.3.6.1.4.1.2011.5.25.129.1.11"]
]

// --- hwPortPhysicalNoTrafficClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.5.4
// Fields: hwBaseTrapSeverity, hwBaseTrapProbableCause, hwBaseTrapEventType, entPhysicalName, hwBaseTrapRelativeResource, hwBaseTrapTrafficDir
// Description: One of the port traffic resume.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.5.4"] = [
    name: "hwPortPhysicalNoTrafficClear",
    fields: ["hwBaseTrapSeverity", "hwBaseTrapProbableCause", "hwBaseTrapEventType", "entPhysicalName", "hwBaseTrapRelativeResource", "hwBaseTrapTrafficDir"],
    fieldOids: ["hwBaseTrapSeverity": "1.3.6.1.4.1.2011.5.25.129.1.1", "hwBaseTrapProbableCause": "1.3.6.1.4.1.2011.5.25.129.1.2", "hwBaseTrapEventType": "1.3.6.1.4.1.2011.5.25.129.1.3", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwBaseTrapRelativeResource": "1.3.6.1.4.1.2011.5.25.129.1.4", "hwBaseTrapTrafficDir": "1.3.6.1.4.1.2011.5.25.129.1.11"]
]

// --- hwPortPhysicalTrafficRisingAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.5.5
// Fields: hwBaseTrapSeverity, hwBaseTrapProbableCause, hwBaseTrapEventType, entPhysicalName, hwBaseTrapRelativeResource, hwBaseThresholdValue, hwBaseThresholdUnit, hwBaseThresholdHighWarning, hwBaseTrapTrafficDir
// Description: One of the port traffic rise over threshold.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.5.5"] = [
    name: "hwPortPhysicalTrafficRisingAlarm",
    fields: ["hwBaseTrapSeverity", "hwBaseTrapProbableCause", "hwBaseTrapEventType", "entPhysicalName", "hwBaseTrapRelativeResource", "hwBaseThresholdValue", "hwBaseThresholdUnit", "hwBaseThresholdHighWarning", "hwBaseTrapTrafficDir"],
    fieldOids: ["hwBaseTrapSeverity": "1.3.6.1.4.1.2011.5.25.129.1.1", "hwBaseTrapProbableCause": "1.3.6.1.4.1.2011.5.25.129.1.2", "hwBaseTrapEventType": "1.3.6.1.4.1.2011.5.25.129.1.3", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwBaseTrapRelativeResource": "1.3.6.1.4.1.2011.5.25.129.1.4", "hwBaseThresholdValue": "1.3.6.1.4.1.2011.5.25.129.1.6.1.3", "hwBaseThresholdUnit": "1.3.6.1.4.1.2011.5.25.129.1.6.1.4", "hwBaseThresholdHighWarning": "1.3.6.1.4.1.2011.5.25.129.1.6.1.7", "hwBaseTrapTrafficDir": "1.3.6.1.4.1.2011.5.25.129.1.11"]
]

// --- hwPortPhysicalTrafficClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.5.6
// Fields: hwBaseTrapSeverity, hwBaseTrapProbableCause, hwBaseTrapEventType, entPhysicalName, hwBaseTrapRelativeResource, hwBaseThresholdValue, hwBaseThresholdUnit, hwBaseThresholdLowWarning, hwBaseTrapTrafficDir
// Description: One of the port traffic resume to normal level.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.5.6"] = [
    name: "hwPortPhysicalTrafficClear",
    fields: ["hwBaseTrapSeverity", "hwBaseTrapProbableCause", "hwBaseTrapEventType", "entPhysicalName", "hwBaseTrapRelativeResource", "hwBaseThresholdValue", "hwBaseThresholdUnit", "hwBaseThresholdLowWarning", "hwBaseTrapTrafficDir"],
    fieldOids: ["hwBaseTrapSeverity": "1.3.6.1.4.1.2011.5.25.129.1.1", "hwBaseTrapProbableCause": "1.3.6.1.4.1.2011.5.25.129.1.2", "hwBaseTrapEventType": "1.3.6.1.4.1.2011.5.25.129.1.3", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwBaseTrapRelativeResource": "1.3.6.1.4.1.2011.5.25.129.1.4", "hwBaseThresholdValue": "1.3.6.1.4.1.2011.5.25.129.1.6.1.3", "hwBaseThresholdUnit": "1.3.6.1.4.1.2011.5.25.129.1.6.1.4", "hwBaseThresholdLowWarning": "1.3.6.1.4.1.2011.5.25.129.1.6.1.6", "hwBaseTrapTrafficDir": "1.3.6.1.4.1.2011.5.25.129.1.11"]
]

// --- hwPortPhysicalCrcErrorRisingAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.5.7
// Fields: hwBaseTrapSeverity, hwBaseTrapProbableCause, hwBaseTrapEventType, entPhysicalName, hwBaseTrapRelativeResource, hwBaseThresholdValue, hwBaseThresholdUnit, hwBaseThresholdHighWarning
// Description: One of the port CRC error rise over threshold.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.5.7"] = [
    name: "hwPortPhysicalCrcErrorRisingAlarm",
    fields: ["hwBaseTrapSeverity", "hwBaseTrapProbableCause", "hwBaseTrapEventType", "entPhysicalName", "hwBaseTrapRelativeResource", "hwBaseThresholdValue", "hwBaseThresholdUnit", "hwBaseThresholdHighWarning"],
    fieldOids: ["hwBaseTrapSeverity": "1.3.6.1.4.1.2011.5.25.129.1.1", "hwBaseTrapProbableCause": "1.3.6.1.4.1.2011.5.25.129.1.2", "hwBaseTrapEventType": "1.3.6.1.4.1.2011.5.25.129.1.3", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwBaseTrapRelativeResource": "1.3.6.1.4.1.2011.5.25.129.1.4", "hwBaseThresholdValue": "1.3.6.1.4.1.2011.5.25.129.1.6.1.3", "hwBaseThresholdUnit": "1.3.6.1.4.1.2011.5.25.129.1.6.1.4", "hwBaseThresholdHighWarning": "1.3.6.1.4.1.2011.5.25.129.1.6.1.7"]
]

// --- hwPortPhysicalCrcErrorClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.5.8
// Fields: hwBaseTrapSeverity, hwBaseTrapProbableCause, hwBaseTrapEventType, entPhysicalName, hwBaseTrapRelativeResource, hwBaseThresholdValue, hwBaseThresholdUnit, hwBaseThresholdLowWarning
// Description: One of the port CRC error resume to normal level.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.5.8"] = [
    name: "hwPortPhysicalCrcErrorClear",
    fields: ["hwBaseTrapSeverity", "hwBaseTrapProbableCause", "hwBaseTrapEventType", "entPhysicalName", "hwBaseTrapRelativeResource", "hwBaseThresholdValue", "hwBaseThresholdUnit", "hwBaseThresholdLowWarning"],
    fieldOids: ["hwBaseTrapSeverity": "1.3.6.1.4.1.2011.5.25.129.1.1", "hwBaseTrapProbableCause": "1.3.6.1.4.1.2011.5.25.129.1.2", "hwBaseTrapEventType": "1.3.6.1.4.1.2011.5.25.129.1.3", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwBaseTrapRelativeResource": "1.3.6.1.4.1.2011.5.25.129.1.4", "hwBaseThresholdValue": "1.3.6.1.4.1.2011.5.25.129.1.6.1.3", "hwBaseThresholdUnit": "1.3.6.1.4.1.2011.5.25.129.1.6.1.4", "hwBaseThresholdLowWarning": "1.3.6.1.4.1.2011.5.25.129.1.6.1.6"]
]

// --- hwPortPhysicalEthBroadcastRisingAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.5.9
// Fields: hwBaseTrapSeverity, hwBaseTrapProbableCause, hwBaseTrapEventType, entPhysicalName, hwBaseTrapRelativeResource, hwBaseThresholdValue, hwBaseThresholdUnit, hwBaseThresholdHighWarning
// Description: One of the Ethernet port broadcast rise over threshold.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.5.9"] = [
    name: "hwPortPhysicalEthBroadcastRisingAlarm",
    fields: ["hwBaseTrapSeverity", "hwBaseTrapProbableCause", "hwBaseTrapEventType", "entPhysicalName", "hwBaseTrapRelativeResource", "hwBaseThresholdValue", "hwBaseThresholdUnit", "hwBaseThresholdHighWarning"],
    fieldOids: ["hwBaseTrapSeverity": "1.3.6.1.4.1.2011.5.25.129.1.1", "hwBaseTrapProbableCause": "1.3.6.1.4.1.2011.5.25.129.1.2", "hwBaseTrapEventType": "1.3.6.1.4.1.2011.5.25.129.1.3", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwBaseTrapRelativeResource": "1.3.6.1.4.1.2011.5.25.129.1.4", "hwBaseThresholdValue": "1.3.6.1.4.1.2011.5.25.129.1.6.1.3", "hwBaseThresholdUnit": "1.3.6.1.4.1.2011.5.25.129.1.6.1.4", "hwBaseThresholdHighWarning": "1.3.6.1.4.1.2011.5.25.129.1.6.1.7"]
]

// --- hwPortPhysicalEthBroadcastClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.5.10
// Fields: hwBaseTrapSeverity, hwBaseTrapProbableCause, hwBaseTrapEventType, entPhysicalName, hwBaseTrapRelativeResource, hwBaseThresholdValue, hwBaseThresholdUnit, hwBaseThresholdLowWarning
// Description: One of the Ethernet port broadcast resume to normal level.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.5.10"] = [
    name: "hwPortPhysicalEthBroadcastClear",
    fields: ["hwBaseTrapSeverity", "hwBaseTrapProbableCause", "hwBaseTrapEventType", "entPhysicalName", "hwBaseTrapRelativeResource", "hwBaseThresholdValue", "hwBaseThresholdUnit", "hwBaseThresholdLowWarning"],
    fieldOids: ["hwBaseTrapSeverity": "1.3.6.1.4.1.2011.5.25.129.1.1", "hwBaseTrapProbableCause": "1.3.6.1.4.1.2011.5.25.129.1.2", "hwBaseTrapEventType": "1.3.6.1.4.1.2011.5.25.129.1.3", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwBaseTrapRelativeResource": "1.3.6.1.4.1.2011.5.25.129.1.4", "hwBaseThresholdValue": "1.3.6.1.4.1.2011.5.25.129.1.6.1.3", "hwBaseThresholdUnit": "1.3.6.1.4.1.2011.5.25.129.1.6.1.4", "hwBaseThresholdLowWarning": "1.3.6.1.4.1.2011.5.25.129.1.6.1.6"]
]

// --- hwPortPhysicalEthHalfDuplexAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.5.11
// Fields: hwBaseTrapSeverity, hwBaseTrapProbableCause, hwBaseTrapEventType, entPhysicalName, hwBaseTrapRelativeResource
// Description: One of the Ethernet port works on the half-duplex mode.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.5.11"] = [
    name: "hwPortPhysicalEthHalfDuplexAlarm",
    fields: ["hwBaseTrapSeverity", "hwBaseTrapProbableCause", "hwBaseTrapEventType", "entPhysicalName", "hwBaseTrapRelativeResource"],
    fieldOids: ["hwBaseTrapSeverity": "1.3.6.1.4.1.2011.5.25.129.1.1", "hwBaseTrapProbableCause": "1.3.6.1.4.1.2011.5.25.129.1.2", "hwBaseTrapEventType": "1.3.6.1.4.1.2011.5.25.129.1.3", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwBaseTrapRelativeResource": "1.3.6.1.4.1.2011.5.25.129.1.4"]
]

// --- hwPortPhysicalEthFullDuplexClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.5.12
// Fields: hwBaseTrapSeverity, hwBaseTrapProbableCause, hwBaseTrapEventType, entPhysicalName, hwBaseTrapRelativeResource
// Description: One of the Ethernet port works on the full-duplex mode.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.5.12"] = [
    name: "hwPortPhysicalEthFullDuplexClear",
    fields: ["hwBaseTrapSeverity", "hwBaseTrapProbableCause", "hwBaseTrapEventType", "entPhysicalName", "hwBaseTrapRelativeResource"],
    fieldOids: ["hwBaseTrapSeverity": "1.3.6.1.4.1.2011.5.25.129.1.1", "hwBaseTrapProbableCause": "1.3.6.1.4.1.2011.5.25.129.1.2", "hwBaseTrapEventType": "1.3.6.1.4.1.2011.5.25.129.1.3", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwBaseTrapRelativeResource": "1.3.6.1.4.1.2011.5.25.129.1.4"]
]

// --- hwPortPhysicalPortTypeChange (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.5.13
// Fields: hwBaseTrapSeverity, hwBaseTrapProbableCause, hwBaseTrapEventType, entPhysicalName, hwBaseTrapLastPortType, hwBaseTrapCurPortType
// Description: One of the port type changed.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.5.13"] = [
    name: "hwPortPhysicalPortTypeChange",
    fields: ["hwBaseTrapSeverity", "hwBaseTrapProbableCause", "hwBaseTrapEventType", "entPhysicalName", "hwBaseTrapLastPortType", "hwBaseTrapCurPortType"],
    fieldOids: ["hwBaseTrapSeverity": "1.3.6.1.4.1.2011.5.25.129.1.1", "hwBaseTrapProbableCause": "1.3.6.1.4.1.2011.5.25.129.1.2", "hwBaseTrapEventType": "1.3.6.1.4.1.2011.5.25.129.1.3", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwBaseTrapLastPortType": "1.3.6.1.4.1.2011.5.25.129.1.16", "hwBaseTrapCurPortType": "1.3.6.1.4.1.2011.5.25.129.1.15"]
]

// --- hwPortPhysicalAutoNegotiateFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.5.14
// Fields: hwBaseTrapSeverity, hwBaseTrapProbableCause, hwBaseTrapEventType, entPhysicalName, hwBaseTrapRelativeResource
// Description: One of the port auto-negotiation failed.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.5.14"] = [
    name: "hwPortPhysicalAutoNegotiateFail",
    fields: ["hwBaseTrapSeverity", "hwBaseTrapProbableCause", "hwBaseTrapEventType", "entPhysicalName", "hwBaseTrapRelativeResource"],
    fieldOids: ["hwBaseTrapSeverity": "1.3.6.1.4.1.2011.5.25.129.1.1", "hwBaseTrapProbableCause": "1.3.6.1.4.1.2011.5.25.129.1.2", "hwBaseTrapEventType": "1.3.6.1.4.1.2011.5.25.129.1.3", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwBaseTrapRelativeResource": "1.3.6.1.4.1.2011.5.25.129.1.4"]
]

// --- hwPortPhysicalAutoNegotiateResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.5.15
// Fields: hwBaseTrapSeverity, hwBaseTrapProbableCause, hwBaseTrapEventType, entPhysicalName, hwBaseTrapRelativeResource
// Description: One of the port auto-negotiation resumed.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.5.15"] = [
    name: "hwPortPhysicalAutoNegotiateResume",
    fields: ["hwBaseTrapSeverity", "hwBaseTrapProbableCause", "hwBaseTrapEventType", "entPhysicalName", "hwBaseTrapRelativeResource"],
    fieldOids: ["hwBaseTrapSeverity": "1.3.6.1.4.1.2011.5.25.129.1.1", "hwBaseTrapProbableCause": "1.3.6.1.4.1.2011.5.25.129.1.2", "hwBaseTrapEventType": "1.3.6.1.4.1.2011.5.25.129.1.3", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwBaseTrapRelativeResource": "1.3.6.1.4.1.2011.5.25.129.1.4"]
]

// --- hwStorageUtilizationRisingAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.6.1
// Fields: hwBaseTrapSeverity, hwBaseTrapProbableCause, hwBaseTrapEventType, entPhysicalName, hwBaseTrapRelativeResource, hwBaseUsageValue, hwBaseUsageUnit, hwBaseUsageThreshold
// Description: Storage device utilization rise over threshold.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.6.1"] = [
    name: "hwStorageUtilizationRisingAlarm",
    fields: ["hwBaseTrapSeverity", "hwBaseTrapProbableCause", "hwBaseTrapEventType", "entPhysicalName", "hwBaseTrapRelativeResource", "hwBaseUsageValue", "hwBaseUsageUnit", "hwBaseUsageThreshold"],
    fieldOids: ["hwBaseTrapSeverity": "1.3.6.1.4.1.2011.5.25.129.1.1", "hwBaseTrapProbableCause": "1.3.6.1.4.1.2011.5.25.129.1.2", "hwBaseTrapEventType": "1.3.6.1.4.1.2011.5.25.129.1.3", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwBaseTrapRelativeResource": "1.3.6.1.4.1.2011.5.25.129.1.4", "hwBaseUsageValue": "1.3.6.1.4.1.2011.5.25.129.1.7.1.3", "hwBaseUsageUnit": "1.3.6.1.4.1.2011.5.25.129.1.7.1.4", "hwBaseUsageThreshold": "1.3.6.1.4.1.2011.5.25.129.1.7.1.5"]
]

// --- hwStorageUtilizationResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.6.2
// Fields: hwBaseTrapSeverity, hwBaseTrapProbableCause, hwBaseTrapEventType, entPhysicalName, hwBaseTrapRelativeResource, hwBaseUsageValue, hwBaseUsageUnit, hwBaseUsageThreshold
// Description: Storage utilization resume to normal level.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.6.2"] = [
    name: "hwStorageUtilizationResume",
    fields: ["hwBaseTrapSeverity", "hwBaseTrapProbableCause", "hwBaseTrapEventType", "entPhysicalName", "hwBaseTrapRelativeResource", "hwBaseUsageValue", "hwBaseUsageUnit", "hwBaseUsageThreshold"],
    fieldOids: ["hwBaseTrapSeverity": "1.3.6.1.4.1.2011.5.25.129.1.1", "hwBaseTrapProbableCause": "1.3.6.1.4.1.2011.5.25.129.1.2", "hwBaseTrapEventType": "1.3.6.1.4.1.2011.5.25.129.1.3", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwBaseTrapRelativeResource": "1.3.6.1.4.1.2011.5.25.129.1.4", "hwBaseUsageValue": "1.3.6.1.4.1.2011.5.25.129.1.7.1.3", "hwBaseUsageUnit": "1.3.6.1.4.1.2011.5.25.129.1.7.1.4", "hwBaseUsageThreshold": "1.3.6.1.4.1.2011.5.25.129.1.7.1.5"]
]

// --- hwVsDiskFullAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.6.3
// Fields: hwStorageSpace, hwStorageSpaceFree, hwStorageName
// Description: The disk usage exceeded the overload threadhold.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.6.3"] = [
    name: "hwVsDiskFullAlarm",
    fields: ["hwStorageSpace", "hwStorageSpaceFree", "hwStorageName"],
    fieldOids: ["hwStorageSpace": "1.3.6.1.4.1.2011.6.9.1.4.2.1.3", "hwStorageSpaceFree": "1.3.6.1.4.1.2011.6.9.1.4.2.1.4", "hwStorageName": "1.3.6.1.4.1.2011.6.9.1.4.2.1.5"]
]

// --- hwVsDiskResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.6.4
// Fields: hwStorageSpace, hwStorageSpaceFree, hwStorageName
// Description: The disk usage fall below the clear threashold.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.6.4"] = [
    name: "hwVsDiskResume",
    fields: ["hwStorageSpace", "hwStorageSpaceFree", "hwStorageName"],
    fieldOids: ["hwStorageSpace": "1.3.6.1.4.1.2011.6.9.1.4.2.1.3", "hwStorageSpaceFree": "1.3.6.1.4.1.2011.6.9.1.4.2.1.4", "hwStorageName": "1.3.6.1.4.1.2011.6.9.1.4.2.1.5"]
]

// --- hwSystemMemoryOverload (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.6.5
// Fields: hwBaseTrapSeverity, hwBaseTrapEventType, entPhysicalName, hwBaseMemUsageValue, hwBaseMemThresUnit, hwBaseMemUsageThres
// Description: Memory usage rise over the reliability overload threshold.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.6.5"] = [
    name: "hwSystemMemoryOverload",
    fields: ["hwBaseTrapSeverity", "hwBaseTrapEventType", "entPhysicalName", "hwBaseMemUsageValue", "hwBaseMemThresUnit", "hwBaseMemUsageThres"],
    fieldOids: ["hwBaseTrapSeverity": "1.3.6.1.4.1.2011.5.25.129.1.1", "hwBaseTrapEventType": "1.3.6.1.4.1.2011.5.25.129.1.3", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwBaseMemUsageValue": "1.3.6.1.4.1.2011.5.25.129.1.101.1.1", "hwBaseMemThresUnit": "1.3.6.1.4.1.2011.5.25.129.1.101.1.2", "hwBaseMemUsageThres": "1.3.6.1.4.1.2011.5.25.129.1.101.1.3"]
]

// --- hwSystemMemoryOverloadResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.6.6
// Fields: hwBaseTrapSeverity, hwBaseTrapEventType, entPhysicalName, hwBaseMemUsageValue, hwBaseMemThresUnit, hwBaseMemUsageThres
// Description: Memory usage resume to normal level.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.6.6"] = [
    name: "hwSystemMemoryOverloadResume",
    fields: ["hwBaseTrapSeverity", "hwBaseTrapEventType", "entPhysicalName", "hwBaseMemUsageValue", "hwBaseMemThresUnit", "hwBaseMemUsageThres"],
    fieldOids: ["hwBaseTrapSeverity": "1.3.6.1.4.1.2011.5.25.129.1.1", "hwBaseTrapEventType": "1.3.6.1.4.1.2011.5.25.129.1.3", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwBaseMemUsageValue": "1.3.6.1.4.1.2011.5.25.129.1.101.1.1", "hwBaseMemThresUnit": "1.3.6.1.4.1.2011.5.25.129.1.101.1.2", "hwBaseMemUsageThres": "1.3.6.1.4.1.2011.5.25.129.1.101.1.3"]
]

// --- hwFIBOverloadSuspend (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.9.1
// Fields: hwBaseTrapSeverity, hwBaseTrapProbableCause, hwBaseTrapEventType, hwFIBOverloadModule, entPhysicalName
// Description: The board is suspended for IPv4/IPv6 FIB capability overload.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.9.1"] = [
    name: "hwFIBOverloadSuspend",
    fields: ["hwBaseTrapSeverity", "hwBaseTrapProbableCause", "hwBaseTrapEventType", "hwFIBOverloadModule", "entPhysicalName"],
    fieldOids: ["hwBaseTrapSeverity": "1.3.6.1.4.1.2011.5.25.129.1.1", "hwBaseTrapProbableCause": "1.3.6.1.4.1.2011.5.25.129.1.2", "hwBaseTrapEventType": "1.3.6.1.4.1.2011.5.25.129.1.3", "hwFIBOverloadModule": "1.3.6.1.4.1.2011.5.25.129.1.8", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwFIBOverloadSusResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.9.2
// Fields: hwBaseTrapSeverity, hwBaseTrapProbableCause, hwBaseTrapEventType, hwFIBOverloadModule, entPhysicalName
// Description: The board is recovered for FIB capability overload suspend.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.9.2"] = [
    name: "hwFIBOverloadSusResume",
    fields: ["hwBaseTrapSeverity", "hwBaseTrapProbableCause", "hwBaseTrapEventType", "hwFIBOverloadModule", "entPhysicalName"],
    fieldOids: ["hwBaseTrapSeverity": "1.3.6.1.4.1.2011.5.25.129.1.1", "hwBaseTrapProbableCause": "1.3.6.1.4.1.2011.5.25.129.1.2", "hwBaseTrapEventType": "1.3.6.1.4.1.2011.5.25.129.1.3", "hwFIBOverloadModule": "1.3.6.1.4.1.2011.5.25.129.1.8", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwFIBOverloadForward (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.9.3
// Fields: hwBaseTrapSeverity, hwBaseTrapProbableCause, hwBaseTrapEventType, hwFIBOverloadModule, entPhysicalName
// Description: The board is forwarding for IPv4/IPv6 FIB capability overload.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.9.3"] = [
    name: "hwFIBOverloadForward",
    fields: ["hwBaseTrapSeverity", "hwBaseTrapProbableCause", "hwBaseTrapEventType", "hwFIBOverloadModule", "entPhysicalName"],
    fieldOids: ["hwBaseTrapSeverity": "1.3.6.1.4.1.2011.5.25.129.1.1", "hwBaseTrapProbableCause": "1.3.6.1.4.1.2011.5.25.129.1.2", "hwBaseTrapEventType": "1.3.6.1.4.1.2011.5.25.129.1.3", "hwFIBOverloadModule": "1.3.6.1.4.1.2011.5.25.129.1.8", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwFIBOverloadFwResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.9.4
// Fields: hwBaseTrapSeverity, hwBaseTrapProbableCause, hwBaseTrapEventType, hwFIBOverloadModule, entPhysicalName
// Description: The board is recovered for IPv4/IPv6 FIB capability overload forward.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.9.4"] = [
    name: "hwFIBOverloadFwResume",
    fields: ["hwBaseTrapSeverity", "hwBaseTrapProbableCause", "hwBaseTrapEventType", "hwFIBOverloadModule", "entPhysicalName"],
    fieldOids: ["hwBaseTrapSeverity": "1.3.6.1.4.1.2011.5.25.129.1.1", "hwBaseTrapProbableCause": "1.3.6.1.4.1.2011.5.25.129.1.2", "hwBaseTrapEventType": "1.3.6.1.4.1.2011.5.25.129.1.3", "hwFIBOverloadModule": "1.3.6.1.4.1.2011.5.25.129.1.8", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwFESInconsistencyForMemoryLack (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.9.5
// Fields: hwBaseTrapSeverity, hwBaseTrapEventType, entPhysicalIndex, entPhysicalName
// Description: Because the memory usage of the interface board exceeds the upper threshold, the FES cannot add new entries. As a result, the entries of the interface board is inconsistent with those of the main boar...
trapMap["1.3.6.1.4.1.2011.5.25.129.2.9.5"] = [
    name: "hwFESInconsistencyForMemoryLack",
    fields: ["hwBaseTrapSeverity", "hwBaseTrapEventType", "entPhysicalIndex", "entPhysicalName"],
    fieldOids: ["hwBaseTrapSeverity": "1.3.6.1.4.1.2011.5.25.129.1.1", "hwBaseTrapEventType": "1.3.6.1.4.1.2011.5.25.129.1.3", "entPhysicalIndex": "1.3.6.1.2.1.47.1.1.1.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwFESInconsistencyForMemoryLackResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.9.6
// Fields: hwBaseTrapSeverity, hwBaseTrapEventType, entPhysicalIndex, entPhysicalName
// Description: The memory usage of the interface board reduces to the lower threshold, and the FES can add entries. The entries of the interface board is consistent with those of the main board.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.9.6"] = [
    name: "hwFESInconsistencyForMemoryLackResume",
    fields: ["hwBaseTrapSeverity", "hwBaseTrapEventType", "entPhysicalIndex", "entPhysicalName"],
    fieldOids: ["hwBaseTrapSeverity": "1.3.6.1.4.1.2011.5.25.129.1.1", "hwBaseTrapEventType": "1.3.6.1.4.1.2011.5.25.129.1.3", "entPhysicalIndex": "1.3.6.1.2.1.47.1.1.1.1.1", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwPppLoopbackDetect (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.10.1
// Fields: hwBaseTrapSeverity, hwBaseTrapProbableCause, hwBaseTrapEventType, ifIndex, ifName
// Description: The interface Loopback is detected.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.10.1"] = [
    name: "hwPppLoopbackDetect",
    fields: ["hwBaseTrapSeverity", "hwBaseTrapProbableCause", "hwBaseTrapEventType", "ifIndex", "ifName"],
    fieldOids: ["hwBaseTrapSeverity": "1.3.6.1.4.1.2011.5.25.129.1.1", "hwBaseTrapProbableCause": "1.3.6.1.4.1.2011.5.25.129.1.2", "hwBaseTrapEventType": "1.3.6.1.4.1.2011.5.25.129.1.3", "ifIndex": "1.3.6.1.2.1.2.2.1.1", "ifName": "1.3.6.1.2.1.31.1.1.1.1"]
]

// --- hwPppLoopbackDetResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.10.2
// Fields: hwBaseTrapSeverity, hwBaseTrapProbableCause, hwBaseTrapEventType, ifIndex, ifName
// Description: The interface is recovered from Loopback.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.10.2"] = [
    name: "hwPppLoopbackDetResume",
    fields: ["hwBaseTrapSeverity", "hwBaseTrapProbableCause", "hwBaseTrapEventType", "ifIndex", "ifName"],
    fieldOids: ["hwBaseTrapSeverity": "1.3.6.1.4.1.2011.5.25.129.1.1", "hwBaseTrapProbableCause": "1.3.6.1.4.1.2011.5.25.129.1.2", "hwBaseTrapEventType": "1.3.6.1.4.1.2011.5.25.129.1.3", "ifIndex": "1.3.6.1.2.1.2.2.1.1", "ifName": "1.3.6.1.2.1.31.1.1.1.1"]
]

// --- hwFlowCongestion (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.11.1
// Fields: hwBaseTrapSeverity, hwBaseTrapProbableCause, hwBaseTrapEventType, entPhysicalClass, entPhysicalName, hwBaseFlowDirectionType
// Description: The object is in congested state and some of the frames are dropped.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.11.1"] = [
    name: "hwFlowCongestion",
    fields: ["hwBaseTrapSeverity", "hwBaseTrapProbableCause", "hwBaseTrapEventType", "entPhysicalClass", "entPhysicalName", "hwBaseFlowDirectionType"],
    fieldOids: ["hwBaseTrapSeverity": "1.3.6.1.4.1.2011.5.25.129.1.1", "hwBaseTrapProbableCause": "1.3.6.1.4.1.2011.5.25.129.1.2", "hwBaseTrapEventType": "1.3.6.1.4.1.2011.5.25.129.1.3", "entPhysicalClass": "1.3.6.1.2.1.47.1.1.1.1.5", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwBaseFlowDirectionType": "1.3.6.1.4.1.2011.5.25.129.1.9"]
]

// --- hwFlowCongestionResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.11.2
// Fields: hwBaseTrapSeverity, hwBaseTrapProbableCause, hwBaseTrapEventType, entPhysicalClass, entPhysicalName, hwBaseFlowDirectionType
// Description: Alarms of the congested object are cleared.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.11.2"] = [
    name: "hwFlowCongestionResume",
    fields: ["hwBaseTrapSeverity", "hwBaseTrapProbableCause", "hwBaseTrapEventType", "entPhysicalClass", "entPhysicalName", "hwBaseFlowDirectionType"],
    fieldOids: ["hwBaseTrapSeverity": "1.3.6.1.4.1.2011.5.25.129.1.1", "hwBaseTrapProbableCause": "1.3.6.1.4.1.2011.5.25.129.1.2", "hwBaseTrapEventType": "1.3.6.1.4.1.2011.5.25.129.1.3", "entPhysicalClass": "1.3.6.1.2.1.47.1.1.1.1.5", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwBaseFlowDirectionType": "1.3.6.1.4.1.2011.5.25.129.1.9"]
]

// --- hwDeviceAbnormalRisingAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.12.1
// Fields: hwBaseTrapSeverity, hwBaseTrapProbableCause, hwBaseTrapEventType, entPhysicalName, hwBaseTrapRelativeResource
// Description: Device abnormal or pulled out.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.12.1"] = [
    name: "hwDeviceAbnormalRisingAlarm",
    fields: ["hwBaseTrapSeverity", "hwBaseTrapProbableCause", "hwBaseTrapEventType", "entPhysicalName", "hwBaseTrapRelativeResource"],
    fieldOids: ["hwBaseTrapSeverity": "1.3.6.1.4.1.2011.5.25.129.1.1", "hwBaseTrapProbableCause": "1.3.6.1.4.1.2011.5.25.129.1.2", "hwBaseTrapEventType": "1.3.6.1.4.1.2011.5.25.129.1.3", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwBaseTrapRelativeResource": "1.3.6.1.4.1.2011.5.25.129.1.4"]
]

// --- hwResExhaustBfdAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.13.1
// Fields: hwBaseTrapSeverity, hwBaseTrapProbableCause, hwBaseTrapEventType
// Description: Failed to allocate resources for BFD because hardware resources were exhausted.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.13.1"] = [
    name: "hwResExhaustBfdAlarm",
    fields: ["hwBaseTrapSeverity", "hwBaseTrapProbableCause", "hwBaseTrapEventType"],
    fieldOids: ["hwBaseTrapSeverity": "1.3.6.1.4.1.2011.5.25.129.1.1", "hwBaseTrapProbableCause": "1.3.6.1.4.1.2011.5.25.129.1.2", "hwBaseTrapEventType": "1.3.6.1.4.1.2011.5.25.129.1.3"]
]

// --- hwResExhaustBfdResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.13.2
// Fields: hwBaseTrapSeverity, hwBaseTrapProbableCause, hwBaseTrapEventType
// Description: BFD recovered from alarms of hardware resources exhausting.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.13.2"] = [
    name: "hwResExhaustBfdResume",
    fields: ["hwBaseTrapSeverity", "hwBaseTrapProbableCause", "hwBaseTrapEventType"],
    fieldOids: ["hwBaseTrapSeverity": "1.3.6.1.4.1.2011.5.25.129.1.1", "hwBaseTrapProbableCause": "1.3.6.1.4.1.2011.5.25.129.1.2", "hwBaseTrapEventType": "1.3.6.1.4.1.2011.5.25.129.1.3"]
]

// --- hwResExhaustOamAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.14.1
// Fields: hwBaseTrapSeverity, hwBaseTrapProbableCause, hwBaseTrapEventType
// Description: Failed to allocate resources for OAM because hardware resources were exhausted. MPLS OAM is short for Operation Administration and Maintenance by MPLS. It is used for connectivity verification of MPLS...
trapMap["1.3.6.1.4.1.2011.5.25.129.2.14.1"] = [
    name: "hwResExhaustOamAlarm",
    fields: ["hwBaseTrapSeverity", "hwBaseTrapProbableCause", "hwBaseTrapEventType"],
    fieldOids: ["hwBaseTrapSeverity": "1.3.6.1.4.1.2011.5.25.129.1.1", "hwBaseTrapProbableCause": "1.3.6.1.4.1.2011.5.25.129.1.2", "hwBaseTrapEventType": "1.3.6.1.4.1.2011.5.25.129.1.3"]
]

// --- hwResExhaustOamResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.14.2
// Fields: hwBaseTrapSeverity, hwBaseTrapProbableCause, hwBaseTrapEventType
// Description: OAM recovered from alarms of hardware resources exhausting. MPLS OAM is short for Operation Administration and Maintenance by MPLS. It is used for connectivity verification of MPLS LSP.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.14.2"] = [
    name: "hwResExhaustOamResume",
    fields: ["hwBaseTrapSeverity", "hwBaseTrapProbableCause", "hwBaseTrapEventType"],
    fieldOids: ["hwBaseTrapSeverity": "1.3.6.1.4.1.2011.5.25.129.1.1", "hwBaseTrapProbableCause": "1.3.6.1.4.1.2011.5.25.129.1.2", "hwBaseTrapEventType": "1.3.6.1.4.1.2011.5.25.129.1.3"]
]

// --- hwHdlcLoopbackDetect (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.15.1
// Fields: ifDescr
// Description: The interface Loopback is detected.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.15.1"] = [
    name: "hwHdlcLoopbackDetect",
    fields: ["ifDescr"],
    fieldOids: ["ifDescr": "1.3.6.1.2.1.2.2.1.2"]
]

// --- hwHdlcLoopbackDetResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.15.2
// Fields: ifDescr
// Description: The interface is recovered from Loopback.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.15.2"] = [
    name: "hwHdlcLoopbackDetResume",
    fields: ["ifDescr"],
    fieldOids: ["ifDescr": "1.3.6.1.2.1.2.2.1.2"]
]

// --- hwHdlcIICPacketCrcErr (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.15.3
// Fields: hwSecStatTrapSlot, hwSecStatTrapCPU
// Description: The packet(s) crc error
trapMap["1.3.6.1.4.1.2011.5.25.129.2.15.3"] = [
    name: "hwHdlcIICPacketCrcErr",
    fields: ["hwSecStatTrapSlot", "hwSecStatTrapCPU"],
    fieldOids: ["hwSecStatTrapSlot": "1.3.6.1.4.1.2011.6.122.15.3.1.2", "hwSecStatTrapCPU": "1.3.6.1.4.1.2011.6.122.15.3.1.3"]
]

// --- hwHdlcIICPacketCrcErrResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.15.4
// Fields: hwSecStatTrapSlot, hwSecStatTrapCPU
// Description: The packet(s) crc error resume
trapMap["1.3.6.1.4.1.2011.5.25.129.2.15.4"] = [
    name: "hwHdlcIICPacketCrcErrResume",
    fields: ["hwSecStatTrapSlot", "hwSecStatTrapCPU"],
    fieldOids: ["hwSecStatTrapSlot": "1.3.6.1.4.1.2011.6.122.15.3.1.2", "hwSecStatTrapCPU": "1.3.6.1.4.1.2011.6.122.15.3.1.3"]
]

// --- hwAutoFtpFailAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.16.1
// Fields: hwBaseTrapReasonDescr, hwBaseTrapSeverity
// Description: This object indicates the software failure in the automatic upgrade system.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.16.1"] = [
    name: "hwAutoFtpFailAlarm",
    fields: ["hwBaseTrapReasonDescr", "hwBaseTrapSeverity"],
    fieldOids: ["hwBaseTrapReasonDescr": "1.3.6.1.4.1.2011.5.25.129.1.5", "hwBaseTrapSeverity": "1.3.6.1.4.1.2011.5.25.129.1.1"]
]

// --- hwOpticalPowerAbnormal (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.17.1
// Fields: hwBaseTrapSeverity, hwBaseTrapProbableCause, hwBaseTrapEventType, entPhysicalContainedIn, entPhysicalName, hwBaseTrapRelativeResource, hwBaseTrapReasonDescr
// Description: Optical rxpower or txpower is exceed threshold value.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.17.1"] = [
    name: "hwOpticalPowerAbnormal",
    fields: ["hwBaseTrapSeverity", "hwBaseTrapProbableCause", "hwBaseTrapEventType", "entPhysicalContainedIn", "entPhysicalName", "hwBaseTrapRelativeResource", "hwBaseTrapReasonDescr"],
    fieldOids: ["hwBaseTrapSeverity": "1.3.6.1.4.1.2011.5.25.129.1.1", "hwBaseTrapProbableCause": "1.3.6.1.4.1.2011.5.25.129.1.2", "hwBaseTrapEventType": "1.3.6.1.4.1.2011.5.25.129.1.3", "entPhysicalContainedIn": "1.3.6.1.2.1.47.1.1.1.1.4", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwBaseTrapRelativeResource": "1.3.6.1.4.1.2011.5.25.129.1.4", "hwBaseTrapReasonDescr": "1.3.6.1.4.1.2011.5.25.129.1.5"]
]

// --- hwOpticalPowerResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.17.2
// Fields: hwBaseTrapSeverity, hwBaseTrapProbableCause, hwBaseTrapEventType, entPhysicalContainedIn, entPhysicalName, hwBaseTrapRelativeResource, hwBaseTrapReasonDescr
// Description: Optical power resume.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.17.2"] = [
    name: "hwOpticalPowerResume",
    fields: ["hwBaseTrapSeverity", "hwBaseTrapProbableCause", "hwBaseTrapEventType", "entPhysicalContainedIn", "entPhysicalName", "hwBaseTrapRelativeResource", "hwBaseTrapReasonDescr"],
    fieldOids: ["hwBaseTrapSeverity": "1.3.6.1.4.1.2011.5.25.129.1.1", "hwBaseTrapProbableCause": "1.3.6.1.4.1.2011.5.25.129.1.2", "hwBaseTrapEventType": "1.3.6.1.4.1.2011.5.25.129.1.3", "entPhysicalContainedIn": "1.3.6.1.2.1.47.1.1.1.1.4", "entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwBaseTrapRelativeResource": "1.3.6.1.4.1.2011.5.25.129.1.4", "hwBaseTrapReasonDescr": "1.3.6.1.4.1.2011.5.25.129.1.5"]
]

// --- hwNpsPatchInstallationFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.18.1
// Fields: hwNpsPackageName, hwNpsPackageVersion, hwNpsFailReason
// Description: Patch Installation Failed.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.18.1"] = [
    name: "hwNpsPatchInstallationFail",
    fields: ["hwNpsPackageName", "hwNpsPackageVersion", "hwNpsFailReason"],
    fieldOids: ["hwNpsPackageName": "1.3.6.1.4.1.2011.5.25.129.1.19", "hwNpsPackageVersion": "1.3.6.1.4.1.2011.5.25.129.1.21", "hwNpsFailReason": "1.3.6.1.4.1.2011.5.25.129.1.22"]
]

// --- hwNpsPatchInstallationResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.18.2
// Fields: hwNpsPackageName, hwNpsPackageVersion, hwNpsFailReason
// Description: Patch Installation Success.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.18.2"] = [
    name: "hwNpsPatchInstallationResume",
    fields: ["hwNpsPackageName", "hwNpsPackageVersion", "hwNpsFailReason"],
    fieldOids: ["hwNpsPackageName": "1.3.6.1.4.1.2011.5.25.129.1.19", "hwNpsPackageVersion": "1.3.6.1.4.1.2011.5.25.129.1.21", "hwNpsFailReason": "1.3.6.1.4.1.2011.5.25.129.1.22"]
]

// --- hwNpsPatchPacketError (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.18.3
// Fields: hwNpsPackageName
// Description: Patch Package Error.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.18.3"] = [
    name: "hwNpsPatchPacketError",
    fields: ["hwNpsPackageName"],
    fieldOids: ["hwNpsPackageName": "1.3.6.1.4.1.2011.5.25.129.1.19"]
]

// --- hwNpsPatchPacketResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.18.4
// Fields: hwNpsPackageName
// Description: Patch Package success.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.18.4"] = [
    name: "hwNpsPatchPacketResume",
    fields: ["hwNpsPackageName"],
    fieldOids: ["hwNpsPackageName": "1.3.6.1.4.1.2011.5.25.129.1.19"]
]

// --- hwNpsSysConfigError (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.18.5
// Fields: hwNpsEntityTrapFaultID
// Description: System Configuration Error.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.18.5"] = [
    name: "hwNpsSysConfigError",
    fields: ["hwNpsEntityTrapFaultID"],
    fieldOids: ["hwNpsEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.129.1.27"]
]

// --- hwNpsSysConfigResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.18.6
// Fields: hwNpsEntityTrapFaultID
// Description: System Configuration Error.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.18.6"] = [
    name: "hwNpsSysConfigResume",
    fields: ["hwNpsEntityTrapFaultID"],
    fieldOids: ["hwNpsEntityTrapFaultID": "1.3.6.1.4.1.2011.5.25.129.1.27"]
]

// --- hwNpsInnerSslCertificateInvalidEarlyWarning (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.18.7
// Fields: hwNpsCaClass, hwNpsRemainDays
// Description: Inner SSL Certificate Invalid Early Warning.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.18.7"] = [
    name: "hwNpsInnerSslCertificateInvalidEarlyWarning",
    fields: ["hwNpsCaClass", "hwNpsRemainDays"],
    fieldOids: ["hwNpsCaClass": "1.3.6.1.4.1.2011.5.25.129.1.28", "hwNpsRemainDays": "1.3.6.1.4.1.2011.5.25.129.1.29"]
]

// --- hwNpsInnerSslCertificateInvalidEarlyResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.18.8
// Fields: hwNpsCaClass
// Description: Inner SSL Certificate Invalid Early resume.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.18.8"] = [
    name: "hwNpsInnerSslCertificateInvalidEarlyResume",
    fields: ["hwNpsCaClass"],
    fieldOids: ["hwNpsCaClass": "1.3.6.1.4.1.2011.5.25.129.1.28"]
]

// --- hwNpsInnerSslCertificateInvalidAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.18.9
// Fields: hwNpsCaClass, hwNpsAlarmReason
// Description: Inner SSL Certificate Invalid Alarm.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.18.9"] = [
    name: "hwNpsInnerSslCertificateInvalidAlarm",
    fields: ["hwNpsCaClass", "hwNpsAlarmReason"],
    fieldOids: ["hwNpsCaClass": "1.3.6.1.4.1.2011.5.25.129.1.28", "hwNpsAlarmReason": "1.3.6.1.4.1.2011.5.25.129.1.30"]
]

// --- hwNpsInnerSslCertificateInvalidResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.18.10
// Fields: hwNpsCaClass
// Description: Inner SSL Certificate Invalid Alarm resume.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.18.10"] = [
    name: "hwNpsInnerSslCertificateInvalidResume",
    fields: ["hwNpsCaClass"],
    fieldOids: ["hwNpsCaClass": "1.3.6.1.4.1.2011.5.25.129.1.28"]
]

// --- hwNpsDiskPartitionUsageExceedingThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.18.11
// Fields: hwNpsVmName, hwNpsPartitionName, hwNpsPartitionUsage, hwNpsOverloadThreshold
// Description: Disk Partition Usage Exceeding Threshold.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.18.11"] = [
    name: "hwNpsDiskPartitionUsageExceedingThreshold",
    fields: ["hwNpsVmName", "hwNpsPartitionName", "hwNpsPartitionUsage", "hwNpsOverloadThreshold"],
    fieldOids: ["hwNpsVmName": "1.3.6.1.4.1.2011.5.25.129.1.23", "hwNpsPartitionName": "1.3.6.1.4.1.2011.5.25.129.1.31", "hwNpsPartitionUsage": "1.3.6.1.4.1.2011.5.25.129.1.32", "hwNpsOverloadThreshold": "1.3.6.1.4.1.2011.5.25.129.1.33"]
]

// --- hwNpsDiskPartitionUsageExceedingThresholdResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.18.12
// Fields: hwNpsVmName, hwNpsPartitionName, hwNpsPartitionUsage, hwNpsOverloadThreshold
// Description: Disk Partition Usage Exceeding Threshold Resume.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.18.12"] = [
    name: "hwNpsDiskPartitionUsageExceedingThresholdResume",
    fields: ["hwNpsVmName", "hwNpsPartitionName", "hwNpsPartitionUsage", "hwNpsOverloadThreshold"],
    fieldOids: ["hwNpsVmName": "1.3.6.1.4.1.2011.5.25.129.1.23", "hwNpsPartitionName": "1.3.6.1.4.1.2011.5.25.129.1.31", "hwNpsPartitionUsage": "1.3.6.1.4.1.2011.5.25.129.1.32", "hwNpsOverloadThreshold": "1.3.6.1.4.1.2011.5.25.129.1.33"]
]

// --- hwNpsDiskPartitionUnavailable (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.18.13
// Fields: hwNpsVmName, hwNpsPartitionName
// Description: Disk Partition Unavailable.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.18.13"] = [
    name: "hwNpsDiskPartitionUnavailable",
    fields: ["hwNpsVmName", "hwNpsPartitionName"],
    fieldOids: ["hwNpsVmName": "1.3.6.1.4.1.2011.5.25.129.1.23", "hwNpsPartitionName": "1.3.6.1.4.1.2011.5.25.129.1.31"]
]

// --- hwNpsDiskPartitionUnavailableResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.18.14
// Fields: hwNpsVmName, hwNpsPartitionName
// Description: Disk Partition Unavailable resume.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.18.14"] = [
    name: "hwNpsDiskPartitionUnavailableResume",
    fields: ["hwNpsVmName", "hwNpsPartitionName"],
    fieldOids: ["hwNpsVmName": "1.3.6.1.4.1.2011.5.25.129.1.23", "hwNpsPartitionName": "1.3.6.1.4.1.2011.5.25.129.1.31"]
]

// --- hwNpsDiskPartitionSpaceInsufficient (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.18.15
// Fields: hwNpsVmName, hwNpsPartitionName, hwNpsAvailableSpace, hwNpsCapThreshold
// Description: Disk Partition Space Insufficient.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.18.15"] = [
    name: "hwNpsDiskPartitionSpaceInsufficient",
    fields: ["hwNpsVmName", "hwNpsPartitionName", "hwNpsAvailableSpace", "hwNpsCapThreshold"],
    fieldOids: ["hwNpsVmName": "1.3.6.1.4.1.2011.5.25.129.1.23", "hwNpsPartitionName": "1.3.6.1.4.1.2011.5.25.129.1.31", "hwNpsAvailableSpace": "1.3.6.1.4.1.2011.5.25.129.1.34", "hwNpsCapThreshold": "1.3.6.1.4.1.2011.5.25.129.1.35"]
]

// --- hwNpsDiskPartitionSpaceInsufficientResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.18.16
// Fields: hwNpsVmName, hwNpsPartitionName, hwNpsAvailableSpace, hwNpsCapThreshold
// Description: Disk Partition Space Insufficient resume.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.18.16"] = [
    name: "hwNpsDiskPartitionSpaceInsufficientResume",
    fields: ["hwNpsVmName", "hwNpsPartitionName", "hwNpsAvailableSpace", "hwNpsCapThreshold"],
    fieldOids: ["hwNpsVmName": "1.3.6.1.4.1.2011.5.25.129.1.23", "hwNpsPartitionName": "1.3.6.1.4.1.2011.5.25.129.1.31", "hwNpsAvailableSpace": "1.3.6.1.4.1.2011.5.25.129.1.34", "hwNpsCapThreshold": "1.3.6.1.4.1.2011.5.25.129.1.35"]
]

// --- hwNpsExecutableFilesIncomplete (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.18.17
// Fields: hwNpsVmName
// Description: Executable Files Incomplete.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.18.17"] = [
    name: "hwNpsExecutableFilesIncomplete",
    fields: ["hwNpsVmName"],
    fieldOids: ["hwNpsVmName": "1.3.6.1.4.1.2011.5.25.129.1.23"]
]

// --- hwNpsExecutableFilesIncompleteResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.18.18
// Fields: hwNpsVmName
// Description: Executable Files Incomplete.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.18.18"] = [
    name: "hwNpsExecutableFilesIncompleteResume",
    fields: ["hwNpsVmName"],
    fieldOids: ["hwNpsVmName": "1.3.6.1.4.1.2011.5.25.129.1.23"]
]

// --- hwNpsSoftwareIntegrityError (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.18.19
// Fields: hwNpsvnfcType, hwNpsAppType, hwNpsVersionType, hwNpsVersionId
// Description: Software Integrity Error.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.18.19"] = [
    name: "hwNpsSoftwareIntegrityError",
    fields: ["hwNpsvnfcType", "hwNpsAppType", "hwNpsVersionType", "hwNpsVersionId"],
    fieldOids: ["hwNpsvnfcType": "1.3.6.1.4.1.2011.5.25.129.1.36", "hwNpsAppType": "1.3.6.1.4.1.2011.5.25.129.1.37", "hwNpsVersionType": "1.3.6.1.4.1.2011.5.25.129.1.38", "hwNpsVersionId": "1.3.6.1.4.1.2011.5.25.129.1.39"]
]

// --- hwNpsSoftwareIntegrityResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.18.20
// Fields: hwNpsvnfcType, hwNpsAppType, hwNpsVersionType, hwNpsVersionId
// Description: Software Integrity Error.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.18.20"] = [
    name: "hwNpsSoftwareIntegrityResume",
    fields: ["hwNpsvnfcType", "hwNpsAppType", "hwNpsVersionType", "hwNpsVersionId"],
    fieldOids: ["hwNpsvnfcType": "1.3.6.1.4.1.2011.5.25.129.1.36", "hwNpsAppType": "1.3.6.1.4.1.2011.5.25.129.1.37", "hwNpsVersionType": "1.3.6.1.4.1.2011.5.25.129.1.38", "hwNpsVersionId": "1.3.6.1.4.1.2011.5.25.129.1.39"]
]

// --- hwNpsMasterAdnSlaveSyncFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.18.21
// Fields: hwNpsAlarmReason
// Description: Master and Slave OMU Synchronization Failure.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.18.21"] = [
    name: "hwNpsMasterAdnSlaveSyncFail",
    fields: ["hwNpsAlarmReason"],
    fieldOids: ["hwNpsAlarmReason": "1.3.6.1.4.1.2011.5.25.129.1.30"]
]

// --- hwNpsMasterAdnSlaveSyncResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.18.22
// Fields: hwNpsAlarmReason
// Description: Master and Slave OMU Synchronization resume.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.18.22"] = [
    name: "hwNpsMasterAdnSlaveSyncResume",
    fields: ["hwNpsAlarmReason"],
    fieldOids: ["hwNpsAlarmReason": "1.3.6.1.4.1.2011.5.25.129.1.30"]
]

// --- hwNpsVirtualMachineDiskInvalid (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.18.23
// Fields: hwNpsVmName
// Description: Virtual Machine Disk Invalid.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.18.23"] = [
    name: "hwNpsVirtualMachineDiskInvalid",
    fields: ["hwNpsVmName"],
    fieldOids: ["hwNpsVmName": "1.3.6.1.4.1.2011.5.25.129.1.23"]
]

// --- hwNpsVirtualMachineDiskResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.18.24
// Fields: hwNpsVmName
// Description: Virtual Machine Disk Resume.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.18.24"] = [
    name: "hwNpsVirtualMachineDiskResume",
    fields: ["hwNpsVmName"],
    fieldOids: ["hwNpsVmName": "1.3.6.1.4.1.2011.5.25.129.1.23"]
]

// --- hwNpsDatabaseRestoreFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.18.25
// Fields: hwNpsFailReason
// Description: Database Restoration Failure.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.18.25"] = [
    name: "hwNpsDatabaseRestoreFail",
    fields: ["hwNpsFailReason"],
    fieldOids: ["hwNpsFailReason": "1.3.6.1.4.1.2011.5.25.129.1.22"]
]

// --- hwNpsSSLCertificateExpired (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.18.26
// Fields: hwNpsCertFile, hwNpsCaClass, hwNpsVaildBeginTime, hwNpsVaildEndTime
// Description: SSL Certificate Expired.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.18.26"] = [
    name: "hwNpsSSLCertificateExpired",
    fields: ["hwNpsCertFile", "hwNpsCaClass", "hwNpsVaildBeginTime", "hwNpsVaildEndTime"],
    fieldOids: ["hwNpsCertFile": "1.3.6.1.4.1.2011.5.25.129.1.41", "hwNpsCaClass": "1.3.6.1.4.1.2011.5.25.129.1.28", "hwNpsVaildBeginTime": "1.3.6.1.4.1.2011.5.25.129.1.42", "hwNpsVaildEndTime": "1.3.6.1.4.1.2011.5.25.129.1.43"]
]

// --- hwNpsSSLCertificateExpiredEarlyWarning (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.18.27
// Fields: hwNpsCertFile, hwNpsCaClass, hwNpsVaildBeginTime, hwNpsVaildEndTime
// Description: SSL Certificate Expired Early Warning.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.18.27"] = [
    name: "hwNpsSSLCertificateExpiredEarlyWarning",
    fields: ["hwNpsCertFile", "hwNpsCaClass", "hwNpsVaildBeginTime", "hwNpsVaildEndTime"],
    fieldOids: ["hwNpsCertFile": "1.3.6.1.4.1.2011.5.25.129.1.41", "hwNpsCaClass": "1.3.6.1.4.1.2011.5.25.129.1.28", "hwNpsVaildBeginTime": "1.3.6.1.4.1.2011.5.25.129.1.42", "hwNpsVaildEndTime": "1.3.6.1.4.1.2011.5.25.129.1.43"]
]

// --- hwNpsVMResInconsistAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.18.28
// Fields: hwNpsVmName, hwNpsVMId, hwNpsPhysicalVMID, hwNpsAlarmReason
// Description: Virtual Machine Resource Inconsistent.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.18.28"] = [
    name: "hwNpsVMResInconsistAlarm",
    fields: ["hwNpsVmName", "hwNpsVMId", "hwNpsPhysicalVMID", "hwNpsAlarmReason"],
    fieldOids: ["hwNpsVmName": "1.3.6.1.4.1.2011.5.25.129.1.23", "hwNpsVMId": "1.3.6.1.4.1.2011.5.25.129.1.40", "hwNpsPhysicalVMID": "1.3.6.1.4.1.2011.5.25.129.1.44", "hwNpsAlarmReason": "1.3.6.1.4.1.2011.5.25.129.1.30"]
]

// --- hwNpsVMResInconsistResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.18.29
// Fields: hwNpsVmName, hwNpsVMId, hwNpsPhysicalVMID, hwNpsAlarmReason
// Description: Virtual Machine Resource Inconsistent.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.18.29"] = [
    name: "hwNpsVMResInconsistResume",
    fields: ["hwNpsVmName", "hwNpsVMId", "hwNpsPhysicalVMID", "hwNpsAlarmReason"],
    fieldOids: ["hwNpsVmName": "1.3.6.1.4.1.2011.5.25.129.1.23", "hwNpsVMId": "1.3.6.1.4.1.2011.5.25.129.1.40", "hwNpsPhysicalVMID": "1.3.6.1.4.1.2011.5.25.129.1.44", "hwNpsAlarmReason": "1.3.6.1.4.1.2011.5.25.129.1.30"]
]

// --- hwNpsVmFauldAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.18.30
// Fields: hwNpsVmName, hwNpsVMId, hwNpsPhysicalVMID, hwNpsAlarmReason
// Description: Virtual Machine Fault.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.18.30"] = [
    name: "hwNpsVmFauldAlarm",
    fields: ["hwNpsVmName", "hwNpsVMId", "hwNpsPhysicalVMID", "hwNpsAlarmReason"],
    fieldOids: ["hwNpsVmName": "1.3.6.1.4.1.2011.5.25.129.1.23", "hwNpsVMId": "1.3.6.1.4.1.2011.5.25.129.1.40", "hwNpsPhysicalVMID": "1.3.6.1.4.1.2011.5.25.129.1.44", "hwNpsAlarmReason": "1.3.6.1.4.1.2011.5.25.129.1.30"]
]

// --- hwNpsVmFauldResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.18.31
// Fields: hwNpsVmName, hwNpsVMId, hwNpsPhysicalVMID, hwNpsAlarmReason
// Description: Virtual Machine Resume.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.18.31"] = [
    name: "hwNpsVmFauldResume",
    fields: ["hwNpsVmName", "hwNpsVMId", "hwNpsPhysicalVMID", "hwNpsAlarmReason"],
    fieldOids: ["hwNpsVmName": "1.3.6.1.4.1.2011.5.25.129.1.23", "hwNpsVMId": "1.3.6.1.4.1.2011.5.25.129.1.40", "hwNpsPhysicalVMID": "1.3.6.1.4.1.2011.5.25.129.1.44", "hwNpsAlarmReason": "1.3.6.1.4.1.2011.5.25.129.1.30"]
]

// --- hwNpsVNFMConnectFault (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.18.32
// Fields: hwNpsVnfmIp, hwNpsVnfmPort, hwNpsAlarmReason
// Description: VNF And VNFM Connection Fault.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.18.32"] = [
    name: "hwNpsVNFMConnectFault",
    fields: ["hwNpsVnfmIp", "hwNpsVnfmPort", "hwNpsAlarmReason"],
    fieldOids: ["hwNpsVnfmIp": "1.3.6.1.4.1.2011.5.25.129.1.45", "hwNpsVnfmPort": "1.3.6.1.4.1.2011.5.25.129.1.46", "hwNpsAlarmReason": "1.3.6.1.4.1.2011.5.25.129.1.30"]
]

// --- hwNpsVNFMConnectResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.18.33
// Fields: hwNpsVnfmIp, hwNpsVnfmPort, hwNpsAlarmReason
// Description: VNF And VNFM Connection Resume.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.18.33"] = [
    name: "hwNpsVNFMConnectResume",
    fields: ["hwNpsVnfmIp", "hwNpsVnfmPort", "hwNpsAlarmReason"],
    fieldOids: ["hwNpsVnfmIp": "1.3.6.1.4.1.2011.5.25.129.1.45", "hwNpsVnfmPort": "1.3.6.1.4.1.2011.5.25.129.1.46", "hwNpsAlarmReason": "1.3.6.1.4.1.2011.5.25.129.1.30"]
]

// --- hwNpsFabricOamPlaneDown (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.18.34
// Fields: hwNpsLocalVM, hwNpsRemoteVM, hwNpsPlane
// Description: Fabric OAM Detected Fabric Plane Down.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.18.34"] = [
    name: "hwNpsFabricOamPlaneDown",
    fields: ["hwNpsLocalVM", "hwNpsRemoteVM", "hwNpsPlane"],
    fieldOids: ["hwNpsLocalVM": "1.3.6.1.4.1.2011.5.25.129.1.47", "hwNpsRemoteVM": "1.3.6.1.4.1.2011.5.25.129.1.48", "hwNpsPlane": "1.3.6.1.4.1.2011.5.25.129.1.49"]
]

// --- hwNpsFabricOamPlaneDownResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.18.35
// Fields: hwNpsLocalVM, hwNpsRemoteVM, hwNpsPlane
// Description: Fabric OAM Detected Fabric Plane Down.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.18.35"] = [
    name: "hwNpsFabricOamPlaneDownResume",
    fields: ["hwNpsLocalVM", "hwNpsRemoteVM", "hwNpsPlane"],
    fieldOids: ["hwNpsLocalVM": "1.3.6.1.4.1.2011.5.25.129.1.47", "hwNpsRemoteVM": "1.3.6.1.4.1.2011.5.25.129.1.48", "hwNpsPlane": "1.3.6.1.4.1.2011.5.25.129.1.49"]
]

// --- hwNpsFabricLinkSubhealthy (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.18.36
// Fields: hwNpsLocalVM, hwNpsRemoteVM, hwNpsPlane, hwNpsThreshold
// Description: Fabric Link Goes Subhealthy.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.18.36"] = [
    name: "hwNpsFabricLinkSubhealthy",
    fields: ["hwNpsLocalVM", "hwNpsRemoteVM", "hwNpsPlane", "hwNpsThreshold"],
    fieldOids: ["hwNpsLocalVM": "1.3.6.1.4.1.2011.5.25.129.1.47", "hwNpsRemoteVM": "1.3.6.1.4.1.2011.5.25.129.1.48", "hwNpsPlane": "1.3.6.1.4.1.2011.5.25.129.1.49", "hwNpsThreshold": "1.3.6.1.4.1.2011.5.25.129.1.50"]
]

// --- hwNpsFabricLinkSubhealthyResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.18.37
// Fields: hwNpsLocalVM, hwNpsRemoteVM, hwNpsPlane, hwNpsThreshold
// Description: Fabric Link Goes Subhealthy.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.18.37"] = [
    name: "hwNpsFabricLinkSubhealthyResume",
    fields: ["hwNpsLocalVM", "hwNpsRemoteVM", "hwNpsPlane", "hwNpsThreshold"],
    fieldOids: ["hwNpsLocalVM": "1.3.6.1.4.1.2011.5.25.129.1.47", "hwNpsRemoteVM": "1.3.6.1.4.1.2011.5.25.129.1.48", "hwNpsPlane": "1.3.6.1.4.1.2011.5.25.129.1.49", "hwNpsThreshold": "1.3.6.1.4.1.2011.5.25.129.1.50"]
]

// --- hwNpsDriverTypeMismatch (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.18.38
// Fields: hwNpsVmName, hwNpsVendorID, hwNpsDeviceID, hwNpsCurrentDriverType, hwNpsFailReason
// Description: Driver Type Mismatch.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.18.38"] = [
    name: "hwNpsDriverTypeMismatch",
    fields: ["hwNpsVmName", "hwNpsVendorID", "hwNpsDeviceID", "hwNpsCurrentDriverType", "hwNpsFailReason"],
    fieldOids: ["hwNpsVmName": "1.3.6.1.4.1.2011.5.25.129.1.23", "hwNpsVendorID": "1.3.6.1.4.1.2011.5.25.129.1.51", "hwNpsDeviceID": "1.3.6.1.4.1.2011.5.25.129.1.52", "hwNpsCurrentDriverType": "1.3.6.1.4.1.2011.5.25.129.1.53", "hwNpsFailReason": "1.3.6.1.4.1.2011.5.25.129.1.22"]
]

// --- hwNpsDriverTypeMismatchResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.18.39
// Fields: hwNpsVmName, hwNpsVendorID, hwNpsDeviceID, hwNpsCurrentDriverType, hwNpsFailReason
// Description: Driver Type Mismatch.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.18.39"] = [
    name: "hwNpsDriverTypeMismatchResume",
    fields: ["hwNpsVmName", "hwNpsVendorID", "hwNpsDeviceID", "hwNpsCurrentDriverType", "hwNpsFailReason"],
    fieldOids: ["hwNpsVmName": "1.3.6.1.4.1.2011.5.25.129.1.23", "hwNpsVendorID": "1.3.6.1.4.1.2011.5.25.129.1.51", "hwNpsDeviceID": "1.3.6.1.4.1.2011.5.25.129.1.52", "hwNpsCurrentDriverType": "1.3.6.1.4.1.2011.5.25.129.1.53", "hwNpsFailReason": "1.3.6.1.4.1.2011.5.25.129.1.22"]
]

// --- hwNpsRuCreateFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.18.40
// Fields: hwNpsVmName, hwNpsVNFCName, hwNpsRUName, hwNpsFailReason
// Description: RU Create Failed.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.18.40"] = [
    name: "hwNpsRuCreateFail",
    fields: ["hwNpsVmName", "hwNpsVNFCName", "hwNpsRUName", "hwNpsFailReason"],
    fieldOids: ["hwNpsVmName": "1.3.6.1.4.1.2011.5.25.129.1.23", "hwNpsVNFCName": "1.3.6.1.4.1.2011.5.25.129.1.54", "hwNpsRUName": "1.3.6.1.4.1.2011.5.25.129.1.55", "hwNpsFailReason": "1.3.6.1.4.1.2011.5.25.129.1.22"]
]

// --- hwNpsRuCreateResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.18.41
// Fields: hwNpsVmName, hwNpsVNFCName, hwNpsRUName, hwNpsFailReason
// Description: RU Create success.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.18.41"] = [
    name: "hwNpsRuCreateResume",
    fields: ["hwNpsVmName", "hwNpsVNFCName", "hwNpsRUName", "hwNpsFailReason"],
    fieldOids: ["hwNpsVmName": "1.3.6.1.4.1.2011.5.25.129.1.23", "hwNpsVNFCName": "1.3.6.1.4.1.2011.5.25.129.1.54", "hwNpsRUName": "1.3.6.1.4.1.2011.5.25.129.1.55", "hwNpsFailReason": "1.3.6.1.4.1.2011.5.25.129.1.22"]
]

// --- hwNpsIpSecRuleFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.18.42
// Fields: hwNpsVmName, hwNpsPortName, hwNpsIpAdress
// Description: Setting Security Group Rules Failed.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.18.42"] = [
    name: "hwNpsIpSecRuleFail",
    fields: ["hwNpsVmName", "hwNpsPortName", "hwNpsIpAdress"],
    fieldOids: ["hwNpsVmName": "1.3.6.1.4.1.2011.5.25.129.1.23", "hwNpsPortName": "1.3.6.1.4.1.2011.5.25.129.1.56", "hwNpsIpAdress": "1.3.6.1.4.1.2011.5.25.129.1.57"]
]

// --- hwNpsIpSecRuleResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.129.2.18.43
// Fields: hwNpsVmName, hwNpsPortName, hwNpsIpAdress
// Description: Setting Security Group Rules Resume.
trapMap["1.3.6.1.4.1.2011.5.25.129.2.18.43"] = [
    name: "hwNpsIpSecRuleResume",
    fields: ["hwNpsVmName", "hwNpsPortName", "hwNpsIpAdress"],
    fieldOids: ["hwNpsVmName": "1.3.6.1.4.1.2011.5.25.129.1.23", "hwNpsPortName": "1.3.6.1.4.1.2011.5.25.129.1.56", "hwNpsIpAdress": "1.3.6.1.4.1.2011.5.25.129.1.57"]
]

// ===== Lookup tables (inlined) =====
def lookupTables = [:]

// ===== Parsing logic =====

// Set to true to enable diagnostic logging for this MIB parser
DEBUG = false

LOG_PREFIX = "[HUAWEI-BASE-TRAP-MIB]"
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

// --- Trap rule overrides (alert group / severity) ---
def trapRuleName = trapInfo.name
def agent = ""
// --- Trap: hwEntityRemove (OID 1.3.6.1.4.1.2011.5.25.129.2.1.1) ---
if (trapRuleName == "hwEntityRemove") {
    event.setAlertGroup("Entity Insert/Remove")
    def alertKey = "entPhysicalEntry." + (((resolveInstanceOid(4) =~ /\.([0-9]+)$/) ? (resolveInstanceOid(4) =~ /\.([0-9]+)$/)[0][1] : ''))
    event.setAlertKey(alertKey)
    def summary = "Hw Entity Remove" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(2)
    event.setEventType("1")
}
// --- Trap: hwEntityInsert (OID 1.3.6.1.4.1.2011.5.25.129.2.1.2) ---
if (trapRuleName == "hwEntityInsert") {
    event.setAlertGroup("Entity Insert/Remove")
    def alertKey = "entPhysicalEntry." + (((resolveInstanceOid(4) =~ /\.([0-9]+)$/) ? (resolveInstanceOid(4) =~ /\.([0-9]+)$/)[0][1] : ''))
    event.setAlertKey(alertKey)
    def summary = "Hw Entity Insert" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(1)
    event.setEventType("2")
}
// --- Trap: hwEntityUnstable (OID 1.3.6.1.4.1.2011.5.25.129.2.1.3) ---
if (trapRuleName == "hwEntityUnstable") {
    event.setAlertGroup("Entity Status")
    def alertKey = "entPhysicalEntry." + (((resolveInstanceOid(4) =~ /\.([0-9]+)$/) ? (resolveInstanceOid(4) =~ /\.([0-9]+)$/)[0][1] : ''))
    event.setAlertKey(alertKey)
    def summary = "Hw Entity Unstable" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(4)
    event.setEventType("1")
}
// --- Trap: hwEntityUnstableResume (OID 1.3.6.1.4.1.2011.5.25.129.2.1.4) ---
if (trapRuleName == "hwEntityUnstableResume") {
    event.setAlertGroup("Entity Status")
    def alertKey = "entPhysicalEntry." + (((resolveInstanceOid(4) =~ /\.([0-9]+)$/) ? (resolveInstanceOid(4) =~ /\.([0-9]+)$/)[0][1] : ''))
    event.setAlertKey(alertKey)
    def summary = "Hw Entity Unstable Resume" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(1)
    event.setEventType("2")
}
// --- Trap: hwEntityReset (OID 1.3.6.1.4.1.2011.5.25.129.2.1.5) ---
if (trapRuleName == "hwEntityReset") {
    event.setAlertGroup("Entity Reset")
    def alertKey = "entPhysicalEntry." + (((resolveInstanceOid(4) =~ /\.([0-9]+)$/) ? (resolveInstanceOid(4) =~ /\.([0-9]+)$/)[0][1] : ''))
    event.setAlertKey(alertKey)
    def summary = "Hw Entity Reset" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(4)
    event.setEventType("1")
}
// --- Trap: hwEntityResetDone (OID 1.3.6.1.4.1.2011.5.25.129.2.1.6) ---
if (trapRuleName == "hwEntityResetDone") {
    event.setAlertGroup("Entity Reset")
    def alertKey = "entPhysicalEntry." + (((resolveInstanceOid(4) =~ /\.([0-9]+)$/) ? (resolveInstanceOid(4) =~ /\.([0-9]+)$/)[0][1] : ''))
    event.setAlertKey(alertKey)
    def summary = "Hw Entity Reset Done" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(1)
    event.setEventType("2")
}
// --- Trap: hwEntityCommunicateError (OID 1.3.6.1.4.1.2011.5.25.129.2.1.7) ---
if (trapRuleName == "hwEntityCommunicateError") {
    event.setAlertGroup("Entity Communication")
    def alertKey = "entPhysicalEntry." + (((resolveInstanceOid(4) =~ /\.([0-9]+)$/) ? (resolveInstanceOid(4) =~ /\.([0-9]+)$/)[0][1] : ''))
    event.setAlertKey(alertKey)
    def summary = "Hw Entity Communicate Error" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(3)
    event.setEventType("1")
}
// --- Trap: hwEntityCommunicateResume (OID 1.3.6.1.4.1.2011.5.25.129.2.1.8) ---
if (trapRuleName == "hwEntityCommunicateResume") {
    event.setAlertGroup("Entity Communication")
    def alertKey = "entPhysicalEntry." + (((resolveInstanceOid(4) =~ /\.([0-9]+)$/) ? (resolveInstanceOid(4) =~ /\.([0-9]+)$/)[0][1] : ''))
    event.setAlertKey(alertKey)
    def summary = "Hw Entity Communicate Resume" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(1)
    event.setEventType("2")
}
// --- Trap: hwEntityInvalid (OID 1.3.6.1.4.1.2011.5.25.129.2.1.9) ---
if (trapRuleName == "hwEntityInvalid") {
    event.setAlertGroup("Entity Invalid")
    def alertKey = "entPhysicalEntry." + (((resolveInstanceOid(4) =~ /\.([0-9]+)$/) ? (resolveInstanceOid(4) =~ /\.([0-9]+)$/)[0][1] : ''))
    event.setAlertKey(alertKey)
    def summary = "Hw Entity Invalid" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(3)
    event.setEventType("1")
}
// --- Trap: hwEntityResume (OID 1.3.6.1.4.1.2011.5.25.129.2.1.10) ---
if (trapRuleName == "hwEntityResume") {
    event.setAlertGroup("Entity Invalid")
    def alertKey = "entPhysicalEntry." + (((resolveInstanceOid(4) =~ /\.([0-9]+)$/) ? (resolveInstanceOid(4) =~ /\.([0-9]+)$/)[0][1] : ''))
    event.setAlertKey(alertKey)
    def summary = "Hw Entity Resume" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(1)
    event.setEventType("2")
}
// --- Trap: hwEntityLeaveMaster (OID 1.3.6.1.4.1.2011.5.25.129.2.1.11) ---
if (trapRuleName == "hwEntityLeaveMaster") {
    event.setAlertGroup("Entity Leave Master")
    def alertKey = "entPhysicalEntry." + (((resolveInstanceOid(4) =~ /\.([0-9]+)$/) ? (resolveInstanceOid(4) =~ /\.([0-9]+)$/)[0][1] : ''))
    event.setAlertKey(alertKey)
    def summary = "Hw Entity Leave Master" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(3)
    event.setEventType("1")
}
// --- Trap: hwEntityBecomeMaster (OID 1.3.6.1.4.1.2011.5.25.129.2.1.12) ---
if (trapRuleName == "hwEntityBecomeMaster") {
    event.setAlertGroup("Entity Leave Master")
    def alertKey = "entPhysicalEntry." + (((resolveInstanceOid(4) =~ /\.([0-9]+)$/) ? (resolveInstanceOid(4) =~ /\.([0-9]+)$/)[0][1] : ''))
    event.setAlertKey(alertKey)
    def summary = "Hw Entity Become Master" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(1)
    event.setEventType("2")
}
// --- Trap: hwEntityOffline (OID 1.3.6.1.4.1.2011.5.25.129.2.1.13) ---
if (trapRuleName == "hwEntityOffline") {
    event.setAlertGroup("Entity Online Status")
    def alertKey = "entPhysicalEntry." + (((resolveInstanceOid(4) =~ /\.([0-9]+)$/) ? (resolveInstanceOid(4) =~ /\.([0-9]+)$/)[0][1] : ''))
    event.setAlertKey(alertKey)
    def summary = "Hw Entity Offline" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(3)
    event.setEventType("1")
}
// --- Trap: hwEntityOnline (OID 1.3.6.1.4.1.2011.5.25.129.2.1.14) ---
if (trapRuleName == "hwEntityOnline") {
    event.setAlertGroup("Entity Online Status")
    def alertKey = "entPhysicalEntry." + (((resolveInstanceOid(4) =~ /\.([0-9]+)$/) ? (resolveInstanceOid(4) =~ /\.([0-9]+)$/)[0][1] : ''))
    event.setAlertKey(alertKey)
    def summary = "Hw Entity Online" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(1)
    event.setEventType("2")
}
// --- Trap: hwTempRisingAlarm (OID 1.3.6.1.4.1.2011.5.25.129.2.2.1) ---
if (trapRuleName == "hwTempRisingAlarm") {
    event.setAlertGroup("Temperature High/Low")
    def alertKey = "entPhysicalEntry." + (((resolveInstanceOid(4) =~ /\.([0-9]+)$/) ? (resolveInstanceOid(4) =~ /\.([0-9]+)$/)[0][1] : ''))
    event.setAlertKey(alertKey)
    def summary = "Hw Temp Rising Alarm" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(3)
    event.setEventType("1")
}
// --- Trap: hwTempFallingAlarm (OID 1.3.6.1.4.1.2011.5.25.129.2.2.2) ---
if (trapRuleName == "hwTempFallingAlarm") {
    event.setAlertGroup("Temperature High/Low")
    def alertKey = "entPhysicalEntry." + (((resolveInstanceOid(4) =~ /\.([0-9]+)$/) ? (resolveInstanceOid(4) =~ /\.([0-9]+)$/)[0][1] : ''))
    event.setAlertKey(alertKey)
    def summary = "Hw Temp Falling Alarm" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(3)
    event.setEventType("1")
}
// --- Trap: hwTempResume (OID 1.3.6.1.4.1.2011.5.25.129.2.2.3) ---
if (trapRuleName == "hwTempResume") {
    event.setAlertGroup("Temperature High/Low")
    def alertKey = "entPhysicalEntry." + (((resolveInstanceOid(4) =~ /\.([0-9]+)$/) ? (resolveInstanceOid(4) =~ /\.([0-9]+)$/)[0][1] : ''))
    event.setAlertKey(alertKey)
    def summary = "Hw Temp Resume" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(1)
    event.setEventType("2")
}
// --- Trap: hwHumidityRisingAlarm (OID 1.3.6.1.4.1.2011.5.25.129.2.2.4) ---
if (trapRuleName == "hwHumidityRisingAlarm") {
    event.setAlertGroup("Humidity High/Low")
    def alertKey = "entPhysicalEntry." + (((resolveInstanceOid(4) =~ /\.([0-9]+)$/) ? (resolveInstanceOid(4) =~ /\.([0-9]+)$/)[0][1] : ''))
    event.setAlertKey(alertKey)
    def summary = "Hw Humidity Rising Alarm" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(3)
    event.setEventType("1")
}
// --- Trap: hwHumidityFallingAlarm (OID 1.3.6.1.4.1.2011.5.25.129.2.2.5) ---
if (trapRuleName == "hwHumidityFallingAlarm") {
    event.setAlertGroup("Humidity High/Low")
    def alertKey = "entPhysicalEntry." + (((resolveInstanceOid(4) =~ /\.([0-9]+)$/) ? (resolveInstanceOid(4) =~ /\.([0-9]+)$/)[0][1] : ''))
    event.setAlertKey(alertKey)
    def summary = "Hw Humidity Falling Alarm" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(3)
    event.setEventType("1")
}
// --- Trap: hwHumidityResume (OID 1.3.6.1.4.1.2011.5.25.129.2.2.6) ---
if (trapRuleName == "hwHumidityResume") {
    event.setAlertGroup("Humidity High/Low")
    def alertKey = "entPhysicalEntry." + (((resolveInstanceOid(4) =~ /\.([0-9]+)$/) ? (resolveInstanceOid(4) =~ /\.([0-9]+)$/)[0][1] : ''))
    event.setAlertKey(alertKey)
    def summary = "Hw Humidity Resume" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(1)
    event.setEventType("2")
}
// --- Trap: hwVoltRisingAlarm (OID 1.3.6.1.4.1.2011.5.25.129.2.2.7) ---
if (trapRuleName == "hwVoltRisingAlarm") {
    event.setAlertGroup("Voltage High/Low")
    def alertKey = "entPhysicalEntry." + (((resolveInstanceOid(4) =~ /\.([0-9]+)$/) ? (resolveInstanceOid(4) =~ /\.([0-9]+)$/)[0][1] : ''))
    event.setAlertKey(alertKey)
    def summary = "Hw Volt Rising Alarm" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(3)
    event.setEventType("1")
}
// --- Trap: hwVoltFallingAlarm (OID 1.3.6.1.4.1.2011.5.25.129.2.2.8) ---
if (trapRuleName == "hwVoltFallingAlarm") {
    event.setAlertGroup("Voltage High/Low")
    def alertKey = "entPhysicalEntry." + (((resolveInstanceOid(4) =~ /\.([0-9]+)$/) ? (resolveInstanceOid(4) =~ /\.([0-9]+)$/)[0][1] : ''))
    event.setAlertKey(alertKey)
    def summary = "Hw Volt Falling Alarm" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(3)
    event.setEventType("1")
}
// --- Trap: hwVoltResume (OID 1.3.6.1.4.1.2011.5.25.129.2.2.9) ---
if (trapRuleName == "hwVoltResume") {
    event.setAlertGroup("Voltage High/Low")
    def alertKey = "entPhysicalEntry." + (((resolveInstanceOid(4) =~ /\.([0-9]+)$/) ? (resolveInstanceOid(4) =~ /\.([0-9]+)$/)[0][1] : ''))
    event.setAlertKey(alertKey)
    def summary = "Hw Volt Resume" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(1)
    event.setEventType("2")
}
// --- Trap: hwPowerOff (OID 1.3.6.1.4.1.2011.5.25.129.2.3.1) ---
if (trapRuleName == "hwPowerOff") {
    event.setAlertGroup("Power Status")
    def alertKey = "entPhysicalEntry." + (((resolveInstanceOid(4) =~ /\.([0-9]+)$/) ? (resolveInstanceOid(4) =~ /\.([0-9]+)$/)[0][1] : ''))
    event.setAlertKey(alertKey)
    def summary = "Hw Power Off" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(4)
    event.setEventType("1")
}
// --- Trap: hwPowerOn (OID 1.3.6.1.4.1.2011.5.25.129.2.3.2) ---
if (trapRuleName == "hwPowerOn") {
    event.setAlertGroup("Power Status")
    def alertKey = "entPhysicalEntry." + (((resolveInstanceOid(4) =~ /\.([0-9]+)$/) ? (resolveInstanceOid(4) =~ /\.([0-9]+)$/)[0][1] : ''))
    event.setAlertKey(alertKey)
    def summary = "Hw Power On" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(1)
    event.setEventType("2")
}
// --- Trap: hwCPUUtilizationRisingAlarm (OID 1.3.6.1.4.1.2011.5.25.129.2.4.1) ---
if (trapRuleName == "hwCPUUtilizationRisingAlarm") {
    event.setAlertGroup("CPU Usage High/Low")
    def alertKey = "entPhysicalEntry." + (((resolveInstanceOid(4) =~ /\.([0-9]+)$/) ? (resolveInstanceOid(4) =~ /\.([0-9]+)$/)[0][1] : ''))
    event.setAlertKey(alertKey)
    def summary = "Hw CPUUtilization Rising Alarm" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(4)
    event.setEventType("1")
}
// --- Trap: hwCPUUtilizationResume (OID 1.3.6.1.4.1.2011.5.25.129.2.4.2) ---
if (trapRuleName == "hwCPUUtilizationResume") {
    event.setAlertGroup("CPU Usage High/Low")
    def alertKey = "entPhysicalEntry." + (((resolveInstanceOid(4) =~ /\.([0-9]+)$/) ? (resolveInstanceOid(4) =~ /\.([0-9]+)$/)[0][1] : ''))
    event.setAlertKey(alertKey)
    def summary = "Hw CPUUtilization Resume" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(1)
    event.setEventType("2")
}
// --- Trap: hwPortPhysicalDown (OID 1.3.6.1.4.1.2011.5.25.129.2.5.1) ---
if (trapRuleName == "hwPortPhysicalDown") {
    event.setAlertGroup("Physical Port Up/Down")
    def alertKey = "entPhysicalEntry." + (((resolveInstanceOid(4) =~ /\.([0-9]+)$/) ? (resolveInstanceOid(4) =~ /\.([0-9]+)$/)[0][1] : ''))
    event.setAlertKey(alertKey)
    def summary = "Hw Port Physical Down" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(4)
    event.setEventType("1")
}
// --- Trap: hwPortPhysicalUp (OID 1.3.6.1.4.1.2011.5.25.129.2.5.2) ---
if (trapRuleName == "hwPortPhysicalUp") {
    event.setAlertGroup("Physical Port Up/Down")
    def alertKey = "entPhysicalEntry." + (((resolveInstanceOid(4) =~ /\.([0-9]+)$/) ? (resolveInstanceOid(4) =~ /\.([0-9]+)$/)[0][1] : ''))
    event.setAlertKey(alertKey)
    def summary = "Hw Port Physical Up" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(1)
    event.setEventType("2")
}
// --- Trap: hwStorageUtilizationRisingAlarm (OID 1.3.6.1.4.1.2011.5.25.129.2.6.1) ---
if (trapRuleName == "hwStorageUtilizationRisingAlarm") {
    event.setAlertGroup("Stotage Utilization High/Low")
    def alertKey = "entPhysicalEntry." + (((resolveInstanceOid(4) =~ /\.([0-9]+)$/) ? (resolveInstanceOid(4) =~ /\.([0-9]+)$/)[0][1] : ''))
    event.setAlertKey(alertKey)
    def summary = "Hw Storage Utilization Rising Alarm" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(3)
    event.setEventType("1")
}
// --- Trap: hwStorageUtilizationResume (OID 1.3.6.1.4.1.2011.5.25.129.2.6.2) ---
if (trapRuleName == "hwStorageUtilizationResume") {
    event.setAlertGroup("Stotage Utilization High/Low")
    def alertKey = "entPhysicalEntry." + (((resolveInstanceOid(4) =~ /\.([0-9]+)$/) ? (resolveInstanceOid(4) =~ /\.([0-9]+)$/)[0][1] : ''))
    event.setAlertKey(alertKey)
    def summary = "Hw Storage Utilization Resume" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(1)
    event.setEventType("2")
}
// --- Trap: hwFIBOverloadSuspend (OID 1.3.6.1.4.1.2011.5.25.129.2.9.1) ---
if (trapRuleName == "hwFIBOverloadSuspend") {
    event.setAlertGroup("FIB Overload Suspend")
    def alertKey = ""
    event.setAlertKey(alertKey)
    def summary = "Hw FIBOverload Suspend" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(4)
    event.setEventType("1")
}
// --- Trap: hwFIBOverloadSusResume (OID 1.3.6.1.4.1.2011.5.25.129.2.9.2) ---
if (trapRuleName == "hwFIBOverloadSusResume") {
    event.setAlertGroup("FIB Overload Suspend")
    def alertKey = ""
    event.setAlertKey(alertKey)
    def summary = "Hw FIBOverload Sus Resume" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(1)
    event.setEventType("2")
    def dyn = event.getDynamicFields() ?: [:]
    dyn["hwBaseTrapSeverity"] = varbinds.get("hwBaseTrapSeverity")
    dyn["hwBaseTrapProbableCause"] = varbinds.get("hwBaseTrapProbableCause")
    dyn["hwBaseTrapEventType"] = varbinds.get("hwBaseTrapEventType")
    event.setDynamicFields(dyn)
}
// --- Trap: hwFIBOverloadForward (OID 1.3.6.1.4.1.2011.5.25.129.2.9.3) ---
if (trapRuleName == "hwFIBOverloadForward") {
    event.setAlertGroup("FIB Overload Forwarding")
    def alertKey = "FIB Module: " + ((((lookupTables?."hwFIBOverloadModule" as Map)?.get(gf[4] ?: "") ?: "Unknown")) + " ( " + gf[4] + " )")
    event.setAlertKey(alertKey)
    def summary = "Hw FIBOverload Forward" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(3)
    event.setEventType("1")
}
// --- Trap: hwFIBOverloadFwResume (OID 1.3.6.1.4.1.2011.5.25.129.2.9.4) ---
if (trapRuleName == "hwFIBOverloadFwResume") {
    event.setAlertGroup("FIB Overload Forwarding")
    def alertKey = "FIB Module: " + ((((lookupTables?."hwFIBOverloadModule" as Map)?.get(gf[4] ?: "") ?: "Unknown")) + " ( " + gf[4] + " )")
    event.setAlertKey(alertKey)
    def summary = "Hw FIBOverload Fw Resume" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(1)
    event.setEventType("2")
}
// --- Trap: hwPppLoopbackDetect (OID 1.3.6.1.4.1.2011.5.25.129.2.10.1) ---
if (trapRuleName == "hwPppLoopbackDetect") {
    event.setAlertGroup("Interface Loopback")
    def alertKey = "ifEntry." + (gf[4])
    event.setAlertKey(alertKey)
    def summary = "Hw Ppp Loopback Detect" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(3)
    event.setEventType("1")
}
// --- Trap: hwPppLoopbackDetResume (OID 1.3.6.1.4.1.2011.5.25.129.2.10.2) ---
if (trapRuleName == "hwPppLoopbackDetResume") {
    event.setAlertGroup("Interface Loopback")
    def alertKey = "ifEntry." + (gf[4])
    event.setAlertKey(alertKey)
    def summary = "Hw Ppp Loopback Det Resume" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(1)
    event.setEventType("2")
}

if (event.getAgentType() == null || event.getAgentType().trim().isEmpty()) {
    event.setAgentType(metadata?.get("agentType")?.toString() ?: "generic")
}
def pairKey = [event.getDomainId(), event.getAgentType(), event.getNode(), event.getAlertGroup(), event.getAlertKey()]
                    .findAll { it != null && it.toString().trim() != "" }
                    .collect { it.toString().trim() }.join("|")
event.setIdentifier(pairKey + "|" + event.getEventType())

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
