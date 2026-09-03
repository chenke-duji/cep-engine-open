/**
 * Auto-generated from HUAWEI-DC-TRAP-MIB.mib
 * Generated: 2026-08-25T16:47:00.627595500
 * Traps/Notifications (127): hwMPUSynClkFaulty, hwMPUSynClkFaultyResume, hwSlaveMPUNoResp, hwSlaveMPUNoRespResume, hwBrdChannelFaulty, hwBrdChannelFaultyResume, hwBrdNofullin, hwBrdNofullinResume, hwBrdTypeNoMatchReset, hwBrdAutoSwtFail, hwBrdAutoSwt, hwBrdClkLockERR, hwBrdClkLockERRResume, hwBrdRemoved, hwBrdInserted, hwBrdUp, hwClkSrcMiss, hwClkAllSrcLost, hwClkAllSrcLostResume, hwClkFail, hwClkFailResume, hwClkNoHeartbeat, hwClkNoHeartbeatResume, hwLPULostSynAlarm, hwLPUOpenChannelError, hwLPUSlfTstErr, hwLPU3ClkSwitch, hwSFULostHrtReset, hwSFULinkLostReset, hwSFUChannelLinkLost, hwSFUInChannelOpenFail, hwVoltSensorFail, hwVoltSensorFailResume, hwVoltBtmC, hwVoltBtmCResume, hwVoltSprC, hwVoltSprCResume, hwVoltBtmM, hwVoltBtmMResume, hwVoltSprM, hwVoltSprMResume, hwTempSensorFail, hwTempSensorFailResume, hwTempMnr, hwTempMnrResume, hwTempMjr, hwTempMjrResume, hwTempCtl, hwTempCtlResume, hwFanHFail, hwFanFail, hwFanFailResume, hwFanAbsent, hwFanAbsentResume, hwFanCabUN, hwFanCabUNResume, hwPwrFail, hwPwrFailResume, hwPwrAbsent, hwPwrAbsentResume, hwPwrCabUN, hwPwrCabUNResume, hwLCDHFail, hwLCDFail, hwLCDAbsent, hwLCDAbsentResume, hwLCDCabUN, hwLCDCabUNResume, hwROMFail, hwMonitorBUSFail, hwMonitorBUSFailResume, hwBoardOfflineChange, hwWriteFlashError, hwBoardReset, hwBoardResetSuccess, hwSlaveMPUReset, hwMasterSlaveSwap, hwRTCFail, hwExchangeChipFail, hwTempResume, hwOpticalModuleInsert, hwOpticalModuleRemove, hwFPGAAbnormal, hwMinMTunnelDownAlarm, hwMinMTunnelUpAlarm, hwInterfacePhysicalDown, hwInterfacePhysicalUp, hwBTBStartupFileNameDifferent, hwBTBChassisRunningModeConflict, hwBTBCtrlChannelFail, hwBTBCtrlChannelFailResume, hwBTBDataChannelFail, hwBTBDataChannelFailResume, hwBTBClkChannelFail, hwBTBClkChannelFailResume, hwBTBSFUOpticInterfaceError, hwBTBSFUOpticInterfaceErrorResume, hwBTBVSRInterfaceInvalid, hwBTBVSRInterfaceInvalidResume, hwBTBSlaveChassisNoHeart, hwBTBNoSlaveChassis, hwBTBSlaveChassisRegisted, hwBTBSlaveChassisRegisteFail, hwBTBChassisTypeConflict, hwSuperChangeSuccesful, hwSuperChangeFailure, hwOpticaPowerAbnormal, hwEpldAbnormal, hwPhyChipAbnormal, hwSerdesAbnormal, hwBoardAbnormal, hwFeChannelAbnormal, hwParityCheckAbnormal, hwPhyClockAbnormal, hwPortAutoNegotiateFail, hwPortSemiduplex, hwScuStartModeSetFail, hwMemoryExhaust, hwMemoryExhaustClear, hwMethAbnormal, hwLpuNotTight, hwLicenseFail, hwHaBatchBegin, hwHaBatchEnd, hwHaSmoothBegin, hwHaSmoothEnd, hwFanUp
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

// --- hwMPUSynClkFaulty (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.1
// Fields: entPhysicalName
// Description: MPU sync clock signal faulty!
trapMap["1.3.6.1.4.1.2011.5.25.37.2.1"] = [
    name: "hwMPUSynClkFaulty",
    fields: ["entPhysicalName"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwMPUSynClkFaultyResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.2
// Fields: entPhysicalName
// Description: MPU sync clock signal faulty resume!
trapMap["1.3.6.1.4.1.2011.5.25.37.2.2"] = [
    name: "hwMPUSynClkFaultyResume",
    fields: ["entPhysicalName"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwSlaveMPUNoResp (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.3
// Fields: entPhysicalName
// Description: Slave MPU has no response!
trapMap["1.3.6.1.4.1.2011.5.25.37.2.3"] = [
    name: "hwSlaveMPUNoResp",
    fields: ["entPhysicalName"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwSlaveMPUNoRespResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.4
// Fields: entPhysicalName
// Description: Slave MPU has no response resume!
trapMap["1.3.6.1.4.1.2011.5.25.37.2.4"] = [
    name: "hwSlaveMPUNoRespResume",
    fields: ["entPhysicalName"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwBrdChannelFaulty (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.5
// Fields: entPhysicalName
// Description: Board channel faulty!
trapMap["1.3.6.1.4.1.2011.5.25.37.2.5"] = [
    name: "hwBrdChannelFaulty",
    fields: ["entPhysicalName"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwBrdChannelFaultyResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.6
// Fields: entPhysicalName
// Description: Board channel faulty resume!
trapMap["1.3.6.1.4.1.2011.5.25.37.2.6"] = [
    name: "hwBrdChannelFaultyResume",
    fields: ["entPhysicalName"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwBrdNofullin (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.7
// Fields: entPhysicalName
// Description: Board not full in!
trapMap["1.3.6.1.4.1.2011.5.25.37.2.7"] = [
    name: "hwBrdNofullin",
    fields: ["entPhysicalName"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwBrdNofullinResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.8
// Fields: entPhysicalName
// Description: Board not full in resume!
trapMap["1.3.6.1.4.1.2011.5.25.37.2.8"] = [
    name: "hwBrdNofullinResume",
    fields: ["entPhysicalName"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwBrdTypeNoMatchReset (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.9
// Fields: entPhysicalName
// Description: Board is reset because of the chip type is not matching!
trapMap["1.3.6.1.4.1.2011.5.25.37.2.9"] = [
    name: "hwBrdTypeNoMatchReset",
    fields: ["entPhysicalName"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwBrdAutoSwtFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.10
// Fields: entPhysicalName
// Description: Board automatically switch syn-clock but it locked failed!
trapMap["1.3.6.1.4.1.2011.5.25.37.2.10"] = [
    name: "hwBrdAutoSwtFail",
    fields: ["entPhysicalName"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwBrdAutoSwt (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.11
// Fields: entPhysicalName
// Description: Board automatically switch syn-clock!
trapMap["1.3.6.1.4.1.2011.5.25.37.2.11"] = [
    name: "hwBrdAutoSwt",
    fields: ["entPhysicalName"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwBrdClkLockERR (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.12
// Fields: entPhysicalName
// Description: Board fabric clock is unlocked!
trapMap["1.3.6.1.4.1.2011.5.25.37.2.12"] = [
    name: "hwBrdClkLockERR",
    fields: ["entPhysicalName"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwBrdClkLockERRResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.13
// Fields: entPhysicalName
// Description: Board fabric clock unlock to current clock resume!
trapMap["1.3.6.1.4.1.2011.5.25.37.2.13"] = [
    name: "hwBrdClkLockERRResume",
    fields: ["entPhysicalName"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwBrdRemoved (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.14
// Fields: entPhysicalName
// Description: Board pulled out!
trapMap["1.3.6.1.4.1.2011.5.25.37.2.14"] = [
    name: "hwBrdRemoved",
    fields: ["entPhysicalName"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwBrdInserted (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.15
// Fields: entPhysicalName
// Description: Board plugged in!
trapMap["1.3.6.1.4.1.2011.5.25.37.2.15"] = [
    name: "hwBrdInserted",
    fields: ["entPhysicalName"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwBrdUp (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.16
// Fields: entPhysicalName
// Description: Board register!
trapMap["1.3.6.1.4.1.2011.5.25.37.2.16"] = [
    name: "hwBrdUp",
    fields: ["entPhysicalName"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwClkSrcMiss (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.17
// Fields: entPhysicalName
// Description: CLK source Loss Of Signal!
trapMap["1.3.6.1.4.1.2011.5.25.37.2.17"] = [
    name: "hwClkSrcMiss",
    fields: ["entPhysicalName"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwClkAllSrcLost (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.18
// Fields: entPhysicalName
// Description: CLK all source lost!
trapMap["1.3.6.1.4.1.2011.5.25.37.2.18"] = [
    name: "hwClkAllSrcLost",
    fields: ["entPhysicalName"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwClkAllSrcLostResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.19
// Fields: entPhysicalName
// Description: CLK all source lost resume!
trapMap["1.3.6.1.4.1.2011.5.25.37.2.19"] = [
    name: "hwClkAllSrcLostResume",
    fields: ["entPhysicalName"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwClkFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.20
// Fields: entPhysicalName
// Description: CLK hardware failed!
trapMap["1.3.6.1.4.1.2011.5.25.37.2.20"] = [
    name: "hwClkFail",
    fields: ["entPhysicalName"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwClkFailResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.21
// Fields: entPhysicalName
// Description: CLK hardware failed resume!
trapMap["1.3.6.1.4.1.2011.5.25.37.2.21"] = [
    name: "hwClkFailResume",
    fields: ["entPhysicalName"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwClkNoHeartbeat (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.22
// Fields: entPhysicalName
// Description: CLK No Heartbeat!
trapMap["1.3.6.1.4.1.2011.5.25.37.2.22"] = [
    name: "hwClkNoHeartbeat",
    fields: ["entPhysicalName"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwClkNoHeartbeatResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.23
// Fields: entPhysicalName
// Description: CLK No Heartbeat resume!
trapMap["1.3.6.1.4.1.2011.5.25.37.2.23"] = [
    name: "hwClkNoHeartbeatResume",
    fields: ["entPhysicalName"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwLPULostSynAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.24
// Fields: entPhysicalName
// Description: LPU SERDES interface is lost synchronization!
trapMap["1.3.6.1.4.1.2011.5.25.37.2.24"] = [
    name: "hwLPULostSynAlarm",
    fields: ["entPhysicalName"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwLPUOpenChannelError (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.25
// Fields: entPhysicalName
// Description: LPU SERDES interface open error!
trapMap["1.3.6.1.4.1.2011.5.25.37.2.25"] = [
    name: "hwLPUOpenChannelError",
    fields: ["entPhysicalName"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwLPUSlfTstErr (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.26
// Fields: entPhysicalName
// Description: LPU self test error!
trapMap["1.3.6.1.4.1.2011.5.25.37.2.26"] = [
    name: "hwLPUSlfTstErr",
    fields: ["entPhysicalName"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwLPU3ClkSwitch (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.27
// Fields: entPhysicalName
// Description: LPU 3 class clock is switch!
trapMap["1.3.6.1.4.1.2011.5.25.37.2.27"] = [
    name: "hwLPU3ClkSwitch",
    fields: ["entPhysicalName"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwSFULostHrtReset (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.28
// Fields: entPhysicalName
// Description: SFU is reset because of heart beat loss!
trapMap["1.3.6.1.4.1.2011.5.25.37.2.28"] = [
    name: "hwSFULostHrtReset",
    fields: ["entPhysicalName"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwSFULinkLostReset (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.29
// Fields: entPhysicalName
// Description: SFU is reset because of SERDES interface input channel link lost numbers over threshold!
trapMap["1.3.6.1.4.1.2011.5.25.37.2.29"] = [
    name: "hwSFULinkLostReset",
    fields: ["entPhysicalName"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwSFUChannelLinkLost (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.30
// Fields: entPhysicalName
// Description: SFU check SERDES interface input channel link lost!
trapMap["1.3.6.1.4.1.2011.5.25.37.2.30"] = [
    name: "hwSFUChannelLinkLost",
    fields: ["entPhysicalName"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwSFUInChannelOpenFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.31
// Fields: entPhysicalName
// Description: SFU SERDES interface input channel is opened failed!
trapMap["1.3.6.1.4.1.2011.5.25.37.2.31"] = [
    name: "hwSFUInChannelOpenFail",
    fields: ["entPhysicalName"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwVoltSensorFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.32
// Fields: entPhysicalName
// Description: Board voltage monitor failure!
trapMap["1.3.6.1.4.1.2011.5.25.37.2.32"] = [
    name: "hwVoltSensorFail",
    fields: ["entPhysicalName"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwVoltSensorFailResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.33
// Fields: entPhysicalName
// Description: Board voltage monitor failure resume!
trapMap["1.3.6.1.4.1.2011.5.25.37.2.33"] = [
    name: "hwVoltSensorFailResume",
    fields: ["entPhysicalName"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwVoltBtmC (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.34
// Fields: entPhysicalName
// Description: Board voltage below fatal threshold!
trapMap["1.3.6.1.4.1.2011.5.25.37.2.34"] = [
    name: "hwVoltBtmC",
    fields: ["entPhysicalName"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwVoltBtmCResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.35
// Fields: entPhysicalName
// Description: Board voltage below fatal threshold resume!
trapMap["1.3.6.1.4.1.2011.5.25.37.2.35"] = [
    name: "hwVoltBtmCResume",
    fields: ["entPhysicalName"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwVoltSprC (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.36
// Fields: entPhysicalName
// Description: Board voltage over fatal threshold!
trapMap["1.3.6.1.4.1.2011.5.25.37.2.36"] = [
    name: "hwVoltSprC",
    fields: ["entPhysicalName"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwVoltSprCResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.37
// Fields: entPhysicalName
// Description: Board voltage over fatal threshold resume!
trapMap["1.3.6.1.4.1.2011.5.25.37.2.37"] = [
    name: "hwVoltSprCResume",
    fields: ["entPhysicalName"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwVoltBtmM (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.38
// Fields: entPhysicalName
// Description: Board voltage below major threshold!
trapMap["1.3.6.1.4.1.2011.5.25.37.2.38"] = [
    name: "hwVoltBtmM",
    fields: ["entPhysicalName"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwVoltBtmMResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.39
// Fields: entPhysicalName
// Description: Board voltage below major threshold resume!
trapMap["1.3.6.1.4.1.2011.5.25.37.2.39"] = [
    name: "hwVoltBtmMResume",
    fields: ["entPhysicalName"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwVoltSprM (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.40
// Fields: entPhysicalName
// Description: Board voltage over major threshold!
trapMap["1.3.6.1.4.1.2011.5.25.37.2.40"] = [
    name: "hwVoltSprM",
    fields: ["entPhysicalName"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwVoltSprMResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.41
// Fields: entPhysicalName
// Description: Board voltage over major threshold resume!
trapMap["1.3.6.1.4.1.2011.5.25.37.2.41"] = [
    name: "hwVoltSprMResume",
    fields: ["entPhysicalName"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwTempSensorFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.42
// Fields: entPhysicalName
// Description: Board temprature monitor failure!
trapMap["1.3.6.1.4.1.2011.5.25.37.2.42"] = [
    name: "hwTempSensorFail",
    fields: ["entPhysicalName"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwTempSensorFailResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.43
// Fields: entPhysicalName
// Description: Board temperature monitor failure resume!
trapMap["1.3.6.1.4.1.2011.5.25.37.2.43"] = [
    name: "hwTempSensorFailResume",
    fields: ["entPhysicalName"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwTempMnr (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.44
// Fields: entPhysicalName
// Description: Board temperature over minor threshold!
trapMap["1.3.6.1.4.1.2011.5.25.37.2.44"] = [
    name: "hwTempMnr",
    fields: ["entPhysicalName"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwTempMnrResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.45
// Fields: entPhysicalName
// Description: Board temperature over minor threshold resume!
trapMap["1.3.6.1.4.1.2011.5.25.37.2.45"] = [
    name: "hwTempMnrResume",
    fields: ["entPhysicalName"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwTempMjr (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.46
// Fields: entPhysicalName
// Description: Board temperature over major threshold!
trapMap["1.3.6.1.4.1.2011.5.25.37.2.46"] = [
    name: "hwTempMjr",
    fields: ["entPhysicalName"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwTempMjrResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.47
// Fields: entPhysicalName
// Description: Board temperature over major threshold resume!
trapMap["1.3.6.1.4.1.2011.5.25.37.2.47"] = [
    name: "hwTempMjrResume",
    fields: ["entPhysicalName"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwTempCtl (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.48
// Fields: entPhysicalName
// Description: Board temperature over fatal threshold!
trapMap["1.3.6.1.4.1.2011.5.25.37.2.48"] = [
    name: "hwTempCtl",
    fields: ["entPhysicalName"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwTempCtlResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.49
// Fields: entPhysicalName
// Description: Board temperature over fatal threshold resume!
trapMap["1.3.6.1.4.1.2011.5.25.37.2.49"] = [
    name: "hwTempCtlResume",
    fields: ["entPhysicalName"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwFanHFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.50
// Fields: entPhysicalName
// Description: Fan hardware failure!
trapMap["1.3.6.1.4.1.2011.5.25.37.2.50"] = [
    name: "hwFanHFail",
    fields: ["entPhysicalName"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwFanFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.51
// Fields: entPhysicalName
// Description: Fan failure!
trapMap["1.3.6.1.4.1.2011.5.25.37.2.51"] = [
    name: "hwFanFail",
    fields: ["entPhysicalName"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwFanFailResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.52
// Fields: entPhysicalName
// Description: Fan failure resume!
trapMap["1.3.6.1.4.1.2011.5.25.37.2.52"] = [
    name: "hwFanFailResume",
    fields: ["entPhysicalName"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwFanAbsent (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.53
// Fields: entPhysicalName
// Description: Fan absent!
trapMap["1.3.6.1.4.1.2011.5.25.37.2.53"] = [
    name: "hwFanAbsent",
    fields: ["entPhysicalName"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwFanAbsentResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.54
// Fields: entPhysicalName
// Description: Fan absent resume!
trapMap["1.3.6.1.4.1.2011.5.25.37.2.54"] = [
    name: "hwFanAbsentResume",
    fields: ["entPhysicalName"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwFanCabUN (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.55
// Fields: entPhysicalName
// Description: Fan cable unplugged!
trapMap["1.3.6.1.4.1.2011.5.25.37.2.55"] = [
    name: "hwFanCabUN",
    fields: ["entPhysicalName"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwFanCabUNResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.56
// Fields: entPhysicalName
// Description: Fan cable unplugged resume!
trapMap["1.3.6.1.4.1.2011.5.25.37.2.56"] = [
    name: "hwFanCabUNResume",
    fields: ["entPhysicalName"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwPwrFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.57
// Fields: entPhysicalName
// Description: Power failure!
trapMap["1.3.6.1.4.1.2011.5.25.37.2.57"] = [
    name: "hwPwrFail",
    fields: ["entPhysicalName"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwPwrFailResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.58
// Fields: entPhysicalName
// Description: Power failure resume!
trapMap["1.3.6.1.4.1.2011.5.25.37.2.58"] = [
    name: "hwPwrFailResume",
    fields: ["entPhysicalName"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwPwrAbsent (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.59
// Fields: entPhysicalName
// Description: Power absent!
trapMap["1.3.6.1.4.1.2011.5.25.37.2.59"] = [
    name: "hwPwrAbsent",
    fields: ["entPhysicalName"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwPwrAbsentResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.60
// Fields: entPhysicalName
// Description: Power absent resume!
trapMap["1.3.6.1.4.1.2011.5.25.37.2.60"] = [
    name: "hwPwrAbsentResume",
    fields: ["entPhysicalName"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwPwrCabUN (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.61
// Fields: entPhysicalName
// Description: Power monitor cable unplugged!
trapMap["1.3.6.1.4.1.2011.5.25.37.2.61"] = [
    name: "hwPwrCabUN",
    fields: ["entPhysicalName"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwPwrCabUNResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.62
// Fields: entPhysicalName
// Description: Power monitor cable unplugged resume!
trapMap["1.3.6.1.4.1.2011.5.25.37.2.62"] = [
    name: "hwPwrCabUNResume",
    fields: ["entPhysicalName"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwLCDHFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.63
// Fields: entPhysicalName
// Description: LCD hardware failure!
trapMap["1.3.6.1.4.1.2011.5.25.37.2.63"] = [
    name: "hwLCDHFail",
    fields: ["entPhysicalName"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwLCDFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.64
// Fields: entPhysicalName
// Description: LCD failure!
trapMap["1.3.6.1.4.1.2011.5.25.37.2.64"] = [
    name: "hwLCDFail",
    fields: ["entPhysicalName"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwLCDAbsent (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.65
// Fields: entPhysicalName
// Description: LCD absent!
trapMap["1.3.6.1.4.1.2011.5.25.37.2.65"] = [
    name: "hwLCDAbsent",
    fields: ["entPhysicalName"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwLCDAbsentResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.66
// Fields: entPhysicalName
// Description: LCD absent resume!
trapMap["1.3.6.1.4.1.2011.5.25.37.2.66"] = [
    name: "hwLCDAbsentResume",
    fields: ["entPhysicalName"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwLCDCabUN (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.67
// Fields: entPhysicalName
// Description: LCD cable unplugged!
trapMap["1.3.6.1.4.1.2011.5.25.37.2.67"] = [
    name: "hwLCDCabUN",
    fields: ["entPhysicalName"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwLCDCabUNResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.68
// Fields: entPhysicalName
// Description: LCD cable unplugged resume!
trapMap["1.3.6.1.4.1.2011.5.25.37.2.68"] = [
    name: "hwLCDCabUNResume",
    fields: ["entPhysicalName"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwROMFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.69
// Fields: entPhysicalName
// Description: EEPROM failure!
trapMap["1.3.6.1.4.1.2011.5.25.37.2.69"] = [
    name: "hwROMFail",
    fields: ["entPhysicalName"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwMonitorBUSFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.70
// Fields: entPhysicalName
// Description: MonitorBUS failure!
trapMap["1.3.6.1.4.1.2011.5.25.37.2.70"] = [
    name: "hwMonitorBUSFail",
    fields: ["entPhysicalName"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwMonitorBUSFailResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.71
// Fields: entPhysicalName
// Description: MonitorBUS failure resume!
trapMap["1.3.6.1.4.1.2011.5.25.37.2.71"] = [
    name: "hwMonitorBUSFailResume",
    fields: ["entPhysicalName"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwBoardOfflineChange (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.72
// Fields: entPhysicalName
// Description: Board power status change!
trapMap["1.3.6.1.4.1.2011.5.25.37.2.72"] = [
    name: "hwBoardOfflineChange",
    fields: ["entPhysicalName"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwWriteFlashError (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.100
// Fields: entPhysicalName
// Description: write flash error!
trapMap["1.3.6.1.4.1.2011.5.25.37.2.100"] = [
    name: "hwWriteFlashError",
    fields: ["entPhysicalName"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwBoardReset (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.101
// Fields: entPhysicalName
// Description: board reset!
trapMap["1.3.6.1.4.1.2011.5.25.37.2.101"] = [
    name: "hwBoardReset",
    fields: ["entPhysicalName"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwBoardResetSuccess (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.102
// Fields: entPhysicalName
// Description: board reset success!
trapMap["1.3.6.1.4.1.2011.5.25.37.2.102"] = [
    name: "hwBoardResetSuccess",
    fields: ["entPhysicalName"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwSlaveMPUReset (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.103
// Fields: entPhysicalName
// Description: slave MPU reset !
trapMap["1.3.6.1.4.1.2011.5.25.37.2.103"] = [
    name: "hwSlaveMPUReset",
    fields: ["entPhysicalName"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwMasterSlaveSwap (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.104
// Fields: entPhysicalName
// Description: master slave swap!
trapMap["1.3.6.1.4.1.2011.5.25.37.2.104"] = [
    name: "hwMasterSlaveSwap",
    fields: ["entPhysicalName"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwRTCFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.105
// Fields: entPhysicalName
// Description: RTC failure!
trapMap["1.3.6.1.4.1.2011.5.25.37.2.105"] = [
    name: "hwRTCFail",
    fields: ["entPhysicalName"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwExchangeChipFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.106
// Fields: entPhysicalName
// Description: 5695 exchange chip fail!
trapMap["1.3.6.1.4.1.2011.5.25.37.2.106"] = [
    name: "hwExchangeChipFail",
    fields: ["entPhysicalName"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwTempResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.107
// Fields: entPhysicalName
// Description: Board temprature over threshold resume!
trapMap["1.3.6.1.4.1.2011.5.25.37.2.107"] = [
    name: "hwTempResume",
    fields: ["entPhysicalName"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwOpticalModuleInsert (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.108
// Fields: entPhysicalName
// Description: optical module plug in !
trapMap["1.3.6.1.4.1.2011.5.25.37.2.108"] = [
    name: "hwOpticalModuleInsert",
    fields: ["entPhysicalName"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwOpticalModuleRemove (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.109
// Fields: entPhysicalName
// Description: optical module plug out !
trapMap["1.3.6.1.4.1.2011.5.25.37.2.109"] = [
    name: "hwOpticalModuleRemove",
    fields: ["entPhysicalName"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwFPGAAbnormal (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.110
// Fields: entPhysicalName
// Description: FPGA abnormal !
trapMap["1.3.6.1.4.1.2011.5.25.37.2.110"] = [
    name: "hwFPGAAbnormal",
    fields: ["entPhysicalName"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwMinMTunnelDownAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.111
// Fields: hwTunnelGroupID
// Description: For Mac in Mac tunnel. Mac tunnel have two status: up or down, when physical interface is down or some cc package can't arrive to the other side of mac in mac tunnel, the status of tunnel will be down...
trapMap["1.3.6.1.4.1.2011.5.25.37.2.111"] = [
    name: "hwMinMTunnelDownAlarm",
    fields: ["hwTunnelGroupID"],
    fieldOids: ["hwTunnelGroupID": "1.3.6.1.4.1.2011.5.25.37.1.2"]
]

// --- hwMinMTunnelUpAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.112
// Fields: hwTunnelGroupID
// Description: For Mac in Mac tunnel. Mac tunnel have two status: up or down, if cc package can arrive to the other side of mac in mac tunnel, the status of tunnel will be up 1 Notice/Trap name: Tunnel up 2 Notice/T...
trapMap["1.3.6.1.4.1.2011.5.25.37.2.112"] = [
    name: "hwMinMTunnelUpAlarm",
    fields: ["hwTunnelGroupID"],
    fieldOids: ["hwTunnelGroupID": "1.3.6.1.4.1.2011.5.25.37.1.2"]
]

// --- hwInterfacePhysicalDown (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.113
// Fields: ifIndex, ifDescr
// Description: This trap is to indicate port link down on physical layer.
trapMap["1.3.6.1.4.1.2011.5.25.37.2.113"] = [
    name: "hwInterfacePhysicalDown",
    fields: ["ifIndex", "ifDescr"],
    fieldOids: ["ifIndex": "1.3.6.1.2.1.2.2.1.1", "ifDescr": "1.3.6.1.2.1.2.2.1.2"]
]

// --- hwInterfacePhysicalUp (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.114
// Fields: ifIndex, ifDescr
// Description: This trap is to indicate port link up on physical layer.
trapMap["1.3.6.1.4.1.2011.5.25.37.2.114"] = [
    name: "hwInterfacePhysicalUp",
    fields: ["ifIndex", "ifDescr"],
    fieldOids: ["ifIndex": "1.3.6.1.2.1.2.2.1.1", "ifDescr": "1.3.6.1.2.1.2.2.1.2"]
]

// --- hwBTBStartupFileNameDifferent (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.119
// Fields: entPhysicalName, hwDCTrapReason
// Description: In the BTB system ,the start-up file name of master and slave chassis is different . Used for BTB or its extend system.
trapMap["1.3.6.1.4.1.2011.5.25.37.2.119"] = [
    name: "hwBTBStartupFileNameDifferent",
    fields: ["entPhysicalName", "hwDCTrapReason"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwDCTrapReason": "1.3.6.1.4.1.2011.5.25.37.1.3"]
]

// --- hwBTBChassisRunningModeConflict (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.120
// Fields: entPhysicalName, hwDCTrapReason
// Description: The Master and Slave chassises running modes conflict.Used for BTB or its extend system.
trapMap["1.3.6.1.4.1.2011.5.25.37.2.120"] = [
    name: "hwBTBChassisRunningModeConflict",
    fields: ["entPhysicalName", "hwDCTrapReason"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwDCTrapReason": "1.3.6.1.4.1.2011.5.25.37.1.3"]
]

// --- hwBTBCtrlChannelFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.121
// Fields: entPhysicalName, hwDCTrapReason
// Description: The FE control channel failture, as physical link from up to down or channel blocked. Used for BTB or its extend system.
trapMap["1.3.6.1.4.1.2011.5.25.37.2.121"] = [
    name: "hwBTBCtrlChannelFail",
    fields: ["entPhysicalName", "hwDCTrapReason"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwDCTrapReason": "1.3.6.1.4.1.2011.5.25.37.1.3"]
]

// --- hwBTBCtrlChannelFailResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.122
// Fields: entPhysicalName, hwDCTrapReason
// Description: The FE control channel failture resume.Used for BTB or its extend system.
trapMap["1.3.6.1.4.1.2011.5.25.37.2.122"] = [
    name: "hwBTBCtrlChannelFailResume",
    fields: ["entPhysicalName", "hwDCTrapReason"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwDCTrapReason": "1.3.6.1.4.1.2011.5.25.37.1.3"]
]

// --- hwBTBDataChannelFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.123
// Fields: entPhysicalName, hwDCTrapReason
// Description: The data channel failture, all optical links down between chassises.Used for BTB or its extend system.
trapMap["1.3.6.1.4.1.2011.5.25.37.2.123"] = [
    name: "hwBTBDataChannelFail",
    fields: ["entPhysicalName", "hwDCTrapReason"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwDCTrapReason": "1.3.6.1.4.1.2011.5.25.37.1.3"]
]

// --- hwBTBDataChannelFailResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.124
// Fields: entPhysicalName, hwDCTrapReason
// Description: The data channel failture resume.Used for BTB or its extend system.
trapMap["1.3.6.1.4.1.2011.5.25.37.2.124"] = [
    name: "hwBTBDataChannelFailResume",
    fields: ["entPhysicalName", "hwDCTrapReason"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwDCTrapReason": "1.3.6.1.4.1.2011.5.25.37.1.3"]
]

// --- hwBTBClkChannelFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.125
// Fields: entPhysicalName, hwDCTrapReason
// Description: The clock channel failture, clock link down between chassises.Used for BTB or its extend system.
trapMap["1.3.6.1.4.1.2011.5.25.37.2.125"] = [
    name: "hwBTBClkChannelFail",
    fields: ["entPhysicalName", "hwDCTrapReason"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwDCTrapReason": "1.3.6.1.4.1.2011.5.25.37.1.3"]
]

// --- hwBTBClkChannelFailResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.126
// Fields: entPhysicalName, hwDCTrapReason
// Description: The clock Channel failture resume.Used for BTB or its extend system.
trapMap["1.3.6.1.4.1.2011.5.25.37.2.126"] = [
    name: "hwBTBClkChannelFailResume",
    fields: ["entPhysicalName", "hwDCTrapReason"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwDCTrapReason": "1.3.6.1.4.1.2011.5.25.37.1.3"]
]

// --- hwBTBSFUOpticInterfaceError (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.127
// Fields: entPhysicalName, hwDCTrapReason
// Description: The optical fiber connection error, the connection of SFU fiber between chassises is not correct. Used for BTB or its extend system.
trapMap["1.3.6.1.4.1.2011.5.25.37.2.127"] = [
    name: "hwBTBSFUOpticInterfaceError",
    fields: ["entPhysicalName", "hwDCTrapReason"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwDCTrapReason": "1.3.6.1.4.1.2011.5.25.37.1.3"]
]

// --- hwBTBSFUOpticInterfaceErrorResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.128
// Fields: entPhysicalName, hwDCTrapReason
// Description: The optical fiber connection error resume.Used for BTB or its extend system.
trapMap["1.3.6.1.4.1.2011.5.25.37.2.128"] = [
    name: "hwBTBSFUOpticInterfaceErrorResume",
    fields: ["entPhysicalName", "hwDCTrapReason"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwDCTrapReason": "1.3.6.1.4.1.2011.5.25.37.1.3"]
]

// --- hwBTBVSRInterfaceInvalid (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.129
// Fields: entPhysicalName, hwDCTrapReason
// Description: The SFU VSR(very short reach) interface invalid.Used for BTB or its extend system.
trapMap["1.3.6.1.4.1.2011.5.25.37.2.129"] = [
    name: "hwBTBVSRInterfaceInvalid",
    fields: ["entPhysicalName", "hwDCTrapReason"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwDCTrapReason": "1.3.6.1.4.1.2011.5.25.37.1.3"]
]

// --- hwBTBVSRInterfaceInvalidResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.130
// Fields: entPhysicalName, hwDCTrapReason
// Description: The SFU VSR(very short reach) interface invalid resume.Used for BTB or its extend system.
trapMap["1.3.6.1.4.1.2011.5.25.37.2.130"] = [
    name: "hwBTBVSRInterfaceInvalidResume",
    fields: ["entPhysicalName", "hwDCTrapReason"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwDCTrapReason": "1.3.6.1.4.1.2011.5.25.37.1.3"]
]

// --- hwBTBSlaveChassisNoHeart (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.131
// Fields: entPhysicalName, hwDCTrapReason
// Description: The slave chassis no heart.Used for BTB or its extend system.
trapMap["1.3.6.1.4.1.2011.5.25.37.2.131"] = [
    name: "hwBTBSlaveChassisNoHeart",
    fields: ["entPhysicalName", "hwDCTrapReason"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwDCTrapReason": "1.3.6.1.4.1.2011.5.25.37.1.3"]
]

// --- hwBTBNoSlaveChassis (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.132
// Fields: entPhysicalName, hwDCTrapReason
// Description: No slave chassis connected to the master chassis in the BTB system.Used for BTB or its extend system.
trapMap["1.3.6.1.4.1.2011.5.25.37.2.132"] = [
    name: "hwBTBNoSlaveChassis",
    fields: ["entPhysicalName", "hwDCTrapReason"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwDCTrapReason": "1.3.6.1.4.1.2011.5.25.37.1.3"]
]

// --- hwBTBSlaveChassisRegisted (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.133
// Fields: entPhysicalName, hwDCTrapReason
// Description: The slave chassis registe successful.Used for BTB or its extend system.
trapMap["1.3.6.1.4.1.2011.5.25.37.2.133"] = [
    name: "hwBTBSlaveChassisRegisted",
    fields: ["entPhysicalName", "hwDCTrapReason"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwDCTrapReason": "1.3.6.1.4.1.2011.5.25.37.1.3"]
]

// --- hwBTBSlaveChassisRegisteFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.134
// Fields: entPhysicalName, hwDCTrapReason
// Description: The slave chassis registe failed.Used for BTB or its extend system.
trapMap["1.3.6.1.4.1.2011.5.25.37.2.134"] = [
    name: "hwBTBSlaveChassisRegisteFail",
    fields: ["entPhysicalName", "hwDCTrapReason"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwDCTrapReason": "1.3.6.1.4.1.2011.5.25.37.1.3"]
]

// --- hwBTBChassisTypeConflict (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.135
// Fields: entPhysicalName, hwDCTrapReason
// Description: The chassis information conflict in the PAF and Nvram.Used for BTB or its extend system.
trapMap["1.3.6.1.4.1.2011.5.25.37.2.135"] = [
    name: "hwBTBChassisTypeConflict",
    fields: ["entPhysicalName", "hwDCTrapReason"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7", "hwDCTrapReason": "1.3.6.1.4.1.2011.5.25.37.1.3"]
]

// --- hwSuperChangeSuccesful (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.136
// Description: Super change successful.
trapMap["1.3.6.1.4.1.2011.5.25.37.2.136"] = [
    name: "hwSuperChangeSuccesful",
    fields: [],
    fieldOids: []
]

// --- hwSuperChangeFailure (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.137
// Description: Super change Failure.
trapMap["1.3.6.1.4.1.2011.5.25.37.2.137"] = [
    name: "hwSuperChangeFailure",
    fields: [],
    fieldOids: []
]

// --- hwOpticaPowerAbnormal (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.138
// Fields: entPhysicalName
// Description: Optical Transceiver power abnormal.
trapMap["1.3.6.1.4.1.2011.5.25.37.2.138"] = [
    name: "hwOpticaPowerAbnormal",
    fields: ["entPhysicalName"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwEpldAbnormal (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.139
// Fields: entPhysicalName
// Description: Epld logic abnormal.
trapMap["1.3.6.1.4.1.2011.5.25.37.2.139"] = [
    name: "hwEpldAbnormal",
    fields: ["entPhysicalName"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwPhyChipAbnormal (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.140
// Fields: entPhysicalName
// Description: PHY chip is abnormal.
trapMap["1.3.6.1.4.1.2011.5.25.37.2.140"] = [
    name: "hwPhyChipAbnormal",
    fields: ["entPhysicalName"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwSerdesAbnormal (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.141
// Fields: entPhysicalName
// Description: Serdes interface of PHY chip abnormal.
trapMap["1.3.6.1.4.1.2011.5.25.37.2.141"] = [
    name: "hwSerdesAbnormal",
    fields: ["entPhysicalName"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwBoardAbnormal (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.142
// Fields: entPhysicalName
// Description: Board is abnormal.
trapMap["1.3.6.1.4.1.2011.5.25.37.2.142"] = [
    name: "hwBoardAbnormal",
    fields: ["entPhysicalName"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwFeChannelAbnormal (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.143
// Fields: entPhysicalName
// Description: FE data channel is abnormal
trapMap["1.3.6.1.4.1.2011.5.25.37.2.143"] = [
    name: "hwFeChannelAbnormal",
    fields: ["entPhysicalName"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwParityCheckAbnormal (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.144
// Fields: entPhysicalName
// Description: Data parity check is abnormal
trapMap["1.3.6.1.4.1.2011.5.25.37.2.144"] = [
    name: "hwParityCheckAbnormal",
    fields: ["entPhysicalName"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwPhyClockAbnormal (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.145
// Fields: entPhysicalName
// Description: The clock of PHY chip is abnormal.
trapMap["1.3.6.1.4.1.2011.5.25.37.2.145"] = [
    name: "hwPhyClockAbnormal",
    fields: ["entPhysicalName"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwPortAutoNegotiateFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.146
// Fields: entPhysicalName
// Description: The ethernet port negotiate failed
trapMap["1.3.6.1.4.1.2011.5.25.37.2.146"] = [
    name: "hwPortAutoNegotiateFail",
    fields: ["entPhysicalName"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwPortSemiduplex (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.147
// Fields: entPhysicalName
// Description: The ethernet port work at semi duplex state.
trapMap["1.3.6.1.4.1.2011.5.25.37.2.147"] = [
    name: "hwPortSemiduplex",
    fields: ["entPhysicalName"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwScuStartModeSetFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.148
// Fields: entPhysicalName
// Description: The start mode of SCU set failed
trapMap["1.3.6.1.4.1.2011.5.25.37.2.148"] = [
    name: "hwScuStartModeSetFail",
    fields: ["entPhysicalName"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwMemoryExhaust (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.149
// Description: MPU memory exhaust.
trapMap["1.3.6.1.4.1.2011.5.25.37.2.149"] = [
    name: "hwMemoryExhaust",
    fields: [],
    fieldOids: []
]

// --- hwMemoryExhaustClear (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.150
// Description: MPU memory usage resume to normal.
trapMap["1.3.6.1.4.1.2011.5.25.37.2.150"] = [
    name: "hwMemoryExhaustClear",
    fields: [],
    fieldOids: []
]

// --- hwMethAbnormal (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.151
// Fields: entPhysicalName
// Description: The Meth interface is abnormal.
trapMap["1.3.6.1.4.1.2011.5.25.37.2.151"] = [
    name: "hwMethAbnormal",
    fields: ["entPhysicalName"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwLpuNotTight (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.152
// Fields: entPhysicalName
// Description: The LPU board is not tightly installed. Install the board again.
trapMap["1.3.6.1.4.1.2011.5.25.37.2.152"] = [
    name: "hwLpuNotTight",
    fields: ["entPhysicalName"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwLicenseFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.153
// Fields: entPhysicalName
// Description: License fail.
trapMap["1.3.6.1.4.1.2011.5.25.37.2.153"] = [
    name: "hwLicenseFail",
    fields: ["entPhysicalName"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwHaBatchBegin (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.154
// Fields: entPhysicalName
// Description: No command line can be entered because batch backup is processing.
trapMap["1.3.6.1.4.1.2011.5.25.37.2.154"] = [
    name: "hwHaBatchBegin",
    fields: ["entPhysicalName"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwHaBatchEnd (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.155
// Fields: entPhysicalName
// Description: Command lines can be entered because batch backup ends.
trapMap["1.3.6.1.4.1.2011.5.25.37.2.155"] = [
    name: "hwHaBatchEnd",
    fields: ["entPhysicalName"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwHaSmoothBegin (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.156
// Fields: entPhysicalName
// Description: No command line can be entered because data smooth is processing.
trapMap["1.3.6.1.4.1.2011.5.25.37.2.156"] = [
    name: "hwHaSmoothBegin",
    fields: ["entPhysicalName"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwHaSmoothEnd (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.157
// Fields: entPhysicalName
// Description: Command lines can be entered because data smooth ends.
trapMap["1.3.6.1.4.1.2011.5.25.37.2.157"] = [
    name: "hwHaSmoothEnd",
    fields: ["entPhysicalName"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// --- hwFanUp (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.5.25.37.2.158
// Fields: entPhysicalName
// Description: Fan register!
trapMap["1.3.6.1.4.1.2011.5.25.37.2.158"] = [
    name: "hwFanUp",
    fields: ["entPhysicalName"],
    fieldOids: ["entPhysicalName": "1.3.6.1.2.1.47.1.1.1.1.7"]
]

// ===== Lookup tables (inlined) =====
def lookupTables = [:]

// ===== Parsing logic =====

// Set to true to enable diagnostic logging for this MIB parser
DEBUG = false

LOG_PREFIX = "[HUAWEI-DC-TRAP-MIB]"
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
// --- Trap: hwMPUSynClkFaulty (OID 1.3.6.1.4.1.2011.5.25.37.2.1) ---
if (trapRuleName == "hwMPUSynClkFaulty") {
    event.setAlertGroup("MPU Sync Clock")
    def alertKey = "entPhysicalEntry." + (((resolveInstanceOid(1) =~ /\.([0-9]+)$/) ? (resolveInstanceOid(1) =~ /\.([0-9]+)$/)[0][1] : ''))
    event.setAlertKey(alertKey)
    def summary = "Hw MPUSyn Clk Faulty" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(3)
    event.setEventType("1")
    def dyn = event.getDynamicFields() ?: [:]
    dyn["entPhysicalName"] = varbinds.get("entPhysicalName")
    dyn["entPhysicalIndex"] = varbinds.get("entPhysicalIndex")
    event.setDynamicFields(dyn)
}
// --- Trap: hwMPUSynClkFaultyResume (OID 1.3.6.1.4.1.2011.5.25.37.2.2) ---
if (trapRuleName == "hwMPUSynClkFaultyResume") {
    event.setAlertGroup("MPU Sync Clock")
    def alertKey = "entPhysicalEntry." + (((resolveInstanceOid(1) =~ /\.([0-9]+)$/) ? (resolveInstanceOid(1) =~ /\.([0-9]+)$/)[0][1] : ''))
    event.setAlertKey(alertKey)
    def summary = "Hw MPUSyn Clk Faulty Resume" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(1)
    event.setEventType("2")
    def dyn = event.getDynamicFields() ?: [:]
    dyn["entPhysicalName"] = varbinds.get("entPhysicalName")
    dyn["entPhysicalIndex"] = varbinds.get("entPhysicalIndex")
    event.setDynamicFields(dyn)
}
// --- Trap: hwSlaveMPUNoResp (OID 1.3.6.1.4.1.2011.5.25.37.2.3) ---
if (trapRuleName == "hwSlaveMPUNoResp") {
    event.setAlertGroup("Slave MPU Status")
    def alertKey = "entPhysicalEntry." + (((resolveInstanceOid(1) =~ /\.([0-9]+)$/) ? (resolveInstanceOid(1) =~ /\.([0-9]+)$/)[0][1] : ''))
    event.setAlertKey(alertKey)
    def summary = "Hw Slave MPUNo Resp" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(3)
    event.setEventType("1")
    def dyn = event.getDynamicFields() ?: [:]
    dyn["entPhysicalName"] = varbinds.get("entPhysicalName")
    dyn["entPhysicalIndex"] = varbinds.get("entPhysicalIndex")
    event.setDynamicFields(dyn)
}
// --- Trap: hwSlaveMPUNoRespResume (OID 1.3.6.1.4.1.2011.5.25.37.2.4) ---
if (trapRuleName == "hwSlaveMPUNoRespResume") {
    event.setAlertGroup("Slave MPU Status")
    def alertKey = "entPhysicalEntry." + (((resolveInstanceOid(1) =~ /\.([0-9]+)$/) ? (resolveInstanceOid(1) =~ /\.([0-9]+)$/)[0][1] : ''))
    event.setAlertKey(alertKey)
    def summary = "Hw Slave MPUNo Resp Resume" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(1)
    event.setEventType("2")
    def dyn = event.getDynamicFields() ?: [:]
    dyn["entPhysicalName"] = varbinds.get("entPhysicalName")
    dyn["entPhysicalIndex"] = varbinds.get("entPhysicalIndex")
    event.setDynamicFields(dyn)
}
// --- Trap: hwBrdChannelFaulty (OID 1.3.6.1.4.1.2011.5.25.37.2.5) ---
if (trapRuleName == "hwBrdChannelFaulty") {
    event.setAlertGroup("Board Channel Status")
    def alertKey = "entPhysicalEntry." + (((resolveInstanceOid(1) =~ /\.([0-9]+)$/) ? (resolveInstanceOid(1) =~ /\.([0-9]+)$/)[0][1] : ''))
    event.setAlertKey(alertKey)
    def summary = "Hw Brd Channel Faulty" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(3)
    event.setEventType("1")
    def dyn = event.getDynamicFields() ?: [:]
    dyn["entPhysicalName"] = varbinds.get("entPhysicalName")
    dyn["entPhysicalIndex"] = varbinds.get("entPhysicalIndex")
    event.setDynamicFields(dyn)
}
// --- Trap: hwBrdChannelFaultyResume (OID 1.3.6.1.4.1.2011.5.25.37.2.6) ---
if (trapRuleName == "hwBrdChannelFaultyResume") {
    event.setAlertGroup("Board Channel Status")
    def alertKey = "entPhysicalEntry." + (((resolveInstanceOid(1) =~ /\.([0-9]+)$/) ? (resolveInstanceOid(1) =~ /\.([0-9]+)$/)[0][1] : ''))
    event.setAlertKey(alertKey)
    def summary = "Hw Brd Channel Faulty Resume" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(1)
    event.setEventType("2")
    def dyn = event.getDynamicFields() ?: [:]
    dyn["entPhysicalName"] = varbinds.get("entPhysicalName")
    dyn["entPhysicalIndex"] = varbinds.get("entPhysicalIndex")
    event.setDynamicFields(dyn)
}
// --- Trap: hwBrdNofullin (OID 1.3.6.1.4.1.2011.5.25.37.2.7) ---
if (trapRuleName == "hwBrdNofullin") {
    event.setAlertGroup("Board Full In")
    def alertKey = "entPhysicalEntry." + (((resolveInstanceOid(1) =~ /\.([0-9]+)$/) ? (resolveInstanceOid(1) =~ /\.([0-9]+)$/)[0][1] : ''))
    event.setAlertKey(alertKey)
    def summary = "Hw Brd Nofullin" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(3)
    event.setEventType("1")
    def dyn = event.getDynamicFields() ?: [:]
    dyn["entPhysicalName"] = varbinds.get("entPhysicalName")
    dyn["entPhysicalIndex"] = varbinds.get("entPhysicalIndex")
    event.setDynamicFields(dyn)
}
// --- Trap: hwBrdNofullinResume (OID 1.3.6.1.4.1.2011.5.25.37.2.8) ---
if (trapRuleName == "hwBrdNofullinResume") {
    event.setAlertGroup("Board Full In")
    def alertKey = "entPhysicalEntry." + (((resolveInstanceOid(1) =~ /\.([0-9]+)$/) ? (resolveInstanceOid(1) =~ /\.([0-9]+)$/)[0][1] : ''))
    event.setAlertKey(alertKey)
    def summary = "Hw Brd Nofullin Resume" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(1)
    event.setEventType("2")
    def dyn = event.getDynamicFields() ?: [:]
    dyn["entPhysicalName"] = varbinds.get("entPhysicalName")
    dyn["entPhysicalIndex"] = varbinds.get("entPhysicalIndex")
    event.setDynamicFields(dyn)
}
// --- Trap: hwBrdTypeNoMatchReset (OID 1.3.6.1.4.1.2011.5.25.37.2.9) ---
if (trapRuleName == "hwBrdTypeNoMatchReset") {
    event.setAlertGroup("Board Reset")
    def alertKey = "entPhysicalEntry." + (((resolveInstanceOid(1) =~ /\.([0-9]+)$/) ? (resolveInstanceOid(1) =~ /\.([0-9]+)$/)[0][1] : ''))
    event.setAlertKey(alertKey)
    def summary = "Hw Brd Type No Match Reset" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(3)
    event.setEventType("1")
    def dyn = event.getDynamicFields() ?: [:]
    dyn["entPhysicalName"] = varbinds.get("entPhysicalName")
    dyn["entPhysicalIndex"] = varbinds.get("entPhysicalIndex")
    event.setDynamicFields(dyn)
}
// --- Trap: hwBrdAutoSwtFail (OID 1.3.6.1.4.1.2011.5.25.37.2.10) ---
if (trapRuleName == "hwBrdAutoSwtFail") {
    event.setAlertGroup("Board Auto Switch")
    def alertKey = "entPhysicalEntry." + (((resolveInstanceOid(1) =~ /\.([0-9]+)$/) ? (resolveInstanceOid(1) =~ /\.([0-9]+)$/)[0][1] : ''))
    event.setAlertKey(alertKey)
    def summary = "Hw Brd Auto Swt Fail" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(3)
    event.setEventType("1")
    def dyn = event.getDynamicFields() ?: [:]
    dyn["entPhysicalName"] = varbinds.get("entPhysicalName")
    dyn["entPhysicalIndex"] = varbinds.get("entPhysicalIndex")
    event.setDynamicFields(dyn)
}
// --- Trap: hwBrdAutoSwt (OID 1.3.6.1.4.1.2011.5.25.37.2.11) ---
if (trapRuleName == "hwBrdAutoSwt") {
    event.setAlertGroup("Board Auto Switch")
    def alertKey = "entPhysicalEntry." + (((resolveInstanceOid(1) =~ /\.([0-9]+)$/) ? (resolveInstanceOid(1) =~ /\.([0-9]+)$/)[0][1] : ''))
    event.setAlertKey(alertKey)
    def summary = "Hw Brd Auto Swt" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(3)
    event.setEventType("1")
    def dyn = event.getDynamicFields() ?: [:]
    dyn["entPhysicalName"] = varbinds.get("entPhysicalName")
    dyn["entPhysicalIndex"] = varbinds.get("entPhysicalIndex")
    event.setDynamicFields(dyn)
}
// --- Trap: hwBrdClkLockERR (OID 1.3.6.1.4.1.2011.5.25.37.2.12) ---
if (trapRuleName == "hwBrdClkLockERR") {
    event.setAlertGroup("Board Clock Lock")
    def alertKey = "entPhysicalEntry." + (((resolveInstanceOid(1) =~ /\.([0-9]+)$/) ? (resolveInstanceOid(1) =~ /\.([0-9]+)$/)[0][1] : ''))
    event.setAlertKey(alertKey)
    def summary = "Hw Brd Clk Lock ERR" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(3)
    event.setEventType("1")
    def dyn = event.getDynamicFields() ?: [:]
    dyn["entPhysicalName"] = varbinds.get("entPhysicalName")
    dyn["entPhysicalIndex"] = varbinds.get("entPhysicalIndex")
    event.setDynamicFields(dyn)
}
// --- Trap: hwBrdClkLockERRResume (OID 1.3.6.1.4.1.2011.5.25.37.2.13) ---
if (trapRuleName == "hwBrdClkLockERRResume") {
    event.setAlertGroup("Board Clock Lock")
    def alertKey = "entPhysicalEntry." + (((resolveInstanceOid(1) =~ /\.([0-9]+)$/) ? (resolveInstanceOid(1) =~ /\.([0-9]+)$/)[0][1] : ''))
    event.setAlertKey(alertKey)
    def summary = "Hw Brd Clk Lock ERRResume" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(1)
    event.setEventType("2")
    def dyn = event.getDynamicFields() ?: [:]
    dyn["entPhysicalName"] = varbinds.get("entPhysicalName")
    dyn["entPhysicalIndex"] = varbinds.get("entPhysicalIndex")
    event.setDynamicFields(dyn)
}
// --- Trap: hwBrdRemoved (OID 1.3.6.1.4.1.2011.5.25.37.2.14) ---
if (trapRuleName == "hwBrdRemoved") {
    event.setAlertGroup("Board In/Out")
    def alertKey = "entPhysicalEntry." + (((resolveInstanceOid(1) =~ /\.([0-9]+)$/) ? (resolveInstanceOid(1) =~ /\.([0-9]+)$/)[0][1] : ''))
    event.setAlertKey(alertKey)
    def summary = "Hw Brd Removed" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(3)
    event.setEventType("1")
    def dyn = event.getDynamicFields() ?: [:]
    dyn["entPhysicalName"] = varbinds.get("entPhysicalName")
    dyn["entPhysicalIndex"] = varbinds.get("entPhysicalIndex")
    event.setDynamicFields(dyn)
}
// --- Trap: hwBrdInserted (OID 1.3.6.1.4.1.2011.5.25.37.2.15) ---
if (trapRuleName == "hwBrdInserted") {
    event.setAlertGroup("Board In/Out")
    def alertKey = "entPhysicalEntry." + (((resolveInstanceOid(1) =~ /\.([0-9]+)$/) ? (resolveInstanceOid(1) =~ /\.([0-9]+)$/)[0][1] : ''))
    event.setAlertKey(alertKey)
    def summary = "Hw Brd Inserted" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(1)
    event.setEventType("2")
    def dyn = event.getDynamicFields() ?: [:]
    dyn["entPhysicalName"] = varbinds.get("entPhysicalName")
    dyn["entPhysicalIndex"] = varbinds.get("entPhysicalIndex")
    event.setDynamicFields(dyn)
}
// --- Trap: hwBrdUp (OID 1.3.6.1.4.1.2011.5.25.37.2.16) ---
if (trapRuleName == "hwBrdUp") {
    event.setAlertGroup("Board Register")
    def alertKey = "entPhysicalEntry." + (((resolveInstanceOid(1) =~ /\.([0-9]+)$/) ? (resolveInstanceOid(1) =~ /\.([0-9]+)$/)[0][1] : ''))
    event.setAlertKey(alertKey)
    def summary = "Hw Brd Up" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(2)
    event.setEventType("13")
    def dyn = event.getDynamicFields() ?: [:]
    dyn["entPhysicalName"] = varbinds.get("entPhysicalName")
    dyn["entPhysicalIndex"] = varbinds.get("entPhysicalIndex")
    event.setDynamicFields(dyn)
}
// --- Trap: hwClkSrcMiss (OID 1.3.6.1.4.1.2011.5.25.37.2.17) ---
if (trapRuleName == "hwClkSrcMiss") {
    event.setAlertGroup("Clock Source LOS")
    def alertKey = "entPhysicalEntry." + (((resolveInstanceOid(1) =~ /\.([0-9]+)$/) ? (resolveInstanceOid(1) =~ /\.([0-9]+)$/)[0][1] : ''))
    event.setAlertKey(alertKey)
    def summary = "Hw Clk Src Miss" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(3)
    event.setEventType("1")
    def dyn = event.getDynamicFields() ?: [:]
    dyn["entPhysicalName"] = varbinds.get("entPhysicalName")
    dyn["entPhysicalIndex"] = varbinds.get("entPhysicalIndex")
    event.setDynamicFields(dyn)
}
// --- Trap: hwClkAllSrcLost (OID 1.3.6.1.4.1.2011.5.25.37.2.18) ---
if (trapRuleName == "hwClkAllSrcLost") {
    event.setAlertGroup("Clock All Source")
    def alertKey = "entPhysicalEntry." + (((resolveInstanceOid(1) =~ /\.([0-9]+)$/) ? (resolveInstanceOid(1) =~ /\.([0-9]+)$/)[0][1] : ''))
    event.setAlertKey(alertKey)
    def summary = "Hw Clk All Src Lost" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(3)
    event.setEventType("1")
    def dyn = event.getDynamicFields() ?: [:]
    dyn["entPhysicalName"] = varbinds.get("entPhysicalName")
    dyn["entPhysicalIndex"] = varbinds.get("entPhysicalIndex")
    event.setDynamicFields(dyn)
}
// --- Trap: hwClkAllSrcLostResume (OID 1.3.6.1.4.1.2011.5.25.37.2.19) ---
if (trapRuleName == "hwClkAllSrcLostResume") {
    event.setAlertGroup("Clock All Source")
    def alertKey = "entPhysicalEntry." + (((resolveInstanceOid(1) =~ /\.([0-9]+)$/) ? (resolveInstanceOid(1) =~ /\.([0-9]+)$/)[0][1] : ''))
    event.setAlertKey(alertKey)
    def summary = "Hw Clk All Src Lost Resume" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(1)
    event.setEventType("2")
    def dyn = event.getDynamicFields() ?: [:]
    dyn["entPhysicalName"] = varbinds.get("entPhysicalName")
    dyn["entPhysicalIndex"] = varbinds.get("entPhysicalIndex")
    event.setDynamicFields(dyn)
}
// --- Trap: hwClkFail (OID 1.3.6.1.4.1.2011.5.25.37.2.20) ---
if (trapRuleName == "hwClkFail") {
    event.setAlertGroup("Clock Hardware")
    def alertKey = "entPhysicalEntry." + (((resolveInstanceOid(1) =~ /\.([0-9]+)$/) ? (resolveInstanceOid(1) =~ /\.([0-9]+)$/)[0][1] : ''))
    event.setAlertKey(alertKey)
    def summary = "Hw Clk Fail" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(4)
    event.setEventType("1")
    def dyn = event.getDynamicFields() ?: [:]
    dyn["entPhysicalName"] = varbinds.get("entPhysicalName")
    dyn["entPhysicalIndex"] = varbinds.get("entPhysicalIndex")
    event.setDynamicFields(dyn)
}
// --- Trap: hwClkFailResume (OID 1.3.6.1.4.1.2011.5.25.37.2.21) ---
if (trapRuleName == "hwClkFailResume") {
    event.setAlertGroup("Clock Hardware")
    def alertKey = "entPhysicalEntry." + (((resolveInstanceOid(1) =~ /\.([0-9]+)$/) ? (resolveInstanceOid(1) =~ /\.([0-9]+)$/)[0][1] : ''))
    event.setAlertKey(alertKey)
    def summary = "Hw Clk Fail Resume" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(1)
    event.setEventType("2")
    def dyn = event.getDynamicFields() ?: [:]
    dyn["entPhysicalName"] = varbinds.get("entPhysicalName")
    dyn["entPhysicalIndex"] = varbinds.get("entPhysicalIndex")
    event.setDynamicFields(dyn)
}
// --- Trap: hwClkNoHeartbeat (OID 1.3.6.1.4.1.2011.5.25.37.2.22) ---
if (trapRuleName == "hwClkNoHeartbeat") {
    event.setAlertGroup("Clock Heartbeat")
    def alertKey = "entPhysicalEntry." + (((resolveInstanceOid(1) =~ /\.([0-9]+)$/) ? (resolveInstanceOid(1) =~ /\.([0-9]+)$/)[0][1] : ''))
    event.setAlertKey(alertKey)
    def summary = "Hw Clk No Heartbeat" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(3)
    event.setEventType("1")
    def dyn = event.getDynamicFields() ?: [:]
    dyn["entPhysicalName"] = varbinds.get("entPhysicalName")
    dyn["entPhysicalIndex"] = varbinds.get("entPhysicalIndex")
    event.setDynamicFields(dyn)
}
// --- Trap: hwClkNoHeartbeatResume (OID 1.3.6.1.4.1.2011.5.25.37.2.23) ---
if (trapRuleName == "hwClkNoHeartbeatResume") {
    event.setAlertGroup("Clock Heartbeat")
    def alertKey = "entPhysicalEntry." + (((resolveInstanceOid(1) =~ /\.([0-9]+)$/) ? (resolveInstanceOid(1) =~ /\.([0-9]+)$/)[0][1] : ''))
    event.setAlertKey(alertKey)
    def summary = "Hw Clk No Heartbeat Resume" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(1)
    event.setEventType("2")
    def dyn = event.getDynamicFields() ?: [:]
    dyn["entPhysicalName"] = varbinds.get("entPhysicalName")
    dyn["entPhysicalIndex"] = varbinds.get("entPhysicalIndex")
    event.setDynamicFields(dyn)
}
// --- Trap: hwLPULostSynAlarm (OID 1.3.6.1.4.1.2011.5.25.37.2.24) ---
if (trapRuleName == "hwLPULostSynAlarm") {
    event.setAlertGroup("LPU Sync")
    def alertKey = "entPhysicalEntry." + (((resolveInstanceOid(1) =~ /\.([0-9]+)$/) ? (resolveInstanceOid(1) =~ /\.([0-9]+)$/)[0][1] : ''))
    event.setAlertKey(alertKey)
    def summary = "Hw LPULost Syn Alarm" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(3)
    event.setEventType("1")
    def dyn = event.getDynamicFields() ?: [:]
    dyn["entPhysicalName"] = varbinds.get("entPhysicalName")
    dyn["entPhysicalIndex"] = varbinds.get("entPhysicalIndex")
    event.setDynamicFields(dyn)
}
// --- Trap: hwLPUOpenChannelError (OID 1.3.6.1.4.1.2011.5.25.37.2.25) ---
if (trapRuleName == "hwLPUOpenChannelError") {
    event.setAlertGroup("LPU Open")
    def alertKey = "entPhysicalEntry." + (((resolveInstanceOid(1) =~ /\.([0-9]+)$/) ? (resolveInstanceOid(1) =~ /\.([0-9]+)$/)[0][1] : ''))
    event.setAlertKey(alertKey)
    def summary = "Hw LPUOpen Channel Error" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(3)
    event.setEventType("1")
    def dyn = event.getDynamicFields() ?: [:]
    dyn["entPhysicalName"] = varbinds.get("entPhysicalName")
    dyn["entPhysicalIndex"] = varbinds.get("entPhysicalIndex")
    event.setDynamicFields(dyn)
}
// --- Trap: hwLPUSlfTstErr (OID 1.3.6.1.4.1.2011.5.25.37.2.26) ---
if (trapRuleName == "hwLPUSlfTstErr") {
    event.setAlertGroup("LPU Selftest")
    def alertKey = "entPhysicalEntry." + (((resolveInstanceOid(1) =~ /\.([0-9]+)$/) ? (resolveInstanceOid(1) =~ /\.([0-9]+)$/)[0][1] : ''))
    event.setAlertKey(alertKey)
    def summary = "Hw LPUSlf Tst Err" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(3)
    event.setEventType("1")
    def dyn = event.getDynamicFields() ?: [:]
    dyn["entPhysicalName"] = varbinds.get("entPhysicalName")
    dyn["entPhysicalIndex"] = varbinds.get("entPhysicalIndex")
    event.setDynamicFields(dyn)
}
// --- Trap: hwLPU3ClkSwitch (OID 1.3.6.1.4.1.2011.5.25.37.2.27) ---
if (trapRuleName == "hwLPU3ClkSwitch") {
    event.setAlertGroup("LPU 3 Class Clock")
    def alertKey = "entPhysicalEntry." + (((resolveInstanceOid(1) =~ /\.([0-9]+)$/) ? (resolveInstanceOid(1) =~ /\.([0-9]+)$/)[0][1] : ''))
    event.setAlertKey(alertKey)
    def summary = "Hw LPU3 Clk Switch" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(3)
    event.setEventType("1")
    def dyn = event.getDynamicFields() ?: [:]
    dyn["entPhysicalName"] = varbinds.get("entPhysicalName")
    dyn["entPhysicalIndex"] = varbinds.get("entPhysicalIndex")
    event.setDynamicFields(dyn)
}
// --- Trap: hwSFULostHrtReset (OID 1.3.6.1.4.1.2011.5.25.37.2.28) ---
if (trapRuleName == "hwSFULostHrtReset") {
    event.setAlertGroup("SFU Reset Heartbeat Lost")
    def alertKey = "entPhysicalEntry." + (((resolveInstanceOid(1) =~ /\.([0-9]+)$/) ? (resolveInstanceOid(1) =~ /\.([0-9]+)$/)[0][1] : ''))
    event.setAlertKey(alertKey)
    def summary = "Hw SFULost Hrt Reset" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(3)
    event.setEventType("1")
    def dyn = event.getDynamicFields() ?: [:]
    dyn["entPhysicalName"] = varbinds.get("entPhysicalName")
    dyn["entPhysicalIndex"] = varbinds.get("entPhysicalIndex")
    event.setDynamicFields(dyn)
}
// --- Trap: hwSFULinkLostReset (OID 1.3.6.1.4.1.2011.5.25.37.2.29) ---
if (trapRuleName == "hwSFULinkLostReset") {
    event.setAlertGroup("SFU Reset Link Lost")
    def alertKey = "entPhysicalEntry." + (((resolveInstanceOid(1) =~ /\.([0-9]+)$/) ? (resolveInstanceOid(1) =~ /\.([0-9]+)$/)[0][1] : ''))
    event.setAlertKey(alertKey)
    def summary = "Hw SFULink Lost Reset" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(3)
    event.setEventType("1")
    def dyn = event.getDynamicFields() ?: [:]
    dyn["entPhysicalName"] = varbinds.get("entPhysicalName")
    dyn["entPhysicalIndex"] = varbinds.get("entPhysicalIndex")
    event.setDynamicFields(dyn)
}
// --- Trap: hwSFUChannelLinkLost (OID 1.3.6.1.4.1.2011.5.25.37.2.30) ---
if (trapRuleName == "hwSFUChannelLinkLost") {
    event.setAlertGroup("SFU Input Channel Link")
    def alertKey = "entPhysicalEntry." + (((resolveInstanceOid(1) =~ /\.([0-9]+)$/) ? (resolveInstanceOid(1) =~ /\.([0-9]+)$/)[0][1] : ''))
    event.setAlertKey(alertKey)
    def summary = "Hw SFUChannel Link Lost" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(3)
    event.setEventType("1")
    def dyn = event.getDynamicFields() ?: [:]
    dyn["entPhysicalName"] = varbinds.get("entPhysicalName")
    dyn["entPhysicalIndex"] = varbinds.get("entPhysicalIndex")
    event.setDynamicFields(dyn)
}
// --- Trap: hwSFUInChannelOpenFail (OID 1.3.6.1.4.1.2011.5.25.37.2.31) ---
if (trapRuleName == "hwSFUInChannelOpenFail") {
    event.setAlertGroup("SFU Input Channel Open")
    def alertKey = "entPhysicalEntry." + (((resolveInstanceOid(1) =~ /\.([0-9]+)$/) ? (resolveInstanceOid(1) =~ /\.([0-9]+)$/)[0][1] : ''))
    event.setAlertKey(alertKey)
    def summary = "Hw SFUIn Channel Open Fail" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(3)
    event.setEventType("1")
    def dyn = event.getDynamicFields() ?: [:]
    dyn["entPhysicalName"] = varbinds.get("entPhysicalName")
    dyn["entPhysicalIndex"] = varbinds.get("entPhysicalIndex")
    event.setDynamicFields(dyn)
}
// --- Trap: hwVoltSensorFail (OID 1.3.6.1.4.1.2011.5.25.37.2.32) ---
if (trapRuleName == "hwVoltSensorFail") {
    event.setAlertGroup("Volt Sensor")
    def alertKey = "entPhysicalEntry." + (((resolveInstanceOid(1) =~ /\.([0-9]+)$/) ? (resolveInstanceOid(1) =~ /\.([0-9]+)$/)[0][1] : ''))
    event.setAlertKey(alertKey)
    def summary = "Hw Volt Sensor Fail" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(3)
    event.setEventType("1")
    def dyn = event.getDynamicFields() ?: [:]
    dyn["entPhysicalName"] = varbinds.get("entPhysicalName")
    dyn["entPhysicalIndex"] = varbinds.get("entPhysicalIndex")
    event.setDynamicFields(dyn)
}
// --- Trap: hwVoltSensorFailResume (OID 1.3.6.1.4.1.2011.5.25.37.2.33) ---
if (trapRuleName == "hwVoltSensorFailResume") {
    event.setAlertGroup("Volt Sensor")
    def alertKey = "entPhysicalEntry." + (((resolveInstanceOid(1) =~ /\.([0-9]+)$/) ? (resolveInstanceOid(1) =~ /\.([0-9]+)$/)[0][1] : ''))
    event.setAlertKey(alertKey)
    def summary = "Hw Volt Sensor Fail Resume" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(1)
    event.setEventType("2")
    def dyn = event.getDynamicFields() ?: [:]
    dyn["entPhysicalName"] = varbinds.get("entPhysicalName")
    dyn["entPhysicalIndex"] = varbinds.get("entPhysicalIndex")
    event.setDynamicFields(dyn)
}
// --- Trap: hwVoltBtmC (OID 1.3.6.1.4.1.2011.5.25.37.2.34) ---
if (trapRuleName == "hwVoltBtmC") {
    event.setAlertGroup("Board Voltage Below Threshold")
    def alertKey = "entPhysicalEntry." + (((resolveInstanceOid(1) =~ /\.([0-9]+)$/) ? (resolveInstanceOid(1) =~ /\.([0-9]+)$/)[0][1] : ''))
    event.setAlertKey(alertKey)
    def summary = "Hw Volt Btm C" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(5)
    event.setEventType("1")
    def dyn = event.getDynamicFields() ?: [:]
    dyn["entPhysicalName"] = varbinds.get("entPhysicalName")
    dyn["entPhysicalIndex"] = varbinds.get("entPhysicalIndex")
    event.setDynamicFields(dyn)
}
// --- Trap: hwVoltBtmCResume (OID 1.3.6.1.4.1.2011.5.25.37.2.35) ---
if (trapRuleName == "hwVoltBtmCResume") {
    event.setAlertGroup("Board Voltage Below Threshold")
    def alertKey = "entPhysicalEntry." + (((resolveInstanceOid(1) =~ /\.([0-9]+)$/) ? (resolveInstanceOid(1) =~ /\.([0-9]+)$/)[0][1] : ''))
    event.setAlertKey(alertKey)
    def summary = "Hw Volt Btm CResume" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(1)
    event.setEventType("2")
    def dyn = event.getDynamicFields() ?: [:]
    dyn["entPhysicalName"] = varbinds.get("entPhysicalName")
    dyn["entPhysicalIndex"] = varbinds.get("entPhysicalIndex")
    event.setDynamicFields(dyn)
}
// --- Trap: hwVoltSprC (OID 1.3.6.1.4.1.2011.5.25.37.2.36) ---
if (trapRuleName == "hwVoltSprC") {
    event.setAlertGroup("Board Voltage Over Threshold")
    def alertKey = "entPhysicalEntry." + (((resolveInstanceOid(1) =~ /\.([0-9]+)$/) ? (resolveInstanceOid(1) =~ /\.([0-9]+)$/)[0][1] : ''))
    event.setAlertKey(alertKey)
    def summary = "Hw Volt Spr C" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(5)
    event.setEventType("1")
    def dyn = event.getDynamicFields() ?: [:]
    dyn["entPhysicalName"] = varbinds.get("entPhysicalName")
    dyn["entPhysicalIndex"] = varbinds.get("entPhysicalIndex")
    event.setDynamicFields(dyn)
}
// --- Trap: hwVoltSprCResume (OID 1.3.6.1.4.1.2011.5.25.37.2.37) ---
if (trapRuleName == "hwVoltSprCResume") {
    event.setAlertGroup("Board Voltage Over Threshold")
    def alertKey = "entPhysicalEntry." + (((resolveInstanceOid(1) =~ /\.([0-9]+)$/) ? (resolveInstanceOid(1) =~ /\.([0-9]+)$/)[0][1] : ''))
    event.setAlertKey(alertKey)
    def summary = "Hw Volt Spr CResume" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(1)
    event.setEventType("2")
    def dyn = event.getDynamicFields() ?: [:]
    dyn["entPhysicalName"] = varbinds.get("entPhysicalName")
    dyn["entPhysicalIndex"] = varbinds.get("entPhysicalIndex")
    event.setDynamicFields(dyn)
}
// --- Trap: hwVoltBtmM (OID 1.3.6.1.4.1.2011.5.25.37.2.38) ---
if (trapRuleName == "hwVoltBtmM") {
    event.setAlertGroup("Board Voltage Below Threshold")
    def alertKey = "entPhysicalEntry." + (((resolveInstanceOid(1) =~ /\.([0-9]+)$/) ? (resolveInstanceOid(1) =~ /\.([0-9]+)$/)[0][1] : ''))
    event.setAlertKey(alertKey)
    def summary = "Hw Volt Btm M" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(4)
    event.setEventType("1")
    def dyn = event.getDynamicFields() ?: [:]
    dyn["entPhysicalName"] = varbinds.get("entPhysicalName")
    dyn["entPhysicalIndex"] = varbinds.get("entPhysicalIndex")
    event.setDynamicFields(dyn)
}
// --- Trap: hwVoltBtmMResume (OID 1.3.6.1.4.1.2011.5.25.37.2.39) ---
if (trapRuleName == "hwVoltBtmMResume") {
    event.setAlertGroup("Board Voltage Below Threshold")
    def alertKey = "entPhysicalEntry." + (((resolveInstanceOid(1) =~ /\.([0-9]+)$/) ? (resolveInstanceOid(1) =~ /\.([0-9]+)$/)[0][1] : ''))
    event.setAlertKey(alertKey)
    def summary = "Hw Volt Btm MResume" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(1)
    event.setEventType("2")
    def dyn = event.getDynamicFields() ?: [:]
    dyn["entPhysicalName"] = varbinds.get("entPhysicalName")
    dyn["entPhysicalIndex"] = varbinds.get("entPhysicalIndex")
    event.setDynamicFields(dyn)
}
// --- Trap: hwVoltSprM (OID 1.3.6.1.4.1.2011.5.25.37.2.40) ---
if (trapRuleName == "hwVoltSprM") {
    event.setAlertGroup("Board Voltage Over Threshold")
    def alertKey = "entPhysicalEntry." + (((resolveInstanceOid(1) =~ /\.([0-9]+)$/) ? (resolveInstanceOid(1) =~ /\.([0-9]+)$/)[0][1] : ''))
    event.setAlertKey(alertKey)
    def summary = "Hw Volt Spr M" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(4)
    event.setEventType("1")
    def dyn = event.getDynamicFields() ?: [:]
    dyn["entPhysicalName"] = varbinds.get("entPhysicalName")
    dyn["entPhysicalIndex"] = varbinds.get("entPhysicalIndex")
    event.setDynamicFields(dyn)
}
// --- Trap: hwVoltSprMResume (OID 1.3.6.1.4.1.2011.5.25.37.2.41) ---
if (trapRuleName == "hwVoltSprMResume") {
    event.setAlertGroup("Board Voltage Over Threshold")
    def alertKey = "entPhysicalEntry." + (((resolveInstanceOid(1) =~ /\.([0-9]+)$/) ? (resolveInstanceOid(1) =~ /\.([0-9]+)$/)[0][1] : ''))
    event.setAlertKey(alertKey)
    def summary = "Hw Volt Spr MResume" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(1)
    event.setEventType("2")
    def dyn = event.getDynamicFields() ?: [:]
    dyn["entPhysicalName"] = varbinds.get("entPhysicalName")
    dyn["entPhysicalIndex"] = varbinds.get("entPhysicalIndex")
    event.setDynamicFields(dyn)
}
// --- Trap: hwTempSensorFail (OID 1.3.6.1.4.1.2011.5.25.37.2.42) ---
if (trapRuleName == "hwTempSensorFail") {
    event.setAlertGroup("Board Temperature Sensor")
    def alertKey = "entPhysicalEntry." + (((resolveInstanceOid(1) =~ /\.([0-9]+)$/) ? (resolveInstanceOid(1) =~ /\.([0-9]+)$/)[0][1] : ''))
    event.setAlertKey(alertKey)
    def summary = "Hw Temp Sensor Fail" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(3)
    event.setEventType("1")
    def dyn = event.getDynamicFields() ?: [:]
    dyn["entPhysicalName"] = varbinds.get("entPhysicalName")
    dyn["entPhysicalIndex"] = varbinds.get("entPhysicalIndex")
    event.setDynamicFields(dyn)
}
// --- Trap: hwTempSensorFailResume (OID 1.3.6.1.4.1.2011.5.25.37.2.43) ---
if (trapRuleName == "hwTempSensorFailResume") {
    event.setAlertGroup("Board Temperature Sensor")
    def alertKey = "entPhysicalEntry." + (((resolveInstanceOid(1) =~ /\.([0-9]+)$/) ? (resolveInstanceOid(1) =~ /\.([0-9]+)$/)[0][1] : ''))
    event.setAlertKey(alertKey)
    def summary = "Hw Temp Sensor Fail Resume" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(1)
    event.setEventType("2")
    def dyn = event.getDynamicFields() ?: [:]
    dyn["entPhysicalName"] = varbinds.get("entPhysicalName")
    dyn["entPhysicalIndex"] = varbinds.get("entPhysicalIndex")
    event.setDynamicFields(dyn)
}
// --- Trap: hwTempMnr (OID 1.3.6.1.4.1.2011.5.25.37.2.44) ---
if (trapRuleName == "hwTempMnr") {
    event.setAlertGroup("Board Temperature Over Minor Threshold")
    def alertKey = "entPhysicalEntry." + (((resolveInstanceOid(1) =~ /\.([0-9]+)$/) ? (resolveInstanceOid(1) =~ /\.([0-9]+)$/)[0][1] : ''))
    event.setAlertKey(alertKey)
    def summary = "Hw Temp Mnr" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(3)
    event.setEventType("1")
    def dyn = event.getDynamicFields() ?: [:]
    dyn["entPhysicalName"] = varbinds.get("entPhysicalName")
    dyn["entPhysicalIndex"] = varbinds.get("entPhysicalIndex")
    event.setDynamicFields(dyn)
}
// --- Trap: hwTempMnrResume (OID 1.3.6.1.4.1.2011.5.25.37.2.45) ---
if (trapRuleName == "hwTempMnrResume") {
    event.setAlertGroup("Board Temperature Over Minor Threshold")
    def alertKey = "entPhysicalEntry." + (((resolveInstanceOid(1) =~ /\.([0-9]+)$/) ? (resolveInstanceOid(1) =~ /\.([0-9]+)$/)[0][1] : ''))
    event.setAlertKey(alertKey)
    def summary = "Hw Temp Mnr Resume" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(1)
    event.setEventType("2")
    def dyn = event.getDynamicFields() ?: [:]
    dyn["entPhysicalName"] = varbinds.get("entPhysicalName")
    dyn["entPhysicalIndex"] = varbinds.get("entPhysicalIndex")
    event.setDynamicFields(dyn)
}
// --- Trap: hwTempMjr (OID 1.3.6.1.4.1.2011.5.25.37.2.46) ---
if (trapRuleName == "hwTempMjr") {
    event.setAlertGroup("Board Temperature Over Major Threshold")
    def alertKey = "entPhysicalEntry." + (((resolveInstanceOid(1) =~ /\.([0-9]+)$/) ? (resolveInstanceOid(1) =~ /\.([0-9]+)$/)[0][1] : ''))
    event.setAlertKey(alertKey)
    def summary = "Hw Temp Mjr" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(4)
    event.setEventType("1")
    def dyn = event.getDynamicFields() ?: [:]
    dyn["entPhysicalName"] = varbinds.get("entPhysicalName")
    dyn["entPhysicalIndex"] = varbinds.get("entPhysicalIndex")
    event.setDynamicFields(dyn)
}
// --- Trap: hwTempMjrResume (OID 1.3.6.1.4.1.2011.5.25.37.2.47) ---
if (trapRuleName == "hwTempMjrResume") {
    event.setAlertGroup("Board Temperature Over major Threshold")
    def alertKey = "entPhysicalEntry." + (((resolveInstanceOid(1) =~ /\.([0-9]+)$/) ? (resolveInstanceOid(1) =~ /\.([0-9]+)$/)[0][1] : ''))
    event.setAlertKey(alertKey)
    def summary = "Hw Temp Mjr Resume" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(1)
    event.setEventType("2")
    def dyn = event.getDynamicFields() ?: [:]
    dyn["entPhysicalName"] = varbinds.get("entPhysicalName")
    dyn["entPhysicalIndex"] = varbinds.get("entPhysicalIndex")
    event.setDynamicFields(dyn)
}
// --- Trap: hwTempCtl (OID 1.3.6.1.4.1.2011.5.25.37.2.48) ---
if (trapRuleName == "hwTempCtl") {
    event.setAlertGroup("Board Temperature Over Fatal Threshold")
    def alertKey = "entPhysicalEntry." + (((resolveInstanceOid(1) =~ /\.([0-9]+)$/) ? (resolveInstanceOid(1) =~ /\.([0-9]+)$/)[0][1] : ''))
    event.setAlertKey(alertKey)
    def summary = "Hw Temp Ctl" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(5)
    event.setEventType("1")
    def dyn = event.getDynamicFields() ?: [:]
    dyn["entPhysicalName"] = varbinds.get("entPhysicalName")
    dyn["entPhysicalIndex"] = varbinds.get("entPhysicalIndex")
    event.setDynamicFields(dyn)
}
// --- Trap: hwTempCtlResume (OID 1.3.6.1.4.1.2011.5.25.37.2.49) ---
if (trapRuleName == "hwTempCtlResume") {
    event.setAlertGroup("Board Temperature Over Fatal Threshold")
    def alertKey = "entPhysicalEntry." + (((resolveInstanceOid(1) =~ /\.([0-9]+)$/) ? (resolveInstanceOid(1) =~ /\.([0-9]+)$/)[0][1] : ''))
    event.setAlertKey(alertKey)
    def summary = "Hw Temp Ctl Resume" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(1)
    event.setEventType("2")
    def dyn = event.getDynamicFields() ?: [:]
    dyn["entPhysicalName"] = varbinds.get("entPhysicalName")
    dyn["entPhysicalIndex"] = varbinds.get("entPhysicalIndex")
    event.setDynamicFields(dyn)
}
// --- Trap: hwFanHFail (OID 1.3.6.1.4.1.2011.5.25.37.2.50) ---
if (trapRuleName == "hwFanHFail") {
    event.setAlertGroup("Fan HW Status")
    def alertKey = "entPhysicalEntry." + (((resolveInstanceOid(1) =~ /\.([0-9]+)$/) ? (resolveInstanceOid(1) =~ /\.([0-9]+)$/)[0][1] : ''))
    event.setAlertKey(alertKey)
    def summary = "Hw Fan HFail" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(3)
    event.setEventType("1")
    def dyn = event.getDynamicFields() ?: [:]
    dyn["entPhysicalName"] = varbinds.get("entPhysicalName")
    dyn["entPhysicalIndex"] = varbinds.get("entPhysicalIndex")
    event.setDynamicFields(dyn)
}
// --- Trap: hwFanFail (OID 1.3.6.1.4.1.2011.5.25.37.2.51) ---
if (trapRuleName == "hwFanFail") {
    event.setAlertGroup("Fan Status")
    def alertKey = "entPhysicalEntry." + (((resolveInstanceOid(1) =~ /\.([0-9]+)$/) ? (resolveInstanceOid(1) =~ /\.([0-9]+)$/)[0][1] : ''))
    event.setAlertKey(alertKey)
    def summary = "Hw Fan Fail" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(3)
    event.setEventType("1")
    def dyn = event.getDynamicFields() ?: [:]
    dyn["entPhysicalName"] = varbinds.get("entPhysicalName")
    dyn["entPhysicalIndex"] = varbinds.get("entPhysicalIndex")
    event.setDynamicFields(dyn)
}
// --- Trap: hwFanFailResume (OID 1.3.6.1.4.1.2011.5.25.37.2.52) ---
if (trapRuleName == "hwFanFailResume") {
    event.setAlertGroup("Fan Status")
    def alertKey = "entPhysicalEntry." + (((resolveInstanceOid(1) =~ /\.([0-9]+)$/) ? (resolveInstanceOid(1) =~ /\.([0-9]+)$/)[0][1] : ''))
    event.setAlertKey(alertKey)
    def summary = "Hw Fan Fail Resume" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(1)
    event.setEventType("2")
    def dyn = event.getDynamicFields() ?: [:]
    dyn["entPhysicalName"] = varbinds.get("entPhysicalName")
    dyn["entPhysicalIndex"] = varbinds.get("entPhysicalIndex")
    event.setDynamicFields(dyn)
}
// --- Trap: hwFanAbsent (OID 1.3.6.1.4.1.2011.5.25.37.2.53) ---
if (trapRuleName == "hwFanAbsent") {
    event.setAlertGroup("MonitorBUS Status")
    def alertKey = "entPhysicalEntry." + (((resolveInstanceOid(1) =~ /\.([0-9]+)$/) ? (resolveInstanceOid(1) =~ /\.([0-9]+)$/)[0][1] : ''))
    event.setAlertKey(alertKey)
    def summary = "Hw Fan Absent" + (trapInfo.fields.contains("ifDescr") ? " on interface " + (gf[trapInfo.fields.indexOf("ifDescr") + 1] ?: "") : "") + (trapInfo.fields.contains("ifIndex") ? " (index " + (gf[trapInfo.fields.indexOf("ifIndex") + 1] ?: "") + ")" : "")
    event.setSummary(summary)
    event.setSeverity(1)
    event.setEventType("2")
    def dyn = event.getDynamicFields() ?: [:]
    dyn["entPhysicalName"] = varbinds.get("entPhysicalName")
    dyn["entPhysicalIndex"] = varbinds.get("entPhysicalIndex")
    dyn["entPhysicalName"] = varbinds.get("entPhysicalName")
    dyn["entPhysicalIndex"] = varbinds.get("entPhysicalIndex")
    dyn["entPhysicalName"] = varbinds.get("entPhysicalName")
    dyn["entPhysicalIndex"] = varbinds.get("entPhysicalIndex")
    dyn["entPhysicalName"] = varbinds.get("entPhysicalName")
    dyn["entPhysicalIndex"] = varbinds.get("entPhysicalIndex")
    dyn["entPhysicalName"] = varbinds.get("entPhysicalName")
    dyn["entPhysicalIndex"] = varbinds.get("entPhysicalIndex")
    dyn["entPhysicalName"] = varbinds.get("entPhysicalName")
    dyn["entPhysicalIndex"] = varbinds.get("entPhysicalIndex")
    dyn["entPhysicalName"] = varbinds.get("entPhysicalName")
    dyn["entPhysicalIndex"] = varbinds.get("entPhysicalIndex")
    dyn["entPhysicalName"] = varbinds.get("entPhysicalName")
    dyn["entPhysicalIndex"] = varbinds.get("entPhysicalIndex")
    dyn["entPhysicalName"] = varbinds.get("entPhysicalName")
    dyn["entPhysicalIndex"] = varbinds.get("entPhysicalIndex")
    dyn["entPhysicalName"] = varbinds.get("entPhysicalName")
    dyn["entPhysicalIndex"] = varbinds.get("entPhysicalIndex")
    dyn["entPhysicalName"] = varbinds.get("entPhysicalName")
    dyn["entPhysicalIndex"] = varbinds.get("entPhysicalIndex")
    dyn["entPhysicalName"] = varbinds.get("entPhysicalName")
    dyn["entPhysicalIndex"] = varbinds.get("entPhysicalIndex")
    dyn["entPhysicalName"] = varbinds.get("entPhysicalName")
    dyn["entPhysicalIndex"] = varbinds.get("entPhysicalIndex")
    dyn["entPhysicalName"] = varbinds.get("entPhysicalName")
    dyn["entPhysicalIndex"] = varbinds.get("entPhysicalIndex")
    dyn["entPhysicalName"] = varbinds.get("entPhysicalName")
    dyn["entPhysicalIndex"] = varbinds.get("entPhysicalIndex")
    dyn["entPhysicalName"] = varbinds.get("entPhysicalName")
    dyn["entPhysicalIndex"] = varbinds.get("entPhysicalIndex")
    dyn["entPhysicalName"] = varbinds.get("entPhysicalName")
    dyn["entPhysicalIndex"] = varbinds.get("entPhysicalIndex")
    dyn["entPhysicalName"] = varbinds.get("entPhysicalName")
    dyn["entPhysicalIndex"] = varbinds.get("entPhysicalIndex")
    dyn["entPhysicalName"] = varbinds.get("entPhysicalName")
    dyn["entPhysicalIndex"] = varbinds.get("entPhysicalIndex")
    event.setDynamicFields(dyn)
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
