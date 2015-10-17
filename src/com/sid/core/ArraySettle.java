package com.sid.core;

import java.util.ArrayList;
import java.util.Collections;

public class ArraySettle {
	
	static int[] array = {1,0,-5,3,0,34,-67};
	
	public static void main(String args[]){
		
		int[] array2 = new int[array.length];
		ArrayList<Integer> positive = new ArrayList<Integer>();
		ArrayList<Integer> negative = new ArrayList<Integer>();
		ArrayList<Integer> zero = new ArrayList<Integer>();
		
		
		
		for(int i=0;i<array.length;i++){
			
			
				positive.add(array[i]);
			
		}
		
		Collections.sort(positive);
		
		for(int a:positive){
			System.out.println(a);
		}
			
	}
	
}