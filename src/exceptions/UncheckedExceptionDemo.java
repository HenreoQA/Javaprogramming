package exceptions;

public class UncheckedExceptionDemo {

	public static void main(String[] args) 
	{
		 // UNCHECKED EXCEPTION:These are the exceptions that are not identified by Java compiler.
		
		// Example1: If there is no exception
		
	/*  System.out.println("program is stated...");
		System.out.println("program is in progress...");
		
		int a=10;
		
		System.out.println(a/2);
		
		System.out.println("program is completed...");
		System.out.println("program is in exited...");*/
		
		
		// Example2: If there is exception
		
			/*	System.out.println("program is started..."); // executed
				System.out.println("program is in progress..."); // executed
				
				int a=10;
				
				System.out.println(a/0); // Arithmetic exception due to invalid input
				
				System.out.println("program is completed..."); // not executed
				System.out.println("program is in exited..."); */ // not executed
		
		
		// Example3: If there is no exception
		
			/*	System.out.println("program is stated...");
				System.out.println("program is in progress...");
				
				String s="1234";
				
				int x= Integer.parseInt(s); // converting String to integer using wrapper class
				
				System.out.println(x);
				
				System.out.println("program is completed...");
				System.out.println("program is in exited..."); */
		
		
		// Example4: If there is exception
		
					/*	System.out.println("program is stated...");
						System.out.println("program is in progress...");
						
						String s="welcome";
						
						int x= Integer.parseInt(s); // converting String to integer using wrapper class
						
						System.out.println(x); // NumberFormatException due to invalid input
						
						System.out.println("program is completed...");
						System.out.println("program is in exited..."); */
		
		// Example5: If there is exception
		
	/*	System.out.println("program is stated...");
		System.out.println("program is in progress...");
		
		String s1= null;
		
		System.out.println(s1.length()); // NullPointerException due to invalid input
		
		finally
						{
							System.out.println("enter into finally block");
						}
		
		System.out.println("program is completed...");
		System.out.println("program is in exited..."); */
						
						
						
						
	 
		
		
		

	}

}
