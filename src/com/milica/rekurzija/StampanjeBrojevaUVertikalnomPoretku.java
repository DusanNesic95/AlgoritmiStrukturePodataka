package com.milica.rekurzija;

public class StampanjeBrojevaUVertikalnomPoretku {
	public static void superWriteVertical(int number){
		if (number < 0){
			System.out.println("-");
			superWriteVertical(-number);
		} else if (number < 10)
			System.out.println(number);
		else {
			superWriteVertical(number/10); 
			System.out.println(number % 10);
		}
	}
}
