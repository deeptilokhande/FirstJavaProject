package firstPackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DuplicateStringWords {
	
	
	public static void main(String [] args) {
		//findduplicateWord();
		Map<String,Integer> mmap = new HashMap<>();
		mmap.put("Deepti", 2);
		mmap.put("Prashant", 2);
		mmap.put("Swr", 2);
		
		List<String> keysToremove = new ArrayList<String>();
		mmap.forEach((k, v) -> {
			     if(k.contains("a")|| k.contains("e")||k.contains("i")||k.contains("o")||k.contains("u")) {
			    	 keysToremove.add(k);
			     }
		});
		
		for(String a: keysToremove) {
			mmap.remove(a);
		}
		
		
		//mmap.forEach((k,v)-> System.out.println(k));
		
		//mmap= findduplicateChar();
		//removeVowels(mmap);
	
	}
	
	public static void findduplicateWord() {
		String str = "I love developing android android apps is a is a is a";
		
		String [] strarray = str.split(" ");
		Map<String,Integer> map = new HashMap<>();
		
		for(String s : strarray) {
			
			if(map.containsKey(s)) {
				map.put(s,map.get(s)+1);
			}
			else 
				map.put(s, 1);
		}
		
		Set<String> keyOfmap = map.keySet();
		for(String key : keyOfmap) {
			if(map.get(key) >1) {
				System.out.println("The key "+ key + " occured "+ map.get(key) + " times");
			}
		}
	}
	
	
	public static Map findduplicateChar() {
		String str = "gfjdusffdfdsfdseadffidkjjojj";
		char [] strArray = str.toCharArray();
		Map<Character,Integer> map = new HashMap<>();
		
		for(char a : strArray) {
			if(map.containsKey(a)) {
				map.put(a,map.get(a)+1);
			}
			else
				map.put(a,1);
		}
		
		
		Set<Character> keyset = map.keySet();
		
		for(Character c : keyset) {
			if(map.get(c)>1) {
			//	System.out.println("The key "+ c + " occured "+ map.get(c) + " times");
			}
		}
		
		return map;
		
	}
	

	public static void removeVowels(Map map) {
		
		HashMap mmap = (HashMap) map;
		Set<Character> keyset = map.keySet();
	   List <Character> result = new ArrayList<>();
	   
	 
	 
	   result.addAll(keyset);
	   
	   for(Character c : result ) {
		  
		   if(c.equals('a')||c.equals('e')||c.equals('i')||c.equals('o')||c.equals('u')) {
			   mmap.remove(c);
		   }
		   
	   }
	   
	   Set<Character> finalt= mmap.keySet();
	   for(Character c : finalt) {
		   System.out.println("The retained characters are : "+ c);
		   
	   }
		
		
		 
	
		
	}
	
	

}
