package com.multiThreading;

public class ThreadPriorityExample extends Thread{

	public void run() {
		System.out.println("inside the run() method");
	}
	public static void main(String[] args) {
		
		ThreadPriorityExample t1 = new ThreadPriorityExample();
		ThreadPriorityExample t2 = new ThreadPriorityExample();
		ThreadPriorityExample t3 = new ThreadPriorityExample();
		
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		System.out.println(t3.getPriority());
		
		t1.setPriority(MAX_PRIORITY);
		t2.setPriority(MIN_PRIORITY);
		t3.setPriority(NORM_PRIORITY);
		
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		System.out.println(t3.getPriority());
		
		
	}

}
