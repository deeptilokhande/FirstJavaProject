package com.deepti.interfacetrial;
 

public interface TryInterface {
	
	int i =0;
	
	default int show() {
		System.out.println("show is default method of interface"+ i);
		return i;
	};
	
	default int change(int j) {
		System.out.println("j is "+ j);
		j++;
		return j;
	}
	
	static void display() {
		System.out.println("Static method without interface implementation called");
	}

}



