package com.dusannesic.redovi;

class Node<T> {
	
	private Node<T> prev;
	private Node<T> next;
	private T value;
	
	public Node<T> getPrev() {
		return prev;
	}
	
	public void setPrev(Node<T> prev) {
		this.prev = prev;
	}
	
	public Node<T> getNext() {
		return next;
	}
	
	public void setNext(Node<T> next) {
		this.next = next;
	}
	
	public T getValue() {
		return value;
	}
	
	public void setValue(T value) {
		this.value = value;
	}
	
}

public class Deque<T> {
	
	private Node<T> front;
	private Node<T> rear;
	
	public void insertFront(T item){
		Node<T> nd = new Node<T>();
		nd.setValue(item);
		nd.setNext(front);
		if(front != null) front.setPrev(nd);
		if(front == null) rear = nd;
		front = nd;
	}
	
	public void insertRear(T item){
		Node<T> nd = new Node<T>();
		nd.setValue(item);
		nd.setPrev(rear);
		if(rear != null) rear.setNext(nd);
		if(rear == null) front = nd;
		rear = nd;
	}
	
	public void removeFront(){
		if(front == null){
			return;
		}
		
		Node<T> tmpFront = front.getNext();
		if(tmpFront != null) tmpFront.setPrev(null);
		if(tmpFront == null) rear = null;
		front = tmpFront;
	}
	
	public void removeRear(){
		if(rear == null){
			return;
		}
		Node<T> tmpRear = rear.getPrev();
		if(tmpRear != null) tmpRear.setNext(null);
		if(tmpRear == null) front = null;
		rear = tmpRear;
	}
	
}
