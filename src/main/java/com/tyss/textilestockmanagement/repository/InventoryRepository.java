package com.tyss.textilestockmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tyss.textilestockmanagement.dto.Inventory;

public interface InventoryRepository extends JpaRepository<Inventory,Integer >{

}
