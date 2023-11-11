package com.tyss.textilestockmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tyss.textilestockmanagement.dto.Product;
import com.tyss.textilestockmanagement.entity.ResponseStructure;
import com.tyss.textilestockmanagement.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	@PostMapping("/saveProduct")
	public ResponseEntity<ResponseStructure<Product>> saveProduct(@RequestBody Product product) {
		return service.saveProduct(product);		
	}

}
