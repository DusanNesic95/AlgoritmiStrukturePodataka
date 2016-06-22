package com.dusannesic.redovi;

public class EmptyQueueException extends RuntimeException {
	
	private static final long serialVersionUID = -5769003451509333430L;

	public EmptyQueueException() {
		this("Queue is empty!");
	}
	
	public EmptyQueueException(String exception) {
		super(exception);
	}
}
