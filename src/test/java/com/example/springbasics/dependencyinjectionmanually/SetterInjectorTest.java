package com.example.springbasics.dependencyinjectionmanually;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.example.springbasics.services.SetterGreetingServices;

class SetterInjectorTest {
	
	public SetterInjector setterInjector;
	@BeforeEach
	void setUp() throws Exception {
		setterInjector = new SetterInjector();
		setterInjector.setGreetingServices(new SetterGreetingServices());
	}

	@Test
	void test() {
		System.out.println(setterInjector.getGreeting());
	}

}
