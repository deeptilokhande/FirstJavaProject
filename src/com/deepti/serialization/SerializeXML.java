package com.deepti.serialization;

import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializeXML {
	
		public static void main(String[] args) {
		Student s1 = new Student(1,"Deepti");
		Student s2 = new Student(2,"Swara");
		
		List<Student> students = new ArrayList<>();
		students.add(s1);
		students.add(s2);
		
		try {
			XMLEncoder x = new XMLEncoder(new BufferedOutputStream(new FileOutputStream("student.xml")));
			x.writeObject(students);
			x.close();	
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
