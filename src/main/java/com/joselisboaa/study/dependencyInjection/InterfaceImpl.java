package com.joselisboaa.study.dependencyInjection;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary	
public class InterfaceImpl implements InterfaceBean {
	public String test() {
		return "Test";
	}
	
	public InterfaceImpl() {
		System.out.println("Implementação 1");
	}
}
