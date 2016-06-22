package com.milica.kolekcije;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

public class SortiranjeObrtanjeNasumicnoPomeranjeElemenataKolekcije {
	public static void example() {
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(new Integer(-8));
		ll.add(new Integer(20));
		ll.add(new Integer(-20));
		ll.add(new Integer(8));
		Comparator<Integer> r = Collections.reverseOrder();
		Collections.sort(ll, r);
		Iterator<Integer> li = ll.iterator();
		System.out.print("List sorted in reverse: ");
		while(li.hasNext()){
			System.out.print(li.next() + " ");
		}
		System.out.println();
		Collections.shuffle(ll);
		li = ll.iterator();
		System.out.print("List shuffled: ");
		while(li.hasNext()){
			System.out.print(li.next() + " ");
		}
		System.out.println();
		System.out.println("Minimum: " + Collections.min(ll));
		System.out.println("Maximum: " + Collections.max(ll));
	}
}
