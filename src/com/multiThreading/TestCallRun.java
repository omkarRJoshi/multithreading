package com.multiThreading;

// direct calling run method on thread object will not perform context-switching
// t1 and t2 will be treated as normal object not thread object

public class TestCallRun extends Thread{

	public void run() {
		for(int i = 1; i <= 5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		TestCallRun t1 = new TestCallRun();
		TestCallRun t2 = new TestCallRun();
		
		t1.run();
		t2.run();
		
//		t1.start();
//		t2.start();

	}

}
