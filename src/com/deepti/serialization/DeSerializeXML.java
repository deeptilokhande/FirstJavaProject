package com.deepti.serialization;

import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

public class DeSerializeXML {
	
	public static void main(String[] args) {
		List<Student> students;
		
		try {
			XMLDecoder x = new XMLDecoder(new BufferedInputStream(new FileInputStream("student.xml")));
			students = (List<Student>) x.readObject();
			
			for(Student ss : students) {
				System.out.println(ss);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
