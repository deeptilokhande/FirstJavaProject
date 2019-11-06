package firstPackage;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class PrintPattern {
	
	public static void main(String[] args) {
		
	
		
		Map<String,String> trymap = new HashMap<>();
		
		trymap.put("Deepti", "Prashant");
		trymap.put(null, "Swara");
		trymap.put("Deepti", "dsakjfha");
		
		Set<Entry<String, String>> sett = trymap.entrySet();
		for(Map.Entry<String, String>  a: sett) {
			System.out.println(a);
		}
		
	
	
		//print 1,2,3,4 in cyclical pattern 4 times
		/*int j=0;
		for(int i=1;i<=4;i++) {
			for(j=1;j<=4;j++) {
				int k=i+j-1;
				if(k>4) {
					System.out.print(k-4+" ");
				}else
				 System.out.print(k+" ");
			}
	
			System.out.println();
		}*/
		//print 0,1 in triangle
		 
		for(int i=1;i<5;i++) {
			for(int j=1;j<=i;j++) {
				 if((i+j)%2==0)
					 System.out.print("1 ");
				 else
					 System.out.print("0 ");
				
				
			}
			System.out.println();
		}
		
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		
		int num1=1,num2=1;
		int sum=0;
		System.out.print("1 1");
		for(int i=1;i<15;i++) {
			sum = num1+num2;
			System.out.print(" "+sum);
			num1=num2;
			num2=sum;
		}
		
		
		String str = "lirfsdsgril";
		char[] strar = str.toCharArray();
		int i=0;
		int size = str.length();
		while(i<size) {
			if(strar[i]==strar[size-i-1]) {
				
			}else
			{
				System.out.println("\nNot palindrome");
				System.exit(0);
			}
			i++;
				
		}
		System.out.println("\nPalindrome");
		
		
		
		
		
	}

}
