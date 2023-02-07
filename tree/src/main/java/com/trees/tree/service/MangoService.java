package com.trees.tree.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trees.tree.entity.MangoTree;
import com.trees.tree.repository.Mango1Repository;
import com.trees.tree.repository.MangoRepository;

@Service
public class MangoService {
	 @Autowired
	    private MangoRepository mangoRepository;
	 @Autowired
	    private Mango1Repository mango1Repository;
	    public String save(MangoTree mango){
	        mangoRepository.saveAndFlush(mango);
	        return"Ok";

}
}
