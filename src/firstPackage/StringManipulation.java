package firstPackage;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StringManipulation {
	static Scanner sc = new Scanner(System.in);
	static String main;
	static boolean correct = false;

	public static void main(String[] args) {
		//System.out.println("Main :" + main);
		//System.out.println("Main :" + StringManipulation.main);
	
		
		 System.out.print("\nPlease enter string that is a number ");	
		 String input = sc.next();
		
		
	
		 //convert   integer to String
		
		try {
			System.out.print("Please enter  integer   ");
			int secondInput = sc.nextInt();
		
		 String newStr = Integer.toString(secondInput);
		 System.out.println(newStr);
		} 
		 catch(InputMismatchException e) {
			 System.out.println("Cannot use alphabets, use integer only");
		 }
		 
		 //convert string to integer
		 try {
			
				
			 int newInt = Integer.parseInt(input);
		 System.out.println(newInt);}
		 catch(NumberFormatException e) 
		 {
			 System.out.println("\nCannot enter alphabets, use numbers only as string");
		 }
		 
		 
		
		
		 System.out.println( StringReversal.reverseAString("dsjad"));	
		
		/*  while(secondInput.length()>1) {
			 System.out.print("\nPlease enter 2nd string :Only 1 character: "); 
			 secondInput = sc.next();
		 }*/
		//System.out.print("\nOutput is :");
		/*
		 * using third variable String temp=""; temp=input; input=secondInput;
		 * secondInput=temp;
		 */
		/* without using third variable
		int firstlength = input.length();
		int secondLength = secondInput.length();
		input = input + secondInput;
		secondInput = input.substring(0, firstlength);
		input = input.substring(firstlength);
		System.out.println("First string after swap :input: " + input);
		System.out.println("Second string after swap :secondinput: " + secondInput);

		// to split string
		String[] inputArray = input.split(" ");
		System.out.println("No of words in string are : " + inputArray.length);*/
		
		/*String newString = input.concat(input);
		if(newString.contains(secondInput)) {
			System.out.println("The second string is rotational");
		}else {
			System.out.println("The second string is not rotational");
		}*/
		 //to delete all occurances of char or string from String using inbuilt function
		// String out = input.replaceAll(secondInput,"");
		// System.out.println("Output is :" + out);
		 
		/* //delete all occurances of character from string without using inbuilt functions
		 char[] secondArr = input.toCharArray();
		 char key=secondInput.charAt(0);
		 String out="";
		 int length= secondArr.length;
		 for(int i=0;i<length;i++) {
			 if(key!=secondArr[i]) {
				 out=out+secondArr[i];
			 }
		 }
		 System.out.println("Output is :" + out);*/
		 
		
		

	

}
	
}
