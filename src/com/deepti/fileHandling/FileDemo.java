package com.deepti.fileHandling;

import java.io.*;

public class FileDemo {

	public static void main(String[] args) {

		try {

			// Trying to write to a file using printwriter
			//FileOutputStream fos = new FileOutputStream("first.txt");
			PrintWriter pw = new PrintWriter("first.txt");//can take file name or outputstream
			pw.println("Hurray !!! This is my first timw writing in my own file...");
			pw.flush();
			pw.close();

			
			// Trying to write to a file using bufferedwriter
			FileWriter fw = new FileWriter("first.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			bw.append("Hurray !!! This is my first timw writing in my own file...this is again appending it");
			bw.close();
			
			
			//To read data from file using buffered reader
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("first.txt")));
			String line=null;
			while((line=br.readLine())!=null) {
				System.out.println(line);	
			}
			br.close();
			
			//To read data from file using inputstream;
			FileInputStream fis = new FileInputStream("first.txt");
			InputStreamReader isr = new InputStreamReader(fis);
			int read =  0;
			while((read=isr.read()) !=-1) {
				System.out.print((char)read);
				
			}
			

		} catch (FileNotFoundException e) {
			System.out.println("Unable to find the file");
		}
		catch(IOException e) {
			System.out.println("Some error in IO operation!");
		}

	}

}
