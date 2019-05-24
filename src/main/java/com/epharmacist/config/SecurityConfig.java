package com.epharmacist.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Autowired
	private DataSource dataSource;
	
	protected void configure(AuthenticationManagerBuilder auth) throws Exception{
		
		
		auth.jdbcAuthentication().dataSource(dataSource)
		.usersByUsernameQuery("select email, password, true from auth_user where email=?")
		.authoritiesByUsernameQuery("select auth_user_email, auth_role_name from auth_user_role where auth_user_email=?")
		.passwordEncoder(passwordEncoder());
	
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Override 
	protected void configure(HttpSecurity http) throws Exception{
		http.authorizeRequests().antMatchers("/","/register","/css/**","/webjars/**").permitAll()
		.and().formLogin().loginPage("/login").permitAll()
		.defaultSuccessUrl("/").and().logout().logoutSuccessUrl("/");
	}
}
