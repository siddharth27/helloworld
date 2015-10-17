package com.sid.core;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

public class HashMapA {
//Created for the student class
	
	HashMap<String,Student> map;
	
	HashMapA(){
		map = new HashMap<String,Student>();
	}
	
	public void add(Student obj){
		
		map.put(obj.getName(), obj);
	}
	
	public void print(){
		for (Student s: map.values()){
		System.out.println(s.getName());
		System.out.println(s.getDateOfBirth());
		System.out.println(s.getFees());
		}
	}
	
	
	public static void main(String args[]){
		
		Integer i = 2000;
		int day = 27;
		int month = 8;
		int year = 1990;
		String date = day+"/"+month+"/"+year;
		SimpleDateFormat formatter = new SimpleDateFormat("DD/MM/yyyy");
		java.util.Date date2=null;
		try {
			date2 = formatter.parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		HashMapA mapObj = new HashMapA();
		Student studentObj = new Student("Siddharth", date2 , i);
		
		mapObj.add(studentObj);
		
		mapObj.print();
	}
}
