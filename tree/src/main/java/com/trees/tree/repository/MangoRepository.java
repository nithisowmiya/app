package com.trees.tree.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trees.tree.entity.MangoTree;

@Repository
public interface MangoRepository extends JpaRepository<MangoTree, Integer>  {

}
