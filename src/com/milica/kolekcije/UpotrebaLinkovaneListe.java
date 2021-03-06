package com.milica.kolekcije;

import java.util.LinkedList;

public class UpotrebaLinkovaneListe {
	public static void linkedList() {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("F");
		ll.add("B");
		ll.add("D");
		ll.add("E");
		ll.add("C");
		ll.addLast("Z");
		ll.addFirst("A");
		ll.add(1, "A2");
		System.out.println("Original contents of ll: " + ll);
		ll.remove("F");
		ll.remove(2);
		System.out.println("Contents of ll after deletion: " + ll);
		ll.removeFirst();
		ll.removeLast();
		System.out.println("ll after deleting first and last: " + ll);
		Object val = ll.get(2);
		ll.set(2, (String) val + " Changed");
		System.out.println("ll after change: " + ll);
	}
}
