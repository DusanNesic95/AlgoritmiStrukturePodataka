package com.milica.algoritmistringovi;

public class TrodelniQuickSort {
	private static int charAt(String s, int d) { 
		if (d < s.length()) 
			return s.charAt(d); 
		else 
			return -1; 
	
	}
	public static void sort(String[] a) { 
		sort(a, 0, a.length - 1, 0); 
	}
	
	private static void sort(String[] a, int lo, int hi, int d) {
		if (hi <= lo) 
			return;
		int lt = lo, gt = hi;
		int v = charAt(a[lo], d);
		int i = lo + 1;
		while (i <= gt) {
			int t = charAt(a[i], d);
			if (t < v) 
				exch(a, lt++, i++);
			else if (t > v) 
				exch(a, i, gt--);
			else i++;
		}
		
		sort(a, lo, lt-1, d);
		if (v >= 0) sort(a, lt, gt, d+1);
			sort(a, gt+1, hi, d);
	}
	
	private static String[] exch(String[] a, int n, int m) {
		String temp = a[n];
		a[n] = a[m];
		a[m] = temp;
		
		return a;
	}
}
