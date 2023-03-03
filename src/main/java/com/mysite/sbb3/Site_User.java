package com.mysite.sbb3;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Site_User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer numb;
	
	@Column(unique = true)
	private String id;
	
	private String password;
	
	@Column(unique = true)
	private String email;
	
	private String username;
	
	private Integer phonenum;
	
	
}
