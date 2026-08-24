package com.raysdata.cep.engine;

import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.raysdata.cep.model.RawEvent;

/**
 * Transport-level deduplication for Active-Active collector deployments.
 * <p>
 * When multiple collectors (e.g., two rsyslog instances, two SNMP Trap
 * receivers) forward the same device event, this component ensures only
 * the first copy enters the processing chain. The second is silently
 * dropped (both collectors still receive HTTP 202).
 * <p>
 * <b>Fingerprint</b>: source + sourceIp + SHA-256(rawEvent) + originTimestamp
 * <ul>
 *   <li>{@code source} - collector type (syslog, snmp_trap, etc.)</li>
 *   <li>{@code sourceIp} - the device IP that generated the event</li>
 *   <li>{@code rawEvent} - the original message content</li>
 *   <li>{@code originTimestamp} - device-side timestamp (identical across collectors)</li>
 * </ul>
 * {@code receivedAt} (collector arrival time) is deliberately excluded
 * because two collectors will have slightly different arrival times.
 * <p>
 * <b>Window</b>: entries expire after a configurable TTL (default 10s).
 * The cleanup runs on a scheduled task. At 5000 events/sec from two
 * collectors, peak memory is ~4MB.
 */
@Component
public class TransportDeduplicator {

    private static final Logger log = LoggerFactory.getLogger(TransportDeduplicator.class);

    /**
     * A seen fingerprint with its first-seen time.
     */
    private static final class SeenEntry {
        final String fingerprint;
        final long seenAt;

        SeenEntry(String fingerprint, long seenAt) {
            this.fingerprint = fingerprint;
            this.seenAt = seenAt;
        }
    }

    private final ConcurrentHashMap<String, SeenEntry> seenFingerprints = new ConcurrentHashMap<>();

    private final AtomicLong totalReceived = new AtomicLong();
    private final AtomicLong totalDropped = new AtomicLong();

    @Value("${cep.transport-dedup.ttl-ms:10000}")
    private long ttlMs;

    @Value("${cep.transport-dedup.enabled:true}")
    private boolean enabled;

    /**
     * Check if a raw event is a duplicate of one already received.
     * If it is the first occurrence, register it and return false.
     * If it is a duplicate, return true (caller should skip processing).
     *
     * @param rawEvent the event to check
     * @return true if duplicate (should be dropped), false if new
     */
    public boolean isDuplicate(RawEvent rawEvent) {
        if (!enabled) return false;

        String fingerprint = buildFingerprint(rawEvent);
        long now = System.currentTimeMillis();

        SeenEntry existing = seenFingerprints.putIfAbsent(fingerprint, new SeenEntry(fingerprint, now));
        totalReceived.incrementAndGet();

        if (existing == null) {
            // First occurrence — allow through
            return false;
        }

        // Already seen — check if within TTL window
        if (now - existing.seenAt < ttlMs) {
            totalDropped.incrementAndGet();
            log.trace("Transport duplicate dropped: source={}, ip={}",
                    rawEvent.getSource(), rawEvent.getSourceIp());
            return true;
        }

        // Entry expired — treat as new event, update timestamp
        seenFingerprints.put(fingerprint, new SeenEntry(fingerprint, now));
        return false;
    }

    /**
     * Build a content fingerprint for the raw event.
     * Excludes receivedAt (collector-specific) to ensure both collectors
     * produce the same fingerprint for the same device event.
     */
    private String buildFingerprint(RawEvent rawEvent) {
        StringBuilder sb = new StringBuilder(128);

        // Source type
        if (rawEvent.getSource() != null) {
            sb.append(rawEvent.getSource());
        }
        sb.append('|');

        // Device IP
        if (rawEvent.getSourceIp() != null) {
            sb.append(rawEvent.getSourceIp());
        }
        sb.append('|');

        // Device-originated timestamp (same across collectors)
        sb.append(rawEvent.getOriginTimestamp());
        sb.append('|');

        // Raw event content hash
        String rawContent = rawEvent.getRawEvent();
        if (rawContent != null) {
            int hash = rawContent.hashCode();
            sb.append(hash);
        }

        return sb.toString();
    }

    /**
     * Periodic cleanup of expired fingerprint entries.
     * Runs every 30 seconds by default.
     */
    @Scheduled(fixedDelayString = "${cep.transport-dedup.cleanup-interval-ms:30000}")
    public void cleanupExpired() {
        if (!enabled) return;

        long now = System.currentTimeMillis();
        int removed = 0;

        // Use iterator to safely remove expired entries
        var it = seenFingerprints.entrySet().iterator();
        while (it.hasNext()) {
            var entry = it.next();
            if (now - entry.getValue().seenAt >= ttlMs) {
                it.remove();
                removed++;
            }
        }

        if (removed > 0) {
            log.debug("Transport dedup cleanup: removed {} expired entries, {} remaining",
                    removed, seenFingerprints.size());
        }
    }

    /**
     * Get dedup statistics for monitoring.
     */
    public Map<String, Long> getStats() {
        return Map.of(
                "totalReceived", totalReceived.get(),
                "totalDropped", totalDropped.get(),
                "activeEntries", (long) seenFingerprints.size()
        );
    }

    /**
     * Clear all dedup state (for testing or admin reset).
     */
    public void clear() {
        seenFingerprints.clear();
        totalReceived.set(0);
        totalDropped.set(0);
        log.info("Transport dedup state cleared.");
    }
}
