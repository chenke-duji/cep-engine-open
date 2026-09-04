package com.dujitech.cep.controller;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.*;

import com.dujitech.cep.model.User;
import com.dujitech.cep.security.JwtUtil;
import com.dujitech.cep.store.UserStore;

/**
 * Authentication endpoints for the web console.
 */
@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {

    private static final Logger log = LoggerFactory.getLogger(AuthController.class);

    private final AuthenticationManager authenticationManager;
    private final JwtUtil jwtUtil;
    private final UserStore userStore;

    // SEC-06: simple in-memory brute-force guard keyed by username.
    private static final int MAX_FAILED_ATTEMPTS = 5;
    private static final long LOCKOUT_MS = 60_000;
    private final ConcurrentHashMap<String, FailedAttempt> failedAttempts = new ConcurrentHashMap<>();

    private static final class FailedAttempt {
        volatile int count;
        volatile long lockedUntil;
    }

    public AuthController(AuthenticationManager authenticationManager,
                          JwtUtil jwtUtil,
                          UserStore userStore) {
        this.authenticationManager = authenticationManager;
        this.jwtUtil = jwtUtil;
        this.userStore = userStore;
    }

    /**
     * Login with username/password, returns a JWT.
     * POST /api/v1/auth/login
     * Body: { "username": "...", "password": "..." }
     */
    @PostMapping("/login")
    public ResponseEntity<Map<String, Object>> login(@RequestBody Map<String, String> body) {
        String username = body.get("username");
        String password = body.get("password");
        if (username == null || password == null) {
            return ResponseEntity.badRequest().body(Map.of("error", "username and password required"));
        }

        // Brute-force lockout check
        FailedAttempt fa = failedAttempts.get(username);
        if (fa != null && fa.lockedUntil > System.currentTimeMillis()) {
            return ResponseEntity.status(HttpStatus.TOO_MANY_REQUESTS)
                    .body(Map.of("error", "too many failed attempts, try again later"));
        }

        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(username, password));
        } catch (AuthenticationException e) {
            log.warn("Login failed for user '{}'", username);
            FailedAttempt attempt = failedAttempts.computeIfAbsent(username, k -> new FailedAttempt());
            synchronized (attempt) {
                attempt.count++;
                if (attempt.count >= MAX_FAILED_ATTEMPTS) {
                    attempt.lockedUntil = System.currentTimeMillis() + LOCKOUT_MS;
                    attempt.count = 0;
                    log.warn("User '{}' locked out for {}s after {} failed logins",
                            username, LOCKOUT_MS / 1000, MAX_FAILED_ATTEMPTS);
                }
            }
            return ResponseEntity.status(401).body(Map.of("error", "invalid username or password"));
        }

        // Successful login resets the failure counter
        failedAttempts.remove(username);

        User user = userStore.findByUsername(username);
        String role = user != null && user.getRole() != null ? user.getRole() : "user";
        String token = jwtUtil.generateToken(username, role);
        log.info("User '{}' logged in", username);
        return ResponseEntity.ok(Map.of(
                "token", token,
                "username", username,
                "displayName", user != null && user.getDisplayName() != null ? user.getDisplayName() : username,
                "role", role
        ));
    }
}
