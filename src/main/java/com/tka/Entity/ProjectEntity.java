package com.tka.Entity;

import java.security.PrivateKey;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ProjectEntity {
	@Id
 private int id;
 private String title;
 private List<String> requiredSkill;
 private String PostedBy;
 private int teamSize;
 private  String deadline;
 
 
	
}
