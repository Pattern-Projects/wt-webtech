package com.tus.webtech;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController @RequestMapping("/api/params")
public class URL_Param_Mapping {

	@RequestMapping("/")
	public String index() {
		return "<p style='color:red'>Hello World. I'm Working!<p>";
	}

	@RequestMapping("/sayHello/{message}")
	public String ParamMessage(@PathVariable String message) {
		return "<p style='color:red'>Hello World. I'm Working, "+ message +"!<p>";
	}

	@RequestMapping("/sayHi/{firstName}/{lastName}")
	public String helloPathParams(@PathVariable String firstName, @PathVariable String lastName) {
		return "<p style='color:red'>Hello World. I'm Working, "+ firstName + " " + lastName +"!<p>";
	}

	@RequestMapping("/sayDetails/{name}/{age}")
	public String someDetails(@PathVariable String name, @PathVariable int age) {
		return "<p style='color:red'>Hello World. I'm Working, "+ name + " (" + age +")<p>";
	}

}
