package com.akh.springbootsecurity.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class ApplicationSecurityConfig extends WebSecurityConfigurerAdapter {

    private final PasswordEncoder passwordEncoder;

    @Autowired
    public ApplicationSecurityConfig(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable()//bunu etmesek put ,delete,post sorgulari ed bilmirik
                .authorizeRequests()
                .antMatchers("/", "/index", "/css/*", "/js/*").permitAll()
                .antMatchers("/api/**").hasRole(ApplicationUserRole.STUDENT.name())
                .anyRequest()
                .authenticated()
                .and()
                .httpBasic();
    }

    @Override
    @Bean
    protected UserDetailsService userDetailsService() {
        UserDetails kananUser = User.builder()
                .username("kanan")
                .password(passwordEncoder.encode("sun"))
                .roles(ApplicationUserRole.ADMIN.name())
                .build();
        UserDetails cavidUser = User.builder()
                .username("cavid")
                .password(passwordEncoder.encode("sun"))
                .roles(ApplicationUserRole.STUDENT.name())
                .build();
        UserDetails tomUser = User.builder()
                .username("tom")
                .password(passwordEncoder.encode("sun"))
                .roles(ApplicationUserRole.ADMINTRAINEE.name())
                .build();
        return new InMemoryUserDetailsManager(
                kananUser,
                cavidUser,
                tomUser
        );
    }
}




