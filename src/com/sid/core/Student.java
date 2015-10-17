package com.sid.core;

import java.util.Date;

public class Student {
	
	private String name;
	private Date dateOfBirth;
	private Integer fees;
	
	public Student(String name,Date dateOfBirth, Integer fees){
		
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.fees = fees;
	}

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public Integer getFees() {
		return fees;
	}
	public void setFees(Integer fees) {
		this.fees = fees;
	}
	
	public String toString(){
		return "Student["+name+dateOfBirth+fees+"]";
	}
	
}
