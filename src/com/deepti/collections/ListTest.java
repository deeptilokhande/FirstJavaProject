package com.deepti.collections;


import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;



public  class ListTest {
	
	public static void main(String[] args) {
		ListTest l = new ListTest();
		
		
		l.callArraylist();
		List<Animal> anilist = new ArrayList<>();
		anilist.add(new Animal("dog", false));
		anilist.add(new Animal("cat", false));
		anilist.add(new Animal("dodo", true));
		anilist.add(new Animal("dodo", true));
		anilist.add(new Animal("cat", false));
		System.out.println("****************");
		l.callLinkedList(anilist);	 
	}
	
	public  void callArraylist() {
		Collection<String> c = new ArrayList<String>();
		String array[][] = {{"uma","seema","raveena"},
				             {"sunil","anil","kamal"}};

		c.add("3");
		c.add("deepti");
		c.add("swara");

		List<String> d = new ArrayList<String>();

		d.add("3");
		d.add("swara");
		d.add("deepti");
		d.add("Asawari");
		d.add("swara");
		d.addAll(Arrays.asList(array));

		Collections.sort(d);

		Iterator i = d.iterator();// iterator method returns array of collection elements

		while (i.hasNext()) {
			System.out.println(i.next());
		}

		String str = c.toString();
		System.out.println(str);

		/*
		 * boolean removed = c.removeIf(ci -> ci.contains("deepti")); c.remove("swara");
		 * 
		 * if(removed==true) for(String s : c) System.out.println(s);
		 */
		if (c.equals(d)) {
			System.out.println("Two collections of Arraylist are equal");
		}

		List<Animal> anilist = new ArrayList<>();
		anilist.add(new Animal("dog", false));
		anilist.add(new Animal("cat", false));
		anilist.add(new Animal("dodo", true));
		anilist.add(new Animal("dodo", true));
		anilist.add(new Animal("cat", false));
		
		/*
		 * Map<Animal,Integer> hmap = new HashMap<>(); for (Animal e : anilist) {
		 * 
		 * if(!hmap.containsKey(e)) { hmap.put(e, 1); }else { int oldval = hmap.get(e);
		 * int newval =oldval+1; hmap.put(e,newval); }
		 * 
		 * }
		 */
		
		Set<String> s = new HashSet<>();
		for(String e : d) {
			if(s.add(e)==false)
				System.out.println("Duplicate element :"+e);
		}
		
		
		Set<Animal> s1 = new HashSet<>();
		for(Animal e : anilist) {
			 s1.add(e) ;			 
		}
		
		System.out.println("Printing the set");
		for(Animal e : s1) {
			 System.out.println(e);			 
		}


		/*
		 * Iterator j = anilist.iterator(); while(j.hasNext()) { Animal e = (Animal)
		 * j.next(); System.out.println(e.typeOfAnimal); System.out.println(e); }
		 */

		anilist.add(2, new Animal("mouse", false));

		/*
		 * for (Animal e : anilist) { System.out.println(e);
		 * System.out.println("Index is " + anilist.indexOf(e)); }
		 */

	//	anilist.forEach(System.out::println);// Stream API
	//	System.out.println("-----------");

	//	anilist.removeIf(a -> a.getAnimal().contains("dodo"));
	//	anilist.forEach(System.out::println);// Stream API

	}
	
	public  void callLinkedList(List anilist) {
		
		LinkedList<Animal> aniLinklist = new LinkedList<>();
		aniLinklist.addAll(anilist);
		 
		//System.out.println("first animal polled is "+aniLinklist.pollFirst());
 
		
		for(Animal a : aniLinklist) {
			System.out.println("last index of dodo :"+aniLinklist.lastIndexOf(a));
			System.out.println(a);
		}
		
		System.out.println("-----------");
		
		Vector<Animal> v = new Vector<>();
		v.addAll(anilist);
		
		for(Animal a : v) {
			System.out.println(a);
		}
	}

	
}

 class  Animal {

	public Animal(String typeOfAnimal, boolean extinct) {
		super();
		this.typeOfAnimal = typeOfAnimal;
		this.extinct = extinct;
	}

	String typeOfAnimal;
	boolean extinct;

	@Override
	public String toString() {
		return String.format("Animal [typeOfAnimal=%s, extinct=%s]", typeOfAnimal, extinct);
	}

	public String getAnimal() {
		return typeOfAnimal;
	}

}
