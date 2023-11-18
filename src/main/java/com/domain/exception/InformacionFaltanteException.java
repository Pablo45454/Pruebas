package com.domain.exception;

public class InformacionFaltanteException extends RuntimeException {
	private String message;

	public InformacionFaltanteException(String message) {
		super();
		this.message = message;
	}
	
	
}
