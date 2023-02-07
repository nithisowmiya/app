package com.example.customer.customer.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.customer.customer.entity.CustomerEntity;
@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity,Integer> {

}
