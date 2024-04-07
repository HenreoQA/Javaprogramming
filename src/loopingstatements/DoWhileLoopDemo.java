package loopingstatements;

public class DoWhileLoopDemo {

	public static void main(String[] args) 
	{
	 // DO WHILE LOOP:This is used when we want to execute the same set of statements
	 // multiple times and this will reduce the number code lines.
	// Do while loop is used when we want to execute at least one statement before checking the condition.	
		
	 // Syntax for do while loop is stated below:

		  /*do
		{
		     statements;
		     inc/dec statement;

		}while(condition);*/
		
		// Difference between while loop and do while loop:
 
 // 1.In while loop, the condition is checked before the execution of the 
 // statement (top-down approach) while in do while loop, the statement is 
 // executed at least once before the condition is checked(bottom-up approach).
		
		// Example 1: Print numbers 1-10 in ascending order
		
	/*	int i=1;
		
		do
		{
			System.out.println(i);
			i++;
		} 
		while(i<=10); */
		
		// Example 2: Print numbers 10-1 in descending order
		
	/*	int i=10;
		
	do
		{
			System.out.println(i);
			i--;
		}
		while(i>=1); */
		
	
				
 
	}

}
