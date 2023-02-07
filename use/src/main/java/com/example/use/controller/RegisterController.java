package com.example.use.controller;
import com.example.use.dto.OrderRequest;
import com.example.use.entity.User;
import com.example.use.service.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RegisterController {
    @Autowired
    public RequestService service;

    @PostMapping("/game")
    private String save(@RequestBody OrderRequest request){
        service.save(request);
        return"Ok";

    }

}
