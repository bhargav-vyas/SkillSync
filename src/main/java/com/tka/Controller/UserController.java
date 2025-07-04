package com.tka.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.tka.DTO.UserDto;
import com.tka.Entity.UserEntity;
import com.tka.Service.UserService;

import jakarta.transaction.Transactional;

@Controller
@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/resister")
	public  ResponseEntity<UserEntity> resisterUser(@RequestBody  UserEntity user){
		UserEntity createUser =userService.resisterUser(user); 
		return ResponseEntity.ok(createUser);	
	}
	@GetMapping("/getall")
	public  ResponseEntity<List<UserEntity>> getallUsers(){
		 return ResponseEntity.ok(userService.getAllUsers());
	}
 @JsonIgnore
 @Transactional
 @GetMapping("/{id}")
 public ResponseEntity<UserEntity> getUserById(@PathVariable int id) {
     Optional<UserEntity> user = userService.getUserById(id);
     return user.map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
 }
}
