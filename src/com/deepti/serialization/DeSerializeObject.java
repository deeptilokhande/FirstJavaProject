package com.deepti.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import firstPackage.SaveObject;

public class DeSerializeObject {
	
	public static void main(String[] args) {
		 
		try(FileInputStream fis = new FileInputStream("serial.txt")) {
			
			SaveObject s = null;
			//fis = new FileInputStream("serial1.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			s=(SaveObject) ois.readObject();
			
			System.out.println(s);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	 
	}

}
