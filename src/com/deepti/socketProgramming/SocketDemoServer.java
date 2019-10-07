package com.deepti.socketProgramming;

import java.io.*;

import java.net.*;

public class SocketDemoServer    {
	public static void main(String[] args) throws IOException {
		  ServerSocket s = new ServerSocket();
		  Socket ss = s.accept();
		  System.out.println("connected!");
		  DataInputStream dis = new DataInputStream(ss.getInputStream());
		  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		  
		  while(true) {
			  String yu = dis.readUTF();
			  System.out.println("client :"+yu);
			  if(yu.equalsIgnoreCase("exit"))
				  break;
		  }
		  ss.close();  
	}
}
