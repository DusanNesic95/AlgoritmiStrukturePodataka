package com.dusannesic.grafovi;

public class Vertex {
	
	private String data;
	private boolean isVisited;
	
	public Vertex() {}

	public Vertex(String data, boolean visited, int x, int y) {	
		this.data = data;
		this.isVisited = visited;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	public boolean isVisited() {
		return isVisited;
	}

	public void setVisited(boolean isVisited) {
		this.isVisited = isVisited;
	}

	@Override
	public String toString() {
		return data;
	}
	
}
