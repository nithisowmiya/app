package com.example.use.service;

import com.example.use.dto.OrderRequest;
import com.example.use.entity.User;
import com.example.use.repository.GameRepository;
import com.example.use.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RequestService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private GameRepository gameRepository;

    public String save(OrderRequest request){
         userRepository.save(request.getUser());
         return"Ok";

    }

}