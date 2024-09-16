package com.kirekov_microservice.productservice.repository;

import com.kirekov_microservice.productservice.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository  extends JpaRepository<Product, String> {
}
