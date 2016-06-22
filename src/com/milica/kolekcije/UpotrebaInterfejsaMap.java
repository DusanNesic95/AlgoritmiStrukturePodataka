package com.milica.kolekcije;

import java.util.HashMap;
import java.util.Map;

public class UpotrebaInterfejsaMap {
	public static void map(String[] args) {
		Map<String, Integer> m = new HashMap<String, Integer>();
		for (String a : args) {
			Integer freq = m.get(a);
			m.put(a, (freq == null) ? 1 : freq + 1);
		}
		System.out.println(m.size() + " distinct words:");
		System.out.println(m);
	}
}
