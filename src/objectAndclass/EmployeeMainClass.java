package objectAndclass;

// To create objects for Employee (as class name) and assign data to the object using object
// variable approach

	// class_name variable = new class_name( );

public class EmployeeMainClass {

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
