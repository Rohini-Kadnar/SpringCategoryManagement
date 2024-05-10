package com.example.service;

import java.util.List;

import com.example.entity.Product;


public interface ProductService {

    // API to get all products with pagination
    public List<Product> getAllProducts();

    // API to create a new product
    public Product createProduct(Product product);

    // API to get a product by its ID
    public Product getProductById(Long id);

    // API to update a product by its ID
    public Product updateProduct(Long id, Product product);
//    Product updateProductCategory(Long id, Long categoryId);

    // API to delete a product by its ID
    public void deleteProduct(Long id);
}
