package com.tnk.wordnest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
		return http
				.authorizeHttpRequests(auth -> auth
						.requestMatchers("/", "/register", "/login").permitAll()
						.anyRequest().authenticated()
						)
				.formLogin(login -> 
					login
						.loginPage("/login")
						.loginProcessingUrl("/login")
						.permitAll()
				)
				.build();
	}
}
