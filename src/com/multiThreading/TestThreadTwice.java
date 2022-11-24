package com.multiThreading;

//below code will give "java.lang.IllegalThreadStateException" 
// we can't start thread more than once

public class TestThreadTwice extends Thread{
	public void run() {
		System.out.println("Thread running.........");
	}
	
	public static void main(String[] args) {
		
		Thread t1 = new TestThreadTwice();

		t1.start();
		t1.start();
	}

}
