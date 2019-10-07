package firstPackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class UniqueCharacters {
	
	 public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
	
	do {
		System.out.println("\nTo exit out of loop press N");
		System.out.println("Enter string to be checked for Unique chars :");
		String x=sc.next();
		if(x.length()==0) {
			System.out.println("Enter string to be checked for Unique chars :");
			x=sc.next();
		}
		if(x.equalsIgnoreCase("N")) {
			break;
		}
	 
		Map <Character,Integer> map = new LinkedHashMap<>();
		char[] charArr = x.toCharArray();
		int length=charArr.length;
		createHashMap(map,length,charArr);
		findUniqueCharString(map,x);
		printUniqueCharacters(map);
		
		
	}while(true);
		

	}
	
	public static void createHashMap(Map<Character, Integer> map,int length,char[] charArr) {	
		for(int i=0;i<length;i++) {
			if(map.containsKey(charArr[i])==false) {
				map.put(charArr[i],1);
			}else {
				int oldVal = (int)map.get(charArr[i]);
				int newVal=oldVal+1;
				map.put(charArr[i],newVal);				
			}
		}
	  }
	
	public static void findUniqueCharString(Map<Character,Integer> map,String a) {
		Set<Entry<Character,Integer>> entryset = map.entrySet();
		
		for(Map.Entry<Character, Integer> entry :entryset) {
			if(entry.getValue()>1) {
				System.out.println("All characters in string :"+a.toUpperCase()+" are not unique");
				return;
			}
		}
		System.out.println("All characters in string :"+ a.toUpperCase() + " are unique");
		
	}
	
	public static void printUniqueCharacters(Map<Character,Integer> map) {
		Set<Entry<Character,Integer>> entrySet=map.entrySet();
		System.out.println("Unique chars in string are as follows :");
		int maxValue=0;
		Character maxKey=null;
		Character once =null;
		boolean done=true;
		for(Map.Entry<Character, Integer> eachEntry:entrySet) {
			//to print all unique characters
			if(eachEntry.getValue()==1) {
				System.out.print("\t"+eachEntry.getKey());
			}
			//to print max occuring character
			if(eachEntry.getValue()>maxValue) {
				maxValue = eachEntry.getValue();
				maxKey=eachEntry.getKey();
			}
			
			//to print first non repeating character
			if(eachEntry.getValue()==1 ) {
				if(done==true) {
				once = eachEntry.getKey();
				done=false;}
			}
			
		}
		System.out.println("\nThe max occuring character is :"+maxKey+ " repeating "+maxValue+ " times");
		System.out.println("The first non repeating character is :"+once);
		 
	}

}
