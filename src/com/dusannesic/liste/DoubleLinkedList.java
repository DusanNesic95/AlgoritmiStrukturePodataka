package com.dusannesic.liste;

public class DoubleLinkedList {

	private class Node {
		protected long data;
		protected Node next;
		protected Node previous;
		
		protected Node(long d) {
			this.data = d;
		}
		
		protected void displayLink() {
			System.out.println("Data: " + data);
		}
	}
	
	Node first;
	Node last;
	
	public DoubleLinkedList() {
		first = null;
		last = null;
	}
	
	public boolean isEmpty() {
		return first == null;
	}
	
	public void insertFirst(long dd) {
		Node newLink = new Node(dd);
		if (isEmpty()) {
			last = newLink;
		} else {
			first.previous = newLink;
			newLink.next = first;
			first = newLink;
		}
	}
	
	public void insertLast(long dd) {
		Node newLink = new Node(dd);
		if (isEmpty()) {
			first = newLink;
		} else {
			last.next = newLink;
			newLink.previous = last;
		}
		last = newLink;
	}
	
	public Node deleteFirst() {
		Node temp = first;
		if (first.next == null) {
			last = null;
		} else {
			first.next.previous = null;
		}
		first = first.next;
		return temp;
	}
	
	public Node deleteLast() {
		Node temp = last;
		if (first.next == null) {
			first = null;
		} else {
			last.previous.next = null;
		}
		last = last.previous;
		return temp;
	}
	
	public boolean insertAfter(long key, long dd) {
		Node current = first;
		while (current.data != key) {
			current = current.next;
			if (current == null) {
				return false;
			}
		}
		Node newLink = new Node(dd);
		if (current == last) {
			newLink.next = null;
			last = newLink;
		} else {
			newLink.next = current.next;
			current.next.previous = newLink;
		}
		newLink.previous = current;
		current.next = newLink;
		return true;
 	}
	
	public Node deleteKey(long key) {
		Node current = first;
		while (current.data != key) {
			current = current.next;
			if (current == null) {
				return null;
			}
		}
		if (current == first) {
			first = current.next;
		} else {
			current.previous.next = current.next;
		}
		if (current == last) {
			last = current.previous;
		} else {
			current.next.previous = current.previous;
		}
		return current;
	}
	
	public void displayForward() {
		System.out.println("List (first to last): ");
		Node current = first;
		while (current != null) {
			current.displayLink();
			current = current.next;
		}
		System.out.println("");
	}
	
	public void displayBackward() {
		System.out.println("List: ");
		Node current = last;
		while (current != null) {
			current.displayLink();
			current = current.previous;
		}
		System.out.println("");
	}
}
