package com.parallelMatrixMultiplication;

import java.util.*;

public class ParalleThreadsCreator {
	
	
	public static void multiply(int[][] m1, int[][] m2, int[][] result) {
		List<Thread> threadList = new ArrayList<>();
		int rows = m1.length;
		
		for(int i = 0; i < rows; i++) {
			RowMultiplierWorker rmw = new RowMultiplierWorker(result, m1, m2, i);
			Thread thread = new Thread(rmw);
			thread.start();
			threadList.add(thread);
			if(threadList.size() % 10 == 0) {
				waitForThread(threadList);
			}
		}
		
	}

	private static void waitForThread(List<Thread> threadList) {
		// TODO Auto-generated method stub
		for(Thread thread : threadList) {
			try {
				thread.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		threadList.clear();
	}
}
