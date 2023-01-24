package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/products")
public class ProductController {


    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    ResponseEntity<List<Product>> getProducts() {
        return ResponseEntity.status(HttpStatus.OK).body(productService.getProducts());
    }

    @GetMapping("/{id}")
    ResponseEntity<Product> getSpecificProduct(@PathVariable String id) {
        if (productService.getSpecificProduct(id) == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.status(HttpStatus.OK).body(productService.getSpecificProduct(id));

    }

    @PostMapping
    ResponseEntity<Product> addProduct(@RequestBody Product productDetails) {
        Product savedProduct = productService.addProduct(productDetails);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedProduct);
    }
}
