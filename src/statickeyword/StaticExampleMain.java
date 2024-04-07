package statickeyword;

// If we are calling the variables and methods in another class you have to specify class the variables
// and methods belong to (StaticExample.a  and  StaticExample.m1).

public class StaticExampleMain {

	public static void main(String[] args) 
	{
		// 1. Static methods can access static stuff (variables and methods) directly without through object.
		
		  System.out.println(StaticExample.a); // calling the static variable 'a'
		  // System.out.println(b); incorrect because 'b' is non-static variable
		  
		  StaticExample.m1(); // calling static method
		//  m2(); incorrect because m2() is non-static method
		    
		    
	// 2. Static methods can access non-static stuff (variables and methods) through object.

		    StaticExample se=new StaticExample(); // creating object
		    
		    System.out.println(se.b); // calling non-static variable through the object
		    
		    se.m2(); // calling non-static method through the object
		    
		   

   }


	}


