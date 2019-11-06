package com.deepti.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorTest {

	public static void main(String[] args) {
		tryIntArraylist();
		//tryObjArraylist();
	}
	
	
	public static void tryObjArraylist() {
		List<Student> stl = new ArrayList<>();
		stl.add(new Student(1,"swara"));
		stl.add(new Student(2,"saarth"));
		stl.add(new Student(5,"anivika"));
		stl.add(new Student(4,"dheera"));
		stl.add(new Student(4,"dheera"));
		stl.add(new Student(3,"idhika"));
		
		
		stl.forEach(System.out::println);
		System.out.println("------1------");
		Collections.sort(stl,(obj1 ,obj2 )->{return obj1.rollNo > obj2.rollNo ?1:-1;});
		 
		stl.forEach(System.out::println);
		
		System.out.println("------2------");
		Collections.sort(stl, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				if(o1.rollNo < o2.rollNo )
					return 1;
				 
				return -1;
			}
			
		});
		 
		stl.forEach(System.out::println);
		
	}

	public static void tryIntArraylist() {

		List<Integer> ln = new ArrayList<Integer>();
		ln.add(2);
		ln.add(3);
		ln.add(32);
		ln.add(5432);
		ln.add(835);
		ln.add(35);
		ln.add(312);

		System.out.println("------1------");
		ln.forEach(System.out::println);
		Collections.sort(ln);

		System.out.println("-----2-------");
		Collections.reverse(ln);
		ln.forEach(System.out::println);

		System.out.println("-------3-----");
		// using anonymous class instead of named class for comparator
		/*
		 * Comparator<Integer> co = new Comparator<Integer>() {
		 * 
		 * @Override public int compare(Integer o1, Integer o2) { if (o1%10>o2%10)
		 * return 1; return -1; } };
		 */

		// using lambda expression to create comparator
		// Comparator<Integer> co = (o1,o2)->{ return o1%100>o2%100?1:-1;};
		// Collections.sort(ln,co);

		Collections.sort(ln, (i1, i2) -> {
			return i1 % 10 > i2 % 10 ? 1 : i1%100>i2%100?1:-1;
		});

		for (Integer integer : ln) {
			System.out.println(integer);
		}
		;

	}
}

class Student {
	int rollNo;
	String name;
	

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}
	
	public String toString() {
		return rollNo+" "+ name;	
	}

}

//using actual named class to implement comparator
/*
 * class CompImpl implements Comparator<Integer>{
 * 
 * @Override public int compare(Integer o1, Integer o2) {
 * 
 * if(o1%10>o2%10) return 1; return -1; }
 * 
 * 
 * }
 */