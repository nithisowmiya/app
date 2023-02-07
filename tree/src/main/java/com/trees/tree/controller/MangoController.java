package com.trees.tree.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.trees.tree.entity.MangoTree;
import com.trees.tree.service.MangoService;

@RestController
public class MangoController {
	public MangoService mangoService;
	 @PostMapping("/post")
	    private String save(@RequestBody MangoTree Mango){
	        MangoService mangoService2 = new MangoService();
			mangoService2.save(Mango);
	        return"ok";		
	
		
	}

}
