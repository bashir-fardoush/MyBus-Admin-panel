package com.fardoush.mybusadmin;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.fardoush.mybusadmin.configs.persistance.HibernateConfig;

@Configuration
@ComponentScan(basePackages = {
		"com.fardoush.mybusadmin.configs.persistance",
		"com.fardoush.mybusadmin.configs.security",
		"com.fardoush.mybusadmin.services"})
public class AppConfig {
	
	@Bean
	public HibernateConfig getHibernateConfig() {
		return new HibernateConfig();
	}

	
}
