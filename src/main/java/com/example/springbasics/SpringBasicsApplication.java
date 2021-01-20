package com.example.springbasics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.springbasics.constructors.HelloWorldConstructor;
import com.example.springbasics.controllers.i18Controller;
import com.example.springbasics.dependencyinjectionmanually.ConstructorInjector;
import com.example.springbasics.dependencyinjectionmanually.PropertyInjector;
import com.example.springbasics.dependencyinjectionmanually.SetterInjector;

@SpringBootApplication
public class SpringBasicsApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringBasicsApplication.class, args);
		
		i18Controller i18Controller = (i18Controller) ctx.getBean("i18Controller");
		System.out.println(i18Controller.getGreeting());
		
		System.out.println("-----------------");
		
		HelloWorldConstructor hello = (HelloWorldConstructor) ctx.getBean(HelloWorldConstructor.class);
		System.out.println(hello.getHello());

		System.out.println("-----------------");

		PropertyInjector propertyInjector = (PropertyInjector) ctx.getBean("propertyInjector");
		System.out.println(propertyInjector.getGreeting());

		System.out.println("-----------------");

		SetterInjector setterInjector = (SetterInjector) ctx.getBean("setterInjector");
		System.out.println(setterInjector.getGreeting());

		System.out.println("-----------------");

		ConstructorInjector constructorInjector = (ConstructorInjector) ctx.getBean("constructorInjector");
		System.out.println(constructorInjector.getGreeting());

	}

}
