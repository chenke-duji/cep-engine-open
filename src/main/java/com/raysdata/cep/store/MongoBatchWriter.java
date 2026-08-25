package com.raysdata.cep.store;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.mongodb.core.BulkOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.raysdata.cep.engine.DomainProcessorRouter;
import com.raysdata.cep.model.AlarmEvent;

/**
 * Batch writer for MongoDB.
 * <p>
 * Collects events from all DomainProcessors' pending upsert buffers and
 * writes them to MongoDB in bulk. Runs on a fixed schedule to batch
 * writes for throughput optimization.
 */
@Component
public class MongoBatchWriter {

    private static final Logger log = LoggerFactory.getLogger(MongoBatchWriter.class);

    private final MongoTemplate mongoTemplate;
    private final DomainProcessorRouter domainRouter;

    public MongoBatchWriter(MongoTemplate mongoTemplate, DomainProcessorRouter domainRouter) {
        this.mongoTemplate = mongoTemplate;
        this.domainRouter = domainRouter;
    }

    /**
     * Flush all pending upserts to MongoDB on a fixed interval.
     * Default: every 500ms.
     */
    @Scheduled(fixedDelayString = "${cep.mongo.batch-writer.flush-interval-ms:500}")
    public void scheduledFlush() {
        try {
            domainRouter.flushAll();
        } catch (Exception e) {
            log.error("Error during scheduled flush", e);
        }
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
        BulkOperations bulkOps = mongoTemplate.bulkOps(BulkOperations.BulkMode.UNORDERED, collectionName);

        for (AlarmEvent event : events) {
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
     * Insert a single event (for new events that don't need upsert).
     */
    public void insert(AlarmEvent event, String domainId) {
        String collectionName = getCollectionName(domainId);
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

        Query pageQuery = new Query();
        pageQuery.getQueryObject().putAll(baseQuery.getQueryObject());
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
                Criteria.where("eventType").is(com.raysdata.cep.model.EventType.RESOLUTION.getCode())
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
        Query query = new Query();
        query.addCriteria(resolved);
        query.addCriteria(older);

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
     * Move a single event from events_current to events_history (insert into
     * history, then delete from current). Returns true on success.
     */
    public boolean moveToHistory(AlarmEvent event) {
        try {
            mongoTemplate.insert(event, HISTORY_COLLECTION);
            mongoTemplate.remove(
                    Query.query(Criteria.where("identifier").is(event.getIdentifier())),
                    "events_current");
            log.debug("Moved event {} to {}", event.getIdentifier(), HISTORY_COLLECTION);
            return true;
        } catch (Exception e) {
            log.error("Failed to move event {} to history", event.getIdentifier(), e);
            return false;
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

        if (event.getClearTime() != null) update.set("clearTime", event.getClearTime());
        if (event.getReceiveTime() != null) update.set("receiveTime", event.getReceiveTime());
        if (event.getDeleteTime() != null) update.set("deleteTime", event.getDeleteTime());
        if (event.getMaintainId() != null) update.set("maintainId", event.getMaintainId());
        if (event.getMaintainName() != null) update.set("maintainName", event.getMaintainName());
        if (event.getRecoveryTime() > 0) update.set("recoveryTime", event.getRecoveryTime());
        if (event.getDynamicFields() != null) update.set("dynamicFields", event.getDynamicFields());

        return update;
    }
}
