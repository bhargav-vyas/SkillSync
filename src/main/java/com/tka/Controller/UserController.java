package com.tka.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tka.Entity.UserEntity;
import com.tkaService.UserService;

@Controller
@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userservice;
	
	@PostMapping("/resister")
	public  ResponseEntity<UserEntity> resisterUser(@RequestBody  UserEntity user){
		UserEntity createUser =userservice.resisterUser(user); 
		return ResponseEntity.ok(createUser);
				
	}
 
}
