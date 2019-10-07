package firstPackage;

//import com.test.child.InvalidInputException;

public class Fibonnaci {
static int sum;
	public static void main(String[] args) {
		
		 InvalidInputException y = new InvalidInputException(null);
		fiboFor(20);
		System.out.println("\n");
		System.out.print("\t"+"0"+"\t"+"1");
		fiborecursive(0,1,20);

	}

	public static void fiboFor(int i) {
		int sum = 0;
		int num1 = 0;
		int num2 = 1;
		System.out.print("\t" + num1 + "\t" + num2);
		for (int j = 0; j < i; j++) {

			sum = num1 + num2;
			num1 = num2;
			num2 = sum;
			System.out.print("\t" + sum);
		}

	}
	
	public static void fiborecursive(int num1,int num2,int i) {
		if(i>=1)
		{	
		sum=num1+num2;
		System.out.print("\t"+sum);
		fiborecursive(num2,sum,i-1);
		}
		
	}
}
