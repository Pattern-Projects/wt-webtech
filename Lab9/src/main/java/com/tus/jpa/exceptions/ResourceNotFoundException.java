package com.tus.jpa.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import com.tus.jpa.dto.Course;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends Exception {
	public ResourceNotFoundException() {}
	public ResourceNotFoundException(String message) {
		super(message);
	}
}
