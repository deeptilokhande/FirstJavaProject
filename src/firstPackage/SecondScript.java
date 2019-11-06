package firstPackage;

public class SecondScript extends FirstScript{
	
	public void displayin() {
		System.out.println("In second script display method");
	}
	
	public void fibonnaci(int first,int next,int last) 
	{
		 int result;
        if(next>=last) {
        	return;
        }else {	
        	result= first+next;
        	System.out.println("\t"+result);
        	first=next;
        	next=result;
        	fibonnaci(first,next,last);
        }
		
	}

}
