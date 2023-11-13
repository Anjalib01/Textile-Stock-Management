package com.tyss.textilestockmanagement.exception;

public class UserWithGivenEmailIsAlreadyExistException extends RuntimeException {

	public UserWithGivenEmailIsAlreadyExistException() {

	}

	@Override
	public String getMessage() {
		return "user with given email is already exist";
	}

}
