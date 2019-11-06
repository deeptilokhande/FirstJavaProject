package firstPackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateChars {

	public static void main(String[] args) {

		String toBeChecked = "SILLYSPIDERS";
		char toBeCheckedCharArray[] = toBeChecked.toCharArray();
		int size = toBeCheckedCharArray.length;

		Map<Character, Integer> lmap = new  LinkedHashMap<>();

		for (int i = 0; i < size; i++) {
			if (lmap.containsKey(toBeCheckedCharArray[i]) == false) {
				lmap.put(toBeCheckedCharArray[i], 1);
			} else {
				int oldVal = lmap.get(toBeCheckedCharArray[i]);
				int newVal = oldVal + 1;
				lmap.put(toBeCheckedCharArray[i], newVal);
			}
		}
		
		//System.out.println("HashMap Created");
		Set<Entry<Character, Integer>>  itermap = lmap.entrySet();
		StringBuilder sb=new StringBuilder();
		for(Map.Entry<Character,Integer> entry : itermap) {
			
			sb = sb.append(entry.getKey());
			if(entry.getValue()>1) {
				toBeChecked = toBeChecked.replace(entry.getKey(), '*');
			System.out.print("Key :"+entry.getKey());
			System.out.println(" Value :"+entry.getValue());}
			
			if(entry.getValue()>1) {
				toBeChecked = toBeChecked.replace(entry.getKey(), '*');}
		}
		System.out.println("String without dup chars is : "+sb.toString());
			
			System.out.println("String without dup chars is : "+toBeChecked );
		
		System.out.println("********************************");
		
		for(Character c:lmap.keySet()) {
			System.out.print("Key :"+ c);
			System.out.println(" Value :"+lmap.get(c));
		}
		
		Set keySet = lmap.keySet();
		Iterator it = keySet.iterator();
		System.out.println("********************************");
		while(it.hasNext()) {
			Character key=(Character)it.next();
			Integer value = lmap.get(key);
		
			System.out.print("Key :"+ key);
			System.out.println(" Value :"+ value);
			
		}
		
		System.out.println("****************67****************");
		Set <Character> keyCharSet = lmap.keySet();
		for(Character key : keyCharSet){
			System.out.print("Key :"+ key);
			System.out.println(" Value :"+ lmap.get(key));
		}
		

	}

	}
