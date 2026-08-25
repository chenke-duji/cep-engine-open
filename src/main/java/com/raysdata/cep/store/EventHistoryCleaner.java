package com.raysdata.cep.store;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Periodically moves resolved events (Cleared Problems and Resolution events)
 * from the active collection (events_current) into the history collection
 * (events_history) after a configurable retention window.
 * <p>
 * Default retention is 5 minutes, matching the requirement that Resolution
 * events expire after ~5 minutes and cleared Problems are retained in the
 * active collection briefly before being archived.
 */
@Component
public class EventHistoryCleaner {

    private static final Logger log = LoggerFactory.getLogger(EventHistoryCleaner.class);

    /** How long a resolved event stays in events_current before moving to history (ms). */
    private final long retentionMs;

    private final MongoBatchWriter mongoBatchWriter;

    public EventHistoryCleaner(
            @Value("${cep.mongo.history.retention-ms:300000}") long retentionMs,
            MongoBatchWriter mongoBatchWriter) {
        this.retentionMs = retentionMs > 0 ? retentionMs : 300000;
        this.mongoBatchWriter = mongoBatchWriter;
    }

    /**
     * Sweep resolved events into history on a fixed interval.
     * Default: every 30 seconds.
     */
    @Scheduled(fixedDelayString = "${cep.mongo.history.cleanup-interval-ms:30000}")
    public void sweepHistory() {
        try {
            long cutoff = System.currentTimeMillis() - retentionMs;
            int moved = mongoBatchWriter.moveResolvedToHistory(cutoff);
            if (moved > 0) {
                log.info("History sweep moved {} resolved events", moved);
            }
        } catch (Exception e) {
            log.error("History sweep failed", e);
        }
    }
}
