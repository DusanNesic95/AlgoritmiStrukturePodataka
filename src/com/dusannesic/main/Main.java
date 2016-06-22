package com.dusannesic.main;

import java.util.Arrays;

import com.dusannesic.liste.MyArrayList;
import com.dusannesic.liste.MyLinkedList;
import com.dusannesic.liste.MyList;
import com.dusannesic.redovi.MyArrayStack;
import com.dusannesic.redovi.MyLinkedStack;
import com.dusannesic.sortiranja.BubbleSort;
import com.dusannesic.sortiranja.MergeSort;
import com.dusannesic.sortiranja.QuickSort;
import com.dusannesic.sortiranja.SelectionSort;

public class Main {
	
	public static void main(String[] args) {
		int[] a = {4,5,7,1,2,0,9};
		QuickSort.quickSort(a, 0, a.length-1);
		System.out.println(Arrays.toString(a));
		
		@SuppressWarnings("unchecked")
		MyList<String> list = new MyArrayList<String>();
		
		list.add("Dusan");
		list.add("Milica");
		
		list.remove("Dusan");
		System.out.println(list);
		
		MyLinkedList<String> linkedList = new MyLinkedList<String>();
		
		String dusan = new String("Dusan");
		linkedList.add("Stefan");
		linkedList.add(dusan);
		linkedList.add("Milica");
		int index = linkedList.indexOf("Milica");
		
		System.out.println(linkedList.set(2, "Djole"));
		System.out.println(linkedList);
		
		MyArrayStack<Integer> mars = new MyArrayStack<Integer>();
		
		mars.push(10);
		mars.push(20);
		
		System.out.println(mars.pop());
		
		MyLinkedStack<Integer> mls = new MyLinkedStack<Integer>();
		
		mls.push(20);
		mls.push(40);
		
		System.out.println(mls.pop());
	}
	
}
