package com.example.onlineFood.exceptions;

public class FoodAlreadyExistsException extends Exception {
	public FoodAlreadyExistsException(String msg) {
		super(msg);
	}

	public FoodAlreadyExistsException() {
		super();
	}
}
