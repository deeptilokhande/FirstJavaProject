package com.deepti.multithreading;

public class MyThreadUsingRunnableInterface {
	
	public static void main(String[] args) {
		
		new Thread(()->new MyThreadUsingRunnableInterface().show("hi")) .start();
		
		 
		// new Thread(()->new MyThreadUsingRunnableInterface().show("Deepti")).start();
 
		
		try {Thread.sleep(10);} catch (InterruptedException e1) {e1.printStackTrace();}
		
	
		//new Thread(()->new MyThreadUsingRunnableInterface().show("Prashant") ).start();
		
	}
	
	
	
public  void show(String str) {
	for(int i=0;i<5;i++){
		System.out.println(str);
		try {Thread.sleep(1000);} 
		catch (InterruptedException e) {e.printStackTrace();}
		}
	}
	

}
