package com.tyss.textilestockmanagement.exception;

public class NoDataFoundException extends RuntimeException {

	String message;

	public NoDataFoundException() {
		message = "No data found";
	}

	@Override
	public String getMessage() {
		return message;
	}

}
