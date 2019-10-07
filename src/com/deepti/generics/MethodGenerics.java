package com.deepti.generics;

 
import java.util.Collection;

import com.deepti.SQL.*;

public class MethodGenerics  {

	public static void main(String[] args) {
         
	Integer	printObjects[] = {3,5,6,67,8,9};
	printGroup(printObjects);
	
	String printObjects2[] = {"eena","meena","deeka"};
	printGroup(printObjects2);
	
	System.out.println(max(1,23));
	System.out.println(max("eena","meena"));
	System.out.println(max(new Employee(1,"deepti","admile","F","Lead",1,89000),new Employee(2,"swara","admile","F","Lead",1,80000)));
	
	
	Box<Integer> a = new Box<>(20);
	a.add(20);
	Box<String> b = new Box<>("deep");
	b.add("coooool");
	}
	
	
	public static <T> void printGroup(T[] printObjects) {
		
		for(T i : printObjects) {
			System.out.println(i);
		}
	}
	
	public static <T extends Comparable<T>> T max(T x, T y){	
		
		if(x.compareTo(y)<0)
			return x;
		else return y;
		 
		
	}

}


class Box <T>{
	T i;
	
	Box(T i){
		this.i = i;
	
	}
 
	
	public void add(T a) {
		System.out.println(a + " is added and i is "+ i);
	}
	
}