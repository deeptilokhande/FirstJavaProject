package firstPackage;

public class Factorial {

	public static void main(String[] args) {
		
		factorial(8);
	int r= recursivefactorial(8);
	System.out.println(r);
	}
	
	public static void factorial(int n) {
		int sum=1;
		for(int i=1;i<=n;i++) {
			sum = sum*i;
		}
		System.out.println(sum);
	}
	
	public static int recursivefactorial(int n ) {
		 if(n==0)
			 return 1;
		 else
			 return  (n*recursivefactorial(n-1));
		 
	}
}
