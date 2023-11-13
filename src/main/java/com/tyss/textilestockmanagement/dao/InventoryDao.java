package com.tyss.textilestockmanagement.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tyss.textilestockmanagement.dto.Inventory;
import com.tyss.textilestockmanagement.dto.User;
import com.tyss.textilestockmanagement.exception.InventoryWithGivenDetailsNotExistException;
import com.tyss.textilestockmanagement.exception.NoDataFoundException;
import com.tyss.textilestockmanagement.repository.InventoryRepository;

@Repository
public class InventoryDao {
	@Autowired
	private InventoryRepository repository;

	public void saveInventory(Inventory inventory) {
		if (inventory.getUser() == null) {
			repository.save(inventory);
//			return inventory;
		} else {
			User user=inventory.getUser();
			

		}

	}

	public Inventory updateInventory(Inventory inventory) {
		Optional<Inventory> dbInventory = repository.findById(inventory.getId());
		if (dbInventory != null) {
			repository.save(inventory);
			return inventory;
		}
		throw new InventoryWithGivenDetailsNotExistException();
	}

	public boolean removeInventory(int id) {
		Optional<Inventory> dbInventory = repository.findById(id);
		if (dbInventory != null) {
			repository.delete(dbInventory.get());
			return true;
		}
		throw new InventoryWithGivenDetailsNotExistException();
	}

	public Inventory getInventoryById(int id) {
		Optional<Inventory> dbInventory = repository.findById(id);
		if (dbInventory != null) {
			return dbInventory.get();
		}
		throw new InventoryWithGivenDetailsNotExistException();
	}

	public List<Inventory> getAllInventory() {
		List<Inventory> list = repository.findAll();
		if (list != null && !list.isEmpty()) {
			return list;
		}
		throw new NoDataFoundException();
	}

}
