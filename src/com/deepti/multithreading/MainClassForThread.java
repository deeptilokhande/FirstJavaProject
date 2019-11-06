package com.deepti.multithreading;

class MainClassForThread {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Entrance of  main method");

		MyThread.mt = Thread.currentThread();
		MyThread t1 = new MyThread();

		t1.start();
		// t1.join(); just created a deadlock
		t1.interrupt();

		// for(int i=0;i<5;i++)
		System.out.println("In main thread");

	}

}

class MyThread extends Thread {
	static Thread mt = null;

	public void run() {
		/*
		 * try { mt.join(); }catch(InterruptedException e) {}
		 */
		try {
		for (int i = 0; i < 5; i++) {
			Thread.sleep(2000);
			System.out.println("In lazy thread");
			
			} 
		}catch (InterruptedException e) {
			System.out.println("I the lazy thread is interrupted");
		}
	}

}
