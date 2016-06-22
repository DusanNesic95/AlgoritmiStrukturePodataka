package com.dusannesic.liste;

import java.util.Iterator;

public class MyArrayList<E> extends MyAbstractList {

	public static final int INITIAL_CAPACITY = 16;
	@SuppressWarnings("unchecked")
	private E[] data = (E[]) new Object[INITIAL_CAPACITY];
	
	public MyArrayList() {}
	
	public MyArrayList(E[] objects) {
		for (int i = 0; i < objects.length; i++) {
			add(objects[i]);
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void add(int index, Object e) {
		ensureCapacity();
		
		for (int i = size - 1; i >= index; i--) {
			data[i+1] = data[i];
		}
		data[index] = (E) e;
		size++;
	}
	
	private void ensureCapacity() {
		if (size >= data.length) {
			@SuppressWarnings("unchecked")
			E[] newData = (E[])(new Object[size * 2 + 1]);
			System.arraycopy(data, 0, newData, 0, size);
			data = newData;
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void clear() {
		data = (E[]) new Object[INITIAL_CAPACITY];
		size = 0;
	}

	@Override
	public boolean contains(Object e) {
		for (int i = 0; i < size; i++) {
			if (e.equals(data[i])) {
				return true;
			}
		}
		
		return false;
	}

	@Override
	public Object get(int index) {
		checkIndex(index);
		return data[index];
	}
	
	private void checkIndex(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Index: " + index + " Size: " + size);
		}
	}

	@Override
	public int indexOf(Object e) {
		for (int i = 0; i < size; i++) {
			if (e.equals(data[i])) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public int lastIndexOf(Object e) {
		for (int i = size - 1; i >= 0; i--) {
			if (e.equals(data[i])) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public Object remove(int index) {
		checkIndex(index);
		
		E e = data[index];
		
		for (int j = index; j < size - 1; j++) {
			data[j] = data[j+1];
		}
		
		data[size - 1] = null;
		size--;
		
		return e;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Object set(int index, Object e) {
		checkIndex(index);
		
		E old = data[index];
		data[index] = (E) e;
		
		return old;
	}

	@Override
	public String toString() {
		StringBuilder result = new StringBuilder("[");
		
		for (int i = 0; i < size; i++) {
			result.append(data[i]);
			if (i < size - 1) result.append(", ");
		}
		
		return result.toString() + "]";
	}
	
	@SuppressWarnings("unchecked")
	public void trimToSize() {
		if (size != data.length) {
			E[] newData = (E[])(new Object[size]);
			System.arraycopy(data, 0, newData, 0, size);
			data = newData;
		}
	}
	
	@SuppressWarnings("rawtypes")
	@Override
	public Iterator iterator() {
		return new ArrayListIterator();
	}
	
	private class ArrayListIterator implements Iterator<E> {
		private int current = 0;
		
		@Override
		public boolean hasNext() {
			return (current < size);
		}
		
		@Override
		public E next() {
			return data[current++];
		}
		
		@Override
		public void remove() {
			MyArrayList.this.remove(current);
		}
	}
}
