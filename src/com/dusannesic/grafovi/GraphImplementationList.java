package com.dusannesic.grafovi;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class GraphImplementationList {

	private List<Edge> edges = new LinkedList<>();
	private Set<Vertex> vertexes = new HashSet<>();
	
	public void print() {
		for (Edge edge : edges) {
			System.out.println(edge.toString());
		}
	}
	
	public void addEdge(Vertex from, Vertex to, int weight) {
		vertexes.add(from);
		vertexes.add(to);
		edges.add(new Edge(from, to, weight));
	}
	
	public List<Edge> minimumSpanningTree(Vertex start) {
		List<Edge> toRet = new LinkedList<>();
		Set<Vertex> mst = new HashSet<>();
		
		mst.add(start);
		
		while (mst.size() < vertexes.size()) {
			Edge min = null;
			
			for (Edge e : edges) {
				if (mst.contains(e.getFrom()) && !mst.contains(e.getTo()))
					if (min == null || min.getWeight() < e.getWeight()) {
						min = e;
					}
			}
			
			mst.add(min.getTo());
			toRet.add(min);
		}
		return toRet;
	}
	
	public enum VisitedState {
		UNVISITED, VISITED, WORKED;
	}
	
	public void dfs() {
		VisitedState visited[] = new VisitedState[vertexes.size()];
		for (int i = 0; i < visited.length; i++) {
			visited[i] = VisitedState.UNVISITED;
		}
		runDfs(0, visited);
	}
	
	private void runDfs(int u, VisitedState state[]) {
		state[u] = VisitedState.VISITED;
		for (int i = 0; i < vertexes.size(); i++) {
			if (state[i] == VisitedState.UNVISITED) {
				runDfs(i, state);
			}
		}
		state[u] = VisitedState.WORKED;
		System.out.println("Pretrazen je cvor na dubini: " + u);
	}

	public List<Edge> getEdges() {
		return edges;
	}

	public void setEdges(List<Edge> edges) {
		this.edges = edges;
	}

	public Set<Vertex> getVertexes() {
		return vertexes;
	}

	public void setVertexes(Set<Vertex> vertexes) {
		this.vertexes = vertexes;
	}
	
	public void addVertex(Vertex toAdd) {
		vertexes.add(toAdd);
	}
	
}
