package com.example.onlineFood.exceptions;

public class NoCartFoundException extends Exception {
		
	public NoCartFoundException(String string) {
		super(string);
	
	}

	public NoCartFoundException() {
		super();
	}
}
