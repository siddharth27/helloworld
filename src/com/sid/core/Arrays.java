package com.sid.core;

import com.sid.core.InterfaceA.A;
import com.sid.core.InterfaceB.B;



public class Arrays implements A,B{
	
	
	public Arrays(){
		super();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Arrays s = new Arrays();
		s.sid();
	}

	@Override
	public void sid() {
		// TODO Auto-generated method stub
		System.out.println("Hello Sid");
	}

}
