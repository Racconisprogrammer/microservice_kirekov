package com.kirekov_microservice.orderservice.web;

import com.kirekov_microservice.orderservice.web.dto.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "product-service")
public interface ProductClient {

    @GetMapping("/product/{id}")
    Product getProductById(@PathVariable String id);
}
