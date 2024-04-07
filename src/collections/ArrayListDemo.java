package collections;

import java.util.ArrayList;
import java.util.List;

/* CONDITIONS THAT WILL DETERMINE WHEN TO USE ARRAYLIST:

1. when there are heterogeneous data
2. when insertion order is preserved/sequential (index concept allowed)
3. when there are duplicate data
4. when there are multiple nulls */


public class ArrayListDemo {

	public static void main(String[] args) {
		
		// To declare arrayList: It can be declared using different format
		
		ArrayList mylist=new ArrayList(); // declaration of ArrayList. mylist=object variable. This format allows us to store heterogeneous data
	
		//	List Mylist=new ArrayList(); // ArrayList can be declared in this format using List as interface
	
		//	ArrayList <Integer>myList=new ArrayList<Integer>(); // for homogeneous data to be stored, arrayList is declared in this format. <Integer> = wrapper variable
		
		
// To add data into the ArrayList: This will add data at the end of the list
		
		mylist.add(100);
		mylist.add(20.5);
		mylist.add("welcome");
		mylist.add(true);
		mylist.add(100);
		mylist.add(null);
		mylist.add(null);
		
		System.out.println(mylist); // to print the data or values. 
		                            // [100, 20.5, welcome, true, 100, null, null] - insertion order is preserved
	
		
// 	To find the size of ArrayList
		
		mylist.size();
		
		System.out.println(mylist.size()); // to print the size of ArrayList. size is 7
		
// To remove some data from ArrayList
		
		mylist.remove(3); // To remove the forth value using index 3(by passing the index value)
		
		System.out.println(mylist); // after removing the data - [100, 20.5, welcome, 100, null, null]
	
		
// 		To insert a new value/data in the middle of the list using index concept: This will insert data in the middle of the list
		
		mylist.add(2,"Java"); // to insert new data by passing the index and the new data
		
		System.out.println(mylist); // After insertion, the values are [100, 20.5, Java, welcome, 100, null, null]
		

//  To capture or get a specific value in the list using index concept
		
		mylist.get(3); // 3 is index
		System.out.println(mylist.get(3)); // welcome
		
// To read all the data from the arraylist using looping statement (enhanced for loop)
		
		for(Object x:mylist)
		{
			System.out.println(x);
		}
		
// To clear or remove the whole data from arraylist at once
		
		mylist.clear();
		
		System.out.println(mylist); // After removing the whole data from the list
		
	
		
		
		
		
		
		
		
		
		 
		
	}

}
