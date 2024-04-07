package loopingstatements;

public class ForLoopDemo {

	public static void main(String[] args) 
	{
// FOR LOOP: The major advantage of for loop is that, we can write the 
// initialization, condition and incrementation/decrementation on a single 
// line unlike while loop and do while loop. In this type of loop, the 
// following process/steps happens (work flow): 
// initialization---->condition---->execution of the statement----->inc/dec
// ----->condition----->exceution of statement

// Initialization happens only once and the execution of the statement stops
// when the condition is false.

	// For loop syntax is stated below:

		  /*for(initialization;condition;inc/dec)
		  {
		     statement;
		  }*/
		
		// Example 1: Print numbers 1-10 in ascending order.
		
		/*for(int i=1; i<=10; i++) 
		{
			System.out.println(i);
		}*/
		
		// Example 2: Print numbers 10-1 in descending order.
		
				/*for(int i=10; i>=1; i--) 
				{
					System.out.println(i);
				}*/
		
		// Example 3: Print even numbers between 1-10
		
		/*for(int i=2; i<=10; i+=2)
		{
			System.out.println(i);
		}*/
		
		// Example 4: Print odd numbers between 1-10
		
			/*	for(int i=1; i<=10; i+=2)
				{
					System.out.println(i);
				} */
		
	// Example 5: Given the numbers 1-10, print the numbers 2 or 5 or 10
		
		for(int i=1; i<=10; i++)
		{
			if(i==2 || i==5 || i==10)
			System.out.println(i);
		}
		
// Example 6: Given the numbers 1-10, print the numbers that are not 2,5,10
		
		for(int i=1; i<=10; i++)
		{
			if(i!=2 && i!=5 && i!=10)
		    System.out.println(i);
		}
		
		
			


	}

}
