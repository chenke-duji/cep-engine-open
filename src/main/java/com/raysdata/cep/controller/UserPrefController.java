package com.raysdata.cep.controller;

import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.web.bind.annotation.*;

import com.raysdata.cep.model.UserPref;
import com.raysdata.cep.store.UserPrefStore;

/**
 * User preference management: custom views (column models), custom filters
 * (MongoDB query statements) and timestamp display format, per user.
 * <p>
 * Records are private by default; admin users can mark them public.
 */
@RestController
@RequestMapping("/api/v1/user-prefs")
public class UserPrefController {

    private static final String[] TYPES = {UserPref.TYPE_VIEW, UserPref.TYPE_FILTER, UserPref.TYPE_TIMEFORMAT};

    private final UserPrefStore userPrefStore;

    public UserPrefController(UserPrefStore userPrefStore) {
        this.userPrefStore = userPrefStore;
    }

    /**
     * List preferences visible to the current user, optionally filtered by type.
     * GET /api/v1/user-prefs?type=view
     */
    @GetMapping
    public ResponseEntity<Map<String, Object>> list(@RequestParam(required = false) String type,
                                                    Authentication authentication) {
        String username = authentication.getName();
        if (type != null && !type.isBlank()) {
            List<UserPref> prefs = userPrefStore.findVisible(type, username);
            return ResponseEntity.ok(Map.of("items", prefs, "type", type));
        }
        // All types combined
        java.util.ArrayList<UserPref> all = new java.util.ArrayList<>();
        for (String t : TYPES) {
            all.addAll(userPrefStore.findVisible(t, username));
        }
        return ResponseEntity.ok(Map.of("items", all));
    }

    /**
     * Create a new preference.
     * POST /api/v1/user-prefs
     * Body: { "type":"view", "name":"默认视图", "isPublic":false, "isDefault":false, "config":{...} }
     */
    @PostMapping
    public ResponseEntity<Map<String, Object>> create(@RequestBody UserPref body,
                                                      Authentication authentication) {
        String username = authentication.getName();
        if (!isValidType(body.getType())) {
            return ResponseEntity.badRequest().body(Map.of("error", "type must be view|filter|timeformat"));
        }
        if (body.getName() == null || body.getName().isBlank()) {
            return ResponseEntity.badRequest().body(Map.of("error", "name is required"));
        }
        boolean isAdmin = isAdmin(authentication);
        body.setId(null);
        body.setOwner(username);
        if (body.isPublic() && !isAdmin) {
            return ResponseEntity.status(403).body(Map.of("error", "only admin can mark preferences public"));
        }
        UserPref saved = userPrefStore.insert(body);
        return ResponseEntity.ok(toResponse(saved));
    }

    /**
     * Update an existing preference (owner or admin).
     * PUT /api/v1/user-prefs/{id}
     */
    @PutMapping("/{id}")
    public ResponseEntity<Map<String, Object>> update(@PathVariable String id,
                                                      @RequestBody UserPref body,
                                                      Authentication authentication) {
        String username = authentication.getName();
        UserPref existing = userPrefStore.findById(id);
        if (existing == null) {
            return ResponseEntity.notFound().build();
        }
        if (!canModify(existing, username, isAdmin(authentication))) {
            return ResponseEntity.status(403).body(Map.of("error", "no permission to modify this preference"));
        }
        existing.setName(body.getName());
        existing.setConfig(body.getConfig());
        existing.setPublic(body.isPublic());
        existing.setDefault(body.isDefault());
        // Only admin can toggle public
        if (!isAdmin(authentication)) {
            existing.setPublic(false);
        }
        UserPref saved = userPrefStore.update(existing);
        return ResponseEntity.ok(toResponse(saved));
    }

    /**
     * Delete a preference (owner or admin).
     * DELETE /api/v1/user-prefs/{id}
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String, Object>> delete(@PathVariable String id,
                                                      Authentication authentication) {
        String username = authentication.getName();
        UserPref existing = userPrefStore.findById(id);
        if (existing == null) {
            return ResponseEntity.notFound().build();
        }
        if (!canModify(existing, username, isAdmin(authentication))) {
            return ResponseEntity.status(403).body(Map.of("error", "no permission to delete this preference"));
        }
        userPrefStore.delete(id);
        return ResponseEntity.ok(Map.of("deleted", true, "id", id));
    }

    /**
     * Return the effective default timestamp format for the current user.
     * GET /api/v1/user-prefs/default-timeformat
     */
    @GetMapping("/default-timeformat")
    public ResponseEntity<Map<String, Object>> defaultTimeformat(Authentication authentication) {
        String username = authentication.getName();
        UserPref pref = userPrefStore.findDefault(UserPref.TYPE_TIMEFORMAT, username);
        if (pref == null || pref.getConfig() == null) {
            // Fall back to server defaults. Use dayjs-compatible pattern
            // (YYYY, not yyyy) so the frontend renders it correctly.
            return ResponseEntity.ok(Map.of(
                    "format", "YYYY-MM-DD HH:mm:ss",
                    "timezone", java.util.TimeZone.getDefault().getID(),
                    "showTimezone", true
            ));
        }
        Map<String, Object> cfg = pref.getConfig();
        String format = cfg.get("format") == null ? "YYYY-MM-DD HH:mm:ss" : cfg.get("format").toString();
        String tz = cfg.get("timezone") == null ? java.util.TimeZone.getDefault().getID() : cfg.get("timezone").toString();
        boolean showTz = cfg.get("showTimezone") == null || Boolean.TRUE.equals(cfg.get("showTimezone"));
        return ResponseEntity.ok(Map.of("format", format, "timezone", tz, "showTimezone", showTz));
    }

    // --- Internal ---

    private boolean isValidType(String type) {
        for (String t : TYPES) {
            if (t.equals(type)) return true;
        }
        return false;
    }

    private boolean isAdmin(Authentication authentication) {
        if (authentication == null) return false;
        for (GrantedAuthority a : authentication.getAuthorities()) {
            if ("ROLE_ADMIN".equals(a.getAuthority())) return true;
        }
        return false;
    }

    private boolean canModify(UserPref pref, String username, boolean admin) {
        return admin || pref.getOwner() == null || pref.getOwner().equals(username);
    }

    private Map<String, Object> toResponse(UserPref pref) {
        return Map.of(
                "id", pref.getId(),
                "type", pref.getType(),
                "owner", pref.getOwner(),
                "name", pref.getName(),
                "isPublic", pref.isPublic(),
                "isDefault", pref.isDefault(),
                "config", pref.getConfig() == null ? Map.of() : pref.getConfig()
        );
    }
}
