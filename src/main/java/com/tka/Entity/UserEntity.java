package com.tka.Entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class UserEntity {
	@Id
	private int id;
	private String name;
	private String email;
	private String password;
//	private List<String> skills; 
//	private  List<String> interests;
//	private int availability ;
//	private String location;
}
