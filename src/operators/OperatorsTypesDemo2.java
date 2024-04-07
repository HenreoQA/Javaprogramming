package operators;

public class OperatorsTypesDemo2 {

	public static void main(String[] args) 
	{
		// 4. Increment and decrement operators: eg, ++  --
		
		// Increment operator: Used to increase the value by one.
		// It consists of pre-increment operator and post increment operator.
        //a++   ----- post increment operator
        //++a   -----  pre-increment operator
		// ++ simply means plus 1
		
		int a=10;
		a++;
	    System.out.println(a);
		
	    int b=20;
	    ++b;
		System.out.println(b);
		
		int v=15;
		int result=v++;
		System.out.println(result);
		
		int w=15;
		int result1=++w;
		System.out.println(result1);
		
		// Decrement operators: Used to decrease the value by one.
		// It consists of pre-decrement operator and post decrement operator
		// a--    post decrement operator
		// --a    pre-decrement operator
		
		int c=30;
		c--;
		System.out.println(c); 
		
		int d=30;
		--d;
		System.out.println(d);
		
		int h=20;
		int result3=h--;
		System.out.println(result3);
		
		int b1=20;
		int result4=--b1;
		System.out.println(result4);
		
		
		
		
		
		
		
		
		
		
		  
	}

}
