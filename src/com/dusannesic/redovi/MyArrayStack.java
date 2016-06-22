package com.dusannesic.redovi;

import java.util.EmptyStackException;

public class MyArrayStack<E> implements MyStack<E> {

	private static final int INITSIZE = 16;
	private E[] items;
	private int size;
	
	@SuppressWarnings("unchecked")
	public MyArrayStack() {
		items = (E[]) new Object[INITSIZE];
	}
	
	@SuppressWarnings("unchecked")
	public MyArrayStack(int capacity) {
		items = (E[]) new Object[capacity];
	}

	public int size() {
		return size;
	}
	
	@SuppressWarnings("unchecked")
	private void resize() {
		assert size == items.length;
		Object[] a = new Object[2*size];
		System.arraycopy(items, 0, a, 0, size);
		items = (E[]) a;
	}
	
	@Override
	public boolean isEmpty() {
		return (size == 0);
	}

	@Override
	public void push(E e) {
		if (size == items.length) {
			resize();
		}
		items[size++] = e;
	}

	@Override
	public E pop() throws EmptyStackException {
		if (size == 0) {
			throw new EmptyStackException();
		}
		
		E element = items[--size];
		items[size] = null;
		return element;
	}

	@Override
	public E peek() throws EmptyStackException {
		if (size == 0) {
			throw new EmptyStackException();
		}
		
		return items[size-1];
	}
	
}
