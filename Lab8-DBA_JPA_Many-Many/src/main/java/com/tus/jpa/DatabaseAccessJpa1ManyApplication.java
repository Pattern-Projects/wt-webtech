package com.tus.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DatabaseAccessJpa1ManyApplication {

	public static void main(String[] args) {
		SpringApplication.run(DatabaseAccessJpa1ManyApplication.class, args);
		System.out.println("loaded");
	}

}
