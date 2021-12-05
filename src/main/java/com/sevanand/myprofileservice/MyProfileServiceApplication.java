package com.sevanand.myprofileservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MyProfileServiceApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(MyProfileServiceApplication.class, args);
	}
	
}
