package com.multiThreading;

public class SecondThreadProgram implements Runnable {

	public void run() {
		System.out.println("Thread is running..... by implementing Runnable interface");
	}
	public static void main(String[] args) {
		SecondThreadProgram stp1 = new SecondThreadProgram();
		//need to pass object of runnable interface for constructor of Thread(objRunnable)
		Thread t1 = new Thread(stp1);
		t1.start();

	}

}
