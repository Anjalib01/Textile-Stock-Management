package com.tyss.textilestockmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.tyss.textilestockmanagement.dto.User;

@Component
public interface UserRepository extends JpaRepository<User, Integer>{

	User findByEmail(String email);
	

}
