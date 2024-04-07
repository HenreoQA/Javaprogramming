package arrays;

import java.util.Arrays;

public class SingleDimensionalArray { 

	public static void main(String[] args) 
	{
	// ARRAY: It is used to store multiple values or sets of data into one variable and
	// it does not support multiple or heterogeneous data types.
     // The syntax for Array is stated below:
	
		// data type a[ ] = new data type [ number of values/data ];
        // or

        // data type [ ]a = new data type [ number of values/data ];

// Example: If we want to store 100 values in a variable, the syntax will be as follows:
		
		// int a=100
		
		//int a[] = new int[100];
		
		// SINGLE DIMENSIONAL ARRAYS: In this type of arrays, we have only rows that are created.

		// The following basic operations are carried out in single dimensional array:

		/* 1. Declare an array
		   2. Insert values into array
		   3. Find size or length of an array
		   4. Read or extract single value from an array
		   5. Read multiple values from an array*/
		
		// Declaration and inserting values into an array can be done via two approaches:
		
		// Approach 1: Declaration before insert values. This approach is used
		// if you have limited values and you do not intend to add or reduce 
		// more values in the future.
		
		// If the number of values = 6
		
		/*int a[] = new int[6];  // Declaration
		
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
		a[5]=600; */  // insertion of values into an array
		
		// Approach 2: Declaration and insert values at the same time. This approach
		// is used if you intend to add or reduce more values in the future 
		// and the values have no limit.
		
		// int a[]={a[0], a[1], a[2], a[3], a[4], a[5]};
		
		//int a[] = {100,200,300,400,500,600};
		
		// Find size or length of an array: This can be done by using a
		// keyword called length. The length of an array is the same as number of values.
		
		/*int a[] = {100,200,300,400,500,600};
	   
		System.out.println(a.length);*/ // ---- length is 6
	  
	  // Read or extract single value from an array: This can be done by using
	  // index concept.
		
	/*	int a[] = {100,200,300,400,500,600};
		
		System.out.println(a[3]); // --- 400
		
		System.out.println(a[0]); // --- 100
		
		System.out.println(a[5]); */ // --- 600
		
		// Read multiple values from an array using index concept
		
	/*	int a[] = {100,200,300,400,500,600};
		
		System.out.println(Arrays.toString(a)); */ // --- 100,200,300,400,500,600
		
		// We can read multiple values from an array by using loop statements and index as follows:
		// index starts from zero and the last index = n-1
		
		// Using "for loop"
		
	/*	int a[] = {100,200,300,400,500,600};
		
		for(int i=0; i<6; i++)   // i=index
		{
			System.out.println(a[i]);
		}*/
		
		/*float a[]= {10.5f,20.5f,30.5f};
		
		for(int i=0; i<3; i++)
		{
		  System.out.println(a[i]);
		}*/
		
         
	  // Using do while loop
	
		/*int a[] = {100,200,300,400,500,600};
	
		 int i=0;
	do
	{
		System.out.println(a[i]);
		i++;
	}
	while(i<6);*/
		
		
	 // Using while loop
		
		/*int a[ ] = {100,200,300,400,500,600};
		
		int i=0;
		
		while(i<6)
		{
			System.out.println(a[i]);
			i++;
		}*/
		
		// You can read multiple values if you don't know the length or size of the
		// arrays by using a.length
		
		/*int a[ ] = {100,200,300,400,500,600};
		
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}*/
	
		// we can read values/data from an array using enhanced for loop
		
		/*int a[] = {100,200,300,400,500,600};
		
		for(int x:a) // x=variable, a = array
		{
			System.out.println(x);
		}*/
		
		
		
		
		
	
	
		
		
		
		
		
		
		
	  
	  
	 
		
		
		
		
		
		

	}

}
