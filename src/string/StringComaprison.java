package string;

public class StringComaprison {

	public static void main(String[] args) 
	{
		// String comparison: Comparison between equals() method and ==
		// equals() is used on non-primitive data types while == is used on primitive data types.
		// equals() compares the values of the object while == compares the objects
		
		// Example1:
		
		/*  String s1="welcome";
			
		 String s2="welcome";
		
		System.out.println(s1==(s2)); // true
		System.out.println(s1.equals(s2)); */ // true
		
		// Example2:
		
		/* String s1=new String("welcome");
		
		String s2=new String("welcome");
		
		System.out.println(s1==s2); // false --  compares the objects s1 and s2 because we use new keyword
		System.out.println(s1.equals(s2));*/ // true --  compares the values of the objects
		
		// Example3:
		
		 /*String s1="abc";
		
		String s2=new String("abc");
		
		String s3=s2;
		
		System.out.println(s1==(s2)); // false because they are two different objects
		System.out.println(s1.equals(s2)); // true because the objects have the same values
		System.out.println(s2==(s3)); // true
		System.out.println(s2.equals(s3));*/ // true
		
		

	}

}
