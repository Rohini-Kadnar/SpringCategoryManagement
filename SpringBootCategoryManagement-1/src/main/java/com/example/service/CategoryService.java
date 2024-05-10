package com.example.service;

import com.example.entity.Category;

import java.util.List;



public interface CategoryService {
	
	 public List<Category> getAllCategories();

	    public Category createCategory(Category category);

	    public Category getCategoryById(Long id);

	    public Category updateCategory(Long id, Category categoryDetails);

	    public void deleteCategory(Long id);
}
