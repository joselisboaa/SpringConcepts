package com.joselisboaa.study.events;

public class UserActivateEvent {
	private User user;

	public UserActivateEvent(User user) {
		this.user = user;
	}

	public User getUser() {
		return user;
	}
}
