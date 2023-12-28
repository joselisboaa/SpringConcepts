package com.joselisboaa.study.dependencyInjection;

import org.springframework.stereotype.Component;

@Component
public class InterfaceImpl2 implements InterfaceBean {
	public String test() {
		return "Test";
	}

	
	public InterfaceImpl2() {
		System.out.println("Implementação 2");
	}
}
