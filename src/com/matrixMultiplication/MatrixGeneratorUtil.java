package com.matrixMultiplication;

import java.util.Random;

public class MatrixGeneratorUtil {
	public static int[][] generateMatrix(int rows, int columns){
		int[][] result = new int[rows][columns];
		Random random = new Random();
		
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < columns; j++) {
				result[i][j] = random.nextInt(10);
			}
		}
		return result;
	}
	
	public static void printMatrix(int[][] matrix) {
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
