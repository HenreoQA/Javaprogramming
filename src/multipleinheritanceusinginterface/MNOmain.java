package multipleinheritanceusinginterface;

//Adding another parent class MNO to a child class MNOmain and then access the interface


public class MNOmain extends MNO implements ABC,XYZ  // All abstract methods must be implemented by using class
		{
			public void m2() 
			{
				System.out.println("This is m2 from XYZ");
				
			}


			public void m1() 
			{
			 System.out.println("This is m1 from ABC");
			}

			
			public static void main(String[] args) 
			{
				MNOmain d=new MNOmain(); // Creating object of the implemented class to access the interface
				
				System.out.println(v); // calling static variable directly
				System.out.println(u); // calling static variable directly
				
				d.m1(); // calling the method
				d.m2(); // calling the method
				d.m3(); // calling the method
				
			}

			
		}
		

	


