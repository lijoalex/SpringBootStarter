package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstProjApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(FirstProjApplication.class, args);
		
		System.out.println("Boot Starts");
		
//		Alien a = new Alien(); //tight coupling
		
		Alien  a = context.getBean(Alien.class);
		a.show();

	}

}
