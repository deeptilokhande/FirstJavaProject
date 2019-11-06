package com.deepti.comparable.comparator;

import java.util.Arrays;
import java.util.Comparator;

import firstPackage.MainMethod;

 

 class Employee implements Comparable<Employee> {
	
	int id;
	String name;
	int age;
	
	public Employee() {}
	
	public Employee(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Employee o2) {
		if (this.age > o2.age) {
			return 1;
		} else if (this.age < o2.age)
			return -1;
		else if (this.age == o2.age)
			return this.name.compareToIgnoreCase(o2.name);
		else
			return 0;

	}

	@Override
	public String toString() {
		return String.format("Employee [id=%s, name=%s, age=%s]", id, name, age);
	}
	
	public static Comparator<Employee> nameComparator= (o1,o2)->o1.name.compareToIgnoreCase(o2.name);
    public static Comparator<Employee> idComparator = (o1,o2)-> o1.id<o2.id?-1:o1.id>o2.id?1:0;
    
    public static Comparator<Employee> twopropertiesofCompare = (o1,o2)->o1.age>o2.age?1:o1.age<o2.age?-1:o1.name.compareTo(o2.name);        
}
 
 
 class GenericClass  <Set> {
	 Set  var;
	 Set var2;
	 
	 
	 
	  public Set getVar() {
		return var;
	}



	public void setVar(Set var) {
		this.var = var;
	}



	public Set getVar2() {
		return var2;
	}



	public void setVar2(Set var2) {
		this.var2 = var2;
	}



	void show() {
		System.out.println("generic class var:"+ var.toString()); 
		
		System.out.println("generic class var2:"+ var2.toString()); 
	 
	 }
 }
 
 


