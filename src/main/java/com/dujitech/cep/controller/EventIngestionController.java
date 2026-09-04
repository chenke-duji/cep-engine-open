package com.dujitech.cep.controller;

import java.util.List;
import java.util.Map;
import java.util.concurrent.Semaphore;

import jakarta.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.dujitech.cep.engine.EventProcessingChain;
import com.dujitech.cep.engine.TransportDeduplicator;
import com.dujitech.cep.model.RawEvent;
import com.dujitech.cep.store.MongoBatchWriter;
import com.dujitech.cep.model.AlarmEvent;

/**
 * REST API for event ingestion and querying.
 * <p>
 * This is the primary entry point for all collectors (SNMP Trap, Syslog,
 * File, HTTP JSON). Collectors POST raw events here; the transport
 * deduplicator filters Active-Active duplicates, then the processing
 * chain handles parsing, dedup, and persistence.
 */
@RestController
@RequestMapping("/api/v1")
public class EventIngestionController {

    private static final Logger log = LoggerFactory.getLogger(EventIngestionController.class);

    private final EventProcessingChain processingChain;
    private final TransportDeduplicator transportDeduplicator;
    private final MongoBatchWriter mongoBatchWriter;
    // LOG-08: cap concurrent event processing to avoid unbounded virtual threads.
    private final Semaphore ingestSemaphore;

    public EventIngestionController(EventProcessingChain processingChain,
                                    TransportDeduplicator transportDeduplicator,
                                    MongoBatchWriter mongoBatchWriter,
                                    @Value("${cep.ingest.max-concurrency:1000}") int maxConcurrency) {
        this.processingChain = processingChain;
        this.transportDeduplicator = transportDeduplicator;
        this.mongoBatchWriter = mongoBatchWriter;
        this.ingestSemaphore = new Semaphore(Math.max(maxConcurrency, 1));
    }

    /**
     * Ingest a single raw event.
     * Collectors POST to this endpoint.
     *
     * POST /api/v1/events
     * Body: RawEvent JSON
     */
    @PostMapping("/events")
    public ResponseEntity<Map<String, Object>> ingestEvent(@Valid @RequestBody RawEvent rawEvent) {
        log.debug("Ingesting event from source: {}, ip: {}",
                rawEvent.getSource(), rawEvent.getSourceIp());

        // Transport-level dedup: drop duplicates from Active-Active collectors
        if (transportDeduplicator.isDuplicate(rawEvent)) {
            return ResponseEntity.ok(Map.of(
                    "status", "accepted",
                    "source", rawEvent.getSource(),
                    "deduplicated", true
            ));
        }

        // Process on a virtual thread, bounded by the semaphore. If the pipeline
        // is saturated, reject with 429 so collectors back off instead of
        // spawning unbounded threads.
        if (!ingestSemaphore.tryAcquire()) {
            log.warn("Ingestion saturated; rejecting event from {}", rawEvent.getSourceIp());
            return ResponseEntity.status(HttpStatus.TOO_MANY_REQUESTS).body(Map.of(
                    "status", "rejected",
                    "reason", "too many concurrent events",
                    "source", rawEvent.getSource()
            ));
        }
        Thread.startVirtualThread(() -> {
            try {
                processingChain.process(rawEvent);
            } finally {
                ingestSemaphore.release();
            }
        });

        return ResponseEntity.ok(Map.of(
                "status", "accepted",
                "source", rawEvent.getSource()
        ));
    }

    /**
     * Ingest a batch of raw events.
     *
     * POST /api/v1/events/batch
     * Body: [RawEvent, ...]
     */
    @PostMapping("/events/batch")
    public ResponseEntity<Map<String, Object>> ingestBatch(@Valid @RequestBody List<@Valid RawEvent> events) {
        log.debug("Ingesting batch of {} events", events.size());

        int accepted = 0;
        int deduplicated = 0;
        int rejected = 0;

        for (RawEvent event : events) {
            if (transportDeduplicator.isDuplicate(event)) {
                deduplicated++;
                continue;
            }
            if (!ingestSemaphore.tryAcquire()) {
                rejected++;
                continue;
            }
            final RawEvent ev = event;
            Thread.startVirtualThread(() -> {
                try {
                    processingChain.process(ev);
                } finally {
                    ingestSemaphore.release();
                }
            });
            accepted++;
        }

        return ResponseEntity.ok(Map.of(
                "status", "accepted",
                "count", accepted,
                "deduplicated", deduplicated,
                "rejected", rejected
        ));
    }

    /**
     * Query active events for a domain.
     *
     * GET /api/v1/events?domainId=xxx&severity=4
     */
    @GetMapping("/events")
    public ResponseEntity<List<AlarmEvent>> queryEvents(
            @RequestParam String domainId,
            @RequestParam(required = false) Integer minSeverity,
            @RequestParam(required = false) String node,
            @RequestParam(defaultValue = "100") int limit) {

        var criteria = new org.springframework.data.mongodb.core.query.Criteria();
        if (minSeverity != null) {
            criteria.and("severity").gte(minSeverity);
        }
        if (node != null) {
            criteria.and("node").is(node);
        }

        List<AlarmEvent> events = mongoBatchWriter.findActiveEvents(domainId, criteria);
        return ResponseEntity.ok(events.size() > limit
                ? events.subList(0, limit) : events);
    }

    /**
     * Health check endpoint.
     *
     * GET /api/v1/health
     */
    @GetMapping("/health")
    public ResponseEntity<Map<String, Object>> health() {
        return ResponseEntity.ok(Map.of(
                "status", "UP",
                "timestamp", System.currentTimeMillis()
        ));
    }

    /**
     * Transport dedup statistics.
     *
     * GET /api/v1/stats/dedup
     */
    @GetMapping("/stats/dedup")
    public ResponseEntity<Map<String, Long>> dedupStats() {
        return ResponseEntity.ok(transportDeduplicator.getStats());
    }
}
