package com.tyss.textilestockmanagement.exception;

public class InventoryWithGivenDetailsNotExistException extends RuntimeException {
	String message;

	public InventoryWithGivenDetailsNotExistException() {
		message = "invetory with given details not found";
	}

	@Override
	public String getMessage() {
		return message;
	}

}
