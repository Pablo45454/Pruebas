package com.domain.exception;

import lombok.Getter;

@Getter
public class ProveedorException extends RuntimeException{
	private String message;
	
	public ProveedorException(String message) {
		super();
		this.message = message;
	}
}
