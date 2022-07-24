package com.overseer.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.overseer.demo.GeneratorRoutes;

@SpringBootApplication(scanBasePackages = { "com.overseer.controllers", "com.overseer.demo" })
public class OverseerApplication {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		GeneratorRoutes genmgr = new GeneratorRoutes(context);
		SpringApplication.run(OverseerApplication.class, args);
	}
}
