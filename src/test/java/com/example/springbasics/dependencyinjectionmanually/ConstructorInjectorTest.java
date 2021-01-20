package com.example.springbasics.dependencyinjectionmanually;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.springbasics.services.ConstructorGreetingServices;

class ConstructorInjectorTest {

	ConstructorInjector constructorInjector;
	@BeforeEach
	void setUp() throws Exception {
		constructorInjector = new ConstructorInjector(new ConstructorGreetingServices());
	}

	@Test
	void test() {
		System.out.println(constructorInjector.getGreeting());
		
	}

}
