package org.jsp.userbootdemo.exception;

public class IdNotFoundException extends RuntimeException{
	@Override
	public String getMessage() {
		return "Invalid id";
	}
}
