package superkeyword;

public class Animal 
{
	String colour="white";
	
	void display()
	{
		System.out.println(colour);
	}
	
	void eat()
	{
		System.out.println("eating...");
	}

}

class dog extends Animal
{
	String colour="black";
	
	void displaycolour()
	{
		System.out.println(super.colour); // Using super keyword to invoke immediate parent class variable
		
	}
	 
	void eat()
	{
		// System.out.println("eating bread");
		
		super.eat();  // Using super keyword to invoke immediate parent class method
		
	}
	
	
	 
}  