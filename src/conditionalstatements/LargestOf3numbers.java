package conditionalstatements;

public class LargestOf3numbers {

	public static void main(String[] args) 
	{
		// Largest and smallest of numbers using if else condition:
		
		// Example1: Find the largest among the three numbers a,b,c
		// a is largest if a>b and a>c ---- both conditions have to be true
		// b is largest if b>a and b>c ---- both conditions have to be true
		// c is largest if c>a and c>b ---- both conditions have to be true
		
		int a=100, b=200, c=300;
		
		if(a>b && a>c)
		{
			System.out.println("a is largest number");
		}
			
		else if(b>a && b>c)
		{
			System.out.println("b is largest number");	
		}
			
		else
		{
			System.out.println("c is largest number and the value of c is:"+c);
		}
		
		// Example2: . Find the largest of 2 numbers(x and y) by using if else conditions
		// where x=1000, y=2000
		
		int x=1000, y=2000;
		
		if(x>y)
		{
			System.out.println("x is the largest number which is 1000");
		}
		else
		{
			System.out.println("y is the largest number which is 2000");	
		}
		
		// Example3:  Find the smallest of 3 numbers by using if else condition, given  
		// a=2000, b=1000, c=5000
		
		int a1=2000, b1=1000, c1=5000;
		
		if(a1<b1 && a1<c1)
		{
			System.out.println("a1 is the smallest number and the value is:" +a1);
		}
		else if(b1<a1 && b1<c1)
		{
			System.out.println("b1 is the smallest number and the value is:" +b1);
		}
		else
		{
			System.out.println("c1 is the smallest number and the value is:" +c1);
		}
 
	} 

}
