package com.matrixMultiplication;

import java.util.Date;

public class MatrixMultiplication {

	public static void main(String[] args) {
		Date start = new Date();
		
		int[][] m1 = MatrixGeneratorUtil.generateMatrix(30, 10);
		int[][] m2 = MatrixGeneratorUtil.generateMatrix(10, 40);
		
		int[][] result = multiply(m1, m2);
		
		System.out.println("matrix 1: ");
		MatrixGeneratorUtil.printMatrix(m1);
		
		System.out.println("matrix 2: ");
		MatrixGeneratorUtil.printMatrix(m2);

		System.out.println("multiplication output: ");
		MatrixGeneratorUtil.printMatrix(result);

		
		Date end = new Date();
		System.out.println(end.getTime() - start.getTime());
	}

	public static int[][] multiply(int[][] m1, int[][] m2) {
		int r = m1.length;
		int c = m2[0].length;
		int[][] result = new int[r][c];

		for(int i = 0; i < r; i++) {
			for(int j = 0; j < c; j++) {
				for(int k = 0; k < m2.length; k++) {
					result[i][j] += m1[i][k] * m2[k][j];
				}
			}
		}
		
		return result;
	}

}
