package com.dusannesic.redovi;

public class ArrayQueue<E> implements Queue<E> {

	private E[] items;
	private int size = 0;
	private int front = 0, rear = 0;
	
	@Override
	public void enqueue(E toAdd) {
		if (size() == items.length) {
			throw new EmptyQueueException();
		}
		
		items[rear] = toAdd;
		rear = (rear + 1) % items.length;
		size++;
	}

	@Override
	public E dequeue() {
		if (size == 0) {
			throw new EmptyQueueException();
		}
		
		E tmp = items[front];
		front = (front + 1) % items.length;
		return tmp;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return (size == 0);
	}

	@Override
	public E front() throws EmptyQueueException {
		if (size == 0) {
			throw new EmptyQueueException();
		}
		
		return items[front];
	}
	
}
