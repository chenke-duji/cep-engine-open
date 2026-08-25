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
        byte[] keyBytes = (secret == null || secret.isBlank())
                ? "cep-engine-default-insecure-key-change-me".getBytes(StandardCharsets.UTF_8)
                : secret.getBytes(StandardCharsets.UTF_8);
        if (keyBytes.length < 32) {
            log.warn("JWT secret is shorter than 32 bytes; tokens may be insecure. "
                    + "Configure cep.security.jwt.secret with a strong value.");
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
