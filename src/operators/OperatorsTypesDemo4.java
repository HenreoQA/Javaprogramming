package operators;

public class OperatorsTypesDemo4 
{

	public static void main(String[] args) 
	{
		// 6. Conditional/ternary operator: This is used along with relational operator 
		// and it s used to check if the condition is true or false. eg, ?:
		
		// It is written as follows:
		
		// variable=expression ? result1 : result2;
		
		//   Example1:
            int x=100, y=200;
            int a=x<y ? x : y;
            System.out.println(a); // --- 100
            
		// Example2: Find the smallest of 2 numbers(x and y) by using ternary operators, 
    	// given x=4000 and y=5000
            
		     int x1=4000, y1=5000;
             int a1=x1<y1 ? x1 :y1;
             System.out.println(a1); // --- 4000
		
		// Example3:
		
		   int b=300, c=400;
		   int v=(1==1) ? 300: 400;
		   System.out.println(v);
		
		// Example4:Find if person with age of 20 years is eligible to vote, given voting age
		// to be at least 18 years
		
		     int person_age=20;
		     String x2=person_age>=18 ? "eligible for vote" : "not eligible for vote";
		     System.out.println(x2); //--- eligible for vote
		    
		// Example5:Given the voting age to be at least 18 years, is the person of 15 years 
		// eligible to vote
		     
		    int age=15;
		    String z=age>=18 ? "eligible for vote" : "not eligible for vote";
		    System.out.println(z); //--- not eligible for vote
		
		// Example6: Find the largest of 2 numbers(f and d) by using ternary operators, 
		// given f=1000 and d=2000
		
		   int f=1000, d=2000;
		  int h=d>f ? d:f;
		  System.out.println(h);
		  
	
	} 

}
