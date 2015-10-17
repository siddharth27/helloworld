package com.sid.core;

public class Empl {
	
	private String name;
	private int age;
	
	public Empl(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public String toString() {
        return "Employee : " + name + " - " + age ;
    }
	
	

}
