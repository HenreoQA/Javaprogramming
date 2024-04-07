 package objectAndclass;

public class Student 
{
	int sid;
	String sname;
	char grade;
	
	void show()  // The method can have any name (void display, void show etc)
	{
	  System.out.println(sid+"  "+sname+"  "+grade); // To print the variable on the same line
	}
	
	void setData(int id, String name, char g) // If you are assigning parameter in the method. The method can have any name (void setvalues, void show, void display etc)
	{
		sid=id;
		sname=name;
		grade=g;
	}
	
 	Student(int id, String name, char g) // If you are using constructor
	{
		sid=id;
		sname=name;
		grade=g;
	}

	
	
	
	
		
	

}
