package com.raysdata.cep.controller;

import java.util.List;
import java.util.Map;

import org.bson.Document;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.mongodb.core.query.BasicQuery;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.raysdata.cep.config.EventOperationProperties;
import com.raysdata.cep.model.AlarmEvent;
import com.raysdata.cep.model.UnresolvedEvent;
import com.raysdata.cep.store.EventOperationExecutor;
import com.raysdata.cep.store.EventOperationExecutor.OperationResult;
import com.raysdata.cep.store.MongoBatchWriter;
import com.raysdata.cep.store.MongoBatchWriter.PagedResult;

/**
 * Event console management API: paged listing, predefined operation list, and
 * bulk operation execution. All endpoints require authentication.
 */
@RestController
@RequestMapping("/api/v1")
public class EventOperationController {

    private static final Logger log = LoggerFactory.getLogger(EventOperationController.class);
    private static final String DEFAULT_COLLECTION = "events_current";

    private final MongoBatchWriter mongoBatchWriter;
    private final EventOperationProperties operationProperties;
    private final EventOperationExecutor operationExecutor;

    public EventOperationController(MongoBatchWriter mongoBatchWriter,
                                    EventOperationProperties operationProperties,
                                    EventOperationExecutor operationExecutor) {
        this.mongoBatchWriter = mongoBatchWriter;
        this.operationProperties = operationProperties;
        this.operationExecutor = operationExecutor;
    }

    /**
     * Paged event query with an optional MongoDB filter document.
     *
     * GET /api/v1/events/list?page=1&size=50&filter={"status":"Active"}&sortBy=lastOccurrence&sortDesc=true
     *
     * @param filter optional raw MongoDB query JSON (e.g. {"severity":{"$gte":4}})
     */
    @GetMapping("/events/list")
    public ResponseEntity<Map<String, Object>> listEvents(
            @RequestParam(defaultValue = "1") int page,
            @RequestParam(defaultValue = "50") int size,
            @RequestParam(required = false) String filter,
            @RequestParam(required = false) String sortBy,
            @RequestParam(defaultValue = "true") boolean sortDesc,
            @RequestParam(required = false) String collection) {
        try {
            org.springframework.data.mongodb.core.query.Query query = parseFilter(filter);

            PagedResult<AlarmEvent> result = mongoBatchWriter.findPaged(
                    collection == null ? DEFAULT_COLLECTION : collection,
                    query, page, size, sortBy, sortDesc);

            return ResponseEntity.ok(Map.of(
                    "items", result.getItems(),
                    "total", result.getTotal(),
                    "page", result.getPage(),
                    "size", result.getSize()
            ));
        } catch (Exception e) {
            log.warn("Event list query failed: {}", e.getMessage());
            return ResponseEntity.badRequest().body(Map.of(
                    "error", "invalid query: " + e.getMessage()
            ));
        }
    }

    /**
     * Paged query of unresolved events (events that no script could parse,
     * e.g. unsupported MIB traps).
     *
     * GET /api/v1/events/unresolved?page=1&size=50
     */
    @GetMapping("/events/unresolved")
    public ResponseEntity<Map<String, Object>> listUnresolved(
            @RequestParam(defaultValue = "1") int page,
            @RequestParam(defaultValue = "50") int size) {
        try {
            MongoBatchWriter.PagedResult<UnresolvedEvent> result = mongoBatchWriter.findUnresolvedPaged(page, size);
            return ResponseEntity.ok(Map.of(
                    "items", result.getItems(),
                    "total", result.getTotal(),
                    "page", result.getPage(),
                    "size", result.getSize()
            ));
        } catch (Exception e) {
            return ResponseEntity.status(500).body(Map.of("error", e.getMessage()));
        }
    }

    /**
     * Return the predefined operations for the right-click context menu.
     *
     * GET /api/v1/operations
     */
    @GetMapping("/operations")
    public ResponseEntity<Map<String, Object>> listOperations() {
        List<Map<String, Object>> ops = operationProperties.getOperations().stream()
                .map(op -> Map.<String, Object>of(
                        "name", op.getName(),
                        "menuLabel", op.getMenuLabel(),
                        "confirmMessage", op.getConfirmMessage() == null ? "" : op.getConfirmMessage(),
                        "enableWhen", op.getEnableWhen() == null ? "" : op.getEnableWhen()
                ))
                .toList();
        return ResponseEntity.ok(Map.of("operations", ops));
    }

    /**
     * Apply a predefined operation to selected events.
     *
     * POST /api/v1/events/operate
     * Body: { "operation": "ack", "identifiers": ["id1","id2"] }
     */
    @PostMapping("/events/operate")
    public ResponseEntity<Map<String, Object>> operate(@RequestBody Map<String, Object> body) {
        String operation = (String) body.get("operation");
        @SuppressWarnings("unchecked")
        List<String> identifiers = (List<String>) body.get("identifiers");

        if (operation == null || operation.isBlank()) {
            return ResponseEntity.badRequest().body(Map.of("error", "operation is required"));
        }
        if (identifiers == null || identifiers.isEmpty()) {
            return ResponseEntity.badRequest().body(Map.of("error", "identifiers must not be empty"));
        }

        OperationResult result = operationExecutor.execute(operation, identifiers);
        if (result == null) {
            return ResponseEntity.badRequest().body(Map.of(
                    "error", "unknown operation or no applicable update: " + operation
            ));
        }
        return ResponseEntity.ok(Map.of(
                "operation", result.getOperation(),
                "matched", result.getMatched(),
                "modified", result.getModified()
        ));
    }

    /**
     * Parse a raw MongoDB filter JSON into a Query. Returns an empty Query when
     * filter is null/blank (matches all documents).
     */
    private org.springframework.data.mongodb.core.query.Query parseFilter(String filter) {
        if (filter == null || filter.isBlank()) {
            return new org.springframework.data.mongodb.core.query.Query();
        }
        Document doc = Document.parse(filter);
        return new BasicQuery(doc);
    }
}
