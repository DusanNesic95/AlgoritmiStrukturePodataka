package com.milica.uvod;

public class ProstBroj {
	public static void prostBroj() {
		final int NUMBER_OF_PRIMES = 50;
		final int NUMBER_OF_PRIMES_PER_LINE = 10;
		int count = 0;
		int number = 2;
		System.out.println("Prvih 50 prostih brojeva su \n");
		while (count < NUMBER_OF_PRIMES) {
			boolean isPrime = true;
			for (int divisor = 2; divisor <= number / 2; divisor++) {
				if (number % divisor == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				count++;
				if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
					System.out.println(number);
				} else
					System.out.print(number + " ");
			}
			number++;
		}
	}
}
