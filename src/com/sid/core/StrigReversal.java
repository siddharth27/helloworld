package com.sid.core;

public class StrigReversal {

	static String name= "Siddharth";
	static StringBuffer names = new StringBuffer();
	public static void main(String[] args) {
		
		int len = name.length();
		for(int i=len-1;i>=0;i--){
			char c = name.charAt(i);
			names=names.append(c);
		}
		
		System.out.println(names);

	}

}
