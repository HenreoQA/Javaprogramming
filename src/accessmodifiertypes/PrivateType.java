package accessmodifiertypes;

// Private access modifier: Variables and methods can only be accessed within the class.

public class PrivateType {

	private int h=100;
	
	private void m1()
	{
		System.out.println("This is m1 method...");
		System.out.println(h);
	}
	
	
	
	
	
	public static void main(String[] args) 
	{
		PrivateType p=new PrivateType(); // creating the object
		p.m1(); // calling the private method
		
	
	}
 
}
