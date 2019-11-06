package com.deepti.comparable.comparator;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MainClass {

	public static void main(String[] args) {
	 
		Employee a = new Employee(1, "deepti", 12);
		Employee b = new Employee(2, "swara", 12);
		
		Employee c = new Employee(4, "prashant", 1);
		Employee d = new Employee(3, "idhika", 0);
		
		List<Employee> list = new ArrayList<>();
		list.add(a);
		list.add(b);
		list.add(c);
		list.add(d);
		//using comparator based on age
		//Collections.sort(list,new Employee());
		Collections.sort(list,(o1,o2)->o1.name.compareToIgnoreCase(o2.name));
		 
		
		// System.out.println("******compare with age using comparable***********");
		//	Collections.sort(list );
		//	 list.forEach(System.out::println);
		// System.out.println("******compare with name****************");
		//Collections.sort(list,Employee.nameComparator);
		 //list.forEach(System.out::println);
		// System.out.println("******compare with id****************");
		// Collections.sort(list,Employee.idComparator);
		// list.forEach(System.out::println);
		// System.out.println("******compare with two properties****************");
		// Collections.sort(list,Employee.twopropertiesofCompare);
		// list.forEach(System.out::println);
		 System.out.println("*********with maps******************");
		 
		 Map<Employee,Integer> map = new TreeMap<>();
		 map.put(a,1);
		 map.put(c, 2);
		 map.put(b,4);
		 map.put(d,3);
		 Set<Map.Entry<Employee, Integer>> mapentry=map.entrySet();
		 
		mapentry.forEach(System.out::println);
		
		List<? extends Object> objlist;
		List<String> strlist= Arrays.asList("a","b");
		
		objlist=strlist;
		System.out.println(objlist);
		
 
		
		GenericClass <Integer[] > as = new GenericClass<>();
		as.setVar(new Integer[] {1,2,3} );
		as.setVar2(new Integer [] {6,7,8});
		as.show();
		
		int [] arr = new int[]{2,3,4,5,6,7,8};
		 
		
		
	 
	 
		List av = new ArrayList();
		av.add(5);
		av.add("ewew");
		av.add(new Employee (1,"deep",34));
		av.add(Arrays.asList(1,2,3,5));
		
		
		Set <Object> ac = new LinkedHashSet<>();
		ac.add(4);
		ac.add("eee");
		ac.add(new Employee (1,"deep",34));
		ac.add(Arrays.asList(3,4,5));
		ac.add(null);
		ac.add(null);
		
		
		av.forEach(System.out::println);
		ac.forEach(System.out::println);
		
		GenericClass<Set<Object>> g = new GenericClass<>() ;
		//g.setVar(av);
		g.setVar2(ac);
		//g.show();

System.out.println("************");
		Map<String, String> codes = new LinkedHashMap<String, String>();
		  codes.put(null,"firstnull");
		  codes.put(null, null);
		  codes.put("X1",null);
		  codes.put("C1", "Acathan");
	
		  codes.put("S1",null);
		  codes.put(null,"null");
		  
		  Set<Map.Entry<String, String>> entryset = codes.entrySet();
		  
		  entryset.forEach(System.out::println);
		  
		  Integer val = new Integer("dd");
		  System.out.println(val);
		
		
		
	 
	}	 
	
	
	

}
