package com.country.example.citys.service;

import com.country.example.citys.entity.Country;
import com.country.example.citys.repository.CityRepository;
import com.country.example.citys.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CountryService {
    @Autowired
    private CountryRepository countryRepository;
    @Autowired
    private CityRepository repository;
    public String save(Country country) {
        countryRepository.saveAndFlush(country);
        return "Ok";
    }
    public List<Country> getAll() {
        return countryRepository.findAll();
    }
    public Optional<Country> getById(int id) {
        return countryRepository.findById(id);
    }

    public void deleteById(int id) {
        countryRepository.deleteById(id);
    }
    public String update(Country country){
        countryRepository.saveAndFlush(country);
        return"ok";
    }
    public Country save(List<Country> obj1) {
        List<Country> Obj2 = new ArrayList<>();
        Country Obj3 = null;
        for (Country obj4 : obj1) {
            Obj3 = new Country();
            countryRepository.saveAndFlush(obj4);
        }
        return Obj3;
    }

}


