package com.deepti.socketProgramming;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.*;

public class SocketDemoClient {
	
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket s = new Socket("localhost",9999);
		DataOutputStream dos = new DataOutputStream(s.getOutputStream());
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			String so = br.readLine();
			dos.writeUTF(so);
			if(so.equalsIgnoreCase("exit"))
				break;
		}
		s.close();
		
	}
	
	
	
 
}
