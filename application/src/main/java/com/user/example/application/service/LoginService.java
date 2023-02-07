package com.user.example.application.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.example.application.entity.Login;
import com.user.example.application.entity.User;
import com.user.example.application.repository.LoginRepository;

@Service
public class LoginService {

    @Autowired
    private LoginRepository loginRepository;

    public String save(Login login){

        login.setAndEncryptPassword(login.getPassword());
        loginRepository.saveAndFlush(login);
        return "success";
    }

	public List<Login> getAll() {
		return loginRepository.findAll();
		
	}
}
