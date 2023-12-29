package com.joselisboaa.study.profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("dev")
@Component
public class DevBean {
	public DevBean() {
		System.out.println("Esse Bean pertence ao perfil de desenvolvimento");
	}
}
