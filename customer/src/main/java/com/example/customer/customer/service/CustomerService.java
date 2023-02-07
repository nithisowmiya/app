package com.example.customer.customer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.customer.customer.Repository.CustomerRepository;
import com.example.customer.customer.Repository.UserRepository;
import com.example.customer.customer.entity.UserEntity;

@Service
public class CustomerService {
	  @Autowired
	    private CustomerRepository customerReposirory;
	  @Autowired
	  private UserRepository userRepository;
	   
	   	    	 public String save(UserEntity customer){
	    		 userRepository.saveAndFlush(customer);
	    		 return"Ok";
	    		 }
	    }

	  


