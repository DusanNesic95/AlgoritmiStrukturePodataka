package com.milica.rekurzija;

public class MaksimalnaSumaPodniza {
	public static int maxSumRec( int [ ] a, int left, int right ) {
		int maxLeftBorderSum = 0, maxRightBorderSum = 0;
		int leftBorderSum = 0, rightBorderSum = 0;
		int center = ( left + right ) / 2;
		if( left == right )
			return a[ left ] > 0 ? a[ left ] : 0;
		int maxLeftSum = maxSumRec( a, left, center );
		int maxRightSum = maxSumRec( a, center + 1, right );
		for( int i = center; i >= left; i-- ) {
			leftBorderSum += a[ i ];
			if( leftBorderSum > maxLeftBorderSum )
				maxLeftBorderSum = leftBorderSum;
		}
		for( int i = center + 1; i <= right; i++ ) {
			rightBorderSum += a[ i ];
			if( rightBorderSum > maxRightBorderSum )
				maxRightBorderSum = rightBorderSum;
		}
		return max3( maxLeftSum, maxRightSum, maxLeftBorderSum + maxRightBorderSum );
	}
	
	public static int max3( int a, int b, int c ) {
		return a > b ? a > c ? a : c : b > c ? b : c;
	}
}
