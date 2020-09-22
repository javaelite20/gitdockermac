package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.example")
@SpringBootApplication
public class EurekaProducerDemoApplication {

	public static void main(String[] args) {
		System.out.println("Main Class Testing");
		SpringApplication.run(EurekaProducerDemoApplication.class, args);
	}

}
