package org.jsp.userbootdemo.exception;

public class InvalidCredentialsException extends RuntimeException{
	@Override
	public String getMessage() {
		
		return "Invalid Credentials";
	}
}
