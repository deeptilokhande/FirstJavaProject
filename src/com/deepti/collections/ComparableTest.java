package com.deepti.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableTest {
	
	public static void main(String[] args) {
		ArrayList<AnimalType> at = new ArrayList<>();
		 at.add(new AnimalType(21,"dodo"));
		 at.add(new AnimalType(54,"dragon"));
		 at.add(new AnimalType(11,"deer"));
		 at.add(new AnimalType(21,"elephant"));
		
		 
		// at.forEach(System.out::println);
		 System.out.println("---------");
		 
		 Collections.sort(at);
		 at.forEach(System.out::println);
		 System.out.println("---------");
 /*System.out.println("----after sguffel-----");
		 
		 Collections.shuffle(at);
		 
		 at.forEach(System.out::println);
		 
System.out.println("----after 2ns sguffel-----");
		 
		 Collections.shuffle(at);*/
		 Collections.swap(at,2 , 3);
	
		 
		 at.forEach(System.out::println);
		 
	}
}


class AnimalType implements Comparable<AnimalType>{
	int type;
	String name;
	
	
	public AnimalType(int type, String name) {
		super();
		this.type = type;
		this.name = name;
	}


	@Override
	public int compareTo(AnimalType o) {
		 
		return this.type>o.type? -1:this.type<o.type?1:0;
	}


	@Override
	public String toString() {
		return String.format("AnimalType [type=%s, name=%s]", type, name);
	}
	
	
	 
	
}