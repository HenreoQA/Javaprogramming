package statickeyword;

// Non-static methods can access everything (whether static/non-static variables and methods) directly.



public class NonstaticmethodDemo 
{
	static int d=100; // static variable
	int t=200; // non-static variable
	
	  static void display() // static method
		{
			System.out.println("this is static");
		}
	void show() // non-static method
	{
		System.out.println("this is non-static");
	}
	
	void print() // non-static method
	{
		System.out.println(d);
		System.out.println(t);
		
		display();
		show();
		
	}

	
	
	public static void main(String[] args) 
	{
		NonstaticmethodDemo n=new NonstaticmethodDemo();
	    n.print();
		
	}

}
