package com.sid.core;

public class Threads implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Threads t1 = new Threads();
		Thread t  = new Thread(t1);
		t.start();
		t.start();
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("siddharth baijal");
	}

}
