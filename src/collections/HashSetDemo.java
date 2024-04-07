package collections;

import java.util.HashSet;
import java.util.Set;

/* CONDITIONS THAT WILL DETERMINE WHEN TO USE ARRAYLIST:
	
 1. Heterogeneous data is allowed
 2. Insertion order is not preserved (index is not supported)
 3. Duplicate data is not allowed
 4. Multiple nulls is not allowed */

public class HashSetDemo {

	public static void main(String[] args) {
		
		// To declare HashSet: It can be declared using different format
		
		HashSet myset=new HashSet(); // declaration of HashSet. myset=object variable. This format allows us to store heterogeneous data
		
	//	Set Myset=new HashSet(); // HashSet can be declared in this format using Set as interface
		
	//	HashSet <Boolean>HashSet=new HashSet<Boolean>(); // for homogeneous data to be stored, HashSet is declared in this format. <Boolean> = wrapper variable
			
			
 // To add data into the HashSet
		
		myset.add(200);
		myset.add(30.5);
		myset.add(false);
		myset.add("hello");
		myset.add(null);
		
		
		System.out.println(myset); // [null, false, 200, hello, 30.5] - random data
		
//	 	To find the size of HashSet
		
		myset.size();
		
		System.out.println(myset.size());
		
// To remove some data from the HashSet: We have to pass the value, not index because HashSet does not support index
		
		myset.remove(false);
		
		System.out.println(myset.remove(false)); // After removing data - [null, 200, hello, 30.5]
		
// To insert new data in the middle of the Set: This operation is not possible because insertion order is not preserved(index not allowed)
		
// To get a specific value/data from the Set: This operation is not possible because index is not supported
		
// To read all the data from the HashSet using looping statement (enhanced for loop)
		
		for(Object y:myset)
		{
			System.out.println(y);
		}
		
// To clear the whole data from the Hashset		
		
	myset.clear();
	
	System.out.println(myset);
	

    
    
		
		
		
		

	}

}
