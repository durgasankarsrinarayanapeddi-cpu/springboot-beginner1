package com.dssn.spring_begin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication()
// @SpringBootApplication(scanBasePackages = "com.dssn") it s ok if the folders are in the dssn file otherwise they have to be in spring-boot beginner1 folder
public class SpringBeginApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBeginApplication.class, args);
	}

}
