package com.matchzone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
//Annotate this class with @EnableEurekaClient and @SpringBootApplication
@EnableEurekaClient
@SpringBootApplication
public class UpstreamServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UpstreamServiceApplication.class, args);
	}
}
