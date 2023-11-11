package com.tyss.textilestockmanagement.exception;

public class UserWithGivenEmailIsAlreadyExist extends RuntimeException {

	public UserWithGivenEmailIsAlreadyExist() {

	}

	@Override
	public String getMessage() {
		return "user with given email is already exist";
	}

}
