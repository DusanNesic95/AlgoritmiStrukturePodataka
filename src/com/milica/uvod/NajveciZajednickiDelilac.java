package com.milica.uvod;

import java.util.Scanner;

public class NajveciZajednickiDelilac {
	public static void nzd() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Unesite prvi broj: ");
		int n1 = input.nextInt();
		System.out.print("Unesite drugi broj: ");
		int n2 = input.nextInt();
		int gcd = 1;
		int k = 2;
		while (k <= n1 && k <= n2) {
			if (n1 % k == 0 && n2 % k == 0)
				gcd = k;
			k++;
		}
		System.out.println("Najveci zajednicki delilac za " +
		n1 +
		" i " + n2 + " je " + gcd);
	}
}
