package com.sid.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ComparatorExample {
	//Makes use of class empl and Mycomparator
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Empl> list = new ArrayList<Empl>();
		list.add(new Empl("Ram",30));
		list.add(new Empl("Sid",20));
		list.add(new Empl("Aam",40));
		list.add(new Empl("Kam",50));
		
		
		Collections.sort(list, new Comparator<Empl>() {

			@Override
			public int compare(Empl o1, Empl o2) {
				return o1.getAge() - o2.getAge();
			}
		});
		
		System.out.println("LIST:->"+list);
		
//		for(Empl e:list){
//			System.out.println(e.getName()+"->"+e.getAge());
//		}
	}

}
