package com.example.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Category;
import com.example.exception.ResourceNotFoundException;
import com.example.repository.CategoryRepository;
import com.example.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	CategoryRepository categoryRepository;

	@Override
	public List<Category> getAllCategories() {
		return categoryRepository.findAll();
	}

	@Override
	public Category createCategory(Category category) {
		return categoryRepository.save(category);
	}

	@Override
	public Category getCategoryById(Long id) {
		return categoryRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Category", "id", id));
	}

	@Override
	public Category updateCategory(Long id, Category categoryDetails) {
	    Category category = categoryRepository.findById(id)
	            .orElseThrow(() -> new ResourceNotFoundException("Category", "id", id));

	    // Update category details
	    category.setCategoryName(categoryDetails.getCategoryName());
	    // Add more fields to update as needed

	    return categoryRepository.save(category);
	}


	@Override
	public void deleteCategory(Long id) {
		Category category = categoryRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Category", "id", id));

		categoryRepository.delete(category);
	}
}
