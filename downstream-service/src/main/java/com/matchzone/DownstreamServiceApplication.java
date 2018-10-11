package com.matchzone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

//Annotating the class with @SpringBootApplication
@EnableEurekaClient
@SpringBootApplication
public class DownstreamServiceApplication {

	public static void main(String [] args) {
		SpringApplication.run(DownstreamServiceApplication.class, args);
	}
	
}
