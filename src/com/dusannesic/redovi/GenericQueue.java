package com.dusannesic.redovi;

import java.util.LinkedList;

public class GenericQueue<E> {
	
	private LinkedList<E> list = new LinkedList<E>(); public void
	
	enqueue(E item) {
		list.addLast(item);
	}
	public E dequeue() {
		return list.poll();
	}
	public boolean hasItems() {
		return !list.isEmpty();
	}
	public int size() {
		return list.size();
	}
	public void addItems(GenericQueue<? extends E> q) {
		while (q.hasItems())
			list.addLast(q.dequeue());
	}
}

class Employee {
	public String lastName;
	public String firstName;
	public Employee() {}
	public Employee(String last, String first) {
		this.lastName = last;
		this.firstName = first;
	}
	public String toString() {
		return firstName + " " + lastName;
	}
}

class HourlyEmployee extends Employee {
	public double hourlyRate;
	public HourlyEmployee(String last, String first) {
		super(last, first);
	}
}
