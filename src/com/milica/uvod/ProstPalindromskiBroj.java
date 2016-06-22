package com.milica.uvod;

public class ProstPalindromskiBroj {
	public static void prostPalindromskiBroj() {
		int count = 1;
		for (int i = 2; true; i++) {
			if (isPrime(i) && isPalindrome(i)) {
				System.out.print(i + " ");
				if (count % 10 == 0) {
					System.out.println();
				}
				if (count == 100) {
					break;
				}
				count++;
			}
		}
	}
	
	public static boolean isPrime(int num) {
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
		
	static int reversal(int number) {
		int result = 0;
		while (number != 0) {
			int lastDigit = number % 10;
			result = result * 10 + lastDigit;
			number = number / 10;
		}
		return result;
	}
		
	static boolean isPalindrome(int number) {
		return number == reversal(number);
	}
}
