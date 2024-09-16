package com.kirekov_microservice.inventoryservice.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Inventory {
    @Id
    private String productId;
    private int quantity;
}
