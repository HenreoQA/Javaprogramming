package finalkeyword;

// Using final keyword to make the value of the variable constant or unchangeable or fixed.

   class Test
{
	final int k=100; // The value in the variable is constant or fixed
}


public class FinalkeywordDemo {

	public static void main(String[] args) 
	{
	   Test t=new Test();
	   //t.k=200; // Incorrect because k is a final variable
	   System.out.println(t.k);
 
	}

}
