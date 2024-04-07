package encapsulation;

public class Encapsulate 
{
	private int t, v; // make the variables private so that it can be accessed only through getters and setters methods

	
	public int getT() 
	{
		return t;
	}


    public void setT(int t) 
    {
		this.t = t;
	}



     public int getV() 
     {
		return v;
	 }



      public void setV(int v) 
      {
		this.v = v;
	  }



        
      public static void main(String[] args) 
	{
    	  Encapsulate en=new Encapsulate (); // creating the object
    	  
    	  en.setT(100); // Calling setters method and assign data to the variables
    	  en.setV(200); // Calling setters method and assign data to the variables
    	  
    	  System.out.println(en.getT()); // Calling getters method to get data from the variables
    	  System.out.println(en.getV()); // Calling getters method to get data from the variables
	}

}
