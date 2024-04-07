package conditionalstatements;

public class NestedIfElseCondition {

	public static void main(String[] args) 
	{
	  // Nested if else - Is only used when the condition is true. The statement is 
	  // executed only if the condition is true.
	  // If condition enters the block only if the condition is true.
	  // This is used when if condition is having another if condition or when there 
	  // are multiple if conditions.

	  // Syntax for nested if else is stated below:

             /*if(true)
             {
               statements;
             }*/
		
		// Example1
		
		    if(true)
			{
		      if(true)
		    {
		    	System.out.println(123);	
		    }
			 
		    else
		    {
		      System.out.println("abc");
		    }
			}
		
		// Example2
	
		if(1==1)
		{
			if(true)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("false");
		}
		}
		
		// Example3
		
		if(1==2)
		{
			if(true)
		{
		  System.out.println("True");	
		}
		else
		{
			System.out.println("false");
		}
		}
		
		// Example4 --- Print week name by taking week number (1-7) using nested
		// if else condition
		
		int weekno=1;
		
		if(weekno==1)
		{
			System.out.println("Sunday");
		}
		else if(weekno==2)
		{
			System.out.println("Monday");
		}
		else if(weekno==3)
		{
			System.out.println("Tuesday");
		}
		else if(weekno==4)
		{
			System.out.println("Wednesday");
		}
		else if(weekno==5)
		{
			System.out.println("Thursday");
		}
		else if(weekno==6)
		{
			System.out.println("Friday");
		}
		else if(weekno==7)
		{
			System.out.println("Saturday");
		}
		else
		{
			System.out.println("Invalid weekno");
		}
		
		// Example5: Find the smallest of 3 numbers by using if else condition, given  
		// a=2000, b=1000, c=5000
		
		int a=2000, b=1000, c=5000;
		
		if(a<b && a<c)
		{
			System.out.println("a is the smallest number");
		}
		else if(b<a && b<c)
		{
			System.out.println("b is the smallest");
		}
		else
		{
			System.out.println("c is the smallest");
		}
		
		// Example 6:  Print month name by taking month number(1-12)
		
		int month_no=2;
		
		if(month_no==1)
		{
			System.out.println("January");
		}
		else if(month_no==2)
		{
			System.out.println("February");
		}
		else if(month_no==3)
		{
			System.out.println("March");
		}
		else if(month_no==4)
		{
			System.out.println("April");
		}
		else if(month_no==5)
		{
			System.out.println("May");
		}
		else if(month_no==6)
		{
			System.out.println("June");
		}
		else if(month_no==7)
		{
			System.out.println("July");
		}
		else if(month_no==8)
		{
			System.out.println("August");
		}
		else if(month_no==9)
		{
			System.out.println("September");
		}
		else if(month_no==10)
		{
			System.out.println("October");
		}
		else if(month_no==11)
		{
			System.out.println("November");
		}
		else if(month_no==12)
		{
			System.out.println("December");
		}
		else
		{
			System.out.println("invalid month");
		} 
			
			
			
			
	}

}
