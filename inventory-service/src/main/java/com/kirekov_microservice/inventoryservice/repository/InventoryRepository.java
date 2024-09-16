package com.kirekov_microservice.inventoryservice.repository;

import com.kirekov_microservice.inventoryservice.models.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Inventory, String> {
}
