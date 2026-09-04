package com.dujitech.cep.store;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;

import com.dujitech.cep.config.EventOperationProperties;
import com.dujitech.cep.config.EventOperationProperties.Operation;

/**
 * Applies a predefined YAML operation to a set of events.
 * <p>
 * Converts an {@link Operation}'s <code>update</code> map into a MongoTemplate
 * {@link Update} and runs a bulk update against the configured collection using
 * the <code>identifier</code> + <code>$in</code> condition.
 * <p>
 * The update document may use plain field keys (treated as $set) or explicit
 * operators ($set, $inc, $unset, $currentDate). Only server-defined operations
 * are applied; the frontend never supplies raw update content.
 */
@Component
public class EventOperationExecutor {

    private static final Logger log = LoggerFactory.getLogger(EventOperationExecutor.class);

    private final MongoTemplate mongoTemplate;
    private final EventOperationProperties operationProperties;

    public EventOperationExecutor(MongoTemplate mongoTemplate,
                                  EventOperationProperties operationProperties) {
        this.mongoTemplate = mongoTemplate;
        this.operationProperties = operationProperties;
    }

    /**
     * Apply a named operation to the given identifiers.
     *
     * @param operationName the operation id from YAML (e.g. "ack")
     * @param identifiers   selected event identifiers
     * @return a result map with matched/modified counts, or null if operation unknown
     */
    public OperationResult execute(String operationName, List<String> identifiers) {
        Operation op = operationProperties.findByName(operationName);
        if (op == null || identifiers == null || identifiers.isEmpty()) {
            return null;
        }
        String collection = op.getCollection() == null ? "events_current" : op.getCollection();
        Update update = buildUpdate(op.getUpdate());
        if (update == null) {
            log.warn("Operation '{}' has no usable update content", operationName);
            return null;
        }

        Query query = Query.query(Criteria.where("identifier").in(identifiers));
        try {
            var result = mongoTemplate.updateMulti(query, update, collection);
            log.info("Operation '{}' applied to {} identifiers: matched={}, modified={}",
                    operationName, identifiers.size(), result.getMatchedCount(), result.getModifiedCount());
            return new OperationResult(operationName, result.getMatchedCount(), result.getModifiedCount());
        } catch (Exception e) {
            log.error("Operation '{}' failed for {} identifiers", operationName, identifiers.size(), e);
            throw new RuntimeException("Operation '" + operationName + "' failed: " + e.getMessage(), e);
        }
    }

    /**
     * Build a MongoTemplate Update from the configured update map.
     * Plain field keys are treated as $set; explicit operators are honored.
     */
    @SuppressWarnings("unchecked")
    private Update buildUpdate(Map<String, Object> updateMap) {
        if (updateMap == null || updateMap.isEmpty()) {
            return null;
        }
        Update update = new Update();
        for (Map.Entry<String, Object> entry : updateMap.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            switch (key) {
                case "$set":
                    applyFieldMap(update, (Map<String, Object>) value);
                    break;
                case "$inc":
                    for (Map.Entry<String, Object> e : ((Map<String, Object>) value).entrySet()) {
                        update.inc(e.getKey(), ((Number) e.getValue()).longValue());
                    }
                    break;
                case "$unset":
                    for (String field : ((Map<String, Object>) value).keySet()) {
                        update.unset(field);
                    }
                    break;
                case "$currentDate":
                    applyCurrentDate(update, (Map<String, Object>) value);
                    break;
                default:
                    // Plain field: treat as $set
                    update.set(key, value);
                    break;
            }
        }
        return update;
    }

    private void applyFieldMap(Update update, Map<String, Object> fieldMap) {
        if (fieldMap == null) return;
        for (Map.Entry<String, Object> e : fieldMap.entrySet()) {
            update.set(e.getKey(), e.getValue());
        }
    }

    private void applyCurrentDate(Update update, Map<String, Object> fieldMap) {
        if (fieldMap == null) return;
        for (Map.Entry<String, Object> e : fieldMap.entrySet()) {
            // {field: true} or {field: {$type: "date"|"timestamp"}} -> set current date
            update.currentDate(e.getKey());
        }
    }

    /** Result of a bulk operation. */
    public static class OperationResult {
        private final String operation;
        private final long matched;
        private final long modified;

        public OperationResult(String operation, long matched, long modified) {
            this.operation = operation;
            this.matched = matched;
            this.modified = modified;
        }

        public String getOperation() {
            return operation;
        }

        public long getMatched() {
            return matched;
        }

        public long getModified() {
            return modified;
        }
    }
}
