package com.deepti.exceptionhandling;

public class OverLoading {

	public static void main(String[] args) {
	 
             m1(23f,12 );
	}
	
	
	public static void m1(double a,int b) {
        System.out.println("first");		
	}
	
	public static void m1(float a,float b ) {
         System.out.println("second");		
	}
	
	
	

}
