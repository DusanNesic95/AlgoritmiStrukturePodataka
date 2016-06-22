package com.dusannesic.redovi;

import java.util.EmptyStackException;

public interface MyStack<E> {

	public boolean isEmpty();
	public void push(E e);
	public E pop() throws EmptyStackException;
	public E peek() throws EmptyStackException;
	
}
