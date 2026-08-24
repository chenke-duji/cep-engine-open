package com.raysdata.cep.controller;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.raysdata.cep.engine.EventProcessingChain;
import com.raysdata.cep.engine.TransportDeduplicator;
import com.raysdata.cep.model.RawEvent;
import com.raysdata.cep.store.MongoBatchWriter;
import com.raysdata.cep.model.AlarmEvent;

import com.google.gson.Gson;

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
    private static final Gson gson = new Gson();

    private final EventProcessingChain processingChain;
    private final TransportDeduplicator transportDeduplicator;
    private final MongoBatchWriter mongoBatchWriter;

    public EventIngestionController(EventProcessingChain processingChain,
                                    TransportDeduplicator transportDeduplicator,
                                    MongoBatchWriter mongoBatchWriter) {
        this.processingChain = processingChain;
        this.transportDeduplicator = transportDeduplicator;
        this.mongoBatchWriter = mongoBatchWriter;
    }

    /**
     * Ingest a single raw event.
     * Collectors POST to this endpoint.
     *
     * POST /api/v1/events
     * Body: RawEvent JSON
     */
    @PostMapping("/events")
    public ResponseEntity<Map<String, Object>> ingestEvent(@RequestBody RawEvent rawEvent) {
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

        // Process on a virtual thread
        Thread.startVirtualThread(() -> processingChain.process(rawEvent));

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
    public ResponseEntity<Map<String, Object>> ingestBatch(@RequestBody List<RawEvent> events) {
        log.debug("Ingesting batch of {} events", events.size());

        int accepted = 0;
        int deduplicated = 0;

        for (RawEvent event : events) {
            if (transportDeduplicator.isDuplicate(event)) {
                deduplicated++;
                continue;
            }
            Thread.startVirtualThread(() -> processingChain.process(event));
            accepted++;
        }

        return ResponseEntity.ok(Map.of(
                "status", "accepted",
                "count", accepted,
                "deduplicated", deduplicated
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
