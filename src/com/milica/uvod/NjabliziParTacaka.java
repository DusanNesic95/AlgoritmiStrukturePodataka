package com.milica.uvod;

import java.util.Scanner;

public class NjabliziParTacaka {
	public static void najbliziParTacaka() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Unesite broj tacaka: ");
		int numberOfPoints = input.nextInt();
		double[][] points = new double[numberOfPoints][2];
		System.out.print("Unesite " + numberOfPoints + " tacki: ");
		for (int i = 0; i < points.length; i++) {
			points[i][0] = input.nextDouble();
			points[i][1] = input.nextDouble();
		}
		int p1 = 0, p2 = 1;
		double shortestDistance = distance(points[p1][0],
		points[p1][1],
		points[p2][0], points[p2][1]);
		for (int i = 0; i < points.length; i++) {
			for (int j = i + 1; j < points.length; j++) {
				double distance = distance(points[i][0], points[i][1], points[j][0], points[j][1]);
				if (shortestDistance > distance) {
					p1 = i;
					p2 = j;
					shortestDistance = distance;
				}
			}
		}
		System.out.println("Najblizi par tacaka je " + "(" + points[p1][0] + ", " + points[p1][1] + ") i ("+ points[p2][0] + ", " + points[p2][1] + ")");
	}
	
	public static double distance( double x1, double y1, double x2, double y2) {
		return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
	}
}
