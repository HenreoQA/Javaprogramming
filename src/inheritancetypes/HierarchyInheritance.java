package inheritancetypes;

// Hierarchy inheritance:This contains one parent class with multiple child classes and the child classes are independent of one another. eg, A as parent class with multiple classes B, C, D

class Parent // parent class
{
	void display(int a)
	{
		System.out.println(a);
	}
}

class Child1 extends Parent // child class
{
	void show(int b)
	{
		System.out.println(b);
	}
}

class Child2 extends Parent // child class
{
	void setdata(int c)
	{
		System.out.println(c);
	}
}



public class HierarchyInheritance 
{

	public static void main(String[] args) 
	{
		Child1 ch1=new Child1(); // creating object for child1
		
		ch1.display(10); // calling method from parent
		ch1.show(20); // calling method from child1
		
		Child2 ch2=new Child2(); // creating object for child2
		
		ch2.display(30); // calling method from parent
		ch2.setdata(40); // calling method from child2
		
		
		
	}

}
