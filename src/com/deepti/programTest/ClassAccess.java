package com.deepti.programTest;

public class ClassAccess {
	
	public static void main(String[] args) {
		
		 A a = new B();
		 a.method1();	
		
	}

}


class A{
	
	public static void method1() {
		System.out.println("In method 1");
	}
}



class B extends A{
	
	public static void method2() {
		System.out.println("In method 2");
	}
}
