package firstPackage;

public class MainMethod {
		
	public MainMethod() {
		System.out.println("This is main method constructor");
	}
	
	public static void main(String[] args) {
		MainMethod c = new MainMethod();
		FirstScript a = new FirstScript();
		a.display();
		FirstScript b =new SecondScript();
		((SecondScript)b).displayin();		
		System.out.print(addnumbers(199,2.1));
	  ((SecondScript)b).fibonnaci(0,1,10);
	}
	
	public static double addnumbers(int a, double b) {
		
		double c =  a+b;
		int d = (int) c;
		System.out.println("Typecasted from double to int :"+d);
		return a+b;

	}

}
