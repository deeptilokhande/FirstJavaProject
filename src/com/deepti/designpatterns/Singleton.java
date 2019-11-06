package com.deepti.designpatterns;

public class Singleton {
	
	public static void main(String[] args) {
		Singletonexample s = Singletonexample.returnInstance();
	}

}


final class Singletonexample{
	
   static Singletonexample obj = new Singletonexample();
	private Singletonexample() {
		 
	}
	
	public static Singletonexample returnInstance() {
		return obj;
	}
}

 