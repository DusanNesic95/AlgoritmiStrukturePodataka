package com.dusannesic.sortiranja;

public class InsertionSort {

	/**
	 * Metoda insertionSort koristi metod direktnog ubacivanja
	 * kako bi sortirala prosledjeni niz.
	 * Performanse metoda su O(n^2)
	 * 
	 * @param a - niz koji je potrebno sortirati
	 */
	public static void insertionSort(int[] a) {
		for (int i = 1; i < a.length; i++) {
			int temp = a[i];
			for (int j = i; j > 0 && temp < a[j-1]; j--) {
				a[j] = a[j-1];
				a[j] = temp;
			}
		}
	}
	
}
