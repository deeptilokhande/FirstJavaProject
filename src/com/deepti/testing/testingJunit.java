package com.deepti.testing;

import org.junit.jupiter.api.Test;

public class testingJunit {
	
	public static void main(String[] args) {
		testWithBuffer();
	}
 
	public static void testWithBuffer() {
		StringBuffer s =new StringBuffer("valuelueluelue");
		String s2 = "value1\t";
		 
		System.out.println(s.capacity());
		System.out.println(s.indexOf("lue",3));
		System.out.println(s.lastIndexOf("lue"));
		System.out.println("length "+s.length());
		System.out.println("substring "+s.substring(4, 8));
		System.out.println("string after substring "+s);
		System.out.println(s.delete(5, 7)); 
		System.out.println("after delete "+s);
		System.out.println(s.indexOf("lue",3));
		
		System.out.println(s.reverse());
		
		if (s.toString().contains("1"))
			System.out.println("yay");
		else System.out.println("nappie yay");
		
		
	}

}
