package com.deepti.serialization;

import java.io.Serializable;

public class Student implements Serializable{
	
	public int rollNo;
	public String name;
	
	public Student() {
		
	}
	
	public Student(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	

	@Override
	public String toString() {
		return String.format("Student [rollNo=%s, name=%s]", rollNo, name);
	}
	

}
