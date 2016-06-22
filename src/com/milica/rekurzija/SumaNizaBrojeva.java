package com.milica.rekurzija;

public class SumaNizaBrojeva {
	public static long sum_rec( int n ) {
		if( n == 1 )
			return 1;
		else
			return sum_rec( n - 1 ) + n;
	}
	
	public static long sum_iter( int n ) {
		long sum_iter = 0;
		for(int i = 1; i <= n; i++)
			sum_iter += i;
		return sum_iter;
	}
}
