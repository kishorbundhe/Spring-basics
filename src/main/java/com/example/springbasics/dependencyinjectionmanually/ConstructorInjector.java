package com.example.springbasics.dependencyinjectionmanually;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.example.springbasics.services.GreetingServices;
@Component
public class ConstructorInjector {
	
private GreetingServices greetingServices;
	
	public String getGreeting() {
		return greetingServices.sayGreeting();
	}
	
	public ConstructorInjector(@Qualifier("constructorGreetingServices") GreetingServices greetingServices) {
		this.greetingServices = greetingServices;
	}

	
}
