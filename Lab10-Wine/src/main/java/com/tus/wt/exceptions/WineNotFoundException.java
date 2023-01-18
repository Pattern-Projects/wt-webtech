package com.tus.wt.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.tus.wt.dto.Wine;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class WineNotFoundException extends Exception {
	public WineNotFoundException() {}
	public WineNotFoundException(String message) {
		super(message);
	}
}
