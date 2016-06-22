package com.dusannesic.stabla;

public class LSD {

    public static void sort(String[] argument){
    	
    	int size = 0; 	
    	for (int i = 0; i < argument.length; i++) {
    		if (size < argument[i].length()) {
    			size = argument[i].length();
    		}
    	}
    	
        int numChars = 58;
        String[] temp = new String[argument.length];
        int[] brojac;

        for (int i = size-1; i >= 0; i--) {       
            brojac = new int[numChars];

            for (int j = 0; j < argument.length; j++) {
                if (argument[j].length() > i) {
                    if (argument[j].charAt(i) >= 97) {
                        brojac[argument[j].charAt(i)-96]++;
                    } else {
                        brojac[argument[j].charAt(i)-64]++;
                    }
                } else {
                    brojac[0]++;
                }
            }

            for (int j = 0; j < numChars-1; j++) {
                brojac[j+1] += brojac[j]; 
            }

            for (int j = argument.length-1; j >= 0; j--) {
                if (argument[j].length() > i) {
                    int pos;
                    if (argument[j].charAt(i) >= 97) {
                        pos = argument[j].charAt(i)-96;
                    } else {
                        pos = argument[j].charAt(i)-64;
                    }
                    temp[brojac[pos]-1] = argument[j];
                    brojac[pos]--;
                } else {
                    temp[brojac[0]-1] = argument[j];
                    brojac[0]--;
                }
            }

            for (int j = 0; j < argument.length; j++) {
                argument[j] = temp[j];
            }
        }   
    }
}
