package com.joselisboaa.study.dependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary	
public class InterfaceImpl implements InterfaceBean {
	private String name;
	private String beanTest;
	
	public String test() {
		return "Test";
	}
	
	public InterfaceImpl(String beanTest) {
		this.beanTest = beanTest;
		System.out.println("Implementação 1 " + beanTest);
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
