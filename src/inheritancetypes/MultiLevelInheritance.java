package inheritancetypes;

// Multi-level inheritance: This contains multiple parent class and multiple child class. eg, class A, class B, class C, class D. A is the parent of B, B is the parent of C, C is the parent of D

class A
{
	  int a;
	  
	  void display()
	  {
		  System.out.println(a);
	  }
}

class B extends A // A is the parent of B
{
	  int b;
	  
	  void show()
	  {
		  System.out.println(b);
	  }
	  
}


class C extends B // B is the parent of C
{
	  int c;
	  
	  void setdata()
	  {
		  System.out.println(c);
	  }
}

class D extends C // C is the parent of D
{
	  int d;
	  
	  void print()
	  {
		  System.out.println(d);
	  }
	  
}


public class MultiLevelInheritance 
{

	public static void main(String[] args) 
	{
		  B bobj=new B(); // creating the object for B class
		  
		  bobj.a=100; // assigning data to the variable
		  bobj.b=200; // assigning data to the variable
		  
		  bobj.display(); // calling method from A
		  bobj.show(); // calling method from B
		  
		  C cobj=new C(); // creating the object for C class
		  
		  cobj.a=300; // assigning data to the variable
		  cobj.b=400; // assigning data to the variable
		  cobj.c=500; // assigning data to the variable
		  
		  cobj.display(); // calling method from A
		  cobj.show(); // calling method from B
		  cobj.setdata(); // calling method from C
		  
		  
		  D dobj=new D(); // creating object for D class
		  
		  dobj.a=600; // assigning data
		  dobj.b=700;
		  dobj.c=800;
		  dobj.d=900;
		  
		  dobj.display(); // calling methods
		  dobj.show();
		  dobj.setdata();
		  dobj.print();
		  
		  
		  
	
	}

}
