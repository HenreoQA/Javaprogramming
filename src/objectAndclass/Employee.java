package objectAndclass;

/* CLASS: Is a logical entity or a blueprint. It does not occupy any space in the memory. It is a collection of variables and methods.
 We define the variables and create a method in the class but we don't assign values/data in the class to avoid every object having the same data.
 The data is assigned in the main method.
 Object of the class is created only in the main method because the execution is performed in the main method.
 
  HOW TO CREATE CLASS IN JAVA - Class syntax:

  class class_name
{
variables
methods
}
     
     where class = class keyword*/

public class Employee {

	 int eid; // variable - It is not advisable to assign data to the variable in the class to avoid every object to have the same data.
	 String ename; // class variable/variable
	 String job; // variable
	 int esalary; // variable
	
	void display() // method - the purpose of method is to print the variables.
	{
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(job);
		System.out.println(esalary);
	}
	
 
	// To create objects for Employee (as class name) and assign data to the object
	
	// class_name variable = new class_name( );
	
	
	 public static void main(String[] args) 
    {
		Employee emp1 = new Employee(); // creating object where class name = Employee
		emp1.eid=101; // assigning data to the object
		emp1.ename="John"; // assigning data
		emp1.job="Engineer"; // assigning data
		emp1.esalary=50000; // assigning data
		
		emp1.display(); // call the display method to print/execute the data of the variable/object
        
		
		Employee emp2=new Employee();
		emp2.eid=102;
		emp2.ename="Scot";
		emp2.job="Manager";
		emp2.esalary=70000;
		
		emp2.display();
	}
	 
	
	
	
	
	
	
	
	
	

}
