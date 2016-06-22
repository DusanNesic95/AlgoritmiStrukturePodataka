package com.dusannesic.redovi;

@SuppressWarnings("rawtypes")
public class CircularArrayQueue implements Queue {

	private static final int CAPACITY = 5;
	private Object[] items;
	private final int N;
	private int f = 0;
	private int r = 0;
	
	public CircularArrayQueue() {
		this(CAPACITY);
	}
	
	public CircularArrayQueue(int capacity) {
		N = capacity;
		items = new Object[N];
	}
	
	@Override
	public int size() {
		if (r > f) {
			return r-f;
		}
		return N - f + r;
	}
	
	@Override
	public boolean isEmpty() {
		return (r == f) ? true : false;
	}
	
	@Override
	public void enqueue(Object obj) {
		items[r] = obj;
		r = (r + 1) % N;
	}
	
	@Override
	public Object dequeue() {
		Object item;
		if (isEmpty()) {
			throw new EmptyQueueException();
		}
		
		item = items[f];
		items[f] = null;
		f = (f + 1) % N;
		return item;
	}

	@Override
	public Object front() throws EmptyQueueException {
		if (items.length == 0) {
			throw new EmptyQueueException();
		}
		
		return items[f];
	}
}
