package com.kirekov_microservice.orderservice.web.dto;

import lombok.Data;

@Data
public class Product {
    private String id;
    private String name;
    private double price;
}
