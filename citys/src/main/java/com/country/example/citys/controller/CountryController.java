package com.country.example.citys.controller;

import com.country.example.citys.entity.Country;
import com.country.example.citys.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class CountryController {
    @Autowired
    public CountryService countryService;

    @PostMapping("/post")
    private String save(@RequestBody Country country) {
        countryService.save(country);
        return "ok";
    }

    @GetMapping("/get")
    private List<Country> getAll() {
        return countryService.getAll();
    }

    @GetMapping("/get/{id}")
    private Optional<Country> getId(@PathVariable("id") int id) {
        return countryService.getById(id);
    }

    @DeleteMapping("/delete/{id}")
    private void deleteId(@PathVariable("id") int id) {
        countryService.deleteById(id);
    }

    @PutMapping("/update")
    public String update(@RequestBody Country country) {
        countryService.save(country);
        return "update";
    }

    @PostMapping("/ListAll")
    private String ListAll(@RequestBody List<Country> obj1) {
        Country obj2 = countryService.save(obj1);
        return "ListAll";
    }
}