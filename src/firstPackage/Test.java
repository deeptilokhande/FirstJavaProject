package firstPackage;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
	public static void main(String[] args) {
		
		
		FuncInterface f = new FuncInterface() {
			@Override
			public void show(int i) {
				System.out.println("Show method of func interface called "+ i);
			}
		};
		
	    f.show(7);
		
		FuncInterface lambda = (i)->  System.out.println("Show method of func interface called as lambda" + i);
		lambda.show(6);
		
	 List<String> l =   Arrays.asList("a","b","c","e","i","b","i");
	 System.out.println(l.set(6, "set"));
	 System.out.println(l);
	 
	List r= l.stream().filter(item->!item.contains("set")).collect(Collectors.toList());
	System.out.println(r);
		
		if (l.contains("a"))
			System.out.println("a is present");
		
	 
	}
	

	
	

}
