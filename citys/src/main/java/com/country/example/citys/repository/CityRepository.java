package com.country.example.citys.repository;

import com.country.example.citys.entity.city;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository<city, Integer> {
}
