package com.example.Bean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.example.Bean"})

@SpringBootApplication
public class BeanApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeanApplication.class, args);
		System.out.println("Bean Validation");
	}

}
