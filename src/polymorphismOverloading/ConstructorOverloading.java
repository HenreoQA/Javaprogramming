
package polymorphismOverloading;

// Constructor Overloading: Means creating multiple constructor with the same name but the number 
// of parameters should be different.

public class ConstructorOverloading 
{
	  int x,y;
	  double d;
	  
	ConstructorOverloading() // 1. Constructor name should be the same as class name
	{
		x=10;
		y=20;
		d=10.45;
	}
	
	ConstructorOverloading(int a, int b) // 2. Number of parameters should be different
	{
		x=a;
		y=b;
	}
	
	ConstructorOverloading(int a, double k) // 3. Data type of parameters should be different if the number of parameters are the same
	{
		x=a;
		d=k;
	}
	
	ConstructorOverloading(double k, int a) // 4. Order of parameter should be different if the data type of parameters are the same
	{
		x=a;
		d=k;
	}
	
	void display()
	{
		System.out.println(x);
		System.out.println(y);
		System.out.println(d);
	}
	
	
	public static void main(String[] args) 
	{
		ConstructorOverloading co=new ConstructorOverloading(); // Creating object and calling constructor
		
		co.display();  // Calling method 1
		
       
		ConstructorOverloading co1=new ConstructorOverloading(100,200); // Creating object and calling constructor
		
		co1.display();  // Calling method 2
		
     
		ConstructorOverloading co2=new ConstructorOverloading(300, 20.56); // Creating object and calling constructor
		
		co2.display();  // Calling method 3
		
      
		ConstructorOverloading co3=new ConstructorOverloading(30.67, 400); // Creating object and calling constructor
		
		co3.display();  // Calling method 4
		
		
	}

}
