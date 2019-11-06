package com.deepti.exceptionhandling;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestExceptions {

	public static void main(String[] args) throws RuntimeException, IOException, SQLException   {
	 Animal d= new Dog();
	 d.voice(5);
	 
	 Dog r = new Dog();
	 r.voice(5);
	}
}

class Animal{
	public  List voice(int i) throws  SQLException {
		System.out.println("voice !");
		return new ArrayList();
	}
	
	public static void show() {
		System.out.println("show");
	}
}

class Dog extends Animal {
	 
	public   LinkedList voice( int j)  {
		   System.out.println("bark2!");
		return null;
		    	
		}
	
	
	public LinkedList voice(long i) {
		  System.out.println("bark!"); return new LinkedList(); }
	
	
	public static void show() {
		System.out.println("show2");
	}
	
	 
}