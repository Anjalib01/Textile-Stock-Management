package com.tyss.textilestockmanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.tyss.textilestockmanagement.dao.ProductDao;
import com.tyss.textilestockmanagement.dto.Product;
import com.tyss.textilestockmanagement.entity.ResponseStructure;
@Service
public class ProductService {
	@Autowired
	private ResponseStructure<Product> structure;
	@Autowired
	private ProductDao dao;

	public ResponseEntity<ResponseStructure<Product>> saveProduct(Product product) {
		Product dbProduct = dao.saveProduct(product);
		structure.setData(dbProduct);
		structure.setMessage("saved");
		structure.setStatusCode(HttpStatus.OK.value());
		return new ResponseEntity<ResponseStructure<Product>>(structure, HttpStatus.OK);
	}


}
