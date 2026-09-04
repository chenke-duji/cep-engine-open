/**
 * Sample SNMP Trap parsing script.
 *
 * Input variables available in binding:
 *   rawEvent  - RawEvent object (source, sourceIp, rawEvent, metadata)
 *   rawJson   - serialized JSON of the RawEvent
 *   gson      - Gson instance for JSON parsing
 *
 * Returns: an AlarmEvent object (or a Map that can be converted to one)
 *
 * This script is stored in conf/groovy/formal/ and hot-loaded by ScriptRegistry.
 */

import com.dujitech.cep.model.AlarmEvent
import com.dujitech.cep.model.EventType
import com.dujitech.cep.model.Severity
import com.google.gson.JsonParser

// Parse the raw event payload
def rawText = rawEvent.getRawEvent()
def metadata = rawEvent.getMetadata()

// Try parsing as JSON if the raw event is JSON
def event = new AlarmEvent()

if (rawText != null && rawText.startsWith("{")) {
    def json = JsonParser.parseString(rawText).asJsonObject

    // Map JSON fields to AlarmEvent
    event.setNode(json.has("node") ? json.get("node").asString : rawEvent.getSourceIp())
    event.setSummary(json.has("summary") ? json.get("summary").asString : rawText)
    event.setSeverity(json.has("severity") ? json.get("severity").asInt : Severity.MINOR.level)
    event.setAlertKey(json.has("alertKey") ? json.get("alertKey").asString : "")
    event.setAlertGroup(json.has("alertGroup") ? json.get("alertGroup").asString : "")
    event.setEventClass(json.has("eventClass") ? json.get("eventClass").asString : "generic")
    event.setVendor(json.has("vendor") ? json.get("vendor").asString : "unknown")

    // Check for event type (Problem or Resolution)
    if (json.has("eventType")) {
        def et = json.get("eventType").asString
        event.setEventType(et)
    } else {
        event.setEventType(EventType.PROBLEM.code)
    }

    // Dynamic fields: collect unknown fields
    def dynFields = new HashMap<String, Object>()
    def knownFields = ["node", "summary", "severity", "alertKey", "alertGroup",
                       "eventClass", "vendor", "eventType"] as Set
    json.entrySet().each { entry ->
        if (!knownFields.contains(entry.key)) {
            dynFields.put(entry.key, entry.value.isJsonPrimitive()
                    ? entry.value.asString : entry.value.toString())
        }
    }
    if (!dynFields.isEmpty()) {
        event.setDynamicFields(dynFields)
    }
} else {
    // Non-JSON raw event (e.g., syslog text, trap varbinds)
    event.setNode(rawEvent.getSourceIp() ?: "unknown")
    event.setSummary(rawText ?: "no content")
    event.setSeverity(Severity.MINOR.level)
    event.setEventType(EventType.PROBLEM.code)
    event.setEventClass("generic")
}

// Set metadata from collector
if (metadata != null) {
    if (metadata.containsKey("trapOid")) {
        event.setSpecificTrap(metadata.get("trapOid").toString())
    }
    if (metadata.containsKey("enterprise")) {
        event.setEventEnterprise(metadata.get("enterprise").toString())
    }
    if (metadata.containsKey("agentType")) {
        event.setAgentType(metadata.get("agentType").toString())
    }
}

// Set domain (from metadata or default)
event.setDomainId(metadata?.get("domainId")?.toString() ?: "default")

// agentType identifies the ingestion interface (snmp_trap / syslog / ...).
// Blank defaults to "generic" so pairing stays deterministic across interfaces.
if (event.getAgentType() == null || event.getAgentType().trim().isEmpty()) {
    event.setAgentType("generic")
}

// Build unique identifier = pairKey + "|" + eventType.
// pairKey = domainId/agentType/node/alertGroup/alertKey (empty segments skipped).
// Events sharing the same pairKey across eventType 1 (Problem) and 2 (Resolution)
// form the automatic recovery condition.
def pairKey = [event.getDomainId(), event.getAgentType(), event.getNode(),
               event.getAlertGroup(), event.getAlertKey()]
        .findAll { it != null && it.toString().trim() != "" }
        .collect { it.toString().trim() }.join("|")
event.setIdentifier(pairKey + "|" + event.getEventType())

// Set original severity for audit
event.setOriginalSeverity(event.getSeverity())
event.setOriginalSummary(event.getSummary())

// Set timestamps
long now = System.currentTimeMillis()
event.setFirstOccurrence(now)
event.setLastOccurrence(now)
event.setRawEvent(rawText)

// Set status
event.setStatus("UnAcked")

return event
