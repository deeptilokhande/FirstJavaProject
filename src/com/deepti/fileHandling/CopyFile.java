package com.deepti.fileHandling;

import java.io.*;

public class CopyFile {
	
	
public static void main(String[] args) throws IOException {
	
	//First Create a new File, put some data in it
	//Or if file is existing, just appending the data
	File f = new File("Original.txt");
    //FileOutputStream fos = new FileOutputStream(f);
    FileWriter fw = new FileWriter(f,true);
    PrintWriter pw = new PrintWriter(fw);
    pw.write("\nThis is line 1");
    pw.write("\nThis is line 2");
    pw.append("\nThis is line 3");
    pw.print("\nThis is line 4");
    pw.println();
    pw.println("This is line 5");
    pw.close();
    System.out.println("Done creating n writing to file");
    
    
    //copy contents of original.txt to copy.txt
    FileWriter fwc = new FileWriter("Copy.txt",true);
    PrintWriter pwc = new PrintWriter(fwc,true);
    
    BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("Original.txt")));
    BufferedReader br2 = new BufferedReader(new InputStreamReader(new FileInputStream("Original2.txt"))); 
		
 
    String line=br.readLine();
    String line2=br2.readLine();
    
    while( line!=null | line2!=null ) {
    	
    	if(line!=null)  
    	   pwc.println(line);
    	
    	if(line2!=null)
    		pwc.println(line2);
    	
    		line=br.readLine();
    		line2=br2.readLine();
    }
   
    br.close();
    br2.close();
    
    
	
}

}
