package com.dujitech.cep.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

/**
 * MongoDB configuration.
 * <p>
 * Configures the MongoTemplate with the connection URI from application.yml.
 * Collections are created lazily on first write.
 */
@Configuration
public class MongoConfig {

    @Bean
    public MongoClient mongoClient(@Value("${spring.data.mongodb.uri:mongodb://localhost:27017/cep}") String uri) {
        return MongoClients.create(uri);
    }

    @Bean
    public MongoTemplate mongoTemplate(MongoClient mongoClient,
            @Value("${spring.data.mongodb.database:cep}") String dbName) {
        return new MongoTemplate(mongoClient, dbName);
    }
}
