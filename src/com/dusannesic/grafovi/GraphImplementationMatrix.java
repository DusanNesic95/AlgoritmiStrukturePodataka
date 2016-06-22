package com.dusannesic.grafovi;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Random;

public class GraphImplementationMatrix {
	private Random random = new Random();
	
	private int V;
	private int E;
	private boolean[][] adj;
	
	public GraphImplementationMatrix(int v) {
		if (v < 0) throw new RuntimeException("Broj grana mora biti pozitivan!");
		V = v;
		E = 0;
		this.adj = new boolean[v][v];
	}
	
	public GraphImplementationMatrix(int v, int e) {
		this(v);
		if (e < 0) throw new RuntimeException("Broj cvorova mora biti pozitivan!");
		if (e > v*(v-1) + v) throw new RuntimeException("Ima previse cvorova!");
		
		while (this.E != e) {
			int secV = random.nextInt(v);
			int secW = random.nextInt(v);
			addEdge(secV, secW);
		}
	}
	
	public int V() {
		return V;
	}
	
	public int E() {
		return E;
	}
	
	public void addEdge(int v, int w) {
		if (!adj[v][w]) E++;
		adj[v][w] = true;
		adj[w][v] = true;
	}
	
	public boolean contains(int v, int w) {
		return adj[v][w];
	}
	
	public Iterable<Integer> adj(int v) {
		return new AdjIterator(v);
	}
	
	private class AdjIterator implements Iterator<Integer>, Iterable<Integer> {
		private int v;
		private int w = 0;
		
		AdjIterator(int v) {
			this.v = v;
		}
		
		@Override
		public Iterator<Integer> iterator() {
			return this;
		}
		
		@Override
		public boolean hasNext() {
			while (w < V) {
				if (adj[v][w]) return true;
				w++;
			}
			return false;
		}
		
		@Override
		public Integer next() {
			if (!hasNext()) {
				throw new NoSuchElementException();
			}
			return w++;
		}
		
		@Override
		public void remove() {
			throw new UnsupportedOperationException();
		}
	}

	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append(V + " " + E + "\n");
		for (int v = 0; v < V; v++) {
			s.append(v + ": ");
			for (int w : adj(v)) {
				s.append(w + " ");
			}
			s.append("\n");
		}
		return s.toString();
	}
}
