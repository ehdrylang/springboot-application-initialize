package com.tistory.jeongpro.springinit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class SpringinitApplication {
	public static void main(String[] args) {
		//ConfigurableApplicationContext : ApplicationContext를 코드에 의해서 재구성할 수 있도록 기능을 집어넣은 ApplicationContext.
		ConfigurableApplicationContext ac = SpringApplication.run(SpringinitApplication.class, args);
		ac.publishEvent(new MyEvent(ac,"My Spring Event"));
	}
	@EventListener(MyEvent.class)
	public void onMyEvent(MyEvent myEvent){
		System.out.println("Hello EventListener : " + myEvent.getMessage());
	}
	static class MyEvent extends ApplicationEvent {
		private final String message;

		//원래 String message는 없는 건데 추가한 것임.
		public MyEvent(Object source, String message) {
			super(source);
			this.message = message;
		}
		public String getMessage(){
			return message;
		}
	}
}

