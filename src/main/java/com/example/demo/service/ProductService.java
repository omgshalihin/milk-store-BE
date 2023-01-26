package com.example.demo.service;

import com.example.demo.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> getProducts();

    Product addProduct(Product productDetails);

    Product getSpecificProduct(String id);

    Product updateProductQuantity(String id, Double orderQuantity);
}
