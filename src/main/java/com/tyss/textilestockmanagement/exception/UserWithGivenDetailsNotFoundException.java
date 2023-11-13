package com.tyss.textilestockmanagement.exception;

public class UserWithGivenDetailsNotFoundException extends RuntimeException {
	public String message;
	public UserWithGivenDetailsNotFoundException() {
		message="User with given details not exist";
	}
	
	@Override
	public String getMessage() {
		return message;
	}

}
