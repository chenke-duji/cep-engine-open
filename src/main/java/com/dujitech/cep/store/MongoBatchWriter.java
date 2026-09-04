package com.dujitech.cep.store;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.mongodb.core.BulkOperations;
import org.springframework.data.mongodb.core.FindAndModifyOptions;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;

import com.dujitech.cep.model.AlarmEvent;
import com.dujitech.cep.model.RawEvent;
import com.dujitech.cep.model.UnresolvedEvent;

/**
 * Batch writer for MongoDB.
 * <p>
 * Performs bulk upsert / history operations on the events collections. The
 * scheduled flush that drains DomainProcessors' pending buffers lives in
 * {@link com.dujitech.cep.store.BatchFlushScheduler} to avoid a bean cycle
 * between this writer and the domain router.
 */
@Component
public class MongoBatchWriter {

    private static final Logger log = LoggerFactory.getLogger(MongoBatchWriter.class);

    private final MongoTemplate mongoTemplate;

    public MongoBatchWriter(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    /**
     * Batch upsert events to the current events collection.
     *
     * @param events   list of events to upsert
     * @param domainId domain identifier for collection routing
     */
    public void batchUpsert(List<AlarmEvent> events, String domainId) {
        if (events == null || events.isEmpty()) return;

        String collectionName = getCollectionName(domainId);
        // Determine which identifiers already exist so we only allocate a serial
        // to genuinely new records (re-upserts of an existing key must NOT
        // consume/change its serial).
        Set<String> existing = findExistingIdentifiers(events, collectionName);

        BulkOperations bulkOps = mongoTemplate.bulkOps(BulkOperations.BulkMode.UNORDERED, collectionName);

        for (AlarmEvent event : events) {
            if (event.getIdentifier() == null || !existing.contains(event.getIdentifier())) {
                event.setSerial(nextSerial());
            }
            Query query = Query.query(Criteria.where("identifier").is(event.getIdentifier()));
            Update update = buildUpdate(event);
            bulkOps.upsert(query, update);
        }

        try {
            var result = bulkOps.execute();
            log.debug("Batch upserted {} events to {}, modified={}",
                    events.size(), collectionName, result.getModifiedCount());
        } catch (Exception e) {
            log.error("Batch upsert failed for {} events to {}", events.size(), collectionName, e);
            // Fallback: try individual upserts
            for (AlarmEvent event : events) {
                try {
                    singleUpsert(event, collectionName);
                } catch (Exception ex) {
                    log.error("Individual upsert also failed for identifier: {}",
                            event.getIdentifier(), ex);
                }
            }
        }
    }

    /**
     * Return the identifiers among {@code events} that already exist in the
     * collection, so callers can avoid allocating a new serial for them.
     */
    private Set<String> findExistingIdentifiers(List<AlarmEvent> events, String collectionName) {
        Set<String> out = new HashSet<>();
        List<String> ids = events.stream()
                .map(AlarmEvent::getIdentifier)
                .filter(id -> id != null && !id.isBlank())
                .distinct().toList();
        if (ids.isEmpty()) return out;
        try {
            Query q = Query.query(Criteria.where("identifier").in(ids));
            q.fields().include("identifier");
            mongoTemplate.find(q, org.bson.Document.class, collectionName)
                    .forEach(doc -> {
                        Object id = doc.get("identifier");
                        if (id != null) out.add(id.toString());
                    });
        } catch (Exception e) {
            log.warn("findExistingIdentifiers failed, will allocate serials as new: {}", e.getMessage());
        }
        return out;
    }

    /**
     * Atomically increment a per-engine monotonic counter and return the new
     * value, used to assign an {@code AlarmEvent.serial} on first insert. The
     * counter document lives in a separate "counters" collection so updates to
     * events_current never contend with it.
     */
    private long nextSerial() {
        Query q = Query.query(Criteria.where("_id").is("event_serial"));
        Update u = new Update().inc("seq", 1);
        FindAndModifyOptions opts = FindAndModifyOptions.options().upsert(true).returnNew(true);
        try {
            org.bson.Document doc = mongoTemplate.findAndModify(
                    q, u, opts, org.bson.Document.class, "counters");
            Object seq = doc != null ? doc.get("seq") : null;
            return seq instanceof Number ? ((Number) seq).longValue() : 1L;
        } catch (Exception e) {
            log.warn("nextSerial() failed, falling back to time-based id: {}", e.getMessage());
            return System.currentTimeMillis();
        }
    }

    /**
     * Insert a single event (for new events that don't need upsert).
     */
    public void insert(AlarmEvent event, String domainId) {
        String collectionName = getCollectionName(domainId);
        // Direct inserts are always new records, so assign a fresh serial.
        if (event.getSerial() <= 0) {
            event.setSerial(nextSerial());
        }
        mongoTemplate.insert(event, collectionName);
    }

    /**
     * Query active events for a domain.
     */
    public List<AlarmEvent> findActiveEvents(String domainId, Criteria criteria) {
        String collectionName = getCollectionName(domainId);
        return mongoTemplate.find(Query.query(criteria), AlarmEvent.class, collectionName);
    }

    /**
     * Load all active events for a domain (used for state recovery on restart).
     */
    public List<AlarmEvent> loadActiveEvents(String domainId) {
        String collectionName = getCollectionName(domainId);
        return mongoTemplate.findAll(AlarmEvent.class, collectionName);
    }

    /**
     * Paged query over the current events collection.
     *
     * @param collectionName collection to query (e.g. events_current)
     * @param criteria       query criteria (may be empty to match all)
     * @param page           1-based page number
     * @param size           page size
     * @param sortBy         field to sort by (optional)
     * @param sortDesc       true for descending sort
     * @return a paged result containing the total count and the page items
     */
    public PagedResult<AlarmEvent> findPaged(String collectionName, Criteria criteria,
                                             int page, int size,
                                             String sortBy, boolean sortDesc) {
        return findPaged(collectionName, Query.query(criteria), page, size, sortBy, sortDesc);
    }

    /**
     * Check whether a collection exists in MongoDB. Used to return a clear
     * message to the frontend when the events collection has not been created
     * yet (e.g. no events have been written since the engine started).
     *
     * @param collectionName the collection name to check
     * @return true if the collection exists
     */
    public boolean collectionExists(String collectionName) {
        try {
            return mongoTemplate.collectionExists(collectionName);
        } catch (Exception e) {
            log.warn("Failed to check existence of collection '{}'", collectionName, e);
            return false;
        }
    }

    /**
     * Paged query over the current events collection using a full Query, which
     * supports arbitrary user-supplied MongoDB filter documents.
     *
     * @param collectionName collection to query (e.g. events_current)
     * @param baseQuery      the query to run (filter document; paging/sort added here)
     * @param page           1-based page number
     * @param size           page size
     * @param sortBy         field to sort by (optional)
     * @param sortDesc       true for descending sort
     * @return a paged result containing the total count and the page items
     */
    public PagedResult<AlarmEvent> findPaged(String collectionName, Query baseQuery,
                                             int page, int size,
                                             String sortBy, boolean sortDesc) {
        int safePage = Math.max(page, 1);
        int safeSize = Math.min(Math.max(size, 1), 1000);

        long total = mongoTemplate.count(baseQuery, collectionName);

        // Build the paged query from the filter. We must NOT call
        // pageQuery.getQueryObject().putAll(...) because an empty Query returns
        // an immutable EmptyDocument that throws UnsupportedOperationException.
        // BasicQuery wraps a mutable Document filter and is safe for both empty
        // and non-empty baseQuery.
        org.bson.Document criteria = new org.bson.Document();
        criteria.putAll(baseQuery.getQueryObject());

        Query pageQuery = new org.springframework.data.mongodb.core.query.BasicQuery(criteria);
        pageQuery.skip((long) (safePage - 1) * safeSize).limit(safeSize);
        if (sortBy != null && !sortBy.isBlank()) {
            pageQuery.with(org.springframework.data.domain.Sort.by(
                    sortDesc ? org.springframework.data.domain.Sort.Direction.DESC
                             : org.springframework.data.domain.Sort.Direction.ASC,
                    sortBy));
        }
        List<AlarmEvent> items = mongoTemplate.find(pageQuery, AlarmEvent.class, collectionName);
        return new PagedResult<>(items, total, safePage, safeSize);
    }

    /** Simple paged result container. */
    public static class PagedResult<T> {
        private final List<T> items;
        private final long total;
        private final int page;
        private final int size;

        public PagedResult(List<T> items, long total, int page, int size) {
            this.items = items;
            this.total = total;
            this.page = page;
            this.size = size;
        }

        public List<T> getItems() {
            return items;
        }

        public long getTotal() {
            return total;
        }

        public int getPage() {
            return page;
        }

        public int getSize() {
            return size;
        }
    }

    // --- Event history (events_history) ---

    /** History collection for resolved/closed events. */
    public static final String HISTORY_COLLECTION = "events_history";

    /** Collection for events that could not be parsed (unsupported MIB traps etc). */
    public static final String UNRESOLVED_COLLECTION = "events_unresolved";

    /**
     * Move resolved events (Problem marked Cleared, or Resolution events) from
     * the current collection into the history collection once they are older
     * than the retention window.
     * <p>
     * Runs on a schedule; cutoffMs is the earliest allowed "lastOccurrence"
     * for an event to remain in the current (active) collection. Any event that
     * is resolved (status=Cleared or eventType=Resolution) and older than the
     * cutoff is moved to events_history.
     *
     * @param cutoffMs timestamp in ms; events with lastOccurrence < cutoff are eligible
     * @return number of events moved to history
     */
    public int moveResolvedToHistory(long cutoffMs) {
        // Resolved events = status "Cleared" OR eventType Resolution("2")
        Criteria resolved = new Criteria().orOperator(
                Criteria.where("status").is("Cleared"),
                Criteria.where("eventType").is(com.dujitech.cep.model.EventType.RESOLUTION.getCode())
        );
        // Retention measured from recoveryTime when set (>0), otherwise from
        // lastOccurrence. recoveryTime>0 && recoveryTime<cutoff, OR
        // (recoveryTime<=0 || missing) && lastOccurrence<cutoff.
        Criteria older = new Criteria().orOperator(
                new Criteria().andOperator(
                        Criteria.where("recoveryTime").gt(0),
                        Criteria.where("recoveryTime").lt(cutoffMs)
                ),
                new Criteria().andOperator(
                        new Criteria().orOperator(
                                Criteria.where("recoveryTime").lte(0),
                                Criteria.where("recoveryTime").exists(false)
                        ),
                        Criteria.where("lastOccurrence").lt(cutoffMs)
                )
        );
        // Combine the two top-level criteria with $and. Adding two separate
        // addCriteria() calls with two top-level $or would fail on BasicDocument
        // (a second 'null' criteria cannot be added to an existing $or query).
        Query query = new Query();
        query.addCriteria(new Criteria().andOperator(resolved, older));

        List<AlarmEvent> eligible = mongoTemplate.find(query, AlarmEvent.class, "events_current");
        int moved = 0;
        for (AlarmEvent event : eligible) {
            if (moveToHistory(event)) {
                moved++;
            }
        }
        if (moved > 0) {
            log.info("Moved {} resolved events to {}", moved, HISTORY_COLLECTION);
        }
        return moved;
    }

    /**
     * Move a single event from events_current to events_history.
     * <p>
     * Idempotent by identifier: the history write is an upsert (so a retry after
     * a partial failure does not insert a duplicate), and only then is the
     * current document removed. This avoids the classic non-atomic "insert then
     * delete" race where a crash between the two steps leaves a duplicate.
     */
    public boolean moveToHistory(AlarmEvent event) {
        try {
            Query byId = Query.query(Criteria.where("identifier").is(event.getIdentifier()));
            // Upsert into history (idempotent), then remove from current.
            mongoTemplate.upsert(byId, buildUpdate(event), HISTORY_COLLECTION);
            mongoTemplate.remove(byId, "events_current");
            log.debug("Moved event {} to {}", event.getIdentifier(), HISTORY_COLLECTION);
            return true;
        } catch (Exception e) {
            log.error("Failed to move event {} to history", event.getIdentifier(), e);
            return false;
        }
    }

    // --- Unresolved events (events_unresolved) ---

    /**
     * Persist a raw event that could not be parsed (e.g. unsupported MIB trap)
     * to the <code>events_unresolved</code> collection for later inspection.
     *
     * @param rawEvent    the original RawEvent from the collector
     * @param rawJson     the serialized RawEvent JSON
     * @param reason      why parsing failed (e.g. "no matching script")
     */
    public void insertUnresolved(RawEvent rawEvent, String rawJson, String reason) {
        UnresolvedEvent ue = new UnresolvedEvent();
        ue.setSource(rawEvent.getSource());
        ue.setSourceIp(rawEvent.getSourceIp());
        ue.setOriginTimestamp(rawEvent.getOriginTimestamp());
        ue.setReceivedAt(System.currentTimeMillis());
        ue.setReason(reason);
        ue.setMetadata(rawEvent.getMetadata());
        ue.setRawJson(rawJson);
        mongoTemplate.insert(ue, UNRESOLVED_COLLECTION);
        log.warn("Stored unresolved event to {}: source={}, sourceIp={}, reason={}",
                UNRESOLVED_COLLECTION, ue.getSource(), ue.getSourceIp(), reason);
    }

    /**
     * Paged query over the unresolved events collection (newest first).
     */
    public PagedResult<UnresolvedEvent> findUnresolvedPaged(int page, int size) {
        int safePage = Math.max(page, 1);
        int safeSize = Math.min(Math.max(size, 1), 1000);
        Query countQuery = new Query();
        long total = mongoTemplate.count(countQuery, UNRESOLVED_COLLECTION);

        Query pageQuery = new Query()
                .skip((long) (safePage - 1) * safeSize).limit(safeSize)
                .with(org.springframework.data.domain.Sort.by(
                        org.springframework.data.domain.Sort.Direction.DESC, "receivedAt"));
        List<UnresolvedEvent> items = mongoTemplate.find(pageQuery, UnresolvedEvent.class, UNRESOLVED_COLLECTION);
        return new PagedResult<>(items, total, safePage, safeSize);
    }

    /**
     * Load every unresolved event. Used by the startup replay so that events
     * left unresolved by a previous run can be re-parsed once the (possibly
     * extended) script set is loaded.
     *
     * @return all documents in the unresolved collection
     */
    public List<UnresolvedEvent> findAllUnresolved() {
        return mongoTemplate.find(new Query(), UnresolvedEvent.class, UNRESOLVED_COLLECTION);
    }

    /**
     * Remove unresolved events by their Mongo <code>_id</code>. Used to clean
     * up records after a successful re-parse (or after they have been
     * re-inserted with an up-to-date reason).
     *
     * @param ids the <code>_id</code> strings of the records to remove
     */
    public void deleteUnresolved(List<String> ids) {
        if (ids == null || ids.isEmpty()) return;
        try {
            mongoTemplate.remove(
                    Query.query(Criteria.where("_id").in(ids)),
                    UNRESOLVED_COLLECTION);
            log.info("Removed {} record(s) from {}", ids.size(), UNRESOLVED_COLLECTION);
        } catch (Exception e) {
            log.error("Failed to remove unresolved records from {}", UNRESOLVED_COLLECTION, e);
        }
    }

    // --- Internal ---

    private void singleUpsert(AlarmEvent event, String collectionName) {
        Query query = Query.query(Criteria.where("identifier").is(event.getIdentifier()));
        Update update = buildUpdate(event);
        mongoTemplate.upsert(query, update, collectionName);
    }

    private String getCollectionName(String domainId) {
        // Per-domain collection: events_current_<domainId>
        // Or use a single collection with domainId field - configurable
        return "events_current";
    }

    private Update buildUpdate(AlarmEvent event) {
        Update update = new Update();
        update.set("identifier", event.getIdentifier());
        update.set("node", event.getNode());
        update.set("nodeAlias", event.getNodeAlias());
        update.set("severity", event.getSeverity());
        update.set("originalSeverity", event.getOriginalSeverity());
        update.set("summary", event.getSummary());
        update.set("tally", event.getTally());
        update.set("firstOccurrence", event.getFirstOccurrence());
        update.set("lastOccurrence", event.getLastOccurrence());
        // serial is assigned once on first insert and never changed afterwards.
        if (event.getSerial() > 0) {
            update.setOnInsert("serial", event.getSerial());
        }
        update.set("domainId", event.getDomainId());
        update.set("status", event.getStatus());
        update.set("alertKey", event.getAlertKey());
        update.set("script", event.getScript());
        update.set("eventClass", event.getEventClass());
        update.set("rawEvent", event.getRawEvent());
        update.set("eventEnterprise", event.getEventEnterprise());
        update.set("alertGroup", event.getAlertGroup());
        update.set("alertGroupName", event.getAlertGroupName());
        update.set("vendor", event.getVendor());
        update.set("suppressLevel", event.getSuppressLevel());
        update.set("escalateLevel", event.getEscalateLevel());
        update.set("eventType", event.getEventType());
        update.set("specificTrap", event.getSpecificTrap());
        update.set("originalSummary", event.getOriginalSummary());
        update.set("agentType", event.getAgentType());
        update.set("siteNum", event.getSiteNum());
        update.set("ticketId", event.getTicketId());

        if (event.getClearTime() > 0) update.set("clearTime", event.getClearTime());
        if (event.getReceiveTime() > 0) update.set("receiveTime", event.getReceiveTime());
        if (event.getDeleteTime() > 0) update.set("deleteTime", event.getDeleteTime());
        if (event.getMaintainId() != null) update.set("maintainId", event.getMaintainId());
        if (event.getMaintainName() != null) update.set("maintainName", event.getMaintainName());
        if (event.getRecoveryTime() > 0) update.set("recoveryTime", event.getRecoveryTime());
        if (event.getDynamicFields() != null) update.set("dynamicFields", event.getDynamicFields());

        return update;
    }
}
