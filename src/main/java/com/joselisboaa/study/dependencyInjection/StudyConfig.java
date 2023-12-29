package com.joselisboaa.study.dependencyInjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudyConfig {

	@Bean
	public InterfaceImpl interfaceImpl() {
		System.out.println("Bean de Configuração");
		InterfaceImpl interfaceImpl =  new InterfaceImpl("Bean Testando Inicializado");
		interfaceImpl.setName("Interface Implementadora");
		
		return interfaceImpl;
	}
	
}
