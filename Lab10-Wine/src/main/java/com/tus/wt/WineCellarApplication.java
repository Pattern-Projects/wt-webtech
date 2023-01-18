package com.tus.wt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WineCellarApplication {

	public static void main(String[] args) {
		SpringApplication.run(WineCellarApplication.class, args);
		System.out.println("Wine time!!");
	}

}
