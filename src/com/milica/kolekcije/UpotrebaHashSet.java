package com.milica.kolekcije;

import java.util.LinkedHashSet;

public class UpotrebaHashSet {
	public static void hashSet() {
		LinkedHashSet<String> hs = new LinkedHashSet<String>();
		hs.add("B");
		hs.add("A");
		hs.add("D");
		hs.add("E");
		hs.add("C");
		hs.add("F");
		System.out.println(hs);
	}
}
