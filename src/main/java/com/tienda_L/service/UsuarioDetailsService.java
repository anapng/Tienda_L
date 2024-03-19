package com.tienda_L.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 *
 * @author ans
 */
public interface UsuarioDetailsService {
    public UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException;
}
