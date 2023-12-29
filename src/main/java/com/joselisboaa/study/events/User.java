package com.joselisboaa.study.events;

import org.springframework.stereotype.Component;

@Component
public class User {
	private boolean active;
	private String name = "Nome";
	
	public void setActive(boolean active) {
		this.active = active;
	}
	
	public String getName() {
		return this.name;
	}
}
