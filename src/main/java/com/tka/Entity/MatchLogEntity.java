package com.tka.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class MatchLogEntity {
@Id
	private int id ;
private String userA ;
private String userB ;
private Long score ;
	
}
