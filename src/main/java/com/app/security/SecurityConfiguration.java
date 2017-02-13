package com.app.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Autowired
	private UserDetailsService userDetailsService;

	protected void configure(HttpSecurity httpSecurity) throws Exception {
		httpSecurity.authorizeRequests()
				// .antMatchers("/","/console/**").permitAll()
				.anyRequest().authenticated().and().formLogin().loginPage("/login").usernameParameter("username")
				.passwordParameter("password").permitAll().and().logout().permitAll();

		httpSecurity.csrf().disable();
		httpSecurity.headers().frameOptions().disable();
	}

	@Autowired
	public void configAuthentication(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService).passwordEncoder(passwordencoder());
	}

	@Bean(name = "passwordEncoder")
	public PasswordEncoder passwordencoder() {
		return new BCryptPasswordEncoder();
	}
}
