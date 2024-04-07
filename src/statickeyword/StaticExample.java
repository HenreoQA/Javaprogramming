package statickeyword;

public class StaticExample 
{
	static int a=10; // static variable
	int b=20; // non-static variable
	
	static void m1() // static method
	{
		System.out.println("this is m1 static method");
	}
	
	void m2() // non-static method
	{
		System.out.println("this is m2 non-static method");
	}
	
	
	public static void main(String[] args) 
	{
		// RULES OF STATIC METHODS:

// 1. Static methods can access static stuff (variables and methods) directly without through object.
	
		  System.out.println(a); // calling the static variable 'a' directly
		  // System.out.println(b); incorrect because 'b' is non-static variable
		  
		    m1();  // calling static method directly
		//  m2(); incorrect because m2() is non-static method
		    
		    
	// 2. Static methods can access non-static stuff (variables and methods) through object.

		    StaticExample se=new StaticExample(); // creating object
		    
		    System.out.println(se.b); // calling non-static variable through the object
		    
		    se.m2();   // calling non-static method through the object
		   
    	   
    	
	}

}
