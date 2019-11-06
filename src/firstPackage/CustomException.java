package firstPackage;

import java.util.Scanner;

public class CustomException {
	
	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a no less than 100 :");
		int noI =sc.nextInt();
		try {
			validateInput(noI);
		} catch (InvalidInputException e) {
			System.out.println("Caught exception, input > 100");
		}
		
	 }
	 
	 
	 static void validateInput(int no) throws InvalidInputException{
			if(no>100) {
				throw new InvalidInputException("Invalid Input >100");
		}else {
			System.out.println("Input is valid");
		}
			
	}

}



class InvalidInputException extends Exception{
	public InvalidInputException(String exceptionText) {
		 System.out.println(exceptionText);
	}
	
}