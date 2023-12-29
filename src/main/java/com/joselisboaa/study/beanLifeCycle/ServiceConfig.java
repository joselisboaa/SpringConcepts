package com.joselisboaa.study.beanLifeCycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {

	@Bean(initMethod = "init", destroyMethod = "destroy")
	public NewBean newBean() {
		return new NewBean();
	}
}
