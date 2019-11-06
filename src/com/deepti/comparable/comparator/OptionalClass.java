package com.deepti.comparable.comparator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.xml.bind.annotation.XmlElementDecl.GLOBAL;

public class OptionalClass {

	
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Mark", "Howard","wsdsaassadsas","safferrerwe");
		//to check if any string in list has length > 10, then print it
		Optional<String> foundstr= list.stream().filter(str->str.length()>10).findAny() ;
		foundstr.ifPresent(System.out::println);
		System.out.println(foundstr);
		System.out.println(foundstr.orElse("no str > 10"));
		System.out.println(foundstr.orElseGet(()->"trying to elseget"));
		// System.out.println(foundstr.get());	throws no such element exception if does not contain answer
		System.out.println("***********");
		
		////to check if any string in list has length > 10, collect them all or map them n collect them
		 List<String> foundlist = list.stream().filter(str->str.length()>10).collect(Collectors.toList());
		 List<String> apendflist= foundlist.stream().map(str->str+"found you").collect(Collectors.toList());
		 
	
		 System.out.println(apendflist);
	
		 //to find even number
		 Optional<Integer> even = Optional.of(35).filter(i -> i%2==0);
		
		 even.ifPresent(System.out::println);
		 System.out.println(even.orElse(0));
		 //System.out.println(even.get());
		 
		 //use foreach to perform some operation on each element
		 
 list.stream().forEach(com.deepti.comparable.comparator.OptionalClass::addstr);
 
 // doing the same using map
 list.stream().map(s->s+" added using map").forEach(System.out::println);
		 
 //using map to convert integer to employee object list, then filter employees with id >1
 List<Employeez> e = Stream.of(1,2,3)
		 .map(com.deepti.comparable.comparator.OptionalClass::convertinttoEmployee)
		 .filter(r -> r.id >1)
		 .collect(Collectors.toList());
		 
 e.forEach(System.out::println);
 
 System.out.println("************to convert int to emp, then sort employeez***********");
 
 List<Employeez> es = Stream.of(2,1,78,43)
		 .map(com.deepti.comparable.comparator.OptionalClass::convertinttoEmployee)
		 .sorted((o1,o2)->o1.id>o2.id?1:-1)
		 .collect(Collectors.toList());
 es.forEach(System.out::println);
 
 
System.out.println("************to convert int to emp, then sort employeez,then collect min/max***********");
 
 Optional<Employeez> es1 = Stream.of(2,1,78,43)
		 .map(com.deepti.comparable.comparator.OptionalClass::convertinttoEmployee)
		 .sorted((o1,o2)->o1.id>o2.id?1:-1)
		 .min((o1,o2)->o1.id-o2.id);
 
 System.out.println(es1);
 
 
System.out.println("************to convert int to emp, then sort employeez,then count***********");
 
long count = Stream.of(2,1,78,43)
		 .map(com.deepti.comparable.comparator.OptionalClass::convertinttoEmployee)
		 .sorted((o1,o2)->o1.id>o2.id?1:-1)
		 .count();
		 
 
 System.out.println(count);
 
 System.out.println("************ convert emp obj to integer***and filter to keep only ids >20********");
 
es.stream()
		  .map(com.deepti.comparable.comparator.OptionalClass::getIdfromEmployee)
		  .filter(er -> er>20)
		  .forEach(System.out::println);
		  
 		
System.out.println("************ use reduce func***to add/mul*****");
List<Integer> il = Arrays.asList(23,24,45);

Integer sum = il.stream().reduce(1, (c,ew)->c*ew);
System.out.println(sum);

 

 System.out.println("************to convert int to emp, then to array of emp objs***********");
 //using map to convert integer to employee object  array
 Employeez[] emparr = Stream.of(30,40,70)
		 .map(com.deepti.comparable.comparator.OptionalClass::convertinttoEmployee)
		 .toArray( Employeez[]::new);
 for(Employeez ee: emparr) {
	 System.out.println(ee);
 }
 
 System.out.println("************find any***********");
 //using map to convert integer to employee obj list, then filter with id >2 and find first id >1 . this will
 //return only one id. so no list of employees. just 1 employee, that too optional
  Optional<Employeez> el = Stream.of( 5,2)
		 .map(com.deepti.comparable.comparator.OptionalClass::convertinttoEmployee)
		 .filter(m->m.id>2)
		 .findAny();
     System.out.println(el.get());
	 el.ifPresent(System.out::println);
 
	}
	
	
	
	public static Employeez convertinttoEmployee(int id){
		
		return new Employeez(id);
		
	}
	
public static void addstr(String s) {
	s = s+" added str";
	System.out.println(s);
	
}

public static int getIdfromEmployee(Employeez o) {
	return o.getId();
}
}

class  Employeez{
	
	int id;
	
	Employeez(int id){
		this.id= id;
	}
	String name ="deepti";
	
	

	public int getId() {
		return id;
	}



 



	@Override
	public String toString() {
		return String.format("Employeez [id=%s, name=%s]", id, name);
	}
	
}