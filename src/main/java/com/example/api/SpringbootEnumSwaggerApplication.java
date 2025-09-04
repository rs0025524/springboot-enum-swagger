package com.example.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(
		  info = @Info(
		    title = "My Spring boot enum API",
		    version = "1.0",
		    description = "API documentation for my Spring Boot app"
		  )
		)
@SpringBootApplication
public class SpringbootEnumSwaggerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootEnumSwaggerApplication.class, args);
	}

}
