package polymorphismOverloading;

// Method Overloading: Means creating multiple method with the same name but the number 
// of parameters should be different.

public class MethodOverloading 
{
     int x,y;
     double d;
     
     void sum() // 1. Method name should be the same
     {
    	 x=10;
    	 y=20;
    	 System.out.println(x+y);
     }
     
       void sum(int a, int b) // 2. Number of parameters should be different
       {
    	   x=a;
    	   y=b;
    	   System.out.println(x+y);
       }
       
       void sum(int a, double b) // 3.  Data type of parameters should be different if the number of parameters are the same
       {
    	   x=a;
    	   d=b;
    	   System.out.println(x+d);
       }
       
       void sum(double b, int a) // 4. Order of parameter should be different if the data type of parameters are the same.
       {
    	   x=a;
    	   d=b;
    	   System.out.println(x+d);
       }
       
       
	
	public static void main(String[] args) 
	{
		 MethodOverloading mo=new MethodOverloading(); // Creating object
		
		 mo.sum(); // Calling method 1 through the object
		 
		 mo.sum(100, 200); // Calling method 2 through the object
		 
		 mo.sum(300, 30.67); // Calling method 3 through the object
		 
		 mo.sum(40.65, 400); // Calling method 4 through the object
		 
	}

}
