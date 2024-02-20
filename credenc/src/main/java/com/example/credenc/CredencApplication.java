package com.example.credenc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.examle.jparepository")
@EntityScan("com.example.entity")
@ComponentScan("com.example.controller")
@ComponentScan("com.example") 
public class CredencApplication {

	public static void main(String[] args) {
		SpringApplication.run(CredencApplication.class, args);
	}
}
