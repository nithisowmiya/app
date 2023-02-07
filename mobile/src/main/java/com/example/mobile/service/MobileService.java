package com.example.mobile.service;

import com.example.mobile.entity.MobileEntity;
import com.example.mobile.repository.MobileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MobileService {
    @Autowired
    private MobileRepository repository;
    public String save(MobileEntity mobile){
        repository.saveAndFlush(mobile);
        return"Ok";
    }

    public List<MobileEntity> getAll() {
        return repository.findAll();
    }

    public Optional<MobileEntity> getById(int id) {
        return repository.findById(id);
    }

    public void delete(int id) {
        repository.deleteById(id);
    }

    public String update(MobileEntity mobile) {
        repository.saveAndFlush(mobile);
        return "update";
    }
    public MobileEntity save(List<MobileEntity> obj1) {
        List<MobileEntity> obj2 = new ArrayList<>();
        MobileEntity Obj3 = null;
        for (MobileEntity obj4 : obj1) {
            Obj3 = new MobileEntity();
            repository.saveAndFlush(obj4);
        }
        return Obj3;
    }}

