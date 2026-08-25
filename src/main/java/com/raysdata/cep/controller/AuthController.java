package com.raysdata.cep.controller;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.*;

import com.raysdata.cep.model.User;
import com.raysdata.cep.security.JwtUtil;
import com.raysdata.cep.store.UserStore;

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
        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(username, password));
        } catch (AuthenticationException e) {
            log.warn("Login failed for user '{}'", username);
            return ResponseEntity.status(401).body(Map.of("error", "invalid username or password"));
        }

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
