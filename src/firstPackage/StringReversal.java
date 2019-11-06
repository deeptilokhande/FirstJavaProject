package firstPackage;

public class StringReversal {
	
	public static void main(String[] args) {
		
		
		try {
			exceptionHandler();
			
		}catch(MyException e) {
			
			System.out.println("Handled exception by main"+ " "+ e.getMessage());
		}
		finally {
			System.out.println("Still finally in but main executed");
		}
		
		
		swapAString("one","two");
		
		if(System.out.printf("print if ")==null) {
			
		} 
		String x= "StringReversal Practice";
		//to reverse a string
		String r = reverseAString(x);
		System.out.println("Reversed String is "+String.valueOf(r));
		
		
		//to check palindrome;
		x="li  r il";
		checkAPalindrome(x);
		int length=x.length();
		String result =checkAPalindrome(x,length);
		System.out.println(result);
		
		//to convert lower to upper case;
		convertcase("lower case characters");
		
	}
	
	public static String reverseAString(String a) {
		int size = a.length();
		char[] input = a.toCharArray();
		int j=0;
		char[] result =new char[size];
		for(int i=size-1;i>=0;i--){
			result[j]=input[i];
		    j++;
		}
		return String.valueOf(result);
	}
	
	public static void swapAString(String one,String two) {
		System.out.println("Before swapping");
		System.out.println("One :"+ one +" Two :"+ two);
		
		int len1 = one.length();
		int len2 =two.length();
		one = one + two;
		two = one.substring(0,len1 );
		one = one.substring(len2);
		System.out.println();
		
		System.out.println("After swapping");
		System.out.println("One :"+ one +" Two :"+ two);
		
	}
	
	public static void exceptionHandler() throws MyException {
		 System.out.println("Inside exception Handler method");
		 throw new MyException(8);
		
	}
	
	public static void checkAPalindrome(String input) {
	 	
		input=input.replaceAll(" ","");
		input=input.toLowerCase();
		
		String reverse = reverseAString(input);
		
		if(input.equals(reverse)) {
			System.out.println("Palindrome");
		}else
			System.out.println("Not a palindrome");
	 
	/*	char[] ia = input.toCharArray();
		char[] ra = reverse.toCharArray();
		int i=0;
		int size =ia.length;
		while(i<size) {
		if (ia[i]!=ra[i]) {
			System.out.println("Not a palindrome");
			return;
		} else {
			i++;
		}
		
		}
		System.out.println("Palindrome");*/
				 
	}
	
	public static String checkAPalindrome(String input,int length) {
		input=input.replaceAll(" ","");
		input=input.toLowerCase();
		length=input.length();
		char[] inputa = input.toCharArray();
		for(int i=0;i<length;i++) {
			if(inputa[i]==inputa[length-i-1]) {
				
			} else
			{
				return "Not a Palindrome2";
			}
		}
		
		return "Palindrome2";
		
	}
	
	//convert lower case to uppercase
	
	public static void convertcase(String lcase) {
		char[] lcasear = lcase.toCharArray();
		int length=lcase.length();
		int i=0;
		while(i<length) {
			if(lcasear[i]!=' ') {
			lcasear[i]=(char)(lcasear[i]-32);
			}
			i++;
		}
		System.out.println("uppercase string is " + String.valueOf(lcasear));
	}

}


 class MyException extends Exception {
	MyException(int i){
		System.out.println("Exception no is :"+i);
	}
	
}