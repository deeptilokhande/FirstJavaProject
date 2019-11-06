package com.deepti.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListTest2 {

	public static void main(String[] args) {
		List<String> al = new ArrayList<>();
		al.add("a");
		al.add("b");
		al.add("c");
		
		Iterator i = al.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
			//al.add("d");
			 
		}
	 // if (i.hasNext()) System.out.println("still ele here");else System.out.println("all ele removed");
		
		int array[] = new int[5];
		for(int j=5;j>0;j--) {
			array[5-j]=j;
		}
		Arrays.fill(array,1,4,22);
		for(int u=0;u<5;u++)
		System.out.println(array[u]);
	}
}
