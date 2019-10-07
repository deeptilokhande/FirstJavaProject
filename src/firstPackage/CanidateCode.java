package firstPackage;

import java.util.Scanner;

public class CanidateCode {

	public static void main(String[] args) {
		 
		 int[] typeOfPeople = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		 
		 
		 String testPeople = getPopulation();
		 
		 typeOfPeople= calculateMaxPopulation(testPeople,typeOfPeople);
		 
		 findOneWithMaxPopulation(typeOfPeople); 
   
  }
	
	public static String getPopulation() {
		 Scanner sc = new Scanner(System.in);
		  System.out.println("Enter a population of people in string form ");
		  String testPeople= sc.nextLine();
	       testPeople = testPeople.toUpperCase();
	     
		return testPeople;
		
	}
	
	
	public static int [] calculateMaxPopulation(String testPeople,int [] typeOfPeople) {
		
		 int size = testPeople.length();
		  for(int i=0;i<size;i++){
	           int index = testPeople.charAt(i)-65;
            //check only for character types between A to Z
             if(!(index <0||index>25)){
	           if(typeOfPeople[index]==0)
	           typeOfPeople[index]=1;
	           else
	           typeOfPeople[index] +=1;
             }
	       }
		return typeOfPeople;
	}
	
	
	public static void findOneWithMaxPopulation(int [] typeOfPeople) {
		  int max=0;
	       char x=' ';
         int maxi=0;
	   
	       for(int i=0;i<26;i++){
	           if(typeOfPeople[i]>max){
	            max=typeOfPeople[i];   
                maxi=i;
	            x= (char)(i+65);
	           }else if(typeOfPeople[i]==max){
                 if(maxi<i){
                    max=typeOfPeople[i];
                    maxi=i;}
             }
	       }

	       System.out.println("The max is "+ max);
	       System.out.println("The type of people is "+x );
	}
}
