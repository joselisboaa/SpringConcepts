package com.joselisboaa.study.profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("prod")
@Component
public class ProdBean {
	public ProdBean() {
		System.out.println("Esse Bean pertence ao perfil de produção");
	}
}
