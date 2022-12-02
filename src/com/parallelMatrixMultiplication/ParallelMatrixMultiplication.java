package com.parallelMatrixMultiplication;

import java.util.Date;

import com.matrixMultiplication.MatrixGeneratorUtil;
import com.matrixMultiplication.MatrixMultiplication;

public class ParallelMatrixMultiplication {

	public static void main(String[] args) {
		int[][] m1 = MatrixGeneratorUtil.generateMatrix(2000, 2000);
		int[][] m2 = MatrixGeneratorUtil.generateMatrix(2000, 2000);

		normalMultiplication(m1, m2);
		parallelMultiplication(m1, m2);
		
//		Total time taken by normal processing: 27543
//		Total time taken by parallel processing: 811
	}
	
	private static void normalMultiplication(int[][] m1, int[][] m2) {
		Date start = new Date();
		int[][] result = MatrixMultiplication.multiply(m1, m2);
		Date end = new Date();
		System.out.println("Total time taken by normal processing: " + (end.getTime() - start.getTime()));
	}
	
	private static void parallelMultiplication(int[][] m1, int[][] m2) {
		Date start = new Date();
		int[][] result = new int[m1.length][m2[0].length];
		
		ParalleThreadsCreator.multiply(m1, m2, result);
		
		Date end = new Date();
		
		System.out.println("Total time taken by parallel processing: " + (end.getTime() - start.getTime()));
	}

}
