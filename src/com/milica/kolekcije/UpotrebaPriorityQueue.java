package com.milica.kolekcije;

import java.util.PriorityQueue;

public class UpotrebaPriorityQueue {
	public static void priorityQueue() {
		PriorityQueue <Integer> prq = new PriorityQueue <Integer> ();
		for ( int i = 3; i < 10; i++ ){
			prq.add (new Integer (i)) ;
		}
		System.out.println ( "Initial priority queue values are: "+prq);
		
		Integer head = prq.poll();
		System.out.println ( "Head of the queue is: "+ head);
		System.out.println ( "Priority queue values after poll: "+prq);
	}
}
