package loopingstatements;

public class JumpingStatement {

	public static void main(String[] args) 
	{
	// JUMPING STATEMENT: This consists of break, and continue commands/statements
	// and they are used along with looping statements.	
	// This is used when we want to skip or break something/number.

	// Example 1: Print numbers 1-5 in ascending order and break when the number=3
		
		for(int i=1; i<=5; i++)
		{
			if(i==3) break;
			System.out.println(i); // 1,2
		}
		
	// Example 2: Print numbers 1-5 in ascending order and continue after the number=3
		
		for(int i=1; i<=5; i++)
		{
			if(i==3) continue;
			System.out.println(i); // 1,2,4,5
		}
		
	// Example 1: Print numbers 1-10 in ascending order and continue after the 
	// number = 3 or 5
		
		for(int i=1; i<=10; i++)
		{
			if(i==3 || i==5) continue;
			System.out.println(i); // 1,2,4,6,7,8,9,10
		}
		
		 
		
		

	}

}
