package com.example.spring.spring.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.spring.spring.entity.SpringEntity;
import com.example.spring.spring.repository.SpringRepository;

@Service
public class SpringService {
	@Autowired
    private SpringRepository springRepository;
	public void saveOrUpdate(SpringEntity spring) {
				springRepository.saveAndFlush(spring);

	}
		 }
	


