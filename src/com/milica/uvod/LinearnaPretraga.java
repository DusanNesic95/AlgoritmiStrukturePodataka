package com.milica.uvod;

public class LinearnaPretraga {
	public static int linearnaPretraga(int[] list, int key) {
		for (int i = 0; i < list.length; i++) {
			if (key == list[i])
				return i;
		}
		return -1;
	}
}
