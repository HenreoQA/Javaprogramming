package string;

public class StringOperations {

	public static void main(String[] args) 
	{
		// Declaration of String: String is a collection of characters and it
		// is non-primitive.
		
		// Approach1:
		// String s="Welcome";
		// System.out.println(s);
		   
		// Approach2:
		//   String s=new String("Welcome");
		//   System.out.println(s);
		
		// String methods: These are defined below
		
		// 1. Length method: Used to find the length of a String using length() function: Length of a string is the total number 
		// of characters.
		
		// Example
		
	  /*   String s="welcome";
	   
		System.out.println(s.length()); */ // length() = length of function
		
		// 2. Concat method: Used to join multiple Strings using concat() function
		
		// Example1: Join the two strings
		
		/* String s1="Welcome";
		   String s2="To Java";
		
		System.out.println(s1.concat(s2)); */

		
		// The Strings can join using positive(+) operator as follows:
		
		/* String s1="Welcome";
		String s2="To Java";
		
		System.out.println(s1+s2);*/
		
		// Example2: join the three strings
		
		/* String s1="Welcome";
		String s2="To Java";
		String s3="Automation";
		
		System.out.println(s1.concat(s2).concat(s3));*/
		
		// Using positive operator:
		
		/*String s1="Welcome";
		String s2="To Java";
		String s3="Automation";
		
		System.out.println(s1+s2+s3);*/
		
		// 3. Trim method: Used to trim String using trim() function: Trimming is used to remove
		// the left and right side spaces.
		
		// Example1
		
	/*	String s="   Automation   ";
		
		String result=s.trim();
		System.out.println(result);*/
		
		// OR
		
    /*     String s="   Automation   ";
      
		System.out.println(s.trim()); */
		
		// Finding the length of String before trimming
		
		/* String s="   Welcome   ";
         System.out.println(s.length()); */ // --- 13
		
		// Finding the length of String after trimming
		
		/* String s="   Welcome   ";
		 
		 System.out.println(s.trim().length()); */
		
		
		// 4. charAT method: Used to extract a single character from a string using charAt() function and index: Index starts from zero
		
		// Example1:
		
	/*	 String s="Welcome";
		
		System.out.println(s.charAt(0));   // --- w
		System.out.println(s.charAt(3)); */ // --- c
		
	// 5. contains method: contains() - This function/method is used to check if values are present
	// in a string or not. It returns boolean values (true or false).
		
		// Example1:
		
	/*	String s="welcome";
		
		System.out.println(s.contains("c")); // -- true
		System.out.println(s.contains("wel")); // -- true
		System.out.println(s.contains("come")); // -- true
		System.out.println(s.contains("Wel")); // -- false
		System.out.println(s.contains("so")); */ // -- false
		
		// 6. equals(), equalsignorecase() - These methods are used to compare two strings.
		// They return boolean values. equals() does not ignore the case sensitive
		// while equalsignorecase() ignores the case sensitive.
		
		// Example1:
		
		/*  String s1="Welcome";
	
		String s2="welcome";
		
		
		System.out.println(s1.equals(s2)); // -- false
		System.out.println(s1.equalsIgnoreCase(s2)); */ // -- true
	
		
		// 7. replace method: replace() - Is used to replace single or multiple characters in a string.
		
		// Example1: replace single character 'e' with 'x'
		
		/* String s="welcome to selenium automation testing";
		
		System.out.println(s.replace('e', 'x')); */
		
		// Example2: replace multiple characters "selenium" with "java"
		
	/*	String s="welcome to selenium automation testing";
		System.out.println(s.replace("selenium", "java"));
		System.out.println(s.replace("sel", "xel")); */
		
		// 8. substring() method - Is used to extract substring from main string using
		// starting and ending index. starting index starts from zero while ending
		// index starts from 1
		
		// Example1:
		
	/*	String s="welcome";
		
		System.out.println(s.substring(3, 7)); // -- come
		System.out.println(s.substring(0, 3)); */ // -- wel
		
		
		// 9. split() method - Is used to divide the string into multiple parts using 
		// Delimiter, array, and index.
		// We can't use the following as delimiter: (* ? ^ $ . + -)
		
	// Example1:
		
		/* String s="abc@gmail.com"; // "@" is the delimiter/separator
		
		String a[]= s.split("@");
		
		System.out.println(a[0]); // abc
		System.out.println(a[1]); */  // gmail.com 
		
		// Example2:
		
		/* String s="abc,xyz,mno"; // "," is the delimiter
		
		String a[]=s.split(",");
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]); */
		
	/*	String s= "welcome";
		
		String a[]=s.split("co");
		System.out.println(a[0]);
		System.out.println(a[1]); */
		
		
		// 10. toUpperCase(), toLowerCase() methods: Is used to convert uppercase to lowercase
		// and lowercase to uppercase.
		
		// Example1:
		
		/* String s="welCOME";
		
		System.out.println(s.toLowerCase()); // welcome
		System.out.println(s.toUpperCase()); */ // WELCOME
		
	
		
		
		
		
		
		
		
		
		

	}

}
