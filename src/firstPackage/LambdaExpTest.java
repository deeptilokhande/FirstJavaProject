package firstPackage;
public class LambdaExpTest{
	public static void main(String[] args) {
		MainClass m = new MainClass();
	    LambdaExpTesti l = m.t;
	    l.show();
 	     m.show();
		 
	}
	
}
interface LambdaExpTesti {
	
	 /*default void show() {
		System.out.println("Default methods valid in interface");
	} */
	void show();

}


  class MainClass implements LambdaExpTesti {

	LambdaExpTesti t = ()->  System.out.println("In anonymous class");
	
 public void show() {
		// TODO Auto-generated method stub
		System.out.println("In show of interface");
	}  
	
	
	 
}
  
  
