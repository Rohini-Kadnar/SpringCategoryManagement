package com.example.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Product;
import com.example.exception.ResourceNotFoundException;
import com.example.repository.ProductRepository;
import com.example.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepository productRepository;

	@Override
	public Product createProduct(Product product) {
		return productRepository.save(product);
	}

	@Override
	public Product getProductById(Long id) {
		return productRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Product", "id", id));
	}


	@Override
	public Product updateProduct(Long id, Product productDetails) {
	    Product product = productRepository.findById(id)
	            .orElseThrow(() -> new ResourceNotFoundException("Product", "id", id));

	    product.setProductName(productDetails.getProductName());
	    product.setPrice(productDetails.getPrice());
	    product.setDescription(productDetails.getDescription()); // Updating product description

	    return productRepository.save(product);
	}

	
	

	@Override
	public void deleteProduct(Long id) {
		Product product = productRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Product", "id", id));

		productRepository.delete(product);
	}

	@Override
	public List<Product> getAllProducts() {
	
		return productRepository.findAll();
	}


}
