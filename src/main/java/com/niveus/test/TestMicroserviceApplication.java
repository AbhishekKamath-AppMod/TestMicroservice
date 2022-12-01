package com.niveus.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.niveus.controller", "com.niveus.entity", "com.niveus.service",
		"com.niveus.model" })
public class TestMicroserviceApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(TestMicroserviceApplication.class, args);
		System.out.println("Application Started.......................");
	}

	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(TestMicroserviceApplication.class);
	}
}
