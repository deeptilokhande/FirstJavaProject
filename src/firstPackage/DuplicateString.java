package firstPackage;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.BiConsumer;

import com.deepti.interfacetrial.TryClass;
import com.deepti.interfacetrial.TryInterface; 

public class DuplicateString {
	
	public static void main(String[] args) {
		DuplicateString dp = new DuplicateString();
		dp.duplicateString("This is is a duplicate a string a string a");
	
	}

	
	public void duplicateString(String str){
		LinkedHashMap <String,Integer> store = new LinkedHashMap<>();
		
		String[] splitarray = str.split(" ");
		
		for(String each : splitarray) {
			if(store.containsKey(each)==false)
			store.put(each, 1);
			else
				store.put(each, store.get(each)+1);
		}
		
		returnOccurances(store);
				
	}
	
	public void returnOccurances(HashMap<String,Integer> store) {
		
		/*Set<Map.Entry<String,Integer>> hmap = store.entrySet();
		
		for(Map.Entry<String, Integer> data:hmap) {
			if(data.getValue()>1)
				System.out.println("Duplicate string :"+ data.getKey());	
		}*/
		
	/* Set<String> keySet = store.keySet();
	 for(String key : keySet) {
		 if(store.get(key)>1) {
			 System.out.println("Duplicate string :"+ key);
		    System.out.println("It occured "+ store.get(key) +" times!");}
	 }
	 
	 
	 Collection<Integer> valueSet = store.values();
	 for(Integer value : valueSet) {
		 if(value>1) {
			 //for just values.. no keys
		 }
	 }*/
	 
	 
	 store.forEach( new BiConsumer<String,Integer>(){

		@Override
		public void accept(String t, Integer u) {
			
			if(u>1) {
			 System.out.println("Duplicate string :"+ t);
			    System.out.println("It occured "+ store.get(u) +" times!");}
		}
	 });	
	}


	 
	
}
