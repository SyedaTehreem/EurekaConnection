package com.customer.service.CustomerApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


/////For Eureka Service discovery

/*@AutoConfiguration*/
@SpringBootApplication
@EnableEurekaClient

public class CustomerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerApplication.class, args);
		System.out.println("Eureka client side");
	}

}
