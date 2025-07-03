package com.tka.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.tka.DTO.UserDto;
import com.tka.Entity.UserEntity;
import com.tka.Reposiory.UserRepository;

import jakarta.transaction.Transactional;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;

	public UserEntity resisterUser(UserEntity user) {
		return userRepository.save(user);
	}
// @Transactional
//
//	public  List<UserEntity> getAllUsers() {
//		return userrepository.findAll();
//	}
	@Transactional
	public Optional<UserEntity> getUserById(int id) {
		return userRepository.findById(id);
	}
	
	
	
}