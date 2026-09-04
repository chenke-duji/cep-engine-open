/**
 * syslog_parser.groovy
 *
 * Consumes RawEvents produced by syslog-daemon (source = "syslog"). It maps the
 * structured syslog metadata (facility / severity / hostname / tag / message)
 * onto the AlarmEvent model and builds a deterministic pairing key so that
 * Problem/Resolution auto-recovery works across syslog events.
 *
 * Input variables available in binding:
 *   rawEvent  - RawEvent object (source, sourceIp, rawEvent, metadata)
 *   rawJson   - serialized JSON of the RawEvent
 *   gson      - Gson instance for JSON parsing
 *
 * Metadata fields expected from syslog-daemon:
 *   facility (int), facilityLabel (string), severity (int), severityLabel (string),
 *   version (int), timestamp (RFC3339), hostname, appName, procId, msgId, tag,
 *   structuredData (map), message, rawMessage (string)
 *
 * agentType is "syslog" (different ingestion interfaces never pair).
 */

import com.dujitech.cep.model.AlarmEvent
import com.dujitech.cep.model.EventType
import com.dujitech.cep.model.Severity

def event = new AlarmEvent()
def metadata = rawEvent.getMetadata() ?: [:]

// Domain from metadata (default "default")
event.setDomainId(metadata.get("domainId")?.toString() ?: "default")

// agentType identifies the ingestion interface.
String agentType = "syslog"

// Node = the device's source IP as observed by the collector (RawEvent.sourceIp),
// falling back to the syslog header hostname when no source IP is present.
String sourceIp = rawEvent.getSourceIp()?.toString()?.trim() ?: ""
// Hostname from the syslog header (may be empty).
String hostname = metadata.get("hostname")?.toString()?.trim() ?: ""
String node = sourceIp ?: hostname

// Alert group: app name or tag, else "syslog".
String appName = metadata.get("appName")?.toString() ?: ""
String tag = metadata.get("tag")?.toString() ?: ""
String alertGroup = appName ?: (tag ?: "syslog")

// Summary: rewrite from syslog fields (never carry vendor/NcKL text).
String message = metadata.get("message")?.toString()?.trim() ?: ""
String summary = message ?: "syslog message from ${hostname ?: sourceIp}"

// Severity: map syslog severity 0-7 to CEP severity 0-5.
int sev = mapSeverity(toInt(metadata.get("severity"), 6))
event.setSeverity(sev)
event.setOriginalSeverity(sev)

// Occurrence timestamps = the moment the device emitted the syslog message.
// The RFC3339 timestamp in the syslog HEADER equals the timestamp embedded in
// the message body (RFC3164/5424), so it is authoritative and can be used
// directly. Fall back to RawEvent.originTimestamp (also device-originated),
// then to the local receive time.
long ts = 0
if (metadata.get("timestamp") != null) {
    ts = parseMillis(metadata.get("timestamp").toString())
}
if (ts <= 0) {
    try {
        long ot = rawEvent.getOriginTimestamp()
        if (ot > 0) ts = normalizeMillis(ot)
    } catch (Exception ignored) {}
}
if (ts <= 0) ts = System.currentTimeMillis()
event.setFirstOccurrence(ts)
event.setLastOccurrence(ts)
// receiveTime (local receipt time, epoch millis) is set centrally by the
// engine after parsing, so we intentionally do NOT override it here.

// eventType: default PROBLEM; daemon/collector may override via metadata.
String eventType = metadata.get("eventType")?.toString()
event.setEventType(eventType ?: EventType.PROBLEM.code)

// Alert key for pairing: hostname + app/tag + message summary (classifier).
String alertKey = "${appName ?: tag ?: 'syslog'}:${message}"
event.setAlertKey(alertKey)

// Node = source IP; NodeAlias = syslog header hostname.
event.setNode(node)
event.setNodeAlias(hostname)
event.setAgentType(agentType)
event.setAlertGroup(alertGroup)
event.setSummary(summary)
event.setVendor(metadata.get("vendor")?.toString() ?: "")
event.setEventClass(metadata.get("eventClass")?.toString() ?: "syslog")

// Build pairKey = domainId/agentType/node/alertGroup/alertKey (empty skipped).
// identifier = pairKey + "|" + eventType. Same pairKey across eventType 1
// (Problem) and 2 (Resolution) forms auto-recovery.
def pairKey = [event.getDomainId(), event.getAgentType(), event.getNode(),
               event.getAlertGroup(), event.getAlertKey()]
        .findAll { it != null && !it.toString().trim().isEmpty() }
        .collect { it.toString().trim() }.join("|")
event.setIdentifier(pairKey + "|" + event.getEventType())

return event

// --- Helpers ---

// Map syslog severity (0-7) to CEP severity (0-5).
int mapSeverity(int syslogSeverity) {
    switch (syslogSeverity) {
        case 0: return 5   // emerg
        case 1: return 5   // alert
        case 2: return 5   // crit
        case 3: return 4   // err
        case 4: return 3   // warning
        case 5: return 2   // notice
        case 6: return 2   // info
        case 7: return 1   // debug
        default: return 2
    }
}

int toInt(Object v, int dflt) {
    if (v == null) return dflt
    try { return Integer.parseInt(v.toString()) } catch (Exception ignored) { return dflt }
}

long parseMillis(String s) {
    try {
        String norm = s.replace(" ", "T")
        java.time.OffsetDateTime odt = java.time.OffsetDateTime.parse(norm)
        return odt.toInstant().toEpochMilli()
    } catch (Exception ignored) {
        try {
            return normalizeMillis(Long.parseLong(s))
        } catch (Exception ignored2) {
            return 0
        }
    }
}

// Normalize epoch nanos/micros/millis to millis.
// - >= 1e17 (19+ digits): nanoseconds -> / 1,000,000
// - >= 1e14 (16+ digits): microseconds -> / 1,000
// - otherwise: assume milliseconds
long normalizeMillis(long v) {
    if (v >= 100_000_000_000_000_000L) return v / 1_000_000
    if (v >= 100_000_000_000_000L)      return v / 1_000
    return v
}
