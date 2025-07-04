package com.tka.Entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class UserEntity {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int id;
	private String name;
	private String email;
	private String password;
	@ElementCollection(fetch = FetchType.EAGER)
	 @JsonIgnore
	private List<String> skills; 
	@ElementCollection(fetch = FetchType.EAGER)
	private  List<String> interests;
	private int availability ;
	private String location;
	
	
	public UserEntity(int id, String name, String email, String password, List<String> skills, List<String> interests,
			int availability, String location) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.skills = skills;
		this.interests = interests;
		this.availability = availability;
		this.location = location;
	}
	
}
 