package com.example.springbasics.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingServices implements GreetingServices{
	
	public String sayGreeting() {
		return "Kasha Ashat Tumhi ConstructorGreetingServices";
	}

}
