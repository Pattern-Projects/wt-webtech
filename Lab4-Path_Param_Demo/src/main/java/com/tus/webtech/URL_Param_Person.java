package com.tus.webtech;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController @RequestMapping("/api/person")
public class URL_Param_Person {
	Person p = new Person ("John", "McGinty", 35);

	@RequestMapping("/")
	public String index() {
		return "<p style='color:red'>Hello World. I'm Working Person!<p>";
	}

	@RequestMapping("/someperson")
	public Person getPerson() {
		return p;
	}

	@PostMapping("/someperson")
	public String postPerson(@RequestBody Person person) {
		p = person;
		return person.getFirstName()+ " " + person.getLastName() + " " + person.getAge();
	}

}
