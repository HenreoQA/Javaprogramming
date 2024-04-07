package conditionalstatements;

public class IfElseCondition {

	public static void main(String[] args) 
	{
		// IF ELSE CONDITION: Is used to state what will happen if the condition is false.
		
		//Syntax for "if else" condition:

		/* if(condition)
		{
		statements;
		}
		else
		{
		other set of statement;
		}*/


		// Example: Check if person is eligible to vote if his age is 15 given the 
		// voting age to be greater than or equal to 18 years
		
		int age=15; 
		   
		if(age>=18)
		   {
			 System.out.println("Eligible to vote");
		   }
		else
		{
			System.out.println("Not eligible to vote");
		}
		
		
		

	}

}
