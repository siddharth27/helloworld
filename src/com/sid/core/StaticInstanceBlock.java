package com.sid.core;

public class StaticInstanceBlock {

	static{
		System.out.println("Siddharth");
	}
	
	{
		System.out.println("2");
	}
	
	{
		System.out.println("3");
	}
	
	StaticInstanceBlock(){
		System.out.println("instantiated");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticInstanceBlock obj1 = new StaticInstanceBlock();
		StaticInstanceBlock obj2 = new StaticInstanceBlock();
		
	}

}
