package edu.tus.carapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.tus.carapp.dto.Car;

@SpringBootApplication
public class SampleCarAppApplication {

	public static void main(String[] args) {
			SpringApplication.run(SampleCarAppApplication.class, args);
			System.out.println("Car App - Spring Boot Running");
//			Wine wine = new Wine(4444666L, "john", 2022, "tasty grapes", "Spain", "Rioja", "Describe words", "Nice pic");
//			System.out.println(wine);

	}

}
