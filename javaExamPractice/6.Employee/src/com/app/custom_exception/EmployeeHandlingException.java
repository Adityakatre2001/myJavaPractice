package com.app.custom_exception;

@SuppressWarnings("serial")
public class EmployeeHandlingException extends Exception {
	public EmployeeHandlingException(String mesg) {
		super(mesg);
		
	}
}
