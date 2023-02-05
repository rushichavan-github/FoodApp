package com.example.onlineFood.exceptions;

public class NoCustomerFoundException extends Exception {
		
	public NoCustomerFoundException(String msg) {
		super(msg);
	}

	public NoCustomerFoundException() {
		super();
	}
}
