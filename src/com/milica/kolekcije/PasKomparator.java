package com.milica.kolekcije;

import java.util.Comparator;

public class PasKomparator implements Comparator<PasKomparator>, Comparable<PasKomparator>{
	private String name;
	private int age;
	
	public PasKomparator() {}
	
	public PasKomparator(String n, int a) {
		name = n;
		age = a;
	}
	
	public String getDogName() {
		return name;
	}
	
	public int getDogAge() {
		return age;
	}
	
	public int compareTo(PasKomparator d){
		return (this.name).compareTo(d.name);
	}
	
	public int compare(PasKomparator d, PasKomparator d1){
		return d.age - d1.age;
	}
}