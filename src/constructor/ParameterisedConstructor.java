package constructor;

public class ParameterisedConstructor 
{
   String p, h, w;
   
   ParameterisedConstructor(String f, String j, String r)
   {
	   p=f;
	   h=j;
	   w=r;
   }
	
   void show()
   {
	   System.out.println(p+" "+h+" "+w);
   }
	
	
	
   public static void main(String[] args) 
	
	{
	   ParameterisedConstructor pc=new ParameterisedConstructor("hello","John","Bosco");
	   pc.show();
	   

	}

}
