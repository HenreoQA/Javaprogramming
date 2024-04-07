package inheritancetypes;

// Single inheritance: This contains one parent class and one child class. eg, class X and class Y.

  class X
  {
	  int x;
	  
	  void display()
	  {
		  System.out.println(x);
	  }
  }
  
  class Y extends X
  {
	  int y;
	  
	  void show()
	  {
		  System.out.println(y);
	  }
	  
  }
  
  
	  public class SingleInheritance {
  
	  
	 public static void main(String[] args) 
	{
	  Y yobj=new Y(); // creating the object for Y class
	  
	  yobj.x=100; // assigning data to the variable
	  yobj.y=200; // assigning data to the variable
	  
	  yobj.display(); // calling method from X
	  yobj.show();  // calling method from Y
	  
	  

	}

}
	  
