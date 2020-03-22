package com.fardoush.mybusadmin.configs.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import com.fardoush.mybusadmin.utils.Util;

@Configuration
@EnableWebSecurity 
public class WebSecurityConfig  extends WebSecurityConfigurerAdapter{

	public static final String ROLE_ADMIN = "ADMIN";
	public static final String ROLE_USER = "USER";
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		auth.inMemoryAuthentication().withUser("Bashir").password("{noop}badmin").roles(ROLE_ADMIN);
		auth.inMemoryAuthentication().withUser("Saad").password("{noop}usaad").roles(ROLE_USER);
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
	
		http.csrf().disable();
		
		http
		.authorizeRequests()
		.antMatchers("/images/**","/css/**","/js/**")
		.permitAll()
	.and()
		.authorizeRequests()
		.antMatchers("/index").hasAnyRole(ROLE_ADMIN,ROLE_USER)
		.anyRequest().authenticated()
	.and()
		.formLogin()
		.loginPage("/login").loginProcessingUrl("/login-processing")
		.permitAll()
		.usernameParameter("username")
		.passwordParameter("password")
		.defaultSuccessUrl("/index").failureUrl("/login?error=true");
/*	.and()
		.logout()
		.logoutUrl("/logout")
		.logoutSuccessUrl("/");*/
		
	
	}

}
