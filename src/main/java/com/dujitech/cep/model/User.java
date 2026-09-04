package com.dujitech.cep.model;

/**
 * User account for the CEP event console authentication.
 * <p>
 * Stored in the <code>users</code> MongoDB collection. Passwords are kept as
 * BCrypt hashes only; plaintext is never persisted.
 */
public class User {

    private String id;
    private String username;
    private String passwordHash;
    private String displayName;
    /** Role: "admin" or "user". Admin can mark views/filters as public. */
    private String role;
    private long createdAt;

    public User() {
    }

    public User(String username, String passwordHash, String displayName, String role) {
        this.username = username;
        this.passwordHash = passwordHash;
        this.displayName = displayName;
        this.role = role;
        this.createdAt = System.currentTimeMillis();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "User{username='" + username + "', role='" + role + "'}";
    }
}
