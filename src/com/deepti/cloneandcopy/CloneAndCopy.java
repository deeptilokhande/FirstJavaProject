package com.deepti.cloneandcopy;

public class CloneAndCopy {
	
	//to check out clone 

	public static void main(String[] args) {
		 Dog a = new Dog();
		 a.id=1;
		 a.name="Bud";
		 System.out.println("************shallow copy after changes ***************");
		 System.out.println("Dog a : "+ a.id + " "+ a.name);
		 //shallow copy 
		 Dog b=a;
		
		
		 System.out.println("Dog b : "+ b.id + " "+ b.name);
		 b.name="Tria";
		
		 System.out.println("************after changes ***************");
		 System.out.println("Dog b : "+ b.id + " "+ b.name);
		 System.out.println("Dog a : "+ a.id + " "+ a.name);
		 
		 //Deep copy
		 Dog c= new Dog();
		 c.id=a.id;
		 c.name=a.name;
		 System.out.println("************Deep copy***************");
		 System.out.println("Dog c : "+ c.id + " "+ c.name);
		 System.out.println("Dog a : "+ a.id + " "+ a.name);
		 c.name="Grit";
		 System.out.println("************after changes ***************");
		 System.out.println("Dog c : "+ c.id + " "+ c.name);
		 System.out.println("Dog a : "+ a.id + " "+ a.name);
		 
		 //Deep copy by passing object as constructor
		 
		 Dog d = new Dog(a);
		 System.out.println("************Object const ***************");
		 System.out.println("Dog d : "+ d.id + " "+ d.name);
		 System.out.println("Dog a : "+ a.id + " "+ a.name);
		 System.out.println("************after changes ***************");
		 d.name="Hemley";
		 System.out.println("Dog a : "+ a.id + " "+ a.name);
		 System.out.println("Dog d : "+ d.id + " "+ d.name);
		 
	}

}


class Dog{
	Dog a;
	public Dog() {
		
	}
	public Dog(Dog a) {
		this.a =a;
		this.id=a.id;
		this.name=a.name;
	}
	int id;
	String name;
	
}
