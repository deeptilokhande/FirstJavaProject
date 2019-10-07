package com.deepti.comparable.comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class CompareCollections  
{
	static int count;
	public CompareCollections() {
		 count++;
	}
	
	public static void main(String[] args) {
		
		Stack <Integer> n = new Stack<>();
		n.push(1);
		n.push(2);
		n.push(3);
		n.forEach(System.out::println);

		
		 System.out.println("Peeked ele :"+n.peek());
		 n.forEach(System.out::println);
		 System.out.println("*******");
		// n.pop();
	n.pop();
		 n.pop();
		 System.out.println("*after popping all******");
		 n.forEach(System.out::println);
		 if(n.isEmpty()) System.out.println("Stack is empty");
		 else System.out.println("stack has elements");
		 
		//comparatorusingString();
		comparableandcomparatorusingObject();
		
		List <CompareCollections> c =  new ArrayList<>();
		c.add(new CompareCollections());
	//	System.out.println(c.toString());
	 

		c.add(new CompareCollections()); 
	//	System.out.println(c.toString());

		c.add(new CompareCollections());
		//System.out.println(c.toString());

		c.add(new CompareCollections());
	//	System.out.println(c.toString());
	
		Iterator i = c.iterator();
		
	//	 i.forEachRemaining(System.out::println);
		
		// System.out.println("*******");
		// i.forEachRemaining(System.out::println);
		
		
	}
	
	@Override
	public String toString() {
		  return String.valueOf(count);
	}

	public static void comparatorusingString() {
		List<String> strList = new ArrayList<>();
		List<String> strList2 = Arrays.asList("Dheera","Vedh","Ojaswi");
		strList.add("Swara");
		strList.add("Idhika");
		strList.add("Sarth");
		strList.add("Sarth");
		strList.addAll(strList2);
	     
		 
		//sorted using comparator using 2nd char to compare
		strList.sort((s1, s2)-> { return s1.charAt(1)  > s2.charAt(1) ? 1 :  -1;});
		
		strList.forEach(System.out::println);
		System.out.println("********************");
		//sort normally
		Collections.sort(strList);
		strList.forEach(System.out::println);
	}
	
	public static void comparableandcomparatorusingObject() {
		List<Cricketier> cricketllist = new LinkedList<>();
		cricketllist.add(new Cricketier("Sachin",20000));
		cricketllist.add(new Cricketier("Lara",10000));	
		cricketllist.add(new Cricketier("Ponting",9000));
		cricketllist.add(new Cricketier("Kohli",16000));
		cricketllist.add(new Cricketier("Bradman",1000));
		 
		cricketllist.forEach(System.out::println);
		
		System.out.println("********************");
		Collections.sort(cricketllist);
		cricketllist.forEach(System.out::println);
		
		System.out.println("*****after both fiels***************");
		Collections.sort(cricketllist,(c1,c2)->{return c1.name.charAt(0) >c2.name.charAt(0)  ? 1 : c1.runs >c2.runs ? 1:-1;});
		cricketllist.forEach(System.out::println);
	}

	public Iterator<CompareCollections> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

}

class Cricketier implements Comparable<Cricketier>{
	String name;
	int runs;
	public Cricketier(String name, int runs) {
		super();
		this.name = name;
		this.runs = runs;
	}
	@Override
	public String toString() {
		return String.format("Cricketier [name=%s, runs=%s]", name, runs);
	}
	
	
	@Override
	public int compareTo(Cricketier o) {
		 if(this.runs < o.runs) 
			 return 1;
		 else  
			  return -1; 
	}
	
	
	
}
