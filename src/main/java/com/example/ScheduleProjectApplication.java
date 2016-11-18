package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ScheduleProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext cac = SpringApplication.run(ScheduleProjectApplication.class, args);
		ScheduleProjectApplication spa = cac.getBean(ScheduleProjectApplication.class);
		spa.hello();
	}

	public void hello(){
		System.out.println("HelloWorld!");
	}
}
