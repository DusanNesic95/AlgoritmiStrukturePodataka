package com.dusannesic.mape;

public class LinearHashMap {

	public String[] vals;
	
	public LinearHashMap(int size) {
		vals = new String[size];
	}
	
	public boolean add(String o) {
		for (int i = 0; i < vals.length; i++) {
			if (vals[(o.hashCode()+i) % vals.length] == null) {
				vals[(o.hashCode()+i) % vals.length] = o;
				return true;
			}
		}
		return false;
	}
	
	public boolean contains(String o) {
		for (int i = 0; i < vals.length; i++) {
			if (vals[(o.hashCode()+i) % vals.length] == null) {
				return false;
			}
			if (vals[(o.hashCode()+i) % vals.length].equals(o)) {
				return true;
			}
		}
		return false;
	}
	
}
