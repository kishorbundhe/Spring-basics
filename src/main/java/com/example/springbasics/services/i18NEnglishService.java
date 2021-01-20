package com.example.springbasics.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("i18Service")
public class i18NEnglishService implements GreetingServices{

	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		return "Hello World";
	}

}
