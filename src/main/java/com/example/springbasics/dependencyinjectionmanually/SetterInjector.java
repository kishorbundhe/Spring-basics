package com.example.springbasics.dependencyinjectionmanually;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.example.springbasics.services.GreetingServices;

@Component
public class SetterInjector {

	private GreetingServices greetingServices;
	
	public String getGreeting() {
		return greetingServices.sayGreeting();
	}
	@Qualifier("setterGreetingServices")
	@Autowired
	public void setGreetingServices(GreetingServices greetingServices) {
		this.greetingServices = greetingServices;
	}
}
