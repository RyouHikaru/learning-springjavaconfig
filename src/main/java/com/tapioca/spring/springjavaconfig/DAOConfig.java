package com.tapioca.spring.springjavaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DAOConfig {

	@Bean
	public DAO dao() {
		return new DAO();
	}

}
