package com.tyss.textilestockmanagement.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tyss.textilestockmanagement.dto.User;
import com.tyss.textilestockmanagement.exception.NoDataFoundException;
import com.tyss.textilestockmanagement.exception.UserWithGivenDetailsNotFoundException;
import com.tyss.textilestockmanagement.exception.UserWithGivenEmailIsAlreadyExistException;
import com.tyss.textilestockmanagement.repository.UserRepository;

@Repository
public class UserDao {
	@Autowired
	private UserRepository repository;

	public User saveUser(User user) {
		User dbUser = repository.findByEmail(user.getEmail());
		if (dbUser == null) {
			repository.save(user);
			return user;
		}
		throw new UserWithGivenEmailIsAlreadyExistException();
	}

	public User updateUser(User user) {
		Optional<User> dbUser = repository.findById(user.getId());
		if (dbUser.isPresent()) {
			repository.save(user);
			return user;
		}
		throw new UserWithGivenDetailsNotFoundException();
	}

	public boolean removeUser(int id) {
		Optional<User> dbUser = repository.findById(id);
		if (dbUser.isPresent()) {
			repository.delete(dbUser.get());
			return true;
		}
		throw new UserWithGivenDetailsNotFoundException();
	}

	public User getUserById(int id) {
		Optional<User> dbUser = repository.findById(id);
		if (dbUser.isPresent()) {
			return dbUser.get();

		}
		throw new UserWithGivenDetailsNotFoundException();
	}
	public List<User> getAllUser() {
		List<User> user=repository.getAllUser();
		if(user!= null && !user.isEmpty()) {
			return user;
		}
		throw new NoDataFoundException();
	}

}
