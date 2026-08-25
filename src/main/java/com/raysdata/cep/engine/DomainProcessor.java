package com.raysdata.cep.engine;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.raysdata.cep.model.AlarmEvent;
import com.raysdata.cep.model.EventType;
import com.raysdata.cep.model.MaintainRule;

/**
 * Per-domain in-memory state for event processing.
 * <p>
 * Each domainId gets its own DomainProcessor instance, isolated from
 * other domains. This ensures that deduplication, Problem/Resolution
 * pairing, and flash detection operate within a single domain scope.
 * <p>
 * State is ephemeral (process memory). On restart, active events are
 * reloaded from MongoDB to restore dedup and pairing state.
 */
public class DomainProcessor {

    private static final Logger log = LoggerFactory.getLogger(DomainProcessor.class);

    private final String domainId;

    /** Active events for dedup: identifier -> current AlarmEvent */
    private final ConcurrentHashMap<String, AlarmEvent> activeEvents = new ConcurrentHashMap<>();

    /** Flash detection: identifier -> sliding window counter */
    private final ConcurrentHashMap<String, SlidingWindowCounter> flashWindows = new ConcurrentHashMap<>();

    /** Flash suppression: identifier -> suppress until timestamp */
    private final ConcurrentHashMap<String, Long> flashSuppressions = new ConcurrentHashMap<>();

    /** Pending batch upserts */
    private final List<AlarmEvent> pendingUpserts = new ArrayList<>();

    /** Maintenance rules cache */
    private volatile List<MaintainRule> maintainRules = new ArrayList<>();

    /** Script variables shared across hooks within one event processing */
    private final ThreadLocal<Map<String, Object>> scriptVariables = ThreadLocal.withInitial(Map::of);

    // --- Constructor ---

    public DomainProcessor(String domainId) {
        this.domainId = domainId;
    }

    // --- Public API ---

    public String getDomainId() {
        return domainId;
    }

    /**
     * Get an active event by identifier (for Problem/Resolution pairing).
     */
    public AlarmEvent getActiveEvent(String identifier) {
        return activeEvents.get(identifier);
    }

    /**
     * Get current flash count for an identifier within the sliding window.
     */
    public long getFlashCount(String identifier) {
        SlidingWindowCounter counter = flashWindows.get(identifier);
        return counter != null ? counter.count() : 0;
    }

    /**
     * Increment flash count for an identifier.
     */
    public void incrementFlash(String identifier) {
        flashWindows.computeIfAbsent(identifier, k -> new SlidingWindowCounter(60, TimeUnit.SECONDS))
                .increment();
    }

    /**
     * Check if an identifier is currently flash-suppressed.
     */
    public boolean isFlashSuppressed(String identifier) {
        Long until = flashSuppressions.get(identifier);
        if (until == null) return false;
        if (System.currentTimeMillis() > until) {
            flashSuppressions.remove(identifier);
            return false;
        }
        return true;
    }

    /**
     * Start flash suppression for an identifier.
     */
    public void startFlashSuppression(String identifier, long suppressMs) {
        flashSuppressions.put(identifier, System.currentTimeMillis() + suppressMs);
    }

    /**
     * Try to deduplicate an event. If the same identifier exists,
     * merge (increment tally, upgrade severity, update lastOccurrence)
     * and return false (caller should not write separately).
     *
     * @return true if this is a new event, false if it was merged into existing
     */
    public boolean tryDedup(AlarmEvent event) {
        AlarmEvent existing = activeEvents.putIfAbsent(event.getIdentifier(), event);
        if (existing == null) {
            // New event
            event.setTally(1);
            return true;
        }

        // Duplicate: merge into existing
        existing.setTally(existing.getTally() + 1);
        if (event.getSeverity() > existing.getSeverity()) {
            existing.setSeverity(event.getSeverity());
        }
        existing.setLastOccurrence(event.getLastOccurrence());
        // Mark that we need to upsert the merged event
        synchronized (pendingUpserts) {
            pendingUpserts.add(existing);
        }
        return false;
    }

