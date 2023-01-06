package com.tus.webtech;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController @RequestMapping("/api/v2")
public class URL_MappingService_v2 {

	@RequestMapping("/")
	public String index() {
		return "<h1 style='color:red'>Api version 2</h1><p>Hello Spring Boot<p>";
	}
	
	@RequestMapping("/abc")
	public String second() {
		return "<h1 style='color:red'>Api version 2</h1><p>Hello again Spring Boot<p>";
	}

}
