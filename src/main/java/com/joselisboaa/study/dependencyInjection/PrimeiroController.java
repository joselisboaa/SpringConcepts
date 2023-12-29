package com.joselisboaa.study.dependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.joselisboaa.study.events.User;
import com.joselisboaa.study.events.UserActivate;

@Controller
public class PrimeiroController {
	
	private InterfaceBean bean;
	
	@Autowired
	private UserActivate userActivate;
	
	@Autowired
	private User user;

	@Autowired
	public PrimeiroController(InterfaceBean bean) {
		this.bean = bean;
		
		System.out.printf("Primeiro controller injetado: %s \n", bean);
	}
	
	public PrimeiroController(String test) {
		
	}

	@GetMapping("/helo")
	@ResponseBody
	public String hello() {
		return bean.toString();
	}

	@GetMapping("/test")
	@ResponseBody
	public String test() {
		return "Test bean!!!!";
	}
	
	@GetMapping("/event")
	@ResponseBody
	public String testEvent() {
		userActivate.activate(user);
		
		return user.getName();
	}
}
