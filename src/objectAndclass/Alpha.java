package objectAndclass;

public class Alpha 
{
   int a,b,c;
   
   void show()
   {
	  System.out.println(a+" "+b+" "+c); 
   }
	
	
	public static void main(String[] args) 
	{
		Alpha al=new Alpha();
		
		al.a=100;
		al.b=200;
		al.c=300;
		
		al.show();

	}

}
