package com.tyss.textilestockmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.tyss.textilestockmanagement.dto.Product;

@Component
public interface ProductRepository extends JpaRepository<Product, Integer> {
	
	Product findByName(String name);

}
