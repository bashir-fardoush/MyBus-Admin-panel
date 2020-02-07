package com.fardoush.mybusadmin;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.fardoush.mybusadmin.configs.HibernateConfig;

@Configuration
@ComponentScan(basePackages = {"com.fardoush.mybusadmin.configs"})
public class AppConfig {
	
	@Bean
	public HibernateConfig getHibernateConfig() {
		return new HibernateConfig();
	}

	
}
