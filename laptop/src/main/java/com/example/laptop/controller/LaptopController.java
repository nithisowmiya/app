package com.example.laptop.controller;

import com.example.laptop.entity.LaptopEntity;
import com.example.laptop.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class LaptopController {
    @Autowired
    public LaptopService service;
    @PostMapping("/post")
    private String save(@RequestBody LaptopEntity laptop){
        service.save(laptop);
        return"Ok";
    }
    @GetMapping("/get")
    private List<LaptopEntity> getAll(){
        return service.getAll();
    }
    @GetMapping("/get/{id}")
    private Optional<LaptopEntity> getId(@PathVariable("id") int id) {
        return service.getById(id);
    }
    @DeleteMapping("/delete/{id}")
    private void deleteId(@PathVariable("id") int id) {

        service.delete(id);
    }

    @PutMapping("update")
    private String update(@RequestBody LaptopEntity laptop) {
        service.update(laptop);
        return "update";
    }
    @PostMapping("/ListAll")
    private String ListAll(@RequestBody List<LaptopEntity>obj1){
        LaptopEntity obj2=service.save(obj1);
        return "ListAll";
    }


}
