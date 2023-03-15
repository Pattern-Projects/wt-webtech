package edu.tus.carapp.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)

public class CarNotFoundException extends RuntimeException {

	/**
*	Constructs a new runtime exception with the specified detail message
*/
	public CarNotFoundException(String message) 
	{
		super(message);
	}
}
