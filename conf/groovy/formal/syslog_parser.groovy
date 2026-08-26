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

import com.raysdata.cep.model.AlarmEvent
import com.raysdata.cep.model.EventType
import com.raysdata.cep.model.Severity

def event = new AlarmEvent()
def metadata = rawEvent.getMetadata() ?: [:]

// Domain from metadata (default "default")
event.setDomainId(metadata.get("domainId")?.toString() ?: "default")

// agentType identifies the ingestion interface.
String agentType = "syslog"

// Node = syslog hostname (may be empty).
String node = metadata.get("hostname")?.toString()?.trim()

// Alert group: app name or tag, else "syslog".
String appName = metadata.get("appName")?.toString() ?: ""
String tag = metadata.get("tag")?.toString() ?: ""
String alertGroup = appName ?: (tag ?: "syslog")

// Summary: rewrite from syslog fields (never carry vendor/NcKL text).
String message = metadata.get("message")?.toString()?.trim() ?: ""
String summary = message ?: "syslog message from ${node ?: 'unknown'}"

// Severity: map syslog severity 0-7 to CEP severity 0-5.
int sev = mapSeverity(toInt(metadata.get("severity"), 6))
event.setSeverity(sev)
event.setOriginalSeverity(sev)

// Timestamp: use the syslog header timestamp when present (originTimestamp set
// by the daemon), else now.
long ts = metadata.get("timestamp") != null ? parseMillis(metadata.get("timestamp").toString()) : 0
if (ts <= 0) ts = System.currentTimeMillis()
event.setFirstOccurrence(ts)
event.setLastOccurrence(ts)

// eventType: default PROBLEM; daemon/collector may override via metadata.
String eventType = metadata.get("eventType")?.toString()
event.setEventType(eventType ?: EventType.PROBLEM.code)

// Alert key for pairing: hostname + app/tag + message summary (classifier).
String alertKey = "${appName ?: tag ?: 'syslog'}:${message}"
event.setAlertKey(alertKey)

event.setNode(node)
event.setNodeAlias(node)
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
            return Long.parseLong(s)
        } catch (Exception ignored2) {
            return 0
        }
    }
}
