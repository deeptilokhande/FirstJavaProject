package firstPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

	public class ArrayTry{
	 
	public static void main(String[] args) {
		
		  int arra[]= new int[] {1,2,3};
		 
		for(int i:arra) {
			System.out.print("\t "+i);
		}
		
		 ArrayList<String> tryArray = new ArrayList<String>()
		 {
			 { add("one");
			 add("two");
			 add("three");}
		 };
		 
		 
		 ArrayList<String> tryArray2 = new ArrayList<String>(Arrays.asList("one","two","three"));  
		 
		 //ArrayList<String> tryArray3 = new ArrayList<String>(List.Of("one","2","3"));
		 
		 ArrayList<String> tryArray4 = new ArrayList<String>(tryArray);
		 
		 
		try {
			throw new InvalidInputException(null);
		} catch (InvalidInputException e1) {
			// TODO Auto-generated catch block
			System.out.println("caught cha");
		}
		
		for(String s:tryArray) {
			System.out.println(s);
		}
		System.out.println("---------");
		
		String remove = "second";
		for(String s : tryArray) {
			if(remove.equals(s)) {
				tryArray.remove(s);
			}
			
		}
		
		for(String s:tryArray) {
			System.out.println(s);
		} 
				
	}

}
