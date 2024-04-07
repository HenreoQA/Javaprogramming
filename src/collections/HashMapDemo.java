package collections;

import java.util.HashMap;
import java.util.Map;

/*  CONDITIONS THAT WILL DETERMINE WHEN TO USE HASHMAP:
	
1. when data can be stored in the form of key, value pairs. eg, student ID, student name (student ID = key, student name = value).
 
2. Key is unique(no duplicate) but values can be duplicated.

3. Insertion order is not preserved (index is not allowed). */



public class HashMapDemo {

	public static void main(String[] args) {
		
	// To declare HashMap	
		
	//	HashMap hm=new HashMap(); // declaration of HashMap. hm=object variable. This format allows us to store heterogeneous data
	//	Map m=new HashMap(); // HashMap can be declared in this format using Map as interface
		
		HashMap <Integer,String>HM=new HashMap<Integer,String>(); // for heterogeneous data(integer as key and String as value) to be stored,
		
// To add data pairs into HashMap using put
		
		HM.put(101, "John");
		HM.put(102, "James");
		HM.put(103, "John");
		HM.put(104, "Mary");
		HM.put(105, "Scott");
		
		System.out.println(HM); // {101=John, 102=James, 103=John, 104=Mary, 105=Scott}
		
// To find the the number of pairs or size HashMap
		
		HM.size();
		
		System.out.println(HM.size()); // 4
		
// 	To remove the data pairs from HashMap by passing the key: We can't remove only the key or values, both of them will be removed together
	
		HM.remove(102);
		System.out.println(HM); // After removing pairs-{101=John, 103=John, 104=Mary, 105=Scott}

// To get a specific value from the HashMap by passing key
		
		HM.get(104);
		
		System.out.println(HM.get(104)); // Mary
		
// To print or read only the keys from the HashMap
		
		HM.keySet();
		
		System.out.println(HM.keySet()); // [101, 103, 104, 105]
		
// To print or read only the values from the HashMap using enhanced for loop
		
		for(Object k:HM.keySet())
		{
			System.out.println(HM.get(k)); 
		}
		
// To print or read both the keys and the values at the same time
		
		for(Object k:HM.keySet())
		{
			System.out.println(k+"  "+HM.get(k));
		}
    		

// To clear or remove the whole data pairs from HashMap
		
		HM.clear();
		System.out.println(HM);
		
		
		
		
		
	}

}
