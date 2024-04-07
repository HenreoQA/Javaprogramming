package multipleinheritanceusinginterface;

public class PQR implements ABC,XYZ  // All abstract methods must be implemented by using class
{
	public void m2() 
	{
		System.out.println("This is m2 from XYZ");
		
	}


	public void m1() 
	{
	 System.out.println("This is m1 from ABC");
	}

	
	public static void main(String[] args) 
	{
		PQR p=new PQR(); // Creating object of the implemented class to access the interface
		
		System.out.println(v); // calling static variable directly
		System.out.println(u); // calling static variable directly
		
		p.m1(); // calling the method
		p.m2(); // calling the method
		
		
	}

	
}
