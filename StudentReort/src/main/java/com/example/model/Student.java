package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {

	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private Integer studentRoll;
	
	private String studentName;
	
	private Integer mathematicsMark;
	
	private Integer scienceMark;
	
	private Integer englishMark;
	
	private Integer semester;
	
	
}
