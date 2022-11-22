package com.multiThreading;

// By extending Thread class

public class FirstThreadProgram extends Thread{
	
	public void run() {
		System.out.println("Thread is running....");
	}

	public static void main(String[] args) {
		FirstThreadProgram thread1 = new FirstThreadProgram();
		thread1.start();

	}

}
