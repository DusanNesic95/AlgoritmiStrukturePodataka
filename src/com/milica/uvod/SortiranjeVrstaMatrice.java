package com.milica.uvod;

import java.util.Scanner;

public class SortiranjeVrstaMatrice {
	public static void sortiranjeVrstaMatrice() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		final int SIZE = 3;
		System.out.print("Enter a 3 by 3 matrix row by row: ");
		double[][] m = new double[SIZE][SIZE];
		for (int i = 0; i < m.length; i++)
			for (int j = 0; j < m[0].length; j++)
				m[i][j] = input.nextDouble();
		double[][] result = sortRows(m);
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[0].length; j++)
				System.out.print(result[i][j] + " ");
			System.out.println();
		}
	}
	
	public static double[][] sortRows(double[][] m) {
		double[][] result = new double[m.length][m[0].length];
	for (int i = 0; i < m.length; i++)
		for (int j = 0; j < m[0].length; j++)
			result[i][j] = m[i][j];
	for (int i = 0; i < result.length; i++)
		java.util.Arrays.sort(result[i]);
	return result;
	}
}