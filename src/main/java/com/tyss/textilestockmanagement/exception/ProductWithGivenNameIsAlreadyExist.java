package com.tyss.textilestockmanagement.exception;

public class ProductWithGivenNameIsAlreadyExist extends RuntimeException{

	@Override
	public String getMessage() {
		return "product with given name is already exist";
	}

	
	
}
