package com.sid.core;

class Overridden{
	
	protected void move(){
		System.out.println("Sid");
	}
}

public class Overriding extends Overridden {

	
	public void move(){
		System.out.println("aba");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Overridden obj = new Overridden();
		obj.move();
		
		Overridden obj1 = new Overriding();
		obj1.move();
		
		Overriding obj3 = new Overriding();
		obj3.move();
		
	}

}
