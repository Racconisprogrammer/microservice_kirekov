package com.kirekov_microservice.orderservice.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "orders")
public class Order {
    @Id
    private String id;
    private String productId;
    private int quantity;
}
