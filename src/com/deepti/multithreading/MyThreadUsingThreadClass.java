package com.deepti.multithreading;

class Hi extends Thread{
	public synchronized void  run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Hi");
			// System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	

		}
		System.out.println("current thread :"+Thread.currentThread().getId());

	}
}
//as Hi class takes some time, Hello has to wait for it to execute to get its turn to be executed.
//Here  multi threading helps, as we can create two threads and then both Hi show and Hello show will run simulataneously.
class Hello extends Thread {
	public synchronized void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("current thread :"+Thread.currentThread().getId());
	}
}

public class MyThreadUsingThreadClass extends Thread {

	public void run() {
		int[] values = { 2, 4, 6, 1, 8, 45, 543, 3, 2123, 433, 2444 };
		int j=0;
		System.out.println("*****");
		for (int i : values) {
			values[j] = i * 2;
			j++;
			// System.out.println(i);
		}

		for (int i : values) {
			System.out.println(i);
		}
		System.out.println("current thread :"+Thread.currentThread().getId());
	}

	public static void main(String[] args) {
		
		MyThreadUsingThreadClass m = new MyThreadUsingThreadClass();
		m.start();
		System.out.println("current thread :"+Thread.currentThread().getId());

		
		/* Hi obj1 = new Hi(); 
		 * Hello obj2 = new Hello(); 
		 * obj1.show();
		 * obj2.show(); */
		
		Hi hiThreadObj = new Hi();
		Hi hiThreadObj2 = new Hi();
		hiThreadObj.start();
	 
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		hiThreadObj.start();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Hello helloThreadObj = new Hello();
		helloThreadObj.start();
		 
		

	//	MyThreadUsingThreadClass t = new MyThreadUsingThreadClass();
	//	t.start();
		/*
		 * try { Thread.sleep(100); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */

		//MyThreadUsingThreadClass t1 = new MyThreadUsingThreadClass();
		//t1.start();
	}
}
