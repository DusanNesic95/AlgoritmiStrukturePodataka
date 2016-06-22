package com.dusannesic.grafovi;

import java.util.HashMap;
import java.util.LinkedList;

public class GraphImplementationMap {

	private HashMap<Vertex, LinkedList<Edge>> paths = new HashMap<>();
	
	public boolean addEdge(Vertex from, Vertex to, int weight) {
		Edge toAdd = new Edge(from, to, weight);
		LinkedList<Edge> currentAdj = paths.get(from);
		if (currentAdj != null) {
			for (Edge edge : currentAdj) {
				if (edge.equals(toAdd)) {
					return false;
				} else {
					currentAdj.add(toAdd);
					paths.put(from, currentAdj);
					return true;
				}
			}
		} else {
			currentAdj = new LinkedList<Edge>();
			currentAdj.add(toAdd);
			paths.put(from, currentAdj);
			return true;
		}
		return false;
	}
	
	public boolean removeEdgeFromKey(Edge toRemove, Vertex key) {
		LinkedList<Edge> where = paths.get(key);
		if (where != null) {
			for (Edge edge : where) {
				if (edge.equals(toRemove)) {
					where.remove(toRemove);
					return true;
				} else {
					return false;
				}
			}			
		} else {
			return false;
		}
		return false;
	}
	
	public boolean removeKey(Vertex key) {
		if (paths.containsKey(key)) {
			paths.remove(key);
			return true;
		} else {
			return false;
		}
	}
	
	public void printAllVertexes() {
		for (Vertex key : paths.keySet()) {
			System.out.println(key.toString());
		}
	}
	
	public void printAllEdges() {
		for (LinkedList<Edge> value : paths.values()) {
			for (Edge edge : value) {
				System.out.println(edge.toString());
			}
		}
	}
	
	public void printAdjForVertex(Vertex key) {
		LinkedList<Edge> toPrint = paths.get(key);
		if (toPrint != null) {
			for (Edge edge : toPrint) {
				System.out.println(edge.toString());
			}			
		} else {
			System.out.println("Ne postoji cvor koji trazite!");
		}
	}
}
