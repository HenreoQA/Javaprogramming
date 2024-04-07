package inheritancetypes;

class ABC
{
	void m1(int a)
	{
		System.out.println(a);
	}
	
	void m2(int b)
	{
		System.out.println(b);
	}
}

class XYZ extends ABC
{
	void m1(int a) // overriding method -- definition does not change
	{
	  System.out.println(a*a);
	}
	
	void m2(int a, int b) // overloading method -- definition changes
	{
		System.out.println(a+b);	
	}
}


public class OverridingVsOverloding {

	public static void main(String[] args) 
	{
		XYZ x1=new XYZ(); // creating object for XYZ
		x1.m1(10); // calling methods
		x1.m2(20);
		x1.m2(30, 40);
	}

}
