/**
 * Auto-generated from HUAWEI-VNF-DEVICE-MIB.mib
 * Generated: 2026-08-24T18:28:31.360847500
 * Traps/Notifications (76): hwFabricPlaneDown, hwFabricPlaneUp, hwFabricPlaneSubhealthy, hwFabricPlaneSubhealthyResume, hwFabricPortDriverMismatch, hwVnfcConnectionLost, hwVnfcConnectionResume, hwVMInconsist, hwVMInconsistResume, hwVMAdd, hwVMDelete, hwVMFaultAlarm, hwVMFaultAlarmResume, hwVirtualPortDown, hwVirtualPortDownResume, hwVNFMConnectionFault, hwVNFMConnectionFaultResume, hwVMMemoryUsageRisingAlarm, hwVMMemoryUsageResume, hwVMCPUUsageRisingAlarm, hwVMCPUUsageResume, hwVMDiskInvalid, hwVMDiskInvalidResume, hwVMDiskPartitionInValid, hwVMDiskPartitionInValidResume, hwVMDiskPartitionSpacinsufficient, hwVMDiskPartitionSpacinsufficientResume, hwVMDiskPartitionUseageRising, hwVMDiskPartitionUseageResume, hwFileIntegrityError, hwFileIntegrityErrorResume, hwSoftwareIntegrityError, hwSoftwareIntegrityErrorResume, hwPatchInstallFailVm, hwPatchInstallFailVmClear, hwBaseLinkSubHealthy, hwBaseLinkSubHealthyResume, hwRUCreateFailAlarm, hwRUCreateFailResume, hwRUDiskUnavailable, hwRUDiskUnavailableResume, hwRUExecutableFilesIncomplete, hwRUExecutableFilesIncompleteResume, hwRUDiskPartitionUnavailable, hwRUDiskPartitionUnavailableResume, hwRUDiskPartitionSpaceInsufficient, hwRUDiskPartitionSpaceInsufficientResume, hwRUFault, hwRUFaultResume, hwRUDiskThresholdExceed, hwRUDiskThresholdExceedResume, hwRUGroupFault, hwRUGroupFaultResume, hwResourceProcessFault, hwResourceProcessFaultResume, hwELECTClusterFail, hwELECTClusterFailResume, hwELECTMemberFail, hwELECTMemberFailResume, hwBasePhyLinkSubHealthy, hwBasePhyLinkSubHealthyResume, hwSoftwareInReposIntegrityFailed, hwSoftwareInReposIntegrityResume, hwPatchInstallFailRu, hwPatchInstallFailRuClear, hwProcessFault, hwProcessFaultResume, hwVMDiskUnavailable, hwVMDiskUnavailableResume, hwDiskReadWriteRateAbnormal, hwDiskReadWriteRateAbnormalResume, hwRUMemoryDiskPartitionInsufficient, hwRUMemoryDiskPartitionInsufficientResume, hwPartitionNotRamDisk, hwVMMemoryDiskPartitionInsufficient, hwVMMemoryDiskPartitionInsufficientResume
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

// --- hwFabricPlaneDown (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.348.2.1.1
// Fields: hwPAEPlaneVMName, hwPAEPlaneRemoteVMName, hwPAEPlanePlaneID
// Description: Fabric plane goes Down.
trapMap["1.3.6.1.4.1.2011.5.25.348.2.1.1"] = [
    name: "hwFabricPlaneDown",
    fields: ["hwPAEPlaneVMName", "hwPAEPlaneRemoteVMName", "hwPAEPlanePlaneID"],
    fieldOids: ["hwPAEPlaneVMName": "1.3.6.1.4.1.2011.5.25.348.1.1.1.1", "hwPAEPlaneRemoteVMName": "1.3.6.1.4.1.2011.5.25.348.1.1.1.2", "hwPAEPlanePlaneID": "1.3.6.1.4.1.2011.5.25.348.1.1.1.3"]
]

// --- hwFabricPlaneUp (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.348.2.1.2
// Fields: hwPAEPlaneVMName, hwPAEPlaneRemoteVMName, hwPAEPlanePlaneID
// Description: Fabric plane down alarm was cleared.
trapMap["1.3.6.1.4.1.2011.5.25.348.2.1.2"] = [
    name: "hwFabricPlaneUp",
    fields: ["hwPAEPlaneVMName", "hwPAEPlaneRemoteVMName", "hwPAEPlanePlaneID"],
    fieldOids: ["hwPAEPlaneVMName": "1.3.6.1.4.1.2011.5.25.348.1.1.1.1", "hwPAEPlaneRemoteVMName": "1.3.6.1.4.1.2011.5.25.348.1.1.1.2", "hwPAEPlanePlaneID": "1.3.6.1.4.1.2011.5.25.348.1.1.1.3"]
]

// --- hwFabricPlaneSubhealthy (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.348.2.1.3
// Fields: hwPAEPlaneVMName, hwPAEPlaneRemoteVMName, hwPAEPlanePlaneID, hwPAEPlaneSubhealthyThreshold
// Description: Fabric link goes subhealthy.
trapMap["1.3.6.1.4.1.2011.5.25.348.2.1.3"] = [
    name: "hwFabricPlaneSubhealthy",
    fields: ["hwPAEPlaneVMName", "hwPAEPlaneRemoteVMName", "hwPAEPlanePlaneID", "hwPAEPlaneSubhealthyThreshold"],
    fieldOids: ["hwPAEPlaneVMName": "1.3.6.1.4.1.2011.5.25.348.1.1.1.1", "hwPAEPlaneRemoteVMName": "1.3.6.1.4.1.2011.5.25.348.1.1.1.2", "hwPAEPlanePlaneID": "1.3.6.1.4.1.2011.5.25.348.1.1.1.3", "hwPAEPlaneSubhealthyThreshold": "1.3.6.1.4.1.2011.5.25.348.1.1.1.4"]
]

// --- hwFabricPlaneSubhealthyResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.348.2.1.4
// Fields: hwPAEPlaneVMName, hwPAEPlaneRemoteVMName, hwPAEPlanePlaneID, hwPAEPlaneSubhealthyThreshold
// Description: Fabric link resume from subhealthy.
trapMap["1.3.6.1.4.1.2011.5.25.348.2.1.4"] = [
    name: "hwFabricPlaneSubhealthyResume",
    fields: ["hwPAEPlaneVMName", "hwPAEPlaneRemoteVMName", "hwPAEPlanePlaneID", "hwPAEPlaneSubhealthyThreshold"],
    fieldOids: ["hwPAEPlaneVMName": "1.3.6.1.4.1.2011.5.25.348.1.1.1.1", "hwPAEPlaneRemoteVMName": "1.3.6.1.4.1.2011.5.25.348.1.1.1.2", "hwPAEPlanePlaneID": "1.3.6.1.4.1.2011.5.25.348.1.1.1.3", "hwPAEPlaneSubhealthyThreshold": "1.3.6.1.4.1.2011.5.25.348.1.1.1.4"]
]

// --- hwFabricPortDriverMismatch (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.348.2.1.5
// Fields: hwPAEDriverVMName, hwPAEDriverVendorID, hwPAEDriverDeviceID, hwPAEDriverCurDrvType, hwPAEDriverCauseInfo
// Description: Driver Type Mismatch.
trapMap["1.3.6.1.4.1.2011.5.25.348.2.1.5"] = [
    name: "hwFabricPortDriverMismatch",
    fields: ["hwPAEDriverVMName", "hwPAEDriverVendorID", "hwPAEDriverDeviceID", "hwPAEDriverCurDrvType", "hwPAEDriverCauseInfo"],
    fieldOids: ["hwPAEDriverVMName": "1.3.6.1.4.1.2011.5.25.348.1.2.1.1", "hwPAEDriverVendorID": "1.3.6.1.4.1.2011.5.25.348.1.2.1.2", "hwPAEDriverDeviceID": "1.3.6.1.4.1.2011.5.25.348.1.2.1.3", "hwPAEDriverCurDrvType": "1.3.6.1.4.1.2011.5.25.348.1.2.1.4", "hwPAEDriverCauseInfo": "1.3.6.1.4.1.2011.5.25.348.1.2.1.5"]
]

// --- hwVnfcConnectionLost (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.348.2.2.1
// Fields: hwVNFCName
// Description: The connection between the VNFP and VNFC fails.
trapMap["1.3.6.1.4.1.2011.5.25.348.2.2.1"] = [
    name: "hwVnfcConnectionLost",
    fields: ["hwVNFCName"],
    fieldOids: ["hwVNFCName": "1.3.6.1.4.1.2011.5.25.348.1.4.1.1"]
]

// --- hwVnfcConnectionResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.348.2.2.2
// Fields: hwVNFCName
// Description: The connection between the VNFP and VNFC is restored.
trapMap["1.3.6.1.4.1.2011.5.25.348.2.2.2"] = [
    name: "hwVnfcConnectionResume",
    fields: ["hwVNFCName"],
    fieldOids: ["hwVNFCName": "1.3.6.1.4.1.2011.5.25.348.1.4.1.1"]
]

// --- hwVMInconsist (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.348.2.3.1
// Fields: hwVMName, hwVMID, hwPhyVMID, hwVMInconsistFaultReason
// Description: Local VM resources are inconsistent with VM resources on the MANO.
trapMap["1.3.6.1.4.1.2011.5.25.348.2.3.1"] = [
    name: "hwVMInconsist",
    fields: ["hwVMName", "hwVMID", "hwPhyVMID", "hwVMInconsistFaultReason"],
    fieldOids: ["hwVMName": "1.3.6.1.4.1.2011.5.25.348.1.5.1.1", "hwVMID": "1.3.6.1.4.1.2011.5.25.348.1.5.1.2", "hwPhyVMID": "1.3.6.1.4.1.2011.5.25.348.1.5.1.3", "hwVMInconsistFaultReason": "1.3.6.1.4.1.2011.5.25.348.1.5.1.4"]
]

// --- hwVMInconsistResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.348.2.3.2
// Fields: hwVMName, hwVMID, hwPhyVMID, hwVMInconsistFaultReason
// Description: Local VM resources are consistent with VM resources on the MANO.
trapMap["1.3.6.1.4.1.2011.5.25.348.2.3.2"] = [
    name: "hwVMInconsistResume",
    fields: ["hwVMName", "hwVMID", "hwPhyVMID", "hwVMInconsistFaultReason"],
    fieldOids: ["hwVMName": "1.3.6.1.4.1.2011.5.25.348.1.5.1.1", "hwVMID": "1.3.6.1.4.1.2011.5.25.348.1.5.1.2", "hwPhyVMID": "1.3.6.1.4.1.2011.5.25.348.1.5.1.3", "hwVMInconsistFaultReason": "1.3.6.1.4.1.2011.5.25.348.1.5.1.4"]
]

// --- hwVMAdd (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.348.2.3.3
// Fields: hwVMName, hwVMTypeName
// Description: The VM was added.
trapMap["1.3.6.1.4.1.2011.5.25.348.2.3.3"] = [
    name: "hwVMAdd",
    fields: ["hwVMName", "hwVMTypeName"],
    fieldOids: ["hwVMName": "1.3.6.1.4.1.2011.5.25.348.1.5.1.1", "hwVMTypeName": "1.3.6.1.4.1.2011.5.25.348.1.5.1.5"]
]

// --- hwVMDelete (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.348.2.3.4
// Fields: hwVMName, hwVMTypeName
// Description: The VM was deleted.
trapMap["1.3.6.1.4.1.2011.5.25.348.2.3.4"] = [
    name: "hwVMDelete",
    fields: ["hwVMName", "hwVMTypeName"],
    fieldOids: ["hwVMName": "1.3.6.1.4.1.2011.5.25.348.1.5.1.1", "hwVMTypeName": "1.3.6.1.4.1.2011.5.25.348.1.5.1.5"]
]

// --- hwVMFaultAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.348.2.3.5
// Fields: hwVMName, hwVMID, hwPhyVMID, hwVMInconsistFaultReason
// Description: A fault occurs on a VM.
trapMap["1.3.6.1.4.1.2011.5.25.348.2.3.5"] = [
    name: "hwVMFaultAlarm",
    fields: ["hwVMName", "hwVMID", "hwPhyVMID", "hwVMInconsistFaultReason"],
    fieldOids: ["hwVMName": "1.3.6.1.4.1.2011.5.25.348.1.5.1.1", "hwVMID": "1.3.6.1.4.1.2011.5.25.348.1.5.1.2", "hwPhyVMID": "1.3.6.1.4.1.2011.5.25.348.1.5.1.3", "hwVMInconsistFaultReason": "1.3.6.1.4.1.2011.5.25.348.1.5.1.4"]
]

// --- hwVMFaultAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.348.2.3.6
// Fields: hwVMName, hwVMID, hwPhyVMID, hwVMInconsistFaultReason
// Description: The fault on the VM is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.348.2.3.6"] = [
    name: "hwVMFaultAlarmResume",
    fields: ["hwVMName", "hwVMID", "hwPhyVMID", "hwVMInconsistFaultReason"],
    fieldOids: ["hwVMName": "1.3.6.1.4.1.2011.5.25.348.1.5.1.1", "hwVMID": "1.3.6.1.4.1.2011.5.25.348.1.5.1.2", "hwPhyVMID": "1.3.6.1.4.1.2011.5.25.348.1.5.1.3", "hwVMInconsistFaultReason": "1.3.6.1.4.1.2011.5.25.348.1.5.1.4"]
]

// --- hwVirtualPortDown (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.348.2.4.1
// Fields: hwVirtualPortName, hwVMName, hwVMID, hwPhyVMID
// Description: The virtual interface went Down.
trapMap["1.3.6.1.4.1.2011.5.25.348.2.4.1"] = [
    name: "hwVirtualPortDown",
    fields: ["hwVirtualPortName", "hwVMName", "hwVMID", "hwPhyVMID"],
    fieldOids: ["hwVirtualPortName": "1.3.6.1.4.1.2011.5.25.348.1.6.1.1", "hwVMName": "1.3.6.1.4.1.2011.5.25.348.1.5.1.1", "hwVMID": "1.3.6.1.4.1.2011.5.25.348.1.5.1.2", "hwPhyVMID": "1.3.6.1.4.1.2011.5.25.348.1.5.1.3"]
]

// --- hwVirtualPortDownResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.348.2.4.2
// Fields: hwVirtualPortName, hwVMName, hwVMID, hwPhyVMID
// Description: The virtual interface Down alarm was cleared.
trapMap["1.3.6.1.4.1.2011.5.25.348.2.4.2"] = [
    name: "hwVirtualPortDownResume",
    fields: ["hwVirtualPortName", "hwVMName", "hwVMID", "hwPhyVMID"],
    fieldOids: ["hwVirtualPortName": "1.3.6.1.4.1.2011.5.25.348.1.6.1.1", "hwVMName": "1.3.6.1.4.1.2011.5.25.348.1.5.1.1", "hwVMID": "1.3.6.1.4.1.2011.5.25.348.1.5.1.2", "hwPhyVMID": "1.3.6.1.4.1.2011.5.25.348.1.5.1.3"]
]

// --- hwVNFMConnectionFault (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.348.2.5.1
// Fields: hwVNFMIp, hwVNFMPort, hwVNFMFaultReason
// Description: The connection between the VNF and VNFM was faulty.
trapMap["1.3.6.1.4.1.2011.5.25.348.2.5.1"] = [
    name: "hwVNFMConnectionFault",
    fields: ["hwVNFMIp", "hwVNFMPort", "hwVNFMFaultReason"],
    fieldOids: ["hwVNFMIp": "1.3.6.1.4.1.2011.5.25.348.1.3.1.1", "hwVNFMPort": "1.3.6.1.4.1.2011.5.25.348.1.3.1.2", "hwVNFMFaultReason": "1.3.6.1.4.1.2011.5.25.348.1.3.1.3"]
]

// --- hwVNFMConnectionFaultResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.348.2.5.2
// Fields: hwVNFMIp, hwVNFMPort, hwVNFMFaultReason
// Description: The fault in the connection between the VNF and VNFM was rectified.
trapMap["1.3.6.1.4.1.2011.5.25.348.2.5.2"] = [
    name: "hwVNFMConnectionFaultResume",
    fields: ["hwVNFMIp", "hwVNFMPort", "hwVNFMFaultReason"],
    fieldOids: ["hwVNFMIp": "1.3.6.1.4.1.2011.5.25.348.1.3.1.1", "hwVNFMPort": "1.3.6.1.4.1.2011.5.25.348.1.3.1.2", "hwVNFMFaultReason": "1.3.6.1.4.1.2011.5.25.348.1.3.1.3"]
]

// --- hwVMMemoryUsageRisingAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.348.2.6.1
// Fields: hwVMName, hwVMMemoryUsageValue, hwVMMemoryUsageThreshold
// Description: When the Memory usage remains greater than the Memory alarm threshold for a period of time, this alarm is generated.
trapMap["1.3.6.1.4.1.2011.5.25.348.2.6.1"] = [
    name: "hwVMMemoryUsageRisingAlarm",
    fields: ["hwVMName", "hwVMMemoryUsageValue", "hwVMMemoryUsageThreshold"],
    fieldOids: ["hwVMName": "1.3.6.1.4.1.2011.5.25.348.1.5.1.1", "hwVMMemoryUsageValue": "1.3.6.1.4.1.2011.5.25.348.1.5.1.8", "hwVMMemoryUsageThreshold": "1.3.6.1.4.1.2011.5.25.348.1.5.1.9"]
]

// --- hwVMMemoryUsageResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.348.2.6.2
// Fields: hwVMName, hwVMMemoryUsageValue, hwVMMemoryUsageThreshold
// Description: When the Memory usage remains less than the Memory alarm clearance threshold for a period of time, this alarm is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.348.2.6.2"] = [
    name: "hwVMMemoryUsageResume",
    fields: ["hwVMName", "hwVMMemoryUsageValue", "hwVMMemoryUsageThreshold"],
    fieldOids: ["hwVMName": "1.3.6.1.4.1.2011.5.25.348.1.5.1.1", "hwVMMemoryUsageValue": "1.3.6.1.4.1.2011.5.25.348.1.5.1.8", "hwVMMemoryUsageThreshold": "1.3.6.1.4.1.2011.5.25.348.1.5.1.9"]
]

// --- hwVMCPUUsageRisingAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.348.2.7.1
// Fields: hwVMName, hwVMCPUUsageValue, hwVMCPUUsageThreshold
// Description: When the average CPU usage is greater than the CPU alarm threshold, this alarm is generated.
trapMap["1.3.6.1.4.1.2011.5.25.348.2.7.1"] = [
    name: "hwVMCPUUsageRisingAlarm",
    fields: ["hwVMName", "hwVMCPUUsageValue", "hwVMCPUUsageThreshold"],
    fieldOids: ["hwVMName": "1.3.6.1.4.1.2011.5.25.348.1.5.1.1", "hwVMCPUUsageValue": "1.3.6.1.4.1.2011.5.25.348.1.5.1.6", "hwVMCPUUsageThreshold": "1.3.6.1.4.1.2011.5.25.348.1.5.1.7"]
]

// --- hwVMCPUUsageResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.348.2.7.2
// Fields: hwVMName, hwVMCPUUsageValue, hwVMCPUUsageThreshold
// Description: When the average CPU usage is less than the CPU alarm clearance threshold, this alarm is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.348.2.7.2"] = [
    name: "hwVMCPUUsageResume",
    fields: ["hwVMName", "hwVMCPUUsageValue", "hwVMCPUUsageThreshold"],
    fieldOids: ["hwVMName": "1.3.6.1.4.1.2011.5.25.348.1.5.1.1", "hwVMCPUUsageValue": "1.3.6.1.4.1.2011.5.25.348.1.5.1.6", "hwVMCPUUsageThreshold": "1.3.6.1.4.1.2011.5.25.348.1.5.1.7"]
]

// --- hwVMDiskInvalid (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.348.2.8.1
// Fields: hwVMName
// Description: This object indicates that an alarm is generated when a VM disk fails.
trapMap["1.3.6.1.4.1.2011.5.25.348.2.8.1"] = [
    name: "hwVMDiskInvalid",
    fields: ["hwVMName"],
    fieldOids: ["hwVMName": "1.3.6.1.4.1.2011.5.25.348.1.5.1.1"]
]

// --- hwVMDiskInvalidResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.348.2.8.2
// Fields: hwVMName
// Description: This object indicates that an alarm is cleared when a VM disk fault is rectified.
trapMap["1.3.6.1.4.1.2011.5.25.348.2.8.2"] = [
    name: "hwVMDiskInvalidResume",
    fields: ["hwVMName"],
    fieldOids: ["hwVMName": "1.3.6.1.4.1.2011.5.25.348.1.5.1.1"]
]

// --- hwVMDiskPartitionInValid (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.348.2.8.3
// Fields: hwVMName, hwVMPartitionName
// Description: An alarm was generated when a disk partition was unavailable.
trapMap["1.3.6.1.4.1.2011.5.25.348.2.8.3"] = [
    name: "hwVMDiskPartitionInValid",
    fields: ["hwVMName", "hwVMPartitionName"],
    fieldOids: ["hwVMName": "1.3.6.1.4.1.2011.5.25.348.1.5.1.1", "hwVMPartitionName": "1.3.6.1.4.1.2011.5.25.348.1.10.1.1"]
]

// --- hwVMDiskPartitionInValidResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.348.2.8.4
// Fields: hwVMName, hwVMPartitionName
// Description: The alarm was cleared when the disk partition became available.
trapMap["1.3.6.1.4.1.2011.5.25.348.2.8.4"] = [
    name: "hwVMDiskPartitionInValidResume",
    fields: ["hwVMName", "hwVMPartitionName"],
    fieldOids: ["hwVMName": "1.3.6.1.4.1.2011.5.25.348.1.5.1.1", "hwVMPartitionName": "1.3.6.1.4.1.2011.5.25.348.1.10.1.1"]
]

// --- hwVMDiskPartitionSpacinsufficient (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.348.2.8.5
// Fields: hwVMName, hwVMPartitionName, hwVMPartitionSpaceFree, hwVMPartitionSpaceFreeThreshold
// Description: An alarm was generated when the disk partition's(except the log partition) available space was below the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.348.2.8.5"] = [
    name: "hwVMDiskPartitionSpacinsufficient",
    fields: ["hwVMName", "hwVMPartitionName", "hwVMPartitionSpaceFree", "hwVMPartitionSpaceFreeThreshold"],
    fieldOids: ["hwVMName": "1.3.6.1.4.1.2011.5.25.348.1.5.1.1", "hwVMPartitionName": "1.3.6.1.4.1.2011.5.25.348.1.10.1.1", "hwVMPartitionSpaceFree": "1.3.6.1.4.1.2011.5.25.348.1.10.1.2", "hwVMPartitionSpaceFreeThreshold": "1.3.6.1.4.1.2011.5.25.348.1.10.1.3"]
]

// --- hwVMDiskPartitionSpacinsufficientResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.348.2.8.6
// Fields: hwVMName, hwVMPartitionName, hwVMPartitionSpaceFree, hwVMPartitionSpaceFreeThreshold
// Description: The alarm was cleared when the disk partition's(except the log partition) available space was above the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.348.2.8.6"] = [
    name: "hwVMDiskPartitionSpacinsufficientResume",
    fields: ["hwVMName", "hwVMPartitionName", "hwVMPartitionSpaceFree", "hwVMPartitionSpaceFreeThreshold"],
    fieldOids: ["hwVMName": "1.3.6.1.4.1.2011.5.25.348.1.5.1.1", "hwVMPartitionName": "1.3.6.1.4.1.2011.5.25.348.1.10.1.1", "hwVMPartitionSpaceFree": "1.3.6.1.4.1.2011.5.25.348.1.10.1.2", "hwVMPartitionSpaceFreeThreshold": "1.3.6.1.4.1.2011.5.25.348.1.10.1.3"]
]

// --- hwVMDiskPartitionUseageRising (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.348.2.8.7
// Fields: hwVMName, hwVMPartitionName, hwVMPartitionUseage, hwVMPartitionUseageThreshold
// Description: When the disk partition usage(except the log partition) is greater than the specified overload threshold within a statistical period, the alarm is reported.
trapMap["1.3.6.1.4.1.2011.5.25.348.2.8.7"] = [
    name: "hwVMDiskPartitionUseageRising",
    fields: ["hwVMName", "hwVMPartitionName", "hwVMPartitionUseage", "hwVMPartitionUseageThreshold"],
    fieldOids: ["hwVMName": "1.3.6.1.4.1.2011.5.25.348.1.5.1.1", "hwVMPartitionName": "1.3.6.1.4.1.2011.5.25.348.1.10.1.1", "hwVMPartitionUseage": "1.3.6.1.4.1.2011.5.25.348.1.10.1.4", "hwVMPartitionUseageThreshold": "1.3.6.1.4.1.2011.5.25.348.1.10.1.5"]
]

// --- hwVMDiskPartitionUseageResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.348.2.8.8
// Fields: hwVMName, hwVMPartitionName, hwVMPartitionUseage, hwVMPartitionUseageThreshold
// Description: When the disk partition usage(except the log partition) fell and remained below 10% of the specified overload threshold within a statistical period, the alarm is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.348.2.8.8"] = [
    name: "hwVMDiskPartitionUseageResume",
    fields: ["hwVMName", "hwVMPartitionName", "hwVMPartitionUseage", "hwVMPartitionUseageThreshold"],
    fieldOids: ["hwVMName": "1.3.6.1.4.1.2011.5.25.348.1.5.1.1", "hwVMPartitionName": "1.3.6.1.4.1.2011.5.25.348.1.10.1.1", "hwVMPartitionUseage": "1.3.6.1.4.1.2011.5.25.348.1.10.1.4", "hwVMPartitionUseageThreshold": "1.3.6.1.4.1.2011.5.25.348.1.10.1.5"]
]

// --- hwFileIntegrityError (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.348.2.9.1
// Fields: hwVMName
// Description: Executable files are incomplete.
trapMap["1.3.6.1.4.1.2011.5.25.348.2.9.1"] = [
    name: "hwFileIntegrityError",
    fields: ["hwVMName"],
    fieldOids: ["hwVMName": "1.3.6.1.4.1.2011.5.25.348.1.5.1.1"]
]

// --- hwFileIntegrityErrorResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.348.2.9.2
// Fields: hwVMName
// Description: The file check success.
trapMap["1.3.6.1.4.1.2011.5.25.348.2.9.2"] = [
    name: "hwFileIntegrityErrorResume",
    fields: ["hwVMName"],
    fieldOids: ["hwVMName": "1.3.6.1.4.1.2011.5.25.348.1.5.1.1"]
]

// --- hwSoftwareIntegrityError (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.348.2.10.1
// Fields: hwSoftwarePackageVNFCType, hwSoftwarePackageAppType, hwSoftwarePackageVersionType, hwSoftwarePackageVersionId
// Description: The software check failed.
trapMap["1.3.6.1.4.1.2011.5.25.348.2.10.1"] = [
    name: "hwSoftwareIntegrityError",
    fields: ["hwSoftwarePackageVNFCType", "hwSoftwarePackageAppType", "hwSoftwarePackageVersionType", "hwSoftwarePackageVersionId"],
    fieldOids: ["hwSoftwarePackageVNFCType": "1.3.6.1.4.1.2011.5.25.348.1.9.1.1", "hwSoftwarePackageAppType": "1.3.6.1.4.1.2011.5.25.348.1.9.1.2", "hwSoftwarePackageVersionType": "1.3.6.1.4.1.2011.5.25.348.1.9.1.3", "hwSoftwarePackageVersionId": "1.3.6.1.4.1.2011.5.25.348.1.9.1.4"]
]

// --- hwSoftwareIntegrityErrorResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.348.2.10.2
// Fields: hwSoftwarePackageVNFCType, hwSoftwarePackageAppType, hwSoftwarePackageVersionType, hwSoftwarePackageVersionId
// Description: The software check success.
trapMap["1.3.6.1.4.1.2011.5.25.348.2.10.2"] = [
    name: "hwSoftwareIntegrityErrorResume",
    fields: ["hwSoftwarePackageVNFCType", "hwSoftwarePackageAppType", "hwSoftwarePackageVersionType", "hwSoftwarePackageVersionId"],
    fieldOids: ["hwSoftwarePackageVNFCType": "1.3.6.1.4.1.2011.5.25.348.1.9.1.1", "hwSoftwarePackageAppType": "1.3.6.1.4.1.2011.5.25.348.1.9.1.2", "hwSoftwarePackageVersionType": "1.3.6.1.4.1.2011.5.25.348.1.9.1.3", "hwSoftwarePackageVersionId": "1.3.6.1.4.1.2011.5.25.348.1.9.1.4"]
]

// --- hwPatchInstallFailVm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.348.2.11.1
// Fields: hwVMName, hwPatchInstallFileName, hwPatchInstallVersion, hwPatchInstallFailReason
// Description: The patch package install fail notification.
trapMap["1.3.6.1.4.1.2011.5.25.348.2.11.1"] = [
    name: "hwPatchInstallFailVm",
    fields: ["hwVMName", "hwPatchInstallFileName", "hwPatchInstallVersion", "hwPatchInstallFailReason"],
    fieldOids: ["hwVMName": "1.3.6.1.4.1.2011.5.25.348.1.5.1.1", "hwPatchInstallFileName": "1.3.6.1.4.1.2011.5.25.19.1.29.1", "hwPatchInstallVersion": "1.3.6.1.4.1.2011.5.25.19.1.29.2", "hwPatchInstallFailReason": "1.3.6.1.4.1.2011.5.25.19.1.29.3"]
]

// --- hwPatchInstallFailVmClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.348.2.11.2
// Fields: hwVMName, hwPatchInstallFileName, hwPatchInstallVersion, hwPatchInstallFailReason
// Description: The patch package install fail clear notification.
trapMap["1.3.6.1.4.1.2011.5.25.348.2.11.2"] = [
    name: "hwPatchInstallFailVmClear",
    fields: ["hwVMName", "hwPatchInstallFileName", "hwPatchInstallVersion", "hwPatchInstallFailReason"],
    fieldOids: ["hwVMName": "1.3.6.1.4.1.2011.5.25.348.1.5.1.1", "hwPatchInstallFileName": "1.3.6.1.4.1.2011.5.25.19.1.29.1", "hwPatchInstallVersion": "1.3.6.1.4.1.2011.5.25.19.1.29.2", "hwPatchInstallFailReason": "1.3.6.1.4.1.2011.5.25.19.1.29.3"]
]

// --- hwBaseLinkSubHealthy (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.348.2.12.1
// Fields: hwBaseLinkVMName, hwBaseLinkRemoteVMName, hwBaseLinkPlaneID, hwBaseLinkQuality
// Description: The base plane link subhealth value was larger than the threshold, Base plane goes subhealth. The problem may cause a high packet loss rate.
trapMap["1.3.6.1.4.1.2011.5.25.348.2.12.1"] = [
    name: "hwBaseLinkSubHealthy",
    fields: ["hwBaseLinkVMName", "hwBaseLinkRemoteVMName", "hwBaseLinkPlaneID", "hwBaseLinkQuality"],
    fieldOids: ["hwBaseLinkVMName": "1.3.6.1.4.1.2011.5.25.348.1.7.1.1", "hwBaseLinkRemoteVMName": "1.3.6.1.4.1.2011.5.25.348.1.7.1.2", "hwBaseLinkPlaneID": "1.3.6.1.4.1.2011.5.25.348.1.7.1.3", "hwBaseLinkQuality": "1.3.6.1.4.1.2011.5.25.348.1.7.1.4"]
]

// --- hwBaseLinkSubHealthyResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.348.2.12.2
// Fields: hwBaseLinkVMName, hwBaseLinkRemoteVMName, hwBaseLinkPlaneID, hwBaseLinkQuality
// Description: The base plane link subhealth value was lower than the threshold. Base plane goes health.
trapMap["1.3.6.1.4.1.2011.5.25.348.2.12.2"] = [
    name: "hwBaseLinkSubHealthyResume",
    fields: ["hwBaseLinkVMName", "hwBaseLinkRemoteVMName", "hwBaseLinkPlaneID", "hwBaseLinkQuality"],
    fieldOids: ["hwBaseLinkVMName": "1.3.6.1.4.1.2011.5.25.348.1.7.1.1", "hwBaseLinkRemoteVMName": "1.3.6.1.4.1.2011.5.25.348.1.7.1.2", "hwBaseLinkPlaneID": "1.3.6.1.4.1.2011.5.25.348.1.7.1.3", "hwBaseLinkQuality": "1.3.6.1.4.1.2011.5.25.348.1.7.1.4"]
]

// --- hwRUCreateFailAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.348.2.13.1
// Fields: hwVMName, hwVNFCName, hwRUName, hwRUCreateFaultReason
// Description: The VM create RU failed. And the RU can not work normal.
trapMap["1.3.6.1.4.1.2011.5.25.348.2.13.1"] = [
    name: "hwRUCreateFailAlarm",
    fields: ["hwVMName", "hwVNFCName", "hwRUName", "hwRUCreateFaultReason"],
    fieldOids: ["hwVMName": "1.3.6.1.4.1.2011.5.25.348.1.5.1.1", "hwVNFCName": "1.3.6.1.4.1.2011.5.25.348.1.4.1.1", "hwRUName": "1.3.6.1.4.1.2011.5.25.348.1.8.1", "hwRUCreateFaultReason": "1.3.6.1.4.1.2011.5.25.348.1.8.2"]
]

// --- hwRUCreateFailResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.348.2.13.2
// Fields: hwVMName, hwVNFCName, hwRUName, hwRUCreateFaultReason
// Description: The VM has created the RU.
trapMap["1.3.6.1.4.1.2011.5.25.348.2.13.2"] = [
    name: "hwRUCreateFailResume",
    fields: ["hwVMName", "hwVNFCName", "hwRUName", "hwRUCreateFaultReason"],
    fieldOids: ["hwVMName": "1.3.6.1.4.1.2011.5.25.348.1.5.1.1", "hwVNFCName": "1.3.6.1.4.1.2011.5.25.348.1.4.1.1", "hwRUName": "1.3.6.1.4.1.2011.5.25.348.1.8.1", "hwRUCreateFaultReason": "1.3.6.1.4.1.2011.5.25.348.1.8.2"]
]

// --- hwRUDiskUnavailable (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.348.2.14.1
// Fields: hwRUName
// Description: A fault occurs on the RU disk.
trapMap["1.3.6.1.4.1.2011.5.25.348.2.14.1"] = [
    name: "hwRUDiskUnavailable",
    fields: ["hwRUName"],
    fieldOids: ["hwRUName": "1.3.6.1.4.1.2011.5.25.348.1.8.1"]
]

// --- hwRUDiskUnavailableResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.348.2.14.2
// Fields: hwRUName
// Description: The fault on the RU disk is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.348.2.14.2"] = [
    name: "hwRUDiskUnavailableResume",
    fields: ["hwRUName"],
    fieldOids: ["hwRUName": "1.3.6.1.4.1.2011.5.25.348.1.8.1"]
]

// --- hwRUExecutableFilesIncomplete (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.348.2.15.1
// Fields: hwRUName
// Description: The file check failed.
trapMap["1.3.6.1.4.1.2011.5.25.348.2.15.1"] = [
    name: "hwRUExecutableFilesIncomplete",
    fields: ["hwRUName"],
    fieldOids: ["hwRUName": "1.3.6.1.4.1.2011.5.25.348.1.8.1"]
]

// --- hwRUExecutableFilesIncompleteResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.348.2.15.2
// Fields: hwRUName
// Description: The file check success.
trapMap["1.3.6.1.4.1.2011.5.25.348.2.15.2"] = [
    name: "hwRUExecutableFilesIncompleteResume",
    fields: ["hwRUName"],
    fieldOids: ["hwRUName": "1.3.6.1.4.1.2011.5.25.348.1.8.1"]
]

// --- hwRUDiskPartitionUnavailable (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.348.2.16.1
// Fields: hwResourceUnitName, hwRUPartitionName
// Description: The RU's disk partition was unavailable.
trapMap["1.3.6.1.4.1.2011.5.25.348.2.16.1"] = [
    name: "hwRUDiskPartitionUnavailable",
    fields: ["hwResourceUnitName", "hwRUPartitionName"],
    fieldOids: ["hwResourceUnitName": "1.3.6.1.4.1.2011.5.25.348.1.14.1.1", "hwRUPartitionName": "1.3.6.1.4.1.2011.5.25.348.1.14.1.2"]
]

// --- hwRUDiskPartitionUnavailableResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.348.2.16.2
// Fields: hwResourceUnitName, hwRUPartitionName
// Description: The fault where the RU's disk partition was unavailable was rectified.
trapMap["1.3.6.1.4.1.2011.5.25.348.2.16.2"] = [
    name: "hwRUDiskPartitionUnavailableResume",
    fields: ["hwResourceUnitName", "hwRUPartitionName"],
    fieldOids: ["hwResourceUnitName": "1.3.6.1.4.1.2011.5.25.348.1.14.1.1", "hwRUPartitionName": "1.3.6.1.4.1.2011.5.25.348.1.14.1.2"]
]

// --- hwRUDiskPartitionSpaceInsufficient (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.348.2.17.1
// Fields: hwResourceUnitName, hwRUPartitionName, hwRUPartitionAvailableSpace, hwRUPartitionCapacityThreshold
// Description: The disk partition's available space of the RU was less than the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.348.2.17.1"] = [
    name: "hwRUDiskPartitionSpaceInsufficient",
    fields: ["hwResourceUnitName", "hwRUPartitionName", "hwRUPartitionAvailableSpace", "hwRUPartitionCapacityThreshold"],
    fieldOids: ["hwResourceUnitName": "1.3.6.1.4.1.2011.5.25.348.1.14.1.1", "hwRUPartitionName": "1.3.6.1.4.1.2011.5.25.348.1.14.1.2", "hwRUPartitionAvailableSpace": "1.3.6.1.4.1.2011.5.25.348.1.14.1.5", "hwRUPartitionCapacityThreshold": "1.3.6.1.4.1.2011.5.25.348.1.14.1.6"]
]

// --- hwRUDiskPartitionSpaceInsufficientResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.348.2.17.2
// Fields: hwResourceUnitName, hwRUPartitionName, hwRUPartitionAvailableSpace, hwRUPartitionCapacityThreshold
// Description: The disk partition's available space of the RU was more than the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.348.2.17.2"] = [
    name: "hwRUDiskPartitionSpaceInsufficientResume",
    fields: ["hwResourceUnitName", "hwRUPartitionName", "hwRUPartitionAvailableSpace", "hwRUPartitionCapacityThreshold"],
    fieldOids: ["hwResourceUnitName": "1.3.6.1.4.1.2011.5.25.348.1.14.1.1", "hwRUPartitionName": "1.3.6.1.4.1.2011.5.25.348.1.14.1.2", "hwRUPartitionAvailableSpace": "1.3.6.1.4.1.2011.5.25.348.1.14.1.5", "hwRUPartitionCapacityThreshold": "1.3.6.1.4.1.2011.5.25.348.1.14.1.6"]
]

// --- hwRUFault (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.348.2.18.1
// Fields: hwRUId, hwRUName
// Description: The ru fails.
trapMap["1.3.6.1.4.1.2011.5.25.348.2.18.1"] = [
    name: "hwRUFault",
    fields: ["hwRUId", "hwRUName"],
    fieldOids: ["hwRUId": "1.3.6.1.4.1.2011.5.25.348.1.8.4", "hwRUName": "1.3.6.1.4.1.2011.5.25.348.1.8.1"]
]

// --- hwRUFaultResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.348.2.18.2
// Fields: hwRUId, hwRUName
// Description: The ru recovers.
trapMap["1.3.6.1.4.1.2011.5.25.348.2.18.2"] = [
    name: "hwRUFaultResume",
    fields: ["hwRUId", "hwRUName"],
    fieldOids: ["hwRUId": "1.3.6.1.4.1.2011.5.25.348.1.8.4", "hwRUName": "1.3.6.1.4.1.2011.5.25.348.1.8.1"]
]

// --- hwRUDiskThresholdExceed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.348.2.19.1
// Fields: hwResourceUnitName, hwRUPartitionName, hwRUPartitionUsage, hwRUPartitionOverloadThreshold
// Description: The disk usage exceeded the pre-set overload threshold.
trapMap["1.3.6.1.4.1.2011.5.25.348.2.19.1"] = [
    name: "hwRUDiskThresholdExceed",
    fields: ["hwResourceUnitName", "hwRUPartitionName", "hwRUPartitionUsage", "hwRUPartitionOverloadThreshold"],
    fieldOids: ["hwResourceUnitName": "1.3.6.1.4.1.2011.5.25.348.1.14.1.1", "hwRUPartitionName": "1.3.6.1.4.1.2011.5.25.348.1.14.1.2", "hwRUPartitionUsage": "1.3.6.1.4.1.2011.5.25.348.1.14.1.3", "hwRUPartitionOverloadThreshold": "1.3.6.1.4.1.2011.5.25.348.1.14.1.4"]
]

// --- hwRUDiskThresholdExceedResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.348.2.19.2
// Fields: hwResourceUnitName, hwRUPartitionName
// Description: The disk partition usage of the RU is lower than the alarm clearance threshold of the current level or higher than the alarm generation threshold of a higher level, or the alarm detection switch is ch...
trapMap["1.3.6.1.4.1.2011.5.25.348.2.19.2"] = [
    name: "hwRUDiskThresholdExceedResume",
    fields: ["hwResourceUnitName", "hwRUPartitionName"],
    fieldOids: ["hwResourceUnitName": "1.3.6.1.4.1.2011.5.25.348.1.14.1.1", "hwRUPartitionName": "1.3.6.1.4.1.2011.5.25.348.1.14.1.2"]
]

// --- hwRUGroupFault (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.348.2.20.1
// Fields: hwRUGroupName, hwRUGroupFaultReason
// Description: The resource unit group is abnormal.
trapMap["1.3.6.1.4.1.2011.5.25.348.2.20.1"] = [
    name: "hwRUGroupFault",
    fields: ["hwRUGroupName", "hwRUGroupFaultReason"],
    fieldOids: ["hwRUGroupName": "1.3.6.1.4.1.2011.5.25.348.1.15.1.1", "hwRUGroupFaultReason": "1.3.6.1.4.1.2011.5.25.348.1.15.1.2"]
]

// --- hwRUGroupFaultResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.348.2.20.2
// Fields: hwRUGroupName, hwRUGroupFaultReason
// Description: The resource unit group returns to normal.
trapMap["1.3.6.1.4.1.2011.5.25.348.2.20.2"] = [
    name: "hwRUGroupFaultResume",
    fields: ["hwRUGroupName", "hwRUGroupFaultReason"],
    fieldOids: ["hwRUGroupName": "1.3.6.1.4.1.2011.5.25.348.1.15.1.1", "hwRUGroupFaultReason": "1.3.6.1.4.1.2011.5.25.348.1.15.1.2"]
]

// --- hwResourceProcessFault (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.348.2.21.1
// Fields: hwVNFProcessId, hwPhyVMID, hwVMName, hwVNFProcessName, hwVNFProcessFaultReason
// Description: The RU's process fails.
trapMap["1.3.6.1.4.1.2011.5.25.348.2.21.1"] = [
    name: "hwResourceProcessFault",
    fields: ["hwVNFProcessId", "hwPhyVMID", "hwVMName", "hwVNFProcessName", "hwVNFProcessFaultReason"],
    fieldOids: ["hwVNFProcessId": "1.3.6.1.4.1.2011.5.25.348.1.11.1.1", "hwPhyVMID": "1.3.6.1.4.1.2011.5.25.348.1.5.1.3", "hwVMName": "1.3.6.1.4.1.2011.5.25.348.1.5.1.1", "hwVNFProcessName": "1.3.6.1.4.1.2011.5.25.348.1.11.1.2", "hwVNFProcessFaultReason": "1.3.6.1.4.1.2011.5.25.348.1.11.1.3"]
]

// --- hwResourceProcessFaultResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.348.2.21.2
// Fields: hwVNFProcessId, hwPhyVMID, hwVMName, hwVNFProcessName, hwVNFProcessFaultReason
// Description: The RU's process recovers.
trapMap["1.3.6.1.4.1.2011.5.25.348.2.21.2"] = [
    name: "hwResourceProcessFaultResume",
    fields: ["hwVNFProcessId", "hwPhyVMID", "hwVMName", "hwVNFProcessName", "hwVNFProcessFaultReason"],
    fieldOids: ["hwVNFProcessId": "1.3.6.1.4.1.2011.5.25.348.1.11.1.1", "hwPhyVMID": "1.3.6.1.4.1.2011.5.25.348.1.5.1.3", "hwVMName": "1.3.6.1.4.1.2011.5.25.348.1.5.1.1", "hwVNFProcessName": "1.3.6.1.4.1.2011.5.25.348.1.11.1.2", "hwVNFProcessFaultReason": "1.3.6.1.4.1.2011.5.25.348.1.11.1.3"]
]

// --- hwELECTClusterFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.348.2.22.1
// Fields: hwServiceClusterName
// Description: Elect service cluster is fault.
trapMap["1.3.6.1.4.1.2011.5.25.348.2.22.1"] = [
    name: "hwELECTClusterFail",
    fields: ["hwServiceClusterName"],
    fieldOids: ["hwServiceClusterName": "1.3.6.1.4.1.2011.5.25.348.1.8.5"]
]

// --- hwELECTClusterFailResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.348.2.22.2
// Fields: hwServiceClusterName
// Description: Elect service cluster become normal.
trapMap["1.3.6.1.4.1.2011.5.25.348.2.22.2"] = [
    name: "hwELECTClusterFailResume",
    fields: ["hwServiceClusterName"],
    fieldOids: ["hwServiceClusterName": "1.3.6.1.4.1.2011.5.25.348.1.8.5"]
]

// --- hwELECTMemberFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.348.2.23.1
// Fields: hwClusterMemberName, hwVMName, hwServiceClusterName
// Description: An elect service member is fault.
trapMap["1.3.6.1.4.1.2011.5.25.348.2.23.1"] = [
    name: "hwELECTMemberFail",
    fields: ["hwClusterMemberName", "hwVMName", "hwServiceClusterName"],
    fieldOids: ["hwClusterMemberName": "1.3.6.1.4.1.2011.5.25.348.1.12.1.1", "hwVMName": "1.3.6.1.4.1.2011.5.25.348.1.5.1.1", "hwServiceClusterName": "1.3.6.1.4.1.2011.5.25.348.1.8.5"]
]

// --- hwELECTMemberFailResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.348.2.23.2
// Fields: hwClusterMemberName, hwVMName, hwServiceClusterName
// Description: An elect service member become normal.
trapMap["1.3.6.1.4.1.2011.5.25.348.2.23.2"] = [
    name: "hwELECTMemberFailResume",
    fields: ["hwClusterMemberName", "hwVMName", "hwServiceClusterName"],
    fieldOids: ["hwClusterMemberName": "1.3.6.1.4.1.2011.5.25.348.1.12.1.1", "hwVMName": "1.3.6.1.4.1.2011.5.25.348.1.5.1.1", "hwServiceClusterName": "1.3.6.1.4.1.2011.5.25.348.1.8.5"]
]

// --- hwBasePhyLinkSubHealthy (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.348.2.24.1
// Fields: hwBasePhyLinkVMName, hwBasePhyLinkRemoteVMName, hwBasePlaneId, hwChannelId, hwQuality
// Description: The link of base plane subhealth value was larger than the threshold. Link of Base-Plane goes subhealth.
trapMap["1.3.6.1.4.1.2011.5.25.348.2.24.1"] = [
    name: "hwBasePhyLinkSubHealthy",
    fields: ["hwBasePhyLinkVMName", "hwBasePhyLinkRemoteVMName", "hwBasePlaneId", "hwChannelId", "hwQuality"],
    fieldOids: ["hwBasePhyLinkVMName": "1.3.6.1.4.1.2011.5.25.348.1.13.1.1", "hwBasePhyLinkRemoteVMName": "1.3.6.1.4.1.2011.5.25.348.1.13.1.2", "hwBasePlaneId": "1.3.6.1.4.1.2011.5.25.348.1.13.1.3", "hwChannelId": "1.3.6.1.4.1.2011.5.25.348.1.13.1.4", "hwQuality": "1.3.6.1.4.1.2011.5.25.348.1.13.1.5"]
]

// --- hwBasePhyLinkSubHealthyResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.348.2.24.2
// Fields: hwBasePhyLinkVMName, hwBasePhyLinkRemoteVMName, hwBasePlaneId, hwChannelId, hwQuality
// Description: The link of base plane subhealth value was lower than the threshold. Link of Base-Plane goes health.
trapMap["1.3.6.1.4.1.2011.5.25.348.2.24.2"] = [
    name: "hwBasePhyLinkSubHealthyResume",
    fields: ["hwBasePhyLinkVMName", "hwBasePhyLinkRemoteVMName", "hwBasePlaneId", "hwChannelId", "hwQuality"],
    fieldOids: ["hwBasePhyLinkVMName": "1.3.6.1.4.1.2011.5.25.348.1.13.1.1", "hwBasePhyLinkRemoteVMName": "1.3.6.1.4.1.2011.5.25.348.1.13.1.2", "hwBasePlaneId": "1.3.6.1.4.1.2011.5.25.348.1.13.1.3", "hwChannelId": "1.3.6.1.4.1.2011.5.25.348.1.13.1.4", "hwQuality": "1.3.6.1.4.1.2011.5.25.348.1.13.1.5"]
]

// --- hwSoftwareInReposIntegrityFailed (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.348.2.25.1
// Fields: hwSoftwarePackageVNFCType, hwSoftwarePackageType, hwSoftwarePackageVersionType, hwSoftwarePackageAppType, hwSoftwarePackageVersionId
// Description: The integrity of the software package in the software repository is faulty.
trapMap["1.3.6.1.4.1.2011.5.25.348.2.25.1"] = [
    name: "hwSoftwareInReposIntegrityFailed",
    fields: ["hwSoftwarePackageVNFCType", "hwSoftwarePackageType", "hwSoftwarePackageVersionType", "hwSoftwarePackageAppType", "hwSoftwarePackageVersionId"],
    fieldOids: ["hwSoftwarePackageVNFCType": "1.3.6.1.4.1.2011.5.25.348.1.9.1.1", "hwSoftwarePackageType": "1.3.6.1.4.1.2011.5.25.348.1.8.3", "hwSoftwarePackageVersionType": "1.3.6.1.4.1.2011.5.25.348.1.9.1.3", "hwSoftwarePackageAppType": "1.3.6.1.4.1.2011.5.25.348.1.9.1.2", "hwSoftwarePackageVersionId": "1.3.6.1.4.1.2011.5.25.348.1.9.1.4"]
]

// --- hwSoftwareInReposIntegrityResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.348.2.25.2
// Fields: hwSoftwarePackageVNFCType, hwSoftwarePackageType, hwSoftwarePackageVersionType, hwSoftwarePackageAppType, hwSoftwarePackageVersionId
// Description: The software package integrity failure in the software repository is recovered.
trapMap["1.3.6.1.4.1.2011.5.25.348.2.25.2"] = [
    name: "hwSoftwareInReposIntegrityResume",
    fields: ["hwSoftwarePackageVNFCType", "hwSoftwarePackageType", "hwSoftwarePackageVersionType", "hwSoftwarePackageAppType", "hwSoftwarePackageVersionId"],
    fieldOids: ["hwSoftwarePackageVNFCType": "1.3.6.1.4.1.2011.5.25.348.1.9.1.1", "hwSoftwarePackageType": "1.3.6.1.4.1.2011.5.25.348.1.8.3", "hwSoftwarePackageVersionType": "1.3.6.1.4.1.2011.5.25.348.1.9.1.3", "hwSoftwarePackageAppType": "1.3.6.1.4.1.2011.5.25.348.1.9.1.2", "hwSoftwarePackageVersionId": "1.3.6.1.4.1.2011.5.25.348.1.9.1.4"]
]

// --- hwPatchInstallFailRu (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.348.2.26.1
// Fields: hwRUName, hwPatchInstallFileName, hwPatchInstallVersion, hwPatchInstallFailReason
// Description: RU patch package installation failed.
trapMap["1.3.6.1.4.1.2011.5.25.348.2.26.1"] = [
    name: "hwPatchInstallFailRu",
    fields: ["hwRUName", "hwPatchInstallFileName", "hwPatchInstallVersion", "hwPatchInstallFailReason"],
    fieldOids: ["hwRUName": "1.3.6.1.4.1.2011.5.25.348.1.8.1", "hwPatchInstallFileName": "1.3.6.1.4.1.2011.5.25.19.1.29.1", "hwPatchInstallVersion": "1.3.6.1.4.1.2011.5.25.19.1.29.2", "hwPatchInstallFailReason": "1.3.6.1.4.1.2011.5.25.19.1.29.3"]
]

// --- hwPatchInstallFailRuClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.348.2.26.2
// Fields: hwRUName, hwPatchInstallFileName, hwPatchInstallVersion, hwPatchInstallFailReason
// Description: The RU patch-installation failure alarm is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.348.2.26.2"] = [
    name: "hwPatchInstallFailRuClear",
    fields: ["hwRUName", "hwPatchInstallFileName", "hwPatchInstallVersion", "hwPatchInstallFailReason"],
    fieldOids: ["hwRUName": "1.3.6.1.4.1.2011.5.25.348.1.8.1", "hwPatchInstallFileName": "1.3.6.1.4.1.2011.5.25.19.1.29.1", "hwPatchInstallVersion": "1.3.6.1.4.1.2011.5.25.19.1.29.2", "hwPatchInstallFailReason": "1.3.6.1.4.1.2011.5.25.19.1.29.3"]
]

// --- hwProcessFault (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.348.2.27.1
// Fields: hwRUId, hwRUName, hwVNFProcessId, hwVNFProcessName, hwVNFProcessFaultReasonStr
// Description: The process fails.
trapMap["1.3.6.1.4.1.2011.5.25.348.2.27.1"] = [
    name: "hwProcessFault",
    fields: ["hwRUId", "hwRUName", "hwVNFProcessId", "hwVNFProcessName", "hwVNFProcessFaultReasonStr"],
    fieldOids: ["hwRUId": "1.3.6.1.4.1.2011.5.25.348.1.8.4", "hwRUName": "1.3.6.1.4.1.2011.5.25.348.1.8.1", "hwVNFProcessId": "1.3.6.1.4.1.2011.5.25.348.1.11.1.1", "hwVNFProcessName": "1.3.6.1.4.1.2011.5.25.348.1.11.1.2", "hwVNFProcessFaultReasonStr": "1.3.6.1.4.1.2011.5.25.348.1.11.1.4"]
]

// --- hwProcessFaultResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.348.2.27.2
// Fields: hwRUId, hwRUName, hwVNFProcessId, hwVNFProcessName, hwVNFProcessFaultReasonStr
// Description: The process recovers.
trapMap["1.3.6.1.4.1.2011.5.25.348.2.27.2"] = [
    name: "hwProcessFaultResume",
    fields: ["hwRUId", "hwRUName", "hwVNFProcessId", "hwVNFProcessName", "hwVNFProcessFaultReasonStr"],
    fieldOids: ["hwRUId": "1.3.6.1.4.1.2011.5.25.348.1.8.4", "hwRUName": "1.3.6.1.4.1.2011.5.25.348.1.8.1", "hwVNFProcessId": "1.3.6.1.4.1.2011.5.25.348.1.11.1.1", "hwVNFProcessName": "1.3.6.1.4.1.2011.5.25.348.1.11.1.2", "hwVNFProcessFaultReasonStr": "1.3.6.1.4.1.2011.5.25.348.1.11.1.4"]
]

// --- hwVMDiskUnavailable (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.348.2.28.1
// Fields: hwVMName
// Description: A fault occurs on the VM disk.
trapMap["1.3.6.1.4.1.2011.5.25.348.2.28.1"] = [
    name: "hwVMDiskUnavailable",
    fields: ["hwVMName"],
    fieldOids: ["hwVMName": "1.3.6.1.4.1.2011.5.25.348.1.5.1.1"]
]

// --- hwVMDiskUnavailableResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.348.2.28.2
// Fields: hwVMName
// Description: The fault on the VM disk is cleared.
trapMap["1.3.6.1.4.1.2011.5.25.348.2.28.2"] = [
    name: "hwVMDiskUnavailableResume",
    fields: ["hwVMName"],
    fieldOids: ["hwVMName": "1.3.6.1.4.1.2011.5.25.348.1.5.1.1"]
]

// --- hwDiskReadWriteRateAbnormal (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.348.2.29.1
// Fields: hwVMName
// Description: The disk read/write rate detected using the IOSTAT or DD command is lower the threshold
trapMap["1.3.6.1.4.1.2011.5.25.348.2.29.1"] = [
    name: "hwDiskReadWriteRateAbnormal",
    fields: ["hwVMName"],
    fieldOids: ["hwVMName": "1.3.6.1.4.1.2011.5.25.348.1.5.1.1"]
]

// --- hwDiskReadWriteRateAbnormalResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.348.2.29.2
// Fields: hwVMName
// Description: The disk read/write rate detected using the IOSTAT or DD command is higher than the threshold.
trapMap["1.3.6.1.4.1.2011.5.25.348.2.29.2"] = [
    name: "hwDiskReadWriteRateAbnormalResume",
    fields: ["hwVMName"],
    fieldOids: ["hwVMName": "1.3.6.1.4.1.2011.5.25.348.1.5.1.1"]
]

// --- hwRUMemoryDiskPartitionInsufficient (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.348.2.30.1
// Fields: hwRUName, hwRUMemPartitionName, hwRUAlarmType, hwRUMemPartitionUsage, hwRUMemPartitionOverloadThreshold
// Description: The alarm is generated when the usage of a memory partition becomes greater than a specified threshold.
trapMap["1.3.6.1.4.1.2011.5.25.348.2.30.1"] = [
    name: "hwRUMemoryDiskPartitionInsufficient",
    fields: ["hwRUName", "hwRUMemPartitionName", "hwRUAlarmType", "hwRUMemPartitionUsage", "hwRUMemPartitionOverloadThreshold"],
    fieldOids: ["hwRUName": "1.3.6.1.4.1.2011.5.25.348.1.8.1", "hwRUMemPartitionName": "1.3.6.1.4.1.2011.5.25.348.1.8.6", "hwRUAlarmType": "1.3.6.1.4.1.2011.5.25.348.1.8.7", "hwRUMemPartitionUsage": "1.3.6.1.4.1.2011.5.25.348.1.8.8", "hwRUMemPartitionOverloadThreshold": "1.3.6.1.4.1.2011.5.25.348.1.8.9"]
]

// --- hwRUMemoryDiskPartitionInsufficientResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.348.2.30.2
// Fields: hwRUName, hwRUMemPartitionName, hwRUAlarmType, hwRUMemPartitionUsage, hwRUMemPartitionOverloadThreshold
// Description: The alarm is cleared when the usage of a memory partition falls below 10% of a specified threshold.
trapMap["1.3.6.1.4.1.2011.5.25.348.2.30.2"] = [
    name: "hwRUMemoryDiskPartitionInsufficientResume",
    fields: ["hwRUName", "hwRUMemPartitionName", "hwRUAlarmType", "hwRUMemPartitionUsage", "hwRUMemPartitionOverloadThreshold"],
    fieldOids: ["hwRUName": "1.3.6.1.4.1.2011.5.25.348.1.8.1", "hwRUMemPartitionName": "1.3.6.1.4.1.2011.5.25.348.1.8.6", "hwRUAlarmType": "1.3.6.1.4.1.2011.5.25.348.1.8.7", "hwRUMemPartitionUsage": "1.3.6.1.4.1.2011.5.25.348.1.8.8", "hwRUMemPartitionOverloadThreshold": "1.3.6.1.4.1.2011.5.25.348.1.8.9"]
]

// --- hwPartitionNotRamDisk (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.348.2.31.1
// Fields: hwResourceUnitName, hwRUPartitionName
// Description: The alarm is generated because the board does not have a memory partition.
trapMap["1.3.6.1.4.1.2011.5.25.348.2.31.1"] = [
    name: "hwPartitionNotRamDisk",
    fields: ["hwResourceUnitName", "hwRUPartitionName"],
    fieldOids: ["hwResourceUnitName": "1.3.6.1.4.1.2011.5.25.348.1.14.1.1", "hwRUPartitionName": "1.3.6.1.4.1.2011.5.25.348.1.14.1.2"]
]

// --- hwVMMemoryDiskPartitionInsufficient (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.348.2.32.1
// Fields: hwVMName, hwVMMemPartitionName, hwVMAlarmType, hwVMMemPartitionUsage, hwVMMemPartitionOverloadThreshold
// Description: The alarm is generated when the usage of a memory disk partition, except a log partition, becomes greater than a specified threshold.
trapMap["1.3.6.1.4.1.2011.5.25.348.2.32.1"] = [
    name: "hwVMMemoryDiskPartitionInsufficient",
    fields: ["hwVMName", "hwVMMemPartitionName", "hwVMAlarmType", "hwVMMemPartitionUsage", "hwVMMemPartitionOverloadThreshold"],
    fieldOids: ["hwVMName": "1.3.6.1.4.1.2011.5.25.348.1.5.1.1", "hwVMMemPartitionName": "1.3.6.1.4.1.2011.5.25.348.1.8.10", "hwVMAlarmType": "1.3.6.1.4.1.2011.5.25.348.1.8.11", "hwVMMemPartitionUsage": "1.3.6.1.4.1.2011.5.25.348.1.8.12", "hwVMMemPartitionOverloadThreshold": "1.3.6.1.4.1.2011.5.25.348.1.8.13"]
]

// --- hwVMMemoryDiskPartitionInsufficientResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.348.2.32.2
// Fields: hwVMName, hwVMMemPartitionName, hwVMAlarmType, hwVMMemPartitionUsage, hwVMMemPartitionOverloadThreshold
// Description: The alarm is cleared when the usage of a memory disk partition falls below 10% of a specified threshold.
trapMap["1.3.6.1.4.1.2011.5.25.348.2.32.2"] = [
    name: "hwVMMemoryDiskPartitionInsufficientResume",
    fields: ["hwVMName", "hwVMMemPartitionName", "hwVMAlarmType", "hwVMMemPartitionUsage", "hwVMMemPartitionOverloadThreshold"],
    fieldOids: ["hwVMName": "1.3.6.1.4.1.2011.5.25.348.1.5.1.1", "hwVMMemPartitionName": "1.3.6.1.4.1.2011.5.25.348.1.8.10", "hwVMAlarmType": "1.3.6.1.4.1.2011.5.25.348.1.8.11", "hwVMMemPartitionUsage": "1.3.6.1.4.1.2011.5.25.348.1.8.12", "hwVMMemPartitionOverloadThreshold": "1.3.6.1.4.1.2011.5.25.348.1.8.13"]
]

// ===== Parsing logic =====

// Set to true to enable diagnostic logging for this MIB parser
DEBUG = false

LOG_PREFIX = "[HUAWEI-VNF-DEVICE-MIB]"
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
