package com.deepti.interfacetrial;

public class MainClass {
	
	public static void main(String[] args) {
		TryInterface t = new TryClass();
		int j=t.show();
		System.out.println("J from show of Tryclass which overided default show in interface is +j "+j );
		t.change(20);
		t.show();
		
		TryInterface.display();
	}
	

}
