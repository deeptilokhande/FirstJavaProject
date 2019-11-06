package firstPackage;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StreamAPI {
	
	


	public static void main(String[] args) {
		
		Map<String,Integer> names = new HashMap<>();
		names.put("Deepti",1);
		names.put("Swara",1);
		names.put("Prashant",1);
		names.put("Rwt",1);
		
		 
	 Set<Map.Entry<String,Integer>> mapentryset = names.entrySet(); 
		
	 mapentryset.stream()
	 .filter(firstPackage.StreamAPI::vowelmatch)
	 .forEach(System.out::println);
		
	}
	
	
	public static boolean vowelmatch(Map.Entry<String, Integer> entry) {
		if (entry.getKey().contains("a")||entry.getKey().contains("e"))
			return false;
		return true;
	}
 
}
