package com.joselisboaa.study.listeners;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.joselisboaa.study.events.BeanDestroyEvent;

@Component
public class BeanListener {

	@EventListener
	public void beanHasBeenDestroiedListener(BeanDestroyEvent bean) {
		System.out.println("Bean " + bean + " foi destruído.");
	}
}
