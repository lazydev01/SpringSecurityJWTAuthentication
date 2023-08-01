package com.spring.security.jwt.authentication.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class MySecurityConfig {
    @Bean
    public UserDetailsService userDetailsService(){
        UserDetails user = User.builder().username("arpit").password(passwordEncoder().encode("arpit")).roles("ADMIN").build();
        UserDetails user2 = User.builder().username("banz").password(passwordEncoder().encode("banz")).roles("ADMIN").build();
        return new InMemoryUserDetailsManager(user, user2);
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder(10);
    }
}
