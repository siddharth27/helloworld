package com.sid.core;

import java.util.concurrent.CountDownLatch;

public class Service implements Runnable {
	
	private String name;
	private int wait;
	private CountDownLatch latch;

	public Service(String name, int wait,CountDownLatch latch){
		this.name = name;
		this.wait = wait;
		this.latch = latch;
				
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		latch.countDown();
		System.out.println("Service "+name+" is ready");
		try {
			Thread.sleep(wait);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
