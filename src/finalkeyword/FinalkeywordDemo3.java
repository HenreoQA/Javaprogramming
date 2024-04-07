package finalkeyword;

// Using final keyword to restrict a class from extending to another class

final class Test3 // final class which is constant
{
	int v;
	
	void display()
	{
		System.out.println(v);
	}
}

class Test4 extends Test3 // Test4 cannot be a subclass to the final class Test3 (final class Test3 cannot be extended to Test4)
{
	int w;
	
	void show()
	{
		System.out.println(w);
	}
}



public class FinalkeywordDemo3 {

	public static void main(String[] args) {
		
	}

}
