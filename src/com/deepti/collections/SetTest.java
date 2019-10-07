package com.deepti.collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {	
		objectSet();
		StringSet();
	}
	
	Map <Character,Integer> m= new HashMap<Character,Integer>(); 
	
	public static void objectSet() {
		Set<Animal> animset = new HashSet<>();
		Animal a1 = new Animal("dodo", true);
		Animal a2=a1;
		animset.add(new Animal("dog", false));
		animset.add(new Animal("cat", false));
		animset.add(a1);
		animset.add(a2);
		if(a1==a2) System.out.println("a1 is same object as a2");
		animset.add(new Animal("cat", false));

		for (Animal a : animset) {
			System.out.println(a);
		}
	 
	}
	
	
	public static void StringSet() {
		Set<String> strSet = new HashSet<>();
	 
		strSet.add("dog");
		strSet.add("cat");
		strSet.add("dodo");
		strSet.add("dodo");
		strSet.add("cat");
		
		 

		for (String a : strSet) {
			System.out.println(a);
		}
	}
	
}
