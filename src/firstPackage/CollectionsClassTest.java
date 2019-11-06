package firstPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsClassTest {
	
	
	
	public static void main(String[] args) {
		List<String> nameList = new ArrayList<>(Arrays.asList("amy","ziara","beena","kitar","golina","Beena"));
		
		System.out.println("The list is "+ nameList);
		
		Collections.sort(nameList);
		System.out.println("Alphabetic list "+ nameList);
		
		Collections.reverse(nameList);
		System.out.println("Reverse list "+ nameList);
		
		Collections.shuffle(nameList);
		System.out.println("Shuffle list "+ nameList);
		

		int freq= Collections.frequency(nameList, "beena");
		System.out.println("Frequency of beena "+ freq);
	}

}
