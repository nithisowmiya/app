package com.user.example.application.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.user.example.application.entity.Login;
import com.user.example.application.entity.User;
import com.user.example.application.service.LoginService;

@RestController
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping("/saveLogin")
    private String saveLogin(@RequestBody Login login){
        loginService.save(login);
        return "student save successfully";
    }
    @GetMapping("/get")
    private List<Login>getAll(){
        return loginService.getAll();
    }
}
