package com.dujitech.cep.store;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.dujitech.cep.engine.DomainProcessorRouter;

/**
 * Periodically flushes all DomainProcessors' pending upserts to MongoDB.
 * <p>
 * Lives in a dedicated component (rather than on {@link MongoBatchWriter} or
 * {@link DomainProcessorRouter}) so that neither of those beans depends on the
 * other, avoiding a Spring bean construction cycle.
 */
@Component
public class BatchFlushScheduler {

    private static final Logger log = LoggerFactory.getLogger(BatchFlushScheduler.class);

    private final DomainProcessorRouter domainRouter;

    public BatchFlushScheduler(DomainProcessorRouter domainRouter) {
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
}
