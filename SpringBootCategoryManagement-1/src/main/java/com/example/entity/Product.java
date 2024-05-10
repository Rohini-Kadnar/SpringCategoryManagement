package com.example.entity;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long pid;
	@Column(name = "product_name", length = 20)
	private String productName;

	@Column(name = "description", length = 80)
	private String description;

	@Column(name = "price")
	private BigDecimal price;

	@Column(name = "stock_quantity")
	private Integer stockQty;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "category_id")

	private Category category;

	// constructors, getters, and setters
}