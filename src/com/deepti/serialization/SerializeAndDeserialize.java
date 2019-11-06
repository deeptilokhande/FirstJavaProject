package com.deepti.serialization;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeAndDeserialize  {
	 
	public static void main(String [] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		createSerializedObject();
		decreateSerializedObject();
	}

	
	private static void createSerializedObject() throws FileNotFoundException, IOException {
		
		Address address = new Address("clinton st","denver","80112");
		Employee e = new Employee(1, "Deepti", address);
		File savedFile = new File("savedObj.txt");
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(savedFile));
		oos.writeObject(e);
		System.out.println("Object serialized");
		
	}
	
	
	private static void decreateSerializedObject() throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("savedObj.txt"));
		 
		Object o =   ois.readObject();
		 Employee e =  (Employee) o;
		 System.out.println(e.getAddress().getAdressline1());
		System.out.println(e);
		
	}
}
