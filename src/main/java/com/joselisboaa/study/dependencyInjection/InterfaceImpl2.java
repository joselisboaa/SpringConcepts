package com.joselisboaa.study.dependencyInjection;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class InterfaceImpl2 {
	public String test() {
		return "Test";
	}

	
	public InterfaceImpl2() {
		System.out.println("Implementação 2");
	}
}
