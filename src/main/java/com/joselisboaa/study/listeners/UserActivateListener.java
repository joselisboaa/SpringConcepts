package com.joselisboaa.study.listeners;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.joselisboaa.study.events.UserActivateEvent;

@Component
public class UserActivateListener {

	@EventListener
	public void userActivateListener(UserActivateEvent userActivateEvent) {
		System.out.println("Usuário " + userActivateEvent.getUser().getName() + " foi ativado.");
	}
	
}
