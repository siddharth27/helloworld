package com.sid.core;

public class StringCompress {

	public static void main(String args[]){
	String line = " aabbcccccdeee"; 
	int count=0; 
	int b=0; 
	StringBuilder res = new StringBuilder(); 
	for(int i = 0 ; i<line.length(); i++){ 
		System.out.println("i is "+i );
		count = 1; 
		b=i+1; 
		res.append(line.charAt(i)); 

		while(b<line.length() && line.charAt(b) == line.charAt(i)){ 
			count++; 
			b++; 
			i++; 
		} 
		if(count != 1){ 
			
			res.append(count);
		} 
		 
	} 

	System.out.println(res);
} 

}


