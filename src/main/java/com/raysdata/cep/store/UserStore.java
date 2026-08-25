package com.raysdata.cep.store;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import com.raysdata.cep.model.User;

/**
 * Data access for user accounts.
 * <p>
 * Stores users in the <code>users</code> MongoDB collection. On first startup
 * (empty collection) a bootstrap admin account is created from configuration.
 */
@Component
public class UserStore {

    private static final Logger log = LoggerFactory.getLogger(UserStore.class);
    private static final String COLLECTION = "users";

    private final MongoTemplate mongoTemplate;
    private final BCryptPasswordEncoder passwordEncoder;
    private final String adminUsername;
    private final String adminPassword;
    private final String adminDisplayName;

    public UserStore(MongoTemplate mongoTemplate,
                     @Value("${cep.security.bootstrap-admin.username:admin}") String adminUsername,
                     @Value("${cep.security.bootstrap-admin.password:admin}") String adminPassword,
                     @Value("${cep.security.bootstrap-admin.display-name:Administrator}") String adminDisplayName) {
        this.mongoTemplate = mongoTemplate;
        this.passwordEncoder = new BCryptPasswordEncoder();
        this.adminUsername = adminUsername;
        this.adminPassword = adminPassword;
        this.adminDisplayName = adminDisplayName;
        bootstrapAdmin();
    }

    public User findByUsername(String username) {
        return mongoTemplate.findOne(
                Query.query(Criteria.where("username").is(username)),
                User.class, COLLECTION);
    }

    public List<User> findAll() {
        return mongoTemplate.findAll(User.class, COLLECTION);
    }

    public boolean exists() {
        return mongoTemplate.count(new Query(), COLLECTION) > 0;
    }

    /**
     * Bootstrap a default admin account when the users collection is empty.
     * Runs once on startup.
     */
    private void bootstrapAdmin() {
        if (exists()) {
            return;
        }
        User admin = new User(adminUsername, passwordEncoder.encode(adminPassword),
                adminDisplayName, "admin");
        mongoTemplate.insert(admin, COLLECTION);
        log.warn("Created bootstrap admin account '{}' with default password. "
                + "Change it immediately in production.", adminUsername);
    }

    /**
     * Verify a plaintext password against the stored BCrypt hash.
     */
    public boolean matchesPassword(User user, String rawPassword) {
        if (user == null || user.getPasswordHash() == null) {
            return false;
        }
        return passwordEncoder.matches(rawPassword, user.getPasswordHash());
    }
}
