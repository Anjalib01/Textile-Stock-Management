package com.tyss.textilestockmanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.tyss.textilestockmanagement.dao.InventoryDao;
import com.tyss.textilestockmanagement.dto.Inventory;
import com.tyss.textilestockmanagement.entity.ResponseStructure;

@Service
public class InventoryService {
	@Autowired
	private InventoryDao dao;

	private ResponseStructure<Inventory> structure;

//	public ResponseEntity<ResponseStructure<Inventory>> saveInventory(Inventory inventory) {
//		Inventory dbInventory = dao.saveInventory(inventory);
//		structure.setMessage("saved");
//		structure.setData(dbInventory);
//		structure.setStatusCode(HttpStatus.OK.value());
//		return new ResponseEntity<ResponseStructure<Inventory>>(structure, HttpStatus.OK);
//	}
	
}
