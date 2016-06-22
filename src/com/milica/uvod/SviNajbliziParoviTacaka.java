package com.milica.uvod;

public class SviNajbliziParoviTacaka {
	public static void svinajbliziParoviTacaka() {
		double[][] points = {{-1, 3}, {-1, -1}, {1, 1}, {0, 0.5}, {2, 0.5}, {2, -1}, {3, 3}, {4, 2}, {4, -0.5}, };
		int p1 = 0, p2 = 1;
		double shortestDistances = distance(points[p1][0],points[p1][1],points[p2][0], points[p2][1]);
		int[][] indices = new int[points.length][2];
		int k = 0;
		indices[k][0] = p1;
		indices[k][1] = p2;
		for (int i = 0; i < points.length; i++) {
			for (int j = i + 1; j < points.length; j++) {
				double distance = distance(points[i][0], points[i][1], points[j][0], points[j][1]);
				if (distance < shortestDistances) {
					k = 0;
					indices[k][0] = i;
					indices[k][1] = j;
					shortestDistances = distance;
		
				} else if (distance == shortestDistances) {
					k++;
					indices[k][0] = i;
					indices[k][1] = j;
				}		
			}
		}
		for (int i = 0; i <= k; i++) {
			p1 = indices[i][0]; p2 = indices[i][1];
			System.out.println("The closest two points are " + "(" + points[p1][0] + ", " + points[p1][1] + ") and (" + points[p2][0] + ", " + points[p2][1] + ")");
		}
		System.out.println("Their distance is " +shortestDistances);
		}
	
	public static double distance(double x1, double y1, double x2, double y2) {
		return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2- y1));
	}
	
}
