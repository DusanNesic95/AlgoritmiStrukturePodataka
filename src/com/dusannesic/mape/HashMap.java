package com.dusannesic.mape;

import java.util.LinkedList;

public class HashMap<T,E> {

	@SuppressWarnings("rawtypes")
	private LinkedList[] values;
	
	private static class Entry {
		private Object key;
		private Object value;
		
		public Entry(Object key, Object value) {
			this.key = key;
			this.value = value;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public HashMap(int size) {
		values = new LinkedList[size];
		
		for (int i = 0; i < values.length; i++) {
			values[i] = new LinkedList();
		}
	}
	
	@SuppressWarnings("unchecked")
	public void add(E key, T value) {
		values[(key.hashCode() % values.length)].add(new Entry(key, value));
	}
	
	public boolean contains(E key) {
		for (Object o : values[(key.hashCode() % values.length)]) {
			if (((Entry)o).key.equals(key)) {
				return true;
			}
		}
		return false;
	}
	
	@SuppressWarnings("unchecked")
	public T get(E key) {
		for (Object o : values[(key.hashCode() % values.length)]) {
			if (((Entry)o).key.equals(key)) {
				return (T)(((Entry)o).value);
			}
		}
		return null;
	}
}
