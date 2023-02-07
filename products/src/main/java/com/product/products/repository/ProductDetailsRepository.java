package com.product.products.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.product.products.entity.ProductDetails;

public interface ProductDetailsRepository extends JpaRepository<ProductDetails, UUID> {


}
