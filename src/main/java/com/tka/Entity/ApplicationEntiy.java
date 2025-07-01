package com.tka.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class ApplicationEntiy {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private  int id;
@ManyToOne
private  UserEntity user;
@ManyToOne
private  ProjectEntity project;
private String status;

}
