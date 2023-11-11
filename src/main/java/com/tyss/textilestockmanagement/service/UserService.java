package com.tyss.textilestockmanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.tyss.textilestockmanagement.dao.UserDao;
import com.tyss.textilestockmanagement.dto.User;
import com.tyss.textilestockmanagement.entity.ResponseStructure;
import com.tyss.textilestockmanagement.exception.UserExceptionHandler;
@Service
public class UserService {
	@Autowired
	private ResponseStructure<User> structure;
	@Autowired
	private UserDao dao;

	public ResponseEntity<ResponseStructure<User>> saveUser(User user) {
		User dbUser = dao.saveUser(user);
		structure.setData(dbUser);
		structure.setMessage("saved");
		structure.setStatusCode(HttpStatus.OK.value());
		return new ResponseEntity<ResponseStructure<User>>(structure, HttpStatus.OK);
	}

}
