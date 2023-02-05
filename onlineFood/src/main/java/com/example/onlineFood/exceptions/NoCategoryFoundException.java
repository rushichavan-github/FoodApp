package com.example.onlineFood.exceptions;

public class NoCategoryFoundException extends Exception{
		
	public NoCategoryFoundException(String msg) {
		super(msg);
	}

	public NoCategoryFoundException() {
		super();
	}
}
