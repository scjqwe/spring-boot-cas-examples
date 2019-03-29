package com.cas;

import net.unicon.cas.client.configuration.EnableCasClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableCasClient
@SpringBootApplication
public class SpringBootCasExamplesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCasExamplesApplication.class, args);
	}

}
