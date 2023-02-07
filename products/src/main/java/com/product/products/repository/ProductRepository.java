package com.product.products.repository;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.product.products.dto.ProductDto;
import com.product.products.entity.Product;
import com.product.products.entity.ProductDetails;

public interface ProductRepository extends JpaRepository<ProductDetails, UUID> {


	void saveAndFlush(Product product);

}
