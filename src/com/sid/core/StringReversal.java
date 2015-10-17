package com.sid.core;

public class StringReversal {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String original = "Siddharth";
		StringBuffer reverse = new StringBuffer();
		//System.out.println(original.charAt(9));
		for (int i=original.length()-1;i>=0;i--){
			char c = original.charAt(i);
			
			reverse.append(c);
		}
		
		System.out.println(reverse);
	}

}
