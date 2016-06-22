package com.milica.rekurzija;

import java.io.File;

public class VelicinaDirektorijuma {
	public static long getSize(File file) {
		long size = 0;
		if (file.isDirectory()) {
			File[] files = file.listFiles();
			for (int i = 0; files != null && i < files.length; i++) {
				size += getSize(files[i]); // Recursive call
			}
		} else {
			size += file.length();
		}
		return size;
	}
}
