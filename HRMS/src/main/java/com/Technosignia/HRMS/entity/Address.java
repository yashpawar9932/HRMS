package com.Technosignia.HRMS.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Address {
	
	@Id
	Long id;
	
	String line;
	
	String line2;
	
	Long pincode;
	
	

}
