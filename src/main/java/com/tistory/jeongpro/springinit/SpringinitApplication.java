package com.tistory.jeongpro.springinit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.event.EventListener;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@SpringBootApplication
public class SpringinitApplication {
	public static void main(String[] args) {
		ConfigurableApplicationContext ac = SpringApplication.run(SpringinitApplication.class, args);
	}
	@EventListener(ApplicationReadyEvent.class)
	public void onApplicationReadyEvent(){
		System.out.println("Application Ready");
	}
}
