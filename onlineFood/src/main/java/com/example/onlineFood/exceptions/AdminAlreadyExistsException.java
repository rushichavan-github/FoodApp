package com.example.onlineFood.exceptions;

public class AdminAlreadyExistsException extends Exception{
	
	public AdminAlreadyExistsException(String msg) {
		super(msg);
	}

	public AdminAlreadyExistsException() {
		super();
	}
}
