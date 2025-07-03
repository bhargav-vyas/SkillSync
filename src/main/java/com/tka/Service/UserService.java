package com.tka.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.tka.Entity.UserEntity;
import com.tka.Reposiory.UserRepository;

import jakarta.transaction.Transactional;

@Service
public class UserService {
	@Autowired
	private UserRepository userrepository;

	public UserEntity resisterUser(UserEntity user) {
		return userrepository.save(user);
	}
 @Transactional

	public  List<UserEntity> getAllUsers() {
		return userrepository.findAll();
	}
	
	
}