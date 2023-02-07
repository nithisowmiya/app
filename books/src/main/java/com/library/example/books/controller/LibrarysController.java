package com.library.example.books.controller;

import com.library.example.books.entity.librarys;
import com.library.example.books.service.LibrarysService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class LibrarysController {
    @Autowired
    public LibrarysService librarysService;
    @PostMapping("/post")
    private String save(@RequestBody librarys librarys){
        librarysService.save(librarys);
        return"ok";
    }
    @GetMapping("/get")
    private List<librarys> getAll(){
        return librarysService.getAll();
    }
    @GetMapping("/get/{id}")
    private Optional<librarys>getId(@PathVariable("id")int id){
        return librarysService.getById(id);
    }
    @DeleteMapping("/delete/{id}")
    private void deleteId(@PathVariable("id") int id) {
        librarysService.deleteById(id);
    }
    @PutMapping("/update")
    private String update(@RequestBody librarys librarys){
        librarysService.save(librarys);
        return "update";
    }
    @PostMapping("/ListAll")
    private String ListAll(@RequestBody List<librarys> obj1){
        librarys obj2 = librarysService.save(obj1);
        return "ListAll";
    }
}

