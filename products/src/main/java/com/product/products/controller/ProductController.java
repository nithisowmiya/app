package com.product.products.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.product.products.entity.Product;
import com.product.products.service.ProductService;

@RestController
public class ProductController {
	@Autowired
	public ProductService productService;
	@PostMapping("/post")
	private String save(@RequestBody Product product){
		productService.save(product);
		return"Ok";
	}

}
