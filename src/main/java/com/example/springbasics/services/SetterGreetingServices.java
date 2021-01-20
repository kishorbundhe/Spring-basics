package com.example.springbasics.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingServices implements GreetingServices {
	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		return "Kash Ahat tumhi - SetterGreetingServices";
	}
}
