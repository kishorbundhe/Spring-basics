package com.example.springbasics.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyGreetingServices implements GreetingServices{

	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		return "Kash Ahat tumhi - PropertyGreeting Services";
	}

}
