package com.kirekov_microservice.orderservice.service;

import com.kirekov_microservice.orderservice.models.Order;
import com.kirekov_microservice.orderservice.repository.OrderRepository;
import com.kirekov_microservice.orderservice.web.ProductClient;
import com.kirekov_microservice.orderservice.web.dto.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderRepository orderRepository;
    private final ProductClient productClient;

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    public Order getOrderById(String id) {
        return orderRepository.findById(id).orElse(null);
    }

    public Order addOrder(Order order) {
        Product product = productClient.getProductById(order.getProductId());
        if (product != null) {
            return orderRepository.save(order);
        } else {
            throw new RuntimeException("Product not found");
        }
    }
}
