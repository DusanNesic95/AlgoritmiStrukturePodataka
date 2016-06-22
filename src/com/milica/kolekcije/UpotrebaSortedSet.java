package com.milica.kolekcije;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class UpotrebaSortedSet {
	public static void sortedSet() {
		SortedSet<String> set = new TreeSet<String>();
		set.add("b");
		set.add("c");
		set.add("a");
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			Object element = it.next();
			System.out.println(element.toString());
		}
	}
}
