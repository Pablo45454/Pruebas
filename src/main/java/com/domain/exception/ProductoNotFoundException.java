package com.domain.exception;

public class ProductoNotFoundException extends RuntimeException {
	private String message;

	public ProductoNotFoundException(String message) {
		super();
		this.message = message;
	}
	
	
}
