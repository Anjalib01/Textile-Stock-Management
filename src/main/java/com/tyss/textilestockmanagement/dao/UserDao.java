package com.tyss.textilestockmanagement.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tyss.textilestockmanagement.dto.User;
import com.tyss.textilestockmanagement.repository.UserRepository;
@Repository
public class UserDao {
	@Autowired
	private UserRepository repository;
	
//	public User saveUser(User user) {
//		User dbUser=repository.findByEmail(user.getEmail());
//		if(dbUser == null) {
//			repository.save(user);
//			return user;
//		}
//		throw new UserWithGivenEmailIsAlreadyExist();
//	}
}
