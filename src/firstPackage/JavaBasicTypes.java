package firstPackage;

import java.math.BigInteger;

public class JavaBasicTypes {
	
	public static void main(String[] args) {
		
		
		 for(int i=0;i<=127;i++) {
				System.out.printf("%d : %c\n",i,i);
			}
		
		byte b = 16;
		System.out.println("byte : "+b );
		
         b=  (byte)( b * 16);
      
		System.out.println("byte : "+b);
		
		b *= 14;
		System.out.println("byte : "+b );
		
		long i = 0B01011_010;
		System.out.println("Int : "+i);
		
		int ii =5;
		System.out.println(ii);
		
		++ii;
		System.out.println(ii);
		
		int j =  ii+2;
		System.out.println(ii);
		
		int aa = 3;
		int bb = 4;
		int c=aa & bb;
		System.out.println(c);
		
		boolean a = true;
		boolean d = true;
		if(!a|d) {
			System.out.println("true is ");
		}
		
		
		int g = 6;
		int h = g>>2;
		System.out.println(h);
		
	 double nn =  6;
	 int mm =   7 ;
	 System.out.println(nn+mm); // int upgraded to double  
	 
	 float fl = 7.0f;
	 double fg =7;
	 double ty=(double)(fl+fg);
	 
	 System.out.println(ty); 
	 char ch = 'A';
	 int z = ch;
	 System.out.println(z);
	 
	 
	 //int hit = t;
	 System.out.println(z=='A'?"wow":"oh no");
	 
	 Object first;
	 
	 if(true) {
		 first=new Integer(10);
	 }else {
		 first=new Double(20.0);
	 }
	 System.out.println(first);
	 
	 
	 //use ternary operator instead
	 System.out.println(true?new Integer(10):new Double(20));
	 
	 int gh=78;
	 for(;gh<=82;) {
		 System.out.println(gh);
		 gh+=2;
	 }
	 
	
		
	}
	
	
	
	

}
