package com.milica.kolekcije;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class UpotrebaInterfejsaSortedMap {
	public static void sortedMap() {
		SortedMap<Integer,String> sm=new TreeMap<Integer, String>();
		sm.put(new Integer(2), "Two");
		sm.put(new Integer(1), "One");
		sm.put(new Integer(4), "Four");
		sm.put(new Integer(3), "Three");
		sm.put(new Integer(5), "Five");
		Set<Entry<Integer, String>> s = sm.entrySet();
		Iterator<Entry<Integer, String>> i = s.iterator();
		while(i.hasNext()) {
			Map.Entry m =(Map.Entry)i.next();
			int key = (Integer)m.getKey();
			String value=(String)m.getValue();
			System.out.println("Key :"+key+" value :"+value);
		}
	}
}
