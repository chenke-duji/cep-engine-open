/**
 * Auto-generated from HUAWEI-IPPOOL-MIB.mib
 * Generated: 2026-08-24T18:28:29.980937600
 * Traps/Notifications (67): hwUserIPConflictAlarm, hwUserIPLeaseAlarm, hwAllocUserIPFailAlarm, hwDhcpServerDown, hwLocalIPPoolDifferWithServer, hwUsedIPReachThreshold, hwUsedIPReachThresholdResume, hwUsedDeleteUnnumberedRouter, hwPoolGroupUsedIPReachThreshold, hwPoolGroupUsedIPReachThresholdResume, hwIPPoolConstantIndexFail, hwIPv6PrefixConstantIndexFail, hwIPv6PoolConstantIndexFail, hwUsedIPExhaust, hwUsedIPExhaustResume, hwPoolGroupUsedIPExhaust, hwPoolGroupUsedIPExhaustResume, hwUsedIPv6AddressAlarm, hwUsedIPv6AddressAlarmResume, hwIPv6AddressExhaustAlarm, hwIPv6AddressExhaustAlarmResume, hwIPPoolDAPApplyUnsuccessful, hwIPPoolDAPReleaseUnsuccessful, hwIPPoolDAPSubnetFull, hwIPPoolDAPDeviceSubnetFull, hwUsedSubnetReachThreshold, hwUsedSubnetThresholdResume, hwPoolGroupUsedSubnetReachThreshold, hwPoolGroupUsedSubnetReachThresholdResume, hwUsedSubnetExhaust, hwUsedSubnetExhaustResume, hwPoolGroupUsedSubnetExhaust, hwPoolGroupUsedSubnetExhaustResume, hwIPPoolAutoBlocked, hwIPPoolAutoBlockedResume, hwDapServerIPPoolUsedSubnetReachThreshold, hwDapServerIPPoolUsedSubnetReachThresholdResume, hwDapServerIPPoolUsedSubnetExhaust, hwDapServerIPPoolUsedSubnetExhaustResume, hwDapServerIPv6PoolUsedPrefixReachThreshold, hwDapServerIPv6PoolUsedPrefixReachThresholdResume, hwDapServerIPv6PoolUsedPrefixExhaust, hwDapServerIPv6PoolUsedPrefixExhaustResume, hwIPv6PoolDAPApplyUnsuccessful, hwIPv6PoolDAPReleaseUnsuccessful, hwIPv6PoolDAPPrefixFull, hwIPv6PoolDAPDevicePrefixFull, hwIPPoolIsolatedCauseMainboardReset, hwVPNIPPoolUsageReachThreshold, hwVPNIPPoolUsageReachThresholdResume, hwVPNIPv6PoolUsageReachThreshold, hwVPNIPv6PoolUsageReachThresholdResume, hwCUPoolGroupUsedIPReachThreshold, hwCUPoolGroupUsedIPReachThresholdResume, hwCUPoolGroupUsedIPExhaust, hwCUPoolGroupUsedIPExhaustResume, hwDhcpv6ServerDown, hwIPPoolDAPDeviceSubnetFullAlarm, hwIPPoolDAPDeviceSubnetFullAlarmResume, hwIPv6PoolDAPDevicePrefixFullAlarm, hwIPv6PoolDAPDevicePrefixFullAlarmResume, hwBasUnrImportRouteReachThreshold, hwBasUnrImportRouteReachThresholdResume, hwCUAllocUserIPFailAlarm, hwCUDhcpServerDown, hwCUDhcpv6ServerDown, hwUntrustedV4ServerRcvClientReqAlarm
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

// --- hwUserIPConflictAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.8.2.2.0.1
// Fields: hwUserIPAddr, hwIPPoolName
// Description: 1. Notification/alarm name: IP address conflict 2. Notification/alarm cause: A user IP address conflict occurs.
trapMap["1.3.6.1.4.1.2011.6.8.2.2.0.1"] = [
    name: "hwUserIPConflictAlarm",
    fields: ["hwUserIPAddr", "hwIPPoolName"],
    fieldOids: ["hwUserIPAddr": "1.3.6.1.4.1.2011.6.8.2.1.1", "hwIPPoolName": "1.3.6.1.4.1.2011.6.8.1.1.1.2"]
]

// --- hwUserIPLeaseAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.8.2.2.0.2
// Fields: hwUserIPAddr
// Description: 1 Notice/Trap name: IP address lease alarm. 2 Notice/Trap generation cause: The user IP lease is over. 3 Repair suggestion: Check whether to renew configuring BAS IP pool.
trapMap["1.3.6.1.4.1.2011.6.8.2.2.0.2"] = [
    name: "hwUserIPLeaseAlarm",
    fields: ["hwUserIPAddr"],
    fieldOids: ["hwUserIPAddr": "1.3.6.1.4.1.2011.6.8.2.1.1"]
]

// --- hwAllocUserIPFailAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.8.2.2.0.3
// Fields: hwIPPoolIndex, hwIPPoolName
// Description: This object indicates the alarm generated when IP address allocation fails.
trapMap["1.3.6.1.4.1.2011.6.8.2.2.0.3"] = [
    name: "hwAllocUserIPFailAlarm",
    fields: ["hwIPPoolIndex", "hwIPPoolName"],
    fieldOids: ["hwIPPoolIndex": "1.3.6.1.4.1.2011.6.8.1.1.1.1", "hwIPPoolName": "1.3.6.1.4.1.2011.6.8.1.1.1.2"]
]

// --- hwDhcpServerDown (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.8.2.2.0.4
// Fields: hwDHCPServerAddr, hwRemoteIPPoolRouterIPAddr, hwDhcpSvrVrfName, hwDhcpSvrDownReason
// Description: This object indicates the alarm generated when the DHCP server goes Down.
trapMap["1.3.6.1.4.1.2011.6.8.2.2.0.4"] = [
    name: "hwDhcpServerDown",
    fields: ["hwDHCPServerAddr", "hwRemoteIPPoolRouterIPAddr", "hwDhcpSvrVrfName", "hwDhcpSvrDownReason"],
    fieldOids: ["hwDHCPServerAddr": "1.3.6.1.4.1.2011.6.8.2.1.2", "hwRemoteIPPoolRouterIPAddr": "1.3.6.1.4.1.2011.6.8.1.6.1.3", "hwDhcpSvrVrfName": "1.3.6.1.4.1.2011.6.8.2.1.3", "hwDhcpSvrDownReason": "1.3.6.1.4.1.2011.6.8.2.1.5"]
]

// --- hwLocalIPPoolDifferWithServer (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.8.2.2.0.5
// Fields: hwRemoteIPPoolName
// Description: This object indicates the alarm generated when the address pool gateway allocated by the DHCP server is different from the one configured locally.
trapMap["1.3.6.1.4.1.2011.6.8.2.2.0.5"] = [
    name: "hwLocalIPPoolDifferWithServer",
    fields: ["hwRemoteIPPoolName"],
    fieldOids: ["hwRemoteIPPoolName": "1.3.6.1.4.1.2011.6.8.1.6.1.2"]
]

// --- hwUsedIPReachThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.8.2.2.0.6
// Fields: hwIPPoolIndex, hwIPPoolName
// Description: This object indicates that the usage of the IP address pool exceeds the upper alarm threshold. Solution: Check configurations of the IP address pool.
trapMap["1.3.6.1.4.1.2011.6.8.2.2.0.6"] = [
    name: "hwUsedIPReachThreshold",
    fields: ["hwIPPoolIndex", "hwIPPoolName"],
    fieldOids: ["hwIPPoolIndex": "1.3.6.1.4.1.2011.6.8.1.1.1.1", "hwIPPoolName": "1.3.6.1.4.1.2011.6.8.1.1.1.2"]
]

// --- hwUsedIPReachThresholdResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.8.2.2.0.7
// Fields: hwIPPoolIndex, hwIPPoolName
// Description: This object indicates that the usage of the IP address pool falls below the lower alarm threshold.
trapMap["1.3.6.1.4.1.2011.6.8.2.2.0.7"] = [
    name: "hwUsedIPReachThresholdResume",
    fields: ["hwIPPoolIndex", "hwIPPoolName"],
    fieldOids: ["hwIPPoolIndex": "1.3.6.1.4.1.2011.6.8.1.1.1.1", "hwIPPoolName": "1.3.6.1.4.1.2011.6.8.1.1.1.2"]
]

// --- hwUsedDeleteUnnumberedRouter (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.8.2.2.0.8
// Fields: hwIPPoolIndex, hwIPPoolName
// Description: This object indicates the alarm generated when the gateway unnumbered interface bound in the address pool is deleted through board removal and reinstallation.
trapMap["1.3.6.1.4.1.2011.6.8.2.2.0.8"] = [
    name: "hwUsedDeleteUnnumberedRouter",
    fields: ["hwIPPoolIndex", "hwIPPoolName"],
    fieldOids: ["hwIPPoolIndex": "1.3.6.1.4.1.2011.6.8.1.1.1.1", "hwIPPoolName": "1.3.6.1.4.1.2011.6.8.1.1.1.2"]
]

// --- hwPoolGroupUsedIPReachThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.8.2.2.0.9
// Fields: hwIPPoolGroupIndex, hwIPPoolGroupName
// Description: This object indicates the alarm generated when the address usage of the address pool group reaches the alarm threshold.
trapMap["1.3.6.1.4.1.2011.6.8.2.2.0.9"] = [
    name: "hwPoolGroupUsedIPReachThreshold",
    fields: ["hwIPPoolGroupIndex", "hwIPPoolGroupName"],
    fieldOids: ["hwIPPoolGroupIndex": "1.3.6.1.4.1.2011.6.8.2.1.4", "hwIPPoolGroupName": "1.3.6.1.4.1.2011.6.8.1.10.1.1"]
]

// --- hwPoolGroupUsedIPReachThresholdResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.8.2.2.0.10
// Fields: hwIPPoolGroupIndex, hwIPPoolGroupName
// Description: This object indicates the alarm generated when the address usage of the address pool group falls below 90% of the alarm threshold.
trapMap["1.3.6.1.4.1.2011.6.8.2.2.0.10"] = [
    name: "hwPoolGroupUsedIPReachThresholdResume",
    fields: ["hwIPPoolGroupIndex", "hwIPPoolGroupName"],
    fieldOids: ["hwIPPoolGroupIndex": "1.3.6.1.4.1.2011.6.8.2.1.4", "hwIPPoolGroupName": "1.3.6.1.4.1.2011.6.8.1.10.1.1"]
]

// --- hwIPPoolConstantIndexFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.8.2.2.0.11
// Description: The constance index of ip pool recover failure.
trapMap["1.3.6.1.4.1.2011.6.8.2.2.0.11"] = [
    name: "hwIPPoolConstantIndexFail",
    fields: [],
    fieldOids: []
]

// --- hwIPv6PrefixConstantIndexFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.8.2.2.0.12
// Description: The constance index of ipv6 prefix pool recover failure.
trapMap["1.3.6.1.4.1.2011.6.8.2.2.0.12"] = [
    name: "hwIPv6PrefixConstantIndexFail",
    fields: [],
    fieldOids: []
]

// --- hwIPv6PoolConstantIndexFail (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.8.2.2.0.13
// Description: The constance index of ipv6 pool recover failure.
trapMap["1.3.6.1.4.1.2011.6.8.2.2.0.13"] = [
    name: "hwIPv6PoolConstantIndexFail",
    fields: [],
    fieldOids: []
]

// --- hwUsedIPExhaust (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.8.2.2.0.14
// Fields: hwIPPoolIndex, hwIPPoolName
// Description: The number of IP addresses in the IP pool is exhausted.
trapMap["1.3.6.1.4.1.2011.6.8.2.2.0.14"] = [
    name: "hwUsedIPExhaust",
    fields: ["hwIPPoolIndex", "hwIPPoolName"],
    fieldOids: ["hwIPPoolIndex": "1.3.6.1.4.1.2011.6.8.1.1.1.1", "hwIPPoolName": "1.3.6.1.4.1.2011.6.8.1.1.1.2"]
]

// --- hwUsedIPExhaustResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.8.2.2.0.15
// Fields: hwIPPoolIndex, hwIPPoolName
// Description: This object indicates that the number of IP addresses in use in an IP address pool falls below 90% of the total number of IP addresses in the address pool.
trapMap["1.3.6.1.4.1.2011.6.8.2.2.0.15"] = [
    name: "hwUsedIPExhaustResume",
    fields: ["hwIPPoolIndex", "hwIPPoolName"],
    fieldOids: ["hwIPPoolIndex": "1.3.6.1.4.1.2011.6.8.1.1.1.1", "hwIPPoolName": "1.3.6.1.4.1.2011.6.8.1.1.1.2"]
]

// --- hwPoolGroupUsedIPExhaust (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.8.2.2.0.16
// Fields: hwIPPoolGroupIndex, hwIPPoolGroupName
// Description: This object indicates the alarm generated when the addresses in an address pool group are exhausted.
trapMap["1.3.6.1.4.1.2011.6.8.2.2.0.16"] = [
    name: "hwPoolGroupUsedIPExhaust",
    fields: ["hwIPPoolGroupIndex", "hwIPPoolGroupName"],
    fieldOids: ["hwIPPoolGroupIndex": "1.3.6.1.4.1.2011.6.8.2.1.4", "hwIPPoolGroupName": "1.3.6.1.4.1.2011.6.8.1.10.1.1"]
]

// --- hwPoolGroupUsedIPExhaustResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.8.2.2.0.17
// Fields: hwIPPoolGroupIndex, hwIPPoolGroupName
// Description: This object indicates the alarm generated when the address usage of the address pool falls below 90%.
trapMap["1.3.6.1.4.1.2011.6.8.2.2.0.17"] = [
    name: "hwPoolGroupUsedIPExhaustResume",
    fields: ["hwIPPoolGroupIndex", "hwIPPoolGroupName"],
    fieldOids: ["hwIPPoolGroupIndex": "1.3.6.1.4.1.2011.6.8.2.1.4", "hwIPPoolGroupName": "1.3.6.1.4.1.2011.6.8.1.10.1.1"]
]

// --- hwUsedIPv6AddressAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.8.2.2.0.18
// Fields: hwIPv6PoolIndex, hwIPv6PoolName
// Description: This object indicates the alarm generated when the percentage of addresses in use to the total number of addresses in an IPv6 address pool exceeds the alarm threshold (80% by default).
trapMap["1.3.6.1.4.1.2011.6.8.2.2.0.18"] = [
    name: "hwUsedIPv6AddressAlarm",
    fields: ["hwIPv6PoolIndex", "hwIPv6PoolName"],
    fieldOids: ["hwIPv6PoolIndex": "1.3.6.1.4.1.2011.6.8.1.17.1.1", "hwIPv6PoolName": "1.3.6.1.4.1.2011.6.8.1.17.1.2"]
]

// --- hwUsedIPv6AddressAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.8.2.2.0.19
// Fields: hwIPv6PoolIndex, hwIPv6PoolName
// Description: This object indicates the alarm generated when the IPv6 address usage falls below 90% of the alarm threshold.
trapMap["1.3.6.1.4.1.2011.6.8.2.2.0.19"] = [
    name: "hwUsedIPv6AddressAlarmResume",
    fields: ["hwIPv6PoolIndex", "hwIPv6PoolName"],
    fieldOids: ["hwIPv6PoolIndex": "1.3.6.1.4.1.2011.6.8.1.17.1.1", "hwIPv6PoolName": "1.3.6.1.4.1.2011.6.8.1.17.1.2"]
]

// --- hwIPv6AddressExhaustAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.8.2.2.0.20
// Fields: hwIPv6PoolIndex, hwIPv6PoolName
// Description: This object indicates the alarm generated when addresses in an IPv6 address pool are exhausted and no more IPv6 addresses can be allocated.
trapMap["1.3.6.1.4.1.2011.6.8.2.2.0.20"] = [
    name: "hwIPv6AddressExhaustAlarm",
    fields: ["hwIPv6PoolIndex", "hwIPv6PoolName"],
    fieldOids: ["hwIPv6PoolIndex": "1.3.6.1.4.1.2011.6.8.1.17.1.1", "hwIPv6PoolName": "1.3.6.1.4.1.2011.6.8.1.17.1.2"]
]

// --- hwIPv6AddressExhaustAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.8.2.2.0.21
// Fields: hwIPv6PoolIndex, hwIPv6PoolName
// Description: This object indicates the alarm generated when there are addresses in the IPv6 address pool available for allocation.
trapMap["1.3.6.1.4.1.2011.6.8.2.2.0.21"] = [
    name: "hwIPv6AddressExhaustAlarmResume",
    fields: ["hwIPv6PoolIndex", "hwIPv6PoolName"],
    fieldOids: ["hwIPv6PoolIndex": "1.3.6.1.4.1.2011.6.8.1.17.1.1", "hwIPv6PoolName": "1.3.6.1.4.1.2011.6.8.1.17.1.2"]
]

// --- hwIPPoolDAPApplyUnsuccessful (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.8.2.2.0.22
// Fields: hwIPPoolName, hwIPPoolRouterIPAddr, hwIPPoolRouterIPMask, hwIPPoolDAPReason
// Description: This object indicates that the BRAS applies to a RADIUS server for address segments in a dynamic address pool but fails. The alarm is generated in the following scenarios: 1. The server fails to give ...
trapMap["1.3.6.1.4.1.2011.6.8.2.2.0.22"] = [
    name: "hwIPPoolDAPApplyUnsuccessful",
    fields: ["hwIPPoolName", "hwIPPoolRouterIPAddr", "hwIPPoolRouterIPMask", "hwIPPoolDAPReason"],
    fieldOids: ["hwIPPoolName": "1.3.6.1.4.1.2011.6.8.1.1.1.2", "hwIPPoolRouterIPAddr": "1.3.6.1.4.1.2011.6.8.1.1.1.3", "hwIPPoolRouterIPMask": "1.3.6.1.4.1.2011.6.8.1.1.1.4", "hwIPPoolDAPReason": "1.3.6.1.4.1.2011.6.8.2.1.8"]
]

// --- hwIPPoolDAPReleaseUnsuccessful (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.8.2.2.0.23
// Fields: hwIPPoolName, hwIPPoolRouterIPAddr, hwIPPoolRouterIPMask, hwIPPoolDAPReason
// Description: This object indicates that an address segment fails to be released (probably because the server does not exist).
trapMap["1.3.6.1.4.1.2011.6.8.2.2.0.23"] = [
    name: "hwIPPoolDAPReleaseUnsuccessful",
    fields: ["hwIPPoolName", "hwIPPoolRouterIPAddr", "hwIPPoolRouterIPMask", "hwIPPoolDAPReason"],
    fieldOids: ["hwIPPoolName": "1.3.6.1.4.1.2011.6.8.1.1.1.2", "hwIPPoolRouterIPAddr": "1.3.6.1.4.1.2011.6.8.1.1.1.3", "hwIPPoolRouterIPMask": "1.3.6.1.4.1.2011.6.8.1.1.1.4", "hwIPPoolDAPReason": "1.3.6.1.4.1.2011.6.8.2.1.8"]
]

// --- hwIPPoolDAPSubnetFull (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.8.2.2.0.24
// Fields: hwIPPoolName, hwIPPoolDAPName
// Description: This object indicates that the number of address segments allocated to a dynamic address pool has reached 256.
trapMap["1.3.6.1.4.1.2011.6.8.2.2.0.24"] = [
    name: "hwIPPoolDAPSubnetFull",
    fields: ["hwIPPoolName", "hwIPPoolDAPName"],
    fieldOids: ["hwIPPoolName": "1.3.6.1.4.1.2011.6.8.1.1.1.2", "hwIPPoolDAPName": "1.3.6.1.4.1.2011.6.8.2.1.7"]
]

// --- hwIPPoolDAPDeviceSubnetFull (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.8.2.2.0.25
// Description: This object indicates that the number of address segments that are dynamically applies for has reached 4096.
trapMap["1.3.6.1.4.1.2011.6.8.2.2.0.25"] = [
    name: "hwIPPoolDAPDeviceSubnetFull",
    fields: [],
    fieldOids: []
]

// --- hwUsedSubnetReachThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.8.2.2.0.26
// Fields: hwIPPoolIndex, hwIPPoolName
// Description: The number of Subnets in the IP pool exceeds the threshold.
trapMap["1.3.6.1.4.1.2011.6.8.2.2.0.26"] = [
    name: "hwUsedSubnetReachThreshold",
    fields: ["hwIPPoolIndex", "hwIPPoolName"],
    fieldOids: ["hwIPPoolIndex": "1.3.6.1.4.1.2011.6.8.1.1.1.1", "hwIPPoolName": "1.3.6.1.4.1.2011.6.8.1.1.1.2"]
]

// --- hwUsedSubnetThresholdResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.8.2.2.0.27
// Fields: hwIPPoolIndex, hwIPPoolName
// Description: The number of Subnets in the IP pool is under the threshold.
trapMap["1.3.6.1.4.1.2011.6.8.2.2.0.27"] = [
    name: "hwUsedSubnetThresholdResume",
    fields: ["hwIPPoolIndex", "hwIPPoolName"],
    fieldOids: ["hwIPPoolIndex": "1.3.6.1.4.1.2011.6.8.1.1.1.1", "hwIPPoolName": "1.3.6.1.4.1.2011.6.8.1.1.1.2"]
]

// --- hwPoolGroupUsedSubnetReachThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.8.2.2.0.28
// Fields: hwIPPoolGroupIndex, hwIPPoolGroupName
// Description: The number of Subnets in the IP pool group exceeds the threshold.
trapMap["1.3.6.1.4.1.2011.6.8.2.2.0.28"] = [
    name: "hwPoolGroupUsedSubnetReachThreshold",
    fields: ["hwIPPoolGroupIndex", "hwIPPoolGroupName"],
    fieldOids: ["hwIPPoolGroupIndex": "1.3.6.1.4.1.2011.6.8.2.1.4", "hwIPPoolGroupName": "1.3.6.1.4.1.2011.6.8.1.10.1.1"]
]

// --- hwPoolGroupUsedSubnetReachThresholdResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.8.2.2.0.29
// Fields: hwIPPoolGroupIndex, hwIPPoolGroupName
// Description: The number of Subnets in the IP pool group is under the threshold.
trapMap["1.3.6.1.4.1.2011.6.8.2.2.0.29"] = [
    name: "hwPoolGroupUsedSubnetReachThresholdResume",
    fields: ["hwIPPoolGroupIndex", "hwIPPoolGroupName"],
    fieldOids: ["hwIPPoolGroupIndex": "1.3.6.1.4.1.2011.6.8.2.1.4", "hwIPPoolGroupName": "1.3.6.1.4.1.2011.6.8.1.10.1.1"]
]

// --- hwUsedSubnetExhaust (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.8.2.2.0.30
// Fields: hwIPPoolIndex, hwIPPoolName
// Description: The number of Subnets in the IP pool is exhausted.
trapMap["1.3.6.1.4.1.2011.6.8.2.2.0.30"] = [
    name: "hwUsedSubnetExhaust",
    fields: ["hwIPPoolIndex", "hwIPPoolName"],
    fieldOids: ["hwIPPoolIndex": "1.3.6.1.4.1.2011.6.8.1.1.1.1", "hwIPPoolName": "1.3.6.1.4.1.2011.6.8.1.1.1.2"]
]

// --- hwUsedSubnetExhaustResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.8.2.2.0.31
// Fields: hwIPPoolIndex, hwIPPoolName
// Description: The number of Subnets in the IP pool is under the exhaust.
trapMap["1.3.6.1.4.1.2011.6.8.2.2.0.31"] = [
    name: "hwUsedSubnetExhaustResume",
    fields: ["hwIPPoolIndex", "hwIPPoolName"],
    fieldOids: ["hwIPPoolIndex": "1.3.6.1.4.1.2011.6.8.1.1.1.1", "hwIPPoolName": "1.3.6.1.4.1.2011.6.8.1.1.1.2"]
]

// --- hwPoolGroupUsedSubnetExhaust (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.8.2.2.0.32
// Fields: hwIPPoolGroupIndex, hwIPPoolGroupName
// Description: The number of Subnets in the IP pool group is exhausted.
trapMap["1.3.6.1.4.1.2011.6.8.2.2.0.32"] = [
    name: "hwPoolGroupUsedSubnetExhaust",
    fields: ["hwIPPoolGroupIndex", "hwIPPoolGroupName"],
    fieldOids: ["hwIPPoolGroupIndex": "1.3.6.1.4.1.2011.6.8.2.1.4", "hwIPPoolGroupName": "1.3.6.1.4.1.2011.6.8.1.10.1.1"]
]

// --- hwPoolGroupUsedSubnetExhaustResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.8.2.2.0.33
// Fields: hwIPPoolGroupIndex, hwIPPoolGroupName
// Description: The number of Subnets in the IP pool group is under the exhaust.
trapMap["1.3.6.1.4.1.2011.6.8.2.2.0.33"] = [
    name: "hwPoolGroupUsedSubnetExhaustResume",
    fields: ["hwIPPoolGroupIndex", "hwIPPoolGroupName"],
    fieldOids: ["hwIPPoolGroupIndex": "1.3.6.1.4.1.2011.6.8.2.1.4", "hwIPPoolGroupName": "1.3.6.1.4.1.2011.6.8.1.10.1.1"]
]

// --- hwIPPoolAutoBlocked (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.8.2.2.0.34
// Fields: hwIPPoolName
// Description: The address pool was automatically locked due to address allocation failures.
trapMap["1.3.6.1.4.1.2011.6.8.2.2.0.34"] = [
    name: "hwIPPoolAutoBlocked",
    fields: ["hwIPPoolName"],
    fieldOids: ["hwIPPoolName": "1.3.6.1.4.1.2011.6.8.1.1.1.2"]
]

// --- hwIPPoolAutoBlockedResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.8.2.2.0.35
// Fields: hwIPPoolName, hwIPPoolAutoBlockedResumeReason
// Description: The automatically locked address pool was unlocked.
trapMap["1.3.6.1.4.1.2011.6.8.2.2.0.35"] = [
    name: "hwIPPoolAutoBlockedResume",
    fields: ["hwIPPoolName", "hwIPPoolAutoBlockedResumeReason"],
    fieldOids: ["hwIPPoolName": "1.3.6.1.4.1.2011.6.8.1.1.1.2", "hwIPPoolAutoBlockedResumeReason": "1.3.6.1.4.1.2011.6.8.2.1.9"]
]

// --- hwDapServerIPPoolUsedSubnetReachThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.8.2.2.0.36
// Fields: hwIPPoolIndex, hwIPPoolName
// Description: The number of Subnets in the IP pool exceeds the threshold.
trapMap["1.3.6.1.4.1.2011.6.8.2.2.0.36"] = [
    name: "hwDapServerIPPoolUsedSubnetReachThreshold",
    fields: ["hwIPPoolIndex", "hwIPPoolName"],
    fieldOids: ["hwIPPoolIndex": "1.3.6.1.4.1.2011.6.8.1.1.1.1", "hwIPPoolName": "1.3.6.1.4.1.2011.6.8.1.1.1.2"]
]

// --- hwDapServerIPPoolUsedSubnetReachThresholdResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.8.2.2.0.37
// Fields: hwIPPoolIndex, hwIPPoolName
// Description: The number of Subnets in the IP pool is under the threshold.
trapMap["1.3.6.1.4.1.2011.6.8.2.2.0.37"] = [
    name: "hwDapServerIPPoolUsedSubnetReachThresholdResume",
    fields: ["hwIPPoolIndex", "hwIPPoolName"],
    fieldOids: ["hwIPPoolIndex": "1.3.6.1.4.1.2011.6.8.1.1.1.1", "hwIPPoolName": "1.3.6.1.4.1.2011.6.8.1.1.1.2"]
]

// --- hwDapServerIPPoolUsedSubnetExhaust (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.8.2.2.0.38
// Fields: hwIPPoolIndex, hwIPPoolName
// Description: The number of Subnets in the IP pool is exhausted.
trapMap["1.3.6.1.4.1.2011.6.8.2.2.0.38"] = [
    name: "hwDapServerIPPoolUsedSubnetExhaust",
    fields: ["hwIPPoolIndex", "hwIPPoolName"],
    fieldOids: ["hwIPPoolIndex": "1.3.6.1.4.1.2011.6.8.1.1.1.1", "hwIPPoolName": "1.3.6.1.4.1.2011.6.8.1.1.1.2"]
]

// --- hwDapServerIPPoolUsedSubnetExhaustResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.8.2.2.0.39
// Fields: hwIPPoolIndex, hwIPPoolName
// Description: The number of Subnets in the IP pool is under the exhaust.
trapMap["1.3.6.1.4.1.2011.6.8.2.2.0.39"] = [
    name: "hwDapServerIPPoolUsedSubnetExhaustResume",
    fields: ["hwIPPoolIndex", "hwIPPoolName"],
    fieldOids: ["hwIPPoolIndex": "1.3.6.1.4.1.2011.6.8.1.1.1.1", "hwIPPoolName": "1.3.6.1.4.1.2011.6.8.1.1.1.2"]
]

// --- hwDapServerIPv6PoolUsedPrefixReachThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.8.2.2.0.40
// Fields: hwIPv6PoolIndex, hwIPv6PoolName
// Description: The number of Prefix in the IP pool exceeds the threshold.
trapMap["1.3.6.1.4.1.2011.6.8.2.2.0.40"] = [
    name: "hwDapServerIPv6PoolUsedPrefixReachThreshold",
    fields: ["hwIPv6PoolIndex", "hwIPv6PoolName"],
    fieldOids: ["hwIPv6PoolIndex": "1.3.6.1.4.1.2011.6.8.1.17.1.1", "hwIPv6PoolName": "1.3.6.1.4.1.2011.6.8.1.17.1.2"]
]

// --- hwDapServerIPv6PoolUsedPrefixReachThresholdResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.8.2.2.0.41
// Fields: hwIPv6PoolIndex, hwIPv6PoolName
// Description: The number of Prefix in the IP pool is under the threshold.
trapMap["1.3.6.1.4.1.2011.6.8.2.2.0.41"] = [
    name: "hwDapServerIPv6PoolUsedPrefixReachThresholdResume",
    fields: ["hwIPv6PoolIndex", "hwIPv6PoolName"],
    fieldOids: ["hwIPv6PoolIndex": "1.3.6.1.4.1.2011.6.8.1.17.1.1", "hwIPv6PoolName": "1.3.6.1.4.1.2011.6.8.1.17.1.2"]
]

// --- hwDapServerIPv6PoolUsedPrefixExhaust (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.8.2.2.0.42
// Fields: hwIPv6PoolIndex, hwIPv6PoolName
// Description: The number of Prefix in the IP pool is exhausted.
trapMap["1.3.6.1.4.1.2011.6.8.2.2.0.42"] = [
    name: "hwDapServerIPv6PoolUsedPrefixExhaust",
    fields: ["hwIPv6PoolIndex", "hwIPv6PoolName"],
    fieldOids: ["hwIPv6PoolIndex": "1.3.6.1.4.1.2011.6.8.1.17.1.1", "hwIPv6PoolName": "1.3.6.1.4.1.2011.6.8.1.17.1.2"]
]

// --- hwDapServerIPv6PoolUsedPrefixExhaustResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.8.2.2.0.43
// Fields: hwIPv6PoolIndex, hwIPv6PoolName
// Description: The number of Prefix in the IP pool is under the exhaust.
trapMap["1.3.6.1.4.1.2011.6.8.2.2.0.43"] = [
    name: "hwDapServerIPv6PoolUsedPrefixExhaustResume",
    fields: ["hwIPv6PoolIndex", "hwIPv6PoolName"],
    fieldOids: ["hwIPv6PoolIndex": "1.3.6.1.4.1.2011.6.8.1.17.1.1", "hwIPv6PoolName": "1.3.6.1.4.1.2011.6.8.1.17.1.2"]
]

// --- hwIPv6PoolDAPApplyUnsuccessful (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.8.2.2.0.44
// Fields: hwDAPPrefixName, hwDAPPrefixLen, hwIPPoolDAPReason
// Description: Apply the prefix unsuccessful.
trapMap["1.3.6.1.4.1.2011.6.8.2.2.0.44"] = [
    name: "hwIPv6PoolDAPApplyUnsuccessful",
    fields: ["hwDAPPrefixName", "hwDAPPrefixLen", "hwIPPoolDAPReason"],
    fieldOids: ["hwDAPPrefixName": "1.3.6.1.4.1.2011.6.8.2.1.10", "hwDAPPrefixLen": "1.3.6.1.4.1.2011.6.8.2.1.11", "hwIPPoolDAPReason": "1.3.6.1.4.1.2011.6.8.2.1.8"]
]

// --- hwIPv6PoolDAPReleaseUnsuccessful (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.8.2.2.0.45
// Fields: hwDAPPrefixName, hwDAPPrefixLen, hwIPPoolDAPReason
// Description: Release an prefix unsuccessful.
trapMap["1.3.6.1.4.1.2011.6.8.2.2.0.45"] = [
    name: "hwIPv6PoolDAPReleaseUnsuccessful",
    fields: ["hwDAPPrefixName", "hwDAPPrefixLen", "hwIPPoolDAPReason"],
    fieldOids: ["hwDAPPrefixName": "1.3.6.1.4.1.2011.6.8.2.1.10", "hwDAPPrefixLen": "1.3.6.1.4.1.2011.6.8.2.1.11", "hwIPPoolDAPReason": "1.3.6.1.4.1.2011.6.8.2.1.8"]
]

// --- hwIPv6PoolDAPPrefixFull (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.8.2.2.0.46
// Fields: hwDAPPrefixName
// Description: The number of prefix dynamically allocated to the device reached the upper limit allowed by the dynamic prefix pool.
trapMap["1.3.6.1.4.1.2011.6.8.2.2.0.46"] = [
    name: "hwIPv6PoolDAPPrefixFull",
    fields: ["hwDAPPrefixName"],
    fieldOids: ["hwDAPPrefixName": "1.3.6.1.4.1.2011.6.8.2.1.10"]
]

// --- hwIPv6PoolDAPDevicePrefixFull (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.8.2.2.0.47
// Description: The number of prefix dynamically allocated to the device reached the maximum number allowed.
trapMap["1.3.6.1.4.1.2011.6.8.2.2.0.47"] = [
    name: "hwIPv6PoolDAPDevicePrefixFull",
    fields: [],
    fieldOids: []
]

// --- hwIPPoolIsolatedCauseMainboardReset (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.8.2.2.0.48
// Fields: hwIPPoolName
// Description: The master main control board restarted after the address pool was isolated.
trapMap["1.3.6.1.4.1.2011.6.8.2.2.0.48"] = [
    name: "hwIPPoolIsolatedCauseMainboardReset",
    fields: ["hwIPPoolName"],
    fieldOids: ["hwIPPoolName": "1.3.6.1.4.1.2011.6.8.1.1.1.2"]
]

// --- hwVPNIPPoolUsageReachThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.8.2.2.0.49
// Fields: hwPoolVPNInstance, hwVPNPoolThreshold
// Description: The IP address usage of the vpn reached the threshold.
trapMap["1.3.6.1.4.1.2011.6.8.2.2.0.49"] = [
    name: "hwVPNIPPoolUsageReachThreshold",
    fields: ["hwPoolVPNInstance", "hwVPNPoolThreshold"],
    fieldOids: ["hwPoolVPNInstance": "1.3.6.1.4.1.2011.6.8.2.1.12", "hwVPNPoolThreshold": "1.3.6.1.4.1.2011.6.8.2.1.13"]
]

// --- hwVPNIPPoolUsageReachThresholdResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.8.2.2.0.50
// Fields: hwPoolVPNInstance, hwVPNPoolThreshold
// Description: The IP address usage of the vpn fell below the threshold.
trapMap["1.3.6.1.4.1.2011.6.8.2.2.0.50"] = [
    name: "hwVPNIPPoolUsageReachThresholdResume",
    fields: ["hwPoolVPNInstance", "hwVPNPoolThreshold"],
    fieldOids: ["hwPoolVPNInstance": "1.3.6.1.4.1.2011.6.8.2.1.12", "hwVPNPoolThreshold": "1.3.6.1.4.1.2011.6.8.2.1.13"]
]

// --- hwVPNIPv6PoolUsageReachThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.8.2.2.0.51
// Fields: hwPoolVPNInstance, hwVPNPoolThreshold
// Description: The IPv6 address usage of the vpn reached the threshold.
trapMap["1.3.6.1.4.1.2011.6.8.2.2.0.51"] = [
    name: "hwVPNIPv6PoolUsageReachThreshold",
    fields: ["hwPoolVPNInstance", "hwVPNPoolThreshold"],
    fieldOids: ["hwPoolVPNInstance": "1.3.6.1.4.1.2011.6.8.2.1.12", "hwVPNPoolThreshold": "1.3.6.1.4.1.2011.6.8.2.1.13"]
]

// --- hwVPNIPv6PoolUsageReachThresholdResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.8.2.2.0.52
// Fields: hwPoolVPNInstance, hwVPNPoolThreshold
// Description: The IPv6 address usage of the vpn fell below the threshold.
trapMap["1.3.6.1.4.1.2011.6.8.2.2.0.52"] = [
    name: "hwVPNIPv6PoolUsageReachThresholdResume",
    fields: ["hwPoolVPNInstance", "hwVPNPoolThreshold"],
    fieldOids: ["hwPoolVPNInstance": "1.3.6.1.4.1.2011.6.8.2.1.12", "hwVPNPoolThreshold": "1.3.6.1.4.1.2011.6.8.2.1.13"]
]

// --- hwCUPoolGroupUsedIPReachThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.8.2.2.0.53
// Fields: hwIPPoolGroupIndex, hwIPPoolGroupName, hwUpGroupId, hwCUPoolGroupUsedIPThreshold, hwCUPoolGroupUsedIPPercent
// Description: The number of used IP addresses in the IP pool group exceeds the threshold. Repair suggestion: Check the configuration of the IP address pool group.
trapMap["1.3.6.1.4.1.2011.6.8.2.2.0.53"] = [
    name: "hwCUPoolGroupUsedIPReachThreshold",
    fields: ["hwIPPoolGroupIndex", "hwIPPoolGroupName", "hwUpGroupId", "hwCUPoolGroupUsedIPThreshold", "hwCUPoolGroupUsedIPPercent"],
    fieldOids: ["hwIPPoolGroupIndex": "1.3.6.1.4.1.2011.6.8.2.1.4", "hwIPPoolGroupName": "1.3.6.1.4.1.2011.6.8.1.10.1.1", "hwUpGroupId": "1.3.6.1.4.1.2011.6.8.2.1.14", "hwCUPoolGroupUsedIPThreshold": "1.3.6.1.4.1.2011.6.8.2.1.15", "hwCUPoolGroupUsedIPPercent": "1.3.6.1.4.1.2011.6.8.2.1.16"]
]

// --- hwCUPoolGroupUsedIPReachThresholdResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.8.2.2.0.54
// Fields: hwIPPoolGroupIndex, hwIPPoolGroupName, hwUpGroupId, hwCUPoolGroupUsedIPThreshold, hwCUPoolGroupUsedIPPercent
// Description: The number of used IP addresses in the IP pool group is under the threshold.
trapMap["1.3.6.1.4.1.2011.6.8.2.2.0.54"] = [
    name: "hwCUPoolGroupUsedIPReachThresholdResume",
    fields: ["hwIPPoolGroupIndex", "hwIPPoolGroupName", "hwUpGroupId", "hwCUPoolGroupUsedIPThreshold", "hwCUPoolGroupUsedIPPercent"],
    fieldOids: ["hwIPPoolGroupIndex": "1.3.6.1.4.1.2011.6.8.2.1.4", "hwIPPoolGroupName": "1.3.6.1.4.1.2011.6.8.1.10.1.1", "hwUpGroupId": "1.3.6.1.4.1.2011.6.8.2.1.14", "hwCUPoolGroupUsedIPThreshold": "1.3.6.1.4.1.2011.6.8.2.1.15", "hwCUPoolGroupUsedIPPercent": "1.3.6.1.4.1.2011.6.8.2.1.16"]
]

// --- hwCUPoolGroupUsedIPExhaust (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.8.2.2.0.55
// Fields: hwIPPoolGroupIndex, hwIPPoolGroupName, hwUpGroupId
// Description: The number of IP addresses in the IP pool group is exhausted.
trapMap["1.3.6.1.4.1.2011.6.8.2.2.0.55"] = [
    name: "hwCUPoolGroupUsedIPExhaust",
    fields: ["hwIPPoolGroupIndex", "hwIPPoolGroupName", "hwUpGroupId"],
    fieldOids: ["hwIPPoolGroupIndex": "1.3.6.1.4.1.2011.6.8.2.1.4", "hwIPPoolGroupName": "1.3.6.1.4.1.2011.6.8.1.10.1.1", "hwUpGroupId": "1.3.6.1.4.1.2011.6.8.2.1.14"]
]

// --- hwCUPoolGroupUsedIPExhaustResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.8.2.2.0.56
// Fields: hwIPPoolGroupIndex, hwIPPoolGroupName, hwUpGroupId
// Description: The number of IP addresses in the IP pool group is under the exhaust.
trapMap["1.3.6.1.4.1.2011.6.8.2.2.0.56"] = [
    name: "hwCUPoolGroupUsedIPExhaustResume",
    fields: ["hwIPPoolGroupIndex", "hwIPPoolGroupName", "hwUpGroupId"],
    fieldOids: ["hwIPPoolGroupIndex": "1.3.6.1.4.1.2011.6.8.2.1.4", "hwIPPoolGroupName": "1.3.6.1.4.1.2011.6.8.1.10.1.1", "hwUpGroupId": "1.3.6.1.4.1.2011.6.8.2.1.14"]
]

// --- hwDhcpv6ServerDown (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.8.2.2.0.57
// Fields: hwDHCPv6ServerAddr, hwDhcpSvrVrfName, hwDhcpSvrDownReason
// Description: This object indicates the alarm generated when the DHCPv6 server goes Down.
trapMap["1.3.6.1.4.1.2011.6.8.2.2.0.57"] = [
    name: "hwDhcpv6ServerDown",
    fields: ["hwDHCPv6ServerAddr", "hwDhcpSvrVrfName", "hwDhcpSvrDownReason"],
    fieldOids: ["hwDHCPv6ServerAddr": "1.3.6.1.4.1.2011.6.8.2.1.17", "hwDhcpSvrVrfName": "1.3.6.1.4.1.2011.6.8.2.1.3", "hwDhcpSvrDownReason": "1.3.6.1.4.1.2011.6.8.2.1.5"]
]

// --- hwIPPoolDAPDeviceSubnetFullAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.8.2.2.0.58
// Fields: hwUpGroupId
// Description: The number of address segments dynamically allocated to the device reached the maximum number allowed.
trapMap["1.3.6.1.4.1.2011.6.8.2.2.0.58"] = [
    name: "hwIPPoolDAPDeviceSubnetFullAlarm",
    fields: ["hwUpGroupId"],
    fieldOids: ["hwUpGroupId": "1.3.6.1.4.1.2011.6.8.2.1.14"]
]

// --- hwIPPoolDAPDeviceSubnetFullAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.8.2.2.0.59
// Fields: hwUpGroupId
// Description: The number of address segments dynamically allocated to the device falls below 90% of the maximum number allowed.
trapMap["1.3.6.1.4.1.2011.6.8.2.2.0.59"] = [
    name: "hwIPPoolDAPDeviceSubnetFullAlarmResume",
    fields: ["hwUpGroupId"],
    fieldOids: ["hwUpGroupId": "1.3.6.1.4.1.2011.6.8.2.1.14"]
]

// --- hwIPv6PoolDAPDevicePrefixFullAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.8.2.2.0.60
// Fields: hwUpGroupId
// Description: The number of prefix dynamically allocated to the device reached the maximum number allowed.
trapMap["1.3.6.1.4.1.2011.6.8.2.2.0.60"] = [
    name: "hwIPv6PoolDAPDevicePrefixFullAlarm",
    fields: ["hwUpGroupId"],
    fieldOids: ["hwUpGroupId": "1.3.6.1.4.1.2011.6.8.2.1.14"]
]

// --- hwIPv6PoolDAPDevicePrefixFullAlarmResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.8.2.2.0.61
// Fields: hwUpGroupId
// Description: The number of prefix dynamically allocated to the device falls below 90% of the maximum number allowed.
trapMap["1.3.6.1.4.1.2011.6.8.2.2.0.61"] = [
    name: "hwIPv6PoolDAPDevicePrefixFullAlarmResume",
    fields: ["hwUpGroupId"],
    fieldOids: ["hwUpGroupId": "1.3.6.1.4.1.2011.6.8.2.1.14"]
]

// --- hwBasUnrImportRouteReachThreshold (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.8.2.2.0.62
// Fields: hwBasUnrImportRouteThreshold
// Description: The number of BRAS UNR VPN import route exceeded the maximum value.
trapMap["1.3.6.1.4.1.2011.6.8.2.2.0.62"] = [
    name: "hwBasUnrImportRouteReachThreshold",
    fields: ["hwBasUnrImportRouteThreshold"],
    fieldOids: ["hwBasUnrImportRouteThreshold": "1.3.6.1.4.1.2011.6.8.2.1.18"]
]

// --- hwBasUnrImportRouteReachThresholdResume (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.8.2.2.0.63
// Fields: hwBasUnrImportRouteThreshold
// Description: The number of BRAS UNR VPN import route fell below the maximum value.
trapMap["1.3.6.1.4.1.2011.6.8.2.2.0.63"] = [
    name: "hwBasUnrImportRouteReachThresholdResume",
    fields: ["hwBasUnrImportRouteThreshold"],
    fieldOids: ["hwBasUnrImportRouteThreshold": "1.3.6.1.4.1.2011.6.8.2.1.18"]
]

// --- hwCUAllocUserIPFailAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.8.2.2.0.64
// Fields: hwIPPoolUpmngInstance, hwIPPoolIndex, hwIPPoolName
// Description: This object indicates the alarm generated when IP address allocation fails.
trapMap["1.3.6.1.4.1.2011.6.8.2.2.0.64"] = [
    name: "hwCUAllocUserIPFailAlarm",
    fields: ["hwIPPoolUpmngInstance", "hwIPPoolIndex", "hwIPPoolName"],
    fieldOids: ["hwIPPoolUpmngInstance": "1.3.6.1.4.1.2011.6.8.2.1.19", "hwIPPoolIndex": "1.3.6.1.4.1.2011.6.8.1.1.1.1", "hwIPPoolName": "1.3.6.1.4.1.2011.6.8.1.1.1.2"]
]

// --- hwCUDhcpServerDown (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.8.2.2.0.65
// Fields: hwIPPoolUpmngInstance, hwDHCPServerAddr, hwRemoteIPPoolRouterIPAddr, hwDhcpSvrVrfName, hwDhcpSvrDownReason
// Description: This object indicates the alarm generated when the DHCP server goes Down.
trapMap["1.3.6.1.4.1.2011.6.8.2.2.0.65"] = [
    name: "hwCUDhcpServerDown",
    fields: ["hwIPPoolUpmngInstance", "hwDHCPServerAddr", "hwRemoteIPPoolRouterIPAddr", "hwDhcpSvrVrfName", "hwDhcpSvrDownReason"],
    fieldOids: ["hwIPPoolUpmngInstance": "1.3.6.1.4.1.2011.6.8.2.1.19", "hwDHCPServerAddr": "1.3.6.1.4.1.2011.6.8.2.1.2", "hwRemoteIPPoolRouterIPAddr": "1.3.6.1.4.1.2011.6.8.1.6.1.3", "hwDhcpSvrVrfName": "1.3.6.1.4.1.2011.6.8.2.1.3", "hwDhcpSvrDownReason": "1.3.6.1.4.1.2011.6.8.2.1.5"]
]

// --- hwCUDhcpv6ServerDown (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.8.2.2.0.66
// Fields: hwIPPoolUpmngInstance, hwDHCPv6ServerAddr, hwDhcpSvrVrfName, hwDhcpSvrDownReason
// Description: This object indicates the alarm generated when the DHCPv6 server goes Down.
trapMap["1.3.6.1.4.1.2011.6.8.2.2.0.66"] = [
    name: "hwCUDhcpv6ServerDown",
    fields: ["hwIPPoolUpmngInstance", "hwDHCPv6ServerAddr", "hwDhcpSvrVrfName", "hwDhcpSvrDownReason"],
    fieldOids: ["hwIPPoolUpmngInstance": "1.3.6.1.4.1.2011.6.8.2.1.19", "hwDHCPv6ServerAddr": "1.3.6.1.4.1.2011.6.8.2.1.17", "hwDhcpSvrVrfName": "1.3.6.1.4.1.2011.6.8.2.1.3", "hwDhcpSvrDownReason": "1.3.6.1.4.1.2011.6.8.2.1.5"]
]

// --- hwUntrustedV4ServerRcvClientReqAlarm (NOTIFICATION-TYPE) ---
// OID: 1.3.6.1.4.1.2011.6.8.2.2.0.67
// Fields: hwIfPoolName, hwPoolVPNInstance, hwIfPoolVlanId, hwUserMacAddr, hwUserOption12, hwUserOption60, hwUserOption125
// Description: The Untrusted DHCP Server receives a request message.
trapMap["1.3.6.1.4.1.2011.6.8.2.2.0.67"] = [
    name: "hwUntrustedV4ServerRcvClientReqAlarm",
    fields: ["hwIfPoolName", "hwPoolVPNInstance", "hwIfPoolVlanId", "hwUserMacAddr", "hwUserOption12", "hwUserOption60", "hwUserOption125"],
    fieldOids: ["hwIfPoolName": "1.3.6.1.4.1.2011.6.8.2.1.25", "hwPoolVPNInstance": "1.3.6.1.4.1.2011.6.8.2.1.12", "hwIfPoolVlanId": "1.3.6.1.4.1.2011.6.8.2.1.20", "hwUserMacAddr": "1.3.6.1.4.1.2011.6.8.2.1.21", "hwUserOption12": "1.3.6.1.4.1.2011.6.8.2.1.22", "hwUserOption60": "1.3.6.1.4.1.2011.6.8.2.1.23", "hwUserOption125": "1.3.6.1.4.1.2011.6.8.2.1.24"]
]

// ===== Parsing logic =====

// Set to true to enable diagnostic logging for this MIB parser
DEBUG = false

LOG_PREFIX = "[HUAWEI-IPPOOL-MIB]"
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
