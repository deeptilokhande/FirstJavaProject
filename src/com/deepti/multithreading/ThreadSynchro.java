package com.deepti.multithreading;

public class ThreadSynchro {
	
	public static void main(String[] args) {
		
		Display dobj = new Display();
		Display dobj2 = new Display();
		
		NewThread nt = new NewThread("Deepti", dobj);
		NewThread nt2 = new NewThread("Asawari", dobj);//if same object is passed, lock is obj level, so only 1 thread can access.
		NewThread nt3 = new NewThread("Shreeshail", dobj2);
		nt.start();		
        nt2.start();
        nt3.start();
		
	}

}

class NewThread extends Thread{
	String name;
	Display dObj;
	
	NewThread(String name,Display dObj){
		this.name = name;
		this.dObj = dObj;
	}
	
	public void run() {
		dObj.show(Thread.currentThread().getName()+" says "+ name,dObj);	
		//dObj.showother(name);
	}
}

class  Display {
	
	 public void show(String name,Display b ) {
	
	synchronized(b) {	 
		for(int i=0;i<5;i++) {
			System.out.print("Good morning :");
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {}
			
		System.out.println(name);
		}	
	}
	}
	
	
synchronized public void showother(String name) {
		
		for(int i=0;i<5;i++) {
			System.out.print("Good evening :");
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {}
			
		System.out.println(name);
		}	
	}
}