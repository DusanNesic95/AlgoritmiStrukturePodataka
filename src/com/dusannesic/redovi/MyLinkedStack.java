package com.dusannesic.redovi;

import java.util.EmptyStackException;

public class MyLinkedStack<E> implements MyStack<E> {

	private Node<E> head = new Node<E>();
	private int size;
	
	@Override
	public boolean isEmpty() {
		return (size == 0);
	}
	
	@Override
	public void push(E e) {
		head.prev = head.prev.next = new Node<E>(e, head.prev, head );
		++size;
	}
	
	@Override
	public E pop() throws EmptyStackException {
		if (size == 0) {
			throw new EmptyStackException();
		}
		
		E element = head.prev.element;
		head.prev = head.prev.prev;
		head.prev.next = head;
		--size;
		return element;
	}
	
	@Override
	public E peek() throws EmptyStackException {
		if (size == 0) {
			throw  new EmptyStackException();
		}
		
		return head.prev.element;
	}
	
	public int size() {
		return size;
	}
	
	private static class Node<E> {
		E element;
		Node<E> prev;
		@SuppressWarnings("unused")
		Node<E> next;
		
		Node() {
			this.prev = this.next = this;
		}
		
		Node(E element, Node<E> prev, Node<E> next) {
			this.element = element;
			this.prev = prev;
			this.next = next;
		}
	}
	
}
