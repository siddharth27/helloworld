package com.sid.core;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class BlockingQ {

	static BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread prod = new Thread(new Producer(queue));
		Thread cons = new Thread(new Consumer(queue));
		
		prod.start();
		cons.start();
		
	}

}
