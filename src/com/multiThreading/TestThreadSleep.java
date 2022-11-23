package com.multiThreading;

public class TestThreadSleep extends Thread{

	public static void main(String[] args) {
		
		TestThreadSleep t1 = new TestThreadSleep();
		TestThreadSleep t2 = new TestThreadSleep();
		
		t1.start();
		t2.start();

	}
	
	public void run() {
		for(int i = 1; i <= 5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
