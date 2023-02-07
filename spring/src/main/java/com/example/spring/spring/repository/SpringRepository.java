package com.example.spring.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.spring.spring.entity.SpringEntity;

@Repository
public interface SpringRepository extends JpaRepository<SpringEntity,Integer> {

}
