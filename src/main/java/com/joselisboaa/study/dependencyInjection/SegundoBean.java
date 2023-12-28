package com.joselisboaa.study.dependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SegundoBean {
	private PrimeiroBean primeiroBean;
	
	public SegundoBean(PrimeiroBean primeiroBean) {
		this.primeiroBean = primeiroBean;
		
		System.out.printf("Primeiro Bean: %s \n", primeiroBean);
	}
	
	@Autowired
	public void setPrimeiroBean(PrimeiroBean primeiroBean) {
		this.primeiroBean = primeiroBean;
	}
}
