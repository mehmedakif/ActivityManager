package com.example.akifay;

import com.example.akifay.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import javax.sql.DataSource;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.akifay"})
public class AkifayApplication {

	public static void main(String[] args) {
		SpringApplication.run(AkifayApplication.class, args);

	}


}
