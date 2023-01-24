package com.example.demo.service;

import com.example.demo.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ProductService {
    List<Product> getProducts();

    Product addProduct(Product productDetails);

    Product getSpecificProduct(String id);
}