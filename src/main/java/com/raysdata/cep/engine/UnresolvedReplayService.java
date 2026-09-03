package com.raysdata.cep.engine;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;
import com.raysdata.cep.model.RawEvent;
import com.raysdata.cep.model.UnresolvedEvent;
import com.raysdata.cep.store.MongoBatchWriter;

/**
 * Replays events that were left in the {@code events_unresolved} collection.
 * <p>
 * On engine startup the Groovy scripts are loaded first; any events that a
 * previous run could not parse (e.g. an unsupported MIB trap) are then
 * re-parsed against the current script set. Events that now parse successfully
 * flow through the normal processing chain into {@code events_current} and are
 * removed from {@code events_unresolved}. Events that still fail are re-inserted
 * with an up-to-date reason, so no duplicate records remain.
 */
@Component
public class UnresolvedReplayService {

    private static final Logger log = LoggerFactory.getLogger(UnresolvedReplayService.class);

    private final MongoBatchWriter mongoBatchWriter;
    private final EventProcessingChain processingChain;
    private final Gson gson = new Gson();

    public UnresolvedReplayService(MongoBatchWriter mongoBatchWriter,
                                   EventProcessingChain processingChain) {
        this.mongoBatchWriter = mongoBatchWriter;
        this.processingChain = processingChain;
    }

    /**
     * Re-parse every unresolved event against the current script set.
     * Safe to call even when the collection is empty.
     */
    public void replay() {
        List<UnresolvedEvent> unresolved;
        try {
            unresolved = mongoBatchWriter.findAllUnresolved();
        } catch (Exception e) {
            log.error("Failed to read unresolved events for replay", e);
            return;
        }
        if (unresolved.isEmpty()) {
            log.info("No unresolved events to replay");
            return;
        }

        log.info("Replaying {} unresolved event(s) against current parser set", unresolved.size());
        List<String> toDelete = new ArrayList<>();
        int replayed = 0;

        for (UnresolvedEvent ue : unresolved) {
            String id = ue.getId();
            String rawJson = ue.getRawJson();
            if (id == null || rawJson == null || rawJson.isBlank()) {
                // No usable payload; just drop the stale record.
                toDelete.add(id);
                continue;
            }
            try {
                RawEvent rawEvent = gson.fromJson(rawJson, RawEvent.class);
                if (rawEvent == null) {
                    toDelete.add(id);
                    continue;
                }
                // process() either parses the event into events_current, or (if
                // it still fails) re-inserts an unresolved record with the current
                // reason. Either way the old record is replaced, so drop it here.
                processingChain.process(rawEvent);
                toDelete.add(id);
                replayed++;
            } catch (Exception e) {
                log.error("Failed to replay unresolved event {}: {}",
                        id, e.getMessage(), e);
                // Keep the record on unexpected failure.
            }
        }

        mongoBatchWriter.deleteUnresolved(toDelete);
        log.info("Unresolved replay complete: {} replayed, {} stale record(s) cleaned",
                replayed, toDelete.size());
    }
}
