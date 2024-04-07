package constructor;

public class DefaultConstructor 
{
	int k,v,t;
	
	DefaultConstructor() // default constructor because it is not taking any parameter
	{
		k=1000;
		v=2000;
		t=3000;
	}
	
	void display()
	{
		System.out.println(k+" "+v+" "+t);
	}
	

	
	public static void main(String[] args) 
	{
		DefaultConstructor dc=new DefaultConstructor();
		
		dc.display();

	}

}
