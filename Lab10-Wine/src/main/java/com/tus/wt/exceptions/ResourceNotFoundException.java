package com.tus.wt.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.tus.wt.dto.Wine;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends Exception {
	public ResourceNotFoundException() {}
	public ResourceNotFoundException(String message) {
		super(message);
	}
}
