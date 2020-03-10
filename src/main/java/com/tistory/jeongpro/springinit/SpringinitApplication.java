package com.tistory.jeongpro.springinit;

import com.tistory.jeongpro.springinit.controller.MyController;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class SpringinitApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringinitApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void init(){
		System.out.println("Hello EventListener!! ApplicationReadyEvent");
	}
}

