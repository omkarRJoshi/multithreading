package com.parallelMatrixMultiplication;

public class RowMultiplierWorker implements Runnable{

	private int[][] result;
	private int[][] m1;
	private int[][] m2;
	private int row;
	
	public RowMultiplierWorker(int[][] result, int[][] m1, int[][] m2, int row) {
		this.result = result;
		this.m1 = m1;
		this.m2 = m2;
		this.row = row;
	}
	
	@Override
	public void run() {
		
		for(int i = 0; i < m1[0].length; i++) {
			for(int j = 0; j < m2.length; j++) {
				result[row][i] += m1[row][i] * m2[i][j];
			}
		}
		
	}

}
