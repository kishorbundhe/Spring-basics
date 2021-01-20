package com.example.springbasics.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.example.springbasics.services.GreetingServices;

@Controller
public class i18Controller {
	
	private final GreetingServices greetingServices;

	public i18Controller(@Qualifier("i18Service") GreetingServices greetingServices) {
		this.greetingServices = greetingServices;
	}
	
	public String getGreeting() {
		return greetingServices.sayGreeting();
	}
}
