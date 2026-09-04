package com.dujitech.cep.security;

import java.util.List;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.dujitech.cep.model.User;
import com.dujitech.cep.store.UserStore;

/**
 * Loads user details from MongoDB for Spring Security authentication.
 */
@Service
public class CepUserDetailsService implements UserDetailsService {

    private final UserStore userStore;

    public CepUserDetailsService(UserStore userStore) {
        this.userStore = userStore;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userStore.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("User not found: " + username);
        }
        String role = user.getRole() == null ? "user" : user.getRole();
        return org.springframework.security.core.userdetails.User
                .withUsername(user.getUsername())
                .password(user.getPasswordHash())
                .authorities(List.of(new SimpleGrantedAuthority("ROLE_" + role.toUpperCase())))
                .build();
    }
}
