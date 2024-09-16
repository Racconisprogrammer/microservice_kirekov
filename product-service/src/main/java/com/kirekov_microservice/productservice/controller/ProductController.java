package com.kirekov_microservice.productservice.controller;

import com.kirekov_microservice.productservice.models.Product;
import com.kirekov_microservice.productservice.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequiredArgsConstructor
@RestController
@RequestMapping("/product")
public class ProductController {
    private final ProductService productService;

    @GetMapping
    public List<Product> getAllProducts() {
        return productService.findAll();
    }
    @GetMapping("/{id}")
    public Product getProductbyId(@PathVariable String id) {
        return productService.findById(id);
    }
    @PostMapping
    public Product addProduct(@RequestBody Product product) {
        return productService.save(product);
    }
}
