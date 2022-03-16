package com.guilinares.workshopmongo.services.exception;

public class ObjectNotFoundException extends RuntimeException{
	private static final long serialVersionUID = 4566839568988347425L;

	public ObjectNotFoundException(String msg) {
		super(msg);
	}
}
