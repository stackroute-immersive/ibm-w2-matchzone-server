package com.stackroute.matchzone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@ComponentScan(basePackages="com.stackroute.*")
@SpringBootApplication
@EnableEurekaClient // for eureka server to find this application
public class UserProfileService {

	public static void main(String[] args) {
		SpringApplication.run(UserProfileService.class, args);
	}
}
