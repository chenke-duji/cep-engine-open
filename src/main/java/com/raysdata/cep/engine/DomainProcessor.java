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
     * <p>
     * The <code>problemIdentifier</code> is the full identifier of the Problem
     * event (pairKey + "|" + PROBLEM.code). The Problem is atomically removed
     * from active events (concurrency-safe), marked Cleared with severity 0,
     * and queued to persist to the current collection (it stays there until a
     * scheduled task moves it to the history collection after the retention
     * window). The Resolution event is also queued to persist.
     * <p>
     * Returns the resolved Problem event, or null if no match was found.
     */
    public AlarmEvent resolveProblem(String problemIdentifier, AlarmEvent resolution) {
        // Atomically remove; ConcurrentHashMap.remove returns the value only if
        // present and removed exactly once, making concurrent Resolution events
        // for the same Problem safe (only the first wins).
        AlarmEvent problem = activeEvents.remove(problemIdentifier);
        if (problem == null) {
            log.debug("No active problem for resolution {} (identifier={})",
                    resolution.getIdentifier(), problemIdentifier);
            return null;
        }

        long now = System.currentTimeMillis();

        // Mark the problem as resolved. status=Cleared is consistent with severity=0.
        problem.setEventType(EventType.RESOLUTION.getCode());
        problem.setStatus("Cleared");
        problem.setClearTime(String.valueOf(now));
        problem.setRecoveryTime(now);
        problem.setSeverity(0);  // Clear severity

        // Queue the resolved Problem for upsert (stays in events_current until
        // the scheduled cleanup moves it to events_history after retention).
        synchronized (pendingUpserts) {
            pendingUpserts.add(problem);
            // Persist the Resolution event too (per requirement #4). Its
            // recoveryTime is set so history retention is measured from now.
            if (resolution != null) {
                if (resolution.getRecoveryTime() <= 0) {
                    resolution.setRecoveryTime(now);
                }
                pendingUpserts.add(resolution);
            }
        }

        log.info("Resolved problem {} with resolution from {}", problemIdentifier,
                resolution != null ? resolution.getIdentifier() : "n/a");
        return problem;
    }

    /**
     * Build the pairing key (without the trailing eventType segment) that must
     * be identical for a Problem and its Resolution to auto-recover.
     * <p>
     * Fields (empty ones are skipped): domainId, agentType, node, alertGroup,
     * alertKey. Same pairKey across eventType 1 (Problem) and 2 (Resolution)
     * forms the automatic recovery condition.
     *
     * @param domainId   domain id (may be null -> skipped)
     * @param agentType  agent type (null/blank -> default "generic")
     * @param node       node (may be null -> skipped)
     * @param alertGroup alert group (may be null -> skipped)
     * @param alertKey   alert key (may be null -> skipped)
     */
    public static String buildPairKey(String domainId, String agentType, String node,
                                      String alertGroup, String alertKey) {
        String at = (agentType == null || agentType.isBlank()) ? "generic" : agentType.trim();
        StringBuilder sb = new StringBuilder(64);
        appendSegment(sb, domainId);
        appendSegment(sb, at);
        appendSegment(sb, node);
        appendSegment(sb, alertGroup);
        appendSegment(sb, alertKey);
        return sb.toString();
    }

    private static void appendSegment(StringBuilder sb, String value) {
        if (value == null || value.isBlank()) return;
        if (sb.length() > 0) sb.append('|');
        sb.append(value.trim());
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
