package com.joselisboaa.study.beanLifeCycle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import com.joselisboaa.study.events.BeanDestroyEvent;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class NewBean {
	@Autowired
	private ApplicationEventPublisher eventPublisher;

	@Autowired
	private BeanDestroyEvent beanDestroyEvent;
	
	public NewBean() {
		System.out.println("Novo Bean com ciclo de vida!");
	}
	
//	@PostConstruct
	public void init() {
		System.out.println("Bean inicializado");
	}
	
//	@PreDestroy
	public void destroy() {
		eventPublisher.publishEvent(new BeanDestroyEvent());
	}
}
