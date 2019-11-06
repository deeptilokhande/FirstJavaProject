package firstPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PalindromeCheck {

	public static void main(String[] args) {
		
		String input = "deeepti";
		input=input.toLowerCase();
		
		/*char[] charArray= input.toCharArray();
		char[] resultArray=new char[charArray.length];
		int j=0;
		 for(int i=charArray.length-1;i>=0;i--) {
			 resultArray[j]=charArray[i];
			 j++;
		 }
		System.out.println(resultArray );
		
		
		if(String.valueOf(charArray).equals(String.valueOf(resultArray)))
			System.out.println("String is palindrome");*/
			
			StringBuilder sb = new StringBuilder(input);
			String reverse = sb.reverse().toString();
			if(input.equals(reverse))
				System.out.println("Palindrome");
			else System.out.println("Not palindrome");
		
		boolean result =checkPalindrome(input);
		
		if(result==true)
			System.out.println("The string is palindrome");
		else
			System.out.println("String is not palindrome");


	}
	
 public static boolean checkPalindrome(String input) {
		int length= input.length();
		System.out.println(length);
		for(int i=0;i<length/2;i++) {
				if(input.charAt(i)!=input.charAt(length-1-i)) {
					return false;
				}
		}
		
		return true;
		
	}

}
