package com.library.example.books.repository;

import com.library.example.books.entity.book1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Book1Repository extends JpaRepository<book1, Integer> {
}
