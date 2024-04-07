
/*TWO DIMENSIONAL ARRAY: In this type of array, we have rows and columns that are created

  Syntax is stated below:

  int a[ ][ ]=new int[number of row][number of column];
  
The following basic operations are carried out in two dimensional array:

1. Declare an array
2. Insert values into array
3. Find size or length of an array
4. Read single value from an array
5. Read multiple values from an array*/

package arrays;

public class TwoDimensionalArray {

	public static void main(String[] args) 
	{
	  // If we have 3 rows and 2 columns, the declaration will be as follows:
	 // The values are: first row -  100, 200
		            //  second row - 300, 400
		            //  third row -  500, 600 
	 // Declaration - Approach1
		
		// int a[][]=new int[3][2];
		
		// Approach2
		
		// int [][]a=new int[3][2];
		
		// Approach3
		
		// int []a[]=new int[3][2];
		
		// Insert values into the array
		
		// Approach1: Declaration before insert
		
        /*int a[][]=new int[3][2];
		
		a[0][0]=100;
		a[0][1]=200;
		
		a[1][0]=300;
		a[1][1]=400;
		
		a[2][0]=500;
		a[2][1]=600;*/
	    
		
		// Approach2: Declare and insert at the same time
		
// int a[][]={{a[0][0],a[0][1]}, {a[1][0],a[1][1]}, {a[2][0],a[2][1]}};
		
		// int a[][]= {{100,200},{300,400},{500,600}};
		
		// Find size or length of an array: This can be done by using a
		// keyword called length.
		// 
		
	/*	int a[][]= {{100,200},{300,400},{500,600}};
		
		System.out.println(a.length); // length of row --- 3
		System.out.println(a[0].length); */ // length of column -- 2
		
		
		// where a[0]= array[any number of the row] -- it can be a[1], a[2]
		
		// Read single value from an array: This can be done by using index
		// of row and column.
		
	/*	int a[][]= {{100,200},{300,400},{500,600}};
		
		System.out.println(a[0][0]); // first row and first column -- 100
		System.out.println(a[2][1]); */ // second row and first column-- 600
		
		
		//  Read multiple values from an array: We can read multiple values 
		// from an array by using loop statements and index as follows:
		
	/*	int a[][]= {{100,200},{300,400},{500,600}};
		
		for(int r=0; r<3; r++) // r=row, c=column
		{
			for(int c=0; c<2; c++)
			{
				System.out.println(a[r][c]);
			}
		}*/
		         // OR
		
/*	int a[][]= {{100,200},{300,400},{500,600}};
		
		for(int r=0; r<3; r++)
		{
			for(int c=0; c<2; c++)
			{
				System.out.print(a[r][c]+" ");
			}
			
			System.out.println();
		}*/
		
// You can read multiple values if you don't know the length or size of the
// arrays by using a.length
		
	/*	int a[][]= {{100,200},{300,400},{500,600}};
		
		for(int r=0; r<a.length; r++)
		{
			for(int c=0; c<a[r].length; c++)
			{
				System.out.println(a[r][c]);
			}
			
		}*/
		
		// We can read values/data from an array using enhanced for loop
		
	/*	int a[][]= {{100,200},{300,400},{500,600}};
		
		for(int x[]:a)
		{
			for(int y:x)
			{
				System.out.println(y);
			}
		}*/
		
		
		
	
		
	}

}
