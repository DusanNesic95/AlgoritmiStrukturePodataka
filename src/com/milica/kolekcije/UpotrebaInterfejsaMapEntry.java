package com.milica.kolekcije;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class UpotrebaInterfejsaMapEntry {
	public static void mapEntry() {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1234, "Maddin");
		map.put(5678, "Egoyan");
		map.put(9012, "Quay");
		System.out.println("Original Map: " + map);
		Set<Map.Entry<Integer, String>> setOfEntries = map.entrySet();
		System.out.println("Original Set: " + setOfEntries);
		for(Map.Entry<Integer, String> entry : setOfEntries) {
			System.out.println(" Key: " + entry.getKey());
			System.out.println(" Value: " + entry.getValue());
			entry.setValue("Khanjian");
		}
		System.out.println("Revised Set: " + setOfEntries);
		System.out.println("Map: " + map);
	}
}
