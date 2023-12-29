package com.joselisboaa.study.events;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.joselisboaa.study.beanLifeCycle.NewBean;

@Component
public class BeanDestroyEvent {
	
	public BeanDestroyEvent() {
		
	}
}
