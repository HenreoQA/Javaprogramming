package conditionalstatements;

public class SwitchCaseStatements {

	public static void main(String[] args) 
	{
		// Switch case - Is used to reduce multiple if conditions or code lines.
		// In switch case, you don't write expressions after the 'case' keyword, 
		// it only allows the 'values' unlike 'if else' statements that allow expressions.
		
		//     Limitations of switch case:

       //  1. It does not support String, boolean, character (char), long
       //  2. Break is used in every case. Break is just like jumping command.
		
		// Syntax for switch case statement is stated below:

		 /*switch(variable)
		{
		case "value1" : statements; break;

		case "value2" : statements; break;

		case "value3" : statements; break;
		-------
		-------
	    default : statements
		}*/
		
		// Example1: Print week name by taking week number (1-7) using switch case
		
		int weekno=1;
		
		switch(weekno)
		{
		case 1 : System.out.println("Sunday"); break;
		case 2 : System.out.println("Monday"); break;
		case 3 : System.out.println("Tuesday"); break;
		case 4 : System.out.println("Wednesday"); break;
		case 5 : System.out.println("Thursday"); break;
		case 6 : System.out.println("Friday"); break;
		case 7 : System.out.println("Saturday"); break;
		default : System.out.println("Invalid weekno");
		}
		
		//Example2:  Print month name by taking month number(1-12) using switch case.
	
		int month_no=2;
		
		switch(month_no)
		{
		case 1 : System.out.println("January"); break;
		case 2 : System.out.println("February"); break;
		case 3 : System.out.println("March"); break;
		case 4 : System.out.println("April"); break;
		case 5 : System.out.println("May"); break;
		case 6 : System.out.println("June"); break;
		case 7 : System.out.println("July"); break;
		case 8 : System.out.println("August"); break;
		case 9 : System.out.println("September"); break;
		case 10 : System.out.println("October"); break;
		case 11 : System.out.println("November"); break;
		case 12 : System.out.println("December"); break;
		default : System.out.println("Invalid month");
		} 
		
		
		
	}

}
