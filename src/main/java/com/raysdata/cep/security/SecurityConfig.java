package com.raysdata.cep.security;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

/**
 * Spring Security configuration.
 * <p>
 * Stateless JWT authentication. Event ingestion endpoints (POST /api/v1/events,
 * GET /api/v1/health) stay anonymous so external collectors (e.g. trap-daemon)
 * can keep posting without credentials. Management and query APIs for the web
 * console are protected.
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig {

    private final JwtAuthenticationFilter jwtAuthenticationFilter;

    /**
     * Comma-separated list of allowed CORS origins (e.g. "https://cep.example.com").
     * Empty/blank means no cross-origin access is granted (browser same-origin
     * only). SEC-03: never default to "*".
     */
    @Value("${cep.cors.allowed-origins:}")
    private String allowedOrigins;

    public SecurityConfig(JwtAuthenticationFilter jwtAuthenticationFilter) {
        this.jwtAuthenticationFilter = jwtAuthenticationFilter;
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration config) throws Exception {
        return config.getAuthenticationManager();
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .csrf(csrf -> csrf.disable())
            .cors(cors -> cors.configurationSource(corsConfigurationSource()))
            .sessionManagement(sm -> sm.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
            .authorizeHttpRequests(auth -> auth
                // Anonymous: authentication + health + event ingestion (collectors)
                .requestMatchers("/api/v1/auth/**").permitAll()
                .requestMatchers("/api/v1/health").permitAll()
                .requestMatchers(HttpMethod.POST, "/api/v1/events").permitAll()
                .requestMatchers(HttpMethod.POST, "/api/v1/events/batch").permitAll()
                .requestMatchers("/api/v1/stats/dedup").permitAll()
                // Build/version info is not sensitive; shown in the console footer
                .requestMatchers("/api/v1/version").permitAll()
                // SEC-02: script reload can execute arbitrary Groovy, restrict to admins
                .requestMatchers(HttpMethod.POST, "/api/v1/scripts/reload").hasRole("ADMIN")
                // Any other /api/v1/** endpoint requires authentication
                .anyRequest().authenticated()
            )
            .addFilterBefore(jwtAuthenticationFilter, UsernamePasswordAuthenticationFilter.class);
        return http.build();
    }

    /**
     * CORS: allow only explicitly configured frontend origins. Never default to
     * "*" combined with credentials (SEC-03). When {@code cep.cors.allowed-origins}
     * is unset, no cross-origin origin is whitelisted (browser same-origin only).
     */
    @Bean
    public CorsConfigurationSource corsConfigurationSource() {
        CorsConfiguration config = new CorsConfiguration();
        if (allowedOrigins != null && !allowedOrigins.isBlank()) {
            config.setAllowedOriginPatterns(
                    Arrays.stream(allowedOrigins.split(","))
                            .map(String::trim)
                            .filter(s -> !s.isEmpty())
                            .toList());
            config.setAllowCredentials(true);
        } else {
            // No cross-origin access; do not set credentials/patterns.
            config.setAllowedOriginPatterns(List.of());
        }
        config.setAllowedMethods(List.of("GET", "POST", "PUT", "DELETE", "OPTIONS"));
        config.setAllowedHeaders(List.of("*"));
        config.setExposedHeaders(List.of("Authorization"));
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", config);
        return source;
    }
}
