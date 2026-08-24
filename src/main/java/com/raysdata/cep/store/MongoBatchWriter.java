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

    @SuppressWarnings("unchecked")
    private Update buildUpdate(AlarmEvent event) {
        Update update = new Update();
        update.set("identifier", event.getIdentifier());
        update.set("node", event.getNode());
        update.set("nodeAlias", event.getNodeAlias());
        update.set("severity", event.getSeverity());
        update.set("originalSeverity", event.getOriginalSeverity());
        update.set("summary", event.getSummary());
        update.set("frequency", event.getFrequency());
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
