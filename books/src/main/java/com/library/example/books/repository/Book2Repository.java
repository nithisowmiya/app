package com.library.example.books.repository;

import com.library.example.books.entity.book2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Book2Repository extends JpaRepository<book2, Integer> {
}
