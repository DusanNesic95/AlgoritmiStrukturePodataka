package com.milica.algoritmistringovi;

public class LinearSearch {
	 
    public static boolean contains(String kljuc, String argument) {
    	int duzinaKljuca = kljuc.length();
    	boolean toRet = false;
		for (int i = 0; i < argument.length() - duzinaKljuca; i++) {
			String pretraga = argument.substring(i, i+duzinaKljuca);
			if (pretraga.equals(kljuc)) {
				toRet = true;
			}
		}
    	return toRet;
    }
}
