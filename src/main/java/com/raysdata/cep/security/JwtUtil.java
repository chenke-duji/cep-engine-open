package com.raysdata.cep.security;

import java.nio.charset.StandardCharsets;
import java.util.Date;

import javax.crypto.SecretKey;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;

/**
 * JWT creation and validation.
 * <p>
 * Uses HMAC-SHA signing with a configured secret. Claims carry the username,
 * role and expiration. Thread-safe.
 */
@Component
public class JwtUtil {

    private static final Logger log = LoggerFactory.getLogger(JwtUtil.class);

    private final SecretKey key;
    private final long expirationMs;
    private final String issuer;

    public JwtUtil(@Value("${cep.security.jwt.secret:}") String secret,
                   @Value("${cep.security.jwt.expiration-ms:28800000}") long expirationMs,
                   @Value("${cep.security.jwt.issuer:cep-engine}") String issuer) {
        // SEC-05: refuse to start with a missing or weak JWT secret instead of
        // silently falling back to a predictable key that lets anyone forge tokens.
        if (secret == null || secret.isBlank()) {
            throw new IllegalStateException(
                    "cep.security.jwt.secret is not configured. Set a strong secret "
                            + "(>= 32 bytes) via CEP_JWT_SECRET before starting the engine.");
        }
        byte[] keyBytes = secret.getBytes(StandardCharsets.UTF_8);
        if (keyBytes.length < 32) {
            throw new IllegalStateException(
                    "cep.security.jwt.secret is too short (" + keyBytes.length
                            + " bytes). Use at least 32 bytes for HMAC-SHA signing.");
        }
        this.key = Keys.hmacShaKeyFor(keyBytes);
        this.expirationMs = expirationMs;
        this.issuer = issuer;
    }

    public String generateToken(String username, String role) {
        Date now = new Date();
        Date expiry = new Date(now.getTime() + expirationMs);
        return Jwts.builder()
                .subject(username)
                .claim("role", role)
                .issuer(issuer)
                .issuedAt(now)
                .expiration(expiry)
                .signWith(key)
                .compact();
    }

    /**
     * Parse and validate a token. Returns the username or null if invalid/expired.
     */
    public String validateAndGetUsername(String token) {
        try {
            Claims claims = Jwts.parser()
                    .verifyWith(key)
                    .build()
                    .parseSignedClaims(token)
                    .getPayload();
            return claims.getSubject();
        } catch (Exception e) {
            log.debug("JWT validation failed: {}", e.getMessage());
            return null;
        }
    }
}
