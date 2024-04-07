package accessmodifiertypes;

// Default: Variables and methods can be accessed in every class within the package. By default, 
// variables and methods are default without adding default keyword.

public class DefaultType 
{
   int v=200;
	
	 void m2()
	{
		System.out.println("This is m2 method");
		System.out.println(v);
	}

// Protected: Variables and methods can be accessed outside of the package (in another package) 
// through/using inheritance concept
	 
	protected int t=300;
		
	 protected void m3()
	{
		System.out.println("This is m3 method");
		System.out.println(t);
	}
	 

}