    /**
     * Resolve a Problem event by matching it with a Resolution.
     * Returns the resolved Problem event, or null if no match found.
     */
    public AlarmEvent resolveProblem(String pairKey, AlarmEvent resolution) {
        AlarmEvent problem = activeEvents.get(pairKey);
        if (problem == null) {
            return null;
        }

        // Mark the problem as resolved
        problem.setEventType(EventType.RESOLUTION.getCode());
        problem.setStatus("CLOSED");
        problem.setClearTime(String.valueOf(System.currentTimeMillis()));
        problem.setRecoveryTime(System.currentTimeMillis());
        problem.setSeverity(0);  // Clear severity

        // Remove from active events
        activeEvents.remove(pairKey);

        // Queue for upsert (update the existing record in DB)
        synchronized (pendingUpserts) {
            pendingUpserts.add(problem);
        }

        log.debug("Resolved problem: {} with resolution from: {}", pairKey, resolution.getIdentifier());
        return problem;
    }

    /**
     * Add an event to the pending upsert batch.
     */
    public void addPendingUpsert(AlarmEvent event) {
        synchronized (pendingUpserts) {
            pendingUpserts.add(event);
        }
    }

    /**
     * Drain pending upserts for batch writing.
     */
    public List<AlarmEvent> drainPendingUpserts() {
        synchronized (pendingUpserts) {
            if (pendingUpserts.isEmpty()) return List.of();
            List<AlarmEvent> batch = new ArrayList<>(pendingUpserts);
            pendingUpserts.clear();
            return batch;
        }
    }

    /**
     * Get maintain rules for this domain.
     */
    public List<MaintainRule> getMaintainRules() {
        return maintainRules;
    }

    /**
     * Update maintain rules cache (called when rules are reloaded).
     */
    public void updateMaintainRules(List<MaintainRule> rules) {
        this.maintainRules = rules != null ? rules : new ArrayList<>();
    }

    /**
     * Get script variables for the current thread (shared across hooks).
     */
    public Map<String, Object> getScriptVariables() {
        return scriptVariables.get();
    }

    /**
     * Reload active events from MongoDB into memory (for restart recovery).
     */
    public void restoreActiveEvents(List<AlarmEvent> events) {
        for (AlarmEvent e : events) {
            if (e.getEventType() == null || !EventType.RESOLUTION.getCode().equals(e.getEventType())) {
                activeEvents.put(e.getIdentifier(), e);
            }
        }
        log.info("Restored {} active events for domain: {}", activeEvents.size(), domainId);
    }

    /**
     * Clean up stale Problem events that have timed out.
     */
    public void cleanupStaleProblems(long timeoutMs) {
        long cutoff = System.currentTimeMillis() - timeoutMs;
        List<String> staleKeys = new ArrayList<>();

        for (Map.Entry<String, AlarmEvent> entry : activeEvents.entrySet()) {
            AlarmEvent event = entry.getValue();
            if (event.getLastOccurrence() < cutoff) {
                staleKeys.add(entry.getKey());
            }
        }

        for (String key : staleKeys) {
            AlarmEvent removed = activeEvents.remove(key);
            if (removed != null) {
                removed.setStatus("STALE");
                synchronized (pendingUpserts) {
                    pendingUpserts.add(removed);
                }
            }
        }

        if (!staleKeys.isEmpty()) {
            log.info("Cleaned up {} stale problems for domain: {}", staleKeys.size(), domainId);
        }
    }

    // --- Inner classes ---

    /**
     * Sliding window counter for flash detection.
     * Thread-safe, uses a concurrent deque of timestamps.
     */
    static class SlidingWindowCounter {
        private final long windowMillis;
        private final ConcurrentLinkedDeque<Long> timestamps = new ConcurrentLinkedDeque<>();
        private final AtomicLong cachedCount = new AtomicLong(0);

        SlidingWindowCounter(long window, TimeUnit unit) {
            this.windowMillis = unit.toMillis(window);
        }

        void increment() {
            long now = System.currentTimeMillis();
            long cutoff = now - windowMillis;
            // Evict expired entries
            while (!timestamps.isEmpty() && timestamps.peekFirst() < cutoff) {
                timestamps.pollFirst();
            }
            timestamps.addLast(now);
            cachedCount.set(timestamps.size());
        }

        long count() {
            long now = System.currentTimeMillis();
            long cutoff = now - windowMillis;
            while (!timestamps.isEmpty() && timestamps.peekFirst() < cutoff) {
                timestamps.pollFirst();
            }
            return timestamps.size();
        }
    }
}
