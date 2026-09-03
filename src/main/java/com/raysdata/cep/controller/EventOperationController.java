package com.raysdata.cep.controller;

import java.util.List;
import java.util.Map;
import java.util.Set;

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
            String collectionName = collection == null ? DEFAULT_COLLECTION : collection;

            // The events collection is auto-created on first write. If it does
            // not exist yet (e.g. no trap/syslog event has arrived since the
            // engine started), report a clear, actionable message instead of a
            // generic "invalid query".
            if (!mongoBatchWriter.collectionExists(collectionName)) {
                log.warn("Event collection '{}' does not exist yet; returning empty result", collectionName);
                return ResponseEntity.ok(Map.of(
                        "items", List.of(),
                        "total", 0L,
                        "page", Math.max(page, 1),
                        "size", Math.min(Math.max(size, 1), 1000),
                        "collectionExists", false,
                        "message", "集合 '" + collectionName
                                + "' 尚不存在：可能还没有 trap/syslog 事件写入，请检查采集链路是否已启动。"
                ));
            }

            org.springframework.data.mongodb.core.query.Query query = parseFilter(filter);

            PagedResult<AlarmEvent> result = mongoBatchWriter.findPaged(
                    collectionName, query, page, size, sortBy, sortDesc);

            return ResponseEntity.ok(Map.of(
                    "items", result.getItems(),
                    "total", result.getTotal(),
                    "page", result.getPage(),
                    "size", result.getSize(),
                    "collectionExists", true
            ));
        } catch (Exception e) {
            // Log the full stack trace so the root cause is visible even when
            // the exception carries no message (e.g. message == null).
            log.error("Event list query failed (page={}, size={}, sortBy={}, sortDesc={}, filter={})",
                    page, size, sortBy, sortDesc, filter, e);
            String detail = e.getMessage() == null
                    ? e.getClass().getSimpleName()
                    : e.getClass().getSimpleName() + ": " + e.getMessage();
            return ResponseEntity.badRequest().body(Map.of(
                    "error", "invalid query: " + detail
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
     * <p>
     * SEC-01: the filter is user-controlled, so it is validated against an
     * allow-list of event fields and a deny-list of dangerous MongoDB query
     * operators (e.g. {@code $where}, {@code $function}, {@code $expr}). Any
     * disallowed field/operator causes an IllegalArgumentException, preventing
     * NoSQL injection and expensive queries.
     */
    private org.springframework.data.mongodb.core.query.Query parseFilter(String filter) {
        if (filter == null || filter.isBlank()) {
            return new org.springframework.data.mongodb.core.query.Query();
        }
        Document doc;
        try {
            doc = Document.parse(filter);
        } catch (Exception e) {
            throw new IllegalArgumentException("filter must be valid JSON", e);
        }
        sanitizeFilter(doc);
        return new BasicQuery(doc);
    }

    /** Fields that may be used in an event list filter. */
    private static final Set<String> ALLOWED_FILTER_FIELDS = Set.of(
            "identifier", "serial", "node", "nodeAlias", "severity",
            "originalSeverity", "summary", "status", "alertKey", "alertGroup",
            "alertGroupName", "vendor", "eventType", "specificTrap",
            "domainId", "agentType", "eventClass", "siteNum", "ticketId",
            "firstOccurrence", "lastOccurrence", "recoveryTime",
            "receiveTime", "clearTime", "deleteTime", "tally"
    );

    /** MongoDB query operators that are rejected (NoSQL injection / DoS). */
    private static final Set<String> FORBIDDEN_OPERATORS = Set.of(
            "$where", "$function", "$expr", "$accumulator", "$sampleRate",
            "$graphLookup", "$facet", "$bucket", "$bucketAuto", "$sortByCount",
            "$collStats", "$indexStats", "$lookup", "$unionWith", "$out", "$merge"
    );

    /** Operators allowed as value comparators inside a field condition. */
    private static final Set<String> ALLOWED_OPERATORS = Set.of(
            "$eq", "$ne", "$gt", "$gte", "$lt", "$lte", "$in", "$nin",
            "$exists", "$not", "$regex", "$options", "$and", "$or"
    );

    private void sanitizeFilter(Document doc) {
        if (doc == null || doc.isEmpty()) return;
        for (Map.Entry<String, Object> entry : doc.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (key.startsWith("$")) {
                // Logical grouping operator (e.g. $and / $or) — must be allowed.
                if (ALLOWED_OPERATORS.contains(key)) {
                    sanitizeValue(key, value);
                    continue;
                }
                throw new IllegalArgumentException("Forbidden query operator: " + key);
            }
            if (!ALLOWED_FILTER_FIELDS.contains(key)) {
                throw new IllegalArgumentException("Field not allowed in filter: " + key);
            }
            sanitizeValue(key, value);
        }
    }

    private void sanitizeValue(String field, Object value) {
        if (value instanceof Document d) {
            for (Map.Entry<String, Object> e : d.entrySet()) {
                String op = e.getKey();
                if (FORBIDDEN_OPERATORS.contains(op)) {
                    throw new IllegalArgumentException("Forbidden query operator: " + op);
                }
                if (op.startsWith("$") && !ALLOWED_OPERATORS.contains(op)) {
                    throw new IllegalArgumentException("Forbidden query operator: " + op);
                }
                // Recurse into nested logical groups.
                if ("$and".equals(op) || "$or".equals(op) || "$not".equals(op)) {
                    if (e.getValue() instanceof List<?> list) {
                        for (Object item : list) {
                            if (item instanceof Document nested) sanitizeFilter(nested);
                        }
                    } else if (e.getValue() instanceof Document nested) {
                        sanitizeFilter(nested);
                    }
                }
            }
        } else if (value instanceof List<?> list) {
            for (Object item : list) {
                if (item instanceof Document nested) sanitizeFilter(nested);
            }
        }
    }
}
