package com.kirekov_microservice.orderservice.repository;

import com.kirekov_microservice.orderservice.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, String> {
}
