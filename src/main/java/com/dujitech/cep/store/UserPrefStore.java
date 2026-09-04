package com.dujitech.cep.store;

import java.util.List;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;

import com.dujitech.cep.model.UserPref;

/**
 * Data access for user preferences (views, filters, timestamp formats).
 * <p>
 * Stored in the <code>user_prefs</code> MongoDB collection.
 */
@Component
public class UserPrefStore {

    private static final String COLLECTION = "user_prefs";

    private final MongoTemplate mongoTemplate;

    public UserPrefStore(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    /**
     * List preferences visible to a user for a given type:
     * the user's own records plus any public records.
     */
    public List<UserPref> findVisible(String type, String username) {
        Query query = Query.query(new Criteria().orOperator(
                Criteria.where("type").is(type).and("owner").is(username),
                Criteria.where("type").is(type).and("isPublic").is(true)
        ));
        return mongoTemplate.find(query, UserPref.class, COLLECTION);
    }

    /**
     * Find a single preference by id and owning user (owner may be the current
     * user, or any user when the record is public).
     */
    public UserPref findById(String id) {
        return mongoTemplate.findById(id, UserPref.class, COLLECTION);
    }

    public UserPref insert(UserPref pref) {
        long now = System.currentTimeMillis();
        pref.setCreatedAt(now);
        pref.setUpdatedAt(now);
        mongoTemplate.insert(pref, COLLECTION);
        return pref;
    }

    public UserPref update(UserPref pref) {
        pref.setUpdatedAt(System.currentTimeMillis());
        // NOTE: must query on "_id" (not "id"). The class id field is persisted
        // as the Mongo _id; Criteria.where("id") is a raw-field query that does
        // not map to _id, so updateFirst would silently match ZERO documents and
        // the update would never persist.
        Query query = Query.query(Criteria.where("_id").is(pref.getId()));
        Update update = new Update()
                .set("name", pref.getName())
                .set("config", pref.getConfig())
                .set("isPublic", pref.isPublic())
                .set("isDefault", pref.isDefault())
                .set("updatedAt", pref.getUpdatedAt());
        mongoTemplate.updateFirst(query, update, COLLECTION);
        return findById(pref.getId());
    }

    public void delete(String id) {
        mongoTemplate.remove(Query.query(Criteria.where("_id").is(id)), COLLECTION);
    }

    /**
     * Find the default preference of a given type for a user (or any public
     * default if the user has none), used e.g. for the timestamp display format.
     */
    public UserPref findDefault(String type, String username) {
        UserPref userDefault = mongoTemplate.findOne(
                Query.query(Criteria.where("type").is(type)
                        .and("owner").is(username).and("isDefault").is(true)),
                UserPref.class, COLLECTION);
        if (userDefault != null) {
            return userDefault;
        }
        return mongoTemplate.findOne(
                Query.query(Criteria.where("type").is(type)
                        .and("isPublic").is(true).and("isDefault").is(true)),
                UserPref.class, COLLECTION);
    }
}
