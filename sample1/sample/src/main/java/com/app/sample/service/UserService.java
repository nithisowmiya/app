package com.app.sample.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.sample.dto.UserDto;
import com.app.sample.entity.User;
import com.app.sample.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository repository;

	public String save(UserDto user) {
		//user.setAndEncryptPassword(user.getUserPassword());
		repository.saveAndFlush(user);
		return "Ok";
	}

	public List<User> getAll() {
		return repository.findAll();
	}

	public Optional<User> getById(UUID id) {
		return repository.findById(id);
	}

	public void delete(UUID id) {
		repository.deleteById(id);
	}

	public String update(User mobile) {
		repository.saveAndFlush(mobile);
		return "update";
	}

	public User save(List<User> obj1) {
		List<User> obj2 = new ArrayList<>();
		User Obj3 = null;
		for (User obj4 : obj1) {
			Obj3 = new User();
			repository.saveAndFlush(obj4);
		}
		return Obj3;
	}
}
