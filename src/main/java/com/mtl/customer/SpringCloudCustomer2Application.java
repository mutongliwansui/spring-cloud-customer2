package com.mtl.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@SpringBootApplication
@EnableCircuitBreaker
public class SpringCloudCustomer2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudCustomer2Application.class, args);
	}
}
