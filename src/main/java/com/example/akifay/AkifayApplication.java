package com.example.akifay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.akifay"})
public class AkifayApplication {

	public static void main(String[] args) {
		SpringApplication.run(AkifayApplication.class, args);

	}
}
