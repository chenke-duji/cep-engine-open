package com.dujitech.cep.engine;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.dujitech.cep.groovy.ScriptRegistry;
import com.dujitech.cep.model.AlarmEvent;
import com.dujitech.cep.model.HookContext;
import com.dujitech.cep.model.HookResult;
import com.dujitech.cep.model.ResultAction;
import com.dujitech.cep.groovy.EventHook;
import com.dujitech.cep.store.MongoBatchWriter;

/**
 * Routes events to the correct DomainProcessor by domainId.
 * <p>
 * Each domainId gets its own DomainProcessor with isolated in-memory state.
 * The router creates processors on demand and caches them.
 */
@Component
public class DomainProcessorRouter {

    private static final Logger log = LoggerFactory.getLogger(DomainProcessorRouter.class);

    private final ConcurrentHashMap<String, DomainProcessor> processors = new ConcurrentHashMap<>();
    private final ScriptRegistry scriptRegistry;
    private final MongoBatchWriter batchWriter;

    public DomainProcessorRouter(ScriptRegistry scriptRegistry, MongoBatchWriter batchWriter) {
        this.scriptRegistry = scriptRegistry;
        this.batchWriter = batchWriter;
    }

    /**
     * Get or create a DomainProcessor for the given domainId.
     */
    public DomainProcessor getOrCreate(String domainId) {
        return processors.computeIfAbsent(domainId, DomainProcessor::new);
    }

    /**
     * Get all active domain processors (for batch flush and cleanup).
     */
    public List<DomainProcessor> getAll() {
        return List.copyOf(processors.values());
    }

    /**
     * Flush all domain processors' pending upserts to MongoDB.
     * Called periodically by the batch writer scheduler.
     */
    public void flushAll() {
        for (DomainProcessor dp : processors.values()) {
            List<AlarmEvent> batch = dp.drainPendingUpserts();
            if (!batch.isEmpty()) {
                batchWriter.batchUpsert(batch, dp.getDomainId());
            }
        }
    }
}
