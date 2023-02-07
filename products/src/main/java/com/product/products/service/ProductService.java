package com.product.products.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.products.dto.ProductDto;
import com.product.products.entity.Product;
import com.product.products.repository.ProductDetailsRepository;
import com.product.products.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository productRepository;
	@Autowired
	private ProductDetailsRepository productDetailsRepository;
	public String save(Product product) {
		productRepository.saveAndFlush(product);
		return"Ok";
		
	}
	
	

}
