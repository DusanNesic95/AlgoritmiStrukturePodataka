package com.dusannesic.liste;

public class ListOfNumbers {

	final int NUMBER_OF_ELEMENTS = 20;
	double item[];
	int size;
	
	int count() {
		return size;
	}
	
	ListOfNumbers() {
		item = new double[NUMBER_OF_ELEMENTS];
	}
	
	public boolean add(double toAdd) {
		if (size < 20) {
			item[size] = toAdd;
			size++;
			return true;
		}
		
		return false;
	}
	
	public double retrieve(int pos) {
		if (pos >= 0 && pos <= size) {
			return item[pos];
		}
		
		return 0;
	}
	
	public boolean insert(double toAdd, int pos) {
		if (size < 20 && pos >= 0 && pos <= size) {
			for (int i = size; i > pos-1; i--) {
				item[i+1] = item[i];
			}
			item[pos] = toAdd;
			size++;
			return true;
		}
		
		return false;
	}
	
	public boolean delete(int pos) {
		if (pos >= 0 && pos <= size) {
			for (int i = pos; i < size; i++) {
				item[i] = item[i+1];
			}
			size--;
			return true;
		}
		
		return false;
	}
	
}
