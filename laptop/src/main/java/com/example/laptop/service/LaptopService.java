package com.example.laptop.service;

import com.example.laptop.entity.LaptopEntity;
import com.example.laptop.repository.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class LaptopService {
    @Autowired
    private LaptopRepository repository;
    public String save(LaptopEntity laptop){
        repository.saveAndFlush(laptop);
        return"Ok";
    }

    public List<LaptopEntity> getAll() {

        return repository.findAll();
    }

    public Optional<LaptopEntity> getById(int id) {

        return repository.findById(id);
    }

    public void delete(int id) {
        repository.deleteById(id);
    }

    public String update(LaptopEntity mobile) {
        repository.saveAndFlush(mobile);
        return "update";
    }
    public LaptopEntity save(List<LaptopEntity> obj1) {
        List<LaptopEntity> Obj2 = new ArrayList<>();
        LaptopEntity Obj3 = null;
        for (LaptopEntity obj4 : obj1) {
            Obj3 = new LaptopEntity();
            repository.saveAndFlush(obj4);
        }
        return Obj3;
    }}


