package com.milica.rekurzija;

public class SumaSerijeBrojevaRekuzrija {
	public static double m(int i) {
		if (i == 1)
			return 1;
		else
			return m(i - 1) + 1.0 / i;
	}
}
