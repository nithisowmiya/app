package com.example.customer.customer.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.customer.customer.entity.UserEntity;
import com.example.customer.customer.service.CustomerService;


@RestController
public class CustomerController {
	@Autowired
	public CustomerService customerService;
	
	@PostMapping("/post")
	private String save(@RequestBody UserEntity customer) {
		customerService.save(customer);
		return"Ok";
}
}