package com.example.springbasics.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"SP","default"})
@Service("i18Service")
public class i18NSpanishService implements GreetingServices{

	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		return "Holaa Mundo";
	}

}
