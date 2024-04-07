package loopingstatements;

public class WhileLoopDemo 
{

	public static void main(String[] args) 
	{
      // WHILE LOOP:This is used when we want to execute the same set of statements
      // multiple times and this will reduce the number of code lines eg, printing 1-10 numbers
      // While loop is used when we want to check the condition before executing the statement.
        
		// Syntax for while loop is stated below:

         /*while(condition)
         {
           statements;
           inc/dec statement;
         }*/

    // inc = increment, dec = decrement. 
	// inc/dec are used to make the condition false
		
		// Example1: Print numbers 1-10
		
	/*	int i=1;   // initialization or starting point
		
		while(i<=10)  // condition
		{
		System.out.println(i);
		i++;   // incrementation
		} */
		
	/*	int a=1, b=2, c=3, d=4, e=5, f=6, g=7, h=8,i=9,j=10;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		System.out.println(i);
		System.out.println(j); */
		
		// Example2: Print Hello 10 times 
		
	/*	int i=1;
		
		while(i<=10)
		{
			System.out.println("Hello");
			i++;
		} */
		
		// Example3: Print even numbers between 1-10
		
		// Approach 1
		
	/*	int i=2;
		
		while(i<=10)
		{
			System.out.println(i);
			i+=2;
		} */
		
		// Approach 2
		
	  /*    int i=1;
		
		  while(i<=10)
		{
			if(i%2==0)
			System.out.println(i);
			i++;
		} */
		
		// Example4: Print odd numbers between 1-10
		
		   // Approach 1
		
				/*int i=1;
				
				while(i<=10)
				{
					System.out.println(i);
					i+=2;
				}*/
		
		  // Approach 2
		
		/*int i=1;
		
		while(i<=10)
		{
			if(i%2!=0)
			System.out.println(i);
			i++;
		}*/
		
		// Example 5: Print numbers 10-1 in descending or decrement order
		
		// Approach 1
		
	/*	int i=10;
		
		while(i>=1)
		{
			System.out.println(i);
			i--;
		} */
		
		// Approach 2
		
      /*  int i=10;
		
		while(i>0)
		{
			System.out.println(i);
			i--;
		} */
		
		
		
		
		
		
		
		
		
				
		
		
	}

}
