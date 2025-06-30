package com.tka.Entity;

import java.security.PrivateKey;
import java.util.List;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class ProjectEntity {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
 private int id;
 private String title;
 @ElementCollection
 private List<String> requiredSkill;
 @ManyToOne
 @JoinColumn(name = "post_by_user_id")
 private String PostedBy;
 private int teamSize;
 private  String deadline;
}
