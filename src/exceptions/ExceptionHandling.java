package exceptions;

public class ExceptionHandling {

	public static void main(String[] args) 
	{
		// Handling unchecked exception:Is handled by using try.. catch block
		
		// Example1: If there is exception and you know the type of exception (like ArithmeticException)
		
	/*	System.out.println("program is started..."); // executed
		System.out.println("program is in progress..."); // executed
						
		int a=10;
		
	
		try
		{
			System.out.println(a/0); // exception
		}
		
		catch(ArithmeticException e) // e= variable which will contain the exception
		{
			System.out.println("you have entered invalid input");
			
		
		}
						
		System.out.println("program is completed..."); // not executed
		System.out.println("program is in exited..."); */ // not executed
		
		
		// Example2: If there is exception and you don't know the type of exception
		
			/*	System.out.println("program is started..."); // executed
				System.out.println("program is in progress..."); // executed
								
				int a=10;
				
				try
				{
					System.out.println(a/0); // exception
				}
				
				catch(Exception e) // e= variable which will contain the exception
				{
					System.out.println("you have entered invalid input");
					
				 //	e.printStackTrace(); // This is used to know the type of exception				
				
				}
								
				System.out.println("program is completed..."); // not executed
				System.out.println("program is in exited..."); */  // not executed
		
		
		// Example3: If there is exception
		
			/*	System.out.println("program is stated...");
				System.out.println("program is in progress...");
				
				String s1= null;
				int x=100;
				try
				{
					System.out.println(s1.length()); // NullPointerException due to invalid input
					System.out.println(x/0); // ArithmeticException
				}
				
				catch(Exception a)
				{
					System.out.println("invalid input");
					System.out.println("incorrect number");

					
					
				}
				
				
				System.out.println("program is completed...");
				System.out.println("program is in exited..."); */
								
				

 //  FINALLY BLOCK:This block does not handle exception. it is optional. It contains any statement we want to execute whether there is exception or not. 
				
					/*	System.out.println("program is stated...");
						System.out.println("program is in progress...");
						
						String s2= null;
						
						try
						{
							System.out.println(s2.length()); // NullPointerException due to invalid input
						}
						
						catch(Exception a)
						{
							System.out.println("invalid input");
							
						}
						
						finally
						{
							System.out.println("enter into finally block");
						}
						
						
						System.out.println("program is completed...");
						System.out.println("program is in exited..."); */
													
				
				
		
		
	}

}
