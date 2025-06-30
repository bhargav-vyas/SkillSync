package com.tka.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class MatchLogEntity {
@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id ;
@ManyToOne
private UserEntity userA ;
@ManyToOne
private UserEntity userB ;
private Long score ;
	
}
