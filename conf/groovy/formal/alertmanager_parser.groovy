/**
 * alertmanager_parser.groovy
 *
 * Consumes RawEvents produced by prometheus-webhook (source = "alertmanager").
 * Maps Alertmanager alert metadata (labels / annotations / fingerprint / status)
 * onto the AlarmEvent model and builds a deterministic pairing key so that
 * Problem/Resolution auto-recovery works across firing/resolved alerts.
 *
 * Input variables available in binding:
 *   rawEvent  - RawEvent object (source, sourceIp, rawEvent, metadata)
 *   rawJson   - serialized JSON of the RawEvent
 *   gson      - Gson instance for JSON parsing
 *
 * Metadata fields expected from prometheus-webhook:
 *   status (string: "firing"|"resolved"), fingerprint (string), labels (map),
 *   annotations (map), startsAt (RFC3339), endsAt (RFC3339), generatorURL,
 *   groupKey, receiver, externalURL, commonLabels, groupLabels, domainId
 *
 * agentType = source value (default "alertmanager", configurable for multi-instance).
 * alertKey = Alertmanager native fingerprint (firing and resolved share the same value).
 */

import com.raysdata.cep.model.AlarmEvent
import com.raysdata.cep.model.EventType

def event = new AlarmEvent()
def metadata = rawEvent.getMetadata() ?: [:]

// Domain from metadata (default "default")
event.setDomainId(metadata.get("domainId")?.toString() ?: "default")

// agentType: takes the source value from the RawEvent so that multi-instance
// deployments (source = "alertmanager_prod" etc.) are correctly distinguished.
String agentType = rawEvent.getSource()?.toString() ?: "alertmanager"

// Labels and annotations from the Alertmanager alert payload.
def labels = metadata.get("labels") ?: [:]
def annotations = metadata.get("annotations") ?: [:]

// Node: labels.instance > labels.node > sourceIp
String instance = labels.get("instance")?.toString()?.trim() ?: ""
String nodeLabel = labels.get("node")?.toString()?.trim() ?: ""
String sourceIp = rawEvent.getSourceIp()?.toString()?.trim() ?: ""
String node = instance ?: nodeLabel ?: sourceIp

// Alert group: labels.alertname (display purpose; fingerprint is the real key)
String alertname = labels.get("alertname")?.toString()?.trim() ?: "alertmanager"

// Alert key: use Alertmanager's native fingerprint.
// fingerprint is a hash over the complete label set computed by Alertmanager;
// it is identical for firing and resolved notifications of the same alert,
// making it the most reliable pairing key for Problem/Resolution recovery.
String fingerprint = metadata.get("fingerprint")?.toString()?.trim() ?: ""
String alertKey = fingerprint
if (!alertKey) {
    // Fallback: alertname + instance or sourceIp; if both empty, use rawEvent hash.
    String fallback = instance ?: sourceIp
    if (fallback) {
        alertKey = "${alertname}:${fallback}"
    } else {
        String rawText = rawEvent.getRawEvent()?.toString() ?: ""
        alertKey = "${alertname}:${rawText.hashCode()}"
    }
}

// Summary: annotations.summary, falling back to alertname
String summary = annotations.get("summary")?.toString()?.trim() ?: alertname

// Severity: map Alertmanager string severity to CEP 0-5
int sev = mapSeverity(labels.get("severity")?.toString())
event.setSeverity(sev)
event.setOriginalSeverity(sev)

// EventType: resolved -> RESOLUTION (code="2"), else PROBLEM (code="1")
// EventType.PROBLEM.code="1" and EventType.RESOLUTION.code="2" are defined
// in com.raysdata.cep.model.EventType. The same pairKey is shared across
// both types, enabling automatic Problem->Resolution pairing.
String status = metadata.get("status")?.toString() ?: "firing"
String eventType = (status == "resolved") ? EventType.RESOLUTION.code : EventType.PROBLEM.code
event.setEventType(eventType)

// Timestamps from startsAt (device-originated, deterministic)
long ts = parseMillis(metadata.get("startsAt")?.toString())
if (ts <= 0) {
    try { if (rawEvent.getOriginTimestamp() > 0) ts = rawEvent.getOriginTimestamp() } catch (Exception ignored) {}
}
if (ts <= 0) ts = System.currentTimeMillis()
event.setFirstOccurrence(ts)
event.setLastOccurrence(ts)

// Set fields
event.setNode(node)
event.setNodeAlias(instance)
event.setAgentType(agentType)
event.setAlertGroup(alertname)
event.setAlertKey(alertKey)
event.setSummary(summary)
event.setVendor("prometheus")
event.setEventClass("alertmanager")

// Preserve the deterministic rawEvent text (pipe-separated, for dedup)
String rawText = rawEvent.getRawEvent()?.toString() ?: ""
event.setRawEvent(rawText)

// Build pairKey = domainId|agentType|node|alertGroup|alertKey(fingerprint)
// identifier = pairKey + "|" + eventType
// Same pairKey across eventType 1 (Problem) and 2 (Resolution) enables
// automatic recovery pairing in the problem_resolution hook.
def pairKey = [event.getDomainId(), event.getAgentType(), event.getNode(),
               event.getAlertGroup(), event.getAlertKey()]
        .findAll { it != null && !it.toString().trim().isEmpty() }
        .collect { it.toString().trim() }.join("|")
event.setIdentifier(pairKey + "|" + event.getEventType())

return event

// --- Helpers ---

// Map Alertmanager string severity to CEP severity (0-5).
int mapSeverity(String sev) {
    if (sev == null) return 2
    switch (sev.toLowerCase()) {
        case "critical": return 5
        case "major":    return 4
        case "warning":  return 3
        case "warn":     return 3
        case "info":     return 2
        case "debug":    return 1
        case "trace":    return 1
        case "none":     return 0
        case "ok":       return 0
        case "resolved": return 0
        default:         return 2
    }
}

long parseMillis(String s) {
    if (s == null) return 0
    try {
        String norm = s.replace(" ", "T")
        java.time.OffsetDateTime odt = java.time.OffsetDateTime.parse(norm)
        return odt.toInstant().toEpochMilli()
    } catch (Exception e1) {
        try { return Long.parseLong(s) } catch (Exception e2) {
            System.err.println("WARN alertmanager_parser: failed to parse timestamp: " + s)
            return 0
        }
    }
}
