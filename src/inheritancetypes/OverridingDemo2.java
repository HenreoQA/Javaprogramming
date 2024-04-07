package inheritancetypes;


    class Parent5
    {
    	int k=100;
    	
    	void display() // definition
    	{
    		System.out.println(k); // body
    	}
    }
    
    class Child5 extends Parent5
    {
    	int k;
    	
    	void display()
    	{
    		System.out.println(k+k);
    	}
    	
    }
    
    
    public class OverridingDemo2 
    {
	
	
	public static void main(String[] args) 
	{
       Child5 c5=new Child5(); // creating object for child5
       
      c5.k=200; // assigning new value     
      c5.display(); // calling method


	}

}
