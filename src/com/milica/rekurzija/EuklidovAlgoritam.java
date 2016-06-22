package com.milica.rekurzija;

public class EuklidovAlgoritam {
	public static int nzd(int m, int n) {
		if (m % n == 0)
			return n;
		else
			return nzd(n, m % n);
	}
}
