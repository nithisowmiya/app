package com.join.jpa.controller;

import com.join.jpa.dto.OrderRequest;
import com.join.jpa.entity.Customer;
import com.join.jpa.repository.CustomerRepository;
import com.join.jpa.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private ProductRepository productRepository;

    @PostMapping("/post")
    public Customer save(@RequestBody OrderRequest request){
        return customerRepository.save(request.getCustomer());
    }
    @GetMapping("/getall")
    public List<Customer> getAll(){
        return customerRepository.findAll();
    }

}
