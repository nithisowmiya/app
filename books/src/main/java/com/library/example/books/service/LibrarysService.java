package com.library.example.books.service;

import com.library.example.books.entity.librarys;
import com.library.example.books.repository.Book1Repository;
import com.library.example.books.repository.Book2Repository;
import com.library.example.books.repository.LibrarysRepositroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Service
public class LibrarysService {
    @Autowired
    private LibrarysRepositroy librarysRepositroy;
    @Autowired
    private Book1Repository book1Repository;
    @Autowired
    private Book2Repository book2Repository;

    public String save(librarys country) {
        librarysRepositroy.saveAndFlush(country);
        return "Ok";
    }
    public List<librarys> getAll() {
        return librarysRepositroy.findAll();
    }
    public Optional<librarys> getById(int id) {
        return librarysRepositroy.findById(id);
    }

    public void deleteById(int id) {
        librarysRepositroy.deleteById(id);
    }

    public String update(librarys librarys) {
        librarysRepositroy.saveAndFlush(librarys);
        return "update";
    }
    public librarys save(List<librarys> obj1) {
        List<librarys> obj2 = new ArrayList<>();
        librarys obj3 = null;
        for (librarys obj4 : obj1) {
            obj3 = new librarys();
            librarysRepositroy.saveAndFlush(obj4);
        }
        return obj3;
    }
}
