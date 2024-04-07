package wrapperclass;

public class WrapperClassDemo3 {
	
	// Data conversion using wrapper class: Conversion from one data type to another

	public static void main(String[] args) 
	{
	 //  Converting String to int using wrapper class syntax
		
		// Integer.parseInt();
		
	// String s="welcome"; // Not possible to convert to integer because the String contains alphabets
		
		String s1= "10";
		String s2="20";
		
		Integer.parseInt(s1);
		Integer.parseInt(s2);
		
		System.out.println(s1+s2); // String value
		
		System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2)); // integer value
		
		
	//  Converting String to double
		
		String s3="10.7";
		String s4="20.6";
		
		double a=Double.parseDouble(s3);
		double b= Double.parseDouble(s4);
		
		System.out.println(a+b);
				
		
	//  Converting String to boolean
		
		String s="true";
		
		Boolean.parseBoolean(s);
		
		System.out.println(Boolean.parseBoolean(s));
		
		
	// Converting from int, double, boolean, char to String using the syntax:
	
		// String.valueOf(variable);
		
		int i=10;
		double du=100.50;
		boolean boo=false;
		char ch='B';
		
		String.valueOf(i);
		String.valueOf(du);
		String.valueOf(boo);
		String.valueOf(ch);
		
		System.out.println(String.valueOf(i));
		System.out.println(String.valueOf(du));
		System.out.println(String.valueOf(boo));
		System.out.println(String.valueOf(ch));
		
		
		
		
	}

}
