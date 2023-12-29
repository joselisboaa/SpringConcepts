package com.joselisboaa.study.events;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class UserActivate {
	@Autowired
	private ApplicationEventPublisher eventPublisher;
	
	public void activate(User user) {
		user.setActive(true);
		
		eventPublisher.publishEvent(new UserActivateEvent(user));
	}
}
