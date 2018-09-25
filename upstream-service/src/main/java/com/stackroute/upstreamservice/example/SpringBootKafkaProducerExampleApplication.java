package com.stackroute.upstreamservice.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringBootKafkaProducerExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootKafkaProducerExampleApplication.class, args);
	}
}
