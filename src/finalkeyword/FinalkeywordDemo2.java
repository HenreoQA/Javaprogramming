package finalkeyword;

// Using final keyword to make the body of the method constant or unchangeable or fixed.

class Test1
{
	final void m1() // final method which is constant
	{
		System.out.println("This is method from Test1");
	}
}

class Test2 extends Test1
{
	void m1() // incorrect because final method from Test1 cannot be overridden
	{
		System.out.println("This is method from Test2");
	}
}

 
public class FinalkeywordDemo2 {

	public static void main(String[] args) 
	{
		Test2 t2=new Test2();
		t2.m1();

		
		 



	}

}
