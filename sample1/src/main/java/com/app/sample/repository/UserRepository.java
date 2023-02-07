package com.app.sample.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.sample.dto.UserDto;
import com.app.sample.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {

	void saveAndFlush(UserDto user);

}
