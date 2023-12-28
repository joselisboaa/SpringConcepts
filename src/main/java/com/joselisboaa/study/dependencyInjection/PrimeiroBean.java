package com.joselisboaa.study.dependencyInjection;

import org.springframework.stereotype.Component;

@Component
public class PrimeiroBean {
	public PrimeiroBean() {
		System.out.println("Primeiro Bean A");
	}
}
