package com.example.springbasics.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class PrimaryGreetingServices implements GreetingServices{
	
	public String sayGreeting() {
		return "Kasha Ashat Tumhi primary Greeting Service";
	}

}
