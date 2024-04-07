package operators;

public class SwappingTwoNumbers 
{

	public static void main(String[] args) 
	{
		// Different ways of swapping two numbers: Swapping is interchanging the values
	  
        // Approach1: Using third variable
		   
	/*	int a=10, b=20;
		System.out.println("Before swapping, the values of a and b are:"+a+" and "+b);
	    int t=a; // t=10
		a=b; // a=20
		b=t; // b=10
		System.out.println("After swapping, the values of a and b are:"+a+" and "+b);*/
		
	//	OR
		
	/*	int t=b; // 20
		b=a; // 10
		a=t; // 20
		System.out.println(+a+" and "+b); */
		
	
	/*	double x=10.67, y=20.89;
		System.out.println("Before swapping, the values of x and y are:"+x+" and "+y);
		double z=x;
		x=y;
		y=z;
		System.out.println("After swapping, the values of x and y are:"+x+" and "+y); */
		
		/*float a=20.54f, b=30.32f;
		System.out.println("Before swapping, the values of a and b are:"+a+" and "+b);
		float c=a; 
		a=b;
		b=c;
		System.out.println("After swapping, the values of a and b are:"+a+" and "+b);*/
		
		// Approach2: Using + and - operators
		
	/*	int a=30, b=40;
		System.out.println("Before swapping, the values of a and b are:"+a+" and "+b);
		a=a+b;  // a=30+40=70
		b=a-b;  // b=70-40=30
		a=a-b;  // a=70-30=40
		System.out.println("After swapping, the values of a and b are:"+a+" and "+b); */
		
	// Appoach3: Using * and / operators. This approach is applied when non of the
	// values is zero
		 
		/*int a=15, b=25;
		System.out.println("Before swapping, the values of a and b are:"+a+" and "+b);
		a=a*b;  // a= 15*25=375
		b=a/b;  // b=375/25=15
		a=a/b;  // a=375/15=25
		System.out.println("After swapping, the values of a and b are:"+a+" and "+b);*/
		
		// Approach4: Using single statement
		
	/*	int a=40, b=50;
		System.out.println("Before swapping, the values of a and b are:"+a+" and "+b);
		a=a+b-(b=a);  // a= 40+50-(b=40)
		              // a=90-40=50
		              // a=50, b=40
	System.out.println("After swapping, the values of a and b are:"+a+" and "+b); */
		
	/*	int x=10, y=20;
 System.out.println("Before swapping, the values of x and y are:"+x+" and "+y);
		y=x+y-(x=y);  // y=10+20-(x=20)  30-20=10
 System.out.println("After swapping, the values of x and y are:"+x+" and "+y); */
		
		
		
		
		
		
		

		
		
	}

}
