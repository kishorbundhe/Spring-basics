package com.example.springbasics.dependencyinjectionmanually;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.example.springbasics.services.GreetingServices;

@Component
public class PropertyInjector {
	@Autowired
	@Qualifier("propertyGreetingServices")
	public GreetingServices greetingServices;
	public String getGreeting() {
		return greetingServices.sayGreeting();
	}
}
