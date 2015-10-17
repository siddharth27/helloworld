package com.sid.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class HashMap02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String original = "aaabbbcccd";
		StringBuffer name = new StringBuffer();
		
		
		Map<String,Integer> map = new TreeMap<String,Integer>();
		
		for(int i=0;i<original.length();i++){
			char b= original.charAt(i);
			if(map.containsKey(String.valueOf(b))){
				//increment the count
				
				Integer j = map.get(String.valueOf(b));
				
				map.put(String.valueOf(b), j+1);
			}else{
				map.put(String.valueOf(b),1);
			}
		}
		
//		Iterator itr = map.keySet().iterator();
//		
//		while(itr.hasNext()){
//			
//		}
		
		for(Map.Entry<String,Integer> s: map.entrySet()){
			
			if(s.getValue()>1){
				name.append(s.getKey()+s.getValue());
			}else{
				name.append(s.getKey());
			}
		}
		
		System.out.println(name);
		
		
	}

}
