package com.tyss.textilestockmanagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import com.tyss.textilestockmanagement.dto.User;

@Component
public interface UserRepository extends JpaRepository<User, Integer>{

	User findByEmail(String email);
	@Query("select u from User u")
	List<User> getAllUser();
	

}
