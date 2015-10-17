package com.sid.core;

class Sid{
	public void sid(){
		System.out.println("abc");
	}
}

public class Exxample extends Sid {

	public void sid(){
		System.out.println("abcd");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sid si = new Sid();
		si.sid();
		
		Sid ex = new Exxample();
		ex.sid();
		
	}

}
