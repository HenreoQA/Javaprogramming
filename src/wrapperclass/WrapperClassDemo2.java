package wrapperclass;

public class WrapperClassDemo2 {

	public static void main(String[] args) 
	{
		//  USES OF WRAPPER CLASS:

// 1. It is used to convert primitive data type to object and object to primitive
		
		// Approach1: converting primitive data type/variable to object using autoboxing
		// Syntax is stated below:
	
// (corresponding wrapper class) (object_name) = primitive_variable
	
	    byte b=10; // These are primitive data types
	    short s=20;
	    long l=30;
	    int i=40;
	    double d=10.5;
	    float f=10.56f;
	    char c='A';
	    boolean bo= true;
	
	    
	    Byte byteobj=b; // Byte is the corresponding wrapper class of byte (with capital letter B), byteobj =wrapper class object, b= primitive variable
	    Short shortobj=s; // These are objects with their corresponding wrapper class
	    Long longobj=l;
	    Integer intobj=i;
	    Double doubleobj=d;
	    Float floatobj=f;
	    Character charobj=c;
	    Boolean booleanobj=bo;
	    
	    System.out.println(byteobj);
	    System.out.println(shortobj);
	    System.out.println(longobj);
	    System.out.println(intobj);
	    System.out.println(doubleobj);
	    System.out.println(floatobj);
	    System.out.println(charobj);
	    System.out.println(booleanobj);
	    
	 
	 // Approach2: Converting object to primitive data type/variable using unboxing
	// Syntax is stated below:
	  
	    // (primitive data type) (primitive variable) =object 
	    
	    byte b1=byteobj; // byteobj = wrapper class object, bi= primitive variable
	    short s1=shortobj;
	    long k=longobj;
	    int x=intobj;
	    double d1=doubleobj;
	    float f1=floatobj;
	    char c1=charobj;
	    boolean b2=booleanobj;
	    
	    System.out.println(b1);
	    System.out.println(s1);
	    System.out.println(k);
	    System.out.println(x);
	    System.out.println(d1);
	    System.out.println(f1);
	    System.out.println(c1);
	    System.out.println(b2);
	    
	
	}

}
