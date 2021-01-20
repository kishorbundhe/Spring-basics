package com.example.springbasics.dependencyinjectionmanually;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import com.example.springbasics.services.PropertyGreetingServices;

import org.junit.jupiter.api.BeforeEach;

public class PropertyInjectorTest {
	
	PropertyInjector propertyInjector;
	@BeforeEach
	public void setUp() throws Exception {
		// Mimicing what Spring Framework will do
		// Here you have the control and you have the IOC
		propertyInjector = new PropertyInjector();
		propertyInjector.greetingServices = new PropertyGreetingServices();
	}

	@Test
	public void test() {
		System.out.println("FFFFFFFFFF");
		String st=propertyInjector.getGreeting();
		System.out.println(st);
	}

}
