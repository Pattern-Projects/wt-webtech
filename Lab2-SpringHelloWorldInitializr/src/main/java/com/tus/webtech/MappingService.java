package com.tus.webtech;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MappingService {

	@RequestMapping("/")
	public String index() {
		return "<p style='color:red'>Hello Initializr<p>";
	}
}
