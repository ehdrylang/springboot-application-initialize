package com.tistory.jeongpro.springinit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringinitApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringinitApplication.class, args);
		System.out.println("Hello Spring Boot Application");
	}
}
