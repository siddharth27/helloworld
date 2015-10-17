package com.sid.core;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class CountDownLatchExample {

	static CountDownLatch latch = new CountDownLatch(4);
	
	public static void main(String[] args) throws InterruptedException {
		
		Thread serv1 = new Thread(new Service("ser1",1000,latch));
		Thread serv2 = new Thread(new Service("ser2",1000,latch));
		Thread serv3 = new Thread(new Service("ser3",1000,latch));
		
		serv1.start();
		serv2.start();
		serv3.start();
		
		latch.await(5, TimeUnit.SECONDS);
		System.out.println("All ready");
	}

}
