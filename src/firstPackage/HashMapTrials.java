package firstPackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapTrials {
	
	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<>();
		map.put(1,"one");
		map.put(2,"two");
		map.put(3,"three");
		map.put(4,"four");
		
		map.forEach((key,value)->{
			System.out.print(key);
			System.out.println(" "+value);
		});
		
	//streams(map);

}
	
	public static void streams(Map<Integer,String> map) {
		map.entrySet().stream().forEach(e->{
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		});
	}
	
}
