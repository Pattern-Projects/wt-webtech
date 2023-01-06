package com.tus.webtech;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController @RequestMapping("/api/v1")
public class URL_MappingService_v1 {

	@RequestMapping("/")
	public String index() {
		return "<h1 style='color:red'>Api version 1</h1><p>Hello Spring Boot<p>";
	}
	
	@RequestMapping("/abc")
	public String second() {
		return "<h1 style='color:red'>Api version 1</h1><p>Hello again Spring Boot<p>";
	}

}
