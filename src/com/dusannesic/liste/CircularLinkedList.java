package com.dusannesic.liste;

public class CircularLinkedList {

	@SuppressWarnings("unused")
	private int data;
	private CircularLinkedList next;
	
	public CircularLinkedList() {
		data = 0;
		next = this;
	}
	
	public CircularLinkedList(int value) {
		data = value;
		next = this;
	}
	
	public CircularLinkedList insertNext(int value) {
		CircularLinkedList node = new CircularLinkedList(value);
		if (this.next == this) {
			node.next = this;
			this.next = node;
		} else {
			CircularLinkedList temp = this.next;
			node.next = temp;
			this.next = node;
		}
		return node;
	}
	
	@SuppressWarnings("unused")
	public int deleteNext() {
		if (this.next == this) {
			System.out.println("There is only one node, cannot be deleted!");
			return 0;
		}
		CircularLinkedList node = this.next;
		this.next = this.next.next;
		node = null;
		return 1;
	}
	
	public void traverse() {
		traverse(this);
	}
	
	public void traverse(CircularLinkedList node) {
		if (node == null) {
			node = this;
		}
		CircularLinkedList startNode = node;
		do {
			node = node.next;
		} while (node != startNode);
	}
	
	public int getNumberOfNodes() {
		return getNumberOfNodes(this);
	}
	
	public int getNumberOfNodes(CircularLinkedList node) {
		if (node == null) {
			node = this;
		}
		int count = 0;
		CircularLinkedList startNode = node;
		do {
			count++;
			node = node.next;
		} while (node != startNode);
		
		return count;
	}
}
