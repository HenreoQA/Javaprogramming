package day6;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) 
	{
		// Palindrome number: Is the number that remains the same when it's digits are reversed.
        // Palindrome number is when the reverse number is the same with the original number.
		// Example: input = 121
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		
		int num=sc.nextInt();
		
		int org_num=num;
		
		/*int rev=0;
		
		while(num!=0)
		{
			rev=rev*10 + num%10;
			num=num/10;
		}
	    if(org_num==rev)
	    {
	    	System.out.println(org_num+" palindrome number");
	    }
	    else
	    {
	    	System.out.println(org_num+" Not palindrome number");
	    }*/
	}

}
