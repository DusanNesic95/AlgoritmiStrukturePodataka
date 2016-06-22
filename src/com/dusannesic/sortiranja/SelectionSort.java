package com.dusannesic.sortiranja;

public class SelectionSort {

	/**
	 * Metoda selectionSort sortira prosledjeni niz pomocu metoda
	 * sortiranja "selection"
	 * Performanse ovog metoda su O(n^2)
	 * 
	 * @param a - niz koji je potrebno sortirati
	 */
	public static void selectionSort(int[] a) {
		int outer, inner, min;
		for (outer = 0; outer < a.length-1; outer++) {
			min = outer;
			for (inner = outer+1; inner < a.length; inner++) {
				if (a[inner] < a[min]) {
					min = inner;
				}
			}
			int temp = a[outer];
			a[outer] = a[min];
			a[min] = temp;
		}
	}
	
}
