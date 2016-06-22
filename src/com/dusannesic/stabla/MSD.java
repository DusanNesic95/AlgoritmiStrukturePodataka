package com.dusannesic.stabla;

public class MSD {
	
	private final static int R = 256;

	public static void sort(String[] argument) {
		int size = argument.length;
		String[] temp = new String[size];
		sort(argument, 0, size-1, 0, temp);
	}
	
	private static void sort(String[] argument, int lo, int hi, int d, String[] temp) {
		if (hi <= lo + 1) {
			return;
		}
		int[] brojac = new int[R+2];
		for (int i = lo; i <= hi; i++) {
			int c = argument[i].charAt(d);
			brojac[c+2]++;
		}
		
		for (int i = 0; i < R+1; i++) {
			brojac[i+1] += brojac[i];
		}
		
		for (int i = lo; i <= hi; i++) {
			int c = argument[i].charAt(d);
			temp[brojac[c+1]++] = argument[i];
		}
		
		for (int i = lo; i <= hi; i++) {
			argument[i] = temp[i - lo];
		}
		
		for (int i = 0; i < R; i++) {
			sort(argument, lo + brojac[i], lo + brojac[i+1] - 1, d+1, temp);
		}
	}
	
}