package com.sid.core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SubPalindrome {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(br.readLine());
		System.out.println(br.readLine());
		
		String plaindromeString = "aab";
		int lengthOfString = findLength(plaindromeString);
		int numOfPalindrome = findNumberOfPlaindrome(plaindromeString);
		System.out.println(lengthOfString+numOfPalindrome);
		
		

	}
	
	public static int findLength(String a){
		int length = a.length();
		
		return length;
	}
	
	public static int findNumberOfPlaindrome(String a){
		char arr[] = a.toCharArray();
		int mainCount = 0;
		for(int i=0;i<arr.length;i++){
			int count = 0;
			for(int j=i+1;j<arr.length;j++){
				if(arr[i] == arr[j]){
					count+=1;
				}
				mainCount += count;
			}
		}
		
		return (mainCount-1);
	}
}


