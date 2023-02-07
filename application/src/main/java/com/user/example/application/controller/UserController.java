package com.user.example.application.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.user.example.application.dto.UserDTO;
import com.user.example.application.service.UserService;

@RestController
public class UserController {
	 @Autowired
	    private UserService userService;
	    @GetMapping("/user")
	    public ArrayList<UserDTO> getAllUser(){
	        return userService.getAllUsers();
	    }

	    @GetMapping("/user/{user_id}")
	    public UserDTO getUserById(@PathVariable("user_id") Integer user_id){
	        return userService.getUserByID(user_id);
	    }

	    @PostMapping("/user")
	    public UserDTO createUser(@RequestBody UserDTO userDTO){
	        return userService.createUser(userDTO);
	    }

	    @PutMapping("/user/{user_id}")
	    public UserDTO updateUser(@PathVariable("user_id") Integer user_id, @RequestBody UserDTO userDTO){
	        return userService.updateUser(user_id, userDTO);
	    }

	    @DeleteMapping ("/user/{user_id}")
	    public void deleteUser(@PathVariable("user_id") Integer user_id){
	        userService.deleteUser(user_id);
	    }
	}



