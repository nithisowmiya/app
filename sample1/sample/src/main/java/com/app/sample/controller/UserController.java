package com.app.sample.controller;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.sample.dto.UserDto;
import com.app.sample.entity.User;
import com.app.sample.service.UserService;

@RestController
public class UserController {
	@Autowired
	public UserService service;

	@PostMapping("/post")
	private String save(@RequestBody UserDto user) {
		service.save(user);
		return "Ok";
	}

	@GetMapping("/get")
	private List<User> getAll() {
		return service.getAll();
	}

	@GetMapping("/get/{id}")
	private Optional<User> getId(@PathVariable("id") UUID id) {
		return service.getById(id);
	}

	@DeleteMapping("/delete/{id}")
	private void deleteId(@PathVariable("id") UUID id) {
		service.delete(id);
	}

	@PutMapping("update")
	private String update(@RequestBody User user) {
		service.update(user);
		return "update";
	}

	@PostMapping("/ListAll")
	private String ListAll(@RequestBody List<User> obj1) {
		User obj2 = service.save(obj1);
		return "ListAll";
	}

}
