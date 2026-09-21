package com.example.FipeAPI.aplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.example"})
public class FipeApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(FipeApiApplication.class, args);
	}

}
