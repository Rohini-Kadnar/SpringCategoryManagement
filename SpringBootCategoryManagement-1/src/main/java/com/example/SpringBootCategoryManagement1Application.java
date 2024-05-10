package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class SpringBootCategoryManagement1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCategoryManagement1Application.class, args);
	}

}
