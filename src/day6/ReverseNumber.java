package day6;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) 
	{
		// Reverse number 1234 to 4321
		// There are three ways to reverse number
		// You have to import the scanner first
		
	     Scanner sc=new Scanner(System.in);
	     System.out.println("Enter a number");
	     
	     int num=sc.nextInt();
	     
	     // Approach 1: Using algorithm
	      
	     /*int rev=0;
	     
	     while(num!=0)
	     {
	    	 rev=rev*10 + num%10; // (1) 0*10 + 1234%10 = 0 + 4 = 4, (2) 4*10 + 123%10 = 40+3=43, (3) 43*10 + 12%10 = 432, (4) 432*10 + 1%10 = 4320+1 = 4321
	    	 num=num/10;          // (1) 1234/10 = 123, (2) 123/10=12, (3) 12/10=1, (4) 1/10 = 0
	     }
	        
	      System.out.println("Reverse number is:"+rev);*/
	      
	      // Approach 2: Using StringBuffer class
	     
	     /*StringBuffer sb=new StringBuffer(String.valueOf(num));
	     StringBuffer rev=sb.reverse();
	     System.out.println("Reverse number is:"+rev);*/
	     
	     // Approach 3: Using StringBuilder class
	     
	     /*StringBuilder sb1=new StringBuilder();
	     sb1.append(num);
	     StringBuilder rev=sb1.reverse();
	     System.out.println("Reverse number is:"+rev);*/
	     
	     
	     
	     
	     
	     
	   

	}

}
