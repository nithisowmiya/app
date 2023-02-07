package com.example.mobile.controller;

import com.example.mobile.entity.MobileEntity;
import com.example.mobile.service.MobileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class MobileController {
	@Autowired
	public MobileService service;

	@PostMapping("/post")
	private String save(@RequestBody MobileEntity mobile) {
		service.save(mobile);
		return "Ok";
	}

	@GetMapping("/get")
	private List<MobileEntity> getAll() {
		return service.getAll();
	}

	@GetMapping("/get/{id}")
	private Optional<MobileEntity> getId(@PathVariable("id") int id) {
		return service.getById(id);
	}

	@DeleteMapping("/delete/{id}")
	private void deleteId(@PathVariable("id") int id) {
		service.delete(id);
	}

	@PutMapping("update")
	private String update(@RequestBody MobileEntity mobile) {
		service.update(mobile);
		return "update";
	}

	@PostMapping("/ListAll")
	private String ListAll(@RequestBody List<MobileEntity> obj1) {
		MobileEntity obj2 = service.save(obj1);
		return "ListAll";
	}

}
