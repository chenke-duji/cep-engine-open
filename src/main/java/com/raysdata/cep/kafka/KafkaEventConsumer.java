package com.raysdata.cep.kafka;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.raysdata.cep.engine.EventProcessingChain;
import com.raysdata.cep.engine.TransportDeduplicator;
import com.raysdata.cep.model.RawEvent;

import com.google.gson.Gson;

/**
 * Optional Kafka consumer for event ingestion.
 * <p>
 * Activated only when cep.kafka.enabled=true in configuration.
 * When disabled (default), the REST API is the sole ingestion path.
 */
@Component
@ConditionalOnProperty(name = "cep.kafka.enabled", havingValue = "true")
public class KafkaEventConsumer {

    private static final Logger log = LoggerFactory.getLogger(KafkaEventConsumer.class);
    private static final Gson gson = new Gson();

    private final EventProcessingChain processingChain;
    private final TransportDeduplicator transportDeduplicator;

    public KafkaEventConsumer(EventProcessingChain processingChain,
                              TransportDeduplicator transportDeduplicator) {
        this.processingChain = processingChain;
        this.transportDeduplicator = transportDeduplicator;
    }

    /**
     * Consume raw events from the configured Kafka topic.
     * Each message is a JSON-serialized RawEvent.
     */
    @KafkaListener(
            topics = "${cep.kafka.topic:cep-raw-events}",
            groupId = "${cep.kafka.group-id:cep-engine}",
            concurrency = "${cep.kafka.concurrency:3}"
    )
    public void consume(String message) {
        try {
            RawEvent rawEvent = gson.fromJson(message, RawEvent.class);
            if (rawEvent != null) {
                // Transport-level dedup: skip duplicates from Active-Active collectors
                if (transportDeduplicator.isDuplicate(rawEvent)) {
                    log.trace("Kafka transport duplicate dropped: source={}", rawEvent.getSource());
                    return;
                }
                processingChain.process(rawEvent);
            }
        } catch (Exception e) {
            log.error("Failed to process Kafka message: {}", message, e);
        }
    }
}
