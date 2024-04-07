package polymorphismOverloading;

// Thiskeyword: Is used to differentiate the class and method variables. We use the same variable
// to reduce the memory.

public class ThisKeyword 

    // APPROACH1: By using Method
{
	int x,y; // instance or class variable
	
	void display()
	{
		System.out.println(x);
		System.out.println(y);
	}
	
	void setData(int x, int y) // local or method variable
	{
		this.x=x; // thiskeyword is only assigned to the instance variable if both instance and method variables are the same
		this.y=y;
	}
	
	
 	 public static void main(String[] args) 
	
	{
		ThisKeyword th=new ThisKeyword(); // creating the object
		
		th.setData(10, 20); // calling the methods
		th.display();
	} 
	
	   // APPROACH 2: By using constructor


   /*   int v, h;
      void display1()
  	{
  		System.out.println(v);
  		System.out.println(h);
  	}
      
      ThisKeyword(int v, int h)
      {
    	this.v=v;
    	this.h=h;
      }
      
      public static void main(String[] args) 
  	
  	{
  		ThisKeyword th1=new ThisKeyword(100, 200);
  		
  		th1.display1();
  	} */
	 
      
      
      
      
     
    	  

}
