package com.app.signup.service;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.signup.entity.User;
import com.app.signup.repository.UserRepository;


@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;

	public void saveOrUpdate(User userObj) {
		userRepository.saveAndFlush(userObj);

	}

	public Optional<User> findByUserName(String userName) {
		// TODO Auto-generated method stub
		return userRepository.findByUserName(userName);
	}

	public Optional<User> findById(UUID id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id);
	}
	
	
	}
