package com.sid.core;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Consumer implements Runnable {

	BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();

	public Consumer(BlockingQueue<Integer> queue){
		this.queue=queue;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			try {
				System.out.println("Consumed"+queue.take());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
