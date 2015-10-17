package com.sid.core;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class LinkedListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> linkedList = new LinkedList<String>();
		
		linkedList.add("Sidd");
		linkedList.add("baijal");
		linkedList.add("abcd:");
		linkedList.add("Sidd");
		
		TreeSet<String> ts = new TreeSet<String>(linkedList);
		Iterator<String> itr = linkedList.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		System.out.println("FROM TREESET");
		Iterator<String> tsItr = ts.iterator();
		while(tsItr.hasNext()){
			System.out.println(tsItr.next());
		}
		
		
	}

}
