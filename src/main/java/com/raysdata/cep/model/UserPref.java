package com.raysdata.cep.model;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A user-level preference: a view (column model), a filter (MongoDB query), or
 * a timestamp display format.
 * <p>
 * Stored in the <code>user_prefs</code> collection. Records are private to
 * their owner by default; admin users may mark them public so other users can
 * use them.
 */
public class UserPref {

    public static final String TYPE_VIEW = "view";
    public static final String TYPE_FILTER = "filter";
    public static final String TYPE_TIMEFORMAT = "timeformat";

    private String id;
    /** view | filter | timeformat */
    private String type;
    /** Owning username; "system" for built-in defaults. */
    private String owner;
    /** Display name of the preference (view/filter name). */
    private String name;
    /** Whether the preference is visible to all users. */
    private boolean isPublic;
    /** Whether this preference is the default active one for its owner. */
    private boolean isDefault;
    /** Type-specific payload (columns / query / format+timezone). */
    private Map<String, Object> config;
    private long createdAt;
    private long updatedAt;

    public UserPref() {
    }

    public UserPref(String type, String owner, String name, Map<String, Object> config) {
        this.type = type;
        this.owner = owner;
        this.name = name;
        this.config = config;
        long now = System.currentTimeMillis();
        this.createdAt = now;
        this.updatedAt = now;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("isPublic")
    public boolean isPublic() {
        return isPublic;
    }

    @JsonProperty("isPublic")
    public void setPublic(boolean aPublic) {
        isPublic = aPublic;
    }

    @JsonProperty("isDefault")
    public boolean isDefault() {
        return isDefault;
    }

    @JsonProperty("isDefault")
    public void setDefault(boolean aDefault) {
        isDefault = aDefault;
    }

    public Map<String, Object> getConfig() {
        return config;
    }

    public void setConfig(Map<String, Object> config) {
        this.config = config;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    public long getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(long updatedAt) {
        this.updatedAt = updatedAt;
    }
}
