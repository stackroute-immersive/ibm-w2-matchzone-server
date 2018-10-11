package com.matchzone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

//Annotate this class with @SpringBootApplication and @EnableEurekaClient

@SpringBootApplication
@EnableEurekaClient
public class ProjectsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectsApplication.class, args);
	}
}
