package com.example.onlineFood.exceptions;

public class NoFoodFoundException extends Exception{
		
	public NoFoodFoundException(String msg) {
		super(msg);
	}

	public NoFoodFoundException() {
		super();
	}
}
