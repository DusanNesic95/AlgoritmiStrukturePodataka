package com.dusannesic.sortiranja;

public class BubbleSort {

	/**
	 * Metoda bubbleSort sortira prosledjeni niz koristeci
	 * metodu sortiranja mehurom.
	 * Performanse metoda su O(n^2)
	 * 
	 * @param a - niz koji je potrebno sortirati
	 */
	public static void bubbleSort(int[] a) {
		int outer, inner;
		for (outer = a.length-1; outer > 0; outer--) {
			for (inner = 0; inner < outer; inner++) {
				if (a[inner] > a[inner + 1]) {
					int temp = a[inner];
					a[inner] = a[inner + 1];
					a[inner + 1] = temp;
				}
			}
		}
	}
	
}
