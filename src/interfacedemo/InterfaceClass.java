package interfacedemo;

interface Shape
{
	int length=10; // final and static variable by default
	int width=20; // final and static variable by default
	
	void circle(); // abstract method
	
	default void square() // default method
	{
		System.out.println("This is square default method");
	}
	
	static void rectangle() // static method
	{
		System.out.println("This rectangle static method");
	}
}



public class InterfaceClass implements Shape // implemented class
{
	public void circle() // All abstract methods must be implemented by using class and making it public
	{
		System.out.println("This is circle");
	}

	
	
	public static void main(String[] args) 
	{
		InterfaceClass ic=new InterfaceClass(); // Creating object of the implemented class to access the interface
		
		System.out.println(length); // calling the static variable directly
		System.out.println(width); // calling the static variable directly
		
		ic.square(); // calling the default methods
		ic.circle(); // calling the actual method
		Shape.rectangle(); // calling the static method using interface name
	    
// Interface can also be accessed by creating the interface variable to contain the object of the implemented class
		
		Shape sh=new InterfaceClass();// interface variable containing the object class
		
		sh.circle();
		sh.square();
		Shape.rectangle();
 
	}

}
