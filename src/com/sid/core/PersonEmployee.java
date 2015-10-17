package com.sid.core;


class Person{
	private String name="No name";
	
	public Person(String nm){
		name = nm;
	}
}

class Employee extends Person{
	
	String empID = "0000";
	
	public Employee(String id){
		super(id);
		empID = id;
	}
}


public class PersonEmployee {

	
	Employee e = new Employee("4321");
	
}
