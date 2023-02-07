package com.library.example.books.repository;

import com.library.example.books.entity.librarys;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibrarysRepositroy extends JpaRepository<librarys, Integer> {
}
