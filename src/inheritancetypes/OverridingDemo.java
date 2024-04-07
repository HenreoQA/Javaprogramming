package inheritancetypes;

// OVERRIDING: Is the changing of the values of the variable and implementation part (body) of the method in a class. The definition of the variable and method do not change.

class Parent1
{
	double display()
	{
		return 10.00;
	}
}

class Child3 extends Parent1
{
	double display()
	{
		return 15.00;
	}
}

class Child4 extends Parent1 
{
	double display()
	{
		return 20.00;
	}
}


public class OverridingDemo {

	public static void main(String[] args) 
	{
		Child3 c3=new Child3(); // creating object for child3
		System.out.println(c3.display()); // calling method from child3
		
		Child4 c4=new Child4(); // creating object for child4
		System.out.println(c4.display()); // calling method from child4
		

	}

}
